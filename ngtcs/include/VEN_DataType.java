package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type VEN_DataType.  These are:
 * <ul>
 * <li>D_VEN_DATAID_BOL</li>
 * <li>D_VEN_PROC_STATE</li>
 * <li>D_VEN_APP_VERSION</li>
 * <li>D_VEN_SERVER_SHUTDOWN</li>
 * <li>D_VEN_MOTOR_ENC_1_COUNT</li>
 * <li>D_VEN_MOTOR_ENC_1_COUNT_DUMMY</li>
 * <li>D_VEN_MOTOR_ENC_1_STATE</li>
 * <li>D_VEN_MOTOR_ENC_2_COUNT</li>
 * <li>D_VEN_MOTOR_ENC_2_COUNT_DUMMY</li>
 * <li>D_VEN_MOTOR_ENC_2_STATE</li>
 * <li>D_VEN_MOTOR_ENC_1_ABS_POS</li>
 * <li>D_VEN_MOTOR_ENC_1_ABS_POS_DUMMY</li>
 * <li>D_VEN_MOTOR_ENC_2_ABS_POS</li>
 * <li>D_VEN_MOTOR_ENC_2_ABS_POS_DUMMY</li>
 * <li>D_VEN_AXIS_ENC_1_COUNT</li>
 * <li>D_VEN_AXIS_ENC_1_COUNT_DUMMY</li>
 * <li>D_VEN_AXIS_ENC_1_STATE</li>
 * <li>D_VEN_AXIS_ENC_1_REF_STATE</li>
 * <li>D_VEN_AXIS_ENC_2_COUNT</li>
 * <li>D_VEN_AXIS_ENC_2_COUNT_DUMMY</li>
 * <li>D_VEN_AXIS_ENC_2_STATE</li>
 * <li>D_VEN_AXIS_ENC_2_REF_STATE</li>
 * <li>D_VEN_AXIS_ENC_3_COUNT</li>
 * <li>D_VEN_AXIS_ENC_3_COUNT_DUMMY</li>
 * <li>D_VEN_AXIS_ENC_3_STATE</li>
 * <li>D_VEN_AXIS_ENC_3_REF_STATE</li>
 * <li>D_VEN_AXIS_ENC_4_COUNT</li>
 * <li>D_VEN_AXIS_ENC_4_COUNT_DUMMY</li>
 * <li>D_VEN_AXIS_ENC_4_STATE</li>
 * <li>D_VEN_AXIS_ENC_4_REF_STATE</li>
 * <li>D_VEN_AXIS_ENC_1_OFFSET</li>
 * <li>D_VEN_AXIS_ENC_1_OFFSET_DUMMY</li>
 * <li>D_VEN_AXIS_ENC_2_OFFSET</li>
 * <li>D_VEN_AXIS_ENC_2_OFFSET_DUMMY</li>
 * <li>D_VEN_AXIS_ENC_3_OFFSET</li>
 * <li>D_VEN_AXIS_ENC_3_OFFSET_DUMMY</li>
 * <li>D_VEN_AXIS_ENC_4_OFFSET</li>
 * <li>D_VEN_AXIS_ENC_4_OFFSET_DUMMY</li>
 * <li>D_VEN_AXIS_ENC_1_ABS_POSITION</li>
 * <li>D_VEN_AXIS_ENC_2_ABS_POSITION</li>
 * <li>D_VEN_AXIS_ENC_3_ABS_POSITION</li>
 * <li>D_VEN_AXIS_ENC_4_ABS_POSITION</li>
 * <li>D_VEN_AXIS_POSITION</li>
 * <li>D_VEN_AXIS_POSITION_DUMMY</li>
 * <li>D_VEN_HOME_AXIS_ENCODER_1</li>
 * <li>D_VEN_HOME_AXIS_ENCODER_2</li>
 * <li>D_VEN_HOME_AXIS_ENCODER_3</li>
 * <li>D_VEN_HOME_AXIS_ENCODER_4</li>
 * <li>D_VEN_ABS_ENCODER_POSITION</li>
 * <li>D_VEN_ABS_ENCODER_STATUS</li>
 * <li>D_VEN_JOIN_POSITION</li>
 * <li>D_VEN_HOMING_DIRECTION</li>
 * <li>D_VEN_HEAD_1_POSITION</li>
 * <li>D_VEN_HEAD_2_POSITION</li>
 * <li>D_VEN_HEAD_3_POSITION</li>
 * <li>D_VEN_HEAD_4_POSITION</li>
 * <li>D_VEN_USED_ENCODER_MASK</li>
 * <li>D_VEN_AXIS_COUNTS_PER_REV</li>
 * <li>D_VEN_MOTOR_COUNTS_PER_REV</li>
 * <li>D_VEN_MIN_TAPE_DIFF_COUNT</li>
 * <li>D_VEN_MAX_TAPE_DIFF_COUNT</li>
 * <li>D_VEN_AXIS_ENCODER_NEG_FEEDBACK</li>
 * <li>D_VEN_MOTOR_ENCODER_NEG_FEEDBACK</li>
 * <li>D_VEN_CLOCKWISE_L1_LIMIT_POSITION</li>
 * <li>D_VEN_ANTI_CW_L1_LIMIT_POSITION</li>
 * <li>D_VEN_AXIS_ENC_1_MIN_AMPL_STATUS</li>
 * <li>D_VEN_AXIS_ENC_1_MAX_AMPL_STATUS</li>
 * <li>D_VEN_AXIS_ENC_1_CUR_AMPL_STATUS</li>
 * <li>D_VEN_AXIS_ENC_1_FREQ_EXCEEDED</li>
 * <li>D_VEN_AXIS_ENC_2_MIN_AMPL_STATUS</li>
 * <li>D_VEN_AXIS_ENC_2_MAX_AMPL_STATUS</li>
 * <li>D_VEN_AXIS_ENC_2_CUR_AMPL_STATUS</li>
 * <li>D_VEN_AXIS_ENC_2_FREQ_EXCEEDED</li>
 * <li>D_VEN_AXIS_ENC_3_MIN_AMPL_STATUS</li>
 * <li>D_VEN_AXIS_ENC_3_MAX_AMPL_STATUS</li>
 * <li>D_VEN_AXIS_ENC_3_CUR_AMPL_STATUS</li>
 * <li>D_VEN_AXIS_ENC_3_FREQ_EXCEEDED</li>
 * <li>D_VEN_AXIS_ENC_4_MIN_AMPL_STATUS</li>
 * <li>D_VEN_AXIS_ENC_4_MAX_AMPL_STATUS</li>
 * <li>D_VEN_AXIS_ENC_4_CUR_AMPL_STATUS</li>
 * <li>D_VEN_AXIS_ENC_4_FREQ_EXCEEDED</li>
 * <li>D_VEN_AXIS_ENC_1_MIN_AMPL_CHANGE</li>
 * <li>D_VEN_AXIS_ENC_1_MAX_AMPL_CHANGE</li>
 * <li>D_VEN_AXIS_ENC_1_CUR_AMPL_CHANGE</li>
 * <li>D_VEN_AXIS_ENC_2_MIN_AMPL_CHANGE</li>
 * <li>D_VEN_AXIS_ENC_2_MAX_AMPL_CHANGE</li>
 * <li>D_VEN_AXIS_ENC_2_CUR_AMPL_CHANGE</li>
 * <li>D_VEN_AXIS_ENC_3_MIN_AMPL_CHANGE</li>
 * <li>D_VEN_AXIS_ENC_3_MAX_AMPL_CHANGE</li>
 * <li>D_VEN_AXIS_ENC_3_CUR_AMPL_CHANGE</li>
 * <li>D_VEN_AXIS_ENC_4_MIN_AMPL_CHANGE</li>
 * <li>D_VEN_AXIS_ENC_4_MAX_AMPL_CHANGE</li>
 * <li>D_VEN_AXIS_ENC_4_CUR_AMPL_CHANGE</li>
 * <li>D_VEN_ABS_LIN_ENC_TOLERANCE</li>
 * <li>D_VEN_ABS_LIN_ENC_DEVIATION</li>
 * <li>D_VEN_EXPECTED_ENCODER_MASK</li>
 * <li>D_VEN_AXIS_ENC_1_STATUS_BITS</li>
 * <li>D_VEN_AXIS_ENC_2_STATUS_BITS</li>
 * <li>D_VEN_AXIS_ENC_3_STATUS_BITS</li>
 * <li>D_VEN_AXIS_ENC_4_STATUS_BITS</li>
 * <li>D_VEN_ENC_LOGGING_PERIOD</li>
 * <li>D_VEN_ENL_ENABLE_CORRECTION</li>
 * <li>D_VEN_ENL_ENC_1_OFFSET</li>
 * <li>D_VEN_ENL_ENC_2_OFFSET</li>
 * <li>D_VEN_ENL_ENC_3_OFFSET</li>
 * <li>D_VEN_ENL_ENC_4_OFFSET</li>
 * <li>D_VEN_ENL_MODEL_OFFSET</li>
 * <li>D_VEN_ENL_COS_1_COEFFICIENT</li>
 * <li>D_VEN_ENL_SIN_1_COEFFICIENT</li>
 * <li>D_VEN_ENL_COS_2_COEFFICIENT</li>
 * <li>D_VEN_ENL_SIN_2_COEFFICIENT</li>
 * <li>D_VEN_ENL_COS_3_COEFFICIENT</li>
 * <li>D_VEN_ENL_SIN_3_COEFFICIENT</li>
 * <li>D_VEN_ENL_COS_4_COEFFICIENT</li>
 * <li>D_VEN_ENL_SIN_4_COEFFICIENT</li>
 * <li>D_VEN_ENL_COS_5_COEFFICIENT</li>
 * <li>D_VEN_ENL_SIN_5_COEFFICIENT</li>
 * <li>D_VEN_ENL_COS_6_COEFFICIENT</li>
 * <li>D_VEN_ENL_SIN_6_COEFFICIENT</li>
 * <li>D_VEN_ENL_COS_7_COEFFICIENT</li>
 * <li>D_VEN_ENL_SIN_7_COEFFICIENT</li>
 * <li>D_VEN_ENL_COS_8_COEFFICIENT</li>
 * <li>D_VEN_ENL_SIN_8_COEFFICIENT</li>
 * <li>D_VEN_ENL_COS_9_COEFFICIENT</li>
 * <li>D_VEN_ENL_SIN_9_COEFFICIENT</li>
 * <li>D_VEN_ENL_COS_10_COEFFICIENT</li>
 * <li>D_VEN_ENL_SIN_10_COEFFICIENT</li>
 * <li>D_VEN_ENL_COS_11_COEFFICIENT</li>
 * <li>D_VEN_ENL_SIN_11_COEFFICIENT</li>
 * <li>D_VEN_ENL_COS_12_COEFFICIENT</li>
 * <li>D_VEN_ENL_SIN_12_COEFFICIENT</li>
 * <li>D_VEN_AXIS_HOME_ATTRACT_POSITION</li>
 * <li>D_VEN_AXIS_HOME_REPULSE_POSITION</li>
 * <li>D_VEN_DATAID_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class VEN_DataType
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
  private static final TTL_Package ttlPackage = TTL_Package.VEN;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static VEN_DataType D_VEN_DATAID_BOL =
      new VEN_DataType( "D_VEN_DATAID_BOL", 0, TTL_Package.D_VEN );

  /**
   * The VEN process state.
   */
  public final static VEN_DataType D_VEN_PROC_STATE =
      new VEN_DataType( "D_VEN_PROC_STATE", 1, TTL_Package.D_VEN );

  /**
   * VEN package revision.
   */
  public final static VEN_DataType D_VEN_APP_VERSION =
      new VEN_DataType( "D_VEN_APP_VERSION", 2, TTL_Package.D_VEN );

  /**
   * Server shutdown command flag.
   */
  public final static VEN_DataType D_VEN_SERVER_SHUTDOWN =
      new VEN_DataType( "D_VEN_SERVER_SHUTDOWN", 3, TTL_Package.D_VEN );

  /**
   * Motor 1 encoder raw count.
   */
  public final static VEN_DataType D_VEN_MOTOR_ENC_1_COUNT =
      new VEN_DataType( "D_VEN_MOTOR_ENC_1_COUNT", 4, TTL_Package.D_VEN );

  /**
   * Motor 1 encoder dummy upper word.
   */
  public final static VEN_DataType D_VEN_MOTOR_ENC_1_COUNT_DUMMY =
      new VEN_DataType( "D_VEN_MOTOR_ENC_1_COUNT_DUMMY", 5, TTL_Package.D_VEN );

  /**
   * Motor 1 encoder state.
   */
  public final static VEN_DataType D_VEN_MOTOR_ENC_1_STATE =
      new VEN_DataType( "D_VEN_MOTOR_ENC_1_STATE", 6, TTL_Package.D_VEN );

  /**
   * Motor 2 encoder raw count.
   */
  public final static VEN_DataType D_VEN_MOTOR_ENC_2_COUNT =
      new VEN_DataType( "D_VEN_MOTOR_ENC_2_COUNT", 7, TTL_Package.D_VEN );

  /**
   * Motor 2 encoder dummy upper word.
   */
  public final static VEN_DataType D_VEN_MOTOR_ENC_2_COUNT_DUMMY =
      new VEN_DataType( "D_VEN_MOTOR_ENC_2_COUNT_DUMMY", 8, TTL_Package.D_VEN );

  /**
   * Motor 2 encoder state.
   */
  public final static VEN_DataType D_VEN_MOTOR_ENC_2_STATE =
      new VEN_DataType( "D_VEN_MOTOR_ENC_2_STATE", 9, TTL_Package.D_VEN );

  /**
   * Motor encoder 1 absolute position.
   */
  public final static VEN_DataType D_VEN_MOTOR_ENC_1_ABS_POS =
      new VEN_DataType( "D_VEN_MOTOR_ENC_1_ABS_POS", 10, TTL_Package.D_VEN );

  /**
   * Motor encoder 1 absolute pos. MSWord.
   */
  public final static VEN_DataType D_VEN_MOTOR_ENC_1_ABS_POS_DUMMY =
      new VEN_DataType( "D_VEN_MOTOR_ENC_1_ABS_POS_DUMMY", 11, TTL_Package.D_VEN );

  /**
   * Motor encoder 2 absolute position.
   */
  public final static VEN_DataType D_VEN_MOTOR_ENC_2_ABS_POS =
      new VEN_DataType( "D_VEN_MOTOR_ENC_2_ABS_POS", 12, TTL_Package.D_VEN );

  /**
   * Motor encoder 2 absolute pos. MSWord.
   */
  public final static VEN_DataType D_VEN_MOTOR_ENC_2_ABS_POS_DUMMY =
      new VEN_DataType( "D_VEN_MOTOR_ENC_2_ABS_POS_DUMMY", 13, TTL_Package.D_VEN );

  /**
   * Axis encoder 1 raw count.
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_1_COUNT =
      new VEN_DataType( "D_VEN_AXIS_ENC_1_COUNT", 14, TTL_Package.D_VEN );

  /**
   * Axis encoder 1 dummy upper word.
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_1_COUNT_DUMMY =
      new VEN_DataType( "D_VEN_AXIS_ENC_1_COUNT_DUMMY", 15, TTL_Package.D_VEN );

  /**
   * Axis encoder 1 state.
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_1_STATE =
      new VEN_DataType( "D_VEN_AXIS_ENC_1_STATE", 16, TTL_Package.D_VEN );

  /**
   * Axis encoder 1 reference state.
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_1_REF_STATE =
      new VEN_DataType( "D_VEN_AXIS_ENC_1_REF_STATE", 17, TTL_Package.D_VEN );

  /**
   * Axis encoder 2 raw count.
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_2_COUNT =
      new VEN_DataType( "D_VEN_AXIS_ENC_2_COUNT", 18, TTL_Package.D_VEN );

  /**
   * Axis encoder 2 dummy upper word.
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_2_COUNT_DUMMY =
      new VEN_DataType( "D_VEN_AXIS_ENC_2_COUNT_DUMMY", 19, TTL_Package.D_VEN );

  /**
   * Axis encoder 2 state.
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_2_STATE =
      new VEN_DataType( "D_VEN_AXIS_ENC_2_STATE", 20, TTL_Package.D_VEN );

  /**
   * Axis encoder 2 reference state.
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_2_REF_STATE =
      new VEN_DataType( "D_VEN_AXIS_ENC_2_REF_STATE", 21, TTL_Package.D_VEN );

  /**
   * Axis encoder 3 raw count.
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_3_COUNT =
      new VEN_DataType( "D_VEN_AXIS_ENC_3_COUNT", 22, TTL_Package.D_VEN );

  /**
   * Axis encoder 3 dummy upper word.
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_3_COUNT_DUMMY =
      new VEN_DataType( "D_VEN_AXIS_ENC_3_COUNT_DUMMY", 23, TTL_Package.D_VEN );

  /**
   * Axis encoder 3 state.
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_3_STATE =
      new VEN_DataType( "D_VEN_AXIS_ENC_3_STATE", 24, TTL_Package.D_VEN );

  /**
   * Axis encoder 3 reference state.
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_3_REF_STATE =
      new VEN_DataType( "D_VEN_AXIS_ENC_3_REF_STATE", 25, TTL_Package.D_VEN );

  /**
   * Axis encoder 4 raw count.
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_4_COUNT =
      new VEN_DataType( "D_VEN_AXIS_ENC_4_COUNT", 26, TTL_Package.D_VEN );

  /**
   * Axis encoder 4 dummy upper word.
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_4_COUNT_DUMMY =
      new VEN_DataType( "D_VEN_AXIS_ENC_4_COUNT_DUMMY", 27, TTL_Package.D_VEN );

  /**
   * Axis encoder 4 state.
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_4_STATE =
      new VEN_DataType( "D_VEN_AXIS_ENC_4_STATE", 28, TTL_Package.D_VEN );

  /**
   * Axis encoder 4 reference state.
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_4_REF_STATE =
      new VEN_DataType( "D_VEN_AXIS_ENC_4_REF_STATE", 29, TTL_Package.D_VEN );

  /**
   * Axis encoder 1 counter offset.
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_1_OFFSET =
      new VEN_DataType( "D_VEN_AXIS_ENC_1_OFFSET", 30, TTL_Package.D_VEN );

  /**
   * Axis encoder 1 offset dummy word.
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_1_OFFSET_DUMMY =
      new VEN_DataType( "D_VEN_AXIS_ENC_1_OFFSET_DUMMY", 31, TTL_Package.D_VEN );

  /**
   * Axis encoder 2 counter offset.
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_2_OFFSET =
      new VEN_DataType( "D_VEN_AXIS_ENC_2_OFFSET", 32, TTL_Package.D_VEN );

  /**
   * Axis encoder 2 offset dummy word.
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_2_OFFSET_DUMMY =
      new VEN_DataType( "D_VEN_AXIS_ENC_2_OFFSET_DUMMY", 33, TTL_Package.D_VEN );

  /**
   * Axis encoder 3 counter offset.
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_3_OFFSET =
      new VEN_DataType( "D_VEN_AXIS_ENC_3_OFFSET", 34, TTL_Package.D_VEN );

  /**
   * Axis encoder 3 offset dummy word.
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_3_OFFSET_DUMMY =
      new VEN_DataType( "D_VEN_AXIS_ENC_3_OFFSET_DUMMY", 35, TTL_Package.D_VEN );

  /**
   * Axis encoder 4 counter offset.
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_4_OFFSET =
      new VEN_DataType( "D_VEN_AXIS_ENC_4_OFFSET", 36, TTL_Package.D_VEN );

  /**
   * Axis encoder 4 offset dummy word.
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_4_OFFSET_DUMMY =
      new VEN_DataType( "D_VEN_AXIS_ENC_4_OFFSET_DUMMY", 37, TTL_Package.D_VEN );

  /**
   * Axis encoder 1 absolute position.
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_1_ABS_POSITION =
      new VEN_DataType( "D_VEN_AXIS_ENC_1_ABS_POSITION", 38, TTL_Package.D_VEN );

  /**
   * Axis encoder 2 absolute position.
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_2_ABS_POSITION =
      new VEN_DataType( "D_VEN_AXIS_ENC_2_ABS_POSITION", 39, TTL_Package.D_VEN );

  /**
   * Axis encoder 3 absolute position.
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_3_ABS_POSITION =
      new VEN_DataType( "D_VEN_AXIS_ENC_3_ABS_POSITION", 40, TTL_Package.D_VEN );

  /**
   * Axis encoder 4 absolute position.
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_4_ABS_POSITION =
      new VEN_DataType( "D_VEN_AXIS_ENC_4_ABS_POSITION", 41, TTL_Package.D_VEN );

  /**
   * Our final measurement of axis pos.
   */
  public final static VEN_DataType D_VEN_AXIS_POSITION =
      new VEN_DataType( "D_VEN_AXIS_POSITION", 42, TTL_Package.D_VEN );

  /**
   * Final axis pos. measurment MSWord.
   */
  public final static VEN_DataType D_VEN_AXIS_POSITION_DUMMY =
      new VEN_DataType( "D_VEN_AXIS_POSITION_DUMMY", 43, TTL_Package.D_VEN );

  /**
   * Start axis encoder 1 homing.
   */
  public final static VEN_DataType D_VEN_HOME_AXIS_ENCODER_1 =
      new VEN_DataType( "D_VEN_HOME_AXIS_ENCODER_1", 44, TTL_Package.D_VEN );

  /**
   * Start axis encoder 2 homing.
   */
  public final static VEN_DataType D_VEN_HOME_AXIS_ENCODER_2 =
      new VEN_DataType( "D_VEN_HOME_AXIS_ENCODER_2", 45, TTL_Package.D_VEN );

  /**
   * Start axis encoder 3 homing.
   */
  public final static VEN_DataType D_VEN_HOME_AXIS_ENCODER_3 =
      new VEN_DataType( "D_VEN_HOME_AXIS_ENCODER_3", 46, TTL_Package.D_VEN );

  /**
   * Start axis encoder 4 homing.
   */
  public final static VEN_DataType D_VEN_HOME_AXIS_ENCODER_4 =
      new VEN_DataType( "D_VEN_HOME_AXIS_ENCODER_4", 47, TTL_Package.D_VEN );

  /**
   * Absolute encoder position.
   */
  public final static VEN_DataType D_VEN_ABS_ENCODER_POSITION =
      new VEN_DataType( "D_VEN_ABS_ENCODER_POSITION", 48, TTL_Package.D_VEN );

  /**
   * Absolute encoder status.
   */
  public final static VEN_DataType D_VEN_ABS_ENCODER_STATUS =
      new VEN_DataType( "D_VEN_ABS_ENCODER_STATUS", 49, TTL_Package.D_VEN );

  /**
   * Join position
   */
  public final static VEN_DataType D_VEN_JOIN_POSITION =
      new VEN_DataType( "D_VEN_JOIN_POSITION", 50, TTL_Package.D_VEN );

  /**
   * Direction to home the axis.
   */
  public final static VEN_DataType D_VEN_HOMING_DIRECTION =
      new VEN_DataType( "D_VEN_HOMING_DIRECTION", 51, TTL_Package.D_VEN );

  /**
   * Head 1 position w.r.t. abs enc zero.
   */
  public final static VEN_DataType D_VEN_HEAD_1_POSITION =
      new VEN_DataType( "D_VEN_HEAD_1_POSITION", 52, TTL_Package.D_VEN );

  /**
   * Head 2 position w.r.t. abs enc zero.
   */
  public final static VEN_DataType D_VEN_HEAD_2_POSITION =
      new VEN_DataType( "D_VEN_HEAD_2_POSITION", 53, TTL_Package.D_VEN );

  /**
   * Head 3 position w.r.t. abs enc zero.
   */
  public final static VEN_DataType D_VEN_HEAD_3_POSITION =
      new VEN_DataType( "D_VEN_HEAD_3_POSITION", 54, TTL_Package.D_VEN );

  /**
   * Head 4 position w.r.t. abs enc zero.
   */
  public final static VEN_DataType D_VEN_HEAD_4_POSITION =
      new VEN_DataType( "D_VEN_HEAD_4_POSITION", 55, TTL_Package.D_VEN );

  /**
   * Mask showing which encoders are used.
   */
  public final static VEN_DataType D_VEN_USED_ENCODER_MASK =
      new VEN_DataType( "D_VEN_USED_ENCODER_MASK", 56, TTL_Package.D_VEN );

  /**
   * No. of axis encoder counts per rev.
   */
  public final static VEN_DataType D_VEN_AXIS_COUNTS_PER_REV =
      new VEN_DataType( "D_VEN_AXIS_COUNTS_PER_REV", 57, TTL_Package.D_VEN );

  /**
   * No. of motor encoder counts per rev.
   */
  public final static VEN_DataType D_VEN_MOTOR_COUNTS_PER_REV =
      new VEN_DataType( "D_VEN_MOTOR_COUNTS_PER_REV", 58, TTL_Package.D_VEN );

  /**
   * Minimum tape difference count value.
   */
  public final static VEN_DataType D_VEN_MIN_TAPE_DIFF_COUNT =
      new VEN_DataType( "D_VEN_MIN_TAPE_DIFF_COUNT", 59, TTL_Package.D_VEN );

  /**
   * Maximum tape difference count value.
   */
  public final static VEN_DataType D_VEN_MAX_TAPE_DIFF_COUNT =
      new VEN_DataType( "D_VEN_MAX_TAPE_DIFF_COUNT", 60, TTL_Package.D_VEN );

  /**
   * Enable inversion of axis feedback.
   */
  public final static VEN_DataType D_VEN_AXIS_ENCODER_NEG_FEEDBACK =
      new VEN_DataType( "D_VEN_AXIS_ENCODER_NEG_FEEDBACK", 61, TTL_Package.D_VEN );

  /**
   * Enable inversion of motor feedback.
   */
  public final static VEN_DataType D_VEN_MOTOR_ENCODER_NEG_FEEDBACK =
      new VEN_DataType( "D_VEN_MOTOR_ENCODER_NEG_FEEDBACK", 62, TTL_Package.D_VEN );

  /**
   * Clockwise L1 limit position.
   */
  public final static VEN_DataType D_VEN_CLOCKWISE_L1_LIMIT_POSITION =
      new VEN_DataType( "D_VEN_CLOCKWISE_L1_LIMIT_POSITION", 63, TTL_Package.D_VEN );

  /**
   * Anti clockwise L1 limit position.
   */
  public final static VEN_DataType D_VEN_ANTI_CW_L1_LIMIT_POSITION =
      new VEN_DataType( "D_VEN_ANTI_CW_L1_LIMIT_POSITION", 64, TTL_Package.D_VEN );

  /**
   * Head 1 min. signal amplitude status
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_1_MIN_AMPL_STATUS =
      new VEN_DataType( "D_VEN_AXIS_ENC_1_MIN_AMPL_STATUS", 65, TTL_Package.D_VEN );

  /**
   * Head 1 max. signal amplitude status
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_1_MAX_AMPL_STATUS =
      new VEN_DataType( "D_VEN_AXIS_ENC_1_MAX_AMPL_STATUS", 66, TTL_Package.D_VEN );

  /**
   * Head 1 cur. signal amplitude status
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_1_CUR_AMPL_STATUS =
      new VEN_DataType( "D_VEN_AXIS_ENC_1_CUR_AMPL_STATUS", 67, TTL_Package.D_VEN );

  /**
   * Head 1 signal frequency exceeded
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_1_FREQ_EXCEEDED =
      new VEN_DataType( "D_VEN_AXIS_ENC_1_FREQ_EXCEEDED", 68, TTL_Package.D_VEN );

  /**
   * Head 2 min. signal amplitude status
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_2_MIN_AMPL_STATUS =
      new VEN_DataType( "D_VEN_AXIS_ENC_2_MIN_AMPL_STATUS", 69, TTL_Package.D_VEN );

  /**
   * Head 2 max. signal amplitude status
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_2_MAX_AMPL_STATUS =
      new VEN_DataType( "D_VEN_AXIS_ENC_2_MAX_AMPL_STATUS", 70, TTL_Package.D_VEN );

  /**
   * Head 2 cur. signal amplitude status
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_2_CUR_AMPL_STATUS =
      new VEN_DataType( "D_VEN_AXIS_ENC_2_CUR_AMPL_STATUS", 71, TTL_Package.D_VEN );

  /**
   * Head 2 signal frequency exceeded
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_2_FREQ_EXCEEDED =
      new VEN_DataType( "D_VEN_AXIS_ENC_2_FREQ_EXCEEDED", 72, TTL_Package.D_VEN );

  /**
   * Head 3 min. signal amplitude status
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_3_MIN_AMPL_STATUS =
      new VEN_DataType( "D_VEN_AXIS_ENC_3_MIN_AMPL_STATUS", 73, TTL_Package.D_VEN );

  /**
   * Head 3 max. signal amplitude status
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_3_MAX_AMPL_STATUS =
      new VEN_DataType( "D_VEN_AXIS_ENC_3_MAX_AMPL_STATUS", 74, TTL_Package.D_VEN );

  /**
   * Head 3 cur. signal amplitude status
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_3_CUR_AMPL_STATUS =
      new VEN_DataType( "D_VEN_AXIS_ENC_3_CUR_AMPL_STATUS", 75, TTL_Package.D_VEN );

  /**
   * Head 3 signal frequency exceeded
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_3_FREQ_EXCEEDED =
      new VEN_DataType( "D_VEN_AXIS_ENC_3_FREQ_EXCEEDED", 76, TTL_Package.D_VEN );

  /**
   * Head 4 min. signal amplitude status
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_4_MIN_AMPL_STATUS =
      new VEN_DataType( "D_VEN_AXIS_ENC_4_MIN_AMPL_STATUS", 77, TTL_Package.D_VEN );

  /**
   * Head 4 max. signal amplitude status
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_4_MAX_AMPL_STATUS =
      new VEN_DataType( "D_VEN_AXIS_ENC_4_MAX_AMPL_STATUS", 78, TTL_Package.D_VEN );

  /**
   * Head 4 cur. signal amplitude status
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_4_CUR_AMPL_STATUS =
      new VEN_DataType( "D_VEN_AXIS_ENC_4_CUR_AMPL_STATUS", 79, TTL_Package.D_VEN );

  /**
   * Head 4 signal frequency exceeded
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_4_FREQ_EXCEEDED =
      new VEN_DataType( "D_VEN_AXIS_ENC_4_FREQ_EXCEEDED", 80, TTL_Package.D_VEN );

  /**
   * Head 1 min.sig.ampl. status changes
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_1_MIN_AMPL_CHANGE =
      new VEN_DataType( "D_VEN_AXIS_ENC_1_MIN_AMPL_CHANGE", 81, TTL_Package.D_VEN );

  /**
   * Head 1 max.sig.ampl. status changes
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_1_MAX_AMPL_CHANGE =
      new VEN_DataType( "D_VEN_AXIS_ENC_1_MAX_AMPL_CHANGE", 82, TTL_Package.D_VEN );

  /**
   * Head 1 cur.sig.ampl. status changes
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_1_CUR_AMPL_CHANGE =
      new VEN_DataType( "D_VEN_AXIS_ENC_1_CUR_AMPL_CHANGE", 83, TTL_Package.D_VEN );

  /**
   * Head 2 min.sig.ampl. status changes
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_2_MIN_AMPL_CHANGE =
      new VEN_DataType( "D_VEN_AXIS_ENC_2_MIN_AMPL_CHANGE", 84, TTL_Package.D_VEN );

  /**
   * Head 2 max.sig.ampl. status changes
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_2_MAX_AMPL_CHANGE =
      new VEN_DataType( "D_VEN_AXIS_ENC_2_MAX_AMPL_CHANGE", 85, TTL_Package.D_VEN );

  /**
   * Head 2 cur.sig.ampl. status changes
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_2_CUR_AMPL_CHANGE =
      new VEN_DataType( "D_VEN_AXIS_ENC_2_CUR_AMPL_CHANGE", 86, TTL_Package.D_VEN );

  /**
   * Head 3 min.sig.ampl. status changes
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_3_MIN_AMPL_CHANGE =
      new VEN_DataType( "D_VEN_AXIS_ENC_3_MIN_AMPL_CHANGE", 87, TTL_Package.D_VEN );

  /**
   * Head 3 max.sig.ampl. status changes
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_3_MAX_AMPL_CHANGE =
      new VEN_DataType( "D_VEN_AXIS_ENC_3_MAX_AMPL_CHANGE", 88, TTL_Package.D_VEN );

  /**
   * Head 3 cur.sig.ampl. status changes
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_3_CUR_AMPL_CHANGE =
      new VEN_DataType( "D_VEN_AXIS_ENC_3_CUR_AMPL_CHANGE", 89, TTL_Package.D_VEN );

  /**
   * Head 4 min.sig.ampl. status changes
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_4_MIN_AMPL_CHANGE =
      new VEN_DataType( "D_VEN_AXIS_ENC_4_MIN_AMPL_CHANGE", 90, TTL_Package.D_VEN );

  /**
   * Head 4 max.sig.ampl. status changes
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_4_MAX_AMPL_CHANGE =
      new VEN_DataType( "D_VEN_AXIS_ENC_4_MAX_AMPL_CHANGE", 91, TTL_Package.D_VEN );

  /**
   * Head 4 cur.sig.ampl. status changes
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_4_CUR_AMPL_CHANGE =
      new VEN_DataType( "D_VEN_AXIS_ENC_4_CUR_AMPL_CHANGE", 92, TTL_Package.D_VEN );

  /**
   * Max.allowed deviation between encs.
   */
  public final static VEN_DataType D_VEN_ABS_LIN_ENC_TOLERANCE =
      new VEN_DataType( "D_VEN_ABS_LIN_ENC_TOLERANCE", 93, TTL_Package.D_VEN );

  /**
   * Max.deviation between lin
   */
  public final static VEN_DataType D_VEN_ABS_LIN_ENC_DEVIATION =
      new VEN_DataType( "D_VEN_ABS_LIN_ENC_DEVIATION", 94, TTL_Package.D_VEN );

  /**
   * Number of encoders installed
   */
  public final static VEN_DataType D_VEN_EXPECTED_ENCODER_MASK =
      new VEN_DataType( "D_VEN_EXPECTED_ENCODER_MASK", 95, TTL_Package.D_VEN );

  /**
   * Status bits from HHE encoder head 1
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_1_STATUS_BITS =
      new VEN_DataType( "D_VEN_AXIS_ENC_1_STATUS_BITS", 96, TTL_Package.D_VEN );

  /**
   * Status bits from HHE encoder head 2
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_2_STATUS_BITS =
      new VEN_DataType( "D_VEN_AXIS_ENC_2_STATUS_BITS", 97, TTL_Package.D_VEN );

  /**
   * Status bits from HHE encoder head 3
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_3_STATUS_BITS =
      new VEN_DataType( "D_VEN_AXIS_ENC_3_STATUS_BITS", 98, TTL_Package.D_VEN );

  /**
   * Status bits from HHE encoder head 4
   */
  public final static VEN_DataType D_VEN_AXIS_ENC_4_STATUS_BITS =
      new VEN_DataType( "D_VEN_AXIS_ENC_4_STATUS_BITS", 99, TTL_Package.D_VEN );

  /**
   * No.cycles at which enc.vals logged
   */
  public final static VEN_DataType D_VEN_ENC_LOGGING_PERIOD =
      new VEN_DataType( "D_VEN_ENC_LOGGING_PERIOD", 100, TTL_Package.D_VEN );

  /**
   * Enable enc.non linearity correct'ns
   */
  public final static VEN_DataType D_VEN_ENL_ENABLE_CORRECTION =
      new VEN_DataType( "D_VEN_ENL_ENABLE_CORRECTION", 101, TTL_Package.D_VEN );

  /**
   * Offset between enc. and axis pos'ns
   */
  public final static VEN_DataType D_VEN_ENL_ENC_1_OFFSET =
      new VEN_DataType( "D_VEN_ENL_ENC_1_OFFSET", 102, TTL_Package.D_VEN );

  /**
   * Offset between enc. and axis pos'ns
   */
  public final static VEN_DataType D_VEN_ENL_ENC_2_OFFSET =
      new VEN_DataType( "D_VEN_ENL_ENC_2_OFFSET", 103, TTL_Package.D_VEN );

  /**
   * Offset between enc. and axis pos'ns
   */
  public final static VEN_DataType D_VEN_ENL_ENC_3_OFFSET =
      new VEN_DataType( "D_VEN_ENL_ENC_3_OFFSET", 104, TTL_Package.D_VEN );

  /**
   * Offset between enc. and axis pos'ns
   */
  public final static VEN_DataType D_VEN_ENL_ENC_4_OFFSET =
      new VEN_DataType( "D_VEN_ENL_ENC_4_OFFSET", 105, TTL_Package.D_VEN );

  /**
   * Offset of the enc.non linearity Fn.
   */
  public final static VEN_DataType D_VEN_ENL_MODEL_OFFSET =
      new VEN_DataType( "D_VEN_ENL_MODEL_OFFSET", 106, TTL_Package.D_VEN );

  /**
   * Enc.NonLin Fn. cosine coefficient 1
   */
  public final static VEN_DataType D_VEN_ENL_COS_1_COEFFICIENT =
      new VEN_DataType( "D_VEN_ENL_COS_1_COEFFICIENT", 107, TTL_Package.D_VEN );

  /**
   * Enc.NonLin Fn. sine coefficient 1
   */
  public final static VEN_DataType D_VEN_ENL_SIN_1_COEFFICIENT =
      new VEN_DataType( "D_VEN_ENL_SIN_1_COEFFICIENT", 108, TTL_Package.D_VEN );

  /**
   * Enc.NonLin Fn. cosine coefficient 2
   */
  public final static VEN_DataType D_VEN_ENL_COS_2_COEFFICIENT =
      new VEN_DataType( "D_VEN_ENL_COS_2_COEFFICIENT", 109, TTL_Package.D_VEN );

  /**
   * Enc.NonLin Fn. sine coefficient 2
   */
  public final static VEN_DataType D_VEN_ENL_SIN_2_COEFFICIENT =
      new VEN_DataType( "D_VEN_ENL_SIN_2_COEFFICIENT", 110, TTL_Package.D_VEN );

  /**
   * Enc.NonLin Fn. cosine coefficient 3
   */
  public final static VEN_DataType D_VEN_ENL_COS_3_COEFFICIENT =
      new VEN_DataType( "D_VEN_ENL_COS_3_COEFFICIENT", 111, TTL_Package.D_VEN );

  /**
   * Enc.NonLin Fn. sine coefficient 3
   */
  public final static VEN_DataType D_VEN_ENL_SIN_3_COEFFICIENT =
      new VEN_DataType( "D_VEN_ENL_SIN_3_COEFFICIENT", 112, TTL_Package.D_VEN );

  /**
   * Enc.NonLin Fn. cosine coefficient 4
   */
  public final static VEN_DataType D_VEN_ENL_COS_4_COEFFICIENT =
      new VEN_DataType( "D_VEN_ENL_COS_4_COEFFICIENT", 113, TTL_Package.D_VEN );

  /**
   * Enc.NonLin Fn. sine coefficient 4
   */
  public final static VEN_DataType D_VEN_ENL_SIN_4_COEFFICIENT =
      new VEN_DataType( "D_VEN_ENL_SIN_4_COEFFICIENT", 114, TTL_Package.D_VEN );

  /**
   * Enc.NonLin Fn. cosine coefficient 5
   */
  public final static VEN_DataType D_VEN_ENL_COS_5_COEFFICIENT =
      new VEN_DataType( "D_VEN_ENL_COS_5_COEFFICIENT", 115, TTL_Package.D_VEN );

  /**
   * Enc.NonLin Fn. sine coefficient 5
   */
  public final static VEN_DataType D_VEN_ENL_SIN_5_COEFFICIENT =
      new VEN_DataType( "D_VEN_ENL_SIN_5_COEFFICIENT", 116, TTL_Package.D_VEN );

  /**
   * Enc.NonLin Fn. cosine coefficient 6
   */
  public final static VEN_DataType D_VEN_ENL_COS_6_COEFFICIENT =
      new VEN_DataType( "D_VEN_ENL_COS_6_COEFFICIENT", 117, TTL_Package.D_VEN );

  /**
   * Enc.NonLin Fn. sine coefficient 6
   */
  public final static VEN_DataType D_VEN_ENL_SIN_6_COEFFICIENT =
      new VEN_DataType( "D_VEN_ENL_SIN_6_COEFFICIENT", 118, TTL_Package.D_VEN );

  /**
   * Enc.NonLin Fn. cosine coefficient 7
   */
  public final static VEN_DataType D_VEN_ENL_COS_7_COEFFICIENT =
      new VEN_DataType( "D_VEN_ENL_COS_7_COEFFICIENT", 119, TTL_Package.D_VEN );

  /**
   * Enc.NonLin Fn. sine coefficient 7
   */
  public final static VEN_DataType D_VEN_ENL_SIN_7_COEFFICIENT =
      new VEN_DataType( "D_VEN_ENL_SIN_7_COEFFICIENT", 120, TTL_Package.D_VEN );

  /**
   * Enc.NonLin Fn. cosine coefficient 8
   */
  public final static VEN_DataType D_VEN_ENL_COS_8_COEFFICIENT =
      new VEN_DataType( "D_VEN_ENL_COS_8_COEFFICIENT", 121, TTL_Package.D_VEN );

  /**
   * Enc.NonLin Fn. sine coefficient 8
   */
  public final static VEN_DataType D_VEN_ENL_SIN_8_COEFFICIENT =
      new VEN_DataType( "D_VEN_ENL_SIN_8_COEFFICIENT", 122, TTL_Package.D_VEN );

  /**
   * Enc.NonLin Fn. cosine coefficient 9
   */
  public final static VEN_DataType D_VEN_ENL_COS_9_COEFFICIENT =
      new VEN_DataType( "D_VEN_ENL_COS_9_COEFFICIENT", 123, TTL_Package.D_VEN );

  /**
   * Enc.NonLin Fn. sine coefficient 9
   */
  public final static VEN_DataType D_VEN_ENL_SIN_9_COEFFICIENT =
      new VEN_DataType( "D_VEN_ENL_SIN_9_COEFFICIENT", 124, TTL_Package.D_VEN );

  /**
   * Enc.NonLin Fn. cosine coefficient 10
   */
  public final static VEN_DataType D_VEN_ENL_COS_10_COEFFICIENT =
      new VEN_DataType( "D_VEN_ENL_COS_10_COEFFICIENT", 125, TTL_Package.D_VEN );

  /**
   * Enc.NonLin Fn. sine coefficient 10
   */
  public final static VEN_DataType D_VEN_ENL_SIN_10_COEFFICIENT =
      new VEN_DataType( "D_VEN_ENL_SIN_10_COEFFICIENT", 126, TTL_Package.D_VEN );

  /**
   * Enc.NonLin Fn. cosine coefficient 11
   */
  public final static VEN_DataType D_VEN_ENL_COS_11_COEFFICIENT =
      new VEN_DataType( "D_VEN_ENL_COS_11_COEFFICIENT", 127, TTL_Package.D_VEN );

  /**
   * Enc.NonLin Fn. sine coefficient 11
   */
  public final static VEN_DataType D_VEN_ENL_SIN_11_COEFFICIENT =
      new VEN_DataType( "D_VEN_ENL_SIN_11_COEFFICIENT", 128, TTL_Package.D_VEN );

  /**
   * Enc.NonLin Fn. cosine coefficient 12
   */
  public final static VEN_DataType D_VEN_ENL_COS_12_COEFFICIENT =
      new VEN_DataType( "D_VEN_ENL_COS_12_COEFFICIENT", 129, TTL_Package.D_VEN );

  /**
   * Enc.NonLin Fn. sine coefficient 12
   */
  public final static VEN_DataType D_VEN_ENL_SIN_12_COEFFICIENT =
      new VEN_DataType( "D_VEN_ENL_SIN_12_COEFFICIENT", 130, TTL_Package.D_VEN );

  /**
   * Axis pos'n towards which to home
   */
  public final static VEN_DataType D_VEN_AXIS_HOME_ATTRACT_POSITION =
      new VEN_DataType( "D_VEN_AXIS_HOME_ATTRACT_POSITION", 131, TTL_Package.D_VEN );

  /**
   * Axis pos'n away from which to home
   */
  public final static VEN_DataType D_VEN_AXIS_HOME_REPULSE_POSITION =
      new VEN_DataType( "D_VEN_AXIS_HOME_REPULSE_POSITION", 132, TTL_Package.D_VEN );

  /**
   * 
   */
  public final static VEN_DataType D_VEN_DATAID_EOL =
      new VEN_DataType( "D_VEN_DATAID_EOL", 133, TTL_Package.D_VEN );

  /**
   * Array allowing serialization.
   */
  protected static final VEN_DataType[] array =
  {
    D_VEN_DATAID_BOL,
    D_VEN_PROC_STATE,
    D_VEN_APP_VERSION,
    D_VEN_SERVER_SHUTDOWN,
    D_VEN_MOTOR_ENC_1_COUNT,
    D_VEN_MOTOR_ENC_1_COUNT_DUMMY,
    D_VEN_MOTOR_ENC_1_STATE,
    D_VEN_MOTOR_ENC_2_COUNT,
    D_VEN_MOTOR_ENC_2_COUNT_DUMMY,
    D_VEN_MOTOR_ENC_2_STATE,
    D_VEN_MOTOR_ENC_1_ABS_POS,
    D_VEN_MOTOR_ENC_1_ABS_POS_DUMMY,
    D_VEN_MOTOR_ENC_2_ABS_POS,
    D_VEN_MOTOR_ENC_2_ABS_POS_DUMMY,
    D_VEN_AXIS_ENC_1_COUNT,
    D_VEN_AXIS_ENC_1_COUNT_DUMMY,
    D_VEN_AXIS_ENC_1_STATE,
    D_VEN_AXIS_ENC_1_REF_STATE,
    D_VEN_AXIS_ENC_2_COUNT,
    D_VEN_AXIS_ENC_2_COUNT_DUMMY,
    D_VEN_AXIS_ENC_2_STATE,
    D_VEN_AXIS_ENC_2_REF_STATE,
    D_VEN_AXIS_ENC_3_COUNT,
    D_VEN_AXIS_ENC_3_COUNT_DUMMY,
    D_VEN_AXIS_ENC_3_STATE,
    D_VEN_AXIS_ENC_3_REF_STATE,
    D_VEN_AXIS_ENC_4_COUNT,
    D_VEN_AXIS_ENC_4_COUNT_DUMMY,
    D_VEN_AXIS_ENC_4_STATE,
    D_VEN_AXIS_ENC_4_REF_STATE,
    D_VEN_AXIS_ENC_1_OFFSET,
    D_VEN_AXIS_ENC_1_OFFSET_DUMMY,
    D_VEN_AXIS_ENC_2_OFFSET,
    D_VEN_AXIS_ENC_2_OFFSET_DUMMY,
    D_VEN_AXIS_ENC_3_OFFSET,
    D_VEN_AXIS_ENC_3_OFFSET_DUMMY,
    D_VEN_AXIS_ENC_4_OFFSET,
    D_VEN_AXIS_ENC_4_OFFSET_DUMMY,
    D_VEN_AXIS_ENC_1_ABS_POSITION,
    D_VEN_AXIS_ENC_2_ABS_POSITION,
    D_VEN_AXIS_ENC_3_ABS_POSITION,
    D_VEN_AXIS_ENC_4_ABS_POSITION,
    D_VEN_AXIS_POSITION,
    D_VEN_AXIS_POSITION_DUMMY,
    D_VEN_HOME_AXIS_ENCODER_1,
    D_VEN_HOME_AXIS_ENCODER_2,
    D_VEN_HOME_AXIS_ENCODER_3,
    D_VEN_HOME_AXIS_ENCODER_4,
    D_VEN_ABS_ENCODER_POSITION,
    D_VEN_ABS_ENCODER_STATUS,
    D_VEN_JOIN_POSITION,
    D_VEN_HOMING_DIRECTION,
    D_VEN_HEAD_1_POSITION,
    D_VEN_HEAD_2_POSITION,
    D_VEN_HEAD_3_POSITION,
    D_VEN_HEAD_4_POSITION,
    D_VEN_USED_ENCODER_MASK,
    D_VEN_AXIS_COUNTS_PER_REV,
    D_VEN_MOTOR_COUNTS_PER_REV,
    D_VEN_MIN_TAPE_DIFF_COUNT,
    D_VEN_MAX_TAPE_DIFF_COUNT,
    D_VEN_AXIS_ENCODER_NEG_FEEDBACK,
    D_VEN_MOTOR_ENCODER_NEG_FEEDBACK,
    D_VEN_CLOCKWISE_L1_LIMIT_POSITION,
    D_VEN_ANTI_CW_L1_LIMIT_POSITION,
    D_VEN_AXIS_ENC_1_MIN_AMPL_STATUS,
    D_VEN_AXIS_ENC_1_MAX_AMPL_STATUS,
    D_VEN_AXIS_ENC_1_CUR_AMPL_STATUS,
    D_VEN_AXIS_ENC_1_FREQ_EXCEEDED,
    D_VEN_AXIS_ENC_2_MIN_AMPL_STATUS,
    D_VEN_AXIS_ENC_2_MAX_AMPL_STATUS,
    D_VEN_AXIS_ENC_2_CUR_AMPL_STATUS,
    D_VEN_AXIS_ENC_2_FREQ_EXCEEDED,
    D_VEN_AXIS_ENC_3_MIN_AMPL_STATUS,
    D_VEN_AXIS_ENC_3_MAX_AMPL_STATUS,
    D_VEN_AXIS_ENC_3_CUR_AMPL_STATUS,
    D_VEN_AXIS_ENC_3_FREQ_EXCEEDED,
    D_VEN_AXIS_ENC_4_MIN_AMPL_STATUS,
    D_VEN_AXIS_ENC_4_MAX_AMPL_STATUS,
    D_VEN_AXIS_ENC_4_CUR_AMPL_STATUS,
    D_VEN_AXIS_ENC_4_FREQ_EXCEEDED,
    D_VEN_AXIS_ENC_1_MIN_AMPL_CHANGE,
    D_VEN_AXIS_ENC_1_MAX_AMPL_CHANGE,
    D_VEN_AXIS_ENC_1_CUR_AMPL_CHANGE,
    D_VEN_AXIS_ENC_2_MIN_AMPL_CHANGE,
    D_VEN_AXIS_ENC_2_MAX_AMPL_CHANGE,
    D_VEN_AXIS_ENC_2_CUR_AMPL_CHANGE,
    D_VEN_AXIS_ENC_3_MIN_AMPL_CHANGE,
    D_VEN_AXIS_ENC_3_MAX_AMPL_CHANGE,
    D_VEN_AXIS_ENC_3_CUR_AMPL_CHANGE,
    D_VEN_AXIS_ENC_4_MIN_AMPL_CHANGE,
    D_VEN_AXIS_ENC_4_MAX_AMPL_CHANGE,
    D_VEN_AXIS_ENC_4_CUR_AMPL_CHANGE,
    D_VEN_ABS_LIN_ENC_TOLERANCE,
    D_VEN_ABS_LIN_ENC_DEVIATION,
    D_VEN_EXPECTED_ENCODER_MASK,
    D_VEN_AXIS_ENC_1_STATUS_BITS,
    D_VEN_AXIS_ENC_2_STATUS_BITS,
    D_VEN_AXIS_ENC_3_STATUS_BITS,
    D_VEN_AXIS_ENC_4_STATUS_BITS,
    D_VEN_ENC_LOGGING_PERIOD,
    D_VEN_ENL_ENABLE_CORRECTION,
    D_VEN_ENL_ENC_1_OFFSET,
    D_VEN_ENL_ENC_2_OFFSET,
    D_VEN_ENL_ENC_3_OFFSET,
    D_VEN_ENL_ENC_4_OFFSET,
    D_VEN_ENL_MODEL_OFFSET,
    D_VEN_ENL_COS_1_COEFFICIENT,
    D_VEN_ENL_SIN_1_COEFFICIENT,
    D_VEN_ENL_COS_2_COEFFICIENT,
    D_VEN_ENL_SIN_2_COEFFICIENT,
    D_VEN_ENL_COS_3_COEFFICIENT,
    D_VEN_ENL_SIN_3_COEFFICIENT,
    D_VEN_ENL_COS_4_COEFFICIENT,
    D_VEN_ENL_SIN_4_COEFFICIENT,
    D_VEN_ENL_COS_5_COEFFICIENT,
    D_VEN_ENL_SIN_5_COEFFICIENT,
    D_VEN_ENL_COS_6_COEFFICIENT,
    D_VEN_ENL_SIN_6_COEFFICIENT,
    D_VEN_ENL_COS_7_COEFFICIENT,
    D_VEN_ENL_SIN_7_COEFFICIENT,
    D_VEN_ENL_COS_8_COEFFICIENT,
    D_VEN_ENL_SIN_8_COEFFICIENT,
    D_VEN_ENL_COS_9_COEFFICIENT,
    D_VEN_ENL_SIN_9_COEFFICIENT,
    D_VEN_ENL_COS_10_COEFFICIENT,
    D_VEN_ENL_SIN_10_COEFFICIENT,
    D_VEN_ENL_COS_11_COEFFICIENT,
    D_VEN_ENL_SIN_11_COEFFICIENT,
    D_VEN_ENL_COS_12_COEFFICIENT,
    D_VEN_ENL_SIN_12_COEFFICIENT,
    D_VEN_AXIS_HOME_ATTRACT_POSITION,
    D_VEN_AXIS_HOME_REPULSE_POSITION,
    D_VEN_DATAID_EOL
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
   * Return an object reference of the VEN_DataType with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the VEN_DataType
   * @return a reference to the VEN_DataType specified by the argument
   */
  public static VEN_DataType getReference( String s )
  {
    return( (VEN_DataType)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the VEN_DataType with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the VEN_DataType
   * @return a reference to the VEN_DataType specified by the argument
   */
  public static VEN_DataType getReference( int i )
  {
    return( (VEN_DataType)( intHash.get( new Integer( i ) ) ) );
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
  private VEN_DataType( String s )
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
  private VEN_DataType( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this VEN_DataType.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this VEN_DataType.
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
