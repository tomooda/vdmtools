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
import jp.vdmtools.VDM.Tuple;
import jp.vdmtools.VDM.UTIL;
import jp.vdmtools.VDM.VDMSpecException;

import java.util.HashMap;
import java.util.HashSet;

// ***** VDMTOOLS END Name=imports


public class JavaIoCharArrayReader extends JavaIoReader {

    public java.io.Reader getWrappedObject(){
        return null;
    }

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
    static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=buf KEEP=NO
    protected HashMap buf = new HashMap();
// ***** VDMTOOLS END Name=buf

// ***** VDMTOOLS START Name=pos KEEP=NO
    protected Integer pos = null;
// ***** VDMTOOLS END Name=pos

// ***** VDMTOOLS START Name=markedPos KEEP=NO
    protected Integer markedPos = null;
// ***** VDMTOOLS END Name=markedPos

// ***** VDMTOOLS START Name=count KEEP=NO
    protected Integer count = null;
// ***** VDMTOOLS END Name=count

// ***** VDMTOOLS START Name=CLASS KEEP=NO
    private static final JavaLangClass CLASS = (JavaLangClass) new JavaLangClass(new String("JavaIoCharArrayReader"), new quotes.CLASS(), Boolean.FALSE);
// ***** VDMTOOLS END Name=CLASS


// ***** VDMTOOLS START Name=JavaIoCharArrayReader KEEP=NO
    public JavaIoCharArrayReader() throws CGException {
        markedPos = Integer.valueOf(0);
    }
// ***** VDMTOOLS END Name=JavaIoCharArrayReader


// ***** VDMTOOLS START Name=read KEEP=NO
    public Integer read() throws CGException {
        ensureOpen();
        if (Boolean.valueOf((pos.intValue()) >= (count.intValue())).booleanValue())
            return Integer.valueOf(-Integer.valueOf(1).intValue());
        else {
            Integer l_u4 = pos;
            Integer l_u3 = l_u4;
            {
                pos = UTIL.NumberToInt(UTIL.clone(Integer.valueOf(l_u4.intValue() + Integer.valueOf(1).intValue())));
                {
                    Integer l_u1 = null;
                    l_u1 = J2VUTIL.toInt((Character) buf.get(l_u3));
                    return l_u1;
                }
            }
        }
    }
// ***** VDMTOOLS END Name=read


// ***** VDMTOOLS START Name=close KEEP=NO
    public void close() throws CGException {
        buf = (HashMap) UTIL.clone(new HashMap());
        ;
    }
// ***** VDMTOOLS END Name=close


// ***** VDMTOOLS START Name=mark KEEP=NO
    public void mark(final Integer readAheadLimit) throws CGException {
        {
            ensureOpen();
            markedPos = UTIL.NumberToInt(UTIL.clone(pos));
        }
        ;
    }
// ***** VDMTOOLS END Name=mark


// ***** VDMTOOLS START Name=ready KEEP=NO
    public Boolean ready() throws CGException {
        ensureOpen();
        return Boolean.valueOf((Integer.valueOf(count.intValue() - pos.intValue()).intValue()) > (Integer.valueOf(0).intValue()));
    }
// ***** VDMTOOLS END Name=ready


// ***** VDMTOOLS START Name=reset KEEP=NO
    public void reset() throws CGException {
        {
            ensureOpen();
            pos = UTIL.NumberToInt(UTIL.clone(markedPos));
        }
        ;
    }
// ***** VDMTOOLS END Name=reset


// ***** VDMTOOLS START Name=skip_u_u KEEP=NO
    public Integer skip_u_u(final Integer n_u) throws CGException {
        Integer n = n_u;
        ensureOpen();
        if (Boolean.valueOf((Integer.valueOf(pos.intValue() + n.intValue()).intValue()) > (count.intValue())).booleanValue())
            n = UTIL.NumberToInt(UTIL.clone(Integer.valueOf(count.intValue() - pos.intValue())));
        if (Boolean.valueOf((n.intValue()) < (Integer.valueOf(0).intValue())).booleanValue())
            return Integer.valueOf(0);
        {
            Integer l_u3 = pos;
            pos = UTIL.NumberToInt(UTIL.clone(Integer.valueOf(l_u3.intValue() + n.intValue())));
        }
        return n;
    }
// ***** VDMTOOLS END Name=skip_u_u


// ***** VDMTOOLS START Name=getClass KEEP=NO
    public JavaLangClass getJClass() throws CGException {
        return (JavaLangClass) CLASS;
    }
// ***** VDMTOOLS END Name=getClass


// ***** VDMTOOLS START Name=ensureOpen KEEP=NO
    private void ensureOpen() throws CGException {
        if (Boolean.valueOf(UTIL.equals(buf, new HashMap())).booleanValue())
            throw new VDMSpecException(new JavaIoIOException(new JavaLangString(new String("Stream closed"))));
        ;
    }
// ***** VDMTOOLS END Name=ensureOpen


// ***** VDMTOOLS START Name=markSupported KEEP=NO
    public Boolean markSupported() throws CGException {
        return Boolean.TRUE;
    }
// ***** VDMTOOLS END Name=markSupported

