package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type MIF_DataType.  These are:
 * <ul>
 * <li>D_MIF_DATAID_BOL</li>
 * <li>D_MIF_PROC_STATE</li>
 * <li>D_MIF_APP_VERSION</li>
 * <li>D_MIF_SERVER_SHUTDOWN</li>
 * <li>D_MIF_AXIS_TORQUE_DEMAND</li>
 * <li>D_MIF_AXIS_TORQUE_LIMIT</li>
 * <li>D_MIF_MOTOR_FULL_PRELOAD_TORQUE</li>
 * <li>D_MIF_MOTOR_PRELOAD_PERCENTAGE</li>
 * <li>D_MIF_MOTOR_PRELOAD_TORQUE</li>
 * <li>D_MIF_AMPLIFIER_GAIN</li>
 * <li>D_MIF_MOTOR_GAIN</li>
 * <li>D_MIF_DAC_GAIN</li>
 * <li>D_MIF_DAC_OFFSET</li>
 * <li>D_MIF_CLAMPED_AXIS_TORQUE_DEMAND</li>
 * <li>D_MIF_CLAMPED_MOTOR_1_TORQUE_DEMAND</li>
 * <li>D_MIF_CLAMPED_MOTOR_2_TORQUE_DEMAND</li>
 * <li>D_MIF_UNFILTERED_MOTOR_1_DAC_BITS</li>
 * <li>D_MIF_UNFILTERED_MOTOR_2_DAC_BITS</li>
 * <li>D_MIF_FILTERED_MOTOR_1_DAC_BITS</li>
 * <li>D_MIF_FILTERED_MOTOR_2_DAC_BITS</li>
 * <li>D_MIF_DIGITAL_INPUT_BITS</li>
 * <li>D_MIF_DIGITAL_OUTPUT_BITS</li>
 * <li>D_MIF_PLC_INTERLOCK_STATUS</li>
 * <li>D_MIF_L2_LIMIT_STATUS</li>
 * <li>D_MIF_MOTOR_1_MEASURED_CURRENT</li>
 * <li>D_MIF_MOTOR_2_MEASURED_CURRENT</li>
 * <li>D_MIF_MOTOR_1_MEASURED_TORQUE</li>
 * <li>D_MIF_MOTOR_2_MEASURED_TORQUE</li>
 * <li>D_MIF_BRAKE_RELEASE_ENABLE</li>
 * <li>D_MIF_BRAKE_STATUS_ON</li>
 * <li>D_MIF_DRIVE_ENABLE</li>
 * <li>D_MIF_DRIVE_ENABLE_STATUS_ON</li>
 * <li>D_MIF_MOTOR_1_DEMAND_CURRENT</li>
 * <li>D_MIF_MOTOR_2_DEMAND_CURRENT</li>
 * <li>D_MIF_WATCHDOG_OUTPUT_ENABLE</li>
 * <li>D_MIF_SIM_AXIS_POSN_LSWORD</li>
 * <li>D_MIF_SIM_AXIS_POSN_MSWORD</li>
 * <li>D_MIF_SIM_MOT1_POSN_LSWORD</li>
 * <li>D_MIF_SIM_MOT1_POSN_MSWORD</li>
 * <li>D_MIF_SIM_MOT2_POSN_LSWORD</li>
 * <li>D_MIF_SIM_MOT2_POSN_MSWORD</li>
 * <li>D_MIF_AXIS_TORQUE_CLAMP_FLAG</li>
 * <li>D_MIF_MOT1_TORQUE_CLAMP_FLAG</li>
 * <li>D_MIF_MOT2_TORQUE_CLAMP_FLAG</li>
 * <li>D_MIF_MOTOR_TORQUE_CORRECTION</li>
 * <li>D_MIF_MOTOR_TORQUE_MAX_LIMIT</li>
 * <li>D_MIF_MOTOR_TORQUE_MIN_LIMIT</li>
 * <li>D_MIF_DAC_SMOOTHING_FILTER_ENABLE</li>
 * <li>D_MIF_INPUT_BIT_BASE</li>
 * <li>D_MIF_DATAID_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class MIF_DataType
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
  private static final TTL_Package ttlPackage = TTL_Package.MIF;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static MIF_DataType D_MIF_DATAID_BOL =
      new MIF_DataType( "D_MIF_DATAID_BOL", 0, TTL_Package.D_MIF );

  /**
   * The motor interface process state.
   */
  public final static MIF_DataType D_MIF_PROC_STATE =
      new MIF_DataType( "D_MIF_PROC_STATE", 1, TTL_Package.D_MIF );

  /**
   * MIF package revision.
   */
  public final static MIF_DataType D_MIF_APP_VERSION =
      new MIF_DataType( "D_MIF_APP_VERSION", 2, TTL_Package.D_MIF );

  /**
   * Server shutdown command flag.
   */
  public final static MIF_DataType D_MIF_SERVER_SHUTDOWN =
      new MIF_DataType( "D_MIF_SERVER_SHUTDOWN", 3, TTL_Package.D_MIF );

  /**
   * Axis torque demand.
   */
  public final static MIF_DataType D_MIF_AXIS_TORQUE_DEMAND =
      new MIF_DataType( "D_MIF_AXIS_TORQUE_DEMAND", 4, TTL_Package.D_MIF );

  /**
   * Axis torque limit.
   */
  public final static MIF_DataType D_MIF_AXIS_TORQUE_LIMIT =
      new MIF_DataType( "D_MIF_AXIS_TORQUE_LIMIT", 5, TTL_Package.D_MIF );

  /**
   * Idle motor torque when at full preload
   */
  public final static MIF_DataType D_MIF_MOTOR_FULL_PRELOAD_TORQUE =
      new MIF_DataType( "D_MIF_MOTOR_FULL_PRELOAD_TORQUE", 6, TTL_Package.D_MIF );

  /**
   * Actual motor preload percentage.
   */
  public final static MIF_DataType D_MIF_MOTOR_PRELOAD_PERCENTAGE =
      new MIF_DataType( "D_MIF_MOTOR_PRELOAD_PERCENTAGE", 7, TTL_Package.D_MIF );

  /**
   * Actual motor preload torque.
   */
  public final static MIF_DataType D_MIF_MOTOR_PRELOAD_TORQUE =
      new MIF_DataType( "D_MIF_MOTOR_PRELOAD_TORQUE", 8, TTL_Package.D_MIF );

  /**
   * Amplifier gain.
   */
  public final static MIF_DataType D_MIF_AMPLIFIER_GAIN =
      new MIF_DataType( "D_MIF_AMPLIFIER_GAIN", 9, TTL_Package.D_MIF );

  /**
   * Motor gain.
   */
  public final static MIF_DataType D_MIF_MOTOR_GAIN =
      new MIF_DataType( "D_MIF_MOTOR_GAIN", 10, TTL_Package.D_MIF );

  /**
   * DAC gain.
   */
  public final static MIF_DataType D_MIF_DAC_GAIN =
      new MIF_DataType( "D_MIF_DAC_GAIN", 11, TTL_Package.D_MIF );

  /**
   * DAC offset.
   */
  public final static MIF_DataType D_MIF_DAC_OFFSET =
      new MIF_DataType( "D_MIF_DAC_OFFSET", 12, TTL_Package.D_MIF );

  /**
   * Clamped axis torque demand.
   */
  public final static MIF_DataType D_MIF_CLAMPED_AXIS_TORQUE_DEMAND =
      new MIF_DataType( "D_MIF_CLAMPED_AXIS_TORQUE_DEMAND", 13, TTL_Package.D_MIF );

  /**
   * 
   */
  public final static MIF_DataType D_MIF_CLAMPED_MOTOR_1_TORQUE_DEMAND =
      new MIF_DataType( "D_MIF_CLAMPED_MOTOR_1_TORQUE_DEMAND", 14, TTL_Package.D_MIF );

  /**
   * 
   */
  public final static MIF_DataType D_MIF_CLAMPED_MOTOR_2_TORQUE_DEMAND =
      new MIF_DataType( "D_MIF_CLAMPED_MOTOR_2_TORQUE_DEMAND", 15, TTL_Package.D_MIF );

  /**
   * Unfiltered motor 1 DAC bits.
   */
  public final static MIF_DataType D_MIF_UNFILTERED_MOTOR_1_DAC_BITS =
      new MIF_DataType( "D_MIF_UNFILTERED_MOTOR_1_DAC_BITS", 16, TTL_Package.D_MIF );

  /**
   * Unfiltered motor 2 DAC bits.
   */
  public final static MIF_DataType D_MIF_UNFILTERED_MOTOR_2_DAC_BITS =
      new MIF_DataType( "D_MIF_UNFILTERED_MOTOR_2_DAC_BITS", 17, TTL_Package.D_MIF );

  /**
   * Filtered motor 1 DAC bits.
   */
  public final static MIF_DataType D_MIF_FILTERED_MOTOR_1_DAC_BITS =
      new MIF_DataType( "D_MIF_FILTERED_MOTOR_1_DAC_BITS", 18, TTL_Package.D_MIF );

  /**
   * Filtered motor 2 DAC bits.
   */
  public final static MIF_DataType D_MIF_FILTERED_MOTOR_2_DAC_BITS =
      new MIF_DataType( "D_MIF_FILTERED_MOTOR_2_DAC_BITS", 19, TTL_Package.D_MIF );

  /**
   * Digital input bit word.
   */
  public final static MIF_DataType D_MIF_DIGITAL_INPUT_BITS =
      new MIF_DataType( "D_MIF_DIGITAL_INPUT_BITS", 20, TTL_Package.D_MIF );

  /**
   * Digital output bit word.
   */
  public final static MIF_DataType D_MIF_DIGITAL_OUTPUT_BITS =
      new MIF_DataType( "D_MIF_DIGITAL_OUTPUT_BITS", 21, TTL_Package.D_MIF );

  /**
   * PLC interlock status.
   */
  public final static MIF_DataType D_MIF_PLC_INTERLOCK_STATUS =
      new MIF_DataType( "D_MIF_PLC_INTERLOCK_STATUS", 22, TTL_Package.D_MIF );

  /**
   * PLC L2 limit status.
   */
  public final static MIF_DataType D_MIF_L2_LIMIT_STATUS =
      new MIF_DataType( "D_MIF_L2_LIMIT_STATUS", 23, TTL_Package.D_MIF );

  /**
   * Motor 1 measured current.
   */
  public final static MIF_DataType D_MIF_MOTOR_1_MEASURED_CURRENT =
      new MIF_DataType( "D_MIF_MOTOR_1_MEASURED_CURRENT", 24, TTL_Package.D_MIF );

  /**
   * Motor 2 measured current.
   */
  public final static MIF_DataType D_MIF_MOTOR_2_MEASURED_CURRENT =
      new MIF_DataType( "D_MIF_MOTOR_2_MEASURED_CURRENT", 25, TTL_Package.D_MIF );

  /**
   * Motor 1 measured torque.
   */
  public final static MIF_DataType D_MIF_MOTOR_1_MEASURED_TORQUE =
      new MIF_DataType( "D_MIF_MOTOR_1_MEASURED_TORQUE", 26, TTL_Package.D_MIF );

  /**
   * Motor 2 measured torque.
   */
  public final static MIF_DataType D_MIF_MOTOR_2_MEASURED_TORQUE =
      new MIF_DataType( "D_MIF_MOTOR_2_MEASURED_TORQUE", 27, TTL_Package.D_MIF );

  /**
   * Brake release demand flag.
   */
  public final static MIF_DataType D_MIF_BRAKE_RELEASE_ENABLE =
      new MIF_DataType( "D_MIF_BRAKE_RELEASE_ENABLE", 28, TTL_Package.D_MIF );

  /**
   * Brake status flag from PLC.
   */
  public final static MIF_DataType D_MIF_BRAKE_STATUS_ON =
      new MIF_DataType( "D_MIF_BRAKE_STATUS_ON", 29, TTL_Package.D_MIF );

  /**
   * Drive enable demand flag.
   */
  public final static MIF_DataType D_MIF_DRIVE_ENABLE =
      new MIF_DataType( "D_MIF_DRIVE_ENABLE", 30, TTL_Package.D_MIF );

  /**
   * Drive enable status from PLC.
   */
  public final static MIF_DataType D_MIF_DRIVE_ENABLE_STATUS_ON =
      new MIF_DataType( "D_MIF_DRIVE_ENABLE_STATUS_ON", 31, TTL_Package.D_MIF );

  /**
   * Motor 1 demanded current.
   */
  public final static MIF_DataType D_MIF_MOTOR_1_DEMAND_CURRENT =
      new MIF_DataType( "D_MIF_MOTOR_1_DEMAND_CURRENT", 32, TTL_Package.D_MIF );

  /**
   * Motor 2 demanded current.
   */
  public final static MIF_DataType D_MIF_MOTOR_2_DEMAND_CURRENT =
      new MIF_DataType( "D_MIF_MOTOR_2_DEMAND_CURRENT", 33, TTL_Package.D_MIF );

  /**
   * Enable the watchdog output.
   */
  public final static MIF_DataType D_MIF_WATCHDOG_OUTPUT_ENABLE =
      new MIF_DataType( "D_MIF_WATCHDOG_OUTPUT_ENABLE", 34, TTL_Package.D_MIF );

  /**
   * Simulated axis position LSWord.
   */
  public final static MIF_DataType D_MIF_SIM_AXIS_POSN_LSWORD =
      new MIF_DataType( "D_MIF_SIM_AXIS_POSN_LSWORD", 35, TTL_Package.D_MIF );

  /**
   * Simulated axis position MSWord.
   */
  public final static MIF_DataType D_MIF_SIM_AXIS_POSN_MSWORD =
      new MIF_DataType( "D_MIF_SIM_AXIS_POSN_MSWORD", 36, TTL_Package.D_MIF );

  /**
   * Simulated motor 1 position LSWord.
   */
  public final static MIF_DataType D_MIF_SIM_MOT1_POSN_LSWORD =
      new MIF_DataType( "D_MIF_SIM_MOT1_POSN_LSWORD", 37, TTL_Package.D_MIF );

  /**
   * Simulated motor 1 position MSWord.
   */
  public final static MIF_DataType D_MIF_SIM_MOT1_POSN_MSWORD =
      new MIF_DataType( "D_MIF_SIM_MOT1_POSN_MSWORD", 38, TTL_Package.D_MIF );

  /**
   * Simulated motor 2 position LSWord.
   */
  public final static MIF_DataType D_MIF_SIM_MOT2_POSN_LSWORD =
      new MIF_DataType( "D_MIF_SIM_MOT2_POSN_LSWORD", 39, TTL_Package.D_MIF );

  /**
   * Simulated motor 2 position MSWord.
   */
  public final static MIF_DataType D_MIF_SIM_MOT2_POSN_MSWORD =
      new MIF_DataType( "D_MIF_SIM_MOT2_POSN_MSWORD", 40, TTL_Package.D_MIF );

  /**
   * True if Ax torque demand is clamped
   */
  public final static MIF_DataType D_MIF_AXIS_TORQUE_CLAMP_FLAG =
      new MIF_DataType( "D_MIF_AXIS_TORQUE_CLAMP_FLAG", 41, TTL_Package.D_MIF );

  /**
   * True if M1 torque demand is clamped
   */
  public final static MIF_DataType D_MIF_MOT1_TORQUE_CLAMP_FLAG =
      new MIF_DataType( "D_MIF_MOT1_TORQUE_CLAMP_FLAG", 42, TTL_Package.D_MIF );

  /**
   * True if M2 torque demand is clamped
   */
  public final static MIF_DataType D_MIF_MOT2_TORQUE_CLAMP_FLAG =
      new MIF_DataType( "D_MIF_MOT2_TORQUE_CLAMP_FLAG", 43, TTL_Package.D_MIF );

  /**
   * Correction based on velocity feedback
   */
  public final static MIF_DataType D_MIF_MOTOR_TORQUE_CORRECTION =
      new MIF_DataType( "D_MIF_MOTOR_TORQUE_CORRECTION", 44, TTL_Package.D_MIF );

  /**
   * Motor torque maximum limit.
   */
  public final static MIF_DataType D_MIF_MOTOR_TORQUE_MAX_LIMIT =
      new MIF_DataType( "D_MIF_MOTOR_TORQUE_MAX_LIMIT", 45, TTL_Package.D_MIF );

  /**
   * Motor torque minimum limit.
   */
  public final static MIF_DataType D_MIF_MOTOR_TORQUE_MIN_LIMIT =
      new MIF_DataType( "D_MIF_MOTOR_TORQUE_MIN_LIMIT", 46, TTL_Package.D_MIF );

  /**
   * DAC bits smoothing filter
   */
  public final static MIF_DataType D_MIF_DAC_SMOOTHING_FILTER_ENABLE =
      new MIF_DataType( "D_MIF_DAC_SMOOTHING_FILTER_ENABLE", 47, TTL_Package.D_MIF );

  /**
   * Base for digital input bits
   */
  public final static MIF_DataType D_MIF_INPUT_BIT_BASE =
      new MIF_DataType( "D_MIF_INPUT_BIT_BASE", 48, TTL_Package.D_MIF );

  /**
   * E_MIF_INPUT_BITS
   */
  public final static MIF_DataType D_MIF_DATAID_EOL =
      new MIF_DataType( "D_MIF_DATAID_EOL", 49, TTL_Package.D_MIF );

  /**
   * Array allowing serialization.
   */
  protected static final MIF_DataType[] array =
  {
    D_MIF_DATAID_BOL,
    D_MIF_PROC_STATE,
    D_MIF_APP_VERSION,
    D_MIF_SERVER_SHUTDOWN,
    D_MIF_AXIS_TORQUE_DEMAND,
    D_MIF_AXIS_TORQUE_LIMIT,
    D_MIF_MOTOR_FULL_PRELOAD_TORQUE,
    D_MIF_MOTOR_PRELOAD_PERCENTAGE,
    D_MIF_MOTOR_PRELOAD_TORQUE,
    D_MIF_AMPLIFIER_GAIN,
    D_MIF_MOTOR_GAIN,
    D_MIF_DAC_GAIN,
    D_MIF_DAC_OFFSET,
    D_MIF_CLAMPED_AXIS_TORQUE_DEMAND,
    D_MIF_CLAMPED_MOTOR_1_TORQUE_DEMAND,
    D_MIF_CLAMPED_MOTOR_2_TORQUE_DEMAND,
    D_MIF_UNFILTERED_MOTOR_1_DAC_BITS,
    D_MIF_UNFILTERED_MOTOR_2_DAC_BITS,
    D_MIF_FILTERED_MOTOR_1_DAC_BITS,
    D_MIF_FILTERED_MOTOR_2_DAC_BITS,
    D_MIF_DIGITAL_INPUT_BITS,
    D_MIF_DIGITAL_OUTPUT_BITS,
    D_MIF_PLC_INTERLOCK_STATUS,
    D_MIF_L2_LIMIT_STATUS,
    D_MIF_MOTOR_1_MEASURED_CURRENT,
    D_MIF_MOTOR_2_MEASURED_CURRENT,
    D_MIF_MOTOR_1_MEASURED_TORQUE,
    D_MIF_MOTOR_2_MEASURED_TORQUE,
    D_MIF_BRAKE_RELEASE_ENABLE,
    D_MIF_BRAKE_STATUS_ON,
    D_MIF_DRIVE_ENABLE,
    D_MIF_DRIVE_ENABLE_STATUS_ON,
    D_MIF_MOTOR_1_DEMAND_CURRENT,
    D_MIF_MOTOR_2_DEMAND_CURRENT,
    D_MIF_WATCHDOG_OUTPUT_ENABLE,
    D_MIF_SIM_AXIS_POSN_LSWORD,
    D_MIF_SIM_AXIS_POSN_MSWORD,
    D_MIF_SIM_MOT1_POSN_LSWORD,
    D_MIF_SIM_MOT1_POSN_MSWORD,
    D_MIF_SIM_MOT2_POSN_LSWORD,
    D_MIF_SIM_MOT2_POSN_MSWORD,
    D_MIF_AXIS_TORQUE_CLAMP_FLAG,
    D_MIF_MOT1_TORQUE_CLAMP_FLAG,
    D_MIF_MOT2_TORQUE_CLAMP_FLAG,
    D_MIF_MOTOR_TORQUE_CORRECTION,
    D_MIF_MOTOR_TORQUE_MAX_LIMIT,
    D_MIF_MOTOR_TORQUE_MIN_LIMIT,
    D_MIF_DAC_SMOOTHING_FILTER_ENABLE,
    D_MIF_INPUT_BIT_BASE,
    D_MIF_DATAID_EOL
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
   * Return an object reference of the MIF_DataType with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the MIF_DataType
   * @return a reference to the MIF_DataType specified by the argument
   */
  public static MIF_DataType getReference( String s )
  {
    return( (MIF_DataType)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the MIF_DataType with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the MIF_DataType
   * @return a reference to the MIF_DataType specified by the argument
   */
  public static MIF_DataType getReference( int i )
  {
    return( (MIF_DataType)( intHash.get( new Integer( i ) ) ) );
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
  private MIF_DataType( String s )
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
  private MIF_DataType( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this MIF_DataType.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this MIF_DataType.
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
