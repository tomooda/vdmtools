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



#include "PP_uTAR_uPAT.h"

void init_PP_uTAR_uPAT_VDMLib() {
  VDMGetDefaultRecInfoMap().NewTag(TOKEN, 1);
  VDMGetDefaultRecInfoMap().SetSymTag(TOKEN, "token");
}
#ifdef DEF_PP_uTAR_uPAT_USERIMPL

#include "PP_uTAR_uPAT_userimpl.cc"

#endif


void init_PP_uTAR_uPAT() { init_PP_uTAR_uPAT_VDMLib(); }
#ifndef DEF_PP_uTAR_uPAT_List2SeparatorList

TYPE_PP_uTAR_uPAT_string vdm_PP_uTAR_uPAT_List2SeparatorList(const TYPE_PP_uTAR_uPAT_string &vdm_PP_uTAR_uPAT_separator, const type_cLL &vdm_PP_uTAR_uPAT_ss) {
  Sequence varRes_4;
  if (((Bool) (vdm_PP_uTAR_uPAT_ss == Sequence())).GetValue()) 
    varRes_4 = Sequence("");
  else {
    Sequence vdm_PP_uTAR_uPAT_head = (Sequence) vdm_PP_uTAR_uPAT_ss.Hd();
    Sequence vdm_PP_uTAR_uPAT_tail;
    if (((Bool) (vdm_PP_uTAR_uPAT_ss.Tl() == Sequence())).GetValue()) 
      vdm_PP_uTAR_uPAT_tail = Sequence("");
    else 
      vdm_PP_uTAR_uPAT_tail.ImpConc(vdm_PP_uTAR_uPAT_separator).ImpConc(vdm_PP_uTAR_uPAT_List2SeparatorList((Generic) vdm_PP_uTAR_uPAT_separator, (Generic) vdm_PP_uTAR_uPAT_ss.Tl()));
    varRes_4.ImpConc(vdm_PP_uTAR_uPAT_head).ImpConc(vdm_PP_uTAR_uPAT_tail);
  }
  return (Generic) varRes_4;
}
#endif

#ifndef DEF_PP_uTAR_uPAT_tar_uBindList

TYPE_PP_uTAR_uPAT_BindList vdm_PP_uTAR_uPAT_tar_uBindList(const type_cLL &vdm_PP_uTAR_uPAT_binds) { return (Generic) vdm_PP_uTAR_uPAT_binds; }
#endif

#ifndef DEF_PP_uTAR_uPAT_tar_uMatchVal

TYPE_PP_uTAR_uPAT_MatchVal vdm_PP_uTAR_uPAT_tar_uMatchVal(const TYPE_PP_uTAR_uEXPR_Expr &var_1_1, const TYPE_CI_ContextId &var_2_2) {
  Sequence vdm_PP_uTAR_uPAT_val;
  bool succ_3 = true;
  vdm_PP_uTAR_uPAT_val = var_1_1;
  if (succ_3) {}
  if (!succ_3) 
    RunTime("Pattern Match in Function Apply in function : tar_uMatchVal failed");
  Sequence varRes_4;
  Sequence var1_5;
  var1_5.ImpConc(Sequence("(")).ImpConc(vdm_PP_uTAR_uPAT_val);
  varRes_4.ImpConc(var1_5).ImpConc(Sequence(")"));
  return (Generic) varRes_4;
}
#endif

#ifndef DEF_PP_uTAR_uPAT_tar_uMultSetBind

