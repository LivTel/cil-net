package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type MBS_DataType.  These are:
 * <ul>
 * <li>D_MBS_DATAID_BOL</li>
 * <li>D_MBS_PROC_STATE</li>
 * <li>D_MBS_APP_VERSION</li>
 * <li>D_MBS_SHUTDOWN</li>
 * <li>D_MBS_SIMULATE_HW</li>
 * <li>D_MBS_TTM1</li>
 * <li>D_MBS_TTM2</li>
 * <li>D_MBS_TTM3</li>
 * <li>D_MBS_TTM4</li>
 * <li>D_MBS_TTM1_ENABLED</li>
 * <li>D_MBS_TTM2_ENABLED</li>
 * <li>D_MBS_TTM3_ENABLED</li>
 * <li>D_MBS_TTM4_ENABLED</li>
 * <li>D_MBS_TTM_MEAN</li>
 * <li>D_MBS_TTM_MEAN_ENABLED</li>
 * <li>D_MBS_PMT1</li>
 * <li>D_MBS_PMT2</li>
 * <li>D_MBS_PMT1_ENABLED</li>
 * <li>D_MBS_PMT2_ENABLED</li>
 * <li>D_MBS_PMT_MEAN</li>
 * <li>D_MBS_PMT_MEAN_ENABLED</li>
 * <li>D_MBS_SMT1</li>
 * <li>D_MBS_SMT2</li>
 * <li>D_MBS_SMT1_ENABLED</li>
 * <li>D_MBS_SMT2_ENABLED</li>
 * <li>D_MBS_SMT_MEAN</li>
 * <li>D_MBS_SMT_MEAN_ENABLED</li>
 * <li>D_MBS_AGT1</li>
 * <li>D_MBS_AGT2</li>
 * <li>D_MBS_AGT1_ENABLED</li>
 * <li>D_MBS_AGT2_ENABLED</li>
 * <li>D_MBS_AGT_MEAN</li>
 * <li>D_MBS_AGT_MEAN_ENABLED</li>
 * <li>D_MBS_DATAID_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class MBS_DataType
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
  private static final TTL_Package ttlPackage = TTL_Package.MBS;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * Offset OIDs by package Id.
   */
  public final static MBS_DataType D_MBS_DATAID_BOL =
      new MBS_DataType( "D_MBS_DATAID_BOL", 0, TTL_Package.D_MBS );

  /**
   * MbsServer process state.
   */
  public final static MBS_DataType D_MBS_PROC_STATE =
      new MBS_DataType( "D_MBS_PROC_STATE", 1, TTL_Package.D_MBS );

  /**
   * Software revision number.
   */
  public final static MBS_DataType D_MBS_APP_VERSION =
      new MBS_DataType( "D_MBS_APP_VERSION", 2, TTL_Package.D_MBS );

  /**
   * MbsServer shutdown flag.
   */
  public final static MBS_DataType D_MBS_SHUTDOWN =
      new MBS_DataType( "D_MBS_SHUTDOWN", 3, TTL_Package.D_MBS );

  /**
   * Simulate hardware interface flag.
   */
  public final static MBS_DataType D_MBS_SIMULATE_HW =
      new MBS_DataType( "D_MBS_SIMULATE_HW", 4, TTL_Package.D_MBS );

  /**
   * First truss temperature value.
   */
  public final static MBS_DataType D_MBS_TTM1 =
      new MBS_DataType( "D_MBS_TTM1", 5, TTL_Package.D_MBS );

  /**
   * Second truss temperature value.
   */
  public final static MBS_DataType D_MBS_TTM2 =
      new MBS_DataType( "D_MBS_TTM2", 6, TTL_Package.D_MBS );

  /**
   * Third truss temperature value.
   */
  public final static MBS_DataType D_MBS_TTM3 =
      new MBS_DataType( "D_MBS_TTM3", 7, TTL_Package.D_MBS );

  /**
   * Fourth truss temperature value.
   */
  public final static MBS_DataType D_MBS_TTM4 =
      new MBS_DataType( "D_MBS_TTM4", 8, TTL_Package.D_MBS );

  /**
   * First truss sensor enable flag.
   */
  public final static MBS_DataType D_MBS_TTM1_ENABLED =
      new MBS_DataType( "D_MBS_TTM1_ENABLED", 9, TTL_Package.D_MBS );

  /**
   * Second truss sensor enable flag.
   */
  public final static MBS_DataType D_MBS_TTM2_ENABLED =
      new MBS_DataType( "D_MBS_TTM2_ENABLED", 10, TTL_Package.D_MBS );

  /**
   * Third truss sensor enable flag.
   */
  public final static MBS_DataType D_MBS_TTM3_ENABLED =
      new MBS_DataType( "D_MBS_TTM3_ENABLED", 11, TTL_Package.D_MBS );

  /**
   * Fourth truss sensor enable flag.
   */
  public final static MBS_DataType D_MBS_TTM4_ENABLED =
      new MBS_DataType( "D_MBS_TTM4_ENABLED", 12, TTL_Package.D_MBS );

  /**
   * Mean truss temperature.
   */
  public final static MBS_DataType D_MBS_TTM_MEAN =
      new MBS_DataType( "D_MBS_TTM_MEAN", 13, TTL_Package.D_MBS );

  /**
   * Enable calculation of mean truss temp.
   */
  public final static MBS_DataType D_MBS_TTM_MEAN_ENABLED =
      new MBS_DataType( "D_MBS_TTM_MEAN_ENABLED", 14, TTL_Package.D_MBS );

  /**
   * First primary mirror temp value.
   */
  public final static MBS_DataType D_MBS_PMT1 =
      new MBS_DataType( "D_MBS_PMT1", 15, TTL_Package.D_MBS );

  /**
   * Second primary mirror temp value.
   */
  public final static MBS_DataType D_MBS_PMT2 =
      new MBS_DataType( "D_MBS_PMT2", 16, TTL_Package.D_MBS );

  /**
   * 1st primary mirr sensor enable flag.
   */
  public final static MBS_DataType D_MBS_PMT1_ENABLED =
      new MBS_DataType( "D_MBS_PMT1_ENABLED", 17, TTL_Package.D_MBS );

  /**
   * 2nd primary mirr sensor enable flag.
   */
  public final static MBS_DataType D_MBS_PMT2_ENABLED =
      new MBS_DataType( "D_MBS_PMT2_ENABLED", 18, TTL_Package.D_MBS );

  /**
   * Mean primary mirror temperature.
   */
  public final static MBS_DataType D_MBS_PMT_MEAN =
      new MBS_DataType( "D_MBS_PMT_MEAN", 19, TTL_Package.D_MBS );

  /**
   * Enable calculation of mean primary
   */
  public final static MBS_DataType D_MBS_PMT_MEAN_ENABLED =
      new MBS_DataType( "D_MBS_PMT_MEAN_ENABLED", 20, TTL_Package.D_MBS );

  /**
   * First secondary mirror temp value.
   */
  public final static MBS_DataType D_MBS_SMT1 =
      new MBS_DataType( "D_MBS_SMT1", 21, TTL_Package.D_MBS );

  /**
   * Second secondary mirror temp value.
   */
  public final static MBS_DataType D_MBS_SMT2 =
      new MBS_DataType( "D_MBS_SMT2", 22, TTL_Package.D_MBS );

  /**
   * 1st 2ndary mirror sensor enable flag.
   */
  public final static MBS_DataType D_MBS_SMT1_ENABLED =
      new MBS_DataType( "D_MBS_SMT1_ENABLED", 23, TTL_Package.D_MBS );

  /**
   * 2nd 2ndary mirror sensor enable flag.
   */
  public final static MBS_DataType D_MBS_SMT2_ENABLED =
      new MBS_DataType( "D_MBS_SMT2_ENABLED", 24, TTL_Package.D_MBS );

  /**
   * Mean secondary mirror temperature.
   */
  public final static MBS_DataType D_MBS_SMT_MEAN =
      new MBS_DataType( "D_MBS_SMT_MEAN", 25, TTL_Package.D_MBS );

  /**
   * Enable calculation of mean secondary
   */
  public final static MBS_DataType D_MBS_SMT_MEAN_ENABLED =
      new MBS_DataType( "D_MBS_SMT_MEAN_ENABLED", 26, TTL_Package.D_MBS );

  /**
   * First A&G box temperature value.
   */
  public final static MBS_DataType D_MBS_AGT1 =
      new MBS_DataType( "D_MBS_AGT1", 27, TTL_Package.D_MBS );

  /**
   * Second A&G box temperature value.
   */
  public final static MBS_DataType D_MBS_AGT2 =
      new MBS_DataType( "D_MBS_AGT2", 28, TTL_Package.D_MBS );

  /**
   * First A&G box sensor enable flag.
   */
  public final static MBS_DataType D_MBS_AGT1_ENABLED =
      new MBS_DataType( "D_MBS_AGT1_ENABLED", 29, TTL_Package.D_MBS );

  /**
   * Second A&G box sensor enable flag.
   */
  public final static MBS_DataType D_MBS_AGT2_ENABLED =
      new MBS_DataType( "D_MBS_AGT2_ENABLED", 30, TTL_Package.D_MBS );

  /**
   * Mean A&G box temperature.
   */
  public final static MBS_DataType D_MBS_AGT_MEAN =
      new MBS_DataType( "D_MBS_AGT_MEAN", 31, TTL_Package.D_MBS );

  /**
   * Enable calculation of mean A&G temp.
   */
  public final static MBS_DataType D_MBS_AGT_MEAN_ENABLED =
      new MBS_DataType( "D_MBS_AGT_MEAN_ENABLED", 32, TTL_Package.D_MBS );

  /**
   * 
   */
  public final static MBS_DataType D_MBS_DATAID_EOL =
      new MBS_DataType( "D_MBS_DATAID_EOL", 33, TTL_Package.D_MBS );

  /**
   * Array allowing serialization.
   */
  protected static final MBS_DataType[] array =
  {
    D_MBS_DATAID_BOL,
    D_MBS_PROC_STATE,
    D_MBS_APP_VERSION,
    D_MBS_SHUTDOWN,
    D_MBS_SIMULATE_HW,
    D_MBS_TTM1,
    D_MBS_TTM2,
    D_MBS_TTM3,
    D_MBS_TTM4,
    D_MBS_TTM1_ENABLED,
    D_MBS_TTM2_ENABLED,
    D_MBS_TTM3_ENABLED,
    D_MBS_TTM4_ENABLED,
    D_MBS_TTM_MEAN,
    D_MBS_TTM_MEAN_ENABLED,
    D_MBS_PMT1,
    D_MBS_PMT2,
    D_MBS_PMT1_ENABLED,
    D_MBS_PMT2_ENABLED,
    D_MBS_PMT_MEAN,
    D_MBS_PMT_MEAN_ENABLED,
    D_MBS_SMT1,
    D_MBS_SMT2,
    D_MBS_SMT1_ENABLED,
    D_MBS_SMT2_ENABLED,
    D_MBS_SMT_MEAN,
    D_MBS_SMT_MEAN_ENABLED,
    D_MBS_AGT1,
    D_MBS_AGT2,
    D_MBS_AGT1_ENABLED,
    D_MBS_AGT2_ENABLED,
    D_MBS_AGT_MEAN,
    D_MBS_AGT_MEAN_ENABLED,
    D_MBS_DATAID_EOL
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
   * Return an object reference of the MBS_DataType with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the MBS_DataType
   * @return a reference to the MBS_DataType specified by the argument
   */
  public static MBS_DataType getReference( String s )
  {
    return( (MBS_DataType)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the MBS_DataType with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the MBS_DataType
   * @return a reference to the MBS_DataType specified by the argument
   */
  public static MBS_DataType getReference( int i )
  {
    return( (MBS_DataType)( intHash.get( new Integer( i ) ) ) );
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
  private MBS_DataType( String s )
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
  private MBS_DataType( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this MBS_DataType.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this MBS_DataType.
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
