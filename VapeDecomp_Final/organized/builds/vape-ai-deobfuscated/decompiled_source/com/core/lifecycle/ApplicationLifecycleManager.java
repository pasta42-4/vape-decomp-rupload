/*
 * Decompiled with CFR 0.152.
 */
package com.core.lifecycle;

import a.Df;
import a.E8;
import a.Ec;
import com.app.caching.CacheInvalidationStrategy2313;
import com.app.communication.DataChannelMediator;
import com.app.data.processing.StreamTransformationProcessor;
import com.app.data.validation.DataIntegrityValidator;
import com.app.resources.ResourceAllocationHandler;
import com.app.transaction.mediator.TransactionMediator2431;
import com.core.computation.AbstractComputationKernel;
import com.data.compression.CompressionAlgorithmManager;
import com.data.streaming.StreamProcessingOrchestrator1917;
import com.event.core.EventDispatchOrchestrator1391;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.logging.interceptor.LoggingInterceptor1506;
import com.math.computation.NumericComputationEngine1131;
import com.math.geometry.GeometricCalculator1575;
import com.math.geometry.GeometryCalculator;
import com.messaging.core.MessageInterceptor;
import com.messaging.validation.MessageValidationProcessor;
import com.network.config.ConnectionConfigurationResolver;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.network.protocol.NetworkProtocolHandler1842;
import com.reflection.resolution.MethodResolutionMediator;
import com.security.auth.AuthorizationManager;
import com.security.encryption.StreamEncryptionHandler;
import com.security.event.SecureEventOrchestrator;
import com.security.transform.CryptographicTransformer;
import com.security.transform.SecureDataTransformer881;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.system.monitoring.ExecutionStateTracker;
import com.system.resource.ResourceAllocator1727;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.management.TransactionOrchestrator1017;
import com.workload.balancing.AdaptiveWorkloadBalancer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ApplicationLifecycleManager
extends ObjectLifecycleTracker {
    private static AbstractComputationKernel[] a;
    private static Object g;

    public static ResourceAllocator1727 X() {
        return new ResourceAllocator1727(CompressionAlgorithmManager.h(ApplicationLifecycleManager.U.u().p, ApplicationLifecycleManager.g()));
    }

    static {
        if (ApplicationLifecycleManager.i() == null) {
            ApplicationLifecycleManager.w(new AbstractComputationKernel[1]);
        }
    }

    public static ConnectionConfigurationResolver c() {
        return new ConnectionConfigurationResolver(ApplicationLifecycleManager.U.u().p.F(ApplicationLifecycleManager.g()));
    }

    public static void v(TransactionOrchestrator1017 transactionOrchestrator1017) {
        Object object;
        Object object2;
        CompressionAlgorithmManager compressionAlgorithmManager;
        try {
            compressionAlgorithmManager = ApplicationLifecycleManager.U.u().p;
            object2 = ApplicationLifecycleManager.g();
            object = transactionOrchestrator1017 == null ? null : transactionOrchestrator1017.M();
        }
        catch (CustomSystemException customSystemException) {
            throw ApplicationLifecycleManager.a(customSystemException);
        }
        compressionAlgorithmManager.u(object2, object);
    }

    public static AuthorizationManager y() {
        return new AuthorizationManager(ApplicationLifecycleManager.U.u().p.J(ApplicationLifecycleManager.g()));
    }

    public static void g(int n) {
        CompressionAlgorithmManager.n(ApplicationLifecycleManager.U.u().p, ApplicationLifecycleManager.g(), n);
    }

    public static StreamProcessingOrchestrator1917 k() {
        return new StreamProcessingOrchestrator1917(ApplicationLifecycleManager.U.u().p.I(ApplicationLifecycleManager.g()));
    }

    public static int F() {
        return CompressionAlgorithmManager.Q(ApplicationLifecycleManager.U.u().p, ApplicationLifecycleManager.g());
    }

    public static SecureDataTransformer881 g() {
        try {
            if (GeometryCalculator.C() == 13) {
                return SecureDataTransformer881.f();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ApplicationLifecycleManager.a(customSystemException);
        }
        return new SecureDataTransformer881(CompressionAlgorithmManager.H(ApplicationLifecycleManager.U.u().p, ApplicationLifecycleManager.g()));
    }

    public static void N() {
        CompressionAlgorithmManager.Q(ApplicationLifecycleManager.U.u().p, ApplicationLifecycleManager.g());
    }

    public static AbstractComputationKernel[] i() {
        return a;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static Ec U() {
        return new Ec(ApplicationLifecycleManager.U.u().p.H(ApplicationLifecycleManager.g()));
    }

    public static void Y() {
        try {
            ApplicationLifecycleManager.U.u().p.c(ApplicationLifecycleManager.g());
            if (GeometryCalculator.C() >= 35) {
                ApplicationLifecycleManager.k().M();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ApplicationLifecycleManager.a(customSystemException);
        }
    }

    public static MessageInterceptor G() {
        return new MessageInterceptor(CompressionAlgorithmManager.J(TemporalMetadataResolver.h.u().p, ApplicationLifecycleManager.g()));
    }

    public static NumericComputationEngine1131 r() {
        NumericComputationEngine1131 numericComputationEngine1131;
        try {
            numericComputationEngine1131 = GeometryCalculator.C() == 13 ? NumericComputationEngine1131.a() : new NumericComputationEngine1131(ApplicationLifecycleManager.U.u().p.D(ApplicationLifecycleManager.g()));
        }
        catch (CustomSystemException customSystemException) {
            throw ApplicationLifecycleManager.a(customSystemException);
        }
        return numericComputationEngine1131;
    }

    public static void e(NetworkPacketInterceptor1107 networkPacketInterceptor1107) {
        ApplicationLifecycleManager.U.u().p.f(ApplicationLifecycleManager.g(), networkPacketInterceptor1107.M());
    }

    public static boolean E() {
        return CompressionAlgorithmManager.z(ApplicationLifecycleManager.U.u().p, ApplicationLifecycleManager.g());
    }

    public static void d(boolean bl) {
        CompressionAlgorithmManager.r(ApplicationLifecycleManager.U.u().p, ApplicationLifecycleManager.g(), bl);
    }

    public static CryptographicTransformer M() {
        return new CryptographicTransformer(ApplicationLifecycleManager.U.u().p.p(ApplicationLifecycleManager.g()));
    }

    public static ExecutionStateTracker N() {
        return new ExecutionStateTracker(ApplicationLifecycleManager.U.u().p.Y(ApplicationLifecycleManager.g()));
    }

    public static Object g() {
        try {
            if (g == null) {
                g = ApplicationLifecycleManager.U.u().p.s();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ApplicationLifecycleManager.a(customSystemException);
        }
        return g;
    }

    public static void b(SecureEventOrchestrator secureEventOrchestrator) {
        ApplicationLifecycleManager.U.u().p.j(ApplicationLifecycleManager.g(), secureEventOrchestrator.M());
    }

    public static void w(AbstractComputationKernel[] abstractComputationKernelArray) {
        a = abstractComputationKernelArray;
    }

    public static void G(boolean bl) {
        try {
            if (GeometryCalculator.C() >= 35) {
                ApplicationLifecycleManager.l().M(bl);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ApplicationLifecycleManager.a(customSystemException);
        }
        CompressionAlgorithmManager.F(ApplicationLifecycleManager.U.u().p, ApplicationLifecycleManager.g(), bl);
    }

    public static MessageValidationProcessor b() {
        return new MessageValidationProcessor(ApplicationLifecycleManager.U.u().p.b(ApplicationLifecycleManager.g()));
    }

    public static int e() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return ApplicationLifecycleManager.l().z();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ApplicationLifecycleManager.a(customSystemException);
        }
        return ApplicationLifecycleManager.U.u().p.j(ApplicationLifecycleManager.g());
    }

    public static void c(int n) {
        try {
            if (GeometryCalculator.C() >= 35) {
                ApplicationLifecycleManager.l().c(n);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ApplicationLifecycleManager.a(customSystemException);
        }
        ApplicationLifecycleManager.U.u().p.x(ApplicationLifecycleManager.g(), n);
    }

    public static void E() {
        CompressionAlgorithmManager.s(ApplicationLifecycleManager.U.u().p, ApplicationLifecycleManager.g());
    }

    public static CacheInvalidationStrategy2313 J() {
        return new CacheInvalidationStrategy2313(CompressionAlgorithmManager.P(ApplicationLifecycleManager.U.u().p, ApplicationLifecycleManager.g()));
    }

    public static SystemConfigurationOrchestrator U() {
        return new SystemConfigurationOrchestrator(TemporalMetadataResolver.h.u().p.Q(ApplicationLifecycleManager.g()));
    }

    public static SecureEventOrchestrator X() {
        return new SecureEventOrchestrator(ApplicationLifecycleManager.U.u().p.s(ApplicationLifecycleManager.g()));
    }

    public static StreamTransformationProcessor n() {
        return new StreamTransformationProcessor(ApplicationLifecycleManager.U.u().p.i(ApplicationLifecycleManager.g()));
    }

    public static AdaptiveWorkloadBalancer l() {
        return new AdaptiveWorkloadBalancer(CompressionAlgorithmManager.n(ApplicationLifecycleManager.U.u().p, ApplicationLifecycleManager.g()));
    }

    public ApplicationLifecycleManager() {
        super(TemporalMetadataResolver.h.u().p.s());
    }

    public static MethodResolutionMediator G() {
        return new MethodResolutionMediator(CompressionAlgorithmManager.d(ApplicationLifecycleManager.U.u().p, ApplicationLifecycleManager.g()));
    }

    public static NetworkProtocolHandler1842 K() {
        return new NetworkProtocolHandler1842(CompressionAlgorithmManager.p(ApplicationLifecycleManager.U.u().p, ApplicationLifecycleManager.g()));
    }

    public static DataChannelMediator s() {
        return new DataChannelMediator(ApplicationLifecycleManager.U.u().p.R(ApplicationLifecycleManager.g()));
    }

    public static void x() {
        try {
            if (GeometryCalculator.C() >= 35) {
                ApplicationLifecycleManager.l().g();
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ApplicationLifecycleManager.a(customSystemException);
        }
        CompressionAlgorithmManager.k(ApplicationLifecycleManager.U.u().p, ApplicationLifecycleManager.g());
    }

    public static DataIntegrityValidator c() {
        return new DataIntegrityValidator(CompressionAlgorithmManager.a(ApplicationLifecycleManager.U.u().p, ApplicationLifecycleManager.g()));
    }

    public static int b() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return ApplicationLifecycleManager.l().x();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ApplicationLifecycleManager.a(customSystemException);
        }
        return ApplicationLifecycleManager.U.u().p.l(ApplicationLifecycleManager.g());
    }

    public static void U(int n) {
        try {
            if (GeometryCalculator.C() >= 35) {
                ApplicationLifecycleManager.l().b(n);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ApplicationLifecycleManager.a(customSystemException);
        }
        ApplicationLifecycleManager.U.u().p.P(ApplicationLifecycleManager.g(), n);
    }

    public static void F(MethodResolutionMediator methodResolutionMediator) {
        CompressionAlgorithmManager.U(ApplicationLifecycleManager.U.u().p, ApplicationLifecycleManager.g(), methodResolutionMediator.M());
    }

    public static TransactionMediator2431 O() {
        return new TransactionMediator2431(CompressionAlgorithmManager.f(ApplicationLifecycleManager.U.u().p, ApplicationLifecycleManager.g()));
    }

    public static Object V() {
        return ApplicationLifecycleManager.U.u().p.g(ApplicationLifecycleManager.g());
    }

    public static Df d() {
        try {
            if (!GameVersionEnumerator.MC_1_21_10.H()) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ApplicationLifecycleManager.a(customSystemException);
        }
        return new Df(ApplicationLifecycleManager.U.u().p.l(ApplicationLifecycleManager.g()));
    }

    public static void k(int n) {
        CompressionAlgorithmManager.I(ApplicationLifecycleManager.U.u().p, ApplicationLifecycleManager.g(), n);
    }

    public static int P() {
        return ApplicationLifecycleManager.U.u().p.G();
    }

    public static boolean g() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return ApplicationLifecycleManager.l().T();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ApplicationLifecycleManager.a(customSystemException);
        }
        return CompressionAlgorithmManager.C(ApplicationLifecycleManager.U.u().p, ApplicationLifecycleManager.g());
    }

    public static ResourceAllocationHandler K() {
        return new ResourceAllocationHandler(CompressionAlgorithmManager.u(ApplicationLifecycleManager.U.u().p, ApplicationLifecycleManager.g()));
    }

    public static LoggingInterceptor1506 k() {
        return new LoggingInterceptor1506(CompressionAlgorithmManager.S(ApplicationLifecycleManager.U.u().p, ApplicationLifecycleManager.g()));
    }

    public static GeometricCalculator1575 P() {
        return new GeometricCalculator1575();
    }

    public static StreamEncryptionHandler n() {
        return new StreamEncryptionHandler(CompressionAlgorithmManager.b(ApplicationLifecycleManager.U.u().p, ApplicationLifecycleManager.g()));
    }

    public static int K() {
        return CompressionAlgorithmManager.T(ApplicationLifecycleManager.U.u().p, ApplicationLifecycleManager.g());
    }

    public static NetworkPacketInterceptor1107 u() {
        return new NetworkPacketInterceptor1107(ApplicationLifecycleManager.U.u().p.f(ApplicationLifecycleManager.g()));
    }

    public static void r(Object object) {
        ApplicationLifecycleManager.U.u().p.l(ApplicationLifecycleManager.g(), object);
    }

    public static E8 X() {
        return new E8(ApplicationLifecycleManager.U.u().p.n(ApplicationLifecycleManager.g()));
    }

    public static EventDispatchOrchestrator1391 y() {
        return new EventDispatchOrchestrator1391(ApplicationLifecycleManager.U.u().p.X(ApplicationLifecycleManager.g()));
    }

    public static void n(Runnable runnable) {
        CompressionAlgorithmManager.J(ApplicationLifecycleManager.U.u().p).l(ApplicationLifecycleManager.g(), runnable);
    }

    public static boolean d() {
        return ApplicationLifecycleManager.U.u().p.S(ApplicationLifecycleManager.g());
    }

    public static void z(CryptographicTransformer cryptographicTransformer) {
        ApplicationLifecycleManager.U.u().p.i(ApplicationLifecycleManager.g(), cryptographicTransformer.M());
    }

    public static TransactionOrchestrator1017 g() {
        return new TransactionOrchestrator1017(ApplicationLifecycleManager.U.u().p.j(ApplicationLifecycleManager.g()));
    }

    public static boolean i() {
        return ApplicationLifecycleManager.U.u().p.u(ApplicationLifecycleManager.g());
    }
}

