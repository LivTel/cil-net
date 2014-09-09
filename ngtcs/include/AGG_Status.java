package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type AGG_Status.  These are:
 * <ul>
 * <li>E_AGG_GEN_ERR</li>
 * <li>E_AGG_LOOP_STOPPING</li>
 * <li>E_AGG_LOOP_RUNNING</li>
 * <li>E_AGG_CMD_NOT_PERMITTED</li>
 * <li>E_AGG_CMD_BAD_FORMAT</li>
 * <li>E_AGG_MEMERR</li>
 * <li>E_AGG_SEM_ERR</li>
 * <li>E_AGG_SHMEM_ERR</li>
 * <li>E_AGG_HW_ERR</li>
 * <li>E_AGG_CMD_UNKNOWN</li>
 * <li>E_AGG_CMD_CONTEXT_1</li>
 * <li>E_AGG_CAMOK</li>
 * <li>E_AGG_PROXERR</li>
 * <li>E_AGG_FORKERR</li>
 * <li>E_AGG_BADPARAM</li>
 * <li>E_AGG_IMERR</li>
 * <li>E_AGG_NOSTAR</li>
 * <li>E_AGG_COMMSERR</li>
 * <li>E_AGG_DMERR</li>
 * <li>E_AGG_FILERR</li>
 * <li>E_AGG_INTCANCEL</li>
 * <li>E_AGG_CMDREPLIED</li>
 * <li>E_AGG_STATUS_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class AGG_Status
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
  public final static AGG_Status E_AGG_GEN_ERR =
      new AGG_Status( "E_AGG_GEN_ERR", 0, TTL_Package.E_AGG );

  /**
   * Guide loop stopping.
   */
  public final static AGG_Status E_AGG_LOOP_STOPPING =
      new AGG_Status( "E_AGG_LOOP_STOPPING", 1, TTL_Package.E_AGG );

  /**
   * Guide loop running.
   */
  public final static AGG_Status E_AGG_LOOP_RUNNING =
      new AGG_Status( "E_AGG_LOOP_RUNNING", 2, TTL_Package.E_AGG );

  /**
   * Command not permitted.
   */
  public final static AGG_Status E_AGG_CMD_NOT_PERMITTED =
      new AGG_Status( "E_AGG_CMD_NOT_PERMITTED", 3, TTL_Package.E_AGG );

  /**
   * Command has bad format.
   */
  public final static AGG_Status E_AGG_CMD_BAD_FORMAT =
      new AGG_Status( "E_AGG_CMD_BAD_FORMAT", 4, TTL_Package.E_AGG );

  /**
   * Error allocating memory.
   */
  public final static AGG_Status E_AGG_MEMERR =
      new AGG_Status( "E_AGG_MEMERR", 5, TTL_Package.E_AGG );

  /**
   * Semaphore error.
   */
  public final static AGG_Status E_AGG_SEM_ERR =
      new AGG_Status( "E_AGG_SEM_ERR", 6, TTL_Package.E_AGG );

  /**
   * Shared memory error.
   */
  public final static AGG_Status E_AGG_SHMEM_ERR =
      new AGG_Status( "E_AGG_SHMEM_ERR", 7, TTL_Package.E_AGG );

  /**
   * Hardware error.
   */
  public final static AGG_Status E_AGG_HW_ERR =
      new AGG_Status( "E_AGG_HW_ERR", 8, TTL_Package.E_AGG );

  /**
   * Unknown command.
   */
  public final static AGG_Status E_AGG_CMD_UNKNOWN =
      new AGG_Status( "E_AGG_CMD_UNKNOWN", 9, TTL_Package.E_AGG );

  /**
   * Last starlog entry.
   */
  public final static AGG_Status E_AGG_CMD_CONTEXT_1 =
      new AGG_Status( "E_AGG_CMD_CONTEXT_1", 10, TTL_Package.E_AGG );

  /**
   * Camera OK.
   */
  public final static AGG_Status E_AGG_CAMOK =
      new AGG_Status( "E_AGG_CAMOK", 11, TTL_Package.E_AGG );

  /**
   * Error creating proxy.
   */
  public final static AGG_Status E_AGG_PROXERR =
      new AGG_Status( "E_AGG_PROXERR", 12, TTL_Package.E_AGG );

  /**
   * Error forking process.
   */
  public final static AGG_Status E_AGG_FORKERR =
      new AGG_Status( "E_AGG_FORKERR", 13, TTL_Package.E_AGG );

  /**
   * Parameter in error.
   */
  public final static AGG_Status E_AGG_BADPARAM =
      new AGG_Status( "E_AGG_BADPARAM", 14, TTL_Package.E_AGG );

  /**
   * Image error.
   */
  public final static AGG_Status E_AGG_IMERR =
      new AGG_Status( "E_AGG_IMERR", 15, TTL_Package.E_AGG );

  /**
   * No suitable star found.
   */
  public final static AGG_Status E_AGG_NOSTAR =
      new AGG_Status( "E_AGG_NOSTAR", 16, TTL_Package.E_AGG );

  /**
   * Comms error.
   */
  public final static AGG_Status E_AGG_COMMSERR =
      new AGG_Status( "E_AGG_COMMSERR", 17, TTL_Package.E_AGG );

  /**
   * Error in defect map.
   */
  public final static AGG_Status E_AGG_DMERR =
      new AGG_Status( "E_AGG_DMERR", 18, TTL_Package.E_AGG );

  /**
   * File error.
   */
  public final static AGG_Status E_AGG_FILERR =
      new AGG_Status( "E_AGG_FILERR", 19, TTL_Package.E_AGG );

  /**
   * Integration cancelled by user.
   */
  public final static AGG_Status E_AGG_INTCANCEL =
      new AGG_Status( "E_AGG_INTCANCEL", 20, TTL_Package.E_AGG );

  /**
   * Reply already sent in response to command.
   */
  public final static AGG_Status E_AGG_CMDREPLIED =
      new AGG_Status( "E_AGG_CMDREPLIED", 21, TTL_Package.E_AGG );

  /**
   * 
   */
  public final static AGG_Status E_AGG_STATUS_EOL =
      new AGG_Status( "E_AGG_STATUS_EOL", 22, TTL_Package.E_AGG );

  /**
   * Array allowing serialization.
   */
  protected static final AGG_Status[] array =
  {
    E_AGG_GEN_ERR,
    E_AGG_LOOP_STOPPING,
    E_AGG_LOOP_RUNNING,
    E_AGG_CMD_NOT_PERMITTED,
    E_AGG_CMD_BAD_FORMAT,
    E_AGG_MEMERR,
    E_AGG_SEM_ERR,
    E_AGG_SHMEM_ERR,
    E_AGG_HW_ERR,
    E_AGG_CMD_UNKNOWN,
    E_AGG_CMD_CONTEXT_1,
    E_AGG_CAMOK,
    E_AGG_PROXERR,
    E_AGG_FORKERR,
    E_AGG_BADPARAM,
    E_AGG_IMERR,
    E_AGG_NOSTAR,
    E_AGG_COMMSERR,
    E_AGG_DMERR,
    E_AGG_FILERR,
    E_AGG_INTCANCEL,
    E_AGG_CMDREPLIED,
    E_AGG_STATUS_EOL
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
   * Return an object reference of the AGG_Status with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the AGG_Status
   * @return a reference to the AGG_Status specified by the argument
   */
  public static AGG_Status getReference( String s )
  {
    return( (AGG_Status)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the AGG_Status with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the AGG_Status
   * @return a reference to the AGG_Status specified by the argument
   */
  public static AGG_Status getReference( int i )
  {
    return( (AGG_Status)( intHash.get( new Integer( i ) ) ) );
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
  private AGG_Status( String s )
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
  private AGG_Status( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this AGG_Status.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this AGG_Status.
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
