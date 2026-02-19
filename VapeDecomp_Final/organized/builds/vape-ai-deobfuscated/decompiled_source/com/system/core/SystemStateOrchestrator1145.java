/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.system.core;

import a.Qh;
import a._Y;
import a.kg;
import a.oQ;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.data.processing.StreamTransformationProcessor;
import com.app.resource.management.ResourceAllocator1162;
import com.app.transaction.validation.TransactionValidator2324;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.streaming.StreamProcessingEngine1677;
import com.event.management.ContextualEventDispatcher;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.network.config.ConnectionConfigurationResolver;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.network.protocol.NetworkProtocolNegotiator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.security.transform.CryptographicTransformer;
import com.system.config.ConfigurationLoadBalancer;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.transaction.management.TransactionOrchestrator1017;
import java.util.List;
import java.util.function.Predicate;
import org.jetbrains.annotations.Nullable;

public class SystemStateOrchestrator1145 {
    public static kg x(CryptographicTransformer cryptographicTransformer) {
        return new kg(cryptographicTransformer.F(), cryptographicTransformer.V() + 1.54, cryptographicTransformer.B());
    }

    public static NetworkPacketInterceptor1107 j(double d2, float f, boolean bl) {
        return SystemStateOrchestrator1145.h((TransactionOrchestrator1017)ApplicationLifecycleManager.g(), d2, f, bl, null);
    }

    public static NetworkPacketInterceptor1107 B(double d2, float f, boolean bl, @Nullable Predicate<CryptographicTransformer> predicate) {
        return SystemStateOrchestrator1145.h((TransactionOrchestrator1017)ApplicationLifecycleManager.g(), d2, f, bl, predicate);
    }

