package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type INC_Status.  These are:
 * <ul>
 * <li>E_INC_GEN_ERROR</li>
 * <li>E_INC_INIT_FAIL</li>
 * <li>E_INC_SHUTDOWN_ERROR</li>
 * <li>E_INC_INVALID_DATA_LEN</li>
 * <li>E_INC_INVALID_COMMAND</li>
 * <li>E_INC_REPLY_FAIL</li>
 * <li>E_INC_SERVER_STARTUP_FAIL</li>
 * <li>E_INC_SERVER_SHUTDOWN_FAIL</li>
 * <li>E_INC_SERVER_NOT_RUNNING</li>
 * <li>E_INC_SERVER_SEND_FAIL</li>
 * <li>E_INC_SERIAL_TX_FAIL</li>
 * <li>E_INC_SERIAL_TXLEN_ERR</li>
 * <li>E_INC_SERIAL_RX_FAIL</li>
 * <li>E_INC_SERIAL_CHK_ERR</li>
 * <li>E_INC_ENCODER_NOT_FOUND</li>
 * <li>E_INC_TIMER_SETUP_ERR</li>
 * <li>E_INC_TIMER_CLOSE_ERR</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class INC_Status
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
  public final static INC_Status E_INC_GEN_ERROR =
      new INC_Status( "E_INC_GEN_ERROR", 0, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Status E_INC_INIT_FAIL =
      new INC_Status( "E_INC_INIT_FAIL", 1, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Status E_INC_SHUTDOWN_ERROR =
      new INC_Status( "E_INC_SHUTDOWN_ERROR", 2, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Status E_INC_INVALID_DATA_LEN =
      new INC_Status( "E_INC_INVALID_DATA_LEN", 3, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Status E_INC_INVALID_COMMAND =
      new INC_Status( "E_INC_INVALID_COMMAND", 4, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Status E_INC_REPLY_FAIL =
      new INC_Status( "E_INC_REPLY_FAIL", 5, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Status E_INC_SERVER_STARTUP_FAIL =
      new INC_Status( "E_INC_SERVER_STARTUP_FAIL", 6, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Status E_INC_SERVER_SHUTDOWN_FAIL =
      new INC_Status( "E_INC_SERVER_SHUTDOWN_FAIL", 7, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Status E_INC_SERVER_NOT_RUNNING =
      new INC_Status( "E_INC_SERVER_NOT_RUNNING", 8, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Status E_INC_SERVER_SEND_FAIL =
      new INC_Status( "E_INC_SERVER_SEND_FAIL", 9, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Status E_INC_SERIAL_TX_FAIL =
      new INC_Status( "E_INC_SERIAL_TX_FAIL", 10, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Status E_INC_SERIAL_TXLEN_ERR =
      new INC_Status( "E_INC_SERIAL_TXLEN_ERR", 11, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Status E_INC_SERIAL_RX_FAIL =
      new INC_Status( "E_INC_SERIAL_RX_FAIL", 12, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Status E_INC_SERIAL_CHK_ERR =
      new INC_Status( "E_INC_SERIAL_CHK_ERR", 13, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Status E_INC_ENCODER_NOT_FOUND =
      new INC_Status( "E_INC_ENCODER_NOT_FOUND", 14, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Status E_INC_TIMER_SETUP_ERR =
      new INC_Status( "E_INC_TIMER_SETUP_ERR", 15, TTL_Package.E_INC );

  /**
   * 
   */
  public final static INC_Status E_INC_TIMER_CLOSE_ERR =
      new INC_Status( "E_INC_TIMER_CLOSE_ERR", 16, TTL_Package.E_INC );

  /**
   * Array allowing serialization.
   */
  protected static final INC_Status[] array =
  {
    E_INC_GEN_ERROR,
    E_INC_INIT_FAIL,
    E_INC_SHUTDOWN_ERROR,
    E_INC_INVALID_DATA_LEN,
    E_INC_INVALID_COMMAND,
    E_INC_REPLY_FAIL,
    E_INC_SERVER_STARTUP_FAIL,
    E_INC_SERVER_SHUTDOWN_FAIL,
    E_INC_SERVER_NOT_RUNNING,
    E_INC_SERVER_SEND_FAIL,
    E_INC_SERIAL_TX_FAIL,
    E_INC_SERIAL_TXLEN_ERR,
    E_INC_SERIAL_RX_FAIL,
    E_INC_SERIAL_CHK_ERR,
    E_INC_ENCODER_NOT_FOUND,
    E_INC_TIMER_SETUP_ERR,
    E_INC_TIMER_CLOSE_ERR
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
   * Return an object reference of the INC_Status with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the INC_Status
   * @return a reference to the INC_Status specified by the argument
   */
  public static INC_Status getReference( String s )
  {
    return( (INC_Status)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the INC_Status with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the INC_Status
   * @return a reference to the INC_Status specified by the argument
   */
  public static INC_Status getReference( int i )
  {
    return( (INC_Status)( intHash.get( new Integer( i ) ) ) );
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
  private INC_Status( String s )
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
  private INC_Status( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this INC_Status.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this INC_Status.
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
