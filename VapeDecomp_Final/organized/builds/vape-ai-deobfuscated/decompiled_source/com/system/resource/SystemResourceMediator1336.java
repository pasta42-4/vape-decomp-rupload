/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.system.resource;

import a.Qh;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.validation.DataStreamValidator;
import com.event.management.ContextualEventDispatcher;
import com.exception.system.CustomSystemException;
import com.financial.processing.TransactionCorrelationEngine;
import com.network.config.ConnectionConfigurationResolver;
import com.network.core.NetworkConnectionManager2538;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.text.processing.PatternMatchingOrchestrator;
import com.validation.core.ObjectValidator;
import org.jetbrains.annotations.Nullable;

class SystemResourceMediator1336 {
    private final NetworkConnectionManager2538 N;
    private final Qh e;

    private SystemResourceMediator1336(NetworkConnectionManager2538 networkConnectionManager2538, Qh qh) {
        this.N = networkConnectionManager2538;
        this.e = qh;
    }

    @Nullable
    public ContextualEventDispatcher H() {
        ConnectionConfigurationResolver connectionConfigurationResolver = ApplicationLifecycleManager.c();
        try {
            if (connectionConfigurationResolver.Y()) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemResourceMediator1336.a(customSystemException);
        }
        double d2 = this.N.F();
        double d3 = this.N.V();
        double d4 = this.N.B();
        double d5 = this.N.G();
        double d6 = this.N.x();
        double d7 = this.N.o();
        NetworkPacketInterceptor1107 networkPacketInterceptor1107 = null;
        while (true) {
            double d8;
            double d9;
            double d10;
            double d11;
            double d12;
            double d13;
            boolean bl;
            block18: {
                block19: {
                    ContextualEventDispatcher contextualEventDispatcher = ContextualEventDispatcher.N(d2, d3, d4);
                    ContextualEventDispatcher contextualEventDispatcher2 = ContextualEventDispatcher.N(d2 + d5, d3 + d6, d4 + d7);
                    networkPacketInterceptor1107 = connectionConfigurationResolver.g(contextualEventDispatcher, contextualEventDispatcher2, false, this.N.B(ReflectionMetadataResolver.UL), false, this.N);
                    d2 += d5;
                    d3 += d6;
                    d4 += d7;
                    try {
                        if (!networkPacketInterceptor1107.r() || networkPacketInterceptor1107.q().equals(ObjectValidator.u())) break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SystemResourceMediator1336.a(customSystemException);
                    }
                    bl = false;
                    TransactionCorrelationEngine transactionCorrelationEngine = networkPacketInterceptor1107.M();
                    try {
                        if (!transactionCorrelationEngine.r() || !PatternMatchingOrchestrator.e(transactionCorrelationEngine)) break block19;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SystemResourceMediator1336.a(customSystemException);
                    }
                    bl = true;
                }
                if (!bl) {
                    d2 = networkPacketInterceptor1107.i().X();
                    d3 = networkPacketInterceptor1107.i().F();
                    d4 = networkPacketInterceptor1107.i().f();
                    return ContextualEventDispatcher.N(d2, d3, d4);
                }
            }
            try {
                if (d3 < -128.0) {
                    break;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw SystemResourceMediator1336.a(customSystemException);
            }
            bl = this.N.F();
            try {
                d13 = d5;
                d12 = bl ? 0.8 : 0.99;
            }
            catch (CustomSystemException customSystemException) {
                throw SystemResourceMediator1336.a(customSystemException);
            }
            d5 = d13 * d12;
            try {
                d11 = d6;
                d10 = bl ? 0.8 : 0.99;
            }
            catch (CustomSystemException customSystemException) {
                throw SystemResourceMediator1336.a(customSystemException);
            }
            d6 = d11 * d10;
            try {
                d9 = d7;
                d8 = bl ? 0.8 : 0.99;
            }
            catch (CustomSystemException customSystemException) {
                throw SystemResourceMediator1336.a(customSystemException);
            }
            d7 = d9 * d8;
            d6 -= 0.03;
        }
        return null;
    }

    public Qh u() {
        return this.e;
    }

    SystemResourceMediator1336(NetworkConnectionManager2538 networkConnectionManager2538, Qh qh, DataStreamValidator dataStreamValidator) {
        this(networkConnectionManager2538, qh);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public NetworkConnectionManager2538 P() {
        return this.N;
    }
}

