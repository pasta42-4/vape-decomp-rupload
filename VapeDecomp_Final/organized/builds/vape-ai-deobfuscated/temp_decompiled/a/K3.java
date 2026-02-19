/*
 * Decompiled with CFR 0.152.
 */
package a;

import a._s;
import a.eq;
import a.kc;
import a.v;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

class k3
extends kc {
    Map<String, String> V;
    eq A;
    v t;
    ByteArrayOutputStream d = new ByteArrayOutputStream();
    eq z;

    @Override
    void M(int n2, int n3) throws Exception {
        this.t.s(n2, this.s(n3));
        super.M(n2, n3);
    }

    k3(byte[] byArray, eq eq2, eq eq3, Map<String, String> map, boolean bl2) {
        super(byArray);
        if (bl2) {
            this.t = new v(this.d, eq3);
        }
        this.z = eq2;
        this.A = eq3;
        this.V = map;
    }

    byte[] S() throws IOException {
        this.t.N();
        return this.d.toByteArray();
    }

    @Override
    int t(int n2, int n3) throws Exception {
        this.t.v(this.s(n3));
        return super.t(n2, n3);
    }

    @Override
    void L(int n2, int n3) throws Exception {
        this.t.z(n2);
        super.L(n2, n3);
    }

    @Override
    void R(int n2, int n3, int n4) throws Exception {
        this.t.X(this.R(n3), this.s(n4));
        super.R(n2, n3, n4);
    }

    @Override
    int m(int n2, int n3) throws Exception {
        this.t.c(n3);
        return super.m(n2, n3);
    }

    @Override
    int j(int n2, int n3) throws Exception {
        this.t.U(n3);
        return super.j(n2, n3);
    }

    @Override
    int N(int n2, int n3, int n4) throws Exception {
        this.t.P(this.R(n3), n4);
        return super.N(n2, n3, n4);
    }

    k3(byte[] byArray, eq eq2, eq eq3, Map<String, String> map) {
        this(byArray, eq2, eq3, map, true);
    }

    int s(int n2) {
        return this.z.X(n2, this.A, this.V);
    }

    int R(int n2) {
        String string = this.z.Z(n2);
        String string2 = _s.z(string, this.V);
        return this.A.D(string2);
    }

    @Override
    void d(int n2, int n3) throws Exception {
        this.t.Z(this.R(n3));
        super.d(n2, n3);
    }

    @Override
    int W(int n2) throws Exception {
        this.t.R();
        return super.W(n2);
    }
}

