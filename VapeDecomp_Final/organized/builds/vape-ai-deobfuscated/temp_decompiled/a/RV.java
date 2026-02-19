/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.O_;
import a.RH;
import a.i3;
import a.iz;
import a.wb;
import a.wr;
import java.awt.Point;
import java.util.concurrent.atomic.AtomicBoolean;

class rv
implements i3 {
    final wr V;
    final AtomicBoolean m;
    final RH X;
    final wb S;

    @Override
    public void B(Point point, iz iz2) {
        try {
            if (this.m.get()) {
                return;
            }
        }
        catch (O_ o_2) {
            throw rv.a(o_2);
        }
        this.m.set(true);
        Ao.st.execute(() -> this.lambda$onClick$0(this.V, this.X, this.m));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void lambda$onClick$0(wr wr2, RH rH2, AtomicBoolean atomicBoolean) {
        try {
            wb.c(this.S).J(wr2);
            wb.f(this.S).u(rH2);
        }
        finally {
            atomicBoolean.set(false);
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    rv(wb wb2, AtomicBoolean atomicBoolean, wr wr2, RH rH2) {
        this.S = wb2;
        this.m = atomicBoolean;
        this.V = wr2;
        this.X = rH2;
    }
}

