/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ap;
import a.EP;
import a.KB;
import a.OY;
import a.O_;
import a.Oq;
import a.QF;
import a.Qg;
import a.Qt;
import a.SE;
import a.V0;
import a.VZ;
import a.Vh;
import a.a;
import a.d8;
import a.eM;
import a.jG;
import a.jd;
import a.jr;
import a.kX;
import a.oQ;
import a.pN;
import a.pn;
import a.xX;
import a.xi;
import a.xk;
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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class xw
extends xi {
    public jr Z;
    private static final long[] d;
    private boolean K;
    private static final String[] m;
    private static final Map j;
    private final jr A;
    private final jr e;
    private boolean P;
    private static final Integer[] h;
    private static final long b;
    public jd r;
    private static final Object[] l;

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = xw.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = xw.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = xw.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    @Override
    public void h() {
        this.K = false;
    }

    private static Method d(long l10, long l11) {
        int n2 = xw.a(l10, l11);
        Object object = l[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = m[n2];
                int n4 = string2.indexOf(8);
                clazz3 = xw.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = xw.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = xw.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        xw.l[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = xw.b(313258022461726L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = xw.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        xw.l[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = xw.b(313258022461726L, 0L);
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

    private void V(Qg qg2) {
        try {
            if (this.P) {
                return;
            }
        }
        catch (O_ o_2) {
            throw xw.a(o_2);
        }
        for (double d2 : new double[]{0.040009234827343, 0.0, 0.030009234827343, 0.0}) {
            try {
                if (kX.C() > 13) {
                    qg2.U().O(V0.a(qg2.F(), qg2.V() + d2, qg2.B(), false));
                    continue;
                }
            }
            catch (O_ o_3) {
                throw xw.a(o_3);
            }
            qg2.U().O(V0.e(qg2.F(), ((oQ)qg2.L()).c() + d2, qg2.V() + d2, qg2.B(), false));
        }
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x5AC9;
        if (h[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = d[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/xw", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            xw.h[n3] = n4;
        }
        return h[n3];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = xw.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @OY
    public void X(KB kB2) {
    }

    private static void a() {
        Object[] objectArray = l;
        l[0] = "KnJ";
        objectArray[1] = Integer.TYPE;
        xw.m[1] = "java/lang/Integer";
        objectArray[2] = "Lg>wTnGh/8)vTo&q";
        objectArray[3] = Boolean.TYPE;
        xw.m[3] = "java/lang/Boolean";
        objectArray[4] = "\u0017\u0000\u001f\u001a\f\u0012\u001c\u000f\u000eUm\u001c\u0017\u0004\n\u000f";
        objectArray[5] = " (\tS(a%+\u0007:2m\u001bc\u0011Uh|%%\u0017\u0004c\u0007";
        Object[] objectArray2 = objectArray;
        objectArray[6] = "\u00029\u001cQ0\\\u0007:\u00128 A9:\f\\rEK5ZDK\u0000\u00004\\Y \u0003K7\u00078";
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00f5' || c10 == 'E' || c10 == 'U' || c10 == 'C') {
                field = xw.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00f5' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'E' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'U' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = xw.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00dc' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00f4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public void z(boolean bl2) {
        this.P = bl2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xw" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public xw() {
        long l10 = b ^ 0x4BB375F1D3EFL;
        super(a.cs((int)xw.a("z", (int)12786, (long)(0x3702B2E7F6E51525L ^ l10))), new Color(193, 183, 92).getRGB(), Oq.G, a.cs((int)xw.a("z", (int)9241, (long)(0x6D9E734848D780CDL ^ l10))));
        this.A = new jr((String)((Object)xw.c("\u00f4", (int)xw.a("z", (int)14691, (long)(0x16C990938EF89DB6L ^ l10)), (long)-135720499625718971L, (long)l10)));
        this.e = new jr((String)((Object)xw.c("\u00f4", (int)xw.a("z", (int)23126, (long)(0x46CD9B8D54B4FE80L ^ l10)), (long)-135720499625718971L, (long)l10)));
        this.Z = new jr((String)((Object)xw.c("\u00f4", (int)xw.a("z", (int)17663, (long)(0x28AC74FB8D3A602EL ^ l10)), (long)-135720499625718971L, (long)l10)));
        this.r = jd.I(this, (String)((Object)xw.c("\u00f4", (int)xw.a("z", (int)30359, (long)(0x25FB2AC1A7C3D247L ^ l10)), (long)-135720499625718971L, (long)l10)), (String)((Object)xw.c("\u00f4", (int)xw.a("z", (int)2888, (long)(0x2F1E51860A3C2F9BL ^ l10)), (long)-135720499625718971L, (long)l10)), this.A, this.A, this.Z);
        this.N(this.r);
    }

    @Override
    public boolean j() {
        return true;
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
    static {
        block9: {
            block8: {
                xw.b = d8.a(2753718212543671373L, -5219559506495600502L, MethodHandles.lookup().lookupClass()).a(229036583991737L);
                xw.l = new Object[7];
                xw.m = new String[7];
                xw.a();
                xw.j = new HashMap<K, V>(13);
                var0 = xw.b ^ 50781151167747L;
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
                var8_3 = new long[7];
                var5_4 = 0;
                var6_5 = "f\u00c0\u00e8\u0085\u00e2\u0082\u00be\u0088\u008e=\tAWGh\u000b\u00cfd\u00fa.%\u008a\u00fb\u00ff\u00dd\u0080\u00a1{\u00c2\u0097\u00cc\u00bd}=Ue\t<q\t";
                var7_6 = "f\u00c0\u00e8\u0085\u00e2\u0082\u00be\u0088\u008e=\tAWGh\u000b\u00cfd\u00fa.%\u008a\u00fb\u00ff\u00dd\u0080\u00a1{\u00c2\u0097\u00cc\u00bd}=Ue\t<q\t".length();
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
                    var6_5 = "P\u00c8|\u00a2\u000bI%\u00c8\u00fe\u0086o\u00f4tT\u00c8\u00a0";
                    var7_6 = "P\u00c8|\u00a2\u000bI%\u00c8\u00fe\u0086o\u00f4tT\u00c8\u00a0".length();
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
        xw.d = var8_3;
        xw.h = new Integer[7];
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field c(long l10, long l11) {
        int n2 = xw.a(l10, l11);
        Object object = l[n2];
        if (object instanceof String) {
            String string = m[n2];
            int n3 = string.indexOf(8);
            Class clazz = xw.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = xw.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = xw.a(clazz3, string2, clazz2)) != null) {
                    xw.l[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = xw.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        xw.l[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = xw.b(313258022461726L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @OY
    public void C(pn pn2) {
        block18: {
            long l10 = b ^ 0x7FD6D1965BF0L;
            if (((jG)this.r.J()).equals(this.A)) {
                Qg qg2;
                block21: {
                    SE sE2;
                    block20: {
                        sE2 = SE.h;
                        qg2 = EP.U();
                        try {
                            block19: {
                                try {
                                    try {
                                        try {
                                            if (!qg2.D()) break block18;
                                            if (sE2.U().W(Ap.class)) break block19;
                                        }
                                        catch (O_ o_2) {
                                            throw xw.a(o_2);
                                        }
                                        if (sE2.U().W(xk.class)) break block19;
                                    }
                                    catch (O_ o_3) {
                                        throw xw.a(o_3);
                                    }
                                    if (!sE2.U().W(xX.class)) break block20;
                                }
                                catch (O_ o_4) {
                                    throw xw.a(o_4);
                                }
                            }
                            return;
                        }
                        catch (O_ o_5) {
                            throw xw.a(o_5);
                        }
                    }
                    try {
                        if (pn2.getTarget().Y() || !pn2.getTarget().B(eM.Ut)) break block18;
                    }
                    catch (O_ o_6) {
                        throw xw.a(o_6);
                    }
                    Qt qt2 = new Qt(pn2.getTarget().M());
                    try {
                        try {
                            if (!qt2.B(eM.Pr) || !sE2.j().h(qt2)) break block21;
                        }
                        catch (O_ o_7) {
                            throw xw.a(o_7);
                        }
                        return;
                    }
                    catch (O_ o_8) {
                        throw xw.a(o_8);
                    }
                }
                try {
                    this.V(qg2);
                    if (xw.c("\u00f4", (long)8503427455422037448L, (long)l10) != false) {
                        this.K = true;
                    }
                }
                catch (O_ o_9) {
                    throw xw.a(o_9);
                }
            }
        }
    }

    @OY
    public void I(pN pN2) {
        block17: {
            block18: {
                try {
                    if (!((jG)this.r.J()).equals(this.A) || !pN2.getPacket().B(eM.rZ)) break block17;
                }
                catch (O_ o_2) {
                    throw xw.a(o_2);
                }
                Vh vh2 = new Vh(pN2.getPacketInstance());
                try {
                    if (!vh2.R().equals(VZ.M())) break block17;
                    if (this.K) break block18;
                }
                catch (O_ o_3) {
                    throw xw.a(o_3);
                }
                Qg qg2 = EP.U();
                if (qg2.D()) {
                    block21: {
                        SE sE2;
                        block20: {
                            sE2 = SE.h;
                            try {
                                block19: {
                                    try {
                                        try {
                                            if (sE2.U().W(Ap.class) || sE2.U().W(xk.class)) break block19;
                                        }
                                        catch (O_ o_4) {
                                            throw xw.a(o_4);
                                        }
                                        if (!sE2.U().W(xX.class)) break block20;
                                    }
                                    catch (O_ o_5) {
                                        throw xw.a(o_5);
                                    }
                                }
                                return;
                            }
                            catch (O_ o_6) {
                                throw xw.a(o_6);
                            }
                        }
                        QF qF2 = vh2.d(qg2.N());
                        try {
                            if (qF2.Y() || !qF2.B(eM.Ut)) break block17;
                        }
                        catch (O_ o_7) {
                            throw xw.a(o_7);
                        }
                        Qt qt2 = new Qt(qF2.M());
                        try {
                            try {
                                if (!qt2.B(eM.Pr) || !sE2.j().h(qt2)) break block21;
                            }
                            catch (O_ o_8) {
                                throw xw.a(o_8);
                            }
                            return;
                        }
                        catch (O_ o_9) {
                            throw xw.a(o_9);
                        }
                    }
                    this.V(qg2);
                    this.K = true;
                }
                break block17;
            }
            this.K = false;
        }
    }

    public boolean T() {
        boolean bl2;
        block7: {
            block6: {
                try {
                    try {
                        try {
                            if (this.r.J() != this.Z || !this.Z()) break block6;
                        }
                        catch (O_ o_2) {
                            throw xw.a(o_2);
                        }
                        if (kX.C() <= 13) break block6;
                    }
                    catch (O_ o_3) {
                        throw xw.a(o_3);
                    }
                    bl2 = true;
                    break block7;
                }
                catch (O_ o_4) {
                    throw xw.a(o_4);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (m[n5] != null) {
            return n5;
        }
        Object object = l[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 7;
                break;
            }
            case 1: {
                n4 = 16;
                break;
            }
            case 2: {
                n4 = 27;
                break;
            }
            case 3: {
                n4 = 49;
                break;
            }
            case 4: {
                n4 = 23;
                break;
            }
            case 5: {
                n4 = 41;
                break;
            }
            case 6: {
                n4 = 50;
                break;
            }
            case 7: {
                n4 = 32;
                break;
            }
            case 8: {
                n4 = 58;
                break;
            }
            case 9: {
                n4 = 18;
                break;
            }
            case 10: {
                n4 = 24;
                break;
            }
            case 11: {
                n4 = 21;
                break;
            }
            case 12: {
                n4 = 31;
                break;
            }
            case 13: {
                n4 = 5;
                break;
            }
            case 14: {
                n4 = 38;
                break;
            }
            case 15: {
                n4 = 40;
                break;
            }
            case 16: {
                n4 = 33;
                break;
            }
            case 17: {
                n4 = 17;
                break;
            }
            case 18: {
                n4 = 3;
                break;
            }
            case 19: {
                n4 = 29;
                break;
            }
            case 20: {
                n4 = 37;
                break;
            }
            case 21: {
                n4 = 48;
                break;
            }
            case 22: {
                n4 = 12;
                break;
            }
            case 23: {
                n4 = 44;
                break;
            }
            case 24: {
                n4 = 60;
                break;
            }
            case 25: {
                n4 = 0;
                break;
            }
            case 26: {
                n4 = 52;
                break;
            }
            case 27: {
                n4 = 56;
                break;
            }
            case 28: {
                n4 = 47;
                break;
            }
            case 29: {
                n4 = 13;
                break;
            }
            case 30: {
                n4 = 55;
                break;
            }
            case 31: {
                n4 = 61;
                break;
            }
            case 32: {
                n4 = 62;
                break;
            }
            case 33: {
                n4 = 43;
                break;
            }
            case 34: {
                n4 = 2;
                break;
            }
            case 35: {
                n4 = 59;
                break;
            }
            case 36: {
                n4 = 9;
                break;
            }
            case 37: {
                n4 = 25;
                break;
            }
            case 38: {
                n4 = 51;
                break;
            }
            case 39: {
                n4 = 54;
                break;
            }
            case 40: {
                n4 = 53;
                break;
            }
            case 41: {
                n4 = 57;
                break;
            }
            case 42: {
                n4 = 15;
                break;
            }
            case 43: {
                n4 = 11;
                break;
            }
            case 44: {
                n4 = 1;
                break;
            }
            case 45: {
                n4 = 28;
                break;
            }
            case 46: {
                n4 = 39;
                break;
            }
            case 47: {
                n4 = 6;
                break;
            }
            case 48: {
                n4 = 45;
                break;
            }
            case 49: {
                n4 = 36;
                break;
            }
            case 50: {
                n4 = 10;
                break;
            }
            case 51: {
                n4 = 22;
                break;
            }
            case 52: {
                n4 = 63;
                break;
            }
            case 53: {
                n4 = 20;
                break;
            }
            case 54: {
                n4 = 34;
                break;
            }
            case 55: {
                n4 = 35;
                break;
            }
            case 56: {
                n4 = 14;
                break;
            }
            case 57: {
                n4 = 26;
                break;
            }
            case 58: {
                n4 = 30;
                break;
            }
            case 59: {
                n4 = 46;
                break;
            }
            case 60: {
                n4 = 4;
                break;
            }
            case 61: {
                n4 = 42;
                break;
            }
            case 62: {
                n4 = 19;
                break;
            }
            default: {
                n4 = 8;
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
        xw.m[n5] = new String(cArray);
        return n5;
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = xw.a(l10, l11);
            object = l[n2];
            try {
                if (!(object instanceof String)) break block2;
                xw.l[n2] = clazz = Class.forName(m[n2]);
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
            throw new RuntimeException("a/xw" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = xw.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = xw.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(xw.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(xw.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

