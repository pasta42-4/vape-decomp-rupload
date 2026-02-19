/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.E1;
import a.Ej;
import a.Fm;
import a.KG;
import a.Na;
import a.O_;
import a.oB;
import a.oD;
import a.oE;
import a.oU;
import a.ob;

public class pr
extends KG {
    private final Object I;
    private E1 m = null;
    private final Object D;
    private ob y = null;
    private ob e = null;
    private static final Fm T = new Fm();
    private Ej u = null;

    public ob getDisplayName() {
        try {
            if (this.e != null) {
                return this.e;
            }
        }
        catch (O_ o_2) {
            throw pr.a(o_2);
        }
        return this.getVanillaDisplayName();
    }

    public static Fm getEventListeners() {
        return T;
    }

    public E1 getGuiPlayerTabOverlay() {
        try {
            if (this.m == null) {
                this.m = new E1(this.D);
            }
        }
        catch (O_ o_2) {
            throw pr.a(o_2);
        }
        return this.m;
    }

    private ob getVanillaDisplayName() {
        block10: {
            try {
                if (this.y != null) {
                    return this.y;
                }
            }
            catch (O_ o_2) {
                throw pr.a(o_2);
            }
            Ej ej2 = this.getNetworkPlayerInfo();
            ob ob2 = ej2.w();
            E1 e12 = this.getGuiPlayerTabOverlay();
            if (ob2.r()) {
                oE oE2;
                block9: {
                    oE2 = ob2.Q();
                    try {
                        if (!Na.MC_1_20_6.H()) break block9;
                        this.y = e12.A(ej2, new oB(oE2.M()));
                        break block10;
                    }
                    catch (O_ o_3) {
                        throw pr.a(o_3);
                    }
                }
                this.y = e12.y(ej2, oE2);
            } else {
                oD oD2 = ej2.a();
                String string = ej2.B().U();
                if (Na.MC_1_20_6.H()) {
                    oB oB2 = ob.j(string);
                    oB oB3 = oD.P(oD2, oB2);
                    this.y = e12.A(ej2, oB3);
                } else {
                    oU oU2 = oU.Y(string);
                    oE oE3 = oD.b(oD2, oU2);
                    this.y = e12.y(ej2, oE3);
                }
            }
        }
        return this.y;
    }

    public pr(Object object, Object object2) {
        this.D = object;
        this.I = object2;
    }

    public Ej getNetworkPlayerInfo() {
        try {
            if (this.u == null) {
                this.u = new Ej(this.I);
            }
        }
        catch (O_ o_2) {
            throw pr.a(o_2);
        }
        return this.u;
    }

    public void setDisplayName(ob ob2) {
        this.e = ob2;
        this.setCanceled(true);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public Fm getListeners() {
        return T;
    }

    public Object getDisplayNameInstance() {
        return this.getDisplayName().M();
    }

    @Override
    public boolean fire() {
        return super.fire();
    }
}

