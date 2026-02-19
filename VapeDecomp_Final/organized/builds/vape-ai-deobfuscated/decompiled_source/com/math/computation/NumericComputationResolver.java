/*
 * Decompiled with CFR 0.152.
 */
package com.math.computation;

import com.analytics.computation.MetricsCalculationEngine;
import com.app.graphics.rendering.ColorPaletteRenderer;
import com.app.math.NumericStreamProcessor;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.geospatial.calculation.GeographicalPositionCalculator;
import com.rendering.adaptive.AdaptiveRenderingEngine;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.security.constants.CipherConfigurationMode;
import com.security.crypto.CryptographicParameterGenerator;
import com.spatial.mapping.CoordinateMapper;
import com.system.configuration.ConfigurationManager;
import com.system.diagnostics.SystemDiagnosticAnalyzer;
import com.ui.events.UserInteractionEventDispatcher;
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
public class NumericComputationResolver
extends GeographicalPositionCalculator {
    protected int PD;
    protected NumericStreamProcessor PU = new NumericStreamProcessor(0.15, 7.0, 8.0);
    private double P_ = 0.75;
    private int PQ;
    private double b = 0.0;
    private static final String[] lb;
    private boolean Po;
    private boolean Pm;
    protected MetricsCalculationEngine V = new MetricsCalculationEngine(0.0, 0.0, 0.0, 0.0);
    private static final long ab;
    private NumericStreamProcessor PB = new NumericStreamProcessor(0.0, 0.0, 0.0);
    private static final long[] db;
    private double PN;
    private double Pf;
    private Color[] D;
    private static final Object[] kb;
    private ColorPaletteRenderer E = new ColorPaletteRenderer(0.0, Color.BLACK, Color.BLACK);
    private double Pv = 0.0;
    private static final Integer[] eb;
    private static final Map fb;
    private boolean Pn;
    private AdaptiveRenderingEngine F;
    private double Ph = 1.0;
    private Color Pc;

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = NumericComputationResolver.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public double e() {
        return 110.0;
    }

    public void c(double d2) {
        this.Pf = d2;
    }

    @Override
    public AdaptiveRenderingEngine k() {
        return this.F;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6F8C;
        if (eb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = db[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])fb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    fb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/bS", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            NumericComputationResolver.eb[n2] = n3;
        }
        return eb[n2];
    }

    public void h(boolean bl) {
        this.Po = bl;
    }

    public Color[] G() {
        return this.D;
    }

    public void o(double d2) {
        this.b = d2;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (lb[n4] != null) {
            return n4;
        }
        Object object = kb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 1;
                break;
            }
            case 1: {
                n3 = 48;
                break;
            }
            case 2: {
                n3 = 39;
                break;
            }
            case 3: {
                n3 = 45;
                break;
            }
            case 4: {
                n3 = 21;
                break;
            }
            case 5: {
                n3 = 24;
                break;
            }
            case 6: {
                n3 = 25;
                break;
            }
            case 7: {
                n3 = 3;
                break;
            }
            case 8: {
                n3 = 55;
                break;
            }
            case 9: {
                n3 = 62;
                break;
            }
            case 10: {
                n3 = 35;
                break;
            }
            case 11: {
                n3 = 47;
                break;
            }
            case 12: {
                n3 = 61;
                break;
            }
            case 13: {
                n3 = 5;
                break;
            }
            case 14: {
                n3 = 42;
                break;
            }
            case 15: {
                n3 = 58;
                break;
            }
            case 16: {
                n3 = 36;
                break;
            }
            case 17: {
                n3 = 15;
                break;
            }
            case 18: {
                n3 = 49;
                break;
            }
            case 19: {
                n3 = 20;
                break;
            }
            case 20: {
                n3 = 12;
                break;
            }
            case 21: {
                n3 = 17;
                break;
            }
            case 22: {
                n3 = 32;
                break;
            }
            case 23: {
                n3 = 44;
                break;
            }
            case 24: {
                n3 = 14;
                break;
            }
            case 25: {
                n3 = 53;
                break;
            }
            case 26: {
                n3 = 19;
                break;
            }
            case 27: {
                n3 = 38;
                break;
            }
            case 28: {
                n3 = 18;
                break;
            }
            case 29: {
                n3 = 16;
                break;
            }
            case 30: {
                n3 = 34;
                break;
            }
            case 31: {
                n3 = 52;
                break;
            }
            case 32: {
                n3 = 50;
                break;
            }
            case 33: {
                n3 = 40;
                break;
            }
            case 34: {
                n3 = 28;
                break;
            }
            case 35: {
                n3 = 41;
                break;
            }
            case 36: {
                n3 = 8;
                break;
            }
            case 37: {
                n3 = 31;
                break;
            }
            case 38: {
                n3 = 22;
                break;
            }
            case 39: {
                n3 = 29;
                break;
            }
            case 40: {
                n3 = 56;
                break;
            }
            case 41: {
                n3 = 9;
                break;
            }
            case 42: {
                n3 = 23;
                break;
            }
            case 43: {
                n3 = 33;
                break;
            }
            case 44: {
                n3 = 7;
                break;
            }
            case 45: {
                n3 = 6;
                break;
            }
            case 46: {
                n3 = 0;
                break;
            }
            case 47: {
                n3 = 43;
                break;
            }
            case 48: {
                n3 = 54;
                break;
            }
            case 49: {
                n3 = 4;
                break;
            }
            case 50: {
                n3 = 26;
                break;
            }
            case 51: {
                n3 = 2;
                break;
            }
            case 52: {
                n3 = 59;
                break;
            }
            case 53: {
                n3 = 27;
                break;
            }
            case 54: {
                n3 = 11;
                break;
            }
            case 55: {
                n3 = 37;
                break;
            }
            case 56: {
                n3 = 60;
                break;
            }
            case 57: {
                n3 = 51;
                break;
            }
            case 58: {
                n3 = 46;
                break;
            }
            case 59: {
                n3 = 30;
                break;
            }
            case 60: {
                n3 = 10;
                break;
            }
            case 61: {
                n3 = 13;
                break;
            }
            case 62: {
                n3 = 63;
                break;
            }
            default: {
                n3 = 57;
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
        NumericComputationResolver.lb[n4] = new String(cArray);
        return n4;
    }

    @Override
    public void N(boolean bl) {
        super.N(bl);
        this.Po = false;
    }

    public void Z() {
        if (!this.k()) {
            int n = 0;
            while (true) {
                block8: {
                    block9: {
                        try {
                            try {
                                try {
                                    if (n >= this.D.length) break;
                                    if (!this.F.g(this.D[n])) break block8;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw NumericComputationResolver.a(customSystemException);
                                }
                                this.PD = n;
                                if (this.PD == this.PQ) break block9;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NumericComputationResolver.a(customSystemException);
                            }
                            this.R();
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NumericComputationResolver.a(customSystemException);
                        }
                    }
                    this.PQ = this.PD;
                }
                ++n;
            }
        }
    }

    public Color q(double d2) {
        Color color;
        block7: {
            Color color2;
            block9: {
                block8: {
                    double d3 = (this.p() - this.Q()) / (double)this.D.length;
                    double d4 = this.Q();
                    color = Color.BLACK;
                    boolean bl = false;
                    for (int i = 0; i < this.D.length; ++i) {
                        double d5 = d4 + (double)i * d3;
                        int n = i + 1;
                        double d6 = d4 + (double)n * d3;
                        try {
                            if (!(d2 > d5) || !(d2 <= d6)) continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NumericComputationResolver.a(customSystemException);
                        }
                        color = this.D[i];
                        bl = true;
                        break;
                    }
                    try {
                        try {
                            if (bl) break block7;
                            if (!(d2 <= d4)) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NumericComputationResolver.a(customSystemException);
                        }
                        color2 = this.D[0];
                        break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericComputationResolver.a(customSystemException);
                    }
                }
                color2 = this.D[this.D.length - 1];
            }
            color = color2;
        }
        return color;
    }

    public ColorPaletteRenderer s() {
        return this.E;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = NumericComputationResolver.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    @Override
    public void U() {
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    protected void q() {
        long l = ab ^ 0x7D2089F0CAA3L;
        try {
            if (this.k()) {
                ConfigurationManager.x((String)((Object)NumericComputationResolver.c("\u00d9", (int)NumericComputationResolver.b("m", (int)9203, (long)(0x492160C673EB7651L ^ l)), (long)4192077300418436591L, (long)l)), this.G() + (double)this.PB.t().floatValue() - 3.5, this.V.q() + this.V.V() / 2.0, this.V.t() - 2.0, this.V.V() - 2.0, Color.WHITE);
                ConfigurationManager.x((String)((Object)NumericComputationResolver.c("\u00d9", (int)NumericComputationResolver.b("m", (int)29148, (long)(0x5D89221EAE34247CL ^ l)), (long)4192077300418436591L, (long)l)), this.G() + (double)this.PB.t().floatValue(), this.V.q() + this.V.V() / 2.0, this.V.t() - 4.0, this.V.V() - 4.0, NumericComputationResolver.M.W);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericComputationResolver.a(customSystemException);
        }
        ConfigurationManager.x((String)((Object)NumericComputationResolver.c("\u00d9", (int)NumericComputationResolver.b("m", (int)1443, (long)(0x5CB9F07CC6475002L ^ l)), (long)4192077300418436591L, (long)l)), this.G() + (double)this.PB.t().floatValue() - 3.5, this.V.q() + this.V.V() / 2.0, this.V.t() - 2.0, this.V.V() - 2.0, this.E.k());
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = NumericComputationResolver.e(l, l2);
            object = kb[n];
            try {
                if (!(object instanceof String)) break block2;
                NumericComputationResolver.kb[n] = clazz = Class.forName(lb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public double l() {
        return this.Ph;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = NumericComputationResolver.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = NumericComputationResolver.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @Override
    public void g() {
        try {
            if (!this.Pn) {
                this.PU.c();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericComputationResolver.a(customSystemException);
        }
        this.Pn = true;
    }

    public double Q() {
        return this.b;
    }

    public void y(boolean bl) {
        this.Pm = bl;
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

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public NumericComputationResolver(String string, AdaptiveRenderingEngine adaptiveRenderingEngine, Color[] colorArray) {
        super(string);
        this.Pc = NumericComputationResolver.M.n;
        this.F = adaptiveRenderingEngine;
        this.L(adaptiveRenderingEngine);
        this.D = colorArray;
        this.Pf = colorArray.length;
        this.PN = (this.Pf - this.b) / 100.0;
        this.Z();
    }

    private static void a() {
        Object[] objectArray = kb;
        kb[0] = "[\u0010\u001f";
        objectArray[1] = Integer.TYPE;
        NumericComputationResolver.lb[1] = "java/lang/Integer";
        objectArray[2] = "u'[A\u0006}~(J\u000e{em/CG";
        objectArray[3] = "+P$:\u0007c _5ufm+T1/";
        Object[] objectArray2 = objectArray;
        objectArray[4] = ",u\\_74b\"\u000b0-1\u0010a\u0002A\u007f4*e\u001a\tFsrpQPw1qu\r0";
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = NumericComputationResolver.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = NumericComputationResolver.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public int Q() {
        return this.PD;
    }

    public double j() {
        return this.Pv;
    }

    public void q(int n) {
        Color color = this.D[n];
        this.F.E(color);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'E' || c == '\u00a3' || c == '\u00c3' || c == 'i') {
                field = NumericComputationResolver.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'E' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00a3' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = NumericComputationResolver.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '$' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public NumericStreamProcessor G() {
        return this.PB;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bS" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void B() {
        this.F.n(false);
        int n = Math.round(this.D.length / 2);
        this.F.E(this.D[n]);
        this.PD = n;
        this.R();
        this.h(false);
    }

    private static Method h(long l, long l2) {
        int n = NumericComputationResolver.e(l, l2);
        Object object = kb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = lb[n];
                int n3 = string2.indexOf(8);
                clazz3 = NumericComputationResolver.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = NumericComputationResolver.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = NumericComputationResolver.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        NumericComputationResolver.kb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = NumericComputationResolver.f(258926130129853L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = NumericComputationResolver.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        NumericComputationResolver.kb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = NumericComputationResolver.f(258926130129853L, 0L);
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

    public int W(double d2) {
        double d3 = this.w() - 10.0 - (double)this.D.length * 0.5;
        double d4 = 5.0;
        double d5 = d3 / (double)this.D.length;
        int n = 1;
        while (true) {
            block7: {
                try {
                    try {
                        try {
                            if (n >= this.D.length + 1) break;
                            if (!(d2 >= d4)) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NumericComputationResolver.a(customSystemException);
                        }
                        if (!(d2 <= d4 + d5 + 0.5)) break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericComputationResolver.a(customSystemException);
                    }
                    return n - 1;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericComputationResolver.a(customSystemException);
                }
            }
            d4 += d5 + 0.5;
            ++n;
        }
        return 0;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bS" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public MetricsCalculationEngine B() {
        return this.V;
    }

    public boolean k() {
        try {
            if (this.Po) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericComputationResolver.a(customSystemException);
        }
        for (Color color : this.D) {
            try {
                if (!this.F.g(color)) continue;
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw NumericComputationResolver.a(customSystemException);
            }
        }
        this.PD = Math.round(this.D.length / 2);
        this.R();
        this.PQ = this.PD;
        return true;
    }

    @Override
    public double z() {
        return 20.0;
    }

    @Override
    public void d() {
        block4: {
            try {
                try {
                    if (!this.Pn || this.s()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericComputationResolver.a(customSystemException);
                }
                this.PU.c();
                this.Pn = false;
            }
            catch (CustomSystemException customSystemException) {
                throw NumericComputationResolver.a(customSystemException);
            }
        }
        this.Z();
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        MetricsCalculationEngine metricsCalculationEngine = new MetricsCalculationEngine(this.G(), this.V.q(), this.w(), this.V.V());
        try {
            if (metricsCalculationEngine.O(userInteractionEventDispatcher.getX(), userInteractionEventDispatcher.getY())) {
                this.h(false);
                this.F.n(false);
                this.L = GraphicsBufferAllocator.b();
                this.Y = true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericComputationResolver.a(customSystemException);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        ab = MultiContainerRegistry.a(-7147149425087885073L, -6998294691206446730L, MethodHandles.lookup().lookupClass()).a(231146820598129L);
        kb = new Object[5];
        lb = new String[5];
        NumericComputationResolver.a();
        fb = new HashMap(13);
        long l = ab ^ 0x1ADDE651FE7EL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n = 0;
        String string = "\u0017\u00c2FM\u0012\u00fbO\u00aa\u00cap\u00ff\u00a8\u00a3\u00889b\u00b6\u00e2\u0000{\u00d96\u0094`";
        int n2 = "\u0017\u00c2FM\u0012\u00fbO\u00aa\u00cap\u00ff\u00a8\u00a3\u00889b\u00b6\u00e2\u0000{\u00d96\u0094`".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        db = lArray;
        eb = new Integer[3];
    }

    @Override
    public void G() {
        int n;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        block21: {
            double d7;
            block23: {
                block22: {
                    double d8;
                    block17: {
                        double d9;
                        block24: {
                            this.V();
                            CryptographicParameterGenerator cryptographicParameterGenerator = this.L(this.P_);
                            double d10 = cryptographicParameterGenerator.B(this.O());
                            this.Pv = cryptographicParameterGenerator.D(this.O());
                            d6 = this.W() + 12.5 + d10;
                            d5 = this.w() - 10.0 - (double)this.D.length * 0.5;
                            d9 = 5.0;
                            d4 = d5 / (double)this.D.length;
                            d8 = this.p() - 1.0;
                            cryptographicParameterGenerator.R(this.O(), this.G() + 5.0, this.W() + 5.0, this.Pc);
                            if (!this.Pm) break block24;
                            d4 = (d5 - 2.0) / (double)this.D.length;
                            d3 = 1.0;
                            while (true) {
                                block25: {
                                    block18: {
                                        try {
                                            if (!(d3 < (double)(this.D.length + 1))) break block17;
                                            if (d3 - 1.0 != (double)this.W(this.PB.t())) break block18;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw NumericComputationResolver.a(customSystemException);
                                        }
                                        ConfigurationManager.A(this.G() + d9 - 1.0, d6, d4 + 1.0, 1.0, this.l());
                                        d9 += d4 + 2.5;
                                        break block25;
                                    }
                                    ConfigurationManager.A(this.G() + d9, d6, d4, 1.0, this.q(d3));
                                    d9 += d4 + 0.5;
                                }
                                d3 += 1.0;
                            }
                        }
                        d3 = 1.0;
                        while (true) {
                            block20: {
                                block19: {
                                    try {
                                        try {
                                            if (!(d3 < (double)(this.D.length + 1))) break;
                                            ConfigurationManager.A(this.G() + d9, d6, d4, 1.0, this.q(d3));
                                            if (d3 != 1.0) break block19;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw NumericComputationResolver.a(customSystemException);
                                        }
                                        ConfigurationManager.T(this.G() + d9 - 0.5, d6 + 0.25, 0.5, 1.0, this.q(d3));
                                        break block20;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw NumericComputationResolver.a(customSystemException);
                                    }
                                }
                                try {
                                    if (d3 == (double)this.D.length) {
                                        ConfigurationManager.T(this.G() + d9 + d4, d6 + 0.25, 0.5, 1.0, this.q(d3));
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw NumericComputationResolver.a(customSystemException);
                                }
                            }
                            d9 += d4 + 0.5;
                            d3 += 1.0;
                        }
                    }
                    d3 = 0.5;
                    try {
                        try {
                            if (this.k()) break block21;
                            if (this.F == null) break block22;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NumericComputationResolver.a(customSystemException);
                        }
                        d7 = (double)this.PD / d8;
                        break block23;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericComputationResolver.a(customSystemException);
                    }
                }
                d7 = 0.0;
            }
            d3 = d7;
        }
        try {
            d2 = this.w() - 10.0;
            n = this.Pm ? 2 : 0;
        }
        catch (CustomSystemException customSystemException) {
            throw NumericComputationResolver.a(customSystemException);
        }
        d5 = d2 + (double)n;
        double d11 = this.G() + 5.0 + d5 * d3;
        this.V = this.K(d11 += (d3 - 0.5) * -1.0 * d4, d6 + 0.5, this.PU.p() / 2.0);
        this.q();
    }

    public void D(double d2) {
        this.Ph = d2;
    }

    private static Field g(long l, long l2) {
        int n = NumericComputationResolver.e(l, l2);
        Object object = kb[n];
        if (object instanceof String) {
            String string = lb[n];
            int n2 = string.indexOf(8);
            Class clazz = NumericComputationResolver.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = NumericComputationResolver.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = NumericComputationResolver.c(clazz3, string2, clazz2)) != null) {
                    NumericComputationResolver.kb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = NumericComputationResolver.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        NumericComputationResolver.kb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = NumericComputationResolver.f(258926130129853L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public double p() {
        return this.Pf;
    }

    private void V() {
        block7: {
            block8: {
                try {
                    try {
                        if (!this.Y) break block7;
                        if (SystemDiagnosticAnalyzer.A(CipherConfigurationMode.LEFT_CLICK.ordinal())) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericComputationResolver.a(customSystemException);
                    }
                    this.Y = false;
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericComputationResolver.a(customSystemException);
                }
            }
            double d2 = this.w() - 10.0;
            CoordinateMapper coordinateMapper = GraphicsBufferAllocator.b();
            double d3 = (double)coordinateMapper.X - this.G() - 5.0 - this.V.t() / 2.0;
            double d4 = this.G() + 5.0 + this.V.t() / 2.0;
            double d5 = this.G() + this.w() - 5.0 - this.V.t() / 2.0;
            double d6 = this.f(this.b, this.Pf, d4, d5, this.Ph, d3);
            d6 = new BigDecimal("" + d6).setScale(1, RoundingMode.HALF_UP).doubleValue();
            try {
                if (this.F != null) {
                    this.F.E(this.q(d6 + 0.0));
                    this.Z();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw NumericComputationResolver.a(customSystemException);
            }
        }
    }

    public void R() {
        double d2;
        double d3;
        double d4;
        double d5;
        NumericStreamProcessor numericStreamProcessor;
        NumericStreamProcessor numericStreamProcessor2;
        int n;
        double d6;
        double d7 = this.w() - 10.0 - (double)this.D.length * 0.5;
        double d8 = d7 / (double)this.D.length;
        double d9 = this.p() - 1.0;
        double d10 = (double)this.PD / d9;
        try {
            d6 = this.w() - 10.0;
            n = this.Pm ? 2 : 0;
        }
        catch (CustomSystemException customSystemException) {
            throw NumericComputationResolver.a(customSystemException);
        }
        d7 = d6 - (double)n;
        double d11 = 5.0 + d7 * d10;
        d11 += (d10 - 0.5) * -1.0 * d8;
        double d12 = this.PB.t();
        try {
            NumericStreamProcessor numericStreamProcessor3;
            NumericComputationResolver numericComputationResolver = this;
            numericStreamProcessor2 = numericStreamProcessor3;
            numericStreamProcessor = numericStreamProcessor3;
            d5 = 0.15;
            d4 = d12;
            d3 = d11;
            d2 = this.Pm ? 0.5 : 0.0;
        }
        catch (CustomSystemException customSystemException) {
            throw NumericComputationResolver.a(customSystemException);
        }
        numericStreamProcessor2(d5, d4, d3 + d2);
        numericComputationResolver.PB = numericStreamProcessor;
        this.PB.o();
        this.E = new ColorPaletteRenderer(0.15, this.D[this.PQ], this.D[this.PD]);
        this.E.o();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(NumericComputationResolver.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(NumericComputationResolver.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

