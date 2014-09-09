package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type AES_DataType.  These are:
 * <ul>
 * <li>D_AES_DATAID_BOL</li>
 * <li>D_AES_PROC_STATE</li>
 * <li>D_AES_SERVER_SHUTDOWN</li>
 * <li>D_AES_POSITION</li>
 * <li>D_AES_PINION_TEETH</li>
 * <li>D_AES_SPUR_TEETH</li>
 * <li>D_AES_GREY_CODED</li>
 * <li>D_AES_STATUS</li>
 * <li>D_AES_TANNENBAUM_FMT</li>
 * <li>D_AES_MULTITURN_BITS</li>
 * <li>D_AES_SINGLETURN_BITS</li>
 * <li>D_AES_SCALE</li>
 * <li>D_AES_UNITS</li>
 * <li>D_AES_MULTIPLIER</li>
 * <li>D_AES_REVS</li>
 * <li>D_AES_ORIGIN</li>
 * <li>D_AES_OFFSET</li>
 * <li>D_AES_TYPE</li>
 * <li>D_AES_USER_SER_NUM</li>
 * <li>D_AES_COUNTS_PER_TURN</li>
 * <li>D_AES_MAX_REVS</li>
 * <li>D_AES_FACTORY_SER_NUM</li>
 * <li>D_AES_TOTAL_OP_TIME</li>
 * <li>D_AES_CLIENT_SHUTDOWN</li>
 * <li>D_AES_READ_FAULTS</li>
 * <li>D_AES_AES_VERSION</li>
 * <li>D_AES_AEI_VERSION</li>
 * <li>D_AES_DATAID_EOL</li>
 * <li>D_AES_DATAID_MAX</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class AES_DataType
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
  private static final TTL_Package ttlPackage = TTL_Package.AES;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static AES_DataType D_AES_DATAID_BOL =
      new AES_DataType( "D_AES_DATAID_BOL", 0, TTL_Package.D_AES );

  /**
   * AesServer process state
   */
  public final static AES_DataType D_AES_PROC_STATE =
      new AES_DataType( "D_AES_PROC_STATE", 1, TTL_Package.D_AES );

  /**
   * AesServer shutdown request
   */
  public final static AES_DataType D_AES_SERVER_SHUTDOWN =
      new AES_DataType( "D_AES_SERVER_SHUTDOWN", 2, TTL_Package.D_AES );

  /**
   * Absolute Encoder position reading
   */
  public final static AES_DataType D_AES_POSITION =
      new AES_DataType( "D_AES_POSITION", 3, TTL_Package.D_AES );

  /**
   * Number of teeth on pinion gear
   */
  public final static AES_DataType D_AES_PINION_TEETH =
      new AES_DataType( "D_AES_PINION_TEETH", 4, TTL_Package.D_AES );

  /**
   * Number of teeth on spur gear
   */
  public final static AES_DataType D_AES_SPUR_TEETH =
      new AES_DataType( "D_AES_SPUR_TEETH", 5, TTL_Package.D_AES );

  /**
   * TRUE if grey coded binary is used
   */
  public final static AES_DataType D_AES_GREY_CODED =
      new AES_DataType( "D_AES_GREY_CODED", 6, TTL_Package.D_AES );

  /**
   * Status bit field for encoder op. params
   */
  public final static AES_DataType D_AES_STATUS =
      new AES_DataType( "D_AES_STATUS", 7, TTL_Package.D_AES );

  /**
   * TRUE if tannenbaum binary code is used
   */
  public final static AES_DataType D_AES_TANNENBAUM_FMT =
      new AES_DataType( "D_AES_TANNENBAUM_FMT", 8, TTL_Package.D_AES );

  /**
   * Multiturn active bits
   */
  public final static AES_DataType D_AES_MULTITURN_BITS =
      new AES_DataType( "D_AES_MULTITURN_BITS", 9, TTL_Package.D_AES );

  /**
   * Sinlgeturn active bits
   */
  public final static AES_DataType D_AES_SINGLETURN_BITS =
      new AES_DataType( "D_AES_SINGLETURN_BITS", 10, TTL_Package.D_AES );

  /**
   * Scaling factor
   */
  public final static AES_DataType D_AES_SCALE =
      new AES_DataType( "D_AES_SCALE", 11, TTL_Package.D_AES );

  /**
   * Units per revolution
   */
  public final static AES_DataType D_AES_UNITS =
      new AES_DataType( "D_AES_UNITS", 12, TTL_Package.D_AES );

  /**
   * Scaling multiplier
   */
  public final static AES_DataType D_AES_MULTIPLIER =
      new AES_DataType( "D_AES_MULTIPLIER", 13, TTL_Package.D_AES );

  /**
   * Number of revolutions before clocking
   */
  public final static AES_DataType D_AES_REVS =
      new AES_DataType( "D_AES_REVS", 14, TTL_Package.D_AES );

  /**
   * Offset applied to read encoder value
   */
  public final static AES_DataType D_AES_ORIGIN =
      new AES_DataType( "D_AES_ORIGIN", 15, TTL_Package.D_AES );

  /**
   * Offset applied to read encoder value
   */
  public final static AES_DataType D_AES_OFFSET =
      new AES_DataType( "D_AES_OFFSET", 16, TTL_Package.D_AES );

  /**
   * Encoder type code
   */
  public final static AES_DataType D_AES_TYPE =
      new AES_DataType( "D_AES_TYPE", 17, TTL_Package.D_AES );

  /**
   * User assigned serial number
   */
  public final static AES_DataType D_AES_USER_SER_NUM =
      new AES_DataType( "D_AES_USER_SER_NUM", 18, TTL_Package.D_AES );

  /**
   * Resolution of a single turn
   */
  public final static AES_DataType D_AES_COUNTS_PER_TURN =
      new AES_DataType( "D_AES_COUNTS_PER_TURN", 19, TTL_Package.D_AES );

  /**
   * Maximum number of revolutions
   */
  public final static AES_DataType D_AES_MAX_REVS =
      new AES_DataType( "D_AES_MAX_REVS", 20, TTL_Package.D_AES );

  /**
   * Factory assigned serial number
   */
  public final static AES_DataType D_AES_FACTORY_SER_NUM =
      new AES_DataType( "D_AES_FACTORY_SER_NUM", 21, TTL_Package.D_AES );

  /**
   * Total accumulated operating time of encoder
   */
  public final static AES_DataType D_AES_TOTAL_OP_TIME =
      new AES_DataType( "D_AES_TOTAL_OP_TIME", 22, TTL_Package.D_AES );

  /**
   * Aei shutdown
   */
  public final static AES_DataType D_AES_CLIENT_SHUTDOWN =
      new AES_DataType( "D_AES_CLIENT_SHUTDOWN", 23, TTL_Package.D_AES );

  /**
   * Abs.Enc. read failures since start up
   */
  public final static AES_DataType D_AES_READ_FAULTS =
      new AES_DataType( "D_AES_READ_FAULTS", 24, TTL_Package.D_AES );

  /**
   * Application version of AES itself
   */
  public final static AES_DataType D_AES_AES_VERSION =
      new AES_DataType( "D_AES_AES_VERSION", 25, TTL_Package.D_AES );

  /**
   * Application version of the AEI client
   */
  public final static AES_DataType D_AES_AEI_VERSION =
      new AES_DataType( "D_AES_AEI_VERSION", 26, TTL_Package.D_AES );

  /**
   * End of list marker
   */
  public final static AES_DataType D_AES_DATAID_EOL =
      new AES_DataType( "D_AES_DATAID_EOL", 27, TTL_Package.D_AES );

  /**
   * enum forced to be 4 bytes
   */
  public final static AES_DataType D_AES_DATAID_MAX =
      new AES_DataType( "D_AES_DATAID_MAX", 28, TTL_Package.D_AES );

  /**
   * Array allowing serialization.
   */
  protected static final AES_DataType[] array =
  {
    D_AES_DATAID_BOL,
    D_AES_PROC_STATE,
    D_AES_SERVER_SHUTDOWN,
    D_AES_POSITION,
    D_AES_PINION_TEETH,
    D_AES_SPUR_TEETH,
    D_AES_GREY_CODED,
    D_AES_STATUS,
    D_AES_TANNENBAUM_FMT,
    D_AES_MULTITURN_BITS,
    D_AES_SINGLETURN_BITS,
    D_AES_SCALE,
    D_AES_UNITS,
    D_AES_MULTIPLIER,
    D_AES_REVS,
    D_AES_ORIGIN,
    D_AES_OFFSET,
    D_AES_TYPE,
    D_AES_USER_SER_NUM,
    D_AES_COUNTS_PER_TURN,
    D_AES_MAX_REVS,
    D_AES_FACTORY_SER_NUM,
    D_AES_TOTAL_OP_TIME,
    D_AES_CLIENT_SHUTDOWN,
    D_AES_READ_FAULTS,
    D_AES_AES_VERSION,
    D_AES_AEI_VERSION,
    D_AES_DATAID_EOL,
    D_AES_DATAID_MAX
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
   * Return an object reference of the AES_DataType with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the AES_DataType
   * @return a reference to the AES_DataType specified by the argument
   */
  public static AES_DataType getReference( String s )
  {
    return( (AES_DataType)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the AES_DataType with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the AES_DataType
   * @return a reference to the AES_DataType specified by the argument
   */
  public static AES_DataType getReference( int i )
  {
    return( (AES_DataType)( intHash.get( new Integer( i ) ) ) );
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
  private AES_DataType( String s )
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
  private AES_DataType( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this AES_DataType.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this AES_DataType.
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
