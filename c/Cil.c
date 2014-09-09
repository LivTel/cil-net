/*
** File Name: Cil.c
**
** Purpose: 
**
** Provides abstract user access to Inter Process Communications.
**
** Description:
**
** CIL Library currently contains :-
**
** Function			Description
**
** CIL_Attach()		Initialise Communications Channel
** CIL_Setup()		Load CIL.MAP data and call CIL_Attach
** CIL_Send()		Transmit Inter-Task Messages
** CIL_Receive()	Receive Inter-Task Messages
** CIL_Reply()		Send Reply
** CIL_Log()		Transmit to a Logger Task
** CIL_TimeStamp()	Returns TimeStamp String
**
** CIL Function Return Values :-
**
** Value 	Description
**
** >0		Return Value associated with execution
**  0		Correct Execution
** -1		Failure of primary functionality
** -2		Attempt to connect Channel to redundant Task
** -3		No Local Settings. Required for Channel Construction
** -4		Not possible to reattach 							- SAM Alerted
** -5		Transaction Send and Reply out of Synch
**
** Authors:
**
** APB(TTL), PLW(TTL). 
**
** History:
**
** ??th May 1999: PLW Added 1st pass UDP functionality.
** Needs conditional compilation switches for QNX, UNIX and VMS plus
** restructuring and cleaning up. This version based on ADP's original 
** QNX only version.
*/

/* Standard Headers */

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <time.h>
#include <sys/select.h>

/* IPC Headers */

#include <errno.h>
#ifdef QNX
#include <sys/kernel.h>
#include <sys/psinfo.h>
#include <sys/seginfo.h>
#include <sys/types.h>
#include <sys/proc_msg.h>
#include <sys/name.h>
#include <sys/sched.h>
#include <sys/vc.h>
#endif

/* TCP UDP headers */

#include <sys/socket.h>
#include <netinet/in.h>

/* MQ Headers */

#ifdef QNX
#include <mqueue.h>
#endif
#include <mqueue.h>

/* Toolkit Headers */

/*#include <Ph.h>*/
/*#include <Pt.h>*/
/*#include <Ap.h>*/

/* Local Headers */

/*#include "abimport.h"*/
/*#include "proto.h"*/

/* Custom Headers */

#include "Cil.h"
#include "CilPrivate.h"

/* Data Declaration and Definition */

#define	SEND_DELAY	10
#define	MSG_SIZE	4096	/* For Mqueue */

/****************************************************************************/
/* Start of Function Declarations                                           */
/****************************************************************************/

int CIL_Log( mqd_t CIL_QID, union LOGMESSAGE *LogMessage, int nPrio )

/*

Layered POSIX Function
Sends a message to Message Queue defined by CIL_QID
Calls mq_send()

*/
{
	/* Local Variables */
  int WorkRet = -1; /* Set Failure*/

	if (( WorkRet = mq_send( CIL_QID, &LogMessage, MSG_SIZE, nPrio )) < 0 )
	{
		printf("CIL_Log() Failed to send\n");
        printf("%s\n", LogMessage);
	}

	return WorkRet; /* Function Exit*/
}

/****************************************************************************/

int CIL_Attach( FILE *CIL_File, struct TASKDATA *WorkData )

