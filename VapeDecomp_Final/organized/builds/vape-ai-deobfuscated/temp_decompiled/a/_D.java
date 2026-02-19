/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.cs;
import a.zK;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class _d
implements cs {
    protected byte[] i;
    protected String I;

    @Override
    public InputStream o(String string) {
        try {
            if (this.I.equals(string)) {
                return new ByteArrayInputStream(this.i);
            }
        }
        catch (O_ o_2) {
            throw _d.a(o_2);
        }
        return null;
    }

    public String toString() {
        return "byte[]:" + this.I;
    }

    public _d(String string, byte[] byArray) {
        this.I = string;
        this.i = byArray;
    }

    @Override
    public URL Y(String string) {
        if (this.I.equals(string)) {
            String string2 = string.replace('.', '/') + ".class";
            try {
                return new URL(null, "file:/ByteArrayClassPath/" + string2, new zK(this, null));
            }
            catch (MalformedURLException malformedURLException) {
                // empty catch block
            }
        }
        return null;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }
}

