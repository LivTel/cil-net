#include <stdio.h>
#include <stdlib.h>
#include <mqueue.h>

#include "Cil.h"
#include "TtlSystem.h"

/* Misc Globals required for CIL */

struct TASKDATA THIS;
char MapFileName[] = "Cil.map";
int THISID = RCSID;
struct TASKDATA THIS, SAM, MCB;
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
    fprintf(stderr, "CIL_Setup failed for RCSID\n");
    return(EXIT_FAILURE);
  }

  if ((Status = CIL_Setup(CIL_File, MCBID, &MCB)) < 0)
  {
    fprintf(stderr, "CIL_Setup failed for MCBID\n");
    return(EXIT_FAILURE);
  }

  strcpy(SendData.TranData.Body.TextString, "This is a test");

  if ((Status = CIL_Send(&MCB, &SendData, &ReplyData, FORWARD)) < 0)
  {
    fprintf(stderr, "CIL_Send failed\n");
  }
  else
  {
    if ((Status = CIL_Receive(&THIS, &ReplyData, &SendData, FALSE, WAIT)) < 0)
    {
      fprintf(stderr, "CIL_Receive failed\n");
    }
    if (Status == 0)
    {
      fprintf(stderr, "No data received\n");
    }
    else
    {
      fprintf(stdout, "->%s<-\n", ReplyData.TranData.Body.TextString);
    }
  }

  fclose(CIL_File);  
  return(EXIT_SUCCESS);
}
