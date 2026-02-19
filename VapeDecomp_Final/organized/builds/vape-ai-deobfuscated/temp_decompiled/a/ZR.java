/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.Iz;
import a.Na;
import a.O_;
import a.QX;
import a.SE;
import a.V4;
import a.Xu;
import a.cB;
import a.cY;
import a.d8;
import a.kX;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

public class zr {
    private final List<cB> L;
    private static final Object[] e;
    private static final long a;
    private static final long[] b;
    private static final String[] f;
    static final /* synthetic */ boolean r;
    private static final Integer[] c;
    public static boolean y;
    private static final Map d;
    private final List<cB> Z = new ArrayList<cB>();

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = zr.a(l10, l11);
            object = e[n2];
            try {
                if (!(object instanceof String)) break block2;
                zr.e[n2] = clazz = Class.forName(f[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (f[n5] != null) {
            return n5;
        }
        Object object = e[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 37;
                break;
            }
            case 1: {
                n4 = 12;
                break;
            }
            case 2: {
                n4 = 11;
                break;
            }
            case 3: {
                n4 = 18;
                break;
            }
            case 4: {
                n4 = 36;
                break;
            }
            case 5: {
                n4 = 22;
                break;
            }
            case 6: {
                n4 = 3;
                break;
            }
            case 7: {
                n4 = 4;
                break;
            }
            case 8: {
                n4 = 53;
                break;
            }
            case 9: {
                n4 = 8;
                break;
            }
            case 10: {
                n4 = 61;
                break;
            }
            case 11: {
                n4 = 45;
                break;
            }
            case 12: {
                n4 = 33;
                break;
            }
            case 13: {
                n4 = 15;
                break;
            }
            case 14: {
                n4 = 24;
                break;
            }
            case 15: {
                n4 = 47;
                break;
            }
            case 16: {
                n4 = 59;
                break;
            }
            case 17: {
                n4 = 56;
                break;
            }
            case 18: {
                n4 = 49;
                break;
            }
            case 19: {
                n4 = 42;
                break;
            }
            case 20: {
                n4 = 43;
                break;
            }
            case 21: {
                n4 = 7;
                break;
            }
            case 22: {
                n4 = 46;
                break;
            }
            case 23: {
                n4 = 48;
                break;
            }
            case 24: {
                n4 = 52;
                break;
            }
            case 25: {
                n4 = 26;
                break;
            }
            case 26: {
                n4 = 30;
                break;
            }
            case 27: {
                n4 = 58;
                break;
            }
            case 28: {
                n4 = 29;
                break;
            }
            case 29: {
                n4 = 9;
                break;
            }
            case 30: {
                n4 = 44;
                break;
            }
            case 31: {
                n4 = 62;
                break;
            }
            case 32: {
                n4 = 5;
                break;
            }
            case 33: {
                n4 = 55;
                break;
            }
            case 34: {
                n4 = 63;
                break;
            }
            case 35: {
                n4 = 60;
                break;
            }
            case 36: {
                n4 = 54;
                break;
            }
            case 37: {
                n4 = 0;
                break;
            }
            case 38: {
                n4 = 32;
                break;
            }
            case 39: {
                n4 = 13;
                break;
            }
            case 40: {
                n4 = 50;
                break;
            }
            case 41: {
                n4 = 41;
                break;
            }
            case 42: {
                n4 = 21;
                break;
            }
            case 43: {
                n4 = 35;
                break;
            }
            case 44: {
                n4 = 6;
                break;
            }
            case 45: {
                n4 = 17;
                break;
            }
            case 46: {
                n4 = 10;
                break;
            }
            case 47: {
                n4 = 38;
                break;
            }
            case 48: {
                n4 = 19;
                break;
            }
            case 49: {
                n4 = 31;
                break;
            }
            case 50: {
                n4 = 1;
                break;
            }
            case 51: {
                n4 = 39;
                break;
            }
            case 52: {
                n4 = 2;
                break;
            }
            case 53: {
                n4 = 14;
                break;
            }
            case 54: {
                n4 = 20;
                break;
            }
            case 55: {
                n4 = 51;
                break;
            }
            case 56: {
                n4 = 57;
                break;
            }
            case 57: {
                n4 = 34;
                break;
            }
            case 58: {
                n4 = 25;
                break;
            }
            case 59: {
                n4 = 16;
                break;
            }
            case 60: {
                n4 = 28;
                break;
            }
            case 61: {
                n4 = 27;
                break;
            }
            case 62: {
                n4 = 40;
                break;
            }
            default: {
                n4 = 23;
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
        zr.f[n5] = new String(cArray);
        return n5;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = zr.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
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

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = zr.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = zr.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Nullable
    public cB G(String string) {
        for (cB cB2 : this.Z) {
            try {
                if (!cB2.Z().equals(string)) continue;
                return cB2;
            }
            catch (O_ o_2) {
                throw zr.a(o_2);
            }
        }
        return null;
    }

    @Nullable
    public cB M(int n2) {
        for (cB cB2 : this.L) {
            block11: {
                try {
                    try {
                        if (r || cB2.Y() != null) break block11;
                    }
                    catch (O_ o_2) {
                        throw zr.a(o_2);
                    }
                    throw new AssertionError();
                }
                catch (O_ o_3) {
                    throw zr.a(o_3);
                }
            }
            try {
                block12: {
                    try {
                        try {
                            if (cB2.Y() != n2) continue;
                            if (cB2.i() == null) break block12;
                        }
                        catch (O_ o_4) {
                            throw zr.a(o_4);
                        }
                        if (cB2.i() != 0) continue;
                    }
                    catch (O_ o_5) {
                        throw zr.a(o_5);
                    }
                }
                return cB2;
            }
            catch (O_ o_6) {
                throw zr.a(o_6);
            }
        }
        return null;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = zr.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public zr() {
        this.L = new ArrayList<cB>();
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "e\u0016D";
        objectArray[1] = Integer.TYPE;
        zr.f[1] = "java/lang/Integer";
        objectArray[2] = "[@t\u001a#rPOeU^jCHl\u001c";
        objectArray[3] = "[;\u007f\u000b";
        objectArray[4] = "o}";
        objectArray[5] = "4_<eqx?P-*\u0010v4[)p";
        objectArray[6] = "\u0001~;8~,G&%'\u0014\r;$=&):P~?\"nS\u0000r)$s7\u0000,y?\u0014";
        Object[] objectArray2 = objectArray;
        objectArray[7] = "`o<3\u0007\u0010niyZ\u0003\u0010\u0002h=8\u0018\u0011nkc;\u0015k;)gg\u0001\u0000a+c h";
    }

    private static Method d(long l10, long l11) {
        int n2 = zr.a(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n2];
                int n4 = string2.indexOf(8);
                clazz3 = zr.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = zr.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = zr.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        zr.e[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = zr.b(413788671837632L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = zr.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        zr.e[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = zr.b(413788671837632L, 0L);
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
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x3781;
        if (c[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = b[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/zr", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            zr.c[n3] = n4;
        }
        return c[n3];
    }

    public void e() {
        String[] stringArray;
        long l10 = a ^ 0x7DE224E8F45EL;
        CallSite callSite = zr.b("\u00f5", (Object)zr.b("\u00f5", (int)zr.a("e", (int)30261, (long)(0x68D6921C98215626L ^ l10)), (long)-7525342247077844115L, (long)l10), (long)-7525283099840072427L, (long)l10);
        for (String string : stringArray = new String((byte[])callSite).split((String)((Object)zr.b("\u00f5", (int)zr.a("e", (int)6308, (long)(0x16A92CD856AB38B4L ^ l10)), (long)-7525342247077844115L, (long)l10)))) {
            cB cB2;
            block6: {
                String string2 = string.trim();
                cB2 = cB.H(string2);
                try {
                    if (cB2.c() == null || !Xu.l(cB2.c())) break block6;
                }
                catch (O_ o_2) {
                    throw zr.a(o_2);
                }
                for (Iz iz2 : Iz.values()) {
                    if (!iz2.e(cB2.Z())) continue;
                    cB2 = new cY(cB2, iz2);
                }
            }
            try {
                this.Z.add(cB2);
                if (cB2.r() == null) continue;
                this.L.add(cB2);
            }
            catch (O_ o_3) {
                throw zr.a(o_3);
            }
        }
    }

    @Nullable
    public cB V(V4 v42) {
        long l10 = a ^ 0x2CE44A4D3344L;
        try {
            if (v42.Y()) {
                return null;
            }
        }
        catch (O_ o_2) {
            throw zr.a(o_2);
        }
        QX qX2 = v42.C();
        try {
            if (qX2.Y()) {
                return null;
            }
        }
        catch (O_ o_3) {
            throw zr.a(o_3);
        }
        if (kX.C() >= 35) {
            String string;
            String string2 = qX2.M().toString();
            try {
                string = Na.MC_1_21_0.H() ? string2 : (String)((Object)zr.b("\u00f5", (int)zr.a("e", (int)29478, (long)(0x3225410655E942DL ^ l10)), (long)5803675501374123127L, (long)l10)) + string2;
            }
            catch (O_ o_4) {
                throw zr.a(o_4);
            }
            String string3 = string;
            return this.G(string3);
        }
        int n2 = qX2.O();
        int n3 = v42.b();
        if (!qX2.G()) {
            n3 = 0;
        }
        cB cB2 = this.s(n2, n3);
        try {
            if (cB2 != null) {
                return cB2;
            }
        }
        catch (O_ o_5) {
            throw zr.a(o_5);
        }
        try {
            if (v42.b() != 0) {
                return null;
            }
        }
        catch (O_ o_6) {
            throw zr.a(o_6);
        }
        return this.M(n2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                zr.a = d8.a(6013060544063652986L, -6081127258226469118L, MethodHandles.lookup().lookupClass()).a(4602786829658L);
                zr.e = new Object[8];
                zr.f = new String[8];
                zr.a();
                zr.d = new HashMap<K, V>(13);
                var0 = zr.a ^ 35246054755069L;
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
                var6_5 = "\u00d5\u001b.s\u00c59n\u0007<\u00fb\f\u00e4.\u0004\u001fp\u0085\u00dfQ\u00a59Nq\u00b2";
                var7_6 = "\u00d5\u001b.s\u00c59n\u0007<\u00fb\f\u00e4.\u0004\u001fp\u0085\u00dfQ\u00a59Nq\u00b2".length();
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
                    var6_5 = "\u009c\u000e\u0019\u00cf2p\"\u00b8\u007fE\u00ef7\u00f9\u001a\u00ca4";
                    var7_6 = "\u009c\u000e\u0019\u00cf2p\"\u00b8\u007fE\u00ef7\u00f9\u001a\u00ca4".length();
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
        zr.b = var8_3;
        zr.c = new Integer[5];
        try {
            v8 = zr.class.desiredAssertionStatus() == false;
        }
        catch (O_ v9) {
            throw zr.a(v9);
        }
        zr.r = v8;
        zr.y = true;
    }

    @Nullable
    public cB s(int n2, int n3) {
        for (cB cB2 : this.L) {
            block11: {
                try {
                    try {
                        if (r || cB2.Y() != null) break block11;
                    }
                    catch (O_ o_2) {
                        throw zr.a(o_2);
                    }
                    throw new AssertionError();
                }
                catch (O_ o_3) {
                    throw zr.a(o_3);
                }
            }
            try {
                try {
                    try {
                        if (cB2.Y() != n2 || cB2.i() == null) continue;
                    }
                    catch (O_ o_4) {
                        throw zr.a(o_4);
                    }
                    if (cB2.i() != n3) continue;
                }
                catch (O_ o_5) {
                    throw zr.a(o_5);
                }
                return cB2;
            }
            catch (O_ o_6) {
                throw zr.a(o_6);
            }
        }
        return null;
    }

    public void q() {
        long l10 = a ^ 0xCAB0DF11B31L;
        ArrayList<V4> arrayList = new ArrayList<V4>();
        for (V4 v42 : Xu.K()) {
            cB cB2 = this.V(v42);
            try {
                if (cB2 != null) {
                    continue;
                }
            }
            catch (O_ o_2) {
                throw zr.a(o_2);
            }
            arrayList.add(v42);
        }
        try {
            if (!y) {
                return;
            }
        }
        catch (O_ o_3) {
            throw zr.a(o_3);
        }
        try {
            if (arrayList.isEmpty()) {
                return;
            }
        }
        catch (O_ o_4) {
            throw zr.a(o_4);
        }
        SE.x((String)((Object)zr.b("\u00f5", (int)zr.a("e", (int)10591, (long)(0x7811B05E405AE624L ^ l10)), (long)8718947239683589122L, (long)l10)) + arrayList.size() + (String)((Object)zr.b("\u00f5", (int)zr.a("e", (int)8376, (long)(0x5E9EDEF5FC64EFC5L ^ l10)), (long)8718947239683589122L, (long)l10)));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = zr.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = zr.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'b' || c10 == '\u00d6' || c10 == '\u00c5' || c10 == '\u00b5') {
                field = zr.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'b' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00d6' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00c5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = zr.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00e7' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00f5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field c(long l10, long l11) {
        int n2 = zr.a(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            String string = f[n2];
            int n3 = string.indexOf(8);
            Class clazz = zr.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = zr.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = zr.a(clazz3, string2, clazz2)) != null) {
                    zr.e[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = zr.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        zr.e[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = zr.b(413788671837632L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/zr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/zr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(zr.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(zr.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

