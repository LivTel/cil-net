/********************************************************************************
** Module Name:
**    Spt.h
**
** Purpose:
**    Public header file for Services PLC Task.
**
** Description:
**    This code has been written to conform to "TTL Coding Standard" v1.0.
**
** Traceability to Software Design:
**    SPT design and implementation document v0.01 05-Jan-2001.
**
** Author(s):
**    Martyn J. Ford (mjf)
**    Derek J. McKay (djm)
**    Andrzej S. Piascik (asp)
**
** Copyright (c) Telescope Technologies Limited (TTL), 2000
**
** Version:
**    $Id: Spt.h,v 0.21 2002/09/12 15:16:43 mjf Exp $
**
** History:
**    $Log: Spt.h,v $
**    Revision 0.21  2002/09/12 15:16:43  mjf
**    Correction to some datum names.
**
**    Revision 0.20  2002/09/12 14:54:22  mjf
**    Addition of general device type for alarm detection.
**
**    Revision 0.19  2002/08/13 17:00:26  mjf
**    Correction to PLC safe and activate demands.
**
**    Revision 0.18  2002/08/13 13:08:31  mjf
**    Addition of type for actuators.
**
**    Revision 0.17  2002/08/13 08:07:53  mjf
**    Make bit fields unsigned integers rather than signed.
**
**    Revision 0.16  2002/08/12 17:46:12  mjf
**    Implementation of lookup tables to export text to display.
**
**    Revision 0.15  2002/08/06 18:37:39  mjf
**    Initial overhaul in line with Services PLC ICD v3.0.
**
**    Revision 0.14  2002/01/24 10:34:26  mjf
**    Addition of error on SDB submission.
**
**    Revision 0.13  2002/01/10 09:08:40  mjf
**    Change to handling of PLC low battery and processor state.
**
**    Revision 0.12  2002/01/09 09:50:21  mjf
**    Change driven by Services PLC ICD v2.8.
**
**    Revision 0.11  2002/01/07 17:17:00  mjf
**    Extensive changes driven by the recent changes to the EPT (sister) code.
**    Changes to datum ID list : 'this application' and 'simulate' added, and
**    the demands reordered to be after the status data. Capability for
**    software simulation of Services PLC added. Improved handling of PLC
**    status data obtained. Datum IDs in the configuration file no longer
**    require the 'D_SPT_' prefix. SPT process states implemented as macros.
**    Obtain status data from PLC on each incoming heartbeat. OID table now
**    contains an 'error' state (if unable to read from PLC), and a 'default'
**    state (if no bit is set in the PLC) for state type data. Fix to
**    error response messages implemented. Use the definitions for telescopes
**    in 'TtlSystem.h'.
**
**    Revision 0.10  2001/06/22 13:30:09  ljs
**    Added error code for immediate shutdown condition.
**
**    Revision 0.9  2001/06/20 13:14:13  ljs
**    Added UPS OID.
**
**    Revision 0.8  2001/06/20 08:18:05  ljs
**    Removed homed commands, added a few missing OIDs.
**
**    Revision 0.7  2001/06/14 10:31:01  ljs
**    Added new error messages.
**
**    Revision 0.6  2001/06/12 15:19:34  ljs
**    Added list of process state priorities for use in
**    process state modelling.
**
**    Revision 0.5  2001/06/11 12:45:59  ljs
**    Added DatumIds per MCS/SPLC?ICD v 2.6.
**
**    Revision 0.4  2001/06/08 11:31:56  ljs
**    Updated to resemble EPT, all changes implemented but not
**    yet tested. Implemented UNSUPPORTED_UNITS, tidied code,
**    process SAFE and ACTIVATE correctly add config file handling
**    and new Df1Write function.
**
**    Revision 0.3  2001/02/12 09:16:43  asp
**    Demands now submitted to SDB
**
**    Revision 0.2  2001/01/10 13:42:11  asp
**    Read/Write failures added. CMD changed to DMD. Typo's corrected.
**
**    Revision 0.1  2001/01/05 15:07:05  asp
**    Initial Version
**
**
*******************************************************************************/


#ifndef SPT_H_DEFINED
#define SPT_H_DEFINED


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

/* This definition declares the device text name look-up table :-             */
/*  #define E_SPT_DEVICE_TEXT_DECLARE                                         */
/* This definition declares the device text name look-up table as 'extern' :- */
/*  #define E_SPT_DEVICE_TEXT_EXTERN                                          */

/* Size of messages (based on CIL classes) sent when commands received */

#define E_SPT_ACT_LEN_DMD    0
#define E_SPT_RSP_LEN_DMD    0
#define E_SPT_COM_LEN_DMD    sizeof( Int32_t )

/* Number of times to retry interface in event of coms failure. */

#define E_SPT_COMS_RETRIES   5

/* Bounds for indexing into text look-up tables. */

#define E_SPT_TEXT_ROWS      16
#define E_SPT_TEXT_COLS      4

/* Length of string for state name text. */

#define E_SPT_TEXT_LEN       32


/*
** Type definitions
*/

/* Enumeration for the methods of displaying device text */

