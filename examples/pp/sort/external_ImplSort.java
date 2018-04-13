//
// THIS FILE IS AUTOMATICALLY GENERATED!!
//
// Generated at 2011-07-05 by the VDM++ to JAVA Code Generator
// (v9.0.2b - Tue 05-Jul-2011 09:10:42)
//
// Supported compilers: jdk 1.4/1.5/1.6
//

// ***** VDMTOOLS START Name=HeaderComment KEEP=NO
// ***** VDMTOOLS END Name=HeaderComment

// ***** VDMTOOLS START Name=package KEEP=NO
// ***** VDMTOOLS END Name=package

// ***** VDMTOOLS START Name=imports KEEP=NO

import jp.vdmtools.VDM.*;
import java.util.List;
import java.util.ArrayList;
// ***** VDMTOOLS END Name=imports



public class external_ImplSort {
// ***** VDMTOOLS START Name=Merge#2|List|List KEEP=YES
  public List Merge (final List _l1, final List _l2) throws CGException {
    List l1 = (List)UTIL.clone(_l1);
    List l2 = (List)UTIL.clone(_l2);
    if (l1.size() == 0) {
      return l2;
    }
    else if (l2.size() == 0) {
      return l1;
    }
    else {
      List res = new ArrayList();
      Number e1 = (Number)l1.get(0);
      Number e2 = (Number)l2.get(0);
      if (e1.intValue() <= e2.intValue()) {
        res.add(e1);
        l1.remove(0);
        res.addAll(Merge(l1, l2));
        return res;
      }
      else {
        res.add(e2);
        l2.remove(0);
        res.addAll(Merge(l1, l2));
        return res;
      }
    }
  }
// ***** VDMTOOLS END Name=Merge#2|List|List


// ***** VDMTOOLS START Name=parent KEEP=NO
  ImplSort parent = null;
// ***** VDMTOOLS END Name=parent


// ***** VDMTOOLS START Name=external_ImplSort#1|ImplSort KEEP=NO
  public external_ImplSort (ImplSort parentImplSort) {
    parent = parentImplSort;
  }
// ***** VDMTOOLS END Name=external_ImplSort#1|ImplSort


// ***** VDMTOOLS START Name=external_ImplSort KEEP=NO
  public external_ImplSort () {}
// ***** VDMTOOLS END Name=external_ImplSort


// ***** VDMTOOLS START Name=impl_ImplSorter#1|List KEEP=YES
  public List impl_ImplSorter (final List l) throws CGException {
    if (l.size() <= 1) {
      return l;
    }
    else {
      int len = l.size();
      int l2 = len/2;
      List l_l = new ArrayList(l.subList(0, l2));
      List l_r = new ArrayList(l.subList(l2, len));
      return Merge(parent.ImplSorter(l_l), parent.ImplSorter(l_r));
    }
  }
// ***** VDMTOOLS END Name=impl_ImplSorter#1|List

}
;
