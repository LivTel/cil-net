package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type DF1_Status.  These are:
 * <ul>
 * <li>E_DF1_GEN_ERR</li>
 * <li>E_DF1_OPEN_ERROR</li>
 * <li>E_DF1_CLOSE_ERROR</li>
 * <li>E_DF1_STATUS_ERROR</li>
 * <li>E_DF1_READ_ERROR</li>
 * <li>E_DF1_READ_LEN_ERROR</li>
 * <li>E_DF1_WRITE_ERROR</li>
 * <li>E_DF1_STATUS_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class DF1_Status
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
  private static final TTL_Package ttlPackage = TTL_Package.DF1;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static DF1_Status E_DF1_GEN_ERR =
      new DF1_Status( "E_DF1_GEN_ERR", 0, TTL_Package.E_DF1 );

  /**
   * Unable to open connection to PLC
   */
  public final static DF1_Status E_DF1_OPEN_ERROR =
      new DF1_Status( "E_DF1_OPEN_ERROR", 1, TTL_Package.E_DF1 );

  /**
   * Unable to close connection to PLC
   */
  public final static DF1_Status E_DF1_CLOSE_ERROR =
      new DF1_Status( "E_DF1_CLOSE_ERROR", 2, TTL_Package.E_DF1 );

  /**
   * Unable to obtain status from PLC
   */
  public final static DF1_Status E_DF1_STATUS_ERROR =
      new DF1_Status( "E_DF1_STATUS_ERROR", 3, TTL_Package.E_DF1 );

  /**
   * Unable to read data from PLC
   */
  public final static DF1_Status E_DF1_READ_ERROR =
      new DF1_Status( "E_DF1_READ_ERROR", 4, TTL_Package.E_DF1 );

  /**
   * Error in length of data read from PLC
   */
  public final static DF1_Status E_DF1_READ_LEN_ERROR =
      new DF1_Status( "E_DF1_READ_LEN_ERROR", 5, TTL_Package.E_DF1 );

  /**
   * Unable to write data to PLC
   */
  public final static DF1_Status E_DF1_WRITE_ERROR =
      new DF1_Status( "E_DF1_WRITE_ERROR", 6, TTL_Package.E_DF1 );

  /**
   * 
   */
  public final static DF1_Status E_DF1_STATUS_EOL =
      new DF1_Status( "E_DF1_STATUS_EOL", 7, TTL_Package.E_DF1 );

  /**
   * Array allowing serialization.
   */
  protected static final DF1_Status[] array =
  {
    E_DF1_GEN_ERR,
    E_DF1_OPEN_ERROR,
    E_DF1_CLOSE_ERROR,
    E_DF1_STATUS_ERROR,
    E_DF1_READ_ERROR,
    E_DF1_READ_LEN_ERROR,
    E_DF1_WRITE_ERROR,
    E_DF1_STATUS_EOL
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
   * Return an object reference of the DF1_Status with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the DF1_Status
   * @return a reference to the DF1_Status specified by the argument
   */
  public static DF1_Status getReference( String s )
  {
    return( (DF1_Status)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the DF1_Status with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the DF1_Status
   * @return a reference to the DF1_Status specified by the argument
   */
  public static DF1_Status getReference( int i )
  {
    return( (DF1_Status)( intHash.get( new Integer( i ) ) ) );
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
  private DF1_Status( String s )
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
  private DF1_Status( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this DF1_Status.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this DF1_Status.
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
