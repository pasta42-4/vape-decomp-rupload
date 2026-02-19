/*
 * Decompiled with CFR 0.152.
 */
package com.caching.management;

import a.cw;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.security.crypto.EncryptionTransformer;
import com.temporal.metadata.TemporalMetadataResolver;

public class CacheInvalidationHandler
extends cw {
    private static String[] Z;

    static {
        if (CacheInvalidationHandler.R() == null) {
            CacheInvalidationHandler.Z(new String[2]);
        }
    }

    public static String[] R() {
        return Z;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public CacheInvalidationHandler() {
        if (!TemporalMetadataResolver.h.r()) {
            try {
                EncryptionTransformer.H(ReflectionMetadataResolver.rl);
                EncryptionTransformer.H(ReflectionMetadataResolver.Uu);
                EncryptionTransformer.H(ReflectionMetadataResolver.bU);
                EncryptionTransformer.H(ReflectionMetadataResolver.Uo);
                EncryptionTransformer.H(ReflectionMetadataResolver.FK);
                EncryptionTransformer.H(ReflectionMetadataResolver.Et);
                if (GeometryCalculator.C() > 13) {
                    EncryptionTransformer.H(ReflectionMetadataResolver.FM);
                    EncryptionTransformer.H(ReflectionMetadataResolver.U0);
                    EncryptionTransformer.H(ReflectionMetadataResolver.P2);
                    EncryptionTransformer.H(ReflectionMetadataResolver.Pb);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CacheInvalidationHandler.a(customSystemException);
            }
        }
    }

    public static void Z(String[] stringArray) {
        Z = stringArray;
    }
}

