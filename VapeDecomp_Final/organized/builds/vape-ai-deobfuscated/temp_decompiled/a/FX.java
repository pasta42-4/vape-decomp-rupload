/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.Co;
import a.F8;
import a.O_;
import a.Rv;
import a.Sz;
import a.bE;
import a.c7;
import a.d8;
import a.ey;
import a.fq;
import a.hY;
import a.ht;
import a.w6;
import a.wZ;
import a.yG;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class fx
extends w6 {
    private static final Integer[] fb;
    public static wZ Jr;
    private ArrayList<hY> Jh;
    private String JY;
    private boolean JM;
    private Rv JG;
    private static final long[] eb;
    private final yG J6;
    private static final long ab;
    private ey J9;
    private static final Object[] qb;
    public static boolean Jl;
    private static final Map lb;
    private static final String[] rb;

    private static void T() {
        Object[] objectArray = qb;
        qb[0] = "W!\u0011";
        objectArray[1] = Integer.TYPE;
        fx.rb[1] = "java/lang/Integer";
        objectArray[2] = "WI/;{e\\F>t\u0006}OA7=";
        objectArray[3] = "\f\u00150}77\u0007\u001a!2V9\f\u0011%h";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\n<qqw,\u000ea:\f$43v91(7Uv\u007f3Ou\tl~i04\u000fo~\f";
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fx.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = fx.h(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public void R() {
        this.V();
    }

    @Override
    public void u() {
    }

    @Override
    public double b() {
        return (this.Q().b() + 20.0) * 3.5 + 52.0;
    }

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public void N() {
        try {
            if (Ao.D(fq.class).f()) {
                return;
            }
        }
        catch (O_ o_2) {
            throw fx.a(o_2);
        }
        super.N();
    }

    public void V() {
        Ao.l(this);
        Ao.l(Jr);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'n' || c10 == '\u00e4' || c10 == 'y' || c10 == '\u00db') {
                field = fx.o(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'n' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00e4' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'y' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fx.p(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00ef' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'F' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method h(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = fx.g(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = fx.h(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public wZ R() {
        return Jr;
    }

    @Override
    public double z() {
        return 20.0;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public double e() {
        return this.w();
    }

    private static Method p(long l10, long l11) {
        int n2 = fx.m(l10, l11);
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
                clazz3 = fx.n(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = fx.n(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fx.g(clazz, string, clazz2, n3, classArray2)) != null) {
                        fx.qb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fx.n(233031164827891L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = fx.h(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        fx.qb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fx.n(233031164827891L, 0L);
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

    private static Class n(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = fx.m(l10, l11);
            object = qb[n2];
            try {
                if (!(object instanceof String)) break block2;
                fx.qb[n2] = clazz = Class.forName(rb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
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
                n4 = 48;
                break;
            }
            case 1: {
                n4 = 46;
                break;
            }
            case 2: {
                n4 = 51;
                break;
            }
            case 3: {
                n4 = 0;
                break;
            }
            case 4: {
                n4 = 6;
                break;
            }
            case 5: {
                n4 = 7;
                break;
            }
            case 6: {
                n4 = 27;
                break;
            }
            case 7: {
                n4 = 15;
                break;
            }
            case 8: {
                n4 = 22;
                break;
            }
            case 9: {
                n4 = 2;
                break;
            }
            case 10: {
                n4 = 34;
                break;
            }
            case 11: {
                n4 = 21;
                break;
            }
            case 12: {
                n4 = 16;
                break;
            }
            case 13: {
                n4 = 44;
                break;
            }
            case 14: {
                n4 = 56;
                break;
            }
            case 15: {
                n4 = 49;
                break;
            }
            case 16: {
                n4 = 40;
                break;
            }
            case 17: {
                n4 = 42;
                break;
            }
            case 18: {
                n4 = 5;
                break;
            }
            case 19: {
                n4 = 20;
                break;
            }
            case 20: {
                n4 = 13;
                break;
            }
            case 21: {
                n4 = 62;
                break;
            }
            case 22: {
                n4 = 57;
                break;
            }
            case 23: {
                n4 = 53;
                break;
            }
            case 24: {
                n4 = 19;
                break;
            }
            case 25: {
                n4 = 23;
                break;
            }
            case 26: {
                n4 = 14;
                break;
            }
            case 27: {
                n4 = 1;
                break;
            }
            case 28: {
                n4 = 43;
                break;
            }
            case 29: {
                n4 = 12;
                break;
            }
            case 30: {
                n4 = 37;
                break;
            }
            case 31: {
                n4 = 17;
                break;
            }
            case 32: {
                n4 = 61;
                break;
            }
            case 33: {
                n4 = 63;
                break;
            }
            case 34: {
                n4 = 29;
                break;
            }
            case 35: {
                n4 = 26;
                break;
            }
            case 36: {
                n4 = 52;
                break;
            }
            case 37: {
                n4 = 41;
                break;
            }
            case 38: {
                n4 = 18;
                break;
            }
            case 39: {
                n4 = 32;
                break;
            }
            case 40: {
                n4 = 11;
                break;
            }
            case 41: {
                n4 = 10;
                break;
            }
            case 42: {
                n4 = 47;
                break;
            }
            case 43: {
                n4 = 28;
                break;
            }
            case 44: {
                n4 = 54;
                break;
            }
            case 45: {
                n4 = 60;
                break;
            }
            case 46: {
                n4 = 33;
                break;
            }
            case 47: {
                n4 = 39;
                break;
            }
            case 48: {
                n4 = 25;
                break;
            }
            case 49: {
                n4 = 55;
                break;
            }
            case 50: {
                n4 = 8;
                break;
            }
            case 51: {
                n4 = 4;
                break;
            }
            case 52: {
                n4 = 24;
                break;
            }
            case 53: {
                n4 = 59;
                break;
            }
            case 54: {
                n4 = 45;
                break;
            }
            case 55: {
                n4 = 3;
                break;
            }
            case 56: {
                n4 = 35;
                break;
            }
            case 57: {
                n4 = 30;
                break;
            }
            case 58: {
                n4 = 36;
                break;
            }
            case 59: {
                n4 = 50;
                break;
            }
            case 60: {
                n4 = 31;
                break;
            }
            case 61: {
                n4 = 38;
                break;
            }
            case 62: {
                n4 = 9;
                break;
            }
            default: {
                n4 = 58;
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
        fx.rb[n5] = new String(cArray);
        return n5;
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

    public Rv G() {
        return this.JG;
    }

    @Override
    public double w() {
        return 350.0;
    }

    public String u() {
        return this.JY;
    }

    static ey E(fx fx2, ey ey2) {
        fx2.J9 = ey2;
        return fx2.J9;
    }

    @Override
    public void S(Sz sz2) {
        try {
            if (Ao.D(fq.class).f()) {
                Ao.D(fq.class).Z(sz2);
                return;
            }
        }
        catch (O_ o_2) {
            throw fx.a(o_2);
        }
        super.S(sz2);
    }

    @Override
    public void E() {
        try {
            super.E();
            if (!this.JM) {
                Jr.O();
                this.JM = true;
                this.R();
            }
        }
        catch (O_ o_2) {
            throw fx.a(o_2);
        }
        this.J6.P(20.0);
        Jr.T(this.w());
        Jr.w(Jr.Q());
        Jr.m(this.G(), this.W() + this.Q().b() + this.JG.b());
        Jr.E();
        this.y();
        this.A();
    }

    @Override
    public String A() {
        long l10 = ab ^ 0x270101B4D74AL;
        return fx.e("F", (int)fx.d("h", (int)31652, (long)(0x3D230779B74412C0L ^ l10)), (long)4868410681271379800L, (long)l10);
    }

    @Override
    public boolean g() {
        return false;
    }

    static ey J(fx fx2) {
        return fx2.J9;
    }

    @Override
    public void i() {
    }

    public void j(String string) {
        this.JY = string;
        Jr.O();
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = fx.d(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public fx() {
        long l10 = ab ^ 0x3E32F3DF7668L;
        this.JG = new Rv(this);
        this.JY = "";
        this.J9 = ey.X;
        this.Jh = new ArrayList();
        this.JM = false;
        this.J6 = new yG(this.w(), 18.0);
        Jr = new wZ(this);
        this.d().m(false);
        this.d().o(false);
        this.d().i(false);
        this.d().y(false);
        this.Q(fx.M.W);
        this.a(new Co(this));
        this.N(true);
        this.B(false, true);
        this.L(true);
        this.g(false);
        this.o(new ht[0]);
        this.J6.d().f((String)((Object)fx.e("F", (int)fx.d("h", (int)31059, (long)(0x4FBB9E91D3693116L ^ l10)), (long)-2111615879781398918L, (long)l10)));
        bE bE2 = new bE(12.5, 0.0);
        this.J6.n(bE2, new Object[0]);
        yG yG2 = new yG((this.J6.w() - bE2.w()) / 2.0, this.J6.b());
        yG2.n(new bE(0.0, 8.0), fx.e("F", (int)fx.d("h", (int)10423, (long)(0x2E40FBBB4052E0F3L ^ l10)), (long)-2111615879781398918L, (long)l10));
        this.J6.n(yG2, new Object[0]);
        yG2.i(false);
        for (ey ey2 : ey.U()) {
            hY hY2 = new hY(ey2.O(), 0.75);
            hY2.N(new c7(this, ey2));
            hY2.T(hY2.d());
            hY2.w(7.0);
            hY2.N(true);
            this.Jh.add(hY2);
            yG2.n(hY2, new Object[0]);
            yG2.n(new bE(17.5, 0.0), new Object[0]);
        }
        this.J6.i(false);
        this.n(this.J6, new Object[0]);
        this.J6.n(this.JG, fx.e("F", (int)fx.d("h", (int)4117, (long)(0x5342AACD104D5852L ^ l10)), (long)-2111615879781398918L, (long)l10));
    }

    public ey j() {
        return this.J9;
    }

    @Override
    public void r(boolean bl2, boolean bl3) {
        try {
            super.r(bl2, bl3);
            Jr.r(bl2, bl3);
            if (bl2) {
                this.V();
            }
        }
        catch (O_ o_2) {
            throw fx.a(o_2);
        }
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void C(hY hY2) {
        double d2 = hY2.W() + 7.0;
        for (double d3 = hY2.G(); d3 < hY2.G() + (hY2.d() + 1.0); d3 += 2.0) {
            F8.r(d3, d2, 1.0, 1.0f, fx.M.c);
        }
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = fx.d(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                fx.ab = d8.a(-8152772312694377675L, 5488699560976326242L, MethodHandles.lookup().lookupClass()).a(58027499917774L);
                fx.qb = new Object[5];
                fx.rb = new String[5];
                fx.T();
                fx.lb = new HashMap<K, V>(13);
                var0 = fx.ab ^ 106860464946122L;
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
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "z\u001d]\u00ec\u008b\u00fdJ\u008euN\u0016N*\u00ba\u00db\u0012";
                var7_6 = "z\u001d]\u00ec\u008b\u00fdJ\u008euN\u0016N*\u00ba\u00db\u0012".length();
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
                    var6_5 = "xn\u008cP\u00e4\u00e1\u00b4T\u008cW\u008f@\u00ea\u00b3\u00c6k";
                    var7_6 = "xn\u008cP\u00e4\u00e1\u00b4T\u008cW\u008f@\u00ea\u00b3\u00c6k".length();
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
        fx.eb = var8_3;
        fx.fb = new Integer[4];
        fx.Jl = false;
    }

    private static int d(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x2AF6;
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
                throw new RuntimeException("a/fx", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fx.fb[n3] = n4;
        }
        return fb[n3];
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static Field o(long l10, long l11) {
        int n2 = fx.m(l10, l11);
        Object object = qb[n2];
        if (object instanceof String) {
            String string = rb[n2];
            int n3 = string.indexOf(8);
            Class clazz = fx.n(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = fx.n(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fx.g(clazz3, string2, clazz2)) != null) {
                    fx.qb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = fx.h(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        fx.qb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fx.n(233031164827891L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void y() {
        for (hY hY2 : this.Jh) {
            try {
                if (this.j().O().equalsIgnoreCase(hY2.O())) {
                    hY2.c(Color.WHITE);
                    this.C(hY2);
                    continue;
                }
            }
            catch (O_ o_2) {
                throw fx.a(o_2);
            }
            hY2.c(null);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fx.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(fx.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

