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


// ***** VDMTOOLS START Name=imports KEEP=YES

import jp.vdmtools.VDM.*;
import java.util.*;
import java.net.*;
// ***** VDMTOOLS END Name=imports



public class B9 implements EvaluatePP {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=sentinel KEEP=NO
  volatile Sentinel sentinel;
// ***** VDMTOOLS END Name=sentinel


// ***** VDMTOOLS START Name=B9Sentinel KEEP=NO
  class B9Sentinel extends Sentinel {

    public final int Run = 0;

    public final int nr_functions = 1;


    public B9Sentinel () throws CGException{}


    public B9Sentinel (EvaluatePP instance) throws CGException{
      init(nr_functions, instance);
    }

  }
// ***** VDMTOOLS END Name=B9Sentinel
;

// ***** VDMTOOLS START Name=evaluatePP KEEP=NO
  public Boolean evaluatePP (int fnr) throws CGException{
    return Boolean.TRUE;
  }
// ***** VDMTOOLS END Name=evaluatePP


// ***** VDMTOOLS START Name=setSentinel KEEP=NO
  public void setSentinel () {
    try{
      sentinel = new B9Sentinel(this);
    }
    catch (CGException e) {
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=setSentinel


// ***** VDMTOOLS START Name=B9 KEEP=NO
  public B9 () {
    try{
      setSentinel();
    }
    catch (Throwable e) {
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=B9


// ***** VDMTOOLS START Name=Run KEEP=YES
  public String Run () throws CGException{
    sentinel.entering(((B9Sentinel) sentinel).Run);
    try{
      InetAddress ia = InetAddress.getByName("localhost");
      return ia.toString();
    }
    catch (UnknownHostException e) {
      return e.toString();
    }
    finally {
      sentinel.leaving(((B9Sentinel) sentinel).Run);
    }
  }
// ***** VDMTOOLS END Name=Run

}
;
