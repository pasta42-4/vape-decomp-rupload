/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.OT;
import a.O_;
import a.a2;
import a.bE;
import a.bt;
import a.d8;
import a.h7;
import a.hr;
import a.ht;
import a.yG;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ya
extends yG {
    private final bt Wn;
    private static final Object[] lb;
    private static final long ab;
    private final hr WU;
    private OT W2;
    private static final String[] mb;
    private static final Map fb;
    private final hr WJ;
    private static final Integer[] eb;
    private a2 WV;
    private final yG W0;
    private static int WQ;
    private final h7 WC;
    private static final long[] bb;
    private final yG WO;

    public ya() {
        long l10 = ab ^ 0x70D80B12A03CL;
        super(WQ, 170.0);
        this.WO = new yG(192.0, 10.0);
        this.W0 = new yG(WQ, 144.0);
        this.Wn = new bt((String)((Object)ya.d("Z", (int)ya.c("n", (int)5338, (long)(0x7BE24418617FD430L ^ l10)), (long)-3098748532500953027L, (long)l10)));
        this.WJ = new hr((String)((Object)ya.d("Z", (int)ya.c("n", (int)16824, (long)(0x33E3E20399BB8153L ^ l10)), (long)-3098748532500953027L, (long)l10)), 0.633, ya.M.S, ya.M.S, 16.0, 10.0);
        this.WC = new h7(null, ya.M.c);
        this.WU = new hr((String)((Object)ya.d("Z", (int)ya.c("n", (int)12924, (long)(0x6B6945CE24627290L ^ l10)), (long)-3098748532500953027L, (long)l10)), 0.633, ya.M.W, ya.M.W, 52.0, 10.0);
        this.W0.d().f((String)((Object)ya.d("Z", (int)ya.c("n", (int)21154, (long)(0x1118467D7A33124CL ^ l10)), (long)-3098748532500953027L, (long)l10)));
        this.W0.i(144.0);
        bt bt2 = new bt((String)((Object)ya.d("Z", (int)ya.c("n", (int)13602, (long)(0x1FB545D2344AF5CAL ^ l10)), (long)-3098748532500953027L, (long)l10)));
        bt2.B(ya.M.w);
        bt2.q(true);
        this.WU.I(ya.M.S);
        this.WU.i(false);
        this.WU.G(0.75f);
        this.Wn.B(ya.M.c);
        this.Wn.S(0.0f);
        this.Wn.p(1.0);
        this.WC.N(false);
        bt2.S(0.0f);
        this.WO.d().J(true);
        this.WO.n(this.Wn, new Object[0]);
        this.WO.n(new bE(3.0, 0.0), new Object[0]);
        this.WO.n(this.WJ, new Object[0]);
        this.WO.n(new bE(3.0, 0.0), new Object[0]);
        this.WO.n(this.WC, new Object[0]);
        this.WO.n(this.WU, ya.d("Z", (int)ya.c("n", (int)8588, (long)(0x4609A5783F056161L ^ l10)), (long)-3098748532500953027L, (long)l10));
        this.d().f((String)((Object)ya.d("Z", (int)ya.c("n", (int)5124, (long)(0x348FF1C8260BD4EDL ^ l10)), (long)-3098748532500953027L, (long)l10)));
        this.n(this.WO, new Object[0]);
        this.n(new bE(0.0, 4.0), new Object[0]);
        this.n(bt2, new Object[0]);
        this.n(this.W0, new Object[0]);
        this.WU.N(this::lambda$new$0);
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00e7' || c10 == '\u00c8' || c10 == '\u00c3' || c10 == '\u00ec') {
                field = ya.k(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00e7' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00c8' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00c3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ya.l(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'T' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'Z' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/ya" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = ya.c(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static Field k(long l10, long l11) {
        int n2 = ya.i(l10, l11);
        Object object = lb[n2];
        if (object instanceof String) {
            String string = mb[n2];
            int n3 = string.indexOf(8);
            Class clazz = ya.j(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = ya.j(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ya.e(clazz3, string2, clazz2)) != null) {
                    ya.lb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = ya.f(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        ya.lb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ya.j(240339679692863L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ya.ab = d8.a(4762938371899137733L, -3693859749530795318L, MethodHandles.lookup().lookupClass()).a(243070665696640L);
                var11 = ya.ab ^ 30219327315515L;
                ya.lb = new Object[5];
                ya.mb = new String[5];
                ya.x();
                ya.fb = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var11 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var6_3 = new long[10];
                var3_4 = 0;
                var4_5 = "\u0014\u00f4?H$E\u00a1\u00cd\u001f\u00dc\u00dd\u0086\u0085R(`\u0084(Mr;8\u0012\u0094\u00e4\u00d1Ao#zP8;\u00ea\u00dd*\u00ff\u0098\u00f1\u00d7E\u00ccc\u0085\u00fe\u0097\u00de\u00e4\u00b0\u0091\u001c\u00e7\u0006\u0096\u0097,j\u0014\u0001\u00f0E*\u00da\u00d3";
                var5_6 = "\u0014\u00f4?H$E\u00a1\u00cd\u001f\u00dc\u00dd\u0086\u0085R(`\u0084(Mr;8\u0012\u0094\u00e4\u00d1Ao#zP8;\u00ea\u00dd*\u00ff\u0098\u00f1\u00d7E\u00ccc\u0085\u00fe\u0097\u00de\u00e4\u00b0\u0091\u001c\u00e7\u0006\u0096\u0097,j\u0014\u0001\u00f0E*\u00da\u00d3".length();
                var2_7 = 0;
                while (true) {
                    var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                    v3 = var6_3;
                    v4 = var3_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var2_7 < var5_6) ** continue;
                    var4_5 = "=\u00f5}'\u0080\u0003\u0010x\u00a9\u001f\u0014\u0004\u0082\u00a8Qx";
                    var5_6 = "=\u00f5}'\u0080\u0003\u0010x\u00a9\u001f\u0014\u0004\u0082\u00a8Qx".length();
                    var2_7 = 0;
                    while (true) {
                        var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                        v3 = var6_3;
                        v4 = var3_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
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
                    if (var2_7 < var5_6) ** continue;
                    break block9;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var0_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
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
        ya.bb = var6_3;
        ya.eb = new Integer[10];
        ya.WQ = (int)ya.c("n", (int)11735, (long)(3652660625786983219L ^ var11));
    }

    private static Method f(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = ya.e(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = ya.f(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/ya" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method l(long l10, long l11) {
        int n2 = ya.i(l10, l11);
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
                String string2 = mb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = ya.j(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = ya.j(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ya.e(clazz, string, clazz2, n3, classArray2)) != null) {
                        ya.lb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ya.j(240339679692863L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = ya.f(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        ya.lb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ya.j(240339679692863L, 0L);
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

    public void l(OT oT2) {
        this.W2 = oT2;
    }

    private static int c(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x1414;
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
                throw new RuntimeException("a/ya", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ya.eb[n3] = n4;
        }
        return eb[n3];
    }

    public void R(a2 a22) {
        block6: {
            block5: {
                CallSite callSite;
                hr hr2;
                long l10 = ab ^ 0x499C8407BA1BL;
                try {
                    this.WV = a22;
                    this.Wn.H(a22.O());
                    hr2 = this.WJ;
                    callSite = a22.S() ? ya.d("Z", (int)ya.c("n", (int)25499, (long)(0x643C08FF49DF3953L ^ l10)), (long)-3542026250949127654L, (long)l10) : ya.d("Z", (int)ya.c("n", (int)31710, (long)(0x56B9F16FEEF5211BL ^ l10)), (long)-3542026250949127654L, (long)l10);
                }
                catch (O_ o_2) {
                    throw ya.a(o_2);
                }
                try {
                    hr2.z((String)((Object)callSite));
                    if (!a22.M()) break block5;
                    this.WC.N(true);
                    this.WC.b(a22.u().T());
                    break block6;
                }
                catch (O_ o_3) {
                    throw ya.a(o_3);
                }
            }
            this.WC.N(false);
        }
        this.W0.k();
        List<ht> list = this.W2.q().U(a22);
        for (ht ht2 : list) {
            this.W0.n(ht2, new Object[0]);
        }
        this.h(true);
    }

    private static void x() {
        Object[] objectArray = lb;
        lb[0] = "j\u001cr";
        objectArray[1] = Integer.TYPE;
        ya.mb[1] = "java/lang/Integer";
        objectArray[2] = "\u0004IFd0\u0003\u000fFW+M\u001b\u001cA^b";
        objectArray[3] = "A!\u0014)GtJ.\u0005f&zA%\u0001<";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\bnm|[Z\ra&\u0002IGg>#iRX\u0007xp`G<^`a=Z[Vd k\"";
    }

    private static Class j(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = ya.i(l10, l11);
            object = lb[n2];
            try {
                if (!(object instanceof String)) break block2;
                ya.lb[n2] = clazz = Class.forName(mb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = ya.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = ya.f(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int i(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (mb[n5] != null) {
            return n5;
        }
        Object object = lb[n5];
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
                n4 = 11;
                break;
            }
            case 2: {
                n4 = 43;
                break;
            }
            case 3: {
                n4 = 35;
                break;
            }
            case 4: {
                n4 = 24;
                break;
            }
            case 5: {
                n4 = 36;
                break;
            }
            case 6: {
                n4 = 48;
                break;
            }
            case 7: {
                n4 = 56;
                break;
            }
            case 8: {
                n4 = 55;
                break;
            }
            case 9: {
                n4 = 52;
                break;
            }
            case 10: {
                n4 = 47;
                break;
            }
            case 11: {
                n4 = 22;
                break;
            }
            case 12: {
                n4 = 18;
                break;
            }
            case 13: {
                n4 = 37;
                break;
            }
            case 14: {
                n4 = 61;
                break;
            }
            case 15: {
                n4 = 5;
                break;
            }
            case 16: {
                n4 = 58;
                break;
            }
            case 17: {
                n4 = 26;
                break;
            }
            case 18: {
                n4 = 53;
                break;
            }
            case 19: {
                n4 = 13;
                break;
            }
            case 20: {
                n4 = 60;
                break;
            }
            case 21: {
                n4 = 12;
                break;
            }
            case 22: {
                n4 = 4;
                break;
            }
            case 23: {
                n4 = 59;
                break;
            }
            case 24: {
                n4 = 38;
                break;
            }
            case 25: {
                n4 = 49;
                break;
            }
            case 26: {
                n4 = 27;
                break;
            }
            case 27: {
                n4 = 31;
                break;
            }
            case 28: {
                n4 = 46;
                break;
            }
            case 29: {
                n4 = 63;
                break;
            }
            case 30: {
                n4 = 30;
                break;
            }
            case 31: {
                n4 = 1;
                break;
            }
            case 32: {
                n4 = 54;
                break;
            }
            case 33: {
                n4 = 33;
                break;
            }
            case 34: {
                n4 = 41;
                break;
            }
            case 35: {
                n4 = 50;
                break;
            }
            case 36: {
                n4 = 3;
                break;
            }
            case 37: {
                n4 = 44;
                break;
            }
            case 38: {
                n4 = 8;
                break;
            }
            case 39: {
                n4 = 23;
                break;
            }
            case 40: {
                n4 = 20;
                break;
            }
            case 41: {
                n4 = 2;
                break;
            }
            case 42: {
                n4 = 45;
                break;
            }
            case 43: {
                n4 = 19;
                break;
            }
            case 44: {
                n4 = 32;
                break;
            }
            case 45: {
                n4 = 40;
                break;
            }
            case 46: {
                n4 = 25;
                break;
            }
            case 47: {
                n4 = 9;
                break;
            }
            case 48: {
                n4 = 57;
                break;
            }
            case 49: {
                n4 = 28;
                break;
            }
            case 50: {
                n4 = 42;
                break;
            }
            case 51: {
                n4 = 34;
                break;
            }
            case 52: {
                n4 = 6;
                break;
            }
            case 53: {
                n4 = 14;
                break;
            }
            case 54: {
                n4 = 39;
                break;
            }
            case 55: {
                n4 = 10;
                break;
            }
            case 56: {
                n4 = 0;
                break;
            }
            case 57: {
                n4 = 7;
                break;
            }
            case 58: {
                n4 = 51;
                break;
            }
            case 59: {
                n4 = 62;
                break;
            }
            case 60: {
                n4 = 16;
                break;
            }
            case 61: {
                n4 = 29;
                break;
            }
            case 62: {
                n4 = 21;
                break;
            }
            default: {
                n4 = 17;
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
        ya.mb[n5] = new String(cArray);
        return n5;
    }

    private void lambda$new$0() {
        this.W2.q().p(this.WV);
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = ya.c(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ya.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ya.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

