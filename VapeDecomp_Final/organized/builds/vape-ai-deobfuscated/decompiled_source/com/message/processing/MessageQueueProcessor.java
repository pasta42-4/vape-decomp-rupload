/*
 * Decompiled with CFR 0.152.
 */
package com.message.processing;

import a.E8;
import a.Qh;
import a.a;
import a.cA;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.graphics.palette.ColorPaletteManager;
import com.math.geometry.GeometricCalculator1575;
import com.network.configuration.NetworkConfigManager;
import com.numeric.precision.NumericPrecisionTransformer;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.ContextualExecutionFramework;
import com.security.cryptography.CryptoKeyManagementSystem;
import com.structure.tree.RecursiveNodeTreeBuilder;
import com.transaction.management.TransactionOrchestrator1017;
import com.ui.configuration.DisplayConfigurationManager;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class MessageQueueProcessor
extends ContextualExecutionFramework {
    private static final Integer[] h;
    private static final long b;
    private static final String[] n;
    private final NumericPrecisionTransformer o;
    private static final Map j;
    private final Queue<String> A;
    private final ColorPaletteManager Y;
    private final cA l;
    private final List<Integer> X;
    private static final Object[] m;
    private final AuthenticationStateTracker e;
    private Object r;
    private final NetworkConfigManager V;
    private static final long[] d;

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (MessageQueueProcessor.n[n4] != null) {
            return n4;
        }
        Object object = m[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 0;
                break;
            }
            case 1: {
                n3 = 46;
                break;
            }
            case 2: {
                n3 = 10;
                break;
            }
            case 3: {
                n3 = 11;
                break;
            }
            case 4: {
                n3 = 7;
                break;
            }
            case 5: {
                n3 = 4;
                break;
            }
            case 6: {
                n3 = 40;
                break;
            }
            case 7: {
                n3 = 33;
                break;
            }
            case 8: {
                n3 = 52;
                break;
            }
            case 9: {
                n3 = 9;
                break;
            }
            case 10: {
                n3 = 31;
                break;
            }
            case 11: {
                n3 = 1;
                break;
            }
            case 12: {
                n3 = 63;
                break;
            }
            case 13: {
                n3 = 29;
                break;
            }
            case 14: {
                n3 = 12;
                break;
            }
            case 15: {
                n3 = 32;
                break;
            }
            case 16: {
                n3 = 50;
                break;
            }
            case 17: {
                n3 = 62;
                break;
            }
            case 18: {
                n3 = 27;
                break;
            }
            case 19: {
                n3 = 13;
                break;
            }
            case 20: {
                n3 = 15;
                break;
            }
            case 21: {
                n3 = 43;
                break;
            }
            case 22: {
                n3 = 35;
                break;
            }
            case 23: {
                n3 = 54;
                break;
            }
            case 24: {
                n3 = 8;
                break;
            }
            case 25: {
                n3 = 55;
                break;
            }
            case 26: {
                n3 = 22;
                break;
            }
            case 27: {
                n3 = 18;
                break;
            }
            case 28: {
                n3 = 23;
                break;
            }
            case 29: {
                n3 = 6;
                break;
            }
            case 30: {
                n3 = 48;
                break;
            }
            case 31: {
                n3 = 30;
                break;
            }
            case 32: {
                n3 = 42;
                break;
            }
            case 33: {
                n3 = 5;
                break;
            }
            case 34: {
                n3 = 37;
                break;
            }
            case 35: {
                n3 = 16;
                break;
            }
            case 36: {
                n3 = 3;
                break;
            }
            case 37: {
                n3 = 14;
                break;
            }
            case 38: {
                n3 = 58;
                break;
            }
            case 39: {
                n3 = 20;
                break;
            }
            case 40: {
                n3 = 2;
                break;
            }
            case 41: {
                n3 = 39;
                break;
            }
            case 42: {
                n3 = 21;
                break;
            }
            case 43: {
                n3 = 47;
                break;
            }
            case 44: {
                n3 = 17;
                break;
            }
            case 45: {
                n3 = 45;
                break;
            }
            case 46: {
                n3 = 28;
                break;
            }
            case 47: {
                n3 = 59;
                break;
            }
            case 48: {
                n3 = 51;
                break;
            }
            case 49: {
                n3 = 25;
                break;
            }
            case 50: {
                n3 = 19;
                break;
            }
            case 51: {
                n3 = 38;
                break;
            }
            case 52: {
                n3 = 24;
                break;
            }
            case 53: {
                n3 = 53;
                break;
            }
            case 54: {
                n3 = 60;
                break;
            }
            case 55: {
                n3 = 26;
                break;
            }
            case 56: {
                n3 = 41;
                break;
            }
            case 57: {
                n3 = 44;
                break;
            }
            case 58: {
                n3 = 49;
                break;
            }
            case 59: {
                n3 = 36;
                break;
            }
            case 60: {
                n3 = 57;
                break;
            }
            case 61: {
                n3 = 34;
                break;
            }
            case 62: {
                n3 = 56;
                break;
            }
            default: {
                n3 = 61;
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
        MessageQueueProcessor.n[n4] = new String(cArray);
        return n4;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = MessageQueueProcessor.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = MessageQueueProcessor.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = MessageQueueProcessor.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = MessageQueueProcessor.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
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
            throw new RuntimeException("a/AI" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = MessageQueueProcessor.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field c(long l, long l2) {
        int n = MessageQueueProcessor.a(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            String string = MessageQueueProcessor.n[n];
            int n2 = string.indexOf(8);
            Class clazz = MessageQueueProcessor.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = MessageQueueProcessor.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = MessageQueueProcessor.a(clazz3, string2, clazz2)) != null) {
                    MessageQueueProcessor.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = MessageQueueProcessor.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        MessageQueueProcessor.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = MessageQueueProcessor.b(214420018706542L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static void a() {
        Object[] objectArray = m;
        m[0] = "%7(";
        objectArray[1] = Integer.TYPE;
        MessageQueueProcessor.n[1] = "java/lang/Integer";
        objectArray[2] = "0uw\n=K;zfE@S(}o\f";
        objectArray[3] = "GdC\u001c\u0013WLkRSrYG`V\t";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0010\u0000?$\u0010#\r\u00057EA!uBq>A \u000eC# \u0017ZL\u0002r{\u0015&\u0016\u0010q7*";
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = MessageQueueProcessor.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                MessageQueueProcessor.b = MultiContainerRegistry.a(-9188780172740452532L, -8194915159963090604L, MethodHandles.lookup().lookupClass()).a(235666695444369L);
                MessageQueueProcessor.m = new Object[5];
                MessageQueueProcessor.n = new String[5];
                MessageQueueProcessor.a();
                MessageQueueProcessor.j = new HashMap<K, V>(13);
                var0 = MessageQueueProcessor.b ^ 82214930266990L;
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
                var8_3 = new long[20];
                var5_4 = 0;
                var6_5 = "\u0087\u00bd|/\u00f8\u00e6\u00e1\u00d8\u00c8`\u0097\u009cc\u00e6@\u00cb\u00e3\u00ca|\u008c4C\u001a/\u00ff\u0082\u008ck\u009c\u0090\u009b\u00f2\u00dcQ&\u00a0\u00d5!\u0097\u00ad\u00e8\u008eMd\u0093\u00ba\u00a3\u00cd\u00d1\u0084\u00f7\u00f2\u009a\u00e3\u00f0\u0094f\u0091\u00d7UI\u0019\u0004\u00ce\u00f9\u00f8\u00c5!\u00dc acL*C.\u00a9\u0099\u00d0\u0017|\u00ea\u0086Q1\u00d4To\u00a8Q\u001f\u00f8\u00cc\u00e9\u00e5\u000eW*y\u0098\u00fa\u00e4!\u00ab!G\r\u00fc\u00d8J8\u00ea.\u00db\u00f5\u00dciu\u0098\u000e\u00d5\u00a3\u008b\u0019N\u00c9\u00a3\"\u00d8\u0084\u00f7\u0001\u00d6_\u00b5N\u0012:I^\u00e1\u00fe\u0090)";
                var7_6 = "\u0087\u00bd|/\u00f8\u00e6\u00e1\u00d8\u00c8`\u0097\u009cc\u00e6@\u00cb\u00e3\u00ca|\u008c4C\u001a/\u00ff\u0082\u008ck\u009c\u0090\u009b\u00f2\u00dcQ&\u00a0\u00d5!\u0097\u00ad\u00e8\u008eMd\u0093\u00ba\u00a3\u00cd\u00d1\u0084\u00f7\u00f2\u009a\u00e3\u00f0\u0094f\u0091\u00d7UI\u0019\u0004\u00ce\u00f9\u00f8\u00c5!\u00dc acL*C.\u00a9\u0099\u00d0\u0017|\u00ea\u0086Q1\u00d4To\u00a8Q\u001f\u00f8\u00cc\u00e9\u00e5\u000eW*y\u0098\u00fa\u00e4!\u00ab!G\r\u00fc\u00d8J8\u00ea.\u00db\u00f5\u00dciu\u0098\u000e\u00d5\u00a3\u008b\u0019N\u00c9\u00a3\"\u00d8\u0084\u00f7\u0001\u00d6_\u00b5N\u0012:I^\u00e1\u00fe\u0090)".length();
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
                    var6_5 = "\u00f2|\u00b4\u00ef\u00a1\u00f2(ip\u00c0Y\u00c8\u00cda{7";
                    var7_6 = "\u00f2|\u00b4\u00ef\u00a1\u00f2(ip\u00c0Y\u00c8\u00cda{7".length();
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
        MessageQueueProcessor.d = var8_3;
        MessageQueueProcessor.h = new Integer[20];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3D3F;
        if (h[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
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
                throw new RuntimeException("a/AI", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            MessageQueueProcessor.h[n2] = n3;
        }
        return h[n2];
    }

    public boolean H(TransactionOrchestrator1017 transactionOrchestrator1017) {
        try {
            if (!this.Z()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MessageQueueProcessor.a(customSystemException);
        }
        try {
            if (!transactionOrchestrator1017.B(ReflectionMetadataResolver.UQ)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MessageQueueProcessor.a(customSystemException);
        }
        return this.X.contains(transactionOrchestrator1017.X());
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'R' || c == '\u00c6' || c == '\u00c5' || c == '\u00ec') {
                field = MessageQueueProcessor.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'R' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c6' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = MessageQueueProcessor.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'e' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = MessageQueueProcessor.a(l, l2);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                MessageQueueProcessor.m[n] = clazz = Class.forName(MessageQueueProcessor.n[n]);
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AI" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public MessageQueueProcessor() {
        long l = b ^ 0x10B76BE97BAL;
        super(a.cs((int)MessageQueueProcessor.a("n", (int)4907, (long)(0x305D3779EF2179B7L ^ l))), -11859, RecursiveNodeGraph.V, a.cs((int)MessageQueueProcessor.a("n", (int)12384, (long)(0x3FCE11CA835DDAF4L ^ l))));
        this.A = new ConcurrentLinkedQueue<String>();
        this.X = new ArrayList<Integer>();
        this.e = AuthenticationStateTracker.R(this, (String)((Object)MessageQueueProcessor.c("e", (int)MessageQueueProcessor.a("n", (int)25089, (long)(0xBBBE9FF93F6088BL ^ l)), (long)6315815216759783802L, (long)l)), false, (String)((Object)MessageQueueProcessor.c("e", (int)MessageQueueProcessor.a("n", (int)16392, (long)(0x38CCD676456B2A83L ^ l)), (long)6315815216759783802L, (long)l)));
        this.l = cA.d(this, (String)((Object)MessageQueueProcessor.c("e", (int)MessageQueueProcessor.a("n", (int)8671, (long)(0x46264D5B4BCACB44L ^ l)), (long)6315815216759783802L, (long)l)), (String)((Object)MessageQueueProcessor.c("e", (int)MessageQueueProcessor.a("n", (int)6867, (long)(0x1F5D513086FDF044L ^ l)), (long)6315815216759783802L, (long)l)), (String)((Object)MessageQueueProcessor.c("e", (int)MessageQueueProcessor.a("n", (int)18639, (long)(0x680D411065672251L ^ l)), (long)6315815216759783802L, (long)l)), cA.V, Arrays.asList(MessageQueueProcessor.c("e", (int)MessageQueueProcessor.a("n", (int)9596, (long)(0x7198D503DAB64FE6L ^ l)), (long)6315815216759783802L, (long)l), MessageQueueProcessor.c("e", (int)MessageQueueProcessor.a("n", (int)2266, (long)(0x55C92B0C42A4E243L ^ l)), (long)6315815216759783802L, (long)l)));
        this.o = NumericPrecisionTransformer.b(this, (String)((Object)MessageQueueProcessor.c("e", (int)MessageQueueProcessor.a("n", (int)14865, (long)(0x65D435292F3ED083L ^ l)), (long)6315815216759783802L, (long)l)), (String)((Object)MessageQueueProcessor.c("e", (int)MessageQueueProcessor.a("n", (int)13124, (long)(0x2BC7FB036E9BD9D9L ^ l)), (long)6315815216759783802L, (long)l)), (String)((Object)MessageQueueProcessor.c("e", (int)MessageQueueProcessor.a("n", (int)12649, (long)(0xDE42EF097FDDBFAL ^ l)), (long)6315815216759783802L, (long)l)), 0.0, 3100.0, 5000.0, (String)((Object)MessageQueueProcessor.c("e", (int)MessageQueueProcessor.a("n", (int)17963, (long)(0x7A2F41529A13ACBAL ^ l)), (long)6315815216759783802L, (long)l)));
        this.Y = ColorPaletteManager.o(this, (String)((Object)MessageQueueProcessor.c("e", (int)MessageQueueProcessor.a("n", (int)3697, (long)(0x270B059D732DE4E9L ^ l)), (long)6315815216759783802L, (long)l)), (String)((Object)MessageQueueProcessor.c("e", (int)MessageQueueProcessor.a("n", (int)9023, (long)(0x67A6F3AC323149B7L ^ l)), (long)6315815216759783802L, (long)l)), ColorPaletteManager.g, Arrays.asList(new RecursiveNodeTreeBuilder((String)((Object)MessageQueueProcessor.c("e", (int)MessageQueueProcessor.a("n", (int)10231, (long)(0x4D6BB10541924D68L ^ l)), (long)6315815216759783802L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)MessageQueueProcessor.c("e", (int)MessageQueueProcessor.a("n", (int)32050, (long)(0x6D183590759117A4L ^ l)), (long)6315815216759783802L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)MessageQueueProcessor.c("e", (int)MessageQueueProcessor.a("n", (int)11475, (long)(0x5137A1D4C8CBC65AL ^ l)), (long)6315815216759783802L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)MessageQueueProcessor.c("e", (int)MessageQueueProcessor.a("n", (int)9081, (long)(0x6257F8DAF5DC9ECL ^ l)), (long)6315815216759783802L, (long)l))), new RecursiveNodeTreeBuilder(288), new RecursiveNodeTreeBuilder(396), new RecursiveNodeTreeBuilder(421), new RecursiveNodeTreeBuilder(398), new RecursiveNodeTreeBuilder(369), new RecursiveNodeTreeBuilder(75), new RecursiveNodeTreeBuilder(50), new RecursiveNodeTreeBuilder(352)));
        this.V = new NetworkConfigManager();
        this.e.l(this.o, this.l);
        this.N(this.e, this.o, this.l, this.Y);
    }

    private static Method d(long l, long l2) {
        int n = MessageQueueProcessor.a(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = MessageQueueProcessor.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = MessageQueueProcessor.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = MessageQueueProcessor.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = MessageQueueProcessor.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        MessageQueueProcessor.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = MessageQueueProcessor.b(214420018706542L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = MessageQueueProcessor.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        MessageQueueProcessor.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = MessageQueueProcessor.b(214420018706542L, 0L);
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

    @DataExchangeProtocol2090
    public void r(CryptoKeyManagementSystem cryptoKeyManagementSystem) {
        long l;
        block20: {
            block19: {
                l = b ^ 0x6920F66A8B60L;
                try {
                    try {
                        if (this.r != null && ApplicationLifecycleManager.c().M().equals(this.r)) break block19;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MessageQueueProcessor.a(customSystemException);
                    }
                    this.X.clear();
                    this.A.clear();
                    this.r = ApplicationLifecycleManager.c().M();
                }
                catch (CustomSystemException customSystemException) {
                    throw MessageQueueProcessor.a(customSystemException);
                }
            }
            try {
                try {
                    if (this.A.size() <= 0 || !this.V.m(((Double)this.o.J()).longValue())) break block20;
                }
                catch (CustomSystemException customSystemException) {
                    throw MessageQueueProcessor.a(customSystemException);
                }
                ApplicationLifecycleManager.U().o(this.A.poll());
                this.V.m();
            }
            catch (CustomSystemException customSystemException) {
                throw MessageQueueProcessor.a(customSystemException);
            }
        }
        for (Object e : ApplicationLifecycleManager.c().L()) {
            try {
                if (!ReflectionMetadataResolver.UQ.isAssignableFrom(e.getClass()) || ReflectionMetadataResolver.rl.isAssignableFrom(e.getClass())) continue;
            }
            catch (CustomSystemException customSystemException) {
                throw MessageQueueProcessor.a(customSystemException);
            }
            Qh qh = new Qh(e);
            try {
                if (this.X.contains(qh.X())) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw MessageQueueProcessor.a(customSystemException);
            }
            try {
                try {
                    if (!qh.K().r() || !this.Y.H(qh.K())) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw MessageQueueProcessor.a(customSystemException);
                }
                this.X.add(qh.X());
                if (!this.e.s().booleanValue()) continue;
            }
            catch (CustomSystemException customSystemException) {
                throw MessageQueueProcessor.a(customSystemException);
            }
            List<String> list = this.l.I();
            int n = (int)Math.round((double)list.size() * Math.random());
            if (n >= list.size()) {
                n = list.size() - 1;
            }
            String string = list.get(n).replace((CharSequence)((Object)MessageQueueProcessor.c("e", (int)MessageQueueProcessor.a("n", (int)5815, (long)(0x458676D06AF760FDL ^ l)), (long)5439257984858152352L, (long)l)), qh.e());
            this.A.add(string);
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @DataExchangeProtocol2090
    public void u(DisplayConfigurationManager displayConfigurationManager) {
        if (!this.X.isEmpty()) {
            GeometricCalculator1575 geometricCalculator1575 = new GeometricCalculator1575();
            int n = 25;
            E8 e8 = displayConfigurationManager.getFontRenderer();
            e8.m("\u00a7nMurderer List", geometricCalculator1575.s() / 2 - 20, 15.0, -1);
            for (Object e : ApplicationLifecycleManager.c().L()) {
                try {
                    if (!ReflectionMetadataResolver.UQ.isAssignableFrom(e.getClass()) || ReflectionMetadataResolver.rl.isAssignableFrom(e.getClass())) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw MessageQueueProcessor.a(customSystemException);
                }
                Qh qh = new Qh(e);
                try {
                    if (!this.X.contains(qh.X())) continue;
                    e8.m(qh.e(), geometricCalculator1575.s() / 2 - 20, n, -1);
                    n += 10;
                }
                catch (CustomSystemException customSystemException) {
                    throw MessageQueueProcessor.a(customSystemException);
                }
            }
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(MessageQueueProcessor.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(MessageQueueProcessor.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

