/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.J4;
import a.O_;
import a.Z8;
import a.ht;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class cq {
    private int Y;
    private int H;
    private Z8 g;
    private int t;
    private J4 h = J4.NONE;
    private int O;
    private boolean E;
    private boolean k = true;
    private boolean u;
    private static ht[] A;
    private boolean M;

    public void r(int n2) {
        this.Y = n2;
        this.g = Z8.OFFSET;
    }

    public void m(J4 j42) {
        this.h = j42;
    }

    public void e(boolean bl2) {
        this.k = bl2;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public cq() {
        this.g = Z8.NONE;
    }

    public int a() {
        return this.O;
    }

    public boolean V() {
        return this.k;
    }

    public static void h(ht[] htArray) {
        A = htArray;
    }

    public Z8 y() {
        return this.g;
    }

    public int h() {
        return this.Y;
    }

    public boolean X() {
        return this.u;
    }

    public void w(int n2) {
        this.O = n2;
    }

    public void e(int n2) {
        this.H = n2;
    }

    public static ht[] C() {
        return A;
    }

    public void y(int n2) {
        this.t = n2;
        this.g = Z8.OFFSET;
    }

    public void s(boolean bl2) {
        this.E = bl2;
    }

    public int K() {
        return this.t;
    }

    public int t() {
        return this.H;
    }

    public boolean u() {
        return this.E;
    }

    public J4 b() {
        return this.h;
    }

    static {
        if (cq.C() == null) {
            cq.h(new ht[1]);
        }
    }

    public boolean P() {
        boolean bl2;
        try {
            bl2 = this.g != Z8.NONE;
        }
        catch (O_ o_2) {
            throw cq.a(o_2);
        }
        return bl2;
    }

    public void u(boolean bl2) {
        this.M = bl2;
    }

    public boolean t() {
        return this.M;
    }

    public void C(boolean bl2) {
        this.u = bl2;
    }

    public void S(Z8 z82) {
        this.g = z82;
    }
}

