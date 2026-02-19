/*
 * Decompiled with CFR 0.152.
 */
package com.resource.core;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.exception.system.CustomSystemException;

public abstract class BaseResourceManager {
    char T;
    BytecodeAnalyzer R;
    private static boolean I;

    static {
        if (!BaseResourceManager.K()) {
            BaseResourceManager.A(true);
        }
    }

    public static boolean N() {
        return I;
    }

    BaseResourceManager(char c, BytecodeAnalyzer bytecodeAnalyzer) {
        this.R = bytecodeAnalyzer;
        this.T = c;
    }

    public static void A(boolean bl) {
        I = bl;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static boolean K() {
        boolean bl = BaseResourceManager.N();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BaseResourceManager.a(customSystemException);
        }
        return false;
    }
}

