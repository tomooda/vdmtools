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
import jp.vdmtools.VDM.VDMSpecException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

// ***** VDMTOOLS END Name=imports


public class JavaUtilHashtable extends JavaUtilDictionary implements JavaUtilMap, JavaLangCloneable, JavaIoSerializable {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
    static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=KEYS KEEP=NO
    public static Integer KEYS = Integer.valueOf(0);
// ***** VDMTOOLS END Name=KEYS

// ***** VDMTOOLS START Name=VALUES KEEP=NO
    public static Integer VALUES = Integer.valueOf(1);
// ***** VDMTOOLS END Name=VALUES

// ***** VDMTOOLS START Name=ENTRIES KEEP=NO
    public static Integer ENTRIES = Integer.valueOf(2);
// ***** VDMTOOLS END Name=ENTRIES

// ***** VDMTOOLS START Name=table KEEP=NO
    public HashMap table = new HashMap();
// ***** VDMTOOLS END Name=table

// ***** VDMTOOLS START Name=count KEEP=NO
    public Integer count = null;
// ***** VDMTOOLS END Name=count

// ***** VDMTOOLS START Name=threshold KEEP=NO
    private Integer threshold = null;
// ***** VDMTOOLS END Name=threshold

// ***** VDMTOOLS START Name=loadFactor KEEP=NO
    private Double loadFactor = null;
// ***** VDMTOOLS END Name=loadFactor

// ***** VDMTOOLS START Name=modCount KEEP=NO
    public Integer modCount = null;
// ***** VDMTOOLS END Name=modCount