typedef enum eSptTextIndex_e
{
   E_SPT_INDEX_BOL,          /* Beginning-of-list */

   E_SPT_INDEX_TEXT_VALUE,   /* Index using text and value reported */
   E_SPT_INDEX_TEXT_BIT,     /* Index using text and bit number */
   E_SPT_INDEX_BIT_VALUE,    /* Index using bit and value reported */
   E_SPT_INDEX_VALUE_BIT,    /* Index using value and bit number */
   E_SPT_INDEX_VALUE_TEXT,   /* Index using value and text */

   E_SPT_INDEX_EOL           /* End-of-list */
} eSptTextIndex_t;


/* Type for general device - for alarm warning status only */

typedef struct
{
   unsigned _ReservedA       : 12;
   unsigned Warning          : 1;
   unsigned Stage2Alarm      : 1;
   unsigned Stage3Alarm      : 1;
   unsigned Stage4Alarm      : 1;
} eSptDeviceGeneral_t;

/* Type for 2-state device */

typedef struct
{
   unsigned DeviceStatus     : 1;
   unsigned _ReservedA       : 1;
   unsigned Masked           : 1;
   unsigned _ReservedB       : 1;
   unsigned DisplayText      : 4;
   unsigned _ReservedC       : 3;
   unsigned DisplaySense     : 1;
   unsigned Warning          : 1;
   unsigned Stage2Alarm      : 1;
   unsigned Stage3Alarm      : 1;
   unsigned Stage4Alarm      : 1;
} eSptDevice2State_t;

/* Type for 4-state device */

typedef struct
{
   unsigned DeviceStatus     : 2;
   unsigned Masked           : 1;
   unsigned _ReservedA       : 1;
   unsigned DisplayText      : 4;
   unsigned _ReservedB       : 3;
   unsigned DisplaySense     : 1;
   unsigned Warning          : 1;
   unsigned Stage2Alarm      : 1;
   unsigned Stage3Alarm      : 1;
   unsigned Stage4Alarm      : 1;
} eSptDevice4State_t;       

/* Type for limit device */

typedef struct
{
   unsigned L3A              : 1;
   unsigned L2A              : 1;
   unsigned L2B              : 1;
   unsigned L3B              : 1;
   unsigned L3AMasked        : 1;
   unsigned L2AMasked        : 1;
   unsigned L2BMasked        : 1;
   unsigned L3BMasked        : 1;
   unsigned DisplayText      : 2;
   unsigned _ReservedA       : 2;
   unsigned Warning          : 1;
   unsigned Stage2Alarm      : 1;
   unsigned Stage3Alarm      : 1;
   unsigned Stage4Alarm      : 1;
} eSptDeviceLimit_t;

/* Type for sensor device */
                          
typedef struct            
{                         
   unsigned LowLow           : 1;
   unsigned Low              : 1;
   unsigned High             : 1;
   unsigned HighHigh         : 1;
   unsigned LowLowMasked     : 1;
   unsigned LowMasked        : 1;
   unsigned HighMasked       : 1;
   unsigned HighHighMasked   : 1;
   unsigned _ReservedA       : 3;
   unsigned Validity         : 1;
   unsigned Warning          : 1;
   unsigned Stage2Alarm      : 1;
   unsigned Stage3Alarm      : 1;
   unsigned Stage4Alarm      : 1;
} eSptDeviceSensor_t;

/* Type for motor device */

typedef struct
{
   unsigned Running          : 1;
   unsigned Tripped          : 1;
   unsigned Fault            : 1;
   unsigned Reversed         : 1;
   unsigned Interlocked      : 1;
   unsigned _ReservedA       : 5;
   unsigned Masked           : 1;
   unsigned Validity         : 1;
   unsigned Warning          : 1;
   unsigned Stage2Alarm      : 1;
   unsigned Stage3Alarm      : 1;
   unsigned Stage4Alarm      : 1;
} eSptDeviceMotor_t;      

/* Type for actuator device */

typedef struct
{
   unsigned Opened           : 1;
   unsigned Closed           : 1;
   unsigned Transit          : 1;
   unsigned Tripped          : 1;
   unsigned Fault            : 1;
   unsigned Interlocked      : 1;
   unsigned _ReservedA       : 4;
   unsigned Masked           : 1;
   unsigned Validity         : 1;
   unsigned Warning          : 1;
   unsigned Stage2Alarm      : 1;
   unsigned Stage3Alarm      : 1;
   unsigned Stage4Alarm      : 1;
} eSptDeviceActuator_t;      

/* Type for PLC status */

typedef struct
{
   unsigned ProcessorMode    : 5;
   unsigned ForcesEnabled    : 1;
   unsigned ForcesPresent    : 1;
   unsigned _ReservedA       : 6;
   unsigned Fault            : 1;
   unsigned ProgAccessDenied : 1;
   unsigned _ReservedB       : 1;
} eSptDevicePLCStatus_t;

/* Type for defining display text for device types */

typedef struct
{
   eSptTextIndex_t TextIndex;
   char     DeviceText[ E_SPT_TEXT_ROWS ][ E_SPT_TEXT_COLS ][ E_SPT_TEXT_LEN ];
} eSptDeviceText_t;



/*
** Variables Declarations
*/

/* Text for displaying Services PLC states - optionally included */

#ifdef E_SPT_DEVICE_TEXT_DECLARE

