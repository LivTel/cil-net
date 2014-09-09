package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type MCB_DataType.  These are:
 * <ul>
 * <li>D_MCB_DATAID_BOL</li>
 * <li>D_MCB_PROC_STATE</li>
 * <li>D_MCB_AUTH_STATE</li>
 * <li>D_MCB_SYS_REQUEST</li>
 * <li>D_MCB_APP_VERSION</li>
 * <li>D_MCB_AUTH_LEVEL</li>
 * <li>D_MCB_QTY_ROUTED</li>
 * <li>D_MCB_QTY_DENIED</li>
 * <li>D_MCB_QTY_HBEAT</li>
 * <li>D_MCB_QTY_COMMANDS</li>
 * <li>D_MCB_QTY_ERRORS</li>
 * <li>D_MCB_PARTIAL_CONTROL</li>
 * <li>D_MCB_DATAID_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class MCB_DataType
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
  private static final TTL_Package ttlPackage = TTL_Package.MCB;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static MCB_DataType D_MCB_DATAID_BOL =
      new MCB_DataType( "D_MCB_DATAID_BOL", 0, TTL_Package.D_MCB );

  /**
   * 
   */
  public final static MCB_DataType D_MCB_PROC_STATE =
      new MCB_DataType( "D_MCB_PROC_STATE", 1, TTL_Package.D_MCB );

  /**
   * granted suthorisation state
   */
  public final static MCB_DataType D_MCB_AUTH_STATE =
      new MCB_DataType( "D_MCB_AUTH_STATE", 2, TTL_Package.D_MCB );

  /**
   * 
   */
  public final static MCB_DataType D_MCB_SYS_REQUEST =
      new MCB_DataType( "D_MCB_SYS_REQUEST", 3, TTL_Package.D_MCB );

  /**
   * 
   */
  public final static MCB_DataType D_MCB_APP_VERSION =
      new MCB_DataType( "D_MCB_APP_VERSION", 4, TTL_Package.D_MCB );

  /**
   * 
   */
  public final static MCB_DataType D_MCB_AUTH_LEVEL =
      new MCB_DataType( "D_MCB_AUTH_LEVEL", 5, TTL_Package.D_MCB );

  /**
   * No. routed CIL packets since run time
   */
  public final static MCB_DataType D_MCB_QTY_ROUTED =
      new MCB_DataType( "D_MCB_QTY_ROUTED", 6, TTL_Package.D_MCB );

  /**
   * No. denied CIL packets since run time
   */
  public final static MCB_DataType D_MCB_QTY_DENIED =
      new MCB_DataType( "D_MCB_QTY_DENIED", 7, TTL_Package.D_MCB );

  /**
   * No. heartbeats received since run time
   */
  public final static MCB_DataType D_MCB_QTY_HBEAT =
      new MCB_DataType( "D_MCB_QTY_HBEAT", 8, TTL_Package.D_MCB );

  /**
   * No. commands the MCB received since run time
   */
  public final static MCB_DataType D_MCB_QTY_COMMANDS =
      new MCB_DataType( "D_MCB_QTY_COMMANDS", 9, TTL_Package.D_MCB );

  /**
   * No. comms
   */
  public final static MCB_DataType D_MCB_QTY_ERRORS =
      new MCB_DataType( "D_MCB_QTY_ERRORS", 10, TTL_Package.D_MCB );

  /**
   * Only commands for some targets may be routed
   */
  public final static MCB_DataType D_MCB_PARTIAL_CONTROL =
      new MCB_DataType( "D_MCB_PARTIAL_CONTROL", 11, TTL_Package.D_MCB );

  /**
   * 
   */
  public final static MCB_DataType D_MCB_DATAID_EOL =
      new MCB_DataType( "D_MCB_DATAID_EOL", 12, TTL_Package.D_MCB );

  /**
   * Array allowing serialization.
   */
  protected static final MCB_DataType[] array =
  {
    D_MCB_DATAID_BOL,
    D_MCB_PROC_STATE,
    D_MCB_AUTH_STATE,
    D_MCB_SYS_REQUEST,
    D_MCB_APP_VERSION,
    D_MCB_AUTH_LEVEL,
    D_MCB_QTY_ROUTED,
    D_MCB_QTY_DENIED,
    D_MCB_QTY_HBEAT,
    D_MCB_QTY_COMMANDS,
    D_MCB_QTY_ERRORS,
    D_MCB_PARTIAL_CONTROL,
    D_MCB_DATAID_EOL
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
   * Return an object reference of the MCB_DataType with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the MCB_DataType
   * @return a reference to the MCB_DataType specified by the argument
   */
  public static MCB_DataType getReference( String s )
  {
    return( (MCB_DataType)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the MCB_DataType with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the MCB_DataType
   * @return a reference to the MCB_DataType specified by the argument
   */
  public static MCB_DataType getReference( int i )
  {
    return( (MCB_DataType)( intHash.get( new Integer( i ) ) ) );
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
  private MCB_DataType( String s )
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
  private MCB_DataType( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this MCB_DataType.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this MCB_DataType.
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
