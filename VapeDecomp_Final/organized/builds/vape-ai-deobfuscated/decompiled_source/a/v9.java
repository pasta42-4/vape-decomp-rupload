/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.data.compression.CompressionAlgorithmManager;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
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

public class v9
extends CryptoProtocolEngine {
    private static final String[] g;
    private ReflectionUtilityService F;
    private ReflectionUtilityService S;
    private HK O;
    private static final Object[] f;
    private static final Integer[] d;
    private static final long[] c;
    private static final long b;
    private ReflectionUtilityService Q;
    private ReflectionUtilityService a;
    private ReflectionUtilityService k;
    private ReflectionUtilityService r;
    private static final Map e;

    private int Y(Object object) {
        return this.S.R(object);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                v9.b = MultiContainerRegistry.a(-4085448902021144127L, -3284598546742241102L, MethodHandles.lookup().lookupClass()).a(260287632316325L);
                v9.f = new Object[13];
                v9.g = new String[13];
                v9.a();
                v9.e = new HashMap<K, V>(13);
                var0 = v9.b ^ 40984703029081L;
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
                var8_3 = new long[7];
                var5_4 = 0;
                var6_5 = "(\u00daD\u0017\u00ed7\u008e9u\u00af\u00d4\u00c1\u00c9\u00c0\u007f%\u00bd\u00a5\u001a\u00cf\u000e\u00d1(\u00c6\u00e1\u00b7$`\u00d1n;\u00e2\u0085\u001c}\u00ba(\u00ea\u00f9\u0091";
                var7_6 = "(\u00daD\u0017\u00ed7\u008e9u\u00af\u00d4\u00c1\u00c9\u00c0\u007f%\u00bd\u00a5\u001a\u00cf\u000e\u00d1(\u00c6\u00e1\u00b7$`\u00d1n;\u00e2\u0085\u001c}\u00ba(\u00ea\u00f9\u0091".length();
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
                    var6_5 = "\u00c4\u00d7\u00d0\u009b\u00c3\u009cp\u00c9\u008auu\u0018\u001f\u00fe\u00b2\u00ac";
                    var7_6 = "\u00c4\u00d7\u00d0\u009b\u00c3\u009cp\u00c9\u008auu\u0018\u001f\u00fe\u00b2\u00ac".length();
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
        v9.c = var8_3;
        v9.d = new Integer[7];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/v9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static int Z(v9 v92, Object object) {
        return v92.i(object);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'E' || c == 'n' || c == 'e' || c == '\u00c1') {
                field = v9.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'E' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'n' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'e' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = v9.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            int n = v9.e(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                v9.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    static int M(v9 v92, Object object) {
        return v92.Y(object);
    }

    private boolean A(Object object) {
        return this.Q.R(object);
    }

    private int i(Object object) {
        return this.k.R(object);
    }

    private static Method h(long l, long l2) {
        int n = v9.e(l, l2);
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
                clazz3 = v9.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = v9.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = v9.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        v9.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = v9.f(678444274606744L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = v9.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        v9.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = v9.f(678444274606744L, 0L);
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
                n3 = 47;
                break;
            }
            case 1: {
                n3 = 4;
                break;
            }
            case 2: {
                n3 = 25;
                break;
            }
            case 3: {
                n3 = 11;
                break;
            }
            case 4: {
                n3 = 5;
                break;
            }
            case 5: {
                n3 = 28;
                break;
            }
            case 6: {
                n3 = 2;
                break;
            }
            case 7: {
                n3 = 61;
                break;
            }
            case 8: {
                n3 = 29;
                break;
            }
            case 9: {
                n3 = 31;
                break;
            }
            case 10: {
                n3 = 1;
                break;
            }
            case 11: {
                n3 = 22;
                break;
            }
            case 12: {
                n3 = 43;
                break;
            }
            case 13: {
                n3 = 19;
                break;
            }
            case 14: {
                n3 = 34;
                break;
            }
            case 15: {
                n3 = 60;
                break;
            }
            case 16: {
                n3 = 6;
                break;
            }
            case 17: {
                n3 = 7;
                break;
            }
            case 18: {
                n3 = 35;
                break;
            }
            case 19: {
                n3 = 58;
                break;
            }
            case 20: {
                n3 = 36;
                break;
            }
            case 21: {
                n3 = 48;
                break;
            }
            case 22: {
                n3 = 57;
                break;
            }
            case 23: {
                n3 = 33;
                break;
            }
            case 24: {
                n3 = 9;
                break;
            }
            case 25: {
                n3 = 23;
                break;
            }
            case 26: {
                n3 = 10;
                break;
            }
            case 27: {
                n3 = 45;
                break;
            }
            case 28: {
                n3 = 32;
                break;
            }
            case 29: {
                n3 = 38;
                break;
            }
            case 30: {
                n3 = 62;
                break;
            }
            case 31: {
                n3 = 50;
                break;
            }
            case 32: {
                n3 = 8;
                break;
            }
            case 33: {
                n3 = 0;
                break;
            }
            case 34: {
                n3 = 17;
                break;
            }
            case 35: {
                n3 = 44;
                break;
            }
            case 36: {
                n3 = 53;
                break;
            }
            case 37: {
                n3 = 41;
                break;
            }
            case 38: {
                n3 = 30;
                break;
            }
            case 39: {
                n3 = 12;
                break;
            }
            case 40: {
                n3 = 55;
                break;
            }
            case 41: {
                n3 = 52;
                break;
            }
            case 42: {
                n3 = 21;
                break;
            }
            case 43: {
                n3 = 14;
                break;
            }
            case 44: {
                n3 = 37;
                break;
            }
            case 45: {
                n3 = 63;
                break;
            }
            case 46: {
                n3 = 56;
                break;
            }
            case 47: {
                n3 = 46;
                break;
            }
            case 48: {
                n3 = 54;
                break;
            }
            case 49: {
                n3 = 27;
                break;
            }
            case 50: {
                n3 = 3;
                break;
            }
            case 51: {
                n3 = 18;
                break;
            }
            case 52: {
                n3 = 13;
                break;
            }
            case 53: {
                n3 = 39;
                break;
            }
            case 54: {
                n3 = 49;
                break;
            }
            case 55: {
                n3 = 51;
                break;
            }
            case 56: {
                n3 = 15;
                break;
            }
            case 57: {
                n3 = 59;
                break;
            }
            case 58: {
                n3 = 16;
                break;
            }
            case 59: {
                n3 = 26;
                break;
            }
            case 60: {
                n3 = 40;
                break;
            }
            case 61: {
                n3 = 42;
                break;
            }
            case 62: {
                n3 = 20;
                break;
            }
            default: {
                n3 = 24;
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
        v9.g[n4] = new String(cArray);
        return n4;
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

    static boolean y(v9 v92, Object object) {
        return v92.Z(object);
    }

    public v9() {
        block8: {
            long l;
            block7: {
                l = b ^ 0xAC6C321CE06L;
                super(ReflectionMetadataResolver.FP);
                this.r = v9.c("\u00e4", (Object)this, (Object)v9.c("\u00c8", (int)v9.b("f", (int)5119, (long)(0x2BB0733306372F97L ^ l)), (long)3265965717346291917L, (long)l), (boolean)true, Integer.TYPE, (long)3265938857100141457L, (long)l);
                this.F = v9.c("\u00e4", (Object)this, (Object)v9.c("\u00c8", (int)v9.b("f", (int)8627, (long)(0x6C51DC90CE411DDCL ^ l)), (long)3265965717346291917L, (long)l), (boolean)true, Integer.TYPE, (long)3265938857100141457L, (long)l);
                this.a = v9.c("\u00e4", (Object)this, (Object)v9.c("\u00c8", (int)v9.b("f", (int)19370, (long)(0x40761BB1E8D477C0L ^ l)), (long)3265965717346291917L, (long)l), (boolean)true, Boolean.TYPE, (long)3265938857100141457L, (long)l);
                int[] nArray = CompressionAlgorithmManager.U();
                try {
                    try {
                        this.Q = v9.c("\u00e4", (Object)this, (Object)v9.c("\u00c8", (int)v9.b("f", (int)24467, (long)(0x55F5E3666F4263FAL ^ l)), (long)3265965717346291917L, (long)l), (boolean)true, Boolean.TYPE, (long)3265938857100141457L, (long)l);
                        if (nArray != null) break block7;
                        if (GeometryCalculator.C() < 37) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw v9.a(customSystemException);
                    }
                    this.S = v9.c("\u00e4", (Object)this, (Object)v9.c("\u00c8", (int)v9.b("f", (int)22885, (long)(0x250D3B505BDE650EL ^ l)), (long)3265965717346291917L, (long)l), (boolean)true, Integer.TYPE, (long)3265938857100141457L, (long)l);
                    this.k = v9.c("\u00e4", (Object)this, (Object)v9.c("\u00c8", (int)v9.b("f", (int)31610, (long)(0x73231E21749E4716L ^ l)), (long)3265965717346291917L, (long)l), (boolean)true, Integer.TYPE, (long)3265938857100141457L, (long)l);
                }
                catch (CustomSystemException customSystemException) {
                    throw v9.a(customSystemException);
                }
            }
            this.O = v9.c("\u00e4", (Object)this, (Object)v9.c("\u00c8", (int)v9.b("f", (int)1639, (long)(0x780779BBC8F63A09L ^ l)), (long)3265965717346291917L, (long)l), (boolean)true, Integer.TYPE, (Object)new Class[]{Integer.TYPE, Boolean.TYPE}, (long)3265868598884998291L, (long)l);
        }
        try {
            if (AbstractComputationKernel.J() != null) {
                CompressionAlgorithmManager.Z(new int[5]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw v9.a(customSystemException);
        }
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private void d(Object object, boolean bl) {
        this.Q.B(object, bl);
    }

    private void h(Object object, int n) {
        this.F.t(object, n);
    }

    static void c(v9 v92, Object object, int n) {
        v92.B(object, n);
    }

    private int X(Object object, int n, boolean bl) {
        return this.O.R(object, n, bl);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/v9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private boolean Z(Object object) {
        return this.a.R(object);
    }

    static void A(v9 v92, Object object, boolean bl) {
        v92.d(object, bl);
    }

    static int N(v9 v92, Object object) {
        return v92.u(object);
    }

    private void B(Object object, int n) {
        this.r.t(object, n);
    }

    static void V(v9 v92, Object object, int n) {
        v92.h(object, n);
    }

    static boolean l(v9 v92, Object object) {
        return v92.A(object);
    }

    private int u(Object object) {
        return this.r.R(object);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x113A;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
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
                throw new RuntimeException("a/v9", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            v9.d[n2] = n3;
        }
        return d[n2];
    }

    static int r(v9 v92, Object object) {
        return v92.r(object);
    }

    private static Field g(long l, long l2) {
        int n = v9.e(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = v9.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = v9.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = v9.c(clazz3, string2, clazz2)) != null) {
                    v9.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = v9.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        v9.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = v9.f(678444274606744L, 0L);
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

    private int r(Object object) {
        return this.F.R(object);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = v9.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = v9.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = v9.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = v9.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = v9.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    static int D(v9 v92, Object object, int n, boolean bl) {
        return v92.X(object, n, bl);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = v9.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private void U(Object object, boolean bl) {
        this.Q.B(object, bl);
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "\\|M*";
        objectArray[1] = "@Y#g\u0014\u0002KV2(i\u001aXQ;a";
        objectArray[2] = Boolean.TYPE;
        v9.g[2] = "java/lang/Boolean";
        objectArray[3] = "Z#i)\u000bGQ,xffGQ1l";
        objectArray[4] = "1\u000bZq\n?D+Q~\u001bp)+Qc\u000fe";
        objectArray[5] = "\rzPl";
        objectArray[6] = "\u0016Hq";
        objectArray[7] = Integer.TYPE;
        v9.g[7] = "java/lang/Integer";
        objectArray[8] = "2EGB";
        objectArray[9] = "}~\u0013\b\u0015bvq\u0002Gtl}z\u0006\u001d";
        objectArray[10] = "{\n3*\u007f[6\u0019cA\u0001&\u007fT<q-\u001e'\u0017p:F\u001f>\ff?{\u001e%\u000bhA|J*\n\u007f*~\u0019<\u0016\u0002z{V/\u0006> &A*i98'X}\u0006<9!FF";
        objectArray[11] = "a1Wz<D,\"\u0007\u0011^9eoX!n\u0001=,\u0014j\u0005\u0000$7\u0002o8\u0001?0\f\u0011?U01\u001bz=\u0006&-f,gZ%2_}cSgR";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "E0gt\u0011u\u0018/4>~{\u0002Ka5E/\u001dq&;\u0018vyr`{N{A*#7\u0005\u0010";
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(v9.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(v9.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

