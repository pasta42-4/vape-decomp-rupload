/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.app.resource.management;

import a.oQ;
import com.app.config.management.ConfigurationRegistry;
import com.app.data.processing.StreamTransformationProcessor;
import com.app.transaction.validation.TransactionValidator2324;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.streaming.StreamProcessingEngine1677;
import com.event.management.ContextualEventDispatcher;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.network.config.ConnectionConfigurationResolver;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.proxy.invocation.InvocationProxyManager;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.security.crypto.CryptographySessionManager;
import com.security.transform.CryptographicTransformer;
import com.system.config.AdaptiveConfigurationManager;
import com.system.config.ConfigurationLoadBalancer;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.management.TransactionOrchestrator1017;
import com.validation.core.ObjectValidator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import org.jetbrains.annotations.Nullable;

public class ResourceAllocator1162 {
    private static InvocationProxyManager K = null;
    private static CryptographySessionManager j = null;

    private static void E(float f, float f2) {
        block18: {
            float f3 = 1.0f;
            Object object = ApplicationLifecycleManager.g();
            StreamTransformationProcessor streamTransformationProcessor = ApplicationLifecycleManager.n();
            if (((ObjectLifecycleTracker)object).r()) {
                CryptographicTransformer cryptographicTransformer = new CryptographicTransformer(null);
                ApplicationLifecycleManager.z(cryptographicTransformer);
                double d2 = streamTransformationProcessor.y();
                ApplicationLifecycleManager.e(((TransactionOrchestrator1017)object).K(d2, f3));
                ContextualEventDispatcher contextualEventDispatcher = ((CryptographicTransformer)object).Y(f3);
                double d3 = d2;
                boolean bl = false;
                if (d2 > 3.0) {
                    bl = true;
                }
                d3 = f;
                d2 = f;
                d3 *= d3;
                if (ApplicationLifecycleManager.u().r()) {
                    double d4;
                    d2 = d4 = (double)streamTransformationProcessor.y() + ((double)f - 3.0);
                    d3 = ((TransactionOrchestrator1017)object).K(d4, 1.0f).i().R(contextualEventDispatcher);
                    if (GeometryCalculator.C() >= 37) {
                        d3 *= d3;
                    }
                }
                ContextualEventDispatcher contextualEventDispatcher2 = ((TransactionOrchestrator1017)object).F(1.0f);
                ContextualEventDispatcher contextualEventDispatcher3 = contextualEventDispatcher.A(contextualEventDispatcher2.X() * d2, contextualEventDispatcher2.F() * d2, contextualEventDispatcher2.f() * d2);
                double d5 = 1.0;
                oQ oQ2 = ((oQ)((TransactionOrchestrator1017)object).L()).N(contextualEventDispatcher2.f(d2)).N(d5, d5, d5);
                ConfigurationLoadBalancer configurationLoadBalancer = ResourceAllocator1162.a((CryptographicTransformer)object, contextualEventDispatcher, contextualEventDispatcher3, oQ2, d3, f2, null);
                if (configurationLoadBalancer.r()) {
                    double d6;
                    CryptographicTransformer cryptographicTransformer2;
                    block17: {
                        cryptographicTransformer2 = configurationLoadBalancer.O();
                        ContextualEventDispatcher contextualEventDispatcher4 = configurationLoadBalancer.i();
                        d6 = contextualEventDispatcher.v(contextualEventDispatcher4);
                        try {
                            try {
                                if (!bl || !(d6 > (double)(f * f))) break block17;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceAllocator1162.a(customSystemException);
                            }
                            ApplicationLifecycleManager.e(TransactionValidator2324.T(contextualEventDispatcher4, StreamProcessingEngine1677.G(contextualEventDispatcher2.X(), contextualEventDispatcher2.F(), contextualEventDispatcher2.f()), ReflectionUtilityBroker.E(contextualEventDispatcher4)));
                            break block18;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocator1162.a(customSystemException);
                        }
                    }
                    try {
                        block19: {
                            try {
                                try {
                                    try {
                                        if (!(d6 < d3) && !ApplicationLifecycleManager.u().Y()) break block18;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ResourceAllocator1162.a(customSystemException);
                                    }
                                    ApplicationLifecycleManager.e(configurationLoadBalancer);
                                    if (cryptographicTransformer2.B(ReflectionMetadataResolver.Ut)) break block19;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ResourceAllocator1162.a(customSystemException);
                                }
                                if (!cryptographicTransformer2.B(ReflectionMetadataResolver.F8)) break block18;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceAllocator1162.a(customSystemException);
                            }
                        }
                        ApplicationLifecycleManager.z(cryptographicTransformer2);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocator1162.a(customSystemException);
                    }
                }
            }
        }
    }

