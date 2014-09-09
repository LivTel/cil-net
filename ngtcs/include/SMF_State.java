package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type SMF_State.  These are:
 * <ul>
 * <li>E_SMF_STATE_DISABLED</li>
 * <li>E_SMF_STATE_ENABLED</li>
 * <li>E_SMF_STATE_HOMING</li>
 * <li>E_SMF_STATE_READY</li>
 * <li>E_SMF_STATE_MOVING</li>
 * <li>E_SMF_STATE_ERROR</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class SMF_State
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
  private static final TTL_Package ttlPackage = TTL_Package.SMF;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static SMF_State E_SMF_STATE_DISABLED =
      new SMF_State( "E_SMF_STATE_DISABLED", 0, TTL_Package.E_SMF );

  /**
   * 
   */
  public final static SMF_State E_SMF_STATE_ENABLED =
      new SMF_State( "E_SMF_STATE_ENABLED", 1, TTL_Package.E_SMF );

  /**
   * 
   */
  public final static SMF_State E_SMF_STATE_HOMING =
      new SMF_State( "E_SMF_STATE_HOMING", 2, TTL_Package.E_SMF );

  /**
   * 
   */
  public final static SMF_State E_SMF_STATE_READY =
      new SMF_State( "E_SMF_STATE_READY", 3, TTL_Package.E_SMF );

  /**
   * 
   */
  public final static SMF_State E_SMF_STATE_MOVING =
      new SMF_State( "E_SMF_STATE_MOVING", 4, TTL_Package.E_SMF );

  /**
   * 
   */
  public final static SMF_State E_SMF_STATE_ERROR =
      new SMF_State( "E_SMF_STATE_ERROR", 5, TTL_Package.E_SMF );

  /**
   * Array allowing serialization.
   */
  protected static final SMF_State[] array =
  {
    E_SMF_STATE_DISABLED,
    E_SMF_STATE_ENABLED,
    E_SMF_STATE_HOMING,
    E_SMF_STATE_READY,
    E_SMF_STATE_MOVING,
    E_SMF_STATE_ERROR
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
   * Return an object reference of the SMF_State with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the SMF_State
   * @return a reference to the SMF_State specified by the argument
   */
  public static SMF_State getReference( String s )
  {
    return( (SMF_State)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the SMF_State with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the SMF_State
   * @return a reference to the SMF_State specified by the argument
   */
  public static SMF_State getReference( int i )
  {
    return( (SMF_State)( intHash.get( new Integer( i ) ) ) );
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
  private SMF_State( String s )
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
  private SMF_State( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this SMF_State.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this SMF_State.
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
