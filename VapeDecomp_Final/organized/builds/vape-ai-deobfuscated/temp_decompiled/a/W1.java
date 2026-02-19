/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.O_;
import a.Sc;
import a.bE;
import a.bU;
import a.bt;
import a.d8;
import a.f5;
import a.fE;
import a.fj;
import a.fs;
import a.hY;
import a.ht;
import a.v_;
import a.wE;
import a.wr;
import a.yC;
import a.yG;
import a.yQ;
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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class w1
extends wE {
    private final bt VN;
    private static final Integer[] lb;
    private static final long bb;
    private final f5 Vo;
    private static final String[] rb;
    private final Sc VR;
    private final yG Vu;
    private static final long[] fb;
    private final bt VP;
    private final hY V3;
    private final wE VV;
    private static final Object[] qb;
    private static final Map mb;
    private final yC VJ;

    private void lambda$new$6(Sc sc2) {
        v_ v_2 = new v_();
        this.Vo.i(this.VJ, sc2, v_2, () -> this.lambda$null$5(sc2, v_2));
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = w1.d(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private void lambda$new$4(Sc sc2) {
        long l10 = bb ^ 0x1A7248D26D8FL;
        fs fs2 = new fs((String)((Object)w1.e("U", (int)w1.c("y", (int)30844, (long)(0x62256FAC9662899AL ^ l10)), (long)3211445667272296313L, (long)l10)), (String)((Object)w1.e("U", (int)w1.c("y", (int)29161, (long)(0x2223AE95E3C3800CL ^ l10)), (long)3211445667272296313L, (long)l10)));
        fE fE2 = Ao.v(this.V3, fs2, fE.class);
        fE2.N(4.0);
        fE2.u(false);
        fE2.r(this.V(), fE2);
        fs2.R().N(() -> this.lambda$null$2(sc2, fE2));
        fs2.G().N(() -> w1.lambda$null$3(fE2));
    }

    private void lambda$createInventoryFilterNode$8(v_ v_2) {
        this.VR.M(v_2);
        this.j(v_2);
    }

    private static Field o(long l10, long l11) {
        int n2 = w1.m(l10, l11);
        Object object = qb[n2];
        if (object instanceof String) {
            String string = rb[n2];
            int n3 = string.indexOf(8);
            Class clazz = w1.n(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = w1.n(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = w1.g(clazz3, string2, clazz2)) != null) {
                    w1.qb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = w1.h(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        w1.qb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = w1.n(266451118664246L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private void v() {
        boolean bl2;
        yG yG2;
        try {
            yG2 = this.Vu;
            bl2 = !this.VR.D().isEmpty();
        }
        catch (O_ o_2) {
            throw w1.a(o_2);
        }
        yG2.N(bl2);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'L' || c10 == 'z' || c10 == '\u00ff' || c10 == 'i') {
                field = w1.o(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'L' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'z' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00ff' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = w1.p(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'T' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'U' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method g(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = w1.c(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private void lambda$null$2(Sc sc2, fE fE2) {
        sc2.G();
        this.VV.k();
        Ao.z(fE2);
        this.v();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                w1.bb = d8.a(1198529089237885308L, 4465303460933667920L, MethodHandles.lookup().lookupClass()).a(209197241458067L);
                w1.qb = new Object[5];
                w1.rb = new String[5];
                w1.T();
                w1.mb = new HashMap<K, V>(13);
                var0 = w1.bb ^ 76271307866952L;
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
                var8_3 = new long[12];
                var5_4 = 0;
                var6_5 = "4\u0094U\u0083\u0088I\u0081\u0080\u0087jd\u0015\u00b1\u009eQ\u00ddz\u00e11\u001fr%\u00fd\u00db\u0003\u00ddy,\u00e2\u00f8\u009b\u0014\u00c3\u0082\u009b\u0001lK\u00a3}f\u00f7\u00c1;6I\u0085w\u009e\u00cdp\u0010\u00c2Oo\u00dc\u00faKA\u00c1\u00a5\u00f4\u008d}\u00bc\u0083\u00a4\u0004\u00cb@\u0089).d\u00e4S\u009b\u00c2V\u0013";
                var7_6 = "4\u0094U\u0083\u0088I\u0081\u0080\u0087jd\u0015\u00b1\u009eQ\u00ddz\u00e11\u001fr%\u00fd\u00db\u0003\u00ddy,\u00e2\u00f8\u009b\u0014\u00c3\u0082\u009b\u0001lK\u00a3}f\u00f7\u00c1;6I\u0085w\u009e\u00cdp\u0010\u00c2Oo\u00dc\u00faKA\u00c1\u00a5\u00f4\u008d}\u00bc\u0083\u00a4\u0004\u00cb@\u0089).d\u00e4S\u009b\u00c2V\u0013".length();
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
                    var6_5 = "X\u00d6\u00abmM\u00f5S\u00f3\u001f\u0014\"E\u00b1$\u00f0\u00f1";
                    var7_6 = "X\u00d6\u00abmM\u00f5S\u00f3\u001f\u0014\"E\u00b1$\u00f0\u00f1".length();
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
        w1.fb = var8_3;
        w1.lb = new Integer[12];
    }

    public w1(f5 f52, yQ yQ2, Sc sc2) {
        long l10 = bb ^ 0x36B4590EE47L;
        super(yQ2.w() - 5.0, 20.0);
        this.VN = new bt("", 0.7);
        this.VP = new bt("", 0.7);
        this.VJ = new yC((String)((Object)w1.e("U", (int)w1.c("y", (int)1203, (long)(0x3C3BE7070AB57694L ^ l10)), (long)-5811541513532275535L, (long)l10)), 8.0, 8.0, 32.0, 32.0, w1.M.Y, w1.M.u, w1.M.S);
        this.V3 = new hY((String)((Object)w1.e("U", (int)w1.c("y", (int)17159, (long)(0xE393D2FAD52312FL ^ l10)), (long)-5811541513532275535L, (long)l10)), 0.8);
        this.Vo = f52;
        this.VR = sc2;
        this.VV = new wE(this.w() - 8.0, 20.0);
        this.i(90.0);
        this.M();
        this.i(false);
        this.Q(Color.MAGENTA);
        this.VN.b(() -> w1.lambda$new$0(sc2));
        this.VN.q(true);
        this.VN.B(w1.M.c);
        this.VN.T(this.VN.D());
        this.VN.w(8.0);
        this.n(this.VN, w1.e("U", (int)w1.c("y", (int)31682, (long)(0x12D441CC179C89EBL ^ l10)), (long)-5811541513532275535L, (long)l10));
        this.VP.b(() -> w1.lambda$new$1(sc2));
        this.VP.q(true);
        this.VP.T(58.0);
        this.VP.w(8.0);
        this.n(this.VP, w1.e("U", (int)w1.c("y", (int)25410, (long)(0x3359AE921BA99167L ^ l10)), (long)-5811541513532275535L, (long)l10));
        this.Vu = new yG(50.0, 4.0);
        this.Vu.d().f((String)((Object)w1.e("U", (int)w1.c("y", (int)3474, (long)(0x274FE637B19FFB4L ^ l10)), (long)-5811541513532275535L, (long)l10)));
        this.Vu.i(false);
        this.Vu.n(new bE(3.0, 0.0), new Object[0]);
        this.Vu.n(new bU(1.0, 8.0, w1.M.k), new Object[0]);
        this.Vu.n(new bE(3.0, 0.0), new Object[0]);
        this.V3.I(false);
        this.V3.d(true);
        this.V3.T(this.V3.d() * 0.75);
        this.V3.w(8.0);
        this.V3.N(() -> this.lambda$new$4(sc2));
        this.Vu.n(this.V3, new Object[0]);
        this.n(this.Vu, w1.e("U", (int)w1.c("y", (int)12625, (long)(0xEE473133542C37AL ^ l10)), (long)-5811541513532275535L, (long)l10));
        this.n(new bE(0.0, 0.0), w1.e("U", (int)w1.c("y", (int)5678, (long)(0x6A23C0A9A9A1E402L ^ l10)), (long)-5811541513532275535L, (long)l10));
        this.n(new bE(0.0, 5.0), w1.e("U", (int)w1.c("y", (int)17394, (long)(0x1BC8EA95F1E4B1D6L ^ l10)), (long)-5811541513532275535L, (long)l10));
        this.VV.i(false);
        this.VV.Q(Color.BLUE);
        this.VV.i(81.0);
        this.n(this.VV, new Object[0]);
        this.VJ.a(w1.M.a, w1.M.L);
        this.VJ.Y((float)(this.VJ.w() / 2.0));
        this.VJ.k(1.0f);
        this.VJ.w(true);
        this.VJ.u(true);
        this.VJ.k(false);
        this.VJ.y();
        this.VJ.N(() -> this.lambda$new$6(sc2));
        wr wr2 = new wr(2.0, 1.0, 3.0, 2.0, this.VJ);
        wr2.k(false);
        this.VV.n(wr2, new Object[0]);
        for (v_ v_2 : sc2.D()) {
            this.F(v_2);
        }
        this.v();
    }

    private static String lambda$new$1(Sc sc2) {
        Object object;
        StringBuilder stringBuilder;
        long l10 = bb ^ 0x10BB38E8108BL;
        try {
            stringBuilder = new StringBuilder().append((String)((Object)w1.e("U", (int)w1.c("y", (int)13493, (long)(0x63C2B7ED14133853L ^ l10)), (long)5878695154671549053L, (long)l10)));
            object = sc2.D().size() == 1 ? "" : w1.e("U", (int)w1.c("y", (int)29714, (long)(0x4831A10BECBCF8F1L ^ l10)), (long)5878695154671549053L, (long)l10);
        }
        catch (O_ o_2) {
            throw w1.a(o_2);
        }
        return stringBuilder.append((String)object).toString();
    }

    private static String lambda$new$0(Sc sc2) {
        return String.valueOf(sc2.D().size());
    }

    private static int c(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x5D77;
        if (lb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = fb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])mb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    mb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/w1", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            w1.lb[n3] = n4;
        }
        return lb[n3];
    }

    private static Method h(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = w1.g(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = w1.h(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = w1.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = w1.h(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public void F(v_ v_2) {
        this.VV.n(this.T(v_2), new Object[0]);
        this.v();
    }

    private static void T() {
        Object[] objectArray = qb;
        qb[0] = ":l\\";
        objectArray[1] = Integer.TYPE;
        w1.rb[1] = "java/lang/Integer";
        objectArray[2] = "\u001c\u0003\u000fti\"\u0017\f\u001e;\u0014:\u0004\u000b\u0017r";
        objectArray[3] = " >\u0014}zZ+1\u00052\u001bT :\u0001h";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "/`<aA^#2:\u0007CAB2j~JS:4gj\u0012:x2}~\u0011F%4~i(";
    }

    private static Method p(long l10, long l11) {
        int n2 = w1.m(l10, l11);
        Object object = qb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = rb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = w1.n(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = w1.n(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = w1.g(clazz, string, clazz2, n3, classArray2)) != null) {
                        w1.qb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = w1.n(266451118664246L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = w1.h(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        w1.qb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = w1.n(266451118664246L, 0L);
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

    private static void lambda$null$3(fE fE2) {
        Ao.z(fE2);
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/w1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void j(v_ v_2) {
        ArrayList<ht> arrayList = new ArrayList<ht>();
        for (ht ht2 : this.VV.A()) {
            if (!(ht2 instanceof wr)) continue;
            wr wr2 = (wr)ht2;
            fj fj2 = wr2.w(fj.class);
            try {
                if (fj2 == null) {
                    continue;
                }
            }
            catch (O_ o_2) {
                throw w1.a(o_2);
            }
            try {
                if (fj2.t() != v_2) continue;
                arrayList.add(ht2);
            }
            catch (O_ o_3) {
                throw w1.a(o_3);
            }
        }
        for (ht ht2 : arrayList) {
            this.VV.J(ht2);
        }
        this.v();
    }

    private void lambda$null$5(Sc sc2, v_ v_2) {
        sc2.E(v_2);
        this.F(v_2);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/w1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = w1.m(l10, l11);
            object = qb[n2];
            try {
                if (!(object instanceof String)) break block2;
                w1.qb[n2] = clazz = Class.forName(rb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private ht T(v_ v_2) {
        fj fj2 = new fj(this.VR, v_2);
        fj2.g(() -> this.lambda$createInventoryFilterNode$7(v_2, fj2));
        wr wr2 = new wr(0.0, 4.0, 1.0, 0.0, fj2);
        fj2.L(() -> this.lambda$createInventoryFilterNode$8(v_2));
        return wr2;
    }

    private static int m(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (rb[n5] != null) {
            return n5;
        }
        Object object = qb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 5;
                break;
            }
            case 1: {
                n4 = 26;
                break;
            }
            case 2: {
                n4 = 31;
                break;
            }
            case 3: {
                n4 = 42;
                break;
            }
            case 4: {
                n4 = 27;
                break;
            }
            case 5: {
                n4 = 15;
                break;
            }
            case 6: {
                n4 = 51;
                break;
            }
            case 7: {
                n4 = 41;
                break;
            }
            case 8: {
                n4 = 55;
                break;
            }
            case 9: {
                n4 = 62;
                break;
            }
            case 10: {
                n4 = 29;
                break;
            }
            case 11: {
                n4 = 25;
                break;
            }
            case 12: {
                n4 = 46;
                break;
            }
            case 13: {
                n4 = 9;
                break;
            }
            case 14: {
                n4 = 33;
                break;
            }
            case 15: {
                n4 = 24;
                break;
            }
            case 16: {
                n4 = 38;
                break;
            }
            case 17: {
                n4 = 61;
                break;
            }
            case 18: {
                n4 = 36;
                break;
            }
            case 19: {
                n4 = 63;
                break;
            }
            case 20: {
                n4 = 7;
                break;
            }
            case 21: {
                n4 = 23;
                break;
            }
            case 22: {
                n4 = 44;
                break;
            }
            case 23: {
                n4 = 3;
                break;
            }
            case 24: {
                n4 = 50;
                break;
            }
            case 25: {
                n4 = 47;
                break;
            }
            case 26: {
                n4 = 43;
                break;
            }
            case 27: {
                n4 = 11;
                break;
            }
            case 28: {
                n4 = 4;
                break;
            }
            case 29: {
                n4 = 13;
                break;
            }
            case 30: {
                n4 = 22;
                break;
            }
            case 31: {
                n4 = 45;
                break;
            }
            case 32: {
                n4 = 1;
                break;
            }
            case 33: {
                n4 = 2;
                break;
            }
            case 34: {
                n4 = 58;
                break;
            }
            case 35: {
                n4 = 30;
                break;
            }
            case 36: {
                n4 = 37;
                break;
            }
            case 37: {
                n4 = 40;
                break;
            }
            case 38: {
                n4 = 17;
                break;
            }
            case 39: {
                n4 = 18;
                break;
            }
            case 40: {
                n4 = 10;
                break;
            }
            case 41: {
                n4 = 21;
                break;
            }
            case 42: {
                n4 = 56;
                break;
            }
            case 43: {
                n4 = 48;
                break;
            }
            case 44: {
                n4 = 49;
                break;
            }
            case 45: {
                n4 = 54;
                break;
            }
            case 46: {
                n4 = 28;
                break;
            }
            case 47: {
                n4 = 53;
                break;
            }
            case 48: {
                n4 = 8;
                break;
            }
            case 49: {
                n4 = 57;
                break;
            }
            case 50: {
                n4 = 20;
                break;
            }
            case 51: {
                n4 = 12;
                break;
            }
            case 52: {
                n4 = 39;
                break;
            }
            case 53: {
                n4 = 19;
                break;
            }
            case 54: {
                n4 = 35;
                break;
            }
            case 55: {
                n4 = 16;
                break;
            }
            case 56: {
                n4 = 34;
                break;
            }
            case 57: {
                n4 = 6;
                break;
            }
            case 58: {
                n4 = 14;
                break;
            }
            case 59: {
                n4 = 32;
                break;
            }
            case 60: {
                n4 = 0;
                break;
            }
            case 61: {
                n4 = 59;
                break;
            }
            case 62: {
                n4 = 52;
                break;
            }
            default: {
                n4 = 60;
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
        w1.rb[n5] = new String(cArray);
        return n5;
    }

    private void lambda$createInventoryFilterNode$7(v_ v_2, fj fj2) {
        block3: {
            block2: {
                try {
                    if (!v_2.A().T()) break block2;
                    this.Vo.i(fj2, this.VR, v_2, null);
                    break block3;
                }
                catch (O_ o_2) {
                    throw w1.a(o_2);
                }
            }
            this.Vo.t(fj2, this.VR, v_2, false);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(w1.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(w1.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

