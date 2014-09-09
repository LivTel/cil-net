package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type WMS_Status.  These are:
 * <ul>
 * <li>E_WMS_ERR_GEN</li>
 * <li>E_WMS_ERR_SETUP</li>
 * <li>E_WMS_ERR_HEARTBEATS</li>
 * <li>E_WMS_ERR_CIL_RX</li>
 * <li>E_WMS_ERR_SDB_SUBMIT</li>
 * <li>E_WMS_CONFIGERR</li>
 * <li>E_WMS_FILEERR</li>
 * <li>E_WMS_FATALFILEERR</li>
 * <li>E_WMS_PROC_WEATHER_DATA</li>
 * <li>E_WMS_OUTOFRANGE</li>
 * <li>E_WMS_NO_SET</li>
 * <li>E_WMS_INVDATAID</li>
 * <li>E_WMS_UNEXPECTED_MSG</li>
 * <li>E_WMS_NO_COMMAND</li>
 * <li>E_WMS_STALE_FILE</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class WMS_Status
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
  private static final TTL_Package ttlPackage = TTL_Package.WMS;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static WMS_Status E_WMS_ERR_GEN =
      new WMS_Status( "E_WMS_ERR_GEN", 0, TTL_Package.E_WMS );

  /**
   * Error performing setup
   */
  public final static WMS_Status E_WMS_ERR_SETUP =
      new WMS_Status( "E_WMS_ERR_SETUP", 1, TTL_Package.E_WMS );

  /**
   * Heartbeats lost
   */
  public final static WMS_Status E_WMS_ERR_HEARTBEATS =
      new WMS_Status( "E_WMS_ERR_HEARTBEATS", 2, TTL_Package.E_WMS );

  /**
   * Unexpected CIL message received
   */
  public final static WMS_Status E_WMS_ERR_CIL_RX =
      new WMS_Status( "E_WMS_ERR_CIL_RX", 3, TTL_Package.E_WMS );

  /**
   * Error performing SDB submission
   */
  public final static WMS_Status E_WMS_ERR_SDB_SUBMIT =
      new WMS_Status( "E_WMS_ERR_SDB_SUBMIT", 4, TTL_Package.E_WMS );

  /**
   * Error reading config file
   */
  public final static WMS_Status E_WMS_CONFIGERR =
      new WMS_Status( "E_WMS_CONFIGERR", 5, TTL_Package.E_WMS );

  /**
   * Error reading weather data file
   */
  public final static WMS_Status E_WMS_FILEERR =
      new WMS_Status( "E_WMS_FILEERR", 6, TTL_Package.E_WMS );

  /**
   * Fatal error reading weather data file
   */
  public final static WMS_Status E_WMS_FATALFILEERR =
      new WMS_Status( "E_WMS_FATALFILEERR", 7, TTL_Package.E_WMS );

  /**
   * Error processing weather data
   */
  public final static WMS_Status E_WMS_PROC_WEATHER_DATA =
      new WMS_Status( "E_WMS_PROC_WEATHER_DATA", 8, TTL_Package.E_WMS );

  /**
   * Attempt to set DataId out of range
   */
  public final static WMS_Status E_WMS_OUTOFRANGE =
      new WMS_Status( "E_WMS_OUTOFRANGE", 9, TTL_Package.E_WMS );

  /**
   * Unable to set DataId
   */
  public final static WMS_Status E_WMS_NO_SET =
      new WMS_Status( "E_WMS_NO_SET", 10, TTL_Package.E_WMS );

  /**
   * Invalid dataid
   */
  public final static WMS_Status E_WMS_INVDATAID =
      new WMS_Status( "E_WMS_INVDATAID", 11, TTL_Package.E_WMS );

  /**
   * Unexpected CIL message
   */
  public final static WMS_Status E_WMS_UNEXPECTED_MSG =
      new WMS_Status( "E_WMS_UNEXPECTED_MSG", 12, TTL_Package.E_WMS );

  /**
   * Command not set up
   */
  public final static WMS_Status E_WMS_NO_COMMAND =
      new WMS_Status( "E_WMS_NO_COMMAND", 13, TTL_Package.E_WMS );

  /**
   * 
   */
  public final static WMS_Status E_WMS_STALE_FILE =
      new WMS_Status( "E_WMS_STALE_FILE", 14, TTL_Package.E_WMS );

  /**
   * Array allowing serialization.
   */
  protected static final WMS_Status[] array =
  {
    E_WMS_ERR_GEN,
    E_WMS_ERR_SETUP,
    E_WMS_ERR_HEARTBEATS,
    E_WMS_ERR_CIL_RX,
    E_WMS_ERR_SDB_SUBMIT,
    E_WMS_CONFIGERR,
    E_WMS_FILEERR,
    E_WMS_FATALFILEERR,
    E_WMS_PROC_WEATHER_DATA,
    E_WMS_OUTOFRANGE,
    E_WMS_NO_SET,
    E_WMS_INVDATAID,
    E_WMS_UNEXPECTED_MSG,
    E_WMS_NO_COMMAND,
    E_WMS_STALE_FILE
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
   * Return an object reference of the WMS_Status with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the WMS_Status
   * @return a reference to the WMS_Status specified by the argument
   */
  public static WMS_Status getReference( String s )
  {
    return( (WMS_Status)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the WMS_Status with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the WMS_Status
   * @return a reference to the WMS_Status specified by the argument
   */
  public static WMS_Status getReference( int i )
  {
    return( (WMS_Status)( intHash.get( new Integer( i ) ) ) );
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
  private WMS_Status( String s )
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
  private WMS_Status( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this WMS_Status.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this WMS_Status.
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
