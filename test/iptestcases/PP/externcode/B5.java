//
// THIS FILE IS AUTOMATICALLY GENERATED!!
//
// Generated at Thu 12-Oct-2000 by the VDM++ JAVA Code Generator
//
// Supported compilers:
// jdk1.2
//

// ***** VDMTOOLS START Name=HeaderComment KEEP=NO

// ***** VDMTOOLS END Name=HeaderComment

// ***** VDMTOOLS START Name=package KEEP=NO
// ***** VDMTOOLS END Name=package


// ***** VDMTOOLS START Name=imports KEEP=NO

import jp.vdmtools.VDM.*;
import java.util.*;
// ***** VDMTOOLS END Name=imports



public class B5 implements EvaluatePP {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=i KEEP=NO
  private volatile Integer i = null;
// ***** VDMTOOLS END Name=i

// ***** VDMTOOLS START Name=j KEEP=NO
  private volatile String j = null;
// ***** VDMTOOLS END Name=j

// ***** VDMTOOLS START Name=sentinel KEEP=NO
  volatile Sentinel sentinel;
// ***** VDMTOOLS END Name=sentinel


// ***** VDMTOOLS START Name=B5Sentinel KEEP=NO
  class B5Sentinel extends Sentinel {

    public final int GetI = 0;

    public final int GetJ = 1;

    public final int nr_functions = 2;


    public B5Sentinel () throws CGException{}


    public B5Sentinel (EvaluatePP instance) throws CGException{
      init(nr_functions, instance);
    }

  }
// ***** VDMTOOLS END Name=B5Sentinel
;

// ***** VDMTOOLS START Name=evaluatePP KEEP=NO
  public Boolean evaluatePP (int fnr) throws CGException{
    return Boolean.TRUE;
  }
// ***** VDMTOOLS END Name=evaluatePP


// ***** VDMTOOLS START Name=setSentinel KEEP=NO
  public void setSentinel () {
    try{
      sentinel = new B5Sentinel(this);
    }
    catch (CGException e) {
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=setSentinel


// ***** VDMTOOLS START Name=B5 KEEP=YES
  public B5 () {
    try{
      setSentinel();
      System.out.println("B5 constructor");
      i = Integer.valueOf(0);
      j = UTIL.ConvertToString(new String());
    }
    catch (Throwable e) {
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=B5


// ***** VDMTOOLS START Name=GetI KEEP=NO
  public Integer GetI () throws CGException{
    sentinel.entering(((B5Sentinel) sentinel).GetI);
    try{
      return i;
    }
    finally {
      sentinel.leaving(((B5Sentinel) sentinel).GetI);
    }
  }
// ***** VDMTOOLS END Name=GetI


// ***** VDMTOOLS START Name=GetJ KEEP=NO
  public String GetJ () throws CGException{
    sentinel.entering(((B5Sentinel) sentinel).GetJ);
    try{
      return j;
    }
    finally {
      sentinel.leaving(((B5Sentinel) sentinel).GetJ);
    }
  }
// ***** VDMTOOLS END Name=GetJ

}
;
