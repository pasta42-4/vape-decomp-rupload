/*
 * Decompiled with CFR 0.152.
 */
package com.data.transformation;

import a.HK;
import a.N9;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityService;
import com.system.lifecycle.ObjectLifecycleTracker;
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
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class TransformationOrchestrator
extends CryptoProtocolEngine {
    public final ReflectionUtilityService S;
    private static final long[] d;
    private HK G;
    public final ReflectionUtilityService B;
    public final HK n;
    private HK w;
    public final ReflectionUtilityService Q;
    private static final Map f;
    private HK F;
    public final ReflectionUtilityService P;
    private HK U;
    private HK p;
    private static final Object[] g;
    private final HK b;
    private static final String[] h;
    private static final long c;
    private HK K;
    public final ReflectionUtilityService J;
    private HK W;
    private HK V;
    private static final Integer[] e;
    private HK a;
    public final ReflectionUtilityService R;
    public HK D;

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

    private boolean x(Object object, Object object2) {
        return this.D.V(object, object2);
    }

    private static Field g(long l, long l2) {
        int n = TransformationOrchestrator.e(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            String string = h[n];
            int n2 = string.indexOf(8);
            Class clazz = TransformationOrchestrator.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = TransformationOrchestrator.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = TransformationOrchestrator.c(clazz3, string2, clazz2)) != null) {
                    TransformationOrchestrator.g[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = TransformationOrchestrator.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        TransformationOrchestrator.g[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = TransformationOrchestrator.f(711359309101195L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public double D(Object object) {
        return this.J.C(object);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = TransformationOrchestrator.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = TransformationOrchestrator.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = g;
        g[0] = "{\r\u0003\u001a";
        objectArray[1] = "\u001du\u000bbmk\u0016z\u001a-\u0010s\u0005}\u0013d";
        objectArray[2] = Boolean.TYPE;
        TransformationOrchestrator.h[2] = "java/lang/Boolean";
        objectArray[3] = "7 Zg6F</K([F<2_";
        objectArray[4] = "KAYKa\u0013>aRDp\\SaRYdI";
        objectArray[5] = "z\bBe";
        objectArray[6] = "npA";
        objectArray[7] = Integer.TYPE;
        TransformationOrchestrator.h[7] = "java/lang/Integer";
        objectArray[8] = "XdP\u0007";
        objectArray[9] = "I\u007f/\u00071\u0000<_$\b OQ_$\u00154Z";
        objectArray[10] = "/h+{y\u001d$g:4\u0018\u0013/l>n";
        objectArray[11] = "b:GX?M+%\u0018a\b&k{\u001f\\*@4$M\u0011O\u001f)\u007fH])^2{Uau\u001d ;\\\u0007~V1+$_!L1zY\fs\u0016,@\u0018Z$]l<I\u0013v@R";
        objectArray[12] = "\u0018R&#\u001c6QMy\u001a7]\u0011\u0013~'\t;NL,jldS\u0017)&\n%H\u00134\u001aVfZS=|]-KCE'\u001ca\u0015\u0012<p\u00151F(";
        objectArray[13] = "n\bvu`&'\u0017)LMMgI.qu+8\u0016|<\u0010t%Mypv5>IdL*v,\tm*!==\u0019\u0015r~'=Hh!,} r)w{6`\u000ex>)+^";
        Object[] objectArray2 = objectArray;
        objectArray[14] = "V\u001bCu\\o\fNC$``\u0011~@uZf\u0000\u0005\u0019,P4jGF.]n\f\u0018\u0019|\u0010\u000b";
    }

    private Object O(Object object, double d2, double d3, double d4) {
        return this.w.T(object, d2, d3, d4);
    }

    static Object X(TransformationOrchestrator transformationOrchestrator, Object object) {
        return transformationOrchestrator.y(object);
    }

    private Object y(Object object) {
        return this.p.T(object, new Object[0]);
    }

    private Object J(Object object, Object object2) {
        return this.V.T(object, object2);
    }

    private Object I(Object object, double d2) {
        return this.F.T(object, d2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                TransformationOrchestrator.c = MultiContainerRegistry.a(-2104323313612062858L, 4223289181282374708L, MethodHandles.lookup().lookupClass()).a(123530367390476L);
                TransformationOrchestrator.g = new Object[15];
                TransformationOrchestrator.h = new String[15];
                TransformationOrchestrator.a();
                TransformationOrchestrator.f = new HashMap<K, V>(13);
                var0 = TransformationOrchestrator.c ^ 96572317683801L;
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
                var8_3 = new long[24];
                var5_4 = 0;
                var6_5 = "\u00cf\u00b3=\u00126U\u00b1\u00c0\u00b7Wp\u0080w\f\u00a7\n\u0090t\u0084\u00ca\u0017\u00c4\u00a9h\u0093D\u001c\u00854\u0010\u00d7\u008a\u0088\u00a8\u00de\u0089\u00d1\u00e7\u00f9\b\u00d8#\u00cd\u009c\u00e0\u0095\u0006\u00b4\u00f01\u00e4\u00c1b\u0083\u00c7D\bm\u00ee\u00d8\u00d1\u001fK\u00c8\u0011\u001ax\u0083sMd:\u0080\u00801i\u00e4+\u00bb\u00fc\u00f6U\u001a\u00e9Hi!X\u00c4u\u00a2\u0088h\u0088\u00e2W\u00c7VS\u00ad\u000f\u001b*\u0002\u008a5\u0013\u00d3\u00dd\u00021\f\u008d\u0001\u009a_\u00a9\u00be\u0091\u009f\u00c0\u00ce\bL\u00f1~\u00f5\u00f7g\u00d7\u0096_mg\u0017R\u0012x\u00e0o\u008b\u009d\u00f0\u00e0'`:6&\u0097\u00ed\u000b\u00a1M\u0017\u00f4<h;\u0092Z\u007f\u0097;\u0083\u000eK\u0084\u0000\u0010\u001d\u001f\n\u0097\u0088\u00be";
                var7_6 = "\u00cf\u00b3=\u00126U\u00b1\u00c0\u00b7Wp\u0080w\f\u00a7\n\u0090t\u0084\u00ca\u0017\u00c4\u00a9h\u0093D\u001c\u00854\u0010\u00d7\u008a\u0088\u00a8\u00de\u0089\u00d1\u00e7\u00f9\b\u00d8#\u00cd\u009c\u00e0\u0095\u0006\u00b4\u00f01\u00e4\u00c1b\u0083\u00c7D\bm\u00ee\u00d8\u00d1\u001fK\u00c8\u0011\u001ax\u0083sMd:\u0080\u00801i\u00e4+\u00bb\u00fc\u00f6U\u001a\u00e9Hi!X\u00c4u\u00a2\u0088h\u0088\u00e2W\u00c7VS\u00ad\u000f\u001b*\u0002\u008a5\u0013\u00d3\u00dd\u00021\f\u008d\u0001\u009a_\u00a9\u00be\u0091\u009f\u00c0\u00ce\bL\u00f1~\u00f5\u00f7g\u00d7\u0096_mg\u0017R\u0012x\u00e0o\u008b\u009d\u00f0\u00e0'`:6&\u0097\u00ed\u000b\u00a1M\u0017\u00f4<h;\u0092Z\u007f\u0097;\u0083\u000eK\u0084\u0000\u0010\u001d\u001f\n\u0097\u0088\u00be".length();
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
                    var6_5 = "\u0004f\u00a5>'M\u0016\u00f2\u00ee\u000e\u0089\u00fc\u000b\u00f9j\u00d3";
                    var7_6 = "\u0004f\u00a5>'M\u0016\u00f2\u00ee\u000e\u0089\u00fc\u000b\u00f9j\u00d3".length();
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
        TransformationOrchestrator.d = var8_3;
        TransformationOrchestrator.e = new Integer[24];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/PQ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = TransformationOrchestrator.e(l, l2);
            object = g[n];
            try {
                if (!(object instanceof String)) break block2;
                TransformationOrchestrator.g[n] = clazz = Class.forName(h[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    static Object C(TransformationOrchestrator transformationOrchestrator, Object object, Object object2, Object object3) {
        return transformationOrchestrator.q(object, object2, object3);
    }

    static boolean E(TransformationOrchestrator transformationOrchestrator, Object object, Object object2) {
        return transformationOrchestrator.t(object, object2);
    }

    static Object O(TransformationOrchestrator transformationOrchestrator, Object object, Object object2) {
        return transformationOrchestrator.J(object, object2);
    }

    public Object i(Object object, Object object2, Object object3) {
        return this.a.T(object, object2, object3);
    }

    private static Method h(long l, long l2) {
        int n = TransformationOrchestrator.e(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = h[n];
                int n3 = string2.indexOf(8);
                clazz3 = TransformationOrchestrator.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = TransformationOrchestrator.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = TransformationOrchestrator.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        TransformationOrchestrator.g[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = TransformationOrchestrator.f(711359309101195L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = TransformationOrchestrator.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        TransformationOrchestrator.g[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = TransformationOrchestrator.f(711359309101195L, 0L);
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

    public double H(Object object) {
        return this.R.C(object);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = TransformationOrchestrator.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private Object h(Object object, double d2, double d3, double d4) {
        return this.U.T(object, d2, d3, d4);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/PQ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static Object n(TransformationOrchestrator transformationOrchestrator, Object object, double d2, double d3, double d4) {
        return transformationOrchestrator.h(object, d2, d3, d4);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (h[n4] != null) {
            return n4;
        }
        Object object = g[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 63;
                break;
            }
            case 1: {
                n3 = 35;
                break;
            }
            case 2: {
                n3 = 6;
                break;
            }
            case 3: {
                n3 = 46;
                break;
            }
            case 4: {
                n3 = 21;
                break;
            }
            case 5: {
                n3 = 53;
                break;
            }
            case 6: {
                n3 = 11;
                break;
            }
            case 7: {
                n3 = 12;
                break;
            }
            case 8: {
                n3 = 32;
                break;
            }
            case 9: {
                n3 = 36;
                break;
            }
            case 10: {
                n3 = 62;
                break;
            }
            case 11: {
                n3 = 27;
                break;
            }
            case 12: {
                n3 = 5;
                break;
            }
            case 13: {
                n3 = 43;
                break;
            }
            case 14: {
                n3 = 4;
                break;
            }
            case 15: {
                n3 = 8;
                break;
            }
            case 16: {
                n3 = 48;
                break;
            }
            case 17: {
                n3 = 3;
                break;
            }
            case 18: {
                n3 = 10;
                break;
            }
            case 19: {
                n3 = 9;
                break;
            }
            case 20: {
                n3 = 30;
                break;
            }
            case 21: {
                n3 = 37;
                break;
            }
            case 22: {
                n3 = 33;
                break;
            }
            case 23: {
                n3 = 54;
                break;
            }
            case 24: {
                n3 = 0;
                break;
            }
            case 25: {
                n3 = 18;
                break;
            }
            case 26: {
                n3 = 29;
                break;
            }
            case 27: {
                n3 = 60;
                break;
            }
            case 28: {
                n3 = 55;
                break;
            }
            case 29: {
                n3 = 42;
                break;
            }
            case 30: {
                n3 = 39;
                break;
            }
            case 31: {
                n3 = 51;
                break;
            }
            case 32: {
                n3 = 25;
                break;
            }
            case 33: {
                n3 = 26;
                break;
            }
            case 34: {
                n3 = 47;
                break;
            }
            case 35: {
                n3 = 14;
                break;
            }
            case 36: {
                n3 = 58;
                break;
            }
            case 37: {
                n3 = 44;
                break;
            }
            case 38: {
                n3 = 7;
                break;
            }
            case 39: {
                n3 = 19;
                break;
            }
            case 40: {
                n3 = 17;
                break;
            }
            case 41: {
                n3 = 49;
                break;
            }
            case 42: {
                n3 = 61;
                break;
            }
            case 43: {
                n3 = 40;
                break;
            }
            case 44: {
                n3 = 38;
                break;
            }
            case 45: {
                n3 = 28;
                break;
            }
            case 46: {
                n3 = 1;
                break;
            }
            case 47: {
                n3 = 45;
                break;
            }
            case 48: {
                n3 = 2;
                break;
            }
            case 49: {
                n3 = 34;
                break;
            }
            case 50: {
                n3 = 15;
                break;
            }
            case 51: {
                n3 = 57;
                break;
            }
            case 52: {
                n3 = 50;
                break;
            }
            case 53: {
                n3 = 16;
                break;
            }
            case 54: {
                n3 = 24;
                break;
            }
            case 55: {
                n3 = 31;
                break;
            }
            case 56: {
                n3 = 41;
                break;
            }
            case 57: {
                n3 = 59;
                break;
            }
            case 58: {
                n3 = 52;
                break;
            }
            case 59: {
                n3 = 22;
                break;
            }
            case 60: {
                n3 = 13;
                break;
            }
            case 61: {
                n3 = 56;
                break;
            }
            case 62: {
                n3 = 23;
                break;
            }
            default: {
                n3 = 20;
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
        TransformationOrchestrator.h[n4] = new String(cArray);
        return n4;
    }

    private Object q(Object object, Object object2, Object object3) {
        return this.G.T(object, object2, object3);
    }

    public double C(Object object) {
        return this.P.C(object);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'Y' || c == '\u00fc' || c == '\u00aa' || c == 'W') {
                field = TransformationOrchestrator.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'Y' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fc' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00aa' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = TransformationOrchestrator.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'm' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    static Object c(TransformationOrchestrator transformationOrchestrator, Object object, Object object2, double[] dArray, Object object3, double d2, double d3, double d4) {
        return transformationOrchestrator.W(object, object2, dArray, object3, d2, d3, d4);
    }

    public Object E(double d2, double d3, double d4, double d5, double d6, double d7) {
        return this.n.A(d2, d3, d4, d5, d6, d7);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = TransformationOrchestrator.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = TransformationOrchestrator.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public double A(Object object) {
        return this.Q.C(object);
    }

    public double M(Object object) {
        return this.B.C(object);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xBE4;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/PQ", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            TransformationOrchestrator.e[n2] = n3;
        }
        return e[n2];
    }

    static boolean l(TransformationOrchestrator transformationOrchestrator, Object object, Object object2) {
        return transformationOrchestrator.x(object, object2);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private Object W(Object object, Object object2, double[] dArray, Object object3, double d2, double d3, double d4) {
        return this.W.T(null, object, object2, dArray, object3, d2, d3, d4);
    }

    static Object o(TransformationOrchestrator transformationOrchestrator, Object object, double d2) {
        return transformationOrchestrator.I(object, d2);
    }

    public Object q(Object object, double d2, double d3, double d4) {
        return this.b.T(object, d2, d3, d4);
    }

    /*
     * Unable to fully structure code
     */
    public TransformationOrchestrator() {
        block35: {
            block33: {
                block32: {
                    block30: {
                        block29: {
                            block27: {
                                block28: {
                                    var1_1 = TransformationOrchestrator.c ^ 62820550219393L;
                                    super(ReflectionMetadataResolver.bU);
                                    this.J = TransformationOrchestrator.c("m", (Object)this, (Object)TransformationOrchestrator.c("\u00f1", (int)TransformationOrchestrator.b("t", (int)18503, (long)(698847615076322341L ^ var1_1)), (long)-8103978524306520160L, (long)var1_1), (boolean)true, Double.TYPE, (long)-8104135947064035350L, (long)var1_1);
                                    this.B = TransformationOrchestrator.c("m", (Object)this, (Object)TransformationOrchestrator.c("\u00f1", (int)TransformationOrchestrator.b("t", (int)24626, (long)(8638617310512243797L ^ var1_1)), (long)-8103978524306520160L, (long)var1_1), (boolean)true, Double.TYPE, (long)-8104135947064035350L, (long)var1_1);
                                    this.R = TransformationOrchestrator.c("m", (Object)this, (Object)TransformationOrchestrator.c("\u00f1", (int)TransformationOrchestrator.b("t", (int)8484, (long)(2320056788500620635L ^ var1_1)), (long)-8103978524306520160L, (long)var1_1), (boolean)true, Double.TYPE, (long)-8104135947064035350L, (long)var1_1);
                                    var3_2 = N9.I();
                                    try {
                                        try {
                                            try {
                                                this.Q = TransformationOrchestrator.c("m", (Object)this, (Object)TransformationOrchestrator.c("\u00f1", (int)TransformationOrchestrator.b("t", (int)1591, (long)(5670354131611714134L ^ var1_1)), (long)-8103978524306520160L, (long)var1_1), (boolean)true, Double.TYPE, (long)-8104135947064035350L, (long)var1_1);
                                                this.S = TransformationOrchestrator.c("m", (Object)this, (Object)TransformationOrchestrator.c("\u00f1", (int)TransformationOrchestrator.b("t", (int)27329, (long)(5754807845796245163L ^ var1_1)), (long)-8103978524306520160L, (long)var1_1), (boolean)true, Double.TYPE, (long)-8104135947064035350L, (long)var1_1);
                                                v0 = this;
                                                v1 = this;
                                                v2 = TransformationOrchestrator.c("\u00f1", (int)TransformationOrchestrator.b("t", (int)1244, (long)(8781530366186160319L ^ var1_1)), (long)-8103978524306520160L, (long)var1_1);
                                                v3 = true;
                                                v4 = Double.TYPE;
                                                if (var3_2 == null) break block27;
                                                v0.P = TransformationOrchestrator.c("m", (Object)v1, (Object)v2, (boolean)v3, v4, (long)-8104135947064035350L, (long)var1_1);
                                                if (GeometryCalculator.C() < 23) break block28;
                                            }
                                            catch (CustomSystemException v5) {
                                                throw TransformationOrchestrator.a(v5);
                                            }
                                            this.b = TransformationOrchestrator.c("m", (Object)this, (Object)TransformationOrchestrator.c("\u00f1", (int)TransformationOrchestrator.b("t", (int)8500, (long)(1797025297663599956L ^ var1_1)), (long)-8103978524306520160L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, (Object)ReflectionMetadataResolver.bU, (Object)new Class[]{Double.TYPE, Double.TYPE, Double.TYPE}, (long)-8103777294952176587L, (long)var1_1);
                                            if (var3_2 != null) break block29;
                                        }
                                        catch (CustomSystemException v6) {
                                            throw TransformationOrchestrator.a(v6);
                                        }
                                        AbstractComputationKernel.I(new String[4]);
                                    }
                                    catch (CustomSystemException v7) {
                                        throw TransformationOrchestrator.a(v7);
                                    }
                                }
                                v0 = this;
                                v1 = this;
                                v2 = TransformationOrchestrator.c("\u00f1", (int)TransformationOrchestrator.b("t", (int)8865, (long)(5415592696074577625L ^ var1_1)), (long)-8103978524306520160L, (long)var1_1);
                                v3 = true;
                                v4 = ReflectionMetadataResolver.bU;
                            }
                            v0.b = TransformationOrchestrator.c("m", (Object)v1, (Object)v2, (boolean)v3, v4, (Object)new Class[]{Double.TYPE, Double.TYPE, Double.TYPE}, (long)-8103777294952176587L, (long)var1_1);
                        }
                        try {
                            try {
                                v8 = GeometryCalculator.C();
                                v9 = 35;
                                if (var3_2 == null) break block30;
                                if (v8 >= v9) {
                                }
                                ** GOTO lbl99
                            }
                            catch (CustomSystemException v10) {
                                throw TransformationOrchestrator.a(v10);
                            }
                            v8 = GeometryCalculator.C();
                            v9 = 50;
                        }
                        catch (CustomSystemException v11) {
                            throw TransformationOrchestrator.a(v11);
                        }
                    }
                    try {
                        block31: {
                            try {
                                if (v8 < v9) break block31;
                                this.G = TransformationOrchestrator.c("m", (Object)this, (Object)TransformationOrchestrator.c("\u00f1", (int)TransformationOrchestrator.b("t", (int)29434, (long)(7326392345753810566L ^ var1_1)), (long)-8103978524306520160L, (long)var1_1), (boolean)true, Optional.class, (Object)new Class[]{ReflectionMetadataResolver.YN, ReflectionMetadataResolver.YN}, (long)-8103777294952176587L, (long)var1_1);
                                this.U = TransformationOrchestrator.c("m", (Object)this, (Object)TransformationOrchestrator.c("\u00f1", (int)TransformationOrchestrator.b("t", (int)8942, (long)(9055235172424656531L ^ var1_1)), (long)-8103978524306520160L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.bU, (Object)new Class[]{Double.TYPE, Double.TYPE, Double.TYPE}, (long)-8103777294952176587L, (long)var1_1);
                                this.K = TransformationOrchestrator.c("m", (Object)this, (Object)TransformationOrchestrator.c("\u00f1", (int)TransformationOrchestrator.b("t", (int)18689, (long)(3769233829052566894L ^ var1_1)), (long)-8103978524306520160L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.YN}, (long)-8103777294952176587L, (long)var1_1);
                                if (var3_2 != null) break block32;
                            }
                            catch (CustomSystemException v12) {
                                throw TransformationOrchestrator.a(v12);
                            }
                        }
                        this.G = TransformationOrchestrator.c("m", (Object)this, (Object)TransformationOrchestrator.c("\u00f1", (int)TransformationOrchestrator.b("t", (int)6618, (long)(2842930251506195900L ^ var1_1)), (long)-8103978524306520160L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Optional.class, (Object)new Class[]{ReflectionMetadataResolver.YN, ReflectionMetadataResolver.YN}, (long)-8103777294952176587L, (long)var1_1);
                        this.U = TransformationOrchestrator.c("m", (Object)this, (Object)TransformationOrchestrator.c("\u00f1", (int)TransformationOrchestrator.b("t", (int)3798, (long)(105535001375115966L ^ var1_1)), (long)-8103978524306520160L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, (Object)ReflectionMetadataResolver.bU, (Object)new Class[]{Double.TYPE, Double.TYPE, Double.TYPE}, (long)-8103777294952176587L, (long)var1_1);
                        this.K = TransformationOrchestrator.c("m", (Object)this, (Object)TransformationOrchestrator.c("\u00f1", (int)TransformationOrchestrator.b("t", (int)30324, (long)(270744754300678682L ^ var1_1)), (long)-8103978524306520160L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.YN}, (long)-8103777294952176587L, (long)var1_1);
                    }
                    catch (CustomSystemException v13) {
                        throw TransformationOrchestrator.a(v13);
                    }
                }
                try {
                    block34: {
                        try {
                            try {
                                this.W = TransformationOrchestrator.c("m", (Object)this, (Object)TransformationOrchestrator.c("\u00f1", (int)TransformationOrchestrator.b("t", (int)9955, (long)(8743190868791730831L ^ var1_1)), (long)-8103978524306520160L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Pb, (Object)new Class[]{ReflectionMetadataResolver.bU, ReflectionMetadataResolver.YN, double[].class, ReflectionMetadataResolver.Pb, Double.TYPE, Double.TYPE, Double.TYPE}, (long)-8104207416412919568L, (long)var1_1);
                                this.F = TransformationOrchestrator.c("m", (Object)this, (Object)TransformationOrchestrator.c("\u00f1", (int)TransformationOrchestrator.b("t", (int)4120, (long)(1453836828283769969L ^ var1_1)), (long)-8103978524306520160L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, (Object)ReflectionMetadataResolver.bU, (Object)new Class[]{Double.TYPE}, (long)-8103777294952176587L, (long)var1_1);
                                this.V = TransformationOrchestrator.c("m", (Object)this, (Object)TransformationOrchestrator.c("\u00f1", (int)TransformationOrchestrator.b("t", (int)2259, (long)(6701251759058816170L ^ var1_1)), (long)-8103978524306520160L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, (Object)ReflectionMetadataResolver.bU, (Object)new Class[]{ReflectionMetadataResolver.YN}, (long)-8103777294952176587L, (long)var1_1);
                                if (var3_2 == null) break block33;
                                if (!GameVersionEnumerator.MC_1_20_6.H()) break block34;
                            }
                            catch (CustomSystemException v14) {
                                throw TransformationOrchestrator.a(v14);
                            }
                            this.D = TransformationOrchestrator.c("m", (Object)this, (Object)TransformationOrchestrator.c("\u00f1", (int)TransformationOrchestrator.b("t", (int)23444, (long)(4604797488628719600L ^ var1_1)), (long)-8103978524306520160L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.bU}, (long)-8103777294952176587L, (long)var1_1);
                            if (var3_2 != null) break block35;
                        }
                        catch (CustomSystemException v15) {
                            throw TransformationOrchestrator.a(v15);
                        }
                    }
                    this.D = TransformationOrchestrator.c("m", (Object)this, (Object)TransformationOrchestrator.c("\u00f1", (int)TransformationOrchestrator.b("t", (int)30826, (long)(1069755854730984455L ^ var1_1)), (long)-8103978524306520160L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.bU}, (long)-8103777294952176587L, (long)var1_1);
                }
                catch (CustomSystemException v16) {
                    throw TransformationOrchestrator.a(v16);
                }
            }
            try {
                if (var3_2 != null) break block35;
lbl99:
                // 2 sources

                this.a = TransformationOrchestrator.c("m", (Object)this, (Object)TransformationOrchestrator.c("\u00f1", (int)TransformationOrchestrator.b("t", (int)14797, (long)(3653091268972395958L ^ var1_1)), (long)-8103978524306520160L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Er, (Object)new Class[]{ReflectionMetadataResolver.YN, ReflectionMetadataResolver.YN}, (long)-8103777294952176587L, (long)var1_1);
                this.D = TransformationOrchestrator.c("m", (Object)this, (Object)TransformationOrchestrator.c("\u00f1", (int)TransformationOrchestrator.b("t", (int)17455, (long)(8579378135658807364L ^ var1_1)), (long)-8103978524306520160L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.bU}, (long)-8103777294952176587L, (long)var1_1);
            }
            catch (CustomSystemException v17) {
                throw TransformationOrchestrator.a(v17);
            }
        }
        try {
            if (GeometryCalculator.C() == 13) {
                this.p = TransformationOrchestrator.c("m", (Object)this, (Object)TransformationOrchestrator.c("\u00f1", (int)TransformationOrchestrator.b("t", (int)22143, (long)(5988069750885470746L ^ var1_1)), (long)-8103978524306520160L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.bU, (Object)new Class[0], (long)-8103777294952176587L, (long)var1_1);
                this.w = TransformationOrchestrator.c("m", (Object)this, (Object)TransformationOrchestrator.c("\u00f1", (int)TransformationOrchestrator.b("t", (int)31889, (long)(3903918613624715503L ^ var1_1)), (long)-8103978524306520160L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.bU, (Object)new Class[]{Double.TYPE, Double.TYPE, Double.TYPE}, (long)-8103777294952176587L, (long)var1_1);
            }
        }
        catch (CustomSystemException v18) {
            throw TransformationOrchestrator.a(v18);
        }
        this.n = TransformationOrchestrator.c("m", (Object)this, (Object)TransformationOrchestrator.c("\u00f1", (int)TransformationOrchestrator.b("t", (int)28914, (long)(3730463710327829640L ^ var1_1)), (long)-8103978524306520160L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, (long)-8103777294952176587L, (long)var1_1);
    }

    private boolean t(Object object, Object object2) {
        return this.K.V(object, object2);
    }

    static Object r(TransformationOrchestrator transformationOrchestrator, Object object, double d2, double d3, double d4) {
        return transformationOrchestrator.O(object, d2, d3, d4);
    }

    public double W(Object object) {
        return this.S.C(object);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = TransformationOrchestrator.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(TransformationOrchestrator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(TransformationOrchestrator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

