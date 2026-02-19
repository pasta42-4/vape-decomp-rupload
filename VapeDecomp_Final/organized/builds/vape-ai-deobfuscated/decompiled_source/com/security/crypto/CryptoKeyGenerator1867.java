/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

public class CryptoKeyGenerator1867 {
    private final int M;
    private static String U;
    private final int F;
    public static final CryptoKeyGenerator1867 s;
    public static final CryptoKeyGenerator1867 y;
    public static final CryptoKeyGenerator1867 p;

    public int A() {
        return this.F;
    }

    public static String y() {
        return U;
    }

    public int i() {
        return this.M;
    }

    public CryptoKeyGenerator1867(int n, int n2) {
        this.F = n;
        this.M = n2;
    }

    public static void n(String string) {
        U = string;
    }

    static {
        y = new CryptoKeyGenerator1867(36, 44);
        p = new CryptoKeyGenerator1867(9, 35);
        CryptoKeyGenerator1867.n("a5SLx");
        s = new CryptoKeyGenerator1867(9, 44);
    }
}

