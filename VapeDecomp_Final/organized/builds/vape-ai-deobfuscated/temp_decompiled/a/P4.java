/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Dp;
import a.Fm;
import a.KG;
import a.QF;
import a.kX;

@Deprecated
public class p4
extends KG {
    private final String J;
    private final QF a;
    private static final Fm r = new Fm();

    public p4(QF qF2, Object object) {
        this.a = qF2;
        if (kX.C() >= 35) {
            Dp dp = new Dp(object);
            this.J = dp.u().y();
        } else {
            this.J = (String)object;
        }
    }

    public static Fm getEventListeners() {
        return r;
    }

    @Override
    public Fm getListeners() {
        return r;
    }

    public QF getEntity() {
        return this.a;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }

    public String getName() {
        return this.J;
    }
}

