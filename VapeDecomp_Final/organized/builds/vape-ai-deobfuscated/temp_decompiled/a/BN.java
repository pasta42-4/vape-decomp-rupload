/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.F8;
import a.Ft;
import a.GD;
import a.JQ;
import a.O_;
import a.Rs;
import a.Sz;
import a.d8;
import a.fO;
import a.fg;
import a.h3;
import a.hc;
import a.hs;
import a.ht;
import a.wV;
import a.wX;
import a.wf;
import a.wj;
import a.ws;
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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bn
extends ht {
    private static final Integer[] D;
    private static final String[] V;
    private hs E;
    private List<Ft> v;
    private static final long[] B;
    private hs b;
    private static final long n;
    private static final Object[] L;
    private static final Map F;
    private hs R;

    private static Method h(long l10, long l11) {
        int n2 = bn.e(l10, l11);
        Object object = L[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = V[n2];
                int n4 = string2.indexOf(8);
                clazz3 = bn.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = bn.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = bn.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        bn.L[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = bn.f(216694226098665L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = bn.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        bn.L[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = bn.f(216694226098665L, 0L);
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

    public bn() {
        long l10 = n ^ 0x2B70DC9141E2L;
        this.b = new hs((String)((Object)bn.c("V", (int)bn.b("k", (int)12568, (long)(0x6DD7BB186DA1DA96L ^ l10)), (long)-5822742674819250967L, (long)l10)), 0.8);
        this.v = new ArrayList<Ft>();
        this.Q(bn.M.W);
        this.R = new hc(this, (String)((Object)bn.c("V", (int)bn.b("k", (int)4008, (long)(0x5A484705B801E421L ^ l10)), (long)-5822742674819250967L, (long)l10)), 0.75);
        this.E = new h3(this, (String)((Object)bn.c("V", (int)bn.b("k", (int)11355, (long)(0x26AA0D951B47DCL ^ l10)), (long)-5822742674819250967L, (long)l10)), 0.6);
        this.E.N(new JQ(this));
        this.E.g((String)((Object)bn.c("V", (int)bn.b("k", (int)2906, (long)(0x603CE490B8960D1L ^ l10)), (long)-5822742674819250967L, (long)l10)));
        this.R.N(bn::lambda$new$0);
        this.b.N(new GD(this));
        this.b.g((String)((Object)bn.c("V", (int)bn.b("k", (int)19164, (long)(0x603CEF36E7C62150L ^ l10)), (long)-5822742674819250967L, (long)l10)));
        this.o(this.R, this.b, this.E);
        this.v.add(new Ft((String)((Object)bn.c("V", (int)bn.b("k", (int)1360, (long)(0xCA790A9AD87EED6L ^ l10)), (long)-5822742674819250967L, (long)l10)), Ao.D(wj.class), 5));
        this.v.add(new Ft((String)((Object)bn.c("V", (int)bn.b("k", (int)30908, (long)(0x5490318930FC1331L ^ l10)), (long)-5822742674819250967L, (long)l10)), Ao.D(ws.class), 6));
        this.v.add(new Ft((String)((Object)bn.c("V", (int)bn.b("k", (int)3888, (long)(0x5B702981EE4EE4BAL ^ l10)), (long)-5822742674819250967L, (long)l10)), Ao.D(wV.class), 6));
        this.v.add(new Ft((String)((Object)bn.c("V", (int)bn.b("k", (int)583, (long)(0x6BBF768C406C69CFL ^ l10)), (long)-5822742674819250967L, (long)l10)), Ao.D(wX.class), 7));
        this.v.add(new Ft((String)((Object)bn.c("V", (int)bn.b("k", (int)28344, (long)(0x7C40786A110E0537L ^ l10)), (long)-5822742674819250967L, (long)l10)), Ao.D(wf.class), 7));
    }

    @Override
    public void U() {
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x44BE;
        if (D[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = B[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])F.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    F.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/bn", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            bn.D[n3] = n4;
        }
        return D[n3];
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00a3' || c10 == 'v' || c10 == 'E' || c10 == 'K') {
                field = bn.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00a3' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'v' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'E' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = bn.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00d1' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'V' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = bn.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = L;
        L[0] = "\u001c\u0010L";
        objectArray[1] = Integer.TYPE;
        bn.V[1] = "java/lang/Integer";
        objectArray[2] = "G4\u001ac\u0014\u0017L;\u000b,i\u000f_<\u0002e";
        objectArray[3] = "hQ$==%c^5r\\+hU1(";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "Gq\u0001.,<\u0011+\u0003N,\" rB5>;F!F(.Y\u0019)\u0012\u007f&(B(\u0002+G";
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = bn.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    @Override
    public double e() {
        return 110.0;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = bn.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = bn.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = bn.e(l10, l11);
            object = L[n2];
            try {
                if (!(object instanceof String)) break block2;
                bn.L[n2] = clazz = Class.forName(V[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public void Z(Sz sz2) {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                bn.n = d8.a(7963236022709190998L, -1663723843245567155L, MethodHandles.lookup().lookupClass()).a(264916958540316L);
                bn.L = new Object[5];
                bn.V = new String[5];
                bn.a();
                bn.F = new HashMap<K, V>(13);
                var0 = bn.n ^ 130436797557331L;
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
                var6_5 = "\u0003\u00a2\u00a7F\u0006HK\u00e7\u00b3\u009d\u00b2s\u0082\u001cZ\u00c65v3#\u00119\u00df=r\u00b1\u001c\u00cc\u00ee3\u00af\u00ca\u00f2\u008a:\u0018\u000f\u00ed\u00d7;\u008f\u00e3\u0086K\u0095\u00b2;e \u00fd\u00f1\u000b\u0013\u00c7\u00a3\u00f4z\u0013BA`UK\u00e2";
                var7_6 = "\u0003\u00a2\u00a7F\u0006HK\u00e7\u00b3\u009d\u00b2s\u0082\u001cZ\u00c65v3#\u00119\u00df=r\u00b1\u001c\u00cc\u00ee3\u00af\u00ca\u00f2\u008a:\u0018\u000f\u00ed\u00d7;\u008f\u00e3\u0086K\u0095\u00b2;e \u00fd\u00f1\u000b\u0013\u00c7\u00a3\u00f4z\u0013BA`UK\u00e2".length();
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
                    var6_5 = ";\u0092\u00da2\u00cam\u00d4\u0016\u00aa\u00fcI\u0083c9bi";
                    var7_6 = ";\u0092\u00da2\u00cam\u00d4\u0016\u00aa\u00fcI\u0083c9bi".length();
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
        bn.B = var8_3;
        bn.D = new Integer[10];
    }

    private static Field g(long l10, long l11) {
        int n2 = bn.e(l10, l11);
        Object object = L[n2];
        if (object instanceof String) {
            String string = V[n2];
            int n3 = string.indexOf(8);
            Class clazz = bn.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = bn.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = bn.c(clazz3, string2, clazz2)) != null) {
                    bn.L[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = bn.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        bn.L[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = bn.f(216694226098665L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public void G() {
        Color color;
        hs hs2;
        block16: {
            block14: {
                block15: {
                    Color color2;
                    hs hs3;
                    block13: {
                        block11: {
                            block12: {
                                try {
                                    try {
                                        F8.A(this.G(), this.W(), this.w(), this.b(), this.l());
                                        this.R.b(this.G() + 3.0);
                                        this.R.M(this.W());
                                        this.R.w(this.b());
                                        this.b.b(this.G() + this.w() - 32.0);
                                        this.b.M(this.W());
                                        this.b.w(this.b());
                                        hs3 = this.b;
                                        if (!Ao.D(fO.class).f()) break block11;
                                        if (!this.b.s()) break block12;
                                    }
                                    catch (O_ o_2) {
                                        throw bn.a(o_2);
                                    }
                                    color2 = bn.M.I;
                                    break block13;
                                }
                                catch (O_ o_3) {
                                    throw bn.a(o_3);
                                }
                            }
                            color2 = bn.M.o;
                            break block13;
                        }
                        color2 = null;
                    }
                    hs3.h(color2);
                    this.E.b(this.G() + this.w() - 18.0);
                    this.E.M(this.W());
                    this.E.w(this.b());
                    boolean bl2 = false;
                    double d2 = this.W() + this.b() / 2.0;
                    double d3 = (float)(this.G() + this.w() - 17.5 - 8.0);
                    for (Ft ft2 : this.v) {
                        try {
                            if (ft2.Z == null || !ft2.Z.f()) continue;
                        }
                        catch (O_ o_4) {
                            throw bn.a(o_4);
                        }
                        F8.x(ft2.j, d3, d2, ft2.T, ft2.T, bn.M.Z);
                        bl2 = true;
                        d3 -= (double)(5.0f + (float)ft2.T);
                    }
                    try {
                        try {
                            hs2 = this.E;
                            if (!bl2) break block14;
                            if (!this.E.s()) break block15;
                        }
                        catch (O_ o_5) {
                            throw bn.a(o_5);
                        }
                        color = Rs.P(M.j(), 10.0);
                        break block16;
                    }
                    catch (O_ o_6) {
                        throw bn.a(o_6);
                    }
                }
                color = M.j();
                break block16;
            }
            color = null;
        }
        hs2.h(color);
    }

    @Override
    public double z() {
        return 18.0;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = bn.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = bn.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (V[n5] != null) {
            return n5;
        }
        Object object = L[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 62;
                break;
            }
            case 1: {
                n4 = 19;
                break;
            }
            case 2: {
                n4 = 8;
                break;
            }
            case 3: {
                n4 = 63;
                break;
            }
            case 4: {
                n4 = 13;
                break;
            }
            case 5: {
                n4 = 14;
                break;
            }
            case 6: {
                n4 = 22;
                break;
            }
            case 7: {
                n4 = 40;
                break;
            }
            case 8: {
                n4 = 54;
                break;
            }
            case 9: {
                n4 = 56;
                break;
            }
            case 10: {
                n4 = 4;
                break;
            }
            case 11: {
                n4 = 61;
                break;
            }
            case 12: {
                n4 = 44;
                break;
            }
            case 13: {
                n4 = 24;
                break;
            }
            case 14: {
                n4 = 35;
                break;
            }
            case 15: {
                n4 = 59;
                break;
            }
            case 16: {
                n4 = 28;
                break;
            }
            case 17: {
                n4 = 12;
                break;
            }
            case 18: {
                n4 = 26;
                break;
            }
            case 19: {
                n4 = 51;
                break;
            }
            case 20: {
                n4 = 34;
                break;
            }
            case 21: {
                n4 = 49;
                break;
            }
            case 22: {
                n4 = 20;
                break;
            }
            case 23: {
                n4 = 39;
                break;
            }
            case 24: {
                n4 = 58;
                break;
            }
            case 25: {
                n4 = 25;
                break;
            }
            case 26: {
                n4 = 18;
                break;
            }
            case 27: {
                n4 = 45;
                break;
            }
            case 28: {
                n4 = 55;
                break;
            }
            case 29: {
                n4 = 31;
                break;
            }
            case 30: {
                n4 = 7;
                break;
            }
            case 31: {
                n4 = 6;
                break;
            }
            case 32: {
                n4 = 15;
                break;
            }
            case 33: {
                n4 = 52;
                break;
            }
            case 34: {
                n4 = 43;
                break;
            }
            case 35: {
                n4 = 27;
                break;
            }
            case 36: {
                n4 = 36;
                break;
            }
            case 37: {
                n4 = 17;
                break;
            }
            case 38: {
                n4 = 42;
                break;
            }
            case 39: {
                n4 = 48;
                break;
            }
            case 40: {
                n4 = 47;
                break;
            }
            case 41: {
                n4 = 53;
                break;
            }
            case 42: {
                n4 = 38;
                break;
            }
            case 43: {
                n4 = 46;
                break;
            }
            case 44: {
                n4 = 5;
                break;
            }
            case 45: {
                n4 = 23;
                break;
            }
            case 46: {
                n4 = 11;
                break;
            }
            case 47: {
                n4 = 21;
                break;
            }
            case 48: {
                n4 = 41;
                break;
            }
            case 49: {
                n4 = 32;
                break;
            }
            case 50: {
                n4 = 10;
                break;
            }
            case 51: {
                n4 = 9;
                break;
            }
            case 52: {
                n4 = 57;
                break;
            }
            case 53: {
                n4 = 50;
                break;
            }
            case 54: {
                n4 = 37;
                break;
            }
            case 55: {
                n4 = 33;
                break;
            }
            case 56: {
                n4 = 30;
                break;
            }
            case 57: {
                n4 = 0;
                break;
            }
            case 58: {
                n4 = 29;
                break;
            }
            case 59: {
                n4 = 3;
                break;
            }
            case 60: {
                n4 = 2;
                break;
            }
            case 61: {
                n4 = 1;
                break;
            }
            case 62: {
                n4 = 16;
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
        bn.V[n5] = new String(cArray);
        return n5;
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

    private static void lambda$new$0() {
        fg.kW.D(false);
    }

    @Override
    public void g() {
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public void d() {
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public hs A() {
        return this.E;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bn" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bn" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bn.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(bn.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

