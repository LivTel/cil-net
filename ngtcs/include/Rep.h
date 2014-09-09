/* 
**
**  Module Name : 
**     Rep.h
**
**  Purpose :
**     Public header file for AZR package.
**
**  Description :
**     Used to declare exported data, functions and definitions for the
**     REP package.
**
**  Authors :
**     PXH : Pete Hall (TTL)
**
**  History: 
**     $Log: Rep.h,v $
**     Revision 0.19  2002/01/21 15:18:58  mjf
**     Submit flush period into the SDB using one datum, in milli-seconds.
**
**     Revision 0.18  2001/11/02 12:08:17  mjf
**     Implementation of delayed shutdown. Note that this must not be so long
**     such that Rep gets killed when its parent terminates before it has
**     terminated elegantly.
**
**     Revision 0.17  2001/11/02 11:19:37  mjf
**     Removal of TABs in history.
**
**     Revision 0.16  2001/11/02 11:11:41  mjf
**     Reversal of changes made since last baseline, to retrieve a saved
**     measurement from the SDB. It is not intended to implement this
**     functionality in RepServer, as the only (simple) way to achieve this
**     would be to leave the client process blocked whilst the measurement is
**     retrieved by the SDB. This could take several seconds if the measurement
**     is only on disk. The changes remain as part of the version history for
**     these files, in case there is a change of mind in the future.
**
**     Revision 0.13  2001/10/12 09:34:48  mjf
**     Funtionality added to bundle SDB submissions together into a single
**     CIL message. A flush period (default 1 sec) may be altered on the
**     command-line, and submissions are flushed to the SDB on every flush
**     period, and when the buffer becomes full (currently 256 OIDs deep).
**     Characterisation of the flushing is also logged into the SDB.
**
**     Revision 0.12  2001/09/14 15:36:47  mjf
**     Changes due to definitions in general file Acn.h
**
**     Revision 0.11  2001/09/12 16:11:16  mjf
**     The Primary Mirror sub-system now to have an independent RepServer,
**     rather than sharing the Auxiliary Mechanisms'. There are now two calls
**     to queue data using RepServer, one target-independent which simply
**     looks for a RepServer on the current node, and a target-specific
**     variant which specifies the RepServer for use (this must be used on the
**     AMN node). Also, the shutdown of RepServer now includes a target.
**
**     Revision 0.10  2001/05/18 10:06:21  mjf
**     Submits version correctly into the SDB.
**
**     Revision 0.9  2001/04/04 09:02:16  mjf
**     Error reporting enhanced.
**
**     Revision 0.8  2001/03/23 10:47:02  mjf
**     RepServer changed to be node-independent (subject to CIL map). However,
**     RepServer now will not auto-start on first use by client - it must now
**     be started before any clients.
**
**     Revision 0.7  2000/10/17 15:05:08  pxh
**     Now checks Node Id to enable client/server to automatically run on any control node.
**
**     Revision 0.6  2000/10/06 13:09:58  pxh
**     Modified process name definition and added path definition to enable use of "spawnl" in RepClient.c.
**
**     Revision 0.4  2000/09/28 08:51:04  pxh
**     Added required .h files for compilation with other packages
**     Changed process & queue names to comply with proposed standard
**     Changed Package Id from AZR to REP
**     Tidied up eRepServerQueueData() function prototype
**
**     Revision 0.3  2000/09/22 14:05:40  pxh
**     Now works running on Node 1 - does not work across nodes.
**
**     Revision 0.2  2000/09/14 15:16:23  pxh
**     Added new definitions.
**
**     Revision 0.1  2000/09/11 14:31:08  pxh
**     Initial Version.
**
**
*/


#ifndef _REP_H_DEFINED
#define _REP_H_DEFINED

/* Code for coping with decl'n/def'n/init'n of global variables */

#ifdef M_REP_MAIN
   #define E_REP_EXTERN
   #define E_REP_INIT(Initialisation) = Initialisation
#else
   #define E_REP_EXTERN extern
   #define E_REP_INIT(Initaliasation)
#endif

/* Required include files */

#include "TtlSystem.h"
#include "Cil.h"
#include <mqueue.h>
#include <sys/proxy.h>

