package ngat.ngtcs.subsystem.sdb;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type SDB_Command.  These are:
 * <ul>
 * <li>E_SDB_PURGE</li>
 * <li>E_SDB_SUBMIT_1</li>
 * <li>E_SDB_RETRIEVE_1</li>
 * <li>E_SDB_SUBMIT_N</li>
 * <li>E_SDB_RETRIEVE_N</li>
 * <li>E_SDB_LISTSOURCES</li>
 * <li>E_SDB_LISTDATA</li>
 * <li>E_SDB_COUNTSOURCES</li>
 * <li>E_SDB_COUNTDATA</li>
 * <li>E_SDB_COUNTMSRMENTS</li>
 * <li>E_SDB_RETRIEVE_1R</li>
 * <li>E_SDB_RETRIEVE_F</li>
 * <li>E_SDB_SUBMIT_1P</li>
 * <li>E_SDB_CLEAR_S</li>
 * <li>E_SDB_CLEAR_1</li>
 * <li>E_SDB_RETRIEVE_L</li>
 * <li>E_SDB_COMMAND_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class SDB_Command extends ngat.ngtcs.net.cil.TTL_CIL_ServiceClass
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
  private static final TTL_Package ttlPackage = TTL_Package.SDB;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   *
   */
  public final static SDB_Command E_SDB_HEARTBEAT =
    new SDB_Command( "E_SDB_HEARTBEAT",
		     TTL_CIL_ServiceClass.E_MCP_HEARTBEAT.getInt(),
		     TTL_Package.NO_SYS );
      
  /**
   *
   */
  public final static SDB_Command E_SDB_SHUTDOWN =
    new SDB_Command( "E_SDB_SHUTDOWN",
		     TTL_CIL_ServiceClass.E_MCP_SHUTDOWN.getInt(),
		     TTL_Package.NO_SYS );
      
  /**
   *
   */
  public final static SDB_Command E_SDB_SAFESTATE =
    new SDB_Command( "E_SDB_SAFESTATE",
		     TTL_CIL_ServiceClass.E_MCP_SAFESTATE.getInt(),
		     TTL_Package.NO_SYS );
      
  /**
   *
   */
  public final static SDB_Command E_SDB_ACTIVATE =
    new SDB_Command( "E_SDB_ACTIVATE",
		     TTL_CIL_ServiceClass.E_MCP_ACTIVATE.getInt(),
		     TTL_Package.NO_SYS );
      
  /**
   * 
   */
  public final static SDB_Command E_SDB_PURGE =
      new SDB_Command( "E_SDB_PURGE", 0, TTL_Package.SDB );

  /**
   * Submit data for storage
   */
  public final static SDB_Command E_SDB_SUBMIT_1 =
      new SDB_Command( "E_SDB_SUBMIT_1", 1, TTL_Package.SDB );

  /**
   * Request data from the database
   */
  public final static SDB_Command E_SDB_RETRIEVE_1 =
      new SDB_Command( "E_SDB_RETRIEVE_1", 2, TTL_Package.SDB );

  /**
   * Submit block data for storage
   */
  public final static SDB_Command E_SDB_SUBMIT_N =
      new SDB_Command( "E_SDB_SUBMIT_N", 3, TTL_Package.SDB );

  /**
   * Request block data from the database
   */
  public final static SDB_Command E_SDB_RETRIEVE_N =
      new SDB_Command( "E_SDB_RETRIEVE_N", 4, TTL_Package.SDB );

  /**
   * Request source IDs for all submitted data
   */
  public final static SDB_Command E_SDB_LISTSOURCES =
      new SDB_Command( "E_SDB_LISTSOURCES", 5, TTL_Package.SDB );

  /**
   * Request data IDs for a particular source
   */
  public final static SDB_Command E_SDB_LISTDATA =
      new SDB_Command( "E_SDB_LISTDATA", 6, TTL_Package.SDB );

  /**
   * Reuqest number of different sources in SDB
   */
  public final static SDB_Command E_SDB_COUNTSOURCES =
      new SDB_Command( "E_SDB_COUNTSOURCES", 7, TTL_Package.SDB );

  /**
   * Request number of data definitions for a Src
   */
  public final static SDB_Command E_SDB_COUNTDATA =
      new SDB_Command( "E_SDB_COUNTDATA", 8, TTL_Package.SDB );

  /**
   * Request number of measurements for a Src:Dat
   */
  public final static SDB_Command E_SDB_COUNTMSRMENTS =
      new SDB_Command( "E_SDB_COUNTMSRMENTS", 9, TTL_Package.SDB );

  /**
   * Request data from the database (robust mode)
   */
  public final static SDB_Command E_SDB_RETRIEVE_1R =
      new SDB_Command( "E_SDB_RETRIEVE_1R", 10, TTL_Package.SDB );

  /**
   * Request data from storage file (robust mode)
   */
  public final static SDB_Command E_SDB_RETRIEVE_F =
      new SDB_Command( "E_SDB_RETRIEVE_F", 11, TTL_Package.SDB );

  /**
   * Post data for submission no response
   */
  public final static SDB_Command E_SDB_SUBMIT_1P =
      new SDB_Command( "E_SDB_SUBMIT_1P", 12, TTL_Package.SDB );

  /**
   * Clear data with a particular SourceID
   */
  public final static SDB_Command E_SDB_CLEAR_S =
      new SDB_Command( "E_SDB_CLEAR_S", 13, TTL_Package.SDB );

  /**
   * Clear specific data submissions
   */
  public final static SDB_Command E_SDB_CLEAR_1 =
      new SDB_Command( "E_SDB_CLEAR_1", 14, TTL_Package.SDB );

  /**
   * Request latest data from file (robust mode)
   */
  public final static SDB_Command E_SDB_RETRIEVE_L =
      new SDB_Command( "E_SDB_RETRIEVE_L", 15, TTL_Package.SDB );

  /**
   * End of enumerated list of commands
   */
  public final static SDB_Command E_SDB_COMMAND_EOL =
      new SDB_Command( "E_SDB_COMMAND_EOL", 16, TTL_Package.SDB );

  /**
   * Array allowing serialization.
   */
  protected static final SDB_Command[] array =
  {
    E_SDB_HEARTBEAT,
    E_SDB_SHUTDOWN,
    E_SDB_SAFESTATE,
    E_SDB_ACTIVATE,
    E_SDB_PURGE,
    E_SDB_SUBMIT_1,
    E_SDB_RETRIEVE_1,
    E_SDB_SUBMIT_N,
    E_SDB_RETRIEVE_N,
    E_SDB_LISTSOURCES,
    E_SDB_LISTDATA,
    E_SDB_COUNTSOURCES,
    E_SDB_COUNTDATA,
    E_SDB_COUNTMSRMENTS,
    E_SDB_RETRIEVE_1R,
    E_SDB_RETRIEVE_F,
    E_SDB_SUBMIT_1P,
    E_SDB_CLEAR_S,
    E_SDB_CLEAR_1,
    E_SDB_RETRIEVE_L,
    E_SDB_COMMAND_EOL
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
   * Return an object reference of the SDB_Command with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the SDB_Command
   * @return a reference to the SDB_Command specified by the argument
   */
  public static SDB_Command getReference( String s )
  {
    return( (SDB_Command)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the SDB_Command with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the SDB_Command
   * @return a reference to the SDB_Command specified by the argument
   */
  public static SDB_Command getReference( int i )
  {
    return( (SDB_Command)( intHash.get( new Integer( i ) ) ) );
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
  private SDB_Command( String s )
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
  private SDB_Command( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this SDB_Command.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this SDB_Command.
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
