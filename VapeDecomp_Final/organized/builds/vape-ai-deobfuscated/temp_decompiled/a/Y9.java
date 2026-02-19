/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.Ao;
import a.C_;
import a.F8;
import a.I_;
import a.JF;
import a.JP;
import a.OX;
import a.O_;
import a.SE;
import a.T1;
import a.TE;
import a.X_;
import a.YX;
import a.bE;
import a.bM;
import a.d8;
import a.fB;
import a.fr;
import a.hr;
import a.iP;
import a.iz;
import a.rn;
import a.w6;
import a.wl;
import a.yG;
import a.yY;
import java.awt.Color;
import java.awt.Point;
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
import org.jetbrains.annotations.Nullable;

public class y9
extends yY {
    private static final Integer[] eb;
    private static String[] mm;
    private fB ms;
    private static final long ab;
    private JF ml;
    private final yG ma;
    private static final long[] bb;
    private final hr mh;
    private bM mp;
    private static final String[] ob;
    private final bE mq;
    private static final Map fb;
    private wl mr;
    private String m_;
    private boolean mi;
    private static final Object[] lb;
    private final rn mb;

    private void D(Point point, iz iz2) {
        this.mr = new wl(this.ml);
        this.ms = Ao.v(this, this.mr, fB.class);
        this.mr.I().N(new YX(this));
    }

    private void lambda$leaveAction$2(fB fB2) {
        Ao.z(fB2);
        I_.h().c().O(y9::lambda$null$0, this::lambda$null$1);
    }

    private static void lambda$leaveAction$4(T1 t12) {
    }

    private static Method l(long l10, long l11) {
        int n2 = y9.i(l10, l11);
        Object object = lb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = ob[n2];
                int n4 = string2.indexOf(8);
                clazz3 = y9.j(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = y9.j(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = y9.e(clazz, string, clazz2, n3, classArray2)) != null) {
                        y9.lb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = y9.j(235029927961667L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = y9.f(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        y9.lb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = y9.j(235029927961667L, 0L);
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

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = y9.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = y9.f(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field k(long l10, long l11) {
        int n2 = y9.i(l10, l11);
        Object object = lb[n2];
        if (object instanceof String) {
            String string = ob[n2];
            int n3 = string.indexOf(8);
            Class clazz = y9.j(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = y9.j(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = y9.e(clazz3, string2, clazz2)) != null) {
                    y9.lb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = y9.f(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        y9.lb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = y9.j(235029927961667L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static void x() {
        Object[] objectArray = lb;
        lb[0] = "C\n&";
        objectArray[1] = Integer.TYPE;
        y9.ob[1] = "java/lang/Integer";
        objectArray[2] = "!%j\"\\>**{m!&9-r$";
        objectArray[3] = "peJ;\u0004I{j[teGpa_.";
        Object[] objectArray2 = objectArray;
        objectArray[4] = ":]\u001f\u0011K!2\bIk]dPO\\ROa4ANP6&2B\u001f\u0017Go3KMk";
    }

    static wl J(y9 y92, wl wl2) {
        y92.mr = wl2;
        return y92.mr;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = y9.c(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private void y() {
        block5: {
            block6: {
                long l10 = ab ^ 0x5A53982AED8FL;
                try {
                    if (this.mi) {
                        return;
                    }
                }
                catch (O_ o_2) {
                    throw y9.a(o_2);
                }
                try {
                    this.mi = true;
                    if (this.ml == null) break block5;
                    if (!this.ml.R().equals(SE.h.O().n())) break block6;
                }
                catch (O_ o_3) {
                    throw y9.a(o_3);
                }
                C_ c_2 = new C_((String)((Object)y9.d("h", (int)y9.c("j", (int)15428, (long)(0x2682BB31471581A1L ^ l10)), (long)-8704863214216582116L, (long)l10)), (String)((Object)y9.d("h", (int)y9.c("j", (int)22692, (long)(0xF130A79A219E54BL ^ l10)), (long)-8704863214216582116L, (long)l10)), (String)((Object)y9.d("h", (int)y9.c("j", (int)22511, (long)(0x5438E53192356A0CL ^ l10)), (long)-8704863214216582116L, (long)l10)));
                fr fr2 = Ao.v(this.V(), c_2, fr.class);
                c_2.Z().N(() -> this.lambda$leaveAction$2(fr2));
                c_2.u().N(() -> this.lambda$leaveAction$3(fr2));
                fr2.r(this.V(), fr2);
                break block5;
            }
            I_.h().c().d(y9::lambda$leaveAction$4, this::lambda$leaveAction$5);
        }
    }

    static fB K(y9 y92, fB fB2) {
        y92.ms = fB2;
        return y92.ms;
    }

    @Override
    public void E() {
        long l10 = ab ^ 0x1D9F293D0784L;
        try {
            if (this.ml == null) {
                return;
            }
        }
        catch (O_ o_2) {
            throw y9.a(o_2);
        }
        F8.S(this.G(), this.W(), this.w(), this.b() - 2.0, y9.M.g.brighter());
        F8.S(this.G(), this.W(), this.w(), this.b() - 2.0, this.mb.k());
        float f10 = (float)(this.G() + 6.0);
        float f11 = (float)(this.W() + 4.0);
        X_.B(y9.M.Y, f10, f11, (String)((Object)y9.d("h", (int)y9.c("j", (int)11021, (long)(0x6A1F7A8805107CEAL ^ l10)), (long)7870421648968943127L, (long)l10)), 7.0f, 6.3f, false);
        X_.B(y9.M.Y, (float)(this.G() + this.w() - 22.0), (float)this.W() - 0.5f, (String)((Object)y9.d("h", (int)y9.c("j", (int)544, (long)(0x6B4D6AF0D9FBD5CCL ^ l10)), (long)7870421648968943127L, (long)l10)), 14.5f, 14.5f, false);
        super.E();
    }

    private void lambda$leaveAction$3(fB fB2) {
        Ao.z(fB2);
        this.mi = false;
    }

    public static String[] g() {
        return mm;
    }

    @Override
    public void d() {
        block15: {
            long l10;
            block12: {
                block14: {
                    block13: {
                        boolean bl2;
                        y9 y92;
                        l10 = ab ^ 0x73B98C80CAA9L;
                        try {
                            if (SE.h.O() == null) {
                                return;
                            }
                        }
                        catch (O_ o_2) {
                            throw y9.a(o_2);
                        }
                        try {
                            this.mb.C(this.s());
                            this.ml = SE.h.O().p().Q();
                            y92 = this;
                            bl2 = this.ml != null;
                        }
                        catch (O_ o_3) {
                            throw y9.a(o_3);
                        }
                        try {
                            try {
                                y92.N(bl2);
                                if (this.ml == null) break block12;
                                if (!this.ml.R().equals(SE.h.O().n())) break block13;
                            }
                            catch (O_ o_4) {
                                throw y9.a(o_4);
                            }
                            this.mh.z((String)((Object)y9.d("h", (int)y9.c("j", (int)10996, (long)(0x2ACA0DBD6B6303CL ^ l10)), (long)-6911841335613109446L, (long)l10)));
                            this.mh.g((String)((Object)y9.d("h", (int)y9.c("j", (int)2203, (long)(0x4CD8A453417F125BL ^ l10)), (long)-6911841335613109446L, (long)l10)));
                            this.mh.Y(23.0);
                            this.mh.T(23.0);
                            this.g((String)((Object)y9.d("h", (int)y9.c("j", (int)27858, (long)(0x7D45B5F8C027F61FL ^ l10)), (long)-6911841335613109446L, (long)l10)));
                            this.m_ = y9.d("h", (int)y9.c("j", (int)27331, (long)(0x6193D755CF62F00CL ^ l10)), (long)-6911841335613109446L, (long)l10);
                            break block14;
                        }
                        catch (O_ o_5) {
                            throw y9.a(o_5);
                        }
                    }
                    this.mh.z((String)((Object)y9.d("h", (int)y9.c("j", (int)19952, (long)(0x1316F40080C5D736L ^ l10)), (long)-6911841335613109446L, (long)l10)));
                    this.mh.g((String)((Object)y9.d("h", (int)y9.c("j", (int)11667, (long)(0x31F434A4924FB757L ^ l10)), (long)-6911841335613109446L, (long)l10)));
                    this.g((String)((Object)y9.d("h", (int)y9.c("j", (int)196, (long)(0x79861F2934C49A10L ^ l10)), (long)-6911841335613109446L, (long)l10)));
                    this.mh.Y(18.0);
                    this.mh.T(18.0);
                    this.m_ = this.ml.R().j() + (String)((Object)y9.d("h", (int)y9.c("j", (int)15600, (long)(0x3FB60D2A544B2632L ^ l10)), (long)-6911841335613109446L, (long)l10));
                }
                this.mp.Y(this.w() - 18.0 - this.mh.w() - 4.0);
                this.mp.a(this.w() - 18.0 - this.mh.w() - 6.0);
                this.mp.d(this.m_);
                break block15;
            }
            try {
                this.g((String)((Object)y9.d("h", (int)y9.c("j", (int)22394, (long)(0x4665B82960A14DBDL ^ l10)), (long)-6911841335613109446L, (long)l10)));
                if (this.ms != null) {
                    Ao.z(this.ms);
                    this.mr = null;
                    this.ms = null;
                }
            }
            catch (O_ o_6) {
                throw y9.a(o_6);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                y9.ab = d8.a(4305792919871509458L, 429175583613410379L, MethodHandles.lookup().lookupClass()).a(225819755503563L);
                y9.lb = new Object[5];
                y9.ob = new String[5];
                y9.x();
                y9.fb = new HashMap<K, V>(13);
                var0 = y9.ab ^ 92363652889409L;
                y9.i(new String[1]);
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
                var8_3 = new long[17];
                var5_4 = 0;
                var6_5 = "/htQDB\u000f\u0088o\u00b8i#\u00ef\u0005\u00f0\u0082G\u00bfG\u0005Y\u0011\u00d6\u00d2\u00e2\u00d7\u0095\u00bc\u00a1I\u00fc\u00db\u00d37X\u0089\u00ef\u00c4\u00cc\u0083\u00f4y\b\u00cd\u00cb;\u0016[\u00df\u00d9\u0002\u000b\u001c\u00a1\u00f9\u00a4h\u001fzH\u0099\u00c8f\u0010\u00bc(\u00f9\u00ec\u00d5~Y\u00d5\u00f6\u00a9\u00eb\u009c\u00f7%m\n\u0096\u00bc+:\u00edyNjKK%mu\u00a4\u00af\u00fc\u00b7EoD\u0083[o\u00bd\u009d\u0004\u00e9=X\u00ef_\u00d0U\u00b0\u00bd\u0007x\u0018\u000fl";
                var7_6 = "/htQDB\u000f\u0088o\u00b8i#\u00ef\u0005\u00f0\u0082G\u00bfG\u0005Y\u0011\u00d6\u00d2\u00e2\u00d7\u0095\u00bc\u00a1I\u00fc\u00db\u00d37X\u0089\u00ef\u00c4\u00cc\u0083\u00f4y\b\u00cd\u00cb;\u0016[\u00df\u00d9\u0002\u000b\u001c\u00a1\u00f9\u00a4h\u001fzH\u0099\u00c8f\u0010\u00bc(\u00f9\u00ec\u00d5~Y\u00d5\u00f6\u00a9\u00eb\u009c\u00f7%m\n\u0096\u00bc+:\u00edyNjKK%mu\u00a4\u00af\u00fc\u00b7EoD\u0083[o\u00bd\u009d\u0004\u00e9=X\u00ef_\u00d0U\u00b0\u00bd\u0007x\u0018\u000fl".length();
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
                    var6_5 = "\u00c6\u00c1CDoa|\u0017\u0087\u00dc\u00e2\u00e5]\u0004j\u0086";
                    var7_6 = "\u00c6\u00c1CDoa|\u0017\u0087\u00dc\u00e2\u00e5]\u0004j\u0086".length();
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
        y9.bb = var8_3;
        y9.eb = new Integer[17];
    }

    private static int c(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x3AD1;
        if (eb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = bb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])fb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    fb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/y9", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            y9.eb[n3] = n4;
        }
        return eb[n3];
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/y9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = y9.e(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = y9.f(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @Override
    public void G() {
        if (this.ms != null) {
            w6 w62 = this.V();
            this.ms.b(this.G());
            this.ms.M(w62.W() + w62.Q().b());
            double d2 = w62.b() - w62.Q().b() - 45.0;
            this.mr.K().B().P(d2);
            this.mr.K().B().i(d2);
            this.mr.K().B().A();
            this.ms.A();
        }
        this.mp.M(this.W() + 5.0);
    }

    public y9() {
        long l10 = ab ^ 0x7CD4ED5004EBL;
        super(100.0, 16.0);
        this.ma = new yG(23.0, 14.0);
        this.mq = new bE(18.0, 16.0);
        this.mh = new hr((String)((Object)y9.d("h", (int)y9.c("j", (int)27643, (long)(0x2BD78F9CE2D3F75L ^ l10)), (long)7950607620077487480L, (long)l10)), 0.6, y9.M.O, y9.M.b, 18.0, 8.0);
        this.mb = new rn(0.15, new Color(150, 150, 150, 0), new Color(150, 150, 150, 20));
        this.mi = false;
        this.i(false);
        this.ma.i(false);
        this.ma.d().J(true);
        this.mp = new bM("", (String)((Object)y9.d("h", (int)y9.c("j", (int)16774, (long)(0x6800C5FE78F0150FL ^ l10)), (long)7950607620077487480L, (long)l10)), 48.0, 0.8, y9.M.c, true);
        this.mh.N(new JP(this));
        this.mp.l(new OX(this));
        this.l(new iP(this));
        this.g((String)((Object)y9.d("h", (int)y9.c("j", (int)30216, (long)(0xEE2BD83165CA284L ^ l10)), (long)7950607620077487480L, (long)l10)));
        this.mh.q(false);
        this.mh.A(Color.WHITE);
        this.ma.o(this.mh);
        this.o(this.mq, this.mp, this.ma);
    }

    static void O(y9 y92, Point point, iz iz2) {
        y92.D(point, iz2);
    }

    private void lambda$leaveAction$5() {
        this.mi = false;
    }

    public static void i(String[] stringArray) {
        mm = stringArray;
    }

    static fB f(y9 y92) {
        return y92.ms;
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    static void C(y9 y92) {
        y92.y();
    }

    private static void lambda$null$0(TE tE2) {
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'F' || c10 == '\u00d8' || c10 == 'a' || c10 == 'r') {
                field = y9.k(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'F' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00d8' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'a' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = y9.l(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00d6' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'h' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @Nullable
    public wl K() {
        return this.mr;
    }

    private static Method e(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    private static int i(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (ob[n5] != null) {
            return n5;
        }
        Object object = lb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 57;
                break;
            }
            case 1: {
                n4 = 27;
                break;
            }
            case 2: {
                n4 = 12;
                break;
            }
            case 3: {
                n4 = 63;
                break;
            }
            case 4: {
                n4 = 47;
                break;
            }
            case 5: {
                n4 = 54;
                break;
            }
            case 6: {
                n4 = 21;
                break;
            }
            case 7: {
                n4 = 5;
                break;
            }
            case 8: {
                n4 = 32;
                break;
            }
            case 9: {
                n4 = 48;
                break;
            }
            case 10: {
                n4 = 39;
                break;
            }
            case 11: {
                n4 = 29;
                break;
            }
            case 12: {
                n4 = 49;
                break;
            }
            case 13: {
                n4 = 20;
                break;
            }
            case 14: {
                n4 = 24;
                break;
            }
            case 15: {
                n4 = 62;
                break;
            }
            case 16: {
                n4 = 36;
                break;
            }
            case 17: {
                n4 = 61;
                break;
            }
            case 18: {
                n4 = 3;
                break;
            }
            case 19: {
                n4 = 6;
                break;
            }
            case 20: {
                n4 = 10;
                break;
            }
            case 21: {
                n4 = 25;
                break;
            }
            case 22: {
                n4 = 37;
                break;
            }
            case 23: {
                n4 = 17;
                break;
            }
            case 24: {
                n4 = 42;
                break;
            }
            case 25: {
                n4 = 55;
                break;
            }
            case 26: {
                n4 = 2;
                break;
            }
            case 27: {
                n4 = 31;
                break;
            }
            case 28: {
                n4 = 15;
                break;
            }
            case 29: {
                n4 = 35;
                break;
            }
            case 30: {
                n4 = 45;
                break;
            }
            case 31: {
                n4 = 16;
                break;
            }
            case 32: {
                n4 = 51;
                break;
            }
            case 33: {
                n4 = 23;
                break;
            }
            case 34: {
                n4 = 0;
                break;
            }
            case 35: {
                n4 = 40;
                break;
            }
            case 36: {
                n4 = 11;
                break;
            }
            case 37: {
                n4 = 43;
                break;
            }
            case 38: {
                n4 = 41;
                break;
            }
            case 39: {
                n4 = 26;
                break;
            }
            case 40: {
                n4 = 19;
                break;
            }
            case 41: {
                n4 = 33;
                break;
            }
            case 42: {
                n4 = 8;
                break;
            }
            case 43: {
                n4 = 14;
                break;
            }
            case 44: {
                n4 = 56;
                break;
            }
            case 45: {
                n4 = 44;
                break;
            }
            case 46: {
                n4 = 59;
                break;
            }
            case 47: {
                n4 = 46;
                break;
            }
            case 48: {
                n4 = 22;
                break;
            }
            case 49: {
                n4 = 52;
                break;
            }
            case 50: {
                n4 = 38;
                break;
            }
            case 51: {
                n4 = 18;
                break;
            }
            case 52: {
                n4 = 1;
                break;
            }
            case 53: {
                n4 = 30;
                break;
            }
            case 54: {
                n4 = 9;
                break;
            }
            case 55: {
                n4 = 50;
                break;
            }
            case 56: {
                n4 = 13;
                break;
            }
            case 57: {
                n4 = 28;
                break;
            }
            case 58: {
                n4 = 58;
                break;
            }
            case 59: {
                n4 = 4;
                break;
            }
            case 60: {
                n4 = 53;
                break;
            }
            case 61: {
                n4 = 34;
                break;
            }
            case 62: {
                n4 = 60;
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
        y9.ob[n5] = new String(cArray);
        return n5;
    }

    private static Class j(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = y9.i(l10, l11);
            object = lb[n2];
            try {
                if (!(object instanceof String)) break block2;
                y9.lb[n2] = clazz = Class.forName(ob[n2]);
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/y9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = y9.c(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private void lambda$null$1() {
        this.mi = false;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(y9.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(y9.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

