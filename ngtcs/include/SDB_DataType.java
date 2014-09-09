package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type SDB_DataType.  These are:
 * <ul>
 * <li>D_SDB_DATAID_BOL</li>
 * <li>D_SDB_PROC_STATE</li>
 * <li>D_SDB_AUTH_STATE</li>
 * <li>D_SDB_SYS_REQUEST</li>
 * <li>D_SDB_QTY_SUBMITTED</li>
 * <li>D_SDB_QTY_RETRIEVED</li>
 * <li>D_SDB_QTY_HBEAT</li>
 * <li>D_SDB_QTY_ERRORS</li>
 * <li>D_SDB_QTY_COUNT</li>
 * <li>D_SDB_QTY_LIST</li>
 * <li>D_SDB_QTY_MISC</li>
 * <li>D_SDB_QTY_DEFNS</li>
 * <li>D_SDB_QTY_HISTLIM</li>
 * <li>D_SDB_TOT_VOLATILE_DATA</li>
 * <li>D_SDB_DATAID_EOL</li>
 * <li>E_SDB_DATAID_MAX_VALUE</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class SDB_DataType
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
  private static final TTL_Package ttlPackage = TTL_Package.SDB;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * Begining of data list do not use as an index
   */
  public final static SDB_DataType D_SDB_DATAID_BOL =
      new SDB_DataType( "D_SDB_DATAID_BOL", 0, TTL_Package.D_SDB );

  /**
   * 
   */
  public final static SDB_DataType D_SDB_PROC_STATE =
      new SDB_DataType( "D_SDB_PROC_STATE", 1, TTL_Package.D_SDB );

  /**
   * granted suthorisation state
   */
  public final static SDB_DataType D_SDB_AUTH_STATE =
      new SDB_DataType( "D_SDB_AUTH_STATE", 2, TTL_Package.D_SDB );

  /**
   * 
   */
  public final static SDB_DataType D_SDB_SYS_REQUEST =
      new SDB_DataType( "D_SDB_SYS_REQUEST", 3, TTL_Package.D_SDB );

  /**
   * 
   */
  public final static SDB_DataType D_SDB_QTY_SUBMITTED =
      new SDB_DataType( "D_SDB_QTY_SUBMITTED", 4, TTL_Package.D_SDB );

  /**
   * No. datum retrievals since run time
   */
  public final static SDB_DataType D_SDB_QTY_RETRIEVED =
      new SDB_DataType( "D_SDB_QTY_RETRIEVED", 5, TTL_Package.D_SDB );

  /**
   * No. heartbeats received since run time
   */
  public final static SDB_DataType D_SDB_QTY_HBEAT =
      new SDB_DataType( "D_SDB_QTY_HBEAT", 6, TTL_Package.D_SDB );

  /**
   * No. comms
   */
  public final static SDB_DataType D_SDB_QTY_ERRORS =
      new SDB_DataType( "D_SDB_QTY_ERRORS", 7, TTL_Package.D_SDB );

  /**
   * No. count commands received
   */
  public final static SDB_DataType D_SDB_QTY_COUNT =
      new SDB_DataType( "D_SDB_QTY_COUNT", 8, TTL_Package.D_SDB );

  /**
   * No. list commands received
   */
  public final static SDB_DataType D_SDB_QTY_LIST =
      new SDB_DataType( "D_SDB_QTY_LIST", 9, TTL_Package.D_SDB );

  /**
   * No. miscellaneous commands received
   */
  public final static SDB_DataType D_SDB_QTY_MISC =
      new SDB_DataType( "D_SDB_QTY_MISC", 10, TTL_Package.D_SDB );

  /**
   * No. data elements (definitions) being stored
   */
  public final static SDB_DataType D_SDB_QTY_DEFNS =
      new SDB_DataType( "D_SDB_QTY_DEFNS", 11, TTL_Package.D_SDB );

  /**
   * No. data lists that have been size limited
   */
  public final static SDB_DataType D_SDB_QTY_HISTLIM =
      new SDB_DataType( "D_SDB_QTY_HISTLIM", 12, TTL_Package.D_SDB );

  /**
   * Total no. measurments in volatile storage
   */
  public final static SDB_DataType D_SDB_TOT_VOLATILE_DATA =
      new SDB_DataType( "D_SDB_TOT_VOLATILE_DATA", 13, TTL_Package.D_SDB );

  /**
   * End of list marker do not use as an index
   */
  public final static SDB_DataType D_SDB_DATAID_EOL =
      new SDB_DataType( "D_SDB_DATAID_EOL", 14, TTL_Package.D_SDB );

  /**
   * Req'd to force size to 4 bytes
   */
  public final static SDB_DataType E_SDB_DATAID_MAX_VALUE =
      new SDB_DataType( "E_SDB_DATAID_MAX_VALUE", 15, TTL_Package.D_SDB );

  /**
   * Array allowing serialization.
   */
  protected static final SDB_DataType[] array =
  {
    D_SDB_DATAID_BOL,
    D_SDB_PROC_STATE,
    D_SDB_AUTH_STATE,
    D_SDB_SYS_REQUEST,
    D_SDB_QTY_SUBMITTED,
    D_SDB_QTY_RETRIEVED,
    D_SDB_QTY_HBEAT,
    D_SDB_QTY_ERRORS,
    D_SDB_QTY_COUNT,
    D_SDB_QTY_LIST,
    D_SDB_QTY_MISC,
    D_SDB_QTY_DEFNS,
    D_SDB_QTY_HISTLIM,
    D_SDB_TOT_VOLATILE_DATA,
    D_SDB_DATAID_EOL,
    E_SDB_DATAID_MAX_VALUE
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
   * Return an object reference of the SDB_DataType with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the SDB_DataType
   * @return a reference to the SDB_DataType specified by the argument
   */
  public static SDB_DataType getReference( String s )
  {
    return( (SDB_DataType)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the SDB_DataType with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the SDB_DataType
   * @return a reference to the SDB_DataType specified by the argument
   */
  public static SDB_DataType getReference( int i )
  {
    return( (SDB_DataType)( intHash.get( new Integer( i ) ) ) );
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
  private SDB_DataType( String s )
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
  private SDB_DataType( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this SDB_DataType.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this SDB_DataType.
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
