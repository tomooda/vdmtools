//
// THIS FILE IS AUTOMATICALLY GENERATED!!
//
// Generated at Thu 21-Oct-99 by the VDM-SLtoC++ Code Generator
// (v3.3 - Mon 22-Mar-99)
//
// Supported compilers:
// 	egcs version 1.1 on SunOS4, SunOS5, Linux, HP-UX10
// 	VC++ version 6.0 on Windows95, Windows NT
//

#ifndef _PURE_uPAT2_anonym_h
#define _PURE_uPAT2_anonym_h

#include "PURE_uPAT2_userdef.h"
#include "metaiv.h"
class type_cL;
class type_cLL;
class type_cLLS;
class type_FcLLS2P;
class type_FL;
class type_FLcLLS2P;
class type_14AS_MultSetBindCcLLS2P;
class type_15AS_MultTypeBindCcLLS2P;
class type_10AS_SetBindCcLLS2P;
class type_11AS_TypeBindCcLLS2P;
#ifndef TAG_type_cL
#define TAG_type_cL (TAG_PURE_uPAT2 + 1)
#endif

#ifndef TAG_type_cLL
#define TAG_type_cLL (TAG_PURE_uPAT2 + 2)
#endif

#ifndef TAG_type_cLLS
#define TAG_type_cLLS (TAG_PURE_uPAT2 + 3)
#endif

#ifndef TAG_type_FcLLS2P
#define TAG_type_FcLLS2P (TAG_PURE_uPAT2 + 4)
#endif

#ifndef TAG_type_FL
#define TAG_type_FL (TAG_PURE_uPAT2 + 5)
#endif

#ifndef TAG_type_FLcLLS2P
#define TAG_type_FLcLLS2P (TAG_PURE_uPAT2 + 6)
#endif

#ifndef TAG_type_14AS_MultSetBindCcLLS2P
#define TAG_type_14AS_MultSetBindCcLLS2P (TAG_PURE_uPAT2 + 7)
#endif

#ifndef TAG_type_15AS_MultTypeBindCcLLS2P
#define TAG_type_15AS_MultTypeBindCcLLS2P (TAG_PURE_uPAT2 + 8)
#endif

#ifndef TAG_type_10AS_SetBindCcLLS2P
#define TAG_type_10AS_SetBindCcLLS2P (TAG_PURE_uPAT2 + 9)
#endif

#ifndef TAG_type_11AS_TypeBindCcLLS2P
#define TAG_type_11AS_TypeBindCcLLS2P (TAG_PURE_uPAT2 + 10)
#endif


#include "AS_anonym.h"
#include "CI_anonym.h"
#include "REP_anonym.h"
#include "TRF_uTAR_uEXPR_anonym.h"
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

#ifndef DECL_type_cLLS
#define DECL_type_cLLS 1

class type_cLLS : public SET<type_cLL> {
public:

  type_cLLS() : SET<type_cLL>() {}

  type_cLLS(const SET<type_cLL> &c) : SET<type_cLL>(c) {}

  type_cLLS(const Generic &c) : SET<type_cLL>(c) {}

  const char * GetTypeName() const { return "type_cLLS"; }
} ;
#endif

#ifndef DECL_type_FcLLS2P
#define DECL_type_FcLLS2P 1

class type_FcLLS2P : public Tuple {
public:

  type_FcLLS2P() : Tuple(2) {}
  void Init(TYPE_AS_Bind p2, TYPE_TRF_uTAR_uEXPR_Identifiers p3);

  type_FcLLS2P(const Generic &c) : Tuple(c) {}

  const char * GetTypeName() const { return "type_FcLLS2P"; }
  TYPE_AS_Bind get_1() const;
  void set_1(const TYPE_AS_Bind &p);
  TYPE_TRF_uTAR_uEXPR_Identifiers get_2() const;
  void set_2(const TYPE_TRF_uTAR_uEXPR_Identifiers &p);
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

#ifndef DECL_type_FLcLLS2P
#define DECL_type_FLcLLS2P 1

class type_FLcLLS2P : public Tuple {
public:

  type_FLcLLS2P() : Tuple(2) {}
  void Init(TYPE_AS_BindList p2, TYPE_TRF_uTAR_uEXPR_Identifiers p3);