eSptDeviceText_t eSptDeviceText[ E_SDB_PLC_EOL_UNITS - E_SDB_PLC_BOL_UNITS ] =
{ /* BOL */
  { E_SPT_INDEX_BOL,
    { { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               }
    }
  },
  /* Type 1 - 2-state device */
  { E_SPT_INDEX_TEXT_VALUE,
    { { "Safe"          , "Active"        , ""              , ""               },
      { "False"         , "True"          , ""              , ""               },
      { "Not OK"        , "OK"            , ""              , ""               },
      { "Off"           , "On"            , ""              , ""               },
      { "Stopped"       , "Running"       , ""              , ""               },
      { "Closed"        , "Open"          , ""              , ""               },
      { "Fault"         , "Healthy"       , ""              , ""               },
      { "Standby"       , "Duty"          , ""              , ""               },
      { "Assist"        , "Duty"          , ""              , ""               },
      { "Manual"        , "Auto"          , ""              , ""               },
      { "Local"         , "Remote"        , ""              , ""               },
      { "Inavlid"       , "Valid"         , ""              , ""               },
      { "Normal"        , "Out-of-range"  , ""              , ""               },
      { "Normal"        , "Override"      , ""              , ""               },
      { "Normal"        , "Alarm"         , ""              , ""               },
      { "Clear"         , "Blocked"       , ""              , ""               }
    }
  },
  /* Type 2 - 4-state device */
  { E_SPT_INDEX_TEXT_VALUE,
    { { "Off"           , "On"            , "Healthy"       , "Fault"          },
      { "Stopped"       , "Running"       , "Healthy"       , "Fault"          },
      { "Closed"        , "Opened"        , "Transit"       , "Fault"          },
      { "Closed"        , "Opened"        , "Transit"       , "Override"       },
      { "Standby"       , "Duty"          , "Off"           , "Invalid"        },
      { "Duty 1"        , "Duty 2"        , "Off"           , "Invalid"        },
      { "Duty 1"        , "Duty 2"        , "Duty 3"        , "Invalid"        },
      { "Assist"        , "Duty"          , "Off"           , "Invalid"        },
      { "Assist"        , "Duty 1"        , "Duty 2"        , "Invalid"        },
      { "Manual"        , "Auto"          , "Off"           , "Invalid"        },
      { "Local"         , "Remote"        , "Off"           , "Invalid"        },
      { "Normal"        , "Override"      , "Healthy"       , "Fault"          },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               }
    }
  },
  /* Type 3 - Limit device */
  { E_SPT_INDEX_TEXT_BIT,
    { { "Clockwise L3"     , "Clockwise L2"     , "Anti-clockwise L2", "Anti-clockwise L3" },
      { "Low L3"           , "Low L2"           , "High L2"          , "High L3"           },
      { "Under-travel L3"  , "Under-travel L2"  , "Over-travel L2"   , "Over-travel L3"    },
      { "Zenith L3"        , "Zenith L2"        , "Horizon L2"       , "Horizon L3"        },
      { ""                 , ""                 , ""                 , ""                  },
      { ""                 , ""                 , ""                 , ""                  },
      { ""                 , ""                 , ""                 , ""                  },
      { ""                 , ""                 , ""                 , ""                  },
      { ""                 , ""                 , ""                 , ""                  },
      { ""                 , ""                 , ""                 , ""                  },
      { ""                 , ""                 , ""                 , ""                  },
      { ""                 , ""                 , ""                 , ""                  },
      { ""                 , ""                 , ""                 , ""                  },
      { ""                 , ""                 , ""                 , ""                  },
      { ""                 , ""                 , ""                 , ""                  },
      { ""                 , ""                 , ""                 , ""                  }
    }
  },
  /* Type 4 - Sensor */
  { E_SPT_INDEX_BIT_VALUE,
    { { "Normal"        , "Low-low"       , ""              , ""               },
      { "Normal"        , "Low"           , ""              , ""               },
      { "Normal"        , "High"          , ""              , ""               },
      { "Normal"        , "High-high"     , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               }
    }
  },
  /* Type 5 - Motor */
  { E_SPT_INDEX_BIT_VALUE,
    { { "Stopped"       , "Running"       , ""              , ""               },
      { "Healthy"       , "Tripped"       , ""              , ""               },
      { "Normal"        , "Fault"         , ""              , ""               },
      { "Forward"       , "Reverse"       , ""              , ""               },
      { "Normal"        , "Interlocked"   , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               }
    }
  },
  /* Type 6 - Actuator */
  { E_SPT_INDEX_BIT_VALUE,
    { { "Not opened"    , "Opened"        , ""              , ""               },
      { "Not closed"    , "Closed"        , ""              , ""               },
      { "Not in-transit", "In-transit"    , ""              , ""               },
      { "Healthy"       , "Tripped"       , ""              , ""               },
      { "Normal"        , "Fault"         , ""              , ""               },
      { "Normal"        , "Interlocked"   , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               }
    }
  },
  /* Type 7 - PLC Status */
  { E_SPT_INDEX_BOL,
    { { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               },
      { ""              , ""              , ""              , ""               }
    }
  },
  /* Type 8 - PLC Version */
  {  E_SPT_INDEX_BOL,
     { { ""              , ""              , ""              , ""               },
       { ""              , ""              , ""              , ""               },
       { ""              , ""              , ""              , ""               },
       { ""              , ""              , ""              , ""               },
       { ""              , ""              , ""              , ""               },
       { ""              , ""              , ""              , ""               },
       { ""              , ""              , ""              , ""               },
       { ""              , ""              , ""              , ""               },
       { ""              , ""              , ""              , ""               },
       { ""              , ""              , ""              , ""               },
       { ""              , ""              , ""              , ""               },
       { ""              , ""              , ""              , ""               },
       { ""              , ""              , ""              , ""               },
       { ""              , ""              , ""              , ""               },
       { ""              , ""              , ""              , ""               },
       { ""              , ""              , ""              , ""               }
    }
  }
};