/*

Opens communication channel to target Task
Calls qnx_vc_attach() for QNX IPC or TCP/IP routine

*/
{
	/*External Variables */
	extern struct TASKDATA THIS;
    extern mqd_t ERH_QID;

	/* Local Variables */
    int WorkRet = -1; /* Set Failure*/
    char ErrMsg[MSG_SIZE] = {'\0'};
    char TextIPaddress[16];
	unsigned long IPaddress;
    int Port;
    struct sockaddr_in SockName;

	if ( THIS.Name[0] != 0 )
	{
        strcpy(ErrMsg, THIS.Name);

		if ( THIS.Env[0] == WorkData->Env[0] )
		{
            /*
            ** The environment is the same, code currently assumes we are
            ** using QNX ipc. How do we configure for POSIX message queues ?
            */

			if ( THIS.Node[0] == WorkData->Node[0])
			/* Currently can't see a difference, but duplicated attach anyway */
			{
			  strcpy( WorkData->TxType, "P" ); /* Peer to Peer*/
				WorkRet = qnx_vc_name_attach( atoi(WorkData->Node), MAXBUF, WorkData->Name );
				WorkData->Target.PID = WorkRet;
			}
			else
			{
				if ( WorkData->TxType[0] != 0 )
				  qnx_vc_detach( WorkData->Target.VID ); /* Close Old Circuit*/
				strcpy( WorkData->TxType, "V" ); /* Virtual Circuit*/
				WorkRet = qnx_vc_name_attach( atoi(WorkData->Node), MAXBUF, WorkData->Name );
				WorkData->Target.VID = WorkRet;
			}
		}
		else
		{
            /*
            ** Target Process is in a different environment so set up
            ** IP comms method.
            */

            fscanf( CIL_File, "%s %s %d", WorkData->TxType, TextIPaddress, &Port);

            if ((IPaddress = inet_addr(TextIPaddress)) == INADDR_NONE)
            {
              strcat(ErrMsg, " - Invalid remote IP address");
              CIL_Log(ERH_QID, &ErrMsg, 8);
              return(-1);
            }

            /* create socket */

            if (WorkData->TxType[0] == 'U')
            {
              WorkData->Target.Socket = socket(AF_INET, SOCK_DGRAM, 0);
            }
            else if (WorkData->TxType[0] == 'T')
            {
#if 0
              WorkData->Target.Socket = socket(AF_INET, SOCK_STREAM, 0);
#else
              /* Currently unsupported option - fail */
              WorkData->Target.Socket = -1;
#endif
            }
            else
            {
              /* Unrecognised option - fail */
              WorkData->Target.Socket = -1;
            }

            if (WorkData->Target.Socket < 0)
            {
              strcat(ErrMsg, " - Failed to open Tx socket");
              CIL_Log(ERH_QID, &ErrMsg, 8);
              return(-1);
            }

            /* Create remote name */

            SockName.sin_family = AF_INET;
            SockName.sin_addr.s_addr = IPaddress;
            SockName.sin_port = htons(Port);

            if (connect(WorkData->Target.Socket, (void*)&SockName, sizeof(SockName)) < 0)
            {
              strcat(ErrMsg, " - Failed to connect socket");
              CIL_Log(ERH_QID, &ErrMsg, 8);
              close(WorkData->Target.Socket);
              WorkData->Target.Socket = -1;
              return(-1);
            }

            /* Success at last */

            return(WorkData->Target.Socket);
		}
	}
	else
	{
		printf("Local settings not yet initialised\n");
		WorkRet = -3; /* Local setting not initialised*/
	}

	return WorkRet; /* Function Exit*/
}

/****************************************************************************/

int CIL_Setup( FILE *CIL_File, int WorkTask, struct TASKDATA *WorkData )

/*

Loads structure with communication setup information, then confirms channel
availability - Calling CIL_Attach()

*/

