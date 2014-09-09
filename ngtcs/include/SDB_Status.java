package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type SDB_Status.  These are:
 * <ul>
 * <li>E_SDB_GEN_ERR</li>
 * <li>E_SDB_SRC_UNKNOWN</li>
 * <li>E_SDB_WRONG_SRC</li>
 * <li>E_SDB_WRONG_DST</li>
 * <li>E_SDB_CLA_UNKNOWN</li>
 * <li>E_SDB_NOT_COMMAND</li>
 * <li>E_SDB_CLASS_ERR</li>
 * <li>E_SDB_TRUNCATED</li>
 * <li>E_SDB_MALLOC_FAIL</li>
 * <li>E_SDB_UNKNOWN_DEFN</li>
 * <li>E_SDB_NO_VALUES</li>
 * <li>E_SDB_LL_NOTEMPTY</li>
 * <li>E_SDB_LL_EMPTY</li>
 * <li>E_SDB_LL_NULLENTRY</li>
 * <li>E_SDB_LL_ENDOFLIST</li>
 * <li>E_SDB_UNKNOWN_SERVICE</li>
 * <li>E_SDB_BUFFER_OVERFLOW</li>
 * <li>E_SDB_FWRITE_FAIL</li>
 * <li>E_SDB_FOPEN_FAIL</li>
 * <li>E_SDB_HDR_MN_WRITE_ERR</li>
 * <li>E_SDB_HDR_TS_WRITE_ERR</li>
 * <li>E_SDB_ENCODE_FAILURE</li>
 * <li>E_SDB_SFR_SPAWN_FAIL</li>
 * <li>E_SDB_SFR_NOT_AVAIL</li>
 * <li>E_SDB_NO_UNITS_FILE</li>
 * <li>E_SDB_NO_SHELL</li>
 * <li>E_SDB_WRITE_ERR_LIMIT</li>
 * <li>E_SDB_HBEAT_FAIL</li>
 * <li>E_SDB_NOT_AUTH</li>
 * <li>E_SDB_EOERR_LIST</li>
 * <li>E_SDB_STATUS_MAX_VALUE</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class SDB_Status
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
  private static final TTL_Package ttlPackage = TTL_Package.SDB;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static SDB_Status E_SDB_GEN_ERR =
      new SDB_Status( "E_SDB_GEN_ERR", 0, TTL_Package.E_SDB );

  /**
   * Msg rx'd from unrecognised CIL src
   */
  public final static SDB_Status E_SDB_SRC_UNKNOWN =
      new SDB_Status( "E_SDB_SRC_UNKNOWN", 1, TTL_Package.E_SDB );

  /**
   * Msg rx'd from inappropriate CIL src
   */
  public final static SDB_Status E_SDB_WRONG_SRC =
      new SDB_Status( "E_SDB_WRONG_SRC", 2, TTL_Package.E_SDB );

  /**
   * Msg rx'd with non SDB destination
   */
  public final static SDB_Status E_SDB_WRONG_DST =
      new SDB_Status( "E_SDB_WRONG_DST", 3, TTL_Package.E_SDB );

  /**
   * Unrecognised command line arg
   */
  public final static SDB_Status E_SDB_CLA_UNKNOWN =
      new SDB_Status( "E_SDB_CLA_UNKNOWN", 4, TTL_Package.E_SDB );

  /**
   * The SDB has rejected a rx'd non command
   */
  public final static SDB_Status E_SDB_NOT_COMMAND =
      new SDB_Status( "E_SDB_NOT_COMMAND", 5, TTL_Package.E_SDB );

  /**
   * Message received with incorrect CIL class
   */
  public final static SDB_Status E_SDB_CLASS_ERR =
      new SDB_Status( "E_SDB_CLASS_ERR", 6, TTL_Package.E_SDB );

  /**
   * Insufficient data found in CIL message data
   */
  public final static SDB_Status E_SDB_TRUNCATED =
      new SDB_Status( "E_SDB_TRUNCATED", 7, TTL_Package.E_SDB );

  /**
   * Failure to allocate dynamic memory
   */
  public final static SDB_Status E_SDB_MALLOC_FAIL =
      new SDB_Status( "E_SDB_MALLOC_FAIL", 8, TTL_Package.E_SDB );

  /**
   * Data element definition not known
   */
  public final static SDB_Status E_SDB_UNKNOWN_DEFN =
      new SDB_Status( "E_SDB_UNKNOWN_DEFN", 9, TTL_Package.E_SDB );

  /**
   * Data element has no values stored
   */
  public final static SDB_Status E_SDB_NO_VALUES =
      new SDB_Status( "E_SDB_NO_VALUES", 10, TTL_Package.E_SDB );

  /**
   * Linked list not empty
   */
  public final static SDB_Status E_SDB_LL_NOTEMPTY =
      new SDB_Status( "E_SDB_LL_NOTEMPTY", 11, TTL_Package.E_SDB );

  /**
   * Linked list empty
   */
  public final static SDB_Status E_SDB_LL_EMPTY =
      new SDB_Status( "E_SDB_LL_EMPTY", 12, TTL_Package.E_SDB );

  /**
   * Attempted to insert null entry in linked list
   */
  public final static SDB_Status E_SDB_LL_NULLENTRY =
      new SDB_Status( "E_SDB_LL_NULLENTRY", 13, TTL_Package.E_SDB );

  /**
   * Unexpected end of link list encountered
   */
  public final static SDB_Status E_SDB_LL_ENDOFLIST =
      new SDB_Status( "E_SDB_LL_ENDOFLIST", 14, TTL_Package.E_SDB );

  /**
   * The SDB has rx'd an unrecognised command
   */
  public final static SDB_Status E_SDB_UNKNOWN_SERVICE =
      new SDB_Status( "E_SDB_UNKNOWN_SERVICE", 15, TTL_Package.E_SDB );

  /**
   * Too much data generated for buffer capacity
   */
  public final static SDB_Status E_SDB_BUFFER_OVERFLOW =
      new SDB_Status( "E_SDB_BUFFER_OVERFLOW", 16, TTL_Package.E_SDB );

  /**
   * Unable to write data to file
   */
  public final static SDB_Status E_SDB_FWRITE_FAIL =
      new SDB_Status( "E_SDB_FWRITE_FAIL", 17, TTL_Package.E_SDB );

  /**
   * Unable to open file for storage of data
   */
  public final static SDB_Status E_SDB_FOPEN_FAIL =
      new SDB_Status( "E_SDB_FOPEN_FAIL", 18, TTL_Package.E_SDB );

  /**
   * Error writing magic no. to storage file hdr
   */
  public final static SDB_Status E_SDB_HDR_MN_WRITE_ERR =
      new SDB_Status( "E_SDB_HDR_MN_WRITE_ERR", 19, TTL_Package.E_SDB );

  /**
   * Error writing timestamp to storage file hdr
   */
  public final static SDB_Status E_SDB_HDR_TS_WRITE_ERR =
      new SDB_Status( "E_SDB_HDR_TS_WRITE_ERR", 20, TTL_Package.E_SDB );

  /**
   * Unable to correctly generate a storage code
   */
  public final static SDB_Status E_SDB_ENCODE_FAILURE =
      new SDB_Status( "E_SDB_ENCODE_FAILURE", 21, TTL_Package.E_SDB );

  /**
   * Unable to spawn the storage file reader
   */
  public final static SDB_Status E_SDB_SFR_SPAWN_FAIL =
      new SDB_Status( "E_SDB_SFR_SPAWN_FAIL", 22, TTL_Package.E_SDB );

  /**
   * Storage file reading not available (not QNX)
   */
  public final static SDB_Status E_SDB_SFR_NOT_AVAIL =
      new SDB_Status( "E_SDB_SFR_NOT_AVAIL", 23, TTL_Package.E_SDB );

  /**
   * Units file empty or non existant
   */
  public final static SDB_Status E_SDB_NO_UNITS_FILE =
      new SDB_Status( "E_SDB_NO_UNITS_FILE", 24, TTL_Package.E_SDB );

  /**
   * There's no shell or command handler available
   */
  public final static SDB_Status E_SDB_NO_SHELL =
      new SDB_Status( "E_SDB_NO_SHELL", 25, TTL_Package.E_SDB );

  /**
   * Max no. write to file failures exceeded
   */
  public final static SDB_Status E_SDB_WRITE_ERR_LIMIT =
      new SDB_Status( "E_SDB_WRITE_ERR_LIMIT", 26, TTL_Package.E_SDB );

  /**
   * No heartbeats or error processing response
   */
  public final static SDB_Status E_SDB_HBEAT_FAIL =
      new SDB_Status( "E_SDB_HBEAT_FAIL", 27, TTL_Package.E_SDB );

  /**
   * Not authorised to preform this command
   */
  public final static SDB_Status E_SDB_NOT_AUTH =
      new SDB_Status( "E_SDB_NOT_AUTH", 28, TTL_Package.E_SDB );

  /**
   * End error list marker (DON'T USE FOR STATUS)
   */
  public final static SDB_Status E_SDB_EOERR_LIST =
      new SDB_Status( "E_SDB_EOERR_LIST", 29, TTL_Package.E_SDB );

  /**
   * Req'd to force size to 4 bytes
   */
  public final static SDB_Status E_SDB_STATUS_MAX_VALUE =
      new SDB_Status( "E_SDB_STATUS_MAX_VALUE", 30, TTL_Package.E_SDB );

  /**
   * Array allowing serialization.
   */
  protected static final SDB_Status[] array =
  {
    E_SDB_GEN_ERR,
    E_SDB_SRC_UNKNOWN,
    E_SDB_WRONG_SRC,
    E_SDB_WRONG_DST,
    E_SDB_CLA_UNKNOWN,
    E_SDB_NOT_COMMAND,
    E_SDB_CLASS_ERR,
    E_SDB_TRUNCATED,
    E_SDB_MALLOC_FAIL,
    E_SDB_UNKNOWN_DEFN,
    E_SDB_NO_VALUES,
    E_SDB_LL_NOTEMPTY,
    E_SDB_LL_EMPTY,
    E_SDB_LL_NULLENTRY,
    E_SDB_LL_ENDOFLIST,
    E_SDB_UNKNOWN_SERVICE,
    E_SDB_BUFFER_OVERFLOW,
    E_SDB_FWRITE_FAIL,
    E_SDB_FOPEN_FAIL,
    E_SDB_HDR_MN_WRITE_ERR,
    E_SDB_HDR_TS_WRITE_ERR,
    E_SDB_ENCODE_FAILURE,
    E_SDB_SFR_SPAWN_FAIL,
    E_SDB_SFR_NOT_AVAIL,
    E_SDB_NO_UNITS_FILE,
    E_SDB_NO_SHELL,
    E_SDB_WRITE_ERR_LIMIT,
    E_SDB_HBEAT_FAIL,
    E_SDB_NOT_AUTH,
    E_SDB_EOERR_LIST,
    E_SDB_STATUS_MAX_VALUE
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
   * Return an object reference of the SDB_Status with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the SDB_Status
   * @return a reference to the SDB_Status specified by the argument
   */
  public static SDB_Status getReference( String s )
  {
    return( (SDB_Status)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the SDB_Status with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the SDB_Status
   * @return a reference to the SDB_Status specified by the argument
   */
  public static SDB_Status getReference( int i )
  {
    return( (SDB_Status)( intHash.get( new Integer( i ) ) ) );
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
  private SDB_Status( String s )
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
  private SDB_Status( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this SDB_Status.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this SDB_Status.
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
