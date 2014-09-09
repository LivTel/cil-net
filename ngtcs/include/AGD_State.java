package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type AGD_State.  These are:
 * <ul>
 * <li>E_AGD_STATE_DISABLED</li>
 * <li>E_AGD_STATE_ENABLED</li>
 * <li>E_AGD_STATE_HOMING</li>
 * <li>E_AGD_STATE_READY</li>
 * <li>E_AGD_STATE_MOVING</li>
 * <li>E_AGD_STATE_ERROR</li>
 * <li>E_AGD_STATE_OK</li>
 * <li>E_AGD_STATE_FAIL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class AGD_State
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
  private static final TTL_Package ttlPackage = TTL_Package.AGD;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static AGD_State E_AGD_STATE_DISABLED =
      new AGD_State( "E_AGD_STATE_DISABLED", 0, TTL_Package.E_AGD );

  /**
   * 
   */
  public final static AGD_State E_AGD_STATE_ENABLED =
      new AGD_State( "E_AGD_STATE_ENABLED", 1, TTL_Package.E_AGD );

  /**
   * 
   */
  public final static AGD_State E_AGD_STATE_HOMING =
      new AGD_State( "E_AGD_STATE_HOMING", 2, TTL_Package.E_AGD );

  /**
   * 
   */
  public final static AGD_State E_AGD_STATE_READY =
      new AGD_State( "E_AGD_STATE_READY", 3, TTL_Package.E_AGD );

  /**
   * 
   */
  public final static AGD_State E_AGD_STATE_MOVING =
      new AGD_State( "E_AGD_STATE_MOVING", 4, TTL_Package.E_AGD );

  /**
   * 
   */
  public final static AGD_State E_AGD_STATE_ERROR =
      new AGD_State( "E_AGD_STATE_ERROR", 5, TTL_Package.E_AGD );

  /**
   * 
   */
  public final static AGD_State E_AGD_STATE_OK =
      new AGD_State( "E_AGD_STATE_OK", 6, TTL_Package.E_AGD );

  /**
   * 
   */
  public final static AGD_State E_AGD_STATE_FAIL =
      new AGD_State( "E_AGD_STATE_FAIL", 7, TTL_Package.E_AGD );

  /**
   * Array allowing serialization.
   */
  protected static final AGD_State[] array =
  {
    E_AGD_STATE_DISABLED,
    E_AGD_STATE_ENABLED,
    E_AGD_STATE_HOMING,
    E_AGD_STATE_READY,
    E_AGD_STATE_MOVING,
    E_AGD_STATE_ERROR,
    E_AGD_STATE_OK,
    E_AGD_STATE_FAIL
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
   * Return an object reference of the AGD_State with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the AGD_State
   * @return a reference to the AGD_State specified by the argument
   */
  public static AGD_State getReference( String s )
  {
    return( (AGD_State)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the AGD_State with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the AGD_State
   * @return a reference to the AGD_State specified by the argument
   */
  public static AGD_State getReference( int i )
  {
    return( (AGD_State)( intHash.get( new Integer( i ) ) ) );
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
  private AGD_State( String s )
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
  private AGD_State( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this AGD_State.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this AGD_State.
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
