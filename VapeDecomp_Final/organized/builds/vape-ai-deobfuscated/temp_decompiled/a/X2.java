/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.AM;
import a.EP;
import a.J;
import a.KB;
import a.Kq;
import a.OY;
import a.O_;
import a.QF;
import a.Qg;
import a.Qt;
import a.VG;
import a.Vt;
import a.XO;
import a.d8;
import a.eM;
import a.jd;
import a.jr;
import a.pP;
import a.pa;
import a.pe;
import a.px;
import a.x4;
import a.xi;
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

public class x2
extends x4<AM> {
    private static final Map n;
    private boolean d;
    private static final Integer[] l;
    private long R;
    private int h;
    private boolean B;
    private final jr m;
    private static final long e;
    private static final long[] j;
    private final jd Y;
    private static final String[] r;
    private final jr G;
    private static final Object[] o;

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = x2.a(l10, l11);
            object = o[n2];
            try {
                if (!(object instanceof String)) break block2;
                x2.o[n2] = clazz = Class.forName(r[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(long l10, long l11) {
        int n2 = x2.a(l10, l11);
        Object object = o[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = r[n2];
                int n4 = string2.indexOf(8);
                clazz3 = x2.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = x2.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = x2.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        x2.o[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = x2.b(833054414390733L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = x2.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        x2.o[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = x2.b(833054414390733L, 0L);
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
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x6BB3;
        if (l[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = j[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])n.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    n.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/x2", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            x2.l[n3] = n4;
        }
        return l[n3];
    }

    private static Field c(long l10, long l11) {
        int n2 = x2.a(l10, l11);
        Object object = o[n2];
        if (object instanceof String) {
            String string = r[n2];
            int n3 = string.indexOf(8);
            Class clazz = x2.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = x2.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = x2.a(clazz3, string2, clazz2)) != null) {
                    x2.o[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = x2.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        x2.o[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = x2.b(833054414390733L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (r[n5] != null) {
            return n5;
        }
        Object object = o[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 1;
                break;
            }
            case 1: {
                n4 = 13;
                break;
            }
            case 2: {
                n4 = 32;
                break;
            }
            case 3: {
                n4 = 54;
                break;
            }
            case 4: {
                n4 = 23;
                break;
            }
            case 5: {
                n4 = 24;
                break;
            }
            case 6: {
                n4 = 5;
                break;
            }
            case 7: {
                n4 = 3;
                break;
            }
            case 8: {
                n4 = 42;
                break;
            }
            case 9: {
                n4 = 40;
                break;
            }
            case 10: {
                n4 = 18;
                break;
            }
            case 11: {
                n4 = 22;
                break;
            }
            case 12: {
                n4 = 15;
                break;
            }
            case 13: {
                n4 = 2;
                break;
            }
            case 14: {
                n4 = 57;
                break;
            }
            case 15: {
                n4 = 39;
                break;
            }
            case 16: {
                n4 = 31;
                break;
            }
            case 17: {
                n4 = 50;
                break;
            }
            case 18: {
                n4 = 17;
                break;
            }
            case 19: {
                n4 = 38;
                break;
            }
            case 20: {
                n4 = 41;
                break;
            }
            case 21: {
                n4 = 48;
                break;
            }
            case 22: {
                n4 = 34;
                break;
            }
            case 23: {
                n4 = 61;
                break;
            }
            case 24: {
                n4 = 19;
                break;
            }
            case 25: {
                n4 = 0;
                break;
            }
            case 26: {
                n4 = 35;
                break;
            }
            case 27: {
                n4 = 56;
                break;
            }
            case 28: {
                n4 = 46;
                break;
            }
            case 29: {
                n4 = 6;
                break;
            }
            case 30: {
                n4 = 10;
                break;
            }
            case 31: {
                n4 = 28;
                break;
            }
            case 32: {
                n4 = 60;
                break;
            }
            case 33: {
                n4 = 58;
                break;
            }
            case 34: {
                n4 = 30;
                break;
            }
            case 35: {
                n4 = 59;
                break;
            }
            case 36: {
                n4 = 62;
                break;
            }
            case 37: {
                n4 = 9;
                break;
            }
            case 38: {
                n4 = 11;
                break;
            }
            case 39: {
                n4 = 8;
                break;
            }
            case 40: {
                n4 = 55;
                break;
            }
            case 41: {
                n4 = 49;
                break;
            }
            case 42: {
                n4 = 25;
                break;
            }
            case 43: {
                n4 = 16;
                break;
            }
            case 44: {
                n4 = 26;
                break;
            }
            case 45: {
                n4 = 53;
                break;
            }
            case 46: {
                n4 = 52;
                break;
            }
            case 47: {
                n4 = 20;
                break;
            }
            case 48: {
                n4 = 36;
                break;
            }
            case 49: {
                n4 = 12;
                break;
            }
            case 50: {
                n4 = 27;
                break;
            }
            case 51: {
                n4 = 29;
                break;
            }
            case 52: {
                n4 = 63;
                break;
            }
            case 53: {
                n4 = 33;
                break;
            }
            case 54: {
                n4 = 43;
                break;
            }
            case 55: {
                n4 = 4;
                break;
            }
            case 56: {
                n4 = 14;
                break;
            }
            case 57: {
                n4 = 45;
                break;
            }
            case 58: {
                n4 = 51;
                break;
            }
            case 59: {
                n4 = 21;
                break;
            }
            case 60: {
                n4 = 47;
                break;
            }
            case 61: {
                n4 = 44;
                break;
            }
            case 62: {
                n4 = 37;
                break;
            }
            default: {
                n4 = 7;
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
        x2.r[n5] = new String(cArray);
        return n5;
    }

    private static void d() {
        Object[] objectArray = o;
        o[0] = "8,\u0019";
        objectArray[1] = Integer.TYPE;
        x2.r[1] = "java/lang/Integer";
        objectArray[2] = "ig;\u0002=\"bh*M@:qo#\u0004";
        objectArray[3] = "\u007f&\u0010l";
        objectArray[4] = "T`\"Q";
        objectArray[5] = Boolean.TYPE;
        x2.r[5] = "java/lang/Boolean";
        objectArray[6] = "\u0002Mzd";
        objectArray[7] = "l\u0018@M";
        objectArray[8] = Void.TYPE;
        x2.r[8] = "java/lang/Void";
        objectArray[9] = "l{N";
        objectArray[10] = Long.TYPE;
        x2.r[10] = "java/lang/Long";
        objectArray[11] = "c<a~qMh3p1\u0010Cc8tk";
        objectArray[12] = "\u0017KM\u0016i~\u0015U\tVQO-\u0017\u001fA1m\u0014\u0017\u001e\u00163\u0013\u0016^\u0014F1tQ\u0014\u0011\u001aQ";
        objectArray[13] = "/2\u0007E'xs \u0010OWA\u0013oH_0h|(\u0007Fg\u0004.6\u001fN&mbkHMW";
        objectArray[14] = "\u0016\u0010\u001bE`FO\u0011\u0006H\\k(C\u000fV0\u0015P\u0001_Ha(";
        Object[] objectArray2 = objectArray;
        objectArray[15] = "R\u001c!fT\u0019SCw\u000f__9Dv4\nYW\u001a~4Q$\u0000\u0012q6\u000fY\\C>34";
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                x2.e = d8.a(5677874480750057495L, 7655225050405918144L, MethodHandles.lookup().lookupClass()).a(226671248314359L);
                x2.o = new Object[16];
                x2.r = new String[16];
                x2.d();
                x2.n = new HashMap<K, V>(13);
                var0 = x2.e ^ 10854478016692L;
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
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "\u00a7w\u00ef\u00b5\u00c1\u00bd\u00e7\u0004\u00c9\u00fblu\u00cdV\u00ec\u0001\u00cb\u0090\u00fd\u00b08\u00aa\u00d6\u0082";
                var7_6 = "\u00a7w\u00ef\u00b5\u00c1\u00bd\u00e7\u0004\u00c9\u00fblu\u00cdV\u00ec\u0001\u00cb\u0090\u00fd\u00b08\u00aa\u00d6\u0082".length();
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
                    var6_5 = "\b\t\u00b1@\u0012N\u00f6\u00ed\u001f\u0096\u00b2\u00b1\u0019\u00e6\u009f\u00ee";
                    var7_6 = "\b\t\u00b1@\u0012N\u00f6\u00ed\u001f\u0096\u00b2\u00b1\u0019\u00e6\u009f\u00ee".length();
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
        x2.j = var8_3;
        x2.l = new Integer[5];
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/x2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @OY
    public void Y(Kq var1_1) {
        block52: {
            block51: {
                block45: {
                    block50: {
                        block48: {
                            block49: {
                                block46: {
                                    block47: {
                                        block44: {
                                            block42: {
                                                block43: {
                                                    var2_2 = x2.e ^ 74526045611226L;
                                                    var4_3 = Qg.A();
                                                    try {
                                                        v0 = ((AM)this.n()).i();
                                                        if (var4_3 != null) break block42;
                                                        if (v0) break block43;
                                                    }
                                                    catch (O_ v1) {
                                                        throw x2.a(v1);
                                                    }
                                                    return;
                                                }
                                                v0 = false;
                                            }
                                            var5_4 = v0;
                                            try {
                                                try {
                                                    v2 = this.h--;
                                                    if (var4_3 != null) break block44;
                                                    if (v2 <= 0) break block45;
                                                }
                                                catch (O_ v3) {
                                                    throw x2.a(v3);
                                                }
                                                v2 = (int)var1_1.getThePlayer().j();
                                            }
                                            catch (O_ v4) {
                                                throw x2.a(v4);
                                            }
                                        }
                                        try {
                                            try {
                                                if (var4_3 != null) break block46;
                                                if (v2 == 0) break block47;
                                            }
                                            catch (O_ v5) {
                                                throw x2.a(v5);
                                            }
                                            this.h = 0;
                                        }
                                        catch (O_ v6) {
                                            throw x2.a(v6);
                                        }
                                    }
                                    v2 = (int)this.a();
                                }
                                try {
                                    if (var4_3 != null) break block48;
                                    if (v2 == 0) break block49;
                                }
                                catch (O_ v7) {
                                    throw x2.a(v7);
                                }
                                return;
                            }
                            cfr_temp_0 = var1_1.getThePlayer().x() - 0.0;
                            v2 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                        }
                        try {
                            if (var4_3 != null) break block50;
                            if (v2 > 0) {
                            }
                            ** GOTO lbl63
                        }
                        catch (O_ v8) {
                            throw x2.a(v8);
                        }
                        var5_4 = true;
                        try {
                            if (var4_3 == null) break block45;
lbl63:
                            // 2 sources

                            v2 = (int)var1_1.getThePlayer().j();
                        }
                        catch (O_ v9) {
                            throw x2.a(v9);
                        }
                    }
                    if (v2 == 0) {
                        return;
                    }
                }
                var6_5 = XO.b.B();
                try {
                    try {
                        v10 = var6_5.r();
                        if (var4_3 != null) break block51;
                        if (!v10) break block52;
                    }
                    catch (O_ v11) {
                        throw x2.a(v11);
                    }
                    v10 = var6_5.l().B(eM.Ut);
                }
                catch (O_ v12) {
                    throw x2.a(v12);
                }
            }
            if (v10) {
                block58: {
                    block59: {
                        block53: {
                            block54: {
                                var7_6 = new Qt(var6_5.l());
                                try {
                                    v13 /* !! */  = x2.c("\u00c1", (Object)this, (Object)var7_6, (long)-5080547798650781361L, (long)var2_2);
                                    if (var4_3 != null) break block53;
                                    if (v13 /* !! */  != false) break block54;
                                }
                                catch (O_ v14) {
                                    throw x2.a(v14);
                                }
                                return;
                            }
                            v13 /* !! */  = (CallSite)var5_4;
                        }
                        if (v13 /* !! */  == false) {
                            block55: {
                                block57: {
                                    block56: {
                                        var8_7 = J.H;
                                        var9_8 = var8_7.C();
                                        var10_9 = var8_7.C() + 1;
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v15 = var7_6.b();
                                                        v16 = var9_8;
                                                        if (var4_3 != null) break block55;
                                                        if (v15 > v16) break block56;
                                                    }
                                                    catch (O_ v17) {
                                                        throw x2.a(v17);
                                                    }
                                                    cfr_temp_1 = System.currentTimeMillis() - this.R - x2.c("f", (Object)var8_7, (long)-5080398970704439594L, (long)var2_2) * 2L;
                                                    v15 = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                                                    if (var4_3 != null) break block57;
                                                }
                                                catch (O_ v18) {
                                                    throw x2.a(v18);
                                                }
                                                if (v15 < 0) break block56;
                                            }
                                            catch (O_ v19) {
                                                throw x2.a(v19);
                                            }
                                            this.d = true;
                                            return;
                                        }
                                        catch (O_ v20) {
                                            throw x2.a(v20);
                                        }
                                    }
                                    try {
                                        v21 = var7_6;
                                        if (var4_3 != null) break block58;
                                        v15 = v21.b();
                                    }
                                    catch (O_ v22) {
                                        throw x2.a(v22);
                                    }
                                }
                                v16 = var9_8;
                            }
                            try {
                                try {
                                    try {
                                        if (v15 <= v16) break block59;
                                        v21 = var7_6;
                                        if (var4_3 != null) break block58;
                                    }
                                    catch (O_ v23) {
                                        throw x2.a(v23);
                                    }
                                    if (v21.b() > var10_9) break block59;
                                }
                                catch (O_ v24) {
                                    throw x2.a(v24);
                                }
                                return;
                            }
                            catch (O_ v25) {
                                throw x2.a(v25);
                            }
                        }
                    }
                    var1_1.setCanceled(true);
                    this.B = true;
                    v21 = var7_6;
                }
                x2.c("\u00f5", (Object)v21, (long)-5080587748751373329L, (long)var2_2);
            }
        }
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'l' || c10 == 'q' || c10 == 'z' || c10 == 'm') {
                field = x2.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'l' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'q' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'z' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = x2.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'f' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00f5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private boolean T(QF qF2) {
        boolean bl2;
        block21: {
            block16: {
                double d2;
                double d3;
                block19: {
                    block20: {
                        String[] stringArray;
                        block17: {
                            block18: {
                                double d4;
                                double d5;
                                double d6;
                                block14: {
                                    block15: {
                                        block12: {
                                            block13: {
                                                long l10 = e ^ 0xFFCE62333DDL;
                                                double d7 = qF2.F() - EP.U().F();
                                                d6 = qF2.B() - EP.U().B();
                                                stringArray = Qg.A();
                                                try {
                                                    double d9 = d7 - 0.0;
                                                    d5 = d9 == 0.0 ? 0 : (d9 < 0.0 ? -1 : 1);
                                                    if (stringArray != null) break block12;
                                                    if (d5 >= 0) break block13;
                                                }
                                                catch (O_ o_2) {
                                                    throw x2.a(o_2);
                                                }
                                                d5 = 1.0;
                                                break block12;
                                            }
                                            d5 = 0.0;
                                        }
                                        try {
                                            double d10 = EP.U().G() - 0.0;
                                            d4 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                                            if (stringArray != null) break block14;
                                            if (d4 >= 0) break block15;
                                        }
                                        catch (O_ o_3) {
                                            throw x2.a(o_3);
                                        }
                                        d4 = 1.0;
                                        break block14;
                                    }
                                    d4 = 0.0;
                                }
                                try {
                                    try {
                                        if (d5 != d4) break block16;
                                        double d11 = d6 - 0.0;
                                        d3 = d11 == 0.0 ? 0 : (d11 < 0.0 ? -1 : 1);
                                        if (stringArray != null) break block17;
                                    }
                                    catch (O_ o_4) {
                                        throw x2.a(o_4);
                                    }
                                    if (d3 >= 0) break block18;
                                }
                                catch (O_ o_5) {
                                    throw x2.a(o_5);
                                }
                                d3 = 1.0;
                                break block17;
                            }
                            d3 = 0.0;
                        }
                        try {
                            double d12 = EP.U().o() - 0.0;
                            d2 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
                            if (stringArray != null) break block19;
                            if (d2 >= 0) break block20;
                        }
                        catch (O_ o_6) {
                            throw x2.a(o_6);
                        }
                        d2 = 1.0;
                        break block19;
                    }
                    d2 = 0.0;
                }
                try {
                    if (d3 != d2) break block16;
                    bl2 = true;
                    break block21;
                }
                catch (O_ o_7) {
                    throw x2.a(o_7);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = x2.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = x2.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private boolean a() {
        boolean bl2;
        try {
            bl2 = this.Y.J() == this.G;
        }
        catch (O_ o_2) {
            throw x2.a(o_2);
        }
        return bl2;
    }

    @OY
    public void g(pP pP2) {
        try {
            if (this.B) {
                pP2.setCanceled(true);
            }
        }
        catch (O_ o_2) {
            throw x2.a(o_2);
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/x2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @OY
    public void x(pa pa2) {
        VG vG2;
        long l10 = e ^ 0x342C160652D5L;
        try {
            if (pa2.getPacketInstance() == null) {
                return;
            }
        }
        catch (O_ o_2) {
            throw x2.a(o_2);
        }
        try {
            if (EP.U().Y()) {
                return;
            }
        }
        catch (O_ o_3) {
            throw x2.a(o_3);
        }
        Vt vt2 = pa2.getPacket();
        boolean bl2 = false;
        if (vt2.B(eM.Ub)) {
            bl2 = true;
        } else if (vt2.B(eM.bh) && (vG2 = new VG(vt2)).h() == EP.U().X()) {
            bl2 = true;
        }
        try {
            if (bl2) {
                this.h = (int)x2.a("v", (int)32647, (long)(0xCD04B9CBF1C5B42L ^ l10));
            }
        }
        catch (O_ o_4) {
            throw x2.a(o_4);
        }
    }

    @OY
    public void y(px px2) {
        try {
            if (this.B) {
                px2.setCanceled(true);
            }
        }
        catch (O_ o_2) {
            throw x2.a(o_2);
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

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = x2.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    @OY
    public void J(pe pe2) {
        try {
            if (this.B) {
                pe2.setCanceled(true);
            }
        }
        catch (O_ o_2) {
            throw x2.a(o_2);
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = x2.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = x2.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = x2.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @OY
    public void B(KB kB2) {
        try {
            if (this.d) {
                this.R = System.currentTimeMillis();
                this.d = false;
            }
        }
        catch (O_ o_2) {
            throw x2.a(o_2);
        }
        this.B = false;
    }

    public x2(xi xi2, String string) {
        long l10 = e ^ 0x59D6788EE389L;
        super(xi2, string);
        this.B = true;
        this.h = 0;
        this.G = new jr((String)((Object)x2.c("\u00f5", (int)x2.a("v", (int)19325, (long)(0x50300561EFD05EE1L ^ l10)), (long)-131302429402180119L, (long)l10)));
        this.m = new jr((String)((Object)x2.c("\u00f5", (int)x2.a("v", (int)7081, (long)(0x7243455D31ED0E37L ^ l10)), (long)-131302429402180119L, (long)l10)));
        this.Y = jd.D(this, (String)((Object)x2.c("\u00f5", (int)x2.a("v", (int)14804, (long)(0x76549A62532AAC49L ^ l10)), (long)-131302429402180119L, (long)l10)), this.G, this.G, this.m);
        this.Y.R((String)((Object)x2.c("\u00f5", (int)x2.a("v", (int)742, (long)(0x72B329879FEE9779L ^ l10)), (long)-131302429402180119L, (long)l10)));
        this.N(this.Y);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(x2.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(x2.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

