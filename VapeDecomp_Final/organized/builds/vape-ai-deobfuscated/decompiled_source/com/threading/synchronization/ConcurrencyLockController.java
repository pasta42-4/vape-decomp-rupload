/*
 * Decompiled with CFR 0.152.
 */
package com.threading.synchronization;

import com.configuration.management.ConfigurationResolver2152;

public class ConcurrencyLockController
extends ConfigurationResolver2152 {
    private static int x;
    private static int G;
    private static boolean W;

    public static boolean check(int n, int n2) {
        return W;
    }

    public static void unlock() {
        W = false;
    }

    public static void lock() {
        W = true;
    }

    static {
        W = false;
    }
}

