/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.SE;

public class c {
    private static O_ a(O_ o_2) {
        return o_2;
    }

    public static void call(Object object) {
        try {
            if (SE.h == null) {
                return;
            }
        }
        catch (O_ o_2) {
            throw c.a(o_2);
        }
    }

    public static native void reg(Class var0, int var1);
}

