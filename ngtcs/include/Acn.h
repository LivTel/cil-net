/*******************************************************************************
** Module Name:
**    Acn.h
**
** Purpose:
**    Public header file for general Axis Control Node development.
**
** Description:
**    This file contains definitions to all ACN software, for the Azimuth, 
**    Altitude, Cassegrain, Auxiliary Mechanisms and Mirror Support sub-systems.
**
**    Notes :-
**    1) This file replaces a long-since-redundant previous 'Acn.h' file which 
**       had an entirely different purpose. 
**    2) This file contains the contents of the old header file 'AcnTypedef.h'.
**
**    This code has been written to conform to "TTL Coding Standard" v1.0.
**
** Author(s):
**    Martyn J. Ford (mjf)
**
** Copyright (c) Telescope Technologies Limited (TTL), 2001
**
** Version:
**    $Id: Acn.h,v 0.26 2001/09/19 13:24:09 mjf Exp $
**
** History:
**    $Log: Acn.h,v $
**    Revision 0.26  2001/09/19 13:24:09  mjf
**    Addition of contents of old source file 'AcnTypedef.h'.
**
**    Revision 0.25  2001/09/17 13:54:23  mjf
**    Correction of typo.
**
**    Revision 0.24  2001/09/14 15:58:19  mjf
**    Filename re-used to hold general definitions for node sub-systems.
**
**
*******************************************************************************/


#ifndef ACN_H_DEFINED
#define ACN_H_DEFINED


/*
** Include relevant public header files
*/

/* TTL system-wide definitions */

#include "TtlSystem.h"

/* Communications Interface Library (CIL) */

#include "Cil.h"


/*
** Macro Definitions.
*/

/* 2.5 mS tick-rate = 400 ticks per second */

#define  E_ACN_TICKS_PER_SECOND  400      

/* 2^32 - the size of a 4-byte word */

#define  E_ACN_LONG_WORD_SIZE    4294967296.0

/* 2^48 - the size of a 6-byte word */

#define  E_ACN_48_BIT_WORD_SIZE  281474976710656.0

/* Storage scale-factor for storage of motor positions */

#define  E_ACN_MOTOR_POSITION_STORAGE_SCALE  4096.0

/* Length of strings used for names */

#define E_ACN_NAME_LEN       32

/* Number of possible nodes */

#define E_ACN_NODE_COUNT     5

/* Definition of invalid node (valid nodes in enum eAcnNodes_e) */

#define E_ACN_INVALID_NODE   -1

/* Node names - for command-line arguments */

#define E_ACN_STR_AZIMUTH    "azimuth"
#define E_ACN_STR_ELEVATION  "altitude"
#define E_ACN_STR_CASSEGRAIN "cassegrain"
#define E_ACN_STR_AUX_MECH   "auxmech"
#define E_ACN_STR_MIRROR     "mirror"

/* Number of letters to match for uniqueness */

#define E_ACN_STR_NODE_MATCH 2


/*
** Type Definitions.
*/

/* Motor Torque in milliNewtonMetres */

typedef  Int32_t  eAcnTorque_t;         
     
/* Frequency in microHertz */

typedef  Uint32_t eAcnFrequency_t;           

/* Amplifier gain in milliAmps per Volt */

typedef  Int32_t  eAcnAmplifierGain_t;       

/* Motor gain in mNm/A */

typedef  Int32_t  eAcnMotorGain_t;           

/* Motor current in mA */

typedef  Int32_t  eAcnCurrent_t;             

/* Motor drive voltage in mV */

typedef  Int32_t  eAcnVoltage_t;             

/* Axis position in milliArcSecs used externally */

typedef  Int32_t  eAcnMilliArcSecs_t;        

/* Axis & motor position in milliArcSecs used internally */

typedef  double   eAcnControllerMAS_t;       

/* Preload percentage in milli-percent */

typedef  Uint32_t eAcnMilliPercent_t;        

/* Axis & motor velocity in milliArcSecs/mS */

typedef  double   eAcnArcSecPerSec_t;        

/* Axis acceleration in ArcSec/Sec/Sec */

typedef  double   eAcnArcSecPerSecPerSec_t;  

/* PID controller gain - no units */

typedef  double   eAcnControllerGain_t;      

/*
** Enumeration of (node) sub-systems. Note that each sub-system is considered a
** collection of software which has an OidServer, CommsIn, CommsOut, state 
** controller and various end-clients. There may be more than one sub-system on 
** a given computer (node).
*/

typedef enum eAcnNodes_e
{
   E_ACN_NODE_AZN,                     /* Azimuth */
   E_ACN_NODE_ELN,                     /* Altitude */
   E_ACN_NODE_CSN,                     /* Cassegrain */
   E_ACN_NODE_AMN,                     /* Auxiliary Mechanisms */
   E_ACN_NODE_PMN,                     /* Primary Mirror Support */

   E_ACN_NODE_EOL                      /* End-of-list used for array bounds */
} iAcnNodes_t;


/*
** Structure for defining identifiers and names for each element, where an 
** element is a member of a software sub-system. Note that in some cases the 
** CilId may not be applicable, so E_CIL_BOL should be used. The Name will be 
** looked up at runtime to determine the existence and identity of other 
** processes.
*/

typedef struct
{
   Int32_t  CilId;
   char     Name[ E_ACN_NAME_LEN ];
} eAcnElementSpec_t;

/*
** Structure for defining parameters for each sub-system. The NodeName is used 
** in the configuration file to determine that an entry is for this sub-system.
** The NodeController is specified in terms of the package ID, which is used to 
** determine specific OIDs to access using the generic OID offsets in 'Gsc.h'. 
** Each element which may comprise a sub-system is then specified.
*/

