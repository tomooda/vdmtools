//
// THIS FILE IS AUTOMATICALLY GENERATED!!
//
// Generated at Wed 03-Nov-99 by the VDM-SLtoC++ Code Generator
// (v3.3 - Mon 22-Mar-99)
//
// Supported compilers:
// 	egcs version 1.1 on SunOS4, SunOS5, Linux, HP-UX10
// 	VC++ version 6.0 on Windows95, Windows NT
//

#ifndef _FRESH_h
#define _FRESH_h

#include <math.h>
#include "metaiv.h"
#include "cg.h"
#include "cg_aux.h"
#include "AS.h"
#include "CI.h"
#include "REP.h"
#include "FRESH_anonym.h"
enum  {
  vdm_FRESH_FRESH = TAG_TYPE_FRESH_FRESH,
  length_FRESH_FRESH = 1,
  pos_FRESH_FRESH_next = 1
};

class TYPE_FRESH_FRESH : public Record {
public:

  TYPE_FRESH_FRESH() : Record(TAG_TYPE_FRESH_FRESH, 1) {}
  void Init(Int p2);

  TYPE_FRESH_FRESH(const Generic &c) : Record(c) {}

  const char * GetTypeName() const { return "TYPE_FRESH_FRESH"; }
  Int get_next() const;
  void set_next(const Int &p);
} ;
void init_FRESH();
TYPE_AS_Name vdm_FRESH_GetName(const type_cL &, const type_7AS_NameCS &);
Bool vdm_FRESH_post_GetName(const type_cL &, const type_7AS_NameCS &, const TYPE_AS_Name &);
type_7AS_NameCL vdm_FRESH_GetNameList(const type_cL &, const Int &, const type_7AS_NameCS &);
Bool vdm_FRESH_post_GetNameList(const type_cL &, const Int &, const type_7AS_NameCS &, const type_7AS_NameCL &);

#endif