#endif

#ifdef E_SPT_DEVICE_TEXT_EXTERN

extern eSptDeviceText_t eSptDeviceText[ E_SDB_PLC_EOL_UNITS - E_SDB_PLC_BOL_UNITS ];

#endif


/* Enumerated list of status and error values */
typedef enum eSptStatus_e
{
   E_SPT_GEN_ERR = STATUS_START(SPT),  /* Miscellaneous error */

   E_SPT_ERR_SETUP,          /* Error performing setup */
   E_SPT_UNKNOWN_SERVICE,    /* Requested service not provided by this task */
   E_SPT_SERVICE_NOT_IMPL,   /* Service not implemented in this version */
   E_SPT_NOT_IMPLEMENTED,    /* General functionality not implemented */
   E_SPT_MSG_LEN_ERR,        /* Incorrect no. bytes in CIL data block */
   E_SPT_UNEXPECTED_MSG,     /* Unexpected CIL message received */
   E_SPT_PARAM_RANGE_ERR,    /* Specified parameter outside allowed range */
   E_SPT_NO_HEARTBEATS,      /* No heartbeats received recently */
   E_SPT_DMD_NOT_PERMITTED,  /* Command not permitted because state not OKAY */
   E_SPT_PARAM_SIZE_ERR,     /* A value to be set is not of a supported size */
   E_SPT_NO_TIMED_DMDS,      /* Timed set commands are not supported */
   E_SPT_UNKNOWN_OID,        /* Object ID not recognised */
   E_SPT_DMD_PENDING,        /* An operation is already pending */
   E_SPT_WRITE_FAILED,       /* Write to PLC failed */
   E_SPT_READ_FAILED,        /* Read to PLC failed */
   E_SPT_PLC_INVALID,        /* More than one bit set in PLC invalid state. */
   E_SPT_CONFIG_FILE_ERROR,  /* Error found in Config file format. */
   E_SPT_INVALID_DATUM,      /* Datum is not in rage of eSptDataId_t. */
   E_SPT_NO_TIMED_CMDS,      /* Set 1 commands must have 0 timestamps. */
   E_SPT_UNKNOWN_DEMAND,     /* Received Demand Oid is unknown/invalid. */
   E_SPT_PARSE_ERROR,        /* Parsing of string failed; incorrect format. */
   E_SPT_UNKNOWN_STATE,      /* Value not in range for this OID. */
   E_SPT_IMMED_SDOWN,        /* Immediate shutdown requested, HW problem. */
   E_SPT_SW_SIMULATE,        /* Using software to simulate PLC operation */
   E_SPT_UNEXPECTED_SIM,     /* Simulate fn. called without simulate selected */
   E_SPT_ERR_SDB_SUBMIT,     /* Error performing SDB submission */

   E_SPT_STATUS_EOL          /* End of status list marker (do not use) */
} eSptStatus_t;


/* 
** These are the enumerated values that commands can be set to
** For the SPT these are bit values and are Clear (Disabled) or Set (Enabled)
*/
typedef enum eSptDmdState_e
{
   E_SPT_DISABLE          = 0,              /* Generic disable */ 
   E_SPT_ENABLE           = 1,              /* Generic enable  */
   E_SPT_DMD_ANALOG       = 3,              /* Invalid demand state  */
   E_SPT_DMD_STOP         = 4,              /* Invalid demand state  */
   E_SPT_DMD_STS_INVALID  = 5,              /* Invalid demand state  */

   E_SPT_DMD_STS_ACTD    = E_SPT_DISABLE,   /* Activated  */
   E_SPT_DMD_STS_SAFE    = E_SPT_ENABLE,    /* Safe state */

   E_SPT_DMD_STS_ON      = E_SPT_ENABLE,    /* On */
   E_SPT_DMD_STS_OFF     = E_SPT_DISABLE,   /* Off */

   E_SPT_DMD_STS_START   = E_SPT_ENABLE,    /* Start */
   E_SPT_DMD_STS_STOP    = E_SPT_DISABLE,   /* Stop */

   E_SPT_DMD_STS_OPN     = E_SPT_ENABLE,    /* Open */
   E_SPT_DMD_STS_CLS     = E_SPT_DISABLE,   /* Close */

   E_SPT_DMD_STS_RESET   = E_SPT_ENABLE     /* Reset */
} eSptDmdState_t;

