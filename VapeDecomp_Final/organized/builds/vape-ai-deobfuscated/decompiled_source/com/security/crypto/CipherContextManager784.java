/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import a.Qh;
import a.kg;
import a.zx;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.core.execution.ExecutionOrchestrator;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.core.service.ServiceLifecycleController;
import com.exception.system.CustomSystemException;
import com.math.computation.NumericComputationFramework;
import com.math.geometry.GeometryCalculator;
import com.network.adaptation.ProtocolAdaptationManager;
import com.network.connection.NetworkConnectionEstablisher;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.network.protocol.NetworkProtocolNegotiator;
import com.random.generation.RandomGenerationEngine;
import com.reflection.descriptor.AdvancedMethodDescriptorHandler;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.DynamicContextBroker;
import com.security.cipher.CipherOperationManager;
import com.security.crypto.CryptographicSecurityProvider;
import com.security.event.SecureEventOrchestrator;
import com.security.protocol.CryptographicProtocolNegotiator;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.ConfigurationCalibrator;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.core.SystemStateOrchestrator1145;
import com.system.parameters.MultimodalParameterController;
import com.system.resources.ResourceAllocationManager;
import com.temporal.metadata.TemporalMetadataResolver;
import java.util.function.Predicate;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CipherContextManager784 {
    private boolean M;
    private double H;
    private final ConfigurationCalibrator c = ConfigurationCalibrator.b;
    private float J;
    private RandomGenerationEngine k;
    private float g;
    private float n;
    private boolean W;
    private final NetworkProtocolNegotiator x;
    private final SystemConfigurationOrchestrator Z;
    private final zx e;
    private final Qh E;
    private final SecureEventOrchestrator y;
    private final NumericComputationFramework t;
    private final Qh U;

    public void I() {
        this.e.C();
    }

    public boolean F() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (this.k == null || !(this.k instanceof CryptographicSecurityProvider)) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherContextManager784.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherContextManager784.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public void Z() {
        this.e.R(false, false, false, false, false, false);
    }

    public boolean H() {
        return this.e.l();
    }

    public boolean T() {
        boolean bl;
        block10: {
            block9: {
                try {
                    block8: {
                        try {
                            try {
                                try {
                                    if (this.e.D() || this.e.l()) break block8;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CipherContextManager784.a(customSystemException);
                                }
                                if (this.e.G()) break block8;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CipherContextManager784.a(customSystemException);
                            }
                            if (!this.e.R()) break block9;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CipherContextManager784.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherContextManager784.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public int H() {
        return this.e.N();
    }

    public void w(NumericComputationFramework numericComputationFramework) {
        this.e.J(numericComputationFramework);
    }

    private boolean lambda$getMouseOver$1(CryptographicTransformer cryptographicTransformer) {
        boolean bl;
        block9: {
            block8: {
                try {
                    try {
                        try {
                            try {
                                if (cryptographicTransformer.I() || !cryptographicTransformer.m()) break block8;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CipherContextManager784.a(customSystemException);
                            }
                            if (cryptographicTransformer.equals(this.U)) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CipherContextManager784.a(customSystemException);
                        }
                        if (cryptographicTransformer.equals(this.Z)) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherContextManager784.a(customSystemException);
                    }
                    bl = true;
                    break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherContextManager784.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public boolean f() {
        return this.e.z();
    }

    public MultimodalParameterController v() {
        MultimodalParameterController multimodalParameterController = new MultimodalParameterController(this.E);
        multimodalParameterController.D(new NumericComputationFramework(this));
        return multimodalParameterController;
    }

    public void r() {
        try {
            if (this.t != null) {
                this.t.O = true;
                this.t.B = false;
                this.t.P = false;
                this.t.F = false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherContextManager784.a(customSystemException);
        }
        this.r(true, false, false, false);
    }

    public boolean b() {
        return this.e.A();
    }

    public void f() {
        this.u(true);
    }

    public void k() {
        if (this.k != null) {
            double d2 = Math.round(50.0f * this.c.a());
            this.H += d2;
            int n = (int)Math.round(this.H);
            for (int i = 0; i < n; ++i) {
                try {
                    this.k.H(this.Z, this.y);
                    this.k.m(this.y);
                    continue;
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            this.H -= (double)n;
            if (this.F()) {
                CryptographicSecurityProvider cryptographicSecurityProvider = (CryptographicSecurityProvider)this.k;
                this.J = cryptographicSecurityProvider.P();
                this.n = cryptographicSecurityProvider.v();
            }
        }
    }

    public boolean G() {
        return this.e.D();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void r(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.e.o(bl);
        this.e.t(bl2);
        this.e.b(bl3);
        this.e.e(bl4);
    }

    private boolean lambda$getMouseOver$0(CryptographicTransformer cryptographicTransformer) {
        boolean bl;
        block9: {
            block8: {
                try {
                    try {
                        try {
                            try {
                                if (cryptographicTransformer.I() || !cryptographicTransformer.m()) break block8;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CipherContextManager784.a(customSystemException);
                            }
                            if (cryptographicTransformer.equals(this.U)) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CipherContextManager784.a(customSystemException);
                        }
                        if (cryptographicTransformer.equals(this.Z)) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherContextManager784.a(customSystemException);
                    }
                    bl = true;
                    break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherContextManager784.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public Qh a() {
        return this.E;
    }

    public CipherContextManager784(Qh qh, SystemConfigurationOrchestrator systemConfigurationOrchestrator, NetworkProtocolNegotiator networkProtocolNegotiator, NumericComputationFramework numericComputationFramework) {
        this.U = qh;
        this.Z = systemConfigurationOrchestrator;
        this.x = networkProtocolNegotiator;
        this.E = ExecutionOrchestrator.E(qh);
        this.t = numericComputationFramework;
        this.H = this.c.r();
        this.y = ApplicationLifecycleManager.X();
        this.e = CipherContextManager784.m(this.E, systemConfigurationOrchestrator, qh, networkProtocolNegotiator);
        this.I();
        if (qh.B(ReflectionMetadataResolver.rl) && ConfigurationCalibrator.b.P()) {
            CryptographicSecurityProvider cryptographicSecurityProvider = (CryptographicSecurityProvider)ConfigurationCalibrator.b.N();
            this.J = cryptographicSecurityProvider.P();
            this.n = cryptographicSecurityProvider.v();
        }
    }

    public NetworkPacketInterceptor1107 L(double d2, float f, boolean bl) {
        NetworkPacketInterceptor1107 networkPacketInterceptor1107;
        Qh qh = this.E;
        if (this.F()) {
            Predicate<CryptographicTransformer> predicate;
            boolean bl2;
            float f2;
            double d3;
            Qh qh2;
            float f3 = qh.q();
            float f4 = qh.J();
            float f5 = qh.S();
            try {
                qh.a(this.J);
                qh.C(this.J);
                qh.f(this.n);
                qh2 = this.E;
                d3 = d2;
                f2 = f;
                bl2 = bl;
                predicate = GeometryCalculator.C() < 35 ? null : this::lambda$getMouseOver$0;
            }
            catch (CustomSystemException customSystemException) {
                throw CipherContextManager784.a(customSystemException);
            }
            networkPacketInterceptor1107 = SystemStateOrchestrator1145.h(qh2, d3, f2, bl2, predicate);
            qh.a(f3);
            qh.C(f4);
            qh.f(f5);
        } else {
            Predicate<CryptographicTransformer> predicate;
            boolean bl3;
            float f6;
            double d4;
            Qh qh3;
            try {
                qh.C(qh.q());
                qh3 = this.E;
                d4 = d2;
                f6 = f;
                bl3 = bl;
                predicate = GeometryCalculator.C() < 35 ? null : this::lambda$getMouseOver$1;
            }
            catch (CustomSystemException customSystemException) {
                throw CipherContextManager784.a(customSystemException);
            }
            networkPacketInterceptor1107 = SystemStateOrchestrator1145.h(qh3, d4, f6, bl3, predicate);
        }
        return networkPacketInterceptor1107;
    }

    private static zx m(Qh qh, SystemConfigurationOrchestrator systemConfigurationOrchestrator, Qh qh2, NetworkProtocolNegotiator networkProtocolNegotiator) {
        int n = GeometryCalculator.C();
        try {
            if (n >= GeometryCalculator.Y) {
                return new CryptographicProtocolNegotiator(qh, systemConfigurationOrchestrator, qh2, networkProtocolNegotiator);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherContextManager784.a(customSystemException);
        }
        try {
            if (n >= GeometryCalculator.C) {
                return new AdvancedMethodDescriptorHandler(qh, systemConfigurationOrchestrator, qh2, networkProtocolNegotiator);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherContextManager784.a(customSystemException);
        }
        try {
            if (n >= GeometryCalculator.a) {
                return new CipherOperationManager(qh, systemConfigurationOrchestrator, qh2, networkProtocolNegotiator);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherContextManager784.a(customSystemException);
        }
        return new ProtocolAdaptationManager(qh, systemConfigurationOrchestrator, qh2, networkProtocolNegotiator);
    }

    public float T() {
        return this.e.Q();
    }

    public void u(boolean bl) {
        try {
            if (bl) {
                this.k();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherContextManager784.a(customSystemException);
        }
        this.E.z(this.E.q());
        this.E.G(this.E.S());
        this.E.W(this.E.F());
        this.E.X(this.E.V());
        this.E.p(this.E.B());
        if (this.F()) {
            CryptographicSecurityProvider cryptographicSecurityProvider = (CryptographicSecurityProvider)this.k;
            this.J = cryptographicSecurityProvider.P();
            this.n = AdaptiveComputationEngine.g(cryptographicSecurityProvider.v(), -90.0f, 90.0f);
            this.V();
        }
        try {
            this.e.B();
            if (this.W) {
                this.E.a(this.g);
                this.E.C(this.g);
                this.W = false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherContextManager784.a(customSystemException);
        }
        try {
            if (this.M) {
                this.d();
                this.M = false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherContextManager784.a(customSystemException);
        }
    }

    public void d() {
        this.e.R(this.t.O, this.t.B, this.t.P, this.t.F, this.t.L, this.t.W);
    }

    public int D() {
        return this.e.c();
    }

    public boolean Z() {
        return this.e.p();
    }

    public CipherContextManager784(Qh qh, SystemConfigurationOrchestrator systemConfigurationOrchestrator, NetworkProtocolNegotiator networkProtocolNegotiator, NumericComputationFramework numericComputationFramework, CipherContextManager784 cipherContextManager784) {
        this.U = qh;
        this.Z = systemConfigurationOrchestrator;
        this.x = networkProtocolNegotiator;
        this.E = cipherContextManager784.a();
        ExecutionOrchestrator.o(this.E, qh);
        this.t = numericComputationFramework;
        this.H = this.c.r();
        this.y = ApplicationLifecycleManager.X();
        this.e = CipherContextManager784.m(this.E, systemConfigurationOrchestrator, qh, networkProtocolNegotiator);
        this.I();
        if (qh.B(ReflectionMetadataResolver.rl) && ConfigurationCalibrator.b.P()) {
            CryptographicSecurityProvider cryptographicSecurityProvider = (CryptographicSecurityProvider)ConfigurationCalibrator.b.N();
            this.J = cryptographicSecurityProvider.P();
            this.n = cryptographicSecurityProvider.v();
        }
    }

    public void w(RandomGenerationEngine randomGenerationEngine) {
        block8: {
            CryptographicSecurityProvider cryptographicSecurityProvider;
            block7: {
                try {
                    if (this.k == randomGenerationEngine) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherContextManager784.a(customSystemException);
                }
                try {
                    if (!(this.k instanceof CryptographicSecurityProvider) || !(randomGenerationEngine instanceof CryptographicSecurityProvider)) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherContextManager784.a(customSystemException);
                }
                cryptographicSecurityProvider = (CryptographicSecurityProvider)this.k;
                cryptographicSecurityProvider.n(true);
                cryptographicSecurityProvider.X(true);
                CryptographicSecurityProvider cryptographicSecurityProvider2 = (CryptographicSecurityProvider)randomGenerationEngine;
                cryptographicSecurityProvider2.n(false);
                cryptographicSecurityProvider2.B(cryptographicSecurityProvider.P());
                cryptographicSecurityProvider2.g(cryptographicSecurityProvider.v());
            }
            try {
                if (this.k != null || !(randomGenerationEngine instanceof CryptographicSecurityProvider)) break block8;
            }
            catch (CustomSystemException customSystemException) {
                throw CipherContextManager784.a(customSystemException);
            }
            cryptographicSecurityProvider = (CryptographicSecurityProvider)randomGenerationEngine;
            this.J = cryptographicSecurityProvider.P();
            this.n = cryptographicSecurityProvider.v();
        }
        this.k = randomGenerationEngine;
    }

    public void y() {
        this.e.J(false);
    }

    public boolean S() {
        return this.e.Y();
    }

    public RandomGenerationEngine C() {
        return this.k;
    }

    public kg G() {
        return new kg(this.E.F(), this.E.V(), this.E.B());
    }

    public boolean w() {
        return this.e.R();
    }

    public float E() {
        return this.e.L();
    }

    public void L(boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        this.e.R(bl, bl2, bl3, bl4, bl5, bl6);
    }

    public void V() {
        block32: {
            boolean bl;
            NetworkConnectionEstablisher networkConnectionEstablisher;
            boolean bl2;
            block31: {
                boolean bl3;
                block30: {
                    bl2 = this.F();
                    networkConnectionEstablisher = (NetworkConnectionEstablisher)TemporalMetadataResolver.h.a().n.J();
                    try {
                        if (networkConnectionEstablisher.equals(DynamicContextBroker.c)) {
                            return;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherContextManager784.a(customSystemException);
                    }
                    try {
                        try {
                            if (!networkConnectionEstablisher.equals(DynamicContextBroker.B) && !networkConnectionEstablisher.equals(DynamicContextBroker.v)) break block30;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CipherContextManager784.a(customSystemException);
                        }
                        bl3 = true;
                        break block31;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherContextManager784.a(customSystemException);
                    }
                }
                bl3 = bl = false;
            }
            if (bl) {
                boolean bl4 = this.T();
                if (bl2) {
                    float f;
                    float f2;
                    CryptographicSecurityProvider cryptographicSecurityProvider = (CryptographicSecurityProvider)this.k;
                    try {
                        CipherContextManager784 cipherContextManager784 = this;
                        f2 = ResourceAllocationManager.b() ? ResourceAllocationManager.c() : this.E.q();
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherContextManager784.a(customSystemException);
                    }
                    cipherContextManager784.g = f2;
                    float f3 = cryptographicSecurityProvider.y();
                    float f4 = this.c.E(f3, this.e.D(), this.e.R(), this.e.G(), this.e.l());
                    try {
                        f = networkConnectionEstablisher.equals(DynamicContextBroker.v) ? f4 + 180.0f : this.J;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherContextManager784.a(customSystemException);
                    }
                    float f5 = f;
                    this.E.a(f5);
                    this.E.C(f5);
                    this.W = true;
                    if (bl4) {
                        boolean bl5;
                        boolean bl6;
                        boolean bl7;
                        boolean bl8;
                        double d2;
                        float f6 = AdaptiveComputationEngine.v(AdaptiveComputationEngine.v(f5) - f4);
                        float f7 = f6 * ((float)Math.PI / 180);
                        float f8 = (float)Math.cos(f7);
                        float f9 = (float)(-Math.sin(f7));
                        try {
                            d2 = ServiceLifecycleController.c.k() != null ? 0.075 : (double)0.4f;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CipherContextManager784.a(customSystemException);
                        }
                        double d3 = d2;
                        try {
                            bl8 = (double)f8 >= d3;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CipherContextManager784.a(customSystemException);
                        }
                        boolean bl9 = bl8;
                        try {
                            bl7 = (double)f9 >= d3;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CipherContextManager784.a(customSystemException);
                        }
                        boolean bl10 = bl7;
                        try {
                            bl6 = (double)f9 <= -d3;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CipherContextManager784.a(customSystemException);
                        }
                        boolean bl11 = bl6;
                        try {
                            bl5 = (double)f8 <= -d3;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CipherContextManager784.a(customSystemException);
                        }
                        boolean bl12 = bl5;
                        this.r(bl9, bl12, bl11, bl10);
                        this.M = true;
                    }
                }
                try {
                    try {
                        try {
                            if (bl2 && bl4) break block32;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CipherContextManager784.a(customSystemException);
                        }
                        if (!this.M) break block32;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherContextManager784.a(customSystemException);
                    }
                    this.d();
                    this.M = false;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherContextManager784.a(customSystemException);
                }
            }
        }
    }

    public boolean U() {
        return this.e.G();
    }

    public boolean R() {
        return this.e.K();
    }

    public void z(boolean bl) {
        this.e.I(bl);
    }
}

