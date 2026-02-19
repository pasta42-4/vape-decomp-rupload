/*
 * Decompiled with CFR 0.152.
 */
package com.app.event.dispatch;

import a.N9;
import a.Zw;
import com.exception.system.CustomSystemException;
import com.financial.processing.TransactionCorrelationEngine;
import com.network.protocol.NetworkProtocolNegotiator;
import com.network.protocol.ProtocolNegotiationStrategy;
import com.resource.management.DynamicResourceRegistry;
import com.session.management.MultiProtocolSessionManager;
import com.simulation.core.ModelSimulationEngine;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.text.processing.PatternMatchingOrchestrator;
import java.util.ArrayList;
import java.util.Vector;

class EventDispatchAdapter
implements ProtocolNegotiationStrategy<MultiProtocolSessionManager> {
    final NetworkProtocolNegotiator B;
    final ModelSimulationEngine D;
    final DynamicResourceRegistry R;
    final int f;
    final SystemConfigurationOrchestrator o;
    final int a;
    final ArrayList I;
    final int s;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public boolean X(N9 n9) {
        TransactionCorrelationEngine transactionCorrelationEngine = this.B.N(n9.x(), n9.J(), n9.b());
        return PatternMatchingOrchestrator.a(transactionCorrelationEngine);
    }

    @Override
    public int e(Vector<MultiProtocolSessionManager> vector, int n) {
        return ModelSimulationEngine.h(this.D, this.R, this.I, this.o, this.B, vector, n);
    }

    @Override
    public int B() {
        return this.a + this.f + this.s;
    }

    @Override
    public boolean O(N9 n9) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!Zw.R(this.B, this.o, n9) || ModelSimulationEngine.S(this.D).w(n9)) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchAdapter.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchAdapter.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    EventDispatchAdapter(ModelSimulationEngine modelSimulationEngine, int n, int n2, int n3, NetworkProtocolNegotiator networkProtocolNegotiator, SystemConfigurationOrchestrator systemConfigurationOrchestrator, DynamicResourceRegistry dynamicResourceRegistry, ArrayList arrayList) {
        this.D = modelSimulationEngine;
        this.a = n;
        this.f = n2;
        this.s = n3;
        this.B = networkProtocolNegotiator;
        this.o = systemConfigurationOrchestrator;
        this.R = dynamicResourceRegistry;
        this.I = arrayList;
    }
}

