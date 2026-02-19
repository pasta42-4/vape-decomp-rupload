/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.Ao;
import a.C2;
import a.F8;
import a.FG;
import a.G5;
import a.GQ;
import a.ID;
import a.O_;
import a.Or;
import a.SE;
import a.Sz;
import a.T;
import a.TA;
import a.X4;
import a.bh;
import a.d8;
import a.i3;
import a.iz;
import a.jE;
import a.jS;
import a.sX;
import a.w6;
import a.yQ;
import a.z4;
import java.awt.Color;
import java.awt.Point;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class ht
implements T {
    private double m;
    private boolean o;
    private List<i3> X;
    private double O;
    private static final Object[] yb;
    private static String[] Q;
    private C2 G;
    public final float y = 5.0f;
    private static final String[] zb;
    public final float d = 8.0f;
    private double p;
    private boolean q;
    private String s;
    private long U;
    private final List<z4> H;
    private jE C;
    private boolean l;
    private boolean a;
    private double K;
    private boolean r;
    private bh S;
    private static final Map ib;
    protected boolean T;
    private List<TA> u;
    private static final long[] gb;
    private List<i3> g;
    private boolean Z;
    private double w;
    private static final long cb;
    private double e;
    private final ArrayList<ht> k;
    private boolean c;
    private boolean h;
    private long P;
    private static final Integer[] hb;
    private yQ J;
    private Sz I;
    private boolean f;
    private double z;
    @Nullable
    private jS j;
    public final double W = 0.15;
    private long A;
    private Color x;
    private boolean N;

    public List<i3> Z() {
        return this.X;
    }

    public void Q() {
        F8.H((float)this.G(), (float)this.W(), 1.0f, (float)this.b(), Color.MAGENTA);
        F8.H((float)this.G(), (float)this.W(), (float)this.w(), 1.0f, Color.MAGENTA);
        F8.H((float)this.G() + (float)this.w(), (float)this.W(), 1.0f, (float)this.b(), Color.MAGENTA);
        F8.H((float)this.G(), (float)this.W() + (float)this.b(), (float)this.w(), 1.0f, Color.MAGENTA);
    }

    @Override
    public double W() {
        return this.e;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'k' || c10 == '\u00ba' || c10 == '\u00e6' || c10 == '\u00cc') {
                field = ht.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'k' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00ba' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00e6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ht.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'A' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00ec' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public boolean G() {
        sX sX2 = FG.b();
        return this.C().T(sX2);
    }

    private static void ab() {
        Object[] objectArray = yb;
        yb[0] = "iVm";
        objectArray[1] = Integer.TYPE;
        ht.zb[1] = "java/lang/Integer";
        objectArray[2] = "!J-\u007fo&*E<0\u0012>9B5y";
        objectArray[3] = "\u000f07~i1\u0004?&1\b?\u000f4\"k";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "W\u0013=M\u000e\n\u0003\u000fb,\u0015\u001fl\u0019}\u0010\u0011\u000b\f\u000b:W~]\u0011\u0007aO\f\u0005\n\u0006o,";
    }

    public void S() {
        try {
            if (!this.H()) {
                return;
            }
        }
        catch (O_ o_2) {
            throw ht.d(o_2);
        }
        F8.A(this.G(), this.W(), this.w(), this.m(), this.l());
    }

    @Override
    public void b(double d2) {
        this.z = d2;
    }

    public void h(TA tA2) {
        this.u.add(tA2);
    }

    @Override
    public void T(double d2) {
        try {
            this.p = d2;
            if (this.w == -1.0) {
                this.w = d2;
            }
        }
        catch (O_ o_2) {
            throw ht.d(o_2);
        }
    }

    public bh E() {
        return this.S;
    }

    public void t() {
        this.U();
        for (ht ht2 : this.A()) {
            try {
                if (!ht2.f()) continue;
                ht2.t();
            }
            catch (O_ o_2) {
                throw ht.d(o_2);
            }
        }
    }

    private static Method d(long l10, long l11) {
        int n2 = ht.a(l10, l11);
        Object object = yb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = zb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = ht.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = ht.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ht.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        ht.yb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ht.b(220416334510086L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = ht.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        ht.yb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ht.b(220416334510086L, 0L);
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

    private static CallSite g(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/ht" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void i(boolean bl2) {
        this.q = bl2;
    }

    @Override
    public boolean f() {
        boolean bl2;
        block11: {
            block10: {
                block9: {
                    try {
                        try {
                            if (this.k() == null || !this.k().w()) break block9;
                        }
                        catch (O_ o_2) {
                            throw ht.d(o_2);
                        }
                        return false;
                    }
                    catch (O_ o_3) {
                        throw ht.d(o_3);
                    }
                }
                boolean bl3 = true;
                if (this.C != null) {
                    bl3 = this.C.A();
                }
                try {
                    try {
                        if (!this.l || !bl3) break block10;
                    }
                    catch (O_ o_4) {
                        throw ht.d(o_4);
                    }
                    bl2 = true;
                    break block11;
                }
                catch (O_ o_5) {
                    throw ht.d(o_5);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public static String[] J() {
        return Q;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = ht.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = ht.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public boolean e() {
        return this.Z;
    }

    public List<ht> A() {
        return this.k;
    }

    public boolean H() {
        return this.q;
    }

    public void a(TA tA2) {
        this.u.remove(tA2);
    }

    public void N(boolean bl2) {
        this.l = bl2;
    }

    public void R(boolean bl2) {
        this.f = bl2;
    }

    public void P(double d2) {
        this.m = d2;
        this.O = d2;
    }

    public void w() {
        this.U = 0L;
        this.P = 0L;
        this.S.N(false);
        Ao.v = null;
    }

    public double Y() {
        double d2;
        double d3;
        double d4 = this.b();
        if (this instanceof yQ && (d3 = Math.max(d4, d2 = ((yQ)this).Q())) > d2) {
            d4 = d2;
        }
        return d4;
    }

    public void W() {
        this.g.clear();
    }

    public void o(C2 c22) {
        this.G = c22;
    }

    public void l(boolean bl2) {
        this.T = bl2;
    }

    @Override
    public double b() {
        double d2;
        try {
            d2 = this.a ? this.O : Math.max(this.O, this.z());
        }
        catch (O_ o_2) {
            throw ht.d(o_2);
        }
        return d2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/ht" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void G(z4 z42) {
        this.H.add(z42);
    }

    @Nullable
    public jS R() {
        return this.j;
    }

    @Override
    public double w() {
        double d2;
        try {
            d2 = this.c ? this.p : Math.max(this.p, this.e());
        }
        catch (O_ o_2) {
            throw ht.d(o_2);
        }
        return d2;
    }

    public G5 J() {
        G5 g5;
        try {
            g5 = this.j != null ? this.j.R(1.0f, false) : SE.h.W().q();
        }
        catch (O_ o_2) {
            throw ht.d(o_2);
        }
        return g5;
    }

    public ht() {
        long l10 = cb ^ 0x5EC325D26938L;
        this.w = -1.0;
        this.m = -1.0;
        this.l = true;
        this.g = new CopyOnWriteArrayList<i3>();
        this.X = new CopyOnWriteArrayList<i3>();
        this.u = new ArrayList<TA>();
        this.H = new ArrayList<z4>();
        this.k = new ArrayList();
        this.y = 5.0f;
        this.d = 8.0f;
        this.W = 0.15;
        this.q = true;
        this.o = true;
        this.h = false;
        this.Z = true;
        this.K = 5.0;
        this.s = ht.g("\u00ec", (int)ht.a("o", (int)13179, (long)(0x53EFB20C576AFEAEL ^ l10)), (long)-2243016655125762737L, (long)l10);
        this.T = false;
    }

    public void F(boolean bl2) {
        this.Z = bl2;
    }

    public void N() {
        block27: {
            block25: {
                try {
                    if (!Ao.B(this)) break block25;
                    this.g();
                    if (this.r) break block25;
                }
                catch (O_ o_2) {
                    throw ht.d(o_2);
                }
                this.r = true;
                for (z4 object : this.H) {
                    object.M(true);
                }
            }
            this.l(true);
            boolean bl2 = Ao.K.sJ.s();
            for (ht ht2 : this.A()) {
                block26: {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (!ht2.f() || !ht2.G()) continue;
                                            }
                                            catch (O_ o_3) {
                                                throw ht.d(o_3);
                                            }
                                            if (!Ao.B(ht2)) continue;
                                        }
                                        catch (O_ o_4) {
                                            throw ht.d(o_4);
                                        }
                                        if (!(this instanceof yQ)) break block26;
                                    }
                                    catch (O_ o_5) {
                                        throw ht.d(o_5);
                                    }
                                    if (((yQ)this).Q() == null) break block26;
                                }
                                catch (O_ o_6) {
                                    throw ht.d(o_6);
                                }
                                if (!((yQ)this).Q().G()) break block26;
                            }
                            catch (O_ o_7) {
                                throw ht.d(o_7);
                            }
                            if (!(ht2 instanceof C2)) {
                                continue;
                            }
                        }
                        catch (O_ o_8) {
                            throw ht.d(o_8);
                        }
                    }
                    catch (O_ o_9) {
                        throw ht.d(o_9);
                    }
                }
                try {
                    ht2.N();
                    if (ht2.E() == null || !bl2) continue;
                }
                catch (O_ o_10) {
                    throw ht.d(o_10);
                }
                bl2 = false;
            }
            try {
                try {
                    if (!bl2 || this.S == null) break block27;
                }
                catch (O_ o_11) {
                    throw ht.d(o_11);
                }
                this.h();
            }
            catch (O_ o_12) {
                throw ht.d(o_12);
            }
        }
    }

    @Override
    public double G() {
        return this.z;
    }

    public void Z(double d2) {
        this.K = d2;
    }

    public G5 L(double d2) {
        G5 g5;
        try {
            g5 = this.j != null ? this.j.R((float)d2, false) : SE.h.W().S(d2);
        }
        catch (O_ o_2) {
            throw ht.d(o_2);
        }
        return g5;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        cb = d8.a(5185310535453180014L, 3140994186504313224L, MethodHandles.lookup().lookupClass()).a(121636941396948L);
        yb = new Object[5];
        zb = new String[5];
        ht.ab();
        ib = new HashMap(13);
        long l10 = cb ^ 0x44F26A95AFDBL;
        ht.I(null);
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n2 = 0;
        String string = "\u0086\u0094\u00ae\u00adP[\b\u00cfv\u00111-\u00a8\u0096\u00b0\u009b";
        int n3 = "\u0086\u0094\u00ae\u00adP[\b\u00cfv\u00111-\u00a8\u0096\u00b0\u009b".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n5] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n3);
        gb = lArray;
        hb = new Integer[2];
    }

    public static void I(String[] stringArray) {
        Q = stringArray;
    }

    public boolean b() {
        return this.o;
    }

    public X4 C() {
        return new X4(this.G(), this.W(), this.w(), this.b());
    }

    public w6 V() {
        w6 w62;
        yQ yQ2;
        block12: {
            try {
                if (this.G != null) {
                    return this.G.V();
                }
            }
            catch (O_ o_2) {
                throw ht.d(o_2);
            }
            yQ2 = this.F();
            try {
                if (yQ2 instanceof w6) {
                    return (w6)yQ2;
                }
            }
            catch (O_ o_3) {
                throw ht.d(o_3);
            }
            try {
                try {
                    if (yQ2 != null || !(this instanceof w6)) break block12;
                }
                catch (O_ o_4) {
                    throw ht.d(o_4);
                }
                return (w6)this;
            }
            catch (O_ o_5) {
                throw ht.d(o_5);
            }
        }
        try {
            w62 = yQ2 != null ? yQ2.V() : null;
        }
        catch (O_ o_6) {
            throw ht.d(o_6);
        }
        return w62;
    }

    public void J(boolean bl2) {
        this.c = bl2;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = ht.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public void S(boolean bl2) {
        this.a = bl2;
    }

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (zb[n5] != null) {
            return n5;
        }
        Object object = yb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 20;
                break;
            }
            case 1: {
                n4 = 9;
                break;
            }
            case 2: {
                n4 = 62;
                break;
            }
            case 3: {
                n4 = 50;
                break;
            }
            case 4: {
                n4 = 16;
                break;
            }
            case 5: {
                n4 = 34;
                break;
            }
            case 6: {
                n4 = 6;
                break;
            }
            case 7: {
                n4 = 55;
                break;
            }
            case 8: {
                n4 = 4;
                break;
            }
            case 9: {
                n4 = 35;
                break;
            }
            case 10: {
                n4 = 53;
                break;
            }
            case 11: {
                n4 = 38;
                break;
            }
            case 12: {
                n4 = 19;
                break;
            }
            case 13: {
                n4 = 43;
                break;
            }
            case 14: {
                n4 = 37;
                break;
            }
            case 15: {
                n4 = 0;
                break;
            }
            case 16: {
                n4 = 54;
                break;
            }
            case 17: {
                n4 = 17;
                break;
            }
            case 18: {
                n4 = 47;
                break;
            }
            case 19: {
                n4 = 22;
                break;
            }
            case 20: {
                n4 = 11;
                break;
            }
            case 21: {
                n4 = 63;
                break;
            }
            case 22: {
                n4 = 51;
                break;
            }
            case 23: {
                n4 = 18;
                break;
            }
            case 24: {
                n4 = 10;
                break;
            }
            case 25: {
                n4 = 24;
                break;
            }
            case 26: {
                n4 = 5;
                break;
            }
            case 27: {
                n4 = 8;
                break;
            }
            case 28: {
                n4 = 56;
                break;
            }
            case 29: {
                n4 = 32;
                break;
            }
            case 30: {
                n4 = 27;
                break;
            }
            case 31: {
                n4 = 2;
                break;
            }
            case 32: {
                n4 = 45;
                break;
            }
            case 33: {
                n4 = 58;
                break;
            }
            case 34: {
                n4 = 1;
                break;
            }
            case 35: {
                n4 = 60;
                break;
            }
            case 36: {
                n4 = 30;
                break;
            }
            case 37: {
                n4 = 13;
                break;
            }
            case 38: {
                n4 = 52;
                break;
            }
            case 39: {
                n4 = 44;
                break;
            }
            case 40: {
                n4 = 59;
                break;
            }
            case 41: {
                n4 = 12;
                break;
            }
            case 42: {
                n4 = 21;
                break;
            }
            case 43: {
                n4 = 39;
                break;
            }
            case 44: {
                n4 = 61;
                break;
            }
            case 45: {
                n4 = 15;
                break;
            }
            case 46: {
                n4 = 25;
                break;
            }
            case 47: {
                n4 = 14;
                break;
            }
            case 48: {
                n4 = 26;
                break;
            }
            case 49: {
                n4 = 7;
                break;
            }
            case 50: {
                n4 = 41;
                break;
            }
            case 51: {
                n4 = 57;
                break;
            }
            case 52: {
                n4 = 48;
                break;
            }
            case 53: {
                n4 = 36;
                break;
            }
            case 54: {
                n4 = 33;
                break;
            }
            case 55: {
                n4 = 28;
                break;
            }
            case 56: {
                n4 = 40;
                break;
            }
            case 57: {
                n4 = 46;
                break;
            }
            case 58: {
                n4 = 23;
                break;
            }
            case 59: {
                n4 = 31;
                break;
            }
            case 60: {
                n4 = 49;
                break;
            }
            case 61: {
                n4 = 3;
                break;
            }
            case 62: {
                n4 = 29;
                break;
            }
            default: {
                n4 = 42;
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
        ht.zb[n5] = new String(cArray);
        return n5;
    }

    public boolean v() {
        return this.h;
    }

    public G5 t(double d2) {
        G5 g5;
        try {
            g5 = this.j != null ? this.j.R((float)d2, true) : SE.h.W().u(d2, false);
        }
        catch (O_ o_2) {
            throw ht.d(o_2);
        }
        return g5;
    }

    public double m() {
        return this.b();
    }

    public void J(ht ht2) {
        this.A().remove(ht2);
    }

    public void m(Color color) {
        long l10 = cb ^ 0x59975438369BL;
        F8.A(this.G(), this.W(), this.w(), this.b(), color);
        this.L(0.75).R(String.format((String)((Object)ht.g("\u00ec", (int)ht.a("o", (int)26350, (long)(0x29E3BAF7AA8EF499L ^ l10)), (long)-4648784193514638612L, (long)l10)), this.G(), this.W(), this.w(), this.b()), this.G(), this.W(), Color.WHITE);
    }

    public void S(Sz sz2) {
        try {
            if (sz2.equals(this.I)) {
                return;
            }
        }
        catch (O_ o_2) {
            throw ht.d(o_2);
        }
        try {
            this.I = sz2;
            if (sz2.isCancelled()) {
                return;
            }
        }
        catch (O_ o_3) {
            throw ht.d(o_3);
        }
        for (i3 iterator2 : this.G()) {
            try {
                if (!iterator2.o(new Point(sz2.getX(), sz2.getY()))) continue;
                return;
            }
            catch (O_ o_4) {
                throw ht.d(o_4);
            }
        }
        ArrayList<ht> arrayList = new ArrayList<ht>(this.A());
        Collections.reverse(arrayList);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            ht ht2;
            block37: {
                ht2 = (ht)iterator.next();
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        if (!ht2.f() || !ht2.s()) continue;
                                    }
                                    catch (O_ o_5) {
                                        throw ht.d(o_5);
                                    }
                                    if (!(this instanceof yQ)) break block37;
                                }
                                catch (O_ o_6) {
                                    throw ht.d(o_6);
                                }
                                if (((yQ)this).Q() == null) break block37;
                            }
                            catch (O_ o_7) {
                                throw ht.d(o_7);
                            }
                            if (!((yQ)this).Q().s()) break block37;
                        }
                        catch (O_ o_8) {
                            throw ht.d(o_8);
                        }
                        if (!(ht2 instanceof C2)) {
                            continue;
                        }
                    }
                    catch (O_ o_9) {
                        throw ht.d(o_9);
                    }
                }
                catch (O_ o_10) {
                    throw ht.d(o_10);
                }
            }
            try {
                if (!ht2.e()) {
                    continue;
                }
            }
            catch (O_ o_11) {
                throw ht.d(o_11);
            }
            try {
                try {
                    ht2.S(sz2);
                    if (ht2 instanceof C2 || this.h) continue;
                }
                catch (O_ o_12) {
                    throw ht.d(o_12);
                }
                return;
            }
            catch (O_ o_13) {
                throw ht.d(o_13);
            }
        }
        this.Z(sz2);
        for (i3 i32 : this.G()) {
            iz iz2;
            Point point;
            i3 i33;
            block39: {
                block40: {
                    block38: {
                        try {
                            i33 = i32;
                            point = new Point(ID.M(), ID.k());
                            if (sz2.getAction() != Or.LEFT_CLICK) break block38;
                            iz2 = iz.LEFT_CLICK;
                            break block39;
                        }
                        catch (O_ o_14) {
                            throw ht.d(o_14);
                        }
                    }
                    try {
                        if (sz2.getAction() != Or.RIGHT_CLICK) break block40;
                        iz2 = iz.RIGHT_CLICK;
                        break block39;
                    }
                    catch (O_ o_15) {
                        throw ht.d(o_15);
                    }
                }
                try {
                    iz2 = sz2.getAction() == Or.MIDDLE_CLICK ? iz.MIDDLE_CLICK : null;
                }
                catch (O_ o_16) {
                    throw ht.d(o_16);
                }
            }
            i33.B(point, iz2);
        }
    }

    public String q() {
        return this.s;
    }

    public void j(i3 i32) {
        this.g.remove(i32);
    }

    private static O_ d(O_ o_2) {
        return o_2;
    }

    public List<z4> L() {
        return this.H;
    }

    public void L(jE jE2) {
        try {
            this.C = jE2;
            jE2.O(this);
            if (jE2.d() != null) {
                this.g(jE2.d());
            }
        }
        catch (O_ o_2) {
            throw ht.d(o_2);
        }
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

    @Override
    public void w(double d2) {
        try {
            this.O = d2;
            if (this.m == -1.0) {
                this.m = d2;
            }
        }
        catch (O_ o_2) {
            throw ht.d(o_2);
        }
    }

    public void Q(yQ yQ2) {
        this.J = yQ2;
    }

    public boolean c() {
        return this.f;
    }

    public void O(Sz sz2) {
        this.R(sz2);
        for (ht ht2 : this.A()) {
            try {
                if (!ht2.f()) {
                    continue;
                }
            }
            catch (O_ o_2) {
                throw ht.d(o_2);
            }
            ht2.O(sz2);
        }
    }

    public boolean o() {
        return this.N;
    }

    public Color l() {
        try {
            if (this.x == null) {
                this.x = ht.M.W;
            }
        }
        catch (O_ o_2) {
            throw ht.d(o_2);
        }
        return this.x;
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = ht.a(l10, l11);
            object = yb[n2];
            try {
                if (!(object instanceof String)) break block2;
                ht.yb[n2] = clazz = Class.forName(zb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public double F() {
        return this.m;
    }

    public void k() {
        CopyOnWriteArrayList<ht> copyOnWriteArrayList = new CopyOnWriteArrayList<ht>(this.A());
        for (ht ht2 : copyOnWriteArrayList) {
            try {
                if (!ht2.b()) continue;
                this.J(ht2);
            }
            catch (O_ o_2) {
                throw ht.d(o_2);
            }
        }
    }

    public void K() {
        this.l(false);
        if (this.r) {
            this.r = false;
            this.j();
            for (z4 z42 : this.H) {
                z42.M(false);
            }
        }
    }

    public void c() {
        this.d();
        List<ht> list = this.A();
        int n2 = list.size();
        try {
            for (int i10 = 0; i10 < n2; ++i10) {
                list.get(i10).c();
            }
        }
        catch (O_ o_2) {
            throw ht.d(o_2);
        }
    }

    public void r() {
    }

    public boolean A() {
        return this.q;
    }

    public ht Q(Color color) {
        this.x = color;
        return this;
    }

    public void o(String string) {
        this.s = string;
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x2D0B;
        if (hb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = gb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])ib.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    ib.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/ht", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ht.hb[n3] = n4;
        }
        return hb[n3];
    }

    public ht g(@Nullable String string) {
        try {
            if (string == null) {
                this.S = null;
                return this;
            }
        }
        catch (O_ o_2) {
            throw ht.d(o_2);
        }
        try {
            if (string.isEmpty()) {
                return this;
            }
        }
        catch (O_ o_3) {
            throw ht.d(o_3);
        }
        this.S = new bh(this, string);
        return this;
    }

    public double y() {
        return this.w;
    }

    public void j(boolean bl2) {
        this.N = bl2;
    }

    public void r(w6 w62, w6 w63) {
        this.g.add(new GQ(this, w62, w63));
    }

    public ht i(bh bh2) {
        this.S = bh2;
        return this;
    }

    public void E() {
        block19: {
            try {
                block20: {
                    try {
                        try {
                            try {
                                this.e();
                                if (this.U == 0L || this.A != this.U) break block19;
                            }
                            catch (O_ o_2) {
                                throw ht.d(o_2);
                            }
                            if (!this.s()) break block20;
                        }
                        catch (O_ o_3) {
                            throw ht.d(o_3);
                        }
                        if (this.f()) break block19;
                    }
                    catch (O_ o_4) {
                        throw ht.d(o_4);
                    }
                }
                this.w();
            }
            catch (O_ o_5) {
                throw ht.d(o_5);
            }
        }
        try {
            if (this.S != null) {
                this.S.r(true);
            }
        }
        catch (O_ o_6) {
            throw ht.d(o_6);
        }
        try {
            this.A = this.U;
            this.G();
            if (this instanceof yQ) {
                ((yQ)this).B();
            }
        }
        catch (O_ o_7) {
            throw ht.d(o_7);
        }
        for (ht ht2 : this.A()) {
            try {
                try {
                    if (!ht2.f() || this.c()) continue;
                }
                catch (O_ o_8) {
                    throw ht.d(o_8);
                }
                ht2.E();
            }
            catch (O_ o_9) {
                throw ht.d(o_9);
            }
        }
    }

    public List<i3> G() {
        return this.g;
    }

    public jE k() {
        return this.C;
    }

    public void n(boolean bl2) {
        this.h = bl2;
    }

    public void h() {
        try {
            if (this.P == 0L) {
                this.P = System.currentTimeMillis();
            }
        }
        catch (O_ o_2) {
            throw ht.d(o_2);
        }
        this.U += System.currentTimeMillis() - this.P;
        if (this.U >= 2000L) {
            sX sX2 = FG.b();
            this.S.b(sX2.X);
            this.S.M(sX2.I);
            this.S.N(true);
            Ao.v = this.S;
        }
    }

    public void R(z4 z42) {
        this.H.remove(z42);
    }

    public List<TA> g() {
        return this.u;
    }

    @Override
    public void M(double d2) {
        this.e = d2;
    }

    private static Field c(long l10, long l11) {
        int n2 = ht.a(l10, l11);
        Object object = yb[n2];
        if (object instanceof String) {
            String string = zb[n2];
            int n3 = string.indexOf(8);
            Class clazz = ht.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = ht.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ht.a(clazz3, string2, clazz2)) != null) {
                    ht.yb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = ht.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        ht.yb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ht.b(220416334510086L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public double J() {
        return this.K;
    }

    public void o(ht ... htArray) {
        Collections.addAll(this.A(), htArray);
    }

    public void k(boolean bl2) {
        this.o = bl2;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = ht.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    protected void e() {
        block3: {
            try {
                if (!this.s() || this.G()) break block3;
            }
            catch (O_ o_2) {
                throw ht.d(o_2);
            }
            this.K();
            for (ht ht2 : this.A()) {
                ht2.K();
            }
        }
    }

    public boolean s() {
        return this.T;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ht.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = ht.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public void s() {
    }

    public yQ F() {
        return this.J;
    }

    public void C(@Nullable jS jS2) {
        this.j = jS2;
    }

    public void P(i3 i32) {
        this.X.add(i32);
    }

    public void Y(double d2) {
        this.w = d2;
        this.p = d2;
    }

    public void l(i3 i32) {
        this.g.add(i32);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ht.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ht.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