/*
** These are the states that SPT datum can be set to (excluding analogue)
** Bit values read from the PLC are converted to one of these states 
*/
typedef enum eSptDataState_e
{
   /*
   ** State used to mark analogue data
   */
   E_SPT_STS_ANALOGUE,  /* Analogue - actual value will be submitted to Sdb  */ 

   /*
   ** Improper conditions where a state cannot be determined
   */
   E_SPT_STS_UNKNOWN,   /* No PLC state bits were found to be set */
   E_SPT_STS_AMBIGUOUS, /* More than 1 state bit was found to be set */

   /* 2-state devices. */
   E_SPT_STS_SAFE = 0,  /* Safe State */
   E_SPT_STS_ACTD = 1,  /* Activated */
   E_SPT_STS_OFF  = 0,  /* Off */
   E_SPT_STS_ON   = 1,  /* On */
   E_SPT_STS_LOC  = 0,  /* Local */
   E_SPT_STS_REM  = 1,  /* Remote */

   /* 4-state devices, actuators. */
   E_SPT_STS_CLS  = 0,  /* Closed */
   E_SPT_STS_OPN  = 1 , /* Open */
   E_SPT_STS_TRN  = 2 , /* Transit */
   E_SPT_STS_FLT  = 3 , /* Fault */

   E_SPT_STS_EOL

} eSptDataState_t;


/* SPT messages - services offered by the SPT */
typedef enum eSptService_e
{
   E_SPT_HEARTBEAT = E_MCP_HEARTBEAT,  /* Heartbeat command */
   E_SPT_SHUTDOWN  = E_MCP_SHUTDOWN,   /* Shutdown command */
   E_SPT_SAFESTATE = E_MCP_SAFESTATE,  /* Safestate command */
   E_SPT_ACTIVATE  = E_MCP_ACTIVATE,   /* Activate command */

   E_SPT_SET_1     = E_MCP_SET_1       /* Set a single control param */

} eSptService_t;



