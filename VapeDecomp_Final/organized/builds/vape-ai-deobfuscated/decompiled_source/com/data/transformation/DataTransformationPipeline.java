/*
 * Decompiled with CFR 0.152.
 */
package com.data.transformation;

import a.a;
import com.adapter.management.GenericAdapterManager;
import com.analytics.computation.NumericComputationEngine1000;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.concurrency.management.AsynchronousResourceOrchestrator;
import com.core.generic.GenericTypeHandler;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.generic.GenericDataWrapper;
import com.data.structures.GenericDataContainer;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.graphics.color.ColorCompositionEngine;
import com.math.computation.NumericComputationEngine1131;
import com.math.geometry.GeometryCalculator;
import com.network.protocol.MultiProtocolContextManager;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.rendering.adaptive.AdaptiveRenderingEngine;
import com.runtime.context.ContextualExecutionFramework;
import com.security.authentication.AuthenticationGateway1860;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.execution.ConditionalExecutionManager;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.management.TransactionOrchestrator1017;
import java.awt.Color;
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

public class DataTransformationPipeline
extends ContextualExecutionFramework {
    public AuthenticationStateTracker r;
    private AsynchronousResourceOrchestrator A;
    private static final Object[] K;
    public AuthenticationStateTracker n;
    public AuthenticationStateTracker l;
    private final AuthenticationGateway1860 d;
    public final AdaptiveRenderingEngine x;
    public AuthenticationStateTracker e;
    public final AuthenticationGateway1860 Z;
    private static final long b;
    public NumericComputationEngine1131 o;
    private static final String[] N;
    private final AuthenticationGateway1860 G;
    private static final Map F;
    public AuthenticationStateTracker h;
    public AuthenticationStateTracker B;
    public AuthenticationStateTracker V;
    private static final long[] w;
    private final AuthenticationGateway1860 t;
    private final AuthenticationStateTracker O;
    public AuthenticationStateTracker j;
    public final GenericAdapterManager X;
    private final GenericDataContainer P;
    public AuthenticationStateTracker v;
    public AuthenticationStateTracker L;
    private static final Integer[] z;
    public AuthenticationStateTracker m;
    public AuthenticationStateTracker Y;

    private static void d() {
        Object[] objectArray = K;
        K[0] = "\\y\u0017";
        objectArray[1] = Integer.TYPE;
        DataTransformationPipeline.N[1] = "java/lang/Integer";
        objectArray[2] = ")gG%@\u0002\"hVj=\u001a1o_#";
        objectArray[3] = "\u000bSeO'\b\u0000\\t\u0000F\u0006\u000bWpZ";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "C\u0002|\"rQ\u0007\u001ezDaM\u007f\u0019:ua\\G\u0012xt\n\u000f\u0003Z-<xYF\u001e=D";
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = DataTransformationPipeline.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DataTransformationPipeline.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DataTransformationPipeline.a(l, l2);
            object = K[n];
            try {
                if (!(object instanceof String)) break block2;
                DataTransformationPipeline.K[n] = clazz = Class.forName(N[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'K' || c == '\u00ec' || c == '\u00b5' || c == '\u00d4') {
                field = DataTransformationPipeline.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'K' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ec' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00b5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DataTransformationPipeline.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00df' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DataTransformationPipeline.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x53B9;
        if (z[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = w[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])F.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    F.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Aq", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DataTransformationPipeline.z[n2] = n3;
        }
        return z[n2];
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (N[n4] != null) {
            return n4;
        }
        Object object = K[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 24;
                break;
            }
            case 1: {
                n3 = 22;
                break;
            }
            case 2: {
                n3 = 55;
                break;
            }
            case 3: {
                n3 = 58;
                break;
            }
            case 4: {
                n3 = 18;
                break;
            }
            case 5: {
                n3 = 4;
                break;
            }
            case 6: {
                n3 = 14;
                break;
            }
            case 7: {
                n3 = 31;
                break;
            }
            case 8: {
                n3 = 35;
                break;
            }
            case 9: {
                n3 = 25;
                break;
            }
            case 10: {
                n3 = 59;
                break;
            }
            case 11: {
                n3 = 0;
                break;
            }
            case 12: {
                n3 = 36;
                break;
            }
            case 13: {
                n3 = 16;
                break;
            }
            case 14: {
                n3 = 56;
                break;
            }
            case 15: {
                n3 = 1;
                break;
            }
            case 16: {
                n3 = 44;
                break;
            }
            case 17: {
                n3 = 40;
                break;
            }
            case 18: {
                n3 = 28;
                break;
            }
            case 19: {
                n3 = 3;
                break;
            }
            case 20: {
                n3 = 48;
                break;
            }
            case 21: {
                n3 = 10;
                break;
            }
            case 22: {
                n3 = 6;
                break;
            }
            case 23: {
                n3 = 9;
                break;
            }
            case 24: {
                n3 = 30;
                break;
            }
            case 25: {
                n3 = 29;
                break;
            }
            case 26: {
                n3 = 51;
                break;
            }
            case 27: {
                n3 = 11;
                break;
            }
            case 28: {
                n3 = 46;
                break;
            }
            case 29: {
                n3 = 52;
                break;
            }
            case 30: {
                n3 = 32;
                break;
            }
            case 31: {
                n3 = 17;
                break;
            }
            case 32: {
                n3 = 33;
                break;
            }
            case 33: {
                n3 = 61;
                break;
            }
            case 34: {
                n3 = 63;
                break;
            }
            case 35: {
                n3 = 37;
                break;
            }
            case 36: {
                n3 = 13;
                break;
            }
            case 37: {
                n3 = 12;
                break;
            }
            case 38: {
                n3 = 38;
                break;
            }
            case 39: {
                n3 = 34;
                break;
            }
            case 40: {
                n3 = 8;
                break;
            }
            case 41: {
                n3 = 27;
                break;
            }
            case 42: {
                n3 = 45;
                break;
            }
            case 43: {
                n3 = 15;
                break;
            }
            case 44: {
                n3 = 42;
                break;
            }
            case 45: {
                n3 = 23;
                break;
            }
            case 46: {
                n3 = 57;
                break;
            }
            case 47: {
                n3 = 20;
                break;
            }
            case 48: {
                n3 = 43;
                break;
            }
            case 49: {
                n3 = 60;
                break;
            }
            case 50: {
                n3 = 26;
                break;
            }
            case 51: {
                n3 = 50;
                break;
            }
            case 52: {
                n3 = 62;
                break;
            }
            case 53: {
                n3 = 39;
                break;
            }
            case 54: {
                n3 = 54;
                break;
            }
            case 55: {
                n3 = 19;
                break;
            }
            case 56: {
                n3 = 53;
                break;
            }
            case 57: {
                n3 = 21;
                break;
            }
            case 58: {
                n3 = 5;
                break;
            }
            case 59: {
                n3 = 47;
                break;
            }
            case 60: {
                n3 = 2;
                break;
            }
            case 61: {
                n3 = 41;
                break;
            }
            case 62: {
                n3 = 7;
                break;
            }
            default: {
                n3 = 49;
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
        DataTransformationPipeline.N[n4] = new String(cArray);
        return n4;
    }

    public boolean a() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (this.X.J() != this.G || !this.A.V()) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataTransformationPipeline.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationPipeline.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DataTransformationPipeline.b = MultiContainerRegistry.a(4300127198464040085L, -2481914838333285501L, MethodHandles.lookup().lookupClass()).a(246541260813331L);
                DataTransformationPipeline.K = new Object[5];
                DataTransformationPipeline.N = new String[5];
                DataTransformationPipeline.d();
                DataTransformationPipeline.F = new HashMap<K, V>(13);
                var0 = DataTransformationPipeline.b ^ 57316641722389L;
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
                var8_3 = new long[36];
                var5_4 = 0;
                var6_5 = "\u00a9\u0007p\u0093\u00f8\u0089\u00b0QS\u00c3\u00da\u00e7b\u008dp\u00cf'\\\u001bh\u00fc\u00e8]\u00b8\u0006\u0097\u00e2\u00c8\u00bfF\u00ae\u00b0\u0012\u009aG\u00df\u008d\u0091\u00f5m<E:oR\u0098\u00b4\u008c\u00bb\u008b\u0016\u0087\u00e6\u00d9\u0094,\u0004Q\t\u00bb\u00cc\u00be\r\u00f5T\u00db\u00c8\u00de\u00e7\u00d5\u001c\u0013\u009f\u0087\u0088\u00a4\u001bq\u001d2\u00c9\u00e0#\u00ed3\u0096\b\u0000c\u00c3\u0080\u00f6&\u00d7\u00e7%\u0098\u0096\u00f8@OU`W\u0001F\u0091\u00be\u00fb+I\u00bf\u00c3\u009f\u008b\u0084\u0010K\u00e3%\u00d2 Ju2\u00fa\u00a7\u008dF\u00b0\u00c4\rQ@\u00c1Pl?\u0005g6&88#\u00102l\u00a0\u0093\u00f6\u00bfp\u0092\"\u00fa\u000e\u00c9\u00c8+@\u0097\u0014,\u00b6_+\u0017\u00b1-\u00e3u\u00f7\u00c4\u00dcc\u00b2\u00e8\u00e8\u00c3\u00c9\u00b6\u00cc\u00c8\u00b5\u00bd\u0003\u0015\u00fb\u00fb:\u0085\u0015\u00cc2\u00e4\u00fb\u009e\r\u00fe\u00ce\u00d1/\u00b3\u0003\u00dc\u0013\t\u001b\u00c8\u00b7\u00e0\u0015Y^\u0016\u00bd\u007f\u009b\u009b|\u0004\u00ec\u00faa\u00d8\r\u00ba\u00f6?p\u00fa\u00d3\u00a7\u00ae\u009e3\u0011\u00d5\u00d8\u00cd'`\u0088R\u00e2\u00987\u0093\u0016\u00c2EDqb\fA\u00a4\u00f0\u00b4\u0091\u00af\u0099\u00fa6\u008e-\u0014\u0094U\u00dda";
                var7_6 = "\u00a9\u0007p\u0093\u00f8\u0089\u00b0QS\u00c3\u00da\u00e7b\u008dp\u00cf'\\\u001bh\u00fc\u00e8]\u00b8\u0006\u0097\u00e2\u00c8\u00bfF\u00ae\u00b0\u0012\u009aG\u00df\u008d\u0091\u00f5m<E:oR\u0098\u00b4\u008c\u00bb\u008b\u0016\u0087\u00e6\u00d9\u0094,\u0004Q\t\u00bb\u00cc\u00be\r\u00f5T\u00db\u00c8\u00de\u00e7\u00d5\u001c\u0013\u009f\u0087\u0088\u00a4\u001bq\u001d2\u00c9\u00e0#\u00ed3\u0096\b\u0000c\u00c3\u0080\u00f6&\u00d7\u00e7%\u0098\u0096\u00f8@OU`W\u0001F\u0091\u00be\u00fb+I\u00bf\u00c3\u009f\u008b\u0084\u0010K\u00e3%\u00d2 Ju2\u00fa\u00a7\u008dF\u00b0\u00c4\rQ@\u00c1Pl?\u0005g6&88#\u00102l\u00a0\u0093\u00f6\u00bfp\u0092\"\u00fa\u000e\u00c9\u00c8+@\u0097\u0014,\u00b6_+\u0017\u00b1-\u00e3u\u00f7\u00c4\u00dcc\u00b2\u00e8\u00e8\u00c3\u00c9\u00b6\u00cc\u00c8\u00b5\u00bd\u0003\u0015\u00fb\u00fb:\u0085\u0015\u00cc2\u00e4\u00fb\u009e\r\u00fe\u00ce\u00d1/\u00b3\u0003\u00dc\u0013\t\u001b\u00c8\u00b7\u00e0\u0015Y^\u0016\u00bd\u007f\u009b\u009b|\u0004\u00ec\u00faa\u00d8\r\u00ba\u00f6?p\u00fa\u00d3\u00a7\u00ae\u009e3\u0011\u00d5\u00d8\u00cd'`\u0088R\u00e2\u00987\u0093\u0016\u00c2EDqb\fA\u00a4\u00f0\u00b4\u0091\u00af\u0099\u00fa6\u008e-\u0014\u0094U\u00dda".length();
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
                    var6_5 = "lSJ\u0015K\u0080\u0017\u00dd\u009a\u00a5\u0005\u0098\u00efc\u00c0\u00b3";
                    var7_6 = "lSJ\u0015K\u0080\u0017\u00dd\u009a\u00a5\u0005\u0098\u00efc\u00c0\u00b3".length();
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
        DataTransformationPipeline.w = var8_3;
        DataTransformationPipeline.z = new Integer[36];
    }

    private static Method d(long l, long l2) {
        int n = DataTransformationPipeline.a(l, l2);
        Object object = K[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = N[n];
                int n3 = string2.indexOf(8);
                clazz3 = DataTransformationPipeline.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DataTransformationPipeline.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DataTransformationPipeline.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        DataTransformationPipeline.K[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DataTransformationPipeline.b(254762244165497L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DataTransformationPipeline.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DataTransformationPipeline.K[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DataTransformationPipeline.b(254762244165497L, 0L);
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

    public DataTransformationPipeline() {
        long l = b ^ 0xF9D36140C8DL;
        super(a.cs((int)DataTransformationPipeline.a("p", (int)21113, (long)(0x4FFF55E1624B5A73L ^ l))), (int)DataTransformationPipeline.a("p", (int)22407, (long)(0x248ACA8608D1DF8EL ^ l)), RecursiveNodeGraph.z, a.cs((int)DataTransformationPipeline.a("p", (int)11037, (long)(0x5FABABBEC34D2300L ^ l))));
        this.Z = new GenericDataWrapper(this, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)18124, (long)(0x4A9D29513F6DCED0L ^ l)), (long)6605479683396765535L, (long)l))).w();
        this.P = new GenericDataContainer(this, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)17339, (long)(0x6C2DBE3A89BCB89L ^ l)), (long)6605479683396765535L, (long)l)));
        this.t = this.P.w();
        this.A = new AsynchronousResourceOrchestrator(this, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)30423, (long)(0x7EA7743E8A6C7ECFL ^ l)), (long)6605479683396765535L, (long)l)));
        this.G = this.A.w();
        this.d = new GenericTypeHandler(this, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)24987, (long)(0x148BC0CF96BA6981L ^ l)), (long)6605479683396765535L, (long)l))).w();
        this.x = AdaptiveRenderingEngine.C(this, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)23284, (long)(0x4B8E43B6333452E0L ^ l)), (long)6605479683396765535L, (long)l)), new Color((int)DataTransformationPipeline.a("p", (int)23581, (long)(0x16C20502CFD540DL ^ l))));
        this.O = AuthenticationStateTracker.R(this, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)5755, (long)(0x5A57BAB225279E69L ^ l)), (long)6605479683396765535L, (long)l)), false, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)30353, (long)(0x12F5155C9A25FE9CL ^ l)), (long)6605479683396765535L, (long)l)));
        this.h = AuthenticationStateTracker.R(this, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)18327, (long)(0x60B7E866B164CF80L ^ l)), (long)6605479683396765535L, (long)l)), false, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)28114, (long)(0x77434055F53065E1L ^ l)), (long)6605479683396765535L, (long)l)));
        this.l = AuthenticationStateTracker.R(this, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)28809, (long)(0xB39AAA9CD21F889L ^ l)), (long)6605479683396765535L, (long)l)), false, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)16092, (long)(0x73B3B0AEE64336D7L ^ l)), (long)6605479683396765535L, (long)l)));
        this.L = AuthenticationStateTracker.w(this, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)1223, (long)(0x4ED744C29920CF6L ^ l)), (long)6605479683396765535L, (long)l)), false);
        this.r = AuthenticationStateTracker.w(this, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)4746, (long)(0x1425E072AE711A9CL ^ l)), (long)6605479683396765535L, (long)l)), false);
        this.v = AuthenticationStateTracker.R(this, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)18106, (long)(0x39A5FE12916CEBDL ^ l)), (long)6605479683396765535L, (long)l)), false, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)30954, (long)(0x1F85052A769A70FBL ^ l)), (long)6605479683396765535L, (long)l)));
        this.m = AuthenticationStateTracker.R(this, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)21577, (long)(0x67A47EA31CD7DC56L ^ l)), (long)6605479683396765535L, (long)l)), false, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)10718, (long)(0x6BAF0F89AC2821D6L ^ l)), (long)6605479683396765535L, (long)l)));
        this.n = AuthenticationStateTracker.R(this, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)17491, (long)(0x69DDE0711BBFCC48L ^ l)), (long)6605479683396765535L, (long)l)), true, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)19675, (long)(0x66E1F4ACD7A944DDL ^ l)), (long)6605479683396765535L, (long)l)));
        this.j = AuthenticationStateTracker.R(this, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)21403, (long)(0xFFF09F432B25B97L ^ l)), (long)6605479683396765535L, (long)l)), false, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)20277, (long)(0x40FDEAF9690C473BL ^ l)), (long)6605479683396765535L, (long)l)));
        this.V = AuthenticationStateTracker.R(this, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)22924, (long)(0x3F7B7A3849CC518EL ^ l)), (long)6605479683396765535L, (long)l)), false, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)6909, (long)(0x53B0EDA45B6892FEL ^ l)), (long)6605479683396765535L, (long)l)));
        this.Y = AuthenticationStateTracker.R(this, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)18205, (long)(0x5FC9070B503ACF18L ^ l)), (long)6605479683396765535L, (long)l)), false, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)16940, (long)(0x1079FD5890B7CA28L ^ l)), (long)6605479683396765535L, (long)l)));
        this.e = AuthenticationStateTracker.R(this, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)28205, (long)(0x1DE84953B42C6634L ^ l)), (long)6605479683396765535L, (long)l)), false, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)16034, (long)(0x19AB4866CCA5B6B7L ^ l)), (long)6605479683396765535L, (long)l)));
        this.B = AuthenticationStateTracker.R(this, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)24258, (long)(0x23556A1E648E56D1L ^ l)), (long)6605479683396765535L, (long)l)), false, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)9137, (long)(0x1AA417EFF42A2BBEL ^ l)), (long)6605479683396765535L, (long)l)));
        this.o = ApplicationLifecycleManager.r();
        this.v.l(this.m);
        if (GeometryCalculator.C() >= 37) {
            this.X = GenericAdapterManager.D(this, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)6095, (long)(0x63D10A451FAD9FD1L ^ l)), (long)6605479683396765535L, (long)l)), this.Z, this.Z, this.t);
        } else {
            try {
                this.X = GeometryCalculator.C() >= 23 ? GenericAdapterManager.D(this, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)12449, (long)(0x286AB2377C60B8A0L ^ l)), (long)6605479683396765535L, (long)l)), this.Z, this.Z, this.t, this.d) : GenericAdapterManager.D(this, (String)((Object)DataTransformationPipeline.c("\u00df", (int)DataTransformationPipeline.a("p", (int)20336, (long)(0xF366D36A4F34740L ^ l)), (long)6605479683396765535L, (long)l)), this.Z, this.Z, this.t, this.d, this.G);
            }
            catch (CustomSystemException customSystemException) {
                throw DataTransformationPipeline.a(customSystemException);
            }
        }
        this.v.l(this.m);
        this.n.l(this.l);
        this.V.l(this.Y, this.e);
        this.X.i(this.t).z(this.n, this.l, this.j, this.V, this.Y, this.e);
        this.X.i(this.Z).z(this.v, this.m);
        this.N(this.x, this.X, this.v, this.m, this.n, this.l, this.j, this.V, this.Y, this.e, this.O, this.r);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Aq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Aq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public ColorCompositionEngine K(SystemConfigurationOrchestrator systemConfigurationOrchestrator, Object object) {
        MultiProtocolContextManager multiProtocolContextManager;
        TransactionOrchestrator1017 transactionOrchestrator1017;
        block26: {
            block25: {
                try {
                    if (NumericComputationEngine1000.n()) {
                        return null;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationPipeline.a(customSystemException);
                }
                try {
                    if (object == null) {
                        return null;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationPipeline.a(customSystemException);
                }
                CryptographicTransformer cryptographicTransformer = new CryptographicTransformer(object);
                try {
                    if (!cryptographicTransformer.B(ReflectionMetadataResolver.Ut)) {
                        return null;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationPipeline.a(customSystemException);
                }
                try {
                    if (object.equals(systemConfigurationOrchestrator)) {
                        return null;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationPipeline.a(customSystemException);
                }
                transactionOrchestrator1017 = new TransactionOrchestrator1017(object);
                multiProtocolContextManager = ConditionalExecutionManager.a(transactionOrchestrator1017, systemConfigurationOrchestrator);
                try {
                    if (multiProtocolContextManager.m()) {
                        return null;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationPipeline.a(customSystemException);
                }
                try {
                    try {
                        if (!this.r.s().booleanValue() || !multiProtocolContextManager.I()) break block25;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataTransformationPipeline.a(customSystemException);
                    }
                    return null;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationPipeline.a(customSystemException);
                }
            }
            try {
                try {
                    if (this.O.s().booleanValue() || !multiProtocolContextManager.K()) break block26;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationPipeline.a(customSystemException);
                }
                return null;
            }
            catch (CustomSystemException customSystemException) {
                throw DataTransformationPipeline.a(customSystemException);
            }
        }
        if (transactionOrchestrator1017.B(ReflectionMetadataResolver.Pr)) {
            ColorCompositionEngine colorCompositionEngine = TemporalMetadataResolver.h.a().X(multiProtocolContextManager);
            if (colorCompositionEngine == null) {
                colorCompositionEngine = this.x.L();
            }
            return new ColorCompositionEngine(((Color)colorCompositionEngine).getRGB(), ((Color)colorCompositionEngine).getAlpha());
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = DataTransformationPipeline.a(l, l2);
        Object object = K[n];
        if (object instanceof String) {
            String string = N[n];
            int n2 = string.indexOf(8);
            Class clazz = DataTransformationPipeline.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DataTransformationPipeline.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DataTransformationPipeline.a(clazz3, string2, clazz2)) != null) {
                    DataTransformationPipeline.K[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DataTransformationPipeline.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DataTransformationPipeline.K[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DataTransformationPipeline.b(254762244165497L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DataTransformationPipeline.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DataTransformationPipeline.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DataTransformationPipeline.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DataTransformationPipeline.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(DataTransformationPipeline.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

