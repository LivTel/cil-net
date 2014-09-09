package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type AES_Status.  These are:
 * <ul>
 * <li>E_AES_GEN_ERROR</li>
 * <li>E_AES_INIT_FAIL</li>
 * <li>E_AES_SHUTDOWN_ERROR</li>
 * <li>E_AES_INVALID_DATA_LEN</li>
 * <li>E_AES_INVALID_COMMAND</li>
 * <li>E_AES_REPLY_FAIL</li>
 * <li>E_AES_SERVER_STARTUP_FAIL</li>
 * <li>E_AES_SERVER_SHUTDOWN_FAIL</li>
 * <li>E_AES_SERVER_NOT_RUNNING</li>
 * <li>E_AES_SERVER_SEND_FAIL</li>
 * <li>E_AES_TIMER_SETUP_ERR</li>
 * <li>E_AES_TIMER_CLOSE_ERR</li>
 * <li>E_AES_TOO_MANY_AXES</li>
 * <li>E_AES_NO_AXES_SPECIFIED</li>
 * <li>E_AES_INVALID_AXIS_INDEX</li>
 * <li>E_AES_NO_CHKSM_POSSIBLE</li>
 * <li>E_AES_HW_REPORTED_ERROR</li>
 * <li>E_AES_GEAR_RATIO_ERROR</li>
 * <li>E_AES_AEI_SHUTDOWN_TIMEOUT</li>
 * <li>E_AES_AEI_NO_RECENT_DATA</li>
 * <li>E_AES_STATUS_EOL</li>
 * <li>E_AES_STATUS_MAX</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class AES_Status
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
  private static final TTL_Package ttlPackage = TTL_Package.AES;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static AES_Status E_AES_GEN_ERROR =
      new AES_Status( "E_AES_GEN_ERROR", 0, TTL_Package.E_AES );

  /**
   * 
   */
  public final static AES_Status E_AES_INIT_FAIL =
      new AES_Status( "E_AES_INIT_FAIL", 1, TTL_Package.E_AES );

  /**
   * 
   */
  public final static AES_Status E_AES_SHUTDOWN_ERROR =
      new AES_Status( "E_AES_SHUTDOWN_ERROR", 2, TTL_Package.E_AES );

  /**
   * 
   */
  public final static AES_Status E_AES_INVALID_DATA_LEN =
      new AES_Status( "E_AES_INVALID_DATA_LEN", 3, TTL_Package.E_AES );

  /**
   * 
   */
  public final static AES_Status E_AES_INVALID_COMMAND =
      new AES_Status( "E_AES_INVALID_COMMAND", 4, TTL_Package.E_AES );

  /**
   * 
   */
  public final static AES_Status E_AES_REPLY_FAIL =
      new AES_Status( "E_AES_REPLY_FAIL", 5, TTL_Package.E_AES );

  /**
   * 
   */
  public final static AES_Status E_AES_SERVER_STARTUP_FAIL =
      new AES_Status( "E_AES_SERVER_STARTUP_FAIL", 6, TTL_Package.E_AES );

  /**
   * 
   */
  public final static AES_Status E_AES_SERVER_SHUTDOWN_FAIL =
      new AES_Status( "E_AES_SERVER_SHUTDOWN_FAIL", 7, TTL_Package.E_AES );

  /**
   * 
   */
  public final static AES_Status E_AES_SERVER_NOT_RUNNING =
      new AES_Status( "E_AES_SERVER_NOT_RUNNING", 8, TTL_Package.E_AES );

  /**
   * 
   */
  public final static AES_Status E_AES_SERVER_SEND_FAIL =
      new AES_Status( "E_AES_SERVER_SEND_FAIL", 9, TTL_Package.E_AES );

  /**
   * 
   */
  public final static AES_Status E_AES_TIMER_SETUP_ERR =
      new AES_Status( "E_AES_TIMER_SETUP_ERR", 10, TTL_Package.E_AES );

  /**
   * 
   */
  public final static AES_Status E_AES_TIMER_CLOSE_ERR =
      new AES_Status( "E_AES_TIMER_CLOSE_ERR", 11, TTL_Package.E_AES );

  /**
   * Too many axes specified on cmd line
   */
  public final static AES_Status E_AES_TOO_MANY_AXES =
      new AES_Status( "E_AES_TOO_MANY_AXES", 12, TTL_Package.E_AES );

  /**
   * No axis specified on cmd line
   */
  public final static AES_Status E_AES_NO_AXES_SPECIFIED =
      new AES_Status( "E_AES_NO_AXES_SPECIFIED", 13, TTL_Package.E_AES );

  /**
   * Unrecoginised axis index number
   */
  public final static AES_Status E_AES_INVALID_AXIS_INDEX =
      new AES_Status( "E_AES_INVALID_AXIS_INDEX", 14, TTL_Package.E_AES );

  /**
   * Message too short to generate checksum
   */
  public final static AES_Status E_AES_NO_CHKSM_POSSIBLE =
      new AES_Status( "E_AES_NO_CHKSM_POSSIBLE", 15, TTL_Package.E_AES );

  /**
   * Hardware itself reports an error
   */
  public final static AES_Status E_AES_HW_REPORTED_ERROR =
      new AES_Status( "E_AES_HW_REPORTED_ERROR", 16, TTL_Package.E_AES );

  /**
   * Non positive number of teeth on gear
   */
  public final static AES_Status E_AES_GEAR_RATIO_ERROR =
      new AES_Status( "E_AES_GEAR_RATIO_ERROR", 17, TTL_Package.E_AES );

  /**
   * AES timedout waiting for AEI to terminate
   */
  public final static AES_Status E_AES_AEI_SHUTDOWN_TIMEOUT =
      new AES_Status( "E_AES_AEI_SHUTDOWN_TIMEOUT", 18, TTL_Package.E_AES );

  /**
   * AEI has not submitted data recently
   */
  public final static AES_Status E_AES_AEI_NO_RECENT_DATA =
      new AES_Status( "E_AES_AEI_NO_RECENT_DATA", 19, TTL_Package.E_AES );

  /**
   * End Of List
   */
  public final static AES_Status E_AES_STATUS_EOL =
      new AES_Status( "E_AES_STATUS_EOL", 20, TTL_Package.E_AES );

  /**
   * enum forced to be 4 bytes
   */
  public final static AES_Status E_AES_STATUS_MAX =
      new AES_Status( "E_AES_STATUS_MAX", 21, TTL_Package.E_AES );

  /**
   * Array allowing serialization.
   */
  protected static final AES_Status[] array =
  {
    E_AES_GEN_ERROR,
    E_AES_INIT_FAIL,
    E_AES_SHUTDOWN_ERROR,
    E_AES_INVALID_DATA_LEN,
    E_AES_INVALID_COMMAND,
    E_AES_REPLY_FAIL,
    E_AES_SERVER_STARTUP_FAIL,
    E_AES_SERVER_SHUTDOWN_FAIL,
    E_AES_SERVER_NOT_RUNNING,
    E_AES_SERVER_SEND_FAIL,
    E_AES_TIMER_SETUP_ERR,
    E_AES_TIMER_CLOSE_ERR,
    E_AES_TOO_MANY_AXES,
    E_AES_NO_AXES_SPECIFIED,
    E_AES_INVALID_AXIS_INDEX,
    E_AES_NO_CHKSM_POSSIBLE,
    E_AES_HW_REPORTED_ERROR,
    E_AES_GEAR_RATIO_ERROR,
    E_AES_AEI_SHUTDOWN_TIMEOUT,
    E_AES_AEI_NO_RECENT_DATA,
    E_AES_STATUS_EOL,
    E_AES_STATUS_MAX
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
   * Return an object reference of the AES_Status with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the AES_Status
   * @return a reference to the AES_Status specified by the argument
   */
  public static AES_Status getReference( String s )
  {
    return( (AES_Status)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the AES_Status with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the AES_Status
   * @return a reference to the AES_Status specified by the argument
   */
  public static AES_Status getReference( int i )
  {
    return( (AES_Status)( intHash.get( new Integer( i ) ) ) );
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
  private AES_Status( String s )
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
  private AES_Status( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this AES_Status.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this AES_Status.
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
