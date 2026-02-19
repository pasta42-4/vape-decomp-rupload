/*
 * Decompiled with CFR 0.152.
 */
package com.deobfuscation.orchestration;

import com.exception.system.CustomSystemException;

public class OperationOrchestrator {
    public static boolean A(int n) {
        boolean bl;
        try {
            bl = (n & 2) != 0;
        }
        catch (CustomSystemException customSystemException) {
            throw OperationOrchestrator.a(customSystemException);
        }
        return bl;
    }

    public static int X(int n) {
        return n;
    }

    public static int E(int n, int n2) {
        return n & ~n2;
    }

    public static int J(int n) {
        return n & 0xFFFFFFF8;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

