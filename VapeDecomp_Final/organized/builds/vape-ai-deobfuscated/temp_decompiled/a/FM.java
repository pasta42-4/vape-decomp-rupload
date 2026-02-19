/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.BZ;
import a.G5;
import a.O_;
import a.SE;
import a.Sz;
import a.a;
import a.bE;
import a.bV;
import a.d8;
import a.fB;
import a.fh;
import a.hY;
import a.hs;
import a.ht;
import a.iE;
import a.yE;
import a.yG;
import a.yM;
import a.yh;
import a.zw;
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

public class fm
extends fh {
    private final hs uE;
    private static final Object[] wb;
    private static final Integer[] sb;
    private static int u9;
    private static final String[] xb;
    private final hY uL;
    private static final Map tb;
    private final bV ux;
    private fB uQ;
    private static final long[] rb;
    private static final long eb;
    private yM uN;
    private final yh uz;
    private boolean uq;
    private final yG uw;
    private final yE uZ;

    public yM o() {
        return this.uN;
    }

    public static int p() {
        int n2 = fm.r();
        try {
            if (n2 == 0) {
                return 104;
            }
        }
        catch (O_ o_2) {
            throw fm.a(o_2);
        }
        return 0;
    }

    private static int e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = fm.e(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public void V(boolean bl2) {
        this.uq = bl2;
    }

    public void u(BZ bZ2) {
        yM yM2 = null;
        for (ht ht2 : this.uw.A()) {
            yM yM3;
            if (!(ht2 instanceof yM) || !(yM3 = (yM)ht2).Q().equals(bZ2)) continue;
            yM2 = yM3;
        }
        try {
            if (yM2 == null) {
                return;
            }
        }
        catch (O_ o_2) {
            throw fm.a(o_2);
        }
        this.uw.J(yM2);
        this.uw.A();
        this.uz.A();
    }

    public yE g() {
        return this.uZ;
    }

    public static void l() {
        fm fm2 = Ao.D(fm.class);
        fm2.uw.k();
        for (BZ bZ2 : SE.h.o().T()) {
            fm2.S(bZ2);
        }
        fm2.uz.A();
    }

    public void Y(fB fB2) {
        this.uQ = fB2;
    }

    public void S(BZ bZ2) {
        this.uw.o(new yM(this, bZ2));
        this.uw.A();
        this.uz.A();
    }

    static hY a(fm fm2) {
        return fm2.uL;
    }

    private static void T() {
        Object[] objectArray = wb;
        wb[0] = "Q$B";
        objectArray[1] = Integer.TYPE;
        fm.xb[1] = "java/lang/Integer";
        objectArray[2] = "4\u001cV?bz?\u0013Gp\u001fb,\u0014N9";
        objectArray[3] = "\u001dJ:Zz~\u0016E+\u0015\u001bp\u001dN/O";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u007fK^%O\u0018~\u0015_IO\u0018\u0019\u0000T'\u0018Xi\u0003S $Y#\bIvK\r)\u0012[I";
    }

    public static void q(int n2) {
        u9 = n2;
    }

    private static Method j(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = fm.i(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = fm.j(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fm" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void P() {
        try {
            if (this.uQ != null) {
                this.N().x();
                Ao.z(this.uQ);
                this.uQ = null;
            }
        }
        catch (O_ o_2) {
            throw fm.a(o_2);
        }
        try {
            if (this.ux.U() != null) {
                SE.h.o().q(this.ux.U());
                this.ux.N(null);
            }
        }
        catch (O_ o_3) {
            throw fm.a(o_3);
        }
    }

    @Override
    public String A() {
        long l10 = eb ^ 0x734F098DCF37L;
        return fm.j("\u00a4", (int)fm.e("f", (int)27036, (long)(0x7E69B63F808239FL ^ l10)), (long)4868420070664629517L, (long)l10);
    }

    private static Field s(long l10, long l11) {
        int n2 = fm.q(l10, l11);
        Object object = wb[n2];
        if (object instanceof String) {
            String string = xb[n2];
            int n3 = string.indexOf(8);
            Class clazz = fm.r(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = fm.r(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fm.i(clazz3, string2, clazz2)) != null) {
                    fm.wb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = fm.j(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        fm.wb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fm.r(264935837318585L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void u(yM yM2) {
        this.uN = yM2;
    }

    static hs h(fm fm2) {
        return fm2.uE;
    }

    private static Field i(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CallSite j(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fm" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public yh F() {
        return this.uz;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                fm.eb = d8.a(3341236608561512817L, 4907500024136928954L, MethodHandles.lookup().lookupClass()).a(73257603017903L);
                fm.wb = new Object[5];
                fm.xb = new String[5];
                fm.T();
                fm.tb = new HashMap<K, V>(13);
                fm.q(0);
                var0 = fm.eb ^ 12774469450994L;
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
                var6_5 = "!Bc\u0092\u008b\u00dc\u00b8\u0088k\u00bev\u0001\u00eb\u00e0\u0093\u00c3=\u00a2\u00c1\u0090'j\u00ca\u001e\u00afvv:;|\u00a6\u00b2\u00dd\u00fd\u00a77\u008e\u00c9^\u0002\u00ac\u0004~(\u0019\u00d7X\u00c4\u001b1\u0015\u00c5>\u00c46\u0013\u00c4j--\u00fa\u00d5\u00e6@";
                var7_6 = "!Bc\u0092\u008b\u00dc\u00b8\u0088k\u00bev\u0001\u00eb\u00e0\u0093\u00c3=\u00a2\u00c1\u0090'j\u00ca\u001e\u00afvv:;|\u00a6\u00b2\u00dd\u00fd\u00a77\u008e\u00c9^\u0002\u00ac\u0004~(\u0019\u00d7X\u00c4\u001b1\u0015\u00c5>\u00c46\u0013\u00c4j--\u00fa\u00d5\u00e6@".length();
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
lbl30:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00887L%!\u00e0\u00cb)\u00a1B\u0081\f\u001e,\u0098#";
                    var7_6 = "\u00887L%!\u00e0\u00cb)\u00a1B\u0081\f\u001e,\u0098#".length();
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
lbl43:
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
lbl56:
                // 1 sources

                ** continue;
            }
        }
        fm.rb = var8_3;
        fm.sb = new Integer[10];
    }

    private static Method i(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    private static int q(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (xb[n5] != null) {
            return n5;
        }
        Object object = wb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 26;
                break;
            }
            case 1: {
                n4 = 28;
                break;
            }
            case 2: {
                n4 = 19;
                break;
            }
            case 3: {
                n4 = 37;
                break;
            }
            case 4: {
                n4 = 44;
                break;
            }
            case 5: {
                n4 = 38;
                break;
            }
            case 6: {
                n4 = 45;
                break;
            }
            case 7: {
                n4 = 48;
                break;
            }
            case 8: {
                n4 = 11;
                break;
            }
            case 9: {
                n4 = 12;
                break;
            }
            case 10: {
                n4 = 42;
                break;
            }
            case 11: {
                n4 = 49;
                break;
            }
            case 12: {
                n4 = 27;
                break;
            }
            case 13: {
                n4 = 59;
                break;
            }
            case 14: {
                n4 = 51;
                break;
            }
            case 15: {
                n4 = 21;
                break;
            }
            case 16: {
                n4 = 62;
                break;
            }
            case 17: {
                n4 = 10;
                break;
            }
            case 18: {
                n4 = 63;
                break;
            }
            case 19: {
                n4 = 54;
                break;
            }
            case 20: {
                n4 = 13;
                break;
            }
            case 21: {
                n4 = 52;
                break;
            }
            case 22: {
                n4 = 57;
                break;
            }
            case 23: {
                n4 = 1;
                break;
            }
            case 24: {
                n4 = 5;
                break;
            }
            case 25: {
                n4 = 2;
                break;
            }
            case 26: {
                n4 = 43;
                break;
            }
            case 27: {
                n4 = 35;
                break;
            }
            case 28: {
                n4 = 34;
                break;
            }
            case 29: {
                n4 = 25;
                break;
            }
            case 30: {
                n4 = 30;
                break;
            }
            case 31: {
                n4 = 20;
                break;
            }
            case 32: {
                n4 = 56;
                break;
            }
            case 33: {
                n4 = 60;
                break;
            }
            case 34: {
                n4 = 53;
                break;
            }
            case 35: {
                n4 = 15;
                break;
            }
            case 36: {
                n4 = 23;
                break;
            }
            case 37: {
                n4 = 3;
                break;
            }
            case 38: {
                n4 = 17;
                break;
            }
            case 39: {
                n4 = 33;
                break;
            }
            case 40: {
                n4 = 41;
                break;
            }
            case 41: {
                n4 = 61;
                break;
            }
            case 42: {
                n4 = 7;
                break;
            }
            case 43: {
                n4 = 4;
                break;
            }
            case 44: {
                n4 = 14;
                break;
            }
            case 45: {
                n4 = 36;
                break;
            }
            case 46: {
                n4 = 55;
                break;
            }
            case 47: {
                n4 = 29;
                break;
            }
            case 48: {
                n4 = 6;
                break;
            }
            case 49: {
                n4 = 9;
                break;
            }
            case 50: {
                n4 = 24;
                break;
            }
            case 51: {
                n4 = 22;
                break;
            }
            case 52: {
                n4 = 58;
                break;
            }
            case 53: {
                n4 = 16;
                break;
            }
            case 54: {
                n4 = 18;
                break;
            }
            case 55: {
                n4 = 50;
                break;
            }
            case 56: {
                n4 = 8;
                break;
            }
            case 57: {
                n4 = 0;
                break;
            }
            case 58: {
                n4 = 32;
                break;
            }
            case 59: {
                n4 = 46;
                break;
            }
            case 60: {
                n4 = 39;
                break;
            }
            case 61: {
                n4 = 47;
                break;
            }
            case 62: {
                n4 = 31;
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
        fm.xb[n5] = new String(cArray);
        return n5;
    }

    public fB R() {
        return this.uQ;
    }

    private static Class r(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = fm.q(l10, l11);
            object = wb[n2];
            try {
                if (!(object instanceof String)) break block2;
                fm.wb[n2] = clazz = Class.forName(xb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public void N() {
        block4: {
            block5: {
                try {
                    try {
                        if (this.uN == null) break block4;
                        if (!this.uN.s()) break block5;
                    }
                    catch (O_ o_2) {
                        throw fm.a(o_2);
                    }
                    this.uN.N();
                }
                catch (O_ o_3) {
                    throw fm.a(o_3);
                }
            }
            return;
        }
        super.N();
    }

    private static Field j(Class clazz, String string, Class clazz2) {
        Field field = fm.i(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = fm.j(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public void V() {
        try {
            super.V();
            if (this.uQ != null) {
                Ao.z(this.uQ);
                this.uQ = null;
            }
        }
        catch (O_ o_2) {
            throw fm.a(o_2);
        }
    }

    private static Method t(long l10, long l11) {
        int n2 = fm.q(l10, l11);
        Object object = wb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = xb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = fm.r(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = fm.r(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fm.i(clazz, string, clazz2, n3, classArray2)) != null) {
                        fm.wb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fm.r(264935837318585L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = fm.j(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        fm.wb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fm.r(264935837318585L, 0L);
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
    public void E() {
        block20: {
            int n2;
            block17: {
                block19: {
                    long l10;
                    block18: {
                        l10 = eb ^ 0x265046C1E19EL;
                        n2 = 0;
                        for (BZ bZ2 : SE.h.o().T()) {
                            try {
                                if (bZ2.T()) {
                                    continue;
                                }
                            }
                            catch (O_ o_2) {
                                throw fm.a(o_2);
                            }
                            ++n2;
                        }
                        try {
                            try {
                                if (this.Q()) break block17;
                                if (n2 <= 0) break block18;
                            }
                            catch (O_ o_3) {
                                throw fm.a(o_3);
                            }
                            this.uE.u((String)((Object)fm.j("\u00a4", (int)fm.e("f", (int)1278, (long)(0x643B136C42156051L ^ l10)), (long)7870409088651543460L, (long)l10)));
                            break block19;
                        }
                        catch (O_ o_4) {
                            throw fm.a(o_4);
                        }
                    }
                    this.uE.u((String)((Object)fm.j("\u00a4", (int)fm.e("f", (int)12518, (long)(0x428AA64B999B5441L ^ l10)), (long)7870409088651543460L, (long)l10)));
                }
                this.uE.N(this.s());
            }
            try {
                for (int i10 = 0; i10 < 5; ++i10) {
                    this.N().z();
                }
            }
            catch (O_ o_5) {
                throw fm.a(o_5);
            }
            try {
                try {
                    try {
                        this.uw.T(110.0);
                        super.E();
                        if (this.Q() || this.N().Q()) break block20;
                    }
                    catch (O_ o_6) {
                        throw fm.a(o_6);
                    }
                    if (n2 <= 0) break block20;
                }
                catch (O_ o_7) {
                    throw fm.a(o_7);
                }
                if (!this.s()) break block20;
            }
            catch (O_ o_8) {
                throw fm.a(o_8);
            }
            G5 g5 = this.L(0.9);
            double d2 = g5.B("" + n2);
            double d3 = g5.D("" + n2);
            g5.R("" + n2, this.G() + this.w() - 5.0 - 32.0 - 3.0 - d3, this.W() + this.N().b() / 2.0 - d2 / 2.0, fm.M.n);
        }
    }

    public fm() {
        long l10 = eb ^ 0x51AD971EAB6FL;
        super(a.cs((int)fm.e("f", (int)20776, (long)(0x7E4AAC6D6E097F77L ^ l10))), a.cs((int)fm.e("f", (int)13614, (long)(0x6DEF630999CA1B77L ^ l10))));
        this.uE = new hs((String)((Object)fm.j("\u00a4", (int)fm.e("f", (int)23718, (long)(0x4234333919B072FEL ^ l10)), (long)2866603423737547093L, (long)l10)), 0.7);
        this.uL = new hY((String)((Object)fm.j("\u00a4", (int)fm.e("f", (int)7205, (long)(0x55C8BD9431A8327FL ^ l10)), (long)2866603423737547093L, (long)l10)), 0.8);
        this.N(false);
        this.T(103.0);
        this.Y(false);
        this.B(true);
        this.N().n(0.5f);
        ht[] htArray = new ht[1];
        this.uZ = new yE(SE.h.F().j);
        htArray[0] = this.uZ;
        this.V(htArray);
        this.V(new yE(SE.h.F().t));
        this.uz = new yh(this.w());
        this.uz.n(new bE(1.0, 5.0), new Object[0]);
        ht[] htArray2 = new ht[1];
        this.ux = new bV(this);
        htArray2[0] = this.ux;
        this.uz.o(htArray2);
        ht[] htArray3 = new ht[1];
        this.uw = new yG(100.0, 125.0);
        htArray3[0] = this.uw;
        this.uz.o(htArray3);
        this.uz.d().f((String)((Object)fm.j("\u00a4", (int)fm.e("f", (int)14964, (long)(0x2ADAEBAD470A9423L ^ l10)), (long)2866603423737547093L, (long)l10)));
        this.uw.i(125.0);
        this.uw.T(110.0);
        this.uw.d().f((String)((Object)fm.j("\u00a4", (int)fm.e("f", (int)6739, (long)(0x551FD5127783B40FL ^ l10)), (long)2866603423737547093L, (long)l10)));
        this.o(this.uz);
        this.uL.N(false);
        this.uL.Y(20.0);
        this.uL.P(14.0);
        this.uE.g((String)((Object)fm.j("\u00a4", (int)fm.e("f", (int)30746, (long)(0x62142F76F994D647L ^ l10)), (long)2866603423737547093L, (long)l10)));
        this.uE.N(new zw(this));
        this.uL.N(new iE(this));
        this.N().A(this.uE);
        this.N().A(this.uL);
    }

    private static MethodHandle e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00e4' || c10 == '\u00f2' || c10 == '\u00cc' || c10 == 'F') {
                field = fm.s(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00e4' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00f2' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00cc' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fm.t(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00c2' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00a4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int e(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x997;
        if (sb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = rb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])tb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    tb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/fm", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fm.sb[n3] = n4;
        }
        return sb[n3];
    }

    public yG w() {
        return this.uw;
    }

    @Override
    public void S(Sz sz2) {
        try {
            if (this.uN != null) {
                this.uN.S(sz2);
                return;
            }
        }
        catch (O_ o_2) {
            throw fm.a(o_2);
        }
        super.S(sz2);
    }

    @Override
    public void d() {
        try {
            super.d();
            this.uw.T(110.0);
            if (this.uQ != null) {
                this.uQ.A();
            }
        }
        catch (O_ o_2) {
            throw fm.a(o_2);
        }
    }

    public boolean Q() {
        return this.uq;
    }

    @Override
    public void y() {
        super.y();
        this.P();
    }

    private static Object e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = fm.e(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static int r() {
        return u9;
    }

    public bV u() {
        return this.ux;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fm.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(fm.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

