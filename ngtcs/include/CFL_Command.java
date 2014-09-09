package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type CFL_Command.  These are:
 * <ul>
 * <li>I_CFL_COMMAND_BOL</li>
 * <li>I_CFL_MIF_AXIS_TORQUE_DEMAND</li>
 * <li>I_CFL_MIF_FILTERED_MOTOR_1_DAC_BITS</li>
 * <li>I_CFL_MIF_FILTERED_MOTOR_2_DAC_BITS</li>
 * <li>I_CFL_VEN_MOTOR_ENC_1_COUNT</li>
 * <li>I_CFL_VEN_MOTOR_ENC_2_COUNT</li>
 * <li>I_CFL_VEN_AXIS_ENC_1_COUNT</li>
 * <li>I_CFL_VEN_AXIS_ENC_2_COUNT</li>
 * <li>I_CFL_VEN_AXIS_ENC_3_COUNT</li>
 * <li>I_CFL_VEN_AXIS_ENC_4_COUNT</li>
 * <li>I_CFL_VEN_AXIS_ENC_1_ABS_POSITION</li>
 * <li>I_CFL_VEN_AXIS_ENC_2_ABS_POSITION</li>
 * <li>I_CFL_VEN_AXIS_ENC_3_ABS_POSITION</li>
 * <li>I_CFL_VEN_AXIS_ENC_4_ABS_POSITION</li>
 * <li>I_CFL_AES_POSITION</li>
 * <li>I_CFL_TFP_CURRENT_TIME</li>
 * <li>I_CFL_COMMAND_EOL</li>
 * <li>I_CFL_COMMAND_MAX</li>
 * <li>I_CFL_COMMAND_EMPTY</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class CFL_Command
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
  private static final TTL_Package ttlPackage = TTL_Package.CFL;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static CFL_Command I_CFL_COMMAND_BOL =
      new CFL_Command( "I_CFL_COMMAND_BOL", 0, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Command I_CFL_MIF_AXIS_TORQUE_DEMAND =
      new CFL_Command( "I_CFL_MIF_AXIS_TORQUE_DEMAND", 1, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Command I_CFL_MIF_FILTERED_MOTOR_1_DAC_BITS =
      new CFL_Command( "I_CFL_MIF_FILTERED_MOTOR_1_DAC_BITS", 2, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Command I_CFL_MIF_FILTERED_MOTOR_2_DAC_BITS =
      new CFL_Command( "I_CFL_MIF_FILTERED_MOTOR_2_DAC_BITS", 3, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Command I_CFL_VEN_MOTOR_ENC_1_COUNT =
      new CFL_Command( "I_CFL_VEN_MOTOR_ENC_1_COUNT", 4, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Command I_CFL_VEN_MOTOR_ENC_2_COUNT =
      new CFL_Command( "I_CFL_VEN_MOTOR_ENC_2_COUNT", 5, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Command I_CFL_VEN_AXIS_ENC_1_COUNT =
      new CFL_Command( "I_CFL_VEN_AXIS_ENC_1_COUNT", 6, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Command I_CFL_VEN_AXIS_ENC_2_COUNT =
      new CFL_Command( "I_CFL_VEN_AXIS_ENC_2_COUNT", 7, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Command I_CFL_VEN_AXIS_ENC_3_COUNT =
      new CFL_Command( "I_CFL_VEN_AXIS_ENC_3_COUNT", 8, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Command I_CFL_VEN_AXIS_ENC_4_COUNT =
      new CFL_Command( "I_CFL_VEN_AXIS_ENC_4_COUNT", 9, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Command I_CFL_VEN_AXIS_ENC_1_ABS_POSITION =
      new CFL_Command( "I_CFL_VEN_AXIS_ENC_1_ABS_POSITION", 10, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Command I_CFL_VEN_AXIS_ENC_2_ABS_POSITION =
      new CFL_Command( "I_CFL_VEN_AXIS_ENC_2_ABS_POSITION", 11, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Command I_CFL_VEN_AXIS_ENC_3_ABS_POSITION =
      new CFL_Command( "I_CFL_VEN_AXIS_ENC_3_ABS_POSITION", 12, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Command I_CFL_VEN_AXIS_ENC_4_ABS_POSITION =
      new CFL_Command( "I_CFL_VEN_AXIS_ENC_4_ABS_POSITION", 13, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Command I_CFL_AES_POSITION =
      new CFL_Command( "I_CFL_AES_POSITION", 14, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Command I_CFL_TFP_CURRENT_TIME =
      new CFL_Command( "I_CFL_TFP_CURRENT_TIME", 15, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Command I_CFL_COMMAND_EOL =
      new CFL_Command( "I_CFL_COMMAND_EOL", 16, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Command I_CFL_COMMAND_MAX =
      new CFL_Command( "I_CFL_COMMAND_MAX", 17, TTL_Package.E_CFL );

  /**
   * 
   */
  public final static CFL_Command I_CFL_COMMAND_EMPTY =
      new CFL_Command( "I_CFL_COMMAND_EMPTY", 18, TTL_Package.E_CFL );

  /**
   * Array allowing serialization.
   */
  protected static final CFL_Command[] array =
  {
    I_CFL_COMMAND_BOL,
    I_CFL_MIF_AXIS_TORQUE_DEMAND,
    I_CFL_MIF_FILTERED_MOTOR_1_DAC_BITS,
    I_CFL_MIF_FILTERED_MOTOR_2_DAC_BITS,
    I_CFL_VEN_MOTOR_ENC_1_COUNT,
    I_CFL_VEN_MOTOR_ENC_2_COUNT,
    I_CFL_VEN_AXIS_ENC_1_COUNT,
    I_CFL_VEN_AXIS_ENC_2_COUNT,
    I_CFL_VEN_AXIS_ENC_3_COUNT,
    I_CFL_VEN_AXIS_ENC_4_COUNT,
    I_CFL_VEN_AXIS_ENC_1_ABS_POSITION,
    I_CFL_VEN_AXIS_ENC_2_ABS_POSITION,
    I_CFL_VEN_AXIS_ENC_3_ABS_POSITION,
    I_CFL_VEN_AXIS_ENC_4_ABS_POSITION,
    I_CFL_AES_POSITION,
    I_CFL_TFP_CURRENT_TIME,
    I_CFL_COMMAND_EOL,
    I_CFL_COMMAND_MAX,
    I_CFL_COMMAND_EMPTY
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
   * Return an object reference of the CFL_Command with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the CFL_Command
   * @return a reference to the CFL_Command specified by the argument
   */
  public static CFL_Command getReference( String s )
  {
    return( (CFL_Command)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the CFL_Command with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the CFL_Command
   * @return a reference to the CFL_Command specified by the argument
   */
  public static CFL_Command getReference( int i )
  {
    return( (CFL_Command)( intHash.get( new Integer( i ) ) ) );
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
  private CFL_Command( String s )
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
  private CFL_Command( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this CFL_Command.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this CFL_Command.
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
