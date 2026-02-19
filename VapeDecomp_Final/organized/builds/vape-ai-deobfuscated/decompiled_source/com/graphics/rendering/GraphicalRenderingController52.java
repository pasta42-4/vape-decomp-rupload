/*
 * Decompiled with CFR 0.152.
 */
package com.graphics.rendering;

import com.analytics.computation.MetricsCalculationEngine;
import com.app.error.translation.ExceptionMappingTranslator;
import com.app.math.NumericStreamProcessor;
import com.app.workflow.StateTrackingCoordinator;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.geospatial.calculation.GeographicalPositionCalculator;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.security.constants.CipherConfigurationMode;
import com.security.crypto.CryptographicParameterGenerator;
import com.security.protocols.CryptoAlgorithmSpecification;
import com.spatial.mapping.CoordinateMapper;
import com.system.configuration.ConfigurationManager;
import com.system.diagnostics.SystemDiagnosticAnalyzer;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.events.UserInteractionEventDispatcher;
import com.util.numeric.NumericFormattingUtility;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class GraphicalRenderingController52
extends GeographicalPositionCalculator {
    private static final Integer[] db;
    private static final Object[] fb;
    private int V;
    private final Color XB;
    private static final long ab;
    private final ExceptionMappingTranslator X5;
    private double XC;
    private static final Map eb;
    private NumericFormattingUtility Xl;
    private double XL;
    private int XE;
    private static final String[] jb;
    private MetricsCalculationEngine Xy;
    private double X8;
    private MetricsCalculationEngine XK;
    private double Xr;
    private double b;
    private final double XR = 0.75;
    private double X4;
    private final NumericStreamProcessor XG;
    private NumericStreamProcessor Xe;
    private static final long[] bb;
    private double F;
    private final double E;
    private final NumericStreamProcessor X0;
    private NumericStreamProcessor Xk;
    private final double Xi;
    double Xu;
    private final ExceptionMappingTranslator D;

    private static Method h(long l, long l2) {
        int n = GraphicalRenderingController52.e(l, l2);
        Object object = fb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = jb[n];
                int n3 = string2.indexOf(8);
                clazz3 = GraphicalRenderingController52.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = GraphicalRenderingController52.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = GraphicalRenderingController52.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        GraphicalRenderingController52.fb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = GraphicalRenderingController52.f(249097650371483L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = GraphicalRenderingController52.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        GraphicalRenderingController52.fb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = GraphicalRenderingController52.f(249097650371483L, 0L);
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

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = GraphicalRenderingController52.e(l, l2);
            object = fb[n];
            try {
                if (!(object instanceof String)) break block2;
                GraphicalRenderingController52.fb[n] = clazz = Class.forName(jb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
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

    public GraphicalRenderingController52(NumericFormattingUtility numericFormattingUtility) {
        this(numericFormattingUtility.O(), numericFormattingUtility.j(), numericFormattingUtility.g(), numericFormattingUtility.m(), numericFormattingUtility.G(), numericFormattingUtility.q());
        this.Xl = numericFormattingUtility;
        this.L(numericFormattingUtility);
        numericFormattingUtility.P(this::lambda$new$0);
        this.Q(true);
    }

    @Override
    public double z() {
        return 20.0 + this.E + this.Xu;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c6' || c == 'S' || c == '\u00ea' || c == '\u00d3') {
                field = GraphicalRenderingController52.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c6' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'S' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ea' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = GraphicalRenderingController52.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00cd' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'x' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
    public void U() {
    }

    @Override
    public void g() {
        block14: {
            long l;
            block15: {
                CoordinateMapper coordinateMapper;
                block12: {
                    block13: {
                        l = ab ^ 0x20C57A6F04EFL;
                        coordinateMapper = GraphicsBufferAllocator.b();
                        try {
                            try {
                                try {
                                    if (!this.XK.T(coordinateMapper) || this.V == 1) break block12;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GraphicalRenderingController52.a(customSystemException);
                                }
                                if (this.V != 2) break block13;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicalRenderingController52.a(customSystemException);
                            }
                            this.XG.c();
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GraphicalRenderingController52.a(customSystemException);
                        }
                    }
                    this.V = 1;
                    this.X0.c();
                    break block14;
                }
                try {
                    try {
                        try {
                            if (!this.Xy.T(coordinateMapper) || this.V == 2) break block14;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GraphicalRenderingController52.a(customSystemException);
                        }
                        if (this.V != 1) break block15;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicalRenderingController52.a(customSystemException);
                    }
                    this.X0.c();
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicalRenderingController52.a(customSystemException);
                }
            }
            this.V = (int)GraphicalRenderingController52.b("a", (int)25460, (long)(0x11F32E63DC4457B5L ^ l));
            this.XG.c();
        }
    }

    public GraphicalRenderingController52(String string, double d2, double d3, double d4, double d5, double d6) {
        block4: {
            block3: {
                long l = ab ^ 0x4B1B2ED24860L;
                super(string);
                this.XR = 0.75;
                this.Xe = new NumericStreamProcessor(0.0, 0.0, 0.0);
                this.Xk = new NumericStreamProcessor(0.0, 0.0, 0.0);
                this.X0 = new NumericStreamProcessor(0.15, 8.0, 9.0);
                this.XG = new NumericStreamProcessor(0.15, 8.0, 9.0);
                this.XC = -1.0;
                this.F = -1.0;
                this.XK = new MetricsCalculationEngine(0.0, 0.0, 0.0, 0.0);
                this.Xy = new MetricsCalculationEngine(0.0, 0.0, 0.0, 0.0);
                this.XB = GraphicalRenderingController52.M.n;
                this.b = d2;
                this.X4 = d3;
                this.XL = d4;
                this.Xi = (d3 - d2) / 100.0;
                this.E = (double)(string.split((String)((Object)GraphicalRenderingController52.c("x", (int)GraphicalRenderingController52.b("a", (int)8613, (long)(0x5AD322540E1B59E1L ^ l)), (long)-2042596820760204192L, (long)l))).length - 1) * this.J().B(string) + 5.0;
                if (d5 == 1.0) {
                    try {
                        if (d6 != 1.0) break block3;
                        this.p();
                        break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicalRenderingController52.a(customSystemException);
                    }
                }
            }
            this.X8 = d5;
            this.Xr = d6;
        }
        this.X5 = new ExceptionMappingTranslator(this, CryptoAlgorithmSpecification.MINIMUM);
        this.D = new ExceptionMappingTranslator(this, CryptoAlgorithmSpecification.MAXIMUM);
        this.o(this.X5, this.D);
    }

    private void p() {
        double d2 = (this.X4 + this.b) / 2.0;
        this.X8 = d2 - this.b;
        this.Xr = d2 + this.b;
        double d3 = this.X8 % this.XL;
        try {
            if (d3 != 0.0) {
                this.X8 -= d3;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalRenderingController52.a(customSystemException);
        }
        double d4 = this.Xr % this.XL;
        try {
            if (d4 != 0.0) {
                this.Xr -= d4;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalRenderingController52.a(customSystemException);
        }
    }

    public double p() {
        return this.X8;
    }

    public NumericFormattingUtility s() {
        return this.Xl;
    }

    @Override
    public void G() {
        double d2;
        long l = ab ^ 0x5A09744D7CCL;
        this.R();
        this.S();
        CryptographicParameterGenerator cryptographicParameterGenerator = this.L(0.75);
        double d3 = cryptographicParameterGenerator.B(this.O());
        double d4 = this.W() + 12.5 + (double)((float)d3);
        double d5 = this.W() + 5.0;
        this.H();
        double d6 = (double)(this.O().split((String)((Object)GraphicalRenderingController52.c("x", (int)GraphicalRenderingController52.b("a", (int)9322, (long)(0x6608F70F9BA24381L ^ l)), (long)8938365122890986444L, (long)l))).length - 1) * (cryptographicParameterGenerator.B(this.O()) + 3.0);
        d4 += d6;
        this.D.b(this.G() + this.w() - 5.0 - this.D.w());
        this.D.M(d5 += d6);
        StateTrackingCoordinator.d(GraphicalRenderingController52.M.K, (int)(this.G() + this.w() - 5.0 - this.D.w() - 8.0), (int)d5, (String)((Object)GraphicalRenderingController52.c("x", (int)GraphicalRenderingController52.b("a", (int)10645, (long)(0x7AE3E7438D814E78L ^ l)), (long)8938365122890986444L, (long)l)), 0.1f, false);
        this.X5.b(this.G() + this.w() - 10.0 - this.X5.w() - this.D.w() - 8.0);
        this.X5.M(d5);
        this.XK = this.K(this.G() + this.Xe.t(), (d4 += this.Xu / 2.0) + 0.5, this.X0.t() / 2.0);
        this.Xy = this.K(this.G() + this.Xk.t(), d4 + 0.5, this.XG.t() / 2.0);
        this.XK.q(this.XK.t() / 2.0);
        this.Xy.q(this.Xy.t() / 2.0);
        this.Xy.U(this.Xy.K() + this.Xy.t());
        double d7 = this.XK.K() - this.G() - this.J();
        double d8 = this.Xy.K() - this.XK.K();
        double d9 = this.G() + this.w() - this.Xy.K() - 5.0;
        try {
            if (d7 > 0.0) {
                ConfigurationManager.o(this.G() + this.J(), d4 + 0.5, d7 - 1.5, 1.0, GraphicalRenderingController52.M.S, false, 0.5f, 1.0f);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalRenderingController52.a(customSystemException);
        }
        if (d8 > 0.0) {
            d2 = (this.X0.t() - this.X0.n()) / 2.0;
            ConfigurationManager.o(this.XK.K() + 6.0 + d2, d4 + 0.5, d8 - 1.5 - 6.0 - d2, 1.0, M.j(), false, 0.5f, 1.0f);
        }
        if (d9 > 0.0) {
            d2 = (this.XG.t() - this.XG.n()) / 2.0;
            ConfigurationManager.o(this.Xy.K() + 6.0 + d2, d4 + 0.5, d9 - 6.0 - d2, 1.0, GraphicalRenderingController52.M.S, false, 0.5f, 1.0f);
        }
        ConfigurationManager.x((String)((Object)GraphicalRenderingController52.c("x", (int)GraphicalRenderingController52.b("a", (int)7394, (long)(0x3351EEF9D3AA7B08L ^ l)), (long)8938365122890986444L, (long)l)), this.XK.K() + this.XK.t(), d4 + 0.5, this.X0.t(), this.X0.t(), M.j());
        ConfigurationManager.x((String)((Object)GraphicalRenderingController52.c("x", (int)GraphicalRenderingController52.b("a", (int)9197, (long)(0x302A5B57315EC401L ^ l)), (long)8938365122890986444L, (long)l)), this.Xy.K() + this.Xy.t(), d4 + 0.5, this.XG.t(), this.XG.t(), M.j());
    }

    public void H(double d2) {
        this.XL = d2;
    }

    private void R() {
        block17: {
            block21: {
                double d2;
                block19: {
                    block20: {
                        block18: {
                            try {
                                try {
                                    if (this.XE == 0) break block17;
                                    if (SystemDiagnosticAnalyzer.A(CipherConfigurationMode.LEFT_CLICK.ordinal())) break block18;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GraphicalRenderingController52.a(customSystemException);
                                }
                                this.XE = 0;
                                return;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicalRenderingController52.a(customSystemException);
                            }
                        }
                        double d3 = this.w() - (10.0 + this.J()) - this.XK.t() - this.Xy.t();
                        double d4 = (double)this.L.X - this.G() + this.f() - this.J();
                        if (this.XE == 2) {
                            d4 -= 12.0;
                        }
                        if (this.XE == 1) {
                            d4 -= 2.0;
                        }
                        d2 = this.G(this.b, this.X4, d3, this.XL, this.Xi, d4);
                        double d5 = this.XL;
                        int n = 0;
                        while (d5 % 1.0 != 0.0) {
                            ++n;
                            d5 *= 10.0;
                        }
                        d2 = new BigDecimal("" + d2).setScale(n, RoundingMode.HALF_UP).doubleValue();
                        if (d2 < this.b) {
                            d2 = this.b;
                        } else if (d2 > this.X4) {
                            d2 = this.X4;
                        }
                        try {
                            try {
                                if (this.XE != 1) break block19;
                                if (d2 != this.XC) break block20;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicalRenderingController52.a(customSystemException);
                            }
                            return;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GraphicalRenderingController52.a(customSystemException);
                        }
                    }
                    this.Xl.n(d2);
                    break block21;
                }
                try {
                    if (d2 == this.F) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicalRenderingController52.a(customSystemException);
                }
                this.Xl.R(d2);
            }
            this.XC = this.Xl.G();
            this.F = this.Xl.q();
        }
    }

    public void A(double d2) {
        this.X4 = d2;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1BE0;
        if (db[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = bb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])eb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    eb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/bL", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            GraphicalRenderingController52.db[n2] = n3;
        }
        return db[n2];
    }

    public double u() {
        return this.b;
    }

    public void B(double d2) {
        this.b = d2;
    }

    public GraphicalRenderingController52(String string, double d2, double d3, double d4) {
        this(string, d2, d3, d4, 1.0, 1.0);
    }

    public void p(double d2) {
        this.Xr = d2;
    }

    private static void i() {
        Object[] objectArray = fb;
        fb[0] = "/[7";
        objectArray[1] = Integer.TYPE;
        GraphicalRenderingController52.jb[1] = "java/lang/Integer";
        objectArray[2] = ")J?95_\"E.vHG1B'?";
        objectArray[3] = "GT\u0015V}\u001bL[\u0004\u0019\u001c\u0015GP\u0000C";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0017X\u000e\u0007\u001c}\u0007@\u0007|\ba~\u001d\b\u001aYp\u001c\u0019S\u0002\u001d\u001aD\u001cQ\f\u0019%\u000e\u001fL@c";
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = GraphicalRenderingController52.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = GraphicalRenderingController52.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @Override
    public void d() {
        switch (this.V) {
            case 1: {
                CoordinateMapper coordinateMapper = GraphicsBufferAllocator.b();
                try {
                    if (this.XK.T(coordinateMapper)) break;
                    this.V = 0;
                    this.X0.c();
                    break;
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicalRenderingController52.a(customSystemException);
                }
            }
            case 2: {
                CoordinateMapper coordinateMapper = GraphicsBufferAllocator.b();
                try {
                    if (this.Xy.T(coordinateMapper)) break;
                    this.V = 0;
                    this.XG.c();
                    break;
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicalRenderingController52.a(customSystemException);
                }
            }
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bL" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void Y(double d2) {
        try {
            if (this.w() == d2) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalRenderingController52.a(customSystemException);
        }
        super.Y(d2);
        this.Q(true);
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        block9: {
            MetricsCalculationEngine metricsCalculationEngine;
            long l;
            block8: {
                l = ab ^ 0x26B3B769B24EL;
                double d2 = this.Xy.K() - this.XK.K();
                double d3 = this.XK.K() - this.G() + d2 / 2.0;
                MetricsCalculationEngine metricsCalculationEngine2 = new MetricsCalculationEngine(this.G(), this.XK.q(), d3, this.XK.V());
                metricsCalculationEngine = new MetricsCalculationEngine(this.Xy.K() - d2 / 2.0, this.Xy.q(), this.w() - d3, this.Xy.V());
                try {
                    if (!metricsCalculationEngine2.O(userInteractionEventDispatcher.getX(), userInteractionEventDispatcher.getY())) break block8;
                    this.XE = 1;
                    break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicalRenderingController52.a(customSystemException);
                }
            }
            try {
                if (metricsCalculationEngine.O(userInteractionEventDispatcher.getX(), userInteractionEventDispatcher.getY())) {
                    this.XE = (int)GraphicalRenderingController52.b("a", (int)14008, (long)(0x1065AE417DF7B4D4L ^ l));
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalRenderingController52.a(customSystemException);
            }
        }
        try {
            if (this.XE != 0) {
                this.L = GraphicsBufferAllocator.b();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalRenderingController52.a(customSystemException);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                GraphicalRenderingController52.ab = MultiContainerRegistry.a(-8186612232623814583L, -5164870678889216667L, MethodHandles.lookup().lookupClass()).a(143065403186441L);
                GraphicalRenderingController52.fb = new Object[5];
                GraphicalRenderingController52.jb = new String[5];
                GraphicalRenderingController52.i();
                GraphicalRenderingController52.eb = new HashMap<K, V>(13);
                var0 = GraphicalRenderingController52.ab ^ 80532864158064L;
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
                var6_5 = "\u00aa\u00c8\u00c7\u0007\u00fa\u00827\u0093\u001e\u00851d\u00e5e\u00c3L\u0019$\u00e2:\u00a0\u00f0\u009f\u00f3\u0090\u00b2!\u00d2\u0016[h[\u009c\u008d\u00bcC3Hi\u00e7\u0099\u00bf\u00c8>Cu\rE\u00df\u00b5\u00cbs\u00ef\u00e6\u00e0\u00f1\u00f7\u00a1\u00ca_27w\u00be\u00ef\u00cc:\u000f#\u00b9\u008a3";
                var7_6 = "\u00aa\u00c8\u00c7\u0007\u00fa\u00827\u0093\u001e\u00851d\u00e5e\u00c3L\u0019$\u00e2:\u00a0\u00f0\u009f\u00f3\u0090\u00b2!\u00d2\u0016[h[\u009c\u008d\u00bcC3Hi\u00e7\u0099\u00bf\u00c8>Cu\rE\u00df\u00b5\u00cbs\u00ef\u00e6\u00e0\u00f1\u00f7\u00a1\u00ca_27w\u00be\u00ef\u00cc:\u000f#\u00b9\u008a3".length();
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
                    var6_5 = "w\u00fa\u008d\"\u0083\u00b9v\u00c9\u00df\u00e9i\u00cf\u00d0\u0007\u001a\u00bc";
                    var7_6 = "w\u00fa\u008d\"\u0083\u00b9v\u00c9\u00df\u00e9i\u00cf\u00d0\u0007\u001a\u00bc".length();
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
        GraphicalRenderingController52.bb = var8_3;
        GraphicalRenderingController52.db = new Integer[11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = GraphicalRenderingController52.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public double e() {
        return 110.0;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (jb[n4] != null) {
            return n4;
        }
        Object object = fb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 30;
                break;
            }
            case 1: {
                n3 = 53;
                break;
            }
            case 2: {
                n3 = 44;
                break;
            }
            case 3: {
                n3 = 58;
                break;
            }
            case 4: {
                n3 = 48;
                break;
            }
            case 5: {
                n3 = 1;
                break;
            }
            case 6: {
                n3 = 41;
                break;
            }
            case 7: {
                n3 = 59;
                break;
            }
            case 8: {
                n3 = 2;
                break;
            }
            case 9: {
                n3 = 52;
                break;
            }
            case 10: {
                n3 = 31;
                break;
            }
            case 11: {
                n3 = 63;
                break;
            }
            case 12: {
                n3 = 45;
                break;
            }
            case 13: {
                n3 = 16;
                break;
            }
            case 14: {
                n3 = 43;
                break;
            }
            case 15: {
                n3 = 7;
                break;
            }
            case 16: {
                n3 = 29;
                break;
            }
            case 17: {
                n3 = 6;
                break;
            }
            case 18: {
                n3 = 54;
                break;
            }
            case 19: {
                n3 = 19;
                break;
            }
            case 20: {
                n3 = 20;
                break;
            }
            case 21: {
                n3 = 37;
                break;
            }
            case 22: {
                n3 = 15;
                break;
            }
            case 23: {
                n3 = 8;
                break;
            }
            case 24: {
                n3 = 57;
                break;
            }
            case 25: {
                n3 = 21;
                break;
            }
            case 26: {
                n3 = 49;
                break;
            }
            case 27: {
                n3 = 62;
                break;
            }
            case 28: {
                n3 = 14;
                break;
            }
            case 29: {
                n3 = 11;
                break;
            }
            case 30: {
                n3 = 9;
                break;
            }
            case 31: {
                n3 = 28;
                break;
            }
            case 32: {
                n3 = 34;
                break;
            }
            case 33: {
                n3 = 33;
                break;
            }
            case 34: {
                n3 = 60;
                break;
            }
            case 35: {
                n3 = 38;
                break;
            }
            case 36: {
                n3 = 27;
                break;
            }
            case 37: {
                n3 = 25;
                break;
            }
            case 38: {
                n3 = 18;
                break;
            }
            case 39: {
                n3 = 56;
                break;
            }
            case 40: {
                n3 = 32;
                break;
            }
            case 41: {
                n3 = 47;
                break;
            }
            case 42: {
                n3 = 46;
                break;
            }
            case 43: {
                n3 = 22;
                break;
            }
            case 44: {
                n3 = 42;
                break;
            }
            case 45: {
                n3 = 17;
                break;
            }
            case 46: {
                n3 = 13;
                break;
            }
            case 47: {
                n3 = 50;
                break;
            }
            case 48: {
                n3 = 12;
                break;
            }
            case 49: {
                n3 = 51;
                break;
            }
            case 50: {
                n3 = 40;
                break;
            }
            case 51: {
                n3 = 55;
                break;
            }
            case 52: {
                n3 = 5;
                break;
            }
            case 53: {
                n3 = 0;
                break;
            }
            case 54: {
                n3 = 61;
                break;
            }
            case 55: {
                n3 = 24;
                break;
            }
            case 56: {
                n3 = 36;
                break;
            }
            case 57: {
                n3 = 10;
                break;
            }
            case 58: {
                n3 = 23;
                break;
            }
            case 59: {
                n3 = 26;
                break;
            }
            case 60: {
                n3 = 35;
                break;
            }
            case 61: {
                n3 = 4;
                break;
            }
            case 62: {
                n3 = 39;
                break;
            }
            default: {
                n3 = 3;
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
        GraphicalRenderingController52.jb[n4] = new String(cArray);
        return n4;
    }

    public double A() {
        return this.XL;
    }

    private void Q(boolean bl) {
        float f = (float)this.X0.p();
        double d2 = this.w() - (this.J() + 5.0);
        double d3 = (this.Xl.G() - this.b) / (this.X4 - this.b);
        double d4 = 1.0 - (this.Xl.q() - this.b) / (this.X4 - this.b);
        if (d3 > 1.0) {
            d3 = 1.0;
        } else if (d3 < 0.0) {
            d3 = 0.0;
        }
        if (d4 > 1.0) {
            d4 = 1.0;
        } else if (d4 < 0.0) {
            d4 = 0.0;
        }
        double d5 = 1.0 - (d3 + d4);
        double d6 = d3 * (d2 - (double)f - 5.0) + this.J() + (double)(f / 2.0f);
        double d7 = d6 + 5.0 + d5 * (d2 - (double)f - 5.0);
        double d8 = this.Xe.t();
        double d9 = this.Xk.t();
        try {
            this.Xe = new NumericStreamProcessor(0.05, d8, d6);
            this.Xe.o();
            this.Xk = new NumericStreamProcessor(0.05, d9, d7);
            this.Xk.o();
            if (bl) {
                this.Xe.L();
                this.Xk.L();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalRenderingController52.a(customSystemException);
        }
    }

    public double I() {
        return this.X4;
    }

    public void X(double d2) {
        this.X8 = d2;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public double c() {
        return this.Xr;
    }

    protected void H() {
        double d2 = -6.0;
        CryptographicParameterGenerator cryptographicParameterGenerator = this.L(0.75);
        List<String> list = this.a();
        double d3 = this.W() + 5.0;
        for (String string : list) {
            double d4 = cryptographicParameterGenerator.B(string);
            cryptographicParameterGenerator.R(string, this.G() + this.J(), d3, this.XB);
            d3 += d4;
            d2 += d4;
        }
        this.Xu = d2;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = GraphicalRenderingController52.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = GraphicalRenderingController52.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = GraphicalRenderingController52.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bL" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void lambda$new$0(NumericFormattingUtility numericFormattingUtility) {
        this.Q(false);
    }

    private static Field g(long l, long l2) {
        int n = GraphicalRenderingController52.e(l, l2);
        Object object = fb[n];
        if (object instanceof String) {
            String string = jb[n];
            int n2 = string.indexOf(8);
            Class clazz = GraphicalRenderingController52.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = GraphicalRenderingController52.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = GraphicalRenderingController52.c(clazz3, string2, clazz2)) != null) {
                    GraphicalRenderingController52.fb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = GraphicalRenderingController52.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        GraphicalRenderingController52.fb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = GraphicalRenderingController52.f(249097650371483L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private List<String> a() {
        long l = ab ^ 0x7C59199CD616L;
        CryptographicParameterGenerator cryptographicParameterGenerator = this.L(0.75);
        String string = TemporalMetadataResolver.h.e().l().D(this.O());
        String[] stringArray = string.split((String)((Object)GraphicalRenderingController52.c("x", (int)GraphicalRenderingController52.b("a", (int)8799, (long)(0x4C7CEE7BE9A0C466L ^ l)), (long)9066038800377999894L, (long)l)));
        double d2 = this.X5.G() - this.G();
        ArrayList<String> arrayList = new ArrayList<String>();
        double d3 = 0.0;
        String string2 = "";
        for (String string3 : stringArray) {
            double d4 = d3 + cryptographicParameterGenerator.D(string3 + (String)((Object)GraphicalRenderingController52.c("x", (int)GraphicalRenderingController52.b("a", (int)1861, (long)(0x47C5CB5D0F3F6170L ^ l)), (long)9066038800377999894L, (long)l)));
            if (d4 > d2) {
                d3 = 0.0;
                arrayList.add(string2);
                string2 = string3 + (String)((Object)GraphicalRenderingController52.c("x", (int)GraphicalRenderingController52.b("a", (int)25675, (long)(0x63E5D81DD0D38271L ^ l)), (long)9066038800377999894L, (long)l));
                continue;
            }
            d3 = d4;
            string2 = string2 + string3 + (String)((Object)GraphicalRenderingController52.c("x", (int)GraphicalRenderingController52.b("a", (int)9590, (long)(0x6EB67C9CA606C345L ^ l)), (long)9066038800377999894L, (long)l));
        }
        arrayList.add(string2);
        return arrayList;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(GraphicalRenderingController52.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(GraphicalRenderingController52.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

