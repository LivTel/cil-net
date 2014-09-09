/*
**
** Module Name:
**       Amt.h
**
** Purpose:
**      The public include file for the Axis Motion Test (AMT) tool.
**
** Description:
**      This file provides the public prototypes and definitions
**      for use with the node's AMT package.
**
** Authors:
**    RDL:     R. D. Lett (TTL).
**
** Copyright (C) Telescope Technologies Limited (TTL).
**
** Version:
**    $Id: Amt.h,v 0.13 2002/09/11 09:51:55 rdl Exp $
**
** History:
**    $Log: Amt.h,v $
**    Revision 0.13  2002/09/11 09:51:55  rdl
**    Creation of additional OID entries and reorganisation of existing
**    entries to group related parameters.
**
**    Revision 0.12  2002/07/03 14:48:51  rdl
**    Addition of hash defines for additional OID entries associated
**    with implementation of stiction compensation.
**
**    Revision 0.11  2002/04/23 09:54:54  rdl
**    Change of comments for OID entries.
**
**    Revision 0.10  2002/04/04 13:55:29  rdl
**     General formatting corrections.
**
**    Revision 0.9  2002/04/04 10:13:01  rdl
**    Insertion of additional OID entries.
**
**    Revision 0.8  2002/03/26 12:18:30  rdl
**    Reorganisation of OID entries.
**
**    Revision 0.7  2002/03/26 09:21:48  rdl
**    General formatting.
**
**    Revision 0.6  2002/03/15 13:29:53  rdl
**    Insertion of additional OID identidfiers and general formatting.
**
**    Revision 0.5  2002/03/11 17:50:55  rdl
**    Modifications due to initial commissioning testing.
**
**    Revision 0.4  2002/02/28 10:00:56  rdl
**    Reorgansiation of OIDs.
**    Renaming of certain OIDs to prevent name clash with production code.
**
**    Revision 0.3  2002/02/27 10:07:18  rdl
**    Added additional entries to the OID Table - on going development.
**
**    Revision 0.2  2002/01/29 10:01:21  rdl
**    Added additional entries to the OID Table - on going development.
**
**    Revision 0.1  2002/01/23 16:51:04  mjf
**    Initial revision.
**
**
**
*/

#ifndef _AMT_HEADER_INCLUDED
#define _AMT_HEADER_INCLUDED

/*
** =============================================================================
** Start of include files:
** =============================================================================
*/

#include "TtlSystem.h"                 /* Include the package definitions.    */
#include "TtlConstants.h"              /* Include the package definitions.    */

/*
** =============================================================================
** End of include files:
** =============================================================================
*/

/*
** =============================================================================
** Start of Type Definitions:
** =============================================================================
*/

typedef Int32_t    eAmtTorque_t ;           /* Motor torque values (in mNm). */
typedef Int32_t    eAmtFrequency_t ;        /* Frequency values in (mHz).    */
typedef Int32_t    eAmtCurrent_t ;          /* Motor current values (in mA). */
typedef Int32_t    eAmtVoltage_t ;          /* DAC output voltage values (in mV). */
typedef double     eAmtVelocity_t ;         /* Motor velocity values (in m.a.s./millisecond). */
typedef Uint32_t   eAmtGainValue_t ;        /* Controller gain value (x 10^-3). */
typedef Uint32_t   eAmtAmplifierGain_t ;    /* Amplifier gain value (mA/volt).  */
typedef Uint32_t   eAmtMotorGain_t ;        /* Motor gain value (mNm/A).        */
typedef Uint32_t   eAmtDACVoltageGain_t ;   /* DAC voltage gain value (bits per volt). */
typedef Uint32_t   eAmtDACVoltageOffset_t ; /* DAC voltage gain offset value (bits). */

/*
** =============================================================================
** Start of Structure Definitions:
** =============================================================================
*/

typedef struct
   {
   eAmtAmplifierGain_t     AmplifierGain ;
   eAmtMotorGain_t         MotorGain ;
   eAmtDACVoltageGain_t    DACGain ;
   eAmtDACVoltageOffset_t  DACOffset ;
   eAmtTorque_t            TorqueLimitHigh ;
   eAmtTorque_t            TorqueLimitLow ;
   eAmtVelocity_t          VelocityLimit ;
   eAmtTorque_t            Preload ;
   } iAmtMotorConfig_t ;

typedef struct
   {
   Uint32_t    MSWord ;
   Uint32_t    LSWord ;
   } eAmt64BitValue_t ;

/*
** =============================================================================
** Start of Enumerations:
** =============================================================================
*/

/*
** Enumerate the names of the telescopes.
*/

typedef enum eAmtTelescope_e
   {
   E_AMT_LIVERPOOL_TELESCOPE      = 0,
   E_AMT_IUCAA_TELESCOPE,
   E_AMT_FAULKES_TELESCOPE1,
   E_AMT_FAULKES_TELESCOPE2,
   E_AMT_INVALID_TELESCOPE,

   E_AMT_TELESCOPE_EOL                 /* End of list marker.                 */
   } eAmtTelescope_t ;

/*
** Enumerate the axes of the telescope.
*/

typedef enum eAmtAxis_e
   {
   E_AMT_AXIS_AZIMUTH             = 10,
   E_AMT_AXIS_ALTITUDE,
   E_AMT_AXIS_CASSEGRAIN,
   E_AMT_AXIS_INVALID,

   E_AMT_AXIS_EOL                      /* End of list marker.                 */
   } eAmtAxis_t ;

/*
** Enumerate the control algorithms.
*/

typedef enum eAmtContAlgol_e
   {
   E_AMT_PID_ALGORITHM_CONTROL    = 20,
   E_AMT_HNF_ALGORITHM_CONTROL,
   E_AMT_INV_ALGORITHM_CONTROL,

   E_AMT_ALGORITHM_CONTROL_EOL         /* End of list marker.                 */
   } eAmtContAlgol_t ;

/*
** Enumerate the control modes of operation (system).
*/

typedef enum eAmtControlMode_e
   {
   E_AMT_INIT_CONTROL_MODE        = 30,
   E_AMT_TORQUE_CONTROL_MODE,
   E_AMT_VELOCITY_CONTROL_MODE,
   E_AMT_POSITION_CONTROL_MODE,

   E_AMT_CONTROL_MODE_EOL              /* End of list marker.                 */
   }  eAmtControlMode_t ;

