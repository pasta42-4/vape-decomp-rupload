/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package com.util.numeric;

import a.ZB;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.collections.management.MultiContainerRegistry;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.exception.system.CustomSystemException;
import com.google.gson.JsonObject;
import com.security.protocol.EncryptionProtocolHandler397;
import com.temporal.metadata.TemporalMetadataResolver;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class NumericFormattingUtility
extends ConfigurationProfileResolver<double[], NumericFormattingUtility> {
    private final DecimalFormat d;
    private double o;
    private final Random a;
    private static final Integer[] m;
    private static final Object[] L;
    private static final Map F;
    private static final long[] k;
    private final double s;
    private final double x;
    private final String Y;
    private static final long e;
    private final DecimalFormat y;
    private static final String[] T;
    private final String V;
    private double A;

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public DecimalFormat K() {
        return this.y;
    }

    public String V() {
        return this.V;
    }

    public void v(double d2) {
        this.o = d2;
    }

    public NumericFormattingUtility q() {
        return new NumericFormattingUtility(null, this.O(), (double[])this.u(), this.j(), this.g(), this.Y, this.V);
    }

    public void j(double d2) {
        super.H(new double[]{AdaptiveComputationEngine.j(d2, this.m()), this.q()});
        this.M();
    }

    public void A(double d2) {
        super.H(new double[]{this.G(), AdaptiveComputationEngine.j(d2, this.m())});
        this.M();
    }

    @Override
    public String p() {
        long l = e ^ 0x491BA2664F0DL;
        String string = this.d.format(this.G());
        String string2 = this.d.format(this.q());
        return string + (String)((Object)NumericFormattingUtility.d("\u00d9", (int)NumericFormattingUtility.b("o", (int)10196, (long)(0x45A19E9527421D28L ^ l)), (long)3380125785159686L, (long)l)) + string2 + this.V.trim();
    }

    @Override
    public JsonObject k(boolean bl) {
        long l = e ^ 0x408D6C306591L;
        JsonObject jsonObject = this.y();
        try {
            if (this.G() != ((double[])this.u())[0]) {
                jsonObject.addProperty((String)((Object)NumericFormattingUtility.d("\u00d9", (int)NumericFormattingUtility.b("o", (int)7923, (long)(0x7A695FDD6EE00E90L ^ l)), (long)3066964136969523866L, (long)l)), (Number)this.G());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericFormattingUtility.b(customSystemException);
        }
        try {
            if (this.q() != ((double[])this.u())[1]) {
                jsonObject.addProperty((String)((Object)NumericFormattingUtility.d("\u00d9", (int)NumericFormattingUtility.b("o", (int)6490, (long)(0x5E694E6F675D8938L ^ l)), (long)3066964136969523866L, (long)l)), (Number)this.q());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericFormattingUtility.b(customSystemException);
        }
        return jsonObject;
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

    @Override
    public boolean C(JsonObject jsonObject) {
        long l = e ^ 0x40FECBDEC240L;
        if (jsonObject.get((String)((Object)NumericFormattingUtility.d("\u00d9", (int)NumericFormattingUtility.b("o", (int)18321, (long)(0x3AE25FB82B377026L ^ l)), (long)-8268314445562710709L, (long)l))).getAsString().equalsIgnoreCase(this.x())) {
            double d2;
            double[] dArray;
            double d3;
            double[] dArray2;
            NumericFormattingUtility numericFormattingUtility;
            Double d4;
            Double d5;
            block9: {
                d5 = EncryptionProtocolHandler397.R(jsonObject, (String)((Object)NumericFormattingUtility.d("\u00d9", (int)NumericFormattingUtility.b("o", (int)18672, (long)(0x2CEA3B5723957F45L ^ l)), (long)-8268314445562710709L, (long)l)));
                d4 = EncryptionProtocolHandler397.R(jsonObject, (String)((Object)NumericFormattingUtility.d("\u00d9", (int)NumericFormattingUtility.b("o", (int)5680, (long)(0x306170F4DBC82184L ^ l)), (long)-8268314445562710709L, (long)l)));
                try {
                    try {
                        if (d5 != null || d4 != null) break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericFormattingUtility.b(customSystemException);
                    }
                    return false;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericFormattingUtility.b(customSystemException);
                }
            }
            try {
                numericFormattingUtility = this;
                double[] dArray3 = new double[2];
                double[] dArray4 = dArray3;
                dArray2 = dArray3;
                int n = 0;
                d3 = d5 != null ? d5 : ((double[])this.N)[0];
            }
            catch (CustomSystemException customSystemException) {
                throw NumericFormattingUtility.b(customSystemException);
            }
            try {
                dArray4[n] = d3;
                double[] dArray5 = dArray2;
                dArray = dArray2;
                int n = 1;
                d2 = d4 != null ? d4 : ((double[])this.N)[1];
            }
            catch (CustomSystemException customSystemException) {
                throw NumericFormattingUtility.b(customSystemException);
            }
            dArray5[n] = d2;
            numericFormattingUtility.R(dArray);
            return true;
        }
        return false;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = NumericFormattingUtility.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static NumericFormattingUtility T(Object object, String string, String string2, String string3, String string4, double d2, double d3, double d4, double d5, double d6) {
        NumericFormattingUtility numericFormattingUtility = new NumericFormattingUtility(object, string, new double[]{d3, d4}, d2, d5, string3, string4);
        numericFormattingUtility.A = d6;
        return numericFormattingUtility;
    }

    public double j() {
        return this.s;
    }

    public NumericFormattingUtility(Object object, String string, double[] dArray, double d2, double d3, String string2, String string3) {
        long l = e ^ 0x6B04CB269B1CL;
        super(object, string, dArray);
        this.o = 999999.0;
        this.a = new Random();
        this.A = 0.01;
        this.s = d2;
        this.x = d3;
        this.Y = ZB.D(string2);
        if (!string3.isEmpty()) {
            string3 = (String)((Object)NumericFormattingUtility.d("\u00d9", (int)NumericFormattingUtility.b("o", (int)11361, (long)(0xE09D703E015C28BL ^ l)), (long)-3162335991235564521L, (long)l)) + string3;
        }
        this.V = string3;
        this.y = this.x();
        this.d = this.x();
    }

    public void R(double[] dArray) {
        block13: {
            block12: {
                block11: {
                    block10: {
                        try {
                            super.H(dArray);
                            if (!(dArray[0] > this.o)) break block10;
                            dArray[0] = this.o;
                            break block11;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NumericFormattingUtility.b(customSystemException);
                        }
                    }
                    try {
                        if (dArray[0] < -this.o) {
                            dArray[0] = -this.o;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericFormattingUtility.b(customSystemException);
                    }
                }
                try {
                    if (!(dArray[1] > this.o)) break block12;
                    dArray[1] = this.o;
                    break block13;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericFormattingUtility.b(customSystemException);
                }
            }
            try {
                if (dArray[1] < -this.o) {
                    dArray[1] = -this.o;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw NumericFormattingUtility.b(customSystemException);
            }
        }
        this.j(dArray[0]);
        this.A(dArray[1]);
        this.M();
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jX" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private DecimalFormat x() {
        DecimalFormat decimalFormat;
        long l = e ^ 0x58E1DD5AE1BL;
        try {
            decimalFormat = new DecimalFormat(this.Y);
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
            decimalFormat = new DecimalFormat((String)((Object)NumericFormattingUtility.d("\u00d9", (int)NumericFormattingUtility.b("o", (int)22320, (long)(0x410E30C754E30CDBL ^ l)), (long)-2226380610722883312L, (long)l)));
        }
        decimalFormat.setMinimumIntegerDigits(1);
        return decimalFormat;
    }

    public void D(double d2) {
        this.A = d2;
    }

    public double m() {
        return this.A;
    }

    public String Y() {
        return this.y.format(this.q());
    }

    public static NumericFormattingUtility y(Object object, String string, String string2, String string3, double d2, double d3, double d4, double d5, double d6) {
        NumericFormattingUtility numericFormattingUtility = new NumericFormattingUtility(object, string, new double[]{d3, d4}, d2, d5, string2, string3);
        numericFormattingUtility.A = d6;
        return numericFormattingUtility;
    }

    public static NumericFormattingUtility P(Object object, String string, String string2, String string3, double d2, double d3, double d4, double d5) {
        return new NumericFormattingUtility(object, string, new double[]{d3, d4}, d2, d5, string2, string3);
    }

    public NumericFormattingUtility Z(int n) {
        this.d.setMaximumFractionDigits(n);
        return this;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = NumericFormattingUtility.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public void n(double d2) {
        block6: {
            if (d2 > this.q()) {
                d2 = this.q() - this.m();
            } else {
                block5: {
                    try {
                        if (!(d2 > this.x)) break block5;
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericFormattingUtility.b(customSystemException);
                    }
                }
                if (d2 < this.s) {
                    // empty if block
                }
            }
        }
        super.H(new double[]{AdaptiveComputationEngine.j(d2, this.m()), this.q()});
        this.M();
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (T[n4] != null) {
            return n4;
        }
        Object object = L[n4];
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
                n3 = 21;
                break;
            }
            case 2: {
                n3 = 42;
                break;
            }
            case 3: {
                n3 = 8;
                break;
            }
            case 4: {
                n3 = 22;
                break;
            }
            case 5: {
                n3 = 57;
                break;
            }
            case 6: {
                n3 = 2;
                break;
            }
            case 7: {
                n3 = 20;
                break;
            }
            case 8: {
                n3 = 55;
                break;
            }
            case 9: {
                n3 = 52;
                break;
            }
            case 10: {
                n3 = 10;
                break;
            }
            case 11: {
                n3 = 13;
                break;
            }
            case 12: {
                n3 = 3;
                break;
            }
            case 13: {
                n3 = 53;
                break;
            }
            case 14: {
                n3 = 48;
                break;
            }
            case 15: {
                n3 = 51;
                break;
            }
            case 16: {
                n3 = 62;
                break;
            }
            case 17: {
                n3 = 29;
                break;
            }
            case 18: {
                n3 = 27;
                break;
            }
            case 19: {
                n3 = 31;
                break;
            }
            case 20: {
                n3 = 32;
                break;
            }
            case 21: {
                n3 = 50;
                break;
            }
            case 22: {
                n3 = 12;
                break;
            }
            case 23: {
                n3 = 24;
                break;
            }
            case 24: {
                n3 = 43;
                break;
            }
            case 25: {
                n3 = 34;
                break;
            }
            case 26: {
                n3 = 6;
                break;
            }
            case 27: {
                n3 = 46;
                break;
            }
            case 28: {
                n3 = 15;
                break;
            }
            case 29: {
                n3 = 45;
                break;
            }
            case 30: {
                n3 = 19;
                break;
            }
            case 31: {
                n3 = 28;
                break;
            }
            case 32: {
                n3 = 63;
                break;
            }
            case 33: {
                n3 = 38;
                break;
            }
            case 34: {
                n3 = 36;
                break;
            }
            case 35: {
                n3 = 37;
                break;
            }
            case 36: {
                n3 = 33;
                break;
            }
            case 37: {
                n3 = 14;
                break;
            }
            case 38: {
                n3 = 39;
                break;
            }
            case 39: {
                n3 = 11;
                break;
            }
            case 40: {
                n3 = 35;
                break;
            }
            case 41: {
                n3 = 54;
                break;
            }
            case 42: {
                n3 = 41;
                break;
            }
            case 43: {
                n3 = 9;
                break;
            }
            case 44: {
                n3 = 59;
                break;
            }
            case 45: {
                n3 = 58;
                break;
            }
            case 46: {
                n3 = 26;
                break;
            }
            case 47: {
                n3 = 47;
                break;
            }
            case 48: {
                n3 = 4;
                break;
            }
            case 49: {
                n3 = 61;
                break;
            }
            case 50: {
                n3 = 0;
                break;
            }
            case 51: {
                n3 = 18;
                break;
            }
            case 52: {
                n3 = 23;
                break;
            }
            case 53: {
                n3 = 5;
                break;
            }
            case 54: {
                n3 = 40;
                break;
            }
            case 55: {
                n3 = 60;
                break;
            }
            case 56: {
                n3 = 49;
                break;
            }
            case 57: {
                n3 = 44;
                break;
            }
            case 58: {
                n3 = 30;
                break;
            }
            case 59: {
                n3 = 56;
                break;
            }
            case 60: {
                n3 = 17;
                break;
            }
            case 61: {
                n3 = 25;
                break;
            }
            case 62: {
                n3 = 7;
                break;
            }
            default: {
                n3 = 16;
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
        NumericFormattingUtility.T[n4] = new String(cArray);
        return n4;
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public double g() {
        return this.x;
    }

    public String k() {
        return this.y.format(this.G());
    }

    public double l() {
        double d2 = this.G();
        double d3 = this.q();
        return d2 + (d3 - d2) * this.a.nextDouble();
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jX" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = NumericFormattingUtility.e(l, l2);
            object = L[n];
            try {
                if (!(object instanceof String)) break block2;
                NumericFormattingUtility.L[n] = clazz = Class.forName(T[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public void R(double d2) {
        block6: {
            if (d2 < this.G()) {
                d2 = this.G() + this.m();
            } else {
                block5: {
                    try {
                        if (!(d2 > this.x)) break block5;
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericFormattingUtility.b(customSystemException);
                    }
                }
                if (d2 < this.s) {
                    // empty if block
                }
            }
        }
        super.H(new double[]{this.G(), AdaptiveComputationEngine.j(d2, this.m())});
        this.M();
    }

    public double G() {
        return ((double[])this.J())[0];
    }

    private static Method h(long l, long l2) {
        int n = NumericFormattingUtility.e(l, l2);
        Object object = L[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = T[n];
                int n3 = string2.indexOf(8);
                clazz3 = NumericFormattingUtility.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = NumericFormattingUtility.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = NumericFormattingUtility.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        NumericFormattingUtility.L[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = NumericFormattingUtility.f(263492943411291L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = NumericFormattingUtility.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        NumericFormattingUtility.L[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = NumericFormattingUtility.f(263492943411291L, 0L);
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

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'l' || c == 'f' || c == 'L' || c == '\u00ee') {
                field = NumericFormattingUtility.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'l' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'f' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'L' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = NumericFormattingUtility.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00cd' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static void a() {
        Object[] objectArray = L;
        L[0] = "!\b\u0007";
        objectArray[1] = Integer.TYPE;
        NumericFormattingUtility.T[1] = "java/lang/Integer";
        objectArray[2] = "\u001f-?NH\"\u0014\".\u00015:\u0007%'H";
        objectArray[3] = "VzT\u0012\u0016O]uE]wAV~A\u0007";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "G\u001b,F=OLKk(8\u0005.\u001f9Cn@\u001fJj\u0013l~\u0017Z-Q8GE\u001c<\u0013S";
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3AF4;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = k[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])F.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    F.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/jX", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            NumericFormattingUtility.m[n2] = n3;
        }
        return m[n2];
    }

    private static Field g(long l, long l2) {
        int n = NumericFormattingUtility.e(l, l2);
        Object object = L[n];
        if (object instanceof String) {
            String string = T[n];
            int n2 = string.indexOf(8);
            Class clazz = NumericFormattingUtility.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = NumericFormattingUtility.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = NumericFormattingUtility.c(clazz3, string2, clazz2)) != null) {
                    NumericFormattingUtility.L[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = NumericFormattingUtility.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        NumericFormattingUtility.L[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = NumericFormattingUtility.f(263492943411291L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public int s() {
        return (int)this.G();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                NumericFormattingUtility.e = MultiContainerRegistry.a(-7346686607909105892L, 4982962091259563049L, MethodHandles.lookup().lookupClass()).a(209206983625952L);
                NumericFormattingUtility.L = new Object[5];
                NumericFormattingUtility.T = new String[5];
                NumericFormattingUtility.a();
                NumericFormattingUtility.F = new HashMap<K, V>(13);
                var0 = NumericFormattingUtility.e ^ 58935649770873L;
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
                var8_3 = new long[8];
                var5_4 = 0;
                var6_5 = "\u0094s\u00be<\u0012\u00be|h\u00ce\u00ecbiK\u000fI\u00c9\u0092\u001b\u000e\u00c8pe\u0083P\u0084rx8\u00c5Q\u00e8D8\u00c4\u0013\b\u0015\tnR\u008d\u00bf)%\u0007wqz";
                var7_6 = "\u0094s\u00be<\u0012\u00be|h\u00ce\u00ecbiK\u000fI\u00c9\u0092\u001b\u000e\u00c8pe\u0083P\u0084rx8\u00c5Q\u00e8D8\u00c4\u0013\b\u0015\tnR\u008d\u00bf)%\u0007wqz".length();
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
                    var6_5 = "\u00d4\u00d4\u00b5\u00a2J`\\\u00c6\u00c1o}\u0096.\u00f7\u0085\u00a8";
                    var7_6 = "\u00d4\u00d4\u00b5\u00a2J`\\\u00c6\u00c1o}\u0096.\u00f7\u0085\u00a8".length();
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
        NumericFormattingUtility.k = var8_3;
        NumericFormattingUtility.m = new Integer[8];
    }

    @Override
    public void i(String string) {
    }

    public int c() {
        return (int)this.q();
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = NumericFormattingUtility.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = NumericFormattingUtility.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static NumericFormattingUtility K(Object object, String string, String string2, String string3, double d2, double d3, double d4, double d5, double d6, String string4) {
        NumericFormattingUtility numericFormattingUtility = new NumericFormattingUtility(object, string, new double[]{d3, d4}, d2, d5, string2, string3);
        numericFormattingUtility.A = d6;
        return (NumericFormattingUtility)numericFormattingUtility.R(string4);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = NumericFormattingUtility.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = NumericFormattingUtility.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public double q() {
        return ((double[])this.J())[1];
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(NumericFormattingUtility.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(NumericFormattingUtility.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

