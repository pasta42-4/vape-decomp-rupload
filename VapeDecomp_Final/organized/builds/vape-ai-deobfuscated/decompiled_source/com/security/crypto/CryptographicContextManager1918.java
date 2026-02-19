/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import com.data.encoding.DataEncodingTranslator;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.security.auth.AuthenticationTokenGenerator788;

public class CryptographicContextManager1918
extends AuthenticationTokenGenerator788 {
    private CryptographicContextManager1918(Object object) {
        super(object);
    }

    public static CryptographicContextManager1918 e(double d2, double d3, double d4, double d5, boolean bl) {
        return new CryptographicContextManager1918(CryptographicContextManager1918.U.u().o.L(d2, d3, d4, d5, bl));
    }

    public static CryptographicContextManager1918 a(double d2, double d3, double d4, boolean bl) {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                return new CryptographicContextManager1918(CryptographicContextManager1918.U.u().o.z(d2, d3, d4, bl, false));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicContextManager1918.a(customSystemException);
        }
        return new CryptographicContextManager1918(DataEncodingTranslator.f(CryptographicContextManager1918.U.u().o, d2, d3, d4, bl));
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

