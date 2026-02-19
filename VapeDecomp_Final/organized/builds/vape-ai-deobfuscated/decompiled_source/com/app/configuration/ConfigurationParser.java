/*
 * Decompiled with CFR 0.152.
 */
package com.app.configuration;

public class ConfigurationParser {
    private static int[] K;

    public static int[] S() {
        return K;
    }

    public static void F(int[] nArray) {
        K = nArray;
    }

    static {
        if (ConfigurationParser.S() == null) {
            ConfigurationParser.F(new int[1]);
        }
    }
}

