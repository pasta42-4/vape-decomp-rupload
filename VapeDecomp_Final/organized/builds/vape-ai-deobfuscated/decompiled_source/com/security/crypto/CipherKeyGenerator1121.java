/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.security.crypto;

import a.KB;
import a.a;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.config.distributed.DistributedConfigurationInterface;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.runtime.context.ContextualExecutionFramework;
import com.security.context.SecurityContextManager2112;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.validation.core.ObjectValidator;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

public class CipherKeyGenerator1121
extends ContextualExecutionFramework
implements DistributedConfigurationInterface {
    private static final long e;
    private static final long b;

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @DataExchangeProtocol2090
    public void r(KB kB) {
    }

    public CipherKeyGenerator1121() {
        long l = b ^ 0x480657330945L;
        super(a.cs((int)e), -1, RecursiveNodeGraph.K);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = MultiContainerRegistry.a(2919498594170291408L, 4319780882424255262L, MethodHandles.lookup().lookupClass()).a(154216469342425L);
        long l = b ^ 0x3990EB06D949L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 1507412111361516959L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                e = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    @Nullable
    public static SecurityContextManager2112 E() {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        SecurityContextManager2112 securityContextManager2112 = SecurityContextManager2112.R();
        try {
            if (systemConfigurationOrchestrator.Y()) {
                return securityContextManager2112;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherKeyGenerator1121.b(customSystemException);
        }
        NetworkPacketInterceptor1107 networkPacketInterceptor1107 = ApplicationLifecycleManager.u();
        try {
            if (networkPacketInterceptor1107.Y()) {
                return securityContextManager2112;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherKeyGenerator1121.b(customSystemException);
        }
        ObjectValidator objectValidator = networkPacketInterceptor1107.q();
        try {
            if (objectValidator.equals(ObjectValidator.u())) {
                return securityContextManager2112;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherKeyGenerator1121.b(customSystemException);
        }
        return null;
    }
}

