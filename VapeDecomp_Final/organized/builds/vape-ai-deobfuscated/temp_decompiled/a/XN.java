/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package a;

import a.EP;
import a.F7;
import a.F8;
import a.Kw;
import a.NH;
import a.NY;
import a.Ne;
import a.OY;
import a.O_;
import a.Oq;
import a.Q0;
import a.Qg;
import a.SE;
import a.Vt;
import a.a;
import a.d8;
import a.eM;
import a.jG;
import a.jU;
import a.jd;
import a.jr;
import a.js;
import a.kX;
import a.kg;
import a.p5;
import a.pN;
import a.pa;
import a.rT;
import a.tO;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

public class xn
extends xi {
    private static final Map t;
    private final jd G;
    private static final String[] A;
    private static final Integer[] m;
    private final js d;
    private Q0 h;
    private final Queue<NH> n;
    private static final Object[] z;
    public tO o;
    private final jd L;
    private boolean e;
    private final jr T;
    private static final long b;
    private int l;
    private final jU x;
    private final jU R;
    private boolean v;
    private final jr r;
    private int Z;
    private final jU F;
    private final jr K;
    private static final long[] j;
    private final jr N;
    private boolean B;
    private final List<kg> w;

    @OY
    public void n(Kw kw2) {
    }

    @Override
    public void v() {
        block9: {
            block8: {
                try {
                    try {
                        if (!EP.U().Y() && !EP.c().Y()) break block8;
                    }
                    catch (O_ o_2) {
                        throw xn.a(o_2);
                    }
                    this.w.clear();
                    this.h = null;
                    this.Z = 0;
                }
                catch (O_ o_3) {
                    throw xn.a(o_3);
                }
            }
            try {
                try {
                    if (this.h == null || !EP.c().I(this.l).r()) break block9;
                }
                catch (O_ o_4) {
                    throw xn.a(o_4);
                }
                EP.c().d(this.h);
            }
            catch (O_ o_5) {
                throw xn.a(o_5);
            }
        }
        this.h = null;
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

    /*
     * Unable to fully structure code
     */
    @OY(b=F7.LOW)
    public void b(pN var1_1) {
        var2_2 = xn.b ^ 108208040000011L;
        try {
            block39: {
                block40: {
                    block48: {
                        block47: {
                            block38: {
                                block37: {
                                    block36: {
                                        block43: {
                                            block35: {
                                                block44: {
                                                    block42: {
                                                        block41: {
                                                            if (var1_1.isCanceled()) {
                                                                return;
                                                            }
                                                            var4_3 = EP.X();
                                                            if (var4_3.B(eM.Uk)) ** GOTO lbl25
                                                            if (var4_3.B(eM.B)) ** GOTO lbl25
                                                            break block41;
                                                            catch (Exception v0) {
                                                                throw xn.a(v0);
                                                            }
                                                        }
                                                        if (var4_3.B(eM.D)) ** GOTO lbl25
                                                        break block42;
                                                        catch (Exception v1) {
                                                            throw xn.a(v1);
                                                        }
                                                    }
                                                    if (!EP.U().Y()) break block43;
                                                    break block44;
                                                    catch (Exception v2) {
                                                        throw xn.a(v2);
                                                    }
                                                }
                                                try {
                                                    block45: {
                                                        this.B = true;
                                                        this.z();
                                                        if (this.x.s().booleanValue()) break block35;
                                                        break block45;
                                                        catch (Exception v3) {
                                                            throw xn.a(v3);
                                                        }
                                                    }
                                                    super.T(false);
                                                }
                                                catch (Exception v4) {
                                                    throw xn.a(v4);
                                                }
                                            }
                                            return;
                                        }
                                        if (this.e) {
                                            return;
                                        }
                                        var5_5 = var1_1.getPacket();
                                        if (!this.W(var5_5)) break block36;
                                        return;
                                    }
                                    if (!var5_5.B(eM.L)) break block37;
                                    try {
                                        block46: {
                                            if (!this.L()) break block38;
                                            break block46;
                                            catch (Exception v5) {
                                                throw xn.a(v5);
                                            }
                                        }
                                        if (this.Z % 5 != 0) break block38;
                                    }
                                    catch (Exception v6) {
                                        throw xn.a(v6);
                                    }
                                    var6_6 = EP.U();
                                    try {
                                        v7 = this.Z % 2 == 0;
                                    }
                                    catch (Exception v8) {
                                        throw xn.a(v8);
                                    }
                                    var7_7 = v7;
                                    try {
                                        v9 = 0.2;
                                        v10 = var7_7 != false ? -1 : 1;
                                    }
                                    catch (Exception v11) {
                                        throw xn.a(v11);
                                    }
                                    var8_8 = v9 * (double)v10 * Math.cos(Math.toRadians(var6_6.q()));
                                    try {
                                        v12 = 0.2;
                                        v13 = var7_7 != false ? -1 : 1;
                                    }
                                    catch (Exception v14) {
                                        throw xn.a(v14);
                                    }
                                    var10_9 = v12 * (double)v13 * Math.sin(Math.toRadians(var6_6.q()));
                                    this.w.add(new kg(var6_6.F() + var8_8, var6_6.V(), var6_6.B() + var10_9));
                                    break block38;
                                }
                                if (((jG)this.L.J()).equals(this.N)) {
                                    return;
                                }
                            }
                            ++this.Z;
                            if (!this.x.s().booleanValue()) break block39;
                            if (!((Double)this.d.J() > 0.0)) break block39;
                            break block47;
                            catch (Exception v15) {
                                throw xn.a(v15);
                            }
                        }
                        if (!((double)this.Z >= (Double)this.d.J())) break block39;
                        break block48;
                        catch (Exception v16) {
                            throw xn.a(v16);
                        }
                    }
                    try {
                        block49: {
                            this.B = true;
                            if (this.h == null) break block40;
                            break block49;
                            catch (Exception v17) {
                                throw xn.a(v17);
                            }
                        }
                        if (!this.h.r()) break block40;
                    }
                    catch (Exception v18) {
                        throw xn.a(v18);
                    }
                    var6_6 = EP.U();
                    try {
                        v19 = this.h;
                        v20 = var6_6.F();
                        v21 = rT.e != false ? var6_6.V() : var6_6.V() - 1.5;
                    }
                    catch (Exception v22) {
                        throw xn.a(v22);
                    }
                    v19.u(v20, v21, var6_6.B(), var6_6.q(), var6_6.S());
                    this.h.C(var6_6.J());
                }
                this.Z = 0;
                this.w.clear();
            }
            this.n.add(new NH(var5_5, true, var1_1.getNetworkManager()));
            var1_1.setCanceled(true);
            this.z();
        }
        catch (Exception var4_4) {
            SE.x((String)xn.c("\u00a3", (int)xn.a("l", (int)23846, (long)(1495348951198081291L ^ var2_2)), (long)-3130532292217910894L, (long)var2_2));
            SE.W(var4_4);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void h() {
        block4: {
            Qg qg2;
            block5: {
                this.G();
                qg2 = EP.U();
                try {
                    try {
                        if (!this.F.s().booleanValue()) break block4;
                        this.h = Q0.h(EP.c(), EP.U().B());
                        this.h.R(qg2, true);
                        if (kX.C() < 37) break block5;
                    }
                    catch (O_ o_2) {
                        throw xn.a(o_2);
                    }
                    this.h.f(-420);
                    this.h.A(UUID.randomUUID());
                }
                catch (O_ o_3) {
                    throw xn.a(o_3);
                }
            }
            this.k();
            this.h.C(qg2.J());
            this.l = rT.M();
            EP.c().c(this.l, this.h);
        }
    }

    private void k() {
        double d2;
        double d3;
        Q0 q02;
        Qg qg2;
        block9: {
            qg2 = EP.U();
            try {
                block8: {
                    try {
                        try {
                            if (qg2.r() || this.h.r()) break block8;
                        }
                        catch (O_ o_2) {
                            throw xn.a(o_2);
                        }
                        if (this.F.s().booleanValue()) break block9;
                    }
                    catch (O_ o_3) {
                        throw xn.a(o_3);
                    }
                }
                return;
            }
            catch (O_ o_4) {
                throw xn.a(o_4);
            }
        }
        try {
            q02 = this.h;
            d3 = qg2.F();
            d2 = rT.e ? qg2.V() : qg2.V() - 1.5;
        }
        catch (O_ o_5) {
            throw xn.a(o_5);
        }
        q02.u(d3, d2, qg2.B(), qg2.q(), qg2.S());
        this.h.C(qg2.J());
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                xn.b = d8.a(5361532307232528716L, -2316526067089456783L, MethodHandles.lookup().lookupClass()).a(122125376726656L);
                xn.z = new Object[5];
                xn.A = new String[5];
                xn.a();
                xn.t = new HashMap<K, V>(13);
                var0 = xn.b ^ 112907989088289L;
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
                var8_3 = new long[24];
                var5_4 = 0;
                var6_5 = "+\u00ff\u009c\u00ca\u0003l;:\u00e7 \u00a5\u00eb\u0005 \u0085\u008e\u009e>\u00dc7\f\u00e1\u0085\b\u00cd\u00fc\u00d1\u0018\u009a\u0090d\u00db\u00cfQ\u0001\u008a9_Mz\u0016B\u00b2\u00ac\u00ef\u00b6\u00c5U\u009c\u00e1C\u00e9~lj\u00cfN\rM\u00c7\u00e8M\u0093\u00ed\u00fa\"\u00ee\u001c\u00fa\u00fe\u00e6:1(\u00ce\u00f0\\\u00a7\u00a9\u008f\u00d8\u00ae\u0006\u00d6\u00ca\u00f92;\u00b4\u0010\u0080*\u00efB\u00c1\u00a3\u0091\u00b6\u00ca\f4_\u00cb\u007fP\u0098e\u00b7LzQ\u00865\u008cq\u00dahB\r\u000eV\u0019K\u000b\u00af\u00a1\u00f0\u00fa\u00faS\u00da\u0094PTG\u00ae\u00c9\u00fd\u0019\u0088\u00cb-f|\u00fd\u0003k\u00d8\u00d2\u009b\u009a0l5\u009b\u009d\u00fdP\u00ac\u0011\u00eb\u00ee\u0086f/\u00cb\u001c\u00c2&\u00b1\u0005S\u0098\u00b7\u00ab{";
                var7_6 = "+\u00ff\u009c\u00ca\u0003l;:\u00e7 \u00a5\u00eb\u0005 \u0085\u008e\u009e>\u00dc7\f\u00e1\u0085\b\u00cd\u00fc\u00d1\u0018\u009a\u0090d\u00db\u00cfQ\u0001\u008a9_Mz\u0016B\u00b2\u00ac\u00ef\u00b6\u00c5U\u009c\u00e1C\u00e9~lj\u00cfN\rM\u00c7\u00e8M\u0093\u00ed\u00fa\"\u00ee\u001c\u00fa\u00fe\u00e6:1(\u00ce\u00f0\\\u00a7\u00a9\u008f\u00d8\u00ae\u0006\u00d6\u00ca\u00f92;\u00b4\u0010\u0080*\u00efB\u00c1\u00a3\u0091\u00b6\u00ca\f4_\u00cb\u007fP\u0098e\u00b7LzQ\u00865\u008cq\u00dahB\r\u000eV\u0019K\u000b\u00af\u00a1\u00f0\u00fa\u00faS\u00da\u0094PTG\u00ae\u00c9\u00fd\u0019\u0088\u00cb-f|\u00fd\u0003k\u00d8\u00d2\u009b\u009a0l5\u009b\u009d\u00fdP\u00ac\u0011\u00eb\u00ee\u0086f/\u00cb\u001c\u00c2&\u00b1\u0005S\u0098\u00b7\u00ab{".length();
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
                    var6_5 = "6]\u009c\u00bbu\u00a5B\u00d4=\u00d8\u00c0\u009d\u00e2j\u00c0\u00dc";
                    var7_6 = "6]\u009c\u00bbu\u00a5B\u00d4=\u00d8\u00c0\u009d\u00e2j\u00c0\u00dc".length();
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
        xn.j = var8_3;
        xn.m = new Integer[24];
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'O' || c10 == '\u00f9' || c10 == '\u00e0' || c10 == 'H') {
                field = xn.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'O' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00f9' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00e0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = xn.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00ce' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00a3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xn" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Loose catch block
     */
    @OY
    public void o(pa pa2) {
        long l10 = b ^ 0x6B9A45CAFF91L;
        try {
            Vt vt2;
            block15: {
                block18: {
                    block14: {
                        block16: {
                            block13: {
                                vt2 = pa2.getPacket();
                                if (!vt2.B(eM.UV)) break block16;
                                try {
                                    block17: {
                                        this.B = true;
                                        this.z();
                                        if (this.x.s().booleanValue()) break block13;
                                        break block17;
                                        catch (Exception exception) {
                                            throw xn.a(exception);
                                        }
                                    }
                                    super.T(false);
                                }
                                catch (Exception exception) {
                                    throw xn.a(exception);
                                }
                            }
                            return;
                        }
                        if (((jG)this.G.J()).equals(this.T)) {
                            return;
                        }
                        if (!this.e) break block14;
                        return;
                    }
                    ++this.Z;
                    if (!this.x.s().booleanValue()) break block15;
                    if (!((Double)this.d.J() > 0.0)) break block15;
                    break block18;
                    catch (Exception exception) {
                        throw xn.a(exception);
                    }
                }
                try {
                    block19: {
                        if (!((double)this.Z >= (Double)this.d.J())) break block15;
                        break block19;
                        catch (Exception exception) {
                            throw xn.a(exception);
                        }
                    }
                    this.B = true;
                    this.k();
                    this.Z = 0;
                    this.w.clear();
                }
                catch (Exception exception) {
                    throw xn.a(exception);
                }
            }
            this.n.add(new NH(vt2, false, pa2.getNetworkManager()));
            pa2.setCanceled(true);
        }
        catch (Exception exception) {
            SE.x((String)((Object)xn.c("\u00a3", (int)xn.a("l", (int)12043, (long)(0x69FBAC1AFA0E16A9L ^ l10)), (long)1230631168441158664L, (long)l10)));
            SE.W(exception);
        }
    }

    private boolean L() {
        boolean bl2;
        block5: {
            block4: {
                Qg qg2 = EP.U();
                try {
                    try {
                        if (qg2.G() == 0.0 && qg2.o() == 0.0) break block4;
                    }
                    catch (O_ o_2) {
                        throw xn.a(o_2);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (O_ o_3) {
                    throw xn.a(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    private static Field c(long l10, long l11) {
        int n2 = xn.a(l10, l11);
        Object object = z[n2];
        if (object instanceof String) {
            String string = A[n2];
            int n3 = string.indexOf(8);
            Class clazz = xn.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = xn.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = xn.a(clazz3, string2, clazz2)) != null) {
                    xn.z[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = xn.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        xn.z[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = xn.b(252239698756265L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @OY
    public void V(p5 p52) {
        block12: {
            try {
                try {
                    if (this.R.s().booleanValue() && !this.w.isEmpty()) break block12;
                }
                catch (O_ o_2) {
                    throw xn.a(o_2);
                }
                return;
            }
            catch (O_ o_3) {
                throw xn.a(o_3);
            }
        }
        try {
            p52.getEntityRenderer().H(1.0);
            NY.Y();
            if (!F8.U()) {
                Ne.h.y(3042);
                GL11.glBlendFunc((int)770, (int)771);
                GL11.glLineWidth((float)1.5f);
                Ne.h.z(3553);
                Ne.h.y(2848);
                Ne.h.z(2929);
                GL11.glDepthMask((boolean)false);
            }
        }
        catch (O_ o_4) {
            throw xn.a(o_4);
        }
        double d2 = tO.b();
        double d3 = tO.S();
        double d4 = tO.n();
        boolean bl2 = true;
        for (kg kg2 : this.w) {
            Color color = Color.RED;
            if (bl2) {
                color = Color.YELLOW;
                bl2 = false;
            }
            NY.x(kg2.K - 0.1, kg2.w, kg2.O - 0.1, 0.2, 0.0, 0.2, 1.0, Color.BLACK, color, d2, d3, d4);
        }
        try {
            if (!F8.U()) {
                GL11.glDepthMask((boolean)true);
                Ne.h.y(2929);
                Ne.h.y(3553);
                Ne.h.z(2848);
                Ne.h.z(3042);
            }
        }
        catch (O_ o_5) {
            throw xn.a(o_5);
        }
        NY.J();
        p52.getEntityRenderer().F(1.0);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = xn.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = xn.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public void r() {
        this.B = true;
        this.v = true;
        this.z();
    }

    private void z() {
        block6: {
            try {
                if (!this.B) break block6;
                this.e = true;
            }
            catch (O_ o_2) {
                throw xn.a(o_2);
            }
            while (!this.n.isEmpty()) {
                NH nH = this.n.poll();
                nH.c();
            }
            try {
                this.e = false;
                this.B = false;
                if (this.v) {
                    this.v = false;
                }
            }
            catch (O_ o_3) {
                throw xn.a(o_3);
            }
        }
    }

    @Override
    public void T(boolean bl2) {
        super.T(bl2);
    }

    @Override
    public void y(boolean bl2, boolean bl3) {
        super.y(bl2, bl3);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = xn.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method d(long l10, long l11) {
        int n2 = xn.a(l10, l11);
        Object object = z[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = A[n2];
                int n4 = string2.indexOf(8);
                clazz3 = xn.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = xn.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = xn.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        xn.z[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = xn.b(252239698756265L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = xn.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        xn.z[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = xn.b(252239698756265L, 0L);
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

    private static void a() {
        Object[] objectArray = z;
        z[0] = "t\u000e\u0006";
        objectArray[1] = Integer.TYPE;
        xn.A[1] = "java/lang/Integer";
        objectArray[2] = "\u001csy\ne-\u0017|hE\u00185\u0004{a\f";
        objectArray[3] = "ue\teYw~j\u0018*8yua\u001cp";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "Ax6K\u0000y[p29Rg#.a\b@u@&bHC\u001c\u001ajbU\u0007|\u001cf<\u00049";
    }

    @Override
    public String H() {
        try {
            if (this.Z == 0) {
                return "";
            }
        }
        catch (O_ o_2) {
            throw xn.a(o_2);
        }
        return String.valueOf(this.Z);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = xn.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x28A5;
        if (m[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = j[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])t.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    t.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/xn", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            xn.m[n3] = n4;
        }
        return m[n3];
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = xn.a(l10, l11);
            object = z[n2];
            try {
                if (!(object instanceof String)) break block2;
                xn.z[n2] = clazz = Class.forName(A[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xn" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public xn() {
        long l10 = b ^ 0x10245B12A006L;
        super(a.cs((int)xn.a("l", (int)5676, (long)(0x6DD1E4D6F76F701BL ^ l10))), (int)xn.a("l", (int)9540, (long)(0x5F23B8BC645E4367L ^ l10)), Oq.K, a.cs((int)xn.a("l", (int)15888, (long)(0x67EE106092695823L ^ l10))));
        this.w = new CopyOnWriteArrayList<kg>();
        this.T = new jr((String)((Object)xn.c("\u00a3", (int)xn.a("l", (int)25034, (long)(0x52080BB3A93787E1L ^ l10)), (long)5657487847824675743L, (long)l10)));
        this.r = new jr((String)((Object)xn.c("\u00a3", (int)xn.a("l", (int)26501, (long)(0x52D4D4597B6981B1L ^ l10)), (long)5657487847824675743L, (long)l10)));
        this.G = jd.I(this, (String)((Object)xn.c("\u00a3", (int)xn.a("l", (int)2847, (long)(0x3DA1DB8F00D3ED38L ^ l10)), (long)5657487847824675743L, (long)l10)), (String)((Object)xn.c("\u00a3", (int)xn.a("l", (int)11368, (long)(0x77D1A01EC4004A44L ^ l10)), (long)5657487847824675743L, (long)l10)), this.T, this.T, this.r);
        this.K = new jr((String)((Object)xn.c("\u00a3", (int)xn.a("l", (int)26253, (long)(0xC8DBA4872A880BBL ^ l10)), (long)5657487847824675743L, (long)l10)));
        this.N = new jr((String)((Object)xn.c("\u00a3", (int)xn.a("l", (int)16792, (long)(0x37A5D2A51B8127BCL ^ l10)), (long)5657487847824675743L, (long)l10)));
        this.L = jd.I(this, (String)((Object)xn.c("\u00a3", (int)xn.a("l", (int)24082, (long)(0x33BD250780BAB83DL ^ l10)), (long)5657487847824675743L, (long)l10)), (String)((Object)xn.c("\u00a3", (int)xn.a("l", (int)31986, (long)(0x2EFC34444EE19AD8L ^ l10)), (long)5657487847824675743L, (long)l10)), this.K, this.K, this.N);
        this.R = jU.R(this, (String)((Object)xn.c("\u00a3", (int)xn.a("l", (int)9021, (long)(0x37204023EC314514L ^ l10)), (long)5657487847824675743L, (long)l10)), false, (String)((Object)xn.c("\u00a3", (int)xn.a("l", (int)2581, (long)(0x6200193C23A46C27L ^ l10)), (long)5657487847824675743L, (long)l10)));
        this.F = jU.R(this, (String)((Object)xn.c("\u00a3", (int)xn.a("l", (int)5214, (long)(0x554ED19D3B4CF270L ^ l10)), (long)5657487847824675743L, (long)l10)), false, (String)((Object)xn.c("\u00a3", (int)xn.a("l", (int)15887, (long)(0x21CC68F5A22BD829L ^ l10)), (long)5657487847824675743L, (long)l10)));
        this.x = jU.R(this, (String)((Object)xn.c("\u00a3", (int)xn.a("l", (int)2336, (long)(0x238657E208F06F11L ^ l10)), (long)5657487847824675743L, (long)l10)), false, (String)((Object)xn.c("\u00a3", (int)xn.a("l", (int)1481, (long)(0x48CFAB3FBF0163E1L ^ l10)), (long)5657487847824675743L, (long)l10)));
        this.d = js.D(this, (String)((Object)xn.c("\u00a3", (int)xn.a("l", (int)12514, (long)(0x7E04C15F8162D6C7L ^ l10)), (long)5657487847824675743L, (long)l10)), (String)((Object)xn.c("\u00a3", (int)xn.a("l", (int)106, (long)(0x1E477BF526E65AL ^ l10)), (long)5657487847824675743L, (long)l10)), "", 0.0, 50.0, 100.0, 1.0, (String)((Object)xn.c("\u00a3", (int)xn.a("l", (int)4809, (long)(0x7DECA6438F5374E8L ^ l10)), (long)5657487847824675743L, (long)l10)));
        this.n = new ConcurrentLinkedQueue<NH>();
        this.B = false;
        this.e = false;
        this.v = false;
        this.o = EP.r();
        this.x.l(this.d);
        this.N(this.G, this.L, this.R, this.F, this.x, this.d);
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private void G() {
        this.Z = 0;
        this.n.clear();
        this.w.clear();
    }

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (A[n5] != null) {
            return n5;
        }
        Object object = z[n5];
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
                n4 = 42;
                break;
            }
            case 2: {
                n4 = 48;
                break;
            }
            case 3: {
                n4 = 52;
                break;
            }
            case 4: {
                n4 = 9;
                break;
            }
            case 5: {
                n4 = 62;
                break;
            }
            case 6: {
                n4 = 35;
                break;
            }
            case 7: {
                n4 = 57;
                break;
            }
            case 8: {
                n4 = 51;
                break;
            }
            case 9: {
                n4 = 46;
                break;
            }
            case 10: {
                n4 = 63;
                break;
            }
            case 11: {
                n4 = 0;
                break;
            }
            case 12: {
                n4 = 40;
                break;
            }
            case 13: {
                n4 = 12;
                break;
            }
            case 14: {
                n4 = 33;
                break;
            }
            case 15: {
                n4 = 28;
                break;
            }
            case 16: {
                n4 = 49;
                break;
            }
            case 17: {
                n4 = 13;
                break;
            }
            case 18: {
                n4 = 15;
                break;
            }
            case 19: {
                n4 = 26;
                break;
            }
            case 20: {
                n4 = 38;
                break;
            }
            case 21: {
                n4 = 36;
                break;
            }
            case 22: {
                n4 = 25;
                break;
            }
            case 23: {
                n4 = 10;
                break;
            }
            case 24: {
                n4 = 11;
                break;
            }
            case 25: {
                n4 = 6;
                break;
            }
            case 26: {
                n4 = 24;
                break;
            }
            case 27: {
                n4 = 47;
                break;
            }
            case 28: {
                n4 = 32;
                break;
            }
            case 29: {
                n4 = 23;
                break;
            }
            case 30: {
                n4 = 27;
                break;
            }
            case 31: {
                n4 = 31;
                break;
            }
            case 32: {
                n4 = 5;
                break;
            }
            case 33: {
                n4 = 16;
                break;
            }
            case 34: {
                n4 = 7;
                break;
            }
            case 35: {
                n4 = 53;
                break;
            }
            case 36: {
                n4 = 61;
                break;
            }
            case 37: {
                n4 = 54;
                break;
            }
            case 38: {
                n4 = 56;
                break;
            }
            case 39: {
                n4 = 2;
                break;
            }
            case 40: {
                n4 = 44;
                break;
            }
            case 41: {
                n4 = 58;
                break;
            }
            case 42: {
                n4 = 60;
                break;
            }
            case 43: {
                n4 = 19;
                break;
            }
            case 44: {
                n4 = 37;
                break;
            }
            case 45: {
                n4 = 3;
                break;
            }
            case 46: {
                n4 = 22;
                break;
            }
            case 47: {
                n4 = 41;
                break;
            }
            case 48: {
                n4 = 34;
                break;
            }
            case 49: {
                n4 = 29;
                break;
            }
            case 50: {
                n4 = 55;
                break;
            }
            case 51: {
                n4 = 43;
                break;
            }
            case 52: {
                n4 = 4;
                break;
            }
            case 53: {
                n4 = 50;
                break;
            }
            case 54: {
                n4 = 18;
                break;
            }
            case 55: {
                n4 = 8;
                break;
            }
            case 56: {
                n4 = 21;
                break;
            }
            case 57: {
                n4 = 14;
                break;
            }
            case 58: {
                n4 = 45;
                break;
            }
            case 59: {
                n4 = 39;
                break;
            }
            case 60: {
                n4 = 20;
                break;
            }
            case 61: {
                n4 = 17;
                break;
            }
            case 62: {
                n4 = 59;
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
        xn.A[n5] = new String(cArray);
        return n5;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = xn.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = xn.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private boolean W(Vt vt2) {
        boolean bl2;
        block5: {
            block4: {
                long l10 = b ^ 0x305ED805A1F1L;
                try {
                    try {
                        if (!vt2.M().getClass().toString().contains((CharSequence)((Object)xn.c("\u00a3", (int)xn.a("l", (int)17830, (long)(0x166ED33BAABE2273L ^ l10)), (long)5725288177921086056L, (long)l10))) && !vt2.M().toString().contains((CharSequence)((Object)xn.c("\u00a3", (int)xn.a("l", (int)4134, (long)(0x33EE5C3C6ED377FCL ^ l10)), (long)5725288177921086056L, (long)l10)))) break block4;
                    }
                    catch (O_ o_2) {
                        throw xn.a(o_2);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (O_ o_3) {
                    throw xn.a(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(xn.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(xn.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

