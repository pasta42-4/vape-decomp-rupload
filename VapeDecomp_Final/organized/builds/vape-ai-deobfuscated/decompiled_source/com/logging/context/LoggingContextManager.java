/*
 * Decompiled with CFR 0.152.
 */
package com.logging.context;

import a.a;
import com.exception.system.CustomSystemException;

public class LoggingContextManager {
    private static String[] m;
    private static String N;

    private static void s() {
        N = a.gat();
    }

    public static String z(boolean bl) {
        try {
            if (N == null) {
                LoggingContextManager.s();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw LoggingContextManager.a(customSystemException);
        }
        return N;
    }

    public static void R(String[] stringArray) {
        m = stringArray;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static String T() {
        return LoggingContextManager.z(true);
    }

    static {
        if (LoggingContextManager.k() == null) {
            LoggingContextManager.R(new String[4]);
        }
    }

    public static String q() {
        return LoggingContextManager.z(false);
    }

    public static String[] k() {
        return m;
    }
}

