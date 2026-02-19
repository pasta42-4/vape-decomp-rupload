/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package a;

import a.EP;
import a.FI;
import a.Na;
import a.O_;
import a.Qg;
import a.V4;
import a.cl;
import a.d8;
import a.oP;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
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
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class cp
extends cl<FI, cp> {
    private static final String[] n;
    private final int e;
    public static final Color g;
    private boolean s = false;
    private static final Object[] m;
    public static final Color U;
    private static final Integer[] h;
    public static final Color H;
    private static final Map k;
    private static final long[] d;
    private static final long a;
    private final Color D;

    public FI H(FI fI2) {
        try {
            ((List)this.J()).add(fI2);
            if (this.e == -1) {
                fI2.e(-1);
            }
        }
        catch (O_ o_2) {
            throw cp.a(o_2);
        }
        return fI2;
    }

    public boolean d(V4 v42) {
        try {
            if (((List)this.J()).isEmpty()) {
                return true;
            }
        }
        catch (O_ o_2) {
            throw cp.a(o_2);
        }
        for (FI fI2 : (List)this.J()) {
            try {
                if (!fI2.r(v42)) continue;
                return true;
            }
            catch (O_ o_3) {
                throw cp.a(o_3);
            }
        }
        return false;
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x34B2;
        if (h[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = d[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])k.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/cp", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            cp.h[n3] = n4;
        }
        return h[n3];
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                cp.a = d8.a(-8631173163933855319L, -7794562878545228562L, MethodHandles.lookup().lookupClass()).a(5640848118251L);
                cp.m = new Object[5];
                cp.n = new String[5];
                cp.a();
                cp.k = new HashMap<K, V>(13);
                var0 = cp.a ^ 22732535188450L;
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
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "i\u008e\u00be\u00c6<U{.N\u0080~\t\u00b6\u00cc\u00a0P";
                var7_6 = "i\u008e\u00be\u00c6<U{.N\u0080~\t\u00b6\u00cc\u00a0P".length();
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
                    var6_5 = "\u00fc\u00c2h\u00c2Qy\u00b6\u00ebQ\u00ff\u00f4\n\u00b1TDA";
                    var7_6 = "\u00fc\u00c2h\u00c2Qy\u00b6\u00ebQ\u00ff\u00f4\n\u00b1TDA".length();
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
        cp.d = var8_3;
        cp.h = new Integer[4];
        cp.U = new Color(0, 170, 0);
        cp.H = new Color(170, 170, 170);
        cp.g = new Color(170, 0, 0);
    }

    @Override
    public FI J(String string, int n2) {
        return this.H(new FI(string, n2));
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = cp.e(l10, l11);
            object = m[n2];
            try {
                if (!(object instanceof String)) break block2;
                cp.m[n2] = clazz = Class.forName(n[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = cp.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = cp.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static cp r(Object object, String string, String string2, Color color, FI ... fIArray) {
        return cp.g(object, string, string2, color, -1, Arrays.asList(fIArray));
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = cp.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = cp.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public void R(List<FI> list) {
        super.d(list);
    }

    private static Method h(long l10, long l11) {
        int n2 = cp.e(l10, l11);
        Object object = m[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = n[n2];
                int n4 = string2.indexOf(8);
                clazz3 = cp.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = cp.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cp.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        cp.m[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cp.f(241817946069306L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = cp.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        cp.m[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cp.f(241817946069306L, 0L);
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

    @Override
    public void i(String string) {
    }

    public boolean b(V4 v42, boolean bl2) {
        block12: {
            block11: {
                try {
                    try {
                        if (!bl2 || !((List)this.J()).isEmpty()) break block11;
                    }
                    catch (O_ o_2) {
                        throw cp.a(o_2);
                    }
                    return false;
                }
                catch (O_ o_3) {
                    throw cp.a(o_3);
                }
            }
            try {
                try {
                    if (bl2 || !((List)this.J()).isEmpty()) break block12;
                }
                catch (O_ o_4) {
                    throw cp.a(o_4);
                }
                return true;
            }
            catch (O_ o_5) {
                throw cp.a(o_5);
            }
        }
        for (FI fI2 : (List)this.J()) {
            try {
                if (!fI2.r(v42)) continue;
                return true;
            }
            catch (O_ o_6) {
                throw cp.a(o_6);
            }
        }
        return false;
    }

    @Override
    public void W() {
        super.H(new ArrayList((Collection)this.u()));
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (n[n5] != null) {
            return n5;
        }
        Object object = m[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 41;
                break;
            }
            case 1: {
                n4 = 17;
                break;
            }
            case 2: {
                n4 = 60;
                break;
            }
            case 3: {
                n4 = 39;
                break;
            }
            case 4: {
                n4 = 55;
                break;
            }
            case 5: {
                n4 = 22;
                break;
            }
            case 6: {
                n4 = 18;
                break;
            }
            case 7: {
                n4 = 31;
                break;
            }
            case 8: {
                n4 = 14;
                break;
            }
            case 9: {
                n4 = 0;
                break;
            }
            case 10: {
                n4 = 9;
                break;
            }
            case 11: {
                n4 = 5;
                break;
            }
            case 12: {
                n4 = 48;
                break;
            }
            case 13: {
                n4 = 34;
                break;
            }
            case 14: {
                n4 = 35;
                break;
            }
            case 15: {
                n4 = 36;
                break;
            }
            case 16: {
                n4 = 51;
                break;
            }
            case 17: {
                n4 = 42;
                break;
            }
            case 18: {
                n4 = 47;
                break;
            }
            case 19: {
                n4 = 50;
                break;
            }
            case 20: {
                n4 = 44;
                break;
            }
            case 21: {
                n4 = 43;
                break;
            }
            case 22: {
                n4 = 21;
                break;
            }
            case 23: {
                n4 = 59;
                break;
            }
            case 24: {
                n4 = 3;
                break;
            }
            case 25: {
                n4 = 46;
                break;
            }
            case 26: {
                n4 = 8;
                break;
            }
            case 27: {
                n4 = 11;
                break;
            }
            case 28: {
                n4 = 56;
                break;
            }
            case 29: {
                n4 = 16;
                break;
            }
            case 30: {
                n4 = 13;
                break;
            }
            case 31: {
                n4 = 61;
                break;
            }
            case 32: {
                n4 = 37;
                break;
            }
            case 33: {
                n4 = 38;
                break;
            }
            case 34: {
                n4 = 28;
                break;
            }
            case 35: {
                n4 = 40;
                break;
            }
            case 36: {
                n4 = 12;
                break;
            }
            case 37: {
                n4 = 15;
                break;
            }
            case 38: {
                n4 = 23;
                break;
            }
            case 39: {
                n4 = 33;
                break;
            }
            case 40: {
                n4 = 7;
                break;
            }
            case 41: {
                n4 = 2;
                break;
            }
            case 42: {
                n4 = 52;
                break;
            }
            case 43: {
                n4 = 29;
                break;
            }
            case 44: {
                n4 = 6;
                break;
            }
            case 45: {
                n4 = 27;
                break;
            }
            case 46: {
                n4 = 54;
                break;
            }
            case 47: {
                n4 = 58;
                break;
            }
            case 48: {
                n4 = 24;
                break;
            }
            case 49: {
                n4 = 19;
                break;
            }
            case 50: {
                n4 = 4;
                break;
            }
            case 51: {
                n4 = 25;
                break;
            }
            case 52: {
                n4 = 57;
                break;
            }
            case 53: {
                n4 = 53;
                break;
            }
            case 54: {
                n4 = 10;
                break;
            }
            case 55: {
                n4 = 30;
                break;
            }
            case 56: {
                n4 = 1;
                break;
            }
            case 57: {
                n4 = 32;
                break;
            }
            case 58: {
                n4 = 49;
                break;
            }
            case 59: {
                n4 = 26;
                break;
            }
            case 60: {
                n4 = 63;
                break;
            }
            case 61: {
                n4 = 20;
                break;
            }
            case 62: {
                n4 = 62;
                break;
            }
            default: {
                n4 = 45;
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
        cp.n[n5] = new String(cArray);
        return n5;
    }

    public int b() {
        return this.e;
    }

    public cp v() {
        return new cp(null, this.x(), this.O(), this.y(), this.b(), (List)this.u());
    }

    @Override
    public boolean C(JsonObject jsonObject) {
        block6: {
            block7: {
                long l10 = a ^ 0x56B0CF726CE4L;
                try {
                    if (!jsonObject.get((String)((Object)cp.d("G", (int)cp.b("t", (int)12047, (long)(0x5EF8B873327F96FEL ^ l10)), (long)-8268314562815310695L, (long)l10))).getAsString().equalsIgnoreCase(this.x())) break block6;
                    if (!jsonObject.get((String)((Object)cp.d("G", (int)cp.b("t", (int)25881, (long)(0x5CFE531DA1935CE9L ^ l10)), (long)-8268314562815310695L, (long)l10))).isJsonArray()) break block7;
                }
                catch (Exception exception) {
                    throw cp.a(exception);
                }
                JsonArray jsonArray = jsonObject.get((String)((Object)cp.d("G", (int)cp.b("t", (int)5821, (long)(0xAAB8F939DC92F4FL ^ l10)), (long)-8268314562815310695L, (long)l10))).getAsJsonArray();
                ArrayList arrayList = new ArrayList((Collection)this.J());
                for (FI fI2 : arrayList) {
                    this.A(fI2);
                }
                for (FI fI2 : jsonArray) {
                    try {
                        FI fI3 = new FI("", -1);
                        fI3.t(fI2.getAsJsonObject());
                        this.H(fI3);
                    }
                    catch (Exception exception) {}
                }
            }
            return true;
        }
        return super.C(jsonObject);
    }

    public static cp o(Object object, String string, String string2, Color color, List<FI> list) {
        return cp.g(object, string, string2, color, -1, list);
    }

    public boolean z(String string) {
        boolean bl2 = true;
        for (FI fI2 : (List)this.J()) {
            block5: {
                try {
                    try {
                        if (!fI2.Q()) continue;
                        if (!fI2.q().toLowerCase().equals(string.toLowerCase())) break block5;
                    }
                    catch (O_ o_2) {
                        throw cp.a(o_2);
                    }
                    return true;
                }
                catch (O_ o_3) {
                    throw cp.a(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public void F(List<FI> list) {
        ((List)super.J()).clear();
        ((List)super.J()).addAll(list);
    }

    public FI P(String string) {
        for (FI fI2 : (List)this.J()) {
            try {
                if (!fI2.q().toLowerCase().equals(string.toLowerCase())) continue;
                return fI2;
            }
            catch (O_ o_2) {
                throw cp.a(o_2);
            }
        }
        return null;
    }

    private cp(Object object, String string, String string2, Color color, int n2, List<FI> list) {
        super(object, string, string2, list);
        this.D = color;
        this.e = n2;
    }

    public boolean H(V4 v42) {
        return this.b(v42, false);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00a3' || c10 == '\u00d2' || c10 == '\u00f1' || c10 == 'b') {
                field = cp.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00a3' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00d2' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00f1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cp.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00c9' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'G' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/cp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field g(long l10, long l11) {
        int n2 = cp.e(l10, l11);
        Object object = m[n2];
        if (object instanceof String) {
            String string = n[n2];
            int n3 = string.indexOf(8);
            Class clazz = cp.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = cp.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cp.c(clazz3, string2, clazz2)) != null) {
                    cp.m[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = cp.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        cp.m[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cp.f(241817946069306L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public boolean p() {
        boolean bl2;
        block5: {
            block4: {
                List list = (List)this.J();
                List list2 = (List)this.u();
                try {
                    try {
                        if (list.size() != list2.size() || !list.equals(list2)) break block4;
                    }
                    catch (O_ o_2) {
                        throw cp.a(o_2);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (O_ o_3) {
                    throw cp.a(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public boolean q(V4 v42) {
        for (FI fI2 : (List)this.J()) {
            try {
                if (!fI2.r(v42)) continue;
                return false;
            }
            catch (O_ o_2) {
                throw cp.a(o_2);
            }
        }
        return true;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public cp J(boolean bl2) {
        this.s = bl2;
        return this;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = cp.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public boolean j(boolean bl2) {
        block11: {
            Qg qg2 = EP.U();
            try {
                if (qg2.Y()) {
                    return false;
                }
            }
            catch (O_ o_2) {
                throw cp.a(o_2);
            }
            V4 v42 = EP.U().K();
            try {
                if (this.H(v42)) {
                    return true;
                }
            }
            catch (O_ o_3) {
                throw cp.a(o_3);
            }
            if (Na.MC_1_12_2.H()) {
                V4 v43 = qg2.G(oP.e());
                try {
                    try {
                        if (!bl2 || !this.H(v43)) break block11;
                    }
                    catch (O_ o_4) {
                        throw cp.a(o_4);
                    }
                    return true;
                }
                catch (O_ o_5) {
                    throw cp.a(o_5);
                }
            }
        }
        return false;
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

    @Override
    public JsonObject k(boolean bl2) {
        long l10 = a ^ 0x56C3689CCB35L;
        JsonObject jsonObject = this.y();
        JsonArray jsonArray = new JsonArray();
        for (FI fI2 : (List)this.J()) {
            jsonArray.add((JsonElement)fI2.T());
        }
        jsonObject.add((String)((Object)cp.d("G", (int)cp.b("t", (int)10613, (long)(0x443C6A9D488BB757L ^ l10)), (long)3066964290462999368L, (long)l10)), (JsonElement)jsonArray);
        return jsonObject;
    }

    private static void a() {
        Object[] objectArray = m;
        m[0] = "H\f?";
        objectArray[1] = Integer.TYPE;
        cp.n[1] = "java/lang/Integer";
        objectArray[2] = "obCCQ8dmR\f, wj[E";
        objectArray[3] = "\u0019\u0001\nq\u0006\\\u0012\u000e\u001b>gR\u0019\u0005\u001fd";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "A\u001a\u0012,`\"\u0014Y\u0002^a;.X\u00001iyLWJe\nyV\u0014\u001f7j2DW\u0003^";
    }

    public boolean m() {
        return this.j(this.s);
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/cp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public Color y() {
        return this.D;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public void A(FI fI2) {
        try {
            ((List)this.J()).remove(fI2);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = cp.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static cp g(Object object, String string, String string2, Color color, int n2, List<FI> list) {
        cp cp2 = new cp(object, string, string2, color, n2, list);
        ((List)cp2.J()).addAll(list);
        return cp2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cp.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(cp.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

