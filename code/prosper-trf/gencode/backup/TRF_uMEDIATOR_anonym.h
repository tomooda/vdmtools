//
// THIS FILE IS AUTOMATICALLY GENERATED!!
//
// Generated at Tue 19-Oct-99 by the VDM-SLtoC++ Code Generator
// (v3.3 - Mon 22-Mar-99)
//
// Supported compilers:
// 	egcs version 1.1 on SunOS4, SunOS5, Linux, HP-UX10
// 	VC++ version 6.0 on Windows95, Windows NT
//

#ifndef _TRF_uMEDIATOR_anonym_h
#define _TRF_uMEDIATOR_anonym_h

#include "TRF_uMEDIATOR_userdef.h"
#include "metaiv.h"
class type_cL;
#ifndef TAG_type_cL
#define TAG_type_cL (TAG_TRF_uMEDIATOR + 1)
#endif


#include "AS_anonym.h"
#include "CI_anonym.h"
#include "PP_uMEDIATOR_anonym.h"
#include "REP_anonym.h"
#include "SPEC_uAST_anonym.h"
#include "TRF_uTAR_uDEF_anonym.h"
#include "TRF_uTAR_uEXPR_anonym.h"
#include "TRF_uTAR_uPAT_anonym.h"
#include "TRF_uTAR_uTYPE_anonym.h"
#include "TRF_uTRA_uDEF_anonym.h"
#include "TRF_uTRA_uEXPR_anonym.h"
#include "TRF_uTRA_uPAT_anonym.h"
#include "TRF_uTRA_uTYPE_anonym.h"
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


#endif