{
	/* External Variales */
	extern int THISID;

	/* Local Variables */
	int WorkPos, WorkEOF; 
	int WorkRet = -1; 
	char wFlag[2]; 
    char CommsType[2];

	WorkPos = Header + ( RecSize * WorkTask ); 

	fseek( CIL_File, WorkPos, SEEK_SET ); 

	WorkEOF = fscanf( CIL_File, "%s", wFlag ); 

	if (WorkEOF != EOF) 
	{
	    if (wFlag[0] != ';')
		{
			WorkData->Ident = WorkTask; 
			fseek( CIL_File, WorkPos, SEEK_SET ); 
			fscanf( CIL_File, "%s", WorkData->Label); 
			fscanf( CIL_File, "%s", WorkData->Name );
			fscanf( CIL_File, "%s", WorkData->Env );
			fscanf( CIL_File, "%s", WorkData->Node );

			if ( WorkTask != THISID)
            {
                /* Set up connection details to another process */

				WorkRet = CIL_Attach( CIL_File, WorkData );
            }
			else
			{
                /* Set up any local sockets for IP comms */

                fscanf( CIL_File, "%s", CommsType );
                
                switch(CommsType[0])
                {
                  case 'U':
                    /* Set up UDP socket to receive on */
                    if (iCilCreateUDPSocket(CIL_File, WorkData) < 0)
                    {
                      WorkRet = -1; /* Failed to create socket */
                    }
                    else
                    {
                      /*
                      ** In this case TxType is probably the wrong name
                      ** - change it ? 
                      */
                      WorkData->TxType[0] = CommsType[0];
                      WorkRet = 0;
                    }
                    break;
                  case 'T':
                    /*
                    ** Set up TCP socket to accept connections on.
                    ** Needs some work on data structures because there
                    ** could be more than one TCP connection giving more
                    ** than one socketpair which the current structures
                    ** can't store. We also need some way to define who
                    ** we will allow connections from & there's no way to
                    ** do this with the current Cil.map file.
                    */
                    /* Not implemented yet - so ignore */
                    WorkData->TxType[0] = 'X';
                    WorkRet = 0;
                    break;
                  default:
                    /* Ignore all unrecognised options */
                    WorkData->TxType[0] = 'X';
                    WorkRet = 0;
                    break;
                }
			}
		}
		else
        {
			WorkRet = -2; 
        }
	}
	else
    {
		WorkRet = -1; 
    }

    /* Possible Error Trapping Routines for failure to attach */

	return WorkRet; 
}

/****************************************************************************/

int CIL_Send( struct TASKDATA *WorkData, union TRANDATA *SendBuf, union TRANDATA *ReplyBuf, int ActionFlag )

/*

To be included in CIL.c
Sends Message to Target Task, transport subject to Target.TxType

*/

