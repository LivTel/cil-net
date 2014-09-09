/*
** Filename : CilPrivate.h
**
** Purpose : CIL internal header.
**
** Description : Private types enumerations and macros, not
** to be used packages other than CIL. If an item is required
** for general use it should be moved to Cil.h.
**
** Authors :
** Paul Wright (TTL)
**
** History :
** 13.05.99 : Created, PLW.
*/

#ifndef CIL_PRIVATE_H_DEFINED
#define CIL_PRIVATE_H_DEFINED

#include "Cil.h"
#include "TtlSystem.h"

/* Prototypes for internal functions */

static int iCilCreateUDPSocket(FILE *CIL_FILE, struct TASKDATA *WorkData);
static Bool_t iCilSocketHasData(int Socket);

#endif /* CIL_PRIVATE_H_DEFINED */
