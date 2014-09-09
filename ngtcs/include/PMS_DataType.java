package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type PMS_DataType.  These are:
 * <ul>
 * <li>D_PMS_DATAID_BOL</li>
 * <li>OID_START(PMS)</li>
 * <li>D_PMS_PROC_STATE</li>
 * <li>OID_START(PMS)</li>
 * <li>D_PMS_APP_VERSION</li>
 * <li>OID_START(PMS)</li>
 * <li>D_PMS_STATE</li>
 * <li>OID_START(PMS)</li>
 * <li>D_PMS_SHUTDOWN</li>
 * <li>OID_START(PMS)</li>
 * <li>D_PMS_ENABLE</li>
 * <li>OID_START(PMS)</li>
 * <li>D_PMS_HOME</li>
 * <li>OID_START(PMS)</li>
 * <li>D_PMS_STOP_DEMAND</li>
 * <li>OID_START(PMS)</li>
 * <li>D_PMS_SAFE_STATE</li>
 * <li>OID_START(PMS)</li>
 * <li>D_PMS_ACTIVATE</li>
 * <li>OID_START(PMS)</li>
 * <li>D_PMS_STOPPED_STATUS</li>
 * <li>OID_START(PMS)</li>
 * <li>D_PMS_HALT_DEMAND</li>
 * <li>OID_START(PMS)</li>
 * <li>D_PMS_DATAID_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class PMS_DataType
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
  private static final TTL_Package ttlPackage = TTL_Package.PMS;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static PMS_DataType D_PMS_DATAID_BOL =
      new PMS_DataType( "D_PMS_DATAID_BOL", 0, TTL_Package.D_PMS );

  /**
   * D_GSC_DATAID_BOL
   */
  public final static PMS_DataType OID_START(PMS) =
      new PMS_DataType( "OID_START(PMS)", 1, TTL_Package.D_PMS );

  /**
   * 
   */
  public final static PMS_DataType D_PMS_PROC_STATE =
      new PMS_DataType( "D_PMS_PROC_STATE", 2, TTL_Package.D_PMS );

  /**
   * D_GSC_PROC_STATE
   */
  public final static PMS_DataType OID_START(PMS) =
      new PMS_DataType( "OID_START(PMS)", 3, TTL_Package.D_PMS );

  /**
   * 
   */
  public final static PMS_DataType D_PMS_APP_VERSION =
      new PMS_DataType( "D_PMS_APP_VERSION", 4, TTL_Package.D_PMS );

  /**
   * D_GSC_APP_VERSION
   */
  public final static PMS_DataType OID_START(PMS) =
      new PMS_DataType( "OID_START(PMS)", 5, TTL_Package.D_PMS );

  /**
   * 
   */
  public final static PMS_DataType D_PMS_STATE =
      new PMS_DataType( "D_PMS_STATE", 6, TTL_Package.D_PMS );

  /**
   * D_GSC_TOP_LEVEL_STATE
   */
  public final static PMS_DataType OID_START(PMS) =
      new PMS_DataType( "OID_START(PMS)", 7, TTL_Package.D_PMS );

  /**
   * 
   */
  public final static PMS_DataType D_PMS_SHUTDOWN =
      new PMS_DataType( "D_PMS_SHUTDOWN", 8, TTL_Package.D_PMS );

  /**
   * D_GSC_SHUTDOWN
   */
  public final static PMS_DataType OID_START(PMS) =
      new PMS_DataType( "OID_START(PMS)", 9, TTL_Package.D_PMS );

  /**
   * 
   */
  public final static PMS_DataType D_PMS_ENABLE =
      new PMS_DataType( "D_PMS_ENABLE", 10, TTL_Package.D_PMS );

  /**
   * D_GSC_ENABLE
   */
  public final static PMS_DataType OID_START(PMS) =
      new PMS_DataType( "OID_START(PMS)", 11, TTL_Package.D_PMS );

  /**
   * 
   */
  public final static PMS_DataType D_PMS_HOME =
      new PMS_DataType( "D_PMS_HOME", 12, TTL_Package.D_PMS );

  /**
   * D_GSC_HOME
   */
  public final static PMS_DataType OID_START(PMS) =
      new PMS_DataType( "OID_START(PMS)", 13, TTL_Package.D_PMS );

  /**
   * 
   */
  public final static PMS_DataType D_PMS_STOP_DEMAND =
      new PMS_DataType( "D_PMS_STOP_DEMAND", 14, TTL_Package.D_PMS );

  /**
   * D_GSC_STOP_DEMAND
   */
  public final static PMS_DataType OID_START(PMS) =
      new PMS_DataType( "OID_START(PMS)", 15, TTL_Package.D_PMS );

  /**
   * 
   */
  public final static PMS_DataType D_PMS_SAFE_STATE =
      new PMS_DataType( "D_PMS_SAFE_STATE", 16, TTL_Package.D_PMS );

  /**
   * D_GSC_SAFE_STATE_COMMAND
   */
  public final static PMS_DataType OID_START(PMS) =
      new PMS_DataType( "OID_START(PMS)", 17, TTL_Package.D_PMS );

  /**
   * 
   */
  public final static PMS_DataType D_PMS_ACTIVATE =
      new PMS_DataType( "D_PMS_ACTIVATE", 18, TTL_Package.D_PMS );

  /**
   * D_GSC_ACTIVATE_COMMAND
   */
  public final static PMS_DataType OID_START(PMS) =
      new PMS_DataType( "OID_START(PMS)", 19, TTL_Package.D_PMS );

  /**
   * 
   */
  public final static PMS_DataType D_PMS_STOPPED_STATUS =
      new PMS_DataType( "D_PMS_STOPPED_STATUS", 20, TTL_Package.D_PMS );

  /**
   * D_GSC_AXIS_STOPPED
   */
  public final static PMS_DataType OID_START(PMS) =
      new PMS_DataType( "OID_START(PMS)", 21, TTL_Package.D_PMS );

  /**
   * 
   */
  public final static PMS_DataType D_PMS_HALT_DEMAND =
      new PMS_DataType( "D_PMS_HALT_DEMAND", 22, TTL_Package.D_PMS );

  /**
   * D_GSC_HALT_DEMAND
   */
  public final static PMS_DataType OID_START(PMS) =
      new PMS_DataType( "OID_START(PMS)", 23, TTL_Package.D_PMS );

  /**
   * 
   */
  public final static PMS_DataType D_PMS_DATAID_EOL =
      new PMS_DataType( "D_PMS_DATAID_EOL", 24, TTL_Package.D_PMS );

  /**
   * Array allowing serialization.
   */
  protected static final PMS_DataType[] array =
  {
    D_PMS_DATAID_BOL,
    OID_START(PMS),
    D_PMS_PROC_STATE,
    OID_START(PMS),
    D_PMS_APP_VERSION,
    OID_START(PMS),
    D_PMS_STATE,
    OID_START(PMS),
    D_PMS_SHUTDOWN,
    OID_START(PMS),
    D_PMS_ENABLE,
    OID_START(PMS),
    D_PMS_HOME,
    OID_START(PMS),
    D_PMS_STOP_DEMAND,
    OID_START(PMS),
    D_PMS_SAFE_STATE,
    OID_START(PMS),
    D_PMS_ACTIVATE,
    OID_START(PMS),
    D_PMS_STOPPED_STATUS,
    OID_START(PMS),
    D_PMS_HALT_DEMAND,
    OID_START(PMS),
    D_PMS_DATAID_EOL
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
   * Return an object reference of the PMS_DataType with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the PMS_DataType
   * @return a reference to the PMS_DataType specified by the argument
   */
  public static PMS_DataType getReference( String s )
  {
    return( (PMS_DataType)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the PMS_DataType with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the PMS_DataType
   * @return a reference to the PMS_DataType specified by the argument
   */
  public static PMS_DataType getReference( int i )
  {
    return( (PMS_DataType)( intHash.get( new Integer( i ) ) ) );
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
  private PMS_DataType( String s )
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
  private PMS_DataType( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this PMS_DataType.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this PMS_DataType.
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
