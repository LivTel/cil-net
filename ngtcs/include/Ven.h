/*
**
** Module Name:
**     Ven.h
**
** Purpose:
**
** Description:
**    This file provides the public prototypes and definitions
**    for use with the virtual encoder package.
**
** Authors:
**   JDM:      J. D. Mills (TTL).
**
** Copyright (C) Telescope Technologies Limited (TTL).
**
** Version:
**   $Id: Ven.h,v 0.25 2002/07/30 06:18:03 djm Exp $
**
** History:
**   $Log: Ven.h,v $
**   Revision 0.25  2002/07/30 06:18:03  djm
**   Added new OIDs.
**
**   Revision 0.24  2002/04/19 13:05:27  djm
**   Altered the order of the OID list. Also renamed one of the
**   OIDs to better represent the quantity that it labels.
**
**   Revision 0.23  2002/04/09 10:48:15  djm
**   Added new coefficients ready for the implementation of the
**   encoder non-linearity model.
**
**   Revision 0.22  2002/04/04 10:04:09  djm
**   Changed OID name to avoid a clash elsewhere in the system.
**
**   Revision 0.21  2002/04/04 09:11:35  djm
**   Added a new OID (D_VEN_LOGGING_PERIOD), which controls
**   how often encoder data is logged to the normal message
**   logging path.
**
**   Revision 0.20  2002/03/26 12:25:11  djm
**   Added four new Datum Identifiers.
**
**   Revision 0.19  2002/03/05 16:37:31  djm
**   Added a new OID (D_VEN_EXPECTED_ENCODER_MASK) which allows
**   the encoders that are expected to be specified via, say, a
**   configuration file. This is useful for axes which do not
**   use four encoders (the default), such as elevation or
**   cassegrain.
**   Also added some new error codes.
**
**   Revision 0.18  2002/02/28 13:58:17  djm
**   Added new OIDs for signal status changes and the tolerance
**   and difference between linear and absolute encoders.
**
**   Revision 0.17  2002/01/23 17:35:56  djm
**   Added new OIDs for encoder signal amplitude and frequency
**   excess detection.
**
**   Revision 0.16  2001/08/20 10:34:38  mjf
**   Addition of enum name to homing direction.
**
**   Revision 0.15  2001/04/04 18:26:56  jdm
**   StartWrap functions removed.
**
**   Revision 0.14  2001/03/27 11:01:53  jdm
**   Axis Abs_pos_dummy OIDs removed.
**
**   Revision 0.13  2001/03/26 20:02:11  jdm
**   Limit positions added to VEN. Number_of_heads removed,
**   Min and Max diff counts added and negative feedback
**   flags for motor and axis added.
**
**   Revision 0.12  2001/03/06 13:46:45  jdm
**   Axis counts per rev and Motor counts
**   per rev OIDs added.
**
**   Revision 0.11  2001/03/06 11:21:09  jdm
**   New error codes added and line endings converted.
**
**   Revision 0.10  2001/02/15 14:15:00  jdm
**   ABS_ENCODER_OFFSET removed.
**
**   Revision 0.9  2001/02/06 11:42:58  jdm
**   Extra error codes added for Combination function.
**   Encoder mask OID added.
**
**   Revision 0.8  2001/02/01 17:06:14  jdm
**   E_VEN_SERVER_PRI definition added.
**
**   Revision 0.7  2001/02/01 14:25:29  jdm
**   OIDS added for motor positions (in m.a.s.), and
**   overall axis position.
**
**   Revision 0.6  2000/12/12 20:15:56  jdm
**   Added Wrap snapshotting OIDs.
**
**   Revision 0.5  2000/12/11 14:35:52  jdm
**   Wrap value OID added.
**
**   Revision 0.4  2000/12/07 19:07:55  jdm
**   HomingDirection_t made public.
**
**   Revision 0.3  2000/12/07 18:34:00  jdm
**   OIDs added for homing direction.
**
**   Revision 0.2  2000/12/06 09:38:59  jdm
**   Form-feeds removed.
**
**   Revision 0.1  2000/12/06 08:25:40  jdm
**   Initial creation.
**
**
*/

#ifndef _VEN_HEADER_INCLUDED
#define _VEN_HEADER_INCLUDED

/*
** =============================================================================
** Start of include files:
** =============================================================================
*/

