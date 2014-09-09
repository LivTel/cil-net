package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type AEI_Status.  These are:
 * <ul>
 * <li>E_AEI_GEN_ERROR</li>
 * <li>E_AEI_INIT_FAIL</li>
 * <li>E_AEI_SHUTDOWN_ERROR</li>
 * <li>E_AEI_INVALID_DATA_LEN</li>
 * <li>E_AEI_INVALID_COMMAND</li>
 * <li>E_AEI_REPLY_FAIL</li>
 * <li>E_AEI_SERVER_STARTUP_FAIL</li>
 * <li>E_AEI_SERVER_SHUTDOWN_FAIL</li>
 * <li>E_AEI_SERVER_NOT_RUNNING</li>
 * <li>E_AEI_SERVER_SEND_FAIL</li>
 * <li>E_AEI_SERIAL_TX_FAIL</li>
 * <li>E_AEI_SERIAL_TXLEN_ERR</li>
 * <li>E_AEI_SERIAL_RX_FAIL</li>
 * <li>E_AEI_SERIAL_CHK_ERR</li>
 * <li>E_AEI_ENCODER_NOT_FOUND</li>
 * <li>E_AEI_TIMER_SETUP_ERR</li>
 * <li>E_AEI_TIMER_CLOSE_ERR</li>
 * <li>E_AEI_TOO_MANY_AXES</li>
 * <li>E_AEI_NO_AXES_SPECIFIED</li>
 * <li>E_AEI_INVALID_AXIS_INDEX</li>
 * <li>E_AEI_NO_CHKSM_POSSIBLE</li>
 * <li>E_AEI_HW_REPORTED_ERROR</li>
 * <li>E_AEI_GEAR_RATIO_ERROR</li>
 * <li>E_AEI_AES_NOT_AVAILABLE</li>
 * <li>E_AEI_AES_GET_FAILURE</li>
 * <li>E_AEI_AES_SET_FAILURE</li>
 * <li>E_AEI_AES_REJECT</li>
 * <li>E_AEI_SERIAL_PORT_CLOSED</li>
 * <li>E_AEI_STATUS_EOL</li>
 * <li>E_AEI_STATUS_MAX</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class AEI_Status
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
  private static final TTL_Package ttlPackage = TTL_Package.AEI;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static AEI_Status E_AEI_GEN_ERROR =
      new AEI_Status( "E_AEI_GEN_ERROR", 0, TTL_Package.E_AEI );

  /**
   * 
   */
  public final static AEI_Status E_AEI_INIT_FAIL =
      new AEI_Status( "E_AEI_INIT_FAIL", 1, TTL_Package.E_AEI );

  /**
   * 
   */
  public final static AEI_Status E_AEI_SHUTDOWN_ERROR =
      new AEI_Status( "E_AEI_SHUTDOWN_ERROR", 2, TTL_Package.E_AEI );

  /**
   * 
   */
  public final static AEI_Status E_AEI_INVALID_DATA_LEN =
      new AEI_Status( "E_AEI_INVALID_DATA_LEN", 3, TTL_Package.E_AEI );

  /**
   * 
   */
  public final static AEI_Status E_AEI_INVALID_COMMAND =
      new AEI_Status( "E_AEI_INVALID_COMMAND", 4, TTL_Package.E_AEI );

  /**
   * 
   */
  public final static AEI_Status E_AEI_REPLY_FAIL =
      new AEI_Status( "E_AEI_REPLY_FAIL", 5, TTL_Package.E_AEI );

  /**
   * 
   */
  public final static AEI_Status E_AEI_SERVER_STARTUP_FAIL =
      new AEI_Status( "E_AEI_SERVER_STARTUP_FAIL", 6, TTL_Package.E_AEI );

  /**
   * 
   */
  public final static AEI_Status E_AEI_SERVER_SHUTDOWN_FAIL =
      new AEI_Status( "E_AEI_SERVER_SHUTDOWN_FAIL", 7, TTL_Package.E_AEI );

  /**
   * 
   */
  public final static AEI_Status E_AEI_SERVER_NOT_RUNNING =
      new AEI_Status( "E_AEI_SERVER_NOT_RUNNING", 8, TTL_Package.E_AEI );

  /**
   * 
   */
  public final static AEI_Status E_AEI_SERVER_SEND_FAIL =
      new AEI_Status( "E_AEI_SERVER_SEND_FAIL", 9, TTL_Package.E_AEI );

  /**
   * 
   */
  public final static AEI_Status E_AEI_SERIAL_TX_FAIL =
      new AEI_Status( "E_AEI_SERIAL_TX_FAIL", 10, TTL_Package.E_AEI );

  /**
   * 
   */
  public final static AEI_Status E_AEI_SERIAL_TXLEN_ERR =
      new AEI_Status( "E_AEI_SERIAL_TXLEN_ERR", 11, TTL_Package.E_AEI );

  /**
   * 
   */
  public final static AEI_Status E_AEI_SERIAL_RX_FAIL =
      new AEI_Status( "E_AEI_SERIAL_RX_FAIL", 12, TTL_Package.E_AEI );

  /**
   * 
   */
  public final static AEI_Status E_AEI_SERIAL_CHK_ERR =
      new AEI_Status( "E_AEI_SERIAL_CHK_ERR", 13, TTL_Package.E_AEI );

  /**
   * 
   */
  public final static AEI_Status E_AEI_ENCODER_NOT_FOUND =
      new AEI_Status( "E_AEI_ENCODER_NOT_FOUND", 14, TTL_Package.E_AEI );

  /**
   * 
   */
  public final static AEI_Status E_AEI_TIMER_SETUP_ERR =
      new AEI_Status( "E_AEI_TIMER_SETUP_ERR", 15, TTL_Package.E_AEI );

  /**
   * 
   */
  public final static AEI_Status E_AEI_TIMER_CLOSE_ERR =
      new AEI_Status( "E_AEI_TIMER_CLOSE_ERR", 16, TTL_Package.E_AEI );

  /**
   * Too many axes specified on cmd line
   */
  public final static AEI_Status E_AEI_TOO_MANY_AXES =
      new AEI_Status( "E_AEI_TOO_MANY_AXES", 17, TTL_Package.E_AEI );

  /**
   * No axis specified on cmd line
   */
  public final static AEI_Status E_AEI_NO_AXES_SPECIFIED =
      new AEI_Status( "E_AEI_NO_AXES_SPECIFIED", 18, TTL_Package.E_AEI );

  /**
   * Unrecoginised axis index number
   */
  public final static AEI_Status E_AEI_INVALID_AXIS_INDEX =
      new AEI_Status( "E_AEI_INVALID_AXIS_INDEX", 19, TTL_Package.E_AEI );

  /**
   * Message too short to generate checksum
   */
  public final static AEI_Status E_AEI_NO_CHKSM_POSSIBLE =
      new AEI_Status( "E_AEI_NO_CHKSM_POSSIBLE", 20, TTL_Package.E_AEI );

  /**
   * Hardware itself reports an error
   */
  public final static AEI_Status E_AEI_HW_REPORTED_ERROR =
      new AEI_Status( "E_AEI_HW_REPORTED_ERROR", 21, TTL_Package.E_AEI );

  /**
   * Non positive number of teeth on gear
   */
  public final static AEI_Status E_AEI_GEAR_RATIO_ERROR =
      new AEI_Status( "E_AEI_GEAR_RATIO_ERROR", 22, TTL_Package.E_AEI );

  /**
   * Unable to detect AES (Abs.Enc.Server)
   */
  public final static AEI_Status E_AEI_AES_NOT_AVAILABLE =
      new AEI_Status( "E_AEI_AES_NOT_AVAILABLE", 23, TTL_Package.E_AEI );

  /**
   * Unable to get an OID value from the AES
   */
  public final static AEI_Status E_AEI_AES_GET_FAILURE =
      new AEI_Status( "E_AEI_AES_GET_FAILURE", 24, TTL_Package.E_AEI );

  /**
   * Unable to set an OID value in the AES
   */
  public final static AEI_Status E_AEI_AES_SET_FAILURE =
      new AEI_Status( "E_AEI_AES_SET_FAILURE", 25, TTL_Package.E_AEI );

  /**
   * Submission rejected by AES
   */
  public final static AEI_Status E_AEI_AES_REJECT =
      new AEI_Status( "E_AEI_AES_REJECT", 26, TTL_Package.E_AEI );

  /**
   * Serial port has not been opened for comms
   */
  public final static AEI_Status E_AEI_SERIAL_PORT_CLOSED =
      new AEI_Status( "E_AEI_SERIAL_PORT_CLOSED", 27, TTL_Package.E_AEI );

  /**
   * End Of List
   */
  public final static AEI_Status E_AEI_STATUS_EOL =
      new AEI_Status( "E_AEI_STATUS_EOL", 28, TTL_Package.E_AEI );

  /**
   * enum forced to be 4 bytes
   */
  public final static AEI_Status E_AEI_STATUS_MAX =
      new AEI_Status( "E_AEI_STATUS_MAX", 29, TTL_Package.E_AEI );

  /**
   * Array allowing serialization.
   */
  protected static final AEI_Status[] array =
  {
    E_AEI_GEN_ERROR,
    E_AEI_INIT_FAIL,
    E_AEI_SHUTDOWN_ERROR,
    E_AEI_INVALID_DATA_LEN,
    E_AEI_INVALID_COMMAND,
    E_AEI_REPLY_FAIL,
    E_AEI_SERVER_STARTUP_FAIL,
    E_AEI_SERVER_SHUTDOWN_FAIL,
    E_AEI_SERVER_NOT_RUNNING,
    E_AEI_SERVER_SEND_FAIL,
    E_AEI_SERIAL_TX_FAIL,
    E_AEI_SERIAL_TXLEN_ERR,
    E_AEI_SERIAL_RX_FAIL,
    E_AEI_SERIAL_CHK_ERR,
    E_AEI_ENCODER_NOT_FOUND,
    E_AEI_TIMER_SETUP_ERR,
    E_AEI_TIMER_CLOSE_ERR,
    E_AEI_TOO_MANY_AXES,
    E_AEI_NO_AXES_SPECIFIED,
    E_AEI_INVALID_AXIS_INDEX,
    E_AEI_NO_CHKSM_POSSIBLE,
    E_AEI_HW_REPORTED_ERROR,
    E_AEI_GEAR_RATIO_ERROR,
    E_AEI_AES_NOT_AVAILABLE,
    E_AEI_AES_GET_FAILURE,
    E_AEI_AES_SET_FAILURE,
    E_AEI_AES_REJECT,
    E_AEI_SERIAL_PORT_CLOSED,
    E_AEI_STATUS_EOL,
    E_AEI_STATUS_MAX
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
   * Return an object reference of the AEI_Status with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the AEI_Status
   * @return a reference to the AEI_Status specified by the argument
   */
  public static AEI_Status getReference( String s )
  {
    return( (AEI_Status)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the AEI_Status with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the AEI_Status
   * @return a reference to the AEI_Status specified by the argument
   */
  public static AEI_Status getReference( int i )
  {
    return( (AEI_Status)( intHash.get( new Integer( i ) ) ) );
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
  private AEI_Status( String s )
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
  private AEI_Status( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this AEI_Status.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this AEI_Status.
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
