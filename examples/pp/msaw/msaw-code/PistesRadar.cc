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



#include "PistesRadar.h"
#include "ObstacleArtificiel.h"
#include "ReliefParticulier.h"
#include "Terrain.h"
#include "ZoneAeroport.h"
#include "ZoneMilitaire.h"

vdm_PistesRadar::vdm_PistesRadar() {
  RegisterAsDerived(vdm_GetId());
  vdm_pistes = Map();
}

Generic vdm_PistesRadar::vdm_TypedAlarm(const ObjectRef &vdm_obstacle) {
  Generic varRes_3;
  bool succ_4 = true;
  {
    succ_4 = true;
    if ((Bool) true != vdm_obstacle.IsOfClass(VDM_Terrain)) 
      succ_4 = false;
    if (succ_4) 
      varRes_3 = (Quote) "terrain";
  }
  if (!succ_4) {
    succ_4 = true;
    if ((Bool) true != vdm_obstacle.IsOfClass(VDM_ObstacleArtificiel)) 
      succ_4 = false;
    if (succ_4) 
      varRes_3 = (Quote) "obstacle_artificiel";
  }
  if (!succ_4) {
    succ_4 = true;
    if ((Bool) true != vdm_obstacle.IsOfClass(VDM_ReliefParticulier)) 
      succ_4 = false;
    if (succ_4) 
      varRes_3 = (Quote) "relief_particulier";
  }
  if (!succ_4) {
    succ_4 = true;
    if ((Bool) true != vdm_obstacle.IsOfClass(VDM_ZoneMilitaire)) 
      succ_4 = false;
    if (succ_4) 
      varRes_3 = (Quote) "zone_militair";
  }
  if (!succ_4) {
    succ_4 = true;
    if ((Bool) true != vdm_obstacle.IsOfClass(VDM_ZoneAeroport)) 
      succ_4 = false;
    if (succ_4) 
      varRes_3 = (Quote) "zone_aeroport";
  }
  if (!succ_4) 
    varRes_3 = Nil();
  return varRes_3;
}

void vdm_PistesRadar::vdm_Init(const ObjectRef &vdm_view) { ; }

void vdm_PistesRadar::vdm_SetPosition(const Record &vdm_modeA, const Int &vdm_temps, const Tuple &vdm_position, const Int &vdm_modeC) {
  Map tmpVal_2;
  Record tmpVar2_4(vdm_PisteInfo, length_PisteInfo);  tmpVar2_4 = Record(vdm_PisteInfo, length_PisteInfo);  tmpVar2_4.SetField(1, vdm_position);  tmpVar2_4.SetField(2, vdm_modeC);  tmpVar2_4.SetField(3, Nil());  tmpVar2_4.SetField(4, Set());  tmpVal_2 = Map().Insert(vdm_temps, tmpVar2_4);
  Map vdm_piste;
  vdm_piste = tmpVal_2;
  Bool cond_9;
  cond_9 = (Bool) vdm_pistes.Dom().InSet(vdm_modeA);
  if (cond_9.GetValue()) {
    Map tmpVal_25;
    tmpVal_25 = (Map) vdm_pistes[vdm_modeA];
    Map vdm_piste_q;
    vdm_piste_q = tmpVal_25;
    {
      Int tmpVal_29;
      tmpVal_29 = vdm_LaPlusRecente(vdm_piste_q.Dom());
      Int vdm_t;
      vdm_t = tmpVal_29;
      Map rhs_32;
      Map modmap_33;
      modmap_33 = vdm_piste;
      rhs_32 = Map().Insert(vdm_t, (Record) vdm_piste_q[vdm_t]);      rhs_32.ImpOverride(modmap_33);
      vdm_pistes.ImpModify(vdm_modeA, rhs_32);
    }
  }
  else {
    Map rhs_13;
    {
      Map m1_22 = vdm_pistes;
      Map m2_23 = Map().Insert(vdm_modeA, vdm_piste);
      Set com_18 = m1_22.Dom();
      com_18.ImpIntersect(m2_23.Dom());
      int all_applies_19 = 1;
      Generic d_20;
      for (int bb_21 = com_18.First(d_20); bb_21 && all_applies_19; bb_21 = com_18.Next(d_20)) 
        all_applies_19 *= m1_22[d_20] == m2_23[d_20];
      if (!all_applies_19) 
        RunTime("EvalMapMerge Duplicates not equal");
      m1_22.ImpOverride(m2_23);
      rhs_13 = m1_22;
    }
    vdm_pistes = rhs_13;
  }
}

void vdm_PistesRadar::vdm_SetVitesse(const Record &vdm_modeA, const Int &vdm_temps, const Tuple &vdm_vitesse) {
  Map level_3 = vdm_pistes.DomExists(vdm_modeA) ? (Map) vdm_pistes[vdm_modeA] : Map();
  Record level_2 = level_3.DomExists(vdm_temps) ? (Record) level_3[vdm_temps] : Record();
  if (level_2.Is(vdm_PisteInfo)) 
    level_2.SetField(pos_PisteInfo_vitesse, vdm_vitesse);
  else {
    RunTime("Unknown record field selector");
    return ;
  }
  level_3.ImpModify(vdm_temps, level_2);
  vdm_pistes.ImpModify(vdm_modeA, level_3);
}

