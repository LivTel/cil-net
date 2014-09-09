package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type AGD_DataType.  These are:
 * <ul>
 * <li>D_AGD_DATAID_BOL</li>
 * <li>D_AGD_PROC_STATE</li>
 * <li>D_AGD_APP_VERSION</li>
 * <li>D_AGD_SHUTDOWN</li>
 * <li>D_AGD_STATE</li>
 * <li>D_AGD_ENABLE</li>
 * <li>D_AGD_HOME</li>
 * <li>D_AGD_DEMAND</li>
 * <li>D_AGD_ACTUAL</li>
 * <li>D_AGD_UNUSED_LIMIT_LO</li>
 * <li>D_AGD_UNUSED_LIMIT_HI</li>
 * <li>D_AGD_BRAKE_STATE</li>
 * <li>D_AGD_BRAKE_OFF</li>
 * <li>D_AGD_FILTER_STATE</li>
 * <li>D_AGD_FILTER_DEMAND</li>
 * <li>D_AGD_FILTER_ACTUAL</li>
 * <li>D_AGD_DARK_SLIDE_STATE</li>
 * <li>D_AGD_DARK_SLIDE_DEMAND</li>
 * <li>D_AGD_DARK_SLIDE_ACTUAL</li>
 * <li>D_AGD_AIR_STATE</li>
 * <li>D_AGD_STOP_DEMAND</li>
 * <li>D_AGD_AGD_RANGE_LO</li>
 * <li>D_AGD_AGD_RANGE_HI</li>
 * <li>D_AGD_AGD_HOME_TOLERANCE</li>
 * <li>D_AGD_DARK_SLIDE_FITTED</li>
 * <li>D_AGD_AGD_MAX_MOVING_TIME</li>
 * <li>D_AGD_STOPPED</li>
 * <li>D_AGD_AGD_AT_ZERO</li>
 * <li>D_AGD_HALT_DEMAND</li>
 * <li>D_AGD_DATAID_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class AGD_DataType
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
  public final static AGD_DataType D_AGD_DATAID_BOL =
      new AGD_DataType( "D_AGD_DATAID_BOL", 0, TTL_Package.D_AGD );

  /**
   * Task process state
   */
  public final static AGD_DataType D_AGD_PROC_STATE =
      new AGD_DataType( "D_AGD_PROC_STATE", 1, TTL_Package.D_AGD );

  /**
   * Package revision number
   */
  public final static AGD_DataType D_AGD_APP_VERSION =
      new AGD_DataType( "D_AGD_APP_VERSION", 2, TTL_Package.D_AGD );

  /**
   * Task shutdown flag
   */
  public final static AGD_DataType D_AGD_SHUTDOWN =
      new AGD_DataType( "D_AGD_SHUTDOWN", 3, TTL_Package.D_AGD );

  /**
   * Autoguider Focus State
   */
  public final static AGD_DataType D_AGD_STATE =
      new AGD_DataType( "D_AGD_STATE", 4, TTL_Package.D_AGD );

  /**
   * Task enable flag
   */
  public final static AGD_DataType D_AGD_ENABLE =
      new AGD_DataType( "D_AGD_ENABLE", 5, TTL_Package.D_AGD );

  /**
   * Home the main mechanism
   */
  public final static AGD_DataType D_AGD_HOME =
      new AGD_DataType( "D_AGD_HOME", 6, TTL_Package.D_AGD );

  /**
   * Position demand
   */
  public final static AGD_DataType D_AGD_DEMAND =
      new AGD_DataType( "D_AGD_DEMAND", 7, TTL_Package.D_AGD );

  /**
   * Actual linear position
   */
  public final static AGD_DataType D_AGD_ACTUAL =
      new AGD_DataType( "D_AGD_ACTUAL", 8, TTL_Package.D_AGD );

  /**
   * Low limit switch state
   */
  public final static AGD_DataType D_AGD_UNUSED_LIMIT_LO =
      new AGD_DataType( "D_AGD_UNUSED_LIMIT_LO", 9, TTL_Package.D_AGD );

  /**
   * High limit switch state
   */
  public final static AGD_DataType D_AGD_UNUSED_LIMIT_HI =
      new AGD_DataType( "D_AGD_UNUSED_LIMIT_HI", 10, TTL_Package.D_AGD );

  /**
   * Brake operating state
   */
  public final static AGD_DataType D_AGD_BRAKE_STATE =
      new AGD_DataType( "D_AGD_BRAKE_STATE", 11, TTL_Package.D_AGD );

  /**
   * Brake status
   */
  public final static AGD_DataType D_AGD_BRAKE_OFF =
      new AGD_DataType( "D_AGD_BRAKE_OFF", 12, TTL_Package.D_AGD );

  /**
   * Filter operating state
   */
  public final static AGD_DataType D_AGD_FILTER_STATE =
      new AGD_DataType( "D_AGD_FILTER_STATE", 13, TTL_Package.D_AGD );

  /**
   * Filter position demand
   */
  public final static AGD_DataType D_AGD_FILTER_DEMAND =
      new AGD_DataType( "D_AGD_FILTER_DEMAND", 14, TTL_Package.D_AGD );

  /**
   * Actual filter position
   */
  public final static AGD_DataType D_AGD_FILTER_ACTUAL =
      new AGD_DataType( "D_AGD_FILTER_ACTUAL", 15, TTL_Package.D_AGD );

  /**
   * Dark Slide operating state
   */
  public final static AGD_DataType D_AGD_DARK_SLIDE_STATE =
      new AGD_DataType( "D_AGD_DARK_SLIDE_STATE", 16, TTL_Package.D_AGD );

  /**
   * Slide position demand
   */
  public final static AGD_DataType D_AGD_DARK_SLIDE_DEMAND =
      new AGD_DataType( "D_AGD_DARK_SLIDE_DEMAND", 17, TTL_Package.D_AGD );

  /**
   * Actual dark slide position
   */
  public final static AGD_DataType D_AGD_DARK_SLIDE_ACTUAL =
      new AGD_DataType( "D_AGD_DARK_SLIDE_ACTUAL", 18, TTL_Package.D_AGD );

  /**
   * Air pressure state
   */
  public final static AGD_DataType D_AGD_AIR_STATE =
      new AGD_DataType( "D_AGD_AIR_STATE", 19, TTL_Package.D_AGD );

  /**
   * Task stop flag
   */
  public final static AGD_DataType D_AGD_STOP_DEMAND =
      new AGD_DataType( "D_AGD_STOP_DEMAND", 20, TTL_Package.D_AGD );

  /**
   * Lower travel limit for axis
   */
  public final static AGD_DataType D_AGD_AGD_RANGE_LO =
      new AGD_DataType( "D_AGD_AGD_RANGE_LO", 21, TTL_Package.D_AGD );

  /**
   * Upper travel limit for axis
   */
  public final static AGD_DataType D_AGD_AGD_RANGE_HI =
      new AGD_DataType( "D_AGD_AGD_RANGE_HI", 22, TTL_Package.D_AGD );

  /**
   * Used in homing sequence
   */
  public final static AGD_DataType D_AGD_AGD_HOME_TOLERANCE =
      new AGD_DataType( "D_AGD_AGD_HOME_TOLERANCE", 23, TTL_Package.D_AGD );

  /**
   * Flag for Dark Slide present
   */
  public final static AGD_DataType D_AGD_DARK_SLIDE_FITTED =
      new AGD_DataType( "D_AGD_DARK_SLIDE_FITTED", 24, TTL_Package.D_AGD );

  /**
   * Maximum moving time (msec)
   */
  public final static AGD_DataType D_AGD_AGD_MAX_MOVING_TIME =
      new AGD_DataType( "D_AGD_AGD_MAX_MOVING_TIME", 25, TTL_Package.D_AGD );

  /**
   * Denoting all movement stopped
   */
  public final static AGD_DataType D_AGD_STOPPED =
      new AGD_DataType( "D_AGD_STOPPED", 26, TTL_Package.D_AGD );

  /**
   * Denoting current position /home/je 0
   */
  public final static AGD_DataType D_AGD_AGD_AT_ZERO =
      new AGD_DataType( "D_AGD_AGD_AT_ZERO", 27, TTL_Package.D_AGD );

  /**
   * Task halt flag
   */
  public final static AGD_DataType D_AGD_HALT_DEMAND =
      new AGD_DataType( "D_AGD_HALT_DEMAND", 28, TTL_Package.D_AGD );

  /**
   * 
   */
  public final static AGD_DataType D_AGD_DATAID_EOL =
      new AGD_DataType( "D_AGD_DATAID_EOL", 29, TTL_Package.D_AGD );

  /**
   * Array allowing serialization.
   */
  protected static final AGD_DataType[] array =
  {
    D_AGD_DATAID_BOL,
    D_AGD_PROC_STATE,
    D_AGD_APP_VERSION,
    D_AGD_SHUTDOWN,
    D_AGD_STATE,
    D_AGD_ENABLE,
    D_AGD_HOME,
    D_AGD_DEMAND,
    D_AGD_ACTUAL,
    D_AGD_UNUSED_LIMIT_LO,
    D_AGD_UNUSED_LIMIT_HI,
    D_AGD_BRAKE_STATE,
    D_AGD_BRAKE_OFF,
    D_AGD_FILTER_STATE,
    D_AGD_FILTER_DEMAND,
    D_AGD_FILTER_ACTUAL,
    D_AGD_DARK_SLIDE_STATE,
    D_AGD_DARK_SLIDE_DEMAND,
    D_AGD_DARK_SLIDE_ACTUAL,
    D_AGD_AIR_STATE,
    D_AGD_STOP_DEMAND,
    D_AGD_AGD_RANGE_LO,
    D_AGD_AGD_RANGE_HI,
    D_AGD_AGD_HOME_TOLERANCE,
    D_AGD_DARK_SLIDE_FITTED,
    D_AGD_AGD_MAX_MOVING_TIME,
    D_AGD_STOPPED,
    D_AGD_AGD_AT_ZERO,
    D_AGD_HALT_DEMAND,
    D_AGD_DATAID_EOL
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
   * Return an object reference of the AGD_DataType with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the AGD_DataType
   * @return a reference to the AGD_DataType specified by the argument
   */
  public static AGD_DataType getReference( String s )
  {
    return( (AGD_DataType)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the AGD_DataType with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the AGD_DataType
   * @return a reference to the AGD_DataType specified by the argument
   */
  public static AGD_DataType getReference( int i )
  {
    return( (AGD_DataType)( intHash.get( new Integer( i ) ) ) );
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
  private AGD_DataType( String s )
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
  private AGD_DataType( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this AGD_DataType.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this AGD_DataType.
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
