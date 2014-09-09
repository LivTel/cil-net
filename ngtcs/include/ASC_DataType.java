package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type ASC_DataType.  These are:
 * <ul>
 * <li>D_ASC_DATAID_BOL</li>
 * <li>D_ASC_PROC_STATE</li>
 * <li>D_ASC_APP_VERSION</li>
 * <li>D_ASC_SERVER_SHUTDOWN</li>
 * <li>D_ASC_STOP_ENABLE</li>
 * <li>D_ASC_AXIS_STOPPED_MOVING</li>
 * <li>D_ASC_AXIS_STOP_FAILURE</li>
 * <li>D_ASC_DATAID_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class ASC_DataType
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
  private static final TTL_Package ttlPackage = TTL_Package.ASC;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static ASC_DataType D_ASC_DATAID_BOL =
      new ASC_DataType( "D_ASC_DATAID_BOL", 0, TTL_Package.D_ASC );

  /**
   * The ASC process state.
   */
  public final static ASC_DataType D_ASC_PROC_STATE =
      new ASC_DataType( "D_ASC_PROC_STATE", 1, TTL_Package.D_ASC );

  /**
   * ASC package revision.
   */
  public final static ASC_DataType D_ASC_APP_VERSION =
      new ASC_DataType( "D_ASC_APP_VERSION", 2, TTL_Package.D_ASC );

  /**
   * Server shutdown command flag.
   */
  public final static ASC_DataType D_ASC_SERVER_SHUTDOWN =
      new ASC_DataType( "D_ASC_SERVER_SHUTDOWN", 3, TTL_Package.D_ASC );

  /**
   * The Enable the stop function.
   */
  public final static ASC_DataType D_ASC_STOP_ENABLE =
      new ASC_DataType( "D_ASC_STOP_ENABLE", 4, TTL_Package.D_ASC );

  /**
   * The axis has stopped moving.
   */
  public final static ASC_DataType D_ASC_AXIS_STOPPED_MOVING =
      new ASC_DataType( "D_ASC_AXIS_STOPPED_MOVING", 5, TTL_Package.D_ASC );

  /**
   * Failed to stop the axis moving.
   */
  public final static ASC_DataType D_ASC_AXIS_STOP_FAILURE =
      new ASC_DataType( "D_ASC_AXIS_STOP_FAILURE", 6, TTL_Package.D_ASC );

  /**
   * 
   */
  public final static ASC_DataType D_ASC_DATAID_EOL =
      new ASC_DataType( "D_ASC_DATAID_EOL", 7, TTL_Package.D_ASC );

  /**
   * Array allowing serialization.
   */
  protected static final ASC_DataType[] array =
  {
    D_ASC_DATAID_BOL,
    D_ASC_PROC_STATE,
    D_ASC_APP_VERSION,
    D_ASC_SERVER_SHUTDOWN,
    D_ASC_STOP_ENABLE,
    D_ASC_AXIS_STOPPED_MOVING,
    D_ASC_AXIS_STOP_FAILURE,
    D_ASC_DATAID_EOL
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
   * Return an object reference of the ASC_DataType with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the ASC_DataType
   * @return a reference to the ASC_DataType specified by the argument
   */
  public static ASC_DataType getReference( String s )
  {
    return( (ASC_DataType)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the ASC_DataType with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the ASC_DataType
   * @return a reference to the ASC_DataType specified by the argument
   */
  public static ASC_DataType getReference( int i )
  {
    return( (ASC_DataType)( intHash.get( new Integer( i ) ) ) );
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
  private ASC_DataType( String s )
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
  private ASC_DataType( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this ASC_DataType.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this ASC_DataType.
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
