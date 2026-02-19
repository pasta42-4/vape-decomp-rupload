/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Hp;
import a.O_;
import a.Qh;
import a.ob;
import a.pl;
import a.vF;

public class hv
implements Hp {
    private final Object X;
    private ob Y;
    public static boolean f = false;

    private ob grabDisplayName(Qh qh2) {
        f = true;
        ob ob2 = vF.m(qh2);
        f = false;
        return ob2;
    }

    public Object getRawDisplayName() {
        return this.Y.M();
    }

    @Override
    public boolean fire() {
        block6: {
            Qh qh2;
            block5: {
                try {
                    if (f) {
                        f = false;
                        return false;
                    }
                }
                catch (O_ o_2) {
                    throw hv.a(o_2);
                }
                qh2 = new Qh(this.X);
                ob ob2 = vF.i(qh2);
                try {
                    if (ob2 == null) break block5;
                    this.Y = ob2;
                    break block6;
                }
                catch (O_ o_3) {
                    throw hv.a(o_3);
                }
            }
            ob ob3 = this.grabDisplayName(qh2);
            this.Y = new ob(ob3);
            pl pl2 = new pl(qh2, this.Y);
            pl2.fire();
            this.Y = pl2.getDisplayName();
            vF.U(qh2, this.Y);
        }
        return true;
    }

    public hv(Object object) {
        this.X = object;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public ob getDisplayName() {
        return this.Y;
    }
}

