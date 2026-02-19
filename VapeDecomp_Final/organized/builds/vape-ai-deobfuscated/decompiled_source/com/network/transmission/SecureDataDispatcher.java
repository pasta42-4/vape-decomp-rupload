/*
 * Decompiled with CFR 0.152.
 */
package com.network.transmission;

import a.Ne;
import a._Y;
import a.a;
import a.kg;
import a.oQ;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.analytics.computation.MetricsCalculationEngine;
import com.app.config.management.ConfigurationRegistry;
import com.app.core.execution.ExecutionOrchestrator;
import com.app.input.events.InputEventBroker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.event.dispatch.EventDispatchCoordinator559;
import com.event.dispatch.EventDispatchRegistry2111;
import com.event.management.ContextualEventDispatcher;
import com.exception.system.CustomSystemException;
import com.financial.processing.TransactionCorrelationEngine;
import com.graph.structure.RecursiveNodeGraph;
import com.math.geometry.GeometricCoordinateCalculator;
import com.network.config.ConnectionConfigurationResolver;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.network.protocol.NetworkProtocolNegotiator;
import com.network.transmission.DataTransmissionManager2384;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.system.config.AdaptiveConfigurationManager;
import com.system.config.ConfigurationOrchestrator;
import com.system.configuration.ConfigurationManager;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.transaction.management.TransactionOrchestrator1017;
import com.validation.core.ObjectValidator;
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
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class SecureDataDispatcher
extends ContextualExecutionFramework {
    private List<GeometricCoordinateCalculator> r;
    private static final Map h;
    private static final long b;
    private static final Object[] j;
    private ConfigurationOrchestrator T;
    private static final Integer[] e;
    private static final long[] d;
    private HashMap<GeometricCoordinateCalculator, ConfigurationOrchestrator> n;
    private NetworkProtocolNegotiator N;
    private static final String[] l;

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = SecureDataDispatcher.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = SecureDataDispatcher.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AO" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = SecureDataDispatcher.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = SecureDataDispatcher.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f5' || c == '\u00ba' || c == '\u00ce' || c == '\u00a4') {
                field = SecureDataDispatcher.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f5' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ba' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ce' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = SecureDataDispatcher.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'l' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4A3B;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/AO", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            SecureDataDispatcher.e[n2] = n3;
        }
        return e[n2];
    }

    @Override
    public void h() {
        this.K(50L, true);
    }

    @DataExchangeProtocol2090
    public void F(EventDispatchRegistry2111 eventDispatchRegistry2111) {
        long l = b ^ 0x70C085C484D6L;
        ConnectionConfigurationResolver connectionConfigurationResolver = ApplicationLifecycleManager.c();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        ContextualEventDispatcher contextualEventDispatcher = ((TransactionOrchestrator1017)ApplicationLifecycleManager.g()).I(1.0f);
        for (GeometricCoordinateCalculator geometricCoordinateCalculator : this.r) {
            int n = geometricCoordinateCalculator.W();
            int n2 = geometricCoordinateCalculator.n();
            int n3 = geometricCoordinateCalculator.H();
            Object object3 = connectionConfigurationResolver.N(n, n2, n3);
            int n4 = TransactionCorrelationEngine.h((TransactionCorrelationEngine)object3);
            try {
                if (n4 != 26 && !((TransactionCorrelationEngine)object3).s().matches((String)((Object)SecureDataDispatcher.c("l", (int)SecureDataDispatcher.a("n", (int)21851, (long)(0x997B994089A3E7AL ^ l)), (long)2385235426434413038L, (long)l)))) continue;
            }
            catch (CustomSystemException customSystemException) {
                throw SecureDataDispatcher.a(customSystemException);
            }
            Object object2 = new EventDispatchCoordinator559(object3);
            boolean bl = ((EventDispatchCoordinator559)object2).N(connectionConfigurationResolver, n, n2, n3);
            try {
                if (bl) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw SecureDataDispatcher.a(customSystemException);
            }
            if (this.n.containsKey(geometricCoordinateCalculator)) {
                object2 = this.n.get(geometricCoordinateCalculator);
            } else {
                object2 = new ConfigurationOrchestrator(geometricCoordinateCalculator);
                this.n.put(geometricCoordinateCalculator, (ConfigurationOrchestrator)object2);
            }
            ((ConfigurationOrchestrator)object2).y();
            arrayList.add(object2);
        }
        Ne.h.z();
        ConfigurationManager.a();
        GraphicsBufferAllocator.V();
        Ne.h.z();
        Ne.h.J(0.5f, 0.5f, 0.5f);
        double d2 = 20.0;
        MetricsCalculationEngine metricsCalculationEngine = new MetricsCalculationEngine((double)(ApplicationLifecycleManager.e() / 2) - d2 / 2.0, (double)(ApplicationLifecycleManager.b() / 2) - d2 / 2.0, d2, d2);
        for (ConfigurationOrchestrator configurationOrchestrator : arrayList) {
            boolean bl;
            MetricsCalculationEngine metricsCalculationEngine2;
            ConfigurationOrchestrator configurationOrchestrator2;
            try {
                configurationOrchestrator2 = configurationOrchestrator;
                metricsCalculationEngine2 = metricsCalculationEngine;
                bl = this.T == configurationOrchestrator;
            }
            catch (CustomSystemException customSystemException) {
                throw SecureDataDispatcher.a(customSystemException);
            }
            configurationOrchestrator2.h(metricsCalculationEngine2, bl, ApplicationLifecycleManager.n().T());
        }
        Object object = null;
        for (Object object3 : arrayList) {
            if (!ConfigurationOrchestrator.j((ConfigurationOrchestrator)object3)) continue;
            object = object3;
        }
        this.r((ConfigurationOrchestrator)object);
        Ne.h.X();
        GraphicsBufferAllocator.E();
        ConfigurationManager.Y();
        Ne.h.X();
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (SecureDataDispatcher.l[n4] != null) {
            return n4;
        }
        Object object = j[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 33;
                break;
            }
            case 1: {
                n3 = 20;
                break;
            }
            case 2: {
                n3 = 53;
                break;
            }
            case 3: {
                n3 = 40;
                break;
            }
            case 4: {
                n3 = 30;
                break;
            }
            case 5: {
                n3 = 60;
                break;
            }
            case 6: {
                n3 = 27;
                break;
            }
            case 7: {
                n3 = 3;
                break;
            }
            case 8: {
                n3 = 61;
                break;
            }
            case 9: {
                n3 = 22;
                break;
            }
            case 10: {
                n3 = 11;
                break;
            }
            case 11: {
                n3 = 1;
                break;
            }
            case 12: {
                n3 = 31;
                break;
            }
            case 13: {
                n3 = 41;
                break;
            }
            case 14: {
                n3 = 58;
                break;
            }
            case 15: {
                n3 = 44;
                break;
            }
            case 16: {
                n3 = 14;
                break;
            }
            case 17: {
                n3 = 8;
                break;
            }
            case 18: {
                n3 = 59;
                break;
            }
            case 19: {
                n3 = 43;
                break;
            }
            case 20: {
                n3 = 34;
                break;
            }
            case 21: {
                n3 = 56;
                break;
            }
            case 22: {
                n3 = 26;
                break;
            }
            case 23: {
                n3 = 38;
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
                n3 = 19;
                break;
            }
            case 27: {
                n3 = 37;
                break;
            }
            case 28: {
                n3 = 6;
                break;
            }
            case 29: {
                n3 = 47;
                break;
            }
            case 30: {
                n3 = 0;
                break;
            }
            case 31: {
                n3 = 21;
                break;
            }
            case 32: {
                n3 = 9;
                break;
            }
            case 33: {
                n3 = 16;
                break;
            }
            case 34: {
                n3 = 51;
                break;
            }
            case 35: {
                n3 = 50;
                break;
            }
            case 36: {
                n3 = 35;
                break;
            }
            case 37: {
                n3 = 48;
                break;
            }
            case 38: {
                n3 = 36;
                break;
            }
            case 39: {
                n3 = 29;
                break;
            }
            case 40: {
                n3 = 55;
                break;
            }
            case 41: {
                n3 = 32;
                break;
            }
            case 42: {
                n3 = 17;
                break;
            }
            case 43: {
                n3 = 57;
                break;
            }
            case 44: {
                n3 = 23;
                break;
            }
            case 45: {
                n3 = 46;
                break;
            }
            case 46: {
                n3 = 5;
                break;
            }
            case 47: {
                n3 = 2;
                break;
            }
            case 48: {
                n3 = 54;
                break;
            }
            case 49: {
                n3 = 49;
                break;
            }
            case 50: {
                n3 = 63;
                break;
            }
            case 51: {
                n3 = 62;
                break;
            }
            case 52: {
                n3 = 25;
                break;
            }
            case 53: {
                n3 = 12;
                break;
            }
            case 54: {
                n3 = 28;
                break;
            }
            case 55: {
                n3 = 15;
                break;
            }
            case 56: {
                n3 = 13;
                break;
            }
            case 57: {
                n3 = 42;
                break;
            }
            case 58: {
                n3 = 39;
                break;
            }
            case 59: {
                n3 = 52;
                break;
            }
            case 60: {
                n3 = 45;
                break;
            }
            case 61: {
                n3 = 18;
                break;
            }
            case 62: {
                n3 = 4;
                break;
            }
            default: {
                n3 = 7;
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
        SecureDataDispatcher.l[n4] = new String(cArray);
        return n4;
    }

    private static Field c(long l, long l2) {
        int n = SecureDataDispatcher.a(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            String string = SecureDataDispatcher.l[n];
            int n2 = string.indexOf(8);
            Class clazz = SecureDataDispatcher.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = SecureDataDispatcher.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = SecureDataDispatcher.a(clazz3, string2, clazz2)) != null) {
                    SecureDataDispatcher.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = SecureDataDispatcher.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        SecureDataDispatcher.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = SecureDataDispatcher.b(270778569113894L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @DataExchangeProtocol2090
    public void z(InputEventBroker inputEventBroker) {
        try {
            if (this.T == null) {
                ConfigurationRegistry.s.Z();
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecureDataDispatcher.a(customSystemException);
        }
        int n = this.T.v().W();
        int n2 = this.T.v().n();
        int n3 = this.T.v().H();
        ReflectionUtilityBroker reflectionUtilityBroker = ReflectionUtilityBroker.t(n, n2, n3);
        oQ oQ2 = oQ.E(n, n2, n3, n + 1, n2 + 1, n3 + 1);
        AdaptiveConfigurationManager adaptiveConfigurationManager = null;
        DataTransmissionManager2384 dataTransmissionManager2384 = ExecutionOrchestrator.F();
        if (((oQ)dataTransmissionManager2384.L()).c() > (double)n2) {
            adaptiveConfigurationManager = AdaptiveConfigurationManager.d(1);
        } else {
            dataTransmissionManager2384.Q((double)n2 + 0.5 + AdaptiveComputationEngine.F(new Random(), -0.2, 0.2));
        }
        kg kg2 = _Y.t(dataTransmissionManager2384, oQ2, 0.0, 0.0, 0.0);
        if (adaptiveConfigurationManager == null) {
            double d2 = 10.0;
            for (AdaptiveConfigurationManager adaptiveConfigurationManager2 : AdaptiveConfigurationManager.G()) {
                ReflectionUtilityBroker reflectionUtilityBroker2 = reflectionUtilityBroker.I(adaptiveConfigurationManager2);
                try {
                    if (adaptiveConfigurationManager2.p() <= 1) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw SecureDataDispatcher.a(customSystemException);
                }
                double d3 = (double)reflectionUtilityBroker2.o() + 0.5 - kg2.R();
                double d4 = (double)reflectionUtilityBroker2.j() + 0.5 - kg2.U();
                double d5 = Math.abs(d3) + Math.abs(d4);
                if (!(d5 < d2)) continue;
                d2 = d5;
                adaptiveConfigurationManager = adaptiveConfigurationManager2;
            }
        }
        this.T.r(kg2);
        ContextualEventDispatcher contextualEventDispatcher = ((TransactionOrchestrator1017)ApplicationLifecycleManager.g()).I(1.0f);
        double d6 = contextualEventDispatcher.x(kg2.l());
        if (d6 < 4.5) {
            NetworkPacketInterceptor1107 networkPacketInterceptor1107 = NetworkPacketInterceptor1107.Q(ObjectValidator.Y(), kg2.l(), adaptiveConfigurationManager, reflectionUtilityBroker);
            ApplicationLifecycleManager.e(networkPacketInterceptor1107);
            ConfigurationRegistry.s.H(true);
        } else {
            ConfigurationRegistry.s.Z();
        }
    }

    public SecureDataDispatcher() {
        long l = b ^ 0x6F580FEC7222L;
        super(a.cs((int)SecureDataDispatcher.a("n", (int)25554, (long)(0x59B2BCD045837E06L ^ l))), (int)SecureDataDispatcher.a("n", (int)26366, (long)(0x647E749B01A8FB28L ^ l)), RecursiveNodeGraph.V, "Allows you to break beds through walls\n\u00a7cWarning: This behavior is normally impossible and may be detected on servers");
        this.r = new CopyOnWriteArrayList<GeometricCoordinateCalculator>();
        this.n = new HashMap();
    }

    public void r(ConfigurationOrchestrator configurationOrchestrator) {
        this.T = configurationOrchestrator;
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

    @Override
    public void W() {
        ConnectionConfigurationResolver connectionConfigurationResolver;
        SystemConfigurationOrchestrator systemConfigurationOrchestrator;
        long l;
        block27: {
            l = b ^ 0x7131C42EC409L;
            systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
            connectionConfigurationResolver = ApplicationLifecycleManager.c();
            try {
                try {
                    if (!connectionConfigurationResolver.Y() && connectionConfigurationResolver.equals(this.N)) break block27;
                }
                catch (CustomSystemException customSystemException) {
                    throw SecureDataDispatcher.a(customSystemException);
                }
                this.r.clear();
            }
            catch (CustomSystemException customSystemException) {
                throw SecureDataDispatcher.a(customSystemException);
            }
        }
        int n = 100;
        for (int i = -n; i < n; ++i) {
            block23: for (int j = -n; j < n; ++j) {
                int n2 = 0;
                block24: while (true) {
                    int n3;
                    block29: {
                        block28: {
                            try {
                                try {
                                    if (n2 == -1) continue block23;
                                    if (n2 != 0) break block28;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw SecureDataDispatcher.a(customSystemException);
                                }
                                n3 = 1;
                                break block29;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SecureDataDispatcher.a(customSystemException);
                            }
                        }
                        n3 = -1;
                    }
                    n2 = n3;
                    int n4 = 0;
                    while (true) {
                        block32: {
                            TransactionCorrelationEngine transactionCorrelationEngine;
                            int n5;
                            int n6;
                            int n7;
                            block31: {
                                block30: {
                                    if (n4 >= 20) continue block24;
                                    for (GeometricCoordinateCalculator geometricCoordinateCalculator : this.r) {
                                        try {
                                            if (!this.n.containsKey(geometricCoordinateCalculator)) continue;
                                            ConfigurationOrchestrator.M(this.n.get(geometricCoordinateCalculator));
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw SecureDataDispatcher.a(customSystemException);
                                        }
                                    }
                                    try {
                                        try {
                                            if (!systemConfigurationOrchestrator.Y() && !connectionConfigurationResolver.Y()) break block30;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw SecureDataDispatcher.a(customSystemException);
                                        }
                                        return;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw SecureDataDispatcher.a(customSystemException);
                                    }
                                }
                                int n8 = n4 * n2;
                                n7 = (int)systemConfigurationOrchestrator.F() + i;
                                n6 = (int)systemConfigurationOrchestrator.V() + n8;
                                n5 = (int)systemConfigurationOrchestrator.B() + j;
                                transactionCorrelationEngine = connectionConfigurationResolver.N(n7, n6, n5);
                                int n9 = TransactionCorrelationEngine.h(transactionCorrelationEngine);
                                String string = transactionCorrelationEngine.s();
                                try {
                                    try {
                                        if (n9 == 26) break block31;
                                        if (string == null) break block32;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw SecureDataDispatcher.a(customSystemException);
                                    }
                                    if (!string.matches((String)((Object)SecureDataDispatcher.c("l", (int)SecureDataDispatcher.a("n", (int)663, (long)(0x8FD41C368A4A96BL ^ l)), (long)7045053731400233265L, (long)l)))) break block32;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw SecureDataDispatcher.a(customSystemException);
                                }
                            }
                            GeometricCoordinateCalculator geometricCoordinateCalculator = new GeometricCoordinateCalculator(n7, n6, n5);
                            EventDispatchCoordinator559 eventDispatchCoordinator559 = new EventDispatchCoordinator559(transactionCorrelationEngine);
                            boolean bl = eventDispatchCoordinator559.N(connectionConfigurationResolver, n7, n6, n5);
                            try {
                                try {
                                    if (this.r.contains(geometricCoordinateCalculator) || bl) break block32;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw SecureDataDispatcher.a(customSystemException);
                                }
                                this.r.add(geometricCoordinateCalculator);
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SecureDataDispatcher.a(customSystemException);
                            }
                        }
                        ++n4;
                    }
                    break;
                }
            }
        }
        this.N = connectionConfigurationResolver;
    }

    private static Method d(long l, long l2) {
        int n = SecureDataDispatcher.a(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = SecureDataDispatcher.l[n];
                int n3 = string2.indexOf(8);
                clazz3 = SecureDataDispatcher.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = SecureDataDispatcher.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = SecureDataDispatcher.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        SecureDataDispatcher.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = SecureDataDispatcher.b(270778569113894L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = SecureDataDispatcher.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        SecureDataDispatcher.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = SecureDataDispatcher.b(270778569113894L, 0L);
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AO" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = SecureDataDispatcher.a(l, l2);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                SecureDataDispatcher.j[n] = clazz = Class.forName(SecureDataDispatcher.l[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                SecureDataDispatcher.b = MultiContainerRegistry.a(6423354528279368305L, -2465284887211802398L, MethodHandles.lookup().lookupClass()).a(242964104287394L);
                SecureDataDispatcher.j = new Object[5];
                SecureDataDispatcher.l = new String[5];
                SecureDataDispatcher.a();
                SecureDataDispatcher.h = new HashMap<K, V>(13);
                var0 = SecureDataDispatcher.b ^ 37754797698391L;
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
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "a\u00d2=\u00a8-\u00d0dn7(\u00a4r&\u001b\u00e3\u0005";
                var7_6 = "a\u00d2=\u00a8-\u00d0dn7(\u00a4r&\u001b\u00e3\u0005".length();
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
                    var6_5 = "\u00aeL\u00cd\u00c6<U\u0087\u0095\u00e9;y\u00f2\u0081\u001f\u00f4[";
                    var7_6 = "\u00aeL\u00cd\u00c6<U\u0087\u0095\u00e9;y\u00f2\u0081\u001f\u00f4[".length();
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
        SecureDataDispatcher.d = var8_3;
        SecureDataDispatcher.e = new Integer[4];
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = SecureDataDispatcher.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = SecureDataDispatcher.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = j;
        j[0] = "mV\n";
        objectArray[1] = Integer.TYPE;
        SecureDataDispatcher.l[1] = "java/lang/Integer";
        objectArray[2] = ";s\u0005({y0|\u0014g\u0006a#{\u001d.";
        objectArray[3] = "\\''@^xW(6\u000f?v\\#2U";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "%\u0012uO?3\"W{ e)\u001eT4Q3n`\r4\u001frR$UpO`>\u007f\u0002kA\u000e";
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(SecureDataDispatcher.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(SecureDataDispatcher.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

