/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.AE;
import a.Ao;
import a.F8;
import a.FF;
import a.FG;
import a.G5;
import a.GK;
import a.Gg;
import a.ID;
import a.IS;
import a.JD;
import a.O_;
import a.Or;
import a.Rs;
import a.SE;
import a.X4;
import a.XA;
import a.Yd;
import a.bM;
import a.d8;
import a.fO;
import a.fu;
import a.h7;
import a.hQ;
import a.hY;
import a.hg;
import a.hs;
import a.ht;
import a.hy;
import a.jE;
import a.rk;
import a.s2;
import a.sX;
import a.xi;
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
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class hx
extends hQ {
    private String V;
    private xi RG;
    private double D;
    private X4 Rk;
    private static final Object[] fb;
    private hy RX;
    private long RM;
    private List<ht> RD;
    private static final Integer[] db;
    private double RR;
    private fu Rx;
    private boolean R5;
    private hs Rd;
    private h7 R2;
    private static final String[] jb;
    private hy R3;
    private static final long ab;
    private int Rl;
    private hs b;
    private double RV;
    private static final Map eb;
    private final long Y = 2000L;
    private boolean RE;
    private boolean Rj;
    private static final long[] bb;
    private int Rw;
    private boolean L;
    private rk Rr;

    @Override
    public void g() {
        try {
            if (!Ao.e) {
                this.R5 = true;
            }
        }
        catch (O_ o_2) {
            throw hx.a(o_2);
        }
    }

    static hs V(hx hx2) {
        return hx2.Rd;
    }

    public void o() {
        this.Rj = true;
        for (ht ht2 : this.RD) {
            Color color;
            block8: {
                jE jE2;
                block7: {
                    this.Rx.A().get(this.Rx.A().indexOf(ht2)).N(true);
                    ht2.Q(hx.M.a);
                    jE2 = ht2.k();
                    try {
                        try {
                            try {
                                if (jE2 == null || jE2.G() == null) continue;
                            }
                            catch (O_ o_2) {
                                throw hx.a(o_2);
                            }
                            if (jE2.U() != null) break block7;
                        }
                        catch (O_ o_3) {
                            throw hx.a(o_3);
                        }
                        color = hx.M.a.darker();
                        break block8;
                    }
                    catch (O_ o_4) {
                        throw hx.a(o_4);
                    }
                }
                color = jE2.U();
            }
            Color color2 = color;
            ht2.Q(color2);
        }
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00d4' || c10 == 'b' || c10 == '\u00d2' || c10 == '\u00f8') {
                field = hx.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00d4' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'b' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00d2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = hx.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'e' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'x' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    static double p(hx hx2, double d2) {
        hx2.RR = d2;
        return hx2.RR;
    }

    public void M(String string) {
        try {
            if (string == null) {
                this.C(1);
                return;
            }
        }
        catch (O_ o_2) {
            throw hx.a(o_2);
        }
        this.V = string.toUpperCase();
    }

    private void I() {
        block17: {
            block18: {
                try {
                    try {
                        if (ID.A(Or.LEFT_CLICK.ordinal())) break block17;
                        this.L = false;
                        Ao.d = null;
                        if (this.Rw == -1) break block18;
                    }
                    catch (O_ o_2) {
                        throw hx.a(o_2);
                    }
                    SE.h.S().I().remove(this.RG);
                    SE.h.S().I().add(this.Rw, this.RG);
                }
                catch (O_ o_3) {
                    throw hx.a(o_3);
                }
            }
            fO.p();
            this.Rw = -1;
            return;
        }
        int n2 = -1;
        int n3 = -1;
        double d2 = this.b() * this.w();
        ArrayList<hx> arrayList = new ArrayList<hx>();
        for (ht ht2 : this.Rx.A()) {
            try {
                if (!(ht2 instanceof hx)) continue;
                arrayList.add((hx)ht2);
            }
            catch (O_ o_4) {
                throw hx.a(o_4);
            }
        }
        arrayList.sort(new XA(this));
        for (hx hx2 : arrayList) {
            try {
                ++n3;
                if (hx2.equals(this)) {
                    continue;
                }
            }
            catch (O_ o_5) {
                throw hx.a(o_5);
            }
            double d3 = hx2.C().c(this.C());
            if (!(d3 >= d2 / 2.0)) continue;
            n2 = n3;
            break;
        }
        try {
            if (n2 == -1) {
                return;
            }
        }
        catch (O_ o_6) {
            throw hx.a(o_6);
        }
        try {
            if (this.Rw != n2) {
                this.w(n2);
            }
        }
        catch (O_ o_7) {
            throw hx.a(o_7);
        }
        this.Rw = n2;
    }

    public void o(boolean bl2) {
        this.Rj = bl2;
    }

    @Override
    public void U() {
    }

    private static Method h(long l10, long l11) {
        int n2 = hx.e(l10, l11);
        Object object = fb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = jb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = hx.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = hx.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = hx.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        hx.fb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = hx.f(277306217360050L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = hx.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        hx.fb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = hx.f(277306217360050L, 0L);
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

    public h7 Y() {
        return this.R2;
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (jb[n5] != null) {
            return n5;
        }
        Object object = fb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 27;
                break;
            }
            case 1: {
                n4 = 2;
                break;
            }
            case 2: {
                n4 = 47;
                break;
            }
            case 3: {
                n4 = 44;
                break;
            }
            case 4: {
                n4 = 11;
                break;
            }
            case 5: {
                n4 = 62;
                break;
            }
            case 6: {
                n4 = 33;
                break;
            }
            case 7: {
                n4 = 10;
                break;
            }
            case 8: {
                n4 = 46;
                break;
            }
            case 9: {
                n4 = 58;
                break;
            }
            case 10: {
                n4 = 32;
                break;
            }
            case 11: {
                n4 = 0;
                break;
            }
            case 12: {
                n4 = 8;
                break;
            }
            case 13: {
                n4 = 53;
                break;
            }
            case 14: {
                n4 = 18;
                break;
            }
            case 15: {
                n4 = 9;
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
                n4 = 20;
                break;
            }
            case 19: {
                n4 = 21;
                break;
            }
            case 20: {
                n4 = 28;
                break;
            }
            case 21: {
                n4 = 6;
                break;
            }
            case 22: {
                n4 = 40;
                break;
            }
            case 23: {
                n4 = 25;
                break;
            }
            case 24: {
                n4 = 1;
                break;
            }
            case 25: {
                n4 = 57;
                break;
            }
            case 26: {
                n4 = 4;
                break;
            }
            case 27: {
                n4 = 35;
                break;
            }
            case 28: {
                n4 = 41;
                break;
            }
            case 29: {
                n4 = 59;
                break;
            }
            case 30: {
                n4 = 60;
                break;
            }
            case 31: {
                n4 = 26;
                break;
            }
            case 32: {
                n4 = 36;
                break;
            }
            case 33: {
                n4 = 56;
                break;
            }
            case 34: {
                n4 = 7;
                break;
            }
            case 35: {
                n4 = 12;
                break;
            }
            case 36: {
                n4 = 23;
                break;
            }
            case 37: {
                n4 = 52;
                break;
            }
            case 38: {
                n4 = 24;
                break;
            }
            case 39: {
                n4 = 45;
                break;
            }
            case 40: {
                n4 = 37;
                break;
            }
            case 41: {
                n4 = 15;
                break;
            }
            case 42: {
                n4 = 34;
                break;
            }
            case 43: {
                n4 = 63;
                break;
            }
            case 44: {
                n4 = 13;
                break;
            }
            case 45: {
                n4 = 16;
                break;
            }
            case 46: {
                n4 = 30;
                break;
            }
            case 47: {
                n4 = 17;
                break;
            }
            case 48: {
                n4 = 29;
                break;
            }
            case 49: {
                n4 = 42;
                break;
            }
            case 50: {
                n4 = 3;
                break;
            }
            case 51: {
                n4 = 38;
                break;
            }
            case 52: {
                n4 = 22;
                break;
            }
            case 53: {
                n4 = 55;
                break;
            }
            case 54: {
                n4 = 50;
                break;
            }
            case 55: {
                n4 = 43;
                break;
            }
            case 56: {
                n4 = 19;
                break;
            }
            case 57: {
                n4 = 39;
                break;
            }
            case 58: {
                n4 = 54;
                break;
            }
            case 59: {
                n4 = 48;
                break;
            }
            case 60: {
                n4 = 14;
                break;
            }
            case 61: {
                n4 = 51;
                break;
            }
            case 62: {
                n4 = 49;
                break;
            }
            default: {
                n4 = 61;
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
        hx.jb[n5] = new String(cArray);
        return n5;
    }

    private static void i() {
        Object[] objectArray = fb;
        fb[0] = "\u001a5\u0003";
        objectArray[1] = Integer.TYPE;
        hx.jb[1] = "java/lang/Integer";
        objectArray[2] = "$(o\u001f1]/'~PLE< w\u0019";
        objectArray[3] = "#x!u6\u0019(w0:W\u0017#|4`";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "C\u001ezeK`\u001b]z\u0017Ijr\u0019?xXa\t\\:u\"+H\b?,SoK\u0001$\u0017";
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = hx.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = hx.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = hx.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = hx.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                hx.ab = d8.a(-3328735911787541868L, 5674568816636643298L, MethodHandles.lookup().lookupClass()).a(229883401606684L);
                hx.fb = new Object[5];
                hx.jb = new String[5];
                hx.i();
                hx.eb = new HashMap<K, V>(13);
                var0 = hx.ab ^ 13642611033733L;
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
                var8_3 = new long[19];
                var5_4 = 0;
                var6_5 = "i\u00bdYh\u00f1\u00b2\u009c\u0084\u00d1\u00a7\u001bz\u00f5\u0082c\u00f0\u00c8\u00c1\u00ddL\u0003\u0015\u000e\u00cd\u00c0\u00bd\u00bb\u00dd\u00cb\u00f0\u00b0\u00fb\u00f0\u0007\u0017h\u00ae\u000bL#\u00e0\u00a3X\u00c7\u0019\u00cfA\u00d1w\u00cax\u0013\u0095\u0000\u0012\u008f\u00db\u00d7\u0014G\u00f3#=\u00e5\u0081)\u0010\u00c7(\u0095\f\u00caT\u00f1\u00f7\"\u008a\u00f7\u00b2\u00e4*\"\u00a5\u00f1\u00be\u0013\u00a0\u001d\u00cf\u00ac#\u0002r\u008e\u0015\t\u00dd\u00fe\u00f0\u00f1\u0001\u00191\u00e1\u00b4$\u00a1\u00f2\u00c1I\u0091\u00fb\u0015BR\u00c4\u00ff@S\u00f6\u0007\u00bbz\u00d9\u00fcz%K\u0084\u0019\u0098\u00f7\u00f5\u0087\u008cb";
                var7_6 = "i\u00bdYh\u00f1\u00b2\u009c\u0084\u00d1\u00a7\u001bz\u00f5\u0082c\u00f0\u00c8\u00c1\u00ddL\u0003\u0015\u000e\u00cd\u00c0\u00bd\u00bb\u00dd\u00cb\u00f0\u00b0\u00fb\u00f0\u0007\u0017h\u00ae\u000bL#\u00e0\u00a3X\u00c7\u0019\u00cfA\u00d1w\u00cax\u0013\u0095\u0000\u0012\u008f\u00db\u00d7\u0014G\u00f3#=\u00e5\u0081)\u0010\u00c7(\u0095\f\u00caT\u00f1\u00f7\"\u008a\u00f7\u00b2\u00e4*\"\u00a5\u00f1\u00be\u0013\u00a0\u001d\u00cf\u00ac#\u0002r\u008e\u0015\t\u00dd\u00fe\u00f0\u00f1\u0001\u00191\u00e1\u00b4$\u00a1\u00f2\u00c1I\u0091\u00fb\u0015BR\u00c4\u00ff@S\u00f6\u0007\u00bbz\u00d9\u00fcz%K\u0084\u0019\u0098\u00f7\u00f5\u0087\u008cb".length();
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
                    var6_5 = "\u00c1\u00cdi7L\u008bCW\u0097\u0095\u0099\u00b6!\u0019,T";
                    var7_6 = "\u00c1\u00cdi7L\u008bCW\u0097\u0095\u0099\u00b6!\u0019,T".length();
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
        hx.bb = var8_3;
        hx.db = new Integer[19];
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = hx.e(l10, l11);
            object = fb[n2];
            try {
                if (!(object instanceof String)) break block2;
                hx.fb[n2] = clazz = Class.forName(jb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public void C() {
        for (jE<?, ?> jE2 : this.RG.Y()) {
            ht ht2;
            block7: {
                block6: {
                    ht2 = FF.m(jE2);
                    try {
                        try {
                            if (ht2 == null) continue;
                            if (jE2.G() == null) break block6;
                        }
                        catch (O_ o_2) {
                            throw hx.a(o_2);
                        }
                        ht2.Q(hx.M.a);
                        break block7;
                    }
                    catch (O_ o_3) {
                        throw hx.a(o_3);
                    }
                }
                ht2.Q(hx.M.W);
            }
            ht2.N(false);
            this.Rx.n(ht2, new Object[0]);
            this.RD.add(ht2);
        }
        if (this.RG instanceof AE) {
            hg hg2 = new hg();
            hg2.Q(hx.M.W);
            hg2.N(false);
            this.Rx.n(hg2, new Object[0]);
            this.RD.add(hg2);
        }
    }

    private void w(int n2) {
        double d2 = this.Rx.Q().W() + this.Rx.Q().b();
        ArrayList<hx> arrayList = new ArrayList<hx>();
        for (ht ht2 : this.Rx.A()) {
            try {
                if (!(ht2 instanceof hx)) continue;
                arrayList.add((hx)ht2);
            }
            catch (O_ o_2) {
                throw hx.a(o_2);
            }
        }
        arrayList.remove(this);
        arrayList.add(n2, this);
        double d3 = 0.0;
        for (hx hx2 : arrayList) {
            try {
                if (hx2.W() < d2) {
                    continue;
                }
            }
            catch (O_ o_3) {
                throw hx.a(o_3);
            }
            if (hx2.D().equals(this.D())) {
                d3 += hx2.b();
                continue;
            }
            hx2.M(d2 + d3);
            d3 += hx2.b();
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/hx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    static double O(hx hx2, double d2) {
        hx2.D = d2;
        return hx2.D;
    }

    public hs e() {
        return this.Rd;
    }

    public hx(fu fu2, xi xi2) {
        this(fu2, xi2, 0.9);
    }

    static X4 D(hx hx2) {
        return hx2.Rk;
    }

    static h7 p(hx hx2) {
        return hx2.R2;
    }

    static boolean T(hx hx2, boolean bl2) {
        hx2.L = bl2;
        return hx2.L;
    }

    public void M() {
        this.Rj = false;
        for (ht ht2 : this.RD) {
            this.Rx.A().get(this.Rx.A().indexOf(ht2)).N(false);
            ht2.Q(hx.M.a);
        }
    }

    public hx(fu fu2, xi xi2, double d2) {
        long l10 = ab ^ 0x335DB4C3F831L;
        this.Rw = -1;
        this.V = null;
        this.Rl = 0;
        this.Y = 2000L;
        this.RM = 0L;
        this.RD = new ArrayList<ht>();
        this.R3 = new hy((String)((Object)hx.c("x", (int)hx.b("t", (int)24178, (long)(0x3887120AAF527873L ^ l10)), (long)8108177394339817116L, (long)l10)), 1.5);
        this.RX = new hy((String)((Object)hx.c("x", (int)hx.b("t", (int)10067, (long)(0x3169A8FEEAA90158L ^ l10)), (long)8108177394339817116L, (long)l10)), 1.5);
        this.Rr = new rk(0.15, 0.0, 1.0);
        this.Rd = new hs((String)((Object)hx.c("x", (int)hx.b("t", (int)2903, (long)(0x2B51A167EC80AD41L ^ l10)), (long)8108177394339817116L, (long)l10)));
        this.b = new hs((String)((Object)hx.c("x", (int)hx.b("t", (int)20428, (long)(0x53216B650B6A69C0L ^ l10)), (long)8108177394339817116L, (long)l10)));
        this.Rx = fu2;
        this.RG = xi2;
        this.RV = d2;
        this.R2 = new h7(xi2.C());
        this.Q(hx.M.W);
        if (xi2.r() != null) {
            this.g(xi2.r());
        }
        hx hx2 = this;
        try {
            if (fu2 instanceof fO) {
                this.RE = true;
            }
        }
        catch (O_ o_2) {
            throw hx.a(o_2);
        }
        this.R3.N(new s2(this, xi2, fu2));
        this.R3.g((String)((Object)hx.c("x", (int)hx.b("t", (int)222, (long)(0x32673C93C9A5A6D7L ^ l10)), (long)8108177394339817116L, (long)l10)));
        this.RX.N(new JD(this, hx2));
        this.Rd.N(new Gg(this, fu2));
        this.b.N(new Yd(this, xi2));
        this.b.g((String)((Object)hx.c("x", (int)hx.b("t", (int)10581, (long)(0x70D97B3849AF8F41L ^ l10)), (long)8108177394339817116L, (long)l10)));
        this.N(new IS(this, xi2));
        this.o(this.R2, this.R3, this.RX, this.Rd, this.b);
    }

    static boolean k(hx hx2) {
        return hx2.RE;
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x5681;
        if (db[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = bb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])eb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    eb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/hx", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            hx.db[n3] = n4;
        }
        return db[n3];
    }

    public List<ht> X() {
        return this.RD;
    }

    public void C(int n2) {
        this.Rl = n2;
        this.RM = System.currentTimeMillis();
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static Field g(long l10, long l11) {
        int n2 = hx.e(l10, l11);
        Object object = fb[n2];
        if (object instanceof String) {
            String string = jb[n2];
            int n3 = string.indexOf(8);
            Class clazz = hx.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = hx.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = hx.c(clazz3, string2, clazz2)) != null) {
                    hx.fb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = hx.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        hx.fb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = hx.f(277306217360050L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public void d() {
        block80: {
            int n2;
            block84: {
                String string;
                int[] nArray;
                long l10;
                block83: {
                    hx hx2;
                    block82: {
                        long l11;
                        block81: {
                            block79: {
                                block77: {
                                    block78: {
                                        block74: {
                                            long l12;
                                            block72: {
                                                hx hx3;
                                                block75: {
                                                    String string2;
                                                    block73: {
                                                        hx hx4;
                                                        block70: {
                                                            block71: {
                                                                int n3;
                                                                block66: {
                                                                    block67: {
                                                                        hx hx5;
                                                                        block68: {
                                                                            block69: {
                                                                                l10 = ab ^ 0x33B2DE2428A3L;
                                                                                nArray = hY.D();
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    n3 = this.R2.I();
                                                                                                    if (nArray == null) break block66;
                                                                                                    if (n3 == 0) break block67;
                                                                                                }
                                                                                                catch (O_ o_2) {
                                                                                                    throw hx.a(o_2);
                                                                                                }
                                                                                                hx5 = this;
                                                                                                if (nArray == null) break block68;
                                                                                            }
                                                                                            catch (O_ o_3) {
                                                                                                throw hx.a(o_3);
                                                                                            }
                                                                                            if (hx5.V == null) break block69;
                                                                                        }
                                                                                        catch (O_ o_4) {
                                                                                            throw hx.a(o_4);
                                                                                        }
                                                                                        n3 = this.V.toLowerCase(Locale.ROOT).startsWith((String)((Object)hx.c("x", (int)hx.b("t", (int)3827, (long)(0x4931F62FA46FF86BL ^ l10)), (long)-6911890117839948274L, (long)l10))) ? 1 : 0;
                                                                                        if (nArray == null) break block66;
                                                                                    }
                                                                                    catch (O_ o_5) {
                                                                                        throw hx.a(o_5);
                                                                                    }
                                                                                    if (n3 != 0) break block67;
                                                                                }
                                                                                catch (O_ o_6) {
                                                                                    throw hx.a(o_6);
                                                                                }
                                                                            }
                                                                            hx5 = this;
                                                                        }
                                                                        hx5.M((String)((Object)hx.c("x", (int)hx.b("t", (int)8207, (long)(0x4F07DF46082E5695L ^ l10)), (long)-6911890117839948274L, (long)l10)));
                                                                    }
                                                                    try {
                                                                        hx4 = this;
                                                                        if (nArray == null) break block70;
                                                                        n3 = hx4.Rl;
                                                                    }
                                                                    catch (O_ o_7) {
                                                                        throw hx.a(o_7);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (n3 == 0 || System.currentTimeMillis() <= this.RM + 2000L) break block71;
                                                                        }
                                                                        catch (O_ o_8) {
                                                                            throw hx.a(o_8);
                                                                        }
                                                                        this.V = null;
                                                                        this.R2.x(false);
                                                                        this.Rl = 0;
                                                                        if (nArray != null) break block72;
                                                                    }
                                                                    catch (O_ o_9) {
                                                                        throw hx.a(o_9);
                                                                    }
                                                                    ht.I(new String[1]);
                                                                }
                                                                catch (O_ o_10) {
                                                                    throw hx.a(o_10);
                                                                }
                                                            }
                                                            hx4 = this;
                                                        }
                                                        try {
                                                            try {
                                                                string2 = hx4.V;
                                                                if (nArray == null) break block73;
                                                                if (string2 == null) break block72;
                                                            }
                                                            catch (O_ o_11) {
                                                                throw hx.a(o_11);
                                                            }
                                                            string2 = this.V.toLowerCase(Locale.ROOT);
                                                        }
                                                        catch (O_ o_12) {
                                                            throw hx.a(o_12);
                                                        }
                                                    }
                                                    try {
                                                        block76: {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    l11 = (long)string2.startsWith((String)((Object)hx.c("x", (int)hx.b("t", (int)12666, (long)(0x2058B58139C6C7EEL ^ l10)), (long)-6911890117839948274L, (long)l10)));
                                                                                    if (nArray == null) break block74;
                                                                                    if (l11 == false) break block72;
                                                                                }
                                                                                catch (O_ o_13) {
                                                                                    throw hx.a(o_13);
                                                                                }
                                                                                l11 = (long)this.R2.I();
                                                                                if (nArray == null) break block74;
                                                                            }
                                                                            catch (O_ o_14) {
                                                                                throw hx.a(o_14);
                                                                            }
                                                                            if (l11 != false) break block72;
                                                                        }
                                                                        catch (O_ o_15) {
                                                                            throw hx.a(o_15);
                                                                        }
                                                                        this.C(1);
                                                                        hx3 = this;
                                                                        if (nArray == null) break block75;
                                                                    }
                                                                    catch (O_ o_16) {
                                                                        throw hx.a(o_16);
                                                                    }
                                                                    if (hx3.RG.C().t().length() <= 0) break block76;
                                                                }
                                                                catch (O_ o_17) {
                                                                    throw hx.a(o_17);
                                                                }
                                                                this.M((String)((Object)hx.c("x", (int)hx.b("t", (int)12772, (long)(0x72860F02F8A6C778L ^ l10)), (long)-6911890117839948274L, (long)l10)));
                                                                if (nArray != null) break block72;
                                                            }
                                                            catch (O_ o_18) {
                                                                throw hx.a(o_18);
                                                            }
                                                        }
                                                        hx3 = this;
                                                    }
                                                    catch (O_ o_19) {
                                                        throw hx.a(o_19);
                                                    }
                                                }
                                                hx3.M((String)((Object)hx.c("x", (int)hx.b("t", (int)4280, (long)(0x92DD34BEA36E62AL ^ l10)), (long)-6911890117839948274L, (long)l10)));
                                            }
                                            l11 = (l12 = System.currentTimeMillis() - 1784953218903L) == 0L ? 0 : (l12 < 0L ? -1 : 1);
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (nArray == null) break block77;
                                                        if (l11 <= 0) break block78;
                                                    }
                                                    catch (O_ o_20) {
                                                        throw hx.a(o_20);
                                                    }
                                                    l11 = ThreadLocalRandom.current().nextInt(0, 10000) % 500;
                                                    if (nArray == null) break block77;
                                                }
                                                catch (O_ o_21) {
                                                    throw hx.a(o_21);
                                                }
                                                if (l11 != false) break block78;
                                            }
                                            catch (O_ o_22) {
                                                throw hx.a(o_22);
                                            }
                                            GK.W().Y.put(ThreadLocalRandom.current().nextInt(0, 600), null);
                                        }
                                        catch (O_ o_23) {
                                            throw hx.a(o_23);
                                        }
                                    }
                                    l11 = (long)this.R5;
                                }
                                try {
                                    try {
                                        if (nArray == null) break block79;
                                        if (l11 == false) break block80;
                                    }
                                    catch (O_ o_24) {
                                        throw hx.a(o_24);
                                    }
                                    l11 = (long)this.s();
                                }
                                catch (O_ o_25) {
                                    throw hx.a(o_25);
                                }
                            }
                            try {
                                try {
                                    try {
                                        if (nArray == null) break block81;
                                        if (l11 != false) break block80;
                                    }
                                    catch (O_ o_26) {
                                        throw hx.a(o_26);
                                    }
                                    this.R5 = false;
                                    hx2 = this;
                                    if (nArray == null) break block82;
                                }
                                catch (O_ o_27) {
                                    throw hx.a(o_27);
                                }
                                l11 = hx2.Rl;
                            }
                            catch (O_ o_28) {
                                throw hx.a(o_28);
                            }
                        }
                        if (l11 != false) break block80;
                        hx2 = this;
                    }
                    try {
                        try {
                            string = hx2.V;
                            if (nArray == null) break block83;
                            if (string == null) break block80;
                        }
                        catch (O_ o_29) {
                            throw hx.a(o_29);
                        }
                        string = this.V.toLowerCase(Locale.ROOT);
                    }
                    catch (O_ o_30) {
                        throw hx.a(o_30);
                    }
                }
                try {
                    try {
                        n2 = string.startsWith((String)((Object)hx.c("x", (int)hx.b("t", (int)28167, (long)(0x460039999E7F9892L ^ l10)), (long)-6911890117839948274L, (long)l10)));
                        if (nArray == null) break block84;
                        if (n2 != 0) break block80;
                    }
                    catch (O_ o_31) {
                        throw hx.a(o_31);
                    }
                    long l13 = System.currentTimeMillis() - (this.RM + 2000L);
                    n2 = l13 == 0L ? 0 : (l13 < 0L ? -1 : 1);
                }
                catch (O_ o_32) {
                    throw hx.a(o_32);
                }
            }
            try {
                if (n2 > 0) {
                    this.M(null);
                }
            }
            catch (O_ o_33) {
                throw hx.a(o_33);
            }
        }
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = hx.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    static boolean W(hx hx2, boolean bl2) {
        hx2.Rj = bl2;
        return hx2.Rj;
    }

    @Override
    public void G() {
        float f10;
        double d2;
        float f11;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d9;
        double d10;
        bM bM2;
        double d11;
        double d12;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        G5 g5;
        block110: {
            CallSite callSite;
            G5 g52;
            double d13;
            long l10;
            block109: {
                boolean bl5;
                block108: {
                    block107: {
                        boolean bl6;
                        block106: {
                            block104: {
                                block100: {
                                    int n2;
                                    block114: {
                                        block101: {
                                            int n3;
                                            int n4;
                                            block103: {
                                                block102: {
                                                    block99: {
                                                        Color color;
                                                        double d14;
                                                        double d15;
                                                        String string;
                                                        G5 g53;
                                                        Color color2;
                                                        double d16;
                                                        block98: {
                                                            block96: {
                                                                Color color3;
                                                                hs hs2;
                                                                block93: {
                                                                    double d17;
                                                                    double d18;
                                                                    double d19;
                                                                    block97: {
                                                                        block95: {
                                                                            double d20;
                                                                            block94: {
                                                                                Color color4;
                                                                                block113: {
                                                                                    block90: {
                                                                                        Color color5;
                                                                                        hs hs3;
                                                                                        double d21;
                                                                                        block92: {
                                                                                            block91: {
                                                                                                block112: {
                                                                                                    block89: {
                                                                                                        block87: {
                                                                                                            l10 = ab ^ 0x6A35E0B3F4BCL;
                                                                                                            try {
                                                                                                                if (this.L) {
                                                                                                                    this.q();
                                                                                                                    this.I();
                                                                                                                }
                                                                                                            }
                                                                                                            catch (O_ o_2) {
                                                                                                                throw hx.a(o_2);
                                                                                                            }
                                                                                                            g5 = this.L(this.RV);
                                                                                                            double d22 = g5.B(this.RG.O());
                                                                                                            d16 = this.W() + this.b() / 2.0 - d22 / 2.0;
                                                                                                            double d23 = this.W() + this.b() / 2.0 - 4.0;
                                                                                                            d13 = this.G() + 6.0;
                                                                                                            color4 = this.l();
                                                                                                            color2 = hx.M.n;
                                                                                                            if (this.RG.Z()) {
                                                                                                                color4 = M.j();
                                                                                                                color2 = M.X();
                                                                                                            } else {
                                                                                                                block86: {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            if (this.R5 || this.Rj) break block86;
                                                                                                                        }
                                                                                                                        catch (O_ o_3) {
                                                                                                                            throw hx.a(o_3);
                                                                                                                        }
                                                                                                                        if (this.V == null) break block87;
                                                                                                                    }
                                                                                                                    catch (O_ o_4) {
                                                                                                                        throw hx.a(o_4);
                                                                                                                    }
                                                                                                                }
                                                                                                                color4 = hx.M.g;
                                                                                                                color2 = hx.M.c;
                                                                                                            }
                                                                                                        }
                                                                                                        d21 = this.G() + this.w() - 10.0 - 8.0;
                                                                                                        try {
                                                                                                            block88: {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    if (this.V != null && this.V.startsWith((String)((Object)hx.c("x", (int)hx.b("t", (int)3795, (long)(0x34DF7B77C4BDA45DL ^ l10)), (long)8938326987782105617L, (long)l10)))) break block88;
                                                                                                                                }
                                                                                                                                catch (O_ o_5) {
                                                                                                                                    throw hx.a(o_5);
                                                                                                                                }
                                                                                                                                if (this.RG.C().E()) break block88;
                                                                                                                            }
                                                                                                                            catch (O_ o_6) {
                                                                                                                                throw hx.a(o_6);
                                                                                                                            }
                                                                                                                            if (this.R5) break block88;
                                                                                                                        }
                                                                                                                        catch (O_ o_7) {
                                                                                                                            throw hx.a(o_7);
                                                                                                                        }
                                                                                                                        if (this.R2.Q().F()) break block88;
                                                                                                                    }
                                                                                                                    catch (O_ o_8) {
                                                                                                                        throw hx.a(o_8);
                                                                                                                    }
                                                                                                                    if (!this.Rj) break block89;
                                                                                                                }
                                                                                                                catch (O_ o_9) {
                                                                                                                    throw hx.a(o_9);
                                                                                                                }
                                                                                                            }
                                                                                                            if (Ao.e) break block89;
                                                                                                        }
                                                                                                        catch (O_ o_10) {
                                                                                                            throw hx.a(o_10);
                                                                                                        }
                                                                                                        this.R2.b(d21 -= this.R2.w());
                                                                                                        this.R2.M(this.W() + 5.0);
                                                                                                        this.R2.N(true);
                                                                                                        d21 -= 2.5;
                                                                                                        break block112;
                                                                                                    }
                                                                                                    this.R2.N(false);
                                                                                                }
                                                                                                try {
                                                                                                    if (!this.Rj || this.RE) break block90;
                                                                                                }
                                                                                                catch (O_ o_11) {
                                                                                                    throw hx.a(o_11);
                                                                                                }
                                                                                                d21 -= this.b.w();
                                                                                                try {
                                                                                                    this.b.N(true);
                                                                                                    hs3 = this.b;
                                                                                                    if (!this.RG.g()) break block91;
                                                                                                    color5 = hx.M.o;
                                                                                                    break block92;
                                                                                                }
                                                                                                catch (O_ o_12) {
                                                                                                    throw hx.a(o_12);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                color5 = this.RG.Z() ? color2 : null;
                                                                                            }
                                                                                            catch (O_ o_13) {
                                                                                                throw hx.a(o_13);
                                                                                            }
                                                                                        }
                                                                                        hs3.h(color5);
                                                                                        this.b.b(d21);
                                                                                        this.b.M(this.W());
                                                                                        this.b.w(this.b());
                                                                                        d21 -= 5.0;
                                                                                        break block113;
                                                                                    }
                                                                                    this.b.N(false);
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        F8.A(this.G(), this.W(), this.w(), this.b(), color4);
                                                                                        if (!Ao.e) break block93;
                                                                                        if (!this.Rj) break block94;
                                                                                    }
                                                                                    catch (O_ o_14) {
                                                                                        throw hx.a(o_14);
                                                                                    }
                                                                                    this.Rj = false;
                                                                                    this.Rx.E(null);
                                                                                    this.M();
                                                                                    return;
                                                                                }
                                                                                catch (O_ o_15) {
                                                                                    throw hx.a(o_15);
                                                                                }
                                                                            }
                                                                            try {
                                                                                d20 = this.RE ? 38.0 : 20.0;
                                                                            }
                                                                            catch (O_ o_16) {
                                                                                throw hx.a(o_16);
                                                                            }
                                                                            d19 = d20;
                                                                            d13 += d19;
                                                                            try {
                                                                                F8.A(this.G(), this.W(), d19, this.b(), hx.M.a);
                                                                                this.b.N(false);
                                                                                this.Rd.N(false);
                                                                                if (!this.RE) break block95;
                                                                                this.R3.N(true);
                                                                                this.R3.b(this.G() + 5.0);
                                                                                this.R3.M(this.W());
                                                                                this.R3.w(this.b());
                                                                                this.RX.N(true);
                                                                                this.RX.b(this.G() + 10.0 + 8.0 * this.R3.u());
                                                                                this.RX.M(this.W());
                                                                                this.RX.w(this.b());
                                                                                break block96;
                                                                            }
                                                                            catch (O_ o_17) {
                                                                                throw hx.a(o_17);
                                                                            }
                                                                        }
                                                                        this.Rk = new X4(this.G(), this.W(), d19, this.b());
                                                                        d18 = 7.0;
                                                                        d17 = 0.5;
                                                                        double d24 = d17 + 0.5;
                                                                        try {
                                                                            if (!this.RG.H()) break block97;
                                                                            F8.A(this.G() + d18, this.W() + d18, d19 - d18 * 2.0, this.b() - d18 * 2.0, M.j());
                                                                            F8.A(this.G() + d18 + d17, this.W() + d18 + d17, d19 - (d18 + d17) * 2.0, this.b() - (d18 + d17) * 2.0, hx.M.a);
                                                                            F8.A(this.G() + d18 + d24, this.W() + d18 + d24, d19 - (d18 + d24) * 2.0, this.b() - (d18 + d24) * 2.0, M.j());
                                                                            break block96;
                                                                        }
                                                                        catch (O_ o_18) {
                                                                            throw hx.a(o_18);
                                                                        }
                                                                    }
                                                                    F8.A(this.G() + d18, this.W() + d18, d19 - d18 * 2.0, this.b() - d18 * 2.0, hx.M.S);
                                                                    F8.A(this.G() + d18 + d17, this.W() + d18 + d17, d19 - (d18 + d17) * 2.0, this.b() - (d18 + d17) * 2.0, hx.M.a);
                                                                    break block96;
                                                                }
                                                                try {
                                                                    this.R3.N(false);
                                                                    this.RX.N(false);
                                                                    this.Rd.N(true);
                                                                    hs2 = this.Rd;
                                                                    color3 = this.RG.Z() ? color2 : null;
                                                                }
                                                                catch (O_ o_19) {
                                                                    throw hx.a(o_19);
                                                                }
                                                                hs2.h(color3);
                                                                this.Rd.b(this.G() + this.w() - 5.0 - 8.0);
                                                                this.Rd.M(this.W());
                                                                this.Rd.w(this.b());
                                                            }
                                                            bl4 = false;
                                                            try {
                                                                if (this.V == null) break block98;
                                                                this.Rd.N(false);
                                                                this.R(d13, d16, color2);
                                                                break block99;
                                                            }
                                                            catch (O_ o_20) {
                                                                throw hx.a(o_20);
                                                            }
                                                        }
                                                        try {
                                                            g53 = g5;
                                                            string = this.RG.O();
                                                            d15 = d13;
                                                            d14 = d16;
                                                            color = this.RG.H() ? color2 : hx.M.w;
                                                        }
                                                        catch (O_ o_21) {
                                                            throw hx.a(o_21);
                                                        }
                                                        g53.R(string, d15, d14, color);
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                if (!this.RG.Z()) break block100;
                                                                if (!Ao.e) break block101;
                                                            }
                                                            catch (O_ o_22) {
                                                                throw hx.a(o_22);
                                                            }
                                                            n4 = 20;
                                                            if (!this.RE) break block102;
                                                        }
                                                        catch (O_ o_23) {
                                                            throw hx.a(o_23);
                                                        }
                                                        n3 = 18;
                                                        break block103;
                                                    }
                                                    catch (O_ o_24) {
                                                        throw hx.a(o_24);
                                                    }
                                                }
                                                n3 = 0;
                                            }
                                            n2 = n4 + n3;
                                            break block114;
                                        }
                                        n2 = 0;
                                    }
                                    double d25 = n2;
                                    F8.A(this.G() + d25, this.W() + this.b() - 0.5, this.w() - d25, 0.5, hx.M.S);
                                }
                                try {
                                    block105: {
                                        try {
                                            try {
                                                try {
                                                    if (this.V == null) break block104;
                                                    if (this.V.toLowerCase(Locale.ROOT).startsWith((String)((Object)hx.c("x", (int)hx.b("t", (int)23879, (long)(0xAFE55C8DC4377C8L ^ l10)), (long)8938326987782105617L, (long)l10)))) break block105;
                                                }
                                                catch (O_ o_25) {
                                                    throw hx.a(o_25);
                                                }
                                                if (this.V.toLowerCase(Locale.ROOT).startsWith((String)((Object)hx.c("x", (int)hx.b("t", (int)25534, (long)(0x340D08F0E78B4924L ^ l10)), (long)8938326987782105617L, (long)l10)))) break block105;
                                            }
                                            catch (O_ o_26) {
                                                throw hx.a(o_26);
                                            }
                                            if (!this.V.toLowerCase(Locale.ROOT).startsWith((String)((Object)hx.c("x", (int)hx.b("t", (int)31309, (long)(0x202574CAE410D0C5L ^ l10)), (long)8938326987782105617L, (long)l10)))) break block104;
                                        }
                                        catch (O_ o_27) {
                                            throw hx.a(o_27);
                                        }
                                    }
                                    bl6 = true;
                                    break block106;
                                }
                                catch (O_ o_28) {
                                    throw hx.a(o_28);
                                }
                            }
                            bl6 = false;
                        }
                        bl3 = bl6;
                        try {
                            try {
                                if (!this.RG.m() || this.RG.Z()) break block107;
                            }
                            catch (O_ o_29) {
                                throw hx.a(o_29);
                            }
                            bl5 = true;
                            break block108;
                        }
                        catch (O_ o_30) {
                            throw hx.a(o_30);
                        }
                    }
                    bl5 = false;
                }
                bl2 = bl5;
                try {
                    if (!bl2 || bl3) break block109;
                }
                catch (O_ o_31) {
                    throw hx.a(o_31);
                }
                d12 = d13 + g5.D(this.RG.O()) + 5.0;
                d11 = this.W() + 7.0;
                F8.S(d12, d11, 20.0, 7.0, M.j());
                g52 = SE.h.W().u(0.8, false);
                g52.R((String)((Object)hx.c("x", (int)hx.b("t", (int)23948, (long)(0x6A886E67ABE5770CL ^ l10)), (long)8938326987782105617L, (long)l10)), d12 + 3.0, d11 + 1.0, Rs.Q(M.j(), 35, 255));
                break block110;
            }
            try {
                block111: {
                    try {
                        try {
                            if (this.Rj) break block110;
                            if (this.RG.w()) break block111;
                        }
                        catch (O_ o_32) {
                            throw hx.a(o_32);
                        }
                        if (!this.RG.J()) break block110;
                    }
                    catch (O_ o_33) {
                        throw hx.a(o_33);
                    }
                }
                if (this.RG.Z()) break block110;
            }
            catch (O_ o_34) {
                throw hx.a(o_34);
            }
            d12 = d13 + g5.D(this.RG.O()) + 3.0;
            d11 = this.W() + 7.0;
            g52 = this.t(0.65f);
            try {
                callSite = this.RG.J() ? hx.c("x", (int)hx.b("t", (int)30783, (long)(0x35A8A35691ADD2B6L ^ l10)), (long)8938326987782105617L, (long)l10) : hx.c("x", (int)hx.b("t", (int)14292, (long)(0x6CC141237D7D1D56L ^ l10)), (long)8938326987782105617L, (long)l10);
            }
            catch (O_ o_35) {
                throw hx.a(o_35);
            }
            CallSite callSite2 = callSite;
            double d26 = g52.D((String)((Object)callSite2)) + 4.0;
            double d27 = g52.B((String)((Object)callSite2)) + 2.0;
            F8.S(d12, d11, d26, d27, M.j());
            g52.R((String)((Object)callSite2), d12 + 2.0, d11 + 1.0, Rs.Q(M.j(), 35, 255));
        }
        try {
            if (bl3) {
                this.b.N(false);
                this.R3.N(false);
            }
        }
        catch (O_ o_36) {
            throw hx.a(o_36);
        }
        try {
            bM2 = this.R2.V;
            d10 = this.w() - 20.0;
            d9 = this.Rj ? this.b.w() : 0.0;
        }
        catch (O_ o_37) {
            throw hx.a(o_37);
        }
        try {
            d7 = d10 - d9;
            d6 = this.Rd.f() ? this.Rd.w() : 0.0;
        }
        catch (O_ o_38) {
            throw hx.a(o_38);
        }
        try {
            d5 = d7 - d6;
            d4 = this.V != null ? g5.D(this.V) + 3.0 : g5.D(this.RG.O());
        }
        catch (O_ o_39) {
            throw hx.a(o_39);
        }
        try {
            d3 = d5 - d4;
            f11 = bl4 ? 13.0f : 0.0f;
        }
        catch (O_ o_40) {
            throw hx.a(o_40);
        }
        try {
            d2 = d3 - (double)f11;
            f10 = bl2 ? 25.0f : 0.0f;
        }
        catch (O_ o_41) {
            throw hx.a(o_41);
        }
        bM2.a(d2 - (double)f10);
        if (this.V != null) {
            d12 = this.G() + this.w() - 10.0 - 8.0 - this.R2.w();
            d11 = this.G() + 15.0 + g5.D(this.V);
            double d28 = this.G() + this.w() - 5.0 - this.R2.w();
            this.R2.b(Math.min(d28, Math.max(d12, d11)));
        } else {
            this.R2.b(this.G() + this.w() - 10.0 - 8.0 - this.R2.w());
        }
    }

    private void R(double d2, double d3, Color color) {
        FG.e(this.G(), this.W(), this.w(), this.b());
        G5 g5 = this.L(0.75);
        F8.A(this.G(), this.W(), g5.D(this.V) + 10.0, this.b(), new Color(20, 20, 20, 255));
        int n2 = 7;
        double d4 = this.G() + g5.D(this.V) + 10.0 - 1.0;
        double d5 = this.W() + this.b();
        double d6 = d4;
        double d7 = this.W() - 4.0;
        double d9 = d4 + (double)n2;
        double d10 = d5;
        F8.m(d4 + 1.0, d5, d6 + 1.0, d7 - 20.0, d9 + 1.0, d10, new Color(16, 16, 16, 255));
        F8.m(d4, d5, d6, d7, d9, d10, new Color(20, 20, 20, 255));
        g5.R(this.V, d2, d3, color);
        FG.F();
    }

    private void q() {
        block13: {
            sX sX2;
            block14: {
                block12: {
                    block10: {
                        block11: {
                            sX2 = FG.b();
                            double d2 = (double)sX2.I - this.D;
                            try {
                                try {
                                    this.M(this.W() + d2);
                                    if (!(this.W() < this.Rx.W() + this.Rx.Q().b())) break block10;
                                    if (!this.Rx.O()) break block11;
                                }
                                catch (O_ o_2) {
                                    throw hx.a(o_2);
                                }
                                this.Rx.e(this.Rx.V() + 1.0);
                            }
                            catch (O_ o_3) {
                                throw hx.a(o_3);
                            }
                        }
                        this.M(this.Rx.W() + this.Rx.Q().b());
                        break block13;
                    }
                    try {
                        try {
                            if (!this.Rx.O() || !(this.W() > this.Rx.W() + this.Rx.Q() - this.b())) break block12;
                        }
                        catch (O_ o_4) {
                            throw hx.a(o_4);
                        }
                        this.Rx.e(this.Rx.V() - 1.0);
                        this.M(this.Rx.W() + this.Rx.Q() - this.b());
                        break block13;
                    }
                    catch (O_ o_5) {
                        throw hx.a(o_5);
                    }
                }
                try {
                    if (!(this.W() > this.Rx.W() + this.Rx.b() - this.b())) break block14;
                    this.M(this.Rx.W() + this.Rx.b() - this.b());
                    break block13;
                }
                catch (O_ o_6) {
                    throw hx.a(o_6);
                }
            }
            this.D = sX2.I;
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/hx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
    public double z() {
        return 20.0;
    }

    @Override
    public double e() {
        return 110.0;
    }

    static boolean w(hx hx2) {
        return hx2.Rj;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = hx.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public xi D() {
        return this.RG;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(hx.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(hx.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