/*
** Enumerate the control modes of operation (motors).
*/

typedef enum eAmtMotorControlMode_e
   {
   E_AMT_MODE_INIT                = 40,
   E_AMT_MODE_OL_TORQUE_CONTROL,
   E_AMT_MODE_VELOCITY_CONTROL,

   E_AMT_MOTOR_CONTROL_MODE_EOL        /* End of list marker.                 */
   } eAmtMotorControlMode_t ;

/*
** Enumerate the excitation signals.
*/

typedef enum eAmtSignal_e
   {
   E_AMT_SINE_SIGNAL              = 50,
   E_AMT_SQUARE_SIGNAL,
   E_AMT_RAMP_SIGNAL,
   E_AMT_COSINE_SIGNAL,
   E_AMT_SLEW_SIGNAL,
   E_AMT_INVALID_SIGNAL,

   E_AMT_SIGNAL_EOL                    /* End of list marker.                 */
   } eAmtSignal_t ;

/*
** Enumerate the motors fitted.
*/

typedef enum eAmtMotorID_e
   {
   E_AMT_MOTOR_1 = 0,
   E_AMT_MOTOR_2 = 1,

   E_AMT_MAX_NUMBER_OF_MOTORS          /* For range checking & determining    */
                                       /* maximum number of cards.            */
   } eAmtMotorID_t ;

/*
** =============================================================================
** Start of hash defines:
** =============================================================================
*/

#define E_AMT_SWEPT_SINE_AMPLITUDE           200 /* Fixed amplitude: 1000 mNm */
#define E_AMT_SWEPT_SINE_NO_FREQS             20
#define E_AMT_SWEPT_SINE_PERIOD_COUNT       2000

typedef struct
   {
   Int32_t             MinTickCount ;
   eAmtFrequency_t     SweptSineFreq [E_AMT_SWEPT_SINE_NO_FREQS] ;
   } iAmtSweptSineFreqArray_t ;


#define E_AMT_NUMBER_OF_TELESCOPES             4
#define E_AMT_NUMBER_OF_AXES                   3

                                       /* Timer tick period in uS = 100mS     */
#define I_AMT_WATCHDOG_TIMER_PERIOD    100000000

/*
** Number of timer ticks per second (Tfp period = 2.5 ms).
*/

#define I_AMT_NUMBER_OF_TIMER_TICKS_PER_SECOND      400


#ifdef _AZINODE
#define E_AMT_RAMP_MODE_MINIMUM              1
#define E_AMT_RAMP_MODE_MAXIMUM              6
#endif

#ifdef _ALTNODE
#define E_AMT_RAMP_MODE_MINIMUM              1
#define E_AMT_RAMP_MODE_MAXIMUM              6
#endif

#ifdef _CASNODE
#define E_AMT_RAMP_MODE_MINIMUM              1
#define E_AMT_RAMP_MODE_MAXIMUM              6
#endif

#define E_AMT_SWEPT_SINE_MODE_MINIMUM        1
#define E_AMT_SWEPT_SINE_MODE_MAXIMUM        4

/*
** =============================================================================
**
** =============================================================================
*/

/* Enumerate this packages exit codes   */
typedef enum eAmtExitStatus_e
   {
   E_AMT_EXIT_CODE_0,
   E_AMT_EXIT_CODE_1,
   E_AMT_EXIT_CODE_2,
   E_AMT_EXIT_CODE_3,

   E_AMT_EXIT_CODE_EOL                 /* End of list marker.                 */

   } eAmtExitStatus_t ;


