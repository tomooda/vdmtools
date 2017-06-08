package jp.vdmtools.VDM.jdk;

import jp.vdmtools.VDM.CGException;
import jp.vdmtools.VDM.UTIL;
import jp.vdmtools.VDM.VDMSpecException;

public class JavaLangObject implements Nullable {

    protected Boolean isNil = new Boolean(false);

    public static JavaLangObject NIL = new JavaLangObject(new quotes.NIL());

    public JavaLangObject(final quotes.NIL n) {
        isNil = new Boolean(true);
    }

    public Boolean IsNil() {
        return isNil;
    }

    public JavaLangObject() {
    }


    public JavaLangObject jClone() throws CGException {
        try {
            return (JavaLangObject) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new VDMSpecException(new JavaLangRuntimeException());
        }
    }

    public JavaLangClass vdm_getClass () throws CGException {
        return new JavaLangClass(new quotes.NIL());
   }


    public Integer vdm_hashCode() throws CGException {
        return new Integer(super.hashCode());
    }

    public JavaLangString vdm_toString() throws CGException {
        return new JavaLangString(super.toString());
    }

    public Boolean vdm_equals(final JavaLangObject obj) throws CGException {
        return new Boolean(UTIL.equals(this, obj));
    }

    protected void vdm_finalize() throws CGException
    {
    }
}
