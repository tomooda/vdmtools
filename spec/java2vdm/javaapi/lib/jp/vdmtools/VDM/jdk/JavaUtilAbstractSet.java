//
// THIS FILE IS AUTOMATICALLY GENERATED!!
//
// Generated at Tue 30-Oct-2001 by the VDM++ JAVA Code Generator
// (v6.7.19 - Mon 29-Oct-2001)
//
// Supported compilers:
// jdk1.3
//

// ***** VDMTOOLS START Name=HeaderComment KEEP=NO

// ***** VDMTOOLS END Name=HeaderComment

// ***** VDMTOOLS START Name=package KEEP=NO
package jp.vdmtools.VDM.jdk;

// ***** VDMTOOLS END Name=package


// ***** VDMTOOLS START Name=imports KEEP=NO

import jp.vdmtools.VDM.CGException;
import jp.vdmtools.VDM.UTIL;

// ***** VDMTOOLS END Name=imports


public abstract class JavaUtilAbstractSet extends JavaUtilAbstractCollection implements JavaUtilSet {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
    static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp


// ***** VDMTOOLS START Name=JavaUtilAbstractSet KEEP=NO
    public JavaUtilAbstractSet() throws CGException {
        ;
    }
// ***** VDMTOOLS END Name=JavaUtilAbstractSet


// ***** VDMTOOLS START Name=equals KEEP=NO
    public Boolean equals(final JavaLangObject o) throws CGException {
        if (Boolean.valueOf(UTIL.equals(o, this)).booleanValue())
            return Boolean.TRUE;
        if (Boolean.valueOf(!Boolean.valueOf(o instanceof JavaUtilAbstractSet).booleanValue()).booleanValue())
            return Boolean.FALSE;
        {
            JavaUtilAbstractSet c = (JavaUtilAbstractSet) o;
            Boolean cond_10 = null;
            Integer var1_11 = null;
            var1_11 = c.size();
            cond_10 = Boolean.valueOf(!(var1_11.intValue() == size().intValue()));
            if (cond_10.booleanValue())
                return Boolean.FALSE;
            return containsAll((JavaUtilCollection) c);
        }
    }
// ***** VDMTOOLS END Name=equals


// ***** VDMTOOLS START Name=JavaUtilAbstractSet KEEP=NO
    public JavaUtilAbstractSet(final quotes.NIL var_1_1) throws CGException {
        this();
        isNil = Boolean.TRUE;
    }
// ***** VDMTOOLS END Name=JavaUtilAbstractSet



}
