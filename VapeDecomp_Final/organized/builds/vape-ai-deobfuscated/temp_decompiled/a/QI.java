/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Hc;
import a.Ib;
import a.O_;
import a.SE;
import a.d8;
import a.eM;
import a.q4;
import a.v2;
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

public class qi
extends v2 {
    private final Ib D;
    private static final long[] c;
    private static final Map e;
    private static final String[] g;
    private final Ib J;
    private final Ib a;
    private final Ib s;
    private static final Object[] f;
    private static final Integer[] d;
    private static final long b;
    private final Ib y;

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                qi.b = d8.a(-5910277977913436003L, 460015636185465451L, MethodHandles.lookup().lookupClass()).a(53806648528932L);
                qi.f = new Object[10];
                qi.g = new String[10];
                qi.a();
                qi.e = new HashMap<K, V>(13);
                var0 = qi.b ^ 80393317442839L;
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
                var8_3 = new long[10];
                var5_4 = 0;
                var6_5 = "\u00fbo\u00f8\u00d9Z\u0080^!\u00fa\u00f9!\u001f\u0085\u000e\u00da\u0087\u00a3\"\u00a8@\u00e6\u0080\u0086\u00e6y\u00ccj\u0092\u00c3g|\u0007P@&\u0014\u00de\u008b\u00bb\u00cb\u00df\u009cN\u00eam\u00c8m\u0081\u0093b\u001d\u00e1\u00d2\u0094\u00c1\u009e\u007f\u00e1>\\\u00d5*u\u00ac";
                var7_6 = "\u00fbo\u00f8\u00d9Z\u0080^!\u00fa\u00f9!\u001f\u0085\u000e\u00da\u0087\u00a3\"\u00a8@\u00e6\u0080\u0086\u00e6y\u00ccj\u0092\u00c3g|\u0007P@&\u0014\u00de\u008b\u00bb\u00cb\u00df\u009cN\u00eam\u00c8m\u0081\u0093b\u001d\u00e1\u00d2\u0094\u00c1\u009e\u007f\u00e1>\\\u00d5*u\u00ac".length();
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
                    var6_5 = "vE~%\u00db\u00cd+\u008f\u00b5\u0099\u00be\u00e0\u001bM\u00b3\f";
                    var7_6 = "vE~%\u00db\u00cd+\u008f\u00b5\u0099\u00be\u00e0\u001bM\u00b3\f".length();
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
        qi.c = var8_3;
        qi.d = new Integer[10];
    }

    public qi() {
        block8: {
            long l10;
            block6: {
                l10 = b ^ 0x3864754388F9L;
                String[] stringArray = q4.o();
                super(eM.Eh);
                String[] stringArray2 = stringArray;
                try {
                    block7: {
                        try {
                            try {
                                if (stringArray2 != null) break block6;
                                if (!SE.h.d()) break block7;
                            }
                            catch (O_ o_2) {
                                throw qi.a(o_2);
                            }
                            this.s = qi.c("b", (Object)this, (Object)qi.c("K", (int)qi.b("n", (int)6750, (long)(0x66D07E4598A19CB8L ^ l10)), (long)8828830565918159743L, (long)l10), (boolean)Hc.z, (Object)eM.Ua, (long)8828789072382908065L, (long)l10);
                            this.J = qi.c("b", (Object)this, (Object)qi.c("K", (int)qi.b("n", (int)1187, (long)(0x1A02B20A2DDF8249L ^ l10)), (long)8828830565918159743L, (long)l10), (boolean)Hc.z, (Object)eM.Ua, (long)8828789072382908065L, (long)l10);
                            this.D = qi.c("b", (Object)this, (Object)qi.c("K", (int)qi.b("n", (int)1363, (long)(0x6ABD7617FCE983BBL ^ l10)), (long)8828830565918159743L, (long)l10), (boolean)Hc.z, (Object)eM.Ua, (long)8828789072382908065L, (long)l10);
                            this.a = qi.c("b", (Object)this, (Object)qi.c("K", (int)qi.b("n", (int)31945, (long)(0x42B045F5D24DFA24L ^ l10)), (long)8828830565918159743L, (long)l10), (boolean)Hc.z, (Object)eM.Ua, (long)8828789072382908065L, (long)l10);
                            this.y = qi.c("b", (Object)this, (Object)qi.c("K", (int)qi.b("n", (int)20769, (long)(0x1002AFACC84FD7CFL ^ l10)), (long)8828830565918159743L, (long)l10), (boolean)Hc.z, (Object)eM.Ua, (long)8828789072382908065L, (long)l10);
                            if (stringArray2 == null) break block8;
                        }
                        catch (O_ o_3) {
                            throw qi.a(o_3);
                        }
                    }
                    this.s = qi.c("b", (Object)this, (Object)qi.c("K", (int)qi.b("n", (int)31957, (long)(0x1DB488A15F7FA39L ^ l10)), (long)8828830565918159743L, (long)l10), (boolean)Hc.z, (Object)eM.Ua, (long)8828789072382908065L, (long)l10);
                    this.J = qi.c("b", (Object)this, (Object)qi.c("K", (int)qi.b("n", (int)8626, (long)(0x6EFACA60C865A75DL ^ l10)), (long)8828830565918159743L, (long)l10), (boolean)Hc.z, (Object)eM.Ua, (long)8828789072382908065L, (long)l10);
                    this.D = qi.c("b", (Object)this, (Object)qi.c("K", (int)qi.b("n", (int)13515, (long)(0x64C3C4F38F563222L ^ l10)), (long)8828830565918159743L, (long)l10), (boolean)Hc.z, (Object)eM.Ua, (long)8828789072382908065L, (long)l10);
                    this.a = qi.c("b", (Object)this, (Object)qi.c("K", (int)qi.b("n", (int)30602, (long)(0xE41A4A3BC6C716DL ^ l10)), (long)8828830565918159743L, (long)l10), (boolean)Hc.z, (Object)eM.Ua, (long)8828789072382908065L, (long)l10);
                }
                catch (O_ o_4) {
                    throw qi.a(o_4);
                }
            }
            this.y = qi.c("b", (Object)this, (Object)qi.c("K", (int)qi.b("n", (int)12072, (long)(0x2AC0D8833E7CA9C3L ^ l10)), (long)8828830565918159743L, (long)l10), (boolean)Hc.z, (Object)eM.Ua, (long)8828789072382908065L, (long)l10);
        }
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "\fy^";
        objectArray[1] = Integer.TYPE;
        qi.g[1] = "java/lang/Integer";
        objectArray[2] = "qk&qyMzd7>\u0004Uic>w";
        objectArray[3] = "{S\u001c\u0000";
        objectArray[4] = Boolean.TYPE;
        qi.g[4] = "java/lang/Boolean";
        objectArray[5] = "\u000eY\bN\u000fi\u0005V\u0019\u0001bi\u0005K\r";
        objectArray[6] = "o5\u0011\u0017";
        objectArray[7] = "\u0002':$\u00043\t(+ke=\u0002#/1";
        objectArray[8] = "UsmIQo^w~\u001c5YoqqCYr\u00131,CW\u0002Tys\u000e\b{\u001d)uH59\u00101y\u001eMy\nrns\t~\u0003.{\u000bIb\u0002)\u0014";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "\u0010:\u0006\u0002\\9Nl\u0007=\n\"+*\u000f\u0006\u001d)\u0012-SMa`Nf\u0005M\u001d \u0013f\u000b=";
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
                n4 = 11;
                break;
            }
            case 1: {
                n4 = 57;
                break;
            }
            case 2: {
                n4 = 39;
                break;
            }
            case 3: {
                n4 = 41;
                break;
            }
            case 4: {
                n4 = 54;
                break;
            }
            case 5: {
                n4 = 55;
                break;
            }
            case 6: {
                n4 = 34;
                break;
            }
            case 7: {
                n4 = 1;
                break;
            }
            case 8: {
                n4 = 38;
                break;
            }
            case 9: {
                n4 = 14;
                break;
            }
            case 10: {
                n4 = 33;
                break;
            }
            case 11: {
                n4 = 46;
                break;
            }
            case 12: {
                n4 = 27;
                break;
            }
            case 13: {
                n4 = 36;
                break;
            }
            case 14: {
                n4 = 60;
                break;
            }
            case 15: {
                n4 = 7;
                break;
            }
            case 16: {
                n4 = 5;
                break;
            }
            case 17: {
                n4 = 31;
                break;
            }
            case 18: {
                n4 = 22;
                break;
            }
            case 19: {
                n4 = 8;
                break;
            }
            case 20: {
                n4 = 19;
                break;
            }
            case 21: {
                n4 = 42;
                break;
            }
            case 22: {
                n4 = 58;
                break;
            }
            case 23: {
                n4 = 63;
                break;
            }
            case 24: {
                n4 = 49;
                break;
            }
            case 25: {
                n4 = 52;
                break;
            }
            case 26: {
                n4 = 62;
                break;
            }
            case 27: {
                n4 = 51;
                break;
            }
            case 28: {
                n4 = 26;
                break;
            }
            case 29: {
                n4 = 32;
                break;
            }
            case 30: {
                n4 = 3;
                break;
            }
            case 31: {
                n4 = 40;
                break;
            }
            case 32: {
                n4 = 43;
                break;
            }
            case 33: {
                n4 = 21;
                break;
            }
            case 34: {
                n4 = 59;
                break;
            }
            case 35: {
                n4 = 35;
                break;
            }
            case 36: {
                n4 = 25;
                break;
            }
            case 37: {
                n4 = 18;
                break;
            }
            case 38: {
                n4 = 45;
                break;
            }
            case 39: {
                n4 = 2;
                break;
            }
            case 40: {
                n4 = 29;
                break;
            }
            case 41: {
                n4 = 6;
                break;
            }
            case 42: {
                n4 = 23;
                break;
            }
            case 43: {
                n4 = 10;
                break;
            }
            case 44: {
                n4 = 44;
                break;
            }
            case 45: {
                n4 = 56;
                break;
            }
            case 46: {
                n4 = 17;
                break;
            }
            case 47: {
                n4 = 13;
                break;
            }
            case 48: {
                n4 = 47;
                break;
            }
            case 49: {
                n4 = 4;
                break;
            }
            case 50: {
                n4 = 28;
                break;
            }
            case 51: {
                n4 = 37;
                break;
            }
            case 52: {
                n4 = 48;
                break;
            }
            case 53: {
                n4 = 30;
                break;
            }
            case 54: {
                n4 = 0;
                break;
            }
            case 55: {
                n4 = 16;
                break;
            }
            case 56: {
                n4 = 61;
                break;
            }
            case 57: {
                n4 = 20;
                break;
            }
            case 58: {
                n4 = 9;
                break;
            }
            case 59: {
                n4 = 24;
                break;
            }
            case 60: {
                n4 = 53;
                break;
            }
            case 61: {
                n4 = 12;
                break;
            }
            case 62: {
                n4 = 50;
                break;
            }
            default: {
                n4 = 15;
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
        qi.g[n5] = new String(cArray);
        return n5;
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = qi.e(l10, l11);
            object = f[n2];
            try {
                if (!(object instanceof String)) break block2;
                qi.f[n2] = clazz = Class.forName(g[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = qi.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = qi.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public Object x(Object object) {
        return this.y.Z(object);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field g(long l10, long l11) {
        int n2 = qi.e(l10, l11);
        Object object = f[n2];
        if (object instanceof String) {
            String string = g[n2];
            int n3 = string.indexOf(8);
            Class clazz = qi.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = qi.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = qi.c(clazz3, string2, clazz2)) != null) {
                    qi.f[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = qi.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        qi.f[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = qi.f(522561852101983L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = qi.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public Object k(Object object) {
        return this.s.Z(object);
    }

    public Object s(Object object) {
        return this.J.Z(object);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00e7' || c10 == '\u00ca' || c10 == 'z' || c10 == '\u00c3') {
                field = qi.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00e7' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00ca' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'z' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = qi.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'b' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'K' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public Object V(Object object) {
        return this.a.Z(object);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x7C6B;
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
                throw new RuntimeException("a/qi", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            qi.d[n3] = n4;
        }
        return d[n3];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = qi.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public Object B(Object object) {
        return this.D.Z(object);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = qi.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = qi.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(long l10, long l11) {
        int n2 = qi.e(l10, l11);
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
                clazz3 = qi.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = qi.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = qi.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        qi.f[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = qi.f(522561852101983L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = qi.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        qi.f[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = qi.f(522561852101983L, 0L);
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
            return MethodHandles.lookup().findStatic(qi.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(qi.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

