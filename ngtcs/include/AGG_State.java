package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type AGG_State.  These are:
 * <ul>
 * <li>E_AGG_STATE_UNKNOWN</li>
 * <li>E_AGG_STATE_OK</li>
 * <li>E_AGG_STATE_OFF</li>
 * <li>E_AGG_STATE_STANDBY</li>
 * <li>E_AGG_STATE_IDLE</li>
 * <li>E_AGG_STATE_WORKING</li>
 * <li>E_AGG_STATE_INIT</li>
 * <li>E_AGG_STATE_FAILED</li>
 * <li>E_AGG_STATE_INTWORK</li>
 * <li>E_AGG_STATE_ERROR</li>
 * <li>E_AGG_STATE_NONRECERR</li>
 * <li>E_AGG_STATE_LOOP_RUNNING</li>
 * <li>E_AGG_STATE_GUIDEONBRIGHT</li>
 * <li>E_AGG_STATE_GUIDEONRANGE</li>
 * <li>E_AGG_STATE_GUIDEONRANK</li>
 * <li>E_AGG_STATE_GUIDEONPIXEL</li>
 * <li>E_AGG_STATE_INTON</li>
 * <li>E_AGG_TSTATE_AT_TEMP</li>
 * <li>E_AGG_TSTATE_ABOVE_TEMP</li>
 * <li>E_AGG_TSTATE_BELOW_TEMP</li>
 * <li>E_AGG_TSTATE_ERROR</li>
 * <li>E_AGG_STATE_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class AGG_State
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
   * 
   */
  public final static AGG_State E_AGG_STATE_UNKNOWN =
      new AGG_State( "E_AGG_STATE_UNKNOWN", 0, TTL_Package.E_AGG );

  /**
   * 
   */
  public final static AGG_State E_AGG_STATE_OK =
      new AGG_State( "E_AGG_STATE_OK", 1, TTL_Package.E_AGG );

  /**
   * 
   */
  public final static AGG_State E_AGG_STATE_OFF =
      new AGG_State( "E_AGG_STATE_OFF", 2, TTL_Package.E_AGG );

  /**
   * 
   */
  public final static AGG_State E_AGG_STATE_STANDBY =
      new AGG_State( "E_AGG_STATE_STANDBY", 3, TTL_Package.E_AGG );

  /**
   * 
   */
  public final static AGG_State E_AGG_STATE_IDLE =
      new AGG_State( "E_AGG_STATE_IDLE", 4, TTL_Package.E_AGG );

  /**
   * 
   */
  public final static AGG_State E_AGG_STATE_WORKING =
      new AGG_State( "E_AGG_STATE_WORKING", 5, TTL_Package.E_AGG );

  /**
   * 
   */
  public final static AGG_State E_AGG_STATE_INIT =
      new AGG_State( "E_AGG_STATE_INIT", 6, TTL_Package.E_AGG );

  /**
   * 
   */
  public final static AGG_State E_AGG_STATE_FAILED =
      new AGG_State( "E_AGG_STATE_FAILED", 7, TTL_Package.E_AGG );

  /**
   * 
   */
  public final static AGG_State E_AGG_STATE_INTWORK =
      new AGG_State( "E_AGG_STATE_INTWORK", 8, TTL_Package.E_AGG );

  /**
   * 
   */
  public final static AGG_State E_AGG_STATE_ERROR =
      new AGG_State( "E_AGG_STATE_ERROR", 9, TTL_Package.E_AGG );

  /**
   * 
   */
  public final static AGG_State E_AGG_STATE_NONRECERR =
      new AGG_State( "E_AGG_STATE_NONRECERR", 10, TTL_Package.E_AGG );

  /**
   * 
   */
  public final static AGG_State E_AGG_STATE_LOOP_RUNNING =
      new AGG_State( "E_AGG_STATE_LOOP_RUNNING", 11, TTL_Package.E_AGG );

  /**
   * E_AGG_BRIGHTEST
   */
  public final static AGG_State E_AGG_STATE_GUIDEONBRIGHT =
      new AGG_State( "E_AGG_STATE_GUIDEONBRIGHT", 12, TTL_Package.E_AGG );

  /**
   * E_AGG_RANGE
   */
  public final static AGG_State E_AGG_STATE_GUIDEONRANGE =
      new AGG_State( "E_AGG_STATE_GUIDEONRANGE", 13, TTL_Package.E_AGG );

  /**
   * E_AGG_RANK
   */
  public final static AGG_State E_AGG_STATE_GUIDEONRANK =
      new AGG_State( "E_AGG_STATE_GUIDEONRANK", 14, TTL_Package.E_AGG );

  /**
   * E_AGG_PIXEL
   */
  public final static AGG_State E_AGG_STATE_GUIDEONPIXEL =
      new AGG_State( "E_AGG_STATE_GUIDEONPIXEL", 15, TTL_Package.E_AGG );

  /**
   * 
   */
  public final static AGG_State E_AGG_STATE_INTON =
      new AGG_State( "E_AGG_STATE_INTON", 16, TTL_Package.E_AGG );

  /**
   * 
   */
  public final static AGG_State E_AGG_TSTATE_AT_TEMP =
      new AGG_State( "E_AGG_TSTATE_AT_TEMP", 17, TTL_Package.E_AGG );

  /**
   * 
   */
  public final static AGG_State E_AGG_TSTATE_ABOVE_TEMP =
      new AGG_State( "E_AGG_TSTATE_ABOVE_TEMP", 18, TTL_Package.E_AGG );

  /**
   * 
   */
  public final static AGG_State E_AGG_TSTATE_BELOW_TEMP =
      new AGG_State( "E_AGG_TSTATE_BELOW_TEMP", 19, TTL_Package.E_AGG );

  /**
   * 
   */
  public final static AGG_State E_AGG_TSTATE_ERROR =
      new AGG_State( "E_AGG_TSTATE_ERROR", 20, TTL_Package.E_AGG );

  /**
   * 
   */
  public final static AGG_State E_AGG_STATE_EOL =
      new AGG_State( "E_AGG_STATE_EOL", 21, TTL_Package.E_AGG );

  /**
   * Array allowing serialization.
   */
  protected static final AGG_State[] array =
  {
    E_AGG_STATE_UNKNOWN,
    E_AGG_STATE_OK,
    E_AGG_STATE_OFF,
    E_AGG_STATE_STANDBY,
    E_AGG_STATE_IDLE,
    E_AGG_STATE_WORKING,
    E_AGG_STATE_INIT,
    E_AGG_STATE_FAILED,
    E_AGG_STATE_INTWORK,
    E_AGG_STATE_ERROR,
    E_AGG_STATE_NONRECERR,
    E_AGG_STATE_LOOP_RUNNING,
    E_AGG_STATE_GUIDEONBRIGHT,
    E_AGG_STATE_GUIDEONRANGE,
    E_AGG_STATE_GUIDEONRANK,
    E_AGG_STATE_GUIDEONPIXEL,
    E_AGG_STATE_INTON,
    E_AGG_TSTATE_AT_TEMP,
    E_AGG_TSTATE_ABOVE_TEMP,
    E_AGG_TSTATE_BELOW_TEMP,
    E_AGG_TSTATE_ERROR,
    E_AGG_STATE_EOL
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
   * Return an object reference of the AGG_State with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the AGG_State
   * @return a reference to the AGG_State specified by the argument
   */
  public static AGG_State getReference( String s )
  {
    return( (AGG_State)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the AGG_State with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the AGG_State
   * @return a reference to the AGG_State specified by the argument
   */
  public static AGG_State getReference( int i )
  {
    return( (AGG_State)( intHash.get( new Integer( i ) ) ) );
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
  private AGG_State( String s )
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
  private AGG_State( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this AGG_State.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this AGG_State.
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
