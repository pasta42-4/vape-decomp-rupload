/*
 * Decompiled with CFR 0.152.
 */
package com.security.cipher;

import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.temporal.metadata.TemporalMetadataResolver;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class CipherConfigurationManager1342
extends ObjectLifecycleTracker {
    public static final int h;

    public CipherConfigurationManager1342(Object object) {
        super(object);
    }

    public static void M(int n, int n2) {
        try {
            if (TemporalMetadataResolver.h.u().d7 != null) {
                TemporalMetadataResolver.h.u().d7.T(n, n2);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherConfigurationManager1342.a(customSystemException);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = MultiContainerRegistry.a(8808887155627942266L, 3638529528541760318L, MethodHandles.lookup().lookupClass()).a(149908324435375L) ^ 0x5E0E18494D57L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -2124156995889200958L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                long l3 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                h = (int)l3;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static int B(int n) {
        try {
            if (TemporalMetadataResolver.h.u().d7 != null) {
                return TemporalMetadataResolver.h.u().d7.h(n);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherConfigurationManager1342.a(customSystemException);
        }
        return 0;
    }

    public static boolean j() {
        boolean bl;
        try {
            bl = TemporalMetadataResolver.h.u().d7 != null;
        }
        catch (CustomSystemException customSystemException) {
            throw CipherConfigurationManager1342.a(customSystemException);
        }
        return bl;
    }
}

