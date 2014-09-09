MYCFLAGS= -lsocket -lunix -l/usr/lib/mqueue3r
CILPATH= ./
INCPATH= ./

top: server client

.c.o:
		$(CC) $(CFLAGS) $(MYCFLAGS) -c $<

Cil.o:		$(INCPATH)TtlSystem.h $(INCPATH)Cil.h $(INCPATH)CilPrivate.h

testserv.o:	$(INCPATH)TtlSystem.h $(INCPATH)Cil.h
testclient.o:	$(INCPATH)TtlSystem.h $(INCPATH)Cil.h

SERVEROBJS 	= $(CILPATH)Cil.o testserv.o
CLIENTOBJS 	= $(CILPATH)Cil.o testclient.o

server:		$(SERVEROBJS)
			$(CC) $(CFLAGS) $(MYCFLAGS) $(LDFLAGS) -o $@ $(SERVEROBJS)

client:		$(CLIENTOBJS)
			$(CC) $(CFLAGS) $(MYCFLAGS) $(LDFLAGS) -o $@ $(CLIENTOBJS)
