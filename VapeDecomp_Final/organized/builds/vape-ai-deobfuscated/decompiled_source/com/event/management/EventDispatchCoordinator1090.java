/*
 * Decompiled with CFR 0.152.
 */
package com.event.management;

import a.Qv;
import com.app.configuration.resolution.ConfigurationResolver2414;
import com.app.gameengine.GameRoundProcessor;
import com.app.transaction.sync.TransactionSynchronizationManager;
import com.caching.strategy.CacheInvalidationStrategy;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.compression.DataCompressionManager;
import com.data.transformation.DataTransformationService1284;
import com.data.validation.DataIntegrityValidator2381;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.network.config.ConnectionConfigurationResolver;
import com.network.connection.ConnectionPoolHandler;
import com.network.connection.ConnectionStateTracker;
import com.network.security.ProtocolValidator;
import com.runtime.context.LightweightExecutionContext;
import com.security.authentication.AuthenticationTokenResolver2380;
import com.security.crypto.CryptoOperationMediator;
import com.security.transform.CryptographicTransformer;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.system.resource.ResourceAllocator1647;
import com.system.resource.ResourceAllocator1807;
import com.system.resource.SystemResourceAllocator1279;
import java.util.ArrayList;
import java.util.HashMap;

public class EventDispatchCoordinator1090
extends ObjectLifecycleTracker {
    public static int b(LightweightExecutionContext[] lightweightExecutionContextArray, ResourceAllocator1647 resourceAllocator1647) {
        try {
            if (GameVersionEnumerator.MC_1_21_0.H()) {
                return 0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator1090.a(customSystemException);
        }
        if (GeometryCalculator.C() >= 23) {
            ArrayList<Object> arrayList = new ArrayList<Object>();
            for (LightweightExecutionContext lightweightExecutionContext : lightweightExecutionContextArray) {
                arrayList.add(lightweightExecutionContext.M());
            }
            return CryptoOperationMediator.J(EventDispatchCoordinator1090.U.u().Gs, arrayList, resourceAllocator1647.M());
        }
        Object[] objectArray = new Object[lightweightExecutionContextArray.length];
        try {
            for (int i = 0; i < lightweightExecutionContextArray.length; ++i) {
                objectArray[i] = lightweightExecutionContextArray[i].M();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator1090.a(customSystemException);
        }
        return CryptoOperationMediator.k(EventDispatchCoordinator1090.U.u().Gs, objectArray, resourceAllocator1647.M());
    }

    public static ConnectionPoolHandler h(LightweightExecutionContext lightweightExecutionContext) {
        return new ConnectionPoolHandler(CryptoOperationMediator.J(EventDispatchCoordinator1090.U.u().Gs, lightweightExecutionContext.M()));
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static float O(LightweightExecutionContext lightweightExecutionContext, ProtocolValidator protocolValidator) {
        float f;
        block21: {
            block22: {
                block20: {
                    block19: {
                        try {
                            try {
                                if (lightweightExecutionContext != null && !lightweightExecutionContext.Y()) break block19;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw EventDispatchCoordinator1090.a(customSystemException);
                            }
                            return 0.0f;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EventDispatchCoordinator1090.a(customSystemException);
                        }
                    }
                    f = 0.0f;
                    Qv qv2 = Qv.o();
                    try {
                        if (qv2 == null || qv2.Y()) break block20;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchCoordinator1090.a(customSystemException);
                    }
                    int n = EventDispatchCoordinator1090.c(qv2.e(), lightweightExecutionContext);
                    if (n > 0) {
                        f += 0.5f + 0.5f * (float)n;
                    }
                }
                try {
                    if (protocolValidator == null || protocolValidator.Y()) break block21;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator1090.a(customSystemException);
                }
                ProtocolValidator protocolValidator2 = ProtocolValidator.f();
                try {
                    try {
                        if (protocolValidator2 == null || protocolValidator2.Y()) break block21;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchCoordinator1090.a(customSystemException);
                    }
                    if (protocolValidator.M() == protocolValidator2.M()) break block21;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator1090.a(customSystemException);
                }
                Qv qv3 = Qv.C();
                try {
                    if (qv3 == null || qv3.Y()) break block22;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator1090.a(customSystemException);
                }
                int n = EventDispatchCoordinator1090.c(qv3.e(), lightweightExecutionContext);
                if (n > 0) {
                    // empty if block
                }
            }
            Qv qv4 = Qv.F();
            try {
                if (qv4 == null || qv4.Y()) break block21;
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchCoordinator1090.a(customSystemException);
            }
            int n = EventDispatchCoordinator1090.c(qv4.e(), lightweightExecutionContext);
            if (n > 0) {
                // empty if block
            }
        }
        return f;
    }

    public static int c(int n, LightweightExecutionContext lightweightExecutionContext) {
        try {
            if (n < 0) {
                return 0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator1090.a(customSystemException);
        }
        if (GeometryCalculator.C() >= 23) {
            Qv qv2 = Qv.K(n);
            try {
                if (GameVersionEnumerator.MC_1_21_4.H()) {
                    return EventDispatchCoordinator1090.M(qv2, lightweightExecutionContext);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchCoordinator1090.a(customSystemException);
            }
            return CryptoOperationMediator.v(EventDispatchCoordinator1090.U.u().Gs, qv2.M(), lightweightExecutionContext.M());
        }
        return CryptoOperationMediator.T(EventDispatchCoordinator1090.U.u().Gs, n, lightweightExecutionContext.M());
    }

    public static HashMap<CacheInvalidationStrategy, Integer> Y(LightweightExecutionContext lightweightExecutionContext) {
        HashMap<CacheInvalidationStrategy, Integer> hashMap;
        block5: {
            hashMap = new HashMap<CacheInvalidationStrategy, Integer>();
            try {
                try {
                    if (!lightweightExecutionContext.Y() && lightweightExecutionContext.J() > 0) break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator1090.a(customSystemException);
                }
                return hashMap;
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchCoordinator1090.a(customSystemException);
            }
        }
        ConnectionPoolHandler connectionPoolHandler = new ConnectionPoolHandler(lightweightExecutionContext.k(SystemResourceAllocator1279.P()));
        for (Object e : connectionPoolHandler.e()) {
            ConnectionStateTracker connectionStateTracker = new ConnectionStateTracker(e);
            CacheInvalidationStrategy cacheInvalidationStrategy = new CacheInvalidationStrategy(connectionStateTracker.q());
            hashMap.put(cacheInvalidationStrategy, connectionStateTracker.Q());
        }
        return hashMap;
    }

    public static void F(TransactionSynchronizationManager transactionSynchronizationManager, LightweightExecutionContext[] lightweightExecutionContextArray) {
        if (GeometryCalculator.C() >= 23) {
            ArrayList<Object> arrayList = new ArrayList<Object>();
            for (LightweightExecutionContext lightweightExecutionContext : lightweightExecutionContextArray) {
                arrayList.add(lightweightExecutionContext.M());
            }
            CryptoOperationMediator.Y(EventDispatchCoordinator1090.U.u().Gs, transactionSynchronizationManager.M(), arrayList);
            return;
        }
        Object[] objectArray = new Object[lightweightExecutionContextArray.length];
        try {
            for (int i = 0; i < lightweightExecutionContextArray.length; ++i) {
                objectArray[i] = lightweightExecutionContextArray[i].M();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator1090.a(customSystemException);
        }
        CryptoOperationMediator.U(EventDispatchCoordinator1090.U.u().Gs, transactionSynchronizationManager.M(), objectArray);
    }

    public static int x(DataCompressionManager dataCompressionManager, DataTransformationService1284 dataTransformationService1284) {
        ArrayList<LightweightExecutionContext> arrayList = dataTransformationService1284.K();
        arrayList.add(dataTransformationService1284.a());
        int[] nArray = new int[]{0};
        for (LightweightExecutionContext lightweightExecutionContext : arrayList) {
            HashMap<CacheInvalidationStrategy, Integer> hashMap = EventDispatchCoordinator1090.Y(lightweightExecutionContext);
            hashMap.forEach((arg_0, arg_1) -> EventDispatchCoordinator1090.lambda$getEnchantmentLevel$0(dataCompressionManager, nArray, arg_0, arg_1));
        }
        return nArray[0];
    }

    public static boolean J(LightweightExecutionContext lightweightExecutionContext) {
        return CryptoOperationMediator.Y(EventDispatchCoordinator1090.U.u().Gs, lightweightExecutionContext.M());
    }

    public static int M(Qv qv2, LightweightExecutionContext lightweightExecutionContext) {
        if (GameVersionEnumerator.MC_1_21_4.H()) {
            ConnectionConfigurationResolver connectionConfigurationResolver = ApplicationLifecycleManager.c();
            try {
                if (connectionConfigurationResolver.Y()) {
                    return 0;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchCoordinator1090.a(customSystemException);
            }
            DataIntegrityValidator2381 dataIntegrityValidator2381 = connectionConfigurationResolver.G();
            GameRoundProcessor gameRoundProcessor = dataIntegrityValidator2381.c(ConfigurationResolver2414.e());
            CacheInvalidationStrategy cacheInvalidationStrategy = gameRoundProcessor.w(qv2.M());
            return CryptoOperationMediator.I(EventDispatchCoordinator1090.U.u().Gs, cacheInvalidationStrategy.M(), lightweightExecutionContext.M());
        }
        return CryptoOperationMediator.I(EventDispatchCoordinator1090.U.u().Gs, qv2.M(), lightweightExecutionContext.M());
    }

    public static float b(LightweightExecutionContext lightweightExecutionContext, ProtocolValidator protocolValidator) {
        Object object;
        try {
            if (GameVersionEnumerator.MC_1_21_0.H()) {
                return EventDispatchCoordinator1090.O(lightweightExecutionContext, protocolValidator);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator1090.a(customSystemException);
        }
        try {
            object = protocolValidator == null ? null : protocolValidator.M();
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator1090.a(customSystemException);
        }
        Object object2 = object;
        return CryptoOperationMediator.E(EventDispatchCoordinator1090.U.u().Gs, lightweightExecutionContext.M(), object2);
    }

    private static void lambda$getEnchantmentLevel$0(DataCompressionManager dataCompressionManager, int[] nArray, CacheInvalidationStrategy cacheInvalidationStrategy, Integer n) {
        block4: {
            try {
                try {
                    if (!cacheInvalidationStrategy.x(dataCompressionManager) || nArray[0] <= n) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator1090.a(customSystemException);
                }
                nArray[0] = n;
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchCoordinator1090.a(customSystemException);
            }
        }
    }

    public static ResourceAllocator1807 d() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator1090.a(customSystemException);
        }
        return new ResourceAllocator1807(CryptoOperationMediator.r(EventDispatchCoordinator1090.U.u().Gs));
    }

    public static float I(Object object, LightweightExecutionContext lightweightExecutionContext, CryptographicTransformer cryptographicTransformer, ResourceAllocator1647 resourceAllocator1647, float f) {
        return CryptoOperationMediator.w(EventDispatchCoordinator1090.U.u().Gs, object, lightweightExecutionContext.M(), cryptographicTransformer.M(), resourceAllocator1647.M(), f);
    }

    public EventDispatchCoordinator1090(Object object) {
        super(object);
    }

    public static int u(CryptographicTransformer cryptographicTransformer) {
        try {
            if (GameVersionEnumerator.MC_1_21_0.H()) {
                return EventDispatchCoordinator1090.x(AuthenticationTokenResolver2380.h(), new DataTransformationService1284(cryptographicTransformer.M()));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator1090.a(customSystemException);
        }
        return CryptoOperationMediator.z(EventDispatchCoordinator1090.U.u().Gs, cryptographicTransformer.M());
    }
}

