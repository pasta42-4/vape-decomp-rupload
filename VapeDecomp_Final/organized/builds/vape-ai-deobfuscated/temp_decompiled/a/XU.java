/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package a;

import a.Aa;
import a.EL;
import a.EP;
import a.F7;
import a.J;
import a.KB;
import a.NY;
import a.OY;
import a.O_;
import a.QF;
import a.Qg;
import a.Qt;
import a.RU;
import a.V8;
import a.VF;
import a.VG;
import a.VS;
import a.Vq;
import a.Vt;
import a.Vx;
import a._2;
import a.a9;
import a.ae;
import a.d8;
import a.eM;
import a.eY;
import a.jU;
import a.jX;
import a.jk;
import a.p5;
import a.p6;
import a.pa;
import a.tO;
import a.tl;
import a.x4;
import a.xi;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.IntConsumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class xu
extends x4<Aa> {
    private double x;
    private int l;
    private double e;
    private static final long v;
    private final Map<Vt, ae> P;
    private final jk A;
    private ae t;
    private static final Map Z;
    private a9 z;
    private double B;
    private double T;
    private Qt N;
    private final eY d;
    private double h;
    private boolean n;
    private final Map<Integer, RU> R;
    private long G;
    private static final String[] fb;
    private static final Integer[] V;
    public final jX o;
    private final Map<Vt, Long> m;
    private double K;
    private static final long[] L;
    private double r;
    private double j;
    private double Y;
    private final jU O;
    private static final Object[] bb;

    @Override
    public void n() {
        eY.R(this::lambda$reset$3);
    }

    public void i() {
        xu xu2;
        block11: {
            boolean bl2;
            long l10;
            block9: {
                String string;
                block10: {
                    l10 = v ^ 0x2AB343A08F19L;
                    string = EL.f();
                    try {
                        try {
                            bl2 = this.a();
                            if (string == null) break block9;
                            if (!bl2) break block10;
                        }
                        catch (O_ o_2) {
                            throw xu.a(o_2);
                        }
                        xu.c("\u00f1", (Object)this, (long)6781094869205621561L, (long)l10);
                        return;
                    }
                    catch (O_ o_3) {
                        throw xu.a(o_3);
                    }
                }
                try {
                    xu.c("\u00f1", (Object)this, (long)6781620851908633932L, (long)l10);
                    xu.c("\u00f1", (Object)this, (long)6781171571791732194L, (long)l10);
                    xu2 = this;
                    if (string == null) break block11;
                    bl2 = xu2.U();
                }
                catch (O_ o_4) {
                    throw xu.a(o_4);
                }
            }
            try {
                if (bl2) {
                    xu.c("\u00f1", (Object)this, (long)6781094869205621561L, (long)l10);
                }
            }
            catch (O_ o_5) {
                throw xu.a(o_5);
            }
            xu2 = this;
        }
        xu2.Y();
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @OY
    public void u(p6 p62) {
        long l10 = v ^ 0x15770F05060DL;
        xu.c("V", (Object)this, (long)-2950098618149811906L, (long)l10);
    }

    private void lambda$onReceivePacket$2(int n2) {
        block4: {
            long l10 = v ^ 0x642154410507L;
            try {
                try {
                    this.R.remove(n2);
                    if (this.N == null || this.N.X() != n2) break block4;
                }
                catch (O_ o_2) {
                    throw xu.a(o_2);
                }
                this.N = null;
                xu.c("\u00f1", (Object)this, (long)-3169118752589999833L, (long)l10);
            }
            catch (O_ o_3) {
                throw xu.a(o_3);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void p() {
        block22: {
            var1_1 = xu.v ^ 42654361856176L;
            var3_2 = EL.f();
            try {
                if (this.t == null) {
                    return;
                }
            }
            catch (O_ v0) {
                throw xu.a(v0);
            }
            var4_3 = 0;
            var5_4 = 1.7976931348623157E308;
            var7_5 = false;
            var8_6 = 0;
            for (Map.Entry<Vt, Long> var10_8 : this.m.entrySet()) {
                block26: {
                    block28: {
                        block27: {
                            block25: {
                                block24: {
                                    block23: {
                                        var11_9 = this.P.get(var10_8.getKey());
                                        try {
                                            try {
                                                try {
                                                    if (var3_2 == null) break block22;
                                                    v1 = var11_9;
                                                    if (var3_2 == null) break block23;
                                                }
                                                catch (O_ v2) {
                                                    throw xu.a(v2);
                                                }
                                                if (v1 != null) {
                                                }
                                                ** GOTO lbl51
                                            }
                                            catch (O_ v3) {
                                                throw xu.a(v3);
                                            }
                                            v1 = xu.c("\u00f1", (Object)this, (long)-453787912190585396L, (long)var1_1);
                                        }
                                        catch (O_ v4) {
                                            throw xu.a(v4);
                                        }
                                    }
                                    var12_10 = ae.d((ae)v1, var11_9);
                                    try {
                                        v5 = var12_10 == var5_4 ? 0 : (var12_10 < var5_4 ? -1 : 1);
                                        if (var3_2 == null) break block24;
                                        if (v5 >= 0) break block25;
                                    }
                                    catch (O_ v6) {
                                        throw xu.a(v6);
                                    }
                                    var5_4 = var12_10;
                                    var4_3 = var8_6;
                                    v5 = (double)true;
                                }
                                var7_5 = v5;
                            }
                            try {
                                try {
                                    if (var3_2 != null) break block26;
lbl51:
                                    // 2 sources

                                    v7 = this.y(var10_8.getKey());
                                    if (var3_2 == null) break block27;
                                }
                                catch (O_ v8) {
                                    throw xu.a(v8);
                                }
                                if (!v7) break block26;
                            }
                            catch (O_ v9) {
                                throw xu.a(v9);
                            }
                            v7 = var7_5;
                        }
                        try {
                            if (var3_2 == null) break block28;
                            if (!v7) break block26;
                        }
                        catch (O_ v10) {
                            throw xu.a(v10);
                        }
                        var4_3 = var8_6;
                        v7 = false;
                    }
                    var7_5 = v7;
                }
                ++var8_6;
                if (var3_2 != null) continue;
            }
            try {
                if (var5_4 < ae.d((ae)xu.c("\u00f1", (Object)this, (long)-453787912190585396L, (long)var1_1), this.t)) {
                    xu.c("\u00f1", (Object)this, (int)var4_3, (long)-454082260448210224L, (long)var1_1);
                }
            }
            catch (O_ v11) {
                throw xu.a(v11);
            }
        }
    }

    private void S(Vt vt2) {
        block4: {
            Object object;
            long l10;
            block5: {
                long l11 = v ^ 0x2E00CD9B239FL;
                long l12 = (long)this.o.l();
                l10 = System.currentTimeMillis() + l12;
                String string = EL.f();
                try {
                    object = this.m;
                    if (string == null) break block4;
                    if (object.isEmpty()) break block5;
                }
                catch (O_ o_2) {
                    throw xu.a(o_2);
                }
                long l13 = (Long)((Map.Entry)this.m.entrySet().toArray()[this.m.size() - 1]).getValue();
                try {
                    if (string == null) break block4;
                    if (l10 >= l13) break block5;
                }
                catch (O_ o_3) {
                    throw xu.a(o_3);
                }
                l10 = l13 + 1L;
            }
            object = this.m.put(vt2, l10);
        }
    }

    private static void d() {
        Object[] objectArray = bb;
        bb[0] = "}Z\u001b%";
        objectArray[1] = Void.TYPE;
        xu.fb[1] = "java/lang/Void";
        objectArray[2] = "|RS\u0001";
        objectArray[3] = "#TR%";
        objectArray[4] = "kt$Q";
        objectArray[5] = Boolean.TYPE;
        xu.fb[5] = "java/lang/Boolean";
        objectArray[6] = "\b#F\u001c";
        objectArray[7] = Integer.TYPE;
        xu.fb[7] = "java/lang/Integer";
        objectArray[8] = "X8]";
        objectArray[9] = "Xn\u000ej-,Sa\u001f%P4@f\u0016l";
        objectArray[10] = "d\u007f1\tL9op F-7d{$\u001c";
        objectArray[11] = "\u0012g\u0019e\\=\u00041\u001f\u001bZ_G5G#\u00054\u0010fN+:";
        objectArray[12] = "J$lACI\\rj?C+_w2V@D\u0012vl?";
        objectArray[13] = "^S8\u0010\u000b\u0016H\u0005>n?tK\u0000f\u0007\b\u001b\u0006\u00018n";
        objectArray[14] = "}Cbu\u0019\u0000k\u0015d\u000b\u0007bh\u0010<b\u001a\r%\u0011b\u000b";
        objectArray[15] = "\u0005\u001aT\u0015V)\u0013LRkyKQKR\u0019[\"\u0011MUQ07R\u0014\u0000\u000e_zSJi";
        objectArray[16] = "\u000b\u000fR6 b\u001dYTH%\u0000[\u0010_\")0R\u0000\u00064F:\u0006_\u0001:=8\u0007Z\tH:>\u0001\u000b\n'w?_b";
        objectArray[17] = "\u001cQzv0\u0014\u001fQ<w\f\u000eZ+{ 7\u0017JB;&0_!\u0015*cm_\u001e\u0013 zqe";
        objectArray[18] = "e_\u0007Xi\u000fs\t\u0001&\u007fm7\f\\\\b\u001d3[\u0003D\u000fVvH^T>\na]Q&";
        objectArray[19] = "~\n\n'%\u000eh\\\fY\"lkYT0&\u0003&X\nY";
        objectArray[20] = "61:\u0001\u001b9 g<\u007f\u001f[#bd\u0016\u00184nc:\u007f";
        Object[] objectArray2 = objectArray;
        objectArray[21] = "`x~2m?v.xLP]2+%6f-6|z.\u000b!7v*)dl6(C";
    }

    @Override
    public void v() {
        long l10 = v ^ 0x560309CF173FL;
        xu.c("V", (Object)this, (long)-4162056561410877428L, (long)l10);
    }

    private void lambda$reset$3() {
        long l10 = v ^ 0xC940722BA8DL;
        xu.c("\u00f1", (Object)this, (long)7750536613322272429L, (long)l10);
        this.R.clear();
        this.N = null;
    }

    private static O_ a(O_ o_2) {
        return o_2;
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

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (fb[n5] != null) {
            return n5;
        }
        Object object = bb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 2;
                break;
            }
            case 1: {
                n4 = 35;
                break;
            }
            case 2: {
                n4 = 58;
                break;
            }
            case 3: {
                n4 = 1;
                break;
            }
            case 4: {
                n4 = 52;
                break;
            }
            case 5: {
                n4 = 11;
                break;
            }
            case 6: {
                n4 = 57;
                break;
            }
            case 7: {
                n4 = 31;
                break;
            }
            case 8: {
                n4 = 46;
                break;
            }
            case 9: {
                n4 = 60;
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
                n4 = 3;
                break;
            }
            case 13: {
                n4 = 63;
                break;
            }
            case 14: {
                n4 = 36;
                break;
            }
            case 15: {
                n4 = 15;
                break;
            }
            case 16: {
                n4 = 41;
                break;
            }
            case 17: {
                n4 = 4;
                break;
            }
            case 18: {
                n4 = 6;
                break;
            }
            case 19: {
                n4 = 10;
                break;
            }
            case 20: {
                n4 = 47;
                break;
            }
            case 21: {
                n4 = 55;
                break;
            }
            case 22: {
                n4 = 27;
                break;
            }
            case 23: {
                n4 = 28;
                break;
            }
            case 24: {
                n4 = 45;
                break;
            }
            case 25: {
                n4 = 44;
                break;
            }
            case 26: {
                n4 = 32;
                break;
            }
            case 27: {
                n4 = 37;
                break;
            }
            case 28: {
                n4 = 43;
                break;
            }
            case 29: {
                n4 = 0;
                break;
            }
            case 30: {
                n4 = 18;
                break;
            }
            case 31: {
                n4 = 25;
                break;
            }
            case 32: {
                n4 = 54;
                break;
            }
            case 33: {
                n4 = 50;
                break;
            }
            case 34: {
                n4 = 34;
                break;
            }
            case 35: {
                n4 = 7;
                break;
            }
            case 36: {
                n4 = 14;
                break;
            }
            case 37: {
                n4 = 39;
                break;
            }
            case 38: {
                n4 = 53;
                break;
            }
            case 39: {
                n4 = 13;
                break;
            }
            case 40: {
                n4 = 20;
                break;
            }
            case 41: {
                n4 = 12;
                break;
            }
            case 42: {
                n4 = 16;
                break;
            }
            case 43: {
                n4 = 23;
                break;
            }
            case 44: {
                n4 = 42;
                break;
            }
            case 45: {
                n4 = 59;
                break;
            }
            case 46: {
                n4 = 29;
                break;
            }
            case 47: {
                n4 = 21;
                break;
            }
            case 48: {
                n4 = 22;
                break;
            }
            case 49: {
                n4 = 56;
                break;
            }
            case 50: {
                n4 = 48;
                break;
            }
            case 51: {
                n4 = 49;
                break;
            }
            case 52: {
                n4 = 62;
                break;
            }
            case 53: {
                n4 = 17;
                break;
            }
            case 54: {
                n4 = 33;
                break;
            }
            case 55: {
                n4 = 8;
                break;
            }
            case 56: {
                n4 = 51;
                break;
            }
            case 57: {
                n4 = 26;
                break;
            }
            case 58: {
                n4 = 19;
                break;
            }
            case 59: {
                n4 = 30;
                break;
            }
            case 60: {
                n4 = 61;
                break;
            }
            case 61: {
                n4 = 40;
                break;
            }
            case 62: {
                n4 = 38;
                break;
            }
            default: {
                n4 = 24;
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
        xu.fb[n5] = new String(cArray);
        return n5;
    }

    private static Field c(long l10, long l11) {
        int n2 = xu.a(l10, l11);
        Object object = bb[n2];
        if (object instanceof String) {
            String string = fb[n2];
            int n3 = string.indexOf(8);
            Class clazz = xu.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = xu.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = xu.a(clazz3, string2, clazz2)) != null) {
                    xu.bb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = xu.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        xu.bb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = xu.b(722253691861091L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @OY(b=F7.HIGHEST)
    public void A(pa pa2) {
        long l10 = v ^ 0x2A67D906F93AL;
        ae ae2 = this.P.remove(pa2.getPacket());
        try {
            if (ae2 != null) {
                this.t = ae2;
            }
        }
        catch (O_ o_2) {
            throw xu.a(o_2);
        }
    }

    private void Z() {
        block8: {
            block9: {
                long l10 = v ^ 0x7311A8F5561L;
                Qg qg2 = EP.U();
                String string = EL.f();
                try {
                    if (string == null) break block8;
                    if (!qg2.r()) break block9;
                }
                catch (O_ o_2) {
                    throw xu.a(o_2);
                }
                VF vF2 = qg2.U();
                try {
                    if (string == null) break block8;
                    if (!vF2.r()) break block9;
                }
                catch (O_ o_3) {
                    throw xu.a(o_3);
                }
                for (Vt vt2 : this.m.keySet()) {
                    try {
                        this.d.Q(vt2, vF2);
                        if (string != null) {
                            if (string != null) continue;
                            break;
                        }
                        break block8;
                    }
                    catch (O_ o_4) {
                        throw xu.a(o_4);
                    }
                }
            }
            this.m.clear();
            this.G = 0L;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                xu.v = d8.a(4908786409938060376L, -9046044465114428378L, MethodHandles.lookup().lookupClass()).a(172086532700869L);
                xu.bb = new Object[22];
                xu.fb = new String[22];
                xu.d();
                xu.Z = new HashMap<K, V>(13);
                var0 = xu.v ^ 106218769532967L;
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
                var6_5 = "w\u0001\u00f9F\u00c0=\u00b7G\u00f5q\u00f4\u00bdZ\n\u0081A\u001d\u00d7\u001f\u009d;`\f\u00d9\u00beg@iX\u0003\u00daQ";
                var7_6 = "w\u0001\u00f9F\u00c0=\u00b7G\u00f5q\u00f4\u00bdZ\n\u0081A\u001d\u00d7\u001f\u009d;`\f\u00d9\u00beg@iX\u0003\u00daQ".length();
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
                    var6_5 = "\u0095\u0000f?A3\u00b1l\u0004\u00f9\u0013f\u00ef\u008dm\u00f2";
                    var7_6 = "\u0095\u0000f?A3\u00b1l\u0004\u00f9\u0013f\u00ef\u008dm\u00f2".length();
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
        xu.L = var8_3;
        xu.V = new Integer[6];
    }

    private void u(p5 p52) {
        block2: {
            try {
                if (!this.O.s().booleanValue() || this.N == null) break block2;
            }
            catch (O_ o_2) {
                throw xu.a(o_2);
            }
            double d2 = tO.b();
            double d3 = tO.S();
            double d4 = tO.n();
            float f10 = EP.K().h();
            double d5 = this.Y + (this.e - this.Y) * (double)f10;
            double d6 = this.B + (this.h - this.B) * (double)f10;
            double d7 = this.T + (this.r - this.T) * (double)f10;
            p52.getEntityRenderer().H(1.0);
            GL11.glBlendFunc((int)770, (int)771);
            tl.N();
            tl.s();
            tl.R();
            tl.R(false);
            GL11.glLineWidth((float)1.5f);
            double d9 = this.N.S().f() - this.N.S().F() + (double)this.N.g();
            double d10 = d9 / 2.0;
            NY.Y();
            NY.x(d5 - d10, d6 + 0.01, d7 - d10, d9, this.N.L(), d9, 1.0, this.A.L().darker().darker(), this.A.L(), d2, d3, d4);
            NY.J();
            tl.R(true);
            tl.B();
            tl.j();
            p52.getEntityRenderer().F(1.0);
        }
    }

    private void Y() {
        try {
            if (this.m.isEmpty()) {
                this.G = 0L;
            }
        }
        catch (O_ o_2) {
            throw xu.a(o_2);
        }
    }

    private boolean a() {
        boolean bl2;
        block7: {
            block6: {
                try {
                    try {
                        try {
                            if (this.m.isEmpty() || this.G <= 0L) break block6;
                        }
                        catch (O_ o_2) {
                            throw xu.a(o_2);
                        }
                        if (System.currentTimeMillis() <= this.G) break block6;
                    }
                    catch (O_ o_3) {
                        throw xu.a(o_3);
                    }
                    bl2 = true;
                    break block7;
                }
                catch (O_ o_4) {
                    throw xu.a(o_4);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public xu(xi xi2, String string) {
        long l10 = v ^ 0x59512AEDCC2CL;
        super(xi2, string);
        this.o = jX.P(this, (String)((Object)xu.c("\u00c4", (int)xu.a("t", (int)3511, (long)(0x442E2CA5EFA99C87L ^ l10)), (long)2101259936775247442L, (long)l10)), (String)((Object)xu.c("\u00c4", (int)xu.a("t", (int)6723, (long)(0x53571EBC9B910B77L ^ l10)), (long)2101259936775247442L, (long)l10)), (String)((Object)xu.c("\u00c4", (int)xu.a("t", (int)27592, (long)(0x1CFF84E51557FAFDL ^ l10)), (long)2101259936775247442L, (long)l10)), 0.0, 50.0, 100.0, 500.0);
        this.O = jU.w(this, (String)((Object)xu.c("\u00c4", (int)xu.a("t", (int)25536, (long)(0x3C99F595374972F6L ^ l10)), (long)2101259936775247442L, (long)l10)), true);
        this.A = jk.M(this, (String)((Object)xu.c("\u00c4", (int)xu.a("t", (int)1282, (long)(0x51179009969C9435L ^ l10)), (long)2101259936775247442L, (long)l10)), new Color(5, 134, 105), 100);
        this.d = eY.P;
        this.m = new LinkedHashMap<Vt, Long>();
        this.R = new HashMap<Integer, RU>();
        this.P = new HashMap<Vt, ae>();
        this.z = _2.R;
        this.O.l(this.A);
        this.N(this.o, this.O, this.A);
    }

    @Override
    public void h() {
        super.h();
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean x(Vt vt2) {
        int n2;
        String string;
        block52: {
            long l10 = v ^ 0xDECEA38F67FL;
            string = EL.f();
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            n2 = vt2.B(eM.PY);
                                                                                                            if (string == null) return n2 != 0;
                                                                                                            if (n2 != 0) return 1 != 0;
                                                                                                        }
                                                                                                        catch (O_ o_2) {
                                                                                                            throw xu.a(o_2);
                                                                                                        }
                                                                                                        n2 = vt2.B(eM.U9);
                                                                                                        if (string == null) return n2 != 0;
                                                                                                    }
                                                                                                    catch (O_ o_3) {
                                                                                                        throw xu.a(o_3);
                                                                                                    }
                                                                                                    if (n2 != 0) return 1 != 0;
                                                                                                }
                                                                                                catch (O_ o_4) {
                                                                                                    throw xu.a(o_4);
                                                                                                }
                                                                                                n2 = vt2.B(eM.ET);
                                                                                                if (string == null) return n2 != 0;
                                                                                            }
                                                                                            catch (O_ o_5) {
                                                                                                throw xu.a(o_5);
                                                                                            }
                                                                                            if (n2 != 0) return 1 != 0;
                                                                                        }
                                                                                        catch (O_ o_6) {
                                                                                            throw xu.a(o_6);
                                                                                        }
                                                                                        n2 = vt2.B(eM.rI);
                                                                                        if (string == null) return n2 != 0;
                                                                                    }
                                                                                    catch (O_ o_7) {
                                                                                        throw xu.a(o_7);
                                                                                    }
                                                                                    if (n2 != 0) return 1 != 0;
                                                                                }
                                                                                catch (O_ o_8) {
                                                                                    throw xu.a(o_8);
                                                                                }
                                                                                n2 = vt2.B(eM.Eb);
                                                                                if (string == null) return n2 != 0;
                                                                            }
                                                                            catch (O_ o_9) {
                                                                                throw xu.a(o_9);
                                                                            }
                                                                            if (n2 != 0) return 1 != 0;
                                                                        }
                                                                        catch (O_ o_10) {
                                                                            throw xu.a(o_10);
                                                                        }
                                                                        n2 = vt2.B(eM.VR);
                                                                        if (string == null) return n2 != 0;
                                                                    }
                                                                    catch (O_ o_11) {
                                                                        throw xu.a(o_11);
                                                                    }
                                                                    if (n2 != 0) return 1 != 0;
                                                                }
                                                                catch (O_ o_12) {
                                                                    throw xu.a(o_12);
                                                                }
                                                                n2 = vt2.B(eM.P5);
                                                                if (string == null) return n2 != 0;
                                                            }
                                                            catch (O_ o_13) {
                                                                throw xu.a(o_13);
                                                            }
                                                            if (n2 != 0) return 1 != 0;
                                                        }
                                                        catch (O_ o_14) {
                                                            throw xu.a(o_14);
                                                        }
                                                        n2 = vt2.B(eM.r5);
                                                        if (string == null) return n2 != 0;
                                                    }
                                                    catch (O_ o_15) {
                                                        throw xu.a(o_15);
                                                    }
                                                    if (n2 != 0) return 1 != 0;
                                                }
                                                catch (O_ o_16) {
                                                    throw xu.a(o_16);
                                                }
                                                n2 = vt2.B(eM.bI);
                                                if (string == null) return n2 != 0;
                                            }
                                            catch (O_ o_17) {
                                                throw xu.a(o_17);
                                            }
                                            if (n2 != 0) return 1 != 0;
                                        }
                                        catch (O_ o_18) {
                                            throw xu.a(o_18);
                                        }
                                        n2 = vt2.B(eM.Yh);
                                        if (string == null) return n2 != 0;
                                    }
                                    catch (O_ o_19) {
                                        throw xu.a(o_19);
                                    }
                                    if (n2 != 0) return 1 != 0;
                                }
                                catch (O_ o_20) {
                                    throw xu.a(o_20);
                                }
                                n2 = vt2.B(eM.VU);
                                if (string == null) return n2 != 0;
                            }
                            catch (O_ o_21) {
                                throw xu.a(o_21);
                            }
                            if (n2 != 0) return 1 != 0;
                        }
                        catch (O_ o_22) {
                            throw xu.a(o_22);
                        }
                        n2 = vt2.B(eM.bh);
                        if (string == null) break block52;
                    }
                    catch (O_ o_23) {
                        throw xu.a(o_23);
                    }
                    if (n2 == 0) return 0 != 0;
                }
                catch (O_ o_24) {
                    throw xu.a(o_24);
                }
                n2 = new VG(vt2).h();
            }
            catch (O_ o_25) {
                throw xu.a(o_25);
            }
        }
        try {
            try {
                if (string == null) return n2 != 0;
                if (n2 == EP.U().X()) return 0 != 0;
                return 1 != 0;
            }
            catch (O_ o_26) {
                throw xu.a(o_26);
            }
        }
        catch (O_ o_27) {
            throw xu.a(o_27);
        }
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = xu.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = xu.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private ae h() {
        Qg qg2 = EP.U();
        return new ae(qg2.F(), qg2.V(), qg2.B());
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = xu.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private void k(Qt qt2, pa pa2) {
        long l10 = v ^ 0x6B267E6BC382L;
        pa2.setCanceled(true);
        xu.c("\u00f1", (Object)this, (Object)pa2.getPacket(), (long)1334806367227254360L, (long)l10);
        this.N = qt2;
        this.G = 0L;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = xu.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = xu.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0xC19;
        if (V[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = L[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])Z.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    Z.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/xu", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            xu.V[n3] = n4;
        }
        return V[n3];
    }

    private boolean U() {
        return this.m.keySet().stream().noneMatch(this::lambda$shouldFlushOnNoRelevantPackets$0);
    }

    private void lambda$onClientTick$1() {
        long l10 = v ^ 0x43AD040B17E7L;
        xu.c("V", (Object)this, (long)-4115562311856656157L, (long)l10);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void A(int n2) {
        long l10 = v ^ 0x54E87EF0F6CBL;
        VF vF2 = EP.y();
        Iterator<Map.Entry<Vt, Long>> iterator = this.m.entrySet().iterator();
        String string = EL.f();
        for (int i10 = 0; iterator.hasNext() && i10 <= n2; ++i10) {
            Map.Entry<Vt, Long> entry = iterator.next();
            this.d.Q(entry.getKey(), vF2);
            iterator.remove();
            if (string != null) continue;
        }
    }

    private boolean lambda$shouldFlushOnNoRelevantPackets$0(Vt vt2) {
        return this.S(vt2);
    }

    private void k(double d2, double d3, double d4) {
        long l10 = v ^ 0x7AFDF687D24EL;
        this.x = d2;
        this.K = d3;
        this.j = d4;
        this.l = (int)xu.a("t", (int)7898, (long)(0x5F7DA888B8729189L ^ l10));
    }

    @OY
    public void K(KB kB2) {
        block9: {
            xu xu2;
            block8: {
                int n2;
                block6: {
                    String string;
                    block7: {
                        long l10 = v ^ 0x1783B97B5F88L;
                        string = EL.f();
                        try {
                            n2 = EP.U().Y();
                            if (string == null) break block6;
                            if (n2 == 0) break block7;
                        }
                        catch (O_ o_2) {
                            throw xu.a(o_2);
                        }
                        return;
                    }
                    try {
                        eY.R(this::lambda$onClientTick$1);
                        this.Y = this.e;
                        this.B = this.h;
                        this.T = this.r;
                        xu2 = this;
                        if (string == null) break block8;
                        n2 = xu2.l;
                    }
                    catch (O_ o_3) {
                        throw xu.a(o_3);
                    }
                }
                try {
                    if (n2 <= 0) break block9;
                    this.e += (this.x - this.e) / (double)this.l;
                    this.h += (this.K - this.h) / (double)this.l;
                    this.r += (this.j - this.r) / (double)this.l;
                    xu2 = this;
                }
                catch (O_ o_4) {
                    throw xu.a(o_4);
                }
            }
            --xu2.l;
        }
    }

    private boolean y(Vt vt2) {
        boolean bl2;
        block5: {
            block4: {
                try {
                    try {
                        if (!vt2.B(eM.rD) && !vt2.B(eM.Fg)) break block4;
                    }
                    catch (O_ o_2) {
                        throw xu.a(o_2);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (O_ o_3) {
                    throw xu.a(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    @OY
    public void q(p5 p52) {
        block4: {
            try {
                try {
                    if (!this.O.s().booleanValue() || this.N == null) break block4;
                }
                catch (O_ o_2) {
                    throw xu.a(o_2);
                }
                this.u(p52);
            }
            catch (O_ o_3) {
                throw xu.a(o_3);
            }
        }
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = xu.a(l10, l11);
            object = bb[n2];
            try {
                if (!(object instanceof String)) break block2;
                xu.bb[n2] = clazz = Class.forName(fb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private boolean S(Vt vt2) {
        boolean bl2;
        block10: {
            block9: {
                try {
                    block8: {
                        try {
                            try {
                                try {
                                    if (vt2.B(eM.b) || vt2.B(eM.YS)) break block8;
                                }
                                catch (O_ o_2) {
                                    throw xu.a(o_2);
                                }
                                if (vt2.B(eM.bm)) break block8;
                            }
                            catch (O_ o_3) {
                                throw xu.a(o_3);
                            }
                            if (!this.y(vt2)) break block9;
                        }
                        catch (O_ o_4) {
                            throw xu.a(o_4);
                        }
                    }
                    bl2 = true;
                    break block10;
                }
                catch (O_ o_5) {
                    throw xu.a(o_5);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = xu.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method d(long l10, long l11) {
        int n2 = xu.a(l10, l11);
        Object object = bb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = fb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = xu.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = xu.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = xu.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        xu.bb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = xu.b(722253691861091L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = xu.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        xu.bb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = xu.b(722253691861091L, 0L);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'p' || c10 == 'L' || c10 == '\u00e0' || c10 == '\u00aa') {
                field = xu.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'p' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'L' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00e0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = xu.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'V' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00c4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @OY(b=F7.LOW)
    public void z(pa var1_1) {
        block218: {
            block219: {
                block215: {
                    block217: {
                        block216: {
                            block214: {
                                block210: {
                                    block212: {
                                        block213: {
                                            block211: {
                                                block197: {
                                                    block209: {
                                                        block207: {
                                                            block206: {
                                                                block205: {
                                                                    block203: {
                                                                        block204: {
                                                                            block198: {
                                                                                block201: {
                                                                                    block202: {
                                                                                        block199: {
                                                                                            block200: {
                                                                                                block196: {
                                                                                                    block194: {
                                                                                                        block195: {
                                                                                                            block192: {
                                                                                                                block193: {
                                                                                                                    block190: {
                                                                                                                        block191: {
                                                                                                                            block223: {
                                                                                                                                block189: {
                                                                                                                                    block188: {
                                                                                                                                        block181: {
                                                                                                                                            block187: {
                                                                                                                                                block186: {
                                                                                                                                                    block182: {
                                                                                                                                                        block185: {
                                                                                                                                                            block183: {
                                                                                                                                                                block176: {
                                                                                                                                                                    block180: {
                                                                                                                                                                        block179: {
                                                                                                                                                                            block178: {
                                                                                                                                                                                block177: {
                                                                                                                                                                                    block222: {
                                                                                                                                                                                        block175: {
                                                                                                                                                                                            block174: {
                                                                                                                                                                                                block172: {
                                                                                                                                                                                                    block173: {
                                                                                                                                                                                                        block171: {
                                                                                                                                                                                                            block221: {
                                                                                                                                                                                                                block169: {
                                                                                                                                                                                                                    block170: {
                                                                                                                                                                                                                        block168: {
                                                                                                                                                                                                                            block167: {
                                                                                                                                                                                                                                block166: {
                                                                                                                                                                                                                                    block220: {
                                                                                                                                                                                                                                        block165: {
                                                                                                                                                                                                                                            block164: {
                                                                                                                                                                                                                                                var2_2 = xu.v ^ 7533954004148L;
                                                                                                                                                                                                                                                var4_3 = EL.f();
                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                            v0 = var1_1.getWorld().Y();
                                                                                                                                                                                                                                                            if (var4_3 == null) break block164;
                                                                                                                                                                                                                                                            if (v0) break block165;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        catch (O_ v1) {
                                                                                                                                                                                                                                                            throw xu.a(v1);
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        v2 = var1_1;
                                                                                                                                                                                                                                                        if (var4_3 == null) break block166;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    catch (O_ v3) {
                                                                                                                                                                                                                                                        throw xu.a(v3);
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    v0 = v2.getThePlayer().Y();
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                catch (O_ v4) {
                                                                                                                                                                                                                                                    throw xu.a(v4);
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            if (!v0) break block220;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        return;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    v2 = var1_1;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                var5_4 = v2.getPacket();
                                                                                                                                                                                                                                var8_5 = xu.c("\u00f1", (Object)this, (long)2717907382699248072L, (long)var2_2);
                                                                                                                                                                                                                                var9_6 = null;
                                                                                                                                                                                                                                var10_7 = null;
                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                        v5 = var5_4.B(eM.b);
                                                                                                                                                                                                                                        if (var4_3 == null) break block167;
                                                                                                                                                                                                                                        if (v5) break block168;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    catch (O_ v6) {
                                                                                                                                                                                                                                        throw xu.a(v6);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    v5 = var5_4.B(eM.YS);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                catch (O_ v7) {
                                                                                                                                                                                                                                    throw xu.a(v7);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            if (!v5) break block172;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        var11_8 = null;
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            v8 = var5_4.B(eM.b);
                                                                                                                                                                                                                            if (var4_3 == null) break block169;
                                                                                                                                                                                                                            if (!v8) break block170;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        catch (O_ v9) {
                                                                                                                                                                                                                            throw xu.a(v9);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        var12_9 = new Vq(var5_4);
                                                                                                                                                                                                                        var11_8 = var12_9.c(var1_1.getWorld());
                                                                                                                                                                                                                        break block221;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    v8 = var5_4.B(eM.YS);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (v8) {
                                                                                                                                                                                                                    var12_9 = new V8(var5_4);
                                                                                                                                                                                                                    var11_8 = var1_1.getWorld().I(var12_9.K());
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                v10 = var11_8;
                                                                                                                                                                                                                if (var4_3 == null) break block171;
                                                                                                                                                                                                                if (v10 == null) break block172;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            catch (O_ v11) {
                                                                                                                                                                                                                throw xu.a(v11);
                                                                                                                                                                                                            }
                                                                                                                                                                                                            v10 = var11_8;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                if (var4_3 == null) break block173;
                                                                                                                                                                                                                if (!v10.B(eM.Ut)) break block172;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            catch (O_ v12) {
                                                                                                                                                                                                                throw xu.a(v12);
                                                                                                                                                                                                            }
                                                                                                                                                                                                            v10 = this.R.get(var11_8.X());
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (O_ v13) {
                                                                                                                                                                                                            throw xu.a(v13);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    var10_7 = (RU)v10;
                                                                                                                                                                                                    if (var11_8.X() == J.H.x()) {
                                                                                                                                                                                                        var9_6 = new Qt(var11_8);
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                                try {
                                                                                                                                                                                                    v14 = var10_7;
                                                                                                                                                                                                    if (var4_3 == null) break block174;
                                                                                                                                                                                                    if (v14 == null) break block175;
                                                                                                                                                                                                }
                                                                                                                                                                                                catch (O_ v15) {
                                                                                                                                                                                                    throw xu.a(v15);
                                                                                                                                                                                                }
                                                                                                                                                                                                v14 = var10_7;
                                                                                                                                                                                            }
                                                                                                                                                                                            v16 = v14.P();
                                                                                                                                                                                            break block222;
                                                                                                                                                                                        }
                                                                                                                                                                                        v16 = null;
                                                                                                                                                                                    }
                                                                                                                                                                                    var7_13 = v16;
                                                                                                                                                                                    try {
                                                                                                                                                                                        v17 = var5_4.B(eM.b);
                                                                                                                                                                                        if (var4_3 == null) break block176;
                                                                                                                                                                                        if (v17) {
                                                                                                                                                                                        }
                                                                                                                                                                                        ** GOTO lbl147
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (O_ v18) {
                                                                                                                                                                                        throw xu.a(v18);
                                                                                                                                                                                    }
                                                                                                                                                                                    var11_8 = new Vq(var5_4);
                                                                                                                                                                                    try {
                                                                                                                                                                                        v19 = var10_7;
                                                                                                                                                                                        if (var4_3 == null) break block177;
                                                                                                                                                                                        if (v19 == null) break block178;
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (O_ v20) {
                                                                                                                                                                                        throw xu.a(v20);
                                                                                                                                                                                    }
                                                                                                                                                                                    v19 = var10_7;
                                                                                                                                                                                }
                                                                                                                                                                                v19.S((Vq)var11_8);
                                                                                                                                                                                if (var4_3 != null) break block180;
                                                                                                                                                                            }
                                                                                                                                                                            var12_9 = var11_8.c(var1_1.getWorld());
                                                                                                                                                                            try {
                                                                                                                                                                                try {
                                                                                                                                                                                    v21 = var12_9;
                                                                                                                                                                                    if (var4_3 == null) break block179;
                                                                                                                                                                                    if (!v21.r()) break block180;
                                                                                                                                                                                }
                                                                                                                                                                                catch (O_ v22) {
                                                                                                                                                                                    throw xu.a(v22);
                                                                                                                                                                                }
                                                                                                                                                                                v21 = var12_9;
                                                                                                                                                                            }
                                                                                                                                                                            catch (O_ v23) {
                                                                                                                                                                                throw xu.a(v23);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        var13_14 = RU.d((QF)v21);
                                                                                                                                                                        var13_14.S((Vq)var11_8);
                                                                                                                                                                        this.R.put(var12_9.X(), var13_14);
                                                                                                                                                                    }
                                                                                                                                                                    try {
                                                                                                                                                                        if (var4_3 != null) break block181;
lbl147:
                                                                                                                                                                        // 2 sources

                                                                                                                                                                        v17 = var5_4.B(eM.YS);
                                                                                                                                                                    }
                                                                                                                                                                    catch (O_ v24) {
                                                                                                                                                                        throw xu.a(v24);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                try {
                                                                                                                                                                    if (var4_3 == null) break block182;
                                                                                                                                                                    if (v17) {
                                                                                                                                                                    }
                                                                                                                                                                    ** GOTO lbl186
                                                                                                                                                                }
                                                                                                                                                                catch (O_ v25) {
                                                                                                                                                                    throw xu.a(v25);
                                                                                                                                                                }
                                                                                                                                                                var11_8 = new V8(var5_4);
                                                                                                                                                                try {
                                                                                                                                                                    block184: {
                                                                                                                                                                        try {
                                                                                                                                                                            try {
                                                                                                                                                                                v26 = var10_7;
                                                                                                                                                                                if (var4_3 == null) break block183;
                                                                                                                                                                                if (v26 == null) break block184;
                                                                                                                                                                            }
                                                                                                                                                                            catch (O_ v27) {
                                                                                                                                                                                throw xu.a(v27);
                                                                                                                                                                            }
                                                                                                                                                                            var10_7.B((V8)var11_8);
                                                                                                                                                                            if (var4_3 != null) break block185;
                                                                                                                                                                        }
                                                                                                                                                                        catch (O_ v28) {
                                                                                                                                                                            throw xu.a(v28);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    v26 = new RU(var11_8.I(), var11_8.S(), var11_8.d());
                                                                                                                                                                }
                                                                                                                                                                catch (O_ v29) {
                                                                                                                                                                    throw xu.a(v29);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            var12_9 = v26;
                                                                                                                                                            this.R.put(var11_8.K(), (RU)var12_9);
                                                                                                                                                        }
                                                                                                                                                        try {
                                                                                                                                                            if (var4_3 != null) break block181;
lbl186:
                                                                                                                                                            // 2 sources

                                                                                                                                                            v17 = var5_4.B(eM.bm);
                                                                                                                                                        }
                                                                                                                                                        catch (O_ v30) {
                                                                                                                                                            throw xu.a(v30);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        if (var4_3 == null) break block186;
                                                                                                                                                        if (v17) {
                                                                                                                                                        }
                                                                                                                                                        ** GOTO lbl203
                                                                                                                                                    }
                                                                                                                                                    catch (O_ v31) {
                                                                                                                                                        throw xu.a(v31);
                                                                                                                                                    }
                                                                                                                                                    var11_8 = new Vx(var5_4);
                                                                                                                                                    try {
                                                                                                                                                        this.R.put(var11_8.D(), new RU(var11_8.X(), var11_8.Q(), var11_8.Z()));
                                                                                                                                                        if (var4_3 != null) break block181;
lbl203:
                                                                                                                                                        // 2 sources

                                                                                                                                                        v17 = var5_4.B(eM.rT);
                                                                                                                                                    }
                                                                                                                                                    catch (O_ v32) {
                                                                                                                                                        throw xu.a(v32);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                try {
                                                                                                                                                    if (var4_3 == null) break block187;
                                                                                                                                                    if (v17) {
                                                                                                                                                    }
                                                                                                                                                    ** GOTO lbl219
                                                                                                                                                }
                                                                                                                                                catch (O_ v33) {
                                                                                                                                                    throw xu.a(v33);
                                                                                                                                                }
                                                                                                                                                var11_8 = new VS(var5_4);
                                                                                                                                                try {
                                                                                                                                                    Arrays.stream(var11_8.F()).forEach((IntConsumer)LambdaMetafactory.metafactory(null, null, null, (I)V, lambda$onReceivePacket$2(int ), (I)V)((xu)this));
                                                                                                                                                    if (var4_3 != null) break block181;
lbl219:
                                                                                                                                                    // 2 sources

                                                                                                                                                    v17 = var5_4.B(eM.rE);
                                                                                                                                                }
                                                                                                                                                catch (O_ v34) {
                                                                                                                                                    throw xu.a(v34);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            try {
                                                                                                                                                if (v17) {
                                                                                                                                                    this.N = null;
                                                                                                                                                    this.m.clear();
                                                                                                                                                    this.R.clear();
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            catch (O_ v35) {
                                                                                                                                                throw xu.a(v35);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            v36 = var10_7;
                                                                                                                                            if (var4_3 == null) break block188;
                                                                                                                                            if (v36 == null) break block189;
                                                                                                                                        }
                                                                                                                                        catch (O_ v37) {
                                                                                                                                            throw xu.a(v37);
                                                                                                                                        }
                                                                                                                                        v36 = var10_7;
                                                                                                                                    }
                                                                                                                                    v38 = v36.P();
                                                                                                                                    break block223;
                                                                                                                                }
                                                                                                                                v38 = null;
                                                                                                                            }
                                                                                                                            var6_15 = v38;
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        if (var6_15 == null) break block190;
                                                                                                                                        v39 = var9_6;
                                                                                                                                        if (var4_3 == null) break block191;
                                                                                                                                    }
                                                                                                                                    catch (O_ v40) {
                                                                                                                                        throw xu.a(v40);
                                                                                                                                    }
                                                                                                                                    if (v39 == null) break block190;
                                                                                                                                }
                                                                                                                                catch (O_ v41) {
                                                                                                                                    throw xu.a(v41);
                                                                                                                                }
                                                                                                                                v39 = this.P.put(var5_4, var6_15);
                                                                                                                            }
                                                                                                                            catch (O_ v42) {
                                                                                                                                throw xu.a(v42);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        this.k(var6_15.h(), var6_15.i(), var6_15.I());
                                                                                                                        this.N = var9_6;
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            v43 /* !! */  = this.z.A();
                                                                                                                            if (var4_3 == null) break block192;
                                                                                                                            if (!v43 /* !! */ ) break block193;
                                                                                                                        }
                                                                                                                        catch (O_ v44) {
                                                                                                                            throw xu.a(v44);
                                                                                                                        }
                                                                                                                        xu.c("\u00f1", (Object)this, (long)2717471242260045972L, (long)var2_2);
                                                                                                                        return;
                                                                                                                    }
                                                                                                                    catch (O_ v45) {
                                                                                                                        throw xu.a(v45);
                                                                                                                    }
                                                                                                                }
                                                                                                                v43 /* !! */  = this.d.n(var5_4);
                                                                                                            }
                                                                                                            try {
                                                                                                                if (var4_3 == null) break block194;
                                                                                                                if (!v43 /* !! */ ) break block195;
                                                                                                            }
                                                                                                            catch (O_ v46) {
                                                                                                                throw xu.a(v46);
                                                                                                            }
                                                                                                            return;
                                                                                                        }
                                                                                                        v43 /* !! */  = this.m.isEmpty();
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (var4_3 == null) break block196;
                                                                                                            if (v43 /* !! */ ) break block197;
                                                                                                        }
                                                                                                        catch (O_ v47) {
                                                                                                            throw xu.a(v47);
                                                                                                        }
                                                                                                        v43 /* !! */  = xu.c("\u00f1", (Object)this, (Object)var5_4, (long)2716158627737713978L, (long)var2_2);
                                                                                                    }
                                                                                                    catch (O_ v48) {
                                                                                                        throw xu.a(v48);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    if (v43 /* !! */ ) break block197;
                                                                                                                    if (var6_15 == null) break block198;
                                                                                                                }
                                                                                                                catch (O_ v49) {
                                                                                                                    throw xu.a(v49);
                                                                                                                }
                                                                                                                if (var9_6 == null) break block198;
                                                                                                            }
                                                                                                            catch (O_ v50) {
                                                                                                                throw xu.a(v50);
                                                                                                            }
                                                                                                            v51 = this.t;
                                                                                                            if (var4_3 == null) break block199;
                                                                                                        }
                                                                                                        catch (O_ v52) {
                                                                                                            throw xu.a(v52);
                                                                                                        }
                                                                                                        if (v51 == null) break block200;
                                                                                                    }
                                                                                                    catch (O_ v53) {
                                                                                                        throw xu.a(v53);
                                                                                                    }
                                                                                                    v51 = this.t;
                                                                                                    break block199;
                                                                                                }
                                                                                                catch (O_ v54) {
                                                                                                    throw xu.a(v54);
                                                                                                }
                                                                                            }
                                                                                            v51 = var7_13;
                                                                                        }
                                                                                        var11_8 = v51;
                                                                                        var12_10 = ae.d((ae)var8_5, (ae)var11_8);
                                                                                        var14_16 = ae.d((ae)var8_5, var6_15);
                                                                                        try {
                                                                                            try {
                                                                                                if (var4_3 == null) break block201;
                                                                                                if (!(var12_10 + 0.001 < var14_16)) break block202;
                                                                                                break block198;
                                                                                            }
                                                                                            catch (O_ v55) {
                                                                                                throw xu.a(v55);
                                                                                            }
                                                                                        }
                                                                                        catch (O_ v56) {
                                                                                            throw xu.a(v56);
                                                                                        }
                                                                                    }
                                                                                    xu.c("\u00f1", (Object)this, (long)2717471242260045972L, (long)var2_2);
                                                                                }
                                                                                return;
                                                                            }
                                                                            try {
                                                                                v57 = var5_4.B(eM.bh);
                                                                                if (var4_3 == null) break block203;
                                                                                if (v57 == 0) break block204;
                                                                            }
                                                                            catch (O_ v58) {
                                                                                throw xu.a(v58);
                                                                            }
                                                                            var11_8 = new VG(var5_4);
                                                                            try {
                                                                                try {
                                                                                    v57 = var11_8.h();
                                                                                    if (var4_3 == null) break block203;
                                                                                    if (v57 != EP.U().X()) break block204;
                                                                                }
                                                                                catch (O_ v59) {
                                                                                    throw xu.a(v59);
                                                                                }
                                                                                xu.c("\u00f1", (Object)this, (long)2717471242260045972L, (long)var2_2);
                                                                                return;
                                                                            }
                                                                            catch (O_ v60) {
                                                                                throw xu.a(v60);
                                                                            }
                                                                        }
                                                                        v57 = var5_4.B(eM.UV);
                                                                    }
                                                                    try {
                                                                        if (v57 != 0) {
                                                                            xu.c("\u00f1", (Object)this, (long)2717471242260045972L, (long)var2_2);
                                                                            return;
                                                                        }
                                                                    }
                                                                    catch (O_ v61) {
                                                                        throw xu.a(v61);
                                                                    }
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (var6_15 == null || var9_6 == null) break block205;
                                                                                    }
                                                                                    catch (O_ v62) {
                                                                                        throw xu.a(v62);
                                                                                    }
                                                                                    v63 = this;
                                                                                    if (var4_3 == null) break block206;
                                                                                }
                                                                                catch (O_ v64) {
                                                                                    throw xu.a(v64);
                                                                                }
                                                                                if (v63.t == null) break block205;
                                                                            }
                                                                            catch (O_ v65) {
                                                                                throw xu.a(v65);
                                                                            }
                                                                            cfr_temp_0 = var6_15.X(this.t) - 6.0;
                                                                            v66 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                                                            if (var4_3 == null) break block207;
                                                                        }
                                                                        catch (O_ v67) {
                                                                            throw xu.a(v67);
                                                                        }
                                                                        if (v66 <= 0) break block205;
                                                                    }
                                                                    catch (O_ v68) {
                                                                        throw xu.a(v68);
                                                                    }
                                                                    var11_8 = this.m.entrySet().iterator();
                                                                    while (var11_8.hasNext()) {
                                                                        var12_11 = var11_8.next();
                                                                        try {
                                                                            block208: {
                                                                                try {
                                                                                    try {
                                                                                        this.d.Q(var12_11.getKey(), var1_1.getNetHandler());
                                                                                        var11_8.remove();
                                                                                        cfr_temp_1 = var6_15.X(this.t) - 6.0;
                                                                                        v66 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                                                                                        if (var4_3 == null) break block207;
                                                                                        if (v66 > 0) break block208;
                                                                                    }
                                                                                    catch (O_ v69) {
                                                                                        throw xu.a(v69);
                                                                                    }
                                                                                    if (var4_3 != null) break;
                                                                                }
                                                                                catch (O_ v70) {
                                                                                    throw xu.a(v70);
                                                                                }
                                                                            }
                                                                            if (var4_3 != null) continue;
                                                                            break;
                                                                        }
                                                                        catch (O_ v71) {
                                                                            throw xu.a(v71);
                                                                        }
                                                                    }
                                                                }
                                                                v63 = this;
                                                            }
                                                            try {
                                                                if (var4_3 == null) break block209;
                                                                cfr_temp_2 = v63.G - 0L;
                                                                v66 = cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1);
                                                            }
                                                            catch (O_ v72) {
                                                                throw xu.a(v72);
                                                            }
                                                        }
                                                        try {
                                                            if (v66 != false) break block197;
                                                            var1_1.setCanceled(true);
                                                            v63 = this;
                                                        }
                                                        catch (O_ v73) {
                                                            throw xu.a(v73);
                                                        }
                                                    }
                                                    xu.c("\u00f1", (Object)v63, (Object)var5_4, (long)2715743890367816046L, (long)var2_2);
                                                    return;
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            if (var9_6 == null) break block210;
                                                            v74 = var6_15;
                                                            if (var4_3 == null) break block211;
                                                        }
                                                        catch (O_ v75) {
                                                            throw xu.a(v75);
                                                        }
                                                        if (v74 == null) break block210;
                                                    }
                                                    catch (O_ v76) {
                                                        throw xu.a(v76);
                                                    }
                                                    v74 = this.t;
                                                }
                                                catch (O_ v77) {
                                                    throw xu.a(v77);
                                                }
                                            }
                                            try {
                                                try {
                                                    if (var4_3 == null) break block212;
                                                    if (v74 == null) break block213;
                                                }
                                                catch (O_ v78) {
                                                    throw xu.a(v78);
                                                }
                                                v74 = this.t;
                                                break block212;
                                            }
                                            catch (O_ v79) {
                                                throw xu.a(v79);
                                            }
                                        }
                                        v74 = var7_13;
                                    }
                                    var11_8 = v74;
                                    var12_12 = ae.d((ae)var8_5, (ae)var11_8);
                                    var14_16 = ae.d((ae)var8_5, var6_15);
                                    try {
                                        try {
                                            cfr_temp_3 = var12_12 + 0.001 - var14_16;
                                            v80 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                                            if (var4_3 == null) break block214;
                                            if (v80 >= 0) break block210;
                                        }
                                        catch (O_ v81) {
                                            throw xu.a(v81);
                                        }
                                        xu.c("\u00f1", (Object)this, (Object)var9_6, (Object)var1_1, (long)2716010703875918626L, (long)var2_2);
                                        return;
                                    }
                                    catch (O_ v82) {
                                        throw xu.a(v82);
                                    }
                                }
                                v80 = (cfr_temp_4 = this.G - 0L) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1);
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (var4_3 == null) break block215;
                                                if (v80 > 0) {
                                                }
                                                ** GOTO lbl560
                                            }
                                            catch (O_ v83) {
                                                throw xu.a(v83);
                                            }
                                            cfr_temp_5 = System.currentTimeMillis() - this.G;
                                            v84 /* !! */  = cfr_temp_5 == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1);
                                            if (var4_3 == null) break block216;
                                        }
                                        catch (O_ v85) {
                                            throw xu.a(v85);
                                        }
                                        if (v84 /* !! */  < 0) {
                                        }
                                        ** GOTO lbl555
                                    }
                                    catch (O_ v86) {
                                        throw xu.a(v86);
                                    }
                                    v87 = this;
                                    v88 = var5_4;
                                    if (var4_3 == null) break block217;
                                }
                                catch (O_ v89) {
                                    throw xu.a(v89);
                                }
                                v84 /* !! */  = (long)xu.c("\u00f1", (Object)v87, (Object)v88, (long)2716158627737713978L, (long)var2_2);
                            }
                            catch (O_ v90) {
                                throw xu.a(v90);
                            }
                        }
                        try {
                            if (v84 /* !! */  != false) break block218;
                            var1_1.setCanceled(true);
                            v87 = this;
                            v88 = var5_4;
                        }
                        catch (O_ v91) {
                            throw xu.a(v91);
                        }
                    }
                    try {
                        try {
                            try {
                                xu.c("\u00f1", (Object)v87, (Object)v88, (long)2715743890367816046L, (long)var2_2);
                                if (var4_3 != null) break block218;
lbl555:
                                // 2 sources

                                xu.c("\u00f1", (Object)this, (long)2717471242260045972L, (long)var2_2);
                                if (var4_3 != null) break block218;
                            }
                            catch (O_ v92) {
                                throw xu.a(v92);
                            }
lbl560:
                            // 2 sources

                            v93 = this;
                            v94 = var5_4;
                            if (var4_3 == null) break block219;
                        }
                        catch (O_ v95) {
                            throw xu.a(v95);
                        }
                        v80 = (long)v93.y(v94);
                    }
                    catch (O_ v96) {
                        throw xu.a(v96);
                    }
                }
                try {
                    if (v80 == false) break block218;
                    var1_1.setCanceled(true);
                    v93 = this;
                    v94 = var5_4;
                }
                catch (O_ v97) {
                    throw xu.a(v97);
                }
            }
            xu.c("\u00f1", (Object)v93, (Object)v94, (long)2715743890367816046L, (long)var2_2);
            this.G = System.currentTimeMillis() + 25L;
        }
    }

    private void j() {
        block7: {
            int n2;
            long l10 = v ^ 0x223FA5D39829L;
            VF vF2 = EP.y();
            ArrayList<Vt> arrayList = new ArrayList<Vt>();
            Iterator<Map.Entry<Vt, Long>> iterator = this.m.entrySet().iterator();
            String string = EL.f();
            while (iterator.hasNext()) {
                block8: {
                    Map.Entry<Vt, Long> entry = iterator.next();
                    try {
                        try {
                            try {
                                long l11 = System.currentTimeMillis() - entry.getValue();
                                n2 = l11 == 0L ? 0 : (l11 < 0L ? -1 : 1);
                                if (string == null) break block7;
                                if (string == null) break block8;
                            }
                            catch (O_ o_2) {
                                throw xu.a(o_2);
                            }
                            if (n2 < 0) break block8;
                        }
                        catch (O_ o_3) {
                            throw xu.a(o_3);
                        }
                        this.d.Q(entry.getKey(), vF2);
                        arrayList.add(entry.getKey());
                    }
                    catch (O_ o_4) {
                        throw xu.a(o_4);
                    }
                }
                if (string != null) continue;
            }
            n2 = this.m.keySet().removeAll(arrayList);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(xu.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(xu.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

