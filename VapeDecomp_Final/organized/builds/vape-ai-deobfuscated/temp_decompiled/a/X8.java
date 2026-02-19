/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.B5;
import a.Bg;
import a.EP;
import a.KB;
import a.OY;
import a.O_;
import a.Oe;
import a.Oq;
import a.QX;
import a.Qc;
import a.V4;
import a.a;
import a.d8;
import a.eM;
import a.jG;
import a.jU;
import a.jX;
import a.jd;
import a.jr;
import a.js;
import a.tU;
import a.xG;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class x8
extends xG {
    private final jr Z;
    private final jr V;
    private static final Map j;
    private final jX d;
    private Bg X;
    private final jU B;
    private static final String[] m;
    private static final long b;
    private final js O;
    private final jr N;
    int r;
    private final jU[] z;
    private boolean P;
    private static final long[] e;
    private final jd o;
    private static final Integer[] h;
    private static final Object[] l;
    private Bg t;
    private final Queue<B5> K;

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field c(long l10, long l11) {
        int n2 = x8.a(l10, l11);
        Object object = l[n2];
        if (object instanceof String) {
            String string = m[n2];
            int n3 = string.indexOf(8);
            Class clazz = x8.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = x8.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = x8.a(clazz3, string2, clazz2)) != null) {
                    x8.l[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = x8.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        x8.l[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = x8.b(262127124117622L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = x8.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = x8.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = x8.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/x8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = x8.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'T' || c10 == '\u00f3' || c10 == 'a' || c10 == 'r') {
                field = x8.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'T' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00f3' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'a' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = x8.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'C' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'q' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @Override
    public void v() {
        this.P = false;
        this.K.clear();
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private boolean I(int n2) {
        int n3;
        block11: {
            block12: {
                block10: {
                    try {
                        if (!this.B.s().booleanValue()) {
                            EP.U().l().A(n2);
                            return true;
                        }
                    }
                    catch (O_ o_2) {
                        throw x8.a(o_2);
                    }
                    try {
                        if (!this.t.m(((Double)this.O.J()).longValue())) {
                            return false;
                        }
                    }
                    catch (O_ o_3) {
                        throw x8.a(o_3);
                    }
                    n3 = EP.U().l().v();
                    try {
                        if (n2 <= n3) break block10;
                        ++n3;
                        break block11;
                    }
                    catch (O_ o_4) {
                        throw x8.a(o_4);
                    }
                }
                try {
                    if (n2 >= n3) break block12;
                    --n3;
                    break block11;
                }
                catch (O_ o_5) {
                    throw x8.a(o_5);
                }
            }
            this.t.m();
            return true;
        }
        EP.U().l().A(n3);
        return false;
    }

    public x8() {
        long l10 = b ^ 0xB3FB35EAD82L;
        super(a.cs((int)x8.a("x", (int)4298, (long)(0x722415FEF64DBC2CL ^ l10))), Oq.W, "");
        this.K = new ArrayDeque<B5>();
        this.Z = new jr((String)((Object)x8.c("q", (int)x8.a("x", (int)1942, (long)(0x46759B8B1CC12B78L ^ l10)), (long)5378246318139632963L, (long)l10)));
        this.N = new jr((String)((Object)x8.c("q", (int)x8.a("x", (int)29534, (long)(0x7CF5424B44275FBCL ^ l10)), (long)5378246318139632963L, (long)l10)));
        this.V = new jr((String)((Object)x8.c("q", (int)x8.a("x", (int)6004, (long)(0x4CB4575C7475BB9CL ^ l10)), (long)5378246318139632963L, (long)l10)));
        this.o = jd.I(this, (String)((Object)x8.c("q", (int)x8.a("x", (int)2705, (long)(0x2A18B152F3452672L ^ l10)), (long)5378246318139632963L, (long)l10)), (String)((Object)x8.c("q", (int)x8.a("x", (int)670, (long)(0x2B4FBF598ED82E74L ^ l10)), (long)5378246318139632963L, (long)l10)), this.N, this.Z, this.N, this.V);
        this.z = new jU[]{jU.w(this, (String)((Object)x8.c("q", (int)x8.a("x", (int)20568, (long)(0x329141C3F3327CBCL ^ l10)), (long)5378246318139632963L, (long)l10)), true), jU.w(this, (String)((Object)x8.c("q", (int)x8.a("x", (int)12997, (long)(0x3252C39767569E20L ^ l10)), (long)5378246318139632963L, (long)l10)), true), jU.w(this, (String)((Object)x8.c("q", (int)x8.a("x", (int)9226, (long)(0x7228C44E993608E6L ^ l10)), (long)5378246318139632963L, (long)l10)), true), jU.w(this, (String)((Object)x8.c("q", (int)x8.a("x", (int)7183, (long)(0x5CE0B95ED2B7B0E4L ^ l10)), (long)5378246318139632963L, (long)l10)), true)};
        this.d = jX.P(this, (String)((Object)x8.c("q", (int)x8.a("x", (int)31353, (long)(0x3F744F2C9BFB5690L ^ l10)), (long)5378246318139632963L, (long)l10)), (String)((Object)x8.c("q", (int)x8.a("x", (int)22783, (long)(0x7EC918165E41F410L ^ l10)), (long)5378246318139632963L, (long)l10)), "", 0.0, 70.0, 120.0, 200.0);
        this.B = jU.w(this, (String)((Object)x8.c("q", (int)x8.a("x", (int)27937, (long)(0x27334605A16AC1C6L ^ l10)), (long)5378246318139632963L, (long)l10)), false);
        this.O = js.t(this, (String)((Object)x8.c("q", (int)x8.a("x", (int)9105, (long)(0x127055147FA20F7CL ^ l10)), (long)5378246318139632963L, (long)l10)), (String)((Object)x8.c("q", (int)x8.a("x", (int)9753, (long)(0x3D6EC67E79210AF9L ^ l10)), (long)5378246318139632963L, (long)l10)), (String)((Object)x8.c("q", (int)x8.a("x", (int)27038, (long)(0x55EA75863504457FL ^ l10)), (long)5378246318139632963L, (long)l10)), 0.0, 100.0, 200.0);
        this.X = new Bg();
        this.t = new Bg();
        this.P = false;
        this.r = 0;
        this.q(false);
        this.N(this.o);
        for (jU jU2 : this.z) {
            this.N(jU2);
        }
        this.N(this.d);
        this.B.l(this.O);
        this.N(this.B);
        this.N(this.O);
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

    private static void a() {
        Object[] objectArray = l;
        l[0] = "\u000f%x";
        objectArray[1] = Integer.TYPE;
        x8.m[1] = "java/lang/Integer";
        objectArray[2] = "1N\u0017\\N-:A\u0006\u001335)F\u000fZ";
        objectArray[3] = "I+Q1i!B$@~\b/I/D$";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "<n\u00052R\n=pBKCA]jQ%NK7i\fv(\u0003\"z[qKQ?oLK";
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                x8.b = d8.a(-255302353597130964L, -8711569723258698186L, MethodHandles.lookup().lookupClass()).a(116044789670035L);
                x8.l = new Object[5];
                x8.m = new String[5];
                x8.a();
                x8.j = new HashMap<K, V>(13);
                var0 = x8.b ^ 92723627045199L;
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
                var8_3 = new long[16];
                var5_4 = 0;
                var6_5 = "xfK\u001c\u008b\u00e2\u00f8\u009b\u0013\u0096\u00f2[j\u00af)\u00b9\u0086\u00a2\u00e7\u00d0\u00b4\u00f5PsX\u00e7h\u00a7\u0011\u00f0\u0003\b\u00d8M\u00cc\u00ba\u0089\u0096\u00e0{\u000e\u00f0\u00bai\u00e6\u00d4\u00e1\u0016ds\u007fb\u00df\u00b8\u00c1\u001ap\u00e95\u0004\u00dc\u0096\u00caroQh\u0086\u00e3\u001a|~\u001b5c\u00b8\u00bc\u0015\u001b<\u00c1\u00d4\u0093\u00fe]+)'\u00e4\u0082\u00cbA\u00acEp\u00fc\u0084\u00bb\u0095S\u00af\u0094\u00cb\u00a3\u00de\u00deQ\u001dy\u00d3\u00bbq";
                var7_6 = "xfK\u001c\u008b\u00e2\u00f8\u009b\u0013\u0096\u00f2[j\u00af)\u00b9\u0086\u00a2\u00e7\u00d0\u00b4\u00f5PsX\u00e7h\u00a7\u0011\u00f0\u0003\b\u00d8M\u00cc\u00ba\u0089\u0096\u00e0{\u000e\u00f0\u00bai\u00e6\u00d4\u00e1\u0016ds\u007fb\u00df\u00b8\u00c1\u001ap\u00e95\u0004\u00dc\u0096\u00caroQh\u0086\u00e3\u001a|~\u001b5c\u00b8\u00bc\u0015\u001b<\u00c1\u00d4\u0093\u00fe]+)'\u00e4\u0082\u00cbA\u00acEp\u00fc\u0084\u00bb\u0095S\u00af\u0094\u00cb\u00a3\u00de\u00deQ\u001dy\u00d3\u00bbq".length();
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
                    var6_5 = "\u00e6\u0082\f\u00ec\u00fe6 \u00d3\u00ad+\u00f3;\u00147F\u0015";
                    var7_6 = "\u00e6\u0082\f\u00ec\u00fe6 \u00d3\u00ad+\u00f3;\u00147F\u0015".length();
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
        x8.e = var8_3;
        x8.h = new Integer[16];
    }

    private static Method d(long l10, long l11) {
        int n2 = x8.a(l10, l11);
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
                clazz3 = x8.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = x8.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = x8.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        x8.l[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = x8.b(262127124117622L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = x8.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        x8.l[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = x8.b(262127124117622L, 0L);
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
                n4 = 15;
                break;
            }
            case 1: {
                n4 = 25;
                break;
            }
            case 2: {
                n4 = 48;
                break;
            }
            case 3: {
                n4 = 55;
                break;
            }
            case 4: {
                n4 = 47;
                break;
            }
            case 5: {
                n4 = 38;
                break;
            }
            case 6: {
                n4 = 11;
                break;
            }
            case 7: {
                n4 = 17;
                break;
            }
            case 8: {
                n4 = 29;
                break;
            }
            case 9: {
                n4 = 59;
                break;
            }
            case 10: {
                n4 = 31;
                break;
            }
            case 11: {
                n4 = 34;
                break;
            }
            case 12: {
                n4 = 19;
                break;
            }
            case 13: {
                n4 = 10;
                break;
            }
            case 14: {
                n4 = 30;
                break;
            }
            case 15: {
                n4 = 51;
                break;
            }
            case 16: {
                n4 = 22;
                break;
            }
            case 17: {
                n4 = 39;
                break;
            }
            case 18: {
                n4 = 16;
                break;
            }
            case 19: {
                n4 = 32;
                break;
            }
            case 20: {
                n4 = 49;
                break;
            }
            case 21: {
                n4 = 2;
                break;
            }
            case 22: {
                n4 = 7;
                break;
            }
            case 23: {
                n4 = 42;
                break;
            }
            case 24: {
                n4 = 18;
                break;
            }
            case 25: {
                n4 = 46;
                break;
            }
            case 26: {
                n4 = 23;
                break;
            }
            case 27: {
                n4 = 27;
                break;
            }
            case 28: {
                n4 = 13;
                break;
            }
            case 29: {
                n4 = 26;
                break;
            }
            case 30: {
                n4 = 8;
                break;
            }
            case 31: {
                n4 = 61;
                break;
            }
            case 32: {
                n4 = 56;
                break;
            }
            case 33: {
                n4 = 9;
                break;
            }
            case 34: {
                n4 = 45;
                break;
            }
            case 35: {
                n4 = 1;
                break;
            }
            case 36: {
                n4 = 0;
                break;
            }
            case 37: {
                n4 = 58;
                break;
            }
            case 38: {
                n4 = 37;
                break;
            }
            case 39: {
                n4 = 12;
                break;
            }
            case 40: {
                n4 = 24;
                break;
            }
            case 41: {
                n4 = 43;
                break;
            }
            case 42: {
                n4 = 52;
                break;
            }
            case 43: {
                n4 = 21;
                break;
            }
            case 44: {
                n4 = 28;
                break;
            }
            case 45: {
                n4 = 62;
                break;
            }
            case 46: {
                n4 = 4;
                break;
            }
            case 47: {
                n4 = 44;
                break;
            }
            case 48: {
                n4 = 3;
                break;
            }
            case 49: {
                n4 = 54;
                break;
            }
            case 50: {
                n4 = 20;
                break;
            }
            case 51: {
                n4 = 14;
                break;
            }
            case 52: {
                n4 = 5;
                break;
            }
            case 53: {
                n4 = 40;
                break;
            }
            case 54: {
                n4 = 50;
                break;
            }
            case 55: {
                n4 = 60;
                break;
            }
            case 56: {
                n4 = 6;
                break;
            }
            case 57: {
                n4 = 57;
                break;
            }
            case 58: {
                n4 = 33;
                break;
            }
            case 59: {
                n4 = 41;
                break;
            }
            case 60: {
                n4 = 63;
                break;
            }
            case 61: {
                n4 = 35;
                break;
            }
            case 62: {
                n4 = 53;
                break;
            }
            default: {
                n4 = 36;
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
        x8.m[n5] = new String(cArray);
        return n5;
    }

    @Override
    public void h() {
        block3: {
            block2: {
                try {
                    if (!this.k()) break block2;
                    this.r = EP.U().l().v();
                    break block3;
                }
                catch (O_ o_2) {
                    throw x8.a(o_2);
                }
            }
            this.T(false);
        }
    }

    @Override
    public void W() {
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x6641;
        if (h[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = e[n3];
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
                throw new RuntimeException("a/x8", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            x8.h[n3] = n4;
        }
        return h[n3];
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = x8.a(l10, l11);
            object = l[n2];
            try {
                if (!(object instanceof String)) break block2;
                x8.l[n2] = clazz = Class.forName(m[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = x8.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = x8.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @OY
    public void G(KB kB2) {
        tU tU2;
        block11: {
            block12: {
                tU2 = EP.N().D();
                try {
                    if (this.P) {
                        Oe.r(tU2, false, false);
                        this.P = false;
                        return;
                    }
                }
                catch (O_ o_2) {
                    throw x8.a(o_2);
                }
                try {
                    try {
                        if (!this.K.isEmpty()) break block11;
                        if (!this.I(this.r)) break block12;
                    }
                    catch (O_ o_3) {
                        throw x8.a(o_3);
                    }
                    this.T(false);
                }
                catch (O_ o_4) {
                    throw x8.a(o_4);
                }
            }
            return;
        }
        if (this.X.m((long)this.d.l())) {
            B5 b52 = this.K.peek();
            try {
                if (this.I(b52.y())) {
                    Oe.r(tU2, true, true);
                    this.P = true;
                    this.X.m();
                    this.K.poll();
                }
            }
            catch (O_ o_5) {
                throw x8.a(o_5);
            }
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/x8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private boolean k() {
        boolean bl2;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        try {
            for (int i10 = 0; i10 < 9; ++i10) {
                arrayList.add(i10);
            }
        }
        catch (O_ o_2) {
            throw x8.a(o_2);
        }
        Object[] objectArray = EP.U().l().C();
        ArrayList<jU> arrayList2 = new ArrayList<jU>();
        block19: for (Integer n2 : arrayList) {
            V4 v42 = new V4(objectArray[n2]);
            try {
                if (v42.Y()) {
                    continue;
                }
            }
            catch (O_ o_3) {
                throw x8.a(o_3);
            }
            QX qX2 = v42.C();
            try {
                if (qX2.Y()) {
                    continue;
                }
            }
            catch (O_ o_4) {
                throw x8.a(o_4);
            }
            if (!eM.Fl.isInstance(qX2.M())) continue;
            Qc qc2 = new Qc(qX2.M());
            for (jU jU2 : this.z) {
                try {
                    try {
                        if (((jG)this.o.J()).equals(this.N) && arrayList2.contains(jU2)) {
                            continue;
                        }
                    }
                    catch (O_ o_5) {
                        throw x8.a(o_5);
                    }
                }
                catch (O_ o_6) {
                    throw x8.a(o_6);
                }
                String string = qc2.m(v42).toLowerCase();
                String string2 = jU2.O().toLowerCase();
                try {
                    try {
                        try {
                            if (!jU2.s().booleanValue() || !string.contains(string2)) continue;
                        }
                        catch (O_ o_7) {
                            throw x8.a(o_7);
                        }
                        this.K.add(new B5(n2, v42));
                        arrayList2.add(jU2);
                        if (!((jG)this.o.J()).equals(this.V)) continue block19;
                        break block19;
                    }
                    catch (O_ o_8) {
                        throw x8.a(o_8);
                    }
                }
                catch (O_ o_9) {
                    throw x8.a(o_9);
                }
            }
        }
        try {
            bl2 = !this.K.isEmpty();
        }
        catch (O_ o_10) {
            throw x8.a(o_10);
        }
        return bl2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(x8.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(x8.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

