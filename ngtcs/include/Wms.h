/*******************************************************************************
** Module Name:
**    Wms.h
**
** Purpose:
**    Public header file for Weather Monitoring System Task.
**
** Description:
**    This code has been written to conform to "TTL Coding Standard" v1.0.
**
** Traceability to Software Design:
**    WMS design and implementation document v0.01 1-Nov-2000.
**
** Author(s):
**    Lorna J. Slater (ljs)
**    Martyn J. Ford (mjf)
**    Derek J. McKay (djm)
**
** Copyright (c) Telescope Technologies Limited (TTL), 2000
**
** Version:
**    $Id: Wms.h,v 0.8 2002/10/11 10:24:17 sxf Exp $
**
** History:
**    $Log: Wms.h,v $
**    Revision 0.8  2002/10/11 10:24:17  sxf
**    Added range percent dataids and split out of range enumerated type
**    to out of range low and high.
**
**    Revision 0.7  2002/10/03 15:07:15  sxf
**    Revise comments for each possible weather reading so that Eci using
**    Hti can display a sensible name for each value displayed.
**
**    Revision 0.6  2002/10/02 11:15:13  sxf
**    Added SUMMARY DataIds, list of reading offsets and an enumerated list
**    for the SUMMARY DataId.
**
**    Revision 0.5  2002/09/20 08:39:27  sxf
**    Added configurable delay for WS requests.
**    Changed E_WMS_SOURCE_SERIAL to E_WMS_SOURCE_WS.
**    ,
**
**    Revision 0.4  2002/09/13 14:50:28  sxf
**    Add D_WMS_ENGINEER_MODE datum
**
**    Revision 0.3  2002/09/09 13:48:04  sxf
**    Major overhaul to read weather data from serial port, file or
**    a simulation.
**
**    Revision 0.2  2000/10/25 11:21:51  ljs
**    Added Dew states, and simulation datum.
**
**    Revision 0.1  2000/10/18 15:45:18  ljs
**    Initial Creation.
**
**
*******************************************************************************/


#ifndef WMS_H_DEFINED
#define WMS_H_DEFINED


/*
** Compiler include files
*/


/*
** System include files
*/

#include "TtlSystem.h"
#include "Mcp.h"
#include "Sdb.h"


/*
** Local include files
*/


/*
** Macro definitions
*/

/*
** Type definitions
*/


/*
** Enumerated list of status and error values
*/
typedef enum eWmsStatus_e
{                                                                
   E_WMS_ERR_GEN = STATUS_START(WMS),  /* Miscellaneous error */
   E_WMS_ERR_SETUP,                    /* Error performing setup */
   E_WMS_ERR_HEARTBEATS,               /* Heartbeats lost, assumed safe-state */
   E_WMS_ERR_CIL_RX,                   /* Unexpected CIL message received */
   E_WMS_ERR_SDB_SUBMIT,               /* Error performing SDB submission */
   E_WMS_CONFIGERR,                    /* Error reading config file */
   E_WMS_FILEERR,                      /* Error reading weather data file */
   E_WMS_FATALFILEERR,                 /* Fatal error reading weather data file */
   E_WMS_PROC_WEATHER_DATA,            /* Error processing weather data */
   E_WMS_OUTOFRANGE,                   /* Attempt to set DataId out of range */
   E_WMS_NO_SET,                       /* Unable to set DataId */
   E_WMS_INVDATAID,                    /* Invalid dataid */
   E_WMS_UNEXPECTED_MSG,               /* Unexpected CIL message */
   E_WMS_NO_COMMAND,                   /* Command not set up */
   E_WMS_STALE_FILE                    /* Weather data file too far in past */
} eWmsStatus_t;

/*
** WMS messages - services offered by the WMS
*/
typedef enum eWmsService_e
{
   E_WMS_HEARTBEAT = E_MCP_HEARTBEAT,  /* Heartbeat command */
   E_WMS_SHUTDOWN  = E_MCP_SHUTDOWN,   /* Shutdown command  */
   E_WMS_SAFESTATE = E_MCP_SAFESTATE,  /* Safestate command */
   E_WMS_ACTIVATE  = E_MCP_ACTIVATE,   /* Activate command  */
   E_WMS_SET_1     = E_MCP_SET_1       /* Set one Oid       */
} eWmsService_t;

