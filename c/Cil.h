/*
** File Name: CIL.h
**
** Purpose: 
**
** Provides user access to the CIL routines and data structures.
**
** Description:
**
** This file must be included by all processes wishing to use the
** CIL routines for interprocess comms. It provides an abstract interface
** to the underlying communications method and definitions of the data
** items and structures to be used when using the interface.
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

#ifndef CIL_H_DEFINED
#define CIL_H_DEFINED

#include <unistd.h>
#include <stdio.h>

/*
** ICD command ranges. Each ICD has a unique range of commands
** in order that CIL can identify the data structure of the
** attached arguments. This is necessary when passing messages
** across network interfaces so that host / network byte 
** ordering can be resolved.
*/

#define E_CIL_TMI_CMD_START 1000 /* TCS MCS range */
#define E_CIL_EMI_CMD_START 2000 /* ECS MCS range */
#define E_CIL_SMI_CMD_START 3000 /* ECI MCS range */


/* Identification of Tasks and Location of data in Config File */
#define RCSID	0
#define TCSID	1
#define SAMID	2
#define MCBID	3
#define ERHID	4
#define SRHID	5
#define IUMID	6
#define AZIID	7
#define AZDID	8
#define ALTID	9
#define ALDID	10
#define CASID	11
#define CADID	12
#define M01ID	13
#define D01ID	14
#define PMCID	15
#define PMDID	16
#define M02ID	17
#define D02ID	18
#define ENCID	19
#define AGBID	20
#define AGSID	21
#define WMSID	22
#define GPSID	23
#define OILID	24
#define SISID	25

/* CIL Parameters */
#define MAXBUF		400
#define MAXBODY		300
#define MAXDATAGRAM	500
#define NOREPLY		0
#define REPLY		1
#define NOWAIT		0
#define	WAIT		1
#define LOCALISED	0
#define FORWARD		1

/* CIL Actions */
/* Commands */
#define HOME		0 // ABS Home Position
#define MOVE		1 // ABS Goto Position
#define TRACK		2 // RATE of Movement
#define PARK		3 // ABS Goto Park Position
#define STEP		4 // RELATIVE Position
#define DRIVE		5 // RATE of Movement
#define LOCATE		6 // STATE Change
#define STATUS		7 // Read STATE
#define UNUSED		8 
#define ORIGIN		9 // ABS Condition Origin
/* Parameters */
#define UPDATE_ALL		0 // Update all parameters with new values
#define UPDATE_COEFFS	1 // Update PID Coefficients
/* Status Query */
#define READ_ALL		0 // Read all Parameters
#define READ_POSITION	1 // Query Position
#define READ_COEFF		2 // Read PID Coefficients

/* CIL.MAP Parameters */
#define Header	0
#define RecSize 64

/* MQ Parameters */
#define MSG_SIZE	4096

/* IPC - Target Descriptor */

union TARGET {
  pid_t   PID;
  pid_t   VID;
  int     Socket;
};

/* IPC - Target Data */
/* For PostMaster Array */
struct TASKDATA
	{
	int				Ident;
	char			Label[4];
	char			Name[32];
	char			TxType[2];
	union	TARGET	Target;
	char			Env[2];
	char			Node[2];
	int				TxCounter;
	};

/* IPC - Definition of Alert Transaction */
struct ALERT
	{
	int				TaskID;
	char			TimeStamp[9];
	};

/* IPC - Definition of Move Transaction */
struct WORK
	{
	int				Action;
	double			Value;
	char			TimeStamp[9];
	};

/* IPC - Definition of a Track Transaction */
struct COORD
	{
	int				Action;
	double			Ax01Value;
	char			Ax01OpStamp[9];
	double			Ax02Value;
	char			Ax02OpStamp[9];
	double			Ax03Value;
	char			Ax03OpStamp[9];
	char			TimeStamp[9];
	};

/* IPC - Definition of Command Transaction */
struct POSREAD
	{
	int				Action;
	double			Value;
	int				Home_Switch;
	int				Pos_Switch;
	int				Neg_Switch;
	char			TimeStamp[9];
	};

/* IPC - Definition of Parameter Transaction */
struct PARMS
	{
	int				Action;
	  int				Set_Axis; /* Working Axis*/
	int				Min_Voltage;
	int				Max_Voltage;
	int				Jog_Voltage;
	int				Jog_Threshold;
	double			SW_Pos_Set;
	double			SW_Neg_Set;
	};

/* IPC - Definition of Coefficient Transaction */
struct COEFF
	{
	int				Action; 
	  int				Work_Axis; /* Working Axis */
	  int 			nDF_P; /* Proportional Gain */
	  int				nDF_I; /* Integral Gain */
	  int 			nDF_D; /* Derivitive Gain */
	int				nDF_ACCEL_FF; /* Acceleration Feed Forward */
	int				nDF_VEL_FF; /* Velocity Feed Forward */
	int				nDF_I_LIMIT; /* Integration Summing Limit */
	int				nDF_OFFSET; /* Voltage Output Offset */
	int				nDF_DAC_LIMIT; /* Voltage Output Limit */
	int 			nDF_SHIFT; /* 2^(n) Divisor to change Scale Factor */
	int				nDF_FRICT_FF; /* Friction Feed Forward */
	};

/* IPC - Definition of Body */
union BODY
	{
	char 			TextString[MAXBODY];
	struct	WORK	Command;
	struct	COORD	Track;
	struct	PARMS	Params;
	struct	POSREAD	AxisPos;
	struct	COEFF	Coeffs;
	struct	ALERT	Renegade;
	};

/* IPC - Definition of Transaction */
struct TRANSACT
	{
	int				Target;
	int				Origin;
	int				UTID;
	char			TType;
	int				PSize;
	int				ChkSum;
	union	BODY	Body;
	};

/* IPC - Definition of Transmission Packet */
union TRANDATA
	{
	char 			TranString[MAXBUF];
	struct TRANSACT	TranData;
	};

/* MQ - Definition of a Log Message */
union LOGMESSAGE
	{
	char			TextString[MSG_SIZE];
	int				LogNumber;
	};
	

/*
** Declarations for externally avalable Functions.
*/

int CIL_Log( int CIL_QID, union LOGMESSAGE *LogMessage, int nPrio );

int CIL_Attach( FILE *CIL_File, struct TASKDATA *WorkData );

int CIL_Setup( FILE *CIL_File, int WorkTask, struct TASKDATA *WorkData );

int CIL_Send( struct TASKDATA *WorkData, union TRANDATA *SendBuf, union TRANDATA *ReplyBuf, int ActionFlag );

int CIL_Receive( struct TASKDATA *WorkData, union TRANDATA *RecvBuf, union TRANDATA *ReplyBuf, int ReplyFlag, int WaitFlag );

int CIL_TimeStamp( const char *cTimeStamp );


#endif /* CIL_H_DEFINED */

/* End of File */