TYPE_PP_uTAR_uPAT_MultSetBind vdm_PP_uTAR_uPAT_tar_uMultSetBind(const type_cLL &var_1_1, const TYPE_PP_uTAR_uEXPR_Expr &var_2_2, const TYPE_CI_ContextId &var_3_3) {
  Sequence vdm_PP_uTAR_uPAT_expr;
  Sequence vdm_PP_uTAR_uPAT_pats;
  bool succ_4 = true;
  vdm_PP_uTAR_uPAT_pats = var_1_1;
  vdm_PP_uTAR_uPAT_expr = var_2_2;
  if (succ_4) {}
  if (!succ_4) 
    RunTime("Pattern Match in Function Apply in function : tar_uMultSetBind failed");
  Sequence varRes_5;
  Sequence var1_6;
  var1_6.ImpConc(vdm_PP_uTAR_uPAT_List2SeparatorList((Generic) Sequence(","), (Generic) vdm_PP_uTAR_uPAT_pats)).ImpConc(Sequence(" in set "));
  varRes_5.ImpConc(var1_6).ImpConc(vdm_PP_uTAR_uPAT_expr);
  return (Generic) varRes_5;
}
#endif

#ifndef DEF_PP_uTAR_uPAT_tar_uMultTypeBind

TYPE_PP_uTAR_uPAT_MultTypeBind vdm_PP_uTAR_uPAT_tar_uMultTypeBind(const type_cLL &var_1_1, const TYPE_AS_Type &var_2_2, const TYPE_PP_uTAR_uTYPE_Type &var_3_3, const TYPE_CI_ContextId &var_4_4) {
  Sequence vdm_PP_uTAR_uPAT_pats;
  Sequence vdm_PP_uTAR_uPAT_tp;
  bool succ_5 = true;
  vdm_PP_uTAR_uPAT_pats = var_1_1;
  if (succ_5) {}
  vdm_PP_uTAR_uPAT_tp = var_3_3;
  if (succ_5) {}
  if (!succ_5) 
    RunTime("Pattern Match in Function Apply in function : tar_uMultTypeBind failed");
  Sequence varRes_6;
  Sequence var1_7;
  var1_7.ImpConc(vdm_PP_uTAR_uPAT_List2SeparatorList((Generic) Sequence(","), (Generic) vdm_PP_uTAR_uPAT_pats)).ImpConc(Sequence(" : "));
  varRes_6.ImpConc(var1_7).ImpConc(vdm_PP_uTAR_uPAT_tp);
  return (Generic) varRes_6;
}
#endif

#ifndef DEF_PP_uTAR_uPAT_tar_uPatternName

TYPE_PP_uTAR_uPAT_PatternName vdm_PP_uTAR_uPAT_tar_uPatternName(const Generic &var_1_1, const TYPE_CI_ContextId &var_2_2) {
  Generic vdm_PP_uTAR_uPAT_nm;
  bool succ_3 = true;
  vdm_PP_uTAR_uPAT_nm = var_1_1;
  if (succ_3) {}
  if (!succ_3) 
    RunTime("Pattern Match in Function Apply in function : tar_uPatternName failed");
  Generic varRes_4;
  if (((Bool) (vdm_PP_uTAR_uPAT_nm == Nil())).GetValue()) 
    varRes_4 = Sequence("-");
  else 
    varRes_4 = vdm_PP_uTAR_uPAT_nm;
  return (Generic) varRes_4;
}
#endif

#ifndef DEF_PP_uTAR_uPAT_tar_uRecordPattern

TYPE_PP_uTAR_uPAT_RecordPattern vdm_PP_uTAR_uPAT_tar_uRecordPattern(const TYPE_PP_uTAR_uEXPR_NameName &var_1_1, const type_cLL &var_2_2, const TYPE_CI_ContextId &var_3_3) {
  Sequence vdm_PP_uTAR_uPAT_flds;
  Sequence vdm_PP_uTAR_uPAT_nm;
  bool succ_4 = true;
  vdm_PP_uTAR_uPAT_nm = var_1_1;
  vdm_PP_uTAR_uPAT_flds = var_2_2;
  if (succ_4) {}
  if (!succ_4) 
    RunTime("Pattern Match in Function Apply in function : tar_uRecordPattern failed");
  Sequence varRes_5;
  Sequence var1_6;
  Sequence var1_7;
  Sequence var1_8;
  var1_8.ImpConc(Sequence("mk_")).ImpConc(vdm_PP_uTAR_uPAT_nm);
  var1_7.ImpConc(var1_8).ImpConc(Sequence("("));
  var1_6.ImpConc(var1_7).ImpConc(vdm_PP_uTAR_uPAT_List2SeparatorList((Generic) Sequence(","), (Generic) vdm_PP_uTAR_uPAT_flds));
  varRes_5.ImpConc(var1_6).ImpConc(Sequence(")"));
  return (Generic) varRes_5;
}
#endif

