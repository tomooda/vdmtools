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

import java.util.Vector;

// ***** VDMTOOLS END Name=imports


public class VEnumeration extends JavaLangObject implements JavaUtilEnumeration {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
    static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=v KEEP=NO
    private JavaUtilVector v = null;
// ***** VDMTOOLS END Name=v

// ***** VDMTOOLS START Name=count KEEP=NO
    private Integer count = null;
// ***** VDMTOOLS END Name=count


// ***** VDMTOOLS START Name=VEnumeration KEEP=NO
    public VEnumeration() throws CGException {
    }
// ***** VDMTOOLS END Name=VEnumeration


// ***** VDMTOOLS START Name=VEnumeration KEEP=NO
    public VEnumeration(final JavaUtilVector v_1) throws CGException {
        this();
        {
            ((VEnumeration) this).v = (JavaUtilVector) UTIL.clone(v_1);
            count = UTIL.NumberToInt(UTIL.clone(Integer.valueOf(1)));
        }
    }
// ***** VDMTOOLS END Name=VEnumeration


// ***** VDMTOOLS START Name=hasMoreElements KEEP=NO
    public Boolean hasMoreElements() throws CGException {
        Boolean rexpr_1 = null;
        Integer var2_3 = null;
        var2_3 = v.size();
        rexpr_1 = Boolean.valueOf((count.intValue()) <= (var2_3.intValue()));
        return rexpr_1;
    }
// ***** VDMTOOLS END Name=hasMoreElements


// ***** VDMTOOLS START Name=nextElement KEEP=NO
    public JavaLangObject nextElement() throws CGException {
        JavaLangObject o = new JavaLangObject(new quotes.NIL());
        Boolean cond_2 = null;
        Integer var2_4 = null;
        var2_4 = v.size();
        cond_2 = Boolean.valueOf((count.intValue()) <= (var2_4.intValue()));
        if (cond_2.booleanValue()) {
            JavaLangObject rhs_6 = null;
            Vector tmp_l_7 = null;
            tmp_l_7 = v.getWrappedObject();
            if (1 <= ((Integer) count).intValue() && ((Integer) count).intValue() <= tmp_l_7.size())
                rhs_6 = (JavaLangObject) tmp_l_7.get(((Integer) count).intValue() - 1);
            else
                UTIL.RunTime("Run-Time Error:Illegal index");
            o = (JavaLangObject) UTIL.clone(rhs_6);
            count = UTIL.NumberToInt(UTIL.clone(Integer.valueOf(count.intValue() + Integer.valueOf(1).intValue())));
        }
        return (JavaLangObject) o;
    }
// ***** VDMTOOLS END Name=nextElement

}

;
