/*
 * Decompiled with CFR 0.152.
 */
package com.security.transfer;

import a.a;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.indexing.metadata.MetadataIndexingService;
import com.security.authentication.AuthenticationTokenManager505;
import com.security.policy.PolicyEnforcementHandler;
import com.security.selection.CryptoAlgorithmSelector943;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.resource.ResourceOrchestrationManager;
import com.temporal.metadata.TemporalMetadataResolver;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class SecureDataExchanger1153
extends AuthenticationTokenManager505 {
    private final PolicyEnforcementHandler w;
    private static final long b = MultiContainerRegistry.a(660832849354218739L, 9055673505001049945L, MethodHandles.lookup().lookupClass()).a(94674812534400L);
    private static final long e;

    @Override
    public boolean H() {
        return false;
    }

    public SecureDataExchanger1153(PolicyEnforcementHandler policyEnforcementHandler) {
        long l = b ^ 0x20E73A4D7752L;
        super(a.cs((int)e), 0, RecursiveNodeGraph.p);
        this.w = policyEnforcementHandler;
        ResourceOrchestrationManager resourceOrchestrationManager = new ResourceOrchestrationManager(CryptoAlgorithmSelector943.LEFT, policyEnforcementHandler.An, policyEnforcementHandler.A, policyEnforcementHandler.AW, policyEnforcementHandler.AY, null, new AuthenticationStateTracker((Object)null, "", false));
        this.u(resourceOrchestrationManager);
        this.T(true);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = b ^ 0x37EF8BCAEC24L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 8145642272025954639L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                e = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    @Override
    public boolean L() {
        boolean bl;
        try {
            if (!this.w.Z()) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecureDataExchanger1153.a(customSystemException);
        }
        try {
            bl = !this.w.W();
        }
        catch (CustomSystemException customSystemException) {
            throw SecureDataExchanger1153.a(customSystemException);
        }
        return bl;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public boolean n(ResourceOrchestrationManager resourceOrchestrationManager, SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        boolean bl;
        block5: {
            block4: {
                MetadataIndexingService metadataIndexingService = TemporalMetadataResolver.h.U().K(MetadataIndexingService.class);
                try {
                    try {
                        if (metadataIndexingService == null || !metadataIndexingService.L()) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SecureDataExchanger1153.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw SecureDataExchanger1153.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }
}

