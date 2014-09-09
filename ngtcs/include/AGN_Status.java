package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type AGN_Status.  These are:
 * <ul>
 * <li>E_AGN_GEN_ERR</li>
 * <li>E_AGN_WRONG_EXE_NAME</li>
 * <li>E_AGN_EXPECTED_CUSTOM_ARG_MISSING</li>
 * <li>E_AGN_TOO_MANY_CUSTOM_ARGS</li>
 * <li>E_AGN_WRONG_CUSTOM_ARG_FOR_AGT_TYPE_1</li>
 * <li>E_AGN_WRONG_CUSTOM_ARG_FOR_AGT_TYPE_2</li>
 * <li>E_AGN_WRONG_CUSTOM_ARG_FOR_AGT_TYPE_3</li>
 * <li>E_AGN_WRONG_CUSTOM_ARG_FOR_AGT_TYPE_4</li>
 * <li>E_AGN_WRONG_CUSTOM_ARG_FOR_AGT_TYPE_5</li>
 * <li>E_AGN_WRONG_CUSTOM_ARG_FOR_AGT_TYPE_6</li>
 * <li>E_AGN_WRONG_CUSTOM_ARG_FOR_AGT_TYPE_7</li>
 * <li>E_AGN_INIT_AGENT_MSG_NULL_POINTER</li>
 * <li>E_AGN_UNABLE_TO_INIT_LOG_FILE</li>
 * <li>E_AGN_UNABLE_TO_LOCATE_OWN_PROCESS</li>
 * <li>E_AGN_UNABLE_TO_LOCATE_SERVER</li>
 * <li>E_AGN_WORK_AGENT_MSG_NULL_POINTER</li>
 * <li>E_AGN_ENDCLIENT_AGENT_MSG_NULL_POINTER</li>
 * <li>E_AGN_SERVER_NOT_RUNNING</li>
 * <li>E_AGN_SERVREQ_AGENT_MSG_NULL_POINTER</li>
 * <li>E_AGN_ALIVE_AGENT_MSG_NULL_POINTER</li>
 * <li>E_AGN_ERROR_AT_PREVIOUS_LEVEL</li>
 * <li>E_AGN_INVALID_SERVER_REQUEST</li>
 * <li>E_AGN_SEND_TO_END_CLIENT_FAILED</li>
 * <li>E_AGN_INVALID_END_CLIENT_RESPONSE</li>
 * <li>E_AGN_UNEXPECTED_MSG_TYPE</li>
 * <li>E_AGN_INVALID_AGENT_TYPE</li>
 * <li>E_AGN_INVALID_AGENT_TYPE_1</li>
 * <li>E_AGN_INVALID_AGENT_TYPE_2</li>
 * <li>E_AGN_INVALID_AGENT_TYPE_3</li>
 * <li>E_AGN_SEQUENCE_NO_ERROR</li>
 * <li>E_AGN_NO_END_CLIENT_NAME</li>
 * <li>E_AGN_INVALID_END_CLIENT_NAME</li>
 * <li>E_AGN_UNABLE_TO_LOCATE_END_CLIENT</li>
 * <li>E_AGN_INVALID_MOTION_COMMAND</li>
 * <li>E_AGN_SRC_UNEXPECTED</li>
 * <li>E_AGN_NODE_UNRESOLVED</li>
 * <li>E_AGN_EOSTATUS_LIST</li>
 * <li>E_AGN_STATUS_MAX_VALUE</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class AGN_Status
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
  private static final TTL_Package ttlPackage = TTL_Package.AGN;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static AGN_Status E_AGN_GEN_ERR =
      new AGN_Status( "E_AGN_GEN_ERR", 0, TTL_Package.E_AGN );

  /**
   * Executable filename not as expected
   */
  public final static AGN_Status E_AGN_WRONG_EXE_NAME =
      new AGN_Status( "E_AGN_WRONG_EXE_NAME", 1, TTL_Package.E_AGN );

  /**
   * 
   */
  public final static AGN_Status E_AGN_EXPECTED_CUSTOM_ARG_MISSING =
      new AGN_Status( "E_AGN_EXPECTED_CUSTOM_ARG_MISSING", 2, TTL_Package.E_AGN );

  /**
   * Too many custom args supplied
   */
  public final static AGN_Status E_AGN_TOO_MANY_CUSTOM_ARGS =
      new AGN_Status( "E_AGN_TOO_MANY_CUSTOM_ARGS", 3, TTL_Package.E_AGN );

  /**
   * 
   */
  public final static AGN_Status E_AGN_WRONG_CUSTOM_ARG_FOR_AGT_TYPE_1 =
      new AGN_Status( "E_AGN_WRONG_CUSTOM_ARG_FOR_AGT_TYPE_1", 4, TTL_Package.E_AGN );

  /**
   * 
   */
  public final static AGN_Status E_AGN_WRONG_CUSTOM_ARG_FOR_AGT_TYPE_2 =
      new AGN_Status( "E_AGN_WRONG_CUSTOM_ARG_FOR_AGT_TYPE_2", 5, TTL_Package.E_AGN );

  /**
   * 
   */
  public final static AGN_Status E_AGN_WRONG_CUSTOM_ARG_FOR_AGT_TYPE_3 =
      new AGN_Status( "E_AGN_WRONG_CUSTOM_ARG_FOR_AGT_TYPE_3", 6, TTL_Package.E_AGN );

  /**
   * 
   */
  public final static AGN_Status E_AGN_WRONG_CUSTOM_ARG_FOR_AGT_TYPE_4 =
      new AGN_Status( "E_AGN_WRONG_CUSTOM_ARG_FOR_AGT_TYPE_4", 7, TTL_Package.E_AGN );

  /**
   * 
   */
  public final static AGN_Status E_AGN_WRONG_CUSTOM_ARG_FOR_AGT_TYPE_5 =
      new AGN_Status( "E_AGN_WRONG_CUSTOM_ARG_FOR_AGT_TYPE_5", 8, TTL_Package.E_AGN );

  /**
   * 
   */
  public final static AGN_Status E_AGN_WRONG_CUSTOM_ARG_FOR_AGT_TYPE_6 =
      new AGN_Status( "E_AGN_WRONG_CUSTOM_ARG_FOR_AGT_TYPE_6", 9, TTL_Package.E_AGN );

  /**
   * 
   */
  public final static AGN_Status E_AGN_WRONG_CUSTOM_ARG_FOR_AGT_TYPE_7 =
      new AGN_Status( "E_AGN_WRONG_CUSTOM_ARG_FOR_AGT_TYPE_7", 10, TTL_Package.E_AGN );

  /**
   * Function : iAgnInitialisation
   */
  public final static AGN_Status E_AGN_INIT_AGENT_MSG_NULL_POINTER =
      new AGN_Status( "E_AGN_INIT_AGENT_MSG_NULL_POINTER", 11, TTL_Package.E_AGN );

  /**
   * 
   */
  public final static AGN_Status E_AGN_UNABLE_TO_INIT_LOG_FILE =
      new AGN_Status( "E_AGN_UNABLE_TO_INIT_LOG_FILE", 12, TTL_Package.E_AGN );

  /**
   * 
   */
  public final static AGN_Status E_AGN_UNABLE_TO_LOCATE_OWN_PROCESS =
      new AGN_Status( "E_AGN_UNABLE_TO_LOCATE_OWN_PROCESS", 13, TTL_Package.E_AGN );

  /**
   * 
   */
  public final static AGN_Status E_AGN_UNABLE_TO_LOCATE_SERVER =
      new AGN_Status( "E_AGN_UNABLE_TO_LOCATE_SERVER", 14, TTL_Package.E_AGN );

  /**
   * Function : iAgnBuildReportForWorkMsg
   */
  public final static AGN_Status E_AGN_WORK_AGENT_MSG_NULL_POINTER =
      new AGN_Status( "E_AGN_WORK_AGENT_MSG_NULL_POINTER", 15, TTL_Package.E_AGN );

  /**
   * 
   */
  public final static AGN_Status E_AGN_ENDCLIENT_AGENT_MSG_NULL_POINTER =
      new AGN_Status( "E_AGN_ENDCLIENT_AGENT_MSG_NULL_POINTER", 16, TTL_Package.E_AGN );

  /**
   * Function : iAgnRespToServAndWaitReq
   */
  public final static AGN_Status E_AGN_SERVER_NOT_RUNNING =
      new AGN_Status( "E_AGN_SERVER_NOT_RUNNING", 17, TTL_Package.E_AGN );

  /**
   * 
   */
  public final static AGN_Status E_AGN_SERVREQ_AGENT_MSG_NULL_POINTER =
      new AGN_Status( "E_AGN_SERVREQ_AGENT_MSG_NULL_POINTER", 18, TTL_Package.E_AGN );

  /**
   * Function : iAgnProcessAlive
   */
  public final static AGN_Status E_AGN_ALIVE_AGENT_MSG_NULL_POINTER =
      new AGN_Status( "E_AGN_ALIVE_AGENT_MSG_NULL_POINTER", 19, TTL_Package.E_AGN );

  /**
   * Error already identified
   */
  public final static AGN_Status E_AGN_ERROR_AT_PREVIOUS_LEVEL =
      new AGN_Status( "E_AGN_ERROR_AT_PREVIOUS_LEVEL", 20, TTL_Package.E_AGN );

  /**
   * Request from server invalid
   */
  public final static AGN_Status E_AGN_INVALID_SERVER_REQUEST =
      new AGN_Status( "E_AGN_INVALID_SERVER_REQUEST", 21, TTL_Package.E_AGN );

  /**
   * Unable to send to endclient process
   */
  public final static AGN_Status E_AGN_SEND_TO_END_CLIENT_FAILED =
      new AGN_Status( "E_AGN_SEND_TO_END_CLIENT_FAILED", 22, TTL_Package.E_AGN );

  /**
   * Response from endclient invalid
   */
  public final static AGN_Status E_AGN_INVALID_END_CLIENT_RESPONSE =
      new AGN_Status( "E_AGN_INVALID_END_CLIENT_RESPONSE", 23, TTL_Package.E_AGN );

  /**
   * 
   */
  public final static AGN_Status E_AGN_UNEXPECTED_MSG_TYPE =
      new AGN_Status( "E_AGN_UNEXPECTED_MSG_TYPE", 24, TTL_Package.E_AGN );

  /**
   * Unrecognised Agent Type
   */
  public final static AGN_Status E_AGN_INVALID_AGENT_TYPE =
      new AGN_Status( "E_AGN_INVALID_AGENT_TYPE", 25, TTL_Package.E_AGN );

  /**
   * Invalid agent type for this agent
   */
  public final static AGN_Status E_AGN_INVALID_AGENT_TYPE_1 =
      new AGN_Status( "E_AGN_INVALID_AGENT_TYPE_1", 26, TTL_Package.E_AGN );

  /**
   * Invalid agent type for this agent
   */
  public final static AGN_Status E_AGN_INVALID_AGENT_TYPE_2 =
      new AGN_Status( "E_AGN_INVALID_AGENT_TYPE_2", 27, TTL_Package.E_AGN );

  /**
   * Invalid agent type for this agent
   */
  public final static AGN_Status E_AGN_INVALID_AGENT_TYPE_3 =
      new AGN_Status( "E_AGN_INVALID_AGENT_TYPE_3", 28, TTL_Package.E_AGN );

  /**
   * General sequence number error
   */
  public final static AGN_Status E_AGN_SEQUENCE_NO_ERROR =
      new AGN_Status( "E_AGN_SEQUENCE_NO_ERROR", 29, TTL_Package.E_AGN );

  /**
   * Empty Endclient name
   */
  public final static AGN_Status E_AGN_NO_END_CLIENT_NAME =
      new AGN_Status( "E_AGN_NO_END_CLIENT_NAME", 30, TTL_Package.E_AGN );

  /**
   * End client name is invalid
   */
  public final static AGN_Status E_AGN_INVALID_END_CLIENT_NAME =
      new AGN_Status( "E_AGN_INVALID_END_CLIENT_NAME", 31, TTL_Package.E_AGN );

  /**
   * End client not found
   */
  public final static AGN_Status E_AGN_UNABLE_TO_LOCATE_END_CLIENT =
      new AGN_Status( "E_AGN_UNABLE_TO_LOCATE_END_CLIENT", 32, TTL_Package.E_AGN );

  /**
   * Invalid motion command received
   */
  public final static AGN_Status E_AGN_INVALID_MOTION_COMMAND =
      new AGN_Status( "E_AGN_INVALID_MOTION_COMMAND", 33, TTL_Package.E_AGN );

  /**
   * Unexpected Cil Source Id
   */
  public final static AGN_Status E_AGN_SRC_UNEXPECTED =
      new AGN_Status( "E_AGN_SRC_UNEXPECTED", 34, TTL_Package.E_AGN );

  /**
   * Unable to resolve node on start up
   */
  public final static AGN_Status E_AGN_NODE_UNRESOLVED =
      new AGN_Status( "E_AGN_NODE_UNRESOLVED", 35, TTL_Package.E_AGN );

  /**
   * End of list marker (DO NOT USE FOR STATUS)
   */
  public final static AGN_Status E_AGN_EOSTATUS_LIST =
      new AGN_Status( "E_AGN_EOSTATUS_LIST", 36, TTL_Package.E_AGN );

  /**
   * Req'd to force size to 4 bytes
   */
  public final static AGN_Status E_AGN_STATUS_MAX_VALUE =
      new AGN_Status( "E_AGN_STATUS_MAX_VALUE", 37, TTL_Package.E_AGN );

  /**
   * Array allowing serialization.
   */
  protected static final AGN_Status[] array =
  {
    E_AGN_GEN_ERR,
    E_AGN_WRONG_EXE_NAME,
    E_AGN_EXPECTED_CUSTOM_ARG_MISSING,
    E_AGN_TOO_MANY_CUSTOM_ARGS,
    E_AGN_WRONG_CUSTOM_ARG_FOR_AGT_TYPE_1,
    E_AGN_WRONG_CUSTOM_ARG_FOR_AGT_TYPE_2,
    E_AGN_WRONG_CUSTOM_ARG_FOR_AGT_TYPE_3,
    E_AGN_WRONG_CUSTOM_ARG_FOR_AGT_TYPE_4,
    E_AGN_WRONG_CUSTOM_ARG_FOR_AGT_TYPE_5,
    E_AGN_WRONG_CUSTOM_ARG_FOR_AGT_TYPE_6,
    E_AGN_WRONG_CUSTOM_ARG_FOR_AGT_TYPE_7,
    E_AGN_INIT_AGENT_MSG_NULL_POINTER,
    E_AGN_UNABLE_TO_INIT_LOG_FILE,
    E_AGN_UNABLE_TO_LOCATE_OWN_PROCESS,
    E_AGN_UNABLE_TO_LOCATE_SERVER,
    E_AGN_WORK_AGENT_MSG_NULL_POINTER,
    E_AGN_ENDCLIENT_AGENT_MSG_NULL_POINTER,
    E_AGN_SERVER_NOT_RUNNING,
    E_AGN_SERVREQ_AGENT_MSG_NULL_POINTER,
    E_AGN_ALIVE_AGENT_MSG_NULL_POINTER,
    E_AGN_ERROR_AT_PREVIOUS_LEVEL,
    E_AGN_INVALID_SERVER_REQUEST,
    E_AGN_SEND_TO_END_CLIENT_FAILED,
    E_AGN_INVALID_END_CLIENT_RESPONSE,
    E_AGN_UNEXPECTED_MSG_TYPE,
    E_AGN_INVALID_AGENT_TYPE,
    E_AGN_INVALID_AGENT_TYPE_1,
    E_AGN_INVALID_AGENT_TYPE_2,
    E_AGN_INVALID_AGENT_TYPE_3,
    E_AGN_SEQUENCE_NO_ERROR,
    E_AGN_NO_END_CLIENT_NAME,
    E_AGN_INVALID_END_CLIENT_NAME,
    E_AGN_UNABLE_TO_LOCATE_END_CLIENT,
    E_AGN_INVALID_MOTION_COMMAND,
    E_AGN_SRC_UNEXPECTED,
    E_AGN_NODE_UNRESOLVED,
    E_AGN_EOSTATUS_LIST,
    E_AGN_STATUS_MAX_VALUE
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
   * Return an object reference of the AGN_Status with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the AGN_Status
   * @return a reference to the AGN_Status specified by the argument
   */
  public static AGN_Status getReference( String s )
  {
    return( (AGN_Status)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the AGN_Status with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the AGN_Status
   * @return a reference to the AGN_Status specified by the argument
   */
  public static AGN_Status getReference( int i )
  {
    return( (AGN_Status)( intHash.get( new Integer( i ) ) ) );
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
  private AGN_Status( String s )
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
  private AGN_Status( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this AGN_Status.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this AGN_Status.
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