{
	/* External Variables */
	extern int THISID;
	extern int CmdRecord;
	extern mqd_t ERH_QID;
	extern FILE *CIL_File;
	extern struct TASKDATA THIS;

	/* Local Variables */
	int Done = 1, NotDone = 0; 
	int WorkRet = -1; 
	int WorkDone = NotDone; 
	int WorkTry = 0; 
	clock_t SendTime, RecvTime;

	/* MQ Vars */
	unsigned int prio = 8;
	int Result = -1;
	char buf[ MSG_SIZE ];
	struct mq_attr Attr;
	union LOGMESSAGE LogData;
	
	/* Set Attributes for MQ */
	Attr.mq_maxmsg  = 300;
	Attr.mq_msgsize = MSG_SIZE;
	Attr.mq_flags   = 0;	

	if ( ActionFlag != FORWARD )
	{
		SendBuf->TranData.Target = WorkData->Ident;
		SendBuf->TranData.Origin = THIS.Ident;
		SendBuf->TranData.UTID = ++WorkData->TxCounter; 
		SendBuf->TranData.PSize = sizeof(SendBuf->TranData);
		/* Need a Checksum Calculation here */
		SendBuf->TranData.ChkSum = 6;
	}

	if ( (WorkData->TxType[0] == 'P') || (WorkData->TxType[0] == 'V') )
	{
        /* QNX environment */
		do
		{

			if (( WorkRet == 0 ) || ( ++WorkTry <= 3 ))
			{	
				if ( CmdRecord )
					SendTime = clock(); 
				WorkRet = Send( WorkData->Target.PID, SendBuf, ReplyBuf, sizeof( SendBuf->TranData ), sizeof( ReplyBuf->TranData ) );
				if ( CmdRecord )
					RecvTime = clock(); 
			}
			else
				delay( SEND_DELAY ); 

			if (( WorkRet < 0 ) && ( WorkTry > 3))
			{
				/* Log Failure */
			  /*				strcpy( LogData.TextString, "CIL_Send() failed " );*/
			  /*				CIL_Log( ERH_QID, LogData, 8 );  Log Failure - Include Retry Count*/

				WorkRet = CIL_Attach( CIL_File, WorkData );
		
				if ( WorkRet < 0 )
				{
					/* Alert SAM to Failure */
				  /*					CIL_Alert( WorkData->Ident );  Alert SAM*/
					WorkRet = -4; 
					WorkDone = Done; 
				}
				else
				{
					WorkRet = 0; 
					WorkTry = 0; 
				}

			}
			else
			{
				if ( CmdRecord ) 
					CIL_Timer( SendTime, RecvTime );
				WorkDone = Done;
			}

		}
		while (!WorkDone);
		
	}
    else if (WorkData->TxType[0] == 'U')
    {
      /* Send UDP datagram to target process */
#if 1
      if ((WorkRet = send(WorkData->Target.Socket, SendBuf, sizeof(union TRANDATA), 0)) < 0)
#else
      if (WorkRet = write(WorkData->Target.Socket, SendBuf, sizeof(SendBuf)) < 0)
#endif
      {
        strcpy(buf, THIS.Name);
        strcat(buf, " - Failed to send UDP datagram");
        CIL_Log(ERH_QID, &buf, prio);
        WorkRet = -1;
      }
      else
      {
        fprintf(stdout,"UDP bytes sent - %d\n", WorkRet);
        /* 
        ** Fake up reply for end test which isn't relevant for UDP where no reply
        ** is received immediately.
        */
        ReplyBuf->TranData.Target = SendBuf->TranData.Origin;
        ReplyBuf->TranData.Origin = SendBuf->TranData.Target;
        ReplyBuf->TranData.UTID = SendBuf->TranData.UTID;
        WorkRet = 0;
      }
    }

	if ( WorkRet == 0 )
	{
		if ((( ReplyBuf->TranData.UTID != SendBuf->TranData.UTID )) && ( ActionFlag != FORWARD ))
		{	
			/* Log Failure */
			strcpy( buf, THIS.Name );
			strcat( buf, " - Invalid UTID returned" );
			CIL_Log( ERH_QID, &buf, prio );
			WorkRet = -5; 
		}
	}

	return WorkRet; 
}

/****************************************************************************/

int CIL_Reply( int ReplyTask, union TRANDATA *ReplyBuf )

/*

NB - Currently QNX Only!!!

Performs Reply to CIL_Recieve()

*/

{
	int WorkRet = -1; 

	ReplyBuf->TranData.PSize  = sizeof( ReplyBuf->TranData );
	ReplyBuf->TranData.ChkSum = 6;

	WorkRet = Reply( ReplyTask, ReplyBuf, sizeof( ReplyBuf->TranData ));


	/*	if ( WorkRet < 0 )*/
/* This is where the Error Trapping goes */

	return WorkRet; 
}
/****************************************************************************/