/* Enumerate this package's error codes. */
typedef enum eAmtStatus_e
   {
   E_AMT_MESSAGE_NOT_RECOGNISED = STATUS_START (AMT),
   E_AMT_INVALID_CONTROL_MODE,
   E_AMT_INVALID_SIGNAL_TYPE,
   E_AMT_INVALID_FREQUENCY_VALUE,
   E_AMT_INVALID_AMPLITUDE_VALUE,
   E_AMT_INVALID_RAMP_CONTROL_MODE,
   E_AMT_INVALID_FILENAME,
   E_AMT_SOFTWARE_ERROR,
   E_AMT_COMMAND_LINE_VALIDATION_FAILURE,
   E_AMT_COMMAND_LINE_VALIDATION_SUCCESS,
   E_AMT_VELOCITY_VALIDATION_ERROR,
   E_AMT_TORQUE_DEMAND_LIMIT_REACHED,
   E_AMT_MOTOR_ID_VALIDATION_ERROR,
   E_AMT_PRELOAD_PERIOD_EXCEEDS_MAX_LOG_PERIOD,
   E_AMT_STANDARD_PERIOD_EXCEEDS_MAX_LOG_PERIOD,
   E_AMT_RAMP_MOTION_PERIOD_EXCEEDS_RAMP_LOG_PERIOD,
   E_AMT_DAC_RANGE_ERROR,
   E_AMT_INTEGRATOR_WIND_UP_ERROR,
   E_AMT_DIVIDE_BY_ZERO_ERROR,
   E_AMT_PARENT_SEGMENT_ACCESS_FAILURE,
   E_AMT_UNABLE_TO_INITIALISE_ENCODERS,
   E_AMT_FAILED_TO_GET_ENCODER_POSITION,
   E_AMT_UNABLE_TO_INITIALISE_TIMER_CARD,
   E_AMT_UNABLE_TO_INITIALISE_IO_CARD,
   E_AMT_MAIN_LOOP_FAILURE,
   E_AMT_UNKNOWN_INTERRUPT,
   E_AMT_UNABLE_TO_ENABLE_DRIVE,
   E_AMT_TIMED_OUT_WAITING_FOR_BRAKE_REMOVAL,
   E_AMT_UNABLE_TO_DISABLE_DRIVE,
   E_AMT_TIMED_OUT_WAITING_FOR_BRAKE_APPLICATION,
   E_AMT_INTERLOCK_FAULT,
   E_AMT_BRAKES_ON_FAULT,
   E_AMT_PRELOAD_BALANCE_NOT_ACHIEVED,
   E_AMT_STOP_PRELOAD,
   E_AMT_PRELOAD_ERROR,
   E_AMT_STOP_LOGGING,
   E_AMT_LOGGING_ERROR,
   E_AMT_FAILED_TO_CONFIGURE_TIMER,
   E_AMT_CARD_NOT_INITIALISED,
   E_AMT_UNABLE_TO_TOGGLE_WATCHDOG_OUTPUT,
   E_AMT_UNABLE_TO_TOGGLE_HWTP_OUTPUT,
   E_AMT_FREQUENCY_TOO_LOW,
   E_AMT_FREQUENCY_TOO_HIGH,
   E_AMT_TC_SINE_FREQ_TOO_HIGH,
   E_AMT_TC_SINE_AMP_TOO_LOW,
   E_AMT_TC_SINE_AMP_TOO_HIGH,
   E_AMT_TC_COSINE_FREQ_TOO_HIGH,
   E_AMT_TC_COSINE_AMP_TOO_LOW,
   E_AMT_TC_COSINE_AMP_TOO_HIGH,
   E_AMT_TC_RAMP_FREQ_TOO_HIGH,
   E_AMT_TC_RAMP_AMP_TOO_LOW,
   E_AMT_TC_RAMP_AMP_TOO_HIGH,
   E_AMT_TC_SQUARE_FREQ_TOO_HIGH,
   E_AMT_TC_SQUARE_AMP_TOO_LOW,
   E_AMT_TC_SQUARE_AMP_TOO_HIGH,
   E_AMT_TC_SLEW_FREQ_TOO_HIGH,
   E_AMT_TC_SLEW_AMP_TOO_LOW,
   E_AMT_TC_SLEW_AMP_TOO_HIGH,
   E_AMT_VC_SINE_FREQ_TOO_HIGH,
   E_AMT_VC_SINE_AMP_TOO_LOW,
   E_AMT_VC_SINE_AMP_TOO_HIGH,
   E_AMT_VC_COSINE_FREQ_TOO_HIGH,
   E_AMT_VC_COSINE_AMP_TOO_LOW,
   E_AMT_VC_COSINE_AMP_TOO_HIGH,
   E_AMT_VC_RAMP_FREQ_TOO_HIGH,
   E_AMT_VC_RAMP_AMP_TOO_LOW,
   E_AMT_VC_RAMP_AMP_TOO_HIGH,
   E_AMT_VC_SQUARE_FREQ_TOO_HIGH,
   E_AMT_VC_SQUARE_AMP_TOO_LOW,
   E_AMT_VC_SQUARE_AMP_TOO_HIGH,
   E_AMT_VC_SLEW_FREQ_TOO_HIGH,
   E_AMT_VC_SLEW_AMP_TOO_LOW,
   E_AMT_VC_SLEW_AMP_TOO_HIGH,
   E_AMT_PC_SINE_FREQ_TOO_HIGH,
   E_AMT_PC_SINE_AMP_TOO_LOW,
   E_AMT_PC_SINE_AMP_TOO_HIGH,
   E_AMT_PC_COSINE_FREQ_TOO_HIGH,
   E_AMT_PC_COSINE_AMP_TOO_LOW,
   E_AMT_PC_COSINE_AMP_TOO_HIGH,
   E_AMT_PC_RAMP_FREQ_TOO_HIGH,
   E_AMT_PC_RAMP_AMP_TOO_LOW,
   E_AMT_PC_RAMP_AMP_TOO_HIGH,
   E_AMT_PC_SQUARE_FREQ_TOO_HIGH,
   E_AMT_PC_SQUARE_AMP_TOO_LOW,
   E_AMT_PC_SQUARE_AMP_TOO_HIGH,
   E_AMT_PC_SLEW_FREQ_TOO_HIGH,
   E_AMT_PC_SLEW_AMP_TOO_LOW,
   E_AMT_PC_SLEW_AMP_TOO_HIGH,
   E_AMT_OID_TABLE_INIT_FAILURE,
   E_AMT_FAILED_TO_FIND_SPECIFIED_END_CLIENT,
   E_AMT_FAILED_TO_SEND_MESSAGE_TO_END_CLIENT,
   E_AMT_END_CLIENT_REJECTED_GET_COMMAND,
   E_AMT_END_CLIENT_REJECTED_SET_COMMAND,
   E_AMT_FAILED_TO_CONFIGURE_INTERRUPT_PROXY,
   E_AMT_INVALID_STATE,
   E_AMT_EXPIRED_TARGET_TIME,
   E_AMT_IN_CLOCKWISE_LIMIT,
   E_AMT_IN_ANTI_CLOCKWISE_LIMIT,
   E_AMT_FAILED_TO_CONFIGURE_LOG_FILE,
   E_AMT_FAILED_TO_SEND_DATA_TO_LOG_FILE,
   E_AMT_DIVIDE_BY_ZERO,                    /* Algorithm would fail to zero denominator. */
   E_AMT_NO_SOLUTION,                       /* No solution may be found for this data. */
   E_AMT_NO_DATA,                           /* No data on which to perform algorithm. */
   E_AMT_FAILED_TO_CONFIG_SHMEM,            /* Failed to config shmem for logger data. */
   E_AMT_FAILED_TO_READ_CONFIG_FILE,        /* Failed to read supplied config file. */
   E_AMT_FAILED_TO_SET_OID_NAME_TO_VALUE,   /* Failed to set OID name to value. */
   E_AMT_NO_VEN_HOMING_DIRECTION,           /* Couldn't get homing dir'n from VEN */
   E_AMT_PROFILE_RESET,                     /* Motion profile algorithm reset */
   E_AMT_INVALID_SWEPT_SINE_GENERATION,     /* Invalid swept sine generation  */
   E_AMT_TAPE_AND_LEN_ENC_ENABLE_REQUEST,   /* Invalid request to enable tape & len encs. */

   E_AMT_EO_ERROR_LIST = STATUS_START (AMT) + 0xFFFF
   } eAmtClientStatus_t ;

