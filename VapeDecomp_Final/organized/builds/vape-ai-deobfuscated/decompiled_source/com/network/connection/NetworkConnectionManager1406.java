/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import a.z6;
import com.dynamic.instrumentation.RuntimeInstrumentationEngine;
import com.encoding.strategy.EncodingStrategyEnum;
import com.exception.system.CustomSystemException;
import com.math.computation.GeometricComputationEngine920;
import com.math.geometry.GeometryCalculator;
import com.security.crypto.CryptographicSessionController;
import com.security.exchange.SecureDataExchanger793;
import com.system.configuration.ConfigurationManager;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.management.TransactionOrchestrator1017;
import java.util.function.Supplier;

public class NetworkConnectionManager1406
extends ObjectLifecycleTracker {
    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public NetworkConnectionManager1406(Object object) {
        super(object);
    }

    public static void m(int n, int n2, int n3, float f, float f2, TransactionOrchestrator1017 transactionOrchestrator1017) {
        try {
            if (GeometryCalculator.C() >= 50) {
                TemporalMetadataResolver.k();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionManager1406.a(customSystemException);
        }
        if (ConfigurationManager.U()) {
            SecureDataExchanger793 secureDataExchanger793 = new SecureDataExchanger793(new GeometricComputationEngine920(n, n2, 0.0f, 1.0f)).E(z6.D.i());
            Supplier<Void> supplier = () -> NetworkConnectionManager1406.lambda$drawEntityOnScreen$0(secureDataExchanger793, n3, f, f2, transactionOrchestrator1017);
            RuntimeInstrumentationEngine runtimeInstrumentationEngine = new RuntimeInstrumentationEngine(EncodingStrategyEnum.MINECRAFT, false).W(supplier);
            CryptographicSessionController.x().p(runtimeInstrumentationEngine);
            return;
        }
        TemporalMetadataResolver.h.u().Gu.F(n, n2, n3, f, f2, transactionOrchestrator1017.M());
    }

    private static Void lambda$drawEntityOnScreen$0(SecureDataExchanger793 secureDataExchanger793, int n, float f, float f2, TransactionOrchestrator1017 transactionOrchestrator1017) {
        TemporalMetadataResolver.h.u().Gu.F((int)secureDataExchanger793.d[0], (int)secureDataExchanger793.d[5], (int)((double)n * TemporalMetadataResolver.h.a().b()), f, f2, transactionOrchestrator1017.M());
        return null;
    }
}

