package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type AGS_DataType.  These are:
 * <ul>
 * <li>D_AGS_DATAID_BOL</li>
 * <li>D_AGS_PROC_STATE</li>
 * <li>D_AGS_AUTH_STATE</li>
 * <li>D_AGS_SYS_REQUEST</li>
 * <li>D_AGS_APP_VERSION</li>
 * <li>D_AGS_AGSTATE</li>
 * <li>D_AGS_WINDOW_TLX</li>
 * <li>D_AGS_WINDOW_TLY</li>
 * <li>D_AGS_WINDOW_BRX</li>
 * <li>D_AGS_WINDOW_BRY</li>
 * <li>D_AGS_INTTIME</li>
 * <li>D_AGS_FRAMESKIP</li>
 * <li>D_AGS_GUIDEMAG</li>
 * <li>D_AGS_CENTROIDX</li>
 * <li>D_AGS_CENTROIDY</li>
 * <li>D_AGS_FWHM</li>
 * <li>D_AGS_PEAKPIXEL</li>
 * <li>D_AGS_AGTEMP</li>
 * <li>D_AGS_DATAID_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class AGS_DataType
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
  private static final TTL_Package ttlPackage = TTL_Package.AGS;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static AGS_DataType D_AGS_DATAID_BOL =
      new AGS_DataType( "D_AGS_DATAID_BOL", 0, TTL_Package.D_AGS );

  /**
   * 
   */
  public final static AGS_DataType D_AGS_PROC_STATE =
      new AGS_DataType( "D_AGS_PROC_STATE", 1, TTL_Package.D_AGS );

  /**
   * granted authorisation state
   */
  public final static AGS_DataType D_AGS_AUTH_STATE =
      new AGS_DataType( "D_AGS_AUTH_STATE", 2, TTL_Package.D_AGS );

  /**
   * 
   */
  public final static AGS_DataType D_AGS_SYS_REQUEST =
      new AGS_DataType( "D_AGS_SYS_REQUEST", 3, TTL_Package.D_AGS );

  /**
   * 
   */
  public final static AGS_DataType D_AGS_APP_VERSION =
      new AGS_DataType( "D_AGS_APP_VERSION", 4, TTL_Package.D_AGS );

  /**
   * 
   */
  public final static AGS_DataType D_AGS_AGSTATE =
      new AGS_DataType( "D_AGS_AGSTATE", 5, TTL_Package.D_AGS );

  /**
   * X pixel of top left guide win coord.
   */
  public final static AGS_DataType D_AGS_WINDOW_TLX =
      new AGS_DataType( "D_AGS_WINDOW_TLX", 6, TTL_Package.D_AGS );

  /**
   * Y pixel of top left guide win coord.
   */
  public final static AGS_DataType D_AGS_WINDOW_TLY =
      new AGS_DataType( "D_AGS_WINDOW_TLY", 7, TTL_Package.D_AGS );

  /**
   * X pixel of bottom right guide win coord.
   */
  public final static AGS_DataType D_AGS_WINDOW_BRX =
      new AGS_DataType( "D_AGS_WINDOW_BRX", 8, TTL_Package.D_AGS );

  /**
   * Y pixel of bottom right guide win coord.
   */
  public final static AGS_DataType D_AGS_WINDOW_BRY =
      new AGS_DataType( "D_AGS_WINDOW_BRY", 9, TTL_Package.D_AGS );

  /**
   * Int time for current
   */
  public final static AGS_DataType D_AGS_INTTIME =
      new AGS_DataType( "D_AGS_INTTIME", 10, TTL_Package.D_AGS );

  /**
   * Frame skip for current
   */
  public final static AGS_DataType D_AGS_FRAMESKIP =
      new AGS_DataType( "D_AGS_FRAMESKIP", 11, TTL_Package.D_AGS );

  /**
   * Star magnitude of guide star on loop start.
   */
  public final static AGS_DataType D_AGS_GUIDEMAG =
      new AGS_DataType( "D_AGS_GUIDEMAG", 12, TTL_Package.D_AGS );

  /**
   * X pixel of current
   */
  public final static AGS_DataType D_AGS_CENTROIDX =
      new AGS_DataType( "D_AGS_CENTROIDX", 13, TTL_Package.D_AGS );

  /**
   * Y pixel of current
   */
  public final static AGS_DataType D_AGS_CENTROIDY =
      new AGS_DataType( "D_AGS_CENTROIDY", 14, TTL_Package.D_AGS );

  /**
   * Measured FWHM of current
   */
  public final static AGS_DataType D_AGS_FWHM =
      new AGS_DataType( "D_AGS_FWHM", 15, TTL_Package.D_AGS );

  /**
   * Star magnitude of current
   */
  public final static AGS_DataType D_AGS_PEAKPIXEL =
      new AGS_DataType( "D_AGS_PEAKPIXEL", 16, TTL_Package.D_AGS );

  /**
   * Chip temperature.
   */
  public final static AGS_DataType D_AGS_AGTEMP =
      new AGS_DataType( "D_AGS_AGTEMP", 17, TTL_Package.D_AGS );

  /**
   * 
   */
  public final static AGS_DataType D_AGS_DATAID_EOL =
      new AGS_DataType( "D_AGS_DATAID_EOL", 18, TTL_Package.D_AGS );

  /**
   * Array allowing serialization.
   */
  protected static final AGS_DataType[] array =
  {
    D_AGS_DATAID_BOL,
    D_AGS_PROC_STATE,
    D_AGS_AUTH_STATE,
    D_AGS_SYS_REQUEST,
    D_AGS_APP_VERSION,
    D_AGS_AGSTATE,
    D_AGS_WINDOW_TLX,
    D_AGS_WINDOW_TLY,
    D_AGS_WINDOW_BRX,
    D_AGS_WINDOW_BRY,
    D_AGS_INTTIME,
    D_AGS_FRAMESKIP,
    D_AGS_GUIDEMAG,
    D_AGS_CENTROIDX,
    D_AGS_CENTROIDY,
    D_AGS_FWHM,
    D_AGS_PEAKPIXEL,
    D_AGS_AGTEMP,
    D_AGS_DATAID_EOL
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
   * Return an object reference of the AGS_DataType with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the AGS_DataType
   * @return a reference to the AGS_DataType specified by the argument
   */
  public static AGS_DataType getReference( String s )
  {
    return( (AGS_DataType)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the AGS_DataType with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the AGS_DataType
   * @return a reference to the AGS_DataType specified by the argument
   */
  public static AGS_DataType getReference( int i )
  {
    return( (AGS_DataType)( intHash.get( new Integer( i ) ) ) );
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
  private AGS_DataType( String s )
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
  private AGS_DataType( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this AGS_DataType.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this AGS_DataType.
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
