

package jp.vdmtools.VDM.jdk;







public class JavaLangException extends JavaLangThrowable {

    public JavaLangException() {
    }


    public JavaLangException(final quotes.NIL var_1_1) {
        this();
        isNil = new Boolean(true);
    }


    public JavaLangException(final JavaLangString s) {
        super(s);
    }

}

