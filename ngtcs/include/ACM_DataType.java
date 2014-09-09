package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type ACM_DataType.  These are:
 * <ul>
 * <li>D_ACM_DATAID_BOL</li>
 * <li>D_ACM_PROC_STATE</li>
 * <li>D_ACM_APP_VERSION</li>
 * <li>D_ACM_SHUTDOWN</li>
 * <li>D_ACM_STATE</li>
 * <li>D_ACM_ENABLE</li>
 * <li>D_ACM_HOME</li>
 * <li>D_ACM_HOME_LINEAR_ENCS</li>
 * <li>D_ACM_STOP_DEMAND</li>
 * <li>D_ACM_RED_HOME</li>
 * <li>D_ACM_RED_STATE</li>
 * <li>D_ACM_RED_ACTUAL</li>
 * <li>D_ACM_RED_DEMAND</li>
 * <li>D_ACM_RED_HOME_ENC</li>
 * <li>D_ACM_RED_ENC_HOMED</li>
 * <li>D_ACM_RED_LINEAR</li>
 * <li>D_ACM_RED_PROXIMITY</li>
 * <li>D_ACM_RED_COLLIMATED_POS</li>
 * <li>D_ACM_RED_ENC_CALIBRATION</li>
 * <li>D_ACM_YEL_HOME</li>
 * <li>D_ACM_YEL_STATE</li>
 * <li>D_ACM_YEL_ACTUAL</li>
 * <li>D_ACM_YEL_DEMAND</li>
 * <li>D_ACM_YEL_HOME_ENC</li>
 * <li>D_ACM_YEL_ENC_HOMED</li>
 * <li>D_ACM_YEL_LINEAR</li>
 * <li>D_ACM_YEL_PROXIMITY</li>
 * <li>D_ACM_YEL_COLLIMATED_POS</li>
 * <li>D_ACM_YEL_ENC_CALIBRATION</li>
 * <li>D_ACM_BLU_HOME</li>
 * <li>D_ACM_BLU_STATE</li>
 * <li>D_ACM_BLU_ACTUAL</li>
 * <li>D_ACM_BLU_DEMAND</li>
 * <li>D_ACM_BLU_HOME_ENC</li>
 * <li>D_ACM_BLU_ENC_HOMED</li>
 * <li>D_ACM_BLU_LINEAR</li>
 * <li>D_ACM_BLU_PROXIMITY</li>
 * <li>D_ACM_BLU_COLLIMATED_POS</li>
 * <li>D_ACM_BLU_ENC_CALIBRATION</li>
 * <li>D_ACM_ACM_RANGE_LO</li>
 * <li>D_ACM_ACM_RANGE_HI</li>
 * <li>D_ACM_ACM_REL_MOVING_TIME</li>
 * <li>D_ACM_ACM_ABS_MOVING_TIME</li>
 * <li>D_ACM_STOPPED</li>
 * <li>D_ACM_ACM_AT_ZERO</li>
 * <li>D_ACM_ACM_TOLERANCE</li>
 * <li>D_ACM_LINEAR_ENC_DELAY</li>
 * <li>D_ACM_RELATIVE_RANGE_POS</li>
 * <li>D_ACM_RELATIVE_RANGE_NEG</li>
 * <li>D_ACM_SAVE_COLLIMATION</li>
 * <li>D_ACM_RECOLLIMATE</li>
 * <li>D_ACM_RECOLLIMATE_DEFAULT</li>
 * <li>D_ACM_RED_DFLT_COLLIMATED</li>
 * <li>D_ACM_YEL_DFLT_COLLIMATED</li>
 * <li>D_ACM_BLU_DFLT_COLLIMATED</li>
 * <li>D_ACM_HALT_DEMAND</li>
 * <li>D_ACM_DATAID_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class ACM_DataType
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
  public final static ACM_DataType D_ACM_DATAID_BOL =
      new ACM_DataType( "D_ACM_DATAID_BOL", 0, TTL_Package.D_ACM );

  /**
   * Task process state
   */
  public final static ACM_DataType D_ACM_PROC_STATE =
      new ACM_DataType( "D_ACM_PROC_STATE", 1, TTL_Package.D_ACM );

  /**
   * Software revision number
   */
  public final static ACM_DataType D_ACM_APP_VERSION =
      new ACM_DataType( "D_ACM_APP_VERSION", 2, TTL_Package.D_ACM );

  /**
   * Task shutdown flag
   */
  public final static ACM_DataType D_ACM_SHUTDOWN =
      new ACM_DataType( "D_ACM_SHUTDOWN", 3, TTL_Package.D_ACM );

  /**
   * Application State
   */
  public final static ACM_DataType D_ACM_STATE =
      new ACM_DataType( "D_ACM_STATE", 4, TTL_Package.D_ACM );

  /**
   * Task enable flag
   */
  public final static ACM_DataType D_ACM_ENABLE =
      new ACM_DataType( "D_ACM_ENABLE", 5, TTL_Package.D_ACM );

  /**
   * Home mechanisms flag
   */
  public final static ACM_DataType D_ACM_HOME =
      new ACM_DataType( "D_ACM_HOME", 6, TTL_Package.D_ACM );

  /**
   * Home the linear encoders
   */
  public final static ACM_DataType D_ACM_HOME_LINEAR_ENCS =
      new ACM_DataType( "D_ACM_HOME_LINEAR_ENCS", 7, TTL_Package.D_ACM );

  /**
   * Task stop flag
   */
  public final static ACM_DataType D_ACM_STOP_DEMAND =
      new ACM_DataType( "D_ACM_STOP_DEMAND", 8, TTL_Package.D_ACM );

  /**
   * Home the red actuator
   */
  public final static ACM_DataType D_ACM_RED_HOME =
      new ACM_DataType( "D_ACM_RED_HOME", 9, TTL_Package.D_ACM );

  /**
   * State of red actuator
   */
  public final static ACM_DataType D_ACM_RED_STATE =
      new ACM_DataType( "D_ACM_RED_STATE", 10, TTL_Package.D_ACM );

  /**
   * Red actual position
   */
  public final static ACM_DataType D_ACM_RED_ACTUAL =
      new ACM_DataType( "D_ACM_RED_ACTUAL", 11, TTL_Package.D_ACM );

  /**
   * Red position demand
   */
  public final static ACM_DataType D_ACM_RED_DEMAND =
      new ACM_DataType( "D_ACM_RED_DEMAND", 12, TTL_Package.D_ACM );

  /**
   * Home the red linear encoder
   */
  public final static ACM_DataType D_ACM_RED_HOME_ENC =
      new ACM_DataType( "D_ACM_RED_HOME_ENC", 13, TTL_Package.D_ACM );

  /**
   * Red linear encoder homed
   */
  public final static ACM_DataType D_ACM_RED_ENC_HOMED =
      new ACM_DataType( "D_ACM_RED_ENC_HOMED", 14, TTL_Package.D_ACM );

  /**
   * Red linear encoder reading
   */
  public final static ACM_DataType D_ACM_RED_LINEAR =
      new ACM_DataType( "D_ACM_RED_LINEAR", 15, TTL_Package.D_ACM );

  /**
   * Red proximity switch status
   */
  public final static ACM_DataType D_ACM_RED_PROXIMITY =
      new ACM_DataType( "D_ACM_RED_PROXIMITY", 16, TTL_Package.D_ACM );

  /**
   * Red collimated position
   */
  public final static ACM_DataType D_ACM_RED_COLLIMATED_POS =
      new ACM_DataType( "D_ACM_RED_COLLIMATED_POS", 17, TTL_Package.D_ACM );

  /**
   * Red encoder calibration param
   */
  public final static ACM_DataType D_ACM_RED_ENC_CALIBRATION =
      new ACM_DataType( "D_ACM_RED_ENC_CALIBRATION", 18, TTL_Package.D_ACM );

  /**
   * Home the yellow actuator
   */
  public final static ACM_DataType D_ACM_YEL_HOME =
      new ACM_DataType( "D_ACM_YEL_HOME", 19, TTL_Package.D_ACM );

  /**
   * State of yellow mechanism
   */
  public final static ACM_DataType D_ACM_YEL_STATE =
      new ACM_DataType( "D_ACM_YEL_STATE", 20, TTL_Package.D_ACM );

  /**
   * Yellow actual position
   */
  public final static ACM_DataType D_ACM_YEL_ACTUAL =
      new ACM_DataType( "D_ACM_YEL_ACTUAL", 21, TTL_Package.D_ACM );

  /**
   * Yellow position demand
   */
  public final static ACM_DataType D_ACM_YEL_DEMAND =
      new ACM_DataType( "D_ACM_YEL_DEMAND", 22, TTL_Package.D_ACM );

  /**
   * Home the yellow linear encoder
   */
  public final static ACM_DataType D_ACM_YEL_HOME_ENC =
      new ACM_DataType( "D_ACM_YEL_HOME_ENC", 23, TTL_Package.D_ACM );

  /**
   * Yellow linear encoder homed
   */
  public final static ACM_DataType D_ACM_YEL_ENC_HOMED =
      new ACM_DataType( "D_ACM_YEL_ENC_HOMED", 24, TTL_Package.D_ACM );

  /**
   * Yellow linear encoder reading
   */
  public final static ACM_DataType D_ACM_YEL_LINEAR =
      new ACM_DataType( "D_ACM_YEL_LINEAR", 25, TTL_Package.D_ACM );

  /**
   * Yellow proximity switch status
   */
  public final static ACM_DataType D_ACM_YEL_PROXIMITY =
      new ACM_DataType( "D_ACM_YEL_PROXIMITY", 26, TTL_Package.D_ACM );

  /**
   * Yellow collimated position
   */
  public final static ACM_DataType D_ACM_YEL_COLLIMATED_POS =
      new ACM_DataType( "D_ACM_YEL_COLLIMATED_POS", 27, TTL_Package.D_ACM );

  /**
   * Yellow encoder calibration param
   */
  public final static ACM_DataType D_ACM_YEL_ENC_CALIBRATION =
      new ACM_DataType( "D_ACM_YEL_ENC_CALIBRATION", 28, TTL_Package.D_ACM );

  /**
   * Home the blue actuator
   */
  public final static ACM_DataType D_ACM_BLU_HOME =
      new ACM_DataType( "D_ACM_BLU_HOME", 29, TTL_Package.D_ACM );

  /**
   * State of blue mechanism
   */
  public final static ACM_DataType D_ACM_BLU_STATE =
      new ACM_DataType( "D_ACM_BLU_STATE", 30, TTL_Package.D_ACM );

  /**
   * Blue actual position
   */
  public final static ACM_DataType D_ACM_BLU_ACTUAL =
      new ACM_DataType( "D_ACM_BLU_ACTUAL", 31, TTL_Package.D_ACM );

  /**
   * Blue position demand
   */
  public final static ACM_DataType D_ACM_BLU_DEMAND =
      new ACM_DataType( "D_ACM_BLU_DEMAND", 32, TTL_Package.D_ACM );

  /**
   * Home the blue linear encoder
   */
  public final static ACM_DataType D_ACM_BLU_HOME_ENC =
      new ACM_DataType( "D_ACM_BLU_HOME_ENC", 33, TTL_Package.D_ACM );

  /**
   * Blue linear encoder homed
   */
  public final static ACM_DataType D_ACM_BLU_ENC_HOMED =
      new ACM_DataType( "D_ACM_BLU_ENC_HOMED", 34, TTL_Package.D_ACM );

  /**
   * Blue linear encoder reading
   */
  public final static ACM_DataType D_ACM_BLU_LINEAR =
      new ACM_DataType( "D_ACM_BLU_LINEAR", 35, TTL_Package.D_ACM );

  /**
   * Blue proximity switch status
   */
  public final static ACM_DataType D_ACM_BLU_PROXIMITY =
      new ACM_DataType( "D_ACM_BLU_PROXIMITY", 36, TTL_Package.D_ACM );

  /**
   * Blue collimated position
   */
  public final static ACM_DataType D_ACM_BLU_COLLIMATED_POS =
      new ACM_DataType( "D_ACM_BLU_COLLIMATED_POS", 37, TTL_Package.D_ACM );

  /**
   * Blue encoder calibration param
   */
  public final static ACM_DataType D_ACM_BLU_ENC_CALIBRATION =
      new ACM_DataType( "D_ACM_BLU_ENC_CALIBRATION", 38, TTL_Package.D_ACM );

  /**
   * Lower travel limit for actuators
   */
  public final static ACM_DataType D_ACM_ACM_RANGE_LO =
      new ACM_DataType( "D_ACM_ACM_RANGE_LO", 39, TTL_Package.D_ACM );

  /**
   * Upper travel limit for actuators
   */
  public final static ACM_DataType D_ACM_ACM_RANGE_HI =
      new ACM_DataType( "D_ACM_ACM_RANGE_HI", 40, TTL_Package.D_ACM );

  /**
   * Maximum relative moving time
   */
  public final static ACM_DataType D_ACM_ACM_REL_MOVING_TIME =
      new ACM_DataType( "D_ACM_ACM_REL_MOVING_TIME", 41, TTL_Package.D_ACM );

  /**
   * Maximum absolute moving time
   */
  public final static ACM_DataType D_ACM_ACM_ABS_MOVING_TIME =
      new ACM_DataType( "D_ACM_ACM_ABS_MOVING_TIME", 42, TTL_Package.D_ACM );

  /**
   * Denoting all movement stopped
   */
  public final static ACM_DataType D_ACM_STOPPED =
      new ACM_DataType( "D_ACM_STOPPED", 43, TTL_Package.D_ACM );

  /**
   * Denoting current position /home/je 0
   */
  public final static ACM_DataType D_ACM_ACM_AT_ZERO =
      new ACM_DataType( "D_ACM_ACM_AT_ZERO", 44, TTL_Package.D_ACM );

  /**
   * Positional tolerance (nm)
   */
  public final static ACM_DataType D_ACM_ACM_TOLERANCE =
      new ACM_DataType( "D_ACM_ACM_TOLERANCE", 45, TTL_Package.D_ACM );

  /**
   * Delay to home linear encoder
   */
  public final static ACM_DataType D_ACM_LINEAR_ENC_DELAY =
      new ACM_DataType( "D_ACM_LINEAR_ENC_DELAY", 46, TTL_Package.D_ACM );

  /**
   * Relative move maximum increment
   */
  public final static ACM_DataType D_ACM_RELATIVE_RANGE_POS =
      new ACM_DataType( "D_ACM_RELATIVE_RANGE_POS", 47, TTL_Package.D_ACM );

  /**
   * Relative move maximum increment
   */
  public final static ACM_DataType D_ACM_RELATIVE_RANGE_NEG =
      new ACM_DataType( "D_ACM_RELATIVE_RANGE_NEG", 48, TTL_Package.D_ACM );

  /**
   * Save the collimated positions
   */
  public final static ACM_DataType D_ACM_SAVE_COLLIMATION =
      new ACM_DataType( "D_ACM_SAVE_COLLIMATION", 49, TTL_Package.D_ACM );

  /**
   * Re collimate using saved data
   */
  public final static ACM_DataType D_ACM_RECOLLIMATE =
      new ACM_DataType( "D_ACM_RECOLLIMATE", 50, TTL_Package.D_ACM );

  /**
   * Re collimate using defaults
   */
  public final static ACM_DataType D_ACM_RECOLLIMATE_DEFAULT =
      new ACM_DataType( "D_ACM_RECOLLIMATE_DEFAULT", 51, TTL_Package.D_ACM );

  /**
   * Red default collimated position
   */
  public final static ACM_DataType D_ACM_RED_DFLT_COLLIMATED =
      new ACM_DataType( "D_ACM_RED_DFLT_COLLIMATED", 52, TTL_Package.D_ACM );

  /**
   * Yellow dflt collimated position
   */
  public final static ACM_DataType D_ACM_YEL_DFLT_COLLIMATED =
      new ACM_DataType( "D_ACM_YEL_DFLT_COLLIMATED", 53, TTL_Package.D_ACM );

  /**
   * Blue default collimated position
   */
  public final static ACM_DataType D_ACM_BLU_DFLT_COLLIMATED =
      new ACM_DataType( "D_ACM_BLU_DFLT_COLLIMATED", 54, TTL_Package.D_ACM );

  /**
   * Task halt flag
   */
  public final static ACM_DataType D_ACM_HALT_DEMAND =
      new ACM_DataType( "D_ACM_HALT_DEMAND", 55, TTL_Package.D_ACM );

  /**
   * 
   */
  public final static ACM_DataType D_ACM_DATAID_EOL =
      new ACM_DataType( "D_ACM_DATAID_EOL", 56, TTL_Package.D_ACM );

  /**
   * Array allowing serialization.
   */
  protected static final ACM_DataType[] array =
  {
    D_ACM_DATAID_BOL,
    D_ACM_PROC_STATE,
    D_ACM_APP_VERSION,
    D_ACM_SHUTDOWN,
    D_ACM_STATE,
    D_ACM_ENABLE,
    D_ACM_HOME,
    D_ACM_HOME_LINEAR_ENCS,
    D_ACM_STOP_DEMAND,
    D_ACM_RED_HOME,
    D_ACM_RED_STATE,
    D_ACM_RED_ACTUAL,
    D_ACM_RED_DEMAND,
    D_ACM_RED_HOME_ENC,
    D_ACM_RED_ENC_HOMED,
    D_ACM_RED_LINEAR,
    D_ACM_RED_PROXIMITY,
    D_ACM_RED_COLLIMATED_POS,
    D_ACM_RED_ENC_CALIBRATION,
    D_ACM_YEL_HOME,
    D_ACM_YEL_STATE,
    D_ACM_YEL_ACTUAL,
    D_ACM_YEL_DEMAND,
    D_ACM_YEL_HOME_ENC,
    D_ACM_YEL_ENC_HOMED,
    D_ACM_YEL_LINEAR,
    D_ACM_YEL_PROXIMITY,
    D_ACM_YEL_COLLIMATED_POS,
    D_ACM_YEL_ENC_CALIBRATION,
    D_ACM_BLU_HOME,
    D_ACM_BLU_STATE,
    D_ACM_BLU_ACTUAL,
    D_ACM_BLU_DEMAND,
    D_ACM_BLU_HOME_ENC,
    D_ACM_BLU_ENC_HOMED,
    D_ACM_BLU_LINEAR,
    D_ACM_BLU_PROXIMITY,
    D_ACM_BLU_COLLIMATED_POS,
    D_ACM_BLU_ENC_CALIBRATION,
    D_ACM_ACM_RANGE_LO,
    D_ACM_ACM_RANGE_HI,
    D_ACM_ACM_REL_MOVING_TIME,
    D_ACM_ACM_ABS_MOVING_TIME,
    D_ACM_STOPPED,
    D_ACM_ACM_AT_ZERO,
    D_ACM_ACM_TOLERANCE,
    D_ACM_LINEAR_ENC_DELAY,
    D_ACM_RELATIVE_RANGE_POS,
    D_ACM_RELATIVE_RANGE_NEG,
    D_ACM_SAVE_COLLIMATION,
    D_ACM_RECOLLIMATE,
    D_ACM_RECOLLIMATE_DEFAULT,
    D_ACM_RED_DFLT_COLLIMATED,
    D_ACM_YEL_DFLT_COLLIMATED,
    D_ACM_BLU_DFLT_COLLIMATED,
    D_ACM_HALT_DEMAND,
    D_ACM_DATAID_EOL
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
   * Return an object reference of the ACM_DataType with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the ACM_DataType
   * @return a reference to the ACM_DataType specified by the argument
   */
  public static ACM_DataType getReference( String s )
  {
    return( (ACM_DataType)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the ACM_DataType with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the ACM_DataType
   * @return a reference to the ACM_DataType specified by the argument
   */
  public static ACM_DataType getReference( int i )
  {
    return( (ACM_DataType)( intHash.get( new Integer( i ) ) ) );
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
  private ACM_DataType( String s )
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
  private ACM_DataType( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this ACM_DataType.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this ACM_DataType.
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