/*
** Enumerated list giving bit numbers for summary DataId
**   e.g. if a reading is of severity critical, is out of range
**        but not yet bad then 
**        D_WMS_SUMMARY_... = 0x04 | 0x01 = 0x05
*/
typedef enum eWmsSummaryDataId_s
{
   E_WMS_IN_RANGE          = 0x01,     /* DataId is in range */
   E_WMS_OUT_OF_RANGE_LO   = 0x02,     /* DataId is out of range, low */
   E_WMS_OUT_OF_RANGE_HI   = 0x04,     /* DataId is out of range, high */
   E_WMS_WARNING_SEVERITY  = 0x08,     /* DataId has severity WARNING */
   E_WMS_CRITICAL_SEVERITY = 0x10,     /* DataId has severity CRITICAL */
   E_WMS_BAD_READING       = 0x20,     /* DataId reading is now bad */
   E_WMS_INVALID_READING   = 0x40      /* DataId reading is invalid */
} eWmsSummaryDataId_t;

/*
** Offsets for each reading in DataId list
*/
typedef enum eWmsReadingOffset_s
{
   E_WMS_READING_OFFSET,       /* Offset to reading DataId */
   E_WMS_OUTOFRANGE_OFFSET,    /* Offset to out of range flag DataId */
   E_WMS_RANGELO_OFFSET,       /* Offset to lower range DataId */
   E_WMS_RANGEHI_OFFSET,       /* Offset to upper range DataId */
   E_WMS_RANGEPC_OFFSET,       /* Percent of total range for reading */
   E_WMS_NOUTOFRANGE_OFFSET,   /* Offset to out of range count DataId */
   E_WMS_SEVCRIT_OFFSET,       /* Offset to severity DataId */
   E_WMS_LOCAL_OFFSET,         /* Offset to local/remote DataId */
   E_WMS_SUMMARY_OFFSET,       /* Offset to summary DataID */ 
   E_WMS_OFFSET_TOTAL          /* Total number of offsets */
} eWmsReadingOffset_t;

