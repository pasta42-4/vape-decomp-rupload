/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.EP;
import a.KX;
import a.Ky;
import a.OY;
import a.O_;
import a.a;
import a.d8;
import a.ey;
import a.fp;
import a.jU;
import a.jd;
import a.jr;
import a.jv;
import a.tU;
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

public class jz
extends jv {
    public final jr V;
    public final jU Z;
    public final jr h;
    private static final long[] d;
    public final jr v;
    private static final Object[] l;
    private static final Map j;
    public final jU r;
    private static final String[] m;
    private static final Integer[] e;
    public final jd T;
    public final jr K;
    private static final long b;
    public final jd N;

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = jz.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field c(long l10, long l11) {
        int n2 = jz.a(l10, l11);
        Object object = l[n2];
        if (object instanceof String) {
            String string = m[n2];
            int n3 = string.indexOf(8);
            Class clazz = jz.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = jz.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = jz.a(clazz3, string2, clazz2)) != null) {
                    jz.l[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = jz.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        jz.l[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = jz.b(220664574884092L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
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
            int n2 = jz.a(l10, l11);
            object = l[n2];
            try {
                if (!(object instanceof String)) break block2;
                jz.l[n2] = clazz = Class.forName(m[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public void X(KX kX2) {
        fp fp2 = Ao.D(fp.class);
        try {
            if (fp2 == null) {
                return;
            }
        }
        catch (O_ o_2) {
            throw jz.a(o_2);
        }
        fp2.a(kX2);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = jz.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = jz.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public jz() {
        long l10 = b ^ 0x50AEA907D174L;
        super(a.cs((int)jz.a("l", (int)202, (long)(0x2A83E478AE28643DL ^ l10))), ey.d, a.cs((int)jz.a("l", (int)6115, (long)(0x406CDA5D48117317L ^ l10))), fp.class);
        this.V = new jr((String)((Object)jz.c("\u00ff", (int)jz.a("l", (int)801, (long)(0x312F33412D70E7D2L ^ l10)), (long)1006621016329240078L, (long)l10)));
        this.h = new jr((String)((Object)jz.c("\u00ff", (int)jz.a("l", (int)27940, (long)(0x12C7FD89EFA189D6L ^ l10)), (long)1006621016329240078L, (long)l10)));
        this.N = jd.D(this, (String)((Object)jz.c("\u00ff", (int)jz.a("l", (int)2839, (long)(0x1F0D0A2CCA736FE1L ^ l10)), (long)1006621016329240078L, (long)l10)), this.V, this.V, this.h);
        this.v = new jr((String)((Object)jz.c("\u00ff", (int)jz.a("l", (int)15635, (long)(0x5DF4B9FFB0B459E6L ^ l10)), (long)1006621016329240078L, (long)l10)));
        this.K = new jr((String)((Object)jz.c("\u00ff", (int)jz.a("l", (int)20634, (long)(0x5DEFD8C78282346BL ^ l10)), (long)1006621016329240078L, (long)l10)));
        this.T = jd.D(this, (String)((Object)jz.c("\u00ff", (int)jz.a("l", (int)8162, (long)(0x52ED1A8EE5237B1EL ^ l10)), (long)1006621016329240078L, (long)l10)), this.v, this.v, this.K);
        this.Z = jU.w(this, (String)((Object)jz.c("\u00ff", (int)jz.a("l", (int)20935, (long)(0x64961E787E873539L ^ l10)), (long)1006621016329240078L, (long)l10)), true);
        this.r = jU.w(this, (String)((Object)jz.c("\u00ff", (int)jz.a("l", (int)200, (long)(0xED72CED6B80E435L ^ l10)), (long)1006621016329240078L, (long)l10)), false);
        this.s((String)((Object)jz.c("\u00ff", (int)jz.a("l", (int)10537, (long)(0x3B37B343D95ECDD9L ^ l10)), (long)1006621016329240078L, (long)l10)));
        this.N(this.N, this.T, this.Z, this.r);
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x690D;
        if (e[n3] == null) {
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
                throw new RuntimeException("a/jz", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            jz.e[n3] = n4;
        }
        return e[n3];
    }

    @OY
    public void T(Ky ky2) {
        fp fp2 = Ao.D(fp.class);
        try {
            if (fp2 == null) {
                return;
            }
        }
        catch (O_ o_2) {
            throw jz.a(o_2);
        }
        try {
            fp2.N(ky2);
            if (!ky2.getButtonState()) {
                return;
            }
        }
        catch (O_ o_3) {
            throw jz.a(o_3);
        }
        try {
            if (EP.X().r()) {
                return;
            }
        }
        catch (O_ o_4) {
            throw jz.a(o_4);
        }
        fp2.w().T(ky2.getButton());
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'c' || c10 == '\u00c1' || c10 == '\u00f2' || c10 == 'd') {
                field = jz.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'c' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00c1' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00f2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = jz.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'Y' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00ff' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method d(long l10, long l11) {
        int n2 = jz.a(l10, l11);
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
                clazz3 = jz.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = jz.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = jz.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        jz.l[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = jz.b(220664574884092L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = jz.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        jz.l[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = jz.b(220664574884092L, 0L);
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
                jz.b = d8.a(-7872510321460883470L, -6145042648001571008L, MethodHandles.lookup().lookupClass()).a(180736245764296L);
                jz.l = new Object[5];
                jz.m = new String[5];
                jz.a();
                jz.j = new HashMap<K, V>(13);
                var0 = jz.b ^ 73040392986325L;
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
                var8_3 = new long[11];
                var5_4 = 0;
                var6_5 = "\u00b5'\u00a2\u009a\u00d2\u009f\u00f8\u00e5\u0001\u00d0\u00e8\u0088\u0019G>\u00ad'%\u009c\u00b5\u0098\u00c8\u0090\u00bfhW\u00af\u00c4\u0087(\u00c2\u0016_\u00f8C\u0096~\u00d2\u00f2[\u00c9\u0007\u00e0m\u00ces\u0010\u00d8\u00da[\u00ffa1u\u0083\u00ads\u00a3u8Wwu\u00ff\u00b5\u00bd\u00c4\u000baQ:\u00d6";
                var7_6 = "\u00b5'\u00a2\u009a\u00d2\u009f\u00f8\u00e5\u0001\u00d0\u00e8\u0088\u0019G>\u00ad'%\u009c\u00b5\u0098\u00c8\u0090\u00bfhW\u00af\u00c4\u0087(\u00c2\u0016_\u00f8C\u0096~\u00d2\u00f2[\u00c9\u0007\u00e0m\u00ces\u0010\u00d8\u00da[\u00ffa1u\u0083\u00ads\u00a3u8Wwu\u00ff\u00b5\u00bd\u00c4\u000baQ:\u00d6".length();
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
                    var6_5 = "\u00b4\u00ceUl\u0015\u00f2\u00bb.\u00c63~Vq\u00d8\u00b7\u00f1";
                    var7_6 = "\u00b4\u00ceUl\u0015\u00f2\u00bb.\u00c63~Vq\u00d8\u00b7\u00f1".length();
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
        jz.d = var8_3;
        jz.e = new Integer[11];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = jz.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = jz.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = jz.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = l;
        l[0] = "Ww,";
        objectArray[1] = Integer.TYPE;
        jz.m[1] = "java/lang/Integer";
        objectArray[2] = "<\r.2:(7\u0002?}G0$\u000564";
        objectArray[3] = "\u0003\u000biXj#\b\u0004x\u0017\u000b-\u0003\u000f|M";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0004! \u001aS\u0001\u0000#{f\u0006\u0006=f%ZP\f[}x\u0001mDA%}\u0014P\u0010Rn'f";
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void K(tU tU2, boolean bl2) {
        fp fp2 = Ao.D(fp.class);
        try {
            if (fp2 == null) {
                return;
            }
        }
        catch (O_ o_2) {
            throw jz.a(o_2);
        }
        fp2.s(tU2, bl2);
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
                n4 = 42;
                break;
            }
            case 1: {
                n4 = 17;
                break;
            }
            case 2: {
                n4 = 35;
                break;
            }
            case 3: {
                n4 = 55;
                break;
            }
            case 4: {
                n4 = 1;
                break;
            }
            case 5: {
                n4 = 20;
                break;
            }
            case 6: {
                n4 = 10;
                break;
            }
            case 7: {
                n4 = 39;
                break;
            }
            case 8: {
                n4 = 2;
                break;
            }
            case 9: {
                n4 = 4;
                break;
            }
            case 10: {
                n4 = 25;
                break;
            }
            case 11: {
                n4 = 48;
                break;
            }
            case 12: {
                n4 = 28;
                break;
            }
            case 13: {
                n4 = 0;
                break;
            }
            case 14: {
                n4 = 22;
                break;
            }
            case 15: {
                n4 = 21;
                break;
            }
            case 16: {
                n4 = 19;
                break;
            }
            case 17: {
                n4 = 3;
                break;
            }
            case 18: {
                n4 = 23;
                break;
            }
            case 19: {
                n4 = 52;
                break;
            }
            case 20: {
                n4 = 53;
                break;
            }
            case 21: {
                n4 = 59;
                break;
            }
            case 22: {
                n4 = 51;
                break;
            }
            case 23: {
                n4 = 56;
                break;
            }
            case 24: {
                n4 = 5;
                break;
            }
            case 25: {
                n4 = 11;
                break;
            }
            case 26: {
                n4 = 26;
                break;
            }
            case 27: {
                n4 = 31;
                break;
            }
            case 28: {
                n4 = 12;
                break;
            }
            case 29: {
                n4 = 32;
                break;
            }
            case 30: {
                n4 = 37;
                break;
            }
            case 31: {
                n4 = 15;
                break;
            }
            case 32: {
                n4 = 13;
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
                n4 = 27;
                break;
            }
            case 36: {
                n4 = 49;
                break;
            }
            case 37: {
                n4 = 54;
                break;
            }
            case 38: {
                n4 = 62;
                break;
            }
            case 39: {
                n4 = 46;
                break;
            }
            case 40: {
                n4 = 44;
                break;
            }
            case 41: {
                n4 = 8;
                break;
            }
            case 42: {
                n4 = 33;
                break;
            }
            case 43: {
                n4 = 6;
                break;
            }
            case 44: {
                n4 = 61;
                break;
            }
            case 45: {
                n4 = 18;
                break;
            }
            case 46: {
                n4 = 36;
                break;
            }
            case 47: {
                n4 = 57;
                break;
            }
            case 48: {
                n4 = 50;
                break;
            }
            case 49: {
                n4 = 34;
                break;
            }
            case 50: {
                n4 = 45;
                break;
            }
            case 51: {
                n4 = 47;
                break;
            }
            case 52: {
                n4 = 38;
                break;
            }
            case 53: {
                n4 = 60;
                break;
            }
            case 54: {
                n4 = 40;
                break;
            }
            case 55: {
                n4 = 63;
                break;
            }
            case 56: {
                n4 = 58;
                break;
            }
            case 57: {
                n4 = 24;
                break;
            }
            case 58: {
                n4 = 14;
                break;
            }
            case 59: {
                n4 = 41;
                break;
            }
            case 60: {
                n4 = 9;
                break;
            }
            case 61: {
                n4 = 43;
                break;
            }
            case 62: {
                n4 = 29;
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
        jz.m[n5] = new String(cArray);
        return n5;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(jz.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(jz.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

