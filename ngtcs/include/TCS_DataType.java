package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type TCS_DataType.  These are:
 * <ul>
 * <li>D_TCS_DATAID_BOL</li>
 * <li>D_TCS_SOURCE_NAME</li>
 * <li>D_TCS_SOURCE_RA</li>
 * <li>D_TCS_SOURCE_DEC</li>
 * <li>D_TCS_SOURCE_DIFF_RA</li>
 * <li>D_TCS_SOURCE_DIFF_DEC</li>
 * <li>D_TCS_SOURCE_EQUINOX</li>
 * <li>D_TCS_SOURCE_PROPER_RA</li>
 * <li>D_TCS_SOURCE_PROPER_DEC</li>
 * <li>D_TCS_SOURCE_EPOCH</li>
 * <li>D_TCS_SOURCE_PARALLAX</li>
 * <li>D_TCS_SOURCE_RAD_VEL</li>
 * <li>D_TCS_SOURCE_COORD_TYPE</li>
 * <li>D_TCS_LOC_APP_SID_TIME</li>
 * <li>D_TCS_PARALLACTIC_ANGLE</li>
 * <li>D_TCS_AIR_MASS</li>
 * <li>D_TCS_GUIDING_STATE</li>
 * <li>D_TCS_GUIDING_REF_X</li>
 * <li>D_TCS_GUIDING_REF_Y</li>
 * <li>D_TCS_AUTOGUIDER</li>
 * <li>D_TCS_INSTRUMENT</li>
 * <li>D_TCS_FOCAL_STAT</li>
 * <li>D_TCS_OP_MODE</li>
 * <li>D_TCS_SKY_POS_ANGLE</li>
 * <li>D_TCS_DATAID_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class TCS_DataType
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
  private static final TTL_Package ttlPackage = TTL_Package.TCS;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static TCS_DataType D_TCS_DATAID_BOL =
      new TCS_DataType( "D_TCS_DATAID_BOL", 0, TTL_Package.D_TCS );

  /**
   * Name of Current Sky Source.
   */
  public final static TCS_DataType D_TCS_SOURCE_NAME =
      new TCS_DataType( "D_TCS_SOURCE_NAME", 1, TTL_Package.D_TCS );

  /**
   * Current Source Right Ascension.
   */
  public final static TCS_DataType D_TCS_SOURCE_RA =
      new TCS_DataType( "D_TCS_SOURCE_RA", 2, TTL_Package.D_TCS );

  /**
   * Current Source Declination.
   */
  public final static TCS_DataType D_TCS_SOURCE_DEC =
      new TCS_DataType( "D_TCS_SOURCE_DEC", 3, TTL_Package.D_TCS );

  /**
   * Differential Tracking in Right Ascension.
   */
  public final static TCS_DataType D_TCS_SOURCE_DIFF_RA =
      new TCS_DataType( "D_TCS_SOURCE_DIFF_RA", 4, TTL_Package.D_TCS );

  /**
   * Differential Tracking in Declination.
   */
  public final static TCS_DataType D_TCS_SOURCE_DIFF_DEC =
      new TCS_DataType( "D_TCS_SOURCE_DIFF_DEC", 5, TTL_Package.D_TCS );

  /**
   * Current Source Equinox.
   */
  public final static TCS_DataType D_TCS_SOURCE_EQUINOX =
      new TCS_DataType( "D_TCS_SOURCE_EQUINOX", 6, TTL_Package.D_TCS );

  /**
   * Proper motion of Source in Right Ascension.
   */
  public final static TCS_DataType D_TCS_SOURCE_PROPER_RA =
      new TCS_DataType( "D_TCS_SOURCE_PROPER_RA", 7, TTL_Package.D_TCS );

  /**
   * Proper motion of Source in Declination.
   */
  public final static TCS_DataType D_TCS_SOURCE_PROPER_DEC =
      new TCS_DataType( "D_TCS_SOURCE_PROPER_DEC", 8, TTL_Package.D_TCS );

  /**
   * Epoch for Proper Motion.
   */
  public final static TCS_DataType D_TCS_SOURCE_EPOCH =
      new TCS_DataType( "D_TCS_SOURCE_EPOCH", 9, TTL_Package.D_TCS );

  /**
   * Current Source Parallax.
   */
  public final static TCS_DataType D_TCS_SOURCE_PARALLAX =
      new TCS_DataType( "D_TCS_SOURCE_PARALLAX", 10, TTL_Package.D_TCS );

  /**
   * Current Source Radial Velocity.
   */
  public final static TCS_DataType D_TCS_SOURCE_RAD_VEL =
      new TCS_DataType( "D_TCS_SOURCE_RAD_VEL", 11, TTL_Package.D_TCS );

  /**
   * Current Source Coordinate System.
   */
  public final static TCS_DataType D_TCS_SOURCE_COORD_TYPE =
      new TCS_DataType( "D_TCS_SOURCE_COORD_TYPE", 12, TTL_Package.D_TCS );

  /**
   * Local Apparent Sidereal Time.
   */
  public final static TCS_DataType D_TCS_LOC_APP_SID_TIME =
      new TCS_DataType( "D_TCS_LOC_APP_SID_TIME", 13, TTL_Package.D_TCS );

  /**
   * Parallactic Angle.
   */
  public final static TCS_DataType D_TCS_PARALLACTIC_ANGLE =
      new TCS_DataType( "D_TCS_PARALLACTIC_ANGLE", 14, TTL_Package.D_TCS );

  /**
   * Current Air Mass of Observation.
   */
  public final static TCS_DataType D_TCS_AIR_MASS =
      new TCS_DataType( "D_TCS_AIR_MASS", 15, TTL_Package.D_TCS );

  /**
   * State of Autoguided Tracking.
   */
  public final static TCS_DataType D_TCS_GUIDING_STATE =
      new TCS_DataType( "D_TCS_GUIDING_STATE", 16, TTL_Package.D_TCS );

  /**
   * Reference CCD Column for Guide Star.
   */
  public final static TCS_DataType D_TCS_GUIDING_REF_X =
      new TCS_DataType( "D_TCS_GUIDING_REF_X", 17, TTL_Package.D_TCS );

  /**
   * Reference CCD Row for Guide Star.
   */
  public final static TCS_DataType D_TCS_GUIDING_REF_Y =
      new TCS_DataType( "D_TCS_GUIDING_REF_Y", 18, TTL_Package.D_TCS );

  /**
   * Current Autoguider.
   */
  public final static TCS_DataType D_TCS_AUTOGUIDER =
      new TCS_DataType( "D_TCS_AUTOGUIDER", 19, TTL_Package.D_TCS );

  /**
   * Current Instrument.
   */
  public final static TCS_DataType D_TCS_INSTRUMENT =
      new TCS_DataType( "D_TCS_INSTRUMENT", 20, TTL_Package.D_TCS );

  /**
   * Current Focal Station.
   */
  public final static TCS_DataType D_TCS_FOCAL_STAT =
      new TCS_DataType( "D_TCS_FOCAL_STAT", 21, TTL_Package.D_TCS );

  /**
   * Telescope Control System Operating Mode.
   */
  public final static TCS_DataType D_TCS_OP_MODE =
      new TCS_DataType( "D_TCS_OP_MODE", 22, TTL_Package.D_TCS );

  /**
   * Sky position angle.
   */
  public final static TCS_DataType D_TCS_SKY_POS_ANGLE =
      new TCS_DataType( "D_TCS_SKY_POS_ANGLE", 23, TTL_Package.D_TCS );

  /**
   * 
   */
  public final static TCS_DataType D_TCS_DATAID_EOL =
      new TCS_DataType( "D_TCS_DATAID_EOL", 24, TTL_Package.D_TCS );

  /**
   * Array allowing serialization.
   */
  protected static final TCS_DataType[] array =
  {
    D_TCS_DATAID_BOL,
    D_TCS_SOURCE_NAME,
    D_TCS_SOURCE_RA,
    D_TCS_SOURCE_DEC,
    D_TCS_SOURCE_DIFF_RA,
    D_TCS_SOURCE_DIFF_DEC,
    D_TCS_SOURCE_EQUINOX,
    D_TCS_SOURCE_PROPER_RA,
    D_TCS_SOURCE_PROPER_DEC,
    D_TCS_SOURCE_EPOCH,
    D_TCS_SOURCE_PARALLAX,
    D_TCS_SOURCE_RAD_VEL,
    D_TCS_SOURCE_COORD_TYPE,
    D_TCS_LOC_APP_SID_TIME,
    D_TCS_PARALLACTIC_ANGLE,
    D_TCS_AIR_MASS,
    D_TCS_GUIDING_STATE,
    D_TCS_GUIDING_REF_X,
    D_TCS_GUIDING_REF_Y,
    D_TCS_AUTOGUIDER,
    D_TCS_INSTRUMENT,
    D_TCS_FOCAL_STAT,
    D_TCS_OP_MODE,
    D_TCS_SKY_POS_ANGLE,
    D_TCS_DATAID_EOL
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
   * Return an object reference of the TCS_DataType with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the TCS_DataType
   * @return a reference to the TCS_DataType specified by the argument
   */
  public static TCS_DataType getReference( String s )
  {
    return( (TCS_DataType)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the TCS_DataType with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the TCS_DataType
   * @return a reference to the TCS_DataType specified by the argument
   */
  public static TCS_DataType getReference( int i )
  {
    return( (TCS_DataType)( intHash.get( new Integer( i ) ) ) );
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
  private TCS_DataType( String s )
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
  private TCS_DataType( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this TCS_DataType.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this TCS_DataType.
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
