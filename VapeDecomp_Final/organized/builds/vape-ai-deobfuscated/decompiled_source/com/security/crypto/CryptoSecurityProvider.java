/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import a.a;
import com.collections.management.MultiContainerRegistry;
import com.computation.metrics.MetricComputationEngine;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.reflection.resolution.MethodResolutionMediator;
import com.reflection.utils.ReflectionUtilityManager680;
import com.security.cryptography.CryptoAlgorithmSelector;
import com.user.identity.UserIdentityManager;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class CryptoSecurityProvider
extends UserIdentityManager {
    private final CryptoAlgorithmSelector j;
    private static final long b;
    private final MetricComputationEngine o;
    private static final long a;

    public CryptoAlgorithmSelector G() {
        return this.j;
    }

    public CryptoSecurityProvider() {
        long l = a ^ 0x24E61CE3E79EL;
        super(a.a.cs((int)b));
        MethodResolutionMediator methodResolutionMediator = ApplicationLifecycleManager.G();
        this.J(methodResolutionMediator.w(), methodResolutionMediator.N());
        this.o = new MetricComputationEngine(this);
        this.j = new CryptoAlgorithmSelector(this);
    }

    public void J(ReflectionUtilityManager680 reflectionUtilityManager680) {
        this.t = reflectionUtilityManager680;
    }

    public MetricComputationEngine i() {
        return this.o;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(4211819207028809496L, 8555112084006061453L, MethodHandles.lookup().lookupClass()).a(147984849770842L);
        long l = a ^ 0x56CBB1455827L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 4274987675940513107L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }
}

