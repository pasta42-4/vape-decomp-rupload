/*
 * Decompiled with CFR 0.152.
 */
package com.transaction.management;

import a.V3;
import com.app.concurrency.management.ThreadPoolOrchestrator2584;
import com.app.gameengine.GameRoundProcessor;
import com.app.network.CommunicationProtocolManager1453;
import com.app.network.NetworkConnectionHandler1792;
import com.app.ui.UserInteractionManager;
import com.caching.strategy.CacheInvalidationStrategy;
import com.event.management.ContextualEventDispatcher;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.metadata.extraction.MetadataExtractionService;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.network.security.ProtocolValidator;
import com.runtime.context.LightweightExecutionContext;
import com.security.context.SecurityContextManager2112;
import com.security.protocol.SecurityProtocolHandler1908;
import com.security.transform.CryptographicTransformer;
import com.system.resource.ResourceAllocationManager1058;
import com.transaction.processing.TransactionSequenceManager;
import com.transaction.validation.TransactionValidator1298;
import com.transformation.core.TransformationEngine1777;
import java.util.Collection;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class TransactionOrchestrator1017
extends CryptographicTransformer {
    private static int[] s;

    public void g() {
        try {
            if (GeometryCalculator.C() >= 23) {
                MetadataExtractionService.o(TransactionOrchestrator1017.U.u().L7, this.H, SecurityContextManager2112.R().M());
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionOrchestrator1017.a(customSystemException);
        }
        MetadataExtractionService.O(TransactionOrchestrator1017.U.u().L7, this.H);
    }

    public int u() {
        return MetadataExtractionService.s(TransactionOrchestrator1017.U.u().L7, this.H);
    }

    public boolean T() {
        return MetadataExtractionService.L(TransactionOrchestrator1017.U.u().L7, this.H);
    }

    public float w() {
        return MetadataExtractionService.Y(TransactionOrchestrator1017.U.u().L7, this.H);
    }

    public void X(float f) {
        MetadataExtractionService.J(TransactionOrchestrator1017.U.u().L7, this.H, f);
    }

    public static void s(int[] nArray) {
        s = nArray;
    }

    public LightweightExecutionContext G(SecurityContextManager2112 securityContextManager2112) {
        return new LightweightExecutionContext(MetadataExtractionService.h(TransactionOrchestrator1017.U.u().L7, this.H, securityContextManager2112.M()));
    }

    public float J() {
        return MetadataExtractionService.a(TransactionOrchestrator1017.U.u().L7, this.H);
    }

    public float f() {
        try {
            if (GeometryCalculator.C() >= 50) {
                return TransactionOrchestrator1017.U.u().L7.p(this.H);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionOrchestrator1017.a(customSystemException);
        }
        return MetadataExtractionService.H(TransactionOrchestrator1017.U.u().L7, this.H);
    }

    public double X() {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                return MetadataExtractionService.n(TransactionOrchestrator1017.U.u().L7, this.H);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionOrchestrator1017.a(customSystemException);
        }
        return 0.08;
    }

    public void c(float f) {
        MetadataExtractionService.l(TransactionOrchestrator1017.U.u().L7, this.H, f);
    }

    public TransactionOrchestrator1017(Object object) {
        super(object);
    }

    public boolean O(UserInteractionManager userInteractionManager) {
        try {
            if (GameVersionEnumerator.MC_1_20_6.H()) {
                return MetadataExtractionService.C(TransactionOrchestrator1017.U.u().L7, this.H, userInteractionManager.M());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionOrchestrator1017.a(customSystemException);
        }
        Object object = userInteractionManager.v().M();
        try {
            if (object == null) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionOrchestrator1017.a(customSystemException);
        }
        return MetadataExtractionService.C(TransactionOrchestrator1017.U.u().L7, this.H, object);
    }

    public float Y() {
        block4: {
            try {
                try {
                    if (!GameVersionEnumerator.MC_1_21_4.H() || !GameVersionEnumerator.MC_1_21_10.Q()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw TransactionOrchestrator1017.a(customSystemException);
                }
                return MetadataExtractionService.E(TransactionOrchestrator1017.U.u().L7, this.H);
            }
            catch (CustomSystemException customSystemException) {
                throw TransactionOrchestrator1017.a(customSystemException);
            }
        }
        return 1.0f;
    }

    public float u() {
        return MetadataExtractionService.B(TransactionOrchestrator1017.U.u().L7, this.H);
    }

    public boolean X() {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                return MetadataExtractionService.E(TransactionOrchestrator1017.U.u().L7, this.H);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionOrchestrator1017.a(customSystemException);
        }
        return false;
    }

    public void g(V3 v3) {
        MetadataExtractionService.p(TransactionOrchestrator1017.U.u().L7, this.H, v3.M());
    }

    public NetworkPacketInterceptor1107 K(double d2, float f) {
        try {
            if (GeometryCalculator.C() >= 35) {
                return new NetworkPacketInterceptor1107(TransactionOrchestrator1017.U.u().L7.s(this.H, d2, f, false));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionOrchestrator1017.a(customSystemException);
        }
        return new NetworkPacketInterceptor1107(TransactionOrchestrator1017.U.u().L7.S(this.H, d2, f));
    }

    public float I() {
        return MetadataExtractionService.p(TransactionOrchestrator1017.U.u().L7, this.H);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public boolean X(CryptographicTransformer cryptographicTransformer) {
        return TransactionOrchestrator1017.U.u().L7.R(this.H, cryptographicTransformer.M());
    }

    public void f() {
        MetadataExtractionService.C(TransactionOrchestrator1017.U.u().L7, this.H);
    }

    public ProtocolValidator d() {
        try {
            if (GeometryCalculator.C() >= 50) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionOrchestrator1017.a(customSystemException);
        }
        return new ProtocolValidator(TransactionOrchestrator1017.U.u().L7.Z(this.H));
    }

    public SecurityContextManager2112 v() {
        try {
            if (GameVersionEnumerator.MC_1_12_2.Q()) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionOrchestrator1017.a(customSystemException);
        }
        Object object = TransactionOrchestrator1017.U.u().L7.G(this.H);
        try {
            if (object == null) {
                return SecurityContextManager2112.R();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionOrchestrator1017.a(customSystemException);
        }
        return new SecurityContextManager2112(object);
    }

    public Collection A() {
        return (Collection)MetadataExtractionService.p(TransactionOrchestrator1017.U.u().L7, this.H);
    }

    public void y(float f) {
        MetadataExtractionService.w(TransactionOrchestrator1017.U.u().L7, this.H, f);
    }

    public void E(int n) {
        if (GameVersionEnumerator.MC_1_21_4.H()) {
            GameRoundProcessor gameRoundProcessor = SecurityProtocolHandler1908.g();
            Object object = gameRoundProcessor.e(n);
            CacheInvalidationStrategy cacheInvalidationStrategy = gameRoundProcessor.w(object);
            MetadataExtractionService.g(TransactionOrchestrator1017.U.u().L7, this.H, cacheInvalidationStrategy.M());
            return;
        }
        try {
            if (GeometryCalculator.C() >= 35) {
                MetadataExtractionService.g(TransactionOrchestrator1017.U.u().L7, this.H, CommunicationProtocolManager1453.J(n).M());
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionOrchestrator1017.a(customSystemException);
        }
        try {
            if (GeometryCalculator.C() >= 23) {
                MetadataExtractionService.e(TransactionOrchestrator1017.U.u().L7, this.H, TransactionValidator1298.l(n).M());
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionOrchestrator1017.a(customSystemException);
        }
        MetadataExtractionService.N(TransactionOrchestrator1017.U.u().L7, this.H, n);
    }

    public double Y(ThreadPoolOrchestrator2584 threadPoolOrchestrator2584) {
        return MetadataExtractionService.H(TransactionOrchestrator1017.U.u().L7, this.H, threadPoolOrchestrator2584.M());
    }

    public V3 W(ResourceAllocationManager1058 resourceAllocationManager1058) {
        try {
            if (GeometryCalculator.C() >= 35) {
                return this.z(resourceAllocationManager1058.Y());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionOrchestrator1017.a(customSystemException);
        }
        return this.j(resourceAllocationManager1058.m());
    }

    public void q(float f) {
        MetadataExtractionService.C(TransactionOrchestrator1017.U.u().L7, this.H, f);
    }

    public void n(float f) {
        if (GeometryCalculator.C() >= 50) {
            TransformationEngine1777 transformationEngine1777 = new TransformationEngine1777(TransactionOrchestrator1017.U.u().L7.S(this.H));
            transformationEngine1777.N(f);
            return;
        }
        MetadataExtractionService.S(TransactionOrchestrator1017.U.u().L7, this.H, f);
    }

    public boolean b() {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                return MetadataExtractionService.y(TransactionOrchestrator1017.U.u().L7, this.H);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionOrchestrator1017.a(customSystemException);
        }
        return false;
    }

    public ContextualEventDispatcher I(float f) {
        return new ContextualEventDispatcher(TransactionOrchestrator1017.U.u().L7.L(this.H, f));
    }

    public double o(CacheInvalidationStrategy cacheInvalidationStrategy) {
        return MetadataExtractionService.H(TransactionOrchestrator1017.U.u().L7, this.H, cacheInvalidationStrategy.M());
    }

    public boolean Q(CommunicationProtocolManager1453 communicationProtocolManager1453) {
        if (GeometryCalculator.C() >= 50) {
            GameRoundProcessor gameRoundProcessor = SecurityProtocolHandler1908.g();
            return MetadataExtractionService.U(TransactionOrchestrator1017.U.u().L7, this.H, gameRoundProcessor.w(communicationProtocolManager1453.M()).M());
        }
        return MetadataExtractionService.U(TransactionOrchestrator1017.U.u().L7, this.H, communicationProtocolManager1453.M());
    }

    public float C() {
        return TransactionOrchestrator1017.U.u().L7.z(this.H);
    }

    public void A(float f) {
        MetadataExtractionService.H(TransactionOrchestrator1017.U.u().L7, this.H, f);
    }

    public float B(float f) {
        return TransactionOrchestrator1017.U.u().L7.d(this.H, f);
    }

    public void v(CryptographicTransformer cryptographicTransformer) {
        TransactionOrchestrator1017.U.u().L7.J(this.H, cryptographicTransformer.M());
    }

    public float s(float f) {
        return MetadataExtractionService.h(TransactionOrchestrator1017.U.u().L7, this.H, f);
    }

    public float v() {
        if (GeometryCalculator.C() >= 50) {
            TransformationEngine1777 transformationEngine1777 = new TransformationEngine1777(TransactionOrchestrator1017.U.u().L7.S(this.H));
            return transformationEngine1777.b();
        }
        return MetadataExtractionService.O(TransactionOrchestrator1017.U.u().L7, this.H);
    }

    public void L(int n) {
        MetadataExtractionService.g(TransactionOrchestrator1017.U.u().L7, this.H, n);
    }

    static {
        if (TransactionOrchestrator1017.S() == null) {
            TransactionOrchestrator1017.s(new int[5]);
        }
    }

    public void I() {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                MetadataExtractionService.n(TransactionOrchestrator1017.U.u().L7, this.H);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionOrchestrator1017.a(customSystemException);
        }
    }

    public void U(boolean bl) {
        MetadataExtractionService.D(TransactionOrchestrator1017.U.u().L7, this.H, bl);
    }

    public boolean A() {
        return MetadataExtractionService.c(TransactionOrchestrator1017.U.u().L7, this.H);
    }

    public void F(float f) {
        MetadataExtractionService.d(TransactionOrchestrator1017.U.u().L7, this.H, f);
    }

    public V3 z(CommunicationProtocolManager1453 communicationProtocolManager1453) {
        if (GeometryCalculator.C() >= 50) {
            GameRoundProcessor gameRoundProcessor = SecurityProtocolHandler1908.g();
            return new V3(MetadataExtractionService.Q(TransactionOrchestrator1017.U.u().L7, this.H, gameRoundProcessor.w(communicationProtocolManager1453.M()).M()));
        }
        return new V3(MetadataExtractionService.Q(TransactionOrchestrator1017.U.u().L7, this.H, communicationProtocolManager1453.M()));
    }

    public float K() {
        return MetadataExtractionService.V(TransactionOrchestrator1017.U.u().L7, this.H);
    }

    public boolean K() {
        return MetadataExtractionService.W(TransactionOrchestrator1017.U.u().L7, this.H);
    }

    public void e(float f) {
        if (GeometryCalculator.C() >= 50) {
            TransformationEngine1777 transformationEngine1777 = new TransformationEngine1777(TransactionOrchestrator1017.U.u().L7.S(this.H));
            transformationEngine1777.u(f);
            return;
        }
        MetadataExtractionService.B(TransactionOrchestrator1017.U.u().L7, this.H, f);
    }

    public Object L() {
        return MetadataExtractionService.F(TransactionOrchestrator1017.U.u().L7, this.H);
    }

    public void C(float f) {
        MetadataExtractionService.P(TransactionOrchestrator1017.U.u().L7, this.H, f);
    }

    public void J(float f) {
        MetadataExtractionService.I(TransactionOrchestrator1017.U.u().L7, this.H, f);
    }

    public int Y() {
        return TransactionOrchestrator1017.U.u().L7.a(this.H);
    }

    public void Z(int n) {
        TransactionOrchestrator1017.U.u().L7.Q(this.H, n);
    }

    public boolean C(TransactionValidator1298 transactionValidator1298) {
        return MetadataExtractionService.U(TransactionOrchestrator1017.U.u().L7, this.H, transactionValidator1298.M());
    }

    public float j() {
        return TransactionOrchestrator1017.U.u().L7.P(this.H);
    }

    public void H(Object object) {
        MetadataExtractionService.A(TransactionOrchestrator1017.U.u().L7, this.H, object);
    }

    public float V() {
        if (GeometryCalculator.C() >= 50) {
            TransformationEngine1777 transformationEngine1777 = new TransformationEngine1777(TransactionOrchestrator1017.U.u().L7.S(this.H));
            return transformationEngine1777.q();
        }
        return MetadataExtractionService.I(TransactionOrchestrator1017.U.u().L7, this.H);
    }

    public boolean C() {
        try {
            if (GeometryCalculator.C() < 23) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionOrchestrator1017.a(customSystemException);
        }
        return MetadataExtractionService.J(TransactionOrchestrator1017.U.u().L7, this.H);
    }

    public TransactionSequenceManager x(CacheInvalidationStrategy cacheInvalidationStrategy) {
        return new TransactionSequenceManager(MetadataExtractionService.M(TransactionOrchestrator1017.U.u().L7, this.H, cacheInvalidationStrategy.M()));
    }

    public float U() {
        return MetadataExtractionService.P(TransactionOrchestrator1017.U.u().L7, this.H);
    }

    public ContextualEventDispatcher X(double d2, boolean bl, ContextualEventDispatcher contextualEventDispatcher) {
        return new ContextualEventDispatcher(MetadataExtractionService.S(TransactionOrchestrator1017.U.u().L7, this.H, d2, bl, contextualEventDispatcher.M()));
    }

    public ContextualEventDispatcher F(float f) {
        return new ContextualEventDispatcher(TransactionOrchestrator1017.U.u().L7.h(this.H, f));
    }

    public void P(float f) {
        if (GeometryCalculator.C() >= 50) {
            TransformationEngine1777 transformationEngine1777 = new TransformationEngine1777(TransactionOrchestrator1017.U.u().L7.S(this.H));
            transformationEngine1777.n(f);
            return;
        }
        MetadataExtractionService.x(TransactionOrchestrator1017.U.u().L7, this.H, f);
    }

    public static int[] S() {
        return s;
    }

    public void e() {
    }

    public int b(SecurityContextManager2112 securityContextManager2112) {
        try {
            if (GeometryCalculator.C() < 23) {
                return 0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionOrchestrator1017.a(customSystemException);
        }
        Object object = TransactionOrchestrator1017.U.u().L7.G(this.H);
        try {
            if (object == null) {
                return 0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionOrchestrator1017.a(customSystemException);
        }
        try {
            if (object.equals(securityContextManager2112.M())) {
                return TransactionOrchestrator1017.U.u().L7.R(this.H);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionOrchestrator1017.a(customSystemException);
        }
        return 0;
    }

    public int S() {
        return MetadataExtractionService.E(TransactionOrchestrator1017.U.u().L7, this.H);
    }

    public void W() {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                MetadataExtractionService.U(TransactionOrchestrator1017.U.u().L7, this.H);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionOrchestrator1017.a(customSystemException);
        }
    }

    public float H() {
        return TransactionOrchestrator1017.U.u().L7.A(this.H);
    }

    public int g() {
        return TransactionOrchestrator1017.U.u().L7.V(this.H);
    }

    public float e() {
        return MetadataExtractionService.c(TransactionOrchestrator1017.U.u().L7, this.H);
    }

    public V3 j(TransactionValidator1298 transactionValidator1298) {
        return new V3(MetadataExtractionService.Q(TransactionOrchestrator1017.U.u().L7, this.H, transactionValidator1298.M()));
    }

    public void g(float f) {
        block4: {
            try {
                try {
                    if (!GameVersionEnumerator.MC_1_21_4.H() || !GameVersionEnumerator.MC_1_21_10.Q()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw TransactionOrchestrator1017.a(customSystemException);
                }
                MetadataExtractionService.V(TransactionOrchestrator1017.U.u().L7, this.H, f);
            }
            catch (CustomSystemException customSystemException) {
                throw TransactionOrchestrator1017.a(customSystemException);
            }
        }
    }

    public boolean e(ResourceAllocationManager1058 resourceAllocationManager1058) {
        try {
            if (GeometryCalculator.C() >= 35) {
                return this.Q(resourceAllocationManager1058.Y());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionOrchestrator1017.a(customSystemException);
        }
        return this.C(resourceAllocationManager1058.m());
    }

    public void M(int n) {
        MetadataExtractionService.W(TransactionOrchestrator1017.U.u().L7, this.H, n);
    }

    public ContextualEventDispatcher M(ContextualEventDispatcher contextualEventDispatcher) {
        return new ContextualEventDispatcher(MetadataExtractionService.A(TransactionOrchestrator1017.U.u().L7, this.H, contextualEventDispatcher.M()));
    }

    public static NetworkConnectionHandler1792 Y() {
        return new NetworkConnectionHandler1792(MetadataExtractionService.M(TransactionOrchestrator1017.U.u().L7));
    }

    public TransactionSequenceManager I(ThreadPoolOrchestrator2584 threadPoolOrchestrator2584) {
        return new TransactionSequenceManager(MetadataExtractionService.M(TransactionOrchestrator1017.U.u().L7, this.H, threadPoolOrchestrator2584.M()));
    }

    public final float y() {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                return MetadataExtractionService.t(TransactionOrchestrator1017.U.u().L7, this.H);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionOrchestrator1017.a(customSystemException);
        }
        return 1.0f;
    }

    public int b() {
        return MetadataExtractionService.g(TransactionOrchestrator1017.U.u().L7, this.H);
    }

    public void L() {
        MetadataExtractionService.k(TransactionOrchestrator1017.U.u().L7, this.H);
    }

    public void A(boolean bl) {
        TransactionOrchestrator1017.U.u().L7.M(this.H, bl);
    }

    public float x() {
        if (GeometryCalculator.C() >= 50) {
            TransformationEngine1777 transformationEngine1777 = new TransformationEngine1777(TransactionOrchestrator1017.U.u().L7.S(this.H));
            return transformationEngine1777.x();
        }
        return MetadataExtractionService.T(TransactionOrchestrator1017.U.u().L7, this.H);
    }

    public LightweightExecutionContext a() {
        return new LightweightExecutionContext(MetadataExtractionService.P(TransactionOrchestrator1017.U.u().L7, this.H));
    }
}

