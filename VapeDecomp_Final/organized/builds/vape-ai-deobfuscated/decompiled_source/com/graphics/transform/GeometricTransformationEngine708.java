/*
 * Decompiled with CFR 0.152.
 */
package com.graphics.transform;

import a.Ya;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.random.generation.RandomGenerationEngine;
import com.security.crypto.CryptographicSecurityProvider;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class GeometricTransformationEngine708 {
    public final float s;
    public final float S;
    public final boolean x;
    private static final String[] g;
    private static final Object[] f;
    private static final long[] b;
    public final float C;
    public final float p;
    public final float c;
    public final float Q;
    private static final Map e;
    public final float h;
    private static final Integer[] d;
    private static final long a;
    public final float T;

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = GeometricTransformationEngine708.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = GeometricTransformationEngine708.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = GeometricTransformationEngine708.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = GeometricTransformationEngine708.b(classArray[i], string, clazz2);
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
            int n = GeometricTransformationEngine708.a(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                GeometricTransformationEngine708.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "P>_";
        objectArray[1] = Integer.TYPE;
        GeometricTransformationEngine708.g[1] = "java/lang/Integer";
        objectArray[2] = "\u0015\u0017%^A\r\u001e\u00184\u0011<\u0015\r\u001f=X";
        objectArray[3] = "r\u000eR\u00199#y\u0001CVX-r\nG\f";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u001c1kVByC176\u0012~rafW\u00185\u001c4tD\u0014\u0005K!qZG8\u0002?zFy";
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e4' || c == '\u00fe' || c == 'V' || c == 'I') {
                field = GeometricTransformationEngine708.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e4' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fe' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'V' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = GeometricTransformationEngine708.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public GeometricTransformationEngine708(RandomGenerationEngine randomGenerationEngine, float f, float f2) {
        this.s = randomGenerationEngine.R();
        this.S = randomGenerationEngine.N();
        if (randomGenerationEngine instanceof Ya) {
            this.h = ((Ya)randomGenerationEngine).I();
            this.c = ((Ya)randomGenerationEngine).G();
        } else {
            this.h = -1.0f;
            this.c = -1.0f;
        }
        this.Q = randomGenerationEngine.p();
        this.C = randomGenerationEngine.u();
        this.x = randomGenerationEngine.F();
        this.T = f;
        this.p = f2;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = GeometricTransformationEngine708.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method d(long l, long l2) {
        int n = GeometricTransformationEngine708.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = g[n];
                int n3 = string2.indexOf(8);
                clazz3 = GeometricTransformationEngine708.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = GeometricTransformationEngine708.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = GeometricTransformationEngine708.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        GeometricTransformationEngine708.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = GeometricTransformationEngine708.b(249084676696072L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = GeometricTransformationEngine708.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        GeometricTransformationEngine708.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = GeometricTransformationEngine708.b(249084676696072L, 0L);
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3820;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
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
                throw new RuntimeException("a/ky", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            GeometricTransformationEngine708.d[n2] = n3;
        }
        return d[n2];
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

    private static Field c(long l, long l2) {
        int n = GeometricTransformationEngine708.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = GeometricTransformationEngine708.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = GeometricTransformationEngine708.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = GeometricTransformationEngine708.a(clazz3, string2, clazz2)) != null) {
                    GeometricTransformationEngine708.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = GeometricTransformationEngine708.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        GeometricTransformationEngine708.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = GeometricTransformationEngine708.b(249084676696072L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public String m(GeometricTransformationEngine708 geometricTransformationEngine708) {
        long l = a ^ 0x64FD151707B3L;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            if (this.s != geometricTransformationEngine708.s) {
                stringBuilder.append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)28097, (long)(0x27AF8AEB10DC0B5CL ^ l)), (long)6819992572076051815L, (long)l))).append(geometricTransformationEngine708.s).append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)12696, (long)(0x29B565A0D7AD570EL ^ l)), (long)6819992572076051815L, (long)l))).append(this.s).append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)19552, (long)(0x3EC18C961E55AAEFL ^ l)), (long)6819992572076051815L, (long)l)));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeometricTransformationEngine708.a(customSystemException);
        }
        try {
            if (this.S != geometricTransformationEngine708.S) {
                stringBuilder.append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)2199, (long)(0x775ECAF596EA6E0FL ^ l)), (long)6819992572076051815L, (long)l))).append(geometricTransformationEngine708.S).append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)27743, (long)(0x331F60DF98E60AC4L ^ l)), (long)6819992572076051815L, (long)l))).append(this.S).append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)16677, (long)(0x7D16B224DDDEA7BAL ^ l)), (long)6819992572076051815L, (long)l)));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeometricTransformationEngine708.a(customSystemException);
        }
        try {
            if (this.h != geometricTransformationEngine708.h) {
                stringBuilder.append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)2283, (long)(0xA3174F635926E61L ^ l)), (long)6819992572076051815L, (long)l))).append(geometricTransformationEngine708.h).append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)21270, (long)(0x3E3D3AE37267B594L ^ l)), (long)6819992572076051815L, (long)l))).append(this.h).append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)17947, (long)(0x7B1115B983F2209EL ^ l)), (long)6819992572076051815L, (long)l)));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeometricTransformationEngine708.a(customSystemException);
        }
        try {
            if (this.c != geometricTransformationEngine708.c) {
                stringBuilder.append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)1078, (long)(0x28AC3100B6F262AAL ^ l)), (long)6819992572076051815L, (long)l))).append(geometricTransformationEngine708.c).append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)3280, (long)(0x354003508C0CEA53L ^ l)), (long)6819992572076051815L, (long)l))).append(this.c).append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)20438, (long)(0x73666C2C106F2956L ^ l)), (long)6819992572076051815L, (long)l)));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeometricTransformationEngine708.a(customSystemException);
        }
        try {
            if (this.Q != geometricTransformationEngine708.Q) {
                stringBuilder.append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)29871, (long)(0x14407AF01AAB923AL ^ l)), (long)6819992572076051815L, (long)l))).append(geometricTransformationEngine708.Q).append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)10858, (long)(0x3A039D946A874CE3L ^ l)), (long)6819992572076051815L, (long)l))).append(this.Q).append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)25647, (long)(0x2D7A27C0B71F82BCL ^ l)), (long)6819992572076051815L, (long)l)));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeometricTransformationEngine708.a(customSystemException);
        }
        try {
            if (this.C != geometricTransformationEngine708.C) {
                stringBuilder.append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)20684, (long)(0x22766431E8453644L ^ l)), (long)6819992572076051815L, (long)l))).append(geometricTransformationEngine708.C).append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)453, (long)(0x77F6453558AD6754L ^ l)), (long)6819992572076051815L, (long)l))).append(this.C).append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)20004, (long)(0x1A26C9C35DAA28A9L ^ l)), (long)6819992572076051815L, (long)l)));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeometricTransformationEngine708.a(customSystemException);
        }
        try {
            if (this.x != geometricTransformationEngine708.x) {
                stringBuilder.append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)19857, (long)(0x5FAA157119342B36L ^ l)), (long)6819992572076051815L, (long)l))).append(geometricTransformationEngine708.x).append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)17824, (long)(0x567B7CE861D52305L ^ l)), (long)6819992572076051815L, (long)l))).append(this.x).append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)19372, (long)(0x1BAAFD2805862D3CL ^ l)), (long)6819992572076051815L, (long)l)));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeometricTransformationEngine708.a(customSystemException);
        }
        try {
            if (this.T != geometricTransformationEngine708.T) {
                stringBuilder.append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)5719, (long)(0xD6FD150EA35F0D3L ^ l)), (long)6819992572076051815L, (long)l))).append(geometricTransformationEngine708.T).append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)5635, (long)(0x1B6B582A05FDF09AL ^ l)), (long)6819992572076051815L, (long)l))).append(this.T).append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)10835, (long)(0x2B39B078E365CCF3L ^ l)), (long)6819992572076051815L, (long)l)));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeometricTransformationEngine708.a(customSystemException);
        }
        try {
            if (this.p != geometricTransformationEngine708.p) {
                stringBuilder.append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)18402, (long)(0x657ED3BB34D5A16CL ^ l)), (long)6819992572076051815L, (long)l))).append(geometricTransformationEngine708.p).append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)16724, (long)(0x3204F7EA97E3A7C6L ^ l)), (long)6819992572076051815L, (long)l))).append(this.p).append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)124, (long)(0x26CC5485E8A3E6E2L ^ l)), (long)6819992572076051815L, (long)l)));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeometricTransformationEngine708.a(customSystemException);
        }
        return stringBuilder.toString();
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/ky" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public GeometricTransformationEngine708(CryptographicSecurityProvider cryptographicSecurityProvider) {
        this(cryptographicSecurityProvider, cryptographicSecurityProvider.P(), cryptographicSecurityProvider.v());
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (g[n4] != null) {
            return n4;
        }
        Object object = f[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 51;
                break;
            }
            case 1: {
                n3 = 23;
                break;
            }
            case 2: {
                n3 = 17;
                break;
            }
            case 3: {
                n3 = 9;
                break;
            }
            case 4: {
                n3 = 56;
                break;
            }
            case 5: {
                n3 = 40;
                break;
            }
            case 6: {
                n3 = 14;
                break;
            }
            case 7: {
                n3 = 46;
                break;
            }
            case 8: {
                n3 = 33;
                break;
            }
            case 9: {
                n3 = 54;
                break;
            }
            case 10: {
                n3 = 58;
                break;
            }
            case 11: {
                n3 = 28;
                break;
            }
            case 12: {
                n3 = 52;
                break;
            }
            case 13: {
                n3 = 48;
                break;
            }
            case 14: {
                n3 = 2;
                break;
            }
            case 15: {
                n3 = 18;
                break;
            }
            case 16: {
                n3 = 27;
                break;
            }
            case 17: {
                n3 = 20;
                break;
            }
            case 18: {
                n3 = 45;
                break;
            }
            case 19: {
                n3 = 15;
                break;
            }
            case 20: {
                n3 = 13;
                break;
            }
            case 21: {
                n3 = 59;
                break;
            }
            case 22: {
                n3 = 63;
                break;
            }
            case 23: {
                n3 = 5;
                break;
            }
            case 24: {
                n3 = 24;
                break;
            }
            case 25: {
                n3 = 0;
                break;
            }
            case 26: {
                n3 = 50;
                break;
            }
            case 27: {
                n3 = 60;
                break;
            }
            case 28: {
                n3 = 29;
                break;
            }
            case 29: {
                n3 = 7;
                break;
            }
            case 30: {
                n3 = 49;
                break;
            }
            case 31: {
                n3 = 8;
                break;
            }
            case 32: {
                n3 = 11;
                break;
            }
            case 33: {
                n3 = 12;
                break;
            }
            case 34: {
                n3 = 3;
                break;
            }
            case 35: {
                n3 = 25;
                break;
            }
            case 36: {
                n3 = 47;
                break;
            }
            case 37: {
                n3 = 32;
                break;
            }
            case 38: {
                n3 = 35;
                break;
            }
            case 39: {
                n3 = 31;
                break;
            }
            case 40: {
                n3 = 36;
                break;
            }
            case 41: {
                n3 = 55;
                break;
            }
            case 42: {
                n3 = 26;
                break;
            }
            case 43: {
                n3 = 34;
                break;
            }
            case 44: {
                n3 = 62;
                break;
            }
            case 45: {
                n3 = 42;
                break;
            }
            case 46: {
                n3 = 43;
                break;
            }
            case 47: {
                n3 = 22;
                break;
            }
            case 48: {
                n3 = 44;
                break;
            }
            case 49: {
                n3 = 1;
                break;
            }
            case 50: {
                n3 = 38;
                break;
            }
            case 51: {
                n3 = 53;
                break;
            }
            case 52: {
                n3 = 10;
                break;
            }
            case 53: {
                n3 = 21;
                break;
            }
            case 54: {
                n3 = 19;
                break;
            }
            case 55: {
                n3 = 39;
                break;
            }
            case 56: {
                n3 = 57;
                break;
            }
            case 57: {
                n3 = 30;
                break;
            }
            case 58: {
                n3 = 4;
                break;
            }
            case 59: {
                n3 = 16;
                break;
            }
            case 60: {
                n3 = 6;
                break;
            }
            case 61: {
                n3 = 41;
                break;
            }
            case 62: {
                n3 = 61;
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
        GeometricTransformationEngine708.g[n4] = new String(cArray);
        return n4;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/ky" + " : " + string + " : " + methodType.toString(), exception);
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

    public static String j(List<GeometricTransformationEngine708> list) {
        long l = a ^ 0x5CBBEF1940B4L;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)2239, (long)(0x4629FDAD4944A92FL ^ l)), (long)1847112854212905568L, (long)l)));
        for (GeometricTransformationEngine708 geometricTransformationEngine708 : list) {
            stringBuilder.append(geometricTransformationEngine708.h).append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)31661, (long)(0x2AA2308BA827DA21L ^ l)), (long)1847112854212905568L, (long)l))).append(geometricTransformationEngine708.c).append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)9412, (long)(0x776221EB5792054FL ^ l)), (long)1847112854212905568L, (long)l))).append(geometricTransformationEngine708.s).append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)5910, (long)(0x61CDC35B2E7DB6B7L ^ l)), (long)1847112854212905568L, (long)l))).append(geometricTransformationEngine708.S).append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)26160, (long)(0x58F646FF0365C7B0L ^ l)), (long)1847112854212905568L, (long)l))).append(geometricTransformationEngine708.Q).append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)19183, (long)(0x25F9A1A1644CEB72L ^ l)), (long)1847112854212905568L, (long)l))).append(geometricTransformationEngine708.C).append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)12504, (long)(0x5D75FD1ED235114BL ^ l)), (long)1847112854212905568L, (long)l))).append(geometricTransformationEngine708.x).append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)21351, (long)(0x4E7F0C32238AF2C4L ^ l)), (long)1847112854212905568L, (long)l))).append(geometricTransformationEngine708.T).append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)18360, (long)(0x29F1CA57D278663EL ^ l)), (long)1847112854212905568L, (long)l))).append(geometricTransformationEngine708.p).append((String)((Object)GeometricTransformationEngine708.b("\u00d3", (int)GeometricTransformationEngine708.a("r", (int)16552, (long)(0x5A284AA598F76129L ^ l)), (long)1847112854212905568L, (long)l)));
        }
        return stringBuilder.toString();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                GeometricTransformationEngine708.a = MultiContainerRegistry.a(4020395262938320797L, -8119234395179349981L, MethodHandles.lookup().lookupClass()).a(57616963728831L);
                GeometricTransformationEngine708.f = new Object[5];
                GeometricTransformationEngine708.g = new String[5];
                GeometricTransformationEngine708.a();
                GeometricTransformationEngine708.e = new HashMap<K, V>(13);
                var0 = GeometricTransformationEngine708.a ^ 81005643519290L;
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
                var8_3 = new long[37];
                var5_4 = 0;
                var6_5 = "\u00f3h\u0087)9\u0095f&mw\u008f\u00a5\u00b3e:\u00ec\u009d\u00e9o\u0087W\rk)\u001d\u00a7b0\u00ee\u0087\\m1{\u0080\u00f8\u00f2\u00fa\u00c3\u0093\u0095\u00af\u0082H\u000b\u00f81H\u00ad\u00827\u00b3\u0018,\u00d2\u00f6\u0007'\u00bdX\u00f6f\u00b35U\u00d3\u000bIG\u008a\u008a1\u00a3\u00db\u00af\u00b9\u00e8\u0093\u00ff\u00ca\u009a\u0085dO\u00e2~n\u00d9~\u0084\u00a1\u008dj\u00be\u00a2\"4!\u0094\u000f\u00b8\u0098\u00ea\u000e6\u00e9\u009b\u0000\u00ec\u000f\u00bfj\u00bd\u00c8qK\u00c9\u00cf\u00daO<Y\u0092n\u00f6\u0015\u00dbC\u00d3\u00ec2\f\u008e\u00f0\u0099[\u0011VS\u00f5\u00dfu\u00dd\u0096\u00a8\u0098\u0019W\u00f2F&s\u0086h\u00f8\u00d0\u00c1\\N\u00dc\u000e\u00c6Ki\\\u00eb\u00b5\u00aa\u00dd\u0091[\u008d\u008a\u0092\u0007\u00cd\u0012\u0005\u00fa\u00fcnv\u00b3~\u00dcU9UX\u008f5\u00f8\u008eB\u00b1e}j\u00d0\u00a2\u00ebr|Y\u00b1\u00bf\u0081\u00bd\u00ad\u0083\u00d6\u0007\u0093g\u0081_\u00ee\u00e9/\u00b96\f$$\u00ad\u00c4c\u0007l5\u00d4\u00fd\u0098V\u007f\u00ec\u00ca\u00fb\u0006\u00e7#\u00ed\u0091[1@2!\u00fc\u00d3y\u00912\u00dd\u000e\f#ZE\u00ddB\u00a8\u00cfHBB\u00fdt\u00a7\u00a0\u0017W\u0013J\u0000D\u008f\u00a3\u0092X";
                var7_6 = "\u00f3h\u0087)9\u0095f&mw\u008f\u00a5\u00b3e:\u00ec\u009d\u00e9o\u0087W\rk)\u001d\u00a7b0\u00ee\u0087\\m1{\u0080\u00f8\u00f2\u00fa\u00c3\u0093\u0095\u00af\u0082H\u000b\u00f81H\u00ad\u00827\u00b3\u0018,\u00d2\u00f6\u0007'\u00bdX\u00f6f\u00b35U\u00d3\u000bIG\u008a\u008a1\u00a3\u00db\u00af\u00b9\u00e8\u0093\u00ff\u00ca\u009a\u0085dO\u00e2~n\u00d9~\u0084\u00a1\u008dj\u00be\u00a2\"4!\u0094\u000f\u00b8\u0098\u00ea\u000e6\u00e9\u009b\u0000\u00ec\u000f\u00bfj\u00bd\u00c8qK\u00c9\u00cf\u00daO<Y\u0092n\u00f6\u0015\u00dbC\u00d3\u00ec2\f\u008e\u00f0\u0099[\u0011VS\u00f5\u00dfu\u00dd\u0096\u00a8\u0098\u0019W\u00f2F&s\u0086h\u00f8\u00d0\u00c1\\N\u00dc\u000e\u00c6Ki\\\u00eb\u00b5\u00aa\u00dd\u0091[\u008d\u008a\u0092\u0007\u00cd\u0012\u0005\u00fa\u00fcnv\u00b3~\u00dcU9UX\u008f5\u00f8\u008eB\u00b1e}j\u00d0\u00a2\u00ebr|Y\u00b1\u00bf\u0081\u00bd\u00ad\u0083\u00d6\u0007\u0093g\u0081_\u00ee\u00e9/\u00b96\f$$\u00ad\u00c4c\u0007l5\u00d4\u00fd\u0098V\u007f\u00ec\u00ca\u00fb\u0006\u00e7#\u00ed\u0091[1@2!\u00fc\u00d3y\u00912\u00dd\u000e\f#ZE\u00ddB\u00a8\u00cfHBB\u00fdt\u00a7\u00a0\u0017W\u0013J\u0000D\u008f\u00a3\u0092X".length();
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
                    var6_5 = "\u00a6(\u001d\u001e\u00fd\u00cd\u0092\u00a8\u00d1r\u008a\u00a6Zm\u000bd";
                    var7_6 = "\u00a6(\u001d\u001e\u00fd\u00cd\u0092\u00a8\u00d1r\u008a\u00a6Zm\u000bd".length();
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
        GeometricTransformationEngine708.b = var8_3;
        GeometricTransformationEngine708.d = new Integer[37];
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = GeometricTransformationEngine708.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(GeometricTransformationEngine708.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(GeometricTransformationEngine708.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

