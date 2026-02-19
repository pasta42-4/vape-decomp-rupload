/*
 * Decompiled with CFR 0.152.
 */
package com.graphics.rendering;

import a.F9;
import a.RY;
import com.analytics.computation.MetricsCalculationEngine;
import com.app.math.NumericStreamProcessor;
import com.app.task.scheduling.ProcessingTaskScheduler;
import com.collections.management.MultiContainerRegistry;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.geospatial.calculation.GeographicalPositionCalculator;
import com.math.computation.NumericComputationResolver;
import com.network.state.NetworkStateManager;
import com.rendering.adaptive.AdaptiveRenderingEngine;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.security.crypto.CryptographicParameterGenerator;
import com.system.configuration.ConfigurationManager;
import com.ui.events.UserInteractionEventDispatcher;
import com.ui.rendering.VisualRenderContext;
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

public class GraphicsRenderingUtility
extends GeographicalPositionCalculator {
    private double J6;
    private static final long bb;
    private Color J1;
    private F9 b;
    private static final String[] eb;
    private double D;
    private double J3;
    private NumericStreamProcessor Jt;
    private static final long ab;
    private MetricsCalculationEngine JB;
    private double Jo;
    private boolean V;
    private static final Object[] db;
    private double JX;
    protected NumericStreamProcessor Jd;
    private VisualRenderContext JG;
    private AbstractComputationKernel JT;
    private AdaptiveRenderingEngine E;
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
                catch (CustomSystemException customSystemException) {
                    throw GraphicsRenderingUtility.a(customSystemException);
                }
                this.Jd.c();
                this.V = false;
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicsRenderingUtility.a(customSystemException);
            }
        }
        try {
            if (this.E.j()) {
                this.E.Z();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicsRenderingUtility.a(customSystemException);
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

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e5' || c == 'g' || c == '\u00e1' || c == '\u00cb') {
                field = GraphicsRenderingUtility.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e5' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'g' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = GraphicsRenderingUtility.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'F' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n) continue;
            for (int i = 0; i < n; ++i) {
                if (classArray2[i] != classArray[i]) continue block0;
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
        Field field = GraphicsRenderingUtility.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = GraphicsRenderingUtility.d(classArray[i], string, clazz2);
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

    private static Method h(long l, long l2) {
        int n = GraphicsRenderingUtility.e(l, l2);
        Object object = db[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = eb[n];
                int n3 = string2.indexOf(8);
                clazz3 = GraphicsRenderingUtility.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
                int n4 = string2.indexOf(8, ++n3);
                string = string2.substring(n3, n4);
                int n5 = -1;
                int n6 = n4;
                do {
                    ++n5;
                    ++n6;
                } while ((n6 = string2.indexOf(8, n6)) > -1);
                n2 = n5 - 1;
                classArray2 = new Class[n2];
                clazz2 = null;
                n6 = n4 + 1;
                for (int i = 0; i < n5; ++i) {
                    int n7 = string2.indexOf(8, n6);
                    clazz2 = GraphicsRenderingUtility.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = GraphicsRenderingUtility.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        GraphicsRenderingUtility.db[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = GraphicsRenderingUtility.f(250612242842838L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = GraphicsRenderingUtility.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        GraphicsRenderingUtility.db[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = GraphicsRenderingUtility.f(250612242842838L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n8 = 0;
            while (n8 < n2) {
                stringBuffer.append(classArray2[n8].getName());
                if (++n8 >= n2) continue;
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
        CryptographicParameterGenerator cryptographicParameterGenerator;
        block21: {
            block20: {
                String string;
                try {
                    this.J();
                    if (!this.l().equals(Color.WHITE)) {
                        this.S();
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicsRenderingUtility.a(customSystemException);
                }
                double d5 = 0.0;
                switch (RY.Q[this.b.ordinal()]) {
                    case 1: 
                    case 2: {
                        d5 = (Double)this.E.Q().J() / this.J3;
                        break;
                    }
                    case 3: {
                        d5 = (Double)((ConfigurationProfileResolver)this.E.A()).J() / this.J3;
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
                catch (CustomSystemException customSystemException) {
                    throw GraphicsRenderingUtility.a(customSystemException);
                }
                cryptographicParameterGenerator = this.L(this.J6);
                try {
                    string = this.b.equals((Object)F9.RAINBOW) ? this.O() : this.b.q();
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicsRenderingUtility.a(customSystemException);
                }
                String string2 = string;
                double d6 = cryptographicParameterGenerator.B(string2);
                this.D = cryptographicParameterGenerator.D(this.O());
                d4 = this.W() + 12.5 + d6;
                double d7 = this.w() - 10.0;
                d3 = this.G() + this.Jt.t();
                try {
                    if (!this.b.equals((Object)F9.RAINBOW)) break block20;
                    cryptographicParameterGenerator.R(this.O(), this.G() + 5.0, this.W() + 5.0, this.J1);
                    break block21;
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicsRenderingUtility.a(customSystemException);
                }
            }
            cryptographicParameterGenerator.R(this.b.q(), this.G() + 5.0, this.W() + 5.0, this.J1);
        }
        if (this.JG != null) {
            d2 = cryptographicParameterGenerator.D(this.JG.O());
            this.JG.b(this.G() + this.w() - 5.0 - d2 - 2.0);
            this.JG.M(this.W() + 2.0);
            this.JG.w(10.0);
            this.JG.T(d2);
            this.JG.d(0.8);
        }
        this.JB = this.K(d3, d4 + 0.5, this.Jd.p() / 2.0);
        d2 = 5.0;
        double d8 = this.w() - d2 * 2.0;
        for (double d9 = 0.0; d9 < d8; d9 += 1.0) {
            ConfigurationManager.A(this.G() + d9 + d2, d4, 1.0, 1.0, this.z(d9, d8));
        }
        try {
            color = this.l().equals(Color.WHITE) ? this.JT.l() : this.l();
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicsRenderingUtility.a(customSystemException);
        }
        Color color2 = color;
        double d10 = this.Jd.t();
        ConfigurationManager.h((float)(this.JB.K() + this.JB.t() / 2.0 - d10 / 2.0), (float)(this.JB.q() + this.JB.V() / 2.0 - d10 / 2.0), (float)d10, 1.0f, GraphicsRenderingUtility.M.c, 12.0, color2);
    }

    @Override
    public void g() {
        try {
            if (!this.V) {
                this.Jd.c();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicsRenderingUtility.a(customSystemException);
        }
        this.V = true;
    }

    public GraphicsRenderingUtility(F9 f9, AdaptiveRenderingEngine adaptiveRenderingEngine, String string, double d2) {
        super(string);
        this.J3 = 255.0;
        this.D = 0.0;
        this.Jt = new NumericStreamProcessor(0.0, 0.0, 0.0);
        this.Jd = new NumericStreamProcessor(0.15, 7.0, 8.0);
        this.J6 = 0.75;
        this.JX = -1.0;
        this.JB = new MetricsCalculationEngine(0.0, 0.0, 0.0, 0.0);
        this.J1 = GraphicsRenderingUtility.M.n;
        this.JC = -1.0;
        this.E = adaptiveRenderingEngine;
        this.b = f9;
        this.J9 = d2;
        this.Jr = (this.J3 - this.Jo) / 100.0;
        if (f9.equals((Object)F9.RAINBOW)) {
            // empty if block
        }
        this.JK = (float)(this.J3 / adaptiveRenderingEngine.Y());
    }

    public void i(double d2) {
        this.J3 = d2;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (eb[n4] != null) {
            return n4;
        }
        Object object = db[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 42;
                break;
            }
            case 1: {
                n3 = 21;
                break;
            }
            case 2: {
                n3 = 58;
                break;
            }
            case 3: {
                n3 = 59;
                break;
            }
            case 4: {
                n3 = 8;
                break;
            }
            case 5: {
                n3 = 0;
                break;
            }
            case 6: {
                n3 = 31;
                break;
            }
            case 7: {
                n3 = 63;
                break;
            }
            case 8: {
                n3 = 62;
                break;
            }
            case 9: {
                n3 = 44;
                break;
            }
            case 10: {
                n3 = 30;
                break;
            }
            case 11: {
                n3 = 40;
                break;
            }
            case 12: {
                n3 = 46;
                break;
            }
            case 13: {
                n3 = 35;
                break;
            }
            case 14: {
                n3 = 54;
                break;
            }
            case 15: {
                n3 = 52;
                break;
            }
            case 16: {
                n3 = 51;
                break;
            }
            case 17: {
                n3 = 50;
                break;
            }
            case 18: {
                n3 = 5;
                break;
            }
            case 19: {
                n3 = 45;
                break;
            }
            case 20: {
                n3 = 49;
                break;
            }
            case 21: {
                n3 = 37;
                break;
            }
            case 22: {
                n3 = 13;
                break;
            }
            case 23: {
                n3 = 39;
                break;
            }
            case 24: {
                n3 = 48;
                break;
            }
            case 25: {
                n3 = 61;
                break;
            }
            case 26: {
                n3 = 25;
                break;
            }
            case 27: {
                n3 = 2;
                break;
            }
            case 28: {
                n3 = 57;
                break;
            }
            case 29: {
                n3 = 32;
                break;
            }
            case 30: {
                n3 = 22;
                break;
            }
            case 31: {
                n3 = 17;
                break;
            }
            case 32: {
                n3 = 24;
                break;
            }
            case 33: {
                n3 = 33;
                break;
            }
            case 34: {
                n3 = 16;
                break;
            }
            case 35: {
                n3 = 26;
                break;
            }
            case 36: {
                n3 = 38;
                break;
            }
            case 37: {
                n3 = 20;
                break;
            }
            case 38: {
                n3 = 7;
                break;
            }
            case 39: {
                n3 = 23;
                break;
            }
            case 40: {
                n3 = 11;
                break;
            }
            case 41: {
                n3 = 6;
                break;
            }
            case 42: {
                n3 = 1;
                break;
            }
            case 43: {
                n3 = 27;
                break;
            }
            case 44: {
                n3 = 14;
                break;
            }
            case 45: {
                n3 = 18;
                break;
            }
            case 46: {
                n3 = 15;
                break;
            }
            case 47: {
                n3 = 3;
                break;
            }
            case 48: {
                n3 = 29;
                break;
            }
            case 49: {
                n3 = 10;
                break;
            }
            case 50: {
                n3 = 47;
                break;
            }
            case 51: {
                n3 = 28;
                break;
            }
            case 52: {
                n3 = 9;
                break;
            }
            case 53: {
                n3 = 4;
                break;
            }
            case 54: {
                n3 = 43;
                break;
            }
            case 55: {
                n3 = 41;
                break;
            }
            case 56: {
                n3 = 19;
                break;
            }
            case 57: {
                n3 = 53;
                break;
            }
            case 58: {
                n3 = 12;
                break;
            }
            case 59: {
                n3 = 56;
                break;
            }
            case 60: {
                n3 = 55;
                break;
            }
            case 61: {
                n3 = 36;
                break;
            }
            case 62: {
                n3 = 60;
                break;
            }
            default: {
                n3 = 34;
            }
        }
        n5 = n3;
        int[] nArray = new int[6];
        int n6 = 0;
        while (n6 < 6) {
            n2 = 7 * (5 - n6);
            n = (int)(l >>> n2 & 0x7FL);
            if ((n -= n5) < 0) {
                n += 128;
            }
            nArray[n6] = n;
            ++n6;
        }
        char[] cArray = ((String)object).toCharArray();
        n2 = 0;
        while (n2 < cArray.length) {
            n = nArray[n2 % nArray.length];
            if (n == 0) break;
            cArray[n2] = (char)(cArray[n2] ^ n);
            ++n2;
        }
        GraphicsRenderingUtility.eb[n4] = new String(cArray);
        return n4;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        ab = MultiContainerRegistry.a(-4504798535585085962L, 8236191851793518069L, MethodHandles.lookup().lookupClass()).a(207414725777926L);
        db = new Object[5];
        eb = new String[5];
        GraphicsRenderingUtility.i();
        long l = ab ^ 0x1D0D21384996L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 4969476738093777224L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                bb = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public void D(double d2) {
        this.J9 = d2;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = GraphicsRenderingUtility.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = GraphicsRenderingUtility.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = GraphicsRenderingUtility.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        String[] stringArray;
        block30: {
            block31: {
                int n;
                block26: {
                    long l;
                    block27: {
                        boolean bl;
                        AdaptiveRenderingEngine adaptiveRenderingEngine;
                        block28: {
                            block29: {
                                block24: {
                                    long l2 = ab ^ 0x520BE22C542L;
                                    stringArray = NetworkStateManager.M();
                                    try {
                                        long l3;
                                        block25: {
                                            try {
                                                try {
                                                    try {
                                                        n = this.b.equals((Object)F9.RAINBOW);
                                                        if (stringArray == null) break block24;
                                                        if (n != 0) break block25;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw GraphicsRenderingUtility.a(customSystemException);
                                                    }
                                                    n = this.b.equals((Object)F9.BLOCK_CHILD);
                                                    if (stringArray == null) break block26;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw GraphicsRenderingUtility.a(customSystemException);
                                                }
                                                if (n == 0) break block27;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw GraphicsRenderingUtility.a(customSystemException);
                                            }
                                        }
                                        n = (l3 = this.F + 300L - System.currentTimeMillis()) == 0L ? 0 : (l3 < 0L ? -1 : 1);
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GraphicsRenderingUtility.a(customSystemException);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            if (stringArray == null) break block26;
                                            if (n <= 0) break block27;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw GraphicsRenderingUtility.a(customSystemException);
                                        }
                                        adaptiveRenderingEngine = this.E;
                                        bl = this.E.j();
                                        if (stringArray == null) break block28;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GraphicsRenderingUtility.a(customSystemException);
                                    }
                                    if (bl) break block29;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GraphicsRenderingUtility.a(customSystemException);
                                }
                                bl = true;
                                break block28;
                            }
                            bl = false;
                        }
                        adaptiveRenderingEngine.n(bl);
                    }
                    n = (l = System.currentTimeMillis() - 1795321218903L) == 0L ? 0 : (l < 0L ? -1 : 1);
                }
                try {
                    if (n > 0) {
                        this.E.E(new Color(0, 0, 0, 0));
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicsRenderingUtility.a(customSystemException);
                }
                MetricsCalculationEngine metricsCalculationEngine = new MetricsCalculationEngine(this.G(), this.JB.q(), this.w(), this.JB.V());
                try {
                    try {
                        if (stringArray == null) break block30;
                        if (!metricsCalculationEngine.O(userInteractionEventDispatcher.getX(), userInteractionEventDispatcher.getY())) break block31;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicsRenderingUtility.a(customSystemException);
                    }
                    this.L = GraphicsBufferAllocator.b();
                    this.Y = true;
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicsRenderingUtility.a(customSystemException);
                }
            }
            this.F = System.currentTimeMillis();
        }
        try {
            if (stringArray == null) {
                AbstractComputationKernel.I(new String[2]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicsRenderingUtility.a(customSystemException);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public GraphicsRenderingUtility(NumericComputationResolver numericComputationResolver) {
        long l = ab ^ 0x2F0112C177BL;
        this(F9.BLOCK_CHILD, numericComputationResolver.k());
        this.JG = new VisualRenderContext((String)((Object)GraphicsRenderingUtility.b("\u00c4", (int)((int)bb), (long)-3769418844228876880L, (long)l)));
        this.JG.N(new ProcessingTaskScheduler(this, numericComputationResolver));
        this.o(this.JG);
    }

    public MetricsCalculationEngine w() {
        return this.JB;
    }

    public double p() {
        return this.J9;
    }

    private void lambda$new$0(AdaptiveRenderingEngine adaptiveRenderingEngine) {
        this.Y();
    }

    public GraphicsRenderingUtility(F9 f9, AdaptiveRenderingEngine adaptiveRenderingEngine) {
        this(f9, adaptiveRenderingEngine, adaptiveRenderingEngine.O(), 1.0);
        this.L(adaptiveRenderingEngine);
        adaptiveRenderingEngine.P(this::lambda$new$0);
        this.Y();
    }

    private static Field g(long l, long l2) {
        int n = GraphicsRenderingUtility.e(l, l2);
        Object object = db[n];
        if (object instanceof String) {
            String string = eb[n];
            int n2 = string.indexOf(8);
            Class clazz = GraphicsRenderingUtility.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = GraphicsRenderingUtility.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = GraphicsRenderingUtility.c(clazz3, string2, clazz2)) != null) {
                    GraphicsRenderingUtility.db[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = GraphicsRenderingUtility.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        GraphicsRenderingUtility.db[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = GraphicsRenderingUtility.f(250612242842838L, 0L);
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
                        d5 = (Double)((ConfigurationProfileResolver)this.E.A()).J() / this.J3;
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
                        catch (CustomSystemException customSystemException) {
                            throw GraphicsRenderingUtility.a(customSystemException);
                        }
                        if (!this.E.j()) break block15;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicsRenderingUtility.a(customSystemException);
                    }
                    if (d5 != 0.0) break block15;
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicsRenderingUtility.a(customSystemException);
                }
                d2 = 0.0;
                break block15;
            }
            try {
                if (!this.E.j() || !this.E.i()) break block15;
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicsRenderingUtility.a(customSystemException);
            }
            d2 = 1.0;
        }
        this.Jt = new NumericStreamProcessor(d2, d3, d4);
        this.JX = d5;
        this.Jt.o();
    }

    @Override
    public double e() {
        return 110.0;
    }

    public void M(AbstractComputationKernel abstractComputationKernel) {
        this.JT = abstractComputationKernel;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = GraphicsRenderingUtility.e(l, l2);
            object = db[n];
            try {
                if (!(object instanceof String)) break block2;
                GraphicsRenderingUtility.db[n] = clazz = Class.forName(eb[n]);
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
        GraphicsRenderingUtility.eb[1] = "java/lang/Integer";
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
            return MethodHandles.lookup().findStatic(GraphicsRenderingUtility.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