int CIL_Receive( struct TASKDATA *WorkData, union TRANDATA *RecvBuf, union TRANDATA *ReplyBuf, int ReplyFlag, int WaitFlag )
{
	int ReplyTask;
	int WorkRet = -1; 
	extern int THISID;
	extern struct TASKDATA THIS;
	extern mqd_t ERH_QID;
	char buf[ MSG_SIZE ];
    struct sockaddr From;
    int FromLen;

    if ((WorkData->TxType[0] == 'P') || (WorkData->TxType[0] == 'V'))
    {
		/* QNX IPC Receive() is for Local and Virtual Circuit */

		if ( WaitFlag == NOWAIT )
			ReplyTask = Creceive( 0, RecvBuf, sizeof(RecvBuf->TranData) );
		else
			ReplyTask = Receive( 0, RecvBuf, sizeof(RecvBuf->TranData) );
		
		if ( ReplyTask >= 0 )
		{
			ReplyBuf->TranData.Origin = RecvBuf->TranData.Target;
			ReplyBuf->TranData.Target = RecvBuf->TranData.Origin;
			ReplyBuf->TranData.UTID   = RecvBuf->TranData.UTID;
			ReplyBuf->TranData.TType  = 'A'; /* Acknowledge */
			strcpy( ReplyBuf->TranData.Body.TextString,"Ack" );
		}

		if (ReplyFlag == REPLY)
			WorkRet = CIL_Reply( ReplyTask, ReplyBuf );
		else
			WorkRet = ReplyTask; 
    }
    else if (WorkData->TxType[0] == 'U')
    {
      /* UDP socket recieve */
      if (WaitFlag == NOWAIT)
      {
        /* Peek at socket to see if its has anything for us */
        if(iCilSocketHasData(WorkData->Target.Socket))
        {
          FromLen = sizeof(RecvBuf);
          if ((WorkRet = recvfrom(WorkData->Target.Socket, RecvBuf, sizeof(union TRANDATA), 0, &From, &FromLen)) < 0)
          {
            /* Failed - generate an error message */
            strcpy(buf, THIS.Name);
            strcat(buf, " - Failed to read UDP datagram");
            CIL_Log(ERH_QID, &buf, 8);
            WorkRet = -1;
          }
        }
        else
        {
          WorkRet = 0;
        }
      }
      else
      {
        FromLen = sizeof(RecvBuf);
        if ((WorkRet = recvfrom(WorkData->Target.Socket, RecvBuf, sizeof(union TRANDATA), 0, &From, &FromLen)) < 0)
        {
          /* Failed - generate an error message */
          strcpy(buf, THIS.Name);
          strcat(buf, " - Failed to read UDP datagram");
          CIL_Log(ERH_QID, &buf, 8);
          WorkRet = -1;
        }
      }
    }

    /*	if ( WorkRet < 0 )*/
/* This is where the Error Trapping goes */

	return WorkRet; 
}

/****************************************************************************/

int CIL_TimeStamp( const char *cTimeStamp )

/*

Function to return a timestamp string in the format YYYYMMDDHHMMSS

Accurate to 1 second

*/


{
	int i,j, nDay = -1;
	int nDDec, nDSig;
	char *str;
	char *cCat;
	char cDay[4], cMon[4], cYr[5];
	char cHr[3], cMin[3], cSec[3];
	time_t PrimeTime;
	char TimeBuf[ 26 ];
	struct timespec now;
	double nMil;

	strcpy( cTimeStamp, "" );
	PrimeTime = time( NULL);

	strcpy( TimeBuf, ctime( &PrimeTime) );

	/* YYYY */
	j = 0;
	for( i =  20; i <  24; )
		cYr[j++] = TimeBuf[i++];
	cYr[j] = '\0';
	strcpy( cTimeStamp, cYr );

	/* MM */
	j = 0;
	for( i =  4; i <  7; )
		cMon[j++] = TimeBuf[i++];
	cMon[j] = '\0';

	if (strcmp( cMon, "Jan" ) == 0)
		strcpy( cMon,  "01" );
	if (strcmp( cMon, "Feb" ) == 0)
		strcpy( cMon,  "02" );
	if (strcmp( cMon, "Mar" ) == 0)
		strcpy( cMon,  "03" );
	if (strcmp( cMon, "Apr" ) == 0)
		strcpy( cMon,  "04" );
	if (strcmp( cMon, "May" ) == 0)
		strcpy( cMon,  "05" );
	if (strcmp( cMon, "Jun" ) == 0)
		strcpy( cMon,  "06" );
	if (strcmp( cMon, "Jul" ) == 0)
		strcpy( cMon,  "07" );
	if (strcmp( cMon, "Aug" ) == 0)
		strcpy( cMon,  "08" );
	if (strcmp( cMon, "Sep" ) == 0)
		strcpy( cMon,  "09" );
	if (strcmp( cMon, "Oct" ) == 0)
		strcpy( cMon,  "10" );
	if (strcmp( cMon, "Nov" ) == 0)
		strcpy( cMon,  "11" );
	if (strcmp( cMon, "Dec" ) == 0)
		strcpy( cMon,  "12" );
	strcat( cTimeStamp, cMon );


	/* DD */
	j = 0;
	for( i =  8; i <  10; )
		cDay[j++] = TimeBuf[i++];
	cDay[j] = '\0';

	strcat( cTimeStamp, cDay );

	/* HH */
	j = 0;
	for( i =  11; i <  13; )
		cHr[j++] = TimeBuf[i++];
	cHr[j] = '\0';
	strcat( cTimeStamp, cHr );

	/* MM */
	j = 0;
	for( i =  14; i <  16; )
		cMin[j++] = TimeBuf[i++];
	cMin[j] = '\0';
	strcat( cTimeStamp, cMin );

	/* SS */
	j = 0;
	for( i =  17; i <  19; )
		cSec[j++] = TimeBuf[i++];
	cSec[j] = '\0';
	strcat( cTimeStamp, cSec );

	return 0;

}

