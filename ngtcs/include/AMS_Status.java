package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type AMS_Status.  These are:
 * <ul>
 * <li>E_AMS_GEN_ERROR</li>
 * <li>E_AMS_INIT_FAIL</li>
 * <li>E_AMS_SHUTDOWN_ERROR</li>
 * <li>E_AMS_TIMER_SETUP_ERR</li>
 * <li>E_AMS_TIMER_CLOSE_ERR</li>
 * <li>E_AMS_INVALID_STATE</li>
 * <li>E_AMS_SERVER_NOT_FOUND</li>
 * <li>E_AMS_SEND_FAIL</li>
 * <li>E_AMS_INVALID_COMMAND</li>
 * <li>E_AMS_ENDCLIENT_SPAWN_FAIL</li>
 * <li>E_AMS_ENDCLIENT_NOT_FOUND</li>
 * <li>E_AMS_RECEIVE_ERR</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class AMS_Status
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
  private static final TTL_Package ttlPackage = TTL_Package.AMS;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static AMS_Status E_AMS_GEN_ERROR =
      new AMS_Status( "E_AMS_GEN_ERROR", 0, TTL_Package.E_AMS );

  /**
   * 
   */
  public final static AMS_Status E_AMS_INIT_FAIL =
      new AMS_Status( "E_AMS_INIT_FAIL", 1, TTL_Package.E_AMS );

  /**
   * 
   */
  public final static AMS_Status E_AMS_SHUTDOWN_ERROR =
      new AMS_Status( "E_AMS_SHUTDOWN_ERROR", 2, TTL_Package.E_AMS );

  /**
   * 
   */
  public final static AMS_Status E_AMS_TIMER_SETUP_ERR =
      new AMS_Status( "E_AMS_TIMER_SETUP_ERR", 3, TTL_Package.E_AMS );

  /**
   * 
   */
  public final static AMS_Status E_AMS_TIMER_CLOSE_ERR =
      new AMS_Status( "E_AMS_TIMER_CLOSE_ERR", 4, TTL_Package.E_AMS );

  /**
   * 
   */
  public final static AMS_Status E_AMS_INVALID_STATE =
      new AMS_Status( "E_AMS_INVALID_STATE", 5, TTL_Package.E_AMS );

  /**
   * 
   */
  public final static AMS_Status E_AMS_SERVER_NOT_FOUND =
      new AMS_Status( "E_AMS_SERVER_NOT_FOUND", 6, TTL_Package.E_AMS );

  /**
   * 
   */
  public final static AMS_Status E_AMS_SEND_FAIL =
      new AMS_Status( "E_AMS_SEND_FAIL", 7, TTL_Package.E_AMS );

  /**
   * 
   */
  public final static AMS_Status E_AMS_INVALID_COMMAND =
      new AMS_Status( "E_AMS_INVALID_COMMAND", 8, TTL_Package.E_AMS );

  /**
   * 
   */
  public final static AMS_Status E_AMS_ENDCLIENT_SPAWN_FAIL =
      new AMS_Status( "E_AMS_ENDCLIENT_SPAWN_FAIL", 9, TTL_Package.E_AMS );

  /**
   * 
   */
  public final static AMS_Status E_AMS_ENDCLIENT_NOT_FOUND =
      new AMS_Status( "E_AMS_ENDCLIENT_NOT_FOUND", 10, TTL_Package.E_AMS );

  /**
   * 
   */
  public final static AMS_Status E_AMS_RECEIVE_ERR =
      new AMS_Status( "E_AMS_RECEIVE_ERR", 11, TTL_Package.E_AMS );

  /**
   * Array allowing serialization.
   */
  protected static final AMS_Status[] array =
  {
    E_AMS_GEN_ERROR,
    E_AMS_INIT_FAIL,
    E_AMS_SHUTDOWN_ERROR,
    E_AMS_TIMER_SETUP_ERR,
    E_AMS_TIMER_CLOSE_ERR,
    E_AMS_INVALID_STATE,
    E_AMS_SERVER_NOT_FOUND,
    E_AMS_SEND_FAIL,
    E_AMS_INVALID_COMMAND,
    E_AMS_ENDCLIENT_SPAWN_FAIL,
    E_AMS_ENDCLIENT_NOT_FOUND,
    E_AMS_RECEIVE_ERR
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
   * Return an object reference of the AMS_Status with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the AMS_Status
   * @return a reference to the AMS_Status specified by the argument
   */
  public static AMS_Status getReference( String s )
  {
    return( (AMS_Status)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the AMS_Status with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the AMS_Status
   * @return a reference to the AMS_Status specified by the argument
   */
  public static AMS_Status getReference( int i )
  {
    return( (AMS_Status)( intHash.get( new Integer( i ) ) ) );
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
  private AMS_Status( String s )
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
  private AMS_Status( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this AMS_Status.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this AMS_Status.
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
