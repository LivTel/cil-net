package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type CIL_Status.  These are:
 * <ul>
 * <li>E_CIL_GEN_ERR</li>
 * <li>E_CIL_NO_SETUP</li>
 * <li>E_CIL_ALREADY_SETUP</li>
 * <li>E_CIL_MAP_NOT_FOUND</li>
 * <li>E_CIL_NO_MAP_GIVEN</li>
 * <li>E_CIL_MAP_ERROR</li>
 * <li>E_CIL_MAP_TOO_SMALL</li>
 * <li>E_CIL_UNKNOWN_NAME</li>
 * <li>E_CIL_NO_NAME</li>
 * <li>E_CIL_SEND_ERR</li>
 * <li>E_CIL_RECV_ERR</li>
 * <li>E_CIL_TIMEOUT</li>
 * <li>E_CIL_ID_INVALID</li>
 * <li>E_CIL_RXID_UNKNOWN</li>
 * <li>E_CIL_NEW_DEST_FAIL</li>
 * <li>E_CIL_SOCKET_FAIL</li>
 * <li>E_CIL_PARAM_ERR</li>
 * <li>E_CIL_NULL_MSG</li>
 * <li>E_CIL_NULL_RXID</li>
 * <li>E_CIL_NULL_DATA</li>
 * <li>E_CIL_NO_MEMORY</li>
 * <li>E_CIL_NO_STORAGE</li>
 * <li>E_CIL_BAD_TIMEOUT</li>
 * <li>E_CIL_NEG_DATALEN</li>
 * <li>E_CIL_ADDRINUSE</li>
 * <li>E_CIL_ADDRNOTAVAIL</li>
 * <li>E_CIL_FLUSH_ERROR</li>
 * <li>E_CIL_MAP_DENIED</li>
 * <li>E_CIL_ID_IN_USE</li>
 * <li>E_CIL_NO_DATA</li>
 * <li>E_CIL_RXID_INVALID</li>
 * <li>E_CIL_TXID_UNKNOWN</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class CIL_Status
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
  private static final TTL_Package ttlPackage = TTL_Package.CIL;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static CIL_Status E_CIL_GEN_ERR =
      new CIL_Status( "E_CIL_GEN_ERR", 0, TTL_Package.E_CIL );

  /**
   * eCilSetup has not been called. Function can't work
   */
  public final static CIL_Status E_CIL_NO_SETUP =
      new CIL_Status( "E_CIL_NO_SETUP", 1, TTL_Package.E_CIL );

  /**
   * eCilSetup() has already been called
   */
  public final static CIL_Status E_CIL_ALREADY_SETUP =
      new CIL_Status( "E_CIL_ALREADY_SETUP", 2, TTL_Package.E_CIL );

  /**
   * Unable to find the specified CIL Mapfile
   */
  public final static CIL_Status E_CIL_MAP_NOT_FOUND =
      new CIL_Status( "E_CIL_MAP_NOT_FOUND", 3, TTL_Package.E_CIL );

  /**
   * No map filename was provided
   */
  public final static CIL_Status E_CIL_NO_MAP_GIVEN =
      new CIL_Status( "E_CIL_NO_MAP_GIVEN", 4, TTL_Package.E_CIL );

  /**
   * An error occured while reading the map file
   */
  public final static CIL_Status E_CIL_MAP_ERROR =
      new CIL_Status( "E_CIL_MAP_ERROR", 5, TTL_Package.E_CIL );

  /**
   * Insufficient entries in map file for comms
   */
  public final static CIL_Status E_CIL_MAP_TOO_SMALL =
      new CIL_Status( "E_CIL_MAP_TOO_SMALL", 6, TTL_Package.E_CIL );

  /**
   * Specified name not found in map
   */
  public final static CIL_Status E_CIL_UNKNOWN_NAME =
      new CIL_Status( "E_CIL_UNKNOWN_NAME", 7, TTL_Package.E_CIL );

  /**
   * No CIL name was specified
   */
  public final static CIL_Status E_CIL_NO_NAME =
      new CIL_Status( "E_CIL_NO_NAME", 8, TTL_Package.E_CIL );

  /**
   * Failed to send UDP packet
   */
  public final static CIL_Status E_CIL_SEND_ERR =
      new CIL_Status( "E_CIL_SEND_ERR", 9, TTL_Package.E_CIL );

  /**
   * Failed to receive UDP packet
   */
  public final static CIL_Status E_CIL_RECV_ERR =
      new CIL_Status( "E_CIL_RECV_ERR", 10, TTL_Package.E_CIL );

  /**
   * No UDP packet received in the specified time
   */
  public final static CIL_Status E_CIL_TIMEOUT =
      new CIL_Status( "E_CIL_TIMEOUT", 11, TTL_Package.E_CIL );

  /**
   * Specified CIL ID is not recognised
   */
  public final static CIL_Status E_CIL_ID_INVALID =
      new CIL_Status( "E_CIL_ID_INVALID", 12, TTL_Package.E_CIL );

  /**
   * Message received from unrecognised source
   */
  public final static CIL_Status E_CIL_RXID_UNKNOWN =
      new CIL_Status( "E_CIL_RXID_UNKNOWN", 13, TTL_Package.E_CIL );

  /**
   * Can't create a CIL destination ID in linked list
   */
  public final static CIL_Status E_CIL_NEW_DEST_FAIL =
      new CIL_Status( "E_CIL_NEW_DEST_FAIL", 14, TTL_Package.E_CIL );

  /**
   * Unable to create a local socket
   */
  public final static CIL_Status E_CIL_SOCKET_FAIL =
      new CIL_Status( "E_CIL_SOCKET_FAIL", 15, TTL_Package.E_CIL );

  /**
   * Misc problem with function argument
   */
  public final static CIL_Status E_CIL_PARAM_ERR =
      new CIL_Status( "E_CIL_PARAM_ERR", 16, TTL_Package.E_CIL );

  /**
   * NULL pointer to a message was passed to a function
   */
  public final static CIL_Status E_CIL_NULL_MSG =
      new CIL_Status( "E_CIL_NULL_MSG", 17, TTL_Package.E_CIL );

  /**
   * NULL pointer to a RxID was passed to a function
   */
  public final static CIL_Status E_CIL_NULL_RXID =
      new CIL_Status( "E_CIL_NULL_RXID", 18, TTL_Package.E_CIL );

  /**
   * NULL pointer to UDP data
   */
  public final static CIL_Status E_CIL_NULL_DATA =
      new CIL_Status( "E_CIL_NULL_DATA", 19, TTL_Package.E_CIL );

  /**
   * Couldn't allocate some dynamic memory
   */
  public final static CIL_Status E_CIL_NO_MEMORY =
      new CIL_Status( "E_CIL_NO_MEMORY", 20, TTL_Package.E_CIL );

  /**
   * No storage space has been left to receive message
   */
  public final static CIL_Status E_CIL_NO_STORAGE =
      new CIL_Status( "E_CIL_NO_STORAGE", 21, TTL_Package.E_CIL );

  /**
   * Incorrectly specified timeout (e.g. negative)
   */
  public final static CIL_Status E_CIL_BAD_TIMEOUT =
      new CIL_Status( "E_CIL_BAD_TIMEOUT", 22, TTL_Package.E_CIL );

  /**
   * The size of a data buffer is specified as negative
   */
  public final static CIL_Status E_CIL_NEG_DATALEN =
      new CIL_Status( "E_CIL_NEG_DATALEN", 23, TTL_Package.E_CIL );

  /**
   * IP
   */
  public final static CIL_Status E_CIL_ADDRINUSE =
      new CIL_Status( "E_CIL_ADDRINUSE", 24, TTL_Package.E_CIL );

  /**
   * The specified IP address is not available for use
   */
  public final static CIL_Status E_CIL_ADDRNOTAVAIL =
      new CIL_Status( "E_CIL_ADDRNOTAVAIL", 25, TTL_Package.E_CIL );

  /**
   * Receive message saturation during a flush
   */
  public final static CIL_Status E_CIL_FLUSH_ERROR =
      new CIL_Status( "E_CIL_FLUSH_ERROR", 26, TTL_Package.E_CIL );

  /**
   * NOT USED
   */
  public final static CIL_Status E_CIL_MAP_DENIED =
      new CIL_Status( "E_CIL_MAP_DENIED", 27, TTL_Package.E_CIL );

  /**
   * NOT USED
   */
  public final static CIL_Status E_CIL_ID_IN_USE =
      new CIL_Status( "E_CIL_ID_IN_USE", 28, TTL_Package.E_CIL );

  /**
   * NOT USED
   */
  public final static CIL_Status E_CIL_NO_DATA =
      new CIL_Status( "E_CIL_NO_DATA", 29, TTL_Package.E_CIL );

  /**
   * NOT USED
   */
  public final static CIL_Status E_CIL_RXID_INVALID =
      new CIL_Status( "E_CIL_RXID_INVALID", 30, TTL_Package.E_CIL );

  /**
   * 
   */
  public final static CIL_Status E_CIL_TXID_UNKNOWN =
      new CIL_Status( "E_CIL_TXID_UNKNOWN", 31, TTL_Package.E_CIL );

  /**
   * Array allowing serialization.
   */
  protected static final CIL_Status[] array =
  {
    E_CIL_GEN_ERR,
    E_CIL_NO_SETUP,
    E_CIL_ALREADY_SETUP,
    E_CIL_MAP_NOT_FOUND,
    E_CIL_NO_MAP_GIVEN,
    E_CIL_MAP_ERROR,
    E_CIL_MAP_TOO_SMALL,
    E_CIL_UNKNOWN_NAME,
    E_CIL_NO_NAME,
    E_CIL_SEND_ERR,
    E_CIL_RECV_ERR,
    E_CIL_TIMEOUT,
    E_CIL_ID_INVALID,
    E_CIL_RXID_UNKNOWN,
    E_CIL_NEW_DEST_FAIL,
    E_CIL_SOCKET_FAIL,
    E_CIL_PARAM_ERR,
    E_CIL_NULL_MSG,
    E_CIL_NULL_RXID,
    E_CIL_NULL_DATA,
    E_CIL_NO_MEMORY,
    E_CIL_NO_STORAGE,
    E_CIL_BAD_TIMEOUT,
    E_CIL_NEG_DATALEN,
    E_CIL_ADDRINUSE,
    E_CIL_ADDRNOTAVAIL,
    E_CIL_FLUSH_ERROR,
    E_CIL_MAP_DENIED,
    E_CIL_ID_IN_USE,
    E_CIL_NO_DATA,
    E_CIL_RXID_INVALID,
    E_CIL_TXID_UNKNOWN
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
   * Return an object reference of the CIL_Status with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the CIL_Status
   * @return a reference to the CIL_Status specified by the argument
   */
  public static CIL_Status getReference( String s )
  {
    return( (CIL_Status)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the CIL_Status with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the CIL_Status
   * @return a reference to the CIL_Status specified by the argument
   */
  public static CIL_Status getReference( int i )
  {
    return( (CIL_Status)( intHash.get( new Integer( i ) ) ) );
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
  private CIL_Status( String s )
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
  private CIL_Status( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this CIL_Status.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this CIL_Status.
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
