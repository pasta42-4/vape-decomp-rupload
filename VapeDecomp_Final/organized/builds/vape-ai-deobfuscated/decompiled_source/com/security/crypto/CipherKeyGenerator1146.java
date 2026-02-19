/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import a.a;
import a.pL;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.concurrent.execution.AsynchronousTaskExecutor2104;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.math.orchestration.NumericTransformationOrchestrator;
import com.network.protocols.NetworkProtocolHandler2628;
import com.runtime.context.ContextualExecutionFramework;
import com.security.crypto.CryptographicContextManager1918;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.temporal.metadata.TemporalMetadataResolver;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class CipherKeyGenerator1146
extends ContextualExecutionFramework {
    private static final long b = MultiContainerRegistry.a(3633747186313728100L, 263586815075980252L, MethodHandles.lookup().lookupClass()).a(79960884628980L);
    private static final long d;

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = b ^ 0x4595499C5E45L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 4140523713473684082L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                d = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
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

    @DataExchangeProtocol2090
    public void y(pL pL2) {
        block8: {
            block9: {
                SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                try {
                    try {
                        try {
                            try {
                                if (!(pL2.getRealHeight() > 0.5) || !(pL2.getStepHeight() > 0.0)) break block8;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CipherKeyGenerator1146.a(customSystemException);
                            }
                            if (systemConfigurationOrchestrator.W().Q()) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CipherKeyGenerator1146.a(customSystemException);
                        }
                        if (!systemConfigurationOrchestrator.D()) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherKeyGenerator1146.a(customSystemException);
                    }
                    TemporalMetadataResolver.h.U().K(NumericTransformationOrchestrator.class).d(-4);
                    if (!(pL2.getRealHeight() >= 0.87)) break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherKeyGenerator1146.a(customSystemException);
                }
                double d2 = pL2.getRealHeight();
                double d3 = d2 * 0.42;
                double d4 = d2 * 0.75;
                systemConfigurationOrchestrator.U().O(CryptographicContextManager1918.a(systemConfigurationOrchestrator.F(), systemConfigurationOrchestrator.V() + d3, systemConfigurationOrchestrator.B(), systemConfigurationOrchestrator.j()));
                systemConfigurationOrchestrator.U().O(CryptographicContextManager1918.a(systemConfigurationOrchestrator.F(), systemConfigurationOrchestrator.V() + d4, systemConfigurationOrchestrator.B(), systemConfigurationOrchestrator.j()));
            }
            ApplicationLifecycleManager.K().z(0.45f);
            AsynchronousTaskExecutor2104 asynchronousTaskExecutor2104 = new AsynchronousTaskExecutor2104(this);
            asynchronousTaskExecutor2104.start();
        }
    }

    public CipherKeyGenerator1146() {
        long l = b ^ 0x1A1181AE5DF7L;
        super(a.cs((int)d), new Color(42, 175, 224).getRGB(), RecursiveNodeGraph.G);
    }

    @DataExchangeProtocol2090
    public void x(NetworkProtocolHandler2628 networkProtocolHandler2628) {
        block4: {
            SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
            try {
                try {
                    if (systemConfigurationOrchestrator.W().Q() || !systemConfigurationOrchestrator.D()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherKeyGenerator1146.a(customSystemException);
                }
                networkProtocolHandler2628.setStepHeight(1.0);
            }
            catch (CustomSystemException customSystemException) {
                throw CipherKeyGenerator1146.a(customSystemException);
            }
        }
    }

    @Override
    public boolean j() {
        return true;
    }
}

