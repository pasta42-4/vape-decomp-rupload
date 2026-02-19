/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.GM;
import a.O_;
import a.On;
import a.W;
import a.WJ;
import a.a7;
import a.eq;
import a.ht;
import a.r8;
import a.r9;
import a.rB;
import a.rL;
import a.rb;
import a.rr;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class rq {
    private static ht[] L;

    public boolean p() {
        return false;
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    public static GM f(GM gM, GM gM2) throws WJ {
        block23: {
            block22: {
                block21: {
                    String string;
                    On on2;
                    try {
                        if (gM == gM2) {
                            return gM;
                        }
                    }
                    catch (WJ wJ2) {
                        throw rq.b(wJ2);
                    }
                    try {
                        if (!gM.p() || !gM2.p()) break block21;
                    }
                    catch (WJ wJ3) {
                        throw rq.b(wJ3);
                    }
                    GM gM3 = gM.r();
                    GM gM4 = gM2.r();
                    GM gM5 = rq.f(gM3, gM4);
                    try {
                        if (gM5 == gM3) {
                            return gM;
                        }
                    }
                    catch (WJ wJ4) {
                        throw rq.b(wJ4);
                    }
                    try {
                        if (gM5 == gM4) {
                            return gM2;
                        }
                    }
                    catch (WJ wJ5) {
                        throw rq.b(wJ5);
                    }
                    try {
                        on2 = gM.K();
                        string = gM5 == null ? "java.lang.Object" : gM5.H() + "[]";
                    }
                    catch (WJ wJ6) {
                        throw rq.b(wJ6);
                    }
                    return on2.g(string);
                }
                try {
                    try {
                        if (!gM.m() && !gM2.m()) break block22;
                    }
                    catch (WJ wJ7) {
                        throw rq.b(wJ7);
                    }
                    return null;
                }
                catch (WJ wJ8) {
                    throw rq.b(wJ8);
                }
            }
            try {
                try {
                    if (!gM.p() && !gM2.p()) break block23;
                }
                catch (WJ wJ9) {
                    throw rq.b(wJ9);
                }
                return gM.K().g("java.lang.Object");
            }
            catch (WJ wJ10) {
                throw rq.b(wJ10);
            }
        }
        return rq.l(gM, gM2);
    }

    protected rq() {
    }

    abstract String j(Set<rq> var1);

    public abstract String n();

    public abstract int C(eq var1);

    public abstract void e(String var1, On var2) throws a7;

    public static void g(rq rq2, rq rq3, On on2) throws a7 {
        block11: {
            block13: {
                block12: {
                    block10: {
                        try {
                            try {
                                if (!(rq2 instanceof r8) || rq3.d()) break block10;
                            }
                            catch (a7 a72) {
                                throw rq.b(a72);
                            }
                            ((r8)rq2).O(rb.s(rq3));
                        }
                        catch (a7 a73) {
                            throw rq.b(a73);
                        }
                    }
                    try {
                        try {
                            if (!(rq3 instanceof r8)) break block11;
                            if (!(rq2 instanceof r8)) break block12;
                        }
                        catch (a7 a74) {
                            throw rq.b(a74);
                        }
                        rL.B(rq2);
                        break block11;
                    }
                    catch (a7 a75) {
                        throw rq.b(a75);
                    }
                }
                try {
                    if (!(rq2 instanceof r9)) break block13;
                    if (rq2.d()) break block11;
                }
                catch (a7 a76) {
                    throw rq.b(a76);
                }
                String string = rL.S(rq2.n());
                rq3.e(string, on2);
                break block11;
            }
            throw new a7("bad AASTORE: " + rq2);
        }
    }

    public abstract rr Z();

    public boolean d() {
        return false;
    }

    public int N(List<rq> list, int n2, On on2) throws WJ {
        return n2;
    }

    public void j(int n2) {
    }

    public rq c() {
        return new rB(this);
    }

    public abstract int G();

    public abstract boolean n();

    public static rq[] i(int n2) {
        rq[] rqArray = new rq[n2];
        try {
            for (int i10 = 0; i10 < n2; ++i10) {
                rqArray[i10] = W.C;
            }
        }
        catch (O_ o_2) {
            throw rq.b(o_2);
        }
        return rqArray;
    }

    public abstract boolean o(rq var1);

    public static GM l(GM gM, GM gM2) throws WJ {
        GM gM3;
        GM gM4 = gM;
        GM gM5 = gM3 = gM2;
        GM gM6 = gM4;
        while (true) {
            block12: {
                try {
                    try {
                        if (!rq.K(gM4, gM3) || gM4.G() == null) break block12;
                    }
                    catch (WJ wJ2) {
                        throw rq.b(wJ2);
                    }
                    return gM4;
                }
                catch (WJ wJ3) {
                    throw rq.b(wJ3);
                }
            }
            GM gM7 = gM4.G();
            GM gM8 = gM3.G();
            if (gM8 == null) {
                gM3 = gM5;
                break;
            }
            if (gM7 == null) {
                gM4 = gM6;
                gM6 = gM5;
                gM5 = gM4;
                gM4 = gM3;
                gM3 = gM5;
                break;
            }
            gM4 = gM7;
            gM3 = gM8;
        }
        while (true) {
            gM4 = gM4.G();
            try {
                if (gM4 == null) {
                    break;
                }
            }
            catch (WJ wJ4) {
                throw rq.b(wJ4);
            }
            gM6 = gM6.G();
        }
        gM4 = gM6;
        while (!rq.K(gM4, gM3)) {
            gM4 = gM4.G();
            gM3 = gM3.G();
        }
        return gM4;
    }

    public static void x(ht[] htArray) {
        L = htArray;
    }

    static boolean K(GM gM, GM gM2) {
        boolean bl2;
        block10: {
            block9: {
                try {
                    block8: {
                        try {
                            try {
                                try {
                                    if (gM == gM2) break block8;
                                    if (gM == null) break block9;
                                }
                                catch (O_ o_2) {
                                    throw rq.b(o_2);
                                }
                                if (gM2 == null) break block9;
                            }
                            catch (O_ o_3) {
                                throw rq.b(o_3);
                            }
                            if (!gM.H().equals(gM2.H())) break block9;
                        }
                        catch (O_ o_4) {
                            throw rq.b(o_4);
                        }
                    }
                    bl2 = true;
                    break block10;
                }
                catch (O_ o_5) {
                    throw rq.b(o_5);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public static ht[] v() {
        return L;
    }

    public String toString() {
        return super.toString() + "(" + this.j(new HashSet<rq>()) + ")";
    }

    public abstract rq r(int var1) throws WJ;

    protected rB I(int n2) {
        return null;
    }

    static {
        if (rq.v() == null) {
            rq.x(new ht[4]);
        }
    }
}

