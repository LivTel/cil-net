package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type MBS_Status.  These are:
 * <ul>
 * <li>E_MBS_GEN_ERROR</li>
 * <li>E_MBS_INIT_FAIL</li>
 * <li>E_MBS_SHUTDOWN_ERROR</li>
 * <li>E_MBS_OPEN_FAIL</li>
 * <li>E_MBS_CLOSE_FAIL</li>
 * <li>E_MBS_READ_FAIL</li>
 * <li>E_MBS_SEND_FAIL</li>
 * <li>E_MBS_INVALID_DATA_LEN</li>
 * <li>E_MBS_INVALID_COMMAND</li>
 * <li>E_MBS_TIMER_SETUP_ERR</li>
 * <li>E_MBS_TIMER_CLOSE_ERR</li>
 * <li>E_MBS_INVALID_DATA_VALUE</li>
 * <li>E_MBS_SEND_ERR</li>
 * <li>E_MBS_RECEIVE_ERR</li>
 * <li>E_MBS_BUFFER_OVERFLOW</li>
 * <li>E_MBS_EMPTY_REPLY</li>
 * <li>E_MBS_REPLY_ERR</li>
 * <li>E_MBS_INSUFFICIENT_DATA</li>
 * <li>E_MBS_SUSPICIOUS_VALUE</li>
 * <li>E_MBS_OID_CONFIG_ERR</li>
 * <li>E_MBS_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class MBS_Status
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
  private static final TTL_Package ttlPackage = TTL_Package.MBS;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static MBS_Status E_MBS_GEN_ERROR =
      new MBS_Status( "E_MBS_GEN_ERROR", 0, TTL_Package.E_MBS );

  /**
   * Initialisation error.
   */
  public final static MBS_Status E_MBS_INIT_FAIL =
      new MBS_Status( "E_MBS_INIT_FAIL", 1, TTL_Package.E_MBS );

  /**
   * Failed to shutdown.
   */
  public final static MBS_Status E_MBS_SHUTDOWN_ERROR =
      new MBS_Status( "E_MBS_SHUTDOWN_ERROR", 2, TTL_Package.E_MBS );

  /**
   * Failed to open a ModBus connection.
   */
  public final static MBS_Status E_MBS_OPEN_FAIL =
      new MBS_Status( "E_MBS_OPEN_FAIL", 3, TTL_Package.E_MBS );

  /**
   * Failed to close a ModBus connection.
   */
  public final static MBS_Status E_MBS_CLOSE_FAIL =
      new MBS_Status( "E_MBS_CLOSE_FAIL", 4, TTL_Package.E_MBS );

  /**
   * Failed to read data from a slave device.
   */
  public final static MBS_Status E_MBS_READ_FAIL =
      new MBS_Status( "E_MBS_READ_FAIL", 5, TTL_Package.E_MBS );

  /**
   * Failed to send a request to a slave device.
   */
  public final static MBS_Status E_MBS_SEND_FAIL =
      new MBS_Status( "E_MBS_SEND_FAIL", 6, TTL_Package.E_MBS );

  /**
   * An invalid data length was specified.
   */
  public final static MBS_Status E_MBS_INVALID_DATA_LEN =
      new MBS_Status( "E_MBS_INVALID_DATA_LEN", 7, TTL_Package.E_MBS );

  /**
   * An invlaid command was received.
   */
  public final static MBS_Status E_MBS_INVALID_COMMAND =
      new MBS_Status( "E_MBS_INVALID_COMMAND", 8, TTL_Package.E_MBS );

  /**
   * Failed to setup a timer.
   */
  public final static MBS_Status E_MBS_TIMER_SETUP_ERR =
      new MBS_Status( "E_MBS_TIMER_SETUP_ERR", 9, TTL_Package.E_MBS );

  /**
   * Failed to close a timer.
   */
  public final static MBS_Status E_MBS_TIMER_CLOSE_ERR =
      new MBS_Status( "E_MBS_TIMER_CLOSE_ERR", 10, TTL_Package.E_MBS );

  /**
   * A data message was found to have an
   */
  public final static MBS_Status E_MBS_INVALID_DATA_VALUE =
      new MBS_Status( "E_MBS_INVALID_DATA_VALUE", 11, TTL_Package.E_MBS );

  /**
   * An error occured while sending a message.
   */
  public final static MBS_Status E_MBS_SEND_ERR =
      new MBS_Status( "E_MBS_SEND_ERR", 12, TTL_Package.E_MBS );

  /**
   * An error occured while receiveing a message.
   */
  public final static MBS_Status E_MBS_RECEIVE_ERR =
      new MBS_Status( "E_MBS_RECEIVE_ERR", 13, TTL_Package.E_MBS );

  /**
   * A supplied buffer was of insuficient size.
   */
  public final static MBS_Status E_MBS_BUFFER_OVERFLOW =
      new MBS_Status( "E_MBS_BUFFER_OVERFLOW", 14, TTL_Package.E_MBS );

  /**
   * A reply from a slave device was empty.
   */
  public final static MBS_Status E_MBS_EMPTY_REPLY =
      new MBS_Status( "E_MBS_EMPTY_REPLY", 15, TTL_Package.E_MBS );

  /**
   * An error was returned by a slave device.
   */
  public final static MBS_Status E_MBS_REPLY_ERR =
      new MBS_Status( "E_MBS_REPLY_ERR", 16, TTL_Package.E_MBS );

  /**
   * Insufficient data vailable for operation.
   */
  public final static MBS_Status E_MBS_INSUFFICIENT_DATA =
      new MBS_Status( "E_MBS_INSUFFICIENT_DATA", 17, TTL_Package.E_MBS );

  /**
   * A data value deviates significantly from
   */
  public final static MBS_Status E_MBS_SUSPICIOUS_VALUE =
      new MBS_Status( "E_MBS_SUSPICIOUS_VALUE", 18, TTL_Package.E_MBS );

  /**
   * Error while attempting to configure an OID.
   */
  public final static MBS_Status E_MBS_OID_CONFIG_ERR =
      new MBS_Status( "E_MBS_OID_CONFIG_ERR", 19, TTL_Package.E_MBS );

  /**
   * 
   */
  public final static MBS_Status E_MBS_EOL =
      new MBS_Status( "E_MBS_EOL", 20, TTL_Package.E_MBS );

  /**
   * Array allowing serialization.
   */
  protected static final MBS_Status[] array =
  {
    E_MBS_GEN_ERROR,
    E_MBS_INIT_FAIL,
    E_MBS_SHUTDOWN_ERROR,
    E_MBS_OPEN_FAIL,
    E_MBS_CLOSE_FAIL,
    E_MBS_READ_FAIL,
    E_MBS_SEND_FAIL,
    E_MBS_INVALID_DATA_LEN,
    E_MBS_INVALID_COMMAND,
    E_MBS_TIMER_SETUP_ERR,
    E_MBS_TIMER_CLOSE_ERR,
    E_MBS_INVALID_DATA_VALUE,
    E_MBS_SEND_ERR,
    E_MBS_RECEIVE_ERR,
    E_MBS_BUFFER_OVERFLOW,
    E_MBS_EMPTY_REPLY,
    E_MBS_REPLY_ERR,
    E_MBS_INSUFFICIENT_DATA,
    E_MBS_SUSPICIOUS_VALUE,
    E_MBS_OID_CONFIG_ERR,
    E_MBS_EOL
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
   * Return an object reference of the MBS_Status with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the MBS_Status
   * @return a reference to the MBS_Status specified by the argument
   */
  public static MBS_Status getReference( String s )
  {
    return( (MBS_Status)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the MBS_Status with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the MBS_Status
   * @return a reference to the MBS_Status specified by the argument
   */
  public static MBS_Status getReference( int i )
  {
    return( (MBS_Status)( intHash.get( new Integer( i ) ) ) );
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
  private MBS_Status( String s )
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
  private MBS_Status( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this MBS_Status.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this MBS_Status.
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
