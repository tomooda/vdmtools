//
// THIS FILE IS AUTOMATICALLY GENERATED!!
//
// Generated at Wed 05-Nov-97 by the VDM++toC++ Code Generator
// (v6.0e - Tue 04-Nov-97)
//
// Supported compilers:
// 	g++ version 2.7.2 on SunOS4, SunOS5, Linux, HP-UX10
// 	Dec cxx version 5.5 on Alpha OSF1
// 	VC++ version 5.0 on Windows95, Windows NT
//

#ifndef _Clock_h
#define _Clock_h

#include <math.h>
#include "metaiv.h"
#include "cg.h"
#include "cg_aux.h"
#include "CGBase.h"
#include "MSAWTypes.h"



class vdm_Clock : public virtual vdm_MSAWTypes {
protected:
  Int vdm_now;
public:

  virtual vdm_Clock * Get_vdm_Clock() { return this; }

  ObjectRef Self() { return ObjectRef(Get_vdm_Clock()); }

  int vdm_GetId() { return VDM_Clock; }
  virtual Int vdm_Now();
  virtual void vdm_Tick();
   vdm_Clock();

  virtual ~vdm_Clock() {}
};

#endif

