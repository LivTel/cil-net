package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type AGC_Status.  These are:
 * <ul>
 * <li>E_AGC_GEN_ERR</li>
 * <li>E_AGC_PCIFIND_ERR</li>
 * <li>E_AGC_PCIREAD_ERR</li>
 * <li>E_AGC_PCIWRITE_ERR</li>
 * <li>E_AGC_QNXCOM_ERR</li>
 * <li>E_AGC_IRQ_ERR</li>
 * <li>E_AGC_PROXY_ERR</li>
 * <li>E_AGC_COMMS_ERR</li>
 * <li>E_AGC_HW_ERR</li>
 * <li>E_AGC_STREAM_ERR</li>
 * <li>E_AGC_SEND_COM_TIMEOUT</li>
 * <li>E_AGC_STATUS_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class AGC_Status
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
  private static final TTL_Package ttlPackage = TTL_Package.AGC;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * Miscellaneous error.
   */
  public final static AGC_Status E_AGC_GEN_ERR =
      new AGC_Status( "E_AGC_GEN_ERR", 0, TTL_Package.E_AGC );

  /**
   * Error in finding PCI card
   */
  public final static AGC_Status E_AGC_PCIFIND_ERR =
      new AGC_Status( "E_AGC_PCIFIND_ERR", 1, TTL_Package.E_AGC );

  /**
   * Error reading PCI card
   */
  public final static AGC_Status E_AGC_PCIREAD_ERR =
      new AGC_Status( "E_AGC_PCIREAD_ERR", 2, TTL_Package.E_AGC );

  /**
   * Error writing to PCI card
   */
  public final static AGC_Status E_AGC_PCIWRITE_ERR =
      new AGC_Status( "E_AGC_PCIWRITE_ERR", 3, TTL_Package.E_AGC );

  /**
   * QNX command error
   */
  public final static AGC_Status E_AGC_QNXCOM_ERR =
      new AGC_Status( "E_AGC_QNXCOM_ERR", 4, TTL_Package.E_AGC );

  /**
   * Error setting irq
   */
  public final static AGC_Status E_AGC_IRQ_ERR =
      new AGC_Status( "E_AGC_IRQ_ERR", 5, TTL_Package.E_AGC );

  /**
   * Error setting proxy
   */
  public final static AGC_Status E_AGC_PROXY_ERR =
      new AGC_Status( "E_AGC_PROXY_ERR", 6, TTL_Package.E_AGC );

  /**
   * Communication error
   */
  public final static AGC_Status E_AGC_COMMS_ERR =
      new AGC_Status( "E_AGC_COMMS_ERR", 7, TTL_Package.E_AGC );

  /**
   * Hardware error.
   */
  public final static AGC_Status E_AGC_HW_ERR =
      new AGC_Status( "E_AGC_HW_ERR", 8, TTL_Package.E_AGC );

  /**
   * Error with stream buffer
   */
  public final static AGC_Status E_AGC_STREAM_ERR =
      new AGC_Status( "E_AGC_STREAM_ERR", 9, TTL_Package.E_AGC );

  /**
   * SendCommand timedout
   */
  public final static AGC_Status E_AGC_SEND_COM_TIMEOUT =
      new AGC_Status( "E_AGC_SEND_COM_TIMEOUT", 10, TTL_Package.E_AGC );

  /**
   * 
   */
  public final static AGC_Status E_AGC_STATUS_EOL =
      new AGC_Status( "E_AGC_STATUS_EOL", 11, TTL_Package.E_AGC );

  /**
   * Array allowing serialization.
   */
  protected static final AGC_Status[] array =
  {
    E_AGC_GEN_ERR,
    E_AGC_PCIFIND_ERR,
    E_AGC_PCIREAD_ERR,
    E_AGC_PCIWRITE_ERR,
    E_AGC_QNXCOM_ERR,
    E_AGC_IRQ_ERR,
    E_AGC_PROXY_ERR,
    E_AGC_COMMS_ERR,
    E_AGC_HW_ERR,
    E_AGC_STREAM_ERR,
    E_AGC_SEND_COM_TIMEOUT,
    E_AGC_STATUS_EOL
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
   * Return an object reference of the AGC_Status with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the AGC_Status
   * @return a reference to the AGC_Status specified by the argument
   */
  public static AGC_Status getReference( String s )
  {
    return( (AGC_Status)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the AGC_Status with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the AGC_Status
   * @return a reference to the AGC_Status specified by the argument
   */
  public static AGC_Status getReference( int i )
  {
    return( (AGC_Status)( intHash.get( new Integer( i ) ) ) );
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
  private AGC_Status( String s )
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
  private AGC_Status( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this AGC_Status.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this AGC_Status.
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
