/*
 * Decompiled with CFR 0.152.
 */
package com.deobfuscation.configuration;

public class ConfigurationManager2137 {
    public static int W(byte[] byArray, int n) {
        return byArray[n] << 8 | byArray[n + 1] & 0xFF;
    }

    public static void C(int n, byte[] byArray, int n2) {
        byArray[n2] = (byte)(n >>> 24);
        byArray[n2 + 1] = (byte)(n >>> 16);
        byArray[n2 + 2] = (byte)(n >>> 8);
        byArray[n2 + 3] = (byte)n;
    }

    static void i(byte[] byArray, int n, byte[] byArray2, int n2) {
        byArray2[n2] = byArray[n];
        byArray2[n2 + 1] = byArray[n + 1];
        byArray2[n2 + 2] = byArray[n + 2];
        byArray2[n2 + 3] = byArray[n + 3];
    }

    public static int R(byte[] byArray, int n) {
        return byArray[n] << 24 | (byArray[n + 1] & 0xFF) << 16 | (byArray[n + 2] & 0xFF) << 8 | byArray[n + 3] & 0xFF;
    }

    public static void e(int n, byte[] byArray, int n2) {
        byArray[n2] = (byte)(n >>> 8);
        byArray[n2 + 1] = (byte)n;
    }

    public static int M(byte[] byArray, int n) {
        return (byArray[n] & 0xFF) << 8 | byArray[n + 1] & 0xFF;
    }
}