    public JavaUtilSet keySet (){
        return null;
    }


// ***** VDMTOOLS START Name=CLASS KEEP=NO
    private static final JavaLangClass CLASS = (JavaLangClass) new JavaLangClass(new String("JavaUtilHashtable"), new quotes.CLASS(), Boolean.FALSE);
// ***** VDMTOOLS END Name=CLASS


// ***** VDMTOOLS START Name=keys KEEP=NO
    public JavaUtilEnumeration keys() throws CGException {
        return (JavaUtilEnumeration) (JavaUtilEnumeration) getEnumeration(JavaUtilHashtable.KEYS);
    }
// ***** VDMTOOLS END Name=keys


// ***** VDMTOOLS START Name=size KEEP=NO
    public Integer size() throws CGException {
        return count;
    }
// ***** VDMTOOLS END Name=size


// ***** VDMTOOLS START Name=clear KEEP=NO
    public void clear() throws CGException {
        modCount = Integer.valueOf(modCount.intValue() + 1);
        for (int i = 0; i < table.size(); i++)
        {
            table.put(Integer.valueOf(i), new  JavaUtilHTEntry(new quotes.NIL()));
        }
        count = Integer.valueOf(0);
    }
// ***** VDMTOOLS END Name=clear






// ***** VDMTOOLS START Name=rehash KEEP=NO
    protected void rehash() throws CGException {
        Integer oldCapacity = null;
        HashSet unArg_1 = new HashSet();
        unArg_1.clear();
        unArg_1.addAll(table.keySet());
        oldCapacity = Integer.valueOf(unArg_1.size());
        Integer newCapacity = Integer.valueOf(Integer.valueOf(oldCapacity.intValue() * Integer.valueOf(2).intValue()).intValue() + Integer.valueOf(1).intValue());
        HashMap newMap = new HashMap();
        HashMap res_m_7 = new HashMap();
        {
            boolean succ_11 = true;
            HashSet e_set_12 = new HashSet();
            e_set_12 = new HashSet();
            int ubi_17 = Integer.valueOf(newCapacity.intValue() - Integer.valueOf(1).intValue()).intValue();
            for (int count_18 = Integer.valueOf(0).intValue(); count_18 <= ubi_17; count_18++)
                e_set_12.add(Integer.valueOf(count_18));
            Integer l_u10 = null;
            {
                for (Iterator enum_20 = e_set_12.iterator(); enum_20.hasNext();) {
                    Integer elem_19 = UTIL.NumberToInt(enum_20.next());
                    succ_11 = true;
                    l_u10 = elem_19;
                    if (succ_11)
                        res_m_7.put(l_u10, new JavaUtilHTEntry(new quotes.NIL()));
                }
            }
        }
        newMap = res_m_7;
        modCount = UTIL.NumberToInt(UTIL.clone(Integer.valueOf(modCount.intValue() + Integer.valueOf(1).intValue())));
        {
            Double l_u6 = Double.valueOf(newCapacity.intValue() * loadFactor.doubleValue());
            Double l_u1 = null;
            Boolean cond_30 = null;
	    double tmp_32 = ((Number) l_u6).doubleValue();
	    l_u1 = Double.valueOf(Double.valueOf(Math.floor(tmp_32)).intValue());
            threshold = UTIL.NumberToInt(UTIL.clone(l_u1));
        }
        {
            Integer i = oldCapacity;
            Boolean l_u11 = null;
            {
                Integer l_u3 = i;
                Integer l_u2 = l_u3;
                {
                    i = UTIL.NumberToInt(UTIL.clone(Integer.valueOf(l_u3.intValue() - Integer.valueOf(1).intValue())));
                    {
                        Boolean l_u1 = Boolean.valueOf((l_u2.intValue()) > (Integer.valueOf(0).intValue()));
                        l_u11 = (Boolean) UTIL.clone(l_u1);
                    }
                }
            }
            while (l_u11.booleanValue()) {
                {
                    JavaUtilHTEntry old = (JavaUtilHTEntry) table.get(i);
                    while (true) {
                        Boolean whCrtl_48 = null;
                        Boolean unArg_49 = null;
                        unArg_49 = old.IsNil();
                        whCrtl_48 = Boolean.valueOf(!unArg_49.booleanValue());
                        if (whCrtl_48.booleanValue()) {
                            JavaUtilHTEntry e = old;
                            JavaUtilHTEntry rhs_50 = null;
                            rhs_50 = old.next;
                            old = (JavaUtilHTEntry) UTIL.clone(rhs_50);
                            {
                                Integer index = null;
                                Integer var1_52 = null;
                                {
                                    Integer i_1 = null;
                                    i_1 = e.hash;
                                    if (Boolean.valueOf((i_1.intValue()) < (Integer.valueOf(0).intValue())).booleanValue())
                                        var1_52 = Integer.valueOf(-i_1.intValue());
                                    else
                                        var1_52 = i_1;
                                }
                                index = Integer.valueOf((int) (var1_52.doubleValue() - newCapacity.doubleValue() * Math.floor(var1_52.doubleValue() / newCapacity.doubleValue())));
                                e.next = (JavaUtilHTEntry) (JavaUtilHTEntry) newMap.get(index);
                                newMap.put(index, e);
                            }
                        } else
                            break;
                    }
                }
                {
                    Integer l_u3 = i;
                    Integer l_u2 = l_u3;
                    {
                        i = UTIL.NumberToInt(UTIL.clone(Integer.valueOf(l_u3.intValue() - Integer.valueOf(1).intValue())));
                        {
                            Boolean l_u1 = Boolean.valueOf((l_u2.intValue()) > (Integer.valueOf(0).intValue()));
                            l_u11 = (Boolean) UTIL.clone(l_u1);
                        }
                    }
                }
            }
        }
        table = (HashMap) UTIL.clone(newMap);
        ;
    }
// ***** VDMTOOLS END Name=rehash


// ***** VDMTOOLS START Name=isEmpty KEEP=NO
    public Boolean isEmpty() throws CGException {
        return Boolean.valueOf(count.intValue() == Integer.valueOf(0).intValue());
    }
// ***** VDMTOOLS END Name=isEmpty


// ***** VDMTOOLS START Name=elements KEEP=NO
    public JavaUtilEnumeration elements() throws CGException {
        return (JavaUtilEnumeration) (JavaUtilEnumeration) getEnumeration(JavaUtilHashtable.VALUES);
    }
// ***** VDMTOOLS END Name=elements


// ***** VDMTOOLS START Name=getClass KEEP=NO
    public JavaLangClass getJClass() throws CGException {
        return (JavaLangClass) CLASS;
    }
// ***** VDMTOOLS END Name=getClass


//// ***** VDMTOOLS START Name=hashCode KEEP=NO
//    public Integer hashCode() throws CGException {
//        Integer h = Integer.valueOf(0);
//        return h;
//    }
//// ***** VDMTOOLS END Name=hashCode


// ***** VDMTOOLS START Name=toString KEEP=NO
    public JavaLangString toJString() throws CGException {
        Integer max = Integer.valueOf(size().intValue() - Integer.valueOf(1).intValue());
        JavaLangStringBuffer buf = new JavaLangStringBuffer();
        {
            JavaLangStringBuffer tmpVal_4 = null;
            tmpVal_4 = (JavaLangStringBuffer) buf.append(new JavaLangString(new String("{")));
            ;
        }
        {
            Integer i = Integer.valueOf(0);
            while (Boolean.valueOf((i.intValue()) <= (max.intValue())).booleanValue()) {
                if (Boolean.valueOf((i.intValue()) < (max.intValue())).booleanValue()) {
                    JavaLangStringBuffer tmpVal_14 = null;
                    tmpVal_14 = (JavaLangStringBuffer) buf.append(new JavaLangString(new String(", ")));
                    ;
                }
                i = UTIL.NumberToInt(UTIL.clone(Integer.valueOf(i.intValue() + Integer.valueOf(1).intValue())));
            }
        }
        {
            JavaLangStringBuffer tmpVal_21 = null;
            tmpVal_21 = (JavaLangStringBuffer) buf.append(new JavaLangString(new String("}")));
            ;
        }
        JavaLangString rexpr_24 = null;
        rexpr_24 = (JavaLangString) new JavaLangString(buf.vdm_toString());
        return (JavaLangString) rexpr_24;
    }
// ***** VDMTOOLS END Name=toString


// ***** VDMTOOLS START Name=JavaUtilHashtable KEEP=NO
    public JavaUtilHashtable() throws CGException {
        this(Integer.valueOf(11), Double.valueOf(1.0));
    }
// ***** VDMTOOLS END Name=JavaUtilHashtable


// ***** VDMTOOLS START Name=JavaUtilHashtable KEEP=NO
    public JavaUtilHashtable(final Integer initialCapacity) throws CGException {
        this(initialCapacity, Double.valueOf(0.75));
    }
// ***** VDMTOOLS END Name=JavaUtilHashtable


// ***** VDMTOOLS START Name=get KEEP=NO
    public JavaLangObject get(final JavaLangObject key) throws CGException {
        Integer hash = null;
        hash = Integer.valueOf(key.hashCode());
        Integer index = null;
        Integer var1_2 = null;
        if (Boolean.valueOf((hash.intValue()) < (Integer.valueOf(0).intValue())).booleanValue())
            var1_2 = Integer.valueOf(-hash.intValue());
        else
            var1_2 = hash;
        Integer var2_8 = null;
        HashSet unArg_9 = new HashSet();
        unArg_9.clear();
        unArg_9.addAll(table.keySet());
        var2_8 = Integer.valueOf(unArg_9.size());
        index = Integer.valueOf((int) (var1_2.doubleValue() - var2_8.doubleValue() * Math.floor(var1_2.doubleValue() / var2_8.doubleValue())));
        {
            JavaUtilHTEntry e = (JavaUtilHTEntry) table.get(index);
            while (true) {
                Boolean whCrtl_13 = null;
                Boolean unArg_14 = null;
                unArg_14 = e.IsNil();
                whCrtl_13 = Boolean.valueOf(!unArg_14.booleanValue());
                if (whCrtl_13.booleanValue()) {
                    Boolean cond_15 = null;
                    Boolean var1_16 = null;
                    Integer var1_17 = null;
                    var1_17 = e.hash;
                    var1_16 = Boolean.valueOf(var1_17.intValue() == hash.intValue());
                    {
                        if ((cond_15 = var1_16).booleanValue()) {
                            Boolean var2_20 = null;
                            JavaLangObject obj_21 = null;
                            obj_21 = e.key;
                            var2_20 = obj_21.vdm_equals((JavaLangObject) key);
                            cond_15 = var2_20;
                        }
                    }
                    if (cond_15.booleanValue()) {
                        JavaLangObject rexpr_24 = null;
                        rexpr_24 = e.value_u_u;
                        return (JavaLangObject) rexpr_24;
                    }
                    JavaUtilHTEntry rhs_26 = null;
                    rhs_26 = e.next;
                    e = (JavaUtilHTEntry) UTIL.clone(rhs_26);
                } else
                    break;
            }
        }
        return (JavaLangObject) new JavaLangObject(new quotes.NIL());
    }
// ***** VDMTOOLS END Name=get


// ***** VDMTOOLS START Name=putAll KEEP=NO
    public void putAll(final JavaUtilMap t) throws CGException {
        ;
    }
// ***** VDMTOOLS END Name=putAll


// ***** VDMTOOLS START Name=JavaUtilHashtable KEEP=NO
    public JavaUtilHashtable(final Integer initialCapacity_u, final Double loadFactor_1) throws CGException {
	//        this();
        {
            Integer initialCapacity = initialCapacity_u;
            if (Boolean.valueOf((initialCapacity.intValue()) < (Integer.valueOf(0).intValue())).booleanValue()) {
                JavaLangIllegalArgumentException exceptionValue_6 = null;
                JavaLangString arg_7 = null;
                JavaLangString par_10 = null;
                //par_10 = (JavaLangString) J2VUTIL.toJString(initialCapacity);
                arg_7 = (JavaLangString) J2VUTIL.ConcatStr((JavaLangString) new JavaLangString(new String("Illegal Capacity: ")), (JavaLangString) par_10);
                exceptionValue_6 = new JavaLangIllegalArgumentException(arg_7);
                throw new VDMSpecException(exceptionValue_6);
            }
            if (Boolean.valueOf((loadFactor_1.doubleValue()) <= (Integer.valueOf(0).intValue())).booleanValue()) {
                JavaLangIllegalArgumentException exceptionValue_15 = null;
                JavaLangString arg_16 = null;
                JavaLangString par_19 = null;
                //par_19 = (JavaLangString) J2VUTIL.toJString(loadFactor_1);
                arg_16 = (JavaLangString) J2VUTIL.ConcatStr((JavaLangString) new JavaLangString(new String("Illegal Load: ")), (JavaLangString) par_19);
                exceptionValue_15 = new JavaLangIllegalArgumentException(arg_16);
                throw new VDMSpecException(exceptionValue_15);
            }
            if (Boolean.valueOf(initialCapacity.intValue() == Integer.valueOf(0).intValue()).booleanValue())
                initialCapacity = UTIL.NumberToInt(UTIL.clone(Integer.valueOf(1)));
            ((JavaUtilHashtable) this).loadFactor = UTIL.NumberToReal(UTIL.clone(loadFactor_1));
            HashMap rhs_26 = new HashMap();
            HashMap res_m_27 = new HashMap();
            {
                boolean succ_31 = true;
                HashSet e_set_32 = new HashSet();
                e_set_32 = new HashSet();
                int ubi_37 = Integer.valueOf(initialCapacity.intValue() - Integer.valueOf(1).intValue()).intValue();
                for (int count_38 = Integer.valueOf(0).intValue(); count_38 <= ubi_37; count_38++)
                    e_set_32.add(Integer.valueOf(count_38));
                Integer l_u3 = null;
                {
                    for (Iterator enum_40 = e_set_32.iterator(); enum_40.hasNext();) {
                        Integer elem_39 = UTIL.NumberToInt(enum_40.next());
                        succ_31 = true;
                        l_u3 = elem_39;
                        if (succ_31)
                            res_m_27.put(l_u3, new JavaUtilHTEntry(new quotes.NIL()));
                    }
                }
            }
            rhs_26 = res_m_27;
            table = (HashMap) UTIL.clone(rhs_26);
            {
                Double l_u6 = Double.valueOf(initialCapacity.intValue() * loadFactor_1.doubleValue());
                Double l_u1 = null;
                Boolean cond_47 = null;
                threshold = Integer.valueOf(l_u6.intValue());
            }
            count = UTIL.NumberToInt(UTIL.clone(Integer.valueOf(0)));
            modCount = UTIL.NumberToInt(UTIL.clone(Integer.valueOf(0)));
        }
    }
// ***** VDMTOOLS END Name=JavaUtilHashtable


// ***** VDMTOOLS START Name=getIterator KEEP=NO
    public JavaUtilIterator getIterator(final Integer type) throws CGException {
        JavaUtilIterator res = null;
        if (Boolean.valueOf(count.intValue() == Integer.valueOf(0).intValue()).booleanValue())
            res = (JavaUtilIterator) UTIL.clone(new JavaUtilEmptyIterator());
        else
            res = (JavaUtilIterator) UTIL.clone(new JavaUtilEnumerator(type, Boolean.TRUE, this));
        return (JavaUtilIterator) res;
    }
// ***** VDMTOOLS END Name=getIterator


// ***** VDMTOOLS START Name=JavaUtilHashtable KEEP=NO
    public JavaUtilHashtable(final quotes.NIL var_1_1) throws CGException {
        this();
        isNil = Boolean.TRUE;
    }
// ***** VDMTOOLS END Name=JavaUtilHashtable


// ***** VDMTOOLS START Name=equals KEEP=NO
    public Boolean equals(final JavaLangObject o) throws CGException {
        if (Boolean.valueOf(UTIL.equals(o, this)).booleanValue())
            return Boolean.TRUE;
        if (Boolean.valueOf(!Boolean.valueOf(o instanceof JavaUtilHashtable).booleanValue()).booleanValue())
            return Boolean.FALSE;
        {
            JavaUtilHashtable t = (JavaUtilHashtable) o;
            Boolean cond_10 = null;
            Integer var1_11 = null;
            var1_11 = t.size();
            cond_10 = Boolean.valueOf(!(var1_11.intValue() == size().intValue()));
            if (cond_10.booleanValue())
                return Boolean.FALSE;
            return Boolean.TRUE;
        }
    }
// ***** VDMTOOLS END Name=equals


// ***** VDMTOOLS START Name=remove KEEP=NO
    public JavaLangObject remove(final JavaLangObject key) throws CGException {
        Integer hash = null;
        hash = Integer.valueOf(key.hashCode());
        Integer var1_2 = null;
        if (Boolean.valueOf((hash.intValue()) < (Integer.valueOf(0).intValue())).booleanValue())
            var1_2 = Integer.valueOf(-hash.intValue());
        else
            var1_2 = hash;
        Integer var2_8 = null;
        HashSet unArg_9 = new HashSet();
        unArg_9.clear();
        unArg_9.addAll(table.keySet());
        var2_8 = Integer.valueOf(unArg_9.size());
        int index = (int) (var1_2.doubleValue() - var2_8.doubleValue() * Math.floor(var1_2.doubleValue() / var2_8.doubleValue()));
        for (JavaUtilHTEntry e = (JavaUtilHTEntry) table.get(Integer.valueOf(index)),
                prev = new JavaUtilHTEntry(new quotes.NIL());
             !e.IsNil().booleanValue();
             prev = e, e = e.next)
        {
            if ((e.hash.intValue() == hash.intValue()) && e.key.vdm_equals(key).booleanValue())
            {
                modCount = Integer.valueOf(modCount.intValue() + 1);
                if (!prev.IsNil().booleanValue())
                    prev.next = e.next;
                else
                    table.put(Integer.valueOf(index), e.next);
                count = Integer.valueOf(count.intValue()-1);
                JavaLangObject oldValue = e.value_u_u;
                e.value_u_u = new JavaLangObject(new quotes.NIL());
                return oldValue;
            }
        }
        return (JavaLangObject) new JavaLangObject(new quotes.NIL());
    }
// ***** VDMTOOLS END Name=remove


// ***** VDMTOOLS START Name=getEnumeration KEEP=NO
    private JavaUtilEnumeration getEnumeration(final Integer type) throws CGException {
        if (Boolean.valueOf(count.intValue() == Integer.valueOf(0).intValue()).booleanValue())
            return (JavaUtilEnumeration) new JavaUtilEmptyEnumerator();
        else
            return (JavaUtilEnumeration) new JavaUtilEnumerator(type, Boolean.FALSE, this);
    }
// ***** VDMTOOLS END Name=getEnumeration


// ***** VDMTOOLS START Name=contains KEEP=NO
    public Boolean contains(final JavaLangObject value_u_u) throws CGException {
        if (value_u_u.IsNil().booleanValue())
            throw new VDMSpecException(new JavaLangNullPointerException());

        for (int i = table.size(); i-- > 0; ){
            for (JavaUtilHTEntry e = (JavaUtilHTEntry) table.get(Integer.valueOf(i)); !e.IsNil().booleanValue();
                 e = e.next)
            {
                if (e.value_u_u.vdm_equals(value_u_u).booleanValue())
                    return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
// ***** VDMTOOLS END Name=contains


// ***** VDMTOOLS START Name=containsKey KEEP=NO
    public Boolean containsKey(final JavaLangObject key) throws CGException {
        Integer hash = null;
        hash = Integer.valueOf(key.hashCode());
        Integer index = null;
        Integer var1_2 = null;
        if (Boolean.valueOf((hash.intValue()) < (Integer.valueOf(0).intValue())).booleanValue())
            var1_2 = Integer.valueOf(-hash.intValue());
        else
            var1_2 = hash;
        Integer var2_8 = null;
        HashSet unArg_9 = new HashSet();
        unArg_9.clear();
        unArg_9.addAll(table.keySet());
        var2_8 = Integer.valueOf(unArg_9.size());
        index = Integer.valueOf((int) (var1_2.doubleValue() - var2_8.doubleValue() * Math.floor(var1_2.doubleValue() / var2_8.doubleValue())));
        {
            JavaUtilHTEntry e = (JavaUtilHTEntry) table.get(index);
            while (true) {
                Boolean whCrtl_13 = null;
                Boolean unArg_14 = null;
                unArg_14 = e.IsNil();
                whCrtl_13 = Boolean.valueOf(!unArg_14.booleanValue());
                if (whCrtl_13.booleanValue()) {
                    Boolean cond_15 = null;
                    Boolean var1_16 = null;
                    Integer var1_17 = null;
                    var1_17 = e.hash;
                    var1_16 = Boolean.valueOf(var1_17.intValue() == hash.intValue());
                    {
                        if ((cond_15 = var1_16).booleanValue()) {
                            Boolean var2_20 = null;
                            JavaLangObject obj_21 = null;
                            obj_21 = e.key;
                            var2_20 = obj_21.vdm_equals((JavaLangObject) key);
                            cond_15 = var2_20;
                        }
                    }
                    if (cond_15.booleanValue())
                        return Boolean.TRUE;
                    JavaUtilHTEntry rhs_25 = null;
                    rhs_25 = e.next;
                    e = (JavaUtilHTEntry) UTIL.clone(rhs_25);
                } else
                    break;
            }
        }
        return Boolean.FALSE;
    }
// ***** VDMTOOLS END Name=containsKey


// ***** VDMTOOLS START Name=put KEEP=NO
    public JavaLangObject put(final JavaLangObject key, final JavaLangObject value_u_u) throws CGException {
        Boolean cond_3 = null;
        cond_3 = value_u_u.IsNil();
	//        if (cond_3.booleanValue())
	//            throw new VDMSpecException(new JavaLangNullPointerException());
        {
            Integer hash = null;
            hash = Integer.valueOf(key.hashCode());
            Integer index = null;
            Integer var1_5 = null;
            if (Boolean.valueOf((hash.intValue()) < (Integer.valueOf(0).intValue())).booleanValue())
                var1_5 = Integer.valueOf(-hash.intValue());
            else
                var1_5 = hash;
            Integer var2_11 = null;
            HashSet unArg_12 = new HashSet();
            unArg_12.clear();
            unArg_12.addAll(table.keySet());
            var2_11 = Integer.valueOf(unArg_12.size());
            index = Integer.valueOf((int) (var1_5.doubleValue() - var2_11.doubleValue() * Math.floor(var1_5.doubleValue() / var2_11.doubleValue())));
            {
                JavaUtilHTEntry e = (JavaUtilHTEntry) table.get(index);
                while (true) {
                    Boolean whCrtl_16 = null;
                    Boolean unArg_17 = null;
                    unArg_17 = e.IsNil();
                    whCrtl_16 = Boolean.valueOf(!unArg_17.booleanValue());
                    if (whCrtl_16.booleanValue()) {
                        JavaLangObject old = null;
                        old = e.value_u_u;
                        Boolean cond_19 = null;
                        Boolean var1_20 = null;
                        Integer var1_21 = null;
                        var1_21 = e.hash;
                        var1_20 = Boolean.valueOf(var1_21.intValue() == hash.intValue());
                        {
                            if ((cond_19 = var1_20).booleanValue()) {
                                Boolean var2_24 = null;
                                JavaLangObject obj_25 = null;
                                obj_25 = e.key;
                                var2_24 = obj_25.vdm_equals((JavaLangObject) key);
                                cond_19 = var2_24;
                            }
                        }
                        if (cond_19.booleanValue()) {
                            e.value_u_u = (JavaLangObject) value_u_u;
                            return (JavaLangObject) old;
                        }
                        JavaUtilHTEntry rhs_31 = null;
                        rhs_31 = e.next;
                        e = (JavaUtilHTEntry) UTIL.clone(rhs_31);
                    } else
                        break;
                }
            }
            modCount = UTIL.NumberToInt(UTIL.clone(Integer.valueOf(modCount.intValue() + Integer.valueOf(1).intValue())));
            if (Boolean.valueOf((count.intValue()) >= (threshold.intValue())).booleanValue()) {
                rehash();
                Integer rhs_40 = null;
                Integer var1_41 = null;
                if (Boolean.valueOf((hash.intValue()) < (Integer.valueOf(0).intValue())).booleanValue())
                    var1_41 = Integer.valueOf(-hash.intValue());
                else
                    var1_41 = hash;
                Integer var2_47 = null;
                HashSet unArg_48 = new HashSet();
                unArg_48.clear();
                unArg_48.addAll(table.keySet());
                var2_47 = Integer.valueOf(unArg_48.size());
                rhs_40 = Integer.valueOf((int) (var1_41.doubleValue() - var2_47.doubleValue() * Math.floor(var1_41.doubleValue() / var2_47.doubleValue())));
                index = UTIL.NumberToInt(UTIL.clone(rhs_40));
            }
            {
                JavaUtilHTEntry e = new JavaUtilHTEntry(hash, key, value_u_u, (JavaUtilHTEntry) table.get(index));
                table.put(index, e);
                count = UTIL.NumberToInt(UTIL.clone(Integer.valueOf(count.intValue() + Integer.valueOf(1).intValue())));
                return (JavaLangObject) new JavaLangObject(new quotes.NIL());
            }
        }
    }
// ***** VDMTOOLS END Name=put


// ***** VDMTOOLS START Name=containsValue KEEP=NO
    public Boolean containsValue(final JavaLangObject value_u_u) throws CGException {
        return contains((JavaLangObject) value_u_u);
    }
// ***** VDMTOOLS END Name=containsValue

}

;
