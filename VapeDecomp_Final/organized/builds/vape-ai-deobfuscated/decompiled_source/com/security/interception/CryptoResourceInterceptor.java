/*
 * Decompiled with CFR 0.152.
 */
package com.security.interception;

import a.a;
import a.oQ;
import com.app.entity.movement.EntityMovementController;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.event.propagation.EventPropagationDispatcher;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.numeric.precision.NumericPrecisionTransformer;
import com.physics.simulation.PhysicsPositionTracker;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.spatial.events.SpatialEventEmitter;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.pipeline.ObjectPipelineManager;
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

public class CryptoResourceInterceptor
extends ContextualExecutionFramework {
    private final NumericPrecisionTransformer l;
    private static final Integer[] e;
    private static final Map h;
    private final NumericPrecisionTransformer n;
    private static final String[] m;
    private static final long[] d;
    private static final Object[] j;
    private static final long b;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @DataExchangeProtocol2090
    public void a(PhysicsPositionTracker physicsPositionTracker) {
        double d2;
        SystemConfigurationOrchestrator systemConfigurationOrchestrator;
        block7: {
            block6: {
                double d3;
                systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                try {
                    d3 = DynamicContextBroker.e ? ((oQ)systemConfigurationOrchestrator.L()).c() : systemConfigurationOrchestrator.V();
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoResourceInterceptor.a(customSystemException);
                }
                double d4 = d3;
                try {
                    if (!ApplicationLifecycleManager.N().r().b()) break block6;
                    d2 = (Double)this.n.J();
                    break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoResourceInterceptor.a(customSystemException);
                }
            }
            try {
                d2 = ApplicationLifecycleManager.N().f().b() ? -((Double)this.n.J()).doubleValue() : 0.0;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoResourceInterceptor.a(customSystemException);
            }
        }
        double d5 = d2;
        physicsPositionTracker.setY(d5);
        systemConfigurationOrchestrator.z(d5);
        this.F(physicsPositionTracker, Math.max((Double)this.l.J(), this.L()));
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptoResourceInterceptor.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l, long l2) {
        int n = CryptoResourceInterceptor.a(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptoResourceInterceptor.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptoResourceInterceptor.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptoResourceInterceptor.a(clazz3, string2, clazz2)) != null) {
                    CryptoResourceInterceptor.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptoResourceInterceptor.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptoResourceInterceptor.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptoResourceInterceptor.b(279932146530515L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = CryptoResourceInterceptor.a(l, l2);
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
                String string2 = m[n];
                int n3 = string2.indexOf(8);
                clazz3 = CryptoResourceInterceptor.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptoResourceInterceptor.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptoResourceInterceptor.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptoResourceInterceptor.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptoResourceInterceptor.b(279932146530515L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptoResourceInterceptor.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptoResourceInterceptor.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptoResourceInterceptor.b(279932146530515L, 0L);
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

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7351;
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
                throw new RuntimeException("a/xk", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptoResourceInterceptor.e[n2] = n3;
        }
        return e[n2];
    }

    @Override
    public boolean j() {
        return true;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n4] != null) {
            return n4;
        }
        Object object = j[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 45;
                break;
            }
            case 1: {
                n3 = 60;
                break;
            }
            case 2: {
                n3 = 63;
                break;
            }
            case 3: {
                n3 = 16;
                break;
            }
            case 4: {
                n3 = 41;
                break;
            }
            case 5: {
                n3 = 32;
                break;
            }
            case 6: {
                n3 = 7;
                break;
            }
            case 7: {
                n3 = 38;
                break;
            }
            case 8: {
                n3 = 25;
                break;
            }
            case 9: {
                n3 = 37;
                break;
            }
            case 10: {
                n3 = 24;
                break;
            }
            case 11: {
                n3 = 27;
                break;
            }
            case 12: {
                n3 = 33;
                break;
            }
            case 13: {
                n3 = 18;
                break;
            }
            case 14: {
                n3 = 1;
                break;
            }
            case 15: {
                n3 = 8;
                break;
            }
            case 16: {
                n3 = 15;
                break;
            }
            case 17: {
                n3 = 55;
                break;
            }
            case 18: {
                n3 = 52;
                break;
            }
            case 19: {
                n3 = 54;
                break;
            }
            case 20: {
                n3 = 40;
                break;
            }
            case 21: {
                n3 = 0;
                break;
            }
            case 22: {
                n3 = 34;
                break;
            }
            case 23: {
                n3 = 61;
                break;
            }
            case 24: {
                n3 = 50;
                break;
            }
            case 25: {
                n3 = 49;
                break;
            }
            case 26: {
                n3 = 62;
                break;
            }
            case 27: {
                n3 = 21;
                break;
            }
            case 28: {
                n3 = 59;
                break;
            }
            case 29: {
                n3 = 22;
                break;
            }
            case 30: {
                n3 = 9;
                break;
            }
            case 31: {
                n3 = 51;
                break;
            }
            case 32: {
                n3 = 43;
                break;
            }
            case 33: {
                n3 = 11;
                break;
            }
            case 34: {
                n3 = 39;
                break;
            }
            case 35: {
                n3 = 56;
                break;
            }
            case 36: {
                n3 = 58;
                break;
            }
            case 37: {
                n3 = 29;
                break;
            }
            case 38: {
                n3 = 42;
                break;
            }
            case 39: {
                n3 = 20;
                break;
            }
            case 40: {
                n3 = 17;
                break;
            }
            case 41: {
                n3 = 28;
                break;
            }
            case 42: {
                n3 = 57;
                break;
            }
            case 43: {
                n3 = 26;
                break;
            }
            case 44: {
                n3 = 53;
                break;
            }
            case 45: {
                n3 = 12;
                break;
            }
            case 46: {
                n3 = 5;
                break;
            }
            case 47: {
                n3 = 35;
                break;
            }
            case 48: {
                n3 = 19;
                break;
            }
            case 49: {
                n3 = 47;
                break;
            }
            case 50: {
                n3 = 6;
                break;
            }
            case 51: {
                n3 = 3;
                break;
            }
            case 52: {
                n3 = 2;
                break;
            }
            case 53: {
                n3 = 23;
                break;
            }
            case 54: {
                n3 = 13;
                break;
            }
            case 55: {
                n3 = 48;
                break;
            }
            case 56: {
                n3 = 31;
                break;
            }
            case 57: {
                n3 = 44;
                break;
            }
            case 58: {
                n3 = 36;
                break;
            }
            case 59: {
                n3 = 10;
                break;
            }
            case 60: {
                n3 = 30;
                break;
            }
            case 61: {
                n3 = 4;
                break;
            }
            case 62: {
                n3 = 46;
                break;
            }
            default: {
                n3 = 14;
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
        CryptoResourceInterceptor.m[n4] = new String(cArray);
        return n4;
    }

    @Override
    public void h() {
        TemporalMetadataResolver.h.a().I(this);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptoResourceInterceptor.b = MultiContainerRegistry.a(-4852838398175438021L, 4611928928476315712L, MethodHandles.lookup().lookupClass()).a(200574001250305L);
                CryptoResourceInterceptor.j = new Object[5];
                CryptoResourceInterceptor.m = new String[5];
                CryptoResourceInterceptor.a();
                CryptoResourceInterceptor.h = new HashMap<K, V>(13);
                var0 = CryptoResourceInterceptor.b ^ 72639346128824L;
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
                var8_3 = new long[9];
                var5_4 = 0;
                var6_5 = "\u00acPY\u0083\u00ec\u00fd\u00a4D\u00f9\u0087\u00af\u0088\u00ba\u00e3I\u0014\u0083\u00feyd\u00a1\u00f8H\u00bb\u00ec$!@f\u00bc\"G}Z\u00dc\u00f0\u008d\u00e3\u00f5u\u001b\u0083\u00b7\u00d4!K\f\u00c4@gd\u00dd[\u00c4\u0012w";
                var7_6 = "\u00acPY\u0083\u00ec\u00fd\u00a4D\u00f9\u0087\u00af\u0088\u00ba\u00e3I\u0014\u0083\u00feyd\u00a1\u00f8H\u00bb\u00ec$!@f\u00bc\"G}Z\u00dc\u00f0\u008d\u00e3\u00f5u\u001b\u0083\u00b7\u00d4!K\f\u00c4@gd\u00dd[\u00c4\u0012w".length();
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
                    var6_5 = "F\u0086\u0001\u0005n,\u0019\u00e9>L\u00a2\u0002\u00e7~\u00bd\u00a3";
                    var7_6 = "F\u0086\u0001\u0005n,\u0019\u00e9>L\u00a2\u0002\u00e7~\u00bd\u00a3".length();
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
        CryptoResourceInterceptor.d = var8_3;
        CryptoResourceInterceptor.e = new Integer[9];
    }

    @DataExchangeProtocol2090
    public void h(EventPropagationDispatcher eventPropagationDispatcher) {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        EntityMovementController.setOnGround(false);
        systemConfigurationOrchestrator.W(false);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = CryptoResourceInterceptor.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptoResourceInterceptor.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
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
            if (c == 'L' || c == '\u00fc' || c == 'h' || c == 'A') {
                field = CryptoResourceInterceptor.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'L' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fc' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'h' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptoResourceInterceptor.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'i' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00a4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptoResourceInterceptor.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptoResourceInterceptor.a(l, l2);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptoResourceInterceptor.j[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void F(SpatialEventEmitter spatialEventEmitter, double d2) {
        block18: {
            float f;
            double d3;
            double d4;
            block19: {
                block23: {
                    int n;
                    float f2;
                    block25: {
                        block24: {
                            block20: {
                                int n2;
                                float f3;
                                block22: {
                                    block21: {
                                        block17: {
                                            SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                                            d4 = systemConfigurationOrchestrator.W().t();
                                            d3 = systemConfigurationOrchestrator.W().m();
                                            f = systemConfigurationOrchestrator.q();
                                            try {
                                                try {
                                                    if (d4 != 0.0 || d3 != 0.0) break block17;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CryptoResourceInterceptor.a(customSystemException);
                                                }
                                                spatialEventEmitter.setX(0.0).setZ(0.0);
                                                break block18;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptoResourceInterceptor.a(customSystemException);
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (d4 == 0.0) break block19;
                                                    if (!(d3 > 0.0)) break block20;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CryptoResourceInterceptor.a(customSystemException);
                                                }
                                                f3 = f;
                                                if (!(d4 > 0.0)) break block21;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptoResourceInterceptor.a(customSystemException);
                                            }
                                            n2 = -45;
                                            break block22;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptoResourceInterceptor.a(customSystemException);
                                        }
                                    }
                                    n2 = 45;
                                }
                                f = f3 + (float)n2;
                                break block23;
                            }
                            try {
                                try {
                                    if (!(d3 < 0.0)) break block23;
                                    f2 = f;
                                    if (!(d4 > 0.0)) break block24;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptoResourceInterceptor.a(customSystemException);
                                }
                                n = 45;
                                break block25;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoResourceInterceptor.a(customSystemException);
                            }
                        }
                        n = -45;
                    }
                    f = f2 + (float)n;
                }
                d3 = 0.0;
                if (d4 > 0.0) {
                    d4 = 1.0;
                } else if (d4 < 0.0) {
                    d4 = -1.0;
                }
            }
            spatialEventEmitter.setX(d4 * d2 * Math.cos(Math.toRadians(f + 90.0f)) + d3 * d2 * Math.sin(Math.toRadians(f + 90.0f)));
            spatialEventEmitter.setZ(d4 * d2 * Math.sin(Math.toRadians(f + 90.0f)) - d3 * d2 * Math.cos(Math.toRadians(f + 90.0f)));
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptoResourceInterceptor.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptoResourceInterceptor.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void v() {
    }

    public CryptoResourceInterceptor() {
        long l = b ^ 0x2EF1BFE95BC0L;
        super(a.cs((int)CryptoResourceInterceptor.a("k", (int)30055, (long)(0x389A677DD23A86A0L ^ l))), (int)CryptoResourceInterceptor.a("k", (int)2191, (long)(0x75CD75F9104E7B4BL ^ l)), RecursiveNodeGraph.G, a.cs((int)CryptoResourceInterceptor.a("k", (int)16646, (long)(0x2AA17927DB06B2C5L ^ l))));
        this.l = NumericPrecisionTransformer.D(this, (String)((Object)CryptoResourceInterceptor.c("\u00a4", (int)CryptoResourceInterceptor.a("k", (int)20337, (long)(0x2CB24887A4B4BCB3L ^ l)), (long)-9181036898400837960L, (long)l)), (String)((Object)CryptoResourceInterceptor.c("\u00a4", (int)CryptoResourceInterceptor.a("k", (int)6635, (long)(0x1C4CE6DE98CBEA2EL ^ l)), (long)-9181036898400837960L, (long)l)), "", 0.1, 0.5, 5.0, 0.1, (String)((Object)CryptoResourceInterceptor.c("\u00a4", (int)CryptoResourceInterceptor.a("k", (int)20966, (long)(0x5A7A6E768BEDA228L ^ l)), (long)-9181036898400837960L, (long)l)));
        this.n = NumericPrecisionTransformer.D(this, (String)((Object)CryptoResourceInterceptor.c("\u00a4", (int)CryptoResourceInterceptor.a("k", (int)29510, (long)(0x7C950AF605620086L ^ l)), (long)-9181036898400837960L, (long)l)), (String)((Object)CryptoResourceInterceptor.c("\u00a4", (int)CryptoResourceInterceptor.a("k", (int)7416, (long)(0x6FF080E70258EF3EL ^ l)), (long)-9181036898400837960L, (long)l)), "", 0.1, 0.2, 5.0, 0.1, (String)((Object)CryptoResourceInterceptor.c("\u00a4", (int)CryptoResourceInterceptor.a("k", (int)23333, (long)(0x60B0AB9DAEEE28E4L ^ l)), (long)-9181036898400837960L, (long)l)));
        this.q(false);
        this.N(this.l, this.n);
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public double L() {
        double d2 = 0.2873;
        if (ApplicationLifecycleManager.U().e(ObjectPipelineManager.X)) {
            int n = ApplicationLifecycleManager.U().W(ObjectPipelineManager.X).y();
            d2 *= 1.0 + 0.2 * (double)(n + 1);
        }
        return d2;
    }

    private static void a() {
        Object[] objectArray = j;
        j[0] = "2\r%";
        objectArray[1] = Integer.TYPE;
        CryptoResourceInterceptor.m[1] = "java/lang/Integer";
        objectArray[2] = "D7g)?=O8vfB%\\?\u007f/";
        objectArray[3] = "/\u001fEqM)$\u0010T>,'/\u001bPd";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "I.xS\u0007O]?m4V[&h.OR_\u001b r\fR \u001f m^\u0003D[8jP=";
    }

    private double W(double d2, double d3) {
        return Math.random() * (d2 - d3) + d3;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptoResourceInterceptor.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(CryptoResourceInterceptor.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

