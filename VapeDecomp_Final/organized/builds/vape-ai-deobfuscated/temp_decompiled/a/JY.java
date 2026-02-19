/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Gw;
import a.O_;
import a.ja;

class jy
extends ja {
    boolean g;
    final Gw F;

    @Override
    public void O() {
        try {
            if (this.g) {
                return;
            }
        }
        catch (O_ o_2) {
            throw jy.a(o_2);
        }
        this.g = true;
    }

    jy(Gw gw, Object object, String string, String string2) {
        this.F = gw;
        super(object, string, string2);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }
}

