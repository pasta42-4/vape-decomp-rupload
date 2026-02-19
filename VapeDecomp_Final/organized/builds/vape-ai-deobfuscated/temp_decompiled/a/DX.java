/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.EI;
import a.Hc;
import a.O_;
import a.kX;

public class Dx
extends Hc {
    public int o() {
        return Dx.U.u().kv.R(this.H);
    }

    public static Object t(int n2, boolean bl2) {
        try {
            if (kX.C() >= kX.C) {
                return Dx.U.u().kv.k(n2);
            }
        }
        catch (O_ o_2) {
            throw Dx.a(o_2);
        }
        return Dx.U.u().kv.P(n2, bl2);
    }

    public void w(int n2, int n3, int n4, EI eI2) {
        block3: {
            block2: {
                try {
                    if (kX.C() < kX.C) break block2;
                    Dx.U.u().kv.O(this.H, n2, n3, n4, eI2.M(), false);
                    break block3;
                }
                catch (O_ o_2) {
                    throw Dx.a(o_2);
                }
            }
            Dx.U.u().kv.p(this.H, n2, n3, n4, eI2.M());
        }
    }

    public Dx(Object object) {
        super(object);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public char[] v() {
        return Dx.U.u().kv.W(this.H);
    }
}

