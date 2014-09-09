package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type CCT_Status.  These are:
 * <ul>
 * <li>E_CCT_ERR_GEN</li>
 * <li>E_CCT_ERR_SETUP</li>
 * <li>E_CCT_ERR_CONFIG_FILE</li>
 * <li>E_CCT_ERR_CONFIG_PARAMS</li>
 * <li>E_CCT_ERR_CIL_NAME</li>
 * <li>E_CCT_ERR_CIL_RX</li>
 * <li>E_CCT_ERR_HEARTBEATS</li>
 * <li>E_CCT_ERR_APP_START</li>
 * <li>E_CCT_ERR_APP_KILL</li>
 * <li>E_CCT_ERR_OS_RESTART</li>
 * <li>E_CCT_ERR_OS_CLOSE</li>
 * <li>E_CCT_ERR_COMMAND_LEN</li>
 * <li>E_CCT_ERR_COMMAND</li>
 * <li>E_CCT_ERR_COMMAND_DATUM</li>
 * <li>E_CCT_ERR_APP_COUNT</li>
 * <li>E_CCT_ERR_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class CCT_Status
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
  private static final TTL_Package ttlPackage = TTL_Package.CCT;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * Miscellaneous error
   */
  public final static CCT_Status E_CCT_ERR_GEN =
      new CCT_Status( "E_CCT_ERR_GEN", 0, TTL_Package.E_CCT );

  /**
   * Error performing setup
   */
  public final static CCT_Status E_CCT_ERR_SETUP =
      new CCT_Status( "E_CCT_ERR_SETUP", 1, TTL_Package.E_CCT );

  /**
   * Error accessing the configuration file
   */
  public final static CCT_Status E_CCT_ERR_CONFIG_FILE =
      new CCT_Status( "E_CCT_ERR_CONFIG_FILE", 2, TTL_Package.E_CCT );

  /**
   * Error in contents of configuration file
   */
  public final static CCT_Status E_CCT_ERR_CONFIG_PARAMS =
      new CCT_Status( "E_CCT_ERR_CONFIG_PARAMS", 3, TTL_Package.E_CCT );

  /**
   * Error matching CIL name
   */
  public final static CCT_Status E_CCT_ERR_CIL_NAME =
      new CCT_Status( "E_CCT_ERR_CIL_NAME", 4, TTL_Package.E_CCT );

  /**
   * Unexpected CIL message received
   */
  public final static CCT_Status E_CCT_ERR_CIL_RX =
      new CCT_Status( "E_CCT_ERR_CIL_RX", 5, TTL_Package.E_CCT );

  /**
   * Assuming safe state due to heartbeat loss
   */
  public final static CCT_Status E_CCT_ERR_HEARTBEATS =
      new CCT_Status( "E_CCT_ERR_HEARTBEATS", 6, TTL_Package.E_CCT );

  /**
   * Error starting the application software
   */
  public final static CCT_Status E_CCT_ERR_APP_START =
      new CCT_Status( "E_CCT_ERR_APP_START", 7, TTL_Package.E_CCT );

  /**
   * Error killing the application software
   */
  public final static CCT_Status E_CCT_ERR_APP_KILL =
      new CCT_Status( "E_CCT_ERR_APP_KILL", 8, TTL_Package.E_CCT );

  /**
   * Error closing operating system for restart
   */
  public final static CCT_Status E_CCT_ERR_OS_RESTART =
      new CCT_Status( "E_CCT_ERR_OS_RESTART", 9, TTL_Package.E_CCT );

  /**
   * Error closing operating system down
   */
  public final static CCT_Status E_CCT_ERR_OS_CLOSE =
      new CCT_Status( "E_CCT_ERR_OS_CLOSE", 10, TTL_Package.E_CCT );

  /**
   * Error in length of incoming command
   */
  public final static CCT_Status E_CCT_ERR_COMMAND_LEN =
      new CCT_Status( "E_CCT_ERR_COMMAND_LEN", 11, TTL_Package.E_CCT );

  /**
   * Error in incoming command
   */
  public final static CCT_Status E_CCT_ERR_COMMAND =
      new CCT_Status( "E_CCT_ERR_COMMAND", 12, TTL_Package.E_CCT );

  /**
   * Error in datum of incoming command
   */
  public final static CCT_Status E_CCT_ERR_COMMAND_DATUM =
      new CCT_Status( "E_CCT_ERR_COMMAND_DATUM", 13, TTL_Package.E_CCT );

  /**
   * Number of applications to start exceeded
   */
  public final static CCT_Status E_CCT_ERR_APP_COUNT =
      new CCT_Status( "E_CCT_ERR_APP_COUNT", 14, TTL_Package.E_CCT );

  /**
   * 
   */
  public final static CCT_Status E_CCT_ERR_EOL =
      new CCT_Status( "E_CCT_ERR_EOL", 15, TTL_Package.E_CCT );

  /**
   * Array allowing serialization.
   */
  protected static final CCT_Status[] array =
  {
    E_CCT_ERR_GEN,
    E_CCT_ERR_SETUP,
    E_CCT_ERR_CONFIG_FILE,
    E_CCT_ERR_CONFIG_PARAMS,
    E_CCT_ERR_CIL_NAME,
    E_CCT_ERR_CIL_RX,
    E_CCT_ERR_HEARTBEATS,
    E_CCT_ERR_APP_START,
    E_CCT_ERR_APP_KILL,
    E_CCT_ERR_OS_RESTART,
    E_CCT_ERR_OS_CLOSE,
    E_CCT_ERR_COMMAND_LEN,
    E_CCT_ERR_COMMAND,
    E_CCT_ERR_COMMAND_DATUM,
    E_CCT_ERR_APP_COUNT,
    E_CCT_ERR_EOL
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
   * Return an object reference of the CCT_Status with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the CCT_Status
   * @return a reference to the CCT_Status specified by the argument
   */
  public static CCT_Status getReference( String s )
  {
    return( (CCT_Status)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the CCT_Status with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the CCT_Status
   * @return a reference to the CCT_Status specified by the argument
   */
  public static CCT_Status getReference( int i )
  {
    return( (CCT_Status)( intHash.get( new Integer( i ) ) ) );
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
  private CCT_Status( String s )
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
  private CCT_Status( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this CCT_Status.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this CCT_Status.
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
