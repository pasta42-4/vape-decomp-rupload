/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.WJ;
import a.cs;
import java.io.InputStream;
import java.net.URL;

public class ly
implements cs {
    private Class<?> Q;

    public ly(Class<?> clazz) {
        this.Q = clazz;
    }

    @Override
    public URL Y(String string) {
        String string2 = '/' + string.replace('.', '/') + ".class";
        return this.Q.getResource(string2);
    }

    ly() {
        this(Object.class);
    }

    public String toString() {
        return this.Q.getName() + ".class";
    }

    @Override
    public InputStream o(String string) throws WJ {
        String string2 = '/' + string.replace('.', '/') + ".class";
        return this.Q.getResourceAsStream(string2);
    }
}

