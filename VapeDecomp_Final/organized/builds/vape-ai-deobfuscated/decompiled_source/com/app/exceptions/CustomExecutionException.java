/*
 * Decompiled with CFR 0.152.
 */
package com.app.exceptions;

public class CustomExecutionException
extends Exception {
    private static String[] o;

    static {
        if (CustomExecutionException.D() != null) {
            CustomExecutionException.N(new String[3]);
        }
    }

    public static void N(String[] stringArray) {
        o = stringArray;
    }

    public CustomExecutionException(String string) {
        super(string);
    }

    public static String[] D() {
        return o;
    }
}

