/*
 * Decompiled with CFR 0.152.
 */
package com.security.negotiation;

import a.KB;
import com.app.context.transformation.ContextTransformationEngine;
import com.async.events.AsynchronousEventCoordinator;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.event.management.DomainEventAggregator;
import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.ContextualExecutionFramework;
import com.security.event.SecureEventOrchestrator;
import com.system.configuration.ConfigurationCalibrator;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.transaction.management.TransactionOrchestrator1017;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class CryptoParameterNegotiator1074
extends ContextTransformationEngine<AsynchronousEventCoordinator> {
    private static final long e;
    private int B = -1;
    private boolean V = false;
    private static final long d;

    public CryptoParameterNegotiator1074(ContextualExecutionFramework contextualExecutionFramework, String string) {
        super(contextualExecutionFramework, string);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = MultiContainerRegistry.a(4569242278414142327L, 7284119425941149575L, MethodHandles.lookup().lookupClass()).a(268287881534066L);
        long l = d ^ 0x36ED6A141C1CL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -1438182566714708943L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                e = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    @DataExchangeProtocol2090
    public void p(DomainEventAggregator domainEventAggregator) {
        try {
            if (this.G()) {
                domainEventAggregator.setCanceled(true);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoParameterNegotiator1074.a(customSystemException);
        }
    }

    public boolean G() {
        return this.V;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @DataExchangeProtocol2090
    public void e(KB kB) {
        block20: {
            block21: {
                TransactionOrchestrator1017 transactionOrchestrator1017;
                block19: {
                    TransactionOrchestrator1017 transactionOrchestrator10172;
                    block18: {
                        block17: {
                            long l = d ^ 0x217BAE42E7C6L;
                            try {
                                if (this.B > 0) {
                                    --this.B;
                                    this.V = false;
                                    return;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoParameterNegotiator1074.a(customSystemException);
                            }
                            NetworkPacketInterceptor1107 networkPacketInterceptor1107 = ConfigurationCalibrator.b.B();
                            try {
                                try {
                                    if (!networkPacketInterceptor1107.r() || !networkPacketInterceptor1107.l().B(ReflectionMetadataResolver.Ut)) break block17;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptoParameterNegotiator1074.a(customSystemException);
                                }
                                transactionOrchestrator10172 = new TransactionOrchestrator1017(networkPacketInterceptor1107.l());
                                break block18;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoParameterNegotiator1074.a(customSystemException);
                            }
                        }
                        transactionOrchestrator10172 = new TransactionOrchestrator1017(null);
                    }
                    transactionOrchestrator1017 = transactionOrchestrator10172;
                    SecureEventOrchestrator secureEventOrchestrator = ApplicationLifecycleManager.X();
                    try {
                        try {
                            if (!transactionOrchestrator1017.Y() || !secureEventOrchestrator.Y()) break block19;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoParameterNegotiator1074.a(customSystemException);
                        }
                        this.V = false;
                        return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoParameterNegotiator1074.a(customSystemException);
                    }
                }
                SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                try {
                    if (!transactionOrchestrator1017.r() || !systemConfigurationOrchestrator.j()) break block20;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoParameterNegotiator1074.a(customSystemException);
                }
                int n = transactionOrchestrator1017.y();
                try {
                    try {
                        if (n <= 12) break block20;
                        if (((AsynchronousEventCoordinator)this.n()).i()) break block21;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoParameterNegotiator1074.a(customSystemException);
                    }
                    this.B = (int)e;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoParameterNegotiator1074.a(customSystemException);
                }
            }
            this.V = true;
            return;
        }
        this.V = false;
    }
}

