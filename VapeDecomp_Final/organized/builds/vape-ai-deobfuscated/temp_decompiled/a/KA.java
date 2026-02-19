/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.Ky;
import a.O_;
import a.d;
import java.util.HashMap;

public class ka {
    private HashMap<Integer, Boolean> A = new HashMap();
    private int E;
    private long h = System.nanoTime();
    private int g;
    private int b;
    private boolean B;
    private boolean R;
    private int Y;

    public boolean q(int n2) {
        return this.A.getOrDefault(n2, false);
    }

    public long h() {
        return this.h;
    }

    public int C() {
        return this.Y;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public boolean b(int n2) {
        return this.A.getOrDefault(n2, false);
    }

    public boolean S(int n2, int n3) {
        try {
            this.b = n2;
            this.Y = n3;
            if (!Ao.K.P) {
                d.handleMouseInput(null);
            }
        }
        catch (O_ o_2) {
            throw ka.a(o_2);
        }
        return false;
    }

    public int F() {
        int n2 = this.g;
        return n2;
    }

    public boolean B() {
        return this.R;
    }

    public void H() {
        this.g = 0;
    }

    public boolean g(int n2, boolean bl2) {
        boolean bl3 = this.A.getOrDefault(n2, false);
        boolean bl4 = false;
        if (bl3 != bl2) {
            bl4 = this.f(n2, bl2);
        }
        this.A.put(n2, bl2);
        return bl4;
    }

    public boolean G(int n2) {
        try {
            if (!Ao.K.P) {
                this.g = n2;
                return true;
            }
        }
        catch (O_ o_2) {
            throw ka.a(o_2);
        }
        return false;
    }

    public boolean J() {
        return this.B;
    }

    private boolean f(int n2, boolean bl2) {
        block4: {
            block5: {
                try {
                    try {
                        this.h = System.nanoTime();
                        this.R = bl2;
                        this.E = n2;
                        if (Ao.K.P) break block4;
                        if (!bl2) break block5;
                    }
                    catch (O_ o_2) {
                        throw ka.a(o_2);
                    }
                    d.mouseClicked(null, this.b, this.Y, n2);
                }
                catch (O_ o_3) {
                    throw ka.a(o_3);
                }
            }
            this.B = true;
            return true;
        }
        return new Ky(n2, bl2).fire();
    }

    public int b() {
        return this.E;
    }

    public void Q() {
    }

    public int v() {
        return this.b;
    }
}

