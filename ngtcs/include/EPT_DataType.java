package ;

import ngat.ngtcs.subsystem.TTL_Package;

/**
 * Class to define Type-safe Enumerations.  This class defines <b>ALL</b>
 * possible references of type EPT_DataType.  These are:
 * <ul>
 * <li>D_EPT_DATAID_BOL</li>
 * <li>D_EPT_PROC_STATE</li>
 * <li>D_EPT_AUTH_STATE</li>
 * <li>D_EPT_SYS_REQUEST</li>
 * <li>D_EPT_APP_VERSION</li>
 * <li>D_EPT_THIS_APPLICATION</li>
 * <li>D_EPT_THIS_TELESCOPE</li>
 * <li>D_EPT_SW_SIMULATE</li>
 * <li>D_EPT_AP_STATE</li>
 * <li>D_EPT_AP_HALTED</li>
 * <li>D_EPT_AP_FAULT</li>
 * <li>D_EPT_AP_UNAVAIL</li>
 * <li>D_EPT_S1_STATE</li>
 * <li>D_EPT_S1_HALTED</li>
 * <li>D_EPT_S1_FAULT</li>
 * <li>D_EPT_S1_UNAVAIL</li>
 * <li>D_EPT_S2_STATE</li>
 * <li>D_EPT_S2_HALTED</li>
 * <li>D_EPT_S2_FAULT</li>
 * <li>D_EPT_S2_UNAVAIL</li>
 * <li>D_EPT_S1_POS</li>
 * <li>D_EPT_S2_POS</li>
 * <li>D_EPT_S1_CL_POS</li>
 * <li>D_EPT_S2_CL_POS</li>
 * <li>D_EPT_S1_OP_POS</li>
 * <li>D_EPT_S2_OP_POS</li>
 * <li>D_EPT_TOP_LCK</li>
 * <li>D_EPT_TOP_LCK_FAULT</li>
 * <li>D_EPT_TOP_LCK_UNAVAIL</li>
 * <li>D_EPT_S1_LCK</li>
 * <li>D_EPT_S1_LCK_FAULT</li>
 * <li>D_EPT_S1_LCK_UNAVAIL</li>
 * <li>D_EPT_S2_LCK</li>
 * <li>D_EPT_S2_LCK_FAULT</li>
 * <li>D_EPT_S2_LCK_UNAVAIL</li>
 * <li>D_EPT_S1_R1</li>
 * <li>D_EPT_S1_R2</li>
 * <li>D_EPT_S2_R3</li>
 * <li>D_EPT_S2_R4</li>
 * <li>D_EPT_HYD_PMP</li>
 * <li>D_EPT_HYD_PMP_FAULT</li>
 * <li>D_EPT_HYD_PMP_UNAVAIL</li>
 * <li>D_EPT_HYD_PMP_OLT</li>
 * <li>D_EPT_HYD_PMP_CBT</li>
 * <li>D_EPT_HTK_LVL</li>
 * <li>D_EPT_HTK_LVL_FAULT</li>
 * <li>D_EPT_HTK_LVL_UNAVAIL</li>
 * <li>D_EPT_HTK_TEMP</li>
 * <li>D_EPT_HTK_TEMP_FAULT</li>
 * <li>D_EPT_HTK_TEMP_UNAVAIL</li>
 * <li>D_EPT_SHA_PRES</li>
 * <li>D_EPT_SHA_PRES_FAULT</li>
 * <li>D_EPT_SHA_PRES_UNAVAIL</li>
 * <li>D_EPT_LKA_PRES</li>
 * <li>D_EPT_LKA_PRES_FAULT</li>
 * <li>D_EPT_LKA_PRES_UNAVAIL</li>
 * <li>D_EPT_MSV</li>
 * <li>D_EPT_MSV_FAULT</li>
 * <li>D_EPT_MSV_UNAVAIL</li>
 * <li>D_EPT_FLT1</li>
 * <li>D_EPT_FLT1_FAULT</li>
 * <li>D_EPT_FLT1_UNAVAIL</li>
 * <li>D_EPT_FLT2</li>
 * <li>D_EPT_FLT2_FAULT</li>
 * <li>D_EPT_FLT2_UNAVAIL</li>
 * <li>D_EPT_UPS</li>
 * <li>D_EPT_CLS_ACC_FLT</li>
 * <li>D_EPT_OHTG</li>
 * <li>D_EPT_OHTG_FAULT</li>
 * <li>D_EPT_OHTG_UNAVAIL</li>
 * <li>D_EPT_MCBS</li>
 * <li>D_EPT_MCBS_FAULT</li>
 * <li>D_EPT_MCBS_UNAVAIL</li>
 * <li>D_EPT_ESTOP</li>
 * <li>D_EPT_ACC</li>
 * <li>D_EPT_KEYSW</li>
 * <li>D_EPT_EPLC</li>
 * <li>D_EPT_PLC_WARN_STATE</li>
 * <li>D_EPT_PLC_S2_FLT_STATE</li>
 * <li>D_EPT_PLC_S3_FLT_STATE</li>
 * <li>D_EPT_PLC_SHUTDOWN</li>
 * <li>D_EPT_PLC_WDOG</li>
 * <li>D_EPT_MAIN_PWR</li>
 * <li>D_EPT_R1_SLP</li>
 * <li>D_EPT_R1_SLP_FAULT</li>
 * <li>D_EPT_R1_SLP_UNAVAIL</li>
 * <li>D_EPT_R2_SLP</li>
 * <li>D_EPT_R2_SLP_FAULT</li>
 * <li>D_EPT_R2_SLP_UNAVAIL</li>
 * <li>D_EPT_R3_SLP</li>
 * <li>D_EPT_R3_SLP_FAULT</li>
 * <li>D_EPT_R3_SLP_UNAVAIL</li>
 * <li>D_EPT_R4_SLP</li>
 * <li>D_EPT_R4_SLP_FAULT</li>
 * <li>D_EPT_R4_SLP_UNAVAIL</li>
 * <li>D_EPT_QTY_PMP_STRTS</li>
 * <li>D_EPT_QTY_PMP_HOURS</li>
 * <li>D_EPT_RAM1_PRES</li>
 * <li>D_EPT_RAM2_PRES</li>
 * <li>D_EPT_RAM3_PRES</li>
 * <li>D_EPT_RAM4_PRES</li>
 * <li>D_EPT_HTK_ACT_TEMP</li>
 * <li>D_EPT_R1_PRES_TL</li>
 * <li>D_EPT_R1_PRES_TL_FAIL</li>
 * <li>D_EPT_R2_PRES_TL</li>
 * <li>D_EPT_R2_PRES_TL_FAIL</li>
 * <li>D_EPT_R3_PRES_TL</li>
 * <li>D_EPT_R3_PRES_TL_FAIL</li>
 * <li>D_EPT_R4_PRES_TL</li>
 * <li>D_EPT_R4_PRES_TL_FAIL</li>
 * <li>D_EPT_PANEL_TEMP</li>
 * <li>D_EPT_MAIN_HYD_PRES</li>
 * <li>D_EPT_S1_R1_ENC</li>
 * <li>D_EPT_S1_R2_ENC</li>
 * <li>D_EPT_S2_R3_ENC</li>
 * <li>D_EPT_S2_R4_ENC</li>
 * <li>D_EPT_S1_ENC_MIS</li>
 * <li>D_EPT_S2_ENC_MIS</li>
 * <li>D_EPT_PLC_LOW_BAT</li>
 * <li>D_EPT_PLC_PROC_FAULT</li>
 * <li>D_EPT_PLC_MODE</li>
 * <li>D_EPT_PROG_VERS_MANT</li>
 * <li>D_EPT_PROG_VERS_REM</li>
 * <li>D_EPT_DC_PMP</li>
 * <li>D_EPT_DC_PMP_FAULT</li>
 * <li>D_EPT_DC_PMP_UNAVAIL</li>
 * <li>D_EPT_DC_PMP_OLT</li>
 * <li>D_EPT_DC_PMP_CBT</li>
 * <li>D_EPT_FLT_PMP</li>
 * <li>D_EPT_FLT_PMP_FAULT</li>
 * <li>D_EPT_FLT_PMP_UNAVAIL</li>
 * <li>D_EPT_FLT_PMP_OLT</li>
 * <li>D_EPT_FLT_PMP_CBT</li>
 * <li>D_EPT_DC_PMP_UPS</li>
 * <li>D_EPT_PLC_UPS</li>
 * <li>D_EPT_OHTG_1</li>
 * <li>D_EPT_OHTG_1_FAULT</li>
 * <li>D_EPT_OHTG_1_UNAVAIL</li>
 * <li>D_EPT_OHTG_2</li>
 * <li>D_EPT_OHTG_2_FAULT</li>
 * <li>D_EPT_OHTG_2_UNAVAIL</li>
 * <li>D_EPT_PSU</li>
 * <li>D_EPT_QTY_DC_PMP_HR</li>
 * <li>D_EPT_QTY_FLT_PMP_HR</li>
 * <li>D_EPT_DOME_STATE</li>
 * <li>D_EPT_AZM_POS</li>
 * <li>D_EPT_ALT_POS</li>
 * <li>D_EPT_AZM_LOW_POS</li>
 * <li>D_EPT_AZM_HIGH_POS</li>
 * <li>D_EPT_ALT_LOW_POS</li>
 * <li>D_EPT_ALT_HIGH_POS</li>
 * <li>D_EPT_SER_MSG_CODE</li>
 * <li>SET_1</li>
 * <li>D_EPT_DMD_AP_STATE</li>
 * <li>D_EPT_DMD_S1_STATE</li>
 * <li>D_EPT_DMD_S2_STATE</li>
 * <li>D_EPT_DMD_AP_POS</li>
 * <li>D_EPT_DMD_S1_POS</li>
 * <li>D_EPT_DMD_S2_POS</li>
 * <li>D_EPT_DMD_HALT</li>
 * <li>D_EPT_DMD_STOP</li>
 * <li>D_EPT_DMD_ALL_LCK</li>
 * <li>D_EPT_DMD_TOP_LCK</li>
 * <li>D_EPT_DMD_S1_LCK</li>
 * <li>D_EPT_DMD_S2_LCK</li>
 * <li>D_EPT_DMD_OHTG</li>
 * <li>D_EPT_DMD_HYD</li>
 * <li>D_EPT_DMD_DCHRG_ACC</li>
 * <li>D_EPT_DMD_FLT</li>
 * <li>D_EPT_DMD_ESTOP</li>
 * <li>D_EPT_DMD_SAFE</li>
 * <li>D_EPT_DMD_DOME_AZM</li>
 * <li>D_EPT_DMD_DOME_ALT</li>
 * <li>This</li>
 * <li>D_EPT_DMD_QRY_STATUS</li>
 * <li>D_EPT_DATAID_EOL</li>
 * </ul>
 * 
 * @author $Author:$ 
 * @version $Revision:$
 */
