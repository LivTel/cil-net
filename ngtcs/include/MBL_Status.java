package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type MBL_Status.  These are:
 * <ul>
 * <li>E_MBL_GEN_ERR</li>
 * <li>E_MBL_OPEN_FAIL</li>
 * <li>E_MBL_CLOSE_FAIL</li>
 * <li>E_MBL_INSUF_DATA</li>
 * <li>E_MBL_SEND_ERR</li>
 * <li>E_MBL_RECV_ERR</li>
 * <li>E_MBL_RX_TIMEOUT</li>
 * <li>E_MBL_TX_TIMEOUT</li>
 * <li>E_MBL_FLUSH_FAIL</li>
 * <li>E_MBL_CONFIG_ERR</li>
 * <li>E_MBL_TIMEOUT_INIT_ERR</li>
 * <li>E_MBL_ILLEGAL_FUNCTION</li>
 * <li>E_MBL_ILLEGAL_DATA_ADDRESS</li>
 * <li>E_MBL_ILLEGAL_DATA_VALUE</li>
 * <li>E_MBL_SLAVE_DEVICE_FAILURE</li>
 * <li>E_MBL_ACKNOWLEDGE</li>
 * <li>E_MBL_SLAVE_DEVICE_BUSY</li>
 * <li>E_MBL_NEGATIVE_ACKNOWLEDGE</li>
 * <li>E_MBL_MEMORY_PARITY_ERROR</li>
 * <li>E_MBL_BUFFER_OVERRUN</li>
 * <li>E_MBL_ILLEGAL_SLAVE_ID</li>
 * <li>E_MBL_UNKNOWN_COMMS_DEVICE</li>
 * <li>E_MBL_FUNCTION_MISMATCH</li>
 * <li>E_MBL_STATUS_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class MBL_Status
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
  private static final TTL_Package ttlPackage = TTL_Package.MBL;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static MBL_Status E_MBL_GEN_ERR =
      new MBL_Status( "E_MBL_GEN_ERR", 0, TTL_Package.E_MBL );

  /**
   * Unable to open modbus port.
   */
  public final static MBL_Status E_MBL_OPEN_FAIL =
      new MBL_Status( "E_MBL_OPEN_FAIL", 1, TTL_Package.E_MBL );

  /**
   * Failure on closing modbus port.
   */
  public final static MBL_Status E_MBL_CLOSE_FAIL =
      new MBL_Status( "E_MBL_CLOSE_FAIL", 2, TTL_Package.E_MBL );

  /**
   * Non positive amount of data to Tx.
   */
  public final static MBL_Status E_MBL_INSUF_DATA =
      new MBL_Status( "E_MBL_INSUF_DATA", 3, TTL_Package.E_MBL );

  /**
   * Failure to send modbus request.
   */
  public final static MBL_Status E_MBL_SEND_ERR =
      new MBL_Status( "E_MBL_SEND_ERR", 4, TTL_Package.E_MBL );

  /**
   * Failure to receive reply to request.
   */
  public final static MBL_Status E_MBL_RECV_ERR =
      new MBL_Status( "E_MBL_RECV_ERR", 5, TTL_Package.E_MBL );

  /**
   * Time out while waiting for a reply.
   */
  public final static MBL_Status E_MBL_RX_TIMEOUT =
      new MBL_Status( "E_MBL_RX_TIMEOUT", 6, TTL_Package.E_MBL );

  /**
   * Time out while sending a request.
   */
  public final static MBL_Status E_MBL_TX_TIMEOUT =
      new MBL_Status( "E_MBL_TX_TIMEOUT", 7, TTL_Package.E_MBL );

  /**
   * Error flushing input
   */
  public final static MBL_Status E_MBL_FLUSH_FAIL =
      new MBL_Status( "E_MBL_FLUSH_FAIL", 8, TTL_Package.E_MBL );

  /**
   * Error configuring serial device.
   */
  public final static MBL_Status E_MBL_CONFIG_ERR =
      new MBL_Status( "E_MBL_CONFIG_ERR", 9, TTL_Package.E_MBL );

  /**
   * Failed to create timer.
   */
  public final static MBL_Status E_MBL_TIMEOUT_INIT_ERR =
      new MBL_Status( "E_MBL_TIMEOUT_INIT_ERR", 10, TTL_Package.E_MBL );

  /**
   * Device does not support requested
   */
  public final static MBL_Status E_MBL_ILLEGAL_FUNCTION =
      new MBL_Status( "E_MBL_ILLEGAL_FUNCTION", 11, TTL_Package.E_MBL );

  /**
   * Requested data address is not
   */
  public final static MBL_Status E_MBL_ILLEGAL_DATA_ADDRESS =
      new MBL_Status( "E_MBL_ILLEGAL_DATA_ADDRESS", 12, TTL_Package.E_MBL );

  /**
   * Value in data query is not allowed
   */
  public final static MBL_Status E_MBL_ILLEGAL_DATA_VALUE =
      new MBL_Status( "E_MBL_ILLEGAL_DATA_VALUE", 13, TTL_Package.E_MBL );

  /**
   * Unrecoverable error occurred during
   */
  public final static MBL_Status E_MBL_SLAVE_DEVICE_FAILURE =
      new MBL_Status( "E_MBL_SLAVE_DEVICE_FAILURE", 14, TTL_Package.E_MBL );

  /**
   * Long duration request in progress.
   */
  public final static MBL_Status E_MBL_ACKNOWLEDGE =
      new MBL_Status( "E_MBL_ACKNOWLEDGE", 15, TTL_Package.E_MBL );

  /**
   * Device not ready to accept new
   */
  public final static MBL_Status E_MBL_SLAVE_DEVICE_BUSY =
      new MBL_Status( "E_MBL_SLAVE_DEVICE_BUSY", 16, TTL_Package.E_MBL );

  /**
   * Device cannot perform request.
   */
  public final static MBL_Status E_MBL_NEGATIVE_ACKNOWLEDGE =
      new MBL_Status( "E_MBL_NEGATIVE_ACKNOWLEDGE", 17, TTL_Package.E_MBL );

  /**
   * Device detected memory parity error.
   */
  public final static MBL_Status E_MBL_MEMORY_PARITY_ERROR =
      new MBL_Status( "E_MBL_MEMORY_PARITY_ERROR", 18, TTL_Package.E_MBL );

  /**
   * A message buffer has over run.
   */
  public final static MBL_Status E_MBL_BUFFER_OVERRUN =
      new MBL_Status( "E_MBL_BUFFER_OVERRUN", 19, TTL_Package.E_MBL );

  /**
   * Illegal identifier for slave device.
   */
  public final static MBL_Status E_MBL_ILLEGAL_SLAVE_ID =
      new MBL_Status( "E_MBL_ILLEGAL_SLAVE_ID", 20, TTL_Package.E_MBL );

  /**
   * Unknown communication device.
   */
  public final static MBL_Status E_MBL_UNKNOWN_COMMS_DEVICE =
      new MBL_Status( "E_MBL_UNKNOWN_COMMS_DEVICE", 21, TTL_Package.E_MBL );

  /**
   * Reply contains different function
   */
  public final static MBL_Status E_MBL_FUNCTION_MISMATCH =
      new MBL_Status( "E_MBL_FUNCTION_MISMATCH", 22, TTL_Package.E_MBL );

  /**
   * 
   */
  public final static MBL_Status E_MBL_STATUS_EOL =
      new MBL_Status( "E_MBL_STATUS_EOL", 23, TTL_Package.E_MBL );

  /**
   * Array allowing serialization.
   */
  protected static final MBL_Status[] array =
  {
    E_MBL_GEN_ERR,
    E_MBL_OPEN_FAIL,
    E_MBL_CLOSE_FAIL,
    E_MBL_INSUF_DATA,
    E_MBL_SEND_ERR,
    E_MBL_RECV_ERR,
    E_MBL_RX_TIMEOUT,
    E_MBL_TX_TIMEOUT,
    E_MBL_FLUSH_FAIL,
    E_MBL_CONFIG_ERR,
    E_MBL_TIMEOUT_INIT_ERR,
    E_MBL_ILLEGAL_FUNCTION,
    E_MBL_ILLEGAL_DATA_ADDRESS,
    E_MBL_ILLEGAL_DATA_VALUE,
    E_MBL_SLAVE_DEVICE_FAILURE,
    E_MBL_ACKNOWLEDGE,
    E_MBL_SLAVE_DEVICE_BUSY,
    E_MBL_NEGATIVE_ACKNOWLEDGE,
    E_MBL_MEMORY_PARITY_ERROR,
    E_MBL_BUFFER_OVERRUN,
    E_MBL_ILLEGAL_SLAVE_ID,
    E_MBL_UNKNOWN_COMMS_DEVICE,
    E_MBL_FUNCTION_MISMATCH,
    E_MBL_STATUS_EOL
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
   * Return an object reference of the MBL_Status with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the MBL_Status
   * @return a reference to the MBL_Status specified by the argument
   */
  public static MBL_Status getReference( String s )
  {
    return( (MBL_Status)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the MBL_Status with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the MBL_Status
   * @return a reference to the MBL_Status specified by the argument
   */
  public static MBL_Status getReference( int i )
  {
    return( (MBL_Status)( intHash.get( new Integer( i ) ) ) );
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
  private MBL_Status( String s )
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
  private MBL_Status( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this MBL_Status.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this MBL_Status.
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
