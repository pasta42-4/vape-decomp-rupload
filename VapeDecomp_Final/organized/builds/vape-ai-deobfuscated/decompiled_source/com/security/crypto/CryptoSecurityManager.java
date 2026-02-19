/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityService;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.type.registry.DynamicTypeRegistry;
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

public class CryptoSecurityManager
extends CryptoProtocolEngine {
    private static final Map d;
    private static final String[] g;
    private ReflectionUtilityService B;
    private static final Integer[] c;
    private static final Object[] e;
    private static final long[] b;
    private HK f;
    private static final long a;

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

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptoSecurityManager.a = MultiContainerRegistry.a(-868493750515124752L, 3609031324676938474L, MethodHandles.lookup().lookupClass()).a(236887648462970L);
                CryptoSecurityManager.e = new Object[14];
                CryptoSecurityManager.g = new String[14];
                CryptoSecurityManager.a();
                CryptoSecurityManager.d = new HashMap<K, V>(13);
                var0 = CryptoSecurityManager.a ^ 61579807807822L;
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
                var8_3 = new long[6];
                var5_4 = 0;
                var6_5 = "ex\u00f0xQ`k\u0081:\u00da:\u00a9\u00d3\u00e1\u00ce\u0087Bw\u00c9\u00fb\u0006+\u0092\u00cc\u00c3\u009e\u00c7-b+\u00ab5";
                var7_6 = "ex\u00f0xQ`k\u0081:\u00da:\u00a9\u00d3\u00e1\u00ce\u0087Bw\u00c9\u00fb\u0006+\u0092\u00cc\u00c3\u009e\u00c7-b+\u00ab5".length();
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
                    var6_5 = "\u009f9\u0019\u00ea\u00ca\u0080\u0012\u0004!\u0096N\u00bd\u00bf \u00cc*";
                    var7_6 = "\u009f9\u0019\u00ea\u00ca\u0080\u0012\u0004!\u0096N\u00bd\u00bf \u00cc*".length();
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
        CryptoSecurityManager.b = var8_3;
        CryptoSecurityManager.c = new Integer[6];
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "{`m{";
        objectArray[1] = "oA>\u007f\u0006\u0006dN/0{\u001ewI&y";
        objectArray[2] = Boolean.TYPE;
        CryptoSecurityManager.g[2] = "java/lang/Boolean";
        objectArray[3] = "=%c\u000eL\u001a6*rA!\u001a67f";
        objectArray[4] = "Iz?4\fO<Z4;\u001d\u0000QZ4&\t\u0015";
        objectArray[5] = "\u0015L\u0000<";
        objectArray[6] = "R:\u000e";
        objectArray[7] = Integer.TYPE;
        CryptoSecurityManager.g[7] = "java/lang/Integer";
        objectArray[8] = "'\u001cff";
        objectArray[9] = "\u001fFSsG?\u0014IB<&1\u001fBFf";
        objectArray[10] = "D}r^|:\u0012f$nA\u0006\u000f~ \u0011fx\u0011h;n?i\u0011l$\u0015d{\u0016yKT96M|0\u0014;a\u0012\u0001p\u0003;c\u001e>z\u0015m~t:*\n{cL9,\u0017t\u0006";
        objectArray[11] = "~\u0005f\u0013d\u0005(\u001e0#E95\u00064\\~G+\u0010/#'V+\u00140X|D,\u0001_\u0019!\tw\u0004$Y#^(ybEbY!\u00186\u001b%RN";
        objectArray[12] = "u!Yx}\u00004 \u0006<ER2Z\u0003i)Evc[l{\u0007I!Ai:Y7?WrE";
        Object[] objectArray2 = objectArray;
        objectArray[13] = "\bwG-C-^l\u0011\u001dh\u0011\u00024N$DjB6\u0019{9jG`\u0001}GtQ{~$VtUd\u0005\u007fDs@\u000bD\"\t(Ep\u0004 ^w86\u0018aY~YbF&R\u0011";
    }

    private Object n(Object object) {
        return this.B.Z(object);
    }

    static Object s(CryptoSecurityManager cryptoSecurityManager, Object object) {
        return cryptoSecurityManager.n(object);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (g[n4] != null) {
            return n4;
        }
        Object object = e[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 1;
                break;
            }
            case 1: {
                n3 = 30;
                break;
            }
            case 2: {
                n3 = 24;
                break;
            }
            case 3: {
                n3 = 32;
                break;
            }
            case 4: {
                n3 = 14;
                break;
            }
            case 5: {
                n3 = 57;
                break;
            }
            case 6: {
                n3 = 51;
                break;
            }
            case 7: {
                n3 = 28;
                break;
            }
            case 8: {
                n3 = 52;
                break;
            }
            case 9: {
                n3 = 11;
                break;
            }
            case 10: {
                n3 = 37;
                break;
            }
            case 11: {
                n3 = 0;
                break;
            }
            case 12: {
                n3 = 62;
                break;
            }
            case 13: {
                n3 = 55;
                break;
            }
            case 14: {
                n3 = 27;
                break;
            }
            case 15: {
                n3 = 8;
                break;
            }
            case 16: {
                n3 = 59;
                break;
            }
            case 17: {
                n3 = 39;
                break;
            }
            case 18: {
                n3 = 63;
                break;
            }
            case 19: {
                n3 = 10;
                break;
            }
            case 20: {
                n3 = 33;
                break;
            }
            case 21: {
                n3 = 20;
                break;
            }
            case 22: {
                n3 = 6;
                break;
            }
            case 23: {
                n3 = 60;
                break;
            }
            case 24: {
                n3 = 61;
                break;
            }
            case 25: {
                n3 = 25;
                break;
            }
            case 26: {
                n3 = 44;
                break;
            }
            case 27: {
                n3 = 54;
                break;
            }
            case 28: {
                n3 = 5;
                break;
            }
            case 29: {
                n3 = 45;
                break;
            }
            case 30: {
                n3 = 18;
                break;
            }
            case 31: {
                n3 = 50;
                break;
            }
            case 32: {
                n3 = 2;
                break;
            }
            case 33: {
                n3 = 13;
                break;
            }
            case 34: {
                n3 = 48;
                break;
            }
            case 35: {
                n3 = 38;
                break;
            }
            case 36: {
                n3 = 26;
                break;
            }
            case 37: {
                n3 = 21;
                break;
            }
            case 38: {
                n3 = 15;
                break;
            }
            case 39: {
                n3 = 40;
                break;
            }
            case 40: {
                n3 = 12;
                break;
            }
            case 41: {
                n3 = 31;
                break;
            }
            case 42: {
                n3 = 35;
                break;
            }
            case 43: {
                n3 = 7;
                break;
            }
            case 44: {
                n3 = 16;
                break;
            }
            case 45: {
                n3 = 36;
                break;
            }
            case 46: {
                n3 = 47;
                break;
            }
            case 47: {
                n3 = 22;
                break;
            }
            case 48: {
                n3 = 23;
                break;
            }
            case 49: {
                n3 = 56;
                break;
            }
            case 50: {
                n3 = 17;
                break;
            }
            case 51: {
                n3 = 3;
                break;
            }
            case 52: {
                n3 = 19;
                break;
            }
            case 53: {
                n3 = 29;
                break;
            }
            case 54: {
                n3 = 42;
                break;
            }
            case 55: {
                n3 = 58;
                break;
            }
            case 56: {
                n3 = 43;
                break;
            }
            case 57: {
                n3 = 9;
                break;
            }
            case 58: {
                n3 = 4;
                break;
            }
            case 59: {
                n3 = 49;
                break;
            }
            case 60: {
                n3 = 34;
                break;
            }
            case 61: {
                n3 = 41;
                break;
            }
            case 62: {
                n3 = 46;
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
        CryptoSecurityManager.g[n4] = new String(cArray);
        return n4;
    }

    /*
     * Unable to fully structure code
     */
    public CryptoSecurityManager() {
        block24: {
            block25: {
                block22: {
                    block23: {
                        var1_1 = CryptoSecurityManager.a ^ 112277286907324L;
                        v0 = DynamicTypeRegistry.B();
                        super(ReflectionMetadataResolver.Yx);
                        var3_2 = v0;
                        try {
                            try {
                                try {
                                    try {
                                        v1 = GeometryCalculator.C();
                                        if (var3_2 != null) break block22;
                                        if (v1 >= 15) {
                                        }
                                        ** GOTO lbl47
                                    }
                                    catch (CustomSystemException v2) {
                                        throw CryptoSecurityManager.a(v2);
                                    }
                                    v3 = GeometryCalculator.C();
                                    if (var3_2 != null) break block23;
                                }
                                catch (CustomSystemException v4) {
                                    throw CryptoSecurityManager.a(v4);
                                }
                                if (v3 >= 35) {
                                }
                                ** GOTO lbl41
                            }
                            catch (CustomSystemException v5) {
                                throw CryptoSecurityManager.a(v5);
                            }
                            v3 = (int)GameVersionEnumerator.MC_1_21_4.Q();
                        }
                        catch (CustomSystemException v6) {
                            throw CryptoSecurityManager.a(v6);
                        }
                    }
                    try {
                        try {
                            try {
                                try {
                                    if (v3 == 0) break block24;
                                    this.B = CryptoSecurityManager.c("s", (Object)this, (Object)ReflectionMetadataResolver.Vq, (Object)CryptoSecurityManager.c("h", (int)CryptoSecurityManager.b("h", (int)21419, (long)(3657111410037792208L ^ var1_1)), (long)-3549952691322576253L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.b7, (long)-3549853138139475172L, (long)var1_1);
                                    if (var3_2 == null) break block24;
                                }
                                catch (CustomSystemException v7) {
                                    throw CryptoSecurityManager.a(v7);
                                }
lbl41:
                                // 2 sources

                                this.B = CryptoSecurityManager.c("s", (Object)this, (Object)CryptoSecurityManager.c("h", (int)CryptoSecurityManager.b("h", (int)9082, (long)(9209933711041719555L ^ var1_1)), (long)-3549952691322576253L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.r8, (long)-3549421065816811401L, (long)var1_1);
                                this.f = CryptoSecurityManager.c("s", (Object)this, (Object)CryptoSecurityManager.c("h", (int)CryptoSecurityManager.b("h", (int)30881, (long)(3566445455009199838L ^ var1_1)), (long)-3549952691322576253L, (long)var1_1), (boolean)true, Float.TYPE, (Object)new Class[0], (long)-3549479816732442590L, (long)var1_1);
                                if (var3_2 == null) break block24;
                            }
                            catch (CustomSystemException v8) {
                                throw CryptoSecurityManager.a(v8);
                            }
lbl47:
                            // 2 sources

                            v9 = this;
                            v10 = this;
                            v11 = CryptoSecurityManager.c("h", (int)CryptoSecurityManager.b("h", (int)30938, (long)(7461738770132252322L ^ var1_1)), (long)-3549952691322576253L, (long)var1_1);
                            v12 = ObjectLifecycleTracker.z;
                            v13 = Float.TYPE;
                            if (var3_2 != null) break block25;
                        }
                        catch (CustomSystemException v14) {
                            throw CryptoSecurityManager.a(v14);
                        }
                        v9.f = CryptoSecurityManager.c("s", (Object)v10, (Object)v11, (boolean)v12, (Object)v13, (Object)new Class[0], (long)-3549479816732442590L, (long)var1_1);
                        v1 = (int)ObjectLifecycleTracker.U.d();
                    }
                    catch (CustomSystemException v15) {
                        throw CryptoSecurityManager.a(v15);
                    }
                }
                try {
                    block26: {
                        try {
                            if (v1 == 0) break block26;
                            this.B = CryptoSecurityManager.c("s", (Object)this, (Object)CryptoSecurityManager.c("h", (int)CryptoSecurityManager.b("h", (int)31597, (long)(5225106678042932499L ^ var1_1)), (long)-3549952691322576253L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.r8, (long)-3549421065816811401L, (long)var1_1);
                            if (var3_2 == null) break block24;
                        }
                        catch (CustomSystemException v16) {
                            throw CryptoSecurityManager.a(v16);
                        }
                    }
                    v9 = this;
                    v10 = this;
                    v11 = CryptoSecurityManager.c("h", (int)CryptoSecurityManager.b("h", (int)3599, (long)(4500028970759176309L ^ var1_1)), (long)-3549952691322576253L, (long)var1_1);
                    v12 = ObjectLifecycleTracker.z;
                    v13 = ReflectionMetadataResolver.r8;
                }
                catch (CustomSystemException v17) {
                    throw CryptoSecurityManager.a(v17);
                }
            }
            v9.B = CryptoSecurityManager.c("s", (Object)v10, (Object)v11, (boolean)v12, (Object)v13, (long)-3549421065816811401L, (long)var1_1);
        }
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ee' || c == '\u00ef' || c == 'V' || c == '\u00a3') {
                field = CryptoSecurityManager.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ee' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ef' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'V' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptoSecurityManager.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 's' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'h' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field g(long l, long l2) {
        int n = CryptoSecurityManager.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptoSecurityManager.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptoSecurityManager.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptoSecurityManager.c(clazz3, string2, clazz2)) != null) {
                    CryptoSecurityManager.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptoSecurityManager.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptoSecurityManager.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptoSecurityManager.f(691684254927616L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptoSecurityManager.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    static float B(CryptoSecurityManager cryptoSecurityManager, Object object) {
        return cryptoSecurityManager.U(object);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = CryptoSecurityManager.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptoSecurityManager.d(classArray[i], string, clazz2);
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

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptoSecurityManager.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptoSecurityManager.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method h(long l, long l2) {
        int n = CryptoSecurityManager.e(l, l2);
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
                String string2 = g[n];
                int n3 = string2.indexOf(8);
                clazz3 = CryptoSecurityManager.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptoSecurityManager.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptoSecurityManager.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptoSecurityManager.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptoSecurityManager.f(691684254927616L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptoSecurityManager.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptoSecurityManager.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptoSecurityManager.f(691684254927616L, 0L);
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

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/mD" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptoSecurityManager.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptoSecurityManager.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptoSecurityManager.e[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xC4;
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
                throw new RuntimeException("a/mD", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptoSecurityManager.c[n2] = n3;
        }
        return c[n2];
    }

    private float U(Object object) {
        return this.f.p(object, new Object[0]);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/mD" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptoSecurityManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(CryptoSecurityManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