public final class EPT_DataType
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
  private static final TTL_Package ttlPackage = TTL_Package.EPT;

  /*=======================================================================*/
  /*                                                                       */
  /* ENUMERATIONS.                                                         */
  /*                                                                       */
  /*=======================================================================*/

  /**
   * 
   */
  public final static EPT_DataType D_EPT_DATAID_BOL =
      new EPT_DataType( "D_EPT_DATAID_BOL", 0, TTL_Package.D_EPT );

  /**
   * 
   */
  public final static EPT_DataType D_EPT_PROC_STATE =
      new EPT_DataType( "D_EPT_PROC_STATE", 1, TTL_Package.D_EPT );

  /**
   * 
   */
  public final static EPT_DataType D_EPT_AUTH_STATE =
      new EPT_DataType( "D_EPT_AUTH_STATE", 2, TTL_Package.D_EPT );

  /**
   * 
   */
  public final static EPT_DataType D_EPT_SYS_REQUEST =
      new EPT_DataType( "D_EPT_SYS_REQUEST", 3, TTL_Package.D_EPT );

  /**
   * 
   */
  public final static EPT_DataType D_EPT_APP_VERSION =
      new EPT_DataType( "D_EPT_APP_VERSION", 4, TTL_Package.D_EPT );

  /**
   * 
   */
  public final static EPT_DataType D_EPT_THIS_APPLICATION =
      new EPT_DataType( "D_EPT_THIS_APPLICATION", 5, TTL_Package.D_EPT );

  /**
   * Identity of this telescope
   */
  public final static EPT_DataType D_EPT_THIS_TELESCOPE =
      new EPT_DataType( "D_EPT_THIS_TELESCOPE", 6, TTL_Package.D_EPT );

  /**
   * Software simulate mode
   */
  public final static EPT_DataType D_EPT_SW_SIMULATE =
      new EPT_DataType( "D_EPT_SW_SIMULATE", 7, TTL_Package.D_EPT );

  /**
   * Aperture Mechanism State
   */
  public final static EPT_DataType D_EPT_AP_STATE =
      new EPT_DataType( "D_EPT_AP_STATE", 8, TTL_Package.D_EPT );

  /**
   * Aperture Halted
   */
  public final static EPT_DataType D_EPT_AP_HALTED =
      new EPT_DataType( "D_EPT_AP_HALTED", 9, TTL_Package.D_EPT );

  /**
   * Aperture Fault
   */
  public final static EPT_DataType D_EPT_AP_FAULT =
      new EPT_DataType( "D_EPT_AP_FAULT", 10, TTL_Package.D_EPT );

  /**
   * Aperture Not Available
   */
  public final static EPT_DataType D_EPT_AP_UNAVAIL =
      new EPT_DataType( "D_EPT_AP_UNAVAIL", 11, TTL_Package.D_EPT );

  /**
   * Shutter 1 Mechanism State
   */
  public final static EPT_DataType D_EPT_S1_STATE =
      new EPT_DataType( "D_EPT_S1_STATE", 12, TTL_Package.D_EPT );

  /**
   * Shutter 1 Halted
   */
  public final static EPT_DataType D_EPT_S1_HALTED =
      new EPT_DataType( "D_EPT_S1_HALTED", 13, TTL_Package.D_EPT );

  /**
   * Shutter 1 Fault
   */
  public final static EPT_DataType D_EPT_S1_FAULT =
      new EPT_DataType( "D_EPT_S1_FAULT", 14, TTL_Package.D_EPT );

  /**
   * Shutter 1 Not Available
   */
  public final static EPT_DataType D_EPT_S1_UNAVAIL =
      new EPT_DataType( "D_EPT_S1_UNAVAIL", 15, TTL_Package.D_EPT );

  /**
   * Shutter 2 Mechanism State
   */
  public final static EPT_DataType D_EPT_S2_STATE =
      new EPT_DataType( "D_EPT_S2_STATE", 16, TTL_Package.D_EPT );

  /**
   * Shutter 2 Halted
   */
  public final static EPT_DataType D_EPT_S2_HALTED =
      new EPT_DataType( "D_EPT_S2_HALTED", 17, TTL_Package.D_EPT );

  /**
   * Shutter 2 Fault
   */
  public final static EPT_DataType D_EPT_S2_FAULT =
      new EPT_DataType( "D_EPT_S2_FAULT", 18, TTL_Package.D_EPT );

  /**
   * Shutter 2 Not Available
   */
  public final static EPT_DataType D_EPT_S2_UNAVAIL =
      new EPT_DataType( "D_EPT_S2_UNAVAIL", 19, TTL_Package.D_EPT );

  /**
   * Shutter 1 Actual Position
   */
  public final static EPT_DataType D_EPT_S1_POS =
      new EPT_DataType( "D_EPT_S1_POS", 20, TTL_Package.D_EPT );

  /**
   * Shutter 2 Actual Position
   */
  public final static EPT_DataType D_EPT_S2_POS =
      new EPT_DataType( "D_EPT_S2_POS", 21, TTL_Package.D_EPT );

  /**
   * Shutter 1 Closed Limit (decimal value)
   */
  public final static EPT_DataType D_EPT_S1_CL_POS =
      new EPT_DataType( "D_EPT_S1_CL_POS", 22, TTL_Package.D_EPT );

  /**
   * Shutter 2 Closed Limit (decimal value)
   */
  public final static EPT_DataType D_EPT_S2_CL_POS =
      new EPT_DataType( "D_EPT_S2_CL_POS", 23, TTL_Package.D_EPT );

  /**
   * Shutter 1 Open Limit (decimal value)
   */
  public final static EPT_DataType D_EPT_S1_OP_POS =
      new EPT_DataType( "D_EPT_S1_OP_POS", 24, TTL_Package.D_EPT );

  /**
   * Shutter 2 Open Limit (decimal value)
   */
  public final static EPT_DataType D_EPT_S2_OP_POS =
      new EPT_DataType( "D_EPT_S2_OP_POS", 25, TTL_Package.D_EPT );

  /**
   * Top Locks State
   */
  public final static EPT_DataType D_EPT_TOP_LCK =
      new EPT_DataType( "D_EPT_TOP_LCK", 26, TTL_Package.D_EPT );

  /**
   * Top Locks Fault
   */
  public final static EPT_DataType D_EPT_TOP_LCK_FAULT =
      new EPT_DataType( "D_EPT_TOP_LCK_FAULT", 27, TTL_Package.D_EPT );

  /**
   * Top Locks Not Available
   */
  public final static EPT_DataType D_EPT_TOP_LCK_UNAVAIL =
      new EPT_DataType( "D_EPT_TOP_LCK_UNAVAIL", 28, TTL_Package.D_EPT );

  /**
   * Shutter 1 Locks State
   */
  public final static EPT_DataType D_EPT_S1_LCK =
      new EPT_DataType( "D_EPT_S1_LCK", 29, TTL_Package.D_EPT );

  /**
   * Shutter 1 Locks Fault
   */
  public final static EPT_DataType D_EPT_S1_LCK_FAULT =
      new EPT_DataType( "D_EPT_S1_LCK_FAULT", 30, TTL_Package.D_EPT );

  /**
   * Shutter 1 Locks Not Available
   */
  public final static EPT_DataType D_EPT_S1_LCK_UNAVAIL =
      new EPT_DataType( "D_EPT_S1_LCK_UNAVAIL", 31, TTL_Package.D_EPT );

  /**
   * Shutter 2 Locks State
   */
  public final static EPT_DataType D_EPT_S2_LCK =
      new EPT_DataType( "D_EPT_S2_LCK", 32, TTL_Package.D_EPT );

  /**
   * Shutter 2 Locks Fault
   */
  public final static EPT_DataType D_EPT_S2_LCK_FAULT =
      new EPT_DataType( "D_EPT_S2_LCK_FAULT", 33, TTL_Package.D_EPT );

  /**
   * Shutter 2 Locks Not Available
   */
  public final static EPT_DataType D_EPT_S2_LCK_UNAVAIL =
      new EPT_DataType( "D_EPT_S2_LCK_UNAVAIL", 34, TTL_Package.D_EPT );

  /**
   * Shutter 1 Ram 1 Misalignment
   */
  public final static EPT_DataType D_EPT_S1_R1 =
      new EPT_DataType( "D_EPT_S1_R1", 35, TTL_Package.D_EPT );

  /**
   * Shutter 1 Ram 2 Misalignment
   */
  public final static EPT_DataType D_EPT_S1_R2 =
      new EPT_DataType( "D_EPT_S1_R2", 36, TTL_Package.D_EPT );

  /**
   * Shutter 2 Ram 3 Misalignment
   */
  public final static EPT_DataType D_EPT_S2_R3 =
      new EPT_DataType( "D_EPT_S2_R3", 37, TTL_Package.D_EPT );

  /**
   * Shutter 2 Ram 4 Misalignment
   */
  public final static EPT_DataType D_EPT_S2_R4 =
      new EPT_DataType( "D_EPT_S2_R4", 38, TTL_Package.D_EPT );

  /**
   * Hydraulic Pump State
   */
  public final static EPT_DataType D_EPT_HYD_PMP =
      new EPT_DataType( "D_EPT_HYD_PMP", 39, TTL_Package.D_EPT );

  /**
   * Hydraulic Pump Fault
   */
  public final static EPT_DataType D_EPT_HYD_PMP_FAULT =
      new EPT_DataType( "D_EPT_HYD_PMP_FAULT", 40, TTL_Package.D_EPT );

  /**
   * Hydraulic Pump Not Available
   */
  public final static EPT_DataType D_EPT_HYD_PMP_UNAVAIL =
      new EPT_DataType( "D_EPT_HYD_PMP_UNAVAIL", 41, TTL_Package.D_EPT );

  /**
   * Hydraulic Pump O
   */
  public final static EPT_DataType D_EPT_HYD_PMP_OLT =
      new EPT_DataType( "D_EPT_HYD_PMP_OLT", 42, TTL_Package.D_EPT );

  /**
   * Hydraulic Pump MCB Tripped
   */
  public final static EPT_DataType D_EPT_HYD_PMP_CBT =
      new EPT_DataType( "D_EPT_HYD_PMP_CBT", 43, TTL_Package.D_EPT );

  /**
   * Hydraulic Tank Level State
   */
  public final static EPT_DataType D_EPT_HTK_LVL =
      new EPT_DataType( "D_EPT_HTK_LVL", 44, TTL_Package.D_EPT );

  /**
   * Hydraulic Tank Level Fault
   */
  public final static EPT_DataType D_EPT_HTK_LVL_FAULT =
      new EPT_DataType( "D_EPT_HTK_LVL_FAULT", 45, TTL_Package.D_EPT );

  /**
   * Hydraulic Tank Level Not Available
   */
  public final static EPT_DataType D_EPT_HTK_LVL_UNAVAIL =
      new EPT_DataType( "D_EPT_HTK_LVL_UNAVAIL", 46, TTL_Package.D_EPT );

  /**
   * Hydraulic Tank Temperature State
   */
  public final static EPT_DataType D_EPT_HTK_TEMP =
      new EPT_DataType( "D_EPT_HTK_TEMP", 47, TTL_Package.D_EPT );

  /**
   * Hydraulic Tank Temperature Fault
   */
  public final static EPT_DataType D_EPT_HTK_TEMP_FAULT =
      new EPT_DataType( "D_EPT_HTK_TEMP_FAULT", 48, TTL_Package.D_EPT );

  /**
   * Hydraulic Tank Temperature Not Available
   */
  public final static EPT_DataType D_EPT_HTK_TEMP_UNAVAIL =
      new EPT_DataType( "D_EPT_HTK_TEMP_UNAVAIL", 49, TTL_Package.D_EPT );

  /**
   * Shutters Accumulator Pressure State
   */
  public final static EPT_DataType D_EPT_SHA_PRES =
      new EPT_DataType( "D_EPT_SHA_PRES", 50, TTL_Package.D_EPT );

  /**
   * Shutters Accumulator Pressure Fault
   */
  public final static EPT_DataType D_EPT_SHA_PRES_FAULT =
      new EPT_DataType( "D_EPT_SHA_PRES_FAULT", 51, TTL_Package.D_EPT );

  /**
   * Shutters Accumulator Pressure Not Available
   */
  public final static EPT_DataType D_EPT_SHA_PRES_UNAVAIL =
      new EPT_DataType( "D_EPT_SHA_PRES_UNAVAIL", 52, TTL_Package.D_EPT );

  /**
   * Locks Accumulator Pressure State
   */
  public final static EPT_DataType D_EPT_LKA_PRES =
      new EPT_DataType( "D_EPT_LKA_PRES", 53, TTL_Package.D_EPT );

  /**
   * Locks Accumulator Pressure Fault
   */
  public final static EPT_DataType D_EPT_LKA_PRES_FAULT =
      new EPT_DataType( "D_EPT_LKA_PRES_FAULT", 54, TTL_Package.D_EPT );

  /**
   * Locks Accumulator Pressure Not Available
   */
  public final static EPT_DataType D_EPT_LKA_PRES_UNAVAIL =
      new EPT_DataType( "D_EPT_LKA_PRES_UNAVAIL", 55, TTL_Package.D_EPT );

  /**
   * Maintenance Safety Valve State
   */
  public final static EPT_DataType D_EPT_MSV =
      new EPT_DataType( "D_EPT_MSV", 56, TTL_Package.D_EPT );

  /**
   * Maintenance Safety Valve Fault
   */
  public final static EPT_DataType D_EPT_MSV_FAULT =
      new EPT_DataType( "D_EPT_MSV_FAULT", 57, TTL_Package.D_EPT );

  /**
   * Maintenance Safety Valve Not Available
   */
  public final static EPT_DataType D_EPT_MSV_UNAVAIL =
      new EPT_DataType( "D_EPT_MSV_UNAVAIL", 58, TTL_Package.D_EPT );

  /**
   * Filter 1 Pressure Switch State
   */
  public final static EPT_DataType D_EPT_FLT1 =
      new EPT_DataType( "D_EPT_FLT1", 59, TTL_Package.D_EPT );

  /**
   * Filter 1 Pressure Switch Fault
   */
  public final static EPT_DataType D_EPT_FLT1_FAULT =
      new EPT_DataType( "D_EPT_FLT1_FAULT", 60, TTL_Package.D_EPT );

  /**
   * Filter 1 Pressure Switch Not Available
   */
  public final static EPT_DataType D_EPT_FLT1_UNAVAIL =
      new EPT_DataType( "D_EPT_FLT1_UNAVAIL", 61, TTL_Package.D_EPT );

  /**
   * Filter 2 Pressure Switch State
   */
  public final static EPT_DataType D_EPT_FLT2 =
      new EPT_DataType( "D_EPT_FLT2", 62, TTL_Package.D_EPT );

  /**
   * Filter 2 Pressure Switch Fault
   */
  public final static EPT_DataType D_EPT_FLT2_FAULT =
      new EPT_DataType( "D_EPT_FLT2_FAULT", 63, TTL_Package.D_EPT );

  /**
   * Filter 2 Pressure Switch Not Available
   */
  public final static EPT_DataType D_EPT_FLT2_UNAVAIL =
      new EPT_DataType( "D_EPT_FLT2_UNAVAIL", 64, TTL_Package.D_EPT );

  /**
   * Enclosure UPS
   */
  public final static EPT_DataType D_EPT_UPS =
      new EPT_DataType( "D_EPT_UPS", 65, TTL_Package.D_EPT );

  /**
   * Fault Closing Enclosure under Accumulator Power
   */
  public final static EPT_DataType D_EPT_CLS_ACC_FLT =
      new EPT_DataType( "D_EPT_CLS_ACC_FLT", 66, TTL_Package.D_EPT );

  /**
   * Oil Tank Heating State
   */
  public final static EPT_DataType D_EPT_OHTG =
      new EPT_DataType( "D_EPT_OHTG", 67, TTL_Package.D_EPT );

  /**
   * Oil Tank Heating Fault
   */
  public final static EPT_DataType D_EPT_OHTG_FAULT =
      new EPT_DataType( "D_EPT_OHTG_FAULT", 68, TTL_Package.D_EPT );

  /**
   * Oil Tank Heating Not Available
   */
  public final static EPT_DataType D_EPT_OHTG_UNAVAIL =
      new EPT_DataType( "D_EPT_OHTG_UNAVAIL", 69, TTL_Package.D_EPT );

  /**
   * Miniature Circuit Breakers State
   */
  public final static EPT_DataType D_EPT_MCBS =
      new EPT_DataType( "D_EPT_MCBS", 70, TTL_Package.D_EPT );

  /**
   * Miniature Circuit Breakers Fault
   */
  public final static EPT_DataType D_EPT_MCBS_FAULT =
      new EPT_DataType( "D_EPT_MCBS_FAULT", 71, TTL_Package.D_EPT );

  /**
   * Miniature Circuit Breakers Not Available
   */
  public final static EPT_DataType D_EPT_MCBS_UNAVAIL =
      new EPT_DataType( "D_EPT_MCBS_UNAVAIL", 72, TTL_Package.D_EPT );

  /**
   * Enclosure Emergency Stop
   */
  public final static EPT_DataType D_EPT_ESTOP =
      new EPT_DataType( "D_EPT_ESTOP", 73, TTL_Package.D_EPT );

  /**
   * Accumulator State
   */
  public final static EPT_DataType D_EPT_ACC =
      new EPT_DataType( "D_EPT_ACC", 74, TTL_Package.D_EPT );

  /**
   * Local
   */
  public final static EPT_DataType D_EPT_KEYSW =
      new EPT_DataType( "D_EPT_KEYSW", 75, TTL_Package.D_EPT );

  /**
   * Enclosure PLC State
   */
  public final static EPT_DataType D_EPT_EPLC =
      new EPT_DataType( "D_EPT_EPLC", 76, TTL_Package.D_EPT );

  /**
   * PLC in WARN State
   */
  public final static EPT_DataType D_EPT_PLC_WARN_STATE =
      new EPT_DataType( "D_EPT_PLC_WARN_STATE", 77, TTL_Package.D_EPT );

  /**
   * 
   */
  public final static EPT_DataType D_EPT_PLC_S2_FLT_STATE =
      new EPT_DataType( "D_EPT_PLC_S2_FLT_STATE", 78, TTL_Package.D_EPT );

  /**
   * 
   */
  public final static EPT_DataType D_EPT_PLC_S3_FLT_STATE =
      new EPT_DataType( "D_EPT_PLC_S3_FLT_STATE", 79, TTL_Package.D_EPT );

  /**
   * E PLC requests immediate shutdown (not used)
   */
  public final static EPT_DataType D_EPT_PLC_SHUTDOWN =
      new EPT_DataType( "D_EPT_PLC_SHUTDOWN", 80, TTL_Package.D_EPT );

  /**
   * Enclosure PLC Watchdog Healthy
   */
  public final static EPT_DataType D_EPT_PLC_WDOG =
      new EPT_DataType( "D_EPT_PLC_WDOG", 81, TTL_Package.D_EPT );

  /**
   * Enclosure Main Power Healthy
   */
  public final static EPT_DataType D_EPT_MAIN_PWR =
      new EPT_DataType( "D_EPT_MAIN_PWR", 82, TTL_Package.D_EPT );

  /**
   * Ram 1 Seal Pressure Switch State
   */
  public final static EPT_DataType D_EPT_R1_SLP =
      new EPT_DataType( "D_EPT_R1_SLP", 83, TTL_Package.D_EPT );

  /**
   * Ram 1 Seal Pressure Switch Fault
   */
  public final static EPT_DataType D_EPT_R1_SLP_FAULT =
      new EPT_DataType( "D_EPT_R1_SLP_FAULT", 84, TTL_Package.D_EPT );

  /**
   * Ram 1 Seal Pressure Switch Not Available
   */
  public final static EPT_DataType D_EPT_R1_SLP_UNAVAIL =
      new EPT_DataType( "D_EPT_R1_SLP_UNAVAIL", 85, TTL_Package.D_EPT );

  /**
   * Ram 2 Seal Pressure Switch State
   */
  public final static EPT_DataType D_EPT_R2_SLP =
      new EPT_DataType( "D_EPT_R2_SLP", 86, TTL_Package.D_EPT );

  /**
   * Ram 2 Seal Pressure Switch Fault
   */
  public final static EPT_DataType D_EPT_R2_SLP_FAULT =
      new EPT_DataType( "D_EPT_R2_SLP_FAULT", 87, TTL_Package.D_EPT );

  /**
   * Ram 2 Seal Pressure Switch Not Available
   */
  public final static EPT_DataType D_EPT_R2_SLP_UNAVAIL =
      new EPT_DataType( "D_EPT_R2_SLP_UNAVAIL", 88, TTL_Package.D_EPT );

  /**
   * Ram 3 Seal Pressure Switch State
   */
  public final static EPT_DataType D_EPT_R3_SLP =
      new EPT_DataType( "D_EPT_R3_SLP", 89, TTL_Package.D_EPT );

  /**
   * Ram 3 Seal Pressure Switch Fault
   */
  public final static EPT_DataType D_EPT_R3_SLP_FAULT =
      new EPT_DataType( "D_EPT_R3_SLP_FAULT", 90, TTL_Package.D_EPT );

  /**
   * Ram 3 Seal Pressure Switch Not Available
   */
  public final static EPT_DataType D_EPT_R3_SLP_UNAVAIL =
      new EPT_DataType( "D_EPT_R3_SLP_UNAVAIL", 91, TTL_Package.D_EPT );

  /**
   * Ram 4 Seal Pressure Switch State
   */
  public final static EPT_DataType D_EPT_R4_SLP =
      new EPT_DataType( "D_EPT_R4_SLP", 92, TTL_Package.D_EPT );

  /**
   * Ram 4 Seal Pressure Switch Fault
   */
  public final static EPT_DataType D_EPT_R4_SLP_FAULT =
      new EPT_DataType( "D_EPT_R4_SLP_FAULT", 93, TTL_Package.D_EPT );

  /**
   * Ram 4 Seal Pressure Switch Not Available
   */
  public final static EPT_DataType D_EPT_R4_SLP_UNAVAIL =
      new EPT_DataType( "D_EPT_R4_SLP_UNAVAIL", 94, TTL_Package.D_EPT );

  /**
   * Number of Hydraulic Pump Starts in the Hour
   */
  public final static EPT_DataType D_EPT_QTY_PMP_STRTS =
      new EPT_DataType( "D_EPT_QTY_PMP_STRTS", 95, TTL_Package.D_EPT );

  /**
   * Number of Hydraulic Pump Run Hours
   */
  public final static EPT_DataType D_EPT_QTY_PMP_HOURS =
      new EPT_DataType( "D_EPT_QTY_PMP_HOURS", 96, TTL_Package.D_EPT );

  /**
   * Ram No 1 Pressure (analogue)
   */
  public final static EPT_DataType D_EPT_RAM1_PRES =
      new EPT_DataType( "D_EPT_RAM1_PRES", 97, TTL_Package.D_EPT );

  /**
   * Ram No 2 Pressure (analogue)
   */
  public final static EPT_DataType D_EPT_RAM2_PRES =
      new EPT_DataType( "D_EPT_RAM2_PRES", 98, TTL_Package.D_EPT );

  /**
   * Ram No 3 Pressure (analogue)
   */
  public final static EPT_DataType D_EPT_RAM3_PRES =
      new EPT_DataType( "D_EPT_RAM3_PRES", 99, TTL_Package.D_EPT );

  /**
   * Ram No 4 Pressure (analogue)
   */
  public final static EPT_DataType D_EPT_RAM4_PRES =
      new EPT_DataType( "D_EPT_RAM4_PRES", 100, TTL_Package.D_EPT );

  /**
   * Hydraulic Tank Temperature (analogue)
   */
  public final static EPT_DataType D_EPT_HTK_ACT_TEMP =
      new EPT_DataType( "D_EPT_HTK_ACT_TEMP", 101, TTL_Package.D_EPT );

  /**
   * Ram 1 Pressure Trip Level State
   */
  public final static EPT_DataType D_EPT_R1_PRES_TL =
      new EPT_DataType( "D_EPT_R1_PRES_TL", 102, TTL_Package.D_EPT );

  /**
   * Ram 1 Pressure Trip Level Sensor Failed
   */
  public final static EPT_DataType D_EPT_R1_PRES_TL_FAIL =
      new EPT_DataType( "D_EPT_R1_PRES_TL_FAIL", 103, TTL_Package.D_EPT );

  /**
   * Ram 2 Pressure Trip Level State
   */
  public final static EPT_DataType D_EPT_R2_PRES_TL =
      new EPT_DataType( "D_EPT_R2_PRES_TL", 104, TTL_Package.D_EPT );

  /**
   * Ram 2 Pressure Trip Level Sensor Failed
   */
  public final static EPT_DataType D_EPT_R2_PRES_TL_FAIL =
      new EPT_DataType( "D_EPT_R2_PRES_TL_FAIL", 105, TTL_Package.D_EPT );

  /**
   * Ram 3 Pressure Trip Level State
   */
  public final static EPT_DataType D_EPT_R3_PRES_TL =
      new EPT_DataType( "D_EPT_R3_PRES_TL", 106, TTL_Package.D_EPT );

  /**
   * Ram 3 Pressure Trip Level Sensor Failed
   */
  public final static EPT_DataType D_EPT_R3_PRES_TL_FAIL =
      new EPT_DataType( "D_EPT_R3_PRES_TL_FAIL", 107, TTL_Package.D_EPT );

  /**
   * Ram 4 Pressure Trip Level State
   */
  public final static EPT_DataType D_EPT_R4_PRES_TL =
      new EPT_DataType( "D_EPT_R4_PRES_TL", 108, TTL_Package.D_EPT );

  /**
   * Ram 4 Pressure Trip Level Sensor Failed
   */
  public final static EPT_DataType D_EPT_R4_PRES_TL_FAIL =
      new EPT_DataType( "D_EPT_R4_PRES_TL_FAIL", 109, TTL_Package.D_EPT );

  /**
   * Enclosure Panel Temperature
   */
  public final static EPT_DataType D_EPT_PANEL_TEMP =
      new EPT_DataType( "D_EPT_PANEL_TEMP", 110, TTL_Package.D_EPT );

  /**
   * Main Hydraulic Pressure
   */
  public final static EPT_DataType D_EPT_MAIN_HYD_PRES =
      new EPT_DataType( "D_EPT_MAIN_HYD_PRES", 111, TTL_Package.D_EPT );

  /**
   * Shutter 1 Ram 1 Encoder Reading
   */
  public final static EPT_DataType D_EPT_S1_R1_ENC =
      new EPT_DataType( "D_EPT_S1_R1_ENC", 112, TTL_Package.D_EPT );

  /**
   * Shutter 1 Ram 2 Encoder Reading
   */
  public final static EPT_DataType D_EPT_S1_R2_ENC =
      new EPT_DataType( "D_EPT_S1_R2_ENC", 113, TTL_Package.D_EPT );

  /**
   * Shutter 2 Ram 3 Encoder Reading
   */
  public final static EPT_DataType D_EPT_S2_R3_ENC =
      new EPT_DataType( "D_EPT_S2_R3_ENC", 114, TTL_Package.D_EPT );

  /**
   * Shutter 2 Ram 4 Encoder Reading
   */
  public final static EPT_DataType D_EPT_S2_R4_ENC =
      new EPT_DataType( "D_EPT_S2_R4_ENC", 115, TTL_Package.D_EPT );

  /**
   * Shutter 1 Encoder Misalignment Value
   */
  public final static EPT_DataType D_EPT_S1_ENC_MIS =
      new EPT_DataType( "D_EPT_S1_ENC_MIS", 116, TTL_Package.D_EPT );

  /**
   * Shutter 2 Encoder Misalignment Value
   */
  public final static EPT_DataType D_EPT_S2_ENC_MIS =
      new EPT_DataType( "D_EPT_S2_ENC_MIS", 117, TTL_Package.D_EPT );

  /**
   * PLC Low Battery Alarm
   */
  public final static EPT_DataType D_EPT_PLC_LOW_BAT =
      new EPT_DataType( "D_EPT_PLC_LOW_BAT", 118, TTL_Package.D_EPT );

  /**
   * PLC Processor Fault Alarm
   */
  public final static EPT_DataType D_EPT_PLC_PROC_FAULT =
      new EPT_DataType( "D_EPT_PLC_PROC_FAULT", 119, TTL_Package.D_EPT );

  /**
   * PLC in Remote Program Mode
   */
  public final static EPT_DataType D_EPT_PLC_MODE =
      new EPT_DataType( "D_EPT_PLC_MODE", 120, TTL_Package.D_EPT );

  /**
   * Program Version Number (Major Part)
   */
  public final static EPT_DataType D_EPT_PROG_VERS_MANT =
      new EPT_DataType( "D_EPT_PROG_VERS_MANT", 121, TTL_Package.D_EPT );

  /**
   * Program Version Number (Minor Part)
   */
  public final static EPT_DataType D_EPT_PROG_VERS_REM =
      new EPT_DataType( "D_EPT_PROG_VERS_REM", 122, TTL_Package.D_EPT );

  /**
   * Backup DC Pump State
   */
  public final static EPT_DataType D_EPT_DC_PMP =
      new EPT_DataType( "D_EPT_DC_PMP", 123, TTL_Package.D_EPT );

  /**
   * Backup DC Pump Fault
   */
  public final static EPT_DataType D_EPT_DC_PMP_FAULT =
      new EPT_DataType( "D_EPT_DC_PMP_FAULT", 124, TTL_Package.D_EPT );

  /**
   * Backup DC Pump Not Available
   */
  public final static EPT_DataType D_EPT_DC_PMP_UNAVAIL =
      new EPT_DataType( "D_EPT_DC_PMP_UNAVAIL", 125, TTL_Package.D_EPT );

  /**
   * Backup DC Pump O
   */
  public final static EPT_DataType D_EPT_DC_PMP_OLT =
      new EPT_DataType( "D_EPT_DC_PMP_OLT", 126, TTL_Package.D_EPT );

  /**
   * Backup DC Pump MCB Tripped
   */
  public final static EPT_DataType D_EPT_DC_PMP_CBT =
      new EPT_DataType( "D_EPT_DC_PMP_CBT", 127, TTL_Package.D_EPT );

  /**
   * Off Line Filter Pump State
   */
  public final static EPT_DataType D_EPT_FLT_PMP =
      new EPT_DataType( "D_EPT_FLT_PMP", 128, TTL_Package.D_EPT );

  /**
   * Off Line Filter Pump Fault
   */
  public final static EPT_DataType D_EPT_FLT_PMP_FAULT =
      new EPT_DataType( "D_EPT_FLT_PMP_FAULT", 129, TTL_Package.D_EPT );

  /**
   * Off Line Filter Pump Not Available
   */
  public final static EPT_DataType D_EPT_FLT_PMP_UNAVAIL =
      new EPT_DataType( "D_EPT_FLT_PMP_UNAVAIL", 130, TTL_Package.D_EPT );

  /**
   * Off Line Filter Pump O
   */
  public final static EPT_DataType D_EPT_FLT_PMP_OLT =
      new EPT_DataType( "D_EPT_FLT_PMP_OLT", 131, TTL_Package.D_EPT );

  /**
   * Off Line Filter Pump MCB Tripped
   */
  public final static EPT_DataType D_EPT_FLT_PMP_CBT =
      new EPT_DataType( "D_EPT_FLT_PMP_CBT", 132, TTL_Package.D_EPT );

  /**
   * DC Pump UPS
   */
  public final static EPT_DataType D_EPT_DC_PMP_UPS =
      new EPT_DataType( "D_EPT_DC_PMP_UPS", 133, TTL_Package.D_EPT );

  /**
   * PLC UPS
   */
  public final static EPT_DataType D_EPT_PLC_UPS =
      new EPT_DataType( "D_EPT_PLC_UPS", 134, TTL_Package.D_EPT );

  /**
   * Oil Tank Heater 1 State
   */
  public final static EPT_DataType D_EPT_OHTG_1 =
      new EPT_DataType( "D_EPT_OHTG_1", 135, TTL_Package.D_EPT );

  /**
   * Oil Tank Heater 1 Fault
   */
  public final static EPT_DataType D_EPT_OHTG_1_FAULT =
      new EPT_DataType( "D_EPT_OHTG_1_FAULT", 136, TTL_Package.D_EPT );

  /**
   * Oil Tank Heater 1 Not Available
   */
  public final static EPT_DataType D_EPT_OHTG_1_UNAVAIL =
      new EPT_DataType( "D_EPT_OHTG_1_UNAVAIL", 137, TTL_Package.D_EPT );

  /**
   * Oil Tank Heater 2 State
   */
  public final static EPT_DataType D_EPT_OHTG_2 =
      new EPT_DataType( "D_EPT_OHTG_2", 138, TTL_Package.D_EPT );

  /**
   * Oil Tank Heater 2 Fault
   */
  public final static EPT_DataType D_EPT_OHTG_2_FAULT =
      new EPT_DataType( "D_EPT_OHTG_2_FAULT", 139, TTL_Package.D_EPT );

  /**
   * Oil Tank Heater 2 Not Available
   */
  public final static EPT_DataType D_EPT_OHTG_2_UNAVAIL =
      new EPT_DataType( "D_EPT_OHTG_2_UNAVAIL", 140, TTL_Package.D_EPT );

  /**
   * Power Supply Units
   */
  public final static EPT_DataType D_EPT_PSU =
      new EPT_DataType( "D_EPT_PSU", 141, TTL_Package.D_EPT );

  /**
   * Backup DC Pump Run Hours
   */
  public final static EPT_DataType D_EPT_QTY_DC_PMP_HR =
      new EPT_DataType( "D_EPT_QTY_DC_PMP_HR", 142, TTL_Package.D_EPT );

  /**
   * Off Line Filter Pump Run Hours
   */
  public final static EPT_DataType D_EPT_QTY_FLT_PMP_HR =
      new EPT_DataType( "D_EPT_QTY_FLT_PMP_HR", 143, TTL_Package.D_EPT );

  /**
   * Dome azimuth angle in milli arc secconds.
   */
  public final static EPT_DataType D_EPT_DOME_STATE =
      new EPT_DataType( "D_EPT_DOME_STATE", 144, TTL_Package.D_EPT );

  /**
   * Dome azimuth angle in milli arc secconds.
   */
  public final static EPT_DataType D_EPT_AZM_POS =
      new EPT_DataType( "D_EPT_AZM_POS", 145, TTL_Package.D_EPT );

  /**
   * Dome altitude angle in milli arc secconds.
   */
  public final static EPT_DataType D_EPT_ALT_POS =
      new EPT_DataType( "D_EPT_ALT_POS", 146, TTL_Package.D_EPT );

  /**
   * Minimum dome azimuth angle.
   */
  public final static EPT_DataType D_EPT_AZM_LOW_POS =
      new EPT_DataType( "D_EPT_AZM_LOW_POS", 147, TTL_Package.D_EPT );

  /**
   * Maximum dome azimuth angle.
   */
  public final static EPT_DataType D_EPT_AZM_HIGH_POS =
      new EPT_DataType( "D_EPT_AZM_HIGH_POS", 148, TTL_Package.D_EPT );

  /**
   * Minimum dome altitude angle.
   */
  public final static EPT_DataType D_EPT_ALT_LOW_POS =
      new EPT_DataType( "D_EPT_ALT_LOW_POS", 149, TTL_Package.D_EPT );

  /**
   * Maximum dome altitude angle.
   */
  public final static EPT_DataType D_EPT_ALT_HIGH_POS =
      new EPT_DataType( "D_EPT_ALT_HIGH_POS", 150, TTL_Package.D_EPT );

  /**
   * Numerical code from serial device.
   */
  public final static EPT_DataType D_EPT_SER_MSG_CODE =
      new EPT_DataType( "D_EPT_SER_MSG_CODE", 151, TTL_Package.D_EPT );

  /**
   * 
   */
  public final static EPT_DataType SET_1 =
      new EPT_DataType( "SET_1", 152, TTL_Package.D_EPT );

  /**
   * Aperture
   */
  public final static EPT_DataType D_EPT_DMD_AP_STATE =
      new EPT_DataType( "D_EPT_DMD_AP_STATE", 153, TTL_Package.D_EPT );

  /**
   * Shutter 1
   */
  public final static EPT_DataType D_EPT_DMD_S1_STATE =
      new EPT_DataType( "D_EPT_DMD_S1_STATE", 154, TTL_Package.D_EPT );

  /**
   * Shutter 2
   */
  public final static EPT_DataType D_EPT_DMD_S2_STATE =
      new EPT_DataType( "D_EPT_DMD_S2_STATE", 155, TTL_Package.D_EPT );

  /**
   * Aperture Required Position Value
   */
  public final static EPT_DataType D_EPT_DMD_AP_POS =
      new EPT_DataType( "D_EPT_DMD_AP_POS", 156, TTL_Package.D_EPT );

  /**
   * Shutter 1 Required Position Value
   */
  public final static EPT_DataType D_EPT_DMD_S1_POS =
      new EPT_DataType( "D_EPT_DMD_S1_POS", 157, TTL_Package.D_EPT );

  /**
   * Shutter 2 Required Position Value
   */
  public final static EPT_DataType D_EPT_DMD_S2_POS =
      new EPT_DataType( "D_EPT_DMD_S2_POS", 158, TTL_Package.D_EPT );

  /**
   * Halt Motion
   */
  public final static EPT_DataType D_EPT_DMD_HALT =
      new EPT_DataType( "D_EPT_DMD_HALT", 159, TTL_Package.D_EPT );

  /**
   * Stop Motion
   */
  public final static EPT_DataType D_EPT_DMD_STOP =
      new EPT_DataType( "D_EPT_DMD_STOP", 160, TTL_Package.D_EPT );

  /**
   * All Locks
   */
  public final static EPT_DataType D_EPT_DMD_ALL_LCK =
      new EPT_DataType( "D_EPT_DMD_ALL_LCK", 161, TTL_Package.D_EPT );

  /**
   * Top Locks
   */
  public final static EPT_DataType D_EPT_DMD_TOP_LCK =
      new EPT_DataType( "D_EPT_DMD_TOP_LCK", 162, TTL_Package.D_EPT );

  /**
   * Shutter 1 Locks
   */
  public final static EPT_DataType D_EPT_DMD_S1_LCK =
      new EPT_DataType( "D_EPT_DMD_S1_LCK", 163, TTL_Package.D_EPT );

  /**
   * Shutter 2 Locks
   */
  public final static EPT_DataType D_EPT_DMD_S2_LCK =
      new EPT_DataType( "D_EPT_DMD_S2_LCK", 164, TTL_Package.D_EPT );

  /**
   * Switch Oil Tank Heating On
   */
  public final static EPT_DataType D_EPT_DMD_OHTG =
      new EPT_DataType( "D_EPT_DMD_OHTG", 165, TTL_Package.D_EPT );

  /**
   * Switch Hydraulic System (Prime) On
   */
  public final static EPT_DataType D_EPT_DMD_HYD =
      new EPT_DataType( "D_EPT_DMD_HYD", 166, TTL_Package.D_EPT );

  /**
   * Discharge Accumulators
   */
  public final static EPT_DataType D_EPT_DMD_DCHRG_ACC =
      new EPT_DataType( "D_EPT_DMD_DCHRG_ACC", 167, TTL_Package.D_EPT );

  /**
   * Fault Reset
   */
  public final static EPT_DataType D_EPT_DMD_FLT =
      new EPT_DataType( "D_EPT_DMD_FLT", 168, TTL_Package.D_EPT );

  /**
   * Emergency Stop Reset
   */
  public final static EPT_DataType D_EPT_DMD_ESTOP =
      new EPT_DataType( "D_EPT_DMD_ESTOP", 169, TTL_Package.D_EPT );

  /**
   * Switch Enclosure PLC into Safe State
   */
  public final static EPT_DataType D_EPT_DMD_SAFE =
      new EPT_DataType( "D_EPT_DMD_SAFE", 170, TTL_Package.D_EPT );

  /**
   * Demanded dome azimuth angle in milli arc secs.
   */
  public final static EPT_DataType D_EPT_DMD_DOME_AZM =
      new EPT_DataType( "D_EPT_DMD_DOME_AZM", 171, TTL_Package.D_EPT );

  /**
   * Demanded dome altitude angle in milli arc secs.
   */
  public final static EPT_DataType D_EPT_DMD_DOME_ALT =
      new EPT_DataType( "D_EPT_DMD_DOME_ALT", 172, TTL_Package.D_EPT );

  /**
   * 
   */
  public final static EPT_DataType This =
      new EPT_DataType( "This", 173, TTL_Package.D_EPT );

  /**
   * Query Status
   */
  public final static EPT_DataType D_EPT_DMD_QRY_STATUS =
      new EPT_DataType( "D_EPT_DMD_QRY_STATUS", 174, TTL_Package.D_EPT );

  /**
   * 
   */
  public final static EPT_DataType D_EPT_DATAID_EOL =
      new EPT_DataType( "D_EPT_DATAID_EOL", 175, TTL_Package.D_EPT );

  /**
   * Array allowing serialization.
   */
  protected static final EPT_DataType[] array =
  {
    D_EPT_DATAID_BOL,
    D_EPT_PROC_STATE,
    D_EPT_AUTH_STATE,
    D_EPT_SYS_REQUEST,
    D_EPT_APP_VERSION,
    D_EPT_THIS_APPLICATION,
    D_EPT_THIS_TELESCOPE,
    D_EPT_SW_SIMULATE,
    D_EPT_AP_STATE,
    D_EPT_AP_HALTED,
    D_EPT_AP_FAULT,
    D_EPT_AP_UNAVAIL,
    D_EPT_S1_STATE,
    D_EPT_S1_HALTED,
    D_EPT_S1_FAULT,
    D_EPT_S1_UNAVAIL,
    D_EPT_S2_STATE,
    D_EPT_S2_HALTED,
    D_EPT_S2_FAULT,
    D_EPT_S2_UNAVAIL,
    D_EPT_S1_POS,
    D_EPT_S2_POS,
    D_EPT_S1_CL_POS,
    D_EPT_S2_CL_POS,
    D_EPT_S1_OP_POS,
    D_EPT_S2_OP_POS,
    D_EPT_TOP_LCK,
    D_EPT_TOP_LCK_FAULT,
    D_EPT_TOP_LCK_UNAVAIL,
    D_EPT_S1_LCK,
    D_EPT_S1_LCK_FAULT,
    D_EPT_S1_LCK_UNAVAIL,
    D_EPT_S2_LCK,
    D_EPT_S2_LCK_FAULT,
    D_EPT_S2_LCK_UNAVAIL,
    D_EPT_S1_R1,
    D_EPT_S1_R2,
    D_EPT_S2_R3,
    D_EPT_S2_R4,
    D_EPT_HYD_PMP,
    D_EPT_HYD_PMP_FAULT,
    D_EPT_HYD_PMP_UNAVAIL,
    D_EPT_HYD_PMP_OLT,
    D_EPT_HYD_PMP_CBT,
    D_EPT_HTK_LVL,
    D_EPT_HTK_LVL_FAULT,
    D_EPT_HTK_LVL_UNAVAIL,
    D_EPT_HTK_TEMP,
    D_EPT_HTK_TEMP_FAULT,
    D_EPT_HTK_TEMP_UNAVAIL,
    D_EPT_SHA_PRES,
    D_EPT_SHA_PRES_FAULT,
    D_EPT_SHA_PRES_UNAVAIL,
    D_EPT_LKA_PRES,
    D_EPT_LKA_PRES_FAULT,
    D_EPT_LKA_PRES_UNAVAIL,
    D_EPT_MSV,
    D_EPT_MSV_FAULT,
    D_EPT_MSV_UNAVAIL,
    D_EPT_FLT1,
    D_EPT_FLT1_FAULT,
    D_EPT_FLT1_UNAVAIL,
    D_EPT_FLT2,
    D_EPT_FLT2_FAULT,
    D_EPT_FLT2_UNAVAIL,
    D_EPT_UPS,
    D_EPT_CLS_ACC_FLT,
    D_EPT_OHTG,
    D_EPT_OHTG_FAULT,
    D_EPT_OHTG_UNAVAIL,
    D_EPT_MCBS,
    D_EPT_MCBS_FAULT,
    D_EPT_MCBS_UNAVAIL,
    D_EPT_ESTOP,
    D_EPT_ACC,
    D_EPT_KEYSW,
    D_EPT_EPLC,
    D_EPT_PLC_WARN_STATE,
    D_EPT_PLC_S2_FLT_STATE,
    D_EPT_PLC_S3_FLT_STATE,
    D_EPT_PLC_SHUTDOWN,
    D_EPT_PLC_WDOG,
    D_EPT_MAIN_PWR,
    D_EPT_R1_SLP,
    D_EPT_R1_SLP_FAULT,
    D_EPT_R1_SLP_UNAVAIL,
    D_EPT_R2_SLP,
    D_EPT_R2_SLP_FAULT,
    D_EPT_R2_SLP_UNAVAIL,
    D_EPT_R3_SLP,
    D_EPT_R3_SLP_FAULT,
    D_EPT_R3_SLP_UNAVAIL,
    D_EPT_R4_SLP,
    D_EPT_R4_SLP_FAULT,
    D_EPT_R4_SLP_UNAVAIL,
    D_EPT_QTY_PMP_STRTS,
    D_EPT_QTY_PMP_HOURS,
    D_EPT_RAM1_PRES,
    D_EPT_RAM2_PRES,
    D_EPT_RAM3_PRES,
    D_EPT_RAM4_PRES,
    D_EPT_HTK_ACT_TEMP,
    D_EPT_R1_PRES_TL,
    D_EPT_R1_PRES_TL_FAIL,
    D_EPT_R2_PRES_TL,
    D_EPT_R2_PRES_TL_FAIL,
    D_EPT_R3_PRES_TL,
    D_EPT_R3_PRES_TL_FAIL,
    D_EPT_R4_PRES_TL,
    D_EPT_R4_PRES_TL_FAIL,
    D_EPT_PANEL_TEMP,
    D_EPT_MAIN_HYD_PRES,
    D_EPT_S1_R1_ENC,
    D_EPT_S1_R2_ENC,
    D_EPT_S2_R3_ENC,
    D_EPT_S2_R4_ENC,
    D_EPT_S1_ENC_MIS,
    D_EPT_S2_ENC_MIS,
    D_EPT_PLC_LOW_BAT,
    D_EPT_PLC_PROC_FAULT,
    D_EPT_PLC_MODE,
    D_EPT_PROG_VERS_MANT,
    D_EPT_PROG_VERS_REM,
    D_EPT_DC_PMP,
    D_EPT_DC_PMP_FAULT,
    D_EPT_DC_PMP_UNAVAIL,
    D_EPT_DC_PMP_OLT,
    D_EPT_DC_PMP_CBT,
    D_EPT_FLT_PMP,
    D_EPT_FLT_PMP_FAULT,
    D_EPT_FLT_PMP_UNAVAIL,
    D_EPT_FLT_PMP_OLT,
    D_EPT_FLT_PMP_CBT,
    D_EPT_DC_PMP_UPS,
    D_EPT_PLC_UPS,
    D_EPT_OHTG_1,
    D_EPT_OHTG_1_FAULT,
    D_EPT_OHTG_1_UNAVAIL,
    D_EPT_OHTG_2,
    D_EPT_OHTG_2_FAULT,
    D_EPT_OHTG_2_UNAVAIL,
    D_EPT_PSU,
    D_EPT_QTY_DC_PMP_HR,
    D_EPT_QTY_FLT_PMP_HR,
    D_EPT_DOME_STATE,
    D_EPT_AZM_POS,
    D_EPT_ALT_POS,
    D_EPT_AZM_LOW_POS,
    D_EPT_AZM_HIGH_POS,
    D_EPT_ALT_LOW_POS,
    D_EPT_ALT_HIGH_POS,
    D_EPT_SER_MSG_CODE,
    SET_1,
    D_EPT_DMD_AP_STATE,
    D_EPT_DMD_S1_STATE,
    D_EPT_DMD_S2_STATE,
    D_EPT_DMD_AP_POS,
    D_EPT_DMD_S1_POS,
    D_EPT_DMD_S2_POS,
    D_EPT_DMD_HALT,
    D_EPT_DMD_STOP,
    D_EPT_DMD_ALL_LCK,
    D_EPT_DMD_TOP_LCK,
    D_EPT_DMD_S1_LCK,
    D_EPT_DMD_S2_LCK,
    D_EPT_DMD_OHTG,
    D_EPT_DMD_HYD,
    D_EPT_DMD_DCHRG_ACC,
    D_EPT_DMD_FLT,
    D_EPT_DMD_ESTOP,
    D_EPT_DMD_SAFE,
    D_EPT_DMD_DOME_AZM,
    D_EPT_DMD_DOME_ALT,
    This,
    D_EPT_DMD_QRY_STATUS,
    D_EPT_DATAID_EOL
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
   * Return an object reference of the EPT_DataType with the String
   * name specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param s the name of the EPT_DataType
   * @return a reference to the EPT_DataType specified by the argument
   */
  public static EPT_DataType getReference( String s )
  {
    return( (EPT_DataType)( nameHash.get( s ) ) );
  }


  /**
   * Return an object reference of the EPT_DataType with the int value
   * specified.
   * <p>
   * <b>NOTE:</b> if there is no matching reference <code>null</code> will be
   * returned.
   * @param i the int representation of the EPT_DataType
   * @return a reference to the EPT_DataType specified by the argument
   */
  public static EPT_DataType getReference( int i )
  {
    return( (EPT_DataType)( intHash.get( new Integer( i ) ) ) );
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
  private EPT_DataType( String s )
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
  private EPT_DataType( String s, int i )
  {
    name = s;
    nameHash.put( s, this );
    intValue = i + ( ttlPackage.getInt() << 16 );
    intHash.put( new Integer( intValue ), this );
  }


  /**
   * Return the name of this EPT_DataType.
   * @return name
   * @see #name
   */
  public final String getName()
  {
    return name;
  }


  /**
   * Return the int representation of this EPT_DataType.
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
