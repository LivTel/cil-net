package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type AMT_DataType.  These are:
 * <ul>
 * <li>D_AMT_DATAID_BOL</li>
 * <li>D_AMT_PROC_STATE</li>
 * <li>D_AMT_APP_VERSION</li>
 * <li>D_AMT_TFP_SIMULATE</li>
 * <li>D_AMT_HHE_SIMULATE</li>
 * <li>D_AMT_MFC_SIMULATE</li>
 * <li>D_AMT_TELESCOPE_ID</li>
 * <li>D_AMT_AXIS_ID</li>
 * <li>D_AMT_AZM_NODE_ID</li>
 * <li>D_AMT_ALT_NODE_ID</li>
 * <li>D_AMT_CAS_NODE_ID</li>
 * <li>D_AMT_AZM_AET_PRESENT</li>
 * <li>D_AMT_ALT_AET_PRESENT</li>
 * <li>D_AMT_CAS_AET_PRESENT</li>
 * <li>D_AMT_AZM_AXIS_POSN_START</li>
 * <li>D_AMT_AZM_AXIS_POSN_FINISH</li>
 * <li>D_AMT_ALT_AXIS_POSN_START</li>
 * <li>D_AMT_ALT_AXIS_POSN_FINISH</li>
 * <li>D_AMT_CAS_AXIS_POSN_START</li>
 * <li>D_AMT_CAS_AXIS_POSN_FINISH</li>
 * <li>D_AMT_EXTENDED_RUN</li>
 * <li>D_AMT_EXTENDED_RUN_PERIOD</li>
 * <li>D_AMT_WATCHDOG_SETUP_PERIOD</li>
 * <li>D_AMT_CONTROL_ALGORITHM</li>
 * <li>D_AMT_CONTROL_MODE</li>
 * <li>D_AMT_EXCITATION_SIGNAL</li>
 * <li>D_AMT_EXCITATION_FREQUENCY</li>
 * <li>D_AMT_EXCITATION_AMPLITUDE</li>
 * <li>D_AMT_RAMP_NUMBER</li>
 * <li>D_AMT_CONTROL_ENCODER_NUM</li>
 * <li>D_AMT_OFF_MOUNT_TESTING</li>
 * <li>D_AMT_AMT_SPECIFIC_HNF_CFG</li>
 * <li>D_AMT_FUNC_DISP_PRELOAD</li>
 * <li>D_AMT_FUNC_DISP_RUNLOG</li>
 * <li>D_AMT_FUNC_DISP_FILEOP</li>
 * <li>D_AMT_ABS_ENC_DISP</li>
 * <li>D_AMT_MAX_VEL_RAMP_1</li>
 * <li>D_AMT_MAX_VEL_RAMP_2</li>
 * <li>D_AMT_MAX_VEL_RAMP_3</li>
 * <li>D_AMT_MAX_VEL_RAMP_4</li>
 * <li>D_AMT_MAX_VEL_RAMP_5</li>
 * <li>D_AMT_MAX_VEL_RAMP_6</li>
 * <li>D_AMT_MAX_ACCN_RAMP_1</li>
 * <li>D_AMT_MAX_ACCN_RAMP_2</li>
 * <li>D_AMT_MAX_ACCN_RAMP_3</li>
 * <li>D_AMT_MAX_ACCN_RAMP_4</li>
 * <li>D_AMT_MAX_ACCN_RAMP_5</li>
 * <li>D_AMT_MAX_ACCN_RAMP_6</li>
 * <li>D_AMT_MAX_RAMP_NUMBER</li>
 * <li>D_AMT_ENABLE_DRIVE_1</li>
 * <li>0049</li>
 * <li>D_AMT_ENABLE_DRIVE_2</li>
 * <li>D_AMT_RELEASE_BRAKE_1</li>
 * <li>D_AMT_RELEASE_BRAKE_2</li>
 * <li>D_AMT_MAX_MOTOR_TORQUE</li>
 * <li>D_AMT_TORQUE_CLAMP_LIMIT_LOW</li>
 * <li>D_AMT_MOTOR_PRELOAD_REQUIRED</li>
 * <li>D_AMT_PRELOAD_STG_1</li>
 * <li>D_AMT_PRELOAD_STG_2</li>
 * <li>D_AMT_NUM_OF_CYCLES_PRELOAD_STG_1</li>
 * <li>D_AMT_NUM_OF_CYCLES_PRELOAD_STG_2</li>
 * <li>D_AMT_STG1_TO_STG2_INTERVAL</li>
 * <li>D_AMT_NUM_COUNTS_TO_APPLY_PLOAD</li>
 * <li>D_AMT_PRELOAD_PAUSE_COUNT</li>
 * <li>D_AMT_TERM_ZERO_PRELOAD</li>
 * <li>D_AMT_STICTION_TORQUE_OFFSET</li>
 * <li>D_AMT_PID_P1_GAIN_X1E9</li>
 * <li>0065</li>
 * <li>D_AMT_PID_P2_GAIN_X1E9</li>
 * <li>0066</li>
 * <li>D_AMT_PID_K1_GAIN_X1E9</li>
 * <li>0067</li>
 * <li>D_AMT_HNF_P2_GAIN_X1E9</li>
 * <li>D_AMT_AXIS_VELOCITY_GAIN_X1E9</li>
 * <li>D_AMT_PIDVEL_FEEDBACK_FRACTION</li>
 * <li>D_AMT_HNFVEL_FEEDBACK_FRACTION</li>
 * <li>D_AMT_SWEPT_SINE_MODE</li>
 * <li>D_AMT_SWEPT_SINE_NUMBER</li>
 * <li>D_AMT_SWEPT_SINE_AMPLITUDE</li>
 * <li>D_AMT_DATA_FILE_FULL_HEADER</li>
 * <li>D_AMT_HNF_ALGOL_HEADER</li>
 * <li>D_AMT_MAX_LOGGING_PERIOD</li>
 * <li>D_AMT_LOGGING_PERIOD</li>
 * <li>D_AMT_RAMP_LOGGING_PERIOD</li>
 * <li>D_AMT_RAMP_MOTION_PERIOD</li>
 * <li>D_AMT_SWEPT_SINE_LOGGING_PERIOD</li>
 * <li>D_AMT_BRAKE_RELEASE_WAIT_COUNT</li>
 * <li>D_AMT_BRAKE_PREAPPLY_WAIT_COUNT</li>
 * <li>D_AMT_BRAKE_APPLY_WAIT_COUNT</li>
 * <li>D_AMT_NUM_OF_CYCLES_TO_LOG</li>
 * <li>D_AMT_NUM_OF_CYCLES_TO_RUN</li>
 * <li>D_AMT_MOTOR_FILTER_ENABLE</li>
 * <li>D_AMT_OUTPUT_FILTER_DENOMINATOR</li>
 * <li>D_AMT_OUTPUT_FILTER_C0_COEFFICIENT</li>
 * <li>D_AMT_OUTPUT_FILTER_D1_COEFFICIENT</li>
 * <li>D_AMT_HINF_FILTER_ENABLE</li>
 * <li>D_AMT_HINF_OUTPUTN0_FRACTION</li>
 * <li>D_AMT_HINF_OUTPUTN1_FRACTION</li>
 * <li>D_AMT_HINF_OUTPUTN2_FRACTION</li>
 * <li>D_AMT_HINF_OUTPUTN3_FRACTION</li>
 * <li>D_AMT_MIN_DAC_VALUE</li>
 * <li>D_AMT_MAX_DAC_VALUE</li>
 * <li>D_AMT_FULL_SCALE_DAC_VALUE</li>
 * <li>D_AMT_ZERO_OFFSET_DAC_VALUE</li>
 * <li>D_AMT_MOTOR_VEL_GAIN_FACTOR</li>
 * <li>D_AMT_AXIS_VEL_GAIN_FACTOR</li>
 * <li>D_AMT_PID_GAIN_SCALE_FACTOR</li>
 * <li>D_AMT_AXIS_MOTOR_GAIN</li>
 * <li>D_AMT_AXIS_AMPLIFIER_GAIN</li>
 * <li>D_AMT_MOTOR_GAIN_SCALE</li>
 * <li>D_AMT_AMPLIFIER_GAIN_SCALE</li>
 * <li>D_AMT_VOLTAGE_GAIN_SCALE</li>
 * <li>D_AMT_MAX_NUMBER_ENCODER_CARDS</li>
 * <li>D_AMT_MAX_NUMBER_MOTOR_ENCODERS</li>
 * <li>D_AMT_MAX_NUMBER_TAPE_ENCODERS</li>
 * <li>0110</li>
 * <li>D_AMT_MAX_NUMBER_LENGTH_ENCODERS</li>
 * <li>D_AMT_ENCODER_INTERPOLATION_BITS</li>
 * <li>D_AMT_ENCODER_PULSES_PER_AXIS_REV</li>
 * <li>D_AMT_ENCODER_PULSES_PER_MOTOR_REV</li>
 * <li>D_AMT_ENABLE_TAPE_ENCODERS</li>
 * <li>D_AMT_ENABLE_LENGTH_ENCODERS</li>
 * <li>D_AMT_MOTOR_ENCODERS_DIRECTION</li>
 * <li>D_AMT_TAPE_ENCODERS_DIRECTION</li>
 * <li>0118</li>
 * <li>D_AMT_LENGTH_ENCODERS_DIRECTION</li>
 * <li>0119</li>
 * <li>D_AMT_MOTOR_FEEDBACK</li>
 * <li>D_AMT_AXIS_FEEDBACK</li>
 * <li>D_AMT_DATA_COLLECTION_RATE</li>
 * <li>D_AMT_ABS_ENC_READ_RATE</li>
 * <li>D_AMT_CONTROLLER_DELAY</li>
 * <li>D_AMT_TOGGLE_HARDWARE_PULSE</li>
 * <li>D_AMT_HARDWARE_PULSE_RATE</li>
 * <li>D_AMT_TFP_SERVER_PID</li>
 * <li>D_AMT_AZM_ABS_ENC_PID</li>
 * <li>D_AMT_ALT_ABS_ENC_PID</li>
 * <li>D_AMT_CAS_ABS_ENC_PID</li>
 * <li>D_AMT_WATCHDOG_PID</li>
 * <li>D_AMT_DUMMY_OID_01</li>
 * <li>D_AMT_DUMMY_OID_02</li>
 * <li>D_AMT_DUMMY_OID_03</li>
 * <li>0134</li>
 * <li>D_AMT_STICTION_COMP_TOLERANCE</li>
 * <li>D_AMT_STICTION_COMP_POSITIVE</li>
 * <li>D_AMT_STICTION_COMP_NEGATIVE</li>
 * <li>D_AMT_TC_AXIS_REF_VEL_GAIN</li>
 * <li>D_AMT_VC_AXIS_REF_VEL_GAIN</li>
 * <li>D_AMT_PC_AXIS_REF_VEL_GAIN</li>
 * <li>D_AMT_TC_SINE_MIN_FREQ</li>
 * <li>D_AMT_TC_SINE_MAX_FREQ</li>
 * <li>D_AMT_TC_SINE_MIN_AMP</li>
 * <li>D_AMT_TC_SINE_MAX_AMP</li>
 * <li>D_AMT_TC_COSINE_MIN_FREQ</li>
 * <li>D_AMT_TC_COSINE_MAX_FREQ</li>
 * <li>D_AMT_TC_COSINE_MIN_AMP</li>
 * <li>D_AMT_TC_COSINE_MAX_AMP</li>
 * <li>D_AMT_TC_RAMP_MIN_FREQ</li>
 * <li>D_AMT_TC_RAMP_MAX_FREQ</li>
 * <li>D_AMT_TC_RAMP_MIN_AMP</li>
 * <li>D_AMT_TC_RAMP_MAX_AMP</li>
 * <li>D_AMT_TC_SQUARE_MIN_FREQ</li>
 * <li>D_AMT_TC_SQUARE_MAX_FREQ</li>
 * <li>D_AMT_TC_SQUARE_MIN_AMP</li>
 * <li>D_AMT_TC_SQUARE_MAX_AMP</li>
 * <li>D_AMT_TC_SLEW_MIN_FREQ</li>
 * <li>D_AMT_TC_SLEW_MAX_FREQ</li>
 * <li>D_AMT_TC_SLEW_MIN_AMP</li>
 * <li>D_AMT_TC_SLEW_MAX_AMP</li>
 * <li>D_AMT_VC_SINE_MIN_FREQ</li>
 * <li>D_AMT_VC_SINE_MAX_FREQ</li>
 * <li>D_AMT_VC_SINE_MIN_AMP</li>
 * <li>D_AMT_VC_SINE_MAX_AMP</li>
 * <li>D_AMT_VC_COSINE_MIN_FREQ</li>
 * <li>D_AMT_VC_COSINE_MAX_FREQ</li>
 * <li>D_AMT_VC_COSINE_MIN_AMP</li>
 * <li>D_AMT_VC_COSINE_MAX_AMP</li>
 * <li>D_AMT_VC_RAMP_MIN_FREQ</li>
 * <li>D_AMT_VC_RAMP_MAX_FREQ</li>
 * <li>D_AMT_VC_RAMP_MIN_AMP</li>
 * <li>D_AMT_VC_RAMP_MAX_AMP</li>
 * <li>D_AMT_VC_SQUARE_MIN_FREQ</li>
 * <li>D_AMT_VC_SQUARE_MAX_FREQ</li>
 * <li>D_AMT_VC_SQUARE_MIN_AMP</li>
 * <li>D_AMT_VC_SQUARE_MAX_AMP</li>
 * <li>D_AMT_VC_SLEW_MIN_FREQ</li>
 * <li>D_AMT_VC_SLEW_MAX_FREQ</li>
 * <li>D_AMT_VC_SLEW_MIN_AMP</li>
 * <li>D_AMT_VC_SLEW_MAX_AMP</li>
 * <li>D_AMT_PC_SINE_MIN_FREQ</li>
 * <li>D_AMT_PC_SINE_MAX_FREQ</li>
 * <li>D_AMT_PC_SINE_MIN_AMP</li>
 * <li>D_AMT_PC_SINE_MAX_AMP</li>
 * <li>D_AMT_PC_COSINE_MIN_FREQ</li>
 * <li>D_AMT_PC_COSINE_MAX_FREQ</li>
 * <li>D_AMT_PC_COSINE_MIN_AMP</li>
 * <li>D_AMT_PC_COSINE_MAX_AMP</li>
 * <li>D_AMT_PC_RAMP_MIN_FREQ</li>
 * <li>D_AMT_PC_RAMP_MAX_FREQ</li>
 * <li>D_AMT_PC_RAMP_MIN_AMP</li>
 * <li>D_AMT_PC_RAMP_MAX_AMP</li>
 * <li>D_AMT_PC_SQUARE_MIN_FREQ</li>
 * <li>D_AMT_PC_SQUARE_MAX_FREQ</li>
 * <li>D_AMT_PC_SQUARE_MIN_AMP</li>
 * <li>D_AMT_PC_SQUARE_MAX_AMP</li>
 * <li>D_AMT_PC_SLEW_MIN_FREQ</li>
 * <li>D_AMT_PC_SLEW_MAX_FREQ</li>
 * <li>D_AMT_PC_SLEW_MIN_AMP</li>
 * <li>D_AMT_PC_SLEW_MAX_AMP</li>
 * <li>D_AMT_START_TIME</li>
 * <li>D_AMT_START_TIME_DUMMY</li>
 * <li>D_AMT_FINISH_TIME</li>
 * <li>D_AMT_FINISH_TIME_DUMMY</li>
 * <li>D_AMT_SERVO_CTRL_ALGORITHM_VER</li>
 * <li>D_AMT_DATAID_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class AMT_DataType
  implements java.io.Serializable, ngat.ngtcs.subsystem.TTL_DataType
{
  /*=======================================================================*/
  /*                                                                       */
  /* CLASS FIELDS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * String used to identify RCS revision details.
   */
  public static final String RevisionString =
    new String( "$Id:$" );

  /**
   * Hashtable of instances for retrieval by the enumeration's String name.
   */
  private static java.util.Hashtable nameHash = new java.util.Hashtable();

  /**
   * Hashtable of instances for retrieval by the enumeration's int value.
   */
  private static java.util.Hashtable intHash = new java.util.Hashtable();

  /**
   * Index of the next enumeration to be added.
   */
  private static int nextIndex = 0;

  /**
   * TTL package to which this data refers.
   */
  private static final TTL_Package ttlPackage = TTL_Package.AMT;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static AMT_DataType D_AMT_DATAID_BOL =
      new AMT_DataType( "D_AMT_DATAID_BOL", 0, TTL_Package.D_AMT );

  /**
   * The AMT process state.
   */
  public final static AMT_DataType D_AMT_PROC_STATE =
      new AMT_DataType( "D_AMT_PROC_STATE", 1, TTL_Package.D_AMT );

  /**
   * AMT package revision.
   */
  public final static AMT_DataType D_AMT_APP_VERSION =
      new AMT_DataType( "D_AMT_APP_VERSION", 2, TTL_Package.D_AMT );

  /**
   * TFP simulate mode flag.
   */
  public final static AMT_DataType D_AMT_TFP_SIMULATE =
      new AMT_DataType( "D_AMT_TFP_SIMULATE", 3, TTL_Package.D_AMT );

  /**
   * Heidenhain Encoder simulate mode flag.
   */
  public final static AMT_DataType D_AMT_HHE_SIMULATE =
      new AMT_DataType( "D_AMT_HHE_SIMULATE", 4, TTL_Package.D_AMT );

  /**
   * Multifunction IO Card simulate mode flag.
   */
  public final static AMT_DataType D_AMT_MFC_SIMULATE =
      new AMT_DataType( "D_AMT_MFC_SIMULATE", 5, TTL_Package.D_AMT );

  /**
   * Telescope ID code.
   */
  public final static AMT_DataType D_AMT_TELESCOPE_ID =
      new AMT_DataType( "D_AMT_TELESCOPE_ID", 6, TTL_Package.D_AMT );

  /**
   * Telescope Axis ID code.
   */
  public final static AMT_DataType D_AMT_AXIS_ID =
      new AMT_DataType( "D_AMT_AXIS_ID", 7, TTL_Package.D_AMT );

  /**
   * Azimuth Computer Node Node Number
   */
  public final static AMT_DataType D_AMT_AZM_NODE_ID =
      new AMT_DataType( "D_AMT_AZM_NODE_ID", 8, TTL_Package.D_AMT );

  /**
   * Altitude Computer Node Node Number
   */
  public final static AMT_DataType D_AMT_ALT_NODE_ID =
      new AMT_DataType( "D_AMT_ALT_NODE_ID", 9, TTL_Package.D_AMT );

  /**
   * Cassegrain Computer Node Node Number
   */
  public final static AMT_DataType D_AMT_CAS_NODE_ID =
      new AMT_DataType( "D_AMT_CAS_NODE_ID", 10, TTL_Package.D_AMT );

  /**
   * Absolute Enc Task Present Azimuth Node
   */
  public final static AMT_DataType D_AMT_AZM_AET_PRESENT =
      new AMT_DataType( "D_AMT_AZM_AET_PRESENT", 11, TTL_Package.D_AMT );

  /**
   * Absolute Enc Task Present Altitude Node
   */
  public final static AMT_DataType D_AMT_ALT_AET_PRESENT =
      new AMT_DataType( "D_AMT_ALT_AET_PRESENT", 12, TTL_Package.D_AMT );

  /**
   * Absolute Enc Task Present Cassegrain Node
   */
  public final static AMT_DataType D_AMT_CAS_AET_PRESENT =
      new AMT_DataType( "D_AMT_CAS_AET_PRESENT", 13, TTL_Package.D_AMT );

  /**
   * Azimuth axis starting position (mas).
   */
  public final static AMT_DataType D_AMT_AZM_AXIS_POSN_START =
      new AMT_DataType( "D_AMT_AZM_AXIS_POSN_START", 14, TTL_Package.D_AMT );

  /**
   * Azimuth axis finishing position (mas).
   */
  public final static AMT_DataType D_AMT_AZM_AXIS_POSN_FINISH =
      new AMT_DataType( "D_AMT_AZM_AXIS_POSN_FINISH", 15, TTL_Package.D_AMT );

  /**
   * Altitude axis starting position (mas).
   */
  public final static AMT_DataType D_AMT_ALT_AXIS_POSN_START =
      new AMT_DataType( "D_AMT_ALT_AXIS_POSN_START", 16, TTL_Package.D_AMT );

  /**
   * Altitude axis finishing position (mas).
   */
  public final static AMT_DataType D_AMT_ALT_AXIS_POSN_FINISH =
      new AMT_DataType( "D_AMT_ALT_AXIS_POSN_FINISH", 17, TTL_Package.D_AMT );

  /**
   * Cassegrain axis starting position (mas).
   */
  public final static AMT_DataType D_AMT_CAS_AXIS_POSN_START =
      new AMT_DataType( "D_AMT_CAS_AXIS_POSN_START", 18, TTL_Package.D_AMT );

  /**
   * Cassegrain axis finishing position (mas).
   */
  public final static AMT_DataType D_AMT_CAS_AXIS_POSN_FINISH =
      new AMT_DataType( "D_AMT_CAS_AXIS_POSN_FINISH", 19, TTL_Package.D_AMT );

  /**
   * Extended run selected (TRUE
   */
  public final static AMT_DataType D_AMT_EXTENDED_RUN =
      new AMT_DataType( "D_AMT_EXTENDED_RUN", 20, TTL_Package.D_AMT );

  /**
   * Extended run period (seconds)
   */
  public final static AMT_DataType D_AMT_EXTENDED_RUN_PERIOD =
      new AMT_DataType( "D_AMT_EXTENDED_RUN_PERIOD", 21, TTL_Package.D_AMT );

  /**
   * Setup period for watchdog (seconds).
   */
  public final static AMT_DataType D_AMT_WATCHDOG_SETUP_PERIOD =
      new AMT_DataType( "D_AMT_WATCHDOG_SETUP_PERIOD", 22, TTL_Package.D_AMT );

  /**
   * Control Algorithm (PID or HNF)
   */
  public final static AMT_DataType D_AMT_CONTROL_ALGORITHM =
      new AMT_DataType( "D_AMT_CONTROL_ALGORITHM", 23, TTL_Package.D_AMT );

  /**
   * Control Mode (Open Loop
   */
  public final static AMT_DataType D_AMT_CONTROL_MODE =
      new AMT_DataType( "D_AMT_CONTROL_MODE", 24, TTL_Package.D_AMT );

  /**
   * Excitation Sig (Sine
   */
  public final static AMT_DataType D_AMT_EXCITATION_SIGNAL =
      new AMT_DataType( "D_AMT_EXCITATION_SIGNAL", 25, TTL_Package.D_AMT );

  /**
   * Frequency in Mhz
   */
  public final static AMT_DataType D_AMT_EXCITATION_FREQUENCY =
      new AMT_DataType( "D_AMT_EXCITATION_FREQUENCY", 26, TTL_Package.D_AMT );

  /**
   * Amplitude in mas (peak).
   */
  public final static AMT_DataType D_AMT_EXCITATION_AMPLITUDE =
      new AMT_DataType( "D_AMT_EXCITATION_AMPLITUDE", 27, TTL_Package.D_AMT );

  /**
   * Selected Ramp mode
   */
  public final static AMT_DataType D_AMT_RAMP_NUMBER =
      new AMT_DataType( "D_AMT_RAMP_NUMBER", 28, TTL_Package.D_AMT );

  /**
   * Number of encoder to be used for control.
   */
  public final static AMT_DataType D_AMT_CONTROL_ENCODER_NUM =
      new AMT_DataType( "D_AMT_CONTROL_ENCODER_NUM", 29, TTL_Package.D_AMT );

  /**
   * Off mount testing selected. (F
   */
  public final static AMT_DataType D_AMT_OFF_MOUNT_TESTING =
      new AMT_DataType( "D_AMT_OFF_MOUNT_TESTING", 30, TTL_Package.D_AMT );

  /**
   * H Infinity config file specific to AMT.
   */
  public final static AMT_DataType D_AMT_AMT_SPECIFIC_HNF_CFG =
      new AMT_DataType( "D_AMT_AMT_SPECIFIC_HNF_CFG", 31, TTL_Package.D_AMT );

  /**
   * PreLoad2 func. disp count interval.
   */
  public final static AMT_DataType D_AMT_FUNC_DISP_PRELOAD =
      new AMT_DataType( "D_AMT_FUNC_DISP_PRELOAD", 32, TTL_Package.D_AMT );

  /**
   * RunLogging func. disp count interval.
   */
  public final static AMT_DataType D_AMT_FUNC_DISP_RUNLOG =
      new AMT_DataType( "D_AMT_FUNC_DISP_RUNLOG", 33, TTL_Package.D_AMT );

  /**
   * Storage func. disp count count interval.
   */
  public final static AMT_DataType D_AMT_FUNC_DISP_FILEOP =
      new AMT_DataType( "D_AMT_FUNC_DISP_FILEOP", 34, TTL_Package.D_AMT );

  /**
   * Absolute Encoder Display flag (F
   */
  public final static AMT_DataType D_AMT_ABS_ENC_DISP =
      new AMT_DataType( "D_AMT_ABS_ENC_DISP", 35, TTL_Package.D_AMT );

  /**
   * Maximum velocity Ramp 1 (as
   */
  public final static AMT_DataType D_AMT_MAX_VEL_RAMP_1 =
      new AMT_DataType( "D_AMT_MAX_VEL_RAMP_1", 36, TTL_Package.D_AMT );

  /**
   * Maximum velocity Ramp 2 (as
   */
  public final static AMT_DataType D_AMT_MAX_VEL_RAMP_2 =
      new AMT_DataType( "D_AMT_MAX_VEL_RAMP_2", 37, TTL_Package.D_AMT );

  /**
   * Maximum velocity Ramp 3 (as
   */
  public final static AMT_DataType D_AMT_MAX_VEL_RAMP_3 =
      new AMT_DataType( "D_AMT_MAX_VEL_RAMP_3", 38, TTL_Package.D_AMT );

  /**
   * Maximum velocity Ramp 4 (as
   */
  public final static AMT_DataType D_AMT_MAX_VEL_RAMP_4 =
      new AMT_DataType( "D_AMT_MAX_VEL_RAMP_4", 39, TTL_Package.D_AMT );

  /**
   * Maximum velocity Ramp 5 (as
   */
  public final static AMT_DataType D_AMT_MAX_VEL_RAMP_5 =
      new AMT_DataType( "D_AMT_MAX_VEL_RAMP_5", 40, TTL_Package.D_AMT );

  /**
   * Maximum velocity Ramp 6 (as
   */
  public final static AMT_DataType D_AMT_MAX_VEL_RAMP_6 =
      new AMT_DataType( "D_AMT_MAX_VEL_RAMP_6", 41, TTL_Package.D_AMT );

  /**
   * Maximum acceleration Ramp 1 (as
   */
  public final static AMT_DataType D_AMT_MAX_ACCN_RAMP_1 =
      new AMT_DataType( "D_AMT_MAX_ACCN_RAMP_1", 42, TTL_Package.D_AMT );

  /**
   * Maximum acceleration Ramp 2 (as
   */
  public final static AMT_DataType D_AMT_MAX_ACCN_RAMP_2 =
      new AMT_DataType( "D_AMT_MAX_ACCN_RAMP_2", 43, TTL_Package.D_AMT );

  /**
   * Maximum acceleration Ramp 3 (as
   */
  public final static AMT_DataType D_AMT_MAX_ACCN_RAMP_3 =
      new AMT_DataType( "D_AMT_MAX_ACCN_RAMP_3", 44, TTL_Package.D_AMT );

  /**
   * Maximum acceleration Ramp 4 (as
   */
  public final static AMT_DataType D_AMT_MAX_ACCN_RAMP_4 =
      new AMT_DataType( "D_AMT_MAX_ACCN_RAMP_4", 45, TTL_Package.D_AMT );

  /**
   * Maximum acceleration Ramp 5 (as
   */
  public final static AMT_DataType D_AMT_MAX_ACCN_RAMP_5 =
      new AMT_DataType( "D_AMT_MAX_ACCN_RAMP_5", 46, TTL_Package.D_AMT );

  /**
   * Maximum acceleration Ramp 6 (as
   */
  public final static AMT_DataType D_AMT_MAX_ACCN_RAMP_6 =
      new AMT_DataType( "D_AMT_MAX_ACCN_RAMP_6", 47, TTL_Package.D_AMT );

  /**
   * Maximum ramp number allowed.
   */
  public final static AMT_DataType D_AMT_MAX_RAMP_NUMBER =
      new AMT_DataType( "D_AMT_MAX_RAMP_NUMBER", 48, TTL_Package.D_AMT );

  /**
   * Enable Drive 1. (F
   */
  public final static AMT_DataType D_AMT_ENABLE_DRIVE_1 =
      new AMT_DataType( "D_AMT_ENABLE_DRIVE_1", 49, TTL_Package.D_AMT );

  /**
   * 
   */
  public final static AMT_DataType 0049 =
      new AMT_DataType( "0049", 50, TTL_Package.D_AMT );

  /**
   * Enable Drive 2. (F
   */
  public final static AMT_DataType D_AMT_ENABLE_DRIVE_2 =
      new AMT_DataType( "D_AMT_ENABLE_DRIVE_2", 51, TTL_Package.D_AMT );

  /**
   * Release Bake on Motor 1. (F
   */
  public final static AMT_DataType D_AMT_RELEASE_BRAKE_1 =
      new AMT_DataType( "D_AMT_RELEASE_BRAKE_1", 52, TTL_Package.D_AMT );

  /**
   * Release Bake on Motor 2. (F
   */
  public final static AMT_DataType D_AMT_RELEASE_BRAKE_2 =
      new AMT_DataType( "D_AMT_RELEASE_BRAKE_2", 53, TTL_Package.D_AMT );

  /**
   * Max motor torque (mNm)
   */
  public final static AMT_DataType D_AMT_MAX_MOTOR_TORQUE =
      new AMT_DataType( "D_AMT_MAX_MOTOR_TORQUE", 54, TTL_Package.D_AMT );

  /**
   * Min value of torque for backlash (mNm)
   */
  public final static AMT_DataType D_AMT_TORQUE_CLAMP_LIMIT_LOW =
      new AMT_DataType( "D_AMT_TORQUE_CLAMP_LIMIT_LOW", 55, TTL_Package.D_AMT );

  /**
   * Motor preloading required (F
   */
  public final static AMT_DataType D_AMT_MOTOR_PRELOAD_REQUIRED =
      new AMT_DataType( "D_AMT_MOTOR_PRELOAD_REQUIRED", 56, TTL_Package.D_AMT );

  /**
   * Preload Stage 1 : 0 x (mNm)
   */
  public final static AMT_DataType D_AMT_PRELOAD_STG_1 =
      new AMT_DataType( "D_AMT_PRELOAD_STG_1", 57, TTL_Package.D_AMT );

  /**
   * Preload Stage 2 : x final preload (mNm)
   */
  public final static AMT_DataType D_AMT_PRELOAD_STG_2 =
      new AMT_DataType( "D_AMT_PRELOAD_STG_2", 58, TTL_Package.D_AMT );

  /**
   * Number of cycles to apply preload Stage 1
   */
  public final static AMT_DataType D_AMT_NUM_OF_CYCLES_PRELOAD_STG_1 =
      new AMT_DataType( "D_AMT_NUM_OF_CYCLES_PRELOAD_STG_1", 59, TTL_Package.D_AMT );

  /**
   * Number of cycles to apply preload Stage 2
   */
  public final static AMT_DataType D_AMT_NUM_OF_CYCLES_PRELOAD_STG_2 =
      new AMT_DataType( "D_AMT_NUM_OF_CYCLES_PRELOAD_STG_2", 60, TTL_Package.D_AMT );

  /**
   * Interval between Stage 1 & Stage 2 (s)
   */
  public final static AMT_DataType D_AMT_STG1_TO_STG2_INTERVAL =
      new AMT_DataType( "D_AMT_STG1_TO_STG2_INTERVAL", 61, TTL_Package.D_AMT );

  /**
   * Derived Number of counts to apply preload
   */
  public final static AMT_DataType D_AMT_NUM_COUNTS_TO_APPLY_PLOAD =
      new AMT_DataType( "D_AMT_NUM_COUNTS_TO_APPLY_PLOAD", 62, TTL_Package.D_AMT );

  /**
   * Count before motion after preload appn.
   */
  public final static AMT_DataType D_AMT_PRELOAD_PAUSE_COUNT =
      new AMT_DataType( "D_AMT_PRELOAD_PAUSE_COUNT", 63, TTL_Package.D_AMT );

  /**
   * Apply zero preload at program termination
   */
  public final static AMT_DataType D_AMT_TERM_ZERO_PRELOAD =
      new AMT_DataType( "D_AMT_TERM_ZERO_PRELOAD", 64, TTL_Package.D_AMT );

  /**
   * Torque to overcome stiction
   */
  public final static AMT_DataType D_AMT_STICTION_TORQUE_OFFSET =
      new AMT_DataType( "D_AMT_STICTION_TORQUE_OFFSET", 65, TTL_Package.D_AMT );

  /**
   * PID controller P1 gain x 1e9.
   */
  public final static AMT_DataType D_AMT_PID_P1_GAIN_X1E9 =
      new AMT_DataType( "D_AMT_PID_P1_GAIN_X1E9", 66, TTL_Package.D_AMT );

  /**
   * 
   */
  public final static AMT_DataType 0065 =
      new AMT_DataType( "0065", 67, TTL_Package.D_AMT );

  /**
   * PID controller P2 gain x 1e9.
   */
  public final static AMT_DataType D_AMT_PID_P2_GAIN_X1E9 =
      new AMT_DataType( "D_AMT_PID_P2_GAIN_X1E9", 68, TTL_Package.D_AMT );

  /**
   * 
   */
  public final static AMT_DataType 0066 =
      new AMT_DataType( "0066", 69, TTL_Package.D_AMT );

  /**
   * PID controller K1 gain x 1e9.
   */
  public final static AMT_DataType D_AMT_PID_K1_GAIN_X1E9 =
      new AMT_DataType( "D_AMT_PID_K1_GAIN_X1E9", 70, TTL_Package.D_AMT );

  /**
   * 
   */
  public final static AMT_DataType 0067 =
      new AMT_DataType( "0067", 71, TTL_Package.D_AMT );

  /**
   * H Infinitiy PID controller P2 gain x 1e9.
   */
  public final static AMT_DataType D_AMT_HNF_P2_GAIN_X1E9 =
      new AMT_DataType( "D_AMT_HNF_P2_GAIN_X1E9", 72, TTL_Package.D_AMT );

  /**
   * Axis velocity gain x 1e9. (kd)
   */
  public final static AMT_DataType D_AMT_AXIS_VELOCITY_GAIN_X1E9 =
      new AMT_DataType( "D_AMT_AXIS_VELOCITY_GAIN_X1E9", 73, TTL_Package.D_AMT );

  /**
   * PID Velocity feedback fraction (x 1000)
   */
  public final static AMT_DataType D_AMT_PIDVEL_FEEDBACK_FRACTION =
      new AMT_DataType( "D_AMT_PIDVEL_FEEDBACK_FRACTION", 74, TTL_Package.D_AMT );

  /**
   * H Inf Velocity feedback fraction (x 1000)
   */
  public final static AMT_DataType D_AMT_HNFVEL_FEEDBACK_FRACTION =
      new AMT_DataType( "D_AMT_HNFVEL_FEEDBACK_FRACTION", 75, TTL_Package.D_AMT );

  /**
   * Swept Sine Mode Activated (F
   */
  public final static AMT_DataType D_AMT_SWEPT_SINE_MODE =
      new AMT_DataType( "D_AMT_SWEPT_SINE_MODE", 76, TTL_Package.D_AMT );

  /**
   * Swept Sine Number
   */
  public final static AMT_DataType D_AMT_SWEPT_SINE_NUMBER =
      new AMT_DataType( "D_AMT_SWEPT_SINE_NUMBER", 77, TTL_Package.D_AMT );

  /**
   * Swept Sine Amplitude (mNm)
   */
  public final static AMT_DataType D_AMT_SWEPT_SINE_AMPLITUDE =
      new AMT_DataType( "D_AMT_SWEPT_SINE_AMPLITUDE", 78, TTL_Package.D_AMT );

  /**
   * Full data file header req'd. (F
   */
  public final static AMT_DataType D_AMT_DATA_FILE_FULL_HEADER =
      new AMT_DataType( "D_AMT_DATA_FILE_FULL_HEADER", 79, TTL_Package.D_AMT );

  /**
   * H Infinity config file info req'd. (F
   */
  public final static AMT_DataType D_AMT_HNF_ALGOL_HEADER =
      new AMT_DataType( "D_AMT_HNF_ALGOL_HEADER", 80, TTL_Package.D_AMT );

  /**
   * Maximum Logging Period (s)
   */
  public final static AMT_DataType D_AMT_MAX_LOGGING_PERIOD =
      new AMT_DataType( "D_AMT_MAX_LOGGING_PERIOD", 81, TTL_Package.D_AMT );

  /**
   * Standard logging period (s)
   */
  public final static AMT_DataType D_AMT_LOGGING_PERIOD =
      new AMT_DataType( "D_AMT_LOGGING_PERIOD", 82, TTL_Package.D_AMT );

  /**
   * Ramp logging period (s)
   */
  public final static AMT_DataType D_AMT_RAMP_LOGGING_PERIOD =
      new AMT_DataType( "D_AMT_RAMP_LOGGING_PERIOD", 83, TTL_Package.D_AMT );

  /**
   * Ramp motion period (s)
   */
  public final static AMT_DataType D_AMT_RAMP_MOTION_PERIOD =
      new AMT_DataType( "D_AMT_RAMP_MOTION_PERIOD", 84, TTL_Package.D_AMT );

  /**
   * Swept Sine Data Collection Period
   */
  public final static AMT_DataType D_AMT_SWEPT_SINE_LOGGING_PERIOD =
      new AMT_DataType( "D_AMT_SWEPT_SINE_LOGGING_PERIOD", 85, TTL_Package.D_AMT );

  /**
   * Delay before releasing brakes
   */
  public final static AMT_DataType D_AMT_BRAKE_RELEASE_WAIT_COUNT =
      new AMT_DataType( "D_AMT_BRAKE_RELEASE_WAIT_COUNT", 86, TTL_Package.D_AMT );

  /**
   * Pre Delay before applying brakes
   */
  public final static AMT_DataType D_AMT_BRAKE_PREAPPLY_WAIT_COUNT =
      new AMT_DataType( "D_AMT_BRAKE_PREAPPLY_WAIT_COUNT", 87, TTL_Package.D_AMT );

  /**
   * Delay before applying brakes
   */
  public final static AMT_DataType D_AMT_BRAKE_APPLY_WAIT_COUNT =
      new AMT_DataType( "D_AMT_BRAKE_APPLY_WAIT_COUNT", 88, TTL_Package.D_AMT );

  /**
   * Number of cycles for data collection
   */
  public final static AMT_DataType D_AMT_NUM_OF_CYCLES_TO_LOG =
      new AMT_DataType( "D_AMT_NUM_OF_CYCLES_TO_LOG", 89, TTL_Package.D_AMT );

  /**
   * Number of cycles for program execution
   */
  public final static AMT_DataType D_AMT_NUM_OF_CYCLES_TO_RUN =
      new AMT_DataType( "D_AMT_NUM_OF_CYCLES_TO_RUN", 90, TTL_Package.D_AMT );

  /**
   * Enable
   */
  public final static AMT_DataType D_AMT_MOTOR_FILTER_ENABLE =
      new AMT_DataType( "D_AMT_MOTOR_FILTER_ENABLE", 91, TTL_Package.D_AMT );

  /**
   * Denominator coeff for IIR filter
   */
  public final static AMT_DataType D_AMT_OUTPUT_FILTER_DENOMINATOR =
      new AMT_DataType( "D_AMT_OUTPUT_FILTER_DENOMINATOR", 92, TTL_Package.D_AMT );

  /**
   * Input coeff for IIR filter
   */
  public final static AMT_DataType D_AMT_OUTPUT_FILTER_C0_COEFFICIENT =
      new AMT_DataType( "D_AMT_OUTPUT_FILTER_C0_COEFFICIENT", 93, TTL_Package.D_AMT );

  /**
   * Output feedback coeff for IIR filter
   */
  public final static AMT_DataType D_AMT_OUTPUT_FILTER_D1_COEFFICIENT =
      new AMT_DataType( "D_AMT_OUTPUT_FILTER_D1_COEFFICIENT", 94, TTL_Package.D_AMT );

  /**
   * Enable
   */
  public final static AMT_DataType D_AMT_HINF_FILTER_ENABLE =
      new AMT_DataType( "D_AMT_HINF_FILTER_ENABLE", 95, TTL_Package.D_AMT );

  /**
   * H Inf Filter Coefficient Fraction N0
   */
  public final static AMT_DataType D_AMT_HINF_OUTPUTN0_FRACTION =
      new AMT_DataType( "D_AMT_HINF_OUTPUTN0_FRACTION", 96, TTL_Package.D_AMT );

  /**
   * H Inf Filter Coefficient Fraction N1
   */
  public final static AMT_DataType D_AMT_HINF_OUTPUTN1_FRACTION =
      new AMT_DataType( "D_AMT_HINF_OUTPUTN1_FRACTION", 97, TTL_Package.D_AMT );

  /**
   * H Inf Filter Coefficient Fraction N2
   */
  public final static AMT_DataType D_AMT_HINF_OUTPUTN2_FRACTION =
      new AMT_DataType( "D_AMT_HINF_OUTPUTN2_FRACTION", 98, TTL_Package.D_AMT );

  /**
   * H Inf Filter Coefficient Fraction N3
   */
  public final static AMT_DataType D_AMT_HINF_OUTPUTN3_FRACTION =
      new AMT_DataType( "D_AMT_HINF_OUTPUTN3_FRACTION", 99, TTL_Package.D_AMT );

  /**
   * Min DAC Value for 16 bit DAC Card (0)
   */
  public final static AMT_DataType D_AMT_MIN_DAC_VALUE =
      new AMT_DataType( "D_AMT_MIN_DAC_VALUE", 100, TTL_Package.D_AMT );

  /**
   * Max DAC Value for 16 bit DAC Card (65535)
   */
  public final static AMT_DataType D_AMT_MAX_DAC_VALUE =
      new AMT_DataType( "D_AMT_MAX_DAC_VALUE", 101, TTL_Package.D_AMT );

  /**
   * FSD 10 Volts to
   */
  public final static AMT_DataType D_AMT_FULL_SCALE_DAC_VALUE =
      new AMT_DataType( "D_AMT_FULL_SCALE_DAC_VALUE", 102, TTL_Package.D_AMT );

  /**
   * Zero point offset for DAC (0 V
   */
  public final static AMT_DataType D_AMT_ZERO_OFFSET_DAC_VALUE =
      new AMT_DataType( "D_AMT_ZERO_OFFSET_DAC_VALUE", 103, TTL_Package.D_AMT );

  /**
   * Motor Velocity Gain Factor (2)
   */
  public final static AMT_DataType D_AMT_MOTOR_VEL_GAIN_FACTOR =
      new AMT_DataType( "D_AMT_MOTOR_VEL_GAIN_FACTOR", 104, TTL_Package.D_AMT );

  /**
   * Axis Velocity Gain Factor (2000)
   */
  public final static AMT_DataType D_AMT_AXIS_VEL_GAIN_FACTOR =
      new AMT_DataType( "D_AMT_AXIS_VEL_GAIN_FACTOR", 105, TTL_Package.D_AMT );

  /**
   * PID Loop Gain Scale Factor (1000.0)
   */
  public final static AMT_DataType D_AMT_PID_GAIN_SCALE_FACTOR =
      new AMT_DataType( "D_AMT_PID_GAIN_SCALE_FACTOR", 106, TTL_Package.D_AMT );

  /**
   * Motor gain.
   */
  public final static AMT_DataType D_AMT_AXIS_MOTOR_GAIN =
      new AMT_DataType( "D_AMT_AXIS_MOTOR_GAIN", 107, TTL_Package.D_AMT );

  /**
   * Amplifier gain.
   */
  public final static AMT_DataType D_AMT_AXIS_AMPLIFIER_GAIN =
      new AMT_DataType( "D_AMT_AXIS_AMPLIFIER_GAIN", 108, TTL_Package.D_AMT );

  /**
   * Scale factor for motor gain. (1000.0)
   */
  public final static AMT_DataType D_AMT_MOTOR_GAIN_SCALE =
      new AMT_DataType( "D_AMT_MOTOR_GAIN_SCALE", 109, TTL_Package.D_AMT );

  /**
   * Scale factor for amplifier gain. (1000.0)
   */
  public final static AMT_DataType D_AMT_AMPLIFIER_GAIN_SCALE =
      new AMT_DataType( "D_AMT_AMPLIFIER_GAIN_SCALE", 110, TTL_Package.D_AMT );

  /**
   * Scale factor for voltage gain. (1000)
   */
  public final static AMT_DataType D_AMT_VOLTAGE_GAIN_SCALE =
      new AMT_DataType( "D_AMT_VOLTAGE_GAIN_SCALE", 111, TTL_Package.D_AMT );

  /**
   * Max. number of IK220 encoder cards fitted.
   */
  public final static AMT_DataType D_AMT_MAX_NUMBER_ENCODER_CARDS =
      new AMT_DataType( "D_AMT_MAX_NUMBER_ENCODER_CARDS", 112, TTL_Package.D_AMT );

  /**
   * Max. number of motor encoders fitted.
   */
  public final static AMT_DataType D_AMT_MAX_NUMBER_MOTOR_ENCODERS =
      new AMT_DataType( "D_AMT_MAX_NUMBER_MOTOR_ENCODERS", 113, TTL_Package.D_AMT );

  /**
   * Max. number of tape encoders fitted.
   */
  public final static AMT_DataType D_AMT_MAX_NUMBER_TAPE_ENCODERS =
      new AMT_DataType( "D_AMT_MAX_NUMBER_TAPE_ENCODERS", 114, TTL_Package.D_AMT );

  /**
   * 0110
   */
  public final static AMT_DataType 0110 =
      new AMT_DataType( "0110", 115, TTL_Package.D_AMT );

  /**
   * Max. number of length encoders fitted.
   */
  public final static AMT_DataType D_AMT_MAX_NUMBER_LENGTH_ENCODERS =
      new AMT_DataType( "D_AMT_MAX_NUMBER_LENGTH_ENCODERS", 116, TTL_Package.D_AMT );

  /**
   * Maximum encoder resolution ((double) 12.0)
   */
  public final static AMT_DataType D_AMT_ENCODER_INTERPOLATION_BITS =
      new AMT_DataType( "D_AMT_ENCODER_INTERPOLATION_BITS", 117, TTL_Package.D_AMT );

  /**
   * Encoder Pulses per Rev.
   */
  public final static AMT_DataType D_AMT_ENCODER_PULSES_PER_AXIS_REV =
      new AMT_DataType( "D_AMT_ENCODER_PULSES_PER_AXIS_REV", 118, TTL_Package.D_AMT );

  /**
   * Motor Encoder pulses per Rev. (1000.0)
   */
  public final static AMT_DataType D_AMT_ENCODER_PULSES_PER_MOTOR_REV =
      new AMT_DataType( "D_AMT_ENCODER_PULSES_PER_MOTOR_REV", 119, TTL_Package.D_AMT );

  /**
   * Tape Encoders enable operation flag
   */
  public final static AMT_DataType D_AMT_ENABLE_TAPE_ENCODERS =
      new AMT_DataType( "D_AMT_ENABLE_TAPE_ENCODERS", 120, TTL_Package.D_AMT );

  /**
   * Length Encoders enable operation flag
   */
  public final static AMT_DataType D_AMT_ENABLE_LENGTH_ENCODERS =
      new AMT_DataType( "D_AMT_ENABLE_LENGTH_ENCODERS", 121, TTL_Package.D_AMT );

  /**
   * Motor Enc. Counting Dirn. 0:
   */
  public final static AMT_DataType D_AMT_MOTOR_ENCODERS_DIRECTION =
      new AMT_DataType( "D_AMT_MOTOR_ENCODERS_DIRECTION", 122, TTL_Package.D_AMT );

  /**
   * Tape Enc. Counting Dirn. 0:
   */
  public final static AMT_DataType D_AMT_TAPE_ENCODERS_DIRECTION =
      new AMT_DataType( "D_AMT_TAPE_ENCODERS_DIRECTION", 123, TTL_Package.D_AMT );

  /**
   * 
   */
  public final static AMT_DataType 0118 =
      new AMT_DataType( "0118", 124, TTL_Package.D_AMT );

  /**
   * Length Enc. Counting Dirn. 0:
   */
  public final static AMT_DataType D_AMT_LENGTH_ENCODERS_DIRECTION =
      new AMT_DataType( "D_AMT_LENGTH_ENCODERS_DIRECTION", 125, TTL_Package.D_AMT );

  /**
   * 
   */
  public final static AMT_DataType 0119 =
      new AMT_DataType( "0119", 126, TTL_Package.D_AMT );

  /**
   * Motor Encoders Counting Direction ( 1
   */
  public final static AMT_DataType D_AMT_MOTOR_FEEDBACK =
      new AMT_DataType( "D_AMT_MOTOR_FEEDBACK", 127, TTL_Package.D_AMT );

  /**
   * Motor Encoders Counting Direction ( 1
   */
  public final static AMT_DataType D_AMT_AXIS_FEEDBACK =
      new AMT_DataType( "D_AMT_AXIS_FEEDBACK", 128, TTL_Package.D_AMT );

  /**
   * Rate at which data should be stored
   */
  public final static AMT_DataType D_AMT_DATA_COLLECTION_RATE =
      new AMT_DataType( "D_AMT_DATA_COLLECTION_RATE", 129, TTL_Package.D_AMT );

  /**
   * Rate at which Abs. Encs. should be read
   */
  public final static AMT_DataType D_AMT_ABS_ENC_READ_RATE =
      new AMT_DataType( "D_AMT_ABS_ENC_READ_RATE", 130, TTL_Package.D_AMT );

  /**
   * Delay before appplication of new demand
   */
  public final static AMT_DataType D_AMT_CONTROLLER_DELAY =
      new AMT_DataType( "D_AMT_CONTROLLER_DELAY", 131, TTL_Package.D_AMT );

  /**
   * Flag to enable hardware pulsing bit (T
   */
  public final static AMT_DataType D_AMT_TOGGLE_HARDWARE_PULSE =
      new AMT_DataType( "D_AMT_TOGGLE_HARDWARE_PULSE", 132, TTL_Package.D_AMT );

  /**
   * Rate of pulsing hardware toggle bit
   */
  public final static AMT_DataType D_AMT_HARDWARE_PULSE_RATE =
      new AMT_DataType( "D_AMT_HARDWARE_PULSE_RATE", 133, TTL_Package.D_AMT );

  /**
   * TFP Server Process ID
   */
  public final static AMT_DataType D_AMT_TFP_SERVER_PID =
      new AMT_DataType( "D_AMT_TFP_SERVER_PID", 134, TTL_Package.D_AMT );

  /**
   * Azimuth Abs. Encoder Server Process ID
   */
  public final static AMT_DataType D_AMT_AZM_ABS_ENC_PID =
      new AMT_DataType( "D_AMT_AZM_ABS_ENC_PID", 135, TTL_Package.D_AMT );

  /**
   * Altitude Abs. Encoder Server Process ID
   */
  public final static AMT_DataType D_AMT_ALT_ABS_ENC_PID =
      new AMT_DataType( "D_AMT_ALT_ABS_ENC_PID", 136, TTL_Package.D_AMT );

  /**
   * Cassegrain Abs. Encoder Server Process ID
   */
  public final static AMT_DataType D_AMT_CAS_ABS_ENC_PID =
      new AMT_DataType( "D_AMT_CAS_ABS_ENC_PID", 137, TTL_Package.D_AMT );

  /**
   * WatchDog Process ID
   */
  public final static AMT_DataType D_AMT_WATCHDOG_PID =
      new AMT_DataType( "D_AMT_WATCHDOG_PID", 138, TTL_Package.D_AMT );

  /**
   * Dummy OID place holder for later use
   */
  public final static AMT_DataType D_AMT_DUMMY_OID_01 =
      new AMT_DataType( "D_AMT_DUMMY_OID_01", 139, TTL_Package.D_AMT );

  /**
   * Dummy OID place holder for later use
   */
  public final static AMT_DataType D_AMT_DUMMY_OID_02 =
      new AMT_DataType( "D_AMT_DUMMY_OID_02", 140, TTL_Package.D_AMT );

  /**
   * Dummy OID place holder for later use
   */
  public final static AMT_DataType D_AMT_DUMMY_OID_03 =
      new AMT_DataType( "D_AMT_DUMMY_OID_03", 141, TTL_Package.D_AMT );

  /**
   * 
   */
  public final static AMT_DataType 0134 =
      new AMT_DataType( "0134", 142, TTL_Package.D_AMT );

  /**
   * Stiction compensation tolerance
   */
  public final static AMT_DataType D_AMT_STICTION_COMP_TOLERANCE =
      new AMT_DataType( "D_AMT_STICTION_COMP_TOLERANCE", 143, TTL_Package.D_AMT );

  /**
   * Stiction compensation for
   */
  public final static AMT_DataType D_AMT_STICTION_COMP_POSITIVE =
      new AMT_DataType( "D_AMT_STICTION_COMP_POSITIVE", 144, TTL_Package.D_AMT );

  /**
   * Stiction compensation for ve velocities
   */
  public final static AMT_DataType D_AMT_STICTION_COMP_NEGATIVE =
      new AMT_DataType( "D_AMT_STICTION_COMP_NEGATIVE", 145, TTL_Package.D_AMT );

  /**
   * Torque Control Axis Ref. Velocity Gain
   */
  public final static AMT_DataType D_AMT_TC_AXIS_REF_VEL_GAIN =
      new AMT_DataType( "D_AMT_TC_AXIS_REF_VEL_GAIN", 146, TTL_Package.D_AMT );

  /**
   * Velocity Control Axis Ref. Velocity Gain
   */
  public final static AMT_DataType D_AMT_VC_AXIS_REF_VEL_GAIN =
      new AMT_DataType( "D_AMT_VC_AXIS_REF_VEL_GAIN", 147, TTL_Package.D_AMT );

  /**
   * Position Control Axis Ref. Velocity Gain
   */
  public final static AMT_DataType D_AMT_PC_AXIS_REF_VEL_GAIN =
      new AMT_DataType( "D_AMT_PC_AXIS_REF_VEL_GAIN", 148, TTL_Package.D_AMT );

  /**
   * Torque Control Sine Min. Freq.
   */
  public final static AMT_DataType D_AMT_TC_SINE_MIN_FREQ =
      new AMT_DataType( "D_AMT_TC_SINE_MIN_FREQ", 149, TTL_Package.D_AMT );

  /**
   * Torque Control Sine Max. Freq.
   */
  public final static AMT_DataType D_AMT_TC_SINE_MAX_FREQ =
      new AMT_DataType( "D_AMT_TC_SINE_MAX_FREQ", 150, TTL_Package.D_AMT );

  /**
   * Torque Control Sine Min. Amp.
   */
  public final static AMT_DataType D_AMT_TC_SINE_MIN_AMP =
      new AMT_DataType( "D_AMT_TC_SINE_MIN_AMP", 151, TTL_Package.D_AMT );

  /**
   * Torque Control Sine Max. Amp.
   */
  public final static AMT_DataType D_AMT_TC_SINE_MAX_AMP =
      new AMT_DataType( "D_AMT_TC_SINE_MAX_AMP", 152, TTL_Package.D_AMT );

  /**
   * Torque Control Cosine Min. Freq.
   */
  public final static AMT_DataType D_AMT_TC_COSINE_MIN_FREQ =
      new AMT_DataType( "D_AMT_TC_COSINE_MIN_FREQ", 153, TTL_Package.D_AMT );

  /**
   * Torque Control Cosine Max. Freq.
   */
  public final static AMT_DataType D_AMT_TC_COSINE_MAX_FREQ =
      new AMT_DataType( "D_AMT_TC_COSINE_MAX_FREQ", 154, TTL_Package.D_AMT );

  /**
   * Torque Control Cosine Min. Amp.
   */
  public final static AMT_DataType D_AMT_TC_COSINE_MIN_AMP =
      new AMT_DataType( "D_AMT_TC_COSINE_MIN_AMP", 155, TTL_Package.D_AMT );

  /**
   * Torque Control Cosine Max. Amp.
   */
  public final static AMT_DataType D_AMT_TC_COSINE_MAX_AMP =
      new AMT_DataType( "D_AMT_TC_COSINE_MAX_AMP", 156, TTL_Package.D_AMT );

  /**
   * Torque Control Ramp Min. Freq.
   */
  public final static AMT_DataType D_AMT_TC_RAMP_MIN_FREQ =
      new AMT_DataType( "D_AMT_TC_RAMP_MIN_FREQ", 157, TTL_Package.D_AMT );

  /**
   * Torque Control Ramp Max. Freq.
   */
  public final static AMT_DataType D_AMT_TC_RAMP_MAX_FREQ =
      new AMT_DataType( "D_AMT_TC_RAMP_MAX_FREQ", 158, TTL_Package.D_AMT );

  /**
   * Torque Control Ramp Min. Amp.
   */
  public final static AMT_DataType D_AMT_TC_RAMP_MIN_AMP =
      new AMT_DataType( "D_AMT_TC_RAMP_MIN_AMP", 159, TTL_Package.D_AMT );

  /**
   * Torque Control Ramp Max. Amp.
   */
  public final static AMT_DataType D_AMT_TC_RAMP_MAX_AMP =
      new AMT_DataType( "D_AMT_TC_RAMP_MAX_AMP", 160, TTL_Package.D_AMT );

  /**
   * Torque Control Square Min. Freq.
   */
  public final static AMT_DataType D_AMT_TC_SQUARE_MIN_FREQ =
      new AMT_DataType( "D_AMT_TC_SQUARE_MIN_FREQ", 161, TTL_Package.D_AMT );

  /**
   * Torque Control Square Max. Freq.
   */
  public final static AMT_DataType D_AMT_TC_SQUARE_MAX_FREQ =
      new AMT_DataType( "D_AMT_TC_SQUARE_MAX_FREQ", 162, TTL_Package.D_AMT );

  /**
   * Torque Control Square Min. Amp.
   */
  public final static AMT_DataType D_AMT_TC_SQUARE_MIN_AMP =
      new AMT_DataType( "D_AMT_TC_SQUARE_MIN_AMP", 163, TTL_Package.D_AMT );

  /**
   * Torque Control Square Max. Amp.
   */
  public final static AMT_DataType D_AMT_TC_SQUARE_MAX_AMP =
      new AMT_DataType( "D_AMT_TC_SQUARE_MAX_AMP", 164, TTL_Package.D_AMT );

  /**
   * Torque Control Ramp Min. Freq.
   */
  public final static AMT_DataType D_AMT_TC_SLEW_MIN_FREQ =
      new AMT_DataType( "D_AMT_TC_SLEW_MIN_FREQ", 165, TTL_Package.D_AMT );

  /**
   * Torque Control Ramp Max. Freq.
   */
  public final static AMT_DataType D_AMT_TC_SLEW_MAX_FREQ =
      new AMT_DataType( "D_AMT_TC_SLEW_MAX_FREQ", 166, TTL_Package.D_AMT );

  /**
   * Torque Control Ramp Min. Amp.
   */
  public final static AMT_DataType D_AMT_TC_SLEW_MIN_AMP =
      new AMT_DataType( "D_AMT_TC_SLEW_MIN_AMP", 167, TTL_Package.D_AMT );

  /**
   * Torque Control Ramp Max. Amp.
   */
  public final static AMT_DataType D_AMT_TC_SLEW_MAX_AMP =
      new AMT_DataType( "D_AMT_TC_SLEW_MAX_AMP", 168, TTL_Package.D_AMT );

  /**
   * Velocity Control Sine Slew Freq.
   */
  public final static AMT_DataType D_AMT_VC_SINE_MIN_FREQ =
      new AMT_DataType( "D_AMT_VC_SINE_MIN_FREQ", 169, TTL_Package.D_AMT );

  /**
   * Velocity Control Sine Max. Freq.
   */
  public final static AMT_DataType D_AMT_VC_SINE_MAX_FREQ =
      new AMT_DataType( "D_AMT_VC_SINE_MAX_FREQ", 170, TTL_Package.D_AMT );

  /**
   * Velocity Control Sine Min. Amp.
   */
  public final static AMT_DataType D_AMT_VC_SINE_MIN_AMP =
      new AMT_DataType( "D_AMT_VC_SINE_MIN_AMP", 171, TTL_Package.D_AMT );

  /**
   * Velocity Control Sine Max. Amp.
   */
  public final static AMT_DataType D_AMT_VC_SINE_MAX_AMP =
      new AMT_DataType( "D_AMT_VC_SINE_MAX_AMP", 172, TTL_Package.D_AMT );

  /**
   * Velocity Control Cosine Slew Freq.
   */
  public final static AMT_DataType D_AMT_VC_COSINE_MIN_FREQ =
      new AMT_DataType( "D_AMT_VC_COSINE_MIN_FREQ", 173, TTL_Package.D_AMT );

  /**
   * Velocity Control Cosine Max. Freq.
   */
  public final static AMT_DataType D_AMT_VC_COSINE_MAX_FREQ =
      new AMT_DataType( "D_AMT_VC_COSINE_MAX_FREQ", 174, TTL_Package.D_AMT );

  /**
   * Velocity Control Cosine Min. Amp.
   */
  public final static AMT_DataType D_AMT_VC_COSINE_MIN_AMP =
      new AMT_DataType( "D_AMT_VC_COSINE_MIN_AMP", 175, TTL_Package.D_AMT );

  /**
   * Velocity Control Cosine Max. Amp.
   */
  public final static AMT_DataType D_AMT_VC_COSINE_MAX_AMP =
      new AMT_DataType( "D_AMT_VC_COSINE_MAX_AMP", 176, TTL_Package.D_AMT );

  /**
   * Velocity Control Slew Slew Freq.
   */
  public final static AMT_DataType D_AMT_VC_RAMP_MIN_FREQ =
      new AMT_DataType( "D_AMT_VC_RAMP_MIN_FREQ", 177, TTL_Package.D_AMT );

  /**
   * Velocity Control Slew Max. Freq.
   */
  public final static AMT_DataType D_AMT_VC_RAMP_MAX_FREQ =
      new AMT_DataType( "D_AMT_VC_RAMP_MAX_FREQ", 178, TTL_Package.D_AMT );

  /**
   * Velocity Control Slew Min. Amp.
   */
  public final static AMT_DataType D_AMT_VC_RAMP_MIN_AMP =
      new AMT_DataType( "D_AMT_VC_RAMP_MIN_AMP", 179, TTL_Package.D_AMT );

  /**
   * Velocity Control Slew Max. Amp.
   */
  public final static AMT_DataType D_AMT_VC_RAMP_MAX_AMP =
      new AMT_DataType( "D_AMT_VC_RAMP_MAX_AMP", 180, TTL_Package.D_AMT );

  /**
   * Velocity Control Square Slew Freq.
   */
  public final static AMT_DataType D_AMT_VC_SQUARE_MIN_FREQ =
      new AMT_DataType( "D_AMT_VC_SQUARE_MIN_FREQ", 181, TTL_Package.D_AMT );

  /**
   * Velocity Control Square Max. Freq.
   */
  public final static AMT_DataType D_AMT_VC_SQUARE_MAX_FREQ =
      new AMT_DataType( "D_AMT_VC_SQUARE_MAX_FREQ", 182, TTL_Package.D_AMT );

  /**
   * Velocity Control Square Min. Amp.
   */
  public final static AMT_DataType D_AMT_VC_SQUARE_MIN_AMP =
      new AMT_DataType( "D_AMT_VC_SQUARE_MIN_AMP", 183, TTL_Package.D_AMT );

  /**
   * Velocity Control Square Max. Amp.
   */
  public final static AMT_DataType D_AMT_VC_SQUARE_MAX_AMP =
      new AMT_DataType( "D_AMT_VC_SQUARE_MAX_AMP", 184, TTL_Package.D_AMT );

  /**
   * Velocity Control Ramp Slew Freq.
   */
  public final static AMT_DataType D_AMT_VC_SLEW_MIN_FREQ =
      new AMT_DataType( "D_AMT_VC_SLEW_MIN_FREQ", 185, TTL_Package.D_AMT );

  /**
   * Velocity Control Ramp Max. Freq.
   */
  public final static AMT_DataType D_AMT_VC_SLEW_MAX_FREQ =
      new AMT_DataType( "D_AMT_VC_SLEW_MAX_FREQ", 186, TTL_Package.D_AMT );

  /**
   * Velocity Control Ramp Min. Amp.
   */
  public final static AMT_DataType D_AMT_VC_SLEW_MIN_AMP =
      new AMT_DataType( "D_AMT_VC_SLEW_MIN_AMP", 187, TTL_Package.D_AMT );

  /**
   * Velocity Control Ramp Max. Amp.
   */
  public final static AMT_DataType D_AMT_VC_SLEW_MAX_AMP =
      new AMT_DataType( "D_AMT_VC_SLEW_MAX_AMP", 188, TTL_Package.D_AMT );

  /**
   * Position Control Sine Slew Freq.
   */
  public final static AMT_DataType D_AMT_PC_SINE_MIN_FREQ =
      new AMT_DataType( "D_AMT_PC_SINE_MIN_FREQ", 189, TTL_Package.D_AMT );

  /**
   * Position Control Sine Max. Freq.
   */
  public final static AMT_DataType D_AMT_PC_SINE_MAX_FREQ =
      new AMT_DataType( "D_AMT_PC_SINE_MAX_FREQ", 190, TTL_Package.D_AMT );

  /**
   * Position Control Sine Min. Amp.
   */
  public final static AMT_DataType D_AMT_PC_SINE_MIN_AMP =
      new AMT_DataType( "D_AMT_PC_SINE_MIN_AMP", 191, TTL_Package.D_AMT );

  /**
   * Position Control Sine Max. Amp.
   */
  public final static AMT_DataType D_AMT_PC_SINE_MAX_AMP =
      new AMT_DataType( "D_AMT_PC_SINE_MAX_AMP", 192, TTL_Package.D_AMT );

  /**
   * Position Control Cosine Slew Freq.
   */
  public final static AMT_DataType D_AMT_PC_COSINE_MIN_FREQ =
      new AMT_DataType( "D_AMT_PC_COSINE_MIN_FREQ", 193, TTL_Package.D_AMT );

  /**
   * Position Control Cosine Max. Freq.
   */
  public final static AMT_DataType D_AMT_PC_COSINE_MAX_FREQ =
      new AMT_DataType( "D_AMT_PC_COSINE_MAX_FREQ", 194, TTL_Package.D_AMT );

  /**
   * Position Control Cosine Min. Amp.
   */
  public final static AMT_DataType D_AMT_PC_COSINE_MIN_AMP =
      new AMT_DataType( "D_AMT_PC_COSINE_MIN_AMP", 195, TTL_Package.D_AMT );

  /**
   * Position Control Cosine Max. Amp.
   */
  public final static AMT_DataType D_AMT_PC_COSINE_MAX_AMP =
      new AMT_DataType( "D_AMT_PC_COSINE_MAX_AMP", 196, TTL_Package.D_AMT );

  /**
   * Position Control Slew Slew Freq.
   */
  public final static AMT_DataType D_AMT_PC_RAMP_MIN_FREQ =
      new AMT_DataType( "D_AMT_PC_RAMP_MIN_FREQ", 197, TTL_Package.D_AMT );

  /**
   * Position Control Slew Max. Freq.
   */
  public final static AMT_DataType D_AMT_PC_RAMP_MAX_FREQ =
      new AMT_DataType( "D_AMT_PC_RAMP_MAX_FREQ", 198, TTL_Package.D_AMT );

  /**
   * Position Control Slew Min. Amp.
   */
  public final static AMT_DataType D_AMT_PC_RAMP_MIN_AMP =
      new AMT_DataType( "D_AMT_PC_RAMP_MIN_AMP", 199, TTL_Package.D_AMT );

  /**
   * Position Control Slew Max. Amp.
   */
  public final static AMT_DataType D_AMT_PC_RAMP_MAX_AMP =
      new AMT_DataType( "D_AMT_PC_RAMP_MAX_AMP", 200, TTL_Package.D_AMT );

  /**
   * Position Control Square Slew Freq.
   */
  public final static AMT_DataType D_AMT_PC_SQUARE_MIN_FREQ =
      new AMT_DataType( "D_AMT_PC_SQUARE_MIN_FREQ", 201, TTL_Package.D_AMT );

  /**
   * Position Control Square Max. Freq.
   */
  public final static AMT_DataType D_AMT_PC_SQUARE_MAX_FREQ =
      new AMT_DataType( "D_AMT_PC_SQUARE_MAX_FREQ", 202, TTL_Package.D_AMT );

  /**
   * Position Control Square Min. Amp.
   */
  public final static AMT_DataType D_AMT_PC_SQUARE_MIN_AMP =
      new AMT_DataType( "D_AMT_PC_SQUARE_MIN_AMP", 203, TTL_Package.D_AMT );

  /**
   * Position Control Square Max. Amp.
   */
  public final static AMT_DataType D_AMT_PC_SQUARE_MAX_AMP =
      new AMT_DataType( "D_AMT_PC_SQUARE_MAX_AMP", 204, TTL_Package.D_AMT );

  /**
   * Position Control Ramp Slew Freq.
   */
  public final static AMT_DataType D_AMT_PC_SLEW_MIN_FREQ =
      new AMT_DataType( "D_AMT_PC_SLEW_MIN_FREQ", 205, TTL_Package.D_AMT );

  /**
   * Position Control Ramp Max. Freq.
   */
  public final static AMT_DataType D_AMT_PC_SLEW_MAX_FREQ =
      new AMT_DataType( "D_AMT_PC_SLEW_MAX_FREQ", 206, TTL_Package.D_AMT );

  /**
   * Position Control Ramp Min. Amp.
   */
  public final static AMT_DataType D_AMT_PC_SLEW_MIN_AMP =
      new AMT_DataType( "D_AMT_PC_SLEW_MIN_AMP", 207, TTL_Package.D_AMT );

  /**
   * Position Control Ramp Max. Amp.
   */
  public final static AMT_DataType D_AMT_PC_SLEW_MAX_AMP =
      new AMT_DataType( "D_AMT_PC_SLEW_MAX_AMP", 208, TTL_Package.D_AMT );

  /**
   * The starting time of the run
   */
  public final static AMT_DataType D_AMT_START_TIME =
      new AMT_DataType( "D_AMT_START_TIME", 209, TTL_Package.D_AMT );

  /**
   * The starting time of the run
   */
  public final static AMT_DataType D_AMT_START_TIME_DUMMY =
      new AMT_DataType( "D_AMT_START_TIME_DUMMY", 210, TTL_Package.D_AMT );

  /**
   * The finishing time of the run
   */
  public final static AMT_DataType D_AMT_FINISH_TIME =
      new AMT_DataType( "D_AMT_FINISH_TIME", 211, TTL_Package.D_AMT );

  /**
   * The finishing time of the run
   */
  public final static AMT_DataType D_AMT_FINISH_TIME_DUMMY =
      new AMT_DataType( "D_AMT_FINISH_TIME_DUMMY", 212, TTL_Package.D_AMT );

  /**
   * Servo algorithm version number
   */
  public final static AMT_DataType D_AMT_SERVO_CTRL_ALGORITHM_VER =
      new AMT_DataType( "D_AMT_SERVO_CTRL_ALGORITHM_VER", 213, TTL_Package.D_AMT );

  /**
   * 
   */
  public final static AMT_DataType D_AMT_DATAID_EOL =
      new AMT_DataType( "D_AMT_DATAID_EOL", 214, TTL_Package.D_AMT );

  /**
   * Array allowing serialization.
   */
  protected static final AMT_DataType[] array =
  {
    D_AMT_DATAID_BOL,
    D_AMT_PROC_STATE,
    D_AMT_APP_VERSION,
    D_AMT_TFP_SIMULATE,
    D_AMT_HHE_SIMULATE,
    D_AMT_MFC_SIMULATE,
    D_AMT_TELESCOPE_ID,
    D_AMT_AXIS_ID,
    D_AMT_AZM_NODE_ID,
    D_AMT_ALT_NODE_ID,
    D_AMT_CAS_NODE_ID,
    D_AMT_AZM_AET_PRESENT,
    D_AMT_ALT_AET_PRESENT,
    D_AMT_CAS_AET_PRESENT,
    D_AMT_AZM_AXIS_POSN_START,
    D_AMT_AZM_AXIS_POSN_FINISH,
    D_AMT_ALT_AXIS_POSN_START,
    D_AMT_ALT_AXIS_POSN_FINISH,
    D_AMT_CAS_AXIS_POSN_START,
    D_AMT_CAS_AXIS_POSN_FINISH,
    D_AMT_EXTENDED_RUN,
    D_AMT_EXTENDED_RUN_PERIOD,
    D_AMT_WATCHDOG_SETUP_PERIOD,
    D_AMT_CONTROL_ALGORITHM,
    D_AMT_CONTROL_MODE,
    D_AMT_EXCITATION_SIGNAL,
    D_AMT_EXCITATION_FREQUENCY,
    D_AMT_EXCITATION_AMPLITUDE,
    D_AMT_RAMP_NUMBER,
    D_AMT_CONTROL_ENCODER_NUM,
    D_AMT_OFF_MOUNT_TESTING,
    D_AMT_AMT_SPECIFIC_HNF_CFG,
    D_AMT_FUNC_DISP_PRELOAD,
    D_AMT_FUNC_DISP_RUNLOG,
    D_AMT_FUNC_DISP_FILEOP,
    D_AMT_ABS_ENC_DISP,
    D_AMT_MAX_VEL_RAMP_1,
    D_AMT_MAX_VEL_RAMP_2,
    D_AMT_MAX_VEL_RAMP_3,
    D_AMT_MAX_VEL_RAMP_4,
    D_AMT_MAX_VEL_RAMP_5,
    D_AMT_MAX_VEL_RAMP_6,
    D_AMT_MAX_ACCN_RAMP_1,
    D_AMT_MAX_ACCN_RAMP_2,
    D_AMT_MAX_ACCN_RAMP_3,
    D_AMT_MAX_ACCN_RAMP_4,
    D_AMT_MAX_ACCN_RAMP_5,
    D_AMT_MAX_ACCN_RAMP_6,
    D_AMT_MAX_RAMP_NUMBER,
    D_AMT_ENABLE_DRIVE_1,
    0049,
    D_AMT_ENABLE_DRIVE_2,
    D_AMT_RELEASE_BRAKE_1,
    D_AMT_RELEASE_BRAKE_2,
    D_AMT_MAX_MOTOR_TORQUE,
    D_AMT_TORQUE_CLAMP_LIMIT_LOW,
    D_AMT_MOTOR_PRELOAD_REQUIRED,
    D_AMT_PRELOAD_STG_1,
    D_AMT_PRELOAD_STG_2,
    D_AMT_NUM_OF_CYCLES_PRELOAD_STG_1,
    D_AMT_NUM_OF_CYCLES_PRELOAD_STG_2,
    D_AMT_STG1_TO_STG2_INTERVAL,
    D_AMT_NUM_COUNTS_TO_APPLY_PLOAD,
    D_AMT_PRELOAD_PAUSE_COUNT,
    D_AMT_TERM_ZERO_PRELOAD,
    D_AMT_STICTION_TORQUE_OFFSET,
    D_AMT_PID_P1_GAIN_X1E9,
    0065,
    D_AMT_PID_P2_GAIN_X1E9,
    0066,
    D_AMT_PID_K1_GAIN_X1E9,
    0067,
    D_AMT_HNF_P2_GAIN_X1E9,
    D_AMT_AXIS_VELOCITY_GAIN_X1E9,
    D_AMT_PIDVEL_FEEDBACK_FRACTION,
    D_AMT_HNFVEL_FEEDBACK_FRACTION,
    D_AMT_SWEPT_SINE_MODE,
    D_AMT_SWEPT_SINE_NUMBER,
    D_AMT_SWEPT_SINE_AMPLITUDE,
    D_AMT_DATA_FILE_FULL_HEADER,
    D_AMT_HNF_ALGOL_HEADER,
    D_AMT_MAX_LOGGING_PERIOD,
    D_AMT_LOGGING_PERIOD,
    D_AMT_RAMP_LOGGING_PERIOD,
    D_AMT_RAMP_MOTION_PERIOD,
    D_AMT_SWEPT_SINE_LOGGING_PERIOD,
    D_AMT_BRAKE_RELEASE_WAIT_COUNT,
    D_AMT_BRAKE_PREAPPLY_WAIT_COUNT,
    D_AMT_BRAKE_APPLY_WAIT_COUNT,
    D_AMT_NUM_OF_CYCLES_TO_LOG,
    D_AMT_NUM_OF_CYCLES_TO_RUN,
    D_AMT_MOTOR_FILTER_ENABLE,
    D_AMT_OUTPUT_FILTER_DENOMINATOR,
    D_AMT_OUTPUT_FILTER_C0_COEFFICIENT,
    D_AMT_OUTPUT_FILTER_D1_COEFFICIENT,
    D_AMT_HINF_FILTER_ENABLE,
    D_AMT_HINF_OUTPUTN0_FRACTION,
    D_AMT_HINF_OUTPUTN1_FRACTION,
    D_AMT_HINF_OUTPUTN2_FRACTION,
    D_AMT_HINF_OUTPUTN3_FRACTION,
    D_AMT_MIN_DAC_VALUE,
    D_AMT_MAX_DAC_VALUE,
    D_AMT_FULL_SCALE_DAC_VALUE,
    D_AMT_ZERO_OFFSET_DAC_VALUE,
    D_AMT_MOTOR_VEL_GAIN_FACTOR,
    D_AMT_AXIS_VEL_GAIN_FACTOR,
    D_AMT_PID_GAIN_SCALE_FACTOR,
    D_AMT_AXIS_MOTOR_GAIN,
    D_AMT_AXIS_AMPLIFIER_GAIN,
    D_AMT_MOTOR_GAIN_SCALE,
    D_AMT_AMPLIFIER_GAIN_SCALE,
    D_AMT_VOLTAGE_GAIN_SCALE,
    D_AMT_MAX_NUMBER_ENCODER_CARDS,
    D_AMT_MAX_NUMBER_MOTOR_ENCODERS,
    D_AMT_MAX_NUMBER_TAPE_ENCODERS,
    0110,
    D_AMT_MAX_NUMBER_LENGTH_ENCODERS,
    D_AMT_ENCODER_INTERPOLATION_BITS,
    D_AMT_ENCODER_PULSES_PER_AXIS_REV,
    D_AMT_ENCODER_PULSES_PER_MOTOR_REV,
    D_AMT_ENABLE_TAPE_ENCODERS,
    D_AMT_ENABLE_LENGTH_ENCODERS,
    D_AMT_MOTOR_ENCODERS_DIRECTION,
    D_AMT_TAPE_ENCODERS_DIRECTION,
    0118,
    D_AMT_LENGTH_ENCODERS_DIRECTION,
    0119,
    D_AMT_MOTOR_FEEDBACK,
    D_AMT_AXIS_FEEDBACK,
    D_AMT_DATA_COLLECTION_RATE,
    D_AMT_ABS_ENC_READ_RATE,
    D_AMT_CONTROLLER_DELAY,
    D_AMT_TOGGLE_HARDWARE_PULSE,
    D_AMT_HARDWARE_PULSE_RATE,
    D_AMT_TFP_SERVER_PID,
    D_AMT_AZM_ABS_ENC_PID,
    D_AMT_ALT_ABS_ENC_PID,
    D_AMT_CAS_ABS_ENC_PID,
    D_AMT_WATCHDOG_PID,
    D_AMT_DUMMY_OID_01,
    D_AMT_DUMMY_OID_02,
    D_AMT_DUMMY_OID_03,
    0134,
    D_AMT_STICTION_COMP_TOLERANCE,
    D_AMT_STICTION_COMP_POSITIVE,
    D_AMT_STICTION_COMP_NEGATIVE,
    D_AMT_TC_AXIS_REF_VEL_GAIN,
    D_AMT_VC_AXIS_REF_VEL_GAIN,
    D_AMT_PC_AXIS_REF_VEL_GAIN,
    D_AMT_TC_SINE_MIN_FREQ,
    D_AMT_TC_SINE_MAX_FREQ,
    D_AMT_TC_SINE_MIN_AMP,
    D_AMT_TC_SINE_MAX_AMP,
    D_AMT_TC_COSINE_MIN_FREQ,
    D_AMT_TC_COSINE_MAX_FREQ,
    D_AMT_TC_COSINE_MIN_AMP,
    D_AMT_TC_COSINE_MAX_AMP,
    D_AMT_TC_RAMP_MIN_FREQ,
    D_AMT_TC_RAMP_MAX_FREQ,
    D_AMT_TC_RAMP_MIN_AMP,
    D_AMT_TC_RAMP_MAX_AMP,
    D_AMT_TC_SQUARE_MIN_FREQ,
    D_AMT_TC_SQUARE_MAX_FREQ,
    D_AMT_TC_SQUARE_MIN_AMP,
    D_AMT_TC_SQUARE_MAX_AMP,
    D_AMT_TC_SLEW_MIN_FREQ,
    D_AMT_TC_SLEW_MAX_FREQ,
    D_AMT_TC_SLEW_MIN_AMP,
    D_AMT_TC_SLEW_MAX_AMP,
    D_AMT_VC_SINE_MIN_FREQ,
    D_AMT_VC_SINE_MAX_FREQ,
    D_AMT_VC_SINE_MIN_AMP,
    D_AMT_VC_SINE_MAX_AMP,
    D_AMT_VC_COSINE_MIN_FREQ,
    D_AMT_VC_COSINE_MAX_FREQ,
    D_AMT_VC_COSINE_MIN_AMP,
    D_AMT_VC_COSINE_MAX_AMP,
    D_AMT_VC_RAMP_MIN_FREQ,
    D_AMT_VC_RAMP_MAX_FREQ,
    D_AMT_VC_RAMP_MIN_AMP,
    D_AMT_VC_RAMP_MAX_AMP,
    D_AMT_VC_SQUARE_MIN_FREQ,
    D_AMT_VC_SQUARE_MAX_FREQ,
    D_AMT_VC_SQUARE_MIN_AMP,
    D_AMT_VC_SQUARE_MAX_AMP,
    D_AMT_VC_SLEW_MIN_FREQ,
    D_AMT_VC_SLEW_MAX_FREQ,
    D_AMT_VC_SLEW_MIN_AMP,
    D_AMT_VC_SLEW_MAX_AMP,
    D_AMT_PC_SINE_MIN_FREQ,
    D_AMT_PC_SINE_MAX_FREQ,
    D_AMT_PC_SINE_MIN_AMP,
    D_AMT_PC_SINE_MAX_AMP,
    D_AMT_PC_COSINE_MIN_FREQ,
    D_AMT_PC_COSINE_MAX_FREQ,
    D_AMT_PC_COSINE_MIN_AMP,
    D_AMT_PC_COSINE_MAX_AMP,
    D_AMT_PC_RAMP_MIN_FREQ,
    D_AMT_PC_RAMP_MAX_FREQ,
    D_AMT_PC_RAMP_MIN_AMP,
    D_AMT_PC_RAMP_MAX_AMP,
    D_AMT_PC_SQUARE_MIN_FREQ,
    D_AMT_PC_SQUARE_MAX_FREQ,
    D_AMT_PC_SQUARE_MIN_AMP,
    D_AMT_PC_SQUARE_MAX_AMP,
    D_AMT_PC_SLEW_MIN_FREQ,
    D_AMT_PC_SLEW_MAX_FREQ,
    D_AMT_PC_SLEW_MIN_AMP,
    D_AMT_PC_SLEW_MAX_AMP,
    D_AMT_START_TIME,
    D_AMT_START_TIME_DUMMY,
    D_AMT_FINISH_TIME,
    D_AMT_FINISH_TIME_DUMMY,
    D_AMT_SERVO_CTRL_ALGORITHM_VER,
    D_AMT_DATAID_EOL
  };


  /*=======================================================================*/
  /*                                                                       */
  /* OBJECT FIELDS.                                                        */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * String name of this type-safe enumeration.
   */
  private transient String name;

  /**
   * Optional integer for int representation of this Type-safe Enumeration.
   */
  private transient int intValue;

  /**
   * Assign an index to this enumeration.
   */
  private final int index = nextIndex++;

  /*=======================================================================*/
  /*                                                                       */
  /* CLASS METHODS.                                                        */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * Return an object reference of the AMT_DataType with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the AMT_DataType
   * @return a reference to the AMT_DataType specified by the argument
   */
  public static AMT_DataType getReference( String s )
  {
    return( (AMT_DataType)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the AMT_DataType with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the AMT_DataType
   * @return a reference to the AMT_DataType specified by the argument
   */
  public static AMT_DataType getReference( int i )
  {
    return( (AMT_DataType)( intHash.get( new Integer( i ) ) ) );
  }

  /*=======================================================================*/
  /*                                                                       */
  /* OBJECT METHODS.                                                       */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * Create an enumeration of the specified name.
   * <p>
   * <b>NOTE:</b> the <code><b>int</b></code> representation of this
   * enumeration is assigned to the index (index) of this enumeration in
   * the array.
   * @param s the name of this enumeration
   * @see #name
   * @see #intValue
   * @see #array
   */
  private AMT_DataType( String s )
  {
    name = s;
    nameHash.put( s, this );
    intValue = index;
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Create an enumeration of the specified name and int representation.
   * @param s the name of this enumeration
   * @param i the int representation of this enumeration
   * @see #name
   * @see #intValue
   * @see #array
   */
  private AMT_DataType( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this AMT_DataType.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this AMT_DataType.
   * @return intValue
   * @see #intValue
   */
  public final int getInt()
  {
    return intValue;
  }


  /**
   * Return the TTL_Package for which this data refers.
   * @return ttlPackage
   * @see #ttlPackage
   */
  public TTL_Package getTTL_Package()
  {
    return( ttlPackage );
  }


  /**
   * Over-ride the Serializable method to ensure the same Object references
   * are returned after Serialization.
   */
  private Object readResolve() throws java.io.ObjectStreamException
  {
    return( array[ index ] );
  }


  /**
   * Return the name of this enumeration.
   * @return name
   * @see #name
   */
  public String toString()
  {
    return name;
  }
}
/*
 *    $Date:$
 * $RCSfile:$
 *  $Source:$
 *      $Id:$
 *     $Log:$
 *
 */
