package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type ECI_DataType.  These are:
 * <ul>
 * <li>D_ECI_DATAID_BOL</li>
 * <li>D_ECI_PROC_STATE</li>
 * <li>D_ECI_AUTH_STATE</li>
 * <li>D_ECI_SYS_REQUEST</li>
 * <li>D_ECI_VERSION</li>
 * <li>D_ECI_USER_NAME</li>
 * <li>D_ECI_DATAID_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class ECI_DataType
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
  private static final TTL_Package ttlPackage = TTL_Package.ECI;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static ECI_DataType D_ECI_DATAID_BOL =
      new ECI_DataType( "D_ECI_DATAID_BOL", 0, TTL_Package.D_ECI );

  /**
   * 
   */
  public final static ECI_DataType D_ECI_PROC_STATE =
      new ECI_DataType( "D_ECI_PROC_STATE", 1, TTL_Package.D_ECI );

  /**
   * granted authorisation state
   */
  public final static ECI_DataType D_ECI_AUTH_STATE =
      new ECI_DataType( "D_ECI_AUTH_STATE", 2, TTL_Package.D_ECI );

  /**
   * startup and go to safe state
   */
  public final static ECI_DataType D_ECI_SYS_REQUEST =
      new ECI_DataType( "D_ECI_SYS_REQUEST", 3, TTL_Package.D_ECI );

  /**
   * 
   */
  public final static ECI_DataType D_ECI_VERSION =
      new ECI_DataType( "D_ECI_VERSION", 4, TTL_Package.D_ECI );

  /**
   * 
   */
  public final static ECI_DataType D_ECI_USER_NAME =
      new ECI_DataType( "D_ECI_USER_NAME", 5, TTL_Package.D_ECI );

  /**
   * 
   */
  public final static ECI_DataType D_ECI_DATAID_EOL =
      new ECI_DataType( "D_ECI_DATAID_EOL", 6, TTL_Package.D_ECI );

  /**
   * Array allowing serialization.
   */
  protected static final ECI_DataType[] array =
  {
    D_ECI_DATAID_BOL,
    D_ECI_PROC_STATE,
    D_ECI_AUTH_STATE,
    D_ECI_SYS_REQUEST,
    D_ECI_VERSION,
    D_ECI_USER_NAME,
    D_ECI_DATAID_EOL
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
   * Return an object reference of the ECI_DataType with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the ECI_DataType
   * @return a reference to the ECI_DataType specified by the argument
   */
  public static ECI_DataType getReference( String s )
  {
    return( (ECI_DataType)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the ECI_DataType with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the ECI_DataType
   * @return a reference to the ECI_DataType specified by the argument
   */
  public static ECI_DataType getReference( int i )
  {
    return( (ECI_DataType)( intHash.get( new Integer( i ) ) ) );
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
  private ECI_DataType( String s )
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
  private ECI_DataType( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this ECI_DataType.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this ECI_DataType.
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
