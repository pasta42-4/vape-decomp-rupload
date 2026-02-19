/*
 * Decompiled with CFR 0.152.
 */
package com.security.transform;

import a.oQ;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.network.connection.ConnectionPoolManager2338;
import com.collections.management.MultiContainerRegistry;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.brokerage.ContextualDataBroker;
import com.event.management.ContextualEventDispatcher;
import com.financial.payment.PaymentProcessingFilter;
import com.financial.processing.TransactionCorrelationEngine;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.network.config.ConnectionConfigurationResolver;
import com.network.connection.NetworkConnectionInitiator;
import com.network.core.NetworkConnectionOrchestrator;
import com.network.protocol.NetworkProtocolNegotiator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.security.auth.AuthenticationServiceProvider;
import com.security.authentication.AuthenticationStateManager675;
import com.structures.tree.RecursiveNodeTree;
import com.system.config.AdaptiveConfigurationManager;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.system.monitoring.SystemHealthMonitor1733;
import com.temporal.metadata.TemporalMetadataResolver;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CryptographicTransformer
extends ObjectLifecycleTracker {
    private static final Integer[] c;
    public static CryptographicTransformer y;
    private static final long[] b;
    private static final String[] g;
    private static final Map d;
    private static final long a;
    private static final Object[] e;
    private static int k;

    public void z(float f) {
        ContextualDataBroker.E(CryptographicTransformer.U.u().ku, this.H, f);
    }

    public void E(double d2, boolean bl, TransactionCorrelationEngine transactionCorrelationEngine, ReflectionUtilityBroker reflectionUtilityBroker) {
        if (GeometryCalculator.C() >= 23) {
            ConnectionConfigurationResolver connectionConfigurationResolver = ApplicationLifecycleManager.c();
            try {
                if (connectionConfigurationResolver.Y()) {
                    return;
                }
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                throw CryptographicTransformer.a(unsupportedOperationException);
            }
            if (GeometryCalculator.C() >= 35) {
                NetworkConnectionInitiator networkConnectionInitiator = ApplicationLifecycleManager.U().v().h().M(reflectionUtilityBroker);
                ContextualDataBroker.l(CryptographicTransformer.U.u().ku, this.H, d2, bl, networkConnectionInitiator.M(), reflectionUtilityBroker.M());
            } else {
                ContextualDataBroker.R(CryptographicTransformer.U.u().ku, this.H, d2, bl, connectionConfigurationResolver.T(reflectionUtilityBroker).M(), reflectionUtilityBroker.M());
            }
        } else {
            ContextualDataBroker.G(CryptographicTransformer.U.u().ku, this.H, d2, bl, transactionCorrelationEngine.M(), reflectionUtilityBroker.M());
        }
    }

    public double r() {
        float f = ApplicationLifecycleManager.K().h();
        return this.b() + (this.F() - this.b()) * (double)f;
    }

    public void g(boolean bl) {
        ContextualDataBroker.X(CryptographicTransformer.U.u().ku, this.H, bl);
    }

    public void I(boolean bl) {
        ContextualDataBroker.y(CryptographicTransformer.U.u().ku, this.H, bl);
    }

    public float n() {
        return ContextualDataBroker.g(CryptographicTransformer.U.u().ku, this.H);
    }

    public boolean u(double d2, double d3, double d4) {
        return ContextualDataBroker.W(CryptographicTransformer.U.u().ku, this.H, d2, d3, d4);
    }

    public void x(boolean bl) {
        block3: {
            long l;
            block2: {
                l = a ^ 0xA2162F01DBDL;
                try {
                    if (!GameVersionEnumerator.MC_1_21_4.H()) break block2;
                    ContextualDataBroker.z(CryptographicTransformer.U.u().ku, this.H, bl);
                    break block3;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw CryptographicTransformer.a(unsupportedOperationException);
                }
            }
            throw new UnsupportedOperationException((String)((Object)CryptographicTransformer.b("\u00ca", (int)CryptographicTransformer.a("t", (int)3214, (long)(0x2B9E135F7A8EE703L ^ l)), (long)-1195302473452106452L, (long)l)));
        }
    }

    public int y() {
        return ContextualDataBroker.s(CryptographicTransformer.U.u().ku, this.H);
    }

    public NetworkConnectionInitiator X() {
        return new NetworkConnectionInitiator(ContextualDataBroker.p(CryptographicTransformer.U.u().ku, this.H));
    }

    public UUID q() {
        return ContextualDataBroker.H(CryptographicTransformer.U.u().ku, this.H);
    }

    public void a(float f) {
        ContextualDataBroker.u(CryptographicTransformer.U.u().ku, this.H, f);
    }

    public ContextualEventDispatcher x() {
        long l = a ^ 0x466EA568509BL;
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                return new ContextualEventDispatcher(ContextualDataBroker.O(CryptographicTransformer.U.u().ku, this.H));
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        throw new UnsupportedOperationException((String)((Object)CryptographicTransformer.b("\u00ca", (int)CryptographicTransformer.a("t", (int)1068, (long)(0xF721D4568802284L ^ l)), (long)-6751138883005218806L, (long)l)));
    }

    public long W() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return (long)this.P().F();
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        return ContextualDataBroker.Q(CryptographicTransformer.U.u().ku, this.H);
    }

    public boolean Q() {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                return ContextualDataBroker.c(CryptographicTransformer.U.u().ku, this.H);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        return false;
    }

    public float A() {
        return ContextualDataBroker.C(CryptographicTransformer.U.u().ku, this.H);
    }

    public double q() {
        return ContextualDataBroker.f(CryptographicTransformer.U.u().ku, this.H);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptographicTransformer.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public void i(int n, boolean bl) {
        ContextualDataBroker.g(CryptographicTransformer.U.u().ku, this.H, n, bl);
    }

    public void T(CryptographicTransformer cryptographicTransformer) {
        ContextualDataBroker.H(CryptographicTransformer.U.u().ku, this.H, cryptographicTransformer.M());
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public boolean P() {
        return ContextualDataBroker.u(CryptographicTransformer.U.u().ku, this.H);
    }

    public ContextualEventDispatcher g() {
        try {
            if (GameVersionEnumerator.MC_1_16_5.H()) {
                return new ContextualEventDispatcher(ContextualDataBroker.w(CryptographicTransformer.U.u().ku, this.H));
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        return ContextualEventDispatcher.N(this.F(), this.V(), this.B());
    }

    public void i(boolean bl) {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                ContextualDataBroker.d(CryptographicTransformer.U.u().ku, this.H, bl);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
    }

    public boolean u() {
        return ContextualDataBroker.S(CryptographicTransformer.U.u().ku, this.H);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptographicTransformer.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public void s(double d2) {
        try {
            if (GeometryCalculator.C() >= 35) {
                this.i().N(d2);
                return;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        ContextualDataBroker.S(CryptographicTransformer.U.u().ku, this.H, d2);
    }

    public void P() {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                ContextualDataBroker.O(CryptographicTransformer.U.u().ku, this.H);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/QF" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void X(double d2) {
        ContextualDataBroker.F(CryptographicTransformer.U.u().ku, this.H, d2);
    }

    public void G(double d2) {
        ContextualDataBroker.q(CryptographicTransformer.U.u().ku, this.H, d2);
    }

    public Random L() {
        return ContextualDataBroker.y(CryptographicTransformer.U.u().ku, this.H);
    }

    public void R(ContextualEventDispatcher contextualEventDispatcher) {
        ContextualDataBroker.K(CryptographicTransformer.U.u().ku, this.H, contextualEventDispatcher.M());
    }

    public void A(double d2) {
        try {
            if (GeometryCalculator.C() >= 35) {
                this.g().N(d2);
                return;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        ContextualDataBroker.C(CryptographicTransformer.U.u().ku, this.H, d2);
    }

    public String e() {
        if (GeometryCalculator.C() >= 35) {
            AuthenticationStateManager675 authenticationStateManager675 = new AuthenticationStateManager675(ContextualDataBroker.j(CryptographicTransformer.U.u().ku, this.H));
            return authenticationStateManager675.i();
        }
        return ContextualDataBroker.N(CryptographicTransformer.U.u().ku, this.H);
    }

    public boolean z() {
        return ContextualDataBroker.e(CryptographicTransformer.U.u().ku, this.H);
    }

    public boolean W() {
        return ContextualDataBroker.L(CryptographicTransformer.U.u().ku, this.H);
    }

    public void R(CryptographicTransformer cryptographicTransformer, boolean bl) {
        ContextualDataBroker.b(CryptographicTransformer.U.u().ku, this.H, cryptographicTransformer.M(), bl);
    }

    public boolean i() {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                return ContextualDataBroker.O(CryptographicTransformer.U.u().ku, this.H);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        return false;
    }

    public static void D(int n) {
        k = n;
    }

    public float L() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return this.n().d();
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        return ContextualDataBroker.x(CryptographicTransformer.U.u().ku, this.H);
    }

    public oQ S() {
        try {
            if (GeometryCalculator.C() == 13) {
                return this.L();
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        return new oQ(ContextualDataBroker.V(CryptographicTransformer.U.u().ku, this.H));
    }

    public void u(double d2, double d3, double d4, float f, float f2) {
        ContextualDataBroker.v(CryptographicTransformer.U.u().ku, this.H, d2, d3, d4, f, f2);
    }

    public double b() {
        return ContextualDataBroker.Y(CryptographicTransformer.U.u().ku, this.H);
    }

    public double y() {
        float f = ApplicationLifecycleManager.K().h();
        return this.q() + (this.V() - this.q()) * (double)f;
    }

    public CryptographicTransformer H() {
        return new CryptographicTransformer(ContextualDataBroker.L(CryptographicTransformer.U.u().ku, this.H));
    }

    public double n() {
        return ContextualDataBroker.P(CryptographicTransformer.U.u().ku, this.H);
    }

    public void f(int n) {
        ContextualDataBroker.a(CryptographicTransformer.U.u().ku, this.H, n);
    }

    public void H(double d2, boolean bl) {
        ContextualDataBroker.V(CryptographicTransformer.U.u().ku, this.H, d2, bl);
    }

    public void O(boolean bl) {
        ContextualDataBroker.x(CryptographicTransformer.U.u().ku, this.H, bl);
    }

    public double f() {
        return ContextualDataBroker.X(CryptographicTransformer.U.u().ku, this.H);
    }

    public boolean a() {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                return ContextualDataBroker.k(CryptographicTransformer.U.u().ku, this.H);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        return false;
    }

    public CryptographicTransformer(Object object) {
        super(object);
    }

    public int X() {
        return ContextualDataBroker.I(CryptographicTransformer.U.u().ku, this.H);
    }

    public void y(boolean bl) {
        ContextualDataBroker.v(CryptographicTransformer.U.u().ku, this.H, bl);
    }

    public void v(float f) {
        ContextualDataBroker.H(CryptographicTransformer.U.u().ku, this.H, f);
    }

    public float W() {
        return ContextualDataBroker.G(CryptographicTransformer.U.u().ku, this.H);
    }

    public void l(float f, ContextualEventDispatcher contextualEventDispatcher) {
        ContextualDataBroker.M(CryptographicTransformer.U.u().ku, this.H, f, contextualEventDispatcher.M());
    }

    public boolean V() {
        return ContextualDataBroker.i(CryptographicTransformer.U.u().ku, this.H);
    }

    public ContextualEventDispatcher q() {
        return new ContextualEventDispatcher(ContextualDataBroker.Z(CryptographicTransformer.U.u().ku, this.H));
    }

    public void s(boolean bl) {
        block3: {
            long l;
            block2: {
                l = a ^ 0x5FD453CD9842L;
                try {
                    if (!GameVersionEnumerator.MC_1_21_4.H()) break block2;
                    ContextualDataBroker.h(CryptographicTransformer.U.u().ku, this.H, bl);
                    break block3;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw CryptographicTransformer.a(unsupportedOperationException);
                }
            }
            throw new UnsupportedOperationException((String)((Object)CryptographicTransformer.b("\u00ca", (int)CryptographicTransformer.a("t", (int)16241, (long)(0x2EDC686D9D7E5106L ^ l)), (long)7680391423127996627L, (long)l)));
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4E4;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/QF", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptographicTransformer.c[n2] = n3;
        }
        return c[n2];
    }

    public void u(float f, float f2, float f3) {
        try {
            if (GeometryCalculator.C() >= 35) {
                ContextualDataBroker.M(CryptographicTransformer.U.u().ku, this.H, f3, ContextualEventDispatcher.N(f, 0.0, f2).M());
                return;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        ContextualDataBroker.G(CryptographicTransformer.U.u().ku, this.H, f, 0.0f, f2, f3);
    }

    public void m(boolean bl) {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                ContextualDataBroker.P(CryptographicTransformer.U.u().ku, this.H, bl);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
    }

    public float y(CryptographicTransformer cryptographicTransformer) {
        return ContextualDataBroker.S(CryptographicTransformer.U.u().ku, this.H, cryptographicTransformer.H);
    }

    public oQ L() {
        return new oQ(ContextualDataBroker.E(CryptographicTransformer.U.u().ku, this.H));
    }

    public void Z(float f) {
        try {
            if (GeometryCalculator.C() >= 50) {
                TemporalMetadataResolver.k();
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        ContextualDataBroker.Q(CryptographicTransformer.U.u().ku, this.H, f);
    }

    public double I() {
        return ContextualDataBroker.M(CryptographicTransformer.U.u().ku, this.H);
    }

    public AuthenticationServiceProvider i() {
        return new AuthenticationServiceProvider(ContextualDataBroker.b(CryptographicTransformer.U.u().ku, this.H));
    }

    public boolean c() {
        return ContextualDataBroker.V(CryptographicTransformer.U.u().ku, this.H);
    }

    public double F() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return this.g().X();
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        return ContextualDataBroker.A(CryptographicTransformer.U.u().ku, this.H);
    }

    public double h(Object object) {
        return ContextualDataBroker.B(CryptographicTransformer.U.u().ku, this.H, object);
    }

    public double t() {
        double d2;
        block2: {
            d2 = this.L().c() + (double)this.E();
            try {
                if (GeometryCalculator.C() != 13 || !this.B(ReflectionMetadataResolver.rl)) break block2;
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                throw CryptographicTransformer.a(unsupportedOperationException);
            }
            d2 = this.V();
        }
        return d2;
    }

    public double a() {
        float f = ApplicationLifecycleManager.K().h();
        return this.q() + (((oQ)ApplicationLifecycleManager.U().L()).c() - this.q()) * (double)f;
    }

    public void W(double d2) {
        ContextualDataBroker.K(CryptographicTransformer.U.u().ku, this.H, d2);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = CryptographicTransformer.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptographicTransformer.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public void V(float f) {
        ContextualDataBroker.O(CryptographicTransformer.U.u().ku, this.H, f);
    }

    public double l() {
        return ContextualDataBroker.c(CryptographicTransformer.U.u().ku, this.H);
    }

    public float X() {
        return ContextualDataBroker.V(CryptographicTransformer.U.u().ku, this.H);
    }

    public void H(NetworkConnectionInitiator networkConnectionInitiator) {
        Object object;
        try {
            object = networkConnectionInitiator == null ? null : networkConnectionInitiator.M();
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        Object object2 = object;
        ContextualDataBroker.w(CryptographicTransformer.U.u().ku, this.H, object2);
    }

    public void Z(ContextualEventDispatcher contextualEventDispatcher) {
        block3: {
            long l;
            block2: {
                l = a ^ 0x1B9EB094481EL;
                try {
                    if (!GameVersionEnumerator.MC_1_21_4.H()) break block2;
                    ContextualDataBroker.N(CryptographicTransformer.U.u().ku, this.H, contextualEventDispatcher.M());
                    break block3;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw CryptographicTransformer.a(unsupportedOperationException);
                }
            }
            throw new UnsupportedOperationException((String)((Object)CryptographicTransformer.b("\u00ca", (int)CryptographicTransformer.a("t", (int)6788, (long)(0x555730C6572C24ABL ^ l)), (long)-4987033980376606577L, (long)l)));
        }
    }

    public boolean F() {
        return ContextualDataBroker.j(CryptographicTransformer.U.u().ku, this.H);
    }

    public ContextualEventDispatcher I(ContextualEventDispatcher contextualEventDispatcher) {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                return new ContextualEventDispatcher(ContextualDataBroker.f(CryptographicTransformer.U.u().ku, this.H, contextualEventDispatcher.M()));
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        return contextualEventDispatcher;
    }

    public void d() {
        ContextualDataBroker.a(CryptographicTransformer.U.u().ku, this.H);
    }

    public ContextualEventDispatcher Y(float f) {
        return new ContextualEventDispatcher(ContextualDataBroker.J(CryptographicTransformer.U.u().ku, this.H, f));
    }

    public boolean o() {
        return ContextualDataBroker.o(CryptographicTransformer.U.u().ku, this.H);
    }

    public double G() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return this.i().X();
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        return ContextualDataBroker.i(CryptographicTransformer.U.u().ku, this.H);
    }

    public void M(double d2) {
        ContextualDataBroker.D(CryptographicTransformer.U.u().ku, this.H, d2);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptographicTransformer.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptographicTransformer.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public ReflectionUtilityBroker C() {
        try {
            if (GameVersionEnumerator.MC_1_16_5.H()) {
                return new ReflectionUtilityBroker(ContextualDataBroker.a(CryptographicTransformer.U.u().ku, this.H));
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        return ReflectionUtilityBroker.L(this.F(), this.V(), this.B());
    }

    public CryptographicTransformer o() {
        return new CryptographicTransformer(ContextualDataBroker.e(CryptographicTransformer.U.u().ku, this.H));
    }

    public void R(double d2, double d3, double d4) {
        ContextualDataBroker.P(CryptographicTransformer.U.u().ku, this.H, d2, d3, d4);
    }

    private static Method h(long l, long l2) {
        int n = CryptographicTransformer.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = g[n];
                int n3 = string2.indexOf(8);
                clazz3 = CryptographicTransformer.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
                int n4 = string2.indexOf(8, ++n3);
                string = string2.substring(n3, n4);
                int n5 = -1;
                int n6 = n4;
                do {
                    ++n5;
                    ++n6;
                } while ((n6 = string2.indexOf(8, n6)) > -1);
                n2 = n5 - 1;
                classArray2 = new Class[n2];
                clazz2 = null;
                n6 = n4 + 1;
                for (int i = 0; i < n5; ++i) {
                    int n7 = string2.indexOf(8, n6);
                    clazz2 = CryptographicTransformer.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptographicTransformer.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptographicTransformer.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptographicTransformer.f(250596201050568L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptographicTransformer.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptographicTransformer.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptographicTransformer.f(250596201050568L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n8 = 0;
            while (n8 < n2) {
                stringBuffer.append(classArray2[n8].getName());
                if (++n8 >= n2) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    public void W(float f) {
        CryptographicTransformer.U.u().ku.j(this.H, f);
    }

    public boolean J() {
        return ContextualDataBroker.Q(CryptographicTransformer.U.u().ku, this.H);
    }

    public boolean d() {
        block4: {
            boolean bl;
            block6: {
                block5: {
                    try {
                        try {
                            if (GeometryCalculator.C() < 35) break block4;
                            if (ContextualDataBroker.e(CryptographicTransformer.U.u().ku, this.H) == null) break block5;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw CryptographicTransformer.a(unsupportedOperationException);
                        }
                        bl = true;
                        break block6;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw CryptographicTransformer.a(unsupportedOperationException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return ContextualDataBroker.z(CryptographicTransformer.U.u().ku, this.H);
    }

    public void c(float f, float f2, float f3, float f4) {
        try {
            if (GeometryCalculator.C() >= 35) {
                ContextualDataBroker.M(CryptographicTransformer.U.u().ku, this.H, f4, ContextualEventDispatcher.N(f, f2, f3).M());
                return;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        ContextualDataBroker.G(CryptographicTransformer.U.u().ku, this.H, f, f2, f3, f4);
    }

    public void G(float f) {
        ContextualDataBroker.i(CryptographicTransformer.U.u().ku, this.H, f);
    }

    private PaymentProcessingFilter n() {
        return new PaymentProcessingFilter(ContextualDataBroker.d(CryptographicTransformer.U.u().ku, this.H));
    }

    public AdaptiveConfigurationManager d() {
        return AdaptiveConfigurationManager.C(AdaptiveComputationEngine.Q((double)(this.q() * 4.0f / 360.0f) + 0.5) & 3);
    }

    public void m() {
        ContextualDataBroker.e(CryptographicTransformer.U.u().ku, this.H);
    }

    public ReflectionUtilityBroker e() {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                return new ReflectionUtilityBroker(ContextualDataBroker.M(CryptographicTransformer.U.u().ku, this.H));
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        return ReflectionUtilityBroker.L(this.F(), this.V() - (double)0.2f, this.B());
    }

    public double x() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return this.i().F();
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        return ContextualDataBroker.d(CryptographicTransformer.U.u().ku, this.H);
    }

    public void A(UUID uUID) {
        ContextualDataBroker.B(CryptographicTransformer.U.u().ku, this.H, uUID);
    }

    public void Q(double d2) {
        try {
            if (GeometryCalculator.C() >= 35) {
                this.g().Q(d2);
                return;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        ContextualDataBroker.E(CryptographicTransformer.U.u().ku, this.H, d2);
    }

    public void R(boolean bl, boolean bl2, ContextualEventDispatcher contextualEventDispatcher) {
        block3: {
            long l;
            block2: {
                l = a ^ 0x481CDBEBB9C0L;
                try {
                    if (!GameVersionEnumerator.MC_1_21_4.H()) break block2;
                    ContextualDataBroker.K(CryptographicTransformer.U.u().ku, this.H, bl, bl2, contextualEventDispatcher.M());
                    break block3;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw CryptographicTransformer.a(unsupportedOperationException);
                }
            }
            throw new UnsupportedOperationException((String)((Object)CryptographicTransformer.b("\u00ca", (int)CryptographicTransformer.a("t", (int)23101, (long)(0x983E623055395CFL ^ l)), (long)5409998006544394577L, (long)l)));
        }
    }

    public boolean x() {
        return ContextualDataBroker.B(CryptographicTransformer.U.u().ku, this.H);
    }

    public float m() {
        return ContextualDataBroker.A(CryptographicTransformer.U.u().ku, this.H);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (g[n4] != null) {
            return n4;
        }
        Object object = e[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 38;
                break;
            }
            case 1: {
                n3 = 45;
                break;
            }
            case 2: {
                n3 = 2;
                break;
            }
            case 3: {
                n3 = 54;
                break;
            }
            case 4: {
                n3 = 46;
                break;
            }
            case 5: {
                n3 = 48;
                break;
            }
            case 6: {
                n3 = 29;
                break;
            }
            case 7: {
                n3 = 59;
                break;
            }
            case 8: {
                n3 = 16;
                break;
            }
            case 9: {
                n3 = 32;
                break;
            }
            case 10: {
                n3 = 6;
                break;
            }
            case 11: {
                n3 = 21;
                break;
            }
            case 12: {
                n3 = 39;
                break;
            }
            case 13: {
                n3 = 52;
                break;
            }
            case 14: {
                n3 = 23;
                break;
            }
            case 15: {
                n3 = 55;
                break;
            }
            case 16: {
                n3 = 27;
                break;
            }
            case 17: {
                n3 = 7;
                break;
            }
            case 18: {
                n3 = 26;
                break;
            }
            case 19: {
                n3 = 4;
                break;
            }
            case 20: {
                n3 = 63;
                break;
            }
            case 21: {
                n3 = 10;
                break;
            }
            case 22: {
                n3 = 35;
                break;
            }
            case 23: {
                n3 = 61;
                break;
            }
            case 24: {
                n3 = 13;
                break;
            }
            case 25: {
                n3 = 8;
                break;
            }
            case 26: {
                n3 = 12;
                break;
            }
            case 27: {
                n3 = 51;
                break;
            }
            case 28: {
                n3 = 25;
                break;
            }
            case 29: {
                n3 = 3;
                break;
            }
            case 30: {
                n3 = 15;
                break;
            }
            case 31: {
                n3 = 18;
                break;
            }
            case 32: {
                n3 = 60;
                break;
            }
            case 33: {
                n3 = 34;
                break;
            }
            case 34: {
                n3 = 43;
                break;
            }
            case 35: {
                n3 = 19;
                break;
            }
            case 36: {
                n3 = 1;
                break;
            }
            case 37: {
                n3 = 20;
                break;
            }
            case 38: {
                n3 = 5;
                break;
            }
            case 39: {
                n3 = 47;
                break;
            }
            case 40: {
                n3 = 56;
                break;
            }
            case 41: {
                n3 = 40;
                break;
            }
            case 42: {
                n3 = 11;
                break;
            }
            case 43: {
                n3 = 31;
                break;
            }
            case 44: {
                n3 = 17;
                break;
            }
            case 45: {
                n3 = 50;
                break;
            }
            case 46: {
                n3 = 62;
                break;
            }
            case 47: {
                n3 = 37;
                break;
            }
            case 48: {
                n3 = 9;
                break;
            }
            case 49: {
                n3 = 44;
                break;
            }
            case 50: {
                n3 = 58;
                break;
            }
            case 51: {
                n3 = 41;
                break;
            }
            case 52: {
                n3 = 49;
                break;
            }
            case 53: {
                n3 = 36;
                break;
            }
            case 54: {
                n3 = 33;
                break;
            }
            case 55: {
                n3 = 30;
                break;
            }
            case 56: {
                n3 = 28;
                break;
            }
            case 57: {
                n3 = 53;
                break;
            }
            case 58: {
                n3 = 22;
                break;
            }
            case 59: {
                n3 = 42;
                break;
            }
            case 60: {
                n3 = 0;
                break;
            }
            case 61: {
                n3 = 57;
                break;
            }
            case 62: {
                n3 = 14;
                break;
            }
            default: {
                n3 = 24;
            }
        }
        n5 = n3;
        int[] nArray = new int[6];
        int n6 = 0;
        while (n6 < 6) {
            n2 = 7 * (5 - n6);
            n = (int)(l >>> n2 & 0x7FL);
            if ((n -= n5) < 0) {
                n += 128;
            }
            nArray[n6] = n;
            ++n6;
        }
        char[] cArray = ((String)object).toCharArray();
        n2 = 0;
        while (n2 < cArray.length) {
            n = nArray[n2 % nArray.length];
            if (n == 0) break;
            cArray[n2] = (char)(cArray[n2] ^ n);
            ++n2;
        }
        CryptographicTransformer.g[n4] = new String(cArray);
        return n4;
    }

    public boolean m() {
        return ContextualDataBroker.y(CryptographicTransformer.U.u().ku, this.H);
    }

    public double B() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return this.g().f();
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        return ContextualDataBroker.Z(CryptographicTransformer.U.u().ku, this.H);
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }

    public boolean L() {
        return ContextualDataBroker.b(CryptographicTransformer.U.u().ku, this.H);
    }

    public float Q() {
        return ContextualDataBroker.d(CryptographicTransformer.U.u().ku, this.H);
    }

    public int r() {
        return ContextualDataBroker.y(CryptographicTransformer.U.u().ku, this.H);
    }

    private static void k() {
        Object[] objectArray = e;
        e[0] = ";w\f";
        objectArray[1] = Integer.TYPE;
        CryptographicTransformer.g[1] = "java/lang/Integer";
        objectArray[2] = "1R\u001e;V5:]\u000ft+-)Z\u0006=";
        objectArray[3] = "\u000bjFsi@\u0000eW<\bN\u000bnSf";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u000b\u0012GM]UT\u0014\u0017#DTjJ\u0014@UFZOL\u0012W/S\u0015\u0013C\u0016^\u000f\nLC/";
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/QF" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void D(double d2, double d3, double d4) {
        try {
            if (GeometryCalculator.C() >= 23) {
                this.j(SystemHealthMonitor1733.s(), d2, d3, d4);
                return;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        ContextualDataBroker.z(CryptographicTransformer.U.u().ku, this.H, d2, d3, d4);
    }

    public boolean j() {
        return ContextualDataBroker.n(CryptographicTransformer.U.u().ku, this.H);
    }

    public void G(boolean bl) {
        ContextualDataBroker.Q(CryptographicTransformer.U.u().ku, this.H, bl);
    }

    public AuthenticationStateManager675 G() {
        return new AuthenticationStateManager675(ContextualDataBroker.G(CryptographicTransformer.U.u().ku, this.H));
    }

    public boolean t() {
        return ContextualDataBroker.X(CryptographicTransformer.U.u().ku, this.H);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'm' || c == '\u00fd' || c == '\u00f2' || c == 'M') {
                field = CryptographicTransformer.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'm' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fd' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptographicTransformer.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'Q' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ca' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public void A(float f, float f2) {
        ContextualDataBroker.w(CryptographicTransformer.U.u().ku, this.H, f, f2);
    }

    public boolean H() {
        return ContextualDataBroker.H(CryptographicTransformer.U.u().ku, this.H);
    }

    public float S() {
        return ContextualDataBroker.O(CryptographicTransformer.U.u().ku, this.H);
    }

    public void t(double d2) {
        try {
            if (GeometryCalculator.C() >= 35) {
                this.i().F(d2);
                return;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        ContextualDataBroker.l(CryptographicTransformer.U.u().ku, this.H, d2);
    }

    public float d() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return this.n().H();
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        return ContextualDataBroker.X(CryptographicTransformer.U.u().ku, this.H);
    }

    private static Field g(long l, long l2) {
        int n = CryptographicTransformer.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptographicTransformer.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptographicTransformer.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptographicTransformer.c(clazz3, string2, clazz2)) != null) {
                    CryptographicTransformer.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptographicTransformer.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptographicTransformer.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptographicTransformer.f(250596201050568L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public boolean y() {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                return ContextualDataBroker.s(CryptographicTransformer.U.u().ku, this.H);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        return false;
    }

    public void L(double d2, double d3, double d4) {
        this.R(ContextualEventDispatcher.N(d2, d3, d4));
    }

    public float q() {
        return ContextualDataBroker.E(CryptographicTransformer.U.u().ku, this.H);
    }

    public boolean R() {
        return ContextualDataBroker.v(CryptographicTransformer.U.u().ku, this.H);
    }

    public void o(SystemHealthMonitor1733 systemHealthMonitor1733, ContextualEventDispatcher contextualEventDispatcher) {
        ContextualDataBroker.K(CryptographicTransformer.U.u().ku, this.H, systemHealthMonitor1733.M(), contextualEventDispatcher.M());
    }

    public static int C() {
        int n = CryptographicTransformer.l();
        try {
            if (n == 0) {
                return 95;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        return 0;
    }

    public void h(boolean bl) {
        ContextualDataBroker.Z(CryptographicTransformer.U.u().ku, this.H, bl);
    }

    public void Z(double d2) {
        ContextualDataBroker.y(CryptographicTransformer.U.u().ku, this.H, d2);
    }

    public boolean S() {
        return ContextualDataBroker.q(CryptographicTransformer.U.u().ku, this.H);
    }

    public double V() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return this.g().F();
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        return ContextualDataBroker.C(CryptographicTransformer.U.u().ku, this.H);
    }

    public NetworkProtocolNegotiator N() {
        return new NetworkProtocolNegotiator(ContextualDataBroker.l(CryptographicTransformer.U.u().ku, this.H));
    }

    public boolean p() {
        try {
            if (TemporalMetadataResolver.h.r()) {
                return false;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        return ContextualDataBroker.D(CryptographicTransformer.U.u().ku, this.H);
    }

    public void W(boolean bl) {
        ContextualDataBroker.w(CryptographicTransformer.U.u().ku, this.H, bl);
    }

    public void f(float f) {
        ContextualDataBroker.t(CryptographicTransformer.U.u().ku, this.H, f);
    }

    public void p() {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                ContextualDataBroker.J(CryptographicTransformer.U.u().ku, this.H);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
    }

    public void r(boolean bl) {
        ContextualDataBroker.a(CryptographicTransformer.U.u().ku, this.H, bl);
    }

    public boolean O() {
        return ContextualDataBroker.G(CryptographicTransformer.U.u().ku, this.H);
    }

    public double w(double d2, double d3, double d4) {
        double d5 = this.F() - d2;
        double d6 = this.V() - d3;
        double d7 = this.B() - d4;
        return AdaptiveComputationEngine.C(d5 * d5 + d6 * d6 + d7 * d7);
    }

    public boolean A(RecursiveNodeTree recursiveNodeTree) {
        block9: {
            boolean bl;
            block10: {
                try {
                    if (GeometryCalculator.C() >= GeometryCalculator.x) {
                        return false;
                    }
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw CryptographicTransformer.a(unsupportedOperationException);
                }
                try {
                    try {
                        if (GeometryCalculator.C() < 35) break block9;
                        if (!this.o().B(ReflectionMetadataResolver.X)) break block10;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw CryptographicTransformer.a(unsupportedOperationException);
                    }
                    return false;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw CryptographicTransformer.a(unsupportedOperationException);
                }
            }
            double d2 = this.V() + (double)this.E();
            ReflectionUtilityBroker reflectionUtilityBroker = ReflectionUtilityBroker.t((int)this.F(), (int)d2, (int)this.B());
            NetworkConnectionOrchestrator networkConnectionOrchestrator = ApplicationLifecycleManager.c().T(reflectionUtilityBroker);
            try {
                bl = networkConnectionOrchestrator.I().u() == recursiveNodeTree;
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                throw CryptographicTransformer.a(unsupportedOperationException);
            }
            return bl;
        }
        return ContextualDataBroker.J(CryptographicTransformer.U.u().ku, this.H, recursiveNodeTree.M());
    }

    public void z(double d2) {
        try {
            if (GeometryCalculator.C() >= 35) {
                this.i().Q(d2);
                return;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        ContextualDataBroker.o(CryptographicTransformer.U.u().ku, this.H, d2);
    }

    public boolean D() {
        return ContextualDataBroker.A(CryptographicTransformer.U.u().ku, this.H);
    }

    public void s(oQ oQ2) {
        ContextualDataBroker.h(CryptographicTransformer.U.u().ku, this.H, oQ2.M());
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptographicTransformer.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptographicTransformer.e[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private ContextualEventDispatcher P() {
        try {
            if (GeometryCalculator.C() >= 50) {
                return new ConnectionPoolManager2338(ContextualDataBroker.D(CryptographicTransformer.U.u().ku, this.H)).G();
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        return new ContextualEventDispatcher(ContextualDataBroker.D(CryptographicTransformer.U.u().ku, this.H));
    }

    public boolean I() {
        return ContextualDataBroker.g(CryptographicTransformer.U.u().ku, this.H);
    }

    public void b(double d2, double d3, double d4) {
        ContextualDataBroker.E(CryptographicTransformer.U.u().ku, this.H, d2, d3, d4);
    }

    public void u() {
        ContextualDataBroker.d(CryptographicTransformer.U.u().ku, this.H);
    }

    public float g() {
        return ContextualDataBroker.N(CryptographicTransformer.U.u().ku, this.H);
    }

    public void B(double d2) {
        try {
            if (GeometryCalculator.C() >= 35) {
                this.g().F(d2);
                return;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        ContextualDataBroker.t(CryptographicTransformer.U.u().ku, this.H, d2);
    }

    public ContextualEventDispatcher i() {
        return new ContextualEventDispatcher(ContextualDataBroker.H(CryptographicTransformer.U.u().ku, this.H));
    }

    public void p(double d2) {
        ContextualDataBroker.Q(CryptographicTransformer.U.u().ku, this.H, d2);
    }

    public float E() {
        return ContextualDataBroker.n(CryptographicTransformer.U.u().ku, this.H);
    }

    public double D() {
        float f = ApplicationLifecycleManager.K().h();
        return this.I() + (this.B() - this.I()) * (double)f;
    }

    public ReflectionUtilityBroker o() {
        return new ReflectionUtilityBroker(ContextualDataBroker.U(CryptographicTransformer.U.u().ku, this.H));
    }

    public ContextualEventDispatcher W(ContextualEventDispatcher contextualEventDispatcher) {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                return new ContextualEventDispatcher(ContextualDataBroker.G(CryptographicTransformer.U.u().ku, this.H, contextualEventDispatcher.M()));
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        return contextualEventDispatcher;
    }

    public double o() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return this.i().f();
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        return ContextualDataBroker.n(CryptographicTransformer.U.u().ku, this.H);
    }

    public static int l() {
        return k;
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n) continue;
            for (int i = 0; i < n; ++i) {
                if (classArray2[i] != classArray[i]) continue block0;
            }
            return method;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptographicTransformer.a = MultiContainerRegistry.a(2170530296051406250L, 8224350329755405143L, MethodHandles.lookup().lookupClass()).a(91847646991169L);
                CryptographicTransformer.e = new Object[5];
                CryptographicTransformer.g = new String[5];
                CryptographicTransformer.k();
                CryptographicTransformer.d = new HashMap<K, V>(13);
                CryptographicTransformer.D(114);
                var0 = CryptographicTransformer.a ^ 2203223103604L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "'r\u000f\u00b6R%\u00d5a\u00bb7\u0083[\u00bc\u00db`&\u00bf}\u0093\u00dbb\u00a4\u00e8\u00d5";
                var7_6 = "'r\u000f\u00b6R%\u00d5a\u00bb7\u0083[\u00bc\u00db`&\u00bf}\u0093\u00dbb\u00a4\u00e8\u00d5".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl30:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = ")\u00c3\u00e5\u00ac\u0000/jo)G\u001a\u00c8zT>\u00ab";
                    var7_6 = ")\u00c3\u00e5\u00ac\u0000/jo)G\u001a\u00c8zT>\u00ab".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl43:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl56:
                // 1 sources

                ** continue;
            }
        }
        CryptographicTransformer.b = var8_3;
        CryptographicTransformer.c = new Integer[5];
        CryptographicTransformer.y = new CryptographicTransformer(null);
    }

    public void j(SystemHealthMonitor1733 systemHealthMonitor1733, double d2, double d3, double d4) {
        try {
            if (GeometryCalculator.C() >= 35) {
                this.o(systemHealthMonitor1733, ContextualEventDispatcher.N(d2, d3, d4));
                return;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicTransformer.a(unsupportedOperationException);
        }
        ContextualDataBroker.R(CryptographicTransformer.U.u().ku, this.H, systemHealthMonitor1733.M(), d2, d3, d4);
    }

    public boolean s() {
        return ContextualDataBroker.p(CryptographicTransformer.U.u().ku, this.H);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptographicTransformer.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(CryptographicTransformer.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

