package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type REP_Status.  These are:
 * <ul>
 * <li>E_REP_GEN_ERROR</li>
 * <li>E_REP_INIT_FAIL</li>
 * <li>E_REP_QUEUE_RX_ERROR</li>
 * <li>E_REP_SDB_TX_ERROR</li>
 * <li>E_REP_SDB_RX_ERROR</li>
 * <li>E_REP_SDB_RX_TIMEOUT</li>
 * <li>E_REP_SDB_ACK_ERROR</li>
 * <li>E_REP_SHUTDOWN_ERROR</li>
 * <li>E_REP_INVALID_DATA_LEN</li>
 * <li>E_REP_INVALID_COMMAND</li>
 * <li>E_REP_REPLY_FAIL</li>
 * <li>E_REP_SERVER_STARTUP_FAIL</li>
 * <li>E_REP_SERVER_SHUTDOWN_FAIL</li>
 * <li>E_REP_SERVER_NOT_RUNNING</li>
 * <li>E_REP_SERVER_SEND_FAIL</li>
 * <li>E_REP_REQUEST_QUEUE_FAIL</li>
 * <li>E_REP_INVALID_QUEUE_NAME</li>
 * <li>E_REP_QUEUE_OPEN_FAIL</li>
 * <li>E_REP_SERVER_MQOPEN_FAIL</li>
 * <li>E_REP_SERVER_MQSEND_FAIL</li>
 * <li>E_REP_NODE_ID_ERR</li>
 * <li>E_REP_INVALID_NODE_ID</li>
 * <li>E_REP_NODE_UNRESOLVED</li>
 * <li>E_REP_RX_MSG_ERR</li>
 * <li>E_REP_PROXY_ERR</li>
 * <li>E_REP_ERR_SUBMIT_LIST</li>
 * <li>E_REP_ERR_CLEAR_LIST</li>
 * <li>E_REP_TIMER_SETUP_ERR</li>
 * <li>E_REP_STATUS_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class REP_Status
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
  private static final TTL_Package ttlPackage = TTL_Package.REP;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static REP_Status E_REP_GEN_ERROR =
      new REP_Status( "E_REP_GEN_ERROR", 0, TTL_Package.E_REP );

  /**
   * 
   */
  public final static REP_Status E_REP_INIT_FAIL =
      new REP_Status( "E_REP_INIT_FAIL", 1, TTL_Package.E_REP );

  /**
   * 
   */
  public final static REP_Status E_REP_QUEUE_RX_ERROR =
      new REP_Status( "E_REP_QUEUE_RX_ERROR", 2, TTL_Package.E_REP );

  /**
   * 
   */
  public final static REP_Status E_REP_SDB_TX_ERROR =
      new REP_Status( "E_REP_SDB_TX_ERROR", 3, TTL_Package.E_REP );

  /**
   * 
   */
  public final static REP_Status E_REP_SDB_RX_ERROR =
      new REP_Status( "E_REP_SDB_RX_ERROR", 4, TTL_Package.E_REP );

  /**
   * 
   */
  public final static REP_Status E_REP_SDB_RX_TIMEOUT =
      new REP_Status( "E_REP_SDB_RX_TIMEOUT", 5, TTL_Package.E_REP );

  /**
   * 
   */
  public final static REP_Status E_REP_SDB_ACK_ERROR =
      new REP_Status( "E_REP_SDB_ACK_ERROR", 6, TTL_Package.E_REP );

  /**
   * 
   */
  public final static REP_Status E_REP_SHUTDOWN_ERROR =
      new REP_Status( "E_REP_SHUTDOWN_ERROR", 7, TTL_Package.E_REP );

  /**
   * 
   */
  public final static REP_Status E_REP_INVALID_DATA_LEN =
      new REP_Status( "E_REP_INVALID_DATA_LEN", 8, TTL_Package.E_REP );

  /**
   * 
   */
  public final static REP_Status E_REP_INVALID_COMMAND =
      new REP_Status( "E_REP_INVALID_COMMAND", 9, TTL_Package.E_REP );

  /**
   * 
   */
  public final static REP_Status E_REP_REPLY_FAIL =
      new REP_Status( "E_REP_REPLY_FAIL", 10, TTL_Package.E_REP );

  /**
   * 
   */
  public final static REP_Status E_REP_SERVER_STARTUP_FAIL =
      new REP_Status( "E_REP_SERVER_STARTUP_FAIL", 11, TTL_Package.E_REP );

  /**
   * 
   */
  public final static REP_Status E_REP_SERVER_SHUTDOWN_FAIL =
      new REP_Status( "E_REP_SERVER_SHUTDOWN_FAIL", 12, TTL_Package.E_REP );

  /**
   * 
   */
  public final static REP_Status E_REP_SERVER_NOT_RUNNING =
      new REP_Status( "E_REP_SERVER_NOT_RUNNING", 13, TTL_Package.E_REP );

  /**
   * 
   */
  public final static REP_Status E_REP_SERVER_SEND_FAIL =
      new REP_Status( "E_REP_SERVER_SEND_FAIL", 14, TTL_Package.E_REP );

  /**
   * 
   */
  public final static REP_Status E_REP_REQUEST_QUEUE_FAIL =
      new REP_Status( "E_REP_REQUEST_QUEUE_FAIL", 15, TTL_Package.E_REP );

  /**
   * 
   */
  public final static REP_Status E_REP_INVALID_QUEUE_NAME =
      new REP_Status( "E_REP_INVALID_QUEUE_NAME", 16, TTL_Package.E_REP );

  /**
   * 
   */
  public final static REP_Status E_REP_QUEUE_OPEN_FAIL =
      new REP_Status( "E_REP_QUEUE_OPEN_FAIL", 17, TTL_Package.E_REP );

  /**
   * 
   */
  public final static REP_Status E_REP_SERVER_MQOPEN_FAIL =
      new REP_Status( "E_REP_SERVER_MQOPEN_FAIL", 18, TTL_Package.E_REP );

  /**
   * 
   */
  public final static REP_Status E_REP_SERVER_MQSEND_FAIL =
      new REP_Status( "E_REP_SERVER_MQSEND_FAIL", 19, TTL_Package.E_REP );

  /**
   * 
   */
  public final static REP_Status E_REP_NODE_ID_ERR =
      new REP_Status( "E_REP_NODE_ID_ERR", 20, TTL_Package.E_REP );

  /**
   * 
   */
  public final static REP_Status E_REP_INVALID_NODE_ID =
      new REP_Status( "E_REP_INVALID_NODE_ID", 21, TTL_Package.E_REP );

  /**
   * 
   */
  public final static REP_Status E_REP_NODE_UNRESOLVED =
      new REP_Status( "E_REP_NODE_UNRESOLVED", 22, TTL_Package.E_REP );

  /**
   * 
   */
  public final static REP_Status E_REP_RX_MSG_ERR =
      new REP_Status( "E_REP_RX_MSG_ERR", 23, TTL_Package.E_REP );

  /**
   * 
   */
  public final static REP_Status E_REP_PROXY_ERR =
      new REP_Status( "E_REP_PROXY_ERR", 24, TTL_Package.E_REP );

  /**
   * 
   */
  public final static REP_Status E_REP_ERR_SUBMIT_LIST =
      new REP_Status( "E_REP_ERR_SUBMIT_LIST", 25, TTL_Package.E_REP );

  /**
   * 
   */
  public final static REP_Status E_REP_ERR_CLEAR_LIST =
      new REP_Status( "E_REP_ERR_CLEAR_LIST", 26, TTL_Package.E_REP );

  /**
   * 
   */
  public final static REP_Status E_REP_TIMER_SETUP_ERR =
      new REP_Status( "E_REP_TIMER_SETUP_ERR", 27, TTL_Package.E_REP );

  /**
   * 
   */
  public final static REP_Status E_REP_STATUS_EOL =
      new REP_Status( "E_REP_STATUS_EOL", 28, TTL_Package.E_REP );

  /**
   * Array allowing serialization.
   */
  protected static final REP_Status[] array =
  {
    E_REP_GEN_ERROR,
    E_REP_INIT_FAIL,
    E_REP_QUEUE_RX_ERROR,
    E_REP_SDB_TX_ERROR,
    E_REP_SDB_RX_ERROR,
    E_REP_SDB_RX_TIMEOUT,
    E_REP_SDB_ACK_ERROR,
    E_REP_SHUTDOWN_ERROR,
    E_REP_INVALID_DATA_LEN,
    E_REP_INVALID_COMMAND,
    E_REP_REPLY_FAIL,
    E_REP_SERVER_STARTUP_FAIL,
    E_REP_SERVER_SHUTDOWN_FAIL,
    E_REP_SERVER_NOT_RUNNING,
    E_REP_SERVER_SEND_FAIL,
    E_REP_REQUEST_QUEUE_FAIL,
    E_REP_INVALID_QUEUE_NAME,
    E_REP_QUEUE_OPEN_FAIL,
    E_REP_SERVER_MQOPEN_FAIL,
    E_REP_SERVER_MQSEND_FAIL,
    E_REP_NODE_ID_ERR,
    E_REP_INVALID_NODE_ID,
    E_REP_NODE_UNRESOLVED,
    E_REP_RX_MSG_ERR,
    E_REP_PROXY_ERR,
    E_REP_ERR_SUBMIT_LIST,
    E_REP_ERR_CLEAR_LIST,
    E_REP_TIMER_SETUP_ERR,
    E_REP_STATUS_EOL
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
   * Return an object reference of the REP_Status with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the REP_Status
   * @return a reference to the REP_Status specified by the argument
   */
  public static REP_Status getReference( String s )
  {
    return( (REP_Status)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the REP_Status with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the REP_Status
   * @return a reference to the REP_Status specified by the argument
   */
  public static REP_Status getReference( int i )
  {
    return( (REP_Status)( intHash.get( new Integer( i ) ) ) );
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
  private REP_Status( String s )
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
  private REP_Status( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this REP_Status.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this REP_Status.
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
