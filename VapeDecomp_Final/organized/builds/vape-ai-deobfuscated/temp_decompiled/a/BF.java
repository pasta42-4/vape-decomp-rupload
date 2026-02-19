/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package a;

import a.Dg;
import a.EP;
import a.F8;
import a.FG;
import a.G5;
import a.O_;
import a.Qg;
import a.Qh;
import a.Rs;
import a.SE;
import a.Sz;
import a.ZN;
import a.d8;
import a.eM;
import a.ek;
import a.ht;
import a.k2;
import a.sy;
import a.tl;
import a.vF;
import a.wf;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

public class bf
extends ht {
    private static final Integer[] B;
    private static final Object[] E;
    static final boolean b;
    private final wf V;
    private static final long[] v;
    private static final Map D;
    private static final long n;
    private static final String[] F;

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static double lambda$renderRadar$0(ek ek2) {
        return ((ZN)ek2.Z()).u();
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x3BB6;
        if (B[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = v[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])D.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    D.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/bf", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            bf.B[n3] = n4;
        }
        return B[n3];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = bf.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = bf.e(l10, l11);
            object = E[n2];
            try {
                if (!(object instanceof String)) break block2;
                bf.E[n2] = clazz = Class.forName(F[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static void a() {
        Object[] objectArray = E;
        E[0] = "5\fO";
        objectArray[1] = Integer.TYPE;
        bf.F[1] = "java/lang/Integer";
        objectArray[2] = "1\u0007bNP\u0015:\bs\u0001-\r)\u000fzH";
        objectArray[3] = ".\u000f@>A\u0010%\u0000Qq \u001e.\u000bU+";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "]Gu;N8\b\u0011,KN{aC+z]f\u001b\u0010\u007f{D\u0000X\u0003|&]`\u0000\u000b+)%";
    }

    public bf(wf wf2) {
        this.V = wf2;
    }

    @Override
    public void d() {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                bf.n = d8.a(-2412868035185033179L, -465853488615270487L, MethodHandles.lookup().lookupClass()).a(198067029734870L);
                bf.E = new Object[5];
                bf.F = new String[5];
                bf.a();
                bf.D = new HashMap<K, V>(13);
                var0 = bf.n ^ 112798657477305L;
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
                var6_5 = "\u00ca\u00a9\u00e8\u001b\u0081\u00c8t\u0090\u00d1D\u00fb\u00e2zO\u008e\u0010]Q3[\u00a4\u00d7MmL\u00db\u00fb4(Et\u00fdh1\u00852\u00f8\u00e6\u00c1\u0013\u00d7Kv.=<\fO\fj;\u00c6^\u0092\u0012\u00d4";
                var7_6 = "\u00ca\u00a9\u00e8\u001b\u0081\u00c8t\u0090\u00d1D\u00fb\u00e2zO\u008e\u0010]Q3[\u00a4\u00d7MmL\u00db\u00fb4(Et\u00fdh1\u00852\u00f8\u00e6\u00c1\u0013\u00d7Kv.=<\fO\fj;\u00c6^\u0092\u0012\u00d4".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block10;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u0089!\u00f3\u0017\u0017a\u0095`\u000b\u008f\u0095\n\u00f1\u00ff3\u00f9";
                    var7_6 = "\u0089!\u00f3\u0017\u0017a\u0095`\u000b\u008f\u0095\n\u00f1\u00ff3\u00f9".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl42:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block11;
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
        bf.v = var8_3;
        bf.B = new Integer[9];
        try {
            v8 = bf.class.desiredAssertionStatus() == false;
        }
        catch (O_ v9) {
            throw bf.a(v9);
        }
        bf.b = v8;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'D' || c10 == '\u00c8' || c10 == '\u00dc' || c10 == '\u00b5') {
                field = bf.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'D' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00c8' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00dc' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = bf.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'Z' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00e8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @Override
    public double z() {
        return 0.0;
    }

    @Override
    public void g() {
    }

    @Override
    public void U() {
        this.Q(true);
    }

    @Override
    public void G() {
        this.Q(false);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = bf.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = bf.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method h(long l10, long l11) {
        int n2 = bf.e(l10, l11);
        Object object = E[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = F[n2];
                int n4 = string2.indexOf(8);
                clazz3 = bf.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
                int n5 = string2.indexOf(8, ++n4);
                string = string2.substring(n4, n5);
                int n6 = -1;
                int n7 = n5;
                do {
                    ++n6;
                    ++n7;
                } while ((n7 = string2.indexOf(8, n7)) > -1);
                n3 = n6 - 1;
                classArray2 = new Class[n3];
                clazz2 = null;
                n7 = n5 + 1;
                for (int i10 = 0; i10 < n6; ++i10) {
                    int n8 = string2.indexOf(8, n7);
                    clazz2 = bf.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = bf.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        bf.E[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = bf.f(245644142971941L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = bf.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        bf.E[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = bf.f(245644142971941L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n9 = 0;
            while (n9 < n3) {
                stringBuffer.append(classArray2[n9].getName());
                if (++n9 >= n3) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (F[n5] != null) {
            return n5;
        }
        Object object = E[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 45;
                break;
            }
            case 1: {
                n4 = 57;
                break;
            }
            case 2: {
                n4 = 1;
                break;
            }
            case 3: {
                n4 = 53;
                break;
            }
            case 4: {
                n4 = 19;
                break;
            }
            case 5: {
                n4 = 3;
                break;
            }
            case 6: {
                n4 = 16;
                break;
            }
            case 7: {
                n4 = 43;
                break;
            }
            case 8: {
                n4 = 33;
                break;
            }
            case 9: {
                n4 = 61;
                break;
            }
            case 10: {
                n4 = 0;
                break;
            }
            case 11: {
                n4 = 20;
                break;
            }
            case 12: {
                n4 = 51;
                break;
            }
            case 13: {
                n4 = 62;
                break;
            }
            case 14: {
                n4 = 23;
                break;
            }
            case 15: {
                n4 = 17;
                break;
            }
            case 16: {
                n4 = 11;
                break;
            }
            case 17: {
                n4 = 31;
                break;
            }
            case 18: {
                n4 = 29;
                break;
            }
            case 19: {
                n4 = 2;
                break;
            }
            case 20: {
                n4 = 21;
                break;
            }
            case 21: {
                n4 = 25;
                break;
            }
            case 22: {
                n4 = 27;
                break;
            }
            case 23: {
                n4 = 8;
                break;
            }
            case 24: {
                n4 = 56;
                break;
            }
            case 25: {
                n4 = 26;
                break;
            }
            case 26: {
                n4 = 58;
                break;
            }
            case 27: {
                n4 = 5;
                break;
            }
            case 28: {
                n4 = 32;
                break;
            }
            case 29: {
                n4 = 52;
                break;
            }
            case 30: {
                n4 = 13;
                break;
            }
            case 31: {
                n4 = 14;
                break;
            }
            case 32: {
                n4 = 18;
                break;
            }
            case 33: {
                n4 = 35;
                break;
            }
            case 34: {
                n4 = 6;
                break;
            }
            case 35: {
                n4 = 10;
                break;
            }
            case 36: {
                n4 = 47;
                break;
            }
            case 37: {
                n4 = 44;
                break;
            }
            case 38: {
                n4 = 48;
                break;
            }
            case 39: {
                n4 = 34;
                break;
            }
            case 40: {
                n4 = 38;
                break;
            }
            case 41: {
                n4 = 22;
                break;
            }
            case 42: {
                n4 = 15;
                break;
            }
            case 43: {
                n4 = 49;
                break;
            }
            case 44: {
                n4 = 12;
                break;
            }
            case 45: {
                n4 = 36;
                break;
            }
            case 46: {
                n4 = 39;
                break;
            }
            case 47: {
                n4 = 55;
                break;
            }
            case 48: {
                n4 = 46;
                break;
            }
            case 49: {
                n4 = 30;
                break;
            }
            case 50: {
                n4 = 37;
                break;
            }
            case 51: {
                n4 = 4;
                break;
            }
            case 52: {
                n4 = 63;
                break;
            }
            case 53: {
                n4 = 60;
                break;
            }
            case 54: {
                n4 = 42;
                break;
            }
            case 55: {
                n4 = 41;
                break;
            }
            case 56: {
                n4 = 9;
                break;
            }
            case 57: {
                n4 = 28;
                break;
            }
            case 58: {
                n4 = 7;
                break;
            }
            case 59: {
                n4 = 54;
                break;
            }
            case 60: {
                n4 = 59;
                break;
            }
            case 61: {
                n4 = 24;
                break;
            }
            case 62: {
                n4 = 50;
                break;
            }
            default: {
                n4 = 40;
            }
        }
        n6 = n4;
        int[] nArray = new int[6];
        int n7 = 0;
        while (n7 < 6) {
            n3 = 7 * (5 - n7);
            n2 = (int)(l10 >>> n3 & 0x7FL);
            if ((n2 -= n6) < 0) {
                n2 += 128;
            }
            nArray[n7] = n2;
            ++n7;
        }
        char[] cArray = ((String)object).toCharArray();
        n3 = 0;
        while (n3 < cArray.length) {
            n2 = nArray[n3 % nArray.length];
            if (n2 == 0) break;
            cArray[n3] = (char)(cArray[n3] ^ n2);
            ++n3;
        }
        bf.F[n5] = new String(cArray);
        return n5;
    }

    private static Method c(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n2) continue;
            for (int i10 = 0; i10 < n2; ++i10) {
                if (classArray2[i10] != classArray[i10]) continue block0;
            }
            return method;
        }
        return null;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = bf.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static Field g(long l10, long l11) {
        int n2 = bf.e(l10, l11);
        Object object = E[n2];
        if (object instanceof String) {
            String string = F[n2];
            int n3 = string.indexOf(8);
            Class clazz = bf.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = bf.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = bf.c(clazz3, string2, clazz2)) != null) {
                    bf.E[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = bf.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        bf.E[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = bf.f(245644142971941L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = bf.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = bf.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public double e() {
        return 0.0;
    }

    @Override
    public void Z(Sz sz2) {
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void Q(boolean bl2) {
        int n2;
        int n3;
        double d2;
        double d3;
        G5 g5;
        long l10;
        block109: {
            void var12_12;
            block103: {
                List list;
                Qg qg2;
                block110: {
                    boolean bl3;
                    double d4;
                    double d5;
                    double d6;
                    boolean bl4;
                    block91: {
                        double d7;
                        block111: {
                            block92: {
                                void var25_39;
                                float f10;
                                float f11;
                                block89: {
                                    block90: {
                                        boolean bl5;
                                        Dg dg;
                                        block88: {
                                            double d9;
                                            double d10;
                                            l10 = n ^ 0x153788713134L;
                                            g5 = SE.h.W().S(1.0);
                                            d3 = this.G();
                                            try {
                                                d10 = (float)this.W();
                                                d9 = bl2 ? this.V.Q().b() : -2.0;
                                            }
                                            catch (O_ o_2) {
                                                throw bf.a(o_2);
                                            }
                                            d2 = (float)(d10 - d9);
                                            qg2 = EP.U();
                                            dg = EP.c();
                                            try {
                                                try {
                                                    if (!dg.Y() && !qg2.Y()) break block88;
                                                    return;
                                                }
                                                catch (O_ o_3) {
                                                    throw bf.a(o_3);
                                                }
                                            }
                                            catch (O_ o_4) {
                                                throw bf.a(o_4);
                                            }
                                        }
                                        list = dg.M();
                                        if (this.V.L().F.J() != this.V.L().D) break block110;
                                        bl4 = GL11.glIsEnabled((int)3042);
                                        d7 = (Double)this.V.L().i.J();
                                        d6 = d7 / 2.0;
                                        d5 = (Double)this.V.L().r.J();
                                        d4 = (Double)this.V.L().J.J();
                                        try {
                                            bl5 = this.V.L().b.J() == this.V.L().s;
                                        }
                                        catch (O_ o_5) {
                                            throw bf.a(o_5);
                                        }
                                        bl3 = bl5;
                                        try {
                                            try {
                                                if (!this.V.L().x.s().booleanValue()) break block89;
                                                if (!bl3) break block90;
                                            }
                                            catch (O_ o_6) {
                                                throw bf.a(o_6);
                                            }
                                            F8.o(d3, d2, d7, d7, new Color((int)bf.b("c", (int)29747, (long)(0x4D42BCC53A685255L ^ l10)), true), false, 3.0f, 1.0f);
                                            break block89;
                                        }
                                        catch (O_ o_7) {
                                            throw bf.a(o_7);
                                        }
                                    }
                                    F8.T(d3, d2, d7, 1.0, new Color(0.0f, 0.0f, 0.0f, 0.5f));
                                }
                                if (this.V.L().A.s().booleanValue()) {
                                    float f12 = (float)((d3 -= 0.5) + d7 / 2.0 - 0.5);
                                    float f13 = (float)((d2 -= 0.5) + 0.5);
                                    f11 = (float)(d3 + d7 / 2.0 + 0.5);
                                    float f14 = (float)(d2 + d7 - 0.5);
                                    f10 = f11 - f12;
                                    float f15 = f14 - f13;
                                    F8.H(f12, f13, f10, f15, new Color((int)bf.b("c", (int)5154, (long)(0x2B051851BC93B240L ^ l10)), true));
                                    f12 = (float)(d3 + 0.5);
                                    f13 = (float)(d2 + d7 / 2.0 - 0.5);
                                    f11 = (float)(d3 + d7 - 0.5);
                                    f14 = (float)(d2 + d7 / 2.0 + 0.5);
                                    f10 = f11 - f12;
                                    f15 = f14 - f13;
                                    F8.H(f12, f13, f10, f15, new Color((int)bf.b("c", (int)7555, (long)(0x4CB24C1A4E863BE4L ^ l10)), true));
                                }
                                try {
                                    try {
                                        if (!this.V.L().x.s().booleanValue() || !bl3) break block91;
                                    }
                                    catch (O_ o_8) {
                                        throw bf.a(o_8);
                                    }
                                    if (!SE.h.a().q.j()) break block92;
                                }
                                catch (O_ o_9) {
                                    throw bf.a(o_9);
                                }
                                F8.o(d3 + 1.0, d2 + 0.5, 2.0, 1.5, SE.h.a().q.L(), false, 1.0f, 1.0f);
                                k2 k22 = SE.h.a().q.L();
                                float[] fArray = new float[3];
                                Color.RGBtoHSB(((Color)k22).getRed(), ((Color)k22).getGreen(), ((Color)k22).getBlue(), fArray);
                                f11 = fArray[0];
                                k2 k23 = k22;
                                f10 = 2.0f;
                                while ((double)f10 < d7 - 2.0) {
                                    Color color = Rs.b(f11, 0.9f, 1.0f);
                                    f11 = (float)((double)f11 + 0.005);
                                    F8.A(d3 + (double)f10, d2 + 0.1, 1.0, 1.75, color);
                                    f10 += 1.0f;
                                }
                                F8.o(d3 + d7 - 3.0, d2 + 0.5, 2.0, 1.5, (Color)var25_39, false, 1.0f, 1.0f);
                                break block111;
                            }
                            F8.o(d3 + 1.0, d2 + 0.5, d7 - 2.0, 1.5, SE.h.a().q.L(), false, 1.0f, 1.0f);
                        }
                        k2 k24 = new k2(bf.M.a);
                        k24.I(100);
                        F8.U(d3, d2, d7, d7, k24, 3.0f, 1.0f, 1.0f);
                    }
                    for (Object e10 : list) {
                        Color color;
                        double d11;
                        double d12;
                        block101: {
                            ZN zN2;
                            block100: {
                                block97: {
                                    block112: {
                                        double d13;
                                        double d14;
                                        double d15;
                                        double d16;
                                        block96: {
                                            block93: {
                                                double d17;
                                                double d18;
                                                double d19;
                                                double d20;
                                                block95: {
                                                    block94: {
                                                        if (e10 == qg2.M()) continue;
                                                        Qh qh2 = new Qh(e10);
                                                        try {
                                                            if (SE.h.a().P(qh2)) {
                                                                continue;
                                                            }
                                                        }
                                                        catch (O_ o_10) {
                                                            throw bf.a(o_10);
                                                        }
                                                        zN2 = vF.a(qh2, qg2);
                                                        double d21 = qg2.b() + (qg2.F() - qg2.b()) * (double)EP.K().h();
                                                        double d22 = qg2.I() + (qg2.B() - qg2.I()) * (double)EP.K().h();
                                                        double d23 = qh2.b() + (qh2.F() - qh2.b()) * (double)EP.K().h();
                                                        double d24 = qh2.I() + (qh2.B() - qh2.I()) * (double)EP.K().h();
                                                        double d25 = d23 - d21;
                                                        double d26 = d24 - d22;
                                                        d16 = d3 + d6;
                                                        d15 = d2 + d6;
                                                        float f16 = (float)Math.cos((double)qg2.q() * (Math.PI / 180));
                                                        float f17 = (float)Math.sin((double)qg2.q() * (Math.PI / 180));
                                                        d14 = -(d25 * (double)f16 + d26 * (double)f17) * d5;
                                                        d13 = -(d26 * (double)f16 - d25 * (double)f17) * d5;
                                                        try {
                                                            try {
                                                                if (!bl3) break block93;
                                                                d20 = d16;
                                                                if (this.V.L().X.s().booleanValue()) break block94;
                                                            }
                                                            catch (O_ o_11) {
                                                                throw bf.a(o_11);
                                                            }
                                                            d19 = d14;
                                                            break block95;
                                                        }
                                                        catch (O_ o_12) {
                                                            throw bf.a(o_12);
                                                        }
                                                    }
                                                    d19 = sy.Z(d14, -d6 + d4 / 2.0, d6 - d4 / 2.0);
                                                }
                                                d12 = d20 + d19;
                                                try {
                                                    d18 = d15;
                                                    d17 = this.V.L().X.s() == false ? d13 : sy.Z(d13, -d6 + d4 / 2.0, d6 - d4 / 2.0);
                                                }
                                                catch (O_ o_13) {
                                                    throw bf.a(o_13);
                                                }
                                                d11 = d18 + d17;
                                                d11 = Math.max(d11, d2 + 4.0);
                                                break block112;
                                            }
                                            try {
                                                if (!this.V.L().X.s().booleanValue() || !(Math.sqrt(d14 * d14 + d13 * d13) > d6)) break block96;
                                            }
                                            catch (O_ o_14) {
                                                throw bf.a(o_14);
                                            }
                                            float f18 = (float)Math.atan2(d13, d14);
                                            d14 = (float)((d6 - 0.5) * Math.cos(f18));
                                            d13 = (float)((d6 - 0.5) * Math.sin(f18));
                                        }
                                        d12 = d16 + d14;
                                        d11 = d15 + d13;
                                    }
                                    color = Color.WHITE;
                                    if (this.V.L().W.J() == this.V.L().e) {
                                        color = this.V.L().R.L();
                                    } else if (this.V.L().W.J() == this.V.L().j) {
                                        k2 k25 = zN2.w(true);
                                        if (k25 != null) {
                                            color = k25;
                                        }
                                    } else {
                                        k2 k26;
                                        block99: {
                                            block98: {
                                                try {
                                                    try {
                                                        if (this.V.L().W.J() != this.V.L().u) break block97;
                                                        if (!zN2.T()) break block98;
                                                    }
                                                    catch (O_ o_15) {
                                                        throw bf.a(o_15);
                                                    }
                                                    k26 = this.V.L().O.L();
                                                    break block99;
                                                }
                                                catch (O_ o_16) {
                                                    throw bf.a(o_16);
                                                }
                                            }
                                            k26 = this.V.L().z.L();
                                        }
                                        color = k26;
                                    }
                                }
                                try {
                                    if (!zN2.Y() || !SE.h.j().b.s().booleanValue()) break block100;
                                }
                                catch (O_ o_17) {
                                    throw bf.a(o_17);
                                }
                                color = SE.h.j().u.L();
                            }
                            try {
                                if (!zN2.E() || !SE.h.g().a.s().booleanValue()) break block101;
                            }
                            catch (O_ o_18) {
                                throw bf.a(o_18);
                            }
                            color = SE.h.g().F.L();
                        }
                        try {
                            if (this.V.L().d.J() == this.V.L().Q) {
                                FG.n(d12 - d4 / 2.0, d11 - d4 / 2.0, d12 + d4 / 2.0, d11 + d4 / 2.0, 0.5, color, new Color((int)bf.b("c", (int)16283, (long)(0x4C80EF9E457399FFL ^ l10)), true));
                                continue;
                            }
                        }
                        catch (O_ o_19) {
                            throw bf.a(o_19);
                        }
                        double d27 = d4 / 2.0;
                        F8.T(d12 - d27, d11 - d27, d4, 0.5, color);
                        F8.r((float)(d12 - d27), (float)(d11 - d27), (float)d4, 1.0f, 0.75f, new Color((int)bf.b("c", (int)27133, (long)(0x734584F376824F98L ^ l10)), true));
                    }
                    try {
                        if (!bl4) return;
                        tl.N();
                        return;
                    }
                    catch (O_ o_20) {
                        throw bf.a(o_20);
                    }
                }
                ArrayList<ek> arrayList = new ArrayList<ek>();
                ArrayList arrayList2 = new ArrayList();
                int n4 = ((Double)this.V.L().Y.J()).intValue();
                for (Object e11 : list) {
                    try {
                        try {
                            if (!eM.UQ.isAssignableFrom(e11.getClass()) || e11 == qg2.M()) continue;
                        }
                        catch (O_ o_21) {
                            throw bf.a(o_21);
                        }
                        if (arrayList2.contains(e11)) continue;
                    }
                    catch (O_ o_22) {
                        throw bf.a(o_22);
                    }
                    Qh qh3 = new Qh(e11);
                    try {
                        if (SE.h.a().P(qh3)) {
                            continue;
                        }
                    }
                    catch (O_ o_23) {
                        throw bf.a(o_23);
                    }
                    try {
                        try {
                            try {
                                if (n4 != 0 && !(qg2.y(qh3) <= (float)n4)) continue;
                            }
                            catch (O_ o_24) {
                                throw bf.a(o_24);
                            }
                            if (SE.h.a().P(qh3)) {
                                continue;
                            }
                        }
                        catch (O_ o_25) {
                            throw bf.a(o_25);
                        }
                    }
                    catch (O_ o_26) {
                        throw bf.a(o_26);
                    }
                    arrayList.add(ek.U(qh3, vF.a(qh3, qg2)));
                    arrayList2.add(e11);
                }
                try {
                    if (arrayList.isEmpty()) {
                        return;
                    }
                }
                catch (O_ o_27) {
                    throw bf.a(o_27);
                }
                arrayList.sort(Comparator.comparingDouble(bf::lambda$renderRadar$0));
                int n5 = ((Double)this.V.L().U.J()).intValue();
                n3 = 0;
                try {
                    if ((Double)this.V.L().U.J() == 0.0 || arrayList.size() <= n5) break block103;
                }
                catch (O_ o_28) {
                    throw bf.a(o_28);
                }
                n3 = arrayList.size() - n5;
                List list2 = arrayList.subList(0, n5);
            }
            n2 = 0;
            for (ek ek2 : var12_12) {
                int n6;
                String string;
                String string2;
                block108: {
                    block107: {
                        CallSite callSite;
                        int n7;
                        ZN zN3;
                        block106: {
                            block105: {
                                block104: {
                                    Qh qh4 = (Qh)ek2.r();
                                    zN3 = (ZN)ek2.p();
                                    try {
                                        try {
                                            if (b || zN3 != null) break block104;
                                            throw new AssertionError();
                                        }
                                        catch (O_ o_29) {
                                            throw bf.a(o_29);
                                        }
                                    }
                                    catch (O_ o_30) {
                                        throw bf.a(o_30);
                                    }
                                }
                                n7 = (int)zN3.u();
                                try {
                                    if (n7 <= 100) break block105;
                                    callSite = bf.c("\u00e8", (int)bf.b("c", (int)3023, (long)(0x6286E48DB1502DACL ^ l10)), (long)2149911678967842268L, (long)l10);
                                    break block106;
                                }
                                catch (O_ o_31) {
                                    throw bf.a(o_31);
                                }
                            }
                            try {
                                callSite = n7 > 50 ? bf.c("\u00e8", (int)bf.b("c", (int)27957, (long)(0x3BB6B571DB98CB5CL ^ l10)), (long)2149911678967842268L, (long)l10) : bf.c("\u00e8", (int)bf.b("c", (int)18662, (long)(0x2247E9367F9D6E87L ^ l10)), (long)2149911678967842268L, (long)l10);
                            }
                            catch (O_ o_32) {
                                throw bf.a(o_32);
                            }
                        }
                        CallSite callSite2 = callSite;
                        string2 = String.format("\u00a7%s%dm", callSite2, n7);
                        try {
                            if (this.V.L().x.s().booleanValue()) {
                                F8.A(d3, d2 + (double)n2, this.w(), 10.0, new Color(20, 20, 20, 180));
                                F8.A(d3, d2 + (double)n2 + 9.5, this.w(), 0.5, new Color(25, 25, 25, 65));
                            }
                        }
                        catch (O_ o_33) {
                            throw bf.a(o_33);
                        }
                        string = zN3.g();
                        try {
                            if (!SE.h.j().Q(string)) break block107;
                            n6 = SE.h.j().u.G();
                            break block108;
                        }
                        catch (O_ o_34) {
                            throw bf.a(o_34);
                        }
                    }
                    try {
                        n6 = SE.h.g().Q(string) ? SE.h.g().F.G() : -1;
                    }
                    catch (O_ o_35) {
                        throw bf.a(o_35);
                    }
                }
                int n8 = n6;
                g5.S(string, d3 + 1.0, d2 + 2.0 + (double)n2, n8);
                g5.S(string2, d3 + this.w() - g5.D(string2) - 1.0, d2 + 2.0 + (double)n2, -1);
                n2 += 10;
            }
            try {
                try {
                    if (n3 <= 0) return;
                    if (!this.V.L().x.s().booleanValue()) break block109;
                }
                catch (O_ o_36) {
                    throw bf.a(o_36);
                }
                F8.A(d3, d2 + (double)n2, this.w(), 10.0, new Color(20, 20, 20, 180));
                F8.A(d3, d2 + (double)n2 + 9.5, this.w(), 0.5, new Color(25, 25, 25, 65));
            }
            catch (O_ o_37) {
                throw bf.a(o_37);
            }
        }
        g5.S(n3 + (String)((Object)bf.c("\u00e8", (int)bf.b("c", (int)4976, (long)(0x639587D34642B510L ^ l10)), (long)2149911678967842268L, (long)l10)), d3 + 1.0, d2 + 2.0 + (double)n2, -1);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bf.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(bf.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

