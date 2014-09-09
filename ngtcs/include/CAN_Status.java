package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type CAN_Status.  These are:
 * <ul>
 * <li>E_CAN_GEN_ERROR</li>
 * <li>E_CAN_INIT_FAIL</li>
 * <li>E_CAN_SHUTDOWN_ERROR</li>
 * <li>E_CAN_OPEN_FAIL</li>
 * <li>E_CAN_CLOSE_FAIL</li>
 * <li>E_CAN_READ_FAIL</li>
 * <li>E_CAN_SEND_FAIL</li>
 * <li>E_CAN_BAUD_FAIL</li>
 * <li>E_CAN_BAUDRATE_ERR</li>
 * <li>E_CAN_TX_ERROR</li>
 * <li>E_CAN_RX_ERROR</li>
 * <li>E_CAN_INVALID_DATA_LEN</li>
 * <li>E_CAN_INVALID_COMMAND</li>
 * <li>E_CAN_INVALID_RESPONSE</li>
 * <li>E_CAN_REPLY_FAIL</li>
 * <li>E_CAN_TIMER_SETUP_ERR</li>
 * <li>E_CAN_TIMER_CLOSE_ERR</li>
 * <li>E_CAN_INVALID_STATE</li>
 * <li>E_CAN_UNEXPECTED_REPLY</li>
 * <li>E_CAN_DEVID_OUT_OF_RANGE</li>
 * <li>E_CAN_DEVID_ALLOC</li>
 * <li>E_CAN_DEVID_NOT_ALLOC</li>
 * <li>E_CAN_DEVICE_NOT_FOUND</li>
 * <li>E_CAN_SEND_ERR</li>
 * <li>E_CAN_RECEIVE_ERR</li>
 * <li>E_CAN_IO_GROUP_REQ_ERR</li>
 * <li>E_CAN_IO_LINE_REQ_ERR</li>
 * <li>E_CAN_POLL_TYPE_ERR</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class CAN_Status
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
  private static final TTL_Package ttlPackage = TTL_Package.CAN;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static CAN_Status E_CAN_GEN_ERROR =
      new CAN_Status( "E_CAN_GEN_ERROR", 0, TTL_Package.E_CAN );

  /**
   * 
   */
  public final static CAN_Status E_CAN_INIT_FAIL =
      new CAN_Status( "E_CAN_INIT_FAIL", 1, TTL_Package.E_CAN );

  /**
   * 
   */
  public final static CAN_Status E_CAN_SHUTDOWN_ERROR =
      new CAN_Status( "E_CAN_SHUTDOWN_ERROR", 2, TTL_Package.E_CAN );

  /**
   * 
   */
  public final static CAN_Status E_CAN_OPEN_FAIL =
      new CAN_Status( "E_CAN_OPEN_FAIL", 3, TTL_Package.E_CAN );

  /**
   * 
   */
  public final static CAN_Status E_CAN_CLOSE_FAIL =
      new CAN_Status( "E_CAN_CLOSE_FAIL", 4, TTL_Package.E_CAN );

  /**
   * 
   */
  public final static CAN_Status E_CAN_READ_FAIL =
      new CAN_Status( "E_CAN_READ_FAIL", 5, TTL_Package.E_CAN );

  /**
   * 
   */
  public final static CAN_Status E_CAN_SEND_FAIL =
      new CAN_Status( "E_CAN_SEND_FAIL", 6, TTL_Package.E_CAN );

  /**
   * 
   */
  public final static CAN_Status E_CAN_BAUD_FAIL =
      new CAN_Status( "E_CAN_BAUD_FAIL", 7, TTL_Package.E_CAN );

  /**
   * 
   */
  public final static CAN_Status E_CAN_BAUDRATE_ERR =
      new CAN_Status( "E_CAN_BAUDRATE_ERR", 8, TTL_Package.E_CAN );

  /**
   * 
   */
  public final static CAN_Status E_CAN_TX_ERROR =
      new CAN_Status( "E_CAN_TX_ERROR", 9, TTL_Package.E_CAN );

  /**
   * 
   */
  public final static CAN_Status E_CAN_RX_ERROR =
      new CAN_Status( "E_CAN_RX_ERROR", 10, TTL_Package.E_CAN );

  /**
   * 
   */
  public final static CAN_Status E_CAN_INVALID_DATA_LEN =
      new CAN_Status( "E_CAN_INVALID_DATA_LEN", 11, TTL_Package.E_CAN );

  /**
   * 
   */
  public final static CAN_Status E_CAN_INVALID_COMMAND =
      new CAN_Status( "E_CAN_INVALID_COMMAND", 12, TTL_Package.E_CAN );

  /**
   * 
   */
  public final static CAN_Status E_CAN_INVALID_RESPONSE =
      new CAN_Status( "E_CAN_INVALID_RESPONSE", 13, TTL_Package.E_CAN );

  /**
   * 
   */
  public final static CAN_Status E_CAN_REPLY_FAIL =
      new CAN_Status( "E_CAN_REPLY_FAIL", 14, TTL_Package.E_CAN );

  /**
   * 
   */
  public final static CAN_Status E_CAN_TIMER_SETUP_ERR =
      new CAN_Status( "E_CAN_TIMER_SETUP_ERR", 15, TTL_Package.E_CAN );

  /**
   * 
   */
  public final static CAN_Status E_CAN_TIMER_CLOSE_ERR =
      new CAN_Status( "E_CAN_TIMER_CLOSE_ERR", 16, TTL_Package.E_CAN );

  /**
   * 
   */
  public final static CAN_Status E_CAN_INVALID_STATE =
      new CAN_Status( "E_CAN_INVALID_STATE", 17, TTL_Package.E_CAN );

  /**
   * 
   */
  public final static CAN_Status E_CAN_UNEXPECTED_REPLY =
      new CAN_Status( "E_CAN_UNEXPECTED_REPLY", 18, TTL_Package.E_CAN );

  /**
   * 
   */
  public final static CAN_Status E_CAN_DEVID_OUT_OF_RANGE =
      new CAN_Status( "E_CAN_DEVID_OUT_OF_RANGE", 19, TTL_Package.E_CAN );

  /**
   * 
   */
  public final static CAN_Status E_CAN_DEVID_ALLOC =
      new CAN_Status( "E_CAN_DEVID_ALLOC", 20, TTL_Package.E_CAN );

  /**
   * 
   */
  public final static CAN_Status E_CAN_DEVID_NOT_ALLOC =
      new CAN_Status( "E_CAN_DEVID_NOT_ALLOC", 21, TTL_Package.E_CAN );

  /**
   * 
   */
  public final static CAN_Status E_CAN_DEVICE_NOT_FOUND =
      new CAN_Status( "E_CAN_DEVICE_NOT_FOUND", 22, TTL_Package.E_CAN );

  /**
   * 
   */
  public final static CAN_Status E_CAN_SEND_ERR =
      new CAN_Status( "E_CAN_SEND_ERR", 23, TTL_Package.E_CAN );

  /**
   * 
   */
  public final static CAN_Status E_CAN_RECEIVE_ERR =
      new CAN_Status( "E_CAN_RECEIVE_ERR", 24, TTL_Package.E_CAN );

  /**
   * 
   */
  public final static CAN_Status E_CAN_IO_GROUP_REQ_ERR =
      new CAN_Status( "E_CAN_IO_GROUP_REQ_ERR", 25, TTL_Package.E_CAN );

  /**
   * 
   */
  public final static CAN_Status E_CAN_IO_LINE_REQ_ERR =
      new CAN_Status( "E_CAN_IO_LINE_REQ_ERR", 26, TTL_Package.E_CAN );

  /**
   * 
   */
  public final static CAN_Status E_CAN_POLL_TYPE_ERR =
      new CAN_Status( "E_CAN_POLL_TYPE_ERR", 27, TTL_Package.E_CAN );

  /**
   * Array allowing serialization.
   */
  protected static final CAN_Status[] array =
  {
    E_CAN_GEN_ERROR,
    E_CAN_INIT_FAIL,
    E_CAN_SHUTDOWN_ERROR,
    E_CAN_OPEN_FAIL,
    E_CAN_CLOSE_FAIL,
    E_CAN_READ_FAIL,
    E_CAN_SEND_FAIL,
    E_CAN_BAUD_FAIL,
    E_CAN_BAUDRATE_ERR,
    E_CAN_TX_ERROR,
    E_CAN_RX_ERROR,
    E_CAN_INVALID_DATA_LEN,
    E_CAN_INVALID_COMMAND,
    E_CAN_INVALID_RESPONSE,
    E_CAN_REPLY_FAIL,
    E_CAN_TIMER_SETUP_ERR,
    E_CAN_TIMER_CLOSE_ERR,
    E_CAN_INVALID_STATE,
    E_CAN_UNEXPECTED_REPLY,
    E_CAN_DEVID_OUT_OF_RANGE,
    E_CAN_DEVID_ALLOC,
    E_CAN_DEVID_NOT_ALLOC,
    E_CAN_DEVICE_NOT_FOUND,
    E_CAN_SEND_ERR,
    E_CAN_RECEIVE_ERR,
    E_CAN_IO_GROUP_REQ_ERR,
    E_CAN_IO_LINE_REQ_ERR,
    E_CAN_POLL_TYPE_ERR
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
   * Return an object reference of the CAN_Status with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the CAN_Status
   * @return a reference to the CAN_Status specified by the argument
   */
  public static CAN_Status getReference( String s )
  {
    return( (CAN_Status)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the CAN_Status with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the CAN_Status
   * @return a reference to the CAN_Status specified by the argument
   */
  public static CAN_Status getReference( int i )
  {
    return( (CAN_Status)( intHash.get( new Integer( i ) ) ) );
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
  private CAN_Status( String s )
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
  private CAN_Status( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this CAN_Status.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this CAN_Status.
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
