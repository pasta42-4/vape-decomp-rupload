/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.EP;
import a.F7;
import a.Fo;
import a.KB;
import a.KN;
import a.OY;
import a.O_;
import a.Oq;
import a.Q0;
import a.Qg;
import a.V0;
import a.V9;
import a.VG;
import a.VH;
import a.VP;
import a.Ve;
import a.Vf;
import a.Vg;
import a.Vm;
import a.Vt;
import a.XO;
import a._2;
import a.a;
import a.aB;
import a.d8;
import a.eM;
import a.jU;
import a.js;
import a.kX;
import a.oQ;
import a.pN;
import a.pa;
import a.rT;
import a.s0;
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

public class jp
extends xi {
    private final js t;
    private Object v;
    private final aB r;
    private float b;
    private final jU O;
    private float x;
    private boolean P;
    private final jU d;
    private static final long[] j;
    private Q0 n;
    private int l;
    private static final Object[] A;
    private double T;
    private static final String[] B;
    private int X;
    private final js Y;
    private static final Integer[] o;
    private static final Map z;
    private double R;
    private final jU e;
    private boolean V;
    private Ve m;
    private double w;
    private static final long h;

    @OY
    public void q(KB kB2) {
        block13: {
            try {
                block12: {
                    try {
                        try {
                            if (EP.c().Y() || EP.U().Y()) break block12;
                        }
                        catch (O_ o_2) {
                            throw jp.a(o_2);
                        }
                        if (!(EP.U().e() <= 0.0f)) break block13;
                    }
                    catch (O_ o_3) {
                        throw jp.a(o_3);
                    }
                }
                super.y(false, false);
            }
            catch (O_ o_4) {
                throw jp.a(o_4);
            }
        }
        try {
            if (this.P) {
                this.q();
                return;
            }
        }
        catch (O_ o_5) {
            throw jp.a(o_5);
        }
        try {
            this.r.d(this);
            if (this.V) {
                this.k();
                this.V = false;
            }
        }
        catch (O_ o_6) {
            throw jp.a(o_6);
        }
        this.A();
    }

    @OY(b=F7.LOWEST)
    public void t(pN pN2) {
        block16: {
            try {
                if (this.n == null) {
                    return;
                }
            }
            catch (O_ o_2) {
                throw jp.a(o_2);
            }
            try {
                try {
                    if (this.v == null || !pN2.getPacketInstance().equals(this.v)) break block16;
                }
                catch (O_ o_3) {
                    throw jp.a(o_3);
                }
                this.v = null;
                return;
            }
            catch (O_ o_4) {
                throw jp.a(o_4);
            }
        }
        try {
            if (EP.c().Y()) {
                return;
            }
        }
        catch (O_ o_5) {
            throw jp.a(o_5);
        }
        try {
            if (this.J(pN2.getPacket())) {
                pN2.setCanceled(true);
                return;
            }
        }
        catch (O_ o_6) {
            throw jp.a(o_6);
        }
        try {
            if (!pN2.getPacket().B(eM.L)) {
                return;
            }
        }
        catch (O_ o_7) {
            throw jp.a(o_7);
        }
        pN2.setPacket(this.t());
        EP.U().a(this.X);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = jp.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private VH E() {
        try {
            if (kX.C() == 13) {
                return VH.h(this.n.G(), -999.0, -999.0, this.n.o(), this.n.q(), this.n.S(), this.n.j());
            }
        }
        catch (O_ o_2) {
            throw jp.a(o_2);
        }
        return VH.g(this.n.G(), -999.0, this.n.o(), this.n.q(), this.n.S(), this.n.j());
    }

    public jp() {
        long l10 = h ^ 0x4D1EB3D2CF9FL;
        super(a.cs((int)jp.a("r", (int)31729, (long)(0x777C75728D3616L ^ l10))), (int)jp.a("r", (int)14419, (long)(0x694C62ACF544F5B7L ^ l10)), Oq.k, a.cs((int)jp.a("r", (int)20417, (long)(0x1614C23B988E8224L ^ l10))));
        this.r = _2.O;
        this.d = jU.R(this, (String)((Object)jp.c("\u00c9", (int)jp.a("r", (int)4743, (long)(0x56CB790FF54A5F6FL ^ l10)), (long)1653435628218378049L, (long)l10)), true, (String)((Object)jp.c("\u00c9", (int)jp.a("r", (int)22983, (long)(0x1E39B03E52409428L ^ l10)), (long)1653435628218378049L, (long)l10)));
        this.Y = js.D(this, (String)((Object)jp.c("\u00c9", (int)jp.a("r", (int)12259, (long)(0x4F9BB92B8CF5E201L ^ l10)), (long)1653435628218378049L, (long)l10)), (String)((Object)jp.c("\u00c9", (int)jp.a("r", (int)12323, (long)(0x3F90EBFCACC17DC2L ^ l10)), (long)1653435628218378049L, (long)l10)), "", 1.0, 3.0, 5.0, 0.1, (String)((Object)jp.c("\u00c9", (int)jp.a("r", (int)23715, (long)(0x5E6DA869B6289145L ^ l10)), (long)1653435628218378049L, (long)l10)));
        this.O = jU.R(this, (String)((Object)jp.c("\u00c9", (int)jp.a("r", (int)20707, (long)(0x37A062F2EC759D0DL ^ l10)), (long)1653435628218378049L, (long)l10)), false, (String)((Object)jp.c("\u00c9", (int)jp.a("r", (int)15241, (long)(0x762D7E618B6A7664L ^ l10)), (long)1653435628218378049L, (long)l10)));
        this.e = jU.R(this, (String)((Object)jp.c("\u00c9", (int)jp.a("r", (int)14743, (long)(0x4C3E22EBADE67477L ^ l10)), (long)1653435628218378049L, (long)l10)), true, (String)((Object)jp.c("\u00c9", (int)jp.a("r", (int)28589, (long)(0x5662AD3BCABEA241L ^ l10)), (long)1653435628218378049L, (long)l10)));
        this.t = js.D(this, (String)((Object)jp.c("\u00c9", (int)jp.a("r", (int)20763, (long)(0x127BBCF4FBD11CF8L ^ l10)), (long)1653435628218378049L, (long)l10)), (String)((Object)jp.c("\u00c9", (int)jp.a("r", (int)2830, (long)(0x5454C5DB335D46E5L ^ l10)), (long)1653435628218378049L, (long)l10)), "", 1.0, 3.0, 5.0, 0.1, (String)((Object)jp.c("\u00c9", (int)jp.a("r", (int)12134, (long)(0x2265589DA7F6E28FL ^ l10)), (long)1653435628218378049L, (long)l10)));
        this.V = false;
        this.P = false;
        this.e.l(this.O);
        this.N(this.Y, this.t, this.d, this.e, this.O);
        this.r.y(this, 100);
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
        int n3 = jp.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private V0 g() {
        try {
            if (kX.C() == 13) {
                return V0.e(this.n.F(), ((oQ)this.n.L()).c(), this.n.V(), this.n.B(), this.n.j());
            }
        }
        catch (O_ o_2) {
            throw jp.a(o_2);
        }
        return V0.a(this.n.F(), this.n.V(), this.n.B(), this.n.j());
    }

    private void q() {
        this.P = false;
        this.p();
        super.y(false, false);
        this.n = null;
        this.r.b(this);
    }

    private static Field c(long l10, long l11) {
        int n2 = jp.a(l10, l11);
        Object object = A[n2];
        if (object instanceof String) {
            String string = B[n2];
            int n3 = string.indexOf(8);
            Class clazz = jp.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = jp.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = jp.a(clazz3, string2, clazz2)) != null) {
                    jp.A[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = jp.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        jp.A[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = jp.b(251914339823474L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static void a() {
        Object[] objectArray = A;
        A[0] = "lW0";
        objectArray[1] = Integer.TYPE;
        jp.B[1] = "java/lang/Integer";
        objectArray[2] = "\u0015.\\p\u0016[\u001e!M?kC\r&Dv";
        objectArray[3] = "u3w\u0011t\u0002~<f^\u0015\fu7b\u0004";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "N,\u0010F9g\u0014x\u000b:+duq]S#eJx\u001c^\u007f\u001fL5W\u0005>d\u00139V@@";
    }

    @OY
    public void p(KN kN2) {
        block25: {
            float f10;
            double d2;
            double d3;
            double d4;
            Qg qg2;
            block26: {
                block30: {
                    int n2;
                    float f11;
                    block32: {
                        block31: {
                            block27: {
                                int n3;
                                float f12;
                                block29: {
                                    block28: {
                                        block24: {
                                            float f13;
                                            double d5;
                                            block23: {
                                                block22: {
                                                    double d6;
                                                    double d7;
                                                    double d9;
                                                    double d10;
                                                    qg2 = EP.U();
                                                    try {
                                                        d10 = (Double)this.Y.J() / 5.0;
                                                        d9 = rT.s(EP.N().N()) ? 2.0 : 1.0;
                                                    }
                                                    catch (O_ o_2) {
                                                        throw jp.a(o_2);
                                                    }
                                                    d4 = d10 * d9;
                                                    try {
                                                        d7 = (Double)this.t.J() / 5.0;
                                                        d6 = rT.s(EP.N().N()) ? 2.0 : 1.0;
                                                    }
                                                    catch (O_ o_3) {
                                                        throw jp.a(o_3);
                                                    }
                                                    d5 = d7 * d6;
                                                    try {
                                                        qg2.G(true);
                                                        if (!qg2.W().Q()) break block22;
                                                        f13 = 1.0f;
                                                        break block23;
                                                    }
                                                    catch (O_ o_4) {
                                                        throw jp.a(o_4);
                                                    }
                                                }
                                                try {
                                                    f13 = qg2.W().f() ? -1.0f : 0.0f;
                                                }
                                                catch (O_ o_5) {
                                                    throw jp.a(o_5);
                                                }
                                            }
                                            float f14 = f13;
                                            double d11 = (double)(f14 * 0.42f) * d5;
                                            qg2.z(d11);
                                            EP.U().W().O(false);
                                            qg2.h(false);
                                            d3 = qg2.W().t();
                                            d2 = qg2.W().m();
                                            f10 = qg2.q();
                                            try {
                                                try {
                                                    if (d3 != 0.0 || d2 != 0.0) break block24;
                                                }
                                                catch (O_ o_6) {
                                                    throw jp.a(o_6);
                                                }
                                                qg2.t(0.0);
                                                qg2.s(0.0);
                                                break block25;
                                            }
                                            catch (O_ o_7) {
                                                throw jp.a(o_7);
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (d3 == 0.0) break block26;
                                                    if (!(d2 > 0.0)) break block27;
                                                }
                                                catch (O_ o_8) {
                                                    throw jp.a(o_8);
                                                }
                                                f12 = f10;
                                                if (!(d3 > 0.0)) break block28;
                                            }
                                            catch (O_ o_9) {
                                                throw jp.a(o_9);
                                            }
                                            n3 = -45;
                                            break block29;
                                        }
                                        catch (O_ o_10) {
                                            throw jp.a(o_10);
                                        }
                                    }
                                    n3 = 45;
                                }
                                f10 = f12 + (float)n3;
                                break block30;
                            }
                            try {
                                try {
                                    if (!(d2 < 0.0)) break block30;
                                    f11 = f10;
                                    if (!(d3 > 0.0)) break block31;
                                }
                                catch (O_ o_11) {
                                    throw jp.a(o_11);
                                }
                                n2 = 45;
                                break block32;
                            }
                            catch (O_ o_12) {
                                throw jp.a(o_12);
                            }
                        }
                        n2 = -45;
                    }
                    f10 = f11 + (float)n2;
                }
                d2 = 0.0;
                d3 = d3 > 0.0 ? 1.0 : -1.0;
            }
            qg2.t(d3 * d4 * Math.cos(Math.toRadians(f10 + 90.0f)) + d2 * d4 * Math.sin(Math.toRadians(f10 + 90.0f)));
            qg2.s(d3 * d4 * Math.sin(Math.toRadians(f10 + 90.0f)) - d2 * d4 * Math.cos(Math.toRadians(f10 + 90.0f)));
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                jp.h = d8.a(6237093039186168945L, -302918433352739353L, MethodHandles.lookup().lookupClass()).a(152068508467258L);
                jp.A = new Object[5];
                jp.B = new String[5];
                jp.a();
                jp.z = new HashMap<K, V>(13);
                var0 = jp.h ^ 41696762989490L;
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
                var8_3 = new long[15];
                var5_4 = 0;
                var6_5 = "\u0085\u00b0&\u009a4\u0088\u00f3e\u00ac\u00d4E\u00e8N\tH\u00ed-\u008f\u009a{\n\u00bb\t\u00c4\u00f0\u0088\u0084]c\u00ad\u0015%K7\u00e5\u000e\u00f1\u00ac\u00f9\u0084\u0093\u0083R\u00c5\u00db0@\u009b$\u0089j\u008e\u00bc\u0099\u008e\u00ec1\u0019\u00b0\u00a8Iv\u0010\u00c0\u00c7\u001ck\u0080\u0015\u00cf\u0095\u0014\u00c1w+I\u00ed\u00c7\u008a\u00a8-F:\u00b6\u00ef6\u00b4d\nZ\u00f7E\u00cc\u00a2\u009e\u00cd|B\u00f6q\u0017\u0093\u0096\u007f";
                var7_6 = "\u0085\u00b0&\u009a4\u0088\u00f3e\u00ac\u00d4E\u00e8N\tH\u00ed-\u008f\u009a{\n\u00bb\t\u00c4\u00f0\u0088\u0084]c\u00ad\u0015%K7\u00e5\u000e\u00f1\u00ac\u00f9\u0084\u0093\u0083R\u00c5\u00db0@\u009b$\u0089j\u008e\u00bc\u0099\u008e\u00ec1\u0019\u00b0\u00a8Iv\u0010\u00c0\u00c7\u001ck\u0080\u0015\u00cf\u0095\u0014\u00c1w+I\u00ed\u00c7\u008a\u00a8-F:\u00b6\u00ef6\u00b4d\nZ\u00f7E\u00cc\u00a2\u009e\u00cd|B\u00f6q\u0017\u0093\u0096\u007f".length();
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
                    var6_5 = "\u000b9h\u00bal\u00e4\u00c1$\u00ee\n\u00ca\u00e5\u00f7FuC";
                    var7_6 = "\u000b9h\u00bal\u00e4\u00c1$\u00ee\n\u00ca\u00e5\u00f7FuC".length();
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
        jp.j = var8_3;
        jp.o = new Integer[15];
    }

    public void p() {
        Qg qg2 = EP.U();
        try {
            qg2.B(this.n.F());
            qg2.Q(this.n.V());
            qg2.A(this.n.B());
            qg2.W(this.n.f());
            qg2.X(this.n.l());
            qg2.p(this.n.n());
            qg2.Z(this.n.F());
            qg2.G(this.n.V());
            qg2.M(this.n.B());
            qg2.a(this.n.q());
            qg2.f(this.n.S());
            qg2.W(this.n.j());
            qg2.a(this.n.F());
            qg2.K(this.n.V());
            qg2.i(this.n.B());
            qg2.b(this.n.q());
            qg2.R(this.n.S());
            qg2.z(this.n.A());
            qg2.G(this.n.Q());
            qg2.R(this.n.F(), this.n.V(), this.n.B());
            qg2.b(this.n.G(), this.n.x(), this.n.o());
            EP.U().a(this.X);
            qg2.G(false);
            if (this.l != 0) {
                EP.c().d(this.n);
                rT.y(this.l);
                this.l = 0;
            }
        }
        catch (O_ o_2) {
            throw jp.a(o_2);
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void y(boolean bl2, boolean bl3) {
        block3: {
            block2: {
                try {
                    if (!bl2) break block2;
                    super.y(bl2, bl3);
                    break block3;
                }
                catch (O_ o_2) {
                    throw jp.a(o_2);
                }
            }
            this.P = true;
        }
    }

    @Override
    public void h() {
        this.V = true;
        this.r.d(this);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (B[n5] != null) {
            return n5;
        }
        Object object = A[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 17;
                break;
            }
            case 1: {
                n4 = 1;
                break;
            }
            case 2: {
                n4 = 27;
                break;
            }
            case 3: {
                n4 = 45;
                break;
            }
            case 4: {
                n4 = 42;
                break;
            }
            case 5: {
                n4 = 11;
                break;
            }
            case 6: {
                n4 = 9;
                break;
            }
            case 7: {
                n4 = 36;
                break;
            }
            case 8: {
                n4 = 52;
                break;
            }
            case 9: {
                n4 = 2;
                break;
            }
            case 10: {
                n4 = 29;
                break;
            }
            case 11: {
                n4 = 56;
                break;
            }
            case 12: {
                n4 = 47;
                break;
            }
            case 13: {
                n4 = 60;
                break;
            }
            case 14: {
                n4 = 49;
                break;
            }
            case 15: {
                n4 = 19;
                break;
            }
            case 16: {
                n4 = 28;
                break;
            }
            case 17: {
                n4 = 7;
                break;
            }
            case 18: {
                n4 = 13;
                break;
            }
            case 19: {
                n4 = 31;
                break;
            }
            case 20: {
                n4 = 30;
                break;
            }
            case 21: {
                n4 = 22;
                break;
            }
            case 22: {
                n4 = 26;
                break;
            }
            case 23: {
                n4 = 39;
                break;
            }
            case 24: {
                n4 = 0;
                break;
            }
            case 25: {
                n4 = 3;
                break;
            }
            case 26: {
                n4 = 44;
                break;
            }
            case 27: {
                n4 = 41;
                break;
            }
            case 28: {
                n4 = 59;
                break;
            }
            case 29: {
                n4 = 62;
                break;
            }
            case 30: {
                n4 = 58;
                break;
            }
            case 31: {
                n4 = 37;
                break;
            }
            case 32: {
                n4 = 43;
                break;
            }
            case 33: {
                n4 = 54;
                break;
            }
            case 34: {
                n4 = 18;
                break;
            }
            case 35: {
                n4 = 38;
                break;
            }
            case 36: {
                n4 = 32;
                break;
            }
            case 37: {
                n4 = 63;
                break;
            }
            case 38: {
                n4 = 55;
                break;
            }
            case 39: {
                n4 = 8;
                break;
            }
            case 40: {
                n4 = 34;
                break;
            }
            case 41: {
                n4 = 35;
                break;
            }
            case 42: {
                n4 = 48;
                break;
            }
            case 43: {
                n4 = 12;
                break;
            }
            case 44: {
                n4 = 20;
                break;
            }
            case 45: {
                n4 = 5;
                break;
            }
            case 46: {
                n4 = 53;
                break;
            }
            case 47: {
                n4 = 6;
                break;
            }
            case 48: {
                n4 = 25;
                break;
            }
            case 49: {
                n4 = 33;
                break;
            }
            case 50: {
                n4 = 24;
                break;
            }
            case 51: {
                n4 = 21;
                break;
            }
            case 52: {
                n4 = 10;
                break;
            }
            case 53: {
                n4 = 16;
                break;
            }
            case 54: {
                n4 = 50;
                break;
            }
            case 55: {
                n4 = 57;
                break;
            }
            case 56: {
                n4 = 51;
                break;
            }
            case 57: {
                n4 = 4;
                break;
            }
            case 58: {
                n4 = 14;
                break;
            }
            case 59: {
                n4 = 23;
                break;
            }
            case 60: {
                n4 = 15;
                break;
            }
            case 61: {
                n4 = 46;
                break;
            }
            case 62: {
                n4 = 40;
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
        jp.B[n5] = new String(cArray);
        return n5;
    }

    private static Method d(long l10, long l11) {
        int n2 = jp.a(l10, l11);
        Object object = A[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = B[n2];
                int n4 = string2.indexOf(8);
                clazz3 = jp.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = jp.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = jp.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        jp.A[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = jp.b(251914339823474L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = jp.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        jp.A[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = jp.b(251914339823474L, 0L);
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
            if (c10 == 'e' || c10 == '\u00e0' || c10 == '\u00ff' || c10 == '\u00e3') {
                field = jp.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'e' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00e0' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00ff' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = jp.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00c4' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00c9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private Vm t() {
        Vm vm2;
        boolean bl2;
        block27: {
            double d2;
            block29: {
                block28: {
                    boolean bl3;
                    block30: {
                        block25: {
                            block26: {
                                boolean bl4;
                                block24: {
                                    block23: {
                                        boolean bl5;
                                        double d3;
                                        double d4;
                                        block22: {
                                            block21: {
                                                double d5;
                                                double d6 = this.n.F() - this.T;
                                                try {
                                                    d5 = rT.e ? this.n.S().c() : ((oQ)this.n.L()).c();
                                                }
                                                catch (O_ o_2) {
                                                    throw jp.a(o_2);
                                                }
                                                double d7 = d5 - this.R;
                                                double d9 = this.n.B() - this.w;
                                                d4 = this.n.q() - this.b;
                                                d3 = this.n.S() - this.x;
                                                try {
                                                    try {
                                                        if (!(d6 * d6 + d7 * d7 + d9 * d9 > 9.0E-4) && this.X < 20) break block21;
                                                    }
                                                    catch (O_ o_3) {
                                                        throw jp.a(o_3);
                                                    }
                                                    bl5 = true;
                                                    break block22;
                                                }
                                                catch (O_ o_4) {
                                                    throw jp.a(o_4);
                                                }
                                            }
                                            bl5 = false;
                                        }
                                        bl3 = bl5;
                                        try {
                                            try {
                                                if (d4 == 0.0 && d3 == 0.0) break block23;
                                            }
                                            catch (O_ o_5) {
                                                throw jp.a(o_5);
                                            }
                                            bl4 = true;
                                            break block24;
                                        }
                                        catch (O_ o_6) {
                                            throw jp.a(o_6);
                                        }
                                    }
                                    bl4 = false;
                                }
                                bl2 = bl4;
                                vm2 = null;
                                try {
                                    try {
                                        if (!this.n.o().Y()) break block25;
                                        if (!bl3) break block26;
                                    }
                                    catch (O_ o_7) {
                                        throw jp.a(o_7);
                                    }
                                    if (!bl2) break block26;
                                }
                                catch (O_ o_8) {
                                    throw jp.a(o_8);
                                }
                                vm2 = this.c();
                                break block30;
                            }
                            vm2 = bl3 ? this.g() : (bl2 ? Vg.i(this.n.q(), this.n.S(), this.n.j()) : Vm.K(this.n.j()));
                            break block30;
                        }
                        vm2 = this.E();
                        bl3 = false;
                    }
                    try {
                        try {
                            ++this.X;
                            if (!bl3) break block27;
                            this.T = this.n.F();
                            jp jp2 = this;
                            if (!rT.e) break block28;
                        }
                        catch (O_ o_9) {
                            throw jp.a(o_9);
                        }
                        d2 = this.n.V();
                        break block29;
                    }
                    catch (O_ o_10) {
                        throw jp.a(o_10);
                    }
                }
                d2 = ((oQ)this.n.L()).c();
            }
            jp2.R = d2;
            this.w = this.n.B();
            this.X = 0;
        }
        try {
            if (bl2) {
                this.b = this.n.q();
                this.x = this.n.S();
            }
        }
        catch (O_ o_11) {
            throw jp.a(o_11);
        }
        return vm2;
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x5B16;
        if (o[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = j[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])z.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    z.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/jp", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            jp.o[n3] = n4;
        }
        return o[n3];
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = jp.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = jp.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @OY
    public void y(pa pa2) {
        try {
            if (this.n == null) {
                return;
            }
        }
        catch (O_ o_2) {
            throw jp.a(o_2);
        }
        Vt vt2 = pa2.getPacket();
        if (vt2.B(eM.UV)) {
            VP vP2;
            block10: {
                this.m = pa2.getNetworkManager();
                vP2 = new VP(vt2.M());
                try {
                    pa2.setCanceled(true);
                    if (kX.C() < 15) break block10;
                    EP.n(() -> this.lambda$onPacketReceived$0(vP2));
                    return;
                }
                catch (O_ o_3) {
                    throw jp.a(o_3);
                }
            }
            this.d(vP2);
            return;
        }
        if (vt2.B(eM.bh)) {
            VG vG2 = new VG(vt2.M());
            try {
                if (vG2.h() != EP.U().X()) return;
                this.n.b((double)vG2.K() / 8000.0, (double)vG2.I() / 8000.0, (double)vG2.o() / 8000.0);
                return;
            }
            catch (O_ o_4) {
                throw jp.a(o_4);
            }
        } else {
            if (!vt2.B(eM.Ub)) return;
            V9 v92 = new V9(vt2.M());
            this.n.t(this.n.G() + (double)v92.r());
            this.n.z(this.n.x() + (double)v92.v());
            this.n.s(this.n.o() + (double)v92.x());
        }
    }

    private void k() {
        this.n = Fo.F();
        this.n.X(0.0f);
        this.n.c(0.0f);
        this.n.h(false);
        XO xO2 = XO.b;
        try {
            if (xO2.P()) {
                this.n.a(xO2.Y());
                this.n.z(xO2.Y());
                this.n.C(xO2.Y());
                this.n.F(xO2.Y());
                this.n.f(xO2.p());
            }
        }
        catch (O_ o_2) {
            throw jp.a(o_2);
        }
        try {
            this.X = EP.U().m();
            this.T = EP.U().H();
            this.R = EP.U().Z();
            this.w = EP.U().Y();
            this.b = EP.U().Z();
            this.x = EP.U().c();
            if (this.e.s().booleanValue()) {
                this.l = rT.M();
                this.n.f(this.l);
                EP.c().c(this.l, this.n);
            }
        }
        catch (O_ o_3) {
            throw jp.a(o_3);
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = jp.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = jp.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private VH c() {
        try {
            if (kX.C() == 13) {
                return VH.h(this.n.F(), ((oQ)this.n.L()).c(), this.n.V(), this.n.B(), this.n.q(), this.n.S(), this.n.j());
            }
        }
        catch (O_ o_2) {
            throw jp.a(o_2);
        }
        return VH.g(this.n.F(), this.n.V(), this.n.B(), this.n.q(), this.n.S(), this.n.j());
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = jp.a(l10, l11);
            object = A[n2];
            try {
                if (!(object instanceof String)) break block2;
                jp.A[n2] = clazz = Class.forName(B[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void A() {
        block14: {
            block17: {
                block16: {
                    block15: {
                        try {
                            try {
                                try {
                                    this.n.X(0.0f);
                                    this.n.c(0.0f);
                                    if (!this.O.s().booleanValue() || !EP.X().Y()) break block14;
                                }
                                catch (O_ o_2) {
                                    throw jp.a(o_2);
                                }
                                if (!s0.F(38)) break block15;
                            }
                            catch (O_ o_3) {
                                throw jp.a(o_3);
                            }
                            this.n.X(1.0f);
                            break block16;
                        }
                        catch (O_ o_4) {
                            throw jp.a(o_4);
                        }
                    }
                    try {
                        if (s0.F(40)) {
                            this.n.X(-1.0f);
                        }
                    }
                    catch (O_ o_5) {
                        throw jp.a(o_5);
                    }
                }
                try {
                    if (!s0.F(37)) break block17;
                    this.n.c(1.0f);
                    break block14;
                }
                catch (O_ o_6) {
                    throw jp.a(o_6);
                }
            }
            try {
                if (s0.F(39)) {
                    this.n.c(-1.0f);
                }
            }
            catch (O_ o_7) {
                throw jp.a(o_7);
            }
        }
        Fo.Y(this.n, true);
    }

    private boolean J(Vt vt2) {
        block9: {
            block10: {
                block8: {
                    try {
                        try {
                            if (!vt2.B(eM.rZ) || this.d.s().booleanValue()) break block8;
                        }
                        catch (O_ o_2) {
                            throw jp.a(o_2);
                        }
                        return true;
                    }
                    catch (O_ o_3) {
                        throw jp.a(o_3);
                    }
                }
                try {
                    try {
                        if (this.d.s().booleanValue()) break block9;
                        if (!vt2.B(eM.Uc)) break block10;
                    }
                    catch (O_ o_4) {
                        throw jp.a(o_4);
                    }
                    return true;
                }
                catch (O_ o_5) {
                    throw jp.a(o_5);
                }
            }
            return vt2.B(eM.U5);
        }
        return false;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private void lambda$onPacketReceived$0(VP vP2) {
        this.d(vP2);
    }

    private void d(VP vP2) {
        block13: {
            float f10;
            float f11;
            double d2;
            double d3;
            double d4;
            Q0 q02;
            block15: {
                block14: {
                    block12: {
                        try {
                            try {
                                if (vP2 != null && !vP2.Y()) break block12;
                            }
                            catch (O_ o_2) {
                                throw jp.a(o_2);
                            }
                            return;
                        }
                        catch (O_ o_3) {
                            throw jp.a(o_3);
                        }
                    }
                    q02 = this.n;
                    d4 = vP2.V();
                    d3 = vP2.w();
                    d2 = vP2.R();
                    f11 = vP2.Z();
                    f10 = vP2.F();
                    try {
                        if (kX.C() <= 13) break block13;
                        if (!vP2.y().contains(Vf.t().M())) break block14;
                    }
                    catch (O_ o_4) {
                        throw jp.a(o_4);
                    }
                    d4 += q02.F();
                    break block15;
                }
                q02.t(0.0);
            }
            if (vP2.y().contains(Vf.l().M())) {
                d3 += q02.V();
            } else {
                q02.z(0.0);
            }
            if (vP2.y().contains(Vf.s().M())) {
                d2 += q02.B();
            } else {
                q02.s(0.0);
            }
            if (vP2.y().contains(Vf.i().M())) {
                f10 += q02.S();
            }
            if (vP2.y().contains(Vf.O().M())) {
                f11 += q02.q();
            }
            q02.u(d4, d3, d2, f11, f10);
            q02.a(f11);
            VH vH2 = VH.g(q02.F(), q02.V(), q02.B(), q02.q(), q02.S(), false);
            this.v = vH2.M();
            this.m.c(vH2);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(jp.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(jp.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

