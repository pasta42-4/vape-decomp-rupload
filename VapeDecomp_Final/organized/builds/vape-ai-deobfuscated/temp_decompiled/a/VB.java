/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.eM;
import a.v2;

public class vb
extends v2 {
    private static String g;

    static {
        if (vb.p() != null) {
            vb.i("ogCPyb");
        }
    }

    public static String p() {
        return g;
    }

    public vb() {
        super(eM.Vh);
    }

    public static void i(String string) {
        g = string;
    }
}

