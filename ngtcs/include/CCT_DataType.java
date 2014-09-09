package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type CCT_DataType.  These are:
 * <ul>
 * <li>D_CCT_DATAID_BOL</li>
 * <li>D_CCT_PROC_STATE</li>
 * <li>D_CCT_AUTH_STATE</li>
 * <li>D_CCT_SYS_REQUEST</li>
 * <li>D_CCT_APP_VERSION</li>
 * <li>D_CCT_QRY_OS_AVAILABLE</li>
 * <li>D_CCT_QRY_APP_PREPARED</li>
 * <li>D_CCT_QRY_APP_RUNNING</li>
 * <li>D_CCT_DMD_APP_START</li>
 * <li>D_CCT_DMD_APP_KILL</li>
 * <li>D_CCT_DMD_OS_RESTART</li>
 * <li>D_CCT_DMD_OS_CLOSE</li>
 * <li>D_CCT_DATAID_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class CCT_DataType
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
  private static final TTL_Package ttlPackage = TTL_Package.CCT;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static CCT_DataType D_CCT_DATAID_BOL =
      new CCT_DataType( "D_CCT_DATAID_BOL", 0, TTL_Package.D_CCT );

  /**
   * 
   */
  public final static CCT_DataType D_CCT_PROC_STATE =
      new CCT_DataType( "D_CCT_PROC_STATE", 1, TTL_Package.D_CCT );

  /**
   * 
   */
  public final static CCT_DataType D_CCT_AUTH_STATE =
      new CCT_DataType( "D_CCT_AUTH_STATE", 2, TTL_Package.D_CCT );

  /**
   * 
   */
  public final static CCT_DataType D_CCT_SYS_REQUEST =
      new CCT_DataType( "D_CCT_SYS_REQUEST", 3, TTL_Package.D_CCT );

  /**
   * 
   */
  public final static CCT_DataType D_CCT_APP_VERSION =
      new CCT_DataType( "D_CCT_APP_VERSION", 4, TTL_Package.D_CCT );

  /**
   * 
   */
  public final static CCT_DataType D_CCT_QRY_OS_AVAILABLE =
      new CCT_DataType( "D_CCT_QRY_OS_AVAILABLE", 5, TTL_Package.D_CCT );

  /**
   * Computer ready for application
   */
  public final static CCT_DataType D_CCT_QRY_APP_PREPARED =
      new CCT_DataType( "D_CCT_QRY_APP_PREPARED", 6, TTL_Package.D_CCT );

  /**
   * Application is running
   */
  public final static CCT_DataType D_CCT_QRY_APP_RUNNING =
      new CCT_DataType( "D_CCT_QRY_APP_RUNNING", 7, TTL_Package.D_CCT );

  /**
   * Demand application start
   */
  public final static CCT_DataType D_CCT_DMD_APP_START =
      new CCT_DataType( "D_CCT_DMD_APP_START", 8, TTL_Package.D_CCT );

  /**
   * Demand OS kill of application
   */
  public final static CCT_DataType D_CCT_DMD_APP_KILL =
      new CCT_DataType( "D_CCT_DMD_APP_KILL", 9, TTL_Package.D_CCT );

  /**
   * Demand closedown of OS with restart
   */
  public final static CCT_DataType D_CCT_DMD_OS_RESTART =
      new CCT_DataType( "D_CCT_DMD_OS_RESTART", 10, TTL_Package.D_CCT );

  /**
   * Demand closedown of OS no restart
   */
  public final static CCT_DataType D_CCT_DMD_OS_CLOSE =
      new CCT_DataType( "D_CCT_DMD_OS_CLOSE", 11, TTL_Package.D_CCT );

  /**
   * 
   */
  public final static CCT_DataType D_CCT_DATAID_EOL =
      new CCT_DataType( "D_CCT_DATAID_EOL", 12, TTL_Package.D_CCT );

  /**
   * Array allowing serialization.
   */
  protected static final CCT_DataType[] array =
  {
    D_CCT_DATAID_BOL,
    D_CCT_PROC_STATE,
    D_CCT_AUTH_STATE,
    D_CCT_SYS_REQUEST,
    D_CCT_APP_VERSION,
    D_CCT_QRY_OS_AVAILABLE,
    D_CCT_QRY_APP_PREPARED,
    D_CCT_QRY_APP_RUNNING,
    D_CCT_DMD_APP_START,
    D_CCT_DMD_APP_KILL,
    D_CCT_DMD_OS_RESTART,
    D_CCT_DMD_OS_CLOSE,
    D_CCT_DATAID_EOL
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
   * Return an object reference of the CCT_DataType with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the CCT_DataType
   * @return a reference to the CCT_DataType specified by the argument
   */
  public static CCT_DataType getReference( String s )
  {
    return( (CCT_DataType)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the CCT_DataType with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the CCT_DataType
   * @return a reference to the CCT_DataType specified by the argument
   */
  public static CCT_DataType getReference( int i )
  {
    return( (CCT_DataType)( intHash.get( new Integer( i ) ) ) );
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
  private CCT_DataType( String s )
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
  private CCT_DataType( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this CCT_DataType.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this CCT_DataType.
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
