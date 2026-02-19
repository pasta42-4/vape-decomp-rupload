/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.GB;
import a.I0;
import a.O_;
import a.Rf;
import a.aV;
import java.nio.ByteBuffer;

public class c2
implements Rf {
    private String X;
    static Rf W;
    private int K;
    private I0 d;
    private boolean L;
    private int J;
    private int T;
    private float I;
    private int V;
    private float c;
    protected static GB n;
    private int N;
    private int y;

    @Override
    public void P() {
        try {
            if (W != this) {
                W = this;
                n.g(3553);
                n.F(this.V, this.K);
            }
        }
        catch (O_ o_2) {
            throw c2.a(o_2);
        }
    }

    private void L() {
        try {
            if (this.T != 0) {
                this.c = (float)this.J / (float)this.T;
            }
        }
        catch (O_ o_2) {
            throw c2.a(o_2);
        }
    }

    public static void T() {
        W = null;
        n.h(3553);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public void y(int n2) {
        this.y = n2;
        this.u();
    }

    @Override
    public int I() {
        return this.y;
    }

    public void e(int n2) {
        this.T = n2;
        this.L();
    }

    @Override
    public int k() {
        return this.J;
    }

    static {
        n = aV.Y();
    }

    private void u() {
        try {
            if (this.N != 0) {
                this.I = (float)this.y / (float)this.N;
            }
        }
        catch (O_ o_2) {
            throw c2.a(o_2);
        }
    }

    public void l(boolean bl2) {
        this.L = bl2;
    }

    public void g(int n2) {
        this.J = n2;
        this.L();
    }

    @Override
    public float n() {
        return this.c;
    }

    protected c2() {
    }

    public c2(String string, int n2, int n3) {
        this.V = n2;
        this.X = string;
        this.K = n3;
        W = this;
    }

    @Override
    public float A() {
        return this.I;
    }

    public void O(int n2, int n3, int n4, int n5, ByteBuffer byteBuffer) {
        this.d = new I0(this, null);
        I0.U(this.d, n2);
        I0.D(this.d, n3);
        I0.M(this.d, n4);
        I0.u(this.d, n5);
        I0.h(this.d, byteBuffer);
    }

    @Override
    public int G() {
        return this.N;
    }

    public void F(int n2) {
        this.N = n2;
        this.u();
    }

    @Override
    public int S() {
        return this.T;
    }
}