void vdm_PistesRadar::vdm_SetAlarm(const Record &vdm_modeA, const ObjectRef &vdm_obstacle) {
  Int tmpVal_2;
  tmpVal_2 = vdm_LaPlusRecente(((Map) vdm_pistes[vdm_modeA]).Dom());
  Int vdm_t;
  vdm_t = tmpVal_2;
  Generic tmpVal_7;
  tmpVal_7 = vdm_TypedAlarm(vdm_obstacle);
  Generic vdm_alarme;
  vdm_alarme = tmpVal_7;
  Set rhs_9;
  Set var1_10;
  if (((Record) ((Map) vdm_pistes[vdm_modeA])[vdm_t]).Is(vdm_PisteInfo)) 
    var1_10 = ((Record) ((Map) vdm_pistes[vdm_modeA])[vdm_t]).GetField(pos_PisteInfo_alarmes);
  else 
    RunTime("Unknown record field selector");
  Set var2_16;
  var2_16 = Set().Insert(vdm_alarme);
  rhs_9 = var1_10;
  rhs_9.ImpUnion(var2_16);
  Map level_19 = vdm_pistes.DomExists(vdm_modeA) ? (Map) vdm_pistes[vdm_modeA] : Map();
  Record level_18 = level_19.DomExists(vdm_t) ? (Record) level_19[vdm_t] : Record();
  if (level_18.Is(vdm_PisteInfo)) 
    level_18.SetField(pos_PisteInfo_alarmes, rhs_9);
  else {
    RunTime("Unknown record field selector");
    return ;
  }
  level_19.ImpModify(vdm_t, level_18);
  vdm_pistes.ImpModify(vdm_modeA, level_19);
}

Set vdm_PistesRadar::vdm_GetModeAs() { return vdm_pistes.Dom(); }

Map vdm_PistesRadar::vdm_GetPositions(const Record &vdm_modeA) {
  Map tmpVal_2;
  tmpVal_2 = (Map) vdm_pistes[vdm_modeA];
  Map vdm_piste;
  vdm_piste = tmpVal_2;
  Map rexpr_5;
  Map res_m_6;
  {
    bool succ_17 = true;
    Set e1_set_20 = vdm_piste.Dom();
    Int vdm_t;
    {
      Generic tmpe_23;
      for (int bb_22 = e1_set_20.First(tmpe_23); bb_22; bb_22 = e1_set_20.Next(tmpe_23)) {
        Int elem_21 = tmpe_23;
        succ_17 = true;        vdm_t = elem_21;        if (succ_17) {
          Tuple mr_8(2);
          mr_8 = Tuple(2);
          Tuple tmpVar_9(2);
          if (((Record) vdm_piste[vdm_t]).Is(vdm_PisteInfo)) 
            tmpVar_9 = ((Record) vdm_piste[vdm_t]).GetField(pos_PisteInfo_position);
          else 
            RunTime("Unknown record field selector");
          mr_8.SetField(1, tmpVar_9);
          Int tmpVar_13;
          if (((Record) vdm_piste[vdm_t]).Is(vdm_PisteInfo)) 
            tmpVar_13 = ((Record) vdm_piste[vdm_t]).GetField(pos_PisteInfo_modeC);
          else 
            RunTime("Unknown record field selector");
          mr_8.SetField(2, tmpVar_13);
          res_m_6.Insert(vdm_t, mr_8);
        }
      }
    }
  }
  rexpr_5 = res_m_6;
  return rexpr_5;
}

Tuple vdm_PistesRadar::vdm_GetVitesse(const Record &vdm_modeA) {
  Map tmpVal_2;
  tmpVal_2 = (Map) vdm_pistes[vdm_modeA];
  Map vdm_piste;
  vdm_piste = tmpVal_2;
  Int tmpVal_5;
  tmpVal_5 = vdm_LaPlusRecente(vdm_piste.Dom());
  Int vdm_t;
  vdm_t = tmpVal_5;
  Generic rexpr_8;
  if (((Record) vdm_piste[vdm_t]).Is(vdm_PisteInfo)) 
    rexpr_8 = ((Record) vdm_piste[vdm_t]).GetField(pos_PisteInfo_vitesse);
  else 
    RunTime("Unknown record field selector");
  return rexpr_8;
}

void vdm_PistesRadar::vdm_DelPiste(const Record &vdm_modeA) {
  Map rhs_1;
  Set var1_2;
  var1_2 = Set().Insert(vdm_modeA);
  rhs_1 = vdm_pistes;
  {
    Map tmpMap_5;
    Set domM_6 = rhs_1.Dom();
    Generic elm_7;
    for (int bb_8 = domM_6.First(elm_7); bb_8; bb_8 = domM_6.Next(elm_7)) 
      if (!var1_2.InSet(elm_7)) 
        tmpMap_5.Insert(elm_7, rhs_1[elm_7]);
    rhs_1 = tmpMap_5;
  }
  vdm_pistes = rhs_1;
}
