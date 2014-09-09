package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type MCP_State.  These are:
 * <ul>
 * <li>E_MCP_AUTH_BOL</li>
 * <li>E_MCP_AUTH_NONE</li>
 * <li>E_MCP_AUTH_REQUEST</li>
 * <li>E_MCP_AUTH_GRANTED</li>
 * <li>E_MCP_AUTH_REFUSED</li>
 * <li>E_MCP_AUTH_SYSREQ_ONLY</li>
 * <li>E_MCP_AUTH_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class MCP_State
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
  private static final TTL_Package ttlPackage = TTL_Package.MCP;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * Beginning of list
   */
  public final static MCP_State E_MCP_AUTH_BOL =
      new MCP_State( "E_MCP_AUTH_BOL", 0, TTL_Package.E_MCP );

  /**
   * Authorisation is not requested
   */
  public final static MCP_State E_MCP_AUTH_NONE =
      new MCP_State( "E_MCP_AUTH_NONE", 1, TTL_Package.E_MCP );

  /**
   * Application requests authorisation
   */
  public final static MCP_State E_MCP_AUTH_REQUEST =
      new MCP_State( "E_MCP_AUTH_REQUEST", 2, TTL_Package.E_MCP );

  /**
   * Application granted authorisation
   */
  public final static MCP_State E_MCP_AUTH_GRANTED =
      new MCP_State( "E_MCP_AUTH_GRANTED", 3, TTL_Package.E_MCP );

  /**
   * Application refused authorisation
   */
  public final static MCP_State E_MCP_AUTH_REFUSED =
      new MCP_State( "E_MCP_AUTH_REFUSED", 4, TTL_Package.E_MCP );

  /**
   * Application can make system requests only
   */
  public final static MCP_State E_MCP_AUTH_SYSREQ_ONLY =
      new MCP_State( "E_MCP_AUTH_SYSREQ_ONLY", 5, TTL_Package.E_MCP );

  /**
   * 
   */
  public final static MCP_State E_MCP_AUTH_EOL =
      new MCP_State( "E_MCP_AUTH_EOL", 6, TTL_Package.E_MCP );

  /**
   * Array allowing serialization.
   */
  protected static final MCP_State[] array =
  {
    E_MCP_AUTH_BOL,
    E_MCP_AUTH_NONE,
    E_MCP_AUTH_REQUEST,
    E_MCP_AUTH_GRANTED,
    E_MCP_AUTH_REFUSED,
    E_MCP_AUTH_SYSREQ_ONLY,
    E_MCP_AUTH_EOL
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
   * Return an object reference of the MCP_State with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the MCP_State
   * @return a reference to the MCP_State specified by the argument
   */
  public static MCP_State getReference( String s )
  {
    return( (MCP_State)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the MCP_State with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the MCP_State
   * @return a reference to the MCP_State specified by the argument
   */
  public static MCP_State getReference( int i )
  {
    return( (MCP_State)( intHash.get( new Integer( i ) ) ) );
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
  private MCP_State( String s )
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
  private MCP_State( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this MCP_State.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this MCP_State.
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
