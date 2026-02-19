/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.F8;
import a.IG;
import a.O_;
import a.Sz;
import a.ht;
import org.jetbrains.annotations.Nullable;

class fc
extends ht {
    @Nullable
    private IG V;

    public fc(@Nullable IG iG2) {
        this.V = iG2;
    }

    public void A(@Nullable IG iG2) {
        this.V = iG2;
    }

    @Override
    public void G() {
        try {
            if (this.s()) {
                F8.A(this.G(), this.W(), this.w(), this.b(), fc.M.S);
            }
        }
        catch (O_ o_2) {
            throw fc.a(o_2);
        }
    }

    public fc() {
    }

    @Override
    public void Z(Sz sz2) {
        IG iG2 = this.V;
        try {
            if (iG2 != null) {
                iG2.R();
            }
        }
        catch (O_ o_2) {
            throw fc.a(o_2);
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Nullable
    public IG L() {
        return this.V;
    }
}

