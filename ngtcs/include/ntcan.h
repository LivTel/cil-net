/* ntcan.h
**
** Copyright 1997 esd - electronic system design GmbH
**
*/

#ifndef _ntcan_h_
#define _ntcan_h_

#include <errno.h>


#ifndef EXPORT
#define EXPORT
#endif

#ifndef CALLTYPE
#define CALLTYPE
#endif


/*------------------ Defines ------------------------------------------------*/

#define NTCAN_20B_BASE 0x20000000

#define NTCAN_EV_BASE  0x40000000
#define NTCAN_EV_USER  0x40000080
#define NTCAN_EV_LAST  0x400000FF

#define NTCAN_EV_CAN_ERROR NTCAN_EV_BASE

/* mode in canOpen() */
#define NTCAN_MODE_OVERLAPPED 0x20000000

/* Queue-Size in canOpen() */
#define NTCAN_MAX_TX_QUEUESIZE 2047
#define NTCAN_MAX_RX_QUEUESIZE 2047

/*------------------- error-codes--------------------------------------------*/
#define NTCAN_SUCCESS                0
#define NTCAN_RX_TIMEOUT             0x00001001
#define NTCAN_TX_TIMEOUT             0x00001002
#define NTCAN_TX_ERROR               0x00001004
#define NTCAN_CONTR_OFF_BUS          0x00001005
#define NTCAN_CONTR_BUSY             0x00001006
#define NTCAN_CONTR_WARN             0x00001007
#define NTCAN_NO_ID_ENABLED          0x00001009
#define NTCAN_ID_ALREADY_ENABLED     0x0000100A
#define NTCAN_ID_NOT_ENABLED         0x0000100B
   
#define NTCAN_INVALID_FIRMWARE       0x0000100D
#define NTCAN_MESSAGE_LOST           0x0000100E
#define NTCAN_INVALID_HARDWARE       0x0000100F

#define NTCAN_PENDING_WRITE          0x00001010
#define NTCAN_PENDING_READ           0x00001011
  
#define NTCAN_INVALID_PARAMETER      EINVAL 
#define NTCAN_INVALID_HANDLE         EINVAL 
#define NTCAN_NET_NOT_FOUND          ENODEV  
#define NTCAN_INSUFFICIENT_RESOURCES ENOMEM



typedef int OVERLAPPED;
typedef int HANDLE;
  
#pragma pack(1)

typedef struct
{
  long          id;             /* can-id                                   */
  unsigned char len;            /* length of message: 0-8                   */
  unsigned char msg_lost;       /* count of lost rx-messages                */
  unsigned char reserved[2];    /* reserved                                 */
  unsigned char data[8];        /* 8 data-bytes                             */
} CMSG;


typedef struct
{
  long          evid;          /* event-id: possible range:EV_BASE...EV_LAST */
  unsigned char len;           /* length of message: 0-8                     */
  unsigned char reserved[3];   /* reserved                                   */
  union
  {
    unsigned char  c[8];
    unsigned short s[4];
    unsigned long  l[2];
  } evdata;
} EVMSG;


typedef struct
{
  unsigned short hardware;
  unsigned short firmware;
  unsigned short driver;
  unsigned short dll;
  unsigned short boardstatus;
  unsigned short features;
  unsigned char  boardid[16];
} CAN_IF_STATUS;

#pragma pack()



#ifdef __cplusplus
extern "C" {
#endif



/*...prototypes..............................................................*/
EXPORT int CALLTYPE canSetBaudrate(HANDLE handle,     /* nt-handle           */
			    unsigned long baud);      /* baudrate            */
/*...........................................................................*/
EXPORT int CALLTYPE canGetBaudrate(HANDLE handle,     /* nt-handle           */
			    unsigned long *baud );    /* baudrate            */
/*...........................................................................*/
EXPORT int CALLTYPE canOpen(             
	        int           net,          /* net number                    */
		unsigned long flags,        /*                               */
                long          txqueuesize,  /* nr of entries in message queue*/
                long          rxqueuesize,  /* nr of entries in message queue*/
                long          txtimeout,    /* tx-timeout in miliseconds     */
                long          rxtimeout,    /* rx-timeout in miliseconds     */
		HANDLE        *handle );    /* out: nt-handle                */
/*...........................................................................*/
EXPORT int   CALLTYPE canClose(	 /* ret NTCAN_OK, if success         */
                HANDLE        handle );  /* handle                           */
/*...........................................................................*/
EXPORT int  CALLTYPE canIdAdd(  /* ret NTCAN_OK, if success         */
                HANDLE        handle,    /* read handle                      */
                long          id  );     /* can identifier                   */
/*...........................................................................*/
EXPORT int    CALLTYPE canIdDelete(    /* ret 0, if success                */
                HANDLE        handle,    /* read handle                      */
                long          id  );     /* can identifier                   */
/*...........................................................................*/
EXPORT int    canGetOverlappedResult(
                HANDLE        handle,    /* handle                           */
		OVERLAPPED    *ovrlppd,  /* overlapped-structure             */
		long          *len,      /* out: cnt of available CMSG-Buffer*/
		int           bWait );   /* FALSE =>do not wait, else wait   */        
/*...........................................................................*/
EXPORT int    CALLTYPE canTake(        /* ret 0, if success                */
	        HANDLE        handle,    /* handle                           */
                CMSG          *cmsg,     /* ptr to data-buffer               */
                long          *len );    /* out: size of CMSG-Buffer         */
                                         /* in:  count of read messages      */
/*...........................................................................*/
EXPORT int    CALLTYPE canRead(        /* ret 0, if success                */
                HANDLE        handle,    /* handle                           */
                CMSG          *cmsg,     /* ptr to data-buffer               */
                long          *len,      /* out: size of CMSG-Buffer         */ 
                                         /* in:  count of read messages      */
                OVERLAPPED    *ovrlppd); /* NULL or overlapped-structure     */
/*...........................................................................*/
EXPORT int    CALLTYPE canSend(        /* ret 0, if success                */
                HANDLE        handle,    /* handle                           */
                CMSG          *cmsg,     /* ptr to data-buffer               */
                long          *len );    /* size of CMSG-Buffer              */ 
/*...........................................................................*/
EXPORT int    CALLTYPE canWrite(       /* ret 0, if success                */
                HANDLE        handle,    /* handle                           */
                CMSG          *cmsg,     /* ptr to data-buffer               */
                long          *len,      /* size of CMSG-Buffer              */ 
                OVERLAPPED    *ovrlppd); /* NULL or overlapped-structure     */
/*...........................................................................*/
EXPORT int    CALLTYPE canReadEvent(
                HANDLE        handle,    /* handle                           */
                EVMSG         *evmsg,    /* ptr to event-msg-buffer          */
                OVERLAPPED    *ovrlppd); /* NULL or overlapped-structure     */
/*...........................................................................*/
EXPORT int    CALLTYPE canSendEvent(
                HANDLE        handle,    /* handle                           */
                EVMSG         *evmsg );  /* ptr to event-msg-buffer          */
/*...........................................................................*/
EXPORT int    CALLTYPE canStatus(
                HANDLE        handle,    /* handle                           */
                CAN_IF_STATUS *cstat );  /* ptr to can-status-buffer         */
                


#ifdef __cplusplus
};
#endif


#endif /* _ntcan_h_ */

