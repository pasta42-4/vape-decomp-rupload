/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Dg;
import a.EP;
import a.OY;
import a.O_;
import a.a;
import a.d8;
import a.ey;
import a.jG;
import a.jd;
import a.jr;
import a.jv;
import a.pO;
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

public class jg
extends jv {
    private static final Object[] l;
    private final jr v;
    public final jd G;
    float Y;
    float P;
    private static final Map j;
    private static final long[] e;
    private static final long b;
    private static final String[] m;
    private static final Integer[] h;
    float r;
    float Z;
    private final jr d;

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public jg() {
        long l10 = b ^ 0x1F8080D4388L;
        super(a.cs((int)jg.a("w", (int)17346, (long)(0x35B8D9E0E838A15EL ^ l10))), ey.Y, a.cs((int)jg.a("w", (int)30576, (long)(0x2CF67C01C63015E8L ^ l10))));
        this.v = new jr((String)((Object)jg.c("n", (int)jg.a("w", (int)19814, (long)(0x46BC16B1884AFFCL ^ l10)), (long)4699235606553412940L, (long)l10)));
        this.d = new jr((String)((Object)jg.c("n", (int)jg.a("w", (int)17600, (long)(0x45AA5E22C399265BL ^ l10)), (long)4699235606553412940L, (long)l10)));
        this.G = jd.D(this, (String)((Object)jg.c("n", (int)jg.a("w", (int)4943, (long)(0x9A01C180DD971D6L ^ l10)), (long)4699235606553412940L, (long)l10)), this.v, this.v, this.d);
        this.N(this.G);
        this.s((String)((Object)jg.c("n", (int)jg.a("w", (int)18427, (long)(0x213FB5C950372566L ^ l10)), (long)4699235606553412940L, (long)l10)));
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = jg.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (m[n5] != null) {
            return n5;
        }
        Object object = l[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 33;
                break;
            }
            case 1: {
                n4 = 42;
                break;
            }
            case 2: {
                n4 = 34;
                break;
            }
            case 3: {
                n4 = 22;
                break;
            }
            case 4: {
                n4 = 46;
                break;
            }
            case 5: {
                n4 = 16;
                break;
            }
            case 6: {
                n4 = 11;
                break;
            }
            case 7: {
                n4 = 31;
                break;
            }
            case 8: {
                n4 = 53;
                break;
            }
            case 9: {
                n4 = 63;
                break;
            }
            case 10: {
                n4 = 50;
                break;
            }
            case 11: {
                n4 = 28;
                break;
            }
            case 12: {
                n4 = 13;
                break;
            }
            case 13: {
                n4 = 2;
                break;
            }
            case 14: {
                n4 = 4;
                break;
            }
            case 15: {
                n4 = 36;
                break;
            }
            case 16: {
                n4 = 17;
                break;
            }
            case 17: {
                n4 = 49;
                break;
            }
            case 18: {
                n4 = 58;
                break;
            }
            case 19: {
                n4 = 18;
                break;
            }
            case 20: {
                n4 = 1;
                break;
            }
            case 21: {
                n4 = 35;
                break;
            }
            case 22: {
                n4 = 25;
                break;
            }
            case 23: {
                n4 = 41;
                break;
            }
            case 24: {
                n4 = 14;
                break;
            }
            case 25: {
                n4 = 21;
                break;
            }
            case 26: {
                n4 = 8;
                break;
            }
            case 27: {
                n4 = 23;
                break;
            }
            case 28: {
                n4 = 29;
                break;
            }
            case 29: {
                n4 = 59;
                break;
            }
            case 30: {
                n4 = 7;
                break;
            }
            case 31: {
                n4 = 52;
                break;
            }
            case 32: {
                n4 = 55;
                break;
            }
            case 33: {
                n4 = 47;
                break;
            }
            case 34: {
                n4 = 61;
                break;
            }
            case 35: {
                n4 = 12;
                break;
            }
            case 36: {
                n4 = 51;
                break;
            }
            case 37: {
                n4 = 60;
                break;
            }
            case 38: {
                n4 = 0;
                break;
            }
            case 39: {
                n4 = 5;
                break;
            }
            case 40: {
                n4 = 62;
                break;
            }
            case 41: {
                n4 = 9;
                break;
            }
            case 42: {
                n4 = 45;
                break;
            }
            case 43: {
                n4 = 39;
                break;
            }
            case 44: {
                n4 = 56;
                break;
            }
            case 45: {
                n4 = 27;
                break;
            }
            case 46: {
                n4 = 3;
                break;
            }
            case 47: {
                n4 = 19;
                break;
            }
            case 48: {
                n4 = 24;
                break;
            }
            case 49: {
                n4 = 26;
                break;
            }
            case 50: {
                n4 = 32;
                break;
            }
            case 51: {
                n4 = 40;
                break;
            }
            case 52: {
                n4 = 48;
                break;
            }
            case 53: {
                n4 = 38;
                break;
            }
            case 54: {
                n4 = 6;
                break;
            }
            case 55: {
                n4 = 15;
                break;
            }
            case 56: {
                n4 = 10;
                break;
            }
            case 57: {
                n4 = 57;
                break;
            }
            case 58: {
                n4 = 43;
                break;
            }
            case 59: {
                n4 = 44;
                break;
            }
            case 60: {
                n4 = 20;
                break;
            }
            case 61: {
                n4 = 37;
                break;
            }
            case 62: {
                n4 = 54;
                break;
            }
            default: {
                n4 = 30;
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
        jg.m[n5] = new String(cArray);
        return n5;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00f0' || c10 == 'r' || c10 == 'Z' || c10 == 'e') {
                field = jg.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00f0' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'r' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'Z' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = jg.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00a4' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'n' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method a(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jg" + " : " + string + " : " + methodType.toString(), exception);
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

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = jg.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = jg.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = jg.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @OY
    public void n(pO pO2) {
        block4: {
            Dg dg;
            block5: {
                dg = pO2.getWorld();
                try {
                    try {
                        if (!dg.r()) break block4;
                        if (!((jG)this.G.J()).equals(this.v)) break block5;
                    }
                    catch (O_ o_2) {
                        throw jg.a(o_2);
                    }
                    dg.j(0.0f);
                    dg.u(0.0f);
                    dg.U(0.0f);
                    dg.b(0.0f);
                    break block4;
                }
                catch (O_ o_3) {
                    throw jg.a(o_3);
                }
            }
            dg.j(1.0f);
            dg.u(1.0f);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                jg.b = d8.a(-1809792519384653997L, -4881119646056660117L, MethodHandles.lookup().lookupClass()).a(188335791893637L);
                jg.l = new Object[5];
                jg.m = new String[5];
                jg.a();
                jg.j = new HashMap<K, V>(13);
                var0 = jg.b ^ 62531103086666L;
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
                var6_5 = "\u009cBF\u0015:\u00cd\u008c-\u0083\u00d9U\u00ba\u0087cMh\u00a5\u00bej\u00a3\u0002\u00f5\u0004\u001c\u00c4=\u00d3\u00fb\u00db\u00add\u0098";
                var7_6 = "\u009cBF\u0015:\u00cd\u008c-\u0083\u00d9U\u00ba\u0087cMh\u00a5\u00bej\u00a3\u0002\u00f5\u0004\u001c\u00c4=\u00d3\u00fb\u00db\u00add\u0098".length();
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
                    var6_5 = "\u00d1\u001a\u00e84\u00d2\u00cc\u00ab\u00cc\u00f4d\u00bf\u00ad\u00f9\u00c7\u00f1V";
                    var7_6 = "\u00d1\u001a\u00e84\u00d2\u00cc\u00ab\u00cc\u00f4d\u00bf\u00ad\u00f9\u00c7\u00f1V".length();
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
        jg.e = var8_3;
        jg.h = new Integer[6];
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = jg.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = jg.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l10, long l11) {
        int n2 = jg.a(l10, l11);
        Object object = l[n2];
        if (object instanceof String) {
            String string = m[n2];
            int n3 = string.indexOf(8);
            Class clazz = jg.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = jg.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = jg.a(clazz3, string2, clazz2)) != null) {
                    jg.l[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = jg.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        jg.l[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = jg.b(257754230345173L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l10, long l11) {
        int n2 = jg.a(l10, l11);
        Object object = l[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = m[n2];
                int n4 = string2.indexOf(8);
                clazz3 = jg.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = jg.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = jg.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        jg.l[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = jg.b(257754230345173L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = jg.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        jg.l[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = jg.b(257754230345173L, 0L);
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

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x23AE;
        if (h[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = e[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/jg", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            jg.h[n3] = n4;
        }
        return h[n3];
    }

    private static void a() {
        Object[] objectArray = l;
        l[0] = "yGM";
        objectArray[1] = Integer.TYPE;
        jg.m[1] = "java/lang/Integer";
        objectArray[2] = "\u001c\u0016z\u00149+\u0017\u0019k[D3\u0004\u001eb\u0012";
        objectArray[3] = "HG\tQ^FCH\u0018\u001e?HHC\u001cD";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "w<J~8(31\u0011\u00189?MiKf\"$7(\u0011b#Dwi\u001ab(zuk\n}R";
    }

    @Override
    public void h() {
        if (EP.c().r()) {
            Dg dg = EP.c();
            this.Y = dg.a();
            this.Z = dg.k();
            this.P = dg.T();
            this.r = dg.Z();
        }
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = jg.a(l10, l11);
            object = l[n2];
            try {
                if (!(object instanceof String)) break block2;
                jg.l[n2] = clazz = Class.forName(m[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public void v() {
        if (EP.c().r()) {
            Dg dg = EP.c();
            dg.j(this.Y);
            dg.u(this.Z);
            dg.U(this.P);
            dg.b(this.r);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(jg.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(jg.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

