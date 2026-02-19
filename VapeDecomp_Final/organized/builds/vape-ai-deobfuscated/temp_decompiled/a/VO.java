/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.F8;
import a.HK;
import a.O_;
import a.d8;
import a.eM;
import a.ht;
import a.v2;
import a.vP;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class vo
extends v2 {
    private static final Object[] f;
    private HK a;
    private static final long[] c;
    private static final Integer[] d;
    private static final long b;
    private static final String[] g;
    private HK I;
    public HK m;
    private HK q;
    private static final Map e;

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

    private static void a() {
        Object[] objectArray = f;
        f[0] = "R;\u007f";
        objectArray[1] = Integer.TYPE;
        vo.g[1] = "java/lang/Integer";
        objectArray[2] = "_\u001cB&\n\u0002T\u0013Siw\u001aG\u0014Z ";
        objectArray[3] = " D@\n";
        objectArray[4] = Boolean.TYPE;
        vo.g[4] = "java/lang/Boolean";
        objectArray[5] = "~L//<IuC>`QIu^*";
        objectArray[6] = "\u0002v@dh\nwVKkyE\u001aVKvmP";
        objectArray[7] = "8+B\u0012";
        objectArray[8] = "5Y>*\u000eJ>V/eoD5]+?";
        objectArray[9] = "ZxeZGh\u0001uz\u0012v_`-g\u0000\u000e|\u000el,\u0001L\u0002ZffX\u0016`\u0019vu\nv9\u0006}p\\\u001d8\u0019kwcJa\u001b){[\fa\t/\u001c^\u001be\u0010*u_\u0015h\u0010\u0014";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "<(P}\n6/z\u0019BQ&PzA-F-j \u0011-J]i8K:D3(sJx:";
    }

    static void o(vo vo2, int n2, FloatBuffer floatBuffer) {
        vo2.u(n2, floatBuffer);
    }

    static void b(vo vo2, int n2, int n3, int n4, FloatBuffer floatBuffer) {
        vo2.p(n2, n3, n4, floatBuffer);
    }

    private void w(FloatBuffer floatBuffer) {
        this.q.l(null, floatBuffer);
    }

    public vo() {
        block8: {
            long l10;
            block6: {
                block7: {
                    l10 = b ^ 0x757F09C7FF1BL;
                    int[] nArray = vP.y();
                    super(eM.EB);
                    int[] nArray2 = nArray;
                    try {
                        try {
                            try {
                                if (nArray2 != null) break block6;
                                if (F8.p()) break block7;
                            }
                            catch (O_ o_2) {
                                throw vo.a(o_2);
                            }
                            this.a = vo.c("X", (Object)this, (Object)vo.c("\u00da", (int)vo.b("a", (int)28633, (long)(0x7C31D70AF7A63AB8L ^ l10)), (long)-9166832136578947935L, (long)l10), (boolean)false, Void.TYPE, (Object)new Class[]{Integer.TYPE, IntBuffer.class}, (long)-9167071582825144829L, (long)l10);
                            this.m = vo.c("X", (Object)this, (Object)vo.c("\u00da", (int)vo.b("a", (int)17462, (long)(0x68EB0F7FBE219150L ^ l10)), (long)-9166832136578947935L, (long)l10), (boolean)false, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE, FloatBuffer.class}, (long)-9167071582825144829L, (long)l10);
                            this.q = vo.c("X", (Object)this, (Object)vo.c("\u00da", (int)vo.b("a", (int)32662, (long)(0x28A9F0D3668BAAF3L ^ l10)), (long)-9166832136578947935L, (long)l10), (boolean)false, Void.TYPE, (Object)new Class[]{FloatBuffer.class}, (long)-9167071582825144829L, (long)l10);
                            this.I = vo.c("X", (Object)this, (Object)vo.c("\u00da", (int)vo.b("a", (int)21589, (long)(0x1EC58B1BEC360131L ^ l10)), (long)-9166832136578947935L, (long)l10), (boolean)false, Void.TYPE, (Object)new Class[]{Integer.TYPE, FloatBuffer.class}, (long)-9167071582825144829L, (long)l10);
                            if (nArray2 == null) break block8;
                        }
                        catch (O_ o_3) {
                            throw vo.a(o_3);
                        }
                        ht.I(new String[5]);
                    }
                    catch (O_ o_4) {
                        throw vo.a(o_4);
                    }
                }
                this.a = vo.c("X", (Object)this, (Object)vo.c("\u00da", (int)vo.b("a", (int)8476, (long)(0x1842207B34C7F47FL ^ l10)), (long)-9166832136578947935L, (long)l10), (boolean)false, Void.TYPE, (Object)new Class[]{Integer.TYPE, IntBuffer.class}, (long)-9167071582825144829L, (long)l10);
                this.m = vo.c("X", (Object)this, (Object)vo.c("\u00da", (int)vo.b("a", (int)31706, (long)(0x7D69685475E8AEBDL ^ l10)), (long)-9166832136578947935L, (long)l10), (boolean)false, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, FloatBuffer.class}, (long)-9167071582825144829L, (long)l10);
                this.q = vo.c("X", (Object)this, (Object)vo.c("\u00da", (int)vo.b("a", (int)17530, (long)(0x7DE6A70DB9C91118L ^ l10)), (long)-9166832136578947935L, (long)l10), (boolean)false, Void.TYPE, (Object)new Class[]{FloatBuffer.class}, (long)-9167071582825144829L, (long)l10);
            }
            this.I = vo.c("X", (Object)this, (Object)vo.c("\u00da", (int)vo.b("a", (int)24934, (long)(0x2E0347CDBE99B406L ^ l10)), (long)-9166832136578947935L, (long)l10), (boolean)false, Void.TYPE, (Object)new Class[]{Integer.TYPE, FloatBuffer.class}, (long)-9167071582825144829L, (long)l10);
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/vo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static void O(vo vo2, int n2, IntBuffer intBuffer) {
        vo2.F(n2, intBuffer);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = vo.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = vo.e(l10, l11);
            object = f[n2];
            try {
                if (!(object instanceof String)) break block2;
                vo.f[n2] = clazz = Class.forName(g[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x55AD;
        if (d[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = c[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/vo", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            vo.d[n3] = n4;
        }
        return d[n3];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = vo.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private void p(int n2, int n3, int n4, FloatBuffer floatBuffer) {
        block3: {
            block2: {
                try {
                    if (F8.p()) break block2;
                    this.m.l(null, n2, n4, floatBuffer);
                    break block3;
                }
                catch (O_ o_2) {
                    throw vo.a(o_2);
                }
            }
            this.m.l(null, n2, n3, n4, floatBuffer);
        }
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (g[n5] != null) {
            return n5;
        }
        Object object = f[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 8;
                break;
            }
            case 1: {
                n4 = 20;
                break;
            }
            case 2: {
                n4 = 58;
                break;
            }
            case 3: {
                n4 = 6;
                break;
            }
            case 4: {
                n4 = 2;
                break;
            }
            case 5: {
                n4 = 57;
                break;
            }
            case 6: {
                n4 = 55;
                break;
            }
            case 7: {
                n4 = 23;
                break;
            }
            case 8: {
                n4 = 21;
                break;
            }
            case 9: {
                n4 = 28;
                break;
            }
            case 10: {
                n4 = 29;
                break;
            }
            case 11: {
                n4 = 27;
                break;
            }
            case 12: {
                n4 = 10;
                break;
            }
            case 13: {
                n4 = 31;
                break;
            }
            case 14: {
                n4 = 41;
                break;
            }
            case 15: {
                n4 = 51;
                break;
            }
            case 16: {
                n4 = 59;
                break;
            }
            case 17: {
                n4 = 63;
                break;
            }
            case 18: {
                n4 = 19;
                break;
            }
            case 19: {
                n4 = 12;
                break;
            }
            case 20: {
                n4 = 7;
                break;
            }
            case 21: {
                n4 = 52;
                break;
            }
            case 22: {
                n4 = 36;
                break;
            }
            case 23: {
                n4 = 34;
                break;
            }
            case 24: {
                n4 = 44;
                break;
            }
            case 25: {
                n4 = 11;
                break;
            }
            case 26: {
                n4 = 50;
                break;
            }
            case 27: {
                n4 = 56;
                break;
            }
            case 28: {
                n4 = 32;
                break;
            }
            case 29: {
                n4 = 1;
                break;
            }
            case 30: {
                n4 = 15;
                break;
            }
            case 31: {
                n4 = 40;
                break;
            }
            case 32: {
                n4 = 46;
                break;
            }
            case 33: {
                n4 = 30;
                break;
            }
            case 34: {
                n4 = 18;
                break;
            }
            case 35: {
                n4 = 14;
                break;
            }
            case 36: {
                n4 = 16;
                break;
            }
            case 37: {
                n4 = 4;
                break;
            }
            case 38: {
                n4 = 45;
                break;
            }
            case 39: {
                n4 = 22;
                break;
            }
            case 40: {
                n4 = 47;
                break;
            }
            case 41: {
                n4 = 0;
                break;
            }
            case 42: {
                n4 = 9;
                break;
            }
            case 43: {
                n4 = 13;
                break;
            }
            case 44: {
                n4 = 43;
                break;
            }
            case 45: {
                n4 = 26;
                break;
            }
            case 46: {
                n4 = 48;
                break;
            }
            case 47: {
                n4 = 53;
                break;
            }
            case 48: {
                n4 = 39;
                break;
            }
            case 49: {
                n4 = 17;
                break;
            }
            case 50: {
                n4 = 42;
                break;
            }
            case 51: {
                n4 = 38;
                break;
            }
            case 52: {
                n4 = 62;
                break;
            }
            case 53: {
                n4 = 49;
                break;
            }
            case 54: {
                n4 = 61;
                break;
            }
            case 55: {
                n4 = 54;
                break;
            }
            case 56: {
                n4 = 60;
                break;
            }
            case 57: {
                n4 = 33;
                break;
            }
            case 58: {
                n4 = 3;
                break;
            }
            case 59: {
                n4 = 25;
                break;
            }
            case 60: {
                n4 = 24;
                break;
            }
            case 61: {
                n4 = 37;
                break;
            }
            case 62: {
                n4 = 5;
                break;
            }
            default: {
                n4 = 35;
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
        vo.g[n5] = new String(cArray);
        return n5;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                vo.b = d8.a(-7581316558747608762L, 7160694067695339614L, MethodHandles.lookup().lookupClass()).a(194420523633450L);
                vo.f = new Object[11];
                vo.g = new String[11];
                vo.a();
                vo.e = new HashMap<K, V>(13);
                var0 = vo.b ^ 100616944651932L;
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
                var6_5 = "N(\u008e\u001f\u0015\u008e\u00f8\u00c8f\u00cb\u00f9\u00aa\u0081\t\u00f5\u00b4\u00aas\u00cc\u00fezbK\u00c4i\u008eD\u008e\u00e8\u0019\\\u00e3Xw\u0002\u0014a\u00cc\u00c5h{\u0015s\u00a6A\u0093\u009f[";
                var7_6 = "N(\u008e\u001f\u0015\u008e\u00f8\u00c8f\u00cb\u00f9\u00aa\u0081\t\u00f5\u00b4\u00aas\u00cc\u00fezbK\u00c4i\u008eD\u008e\u00e8\u0019\\\u00e3Xw\u0002\u0014a\u00cc\u00c5h{\u0015s\u00a6A\u0093\u009f[".length();
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
                    var6_5 = "a\u000e~@\u007f\u00f5M\u00f6\u00b6\u00ad\u001d\u008coa\u00b2\u00d4";
                    var7_6 = "a\u000e~@\u007f\u00f5M\u00f6\u00b6\u00ad\u001d\u008coa\u00b2\u00d4".length();
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
        vo.c = var8_3;
        vo.d = new Integer[8];
    }

    private static Field g(long l10, long l11) {
        int n2 = vo.e(l10, l11);
        Object object = f[n2];
        if (object instanceof String) {
            String string = g[n2];
            int n3 = string.indexOf(8);
            Class clazz = vo.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = vo.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = vo.c(clazz3, string2, clazz2)) != null) {
                    vo.f[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = vo.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        vo.f[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = vo.f(624477456736197L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void u(int n2, FloatBuffer floatBuffer) {
        this.I.l(null, n2, floatBuffer);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00a4' || c10 == '\u00de' || c10 == 'o' || c10 == '\u00f8') {
                field = vo.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00a4' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00de' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'o' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = vo.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'X' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00da' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = vo.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = vo.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/vo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static void r(vo vo2, FloatBuffer floatBuffer) {
        vo2.w(floatBuffer);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = vo.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = vo.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private void F(int n2, IntBuffer intBuffer) {
        this.a.l(null, n2, intBuffer);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method h(long l10, long l11) {
        int n2 = vo.e(l10, l11);
        Object object = f[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = g[n2];
                int n4 = string2.indexOf(8);
                clazz3 = vo.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = vo.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = vo.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        vo.f[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = vo.f(624477456736197L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = vo.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        vo.f[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = vo.f(624477456736197L, 0L);
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(vo.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(vo.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

