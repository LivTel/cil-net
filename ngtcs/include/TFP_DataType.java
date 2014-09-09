package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type TFP_DataType.  These are:
 * <ul>
 * <li>D_TFP_DATAID_BOL</li>
 * <li>D_TFP_PROC_STATE</li>
 * <li>D_TFP_APP_VERSION</li>
 * <li>D_TFP_SERVER_SHUTDOWN</li>
 * <li>D_TFP_CURRENT_TIME</li>
 * <li>D_TFP_CURRENT_TIME_DUMMY</li>
 * <li>D_TFP_TIME_STATUS</li>
 * <li>D_TFP_TRIGGER_ATTACH</li>
 * <li>D_TFP_TRIGGER_DETACH</li>
 * <li>D_TFP_SYSTEM_TIME</li>
 * <li>D_TFP_SYSTEM_TIME_DUMMY</li>
 * <li>D_TFP_TIMER_PROXY_ATTACH</li>
 * <li>D_TFP_TIMER_PROXY_DETACH</li>
 * <li>D_TFP_PERIODIC_FREQUENCY</li>
 * <li>D_TFP_SIMULATE_FLAG</li>
 * <li>D_TFP_TALLY_TRIGGER</li>
 * <li>D_TFP_TALLY_TIMER</li>
 * <li>D_TFP_DATAID_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class TFP_DataType
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
  private static final TTL_Package ttlPackage = TTL_Package.TFP;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static TFP_DataType D_TFP_DATAID_BOL =
      new TFP_DataType( "D_TFP_DATAID_BOL", 0, TTL_Package.D_TFP );

  /**
   * The tfp process state.
   */
  public final static TFP_DataType D_TFP_PROC_STATE =
      new TFP_DataType( "D_TFP_PROC_STATE", 1, TTL_Package.D_TFP );

  /**
   * TFP package revision.
   */
  public final static TFP_DataType D_TFP_APP_VERSION =
      new TFP_DataType( "D_TFP_APP_VERSION", 2, TTL_Package.D_TFP );

  /**
   * Server shutdown command flag.
   */
  public final static TFP_DataType D_TFP_SERVER_SHUTDOWN =
      new TFP_DataType( "D_TFP_SERVER_SHUTDOWN", 3, TTL_Package.D_TFP );

  /**
   * The current time on the IRIG B card
   */
  public final static TFP_DataType D_TFP_CURRENT_TIME =
      new TFP_DataType( "D_TFP_CURRENT_TIME", 4, TTL_Package.D_TFP );

  /**
   * Dummy for current time upper word
   */
  public final static TFP_DataType D_TFP_CURRENT_TIME_DUMMY =
      new TFP_DataType( "D_TFP_CURRENT_TIME_DUMMY", 5, TTL_Package.D_TFP );

  /**
   * IRIG B status word
   */
  public final static TFP_DataType D_TFP_TIME_STATUS =
      new TFP_DataType( "D_TFP_TIME_STATUS", 6, TTL_Package.D_TFP );

  /**
   * To attach proxies to interrupt
   */
  public final static TFP_DataType D_TFP_TRIGGER_ATTACH =
      new TFP_DataType( "D_TFP_TRIGGER_ATTACH", 7, TTL_Package.D_TFP );

  /**
   * To detach proxies from interrupt
   */
  public final static TFP_DataType D_TFP_TRIGGER_DETACH =
      new TFP_DataType( "D_TFP_TRIGGER_DETACH", 8, TTL_Package.D_TFP );

  /**
   * System time from real time clock
   */
  public final static TFP_DataType D_TFP_SYSTEM_TIME =
      new TFP_DataType( "D_TFP_SYSTEM_TIME", 9, TTL_Package.D_TFP );

  /**
   * Dummy for system time upper word
   */
  public final static TFP_DataType D_TFP_SYSTEM_TIME_DUMMY =
      new TFP_DataType( "D_TFP_SYSTEM_TIME_DUMMY", 10, TTL_Package.D_TFP );

  /**
   * To attach timer proxy to interrupt
   */
  public final static TFP_DataType D_TFP_TIMER_PROXY_ATTACH =
      new TFP_DataType( "D_TFP_TIMER_PROXY_ATTACH", 11, TTL_Package.D_TFP );

  /**
   * To detach time proxy from interrupt
   */
  public final static TFP_DataType D_TFP_TIMER_PROXY_DETACH =
      new TFP_DataType( "D_TFP_TIMER_PROXY_DETACH", 12, TTL_Package.D_TFP );

  /**
   * Frequency of the periodic output
   */
  public final static TFP_DataType D_TFP_PERIODIC_FREQUENCY =
      new TFP_DataType( "D_TFP_PERIODIC_FREQUENCY", 13, TTL_Package.D_TFP );

  /**
   * TRUE if running in simulate mode
   */
  public final static TFP_DataType D_TFP_SIMULATE_FLAG =
      new TFP_DataType( "D_TFP_SIMULATE_FLAG", 14, TTL_Package.D_TFP );

  /**
   * Number of clients for trigger proxy
   */
  public final static TFP_DataType D_TFP_TALLY_TRIGGER =
      new TFP_DataType( "D_TFP_TALLY_TRIGGER", 15, TTL_Package.D_TFP );

  /**
   * Number of clients for timer proxy
   */
  public final static TFP_DataType D_TFP_TALLY_TIMER =
      new TFP_DataType( "D_TFP_TALLY_TIMER", 16, TTL_Package.D_TFP );

  /**
   * 
   */
  public final static TFP_DataType D_TFP_DATAID_EOL =
      new TFP_DataType( "D_TFP_DATAID_EOL", 17, TTL_Package.D_TFP );

  /**
   * Array allowing serialization.
   */
  protected static final TFP_DataType[] array =
  {
    D_TFP_DATAID_BOL,
    D_TFP_PROC_STATE,
    D_TFP_APP_VERSION,
    D_TFP_SERVER_SHUTDOWN,
    D_TFP_CURRENT_TIME,
    D_TFP_CURRENT_TIME_DUMMY,
    D_TFP_TIME_STATUS,
    D_TFP_TRIGGER_ATTACH,
    D_TFP_TRIGGER_DETACH,
    D_TFP_SYSTEM_TIME,
    D_TFP_SYSTEM_TIME_DUMMY,
    D_TFP_TIMER_PROXY_ATTACH,
    D_TFP_TIMER_PROXY_DETACH,
    D_TFP_PERIODIC_FREQUENCY,
    D_TFP_SIMULATE_FLAG,
    D_TFP_TALLY_TRIGGER,
    D_TFP_TALLY_TIMER,
    D_TFP_DATAID_EOL
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
   * Return an object reference of the TFP_DataType with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the TFP_DataType
   * @return a reference to the TFP_DataType specified by the argument
   */
  public static TFP_DataType getReference( String s )
  {
    return( (TFP_DataType)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the TFP_DataType with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the TFP_DataType
   * @return a reference to the TFP_DataType specified by the argument
   */
  public static TFP_DataType getReference( int i )
  {
    return( (TFP_DataType)( intHash.get( new Integer( i ) ) ) );
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
  private TFP_DataType( String s )
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
  private TFP_DataType( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this TFP_DataType.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this TFP_DataType.
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
