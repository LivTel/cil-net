package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type ACM_State.  These are:
 * <ul>
 * <li>E_ACM_STATE_DISABLED</li>
 * <li>E_ACM_STATE_READY</li>
 * <li>E_ACM_STATE_ENABLED</li>
 * <li>E_ACM_STATE_HOMING</li>
 * <li>E_ACM_STATE_MOVING_REL</li>
 * <li>E_ACM_STATE_MOVING_ABS</li>
 * <li>E_ACM_STATE_ERROR</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class ACM_State
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
  private static final TTL_Package ttlPackage = TTL_Package.ACM;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static ACM_State E_ACM_STATE_DISABLED =
      new ACM_State( "E_ACM_STATE_DISABLED", 0, TTL_Package.E_ACM );

  /**
   * 
   */
  public final static ACM_State E_ACM_STATE_READY =
      new ACM_State( "E_ACM_STATE_READY", 1, TTL_Package.E_ACM );

  /**
   * 
   */
  public final static ACM_State E_ACM_STATE_ENABLED =
      new ACM_State( "E_ACM_STATE_ENABLED", 2, TTL_Package.E_ACM );

  /**
   * 
   */
  public final static ACM_State E_ACM_STATE_HOMING =
      new ACM_State( "E_ACM_STATE_HOMING", 3, TTL_Package.E_ACM );

  /**
   * 
   */
  public final static ACM_State E_ACM_STATE_MOVING_REL =
      new ACM_State( "E_ACM_STATE_MOVING_REL", 4, TTL_Package.E_ACM );

  /**
   * 
   */
  public final static ACM_State E_ACM_STATE_MOVING_ABS =
      new ACM_State( "E_ACM_STATE_MOVING_ABS", 5, TTL_Package.E_ACM );

  /**
   * 
   */
  public final static ACM_State E_ACM_STATE_ERROR =
      new ACM_State( "E_ACM_STATE_ERROR", 6, TTL_Package.E_ACM );

  /**
   * Array allowing serialization.
   */
  protected static final ACM_State[] array =
  {
    E_ACM_STATE_DISABLED,
    E_ACM_STATE_READY,
    E_ACM_STATE_ENABLED,
    E_ACM_STATE_HOMING,
    E_ACM_STATE_MOVING_REL,
    E_ACM_STATE_MOVING_ABS,
    E_ACM_STATE_ERROR
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
   * Return an object reference of the ACM_State with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the ACM_State
   * @return a reference to the ACM_State specified by the argument
   */
  public static ACM_State getReference( String s )
  {
    return( (ACM_State)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the ACM_State with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the ACM_State
   * @return a reference to the ACM_State specified by the argument
   */
  public static ACM_State getReference( int i )
  {
    return( (ACM_State)( intHash.get( new Integer( i ) ) ) );
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
  private ACM_State( String s )
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
  private ACM_State( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this ACM_State.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this ACM_State.
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
