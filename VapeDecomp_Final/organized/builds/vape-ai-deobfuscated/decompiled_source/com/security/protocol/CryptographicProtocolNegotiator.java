/*
 * Decompiled with CFR 0.152.
 */
package com.security.protocol;

import a.DJ;
import a.DU;
import a.Qh;
import a.V3;
import a.oQ;
import a.zx;
import com.analytics.processing.AnalyticsDataProcessor;
import com.app.configuration.ResourceConfigManager;
import com.app.network.NetworkConnectionHandler1792;
import com.app.transaction.validation.TransactionValidator2324;
import com.app.ui.UserInteractionManager;
import com.collections.management.MultiContainerRegistry;
import com.data.streaming.StreamProcessingEngine1677;
import com.event.management.ContextualEventDispatcher;
import com.exception.system.CustomSystemException;
import com.financial.processing.TransactionCorrelationEngine;
import com.financial.transaction.TransactionProcessor1409;
import com.math.computation.NumericComputationFramework;
import com.network.protocol.NetworkProtocolNegotiator;
import com.network.security.SecureTransmissionHandler;
import com.network.streaming.StreamProtocolHandler2021;
import com.protocol.encoding.EncodingProtocolHandler;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.security.transform.CryptographicTransformer;
import com.session.management.SessionLifecycleManager;
import com.system.config.AdaptiveConfigurationManager;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.system.monitoring.SystemHealthMonitor1733;
import com.system.pipeline.ObjectPipelineManager;
import com.transaction.processing.TransactionSequenceManager;
import com.validation.core.ObjectValidator;
import com.vape.processing.VapeDataProcessor;
import com.vape.transform.VapeDataTransformer;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CryptographicProtocolNegotiator
extends zx {
    private static final Map f;
    private static final long[] b;
    private static final Integer[] e;
    private static final long a;
    private boolean c;

    private void C(ContextualEventDispatcher contextualEventDispatcher) {
        block7: {
            double d2;
            ContextualEventDispatcher contextualEventDispatcher2;
            float f;
            block6: {
                float f2;
                ReflectionUtilityBroker reflectionUtilityBroker = this.y.o();
                try {
                    f2 = this.y.j() ? this.o.T(reflectionUtilityBroker).I().r() : 1.0f;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicProtocolNegotiator.a(customSystemException);
                }
                float f3 = f2;
                f = f3 * 0.91f;
                contextualEventDispatcher2 = this.j(contextualEventDispatcher, f3);
                d2 = contextualEventDispatcher2.F();
                if (this.y.e(ObjectPipelineManager.o)) {
                    V3 v3 = this.y.W(ObjectPipelineManager.o);
                    d2 += (0.05 * (double)(v3.y() + 1) - contextualEventDispatcher2.F()) * 0.2;
                } else {
                    d2 -= this.y.X();
                }
                try {
                    if (!this.y.X()) break block6;
                    this.y.L(contextualEventDispatcher2.X(), d2, contextualEventDispatcher2.f());
                    break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicProtocolNegotiator.a(customSystemException);
                }
            }
            float f4 = 0.98f;
            this.y.L(contextualEventDispatcher2.X() * (double)f, d2 * (double)f4, contextualEventDispatcher2.f() * (double)f);
        }
    }

    @Override
    public void R(boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        this.N = bl;
        this.d = bl2;
        this.V = bl3;
        this.A = bl4;
        this.W = bl5;
        this.n = bl6;
    }

    private boolean a() {
        boolean bl;
        try {
            bl = this.x > 1.0E-5f;
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicProtocolNegotiator.a(customSystemException);
        }
        return bl;
    }

    private void K() {
        List list = this.o.P(this.y, this.y.S(), VapeDataTransformer.I(this.S));
        if (!list.isEmpty()) {
            for (Object e : list) {
                try {
                    try {
                        try {
                            if (ReflectionMetadataResolver.rl.isInstance(e) || e == this.y.M()) continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicProtocolNegotiator.a(customSystemException);
                        }
                        if (e == this.g.M()) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicProtocolNegotiator.a(customSystemException);
                    }
                    this.y.v(new CryptographicTransformer(e));
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicProtocolNegotiator.a(customSystemException);
                }
            }
        }
    }

    public boolean I() {
        boolean bl;
        try {
            bl = this.x > 1.0E-5f;
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicProtocolNegotiator.a(customSystemException);
        }
        return bl;
    }

    private static float Y(boolean bl, boolean bl2) {
        float f;
        try {
            if (bl == bl2) {
                return 0.0f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicProtocolNegotiator.a(customSystemException);
        }
        try {
            f = bl ? 1.0f : -1.0f;
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicProtocolNegotiator.a(customSystemException);
        }
        return f;
    }

    private void w() {
        block48: {
            block39: {
                block44: {
                    block46: {
                        boolean bl;
                        double d2;
                        block42: {
                            block41: {
                                block49: {
                                    block40: {
                                        block38: {
                                            block37: {
                                                try {
                                                    if (this.y.S() > 0) {
                                                        this.y.M(this.y.S() - 1);
                                                    }
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CryptographicProtocolNegotiator.a(customSystemException);
                                                }
                                                ContextualEventDispatcher contextualEventDispatcher = this.y.i();
                                                double d3 = contextualEventDispatcher.X();
                                                double d4 = contextualEventDispatcher.F();
                                                double d5 = contextualEventDispatcher.f();
                                                if (Math.abs(contextualEventDispatcher.X()) < 0.003) {
                                                    d3 = 0.0;
                                                }
                                                if (Math.abs(contextualEventDispatcher.F()) < 0.003) {
                                                    d4 = 0.0;
                                                }
                                                if (Math.abs(contextualEventDispatcher.f()) < 0.003) {
                                                    d5 = 0.0;
                                                }
                                                try {
                                                    this.y.L(d3, d4, d5);
                                                    if (!this.y.b()) break block37;
                                                    this.y.U(false);
                                                    this.y.c(0.0f);
                                                    this.y.X(0.0f);
                                                    break block38;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CryptographicProtocolNegotiator.a(customSystemException);
                                                }
                                            }
                                            this.h();
                                        }
                                        try {
                                            try {
                                                if (!this.y.A() || !this.y.n()) break block39;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptographicProtocolNegotiator.a(customSystemException);
                                            }
                                            if (!this.y.x()) break block40;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptographicProtocolNegotiator.a(customSystemException);
                                        }
                                        d2 = this.y.h(StreamProtocolHandler2021.u());
                                        break block49;
                                    }
                                    d2 = this.y.h(StreamProtocolHandler2021.G());
                                }
                                try {
                                    try {
                                        if (!this.y.F() || !(d2 > 0.0)) break block41;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptographicProtocolNegotiator.a(customSystemException);
                                    }
                                    bl = true;
                                    break block42;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicProtocolNegotiator.a(customSystemException);
                                }
                            }
                            bl = false;
                        }
                        boolean bl2 = bl;
                        double d6 = this.h();
                        try {
                            try {
                                block47: {
                                    try {
                                        try {
                                            try {
                                                block45: {
                                                    try {
                                                        try {
                                                            try {
                                                                block43: {
                                                                    try {
                                                                        try {
                                                                            if (!bl2) break block43;
                                                                            if (!this.y.j()) break block44;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw CryptographicProtocolNegotiator.a(customSystemException);
                                                                        }
                                                                        if (d2 > d6) break block44;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw CryptographicProtocolNegotiator.a(customSystemException);
                                                                    }
                                                                }
                                                                if (!this.y.x()) break block45;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw CryptographicProtocolNegotiator.a(customSystemException);
                                                            }
                                                            if (!this.y.j()) break block46;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw CryptographicProtocolNegotiator.a(customSystemException);
                                                        }
                                                        if (d2 > d6) break block46;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw CryptographicProtocolNegotiator.a(customSystemException);
                                                    }
                                                }
                                                if (this.y.j()) break block47;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptographicProtocolNegotiator.a(customSystemException);
                                            }
                                            if (!bl2) break block48;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptographicProtocolNegotiator.a(customSystemException);
                                        }
                                        if (!(d2 <= d6)) break block48;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptographicProtocolNegotiator.a(customSystemException);
                                    }
                                }
                                if (this.y.S() != 0) break block48;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicProtocolNegotiator.a(customSystemException);
                            }
                            this.y.L();
                            this.y.M(10);
                            break block48;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicProtocolNegotiator.a(customSystemException);
                        }
                    }
                    this.z();
                    break block48;
                }
                this.z();
                break block48;
            }
            this.y.M(0);
        }
        this.y.c(this.y.w() * 0.98f);
        this.y.X(this.y.u() * 0.98f);
        Object object = this.y.L();
        ContextualEventDispatcher contextualEventDispatcher = ContextualEventDispatcher.N(this.y.w(), 0.0, this.y.u());
        this.a(contextualEventDispatcher);
        if (!this.o.s()) {
            // empty if block
        }
        this.y.W();
        this.y.I();
        this.K();
    }

    @Override
    public void B() {
        this.W();
    }

    public boolean o() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.y.V() || this.y.F()) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicProtocolNegotiator.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicProtocolNegotiator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/z8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptographicProtocolNegotiator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private void p() {
        try {
            this.l();
            if (!this.y.O()) {
                this.t();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicProtocolNegotiator.a(customSystemException);
        }
        if (this.y.C()) {
            // empty if block
        }
        try {
            if (this.y.M()) {
                this.y.f(0.0f);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicProtocolNegotiator.a(customSystemException);
        }
        float f = this.y.y();
        try {
            if (f != this.y.Y()) {
                this.y.g(f);
                this.y.P();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicProtocolNegotiator.a(customSystemException);
        }
    }

    private void W() {
        try {
            if (this.S.U()) {
                this.j();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicProtocolNegotiator.a(customSystemException);
        }
    }

    private boolean y() {
        boolean bl;
        block10: {
            block9: {
                try {
                    block8: {
                        try {
                            try {
                                try {
                                    if (this.y.C() || this.U()) break block8;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicProtocolNegotiator.a(customSystemException);
                                }
                                if (this.C()) break block8;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicProtocolNegotiator.a(customSystemException);
                            }
                            if (!this.y.d()) break block9;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicProtocolNegotiator.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicProtocolNegotiator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean B(ReflectionUtilityBroker reflectionUtilityBroker) {
        Object object = this.y.L();
        oQ oQ2 = oQ.E(reflectionUtilityBroker.o(), ((oQ)object).c(), reflectionUtilityBroker.j(), (double)reflectionUtilityBroker.o() + 1.0, ((oQ)object).P(), (double)reflectionUtilityBroker.j() + 1.0).x(1.0E-7);
        return this.o.b(this.y, oQ2);
    }

    private boolean C() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.y.H() && !this.o()) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicProtocolNegotiator.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicProtocolNegotiator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public CryptographicProtocolNegotiator(Qh qh, SystemConfigurationOrchestrator systemConfigurationOrchestrator, Qh qh2, NetworkProtocolNegotiator networkProtocolNegotiator) {
        super(qh, systemConfigurationOrchestrator, qh2, networkProtocolNegotiator);
    }

    private void Y() {
        this.D = this.W;
        this.Y = this.n;
        this.x = CryptographicProtocolNegotiator.Y(this.N, this.d);
        this.l = CryptographicProtocolNegotiator.Y(this.V, this.A);
    }

    private void h() {
        this.y.c(this.l);
        this.y.X(this.x);
        this.y.U(this.W);
    }

    private boolean d() {
        boolean bl;
        block8: {
            block7: {
                try {
                    block6: {
                        try {
                            try {
                                if (this.y.d() || (float)this.y.K().u() > 6.0f) break block6;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicProtocolNegotiator.a(customSystemException);
                            }
                            if (!this.y.M().w()) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicProtocolNegotiator.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicProtocolNegotiator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public double h() {
        double d2;
        try {
            d2 = (double)this.y.E() < 0.4 ? 0.0 : 0.4;
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicProtocolNegotiator.a(customSystemException);
        }
        return d2;
    }

    private ContextualEventDispatcher q(ContextualEventDispatcher contextualEventDispatcher) {
        double d2;
        double d3;
        ContextualEventDispatcher contextualEventDispatcher2;
        block6: {
            double d4;
            float f;
            block5: {
                contextualEventDispatcher2 = this.y.q();
                f = this.y.S() * ((float)Math.PI / 180);
                d3 = contextualEventDispatcher2.G();
                d2 = contextualEventDispatcher.G();
                double d5 = this.y.X();
                double d6 = AnalyticsDataProcessor.o(Math.cos(f));
                contextualEventDispatcher = contextualEventDispatcher.A(0.0, d5 * (-1.0 + d6 * 0.75), 0.0);
                try {
                    if (!(contextualEventDispatcher.F() < 0.0) || !(d3 > 0.0)) break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicProtocolNegotiator.a(customSystemException);
                }
                d4 = contextualEventDispatcher.F() * -0.1 * d6;
                contextualEventDispatcher = contextualEventDispatcher.A(contextualEventDispatcher2.X() * d4 / d3, d4, contextualEventDispatcher2.f() * d4 / d3);
            }
            try {
                if (!(f < 0.0f) || !(d3 > 0.0)) break block6;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicProtocolNegotiator.a(customSystemException);
            }
            d4 = d2 * (double)(-AnalyticsDataProcessor.z(f)) * 0.04;
            contextualEventDispatcher = contextualEventDispatcher.A(-contextualEventDispatcher2.X() * d4 / d3, d4 * 3.2, -contextualEventDispatcher2.f() * d4 / d3);
        }
        if (d3 > 0.0) {
            contextualEventDispatcher = contextualEventDispatcher.A((contextualEventDispatcher2.X() / d3 * d2 - contextualEventDispatcher.X()) * 0.1, 0.0, (contextualEventDispatcher2.f() / d3 * d2 - contextualEventDispatcher.f()) * 0.1);
        }
        return contextualEventDispatcher.U(0.99f, 0.98f, 0.99f);
    }

    @Override
    public void J(NumericComputationFramework numericComputationFramework) {
        this.v = numericComputationFramework.i;
        this.x = numericComputationFramework.z;
        this.l = numericComputationFramework.n;
        this.D = numericComputationFramework.L;
        this.Y = numericComputationFramework.W;
        this.y.B(numericComputationFramework.s);
        this.y.Q(numericComputationFramework.D);
        this.y.A(numericComputationFramework.l);
        this.y.W(numericComputationFramework.Q);
        this.y.X(numericComputationFramework.q);
        this.y.p(numericComputationFramework.J);
        ContextualEventDispatcher contextualEventDispatcher = ContextualEventDispatcher.N(numericComputationFramework.k, numericComputationFramework.G, numericComputationFramework.b);
        this.y.R(contextualEventDispatcher);
        this.y.a(numericComputationFramework.H);
        this.y.f(numericComputationFramework.p);
        this.y.z(numericComputationFramework.o);
        this.y.G(numericComputationFramework.S);
        this.y.W(numericComputationFramework.A);
        this.y.r(numericComputationFramework.K);
        this.y.h(numericComputationFramework.g);
        this.y.M(numericComputationFramework.j);
        this.y.q(numericComputationFramework.M);
        this.y.A(numericComputationFramework.x);
        TransactionSequenceManager transactionSequenceManager = this.y.x(EncodingProtocolHandler.L());
        transactionSequenceManager.h();
        for (Object e : numericComputationFramework.I) {
            transactionSequenceManager.V(new NetworkConnectionHandler1792(e));
        }
        this.N = numericComputationFramework.O;
        this.d = numericComputationFramework.B;
        this.V = numericComputationFramework.P;
        this.A = numericComputationFramework.F;
        this.n = numericComputationFramework.V;
        this.W = numericComputationFramework.y;
        this.U = numericComputationFramework.w;
    }

    private void l() {
        try {
            this.y.H(null);
            this.y.m(this.y.a());
            this.y.i(false);
            this.y.W();
            this.y.d();
            this.y.s();
            if (this.y.x()) {
                this.y.V(this.y.W() * 0.5f);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicProtocolNegotiator.a(customSystemException);
        }
        this.y.p();
    }

    private void M() {
        this.y.R(this.y.i().A(0.0, -0.04f, 0.0));
    }

    private void t() {
        block88: {
            boolean bl;
            block77: {
                boolean bl2;
                block85: {
                    boolean bl3;
                    block84: {
                        block83: {
                            boolean bl4;
                            block80: {
                                block79: {
                                    block76: {
                                        boolean bl5;
                                        block74: {
                                            block75: {
                                                boolean bl6;
                                                boolean bl7;
                                                long l;
                                                block73: {
                                                    block72: {
                                                        boolean bl8;
                                                        l = a ^ 0x38FEA7BF74B5L;
                                                        try {
                                                            if (this.v > 0) {
                                                                --this.v;
                                                            }
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw CryptographicProtocolNegotiator.a(customSystemException);
                                                        }
                                                        boolean bl9 = this.D;
                                                        boolean bl10 = this.Y;
                                                        boolean bl11 = this.L();
                                                        TransactionProcessor1409 transactionProcessor1409 = this.y.M();
                                                        try {
                                                            this.Y();
                                                            if (this.y()) {
                                                                this.y.h(false);
                                                            }
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw CryptographicProtocolNegotiator.a(customSystemException);
                                                        }
                                                        if (this.C()) {
                                                            float f = (float)this.y.o(EncodingProtocolHandler.u());
                                                            this.l *= f;
                                                            this.x *= f;
                                                        }
                                                        if (!this.y.L()) {
                                                            double d2 = this.y.F();
                                                            double d3 = this.y.B();
                                                            float f = this.y.d();
                                                            this.k(d2 - (double)f * 0.35, d3 + (double)f * 0.35);
                                                            this.k(d2 - (double)f * 0.35, d3 - (double)f * 0.35);
                                                            this.k(d2 + (double)f * 0.35, d3 - (double)f * 0.35);
                                                            this.k(d2 + (double)f * 0.35, d3 + (double)f * 0.35);
                                                        }
                                                        try {
                                                            if (bl10) {
                                                                this.v = 0;
                                                            }
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw CryptographicProtocolNegotiator.a(customSystemException);
                                                        }
                                                        bl5 = this.Z();
                                                        try {
                                                            bl8 = this.y.d() ? this.y.o().j() : this.y.j();
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw CryptographicProtocolNegotiator.a(customSystemException);
                                                        }
                                                        bl7 = bl8;
                                                        try {
                                                            try {
                                                                if (bl10 || bl11) break block72;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw CryptographicProtocolNegotiator.a(customSystemException);
                                                            }
                                                            bl6 = true;
                                                            break block73;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw CryptographicProtocolNegotiator.a(customSystemException);
                                                        }
                                                    }
                                                    bl6 = false;
                                                }
                                                boolean bl12 = bl6;
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (!bl7 && !this.y.q()) break block74;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw CryptographicProtocolNegotiator.a(customSystemException);
                                                                    }
                                                                    if (!bl12) break block74;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw CryptographicProtocolNegotiator.a(customSystemException);
                                                                }
                                                                if (!bl5) break block74;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw CryptographicProtocolNegotiator.a(customSystemException);
                                                            }
                                                            if (this.v > 0) break block75;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw CryptographicProtocolNegotiator.a(customSystemException);
                                                        }
                                                        if (this.U) break block75;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw CryptographicProtocolNegotiator.a(customSystemException);
                                                    }
                                                    this.v = (int)CryptographicProtocolNegotiator.a("p", (int)7541, (long)(0x12E5FD3081082402L ^ l));
                                                    break block74;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CryptographicProtocolNegotiator.a(customSystemException);
                                                }
                                            }
                                            this.y.h(true);
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (this.y.F() && !this.y.q()) break block76;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw CryptographicProtocolNegotiator.a(customSystemException);
                                                    }
                                                    if (!bl5) break block76;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CryptographicProtocolNegotiator.a(customSystemException);
                                                }
                                                if (!this.U) break block76;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptographicProtocolNegotiator.a(customSystemException);
                                            }
                                            this.y.h(true);
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptographicProtocolNegotiator.a(customSystemException);
                                        }
                                    }
                                    try {
                                        block78: {
                                            try {
                                                try {
                                                    if (!this.y.o()) break block77;
                                                    if (!this.a()) break block78;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CryptographicProtocolNegotiator.a(customSystemException);
                                                }
                                                if (this.d()) break block79;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptographicProtocolNegotiator.a(customSystemException);
                                            }
                                        }
                                        bl4 = true;
                                        break block80;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptographicProtocolNegotiator.a(customSystemException);
                                    }
                                }
                                bl4 = false;
                            }
                            bl = bl4;
                            try {
                                block81: {
                                    try {
                                        try {
                                            block82: {
                                                try {
                                                    try {
                                                        if (bl) break block81;
                                                        if (!this.y.P()) break block82;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw CryptographicProtocolNegotiator.a(customSystemException);
                                                    }
                                                    if (!this.y.Q()) break block81;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CryptographicProtocolNegotiator.a(customSystemException);
                                                }
                                            }
                                            if (!this.y.F()) break block83;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptographicProtocolNegotiator.a(customSystemException);
                                        }
                                        if (this.y.q()) break block83;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptographicProtocolNegotiator.a(customSystemException);
                                    }
                                }
                                bl3 = true;
                                break block84;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicProtocolNegotiator.a(customSystemException);
                            }
                        }
                        bl3 = false;
                    }
                    bl2 = bl3;
                    try {
                        block87: {
                            try {
                                block86: {
                                    try {
                                        try {
                                            try {
                                                if (!this.y.f()) break block85;
                                                if (this.y.j()) break block86;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptographicProtocolNegotiator.a(customSystemException);
                                            }
                                            if (this.n) break block86;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptographicProtocolNegotiator.a(customSystemException);
                                        }
                                        if (bl) break block87;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptographicProtocolNegotiator.a(customSystemException);
                                    }
                                }
                                if (this.y.F()) break block77;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicProtocolNegotiator.a(customSystemException);
                            }
                        }
                        this.y.h(false);
                        break block77;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicProtocolNegotiator.a(customSystemException);
                    }
                }
                try {
                    if (bl2) {
                        this.y.h(false);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicProtocolNegotiator.a(customSystemException);
                }
            }
            bl = false;
            try {
                try {
                    try {
                        if (!this.y.F() || !this.n) break block88;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicProtocolNegotiator.a(customSystemException);
                    }
                    if (!this.y.n()) break block88;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicProtocolNegotiator.a(customSystemException);
                }
                this.M();
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicProtocolNegotiator.a(customSystemException);
            }
        }
        this.R();
    }

    private void k(double d2, double d3) {
        block10: {
            ReflectionUtilityBroker reflectionUtilityBroker = ReflectionUtilityBroker.L(d2, this.y.V(), d3);
            if (this.B(reflectionUtilityBroker)) {
                double d4 = d2 - (double)reflectionUtilityBroker.o();
                double d5 = d3 - (double)reflectionUtilityBroker.j();
                StreamProcessingEngine1677 streamProcessingEngine1677 = null;
                double d6 = Double.MAX_VALUE;
                AdaptiveConfigurationManager[] adaptiveConfigurationManagerArray = new AdaptiveConfigurationManager[]{StreamProcessingEngine1677.A(), StreamProcessingEngine1677.F(), StreamProcessingEngine1677.O(), StreamProcessingEngine1677.G()};
                for (AdaptiveConfigurationManager adaptiveConfigurationManager : adaptiveConfigurationManagerArray) {
                    double d7;
                    StreamProcessingEngine1677 streamProcessingEngine16772 = new StreamProcessingEngine1677(adaptiveConfigurationManager.M());
                    double d8 = streamProcessingEngine16772.J().m(d4, 0.0, d5);
                    try {
                        d7 = streamProcessingEngine16772.s().equals(SessionLifecycleManager.m()) ? 1.0 - d8 : d8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicProtocolNegotiator.a(customSystemException);
                    }
                    double d9 = d7;
                    try {
                        if (!(d9 < d6) || this.B(reflectionUtilityBroker.I(streamProcessingEngine16772))) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicProtocolNegotiator.a(customSystemException);
                    }
                    d6 = d9;
                    streamProcessingEngine1677 = streamProcessingEngine16772;
                }
                if (streamProcessingEngine1677 != null) {
                    ContextualEventDispatcher contextualEventDispatcher;
                    block9: {
                        contextualEventDispatcher = this.y.i();
                        try {
                            if (!streamProcessingEngine1677.J().equals(SecureTransmissionHandler.K())) break block9;
                            this.y.L(0.1 * (double)streamProcessingEngine1677.I(), contextualEventDispatcher.F(), contextualEventDispatcher.f());
                            break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicProtocolNegotiator.a(customSystemException);
                        }
                    }
                    this.y.L(contextualEventDispatcher.X(), contextualEventDispatcher.F(), 0.1 * (double)streamProcessingEngine1677.R());
                }
            }
        }
    }

    public void t(SystemHealthMonitor1733 systemHealthMonitor1733, ContextualEventDispatcher contextualEventDispatcher) {
        block43: {
            ObjectLifecycleTracker objectLifecycleTracker;
            boolean bl;
            boolean bl2;
            ContextualEventDispatcher contextualEventDispatcher2;
            block54: {
                block53: {
                    block48: {
                        boolean bl3;
                        Qh qh;
                        block52: {
                            block51: {
                                boolean bl4;
                                Qh qh2;
                                block50: {
                                    block49: {
                                        boolean bl5;
                                        Qh qh3;
                                        block47: {
                                            block46: {
                                                boolean bl6;
                                                boolean bl7;
                                                block44: {
                                                    block45: {
                                                        block42: {
                                                            try {
                                                                if (!this.y.L()) break block42;
                                                                this.y.R(this.y.F() + contextualEventDispatcher.X(), this.y.V() + contextualEventDispatcher.F(), this.y.B() + contextualEventDispatcher.f());
                                                                break block43;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw CryptographicProtocolNegotiator.a(customSystemException);
                                                            }
                                                        }
                                                        if (systemHealthMonitor1733.equals(SystemHealthMonitor1733.U())) {
                                                            contextualEventDispatcher = this.y.W(contextualEventDispatcher);
                                                            try {
                                                                if (contextualEventDispatcher.equals(ContextualEventDispatcher.x())) {
                                                                    return;
                                                                }
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw CryptographicProtocolNegotiator.a(customSystemException);
                                                            }
                                                        }
                                                        if (this.y.x().R() > 1.0E-7) {
                                                            contextualEventDispatcher = contextualEventDispatcher.D(this.y.x());
                                                            this.y.Z(ContextualEventDispatcher.x());
                                                            this.y.R(ContextualEventDispatcher.x());
                                                        }
                                                        contextualEventDispatcher = this.y.g(contextualEventDispatcher, systemHealthMonitor1733);
                                                        contextualEventDispatcher2 = this.y.I(contextualEventDispatcher);
                                                        double d2 = contextualEventDispatcher2.R();
                                                        try {
                                                            try {
                                                                try {
                                                                    if (!(d2 > 1.0E-7) && !(contextualEventDispatcher.R() - d2 < 1.0E-7)) break block44;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw CryptographicProtocolNegotiator.a(customSystemException);
                                                                }
                                                                if (this.y.W() == 0.0f) break block45;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw CryptographicProtocolNegotiator.a(customSystemException);
                                                            }
                                                            if (!(d2 >= 1.0)) break block45;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw CryptographicProtocolNegotiator.a(customSystemException);
                                                        }
                                                        TransactionValidator2324 transactionValidator2324 = this.o.g(VapeDataProcessor.Q(this.y.g(), this.y.g().P(contextualEventDispatcher2), DU.g(), DJ.a(), this.y));
                                                        try {
                                                            if (!transactionValidator2324.q().equals(ObjectValidator.u())) {
                                                                this.y.V(0.0f);
                                                            }
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw CryptographicProtocolNegotiator.a(customSystemException);
                                                        }
                                                    }
                                                    this.y.R(this.y.F() + contextualEventDispatcher2.X(), this.y.V() + contextualEventDispatcher2.F(), this.y.B() + contextualEventDispatcher2.f());
                                                }
                                                try {
                                                    bl7 = !AnalyticsDataProcessor.z(contextualEventDispatcher.X(), contextualEventDispatcher2.X());
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CryptographicProtocolNegotiator.a(customSystemException);
                                                }
                                                bl2 = bl7;
                                                try {
                                                    bl6 = !AnalyticsDataProcessor.z(contextualEventDispatcher.f(), contextualEventDispatcher2.f());
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CryptographicProtocolNegotiator.a(customSystemException);
                                                }
                                                bl = bl6;
                                                try {
                                                    try {
                                                        qh3 = this.y;
                                                        if (!bl2 && !bl) break block46;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw CryptographicProtocolNegotiator.a(customSystemException);
                                                    }
                                                    bl5 = true;
                                                    break block47;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CryptographicProtocolNegotiator.a(customSystemException);
                                                }
                                            }
                                            bl5 = false;
                                        }
                                        try {
                                            try {
                                                qh3.y(bl5);
                                                if (!(Math.abs(contextualEventDispatcher.F()) > 0.0)) break block48;
                                                qh2 = this.y;
                                                if (contextualEventDispatcher.F() == contextualEventDispatcher2.F()) break block49;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptographicProtocolNegotiator.a(customSystemException);
                                            }
                                            bl4 = true;
                                            break block50;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptographicProtocolNegotiator.a(customSystemException);
                                        }
                                    }
                                    bl4 = false;
                                }
                                try {
                                    try {
                                        qh2.g(bl4);
                                        qh = this.y;
                                        if (!this.y.D() || !(contextualEventDispatcher.F() < 0.0)) break block51;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptographicProtocolNegotiator.a(customSystemException);
                                    }
                                    bl3 = true;
                                    break block52;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicProtocolNegotiator.a(customSystemException);
                                }
                            }
                            bl3 = false;
                        }
                        qh.s(bl3);
                        this.y.R(this.y.i(), this.y.P(), contextualEventDispatcher2);
                    }
                    try {
                        if (!this.y.P()) break block53;
                        this.y.x(this.o(contextualEventDispatcher2));
                        break block54;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicProtocolNegotiator.a(customSystemException);
                    }
                }
                this.y.x(false);
            }
            if (this.y.P()) {
                double d3;
                double d4;
                double d5;
                Qh qh;
                objectLifecycleTracker = this.y.i();
                try {
                    qh = this.y;
                    d5 = bl2 ? 0.0 : ((ContextualEventDispatcher)objectLifecycleTracker).X();
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicProtocolNegotiator.a(customSystemException);
                }
                try {
                    d4 = ((ContextualEventDispatcher)objectLifecycleTracker).F();
                    d3 = bl ? 0.0 : ((ContextualEventDispatcher)objectLifecycleTracker).f();
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicProtocolNegotiator.a(customSystemException);
                }
                qh.L(d5, d4, d3);
            }
            objectLifecycleTracker = this.y.e();
            TransactionCorrelationEngine transactionCorrelationEngine = this.o.T((ReflectionUtilityBroker)objectLifecycleTracker).I();
            try {
                if (contextualEventDispatcher.F() != contextualEventDispatcher2.F()) {
                    transactionCorrelationEngine.h(this.o, this.y);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicProtocolNegotiator.a(customSystemException);
            }
            float f = this.y.O();
            this.y.R(this.y.i().U(f, 1.0, f));
        }
    }

    @Override
    public void C() {
        this.v = this.S.N();
        TransactionSequenceManager transactionSequenceManager = this.g.x(EncodingProtocolHandler.L());
        TransactionSequenceManager transactionSequenceManager2 = this.y.x(EncodingProtocolHandler.L());
        transactionSequenceManager2.h();
        for (Object e : transactionSequenceManager.D()) {
            transactionSequenceManager2.V(new NetworkConnectionHandler1792(e));
        }
    }

    private void a(ContextualEventDispatcher contextualEventDispatcher) {
        block12: {
            double d2;
            block14: {
                block11: {
                    try {
                        if (!this.y.d()) break block11;
                        this.U(contextualEventDispatcher);
                        break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicProtocolNegotiator.a(customSystemException);
                    }
                }
                if (this.y.f()) {
                    double d3;
                    block13: {
                        double d4;
                        d2 = this.y.q().F();
                        try {
                            d4 = d2 < -0.2 ? 0.085 : 0.06;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicProtocolNegotiator.a(customSystemException);
                        }
                        d3 = d4;
                        try {
                            try {
                                if (d2 <= 0.0 || this.y.A()) break block13;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicProtocolNegotiator.a(customSystemException);
                            }
                            if (this.o.V(ReflectionUtilityBroker.L(this.y.F(), this.y.V() + 1.0 - 0.1, this.y.B())).F()) break block14;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicProtocolNegotiator.a(customSystemException);
                        }
                    }
                    ContextualEventDispatcher contextualEventDispatcher2 = this.y.i();
                    this.y.R(contextualEventDispatcher2.A(0.0, (d2 - contextualEventDispatcher2.F()) * d3, 0.0));
                }
            }
            if (this.y.M().K()) {
                d2 = this.y.i().F();
                this.U(contextualEventDispatcher);
                this.y.R(this.y.i().z(SecureTransmissionHandler.Q(), d2 * 0.6));
            } else {
                this.U(contextualEventDispatcher);
            }
        }
    }

    private boolean T() {
        boolean bl;
        block5: {
            block4: {
                try {
                    if (!this.B()) break block4;
                    bl = this.I();
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicProtocolNegotiator.a(customSystemException);
                }
            }
            try {
                bl = (double)this.x >= 0.8;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicProtocolNegotiator.a(customSystemException);
            }
        }
        return bl;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public boolean g() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.y.H() && !this.y.V()) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicProtocolNegotiator.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicProtocolNegotiator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean U() {
        return this.y.e(ObjectPipelineManager.h);
    }

    private boolean L() {
        boolean bl;
        block5: {
            block4: {
                double d2 = 0.8;
                try {
                    if (!this.y.q()) break block4;
                    bl = this.a();
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicProtocolNegotiator.a(customSystemException);
                }
            }
            try {
                bl = (double)this.x >= 0.8;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicProtocolNegotiator.a(customSystemException);
            }
        }
        return bl;
    }

    private ContextualEventDispatcher j(ContextualEventDispatcher contextualEventDispatcher, float f) {
        ContextualEventDispatcher contextualEventDispatcher2;
        block8: {
            block9: {
                this.y.l(this.y.s(f), contextualEventDispatcher);
                this.y.R(this.y.M(this.y.i()));
                this.t(SystemHealthMonitor1733.s(), this.y.i());
                contextualEventDispatcher2 = this.y.i();
                try {
                    try {
                        try {
                            try {
                                if (!this.y.P() && !this.y.A()) break block8;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicProtocolNegotiator.a(customSystemException);
                            }
                            if (this.y.T()) break block9;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicProtocolNegotiator.a(customSystemException);
                        }
                        if (!this.y.X().m(ResourceConfigManager.W())) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicProtocolNegotiator.a(customSystemException);
                    }
                    if (!TransactionCorrelationEngine.U(this.y)) break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicProtocolNegotiator.a(customSystemException);
                }
            }
            contextualEventDispatcher2 = ContextualEventDispatcher.N(contextualEventDispatcher2.X(), 0.2, contextualEventDispatcher2.f());
        }
        return contextualEventDispatcher2;
    }

    private void z() {
        this.y.R(this.y.i().A(0.0, 0.04f, 0.0));
    }

    public boolean B() {
        return this.y.q();
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2A9F;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/z8", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptographicProtocolNegotiator.e[n2] = n3;
        }
        return e[n2];
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(-8248469039860490356L, 9100955957451298911L, MethodHandles.lookup().lookupClass()).a(175844567030220L);
        f = new HashMap(13);
        long l = a ^ 0x550295EF9591L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u00f3\u00b25\u0006\u009d\u00f5\b\u0098.\u00bb0\u00fd\u0098\u00a3\u00b1\u00c9";
        int n2 = "\u00f3\u00b25\u0006\u009d\u00f5\b\u0098.\u00bb0\u00fd\u0098\u00a3\u00b1\u00c9".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        e = new Integer[2];
    }

    private float x() {
        return (float)this.y.o(EncodingProtocolHandler.L());
    }

    private void a() {
        ContextualEventDispatcher contextualEventDispatcher = this.y.i();
        this.y.R(this.q(contextualEventDispatcher));
        this.t(SystemHealthMonitor1733.s(), this.y.i());
    }

    protected boolean o(ContextualEventDispatcher contextualEventDispatcher) {
        block4: {
            boolean bl;
            float f = this.y.q() * ((float)Math.PI / 180);
            double d2 = AnalyticsDataProcessor.z(f);
            double d3 = AnalyticsDataProcessor.O(f);
            double d4 = (double)this.y.w() * d3 - (double)this.y.u() * d2;
            double d5 = (double)this.y.u() * d3 + (double)this.y.w() * d2;
            double d6 = AnalyticsDataProcessor.o(d4) + AnalyticsDataProcessor.o(d5);
            double d7 = AnalyticsDataProcessor.o(contextualEventDispatcher.X()) + AnalyticsDataProcessor.o(contextualEventDispatcher.f());
            try {
                if (d6 < (double)1.0E-5f || d7 < (double)1.0E-5f) break block4;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicProtocolNegotiator.a(customSystemException);
            }
            double d8 = d4 * contextualEventDispatcher.X() + d5 * contextualEventDispatcher.f();
            double d9 = Math.acos(d8 / Math.sqrt(d6 * d7));
            try {
                bl = d9 < 0.13962633907794952;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicProtocolNegotiator.a(customSystemException);
            }
            return bl;
        }
        return false;
    }

    private void o() {
        block9: {
            long l;
            block8: {
                l = a ^ 0x5CF6F25D84C9L;
                try {
                    try {
                        this.y.G(false);
                        if (!this.y.I() && !this.y.d()) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicProtocolNegotiator.a(customSystemException);
                    }
                    this.y.W(false);
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicProtocolNegotiator.a(customSystemException);
                }
            }
            this.y.h();
            this.p();
            CallSite callSite = CryptographicProtocolNegotiator.a("p", (int)17084, (long)(0x642E1ADA5B250BB6L ^ l));
            double d2 = AnalyticsDataProcessor.F(this.y.F(), -2.9999999E7, 2.9999999E7);
            double d3 = AnalyticsDataProcessor.F(this.y.B(), -2.9999999E7, 2.9999999E7);
            try {
                try {
                    if (d2 == this.y.F() && d3 == this.y.B()) break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicProtocolNegotiator.a(customSystemException);
                }
                this.y.R(d2, this.y.V(), d3);
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicProtocolNegotiator.a(customSystemException);
            }
        }
        this.y.r();
    }

    public void U(ContextualEventDispatcher contextualEventDispatcher) {
        block11: {
            block12: {
                block10: {
                    UserInteractionManager userInteractionManager = this.o.V(this.y.C());
                    try {
                        try {
                            try {
                                try {
                                    if (!this.y.F() && !this.y.x()) break block10;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicProtocolNegotiator.a(customSystemException);
                                }
                                if (!this.y.n()) break block10;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicProtocolNegotiator.a(customSystemException);
                            }
                            if (this.y.O(userInteractionManager)) break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicProtocolNegotiator.a(customSystemException);
                        }
                        this.M(contextualEventDispatcher);
                        break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicProtocolNegotiator.a(customSystemException);
                    }
                }
                try {
                    if (!this.y.C()) break block12;
                    this.a();
                    break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicProtocolNegotiator.a(customSystemException);
                }
            }
            this.C(contextualEventDispatcher);
        }
    }

    private void M(ContextualEventDispatcher contextualEventDispatcher) {
        block24: {
            double d2;
            block25: {
                double d3;
                boolean bl;
                block20: {
                    ContextualEventDispatcher contextualEventDispatcher2;
                    float f;
                    block23: {
                        float f2;
                        block22: {
                            block21: {
                                boolean bl2;
                                try {
                                    bl2 = this.y.i().F() <= 0.0;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicProtocolNegotiator.a(customSystemException);
                                }
                                bl = bl2;
                                d2 = this.y.V();
                                d3 = this.y.X();
                                try {
                                    try {
                                        if (!this.y.F()) break block20;
                                        if (!this.y.o()) break block21;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptographicProtocolNegotiator.a(customSystemException);
                                    }
                                    f2 = 0.9f;
                                    break block22;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicProtocolNegotiator.a(customSystemException);
                                }
                            }
                            f2 = this.y.I();
                        }
                        f = f2;
                        float f3 = 0.02f;
                        float f4 = (float)this.y.o(EncodingProtocolHandler.X());
                        if (!this.y.j()) {
                            f4 *= 0.5f;
                        }
                        if (f4 > 0.0f) {
                            f += (0.54600006f - f) * f4;
                            f3 += (this.x() - f3) * f4;
                        }
                        if (this.y.e(ObjectPipelineManager.Y)) {
                            f = 0.96f;
                        }
                        this.y.l(f3, contextualEventDispatcher);
                        this.t(SystemHealthMonitor1733.s(), this.y.i());
                        contextualEventDispatcher2 = this.y.i();
                        try {
                            if (!this.y.P() || !this.y.T()) break block23;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicProtocolNegotiator.a(customSystemException);
                        }
                        contextualEventDispatcher2 = ContextualEventDispatcher.N(contextualEventDispatcher2.X(), 0.2, contextualEventDispatcher2.f());
                    }
                    contextualEventDispatcher2 = contextualEventDispatcher2.U(f, 0.8f, f);
                    this.y.R(this.y.X(d3, bl, contextualEventDispatcher2));
                    break block25;
                }
                this.y.l(0.02f, contextualEventDispatcher);
                this.t(SystemHealthMonitor1733.s(), this.y.i());
                if (this.y.h(StreamProtocolHandler2021.u()) <= this.h()) {
                    this.y.R(this.y.i().U(0.5, 0.8f, 0.5));
                    ContextualEventDispatcher contextualEventDispatcher3 = this.y.X(d3, bl, this.y.i());
                    this.y.R(contextualEventDispatcher3);
                } else {
                    this.y.R(this.y.i().f(0.5));
                }
                try {
                    if (d3 != 0.0) {
                        this.y.R(this.y.i().A(0.0, -d3 / 4.0, 0.0));
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicProtocolNegotiator.a(customSystemException);
                }
            }
            ContextualEventDispatcher contextualEventDispatcher4 = this.y.i();
            try {
                try {
                    if (!this.y.P() || !this.y.u(contextualEventDispatcher4.X(), contextualEventDispatcher4.F() + (double)0.6f - this.y.V() + d2, contextualEventDispatcher4.f())) break block24;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicProtocolNegotiator.a(customSystemException);
                }
                this.y.L(contextualEventDispatcher4.X(), 0.3f, contextualEventDispatcher4.f());
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicProtocolNegotiator.a(customSystemException);
            }
        }
    }

    private boolean Z() {
        boolean bl;
        block18: {
            block16: {
                try {
                    block17: {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (this.y.o() || !this.L()) break block16;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CryptographicProtocolNegotiator.a(customSystemException);
                                                }
                                                if (!this.d()) break block16;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptographicProtocolNegotiator.a(customSystemException);
                                            }
                                            if (this.U()) break block16;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptographicProtocolNegotiator.a(customSystemException);
                                        }
                                        if (this.y.d()) break block16;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptographicProtocolNegotiator.a(customSystemException);
                                    }
                                    if (this.y.C()) break block16;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicProtocolNegotiator.a(customSystemException);
                                }
                                if (!this.C()) break block17;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicProtocolNegotiator.a(customSystemException);
                            }
                            if (!this.y.q()) break block16;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicProtocolNegotiator.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block18;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicProtocolNegotiator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private void j() {
        this.o();
    }

    private void R() {
        this.w();
        this.y.q((float)this.y.o(EncodingProtocolHandler.L()));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptographicProtocolNegotiator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