#ifndef DEF_PP_uTAR_uPAT_tar_uSeqConcPattern

TYPE_PP_uTAR_uPAT_SeqConcPattern vdm_PP_uTAR_uPAT_tar_uSeqConcPattern(const TYPE_PP_uTAR_uPAT_Pattern &var_1_1, const TYPE_PP_uTAR_uPAT_Pattern &var_2_2, const TYPE_CI_ContextId &var_3_3) {
  Sequence vdm_PP_uTAR_uPAT_lp;
  Sequence vdm_PP_uTAR_uPAT_rp;
  bool succ_4 = true;
  vdm_PP_uTAR_uPAT_lp = var_1_1;
  vdm_PP_uTAR_uPAT_rp = var_2_2;
  if (succ_4) {}
  if (!succ_4) 
    RunTime("Pattern Match in Function Apply in function : tar_uSeqConcPattern failed");
  Sequence varRes_5;
  Sequence var1_6;
  var1_6.ImpConc(vdm_PP_uTAR_uPAT_lp).ImpConc(Sequence(" union "));
  varRes_5.ImpConc(var1_6).ImpConc(vdm_PP_uTAR_uPAT_rp);
  return (Generic) varRes_5;
}
#endif

#ifndef DEF_PP_uTAR_uPAT_tar_uSeqEnumPattern

TYPE_PP_uTAR_uPAT_SeqEnumPattern vdm_PP_uTAR_uPAT_tar_uSeqEnumPattern(const type_cLL &vdm_PP_uTAR_uPAT_els, const TYPE_CI_ContextId &vdm_PP_uTAR_uPAT_cid) {
  Sequence varRes_4;
  Sequence var1_5;
  var1_5.ImpConc(Sequence("[")).ImpConc(vdm_PP_uTAR_uPAT_List2SeparatorList((Generic) Sequence(","), (Generic) vdm_PP_uTAR_uPAT_els));
  varRes_4.ImpConc(var1_5).ImpConc(Sequence("]"));
  return (Generic) varRes_4;
}
#endif

#ifndef DEF_PP_uTAR_uPAT_tar_uSetBind

TYPE_PP_uTAR_uPAT_SetBind vdm_PP_uTAR_uPAT_tar_uSetBind(const TYPE_PP_uTAR_uPAT_Pattern &var_1_1, const TYPE_PP_uTAR_uEXPR_Expr &var_2_2, const TYPE_CI_ContextId &var_3_3) {
  Sequence vdm_PP_uTAR_uPAT_expr;
  Sequence vdm_PP_uTAR_uPAT_pat;
  bool succ_4 = true;
  vdm_PP_uTAR_uPAT_pat = var_1_1;
  vdm_PP_uTAR_uPAT_expr = var_2_2;
  if (succ_4) {}
  if (!succ_4) 
    RunTime("Pattern Match in Function Apply in function : tar_uSetBind failed");
  Sequence varRes_5;
  Sequence var1_6;
  var1_6.ImpConc(vdm_PP_uTAR_uPAT_pat).ImpConc(Sequence(" in set "));
  varRes_5.ImpConc(var1_6).ImpConc(vdm_PP_uTAR_uPAT_expr);
  return (Generic) varRes_5;
}
#endif

#ifndef DEF_PP_uTAR_uPAT_tar_uSetEnumPattern

