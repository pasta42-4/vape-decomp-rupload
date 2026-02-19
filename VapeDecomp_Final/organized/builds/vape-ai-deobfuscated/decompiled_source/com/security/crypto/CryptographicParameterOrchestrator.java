/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.system.lifecycle.ObjectLifecycleTracker;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class CryptographicParameterOrchestrator
extends CryptoProtocolEngine {
    private final HK g;
    private static final Integer[] h;
    private final HK f;
    private static final String[] k;
    private HK b;
    private static final Map i;
    private static final long[] d;
    private HK B;
    private static final Object[] j;
    private HK c;
    private static final long a;
    private final HK e;
    private static int[] P;

    private void Z(Object object, double d2) {
        this.f.l(object, d2);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptographicParameterOrchestrator.a = MultiContainerRegistry.a(5742661388733911956L, 221550948069901107L, MethodHandles.lookup().lookupClass()).a(145219721685252L);
                CryptographicParameterOrchestrator.j = new Object[11];
                CryptographicParameterOrchestrator.k = new String[11];
                CryptographicParameterOrchestrator.a();
                CryptographicParameterOrchestrator.i = new HashMap<K, V>(13);
                var0 = CryptographicParameterOrchestrator.a ^ 82984847105156L;
                CryptographicParameterOrchestrator.H(null);
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
                var6_5 = "\u0085;\u00d4\u0085s\u00a7\u0095\u00d0\u00a4&\u008f+n\u008d\u008b\u00d0\u001b\t\u00a6A\u007fm\u00ce64M\u001f\u00ed~g\u0090\rB\u00e2g\u0086\u008eT$\u0092\u007f\u00fa}p0\u00a8\u00f8\u00e0\u00ac\u008e5\u00bd6\u00dfp\u00cd";
                var7_6 = "\u0085;\u00d4\u0085s\u00a7\u0095\u00d0\u00a4&\u008f+n\u008d\u008b\u00d0\u001b\t\u00a6A\u007fm\u00ce64M\u001f\u00ed~g\u0090\rB\u00e2g\u0086\u008eT$\u0092\u007f\u00fa}p0\u00a8\u00f8\u00e0\u00ac\u008e5\u00bd6\u00dfp\u00cd".length();
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
lbl30:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u009b\u0013H\u00fdn\u009a^\u00946\u0012\u00bb\u00e2\u00bbcH\u00bf";
                    var7_6 = "\u009b\u0013H\u00fdn\u009a^\u00946\u0012\u00bb\u00e2\u00bbcH\u00bf".length();
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
lbl43:
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
lbl56:
                // 1 sources

                ** continue;
            }
        }
        CryptographicParameterOrchestrator.d = var8_3;
        CryptographicParameterOrchestrator.h = new Integer[9];
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptographicParameterOrchestrator.e(l, l2);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptographicParameterOrchestrator.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private Collection i(Object object) {
        return (Collection)this.c.T(object, new Object[0]);
    }

    static void K(CryptographicParameterOrchestrator cryptographicParameterOrchestrator, Object object, double d2) {
        cryptographicParameterOrchestrator.Z(object, d2);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptographicParameterOrchestrator.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public static void H(int[] nArray) {
        P = nArray;
    }

    private double a(Object object) {
        return this.B.s(object, new Object[0]);
    }

    private static void a() {
        Object[] objectArray = j;
        j[0] = "H\n\u000fJ";
        objectArray[1] = "g\u000b'W\n\u0014l\u00046\u0018w\f\u007f\u0003?Q";
        objectArray[2] = Boolean.TYPE;
        CryptographicParameterOrchestrator.k[2] = "java/lang/Boolean";
        objectArray[3] = "\u0001fFo\nD\niW gD\ntC";
        objectArray[4] = "e&>h`Z\u0010\u00065gq\u0015}\u00065ze\u0000";
        objectArray[5] = "Us!N";
        objectArray[6] = "yJ\t";
        objectArray[7] = Integer.TYPE;
        CryptographicParameterOrchestrator.k[7] = "java/lang/Integer";
        objectArray[8] = "\u0016-x%\u00125\u001d\"ijs;\u0016)m0";
        objectArray[9] = ":=N\\t:`,[mB\ni{\u001b\fwa(1XV\u000535*T\u0014yf?9Tm?d, \u001d\u0007dq x$Vhmo![\n<;iC\u001f\u000b}t\"zKR|{P";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "\u0006+tj/U\n/6oSAAJ2hbR\n7\u007f54W:s752XQ2}vh*";
    }

    private void k(Object object) {
        this.b.V(object);
    }

    static Set J(CryptographicParameterOrchestrator cryptographicParameterOrchestrator, Object object) {
        return cryptographicParameterOrchestrator.v(object);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (k[n4] != null) {
            return n4;
        }
        Object object = j[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 7;
                break;
            }
            case 1: {
                n3 = 1;
                break;
            }
            case 2: {
                n3 = 47;
                break;
            }
            case 3: {
                n3 = 50;
                break;
            }
            case 4: {
                n3 = 51;
                break;
            }
            case 5: {
                n3 = 27;
                break;
            }
            case 6: {
                n3 = 61;
                break;
            }
            case 7: {
                n3 = 37;
                break;
            }
            case 8: {
                n3 = 53;
                break;
            }
            case 9: {
                n3 = 6;
                break;
            }
            case 10: {
                n3 = 62;
                break;
            }
            case 11: {
                n3 = 5;
                break;
            }
            case 12: {
                n3 = 34;
                break;
            }
            case 13: {
                n3 = 33;
                break;
            }
            case 14: {
                n3 = 26;
                break;
            }
            case 15: {
                n3 = 41;
                break;
            }
            case 16: {
                n3 = 3;
                break;
            }
            case 17: {
                n3 = 29;
                break;
            }
            case 18: {
                n3 = 45;
                break;
            }
            case 19: {
                n3 = 48;
                break;
            }
            case 20: {
                n3 = 10;
                break;
            }
            case 21: {
                n3 = 55;
                break;
            }
            case 22: {
                n3 = 28;
                break;
            }
            case 23: {
                n3 = 15;
                break;
            }
            case 24: {
                n3 = 49;
                break;
            }
            case 25: {
                n3 = 56;
                break;
            }
            case 26: {
                n3 = 38;
                break;
            }
            case 27: {
                n3 = 22;
                break;
            }
            case 28: {
                n3 = 4;
                break;
            }
            case 29: {
                n3 = 35;
                break;
            }
            case 30: {
                n3 = 18;
                break;
            }
            case 31: {
                n3 = 43;
                break;
            }
            case 32: {
                n3 = 16;
                break;
            }
            case 33: {
                n3 = 31;
                break;
            }
            case 34: {
                n3 = 17;
                break;
            }
            case 35: {
                n3 = 39;
                break;
            }
            case 36: {
                n3 = 58;
                break;
            }
            case 37: {
                n3 = 19;
                break;
            }
            case 38: {
                n3 = 25;
                break;
            }
            case 39: {
                n3 = 40;
                break;
            }
            case 40: {
                n3 = 30;
                break;
            }
            case 41: {
                n3 = 52;
                break;
            }
            case 42: {
                n3 = 14;
                break;
            }
            case 43: {
                n3 = 0;
                break;
            }
            case 44: {
                n3 = 54;
                break;
            }
            case 45: {
                n3 = 21;
                break;
            }
            case 46: {
                n3 = 2;
                break;
            }
            case 47: {
                n3 = 8;
                break;
            }
            case 48: {
                n3 = 13;
                break;
            }
            case 49: {
                n3 = 42;
                break;
            }
            case 50: {
                n3 = 36;
                break;
            }
            case 51: {
                n3 = 57;
                break;
            }
            case 52: {
                n3 = 12;
                break;
            }
            case 53: {
                n3 = 11;
                break;
            }
            case 54: {
                n3 = 59;
                break;
            }
            case 55: {
                n3 = 20;
                break;
            }
            case 56: {
                n3 = 63;
                break;
            }
            case 57: {
                n3 = 9;
                break;
            }
            case 58: {
                n3 = 44;
                break;
            }
            case 59: {
                n3 = 24;
                break;
            }
            case 60: {
                n3 = 46;
                break;
            }
            case 61: {
                n3 = 32;
                break;
            }
            case 62: {
                n3 = 23;
                break;
            }
            default: {
                n3 = 60;
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
        CryptographicParameterOrchestrator.k[n4] = new String(cArray);
        return n4;
    }

    static Collection j(CryptographicParameterOrchestrator cryptographicParameterOrchestrator, Object object) {
        return cryptographicParameterOrchestrator.i(object);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptographicParameterOrchestrator.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptographicParameterOrchestrator.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 's' || c == '$' || c == '\u00c7' || c == 'Q') {
                field = CryptographicParameterOrchestrator.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 's' ? lookup.findGetter(clazz, string2, clazz2) : (c == '$' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c7' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptographicParameterOrchestrator.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'z' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            throw new RuntimeException("a/UL" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static void o(CryptographicParameterOrchestrator cryptographicParameterOrchestrator, Object object) {
        cryptographicParameterOrchestrator.k(object);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptographicParameterOrchestrator.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    static double G(CryptographicParameterOrchestrator cryptographicParameterOrchestrator, Object object) {
        return cryptographicParameterOrchestrator.a(object);
    }

    public static int[] h() {
        return P;
    }

    private static Field g(long l, long l2) {
        int n = CryptographicParameterOrchestrator.e(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptographicParameterOrchestrator.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptographicParameterOrchestrator.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptographicParameterOrchestrator.c(clazz3, string2, clazz2)) != null) {
                    CryptographicParameterOrchestrator.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptographicParameterOrchestrator.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptographicParameterOrchestrator.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptographicParameterOrchestrator.f(582191276750732L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public CryptographicParameterOrchestrator() {
        block8: {
            long l;
            block6: {
                block7: {
                    l = a ^ 0x549C089EC9A4L;
                    super(ReflectionMetadataResolver.Po);
                    this.g = CryptographicParameterOrchestrator.c("\u00d0", (Object)this, (Object)CryptographicParameterOrchestrator.c("z", (int)CryptographicParameterOrchestrator.b("v", (int)26562, (long)(0x16A37DC32ECAB900L ^ l)), (long)495357470801230748L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.Vs, (Object)new Class[]{UUID.class}, (long)495164710436151032L, (long)l);
                    int[] nArray = CryptographicParameterOrchestrator.h();
                    try {
                        try {
                            try {
                                this.f = CryptographicParameterOrchestrator.c("\u00d0", (Object)this, (Object)CryptographicParameterOrchestrator.c("z", (int)CryptographicParameterOrchestrator.b("v", (int)1943, (long)(0x14B5DD61D6885951L ^ l)), (long)495357470801230748L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{Double.TYPE}, (long)495164710436151032L, (long)l);
                                this.e = CryptographicParameterOrchestrator.c("\u00d0", (Object)this, (Object)CryptographicParameterOrchestrator.c("z", (int)CryptographicParameterOrchestrator.b("v", (int)21362, (long)(0x4EA853CE26648DB5L ^ l)), (long)495357470801230748L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.Vs}, (long)495164710436151032L, (long)l);
                                if (nArray != null) break block6;
                                if (GeometryCalculator.C() < 35) break block7;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicParameterOrchestrator.a(customSystemException);
                            }
                            this.B = CryptographicParameterOrchestrator.c("\u00d0", (Object)this, (Object)CryptographicParameterOrchestrator.c("z", (int)CryptographicParameterOrchestrator.b("v", (int)28785, (long)(0x3487D9379BC42EB2L ^ l)), (long)495357470801230748L, (long)l), (boolean)true, Double.TYPE, (Object)new Class[0], (long)495164710436151032L, (long)l);
                            this.c = CryptographicParameterOrchestrator.c("\u00d0", (Object)this, (Object)CryptographicParameterOrchestrator.c("z", (int)CryptographicParameterOrchestrator.b("v", (int)11157, (long)(0x3D031E5CF52F554L ^ l)), (long)495357470801230748L, (long)l), (boolean)ObjectLifecycleTracker.z, Set.class, (Object)new Class[0], (long)495164710436151032L, (long)l);
                            this.b = CryptographicParameterOrchestrator.c("\u00d0", (Object)this, (Object)CryptographicParameterOrchestrator.c("z", (int)CryptographicParameterOrchestrator.b("v", (int)15897, (long)(0x854702A095E60DCL ^ l)), (long)495357470801230748L, (long)l), (boolean)ObjectLifecycleTracker.z, Void.TYPE, (Object)new Class[0], (long)495164710436151032L, (long)l);
                            if (nArray == null) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicParameterOrchestrator.a(customSystemException);
                        }
                        AbstractComputationKernel.I(new String[2]);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicParameterOrchestrator.a(customSystemException);
                    }
                }
                this.B = CryptographicParameterOrchestrator.c("\u00d0", (Object)this, (Object)CryptographicParameterOrchestrator.c("z", (int)CryptographicParameterOrchestrator.b("v", (int)30126, (long)(0x4528DE03D4F12B62L ^ l)), (long)495357470801230748L, (long)l), (boolean)true, Double.TYPE, (Object)new Class[0], (long)495164710436151032L, (long)l);
                this.c = CryptographicParameterOrchestrator.c("\u00d0", (Object)this, (Object)CryptographicParameterOrchestrator.c("z", (int)CryptographicParameterOrchestrator.b("v", (int)836, (long)(0x28A6E41F2D5E5D84L ^ l)), (long)495357470801230748L, (long)l), (boolean)ObjectLifecycleTracker.z, Collection.class, (Object)new Class[0], (long)495164710436151032L, (long)l);
            }
            this.b = CryptographicParameterOrchestrator.c("\u00d0", (Object)this, (Object)CryptographicParameterOrchestrator.c("z", (int)CryptographicParameterOrchestrator.b("v", (int)4139, (long)(0x241FC3BE955ECEEFL ^ l)), (long)495357470801230748L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[0], (long)495164710436151032L, (long)l);
        }
    }

    private Object z(Object object, UUID uUID) {
        return this.g.T(object, uUID);
    }

    static Object R(CryptographicParameterOrchestrator cryptographicParameterOrchestrator, Object object, UUID uUID) {
        return cryptographicParameterOrchestrator.z(object, uUID);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = CryptographicParameterOrchestrator.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptographicParameterOrchestrator.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
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

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/UL" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5819;
        if (h[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])i.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/UL", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptographicParameterOrchestrator.h[n2] = n3;
        }
        return h[n2];
    }

    private Set v(Object object) {
        return (Set)this.c.T(object, new Object[0]);
    }

    static void K(CryptographicParameterOrchestrator cryptographicParameterOrchestrator, Object object, Object object2) {
        cryptographicParameterOrchestrator.A(object, object2);
    }

    private void A(Object object, Object object2) {
        this.e.l(object, object2);
    }

    private static Method h(long l, long l2) {
        int n = CryptographicParameterOrchestrator.e(l, l2);
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
                String string2 = k[n];
                int n3 = string2.indexOf(8);
                clazz3 = CryptographicParameterOrchestrator.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptographicParameterOrchestrator.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptographicParameterOrchestrator.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptographicParameterOrchestrator.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptographicParameterOrchestrator.f(582191276750732L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptographicParameterOrchestrator.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptographicParameterOrchestrator.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptographicParameterOrchestrator.f(582191276750732L, 0L);
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
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptographicParameterOrchestrator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CryptographicParameterOrchestrator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

