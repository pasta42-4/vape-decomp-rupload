/*
 * Decompiled with CFR 0.152.
 */
package com.app.crypto.processing;

import com.app.network.CommunicationProtocol2510;
import com.app.transformation.DataTransformationEngine1794;
import com.core.computation.AbstractComputationKernel;
import com.crypto.config.CryptoConfigurationRegistry383;
import com.exception.system.CustomSystemException;
import com.reflection.core.ReflectiveIntrospectionEngine;
import com.reflection.utils.ReflectionProxyHandler;
import com.resource.management.ResourceAllocationTracker127;
import com.runtime.orchestration.ComplexSystemOrchestrator;
import com.security.config.CryptoConfigurationEnum;
import com.simulation.physics.PhysicalSimulationEngine;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.rendering.GraphicalRenderingController;
import com.user.identity.UserIdentityManager;

public final class CipherTextProcessor {
    private static String g;

    public static void I() {
        GraphicalRenderingController.D(ReflectionProxyHandler.class).v().y();
    }

    public static String i() {
        return g;
    }

    public static void y(ReflectiveIntrospectionEngine reflectiveIntrospectionEngine) {
        ReflectionProxyHandler reflectionProxyHandler = GraphicalRenderingController.D(ReflectionProxyHandler.class);
        ComplexSystemOrchestrator complexSystemOrchestrator = reflectionProxyHandler.l().E().K();
        try {
            if (complexSystemOrchestrator == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherTextProcessor.a(customSystemException);
        }
        complexSystemOrchestrator.K().B().z(reflectiveIntrospectionEngine);
    }

    public static void v() {
        GraphicalRenderingController.D(ReflectionProxyHandler.class).f().Y();
        CipherTextProcessor.I();
    }

    public static void k(UserIdentityManager userIdentityManager, UserIdentityManager userIdentityManager2, String string) {
        UserIdentityManager userIdentityManager3;
        ResourceAllocationTracker127 resourceAllocationTracker127 = TemporalMetadataResolver.h.O().t().S(userIdentityManager.s().r());
        try {
            if (resourceAllocationTracker127 == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherTextProcessor.a(customSystemException);
        }
        try {
            userIdentityManager.w(true);
            userIdentityManager.G(true);
            if (userIdentityManager2 != null) {
                TemporalMetadataResolver.h.c().t("Message from \u00a7f" + userIdentityManager2.j(), string, CryptoConfigurationRegistry383.FRIENDS_NEW_CHAT, 4000L);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherTextProcessor.a(customSystemException);
        }
        try {
            userIdentityManager3 = userIdentityManager2 == null ? TemporalMetadataResolver.h.O().n() : userIdentityManager2;
        }
        catch (CustomSystemException customSystemException) {
            throw CipherTextProcessor.a(customSystemException);
        }
        UserIdentityManager userIdentityManager4 = userIdentityManager3;
        CommunicationProtocol2510 communicationProtocol2510 = new CommunicationProtocol2510(userIdentityManager4, new PhysicalSimulationEngine(string));
        resourceAllocationTracker127.x().K().C().B().z(communicationProtocol2510);
        resourceAllocationTracker127.x().K().C().B().A();
        resourceAllocationTracker127.x().x();
    }

    public static void W(DataTransformationEngine1794 dataTransformationEngine1794) {
        GraphicalRenderingController.D(ReflectionProxyHandler.class).u().w(dataTransformationEngine1794);
    }

    public static void n(String string) {
        g = string;
    }

    public static void g(CryptoConfigurationEnum cryptoConfigurationEnum, String string) {
        CipherTextProcessor.W(new DataTransformationEngine1794(cryptoConfigurationEnum, string));
    }

    public static ReflectionProxyHandler h(AbstractComputationKernel abstractComputationKernel) {
        while (!abstractComputationKernel.getClass().equals(ReflectionProxyHandler.class)) {
            try {
                abstractComputationKernel = abstractComputationKernel.F();
            }
            catch (Exception exception) {
                break;
            }
        }
        return (ReflectionProxyHandler)abstractComputationKernel;
    }

    static {
        if (CipherTextProcessor.i() == null) {
            CipherTextProcessor.n("coEvjc");
        }
    }

    public static void w(CryptoConfigurationEnum cryptoConfigurationEnum, String string) {
        CipherTextProcessor.W(new DataTransformationEngine1794(cryptoConfigurationEnum, string));
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

