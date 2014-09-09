package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type CFL_DataType.  These are:
 * <ul>
 * <li>D_CFL_DATAID_BOL</li>
 * <li>D_CFL_PROC_STATE</li>
 * <li>D_CFL_OPERATING_STATE</li>
 * <li>D_CFL_SERVER_SHUTDOWN</li>
 * <li>D_CFL_LOG_TRIGGER</li>
 * <li>D_CFL_UPDATE_PERIOD</li>
 * <li>D_CFL_ADD_CUSTOM_OID</li>
 * <li>D_CFL_REM_CUSTOM_OID</li>
 * <li>D_CFL_SET_FASTLOG_ON</li>
 * <li>D_CFL_SET_FASTLOG_OFF</li>
 * <li>D_CFL_GET_FASTLOG_BY_OID</li>
 * <li>D_CFL_GET_FASTLOG_BY_NUM</li>
 * <li>D_CFL_REINIT_OID_TABLE</li>
 * <li>D_CFL_CMD_TABLE_NUM_00</li>
 * <li>D_CFL_CMD_TABLE_NUM_01</li>
 * <li>D_CFL_CMD_TABLE_NUM_02</li>
 * <li>D_CFL_CMD_TABLE_NUM_03</li>
 * <li>D_CFL_CMD_TABLE_NUM_04</li>
 * <li>D_CFL_CMD_TABLE_NUM_05</li>
 * <li>D_CFL_CMD_TABLE_NUM_06</li>
 * <li>D_CFL_CMD_TABLE_NUM_07</li>
 * <li>D_CFL_CMD_TABLE_NUM_08</li>
 * <li>D_CFL_CMD_TABLE_NUM_09</li>
 * <li>D_CFL_CMD_TABLE_NUM_10</li>
 * <li>D_CFL_CMD_TABLE_NUM_11</li>
 * <li>D_CFL_CMD_TABLE_NUM_12</li>
 * <li>D_CFL_CMD_TABLE_NUM_13</li>
 * <li>D_CFL_CMD_TABLE_NUM_14</li>
 * <li>D_CFL_CMD_TABLE_NUM_15</li>
 * <li>D_CFL_CMD_TABLE_NUM_16</li>
 * <li>D_CFL_CMD_TABLE_NUM_17</li>
 * <li>D_CFL_CMD_TABLE_NUM_18</li>
 * <li>D_CFL_CMD_TABLE_NUM_19</li>
 * <li>D_CFL_CMD_TABLE_NUM_20</li>
 * <li>D_CFL_CMD_TABLE_NUM_21</li>
 * <li>D_CFL_CMD_TABLE_NUM_22</li>
 * <li>D_CFL_CMD_TABLE_NUM_23</li>
 * <li>D_CFL_CMD_TABLE_NUM_24</li>
 * <li>D_CFL_CMD_TABLE_NUM_25</li>
 * <li>D_CFL_CMD_TABLE_NUM_26</li>
 * <li>D_CFL_CMD_TABLE_NUM_27</li>
 * <li>D_CFL_CMD_TABLE_NUM_28</li>
 * <li>D_CFL_CMD_TABLE_NUM_29</li>
 * <li>D_CFL_CMD_TABLE_NUM_30</li>
 * <li>D_CFL_CMD_TABLE_NUM_31</li>
 * <li>D_CFL_DATAID_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class CFL_DataType
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
  private static final TTL_Package ttlPackage = TTL_Package.CFL;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static CFL_DataType D_CFL_DATAID_BOL =
      new CFL_DataType( "D_CFL_DATAID_BOL", 0, TTL_Package.D_CFL );

  /**
   * CflServer process state
   */
  public final static CFL_DataType D_CFL_PROC_STATE =
      new CFL_DataType( "D_CFL_PROC_STATE", 1, TTL_Package.D_CFL );

  /**
   * CflServer Operating State
   */
  public final static CFL_DataType D_CFL_OPERATING_STATE =
      new CFL_DataType( "D_CFL_OPERATING_STATE", 2, TTL_Package.D_CFL );

  /**
   * CflServer process state
   */
  public final static CFL_DataType D_CFL_SERVER_SHUTDOWN =
      new CFL_DataType( "D_CFL_SERVER_SHUTDOWN", 3, TTL_Package.D_CFL );

  /**
   * CflServer
   */
  public final static CFL_DataType D_CFL_LOG_TRIGGER =
      new CFL_DataType( "D_CFL_LOG_TRIGGER", 4, TTL_Package.D_CFL );

  /**
   * CflServer update value rate
   */
  public final static CFL_DataType D_CFL_UPDATE_PERIOD =
      new CFL_DataType( "D_CFL_UPDATE_PERIOD", 5, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_ADD_CUSTOM_OID =
      new CFL_DataType( "D_CFL_ADD_CUSTOM_OID", 6, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_REM_CUSTOM_OID =
      new CFL_DataType( "D_CFL_REM_CUSTOM_OID", 7, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_SET_FASTLOG_ON =
      new CFL_DataType( "D_CFL_SET_FASTLOG_ON", 8, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_SET_FASTLOG_OFF =
      new CFL_DataType( "D_CFL_SET_FASTLOG_OFF", 9, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_GET_FASTLOG_BY_OID =
      new CFL_DataType( "D_CFL_GET_FASTLOG_BY_OID", 10, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_GET_FASTLOG_BY_NUM =
      new CFL_DataType( "D_CFL_GET_FASTLOG_BY_NUM", 11, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_REINIT_OID_TABLE =
      new CFL_DataType( "D_CFL_REINIT_OID_TABLE", 12, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_00 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_00", 13, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_01 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_01", 14, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_02 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_02", 15, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_03 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_03", 16, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_04 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_04", 17, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_05 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_05", 18, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_06 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_06", 19, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_07 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_07", 20, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_08 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_08", 21, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_09 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_09", 22, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_10 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_10", 23, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_11 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_11", 24, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_12 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_12", 25, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_13 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_13", 26, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_14 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_14", 27, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_15 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_15", 28, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_16 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_16", 29, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_17 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_17", 30, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_18 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_18", 31, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_19 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_19", 32, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_20 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_20", 33, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_21 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_21", 34, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_22 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_22", 35, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_23 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_23", 36, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_24 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_24", 37, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_25 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_25", 38, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_26 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_26", 39, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_27 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_27", 40, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_28 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_28", 41, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_29 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_29", 42, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_30 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_30", 43, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_CMD_TABLE_NUM_31 =
      new CFL_DataType( "D_CFL_CMD_TABLE_NUM_31", 44, TTL_Package.D_CFL );

  /**
   * 
   */
  public final static CFL_DataType D_CFL_DATAID_EOL =
      new CFL_DataType( "D_CFL_DATAID_EOL", 45, TTL_Package.D_CFL );

  /**
   * Array allowing serialization.
   */
  protected static final CFL_DataType[] array =
  {
    D_CFL_DATAID_BOL,
    D_CFL_PROC_STATE,
    D_CFL_OPERATING_STATE,
    D_CFL_SERVER_SHUTDOWN,
    D_CFL_LOG_TRIGGER,
    D_CFL_UPDATE_PERIOD,
    D_CFL_ADD_CUSTOM_OID,
    D_CFL_REM_CUSTOM_OID,
    D_CFL_SET_FASTLOG_ON,
    D_CFL_SET_FASTLOG_OFF,
    D_CFL_GET_FASTLOG_BY_OID,
    D_CFL_GET_FASTLOG_BY_NUM,
    D_CFL_REINIT_OID_TABLE,
    D_CFL_CMD_TABLE_NUM_00,
    D_CFL_CMD_TABLE_NUM_01,
    D_CFL_CMD_TABLE_NUM_02,
    D_CFL_CMD_TABLE_NUM_03,
    D_CFL_CMD_TABLE_NUM_04,
    D_CFL_CMD_TABLE_NUM_05,
    D_CFL_CMD_TABLE_NUM_06,
    D_CFL_CMD_TABLE_NUM_07,
    D_CFL_CMD_TABLE_NUM_08,
    D_CFL_CMD_TABLE_NUM_09,
    D_CFL_CMD_TABLE_NUM_10,
    D_CFL_CMD_TABLE_NUM_11,
    D_CFL_CMD_TABLE_NUM_12,
    D_CFL_CMD_TABLE_NUM_13,
    D_CFL_CMD_TABLE_NUM_14,
    D_CFL_CMD_TABLE_NUM_15,
    D_CFL_CMD_TABLE_NUM_16,
    D_CFL_CMD_TABLE_NUM_17,
    D_CFL_CMD_TABLE_NUM_18,
    D_CFL_CMD_TABLE_NUM_19,
    D_CFL_CMD_TABLE_NUM_20,
    D_CFL_CMD_TABLE_NUM_21,
    D_CFL_CMD_TABLE_NUM_22,
    D_CFL_CMD_TABLE_NUM_23,
    D_CFL_CMD_TABLE_NUM_24,
    D_CFL_CMD_TABLE_NUM_25,
    D_CFL_CMD_TABLE_NUM_26,
    D_CFL_CMD_TABLE_NUM_27,
    D_CFL_CMD_TABLE_NUM_28,
    D_CFL_CMD_TABLE_NUM_29,
    D_CFL_CMD_TABLE_NUM_30,
    D_CFL_CMD_TABLE_NUM_31,
    D_CFL_DATAID_EOL
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
   * Return an object reference of the CFL_DataType with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the CFL_DataType
   * @return a reference to the CFL_DataType specified by the argument
   */
  public static CFL_DataType getReference( String s )
  {
    return( (CFL_DataType)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the CFL_DataType with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the CFL_DataType
   * @return a reference to the CFL_DataType specified by the argument
   */
  public static CFL_DataType getReference( int i )
  {
    return( (CFL_DataType)( intHash.get( new Integer( i ) ) ) );
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
  private CFL_DataType( String s )
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
  private CFL_DataType( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this CFL_DataType.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this CFL_DataType.
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