typedef struct
{
   char     NodeName[ E_ACN_NAME_LEN ];
   Int32_t  NodeController;
   eAcnElementSpec_t OidServer;
   eAcnElementSpec_t CommsIn;
   eAcnElementSpec_t CommsOut;
   eAcnElementSpec_t AttribAgent;
   eAcnElementSpec_t ValueAgent;
   eAcnElementSpec_t TrackAgent;
   eAcnElementSpec_t PollAgent;
   eAcnElementSpec_t HeartbeatAgent;
   eAcnElementSpec_t RepServer;
   eAcnElementSpec_t RepQueue;
} eAcnSubSystemSpec_t;


/*
** Variable Declarations.
*/

/*
** The suggested method of using this data is to include "Acn.h" from an 
** application's private header, and then define the symbol E_ACN_MAIN in the
** main source file, before the inclusion of the private header.
*/

#ifdef E_ACN_MAIN

eAcnSubSystemSpec_t eAcnSubSystem[ E_ACN_NODE_EOL ] 
   = {
       { "AZN",
         NSC,
         { E_CIL_AZN, "E_TTL/AZN/OidServer" },
         { E_CIL_AZC, "E_TTL/AZN/CommsOut" },
         { E_CIL_AZS, "E_TTL/AZN/CommsIn" },
         { E_CIL_BOL, "E_TTL/AZN/AttribAgent" },
         { E_CIL_BOL, "E_TTL/AZN/ValueAgent" },
         { E_CIL_BOL, "E_TTL/AZN/TrackAgent" },
         { E_CIL_BOL, "E_TTL/AZN/PollAgent" },
         { E_CIL_BOL, "E_TTL/AZN/HeartbeatAgent" },
         { E_CIL_AZR, "E_TTL/AZN/SdbReporter" },   
         { E_CIL_BOL, "E_TTL/AZN/SdbReportQueue" } 
       },
       { "ELN",
         NSC,
         { E_CIL_ELN, "E_TTL/ELN/OidServer" },
         { E_CIL_ELC, "E_TTL/ELN/CommsOut" },
         { E_CIL_ELS, "E_TTL/ELN/CommsIn" },
         { E_CIL_BOL, "E_TTL/ELN/AttribAgent" },
         { E_CIL_BOL, "E_TTL/ELN/ValueAgent" },
         { E_CIL_BOL, "E_TTL/ELN/TrackAgent" },
         { E_CIL_BOL, "E_TTL/ELN/PollAgent" },
         { E_CIL_BOL, "E_TTL/ELN/HeartbeatAgent" },
         { E_CIL_ELR, "E_TTL/ELN/SdbReporter" },   
         { E_CIL_BOL, "E_TTL/ELN/SdbReportQueue" } 
       },
       { "CSN",
         NSC,
         { E_CIL_CSN, "E_TTL/CSN/OidServer" },
         { E_CIL_CSC, "E_TTL/CSN/CommsOut" },
         { E_CIL_CSS, "E_TTL/CSN/CommsIn" },
         { E_CIL_BOL, "E_TTL/CSN/AttribAgent" },
         { E_CIL_BOL, "E_TTL/CSN/ValueAgent" },
         { E_CIL_BOL, "E_TTL/CSN/TrackAgent" },
         { E_CIL_BOL, "E_TTL/CSN/PollAgent" },
         { E_CIL_BOL, "E_TTL/CSN/HeartbeatAgent" },
         { E_CIL_CSR, "E_TTL/CSN/SdbReporter" },
         { E_CIL_BOL, "E_TTL/CSN/SdbReportQueue" }
       },
       { "AMN",
         AMS,
         { E_CIL_OMN, "E_TTL/AMN/OidServer" },
         { E_CIL_OMC, "E_TTL/AMN/CommsOut" },
         { E_CIL_OMS, "E_TTL/AMN/CommsIn" },
         { E_CIL_BOL, "E_TTL/AMN/AttribAgent" },
         { E_CIL_BOL, "E_TTL/AMN/ValueAgent" },
         { E_CIL_BOL, "E_TTL/AMN/TrackAgent" },
         { E_CIL_BOL, "E_TTL/AMN/PollAgent" },
         { E_CIL_BOL, "E_TTL/AMN/HeartbeatAgent" },
         { E_CIL_OMR, "E_TTL/AMN/SdbReporter" },   
         { E_CIL_BOL, "E_TTL/AMN/SdbReportQueue" } 
       },
       { "PMN",
         PMS,
         { E_CIL_MSN, "E_TTL/PMN/OidServer" },
         { E_CIL_MSC, "E_TTL/PMN/CommsOut" },
         { E_CIL_MSS, "E_TTL/PMN/CommsIn" },
         { E_CIL_BOL, "E_TTL/PMN/AttribAgent" },
         { E_CIL_BOL, "E_TTL/PMN/ValueAgent" },
         { E_CIL_BOL, "E_TTL/PMN/TrackAgent" },
         { E_CIL_BOL, "E_TTL/PMN/PollAgent" },
         { E_CIL_BOL, "E_TTL/PMN/HeartbeatAgent" },
         { E_CIL_MSR, "E_TTL/PMN/SdbReporter" },   
         { E_CIL_BOL, "E_TTL/PMN/SdbReportQueue" } 
       }
     };

#else

extern eAcnSubSystemSpec_t eAcnSubSystem[ E_ACN_NODE_EOL ];

#endif


#endif

/*
** EOF
*/



