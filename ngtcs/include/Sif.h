/*
**
** Module Name :
**    Sif.h
**
** Purpose :
**    Public header file for the mirror Support Interface.
**
** Description :
**    The Support Interface (SIF) is the software process that performs
**    control and monitoring of the mirror support hardware. 
**
**    Copyright (c) Telescope Technologies Limited (TTL), 2000
**
** Imported Definitions :
**
**
** Exported Definitions :
**
**
** Private Definitions :
**
**
** Authors :
**    MKV : Mark Vernon (TTL)
**    
** Version :
**    $Id: Sif.h,v 0.22 2002/09/23 13:19:43 man Exp $
**
** History :
**    $Log: Sif.h,v $
**    Revision 0.22  2002/09/23 13:19:43  man
**    Included additional OID's for inclinometer
**    calibration and axial gain parameters.
**
**    Revision 0.21  2002/05/09 11:22:37  mjf
**    Updated in accordance with Panel 14 I/O schedule as of 01 May 2002.
**
**    Revision 0.20  2001/10/09 13:31:20  mjf
**    Renaming of HALT_DEMAND to STOP_DEMAND, and SIF_STOPPED to STOPPED.
**
**    Revision 0.19  2001/09/24 12:57:20  mjf
**    Change of line endings to be LF-only. No other changes made.
**
**    Revision 0.18  2001/08/23 13:33:02  mjf
**    Change of SIF state enumeration names for HTI-friendliness.
**
**    Revision 0.17  2001/08/23 13:05:06  mjf
**    Change of state enumeration names for HTI friendliness.
**
**    Revision 0.16  2001/08/22 07:16:49  mjf
**    Addition of OID to set a demanded halt condition, and OID to report if
**    movement is currently stopped.
**
**    Revision 0.15  2001/08/20 11:25:44  mjf
**    Change to construction of state enumeration for HTI.
**
**    Revision 0.14  2001/07/11 08:14:01  mjf
**    Tidying up of log messages. Reordering of OID table to match the
**    public header. Remove the watchdog output on a 'disable' command.
**
**    Revision 0.13  2001/07/10 14:35:57  mjf
**    Improvements to public definitions in header file.
**
**    Revision 0.12  2001/06/26 16:14:16  mjf
**    If help requested, terminate. If no I/O cards detected, terminate.
**    Create Sif.log in /opt/ttl/data. Create output file in /opt/ttl/data
**    unless a path is specified.
**
**    Revision 0.11  2001/04/11 13:47:37  mkv
**    Re-Structured Code.
**
**    Revision 0.10  2001/03/28 16:06:59  mkv
**    Part way through a code change to check out a previous baseline.
**
**    Revision 0.9  2001/03/27 09:53:31  mkv
**    North South Lateral Ctrl.
**
**    Revision 0.8  2001/03/14 09:20:05  mkv
**    Controller Design Trials.
**
**    Revision 0.7  2001/03/12 12:21:06  mkv
**    added D_SIF_ALTITUDE.
**
**    Revision 0.6  2001/02/14 09:41:37  mkv
**    Sdb flag and singel submission.
**
**    Revision 0.5  2001/01/29 09:50:20  mkv
**    Axial First Light, Lateral Untested.
**
**    Revision 0.4  2001/01/17 17:28:07  mkv
**    Notch Filter Included.
**
**    Revision 0.3  2001/01/05 10:57:45  mkv
**    Working Test Revision.
**
**    Revision 0.2  2000/12/22 10:41:03  mkv
**    log operating state to text file.
**
**    Revision 0.1  2000/12/08 11:58:04  mkv
**    Initial revision.
**
**
*/
#ifndef SIF_H_DEFINED
#define SIF_H_DEFINED

/*
** System include files
*/

#include "TtlSystem.h"      /* Include the package definitions. */

/*
** Start of Type Definitions
*/

#define E_SIF_REG_SERVER_NAME "E_TTL_AMN_Sif"
#define E_SIF_SERVER_PROC     "Sif"
#define E_SIF_SERVER_PATH     "//1/opt/ttl/bin/Sif"
#define E_SIF_SERVER_PRI      10