#include "TtlSystem.h"     /* Include the package definitions. */

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

/* Enumerate this package's error codes. */
typedef enum{
   E_VEN_CARD_NOT_INITIALISED = STATUS_START(VEN),
   E_VEN_MESSAGE_NOT_RECOGNISED,
   E_VEN_OID_TABLE_INIT_FAILURE,
   E_VEN_FAILED_TO_CONFIGURE_INTERRUPT_PROXY,
   E_VEN_FAILED_TO_CONFIGURE_ENCODER_CARDS,
   E_VEN_UNABLE_TO_READ_ENCODER_COUNTS,
   E_VEN_UNABLE_TO_STORE_ENCODER_COUNTS,
   E_VEN_FAILED_TO_CONFIGURE_REFRESH_TIMER,
   E_VEN_FAILED_TO_SEND_MESSAGE_TO_END_CLIENT,
   E_VEN_UNABLE_TO_ACCESS_ABSOLUTE_ENCODER,
   E_VEN_UNABLE_TO_DETERMINE_HOMING_DIRECTION,
   E_VEN_ABS_LIN_MISMATCH,     /* Abs/Lin enc values do not correspond. 0x0C. */
   E_VEN_BAD_ABS_ENCODER,      /* Invalid status or value from absolute enc. 0x0D. */
   E_VEN_TOO_MANY_LIN_ENCODER, /* More encoders available than expected. 0x0E. */
   E_VEN_BAD_LIN_ENCODER,      /* Crucial linear encoders have bad status. 0x0F. */
   E_VEN_NO_LIN_ENCODER,       /* No linear encoders available. 0x10. */
   E_VEN_FAILED_TO_READ_CONFIG_FILE,
   E_VEN_FAILED_TO_SET_OID_NAME_TO_VALUE,
   E_VEN_FAILED_TO_ENABLE_CORRECTION_DET,
   E_VEN_FAILED_TO_DISABLE_CORRECTION_DET,
   E_VEN_ENC_DOES_NOT_EXIST,   /* Encoder not present or expected */
   E_VEN_FAILED_SDB_SUBMISSION,/* Failed to submit data to SDB (via REP) */

   E_VEN_SOFTWARE_ERROR = STATUS_START(VEN) + 0xFFFF
}eVenClientStatus_t;

