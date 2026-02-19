/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Fm;
import a.KG;
import a.O_;
import a.SE;
import a.jP;
import a.kX;
import a.op;

public class pg
extends KG {
    private static final Fm e = new Fm();

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public static Fm getEventListeners() {
        return e;
    }

    @Override
    public boolean fire() {
        jP jP2 = SE.h.U().K(jP.class);
        this.setCanceled(jP2.Z());
        return super.fire();
    }

    public pg(Object object, int n2, int n3, Object object2) {
        jP jP2 = SE.h.U().K(jP.class);
        jP2.Q(new op(object));
    }

    @Override
    public Fm getListeners() {
        return e;
    }

    public pg(Object object, Object object2) {
        block3: {
            jP jP2;
            block2: {
                jP2 = SE.h.U().K(jP.class);
                try {
                    if (kX.C() < 35) break block2;
                    jP2.Q(new op(object2));
                    break block3;
                }
                catch (O_ o_2) {
                    throw pg.a(o_2);
                }
            }
            jP2.Q(new op(object));
        }
    }
}

