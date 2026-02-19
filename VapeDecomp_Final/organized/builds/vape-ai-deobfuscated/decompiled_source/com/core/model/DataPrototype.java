/*
 * Decompiled with CFR 0.152.
 */
package com.core.model;

class DataPrototype
implements Cloneable {
    private int I = 0;
    private byte[] t = new byte[64];

    public void u(int n, int n2) {
        block4: {
            try {
                try {
                    if (n >= 0 && this.I > n) break block4;
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    throw DataPrototype.a(arrayIndexOutOfBoundsException);
                }
                throw new ArrayIndexOutOfBoundsException(n);
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                throw DataPrototype.a(arrayIndexOutOfBoundsException);
            }
        }
        this.t[n] = (byte)n2;
    }

    public void R(int n, int n2) {
        this.I(2);
        this.t[this.I - 2] = (byte)n;
        this.t[this.I - 1] = (byte)n2;
    }

    public void I(int n) {
        if (this.I + n > this.t.length) {
            int n2 = this.I << 1;
            if (n2 < this.I + n) {
                n2 = this.I + n;
            }
            byte[] byArray = new byte[n2];
            System.arraycopy(this.t, 0, byArray, 0, this.I);
            this.t = byArray;
        }
        this.I += n;
    }

    public final int p() {
        return this.I;
    }

    public void U(int n, int n2, int n3, int n4) {
        this.I(4);
        this.t[this.I - 4] = (byte)n;
        this.t[this.I - 3] = (byte)n2;
        this.t[this.I - 2] = (byte)n3;
        this.t[this.I - 1] = (byte)n4;
    }

    public Object clone() throws CloneNotSupportedException {
        DataPrototype dataPrototype = (DataPrototype)super.clone();
        dataPrototype.t = (byte[])this.t.clone();
        return dataPrototype;
    }

    private static ArrayIndexOutOfBoundsException a(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        return arrayIndexOutOfBoundsException;
    }

    public void w(int n) {
        this.I(1);
        this.t[this.I - 1] = (byte)n;
    }

    public final byte[] c() {
        byte[] byArray = new byte[this.I];
        System.arraycopy(this.t, 0, byArray, 0, this.I);
        return byArray;
    }
}

