/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.descriptor;

import a.Qh;
import a.oQ;
import a.zx;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.network.NetworkConnectionHandler1792;
import com.app.ui.UserInteractionManager;
import com.collections.management.MultiContainerRegistry;
import com.data.streaming.StreamProcessingEngine1677;
import com.event.management.ContextualEventDispatcher;
import com.event.management.EventDispatchCoordinator1090;
import com.exception.system.CustomSystemException;
import com.math.computation.NumericComputationFramework;
import com.network.protocol.NetworkProtocolNegotiator;
import com.network.protocol.TransmissionProtocolHandler1868;
import com.network.security.SecureTransmissionHandler;
import com.network.streaming.StreamProtocolHandler2021;
import com.protocol.encoding.EncodingProtocolHandler;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.security.transform.CryptographicTransformer;
import com.session.management.SessionLifecycleManager;
import com.system.config.AdaptiveConfigurationManager;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.monitoring.SystemHealthMonitor1733;
import com.system.pipeline.ObjectPipelineManager;
import com.transaction.processing.TransactionSequenceManager;
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
public class AdvancedMethodDescriptorHandler
extends zx {
    private static final long a = MultiContainerRegistry.a(-3551398118293219878L, 2522693864856147774L, MethodHandles.lookup().lookupClass()).a(83386597302881L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map e;

    public boolean L() {
        return true;
    }

    private void d() {
        this.y.R(this.y.i().A(0.0, -0.04f, 0.0));
    }

    private boolean a(ReflectionUtilityBroker reflectionUtilityBroker) {
        boolean bl;
        Object object = this.y.L();
        oQ oQ2 = oQ.E(reflectionUtilityBroker.o(), ((oQ)object).c(), reflectionUtilityBroker.j(), (double)reflectionUtilityBroker.o() + 1.0, ((oQ)object).P(), (double)reflectionUtilityBroker.j() + 1.0).U(1.0E-7);
        try {
            bl = !this.o.b(this.y, oQ2, this::lambda$shouldBlockPushPlayer$0);
        }
        catch (CustomSystemException customSystemException) {
            throw AdvancedMethodDescriptorHandler.a(customSystemException);
        }
        return bl;
    }

    public ContextualEventDispatcher m(ContextualEventDispatcher contextualEventDispatcher, float f) {
        ContextualEventDispatcher contextualEventDispatcher2;
        block4: {
            this.y.l(this.y.s(f), contextualEventDispatcher);
            this.y.R(this.y.M(this.y.i()));
            this.y.o(SystemHealthMonitor1733.s(), this.y.i());
            contextualEventDispatcher2 = this.y.i();
            try {
                try {
                    if (!this.y.P() && !this.y.A()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdvancedMethodDescriptorHandler.a(customSystemException);
                }
                if (!this.y.T()) break block4;
            }
            catch (CustomSystemException customSystemException) {
                throw AdvancedMethodDescriptorHandler.a(customSystemException);
            }
            contextualEventDispatcher2 = ContextualEventDispatcher.N(contextualEventDispatcher2.X(), 0.2, contextualEventDispatcher2.f());
        }
        return contextualEventDispatcher2;
    }

    private void k() {
        block4: {
            long l = a ^ 0x77A9783C11E5L;
            this.y.h();
            this.w();
            CallSite callSite = AdvancedMethodDescriptorHandler.a("d", (int)14323, (long)(0x95411B8D036CFD5L ^ l));
            double d2 = AdaptiveComputationEngine.Z(this.y.F(), -2.9999999E7, 2.9999999E7);
            double d3 = AdaptiveComputationEngine.Z(this.y.B(), -2.9999999E7, 2.9999999E7);
            try {
                try {
                    if (d2 == this.y.F() && d3 == this.y.B()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdvancedMethodDescriptorHandler.a(customSystemException);
                }
                this.y.R(d2, this.y.V(), d3);
            }
            catch (CustomSystemException customSystemException) {
                throw AdvancedMethodDescriptorHandler.a(customSystemException);
            }
        }
        this.y.r();
    }

    private void Z() {
        List list = this.o.P(this.y, this.y.S(), VapeDataTransformer.I(this.S));
        if (!list.isEmpty()) {
            for (Object e : list) {
                try {
                    try {
                        try {
                            if (ReflectionMetadataResolver.rl.isInstance(e) || e == this.y.M()) continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdvancedMethodDescriptorHandler.a(customSystemException);
                        }
                        if (e == this.g.M()) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdvancedMethodDescriptorHandler.a(customSystemException);
                    }
                    this.y.v(new CryptographicTransformer(e));
                }
                catch (CustomSystemException customSystemException) {
                    throw AdvancedMethodDescriptorHandler.a(customSystemException);
                }
            }
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/zq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public boolean S() {
        boolean bl;
        try {
            bl = this.x > 1.0E-5f;
        }
        catch (CustomSystemException customSystemException) {
            throw AdvancedMethodDescriptorHandler.a(customSystemException);
        }
        return bl;
    }

    private void g(ContextualEventDispatcher contextualEventDispatcher) {
        block15: {
            block14: {
                int n;
                float f;
                Qh qh;
                double d2;
                block12: {
                    double d3;
                    block13: {
                        double d4;
                        this.y.G(false);
                        double d5 = this.y.F();
                        double d6 = this.y.V();
                        double d7 = this.y.B();
                        try {
                            if (!this.y.f() || this.y.d()) break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdvancedMethodDescriptorHandler.a(customSystemException);
                        }
                        d2 = this.y.q().F();
                        try {
                            d4 = d2 < -0.2 ? 0.085 : 0.06;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdvancedMethodDescriptorHandler.a(customSystemException);
                        }
                        d3 = d4;
                        try {
                            try {
                                if (d2 <= 0.0 || this.y.A()) break block13;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdvancedMethodDescriptorHandler.a(customSystemException);
                            }
                            if (this.o.T(ReflectionUtilityBroker.L(this.y.F(), this.y.V() + 1.0 - 0.1, this.y.B())).s().F()) break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdvancedMethodDescriptorHandler.a(customSystemException);
                        }
                    }
                    ContextualEventDispatcher contextualEventDispatcher2 = this.y.i();
                    this.y.R(contextualEventDispatcher2.A(0.0, (d2 - contextualEventDispatcher2.F()) * d3, 0.0));
                }
                try {
                    if (!this.y.M().K() || this.y.d()) break block14;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdvancedMethodDescriptorHandler.a(customSystemException);
                }
                d2 = this.y.i().F();
                float f2 = this.y.f();
                try {
                    qh = this.y;
                    f = this.y.M().G();
                    n = this.y.o() ? 2 : 1;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdvancedMethodDescriptorHandler.a(customSystemException);
                }
                qh.q(f * (float)n);
                this.V(contextualEventDispatcher);
                ContextualEventDispatcher contextualEventDispatcher3 = this.y.i();
                this.y.L(contextualEventDispatcher3.X(), d2 * 0.6, contextualEventDispatcher3.f());
                this.y.q(f2);
                this.y.V(0.0f);
                this.y.i(7, false);
                break block15;
            }
            this.V(contextualEventDispatcher);
        }
    }

    private void r(double d2, double d3) {
        block10: {
            ReflectionUtilityBroker reflectionUtilityBroker = ReflectionUtilityBroker.L(d2, this.y.V(), d3);
            if (this.a(reflectionUtilityBroker)) {
                double d4 = d2 - (double)reflectionUtilityBroker.o();
                double d5 = d3 - (double)reflectionUtilityBroker.j();
                StreamProcessingEngine1677 streamProcessingEngine1677 = null;
                double d6 = Double.MAX_VALUE;
                AdaptiveConfigurationManager[] adaptiveConfigurationManagerArray = new AdaptiveConfigurationManager[]{AdaptiveConfigurationManager.A(), AdaptiveConfigurationManager.F(), AdaptiveConfigurationManager.O(), AdaptiveConfigurationManager.G()};
                for (AdaptiveConfigurationManager adaptiveConfigurationManager : adaptiveConfigurationManagerArray) {
                    double d7;
                    StreamProcessingEngine1677 streamProcessingEngine16772 = new StreamProcessingEngine1677(adaptiveConfigurationManager.M());
                    double d8 = streamProcessingEngine16772.J().m(d4, 0.0, d5);
                    try {
                        d7 = streamProcessingEngine16772.s().equals(SessionLifecycleManager.m()) ? 1.0 - d8 : d8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdvancedMethodDescriptorHandler.a(customSystemException);
                    }
                    double d9 = d7;
                    try {
                        if (!(d9 < d6) || this.a(reflectionUtilityBroker.I(streamProcessingEngine16772))) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdvancedMethodDescriptorHandler.a(customSystemException);
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
                            this.y.L(0.1 * (double)streamProcessingEngine1677.P(), contextualEventDispatcher.F(), contextualEventDispatcher.f());
                            break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdvancedMethodDescriptorHandler.a(customSystemException);
                        }
                    }
                    this.y.L(contextualEventDispatcher.X(), contextualEventDispatcher.F(), 0.1 * (double)streamProcessingEngine1677.i());
                }
            }
        }
    }

    private boolean E() {
        boolean bl;
        block5: {
            block4: {
                try {
                    if (!this.Z()) break block4;
                    bl = this.S();
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdvancedMethodDescriptorHandler.a(customSystemException);
                }
            }
            try {
                bl = (double)this.x >= 0.8;
            }
            catch (CustomSystemException customSystemException) {
                throw AdvancedMethodDescriptorHandler.a(customSystemException);
            }
        }
        return bl;
    }

    private void S() {
        this.y.G(this.y.S());
        this.y.z(this.y.q());
        this.y.W();
        this.y.d();
        this.y.s();
    }

    private void w() {
        this.y();
        this.p();
    }

    public void E() {
        try {
            this.H();
            this.y.q(0.02f);
            if (this.y.o()) {
                this.y.q((float)((double)this.y.f() + 0.005999999865889549));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdvancedMethodDescriptorHandler.a(customSystemException);
        }
        this.y.A((float)this.y.Y(EncodingProtocolHandler.R()));
    }

    protected void a() {
        this.y.R(this.y.i().A(0.0, 0.04f, 0.0));
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void g() {
        this.k();
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4983;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/zq", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AdvancedMethodDescriptorHandler.c[n2] = n3;
        }
        return c[n2];
    }

    private boolean lambda$shouldBlockPushPlayer$0(Object object, Object object2) {
        TransmissionProtocolHandler1868 transmissionProtocolHandler1868 = new TransmissionProtocolHandler1868(object);
        return transmissionProtocolHandler1868.h(this.o.M(), object2);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = AdvancedMethodDescriptorHandler.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public void H() {
        block46: {
            block37: {
                block42: {
                    block44: {
                        boolean bl;
                        double d2;
                        block40: {
                            block39: {
                                block47: {
                                    block38: {
                                        try {
                                            if (this.y.S() > 0) {
                                                this.y.M(this.y.S() - 1);
                                            }
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                        }
                                        try {
                                            if (!this.L()) {
                                                this.y.R(this.y.i().f(0.98));
                                            }
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                        }
                                        ContextualEventDispatcher contextualEventDispatcher = this.y.i();
                                        double d3 = contextualEventDispatcher.X();
                                        double d4 = contextualEventDispatcher.F();
                                        double d5 = contextualEventDispatcher.f();
                                        if (Math.abs(d3) < 0.003) {
                                            d3 = 0.0;
                                        }
                                        if (Math.abs(d4) < 0.003) {
                                            d4 = 0.0;
                                        }
                                        if (Math.abs(d5) < 0.003) {
                                            d5 = 0.0;
                                        }
                                        try {
                                            try {
                                                this.y.L(d3, d4, d5);
                                                this.N();
                                                if (!this.y.A() || this.y.M().K()) break block37;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                            }
                                            if (!this.y.x()) break block38;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                        }
                                        d2 = this.y.h(StreamProtocolHandler2021.u());
                                        break block47;
                                    }
                                    d2 = this.y.h(StreamProtocolHandler2021.G());
                                }
                                try {
                                    try {
                                        if (!this.y.F() || !(d2 > 0.0)) break block39;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                    }
                                    bl = true;
                                    break block40;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                }
                            }
                            bl = false;
                        }
                        boolean bl2 = bl;
                        double d6 = this.m();
                        try {
                            try {
                                block45: {
                                    try {
                                        try {
                                            try {
                                                block43: {
                                                    try {
                                                        try {
                                                            try {
                                                                block41: {
                                                                    try {
                                                                        try {
                                                                            if (!bl2) break block41;
                                                                            if (!this.y.j()) break block42;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                                                        }
                                                                        if (d2 > d6) break block42;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                                                    }
                                                                }
                                                                if (!this.y.x()) break block43;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                                            }
                                                            if (!this.y.j()) break block44;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                                        }
                                                        if (d2 > d6) break block44;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                                    }
                                                }
                                                if (this.y.j()) break block45;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                            }
                                            if (!bl2) break block46;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                        }
                                        if (!(d2 <= d6)) break block46;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                    }
                                }
                                if (this.y.S() != 0) break block46;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdvancedMethodDescriptorHandler.a(customSystemException);
                            }
                            this.y.L();
                            this.y.M(10);
                            break block46;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdvancedMethodDescriptorHandler.a(customSystemException);
                        }
                    }
                    this.a();
                    break block46;
                }
                this.a();
                break block46;
            }
            this.y.M(0);
        }
        this.y.c(this.y.w() * 0.98f);
        this.y.X(this.y.u() * 0.98f);
        ContextualEventDispatcher contextualEventDispatcher = ContextualEventDispatcher.N(this.y.w(), 0.0, this.y.u());
        this.g(contextualEventDispatcher);
        this.Z();
    }

    @Override
    public void J(NumericComputationFramework numericComputationFramework) {
        this.G = numericComputationFramework.a;
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
        TransactionSequenceManager transactionSequenceManager = this.y.I(EncodingProtocolHandler.R());
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

    public boolean Z() {
        return this.y.q();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void V(ContextualEventDispatcher contextualEventDispatcher) {
        double d2;
        ContextualEventDispatcher contextualEventDispatcher2;
        float f;
        block51: {
            double d3;
            block49: {
                block50: {
                    float f2;
                    block48: {
                        block47: {
                            ContextualEventDispatcher contextualEventDispatcher3;
                            UserInteractionManager userInteractionManager;
                            boolean bl;
                            block45: {
                                ContextualEventDispatcher contextualEventDispatcher4;
                                float f3;
                                double d4;
                                block46: {
                                    float f4;
                                    block44: {
                                        boolean bl2;
                                        try {
                                            if (!this.L() && !this.y.c()) return;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                        }
                                        d3 = 0.08;
                                        try {
                                            bl2 = this.y.i().F() <= 0.0;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                        }
                                        bl = bl2;
                                        try {
                                            if (!bl || !this.y.e(ObjectPipelineManager.Q)) break block44;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                        }
                                        d3 = 0.01;
                                        this.y.V(0.0f);
                                    }
                                    userInteractionManager = this.o.V(this.y.C());
                                    try {
                                        try {
                                            if (!this.y.F() || !this.y.n()) break block45;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                        }
                                        if (this.y.O(userInteractionManager)) break block45;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                    }
                                    d4 = this.y.V();
                                    try {
                                        f4 = this.y.o() ? 0.9f : this.y.I();
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                    }
                                    f3 = f4;
                                    float f5 = 0.02f;
                                    float f6 = EventDispatchCoordinator1090.u(this.y);
                                    if (f6 > 3.0f) {
                                        f6 = 3.0f;
                                    }
                                    if (!this.y.j()) {
                                        f6 *= 0.5f;
                                    }
                                    if (f6 > 0.0f) {
                                        f3 += (0.54600006f - f3) * f6 / 3.0f;
                                        f5 += (this.y.a() - f5) * f6 / 3.0f;
                                    }
                                    if (this.y.e(ObjectPipelineManager.Y)) {
                                        f3 = 0.96f;
                                    }
                                    this.y.l(f5, contextualEventDispatcher);
                                    this.y.o(SystemHealthMonitor1733.s(), this.y.i());
                                    contextualEventDispatcher4 = this.y.i();
                                    try {
                                        if (!this.y.P() || !this.y.T()) break block46;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                    }
                                    contextualEventDispatcher4 = ContextualEventDispatcher.N(contextualEventDispatcher4.X(), 0.2, contextualEventDispatcher4.f());
                                }
                                this.y.R(contextualEventDispatcher4.U(f3, 0.8f, f3));
                                ContextualEventDispatcher contextualEventDispatcher5 = this.y.X(d3, bl, this.y.i());
                                try {
                                    try {
                                        this.y.R(contextualEventDispatcher5);
                                        if (!this.y.P() || !this.y.u(contextualEventDispatcher5.X(), contextualEventDispatcher5.F() + (double)0.6f - this.y.V() + d4, contextualEventDispatcher5.f())) return;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                    }
                                    this.y.L(contextualEventDispatcher5.X(), 0.3f, contextualEventDispatcher5.f());
                                    return;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                }
                            }
                            try {
                                try {
                                    if (!this.y.x() || !this.y.n()) break block47;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                }
                                if (this.y.O(userInteractionManager)) break block47;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdvancedMethodDescriptorHandler.a(customSystemException);
                            }
                            double d5 = this.y.V();
                            this.y.l(0.02f, contextualEventDispatcher);
                            this.y.o(SystemHealthMonitor1733.s(), this.y.i());
                            if (this.y.h(StreamProtocolHandler2021.u()) <= this.m()) {
                                this.y.R(this.y.i().U(0.5, 0.8f, 0.5));
                                contextualEventDispatcher3 = this.y.X(d3, bl, this.y.i());
                                this.y.R(contextualEventDispatcher3);
                            } else {
                                this.y.R(this.y.i().f(0.5));
                            }
                            try {
                                if (!this.y.s()) {
                                    this.y.R(this.y.i().A(0.0, -d3 / 4.0, 0.0));
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdvancedMethodDescriptorHandler.a(customSystemException);
                            }
                            contextualEventDispatcher3 = this.y.i();
                            try {
                                try {
                                    if (!this.y.P() || !this.y.u(contextualEventDispatcher3.X(), contextualEventDispatcher3.F() + (double)0.6f - this.y.V() + d5, contextualEventDispatcher3.f())) return;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                }
                                this.y.L(contextualEventDispatcher3.X(), 0.3f, contextualEventDispatcher3.f());
                                return;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdvancedMethodDescriptorHandler.a(customSystemException);
                            }
                        }
                        try {
                            if (!this.y.C()) break block48;
                            return;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdvancedMethodDescriptorHandler.a(customSystemException);
                        }
                    }
                    ReflectionUtilityBroker reflectionUtilityBroker = this.y.o();
                    float f7 = this.o.T(reflectionUtilityBroker).I().r();
                    try {
                        f2 = this.y.j() ? f7 * 0.91f : 0.91f;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdvancedMethodDescriptorHandler.a(customSystemException);
                    }
                    f = f2;
                    contextualEventDispatcher2 = this.m(contextualEventDispatcher, f7);
                    d2 = contextualEventDispatcher2.F();
                    if (this.y.e(ObjectPipelineManager.o)) {
                        d2 += (0.05 * (double)(this.y.W(ObjectPipelineManager.o).y() + 1) - contextualEventDispatcher2.F()) * 0.2;
                        this.y.V(0.0f);
                    } else {
                        try {
                            if (this.o.P(reflectionUtilityBroker)) break block49;
                            if (!(this.y.V() > 0.0)) break block50;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdvancedMethodDescriptorHandler.a(customSystemException);
                        }
                        d2 = -0.1;
                    }
                    break block51;
                }
                d2 = 0.0;
                break block51;
            }
            if (!this.y.s()) {
                d2 -= d3;
            }
        }
        this.y.L(contextualEventDispatcher2.X() * (double)f, d2 * (double)0.98f, contextualEventDispatcher2.f() * (double)f);
    }

    @Override
    public void C() {
        this.v = this.S.N();
        this.G = this.S.o();
        TransactionSequenceManager transactionSequenceManager = this.g.I(EncodingProtocolHandler.R());
        TransactionSequenceManager transactionSequenceManager2 = this.y.I(EncodingProtocolHandler.R());
        transactionSequenceManager2.h();
        for (Object e : transactionSequenceManager.D()) {
            transactionSequenceManager2.V(new NetworkConnectionHandler1792(e));
        }
        this.y.X(this.g.u());
        this.y.c(this.g.w());
    }

    public double m() {
        double d2;
        try {
            d2 = (double)this.y.E() < 0.4 ? 0.0 : 0.4;
        }
        catch (CustomSystemException customSystemException) {
            throw AdvancedMethodDescriptorHandler.a(customSystemException);
        }
        return d2;
    }

    private void y() {
        this.S();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new HashMap(13);
        long l = a ^ 0x599F6D6CE510L;
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
        String string = "Y9Z\u0019\rv\u0085\u0098c\u00cd\u0015\u00a5S\b\u00a3\u00ed";
        int n2 = "Y9Z\u0019\rv\u0085\u0098c\u00cd\u0015\u00a5S\b\u00a3\u00ed".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[2];
    }

    private void N() {
        this.y.c(this.l);
        this.y.X(this.x);
        this.y.U(this.D);
    }

    public AdvancedMethodDescriptorHandler(Qh qh, SystemConfigurationOrchestrator systemConfigurationOrchestrator, Qh qh2, NetworkProtocolNegotiator networkProtocolNegotiator) {
        super(qh, systemConfigurationOrchestrator, qh2, networkProtocolNegotiator);
    }

    public boolean a() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.y.H() && !this.y.V()) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdvancedMethodDescriptorHandler.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdvancedMethodDescriptorHandler.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
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

    @Override
    public void B() {
        this.g();
    }

    public void Y(boolean bl) {
        float f;
        block14: {
            block13: {
                float f2;
                block12: {
                    block11: {
                        try {
                            AdvancedMethodDescriptorHandler advancedMethodDescriptorHandler = this;
                            if (this.N != this.d) break block11;
                            f2 = 0.0f;
                            break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdvancedMethodDescriptorHandler.a(customSystemException);
                        }
                    }
                    try {
                        f2 = this.N ? 1.0f : -1.0f;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdvancedMethodDescriptorHandler.a(customSystemException);
                    }
                }
                try {
                    advancedMethodDescriptorHandler.x = f2;
                    AdvancedMethodDescriptorHandler advancedMethodDescriptorHandler = this;
                    if (this.V != this.A) break block13;
                    f = 0.0f;
                    break block14;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdvancedMethodDescriptorHandler.a(customSystemException);
                }
            }
            try {
                f = this.V ? 1.0f : -1.0f;
            }
            catch (CustomSystemException customSystemException) {
                throw AdvancedMethodDescriptorHandler.a(customSystemException);
            }
        }
        try {
            advancedMethodDescriptorHandler.l = f;
            this.D = this.W;
            this.Y = this.n;
            if (bl) {
                this.l = (float)((double)this.l * 0.3);
                this.x = (float)((double)this.x * 0.3);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdvancedMethodDescriptorHandler.a(customSystemException);
        }
    }

    public void p() {
        block102: {
            boolean bl;
            block92: {
                boolean bl2;
                block99: {
                    boolean bl3;
                    block98: {
                        block97: {
                            boolean bl4;
                            block95: {
                                block94: {
                                    boolean bl5;
                                    block90: {
                                        boolean bl6;
                                        block88: {
                                            block89: {
                                                boolean bl7;
                                                boolean bl8;
                                                boolean bl9;
                                                long l;
                                                block87: {
                                                    block86: {
                                                        block85: {
                                                            l = a ^ 0xD00DB5E94D5L;
                                                            try {
                                                                ++this.G;
                                                                if (this.v > 0) {
                                                                    --this.v;
                                                                }
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                                            }
                                                            boolean bl10 = this.Y;
                                                            boolean bl11 = this.D;
                                                            bl9 = this.Y;
                                                            bl8 = this.E();
                                                            this.Y(this.a());
                                                            bl6 = false;
                                                            try {
                                                                try {
                                                                    if (!bl6 || this.y.d()) break block85;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                                                }
                                                                this.l *= 0.2f;
                                                                this.x *= 0.2f;
                                                                this.v = 0;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                                            }
                                                        }
                                                        double d2 = this.y.F();
                                                        double d3 = this.y.B();
                                                        double d4 = this.y.d();
                                                        try {
                                                            this.r(d2 - d4 * 0.35, d3 + d4 * 0.35);
                                                            this.r(d2 - d4 * 0.35, d3 - d4 * 0.35);
                                                            this.r(d2 + d4 * 0.35, d3 - d4 * 0.35);
                                                            this.r(d2 + d4 * 0.35, d3 + d4 * 0.35);
                                                            if (bl9) {
                                                                this.v = 0;
                                                            }
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                                        }
                                                        try {
                                                            try {
                                                                if (!((float)this.y.K().u() > 6.0f) && !this.y.M().w()) break block86;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                                            }
                                                            bl7 = true;
                                                            break block87;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                                        }
                                                    }
                                                    bl7 = false;
                                                }
                                                bl5 = bl7;
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            if (!this.y.j() && !this.Z()) break block88;
                                                                                        }
                                                                                        catch (CustomSystemException customSystemException) {
                                                                                            throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                                                                        }
                                                                                        if (bl9) break block88;
                                                                                    }
                                                                                    catch (CustomSystemException customSystemException) {
                                                                                        throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                                                                    }
                                                                                    if (bl8) break block88;
                                                                                }
                                                                                catch (CustomSystemException customSystemException) {
                                                                                    throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                                                                }
                                                                                if (!this.E()) break block88;
                                                                            }
                                                                            catch (CustomSystemException customSystemException) {
                                                                                throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                                                            }
                                                                            if (this.y.o()) break block88;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                                                        }
                                                                        if (!bl5) break block88;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                                                    }
                                                                    if (bl6) break block88;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                                                }
                                                                if (this.y.e(ObjectPipelineManager.h)) break block88;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                                            }
                                                            if (this.v > 0) break block89;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                                        }
                                                        if (this.U) break block89;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                                    }
                                                    this.v = (int)AdvancedMethodDescriptorHandler.a("d", (int)19651, (long)(0x67A6576E5705B1D4L ^ l));
                                                    break block88;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                                }
                                            }
                                            this.y.h(true);
                                            this.G = 0;
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                block91: {
                                                                    try {
                                                                        try {
                                                                            if (this.y.o()) break block90;
                                                                            if (!this.y.F()) break block91;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                                                        }
                                                                        if (!this.Z()) break block90;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                                                    }
                                                                }
                                                                if (!this.E()) break block90;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                                            }
                                                            if (!bl5) break block90;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                                        }
                                                        if (bl6) break block90;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                                    }
                                                    if (this.y.e(ObjectPipelineManager.h)) break block90;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                                }
                                                if (!this.U) break block90;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                            }
                                            this.y.h(true);
                                            this.G = 0;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                        }
                                    }
                                    try {
                                        block93: {
                                            try {
                                                try {
                                                    if (!this.y.o()) break block92;
                                                    if (!this.S()) break block93;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                                }
                                                if (bl5) break block94;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                            }
                                        }
                                        bl4 = true;
                                        break block95;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                    }
                                }
                                bl4 = false;
                            }
                            bl = bl4;
                            try {
                                block96: {
                                    try {
                                        try {
                                            try {
                                                if (bl || this.y.P()) break block96;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                            }
                                            if (!this.y.F()) break block97;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                        }
                                        if (this.Z()) break block97;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                    }
                                }
                                bl3 = true;
                                break block98;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdvancedMethodDescriptorHandler.a(customSystemException);
                            }
                        }
                        bl3 = false;
                    }
                    bl2 = bl3;
                    try {
                        block101: {
                            try {
                                block100: {
                                    try {
                                        try {
                                            try {
                                                if (!this.y.f()) break block99;
                                                if (this.y.j()) break block100;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                            }
                                            if (this.Y) break block100;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                        }
                                        if (bl) break block101;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw AdvancedMethodDescriptorHandler.a(customSystemException);
                                    }
                                }
                                if (this.y.F()) break block92;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdvancedMethodDescriptorHandler.a(customSystemException);
                            }
                        }
                        this.y.h(false);
                        this.G = 0;
                        break block92;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdvancedMethodDescriptorHandler.a(customSystemException);
                    }
                }
                try {
                    if (bl2) {
                        this.y.h(false);
                        this.G = 0;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw AdvancedMethodDescriptorHandler.a(customSystemException);
                }
            }
            bl = false;
            try {
                try {
                    try {
                        if (!this.y.F() || !this.Y) break block102;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdvancedMethodDescriptorHandler.a(customSystemException);
                    }
                    if (this.y.M().K()) break block102;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdvancedMethodDescriptorHandler.a(customSystemException);
                }
                this.d();
            }
            catch (CustomSystemException customSystemException) {
                throw AdvancedMethodDescriptorHandler.a(customSystemException);
            }
        }
        this.E();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AdvancedMethodDescriptorHandler.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

