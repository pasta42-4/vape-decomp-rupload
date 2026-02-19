/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.eq;
import a.v;
import java.io.IOException;
import java.io.OutputStream;

public class q
extends v {
    public void e(int n2, int n3) throws IOException {
        this.k.write(n2);
        this.w(n3);
    }

    public void b(int n2, int n3, int n4) throws IOException {
        this.k.write(n2);
        this.k.write(n3);
        this.k.write(n4);
    }

    public void h(int n2) throws IOException {
        this.k.write(16);
        this.w(n2);
    }

    public void A(int n2) throws IOException {
        this.k.write(23);
        this.w(n2);
    }

    public void A(int n2, int n3, int n4) throws IOException {
        this.w(n2);
        this.w(n3);
        this.w(n4);
    }

    public void Z(int n2, int n3, int n4) throws IOException {
        this.k.write(n2);
        this.w(n3);
        this.k.write(n4);
    }

    public void N(int n2) throws IOException {
        this.k.write(22);
        this.k.write(n2);
    }

    public void m(int n2, int n3) throws IOException {
        this.k.write(n2);
        this.w(n3);
    }

    public void R(int n2) throws IOException {
        this.k.write(66);
        this.w(n2);
    }

    public void x(int n2, int n3) throws IOException {
        this.k.write(n2);
        this.k.write(n3);
    }

    public void x(int n2) throws IOException {
        this.k.write(n2);
    }

    public q(OutputStream outputStream, eq eq2) {
        super(outputStream, eq2);
    }

    public void W(int n2) throws IOException {
        this.k.write(n2);
    }

    public void h(int n2, int n3) throws IOException {
        this.k.write(n2);
        this.k.write(n3);
    }

    @Override
    public void U(int n2) throws IOException {
        super.U(n2);
    }
}

