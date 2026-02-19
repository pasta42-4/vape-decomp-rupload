/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.eq;
import a.r9;
import a.rB;
import a.rY;
import a.rq;
import java.util.Set;

public class r1
extends r9 {
    int G;
    boolean M;

    @Override
    public void j(int n2) {
        try {
            if (n2 == this.G) {
                this.M = true;
            }
        }
        catch (O_ o_2) {
            throw r1.a(o_2);
        }
    }

    @Override
    public int C(eq eq2) {
        return this.G;
    }

    @Override
    public rq c() {
        try {
            if (this.M) {
                return new rB(new r9(this.n()));
            }
        }
        catch (O_ o_2) {
            throw r1.a(o_2);
        }
        return new rY(this.d());
    }

    public int F() {
        return this.G;
    }

    @Override
    public int G() {
        return 8;
    }

    r1(int n2, String string) {
        super(string);
        this.G = n2;
        this.M = false;
    }

    @Override
    String j(Set<rq> set) {
        return this.n() + "," + this.G;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public boolean o(rq rq2) {
        if (rq2 instanceof r1) {
            boolean bl2;
            block6: {
                block5: {
                    r1 r12 = (r1)rq2;
                    try {
                        try {
                            if (this.G != r12.G || !this.n().equals(r12.n())) break block5;
                        }
                        catch (O_ o_2) {
                            throw r1.a(o_2);
                        }
                        bl2 = true;
                        break block6;
                    }
                    catch (O_ o_3) {
                        throw r1.a(o_3);
                    }
                }
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public r1 d() {
        return new r1(this.G, this.n());
    }

    @Override
    public boolean p() {
        return true;
    }
}

