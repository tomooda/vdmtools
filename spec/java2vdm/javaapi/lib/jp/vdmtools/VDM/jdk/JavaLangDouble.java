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


public class JavaLangDouble extends JavaLangObject implements JavaLangComparable, JavaLangNumber  {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
    static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=POSITIVE_uINFINITY KEEP=NO
    public static Double POSITIVE_uINFINITY = UTIL.NumberToReal(Double.valueOf(0));
// ***** VDMTOOLS END Name=POSITIVE_uINFINITY

// ***** VDMTOOLS START Name=NEGATIVE_uINFINITY KEEP=NO
    public static Double NEGATIVE_uINFINITY = UTIL.NumberToReal(Double.valueOf(0));
// ***** VDMTOOLS END Name=NEGATIVE_uINFINITY

// ***** VDMTOOLS START Name=NaN KEEP=NO
    public static Double NaN = UTIL.NumberToReal(Double.valueOf(0));
// ***** VDMTOOLS END Name=NaN

// ***** VDMTOOLS START Name=MAX_uVALUE KEEP=NO
    public static Double MAX_uVALUE = UTIL.NumberToReal(Double.valueOf(Double.MAX_VALUE));
// ***** VDMTOOLS END Name=MAX_uVALUE

// ***** VDMTOOLS START Name=MIN_uVALUE KEEP=NO
    public static Double MIN_uVALUE = UTIL.NumberToReal(Double.valueOf(Double.MIN_VALUE));
// ***** VDMTOOLS END Name=MIN_uVALUE

// ***** VDMTOOLS START Name=TYPE KEEP=NO
    public static JavaLangClass TYPE = (JavaLangClass) new JavaLangClass(new String("double"), new quotes.CLASS(), Boolean.TRUE);
// ***** VDMTOOLS END Name=TYPE

    public Integer intValue() throws CGException {
        return null;
    }

    public Integer byteValue() throws CGException{
        return null;
    }

    public Integer longValue() throws CGException{
        return null;
    }

    public Double floatValue() throws CGException{
        return null;
    }

    public Integer shortValue() throws CGException{
        return null;
    }

    public Double doubleValue() throws CGException{
        return null;
    }

    public JavaLangDouble(final Double value_u_u) throws CGException {
   }

    public JavaLangDouble(final quotes.NIL var_1_1) throws CGException {
        isNil = Boolean.TRUE;
    }

    public JavaLangDouble(final JavaLangString s) throws CGException {
    }

    public Integer compareTo(final JavaLangObject o) throws CGException {
        return null;
    }

    public static JavaLangString vdm_toString(Double d)
    {
	return new JavaLangString(d.toString());
    }
}