/* Enumerate the OID's owned by this package. */
typedef enum eVenDataId_e{
   D_VEN_DATAID_BOL = OID_START(VEN),  /* Offset the OID's by the package ID. */ /* 0000 */
   D_VEN_PROC_STATE,                   /* The VEN process state. */              /* 0001 */
   D_VEN_APP_VERSION,                  /* VEN package revision. */               /* 0002 */
   D_VEN_SERVER_SHUTDOWN,              /* Server shutdown command flag. */       /* 0003 */

   D_VEN_MOTOR_ENC_1_COUNT,            /* Motor 1 encoder raw count. */          /* 0004 */
   D_VEN_MOTOR_ENC_1_COUNT_DUMMY,      /* Motor 1 encoder dummy upper word. */   /* 0005 */
   D_VEN_MOTOR_ENC_1_STATE,            /* Motor 1 encoder state. */              /* 0006 */
   D_VEN_MOTOR_ENC_2_COUNT,            /* Motor 2 encoder raw count. */          /* 0007 */
   D_VEN_MOTOR_ENC_2_COUNT_DUMMY,      /* Motor 2 encoder dummy upper word. */   /* 0008 */
   D_VEN_MOTOR_ENC_2_STATE,            /* Motor 2 encoder state. */              /* 0009 */
   D_VEN_MOTOR_ENC_1_ABS_POS,          /* Motor encoder 1 absolute position. */  /* 000A */
   D_VEN_MOTOR_ENC_1_ABS_POS_DUMMY,    /* Motor encoder 1 absolute pos. MSWord.*//* 000B */
   D_VEN_MOTOR_ENC_2_ABS_POS,          /* Motor encoder 2 absolute position. */  /* 000C */
   D_VEN_MOTOR_ENC_2_ABS_POS_DUMMY,    /* Motor encoder 2 absolute pos. MSWord.*//* 000D */
   D_VEN_AXIS_ENC_1_COUNT,             /* Axis encoder 1 raw count. */           /* 000E */
   D_VEN_AXIS_ENC_1_COUNT_DUMMY,       /* Axis encoder 1 dummy upper word. */    /* 000F */
   D_VEN_AXIS_ENC_1_STATE,             /* Axis encoder 1 state. */               /* 0010 */
   D_VEN_AXIS_ENC_1_REF_STATE,         /* Axis encoder 1 reference state. */     /* 0011 */
   D_VEN_AXIS_ENC_2_COUNT,             /* Axis encoder 2 raw count. */           /* 0012 */
   D_VEN_AXIS_ENC_2_COUNT_DUMMY,       /* Axis encoder 2 dummy upper word. */    /* 0013 */
   D_VEN_AXIS_ENC_2_STATE,             /* Axis encoder 2 state. */               /* 0014 */
   D_VEN_AXIS_ENC_2_REF_STATE,         /* Axis encoder 2 reference state. */     /* 0015 */
   D_VEN_AXIS_ENC_3_COUNT,             /* Axis encoder 3 raw count. */           /* 0016 */
   D_VEN_AXIS_ENC_3_COUNT_DUMMY,       /* Axis encoder 3 dummy upper word. */    /* 0017 */
   D_VEN_AXIS_ENC_3_STATE,             /* Axis encoder 3 state. */               /* 0018 */
   D_VEN_AXIS_ENC_3_REF_STATE,         /* Axis encoder 3 reference state. */     /* 0019 */
   D_VEN_AXIS_ENC_4_COUNT,             /* Axis encoder 4 raw count. */           /* 001A */
   D_VEN_AXIS_ENC_4_COUNT_DUMMY,       /* Axis encoder 4 dummy upper word. */    /* 001B */
   D_VEN_AXIS_ENC_4_STATE,             /* Axis encoder 4 state. */               /* 001C */
   D_VEN_AXIS_ENC_4_REF_STATE,         /* Axis encoder 4 reference state. */     /* 001D */
   D_VEN_AXIS_ENC_1_OFFSET,            /* Axis encoder 1 counter offset. */      /* 001E */
   D_VEN_AXIS_ENC_1_OFFSET_DUMMY,      /* Axis encoder 1 offset dummy word. */   /* 001F */
   D_VEN_AXIS_ENC_2_OFFSET,            /* Axis encoder 2 counter offset. */      /* 0020 */
   D_VEN_AXIS_ENC_2_OFFSET_DUMMY,      /* Axis encoder 2 offset dummy word. */   /* 0021 */
   D_VEN_AXIS_ENC_3_OFFSET,            /* Axis encoder 3 counter offset. */      /* 0022 */
   D_VEN_AXIS_ENC_3_OFFSET_DUMMY,      /* Axis encoder 3 offset dummy word. */   /* 0023 */
   D_VEN_AXIS_ENC_4_OFFSET,            /* Axis encoder 4 counter offset. */      /* 0024 */
   D_VEN_AXIS_ENC_4_OFFSET_DUMMY,      /* Axis encoder 4 offset dummy word. */   /* 0025 */
   D_VEN_AXIS_ENC_1_ABS_POSITION,      /* Axis encoder 1 absolute position. */   /* 0026 */
   D_VEN_AXIS_ENC_2_ABS_POSITION,      /* Axis encoder 2 absolute position. */   /* 0027 */
   D_VEN_AXIS_ENC_3_ABS_POSITION,      /* Axis encoder 3 absolute position. */   /* 0028 */
   D_VEN_AXIS_ENC_4_ABS_POSITION,      /* Axis encoder 4 absolute position. */   /* 0029 */
   D_VEN_AXIS_POSITION,                /* Our final measurement of axis pos. */  /* 002A */
   D_VEN_AXIS_POSITION_DUMMY,          /* Final axis pos. measurment MSWord. */  /* 002B */
   D_VEN_HOME_AXIS_ENCODER_1,          /* Start axis encoder 1 homing. */        /* 002C */
   D_VEN_HOME_AXIS_ENCODER_2,          /* Start axis encoder 2 homing. */        /* 002D */
   D_VEN_HOME_AXIS_ENCODER_3,          /* Start axis encoder 3 homing. */        /* 002E */
   D_VEN_HOME_AXIS_ENCODER_4,          /* Start axis encoder 4 homing. */        /* 002F */
   D_VEN_ABS_ENCODER_POSITION,         /* Absolute encoder position. */          /* 0030 */
   D_VEN_ABS_ENCODER_STATUS,           /* Absolute encoder status. */            /* 0031 */
   D_VEN_JOIN_POSITION,                /* Join position */                       /* 0032 */
   D_VEN_HOMING_DIRECTION,             /* Direction to home the axis. */         /* 0033 */
   D_VEN_HEAD_1_POSITION,              /* Head 1 position w.r.t. abs-enc zero. *//* 0034 */
   D_VEN_HEAD_2_POSITION,              /* Head 2 position w.r.t. abs-enc zero. *//* 0035 */
   D_VEN_HEAD_3_POSITION,              /* Head 3 position w.r.t. abs-enc zero. *//* 0036 */
   D_VEN_HEAD_4_POSITION,              /* Head 4 position w.r.t. abs-enc zero. *//* 0037 */
   D_VEN_USED_ENCODER_MASK,            /* Mask showing which encoders are used.*//* 0038 */
   D_VEN_AXIS_COUNTS_PER_REV,          /* No. of axis encoder counts per rev.*/  /* 0039 */
   D_VEN_MOTOR_COUNTS_PER_REV,         /* No. of motor encoder counts per rev.*/ /* 003A */
   D_VEN_MIN_TAPE_DIFF_COUNT,          /* Minimum tape difference count value. *//* 003B */
   D_VEN_MAX_TAPE_DIFF_COUNT,          /* Maximum tape difference count value. *//* 003C */
   D_VEN_AXIS_ENCODER_NEG_FEEDBACK,    /* Enable inversion of axis feedback. */  /* 003D */
   D_VEN_MOTOR_ENCODER_NEG_FEEDBACK,   /* Enable inversion of motor feedback. */ /* 003E */
   D_VEN_CLOCKWISE_L1_LIMIT_POSITION,  /* Clockwise L1 limit position. */        /* 003F */
   D_VEN_ANTI_CW_L1_LIMIT_POSITION,    /* Anti-clockwise L1 limit position. */   /* 0040 */
   D_VEN_AXIS_ENC_1_MIN_AMPL_STATUS,   /* Head 1 min. signal amplitude status */ /* 0041 */
   D_VEN_AXIS_ENC_1_MAX_AMPL_STATUS,   /* Head 1 max. signal amplitude status */ /* 0042 */
   D_VEN_AXIS_ENC_1_CUR_AMPL_STATUS,   /* Head 1 cur. signal amplitude status */ /* 0043 */
   D_VEN_AXIS_ENC_1_FREQ_EXCEEDED,     /* Head 1 signal frequency exceeded */    /* 0044 */
   D_VEN_AXIS_ENC_2_MIN_AMPL_STATUS,   /* Head 2 min. signal amplitude status */ /* 0045 */
   D_VEN_AXIS_ENC_2_MAX_AMPL_STATUS,   /* Head 2 max. signal amplitude status */ /* 0046 */
   D_VEN_AXIS_ENC_2_CUR_AMPL_STATUS,   /* Head 2 cur. signal amplitude status */ /* 0047 */
   D_VEN_AXIS_ENC_2_FREQ_EXCEEDED,     /* Head 2 signal frequency exceeded */    /* 0048 */
   D_VEN_AXIS_ENC_3_MIN_AMPL_STATUS,   /* Head 3 min. signal amplitude status */ /* 0049 */
   D_VEN_AXIS_ENC_3_MAX_AMPL_STATUS,   /* Head 3 max. signal amplitude status */ /* 004a */
   D_VEN_AXIS_ENC_3_CUR_AMPL_STATUS,   /* Head 3 cur. signal amplitude status */ /* 004b */
   D_VEN_AXIS_ENC_3_FREQ_EXCEEDED,     /* Head 3 signal frequency exceeded */    /* 004c */
   D_VEN_AXIS_ENC_4_MIN_AMPL_STATUS,   /* Head 4 min. signal amplitude status */ /* 004d */
   D_VEN_AXIS_ENC_4_MAX_AMPL_STATUS,   /* Head 4 max. signal amplitude status */ /* 004e */
   D_VEN_AXIS_ENC_4_CUR_AMPL_STATUS,   /* Head 4 cur. signal amplitude status */ /* 004f */
   D_VEN_AXIS_ENC_4_FREQ_EXCEEDED,     /* Head 4 signal frequency exceeded */    /* 0050 */
   D_VEN_AXIS_ENC_1_MIN_AMPL_CHANGE,   /* Head 1 min.sig.ampl. status changes */ /* 0051 */
   D_VEN_AXIS_ENC_1_MAX_AMPL_CHANGE,   /* Head 1 max.sig.ampl. status changes */ /* 0052 */
   D_VEN_AXIS_ENC_1_CUR_AMPL_CHANGE,   /* Head 1 cur.sig.ampl. status changes */ /* 0053 */
   D_VEN_AXIS_ENC_2_MIN_AMPL_CHANGE,   /* Head 2 min.sig.ampl. status changes */ /* 0054 */
   D_VEN_AXIS_ENC_2_MAX_AMPL_CHANGE,   /* Head 2 max.sig.ampl. status changes */ /* 0055 */
   D_VEN_AXIS_ENC_2_CUR_AMPL_CHANGE,   /* Head 2 cur.sig.ampl. status changes */ /* 0056 */
   D_VEN_AXIS_ENC_3_MIN_AMPL_CHANGE,   /* Head 3 min.sig.ampl. status changes */ /* 0057 */
   D_VEN_AXIS_ENC_3_MAX_AMPL_CHANGE,   /* Head 3 max.sig.ampl. status changes */ /* 0058 */
   D_VEN_AXIS_ENC_3_CUR_AMPL_CHANGE,   /* Head 3 cur.sig.ampl. status changes */ /* 0059 */
   D_VEN_AXIS_ENC_4_MIN_AMPL_CHANGE,   /* Head 4 min.sig.ampl. status changes */ /* 005a */
   D_VEN_AXIS_ENC_4_MAX_AMPL_CHANGE,   /* Head 4 max.sig.ampl. status changes */ /* 005b */
   D_VEN_AXIS_ENC_4_CUR_AMPL_CHANGE,   /* Head 4 cur.sig.ampl. status changes */ /* 005c */
   D_VEN_ABS_LIN_ENC_TOLERANCE,        /* Max.allowed deviation between encs. */ /* 005d */
   D_VEN_ABS_LIN_ENC_DEVIATION,        /* Max.deviation between lin/abs encs. */ /* 005e */
   D_VEN_EXPECTED_ENCODER_MASK,        /* Number of encoders installed */        /* 005f */
   D_VEN_AXIS_ENC_1_STATUS_BITS,       /* Status bits from HHE encoder head 1 */ /* 0060 */
   D_VEN_AXIS_ENC_2_STATUS_BITS,       /* Status bits from HHE encoder head 2 */ /* 0061 */
   D_VEN_AXIS_ENC_3_STATUS_BITS,       /* Status bits from HHE encoder head 3 */ /* 0062 */
   D_VEN_AXIS_ENC_4_STATUS_BITS,       /* Status bits from HHE encoder head 4 */ /* 0063 */
   D_VEN_ENC_LOGGING_PERIOD,           /* No.cycles at which enc.vals logged */  /* 0064 */

   D_VEN_ENL_ENABLE_CORRECTION,        /* Enable enc.non-linearity correct'ns */ /* 0065 */
   D_VEN_ENL_ENC_1_OFFSET,             /* Offset between enc. and axis pos'ns */ /* 0066 */
   D_VEN_ENL_ENC_2_OFFSET,             /* Offset between enc. and axis pos'ns */ /* 0067 */
   D_VEN_ENL_ENC_3_OFFSET,             /* Offset between enc. and axis pos'ns */ /* 0068 */
   D_VEN_ENL_ENC_4_OFFSET,             /* Offset between enc. and axis pos'ns */ /* 0069 */
   D_VEN_ENL_MODEL_OFFSET,             /* Offset of the enc.non-linearity Fn. */ /* 006A */
   D_VEN_ENL_COS_1_COEFFICIENT,        /* Enc.NonLin Fn. cosine coefficient 1 */ /* 006B */
   D_VEN_ENL_SIN_1_COEFFICIENT,        /* Enc.NonLin Fn. sine coefficient 1 */   /* 006C */
   D_VEN_ENL_COS_2_COEFFICIENT,        /* Enc.NonLin Fn. cosine coefficient 2 */ /* 006D */
   D_VEN_ENL_SIN_2_COEFFICIENT,        /* Enc.NonLin Fn. sine coefficient 2 */   /* 006E */
   D_VEN_ENL_COS_3_COEFFICIENT,        /* Enc.NonLin Fn. cosine coefficient 3 */ /* 006F */
   D_VEN_ENL_SIN_3_COEFFICIENT,        /* Enc.NonLin Fn. sine coefficient 3 */   /* 0070 */
   D_VEN_ENL_COS_4_COEFFICIENT,        /* Enc.NonLin Fn. cosine coefficient 4 */ /* 0071*/
   D_VEN_ENL_SIN_4_COEFFICIENT,        /* Enc.NonLin Fn. sine coefficient 4 */   /* 0072 */
   D_VEN_ENL_COS_5_COEFFICIENT,        /* Enc.NonLin Fn. cosine coefficient 5 */ /* 0073 */
   D_VEN_ENL_SIN_5_COEFFICIENT,        /* Enc.NonLin Fn. sine coefficient 5 */   /* 0074 */
   D_VEN_ENL_COS_6_COEFFICIENT,        /* Enc.NonLin Fn. cosine coefficient 6 */ /* 0075 */
   D_VEN_ENL_SIN_6_COEFFICIENT,        /* Enc.NonLin Fn. sine coefficient 6 */   /* 0076 */
   D_VEN_ENL_COS_7_COEFFICIENT,        /* Enc.NonLin Fn. cosine coefficient 7 */ /* 0077 */
   D_VEN_ENL_SIN_7_COEFFICIENT,        /* Enc.NonLin Fn. sine coefficient 7 */   /* 0078 */
   D_VEN_ENL_COS_8_COEFFICIENT,        /* Enc.NonLin Fn. cosine coefficient 8 */ /* 0079 */
   D_VEN_ENL_SIN_8_COEFFICIENT,        /* Enc.NonLin Fn. sine coefficient 8 */   /* 007A */
   D_VEN_ENL_COS_9_COEFFICIENT,        /* Enc.NonLin Fn. cosine coefficient 9 */ /* 007B */
   D_VEN_ENL_SIN_9_COEFFICIENT,        /* Enc.NonLin Fn. sine coefficient 9 */   /* 007C */
   D_VEN_ENL_COS_10_COEFFICIENT,       /* Enc.NonLin Fn. cosine coefficient 10 *//* 007D */
   D_VEN_ENL_SIN_10_COEFFICIENT,       /* Enc.NonLin Fn. sine coefficient 10 */  /* 007E */
   D_VEN_ENL_COS_11_COEFFICIENT,       /* Enc.NonLin Fn. cosine coefficient 11 *//* 007F */
   D_VEN_ENL_SIN_11_COEFFICIENT,       /* Enc.NonLin Fn. sine coefficient 11 */  /* 0080 */
   D_VEN_ENL_COS_12_COEFFICIENT,       /* Enc.NonLin Fn. cosine coefficient 12 *//* 0081 */
   D_VEN_ENL_SIN_12_COEFFICIENT,       /* Enc.NonLin Fn. sine coefficient 12 */  /* 0082 */

   D_VEN_AXIS_HOME_ATTRACT_POSITION,   /* Axis pos'n towards which to home */    /* 0083 */
   D_VEN_AXIS_HOME_REPULSE_POSITION,   /* Axis pos'n away from which to home */  /* 0084 */

   D_VEN_DATAID_EOL                    /* End of list marker */

}  eVenDataId_t;

/* Enumerate the values of HomingDirection */
typedef  enum eVenDirection_e {
   E_VEN_HOMING_DIRECTION_INVALID,
   E_VEN_HOMING_CLOCKWISE,
   E_VEN_HOMING_ANTI_CLOCKWISE
}  eVenDirection_t;

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

/* Define this server's name-server name and the name of its executeable. */
#define E_VEN_REG_SERVER_NAME "E_TTL_VEN_Ven"
#define E_VEN_SERVER_PROC     "Ven"
#define E_VEN_SERVER_PATH     "//1/opt/ttl/bin/Ven"
#define E_VEN_SERVER_PRI      10

#endif   /* _VEN_HEADER_INCLUDED */

/*
** =============================================================================
** End of header: Ven.h
** =============================================================================
*/