/* Global data for submission to the Status Database (SDB) */
typedef enum eSptDataId_e
{
   D_SPT_DATAID_BOL = 0,     /* Begining of data list */

   D_SPT_PROC_STATE          /* Process state datum */
      = D_MCP_PROC_STATE,
   D_SPT_AUTH_STATE          /* Requested/granted authorisation state */
      = D_MCP_AUTH_STATE,
   D_SPT_SYS_REQUEST         /* System requests made to MCP */
      = D_MCP_SYS_REQUEST,
   D_SPT_APP_VERSION         /* Application version number */
      = D_MCP_APP_VERSION,

   D_SPT_THIS_APPLICATION    /* Application package ID */
      = D_MCP_FIRST_USER_DATUM, 
   D_SPT_THIS_TELESCOPE   ,  /* Identity of this telescope */
   D_SPT_SW_SIMULATE      ,  /* Software simulate mode */

   /*
   ** SET_1 Demands that the SPT will action and respond to 
   ** These demands will be sumbitted to the SDB as they are made
   */
   D_SPT_DMD_BOL          ,  /* Beginning of demand list */

   D_SPT_DMD_OBS          ,  /* Start/Stop Observing */
   D_SPT_DMD_SAFE         ,  /* Switch Services PLC into Activated/Safe State */
   D_SPT_DMD_HYD_SYS      ,  /* Start/Stop Full Hydraulic System */
   D_SPT_DMD_AZ_HYD       ,  /* Start/Stop Azimuth Hydraulic System */
   D_SPT_DMD_EL_HYD       ,  /* Start/Stop Elevation Hydraulic System */
   D_SPT_DMD_AIR_CMP      ,  /* Air compressor */
   D_SPT_DMD_SW_THTG      ,  /* Switch Trace Heating On/Off */
   D_SPT_DMD_SW_AGD       ,  /* Switch A & G Box Drives Power On/Off */
   D_SPT_DMD_SW_ALL_LTG   ,  /* Switch All Lights On/Off */
   D_SPT_DMD_SW_ENC_LTG   ,  /* Switch Enclosure Lights On/Off */
   D_SPT_DMD_SW_PRM_LTG   ,  /* Switch Pump Room Lights On/Off */
   D_SPT_DMD_SW_WLA_LTG   ,  /* Switch Well Area Lights On/Off */
   D_SPT_DMD_SW_ITR_LTG   ,  /* Switch IT Room Lights On/Off */
   D_SPT_DMD_SW_AMN_PWR   ,  /* Switch Aux Mech Computer Power On/Off */
   D_SPT_DMD_SW_ALL_PWR   ,  /* Switch All Power On/Off */
   D_SPT_DMD_SW_PMC_PWR   ,  /* Switch Primary Mirror Cell Power On/Off */
   D_SPT_DMD_SW_MCO_PWR   ,  /* Switch Mirror Cover Power On/Off */
   D_SPT_DMD_SW_ACC_PWR   ,  /* Switch Autoguider Computer Power On/Off */
   D_SPT_DMD_SW_AZC_PWR   ,  /* Switch Azimuth Computer Power On/Off */
   D_SPT_DMD_SW_ELC_PWR   ,  /* Switch Elevation Computer Power On/Off */
   D_SPT_DMD_SW_CAC_PWR   ,  /* Switch Cassegrain Computer Power On/Off */
   D_SPT_DMD_SW_AZS_PWR   ,  /* Switch Azimuth Switchgear Power On/Off */
   D_SPT_DMD_SW_ELS_PWR   ,  /* Switch Elevation Switchgear Power On/Off */
   D_SPT_DMD_SW_CAS_PWR   ,  /* Switch Cassegrain Switchgear Power On/Off */
   D_SPT_DMD_SW_NDS_PWR   ,  /* Switch Nasmyth Drive On/Off */
   D_SPT_DMD_SW_NWS_PWR   ,  /* Switch Nasmyth Wrap On/Off */
   D_SPT_DMD_SW_BBX_PWR   ,  /* Switch Basebox Power On/Off  */
   D_SPT_DMD_SW_CR1_PWR   ,  /* Switch Cryotiger 1 Power On/Off */
   D_SPT_DMD_SW_AXD_PWR   ,  /* Switch Axis Drives Power On/Off */
   D_SPT_DMD_SW_SVR_PWR   ,  /* Switch Servo Valve Power On/Off */
   D_SPT_DMD_MIR_COV      ,  /* Open Mirror Cover Open/Close */
   D_SPT_DMD_FLT          ,  /* Fault Reset (no disable) */
   D_SPT_DMD_ESTOP        ,  /* Emergency Stop Reset (no disable) */
   D_SPT_DMD_SW_SEC_PWR   ,  /* Switch Secondary Mirror Power On/Off */
   D_SPT_DMD_SW_TMP_PWR   ,  /* Switch Motor Temperature Panel Power On/Off */
   D_SPT_DMD_SW_CR2_PWR   ,  /* Switch Cryotiger 2 Power On/Off */
   D_SPT_DMD_SW_BBL_PWR   ,  /* Switch Basebox Low Voltage Power On/Off */
   D_SPT_DMD_SW_BBF_PWR   ,  /* Switch Amplifier Fans On/Off */
   D_SPT_DMD_SW_BBP_PWR   ,  /* Switch Basebox Pressure Sensors On/Off */

   /*
   ** These commands are internal to SPT process and should not be
   ** requested by any other process
   */
   D_SPT_DMD_QRY_STATUS   ,  /* Query Status */

   D_SPT_DMD_EOL          ,  /* End of demand list */

   /*
   ** Data values submitted to the SDB
   */
   D_SPT_STATUS_BOL       ,  /* Beginning of status list */

   D_SPT_AZM_WD           ,  /* Azimuth Node Watchdog */
   D_SPT_ALT_WD           ,  /* Altitude Node Watchdog */
   D_SPT_CAS_WD           ,  /* Cassegrain Node Watchdog */
   D_SPT_AMN_WD           ,  /* Auxiliary Mechanisms Node Watchdog */
   D_SPT_HYD_F1           ,  /* Hydrostatic Filter No 1 Press Switch */
   D_SPT_HYD_F2           ,  /* Hydrostatic Filter No 2 Press Switch */
   D_SPT_FA               ,  /* Fire Alarm */
   D_SPT_SA               ,  /* Security Alarm */
   D_SPT_DR_ILK           ,  /* Door Interlock Override */
   D_SPT_ITR_OUT_DR       ,  /* IT Room Outer Door  */
   D_SPT_PRM_OUT_DR       ,  /* Pump Room Outer Door */
   D_SPT_PER_GT           ,  /* Perimeter Gates */
   D_SPT_LTG_LOC_OR       ,  /* Lighting Override */
   D_SPT_LTG_PRM          ,  /* Pump Room Lights */
   D_SPT_LTG_ENC          ,  /* Enclosure Lights */
   D_SPT_LTG_WLA          ,  /* Well Area Lights */
   D_SPT_LTG_ITR          ,  /* IT Room Lights */
   D_SPT_ESTOP_CTRS       ,  /* Emergency Stop Contactors */
   D_SPT_SPLC_MODE        ,  /* Services Panel Control Mode */
   D_SPT_SPLC_STATE       ,  /* Services Panel General Status */
   D_SPT_SPLC_UPS         ,  /* Services PLC UPS */

   D_SPT_PWR_AZM          ,  /* Azimuth Computer Power */  
   D_SPT_PWR_ALT          ,  /* Altitude Computer Power */
   D_SPT_PWR_CAS          ,  /* Cassegrain Computer Power */  
   D_SPT_PWR_AMN          ,  /* Auxiliary Mechanism Node Power */
   D_SPT_PWR_NDS          ,  /* Nasmyth Drive-Side Power */
   D_SPT_PWR_NWS          ,  /* Nasmyth Wrap-Side Power */
   D_SPT_PWR_ACC          ,  /* Autoguider Computer Power */
   D_SPT_PWR_AZM_SW       ,  /* Azimuth Switchgear Power */
   D_SPT_PWR_ALT_SW       ,  /* Altitude Switchgear Power */
   D_SPT_PWR_CAS_SW       ,  /* Cassegrain Switchgear Power */
   D_SPT_CSE_SPLY         ,  /* Customers Instrument Supply */
   D_SPT_ENC_DRS          ,  /* Enclosure Doors */
   D_SPT_ENC_RSD          ,  /* Enclosure Roller Shutter Door */
   D_SPT_HTG_ENC_SEAL     ,  /* Enclosure Seals Trace Heating */
   D_SPT_MODE             ,  /* Mode Selector Switch */
   D_SPT_PWR_AG           ,  /* A & G Box Drives Power */
   D_SPT_PWR_AXIS         ,  /* Axis Drives Power */
   D_SPT_PWR_CRY1         ,  /* Cryotiger 1 Power */
   D_SPT_PWR_CRY2         ,  /* Cryotiger 2 Power */
   D_SPT_PWR_LV           ,  /* Basebox LV Power */
   D_SPT_PWR_MAIN         ,  /* Services Main Power */
   D_SPT_PWR_MCO          ,  /* Mirror Cover Power */
   D_SPT_PWR_MV           ,  /* Basebox MV Power */
   D_SPT_PWR_OFM          ,  /* Off-Mount Power */
   D_SPT_PWR_ONM          ,  /* On-Mount Power */
   D_SPT_PWR_PMC          ,  /* Primary Mirror Cell Power */
   D_SPT_PWR_PRES         ,  /* Basebox Pressure Sensors Power */
   D_SPT_PWR_SEC          ,  /* Secondary Mirror Power */
   D_SPT_PWR_SRV          ,  /* Servo Valve Power */
   D_SPT_PWR_TEMP         ,  /* Motor Temperature Panel Power */
   D_SPT_SPLC_CONTROL     ,  /* Services Panel Control Source */

   D_SPT_AZM_LIMITS       ,  /* Azimuth Limits */
   D_SPT_ALT_LIMITS       ,  /* Altitude Limits */
   D_SPT_CAS_LIMITS       ,  /* Cassegrain Limits */

   D_SPT_AZM_M1_TEMP      ,  /*  */
   D_SPT_AZM_M1_TEMP_VAL  ,  /*  */
   D_SPT_AZM_M2_TEMP      ,  /*  */
   D_SPT_AZM_M2_TEMP_VAL  ,  /*  */
   D_SPT_ALT_M1_TEMP      ,  /*  */
   D_SPT_ALT_M1_TEMP_VAL  ,  /*  */
   D_SPT_ALT_M2_TEMP      ,  /*  */
   D_SPT_ALT_M2_TEMP_VAL  ,  /*  */
   D_SPT_CAS_M1_TEMP      ,  /*  */
   D_SPT_CAS_M1_TEMP_VAL  ,  /*  */
   D_SPT_CAS_M2_TEMP      ,  /*  */
   D_SPT_CAS_M2_TEMP_VAL  ,  /*  */
   D_SPT_AMP_RK_TEMP      ,  /*  */
   D_SPT_AMP_RK_TEMP_VAL  ,  /*  */
   D_SPT_SPARE_2_TEMP     ,  /*  */
   D_SPT_SPARE_2_TEMP_VAL ,  /*  */
   D_SPT_SPARE_3_TEMP     ,  /*  */
   D_SPT_SPARE_3_TEMP_VAL ,  /*  */
   D_SPT_SPARE_4_TEMP     ,  /*  */
   D_SPT_SPARE_4_TEMP_VAL ,  /*  */
   D_SPT_AMN_TEMP         ,  /*  */
   D_SPT_AMN_TEMP_VAL     ,  /*  */
   D_SPT_CHK_PNL_TEMP     ,  /*  */
   D_SPT_CHK_PNL_TEMP_VAL ,  /*  */
   D_SPT_AG_TEMP          ,  /*  */
   D_SPT_AG_TEMP_VAL      ,  /*  */
   D_SPT_SPARE_8_TEMP     ,  /*  */
   D_SPT_SPARE_8_TEMP_VAL ,  /*  */
   D_SPT_ENC_AMB_TEMP     ,  /*  */
   D_SPT_ENC_AMB_TEMP_VAL ,  /*  */
   D_SPT_HTG_TT1_TEMP     ,  /*  */
   D_SPT_HTG_TT1_TEMP_VAL ,  /*  */
   D_SPT_HTG_TT2_TEMP     ,  /*  */
   D_SPT_HTG_TT2_TEMP_VAL ,  /*  */
   D_SPT_HTG_TT3_TEMP     ,  /*  */
   D_SPT_HTG_TT3_TEMP_VAL ,  /*  */
   D_SPT_HTG_TT4_TEMP     ,  /*  */
   D_SPT_HTG_TT4_TEMP_VAL ,  /*  */
   D_SPT_HTG_TT5_TEMP     ,  /*  */
   D_SPT_HTG_TT5_TEMP_VAL ,  /*  */
   D_SPT_HTG_TT6_TEMP     ,  /*  */
   D_SPT_HTG_TT6_TEMP_VAL ,  /*  */
   D_SPT_HYD_CHL_TEMP     ,  /*  */
   D_SPT_HYD_CHL_TEMP_VAL ,  /*  */
   D_SPT_HYD_FT1_FLOW     ,  /*  */
   D_SPT_HYD_FT1_FLOW_VAL ,  /*  */
   D_SPT_HYD_FT2_FLOW     ,  /*  */
   D_SPT_HYD_FT2_FLOW_VAL ,  /*  */
   D_SPT_HYD_FT3_FLOW     ,  /*  */
   D_SPT_HYD_FT3_FLOW_VAL ,  /*  */
   D_SPT_HYD_FT4_FLOW     ,  /*  */
   D_SPT_HYD_FT4_FLOW_VAL ,  /*  */
   D_SPT_HYD_MAIN_LVL     ,  /*  */
   D_SPT_HYD_MAIN_LVL_VAL ,  /*  */
   D_SPT_HYD_PT1A_PRES    ,  /*  */
   D_SPT_HYD_PT1A_PRES_VAL,  /*  */
   D_SPT_HYD_PT1B_PRES    ,  /*  */
   D_SPT_HYD_PT1B_PRES_VAL,  /*  */
   D_SPT_HYD_PT1C_PRES    ,  /*  */
   D_SPT_HYD_PT1C_PRES_VAL,  /*  */
   D_SPT_HYD_PT1D_PRES    ,  /*  */
   D_SPT_HYD_PT1D_PRES_VAL,  /*  */
   D_SPT_HYD_PT2A_PRES    ,  /*  */
   D_SPT_HYD_PT2A_PRES_VAL,  /*  */
   D_SPT_HYD_PT2B_PRES    ,  /*  */
   D_SPT_HYD_PT2B_PRES_VAL,  /*  */
   D_SPT_HYD_PT3A_PRES    ,  /*  */
   D_SPT_HYD_PT3A_PRES_VAL,  /*  */
   D_SPT_HYD_PT3B_PRES    ,  /*  */
   D_SPT_HYD_PT3B_PRES_VAL,  /*  */
   D_SPT_HYD_PT3C_PRES    ,  /*  */
   D_SPT_HYD_PT3C_PRES_VAL,  /*  */
   D_SPT_HYD_PT4A_PRES    ,  /*  */
   D_SPT_HYD_PT4A_PRES_VAL,  /*  */
   D_SPT_HYD_PT4B_PRES    ,  /*  */
   D_SPT_HYD_PT4B_PRES_VAL,  /*  */
   D_SPT_HYD_PT4C_PRES    ,  /*  */
   D_SPT_HYD_PT4C_PRES_VAL,  /*  */
   D_SPT_HYD_SCV_LVL      ,  /*  */
   D_SPT_HYD_SCV_LVL_VAL  ,  /*  */
   D_SPT_HYD_OIL_TEMP     ,  /*  */
   D_SPT_HYD_OIL_TEMP_VAL ,  /*  */
   D_SPT_HYD_TRY_LVL      ,  /*  */
   D_SPT_HYD_TRY_LVL_VAL  ,  /*  */
   D_SPT_IT_HUMD          ,  /*  */
   D_SPT_IT_HUMD_VAL      ,  /*  */
   D_SPT_IT_RM_TEMP       ,  /*  */
   D_SPT_IT_RM_TEMP_VAL   ,  /*  */
   D_SPT_IT_TEMP          ,  /*  */
   D_SPT_IT_TEMP_VAL      ,  /*  */
   D_SPT_MCO_PRES         ,  /*  */
   D_SPT_MCO_PRES_VAL     ,  /*  */
   D_SPT_PMC_PRES         ,  /*  */
   D_SPT_PMC_PRES_VAL     ,  /*  */
   D_SPT_PRM_TEMP         ,  /*  */
   D_SPT_PRM_TEMP_VAL     ,  /*  */

   D_SPT_AZM_M1           ,  /*  */
   D_SPT_AZM_M1_HRS       ,  /*  */
   D_SPT_AZM_M2           ,  /*  */
   D_SPT_AZM_M2_HRS       ,  /*  */
   D_SPT_ALT_M1           ,  /*  */
   D_SPT_ALT_M1_HRS       ,  /*  */
   D_SPT_ALT_M2           ,  /*  */
   D_SPT_ALT_M2_HRS       ,  /*  */
   D_SPT_CAS_M1           ,  /*  */
   D_SPT_CAS_M1_HRS       ,  /*  */
   D_SPT_CAS_M2           ,  /*  */
   D_SPT_CAS_M2_HRS       ,  /*  */
   D_SPT_PRM_FAN          ,  /*  */
   D_SPT_PRM_FAN_HRS      ,  /*  */
   D_SPT_AIR_COMP         ,  /*  */
   D_SPT_AIR_COMP_HRS     ,  /*  */
   D_SPT_HYD_PMP          ,  /*  */
   D_SPT_HYD_PMP_HRS      ,  /*  */
   D_SPT_HYD_CHL_PMP      ,  /*  */
   D_SPT_HYD_CHL_PMP_HRS  ,  /*  */
   D_SPT_HYD_CHL          ,  /*  */
   D_SPT_HYD_CHL_HRS      ,  /*  */
   D_SPT_HYD_PSCV         ,  /*  */
   D_SPT_HYD_PSCV_HRS     ,  /*  */
   D_SPT_HYD_SCV_PMP      ,  /*  */
   D_SPT_HYD_SCV_PMP_HRS  ,  /*  */

   D_SPT_HYD_AZM_GB       ,  /*  */
   D_SPT_HYD_AZM_GB_OPS   ,  /*  */
   D_SPT_HYD_AZM_LB       ,  /*  */
   D_SPT_HYD_AZM_LB_OPS   ,  /*  */
   D_SPT_HYD_ALT_GB       ,  /*  */
   D_SPT_HYD_ALT_GB_OPS   ,  /*  */
   D_SPT_HYD_ALT_LB       ,  /*  */
   D_SPT_HYD_ALT_LB_OPS   ,  /*  */
   D_SPT_MCO              ,  /*  */
   D_SPT_MCO_OPS          ,  /*  */

   D_SPT_SPLC_STATUS      ,  /*  */

   D_SPT_SPLC_VER_MAJOR   ,  /*  */
   D_SPT_SPLC_VER_MINOR   ,  /*  */

   D_SPT_STATUS_EOL       ,  /* End of status list */

   D_SPT_DATAID_EOL          /* End of list marker */

} eSptDataId_t;


#endif

/*******************************************************************************
** End of File Name: Spt.h
*******************************************************************************/
