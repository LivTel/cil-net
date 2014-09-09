package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type NSC_DataType.  These are:
 * <ul>
 * <li>D_NSC_DATAID_BOL</li>
 * <li>OID_START(NSC)</li>
 * <li>D_NSC_PROC_STATE</li>
 * <li>OID_START(NSC)</li>
 * <li>D_NSC_APP_VERSION</li>
 * <li>OID_START(NSC)</li>
 * <li>D_NSC_TOP_LEVEL_STATE</li>
 * <li>OID_START(NSC)</li>
 * <li>D_NSC_NODE_SHUTDOWN_COMMAND</li>
 * <li>OID_START(NSC)</li>
 * <li>D_NSC_ENABLE</li>
 * <li>OID_START(NSC)</li>
 * <li>D_NSC_HOME</li>
 * <li>OID_START(NSC)</li>
 * <li>D_NSC_STOP_DEMAND</li>
 * <li>OID_START(NSC)</li>
 * <li>D_NSC_SAFE_STATE_COMMAND</li>
 * <li>OID_START(NSC)</li>
 * <li>D_NSC_ACTIVATE_COMMAND</li>
 * <li>OID_START(NSC)</li>
 * <li>D_NSC_AXIS_STOPPED</li>
 * <li>OID_START(NSC)</li>
 * <li>D_NSC_HALT_DEMAND</li>
 * <li>OID_START(NSC)</li>
 * <li>D_NSC_USER_REPORTED_STATE</li>
 * <li>D_NSC_HOMED</li>
 * <li>D_NSC_DATAID_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class NSC_DataType
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
  private static final TTL_Package ttlPackage = TTL_Package.NSC;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static NSC_DataType D_NSC_DATAID_BOL =
      new NSC_DataType( "D_NSC_DATAID_BOL", 0, TTL_Package.D_NSC );

  /**
   * D_GSC_DATAID_BOL
   */
  public final static NSC_DataType OID_START(NSC) =
      new NSC_DataType( "OID_START(NSC)", 1, TTL_Package.D_NSC );

  /**
   * 
   */
  public final static NSC_DataType D_NSC_PROC_STATE =
      new NSC_DataType( "D_NSC_PROC_STATE", 2, TTL_Package.D_NSC );

  /**
   * D_GSC_PROC_STATE
   */
  public final static NSC_DataType OID_START(NSC) =
      new NSC_DataType( "OID_START(NSC)", 3, TTL_Package.D_NSC );

  /**
   * 
   */
  public final static NSC_DataType D_NSC_APP_VERSION =
      new NSC_DataType( "D_NSC_APP_VERSION", 4, TTL_Package.D_NSC );

  /**
   * D_GSC_APP_VERSION
   */
  public final static NSC_DataType OID_START(NSC) =
      new NSC_DataType( "OID_START(NSC)", 5, TTL_Package.D_NSC );

  /**
   * 
   */
  public final static NSC_DataType D_NSC_TOP_LEVEL_STATE =
      new NSC_DataType( "D_NSC_TOP_LEVEL_STATE", 6, TTL_Package.D_NSC );

  /**
   * D_GSC_TOP_LEVEL_STATE
   */
  public final static NSC_DataType OID_START(NSC) =
      new NSC_DataType( "OID_START(NSC)", 7, TTL_Package.D_NSC );

  /**
   * 
   */
  public final static NSC_DataType D_NSC_NODE_SHUTDOWN_COMMAND =
      new NSC_DataType( "D_NSC_NODE_SHUTDOWN_COMMAND", 8, TTL_Package.D_NSC );

  /**
   * D_GSC_SHUTDOWN
   */
  public final static NSC_DataType OID_START(NSC) =
      new NSC_DataType( "OID_START(NSC)", 9, TTL_Package.D_NSC );

  /**
   * 
   */
  public final static NSC_DataType D_NSC_ENABLE =
      new NSC_DataType( "D_NSC_ENABLE", 10, TTL_Package.D_NSC );

  /**
   * D_GSC_ENABLE
   */
  public final static NSC_DataType OID_START(NSC) =
      new NSC_DataType( "OID_START(NSC)", 11, TTL_Package.D_NSC );

  /**
   * 
   */
  public final static NSC_DataType D_NSC_HOME =
      new NSC_DataType( "D_NSC_HOME", 12, TTL_Package.D_NSC );

  /**
   * D_GSC_HOME
   */
  public final static NSC_DataType OID_START(NSC) =
      new NSC_DataType( "OID_START(NSC)", 13, TTL_Package.D_NSC );

  /**
   * 
   */
  public final static NSC_DataType D_NSC_STOP_DEMAND =
      new NSC_DataType( "D_NSC_STOP_DEMAND", 14, TTL_Package.D_NSC );

  /**
   * D_GSC_STOP_DEMAND
   */
  public final static NSC_DataType OID_START(NSC) =
      new NSC_DataType( "OID_START(NSC)", 15, TTL_Package.D_NSC );

  /**
   * 
   */
  public final static NSC_DataType D_NSC_SAFE_STATE_COMMAND =
      new NSC_DataType( "D_NSC_SAFE_STATE_COMMAND", 16, TTL_Package.D_NSC );

  /**
   * D_GSC_SAFE_STATE_COMMAND
   */
  public final static NSC_DataType OID_START(NSC) =
      new NSC_DataType( "OID_START(NSC)", 17, TTL_Package.D_NSC );

  /**
   * 
   */
  public final static NSC_DataType D_NSC_ACTIVATE_COMMAND =
      new NSC_DataType( "D_NSC_ACTIVATE_COMMAND", 18, TTL_Package.D_NSC );

  /**
   * D_GSC_ACTIVATE_COMMAND
   */
  public final static NSC_DataType OID_START(NSC) =
      new NSC_DataType( "OID_START(NSC)", 19, TTL_Package.D_NSC );

  /**
   * 
   */
  public final static NSC_DataType D_NSC_AXIS_STOPPED =
      new NSC_DataType( "D_NSC_AXIS_STOPPED", 20, TTL_Package.D_NSC );

  /**
   * D_GSC_AXIS_STOPPED
   */
  public final static NSC_DataType OID_START(NSC) =
      new NSC_DataType( "OID_START(NSC)", 21, TTL_Package.D_NSC );

  /**
   * 
   */
  public final static NSC_DataType D_NSC_HALT_DEMAND =
      new NSC_DataType( "D_NSC_HALT_DEMAND", 22, TTL_Package.D_NSC );

  /**
   * D_GSC_HALT_DEMAND
   */
  public final static NSC_DataType OID_START(NSC) =
      new NSC_DataType( "OID_START(NSC)", 23, TTL_Package.D_NSC );

  /**
   * State of axis reported to user
   */
  public final static NSC_DataType D_NSC_USER_REPORTED_STATE =
      new NSC_DataType( "D_NSC_USER_REPORTED_STATE", 24, TTL_Package.D_NSC );

  /**
   * Flag indicating homed status
   */
  public final static NSC_DataType D_NSC_HOMED =
      new NSC_DataType( "D_NSC_HOMED", 25, TTL_Package.D_NSC );

  /**
   * 
   */
  public final static NSC_DataType D_NSC_DATAID_EOL =
      new NSC_DataType( "D_NSC_DATAID_EOL", 26, TTL_Package.D_NSC );

  /**
   * Array allowing serialization.
   */
  protected static final NSC_DataType[] array =
  {
    D_NSC_DATAID_BOL,
    OID_START(NSC),
    D_NSC_PROC_STATE,
    OID_START(NSC),
    D_NSC_APP_VERSION,
    OID_START(NSC),
    D_NSC_TOP_LEVEL_STATE,
    OID_START(NSC),
    D_NSC_NODE_SHUTDOWN_COMMAND,
    OID_START(NSC),
    D_NSC_ENABLE,
    OID_START(NSC),
    D_NSC_HOME,
    OID_START(NSC),
    D_NSC_STOP_DEMAND,
    OID_START(NSC),
    D_NSC_SAFE_STATE_COMMAND,
    OID_START(NSC),
    D_NSC_ACTIVATE_COMMAND,
    OID_START(NSC),
    D_NSC_AXIS_STOPPED,
    OID_START(NSC),
    D_NSC_HALT_DEMAND,
    OID_START(NSC),
    D_NSC_USER_REPORTED_STATE,
    D_NSC_HOMED,
    D_NSC_DATAID_EOL
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
   * Return an object reference of the NSC_DataType with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the NSC_DataType
   * @return a reference to the NSC_DataType specified by the argument
   */
  public static NSC_DataType getReference( String s )
  {
    return( (NSC_DataType)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the NSC_DataType with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the NSC_DataType
   * @return a reference to the NSC_DataType specified by the argument
   */
  public static NSC_DataType getReference( int i )
  {
    return( (NSC_DataType)( intHash.get( new Integer( i ) ) ) );
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
  private NSC_DataType( String s )
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
  private NSC_DataType( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this NSC_DataType.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this NSC_DataType.
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
