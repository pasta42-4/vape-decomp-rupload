/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.Ao;
import a.CS;
import a.OT;
import a.O_;
import a.RF;
import a.Ry;
import a.WU;
import a.a2;
import a.bE;
import a.bJ;
import a.bM;
import a.bs;
import a.bt;
import a.bx;
import a.d8;
import a.f1;
import a.hW;
import a.ht;
import a.yG;
import a.yo;
import a.yq;
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
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

public class y8
extends yq {
    private static final long eb;
    private static final long[] qb;
    @Nullable
    private Runnable M6;
    protected OT MX;
    private boolean Mi;
    private static final Integer[] rb;
    private static final Map sb;
    private static final Object[] Eb;
    private static final String[] Fb;
    protected Ry Mb;

    @Override
    protected void J() {
        ht ht2;
        List<a2> list;
        yG yG2;
        hW hW2;
        long l10;
        block7: {
            block6: {
                l10 = eb ^ 0x18ABAE71BAF4L;
                try {
                    super.J();
                    if (this.MX == null) {
                        return;
                    }
                }
                catch (O_ o_2) {
                    throw y8.a(o_2);
                }
                this.Z();
                this.I().i(false);
                yG yG3 = this.I();
                this.getClass();
                yG3.n(new bE(5.0, 0.0), y8.j("\u00d4", (int)y8.d("q", (int)25, (long)(0x1924C3FC43C9424DL ^ l10)), (long)4640754582992442622L, (long)l10));
                yG yG4 = new yG(this.I().w(), 25.0);
                yG4.i(false);
                yG4.d().f((String)((Object)y8.j("\u00d4", (int)y8.d("q", (int)30853, (long)(0x1B7B8470B174BADBL ^ l10)), (long)4640754582992442622L, (long)l10)));
                this.I().n(yG4, new Object[0]);
                this.getClass();
                yG4.n(new bE(5.0, 0.0), y8.j("\u00d4", (int)y8.d("q", (int)27305, (long)(0x7D91191DA47BA8F5L ^ l10)), (long)4640754582992442622L, (long)l10));
                CS cS2 = new CS((String)((Object)y8.j("\u00d4", (int)y8.d("q", (int)14236, (long)(0x3E6C728925F7F5C7L ^ l10)), (long)4640754582992442622L, (long)l10)), 5.0f, 5.0f);
                String string = this.Mb.e();
                CallSite callSite = y8.j("\u00d4", (int)y8.d("q", (int)24612, (long)(0x50D8618C00EC2272L ^ l10)), (long)4640754582992442622L, (long)l10);
                double d2 = yG4.w();
                this.getClass();
                bM bM2 = new bM(string, (String)((Object)callSite), d2 - (double)(5.0f * 2.0f) - cS2.w(), 1.0, y8.M.c, true);
                bM2.T(bM2.x());
                bM2.w(10.0);
                yG4.n(bM2, new Object[0]);
                cS2.Y(y8.M.n);
                this.x(yG4);
                hW2 = new hW((String)((Object)y8.j("\u00d4", (int)y8.d("q", (int)28353, (long)(0xA9979783F182C9CL ^ l10)), (long)4640754582992442622L, (long)l10)), 0.8, true, this, this::lambda$setup$0);
                hW2.J(true);
                hW2.T(yG4.w() - 2.0);
                this.I().n(hW2, new Object[0]);
                this.I().n(new bE(0.0, 6.0), new Object[0]);
                yG2 = new yG(this.I().w(), this.I().b() - yG4.b());
                this.I().n(yG2, new Object[0]);
                yG2.i(false);
                yG2.d().f((String)((Object)y8.j("\u00d4", (int)y8.d("q", (int)15004, (long)(0x49838C19B98678C3L ^ l10)), (long)4640754582992442622L, (long)l10)));
                list = this.MX.x(false);
                try {
                    if (!this.Mi || this.MX.P() == null) break block6;
                }
                catch (O_ o_3) {
                    throw y8.a(o_3);
                }
                ht2 = new yo(this.MX, yG2.w(), false);
                ((yo)ht2).G(Ao.w);
                ((yo)ht2).j(this.MX);
                yG2.n(ht2, new Object[0]);
                break block7;
            }
            ht2 = new RF(list.size());
            yG2.n(ht2, new Object[0]);
        }
        yG yG5 = new yG(yG2.w(), yG2.b() - ht2.b() - hW2.b());
        yG5.i(false);
        yG5.Q(this.l());
        yG5.i(yG5.b() - 6.0);
        yG5.d().f((String)((Object)y8.j("\u00d4", (int)y8.d("q", (int)5342, (long)(0x14DF4F28D675D686L ^ l10)), (long)4640754582992442622L, (long)l10)));
        for (a2 a22 : list) {
            hW hW3 = new hW(a22.O(), 0.8, this, () -> this.lambda$setup$1(a22));
            hW3.J(true);
            hW3.T(yG5.w() - 4.0);
            yG5.n(hW3, new Object[0]);
        }
        yG2.n(yG5, new Object[0]);
    }

    protected void y() {
        long l10 = eb ^ 0x4C2D37B8FA1AL;
        yG yG2 = this.I();
        this.getClass();
        yG2.n(new bE(5.0, 0.0), new Object[0]);
        double d2 = this.I().w();
        this.getClass();
        yG yG3 = new yG(d2 - 5.0, this.I().b());
        yG3.i(false);
        yG3.d().f((String)((Object)y8.j("\u00d4", (int)y8.d("q", (int)32669, (long)(0x757D3C6CD9FF7D2AL ^ l10)), (long)38580978268935184L, (long)l10)));
        this.I().n(yG3, new Object[0]);
        yG3.n(new bx(yG3.w(), 20.0), new Object[0]);
        yG3.n(new bE(0.0, 2.0), new Object[0]);
        yG3.n(new bx(yG3.w(), 15.0), new Object[0]);
        yG3.n(new bE(0.0, 3.0), new Object[0]);
        yG3.n(new bx(yG3.w(), 15.0), new Object[0]);
        yG3.n(new bE(0.0, 2.0), new Object[0]);
        yG3.n(new bx(yG3.w(), 110.0), new Object[0]);
    }

    @Override
    public void v() {
        long l10 = eb ^ 0x40FB6072D69CL;
        super.v();
        this.BM.n(new bE(0.0, 1.5), new Object[0]);
        this.BM.n(new bJ(this.BM.w(), 1.0, 0.5, 0.0, y8.M.T), y8.j("\u00d4", (int)y8.d("q", (int)20515, (long)(0x505EE06F266E7E1CL ^ l10)), (long)3174789128869165206L, (long)l10));
    }

    private static Method j(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = y8.i(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = y8.j(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field s(long l10, long l11) {
        int n2 = y8.q(l10, l11);
        Object object = Eb[n2];
        if (object instanceof String) {
            String string = Fb[n2];
            int n3 = string.indexOf(8);
            Class clazz = y8.r(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = y8.r(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = y8.i(clazz3, string2, clazz2)) != null) {
                    y8.Eb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = y8.j(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        y8.Eb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = y8.r(247521832942570L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method t(long l10, long l11) {
        int n2 = y8.q(l10, l11);
        Object object = Eb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = Fb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = y8.r(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = y8.r(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = y8.i(clazz, string, clazz2, n3, classArray2)) != null) {
                        y8.Eb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = y8.r(247521832942570L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = y8.j(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        y8.Eb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = y8.r(247521832942570L, 0L);
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

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = y8.d(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public void g(@Nullable Runnable runnable) {
        this.M6 = runnable;
    }

    private static void eb() {
        Object[] objectArray = Eb;
        Eb[0] = " 9[";
        objectArray[1] = Integer.TYPE;
        y8.Fb[1] = "java/lang/Integer";
        objectArray[2] = "7\f\u001cqe\u0006<\u0003\r>\u0018\u001e/\u0004\u0004w";
        objectArray[3] = "\u0010 Xj`-\u001b/I%\u0001#\u0010$M\u007f";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "s-jg\u0000Xxr`W\u0011\u0012Bdz%\b\u0015rz}=zP?sj0\u001b\u0014r,bW";
    }

    public y8(f1 f12, Ry ry2, OT oT2) {
        this(f12, ry2, oT2, false);
    }

    @Nullable
    public Runnable Q() {
        return this.M6;
    }

    private static CallSite j(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/y8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class r(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = y8.q(l10, l11);
            object = Eb[n2];
            try {
                if (!(object instanceof String)) break block2;
                y8.Eb[n2] = clazz = Class.forName(Fb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static MethodHandle e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'v' || c10 == 'L' || c10 == 'X' || c10 == '\u00ce') {
                field = y8.s(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'v' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'L' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'X' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = y8.t(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00d8' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00d4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = y8.e(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method i(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    private static Field i(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    protected void x(yG yG2) {
    }

    public Ry x() {
        return this.Mb;
    }

    private static int d(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x238;
        if (rb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = qb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])sb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    sb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/y8", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            y8.rb[n3] = n4;
        }
        return rb[n3];
    }

    public boolean V() {
        return this.Mi;
    }

    private void lambda$setup$1(a2 a22) {
        this.c(a22);
    }

    private static int lambda$viewModuleDetails$2(WU wU2, WU wU3) {
        return Boolean.compare(wU2.H(), wU3.H());
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/y8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    protected void c(a2 a22) {
        long l10 = eb ^ 0x30B1707E06A3L;
        this.m();
        double d2 = this.Ba.w();
        this.getClass();
        double d3 = d2 - 5.0;
        yG yG2 = new yG(d3, 12.0);
        yG2.d().f((String)((Object)y8.j("\u00d4", (int)y8.d("q", (int)17666, (long)(0x7293085BD98BBB0FL ^ l10)), (long)-274598981986129751L, (long)l10)));
        yG2.i(false);
        this.Ba.n(yG2, new Object[0]);
        bt bt2 = new bt(a22.O(), 1.0);
        bt2.q(true);
        bt2.B(y8.M.c);
        yG2.n(bt2, new Object[0]);
        List list = a22.o().stream().sorted(y8::lambda$viewModuleDetails$2).collect(Collectors.toList());
        for (WU wU2 : list) {
            bs bs2 = new bs(this.MX, a22, wU2);
            bs2.T(this.Ba.w() - 5.0);
            bs2.Q(y8.M.g);
            this.Ba.n(bs2, new Object[0]);
        }
    }

    public y8(f1 f12, Ry ry2, OT oT2, boolean bl2) {
        super(f12);
        this.Mb = ry2;
        this.MX = oT2;
        this.Mi = bl2;
        this.J();
    }

    public OT k() {
        return this.MX;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                y8.eb = d8.a(3958447880778799181L, -6229609181075634371L, MethodHandles.lookup().lookupClass()).a(231320731841366L);
                y8.Eb = new Object[5];
                y8.Fb = new String[5];
                y8.eb();
                y8.sb = new HashMap<K, V>(13);
                var0 = y8.eb ^ 14287038860572L;
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
                var6_5 = "\\\u001bj%\u00ba\u00bc9f\u008e\u0005\u00c4\u00953\u00c6\u00aa\u000e,\u0093T\t\u0011\u00a9\u00a1F\u0080\u0090HH\u00a1\u00b3\u00ce\u0096&\u0095\u00f6h\u00ef\u00d2\u00b2\u00c1\u00e1\u00e4\u00a7\u00bfb\u00deu\u00b3\u00ae\u00c9n\u00b8\u00e7\u00a8\u00d3=q1bcT\u00b3P\u00c7`\u009c\u0012\u0000\u00bf\u00f7\u00cd\u00d9";
                var7_6 = "\\\u001bj%\u00ba\u00bc9f\u008e\u0005\u00c4\u00953\u00c6\u00aa\u000e,\u0093T\t\u0011\u00a9\u00a1F\u0080\u0090HH\u00a1\u00b3\u00ce\u0096&\u0095\u00f6h\u00ef\u00d2\u00b2\u00c1\u00e1\u00e4\u00a7\u00bfb\u00deu\u00b3\u00ae\u00c9n\u00b8\u00e7\u00a8\u00d3=q1bcT\u00b3P\u00c7`\u009c\u0012\u0000\u00bf\u00f7\u00cd\u00d9".length();
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
                    var6_5 = "\u00aa\u00ac\u0092\u009a\u00a4\u00aa:c\u00c6\u00e7\u00ca\u00bf9m\u0001\u00e0";
                    var7_6 = "\u00aa\u00ac\u0092\u009a\u00a4\u00aa:c\u00c6\u00e7\u00ca\u00bf9m\u0001\u00e0".length();
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
        y8.qb = var8_3;
        y8.rb = new Integer[11];
    }

    private void lambda$setup$0() {
        try {
            if (this.M6 != null) {
                this.M6.run();
            }
        }
        catch (O_ o_2) {
            throw y8.a(o_2);
        }
    }

    private static Field j(Class clazz, String string, Class clazz2) {
        Field field = y8.i(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = y8.j(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int q(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (Fb[n5] != null) {
            return n5;
        }
        Object object = Eb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 50;
                break;
            }
            case 1: {
                n4 = 14;
                break;
            }
            case 2: {
                n4 = 45;
                break;
            }
            case 3: {
                n4 = 15;
                break;
            }
            case 4: {
                n4 = 55;
                break;
            }
            case 5: {
                n4 = 42;
                break;
            }
            case 6: {
                n4 = 11;
                break;
            }
            case 7: {
                n4 = 10;
                break;
            }
            case 8: {
                n4 = 62;
                break;
            }
            case 9: {
                n4 = 21;
                break;
            }
            case 10: {
                n4 = 4;
                break;
            }
            case 11: {
                n4 = 17;
                break;
            }
            case 12: {
                n4 = 44;
                break;
            }
            case 13: {
                n4 = 57;
                break;
            }
            case 14: {
                n4 = 16;
                break;
            }
            case 15: {
                n4 = 30;
                break;
            }
            case 16: {
                n4 = 0;
                break;
            }
            case 17: {
                n4 = 27;
                break;
            }
            case 18: {
                n4 = 28;
                break;
            }
            case 19: {
                n4 = 63;
                break;
            }
            case 20: {
                n4 = 20;
                break;
            }
            case 21: {
                n4 = 48;
                break;
            }
            case 22: {
                n4 = 60;
                break;
            }
            case 23: {
                n4 = 19;
                break;
            }
            case 24: {
                n4 = 23;
                break;
            }
            case 25: {
                n4 = 26;
                break;
            }
            case 26: {
                n4 = 52;
                break;
            }
            case 27: {
                n4 = 13;
                break;
            }
            case 28: {
                n4 = 12;
                break;
            }
            case 29: {
                n4 = 51;
                break;
            }
            case 30: {
                n4 = 59;
                break;
            }
            case 31: {
                n4 = 29;
                break;
            }
            case 32: {
                n4 = 37;
                break;
            }
            case 33: {
                n4 = 61;
                break;
            }
            case 34: {
                n4 = 24;
                break;
            }
            case 35: {
                n4 = 31;
                break;
            }
            case 36: {
                n4 = 58;
                break;
            }
            case 37: {
                n4 = 9;
                break;
            }
            case 38: {
                n4 = 6;
                break;
            }
            case 39: {
                n4 = 5;
                break;
            }
            case 40: {
                n4 = 46;
                break;
            }
            case 41: {
                n4 = 32;
                break;
            }
            case 42: {
                n4 = 1;
                break;
            }
            case 43: {
                n4 = 56;
                break;
            }
            case 44: {
                n4 = 47;
                break;
            }
            case 45: {
                n4 = 25;
                break;
            }
            case 46: {
                n4 = 53;
                break;
            }
            case 47: {
                n4 = 22;
                break;
            }
            case 48: {
                n4 = 7;
                break;
            }
            case 49: {
                n4 = 2;
                break;
            }
            case 50: {
                n4 = 54;
                break;
            }
            case 51: {
                n4 = 43;
                break;
            }
            case 52: {
                n4 = 39;
                break;
            }
            case 53: {
                n4 = 34;
                break;
            }
            case 54: {
                n4 = 8;
                break;
            }
            case 55: {
                n4 = 40;
                break;
            }
            case 56: {
                n4 = 41;
                break;
            }
            case 57: {
                n4 = 3;
                break;
            }
            case 58: {
                n4 = 18;
                break;
            }
            case 59: {
                n4 = 33;
                break;
            }
            case 60: {
                n4 = 35;
                break;
            }
            case 61: {
                n4 = 49;
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
        y8.Fb[n5] = new String(cArray);
        return n5;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(y8.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(y8.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

