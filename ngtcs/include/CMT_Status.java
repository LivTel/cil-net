package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type CMT_Status.  These are:
 * <ul>
 * <li>E_CMT_ERR_GEN</li>
 * <li>E_CMT_ERR_SETUP</li>
 * <li>E_CMT_ERR_HEARTBEATS</li>
 * <li>E_CMT_ERR_CIL_RX</li>
 * <li>E_CMT_ERR_SDB_SUBMIT</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class CMT_Status
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
  private static final TTL_Package ttlPackage = TTL_Package.CMT;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static CMT_Status E_CMT_ERR_GEN =
      new CMT_Status( "E_CMT_ERR_GEN", 0, TTL_Package.E_CMT );

  /**
   * Error performing setup
   */
  public final static CMT_Status E_CMT_ERR_SETUP =
      new CMT_Status( "E_CMT_ERR_SETUP", 1, TTL_Package.E_CMT );

  /**
   * Heartbeats lost
   */
  public final static CMT_Status E_CMT_ERR_HEARTBEATS =
      new CMT_Status( "E_CMT_ERR_HEARTBEATS", 2, TTL_Package.E_CMT );

  /**
   * Unexpected CIL message received
   */
  public final static CMT_Status E_CMT_ERR_CIL_RX =
      new CMT_Status( "E_CMT_ERR_CIL_RX", 3, TTL_Package.E_CMT );

  /**
   * 
   */
  public final static CMT_Status E_CMT_ERR_SDB_SUBMIT =
      new CMT_Status( "E_CMT_ERR_SDB_SUBMIT", 4, TTL_Package.E_CMT );

  /**
   * Array allowing serialization.
   */
  protected static final CMT_Status[] array =
  {
    E_CMT_ERR_GEN,
    E_CMT_ERR_SETUP,
    E_CMT_ERR_HEARTBEATS,
    E_CMT_ERR_CIL_RX,
    E_CMT_ERR_SDB_SUBMIT
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
   * Return an object reference of the CMT_Status with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the CMT_Status
   * @return a reference to the CMT_Status specified by the argument
   */
  public static CMT_Status getReference( String s )
  {
    return( (CMT_Status)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the CMT_Status with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the CMT_Status
   * @return a reference to the CMT_Status specified by the argument
   */
  public static CMT_Status getReference( int i )
  {
    return( (CMT_Status)( intHash.get( new Integer( i ) ) ) );
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
  private CMT_Status( String s )
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
  private CMT_Status( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this CMT_Status.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this CMT_Status.
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
