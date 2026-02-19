/*
 * Decompiled with CFR 0.152.
 */
package com.security.session;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.security.resource.SecureResourceManager;
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
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class CryptographicSessionManager446
extends CryptoProtocolEngine {
    private static final String[] g;
    public HK Y;
    public HK d;
    private static final Map e;
    private static final Object[] f;
    public HK Q;
    private static final long[] b;
    private static final long a;
    public HK t;
    private final HK h;
    private static final Integer[] c;
    public HK B;

    public CryptographicSessionManager446() {
        block39: {
            int n;
            int n2;
            long l;
            block37: {
                String string;
                block36: {
                    block35: {
                        block33: {
                            block31: {
                                int n3;
                                int n4;
                                block29: {
                                    l = a ^ 0x1A24E79B2335L;
                                    String string2 = SecureResourceManager.w();
                                    super(ReflectionMetadataResolver.f);
                                    string = string2;
                                    try {
                                        block30: {
                                            try {
                                                try {
                                                    this.h = CryptographicSessionManager446.c("F", (Object)this, (Object)CryptographicSessionManager446.c("z", (int)CryptographicSessionManager446.b("o", (int)12929, (long)(0x67DDDDDA753D0CA6L ^ l)), (long)-1328383843253170418L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-1328438758180776222L, (long)l);
                                                    int n3 = GeometryCalculator.C();
                                                    n3 = 13;
                                                    if (string != null) break block29;
                                                    if (n4 != n3) break block30;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CryptographicSessionManager446.a(customSystemException);
                                                }
                                                this.t = CryptographicSessionManager446.c("F", (Object)this, (Object)CryptographicSessionManager446.c("z", (int)CryptographicSessionManager446.b("o", (int)4916, (long)(0x352DDECE2E702D15L ^ l)), (long)-1328383843253170418L, (long)l), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.Ut, Boolean.TYPE}, (long)-1328438758180776222L, (long)l);
                                                if (string == null) break block31;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptographicSessionManager446.a(customSystemException);
                                            }
                                        }
                                        int n3 = GeometryCalculator.C();
                                        n3 = 50;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptographicSessionManager446.a(customSystemException);
                                    }
                                }
                                try {
                                    block32: {
                                        try {
                                            if (n4 < n3) break block32;
                                            this.B = CryptographicSessionManager446.c("F", (Object)this, (Object)CryptographicSessionManager446.c("z", (int)CryptographicSessionManager446.b("o", (int)7096, (long)(0x156B494CD61DA59BL ^ l)), (long)-1328383843253170418L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.bf}, (long)-1328438758180776222L, (long)l);
                                            if (string == null) break block31;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptographicSessionManager446.a(customSystemException);
                                        }
                                    }
                                    this.B = CryptographicSessionManager446.c("F", (Object)this, (Object)CryptographicSessionManager446.c("z", (int)CryptographicSessionManager446.b("o", (int)6369, (long)(0x18862A98A8EAA6C1L ^ l)), (long)-1328383843253170418L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{Long.TYPE}, (long)-1328438758180776222L, (long)l);
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicSessionManager446.a(customSystemException);
                                }
                            }
                            try {
                                block34: {
                                    try {
                                        try {
                                            n2 = GameVersionEnumerator.MC_1_21_10.H();
                                            if (string != null) break block33;
                                            if (n2 == 0) break block34;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptographicSessionManager446.a(customSystemException);
                                        }
                                        this.Q = CryptographicSessionManager446.c("F", (Object)this, (Object)CryptographicSessionManager446.c("z", (int)CryptographicSessionManager446.b("o", (int)25737, (long)(0x2EED0B93B54BDAAFL ^ l)), (long)-1328383843253170418L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.bf, ReflectionMetadataResolver.S, ReflectionMetadataResolver.YU, ReflectionMetadataResolver.P6}, (long)-1328438758180776222L, (long)l);
                                        if (string == null) break block35;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptographicSessionManager446.a(customSystemException);
                                    }
                                }
                                n2 = GameVersionEnumerator.MC_1_21_4.H();
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicSessionManager446.a(customSystemException);
                            }
                        }
                        try {
                            try {
                                if (string != null) break block36;
                                if (n2 == 0) break block35;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicSessionManager446.a(customSystemException);
                            }
                            this.d = CryptographicSessionManager446.c("F", (Object)this, (Object)CryptographicSessionManager446.c("z", (int)CryptographicSessionManager446.b("o", (int)5968, (long)(0x175B953136D12974L ^ l)), (long)-1328383843253170418L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.YH, ReflectionMetadataResolver.Ux, ReflectionMetadataResolver.bf, ReflectionMetadataResolver.YU, List.class}, (long)-1328438758180776222L, (long)l);
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicSessionManager446.a(customSystemException);
                        }
                    }
                    n2 = GeometryCalculator.C();
                }
                try {
                    block38: {
                        try {
                            try {
                                n = 50;
                                if (string != null) break block37;
                                if (n2 < n) break block38;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicSessionManager446.a(customSystemException);
                            }
                            this.Y = CryptographicSessionManager446.c("F", (Object)this, (Object)CryptographicSessionManager446.c("z", (int)CryptographicSessionManager446.b("o", (int)19880, (long)(0x78ACB9E20BA6F38DL ^ l)), (long)-1328383843253170418L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{Float.TYPE, Long.TYPE, Boolean.TYPE, ReflectionMetadataResolver.bf, ReflectionMetadataResolver.b5, ReflectionMetadataResolver.Yt, ReflectionMetadataResolver.rr, ReflectionMetadataResolver.rr}, (long)-1328438758180776222L, (long)l);
                            if (string == null) break block39;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicSessionManager446.a(customSystemException);
                        }
                    }
                    int n = GeometryCalculator.C();
                    n = 35;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicSessionManager446.a(customSystemException);
                }
            }
            try {
                if (n2 >= n) {
                    this.Y = CryptographicSessionManager446.c("F", (Object)this, (Object)CryptographicSessionManager446.c("z", (int)CryptographicSessionManager446.b("o", (int)9590, (long)(0x2FAC76EEF0691B54L ^ l)), (long)-1328383843253170418L, (long)l), (boolean)ObjectLifecycleTracker.z, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.YH, Float.TYPE, Long.TYPE, Boolean.TYPE, ReflectionMetadataResolver.bf, ReflectionMetadataResolver.b5, ReflectionMetadataResolver.Yt, ReflectionMetadataResolver.rr}, (long)-1328438758180776222L, (long)l);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSessionManager446.a(customSystemException);
            }
        }
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x53B4;
        if (c[n2] == null) {
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
                throw new RuntimeException("a/qo", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptographicSessionManager446.c[n2] = n3;
        }
        return c[n2];
    }

    private static int e(long l, long l2) {
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
                n3 = 59;
                break;
            }
            case 1: {
                n3 = 1;
                break;
            }
            case 2: {
                n3 = 5;
                break;
            }
            case 3: {
                n3 = 15;
                break;
            }
            case 4: {
                n3 = 32;
                break;
            }
            case 5: {
                n3 = 31;
                break;
            }
            case 6: {
                n3 = 0;
                break;
            }
            case 7: {
                n3 = 45;
                break;
            }
            case 8: {
                n3 = 38;
                break;
            }
            case 9: {
                n3 = 26;
                break;
            }
            case 10: {
                n3 = 47;
                break;
            }
            case 11: {
                n3 = 56;
                break;
            }
            case 12: {
                n3 = 62;
                break;
            }
            case 13: {
                n3 = 23;
                break;
            }
            case 14: {
                n3 = 39;
                break;
            }
            case 15: {
                n3 = 9;
                break;
            }
            case 16: {
                n3 = 41;
                break;
            }
            case 17: {
                n3 = 10;
                break;
            }
            case 18: {
                n3 = 40;
                break;
            }
            case 19: {
                n3 = 4;
                break;
            }
            case 20: {
                n3 = 29;
                break;
            }
            case 21: {
                n3 = 6;
                break;
            }
            case 22: {
                n3 = 21;
                break;
            }
            case 23: {
                n3 = 3;
                break;
            }
            case 24: {
                n3 = 61;
                break;
            }
            case 25: {
                n3 = 14;
                break;
            }
            case 26: {
                n3 = 2;
                break;
            }
            case 27: {
                n3 = 12;
                break;
            }
            case 28: {
                n3 = 46;
                break;
            }
            case 29: {
                n3 = 8;
                break;
            }
            case 30: {
                n3 = 51;
                break;
            }
            case 31: {
                n3 = 17;
                break;
            }
            case 32: {
                n3 = 7;
                break;
            }
            case 33: {
                n3 = 22;
                break;
            }
            case 34: {
                n3 = 49;
                break;
            }
            case 35: {
                n3 = 34;
                break;
            }
            case 36: {
                n3 = 36;
                break;
            }
            case 37: {
                n3 = 37;
                break;
            }
            case 38: {
                n3 = 50;
                break;
            }
            case 39: {
                n3 = 24;
                break;
            }
            case 40: {
                n3 = 13;
                break;
            }
            case 41: {
                n3 = 30;
                break;
            }
            case 42: {
                n3 = 44;
                break;
            }
            case 43: {
                n3 = 11;
                break;
            }
            case 44: {
                n3 = 43;
                break;
            }
            case 45: {
                n3 = 54;
                break;
            }
            case 46: {
                n3 = 28;
                break;
            }
            case 47: {
                n3 = 19;
                break;
            }
            case 48: {
                n3 = 57;
                break;
            }
            case 49: {
                n3 = 33;
                break;
            }
            case 50: {
                n3 = 52;
                break;
            }
            case 51: {
                n3 = 55;
                break;
            }
            case 52: {
                n3 = 16;
                break;
            }
            case 53: {
                n3 = 25;
                break;
            }
            case 54: {
                n3 = 53;
                break;
            }
            case 55: {
                n3 = 42;
                break;
            }
            case 56: {
                n3 = 27;
                break;
            }
            case 57: {
                n3 = 20;
                break;
            }
            case 58: {
                n3 = 48;
                break;
            }
            case 59: {
                n3 = 60;
                break;
            }
            case 60: {
                n3 = 58;
                break;
            }
            case 61: {
                n3 = 35;
                break;
            }
            case 62: {
                n3 = 18;
                break;
            }
            default: {
                n3 = 63;
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
        CryptographicSessionManager446.g[n4] = new String(cArray);
        return n4;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptographicSessionManager446.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptographicSessionManager446.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    static void u(CryptographicSessionManager446 cryptographicSessionManager446, Object object) {
        cryptographicSessionManager446.F(object);
    }

    private void F(Object object) {
        this.h.V(object);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "> k5";
        objectArray[1] = "Np3\u0002adE\u007f\"M\u001c|Vx+\u0004";
        objectArray[2] = Boolean.TYPE;
        CryptographicSessionManager446.g[2] = "java/lang/Boolean";
        objectArray[3] = "L\u0004uC+WG\u000bd\fFWG\u0016p";
        objectArray[4] = ".A\u001a;0&[a\u00114!i6a\u0011)5|";
        objectArray[5] = "\u0007D3.";
        objectArray[6] = "y\bM";
        objectArray[7] = Integer.TYPE;
        CryptographicSessionManager446.g[7] = "java/lang/Integer";
        objectArray[8] = "N\u0004\\nW\rE\u000bM!6\u0003N\u0000I{";
        objectArray[9] = "\nTT SX\u0006B\u000fBv;\u0014H\u000f-WV\u0013AWB\bG\u0010[Ay\u000eK\u0000\u00013xST\u001aPM>QD\u0010:\b\u007fCC\u0000XO(O_j\u0006\u000e!XF\u000bQ\u000b&J;";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "f,_\t\bv$2\u001d\t2r!JR\u001fJ!\" \u0010\nMiZ4\u001dM]\u007f73\u0014\u00152";
    }

    private static Field g(long l, long l2) {
        int n = CryptographicSessionManager446.e(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptographicSessionManager446.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptographicSessionManager446.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptographicSessionManager446.c(clazz3, string2, clazz2)) != null) {
                    CryptographicSessionManager446.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptographicSessionManager446.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptographicSessionManager446.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptographicSessionManager446.f(568646781123938L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = CryptographicSessionManager446.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptographicSessionManager446.d(classArray[i], string, clazz2);
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

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'K' || c == '\u00df' || c == '\u00e2' || c == '\u00ba') {
                field = CryptographicSessionManager446.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'K' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00df' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptographicSessionManager446.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'F' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'z' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptographicSessionManager446.e(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptographicSessionManager446.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptographicSessionManager446.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptographicSessionManager446.b(n, l);
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
            throw new RuntimeException("a/qo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptographicSessionManager446.a = MultiContainerRegistry.a(-4537847617064087184L, 3018329608508937996L, MethodHandles.lookup().lookupClass()).a(166463036517681L);
                CryptographicSessionManager446.f = new Object[11];
                CryptographicSessionManager446.g = new String[11];
                CryptographicSessionManager446.a();
                CryptographicSessionManager446.e = new HashMap<K, V>(13);
                var0 = CryptographicSessionManager446.a ^ 132079162554029L;
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
                var8_3 = new long[8];
                var5_4 = 0;
                var6_5 = "j\u0088@T)\u00c5\u0097~7@\u00ef\u00a6\u0092\u00c0\u0018\u00dd\u00eb$\u0013^\u00e1\u00adE\u0019\u00f3|\u0007k\u000b\u0084\u0091R\u00e6\u00f6\u00ec\u0080\u00fd\u00dd\u009e\u00e9\u00b0\u00d7\u0000\u008e@u\u0013\u0099";
                var7_6 = "j\u0088@T)\u00c5\u0097~7@\u00ef\u00a6\u0092\u00c0\u0018\u00dd\u00eb$\u0013^\u00e1\u00adE\u0019\u00f3|\u0007k\u000b\u0084\u0091R\u00e6\u00f6\u00ec\u0080\u00fd\u00dd\u009e\u00e9\u00b0\u00d7\u0000\u008e@u\u0013\u0099".length();
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
                    var6_5 = "\u0089 \u0090\u0092\u00b0jO\u00d5\u000eJm\u00a9w\u00b8\u00eb\u00c4";
                    var7_6 = "\u0089 \u0090\u0092\u00b0jO\u00d5\u000eJm\u00a9w\u00b8\u00eb\u00c4".length();
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
        CryptographicSessionManager446.b = var8_3;
        CryptographicSessionManager446.c = new Integer[8];
    }

    private static Method h(long l, long l2) {
        int n = CryptographicSessionManager446.e(l, l2);
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
                clazz3 = CryptographicSessionManager446.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptographicSessionManager446.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptographicSessionManager446.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptographicSessionManager446.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptographicSessionManager446.f(568646781123938L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptographicSessionManager446.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptographicSessionManager446.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptographicSessionManager446.f(568646781123938L, 0L);
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

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptographicSessionManager446.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(CryptographicSessionManager446.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

