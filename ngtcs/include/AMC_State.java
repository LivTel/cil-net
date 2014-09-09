package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type AMC_State.  These are:
 * <ul>
 * <li>E_AMC_STATE_DISABLED</li>
 * <li>E_AMC_STATE_APPLYING_PRELOAD</li>
 * <li>E_AMC_STATE_HOMING_HEADS</li>
 * <li>E_AMC_STATE_AXIS_HALTED</li>
 * <li>E_AMC_STATE_MOVING</li>
 * <li>E_AMC_STATE_TRACKING</li>
 * <li>E_AMC_STATE_APPLYING_SINUSOID</li>
 * <li>E_AMC_STATE_HALTING_AXIS</li>
 * <li>E_AMC_STATE_EXIT</li>
 * <li>E_AMC_STATE_HALTING_INSIDE_L1_CW_LIMIT</li>
 * <li>E_AMC_STATE_HALTED_INSIDE_L1_CW_LIMIT</li>
 * <li>E_AMC_STATE_RECOVERING_FROM_L1_CW_LIMIT</li>
 * <li>E_AMC_STATE_HALTING_INSIDE_L1_ACW_LIMIT</li>
 * <li>E_AMC_STATE_HALTED_INSIDE_L1_ACW_LIMIT</li>
 * <li>E_AMC_STATE_RECOVERING_FROM_L1_ACW_LIMIT</li>
 * <li>E_AMC_STATE_MOTION_TESTING</li>
 * <li>E_AMC_STATE_HALTING_WITH_NO_VEN</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class AMC_State
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
  private static final TTL_Package ttlPackage = TTL_Package.AMC;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static AMC_State E_AMC_STATE_DISABLED =
      new AMC_State( "E_AMC_STATE_DISABLED", 0, TTL_Package.E_AMC );

  /**
   * 
   */
  public final static AMC_State E_AMC_STATE_APPLYING_PRELOAD =
      new AMC_State( "E_AMC_STATE_APPLYING_PRELOAD", 1, TTL_Package.E_AMC );

  /**
   * 
   */
  public final static AMC_State E_AMC_STATE_HOMING_HEADS =
      new AMC_State( "E_AMC_STATE_HOMING_HEADS", 2, TTL_Package.E_AMC );

  /**
   * 
   */
  public final static AMC_State E_AMC_STATE_AXIS_HALTED =
      new AMC_State( "E_AMC_STATE_AXIS_HALTED", 3, TTL_Package.E_AMC );

  /**
   * 
   */
  public final static AMC_State E_AMC_STATE_MOVING =
      new AMC_State( "E_AMC_STATE_MOVING", 4, TTL_Package.E_AMC );

  /**
   * 
   */
  public final static AMC_State E_AMC_STATE_TRACKING =
      new AMC_State( "E_AMC_STATE_TRACKING", 5, TTL_Package.E_AMC );

  /**
   * 
   */
  public final static AMC_State E_AMC_STATE_APPLYING_SINUSOID =
      new AMC_State( "E_AMC_STATE_APPLYING_SINUSOID", 6, TTL_Package.E_AMC );

  /**
   * 
   */
  public final static AMC_State E_AMC_STATE_HALTING_AXIS =
      new AMC_State( "E_AMC_STATE_HALTING_AXIS", 7, TTL_Package.E_AMC );

  /**
   * 
   */
  public final static AMC_State E_AMC_STATE_EXIT =
      new AMC_State( "E_AMC_STATE_EXIT", 8, TTL_Package.E_AMC );

  /**
   * 
   */
  public final static AMC_State E_AMC_STATE_HALTING_INSIDE_L1_CW_LIMIT =
      new AMC_State( "E_AMC_STATE_HALTING_INSIDE_L1_CW_LIMIT", 9, TTL_Package.E_AMC );

  /**
   * 
   */
  public final static AMC_State E_AMC_STATE_HALTED_INSIDE_L1_CW_LIMIT =
      new AMC_State( "E_AMC_STATE_HALTED_INSIDE_L1_CW_LIMIT", 10, TTL_Package.E_AMC );

  /**
   * 
   */
  public final static AMC_State E_AMC_STATE_RECOVERING_FROM_L1_CW_LIMIT =
      new AMC_State( "E_AMC_STATE_RECOVERING_FROM_L1_CW_LIMIT", 11, TTL_Package.E_AMC );

  /**
   * 
   */
  public final static AMC_State E_AMC_STATE_HALTING_INSIDE_L1_ACW_LIMIT =
      new AMC_State( "E_AMC_STATE_HALTING_INSIDE_L1_ACW_LIMIT", 12, TTL_Package.E_AMC );

  /**
   * 
   */
  public final static AMC_State E_AMC_STATE_HALTED_INSIDE_L1_ACW_LIMIT =
      new AMC_State( "E_AMC_STATE_HALTED_INSIDE_L1_ACW_LIMIT", 13, TTL_Package.E_AMC );

  /**
   * 
   */
  public final static AMC_State E_AMC_STATE_RECOVERING_FROM_L1_ACW_LIMIT =
      new AMC_State( "E_AMC_STATE_RECOVERING_FROM_L1_ACW_LIMIT", 14, TTL_Package.E_AMC );

  /**
   * 
   */
  public final static AMC_State E_AMC_STATE_MOTION_TESTING =
      new AMC_State( "E_AMC_STATE_MOTION_TESTING", 15, TTL_Package.E_AMC );

  /**
   * 
   */
  public final static AMC_State E_AMC_STATE_HALTING_WITH_NO_VEN =
      new AMC_State( "E_AMC_STATE_HALTING_WITH_NO_VEN", 16, TTL_Package.E_AMC );

  /**
   * Array allowing serialization.
   */
  protected static final AMC_State[] array =
  {
    E_AMC_STATE_DISABLED,
    E_AMC_STATE_APPLYING_PRELOAD,
    E_AMC_STATE_HOMING_HEADS,
    E_AMC_STATE_AXIS_HALTED,
    E_AMC_STATE_MOVING,
    E_AMC_STATE_TRACKING,
    E_AMC_STATE_APPLYING_SINUSOID,
    E_AMC_STATE_HALTING_AXIS,
    E_AMC_STATE_EXIT,
    E_AMC_STATE_HALTING_INSIDE_L1_CW_LIMIT,
    E_AMC_STATE_HALTED_INSIDE_L1_CW_LIMIT,
    E_AMC_STATE_RECOVERING_FROM_L1_CW_LIMIT,
    E_AMC_STATE_HALTING_INSIDE_L1_ACW_LIMIT,
    E_AMC_STATE_HALTED_INSIDE_L1_ACW_LIMIT,
    E_AMC_STATE_RECOVERING_FROM_L1_ACW_LIMIT,
    E_AMC_STATE_MOTION_TESTING,
    E_AMC_STATE_HALTING_WITH_NO_VEN
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
   * Return an object reference of the AMC_State with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the AMC_State
   * @return a reference to the AMC_State specified by the argument
   */
  public static AMC_State getReference( String s )
  {
    return( (AMC_State)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the AMC_State with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the AMC_State
   * @return a reference to the AMC_State specified by the argument
   */
  public static AMC_State getReference( int i )
  {
    return( (AMC_State)( intHash.get( new Integer( i ) ) ) );
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
  private AMC_State( String s )
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
  private AMC_State( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this AMC_State.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this AMC_State.
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
