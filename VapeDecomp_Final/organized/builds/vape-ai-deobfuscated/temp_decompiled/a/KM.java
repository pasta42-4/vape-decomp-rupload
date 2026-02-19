/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.Bg;
import a.E9;
import a.EB;
import a.EP;
import a.Hc;
import a.J;
import a.O_;
import a.QZ;
import a.Qf;
import a.Qg;
import a.SE;
import a.TR;
import a.V4;
import a.aQ;
import a.ah;
import a.cB;
import a.d8;
import a.eD;
import a.jT;
import a.rt;
import a.vT;
import a.zh;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class km {
    private static final String[] f;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final long a;
    private final jT H;
    private static final Object[] e;

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x17CE;
        if (c[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = b[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/km", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            km.c[n3] = n4;
        }
        return c[n3];
    }

    @Nullable
    private Qf s() {
        try {
            if (!this.H.R.s().booleanValue()) {
                return null;
            }
        }
        catch (O_ o_2) {
            throw km.a(o_2);
        }
        if (this.H.z.s().booleanValue()) {
            Qf qf2 = this.e(TR.d());
            try {
                if (qf2 != null) {
                    return qf2;
                }
            }
            catch (O_ o_3) {
                throw km.a(o_3);
            }
        }
        try {
            if (this.H.P.s().booleanValue()) {
                return this.e(TR.N());
            }
        }
        catch (O_ o_4) {
            throw km.a(o_4);
        }
        return null;
    }

    private static Method d(long l10, long l11) {
        int n2 = km.a(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n2];
                int n4 = string2.indexOf(8);
                clazz3 = km.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = km.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = km.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        km.e[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = km.b(398451712443255L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = km.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        km.e[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = km.b(398451712443255L, 0L);
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

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                km.a = d8.a(-5674800725343889092L, -7379104076728073936L, MethodHandles.lookup().lookupClass()).a(203091205598720L);
                km.e = new Object[8];
                km.f = new String[8];
                km.a();
                km.d = new HashMap<K, V>(13);
                var0 = km.a ^ 44435832665676L;
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
                var8_3 = new long[18];
                var5_4 = 0;
                var6_5 = "\u00a8\u0088\u00a9\u00b4\u0001\u0018\u0093\u00f6\\\r\u0080\"\u00db\u0085\u00e9\u00b3\u001f\u00be\u00ccK\u00ed\u000f\u0095<\u00e2\u00fe\u00bc\u0087F\u0090Z\u00e5\u00e5\u0091\u0007\u00bf\u00afRv\u00a0\u00d1\u009a\u0014\u00ccumb\u008f\u00ada(\u00f3\u00abGF:\u0083\u00fbj\u00cap\u00c7{X\u008c\u00fa6P\u00d2\tl\u00a2\u0094\n\u001f\u009b'u\u00ac\u00a9Y\u000fdD\u00e6@5Y\u00c4o&,x\u00f2j\u00c6\u00bb\u00a9\u00b7|\u00a2i\u0083\u00a8\u0085\u00bdM\u00c6Ge\u00f4\u008f0,x\u00b2\u0012]\u008c\u00bc\u00f2\u00b5Q\u00ec;\u00c7\u00be\u0086";
                var7_6 = "\u00a8\u0088\u00a9\u00b4\u0001\u0018\u0093\u00f6\\\r\u0080\"\u00db\u0085\u00e9\u00b3\u001f\u00be\u00ccK\u00ed\u000f\u0095<\u00e2\u00fe\u00bc\u0087F\u0090Z\u00e5\u00e5\u0091\u0007\u00bf\u00afRv\u00a0\u00d1\u009a\u0014\u00ccumb\u008f\u00ada(\u00f3\u00abGF:\u0083\u00fbj\u00cap\u00c7{X\u008c\u00fa6P\u00d2\tl\u00a2\u0094\n\u001f\u009b'u\u00ac\u00a9Y\u000fdD\u00e6@5Y\u00c4o&,x\u00f2j\u00c6\u00bb\u00a9\u00b7|\u00a2i\u0083\u00a8\u0085\u00bdM\u00c6Ge\u00f4\u008f0,x\u00b2\u0012]\u008c\u00bc\u00f2\u00b5Q\u00ec;\u00c7\u00be\u0086".length();
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
                    var6_5 = "\u00b1\u008b\u00c0Y\u00fd~\u00e1\u00c9\u001b\u00195\u00e7\u0007\u00fa\u00b2\u00d8";
                    var7_6 = "\u00b1\u008b\u00c0Y\u00fd~\u00e1\u00c9\u001b\u00195\u00e7\u0007\u00fa\u00b2\u00d8".length();
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
        km.b = var8_3;
        km.c = new Integer[18];
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = km.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = km.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @NotNull
    aQ m(@Nullable vT vT2, @NotNull Bg bg2) {
        Object object;
        block34: {
            Qf qf2;
            long l10;
            block29: {
                block33: {
                    Qf qf3;
                    block32: {
                        block31: {
                            l10 = a ^ 0x730950C765DBL;
                            Qg qg2 = EP.U();
                            try {
                                if (qg2.Y()) {
                                    return aQ.B((String)((Object)km.b("\u00c2", (int)km.a("j", (int)227, (long)(0x7C4FC6A6F4D9726AL ^ l10)), (long)7297167553154914334L, (long)l10)));
                                }
                            }
                            catch (O_ o_2) {
                                throw km.a(o_2);
                            }
                            V4 v42 = qg2.a();
                            cB cB2 = TR.h();
                            boolean bl2 = cB2.equals(SE.h.x().V(v42));
                            qf2 = TR.B(cB2);
                            try {
                                block30: {
                                    try {
                                        try {
                                            if (bl2) break block29;
                                            if (qf2 == null) break block30;
                                        }
                                        catch (O_ o_3) {
                                            throw km.a(o_3);
                                        }
                                        if (!qf2.Y()) break block31;
                                    }
                                    catch (O_ o_4) {
                                        throw km.a(o_4);
                                    }
                                }
                                qf3 = this.e(cB2);
                                break block32;
                            }
                            catch (O_ o_5) {
                                throw km.a(o_5);
                            }
                        }
                        qf3 = qf2;
                    }
                    object = qf3;
                    try {
                        try {
                            if (object != null && !((Hc)object).Y()) break block33;
                        }
                        catch (O_ o_6) {
                            throw km.a(o_6);
                        }
                        return aQ.r((String)((Object)km.b("\u00c2", (int)km.a("j", (int)20589, (long)(0x1C8B6C6082A2E8L ^ l10)), (long)7297167553154914334L, (long)l10)));
                    }
                    catch (O_ o_7) {
                        throw km.a(o_7);
                    }
                }
                ah<Qf> ah2 = this.b((Qf)object);
                try {
                    if (ah2.Y()) {
                        return aQ.r(String.format((String)((Object)km.b("\u00c2", (int)km.a("j", (int)2001, (long)(0x16103D39BC04F556L ^ l10)), (long)7297167553154914334L, (long)l10)), ah2.w())).i(ah2.H());
                    }
                }
                catch (O_ o_8) {
                    throw km.a(o_8);
                }
                try {
                    if (ah2.M()) {
                        return aQ.B(String.format((String)((Object)km.b("\u00c2", (int)km.a("j", (int)14493, (long)(0x487DBC14E474A1BL ^ l10)), (long)7297167553154914334L, (long)l10)), ah2.w()));
                    }
                }
                catch (O_ o_9) {
                    throw km.a(o_9);
                }
                qf2 = ah2.L();
            }
            try {
                if (!this.H.o.m(Math.max((long)km.b("\u00ed", (Object)J.H, (long)7297227781617736002L, (long)l10), 150L))) {
                    return aQ.B((String)((Object)km.b("\u00c2", (int)km.a("j", (int)9596, (long)(0x30EEB8E9D92F57F7L ^ l10)), (long)7297167553154914334L, (long)l10)));
                }
            }
            catch (O_ o_10) {
                throw km.a(o_10);
            }
            try {
                try {
                    if (qf2 != null && !qf2.Y()) break block34;
                }
                catch (O_ o_11) {
                    throw km.a(o_11);
                }
                return aQ.B((String)((Object)km.b("\u00c2", (int)km.a("j", (int)26189, (long)(0x72499B9E2AAE14CEL ^ l10)), (long)7297167553154914334L, (long)l10)));
            }
            catch (O_ o_12) {
                throw km.a(o_12);
            }
        }
        object = this.H.V.x(TR.h(), vT2, bg2);
        try {
            if (((aQ)object).x()) {
                this.H.o.m();
            }
        }
        catch (O_ o_13) {
            throw km.a(o_13);
        }
        return object;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = km.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Field c(long l10, long l11) {
        int n2 = km.a(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            String string = f[n2];
            int n3 = string.indexOf(8);
            Class clazz = km.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = km.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = km.a(clazz3, string2, clazz2)) != null) {
                    km.e[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = km.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        km.e[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = km.b(398451712443255L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Nullable
    private Qf V() {
        Qf qf2;
        block2: {
            qf2 = zh.R(km::lambda$getHotbarReplaceSlot$0, rt.y);
            try {
                if (qf2 != null && !qf2.Y()) break block2;
            }
            catch (O_ o_2) {
                throw km.a(o_2);
            }
            qf2 = zh.R(this::lambda$getHotbarReplaceSlot$1, rt.y);
        }
        return qf2;
    }

    private boolean lambda$getHotbarReplaceSlot$1(Qf qf2) {
        boolean bl2;
        block5: {
            block4: {
                try {
                    try {
                        if (!qf2.y().r() || !this.H.h.q(qf2.y())) break block4;
                    }
                    catch (O_ o_2) {
                        throw km.a(o_2);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (O_ o_3) {
                    throw km.a(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    @Nullable
    private Qf e(cB cB2) {
        try {
            if (!this.H.R.s().booleanValue()) {
                return null;
            }
        }
        catch (O_ o_2) {
            throw km.a(o_2);
        }
        return zh.R(TR.o(cB2), rt.p);
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\u0016\\\f";
        objectArray[1] = Integer.TYPE;
        km.f[1] = "java/lang/Integer";
        objectArray[2] = "\u0017[\u0017\u0000a>\u001cT\u0006O\u001c&\u000fS\u000f\u0006";
        objectArray[3] = "\n]A";
        objectArray[4] = Long.TYPE;
        km.f[4] = "java/lang/Long";
        objectArray[5] = "pk\u0002\fz){d\u0013C\u001b'po\u0017\u0019";
        objectArray[6] = "boX\"(\u001e1'Y;U'X-[7+\n3/P+9d";
        Object[] objectArray2 = objectArray;
        objectArray[7] = "\u0011\u0016\u0006\u0000mBE\u0000\n;7F.\u0017\u001dA6AU\fFT\\\u0004N\u0000\u0010K G_T\u0019;";
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = km.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/km" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (f[n5] != null) {
            return n5;
        }
        Object object = e[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 49;
                break;
            }
            case 1: {
                n4 = 15;
                break;
            }
            case 2: {
                n4 = 8;
                break;
            }
            case 3: {
                n4 = 43;
                break;
            }
            case 4: {
                n4 = 6;
                break;
            }
            case 5: {
                n4 = 13;
                break;
            }
            case 6: {
                n4 = 19;
                break;
            }
            case 7: {
                n4 = 54;
                break;
            }
            case 8: {
                n4 = 11;
                break;
            }
            case 9: {
                n4 = 45;
                break;
            }
            case 10: {
                n4 = 9;
                break;
            }
            case 11: {
                n4 = 59;
                break;
            }
            case 12: {
                n4 = 22;
                break;
            }
            case 13: {
                n4 = 55;
                break;
            }
            case 14: {
                n4 = 4;
                break;
            }
            case 15: {
                n4 = 60;
                break;
            }
            case 16: {
                n4 = 39;
                break;
            }
            case 17: {
                n4 = 37;
                break;
            }
            case 18: {
                n4 = 33;
                break;
            }
            case 19: {
                n4 = 7;
                break;
            }
            case 20: {
                n4 = 62;
                break;
            }
            case 21: {
                n4 = 24;
                break;
            }
            case 22: {
                n4 = 52;
                break;
            }
            case 23: {
                n4 = 48;
                break;
            }
            case 24: {
                n4 = 3;
                break;
            }
            case 25: {
                n4 = 47;
                break;
            }
            case 26: {
                n4 = 50;
                break;
            }
            case 27: {
                n4 = 51;
                break;
            }
            case 28: {
                n4 = 1;
                break;
            }
            case 29: {
                n4 = 53;
                break;
            }
            case 30: {
                n4 = 46;
                break;
            }
            case 31: {
                n4 = 10;
                break;
            }
            case 32: {
                n4 = 5;
                break;
            }
            case 33: {
                n4 = 42;
                break;
            }
            case 34: {
                n4 = 30;
                break;
            }
            case 35: {
                n4 = 14;
                break;
            }
            case 36: {
                n4 = 63;
                break;
            }
            case 37: {
                n4 = 0;
                break;
            }
            case 38: {
                n4 = 12;
                break;
            }
            case 39: {
                n4 = 57;
                break;
            }
            case 40: {
                n4 = 41;
                break;
            }
            case 41: {
                n4 = 29;
                break;
            }
            case 42: {
                n4 = 61;
                break;
            }
            case 43: {
                n4 = 34;
                break;
            }
            case 44: {
                n4 = 21;
                break;
            }
            case 45: {
                n4 = 27;
                break;
            }
            case 46: {
                n4 = 44;
                break;
            }
            case 47: {
                n4 = 26;
                break;
            }
            case 48: {
                n4 = 32;
                break;
            }
            case 49: {
                n4 = 25;
                break;
            }
            case 50: {
                n4 = 23;
                break;
            }
            case 51: {
                n4 = 31;
                break;
            }
            case 52: {
                n4 = 17;
                break;
            }
            case 53: {
                n4 = 20;
                break;
            }
            case 54: {
                n4 = 58;
                break;
            }
            case 55: {
                n4 = 35;
                break;
            }
            case 56: {
                n4 = 56;
                break;
            }
            case 57: {
                n4 = 28;
                break;
            }
            case 58: {
                n4 = 2;
                break;
            }
            case 59: {
                n4 = 18;
                break;
            }
            case 60: {
                n4 = 40;
                break;
            }
            case 61: {
                n4 = 16;
                break;
            }
            case 62: {
                n4 = 36;
                break;
            }
            default: {
                n4 = 38;
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
        km.f[n5] = new String(cArray);
        return n5;
    }

    private void P(@NotNull eD eD2, int n2) {
        this.H.x.m();
        int n3 = eD2.j();
        try {
            if (n2 == n3) {
                eD2.H();
            }
        }
        catch (O_ o_2) {
            throw km.a(o_2);
        }
    }

    km(jT jT2) {
        this.H = jT2;
    }

    @NotNull
    private ah<Qf> b(@NotNull Qf qf2) {
        ah ah2;
        long l10;
        block42: {
            eD eD2;
            Qf qf3;
            block41: {
                boolean bl2;
                Qg qg2;
                block40: {
                    boolean bl3;
                    block39: {
                        l10 = a ^ 0x25831B27D4DCL;
                        ah2 = new ah();
                        qg2 = EP.U();
                        try {
                            if (qg2.Y()) {
                                return (ah)ah2.D((String)((Object)km.b("\u00c2", (int)km.a("j", (int)2160, (long)(0xE108C0D7CD84BF3L ^ l10)), (long)-3151418371909703399L, (long)l10)));
                            }
                        }
                        catch (O_ o_2) {
                            throw km.a(o_2);
                        }
                        try {
                            try {
                                if (qf2.G() < 36 || qf2.G() > 44) break block39;
                            }
                            catch (O_ o_3) {
                                throw km.a(o_3);
                            }
                            bl3 = true;
                            break block40;
                        }
                        catch (O_ o_4) {
                            throw km.a(o_4);
                        }
                    }
                    bl3 = bl2 = false;
                }
                if (bl2) {
                    aQ aQ2 = this.H.m();
                    try {
                        if (aQ2.Y()) {
                            return (ah)((ah)ah2.V(String.format((String)((Object)km.b("\u00c2", (int)km.a("j", (int)17454, (long)(0x138106BF722687A8L ^ l10)), (long)-3151418371909703399L, (long)l10)), aQ2.w()))).i(aQ2.H());
                        }
                    }
                    catch (O_ o_5) {
                        throw km.a(o_5);
                    }
                    try {
                        if (aQ2.M()) {
                            return (ah)ah2.D((String)((Object)km.b("\u00c2", (int)km.a("j", (int)21093, (long)(0x36AC0FE7A86A11F9L ^ l10)), (long)-3151418371909703399L, (long)l10)));
                        }
                    }
                    catch (O_ o_6) {
                        throw km.a(o_6);
                    }
                    int n2 = qf2.G() - 36;
                    qg2.l().A(n2);
                    return ((ah)ah2.E((String)((Object)km.b("\u00c2", (int)km.a("j", (int)17709, (long)(0x2E0E87060FBA06A4L ^ l10)), (long)-3151418371909703399L, (long)l10)))).w(qf2);
                }
                try {
                    if (!this.H.R.s().booleanValue()) {
                        return (ah)ah2.V((String)((Object)km.b("\u00c2", (int)km.a("j", (int)15334, (long)(0xF791732032BF86EL ^ l10)), (long)-3151418371909703399L, (long)l10)));
                    }
                }
                catch (O_ o_7) {
                    throw km.a(o_7);
                }
                qf3 = this.V();
                try {
                    try {
                        if (qf3 != null && !qf3.Y()) break block41;
                    }
                    catch (O_ o_8) {
                        throw km.a(o_8);
                    }
                    return (ah)ah2.V((String)((Object)km.b("\u00c2", (int)km.a("j", (int)25178, (long)(0x3F85ED3D980A1DDL ^ l10)), (long)-3151418371909703399L, (long)l10)));
                }
                catch (O_ o_9) {
                    throw km.a(o_9);
                }
            }
            aQ aQ3 = this.H.Y();
            try {
                if (aQ3.Y()) {
                    return (ah)((ah)ah2.V(String.format((String)((Object)km.b("\u00c2", (int)km.a("j", (int)4190, (long)(0x34107546CF01D3D5L ^ l10)), (long)-3151418371909703399L, (long)l10)), aQ3.w()))).i(aQ3.H());
                }
            }
            catch (O_ o_10) {
                throw km.a(o_10);
            }
            try {
                if (aQ3.M()) {
                    return (ah)ah2.D(String.format((String)((Object)km.b("\u00c2", (int)km.a("j", (int)15215, (long)(0x7D16B19B7AAE78F2L ^ l10)), (long)-3151418371909703399L, (long)l10)), aQ3.w()));
                }
            }
            catch (O_ o_11) {
                throw km.a(o_11);
            }
            EB eB2 = EP.X();
            try {
                if (eB2.Y()) {
                    return (ah)ah2.D((String)((Object)km.b("\u00c2", (int)km.a("j", (int)26421, (long)(0x27CAD50B6D7DA4B8L ^ l10)), (long)-3151418371909703399L, (long)l10)));
                }
            }
            catch (O_ o_12) {
                throw km.a(o_12);
            }
            QZ qZ2 = new E9(eB2.M()).R();
            try {
                if (qZ2.Y()) {
                    return (ah)ah2.D((String)((Object)km.b("\u00c2", (int)km.a("j", (int)29733, (long)(0x4A6B0984747B37A0L ^ l10)), (long)-3151418371909703399L, (long)l10)));
                }
            }
            catch (O_ o_13) {
                throw km.a(o_13);
            }
            int n3 = qZ2.D();
            if (this.H.m.isEmpty()) {
                eD2 = eD.X().Y(n3).C(qf2.G()).B(qf3.G() - 36).S();
                this.H.m.add(eD2);
            }
            try {
                if (this.H.m.isEmpty() || !this.H.y()) break block42;
            }
            catch (O_ o_14) {
                throw km.a(o_14);
            }
            eD2 = this.H.m.poll();
            try {
                if (eD2 != null) {
                    this.P(eD2, n3);
                }
            }
            catch (O_ o_15) {
                throw km.a(o_15);
            }
        }
        return (ah)ah2.D((String)((Object)km.b("\u00c2", (int)km.a("j", (int)1056, (long)(0x58CAF68D898047AFL ^ l10)), (long)-3151418371909703399L, (long)l10)));
    }

    @Nullable
    private Qf p() {
        Qf qf2 = this.I();
        try {
            if (qf2 != null) {
                return qf2;
            }
        }
        catch (O_ o_2) {
            throw km.a(o_2);
        }
        return this.s();
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'p' || c10 == '\u00e5' || c10 == '\u00d5' || c10 == '\u00da') {
                field = km.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'p' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00e5' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00d5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = km.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00ed' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00c2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static boolean lambda$getHotbarReplaceSlot$0(Qf qf2) {
        return qf2.y().Y();
    }

    @NotNull
    ah<Qf> T() {
        long l10 = a ^ 0xAEED46BB78CL;
        ah ah2 = new ah();
        Qf qf2 = this.p();
        try {
            if (qf2 == null) {
                return (ah)ah2.V((String)((Object)km.b("\u00c2", (int)km.a("j", (int)18104, (long)(0x3FFF02609960E662L ^ l10)), (long)-5254637684417967543L, (long)l10)));
            }
        }
        catch (O_ o_2) {
            throw km.a(o_2);
        }
        return this.b(qf2);
    }

    @Nullable
    private Qf I() {
        if (this.H.z.s().booleanValue()) {
            Qf qf2 = TR.B(TR.d());
            try {
                if (qf2 != null) {
                    return qf2;
                }
            }
            catch (O_ o_2) {
                throw km.a(o_2);
            }
        }
        try {
            if (this.H.P.s().booleanValue()) {
                return TR.B(TR.N());
            }
        }
        catch (O_ o_3) {
            throw km.a(o_3);
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/km" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = km.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = km.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = km.a(l10, l11);
            object = e[n2];
            try {
                if (!(object instanceof String)) break block2;
                km.e[n2] = clazz = Class.forName(f[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(km.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(km.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