    public static void O(float f, float f2) {
        try {
            if (ConfigurationRegistry.s.A()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocator1162.a(customSystemException);
        }
        try {
            if (GeometryCalculator.C() >= 50) {
                ResourceAllocator1162.V(f, f2);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocator1162.a(customSystemException);
        }
        try {
            if (GeometryCalculator.C() >= 35) {
                ResourceAllocator1162.E(f, f2);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocator1162.a(customSystemException);
        }
        ResourceAllocator1162.v(f, f2);
    }

    private static void V(float f, float f2) {
        block17: {
            float f3 = 1.0f;
            Object object = ApplicationLifecycleManager.g();
            StreamTransformationProcessor streamTransformationProcessor = ApplicationLifecycleManager.n();
            if (((ObjectLifecycleTracker)object).r()) {
                CryptographicTransformer cryptographicTransformer = new CryptographicTransformer(null);
                ApplicationLifecycleManager.z(cryptographicTransformer);
                double d2 = streamTransformationProcessor.y();
                ApplicationLifecycleManager.e(((TransactionOrchestrator1017)object).K(d2, f3));
                ContextualEventDispatcher contextualEventDispatcher = ((CryptographicTransformer)object).Y(f3);
                double d3 = d2;
                boolean bl = false;
                if (d2 > 3.0) {
                    bl = true;
                }
                d3 = f;
                d2 = f;
                d3 *= d3;
                if (ApplicationLifecycleManager.u().r()) {
                    double d4 = (double)streamTransformationProcessor.y() + ((double)f - 3.0);
                    d3 = ((TransactionOrchestrator1017)object).K(d4, 1.0f).i().R(contextualEventDispatcher);
                    d3 *= d3;
                }
                ContextualEventDispatcher contextualEventDispatcher2 = ((TransactionOrchestrator1017)object).F(1.0f);
                ContextualEventDispatcher contextualEventDispatcher3 = contextualEventDispatcher.A(contextualEventDispatcher2.X() * d2, contextualEventDispatcher2.F() * d2, contextualEventDispatcher2.f() * d2);
                double d5 = 1.0;
                oQ oQ2 = ((oQ)((TransactionOrchestrator1017)object).L()).N(contextualEventDispatcher2.f(d2)).N(d5, d5, d5);
                ConfigurationLoadBalancer configurationLoadBalancer = ResourceAllocator1162.a((CryptographicTransformer)object, contextualEventDispatcher, contextualEventDispatcher3, oQ2, d3, f2, null);
                if (configurationLoadBalancer.r()) {
                    double d6;
                    CryptographicTransformer cryptographicTransformer2;
                    block16: {
                        cryptographicTransformer2 = configurationLoadBalancer.O();
                        ContextualEventDispatcher contextualEventDispatcher4 = configurationLoadBalancer.i();
                        d6 = contextualEventDispatcher.v(contextualEventDispatcher4);
                        try {
                            try {
                                if (!bl || !(d6 > (double)(f * f))) break block16;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceAllocator1162.a(customSystemException);
                            }
                            ApplicationLifecycleManager.e(TransactionValidator2324.T(contextualEventDispatcher4, StreamProcessingEngine1677.G(contextualEventDispatcher2.X(), contextualEventDispatcher2.F(), contextualEventDispatcher2.f()), ReflectionUtilityBroker.E(contextualEventDispatcher4)));
                            break block17;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocator1162.a(customSystemException);
                        }
                    }
                    try {
                        block18: {
                            try {
                                try {
                                    try {
                                        if (!(d6 < d3) && !ApplicationLifecycleManager.u().Y()) break block17;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ResourceAllocator1162.a(customSystemException);
                                    }
                                    ApplicationLifecycleManager.e(configurationLoadBalancer);
                                    if (cryptographicTransformer2.B(ReflectionMetadataResolver.Ut)) break block18;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ResourceAllocator1162.a(customSystemException);
                                }
                                if (!cryptographicTransformer2.B(ReflectionMetadataResolver.F8)) break block17;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceAllocator1162.a(customSystemException);
                            }
                        }
                        ApplicationLifecycleManager.z(cryptographicTransformer2);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocator1162.a(customSystemException);
                    }
                }
            }
        }
    }

    public static ConfigurationLoadBalancer a(CryptographicTransformer cryptographicTransformer, ContextualEventDispatcher contextualEventDispatcher, ContextualEventDispatcher contextualEventDispatcher2, oQ oQ2, double d2, double d3, @Nullable Predicate<CryptographicTransformer> predicate) {
        ConnectionConfigurationResolver connectionConfigurationResolver = ApplicationLifecycleManager.c();
        double d4 = d2;
        CryptographicTransformer cryptographicTransformer2 = new CryptographicTransformer(null);
        ContextualEventDispatcher contextualEventDispatcher3 = new ContextualEventDispatcher(null);
        List list = connectionConfigurationResolver.R(cryptographicTransformer, oQ2);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            double d5;
            ContextualEventDispatcher contextualEventDispatcher4;
            CryptographicTransformer cryptographicTransformer3;
            block20: {
                cryptographicTransformer3 = new CryptographicTransformer(iterator.next());
                if (cryptographicTransformer3.I()) continue;
                try {
                    if (!cryptographicTransformer3.z()) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocator1162.a(customSystemException);
                }
                try {
                    try {
                        if (predicate != null && !predicate.test(cryptographicTransformer3)) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocator1162.a(customSystemException);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocator1162.a(customSystemException);
                }
                oQ oQ3 = cryptographicTransformer3.L().A((double)cryptographicTransformer3.g() + d3);
                Optional optional = oQ3.Z(contextualEventDispatcher, contextualEventDispatcher2);
                if (oQ3.J(contextualEventDispatcher)) {
                    cryptographicTransformer2 = new CryptographicTransformer(cryptographicTransformer3);
                    contextualEventDispatcher3 = new ContextualEventDispatcher(optional.orElse(contextualEventDispatcher));
                    d4 = 0.0;
                    continue;
                }
                if (!optional.isPresent()) continue;
                contextualEventDispatcher4 = new ContextualEventDispatcher(optional.get());
                d5 = contextualEventDispatcher.R(contextualEventDispatcher4);
                try {
                    try {
                        try {
                            if (!(d5 < d4) && d4 != 0.0) continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocator1162.a(customSystemException);
                        }
                        if (!cryptographicTransformer3.H().equals(cryptographicTransformer.H())) break block20;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocator1162.a(customSystemException);
                    }
                    if (d4 != 0.0) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocator1162.a(customSystemException);
                }
                cryptographicTransformer2 = new CryptographicTransformer(cryptographicTransformer3);
                contextualEventDispatcher3 = new ContextualEventDispatcher(contextualEventDispatcher4);
                continue;
            }
            cryptographicTransformer2 = new CryptographicTransformer(cryptographicTransformer3);
            contextualEventDispatcher3 = new ContextualEventDispatcher(contextualEventDispatcher4);
            d4 = d5;
        }
        try {
            if (cryptographicTransformer2.Y()) {
                return new ConfigurationLoadBalancer(null);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocator1162.a(customSystemException);
        }
        return ConfigurationLoadBalancer.s(cryptographicTransformer2, contextualEventDispatcher3);
    }

    private static void v(double d2, float f) {
        block36: {
            CryptographicTransformer cryptographicTransformer;
            ObjectLifecycleTracker objectLifecycleTracker;
            ContextualEventDispatcher contextualEventDispatcher;
            block43: {
                double d3;
                double d4;
                block42: {
                    float f2 = 1.0f;
                    Object object = ApplicationLifecycleManager.g();
                    ConnectionConfigurationResolver connectionConfigurationResolver = ApplicationLifecycleManager.c();
                    StreamTransformationProcessor streamTransformationProcessor = ApplicationLifecycleManager.n();
                    try {
                        if (!((ObjectLifecycleTracker)object).r() || !connectionConfigurationResolver.r()) break block36;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocator1162.a(customSystemException);
                    }
                    CryptographicTransformer cryptographicTransformer2 = new CryptographicTransformer(null);
                    ApplicationLifecycleManager.z(cryptographicTransformer2);
                    double d5 = streamTransformationProcessor.y();
                    NetworkPacketInterceptor1107 networkPacketInterceptor1107 = ((TransactionOrchestrator1017)object).K(d5, f2);
                    ApplicationLifecycleManager.e(networkPacketInterceptor1107);
                    d4 = d2;
                    ContextualEventDispatcher contextualEventDispatcher2 = ((TransactionOrchestrator1017)object).I(f2);
                    boolean bl = false;
                    d4 = d2;
                    d5 = d2;
                    if (d5 > 3.0) {
                        bl = true;
                    }
                    if (ApplicationLifecycleManager.u().r()) {
                        d4 = ((TransactionOrchestrator1017)object).K((double)streamTransformationProcessor.y() + (d2 - 3.0), f2).i().x(contextualEventDispatcher2);
                    }
                    if (d4 > 6.0) {
                        d4 = 6.0;
                    }
                    ContextualEventDispatcher contextualEventDispatcher3 = ((TransactionOrchestrator1017)object).F(f2);
                    ContextualEventDispatcher contextualEventDispatcher4 = contextualEventDispatcher2.A(contextualEventDispatcher3.X() * d5, contextualEventDispatcher3.F() * d5, contextualEventDispatcher3.f() * d5);
                    ApplicationLifecycleManager.U().s(cryptographicTransformer2);
                    contextualEventDispatcher = null;
                    float f3 = 1.0f;
                    List list = connectionConfigurationResolver.R((CryptographicTransformer)object, ((oQ)((TransactionOrchestrator1017)object).L()).r(contextualEventDispatcher3.X() * d5, contextualEventDispatcher3.F() * d5, contextualEventDispatcher3.f() * d5).B(f3, f3, f3));
                    d3 = d4;
                    for (int i = 0; i < list.size(); ++i) {
                        double d6;
                        NetworkPacketInterceptor1107 networkPacketInterceptor11072;
                        block41: {
                            block37: {
                                ContextualEventDispatcher contextualEventDispatcher5;
                                block40: {
                                    block39: {
                                        objectLifecycleTracker = new CryptographicTransformer(list.get(i));
                                        if (!((CryptographicTransformer)objectLifecycleTracker).m()) continue;
                                        float f4 = ((CryptographicTransformer)objectLifecycleTracker).g() + f;
                                        oQ oQ2 = ((CryptographicTransformer)objectLifecycleTracker).L().B(f4, f4, f4);
                                        networkPacketInterceptor11072 = oQ2.x(contextualEventDispatcher2, contextualEventDispatcher4);
                                        try {
                                            try {
                                                block38: {
                                                    try {
                                                        try {
                                                            if (!oQ2.j(contextualEventDispatcher2)) break block37;
                                                            if (0.0 < d3) break block38;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw ResourceAllocator1162.a(customSystemException);
                                                        }
                                                        if (d3 != 0.0) continue;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw ResourceAllocator1162.a(customSystemException);
                                                    }
                                                }
                                                ApplicationLifecycleManager.U().s((CryptographicTransformer)objectLifecycleTracker);
                                                if (!networkPacketInterceptor11072.Y()) break block39;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ResourceAllocator1162.a(customSystemException);
                                            }
                                            contextualEventDispatcher5 = new ContextualEventDispatcher(contextualEventDispatcher2);
                                            break block40;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ResourceAllocator1162.a(customSystemException);
                                        }
                                    }
                                    contextualEventDispatcher5 = networkPacketInterceptor11072.i();
                                }
                                contextualEventDispatcher = contextualEventDispatcher5;
                                d3 = 0.0;
                                continue;
                            }
                            if (!networkPacketInterceptor11072.r()) continue;
                            d6 = contextualEventDispatcher2.x(networkPacketInterceptor11072.i());
                            try {
                                try {
                                    try {
                                        try {
                                            if (!(d6 < d3) && d3 != 0.0) continue;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ResourceAllocator1162.a(customSystemException);
                                        }
                                        if (!objectLifecycleTracker.equals(((CryptographicTransformer)object).o())) break block41;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ResourceAllocator1162.a(customSystemException);
                                    }
                                    if (((CryptographicTransformer)objectLifecycleTracker).p()) break block41;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ResourceAllocator1162.a(customSystemException);
                                }
                                if (d3 != 0.0) continue;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceAllocator1162.a(customSystemException);
                            }
                            ApplicationLifecycleManager.U().s((CryptographicTransformer)objectLifecycleTracker);
                            contextualEventDispatcher = networkPacketInterceptor11072.i();
                            continue;
                        }
                        ApplicationLifecycleManager.U().s((CryptographicTransformer)objectLifecycleTracker);
                        contextualEventDispatcher = networkPacketInterceptor11072.i();
                        d3 = d6;
                    }
                    cryptographicTransformer = ApplicationLifecycleManager.U().A();
                    try {
                        try {
                            try {
                                if (GeometryCalculator.C() <= 13 || !cryptographicTransformer.r()) break block42;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceAllocator1162.a(customSystemException);
                            }
                            if (!bl) break block42;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocator1162.a(customSystemException);
                        }
                        if (!(contextualEventDispatcher2.x(contextualEventDispatcher) > d2)) break block42;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocator1162.a(customSystemException);
                    }
                    ApplicationLifecycleManager.U().s(cryptographicTransformer2);
                    objectLifecycleTracker = NetworkPacketInterceptor1107.Q(ObjectValidator.u(), contextualEventDispatcher, new AdaptiveConfigurationManager(null), ReflectionUtilityBroker.E(contextualEventDispatcher));
                    ApplicationLifecycleManager.e((NetworkPacketInterceptor1107)objectLifecycleTracker);
                    cryptographicTransformer = ApplicationLifecycleManager.U().A();
                }
                try {
                    try {
                        if (!cryptographicTransformer.r()) break block36;
                        if (d3 < d4) break block43;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocator1162.a(customSystemException);
                    }
                    if (!ApplicationLifecycleManager.u().Y()) break block36;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocator1162.a(customSystemException);
                }
            }
            objectLifecycleTracker = NetworkPacketInterceptor1107.k(cryptographicTransformer, contextualEventDispatcher);
            try {
                try {
                    ApplicationLifecycleManager.e((NetworkPacketInterceptor1107)objectLifecycleTracker);
                    if (!cryptographicTransformer.B(ReflectionMetadataResolver.Ut) && !cryptographicTransformer.B(ReflectionMetadataResolver.F8)) break block36;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocator1162.a(customSystemException);
                }
                ApplicationLifecycleManager.z(cryptographicTransformer);
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocator1162.a(customSystemException);
            }
        }
    }

    public static void w(boolean bl) {
        block13: {
            float f;
            block12: {
                try {
                    if (K == null) {
                        K = TemporalMetadataResolver.h.U().K(InvocationProxyManager.class);
                        j = TemporalMetadataResolver.h.U().K(CryptographySessionManager.class);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocator1162.a(customSystemException);
                }
                try {
                    if (ApplicationLifecycleManager.U().Y()) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocator1162.a(customSystemException);
                }
                try {
                    try {
                        if (K.Z() && !K.y().S().booleanValue()) break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocator1162.a(customSystemException);
                    }
                    if (!j.Z()) break block13;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocator1162.a(customSystemException);
                }
            }
            float f2 = (float)K.v();
            try {
                f = bl ? 0.0f : j.F();
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocator1162.a(customSystemException);
            }
            float f3 = f;
            ResourceAllocator1162.O(f2, f3);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

