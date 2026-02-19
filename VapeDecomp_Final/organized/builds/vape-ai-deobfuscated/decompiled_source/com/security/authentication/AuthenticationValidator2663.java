/*
 * Decompiled with CFR 0.152.
 */
package com.security.authentication;

import com.system.configuration.SystemCompatibilityMode;

class AuthenticationValidator2663 {
    static final int[] j = new int[SystemCompatibilityMode.values().length];

    static {
        try {
            AuthenticationValidator2663.j[SystemCompatibilityMode.IS_IN.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AuthenticationValidator2663.j[SystemCompatibilityMode.IS_NOT_IN.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

