package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type OID_Status.  These are:
 * <ul>
 * <li>E_OID_GEN_ERR</li>
 * <li>E_OID_UNKNOWN_AGENT_TYPE</li>
 * <li>E_OID_UNKNOWN_AGENT_MSGTYPE</li>
 * <li>E_OID_ENDCLIENT_NAME_NOT_FOUND</li>
 * <li>E_OID_SPECIFIED_AGENT_NOT_ALIVE</li>
 * <li>E_OID_SUBPROCESS_NOT_STARTED</li>
 * <li>E_OID_SUBPROCESS_STARTED_OK</li>
 * <li>E_OID_NODE_UNRESOLVED</li>
 * <li>E_OID_CONFIG_FILE_MISSING</li>
 * <li>E_OID_CONFIG_FILE_FORMAT</li>
 * <li>E_OID_EOSTATUS_LIST</li>
 * <li>E_OID_STATUS_MAX_VALUE</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class OID_Status
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
  private static final TTL_Package ttlPackage = TTL_Package.OID;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static OID_Status E_OID_GEN_ERR =
      new OID_Status( "E_OID_GEN_ERR", 0, TTL_Package.E_OID );

  /**
   * Unknown Agent
   */
  public final static OID_Status E_OID_UNKNOWN_AGENT_TYPE =
      new OID_Status( "E_OID_UNKNOWN_AGENT_TYPE", 1, TTL_Package.E_OID );

  /**
   * Unknown message from agent
   */
  public final static OID_Status E_OID_UNKNOWN_AGENT_MSGTYPE =
      new OID_Status( "E_OID_UNKNOWN_AGENT_MSGTYPE", 2, TTL_Package.E_OID );

  /**
   * 
   */
  public final static OID_Status E_OID_ENDCLIENT_NAME_NOT_FOUND =
      new OID_Status( "E_OID_ENDCLIENT_NAME_NOT_FOUND", 3, TTL_Package.E_OID );

  /**
   * Specified agent is not executing
   */
  public final static OID_Status E_OID_SPECIFIED_AGENT_NOT_ALIVE =
      new OID_Status( "E_OID_SPECIFIED_AGENT_NOT_ALIVE", 4, TTL_Package.E_OID );

  /**
   * 
   */
  public final static OID_Status E_OID_SUBPROCESS_NOT_STARTED =
      new OID_Status( "E_OID_SUBPROCESS_NOT_STARTED", 5, TTL_Package.E_OID );

  /**
   * 
   */
  public final static OID_Status E_OID_SUBPROCESS_STARTED_OK =
      new OID_Status( "E_OID_SUBPROCESS_STARTED_OK", 6, TTL_Package.E_OID );

  /**
   * Unable to determine which node
   */
  public final static OID_Status E_OID_NODE_UNRESOLVED =
      new OID_Status( "E_OID_NODE_UNRESOLVED", 7, TTL_Package.E_OID );

  /**
   * Unable to open configuration file
   */
  public final static OID_Status E_OID_CONFIG_FILE_MISSING =
      new OID_Status( "E_OID_CONFIG_FILE_MISSING", 8, TTL_Package.E_OID );

  /**
   * Error in format of config file
   */
  public final static OID_Status E_OID_CONFIG_FILE_FORMAT =
      new OID_Status( "E_OID_CONFIG_FILE_FORMAT", 9, TTL_Package.E_OID );

  /**
   * End of list marker (DO NOT USE FOR STATUS)
   */
  public final static OID_Status E_OID_EOSTATUS_LIST =
      new OID_Status( "E_OID_EOSTATUS_LIST", 10, TTL_Package.E_OID );

  /**
   * Req'd to force size to 4 bytes
   */
  public final static OID_Status E_OID_STATUS_MAX_VALUE =
      new OID_Status( "E_OID_STATUS_MAX_VALUE", 11, TTL_Package.E_OID );

  /**
   * Array allowing serialization.
   */
  protected static final OID_Status[] array =
  {
    E_OID_GEN_ERR,
    E_OID_UNKNOWN_AGENT_TYPE,
    E_OID_UNKNOWN_AGENT_MSGTYPE,
    E_OID_ENDCLIENT_NAME_NOT_FOUND,
    E_OID_SPECIFIED_AGENT_NOT_ALIVE,
    E_OID_SUBPROCESS_NOT_STARTED,
    E_OID_SUBPROCESS_STARTED_OK,
    E_OID_NODE_UNRESOLVED,
    E_OID_CONFIG_FILE_MISSING,
    E_OID_CONFIG_FILE_FORMAT,
    E_OID_EOSTATUS_LIST,
    E_OID_STATUS_MAX_VALUE
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
   * Return an object reference of the OID_Status with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the OID_Status
   * @return a reference to the OID_Status specified by the argument
   */
  public static OID_Status getReference( String s )
  {
    return( (OID_Status)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the OID_Status with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the OID_Status
   * @return a reference to the OID_Status specified by the argument
   */
  public static OID_Status getReference( int i )
  {
    return( (OID_Status)( intHash.get( new Integer( i ) ) ) );
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
  private OID_Status( String s )
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
  private OID_Status( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this OID_Status.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this OID_Status.
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