/****************************************************************************/

int CIL_Timer( clock_t SendTime, clock_t RecvTime )

/*

Function to tabulate Transaction Timings

Accurate to 1 Tick ( 1 Tick = 1 Millisecond (Default) );

*/


{
	/* Transaction Timing Varibles - Global */
	extern int CmdRecord;
	extern int TCount;
	extern int TSum;
	extern int TRange1;
	extern int TRange2;
	extern int TRange3;
	extern int TRange4;
	extern int TRange5;
	extern int TRange6;
	extern int TRange7;
	extern int TRange8;

	int TDiff = 0;

	TCount++;
	
	TDiff = RecvTime - SendTime;

	TSum = TSum + TDiff;

	if ( TDiff < 1 )
	{
		TRange1++;
	}
	else
	{
		if ( TDiff < 3 )
		{	
			TRange2++;
		}
		else
		{
			if ( TDiff < 5 )
			{
				TRange3++;
			}
			else
			{
				if ( TDiff < 10 )
				{
					TRange4++;
				}
				else
				{
					if ( TDiff < 15 )
					{
						TRange5++;
					}
					else
					{
						if ( TDiff < 20 )
						{
							TRange6++;
						}
						else
						{
							if ( TDiff < 30 )
							{
								TRange7++;
							}
							else
							{
								TRange8++;
							}
						}
					}
				}
			}
		}
	}

	return 0;

}
/****************************************************************************/

int CIL_Alert( struct TASKDATA *WorkData )

/*

To be included in CIL.c
Sends Message to alert SAM of Failure in a task.

*/

{
	/* External Variables */
	extern int THISID;
	extern mqd_t ERH_QID;
	extern FILE *CIL_File;
	extern struct TASKDATA SAM, THIS;
	extern union TRANDATA SendData, ReplyData;

	/* Local Variables */
	int Done = 1, NotDone = 0; 
	int WorkRet = -1; 
	int WorkDone = NotDone; 
	int WorkTry = 0; 
	clock_t SendTime, RecvTime;

	/* MQ Vars */
	unsigned int prio = 8;
	int Result = -1;
	char buf[ MSG_SIZE ];
	struct mq_attr Attr;
	union LOGMESSAGE LogData;

	/* Set Attributes for MQ */
	Attr.mq_maxmsg  = 300;
	Attr.mq_msgsize = MSG_SIZE;
	Attr.mq_flags   = 0;	

	SendData.TranData.TType = 'B'; /* Bad Connection Transaction */
	SendData.TranData.Body.Renegade.TaskID = WorkData->Ident;
	strcpy( SendData.TranData.Body.Renegade.TimeStamp, "12:34:56" );
	
	WorkRet = CIL_Send( &SAM, &SendData, &ReplyData, LOCALISED ); 
	
	if ( WorkRet <= 0 )
		WorkRet = 0;

	if ( WorkRet == 0 )
	{
		/* Log Failure */
		strcpy( buf, THIS.Name );
		strcat( buf, " - Failed to alert SAM" );
		CIL_Log( ERH_QID, &buf, prio );
		WorkRet = -1; 
	}

	return WorkRet; 
}

