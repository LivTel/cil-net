package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type OID_DataType.  These are:
 * <ul>
 * <li>D_OID_DATAID_BOL</li>
 * <li>D_OID_PROC_STATE</li>
 * <li>D_OID_VERSION</li>
 * <li>D_OID_SERVER_SHUTDOWN</li>
 * <li>D_OID_ERR_AGENT_GET_VALUE</li>
 * <li>D_OID_ERR_AGENT_SET_VALUE</li>
 * <li>D_OID_ERR_AGENT_GET_ATTRIB</li>
 * <li>D_OID_ERR_AGENT_SET_ATTRIB</li>
 * <li>D_OID_ERR_AGENT_HEARTBEAT</li>
 * <li>D_OID_ERR_AGENT_TRACK</li>
 * <li>D_OID_ERR_AGENT_POLLSAFE</li>
 * <li>D_OID_ERR_AGENT_POLLACTIVE</li>
 * <li>D_OID_DATAID_EOL</li>
 * <li>D_OID_DATAID_MAX_VALUE</li>
 * <li>Define</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class OID_DataType
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
  public final static OID_DataType D_OID_DATAID_BOL =
      new OID_DataType( "D_OID_DATAID_BOL", 0, TTL_Package.D_OID );

  /**
   * The node comms in process state.
   */
  public final static OID_DataType D_OID_PROC_STATE =
      new OID_DataType( "D_OID_PROC_STATE", 1, TTL_Package.D_OID );

  /**
   * Version number
   */
  public final static OID_DataType D_OID_VERSION =
      new OID_DataType( "D_OID_VERSION", 2, TTL_Package.D_OID );

  /**
   * Server shutdown command flag.
   */
  public final static OID_DataType D_OID_SERVER_SHUTDOWN =
      new OID_DataType( "D_OID_SERVER_SHUTDOWN", 3, TTL_Package.D_OID );

  /**
   * Errors allocating get value agent
   */
  public final static OID_DataType D_OID_ERR_AGENT_GET_VALUE =
      new OID_DataType( "D_OID_ERR_AGENT_GET_VALUE", 4, TTL_Package.D_OID );

  /**
   * Errors allocating set value agent
   */
  public final static OID_DataType D_OID_ERR_AGENT_SET_VALUE =
      new OID_DataType( "D_OID_ERR_AGENT_SET_VALUE", 5, TTL_Package.D_OID );

  /**
   * Errors allocating get attrib agent
   */
  public final static OID_DataType D_OID_ERR_AGENT_GET_ATTRIB =
      new OID_DataType( "D_OID_ERR_AGENT_GET_ATTRIB", 6, TTL_Package.D_OID );

  /**
   * Errors allocating set attrib agent
   */
  public final static OID_DataType D_OID_ERR_AGENT_SET_ATTRIB =
      new OID_DataType( "D_OID_ERR_AGENT_SET_ATTRIB", 7, TTL_Package.D_OID );

  /**
   * Errors allocating heartbeat agent
   */
  public final static OID_DataType D_OID_ERR_AGENT_HEARTBEAT =
      new OID_DataType( "D_OID_ERR_AGENT_HEARTBEAT", 8, TTL_Package.D_OID );

  /**
   * Errors allocating track agent
   */
  public final static OID_DataType D_OID_ERR_AGENT_TRACK =
      new OID_DataType( "D_OID_ERR_AGENT_TRACK", 9, TTL_Package.D_OID );

  /**
   * Errors allocating pollsafe agent
   */
  public final static OID_DataType D_OID_ERR_AGENT_POLLSAFE =
      new OID_DataType( "D_OID_ERR_AGENT_POLLSAFE", 10, TTL_Package.D_OID );

  /**
   * Errors allocating pollactive agent
   */
  public final static OID_DataType D_OID_ERR_AGENT_POLLACTIVE =
      new OID_DataType( "D_OID_ERR_AGENT_POLLACTIVE", 11, TTL_Package.D_OID );

  /**
   * End of list marker.
   */
  public final static OID_DataType D_OID_DATAID_EOL =
      new OID_DataType( "D_OID_DATAID_EOL", 12, TTL_Package.D_OID );

  /**
   * Req'd to force size to 4 bytes
   */
  public final static OID_DataType D_OID_DATAID_MAX_VALUE =
      new OID_DataType( "D_OID_DATAID_MAX_VALUE", 13, TTL_Package.D_OID );

  /**
   * 
   */
  public final static OID_DataType Define =
      new OID_DataType( "Define", 14, TTL_Package.D_OID );

  /**
   * Array allowing serialization.
   */
  protected static final OID_DataType[] array =
  {
    D_OID_DATAID_BOL,
    D_OID_PROC_STATE,
    D_OID_VERSION,
    D_OID_SERVER_SHUTDOWN,
    D_OID_ERR_AGENT_GET_VALUE,
    D_OID_ERR_AGENT_SET_VALUE,
    D_OID_ERR_AGENT_GET_ATTRIB,
    D_OID_ERR_AGENT_SET_ATTRIB,
    D_OID_ERR_AGENT_HEARTBEAT,
    D_OID_ERR_AGENT_TRACK,
    D_OID_ERR_AGENT_POLLSAFE,
    D_OID_ERR_AGENT_POLLACTIVE,
    D_OID_DATAID_EOL,
    D_OID_DATAID_MAX_VALUE,
    Define
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
   * Return an object reference of the OID_DataType with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the OID_DataType
   * @return a reference to the OID_DataType specified by the argument
   */
  public static OID_DataType getReference( String s )
  {
    return( (OID_DataType)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the OID_DataType with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the OID_DataType
   * @return a reference to the OID_DataType specified by the argument
   */
  public static OID_DataType getReference( int i )
  {
    return( (OID_DataType)( intHash.get( new Integer( i ) ) ) );
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
  private OID_DataType( String s )
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
  private OID_DataType( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this OID_DataType.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this OID_DataType.
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
