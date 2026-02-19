/*
 * Decompiled with CFR 0.152.
 */
package com.core.exception;

import com.exception.system.CustomSystemException;

public class CustomRuntimeException
extends Exception {
    private static int u;
    private static final long serialVersionUID = 1L;

    public static int y() {
        return u;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    static {
        if (CustomRuntimeException.f() != 0) {
            CustomRuntimeException.O(30);
        }
    }

    public static void O(int n) {
        u = n;
    }

    public CustomRuntimeException(String string) {
        super(string);
    }

    public static int f() {
        int n = CustomRuntimeException.y();
        try {
            if (n == 0) {
                return 29;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CustomRuntimeException.a(customSystemException);
        }
        return 0;
    }
}

