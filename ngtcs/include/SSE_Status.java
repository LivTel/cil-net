package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type SSE_Status.  These are:
 * <ul>
 * <li>E_SSE_GEN_ERROR</li>
 * <li>E_SSE_INSUFFICIENT_SPACE</li>
 * <li>E_SSE_STRING_OVERFLOW</li>
 * <li>E_SSE_NULL_POINTER</li>
 * <li>E_SSE_STATUS_EOL</li>
 * <li>E_SSE_STATUS_MAX</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class SSE_Status
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
  private static final TTL_Package ttlPackage = TTL_Package.SSE;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static SSE_Status E_SSE_GEN_ERROR =
      new SSE_Status( "E_SSE_GEN_ERROR", 0, TTL_Package.E_SSE );

  /**
   * Insufficient buffer space to write string
   */
  public final static SSE_Status E_SSE_INSUFFICIENT_SPACE =
      new SSE_Status( "E_SSE_INSUFFICIENT_SPACE", 1, TTL_Package.E_SSE );

  /**
   * String has overflowed the buffer space
   */
  public final static SSE_Status E_SSE_STRING_OVERFLOW =
      new SSE_Status( "E_SSE_STRING_OVERFLOW", 2, TTL_Package.E_SSE );

  /**
   * A function argument (pointer) is NULL
   */
  public final static SSE_Status E_SSE_NULL_POINTER =
      new SSE_Status( "E_SSE_NULL_POINTER", 3, TTL_Package.E_SSE );

  /**
   * End of List (do not use for indexing)
   */
  public final static SSE_Status E_SSE_STATUS_EOL =
      new SSE_Status( "E_SSE_STATUS_EOL", 4, TTL_Package.E_SSE );

  /**
   * Force the enum to be 4 bytes
   */
  public final static SSE_Status E_SSE_STATUS_MAX =
      new SSE_Status( "E_SSE_STATUS_MAX", 5, TTL_Package.E_SSE );

  /**
   * Array allowing serialization.
   */
  protected static final SSE_Status[] array =
  {
    E_SSE_GEN_ERROR,
    E_SSE_INSUFFICIENT_SPACE,
    E_SSE_STRING_OVERFLOW,
    E_SSE_NULL_POINTER,
    E_SSE_STATUS_EOL,
    E_SSE_STATUS_MAX
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
   * Return an object reference of the SSE_Status with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the SSE_Status
   * @return a reference to the SSE_Status specified by the argument
   */
  public static SSE_Status getReference( String s )
  {
    return( (SSE_Status)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the SSE_Status with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the SSE_Status
   * @return a reference to the SSE_Status specified by the argument
   */
  public static SSE_Status getReference( int i )
  {
    return( (SSE_Status)( intHash.get( new Integer( i ) ) ) );
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
  private SSE_Status( String s )
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
  private SSE_Status( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this SSE_Status.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this SSE_Status.
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
