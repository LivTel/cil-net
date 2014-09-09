package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type NMC_State.  These are:
 * <ul>
 * <li>E_NMC_STATE_PRECONTROLLING</li>
 * <li>E_NMC_STATE_NODE_STOPPED</li>
 * <li>E_NMC_STATE_RELEASING_BRAKES</li>
 * <li>E_NMC_STATE_NODE_AVAILABLE</li>
 * <li>E_NMC_STATE_NODE_STOPPING</li>
 * <li>E_NMC_STATE_APPLYING_BRAKES</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class NMC_State
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
  private static final TTL_Package ttlPackage = TTL_Package.NMC;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static NMC_State E_NMC_STATE_PRECONTROLLING =
      new NMC_State( "E_NMC_STATE_PRECONTROLLING", 0, TTL_Package.E_NMC );

  /**
   * 
   */
  public final static NMC_State E_NMC_STATE_NODE_STOPPED =
      new NMC_State( "E_NMC_STATE_NODE_STOPPED", 1, TTL_Package.E_NMC );

  /**
   * 
   */
  public final static NMC_State E_NMC_STATE_RELEASING_BRAKES =
      new NMC_State( "E_NMC_STATE_RELEASING_BRAKES", 2, TTL_Package.E_NMC );

  /**
   * 
   */
  public final static NMC_State E_NMC_STATE_NODE_AVAILABLE =
      new NMC_State( "E_NMC_STATE_NODE_AVAILABLE", 3, TTL_Package.E_NMC );

  /**
   * 
   */
  public final static NMC_State E_NMC_STATE_NODE_STOPPING =
      new NMC_State( "E_NMC_STATE_NODE_STOPPING", 4, TTL_Package.E_NMC );

  /**
   * 
   */
  public final static NMC_State E_NMC_STATE_APPLYING_BRAKES =
      new NMC_State( "E_NMC_STATE_APPLYING_BRAKES", 5, TTL_Package.E_NMC );

  /**
   * Array allowing serialization.
   */
  protected static final NMC_State[] array =
  {
    E_NMC_STATE_PRECONTROLLING,
    E_NMC_STATE_NODE_STOPPED,
    E_NMC_STATE_RELEASING_BRAKES,
    E_NMC_STATE_NODE_AVAILABLE,
    E_NMC_STATE_NODE_STOPPING,
    E_NMC_STATE_APPLYING_BRAKES
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
   * Return an object reference of the NMC_State with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the NMC_State
   * @return a reference to the NMC_State specified by the argument
   */
  public static NMC_State getReference( String s )
  {
    return( (NMC_State)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the NMC_State with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the NMC_State
   * @return a reference to the NMC_State specified by the argument
   */
  public static NMC_State getReference( int i )
  {
    return( (NMC_State)( intHash.get( new Integer( i ) ) ) );
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
  private NMC_State( String s )
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
  private NMC_State( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this NMC_State.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this NMC_State.
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
