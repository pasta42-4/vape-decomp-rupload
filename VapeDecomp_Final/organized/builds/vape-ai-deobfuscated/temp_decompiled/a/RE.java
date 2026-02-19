/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.ht;
import a.sy;
import a.tO;
import java.util.Objects;

public class re {
    private final double Q;
    private final double A;
    private static ht[] e;
    private final double u;

    public int W() {
        return sy.Q(this.A);
    }

    public double c() {
        return this.u;
    }

    public double E() {
        return this.Q;
    }

    public static ht[] D() {
        return e;
    }

    public boolean equals(Object object) {
        boolean bl2;
        block15: {
            block14: {
                block13: {
                    try {
                        if (this == object) {
                            return true;
                        }
                    }
                    catch (O_ o_2) {
                        throw re.a(o_2);
                    }
                    try {
                        try {
                            if (object != null && this.getClass() == object.getClass()) break block13;
                        }
                        catch (O_ o_3) {
                            throw re.a(o_3);
                        }
                        return false;
                    }
                    catch (O_ o_4) {
                        throw re.a(o_4);
                    }
                }
                re re2 = (re)object;
                try {
                    try {
                        try {
                            if (this.A != re2.A || this.Q != re2.Q) break block14;
                        }
                        catch (O_ o_5) {
                            throw re.a(o_5);
                        }
                        if (this.u != re2.u) break block14;
                    }
                    catch (O_ o_6) {
                        throw re.a(o_6);
                    }
                    bl2 = true;
                    break block15;
                }
                catch (O_ o_7) {
                    throw re.a(o_7);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public re(int n2, int n3, int n4) {
        this.A = n2;
        this.Q = n3;
        this.u = n4;
    }

    public double C() {
        double d2 = tO.n();
        return this.u - d2;
    }

    public double Z() {
        return this.A;
    }

    static {
        if (re.D() != null) {
            re.i(new ht[5]);
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public int H() {
        return sy.Q(this.u);
    }

    public double e() {
        double d2 = tO.b();
        return this.A - d2;
    }

    public double R() {
        double d2 = tO.S();
        return this.Q - d2;
    }

    public int hashCode() {
        return Objects.hash(this.A, this.Q, this.u);
    }

    public int n() {
        return sy.Q(this.Q);
    }

    public re(double d2, double d3, double d4) {
        this.A = d2;
        this.Q = d3;
        this.u = d4;
    }

    public static void i(ht[] htArray) {
        e = htArray;
    }
}

