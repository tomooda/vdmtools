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

// ***** VDMTOOLS END Name=imports


public class HashIterator extends JavaLangObject implements JavaUtilIterator {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
    static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=hm KEEP=NO
    private JavaUtilHashMap hm = null;
// ***** VDMTOOLS END Name=hm

// ***** VDMTOOLS START Name=index KEEP=NO
    private Integer index = null;
// ***** VDMTOOLS END Name=index

// ***** VDMTOOLS START Name=entry KEEP=NO
    private HMEntry entry = null;
// ***** VDMTOOLS END Name=entry

// ***** VDMTOOLS START Name=lastReturned KEEP=NO
    private HMEntry lastReturned = null;
// ***** VDMTOOLS END Name=lastReturned

// ***** VDMTOOLS START Name=type KEEP=NO
    private Integer type = null;
// ***** VDMTOOLS END Name=type

// ***** VDMTOOLS START Name=expectedModCount KEEP=NO
    private Integer expectedModCount = null;
// ***** VDMTOOLS END Name=expectedModCount


// ***** VDMTOOLS START Name=HashIterator KEEP=NO
    public HashIterator() throws CGException {
        try {
            entry = (HMEntry) new HMEntry(new quotes.NIL());
            lastReturned = (HMEntry) new HMEntry(new quotes.NIL());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
// ***** VDMTOOLS END Name=HashIterator


// ***** VDMTOOLS START Name=HashIterator KEEP=NO
    public HashIterator(final Integer type_1, final JavaUtilHashMap hm_1) throws CGException {
        this();
        {
            ((HashIterator) this).type = UTIL.NumberToInt(UTIL.clone(type_1));
            ((HashIterator) this).hm = (JavaUtilHashMap) UTIL.clone(hm_1);
            Integer rhs_5 = null;
            HashSet unArg_6 = new HashSet();
            HashMap unArg_7 = new HashMap();
            unArg_7 = hm_1.table;
            unArg_6.clear();
            unArg_6.addAll(unArg_7.keySet());
            rhs_5 = Integer.valueOf(unArg_6.size());
            ((HashIterator) this).index = UTIL.NumberToInt(UTIL.clone(rhs_5));
            Integer rhs_9 = null;
            rhs_9 = hm_1.modCount;
            expectedModCount = UTIL.NumberToInt(UTIL.clone(rhs_9));
        }
    }
// ***** VDMTOOLS END Name=HashIterator


// ***** VDMTOOLS START Name=hasNext KEEP=NO
    public Boolean hasNext() throws CGException {
        HMEntry e = entry;
        Integer i = index;
        while (true) {
            Boolean whCrtl_1 = null;
            Boolean var1_2 = null;
            var1_2 = e.IsNil();
            {
                if ((whCrtl_1 = var1_2).booleanValue())
                    whCrtl_1 = Boolean.valueOf((i.intValue()) > (Integer.valueOf(0).intValue()));
            }
            if (whCrtl_1.booleanValue()) {
                i = UTIL.NumberToInt(UTIL.clone(Integer.valueOf(i.intValue() - Integer.valueOf(1).intValue())));
                HMEntry rhs_9 = null;
                HashMap tmp_m_10 = new HashMap();
                tmp_m_10 = hm.table;
                rhs_9 = (HMEntry) tmp_m_10.get(i);
                e = (HMEntry) UTIL.clone(rhs_9);
            } else
                break;
        }
        entry = (HMEntry) UTIL.clone(e);
        index = UTIL.NumberToInt(UTIL.clone(i));
        Boolean rexpr_15 = null;
        Boolean unArg_16 = null;
        unArg_16 = e.IsNil();
        rexpr_15 = Boolean.valueOf(!unArg_16.booleanValue());
        return rexpr_15;
    }
// ***** VDMTOOLS END Name=hasNext


// ***** VDMTOOLS START Name=next KEEP=NO
    public JavaLangObject next() throws CGException {
        HMEntry et = entry;
        Integer i = index;
        while (true) {
            Boolean whCrtl_1 = null;
            Boolean var1_2 = null;
            var1_2 = et.IsNil();
            {
                if ((whCrtl_1 = var1_2).booleanValue())
                    whCrtl_1 = Boolean.valueOf((i.intValue()) > (Integer.valueOf(0).intValue()));
            }
            if (whCrtl_1.booleanValue()) {
                i = UTIL.NumberToInt(UTIL.clone(Integer.valueOf(i.intValue() - Integer.valueOf(1).intValue())));
                HMEntry rhs_9 = null;
                HashMap tmp_m_10 = new HashMap();
                tmp_m_10 = hm.table;
                rhs_9 = (HMEntry) tmp_m_10.get(i);
                et = (HMEntry) UTIL.clone(rhs_9);
            } else
                break;
        }
        entry = (HMEntry) UTIL.clone(et);
        index = UTIL.NumberToInt(UTIL.clone(i));
        Boolean cond_15 = null;
        Boolean unArg_16 = null;
        unArg_16 = et.IsNil();
        cond_15 = Boolean.valueOf(!unArg_16.booleanValue());
        if (cond_15.booleanValue()) {
            HMEntry e = null;
            lastReturned = (HMEntry) UTIL.clone(entry);
            e = (HMEntry) UTIL.clone(lastReturned);
            HMEntry rhs_19 = null;
            rhs_19 = e.next;
            entry = (HMEntry) UTIL.clone(rhs_19);
            Object rexpr_21 = null;
            if (Boolean.valueOf(type.intValue() == JavaUtilHashMap.KEYS.intValue()).booleanValue())
                rexpr_21 = e.key;
            else if (Boolean.valueOf(type.intValue() == JavaUtilHashMap.VALUES.intValue()).booleanValue())
                rexpr_21 = e.value_u_u;
            else
                rexpr_21 = e;
            return (JavaLangObject) rexpr_21;
        }
        throw new VDMSpecException(new JavaUtilNoSuchElementException());
    }
// ***** VDMTOOLS END Name=next


// ***** VDMTOOLS START Name=remove KEEP=NO
    public void remove() throws CGException {
        Integer idx = null;
        Integer var1_1 = null;
        Boolean cond_3 = null;
        Integer var1_4 = null;
        var1_4 = lastReturned.hash;
        cond_3 = Boolean.valueOf((var1_4.intValue()) < (Integer.valueOf(0).intValue()));
        if (cond_3.booleanValue()) {
            Integer unArg_8 = null;
            unArg_8 = lastReturned.hash;
            var1_1 = Integer.valueOf(-unArg_8.intValue());
        } else
            var1_1 = lastReturned.hash;
        Integer var2_10 = null;
        HashSet unArg_11 = new HashSet();
        HashMap unArg_12 = new HashMap();
        unArg_12 = hm.table;
        unArg_11.clear();
        unArg_11.addAll(unArg_12.keySet());
        var2_10 = Integer.valueOf(unArg_11.size());
        idx = Integer.valueOf((int) (var1_1.doubleValue() - var2_10.doubleValue() * Math.floor(var1_1.doubleValue() / var2_10.doubleValue())));
        HMEntry e = null;
        HashMap tmp_m_14 = new HashMap();
        tmp_m_14 = hm.table;
        e = (HMEntry) tmp_m_14.get(idx);
        HMEntry prev = new HMEntry(new quotes.NIL());
        while (true) {
            Boolean whCrtl_18 = null;
            Boolean unArg_19 = null;
            unArg_19 = e.IsNil();
            whCrtl_18 = Boolean.valueOf(!unArg_19.booleanValue());
            if (whCrtl_18.booleanValue()) {
                if (Boolean.valueOf(UTIL.equals(e, lastReturned)).booleanValue()) {
                    Integer rhs_23 = null;
                    Integer var1_24 = null;
                    var1_24 = hm.modCount;
                    rhs_23 = Integer.valueOf(var1_24.intValue() + Integer.valueOf(1).intValue());
                    hm.modCount = UTIL.NumberToInt(rhs_23);
                    expectedModCount = UTIL.NumberToInt(UTIL.clone(Integer.valueOf(expectedModCount.intValue() + Integer.valueOf(1).intValue())));
                    Boolean cond_31 = null;
                    Boolean unArg_32 = null;
                    unArg_32 = prev.IsNil();
                    cond_31 = Boolean.valueOf(!unArg_32.booleanValue());
                    if (cond_31.booleanValue()) {
                        HMEntry rhs_42 = null;
                        rhs_42 = e.next;
                        prev.next = (HMEntry) rhs_42;
                    } else {
                        HashMap rhs_33 = new HashMap();
                        HashMap seqmap_36 = new HashMap();
                        seqmap_36 = hm.table;
                        HashMap modmap_34 = new HashMap();
                        HMEntry tmpVar2_39 = null;
                        tmpVar2_39 = e.next;
                        modmap_34 = new HashMap();
                        modmap_34.put(idx, tmpVar2_39);
                        rhs_33 = new HashMap(seqmap_36);
                        rhs_33.putAll(modmap_34);
                        hm.table = (HashMap) rhs_33;
                    }
                    Integer rhs_45 = null;
                    Integer var1_46 = null;
                    var1_46 = hm.count;
                    rhs_45 = Integer.valueOf(var1_46.intValue() - Integer.valueOf(1).intValue());
                    hm.count = UTIL.NumberToInt(rhs_45);
                    lastReturned = (HMEntry) UTIL.clone(new JavaLangObject(new quotes.NIL()));
                    return;
                }
                prev = (HMEntry) UTIL.clone(e);
                HMEntry rhs_53 = null;
                rhs_53 = e.next;
                e = (HMEntry) UTIL.clone(rhs_53);
            } else
                break;
        }
    }
// ***** VDMTOOLS END Name=remove

}

;
