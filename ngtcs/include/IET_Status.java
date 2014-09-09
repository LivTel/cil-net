package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type IET_Status.  These are:
 * <ul>
 * <li>E_IET_GEN_ERR</li>
 * <li>E_IET_ERR_SETUP</li>
 * <li>E_IET_ERR_CIL_RX</li>
 * <li>E_IET_ERR_SDB_SUBMIT</li>
 * <li>E_IET_SW_SIMULATE</li>
 * <li>E_IET_UNKNOWN_SERVICE</li>
 * <li>E_IET_SERVICE_NOT_IMPL</li>
 * <li>E_IET_NOT_IMPLEMENTED</li>
 * <li>E_IET_MSG_LEN_ERR</li>
 * <li>E_IET_UNEXPECTED_SIM</li>
 * <li>E_IET_UNEXPECTED_MSG</li>
 * <li>E_IET_INVALID_SHUTTER</li>
 * <li>E_IET_INVALID_DATUM</li>
 * <li>E_IET_INVALID_COMMAND</li>
 * <li>E_IET_PARSE_ERROR</li>
 * <li>E_IET_PARAM_RANGE_ERR</li>
 * <li>E_IET_NO_HEARTBEATS</li>
 * <li>E_IET_CMD_NOT_PERMITTED</li>
 * <li>E_IET_UNKNOWN_DEMAND</li>
 * <li>E_IET_PARAM_SIZE_ERR</li>
 * <li>E_IET_NO_TIMED_CMDS</li>
 * <li>E_IET_UNKNOWN_OID</li>
 * <li>E_IET_OID_READ_ONLY</li>
 * <li>E_IET_ERR_READ_PKTS</li>
 * <li>E_IET_ERR_READ_LENGTH</li>
 * <li>E_IET_INVALID_LENGTH</li>
 * <li>E_IET_CHKSUM_ERROR</li>
 * <li>E_IET_SER_REPORTED_ERROR</li>
 * <li>E_IET_SER_UNEXPECTED_RSP</li>
 * <li>E_IET_DMD_PENDING</li>
 * <li>E_IET_WRITE_FAILED</li>
 * <li>E_IET_READ_FAILED</li>
 * <li>E_IET_PLC_INVALID</li>
 * <li>E_IET_CONFIG_FILE_ERROR</li>
 * <li>E_IET_STATE_UNKNOWN</li>
 * <li>E_IET_STATUS_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class IET_Status
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
  private static final TTL_Package ttlPackage = TTL_Package.IET;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static IET_Status E_IET_GEN_ERR =
      new IET_Status( "E_IET_GEN_ERR", 0, TTL_Package.E_IET );

  /**
   * 1 Error performing setup
   */
  public final static IET_Status E_IET_ERR_SETUP =
      new IET_Status( "E_IET_ERR_SETUP", 1, TTL_Package.E_IET );

  /**
   * 2 Unexpected CIL message received
   */
  public final static IET_Status E_IET_ERR_CIL_RX =
      new IET_Status( "E_IET_ERR_CIL_RX", 2, TTL_Package.E_IET );

  /**
   * 3 Error performing SDB submission
   */
  public final static IET_Status E_IET_ERR_SDB_SUBMIT =
      new IET_Status( "E_IET_ERR_SDB_SUBMIT", 3, TTL_Package.E_IET );

  /**
   * 4 Using software to simulate encl. operation
   */
  public final static IET_Status E_IET_SW_SIMULATE =
      new IET_Status( "E_IET_SW_SIMULATE", 4, TTL_Package.E_IET );

  /**
   * 5 Requested service not provided by this task
   */
  public final static IET_Status E_IET_UNKNOWN_SERVICE =
      new IET_Status( "E_IET_UNKNOWN_SERVICE", 5, TTL_Package.E_IET );

  /**
   * 6 Service not implemented in this version
   */
  public final static IET_Status E_IET_SERVICE_NOT_IMPL =
      new IET_Status( "E_IET_SERVICE_NOT_IMPL", 6, TTL_Package.E_IET );

  /**
   * 7 General functionality not implemented
   */
  public final static IET_Status E_IET_NOT_IMPLEMENTED =
      new IET_Status( "E_IET_NOT_IMPLEMENTED", 7, TTL_Package.E_IET );

  /**
   * 8 Incorrect no. bytes in CIL data block
   */
  public final static IET_Status E_IET_MSG_LEN_ERR =
      new IET_Status( "E_IET_MSG_LEN_ERR", 8, TTL_Package.E_IET );

  /**
   * 9 Simulate fn. called without simulate selected
   */
  public final static IET_Status E_IET_UNEXPECTED_SIM =
      new IET_Status( "E_IET_UNEXPECTED_SIM", 9, TTL_Package.E_IET );

  /**
   * a Unexpected CIL message received
   */
  public final static IET_Status E_IET_UNEXPECTED_MSG =
      new IET_Status( "E_IET_UNEXPECTED_MSG", 10, TTL_Package.E_IET );

  /**
   * b Shutter ID number not recognised
   */
  public final static IET_Status E_IET_INVALID_SHUTTER =
      new IET_Status( "E_IET_INVALID_SHUTTER", 11, TTL_Package.E_IET );

  /**
   * c Datum ID out of range
   */
  public final static IET_Status E_IET_INVALID_DATUM =
      new IET_Status( "E_IET_INVALID_DATUM", 12, TTL_Package.E_IET );

  /**
   * d Command not recognised
   */
  public final static IET_Status E_IET_INVALID_COMMAND =
      new IET_Status( "E_IET_INVALID_COMMAND", 13, TTL_Package.E_IET );

  /**
   * e Failed to read an ASCII argument token
   */
  public final static IET_Status E_IET_PARSE_ERROR =
      new IET_Status( "E_IET_PARSE_ERROR", 14, TTL_Package.E_IET );

  /**
   * f Specified parameter outside allowed range
   */
  public final static IET_Status E_IET_PARAM_RANGE_ERR =
      new IET_Status( "E_IET_PARAM_RANGE_ERR", 15, TTL_Package.E_IET );

  /**
   * 10 No heartbeats received recently
   */
  public final static IET_Status E_IET_NO_HEARTBEATS =
      new IET_Status( "E_IET_NO_HEARTBEATS", 16, TTL_Package.E_IET );

  /**
   * 11 Command not permitted because state not OKAY
   */
  public final static IET_Status E_IET_CMD_NOT_PERMITTED =
      new IET_Status( "E_IET_CMD_NOT_PERMITTED", 17, TTL_Package.E_IET );

  /**
   * 12 Demanded parameter not known
   */
  public final static IET_Status E_IET_UNKNOWN_DEMAND =
      new IET_Status( "E_IET_UNKNOWN_DEMAND", 18, TTL_Package.E_IET );

  /**
   * 13 A value to be set is not of a supported size
   */
  public final static IET_Status E_IET_PARAM_SIZE_ERR =
      new IET_Status( "E_IET_PARAM_SIZE_ERR", 19, TTL_Package.E_IET );

  /**
   * 14 Timed set commands are not supported
   */
  public final static IET_Status E_IET_NO_TIMED_CMDS =
      new IET_Status( "E_IET_NO_TIMED_CMDS", 20, TTL_Package.E_IET );

  /**
   * 15 Object ID not recognised
   */
  public final static IET_Status E_IET_UNKNOWN_OID =
      new IET_Status( "E_IET_UNKNOWN_OID", 21, TTL_Package.E_IET );

  /**
   * 16 Attempt made to change a read only OID value
   */
  public final static IET_Status E_IET_OID_READ_ONLY =
      new IET_Status( "E_IET_OID_READ_ONLY", 22, TTL_Package.E_IET );

  /**
   * 17 Unable to read no. expected packets to follow
   */
  public final static IET_Status E_IET_ERR_READ_PKTS =
      new IET_Status( "E_IET_ERR_READ_PKTS", 23, TTL_Package.E_IET );

  /**
   * 18 Failed to read the expected length of packet
   */
  public final static IET_Status E_IET_ERR_READ_LENGTH =
      new IET_Status( "E_IET_ERR_READ_LENGTH", 24, TTL_Package.E_IET );

  /**
   * 19 Incorrect length of received packet
   */
  public final static IET_Status E_IET_INVALID_LENGTH =
      new IET_Status( "E_IET_INVALID_LENGTH", 25, TTL_Package.E_IET );

  /**
   * 1a Calculated and reported checksums don't match
   */
  public final static IET_Status E_IET_CHKSUM_ERROR =
      new IET_Status( "E_IET_CHKSUM_ERROR", 26, TTL_Package.E_IET );

  /**
   * 1b Error response received from serial device.
   */
  public final static IET_Status E_IET_SER_REPORTED_ERROR =
      new IET_Status( "E_IET_SER_REPORTED_ERROR", 27, TTL_Package.E_IET );

  /**
   * 1c Response received not for command sent.
   */
  public final static IET_Status E_IET_SER_UNEXPECTED_RSP =
      new IET_Status( "E_IET_SER_UNEXPECTED_RSP", 28, TTL_Package.E_IET );

  /**
   * 1d An operation is already pending
   */
  public final static IET_Status E_IET_DMD_PENDING =
      new IET_Status( "E_IET_DMD_PENDING", 29, TTL_Package.E_IET );

  /**
   * 1e Write to PLC failed
   */
  public final static IET_Status E_IET_WRITE_FAILED =
      new IET_Status( "E_IET_WRITE_FAILED", 30, TTL_Package.E_IET );

  /**
   * 1f Read to PLC failed
   */
  public final static IET_Status E_IET_READ_FAILED =
      new IET_Status( "E_IET_READ_FAILED", 31, TTL_Package.E_IET );

  /**
   * More than one PLC bit is set for the same OID
   */
  public final static IET_Status E_IET_PLC_INVALID =
      new IET_Status( "E_IET_PLC_INVALID", 32, TTL_Package.E_IET );

  /**
   * 20 Format of the config file is wrong.
   */
  public final static IET_Status E_IET_CONFIG_FILE_ERROR =
      new IET_Status( "E_IET_CONFIG_FILE_ERROR", 33, TTL_Package.E_IET );

  /**
   * Value not in range for this OID.
   */
  public final static IET_Status E_IET_STATE_UNKNOWN =
      new IET_Status( "E_IET_STATE_UNKNOWN", 34, TTL_Package.E_IET );

  /**
   * 
   */
  public final static IET_Status E_IET_STATUS_EOL =
      new IET_Status( "E_IET_STATUS_EOL", 35, TTL_Package.E_IET );

  /**
   * Array allowing serialization.
   */
  protected static final IET_Status[] array =
  {
    E_IET_GEN_ERR,
    E_IET_ERR_SETUP,
    E_IET_ERR_CIL_RX,
    E_IET_ERR_SDB_SUBMIT,
    E_IET_SW_SIMULATE,
    E_IET_UNKNOWN_SERVICE,
    E_IET_SERVICE_NOT_IMPL,
    E_IET_NOT_IMPLEMENTED,
    E_IET_MSG_LEN_ERR,
    E_IET_UNEXPECTED_SIM,
    E_IET_UNEXPECTED_MSG,
    E_IET_INVALID_SHUTTER,
    E_IET_INVALID_DATUM,
    E_IET_INVALID_COMMAND,
    E_IET_PARSE_ERROR,
    E_IET_PARAM_RANGE_ERR,
    E_IET_NO_HEARTBEATS,
    E_IET_CMD_NOT_PERMITTED,
    E_IET_UNKNOWN_DEMAND,
    E_IET_PARAM_SIZE_ERR,
    E_IET_NO_TIMED_CMDS,
    E_IET_UNKNOWN_OID,
    E_IET_OID_READ_ONLY,
    E_IET_ERR_READ_PKTS,
    E_IET_ERR_READ_LENGTH,
    E_IET_INVALID_LENGTH,
    E_IET_CHKSUM_ERROR,
    E_IET_SER_REPORTED_ERROR,
    E_IET_SER_UNEXPECTED_RSP,
    E_IET_DMD_PENDING,
    E_IET_WRITE_FAILED,
    E_IET_READ_FAILED,
    E_IET_PLC_INVALID,
    E_IET_CONFIG_FILE_ERROR,
    E_IET_STATE_UNKNOWN,
    E_IET_STATUS_EOL
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
   * Return an object reference of the IET_Status with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the IET_Status
   * @return a reference to the IET_Status specified by the argument
   */
  public static IET_Status getReference( String s )
  {
    return( (IET_Status)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the IET_Status with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the IET_Status
   * @return a reference to the IET_Status specified by the argument
   */
  public static IET_Status getReference( int i )
  {
    return( (IET_Status)( intHash.get( new Integer( i ) ) ) );
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
  private IET_Status( String s )
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
  private IET_Status( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this IET_Status.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this IET_Status.
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
