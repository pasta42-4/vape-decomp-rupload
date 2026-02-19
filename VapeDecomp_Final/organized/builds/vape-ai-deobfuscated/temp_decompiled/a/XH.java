/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.A2;
import a.EP;
import a.Na;
import a.OY;
import a.O_;
import a.Qg;
import a.SE;
import a.V9;
import a.VG;
import a.Vt;
import a._Y;
import a.d8;
import a.eM;
import a.jU;
import a.js;
import a.kW;
import a.kg;
import a.p_;
import a.pa;
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
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class xh
extends x4<A2> {
    private static final long d;
    public final js j;
    private final jU A;
    private static final Object[] n;
    private static final String[] r;
    private int G;
    private final js P;
    private kg l;
    private static final Map m;
    private static final Integer[] h;
    private final js N;
    private static final long[] e;
    private final jU x;
    public final js o;
    private final js L;

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                xh.d = d8.a(-3543053282867604258L, -2411543353366620593L, MethodHandles.lookup().lookupClass()).a(26691561906918L);
                xh.n = new Object[5];
                xh.r = new String[5];
                xh.a();
                xh.m = new HashMap<K, V>(13);
                var0 = xh.d ^ 68617270528690L;
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
                var6_5 = "\u00d4}\u00d0\u00ed\u00f4\u00b1^\u00e6\u00a7\u00fb\u00e9\u00e0\t\u008b\t^\u00b2\u0012\u0011\u001e\u0019\u00ab\u0091\u00f0\u0019\u00db\u00ff\u00b3!q\u00afc\u00e0+q\f\u00bea\u00b8\u00ac\u00054\u00aa\u0011Z\u0092&M\u00eb\u0098fj\u000fd\u00b7\u00bd\u009e[T\u001e\u00a5Se'J\u000e\u000e\u00e6\u00ab\u00bd\u0006\b\u00a2\u00bc\u008a\u00cf\u00b2\u00f9n{\u0085\u008b\u00f6?~\u009a\u0082\u00b0\u00fc\u00d0\u009e)\u00cc)\u00b3l\t\u00c8\u00c8\u00c2\u00c8Irx\u00f44\u00a2\u00fb\u0096\u001a\u001e\u00c3\u001f\u00cei\u00ff\u00cb\u009a0}H\u009a\u000e\u001eJ$h\u00e9*d\u00c0i\u00c6\u001a\u00c9\u00d9\u00f1\u00fb{8{\u0004\\\u0080\u00fcU&\u00af\u0018\u00cc\u008e\u00e7\u00b4o(\u00ad\u00f0A\u00a7\u00cd\u00afw\nx\u00c7\u00d3\u00c2-6\u00fd\u00b8\u00c4\u00c8\u00c5N\u00bd";
                var7_6 = "\u00d4}\u00d0\u00ed\u00f4\u00b1^\u00e6\u00a7\u00fb\u00e9\u00e0\t\u008b\t^\u00b2\u0012\u0011\u001e\u0019\u00ab\u0091\u00f0\u0019\u00db\u00ff\u00b3!q\u00afc\u00e0+q\f\u00bea\u00b8\u00ac\u00054\u00aa\u0011Z\u0092&M\u00eb\u0098fj\u000fd\u00b7\u00bd\u009e[T\u001e\u00a5Se'J\u000e\u000e\u00e6\u00ab\u00bd\u0006\b\u00a2\u00bc\u008a\u00cf\u00b2\u00f9n{\u0085\u008b\u00f6?~\u009a\u0082\u00b0\u00fc\u00d0\u009e)\u00cc)\u00b3l\t\u00c8\u00c8\u00c2\u00c8Irx\u00f44\u00a2\u00fb\u0096\u001a\u001e\u00c3\u001f\u00cei\u00ff\u00cb\u009a0}H\u009a\u000e\u001eJ$h\u00e9*d\u00c0i\u00c6\u001a\u00c9\u00d9\u00f1\u00fb{8{\u0004\\\u0080\u00fcU&\u00af\u0018\u00cc\u008e\u00e7\u00b4o(\u00ad\u00f0A\u00a7\u00cd\u00afw\nx\u00c7\u00d3\u00c2-6\u00fd\u00b8\u00c4\u00c8\u00c5N\u00bd".length();
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
                    var6_5 = "J\u0005\u00fb\u009eU\u00c8\u00adb\u00d2\u00fc\u008d\t\u00c5\u00a4f\u0083";
                    var7_6 = "J\u0005\u00fb\u009eU\u00c8\u00adb\u00d2\u00fc\u008d\t\u00c5\u00a4f\u0083".length();
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
        xh.e = var8_3;
        xh.h = new Integer[24];
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00d5' || c10 == 'V' || c10 == '\u00e1' || c10 == '\u00f3') {
                field = xh.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00d5' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'V' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00e1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = xh.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00e5' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00a5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public xh(xi xi2, String string) {
        long l10 = d ^ 0x25738FFFF845L;
        super(xi2, string);
        this.x = jU.R(this, (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)26831, (long)(0xB9186FFD089F268L ^ l10)), (long)4181607648319342755L, (long)l10)), false, (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)29731, (long)(0x54320F67066AEE97L ^ l10)), (long)4181607648319342755L, (long)l10)));
        this.A = jU.R(this, (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)23866, (long)(0x3EC3EF61282C479EL ^ l10)), (long)4181607648319342755L, (long)l10)), false, (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)11260, (long)(0xC82C7E3E4FAB159L ^ l10)), (long)4181607648319342755L, (long)l10)));
        this.o = js.t(this, (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)16117, (long)(0x162842118DCF245FL ^ l10)), (long)4181607648319342755L, (long)l10)), (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)7612, (long)(0x20DE5110A52871DL ^ l10)), (long)4181607648319342755L, (long)l10)), (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)16427, (long)(0x6B24E001F9685A9BL ^ l10)), (long)4181607648319342755L, (long)l10)), 0.0, 90.0, 100.0);
        this.j = js.t(this, (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)7670, (long)(0x40D6BB4949F2875FL ^ l10)), (long)4181607648319342755L, (long)l10)), (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)17784, (long)(0x13C61E2B75445FD4L ^ l10)), (long)4181607648319342755L, (long)l10)), (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)18815, (long)(0x56CE6A85606753D0L ^ l10)), (long)4181607648319342755L, (long)l10)), 0.0, 100.0, 100.0);
        this.P = js.D(this, (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)27228, (long)(0x4D11F865F408F0F7L ^ l10)), (long)4181607648319342755L, (long)l10)), (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)14514, (long)(0x193FEE928307A212L ^ l10)), (long)4181607648319342755L, (long)l10)), "", 0.0, 1.0, 10.0, 1.0, (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)19692, (long)(0x6BD815F179B8564EL ^ l10)), (long)4181607648319342755L, (long)l10)));
        this.L = js.t(this, (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)13389, (long)(0x2B3DBAB74ABEAEE3L ^ l10)), (long)4181607648319342755L, (long)l10)), (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)23416, (long)(0x4F63B3E2164241DBL ^ l10)), (long)4181607648319342755L, (long)l10)), (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)26629, (long)(0x7D07CC21A7FB72B2L ^ l10)), (long)4181607648319342755L, (long)l10)), 100.0, 120.0, 300.0);
        this.N = js.t(this, (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)5360, (long)(0x921716497230E45L ^ l10)), (long)4181607648319342755L, (long)l10)), (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)12218, (long)(0x25407784D1A3B50CL ^ l10)), (long)4181607648319342755L, (long)l10)), (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)6458, (long)(0x7618DD967870839CL ^ l10)), (long)4181607648319342755L, (long)l10)), 100.0, 120.0, 300.0);
        this.G = 0;
        this.l = null;
        this.x.l(this.L, this.N, this.A);
        this.N(this.o, this.j, this.P, this.x, this.L, this.N, this.A);
        this.j.L(0);
        this.o.L(0);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = xh.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method d(long l10, long l11) {
        int n2 = xh.a(l10, l11);
        Object object = n[n2];
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
                clazz3 = xh.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = xh.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = xh.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        xh.n[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = xh.b(242385708596205L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = xh.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        xh.n[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = xh.b(242385708596205L, 0L);
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

    private void lambda$onPacketReceived$0(pa pa2, Vt vt2) {
        this.P(vt2, pa2);
    }

    private void P(Vt vt2, pa pa2) {
        block70: {
            double d2;
            double d3;
            double d4;
            double d5;
            double d6;
            double[] dArray;
            double d7;
            double d9;
            double d10;
            boolean bl2;
            boolean bl3;
            Qg qg2;
            Vt vt3;
            block66: {
                if (vt2.B(eM.Ub)) {
                    block60: {
                        block59: {
                            vt3 = new V9(vt2);
                            qg2 = EP.U();
                            bl3 = _Y.c(qg2);
                            bl2 = _Y.a(qg2);
                            try {
                                if (!this.x.s().booleanValue() || !this.A.s().booleanValue()) break block59;
                            }
                            catch (O_ o_2) {
                                throw xh.a(o_2);
                            }
                            bl2 = false;
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (!bl3 || bl2) break block60;
                                    }
                                    catch (O_ o_3) {
                                        throw xh.a(o_3);
                                    }
                                    if (this.x.s().booleanValue()) break block60;
                                }
                                catch (O_ o_4) {
                                    throw xh.a(o_4);
                                }
                                if (!((A2)this.n()).r.s().booleanValue()) break block60;
                            }
                            catch (O_ o_5) {
                                throw xh.a(o_5);
                            }
                            return;
                        }
                        catch (O_ o_6) {
                            throw xh.a(o_6);
                        }
                    }
                    if (((A2)this.n()).B()) {
                        block62: {
                            boolean bl4;
                            block65: {
                                block64: {
                                    block61: {
                                        d10 = ((V9)vt3).r();
                                        d9 = ((V9)vt3).v();
                                        d7 = ((V9)vt3).x();
                                        try {
                                            try {
                                                if (!bl3 || bl2) break block61;
                                            }
                                            catch (O_ o_7) {
                                                throw xh.a(o_7);
                                            }
                                            if (!this.x.s().booleanValue()) break block61;
                                        }
                                        catch (O_ o_8) {
                                            throw xh.a(o_8);
                                        }
                                        double d11 = (Double)this.L.J() / 100.0;
                                        double d12 = (Double)this.N.J() / 100.0;
                                        double d13 = this.M(d10, d11);
                                        double d14 = this.M(d9, d12);
                                        double d15 = this.M(d7, d11);
                                        ((V9)vt3).h((float)d13);
                                        ((V9)vt3).v((float)d14);
                                        ((V9)vt3).a((float)d15);
                                        return;
                                    }
                                    try {
                                        block63: {
                                            try {
                                                try {
                                                    try {
                                                        if (!((Double)this.P.J() > 0.0)) break block62;
                                                        if ((double)Math.abs(((V9)vt3).r()) >= 0.005) break block63;
                                                    }
                                                    catch (O_ o_9) {
                                                        throw xh.a(o_9);
                                                    }
                                                    if ((double)Math.abs(((V9)vt3).v()) >= 0.005) break block63;
                                                }
                                                catch (O_ o_10) {
                                                    throw xh.a(o_10);
                                                }
                                                if (!((double)Math.abs(((V9)vt3).x()) >= 0.005)) break block64;
                                            }
                                            catch (O_ o_11) {
                                                throw xh.a(o_11);
                                            }
                                        }
                                        bl4 = true;
                                        break block65;
                                    }
                                    catch (O_ o_12) {
                                        throw xh.a(o_12);
                                    }
                                }
                                bl4 = false;
                            }
                            boolean bl5 = bl4;
                            try {
                                if (bl5) {
                                    this.G = ((Double)this.P.J()).intValue();
                                    this.l = new kg(((V9)vt3).r(), ((V9)vt3).v(), ((V9)vt3).x());
                                }
                            }
                            catch (O_ o_13) {
                                throw xh.a(o_13);
                            }
                            return;
                        }
                        dArray = this.b();
                        d6 = dArray[0] / 100.0;
                        d5 = dArray[1] / 100.0;
                        d4 = this.M(d10, d6);
                        d3 = this.M(d9, d5);
                        d2 = this.M(d7, d6);
                        try {
                            try {
                                ((V9)vt3).h((float)d4);
                                ((V9)vt3).v((float)d3);
                                ((V9)vt3).a((float)d2);
                                if (d6 != 0.0 || d5 != 0.0) break block66;
                            }
                            catch (O_ o_14) {
                                throw xh.a(o_14);
                            }
                            ((V9)vt3).h(0.0f);
                            ((V9)vt3).v(0.0f);
                            ((V9)vt3).a(0.0f);
                        }
                        catch (O_ o_15) {
                            throw xh.a(o_15);
                        }
                    }
                }
            }
            if (vt2.B(eM.bh)) {
                vt3 = new VG(vt2);
                qg2 = EP.U();
                try {
                    if (qg2.Y()) {
                        return;
                    }
                }
                catch (O_ o_16) {
                    throw xh.a(o_16);
                }
                if (((VG)vt3).h() == qg2.X()) {
                    block68: {
                        block67: {
                            bl3 = _Y.c(qg2);
                            bl2 = _Y.a(qg2);
                            try {
                                if (!this.x.s().booleanValue() || !this.A.s().booleanValue()) break block67;
                            }
                            catch (O_ o_17) {
                                throw xh.a(o_17);
                            }
                            bl2 = false;
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (bl3 || bl2) break block68;
                                    }
                                    catch (O_ o_18) {
                                        throw xh.a(o_18);
                                    }
                                    if (this.x.s().booleanValue()) break block68;
                                }
                                catch (O_ o_19) {
                                    throw xh.a(o_19);
                                }
                                if (!((A2)this.n()).r.s().booleanValue()) break block68;
                            }
                            catch (O_ o_20) {
                                throw xh.a(o_20);
                            }
                            return;
                        }
                        catch (O_ o_21) {
                            throw xh.a(o_21);
                        }
                    }
                    if (((A2)this.n()).B()) {
                        block69: {
                            d10 = ((VG)vt3).K();
                            d9 = ((VG)vt3).I();
                            d7 = ((VG)vt3).o();
                            if (Na.MC_1_21_10.H()) {
                                d10 /= 8000.0;
                                d9 /= 8000.0;
                                d7 /= 8000.0;
                            }
                            try {
                                try {
                                    if (!bl3 || bl2) break block69;
                                }
                                catch (O_ o_22) {
                                    throw xh.a(o_22);
                                }
                                if (!this.x.s().booleanValue()) break block69;
                            }
                            catch (O_ o_23) {
                                throw xh.a(o_23);
                            }
                            double d16 = (Double)this.L.J() / 100.0;
                            double d17 = (Double)this.N.J() / 100.0;
                            double d18 = d10 * d16;
                            double d19 = d9 * d17;
                            double d20 = d7 * d16;
                            ((VG)vt3).Y(d18);
                            ((VG)vt3).c(d19);
                            ((VG)vt3).U(d20);
                            return;
                        }
                        try {
                            if ((Double)this.P.J() > 0.0) {
                                this.G = ((Double)this.P.J()).intValue();
                                this.l = new kg((double)((VG)vt3).K() / 8000.0, (double)((VG)vt3).I() / 8000.0, (double)((VG)vt3).o() / 8000.0);
                                return;
                            }
                        }
                        catch (O_ o_24) {
                            throw xh.a(o_24);
                        }
                        dArray = this.b();
                        d6 = dArray[0] / 100.0;
                        d5 = dArray[1] / 100.0;
                        d4 = d10 * d6;
                        d3 = d9 * d5;
                        d2 = d7 * d6;
                        try {
                            try {
                                ((VG)vt3).Y(d4);
                                ((VG)vt3).c(d3);
                                ((VG)vt3).U(d2);
                                if (d6 != 0.0 || d5 != 0.0) break block70;
                            }
                            catch (O_ o_25) {
                                throw xh.a(o_25);
                            }
                            ((VG)vt3).Y(0.0);
                            ((VG)vt3).c(0.0);
                            ((VG)vt3).U(0.0);
                        }
                        catch (O_ o_26) {
                            throw xh.a(o_26);
                        }
                    }
                }
            }
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = xh.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = xh.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @OY
    public void H(pa pa2) {
        try {
            if (((A2)this.n()).R()) {
                return;
            }
        }
        catch (Exception exception) {
            throw xh.a(exception);
        }
        try {
            if (pa2.getPacketInstance() == null) {
                return;
            }
            Vt vt2 = pa2.getPacket();
            Vt.A(vt2, arg_0 -> this.lambda$onPacketReceived$0(pa2, arg_0));
        }
        catch (Exception exception) {
            SE.W(exception);
        }
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = xh.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = xh.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = n;
        n[0] = "J3V";
        objectArray[1] = Integer.TYPE;
        xh.r[1] = "java/lang/Integer";
        objectArray[2] = "c\u000e2}^[h\u0001#2#C{\u0006*{";
        objectArray[3] = "\n\u001e\u0014ogS\u0001\u0011\u0005 \u0006]\n\u001a\u0001z";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "]\u000b#\u001bT\bP\u0004 $D\u001f`\u001e.BL\r\u000b]/U/]\u001a]5CL\u001f\u0011\u0000 $";
    }

    private double[] b() {
        double d2;
        double d3 = (Double)this.o.J();
        double d4 = (Double)this.j.J();
        Random random = new Random();
        double d5 = random.nextDouble();
        if (d3 > 0.0) {
            d2 = d3 + (d3 + 5.0 - d3) * d5;
            if (d2 >= 100.0) {
                d2 = 100.0;
            }
            d3 = d2;
        }
        if (d4 > 0.0) {
            d2 = d4 + (d4 + 5.0 - d4) * d5;
            if (d2 >= 90.0) {
                d2 = 100.0;
            }
            d4 = d2;
        }
        return new double[]{d3, d4};
    }

    @Override
    public String t() {
        long l10 = d ^ 0x26E02E8D2E8EL;
        return this.o.p() + (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)20529, (long)(0x78D1730C5DE41C48L ^ l10)), (long)-1386249331441181080L, (long)l10)) + this.j.p() + (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)11246, (long)(0x361C35A4A394E78DL ^ l10)), (long)-1386249331441181080L, (long)l10));
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
        int n3 = xh.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (r[n5] != null) {
            return n5;
        }
        Object object = n[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 15;
                break;
            }
            case 1: {
                n4 = 29;
                break;
            }
            case 2: {
                n4 = 43;
                break;
            }
            case 3: {
                n4 = 16;
                break;
            }
            case 4: {
                n4 = 8;
                break;
            }
            case 5: {
                n4 = 6;
                break;
            }
            case 6: {
                n4 = 41;
                break;
            }
            case 7: {
                n4 = 18;
                break;
            }
            case 8: {
                n4 = 40;
                break;
            }
            case 9: {
                n4 = 59;
                break;
            }
            case 10: {
                n4 = 34;
                break;
            }
            case 11: {
                n4 = 31;
                break;
            }
            case 12: {
                n4 = 4;
                break;
            }
            case 13: {
                n4 = 62;
                break;
            }
            case 14: {
                n4 = 7;
                break;
            }
            case 15: {
                n4 = 47;
                break;
            }
            case 16: {
                n4 = 61;
                break;
            }
            case 17: {
                n4 = 60;
                break;
            }
            case 18: {
                n4 = 45;
                break;
            }
            case 19: {
                n4 = 28;
                break;
            }
            case 20: {
                n4 = 48;
                break;
            }
            case 21: {
                n4 = 38;
                break;
            }
            case 22: {
                n4 = 57;
                break;
            }
            case 23: {
                n4 = 37;
                break;
            }
            case 24: {
                n4 = 49;
                break;
            }
            case 25: {
                n4 = 11;
                break;
            }
            case 26: {
                n4 = 3;
                break;
            }
            case 27: {
                n4 = 39;
                break;
            }
            case 28: {
                n4 = 21;
                break;
            }
            case 29: {
                n4 = 12;
                break;
            }
            case 30: {
                n4 = 35;
                break;
            }
            case 31: {
                n4 = 13;
                break;
            }
            case 32: {
                n4 = 1;
                break;
            }
            case 33: {
                n4 = 27;
                break;
            }
            case 34: {
                n4 = 50;
                break;
            }
            case 35: {
                n4 = 20;
                break;
            }
            case 36: {
                n4 = 63;
                break;
            }
            case 37: {
                n4 = 33;
                break;
            }
            case 38: {
                n4 = 25;
                break;
            }
            case 39: {
                n4 = 32;
                break;
            }
            case 40: {
                n4 = 52;
                break;
            }
            case 41: {
                n4 = 23;
                break;
            }
            case 42: {
                n4 = 0;
                break;
            }
            case 43: {
                n4 = 17;
                break;
            }
            case 44: {
                n4 = 55;
                break;
            }
            case 45: {
                n4 = 51;
                break;
            }
            case 46: {
                n4 = 58;
                break;
            }
            case 47: {
                n4 = 5;
                break;
            }
            case 48: {
                n4 = 22;
                break;
            }
            case 49: {
                n4 = 9;
                break;
            }
            case 50: {
                n4 = 10;
                break;
            }
            case 51: {
                n4 = 30;
                break;
            }
            case 52: {
                n4 = 53;
                break;
            }
            case 53: {
                n4 = 54;
                break;
            }
            case 54: {
                n4 = 56;
                break;
            }
            case 55: {
                n4 = 46;
                break;
            }
            case 56: {
                n4 = 36;
                break;
            }
            case 57: {
                n4 = 2;
                break;
            }
            case 58: {
                n4 = 44;
                break;
            }
            case 59: {
                n4 = 42;
                break;
            }
            case 60: {
                n4 = 24;
                break;
            }
            case 61: {
                n4 = 19;
                break;
            }
            case 62: {
                n4 = 14;
                break;
            }
            default: {
                n4 = 26;
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
        xh.r[n5] = new String(cArray);
        return n5;
    }

    @OY
    public void n(p_ p_2) {
        block11: {
            block13: {
                double d2;
                Qg qg2;
                block14: {
                    block12: {
                        try {
                            if (((A2)this.n()).R()) {
                                this.l = null;
                                this.G = 0;
                                return;
                            }
                        }
                        catch (O_ o_2) {
                            throw xh.a(o_2);
                        }
                        try {
                            try {
                                if (this.l == null) break block11;
                                if (this.G <= 0) break block12;
                                break block13;
                            }
                            catch (O_ o_3) {
                                throw xh.a(o_3);
                            }
                        }
                        catch (O_ o_4) {
                            throw xh.a(o_4);
                        }
                    }
                    qg2 = EP.U();
                    double[] dArray = this.b();
                    d2 = dArray[0] / 100.0;
                    double d3 = dArray[1] / 100.0;
                    double d4 = qg2.x();
                    try {
                        try {
                            if (this.l.w == 0.0 || !(d4 > 0.0)) break block14;
                        }
                        catch (O_ o_5) {
                            throw xh.a(o_5);
                        }
                        qg2.z(this.M(qg2.x(), d3));
                    }
                    catch (O_ o_6) {
                        throw xh.a(o_6);
                    }
                }
                qg2.t(this.M(qg2.G(), d2));
                qg2.s(this.M(qg2.o(), d2));
                this.l = null;
            }
            --this.G;
        }
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x20AC;
        if (h[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = e[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])m.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    m.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/xh", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            xh.h[n3] = n4;
        }
        return h[n3];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static Field c(long l10, long l11) {
        int n2 = xh.a(l10, l11);
        Object object = n[n2];
        if (object instanceof String) {
            String string = r[n2];
            int n3 = string.indexOf(8);
            Class clazz = xh.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = xh.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = xh.a(clazz3, string2, clazz2)) != null) {
                    xh.n[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = xh.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        xh.n[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = xh.b(242385708596205L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = xh.a(l10, l11);
            object = n[n2];
            try {
                if (!(object instanceof String)) break block2;
                xh.n[n2] = clazz = Class.forName(r[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private double M(double d2, double d3) {
        boolean bl2;
        CallSite callSite;
        long l10 = d ^ 0x617E795BE54CL;
        String string = Double.toString(Math.abs(d2));
        try {
            callSite = string.contains((CharSequence)((Object)xh.c("\u00a5", (int)xh.a("s", (int)31740, (long)(0x4A54D629DE19FC58L ^ l10)), (long)2810609065146029482L, (long)l10))) ? xh.c("\u00a5", (int)xh.a("s", (int)2652, (long)(0x6395B829A1478DE6L ^ l10)), (long)2810609065146029482L, (long)l10) : xh.c("\u00a5", (int)xh.a("s", (int)2819, (long)(0x11E5108908868CBBL ^ l10)), (long)2810609065146029482L, (long)l10);
        }
        catch (O_ o_2) {
            throw xh.a(o_2);
        }
        CallSite callSite2 = callSite;
        int n2 = string.indexOf((String)((Object)callSite2));
        int n3 = string.length() - n2 - 1;
        kW kW2 = new kW(n3);
        try {
            bl2 = d3 < 0.0;
        }
        catch (O_ o_3) {
            throw xh.a(o_3);
        }
        boolean bl3 = bl2;
        double d4 = Math.abs(d3);
        double d5 = d2 * d4;
        if (bl3) {
            d5 = -d5;
        }
        return kW2.U(d5);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(xh.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(xh.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

