/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.CT;
import a.O_;
import a.i3;
import a.iz;
import a.ym;
import java.awt.Point;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

class he
implements i3 {
    final AtomicBoolean l;
    final ym F;
    final Consumer i;

    @Override
    public void B(Point point, iz iz2) {
        for (CT cT2 : ym.B(this.F)) {
            block5: {
                try {
                    try {
                        if (!cT2.s()) continue;
                        if (!this.l.get()) break block5;
                    }
                    catch (O_ o_2) {
                        throw he.a(o_2);
                    }
                    return;
                }
                catch (O_ o_3) {
                    throw he.a(o_3);
                }
            }
            this.l.set(true);
            Ao.st.execute(() -> this.lambda$onClick$0(cT2, this.i, this.l));
            return;
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    he(ym ym2, AtomicBoolean atomicBoolean, Consumer consumer) {
        this.F = ym2;
        this.l = atomicBoolean;
        this.i = consumer;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void lambda$onClick$0(CT cT2, Consumer consumer, AtomicBoolean atomicBoolean) {
        try {
            this.F.i(cT2);
            consumer.accept(cT2);
        }
        finally {
            atomicBoolean.set(false);
        }
    }
}

