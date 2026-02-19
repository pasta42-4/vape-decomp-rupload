/*
 * Decompiled with CFR 0.152.
 */
package com.app.logging.utility;

public class LoggingUtility {
    private static int[] m;

    static {
        if (LoggingUtility.s() != null) {
            LoggingUtility.g(new int[1]);
        }
    }

    public static void g(int[] nArray) {
        m = nArray;
    }

    public static int[] s() {
        return m;
    }
}

