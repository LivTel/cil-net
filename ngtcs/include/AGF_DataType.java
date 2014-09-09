package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type AGF_DataType.  These are:
 * <ul>
 * <li>D_AGF_DATAID_BOL</li>
 * <li>D_AGF_PROC_STATE</li>
 * <li>D_AGF_APP_VERSION</li>
 * <li>D_AGF_SHUTDOWN</li>
 * <li>D_AGF_STATE</li>
 * <li>D_AGF_ENABLE</li>
 * <li>D_AGF_HOME</li>
 * <li>D_AGF_DEMAND</li>
 * <li>D_AGF_ACTUAL</li>
 * <li>D_AGF_UNUSED_LIMIT_LO</li>
 * <li>D_AGF_UNUSED_LIMIT_HI</li>
 * <li>D_AGF_STOP_DEMAND</li>
 * <li>D_AGF_AGF_RANGE_LO</li>
 * <li>D_AGF_AGF_RANGE_HI</li>
 * <li>D_AGF_AGF_HOME_TOLERANCE</li>
 * <li>D_AGF_AGF_MAX_MOVING_TIME</li>
 * <li>D_AGF_STOPPED</li>
 * <li>D_AGF_AGF_AT_ZERO</li>
 * <li>D_AGF_HALT_DEMAND</li>
 * <li>D_AGF_DATAID_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class AGF_DataType
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
  private static final TTL_Package ttlPackage = TTL_Package.AGF;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static AGF_DataType D_AGF_DATAID_BOL =
      new AGF_DataType( "D_AGF_DATAID_BOL", 0, TTL_Package.D_AGF );

  /**
   * Task process state
   */
  public final static AGF_DataType D_AGF_PROC_STATE =
      new AGF_DataType( "D_AGF_PROC_STATE", 1, TTL_Package.D_AGF );

  /**
   * Package revision number
   */
  public final static AGF_DataType D_AGF_APP_VERSION =
      new AGF_DataType( "D_AGF_APP_VERSION", 2, TTL_Package.D_AGF );

  /**
   * Task shutdown flag
   */
  public final static AGF_DataType D_AGF_SHUTDOWN =
      new AGF_DataType( "D_AGF_SHUTDOWN", 3, TTL_Package.D_AGF );

  /**
   * Autoguider Focus State
   */
  public final static AGF_DataType D_AGF_STATE =
      new AGF_DataType( "D_AGF_STATE", 4, TTL_Package.D_AGF );

  /**
   * Task enable flag
   */
  public final static AGF_DataType D_AGF_ENABLE =
      new AGF_DataType( "D_AGF_ENABLE", 5, TTL_Package.D_AGF );

  /**
   * Home the main mechanism
   */
  public final static AGF_DataType D_AGF_HOME =
      new AGF_DataType( "D_AGF_HOME", 6, TTL_Package.D_AGF );

  /**
   * Position demand
   */
  public final static AGF_DataType D_AGF_DEMAND =
      new AGF_DataType( "D_AGF_DEMAND", 7, TTL_Package.D_AGF );

  /**
   * Actual linear position
   */
  public final static AGF_DataType D_AGF_ACTUAL =
      new AGF_DataType( "D_AGF_ACTUAL", 8, TTL_Package.D_AGF );

  /**
   * Low limit switch state
   */
  public final static AGF_DataType D_AGF_UNUSED_LIMIT_LO =
      new AGF_DataType( "D_AGF_UNUSED_LIMIT_LO", 9, TTL_Package.D_AGF );

  /**
   * High limit switch state
   */
  public final static AGF_DataType D_AGF_UNUSED_LIMIT_HI =
      new AGF_DataType( "D_AGF_UNUSED_LIMIT_HI", 10, TTL_Package.D_AGF );

  /**
   * Task stop flag
   */
  public final static AGF_DataType D_AGF_STOP_DEMAND =
      new AGF_DataType( "D_AGF_STOP_DEMAND", 11, TTL_Package.D_AGF );

  /**
   * Lower travel limit for axis
   */
  public final static AGF_DataType D_AGF_AGF_RANGE_LO =
      new AGF_DataType( "D_AGF_AGF_RANGE_LO", 12, TTL_Package.D_AGF );

  /**
   * Upper travel limit for axis
   */
  public final static AGF_DataType D_AGF_AGF_RANGE_HI =
      new AGF_DataType( "D_AGF_AGF_RANGE_HI", 13, TTL_Package.D_AGF );

  /**
   * Used in homing sequence
   */
  public final static AGF_DataType D_AGF_AGF_HOME_TOLERANCE =
      new AGF_DataType( "D_AGF_AGF_HOME_TOLERANCE", 14, TTL_Package.D_AGF );

  /**
   * Maximum moving time (msec)
   */
  public final static AGF_DataType D_AGF_AGF_MAX_MOVING_TIME =
      new AGF_DataType( "D_AGF_AGF_MAX_MOVING_TIME", 15, TTL_Package.D_AGF );

  /**
   * Denoting all movement stopped
   */
  public final static AGF_DataType D_AGF_STOPPED =
      new AGF_DataType( "D_AGF_STOPPED", 16, TTL_Package.D_AGF );

  /**
   * Denoting current position /home/je 0
   */
  public final static AGF_DataType D_AGF_AGF_AT_ZERO =
      new AGF_DataType( "D_AGF_AGF_AT_ZERO", 17, TTL_Package.D_AGF );

  /**
   * Task halt flag
   */
  public final static AGF_DataType D_AGF_HALT_DEMAND =
      new AGF_DataType( "D_AGF_HALT_DEMAND", 18, TTL_Package.D_AGF );

  /**
   * 
   */
  public final static AGF_DataType D_AGF_DATAID_EOL =
      new AGF_DataType( "D_AGF_DATAID_EOL", 19, TTL_Package.D_AGF );

  /**
   * Array allowing serialization.
   */
  protected static final AGF_DataType[] array =
  {
    D_AGF_DATAID_BOL,
    D_AGF_PROC_STATE,
    D_AGF_APP_VERSION,
    D_AGF_SHUTDOWN,
    D_AGF_STATE,
    D_AGF_ENABLE,
    D_AGF_HOME,
    D_AGF_DEMAND,
    D_AGF_ACTUAL,
    D_AGF_UNUSED_LIMIT_LO,
    D_AGF_UNUSED_LIMIT_HI,
    D_AGF_STOP_DEMAND,
    D_AGF_AGF_RANGE_LO,
    D_AGF_AGF_RANGE_HI,
    D_AGF_AGF_HOME_TOLERANCE,
    D_AGF_AGF_MAX_MOVING_TIME,
    D_AGF_STOPPED,
    D_AGF_AGF_AT_ZERO,
    D_AGF_HALT_DEMAND,
    D_AGF_DATAID_EOL
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
   * Return an object reference of the AGF_DataType with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the AGF_DataType
   * @return a reference to the AGF_DataType specified by the argument
   */
  public static AGF_DataType getReference( String s )
  {
    return( (AGF_DataType)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the AGF_DataType with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the AGF_DataType
   * @return a reference to the AGF_DataType specified by the argument
   */
  public static AGF_DataType getReference( int i )
  {
    return( (AGF_DataType)( intHash.get( new Integer( i ) ) ) );
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
  private AGF_DataType( String s )
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
  private AGF_DataType( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this AGF_DataType.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this AGF_DataType.
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
