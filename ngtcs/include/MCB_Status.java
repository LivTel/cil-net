package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type MCB_Status.  These are:
 * <ul>
 * <li>E_MCB_GEN_ERR</li>
 * <li>E_MCB_SRC_UNKNOWN</li>
 * <li>E_MCB_DST_UNKNOWN</li>
 * <li>E_MCB_CLA_UNKNOWN</li>
 * <li>E_MCB_CLASS_ERR</li>
 * <li>E_MCB_SRCEQDST_ERR</li>
 * <li>E_MCB_AUTH_REQ_ERR</li>
 * <li>E_MCB_DENIED_AUTH</li>
 * <li>E_MCB_COMMAND_ERR</li>
 * <li>E_MCB_COMMAND_LEN_ERR</li>
 * <li>E_MCB_COMMAND_DATUM_ERR</li>
 * <li>E_MCB_PARTIAL_CONTROL_ERR</li>
 * <li>E_MCB_EOSTATUS_LIST</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class MCB_Status
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
  public final static MCB_Status E_MCB_GEN_ERR =
      new MCB_Status( "E_MCB_GEN_ERR", 0, TTL_Package.E_MCB );

  /**
   * Unlisted source CIL ID
   */
  public final static MCB_Status E_MCB_SRC_UNKNOWN =
      new MCB_Status( "E_MCB_SRC_UNKNOWN", 1, TTL_Package.E_MCB );

  /**
   * Unknown destination CIL ID
   */
  public final static MCB_Status E_MCB_DST_UNKNOWN =
      new MCB_Status( "E_MCB_DST_UNKNOWN", 2, TTL_Package.E_MCB );

  /**
   * Unrecognised command line arg
   */
  public final static MCB_Status E_MCB_CLA_UNKNOWN =
      new MCB_Status( "E_MCB_CLA_UNKNOWN", 3, TTL_Package.E_MCB );

  /**
   * Message class not accepted by MCB
   */
  public final static MCB_Status E_MCB_CLASS_ERR =
      new MCB_Status( "E_MCB_CLASS_ERR", 4, TTL_Package.E_MCB );

  /**
   * SrcId
   */
  public final static MCB_Status E_MCB_SRCEQDST_ERR =
      new MCB_Status( "E_MCB_SRCEQDST_ERR", 5, TTL_Package.E_MCB );

  /**
   * Error in requested authorisation level
   */
  public final static MCB_Status E_MCB_AUTH_REQ_ERR =
      new MCB_Status( "E_MCB_AUTH_REQ_ERR", 6, TTL_Package.E_MCB );

  /**
   * Packet routing denied due to authorisation
   */
  public final static MCB_Status E_MCB_DENIED_AUTH =
      new MCB_Status( "E_MCB_DENIED_AUTH", 7, TTL_Package.E_MCB );

  /**
   * General error in incoming MCB command
   */
  public final static MCB_Status E_MCB_COMMAND_ERR =
      new MCB_Status( "E_MCB_COMMAND_ERR", 8, TTL_Package.E_MCB );

  /**
   * Error in incoming MCB command
   */
  public final static MCB_Status E_MCB_COMMAND_LEN_ERR =
      new MCB_Status( "E_MCB_COMMAND_LEN_ERR", 9, TTL_Package.E_MCB );

  /**
   * Datum error in incoming MCB command
   */
  public final static MCB_Status E_MCB_COMMAND_DATUM_ERR =
      new MCB_Status( "E_MCB_COMMAND_DATUM_ERR", 10, TTL_Package.E_MCB );

  /**
   * 
   */
  public final static MCB_Status E_MCB_PARTIAL_CONTROL_ERR =
      new MCB_Status( "E_MCB_PARTIAL_CONTROL_ERR", 11, TTL_Package.E_MCB );

  /**
   * 
   */
  public final static MCB_Status E_MCB_EOSTATUS_LIST =
      new MCB_Status( "E_MCB_EOSTATUS_LIST", 12, TTL_Package.E_MCB );

  /**
   * Array allowing serialization.
   */
  protected static final MCB_Status[] array =
  {
    E_MCB_GEN_ERR,
    E_MCB_SRC_UNKNOWN,
    E_MCB_DST_UNKNOWN,
    E_MCB_CLA_UNKNOWN,
    E_MCB_CLASS_ERR,
    E_MCB_SRCEQDST_ERR,
    E_MCB_AUTH_REQ_ERR,
    E_MCB_DENIED_AUTH,
    E_MCB_COMMAND_ERR,
    E_MCB_COMMAND_LEN_ERR,
    E_MCB_COMMAND_DATUM_ERR,
    E_MCB_PARTIAL_CONTROL_ERR,
    E_MCB_EOSTATUS_LIST
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
   * Return an object reference of the MCB_Status with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the MCB_Status
   * @return a reference to the MCB_Status specified by the argument
   */
  public static MCB_Status getReference( String s )
  {
    return( (MCB_Status)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the MCB_Status with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the MCB_Status
   * @return a reference to the MCB_Status specified by the argument
   */
  public static MCB_Status getReference( int i )
  {
    return( (MCB_Status)( intHash.get( new Integer( i ) ) ) );
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
  private MCB_Status( String s )
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
  private MCB_Status( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this MCB_Status.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this MCB_Status.
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
