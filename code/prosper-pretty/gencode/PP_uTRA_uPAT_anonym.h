//
// THIS FILE IS AUTOMATICALLY GENERATED!!
//
// Generated at Mon 11-Oct-99 by the VDM-SLtoC++ Code Generator
// (v3.3 - Mon 22-Mar-99)
//
// Supported compilers:
// 	egcs version 1.1 on SunOS4, SunOS5, Linux, HP-UX10
// 	VC++ version 6.0 on Windows95, Windows NT
//

#ifndef _PP_uTRA_uPAT_anonym_h
#define _PP_uTRA_uPAT_anonym_h

#include "PP_uTRA_uPAT_userdef.h"
#include "metaiv.h"
class type_cL;
class type_FL;
class type_cLL;
#ifndef TAG_type_cL
#define TAG_type_cL (TAG_PP_uTRA_uPAT + 1)
#endif

#ifndef TAG_type_FL
#define TAG_type_FL (TAG_PP_uTRA_uPAT + 2)
#endif

#ifndef TAG_type_cLL
#define TAG_type_cLL (TAG_PP_uTRA_uPAT + 3)
#endif


#include "AS_anonym.h"
#include "CI_anonym.h"
#include "PP_uTAR_uDEF_anonym.h"
#include "PP_uTAR_uEXPR_anonym.h"
#include "PP_uTAR_uPAT_anonym.h"
#include "PP_uTAR_uTYPE_anonym.h"
#include "PP_uTRA_uEXPR_anonym.h"
#include "PP_uTRA_uTYPE_anonym.h"
#include "REP_anonym.h"
#ifndef DECL_type_cL
#define DECL_type_cL 1

class type_cL : public SEQ<Char> {
public:

  type_cL() : SEQ<Char>() {}

  type_cL(const SEQ<Char> &c) : SEQ<Char>(c) {}

  type_cL(const Generic &c) : SEQ<Char>(c) {}

  const char * GetTypeName() const { return "type_cL"; }
} ;
#endif

#ifndef DECL_type_FL
#define DECL_type_FL 1

class type_FL : public SEQ<Generic> {
public:

  type_FL() : SEQ<Generic>() {}

  type_FL(const SEQ<Generic> &c) : SEQ<Generic>(c) {}

  type_FL(const Generic &c) : SEQ<Generic>(c) {}

  const char * GetTypeName() const { return "type_FL"; }
} ;
#endif

#ifndef DECL_type_cLL
#define DECL_type_cLL 1

class type_cLL : public SEQ<type_cL> {
public:

  type_cLL() : SEQ<type_cL>() {}

  type_cLL(const SEQ<type_cL> &c) : SEQ<type_cL>(c) {}

  type_cLL(const Generic &c) : SEQ<type_cL>(c) {}

  const char * GetTypeName() const { return "type_cLL"; }
} ;
#endif


#endif

