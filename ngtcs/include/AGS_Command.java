package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type AGS_Command.  These are:
 * <ul>
 * <li>E_AGS_CMD_BOL</li>
 * <li>E_AGS_AUTOGUIDE_ON_BRIGHTEST</li>
 * <li>E_AGS_AUTOGUIDE_ON_RANK</li>
 * <li>E_AGS_AUTOGUIDE_ON_RANGE</li>
 * <li>E_AGS_AUTOGUIDE_ON_PIXEL</li>
 * <li>E_AGS_AUTOGUIDE_OFF</li>
 * <li>E_AGS_CONF_EXP_TIME</li>
 * <li>E_AGS_CONF_FRAME_RATE</li>
 * <li>E_AGS_CONF_FRAME_AVERAGE</li>
 * <li>E_AGS_CONF_CALIB</li>
 * <li>E_AGS_START_SESSION</li>
 * <li>E_AGS_END_SESSION</li>
 * <li>E_AGS_LOGGING</li>
 * <li>E_AGS_CMD_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class AGS_Command
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
  private static final TTL_Package ttlPackage = TTL_Package.AGS;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * Bottom of list.
   */
  public final static AGS_Command E_AGS_CMD_BOL =
      new AGS_Command( "E_AGS_CMD_BOL", 0, TTL_Package.E_AGS );

  /**
   * Guide on brightest object.
   */
  public final static AGS_Command E_AGS_AUTOGUIDE_ON_BRIGHTEST =
      new AGS_Command( "E_AGS_AUTOGUIDE_ON_BRIGHTEST", 1, TTL_Package.E_AGS );

  /**
   * Guide on n'th brightest object.
   */
  public final static AGS_Command E_AGS_AUTOGUIDE_ON_RANK =
      new AGS_Command( "E_AGS_AUTOGUIDE_ON_RANK", 2, TTL_Package.E_AGS );

  /**
   * Guide on object in range of star mags.
   */
  public final static AGS_Command E_AGS_AUTOGUIDE_ON_RANGE =
      new AGS_Command( "E_AGS_AUTOGUIDE_ON_RANGE", 3, TTL_Package.E_AGS );

  /**
   * Guide on object nearest to pixel.
   */
  public final static AGS_Command E_AGS_AUTOGUIDE_ON_PIXEL =
      new AGS_Command( "E_AGS_AUTOGUIDE_ON_PIXEL", 4, TTL_Package.E_AGS );

  /**
   * Stop guide loop.
   */
  public final static AGS_Command E_AGS_AUTOGUIDE_OFF =
      new AGS_Command( "E_AGS_AUTOGUIDE_OFF", 5, TTL_Package.E_AGS );

  /**
   * Configure exposure (integration) time.
   */
  public final static AGS_Command E_AGS_CONF_EXP_TIME =
      new AGS_Command( "E_AGS_CONF_EXP_TIME", 6, TTL_Package.E_AGS );

  /**
   * Configure frame rate.
   */
  public final static AGS_Command E_AGS_CONF_FRAME_RATE =
      new AGS_Command( "E_AGS_CONF_FRAME_RATE", 7, TTL_Package.E_AGS );

  /**
   * Configure frame average.
   */
  public final static AGS_Command E_AGS_CONF_FRAME_AVERAGE =
      new AGS_Command( "E_AGS_CONF_FRAME_AVERAGE", 8, TTL_Package.E_AGS );

  /**
   * Configure grey level >star mag calcs.
   */
  public final static AGS_Command E_AGS_CONF_CALIB =
      new AGS_Command( "E_AGS_CONF_CALIB", 9, TTL_Package.E_AGS );

  /**
   * Start session (turn on cooling).
   */
  public final static AGS_Command E_AGS_START_SESSION =
      new AGS_Command( "E_AGS_START_SESSION", 10, TTL_Package.E_AGS );

  /**
   * End session (turn off cooling).
   */
  public final static AGS_Command E_AGS_END_SESSION =
      new AGS_Command( "E_AGS_END_SESSION", 11, TTL_Package.E_AGS );

  /**
   * Turn logging on or off for Agg.
   */
  public final static AGS_Command E_AGS_LOGGING =
      new AGS_Command( "E_AGS_LOGGING", 12, TTL_Package.E_AGS );

  /**
   * 
   */
  public final static AGS_Command E_AGS_CMD_EOL =
      new AGS_Command( "E_AGS_CMD_EOL", 13, TTL_Package.E_AGS );

  /**
   * Array allowing serialization.
   */
  protected static final AGS_Command[] array =
  {
    E_AGS_CMD_BOL,
    E_AGS_AUTOGUIDE_ON_BRIGHTEST,
    E_AGS_AUTOGUIDE_ON_RANK,
    E_AGS_AUTOGUIDE_ON_RANGE,
    E_AGS_AUTOGUIDE_ON_PIXEL,
    E_AGS_AUTOGUIDE_OFF,
    E_AGS_CONF_EXP_TIME,
    E_AGS_CONF_FRAME_RATE,
    E_AGS_CONF_FRAME_AVERAGE,
    E_AGS_CONF_CALIB,
    E_AGS_START_SESSION,
    E_AGS_END_SESSION,
    E_AGS_LOGGING,
    E_AGS_CMD_EOL
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
   * Return an object reference of the AGS_Command with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the AGS_Command
   * @return a reference to the AGS_Command specified by the argument
   */
  public static AGS_Command getReference( String s )
  {
    return( (AGS_Command)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the AGS_Command with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the AGS_Command
   * @return a reference to the AGS_Command specified by the argument
   */
  public static AGS_Command getReference( int i )
  {
    return( (AGS_Command)( intHash.get( new Integer( i ) ) ) );
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
  private AGS_Command( String s )
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
  private AGS_Command( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this AGS_Command.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this AGS_Command.
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
