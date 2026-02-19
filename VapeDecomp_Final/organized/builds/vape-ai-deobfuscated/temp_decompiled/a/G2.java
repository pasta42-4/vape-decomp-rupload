/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.EP;
import a.F7;
import a.Fp;
import a.KB;
import a.OY;
import a.O_;
import a.SE;
import a.aH;
import a.pF;
import a.sM;

public class G2
implements sM {
    private boolean P;
    private static int[] g;
    private aH s;
    public static G2 c;

    private G2() {
        c = this;
    }

    public static int[] p() {
        return g;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @OY
    public void g(KB var1_1) {
        try {
            if (this.s == null) return;
            ** GOTO lbl8
        }
        catch (NullPointerException v0) {
            try {
                throw G2.a(v0);
lbl8:
                // 2 sources

                if (EP.U().r() == false) return;
            }
            catch (O_ v1) {
                throw G2.a(v1);
            }
            {
                try {}
                catch (NullPointerException var2_2) {
                    SE.W(var2_2);
                    return;
                }
            }
        }
        this.s.V(var1_1);
    }

    public boolean H() {
        boolean bl2;
        block5: {
            block4: {
                try {
                    try {
                        if (this.s == null || this.s.S()) break block4;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw G2.a(nullPointerException);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (NullPointerException nullPointerException) {
                    throw G2.a(nullPointerException);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public void N(aH aH2) {
        this.s = aH2;
    }

    @OY(b=F7.HIGH)
    public void F(pF pF2) {
        block9: {
            block11: {
                block10: {
                    block8: {
                        try {
                            try {
                                if (this.s != null || !EP.U().r()) break block8;
                            }
                            catch (NullPointerException nullPointerException) {
                                throw G2.a(nullPointerException);
                            }
                            return;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw G2.a(nullPointerException);
                        }
                    }
                    try {
                        try {
                            this.s.Y();
                            if (!this.s.S()) break block9;
                            if (!this.s.M()) break block10;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw G2.a(nullPointerException);
                        }
                        Fp.A();
                        break block11;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw G2.a(nullPointerException);
                    }
                }
                Fp.N();
            }
            this.s = null;
        }
    }

    public void I(aH aH2) {
        block4: {
            try {
                try {
                    if (this.s == null || !this.s.equals(aH2)) break block4;
                }
                catch (NullPointerException nullPointerException) {
                    throw G2.a(nullPointerException);
                }
                this.s.g(true);
            }
            catch (NullPointerException nullPointerException) {
                throw G2.a(nullPointerException);
            }
        }
    }

    static {
        c = new G2();
        G2.m(null);
    }

    public aH k() {
        return this.s;
    }

    public static void m(int[] nArray) {
        g = nArray;
    }
}

