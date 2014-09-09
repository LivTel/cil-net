package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type NCI_DataType.  These are:
 * <ul>
 * <li>D_NCI_DATAID_BOL</li>
 * <li>D_NCI_PROC_STATE</li>
 * <li>D_NCI_VERSION</li>
 * <li>D_NCI_SERVER_SHUTDOWN</li>
 * <li>D_NCI_TALLY_BASE</li>
 * <li>D_NCI_DATAID_EOL</li>
 * <li>D_NCI_DATAID_MAX_VALUE</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class NCI_DataType
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
  private static final TTL_Package ttlPackage = TTL_Package.NCI;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static NCI_DataType D_NCI_DATAID_BOL =
      new NCI_DataType( "D_NCI_DATAID_BOL", 0, TTL_Package.D_NCI );

  /**
   * The node comms in process state.
   */
  public final static NCI_DataType D_NCI_PROC_STATE =
      new NCI_DataType( "D_NCI_PROC_STATE", 1, TTL_Package.D_NCI );

  /**
   * Version number
   */
  public final static NCI_DataType D_NCI_VERSION =
      new NCI_DataType( "D_NCI_VERSION", 2, TTL_Package.D_NCI );

  /**
   * Server shutdown command flag.
   */
  public final static NCI_DataType D_NCI_SERVER_SHUTDOWN =
      new NCI_DataType( "D_NCI_SERVER_SHUTDOWN", 3, TTL_Package.D_NCI );

  /**
   * 0x100
   */
  public final static NCI_DataType D_NCI_TALLY_BASE =
      new NCI_DataType( "D_NCI_TALLY_BASE", 4, TTL_Package.D_NCI );

  /**
   * E_ACN_MAX_CMD
   */
  public final static NCI_DataType D_NCI_DATAID_EOL =
      new NCI_DataType( "D_NCI_DATAID_EOL", 5, TTL_Package.D_NCI );

  /**
   * Req'd to force size to 4 bytes
   */
  public final static NCI_DataType D_NCI_DATAID_MAX_VALUE =
      new NCI_DataType( "D_NCI_DATAID_MAX_VALUE", 6, TTL_Package.D_NCI );

  /**
   * Array allowing serialization.
   */
  protected static final NCI_DataType[] array =
  {
    D_NCI_DATAID_BOL,
    D_NCI_PROC_STATE,
    D_NCI_VERSION,
    D_NCI_SERVER_SHUTDOWN,
    D_NCI_TALLY_BASE,
    D_NCI_DATAID_EOL,
    D_NCI_DATAID_MAX_VALUE
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
   * Return an object reference of the NCI_DataType with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the NCI_DataType
   * @return a reference to the NCI_DataType specified by the argument
   */
  public static NCI_DataType getReference( String s )
  {
    return( (NCI_DataType)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the NCI_DataType with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the NCI_DataType
   * @return a reference to the NCI_DataType specified by the argument
   */
  public static NCI_DataType getReference( int i )
  {
    return( (NCI_DataType)( intHash.get( new Integer( i ) ) ) );
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
  private NCI_DataType( String s )
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
  private NCI_DataType( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this NCI_DataType.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this NCI_DataType.
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
