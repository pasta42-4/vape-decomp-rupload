/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.app.data.streaming.StreamProcessingEngine2191;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
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

public class lT
extends CryptoProtocolEngine {
    private ReflectionUtilityService B;
    private ReflectionUtilityService L;
    private static final String[] f;
    private ReflectionUtilityService Z;
    private ReflectionUtilityService i;
    private ReflectionUtilityService E;
    private ReflectionUtilityService I;
    private ReflectionUtilityService M;
    private ReflectionUtilityService w;
    private ReflectionUtilityService u;
    private ReflectionUtilityService C;
    private static final Object[] e;
    private static final long[] b;
    private ReflectionUtilityService k;
    private static final Map d;
    private static final Integer[] c;
    private ReflectionUtilityService K;
    private static final long a;
    private ReflectionUtilityService A;

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/lT" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private Object H() {
        return this.E.Z(null);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                lT.a = MultiContainerRegistry.a(-2550584303720246699L, -5843226136366215403L, MethodHandles.lookup().lookupClass()).a(249329498177739L);
                lT.e = new Object[10];
                lT.f = new String[10];
                lT.b();
                lT.d = new HashMap<K, V>(13);
                var0 = lT.a ^ 19315741325159L;
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
                var6_5 = "g\u00be\u00f0\u0016?5\u001d#\u0088v\u00bc\u00dc~\u00f3\u00faU\u0085\u0000r\u00a4N\fiO\u0094.\u001a\u008f\r\u00db\u0006\u00cb\u000f\u00c2y\u0089s]\u00e0|\u008b\u00a7f\u00ce\u001e7\u000e\u00d7_\u0019y\u0096+b\u001bh#w\u009fG?}\u00ae\u00fe\u00c1\u00d3\u001d=={k!\u00bc\u00cf(\u0097\u00a3$\u00aa\u000fL'F\u0019j\u0093{<";
                var7_6 = "g\u00be\u00f0\u0016?5\u001d#\u0088v\u00bc\u00dc~\u00f3\u00faU\u0085\u0000r\u00a4N\fiO\u0094.\u001a\u008f\r\u00db\u0006\u00cb\u000f\u00c2y\u0089s]\u00e0|\u008b\u00a7f\u00ce\u001e7\u000e\u00d7_\u0019y\u0096+b\u001bh#w\u009fG?}\u00ae\u00fe\u00c1\u00d3\u001d=={k!\u00bc\u00cf(\u0097\u00a3$\u00aa\u000fL'F\u0019j\u0093{<".length();
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
                    var6_5 = "M/\u00c5Y\u00ee\u00da\u0080u\u00c9\u001d\u0015\u0010\u00e7\u00d0\u00c6\u0018";
                    var7_6 = "M/\u00c5Y\u00ee\u00da\u0080u\u00c9\u001d\u0015\u0010\u00e7\u00d0\u00c6\u0018".length();
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
        lT.b = var8_3;
        lT.c = new Integer[13];
    }

    private Object N() {
        return this.I.Z(null);
    }

    static Object e(lT lT2) {
        return lT2.R();
    }

    private Object V() {
        return this.B.Z(null);
    }

    static Object y(lT lT2) {
        return lT2.A();
    }

    private Object e() {
        return this.M.Z(null);
    }

    private Object E() {
        return this.k.Z(null);
    }

    private Object A() {
        return this.L.Z(null);
    }

    public lT() {
        long l = a ^ 0x61DC1889C48L;
        super(ReflectionMetadataResolver.PJ);
        this.Z = lT.c("Y", (Object)this, (Object)lT.c("\u00e7", (int)lT.b("d", (int)20755, (long)(0x178E35E04C580EB7L ^ l)), (long)-2475228724480469799L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.PS, (long)-2475159835840351499L, (long)l);
        this.K = lT.c("Y", (Object)this, (Object)lT.c("\u00e7", (int)lT.b("d", (int)2598, (long)(0xDFEA52F8F9F558EL ^ l)), (long)-2475228724480469799L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.PS, (long)-2475159835840351499L, (long)l);
        this.w = lT.c("Y", (Object)this, (Object)lT.c("\u00e7", (int)lT.b("d", (int)26343, (long)(0x667443FED8CB394EL ^ l)), (long)-2475228724480469799L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.PS, (long)-2475159835840351499L, (long)l);
        this.k = lT.c("Y", (Object)this, (Object)lT.c("\u00e7", (int)lT.b("d", (int)11460, (long)(0x7DB18E232E2DF36AL ^ l)), (long)-2475228724480469799L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.PS, (long)-2475159835840351499L, (long)l);
        this.i = lT.c("Y", (Object)this, (Object)lT.c("\u00e7", (int)lT.b("d", (int)10632, (long)(0x4CAE3B68268C7625L ^ l)), (long)-2475228724480469799L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.PS, (long)-2475159835840351499L, (long)l);
        this.A = lT.c("Y", (Object)this, (Object)lT.c("\u00e7", (int)lT.b("d", (int)25671, (long)(0x5A24B035168BBECL ^ l)), (long)-2475228724480469799L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.PS, (long)-2475159835840351499L, (long)l);
        this.C = lT.c("Y", (Object)this, (Object)lT.c("\u00e7", (int)lT.b("d", (int)14418, (long)(0x267B1E15EF3467F5L ^ l)), (long)-2475228724480469799L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.PS, (long)-2475159835840351499L, (long)l);
        this.u = lT.c("Y", (Object)this, (Object)lT.c("\u00e7", (int)lT.b("d", (int)5370, (long)(0x3269AD6EB1E94B56L ^ l)), (long)-2475228724480469799L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.PS, (long)-2475159835840351499L, (long)l);
        this.E = lT.c("Y", (Object)this, (Object)lT.c("\u00e7", (int)lT.b("d", (int)14504, (long)(0x1881F20F4C8C6707L ^ l)), (long)-2475228724480469799L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.PS, (long)-2475159835840351499L, (long)l);
        this.L = lT.c("Y", (Object)this, (Object)lT.c("\u00e7", (int)lT.b("d", (int)20553, (long)(0x7A300151DB848FE3L ^ l)), (long)-2475228724480469799L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.PS, (long)-2475159835840351499L, (long)l);
        this.M = lT.c("Y", (Object)this, (Object)lT.c("\u00e7", (int)lT.b("d", (int)26431, (long)(0x271F3DB1A7CC3899L ^ l)), (long)-2475228724480469799L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.PS, (long)-2475159835840351499L, (long)l);
        int[] nArray = StreamProcessingEngine2191.m();
        try {
            this.I = lT.c("Y", (Object)this, (Object)lT.c("\u00e7", (int)lT.b("d", (int)17788, (long)(0x7CD0EA035E2E1ADCL ^ l)), (long)-2475228724480469799L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.PS, (long)-2475159835840351499L, (long)l);
            this.B = lT.c("Y", (Object)this, (Object)lT.c("\u00e7", (int)lT.b("d", (int)20712, (long)(0x16EDB24248E98F4DL ^ l)), (long)-2475228724480469799L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.PS, (long)-2475159835840351499L, (long)l);
            if (nArray == null) {
                AbstractComputationKernel.I(new String[2]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw lT.a(customSystemException);
        }
    }

    private Object L() {
        return this.w.Z(null);
    }

    static Object b(lT lT2) {
        return lT2.W();
    }

    static Object U(lT lT2) {
        return lT2.a();
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = lT.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field g(long l, long l2) {
        int n = lT.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = lT.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = lT.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = lT.c(clazz3, string2, clazz2)) != null) {
                    lT.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = lT.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        lT.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = lT.f(535119735279710L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = lT.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = lT.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    static Object c(lT lT2) {
        return lT2.c();
    }

    private Object c() {
        return this.u.Z(null);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'P' || c == 'e' || c == '\u00e5' || c == 'q') {
                field = lT.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'P' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'e' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = lT.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'Y' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e7' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    static Object n(lT lT2) {
        return lT2.B();
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
                n3 = 45;
                break;
            }
            case 1: {
                n3 = 26;
                break;
            }
            case 2: {
                n3 = 52;
                break;
            }
            case 3: {
                n3 = 39;
                break;
            }
            case 4: {
                n3 = 15;
                break;
            }
            case 5: {
                n3 = 38;
                break;
            }
            case 6: {
                n3 = 13;
                break;
            }
            case 7: {
                n3 = 33;
                break;
            }
            case 8: {
                n3 = 5;
                break;
            }
            case 9: {
                n3 = 24;
                break;
            }
            case 10: {
                n3 = 63;
                break;
            }
            case 11: {
                n3 = 61;
                break;
            }
            case 12: {
                n3 = 4;
                break;
            }
            case 13: {
                n3 = 44;
                break;
            }
            case 14: {
                n3 = 29;
                break;
            }
            case 15: {
                n3 = 46;
                break;
            }
            case 16: {
                n3 = 18;
                break;
            }
            case 17: {
                n3 = 36;
                break;
            }
            case 18: {
                n3 = 56;
                break;
            }
            case 19: {
                n3 = 25;
                break;
            }
            case 20: {
                n3 = 30;
                break;
            }
            case 21: {
                n3 = 20;
                break;
            }
            case 22: {
                n3 = 7;
                break;
            }
            case 23: {
                n3 = 19;
                break;
            }
            case 24: {
                n3 = 41;
                break;
            }
            case 25: {
                n3 = 42;
                break;
            }
            case 26: {
                n3 = 28;
                break;
            }
            case 27: {
                n3 = 17;
                break;
            }
            case 28: {
                n3 = 16;
                break;
            }
            case 29: {
                n3 = 55;
                break;
            }
            case 30: {
                n3 = 14;
                break;
            }
            case 31: {
                n3 = 0;
                break;
            }
            case 32: {
                n3 = 37;
                break;
            }
            case 33: {
                n3 = 40;
                break;
            }
            case 34: {
                n3 = 54;
                break;
            }
            case 35: {
                n3 = 6;
                break;
            }
            case 36: {
                n3 = 27;
                break;
            }
            case 37: {
                n3 = 9;
                break;
            }
            case 38: {
                n3 = 10;
                break;
            }
            case 39: {
                n3 = 11;
                break;
            }
            case 40: {
                n3 = 3;
                break;
            }
            case 41: {
                n3 = 35;
                break;
            }
            case 42: {
                n3 = 1;
                break;
            }
            case 43: {
                n3 = 2;
                break;
            }
            case 44: {
                n3 = 57;
                break;
            }
            case 45: {
                n3 = 58;
                break;
            }
            case 46: {
                n3 = 12;
                break;
            }
            case 47: {
                n3 = 49;
                break;
            }
            case 48: {
                n3 = 59;
                break;
            }
            case 49: {
                n3 = 23;
                break;
            }
            case 50: {
                n3 = 21;
                break;
            }
            case 51: {
                n3 = 62;
                break;
            }
            case 52: {
                n3 = 60;
                break;
            }
            case 53: {
                n3 = 32;
                break;
            }
            case 54: {
                n3 = 48;
                break;
            }
            case 55: {
                n3 = 50;
                break;
            }
            case 56: {
                n3 = 47;
                break;
            }
            case 57: {
                n3 = 22;
                break;
            }
            case 58: {
                n3 = 43;
                break;
            }
            case 59: {
                n3 = 8;
                break;
            }
            case 60: {
                n3 = 31;
                break;
            }
            case 61: {
                n3 = 51;
                break;
            }
            case 62: {
                n3 = 34;
                break;
            }
            default: {
                n3 = 53;
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
        lT.f[n4] = new String(cArray);
        return n4;
    }

    private static void b() {
        Object[] objectArray = e;
        e[0] = "\u0000\u00175";
        objectArray[1] = Integer.TYPE;
        lT.f[1] = "java/lang/Integer";
        objectArray[2] = "_W.AP<TX?\u000e-$G_6G";
        objectArray[3] = "B;7`";
        objectArray[4] = Boolean.TYPE;
        lT.f[4] = "java/lang/Boolean";
        objectArray[5] = "\u0013\f6\u001fHR\u0018\u0003'P%R\u0018\u001e3";
        objectArray[6] = "\u001e(FF";
        objectArray[7] = "*\u000fa8$$!\u0000pwE**\u000bt-";
        objectArray[8] = "5c\u007f?6{h$wfQ\t\u000f#,:/zf(w5lD5bwd7+q'rbQ\u007f}{n92=?#([m*3z{j?z5u\u0016";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "[9\u0019\u0019b\u0014\u001a<\u001epb\u001f`|MN0^\\}\u000b\u0016\t^Zb\fN`U\u0001mOp";
    }

    private Object p() {
        return this.Z.Z(null);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = lT.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = lT.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private Object W() {
        return this.C.Z(null);
    }

    private Object B() {
        return this.K.Z(null);
    }

    private static Method h(long l, long l2) {
        int n = lT.e(l, l2);
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
                clazz3 = lT.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = lT.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = lT.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        lT.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = lT.f(535119735279710L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = lT.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        lT.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = lT.f(535119735279710L, 0L);
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

    static Object i(lT lT2) {
        return lT2.H();
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = lT.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private Object a() {
        return this.A.Z(null);
    }

    static Object P(lT lT2) {
        return lT2.e();
    }

    static Object f(lT lT2) {
        return lT2.V();
    }

    private Object R() {
        return this.i.Z(null);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = lT.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                lT.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    static Object B(lT lT2) {
        return lT2.E();
    }

    static Object N(lT lT2) {
        return lT2.L();
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x208;
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
                throw new RuntimeException("a/lT", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lT.c[n2] = n3;
        }
        return c[n2];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/lT" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    static Object G(lT lT2) {
        return lT2.N();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    static Object W(lT lT2) {
        return lT2.p();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lT.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(lT.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

