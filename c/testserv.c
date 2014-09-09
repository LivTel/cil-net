#include <stdio.h>
#include <stdlib.h>
#include <mqueue.h>

#include "Cil.h"
#include "TtlSystem.h"

/* Misc Globals required for CIL */

struct TASKDATA THIS;
char MapFileName[] = "Cil.map";
int THISID = MCBID;
struct TASKDATA THIS, SAM, RCS;
mqd_t ERH_QID;
FILE *CIL_File;
union TRANDATA SendData, ReplyData;

/* Transaction Timing Varibles - Global */
int CmdRecord;
int TCount;
int TSum;
int TRange1;
int TRange2;
int TRange3;
int TRange4;
int TRange5;
int TRange6;
int TRange7;
int TRange8;




int main(int argc, char** argv)
{
  int Status;

  CIL_File = fopen(MapFileName, "r+");

  if ((Status = CIL_Setup(CIL_File, THISID, &THIS)) < 0)
  {
    fprintf(stderr, "CIL_Setup failed for MCBID\n");
    return(EXIT_FAILURE);
  }

  if ((Status = CIL_Setup(CIL_File, RCSID, &RCS)) < 0)
  {
    fprintf(stderr, "CIL_Setup failed for RCSID\n");
    return(EXIT_FAILURE);
  }

  fclose(CIL_File);

  if ((Status = CIL_Receive(&THIS, &SendData, &ReplyData, FALSE, WAIT)) < 0)
  {
    fprintf(stderr, "CIL_Receive failed\n");
  }
  else
  {
    if (Status == 0)
    {
      fprintf(stderr, "No data received\n");
    }
    else
    {
      fprintf(stdout, "->%s<-\n", SendData.TranData.Body.TextString);
      if ((Status = CIL_Send(&RCS, &SendData, &ReplyData, FALSE)) < 0)
      {
        fprintf(stderr, "CIL_Send failed\n");
      }
    }
  }

  return(EXIT_SUCCESS);
}
