/*
 * Decompiled with CFR 0.152.
 */
package com.stream.correlation;

import a.a;
import com.app.metrics.tracking.TimestampMetricTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.event.dispatch.EventDispatchController1028;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.numeric.precision.NumericPrecisionTransformer;
import com.runtime.context.ContextualExecutionFramework;
import com.temporal.metadata.TemporalMetadataResolver;
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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class MultiStreamEventCorrelator
extends ContextualExecutionFramework {
    private NumericPrecisionTransformer X;
    private int x;
    private static final String[] m;
    private int j;
    private static final long b;
    private long B;
    private boolean L;
    private ArrayList<TimestampMetricTracker> t;
    private NumericPrecisionTransformer G;
    private static final Integer[] e;
    private static final long[] d;
    private int R;
    private int P;
    private static final Map h;
    private static final Object[] l;

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = MultiStreamEventCorrelator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = MultiStreamEventCorrelator.b(classArray[i], string, clazz2);
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
            throw new RuntimeException("a/xJ" + " : " + string + " : " + methodType.toString(), exception);
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xJ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void h() {
        long l = b ^ 0x788230806D60L;
        super.h();
        TemporalMetadataResolver.x((String)((Object)MultiStreamEventCorrelator.c("\u00f3", (int)MultiStreamEventCorrelator.a("u", (int)5001, (long)(0x16E35BA231942C6BL ^ l)), (long)-4114296663930962693L, (long)l)));
        this.B = System.currentTimeMillis();
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = MultiStreamEventCorrelator.a(l, l2);
            object = MultiStreamEventCorrelator.l[n];
            try {
                if (!(object instanceof String)) break block2;
                MultiStreamEventCorrelator.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e1' || c == '\u00cf' || c == '\u00a3' || c == 'V') {
                field = MultiStreamEventCorrelator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e1' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00cf' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00a3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = MultiStreamEventCorrelator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00cb' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method d(long l, long l2) {
        int n = MultiStreamEventCorrelator.a(l, l2);
        Object object = MultiStreamEventCorrelator.l[n];
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
                clazz3 = MultiStreamEventCorrelator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = MultiStreamEventCorrelator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = MultiStreamEventCorrelator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        MultiStreamEventCorrelator.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = MultiStreamEventCorrelator.b(242325846988730L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = MultiStreamEventCorrelator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        MultiStreamEventCorrelator.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = MultiStreamEventCorrelator.b(242325846988730L, 0L);
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

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                MultiStreamEventCorrelator.b = MultiContainerRegistry.a(-7447879218254114600L, -2368391859088161036L, MethodHandles.lookup().lookupClass()).a(84460391535012L);
                MultiStreamEventCorrelator.l = new Object[5];
                MultiStreamEventCorrelator.m = new String[5];
                MultiStreamEventCorrelator.a();
                MultiStreamEventCorrelator.h = new HashMap<K, V>(13);
                var0 = MultiStreamEventCorrelator.b ^ 87839923473673L;
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
                var8_3 = new long[27];
                var5_4 = 0;
                var6_5 = "\u00d8\u0090\u0084\u0097\\X\u00eaZ\u00b0wu\u0011+\u0010\u00d9l\u0088(\u00b9\u0017\u00b3o\u0016\u0090\u009b\u008c%\u0094Z@)\u00a4\u0002\u00d2j\u00fb\u0001\u00ea|\u000e\u00f6\u009e\u001e6\u00e37\u00bbM\u0010K\u00061\u0086\u001a\u0014f\u008d\u00ea`9_NAs\u00a8Gj\u00e2w\u00ae@\u00d0j\u00c8\u00efL-\u0082\u001f\u008dqf\u00b4\u00dc\u00fd.\u00d4\u00da\u00c5\u0017\u00af\u00a9\u000f\u00d5Y{\u00e6\u00dfc\u0093\u00854\u00c4\u00f0\u0012\u00bf\u0007\rT\u0014\u00996\u00b9\u00aa\u00ff\u00c7\u00dd\u00a6P1\u00bd\u0089\u007f\u0007\u00a5w\u00fb\u009a\u00bc\u00a37\u00e5\u0012\nHE\u00ed;\u00a2s\u009d5\u00aaS\u00eet\u009f.\u00fa\u00ecG\u00c1\u00d5N\u00ec@5\u0012(\u0086\bF\u00dc\u00a5\u0094\nZ\u00ec\u008fS\u00b9\u00ba_\u00d0\u00c8\u00dc\u0004\u00da]\u001a\u00bb\u0010\u0016\u001a\u0012`\u0099\u009b\u0081\u00ec\u00b7\u00c6a\u008e\u009d\u00fbE\u00d1=\u00fe";
                var7_6 = "\u00d8\u0090\u0084\u0097\\X\u00eaZ\u00b0wu\u0011+\u0010\u00d9l\u0088(\u00b9\u0017\u00b3o\u0016\u0090\u009b\u008c%\u0094Z@)\u00a4\u0002\u00d2j\u00fb\u0001\u00ea|\u000e\u00f6\u009e\u001e6\u00e37\u00bbM\u0010K\u00061\u0086\u001a\u0014f\u008d\u00ea`9_NAs\u00a8Gj\u00e2w\u00ae@\u00d0j\u00c8\u00efL-\u0082\u001f\u008dqf\u00b4\u00dc\u00fd.\u00d4\u00da\u00c5\u0017\u00af\u00a9\u000f\u00d5Y{\u00e6\u00dfc\u0093\u00854\u00c4\u00f0\u0012\u00bf\u0007\rT\u0014\u00996\u00b9\u00aa\u00ff\u00c7\u00dd\u00a6P1\u00bd\u0089\u007f\u0007\u00a5w\u00fb\u009a\u00bc\u00a37\u00e5\u0012\nHE\u00ed;\u00a2s\u009d5\u00aaS\u00eet\u009f.\u00fa\u00ecG\u00c1\u00d5N\u00ec@5\u0012(\u0086\bF\u00dc\u00a5\u0094\nZ\u00ec\u008fS\u00b9\u00ba_\u00d0\u00c8\u00dc\u0004\u00da]\u001a\u00bb\u0010\u0016\u001a\u0012`\u0099\u009b\u0081\u00ec\u00b7\u00c6a\u008e\u009d\u00fbE\u00d1=\u00fe".length();
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
                    var6_5 = "\u00f0\u000b\u00f1KR\n\u00ed\u00b5\u00b4P\u001alYh\u000b.";
                    var7_6 = "\u00f0\u000b\u00f1KR\n\u00ed\u00b5\u00b4P\u001alYh\u000b.".length();
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
        MultiStreamEventCorrelator.d = var8_3;
        MultiStreamEventCorrelator.e = new Integer[27];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = MultiStreamEventCorrelator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n4] != null) {
            return n4;
        }
        Object object = MultiStreamEventCorrelator.l[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 2;
                break;
            }
            case 1: {
                n3 = 20;
                break;
            }
            case 2: {
                n3 = 10;
                break;
            }
            case 3: {
                n3 = 14;
                break;
            }
            case 4: {
                n3 = 62;
                break;
            }
            case 5: {
                n3 = 38;
                break;
            }
            case 6: {
                n3 = 29;
                break;
            }
            case 7: {
                n3 = 11;
                break;
            }
            case 8: {
                n3 = 17;
                break;
            }
            case 9: {
                n3 = 33;
                break;
            }
            case 10: {
                n3 = 63;
                break;
            }
            case 11: {
                n3 = 41;
                break;
            }
            case 12: {
                n3 = 51;
                break;
            }
            case 13: {
                n3 = 45;
                break;
            }
            case 14: {
                n3 = 59;
                break;
            }
            case 15: {
                n3 = 26;
                break;
            }
            case 16: {
                n3 = 27;
                break;
            }
            case 17: {
                n3 = 52;
                break;
            }
            case 18: {
                n3 = 1;
                break;
            }
            case 19: {
                n3 = 13;
                break;
            }
            case 20: {
                n3 = 25;
                break;
            }
            case 21: {
                n3 = 47;
                break;
            }
            case 22: {
                n3 = 61;
                break;
            }
            case 23: {
                n3 = 16;
                break;
            }
            case 24: {
                n3 = 39;
                break;
            }
            case 25: {
                n3 = 6;
                break;
            }
            case 26: {
                n3 = 8;
                break;
            }
            case 27: {
                n3 = 48;
                break;
            }
            case 28: {
                n3 = 55;
                break;
            }
            case 29: {
                n3 = 43;
                break;
            }
            case 30: {
                n3 = 53;
                break;
            }
            case 31: {
                n3 = 24;
                break;
            }
            case 32: {
                n3 = 32;
                break;
            }
            case 33: {
                n3 = 3;
                break;
            }
            case 34: {
                n3 = 0;
                break;
            }
            case 35: {
                n3 = 34;
                break;
            }
            case 36: {
                n3 = 30;
                break;
            }
            case 37: {
                n3 = 46;
                break;
            }
            case 38: {
                n3 = 19;
                break;
            }
            case 39: {
                n3 = 31;
                break;
            }
            case 40: {
                n3 = 35;
                break;
            }
            case 41: {
                n3 = 40;
                break;
            }
            case 42: {
                n3 = 22;
                break;
            }
            case 43: {
                n3 = 28;
                break;
            }
            case 44: {
                n3 = 15;
                break;
            }
            case 45: {
                n3 = 9;
                break;
            }
            case 46: {
                n3 = 5;
                break;
            }
            case 47: {
                n3 = 50;
                break;
            }
            case 48: {
                n3 = 37;
                break;
            }
            case 49: {
                n3 = 4;
                break;
            }
            case 50: {
                n3 = 49;
                break;
            }
            case 51: {
                n3 = 56;
                break;
            }
            case 52: {
                n3 = 36;
                break;
            }
            case 53: {
                n3 = 18;
                break;
            }
            case 54: {
                n3 = 7;
                break;
            }
            case 55: {
                n3 = 21;
                break;
            }
            case 56: {
                n3 = 58;
                break;
            }
            case 57: {
                n3 = 44;
                break;
            }
            case 58: {
                n3 = 42;
                break;
            }
            case 59: {
                n3 = 23;
                break;
            }
            case 60: {
                n3 = 60;
                break;
            }
            case 61: {
                n3 = 57;
                break;
            }
            case 62: {
                n3 = 54;
                break;
            }
            default: {
                n3 = 12;
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
        MultiStreamEventCorrelator.m[n4] = new String(cArray);
        return n4;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = MultiStreamEventCorrelator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7915;
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
                throw new RuntimeException("a/xJ", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            MultiStreamEventCorrelator.e[n2] = n3;
        }
        return e[n2];
    }

    private void y() {
        long l = b ^ 0x6255454B5F54L;
        TemporalMetadataResolver.x((String)((Object)MultiStreamEventCorrelator.c("\u00f3", (int)MultiStreamEventCorrelator.a("u", (int)6085, (long)(0x5855383125EB1A07L ^ l)), (long)-805284322065330481L, (long)l)));
        TemporalMetadataResolver.x((String)((Object)MultiStreamEventCorrelator.c("\u00f3", (int)MultiStreamEventCorrelator.a("u", (int)28882, (long)(0x4DE2ED99F8EF7D18L ^ l)), (long)-805284322065330481L, (long)l)) + this.X.J());
        TemporalMetadataResolver.x((String)((Object)MultiStreamEventCorrelator.c("\u00f3", (int)MultiStreamEventCorrelator.a("u", (int)13982, (long)(0x6080D1CCC28EBB53L ^ l)), (long)-805284322065330481L, (long)l)) + this.G.J() + (String)((Object)MultiStreamEventCorrelator.c("\u00f3", (int)MultiStreamEventCorrelator.a("u", (int)6385, (long)(0x1CB4D3204F41532L ^ l)), (long)-805284322065330481L, (long)l)));
        int n = 0;
        int n2 = 0;
        TemporalMetadataResolver.x((String)((Object)MultiStreamEventCorrelator.c("\u00f3", (int)MultiStreamEventCorrelator.a("u", (int)16004, (long)(0x30445882502B3351L ^ l)), (long)-805284322065330481L, (long)l)));
        for (int i = 0; i < this.t.size(); ++i) {
            TemporalMetadataResolver.x(i + 1 + (String)((Object)MultiStreamEventCorrelator.c("\u00f3", (int)MultiStreamEventCorrelator.a("u", (int)16986, (long)(0x49119AA51BD74F8DL ^ l)), (long)-805284322065330481L, (long)l)) + this.t.get(i).s() + (String)((Object)MultiStreamEventCorrelator.c("\u00f3", (int)MultiStreamEventCorrelator.a("u", (int)4033, (long)(0x269E3625A3100210L ^ l)), (long)-805284322065330481L, (long)l)) + this.t.get((int)i).n);
            TemporalMetadataResolver.x((String)((Object)MultiStreamEventCorrelator.c("\u00f3", (int)MultiStreamEventCorrelator.a("u", (int)30730, (long)(0x21BFEBCE0AD875CCL ^ l)), (long)-805284322065330481L, (long)l)) + this.t.get((int)i).u + (String)((Object)MultiStreamEventCorrelator.c("\u00f3", (int)MultiStreamEventCorrelator.a("u", (int)27252, (long)(0x7968A44D597A67A0L ^ l)), (long)-805284322065330481L, (long)l)) + this.t.get((int)i).A);
            n = (int)((double)n + this.t.get(i).s());
            n2 = (int)((long)n2 + this.t.get((int)i).n);
        }
        TemporalMetadataResolver.x((String)((Object)MultiStreamEventCorrelator.c("\u00f3", (int)MultiStreamEventCorrelator.a("u", (int)26783, (long)(0x2B44E200A55BE55BL ^ l)), (long)-805284322065330481L, (long)l)) + n / this.t.size() + (String)((Object)MultiStreamEventCorrelator.c("\u00f3", (int)MultiStreamEventCorrelator.a("u", (int)125, (long)(0x2E5E3FF2C7E40DADL ^ l)), (long)-805284322065330481L, (long)l)) + n2 / this.t.size());
        TemporalMetadataResolver.x((String)((Object)MultiStreamEventCorrelator.c("\u00f3", (int)MultiStreamEventCorrelator.a("u", (int)6181, (long)(0x65BB83016B2115E4L ^ l)), (long)-805284322065330481L, (long)l)));
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = MultiStreamEventCorrelator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = MultiStreamEventCorrelator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = l;
        l[0] = "'nD";
        objectArray[1] = Integer.TYPE;
        MultiStreamEventCorrelator.m[1] = "java/lang/Integer";
        objectArray[2] = "pS\u00192\u000f-{\\\b}r5h[\u00014";
        objectArray[3] = "\u001dX\rh4I\u0016W\u001c'UG\u001d\\\u0018}";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "@~-\u000b\u0017|\u0014w$j\u0011h~.z\u0011K.\u0014,%R\b\u0013Gy1\u001b\u0003o\u000e-;\u0011z";
    }

    public MultiStreamEventCorrelator() {
        long l = b ^ 0x20EC4252E103L;
        super(a.cs((int)MultiStreamEventCorrelator.a("u", (int)32392, (long)(0x7C796D7BD7CDCD14L ^ l))), -1, RecursiveNodeGraph.K);
        this.t = new ArrayList();
        this.L = false;
        this.G = NumericPrecisionTransformer.N(this, (String)((Object)MultiStreamEventCorrelator.c("\u00f3", (int)MultiStreamEventCorrelator.a("u", (int)9078, (long)(0x6AC1F7D4E7B990F3L ^ l)), (long)5369500862844727448L, (long)l)), (String)((Object)MultiStreamEventCorrelator.c("\u00f3", (int)MultiStreamEventCorrelator.a("u", (int)24387, (long)(0x375662D77F026CC9L ^ l)), (long)5369500862844727448L, (long)l)), (String)((Object)MultiStreamEventCorrelator.c("\u00f3", (int)MultiStreamEventCorrelator.a("u", (int)9450, (long)(0x72371CBD4E709771L ^ l)), (long)5369500862844727448L, (long)l)), 10.0, 30.0, 60.0, 1.0);
        this.X = NumericPrecisionTransformer.D(this, (String)((Object)MultiStreamEventCorrelator.c("\u00f3", (int)MultiStreamEventCorrelator.a("u", (int)28825, (long)(0x69D2FE496BD64300L ^ l)), (long)5369500862844727448L, (long)l)), (String)((Object)MultiStreamEventCorrelator.c("\u00f3", (int)MultiStreamEventCorrelator.a("u", (int)32025, (long)(0x2E281E067DC34E87L ^ l)), (long)5369500862844727448L, (long)l)), "", 1.0, 5.0, 10.0, 1.0, (String)((Object)MultiStreamEventCorrelator.c("\u00f3", (int)MultiStreamEventCorrelator.a("u", (int)10118, (long)(0x350D47117FED1419L ^ l)), (long)5369500862844727448L, (long)l)));
        this.R = 0;
        this.j = (int)MultiStreamEventCorrelator.a("u", (int)31645, (long)(0x45199DCA1BCE4815L ^ l));
        this.x = (int)MultiStreamEventCorrelator.a("u", (int)2472, (long)(0x4055F96FEA623A38L ^ l));
        this.N(this.G, this.X);
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

    private double x() {
        return (Double)this.G.J() * 1000.0;
    }

    @DataExchangeProtocol2090
    public void O(EventDispatchController1028 eventDispatchController1028) {
        long l;
        block10: {
            block11: {
                l = b ^ 0x5C96A2BF4C88L;
                try {
                    try {
                        if (this.L) break block10;
                        if (System.currentTimeMillis() - this.B > 5000L) break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MultiStreamEventCorrelator.a(customSystemException);
                    }
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw MultiStreamEventCorrelator.a(customSystemException);
                }
            }
            TemporalMetadataResolver.x((String)((Object)MultiStreamEventCorrelator.c("\u00f3", (int)MultiStreamEventCorrelator.a("u", (int)10266, (long)(0x378EFAE2E7473615L ^ l)), (long)-1797163922706473709L, (long)l)));
            this.L = true;
            this.B = System.currentTimeMillis();
            this.P = 0;
            this.x = (int)MultiStreamEventCorrelator.a("u", (int)6277, (long)(0x40F7036893BF8687L ^ l));
            this.j = (int)MultiStreamEventCorrelator.a("u", (int)27386, (long)(0x490E0DB7C3E074E3L ^ l));
        }
        try {
            if ((double)this.t.size() >= (Double)this.X.J()) {
                this.y();
                this.m();
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiStreamEventCorrelator.a(customSystemException);
        }
        long l2 = System.currentTimeMillis() - this.B;
        try {
            if ((double)l2 >= this.x()) {
                this.t.add(new TimestampMetricTracker(this.P, this.R, this.j, this.x));
                TemporalMetadataResolver.x((String)((Object)MultiStreamEventCorrelator.c("\u00f3", (int)MultiStreamEventCorrelator.a("u", (int)5157, (long)(0x773EE073F56F8A36L ^ l)), (long)-1797163922706473709L, (long)l)) + this.t.size() + (String)((Object)MultiStreamEventCorrelator.c("\u00f3", (int)MultiStreamEventCorrelator.a("u", (int)15318, (long)(0x787E5AE6500DA5CAL ^ l)), (long)-1797163922706473709L, (long)l)));
                this.R = 0;
                this.P = 0;
                this.x = (int)MultiStreamEventCorrelator.a("u", (int)6277, (long)(0x40F7036893BF8687L ^ l));
                this.j = (int)MultiStreamEventCorrelator.a("u", (int)27386, (long)(0x490E0DB7C3E074E3L ^ l));
                this.B = System.currentTimeMillis();
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiStreamEventCorrelator.a(customSystemException);
        }
        ++this.P;
        int n = ApplicationLifecycleManager.P();
        this.R += n;
        this.j = Math.max(this.j, n);
        this.x = Math.min(this.x, n);
    }

    private static Field c(long l, long l2) {
        int n = MultiStreamEventCorrelator.a(l, l2);
        Object object = MultiStreamEventCorrelator.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = MultiStreamEventCorrelator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = MultiStreamEventCorrelator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = MultiStreamEventCorrelator.a(clazz3, string2, clazz2)) != null) {
                    MultiStreamEventCorrelator.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = MultiStreamEventCorrelator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        MultiStreamEventCorrelator.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = MultiStreamEventCorrelator.b(242325846988730L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public void v() {
        super.v();
        this.t.clear();
        this.L = false;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(MultiStreamEventCorrelator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(MultiStreamEventCorrelator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

