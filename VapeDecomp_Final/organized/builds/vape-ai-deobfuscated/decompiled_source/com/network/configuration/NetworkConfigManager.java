/*
 * Decompiled with CFR 0.152.
 */
package com.network.configuration;

import com.exception.system.CustomSystemException;

public class NetworkConfigManager {
    private static int[] r;
    long N;

    public long K() {
        return this.N;
    }

    public void w(long l) {
        this.N = System.currentTimeMillis() + l;
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public boolean m(long l) {
        boolean bl;
        try {
            bl = this.d() >= l;
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConfigManager.b(customSystemException);
        }
        return bl;
    }

    public static void v(int[] nArray) {
        r = nArray;
    }

    public void m() {
        this.N = System.currentTimeMillis();
    }

    public static int[] e() {
        return r;
    }

    static {
        if (NetworkConfigManager.e() != null) {
            NetworkConfigManager.v(new int[5]);
        }
    }

    public NetworkConfigManager() {
        this.m();
    }

    public long d() {
        return System.currentTimeMillis() - this.N;
    }
}

