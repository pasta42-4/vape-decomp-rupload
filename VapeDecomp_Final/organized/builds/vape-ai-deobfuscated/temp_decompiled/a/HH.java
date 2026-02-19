/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.hQ;
import a.ht;
import a.rn;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class hh
extends hQ {
    private rn L;
    private boolean b;
    private boolean V;

    public boolean V() {
        return this.b;
    }

    @Override
    public double e() {
        return 110.0;
    }

    public hh() {
        this.L = new rn(0.15, hh.M.S, hh.M.Z);
    }

    public boolean h() {
        return this.V;
    }

    @Override
    public void d() {
        block4: {
            try {
                try {
                    if (!this.b || this.s()) break block4;
                }
                catch (O_ o_2) {
                    throw hh.a(o_2);
                }
                this.L.c();
                this.b = false;
            }
            catch (O_ o_3) {
                throw hh.a(o_3);
            }
        }
    }

    public void g(boolean bl2) {
        if (bl2) {
            for (ht ht2 : this.F().A()) {
                try {
                    if (!(ht2 instanceof hh)) continue;
                    ((hh)ht2).g(false);
                }
                catch (O_ o_2) {
                    throw hh.a(o_2);
                }
            }
        }
        this.V = bl2;
    }

    @Override
    public void U() {
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public rn z() {
        return this.L;
    }

    @Override
    public void g() {
        try {
            if (!this.b) {
                this.L.c();
            }
        }
        catch (O_ o_2) {
            throw hh.a(o_2);
        }
        this.b = true;
    }

    @Override
    public double z() {
        return 25.0;
    }
}

