package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type SMF_DataType.  These are:
 * <ul>
 * <li>D_SMF_DATAID_BOL</li>
 * <li>D_SMF_PROC_STATE</li>
 * <li>D_SMF_APP_VERSION</li>
 * <li>D_SMF_SHUTDOWN</li>
 * <li>D_SMF_STATE</li>
 * <li>D_SMF_ENABLE</li>
 * <li>D_SMF_HOME</li>
 * <li>D_SMF_DEMAND</li>
 * <li>D_SMF_ACTUAL</li>
 * <li>D_SMF_UNUSED_LIMIT_LO</li>
 * <li>D_SMF_UNUSED_LIMIT_HI</li>
 * <li>D_SMF_STOP_DEMAND</li>
 * <li>D_SMF_SMF_RANGE_LO</li>
 * <li>D_SMF_SMF_RANGE_HI</li>
 * <li>D_SMF_SMF_HOME_TOLERANCE</li>
 * <li>D_SMF_SMF_MAX_MOVING_TIME</li>
 * <li>D_SMF_STOPPED</li>
 * <li>D_SMF_SMF_AT_ZERO</li>
 * <li>D_SMF_TEMP_COMP_ENABLE</li>
 * <li>D_SMF_TEMP_COMP_COEF</li>
 * <li>D_SMF_TEMP_COMP_ZEROPT</li>
 * <li>D_SMF_TEMP_COMP_OFFSET</li>
 * <li>D_SMF_TEMP_COMP_THRESHOLD</li>
 * <li>D_SMF_PHYSICAL_POSN</li>
 * <li>D_SMF_HALT_DEMAND</li>
 * <li>D_SMF_ALT_COMP_ENABLE</li>
 * <li>D_SMF_ALT_COMP_COEF</li>
 * <li>D_SMF_ALT_COMP_ZEROPT</li>
 * <li>D_SMF_ALT_COMP_OFFSET</li>
 * <li>D_SMF_ALT_COMP_THRESHOLD</li>
 * <li>D_SMF_TEMP_COMP_OPERATIONAL</li>
 * <li>D_SMF_ALT_COMP_OPERATIONAL</li>
 * <li>D_SMF_DATAID_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class SMF_DataType
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
  public final static SMF_DataType D_SMF_DATAID_BOL =
      new SMF_DataType( "D_SMF_DATAID_BOL", 0, TTL_Package.D_SMF );

  /**
   * Task process state
   */
  public final static SMF_DataType D_SMF_PROC_STATE =
      new SMF_DataType( "D_SMF_PROC_STATE", 1, TTL_Package.D_SMF );

  /**
   * Application version no.
   */
  public final static SMF_DataType D_SMF_APP_VERSION =
      new SMF_DataType( "D_SMF_APP_VERSION", 2, TTL_Package.D_SMF );

  /**
   * Task shutdown flag
   */
  public final static SMF_DataType D_SMF_SHUTDOWN =
      new SMF_DataType( "D_SMF_SHUTDOWN", 3, TTL_Package.D_SMF );

  /**
   * Secondary mirror State
   */
  public final static SMF_DataType D_SMF_STATE =
      new SMF_DataType( "D_SMF_STATE", 4, TTL_Package.D_SMF );

  /**
   * Task enable flag
   */
  public final static SMF_DataType D_SMF_ENABLE =
      new SMF_DataType( "D_SMF_ENABLE", 5, TTL_Package.D_SMF );

  /**
   * Home the main mechanism
   */
  public final static SMF_DataType D_SMF_HOME =
      new SMF_DataType( "D_SMF_HOME", 6, TTL_Package.D_SMF );

  /**
   * Virtual focus position demand.
   */
  public final static SMF_DataType D_SMF_DEMAND =
      new SMF_DataType( "D_SMF_DEMAND", 7, TTL_Package.D_SMF );

  /**
   * Virtual focus position without
   */
  public final static SMF_DataType D_SMF_ACTUAL =
      new SMF_DataType( "D_SMF_ACTUAL", 8, TTL_Package.D_SMF );

  /**
   * Low limit switch state
   */
  public final static SMF_DataType D_SMF_UNUSED_LIMIT_LO =
      new SMF_DataType( "D_SMF_UNUSED_LIMIT_LO", 9, TTL_Package.D_SMF );

  /**
   * High limit switch state
   */
  public final static SMF_DataType D_SMF_UNUSED_LIMIT_HI =
      new SMF_DataType( "D_SMF_UNUSED_LIMIT_HI", 10, TTL_Package.D_SMF );

  /**
   * Task stop flag
   */
  public final static SMF_DataType D_SMF_STOP_DEMAND =
      new SMF_DataType( "D_SMF_STOP_DEMAND", 11, TTL_Package.D_SMF );

  /**
   * Lower travel limit for axis
   */
  public final static SMF_DataType D_SMF_SMF_RANGE_LO =
      new SMF_DataType( "D_SMF_SMF_RANGE_LO", 12, TTL_Package.D_SMF );

  /**
   * Upper travel limit for axis
   */
  public final static SMF_DataType D_SMF_SMF_RANGE_HI =
      new SMF_DataType( "D_SMF_SMF_RANGE_HI", 13, TTL_Package.D_SMF );

  /**
   * Used in homing sequence
   */
  public final static SMF_DataType D_SMF_SMF_HOME_TOLERANCE =
      new SMF_DataType( "D_SMF_SMF_HOME_TOLERANCE", 14, TTL_Package.D_SMF );

  /**
   * Maximum moving time (msec)
   */
  public final static SMF_DataType D_SMF_SMF_MAX_MOVING_TIME =
      new SMF_DataType( "D_SMF_SMF_MAX_MOVING_TIME", 15, TTL_Package.D_SMF );

  /**
   * Denoting all movement stopped
   */
  public final static SMF_DataType D_SMF_STOPPED =
      new SMF_DataType( "D_SMF_STOPPED", 16, TTL_Package.D_SMF );

  /**
   * Denoting current position /home/je 0
   */
  public final static SMF_DataType D_SMF_SMF_AT_ZERO =
      new SMF_DataType( "D_SMF_SMF_AT_ZERO", 17, TTL_Package.D_SMF );

  /**
   * Enable flag for focus
   */
  public final static SMF_DataType D_SMF_TEMP_COMP_ENABLE =
      new SMF_DataType( "D_SMF_TEMP_COMP_ENABLE", 18, TTL_Package.D_SMF );

  /**
   * Coefficient of linear focus
   */
  public final static SMF_DataType D_SMF_TEMP_COMP_COEF =
      new SMF_DataType( "D_SMF_TEMP_COMP_COEF", 19, TTL_Package.D_SMF );

  /**
   * Temperature of zero correction.
   */
  public final static SMF_DataType D_SMF_TEMP_COMP_ZEROPT =
      new SMF_DataType( "D_SMF_TEMP_COMP_ZEROPT", 20, TTL_Package.D_SMF );

  /**
   * Current focus offset due to
   */
  public final static SMF_DataType D_SMF_TEMP_COMP_OFFSET =
      new SMF_DataType( "D_SMF_TEMP_COMP_OFFSET", 21, TTL_Package.D_SMF );

  /**
   * Minimum temperature correction
   */
  public final static SMF_DataType D_SMF_TEMP_COMP_THRESHOLD =
      new SMF_DataType( "D_SMF_TEMP_COMP_THRESHOLD", 22, TTL_Package.D_SMF );

  /**
   * Physical posiiton of focus
   */
  public final static SMF_DataType D_SMF_PHYSICAL_POSN =
      new SMF_DataType( "D_SMF_PHYSICAL_POSN", 23, TTL_Package.D_SMF );

  /**
   * Task halt flag
   */
  public final static SMF_DataType D_SMF_HALT_DEMAND =
      new SMF_DataType( "D_SMF_HALT_DEMAND", 24, TTL_Package.D_SMF );

  /**
   * Enable flag for focus
   */
  public final static SMF_DataType D_SMF_ALT_COMP_ENABLE =
      new SMF_DataType( "D_SMF_ALT_COMP_ENABLE", 25, TTL_Package.D_SMF );

  /**
   * Coefficient of elevation focus
   */
  public final static SMF_DataType D_SMF_ALT_COMP_COEF =
      new SMF_DataType( "D_SMF_ALT_COMP_COEF", 26, TTL_Package.D_SMF );

  /**
   * Elevation of zero correction.
   */
  public final static SMF_DataType D_SMF_ALT_COMP_ZEROPT =
      new SMF_DataType( "D_SMF_ALT_COMP_ZEROPT", 27, TTL_Package.D_SMF );

  /**
   * Current focus offset due to
   */
  public final static SMF_DataType D_SMF_ALT_COMP_OFFSET =
      new SMF_DataType( "D_SMF_ALT_COMP_OFFSET", 28, TTL_Package.D_SMF );

  /**
   * Minimum elevation correction
   */
  public final static SMF_DataType D_SMF_ALT_COMP_THRESHOLD =
      new SMF_DataType( "D_SMF_ALT_COMP_THRESHOLD", 29, TTL_Package.D_SMF );

  /**
   * Temperature compensation is
   */
  public final static SMF_DataType D_SMF_TEMP_COMP_OPERATIONAL =
      new SMF_DataType( "D_SMF_TEMP_COMP_OPERATIONAL", 30, TTL_Package.D_SMF );

  /**
   * Altitude compensation is
   */
  public final static SMF_DataType D_SMF_ALT_COMP_OPERATIONAL =
      new SMF_DataType( "D_SMF_ALT_COMP_OPERATIONAL", 31, TTL_Package.D_SMF );

  /**
   * 
   */
  public final static SMF_DataType D_SMF_DATAID_EOL =
      new SMF_DataType( "D_SMF_DATAID_EOL", 32, TTL_Package.D_SMF );

  /**
   * Array allowing serialization.
   */
  protected static final SMF_DataType[] array =
  {
    D_SMF_DATAID_BOL,
    D_SMF_PROC_STATE,
    D_SMF_APP_VERSION,
    D_SMF_SHUTDOWN,
    D_SMF_STATE,
    D_SMF_ENABLE,
    D_SMF_HOME,
    D_SMF_DEMAND,
    D_SMF_ACTUAL,
    D_SMF_UNUSED_LIMIT_LO,
    D_SMF_UNUSED_LIMIT_HI,
    D_SMF_STOP_DEMAND,
    D_SMF_SMF_RANGE_LO,
    D_SMF_SMF_RANGE_HI,
    D_SMF_SMF_HOME_TOLERANCE,
    D_SMF_SMF_MAX_MOVING_TIME,
    D_SMF_STOPPED,
    D_SMF_SMF_AT_ZERO,
    D_SMF_TEMP_COMP_ENABLE,
    D_SMF_TEMP_COMP_COEF,
    D_SMF_TEMP_COMP_ZEROPT,
    D_SMF_TEMP_COMP_OFFSET,
    D_SMF_TEMP_COMP_THRESHOLD,
    D_SMF_PHYSICAL_POSN,
    D_SMF_HALT_DEMAND,
    D_SMF_ALT_COMP_ENABLE,
    D_SMF_ALT_COMP_COEF,
    D_SMF_ALT_COMP_ZEROPT,
    D_SMF_ALT_COMP_OFFSET,
    D_SMF_ALT_COMP_THRESHOLD,
    D_SMF_TEMP_COMP_OPERATIONAL,
    D_SMF_ALT_COMP_OPERATIONAL,
    D_SMF_DATAID_EOL
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
   * Return an object reference of the SMF_DataType with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the SMF_DataType
   * @return a reference to the SMF_DataType specified by the argument
   */
  public static SMF_DataType getReference( String s )
  {
    return( (SMF_DataType)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the SMF_DataType with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the SMF_DataType
   * @return a reference to the SMF_DataType specified by the argument
   */
  public static SMF_DataType getReference( int i )
  {
    return( (SMF_DataType)( intHash.get( new Integer( i ) ) ) );
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
  private SMF_DataType( String s )
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
  private SMF_DataType( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this SMF_DataType.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this SMF_DataType.
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
