/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.F8;
import a.Hj;
import a.O_;
import a.WC;
import a.z3;

public class Ne {
    public static WC h;

    static {
        try {
            h = F8.U() ? new z3() : new Hj();
        }
        catch (O_ o_2) {
            throw Ne.a(o_2);
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }
}

