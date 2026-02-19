/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Dn;
import a.F8;
import a.KG;
import a.KP;
import a.O_;

public abstract class pz
extends KG {
    private final float J;
    private final Dn l;
    private static int[] u;

    public float getTicks() {
        return this.J;
    }

    public static void K(int[] nArray) {
        u = nArray;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public Dn getMatrixStack() {
        return this.l;
    }

    pz(Dn dn, float f10) {
        this.l = dn;
        this.J = f10;
    }

    static {
        if (pz.g() == null) {
            pz.K(new int[3]);
        }
    }

    @Override
    public boolean fire() {
        boolean bl2 = super.fire();
        try {
            if (F8.U()) {
                KP.x().F(this.J);
            }
        }
        catch (O_ o_2) {
            throw pz.a(o_2);
        }
        return bl2;
    }

    public static int[] g() {
        return u;
    }
}