/* Enumerate this package's error codes. */
enum eSifStatus_e 
{
    E_SIF_GEN_ERROR = STATUS_START(SIF),
    E_SIF_INIT_FAIL,
    E_SIF_SHUTDOWN_ERROR,
    E_SIF_INVALID_DATA_LEN,
    E_SIF_INVALID_COMMAND,
    E_SIF_REPLY_FAIL,
    E_SIF_SERVER_STARTUP_FAIL,
    E_SIF_SERVER_SHUTDOWN_FAIL,
    E_SIF_SERVER_NOT_RUNNING,
    E_SIF_SERVER_SEND_FAIL,
    E_SIF_SERIAL_TX_FAIL,
    E_SIF_SERIAL_TXLEN_ERR,
    E_SIF_SERIAL_RX_FAIL,
    E_SIF_SERIAL_CHK_ERR,
    E_SIF_TIMER_SETUP_ERR,
    E_SIF_TIMER_ATTACH_ERR,
    E_SIF_TIMER_CREATE_ERR,
    E_SIF_TIMER_UNDERFLOW_ERR,
    E_SIF_TIMER_OVERFLOW_ERR,
    E_SIF_TIMER_CONFIG_ERR,
    E_SIF_TIMER_CLOSE_ERR,
    E_SIF_SDB_UPDATE_FAIL,
    E_SIF_DEAD_ENDCLIENT,
    E_SIF_MESSAGE_NOT_RECOGNISED,
    E_SIF_UNABLE_TO_INIT_IO_CARD,
    E_SIF_OID_TABLE_INIT_FAILURE,
    E_SIF_CARD_NOT_INITIALISED,
    E_SIF_INVALID_CONTROL_MODE,
    E_SIF_INAVALID_SUPPORT_MECHANISM,
    E_SIF_MIRROR_NOT_AT_ZENITH,
    E_SIF_INVALID_INCLINOMETER,
    E_SIF_CLU_AMPLITUDE_ERR,
    E_SIF_UNABLE_TO_TOGGLE_WATCHDOG_OUTPUT,
    E_SIF_VALVE_FBK_ERROR,
    E_SIF_INVALID_OPERATION_ENABLE_STATE,
    E_SIF_INVALID_PROC_STATE,
    E_SIF_AIR_PRESSURE_NOT_PRESENT,
    E_SIF_SERVO_VALVE_POWER_NOT_PRESENT,
    E_SIF_ALREADY_PRELOADED_LATERAL,
    E_SIF_FAILED_TO_READ_CONFIG_FILE,
    E_SIF_FAILED_TO_SET_OID_NAME_TO_VALUE,

    E_SIF_STATUS_EOL,                  /* End Of List               */
    E_SIF_STATUS_MAX = INT_MAX         /* enum forced to be 4 bytes */
};


/* Enumerate this package's operating states. */
typedef enum eSifOpStates_e 
{
    E_SIF_SIF_UNINITIALISED = 0,
    E_SIF_SIF_INITIALISE,
    E_SIF_SIF_IDLE,
    E_SIF_SIF_PRELOAD,
    E_SIF_SIF_CENTRE,
    E_SIF_SIF_OPERATE,
    E_SIF_SIF_UNLOAD,
    E_SIF_SIF_TERMINATE,

    E_SIF_SIF_OP_STATE_EOL
} eSifOpStates_t;

