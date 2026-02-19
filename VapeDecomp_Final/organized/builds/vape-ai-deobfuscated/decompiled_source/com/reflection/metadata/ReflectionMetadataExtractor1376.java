/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.metadata;

import com.exception.system.CustomSystemException;
import com.runtime.context.ContextualExecutionFramework;
import com.security.cryptography.CryptographicResourceManager;

public class ReflectionMetadataExtractor1376
extends ContextualExecutionFramework {
    private String t;
    private Class A;
    private CryptographicResourceManager X;
    private boolean o;
    private static int z;

    public boolean I() {
        return this.o;
    }

    public static void l(int n) {
        z = n;
    }

    public ReflectionMetadataExtractor1376(String string, CryptographicResourceManager cryptographicResourceManager, String string2, Class clazz, int n) {
        super(string, n);
        this.X = cryptographicResourceManager;
        this.t = string2;
        this.A = clazz;
    }

    @Override
    public void t() {
    }

    public Class n() {
        return this.A;
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public ReflectionMetadataExtractor1376(String string, CryptographicResourceManager cryptographicResourceManager, String string2) {
        this(string, cryptographicResourceManager, string2, null);
    }

    public void I(boolean bl) {
        this.o = bl;
    }

    public static int B() {
        return z;
    }

    public static int P() {
        int n = ReflectionMetadataExtractor1376.B();
        try {
            if (n == 0) {
                return 23;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ReflectionMetadataExtractor1376.b(customSystemException);
        }
        return 0;
    }

    public ReflectionMetadataExtractor1376(String string, CryptographicResourceManager cryptographicResourceManager, String string2, int n) {
        this(string, cryptographicResourceManager, string2, null, n);
    }

    public CryptographicResourceManager r() {
        return this.X;
    }

    static {
        if (ReflectionMetadataExtractor1376.P() != 0) {
            ReflectionMetadataExtractor1376.l(114);
        }
    }

    public String R() {
        return this.t;
    }

    public ReflectionMetadataExtractor1376(String string, CryptographicResourceManager cryptographicResourceManager, String string2, Class clazz) {
        this(string, cryptographicResourceManager, string2, clazz, 0);
    }
}