#define E_REP_CMD_DATA_LEN    (32)

#define E_REP_MIN_CMD_LEN     (sizeof (Status_t)  +    \ 
                               sizeof (Int32_t)   +    \ 
                               sizeof (Int32_t))
#define E_REP_MAX_CMD_LEN     (E_REP_CMD_DATA_LEN +    \ 
                               sizeof (Status_t)  +    \ 
                               sizeof (Int32_t)   +    \ 
                               sizeof (Int32_t))

#define E_REP_SERVER_PRI          (10)
#define E_REP_MAX_SDB_DATUM_ITEMS (1)

typedef enum eRepCommand_t
{
    E_REP_REQUEST_QUEUE = 0,
    E_REP_SERVER_SHUTDOWN
} eRepCommand_t;

typedef struct
{
    eRepCommand_t  Command;
    Status_t       Status;
    Int32_t        DataLen;
    char           Data[E_REP_CMD_DATA_LEN];
} eRepMessage_t;

typedef struct
{
    char           *NamePtr;
    mqd_t           Mqd;
    struct mq_attr  Attr;
    pid_t           LocProxy;
    pid_t           RemProxy;
    struct sigevent Event;
} eRepQueue_t;

typedef struct
{
   Int32_t Value;    /* Actual value of the global task data      */
   Int32_t Units;    /* The units of that value (for decoding)    */
} eRepTaskData_t;

/* RepServer OIDs */

typedef enum eRepDataId_e
{

   D_REP_DATAID_BOL = OID_START( REP ),/* Beginning of data list */

   D_REP_PROC_STATE,                   /* Process state (unsubmitted) */
   D_REP_APP_VERSION,                  /* Software version */
   D_REP_FLUSH_PERIOD,                 /* Flush period, in milli-seconds */
   D_REP_LAST_FLUSH_OIDS,              /* Number of OIDs in last flush period */
   D_REP_LAST_FLUSH_SUBMITS,           /* Submits in last flush period */

   D_REP_DATAID_EOL                    /* End of data list */

} eRepDataId_t;


enum eRepStatus
{
    E_REP_GEN_ERROR = STATUS_START(REP),
    E_REP_INIT_FAIL,
    E_REP_QUEUE_RX_ERROR,
    E_REP_SDB_TX_ERROR,
    E_REP_SDB_RX_ERROR,
    E_REP_SDB_RX_TIMEOUT,
    E_REP_SDB_ACK_ERROR,
    E_REP_SHUTDOWN_ERROR,
    E_REP_INVALID_DATA_LEN,
    E_REP_INVALID_COMMAND,
    E_REP_REPLY_FAIL,
    E_REP_SERVER_STARTUP_FAIL,
    E_REP_SERVER_SHUTDOWN_FAIL,
    E_REP_SERVER_NOT_RUNNING,
    E_REP_SERVER_SEND_FAIL,
    E_REP_REQUEST_QUEUE_FAIL,
    E_REP_INVALID_QUEUE_NAME,
    E_REP_QUEUE_OPEN_FAIL,
    E_REP_SERVER_MQOPEN_FAIL,
    E_REP_SERVER_MQSEND_FAIL,
    E_REP_NODE_ID_ERR,
    E_REP_INVALID_NODE_ID,
    E_REP_NODE_UNRESOLVED,
    E_REP_RX_MSG_ERR,
    E_REP_PROXY_ERR,
    E_REP_ERR_SUBMIT_LIST,
    E_REP_ERR_CLEAR_LIST,
    E_REP_TIMER_SETUP_ERR,

    E_REP_STATUS_EOL
};


/*
** External function prototypes for RepClient.c
*/

extern Status_t eRepServerShutdown  (Int32_t    Target);
extern Status_t eRepServerQueueData (Int32_t    Oid,
                                     Int32_t    UnitType,
                                     eTtlTime_t Timestamp,
                                     Int32_t    Data);
extern Status_t eRepTargetQueueData (Int32_t    Target,
                                     Int32_t    Oid,
                                     Int32_t    UnitType,
                                     eTtlTime_t Timestamp,
                                     Int32_t    Data);

#endif