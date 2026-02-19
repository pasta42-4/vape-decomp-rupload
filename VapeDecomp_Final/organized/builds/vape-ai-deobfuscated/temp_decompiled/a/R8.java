/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.eq;
import a.rq;

public abstract class r8
extends rq {
    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public int C(eq eq2) {
        return eq2.l(this.n());
    }

    @Override
    public int G() {
        return 7;
    }

    @Override
    public boolean o(rq rq2) {
        try {
            if (rq2.p()) {
                return rq2.o(this);
            }
        }
        catch (O_ o_2) {
            throw r8.a(o_2);
        }
        return this.n().equals(rq2.n());
    }

    public abstract void O(rq var1);
}