    public static NetworkPacketInterceptor1107 J() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return SystemStateOrchestrator1145.J((TransactionOrchestrator1017)ApplicationLifecycleManager.g(), ApplicationLifecycleManager.n().y(), 0.0f, false, null);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemStateOrchestrator1145.a(customSystemException);
        }
        return SystemStateOrchestrator1145.j(ApplicationLifecycleManager.n().y(), 0.0f, false);
    }

    public static TransactionOrchestrator1017 S(TransactionOrchestrator1017 transactionOrchestrator1017, double d2, double d3) {
        block54: {
            ConnectionConfigurationResolver connectionConfigurationResolver;
            float f;
            block46: {
                f = 1.0f;
                connectionConfigurationResolver = ApplicationLifecycleManager.c();
                try {
                    try {
                        if (!transactionOrchestrator1017.Y() && !connectionConfigurationResolver.Y()) break block46;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SystemStateOrchestrator1145.a(customSystemException);
                    }
                    return null;
                }
                catch (CustomSystemException customSystemException) {
                    throw SystemStateOrchestrator1145.a(customSystemException);
                }
            }
            float f2 = (float)d2;
            ContextualEventDispatcher contextualEventDispatcher = transactionOrchestrator1017.I(f);
            double d4 = transactionOrchestrator1017.K(f2, f).i().x(contextualEventDispatcher);
            if (d4 > d3) {
                d4 = d3;
            }
            ContextualEventDispatcher contextualEventDispatcher2 = transactionOrchestrator1017.F(f);
            ContextualEventDispatcher contextualEventDispatcher3 = contextualEventDispatcher.A(contextualEventDispatcher2.X() * (double)f2, contextualEventDispatcher2.F() * (double)f2, contextualEventDispatcher2.f() * (double)f2);
            float f3 = 1.0f;
            List list = connectionConfigurationResolver.R(transactionOrchestrator1017, ((oQ)transactionOrchestrator1017.L()).r(contextualEventDispatcher2.X() * (double)f2, contextualEventDispatcher2.F() * (double)f2, contextualEventDispatcher2.f() * (double)f2).B(f3, f3, f3));
            double d5 = d4;
            SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
            ObjectLifecycleTracker objectLifecycleTracker = null;
            for (Object e : list) {
                double d6;
                TransactionOrchestrator1017 transactionOrchestrator10172;
                block53: {
                    NetworkPacketInterceptor1107 networkPacketInterceptor1107;
                    block51: {
                        block52: {
                            boolean bl;
                            block50: {
                                block48: {
                                    try {
                                        if (!ReflectionMetadataResolver.Ut.isInstance(e)) {
                                            continue;
                                        }
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw SystemStateOrchestrator1145.a(customSystemException);
                                    }
                                    transactionOrchestrator10172 = new TransactionOrchestrator1017(e);
                                    try {
                                        if (transactionOrchestrator10172.equals(systemConfigurationOrchestrator)) {
                                            continue;
                                        }
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw SystemStateOrchestrator1145.a(customSystemException);
                                    }
                                    boolean bl2 = transactionOrchestrator10172.B(ReflectionMetadataResolver.UQ);
                                    try {
                                        try {
                                            if (transactionOrchestrator10172.R() && !bl2) {
                                                continue;
                                            }
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw SystemStateOrchestrator1145.a(customSystemException);
                                        }
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw SystemStateOrchestrator1145.a(customSystemException);
                                    }
                                    try {
                                        block49: {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (!transactionOrchestrator10172.m()) continue;
                                                            if (!bl2) break block48;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw SystemStateOrchestrator1145.a(customSystemException);
                                                        }
                                                        if (transactionOrchestrator10172.G() != 0.0) break block49;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw SystemStateOrchestrator1145.a(customSystemException);
                                                    }
                                                    if (transactionOrchestrator10172.x() != 0.0) break block49;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw SystemStateOrchestrator1145.a(customSystemException);
                                                }
                                                if (transactionOrchestrator10172.o() == 0.0) break block48;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw SystemStateOrchestrator1145.a(customSystemException);
                                            }
                                        }
                                        bl = true;
                                        break block50;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw SystemStateOrchestrator1145.a(customSystemException);
                                    }
                                }
                                bl = false;
                            }
                            boolean bl3 = bl;
                            double d7 = _Y.Y(transactionOrchestrator1017, transactionOrchestrator10172);
                            float f4 = (float)Math.min(d7 / 100.0, 1.0);
                            if (bl3) {
                                f4 *= 2.0f;
                            }
                            float f5 = transactionOrchestrator10172.g() + f4;
                            oQ oQ2 = ((oQ)transactionOrchestrator10172.L()).B(f5, f5, f5).r(transactionOrchestrator10172.G(), transactionOrchestrator10172.x(), transactionOrchestrator10172.o());
                            networkPacketInterceptor1107 = oQ2.x(contextualEventDispatcher, contextualEventDispatcher3);
                            try {
                                try {
                                    if (!oQ2.j(contextualEventDispatcher)) break block51;
                                    if (0.0 < d5) break block52;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw SystemStateOrchestrator1145.a(customSystemException);
                                }
                                if (d5 != 0.0) continue;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SystemStateOrchestrator1145.a(customSystemException);
                            }
                        }
                        objectLifecycleTracker = transactionOrchestrator10172;
                        d5 = 0.0;
                        continue;
                    }
                    if (!networkPacketInterceptor1107.r()) continue;
                    d6 = contextualEventDispatcher.x(networkPacketInterceptor1107.i());
                    try {
                        try {
                            try {
                                try {
                                    if (!(d6 < d5) && d5 != 0.0) continue;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw SystemStateOrchestrator1145.a(customSystemException);
                                }
                                if (!transactionOrchestrator10172.equals(transactionOrchestrator1017.o())) break block53;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SystemStateOrchestrator1145.a(customSystemException);
                            }
                            if (transactionOrchestrator10172.p()) break block53;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SystemStateOrchestrator1145.a(customSystemException);
                        }
                        if (d5 != 0.0) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SystemStateOrchestrator1145.a(customSystemException);
                    }
                    objectLifecycleTracker = transactionOrchestrator10172;
                    continue;
                }
                objectLifecycleTracker = transactionOrchestrator10172;
                d5 = d6;
            }
            try {
                try {
                    try {
                        if (!(d5 < d4) || objectLifecycleTracker == null) break block54;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SystemStateOrchestrator1145.a(customSystemException);
                    }
                    if (objectLifecycleTracker.Y()) break block54;
                }
                catch (CustomSystemException customSystemException) {
                    throw SystemStateOrchestrator1145.a(customSystemException);
                }
                return objectLifecycleTracker;
            }
            catch (CustomSystemException customSystemException) {
                throw SystemStateOrchestrator1145.a(customSystemException);
            }
        }
        return null;
    }

    public static NetworkPacketInterceptor1107 N(TransactionOrchestrator1017 transactionOrchestrator1017, double d2, float f, boolean bl) {
        return SystemStateOrchestrator1145.h(transactionOrchestrator1017, d2, f, bl, null);
    }

    public static NetworkPacketInterceptor1107 W(NetworkProtocolNegotiator networkProtocolNegotiator, Qh qh, boolean bl) {
        boolean bl2;
        boolean bl3;
        ContextualEventDispatcher contextualEventDispatcher;
        ContextualEventDispatcher contextualEventDispatcher2;
        NetworkProtocolNegotiator networkProtocolNegotiator2;
        float f = qh.S();
        float f2 = qh.q();
        double d2 = qh.F();
        double d3 = qh.V() + (double)qh.E();
        double d4 = qh.B();
        ContextualEventDispatcher contextualEventDispatcher3 = ContextualEventDispatcher.N(d2, d3, d4);
        float f3 = AdaptiveComputationEngine.S(-f2 * ((float)Math.PI / 180) - (float)Math.PI);
        float f4 = AdaptiveComputationEngine.D(-f2 * ((float)Math.PI / 180) - (float)Math.PI);
        float f5 = -AdaptiveComputationEngine.S(-f * ((float)Math.PI / 180));
        float f6 = AdaptiveComputationEngine.D(-f * ((float)Math.PI / 180));
        float f7 = f4 * f5;
        float f8 = f3 * f5;
        double d5 = 5.0;
        ContextualEventDispatcher contextualEventDispatcher4 = contextualEventDispatcher3.A((double)f7 * d5, (double)f6 * d5, (double)f8 * d5);
        try {
            networkProtocolNegotiator2 = networkProtocolNegotiator;
            contextualEventDispatcher2 = contextualEventDispatcher3;
            contextualEventDispatcher = contextualEventDispatcher4;
            bl3 = bl;
            bl2 = !bl;
        }
        catch (CustomSystemException customSystemException) {
            throw SystemStateOrchestrator1145.a(customSystemException);
        }
        return networkProtocolNegotiator2.g(contextualEventDispatcher2, contextualEventDispatcher, bl3, bl2, false, qh);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static NetworkPacketInterceptor1107 J(TransactionOrchestrator1017 transactionOrchestrator1017, float f, float f2, boolean bl, @Nullable Predicate<CryptographicTransformer> predicate) {
        NetworkPacketInterceptor1107 networkPacketInterceptor1107;
        block10: {
            block9: {
                float f3 = 1.0f;
                networkPacketInterceptor1107 = new NetworkPacketInterceptor1107(null);
                if (!transactionOrchestrator1017.r()) break block10;
                double d2 = ApplicationLifecycleManager.n().y();
                networkPacketInterceptor1107 = transactionOrchestrator1017.K(d2, f3);
                ContextualEventDispatcher contextualEventDispatcher = transactionOrchestrator1017.Y(f3);
                boolean bl2 = false;
                double d3 = d2;
                if (d2 > 3.0) {
                    bl2 = true;
                }
                d2 = f;
                d3 = f;
                d3 *= d3;
                if (networkPacketInterceptor1107.r()) {
                    double d4;
                    d2 = d4 = (double)ApplicationLifecycleManager.n().y() + ((double)f - 3.0);
                    d3 = transactionOrchestrator1017.K(d4, 1.0f).i().R(contextualEventDispatcher);
                    if (GeometryCalculator.C() >= 37) {
                        d3 *= d3;
                    }
                }
                ContextualEventDispatcher contextualEventDispatcher2 = transactionOrchestrator1017.F(1.0f);
                ContextualEventDispatcher contextualEventDispatcher3 = contextualEventDispatcher.A(contextualEventDispatcher2.X() * d2, contextualEventDispatcher2.F() * d2, contextualEventDispatcher2.f() * d2);
                float f4 = 1.0f;
                oQ oQ2 = ((oQ)transactionOrchestrator1017.L()).N(contextualEventDispatcher2.f(d2)).N(f4, f4, f4);
                ConfigurationLoadBalancer configurationLoadBalancer = ResourceAllocator1162.a(transactionOrchestrator1017, contextualEventDispatcher, contextualEventDispatcher3, oQ2, d3, f2, predicate);
                if (configurationLoadBalancer.r()) {
                    double d5;
                    block8: {
                        ContextualEventDispatcher contextualEventDispatcher4 = configurationLoadBalancer.i();
                        d5 = contextualEventDispatcher.v(contextualEventDispatcher4);
                        try {
                            if (!bl2 || !(d5 > (double)(f * f))) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SystemStateOrchestrator1145.a(customSystemException);
                        }
                        networkPacketInterceptor1107 = TransactionValidator2324.T(contextualEventDispatcher4, StreamProcessingEngine1677.G(contextualEventDispatcher2.X(), contextualEventDispatcher2.F(), contextualEventDispatcher2.f()), ReflectionUtilityBroker.E(contextualEventDispatcher4));
                        break block9;
                    }
                    try {
                        if (!(d5 < d3) && !networkPacketInterceptor1107.Y()) break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SystemStateOrchestrator1145.a(customSystemException);
                    }
                    networkPacketInterceptor1107 = configurationLoadBalancer;
                }
            }
            return networkPacketInterceptor1107;
        }
        return networkPacketInterceptor1107;
    }

    public static NetworkPacketInterceptor1107 h(TransactionOrchestrator1017 transactionOrchestrator1017, double d2, float f, boolean bl, @Nullable Predicate<CryptographicTransformer> predicate) {
        NetworkPacketInterceptor1107 networkPacketInterceptor1107;
        block46: {
            block56: {
                ContextualEventDispatcher contextualEventDispatcher;
                ObjectLifecycleTracker objectLifecycleTracker;
                block57: {
                    ContextualEventDispatcher contextualEventDispatcher2;
                    double d3;
                    double d4;
                    ConnectionConfigurationResolver connectionConfigurationResolver;
                    float f2;
                    block49: {
                        block47: {
                            block48: {
                                try {
                                    if (GeometryCalculator.C() >= 35) {
                                        return SystemStateOrchestrator1145.J(transactionOrchestrator1017, (float)d2, f, bl, predicate);
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw SystemStateOrchestrator1145.a(customSystemException);
                                }
                                networkPacketInterceptor1107 = new NetworkPacketInterceptor1107(null);
                                f2 = 1.0f;
                                connectionConfigurationResolver = ApplicationLifecycleManager.c();
                                StreamTransformationProcessor streamTransformationProcessor = ApplicationLifecycleManager.n();
                                try {
                                    if (!transactionOrchestrator1017.r() || !connectionConfigurationResolver.r()) break block46;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw SystemStateOrchestrator1145.a(customSystemException);
                                }
                                d4 = streamTransformationProcessor.y();
                                if (d2 > 4.5) {
                                    d4 += d2 - 3.0;
                                }
                                networkPacketInterceptor1107 = transactionOrchestrator1017.K(d4, f2);
                                d3 = d4;
                                contextualEventDispatcher2 = transactionOrchestrator1017.I(f2);
                                try {
                                    if (bl) break block47;
                                    if (!streamTransformationProcessor.f()) break block48;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw SystemStateOrchestrator1145.a(customSystemException);
                                }
                                d4 = 6.0;
                                d3 = 6.0;
                                break block47;
                            }
                            if (d4 > 3.0) {
                                d3 = 3.0;
                            }
                            d4 = d3;
                        }
                        try {
                            if (networkPacketInterceptor1107 == null || !networkPacketInterceptor1107.r()) break block49;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SystemStateOrchestrator1145.a(customSystemException);
                        }
                        d3 = networkPacketInterceptor1107.i().x(contextualEventDispatcher2);
                    }
                    ContextualEventDispatcher contextualEventDispatcher3 = transactionOrchestrator1017.F(f2);
                    ContextualEventDispatcher contextualEventDispatcher4 = contextualEventDispatcher2.A(contextualEventDispatcher3.X() * d4, contextualEventDispatcher3.F() * d4, contextualEventDispatcher3.f() * d4);
                    objectLifecycleTracker = null;
                    contextualEventDispatcher = null;
                    float f3 = 1.0f;
                    List list = connectionConfigurationResolver.R(transactionOrchestrator1017, ((oQ)transactionOrchestrator1017.L()).r(contextualEventDispatcher3.X() * d4, contextualEventDispatcher3.F() * d4, contextualEventDispatcher3.f() * d4).B(1.0, 1.0, 1.0));
                    double d5 = d3;
                    SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                    for (Object e : list) {
                        double d6;
                        NetworkPacketInterceptor1107 networkPacketInterceptor11072;
                        CryptographicTransformer cryptographicTransformer;
                        block55: {
                            block51: {
                                ContextualEventDispatcher contextualEventDispatcher5;
                                block54: {
                                    block53: {
                                        block52: {
                                            cryptographicTransformer = new CryptographicTransformer(e);
                                            try {
                                                if (cryptographicTransformer.equals(systemConfigurationOrchestrator)) {
                                                    continue;
                                                }
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw SystemStateOrchestrator1145.a(customSystemException);
                                            }
                                            try {
                                                try {
                                                    if (predicate != null && !predicate.test(cryptographicTransformer)) {
                                                        continue;
                                                    }
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw SystemStateOrchestrator1145.a(customSystemException);
                                                }
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw SystemStateOrchestrator1145.a(customSystemException);
                                            }
                                            if (!cryptographicTransformer.m()) continue;
                                            float f4 = cryptographicTransformer.g() + f;
                                            oQ oQ2 = cryptographicTransformer.L().B(f4, f4, f4);
                                            networkPacketInterceptor11072 = oQ2.x(contextualEventDispatcher2, contextualEventDispatcher4);
                                            try {
                                                try {
                                                    if (!oQ2.j(contextualEventDispatcher2)) break block51;
                                                    if (0.0 < d5) break block52;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw SystemStateOrchestrator1145.a(customSystemException);
                                                }
                                                if (d5 != 0.0) continue;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw SystemStateOrchestrator1145.a(customSystemException);
                                            }
                                        }
                                        objectLifecycleTracker = cryptographicTransformer;
                                        try {
                                            try {
                                                if (networkPacketInterceptor11072 != null && !networkPacketInterceptor11072.Y()) break block53;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw SystemStateOrchestrator1145.a(customSystemException);
                                            }
                                            contextualEventDispatcher5 = contextualEventDispatcher2;
                                            break block54;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw SystemStateOrchestrator1145.a(customSystemException);
                                        }
                                    }
                                    contextualEventDispatcher5 = networkPacketInterceptor11072.i();
                                }
                                contextualEventDispatcher = contextualEventDispatcher5;
                                d5 = 0.0;
                                continue;
                            }
                            try {
                                if (networkPacketInterceptor11072 == null || !networkPacketInterceptor11072.r()) continue;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SystemStateOrchestrator1145.a(customSystemException);
                            }
                            d6 = contextualEventDispatcher2.x(networkPacketInterceptor11072.i());
                            try {
                                try {
                                    try {
                                        try {
                                            if (!(d6 < d5) && d5 != 0.0) continue;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw SystemStateOrchestrator1145.a(customSystemException);
                                        }
                                        if (!cryptographicTransformer.equals(transactionOrchestrator1017.o())) break block55;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw SystemStateOrchestrator1145.a(customSystemException);
                                    }
                                    if (cryptographicTransformer.p()) break block55;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw SystemStateOrchestrator1145.a(customSystemException);
                                }
                                if (d5 != 0.0) continue;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SystemStateOrchestrator1145.a(customSystemException);
                            }
                            objectLifecycleTracker = cryptographicTransformer;
                            contextualEventDispatcher = networkPacketInterceptor11072.i();
                            continue;
                        }
                        objectLifecycleTracker = cryptographicTransformer;
                        contextualEventDispatcher = networkPacketInterceptor11072.i();
                        d5 = d6;
                    }
                    try {
                        try {
                            try {
                                try {
                                    if (objectLifecycleTracker == null || !objectLifecycleTracker.r()) break block56;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw SystemStateOrchestrator1145.a(customSystemException);
                                }
                                if (d5 < d3) break block57;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SystemStateOrchestrator1145.a(customSystemException);
                            }
                            if (networkPacketInterceptor1107 == null) break block57;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SystemStateOrchestrator1145.a(customSystemException);
                        }
                        if (!networkPacketInterceptor1107.Y()) break block56;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SystemStateOrchestrator1145.a(customSystemException);
                    }
                }
                networkPacketInterceptor1107 = NetworkPacketInterceptor1107.k((CryptographicTransformer)objectLifecycleTracker, contextualEventDispatcher);
            }
            return networkPacketInterceptor1107;
        }
        return networkPacketInterceptor1107;
    }
}

