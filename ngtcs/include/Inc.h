/* 
**
**  Module Name : 
**    	Inc.h
**
**  Purpose :
**		Public header file for INC package.
**
**  Description :
**		Used to declare exported data, functions and definitions for the
**		INC package.
**
**  Authors :
**		PXH : Pete Hall (TTL)
**
**  History: 
**    	$Log: Inc.h,v $
**    	Revision 0.6  2002/03/25 09:52:25  mjf
**    	Addition of OID for application version.
**
**    	Revision 0.5  2001/10/02 16:11:19  mjf
**    	Change of server shutdown OID name.
**
**    	Revision 0.4  2001/03/16 16:57:25  mkv
**    	Sends position to Sif.
**
**    	Revision 0.3  2001/01/31 09:27:16  mkv
**    	Updated define to E_INC_REG_SERVER_NAME
**
**    	Revision 0.2  2000/10/13 11:06:01  pxh
**    	Added Oid list, plus extra error numbers.
**
**    	Revision 0.1  2000/10/10 10:01:07  pxh
**    	Initial revision.
**
**
**
*/


#ifndef _INC_H_DEFINED
#define _INC_H_DEFINED

/* Code for coping with decl'n/def'n/init'n of global variables */

#ifdef M_INC_MAIN
   #define E_INC_EXTERN
   #define E_INC_INIT(Initialisation) = Initialisation
#else
   #define E_INC_EXTERN extern
   #define E_INC_INIT(Initaliasation)
#endif

/* Required include files */

#include "TtlSystem.h"       /* For Status_t definition                       */

#define E_INC_CMD_DATA_LEN    (32)

#define E_INC_REG_SERVER_NAME "E_TTL_AMN_IncServer"
#define E_INC_SERVER_PROC     "IncServer"
#define E_INC_SERVER_PATH     "//1/opt/ttl/bin/IncServer"
#define E_INC_SERVER_PRI      (10)

typedef enum eIncCommand_t
{
    E_INC_POS = 0,
    E_INC_POS_STATUS,
    E_INC_POS_TIME_STATUS,
    E_INC_STROBE,
    E_INC_SLEEP,
    E_INC_WAKEUP,
    E_INC_SET_ORIGIN,
    E_INC_SET_ABS_POS,
    E_INC_READ_SERIAL_NO,
    E_INC_CHECK_SERIAL_NO,
    E_INC_FAIL_SERIAL_NO,
    E_INC_GET_ADDRESS,
    E_INC_ASSIGN_ADDRESS,
    E_INC_READ_FACTORY_INFO,
    E_INC_READ_RESOLUTION,
    E_INC_CHANGE_RESOLUTION,
    E_INC_READ_MODE,
    E_INC_CHANGE_MODE,
    E_INC_CHANGE_POWERUP,
    E_INC_RESET,
    E_INC_CHANGE_BAUD,
    E_INC_LOOPBACK,
    E_INC_DEAD_ENDCLIENT,
    E_INC_SERVER_SHUTDOWN
} eIncCommand_t;

/*
** The following #defines define the first and last of the inclinometer
** serial commands. These are used to check command validity in IncCommand
** and as such should probably be defined in IncCommand.h. However, it is
** more sensible to maintain them here, next to the definitions upon which
** they are based - IT IS VITAL THAT THESE ARE UPDATED if changes are made
** to eIncCommand_t.
*/

#define E_INC_MIN_SER_CMD   E_INC_POS
#define E_INC_MAX_SER_CMD   E_INC_LOOPBACK

typedef struct
{
    eIncCommand_t  Command;
    Status_t       Status;
	Int32_t        DataLen;
} eIncHeader_t;

typedef struct
{
    eIncHeader_t  Header;
    char          Data[E_INC_CMD_DATA_LEN];
} eIncMessage_t;

#define E_INC_MIN_CMD_LEN    sizeof(eIncHeader_t)
#define E_INC_MAX_CMD_LEN    sizeof(eIncMessage_t)

typedef struct
{
   Int32_t Value;    /* Actual value of the global task data   */
   Int32_t Units;    /* The units of that value (for decoding) */
} eIncTaskData_t;

enum eIncStatus
{
    E_INC_GEN_ERROR = STATUS_START(INC),
    E_INC_INIT_FAIL,
    E_INC_SHUTDOWN_ERROR,
    E_INC_INVALID_DATA_LEN,
    E_INC_INVALID_COMMAND,
    E_INC_REPLY_FAIL,
    E_INC_SERVER_STARTUP_FAIL,
    E_INC_SERVER_SHUTDOWN_FAIL,
    E_INC_SERVER_NOT_RUNNING,
    E_INC_SERVER_SEND_FAIL,
    E_INC_SERIAL_TX_FAIL,
    E_INC_SERIAL_TXLEN_ERR,
    E_INC_SERIAL_RX_FAIL,
    E_INC_SERIAL_CHK_ERR,
    E_INC_ENCODER_NOT_FOUND,
    E_INC_TIMER_SETUP_ERR,
    E_INC_TIMER_CLOSE_ERR
};

/*
** Package OID list.
*/

typedef enum eIncDataId_e
{
    D_INC_DATAID_BOL = OID_START(INC),  /* Offset OIDs by package Id     */
    D_INC_PROC_STATE,                   /* IncServer process state       */
    D_INC_APP_VERSION, 
    D_INC_SHUTDOWN,                     /* IncServer shutdown flag       */
    D_INC_POSITION,                     /* Inclinometer position reading */
    D_INC_DEV_STATUS,                   /* Inclinometer reported status  */
    D_INC_DATAID_EOL                    /* End-of-list marker            */
} eIncDataId_t;

/*
** External function prototypes
*/

#endif

/*
** EOF
*/