TYPE_PP_uTAR_uPAT_SetEnumPattern vdm_PP_uTAR_uPAT_tar_uSetEnumPattern(const type_cLL &vdm_PP_uTAR_uPAT_els, const TYPE_CI_ContextId &vdm_PP_uTAR_uPAT_cid) {
  Sequence varRes_4;
  Sequence var1_5;
  var1_5.ImpConc(Sequence("{")).ImpConc(vdm_PP_uTAR_uPAT_List2SeparatorList((Generic) Sequence(","), (Generic) vdm_PP_uTAR_uPAT_els));
  varRes_4.ImpConc(var1_5).ImpConc(Sequence("}"));
  return (Generic) varRes_4;
}
#endif

#ifndef DEF_PP_uTAR_uPAT_tar_uSetUnionPattern

TYPE_PP_uTAR_uPAT_SetUnionPattern vdm_PP_uTAR_uPAT_tar_uSetUnionPattern(const TYPE_PP_uTAR_uPAT_PATTERN &var_1_1, const TYPE_PP_uTAR_uPAT_Pattern &var_2_2, const TYPE_CI_ContextId &var_3_3) {
  Sequence vdm_PP_uTAR_uPAT_lp;
  Sequence vdm_PP_uTAR_uPAT_rp;
  bool succ_4 = true;
  vdm_PP_uTAR_uPAT_lp = var_1_1;
  vdm_PP_uTAR_uPAT_rp = var_2_2;
  if (succ_4) {}
  if (!succ_4) 
    RunTime("Pattern Match in Function Apply in function : tar_uSetUnionPattern failed");
  Sequence varRes_5;
  Sequence var1_6;
  var1_6.ImpConc(vdm_PP_uTAR_uPAT_lp).ImpConc(Sequence(" union "));
  varRes_5.ImpConc(var1_6).ImpConc(vdm_PP_uTAR_uPAT_rp);
  return (Generic) varRes_5;
}
#endif

#ifndef DEF_PP_uTAR_uPAT_tar_uTuplePattern

TYPE_PP_uTAR_uPAT_TuplePattern vdm_PP_uTAR_uPAT_tar_uTuplePattern(const type_cLL &var_1_1, const TYPE_CI_ContextId &var_2_2) {
  Sequence vdm_PP_uTAR_uPAT_flds;
  bool succ_3 = true;
  vdm_PP_uTAR_uPAT_flds = var_1_1;
  if (succ_3) {}
  if (!succ_3) 
    RunTime("Pattern Match in Function Apply in function : tar_uTuplePattern failed");
  Sequence varRes_4;
  Sequence var1_5;
  var1_5.ImpConc(Sequence("mk_(")).ImpConc(vdm_PP_uTAR_uPAT_List2SeparatorList((Generic) Sequence(","), (Generic) vdm_PP_uTAR_uPAT_flds));
  varRes_4.ImpConc(var1_5).ImpConc(Sequence(")"));
  return (Generic) varRes_4;
}
#endif

#ifndef DEF_PP_uTAR_uPAT_tar_uTypeBind

TYPE_PP_uTAR_uPAT_TypeBind vdm_PP_uTAR_uPAT_tar_uTypeBind(const TYPE_PP_uTAR_uPAT_Pattern &var_1_1, const TYPE_AS_Type &var_2_2, const TYPE_PP_uTAR_uTYPE_Type &var_3_3, const TYPE_CI_ContextId &var_4_4) {
  Sequence vdm_PP_uTAR_uPAT_pat;
  Sequence vdm_PP_uTAR_uPAT_type;
  bool succ_5 = true;
  vdm_PP_uTAR_uPAT_pat = var_1_1;
  if (succ_5) {}
  vdm_PP_uTAR_uPAT_type = var_3_3;
  if (succ_5) {}
  if (!succ_5) 
    RunTime("Pattern Match in Function Apply in function : tar_uTypeBind failed");
  Sequence varRes_6;
  Sequence var1_7;
  var1_7.ImpConc(vdm_PP_uTAR_uPAT_pat).ImpConc(Sequence(" : "));
  varRes_6.ImpConc(var1_7).ImpConc(vdm_PP_uTAR_uPAT_type);
  return (Generic) varRes_6;
}
#endif

