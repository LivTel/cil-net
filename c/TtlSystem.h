/*
** File name : TtlSystem.h
**
** Purpose : TTL globals definitions file, all environments.
**
** Description :
** Contains general purpose definitions, macros and types for
** all TTL software. This file is platform independant but the
** user needs to define the appropriate macros for their
** environment if they are not already available.
**
** Authors :
**
** History :
** 07.05.99 First draft for QNX environment. PLW
*/

#ifndef TTLSYSTEM_H_DEFINED
#define TTLSYSTEM_H_DEFINED

typedef enum { FALSE = 0 , TRUE } Bool_t;

typedef enum {
  SYS_NOMINAL,
  SYS_WARNING,
  SYS_ERROR_NON_FATAL,
  SYS_ERROR_FATAL
} Status_t;

#define TTL_ASSERT(x) assert(x)

#define TTL_MALLOC(x) malloc(x)

#define TTL_FREE(x) free(x)

#ifdef TTL_DEBUG
  #define DEBUGCODE(Level, Statements) {if (Level >= TTL_DEBUG) { Statements }}
#else
  #define DEBUGCODE(Level, Statement)
#endif

#ifdef QNX

#ifdef __WATCOMC__

typedef signed char          Int8_t;
typedef unsigned char        Uint8_t;
typedef short int            Int16_t;
typedef unsigned short int   Uint16_t;
typedef int                  Int32_t;
typedef unsigned int         Uint32_t;

#endif /* __WATCOMC__ */

#endif /* QNX */

#ifdef VMS

/* TBD */

#endif /* VMS */

#ifdef LINUX

#ifdef __GCC__

typedef signed char          Int8_t;
typedef unsigned char        Uint8_t;
typedef short int            Int16_t;
typedef unsigned short int   Uint16_t;
typedef int                  Int32_t;
typedef unsigned int         Uint32_t;

#endif /* __GCC__ */

#endif /* LINUX */

#endif /* TTLSYSTEM_H_DEFINED */