/* Enumerate the OID's owned by this package. */
typedef enum esifDataId_e
{
   D_SIF_DATAID_BOL = OID_START(SIF),  /* Offset the OID's by the package ID. */   

   /* Generic Oid's */
   D_SIF_PROC_STATE,                   /* The SIF process state. */    
   D_SIF_APP_VERSION,                  /* Baseline Revision */   
   D_SIF_SHUTDOWN,                     /* Server shutdown command flag. */         
   D_SIF_STATE,                        /* Operating State */
   D_SIF_ENABLE,                       /* Enable / Disable Operation */                    
   D_SIF_ALTITUDE,                     /* Ain  14 Altitude angle in tenths of a degree */
   D_SIF_NORTH_SOUTH_LATITUDE,         /* North South Vector derived from Radial definers */
   D_SIF_EAST_WEST_LATITUDE,           /* East West Vector derived from Radial definers */

   /* Application Specific Oid's */
   D_SIF_REF_V_MONITOR,                /* Ain  00 6.2V Reference Vlotage Monitor */ 
   D_SIF_RED_AXIAL_LOAD,               /* Ain  01 Red Axial Load Cell  */                  
   D_SIF_YEL_AXIAL_LOAD,               /* Ain  02 Yellow Axial Load Cell  */               
   D_SIF_BLU_AXIAL_LOAD,               /* Ain  03 Blue Axial Load Cell  */                
   D_SIF_RED_RADIAL_LOAD,              /* Ain  04 Red Radial Load Cell  */                 
   D_SIF_YEL_RADIAL_LOAD,              /* Ain  05 Yellow Radial Load Cell  */              
   D_SIF_BLU_RADIAL_LOAD,              /* Ain  06 Blue Radial Load Cell  */                
   D_SIF_RED_AXIAL_VALVE_FBK,          /* Ain  07 Red Axial Servo Feedback */                
   D_SIF_YEL_AXIAL_VALVE_FBK,          /* Ain  08 Yellow Axial Servo Feedback */                
   D_SIF_BLU_AXIAL_VALVE_FBK,          /* Ain  09 Blue Axial Servo Feedback */                
   D_SIF_LAT_LOAD_VALVE_FBK,           /* Ain  10 Lateral Load Servo Feedback */                
   D_SIF_LAT_PRELOAD_VALVE_FBK,        /* Ain  11 Lateral PreLoad Servo Feedback */                
   D_SIF_PLUS_8V_MONITOR,              /* Ain  15a +8V Load Cell Monitor */                 
   D_SIF_MINUS_8V_MONITOR,             /* Ain  15b -8V Load Cell Monitor */                 
   D_SIF_REF_VOLTAGE,                  /* Aout 00 6.2V Load Cell Reference Vlotage */     
   D_SIF_RED_AXIAL_VALVE_DRIVE,        /* Aout 01 Red Axial Servo Input Signal */            
   D_SIF_YEL_AXIAL_VALVE_DRIVE,        /* Aout 02 Yellow Axial Servo Input Signal */            
   D_SIF_BLU_AXIAL_VALVE_DRIVE,        /* Aout 03 Blue Axial Servo Input Signal */            
   D_SIF_LAT_LOAD_VALVE_DRIVE,         /* Aout 04 Lateral Load Servo Input Signal */           
   D_SIF_LAT_PRELOAD_VALVE_DRIVE,      /* Aout 05 Lateral PreLoad Servo Input Signal */            
   D_SIF_AIR_PRESSURE_STATE,           /* Din  00 Mirror Cell air Pressure */              
   D_SIF_SERVO_VALVE_POWER_STATE,      /* Din  01 Flag for Servo Valve Power */            
   D_SIF_WATCHDOG1,                    /* Dout 00 Watchdog 1 for Mirror Node */            
   D_SIF_WATCHDOG2,                    /* Dout 01 Watchdog 2 for Mirror Node */            

   D_SIF_STOP_DEMAND,                  /* Write TRUE to stop supporting of mirror */
   D_SIF_STOPPED,                      /* Read TRUE if mirror supporting stopped */

   D_SIF_LAT_2_LOAD_VALVE_FBK,         /* Ain  12 Lateral 2 Load Servo Feedback */                
   D_SIF_LAT_2_PRELOAD_VALVE_FBK,      /* Ain  13 Lateral 2 PreLoad Servo Feedback */                
   D_SIF_LAT_2_LOAD_VALVE_DRIVE,       /* Aout 06 Lateral Load Servo Input Signal */           
   D_SIF_LAT_2_PRELOAD_VALVE_DRIVE,    /* Aout 07 Lateral PreLoad Servo Input Signal */         
   
                                       /* y = mx + c */
   D_SIF_INCLINOMETER_GRADIENT,        /* Inclinometer calibration coefficient (m) */
   D_SIF_INCLINOMETER_INTERCEPT,       /* Inclinometer calibration coefficient (c) */

   D_SIF_AXIAL_GAIN,                   /* Mirror support axial gain */
   D_SIF_LATERAL_GAIN,                 /* Mirror support lateral gain */

   D_SIF_DATAID_EOL                    /* End of list marker. */                   

} eSifDataId_t;

/* Define Support Mechanisms */
#define ASM      0x0040       /* _MKV these may need adding to system package Id's */
#define LSM      0x0041       /* depending on how code pans out, poss split */

#endif  /* SIF_H_DEFINED */                                                    

/*******************************************************************************
** End of File Name: Sif.h
*******************************************************************************/
