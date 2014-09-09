package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type INC_Command.  These are:
 * <ul>
 * <li>E_INC_POS</li>
 * <li>E_INC_POS_STATUS</li>
 * <li>E_INC_POS_TIME_STATUS</li>
 * <li>E_INC_STROBE</li>
 * <li>E_INC_SLEEP</li>
 * <li>E_INC_WAKEUP</li>
 * <li>E_INC_SET_ORIGIN</li>
 * <li>E_INC_SET_ABS_POS</li>
 * <li>E_INC_READ_SERIAL_NO</li>
 * <li>E_INC_CHECK_SERIAL_NO</li>
 * <li>E_INC_FAIL_SERIAL_NO</li>
 * <li>E_INC_GET_ADDRESS</li>
 * <li>E_INC_ASSIGN_ADDRESS</li>
 * <li>E_INC_READ_FACTORY_INFO</li>
 * <li>E_INC_READ_RESOLUTION</li>
 * <li>E_INC_CHANGE_RESOLUTION</li>
 * <li>E_INC_READ_MODE</li>
 * <li>E_INC_CHANGE_MODE</li>
 * <li>E_INC_CHANGE_POWERUP</li>
 * <li>E_INC_RESET</li>
 * <li>E_INC_CHANGE_BAUD</li>
 * <li>E_INC_LOOPBACK</li>
 * <li>E_INC_DEAD_ENDCLIENT</li>
 * <li>E_INC_SERVER_SHUTDOWN</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class INC_Command
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
  private static final TTL_Package ttlPackage = TTL_Package.INC;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static INC_Command E_INC_POS =
      new INC_Command( "E_INC_POS", 0, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Command E_INC_POS_STATUS =
      new INC_Command( "E_INC_POS_STATUS", 1, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Command E_INC_POS_TIME_STATUS =
      new INC_Command( "E_INC_POS_TIME_STATUS", 2, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Command E_INC_STROBE =
      new INC_Command( "E_INC_STROBE", 3, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Command E_INC_SLEEP =
      new INC_Command( "E_INC_SLEEP", 4, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Command E_INC_WAKEUP =
      new INC_Command( "E_INC_WAKEUP", 5, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Command E_INC_SET_ORIGIN =
      new INC_Command( "E_INC_SET_ORIGIN", 6, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Command E_INC_SET_ABS_POS =
      new INC_Command( "E_INC_SET_ABS_POS", 7, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Command E_INC_READ_SERIAL_NO =
      new INC_Command( "E_INC_READ_SERIAL_NO", 8, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Command E_INC_CHECK_SERIAL_NO =
      new INC_Command( "E_INC_CHECK_SERIAL_NO", 9, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Command E_INC_FAIL_SERIAL_NO =
      new INC_Command( "E_INC_FAIL_SERIAL_NO", 10, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Command E_INC_GET_ADDRESS =
      new INC_Command( "E_INC_GET_ADDRESS", 11, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Command E_INC_ASSIGN_ADDRESS =
      new INC_Command( "E_INC_ASSIGN_ADDRESS", 12, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Command E_INC_READ_FACTORY_INFO =
      new INC_Command( "E_INC_READ_FACTORY_INFO", 13, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Command E_INC_READ_RESOLUTION =
      new INC_Command( "E_INC_READ_RESOLUTION", 14, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Command E_INC_CHANGE_RESOLUTION =
      new INC_Command( "E_INC_CHANGE_RESOLUTION", 15, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Command E_INC_READ_MODE =
      new INC_Command( "E_INC_READ_MODE", 16, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Command E_INC_CHANGE_MODE =
      new INC_Command( "E_INC_CHANGE_MODE", 17, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Command E_INC_CHANGE_POWERUP =
      new INC_Command( "E_INC_CHANGE_POWERUP", 18, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Command E_INC_RESET =
      new INC_Command( "E_INC_RESET", 19, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Command E_INC_CHANGE_BAUD =
      new INC_Command( "E_INC_CHANGE_BAUD", 20, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Command E_INC_LOOPBACK =
      new INC_Command( "E_INC_LOOPBACK", 21, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Command E_INC_DEAD_ENDCLIENT =
      new INC_Command( "E_INC_DEAD_ENDCLIENT", 22, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Command E_INC_SERVER_SHUTDOWN =
      new INC_Command( "E_INC_SERVER_SHUTDOWN", 23, TTL_Package.E_INC );

  /**
   * Array allowing serialization.
   */
  protected static final INC_Command[] array =
  {
    E_INC_POS,
    E_INC_POS_STATUS,
    E_INC_POS_TIME_STATUS,
    E_INC_STROBE,
    E_INC_SLEEP,
    E_INC_WAKEUP,
    E_INC_SET_ORIGIN,
    E_INC_SET_ABS_POS,
    E_INC_READ_SERIAL_NO,
    E_INC_CHECK_SERIAL_NO,
    E_INC_FAIL_SERIAL_NO,
    E_INC_GET_ADDRESS,
    E_INC_ASSIGN_ADDRESS,
    E_INC_READ_FACTORY_INFO,
    E_INC_READ_RESOLUTION,
    E_INC_CHANGE_RESOLUTION,
    E_INC_READ_MODE,
    E_INC_CHANGE_MODE,
    E_INC_CHANGE_POWERUP,
    E_INC_RESET,
    E_INC_CHANGE_BAUD,
    E_INC_LOOPBACK,
    E_INC_DEAD_ENDCLIENT,
    E_INC_SERVER_SHUTDOWN
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
   * Return an object reference of the INC_Command with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the INC_Command
   * @return a reference to the INC_Command specified by the argument
   */
  public static INC_Command getReference( String s )
  {
    return( (INC_Command)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the INC_Command with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the INC_Command
   * @return a reference to the INC_Command specified by the argument
   */
  public static INC_Command getReference( int i )
  {
    return( (INC_Command)( intHash.get( new Integer( i ) ) ) );
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
  private INC_Command( String s )
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
  private INC_Command( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this INC_Command.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this INC_Command.
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
