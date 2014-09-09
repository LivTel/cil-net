/*******************************************************************************
** Header File Name:
**    Hti.h
**
** Purpose:
**    Header file for the Header-to-ID conversion library.
**
** Description:
**    Contains the macros, type definitions and function prototypes needed to 
**    use the Header-to-ID conversion library.
**
**    This code has been written to conform to "TTL Coding Standard" v1.0.
**
** Traceability to Software Design:
**    -
**
** Author(s):
**    Martyn J. Ford (mjf)
**
** Copyright (c) Telescope Technologies Limited (TTL), 2001
**
** Version:
**    $Id: Hti.h,v 0.3 2002/10/09 10:05:19 dws Exp $
**
** History:
**    $Log: Hti.h,v $
**    Revision 0.3  2002/10/09 10:05:19  dws
**    Added new function eHtiGetOiDDescriptionString to get a
**    comment asscoiated with an OiD
**
**    Revision 0.2  2002/04/18 15:22:45  djm
**    Added error codes for the new binary look-up functions.
**    Also moved some private symbolic constants to here for
**    global access. Added the function prototype for the new
**    binary data look-up function.
**
**    Revision 0.1  2001/02/14 13:45:20  mjf
**    Initial revision.
**
**
*******************************************************************************/

#ifndef HTI_H_DEFINED
#define HTI_H_DEFINED


/*
** Returned status values
*/

enum eHtiStatus_e {

   E_HTI_GEN_ERR = STATUS_START( HTI ),/* Miscellaneous error */
   E_HTI_UNRESOLVED,                   /* Unable to resolve label or value */
   E_HTI_FILE_ERROR,                   /* Unable to open lookup table file */
   E_HTI_INDEX_TOO_LOW,                /* Index below expected minimum */
   E_HTI_INDEX_TOO_HIGH,               /* Index above expected maximum */
   E_HTI_BIN_HEADER_FAILURE,           /* Unable to read binary file header */
   E_HTI_BIN_READ_ERROR,               /* Unable to read binary record */
   E_HTI_NO_BIN_MATCH,                 /* Binary look-up failed to find entry */

   E_HTI_EO_ERROR_LIST                 /* Do not use */
};


/* Maximum length of HTI label/description strings */

#define E_HTI_MAX_STRING_LEN   128
#define E_HTI_MAX_CILSTR_LEN   E_CIL_IDLEN

/* 
** Function prototypes
*/

/* To resolve a numeric identifier from a textual label */

Status_t eHtiGetDataId       ( Int32_t CilId, const char * Label, 
                               Int32_t * Value );
Status_t eHtiGetUnitId       ( const char * Label, Int32_t * Value );
Status_t eHtiGetGeneralId    ( Int32_t CilId, const char * Label, 
                               Int32_t * Value );
Status_t eHtiGetIdentifier   ( const char * Filename, Int32_t CilId, 
                               const char * Label, Int32_t * Value );

/* To resolve a textual label from a numeric identifier */

Status_t eHtiGetDataLabel    ( Int32_t CilId, Int32_t Value, char * Buffer );
Status_t eHtiGetUnitLabel    ( Int32_t Value, char * Buffer );
Status_t eHtiGetGeneralLabel ( Int32_t CilId, Int32_t Value, char * Buffer );
Status_t eHtiGetLabel        ( const char * Filename, Int32_t CilId, 
                               Int32_t Value, char * Buffer );

/* To resolve a label from an identifier, returning number if unresolved */

char *   eHtiGetDataString   ( Int32_t CilId, Int32_t Value, char * Buffer );
char *   eHtiGetUnitString   ( Int32_t Value, char * Buffer );
char *   eHtiGetGeneralString( Int32_t CilId, Int32_t Value, char * Buffer );
char *   eHtiGetString       ( const char * Filename, Int32_t CilId, 
                               Int32_t Value, char * Buffer );

/* To look up a description for a specified identifier */

Status_t eHtiGetDescription  ( const char * Filename, Int32_t CilId, 
                               Int32_t Value, char * Buffer );

/* To look up a description, returning an empty string if unresolved */
char *   eHtiGetOiDDescriptionString( Int32_t CilId, 
                                   Int32_t Value, char * Buffer );
char *   eHtiGetDescriptionString( const char * Filename, Int32_t CilId, 
                               Int32_t Value, char * Buffer );

/* To look-up the binary file */

Status_t eHtiBinGetData ( const char  *FileNamePtr, Int32_t CilId,
                          Int32_t Value, char *LabelPtr, char *DescrPtr );


#endif

/*
** EOF
*/

