package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type CAN_DataType.  These are:
 * <ul>
 * <li>D_CAN_DATAID_BOL</li>
 * <li>D_CAN_PROC_STATE</li>
 * <li>D_CAN_APP_VERSION</li>
 * <li>D_CAN_SHUTDOWN</li>
 * <li>D_CAN_DATAID_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class CAN_DataType
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
  private static final TTL_Package ttlPackage = TTL_Package.CAN;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static CAN_DataType D_CAN_DATAID_BOL =
      new CAN_DataType( "D_CAN_DATAID_BOL", 0, TTL_Package.D_CAN );

  /**
   * CanServer process state
   */
  public final static CAN_DataType D_CAN_PROC_STATE =
      new CAN_DataType( "D_CAN_PROC_STATE", 1, TTL_Package.D_CAN );

  /**
   * Software revision number
   */
  public final static CAN_DataType D_CAN_APP_VERSION =
      new CAN_DataType( "D_CAN_APP_VERSION", 2, TTL_Package.D_CAN );

  /**
   * CanServer shutdown flag
   */
  public final static CAN_DataType D_CAN_SHUTDOWN =
      new CAN_DataType( "D_CAN_SHUTDOWN", 3, TTL_Package.D_CAN );

  /**
   * 
   */
  public final static CAN_DataType D_CAN_DATAID_EOL =
      new CAN_DataType( "D_CAN_DATAID_EOL", 4, TTL_Package.D_CAN );

  /**
   * Array allowing serialization.
   */
  protected static final CAN_DataType[] array =
  {
    D_CAN_DATAID_BOL,
    D_CAN_PROC_STATE,
    D_CAN_APP_VERSION,
    D_CAN_SHUTDOWN,
    D_CAN_DATAID_EOL
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
   * Return an object reference of the CAN_DataType with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the CAN_DataType
   * @return a reference to the CAN_DataType specified by the argument
   */
  public static CAN_DataType getReference( String s )
  {
    return( (CAN_DataType)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the CAN_DataType with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the CAN_DataType
   * @return a reference to the CAN_DataType specified by the argument
   */
  public static CAN_DataType getReference( int i )
  {
    return( (CAN_DataType)( intHash.get( new Integer( i ) ) ) );
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
  private CAN_DataType( String s )
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
  private CAN_DataType( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this CAN_DataType.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this CAN_DataType.
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
