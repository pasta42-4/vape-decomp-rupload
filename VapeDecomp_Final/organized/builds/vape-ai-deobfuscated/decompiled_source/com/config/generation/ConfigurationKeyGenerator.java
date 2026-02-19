/*
 * Decompiled with CFR 0.152.
 */
package com.config.generation;

public class ConfigurationKeyGenerator {
    private static String c;

    public static String l() {
        return c;
    }

    public static void M(String string) {
        c = string;
    }

    static {
        if (ConfigurationKeyGenerator.l() == null) {
            ConfigurationKeyGenerator.M("xg1Qcb");
        }
    }
}

