/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.UnmodifiableView
 */
package a;

import a.Ao;
import a.BC;
import a.F8;
import a.Fe;
import a.G5;
import a.O_;
import a.Sz;
import a.Wb;
import a.X_;
import a._C;
import a.bE;
import a.bU;
import a.bt;
import a.d8;
import a.fB;
import a.hK;
import a.ht;
import a.jG;
import a.jS;
import a.jd;
import a.jr;
import a.k9;
import a.rn;
import a.xp;
import a.yD;
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
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnmodifiableView;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class y2<T>
extends ht
implements BC {
    private final rn sP;
    @Nullable
    private fB L;
    private final yG sD;
    @Nullable
    private String F;
    private T D;
    private boolean v;
    private boolean n;
    private static String[] V;
    private boolean s3;
    private static final long[] bb;
    private final Map<String, List<T>> R;
    private static final Map eb;
    private static final String[] jb;
    private static final long ab;
    private final float E = 2.0f;
    private static final Integer[] db;
    private static final Object[] fb;
    private boolean B;
    private boolean so;
    private final List<Wb> sE;
    @Nullable
    private jd sb;
    private final k9<T> Y;
    private final String sG;

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00f1' || c10 == '\u00e3' || c10 == '\u00df' || c10 == 'H') {
                field = y2.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00f1' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00e3' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00df' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = y2.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00d6' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00c5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void lambda$toggleContent$0(Object object) {
        block8: {
            try {
                this.D = object;
                this.b();
                if (this.sb != null) {
                    this.sb.V((jG)this.D);
                    this.L(this.sb);
                }
            }
            catch (O_ o_2) {
                throw y2.a(o_2);
            }
            for (Wb wb2 : this.sE) {
                wb2.b();
            }
            try {
                try {
                    if (this.sb == null || this.sb.w().isEmpty()) break block8;
                }
                catch (O_ o_3) {
                    throw y2.a(o_3);
                }
                this.F().A();
            }
            catch (O_ o_4) {
                throw y2.a(o_4);
            }
        }
        this.J();
    }

    @Nullable
    public String E() {
        return this.F;
    }

    public static void v(String[] stringArray) {
        V = stringArray;
    }

    private static List lambda$addOption$2(String string) {
        return new ArrayList();
    }

    private static void i() {
        Object[] objectArray = fb;
        fb[0] = " \u0000d";
        objectArray[1] = Boolean.TYPE;
        y2.jb[1] = "java/lang/Boolean";
        objectArray[2] = Void.TYPE;
        y2.jb[2] = "java/lang/Void";
        objectArray[3] = Integer.TYPE;
        y2.jb[3] = "java/lang/Integer";
        objectArray[4] = "z9gxdTq6v7\u0019Lb1\u007f~";
        objectArray[5] = "U{My:3^t\\6[=U\u007fXl";
        objectArray[6] = "C\u0010d0/+UK.Q$''\u0007g4,1\u001bC% E";
        objectArray[7] = "d}\u001aYv\u0019r&P8g\u0015\u0000.LF!\u0010akZ\u0002|\u007f";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "\u000fEvfA:\u0019\u001e<\u0007@'k\u0015*|@eTMwvT\\QTwnO&\t\u00147<+";
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/y2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public @UnmodifiableView List<T> z() {
        ArrayList<T> arrayList = new ArrayList<T>();
        for (List<T> list : this.R.values()) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    public void z(@Nullable String string) {
        this.F = string;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = y2.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public void b() {
    }

    private static Field g(long l10, long l11) {
        int n2 = y2.e(l10, l11);
        Object object = fb[n2];
        if (object instanceof String) {
            String string = jb[n2];
            int n3 = string.indexOf(8);
            Class clazz = y2.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = y2.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = y2.c(clazz3, string2, clazz2)) != null) {
                    y2.fb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = y2.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        y2.fb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = y2.f(394809966517122L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public y2(String string, k9<T> k92, T ... TArray) {
        this(string, k92, Arrays.asList(TArray));
    }

    @Override
    public void Z(Sz sz2) {
        block14: {
            fB fB2;
            block13: {
                try {
                    if (this.B) {
                        return;
                    }
                }
                catch (O_ o_2) {
                    throw y2.a(o_2);
                }
                fB2 = this.L;
                try {
                    try {
                        if (fB2 == null || !fB2.G()) break block13;
                    }
                    catch (O_ o_3) {
                        throw y2.a(o_3);
                    }
                    fB2.S(sz2);
                }
                catch (O_ o_4) {
                    throw y2.a(o_4);
                }
            }
            try {
                block15: {
                    try {
                        try {
                            if (this.so) break block14;
                            if (fB2 == null) break block15;
                        }
                        catch (O_ o_5) {
                            throw y2.a(o_5);
                        }
                        if (fB2.G()) break block14;
                    }
                    catch (O_ o_6) {
                        throw y2.a(o_6);
                    }
                }
                this.J();
            }
            catch (O_ o_7) {
                throw y2.a(o_7);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                y2.ab = d8.a(-2772422087939948456L, -9019118989159939640L, MethodHandles.lookup().lookupClass()).a(247256189798577L);
                y2.fb = new Object[9];
                y2.jb = new String[9];
                y2.i();
                y2.eb = new HashMap<K, V>(13);
                y2.v(new String[4]);
                var0 = y2.ab ^ 12962763308071L;
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
                var8_3 = new long[9];
                var5_4 = 0;
                var6_5 = "\u00f17\u00c6\u00a8C\u0002\u00cb\u00d8A\u00ce\u0006pJb\u0014\u00d5b\u00a0`\tYN\u00b8T\u00a1$\u00e2\u00fb^\u00fc\u00e2\u00eb\u00bc\u0018\u00e9M\u00f0QQ~\u00e7\u001c\u009c\u0018p+\u0089\u00f3\u0084\u00a3\u0097\\\u00b7\u00e7!\u00e2";
                var7_6 = "\u00f17\u00c6\u00a8C\u0002\u00cb\u00d8A\u00ce\u0006pJb\u0014\u00d5b\u00a0`\tYN\u00b8T\u00a1$\u00e2\u00fb^\u00fc\u00e2\u00eb\u00bc\u0018\u00e9M\u00f0QQ~\u00e7\u001c\u009c\u0018p+\u0089\u00f3\u0084\u00a3\u0097\\\u00b7\u00e7!\u00e2".length();
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
                    var6_5 = "\u0001\u00c1 \u0094\u00d0\u00f6\u0096\u00f0\u00e7)Qh\u00cc;.\u00ee";
                    var7_6 = "\u0001\u00c1 \u0094\u00d0\u00f6\u0096\u00f0\u00e7)Qh\u00cc;.\u00ee".length();
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
        y2.bb = var8_3;
        y2.db = new Integer[9];
    }

    public void c(T t10) {
        this.D = t10;
        if (t10 instanceof hK) {
            hK hK2 = (hK)t10;
            this.g(hK2.e());
        } else {
            this.g(null);
        }
    }

    public void C(T t10) {
        this.R.computeIfAbsent(null, y2::lambda$addOption$1).add(t10);
    }

    @Override
    public boolean y() {
        return this.so;
    }

    @Override
    public void T(boolean bl2) {
        this.so = bl2;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = y2.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = y2.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static String[] R() {
        return V;
    }

    public y2(String string, k9<T> k92, List<T> list) {
        long l10 = ab ^ 0x5FB11388829EL;
        this.R = new LinkedHashMap<String, List<T>>();
        this.sE = new ArrayList<Wb>();
        this.getClass();
        this.sP = new rn(0.15, y2.M.S, y2.M.k);
        this.E = 2.0f;
        this.v = true;
        this.n = false;
        this.sG = string;
        this.Y = k92;
        this.T(110.0);
        this.R.put(null, list);
        this.sD = new yG(110.0, 20.0);
        this.sD.d().f((String)((Object)y2.c("\u00c5", (int)y2.b("l", (int)16268, (long)(0x301844819334F67DL ^ l10)), (long)-5385654145264213219L, (long)l10)));
        this.sD.i(120.0);
        this.sD.i(false);
        this.sD.Q(y2.M.L);
        this.sD.C(true);
        this.n(true);
    }

    @Override
    public void U() {
    }

    public void E(String string, T ... TArray) {
        for (T t10 : TArray) {
            this.X(string, t10);
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    static void x(y2 y22) {
        y22.J();
    }

    private void a() {
        fB fB2 = this.L;
        try {
            if (fB2 != null) {
                fB2.b(this.G() + this.J());
                fB2.M(this.W() + 17.0);
            }
        }
        catch (O_ o_2) {
            throw y2.a(o_2);
        }
    }

    public String Z() {
        return this.sG;
    }

    @Override
    public void d() {
        block12: {
            long l10;
            block11: {
                l10 = ab ^ 0x3BAD305197CBL;
                try {
                    try {
                        try {
                            if (!this.s3 || this.s()) break block11;
                        }
                        catch (O_ o_2) {
                            throw y2.a(o_2);
                        }
                        if (this.r()) break block11;
                    }
                    catch (O_ o_3) {
                        throw y2.a(o_3);
                    }
                    this.sP.c();
                    this.s3 = false;
                }
                catch (O_ o_4) {
                    throw y2.a(o_4);
                }
            }
            if (this.sb != null) {
                jG jG2 = (jG)this.sb.J();
                try {
                    try {
                        if (y2.c("\u00c5", (long)-6911708624488932358L, (long)l10) != false || !jG2.p()) break block12;
                    }
                    catch (O_ o_5) {
                        throw y2.a(o_5);
                    }
                    y2.c("\u00c5", (long)-6911678165032220253L, (long)l10);
                }
                catch (O_ o_6) {
                    throw y2.a(o_6);
                }
            }
        }
    }

    private static List lambda$addOption$1(String string) {
        return new ArrayList();
    }

    @Override
    public void G() {
        CallSite callSite;
        float f10;
        float f11;
        Color color;
        Color color2;
        double d2;
        double d3;
        String string;
        G5 g5;
        double d4;
        double d5;
        String string2;
        G5 g52;
        long l10;
        block29: {
            Color color3;
            double d6;
            double d7;
            double d9;
            double d10;
            double d11;
            block25: {
                Color color4;
                double d12;
                double d13;
                double d14;
                double d15;
                block27: {
                    block26: {
                        block24: {
                            String string3;
                            block28: {
                                block21: {
                                    Object object;
                                    k9<T> k92;
                                    block23: {
                                        block22: {
                                            Object object2;
                                            l10 = ab ^ 0x622A0EC64BD4L;
                                            this.S();
                                            g52 = this.L(0.85);
                                            try {
                                                object2 = this.sb != null ? this.sb.J() : this.D;
                                            }
                                            catch (O_ o_2) {
                                                throw y2.a(o_2);
                                            }
                                            Object object3 = object2;
                                            try {
                                                try {
                                                    if (object3 == null) break block21;
                                                    k92 = this.Y;
                                                    if (this.sb == null) break block22;
                                                }
                                                catch (O_ o_3) {
                                                    throw y2.a(o_3);
                                                }
                                                object = this.sb.J();
                                                break block23;
                                            }
                                            catch (O_ o_4) {
                                                throw y2.a(o_4);
                                            }
                                        }
                                        object = this.D;
                                    }
                                    string3 = k92.W(object);
                                    break block28;
                                }
                                try {
                                    string3 = this.F != null ? this.F : "";
                                }
                                catch (O_ o_5) {
                                    throw y2.a(o_5);
                                }
                            }
                            string2 = string3;
                            try {
                                if (!this.v || this.sG.isEmpty()) break block24;
                            }
                            catch (O_ o_6) {
                                throw y2.a(o_6);
                            }
                            string2 = this.sG + (String)((Object)y2.c("\u00c5", (int)y2.b("l", (int)14178, (long)(0x6763B819AC9B7D8L ^ l10)), (long)8937513916114954839L, (long)l10)) + string2;
                        }
                        double d16 = g52.B(string2);
                        double d17 = this.W() + this.b() / 2.0 - d16 / 2.0;
                        this.getClass();
                        d5 = d17 + (double)(5.0f / 8.0f);
                        d4 = this.W() + this.b() / 2.0 - (double)(this.E / 2.0f);
                        double d18 = this.b();
                        this.getClass();
                        d11 = d18 - 5.0;
                        if (this.r()) {
                            d11 += this.sD.b();
                        }
                        try {
                            try {
                                if (!this.n) break block25;
                                d15 = this.G() + this.J();
                                double d19 = this.W();
                                this.getClass();
                                d14 = d19 + (double)(5.0f / 2.0f) + 0.5;
                                d13 = this.w() - this.J() - 8.0 + 2.0;
                                d12 = d11 - 1.0;
                                if (!this.so) break block26;
                            }
                            catch (O_ o_7) {
                                throw y2.a(o_7);
                            }
                            color4 = y2.M.L.darker();
                            break block27;
                        }
                        catch (O_ o_8) {
                            throw y2.a(o_8);
                        }
                    }
                    color4 = y2.M.L;
                }
                F8.o(d15, d14, d13, d12, color4, false, 2.0f, 1.0f);
                break block29;
            }
            try {
                d10 = this.G() + this.J();
                double d20 = this.W();
                this.getClass();
                d9 = d20 + (double)(5.0f / 2.0f) + 0.5;
                d7 = this.w() - this.J() - 8.0 + 2.0;
                d6 = d11 - 1.0;
                color3 = this.so ? y2.M.S.darker() : y2.M.W;
            }
            catch (O_ o_9) {
                throw y2.a(o_9);
            }
            F8.o(d10, d9, d7, d6, color3, false, 2.0f, 1.0f);
            double d21 = this.G() + this.J();
            double d22 = this.W();
            this.getClass();
            F8.U(d21, d22 + (double)(5.0f / 2.0f), this.w() - this.J() - 8.0 + 2.0, d11 - 1.0, this.sP.k(), 3.0f, 0.75f, 1.0f);
        }
        try {
            g5 = g52;
            string = string2;
            d3 = this.G() + this.J() + 5.0;
            d2 = d5;
            color2 = this.so ? y2.M.w : y2.M.n;
        }
        catch (O_ o_10) {
            throw y2.a(o_10);
        }
        try {
            g5.R(string, d3, d2, color2);
            color = y2.M.Z;
            float f12 = (float)(this.G() + this.w());
            this.getClass();
            f11 = f12 - 5.0f * 3.0f;
            f10 = (float)d4;
            callSite = this.r() ? y2.c("\u00c5", (int)y2.b("l", (int)16916, (long)(0x2C7FE43D7D2D42A8L ^ l10)), (long)8937513916114954839L, (long)l10) : y2.c("\u00c5", (int)y2.b("l", (int)31589, (long)(0x4A0F1669542B7BDBL ^ l10)), (long)8937513916114954839L, (long)l10);
        }
        catch (O_ o_11) {
            throw y2.a(o_11);
        }
        X_.B(color, f11, f10, (String)((Object)callSite), this.E, this.E, false);
    }

    @Override
    public double z() {
        return 20.0;
    }

    public y2(jd jd2) {
        this(jd2.O(), Fe.D, (Object[])jd2.Z());
        this.sb = jd2;
        this.L(jd2);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public double e() {
        return 50.0;
    }

    public void q(T ... TArray) {
        for (T t10 : TArray) {
            this.C(t10);
        }
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = y2.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = y2.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public void g() {
        try {
            if (!this.s3) {
                this.sP.c();
            }
        }
        catch (O_ o_2) {
            throw y2.a(o_2);
        }
        this.s3 = true;
    }

    public void U(boolean bl2) {
        this.v = bl2;
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = y2.e(l10, l11);
            object = fb[n2];
            try {
                if (!(object instanceof String)) break block2;
                y2.fb[n2] = clazz = Class.forName(jb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public void X(String string, T t10) {
        this.R.computeIfAbsent(string, y2::lambda$addOption$2).add(t10);
    }

    public boolean r() {
        boolean bl2;
        try {
            bl2 = this.L != null;
        }
        catch (O_ o_2) {
            throw y2.a(o_2);
        }
        return bl2;
    }

    static fB M(y2 y22) {
        return y22.L;
    }

    public boolean T() {
        return this.n;
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x7CB4;
        if (db[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = bb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])eb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    eb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/y2", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            y2.db[n3] = n4;
        }
        return db[n3];
    }

    @Override
    public void E() {
        super.E();
        fB fB2 = this.L;
        try {
            if (fB2 != null) {
                this.a();
                this.sD.h(true);
                this.sD.E();
            }
        }
        catch (O_ o_2) {
            throw y2.a(o_2);
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/y2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = y2.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void J() {
        long l10 = ab ^ 0x71BC46C9287L;
        fB fB2 = this.L;
        k9<T> k92 = this.Y;
        synchronized (k92) {
            if (fB2 != null) {
                this.L = null;
                Ao.d = null;
                Ao.z(fB2);
            } else {
                this.sD.k();
                this.sD.Y(this.w() - this.J() - 8.0 + 2.0);
                this.sD.k(3.0f);
                for (Map.Entry<String, List<T>> entry : this.R.entrySet()) {
                    String string = entry.getKey();
                    List<T> list = entry.getValue();
                    try {
                        if (list.isEmpty()) {
                            continue;
                        }
                    }
                    catch (O_ o_2) {
                        throw y2.a(o_2);
                    }
                    if (string != null) {
                        bt bt2 = new bt(string, 0.8);
                        bt2.q(true);
                        bt2.B(y2.M.c);
                        bt2.T(bt2.D() * 1.3);
                        double d2 = (this.sD.w() - bt2.w()) / 2.0;
                        this.sD.n(new bU(d2, bt2.b(), d2 - 4.0, 0.5, y2.M.k), y2.c("\u00c5", (int)y2.b("l", (int)6866, (long)(0x59E7148FA3A5C339L ^ l10)), (long)-6531617230829997308L, (long)l10));
                        this.sD.n(bt2, y2.c("\u00c5", (int)y2.b("l", (int)24161, (long)(0x3D5BAE6952A878BL ^ l10)), (long)-6531617230829997308L, (long)l10));
                        this.sD.n(new bU(d2, bt2.b(), d2 - 4.0, 0.5, y2.M.k), y2.c("\u00c5", (int)y2.b("l", (int)13319, (long)(0x5F55CD914CC56DEBL ^ l10)), (long)-6531617230829997308L, (long)l10));
                    }
                    for (Object e10 : list) {
                        Object object;
                        String string2 = this.Y.W(e10);
                        yD yD2 = new yD(string2, 0.85);
                        if (e10 instanceof hK) {
                            object = (hK)e10;
                            yD2.g(object.e());
                        }
                        if (e10 instanceof jS) {
                            object = (jS)e10;
                            yD2.C((jS)object);
                        }
                        if (e10 instanceof jr) {
                            object = (jr)e10;
                            yD2.w(((xp)object).E(xp.q));
                        }
                        yD2.T(this.sD.w() - 1.0);
                        yD2.w(12.0);
                        yD2.C(() -> this.lambda$toggleContent$0(e10));
                        this.sD.n(yD2, y2.c("\u00c5", (int)y2.b("l", (int)3029, (long)(0x6B3DF6A1200CD230L ^ l10)), (long)-6531617230829997308L, (long)l10));
                    }
                }
                this.sD.n(new bE(0.0, 0.5), y2.c("\u00c5", (int)y2.b("l", (int)5180, (long)(0xC63F7B45C3CCDD2L ^ l10)), (long)-6531617230829997308L, (long)l10));
                this.sD.P(Math.min(this.sD.Q(), this.sD.d().R()));
                this.sD.h(true);
                this.L = Ao.v(this, this.sD, fB.class);
                this.L.P(new _C(this));
                Ao.d = this;
                this.a();
            }
        }
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

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (jb[n5] != null) {
            return n5;
        }
        Object object = fb[n5];
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
                n4 = 46;
                break;
            }
            case 2: {
                n4 = 41;
                break;
            }
            case 3: {
                n4 = 3;
                break;
            }
            case 4: {
                n4 = 62;
                break;
            }
            case 5: {
                n4 = 5;
                break;
            }
            case 6: {
                n4 = 23;
                break;
            }
            case 7: {
                n4 = 45;
                break;
            }
            case 8: {
                n4 = 54;
                break;
            }
            case 9: {
                n4 = 47;
                break;
            }
            case 10: {
                n4 = 14;
                break;
            }
            case 11: {
                n4 = 19;
                break;
            }
            case 12: {
                n4 = 24;
                break;
            }
            case 13: {
                n4 = 20;
                break;
            }
            case 14: {
                n4 = 9;
                break;
            }
            case 15: {
                n4 = 27;
                break;
            }
            case 16: {
                n4 = 29;
                break;
            }
            case 17: {
                n4 = 13;
                break;
            }
            case 18: {
                n4 = 56;
                break;
            }
            case 19: {
                n4 = 49;
                break;
            }
            case 20: {
                n4 = 16;
                break;
            }
            case 21: {
                n4 = 22;
                break;
            }
            case 22: {
                n4 = 18;
                break;
            }
            case 23: {
                n4 = 50;
                break;
            }
            case 24: {
                n4 = 34;
                break;
            }
            case 25: {
                n4 = 35;
                break;
            }
            case 26: {
                n4 = 31;
                break;
            }
            case 27: {
                n4 = 55;
                break;
            }
            case 28: {
                n4 = 11;
                break;
            }
            case 29: {
                n4 = 40;
                break;
            }
            case 30: {
                n4 = 6;
                break;
            }
            case 31: {
                n4 = 2;
                break;
            }
            case 32: {
                n4 = 52;
                break;
            }
            case 33: {
                n4 = 4;
                break;
            }
            case 34: {
                n4 = 51;
                break;
            }
            case 35: {
                n4 = 58;
                break;
            }
            case 36: {
                n4 = 57;
                break;
            }
            case 37: {
                n4 = 12;
                break;
            }
            case 38: {
                n4 = 0;
                break;
            }
            case 39: {
                n4 = 43;
                break;
            }
            case 40: {
                n4 = 42;
                break;
            }
            case 41: {
                n4 = 38;
                break;
            }
            case 42: {
                n4 = 15;
                break;
            }
            case 43: {
                n4 = 36;
                break;
            }
            case 44: {
                n4 = 1;
                break;
            }
            case 45: {
                n4 = 39;
                break;
            }
            case 46: {
                n4 = 61;
                break;
            }
            case 47: {
                n4 = 60;
                break;
            }
            case 48: {
                n4 = 48;
                break;
            }
            case 49: {
                n4 = 63;
                break;
            }
            case 50: {
                n4 = 30;
                break;
            }
            case 51: {
                n4 = 53;
                break;
            }
            case 52: {
                n4 = 37;
                break;
            }
            case 53: {
                n4 = 33;
                break;
            }
            case 54: {
                n4 = 28;
                break;
            }
            case 55: {
                n4 = 26;
                break;
            }
            case 56: {
                n4 = 59;
                break;
            }
            case 57: {
                n4 = 21;
                break;
            }
            case 58: {
                n4 = 25;
                break;
            }
            case 59: {
                n4 = 10;
                break;
            }
            case 60: {
                n4 = 17;
                break;
            }
            case 61: {
                n4 = 44;
                break;
            }
            case 62: {
                n4 = 32;
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
        y2.jb[n5] = new String(cArray);
        return n5;
    }

    public boolean M() {
        return this.v;
    }

    public void Z(boolean bl2) {
        this.n = bl2;
    }

    public T y() {
        return this.D;
    }

    public y2<T> N(Wb wb2) {
        this.sE.add(wb2);
        return this;
    }

    private static Method h(long l10, long l11) {
        int n2 = y2.e(l10, l11);
        Object object = fb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = jb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = y2.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = y2.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = y2.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        y2.fb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = y2.f(394809966517122L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = y2.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        y2.fb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = y2.f(394809966517122L, 0L);
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
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(y2.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(y2.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

