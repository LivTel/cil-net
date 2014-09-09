package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type AMT_Status.  These are:
 * <ul>
 * <li>E_AMT_EXIT_CODE_0</li>
 * <li>E_AMT_EXIT_CODE_1</li>
 * <li>E_AMT_EXIT_CODE_2</li>
 * <li>E_AMT_EXIT_CODE_3</li>
 * <li>E_AMT_EXIT_CODE_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class AMT_Status
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
  private static final TTL_Package ttlPackage = TTL_Package.AMT;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static AMT_Status E_AMT_EXIT_CODE_0 =
      new AMT_Status( "E_AMT_EXIT_CODE_0", 0, TTL_Package.E_AMT );

  /**
   * 
   */
  public final static AMT_Status E_AMT_EXIT_CODE_1 =
      new AMT_Status( "E_AMT_EXIT_CODE_1", 1, TTL_Package.E_AMT );

  /**
   * 
   */
  public final static AMT_Status E_AMT_EXIT_CODE_2 =
      new AMT_Status( "E_AMT_EXIT_CODE_2", 2, TTL_Package.E_AMT );

  /**
   * 
   */
  public final static AMT_Status E_AMT_EXIT_CODE_3 =
      new AMT_Status( "E_AMT_EXIT_CODE_3", 3, TTL_Package.E_AMT );

  /**
   * 
   */
  public final static AMT_Status E_AMT_EXIT_CODE_EOL =
      new AMT_Status( "E_AMT_EXIT_CODE_EOL", 4, TTL_Package.E_AMT );

  /**
   * Array allowing serialization.
   */
  protected static final AMT_Status[] array =
  {
    E_AMT_EXIT_CODE_0,
    E_AMT_EXIT_CODE_1,
    E_AMT_EXIT_CODE_2,
    E_AMT_EXIT_CODE_3,
    E_AMT_EXIT_CODE_EOL
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
   * Return an object reference of the AMT_Status with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the AMT_Status
   * @return a reference to the AMT_Status specified by the argument
   */
  public static AMT_Status getReference( String s )
  {
    return( (AMT_Status)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the AMT_Status with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the AMT_Status
   * @return a reference to the AMT_Status specified by the argument
   */
  public static AMT_Status getReference( int i )
  {
    return( (AMT_Status)( intHash.get( new Integer( i ) ) ) );
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
  private AMT_Status( String s )
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
  private AMT_Status( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this AMT_Status.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this AMT_Status.
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
