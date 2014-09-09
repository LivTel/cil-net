package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type SIF_State.  These are:
 * <ul>
 * <li>E_SIF_SIF_UNINITIALISED</li>
 * <li>E_SIF_SIF_INITIALISE</li>
 * <li>E_SIF_SIF_IDLE</li>
 * <li>E_SIF_SIF_PRELOAD</li>
 * <li>E_SIF_SIF_CENTRE</li>
 * <li>E_SIF_SIF_OPERATE</li>
 * <li>E_SIF_SIF_UNLOAD</li>
 * <li>E_SIF_SIF_TERMINATE</li>
 * <li>E_SIF_SIF_OP_STATE_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class SIF_State
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
  private static final TTL_Package ttlPackage = TTL_Package.SIF;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static SIF_State E_SIF_SIF_UNINITIALISED =
      new SIF_State( "E_SIF_SIF_UNINITIALISED", 0, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_State E_SIF_SIF_INITIALISE =
      new SIF_State( "E_SIF_SIF_INITIALISE", 1, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_State E_SIF_SIF_IDLE =
      new SIF_State( "E_SIF_SIF_IDLE", 2, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_State E_SIF_SIF_PRELOAD =
      new SIF_State( "E_SIF_SIF_PRELOAD", 3, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_State E_SIF_SIF_CENTRE =
      new SIF_State( "E_SIF_SIF_CENTRE", 4, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_State E_SIF_SIF_OPERATE =
      new SIF_State( "E_SIF_SIF_OPERATE", 5, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_State E_SIF_SIF_UNLOAD =
      new SIF_State( "E_SIF_SIF_UNLOAD", 6, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_State E_SIF_SIF_TERMINATE =
      new SIF_State( "E_SIF_SIF_TERMINATE", 7, TTL_Package.E_SIF );

  /**
   * 
   */
  public final static SIF_State E_SIF_SIF_OP_STATE_EOL =
      new SIF_State( "E_SIF_SIF_OP_STATE_EOL", 8, TTL_Package.E_SIF );

  /**
   * Array allowing serialization.
   */
  protected static final SIF_State[] array =
  {
    E_SIF_SIF_UNINITIALISED,
    E_SIF_SIF_INITIALISE,
    E_SIF_SIF_IDLE,
    E_SIF_SIF_PRELOAD,
    E_SIF_SIF_CENTRE,
    E_SIF_SIF_OPERATE,
    E_SIF_SIF_UNLOAD,
    E_SIF_SIF_TERMINATE,
    E_SIF_SIF_OP_STATE_EOL
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
   * Return an object reference of the SIF_State with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the SIF_State
   * @return a reference to the SIF_State specified by the argument
   */
  public static SIF_State getReference( String s )
  {
    return( (SIF_State)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the SIF_State with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the SIF_State
   * @return a reference to the SIF_State specified by the argument
   */
  public static SIF_State getReference( int i )
  {
    return( (SIF_State)( intHash.get( new Integer( i ) ) ) );
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
  private SIF_State( String s )
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
  private SIF_State( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this SIF_State.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this SIF_State.
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