  type_FLcLLS2P(const Generic &c) : Tuple(c) {}

  const char * GetTypeName() const { return "type_FLcLLS2P"; }
  TYPE_AS_BindList get_1() const;
  void set_1(const TYPE_AS_BindList &p);
  TYPE_TRF_uTAR_uEXPR_Identifiers get_2() const;
  void set_2(const TYPE_TRF_uTAR_uEXPR_Identifiers &p);
} ;
#endif

#ifndef DECL_type_14AS_MultSetBindCcLLS2P
#define DECL_type_14AS_MultSetBindCcLLS2P 1

class type_14AS_MultSetBindCcLLS2P : public Tuple {
public:

  type_14AS_MultSetBindCcLLS2P() : Tuple(2) {}
  void Init(TYPE_AS_MultSetBind p2, TYPE_TRF_uTAR_uEXPR_Identifiers p3);

  type_14AS_MultSetBindCcLLS2P(const Generic &c) : Tuple(c) {}

  const char * GetTypeName() const { return "type_14AS_MultSetBindCcLLS2P"; }
  TYPE_AS_MultSetBind get_1() const;
  void set_1(const TYPE_AS_MultSetBind &p);
  TYPE_TRF_uTAR_uEXPR_Identifiers get_2() const;
  void set_2(const TYPE_TRF_uTAR_uEXPR_Identifiers &p);
} ;
#endif

#ifndef DECL_type_15AS_MultTypeBindCcLLS2P
#define DECL_type_15AS_MultTypeBindCcLLS2P 1

class type_15AS_MultTypeBindCcLLS2P : public Tuple {
public:

  type_15AS_MultTypeBindCcLLS2P() : Tuple(2) {}
  void Init(TYPE_AS_MultTypeBind p2, TYPE_TRF_uTAR_uEXPR_Identifiers p3);

  type_15AS_MultTypeBindCcLLS2P(const Generic &c) : Tuple(c) {}

  const char * GetTypeName() const { return "type_15AS_MultTypeBindCcLLS2P"; }
  TYPE_AS_MultTypeBind get_1() const;
  void set_1(const TYPE_AS_MultTypeBind &p);
  TYPE_TRF_uTAR_uEXPR_Identifiers get_2() const;
  void set_2(const TYPE_TRF_uTAR_uEXPR_Identifiers &p);
} ;
#endif

#ifndef DECL_type_10AS_SetBindCcLLS2P
#define DECL_type_10AS_SetBindCcLLS2P 1

class type_10AS_SetBindCcLLS2P : public Tuple {
public:

  type_10AS_SetBindCcLLS2P() : Tuple(2) {}
  void Init(TYPE_AS_SetBind p2, TYPE_TRF_uTAR_uEXPR_Identifiers p3);

  type_10AS_SetBindCcLLS2P(const Generic &c) : Tuple(c) {}

  const char * GetTypeName() const { return "type_10AS_SetBindCcLLS2P"; }
  TYPE_AS_SetBind get_1() const;
  void set_1(const TYPE_AS_SetBind &p);
  TYPE_TRF_uTAR_uEXPR_Identifiers get_2() const;
  void set_2(const TYPE_TRF_uTAR_uEXPR_Identifiers &p);
} ;
#endif

#ifndef DECL_type_11AS_TypeBindCcLLS2P
#define DECL_type_11AS_TypeBindCcLLS2P 1

class type_11AS_TypeBindCcLLS2P : public Tuple {
public:

  type_11AS_TypeBindCcLLS2P() : Tuple(2) {}
  void Init(TYPE_AS_TypeBind p2, TYPE_TRF_uTAR_uEXPR_Identifiers p3);

  type_11AS_TypeBindCcLLS2P(const Generic &c) : Tuple(c) {}

  const char * GetTypeName() const { return "type_11AS_TypeBindCcLLS2P"; }
  TYPE_AS_TypeBind get_1() const;
  void set_1(const TYPE_AS_TypeBind &p);
  TYPE_TRF_uTAR_uEXPR_Identifiers get_2() const;
  void set_2(const TYPE_TRF_uTAR_uEXPR_Identifiers &p);
} ;
#endif


#endif

