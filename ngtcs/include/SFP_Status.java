package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type SFP_Status.  These are:
 * <ul>
 * <li>E_SFP_GEN_ERROR</li>
 * <li>E_SFP_INIT_FAIL</li>
 * <li>E_SFP_SHUTDOWN_ERROR</li>
 * <li>E_SFP_TIMER_SETUP_ERR</li>
 * <li>E_SFP_TIMER_CLOSE_ERR</li>
 * <li>E_SFP_INVALID_STATE</li>
 * <li>E_SFP_SERVER_NOT_FOUND</li>
 * <li>E_SFP_SEND_FAIL</li>
 * <li>E_SFP_INVALID_COMMAND</li>
 * <li>E_SFP_OID_CONFIG_ERR</li>
 * <li>E_SFP_RECEIVE_ERR</li>
 * <li>E_SFP_HOME_ERR</li>
 * <li>E_SFP_MOVE_ERR</li>
 * <li>E_SFP_STOPPED</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class SFP_Status
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
  private static final TTL_Package ttlPackage = TTL_Package.SFP;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static SFP_Status E_SFP_GEN_ERROR =
      new SFP_Status( "E_SFP_GEN_ERROR", 0, TTL_Package.E_SFP );

  /**
   * 
   */
  public final static SFP_Status E_SFP_INIT_FAIL =
      new SFP_Status( "E_SFP_INIT_FAIL", 1, TTL_Package.E_SFP );

  /**
   * 
   */
  public final static SFP_Status E_SFP_SHUTDOWN_ERROR =
      new SFP_Status( "E_SFP_SHUTDOWN_ERROR", 2, TTL_Package.E_SFP );

  /**
   * 
   */
  public final static SFP_Status E_SFP_TIMER_SETUP_ERR =
      new SFP_Status( "E_SFP_TIMER_SETUP_ERR", 3, TTL_Package.E_SFP );

  /**
   * 
   */
  public final static SFP_Status E_SFP_TIMER_CLOSE_ERR =
      new SFP_Status( "E_SFP_TIMER_CLOSE_ERR", 4, TTL_Package.E_SFP );

  /**
   * 
   */
  public final static SFP_Status E_SFP_INVALID_STATE =
      new SFP_Status( "E_SFP_INVALID_STATE", 5, TTL_Package.E_SFP );

  /**
   * 
   */
  public final static SFP_Status E_SFP_SERVER_NOT_FOUND =
      new SFP_Status( "E_SFP_SERVER_NOT_FOUND", 6, TTL_Package.E_SFP );

  /**
   * 
   */
  public final static SFP_Status E_SFP_SEND_FAIL =
      new SFP_Status( "E_SFP_SEND_FAIL", 7, TTL_Package.E_SFP );

  /**
   * 
   */
  public final static SFP_Status E_SFP_INVALID_COMMAND =
      new SFP_Status( "E_SFP_INVALID_COMMAND", 8, TTL_Package.E_SFP );

  /**
   * 
   */
  public final static SFP_Status E_SFP_OID_CONFIG_ERR =
      new SFP_Status( "E_SFP_OID_CONFIG_ERR", 9, TTL_Package.E_SFP );

  /**
   * 
   */
  public final static SFP_Status E_SFP_RECEIVE_ERR =
      new SFP_Status( "E_SFP_RECEIVE_ERR", 10, TTL_Package.E_SFP );

  /**
   * 
   */
  public final static SFP_Status E_SFP_HOME_ERR =
      new SFP_Status( "E_SFP_HOME_ERR", 11, TTL_Package.E_SFP );

  /**
   * 
   */
  public final static SFP_Status E_SFP_MOVE_ERR =
      new SFP_Status( "E_SFP_MOVE_ERR", 12, TTL_Package.E_SFP );

  /**
   * 
   */
  public final static SFP_Status E_SFP_STOPPED =
      new SFP_Status( "E_SFP_STOPPED", 13, TTL_Package.E_SFP );

  /**
   * Array allowing serialization.
   */
  protected static final SFP_Status[] array =
  {
    E_SFP_GEN_ERROR,
    E_SFP_INIT_FAIL,
    E_SFP_SHUTDOWN_ERROR,
    E_SFP_TIMER_SETUP_ERR,
    E_SFP_TIMER_CLOSE_ERR,
    E_SFP_INVALID_STATE,
    E_SFP_SERVER_NOT_FOUND,
    E_SFP_SEND_FAIL,
    E_SFP_INVALID_COMMAND,
    E_SFP_OID_CONFIG_ERR,
    E_SFP_RECEIVE_ERR,
    E_SFP_HOME_ERR,
    E_SFP_MOVE_ERR,
    E_SFP_STOPPED
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
   * Return an object reference of the SFP_Status with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the SFP_Status
   * @return a reference to the SFP_Status specified by the argument
   */
  public static SFP_Status getReference( String s )
  {
    return( (SFP_Status)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the SFP_Status with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the SFP_Status
   * @return a reference to the SFP_Status specified by the argument
   */
  public static SFP_Status getReference( int i )
  {
    return( (SFP_Status)( intHash.get( new Integer( i ) ) ) );
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
  private SFP_Status( String s )
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
  private SFP_Status( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this SFP_Status.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this SFP_Status.
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
