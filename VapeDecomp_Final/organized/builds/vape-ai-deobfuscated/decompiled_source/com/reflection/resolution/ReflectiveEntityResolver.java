/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.reflection.resolution;

import a.KB;
import a.Ne;
import a._Y;
import a.a;
import a.iL;
import a.tl;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.logging.event.LoggingEventDispatcher;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.compression.core.DataCompressionHandler;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.event.dispatch.EventDispatchCoordinator559;
import com.event.dispatch.EventDispatchRegistry2111;
import com.exception.system.CustomSystemException;
import com.financial.processing.TransactionCorrelationEngine;
import com.financial.transaction.TransactionProcessor;
import com.graph.structure.RecursiveNodeGraph;
import com.identity.resolution.PersistentIdentityResolver;
import com.math.computation.NumericComputationEngine1131;
import com.math.geometry.GeometricCoordinateCalculator;
import com.math.geometry.GeometryCalculator;
import com.network.config.ConnectionConfigurationResolver;
import com.network.configuration.NetworkConfigManager;
import com.network.connection.ConnectionNegotiationHandler;
import com.network.core.NetworkConnectionOrchestrator;
import com.network.encoding.NetworkPacketEncoder;
import com.network.protocol.NetworkProtocolHandler1842;
import com.network.protocol.NetworkProtocolNegotiator;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.security.crypto.CryptographicParameterGenerator;
import com.security.negotiation.CryptoContextNegotiator684;
import com.state.management.StateTransitionController;
import com.system.config.AdaptiveConfigurationManager;
import com.system.configuration.ConfigurationManager;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.resources.ResourceAllocationManager;
import com.temporal.metadata.TemporalMetadataResolver;
import com.text.processing.PatternMatchingOrchestrator;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

