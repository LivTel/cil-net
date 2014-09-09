package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type SIF_Status.  These are:
 * <ul>
 * <li>E_SIF_GEN_ERROR</li>
 * <li>E_SIF_INIT_FAIL</li>
 * <li>E_SIF_SHUTDOWN_ERROR</li>
 * <li>E_SIF_INVALID_DATA_LEN</li>
 * <li>E_SIF_INVALID_COMMAND</li>
 * <li>E_SIF_REPLY_FAIL</li>
 * <li>E_SIF_SERVER_STARTUP_FAIL</li>
 * <li>E_SIF_SERVER_SHUTDOWN_FAIL</li>
 * <li>E_SIF_SERVER_NOT_RUNNING</li>
 * <li>E_SIF_SERVER_SEND_FAIL</li>
 * <li>E_SIF_SERIAL_TX_FAIL</li>
 * <li>E_SIF_SERIAL_TXLEN_ERR</li>
 * <li>E_SIF_SERIAL_RX_FAIL</li>
 * <li>E_SIF_SERIAL_CHK_ERR</li>
 * <li>E_SIF_TIMER_SETUP_ERR</li>
 * <li>E_SIF_TIMER_ATTACH_ERR</li>
 * <li>E_SIF_TIMER_CREATE_ERR</li>
 * <li>E_SIF_TIMER_UNDERFLOW_ERR</li>
 * <li>E_SIF_TIMER_OVERFLOW_ERR</li>
 * <li>E_SIF_TIMER_CONFIG_ERR</li>
 * <li>E_SIF_TIMER_CLOSE_ERR</li>
 * <li>E_SIF_SDB_UPDATE_FAIL</li>
 * <li>E_SIF_DEAD_ENDCLIENT</li>
 * <li>E_SIF_MESSAGE_NOT_RECOGNISED</li>
 * <li>E_SIF_UNABLE_TO_INIT_IO_CARD</li>
 * <li>E_SIF_OID_TABLE_INIT_FAILURE</li>
 * <li>E_SIF_CARD_NOT_INITIALISED</li>
 * <li>E_SIF_INVALID_CONTROL_MODE</li>
 * <li>E_SIF_INAVALID_SUPPORT_MECHANISM</li>
 * <li>E_SIF_MIRROR_NOT_AT_ZENITH</li>
 * <li>E_SIF_INVALID_INCLINOMETER</li>
 * <li>E_SIF_CLU_AMPLITUDE_ERR</li>
 * <li>E_SIF_UNABLE_TO_TOGGLE_WATCHDOG_OUTPUT</li>
 * <li>E_SIF_VALVE_FBK_ERROR</li>
 * <li>E_SIF_INVALID_OPERATION_ENABLE_STATE</li>
 * <li>E_SIF_INVALID_PROC_STATE</li>
 * <li>E_SIF_AIR_PRESSURE_NOT_PRESENT</li>
 * <li>E_SIF_SERVO_VALVE_POWER_NOT_PRESENT</li>
 * <li>E_SIF_ALREADY_PRELOADED_LATERAL</li>
 * <li>E_SIF_FAILED_TO_READ_CONFIG_FILE</li>
 * <li>E_SIF_FAILED_TO_SET_OID_NAME_TO_VALUE</li>
 * <li>E_SIF_STATUS_EOL</li>
 * <li>E_SIF_STATUS_MAX</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class SIF_Status
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
  private static final TTL_Package ttlPackage = TTL_Package.SIF;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static SIF_Status E_SIF_GEN_ERROR =
      new SIF_Status( "E_SIF_GEN_ERROR", 0, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_INIT_FAIL =
      new SIF_Status( "E_SIF_INIT_FAIL", 1, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_SHUTDOWN_ERROR =
      new SIF_Status( "E_SIF_SHUTDOWN_ERROR", 2, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_INVALID_DATA_LEN =
      new SIF_Status( "E_SIF_INVALID_DATA_LEN", 3, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_INVALID_COMMAND =
      new SIF_Status( "E_SIF_INVALID_COMMAND", 4, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_REPLY_FAIL =
      new SIF_Status( "E_SIF_REPLY_FAIL", 5, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_SERVER_STARTUP_FAIL =
      new SIF_Status( "E_SIF_SERVER_STARTUP_FAIL", 6, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_SERVER_SHUTDOWN_FAIL =
      new SIF_Status( "E_SIF_SERVER_SHUTDOWN_FAIL", 7, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_SERVER_NOT_RUNNING =
      new SIF_Status( "E_SIF_SERVER_NOT_RUNNING", 8, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_SERVER_SEND_FAIL =
      new SIF_Status( "E_SIF_SERVER_SEND_FAIL", 9, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_SERIAL_TX_FAIL =
      new SIF_Status( "E_SIF_SERIAL_TX_FAIL", 10, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_SERIAL_TXLEN_ERR =
      new SIF_Status( "E_SIF_SERIAL_TXLEN_ERR", 11, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_SERIAL_RX_FAIL =
      new SIF_Status( "E_SIF_SERIAL_RX_FAIL", 12, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_SERIAL_CHK_ERR =
      new SIF_Status( "E_SIF_SERIAL_CHK_ERR", 13, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_TIMER_SETUP_ERR =
      new SIF_Status( "E_SIF_TIMER_SETUP_ERR", 14, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_TIMER_ATTACH_ERR =
      new SIF_Status( "E_SIF_TIMER_ATTACH_ERR", 15, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_TIMER_CREATE_ERR =
      new SIF_Status( "E_SIF_TIMER_CREATE_ERR", 16, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_TIMER_UNDERFLOW_ERR =
      new SIF_Status( "E_SIF_TIMER_UNDERFLOW_ERR", 17, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_TIMER_OVERFLOW_ERR =
      new SIF_Status( "E_SIF_TIMER_OVERFLOW_ERR", 18, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_TIMER_CONFIG_ERR =
      new SIF_Status( "E_SIF_TIMER_CONFIG_ERR", 19, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_TIMER_CLOSE_ERR =
      new SIF_Status( "E_SIF_TIMER_CLOSE_ERR", 20, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_SDB_UPDATE_FAIL =
      new SIF_Status( "E_SIF_SDB_UPDATE_FAIL", 21, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_DEAD_ENDCLIENT =
      new SIF_Status( "E_SIF_DEAD_ENDCLIENT", 22, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_MESSAGE_NOT_RECOGNISED =
      new SIF_Status( "E_SIF_MESSAGE_NOT_RECOGNISED", 23, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_UNABLE_TO_INIT_IO_CARD =
      new SIF_Status( "E_SIF_UNABLE_TO_INIT_IO_CARD", 24, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_OID_TABLE_INIT_FAILURE =
      new SIF_Status( "E_SIF_OID_TABLE_INIT_FAILURE", 25, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_CARD_NOT_INITIALISED =
      new SIF_Status( "E_SIF_CARD_NOT_INITIALISED", 26, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_INVALID_CONTROL_MODE =
      new SIF_Status( "E_SIF_INVALID_CONTROL_MODE", 27, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_INAVALID_SUPPORT_MECHANISM =
      new SIF_Status( "E_SIF_INAVALID_SUPPORT_MECHANISM", 28, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_MIRROR_NOT_AT_ZENITH =
      new SIF_Status( "E_SIF_MIRROR_NOT_AT_ZENITH", 29, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_INVALID_INCLINOMETER =
      new SIF_Status( "E_SIF_INVALID_INCLINOMETER", 30, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_CLU_AMPLITUDE_ERR =
      new SIF_Status( "E_SIF_CLU_AMPLITUDE_ERR", 31, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_UNABLE_TO_TOGGLE_WATCHDOG_OUTPUT =
      new SIF_Status( "E_SIF_UNABLE_TO_TOGGLE_WATCHDOG_OUTPUT", 32, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_VALVE_FBK_ERROR =
      new SIF_Status( "E_SIF_VALVE_FBK_ERROR", 33, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_INVALID_OPERATION_ENABLE_STATE =
      new SIF_Status( "E_SIF_INVALID_OPERATION_ENABLE_STATE", 34, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_INVALID_PROC_STATE =
      new SIF_Status( "E_SIF_INVALID_PROC_STATE", 35, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_AIR_PRESSURE_NOT_PRESENT =
      new SIF_Status( "E_SIF_AIR_PRESSURE_NOT_PRESENT", 36, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_SERVO_VALVE_POWER_NOT_PRESENT =
      new SIF_Status( "E_SIF_SERVO_VALVE_POWER_NOT_PRESENT", 37, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_ALREADY_PRELOADED_LATERAL =
      new SIF_Status( "E_SIF_ALREADY_PRELOADED_LATERAL", 38, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_FAILED_TO_READ_CONFIG_FILE =
      new SIF_Status( "E_SIF_FAILED_TO_READ_CONFIG_FILE", 39, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_Status E_SIF_FAILED_TO_SET_OID_NAME_TO_VALUE =
      new SIF_Status( "E_SIF_FAILED_TO_SET_OID_NAME_TO_VALUE", 40, TTL_Package.E_SIF );

  /**
   * End Of List
   */
  public final static SIF_Status E_SIF_STATUS_EOL =
      new SIF_Status( "E_SIF_STATUS_EOL", 41, TTL_Package.E_SIF );

  /**
   * enum forced to be 4 bytes
   */
  public final static SIF_Status E_SIF_STATUS_MAX =
      new SIF_Status( "E_SIF_STATUS_MAX", 42, TTL_Package.E_SIF );

  /**
   * Array allowing serialization.
   */
  protected static final SIF_Status[] array =
  {
    E_SIF_GEN_ERROR,
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
    E_SIF_STATUS_EOL,
    E_SIF_STATUS_MAX
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
   * Return an object reference of the SIF_Status with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the SIF_Status
   * @return a reference to the SIF_Status specified by the argument
   */
  public static SIF_Status getReference( String s )
  {
    return( (SIF_Status)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the SIF_Status with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the SIF_Status
   * @return a reference to the SIF_Status specified by the argument
   */
  public static SIF_Status getReference( int i )
  {
    return( (SIF_Status)( intHash.get( new Integer( i ) ) ) );
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
  private SIF_Status( String s )
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
  private SIF_Status( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this SIF_Status.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this SIF_Status.
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
