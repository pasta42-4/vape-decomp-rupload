/*
 * Decompiled with CFR 0.152.
 */
package com.security.authentication;

import a.I8;
import com.exception.system.CustomSystemException;
import java.util.List;

public class UserCredentialValidator {
    private String h;
    List<I8> i;
    private static int W;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static int H() {
        return W;
    }

    public static int a() {
        int n = UserCredentialValidator.H();
        try {
            if (n == 0) {
                return 8;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw UserCredentialValidator.a(customSystemException);
        }
        return 0;
    }

    static {
        if (UserCredentialValidator.a() != 0) {
            UserCredentialValidator.S(103);
        }
    }

    public static void S(int n) {
        W = n;
    }
}