public class ReflectiveEntityResolver
extends ContextualExecutionFramework {
    private List<GeometricCoordinateCalculator> o;
    private static final String[] m;
    private static final Object[] l;
    private AuthenticationStateTracker G;
    private NetworkConfigManager d;
    private HashMap<GeometricCoordinateCalculator, iL> w;
    private static final long[] e;
    private static final Map j;
    private static final long b;
    private static final Integer[] h;
    private NetworkProtocolNegotiator R;
    int X;

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    @DataExchangeProtocol2090
    public void f(EventDispatchRegistry2111 var1_1) {
        var2_2 = ReflectiveEntityResolver.b ^ 65903343969991L;
        var4_3 = var1_1.getWorld();
        try {
            if (var4_3.Y()) {
                return;
            }
        }
        catch (Exception v0) {
            throw ReflectiveEntityResolver.a(v0);
        }
        try {
            if (!var4_3.equals(this.R)) {
                this.o.clear();
                this.w.clear();
                return;
            }
        }
        catch (Exception v1) {
            throw ReflectiveEntityResolver.a(v1);
        }
        var5_4 = var1_1.getThePlayer().F();
        var7_5 = var1_1.getThePlayer().B();
        for (Object var10_9 : this.o) {
            var11_11 = var4_3.N(var10_9.W(), var10_9.n(), var10_9.H());
            if (!PatternMatchingOrchestrator.z((TransactionCorrelationEngine)var11_11)) ** GOTO lbl28
            try {
                block38: {
                    if (!(AdaptiveComputationEngine.T(var5_4, 0.0, var7_5, var10_9.W(), 0.0, var10_9.H()) > 100.0)) continue;
                    break block38;
                    catch (Exception v2) {
                        throw ReflectiveEntityResolver.a(v2);
                    }
                }
                this.o.remove(var10_9);
                this.w.remove(var10_9);
            }
            catch (Exception v3) {
                throw ReflectiveEntityResolver.a(v3);
            }
        }
        try {
            try {
                if (this.d.m(500L)) {
                    this.d.m();
                    this.e();
                }
            }
            catch (Exception v4) {
                throw ReflectiveEntityResolver.a(v4);
            }
            for (Object var10_9 : this.w.entrySet()) {
                var11_11 = (iL)var10_9.getValue();
                for (var12_13 = 1; var12_13 < 4; ++var12_13) {
                    var13_14 = var11_11.m(var12_13);
                    var14_15 = var13_14.iterator();
                    while (var14_15.hasNext()) {
                        var15_16 = var14_15.next();
                        StateTransitionController.B(var15_16.t, var15_16.Q);
                    }
                }
            }
            NetworkPacketEncoder.z = true;
            ConfigurationManager.f = true;
            var9_7 = GL11.glGetInteger((int)ReflectiveEntityResolver.a("l", (int)5450, (long)(4857886862329505485L ^ var2_2)));
            var10_10 = GL11.glIsEnabled((int)2884);
            var11_12 = GL11.glIsEnabled((int)3042);
            var12_13 = (int)GL11.glIsEnabled((int)2896);
            try {
                var1_1.getEntityRenderer().H(1.0);
                if (var12_13 != 0) {
                    tl.P();
                }
            }
            catch (Exception v5) {
                throw ReflectiveEntityResolver.a(v5);
            }
            try {
                tl.R(false);
                tl.w();
                tl.l(770, 771, 1, 0);
                if (var10_10) {
                    tl.M();
                }
            }
            catch (Exception v6) {
                throw ReflectiveEntityResolver.a(v6);
            }
            try {
                if (!var11_12) {
                    tl.N();
                }
            }
            catch (Exception v7) {
                throw ReflectiveEntityResolver.a(v7);
            }
            ConfigurationManager.W.s();
            GraphicsBufferAllocator.V();
            for (Object var14_15 : this.w.entrySet()) {
                var15_16 = (iL)var14_15.getValue();
                this.U(var1_1, (iL)var15_16);
            }
            try {
                GraphicsBufferAllocator.E();
                ConfigurationManager.W.m();
                tl.B();
                tl.k();
                tl.R(true);
                if (var12_13 != 0) {
                    tl.T();
                }
            }
            catch (Exception v8) {
                throw ReflectiveEntityResolver.a(v8);
            }
            try {
                tl.j();
                tl.a(1.0f, 1.0f, 1.0f, 1.0f);
                var1_1.getEntityRenderer().F(1.0);
                if (!var11_12) {
                    tl.j();
                }
            }
            catch (Exception v9) {
                throw ReflectiveEntityResolver.a(v9);
            }
            try {
                if (var10_10) {
                    tl.V();
                }
            }
            catch (Exception v10) {
                throw ReflectiveEntityResolver.a(v10);
            }
            ConfigurationManager.f = false;
            NetworkPacketEncoder.z = false;
            tl.O(var9_7);
        }
        catch (Exception var9_8) {
            TemporalMetadataResolver.W(var9_8);
        }
    }

    private void m(char[] cArray, int n, int n2, int n3) {
        for (int i = 0; i < cArray.length; ++i) {
            char c = cArray[i];
            int n4 = c >> 4;
            int n5 = c & 0xF;
            try {
                if (n4 != 26) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ReflectiveEntityResolver.a(customSystemException);
            }
            int n6 = i % 16;
            int n7 = i / 256 + n2;
            int n8 = i / 16 % 16;
            int n9 = (n << 4) + n6;
            int n10 = (n3 << 4) + n8;
            TransactionCorrelationEngine transactionCorrelationEngine = ApplicationLifecycleManager.c().N(n9, n7, n10);
            GeometricCoordinateCalculator geometricCoordinateCalculator = new GeometricCoordinateCalculator(n9, n7, n10);
            EventDispatchCoordinator559 eventDispatchCoordinator559 = new EventDispatchCoordinator559(transactionCorrelationEngine);
            boolean bl = eventDispatchCoordinator559.N(ApplicationLifecycleManager.c(), n9, n7, n10);
            try {
                try {
                    if (this.o.contains(geometricCoordinateCalculator) || bl) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw ReflectiveEntityResolver.a(customSystemException);
                }
                this.o.add(geometricCoordinateCalculator);
                this.w.put(geometricCoordinateCalculator, new iL(geometricCoordinateCalculator));
                continue;
            }
            catch (CustomSystemException customSystemException) {
                throw ReflectiveEntityResolver.a(customSystemException);
            }
        }
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ReflectiveEntityResolver.a(l, l2);
            object = ReflectiveEntityResolver.l[n];
            try {
                if (!(object instanceof String)) break block2;
                ReflectiveEntityResolver.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void U(EventDispatchRegistry2111 eventDispatchRegistry2111, iL iL2) {
        Object object;
        Object object2;
        double d2;
        double d3;
        long l;
        block37: {
            float f;
            float f2;
            block38: {
                double d4;
                double d5;
                double d6;
                block34: {
                    double d7;
                    double d8;
                    double d9;
                    block36: {
                        block35: {
                            float f3;
                            float f4;
                            l = b ^ 0x19A582B619AFL;
                            SystemConfigurationOrchestrator systemConfigurationOrchestrator = eventDispatchRegistry2111.getThePlayer();
                            double d10 = NumericComputationEngine1131.b();
                            double d11 = NumericComputationEngine1131.S();
                            double d12 = NumericComputationEngine1131.n();
                            NetworkProtocolHandler1842 networkProtocolHandler1842 = ApplicationLifecycleManager.K();
                            float f5 = networkProtocolHandler1842.h();
                            d6 = (double)iL2.C().W() - d10 + 0.5;
                            d5 = (double)iL2.C().n() - d11;
                            d4 = (double)iL2.C().H() - d12 + 0.5;
                            double d13 = systemConfigurationOrchestrator.b() + (systemConfigurationOrchestrator.F() - systemConfigurationOrchestrator.b()) * (double)f5 - d10;
                            double d14 = systemConfigurationOrchestrator.q() + (systemConfigurationOrchestrator.V() - systemConfigurationOrchestrator.q()) * (double)f5 - d11;
                            double d15 = systemConfigurationOrchestrator.I() + (systemConfigurationOrchestrator.B() - systemConfigurationOrchestrator.I()) * (double)f5 - d12;
                            Color color = new Color(0, 0, 0, 170);
                            d3 = _Y.V(d6, d5, d4, d13, d14, d15);
                            double d16 = d3 / 5.0;
                            d2 = 0.01666666753590107 * (d16 * 0.3 * 3.0);
                            try {
                                CryptoContextNegotiator684.Y();
                                f4 = ResourceAllocationManager.b() ? ResourceAllocationManager.m() : eventDispatchRegistry2111.getRenderManager().k();
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ReflectiveEntityResolver.a(customSystemException);
                            }
                            f2 = f4;
                            try {
                                f3 = ResourceAllocationManager.b() ? ResourceAllocationManager.H() : eventDispatchRegistry2111.getRenderManager().r();
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ReflectiveEntityResolver.a(customSystemException);
                            }
                            f = f3;
                            try {
                                if (GeometryCalculator.C() < 35) break block34;
                                if (!ConfigurationManager.U()) break block35;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ReflectiveEntityResolver.a(customSystemException);
                            }
                            f = -f;
                            f2 = -f2;
                        }
                        try {
                            if (ApplicationLifecycleManager.N().V() != 0) break block36;
                            Ne.h.m(d6 + 0.0, d5 + 1.0, d4);
                            Ne.h.t(0.0f, 1.0f, 0.0f);
                            Ne.h.f(-f2, 0.0f, 1.0f, 0.0f);
                            Ne.h.f(-f, -1.0f, 0.0f, 0.0f);
                            break block37;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ReflectiveEntityResolver.a(customSystemException);
                        }
                    }
                    object2 = eventDispatchRegistry2111.getEntityRenderer().v();
                    try {
                        d9 = ConfigurationManager.U() ? 0.0 : NumericComputationEngine1131.b() - ((DataCompressionHandler)object2).w().X();
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ReflectiveEntityResolver.a(customSystemException);
                    }
                    double d17 = d9;
                    try {
                        d8 = ConfigurationManager.U() ? 0.0 : NumericComputationEngine1131.S() - ((DataCompressionHandler)object2).w().F();
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ReflectiveEntityResolver.a(customSystemException);
                    }
                    double d18 = d8;
                    try {
                        d7 = ConfigurationManager.U() ? 0.0 : NumericComputationEngine1131.n() - ((DataCompressionHandler)object2).w().f();
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ReflectiveEntityResolver.a(customSystemException);
                    }
                    double d19 = d7;
                    Ne.h.m(d6 + d17, d5 + d18 + 1.0, d4 + d19);
                    Ne.h.t(0.0f, 1.0f, 0.0f);
                    Ne.h.f(-f2, 0.0f, 1.0f, 0.0f);
                    Ne.h.f(f, 1.0f, 0.0f, 0.0f);
                    break block37;
                }
                try {
                    Ne.h.m(d6 + 0.0, d5 + 1.0, d4);
                    Ne.h.t(0.0f, 1.0f, 0.0f);
                    if (ApplicationLifecycleManager.N().V() != 2) break block38;
                    Ne.h.f(-f2, 0.0f, 1.0f, 0.0f);
                    Ne.h.f(f, -1.0f, 0.0f, 0.0f);
                    break block37;
                }
                catch (CustomSystemException customSystemException) {
                    throw ReflectiveEntityResolver.a(customSystemException);
                }
            }
            Ne.h.f(-f2, 0.0f, 1.0f, 0.0f);
            Ne.h.f(f, 1.0f, 0.0f, 0.0f);
        }
        Ne.h.x(-d2, -d2, d2);
        object2 = new ArrayList();
        for (int i = 1; i < 4; ++i) {
            object = iL2.m(i);
            int n = 0;
            for (int j = 0; j < object.size(); ++j) {
                PersistentIdentityResolver persistentIdentityResolver = object.get(j);
                try {
                    if (persistentIdentityResolver.T()) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ReflectiveEntityResolver.a(customSystemException);
                }
                try {
                    ++n;
                    if (object2.contains(persistentIdentityResolver)) continue;
                    object2.add(persistentIdentityResolver);
                    continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw ReflectiveEntityResolver.a(customSystemException);
                }
            }
            try {
                if (n != 0) continue;
                break;
            }
            catch (CustomSystemException customSystemException) {
                throw ReflectiveEntityResolver.a(customSystemException);
            }
        }
        String string = (int)d3 + (String)((Object)ReflectiveEntityResolver.c("\u00e1", (int)ReflectiveEntityResolver.a("l", (int)7169, (long)(0x288AAE5F4888D0ECL ^ l)), (long)-5707956287200256567L, (long)l));
        object = TemporalMetadataResolver.h.W().u(1.2, false);
        int n = Math.max(object2.size(), 1);
        float f = 22.0f;
        float f6 = n * 18 + 6;
        if (this.G.s().booleanValue()) {
            f6 = (float)Math.max(((CryptographicParameterGenerator)object).D(string) + 10.0, (double)f6);
        }
        float f7 = -f6 / 2.0f;
        float f8 = -f;
        if (this.G.s().booleanValue()) {
            f8 -= 8.0f;
            f += 8.0f;
        }
        ConfigurationManager.W.l(false);
        ConfigurationManager.W.W(object2.isEmpty(), this.G.s());
        ConfigurationManager.A(f7, f8, f6, f);
        ConfigurationManager.W.l(true);
        float f9 = f7 + 4.0f;
        float f10 = f8 + f - 20.0f;
        Iterator iterator = object2.iterator();
        while (iterator.hasNext()) {
            PersistentIdentityResolver persistentIdentityResolver = (PersistentIdentityResolver)iterator.next();
            try {
                if (persistentIdentityResolver.T()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ReflectiveEntityResolver.a(customSystemException);
            }
            StateTransitionController.I(persistentIdentityResolver.t, persistentIdentityResolver.Q, f9, f10, 16, 16);
            f9 += 18.0f;
        }
        try {
            if (this.G.s().booleanValue()) {
                ((CryptographicParameterGenerator)object).r(string, f7 + f6 / 2.0f, f8 + 2.0f, -1);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ReflectiveEntityResolver.a(customSystemException);
        }
        Ne.h.X();
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'I' || c == '\u00f4' || c == '\u00e9' || c == 'o') {
                field = ReflectiveEntityResolver.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'I' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f4' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ReflectiveEntityResolver.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e6' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ReflectiveEntityResolver.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ReflectiveEntityResolver.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private void i() {
        ConnectionConfigurationResolver connectionConfigurationResolver = ApplicationLifecycleManager.c();
        LoggingEventDispatcher loggingEventDispatcher = connectionConfigurationResolver.G();
        List<TransactionProcessor> list = loggingEventDispatcher.l();
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        double d2 = systemConfigurationOrchestrator.F();
        double d3 = systemConfigurationOrchestrator.V();
        double d4 = systemConfigurationOrchestrator.B();
        for (TransactionProcessor transactionProcessor : list) {
            List<ConnectionNegotiationHandler> list2 = transactionProcessor.O();
            for (ConnectionNegotiationHandler connectionNegotiationHandler : list2) {
                if (!connectionNegotiationHandler.r()) continue;
                char[] cArray = connectionNegotiationHandler.v();
                int n = connectionNegotiationHandler.o();
                int n2 = transactionProcessor.c();
                int n3 = transactionProcessor.Q();
                int n4 = (int)AdaptiveComputationEngine.T(d2, 0.0, d4, n2 << 4, 0.0, n3 << 4);
                try {
                    if (n4 > 100) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ReflectiveEntityResolver.a(customSystemException);
                }
                this.m(cArray, n2, n, n3);
            }
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7C24;
        if (h[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/AW", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ReflectiveEntityResolver.h[n2] = n3;
        }
        return h[n2];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AW" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ReflectiveEntityResolver.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @DataExchangeProtocol2090
    public void f(KB kB) {
        block6: {
            try {
                try {
                    try {
                        if (GeometryCalculator.C() != 15 || !ApplicationLifecycleManager.c().r()) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ReflectiveEntityResolver.a(customSystemException);
                    }
                    if (this.X++ < 20) break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw ReflectiveEntityResolver.a(customSystemException);
                }
                this.i();
                this.X = 0;
            }
            catch (CustomSystemException customSystemException) {
                throw ReflectiveEntityResolver.a(customSystemException);
            }
        }
    }

    private void e() {
        ConnectionConfigurationResolver connectionConfigurationResolver = ApplicationLifecycleManager.c();
        for (GeometricCoordinateCalculator geometricCoordinateCalculator : this.o) {
            try {
                if (!this.w.containsKey(geometricCoordinateCalculator)) {
                    this.w.put(geometricCoordinateCalculator, new iL(geometricCoordinateCalculator));
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ReflectiveEntityResolver.a(customSystemException);
            }
            iL iL2 = this.w.get(geometricCoordinateCalculator);
            iL2.o();
            TransactionCorrelationEngine transactionCorrelationEngine = connectionConfigurationResolver.N(geometricCoordinateCalculator.W(), geometricCoordinateCalculator.n(), geometricCoordinateCalculator.H());
            EventDispatchCoordinator559 eventDispatchCoordinator559 = new EventDispatchCoordinator559(transactionCorrelationEngine);
            AdaptiveConfigurationManager adaptiveConfigurationManager = eventDispatchCoordinator559.R(connectionConfigurationResolver, geometricCoordinateCalculator.W(), geometricCoordinateCalculator.n(), geometricCoordinateCalculator.H());
            int n = adaptiveConfigurationManager.p();
            int n2 = 4;
            for (int i = 1; i < n2; ++i) {
                int n3 = -i;
                int n4 = -i;
                int n5 = i;
                int n6 = i;
                int n7 = 0;
                int n8 = 0;
                try {
                    if (n == 2) {
                        ++n6;
                        ++n8;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ReflectiveEntityResolver.a(customSystemException);
                }
                try {
                    if (n == 3) {
                        --n4;
                        --n8;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ReflectiveEntityResolver.a(customSystemException);
                }
                try {
                    if (n == 4) {
                        ++n5;
                        ++n7;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ReflectiveEntityResolver.a(customSystemException);
                }
                try {
                    if (n == 5) {
                        --n3;
                        --n7;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ReflectiveEntityResolver.a(customSystemException);
                }
                for (int j = 0; j <= i; ++j) {
                    block33: for (int k = n3; k <= n5; ++k) {
                        int n9 = n4;
                        while (true) {
                            block43: {
                                int n10;
                                int n11;
                                int n12;
                                block45: {
                                    int n13;
                                    int n14;
                                    boolean bl;
                                    block44: {
                                        block42: {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (n9 > n6) continue block33;
                                                                    if (k == n3) break block42;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw ReflectiveEntityResolver.a(customSystemException);
                                                                }
                                                                if (k == n5) break block42;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw ReflectiveEntityResolver.a(customSystemException);
                                                            }
                                                            if (n9 == n4) break block42;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw ReflectiveEntityResolver.a(customSystemException);
                                                        }
                                                        if (n9 == n6) break block42;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw ReflectiveEntityResolver.a(customSystemException);
                                                    }
                                                    if (Math.abs(j) == Math.abs(i)) break block42;
                                                    break block43;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw ReflectiveEntityResolver.a(customSystemException);
                                                }
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ReflectiveEntityResolver.a(customSystemException);
                                            }
                                        }
                                        double d2 = _Y.y(geometricCoordinateCalculator.W(), geometricCoordinateCalculator.H(), geometricCoordinateCalculator.W() + k, geometricCoordinateCalculator.H() + n9) + (double)j;
                                        double d3 = _Y.y(geometricCoordinateCalculator.W() + n7, geometricCoordinateCalculator.H() + n8, geometricCoordinateCalculator.W() + k, geometricCoordinateCalculator.H() + n9) + (double)j;
                                        bl = false;
                                        try {
                                            if (!(d2 > (double)i) || !(d3 > (double)i)) break block44;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ReflectiveEntityResolver.a(customSystemException);
                                        }
                                        bl = true;
                                    }
                                    TransactionCorrelationEngine transactionCorrelationEngine2 = connectionConfigurationResolver.N(geometricCoordinateCalculator.W() + k, geometricCoordinateCalculator.n() + j, geometricCoordinateCalculator.H() + n9);
                                    if (GeometryCalculator.C() >= 35) {
                                        ReflectionUtilityBroker reflectionUtilityBroker = ReflectionUtilityBroker.t(geometricCoordinateCalculator.W() + k, geometricCoordinateCalculator.n() + j, geometricCoordinateCalculator.H() + n9);
                                        NetworkConnectionOrchestrator networkConnectionOrchestrator = new NetworkConnectionOrchestrator(TemporalMetadataResolver.h.u().da.U(connectionConfigurationResolver.M(), reflectionUtilityBroker.M()));
                                        n12 = transactionCorrelationEngine2.j(connectionConfigurationResolver, reflectionUtilityBroker, networkConnectionOrchestrator).C().O();
                                    } else {
                                        n12 = TransactionCorrelationEngine.h(transactionCorrelationEngine2);
                                    }
                                    try {
                                        n14 = GeometryCalculator.C() >= 35 ? -1 : transactionCorrelationEngine2.J(geometricCoordinateCalculator.W() + k, geometricCoordinateCalculator.n() + j, geometricCoordinateCalculator.H() + n9);
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ReflectiveEntityResolver.a(customSystemException);
                                    }
                                    n11 = n14;
                                    try {
                                        n13 = bl ? i + 1 : i;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ReflectiveEntityResolver.a(customSystemException);
                                    }
                                    n10 = n13;
                                    try {
                                        if (n10 < n2) break block45;
                                        break block43;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ReflectiveEntityResolver.a(customSystemException);
                                    }
                                }
                                iL.g(iL2, n10, n12, n11);
                            }
                            ++n9;
                        }
                    }
                }
            }
            iL2.H();
        }
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ReflectiveEntityResolver.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ReflectiveEntityResolver.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ReflectiveEntityResolver.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AW" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public ReflectiveEntityResolver() {
        long l = b ^ 0x2B583702C476L;
        super(a.cs((int)ReflectiveEntityResolver.a("l", (int)17869, (long)(0x6CEBD7DC7D3CD4F8L ^ l))), new Color(245, 0, 37).getRGB(), RecursiveNodeGraph.V, a.cs((int)ReflectiveEntityResolver.a("l", (int)20519, (long)(0x5DE5493557D64116L ^ l))));
        this.G = AuthenticationStateTracker.w(this, (String)((Object)ReflectiveEntityResolver.c("\u00e1", (int)ReflectiveEntityResolver.a("l", (int)5776, (long)(0x3AE432499DFF07A7L ^ l)), (long)7858905603271049232L, (long)l)), true);
        this.o = new CopyOnWriteArrayList<GeometricCoordinateCalculator>();
        this.w = new HashMap();
        this.d = new NetworkConfigManager();
        this.X = 0;
        this.K(10L, true);
        this.N(this.G);
    }

    @Override
    public void W() {
        int n;
        int n2;
        int n3;
        ConnectionConfigurationResolver connectionConfigurationResolver;
        SystemConfigurationOrchestrator systemConfigurationOrchestrator;
        block30: {
            systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
            try {
                if (systemConfigurationOrchestrator.Y()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ReflectiveEntityResolver.a(customSystemException);
            }
            connectionConfigurationResolver = ApplicationLifecycleManager.c();
            try {
                if (connectionConfigurationResolver.Y()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ReflectiveEntityResolver.a(customSystemException);
            }
            n3 = (int)systemConfigurationOrchestrator.F();
            n2 = (int)systemConfigurationOrchestrator.V();
            n = (int)systemConfigurationOrchestrator.B();
            try {
                try {
                    if (!connectionConfigurationResolver.Y() && connectionConfigurationResolver.equals(this.R)) break block30;
                }
                catch (CustomSystemException customSystemException) {
                    throw ReflectiveEntityResolver.a(customSystemException);
                }
                this.o.clear();
                this.w.clear();
            }
            catch (CustomSystemException customSystemException) {
                throw ReflectiveEntityResolver.a(customSystemException);
            }
        }
        this.R = connectionConfigurationResolver;
        if (GeometryCalculator.C() != 15) {
            int n4 = 100;
            for (int i = -n4; i < n4; ++i) {
                block23: for (int j = -n4; j < n4; ++j) {
                    int n5 = 0;
                    block24: while (true) {
                        int n6;
                        block32: {
                            block31: {
                                try {
                                    try {
                                        if (n5 == -1) continue block23;
                                        if (n5 != 0) break block31;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ReflectiveEntityResolver.a(customSystemException);
                                    }
                                    n6 = 1;
                                    break block32;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ReflectiveEntityResolver.a(customSystemException);
                                }
                            }
                            n6 = -1;
                        }
                        n5 = n6;
                        int n7 = 0;
                        while (true) {
                            block35: {
                                block34: {
                                    try {
                                        block33: {
                                            try {
                                                try {
                                                    if (n7 >= 20) continue block24;
                                                    if (systemConfigurationOrchestrator.Y()) break block33;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw ReflectiveEntityResolver.a(customSystemException);
                                                }
                                                if (!connectionConfigurationResolver.Y()) break block34;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ReflectiveEntityResolver.a(customSystemException);
                                            }
                                        }
                                        return;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ReflectiveEntityResolver.a(customSystemException);
                                    }
                                }
                                int n8 = n7 * n5;
                                int n9 = n3 + i;
                                int n10 = n2 + n8;
                                int n11 = n + j;
                                TransactionCorrelationEngine transactionCorrelationEngine = connectionConfigurationResolver.N(n9, n10, n11);
                                if (PatternMatchingOrchestrator.z(transactionCorrelationEngine)) {
                                    GeometricCoordinateCalculator geometricCoordinateCalculator = new GeometricCoordinateCalculator(n9, n10, n11);
                                    EventDispatchCoordinator559 eventDispatchCoordinator559 = new EventDispatchCoordinator559(transactionCorrelationEngine);
                                    boolean bl = eventDispatchCoordinator559.N(connectionConfigurationResolver, n9, n10, n11);
                                    try {
                                        try {
                                            if (this.o.contains(geometricCoordinateCalculator) || bl) break block35;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ReflectiveEntityResolver.a(customSystemException);
                                        }
                                        this.o.add(geometricCoordinateCalculator);
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ReflectiveEntityResolver.a(customSystemException);
                                    }
                                }
                            }
                            ++n7;
                        }
                        break;
                    }
                }
            }
        }
    }

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Field c(long l, long l2) {
        int n = ReflectiveEntityResolver.a(l, l2);
        Object object = ReflectiveEntityResolver.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = ReflectiveEntityResolver.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ReflectiveEntityResolver.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ReflectiveEntityResolver.a(clazz3, string2, clazz2)) != null) {
                    ReflectiveEntityResolver.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ReflectiveEntityResolver.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ReflectiveEntityResolver.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ReflectiveEntityResolver.b(254375667082167L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ReflectiveEntityResolver.b = MultiContainerRegistry.a(-1775088909835407883L, 8589748906236167422L, MethodHandles.lookup().lookupClass()).a(104153456718213L);
                ReflectiveEntityResolver.l = new Object[5];
                ReflectiveEntityResolver.m = new String[5];
                ReflectiveEntityResolver.a();
                ReflectiveEntityResolver.j = new HashMap<K, V>(13);
                var0 = ReflectiveEntityResolver.b ^ 35272425604861L;
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
                var6_5 = "\u00ea]l\u00a0\u0086\b.IB\u00e3\u00181\u0093\u00b8\u00e3\u00a0\u00a8\u00cb\u009d\b\u00f5/\u00e2\u00df";
                var7_6 = "\u00ea]l\u00a0\u0086\b.IB\u00e3\u00181\u0093\u00b8\u00e3\u00a0\u00a8\u00cb\u009d\b\u00f5/\u00e2\u00df".length();
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
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "eO\\eEyD\u00be\u00f0\u0086\u00d1\u00a0yJ\u009b-";
                    var7_6 = "eO\\eEyD\u00be\u00f0\u0086\u00d1\u00a0yJ\u009b-".length();
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
lbl42:
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
lbl55:
                // 1 sources

                ** continue;
            }
        }
        ReflectiveEntityResolver.e = var8_3;
        ReflectiveEntityResolver.h = new Integer[5];
    }

    private static Method d(long l, long l2) {
        int n = ReflectiveEntityResolver.a(l, l2);
        Object object = ReflectiveEntityResolver.l[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = m[n];
                int n3 = string2.indexOf(8);
                clazz3 = ReflectiveEntityResolver.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ReflectiveEntityResolver.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ReflectiveEntityResolver.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ReflectiveEntityResolver.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ReflectiveEntityResolver.b(254375667082167L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ReflectiveEntityResolver.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ReflectiveEntityResolver.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ReflectiveEntityResolver.b(254375667082167L, 0L);
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

    private static void a() {
        Object[] objectArray = l;
        l[0] = "W\u0012\b";
        objectArray[1] = Integer.TYPE;
        ReflectiveEntityResolver.m[1] = "java/lang/Integer";
        objectArray[2] = "DR\r,ENO]\u001cc8V\\Z\u0015*";
        objectArray[3] = "&i\r\u001a\u0006t-f\u001cUgz&m\u0018\u000f";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0001nNAf\u0000Uh^}0\thm\u001f\r K\u0014eQA\"rQ;L\u00174JVoG\f[";
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n4] != null) {
            return n4;
        }
        Object object = ReflectiveEntityResolver.l[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 39;
                break;
            }
            case 1: {
                n3 = 57;
                break;
            }
            case 2: {
                n3 = 3;
                break;
            }
            case 3: {
                n3 = 48;
                break;
            }
            case 4: {
                n3 = 45;
                break;
            }
            case 5: {
                n3 = 19;
                break;
            }
            case 6: {
                n3 = 4;
                break;
            }
            case 7: {
                n3 = 7;
                break;
            }
            case 8: {
                n3 = 6;
                break;
            }
            case 9: {
                n3 = 14;
                break;
            }
            case 10: {
                n3 = 55;
                break;
            }
            case 11: {
                n3 = 61;
                break;
            }
            case 12: {
                n3 = 54;
                break;
            }
            case 13: {
                n3 = 41;
                break;
            }
            case 14: {
                n3 = 37;
                break;
            }
            case 15: {
                n3 = 53;
                break;
            }
            case 16: {
                n3 = 20;
                break;
            }
            case 17: {
                n3 = 29;
                break;
            }
            case 18: {
                n3 = 12;
                break;
            }
            case 19: {
                n3 = 22;
                break;
            }
            case 20: {
                n3 = 28;
                break;
            }
            case 21: {
                n3 = 56;
                break;
            }
            case 22: {
                n3 = 15;
                break;
            }
            case 23: {
                n3 = 34;
                break;
            }
            case 24: {
                n3 = 24;
                break;
            }
            case 25: {
                n3 = 10;
                break;
            }
            case 26: {
                n3 = 32;
                break;
            }
            case 27: {
                n3 = 59;
                break;
            }
            case 28: {
                n3 = 46;
                break;
            }
            case 29: {
                n3 = 25;
                break;
            }
            case 30: {
                n3 = 17;
                break;
            }
            case 31: {
                n3 = 11;
                break;
            }
            case 32: {
                n3 = 23;
                break;
            }
            case 33: {
                n3 = 36;
                break;
            }
            case 34: {
                n3 = 35;
                break;
            }
            case 35: {
                n3 = 38;
                break;
            }
            case 36: {
                n3 = 26;
                break;
            }
            case 37: {
                n3 = 1;
                break;
            }
            case 38: {
                n3 = 21;
                break;
            }
            case 39: {
                n3 = 16;
                break;
            }
            case 40: {
                n3 = 62;
                break;
            }
            case 41: {
                n3 = 13;
                break;
            }
            case 42: {
                n3 = 18;
                break;
            }
            case 43: {
                n3 = 40;
                break;
            }
            case 44: {
                n3 = 49;
                break;
            }
            case 45: {
                n3 = 5;
                break;
            }
            case 46: {
                n3 = 52;
                break;
            }
            case 47: {
                n3 = 33;
                break;
            }
            case 48: {
                n3 = 43;
                break;
            }
            case 49: {
                n3 = 63;
                break;
            }
            case 50: {
                n3 = 58;
                break;
            }
            case 51: {
                n3 = 44;
                break;
            }
            case 52: {
                n3 = 8;
                break;
            }
            case 53: {
                n3 = 30;
                break;
            }
            case 54: {
                n3 = 42;
                break;
            }
            case 55: {
                n3 = 2;
                break;
            }
            case 56: {
                n3 = 27;
                break;
            }
            case 57: {
                n3 = 31;
                break;
            }
            case 58: {
                n3 = 47;
                break;
            }
            case 59: {
                n3 = 9;
                break;
            }
            case 60: {
                n3 = 60;
                break;
            }
            case 61: {
                n3 = 0;
                break;
            }
            case 62: {
                n3 = 50;
                break;
            }
            default: {
                n3 = 51;
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
        ReflectiveEntityResolver.m[n4] = new String(cArray);
        return n4;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ReflectiveEntityResolver.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ReflectiveEntityResolver.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

