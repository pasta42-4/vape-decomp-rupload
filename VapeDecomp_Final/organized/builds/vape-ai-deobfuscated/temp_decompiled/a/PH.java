/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Fm;
import a.KG;
import a.O_;
import a.QF;

public class ph
extends KG {
    private final Object c;
    private static final Fm E = new Fm();
    private QF u = null;

    public static Fm getEventListeners() {
        return E;
    }

    public QF getEntity() {
        try {
            if (this.u == null) {
                this.u = new QF(this.c);
            }
        }
        catch (O_ o_2) {
            throw ph.a(o_2);
        }
        return this.u;
    }

    public ph(Object object) {
        this.c = object;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public Fm getListeners() {
        return E;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }
}

