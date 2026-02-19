/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.BS;
import a.BX;
import a.O_;
import a.k0;
import a.rM;

public class sa {
    private static int[] t;
    private rM L;
    private String g;

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public static void s(int[] nArray) {
        t = nArray;
    }

    static {
        if (sa.q() != null) {
            sa.s(new int[4]);
        }
    }

    public rM c(String string) {
        try {
            this.L = new k0().a(string);
            if (this.L != null) {
                this.g = string;
            }
        }
        catch (O_ o_2) {
            throw sa.a(o_2);
        }
        return this.L;
    }

    public rM J() {
        return this.L;
    }

    public BX V() {
        try {
            if (this.g == null) {
                return null;
            }
        }
        catch (O_ o_2) {
            throw sa.a(o_2);
        }
        return new BS().m(this.g);
    }

    public static int[] q() {
        return t;
    }
}

