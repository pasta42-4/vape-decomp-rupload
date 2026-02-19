/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.TF;
import a.eq;
import java.io.IOException;
import java.io.OutputStream;

public class v {
    private eq y;
    protected OutputStream k;

    public void P(int n2, int n3) throws IOException {
        this.w(n2);
        this.w(n3);
    }

    public void z(int n2) throws IOException {
        this.k.write(n2);
    }

    public void v(int n2) throws IOException {
        this.w(n2);
    }

    public v(OutputStream outputStream, eq eq2) {
        this.k = outputStream;
        this.y = eq2;
    }

    public void s(int n2, int n3) throws IOException {
        this.k.write(n2);
        this.w(n3);
    }

    public void U(int n2) throws IOException {
        this.w(n2);
    }

    public void X(int n2, int n3) throws IOException {
        this.k.write(101);
        this.w(n2);
        this.w(n3);
    }

    public void c(int n2) throws IOException {
        this.k.write(91);
        this.w(n2);
    }

    public void R() throws IOException {
        this.k.write(64);
    }

    public void N() throws IOException {
        this.k.close();
    }

    protected void w(int n2) throws IOException {
        byte[] byArray = new byte[2];
        TF.e(n2, byArray, 0);
        this.k.write(byArray);
    }

    public void Z(int n2) throws IOException {
        this.k.write(99);
        this.w(n2);
    }
}

