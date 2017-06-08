package jp.vdmtools.VDM.jdk;


import jp.vdmtools.VDM.CGException;
import jp.vdmtools.VDM.Tuple;
import jp.vdmtools.VDM.UTIL;
import jp.vdmtools.VDM.VDMSpecException;

import java.io.Reader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Vector;


public abstract class JavaIoReader extends JavaLangObject {

    private static final JavaLangClass CLASS = (JavaLangClass) new JavaLangClass(new String("JavaIoReader"), new quotes.CLASS(), new Boolean(false));


    public abstract Reader getWrappedObject();

    public Integer read() throws CGException {
        HashMap cb = new HashMap();
        cb = new HashMap();
        cb.put(new Integer(0), new Character(' '));
        {
            boolean succ_3;
            Tuple tmpVal_4 = new Tuple(2);
            tmpVal_4 = readMICIntInt_q(cb, new Integer(0), new Integer(1));
            HashMap l_um = new HashMap();
            Integer l_ur = null;
            succ_3 = true;
            {
                Vector e_l_8 = new Vector();
                for (int i_9 = 1; i_9 <= tmpVal_4.Length(); i_9++)
                    e_l_8.add(tmpVal_4.GetField(i_9));
                if (succ_3 = 2 == e_l_8.size()) {
                    l_ur = UTIL.NumberToInt(e_l_8.get(0));
                    l_um = (HashMap) e_l_8.get(2 - 1);
                }
            }
            if (!succ_3)
                UTIL.RunTime("Run-Time Error:Pattern match did not succeed in value definition");
            if (new Boolean(l_ur.intValue() == new Integer(-new Integer(1).intValue()).intValue()).booleanValue())
                return new Integer(-new Integer(1).intValue());
            else {
                Integer rexpr_14 = null;
                rexpr_14 = J2VUTIL.toInt((Character) l_um.get(new Integer(0)));
                return rexpr_14;
            }
        }
    }


    public abstract void close() throws CGException;


    public void mark(final Integer readAheadLimit) throws CGException {
        throw new VDMSpecException(new JavaIoIOException(new JavaLangString(new String("mark() not supported"))));
    }


    public Boolean ready() throws CGException {
        return new Boolean(false);
    }


    public void reset() throws CGException {
        throw new VDMSpecException(new JavaIoIOException(new JavaLangString(new String("reset() not supported"))));
    }


    public JavaIoReader() throws CGException {
        ;
    }


    public Integer skip_u_u(final Integer n) throws CGException {
        if (new Boolean((n.intValue()) < (new Integer(0).intValue())).booleanValue())
            throw new VDMSpecException(new JavaLangIllegalArgumentException(new JavaLangString(new String("skip value is negative"))));
        {
            Integer remaining = n;
            Integer c = new Integer(0);
            while (true) {
                Boolean whCrtl_8 = null;
                {
                    if ((whCrtl_8 = new Boolean((remaining.intValue()) > (new Integer(0).intValue()))).booleanValue())
                        whCrtl_8 = new Boolean((c.intValue()) >= (new Integer(0).intValue()));
                }
                if (whCrtl_8.booleanValue()) {
                    Integer c_1 = null;
                    c_1 = UTIL.NumberToInt(UTIL.clone(read()));
                    if (new Boolean((c_1.intValue()) >= (new Integer(0).intValue())).booleanValue())
                        remaining = UTIL.NumberToInt(UTIL.clone(new Integer(remaining.intValue() - new Integer(1).intValue())));
                } else
                    break;
            }
            return new Integer(n.intValue() - remaining.intValue());
        }
    }


    public JavaLangClass getJClass() throws CGException {
        return (JavaLangClass) CLASS;
    }


    public Integer readMIC(final HashMap cbuf) throws CGException {
        Integer rexpr_2 = null;
        Integer par_5 = null;
        HashSet unArg_6 = new HashSet();
        unArg_6.clear();
        unArg_6.addAll(cbuf.keySet());
        par_5 = new Integer(unArg_6.size());
        rexpr_2 = readMICIntInt(cbuf, new Integer(0), par_5);
        return rexpr_2;
    }


    public JavaIoReader(final quotes.NIL var_1_1) throws CGException {
        this();
        isNil = (Boolean) UTIL.clone(new Boolean(true));
    }


    public Boolean markSupported() throws CGException {
        return new Boolean(false);
    }


    public abstract Integer readMICIntInt(final HashMap cbuf, final Integer off, final Integer len_u_u) throws CGException;


    public abstract Tuple readMICIntInt_q(final HashMap cbuf, final Integer off, final Integer len_u_u) throws CGException;


    protected JavaIoReader(final JavaLangObject lock) throws CGException {
        this();
        ;
    }

}

;
