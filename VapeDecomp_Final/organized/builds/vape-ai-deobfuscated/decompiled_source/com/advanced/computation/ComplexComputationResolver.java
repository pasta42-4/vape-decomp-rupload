/*
 * Decompiled with CFR 0.152.
 */
package com.advanced.computation;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkProtocolEncoder;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityService;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ComplexComputationResolver
extends CryptoProtocolEngine {
    private static final Object[] e;
    private final ReflectionUtilityService P;
    private final ReflectionUtilityService O;
    private static final long[] b;
    private final ReflectionUtilityService w;
    private static final Integer[] c;
    private final ReflectionUtilityService J;
    private final ReflectionUtilityService H;
    private static final long a;
    private final ReflectionUtilityService D;
    private final ReflectionUtilityService C;
    private final HK I;
    private final ReflectionUtilityService y;
    private static final Map d;
    private final ReflectionUtilityService R;
    private final ReflectionUtilityService G;
    public HK j;
    private static final String[] f;
    private final ReflectionUtilityService k;

    private double H(Object object) {
        return this.H.C(object);
    }

    static float Q(ComplexComputationResolver complexComputationResolver, Object object) {
        return complexComputationResolver.K(object);
    }

    static void g(ComplexComputationResolver complexComputationResolver, Object object, double d2) {
        complexComputationResolver.F(object, d2);
    }

    private static Method h(long l, long l2) {
        int n = ComplexComputationResolver.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = ComplexComputationResolver.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ComplexComputationResolver.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ComplexComputationResolver.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        ComplexComputationResolver.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ComplexComputationResolver.f(643239581941098L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ComplexComputationResolver.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ComplexComputationResolver.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ComplexComputationResolver.f(643239581941098L, 0L);
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

    private Object U(Object object) {
        return this.k.Z(object);
    }

    static Object A(ComplexComputationResolver complexComputationResolver, Object object) {
        return complexComputationResolver.U(object);
    }

    static void d(ComplexComputationResolver complexComputationResolver, Object object, float f) {
        complexComputationResolver.d(object, f);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ComplexComputationResolver.a = MultiContainerRegistry.a(-7507006628464144714L, -8549676041260184546L, MethodHandles.lookup().lookupClass()).a(203186362306553L);
                ComplexComputationResolver.e = new Object[13];
                ComplexComputationResolver.f = new String[13];
                ComplexComputationResolver.a();
                ComplexComputationResolver.d = new HashMap<K, V>(13);
                var0 = ComplexComputationResolver.a ^ 19631697830716L;
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
                var8_3 = new long[13];
                var5_4 = 0;
                var6_5 = "\u0014^s+\u001dW\u00b9\u00b4%6m\u00aa\u00bb\u00cf\u00f3(bQ\u00ae\u00a5\u0019F\u00fd-\u00ce\u0087\n\b\u00e0\u0002\u0007\u00d9\u00cd1'\u00c3\n\u0014\u0013C\u00ba^\u00d6\u00c4\u00cb\u001f\u0098&\u00ee\u00df\u00c1\u0015s\u00d9Ic\u0011a8\u00a4\u008e$\u00b5i\u0080@\u00b5z\u00b0\u00bc\u00b50m\u0001\u0014\u00a5\u00b9\u0017\u00ca\u00f33\u00c5\u00b7\u00e8Q\u00d6n\u00be";
                var7_6 = "\u0014^s+\u001dW\u00b9\u00b4%6m\u00aa\u00bb\u00cf\u00f3(bQ\u00ae\u00a5\u0019F\u00fd-\u00ce\u0087\n\b\u00e0\u0002\u0007\u00d9\u00cd1'\u00c3\n\u0014\u0013C\u00ba^\u00d6\u00c4\u00cb\u001f\u0098&\u00ee\u00df\u00c1\u0015s\u00d9Ic\u0011a8\u00a4\u008e$\u00b5i\u0080@\u00b5z\u00b0\u00bc\u00b50m\u0001\u0014\u00a5\u00b9\u0017\u00ca\u00f33\u00c5\u00b7\u00e8Q\u00d6n\u00be".length();
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
                    var6_5 = "{O\u00ab\u0093\u00f7`$\u00e8,\u00994\u00bf\u0088\u0082d\u0087";
                    var7_6 = "{O\u00ab\u0093\u00f7`$\u00e8,\u00994\u00bf\u0088\u0082d\u0087".length();
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
        ComplexComputationResolver.b = var8_3;
        ComplexComputationResolver.c = new Integer[13];
    }

    static void l(ComplexComputationResolver complexComputationResolver, Object object, boolean bl) {
        complexComputationResolver.M(object, bl);
    }

    static void H(ComplexComputationResolver complexComputationResolver, Object object, String string) {
        complexComputationResolver.T(object, string);
    }

    static void f(ComplexComputationResolver complexComputationResolver, Object object, double d2) {
        complexComputationResolver.c(object, d2);
    }

    private void c(Object object, double d2) {
        this.H.A(object, d2);
    }

    static void i(ComplexComputationResolver complexComputationResolver, Object object, double d2) {
        complexComputationResolver.T(object, d2);
    }

    private double h(Object object) {
        return this.P.C(object);
    }

    static void Y(ComplexComputationResolver complexComputationResolver, Object object, boolean bl) {
        complexComputationResolver.S(object, bl);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ComplexComputationResolver.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private double m(Object object) {
        return this.D.C(object);
    }

    private void F(Object object, double d2) {
        this.P.A(object, d2);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private void S(Object object, float f) {
        this.w.H(object, f);
    }

    static void X(ComplexComputationResolver complexComputationResolver, Object object, float f) {
        complexComputationResolver.S(object, f);
    }

    private void M(Object object, boolean bl) {
        this.G.B(object, bl);
    }

    static boolean P(ComplexComputationResolver complexComputationResolver, Object object) {
        return complexComputationResolver.l(object);
    }

    private void s(Object object, boolean bl) {
        this.J.B(object, bl);
    }

    static float b(ComplexComputationResolver complexComputationResolver, Object object) {
        return complexComputationResolver.B(object);
    }

    private int C(Object object) {
        return this.O.R(object);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ComplexComputationResolver.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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

    static boolean j(ComplexComputationResolver complexComputationResolver, Object object) {
        return complexComputationResolver.h(object);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/v6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static double Q(ComplexComputationResolver complexComputationResolver, Object object) {
        return complexComputationResolver.m(object);
    }

    private static Field g(long l, long l2) {
        int n = ComplexComputationResolver.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = ComplexComputationResolver.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ComplexComputationResolver.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ComplexComputationResolver.c(clazz3, string2, clazz2)) != null) {
                    ComplexComputationResolver.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ComplexComputationResolver.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ComplexComputationResolver.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ComplexComputationResolver.f(643239581941098L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void l(Object object, int n) {
        this.O.t(object, n);
    }

    private float B(Object object) {
        return this.w.x(object);
    }

    private void S(Object object, boolean bl) {
        this.C.B(object, bl);
    }

    private void T(Object object, double d2) {
        this.R.A(object, d2);
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = ",\u0012e%";
        objectArray[1] = "<#F_\n,7,W\u0010w4$+^Y";
        objectArray[2] = Boolean.TYPE;
        ComplexComputationResolver.f[2] = "java/lang/Boolean";
        objectArray[3] = "s\u0012tK\u0007\u0015x\u001de\u0004j\u0015x\u0000q";
        objectArray[4] = "\rw\"P( xW)_9o\u0015W)B-z";
        objectArray[5] = "Md|h";
        objectArray[6] = "N}x";
        objectArray[7] = Integer.TYPE;
        ComplexComputationResolver.f[7] = "java/lang/Integer";
        objectArray[8] = "4zhu";
        objectArray[9] = "h!\u000efr c.\u001f)\u0013.h%\u001bs";
        objectArray[10] = "8\u0016\n!_;kSAQ(\u0001\u007fEU(\u0002jpE\u0007QVa|WWh\ne?\u0014:k\fbjJW`\u0012mz)\u0000-T;xBU=W?\u0001\u0012D<\u001fa=I[h\u0003\u0001";
        objectArray[11] = "=x\u00075UCn=LE>yz+X<\b\u0012u+\nE\\\u0019y9Z|\u0000\u001d:z7\u007f\u0006\u001ao$Zt\u0018\u0015\u007fG\tx_\u0017x=\u0007%X\u0014\u0004";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "K\u001dEh<jJ_B{B8\f#\u001fq)+\u0013\u001aXx8+w]On;>\u001cRO<B";
    }

    static int P(ComplexComputationResolver complexComputationResolver, Object object) {
        return complexComputationResolver.C(object);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'w' || c == '\u00ff' || c == '\u00f2' || c == 'x') {
                field = ComplexComputationResolver.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'w' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ff' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ComplexComputationResolver.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 't' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f[n4] != null) {
            return n4;
        }
        Object object = e[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 21;
                break;
            }
            case 1: {
                n3 = 43;
                break;
            }
            case 2: {
                n3 = 3;
                break;
            }
            case 3: {
                n3 = 41;
                break;
            }
            case 4: {
                n3 = 8;
                break;
            }
            case 5: {
                n3 = 51;
                break;
            }
            case 6: {
                n3 = 63;
                break;
            }
            case 7: {
                n3 = 22;
                break;
            }
            case 8: {
                n3 = 36;
                break;
            }
            case 9: {
                n3 = 4;
                break;
            }
            case 10: {
                n3 = 29;
                break;
            }
            case 11: {
                n3 = 18;
                break;
            }
            case 12: {
                n3 = 28;
                break;
            }
            case 13: {
                n3 = 17;
                break;
            }
            case 14: {
                n3 = 48;
                break;
            }
            case 15: {
                n3 = 31;
                break;
            }
            case 16: {
                n3 = 2;
                break;
            }
            case 17: {
                n3 = 6;
                break;
            }
            case 18: {
                n3 = 30;
                break;
            }
            case 19: {
                n3 = 1;
                break;
            }
            case 20: {
                n3 = 57;
                break;
            }
            case 21: {
                n3 = 24;
                break;
            }
            case 22: {
                n3 = 12;
                break;
            }
            case 23: {
                n3 = 58;
                break;
            }
            case 24: {
                n3 = 13;
                break;
            }
            case 25: {
                n3 = 10;
                break;
            }
            case 26: {
                n3 = 0;
                break;
            }
            case 27: {
                n3 = 42;
                break;
            }
            case 28: {
                n3 = 60;
                break;
            }
            case 29: {
                n3 = 39;
                break;
            }
            case 30: {
                n3 = 19;
                break;
            }
            case 31: {
                n3 = 7;
                break;
            }
            case 32: {
                n3 = 33;
                break;
            }
            case 33: {
                n3 = 53;
                break;
            }
            case 34: {
                n3 = 5;
                break;
            }
            case 35: {
                n3 = 35;
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
                n3 = 54;
                break;
            }
            case 39: {
                n3 = 38;
                break;
            }
            case 40: {
                n3 = 46;
                break;
            }
            case 41: {
                n3 = 50;
                break;
            }
            case 42: {
                n3 = 15;
                break;
            }
            case 43: {
                n3 = 59;
                break;
            }
            case 44: {
                n3 = 61;
                break;
            }
            case 45: {
                n3 = 16;
                break;
            }
            case 46: {
                n3 = 37;
                break;
            }
            case 47: {
                n3 = 27;
                break;
            }
            case 48: {
                n3 = 52;
                break;
            }
            case 49: {
                n3 = 55;
                break;
            }
            case 50: {
                n3 = 45;
                break;
            }
            case 51: {
                n3 = 62;
                break;
            }
            case 52: {
                n3 = 11;
                break;
            }
            case 53: {
                n3 = 20;
                break;
            }
            case 54: {
                n3 = 34;
                break;
            }
            case 55: {
                n3 = 25;
                break;
            }
            case 56: {
                n3 = 56;
                break;
            }
            case 57: {
                n3 = 9;
                break;
            }
            case 58: {
                n3 = 14;
                break;
            }
            case 59: {
                n3 = 23;
                break;
            }
            case 60: {
                n3 = 40;
                break;
            }
            case 61: {
                n3 = 32;
                break;
            }
            case 62: {
                n3 = 26;
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
        ComplexComputationResolver.f[n4] = new String(cArray);
        return n4;
    }

    static void H(ComplexComputationResolver complexComputationResolver, Object object, boolean bl) {
        complexComputationResolver.s(object, bl);
    }

    private double v(Object object) {
        return this.R.C(object);
    }

    static void Q(ComplexComputationResolver complexComputationResolver, Object object, double d2) {
        complexComputationResolver.I(object, d2);
    }

    static double W(ComplexComputationResolver complexComputationResolver, Object object) {
        return complexComputationResolver.h(object);
    }

    private float K(Object object) {
        return this.y.x(object);
    }

    private void d(Object object, float f) {
        this.y.H(object, f);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ComplexComputationResolver.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                ComplexComputationResolver.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public ComplexComputationResolver() {
        long l = a ^ 0x75BBFA7AB3F2L;
        super(ReflectionMetadataResolver.Fm);
        this.k = ComplexComputationResolver.c("\u00a5", (Object)this, (Object)ComplexComputationResolver.c("t", (int)ComplexComputationResolver.b("s", (int)12638, (long)(0x64FC316D4EA6998DL ^ l)), (long)1041597430036314765L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.US, (long)1041891048568292201L, (long)l);
        this.C = ComplexComputationResolver.c("\u00a5", (Object)this, (Object)ComplexComputationResolver.c("t", (int)ComplexComputationResolver.b("s", (int)30308, (long)(0x505BAE5FBC525EB4L ^ l)), (long)1041597430036314765L, (long)l), (boolean)true, Boolean.TYPE, (long)1041891048568292201L, (long)l);
        this.J = ComplexComputationResolver.c("\u00a5", (Object)this, (Object)ComplexComputationResolver.c("t", (int)ComplexComputationResolver.b("s", (int)2833, (long)(0x26DF94E8774223C4L ^ l)), (long)1041597430036314765L, (long)l), (boolean)true, Boolean.TYPE, (long)1041891048568292201L, (long)l);
        this.D = ComplexComputationResolver.c("\u00a5", (Object)this, (Object)ComplexComputationResolver.c("t", (int)ComplexComputationResolver.b("s", (int)31108, (long)(0x67083ED5280A515AL ^ l)), (long)1041597430036314765L, (long)l), (boolean)true, Double.TYPE, (long)1041891048568292201L, (long)l);
        this.R = ComplexComputationResolver.c("\u00a5", (Object)this, (Object)ComplexComputationResolver.c("t", (int)ComplexComputationResolver.b("s", (int)26471, (long)(0xF8D4B5E23634FB1L ^ l)), (long)1041597430036314765L, (long)l), (boolean)true, Double.TYPE, (long)1041891048568292201L, (long)l);
        AbstractComputationKernel[] abstractComputationKernelArray = NetworkProtocolEncoder.J();
        try {
            this.P = ComplexComputationResolver.c("\u00a5", (Object)this, (Object)ComplexComputationResolver.c("t", (int)ComplexComputationResolver.b("s", (int)31826, (long)(0x7AD1C0E22826548DL ^ l)), (long)1041597430036314765L, (long)l), (boolean)true, Double.TYPE, (long)1041891048568292201L, (long)l);
            this.H = ComplexComputationResolver.c("\u00a5", (Object)this, (Object)ComplexComputationResolver.c("t", (int)ComplexComputationResolver.b("s", (int)17385, (long)(0x2E1D9FD1C94AEB34L ^ l)), (long)1041597430036314765L, (long)l), (boolean)true, Double.TYPE, (long)1041891048568292201L, (long)l);
            this.y = ComplexComputationResolver.c("\u00a5", (Object)this, (Object)ComplexComputationResolver.c("t", (int)ComplexComputationResolver.b("s", (int)963, (long)(0x7B63350ADE35AB14L ^ l)), (long)1041597430036314765L, (long)l), (boolean)true, Float.TYPE, (long)1041891048568292201L, (long)l);
            this.w = ComplexComputationResolver.c("\u00a5", (Object)this, (Object)ComplexComputationResolver.c("t", (int)ComplexComputationResolver.b("s", (int)7684, (long)(0x3A36AF4EA1B636D5L ^ l)), (long)1041597430036314765L, (long)l), (boolean)true, Float.TYPE, (long)1041891048568292201L, (long)l);
            this.O = ComplexComputationResolver.c("\u00a5", (Object)this, (Object)ComplexComputationResolver.c("t", (int)ComplexComputationResolver.b("s", (int)14296, (long)(0x80068EF2DF51F04L ^ l)), (long)1041597430036314765L, (long)l), (boolean)true, Integer.TYPE, (long)1041891048568292201L, (long)l);
            this.G = ComplexComputationResolver.c("\u00a5", (Object)this, (Object)ComplexComputationResolver.c("t", (int)ComplexComputationResolver.b("s", (int)1702, (long)(0x21F98D88662FAE72L ^ l)), (long)1041597430036314765L, (long)l), (boolean)true, Boolean.TYPE, (long)1041891048568292201L, (long)l);
            this.I = ComplexComputationResolver.c("\u00a5", (Object)this, (Object)ComplexComputationResolver.c("t", (int)ComplexComputationResolver.b("s", (int)10703, (long)(0x332C3904B2D8117L ^ l)), (long)1041597430036314765L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{String.class}, (long)1042014697981970521L, (long)l);
            this.j = ComplexComputationResolver.c("\u00a5", (Object)this, (Object)ComplexComputationResolver.c("t", (int)ComplexComputationResolver.b("s", (int)15448, (long)(0x252ADAB82CC5948AL ^ l)), (long)1041597430036314765L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[0], (long)1042014697981970521L, (long)l);
            if (AbstractComputationKernel.J() != null) {
                NetworkProtocolEncoder.M(new AbstractComputationKernel[2]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ComplexComputationResolver.a(customSystemException);
        }
    }

    static double z(ComplexComputationResolver complexComputationResolver, Object object) {
        return complexComputationResolver.v(object);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/v6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x26A3;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/v6", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ComplexComputationResolver.c[n2] = n3;
        }
        return c[n2];
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = ComplexComputationResolver.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ComplexComputationResolver.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    static double u(ComplexComputationResolver complexComputationResolver, Object object) {
        return complexComputationResolver.H(object);
    }

    private void T(Object object, String string) {
        this.I.l(object, string);
    }

    private void I(Object object, double d2) {
        this.D.A(object, d2);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private boolean l(Object object) {
        return this.C.R(object);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ComplexComputationResolver.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ComplexComputationResolver.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private boolean h(Object object) {
        return this.J.R(object);
    }

    static void C(ComplexComputationResolver complexComputationResolver, Object object, int n) {
        complexComputationResolver.l(object, n);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ComplexComputationResolver.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ComplexComputationResolver.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

