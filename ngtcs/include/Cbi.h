/*
**
** Module Name :
**     Cbi.h
**
** Purpose :
**
** Description :
**
** Imported Definitions :
**
**
** Exported Definitions :
**
**
** Private Definitions :
**
**
** Authors :
**    PXH : Pete Hall (TTL)
**
** Version :
**    $Id: Cbi.h,v 0.3 2001/09/28 16:16:14 mjf Exp $
**
** History :
**    $Log: Cbi.h,v $
**    Revision 0.3  2001/09/28 16:16:14  mjf
**    Implementation of relative as well as absolute move function. Removal
**    of functions to get CTR2 and CTR3, to be implemented using the GetInput
**    function with the IO identifier using a parameter from Can.h.
**
**    Revision 0.2  2001/05/25 15:35:48  pxh
**    Added function protoypes for eCbiGetCtr2 & eCbiGetCtr3.
**
**    Revision 0.1  2001/04/23 10:53:51  pxh
**    Initial revision.
**
**
*/

#ifndef _CBI_H_DEFINED
#define _CBI_H_DEFINED

/*
** Required include files
*/


#include <unistd.h>
#include <sys/types.h>

#include "TtlSystem.h"


enum eCbiStatus_e {
   E_CBI_GEN_ERROR = STATUS_START(CBI),
   E_CBI_SEND_FAIL
};

extern Status_t eCbiOpenChan        (pid_t         CanServerPid,
                                     eCanDevId_t   DevId,
                                     Int32_t       TxId,
                                     Int32_t       RxId
);

extern Status_t eCbiCloseChan       (pid_t         CanServerPid,
                                     eCanDevId_t   DevId);

extern Status_t eCbiStopAxis        (pid_t         CanServerPid,
                                     eCanDevId_t   DevId);

extern Status_t eCbiMoveAxis        (pid_t         CanServerPid,
                                     eCanDevId_t   DevId,
                                     Int32_t       Position
);

extern Status_t eCbiMoveAxisRel     (pid_t         CanServerPid,
                                     eCanDevId_t   DevId,
                                     Int32_t       Offset
);

extern Status_t eCbiGetMvg          (pid_t         CanServerPid,
                                     eCanDevId_t   DevId,
                                     Bool_t       *MvgPtr
);

extern Status_t eCbiGetPos          (pid_t         CanServerPid,
                                     eCanDevId_t   DevId,
                                     Int32_t      *PosPtr
);

extern Status_t eCbiGetError        (pid_t         CanServerPid,
                                     eCanDevId_t   DevId,
                                     Int32_t      *ErrPtr
);

extern Status_t eCbiSetOutput       (pid_t         CanServerPid,
                                     eCanDevId_t   DevId,
                                     Int32_t       IOLine,
                                     Int32_t       IOSetting
);

extern Status_t eCbiGetInput        (pid_t         CanServerPid,
                                     eCanDevId_t   DevId,
                                     Int32_t       IOLine,
                                     Int32_t      *IOPtr
);

extern Status_t eCbiInitLynx        (pid_t         CanServerPid,
                                     eCanDevId_t   DevId);

extern Status_t eCbiDisableLynx     (pid_t         CanServerPid,
                                     eCanDevId_t   DevId);

#endif