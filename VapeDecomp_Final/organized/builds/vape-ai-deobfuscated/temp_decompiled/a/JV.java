/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.ey;
import a.xi;

public class jv
extends xi {
    private String t;
    private Class A;
    private ey X;
    private boolean o;
    private static int z;

    public boolean I() {
        return this.o;
    }

    public static void l(int n2) {
        z = n2;
    }

    public jv(String string, ey ey2, String string2, Class clazz, int n2) {
        super(string, n2);
        this.X = ey2;
        this.t = string2;
        this.A = clazz;
    }

    @Override
    public void t() {
    }

    public Class n() {
        return this.A;
    }

    private static O_ b(O_ o_2) {
        return o_2;
    }

    public jv(String string, ey ey2, String string2) {
        this(string, ey2, string2, null);
    }

    public void I(boolean bl2) {
        this.o = bl2;
    }

    public static int B() {
        return z;
    }

    public static int P() {
        int n2 = jv.B();
        try {
            if (n2 == 0) {
                return 23;
            }
        }
        catch (O_ o_2) {
            throw jv.b(o_2);
        }
        return 0;
    }

    public jv(String string, ey ey2, String string2, int n2) {
        this(string, ey2, string2, null, n2);
    }

    public ey r() {
        return this.X;
    }

    static {
        if (jv.P() != 0) {
            jv.l(114);
        }
    }

    public String R() {
        return this.t;
    }

    public jv(String string, ey ey2, String string2, Class clazz) {
        this(string, ey2, string2, clazz, 0);
    }
}

