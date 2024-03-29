/********************************************************************************
** Module Name:
**    Iet.h
**
** Purpose:
**    Public header file for IUCAA Enclosure Task.
**
** Description:
**    This code has been written to conform to "TTL Coding Standard" v1.0.
**
** Traceability to Software Design:
**    IET design and implementation document v0.01 05-Jan-2001.
**
** Author(s):
**    Lorna J. Slater (ljs)
**    Martyn J. Ford (mjf)
**
** Copyright (c) Telescope Technologies Limited (TTL), 2001
**
** Version:
**    $Id: Iet.h,v 0.9 2002/01/09 15:24:09 mjf Exp $
**
** History:
**    $Log: Iet.h,v $
**    Revision 0.9  2002/01/09 15:24:09  mjf
**    Change of naming of PLC low battery and processor fault alarm.
**
**    Revision 0.8  2002/01/03 10:47:26  mjf
**    Revert back to starting IET OID table at zero (likewise with states).
**    Note that if the OID enumeration is kept the same as in the EPT, it
**    enables the use of HTI label lookups for OIDs.
**
**    Revision 0.7  2001/12/19 11:19:55  mjf
**    Start the state and data ID enumerations by offsetting with respect
**    to the package ID - reduces confusion with EPT.
**
**    Revision 0.6  2001/12/19 09:52:04  mjf
**    IET changed to be a complete package in its own right. It now has its
**    own datum list, but still uses the EPT CIL ID. The first user datum in
**    the list will contain the package ID, so other processes may determine
**    which enclosure interfacing software is relevant.
**
**    Revision 0.5  2001/12/17 17:16:59  mjf
**    The IET public header file no longer a dummy - now independent from EPT.
**
**    Revision 0.4  2001/12/11 11:18:11  mjf
**    No absolute path in inclusion of Ept.h.
**
**    Revision 0.3  2001/05/14 11:38:17  ljs
**    Changed file path to /opt/ttl/include/Ept.h
**
**    Revision 0.2  2001/05/01 09:47:25  ljs
**    Added absolute path for development version of Ept.h
**    to be removed before baselineing.
**
**    Revision 0.1  2001/04/25 15:33:13  ljs
**    Initial creation.
**
**
*******************************************************************************/

#ifndef IET_H_DEFINED
#define IET_H_DEFINED


/*
** Compiler include files
*/


/*
** System include files
*/

#include "TtlSystem.h"
#include "Mcp.h"
#include "Sdb.h"


/*
** Local include files
*/
    

/*
** Macro definitions
*/

/* Size of messages (based on CIL classes) sent when commands received */
#define E_IET_ACT_LEN_DMD    0
#define E_IET_RSP_LEN_DMD    0
#define E_IET_COM_LEN_DMD    sizeof( Int32_t )

/* Number of times to retry interface in event of coms failure. */
#define E_IET_COMS_RETRIES   5



/*
** Type definitions
*/


