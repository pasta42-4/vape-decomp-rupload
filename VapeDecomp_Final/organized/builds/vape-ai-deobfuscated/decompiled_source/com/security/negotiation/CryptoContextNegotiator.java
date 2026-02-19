/*
 * Decompiled with CFR 0.152.
 */
package com.security.negotiation;

import a.E8;
import a.Ne;
import a.a;
import a.oQ;
import a.tl;
import a.z6;
import com.adapter.management.GenericAdapterManager;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.analytics.computation.NumericComputationEngine1000;
import com.app.concurrency.ThreadPoolConfigManager;
import com.app.ui.theming.StylesheetThemeManager;
import com.app.workflow.StateTrackingCoordinator;
import com.asset.management.AssetLifecycleManager;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.transformation.DataTransformationEngine1209;
import com.deobfuscation.strategy.ExecutionStrategy;
import com.event.core.EventDispatchCoordinator1159;
import com.event.dispatch.EventDispatchRegistry2111;
import com.event.management.ContextualEventDispatcher;
import com.exception.system.CustomSystemException;
import com.financial.analysis.TransactionAnalyzer;
import com.graph.structure.RecursiveNodeGraph;
import com.math.computation.NumericComputationEngine1131;
import com.math.geometry.GeometryCalculator;
import com.network.config.ConnectionConfigurationResolver;
import com.network.core.NetworkConnectionManager2538;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.network.protocol.ProtocolInteractionController;
import com.network.transmission.DataTransmissionManager2384;
import com.numeric.precision.NumericPrecisionTransformer;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.rendering.adaptive.AdaptiveRenderingEngine;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.LightweightExecutionContext;
import com.security.authentication.AuthenticationGateway1860;
import com.security.authentication.CryptographicTokenGenerator1926;
import com.security.negotiation.CryptoContextNegotiator684;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.ConfigurationManager;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.transaction.core.BaseTransactionProcessor;
import com.ui.configuration.DisplayConfigurationManager;
import com.validation.core.ObjectValidator;
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
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class CryptoContextNegotiator
extends ContextualExecutionFramework {
    private final AuthenticationStateTracker x;
    private static final long r;
    private final AssetLifecycleManager o;
    private LightweightExecutionContext A;
    private final AuthenticationStateTracker e;
    private final AuthenticationGateway1860 O;
    private final AuthenticationStateTracker K;
    private final StylesheetThemeManager G;
    private LightweightExecutionContext j;
    private final BaseTransactionProcessor X;
    private final AuthenticationGateway1860 v;
    private final AuthenticationGateway1860 V;
    private final AuthenticationStateTracker d;
    private static final long[] T;
    private static final Map bb;
    private final StylesheetThemeManager Z;
    private final GenericAdapterManager t;
    private static final String[] gb;
    private final AdaptiveRenderingEngine L;
    private LightweightExecutionContext z;
    private final StylesheetThemeManager F;
    private final StylesheetThemeManager w;
    private DataTransmissionManager2384 n;
    private final AuthenticationStateTracker N;
    private LightweightExecutionContext h;
    private LightweightExecutionContext B;
    private static final Integer[] Y;
    private static final Object[] fb;
    private final AuthenticationStateTracker b;
    private final AuthenticationStateTracker P;
    private LightweightExecutionContext m;
    private final NumericPrecisionTransformer l;
    private final Map<CryptographicTransformer, double[]> R;

    private float k(double d2, double d3, double d4, double d5) {
        return (float)Math.toDegrees(Math.atan2(d5 - d4, d3 - d2));
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (gb[n4] != null) {
            return n4;
        }
        Object object = fb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 49;
                break;
            }
            case 1: {
                n3 = 63;
                break;
            }
            case 2: {
                n3 = 29;
                break;
            }
            case 3: {
                n3 = 35;
                break;
            }
            case 4: {
                n3 = 0;
                break;
            }
            case 5: {
                n3 = 51;
                break;
            }
            case 6: {
                n3 = 34;
                break;
            }
            case 7: {
                n3 = 32;
                break;
            }
            case 8: {
                n3 = 2;
                break;
            }
            case 9: {
                n3 = 48;
                break;
            }
            case 10: {
                n3 = 24;
                break;
            }
            case 11: {
                n3 = 14;
                break;
            }
            case 12: {
                n3 = 59;
                break;
            }
            case 13: {
                n3 = 46;
                break;
            }
            case 14: {
                n3 = 10;
                break;
            }
            case 15: {
                n3 = 11;
                break;
            }
            case 16: {
                n3 = 40;
                break;
            }
            case 17: {
                n3 = 61;
                break;
            }
            case 18: {
                n3 = 44;
                break;
            }
            case 19: {
                n3 = 39;
                break;
            }
            case 20: {
                n3 = 57;
                break;
            }
            case 21: {
                n3 = 12;
                break;
            }
            case 22: {
                n3 = 25;
                break;
            }
            case 23: {
                n3 = 54;
                break;
            }
            case 24: {
                n3 = 50;
                break;
            }
            case 25: {
                n3 = 31;
                break;
            }
            case 26: {
                n3 = 36;
                break;
            }
            case 27: {
                n3 = 26;
                break;
            }
            case 28: {
                n3 = 20;
                break;
            }
            case 29: {
                n3 = 53;
                break;
            }
            case 30: {
                n3 = 17;
                break;
            }
            case 31: {
                n3 = 41;
                break;
            }
            case 32: {
                n3 = 55;
                break;
            }
            case 33: {
                n3 = 56;
                break;
            }
            case 34: {
                n3 = 30;
                break;
            }
            case 35: {
                n3 = 4;
                break;
            }
            case 36: {
                n3 = 23;
                break;
            }
            case 37: {
                n3 = 21;
                break;
            }
            case 38: {
                n3 = 37;
                break;
            }
            case 39: {
                n3 = 58;
                break;
            }
            case 40: {
                n3 = 5;
                break;
            }
            case 41: {
                n3 = 3;
                break;
            }
            case 42: {
                n3 = 6;
                break;
            }
            case 43: {
                n3 = 7;
                break;
            }
            case 44: {
                n3 = 60;
                break;
            }
            case 45: {
                n3 = 33;
                break;
            }
            case 46: {
                n3 = 9;
                break;
            }
            case 47: {
                n3 = 15;
                break;
            }
            case 48: {
                n3 = 43;
                break;
            }
            case 49: {
                n3 = 42;
                break;
            }
            case 50: {
                n3 = 22;
                break;
            }
            case 51: {
                n3 = 28;
                break;
            }
            case 52: {
                n3 = 47;
                break;
            }
            case 53: {
                n3 = 52;
                break;
            }
            case 54: {
                n3 = 18;
                break;
            }
            case 55: {
                n3 = 16;
                break;
            }
            case 56: {
                n3 = 45;
                break;
            }
            case 57: {
                n3 = 27;
                break;
            }
            case 58: {
                n3 = 62;
                break;
            }
            case 59: {
                n3 = 13;
                break;
            }
            case 60: {
                n3 = 8;
                break;
            }
            case 61: {
                n3 = 1;
                break;
            }
            case 62: {
                n3 = 38;
                break;
            }
            default: {
                n3 = 19;
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
        CryptoContextNegotiator.gb[n4] = new String(cArray);
        return n4;
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

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x608D;
        if (Y[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = T[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])bb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    bb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Ar", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptoContextNegotiator.Y[n2] = n3;
        }
        return Y[n2];
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = CryptoContextNegotiator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptoContextNegotiator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ar" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private Color D(CryptographicTransformer cryptographicTransformer) {
        if (cryptographicTransformer.B(ReflectionMetadataResolver.a)) {
            ThreadPoolConfigManager threadPoolConfigManager = new ThreadPoolConfigManager(cryptographicTransformer.M());
            Color color = this.d(threadPoolConfigManager).E(threadPoolConfigManager.M());
            if (color == null) {
                color = new Color(255, 255, 255);
            }
            return color;
        }
        try {
            if (cryptographicTransformer.B(ReflectionMetadataResolver.Ue)) {
                return new Color(255, 109, 0);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextNegotiator.a(customSystemException);
        }
        return this.L.L();
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptoContextNegotiator.a(l, l2);
            object = fb[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptoContextNegotiator.fb[n] = clazz = Class.forName(gb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private double f(SystemConfigurationOrchestrator systemConfigurationOrchestrator, ConnectionConfigurationResolver connectionConfigurationResolver, NetworkConnectionManager2538 networkConnectionManager2538, ExecutionStrategy executionStrategy) {
        try {
            if (!networkConnectionManager2538.B(ReflectionMetadataResolver.a)) {
                return -1.0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextNegotiator.a(customSystemException);
        }
        double d2 = networkConnectionManager2538.F();
        double d3 = networkConnectionManager2538.V();
        double d4 = networkConnectionManager2538.B();
        double d5 = networkConnectionManager2538.G();
        double d6 = networkConnectionManager2538.x();
        double d7 = networkConnectionManager2538.o();
        double d8 = 1000.0;
        while (true) {
            double d9;
            double d10;
            double d11;
            double d12;
            double d13;
            double d14;
            ContextualEventDispatcher contextualEventDispatcher;
            float f = executionStrategy.r();
            float f2 = executionStrategy.Y();
            oQ oQ2 = oQ.E(d2 - (double)f, d3, d4 - (double)f, d2 + (double)f, d3 + (double)f2, d4 + (double)f);
            ContextualEventDispatcher contextualEventDispatcher2 = ContextualEventDispatcher.N(d2, d3, d4);
            NetworkPacketInterceptor1107 networkPacketInterceptor1107 = connectionConfigurationResolver.g(contextualEventDispatcher2, contextualEventDispatcher = ContextualEventDispatcher.N(d2 + d5, d3 + d6, d4 + d7), false, networkConnectionManager2538.B(ReflectionMetadataResolver.UL), false, networkConnectionManager2538);
            if (networkPacketInterceptor1107.r()) {
                contextualEventDispatcher = ContextualEventDispatcher.N(networkPacketInterceptor1107.i().X(), networkPacketInterceptor1107.i().F(), networkPacketInterceptor1107.i().f());
            }
            List list = connectionConfigurationResolver.R(this.n, oQ2.r(d5, d6, d7).B(1.0, 1.0, 1.0));
            double d15 = 0.0;
            for (Object e : list) {
                double d16;
                NetworkPacketInterceptor1107 networkPacketInterceptor11072;
                CryptographicTransformer cryptographicTransformer;
                block35: {
                    cryptographicTransformer = new CryptographicTransformer(e);
                    try {
                        try {
                            try {
                                if (!cryptographicTransformer.B(ReflectionMetadataResolver.Ut) || cryptographicTransformer.B(ReflectionMetadataResolver.tD)) continue;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoContextNegotiator.a(customSystemException);
                            }
                            if (!cryptographicTransformer.m()) continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoContextNegotiator.a(customSystemException);
                        }
                        if (!cryptographicTransformer.equals(systemConfigurationOrchestrator)) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoContextNegotiator.a(customSystemException);
                    }
                    oQ2 = cryptographicTransformer.L().B(0.3, 0.3, 0.3);
                    networkPacketInterceptor11072 = oQ2.x(contextualEventDispatcher2, contextualEventDispatcher);
                    try {
                        try {
                            if (GeometryCalculator.C() < 35) break block35;
                            if (!networkPacketInterceptor11072.r()) continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoContextNegotiator.a(customSystemException);
                        }
                        if (!networkPacketInterceptor11072.q().equals(ObjectValidator.u())) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoContextNegotiator.a(customSystemException);
                    }
                    d16 = contextualEventDispatcher2.x(networkPacketInterceptor11072.i());
                    try {
                        if (!(d16 < d15) && d15 != 0.0) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoContextNegotiator.a(customSystemException);
                    }
                    d15 = d16;
                    networkPacketInterceptor11072.s(cryptographicTransformer);
                    networkPacketInterceptor1107 = networkPacketInterceptor11072;
                    continue;
                }
                if (!networkPacketInterceptor11072.r()) continue;
                d16 = contextualEventDispatcher2.x(networkPacketInterceptor11072.i());
                try {
                    if (!(d16 < d15) && d15 != 0.0) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoContextNegotiator.a(customSystemException);
                }
                d15 = d16;
                networkPacketInterceptor11072.s(cryptographicTransformer);
                networkPacketInterceptor1107 = networkPacketInterceptor11072;
            }
            double d17 = systemConfigurationOrchestrator.w(d2 += d5, d3 += d6, d4 += d7);
            if (d17 < d8) {
                d8 = d17;
            }
            if (networkPacketInterceptor1107.r()) {
                double d18;
                block37: {
                    block36: {
                        d2 = networkPacketInterceptor1107.i().X();
                        d3 = networkPacketInterceptor1107.i().F();
                        d4 = networkPacketInterceptor1107.i().f();
                        try {
                            try {
                                if (!networkPacketInterceptor1107.l().r()) break;
                                if (!networkPacketInterceptor1107.l().B(ReflectionMetadataResolver.rl)) break block36;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoContextNegotiator.a(customSystemException);
                            }
                            d18 = 0.0;
                            break block37;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoContextNegotiator.a(customSystemException);
                        }
                    }
                    d18 = systemConfigurationOrchestrator.w(d2, d3, d4);
                }
                return d18;
            }
            try {
                if (d3 < -128.0) {
                    break;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoContextNegotiator.a(customSystemException);
            }
            try {
                d14 = d5;
                d13 = networkConnectionManager2538.F() ? 0.8 : 0.99;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoContextNegotiator.a(customSystemException);
            }
            d5 = d14 * d13;
            try {
                d12 = d6;
                d11 = networkConnectionManager2538.F() ? 0.8 : 0.99;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoContextNegotiator.a(customSystemException);
            }
            d6 = d12 * d11;
            try {
                d10 = d7;
                d9 = networkConnectionManager2538.F() ? 0.8 : 0.99;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoContextNegotiator.a(customSystemException);
            }
            d7 = d10 * d9;
            d6 -= 0.05;
        }
        return d8;
    }

    @DataExchangeProtocol2090
    public void V(DisplayConfigurationManager displayConfigurationManager) {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator;
        long l;
        block57: {
            l = r ^ 0x2C42636BE8CEL;
            systemConfigurationOrchestrator = displayConfigurationManager.getThePlayer();
            try {
                try {
                    if (!systemConfigurationOrchestrator.Y() && !displayConfigurationManager.getWorld().Y()) break block57;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoContextNegotiator.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoContextNegotiator.a(customSystemException);
            }
        }
        E8 e8 = displayConfigurationManager.getFontRenderer();
        float f = (float)displayConfigurationManager.getDisplayWidth() / 2.0f;
        float f2 = (float)displayConfigurationManager.getDisplayHeight() / 2.0f;
        ConfigurationManager.F(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Color.WHITE);
        for (CryptographicTransformer cryptographicTransformer : this.R.keySet()) {
            Color color;
            Object object;
            int n;
            float f3;
            block65: {
                String string;
                StringBuilder stringBuilder;
                boolean bl;
                block66: {
                    LightweightExecutionContext lightweightExecutionContext;
                    double d2;
                    double d3;
                    block64: {
                        block63: {
                            block62: {
                                int n2;
                                float f4;
                                Object object2;
                                double d4;
                                double d5;
                                block58: {
                                    block59: {
                                        boolean bl2;
                                        try {
                                            bl2 = this.t.J() == this.O;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptoContextNegotiator.a(customSystemException);
                                        }
                                        bl = bl2;
                                        d5 = 0.0;
                                        d4 = 0.0;
                                        try {
                                            if (bl) break block58;
                                            if (!cryptographicTransformer.B(ReflectionMetadataResolver.a)) break block59;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptoContextNegotiator.a(customSystemException);
                                        }
                                        object2 = new ThreadPoolConfigManager(cryptographicTransformer.M());
                                        ExecutionStrategy executionStrategy = this.d((NetworkConnectionManager2538)object2);
                                        if (executionStrategy != null) {
                                            boolean bl3;
                                            d5 = this.f(systemConfigurationOrchestrator, displayConfigurationManager.getWorld(), (NetworkConnectionManager2538)object2, executionStrategy);
                                            try {
                                                bl3 = d5 == 0.0;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptoContextNegotiator.a(customSystemException);
                                            }
                                            bl = bl3;
                                            d4 = 5.0;
                                        }
                                        break block58;
                                    }
                                    if (cryptographicTransformer.B(ReflectionMetadataResolver.bA)) {
                                        boolean bl4;
                                        d5 = this.i(systemConfigurationOrchestrator, displayConfigurationManager.getWorld(), new TransactionAnalyzer(cryptographicTransformer.M()));
                                        try {
                                            bl4 = d5 < 3.0;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptoContextNegotiator.a(customSystemException);
                                        }
                                        bl = bl4;
                                        d4 = 12.0;
                                    }
                                }
                                try {
                                    try {
                                        if (this.t.J() == this.v && d5 > d4) {
                                            continue;
                                        }
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptoContextNegotiator.a(customSystemException);
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptoContextNegotiator.a(customSystemException);
                                }
                                object2 = this.R.get(cryptographicTransformer);
                                Object object3 = object2[0];
                                double d6 = (double)ApplicationLifecycleManager.b() - object2[1];
                                try {
                                    try {
                                        if (object2[2] < 1.0 && this.P((double)(object3 / 2.0), d6 / 2.0, displayConfigurationManager.getDisplayWidth(), displayConfigurationManager.getDisplayHeight())) {
                                            continue;
                                        }
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptoContextNegotiator.a(customSystemException);
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptoContextNegotiator.a(customSystemException);
                                }
                                try {
                                    f4 = this.k(f, (double)(object3 / 2.0), f2, d6 / 2.0);
                                    n2 = object2[2] > 1.0 ? 180 : 0;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptoContextNegotiator.a(customSystemException);
                                }
                                f3 = f4 + (float)n2;
                                double d7 = (double)f * (Double)this.l.J();
                                double d8 = (double)f2 * (Double)this.l.J();
                                d3 = Math.sqrt(1.0 / (1.0 / (d7 * d7) + Math.pow(Math.tan(Math.toRadians(f3)), 2.0) / (d8 * d8)));
                                d2 = Math.tan(Math.toRadians(f3)) * d3;
                                float f5 = AdaptiveComputationEngine.v(f3 + 90.0f);
                                if (f5 < 0.0f) {
                                    d3 = -d3;
                                    if (f5 > -180.0f) {
                                        d2 = -d2;
                                    }
                                }
                                n = 0;
                                try {
                                    if (bl || this.t.J() != this.v) break block62;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptoContextNegotiator.a(customSystemException);
                                }
                                n = (int)(systemConfigurationOrchestrator.y(cryptographicTransformer) * 2.0f);
                            }
                            if (n > 200) {
                                n = 200;
                            }
                            lightweightExecutionContext = this.z(cryptographicTransformer);
                            try {
                                try {
                                    if (lightweightExecutionContext != null && !lightweightExecutionContext.Y()) break block63;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptoContextNegotiator.a(customSystemException);
                                }
                                return;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoContextNegotiator.a(customSystemException);
                            }
                        }
                        try {
                            Ne.h.z();
                            Ne.h.m(d3 + (double)((float)displayConfigurationManager.getDisplayWidth() / 4.0f), d2 + (double)((float)displayConfigurationManager.getDisplayHeight() / 4.0f), 0.0);
                            if (bl) {
                                Ne.h.x(1.5, 1.5, 1.0);
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoContextNegotiator.a(customSystemException);
                        }
                        try {
                            try {
                                Ne.h.z();
                                if (!ConfigurationManager.U()) break block64;
                                Ne.h.m(d3 + (double)((float)displayConfigurationManager.getDisplayWidth() / 4.0f), d2 + (double)((float)displayConfigurationManager.getDisplayHeight() / 4.0f), 0.0);
                                if (!bl) break block64;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoContextNegotiator.a(customSystemException);
                            }
                            Ne.h.x(1.5, 1.5, 1.0);
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoContextNegotiator.a(customSystemException);
                        }
                    }
                    try {
                        try {
                            try {
                                try {
                                    Ne.h.f(f3 - 90.0f, 0.0f, 0.0f, 1.0f);
                                    ApplicationLifecycleManager.g().L(e8, ApplicationLifecycleManager.s(), lightweightExecutionContext, -8, -20);
                                    Ne.h.X();
                                    if (!this.N.s().booleanValue() || n >= 200) break block65;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptoContextNegotiator.a(customSystemException);
                                }
                                Ne.h.z();
                                if (!ConfigurationManager.U()) break block66;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoContextNegotiator.a(customSystemException);
                            }
                            Ne.h.m(d3 + (double)((float)displayConfigurationManager.getDisplayWidth() / 4.0f), d2 + (double)((float)displayConfigurationManager.getDisplayHeight() / 4.0f), 0.0);
                            if (!bl) break block66;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoContextNegotiator.a(customSystemException);
                        }
                        Ne.h.x(1.5, 1.5, 1.0);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoContextNegotiator.a(customSystemException);
                    }
                }
                try {
                    stringBuilder = new StringBuilder();
                    string = bl ? "\u00a7l" : "";
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoContextNegotiator.a(customSystemException);
                }
                object = stringBuilder.append(string).append((int)systemConfigurationOrchestrator.y(cryptographicTransformer)).append((String)((Object)CryptoContextNegotiator.c("\u00dc", (int)CryptoContextNegotiator.a("f", (int)20216, (long)(0x43D6A41EE75CF06AL ^ l)), (long)6777952229706427836L, (long)l))).toString();
                try {
                    Ne.h.x(0.5, 0.5, 0.0);
                    tl.N();
                    Color color2 = color = bl ? new Color(255, 0, 0) : new Color(255, 255, 255, 255 - n);
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoContextNegotiator.a(customSystemException);
                }
                if (ConfigurationManager.U()) {
                    DataTransformationEngine1209 dataTransformationEngine1209 = DataTransformationEngine1209.i();
                    dataTransformationEngine1209.g();
                    dataTransformationEngine1209.C(z6.D.i().B());
                    e8.I((String)object, (float)(-e8.L((String)object)) / 2.0f, -e8.s((String)object), EventDispatchCoordinator1159.S(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()), dataTransformationEngine1209);
                } else {
                    e8.m((String)object, (float)(-e8.L((String)object)) / 2.0f, -e8.s((String)object), EventDispatchCoordinator1159.S(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()));
                }
                tl.j();
                Ne.h.X();
            }
            Ne.h.f(f3 - 90.0f, 0.0f, 0.0f, 1.0f);
            Ne.h.x(0.375, 0.5, 0.0);
            object = this.D(cryptographicTransformer);
            color = new Color(((Color)object).getRed(), ((Color)object).getGreen(), ((Color)object).getBlue(), 255 - n);
            StateTrackingCoordinator.d(color, -16.0f, 0.0f, (String)((Object)CryptoContextNegotiator.c("\u00dc", (int)CryptoContextNegotiator.a("f", (int)21544, (long)(0x691B483D1C646AAFL ^ l)), (long)6777952229706427836L, (long)l)), 1.0f, false);
            Ne.h.X();
        }
        this.R.clear();
    }

    private List<ExecutionStrategy> w() {
        ArrayList<ExecutionStrategy> arrayList = new ArrayList<ExecutionStrategy>();
        try {
            if (this.P.s().booleanValue()) {
                arrayList.add(this.o);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextNegotiator.a(customSystemException);
        }
        try {
            if (this.K.s().booleanValue()) {
                arrayList.add(this.X);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextNegotiator.a(customSystemException);
        }
        try {
            if (this.e.s().booleanValue()) {
                arrayList.add(this.w);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextNegotiator.a(customSystemException);
        }
        try {
            if (this.d.s().booleanValue()) {
                arrayList.add(this.G);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextNegotiator.a(customSystemException);
        }
        try {
            if (this.b.s().booleanValue()) {
                arrayList.add(this.F);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextNegotiator.a(customSystemException);
        }
        try {
            if (this.x.s().booleanValue()) {
                arrayList.add(this.Z);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextNegotiator.a(customSystemException);
        }
        return arrayList;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptoContextNegotiator.r = MultiContainerRegistry.a(-4352571552677113818L, -2557319560365827334L, MethodHandles.lookup().lookupClass()).a(144063315933582L);
                CryptoContextNegotiator.fb = new Object[5];
                CryptoContextNegotiator.gb = new String[5];
                CryptoContextNegotiator.a();
                CryptoContextNegotiator.bb = new HashMap<K, V>(13);
                var0 = CryptoContextNegotiator.r ^ 112146285485517L;
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
                var8_3 = new long[28];
                var5_4 = 0;
                var6_5 = "\u00efA\u00a6&\u00d5r/o\u0018-j*=\u0092\u0007\u00eb\u00a0\u00d0\u009c\u00d5\u00da\u00cb|\u0012g\u00a9B\u0017&\u0091\u00ec\u00c7O\u00f4\u00ee\u0084\u00a7.\u00d5B|r\n\u0019\u0014\u00ac\u00a36\u00ce\u0017\u009e\u00d4\u00ec)\u0001^Q@\u00eef\u0093r+\u00b3N\u000e\u00f9!\u00f3\u00f5\u00ac\u0083\u00a4/\u00cdt\u00f3\"\u0006L\u00a7Tr\u00f7\u00dc<\u00c2\u00d6\u00deU\u0018\u0017\u00d5d\u001a\u0093/\u0088\u00cf\u00aa\u00c0\n\u008a\u00f0\u00cd*\u00ba\u0090S/\u00174\n\u009d(S\u0091\u00fe\u00e9\u00fe\\\u0016\u00d4\u00a1\u00e6\\k\u0093tSX\u0085E\u00e3\u0088\u00ea\u00bfg\u00a0\u00b4\u00bd?\u009f5\u00e8\u00a0\u00d9\u00fe\u00d6\u00cd\u00fe#\u00e5\u0094\u00b5;\u0010u\u00dc\u00b7\u00c0\u00a1PMB\u00f8=\u000b\u0081\u00aa\u009cn,\r\u00acKAn\u00fa\u00e0\u0011N\u00d9\u0014\u0014\u007f\u00a0\u0094\u00b5\u001a\u008e9\u00ec\u00af\u00ad\u00a6/\u00bb\u00ac\u0013F\u00ca3E\u00c6\u00cbIz";
                var7_6 = "\u00efA\u00a6&\u00d5r/o\u0018-j*=\u0092\u0007\u00eb\u00a0\u00d0\u009c\u00d5\u00da\u00cb|\u0012g\u00a9B\u0017&\u0091\u00ec\u00c7O\u00f4\u00ee\u0084\u00a7.\u00d5B|r\n\u0019\u0014\u00ac\u00a36\u00ce\u0017\u009e\u00d4\u00ec)\u0001^Q@\u00eef\u0093r+\u00b3N\u000e\u00f9!\u00f3\u00f5\u00ac\u0083\u00a4/\u00cdt\u00f3\"\u0006L\u00a7Tr\u00f7\u00dc<\u00c2\u00d6\u00deU\u0018\u0017\u00d5d\u001a\u0093/\u0088\u00cf\u00aa\u00c0\n\u008a\u00f0\u00cd*\u00ba\u0090S/\u00174\n\u009d(S\u0091\u00fe\u00e9\u00fe\\\u0016\u00d4\u00a1\u00e6\\k\u0093tSX\u0085E\u00e3\u0088\u00ea\u00bfg\u00a0\u00b4\u00bd?\u009f5\u00e8\u00a0\u00d9\u00fe\u00d6\u00cd\u00fe#\u00e5\u0094\u00b5;\u0010u\u00dc\u00b7\u00c0\u00a1PMB\u00f8=\u000b\u0081\u00aa\u009cn,\r\u00acKAn\u00fa\u00e0\u0011N\u00d9\u0014\u0014\u007f\u00a0\u0094\u00b5\u001a\u008e9\u00ec\u00af\u00ad\u00a6/\u00bb\u00ac\u0013F\u00ca3E\u00c6\u00cbIz".length();
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
                    var6_5 = "\u00cf\u00fb\u0012f\t\u00f4\u001b\u0011=\u00af\u00ebAM\u00f0P\u001c";
                    var7_6 = "\u00cf\u00fb\u0012f\t\u00f4\u001b\u0011=\u00af\u00ebAM\u00f0P\u001c".length();
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
        CryptoContextNegotiator.T = var8_3;
        CryptoContextNegotiator.Y = new Integer[28];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptoContextNegotiator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private ExecutionStrategy d(NetworkConnectionManager2538 networkConnectionManager2538) {
        block12: {
            try {
                if (networkConnectionManager2538.j()) {
                    return null;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoContextNegotiator.a(customSystemException);
            }
            try {
                try {
                    try {
                        if (networkConnectionManager2538.B(ReflectionMetadataResolver.bA) || networkConnectionManager2538.F() != networkConnectionManager2538.b()) break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoContextNegotiator.a(customSystemException);
                    }
                    if (networkConnectionManager2538.B() != networkConnectionManager2538.I()) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoContextNegotiator.a(customSystemException);
                }
                return null;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoContextNegotiator.a(customSystemException);
            }
        }
        for (ExecutionStrategy executionStrategy : this.w()) {
            try {
                if (!executionStrategy.D(networkConnectionManager2538)) continue;
                return executionStrategy;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoContextNegotiator.a(customSystemException);
            }
        }
        return null;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'y' || c == '\u00f4' || c == 'f' || c == 'J') {
                field = CryptoContextNegotiator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'y' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f4' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'f' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptoContextNegotiator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00dc' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private double i(SystemConfigurationOrchestrator systemConfigurationOrchestrator, ConnectionConfigurationResolver connectionConfigurationResolver, TransactionAnalyzer transactionAnalyzer) {
        try {
            if (!transactionAnalyzer.B(ReflectionMetadataResolver.bA)) {
                return -1.0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextNegotiator.a(customSystemException);
        }
        double d2 = transactionAnalyzer.F();
        double d3 = transactionAnalyzer.V();
        double d4 = transactionAnalyzer.B();
        double d5 = transactionAnalyzer.G();
        double d6 = transactionAnalyzer.x();
        double d7 = transactionAnalyzer.o();
        double d8 = 1000.0;
        for (int i = 0; i < 100; ++i) {
            double d9;
            block33: {
                block32: {
                    NetworkPacketInterceptor1107 networkPacketInterceptor1107;
                    ContextualEventDispatcher contextualEventDispatcher;
                    ContextualEventDispatcher contextualEventDispatcher2;
                    oQ oQ2;
                    block30: {
                        block29: {
                            float f = transactionAnalyzer.L();
                            float f2 = transactionAnalyzer.d();
                            oQ2 = oQ.E(d2 - (double)f, d3, d4 - (double)f, d2 + (double)f, d3 + (double)f2, d4 + (double)f);
                            contextualEventDispatcher2 = ContextualEventDispatcher.N(d2, d3, d4);
                            contextualEventDispatcher = ContextualEventDispatcher.N(d2 + d5, d3 + d6, d4 + d7);
                            networkPacketInterceptor1107 = connectionConfigurationResolver.g(contextualEventDispatcher2, contextualEventDispatcher, false, true, false, transactionAnalyzer);
                            try {
                                try {
                                    if (GeometryCalculator.C() < 35) break block29;
                                    if (!networkPacketInterceptor1107.r()) break block30;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptoContextNegotiator.a(customSystemException);
                                }
                                if (networkPacketInterceptor1107.q().equals(ObjectValidator.u())) break block30;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoContextNegotiator.a(customSystemException);
                            }
                            contextualEventDispatcher = ContextualEventDispatcher.N(networkPacketInterceptor1107.i().X(), networkPacketInterceptor1107.i().F(), networkPacketInterceptor1107.i().f());
                            break block30;
                        }
                        if (networkPacketInterceptor1107.r()) {
                            contextualEventDispatcher = ContextualEventDispatcher.N(networkPacketInterceptor1107.i().X(), networkPacketInterceptor1107.i().F(), networkPacketInterceptor1107.i().f());
                        }
                    }
                    List list = connectionConfigurationResolver.R(this.n, oQ2.r(d5, d6, d7).B(1.0, 1.0, 1.0));
                    double d10 = 0.0;
                    for (Object e : list) {
                        double d11;
                        NetworkPacketInterceptor1107 networkPacketInterceptor11072;
                        CryptographicTransformer cryptographicTransformer;
                        block31: {
                            cryptographicTransformer = new CryptographicTransformer(e);
                            try {
                                try {
                                    try {
                                        if (!cryptographicTransformer.B(ReflectionMetadataResolver.Ut) || cryptographicTransformer.B(ReflectionMetadataResolver.tD)) continue;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptoContextNegotiator.a(customSystemException);
                                    }
                                    if (!cryptographicTransformer.m()) continue;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptoContextNegotiator.a(customSystemException);
                                }
                                if (!cryptographicTransformer.equals(systemConfigurationOrchestrator)) continue;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoContextNegotiator.a(customSystemException);
                            }
                            oQ2 = cryptographicTransformer.L().B(0.3, 0.3, 0.3);
                            networkPacketInterceptor11072 = oQ2.x(contextualEventDispatcher2, contextualEventDispatcher);
                            try {
                                try {
                                    if (GeometryCalculator.C() < 35) break block31;
                                    if (!networkPacketInterceptor11072.r()) continue;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptoContextNegotiator.a(customSystemException);
                                }
                                if (!networkPacketInterceptor11072.q().equals(ObjectValidator.u())) continue;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoContextNegotiator.a(customSystemException);
                            }
                            d11 = contextualEventDispatcher2.x(networkPacketInterceptor11072.i());
                            try {
                                if (!(d11 < d10) && d10 != 0.0) continue;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoContextNegotiator.a(customSystemException);
                            }
                            d10 = d11;
                            networkPacketInterceptor11072.s(cryptographicTransformer);
                            networkPacketInterceptor1107 = networkPacketInterceptor11072;
                            continue;
                        }
                        if (!networkPacketInterceptor11072.r()) continue;
                        d11 = contextualEventDispatcher2.x(networkPacketInterceptor11072.i());
                        try {
                            if (!(d11 < d10) && d10 != 0.0) continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoContextNegotiator.a(customSystemException);
                        }
                        d10 = d11;
                        networkPacketInterceptor11072.s(cryptographicTransformer);
                        networkPacketInterceptor1107 = networkPacketInterceptor11072;
                    }
                    double d12 = systemConfigurationOrchestrator.w(d2 += d5, d3 += d6, d4 += d7);
                    if (d12 < d8) {
                        d8 = d12;
                    }
                    if (!networkPacketInterceptor1107.r()) continue;
                    d2 = networkPacketInterceptor1107.i().X();
                    d3 = networkPacketInterceptor1107.i().F();
                    d4 = networkPacketInterceptor1107.i().f();
                    try {
                        try {
                            if (!networkPacketInterceptor1107.l().r()) break;
                            if (!networkPacketInterceptor1107.l().B(ReflectionMetadataResolver.rl)) break block32;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoContextNegotiator.a(customSystemException);
                        }
                        d9 = 0.0;
                        break block33;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoContextNegotiator.a(customSystemException);
                    }
                }
                d9 = systemConfigurationOrchestrator.w(d2, d3, d4);
            }
            return d9;
        }
        return d8;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ar" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptoContextNegotiator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptoContextNegotiator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @DataExchangeProtocol2090
    public void W(EventDispatchRegistry2111 eventDispatchRegistry2111) {
        long l = r ^ 0x530AF8B9F80DL;
        try {
            if (this.n == null) {
                this.n = DataTransmissionManager2384.h(eventDispatchRegistry2111.getWorld(), CryptographicTokenGenerator1926.o(UUID.randomUUID(), (String)((Object)CryptoContextNegotiator.c("\u00dc", (int)CryptoContextNegotiator.a("f", (int)26697, (long)(0x3AA131B528C0C615L ^ l)), (long)5679990125395049855L, (long)l))));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextNegotiator.a(customSystemException);
        }
        this.R.clear();
        CryptoContextNegotiator684.Y();
        for (Object e : eventDispatchRegistry2111.getWorld().L()) {
            CryptographicTransformer cryptographicTransformer = new CryptographicTransformer(e);
            if (!this.d(eventDispatchRegistry2111.getThePlayer(), eventDispatchRegistry2111.getWorld(), cryptographicTransformer)) continue;
            double d2 = cryptographicTransformer.b() + (cryptographicTransformer.F() - cryptographicTransformer.b()) * (double)eventDispatchRegistry2111.getTicks() - NumericComputationEngine1131.b();
            double d3 = cryptographicTransformer.q() + (cryptographicTransformer.V() - cryptographicTransformer.q()) * (double)eventDispatchRegistry2111.getTicks() - NumericComputationEngine1131.S();
            double d4 = cryptographicTransformer.I() + (cryptographicTransformer.B() - cryptographicTransformer.I()) * (double)eventDispatchRegistry2111.getTicks() - NumericComputationEngine1131.n();
            double[] dArray = CryptoContextNegotiator684.E(d2, d3, d4);
            this.R.put(cryptographicTransformer, dArray);
        }
        CryptoContextNegotiator684.J();
    }

    private static Method d(long l, long l2) {
        int n = CryptoContextNegotiator.a(l, l2);
        Object object = fb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = gb[n];
                int n3 = string2.indexOf(8);
                clazz3 = CryptoContextNegotiator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptoContextNegotiator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptoContextNegotiator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptoContextNegotiator.fb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptoContextNegotiator.b(269977002857200L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptoContextNegotiator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptoContextNegotiator.fb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptoContextNegotiator.b(269977002857200L, 0L);
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public LightweightExecutionContext z(CryptographicTransformer cryptographicTransformer) {
        block19: {
            block20: {
                long l = r ^ 0xFDEE0319B15L;
                try {
                    try {
                        this.A = null;
                        if (this.A != null) break block19;
                        if (GeometryCalculator.C() < 35) break block20;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoContextNegotiator.a(customSystemException);
                    }
                    this.A = LightweightExecutionContext.d(ProtocolInteractionController.d((String)((Object)CryptoContextNegotiator.c("\u00dc", (int)CryptoContextNegotiator.a("f", (int)13154, (long)(0x603BEF96DDD1FE33L ^ l)), (long)3299797366674923111L, (long)l))));
                    this.B = LightweightExecutionContext.d(ProtocolInteractionController.d((String)((Object)CryptoContextNegotiator.c("\u00dc", (int)CryptoContextNegotiator.a("f", (int)6743, (long)(0x36BFC2CBE5CD701L ^ l)), (long)3299797366674923111L, (long)l))));
                    this.m = LightweightExecutionContext.d(ProtocolInteractionController.d((String)((Object)CryptoContextNegotiator.c("\u00dc", (int)CryptoContextNegotiator.a("f", (int)1842, (long)(0x1B762A6D95BFCA6DL ^ l)), (long)3299797366674923111L, (long)l))));
                    this.h = LightweightExecutionContext.d(ProtocolInteractionController.d((String)((Object)CryptoContextNegotiator.c("\u00dc", (int)CryptoContextNegotiator.a("f", (int)26069, (long)(0x359B4D352262A881L ^ l)), (long)3299797366674923111L, (long)l))));
                    this.z = LightweightExecutionContext.d(ProtocolInteractionController.d((String)((Object)CryptoContextNegotiator.c("\u00dc", (int)CryptoContextNegotiator.a("f", (int)18072, (long)(0x156EC01A52C0BDDL ^ l)), (long)3299797366674923111L, (long)l))));
                    this.j = LightweightExecutionContext.d(ProtocolInteractionController.d((String)((Object)CryptoContextNegotiator.c("\u00dc", (int)CryptoContextNegotiator.a("f", (int)2073, (long)(0x4D34DB55F6594555L ^ l)), (long)3299797366674923111L, (long)l))));
                    break block19;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoContextNegotiator.a(customSystemException);
                }
            }
            this.A = LightweightExecutionContext.d(ProtocolInteractionController.Y(262));
            this.B = LightweightExecutionContext.d(ProtocolInteractionController.Y(368));
            this.m = LightweightExecutionContext.d(ProtocolInteractionController.Y(438));
            this.h = LightweightExecutionContext.d(ProtocolInteractionController.Y(344));
            this.z = LightweightExecutionContext.d(ProtocolInteractionController.Y(332));
            this.j = LightweightExecutionContext.d(ProtocolInteractionController.Y(385));
        }
        try {
            if (cryptographicTransformer.B(ReflectionMetadataResolver.UL)) {
                return this.A;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextNegotiator.a(customSystemException);
        }
        try {
            if (cryptographicTransformer.B(ReflectionMetadataResolver.EH)) {
                return this.B;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextNegotiator.a(customSystemException);
        }
        try {
            if (cryptographicTransformer.B(ReflectionMetadataResolver.F6)) {
                return this.m;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextNegotiator.a(customSystemException);
        }
        try {
            if (cryptographicTransformer.B(ReflectionMetadataResolver.El)) {
                return this.h;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextNegotiator.a(customSystemException);
        }
        try {
            if (cryptographicTransformer.B(ReflectionMetadataResolver.P3)) {
                return this.z;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextNegotiator.a(customSystemException);
        }
        return this.j;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptoContextNegotiator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public CryptoContextNegotiator() {
        long l = r ^ 0x6205A6412706L;
        super(a.cs((int)CryptoContextNegotiator.a("f", (int)21085, (long)(0x582BDCB536EA2319L ^ l))), (int)CryptoContextNegotiator.a("f", (int)25467, (long)(0x4739C9C716119225L ^ l)), RecursiveNodeGraph.z, a.cs((int)CryptoContextNegotiator.a("f", (int)10036, (long)(0x4384301A22FF5679L ^ l))));
        this.o = new AssetLifecycleManager();
        this.X = new BaseTransactionProcessor();
        this.w = new StylesheetThemeManager(Collections.singleton(ReflectionMetadataResolver.EH), new Color(173, 12, 255));
        this.G = new StylesheetThemeManager(Collections.singleton(ReflectionMetadataResolver.El), new Color(255, 238, 154));
        this.F = new StylesheetThemeManager(Collections.singleton(ReflectionMetadataResolver.P3), new Color(255, 255, 255));
        this.Z = new StylesheetThemeManager(Collections.singleton(ReflectionMetadataResolver.bA), new Color(255, 0, 0));
        this.V = new AuthenticationGateway1860((String)((Object)CryptoContextNegotiator.c("\u00dc", (int)CryptoContextNegotiator.a("f", (int)26595, (long)(0x38C509C30E8016B8L ^ l)), (long)-7937504305540685196L, (long)l)));
        this.v = new AuthenticationGateway1860((String)((Object)CryptoContextNegotiator.c("\u00dc", (int)CryptoContextNegotiator.a("f", (int)11646, (long)(0x41BB9FF7DD7D5C2EL ^ l)), (long)-7937504305540685196L, (long)l)));
        this.O = new AuthenticationGateway1860((String)((Object)CryptoContextNegotiator.c("\u00dc", (int)CryptoContextNegotiator.a("f", (int)20763, (long)(0xDE3FFDDD11A055L ^ l)), (long)-7937504305540685196L, (long)l)));
        this.t = GenericAdapterManager.D(this, (String)((Object)CryptoContextNegotiator.c("\u00dc", (int)CryptoContextNegotiator.a("f", (int)23936, (long)(0x18A42D07126CACD3L ^ l)), (long)-7937504305540685196L, (long)l)), this.v, this.V, this.v, this.O);
        this.L = AdaptiveRenderingEngine.C(this, (String)((Object)CryptoContextNegotiator.c("\u00dc", (int)CryptoContextNegotiator.a("f", (int)10848, (long)(0xA0733D56958DB3DL ^ l)), (long)-7937504305540685196L, (long)l)), new Color(255, 0, 0));
        this.N = AuthenticationStateTracker.R(this, (String)((Object)CryptoContextNegotiator.c("\u00dc", (int)CryptoContextNegotiator.a("f", (int)9393, (long)(0x25A6A47C1FF9D5EDL ^ l)), (long)-7937504305540685196L, (long)l)), false, (String)((Object)CryptoContextNegotiator.c("\u00dc", (int)CryptoContextNegotiator.a("f", (int)15352, (long)(0x4325668E31624AA0L ^ l)), (long)-7937504305540685196L, (long)l)));
        this.l = NumericPrecisionTransformer.N(this, (String)((Object)CryptoContextNegotiator.c("\u00dc", (int)CryptoContextNegotiator.a("f", (int)3553, (long)(0x70D6FB1CD8F37CA1L ^ l)), (long)-7937504305540685196L, (long)l)), (String)((Object)CryptoContextNegotiator.c("\u00dc", (int)CryptoContextNegotiator.a("f", (int)13226, (long)(0x44363D08830142FEL ^ l)), (long)-7937504305540685196L, (long)l)), (String)((Object)CryptoContextNegotiator.c("\u00dc", (int)CryptoContextNegotiator.a("f", (int)2268, (long)(0x58A050441E75F99DL ^ l)), (long)-7937504305540685196L, (long)l)), 0.0, 0.15, 1.0, 0.05);
        this.P = AuthenticationStateTracker.w(this, (String)((Object)CryptoContextNegotiator.c("\u00dc", (int)CryptoContextNegotiator.a("f", (int)19716, (long)(0x1131D206E1B03C56L ^ l)), (long)-7937504305540685196L, (long)l)), true);
        this.e = AuthenticationStateTracker.w(this, (String)((Object)CryptoContextNegotiator.c("\u00dc", (int)CryptoContextNegotiator.a("f", (int)6107, (long)(0x5D443E7A23E5E682L ^ l)), (long)-7937504305540685196L, (long)l)), false);
        this.K = AuthenticationStateTracker.w(this, (String)((Object)CryptoContextNegotiator.c("\u00dc", (int)CryptoContextNegotiator.a("f", (int)30323, (long)(0x6D92AE595CED8722L ^ l)), (long)-7937504305540685196L, (long)l)), false);
        this.d = AuthenticationStateTracker.w(this, (String)((Object)CryptoContextNegotiator.c("\u00dc", (int)CryptoContextNegotiator.a("f", (int)25692, (long)(0x10267C3D6BEF951FL ^ l)), (long)-7937504305540685196L, (long)l)), true);
        this.b = AuthenticationStateTracker.w(this, (String)((Object)CryptoContextNegotiator.c("\u00dc", (int)CryptoContextNegotiator.a("f", (int)15670, (long)(0x1A4D5034EB014C70L ^ l)), (long)-7937504305540685196L, (long)l)), true);
        this.x = AuthenticationStateTracker.w(this, (String)((Object)CryptoContextNegotiator.c("\u00dc", (int)CryptoContextNegotiator.a("f", (int)7702, (long)(0x510104DED37D6F43L ^ l)), (long)-7937504305540685196L, (long)l)), true);
        this.R = new HashMap<CryptographicTransformer, double[]>();
        this.N(this.t, this.L, this.P, this.e, this.K, this.d, this.b, this.x, this.l, this.N);
    }

    private static void a() {
        Object[] objectArray = fb;
        fb[0] = "yB\u0013";
        objectArray[1] = Integer.TYPE;
        CryptoContextNegotiator.gb[1] = "java/lang/Integer";
        objectArray[2] = "\u0017B`}(\f\u001cMq2U\u0014\u000fJx{";
        objectArray[3] = "ZL/\t\n\u0003QC>Fk\rZH:\u001c";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "rRuawkuNj\u001a$~\u0014\u0017(#s?)P(yt\u0005-Hwgs|h\u0011r'O";
    }

    private boolean P(double d2, double d3, int n, int n2) {
        boolean bl;
        block9: {
            block8: {
                try {
                    try {
                        try {
                            try {
                                if (!(d2 > 0.0) || !(d3 > 0.0)) break block8;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoContextNegotiator.a(customSystemException);
                            }
                            if (!(d2 < (double)(n / 2))) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoContextNegotiator.a(customSystemException);
                        }
                        if (!(d3 < (double)(n2 / 2))) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoContextNegotiator.a(customSystemException);
                    }
                    bl = true;
                    break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoContextNegotiator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static Field c(long l, long l2) {
        int n = CryptoContextNegotiator.a(l, l2);
        Object object = fb[n];
        if (object instanceof String) {
            String string = gb[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptoContextNegotiator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptoContextNegotiator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptoContextNegotiator.a(clazz3, string2, clazz2)) != null) {
                    CryptoContextNegotiator.fb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptoContextNegotiator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptoContextNegotiator.fb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptoContextNegotiator.b(269977002857200L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public boolean d(SystemConfigurationOrchestrator systemConfigurationOrchestrator, ConnectionConfigurationResolver connectionConfigurationResolver, CryptographicTransformer cryptographicTransformer) {
        ThreadPoolConfigManager threadPoolConfigManager;
        ExecutionStrategy executionStrategy;
        block22: {
            boolean bl;
            double d2;
            block24: {
                boolean bl2;
                block26: {
                    block25: {
                        block23: {
                            try {
                                if (NumericComputationEngine1000.n()) {
                                    return false;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoContextNegotiator.a(customSystemException);
                            }
                            try {
                                try {
                                    try {
                                        if (!cryptographicTransformer.B(ReflectionMetadataResolver.bA) || !this.x.s().booleanValue()) break block22;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptoContextNegotiator.a(customSystemException);
                                    }
                                    if (!(systemConfigurationOrchestrator.y(cryptographicTransformer) > 1000.0f)) break block23;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptoContextNegotiator.a(customSystemException);
                                }
                                return false;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoContextNegotiator.a(customSystemException);
                            }
                        }
                        d2 = this.i(systemConfigurationOrchestrator, connectionConfigurationResolver, new TransactionAnalyzer(cryptographicTransformer.M()));
                        try {
                            try {
                                if (this.t.J() != this.O) break block24;
                                if (d2 != 0.0) break block25;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoContextNegotiator.a(customSystemException);
                            }
                            bl2 = true;
                            break block26;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoContextNegotiator.a(customSystemException);
                        }
                    }
                    bl2 = false;
                }
                return bl2;
            }
            try {
                bl = d2 != -1.0;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoContextNegotiator.a(customSystemException);
            }
            return bl;
        }
        if (cryptographicTransformer.B(ReflectionMetadataResolver.a) && (executionStrategy = this.d(threadPoolConfigManager = new ThreadPoolConfigManager(cryptographicTransformer.M()))) != null) {
            boolean bl;
            double d3;
            block27: {
                boolean bl3;
                block29: {
                    block28: {
                        d3 = this.f(systemConfigurationOrchestrator, connectionConfigurationResolver, threadPoolConfigManager, executionStrategy);
                        try {
                            try {
                                if (this.t.J() != this.O) break block27;
                                if (d3 != 0.0) break block28;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoContextNegotiator.a(customSystemException);
                            }
                            bl3 = true;
                            break block29;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoContextNegotiator.a(customSystemException);
                        }
                    }
                    bl3 = false;
                }
                return bl3;
            }
            try {
                bl = d3 != -1.0;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoContextNegotiator.a(customSystemException);
            }
            return bl;
        }
        return false;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptoContextNegotiator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CryptoContextNegotiator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

