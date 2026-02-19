/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.E;
import a.EP;
import a.O_;
import a.Qg;

public class t
extends E {
    private boolean C = false;

    @Override
    public void G() {
        float f10;
        Qg qg2 = EP.U();
        try {
            this.A(qg2);
            this.Z = qg2.q() + 180.0f;
            t t10 = this;
            f10 = this.C ? 0.0f : -qg2.S();
        }
        catch (O_ o_2) {
            throw t.a(o_2);
        }
        t10.Q = f10;
        super.G();
    }

    public t() {
        super(true);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public void z(boolean bl2) {
        this.C = bl2;
    }
}