/* Enumerated list of status and error values */
typedef enum eIetStatus_e
{
   E_IET_GEN_ERR = STATUS_START(IET),  /* Miscellaneous error */
   E_IET_ERR_SETUP,          /* 1 Error performing setup */
   E_IET_ERR_CIL_RX,         /* 2 Unexpected CIL message received */
   E_IET_ERR_SDB_SUBMIT,     /* 3 Error performing SDB submission */
   E_IET_SW_SIMULATE,        /* 4 Using software to simulate encl. operation */
   E_IET_UNKNOWN_SERVICE,    /* 5 Requested service not provided by this task */
   E_IET_SERVICE_NOT_IMPL,   /* 6 Service not implemented in this version */
   E_IET_NOT_IMPLEMENTED,    /* 7 General functionality not implemented */
   E_IET_MSG_LEN_ERR,        /* 8 Incorrect no. bytes in CIL data block */
   E_IET_UNEXPECTED_SIM,     /* 9 Simulate fn. called without simulate selected */
   E_IET_UNEXPECTED_MSG,     /* a Unexpected CIL message received */
   E_IET_INVALID_SHUTTER,    /* b Shutter ID number not recognised */
   E_IET_INVALID_DATUM,      /* c Datum ID out of range */
   E_IET_INVALID_COMMAND,    /* d Command not recognised */
   E_IET_PARSE_ERROR,        /* e Failed to read an ASCII argument token */
   E_IET_PARAM_RANGE_ERR,    /* f Specified parameter outside allowed range */
   E_IET_NO_HEARTBEATS,      /* 10 No heartbeats received recently */
   E_IET_CMD_NOT_PERMITTED,  /* 11 Command not permitted because state not OKAY */
   E_IET_UNKNOWN_DEMAND,     /* 12 Demanded parameter not known */
   E_IET_PARAM_SIZE_ERR,     /* 13 A value to be set is not of a supported size */
   E_IET_NO_TIMED_CMDS,      /* 14 Timed set commands are not supported */
   E_IET_UNKNOWN_OID,        /* 15 Object ID not recognised */
   E_IET_OID_READ_ONLY,      /* 16 Attempt made to change a read-only OID value */
   E_IET_ERR_READ_PKTS,      /* 17 Unable to read no. expected packets to follow */
   E_IET_ERR_READ_LENGTH,    /* 18 Failed to read the expected length of packet */
   E_IET_INVALID_LENGTH,     /* 19 Incorrect length of received packet */
   E_IET_CHKSUM_ERROR,       /* 1a Calculated and reported checksums don't match */
   E_IET_SER_REPORTED_ERROR, /* 1b Error response received from serial device.*/
   E_IET_SER_UNEXPECTED_RSP, /* 1c Response received not for command sent.*/

   E_IET_DMD_PENDING,        /* 1d An operation is already pending */
   E_IET_WRITE_FAILED,       /* 1e Write to PLC failed */
   E_IET_READ_FAILED,        /* 1f Read to PLC failed */
   E_IET_PLC_INVALID,        /* More than one PLC bit is set for the same OID */

   E_IET_CONFIG_FILE_ERROR,  /* 20 Format of the config file is wrong. */
   E_IET_STATE_UNKNOWN,      /* Value not in range for this OID. */

   E_IET_STATUS_EOL          /* 21End of status list marker (do not use) */
} eIetStatus_t;


/* EPT messages - services offered by the IET */
typedef enum eIetService_e
{
   E_IET_HEARTBEAT = E_MCP_HEARTBEAT,  /* Heartbeat command */
   E_IET_SHUTDOWN  = E_MCP_SHUTDOWN,   /* Shutdown command */
   E_IET_SAFESTATE = E_MCP_SAFESTATE,  /* Safestate command */
   E_IET_ACTIVATE  = E_MCP_ACTIVATE,   /* Activate command */

   E_IET_SET_1     = E_MCP_SET_1           /* Set a single control param */

} eIetService_t;


/*
** These are the states that IET datum can be set to (excluding analogue)
** Bit values read from the PLC are converted to one of these states 
*/
typedef enum eIetDataState_e
{
   /*
   ** State used to mark analogue data
   */
   E_IET_ANALOGUE_STATE,/* Analogue, actual value will be submitted to Sdb */ 

   /*
   ** Improper conditions where a state cannot be determined
   */
   E_IET_INVALID_STATE, /* More than 1 state bit was found to be set */
   E_IET_UNKNOWN_STATE, /* No PLC state bits were found to be set */
   E_IET_FAULT_STATE,   /* A fault was detected for this mechanism */

   /*
   ** Proper states - as defined by ICD
   */
   E_IET_OPENING_STATE, /* Opening */
   E_IET_CLOSING_STATE, /* Closing */
   E_IET_MOVING_STATE,  /* Moving  */
   E_IET_STOPPED_STATE, /* Stopped */
   E_IET_HALTED_STATE,  /* Halted */
   E_IET_OPEN_STATE   , /* Open    */
   E_IET_CLOSED_STATE , /* Closed  */

   E_IET_STATE_EOL      /* End of list */

} eIetDataState_t;



