package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type AMS_DataType.  These are:
 * <ul>
 * <li>D_AMS_DATAID_BOL</li>
 * <li>OID_START(AMS)</li>
 * <li>D_AMS_PROC_STATE</li>
 * <li>OID_START(AMS)</li>
 * <li>D_AMS_APP_VERSION</li>
 * <li>OID_START(AMS)</li>
 * <li>D_AMS_STATE</li>
 * <li>OID_START(AMS)</li>
 * <li>D_AMS_SHUTDOWN</li>
 * <li>OID_START(AMS)</li>
 * <li>D_AMS_ENABLE</li>
 * <li>OID_START(AMS)</li>
 * <li>D_AMS_HOME</li>
 * <li>OID_START(AMS)</li>
 * <li>D_AMS_STOP_DEMAND</li>
 * <li>OID_START(AMS)</li>
 * <li>D_AMS_SAFE_STATE</li>
 * <li>OID_START(AMS)</li>
 * <li>D_AMS_ACTIVATE</li>
 * <li>OID_START(AMS)</li>
 * <li>D_AMS_STOPPED_STATUS</li>
 * <li>OID_START(AMS)</li>
 * <li>D_AMS_HALT_DEMAND</li>
 * <li>OID_START(AMS)</li>
 * <li>D_AMS_DATAID_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class AMS_DataType
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
  private static final TTL_Package ttlPackage = TTL_Package.AMS;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static AMS_DataType D_AMS_DATAID_BOL =
      new AMS_DataType( "D_AMS_DATAID_BOL", 0, TTL_Package.D_AMS );

  /**
   * D_GSC_DATAID_BOL
   */
  public final static AMS_DataType OID_START(AMS) =
      new AMS_DataType( "OID_START(AMS)", 1, TTL_Package.D_AMS );

  /**
   * 
   */
  public final static AMS_DataType D_AMS_PROC_STATE =
      new AMS_DataType( "D_AMS_PROC_STATE", 2, TTL_Package.D_AMS );

  /**
   * D_GSC_PROC_STATE
   */
  public final static AMS_DataType OID_START(AMS) =
      new AMS_DataType( "OID_START(AMS)", 3, TTL_Package.D_AMS );

  /**
   * 
   */
  public final static AMS_DataType D_AMS_APP_VERSION =
      new AMS_DataType( "D_AMS_APP_VERSION", 4, TTL_Package.D_AMS );

  /**
   * D_GSC_APP_VERSION
   */
  public final static AMS_DataType OID_START(AMS) =
      new AMS_DataType( "OID_START(AMS)", 5, TTL_Package.D_AMS );

  /**
   * 
   */
  public final static AMS_DataType D_AMS_STATE =
      new AMS_DataType( "D_AMS_STATE", 6, TTL_Package.D_AMS );

  /**
   * D_GSC_TOP_LEVEL_STATE
   */
  public final static AMS_DataType OID_START(AMS) =
      new AMS_DataType( "OID_START(AMS)", 7, TTL_Package.D_AMS );

  /**
   * 
   */
  public final static AMS_DataType D_AMS_SHUTDOWN =
      new AMS_DataType( "D_AMS_SHUTDOWN", 8, TTL_Package.D_AMS );

  /**
   * D_GSC_SHUTDOWN
   */
  public final static AMS_DataType OID_START(AMS) =
      new AMS_DataType( "OID_START(AMS)", 9, TTL_Package.D_AMS );

  /**
   * 
   */
  public final static AMS_DataType D_AMS_ENABLE =
      new AMS_DataType( "D_AMS_ENABLE", 10, TTL_Package.D_AMS );

  /**
   * D_GSC_ENABLE
   */
  public final static AMS_DataType OID_START(AMS) =
      new AMS_DataType( "OID_START(AMS)", 11, TTL_Package.D_AMS );

  /**
   * 
   */
  public final static AMS_DataType D_AMS_HOME =
      new AMS_DataType( "D_AMS_HOME", 12, TTL_Package.D_AMS );

  /**
   * D_GSC_HOME
   */
  public final static AMS_DataType OID_START(AMS) =
      new AMS_DataType( "OID_START(AMS)", 13, TTL_Package.D_AMS );

  /**
   * 
   */
  public final static AMS_DataType D_AMS_STOP_DEMAND =
      new AMS_DataType( "D_AMS_STOP_DEMAND", 14, TTL_Package.D_AMS );

  /**
   * D_GSC_STOP_DEMAND
   */
  public final static AMS_DataType OID_START(AMS) =
      new AMS_DataType( "OID_START(AMS)", 15, TTL_Package.D_AMS );

  /**
   * 
   */
  public final static AMS_DataType D_AMS_SAFE_STATE =
      new AMS_DataType( "D_AMS_SAFE_STATE", 16, TTL_Package.D_AMS );

  /**
   * D_GSC_SAFE_STATE_COMMAND
   */
  public final static AMS_DataType OID_START(AMS) =
      new AMS_DataType( "OID_START(AMS)", 17, TTL_Package.D_AMS );

  /**
   * 
   */
  public final static AMS_DataType D_AMS_ACTIVATE =
      new AMS_DataType( "D_AMS_ACTIVATE", 18, TTL_Package.D_AMS );

  /**
   * D_GSC_ACTIVATE_COMMAND
   */
  public final static AMS_DataType OID_START(AMS) =
      new AMS_DataType( "OID_START(AMS)", 19, TTL_Package.D_AMS );

  /**
   * 
   */
  public final static AMS_DataType D_AMS_STOPPED_STATUS =
      new AMS_DataType( "D_AMS_STOPPED_STATUS", 20, TTL_Package.D_AMS );

  /**
   * D_GSC_AXIS_STOPPED
   */
  public final static AMS_DataType OID_START(AMS) =
      new AMS_DataType( "OID_START(AMS)", 21, TTL_Package.D_AMS );

  /**
   * 
   */
  public final static AMS_DataType D_AMS_HALT_DEMAND =
      new AMS_DataType( "D_AMS_HALT_DEMAND", 22, TTL_Package.D_AMS );

  /**
   * D_GSC_HALT_DEMAND
   */
  public final static AMS_DataType OID_START(AMS) =
      new AMS_DataType( "OID_START(AMS)", 23, TTL_Package.D_AMS );

  /**
   * 
   */
  public final static AMS_DataType D_AMS_DATAID_EOL =
      new AMS_DataType( "D_AMS_DATAID_EOL", 24, TTL_Package.D_AMS );

  /**
   * Array allowing serialization.
   */
  protected static final AMS_DataType[] array =
  {
    D_AMS_DATAID_BOL,
    OID_START(AMS),
    D_AMS_PROC_STATE,
    OID_START(AMS),
    D_AMS_APP_VERSION,
    OID_START(AMS),
    D_AMS_STATE,
    OID_START(AMS),
    D_AMS_SHUTDOWN,
    OID_START(AMS),
    D_AMS_ENABLE,
    OID_START(AMS),
    D_AMS_HOME,
    OID_START(AMS),
    D_AMS_STOP_DEMAND,
    OID_START(AMS),
    D_AMS_SAFE_STATE,
    OID_START(AMS),
    D_AMS_ACTIVATE,
    OID_START(AMS),
    D_AMS_STOPPED_STATUS,
    OID_START(AMS),
    D_AMS_HALT_DEMAND,
    OID_START(AMS),
    D_AMS_DATAID_EOL
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
   * Return an object reference of the AMS_DataType with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the AMS_DataType
   * @return a reference to the AMS_DataType specified by the argument
   */
  public static AMS_DataType getReference( String s )
  {
    return( (AMS_DataType)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the AMS_DataType with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the AMS_DataType
   * @return a reference to the AMS_DataType specified by the argument
   */
  public static AMS_DataType getReference( int i )
  {
    return( (AMS_DataType)( intHash.get( new Integer( i ) ) ) );
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
  private AMS_DataType( String s )
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
  private AMS_DataType( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this AMS_DataType.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this AMS_DataType.
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
