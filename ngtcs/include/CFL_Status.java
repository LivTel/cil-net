package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type CFL_Status.  These are:
 * <ul>
 * <li>E_CFL_GEN_ERROR</li>
 * <li>E_CFL_INIT_FAIL</li>
 * <li>E_CFL_SHUTDOWN_ERROR</li>
 * <li>E_CFL_INVALID_DATA_LEN</li>
 * <li>E_CFL_INVALID_COMMAND</li>
 * <li>E_CFL_INVALID_PARAMETER</li>
 * <li>E_CFL_REPLY_FAIL</li>
 * <li>E_CFL_SERVER_STARTUP_FAIL</li>
 * <li>E_CFL_SERVER_SHUTDOWN_FAIL</li>
 * <li>E_CFL_SERVER_NOT_RUNNING</li>
 * <li>E_CFL_SERVER_SEND_FAIL</li>
 * <li>E_CFL_TIMER_ATTACH_ERR</li>
 * <li>E_CFL_TIMER_CREATE_ERR</li>
 * <li>E_CFL_TIMER_UNDERFLOW_ERR</li>
 * <li>E_CFL_TIMER_OVERFLOW_ERR</li>
 * <li>E_CFL_TIMER_CONFIG_ERR</li>
 * <li>E_CFL_TIMER_CLOSE_ERR</li>
 * <li>E_CFL_SDB_UPDATE_FAIL</li>
 * <li>E_CFL_CMD_TABLE_FULL</li>
 * <li>E_CFL_OID_NOT_IN_TABLE</li>
 * <li>E_CFL_NUM_OUTSIDE_TABLE</li>
 * <li>E_CFL_ALREADY_FAST_LOGGING</li>
 * <li>E_CFL_OID_ALREADY_IN_TABLE</li>
 * <li>E_CFL_DEAD_ENDCLIENT</li>
 * <li>E_CFL_UNINITIALISED</li>
 * <li>E_CFL_INITIALISING</li>
 * <li>E_CFL_WAITING_TO_FAST_LOG</li>
 * <li>E_CFL_FAST_LOGGING</li>
 * <li>E_CFL_BUFFER_FILLED</li>
 * <li>E_CFL_UPDATING_SDB</li>
 * <li>E_CFL_SHUT_DOWN</li>
 * <li>E_CFL_STATUS_EOL</li>
 * <li>E_CFL_STATUS_MAX_VALUE</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class CFL_Status
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
  private static final TTL_Package ttlPackage = TTL_Package.CFL;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static CFL_Status E_CFL_GEN_ERROR =
      new CFL_Status( "E_CFL_GEN_ERROR", 0, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Status E_CFL_INIT_FAIL =
      new CFL_Status( "E_CFL_INIT_FAIL", 1, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Status E_CFL_SHUTDOWN_ERROR =
      new CFL_Status( "E_CFL_SHUTDOWN_ERROR", 2, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Status E_CFL_INVALID_DATA_LEN =
      new CFL_Status( "E_CFL_INVALID_DATA_LEN", 3, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Status E_CFL_INVALID_COMMAND =
      new CFL_Status( "E_CFL_INVALID_COMMAND", 4, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Status E_CFL_INVALID_PARAMETER =
      new CFL_Status( "E_CFL_INVALID_PARAMETER", 5, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Status E_CFL_REPLY_FAIL =
      new CFL_Status( "E_CFL_REPLY_FAIL", 6, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Status E_CFL_SERVER_STARTUP_FAIL =
      new CFL_Status( "E_CFL_SERVER_STARTUP_FAIL", 7, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Status E_CFL_SERVER_SHUTDOWN_FAIL =
      new CFL_Status( "E_CFL_SERVER_SHUTDOWN_FAIL", 8, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Status E_CFL_SERVER_NOT_RUNNING =
      new CFL_Status( "E_CFL_SERVER_NOT_RUNNING", 9, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Status E_CFL_SERVER_SEND_FAIL =
      new CFL_Status( "E_CFL_SERVER_SEND_FAIL", 10, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Status E_CFL_TIMER_ATTACH_ERR =
      new CFL_Status( "E_CFL_TIMER_ATTACH_ERR", 11, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Status E_CFL_TIMER_CREATE_ERR =
      new CFL_Status( "E_CFL_TIMER_CREATE_ERR", 12, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Status E_CFL_TIMER_UNDERFLOW_ERR =
      new CFL_Status( "E_CFL_TIMER_UNDERFLOW_ERR", 13, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Status E_CFL_TIMER_OVERFLOW_ERR =
      new CFL_Status( "E_CFL_TIMER_OVERFLOW_ERR", 14, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Status E_CFL_TIMER_CONFIG_ERR =
      new CFL_Status( "E_CFL_TIMER_CONFIG_ERR", 15, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Status E_CFL_TIMER_CLOSE_ERR =
      new CFL_Status( "E_CFL_TIMER_CLOSE_ERR", 16, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Status E_CFL_SDB_UPDATE_FAIL =
      new CFL_Status( "E_CFL_SDB_UPDATE_FAIL", 17, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Status E_CFL_CMD_TABLE_FULL =
      new CFL_Status( "E_CFL_CMD_TABLE_FULL", 18, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Status E_CFL_OID_NOT_IN_TABLE =
      new CFL_Status( "E_CFL_OID_NOT_IN_TABLE", 19, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Status E_CFL_NUM_OUTSIDE_TABLE =
      new CFL_Status( "E_CFL_NUM_OUTSIDE_TABLE", 20, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Status E_CFL_ALREADY_FAST_LOGGING =
      new CFL_Status( "E_CFL_ALREADY_FAST_LOGGING", 21, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Status E_CFL_OID_ALREADY_IN_TABLE =
      new CFL_Status( "E_CFL_OID_ALREADY_IN_TABLE", 22, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Status E_CFL_DEAD_ENDCLIENT =
      new CFL_Status( "E_CFL_DEAD_ENDCLIENT", 23, TTL_Package.E_CFL );

  /**
   * Used to update the Oid Log State
   */
  public final static CFL_Status E_CFL_UNINITIALISED =
      new CFL_Status( "E_CFL_UNINITIALISED", 24, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Status E_CFL_INITIALISING =
      new CFL_Status( "E_CFL_INITIALISING", 25, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Status E_CFL_WAITING_TO_FAST_LOG =
      new CFL_Status( "E_CFL_WAITING_TO_FAST_LOG", 26, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Status E_CFL_FAST_LOGGING =
      new CFL_Status( "E_CFL_FAST_LOGGING", 27, TTL_Package.E_CFL );

  /**
   * Local status dont update Sdb
   */
  public final static CFL_Status E_CFL_BUFFER_FILLED =
      new CFL_Status( "E_CFL_BUFFER_FILLED", 28, TTL_Package.E_CFL );

  /**
   * Local status dont update Sdb
   */
  public final static CFL_Status E_CFL_UPDATING_SDB =
      new CFL_Status( "E_CFL_UPDATING_SDB", 29, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Status E_CFL_SHUT_DOWN =
      new CFL_Status( "E_CFL_SHUT_DOWN", 30, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Status E_CFL_STATUS_EOL =
      new CFL_Status( "E_CFL_STATUS_EOL", 31, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Status E_CFL_STATUS_MAX_VALUE =
      new CFL_Status( "E_CFL_STATUS_MAX_VALUE", 32, TTL_Package.E_CFL );

  /**
   * Array allowing serialization.
   */
  protected static final CFL_Status[] array =
  {
    E_CFL_GEN_ERROR,
    E_CFL_INIT_FAIL,
    E_CFL_SHUTDOWN_ERROR,
    E_CFL_INVALID_DATA_LEN,
    E_CFL_INVALID_COMMAND,
    E_CFL_INVALID_PARAMETER,
    E_CFL_REPLY_FAIL,
    E_CFL_SERVER_STARTUP_FAIL,
    E_CFL_SERVER_SHUTDOWN_FAIL,
    E_CFL_SERVER_NOT_RUNNING,
    E_CFL_SERVER_SEND_FAIL,
    E_CFL_TIMER_ATTACH_ERR,
    E_CFL_TIMER_CREATE_ERR,
    E_CFL_TIMER_UNDERFLOW_ERR,
    E_CFL_TIMER_OVERFLOW_ERR,
    E_CFL_TIMER_CONFIG_ERR,
    E_CFL_TIMER_CLOSE_ERR,
    E_CFL_SDB_UPDATE_FAIL,
    E_CFL_CMD_TABLE_FULL,
    E_CFL_OID_NOT_IN_TABLE,
    E_CFL_NUM_OUTSIDE_TABLE,
    E_CFL_ALREADY_FAST_LOGGING,
    E_CFL_OID_ALREADY_IN_TABLE,
    E_CFL_DEAD_ENDCLIENT,
    E_CFL_UNINITIALISED,
    E_CFL_INITIALISING,
    E_CFL_WAITING_TO_FAST_LOG,
    E_CFL_FAST_LOGGING,
    E_CFL_BUFFER_FILLED,
    E_CFL_UPDATING_SDB,
    E_CFL_SHUT_DOWN,
    E_CFL_STATUS_EOL,
    E_CFL_STATUS_MAX_VALUE
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
   * Return an object reference of the CFL_Status with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the CFL_Status
   * @return a reference to the CFL_Status specified by the argument
   */
  public static CFL_Status getReference( String s )
  {
    return( (CFL_Status)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the CFL_Status with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the CFL_Status
   * @return a reference to the CFL_Status specified by the argument
   */
  public static CFL_Status getReference( int i )
  {
    return( (CFL_Status)( intHash.get( new Integer( i ) ) ) );
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
  private CFL_Status( String s )
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
  private CFL_Status( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this CFL_Status.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this CFL_Status.
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
