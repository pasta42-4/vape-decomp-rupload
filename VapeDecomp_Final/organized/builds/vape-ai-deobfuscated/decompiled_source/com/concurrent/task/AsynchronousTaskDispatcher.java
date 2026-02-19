/*
 * Decompiled with CFR 0.152.
 */
package com.concurrent.task;

import a.a;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.app.transaction.TransactionValidator2680;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.configuration.management.ConfigurationParameterController;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.graph.structure.RecursiveNodeGraph;
import com.math.geometry.GeometryCalculator;
import com.metrics.analysis.DimensionalMetricsTracker;
import com.network.configuration.NetworkConfigManager;
import com.network.protocol.ProtocolInteractionController;
import com.output.processing.OutputEncoder;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.runtime.context.LightweightExecutionContext;
import com.security.crypto.CryptographicCipherProvider;
import com.security.cryptography.CryptoKeyManagementSystem;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.monitoring.RuntimeResourceTracker;
import com.system.resource.AssetLoadBalancer;
import com.temporal.metadata.TemporalMetadataResolver;
import com.util.numeric.NumericFormattingUtility;
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
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class AsynchronousTaskDispatcher
extends ContextualExecutionFramework
implements TransactionValidator2680 {
    private final AuthenticationStateTracker K;
    private static final Object[] x;
    private final AuthenticationStateTracker t;
    private String[] b;
    private final NumericFormattingUtility w;
    private static final Map r;
    private static final long[] j;
    private String[] G;
    private Object F;
    private boolean Y;
    private static final String[] A;
    private AssetLoadBalancer z;
    private static final long d;
    private final AuthenticationStateTracker o;
    private final AuthenticationStateTracker T;
    private final AuthenticationStateTracker P;
    private boolean R;
    private final NetworkConfigManager h;
    private final NetworkConfigManager B;
    private String[] l;
    private String[] e;
    private final CryptographicCipherProvider v;
    private final Queue<DimensionalMetricsTracker> n;
    private static final Integer[] m;

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = AsynchronousTaskDispatcher.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = x;
        x[0] = "gu\b";
        objectArray[1] = Integer.TYPE;
        AsynchronousTaskDispatcher.A[1] = "java/lang/Integer";
        objectArray[2] = "S\u000en\"OQX\u0001\u007fm2IK\u0006v$";
        objectArray[3] = "OP84\b\u0014D_){i\u001aOT-!";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "?! ^cNa#$!eI_x}\u0018>\b09%\u001112f$<\u0018qH8> G\u000e";
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x68AA;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = j[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])r.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    r.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Am", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AsynchronousTaskDispatcher.m[n2] = n3;
        }
        return m[n2];
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 't' || c == '\u00c2' || c == '\u00e1' || c == '\u00f8') {
                field = AsynchronousTaskDispatcher.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 't' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c2' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = AsynchronousTaskDispatcher.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fd' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00aa' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Am" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private int e(LightweightExecutionContext lightweightExecutionContext) {
        ConfigurationParameterController configurationParameterController = TemporalMetadataResolver.h.x().V(lightweightExecutionContext);
        for (String string : this.l) {
            try {
                if (!configurationParameterController.Z().toLowerCase().contains(string)) continue;
                return 8;
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousTaskDispatcher.a(customSystemException);
            }
        }
        for (String string : this.b) {
            try {
                if (!configurationParameterController.Z().toLowerCase().contains(string)) continue;
                return 7;
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousTaskDispatcher.a(customSystemException);
            }
        }
        for (String string : this.e) {
            try {
                if (!configurationParameterController.Z().toLowerCase().contains(string)) continue;
                return 6;
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousTaskDispatcher.a(customSystemException);
            }
        }
        for (String string : this.G) {
            try {
                if (!configurationParameterController.Z().toLowerCase().contains(string)) continue;
                return 5;
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousTaskDispatcher.a(customSystemException);
            }
        }
        return -1;
    }

    private static Field c(long l, long l2) {
        int n = AsynchronousTaskDispatcher.a(l, l2);
        Object object = x[n];
        if (object instanceof String) {
            String string = A[n];
            int n2 = string.indexOf(8);
            Class clazz = AsynchronousTaskDispatcher.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = AsynchronousTaskDispatcher.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = AsynchronousTaskDispatcher.a(clazz3, string2, clazz2)) != null) {
                    AsynchronousTaskDispatcher.x[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = AsynchronousTaskDispatcher.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        AsynchronousTaskDispatcher.x[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = AsynchronousTaskDispatcher.b(230017677497337L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private double f(LightweightExecutionContext lightweightExecutionContext) {
        double d2;
        block8: {
            d2 = RuntimeResourceTracker.i(lightweightExecutionContext);
            if (GameVersionEnumerator.MC_1_16_5.H()) {
                // empty if block
            }
            if (lightweightExecutionContext.r()) {
                ProtocolInteractionController protocolInteractionController = lightweightExecutionContext.C();
                try {
                    try {
                        try {
                            if (!protocolInteractionController.r() || !RuntimeResourceTracker.l(protocolInteractionController)) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AsynchronousTaskDispatcher.a(customSystemException);
                        }
                        if (!RuntimeResourceTracker.C(lightweightExecutionContext)) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AsynchronousTaskDispatcher.a(customSystemException);
                    }
                    if (RuntimeResourceTracker.q(lightweightExecutionContext) != 0) break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousTaskDispatcher.a(customSystemException);
                }
                d2 -= 0.01;
            }
        }
        return d2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Am" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                AsynchronousTaskDispatcher.d = MultiContainerRegistry.a(5107640229553995144L, -1130821918899776010L, MethodHandles.lookup().lookupClass()).a(35122103343976L);
                AsynchronousTaskDispatcher.x = new Object[5];
                AsynchronousTaskDispatcher.A = new String[5];
                AsynchronousTaskDispatcher.a();
                AsynchronousTaskDispatcher.r = new HashMap<K, V>(13);
                var0 = AsynchronousTaskDispatcher.d ^ 5723953033141L;
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
                var8_3 = new long[23];
                var5_4 = 0;
                var6_5 = "\u001f\u0084\u009c\u00ec\u00c2s\u0012\u00c2\u00a4\u0093:n\u00e4\u00c5.F\u008cT\u0093\u00f9\u00baM\u001bF\u0096\u00d4\u00dd\u00b3\u0011\u00b2\u00a5\u00ba<\u00a4\u00e7#H\u00a2\u00b1\u00b5\u00fbul\u0013\u00fe^U\u00e4\u00d1\u00f1\u00f2d\u001e\u00b8)\u00b7D\u00e4\u009eG\u00b0\u00ff\u00eai7P\u0095\u008cXd\u00f1\u00ea\u00e1\u00aa\u0088crj\u0098\u0086FB^\u00d2\u00b6\u0082\u00f8\u00e4\u00f0E`\u00b8\u0001J\u008cB\u00a0\u0010\u00beT\u000e\u00cb\u00e5\u001enwo\u0089\u008d*\u00f9a\u00b2\u00ac\u00e0\u00e9(\u0007\u008c\u00c4\u00e2\u00e0\u0018\u00eb\u00f32\u00d9\u00fa\u00bc\u009f\u00ff\u0091~\u00f8;?\u000fnTq\u00c7<\u00ae\u0010\u00fa\n\u00d3\u00fa/\u0005\u00f36u\u00ec\u008a\u00deG:xrQ\u0011\u00bc\u00e0\u0086\u00ef\u00e3g";
                var7_6 = "\u001f\u0084\u009c\u00ec\u00c2s\u0012\u00c2\u00a4\u0093:n\u00e4\u00c5.F\u008cT\u0093\u00f9\u00baM\u001bF\u0096\u00d4\u00dd\u00b3\u0011\u00b2\u00a5\u00ba<\u00a4\u00e7#H\u00a2\u00b1\u00b5\u00fbul\u0013\u00fe^U\u00e4\u00d1\u00f1\u00f2d\u001e\u00b8)\u00b7D\u00e4\u009eG\u00b0\u00ff\u00eai7P\u0095\u008cXd\u00f1\u00ea\u00e1\u00aa\u0088crj\u0098\u0086FB^\u00d2\u00b6\u0082\u00f8\u00e4\u00f0E`\u00b8\u0001J\u008cB\u00a0\u0010\u00beT\u000e\u00cb\u00e5\u001enwo\u0089\u008d*\u00f9a\u00b2\u00ac\u00e0\u00e9(\u0007\u008c\u00c4\u00e2\u00e0\u0018\u00eb\u00f32\u00d9\u00fa\u00bc\u009f\u00ff\u0091~\u00f8;?\u000fnTq\u00c7<\u00ae\u0010\u00fa\n\u00d3\u00fa/\u0005\u00f36u\u00ec\u008a\u00deG:xrQ\u0011\u00bc\u00e0\u0086\u00ef\u00e3g".length();
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
                    var6_5 = "A\u00c9rF\u00d3\u00f4\u001d\u00f4\u00a2\u00dfr+\u00e8\u00b1\u00ce]";
                    var7_6 = "A\u00c9rF\u00d3\u00f4\u001d\u00f4\u00a2\u00dfr+\u00e8\u00b1\u00ce]".length();
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
        AsynchronousTaskDispatcher.j = var8_3;
        AsynchronousTaskDispatcher.m = new Integer[23];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = AsynchronousTaskDispatcher.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = AsynchronousTaskDispatcher.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = AsynchronousTaskDispatcher.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private int k(int n, boolean bl) {
        int n2 = -1;
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        LightweightExecutionContext lightweightExecutionContext = systemConfigurationOrchestrator.t().T(n).y();
        double d2 = 0.0;
        double d3 = 999.0;
        if (lightweightExecutionContext.r()) {
            d2 = this.f(lightweightExecutionContext);
            d3 = this.d(n);
        }
        double d4 = d2;
        double d5 = d3;
        int n3 = 9;
        while (true) {
            block12: {
                try {
                    if (n3 >= 45) break;
                    if (!systemConfigurationOrchestrator.t().T(n3).y().r()) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousTaskDispatcher.a(customSystemException);
                }
                LightweightExecutionContext lightweightExecutionContext2 = systemConfigurationOrchestrator.t().T(n3).y();
                try {
                    if (this.e(lightweightExecutionContext2) == -1 || this.e(lightweightExecutionContext2) != n) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousTaskDispatcher.a(customSystemException);
                }
                double d6 = this.f(lightweightExecutionContext2);
                double d7 = this.d(n3);
                if (d6 > d4) {
                    d4 = d6;
                    n2 = n3;
                    d5 = d7;
                } else {
                    try {
                        try {
                            if (!bl || d6 != d4) break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AsynchronousTaskDispatcher.a(customSystemException);
                        }
                        if (!(d7 < d5)) break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AsynchronousTaskDispatcher.a(customSystemException);
                    }
                    d5 = d7;
                    n2 = n3;
                }
            }
            ++n3;
        }
        return n2;
    }

    private int d(int n) {
        int n2;
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        try {
            n2 = systemConfigurationOrchestrator.t().T(n).y().r() ? systemConfigurationOrchestrator.t().T(n).y().b() : 999;
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousTaskDispatcher.a(customSystemException);
        }
        return n2;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = AsynchronousTaskDispatcher.a(l, l2);
            object = x[n];
            try {
                if (!(object instanceof String)) break block2;
                AsynchronousTaskDispatcher.x[n] = clazz = Class.forName(A[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(long l, long l2) {
        int n = AsynchronousTaskDispatcher.a(l, l2);
        Object object = x[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = A[n];
                int n3 = string2.indexOf(8);
                clazz3 = AsynchronousTaskDispatcher.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = AsynchronousTaskDispatcher.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = AsynchronousTaskDispatcher.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        AsynchronousTaskDispatcher.x[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = AsynchronousTaskDispatcher.b(230017677497337L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = AsynchronousTaskDispatcher.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        AsynchronousTaskDispatcher.x[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = AsynchronousTaskDispatcher.b(230017677497337L, 0L);
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

    @Override
    public String t() {
        block4: {
            long l = d ^ 0x6983D1F3AC1DL;
            try {
                try {
                    if (!this.T.s().booleanValue() || !this.v.b()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousTaskDispatcher.a(customSystemException);
                }
                return DynamicContextBroker.u + (String)((Object)AsynchronousTaskDispatcher.c("\u00aa", (int)AsynchronousTaskDispatcher.a("e", (int)14323, (long)(0x69EC5DB4A7833391L ^ l)), (long)-1386225332723679463L, (long)l));
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousTaskDispatcher.a(customSystemException);
            }
        }
        return super.t();
    }

    private void y(int n, int n2, int n3, int n4) {
        this.n.add(new DimensionalMetricsTracker(n, n2, n3, n4));
    }

    public AsynchronousTaskDispatcher() {
        long l = d ^ 0x5118B918375AL;
        super(a.cs((int)AsynchronousTaskDispatcher.a("e", (int)10283, (long)(0x78C0A75739943715L ^ l))), (int)AsynchronousTaskDispatcher.a("e", (int)29198, (long)(0x4399F1CDE2696D26L ^ l)), RecursiveNodeGraph.W, a.cs((int)AsynchronousTaskDispatcher.a("e", (int)24830, (long)(0x1968936313D87FD9L ^ l))));
        this.o = AuthenticationStateTracker.R(this, (String)((Object)AsynchronousTaskDispatcher.c("\u00aa", (int)AsynchronousTaskDispatcher.a("e", (int)31715, (long)(0x2EB4F0E11ECC64D8L ^ l)), (long)8612039160354628702L, (long)l)), true, (String)((Object)AsynchronousTaskDispatcher.c("\u00aa", (int)AsynchronousTaskDispatcher.a("e", (int)14442, (long)(0x1017F7CBD534A748L ^ l)), (long)8612039160354628702L, (long)l)));
        this.K = AuthenticationStateTracker.R(this, (String)((Object)AsynchronousTaskDispatcher.c("\u00aa", (int)AsynchronousTaskDispatcher.a("e", (int)8498, (long)(0x7071F8147DC93E13L ^ l)), (long)8612039160354628702L, (long)l)), true, (String)((Object)AsynchronousTaskDispatcher.c("\u00aa", (int)AsynchronousTaskDispatcher.a("e", (int)14846, (long)(0x5679F5129883A6D2L ^ l)), (long)8612039160354628702L, (long)l)));
        this.P = AuthenticationStateTracker.R(this, (String)((Object)AsynchronousTaskDispatcher.c("\u00aa", (int)AsynchronousTaskDispatcher.a("e", (int)31890, (long)(0x712B1241CBE263AFL ^ l)), (long)8612039160354628702L, (long)l)), true, (String)((Object)AsynchronousTaskDispatcher.c("\u00aa", (int)AsynchronousTaskDispatcher.a("e", (int)23058, (long)(0x75643CBAE5C536L ^ l)), (long)8612039160354628702L, (long)l)));
        this.t = AuthenticationStateTracker.R(this, (String)((Object)AsynchronousTaskDispatcher.c("\u00aa", (int)AsynchronousTaskDispatcher.a("e", (int)1492, (long)(0x3D692B5501E29AF4L ^ l)), (long)8612039160354628702L, (long)l)), false, (String)((Object)AsynchronousTaskDispatcher.c("\u00aa", (int)AsynchronousTaskDispatcher.a("e", (int)6792, (long)(0x7754CBEC1D3705A2L ^ l)), (long)8612039160354628702L, (long)l)));
        this.T = AuthenticationStateTracker.R(this, (String)((Object)AsynchronousTaskDispatcher.c("\u00aa", (int)AsynchronousTaskDispatcher.a("e", (int)774, (long)(0x4FF6A61BA1FE1C20L ^ l)), (long)8612039160354628702L, (long)l)), false, (String)((Object)AsynchronousTaskDispatcher.c("\u00aa", (int)AsynchronousTaskDispatcher.a("e", (int)24864, (long)(0x29A5AA9CC31BFE1AL ^ l)), (long)8612039160354628702L, (long)l)));
        this.w = NumericFormattingUtility.y(this, (String)((Object)AsynchronousTaskDispatcher.c("\u00aa", (int)AsynchronousTaskDispatcher.a("e", (int)21383, (long)(0x6ED68FCA9912CCA9L ^ l)), (long)8612039160354628702L, (long)l)), (String)((Object)AsynchronousTaskDispatcher.c("\u00aa", (int)AsynchronousTaskDispatcher.a("e", (int)4335, (long)(0x1DE47A94BA730FC2L ^ l)), (long)8612039160354628702L, (long)l)), "", 1.0, 100.0, 120.0, 200.0, 1.0);
        this.B = new NetworkConfigManager();
        this.h = new NetworkConfigManager();
        this.v = new CryptographicCipherProvider(20);
        this.n = new ConcurrentLinkedQueue<DimensionalMetricsTracker>();
        this.N(this.o, this.K, this.P, this.t, this.T, this.w);
        this.G = new String[]{AsynchronousTaskDispatcher.c("\u00aa", (int)AsynchronousTaskDispatcher.a("e", (int)30623, (long)(0x37ED47C934D968B0L ^ l)), (long)8612039160354628702L, (long)l), AsynchronousTaskDispatcher.c("\u00aa", (int)AsynchronousTaskDispatcher.a("e", (int)2243, (long)(0x15A97C16C5B097EAL ^ l)), (long)8612039160354628702L, (long)l)};
        this.e = new String[]{AsynchronousTaskDispatcher.c("\u00aa", (int)AsynchronousTaskDispatcher.a("e", (int)21470, (long)(0x2F8F2E54DC4FCCF5L ^ l)), (long)8612039160354628702L, (long)l), AsynchronousTaskDispatcher.c("\u00aa", (int)AsynchronousTaskDispatcher.a("e", (int)11341, (long)(0x6056707C5C8D336EL ^ l)), (long)8612039160354628702L, (long)l)};
        this.b = new String[]{AsynchronousTaskDispatcher.c("\u00aa", (int)AsynchronousTaskDispatcher.a("e", (int)8670, (long)(0xDB3475BB85A3EE2L ^ l)), (long)8612039160354628702L, (long)l), AsynchronousTaskDispatcher.c("\u00aa", (int)AsynchronousTaskDispatcher.a("e", (int)1170, (long)(0x17AB18A1A95C9BADL ^ l)), (long)8612039160354628702L, (long)l)};
        this.l = new String[]{AsynchronousTaskDispatcher.c("\u00aa", (int)AsynchronousTaskDispatcher.a("e", (int)14456, (long)(0x3795C68761912741L ^ l)), (long)8612039160354628702L, (long)l)};
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

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = AsynchronousTaskDispatcher.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = AsynchronousTaskDispatcher.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (A[n4] != null) {
            return n4;
        }
        Object object = x[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 3;
                break;
            }
            case 1: {
                n3 = 53;
                break;
            }
            case 2: {
                n3 = 6;
                break;
            }
            case 3: {
                n3 = 0;
                break;
            }
            case 4: {
                n3 = 17;
                break;
            }
            case 5: {
                n3 = 43;
                break;
            }
            case 6: {
                n3 = 33;
                break;
            }
            case 7: {
                n3 = 8;
                break;
            }
            case 8: {
                n3 = 55;
                break;
            }
            case 9: {
                n3 = 51;
                break;
            }
            case 10: {
                n3 = 31;
                break;
            }
            case 11: {
                n3 = 21;
                break;
            }
            case 12: {
                n3 = 52;
                break;
            }
            case 13: {
                n3 = 34;
                break;
            }
            case 14: {
                n3 = 22;
                break;
            }
            case 15: {
                n3 = 11;
                break;
            }
            case 16: {
                n3 = 14;
                break;
            }
            case 17: {
                n3 = 26;
                break;
            }
            case 18: {
                n3 = 29;
                break;
            }
            case 19: {
                n3 = 40;
                break;
            }
            case 20: {
                n3 = 10;
                break;
            }
            case 21: {
                n3 = 57;
                break;
            }
            case 22: {
                n3 = 38;
                break;
            }
            case 23: {
                n3 = 19;
                break;
            }
            case 24: {
                n3 = 58;
                break;
            }
            case 25: {
                n3 = 32;
                break;
            }
            case 26: {
                n3 = 16;
                break;
            }
            case 27: {
                n3 = 5;
                break;
            }
            case 28: {
                n3 = 20;
                break;
            }
            case 29: {
                n3 = 18;
                break;
            }
            case 30: {
                n3 = 63;
                break;
            }
            case 31: {
                n3 = 30;
                break;
            }
            case 32: {
                n3 = 9;
                break;
            }
            case 33: {
                n3 = 2;
                break;
            }
            case 34: {
                n3 = 27;
                break;
            }
            case 35: {
                n3 = 56;
                break;
            }
            case 36: {
                n3 = 48;
                break;
            }
            case 37: {
                n3 = 42;
                break;
            }
            case 38: {
                n3 = 24;
                break;
            }
            case 39: {
                n3 = 59;
                break;
            }
            case 40: {
                n3 = 4;
                break;
            }
            case 41: {
                n3 = 60;
                break;
            }
            case 42: {
                n3 = 46;
                break;
            }
            case 43: {
                n3 = 62;
                break;
            }
            case 44: {
                n3 = 54;
                break;
            }
            case 45: {
                n3 = 15;
                break;
            }
            case 46: {
                n3 = 13;
                break;
            }
            case 47: {
                n3 = 7;
                break;
            }
            case 48: {
                n3 = 50;
                break;
            }
            case 49: {
                n3 = 12;
                break;
            }
            case 50: {
                n3 = 36;
                break;
            }
            case 51: {
                n3 = 49;
                break;
            }
            case 52: {
                n3 = 1;
                break;
            }
            case 53: {
                n3 = 35;
                break;
            }
            case 54: {
                n3 = 61;
                break;
            }
            case 55: {
                n3 = 45;
                break;
            }
            case 56: {
                n3 = 41;
                break;
            }
            case 57: {
                n3 = 23;
                break;
            }
            case 58: {
                n3 = 44;
                break;
            }
            case 59: {
                n3 = 47;
                break;
            }
            case 60: {
                n3 = 25;
                break;
            }
            case 61: {
                n3 = 39;
                break;
            }
            case 62: {
                n3 = 28;
                break;
            }
            default: {
                n3 = 37;
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
        AsynchronousTaskDispatcher.A[n4] = new String(cArray);
        return n4;
    }

    @Override
    public void v() {
        super.v();
        this.Y = false;
        this.R = false;
    }

    @Override
    public boolean I() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.Z() || this.n.size() <= 0) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AsynchronousTaskDispatcher.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousTaskDispatcher.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @DataExchangeProtocol2090
    public void A(CryptoKeyManagementSystem cryptoKeyManagementSystem) {
        block65: {
            SystemConfigurationOrchestrator systemConfigurationOrchestrator;
            block58: {
                block56: {
                    block57: {
                        block54: {
                            block55: {
                                block53: {
                                    block52: {
                                        block51: {
                                            block50: {
                                                try {
                                                    try {
                                                        if (!TemporalMetadataResolver.h.U().Z(AsynchronousTaskDispatcher.class) && !TemporalMetadataResolver.h.a().p()) break block50;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw AsynchronousTaskDispatcher.a(customSystemException);
                                                    }
                                                    this.n.clear();
                                                    return;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw AsynchronousTaskDispatcher.a(customSystemException);
                                                }
                                            }
                                            this.U();
                                            systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                                            try {
                                                try {
                                                    if (systemConfigurationOrchestrator.R().Y() || systemConfigurationOrchestrator.R().D() == 0) break block51;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw AsynchronousTaskDispatcher.a(customSystemException);
                                                }
                                                return;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw AsynchronousTaskDispatcher.a(customSystemException);
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (!this.o.s().booleanValue() || ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.FJ)) break block52;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw AsynchronousTaskDispatcher.a(customSystemException);
                                                }
                                                if (ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.Vf)) break block52;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw AsynchronousTaskDispatcher.a(customSystemException);
                                            }
                                            this.n.clear();
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw AsynchronousTaskDispatcher.a(customSystemException);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                if (!this.K.s().booleanValue() || ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.FJ)) break block53;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw AsynchronousTaskDispatcher.a(customSystemException);
                                            }
                                            if (ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.Vf)) break block53;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw AsynchronousTaskDispatcher.a(customSystemException);
                                        }
                                        this.n.clear();
                                        return;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw AsynchronousTaskDispatcher.a(customSystemException);
                                    }
                                }
                                try {
                                    if (!this.h.m(100L + (long)this.w.l())) {
                                        return;
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AsynchronousTaskDispatcher.a(customSystemException);
                                }
                                try {
                                    if (this.n.isEmpty()) break block54;
                                    if (!this.B.m((long)this.w.l())) break block55;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AsynchronousTaskDispatcher.a(customSystemException);
                                }
                                DimensionalMetricsTracker dimensionalMetricsTracker = this.n.poll();
                                dimensionalMetricsTracker.H();
                                this.B.m();
                            }
                            return;
                        }
                        try {
                            try {
                                if (!this.Y) break block56;
                                if (!ApplicationLifecycleManager.X().r()) break block57;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AsynchronousTaskDispatcher.a(customSystemException);
                            }
                            systemConfigurationOrchestrator.E();
                            this.R = false;
                            this.Y = false;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AsynchronousTaskDispatcher.a(customSystemException);
                        }
                    }
                    return;
                }
                try {
                    try {
                        if (!this.T.s().booleanValue()) break block58;
                        this.v.a(systemConfigurationOrchestrator);
                        if (!this.v.b()) break block58;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AsynchronousTaskDispatcher.a(customSystemException);
                    }
                    this.h.m();
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousTaskDispatcher.a(customSystemException);
                }
            }
            for (int i = 5; i < 9; ++i) {
                int n;
                block63: {
                    block64: {
                        block59: {
                            block60: {
                                block62: {
                                    ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192;
                                    block61: {
                                        n = this.k(i, this.P.s());
                                        try {
                                            try {
                                                try {
                                                    if (n == -1) continue;
                                                    if (!this.o.s().booleanValue()) break block59;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw AsynchronousTaskDispatcher.a(customSystemException);
                                                }
                                                if (ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.FJ)) break block59;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw AsynchronousTaskDispatcher.a(customSystemException);
                                            }
                                            if (!this.h.m(200L + (long)this.w.l())) break block60;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw AsynchronousTaskDispatcher.a(customSystemException);
                                        }
                                        connectionPoolOrchestrator1192 = ApplicationLifecycleManager.N().R();
                                        try {
                                            if (GeometryCalculator.C() < 35) break block61;
                                            OutputEncoder.p(connectionPoolOrchestrator1192);
                                            break block62;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw AsynchronousTaskDispatcher.a(customSystemException);
                                        }
                                    }
                                    OutputEncoder.f(connectionPoolOrchestrator1192, true);
                                    OutputEncoder.r(connectionPoolOrchestrator1192, false, false);
                                }
                                this.R = true;
                            }
                            return;
                        }
                        try {
                            try {
                                if (!systemConfigurationOrchestrator.t().T(n).y().r()) break block63;
                                if (!this.t.s().booleanValue()) break block64;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AsynchronousTaskDispatcher.a(customSystemException);
                            }
                            this.y(systemConfigurationOrchestrator.t().D(), i, 0, 0);
                            this.y(systemConfigurationOrchestrator.t().D(), -999, 0, 0);
                            break block63;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AsynchronousTaskDispatcher.a(customSystemException);
                        }
                    }
                    this.y(systemConfigurationOrchestrator.t().D(), i, 0, 1);
                }
                this.y(systemConfigurationOrchestrator.t().D(), n, 0, 1);
            }
            try {
                try {
                    if (!this.R || !this.n.isEmpty()) break block65;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousTaskDispatcher.a(customSystemException);
                }
                this.Y = true;
                this.h.m();
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousTaskDispatcher.a(customSystemException);
            }
        }
    }

    private void U() {
        Object object = ApplicationLifecycleManager.X().M();
        try {
            if (object != this.F) {
                this.h.m();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousTaskDispatcher.a(customSystemException);
        }
        this.F = object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AsynchronousTaskDispatcher.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(AsynchronousTaskDispatcher.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

