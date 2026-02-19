/*
 * Decompiled with CFR 0.152.
 */
package com.configuration.management;

import com.exception.system.CustomSystemException;
import java.lang.reflect.Modifier;

public class ConfigurationOrchestrator2115 {
    public static boolean E(int n) {
        boolean bl;
        try {
            bl = (n & 0x200) != 0;
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationOrchestrator2115.a(customSystemException);
        }
        return bl;
    }

    public static boolean O(int n) {
        boolean bl;
        try {
            bl = (n & 8) != 0;
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationOrchestrator2115.a(customSystemException);
        }
        return bl;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static String c(int n) {
        return Modifier.toString(n);
    }

    public static boolean i(int n) {
        boolean bl;
        try {
            bl = (n & 1) != 0;
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationOrchestrator2115.a(customSystemException);
        }
        return bl;
    }
}

