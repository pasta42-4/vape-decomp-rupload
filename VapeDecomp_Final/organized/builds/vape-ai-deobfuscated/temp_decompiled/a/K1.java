/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.WJ;
import a.cs;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.URL;

public class k1
implements cs {
    private Reference<ClassLoader> A;

    public String toString() {
        String string;
        try {
            string = this.A.get() == null ? "<null>" : this.A.get().toString();
        }
        catch (O_ o_2) {
            throw k1.a(o_2);
        }
        return string;
    }

    @Override
    public InputStream o(String string) throws WJ {
        String string2 = string.replace('.', '/') + ".class";
        ClassLoader classLoader = this.A.get();
        try {
            if (classLoader == null) {
                return null;
            }
        }
        catch (WJ wJ2) {
            throw k1.a(wJ2);
        }
        InputStream inputStream = classLoader.getResourceAsStream(string2);
        return inputStream;
    }

    @Override
    public URL Y(String string) {
        String string2 = string.replace('.', '/') + ".class";
        ClassLoader classLoader = this.A.get();
        try {
            if (classLoader == null) {
                return null;
            }
        }
        catch (O_ o_2) {
            throw k1.a(o_2);
        }
        URL uRL = classLoader.getResource(string2);
        return uRL;
    }

    public k1(ClassLoader classLoader) {
        this.A = new WeakReference<ClassLoader>(classLoader);
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