/* 
** These are the enumerated values that commands can be set to
*/
typedef enum eIetDmdState_e
{
   E_IET_DMD_DISABLE_STATE = 0,               /* Generic disable      */ 
   E_IET_DMD_ENABLE_STATE  = 1,               /* Generic enable       */
   E_IET_DMD_THIRD_STATE   = 2,               /* Generic third state  */
   E_IET_DMD_FOURTH_STATE  = 3,               /* Generic fourth state */ 
   E_IET_DMD_INVALID_STATE = 4,               /* Generic fourth state */ 

   E_IET_DMD_OPEN_STATE    = E_IET_DMD_ENABLE_STATE,  /* Open */
   E_IET_DMD_CLOSE_STATE   = E_IET_DMD_DISABLE_STATE, /* Close */
   E_IET_DMD_STOP_STATE    = E_IET_DMD_THIRD_STATE,   /* Stop */
   E_IET_DMD_POS_STATE     = E_IET_DMD_FOURTH_STATE,  /* Move to position */

   E_IET_DMD_RESET_STATE   = E_IET_DMD_ENABLE_STATE   /* Reset */
} eIetDmdState_t;



/* 
** Global data for submission to the Status Database (SDB).
**
** Note that this list is in exactly the same order as for the EPT. However, 
** the only reason for this is to allow the use of HTI to convert labels into 
** datum IDs (both the EPT and IET will use the EPT CIL ID). There is no reason
** other than this for the two lists to be identical and for non-implemented 
** data to even exist in this list.
*/
typedef enum eIetDataId_e
{
   D_IET_DATAID_BOL = 0,     /* Begining of data list */

   /*
   ** Process specific data submitted to SDB
   */
   D_IET_PROC_STATE  = D_MCP_PROC_STATE,       /* Process state  */
   D_IET_AUTH_STATE  = D_MCP_AUTH_STATE,       /* Authorisation state */
   D_IET_SYS_REQUEST = D_MCP_SYS_REQUEST,      /* System requests made to MCP*/
   D_IET_APP_VERSION = D_MCP_APP_VERSION,      /* Application version number */

   D_IET_THIS_APPLICATION = D_MCP_FIRST_USER_DATUM, /* Application package ID */
   D_IET_THIS_TELESCOPE  ,                     /* Identity of this telescope */
   D_IET_SW_SIMULATE     ,                     /* Software simulate mode */

   /* Data values retrieved from PLC and submitted to SDB */
   D_IET_AP_STATE        , /* Aperture Mechanism State */
   D_IET_AP_HALTED       , /* Aperture Halted */
   D_IET_AP_FAULT        , /* Aperture Fault */
   D_IET_AP_UNAVAIL      , /* Aperture Not Available */
   D_IET_S1_STATE        , /* Shutter 1 Mechanism State */
   D_IET_S1_HALTED       , /* Shutter 1 Halted */
   D_IET_S1_FAULT        , /* Shutter 1 Fault */
   D_IET_S1_UNAVAIL      , /* Shutter 1 Not Available */
   D_IET_S2_STATE        , /* Shutter 2 Mechanism State */
   D_IET_S2_HALTED       , /* Shutter 2 Halted */
   D_IET_S2_FAULT        , /* Shutter 2 Fault */
   D_IET_S2_UNAVAIL      , /* Shutter 2 Not Available */
   D_IET_S1_POS          , /* Shutter 1 Actual Position */
   D_IET_S2_POS          , /* Shutter 2 Actual Position */
   D_IET_S1_CL_POS       , /* Shutter 1 Closed Limit (decimal value) */
   D_IET_S2_CL_POS       , /* Shutter 2 Closed Limit (decimal value) */
   D_IET_S1_OP_POS       , /* Shutter 1 Open Limit (decimal value) */
   D_IET_S2_OP_POS       , /* Shutter 2 Open Limit (decimal value) */

   /* Liverpool-only and/or generic data */
   D_IET_TOP_LCK         , /* Top Locks State */
   D_IET_TOP_LCK_FAULT   , /* Top Locks Fault */
   D_IET_TOP_LCK_UNAVAIL , /* Top Locks Not Available */
   D_IET_S1_LCK          , /* Shutter 1 Locks State */
   D_IET_S1_LCK_FAULT    , /* Shutter 1 Locks Fault */
   D_IET_S1_LCK_UNAVAIL  , /* Shutter 1 Locks Not Available */
   D_IET_S2_LCK          , /* Shutter 2 Locks State */
   D_IET_S2_LCK_FAULT    , /* Shutter 2 Locks Fault */
   D_IET_S2_LCK_UNAVAIL  , /* Shutter 2 Locks Not Available */
   D_IET_S1_R1           , /* Shutter 1 Ram 1 Misalignment */
   D_IET_S1_R2           , /* Shutter 1 Ram 2 Misalignment */
   D_IET_S2_R3           , /* Shutter 2 Ram 3 Misalignment */
   D_IET_S2_R4           , /* Shutter 2 Ram 4 Misalignment */
   D_IET_HYD_PMP         , /* Hydraulic Pump State */
   D_IET_HYD_PMP_FAULT   , /* Hydraulic Pump Fault */
   D_IET_HYD_PMP_UNAVAIL , /* Hydraulic Pump Not Available */
   D_IET_HYD_PMP_OLT     , /* Hydraulic Pump O/L Tripped */
   D_IET_HYD_PMP_CBT     , /* Hydraulic Pump MCB Tripped */
   D_IET_HTK_LVL         , /* Hydraulic Tank Level State */
   D_IET_HTK_LVL_FAULT   , /* Hydraulic Tank Level Fault */
   D_IET_HTK_LVL_UNAVAIL , /* Hydraulic Tank Level Not Available */
   D_IET_HTK_TEMP        , /* Hydraulic Tank Temperature State */
   D_IET_HTK_TEMP_FAULT  , /* Hydraulic Tank Temperature Fault */
   D_IET_HTK_TEMP_UNAVAIL, /* Hydraulic Tank Temperature Not Available */
   D_IET_SHA_PRES        , /* Shutters Accumulator Pressure State */        
   D_IET_SHA_PRES_FAULT  , /* Shutters Accumulator Pressure Fault */        
   D_IET_SHA_PRES_UNAVAIL, /* Shutters Accumulator Pressure Not Available */
   D_IET_LKA_PRES        , /* Locks Accumulator Pressure State */        
   D_IET_LKA_PRES_FAULT  , /* Locks Accumulator Pressure Fault */        
   D_IET_LKA_PRES_UNAVAIL, /* Locks Accumulator Pressure Not Available */
   D_IET_MSV             , /* Maintenance Safety Valve State */        
   D_IET_MSV_FAULT       , /* Maintenance Safety Valve Fault */        
   D_IET_MSV_UNAVAIL     , /* Maintenance Safety Valve Not Available */
   D_IET_FLT1            , /* Filter 1 Pressure Switch State */        
   D_IET_FLT1_FAULT      , /* Filter 1 Pressure Switch Fault */        
   D_IET_FLT1_UNAVAIL    , /* Filter 1 Pressure Switch Not Available */
   D_IET_FLT2            , /* Filter 2 Pressure Switch State */        
   D_IET_FLT2_FAULT      , /* Filter 2 Pressure Switch Fault */        
   D_IET_FLT2_UNAVAIL    , /* Filter 2 Pressure Switch Not Available */
   D_IET_UPS             , /* Enclosure UPS  */
   D_IET_CLS_ACC_FLT     , /* Fault Closing Enclosure under Accumulator Power */
   D_IET_OHTG            , /* Oil Tank Heating State */
   D_IET_OHTG_FAULT      , /* Oil Tank Heating Fault */
   D_IET_OHTG_UNAVAIL    , /* Oil Tank Heating Not Available */
   D_IET_MCBS            , /* Miniature Circuit Breakers State */
   D_IET_MCBS_FAULT      , /* Miniature Circuit Breakers Fault */
   D_IET_MCBS_UNAVAIL    , /* Miniature Circuit Breakers Not Available */
   D_IET_ESTOP           , /* Enclosure Emergency Stop  */
   D_IET_ACC             , /* Accumulator State */
   D_IET_KEYSW           , /* Local/Remote Selector Switch  */
   D_IET_EPLC            , /* Enclosure PLC State */
   D_IET_PLC_WARN_STATE  , /* PLC in WARN State */
   D_IET_PLC_S2_FLT_STATE,/* PLC in stage 2 fault State */
   D_IET_PLC_S3_FLT_STATE,/* PLC in stage 3 fault State */
   D_IET_PLC_SHUTDOWN    , /* E PLC requests immediate shutdown (not used) */
   D_IET_PLC_WDOG        , /* Enclosure PLC Watchdog Healthy */
   D_IET_MAIN_PWR        , /* Enclosure Main Power Healthy */
   D_IET_R1_SLP          , /* Ram 1 Seal Pressure Switch State */
   D_IET_R1_SLP_FAULT    , /* Ram 1 Seal Pressure Switch Fault */
   D_IET_R1_SLP_UNAVAIL  , /* Ram 1 Seal Pressure Switch Not Available */
   D_IET_R2_SLP          , /* Ram 2 Seal Pressure Switch State */
   D_IET_R2_SLP_FAULT    , /* Ram 2 Seal Pressure Switch Fault */
   D_IET_R2_SLP_UNAVAIL  , /* Ram 2 Seal Pressure Switch Not Available */
   D_IET_R3_SLP          , /* Ram 3 Seal Pressure Switch State */
   D_IET_R3_SLP_FAULT    , /* Ram 3 Seal Pressure Switch Fault */
   D_IET_R3_SLP_UNAVAIL  , /* Ram 3 Seal Pressure Switch Not Available */
   D_IET_R4_SLP          , /* Ram 4 Seal Pressure Switch State */
   D_IET_R4_SLP_FAULT    , /* Ram 4 Seal Pressure Switch Fault */
   D_IET_R4_SLP_UNAVAIL  , /* Ram 4 Seal Pressure Switch Not Available */
   D_IET_QTY_PMP_STRTS   , /* Number of Hydraulic Pump Starts in the Hour */
   D_IET_QTY_PMP_HOURS   , /* Number of Hydraulic Pump Run Hours */
   D_IET_RAM1_PRES       , /* Ram No 1 Pressure (analogue) */
   D_IET_RAM2_PRES       , /* Ram No 2 Pressure (analogue) */
   D_IET_RAM3_PRES       , /* Ram No 3 Pressure (analogue) */
   D_IET_RAM4_PRES       , /* Ram No 4 Pressure (analogue) */
   D_IET_HTK_ACT_TEMP    , /* Hydraulic Tank Temperature (analogue) */
   D_IET_R1_PRES_TL      , /* Ram 1 Pressure Trip Level State */ 
   D_IET_R1_PRES_TL_FAIL , /* Ram 1 Pressure Trip Level Sensor Failed */
   D_IET_R2_PRES_TL      , /* Ram 2 Pressure Trip Level State */ 
   D_IET_R2_PRES_TL_FAIL , /* Ram 2 Pressure Trip Level Sensor Failed */
   D_IET_R3_PRES_TL      , /* Ram 3 Pressure Trip Level State */ 
   D_IET_R3_PRES_TL_FAIL , /* Ram 3 Pressure Trip Level Sensor Failed */
   D_IET_R4_PRES_TL      , /* Ram 4 Pressure Trip Level State */ 
   D_IET_R4_PRES_TL_FAIL , /* Ram 4 Pressure Trip Level Sensor Failed */
   D_IET_PANEL_TEMP     , /* Enclosure Panel Temperature */
   D_IET_MAIN_HYD_PRES  , /* Main Hydraulic Pressure */
   D_IET_S1_R1_ENC      , /* Shutter 1 Ram 1 Encoder Reading */
   D_IET_S1_R2_ENC      , /* Shutter 1 Ram 2 Encoder Reading */
   D_IET_S2_R3_ENC      , /* Shutter 2 Ram 3 Encoder Reading */
   D_IET_S2_R4_ENC      , /* Shutter 2 Ram 4 Encoder Reading */
   D_IET_S1_ENC_MIS     , /* Shutter 1 Encoder Misalignment Value */
   D_IET_S2_ENC_MIS     , /* Shutter 2 Encoder Misalignment Value */
   D_IET_PLC_LOW_BAT    , /* PLC Low Battery Alarm */
   D_IET_PLC_PROC_FAULT , /* PLC Processor Fault Alarm */
   D_IET_PLC_MODE       , /* PLC in Remote Program Mode */
   D_IET_PROG_VERS_MANT , /* Program Version Number (Major Part) */
   D_IET_PROG_VERS_REM  , /* Program Version Number (Minor Part) */

   /* Faulkes-only data */
   D_IET_DC_PMP         , /* Backup DC Pump State */
   D_IET_DC_PMP_FAULT   , /* Backup DC Pump Fault */
   D_IET_DC_PMP_UNAVAIL , /* Backup DC Pump Not Available */
   D_IET_DC_PMP_OLT     , /* Backup DC Pump O/L Tripped */
   D_IET_DC_PMP_CBT     , /* Backup DC Pump MCB Tripped */
   D_IET_FLT_PMP        , /* Off-Line Filter Pump State */
   D_IET_FLT_PMP_FAULT  , /* Off-Line Filter Pump Fault */
   D_IET_FLT_PMP_UNAVAIL, /* Off-Line Filter Pump Not Available */
   D_IET_FLT_PMP_OLT    , /* Off-Line Filter Pump O/L Tripped */
   D_IET_FLT_PMP_CBT    , /* Off-Line Filter Pump MCB Tripped */
   D_IET_DC_PMP_UPS     , /* DC Pump UPS */
   D_IET_PLC_UPS        , /* PLC UPS */
   D_IET_OHTG_1         , /* Oil Tank Heater 1 State */
   D_IET_OHTG_1_FAULT   , /* Oil Tank Heater 1 Fault */
   D_IET_OHTG_1_UNAVAIL , /* Oil Tank Heater 1 Not Available */
   D_IET_OHTG_2         , /* Oil Tank Heater 2 State */
   D_IET_OHTG_2_FAULT   , /* Oil Tank Heater 2 Fault */
   D_IET_OHTG_2_UNAVAIL , /* Oil Tank Heater 2 Not Available */
   D_IET_PSU            , /* Power Supply Units */
   D_IET_QTY_DC_PMP_HR  , /* Backup DC Pump Run Hours */
   D_IET_QTY_FLT_PMP_HR , /* Off-Line Filter Pump Run Hours */

   /* IUCAA-only data */
   D_IET_DOME_STATE     , /* Dome azimuth angle in milli-arc secconds. */
   D_IET_AZM_POS        , /* Dome azimuth angle in milli-arc secconds. */
   D_IET_ALT_POS        , /* Dome altitude angle in milli-arc secconds. */
   D_IET_AZM_LOW_POS    , /* Minimum dome azimuth angle. */
   D_IET_AZM_HIGH_POS   , /* Maximum dome azimuth angle. */
   D_IET_ALT_LOW_POS    , /* Minimum dome altitude angle. */
   D_IET_ALT_HIGH_POS   , /* Maximum dome altitude angle. */
   D_IET_SER_MSG_CODE   , /* Numerical code from serial device. */

   /*
   ** SET_1 Demands that the IET will action and respond to 
   ** These demands will be sumbitted to the SDB as they are made
   */
   D_IET_DMD_AP_STATE   , /* Aperture   */
   D_IET_DMD_S1_STATE   , /* Shutter 1  */
   D_IET_DMD_S2_STATE   , /* Shutter 2  */
   D_IET_DMD_AP_POS     , /* Aperture Required Position Value  */
   D_IET_DMD_S1_POS     , /* Shutter 1 Required Position Value */
   D_IET_DMD_S2_POS     , /* Shutter 2 Required Position Value */
   D_IET_DMD_HALT       , /* Halt Motion */
   D_IET_DMD_STOP       , /* Stop Motion, only accept commands when FALSE. */

   /* Liverpool-only datums */
   D_IET_DMD_ALL_LCK    , /* All Locks  */
   D_IET_DMD_TOP_LCK    , /* Top Locks  */
   D_IET_DMD_S1_LCK     , /* Shutter 1 Locks  */
   D_IET_DMD_S2_LCK     , /* Shutter 2 Locks  */
   D_IET_DMD_OHTG       , /* Switch Oil Tank Heating On/Off */
   D_IET_DMD_HYD        , /* Switch Hydraulic System (Prime) On/Off */
   D_IET_DMD_DCHRG_ACC  , /* Discharge Accumulators */
   D_IET_DMD_FLT        , /* Fault Reset */
   D_IET_DMD_ESTOP      , /* Emergency Stop Reset */
   D_IET_DMD_SAFE       , /* Switch Enclosure PLC into Safe State */

   /* IUCAA only datums. */
   D_IET_DMD_DOME_AZM   , /* Demanded dome azimuth angle in milli-arc secs. */
   D_IET_DMD_DOME_ALT   , /* Demanded dome altitude angle in milli-arc secs. */

   /*
   ** This command is internal to IET process and should not be
   ** requested by any other process
   */
   D_IET_DMD_QRY_STATUS , /* Query Status */


   D_IET_DATAID_EOL      /* End of list marker */
} eIetDataId_t;

#endif

/*******************************************************************************
** End of File Name: Iet.h
*******************************************************************************/

