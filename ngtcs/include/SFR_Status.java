package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type SFR_Status.  These are:
 * <ul>
 * <li>E_SFR_GEN_ERR</li>
 * <li>E_SFR_CLA_PARSE_ERROR</li>
 * <li>E_SFR_NO_SNEDTO</li>
 * <li>E_SFR_NO_REQUEST</li>
 * <li>E_SFR_REQ_PARSE_ERROR</li>
 * <li>E_SFR_REQ_WRONG_SIZE</li>
 * <li>E_SFR_OUT_OF_MEMORY</li>
 * <li>E_SFR_EMPTY_FILELIST</li>
 * <li>E_SFR_OPENDIR_FAIL</li>
 * <li>E_SFR_NO_FILES</li>
 * <li>E_SFR_NOT_SDB_FILE</li>
 * <li>E_SFR_FILE_OPEN_ERROR</li>
 * <li>E_SFR_FILE_READ_ERROR</li>
 * <li>E_SFR_FILE_CLOSE_ERROR</li>
 * <li>E_SFR_EMPTY_LIST</li>
 * <li>E_SFR_NO_HEADER</li>
 * <li>E_SFR_NO_FILE_TIME</li>
 * <li>E_SFR_UNITS_FILE_O_ERR</li>
 * <li>E_SFR_UNITS_FILE_R_ERR</li>
 * <li>E_SFR_UNITS_FILE_P_ERR</li>
 * <li>E_SFR_NO_UNITS</li>
 * <li>E_SFR_EOERR_LIST</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class SFR_Status
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
  private static final TTL_Package ttlPackage = TTL_Package.SFR;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static SFR_Status E_SFR_GEN_ERR =
      new SFR_Status( "E_SFR_GEN_ERR", 0, TTL_Package.E_SFR );

  /**
   * Unable to parse a command line argument
   */
  public final static SFR_Status E_SFR_CLA_PARSE_ERROR =
      new SFR_Status( "E_SFR_CLA_PARSE_ERROR", 1, TTL_Package.E_SFR );

  /**
   * No datum request specified on command line
   */
  public final static SFR_Status E_SFR_NO_SNEDTO =
      new SFR_Status( "E_SFR_NO_SNEDTO", 2, TTL_Package.E_SFR );

  /**
   * No datum request specified on command line
   */
  public final static SFR_Status E_SFR_NO_REQUEST =
      new SFR_Status( "E_SFR_NO_REQUEST", 3, TTL_Package.E_SFR );

  /**
   * Unable to interpret the request
   */
  public final static SFR_Status E_SFR_REQ_PARSE_ERROR =
      new SFR_Status( "E_SFR_REQ_PARSE_ERROR", 4, TTL_Package.E_SFR );

  /**
   * Number of chars in req not what was expected
   */
  public final static SFR_Status E_SFR_REQ_WRONG_SIZE =
      new SFR_Status( "E_SFR_REQ_WRONG_SIZE", 5, TTL_Package.E_SFR );

  /**
   * No memory available for dynamic allocation
   */
  public final static SFR_Status E_SFR_OUT_OF_MEMORY =
      new SFR_Status( "E_SFR_OUT_OF_MEMORY", 6, TTL_Package.E_SFR );

  /**
   * The linked list of SDB files is empty
   */
  public final static SFR_Status E_SFR_EMPTY_FILELIST =
      new SFR_Status( "E_SFR_EMPTY_FILELIST", 7, TTL_Package.E_SFR );

  /**
   * Unable to open the storage directory
   */
  public final static SFR_Status E_SFR_OPENDIR_FAIL =
      new SFR_Status( "E_SFR_OPENDIR_FAIL", 8, TTL_Package.E_SFR );

  /**
   * There are no SDB files in the storage path
   */
  public final static SFR_Status E_SFR_NO_FILES =
      new SFR_Status( "E_SFR_NO_FILES", 9, TTL_Package.E_SFR );

  /**
   * File does not have SDB storage file format
   */
  public final static SFR_Status E_SFR_NOT_SDB_FILE =
      new SFR_Status( "E_SFR_NOT_SDB_FILE", 10, TTL_Package.E_SFR );

  /**
   * Error attempting to open a file
   */
  public final static SFR_Status E_SFR_FILE_OPEN_ERROR =
      new SFR_Status( "E_SFR_FILE_OPEN_ERROR", 11, TTL_Package.E_SFR );

  /**
   * Error attempting to read data from a file
   */
  public final static SFR_Status E_SFR_FILE_READ_ERROR =
      new SFR_Status( "E_SFR_FILE_READ_ERROR", 12, TTL_Package.E_SFR );

  /**
   * Error attempting to close a file
   */
  public final static SFR_Status E_SFR_FILE_CLOSE_ERROR =
      new SFR_Status( "E_SFR_FILE_CLOSE_ERROR", 13, TTL_Package.E_SFR );

  /**
   * Linked list of filenames unexpectedly empty
   */
  public final static SFR_Status E_SFR_EMPTY_LIST =
      new SFR_Status( "E_SFR_EMPTY_LIST", 14, TTL_Package.E_SFR );

  /**
   * File header missing from SDB storage file
   */
  public final static SFR_Status E_SFR_NO_HEADER =
      new SFR_Status( "E_SFR_NO_HEADER", 15, TTL_Package.E_SFR );

  /**
   * No SDB file timestamp could be read
   */
  public final static SFR_Status E_SFR_NO_FILE_TIME =
      new SFR_Status( "E_SFR_NO_FILE_TIME", 16, TTL_Package.E_SFR );

  /**
   * Error opening units file
   */
  public final static SFR_Status E_SFR_UNITS_FILE_O_ERR =
      new SFR_Status( "E_SFR_UNITS_FILE_O_ERR", 17, TTL_Package.E_SFR );

  /**
   * Error reading data from units file
   */
  public final static SFR_Status E_SFR_UNITS_FILE_R_ERR =
      new SFR_Status( "E_SFR_UNITS_FILE_R_ERR", 18, TTL_Package.E_SFR );

  /**
   * Error parsing data entry in units file
   */
  public final static SFR_Status E_SFR_UNITS_FILE_P_ERR =
      new SFR_Status( "E_SFR_UNITS_FILE_P_ERR", 19, TTL_Package.E_SFR );

  /**
   * Unable to determine the units for the data
   */
  public final static SFR_Status E_SFR_NO_UNITS =
      new SFR_Status( "E_SFR_NO_UNITS", 20, TTL_Package.E_SFR );

  /**
   * 
   */
  public final static SFR_Status E_SFR_EOERR_LIST =
      new SFR_Status( "E_SFR_EOERR_LIST", 21, TTL_Package.E_SFR );

  /**
   * Array allowing serialization.
   */
  protected static final SFR_Status[] array =
  {
    E_SFR_GEN_ERR,
    E_SFR_CLA_PARSE_ERROR,
    E_SFR_NO_SNEDTO,
    E_SFR_NO_REQUEST,
    E_SFR_REQ_PARSE_ERROR,
    E_SFR_REQ_WRONG_SIZE,
    E_SFR_OUT_OF_MEMORY,
    E_SFR_EMPTY_FILELIST,
    E_SFR_OPENDIR_FAIL,
    E_SFR_NO_FILES,
    E_SFR_NOT_SDB_FILE,
    E_SFR_FILE_OPEN_ERROR,
    E_SFR_FILE_READ_ERROR,
    E_SFR_FILE_CLOSE_ERROR,
    E_SFR_EMPTY_LIST,
    E_SFR_NO_HEADER,
    E_SFR_NO_FILE_TIME,
    E_SFR_UNITS_FILE_O_ERR,
    E_SFR_UNITS_FILE_R_ERR,
    E_SFR_UNITS_FILE_P_ERR,
    E_SFR_NO_UNITS,
    E_SFR_EOERR_LIST
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
   * Return an object reference of the SFR_Status with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the SFR_Status
   * @return a reference to the SFR_Status specified by the argument
   */
  public static SFR_Status getReference( String s )
  {
    return( (SFR_Status)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the SFR_Status with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the SFR_Status
   * @return a reference to the SFR_Status specified by the argument
   */
  public static SFR_Status getReference( int i )
  {
    return( (SFR_Status)( intHash.get( new Integer( i ) ) ) );
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
  private SFR_Status( String s )
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
  private SFR_Status( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this SFR_Status.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this SFR_Status.
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
