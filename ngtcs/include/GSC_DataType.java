package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type GSC_DataType.  These are:
 * <ul>
 * <li>D_GSC_DATAID_BOL</li>
 * <li>D_GSC_PROC_STATE</li>
 * <li>D_GSC_APP_VERSION</li>
 * <li>D_GSC_TOP_LEVEL_STATE</li>
 * <li>D_GSC_SHUTDOWN</li>
 * <li>D_GSC_ENABLE</li>
 * <li>D_GSC_HOME</li>
 * <li>D_GSC_STOP_DEMAND</li>
 * <li>D_GSC_SAFE_STATE_COMMAND</li>
 * <li>D_GSC_ACTIVATE_COMMAND</li>
 * <li>D_GSC_AXIS_STOPPED</li>
 * <li>D_GSC_HALT_DEMAND</li>
 * <li>D_GSC_DATAID_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class GSC_DataType
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
  private static final TTL_Package ttlPackage = TTL_Package.GSC;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static GSC_DataType D_GSC_DATAID_BOL =
      new GSC_DataType( "D_GSC_DATAID_BOL", 0, TTL_Package.D_GSC );

  /**
   * 
   */
  public final static GSC_DataType D_GSC_PROC_STATE =
      new GSC_DataType( "D_GSC_PROC_STATE", 1, TTL_Package.D_GSC );

  /**
   * Package revision
   */
  public final static GSC_DataType D_GSC_APP_VERSION =
      new GSC_DataType( "D_GSC_APP_VERSION", 2, TTL_Package.D_GSC );

  /**
   * The top level state
   */
  public final static GSC_DataType D_GSC_TOP_LEVEL_STATE =
      new GSC_DataType( "D_GSC_TOP_LEVEL_STATE", 3, TTL_Package.D_GSC );

  /**
   * Node shutdown flag
   */
  public final static GSC_DataType D_GSC_SHUTDOWN =
      new GSC_DataType( "D_GSC_SHUTDOWN", 4, TTL_Package.D_GSC );

  /**
   * Node enable flag
   */
  public final static GSC_DataType D_GSC_ENABLE =
      new GSC_DataType( "D_GSC_ENABLE", 5, TTL_Package.D_GSC );

  /**
   * Node home flag
   */
  public final static GSC_DataType D_GSC_HOME =
      new GSC_DataType( "D_GSC_HOME", 6, TTL_Package.D_GSC );

  /**
   * Node stop demand
   */
  public final static GSC_DataType D_GSC_STOP_DEMAND =
      new GSC_DataType( "D_GSC_STOP_DEMAND", 7, TTL_Package.D_GSC );

  /**
   * Node safe state command flag
   */
  public final static GSC_DataType D_GSC_SAFE_STATE_COMMAND =
      new GSC_DataType( "D_GSC_SAFE_STATE_COMMAND", 8, TTL_Package.D_GSC );

  /**
   * Node activate command flag
   */
  public final static GSC_DataType D_GSC_ACTIVATE_COMMAND =
      new GSC_DataType( "D_GSC_ACTIVATE_COMMAND", 9, TTL_Package.D_GSC );

  /**
   * Axis stopped status
   */
  public final static GSC_DataType D_GSC_AXIS_STOPPED =
      new GSC_DataType( "D_GSC_AXIS_STOPPED", 10, TTL_Package.D_GSC );

  /**
   * Node halt demand
   */
  public final static GSC_DataType D_GSC_HALT_DEMAND =
      new GSC_DataType( "D_GSC_HALT_DEMAND", 11, TTL_Package.D_GSC );

  /**
   * 
   */
  public final static GSC_DataType D_GSC_DATAID_EOL =
      new GSC_DataType( "D_GSC_DATAID_EOL", 12, TTL_Package.D_GSC );

  /**
   * Array allowing serialization.
   */
  protected static final GSC_DataType[] array =
  {
    D_GSC_DATAID_BOL,
    D_GSC_PROC_STATE,
    D_GSC_APP_VERSION,
    D_GSC_TOP_LEVEL_STATE,
    D_GSC_SHUTDOWN,
    D_GSC_ENABLE,
    D_GSC_HOME,
    D_GSC_STOP_DEMAND,
    D_GSC_SAFE_STATE_COMMAND,
    D_GSC_ACTIVATE_COMMAND,
    D_GSC_AXIS_STOPPED,
    D_GSC_HALT_DEMAND,
    D_GSC_DATAID_EOL
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
   * Return an object reference of the GSC_DataType with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the GSC_DataType
   * @return a reference to the GSC_DataType specified by the argument
   */
  public static GSC_DataType getReference( String s )
  {
    return( (GSC_DataType)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the GSC_DataType with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the GSC_DataType
   * @return a reference to the GSC_DataType specified by the argument
   */
  public static GSC_DataType getReference( int i )
  {
    return( (GSC_DataType)( intHash.get( new Integer( i ) ) ) );
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
  private GSC_DataType( String s )
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
  private GSC_DataType( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this GSC_DataType.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this GSC_DataType.
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
