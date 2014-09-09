package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type AGG_Command.  These are:
 * <ul>
 * <li>E_AGG_CMD_BOL</li>
 * <li>E_AGG_CMD_STARTSESSION</li>
 * <li>E_AGG_CMD_ENDSESSION</li>
 * <li>E_AGG_CMD_AUTOGUIDE</li>
 * <li>E_AGG_CMD_SETFIELD</li>
 * <li>E_AGG_CMD_REGFIFILE</li>
 * <li>E_AGG_CMD_RESETSLOG</li>
 * <li>E_AGG_CMD_NEXTSLOG</li>
 * <li>E_AGG_CMD_REGGIFILE</li>
 * <li>E_AGG_CMD_FULLIMAGE</li>
 * <li>E_AGG_CMD_SETITIME</li>
 * <li>E_AGG_CMD_GUILOGIN</li>
 * <li>E_AGG_CMD_ACKIMAGE</li>
 * <li>E_AGG_CMD_SETGWINDOW</li>
 * <li>E_AGG_CMD_FIELD</li>
 * <li>E_AGG_CMD_LOOPON</li>
 * <li>E_AGG_CMD_SETTEMP</li>
 * <li>E_AGG_CMD_GETTEMP</li>
 * <li>E_AGG_CMD_SETLOGPATH</li>
 * <li>E_AGG_CMD_SETFSKIP</li>
 * <li>E_AGG_CMD_ACQDFRAME</li>
 * <li>E_AGG_CMD_CENTROID</li>
 * <li>E_AGG_CMD_ITTRACK</li>
 * <li>E_AGG_CMD_SETLOOPAV</li>
 * <li>E_AGG_CMD_ACQFF</li>
 * <li>E_AGG_CMD_FREADOUT</li>
 * <li>E_AGG_CMD_INFO</li>
 * <li>E_AGG_CMD_CONFIG</li>
 * <li>E_AGG_CMD_GWTRACK</li>
 * <li>E_AGG_CMD_SVFITS</li>
 * <li>E_AGG_CMD_STOP_PROGRAM</li>
 * <li>E_AGG_CMD_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class AGG_Command
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
  private static final TTL_Package ttlPackage = TTL_Package.AGG;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * Bottom of list.
   */
  public final static AGG_Command E_AGG_CMD_BOL =
      new AGG_Command( "E_AGG_CMD_BOL", 0, TTL_Package.E_AGG );

  /**
   * Start session
   */
  public final static AGG_Command E_AGG_CMD_STARTSESSION =
      new AGG_Command( "E_AGG_CMD_STARTSESSION", 1, TTL_Package.E_AGG );

  /**
   * End session
   */
  public final static AGG_Command E_AGG_CMD_ENDSESSION =
      new AGG_Command( "E_AGG_CMD_ENDSESSION", 2, TTL_Package.E_AGG );

  /**
   * Autoguide start
   */
  public final static AGG_Command E_AGG_CMD_AUTOGUIDE =
      new AGG_Command( "E_AGG_CMD_AUTOGUIDE", 3, TTL_Package.E_AGG );

  /**
   * Set field window.
   */
  public final static AGG_Command E_AGG_CMD_SETFIELD =
      new AGG_Command( "E_AGG_CMD_SETFIELD", 4, TTL_Package.E_AGG );

  /**
   * Register field image file.
   */
  public final static AGG_Command E_AGG_CMD_REGFIFILE =
      new AGG_Command( "E_AGG_CMD_REGFIFILE", 5, TTL_Package.E_AGG );

  /**
   * Reset starlog pointer.
   */
  public final static AGG_Command E_AGG_CMD_RESETSLOG =
      new AGG_Command( "E_AGG_CMD_RESETSLOG", 6, TTL_Package.E_AGG );

  /**
   * Get next starlog entry.
   */
  public final static AGG_Command E_AGG_CMD_NEXTSLOG =
      new AGG_Command( "E_AGG_CMD_NEXTSLOG", 7, TTL_Package.E_AGG );

  /**
   * Register guide image file.
   */
  public final static AGG_Command E_AGG_CMD_REGGIFILE =
      new AGG_Command( "E_AGG_CMD_REGGIFILE", 8, TTL_Package.E_AGG );

  /**
   * Get full image.
   */
  public final static AGG_Command E_AGG_CMD_FULLIMAGE =
      new AGG_Command( "E_AGG_CMD_FULLIMAGE", 9, TTL_Package.E_AGG );

  /**
   * Set integration time.
   */
  public final static AGG_Command E_AGG_CMD_SETITIME =
      new AGG_Command( "E_AGG_CMD_SETITIME", 10, TTL_Package.E_AGG );

  /**
   * Autoguider GUI login.
   */
  public final static AGG_Command E_AGG_CMD_GUILOGIN =
      new AGG_Command( "E_AGG_CMD_GUILOGIN", 11, TTL_Package.E_AGG );

  /**
   * Acknowledge new image.
   */
  public final static AGG_Command E_AGG_CMD_ACKIMAGE =
      new AGG_Command( "E_AGG_CMD_ACKIMAGE", 12, TTL_Package.E_AGG );

  /**
   * Set guide window.
   */
  public final static AGG_Command E_AGG_CMD_SETGWINDOW =
      new AGG_Command( "E_AGG_CMD_SETGWINDOW", 13, TTL_Package.E_AGG );

  /**
   * Field ie autoguide
   */
  public final static AGG_Command E_AGG_CMD_FIELD =
      new AGG_Command( "E_AGG_CMD_FIELD", 14, TTL_Package.E_AGG );

  /**
   * Loop on.
   */
  public final static AGG_Command E_AGG_CMD_LOOPON =
      new AGG_Command( "E_AGG_CMD_LOOPON", 15, TTL_Package.E_AGG );

  /**
   * Set target chip temperature.
   */
  public final static AGG_Command E_AGG_CMD_SETTEMP =
      new AGG_Command( "E_AGG_CMD_SETTEMP", 16, TTL_Package.E_AGG );

  /**
   * Get current chip temperature.
   */
  public final static AGG_Command E_AGG_CMD_GETTEMP =
      new AGG_Command( "E_AGG_CMD_GETTEMP", 17, TTL_Package.E_AGG );

  /**
   * Set logging path.
   */
  public final static AGG_Command E_AGG_CMD_SETLOGPATH =
      new AGG_Command( "E_AGG_CMD_SETLOGPATH", 18, TTL_Package.E_AGG );

  /**
   * Set frame skip.
   */
  public final static AGG_Command E_AGG_CMD_SETFSKIP =
      new AGG_Command( "E_AGG_CMD_SETFSKIP", 19, TTL_Package.E_AGG );

  /**
   * Acquire dark frame.
   */
  public final static AGG_Command E_AGG_CMD_ACQDFRAME =
      new AGG_Command( "E_AGG_CMD_ACQDFRAME", 20, TTL_Package.E_AGG );

  /**
   * Centroid.
   */
  public final static AGG_Command E_AGG_CMD_CENTROID =
      new AGG_Command( "E_AGG_CMD_CENTROID", 21, TTL_Package.E_AGG );

  /**
   * Integration time tracking.
   */
  public final static AGG_Command E_AGG_CMD_ITTRACK =
      new AGG_Command( "E_AGG_CMD_ITTRACK", 22, TTL_Package.E_AGG );

  /**
   * Set loop average.
   */
  public final static AGG_Command E_AGG_CMD_SETLOOPAV =
      new AGG_Command( "E_AGG_CMD_SETLOOPAV", 23, TTL_Package.E_AGG );

  /**
   * Acquire flat field.
   */
  public final static AGG_Command E_AGG_CMD_ACQFF =
      new AGG_Command( "E_AGG_CMD_ACQFF", 24, TTL_Package.E_AGG );

  /**
   * Fast readout.
   */
  public final static AGG_Command E_AGG_CMD_FREADOUT =
      new AGG_Command( "E_AGG_CMD_FREADOUT", 25, TTL_Package.E_AGG );

  /**
   * Get information about guide loop.
   */
  public final static AGG_Command E_AGG_CMD_INFO =
      new AGG_Command( "E_AGG_CMD_INFO", 26, TTL_Package.E_AGG );

  /**
   * Configure guide loop parameters.
   */
  public final static AGG_Command E_AGG_CMD_CONFIG =
      new AGG_Command( "E_AGG_CMD_CONFIG", 27, TTL_Package.E_AGG );

  /**
   * Guide window tracking.
   */
  public final static AGG_Command E_AGG_CMD_GWTRACK =
      new AGG_Command( "E_AGG_CMD_GWTRACK", 28, TTL_Package.E_AGG );

  /**
   * Save full frame to fits
   */
  public final static AGG_Command E_AGG_CMD_SVFITS =
      new AGG_Command( "E_AGG_CMD_SVFITS", 29, TTL_Package.E_AGG );

  /**
   * Stop the Agg from running.
   */
  public final static AGG_Command E_AGG_CMD_STOP_PROGRAM =
      new AGG_Command( "E_AGG_CMD_STOP_PROGRAM", 30, TTL_Package.E_AGG );

  /**
   * 
   */
  public final static AGG_Command E_AGG_CMD_EOL =
      new AGG_Command( "E_AGG_CMD_EOL", 31, TTL_Package.E_AGG );

  /**
   * Array allowing serialization.
   */
  protected static final AGG_Command[] array =
  {
    E_AGG_CMD_BOL,
    E_AGG_CMD_STARTSESSION,
    E_AGG_CMD_ENDSESSION,
    E_AGG_CMD_AUTOGUIDE,
    E_AGG_CMD_SETFIELD,
    E_AGG_CMD_REGFIFILE,
    E_AGG_CMD_RESETSLOG,
    E_AGG_CMD_NEXTSLOG,
    E_AGG_CMD_REGGIFILE,
    E_AGG_CMD_FULLIMAGE,
    E_AGG_CMD_SETITIME,
    E_AGG_CMD_GUILOGIN,
    E_AGG_CMD_ACKIMAGE,
    E_AGG_CMD_SETGWINDOW,
    E_AGG_CMD_FIELD,
    E_AGG_CMD_LOOPON,
    E_AGG_CMD_SETTEMP,
    E_AGG_CMD_GETTEMP,
    E_AGG_CMD_SETLOGPATH,
    E_AGG_CMD_SETFSKIP,
    E_AGG_CMD_ACQDFRAME,
    E_AGG_CMD_CENTROID,
    E_AGG_CMD_ITTRACK,
    E_AGG_CMD_SETLOOPAV,
    E_AGG_CMD_ACQFF,
    E_AGG_CMD_FREADOUT,
    E_AGG_CMD_INFO,
    E_AGG_CMD_CONFIG,
    E_AGG_CMD_GWTRACK,
    E_AGG_CMD_SVFITS,
    E_AGG_CMD_STOP_PROGRAM,
    E_AGG_CMD_EOL
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
   * Return an object reference of the AGG_Command with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the AGG_Command
   * @return a reference to the AGG_Command specified by the argument
   */
  public static AGG_Command getReference( String s )
  {
    return( (AGG_Command)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the AGG_Command with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the AGG_Command
   * @return a reference to the AGG_Command specified by the argument
   */
  public static AGG_Command getReference( int i )
  {
    return( (AGG_Command)( intHash.get( new Integer( i ) ) ) );
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
  private AGG_Command( String s )
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
  private AGG_Command( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this AGG_Command.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this AGG_Command.
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
