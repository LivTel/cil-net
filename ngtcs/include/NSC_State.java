package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type NSC_State.  These are:
 * <ul>
 * <li>E_NSC_TOP_STATE_PRECONTROLLING</li>
 * <li>E_NSC_TOP_STATE_CONFIGURING_NODE</li>
 * <li>E_NSC_TOP_STATE_DISABLED</li>
 * <li>E_NSC_TOP_STATE_ENABLED</li>
 * <li>E_NSC_TOP_STATE_RUNNING_NODE</li>
 * <li>E_NSC_TOP_STATE_INTERLOCKED</li>
 * <li>E_NSC_TOP_STATE_FAILED</li>
 * <li>E_NSC_TOP_STATE_SAFE</li>
 * <li>E_NSC_TOP_STATE_EXIT</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class NSC_State
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
  private static final TTL_Package ttlPackage = TTL_Package.NSC;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static NSC_State E_NSC_TOP_STATE_PRECONTROLLING =
      new NSC_State( "E_NSC_TOP_STATE_PRECONTROLLING", 0, TTL_Package.E_NSC );

  /**
   * 
   */
  public final static NSC_State E_NSC_TOP_STATE_CONFIGURING_NODE =
      new NSC_State( "E_NSC_TOP_STATE_CONFIGURING_NODE", 1, TTL_Package.E_NSC );

  /**
   * 
   */
  public final static NSC_State E_NSC_TOP_STATE_DISABLED =
      new NSC_State( "E_NSC_TOP_STATE_DISABLED", 2, TTL_Package.E_NSC );

  /**
   * 
   */
  public final static NSC_State E_NSC_TOP_STATE_ENABLED =
      new NSC_State( "E_NSC_TOP_STATE_ENABLED", 3, TTL_Package.E_NSC );

  /**
   * 
   */
  public final static NSC_State E_NSC_TOP_STATE_RUNNING_NODE =
      new NSC_State( "E_NSC_TOP_STATE_RUNNING_NODE", 4, TTL_Package.E_NSC );

  /**
   * 
   */
  public final static NSC_State E_NSC_TOP_STATE_INTERLOCKED =
      new NSC_State( "E_NSC_TOP_STATE_INTERLOCKED", 5, TTL_Package.E_NSC );

  /**
   * 
   */
  public final static NSC_State E_NSC_TOP_STATE_FAILED =
      new NSC_State( "E_NSC_TOP_STATE_FAILED", 6, TTL_Package.E_NSC );

  /**
   * 
   */
  public final static NSC_State E_NSC_TOP_STATE_SAFE =
      new NSC_State( "E_NSC_TOP_STATE_SAFE", 7, TTL_Package.E_NSC );

  /**
   * 
   */
  public final static NSC_State E_NSC_TOP_STATE_EXIT =
      new NSC_State( "E_NSC_TOP_STATE_EXIT", 8, TTL_Package.E_NSC );

  /**
   * Array allowing serialization.
   */
  protected static final NSC_State[] array =
  {
    E_NSC_TOP_STATE_PRECONTROLLING,
    E_NSC_TOP_STATE_CONFIGURING_NODE,
    E_NSC_TOP_STATE_DISABLED,
    E_NSC_TOP_STATE_ENABLED,
    E_NSC_TOP_STATE_RUNNING_NODE,
    E_NSC_TOP_STATE_INTERLOCKED,
    E_NSC_TOP_STATE_FAILED,
    E_NSC_TOP_STATE_SAFE,
    E_NSC_TOP_STATE_EXIT
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
   * Return an object reference of the NSC_State with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the NSC_State
   * @return a reference to the NSC_State specified by the argument
   */
  public static NSC_State getReference( String s )
  {
    return( (NSC_State)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the NSC_State with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the NSC_State
   * @return a reference to the NSC_State specified by the argument
   */
  public static NSC_State getReference( int i )
  {
    return( (NSC_State)( intHash.get( new Integer( i ) ) ) );
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
  private NSC_State( String s )
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
  private NSC_State( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this NSC_State.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this NSC_State.
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
