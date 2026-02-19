/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.security.cryptography;

import a.Qh;
import a.tl;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.event.core.EventDispatchCoordinator1159;
import com.exception.system.CustomSystemException;
import com.graphics.color.ColorCompositionEngine;
import com.network.communication.NetworkCommunicationBroker;
import com.network.config.ConnectionConfigurationResolver;
import com.network.protocol.MultiProtocolContextManager;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.security.crypto.CryptographicParameterGenerator;
import com.system.configuration.ConfigurationManager;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.execution.ConditionalExecutionManager;
import com.system.mapping.DynamicMappingRegistry;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.events.UserInteractionEventDispatcher;
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
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

public class CryptographicTransformer289
extends AbstractComputationKernel {
    private static final Integer[] B;
    private static final Object[] E;
    static final boolean b;
    private final NetworkCommunicationBroker V;
    private static final long[] v;
    private static final Map D;
    private static final long n;
    private static final String[] F;

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static double lambda$renderRadar$0(DynamicMappingRegistry dynamicMappingRegistry) {
        return ((MultiProtocolContextManager)dynamicMappingRegistry.Z()).u();
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3BB6;
        if (B[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = v[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])D.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    D.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/bf", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptographicTransformer289.B[n2] = n3;
        }
        return B[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptographicTransformer289.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptographicTransformer289.e(l, l2);
            object = E[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptographicTransformer289.E[n] = clazz = Class.forName(F[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static void a() {
        Object[] objectArray = E;
        E[0] = "5\fO";
        objectArray[1] = Integer.TYPE;
        CryptographicTransformer289.F[1] = "java/lang/Integer";
        objectArray[2] = "1\u0007bNP\u0015:\bs\u0001-\r)\u000fzH";
        objectArray[3] = ".\u000f@>A\u0010%\u0000Qq \u001e.\u000bU+";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "]Gu;N8\b\u0011,KN{aC+z]f\u001b\u0010\u007f{D\u0000X\u0003|&]`\u0000\u000b+)%";
    }

    public CryptographicTransformer289(NetworkCommunicationBroker networkCommunicationBroker) {
        this.V = networkCommunicationBroker;
    }

    @Override
    public void d() {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                CryptographicTransformer289.n = MultiContainerRegistry.a(-2412868035185033179L, -465853488615270487L, MethodHandles.lookup().lookupClass()).a(198067029734870L);
                CryptographicTransformer289.E = new Object[5];
                CryptographicTransformer289.F = new String[5];
                CryptographicTransformer289.a();
                CryptographicTransformer289.D = new HashMap<K, V>(13);
                var0 = CryptographicTransformer289.n ^ 112798657477305L;
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
                var6_5 = "\u00ca\u00a9\u00e8\u001b\u0081\u00c8t\u0090\u00d1D\u00fb\u00e2zO\u008e\u0010]Q3[\u00a4\u00d7MmL\u00db\u00fb4(Et\u00fdh1\u00852\u00f8\u00e6\u00c1\u0013\u00d7Kv.=<\fO\fj;\u00c6^\u0092\u0012\u00d4";
                var7_6 = "\u00ca\u00a9\u00e8\u001b\u0081\u00c8t\u0090\u00d1D\u00fb\u00e2zO\u008e\u0010]Q3[\u00a4\u00d7MmL\u00db\u00fb4(Et\u00fdh1\u00852\u00f8\u00e6\u00c1\u0013\u00d7Kv.=<\fO\fj;\u00c6^\u0092\u0012\u00d4".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block10;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u0089!\u00f3\u0017\u0017a\u0095`\u000b\u008f\u0095\n\u00f1\u00ff3\u00f9";
                    var7_6 = "\u0089!\u00f3\u0017\u0017a\u0095`\u000b\u008f\u0095\n\u00f1\u00ff3\u00f9".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl42:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block11;
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
        CryptographicTransformer289.v = var8_3;
        CryptographicTransformer289.B = new Integer[9];
        try {
            v8 = CryptographicTransformer289.class.desiredAssertionStatus() == false;
        }
        catch (CustomSystemException v9) {
            throw CryptographicTransformer289.a(v9);
        }
        CryptographicTransformer289.b = v8;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'D' || c == '\u00c8' || c == '\u00dc' || c == '\u00b5') {
                field = CryptographicTransformer289.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'D' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c8' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00dc' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptographicTransformer289.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'Z' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @Override
    public double z() {
        return 0.0;
    }

    @Override
    public void g() {
    }

    @Override
    public void U() {
        this.Q(true);
    }

    @Override
    public void G() {
        this.Q(false);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptographicTransformer289.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptographicTransformer289.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method h(long l, long l2) {
        int n = CryptographicTransformer289.e(l, l2);
        Object object = E[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = F[n];
                int n3 = string2.indexOf(8);
                clazz3 = CryptographicTransformer289.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptographicTransformer289.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptographicTransformer289.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptographicTransformer289.E[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptographicTransformer289.f(245644142971941L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptographicTransformer289.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptographicTransformer289.E[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptographicTransformer289.f(245644142971941L, 0L);
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

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (F[n4] != null) {
            return n4;
        }
        Object object = E[n4];
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
                n3 = 57;
                break;
            }
            case 2: {
                n3 = 1;
                break;
            }
            case 3: {
                n3 = 53;
                break;
            }
            case 4: {
                n3 = 19;
                break;
            }
            case 5: {
                n3 = 3;
                break;
            }
            case 6: {
                n3 = 16;
                break;
            }
            case 7: {
                n3 = 43;
                break;
            }
            case 8: {
                n3 = 33;
                break;
            }
            case 9: {
                n3 = 61;
                break;
            }
            case 10: {
                n3 = 0;
                break;
            }
            case 11: {
                n3 = 20;
                break;
            }
            case 12: {
                n3 = 51;
                break;
            }
            case 13: {
                n3 = 62;
                break;
            }
            case 14: {
                n3 = 23;
                break;
            }
            case 15: {
                n3 = 17;
                break;
            }
            case 16: {
                n3 = 11;
                break;
            }
            case 17: {
                n3 = 31;
                break;
            }
            case 18: {
                n3 = 29;
                break;
            }
            case 19: {
                n3 = 2;
                break;
            }
            case 20: {
                n3 = 21;
                break;
            }
            case 21: {
                n3 = 25;
                break;
            }
            case 22: {
                n3 = 27;
                break;
            }
            case 23: {
                n3 = 8;
                break;
            }
            case 24: {
                n3 = 56;
                break;
            }
            case 25: {
                n3 = 26;
                break;
            }
            case 26: {
                n3 = 58;
                break;
            }
            case 27: {
                n3 = 5;
                break;
            }
            case 28: {
                n3 = 32;
                break;
            }
            case 29: {
                n3 = 52;
                break;
            }
            case 30: {
                n3 = 13;
                break;
            }
            case 31: {
                n3 = 14;
                break;
            }
            case 32: {
                n3 = 18;
                break;
            }
            case 33: {
                n3 = 35;
                break;
            }
            case 34: {
                n3 = 6;
                break;
            }
            case 35: {
                n3 = 10;
                break;
            }
            case 36: {
                n3 = 47;
                break;
            }
            case 37: {
                n3 = 44;
                break;
            }
            case 38: {
                n3 = 48;
                break;
            }
            case 39: {
                n3 = 34;
                break;
            }
            case 40: {
                n3 = 38;
                break;
            }
            case 41: {
                n3 = 22;
                break;
            }
            case 42: {
                n3 = 15;
                break;
            }
            case 43: {
                n3 = 49;
                break;
            }
            case 44: {
                n3 = 12;
                break;
            }
            case 45: {
                n3 = 36;
                break;
            }
            case 46: {
                n3 = 39;
                break;
            }
            case 47: {
                n3 = 55;
                break;
            }
            case 48: {
                n3 = 46;
                break;
            }
            case 49: {
                n3 = 30;
                break;
            }
            case 50: {
                n3 = 37;
                break;
            }
            case 51: {
                n3 = 4;
                break;
            }
            case 52: {
                n3 = 63;
                break;
            }
            case 53: {
                n3 = 60;
                break;
            }
            case 54: {
                n3 = 42;
                break;
            }
            case 55: {
                n3 = 41;
                break;
            }
            case 56: {
                n3 = 9;
                break;
            }
            case 57: {
                n3 = 28;
                break;
            }
            case 58: {
                n3 = 7;
                break;
            }
            case 59: {
                n3 = 54;
                break;
            }
            case 60: {
                n3 = 59;
                break;
            }
            case 61: {
                n3 = 24;
                break;
            }
            case 62: {
                n3 = 50;
                break;
            }
            default: {
                n3 = 40;
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
        CryptographicTransformer289.F[n4] = new String(cArray);
        return n4;
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

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptographicTransformer289.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Field g(long l, long l2) {
        int n = CryptographicTransformer289.e(l, l2);
        Object object = E[n];
        if (object instanceof String) {
            String string = F[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptographicTransformer289.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptographicTransformer289.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptographicTransformer289.c(clazz3, string2, clazz2)) != null) {
                    CryptographicTransformer289.E[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptographicTransformer289.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptographicTransformer289.E[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptographicTransformer289.f(245644142971941L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = CryptographicTransformer289.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptographicTransformer289.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public double e() {
        return 0.0;
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void Q(boolean bl) {
        int n;
        int n2;
        double d2;
        double d3;
        CryptographicParameterGenerator cryptographicParameterGenerator;
        long l;
        block109: {
            void var12_12;
            block103: {
                List list;
                SystemConfigurationOrchestrator systemConfigurationOrchestrator;
                block110: {
                    boolean bl2;
                    double d4;
                    double d5;
                    double d6;
                    boolean bl3;
                    block91: {
                        double d7;
                        block111: {
                            block92: {
                                void var25_39;
                                float f;
                                float f2;
                                block89: {
                                    block90: {
                                        boolean bl4;
                                        ConnectionConfigurationResolver connectionConfigurationResolver;
                                        block88: {
                                            double d8;
                                            double d9;
                                            l = CryptographicTransformer289.n ^ 0x153788713134L;
                                            cryptographicParameterGenerator = TemporalMetadataResolver.h.W().S(1.0);
                                            d3 = this.G();
                                            try {
                                                d9 = (float)this.W();
                                                d8 = bl ? this.V.Q().b() : -2.0;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptographicTransformer289.a(customSystemException);
                                            }
                                            d2 = (float)(d9 - d8);
                                            systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                                            connectionConfigurationResolver = ApplicationLifecycleManager.c();
                                            try {
                                                try {
                                                    if (!connectionConfigurationResolver.Y() && !systemConfigurationOrchestrator.Y()) break block88;
                                                    return;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CryptographicTransformer289.a(customSystemException);
                                                }
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptographicTransformer289.a(customSystemException);
                                            }
                                        }
                                        list = connectionConfigurationResolver.M();
                                        if (this.V.L().F.J() != this.V.L().D) break block110;
                                        bl3 = GL11.glIsEnabled((int)3042);
                                        d7 = (Double)this.V.L().i.J();
                                        d6 = d7 / 2.0;
                                        d5 = (Double)this.V.L().r.J();
                                        d4 = (Double)this.V.L().J.J();
                                        try {
                                            bl4 = this.V.L().b.J() == this.V.L().s;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptographicTransformer289.a(customSystemException);
                                        }
                                        bl2 = bl4;
                                        try {
                                            try {
                                                if (!this.V.L().x.s().booleanValue()) break block89;
                                                if (!bl2) break block90;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptographicTransformer289.a(customSystemException);
                                            }
                                            ConfigurationManager.o(d3, d2, d7, d7, new Color((int)CryptographicTransformer289.b("c", (int)29747, (long)(0x4D42BCC53A685255L ^ l)), true), false, 3.0f, 1.0f);
                                            break block89;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptographicTransformer289.a(customSystemException);
                                        }
                                    }
                                    ConfigurationManager.T(d3, d2, d7, 1.0, new Color(0.0f, 0.0f, 0.0f, 0.5f));
                                }
                                if (this.V.L().A.s().booleanValue()) {
                                    float f3 = (float)((d3 -= 0.5) + d7 / 2.0 - 0.5);
                                    float f4 = (float)((d2 -= 0.5) + 0.5);
                                    f2 = (float)(d3 + d7 / 2.0 + 0.5);
                                    float f5 = (float)(d2 + d7 - 0.5);
                                    f = f2 - f3;
                                    float f6 = f5 - f4;
                                    ConfigurationManager.H(f3, f4, f, f6, new Color((int)CryptographicTransformer289.b("c", (int)5154, (long)(0x2B051851BC93B240L ^ l)), true));
                                    f3 = (float)(d3 + 0.5);
                                    f4 = (float)(d2 + d7 / 2.0 - 0.5);
                                    f2 = (float)(d3 + d7 - 0.5);
                                    f5 = (float)(d2 + d7 / 2.0 + 0.5);
                                    f = f2 - f3;
                                    f6 = f5 - f4;
                                    ConfigurationManager.H(f3, f4, f, f6, new Color((int)CryptographicTransformer289.b("c", (int)7555, (long)(0x4CB24C1A4E863BE4L ^ l)), true));
                                }
                                try {
                                    try {
                                        if (!this.V.L().x.s().booleanValue() || !bl2) break block91;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptographicTransformer289.a(customSystemException);
                                    }
                                    if (!TemporalMetadataResolver.h.a().q.j()) break block92;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicTransformer289.a(customSystemException);
                                }
                                ConfigurationManager.o(d3 + 1.0, d2 + 0.5, 2.0, 1.5, TemporalMetadataResolver.h.a().q.L(), false, 1.0f, 1.0f);
                                ColorCompositionEngine colorCompositionEngine = TemporalMetadataResolver.h.a().q.L();
                                float[] fArray = new float[3];
                                Color.RGBtoHSB(((Color)colorCompositionEngine).getRed(), ((Color)colorCompositionEngine).getGreen(), ((Color)colorCompositionEngine).getBlue(), fArray);
                                f2 = fArray[0];
                                ColorCompositionEngine colorCompositionEngine2 = colorCompositionEngine;
                                f = 2.0f;
                                while ((double)f < d7 - 2.0) {
                                    Color color = EventDispatchCoordinator1159.b(f2, 0.9f, 1.0f);
                                    f2 = (float)((double)f2 + 0.005);
                                    ConfigurationManager.A(d3 + (double)f, d2 + 0.1, 1.0, 1.75, color);
                                    f += 1.0f;
                                }
                                ConfigurationManager.o(d3 + d7 - 3.0, d2 + 0.5, 2.0, 1.5, (Color)var25_39, false, 1.0f, 1.0f);
                                break block111;
                            }
                            ConfigurationManager.o(d3 + 1.0, d2 + 0.5, d7 - 2.0, 1.5, TemporalMetadataResolver.h.a().q.L(), false, 1.0f, 1.0f);
                        }
                        ColorCompositionEngine colorCompositionEngine = new ColorCompositionEngine(CryptographicTransformer289.M.a);
                        colorCompositionEngine.I(100);
                        ConfigurationManager.U(d3, d2, d7, d7, colorCompositionEngine, 3.0f, 1.0f, 1.0f);
                    }
                    for (Object e : list) {
                        Color color;
                        double d10;
                        double d11;
                        block101: {
                            MultiProtocolContextManager multiProtocolContextManager;
                            block100: {
                                block97: {
                                    block112: {
                                        double d12;
                                        double d13;
                                        double d14;
                                        double d15;
                                        block96: {
                                            block93: {
                                                double d16;
                                                double d17;
                                                double d18;
                                                double d19;
                                                block95: {
                                                    block94: {
                                                        if (e == systemConfigurationOrchestrator.M()) continue;
                                                        Qh qh = new Qh(e);
                                                        try {
                                                            if (TemporalMetadataResolver.h.a().P(qh)) {
                                                                continue;
                                                            }
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw CryptographicTransformer289.a(customSystemException);
                                                        }
                                                        multiProtocolContextManager = ConditionalExecutionManager.a(qh, systemConfigurationOrchestrator);
                                                        double d20 = systemConfigurationOrchestrator.b() + (systemConfigurationOrchestrator.F() - systemConfigurationOrchestrator.b()) * (double)ApplicationLifecycleManager.K().h();
                                                        double d21 = systemConfigurationOrchestrator.I() + (systemConfigurationOrchestrator.B() - systemConfigurationOrchestrator.I()) * (double)ApplicationLifecycleManager.K().h();
                                                        double d22 = qh.b() + (qh.F() - qh.b()) * (double)ApplicationLifecycleManager.K().h();
                                                        double d23 = qh.I() + (qh.B() - qh.I()) * (double)ApplicationLifecycleManager.K().h();
                                                        double d24 = d22 - d20;
                                                        double d25 = d23 - d21;
                                                        d15 = d3 + d6;
                                                        d14 = d2 + d6;
                                                        float f = (float)Math.cos((double)systemConfigurationOrchestrator.q() * (Math.PI / 180));
                                                        float f7 = (float)Math.sin((double)systemConfigurationOrchestrator.q() * (Math.PI / 180));
                                                        d13 = -(d24 * (double)f + d25 * (double)f7) * d5;
                                                        d12 = -(d25 * (double)f - d24 * (double)f7) * d5;
                                                        try {
                                                            try {
                                                                if (!bl2) break block93;
                                                                d19 = d15;
                                                                if (this.V.L().X.s().booleanValue()) break block94;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw CryptographicTransformer289.a(customSystemException);
                                                            }
                                                            d18 = d13;
                                                            break block95;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw CryptographicTransformer289.a(customSystemException);
                                                        }
                                                    }
                                                    d18 = AdaptiveComputationEngine.Z(d13, -d6 + d4 / 2.0, d6 - d4 / 2.0);
                                                }
                                                d11 = d19 + d18;
                                                try {
                                                    d17 = d14;
                                                    d16 = this.V.L().X.s() == false ? d12 : AdaptiveComputationEngine.Z(d12, -d6 + d4 / 2.0, d6 - d4 / 2.0);
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CryptographicTransformer289.a(customSystemException);
                                                }
                                                d10 = d17 + d16;
                                                d10 = Math.max(d10, d2 + 4.0);
                                                break block112;
                                            }
                                            try {
                                                if (!this.V.L().X.s().booleanValue() || !(Math.sqrt(d13 * d13 + d12 * d12) > d6)) break block96;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptographicTransformer289.a(customSystemException);
                                            }
                                            float f = (float)Math.atan2(d12, d13);
                                            d13 = (float)((d6 - 0.5) * Math.cos(f));
                                            d12 = (float)((d6 - 0.5) * Math.sin(f));
                                        }
                                        d11 = d15 + d13;
                                        d10 = d14 + d12;
                                    }
                                    color = Color.WHITE;
                                    if (this.V.L().W.J() == this.V.L().e) {
                                        color = this.V.L().R.L();
                                    } else if (this.V.L().W.J() == this.V.L().j) {
                                        ColorCompositionEngine colorCompositionEngine = multiProtocolContextManager.w(true);
                                        if (colorCompositionEngine != null) {
                                            color = colorCompositionEngine;
                                        }
                                    } else {
                                        ColorCompositionEngine colorCompositionEngine;
                                        block99: {
                                            block98: {
                                                try {
                                                    try {
                                                        if (this.V.L().W.J() != this.V.L().u) break block97;
                                                        if (!multiProtocolContextManager.T()) break block98;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw CryptographicTransformer289.a(customSystemException);
                                                    }
                                                    colorCompositionEngine = this.V.L().O.L();
                                                    break block99;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CryptographicTransformer289.a(customSystemException);
                                                }
                                            }
                                            colorCompositionEngine = this.V.L().z.L();
                                        }
                                        color = colorCompositionEngine;
                                    }
                                }
                                try {
                                    if (!multiProtocolContextManager.Y() || !TemporalMetadataResolver.h.j().b.s().booleanValue()) break block100;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicTransformer289.a(customSystemException);
                                }
                                color = TemporalMetadataResolver.h.j().u.L();
                            }
                            try {
                                if (!multiProtocolContextManager.E() || !TemporalMetadataResolver.h.g().a.s().booleanValue()) break block101;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicTransformer289.a(customSystemException);
                            }
                            color = TemporalMetadataResolver.h.g().F.L();
                        }
                        try {
                            if (this.V.L().d.J() == this.V.L().Q) {
                                GraphicsBufferAllocator.n(d11 - d4 / 2.0, d10 - d4 / 2.0, d11 + d4 / 2.0, d10 + d4 / 2.0, 0.5, color, new Color((int)CryptographicTransformer289.b("c", (int)16283, (long)(0x4C80EF9E457399FFL ^ l)), true));
                                continue;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicTransformer289.a(customSystemException);
                        }
                        double d26 = d4 / 2.0;
                        ConfigurationManager.T(d11 - d26, d10 - d26, d4, 0.5, color);
                        ConfigurationManager.r((float)(d11 - d26), (float)(d10 - d26), (float)d4, 1.0f, 0.75f, new Color((int)CryptographicTransformer289.b("c", (int)27133, (long)(0x734584F376824F98L ^ l)), true));
                    }
                    try {
                        if (!bl3) return;
                        tl.N();
                        return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTransformer289.a(customSystemException);
                    }
                }
                ArrayList<DynamicMappingRegistry> arrayList = new ArrayList<DynamicMappingRegistry>();
                ArrayList arrayList2 = new ArrayList();
                int n3 = ((Double)this.V.L().Y.J()).intValue();
                for (Object e : list) {
                    try {
                        try {
                            if (!ReflectionMetadataResolver.UQ.isAssignableFrom(e.getClass()) || e == systemConfigurationOrchestrator.M()) continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicTransformer289.a(customSystemException);
                        }
                        if (arrayList2.contains(e)) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTransformer289.a(customSystemException);
                    }
                    Qh qh = new Qh(e);
                    try {
                        if (TemporalMetadataResolver.h.a().P(qh)) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTransformer289.a(customSystemException);
                    }
                    try {
                        try {
                            try {
                                if (n3 != 0 && !(systemConfigurationOrchestrator.y(qh) <= (float)n3)) continue;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicTransformer289.a(customSystemException);
                            }
                            if (TemporalMetadataResolver.h.a().P(qh)) {
                                continue;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicTransformer289.a(customSystemException);
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTransformer289.a(customSystemException);
                    }
                    arrayList.add(DynamicMappingRegistry.U(qh, ConditionalExecutionManager.a(qh, systemConfigurationOrchestrator)));
                    arrayList2.add(e);
                }
                try {
                    if (arrayList.isEmpty()) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTransformer289.a(customSystemException);
                }
                arrayList.sort(Comparator.comparingDouble(CryptographicTransformer289::lambda$renderRadar$0));
                int n4 = ((Double)this.V.L().U.J()).intValue();
                n2 = 0;
                try {
                    if ((Double)this.V.L().U.J() == 0.0 || arrayList.size() <= n4) break block103;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTransformer289.a(customSystemException);
                }
                n2 = arrayList.size() - n4;
                List list2 = arrayList.subList(0, n4);
            }
            n = 0;
            for (DynamicMappingRegistry dynamicMappingRegistry : var12_12) {
                int n5;
                String string;
                String string2;
                block108: {
                    block107: {
                        CallSite callSite;
                        int n6;
                        MultiProtocolContextManager multiProtocolContextManager;
                        block106: {
                            block105: {
                                block104: {
                                    Qh qh = (Qh)dynamicMappingRegistry.r();
                                    multiProtocolContextManager = (MultiProtocolContextManager)dynamicMappingRegistry.p();
                                    try {
                                        try {
                                            if (b || multiProtocolContextManager != null) break block104;
                                            throw new AssertionError();
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptographicTransformer289.a(customSystemException);
                                        }
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptographicTransformer289.a(customSystemException);
                                    }
                                }
                                n6 = (int)multiProtocolContextManager.u();
                                try {
                                    if (n6 <= 100) break block105;
                                    callSite = CryptographicTransformer289.c("\u00e8", (int)CryptographicTransformer289.b("c", (int)3023, (long)(0x6286E48DB1502DACL ^ l)), (long)2149911678967842268L, (long)l);
                                    break block106;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicTransformer289.a(customSystemException);
                                }
                            }
                            try {
                                callSite = n6 > 50 ? CryptographicTransformer289.c("\u00e8", (int)CryptographicTransformer289.b("c", (int)27957, (long)(0x3BB6B571DB98CB5CL ^ l)), (long)2149911678967842268L, (long)l) : CryptographicTransformer289.c("\u00e8", (int)CryptographicTransformer289.b("c", (int)18662, (long)(0x2247E9367F9D6E87L ^ l)), (long)2149911678967842268L, (long)l);
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicTransformer289.a(customSystemException);
                            }
                        }
                        CallSite callSite2 = callSite;
                        string2 = String.format("\u00a7%s%dm", callSite2, n6);
                        try {
                            if (this.V.L().x.s().booleanValue()) {
                                ConfigurationManager.A(d3, d2 + (double)n, this.w(), 10.0, new Color(20, 20, 20, 180));
                                ConfigurationManager.A(d3, d2 + (double)n + 9.5, this.w(), 0.5, new Color(25, 25, 25, 65));
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicTransformer289.a(customSystemException);
                        }
                        string = multiProtocolContextManager.g();
                        try {
                            if (!TemporalMetadataResolver.h.j().Q(string)) break block107;
                            n5 = TemporalMetadataResolver.h.j().u.G();
                            break block108;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicTransformer289.a(customSystemException);
                        }
                    }
                    try {
                        n5 = TemporalMetadataResolver.h.g().Q(string) ? TemporalMetadataResolver.h.g().F.G() : -1;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicTransformer289.a(customSystemException);
                    }
                }
                int n7 = n5;
                cryptographicParameterGenerator.S(string, d3 + 1.0, d2 + 2.0 + (double)n, n7);
                cryptographicParameterGenerator.S(string2, d3 + this.w() - cryptographicParameterGenerator.D(string2) - 1.0, d2 + 2.0 + (double)n, -1);
                n += 10;
            }
            try {
                try {
                    if (n2 <= 0) return;
                    if (!this.V.L().x.s().booleanValue()) break block109;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTransformer289.a(customSystemException);
                }
                ConfigurationManager.A(d3, d2 + (double)n, this.w(), 10.0, new Color(20, 20, 20, 180));
                ConfigurationManager.A(d3, d2 + (double)n + 9.5, this.w(), 0.5, new Color(25, 25, 25, 65));
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicTransformer289.a(customSystemException);
            }
        }
        cryptographicParameterGenerator.S(n2 + (String)((Object)CryptographicTransformer289.c("\u00e8", (int)CryptographicTransformer289.b("c", (int)4976, (long)(0x639587D34642B510L ^ l)), (long)2149911678967842268L, (long)l)), d3 + 1.0, d2 + 2.0 + (double)n, -1);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptographicTransformer289.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(CryptographicTransformer289.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

