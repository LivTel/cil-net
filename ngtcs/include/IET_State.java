package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type IET_State.  These are:
 * <ul>
 * <li>E_IET_ANALOGUE_STATE</li>
 * <li>E_IET_INVALID_STATE</li>
 * <li>E_IET_UNKNOWN_STATE</li>
 * <li>E_IET_FAULT_STATE</li>
 * <li>E_IET_OPENING_STATE</li>
 * <li>E_IET_CLOSING_STATE</li>
 * <li>E_IET_MOVING_STATE</li>
 * <li>E_IET_STOPPED_STATE</li>
 * <li>E_IET_HALTED_STATE</li>
 * <li>E_IET_OPEN_STATE</li>
 * <li>E_IET_CLOSED_STATE</li>
 * <li>E_IET_STATE_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class IET_State
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
  private static final TTL_Package ttlPackage = TTL_Package.IET;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * actual value will be submitted to Sdb
   */
  public final static IET_State E_IET_ANALOGUE_STATE =
      new IET_State( "E_IET_ANALOGUE_STATE", 0, TTL_Package.E_IET );

  /**
   * More than 1 state bit was found to be set
   */
  public final static IET_State E_IET_INVALID_STATE =
      new IET_State( "E_IET_INVALID_STATE", 1, TTL_Package.E_IET );

  /**
   * No PLC state bits were found to be set
   */
  public final static IET_State E_IET_UNKNOWN_STATE =
      new IET_State( "E_IET_UNKNOWN_STATE", 2, TTL_Package.E_IET );

  /**
   * A fault was detected for this mechanism
   */
  public final static IET_State E_IET_FAULT_STATE =
      new IET_State( "E_IET_FAULT_STATE", 3, TTL_Package.E_IET );

  /**
   * Opening
   */
  public final static IET_State E_IET_OPENING_STATE =
      new IET_State( "E_IET_OPENING_STATE", 4, TTL_Package.E_IET );

  /**
   * Closing
   */
  public final static IET_State E_IET_CLOSING_STATE =
      new IET_State( "E_IET_CLOSING_STATE", 5, TTL_Package.E_IET );

  /**
   * Moving
   */
  public final static IET_State E_IET_MOVING_STATE =
      new IET_State( "E_IET_MOVING_STATE", 6, TTL_Package.E_IET );

  /**
   * Stopped
   */
  public final static IET_State E_IET_STOPPED_STATE =
      new IET_State( "E_IET_STOPPED_STATE", 7, TTL_Package.E_IET );

  /**
   * Halted
   */
  public final static IET_State E_IET_HALTED_STATE =
      new IET_State( "E_IET_HALTED_STATE", 8, TTL_Package.E_IET );

  /**
   * Open
   */
  public final static IET_State E_IET_OPEN_STATE =
      new IET_State( "E_IET_OPEN_STATE", 9, TTL_Package.E_IET );

  /**
   * Closed
   */
  public final static IET_State E_IET_CLOSED_STATE =
      new IET_State( "E_IET_CLOSED_STATE", 10, TTL_Package.E_IET );

  /**
   * 
   */
  public final static IET_State E_IET_STATE_EOL =
      new IET_State( "E_IET_STATE_EOL", 11, TTL_Package.E_IET );

  /**
   * Array allowing serialization.
   */
  protected static final IET_State[] array =
  {
    E_IET_ANALOGUE_STATE,
    E_IET_INVALID_STATE,
    E_IET_UNKNOWN_STATE,
    E_IET_FAULT_STATE,
    E_IET_OPENING_STATE,
    E_IET_CLOSING_STATE,
    E_IET_MOVING_STATE,
    E_IET_STOPPED_STATE,
    E_IET_HALTED_STATE,
    E_IET_OPEN_STATE,
    E_IET_CLOSED_STATE,
    E_IET_STATE_EOL
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
   * Return an object reference of the IET_State with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the IET_State
   * @return a reference to the IET_State specified by the argument
   */
  public static IET_State getReference( String s )
  {
    return( (IET_State)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the IET_State with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the IET_State
   * @return a reference to the IET_State specified by the argument
   */
  public static IET_State getReference( int i )
  {
    return( (IET_State)( intHash.get( new Integer( i ) ) ) );
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
  private IET_State( String s )
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
  private IET_State( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this IET_State.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this IET_State.
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
