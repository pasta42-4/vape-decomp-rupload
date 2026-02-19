/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.F6;
import a.F8;
import a.F9;
import a.FG;
import a.G5;
import a.O_;
import a.RY;
import a.Sz;
import a.X4;
import a.bG;
import a.bS;
import a.bY;
import a.d8;
import a.hY;
import a.ht;
import a.jE;
import a.jk;
import a.rk;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class b8
extends bG {
    private double J6;
    private static final long bb;
    private Color J1;
    private F9 b;
    private static final String[] eb;
    private double D;
    private double J3;
    private rk Jt;
    private static final long ab;
    private X4 JB;
    private double Jo;
    private boolean V;
    private static final Object[] db;
    private double JX;
    protected rk Jd;
    private hY JG;
    private ht JT;
    private jk E;
    private final float JK;
    private double Jr;
    private Double JC;
    private long F;
    private double J9;

    @Override
    public void d() {
        block7: {
            try {
                try {
                    if (!this.V || this.s()) break block7;
                }
                catch (O_ o_2) {
                    throw b8.a(o_2);
                }
                this.Jd.c();
                this.V = false;
            }
            catch (O_ o_3) {
                throw b8.a(o_3);
            }
        }
        try {
            if (this.E.j()) {
                this.E.Z();
            }
        }
        catch (O_ o_4) {
            throw b8.a(o_4);
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/b8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public double a() {
        return this.Jo;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00e5' || c10 == 'g' || c10 == '\u00e1' || c10 == '\u00cb') {
                field = b8.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00e5' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'g' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00e1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = b8.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'F' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00c4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
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

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = b8.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = b8.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public double q() {
        return this.J3;
    }

    public void o(double d2) {
        this.Jo = d2;
    }

    /*
     * Exception decompiling
     */
    public Color z(double var1_1, double var3_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public double z() {
        return 25.0;
    }

    public double K() {
        return this.D;
    }

    /*
     * Exception decompiling
     */
    private void J() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[TRYBLOCK]], but top level block is 8[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static Method h(long l10, long l11) {
        int n2 = b8.e(l10, l11);
        Object object = db[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = eb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = b8.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = b8.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = b8.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        b8.db[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = b8.f(250612242842838L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = b8.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        b8.db[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = b8.f(250612242842838L, 0L);
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

    @Override
    public void G() {
        Color color;
        double d2;
        double d3;
        double d4;
        G5 g5;
        block21: {
            block20: {
                String string;
                try {
                    this.J();
                    if (!this.l().equals(Color.WHITE)) {
                        this.S();
                    }
                }
                catch (O_ o_2) {
                    throw b8.a(o_2);
                }
                double d5 = 0.0;
                switch (RY.Q[this.b.ordinal()]) {
                    case 1: 
                    case 2: {
                        d5 = (Double)this.E.Q().J() / this.J3;
                        break;
                    }
                    case 3: {
                        d5 = (Double)((jE)this.E.A()).J() / this.J3;
                        break;
                    }
                    case 4: {
                        d5 = (Double)this.E.P().J() / this.J3;
                        break;
                    }
                    case 5: {
                        d5 = (Double)this.E.H().J() / this.J3;
                    }
                }
                d5 *= (double)this.JK;
                try {
                    if (d5 != this.JC) {
                        this.Y();
                    }
                }
                catch (O_ o_3) {
                    throw b8.a(o_3);
                }
                g5 = this.L(this.J6);
                try {
                    string = this.b.equals((Object)F9.RAINBOW) ? this.O() : this.b.q();
                }
                catch (O_ o_4) {
                    throw b8.a(o_4);
                }
                String string2 = string;
                double d6 = g5.B(string2);
                this.D = g5.D(this.O());
                d4 = this.W() + 12.5 + d6;
                double d7 = this.w() - 10.0;
                d3 = this.G() + this.Jt.t();
                try {
                    if (!this.b.equals((Object)F9.RAINBOW)) break block20;
                    g5.R(this.O(), this.G() + 5.0, this.W() + 5.0, this.J1);
                    break block21;
                }
                catch (O_ o_5) {
                    throw b8.a(o_5);
                }
            }
            g5.R(this.b.q(), this.G() + 5.0, this.W() + 5.0, this.J1);
        }
        if (this.JG != null) {
            d2 = g5.D(this.JG.O());
            this.JG.b(this.G() + this.w() - 5.0 - d2 - 2.0);
            this.JG.M(this.W() + 2.0);
            this.JG.w(10.0);
            this.JG.T(d2);
            this.JG.d(0.8);
        }
        this.JB = this.K(d3, d4 + 0.5, this.Jd.p() / 2.0);
        d2 = 5.0;
        double d9 = this.w() - d2 * 2.0;
        for (double d10 = 0.0; d10 < d9; d10 += 1.0) {
            F8.A(this.G() + d10 + d2, d4, 1.0, 1.0, this.z(d10, d9));
        }
        try {
            color = this.l().equals(Color.WHITE) ? this.JT.l() : this.l();
        }
        catch (O_ o_6) {
            throw b8.a(o_6);
        }
        Color color2 = color;
        double d11 = this.Jd.t();
        F8.h((float)(this.JB.K() + this.JB.t() / 2.0 - d11 / 2.0), (float)(this.JB.q() + this.JB.V() / 2.0 - d11 / 2.0), (float)d11, 1.0f, b8.M.c, 12.0, color2);
    }

    @Override
    public void g() {
        try {
            if (!this.V) {
                this.Jd.c();
            }
        }
        catch (O_ o_2) {
            throw b8.a(o_2);
        }
        this.V = true;
    }

    public b8(F9 f92, jk jk2, String string, double d2) {
        super(string);
        this.J3 = 255.0;
        this.D = 0.0;
        this.Jt = new rk(0.0, 0.0, 0.0);
        this.Jd = new rk(0.15, 7.0, 8.0);
        this.J6 = 0.75;
        this.JX = -1.0;
        this.JB = new X4(0.0, 0.0, 0.0, 0.0);
        this.J1 = b8.M.n;
        this.JC = -1.0;
        this.E = jk2;
        this.b = f92;
        this.J9 = d2;
        this.Jr = (this.J3 - this.Jo) / 100.0;
        if (f92.equals((Object)F9.RAINBOW)) {
            // empty if block
        }
        this.JK = (float)(this.J3 / jk2.Y());
    }

    public void i(double d2) {
        this.J3 = d2;
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (eb[n5] != null) {
            return n5;
        }
        Object object = db[n5];
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
                n4 = 21;
                break;
            }
            case 2: {
                n4 = 58;
                break;
            }
            case 3: {
                n4 = 59;
                break;
            }
            case 4: {
                n4 = 8;
                break;
            }
            case 5: {
                n4 = 0;
                break;
            }
            case 6: {
                n4 = 31;
                break;
            }
            case 7: {
                n4 = 63;
                break;
            }
            case 8: {
                n4 = 62;
                break;
            }
            case 9: {
                n4 = 44;
                break;
            }
            case 10: {
                n4 = 30;
                break;
            }
            case 11: {
                n4 = 40;
                break;
            }
            case 12: {
                n4 = 46;
                break;
            }
            case 13: {
                n4 = 35;
                break;
            }
            case 14: {
                n4 = 54;
                break;
            }
            case 15: {
                n4 = 52;
                break;
            }
            case 16: {
                n4 = 51;
                break;
            }
            case 17: {
                n4 = 50;
                break;
            }
            case 18: {
                n4 = 5;
                break;
            }
            case 19: {
                n4 = 45;
                break;
            }
            case 20: {
                n4 = 49;
                break;
            }
            case 21: {
                n4 = 37;
                break;
            }
            case 22: {
                n4 = 13;
                break;
            }
            case 23: {
                n4 = 39;
                break;
            }
            case 24: {
                n4 = 48;
                break;
            }
            case 25: {
                n4 = 61;
                break;
            }
            case 26: {
                n4 = 25;
                break;
            }
            case 27: {
                n4 = 2;
                break;
            }
            case 28: {
                n4 = 57;
                break;
            }
            case 29: {
                n4 = 32;
                break;
            }
            case 30: {
                n4 = 22;
                break;
            }
            case 31: {
                n4 = 17;
                break;
            }
            case 32: {
                n4 = 24;
                break;
            }
            case 33: {
                n4 = 33;
                break;
            }
            case 34: {
                n4 = 16;
                break;
            }
            case 35: {
                n4 = 26;
                break;
            }
            case 36: {
                n4 = 38;
                break;
            }
            case 37: {
                n4 = 20;
                break;
            }
            case 38: {
                n4 = 7;
                break;
            }
            case 39: {
                n4 = 23;
                break;
            }
            case 40: {
                n4 = 11;
                break;
            }
            case 41: {
                n4 = 6;
                break;
            }
            case 42: {
                n4 = 1;
                break;
            }
            case 43: {
                n4 = 27;
                break;
            }
            case 44: {
                n4 = 14;
                break;
            }
            case 45: {
                n4 = 18;
                break;
            }
            case 46: {
                n4 = 15;
                break;
            }
            case 47: {
                n4 = 3;
                break;
            }
            case 48: {
                n4 = 29;
                break;
            }
            case 49: {
                n4 = 10;
                break;
            }
            case 50: {
                n4 = 47;
                break;
            }
            case 51: {
                n4 = 28;
                break;
            }
            case 52: {
                n4 = 9;
                break;
            }
            case 53: {
                n4 = 4;
                break;
            }
            case 54: {
                n4 = 43;
                break;
            }
            case 55: {
                n4 = 41;
                break;
            }
            case 56: {
                n4 = 19;
                break;
            }
            case 57: {
                n4 = 53;
                break;
            }
            case 58: {
                n4 = 12;
                break;
            }
            case 59: {
                n4 = 56;
                break;
            }
            case 60: {
                n4 = 55;
                break;
            }
            case 61: {
                n4 = 36;
                break;
            }
            case 62: {
                n4 = 60;
                break;
            }
            default: {
                n4 = 34;
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
        b8.eb[n5] = new String(cArray);
        return n5;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        ab = d8.a(-4504798535585085962L, 8236191851793518069L, MethodHandles.lookup().lookupClass()).a(207414725777926L);
        db = new Object[5];
        eb = new String[5];
        b8.i();
        long l10 = ab ^ 0x1D0D21384996L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n2 = 1;
        while (true) {
            if (n2 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = 4969476738093777224L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                bb = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n2] = (byte)(l10 << n2 * 8 >>> 56);
            ++n2;
        }
    }

    public void D(double d2) {
        this.J9 = d2;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = b8.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = b8.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = b8.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public void Z(Sz sz2) {
        String[] stringArray;
        block30: {
            block31: {
                int n2;
                block26: {
                    long l10;
                    block27: {
                        boolean bl2;
                        jk jk2;
                        block28: {
                            block29: {
                                block24: {
                                    long l11 = ab ^ 0x520BE22C542L;
                                    stringArray = bY.M();
                                    try {
                                        long l12;
                                        block25: {
                                            try {
                                                try {
                                                    try {
                                                        n2 = this.b.equals((Object)F9.RAINBOW);
                                                        if (stringArray == null) break block24;
                                                        if (n2 != 0) break block25;
                                                    }
                                                    catch (O_ o_2) {
                                                        throw b8.a(o_2);
                                                    }
                                                    n2 = this.b.equals((Object)F9.BLOCK_CHILD);
                                                    if (stringArray == null) break block26;
                                                }
                                                catch (O_ o_3) {
                                                    throw b8.a(o_3);
                                                }
                                                if (n2 == 0) break block27;
                                            }
                                            catch (O_ o_4) {
                                                throw b8.a(o_4);
                                            }
                                        }
                                        n2 = (l12 = this.F + 300L - System.currentTimeMillis()) == 0L ? 0 : (l12 < 0L ? -1 : 1);
                                    }
                                    catch (O_ o_5) {
                                        throw b8.a(o_5);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            if (stringArray == null) break block26;
                                            if (n2 <= 0) break block27;
                                        }
                                        catch (O_ o_6) {
                                            throw b8.a(o_6);
                                        }
                                        jk2 = this.E;
                                        bl2 = this.E.j();
                                        if (stringArray == null) break block28;
                                    }
                                    catch (O_ o_7) {
                                        throw b8.a(o_7);
                                    }
                                    if (bl2) break block29;
                                }
                                catch (O_ o_8) {
                                    throw b8.a(o_8);
                                }
                                bl2 = true;
                                break block28;
                            }
                            bl2 = false;
                        }
                        jk2.n(bl2);
                    }
                    n2 = (l10 = System.currentTimeMillis() - 1795321218903L) == 0L ? 0 : (l10 < 0L ? -1 : 1);
                }
                try {
                    if (n2 > 0) {
                        this.E.E(new Color(0, 0, 0, 0));
                    }
                }
                catch (O_ o_9) {
                    throw b8.a(o_9);
                }
                X4 x42 = new X4(this.G(), this.JB.q(), this.w(), this.JB.V());
                try {
                    try {
                        if (stringArray == null) break block30;
                        if (!x42.O(sz2.getX(), sz2.getY())) break block31;
                    }
                    catch (O_ o_10) {
                        throw b8.a(o_10);
                    }
                    this.L = FG.b();
                    this.Y = true;
                }
                catch (O_ o_11) {
                    throw b8.a(o_11);
                }
            }
            this.F = System.currentTimeMillis();
        }
        try {
            if (stringArray == null) {
                ht.I(new String[2]);
            }
        }
        catch (O_ o_12) {
            throw b8.a(o_12);
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public b8(bS bS2) {
        long l10 = ab ^ 0x2F0112C177BL;
        this(F9.BLOCK_CHILD, bS2.k());
        this.JG = new hY((String)((Object)b8.b("\u00c4", (int)((int)bb), (long)-3769418844228876880L, (long)l10)));
        this.JG.N(new F6(this, bS2));
        this.o(this.JG);
    }

    public X4 w() {
        return this.JB;
    }

    public double p() {
        return this.J9;
    }

    private void lambda$new$0(jk jk2) {
        this.Y();
    }

    public b8(F9 f92, jk jk2) {
        this(f92, jk2, jk2.O(), 1.0);
        this.L(jk2);
        jk2.P(this::lambda$new$0);
        this.Y();
    }

    private static Field g(long l10, long l11) {
        int n2 = b8.e(l10, l11);
        Object object = db[n2];
        if (object instanceof String) {
            String string = eb[n2];
            int n3 = string.indexOf(8);
            Class clazz = b8.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = b8.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = b8.c(clazz3, string2, clazz2)) != null) {
                    b8.db[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = b8.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        b8.db[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = b8.f(250612242842838L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void Y() {
        double d2;
        double d3;
        double d4;
        double d5;
        block15: {
            block14: {
                double d6 = this.w() - 10.0;
                d5 = 0.0;
                switch (RY.Q[this.b.ordinal()]) {
                    case 1: 
                    case 2: {
                        d5 = (Double)this.E.Q().J() / this.J3;
                        break;
                    }
                    case 3: {
                        d5 = (Double)((jE)this.E.A()).J() / this.J3;
                        break;
                    }
                    case 4: {
                        d5 = (Double)this.E.P().J() / this.J3;
                        break;
                    }
                    case 5: {
                        d5 = (Double)this.E.H().J() / this.J3;
                    }
                }
                d4 = (d6 - this.Jd.p()) * (d5 *= (double)this.JK) + 5.0 + this.Jd.p() / 2.0;
                d3 = this.Jt.t();
                d2 = 0.05;
                try {
                    try {
                        try {
                            if (this.b != F9.BLOCK_CHILD && this.b != F9.RAINBOW) break block14;
                        }
                        catch (O_ o_2) {
                            throw b8.a(o_2);
                        }
                        if (!this.E.j()) break block15;
                    }
                    catch (O_ o_3) {
                        throw b8.a(o_3);
                    }
                    if (d5 != 0.0) break block15;
                }
                catch (O_ o_4) {
                    throw b8.a(o_4);
                }
                d2 = 0.0;
                break block15;
            }
            try {
                if (!this.E.j() || !this.E.i()) break block15;
            }
            catch (O_ o_5) {
                throw b8.a(o_5);
            }
            d2 = 1.0;
        }
        this.Jt = new rk(d2, d3, d4);
        this.JX = d5;
        this.Jt.o();
    }

    @Override
    public double e() {
        return 110.0;
    }

    public void M(ht ht2) {
        this.JT = ht2;
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = b8.e(l10, l11);
            object = db[n2];
            try {
                if (!(object instanceof String)) break block2;
                b8.db[n2] = clazz = Class.forName(eb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static void i() {
        Object[] objectArray = db;
        db[0] = "D3'";
        objectArray[1] = Integer.TYPE;
        b8.eb[1] = "java/lang/Integer";
        objectArray[2] = "kk\u001c]DE`d\r\u00129]sc\u0004[";
        objectArray[3] = "\u00001l$X/\u000b>}k9!\u00005y1";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "~WQp\u001f\";JF\u0017\u0013&@UC(\bdq\\\u0000jxd8\u0017Tj\u0002-!R\u0006\u0017";
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(b8.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