    public Integer readMICIntInt(final HashMap cbuf, final Integer off, final Integer len_u_u)
            throws CGException
    {
        return Integer.valueOf(-1);
    }

    public Tuple readMICIntInt_q(final HashMap b_u, final Integer off, final Integer len_u_u_u)
    throws CGException
    {
        return read(b_u, off, len_u_u_u);
    }

// ***** VDMTOOLS START Name=read KEEP=NO
    public Tuple read(final HashMap b_u, final Integer off, final Integer len_u_u_u) throws CGException {
        Integer len_u_u = len_u_u_u;
        HashMap b = b_u;
        ensureOpen();
        Boolean cond_5 = null;
        Boolean var1_6 = null;
        Boolean var1_7 = null;
        Boolean var1_8 = null;
        {
            if (!(var1_8 = Boolean.valueOf((off.intValue()) < (Integer.valueOf(0).intValue()))).booleanValue()) {
                Boolean var2_12 = null;
                Integer var2_14 = null;
                HashSet unArg_15 = new HashSet();
                unArg_15.clear();
                unArg_15.addAll(b.keySet());
                var2_14 = Integer.valueOf(unArg_15.size());
                var2_12 = Boolean.valueOf((off.intValue()) > (var2_14.intValue()));
                var1_8 = var2_12;
            }
        }
        {
            if (!(var1_7 = var1_8).booleanValue())
                var1_7 = Boolean.valueOf((len_u_u.intValue()) < (Integer.valueOf(0).intValue()));
        }
        {
            if (!(var1_6 = var1_7).booleanValue()) {
                Boolean var2_20 = null;
                Integer var2_24 = null;
                HashSet unArg_25 = new HashSet();
                unArg_25.clear();
                unArg_25.addAll(b.keySet());
                var2_24 = Integer.valueOf(unArg_25.size());
                var2_20 = Boolean.valueOf((Integer.valueOf(off.intValue() + len_u_u.intValue()).intValue()) > (var2_24.intValue()));
                var1_6 = var2_20;
            }
        }
        {
            if (!(cond_5 = var1_6).booleanValue())
                cond_5 = Boolean.valueOf((Integer.valueOf(off.intValue() + len_u_u.intValue()).intValue()) < (Integer.valueOf(0).intValue()));
        }
        if (cond_5.booleanValue())
            throw new VDMSpecException(new JavaLangIndexOutOfBoundsException());
        else if (Boolean.valueOf(len_u_u.intValue() == Integer.valueOf(0).intValue()).booleanValue()) {
            Tuple rexpr_35 = new Tuple(2);
            rexpr_35 = new Tuple(2);
            rexpr_35.SetField(1, Integer.valueOf(0));
            rexpr_35.SetField(2, b);
            return rexpr_35;
        }
        if (Boolean.valueOf((pos.intValue()) >= (count.intValue())).booleanValue()) {
            Tuple rexpr_42 = new Tuple(2);
            rexpr_42 = new Tuple(2);
            rexpr_42.SetField(1, Integer.valueOf(-Integer.valueOf(1).intValue()));
            rexpr_42.SetField(2, b);
            return rexpr_42;
        }
        if (Boolean.valueOf((Integer.valueOf(pos.intValue() + len_u_u.intValue()).intValue()) > (count.intValue())).booleanValue())
            len_u_u = UTIL.NumberToInt(UTIL.clone(Integer.valueOf(count.intValue() - pos.intValue())));
        if (Boolean.valueOf((len_u_u.intValue()) <= (Integer.valueOf(0).intValue())).booleanValue()) {
            Tuple rexpr_57 = new Tuple(2);
            rexpr_57 = new Tuple(2);
            rexpr_57.SetField(1, Integer.valueOf(0));
            rexpr_57.SetField(2, b);
            return rexpr_57;
        }
        {
            Integer k = pos;
            while (Boolean.valueOf((k.intValue()) < (Integer.valueOf(pos.intValue() + len_u_u.intValue()).intValue())).booleanValue()) {
                b.put(Integer.valueOf(off.intValue() + (Integer.valueOf(k.intValue() - pos.intValue())).intValue()), (Character) buf.get(k));
                k = UTIL.NumberToInt(UTIL.clone(Integer.valueOf(k.intValue() + Integer.valueOf(1).intValue())));
            }
        }
        {
            Integer l_u3 = pos;
            pos = UTIL.NumberToInt(UTIL.clone(Integer.valueOf(l_u3.intValue() + len_u_u.intValue())));
        }
        Tuple rexpr_82 = new Tuple(2);
        rexpr_82 = new Tuple(2);
        rexpr_82.SetField(1, len_u_u);
        rexpr_82.SetField(2, b);
        return rexpr_82;
    }
// ***** VDMTOOLS END Name=read


// ***** VDMTOOLS START Name=JavaIoCharArrayReader KEEP=NO
    public JavaIoCharArrayReader(final HashMap buf_1) throws CGException {
        this();
        {
            ((JavaIoCharArrayReader) this).buf = (HashMap) UTIL.clone(buf_1);
            ((JavaIoCharArrayReader) this).pos = UTIL.NumberToInt(UTIL.clone(Integer.valueOf(0)));
            Integer rhs_4 = null;
            HashSet unArg_5 = new HashSet();
            unArg_5.clear();
            unArg_5.addAll(buf_1.keySet());
            rhs_4 = Integer.valueOf(unArg_5.size());
            ((JavaIoCharArrayReader) this).count = UTIL.NumberToInt(UTIL.clone(rhs_4));
        }
    }
// ***** VDMTOOLS END Name=JavaIoCharArrayReader


// ***** VDMTOOLS START Name=JavaIoCharArrayReader KEEP=NO
    public JavaIoCharArrayReader(final quotes.NIL var_1_1) throws CGException {
        this();
        isNil = Boolean.TRUE;
    }
// ***** VDMTOOLS END Name=JavaIoCharArrayReader


// ***** VDMTOOLS START Name=JavaIoCharArrayReader KEEP=NO
    public JavaIoCharArrayReader(final HashMap buf_1, final Integer offset, final Integer length) throws CGException {
        this();
        {
            Boolean cond_4 = null;
            Boolean var1_5 = null;
            Boolean var1_6 = null;
            {
                if (!(var1_6 = Boolean.valueOf((offset.intValue()) < (Integer.valueOf(0).intValue()))).booleanValue()) {
                    Boolean var2_10 = null;
                    Integer var2_12 = null;
                    HashSet unArg_13 = new HashSet();
                    unArg_13.clear();
                    unArg_13.addAll(buf_1.keySet());
                    var2_12 = Integer.valueOf(unArg_13.size());
                    var2_10 = Boolean.valueOf((offset.intValue()) > (var2_12.intValue()));
                    var1_6 = var2_10;
                }
            }
            {
                if (!(var1_5 = var1_6).booleanValue())
                    var1_5 = Boolean.valueOf((length.intValue()) < (Integer.valueOf(0).intValue()));
            }
            {
                if (!(cond_4 = var1_5).booleanValue())
                    cond_4 = Boolean.valueOf((Integer.valueOf(offset.intValue() + length.intValue()).intValue()) < (Integer.valueOf(0).intValue()));
            }
            if (cond_4.booleanValue())
                throw new VDMSpecException(new JavaLangIllegalArgumentException());
            ((JavaIoCharArrayReader) this).buf = (HashMap) UTIL.clone(buf_1);
            ((JavaIoCharArrayReader) this).pos = UTIL.NumberToInt(UTIL.clone(offset));
            Integer rhs_26 = null;
            Boolean cond_28 = null;
            Integer var2_32 = null;
            HashSet unArg_33 = new HashSet();
            unArg_33.clear();
            unArg_33.addAll(buf_1.keySet());
            var2_32 = Integer.valueOf(unArg_33.size());
            cond_28 = Boolean.valueOf((Integer.valueOf(offset.intValue() + length.intValue()).intValue()) < (var2_32.intValue()));
            if (cond_28.booleanValue())
                rhs_26 = Integer.valueOf(offset.intValue() + length.intValue());
            else {
                HashSet unArg_35 = new HashSet();
                unArg_35.clear();
                unArg_35.addAll(buf_1.keySet());
                rhs_26 = Integer.valueOf(unArg_35.size());
            }
            ((JavaIoCharArrayReader) this).count = UTIL.NumberToInt(UTIL.clone(rhs_26));
            ((JavaIoCharArrayReader) this).markedPos = UTIL.NumberToInt(UTIL.clone(offset));
        }
    }
// ***** VDMTOOLS END Name=JavaIoCharArrayReader

}

;
