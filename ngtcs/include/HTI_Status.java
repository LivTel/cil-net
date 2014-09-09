package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type HTI_Status.  These are:
 * <ul>
 * <li>E_HTI_GEN_ERR</li>
 * <li>E_HTI_UNRESOLVED</li>
 * <li>E_HTI_FILE_ERROR</li>
 * <li>E_HTI_INDEX_TOO_LOW</li>
 * <li>E_HTI_INDEX_TOO_HIGH</li>
 * <li>E_HTI_BIN_HEADER_FAILURE</li>
 * <li>E_HTI_BIN_READ_ERROR</li>
 * <li>E_HTI_NO_BIN_MATCH</li>
 * <li>E_HTI_EO_ERROR_LIST</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class HTI_Status
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
  private static final TTL_Package ttlPackage = TTL_Package.HTI;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * Miscellaneous error
   */
  public final static HTI_Status E_HTI_GEN_ERR =
      new HTI_Status( "E_HTI_GEN_ERR", 0, TTL_Package.E_HTI );

  /**
   * Unable to resolve label or value
   */
  public final static HTI_Status E_HTI_UNRESOLVED =
      new HTI_Status( "E_HTI_UNRESOLVED", 1, TTL_Package.E_HTI );

  /**
   * Unable to open lookup table file
   */
  public final static HTI_Status E_HTI_FILE_ERROR =
      new HTI_Status( "E_HTI_FILE_ERROR", 2, TTL_Package.E_HTI );

  /**
   * Index below expected minimum
   */
  public final static HTI_Status E_HTI_INDEX_TOO_LOW =
      new HTI_Status( "E_HTI_INDEX_TOO_LOW", 3, TTL_Package.E_HTI );

  /**
   * Index above expected maximum
   */
  public final static HTI_Status E_HTI_INDEX_TOO_HIGH =
      new HTI_Status( "E_HTI_INDEX_TOO_HIGH", 4, TTL_Package.E_HTI );

  /**
   * Unable to read binary file header
   */
  public final static HTI_Status E_HTI_BIN_HEADER_FAILURE =
      new HTI_Status( "E_HTI_BIN_HEADER_FAILURE", 5, TTL_Package.E_HTI );

  /**
   * Unable to read binary record
   */
  public final static HTI_Status E_HTI_BIN_READ_ERROR =
      new HTI_Status( "E_HTI_BIN_READ_ERROR", 6, TTL_Package.E_HTI );

  /**
   * Binary look up failed to find entry
   */
  public final static HTI_Status E_HTI_NO_BIN_MATCH =
      new HTI_Status( "E_HTI_NO_BIN_MATCH", 7, TTL_Package.E_HTI );

  /**
   * 
   */
  public final static HTI_Status E_HTI_EO_ERROR_LIST =
      new HTI_Status( "E_HTI_EO_ERROR_LIST", 8, TTL_Package.E_HTI );

  /**
   * Array allowing serialization.
   */
  protected static final HTI_Status[] array =
  {
    E_HTI_GEN_ERR,
    E_HTI_UNRESOLVED,
    E_HTI_FILE_ERROR,
    E_HTI_INDEX_TOO_LOW,
    E_HTI_INDEX_TOO_HIGH,
    E_HTI_BIN_HEADER_FAILURE,
    E_HTI_BIN_READ_ERROR,
    E_HTI_NO_BIN_MATCH,
    E_HTI_EO_ERROR_LIST
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
   * Return an object reference of the HTI_Status with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the HTI_Status
   * @return a reference to the HTI_Status specified by the argument
   */
  public static HTI_Status getReference( String s )
  {
    return( (HTI_Status)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the HTI_Status with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the HTI_Status
   * @return a reference to the HTI_Status specified by the argument
   */
  public static HTI_Status getReference( int i )
  {
    return( (HTI_Status)( intHash.get( new Integer( i ) ) ) );
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
  private HTI_Status( String s )
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
  private HTI_Status( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this HTI_Status.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this HTI_Status.
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
