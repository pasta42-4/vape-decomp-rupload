/*
 * Decompiled with CFR 0.152.
 */
package com.financial.processing;

import a.Qh;
import a.oQ;
import com.collections.management.MultiContainerRegistry;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.synchronization.TransactionalDataSynchronizer;
import com.event.management.ContextualEventDispatcher;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.network.analysis.NetworkTrafficAnalyzer;
import com.network.connection.NetworkConnectionInitiator;
import com.network.core.NetworkConnectionOrchestrator;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.network.protocol.NetworkProtocolNegotiator;
import com.runtime.context.LightweightExecutionContext;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.security.context.SecurityContextManager2112;
import com.security.transform.CryptographicTransformer;
import com.structures.tree.RecursiveNodeTree;
import com.system.config.AdaptiveConfigurationManager;
import com.system.lifecycle.ObjectLifecycleTracker;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class TransactionCorrelationEngine
extends ObjectLifecycleTracker {
    private static final Map e;
    private static final String[] m;
    private static final long a;
    private static final long[] c;
    private static final Integer[] d;
    private static final Object[] k;

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ee' || c == 'L' || c == '\u00f0' || c == 'R') {
                field = TransactionCorrelationEngine.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ee' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'L' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = TransactionCorrelationEngine.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'w' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public NetworkConnectionOrchestrator X() {
        try {
            if (GameVersionEnumerator.u() >= 35) {
                return this.i();
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw TransactionCorrelationEngine.a(unsupportedOperationException);
        }
        return new NetworkConnectionOrchestrator(TransactionalDataSynchronizer.f(TransactionCorrelationEngine.U.u().dx, this.H));
    }

    public float W() {
        long l = a ^ 0x426E4D3988D1L;
        try {
            if (GeometryCalculator.C() >= 50) {
                throw new UnsupportedOperationException((String)((Object)TransactionCorrelationEngine.d("w", (int)TransactionCorrelationEngine.a("a", (int)24222, (long)(0x5A6A8EE8CE6EC087L ^ l)), (long)-7539465690852260748L, (long)l)));
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw TransactionCorrelationEngine.a(unsupportedOperationException);
        }
        return TransactionCorrelationEngine.U.u().dx.W(this.H);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static int h(TransactionCorrelationEngine transactionCorrelationEngine) {
        if (GeometryCalculator.C() >= 35) {
            Object object = TransactionalDataSynchronizer.f(TransactionCorrelationEngine.U.u().dx, transactionCorrelationEngine.M());
            return TransactionCorrelationEngine.U.u().dx.E(object);
        }
        return TransactionCorrelationEngine.U.u().dx.E(transactionCorrelationEngine.M());
    }

    public RecursiveNodeTree u() {
        try {
            if (GeometryCalculator.C() >= 50) {
                return null;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw TransactionCorrelationEngine.a(unsupportedOperationException);
        }
        try {
            if (GeometryCalculator.C() >= 35) {
                return new RecursiveNodeTree(TransactionalDataSynchronizer.E(TransactionCorrelationEngine.U.u().dx, this.H));
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw TransactionCorrelationEngine.a(unsupportedOperationException);
        }
        try {
            if (GeometryCalculator.C() >= 23) {
                return new RecursiveNodeTree(TransactionalDataSynchronizer.U(TransactionCorrelationEngine.U.u().dx, this.H, null));
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw TransactionCorrelationEngine.a(unsupportedOperationException);
        }
        return new RecursiveNodeTree(TransactionalDataSynchronizer.J(TransactionCorrelationEngine.U.u().dx, this.H));
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = TransactionCorrelationEngine.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = TransactionCorrelationEngine.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field g(long l, long l2) {
        int n = TransactionCorrelationEngine.e(l, l2);
        Object object = k[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = TransactionCorrelationEngine.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = TransactionCorrelationEngine.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = TransactionCorrelationEngine.c(clazz3, string2, clazz2)) != null) {
                    TransactionCorrelationEngine.k[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = TransactionCorrelationEngine.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        TransactionCorrelationEngine.k[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = TransactionCorrelationEngine.f(277390965857160L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x945;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
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
                throw new RuntimeException("a/Eh", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            TransactionCorrelationEngine.d[n2] = n3;
        }
        return d[n2];
    }

    public static boolean U(CryptographicTransformer cryptographicTransformer) {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                return TransactionalDataSynchronizer.C(TransactionCorrelationEngine.U.u().dx, cryptographicTransformer.M());
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw TransactionCorrelationEngine.a(unsupportedOperationException);
        }
        return true;
    }

    public int J(int n, int n2, int n3) {
        try {
            if (GeometryCalculator.C() >= 35) {
                TemporalMetadataResolver.k();
                return 0;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw TransactionCorrelationEngine.a(unsupportedOperationException);
        }
        try {
            if (GeometryCalculator.C() == 13) {
                return TransactionalDataSynchronizer.T(TransactionCorrelationEngine.U.u().dx, this.H, ApplicationLifecycleManager.c().M(), n, n2, n3);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw TransactionCorrelationEngine.a(unsupportedOperationException);
        }
        try {
            if (GeometryCalculator.C() == 15) {
                return TransactionalDataSynchronizer.V(TransactionCorrelationEngine.U.u().dx, this.H, ApplicationLifecycleManager.c().M(), ReflectionUtilityBroker.t(n, n2, n3).M());
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw TransactionCorrelationEngine.a(unsupportedOperationException);
        }
        try {
            if (GeometryCalculator.C() == 23) {
                return TransactionalDataSynchronizer.G(TransactionCorrelationEngine.U.u().dx, this.H, ApplicationLifecycleManager.c().T(ReflectionUtilityBroker.t(n, n2, n3)).M());
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw TransactionCorrelationEngine.a(unsupportedOperationException);
        }
        return 0;
    }

    private static Method h(long l, long l2) {
        int n = TransactionCorrelationEngine.e(l, l2);
        Object object = k[n];
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
                clazz3 = TransactionCorrelationEngine.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = TransactionCorrelationEngine.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = TransactionCorrelationEngine.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        TransactionCorrelationEngine.k[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = TransactionCorrelationEngine.f(277390965857160L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = TransactionCorrelationEngine.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        TransactionCorrelationEngine.k[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = TransactionCorrelationEngine.f(277390965857160L, 0L);
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

    public boolean y(NetworkConnectionOrchestrator networkConnectionOrchestrator) {
        try {
            if (GeometryCalculator.C() >= 35) {
                return TransactionCorrelationEngine.U.u().dx.z(this.H);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw TransactionCorrelationEngine.a(unsupportedOperationException);
        }
        try {
            if (GeometryCalculator.C() >= 23) {
                return TransactionCorrelationEngine.U.u().dx.k(this.H, networkConnectionOrchestrator.M());
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw TransactionCorrelationEngine.a(unsupportedOperationException);
        }
        return TransactionCorrelationEngine.U.u().dx.V(this.H);
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

    public boolean T(NetworkProtocolNegotiator networkProtocolNegotiator, ReflectionUtilityBroker reflectionUtilityBroker, NetworkConnectionOrchestrator networkConnectionOrchestrator, Qh qh, AdaptiveConfigurationManager adaptiveConfigurationManager, float f, float f2, float f3) {
        if (GeometryCalculator.C() >= 35) {
            NetworkPacketInterceptor1107 networkPacketInterceptor1107 = NetworkPacketInterceptor1107.Q(null, ContextualEventDispatcher.N(f, f2, f3), adaptiveConfigurationManager, reflectionUtilityBroker);
            Object object = TransactionalDataSynchronizer.R(TransactionCorrelationEngine.U.u().dx, this.H, ApplicationLifecycleManager.c().T(reflectionUtilityBroker).M(), networkProtocolNegotiator.M(), reflectionUtilityBroker.M(), qh.M(), adaptiveConfigurationManager.M(), networkPacketInterceptor1107.M());
            NetworkTrafficAnalyzer networkTrafficAnalyzer = new NetworkTrafficAnalyzer(object);
            return networkTrafficAnalyzer.equals(NetworkTrafficAnalyzer.L());
        }
        try {
            if (GeometryCalculator.C() >= 23) {
                return TransactionalDataSynchronizer.b(TransactionCorrelationEngine.U.u().dx, this.H, networkProtocolNegotiator.M(), reflectionUtilityBroker.M(), networkConnectionOrchestrator.M(), qh.M(), SecurityContextManager2112.R().M(), adaptiveConfigurationManager.M(), f, f2, f3);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw TransactionCorrelationEngine.a(unsupportedOperationException);
        }
        try {
            if (GeometryCalculator.C() > 13) {
                return TransactionalDataSynchronizer.T(TransactionCorrelationEngine.U.u().dx, this.H, networkProtocolNegotiator.M(), reflectionUtilityBroker.M(), networkConnectionOrchestrator.M(), qh.M(), adaptiveConfigurationManager.M(), f, f2, f3);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw TransactionCorrelationEngine.a(unsupportedOperationException);
        }
        return TransactionalDataSynchronizer.f(TransactionCorrelationEngine.U.u().dx, this.H, networkProtocolNegotiator.M(), reflectionUtilityBroker.o(), reflectionUtilityBroker.q(), reflectionUtilityBroker.j(), qh.M(), adaptiveConfigurationManager.p(), f, f2, f3);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n4] != null) {
            return n4;
        }
        Object object = k[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 42;
                break;
            }
            case 1: {
                n3 = 19;
                break;
            }
            case 2: {
                n3 = 32;
                break;
            }
            case 3: {
                n3 = 49;
                break;
            }
            case 4: {
                n3 = 3;
                break;
            }
            case 5: {
                n3 = 40;
                break;
            }
            case 6: {
                n3 = 0;
                break;
            }
            case 7: {
                n3 = 45;
                break;
            }
            case 8: {
                n3 = 36;
                break;
            }
            case 9: {
                n3 = 52;
                break;
            }
            case 10: {
                n3 = 38;
                break;
            }
            case 11: {
                n3 = 6;
                break;
            }
            case 12: {
                n3 = 9;
                break;
            }
            case 13: {
                n3 = 20;
                break;
            }
            case 14: {
                n3 = 22;
                break;
            }
            case 15: {
                n3 = 26;
                break;
            }
            case 16: {
                n3 = 46;
                break;
            }
            case 17: {
                n3 = 43;
                break;
            }
            case 18: {
                n3 = 44;
                break;
            }
            case 19: {
                n3 = 33;
                break;
            }
            case 20: {
                n3 = 51;
                break;
            }
            case 21: {
                n3 = 4;
                break;
            }
            case 22: {
                n3 = 8;
                break;
            }
            case 23: {
                n3 = 54;
                break;
            }
            case 24: {
                n3 = 23;
                break;
            }
            case 25: {
                n3 = 24;
                break;
            }
            case 26: {
                n3 = 47;
                break;
            }
            case 27: {
                n3 = 35;
                break;
            }
            case 28: {
                n3 = 50;
                break;
            }
            case 29: {
                n3 = 5;
                break;
            }
            case 30: {
                n3 = 17;
                break;
            }
            case 31: {
                n3 = 21;
                break;
            }
            case 32: {
                n3 = 1;
                break;
            }
            case 33: {
                n3 = 60;
                break;
            }
            case 34: {
                n3 = 10;
                break;
            }
            case 35: {
                n3 = 41;
                break;
            }
            case 36: {
                n3 = 39;
                break;
            }
            case 37: {
                n3 = 12;
                break;
            }
            case 38: {
                n3 = 48;
                break;
            }
            case 39: {
                n3 = 2;
                break;
            }
            case 40: {
                n3 = 55;
                break;
            }
            case 41: {
                n3 = 7;
                break;
            }
            case 42: {
                n3 = 15;
                break;
            }
            case 43: {
                n3 = 28;
                break;
            }
            case 44: {
                n3 = 53;
                break;
            }
            case 45: {
                n3 = 30;
                break;
            }
            case 46: {
                n3 = 57;
                break;
            }
            case 47: {
                n3 = 58;
                break;
            }
            case 48: {
                n3 = 62;
                break;
            }
            case 49: {
                n3 = 25;
                break;
            }
            case 50: {
                n3 = 56;
                break;
            }
            case 51: {
                n3 = 37;
                break;
            }
            case 52: {
                n3 = 63;
                break;
            }
            case 53: {
                n3 = 13;
                break;
            }
            case 54: {
                n3 = 61;
                break;
            }
            case 55: {
                n3 = 16;
                break;
            }
            case 56: {
                n3 = 59;
                break;
            }
            case 57: {
                n3 = 29;
                break;
            }
            case 58: {
                n3 = 14;
                break;
            }
            case 59: {
                n3 = 27;
                break;
            }
            case 60: {
                n3 = 31;
                break;
            }
            case 61: {
                n3 = 18;
                break;
            }
            case 62: {
                n3 = 34;
                break;
            }
            default: {
                n3 = 11;
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
        TransactionCorrelationEngine.m[n4] = new String(cArray);
        return n4;
    }

    public oQ P(NetworkConnectionOrchestrator networkConnectionOrchestrator, NetworkProtocolNegotiator networkProtocolNegotiator, ReflectionUtilityBroker reflectionUtilityBroker) {
        return new oQ(TransactionalDataSynchronizer.Q(TransactionCorrelationEngine.U.u().dx, this.H, networkConnectionOrchestrator.M(), networkProtocolNegotiator.M(), reflectionUtilityBroker.M()));
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Eh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public float r() {
        return TransactionalDataSynchronizer.T(TransactionCorrelationEngine.U.u().dx, this.H);
    }

    public oQ C(NetworkProtocolNegotiator networkProtocolNegotiator, int n, int n2, int n3) {
        return new oQ(TransactionalDataSynchronizer.a(TransactionCorrelationEngine.U.u().dx, this.H, networkProtocolNegotiator.M(), n, n2, n3));
    }

    public LightweightExecutionContext j(NetworkProtocolNegotiator networkProtocolNegotiator, ReflectionUtilityBroker reflectionUtilityBroker, NetworkConnectionOrchestrator networkConnectionOrchestrator) {
        return new LightweightExecutionContext(TransactionalDataSynchronizer.w(TransactionCorrelationEngine.U.u().dx, this.H, networkProtocolNegotiator.M(), reflectionUtilityBroker.M(), networkConnectionOrchestrator.M()));
    }

    public oQ T(NetworkProtocolNegotiator networkProtocolNegotiator, int n, int n2, int n3) {
        try {
            if (GeometryCalculator.C() >= 35) {
                TemporalMetadataResolver.k();
                return null;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw TransactionCorrelationEngine.a(unsupportedOperationException);
        }
        return new oQ(TransactionalDataSynchronizer.H(TransactionCorrelationEngine.U.u().dx, this.H, networkProtocolNegotiator.M(), n, n2, n3));
    }

    public int z() {
        return TransactionalDataSynchronizer.d(TransactionCorrelationEngine.U.u().dx, this.H);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = TransactionCorrelationEngine.e(l, l2);
            object = k[n];
            try {
                if (!(object instanceof String)) break block2;
                TransactionCorrelationEngine.k[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public String s() {
        return TransactionalDataSynchronizer.d(TransactionCorrelationEngine.U.u().dx, this.H);
    }

    public boolean N(NetworkConnectionOrchestrator networkConnectionOrchestrator) {
        try {
            if (GeometryCalculator.C() >= 35) {
                return TransactionCorrelationEngine.U.u().dx.z(this.H);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw TransactionCorrelationEngine.a(unsupportedOperationException);
        }
        try {
            if (GeometryCalculator.C() >= 23) {
                return TransactionCorrelationEngine.U.u().dx.h(this.H, networkConnectionOrchestrator.M());
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw TransactionCorrelationEngine.a(unsupportedOperationException);
        }
        return TransactionCorrelationEngine.U.u().dx.M(this.H);
    }

    public TransactionCorrelationEngine(Object object) {
        super(object);
    }

    public NetworkConnectionInitiator i() {
        return new NetworkConnectionInitiator(TransactionalDataSynchronizer.f(TransactionCorrelationEngine.U.u().dx, this.H));
    }

    public void F(NetworkProtocolNegotiator networkProtocolNegotiator, int n, int n2, int n3, CryptographicTransformer cryptographicTransformer) {
        TransactionalDataSynchronizer.D(TransactionCorrelationEngine.U.u().dx, this.H, networkProtocolNegotiator.M(), n, n2, n3, cryptographicTransformer.M());
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = TransactionCorrelationEngine.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = TransactionCorrelationEngine.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = k;
        k[0] = "{-N";
        objectArray[1] = Integer.TYPE;
        TransactionCorrelationEngine.m[1] = "java/lang/Integer";
        objectArray[2] = "u\u0011]\u00079@~\u001eLHDXm\u0019E\u0001";
        objectArray[3] = "\u0014g\u0012\u0005\u0002\u0011\u001fh\u0003Jc\u001f\u0014c\u0007\u0010";
        Object[] objectArray2 = objectArray;
        objectArray[4] = ";\u0014\u001d25dh\u0002KJobTAK*9'%\u0013N$f\u0019m\t\f!;i*B\u001f/\u0004";
    }

    public static TransactionCorrelationEngine Z(String string) {
        block11: {
            long l;
            block12: {
                l = a ^ 0x596461CE8A6BL;
                try {
                    if (GeometryCalculator.C() < 35) break block11;
                    if (string.startsWith((String)((Object)TransactionCorrelationEngine.d("w", (int)TransactionCorrelationEngine.a("a", (int)30917, (long)(0x5B3A80479146465L ^ l)), (long)-7645857709191428402L, (long)l)))) break block12;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw TransactionCorrelationEngine.a(unsupportedOperationException);
                }
                string = (String)((Object)TransactionCorrelationEngine.d("w", (int)TransactionCorrelationEngine.a("a", (int)17439, (long)(0x20247BC125D4D8BEL ^ l)), (long)-7645857709191428402L, (long)l)) + string;
            }
            Iterable iterable = (Iterable)TransactionalDataSynchronizer.I(TransactionCorrelationEngine.U.u().dx);
            for (Object t : iterable) {
                TransactionCorrelationEngine transactionCorrelationEngine = new TransactionCorrelationEngine(t);
                try {
                    if (transactionCorrelationEngine.s() == null) {
                        continue;
                    }
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw TransactionCorrelationEngine.a(unsupportedOperationException);
                }
                try {
                    if (!transactionCorrelationEngine.s().equalsIgnoreCase(string)) continue;
                    TemporalMetadataResolver.x((String)((Object)TransactionCorrelationEngine.d("w", (int)TransactionCorrelationEngine.a("a", (int)16643, (long)(0x10DDA8DC2A87DDA1L ^ l)), (long)-7645857709191428402L, (long)l)));
                    return transactionCorrelationEngine;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw TransactionCorrelationEngine.a(unsupportedOperationException);
                }
            }
            return null;
        }
        Object object = TransactionCorrelationEngine.U.u().dx.s(string);
        try {
            if (object == null) {
                return null;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw TransactionCorrelationEngine.a(unsupportedOperationException);
        }
        return new TransactionCorrelationEngine(object);
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Eh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = TransactionCorrelationEngine.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                TransactionCorrelationEngine.a = MultiContainerRegistry.a(4476206949627363277L, 5712620202233960894L, MethodHandles.lookup().lookupClass()).a(112032923417590L);
                TransactionCorrelationEngine.k = new Object[5];
                TransactionCorrelationEngine.m = new String[5];
                TransactionCorrelationEngine.a();
                TransactionCorrelationEngine.e = new HashMap<K, V>(13);
                var0 = TransactionCorrelationEngine.a ^ 102736532344496L;
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
                var6_5 = "<\u00ba+\u00a1jd\u00e1(\u009d\u00d4<\u00c3\u00daz\u00a4\u0018";
                var7_6 = "<\u00ba+\u00a1jd\u00e1(\u009d\u00d4<\u00c3\u00daz\u00a4\u0018".length();
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
                    var6_5 = "W\u00d6\u001cgf\u00f8\u00ad\u001f\u0011\u00f1[\u00ca\u001c\u008c\u00c4.";
                    var7_6 = "W\u00d6\u001cgf\u00f8\u00ad\u001f\u0011\u00f1[\u00ca\u001c\u008c\u00c4.".length();
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
        TransactionCorrelationEngine.c = var8_3;
        TransactionCorrelationEngine.d = new Integer[4];
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = TransactionCorrelationEngine.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public Boolean I(NetworkConnectionOrchestrator networkConnectionOrchestrator, boolean bl) {
        try {
            if (GeometryCalculator.C() >= 35) {
                return TransactionalDataSynchronizer.t(TransactionCorrelationEngine.U.u().dx, this.H);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw TransactionCorrelationEngine.a(unsupportedOperationException);
        }
        return TransactionCorrelationEngine.U.u().dx.K(this.H, networkConnectionOrchestrator, bl);
    }

    public void h(NetworkProtocolNegotiator networkProtocolNegotiator, CryptographicTransformer cryptographicTransformer) {
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                TransactionalDataSynchronizer.m(TransactionCorrelationEngine.U.u().dx, this.H, networkProtocolNegotiator.M(), cryptographicTransformer.M());
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw TransactionCorrelationEngine.a(unsupportedOperationException);
        }
    }

    public oQ l(NetworkProtocolNegotiator networkProtocolNegotiator, ReflectionUtilityBroker reflectionUtilityBroker) {
        return new oQ(TransactionalDataSynchronizer.E(TransactionCorrelationEngine.U.u().dx, this.H, networkProtocolNegotiator.M(), reflectionUtilityBroker.M()));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(TransactionCorrelationEngine.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(TransactionCorrelationEngine.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

