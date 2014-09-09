package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type EPT_State.  These are:
 * <ul>
 * <li>E_EPT_ANALOGUE_STATE</li>
 * <li>E_EPT_INVALID_STATE</li>
 * <li>E_EPT_UNKNOWN_STATE</li>
 * <li>E_EPT_FAULT_STATE</li>
 * <li>E_EPT_OPENING_STATE</li>
 * <li>E_EPT_CLOSING_STATE</li>
 * <li>E_EPT_MOVING_STATE</li>
 * <li>E_EPT_STOPPED_STATE</li>
 * <li>E_EPT_HALTED_STATE</li>
 * <li>E_EPT_OPEN_STATE</li>
 * <li>E_EPT_CLOSED_STATE</li>
 * <li>E_EPT_ACTD_STATE</li>
 * <li>E_EPT_AV_STATE</li>
 * <li>E_EPT_BAT_STATE</li>
 * <li>E_EPT_BLKD_STATE</li>
 * <li>E_EPT_CBT_STATE</li>
 * <li>E_EPT_CHRG_STATE</li>
 * <li>E_EPT_CHRGD_STATE</li>
 * <li>E_EPT_CLR_STATE</li>
 * <li>E_EPT_DCHRG_STATE</li>
 * <li>E_EPT_DCHRGD_STATE</li>
 * <li>E_EPT_FLT_STATE</li>
 * <li>E_EPT_HH_STATE</li>
 * <li>E_EPT_HIGH_STATE</li>
 * <li>E_EPT_HLY_STATE</li>
 * <li>E_EPT_HSW_STATE</li>
 * <li>E_EPT_LCKD_STATE</li>
 * <li>E_EPT_LL_STATE</li>
 * <li>E_EPT_LOC_STATE</li>
 * <li>E_EPT_LOW_STATE</li>
 * <li>E_EPT_MA_STATE</li>
 * <li>E_EPT_NAV_STATE</li>
 * <li>E_EPT_NOK_STATE</li>
 * <li>E_EPT_NORM_STATE</li>
 * <li>E_EPT_NULL_STATE</li>
 * <li>E_EPT_OFF_STATE</li>
 * <li>E_EPT_OK_STATE</li>
 * <li>E_EPT_OLT_STATE</li>
 * <li>E_EPT_ON_STATE</li>
 * <li>E_EPT_OPRTD_STATE</li>
 * <li>E_EPT_PROG_STATE</li>
 * <li>E_EPT_REMPROG_STATE</li>
 * <li>E_EPT_REMRUN_STATE</li>
 * <li>E_EPT_RUN_STATE</li>
 * <li>E_EPT_REM_STATE</li>
 * <li>E_EPT_RNG_STATE</li>
 * <li>E_EPT_SAFE_STATE</li>
 * <li>E_EPT_ULKD_STATE</li>
 * <li>E_EPT_SPR_STATE</li>
 * <li>E_EPT_SPR1_STATE</li>
 * <li>E_EPT_SPR2_STATE</li>
 * <li>E_EPT_STATE_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class EPT_State
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
  private static final TTL_Package ttlPackage = TTL_Package.EPT;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * Analogue
   */
  public final static EPT_State E_EPT_ANALOGUE_STATE =
      new EPT_State( "E_EPT_ANALOGUE_STATE", 0, TTL_Package.E_EPT );

  /**
   * More than 1 state bit was found to be set
   */
  public final static EPT_State E_EPT_INVALID_STATE =
      new EPT_State( "E_EPT_INVALID_STATE", 1, TTL_Package.E_EPT );

  /**
   * No PLC state bits were found to be set
   */
  public final static EPT_State E_EPT_UNKNOWN_STATE =
      new EPT_State( "E_EPT_UNKNOWN_STATE", 2, TTL_Package.E_EPT );

  /**
   * A fault was detected for this mechanism
   */
  public final static EPT_State E_EPT_FAULT_STATE =
      new EPT_State( "E_EPT_FAULT_STATE", 3, TTL_Package.E_EPT );

  /**
   * Opening
   */
  public final static EPT_State E_EPT_OPENING_STATE =
      new EPT_State( "E_EPT_OPENING_STATE", 4, TTL_Package.E_EPT );

  /**
   * Closing
   */
  public final static EPT_State E_EPT_CLOSING_STATE =
      new EPT_State( "E_EPT_CLOSING_STATE", 5, TTL_Package.E_EPT );

  /**
   * Moving
   */
  public final static EPT_State E_EPT_MOVING_STATE =
      new EPT_State( "E_EPT_MOVING_STATE", 6, TTL_Package.E_EPT );

  /**
   * Stopped
   */
  public final static EPT_State E_EPT_STOPPED_STATE =
      new EPT_State( "E_EPT_STOPPED_STATE", 7, TTL_Package.E_EPT );

  /**
   * Halted
   */
  public final static EPT_State E_EPT_HALTED_STATE =
      new EPT_State( "E_EPT_HALTED_STATE", 8, TTL_Package.E_EPT );

  /**
   * Open
   */
  public final static EPT_State E_EPT_OPEN_STATE =
      new EPT_State( "E_EPT_OPEN_STATE", 9, TTL_Package.E_EPT );

  /**
   * Closed
   */
  public final static EPT_State E_EPT_CLOSED_STATE =
      new EPT_State( "E_EPT_CLOSED_STATE", 10, TTL_Package.E_EPT );

  /**
   * Activated
   */
  public final static EPT_State E_EPT_ACTD_STATE =
      new EPT_State( "E_EPT_ACTD_STATE", 11, TTL_Package.E_EPT );

  /**
   * Available
   */
  public final static EPT_State E_EPT_AV_STATE =
      new EPT_State( "E_EPT_AV_STATE", 12, TTL_Package.E_EPT );

  /**
   * Battery
   */
  public final static EPT_State E_EPT_BAT_STATE =
      new EPT_State( "E_EPT_BAT_STATE", 13, TTL_Package.E_EPT );

  /**
   * Blocked
   */
  public final static EPT_State E_EPT_BLKD_STATE =
      new EPT_State( "E_EPT_BLKD_STATE", 14, TTL_Package.E_EPT );

  /**
   * Circuit breaker tripped
   */
  public final static EPT_State E_EPT_CBT_STATE =
      new EPT_State( "E_EPT_CBT_STATE", 15, TTL_Package.E_EPT );

  /**
   * Charging
   */
  public final static EPT_State E_EPT_CHRG_STATE =
      new EPT_State( "E_EPT_CHRG_STATE", 16, TTL_Package.E_EPT );

  /**
   * Charged
   */
  public final static EPT_State E_EPT_CHRGD_STATE =
      new EPT_State( "E_EPT_CHRGD_STATE", 17, TTL_Package.E_EPT );

  /**
   * Clear
   */
  public final static EPT_State E_EPT_CLR_STATE =
      new EPT_State( "E_EPT_CLR_STATE", 18, TTL_Package.E_EPT );

  /**
   * Discharging
   */
  public final static EPT_State E_EPT_DCHRG_STATE =
      new EPT_State( "E_EPT_DCHRG_STATE", 19, TTL_Package.E_EPT );

  /**
   * Discharged
   */
  public final static EPT_State E_EPT_DCHRGD_STATE =
      new EPT_State( "E_EPT_DCHRGD_STATE", 20, TTL_Package.E_EPT );

  /**
   * Fault
   */
  public final static EPT_State E_EPT_FLT_STATE =
      new EPT_State( "E_EPT_FLT_STATE", 21, TTL_Package.E_EPT );

  /**
   * High High
   */
  public final static EPT_State E_EPT_HH_STATE =
      new EPT_State( "E_EPT_HH_STATE", 22, TTL_Package.E_EPT );

  /**
   * High
   */
  public final static EPT_State E_EPT_HIGH_STATE =
      new EPT_State( "E_EPT_HIGH_STATE", 23, TTL_Package.E_EPT );

  /**
   * Healthy
   */
  public final static EPT_State E_EPT_HLY_STATE =
      new EPT_State( "E_EPT_HLY_STATE", 24, TTL_Package.E_EPT );

  /**
   * High Switch
   */
  public final static EPT_State E_EPT_HSW_STATE =
      new EPT_State( "E_EPT_HSW_STATE", 25, TTL_Package.E_EPT );

  /**
   * Locked
   */
  public final static EPT_State E_EPT_LCKD_STATE =
      new EPT_State( "E_EPT_LCKD_STATE", 26, TTL_Package.E_EPT );

  /**
   * Low Low
   */
  public final static EPT_State E_EPT_LL_STATE =
      new EPT_State( "E_EPT_LL_STATE", 27, TTL_Package.E_EPT );

  /**
   * Local
   */
  public final static EPT_State E_EPT_LOC_STATE =
      new EPT_State( "E_EPT_LOC_STATE", 28, TTL_Package.E_EPT );

  /**
   * Low
   */
  public final static EPT_State E_EPT_LOW_STATE =
      new EPT_State( "E_EPT_LOW_STATE", 29, TTL_Package.E_EPT );

  /**
   * Mis aligned
   */
  public final static EPT_State E_EPT_MA_STATE =
      new EPT_State( "E_EPT_MA_STATE", 30, TTL_Package.E_EPT );

  /**
   * Not Available
   */
  public final static EPT_State E_EPT_NAV_STATE =
      new EPT_State( "E_EPT_NAV_STATE", 31, TTL_Package.E_EPT );

  /**
   * Not OK
   */
  public final static EPT_State E_EPT_NOK_STATE =
      new EPT_State( "E_EPT_NOK_STATE", 32, TTL_Package.E_EPT );

  /**
   * Normal
   */
  public final static EPT_State E_EPT_NORM_STATE =
      new EPT_State( "E_EPT_NORM_STATE", 33, TTL_Package.E_EPT );

  /**
   * Null
   */
  public final static EPT_State E_EPT_NULL_STATE =
      new EPT_State( "E_EPT_NULL_STATE", 34, TTL_Package.E_EPT );

  /**
   * Off
   */
  public final static EPT_State E_EPT_OFF_STATE =
      new EPT_State( "E_EPT_OFF_STATE", 35, TTL_Package.E_EPT );

  /**
   * OK
   */
  public final static EPT_State E_EPT_OK_STATE =
      new EPT_State( "E_EPT_OK_STATE", 36, TTL_Package.E_EPT );

  /**
   * Over load tripped
   */
  public final static EPT_State E_EPT_OLT_STATE =
      new EPT_State( "E_EPT_OLT_STATE", 37, TTL_Package.E_EPT );

  /**
   * On
   */
  public final static EPT_State E_EPT_ON_STATE =
      new EPT_State( "E_EPT_ON_STATE", 38, TTL_Package.E_EPT );

  /**
   * Operated
   */
  public final static EPT_State E_EPT_OPRTD_STATE =
      new EPT_State( "E_EPT_OPRTD_STATE", 39, TTL_Package.E_EPT );

  /**
   * PLC in program mode
   */
  public final static EPT_State E_EPT_PROG_STATE =
      new EPT_State( "E_EPT_PROG_STATE", 40, TTL_Package.E_EPT );

  /**
   * PLC in remote program mode
   */
  public final static EPT_State E_EPT_REMPROG_STATE =
      new EPT_State( "E_EPT_REMPROG_STATE", 41, TTL_Package.E_EPT );

  /**
   * PLC in remote run mode
   */
  public final static EPT_State E_EPT_REMRUN_STATE =
      new EPT_State( "E_EPT_REMRUN_STATE", 42, TTL_Package.E_EPT );

  /**
   * PLC in running mode
   */
  public final static EPT_State E_EPT_RUN_STATE =
      new EPT_State( "E_EPT_RUN_STATE", 43, TTL_Package.E_EPT );

  /**
   * Remote
   */
  public final static EPT_State E_EPT_REM_STATE =
      new EPT_State( "E_EPT_REM_STATE", 44, TTL_Package.E_EPT );

  /**
   * Running
   */
  public final static EPT_State E_EPT_RNG_STATE =
      new EPT_State( "E_EPT_RNG_STATE", 45, TTL_Package.E_EPT );

  /**
   * Safe state
   */
  public final static EPT_State E_EPT_SAFE_STATE =
      new EPT_State( "E_EPT_SAFE_STATE", 46, TTL_Package.E_EPT );

  /**
   * Unlocked
   */
  public final static EPT_State E_EPT_ULKD_STATE =
      new EPT_State( "E_EPT_ULKD_STATE", 47, TTL_Package.E_EPT );

  /**
   * Spare state 0
   */
  public final static EPT_State E_EPT_SPR_STATE =
      new EPT_State( "E_EPT_SPR_STATE", 48, TTL_Package.E_EPT );

  /**
   * Spare state 1
   */
  public final static EPT_State E_EPT_SPR1_STATE =
      new EPT_State( "E_EPT_SPR1_STATE", 49, TTL_Package.E_EPT );

  /**
   * Spare state 2
   */
  public final static EPT_State E_EPT_SPR2_STATE =
      new EPT_State( "E_EPT_SPR2_STATE", 50, TTL_Package.E_EPT );

  /**
   * 
   */
  public final static EPT_State E_EPT_STATE_EOL =
      new EPT_State( "E_EPT_STATE_EOL", 51, TTL_Package.E_EPT );

  /**
   * Array allowing serialization.
   */
  protected static final EPT_State[] array =
  {
    E_EPT_ANALOGUE_STATE,
    E_EPT_INVALID_STATE,
    E_EPT_UNKNOWN_STATE,
    E_EPT_FAULT_STATE,
    E_EPT_OPENING_STATE,
    E_EPT_CLOSING_STATE,
    E_EPT_MOVING_STATE,
    E_EPT_STOPPED_STATE,
    E_EPT_HALTED_STATE,
    E_EPT_OPEN_STATE,
    E_EPT_CLOSED_STATE,
    E_EPT_ACTD_STATE,
    E_EPT_AV_STATE,
    E_EPT_BAT_STATE,
    E_EPT_BLKD_STATE,
    E_EPT_CBT_STATE,
    E_EPT_CHRG_STATE,
    E_EPT_CHRGD_STATE,
    E_EPT_CLR_STATE,
    E_EPT_DCHRG_STATE,
    E_EPT_DCHRGD_STATE,
    E_EPT_FLT_STATE,
    E_EPT_HH_STATE,
    E_EPT_HIGH_STATE,
    E_EPT_HLY_STATE,
    E_EPT_HSW_STATE,
    E_EPT_LCKD_STATE,
    E_EPT_LL_STATE,
    E_EPT_LOC_STATE,
    E_EPT_LOW_STATE,
    E_EPT_MA_STATE,
    E_EPT_NAV_STATE,
    E_EPT_NOK_STATE,
    E_EPT_NORM_STATE,
    E_EPT_NULL_STATE,
    E_EPT_OFF_STATE,
    E_EPT_OK_STATE,
    E_EPT_OLT_STATE,
    E_EPT_ON_STATE,
    E_EPT_OPRTD_STATE,
    E_EPT_PROG_STATE,
    E_EPT_REMPROG_STATE,
    E_EPT_REMRUN_STATE,
    E_EPT_RUN_STATE,
    E_EPT_REM_STATE,
    E_EPT_RNG_STATE,
    E_EPT_SAFE_STATE,
    E_EPT_ULKD_STATE,
    E_EPT_SPR_STATE,
    E_EPT_SPR1_STATE,
    E_EPT_SPR2_STATE,
    E_EPT_STATE_EOL
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
   * Return an object reference of the EPT_State with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the EPT_State
   * @return a reference to the EPT_State specified by the argument
   */
  public static EPT_State getReference( String s )
  {
    return( (EPT_State)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the EPT_State with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the EPT_State
   * @return a reference to the EPT_State specified by the argument
   */
  public static EPT_State getReference( int i )
  {
    return( (EPT_State)( intHash.get( new Integer( i ) ) ) );
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
  private EPT_State( String s )
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
  private EPT_State( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this EPT_State.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this EPT_State.
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
