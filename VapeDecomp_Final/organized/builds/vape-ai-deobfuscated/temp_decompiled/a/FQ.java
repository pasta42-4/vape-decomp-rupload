/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.CP;
import a.F8;
import a.O_;
import a.SE;
import a.Sz;
import a.X4;
import a.b6;
import a.d8;
import a.fx;
import a.jv;
import a.kK;
import a.rk;
import a.w6;
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

public class fq
extends w6 {
    private rk QO;
    private rk Qo;
    private static final Map lb;
    private String QH;
    private jv Qr;
    private static final long ab;
    private int QU;
    private static final Object[] qb;
    private static final long[] eb;
    private static final String[] rb;
    private static final Integer[] fb;

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = fq.m(l10, l11);
            object = qb[n2];
            try {
                if (!(object instanceof String)) break block2;
                fq.qb[n2] = clazz = Class.forName(rb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public int q() {
        return this.QU;
    }

    @Override
    public void a() {
    }

    @Override
    public void d() {
        block10: {
            long l10 = ab ^ 0x69CE4D1B9CE5L;
            try {
                if (this.QU == 1) {
                    this.QU = (int)fq.d("r", (int)31994, (long)(0x449B60540D1E4B13L ^ l10));
                    this.QO.o();
                    this.Qo.o();
                }
            }
            catch (O_ o_2) {
                throw fq.a(o_2);
            }
            try {
                if (this.QU == 3) {
                    this.QU = (int)fq.d("r", (int)26371, (long)(0x6A8E69066ECF50EBL ^ l10));
                    this.QO.c();
                    this.Qo.c();
                    this.R();
                }
            }
            catch (O_ o_3) {
                throw fq.a(o_3);
            }
            try {
                try {
                    if (this.QU != 4 || this.Qo.t().doubleValue() != this.Qo.n()) break block10;
                }
                catch (O_ o_4) {
                    throw fq.a(o_4);
                }
                this.QU = 0;
                this.Qr = null;
                this.N(false);
                return;
            }
            catch (O_ o_5) {
                throw fq.a(o_5);
            }
        }
    }

    private static Method p(long l10, long l11) {
        int n2 = fq.m(l10, l11);
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
                clazz3 = fq.n(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = fq.n(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fq.g(clazz, string, clazz2, n3, classArray2)) != null) {
                        fq.qb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fq.n(257658284557228L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = fq.h(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        fq.qb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fq.n(257658284557228L, 0L);
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

    public void k(String string) {
        this.QH = string;
    }

    private static Field o(long l10, long l11) {
        int n2 = fq.m(l10, l11);
        Object object = qb[n2];
        if (object instanceof String) {
            String string = rb[n2];
            int n3 = string.indexOf(8);
            Class clazz = fq.n(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = fq.n(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fq.g(clazz3, string2, clazz2)) != null) {
                    fq.qb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = fq.h(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        fq.qb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fq.n(257658284557228L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public void Z(Sz sz2) {
        long l10 = ab ^ 0x135A53A12578L;
        try {
            if (!this.s()) {
                this.QU = (int)fq.d("r", (int)12622, (long)(0x1CD1707DB581BF38L ^ l10));
                this.R();
            }
        }
        catch (O_ o_2) {
            throw fq.a(o_2);
        }
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'X' || c10 == '\u00e1' || c10 == 'u' || c10 == 'U') {
                field = fq.o(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'X' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00e1' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'u' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fq.p(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'E' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'C' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field g(Class clazz, String string, Class clazz2) {
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
                fq.ab = d8.a(2440559139960744162L, -6555391936806616354L, MethodHandles.lookup().lookupClass()).a(152491370699882L);
                fq.qb = new Object[5];
                fq.rb = new String[5];
                fq.T();
                fq.lb = new HashMap<K, V>(13);
                var0 = fq.ab ^ 126417670052151L;
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
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "$\u001b\u00ad\u00a9k\u00b7\u00d9\u0015\u00f5\u00c9\u00e4@\u00e2\u0099\u0089\u00ac!\u00bfn\u008a\u00e4\u0091\u00ac\u00cf";
                var7_6 = "$\u001b\u00ad\u00a9k\u00b7\u00d9\u0015\u00f5\u00c9\u00e4@\u00e2\u0099\u0089\u00ac!\u00bfn\u008a\u00e4\u0091\u00ac\u00cf".length();
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
                    var6_5 = "V\u00ae\u00887>uK\u00b9\\*Y\u0094\u00a3;\u00ca\u00a0";
                    var7_6 = "V\u00ae\u00887>uK\u00b9\\*Y\u0094\u00a3;\u00ca\u00a0".length();
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
        fq.eb = var8_3;
        fq.fb = new Integer[5];
    }

    public fq() {
        long l10 = ab ^ 0x11BE409400E2L;
        this.QO = new rk(0.15, 0.0, 100.0);
        this.Qo = new rk(0.15, 0.0, 1.0);
        this.QH = fq.e("C", (int)fq.d("r", (int)27548, (long)(0x2E642429E732C077L ^ l10)), (long)4328942455501685059L, (long)l10);
        this.Ol = false;
        this.B(false);
        this.Q(fq.M.W);
        this.d().m(false);
        this.d().f((String)((Object)fq.e("C", (int)fq.d("r", (int)20836, (long)(0x1A840C4345D97A89L ^ l10)), (long)4328942455501685059L, (long)l10)));
        CP cP2 = new CP(this);
        cP2.J().N(new kK(this));
        this.a(cP2);
        this.N(false);
        this.B(false, false);
        this.n(new b6(fq.M.S), new Object[0]);
    }

    @Override
    public double b() {
        fx fx2 = Ao.D(fx.class);
        try {
            if (fx2 == null) {
                return 0.0;
            }
        }
        catch (O_ o_2) {
            throw fq.a(o_2);
        }
        return fx2.b();
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fq.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = fq.h(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = fq.g(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = fq.h(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int d(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x17FD;
        if (fb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = eb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])lb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    lb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/fq", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fq.fb[n3] = n4;
        }
        return fb[n3];
    }

    public jv k() {
        try {
            if (this.Qr == null) {
                return null;
            }
        }
        catch (O_ o_2) {
            throw fq.a(o_2);
        }
        return (jv)SE.h.U().K(this.Qr.getClass());
    }

    @Override
    public String A() {
        return this.QH;
    }

    public void F(jv jv2) {
        this.Qr = jv2;
        this.QH = jv2.O();
    }

    @Override
    public void i() {
        fx fx2;
        block16: {
            fx2 = Ao.D(fx.class);
            try {
                if (fx2 == null) {
                    return;
                }
            }
            catch (O_ o_2) {
                throw fq.a(o_2);
            }
            try {
                if (!fx2.f()) {
                    this.N(false);
                    return;
                }
            }
            catch (O_ o_3) {
                throw fq.a(o_3);
            }
            try {
                if (this.QU >= 2) {
                    this.R();
                }
            }
            catch (O_ o_4) {
                throw fq.a(o_4);
            }
            try {
                if (this.Qo.t().doubleValue() != this.Qo.p()) {
                    this.B(true);
                    this.W(new X4(fx2.G(), fx2.W(), fx2.w(), this.b()));
                    this.b(fx2.G() + fx2.w() - this.w() * this.Qo.t());
                    this.M(fx2.W());
                    this.A();
                }
            }
            catch (O_ o_5) {
                throw fq.a(o_5);
            }
            try {
                try {
                    if (this.G() == fx2.G() && this.W() == fx2.W()) break block16;
                }
                catch (O_ o_6) {
                    throw fq.a(o_6);
                }
                this.m(fx2.G() + fx2.w() - this.w() * this.Qo.t(), fx2.W());
            }
            catch (O_ o_7) {
                throw fq.a(o_7);
            }
        }
        this.b(fx2.G() + fx2.w() - this.w() * this.Qo.t());
        F8.o(fx2.G(), fx2.W(), fx2.w(), this.b(), new Color(0, 0, 0, this.QO.t().intValue()), false, 0.0f, 0.0f);
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
                n4 = 21;
                break;
            }
            case 1: {
                n4 = 59;
                break;
            }
            case 2: {
                n4 = 57;
                break;
            }
            case 3: {
                n4 = 58;
                break;
            }
            case 4: {
                n4 = 20;
                break;
            }
            case 5: {
                n4 = 45;
                break;
            }
            case 6: {
                n4 = 6;
                break;
            }
            case 7: {
                n4 = 0;
                break;
            }
            case 8: {
                n4 = 43;
                break;
            }
            case 9: {
                n4 = 2;
                break;
            }
            case 10: {
                n4 = 41;
                break;
            }
            case 11: {
                n4 = 8;
                break;
            }
            case 12: {
                n4 = 13;
                break;
            }
            case 13: {
                n4 = 50;
                break;
            }
            case 14: {
                n4 = 37;
                break;
            }
            case 15: {
                n4 = 23;
                break;
            }
            case 16: {
                n4 = 60;
                break;
            }
            case 17: {
                n4 = 54;
                break;
            }
            case 18: {
                n4 = 47;
                break;
            }
            case 19: {
                n4 = 14;
                break;
            }
            case 20: {
                n4 = 3;
                break;
            }
            case 21: {
                n4 = 31;
                break;
            }
            case 22: {
                n4 = 52;
                break;
            }
            case 23: {
                n4 = 34;
                break;
            }
            case 24: {
                n4 = 38;
                break;
            }
            case 25: {
                n4 = 26;
                break;
            }
            case 26: {
                n4 = 22;
                break;
            }
            case 27: {
                n4 = 56;
                break;
            }
            case 28: {
                n4 = 51;
                break;
            }
            case 29: {
                n4 = 25;
                break;
            }
            case 30: {
                n4 = 36;
                break;
            }
            case 31: {
                n4 = 24;
                break;
            }
            case 32: {
                n4 = 33;
                break;
            }
            case 33: {
                n4 = 44;
                break;
            }
            case 34: {
                n4 = 19;
                break;
            }
            case 35: {
                n4 = 27;
                break;
            }
            case 36: {
                n4 = 30;
                break;
            }
            case 37: {
                n4 = 32;
                break;
            }
            case 38: {
                n4 = 55;
                break;
            }
            case 39: {
                n4 = 46;
                break;
            }
            case 40: {
                n4 = 35;
                break;
            }
            case 41: {
                n4 = 63;
                break;
            }
            case 42: {
                n4 = 40;
                break;
            }
            case 43: {
                n4 = 62;
                break;
            }
            case 44: {
                n4 = 4;
                break;
            }
            case 45: {
                n4 = 10;
                break;
            }
            case 46: {
                n4 = 18;
                break;
            }
            case 47: {
                n4 = 7;
                break;
            }
            case 48: {
                n4 = 29;
                break;
            }
            case 49: {
                n4 = 28;
                break;
            }
            case 50: {
                n4 = 49;
                break;
            }
            case 51: {
                n4 = 11;
                break;
            }
            case 52: {
                n4 = 16;
                break;
            }
            case 53: {
                n4 = 53;
                break;
            }
            case 54: {
                n4 = 48;
                break;
            }
            case 55: {
                n4 = 39;
                break;
            }
            case 56: {
                n4 = 9;
                break;
            }
            case 57: {
                n4 = 61;
                break;
            }
            case 58: {
                n4 = 15;
                break;
            }
            case 59: {
                n4 = 42;
                break;
            }
            case 60: {
                n4 = 5;
                break;
            }
            case 61: {
                n4 = 12;
                break;
            }
            case 62: {
                n4 = 17;
                break;
            }
            default: {
                n4 = 1;
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
        fq.rb[n5] = new String(cArray);
        return n5;
    }

    static int W(fq fq2, int n2) {
        fq2.QU = n2;
        return fq2.QU;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = fq.d(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public void O(int n2) {
        this.QU = n2;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public boolean g() {
        return false;
    }

    @Override
    public void u() {
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void T() {
        Object[] objectArray = qb;
        qb[0] = "MEM";
        objectArray[1] = Integer.TYPE;
        fq.rb[1] = "java/lang/Integer";
        objectArray[2] = "+:\u001aA\u0003\u0017 5\u000b\u000e~\u000f32\u0002G";
        objectArray[3] = "Q=\u0013kVqZ2\u0002$7\u007fQ9\u0006~";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "Yvz\"%o\u001dch\u001b\"kcs+y7r[g+jI)\fpjaxmSrf\u001b";
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = fq.d(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fq.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(fq.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