/* Internal Functions */

static int iCilCreateUDPSocket(FILE *CilMap, struct TASKDATA *WorkData)
{
  /*
  ** The following externs are in the caller.
  ** Yes I know this is a bad idea but it follows the existing
  ** coding pattern & fixing it requires considerable work to
  ** the CIL interface which will be done when it is re-developed.
  */

  extern struct TASKDATA THIS;
  extern mqd_t ERH_QID;

  struct sockaddr_in SockName;
  int Socket;
  char ErrMsg[MSG_SIZE] = {'\0'};
  char TextIPaddress[16];
  u_long IPaddress;
  u_short Port;

  strcpy(ErrMsg, THIS.Name);

  /* Read in the local IP address and port number */

  fscanf(CilMap, "%s %d", TextIPaddress, &Port);

  if ((IPaddress = inet_addr(TextIPaddress)) == INADDR_NONE)
  {
    strcat(ErrMsg, " - Invalid map file IP address");
    CIL_Log(ERH_QID, &ErrMsg, 8);
    close(Socket);
    return(-1);
  }

  /* Create an unbound socket */

  if((Socket = socket(AF_INET, SOCK_DGRAM, 0)) < 0)
  {
    strcat(ErrMsg, " - Failed to create UDP socket");
    CIL_Log(ERH_QID, &ErrMsg, 8);
    return(-1);
  }

  /* Bind the local address to the socket */

  SockName.sin_family = AF_INET;

#if 0
  SockName.sin_addr.s_addr = htonl(IPaddress);
#else
  /*  inet_aton(TextIPaddress, &SockName.sin_addr);*/
  SockName.sin_addr.s_addr = INADDR_ANY;
#endif

  SockName.sin_port = htons(Port);

  if (bind(Socket, (void*)&SockName, sizeof(SockName)) < 0)
  {
    perror("testing ");
    strcat(ErrMsg, " - Failed to bind local address to UDP socket ");
	strcat(ErrMsg, TextIPaddress);
    CIL_Log(ERH_QID, &ErrMsg, 8);
    close(Socket);
    return(-1);
  }

  /* All done, store socket id in taskdata structure */

  WorkData->Target.Socket = Socket;
  return(0);
}

static Bool_t iCilSocketHasData(int Socket)
{
  fd_set Readfd;
  struct timeval Tval;
  Bool_t RetVal;
  extern struct TASKDATA THIS;
  extern mqd_t ERH_QID;
  char ErrMsg[MSG_SIZE] = {'\0'};

  strcpy(ErrMsg, THIS.Name);

  FD_ZERO(&Readfd);
  FD_SET(Socket, &Readfd);
  Tval.tv_sec = 0;
  Tval.tv_usec = 0;

  switch (select(Socket + 1, &Readfd, NULL, NULL, &Tval))
  {
    case -1:
      RetVal = FALSE;
      strcat(ErrMsg, " - Select failed for socket");
      CIL_Log(ERH_QID, &ErrMsg, 8);
      break;
    case 0:
      RetVal = FALSE;
      break;
    default:
      /* descriptor has data */
      RetVal = TRUE;
      break;
  }

  return(RetVal);
}
/****************************************************************************/
/* End of Function Declarations                                             */
/****************************************************************************/