/*
** Global data for submission to Status Database (SDB)
**
** NB the following points about the structure of this list
**
** 1. All of the DataIds from D_MCP_FIRST_USER_DATUM to D_WMS_END_OF_READINGS
**    are groups of data relating to each possible weather reading.
**    The order within these groups is as defined in eWmsReadingOffset_t.
**
** 2. The comment after each datum D_WMS_READING_... is used as a description
**    in other places (such as the Eci) and should have 21 characters or less.
**
** 3. Each of the possible weather readings in the list are ordered such that
**    they are grouped logically together for display purposes.
**
*/
typedef enum eWmsDataId_e
{
   D_WMS_DATAID_BOL = 0,                         /* Begining of data list */

   D_WMS_PROC_STATE  = D_MCP_PROC_STATE,           /* Process state datum */
   D_WMS_AUTH_STATE  = D_MCP_AUTH_STATE,           /* Authorisation state */
   D_WMS_SYS_REQUEST = D_MCP_SYS_REQUEST,               /* System request */
   D_WMS_APP_VERSION = D_MCP_APP_VERSION,          /* Application version */                    

   /* PT - Air temperature */
   D_WMS_READING_PT  = D_MCP_FIRST_USER_DATUM,         /* Air temperature */ 
   D_WMS_OUTOFRANGE_PT,                               /* .. out of range? */
   D_WMS_RANGELO_PT,                                  /* .. minimum value */
   D_WMS_RANGEHI_PT,                                  /* .. maximum value */
   D_WMS_RANGEPC_PT,                         /* .. percent of total range */
   D_WMS_NOUTOFRANGE_PT,                       /* .. allowed out of range */
   D_WMS_SEVCRIT_PT,                              /* .. critical failure? */
   D_WMS_LOCAL_PT,                               /* .. local (or remote)? */
   D_WMS_SUMMARY_PT,                           /* ... summary for reading */

   /* VH - Humidity */ 
   D_WMS_READING_VH,                                          /* Humidity */ 
   D_WMS_OUTOFRANGE_VH,                               /* .. out of range? */
   D_WMS_RANGELO_VH,                                  /* .. minimum value */
   D_WMS_RANGEHI_VH,                                  /* .. maximum value */
   D_WMS_RANGEPC_VH,                         /* .. percent of total range */
   D_WMS_NOUTOFRANGE_VH,                       /* .. allowed out of range */
   D_WMS_SEVCRIT_VH,                              /* .. critical failure? */
   D_WMS_LOCAL_VH,                               /* .. local (or remote)? */
   D_WMS_SUMMARY_VH,                           /* ... summary for reading */

   /* TDEW - Dew point */ 
   D_WMS_READING_TDEW,                                       /* Dew point */ 
   D_WMS_OUTOFRANGE_TDEW,                             /* .. out of range? */
   D_WMS_RANGELO_TDEW,                                /* .. minimum value */
   D_WMS_RANGEHI_TDEW,                                /* .. maximum value */
   D_WMS_RANGEPC_TDEW,                       /* .. percent of total range */
   D_WMS_NOUTOFRANGE_TDEW,                     /* .. allowed out of range */
   D_WMS_SEVCRIT_TDEW,                            /* .. critical failure? */
   D_WMS_LOCAL_TDEW,                             /* .. local (or remote)? */
   D_WMS_SUMMARY_TDEW,                         /* ... summary for reading */

   /* F1WS - Wind speed */ 
   D_WMS_READING_F1WS,                                      /* Wind speed */ 
   D_WMS_OUTOFRANGE_F1WS,                             /* .. out of range? */
   D_WMS_RANGELO_F1WS,                                /* .. minimum value */
   D_WMS_RANGEHI_F1WS,                                /* .. maximum value */
   D_WMS_RANGEPC_F1WS,                       /* .. percent of total range */
   D_WMS_NOUTOFRANGE_F1WS,                     /* .. allowed out of range */
   D_WMS_SEVCRIT_F1WS,                            /* .. critical failure? */
   D_WMS_LOCAL_F1WS,                             /* .. local (or remote)? */
   D_WMS_SUMMARY_F1WS,                         /* ... summary for reading */

   /* RPWD - Wind direction */ 
   D_WMS_READING_RPWD,                                  /* Wind direction */ 
   D_WMS_OUTOFRANGE_RPWD,                             /* .. out of range? */
   D_WMS_RANGELO_RPWD,                                /* .. minimum value */
   D_WMS_RANGEHI_RPWD,                                /* .. maximum value */
   D_WMS_RANGEPC_RPWD,                       /* .. percent of total range */
   D_WMS_NOUTOFRANGE_RPWD,                     /* .. allowed out of range */
   D_WMS_SEVCRIT_RPWD,                            /* .. critical failure? */
   D_WMS_LOCAL_RPWD,                             /* .. local (or remote)? */
   D_WMS_SUMMARY_RPWD,                         /* ... summary for reading */

   /* VPR - Air pressure */ 
   D_WMS_READING_VPR,                                     /* Air pressure */ 
   D_WMS_OUTOFRANGE_VPR,                              /* .. out of range? */
   D_WMS_RANGELO_VPR,                                 /* .. minimum value */
   D_WMS_RANGEHI_VPR,                                 /* .. maximum value */
   D_WMS_RANGEPC_VPR,                        /* .. percent of total range */
   D_WMS_NOUTOFRANGE_VPR,                      /* .. allowed out of range */
   D_WMS_SEVCRIT_VPR,                             /* .. critical failure? */
   D_WMS_LOCAL_VPR,                              /* .. local (or remote)? */
   D_WMS_SUMMARY_VPR,                          /* ... summary for reading */

   /* DSWE - Digital surface wetness */ 
   D_WMS_READING_DSWE,                             /* Digital surface wet */ 
   D_WMS_OUTOFRANGE_DSWE,                             /* .. out of range? */
   D_WMS_RANGELO_DSWE,                                /* .. minimum value */
   D_WMS_RANGEHI_DSWE,                                /* .. maximum value */
   D_WMS_RANGEPC_DSWE,                       /* .. percent of total range */
   D_WMS_NOUTOFRANGE_DSWE,                     /* .. allowed out of range */
   D_WMS_SEVCRIT_DSWE,                            /* .. critical failure? */
   D_WMS_LOCAL_DSWE,                             /* .. local (or remote)? */
   D_WMS_SUMMARY_DSWE,                         /* ... summary for reading */

   /* VWE - Analogue surface wetness */ 
   D_WMS_READING_VWE,                             /* Analogue surface wet */ 
   D_WMS_OUTOFRANGE_VWE,                              /* .. out of range? */
   D_WMS_RANGELO_VWE,                                 /* .. minimum value */
   D_WMS_RANGEHI_VWE,                                 /* .. maximum value */
   D_WMS_RANGEPC_VWE,                        /* .. percent of total range */
   D_WMS_NOUTOFRANGE_VWE,                      /* .. allowed out of range */
   D_WMS_SEVCRIT_VWE,                             /* .. critical failure? */
   D_WMS_LOCAL_VWE,                              /* .. local (or remote)? */
   D_WMS_SUMMARY_VWE,                          /* ... summary for reading */

   /* VPY - Light */ 
   D_WMS_READING_VPY,                                            /* Light */ 
   D_WMS_OUTOFRANGE_VPY,                              /* .. out of range? */
   D_WMS_RANGELO_VPY,                                 /* .. minimum value */
   D_WMS_RANGEHI_VPY,                                 /* .. maximum value */
   D_WMS_RANGEPC_VPY,                        /* .. percent of total range */
   D_WMS_NOUTOFRANGE_VPY,                      /* .. allowed out of range */
   D_WMS_SEVCRIT_VPY,                             /* .. critical failure? */
   D_WMS_LOCAL_VPY,                              /* .. local (or remote)? */
   D_WMS_SUMMARY_VPY,                          /* ... summary for reading */

   /* UIN - Supply voltage */ 
   D_WMS_READING_UIN,                                   /* Supply voltage */ 
   D_WMS_OUTOFRANGE_UIN,                              /* .. out of range? */
   D_WMS_RANGELO_UIN,                                 /* .. minimum value */
   D_WMS_RANGEHI_UIN,                                 /* .. maximum value */
   D_WMS_RANGEPC_UIN,                        /* .. percent of total range */
   D_WMS_NOUTOFRANGE_UIN,                      /* .. allowed out of range */
   D_WMS_SEVCRIT_UIN,                             /* .. critical failure? */
   D_WMS_LOCAL_UIN,                              /* .. local (or remote)? */
   D_WMS_SUMMARY_UIN,                          /* ... summary for reading */

   /* IR - Reference current */ 
   D_WMS_READING_IR,                                 /* Reference current */ 
   D_WMS_OUTOFRANGE_IR,                               /* .. out of range? */
   D_WMS_RANGELO_IR,                                  /* .. minimum value */
   D_WMS_RANGEHI_IR,                                  /* .. maximum value */
   D_WMS_RANGEPC_IR,                         /* .. percent of total range */
   D_WMS_NOUTOFRANGE_IR,                       /* .. allowed out of range */
   D_WMS_SEVCRIT_IR,                              /* .. critical failure? */
   D_WMS_LOCAL_IR,                               /* .. local (or remote)? */
   D_WMS_SUMMARY_IR,                           /* ... summary for reading */

   /* TIN - Internal temperature */ 
   D_WMS_READING_TIN,                             /* Internal temperature */ 
   D_WMS_OUTOFRANGE_TIN,                              /* .. out of range? */
   D_WMS_RANGELO_TIN,                                 /* .. minimum value */
   D_WMS_RANGEHI_TIN,                                 /* .. maximum value */
   D_WMS_RANGEPC_TIN,                        /* .. percent of total range */
   D_WMS_NOUTOFRANGE_TIN,                      /* .. allowed out of range */
   D_WMS_SEVCRIT_TIN,                             /* .. critical failure? */
   D_WMS_LOCAL_TIN,                              /* .. local (or remote)? */
   D_WMS_SUMMARY_TIN,                          /* ... summary for reading */

   /* RT - Ref temp */
   D_WMS_READING_RT,                                          /* Ref temp */ 
   D_WMS_OUTOFRANGE_RT,                               /* .. out of range? */
   D_WMS_RANGELO_RT,                                  /* .. minimum value */
   D_WMS_RANGEHI_RT,                                  /* .. maximum value */
   D_WMS_RANGEPC_RT,                         /* .. percent of total range */
   D_WMS_NOUTOFRANGE_RT,                       /* .. allowed out of range */
   D_WMS_SEVCRIT_RT,                              /* .. critical failure? */
   D_WMS_LOCAL_RT,                               /* .. local (or remote)? */
   D_WMS_SUMMARY_RT,                           /* ... summary for reading */

   /* RWS - Remote wind speed */ 
   D_WMS_READING_RWS,                                /* Remote wind speed */ 
   D_WMS_OUTOFRANGE_RWS,                              /* .. out of range? */
   D_WMS_RANGELO_RWS,                                 /* .. minimum value */
   D_WMS_RANGEHI_RWS,                                 /* .. maximum value */
   D_WMS_RANGEPC_RWS,                        /* .. percent of total range */
   D_WMS_NOUTOFRANGE_RWS,                      /* .. allowed out of range */
   D_WMS_SEVCRIT_RWS,                             /* .. critical failure? */
   D_WMS_LOCAL_RWS,                              /* .. local (or remote)? */
   D_WMS_SUMMARY_RWS,                          /* ... summary for reading */

   /* RVWS - Remote vertical wind speed */ 
   D_WMS_READING_RVWS,                             /* Rem vert wind speed */ 
   D_WMS_OUTOFRANGE_RVWS,                             /* .. out of range? */
   D_WMS_RANGELO_RVWS,                                /* .. minimum value */
   D_WMS_RANGEHI_RVWS,                                /* .. maximum value */
   D_WMS_RANGEPC_RVWS,                       /* .. percent of total range */
   D_WMS_NOUTOFRANGE_RVWS,                     /* .. allowed out of range */
   D_WMS_SEVCRIT_RVWS,                            /* .. critical failure? */
   D_WMS_LOCAL_RVWS,                             /* .. local (or remote)? */
   D_WMS_SUMMARY_RVWS,                         /* ... summary for reading */

   /* RWE - Remote Wetness */ 
   D_WMS_READING_RWE,                                   /* Remote Wetness */ 
   D_WMS_OUTOFRANGE_RWE,                              /* .. out of range? */
   D_WMS_RANGELO_RWE,                                 /* .. minimum value */
   D_WMS_RANGEHI_RWE,                                 /* .. maximum value */
   D_WMS_RANGEPC_RWE,                        /* .. percent of total range */
   D_WMS_NOUTOFRANGE_RWE,                      /* .. allowed out of range */
   D_WMS_SEVCRIT_RWE,                             /* .. critical failure? */
   D_WMS_LOCAL_RWE,                              /* .. local (or remote)? */
   D_WMS_SUMMARY_RWE,                          /* ... summary for reading */

   /* ICE - Ice flag */ 
   D_WMS_READING_ICE,                                         /* Ice flag */ 
   D_WMS_OUTOFRANGE_ICE,                              /* .. out of range? */
   D_WMS_RANGELO_ICE,                                 /* .. minimum value */
   D_WMS_RANGEHI_ICE,                                 /* .. maximum value */
   D_WMS_RANGEPC_ICE,                        /* .. percent of total range */
   D_WMS_NOUTOFRANGE_ICE,                      /* .. allowed out of range */
   D_WMS_SEVCRIT_ICE,                             /* .. critical failure? */
   D_WMS_LOCAL_ICE,                              /* .. local (or remote)? */
   D_WMS_SUMMARY_ICE,                          /* ... summary for reading */

   /* CCOV - Cloud cover */ 
   D_WMS_READING_CCOV,                                     /* Cloud cover */ 
   D_WMS_OUTOFRANGE_CCOV,                             /* .. out of range? */
   D_WMS_RANGELO_CCOV,                                /* .. minimum value */
   D_WMS_RANGEHI_CCOV,                                /* .. maximum value */
   D_WMS_RANGEPC_CCOV,                       /* .. percent of total range */
   D_WMS_NOUTOFRANGE_CCOV,                     /* .. allowed out of range */
   D_WMS_SEVCRIT_CCOV,                            /* .. critical failure? */
   D_WMS_LOCAL_CCOV,                             /* .. local (or remote)? */
   D_WMS_SUMMARY_CCOV,                         /* ... summary for reading */

   /* TCOV = Total cloud cover */ 
   D_WMS_READING_TCOV,                               /* Total cloud cover */ 
   D_WMS_OUTOFRANGE_TCOV,                             /* .. out of range? */
   D_WMS_RANGELO_TCOV,                                /* .. minimum value */
   D_WMS_RANGEHI_TCOV,                                /* .. maximum value */
   D_WMS_RANGEPC_TCOV,                       /* .. percent of total range */
   D_WMS_NOUTOFRANGE_TCOV,                     /* .. allowed out of range */
   D_WMS_SEVCRIT_TCOV,                            /* .. critical failure? */
   D_WMS_LOCAL_TCOV,                             /* .. local (or remote)? */
   D_WMS_SUMMARY_TCOV,                         /* ... summary for reading */

   /* CPRE - CAPS Predicition */ 
   D_WMS_READING_CPRE,                                /* CAPS Predicition */ 
   D_WMS_OUTOFRANGE_CPRE,                             /* .. out of range? */
   D_WMS_RANGELO_CPRE,                                /* .. minimum value */
   D_WMS_RANGEHI_CPRE,                                /* .. maximum value */
   D_WMS_RANGEPC_CPRE,                       /* .. percent of total range */
   D_WMS_NOUTOFRANGE_CPRE,                     /* .. allowed out of range */
   D_WMS_SEVCRIT_CPRE,                            /* .. critical failure? */   
   D_WMS_LOCAL_CPRE,                             /* .. local (or remote)? */
   D_WMS_SUMMARY_CPRE,                         /* ... summary for reading */

   /* CFOR - CAPS Forecast */
   D_WMS_READING_CFOR,                                   /* CAPS Forecast */ 
   D_WMS_OUTOFRANGE_CFOR,                             /* .. out of range? */
   D_WMS_RANGELO_CFOR,                                /* .. minimum value */
   D_WMS_RANGEHI_CFOR,                                /* .. maximum value */
   D_WMS_RANGEPC_CFOR,                       /* .. percent of total range */
   D_WMS_NOUTOFRANGE_CFOR,                     /* .. allowed out of range */
   D_WMS_SEVCRIT_CFOR,                            /* .. critical failure? */
   D_WMS_LOCAL_CFOR,                             /* .. local (or remote)? */
   D_WMS_SUMMARY_CFOR,                         /* ... summary for reading */

   /* DIS - Disaster flag */
   D_WMS_READING_DIS,                                    /* Disaster flag */ 
   D_WMS_OUTOFRANGE_DIS,                              /* .. out of range? */
   D_WMS_RANGELO_DIS,                                 /* .. minimum value */
   D_WMS_RANGEHI_DIS,                                 /* .. maximum value */
   D_WMS_RANGEPC_DIS,                        /* .. percent of total range */
   D_WMS_NOUTOFRANGE_DIS,                      /* .. allowed out of range */
   D_WMS_SEVCRIT_DIS,                             /* .. critical failure? */
   D_WMS_LOCAL_DIS,                              /* .. local (or remote)? */
   D_WMS_SUMMARY_DIS,                          /* ... summary for reading */

   D_WMS_END_OF_READINGS,     /* Dummy DataId indicating no more readings */

   D_WMS_ENGINEER_MODE,                /* Enter or leave engineering mode */
   D_WMS_SERIAL_REQ_DELAY,          /* Configurable delay for WS requests */
   D_WMS_FILE_TIME_TOL,        /* Maximum time diff between file & system */

   D_WMS_DATAID_EOL                                 /* End of list marker */

} eWmsDataId_t;

/*
** Enumerated list containing possible sources of data.
*/
typedef enum eWmsSource_s
{
   E_WMS_SOURCE_BOL,        /* Bottom of list marker */
   
   E_WMS_SOURCE_SIMULATE,   /* Weather data simulated by the Wms */
   E_WMS_SOURCE_WS,         /* Weather data from weather station */
   E_WMS_SOURCE_FILE,       /* Weather data from CAPS file */
   
   E_WMS_SOURCE_EOL         /* End of list marker */

} eWmsSource_t;

#endif

/*******************************************************************************
** End of File Name: Wms.h
*******************************************************************************/
