/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.D0;
import a.Qg;
import a.Qh;
import a.cT;
import a.ht;

public abstract class zx
implements cT {
    protected final Qh y;
    protected boolean A = false;
    protected boolean V = false;
    protected float l = 0.0f;
    protected final Qg S;
    protected boolean U = false;
    protected int v = 0;
    protected final D0 o;
    protected boolean W = false;
    protected final Qh g;
    protected boolean d = false;
    private static ht[] s;
    protected boolean N = false;
    protected int G = 0;
    protected boolean n = false;
    protected boolean D = false;
    protected float x = 0.0f;
    protected boolean Y = false;

    public void J(boolean bl2) {
        this.W = bl2;
    }

    static {
        if (zx.q() == null) {
            zx.s(new ht[5]);
        }
    }

    public void b(boolean bl2) {
        this.V = bl2;
    }

    public boolean p() {
        return this.W;
    }

    public void t(boolean bl2) {
        this.d = bl2;
    }

    public void o(boolean bl2) {
        this.N = bl2;
    }

    public zx(Qh qh2, Qg qg2, Qh qh3, D0 d0) {
        this.y = qh2;
        this.S = qg2;
        this.g = qh3;
        this.o = d0;
    }

    public void V(boolean bl2) {
        this.n = bl2;
    }

    public int c() {
        return this.G;
    }

    public boolean G() {
        return this.V;
    }

    public static void s(ht[] htArray) {
        s = htArray;
    }

    public boolean z() {
        return this.U;
    }

    public float L() {
        return this.l;
    }

    public boolean D() {
        return this.N;
    }

    public float Q() {
        return this.x;
    }

    public boolean Y() {
        return this.D;
    }

    public boolean R() {
        return this.A;
    }

    public static ht[] q() {
        return s;
    }

    public int N() {
        return this.v;
    }

    public boolean A() {
        return this.Y;
    }

    public void e(boolean bl2) {
        this.A = bl2;
    }

    public boolean K() {
        return this.n;
    }

    public void I(boolean bl2) {
        this.U = bl2;
    }

    public boolean l() {
        return this.d;
    }
}