/*
** =============================================================================
** Enumerate the OID's owned by this package.
** =============================================================================
*/
typedef enum eAmtDataId_e
   {
   D_AMT_DATAID_BOL = OID_START (AMT), /* Offset the OID's by the package ID.       */ /* 0000 */
   D_AMT_PROC_STATE,                   /* The AMT process state.                    */ /* 0001 */
   D_AMT_APP_VERSION,                  /* AMT package revision.                     */ /* 0002 */
   D_AMT_TFP_SIMULATE,                 /* TFP simulate mode flag.                   */ /* 0003 */
   D_AMT_HHE_SIMULATE,                 /* Heidenhain Encoder simulate mode flag.    */ /* 0004 */
   D_AMT_MFC_SIMULATE,                 /* Multifunction IO Card simulate mode flag. */ /* 0005 */

   D_AMT_TELESCOPE_ID,                 /* Telescope ID code.                        */ /* 0006 */
   D_AMT_AXIS_ID,                      /* Telescope Axis ID code.                   */ /* 0007 */
   D_AMT_AZM_NODE_ID,                  /* Azimuth Computer Node Node Number         */ /* 0008 */
   D_AMT_ALT_NODE_ID,                  /* Altitude Computer Node Node Number        */ /* 0009 */
   D_AMT_CAS_NODE_ID,                  /* Cassegrain Computer Node Node Number      */ /* 0010 */

   /*
   ** =============================================================================
   ** Absolute encoder auxiliary process active parameters.
   ** =============================================================================
   */
   D_AMT_AZM_AET_PRESENT,              /* Absolute Enc Task Present Azimuth Node    */ /* 0011 */
   D_AMT_ALT_AET_PRESENT,              /* Absolute Enc Task Present Altitude Node   */ /* 0012 */
   D_AMT_CAS_AET_PRESENT,              /* Absolute Enc Task Present Cassegrain Node */ /* 0013 */

   /*
   ** =============================================================================
   ** Axis Start and finish position as reported by absolute encoders.
   ** =============================================================================
   */
   D_AMT_AZM_AXIS_POSN_START,          /* Azimuth axis starting position (mas).     */ /* 0014 */
   D_AMT_AZM_AXIS_POSN_FINISH,         /* Azimuth axis finishing position (mas).    */ /* 0015 */
   D_AMT_ALT_AXIS_POSN_START,          /* Altitude axis starting position (mas).    */ /* 0016 */
   D_AMT_ALT_AXIS_POSN_FINISH,         /* Altitude axis finishing position (mas).   */ /* 0017 */
   D_AMT_CAS_AXIS_POSN_START,          /* Cassegrain axis starting position (mas).  */ /* 0018 */
   D_AMT_CAS_AXIS_POSN_FINISH,         /* Cassegrain axis finishing position (mas). */ /* 0019 */

   D_AMT_EXTENDED_RUN,                 /* Extended run selected (TRUE/FALSE)        */ /* 0020 */
   D_AMT_EXTENDED_RUN_PERIOD,          /* Extended run period (seconds)             */ /* 0021 */
   D_AMT_WATCHDOG_SETUP_PERIOD,        /* Setup period for watchdog (seconds).      */ /* 0022 */

   /*
   ** =============================================================================
   ** Storage for command line parameters.
   ** =============================================================================
   */
   D_AMT_CONTROL_ALGORITHM,            /* Control Algorithm (PID or HNF)            */ /* 0023 */
   D_AMT_CONTROL_MODE,                 /* Control Mode (Open Loop, Vel or Position) */ /* 0024 */
   D_AMT_EXCITATION_SIGNAL,            /* Excitation Sig (Sine, Cosine, Ramp, Slew) */ /* 0025 */
   D_AMT_EXCITATION_FREQUENCY,         /* Frequency in Mhz                          */ /* 0026 */
   D_AMT_EXCITATION_AMPLITUDE,         /* Amplitude in mas (peak).                  */ /* 0027 */
   D_AMT_RAMP_NUMBER,                  /* Selected Ramp mode                        */ /* 0028 */

   /*
   ** =============================================================================
   ** Testing configuration and miscellaneous parameters.
   ** =============================================================================
   */
   D_AMT_CONTROL_ENCODER_NUM,          /* Number of encoder to be used for control. */ /* 0029 */
   D_AMT_OFF_MOUNT_TESTING,            /* Off mount testing selected. (F/T).        */ /* 0030 */
   D_AMT_AMT_SPECIFIC_HNF_CFG,         /* H Infinity config file specific to AMT.   */ /* 0031 */

   /*
   ** =============================================================================
   ** Function information display frequency values.
   ** =============================================================================
   */
   D_AMT_FUNC_DISP_PRELOAD,            /* PreLoad2 func. disp count interval.       */ /* 0032 */
   D_AMT_FUNC_DISP_RUNLOG,             /* RunLogging func. disp count interval.     */ /* 0033 */
   D_AMT_FUNC_DISP_FILEOP,             /* Storage func. disp count count interval.  */ /* 0034 */
   D_AMT_ABS_ENC_DISP,                 /* Absolute Encoder Display flag (F/T).      */ /* 0035 */

   /*
   ** =============================================================================
   ** Ramp maximum velocity and acceleration limits parameters.
   ** =============================================================================
   */
   D_AMT_MAX_VEL_RAMP_1,               /* Maximum velocity - Ramp 1 (as/s).         */ /* 0036 */
   D_AMT_MAX_VEL_RAMP_2,               /* Maximum velocity - Ramp 2 (as/s).         */ /* 0037 */
   D_AMT_MAX_VEL_RAMP_3,               /* Maximum velocity - Ramp 3 (as/s).         */ /* 0038 */
   D_AMT_MAX_VEL_RAMP_4,               /* Maximum velocity - Ramp 4 (as/s).         */ /* 0039 */
   D_AMT_MAX_VEL_RAMP_5,               /* Maximum velocity - Ramp 5 (as/s).         */ /* 0040 */
   D_AMT_MAX_VEL_RAMP_6,               /* Maximum velocity - Ramp 6 (as/s).         */ /* 0041 */
   D_AMT_MAX_ACCN_RAMP_1,              /* Maximum acceleration - Ramp 1 (as/s/s).   */ /* 0042 */
   D_AMT_MAX_ACCN_RAMP_2,              /* Maximum acceleration - Ramp 2 (as/s/s).   */ /* 0043 */
   D_AMT_MAX_ACCN_RAMP_3,              /* Maximum acceleration - Ramp 3 (as/s/s).   */ /* 0044 */
   D_AMT_MAX_ACCN_RAMP_4,              /* Maximum acceleration - Ramp 4 (as/s/s).   */ /* 0045 */
   D_AMT_MAX_ACCN_RAMP_5,              /* Maximum acceleration - Ramp 5 (as/s/s).   */ /* 0046 */
   D_AMT_MAX_ACCN_RAMP_6,              /* Maximum acceleration - Ramp 6 (as/s/s).   */ /* 0047 */
   D_AMT_MAX_RAMP_NUMBER,              /* Maximum ramp number allowed.              */ /* 0048 */

   /*
   ** =============================================================================
   ** Motor & Brake data points.
   ** Individual drive enable and brake relesae flag parameters.
   ** Mininum and maximum torque limits, preload staging value parameters.
   ** =============================================================================
   */
   D_AMT_ENABLE_DRIVE_1,               /* Enable Drive 1. (F/T).             		*/ /* 0049 */
   D_AMT_ENABLE_DRIVE_2,               /* Enable Drive 2. (F/T).                    */ /* 0050 */
   D_AMT_RELEASE_BRAKE_1,              /* Release Bake on Motor 1. (F/T).           */ /* 0051 */
   D_AMT_RELEASE_BRAKE_2,              /* Release Bake on Motor 2. (F/T).           */ /* 0052 */
   D_AMT_MAX_MOTOR_TORQUE,             /* Max motor torque (mNm)                    */ /* 0053 */
   D_AMT_TORQUE_CLAMP_LIMIT_LOW,       /* Min value of torque for backlash (mNm)    */ /* 0054 */
   D_AMT_MOTOR_PRELOAD_REQUIRED,       /* Motor preloading required (F/T).          */ /* 0055 */
   D_AMT_PRELOAD_STG_1,                /* Preload Stage 1 : 0 - x             (mNm) */ /* 0056 */
   D_AMT_PRELOAD_STG_2,                /* Preload Stage 2 : x - final preload (mNm) */ /* 0057 */
   D_AMT_NUM_OF_CYCLES_PRELOAD_STG_1,  /* Number of cycles to apply preload Stage 1 */ /* 0058 */
   D_AMT_NUM_OF_CYCLES_PRELOAD_STG_2,  /* Number of cycles to apply preload Stage 2 */ /* 0059 */
   D_AMT_STG1_TO_STG2_INTERVAL,        /* Interval between Stage 1 & Stage 2 (s)    */ /* 0060 */
   D_AMT_NUM_COUNTS_TO_APPLY_PLOAD,    /* Derived Number of counts to apply preload */ /* 0061 */
   D_AMT_PRELOAD_PAUSE_COUNT,          /* Count before motion after preload appn.   */ /* 0062 */
   D_AMT_TERM_ZERO_PRELOAD,            /* Apply zero preload at program termination */ /* 0063 */
   D_AMT_STICTION_TORQUE_OFFSET,       /* Torque to overcome stiction               */ /* 0064 */

   /*
   ** =============================================================================
   ** PID controller gain parameters
   ** =============================================================================
   */
   D_AMT_PID_P1_GAIN_X1E9,             /* PID controller P1 gain x 1e9.				*/ /* 0065 */
   D_AMT_PID_P2_GAIN_X1E9,             /* PID controller P2 gain x 1e9.				*/ /* 0066 */
   D_AMT_PID_K1_GAIN_X1E9,             /* PID controller K1 gain x 1e9.				*/ /* 0067 */
   D_AMT_HNF_P2_GAIN_X1E9,             /* H Infinitiy PID controller P2 gain x 1e9. */ /* 0068 */

   /*
   ** =============================================================================
   ** Axis Velocity gain and feedback fraction parameters.
   ** =============================================================================
   */
   D_AMT_AXIS_VELOCITY_GAIN_X1E9,      /* Axis velocity gain x 1e9. (kd)            */ /* 0069 */
   D_AMT_PIDVEL_FEEDBACK_FRACTION,     /* PID Velocity feedback fraction  (x 1000)  */ /* 0070 */
   D_AMT_HNFVEL_FEEDBACK_FRACTION,     /* H Inf Velocity feedback fraction (x 1000) */ /* 0071 */

   /*
   ** =============================================================================
   ** Swept Sine option parameters.
   ** =============================================================================
   */
   D_AMT_SWEPT_SINE_MODE,              /* Swept Sine Mode Activated (F/T).          */ /* 0072 */
   D_AMT_SWEPT_SINE_NUMBER,            /* Swept Sine Number                         */ /* 0073 */
   D_AMT_SWEPT_SINE_AMPLITUDE,         /* Swept Sine Amplitude (mNm)                */ /* 0074 */

   /*
   ** =============================================================================
   ** Header file and configuraton file options.
   ** =============================================================================
   */
   D_AMT_DATA_FILE_FULL_HEADER,        /* Full data file header req'd. (F/T).       */ /* 0075 */
   D_AMT_HNF_ALGOL_HEADER,             /* H Infinity config file info req'd. (F/T). */ /* 0076 */

   /*
   ** =============================================================================
   ** Data Logging period parameters.
   ** =============================================================================
   */
   D_AMT_MAX_LOGGING_PERIOD,           /* Maximum Logging Period (s)                */ /* 0077 */
   D_AMT_LOGGING_PERIOD,               /* Standard logging period (s)               */ /* 0078 */
   D_AMT_RAMP_LOGGING_PERIOD,          /* Ramp logging period (s)                   */ /* 0079 */
   D_AMT_RAMP_MOTION_PERIOD,           /* Ramp motion period (s)                    */ /* 0080 */
   D_AMT_SWEPT_SINE_LOGGING_PERIOD,    /* Swept Sine Data Collection Period         */ /* 0081 */

   /*
   ** =============================================================================
   ** Brake release and application control count interval parameters.
   ** =============================================================================
   */
   D_AMT_BRAKE_RELEASE_WAIT_COUNT,     /* Delay before releasing brakes             */ /* 0082 */
   D_AMT_BRAKE_PREAPPLY_WAIT_COUNT,    /* Pre Delay before applying brakes          */ /* 0083 */
   D_AMT_BRAKE_APPLY_WAIT_COUNT,       /* Delay before applying brakes              */ /* 0084 */

   /*
   ** =============================================================================
   ** Data logging parameters.
   ** =============================================================================
   */
   D_AMT_NUM_OF_CYCLES_TO_LOG,         /* Number of cycles for data collection      */ /* 0085 */
   D_AMT_NUM_OF_CYCLES_TO_RUN,         /* Number of cycles for program execution    */ /* 0086 */

   /*
   ** =============================================================================
   ** Filter parameters and enable options.
   ** =============================================================================
   */
   D_AMT_MOTOR_FILTER_ENABLE,          /* Enable / Disable Motor Filtering  (F/T)   */ /* 0087 */
   D_AMT_OUTPUT_FILTER_DENOMINATOR,    /* Denominator coeff for IIR filter          */ /* 0088 */
   D_AMT_OUTPUT_FILTER_C0_COEFFICIENT, /* Input coeff for IIR filter                */ /* 0089 */
   D_AMT_OUTPUT_FILTER_D1_COEFFICIENT, /* Output feedback coeff for IIR filter      */ /* 0090 */
   D_AMT_HINF_FILTER_ENABLE,           /* Enable / Disable H Infinity Filter (F/T)  */ /* 0091 */
   D_AMT_HINF_OUTPUTN0_FRACTION,       /* H Inf Filter Coefficient Fraction N0      */ /* 0092 */
   D_AMT_HINF_OUTPUTN1_FRACTION,       /* H Inf Filter Coefficient Fraction N1      */ /* 0093 */
   D_AMT_HINF_OUTPUTN2_FRACTION,       /* H Inf Filter Coefficient Fraction N2      */ /* 0094 */
   D_AMT_HINF_OUTPUTN3_FRACTION,       /* H Inf Filter Coefficient Fraction N3      */ /* 0095 */

   /*
   ** =============================================================================
   ** Digital to Analogue Converter parameters.
   ** =============================================================================
   */
   D_AMT_MIN_DAC_VALUE,                /* Min DAC Value for 16-bit DAC Card (0)     */ /* 0096 */
   D_AMT_MAX_DAC_VALUE,                /* Max DAC Value for 16-bit DAC Card (65535) */ /* 0097 */
   D_AMT_FULL_SCALE_DAC_VALUE,         /* FSD -10 Volts to + 10 Volts (20 V)        */ /* 0098 */
   D_AMT_ZERO_OFFSET_DAC_VALUE,        /* Zero point offset for DAC (0 V = 32767    */ /* 0099 */

   /*
   ** =============================================================================
   ** Gain factor parameters
   ** =============================================================================
   */
   D_AMT_MOTOR_VEL_GAIN_FACTOR,        /* Motor Velocity Gain Factor (2)            */ /* 0100 */
   D_AMT_AXIS_VEL_GAIN_FACTOR,         /* Axis Velocity Gain Factor (2000)          */ /* 0101 */
   D_AMT_PID_GAIN_SCALE_FACTOR,        /* PID Loop Gain Scale Factor (1000.0)       */ /* 0102 */
   D_AMT_AXIS_MOTOR_GAIN,              /* Motor gain.                               */ /* 0103 */
   D_AMT_AXIS_AMPLIFIER_GAIN,          /* Amplifier gain.                           */ /* 0104 */
   D_AMT_MOTOR_GAIN_SCALE,             /* Scale factor for motor gain. (1000.0)     */ /* 0105 */
   D_AMT_AMPLIFIER_GAIN_SCALE,         /* Scale factor for amplifier gain. (1000.0) */ /* 0106 */
   D_AMT_VOLTAGE_GAIN_SCALE,           /* Scale factor for voltage gain. (1000)     */ /* 0107 */

   /*
   ** =============================================================================
   ** Motor, axis and length encoder parameters.
   ** =============================================================================
   */
   D_AMT_MAX_NUMBER_ENCODER_CARDS,     /* Max. number of IK220 encoder cards fitted.*/ /* 0108 */
   D_AMT_MAX_NUMBER_MOTOR_ENCODERS,    /* Max. number of motor encoders fitted.     */ /* 0109 */
   D_AMT_MAX_NUMBER_TAPE_ENCODERS,     /* Max. number of tape encoders fitted. 	    */ /* 0110 */
   D_AMT_MAX_NUMBER_LENGTH_ENCODERS,   /* Max. number of length encoders fitted.    */ /* 0111 */
   D_AMT_ENCODER_INTERPOLATION_BITS,   /* Maximum encoder resolution ((double) 12.0)*/ /* 0112 */ 
   D_AMT_ENCODER_PULSES_PER_AXIS_REV,  /* Encoder Pulses per Rev.                   */ /* 0113 */ 
   D_AMT_ENCODER_PULSES_PER_MOTOR_REV, /* Motor Encoder pulses per Rev.    (1000.0) */ /* 0114 */ 
   D_AMT_ENABLE_TAPE_ENCODERS,         /* Tape Encoders enable operation flag       */ /* 0115 */ 
   D_AMT_ENABLE_LENGTH_ENCODERS,       /* Length Encoders enable operation flag     */ /* 0116 */ 
   D_AMT_MOTOR_ENCODERS_DIRECTION,     /* Motor Enc. Counting Dirn.   0: +ve 1: -ve */ /* 0117 */
   D_AMT_TAPE_ENCODERS_DIRECTION,      /* Tape Enc. Counting Dirn.    0: +ve 1: -ve	*/ /* 0118 */
   D_AMT_LENGTH_ENCODERS_DIRECTION,    /* Length Enc. Counting Dirn.  0: +ve 1: -ve	*/ /* 0119 */
   D_AMT_MOTOR_FEEDBACK,               /* Motor Encoders Counting Direction (-1/1)  */ /* 0120 */
   D_AMT_AXIS_FEEDBACK,                /* Motor Encoders Counting Direction (-1/1)  */ /* 0121 */
  
   /*
   ** Absolute Encoder Parameters.
   */
   D_AMT_DATA_COLLECTION_RATE,         /* Rate at which data should be stored       */ /* 0122 */
   D_AMT_ABS_ENC_READ_RATE,            /* Rate at which Abs. Encs. should be read   */ /* 0123 */

   /*
   ** =============================================================================
   ** Controller delay - used to simulate production code message delays.
   ** =============================================================================
   */
   D_AMT_CONTROLLER_DELAY,             /* Delay before appplication of new demand   */ /* 0124 */

   /*
   ** =============================================================================
   ** Hardware pulsing bit parameters.
   ** =============================================================================
   */
   D_AMT_TOGGLE_HARDWARE_PULSE,        /* Flag to enable hardware pulsing bit (T/F) */ /* 0125 */
   D_AMT_HARDWARE_PULSE_RATE,          /* Rate of pulsing hardware toggle bit       */ /* 0126 */

   /*
   ** =============================================================================
   ** Auxiliary process id parameters.
   ** =============================================================================
   */
   D_AMT_TFP_SERVER_PID,               /* TFP Server Process ID                     */ /* 0127 */
   D_AMT_AZM_ABS_ENC_PID,              /* Azimuth Abs. Encoder Server Process ID    */ /* 0128 */
   D_AMT_ALT_ABS_ENC_PID,              /* Altitude Abs. Encoder Server Process ID   */ /* 0129 */
   D_AMT_CAS_ABS_ENC_PID,              /* Cassegrain Abs. Encoder Server Process ID */ /* 0130 */
   D_AMT_WATCHDOG_PID,                 /* WatchDog Process ID                       */ /* 0131 */

   /*
   ** =============================================================================
   ** Spare OIDs - Not assigned : available for future development.
   ** =============================================================================
   */
   D_AMT_DUMMY_OID_01,                 /* Dummy OID - place holder for later use    */ /* 0132 */
   D_AMT_DUMMY_OID_02,                 /* Dummy OID - place holder for later use    */ /* 0133 */
   D_AMT_DUMMY_OID_03,                 /* Dummy OID - place holder for later use	*/ /* 0134 */

   /*
   ** =============================================================================
   ** Stiction compensation parameters.
   ** =============================================================================
   */
   D_AMT_STICTION_COMP_TOLERANCE,      /* Stiction compensation tolerance           */ /* 0135 */
   D_AMT_STICTION_COMP_POSITIVE,       /* Stiction compensation for +ve velocities  */ /* 0136 */
   D_AMT_STICTION_COMP_NEGATIVE,       /* Stiction compensation for -ve velocities  */ /* 0137 */

   /*
   ** =============================================================================
   ** Reference velocity gain parameters.
   ** =============================================================================
   */
   D_AMT_TC_AXIS_REF_VEL_GAIN,         /* Torque Control   Axis Ref. Velocity Gain  */ /* 0138 */
   D_AMT_VC_AXIS_REF_VEL_GAIN,         /* Velocity Control Axis Ref. Velocity Gain  */ /* 0139 */
   D_AMT_PC_AXIS_REF_VEL_GAIN,         /* Position Control Axis Ref. Velocity Gain  */ /* 0140 */

   /*
   ** ==========================================================================
   ** Torque Control options - parameter validation.
   ** ==========================================================================
   */
   D_AMT_TC_SINE_MIN_FREQ,             /* Torque Control - Sine Min. Freq.    */       /* 0141 */
   D_AMT_TC_SINE_MAX_FREQ,             /* Torque Control - Sine Max. Freq.    */       /* 0142 */
   D_AMT_TC_SINE_MIN_AMP,              /* Torque Control - Sine Min. Amp.     */       /* 0143 */
   D_AMT_TC_SINE_MAX_AMP,              /* Torque Control - Sine Max. Amp.     */       /* 0144 */
   D_AMT_TC_COSINE_MIN_FREQ,           /* Torque Control - Cosine Min. Freq.  */       /* 0145 */
   D_AMT_TC_COSINE_MAX_FREQ,           /* Torque Control - Cosine Max. Freq.  */       /* 0146 */
   D_AMT_TC_COSINE_MIN_AMP,            /* Torque Control - Cosine Min. Amp.   */       /* 0147 */
   D_AMT_TC_COSINE_MAX_AMP,            /* Torque Control - Cosine Max. Amp.   */       /* 0148 */
   D_AMT_TC_RAMP_MIN_FREQ,             /* Torque Control - Ramp Min. Freq.    */       /* 0149 */
   D_AMT_TC_RAMP_MAX_FREQ,             /* Torque Control - Ramp Max. Freq.    */       /* 0150 */
   D_AMT_TC_RAMP_MIN_AMP,              /* Torque Control - Ramp Min. Amp.     */       /* 0151 */
   D_AMT_TC_RAMP_MAX_AMP,              /* Torque Control - Ramp Max. Amp.     */       /* 0152 */
   D_AMT_TC_SQUARE_MIN_FREQ,           /* Torque Control - Square Min. Freq.  */       /* 0153 */
   D_AMT_TC_SQUARE_MAX_FREQ,           /* Torque Control - Square Max. Freq.  */       /* 0154 */
   D_AMT_TC_SQUARE_MIN_AMP,            /* Torque Control - Square Min. Amp.   */       /* 0155 */
   D_AMT_TC_SQUARE_MAX_AMP,            /* Torque Control - Square Max. Amp.   */       /* 0156 */
   D_AMT_TC_SLEW_MIN_FREQ,             /* Torque Control - Ramp Min. Freq.    */       /* 0157 */
   D_AMT_TC_SLEW_MAX_FREQ,             /* Torque Control - Ramp Max. Freq.    */       /* 0158 */
   D_AMT_TC_SLEW_MIN_AMP,              /* Torque Control - Ramp Min. Amp.     */       /* 0159 */
   D_AMT_TC_SLEW_MAX_AMP,              /* Torque Control - Ramp Max. Amp.     */       /* 0160 */

   /*
   ** ==========================================================================
   ** Velocity Control options - parameter validation.
   ** ==========================================================================
   */
   D_AMT_VC_SINE_MIN_FREQ,             /* Velocity Control - Sine Slew Freq.   */      /* 0171 */
   D_AMT_VC_SINE_MAX_FREQ,             /* Velocity Control - Sine Max. Freq.   */      /* 0172 */
   D_AMT_VC_SINE_MIN_AMP,              /* Velocity Control - Sine Min. Amp.    */      /* 0173 */
   D_AMT_VC_SINE_MAX_AMP,              /* Velocity Control - Sine Max. Amp.    */      /* 0174 */
   D_AMT_VC_COSINE_MIN_FREQ,           /* Velocity Control - Cosine Slew Freq. */      /* 0175 */
   D_AMT_VC_COSINE_MAX_FREQ,           /* Velocity Control - Cosine Max. Freq. */      /* 0176 */
   D_AMT_VC_COSINE_MIN_AMP,            /* Velocity Control - Cosine Min. Amp.  */      /* 0177 */
   D_AMT_VC_COSINE_MAX_AMP,            /* Velocity Control - Cosine Max. Amp.  */      /* 0178 */
   D_AMT_VC_RAMP_MIN_FREQ,             /* Velocity Control - Slew Slew Freq.   */      /* 0179 */
   D_AMT_VC_RAMP_MAX_FREQ,             /* Velocity Control - Slew Max. Freq.   */      /* 0180 */
   D_AMT_VC_RAMP_MIN_AMP,              /* Velocity Control - Slew Min. Amp.    */      /* 0181 */
   D_AMT_VC_RAMP_MAX_AMP,              /* Velocity Control - Slew Max. Amp.    */      /* 0182 */
   D_AMT_VC_SQUARE_MIN_FREQ,           /* Velocity Control - Square Slew Freq. */      /* 0183 */
   D_AMT_VC_SQUARE_MAX_FREQ,           /* Velocity Control - Square Max. Freq. */      /* 0184 */
   D_AMT_VC_SQUARE_MIN_AMP,            /* Velocity Control - Square Min. Amp.  */      /* 0185 */
   D_AMT_VC_SQUARE_MAX_AMP,            /* Velocity Control - Square Max. Amp.  */      /* 0186 */
   D_AMT_VC_SLEW_MIN_FREQ,             /* Velocity Control - Ramp Slew Freq.   */      /* 0187 */
   D_AMT_VC_SLEW_MAX_FREQ,             /* Velocity Control - Ramp Max. Freq.   */      /* 0188 */
   D_AMT_VC_SLEW_MIN_AMP,              /* Velocity Control - Ramp Min. Amp.    */      /* 0189 */
   D_AMT_VC_SLEW_MAX_AMP,              /* Velocity Control - Ramp Max. Amp.    */      /* 0190 */

   /*
   ** ==========================================================================
   ** Position Control options - parameter validation.
   ** ==========================================================================
   */
   D_AMT_PC_SINE_MIN_FREQ,             /* Position Control - Sine Slew Freq.   */      /* 0191 */
   D_AMT_PC_SINE_MAX_FREQ,             /* Position Control - Sine Max. Freq.   */      /* 0192 */
   D_AMT_PC_SINE_MIN_AMP,              /* Position Control - Sine Min. Amp.    */      /* 0193 */
   D_AMT_PC_SINE_MAX_AMP,              /* Position Control - Sine Max. Amp.    */      /* 0194 */
   D_AMT_PC_COSINE_MIN_FREQ,           /* Position Control - Cosine Slew Freq. */      /* 0195 */
   D_AMT_PC_COSINE_MAX_FREQ,           /* Position Control - Cosine Max. Freq. */      /* 0196 */
   D_AMT_PC_COSINE_MIN_AMP,            /* Position Control - Cosine Min. Amp.  */      /* 0197 */
   D_AMT_PC_COSINE_MAX_AMP,            /* Position Control - Cosine Max. Amp.  */      /* 0198 */
   D_AMT_PC_RAMP_MIN_FREQ,             /* Position Control - Slew Slew Freq.   */      /* 0199 */
   D_AMT_PC_RAMP_MAX_FREQ,             /* Position Control - Slew Max. Freq.   */      /* 0200 */
   D_AMT_PC_RAMP_MIN_AMP,              /* Position Control - Slew Min. Amp.    */      /* 0201 */
   D_AMT_PC_RAMP_MAX_AMP,              /* Position Control - Slew Max. Amp.    */      /* 0202 */
   D_AMT_PC_SQUARE_MIN_FREQ,           /* Position Control - Square Slew Freq. */      /* 0203 */
   D_AMT_PC_SQUARE_MAX_FREQ,           /* Position Control - Square Max. Freq. */      /* 0204 */
   D_AMT_PC_SQUARE_MIN_AMP,            /* Position Control - Square Min. Amp.  */      /* 0205 */
   D_AMT_PC_SQUARE_MAX_AMP,            /* Position Control - Square Max. Amp.  */      /* 0206 */
   D_AMT_PC_SLEW_MIN_FREQ,             /* Position Control - Ramp Slew Freq.   */      /* 0207 */
   D_AMT_PC_SLEW_MAX_FREQ,             /* Position Control - Ramp Max. Freq.   */      /* 0208 */
   D_AMT_PC_SLEW_MIN_AMP,              /* Position Control - Ramp Min. Amp.    */      /* 0209 */
   D_AMT_PC_SLEW_MAX_AMP,              /* Position Control - Ramp Max. Amp.    */      /* 0210 */

   /*
   ** =============================================================================
   ** Program Start and Finish Time parameters.
   ** =============================================================================
   */
   D_AMT_START_TIME,                   /* The starting time of the run            */   /* 0211 */
   D_AMT_START_TIME_DUMMY,             /* The starting time of the run            */   /* 0212 */
   D_AMT_FINISH_TIME,                  /* The finishing time of the run           */   /* 0213 */
   D_AMT_FINISH_TIME_DUMMY,            /* The finishing time of the run           */   /* 0214 */
   D_AMT_SERVO_CTRL_ALGORITHM_VER,     /* Servo algorithm version-number/ID       */   /* 0215 */

   D_AMT_DATAID_EOL                    /* End of list marker.                     */
   } eAmtDataId_t ;

#define I_AMT_MAXIMUM_FREQUENCY     20000        /* 20 Hz                     */
#define I_AMT_MINIMUM_FREQUENCY     1            /* 0.001 Hz                  */

/*
** =============================================================================
** End of Type Definitions:
** =============================================================================
*/

/*
** =============================================================================
** Start of Specific Definitions:
** =============================================================================
*/

/* Define this server's name-server name and the name of its executable. */
#define E_AMT_REG_SERVER_NAME   "E_TTL_AMT_Amt"
#define E_AMT_SERVER_PROC       "Amt"
#define E_AMT_SERVER_PATH       "//1/opt/ttl/bin/Amt"

/* Main task priority level: default = 10, must be < 30.   */
#define E_AMT_SERVER_PRI            29

/* Proxy priority level: default = 0, must be < 30.        */
#define I_AMT_PROXY_PRIORITY        29

#endif                                 /* _AMT_HEADER_INCLUDED                */

/*
** =============================================================================
** End of header:   Amt.h
** =============================================================================
*/
