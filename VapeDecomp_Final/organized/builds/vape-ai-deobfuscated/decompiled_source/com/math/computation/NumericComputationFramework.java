/*
 * Decompiled with CFR 0.152.
 */
package com.math.computation;

import a.Qh;
import a.oZ;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.game.configuration.GameVersionEnumerator;
import com.graphics.transform.GeometricTransformationEngine708;
import com.protocol.encoding.EncodingProtocolHandler;
import com.random.generation.RandomGenerationEngine;
import com.security.crypto.CipherContextManager784;
import com.security.crypto.CryptographicSecurityProvider;
import com.security.transaction.CryptographicTransactionProcessor;
import com.system.configuration.ConfigurationCalibrator;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.monitoring.ExecutionStateTracker;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.processing.TransactionSequenceManager;
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
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NumericComputationFramework {
    public final ArrayList I;
    public final float M;
    public final boolean r;
    public final float o;
    public final double J;
    private static AbstractComputationKernel[] X;
    public boolean y;
    public final double D;
    public final int i;
    public final double b;
    public final boolean W;
    private static CryptographicTransactionProcessor h;
    public final double k;
    public boolean F;
    public final float z;
    public final float H;
    public final double s;
    public final float n;
    private static final long[] d;
    public final int j;
    public final boolean g;
    private static final Map m;
    public final double Q;
    public final float p;
    public boolean B;
    public final boolean K;
    public final int a;
    private static final long c;
    public final double G;
    public boolean P;
    private static final String[] u;
    public final double l;
    public final boolean A;
    public final GeometricTransformationEngine708 e;
    public final double q;
    public boolean O;
    private static final Object[] t;
    public final boolean L;
    private static final Integer[] f;
    public final float x;
    public boolean V;
    public final float S;
    public boolean w;

    public NumericComputationFramework(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        boolean bl;
        block8: {
            block7: {
                this.s = systemConfigurationOrchestrator.F();
                this.D = systemConfigurationOrchestrator.V();
                this.l = systemConfigurationOrchestrator.B();
                this.Q = systemConfigurationOrchestrator.f();
                this.q = systemConfigurationOrchestrator.l();
                this.J = systemConfigurationOrchestrator.n();
                this.k = systemConfigurationOrchestrator.G();
                this.G = systemConfigurationOrchestrator.x();
                this.b = systemConfigurationOrchestrator.o();
                this.H = systemConfigurationOrchestrator.q();
                this.p = systemConfigurationOrchestrator.S();
                this.o = systemConfigurationOrchestrator.A();
                this.S = systemConfigurationOrchestrator.Q();
                this.e = this.z(ConfigurationCalibrator.b.N());
                this.a = systemConfigurationOrchestrator.o();
                this.i = systemConfigurationOrchestrator.N();
                this.A = systemConfigurationOrchestrator.j();
                this.K = systemConfigurationOrchestrator.H();
                this.g = systemConfigurationOrchestrator.o();
                this.j = systemConfigurationOrchestrator.S();
                this.M = systemConfigurationOrchestrator.f();
                this.x = systemConfigurationOrchestrator.a();
                this.r = systemConfigurationOrchestrator.t();
                TransactionSequenceManager transactionSequenceManager = GameVersionEnumerator.MC_1_20_6.H() ? systemConfigurationOrchestrator.x(EncodingProtocolHandler.L()) : systemConfigurationOrchestrator.I(EncodingProtocolHandler.R());
                this.I = new ArrayList(transactionSequenceManager.D());
                oZ oZ2 = systemConfigurationOrchestrator.W();
                this.n = oZ2.m();
                this.z = oZ2.t();
                this.L = oZ2.Q();
                this.W = oZ2.f();
                ExecutionStateTracker executionStateTracker = ApplicationLifecycleManager.N();
                try {
                    this.O = executionStateTracker.s().X();
                    this.B = executionStateTracker.w().X();
                    this.P = executionStateTracker.y().X();
                    this.F = executionStateTracker.h().X();
                    this.V = executionStateTracker.f().X();
                    this.y = executionStateTracker.r().X();
                    if (h == null) {
                        h = TemporalMetadataResolver.h.U().K(CryptographicTransactionProcessor.class);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw NumericComputationFramework.a(illegalArgumentException);
                }
                try {
                    try {
                        NumericComputationFramework numericComputationFramework = this;
                        if (!executionStateTracker.N().X() && !h.Z()) break block7;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw NumericComputationFramework.a(illegalArgumentException);
                    }
                    bl = true;
                    break block8;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw NumericComputationFramework.a(illegalArgumentException);
                }
            }
            bl = false;
        }
        numericComputationFramework.w = bl;
    }

    public NumericComputationFramework(CipherContextManager784 cipherContextManager784) {
        boolean bl;
        block8: {
            block7: {
                Qh qh = cipherContextManager784.a();
                this.s = qh.F();
                this.D = qh.V();
                this.l = qh.B();
                this.Q = qh.f();
                this.q = qh.l();
                this.J = qh.n();
                this.k = qh.G();
                this.G = qh.x();
                this.b = qh.o();
                this.H = qh.q();
                this.p = qh.S();
                this.o = qh.A();
                this.S = qh.Q();
                this.e = this.z(cipherContextManager784.C());
                this.a = cipherContextManager784.D();
                this.i = cipherContextManager784.H();
                this.A = qh.j();
                this.K = cipherContextManager784.b();
                this.g = qh.o();
                this.j = qh.S();
                this.M = qh.f();
                this.x = qh.a();
                this.r = qh.t();
                TransactionSequenceManager transactionSequenceManager = GameVersionEnumerator.MC_1_20_6.H() ? qh.x(EncodingProtocolHandler.L()) : qh.I(EncodingProtocolHandler.R());
                try {
                    this.I = new ArrayList(transactionSequenceManager.D());
                    this.z = cipherContextManager784.T();
                    this.n = cipherContextManager784.E();
                    this.L = cipherContextManager784.S();
                    this.W = cipherContextManager784.b();
                    this.O = cipherContextManager784.G();
                    this.B = cipherContextManager784.H();
                    this.P = cipherContextManager784.U();
                    this.F = cipherContextManager784.w();
                    this.V = cipherContextManager784.R();
                    this.y = cipherContextManager784.Z();
                    if (h == null) {
                        h = TemporalMetadataResolver.h.U().K(CryptographicTransactionProcessor.class);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw NumericComputationFramework.a(illegalArgumentException);
                }
                try {
                    try {
                        NumericComputationFramework numericComputationFramework = this;
                        if (!cipherContextManager784.f() && !h.Z()) break block7;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw NumericComputationFramework.a(illegalArgumentException);
                    }
                    bl = true;
                    break block8;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw NumericComputationFramework.a(illegalArgumentException);
                }
            }
            bl = false;
        }
        numericComputationFramework.w = bl;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = NumericComputationFramework.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private NumericComputationFramework(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, float f, float f2, float f3, float f4, int n, int n2, boolean bl, boolean bl2, boolean bl3, int n3, float f5, float f6, boolean bl4, float f7, float f8, boolean bl5, boolean bl6, boolean bl7, boolean bl8, boolean bl9, boolean bl10, boolean bl11, boolean bl12, boolean bl13) {
        this.s = d2;
        this.D = d3;
        this.l = d4;
        this.Q = d5;
        this.q = d6;
        this.J = d7;
        this.k = d8;
        this.G = d9;
        this.b = d10;
        this.H = f;
        this.p = f2;
        this.o = f3;
        this.S = f4;
        this.a = n;
        this.i = n2;
        this.A = bl;
        this.K = bl2;
        this.g = bl3;
        this.j = n3;
        this.M = f5;
        this.x = f6;
        this.r = bl4;
        this.I = new ArrayList();
        this.n = f7;
        this.z = f8;
        this.L = bl5;
        this.W = bl6;
        this.O = bl7;
        this.B = bl8;
        this.P = bl9;
        this.F = bl10;
        this.V = bl11;
        this.y = bl12;
        this.w = bl13;
        this.e = null;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public static NumericComputationFramework X(String string) {
        long l = c ^ 0x7BF3423F08A6L;
        String[] stringArray = string.split((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)24855, (long)(0xC648CB909B6CB42L ^ l)), (long)7883410144940160115L, (long)l)));
        try {
            if (stringArray.length < 32) {
                throw new IllegalArgumentException((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)28680, (long)(0x4698307A993CDAC6L ^ l)), (long)7883410144940160115L, (long)l)));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw NumericComputationFramework.a(illegalArgumentException);
        }
        double d2 = Double.parseDouble(stringArray[0]);
        double d3 = Double.parseDouble(stringArray[1]);
        double d4 = Double.parseDouble(stringArray[2]);
        double d5 = Double.parseDouble(stringArray[3]);
        double d6 = Double.parseDouble(stringArray[4]);
        double d7 = Double.parseDouble(stringArray[5]);
        double d8 = Double.parseDouble(stringArray[6]);
        double d9 = Double.parseDouble(stringArray[7]);
        double d10 = Double.parseDouble(stringArray[8]);
        float f = Float.parseFloat(stringArray[9]);
        float f2 = Float.parseFloat(stringArray[10]);
        float f3 = Float.parseFloat(stringArray[11]);
        float f4 = Float.parseFloat(stringArray[12]);
        int n = Integer.parseInt(stringArray[13]);
        int n2 = Integer.parseInt(stringArray[14]);
        boolean bl = Boolean.parseBoolean(stringArray[15]);
        boolean bl2 = Boolean.parseBoolean(stringArray[16]);
        boolean bl3 = Boolean.parseBoolean(stringArray[17]);
        int n3 = Integer.parseInt(stringArray[18]);
        float f5 = Float.parseFloat(stringArray[19]);
        float f6 = Float.parseFloat(stringArray[20]);
        boolean bl4 = Boolean.parseBoolean(stringArray[21]);
        float f7 = Float.parseFloat(stringArray[22]);
        float f8 = Float.parseFloat(stringArray[23]);
        boolean bl5 = Boolean.parseBoolean(stringArray[24]);
        boolean bl6 = Boolean.parseBoolean(stringArray[25]);
        boolean bl7 = Boolean.parseBoolean(stringArray[26]);
        boolean bl8 = Boolean.parseBoolean(stringArray[27]);
        boolean bl9 = Boolean.parseBoolean(stringArray[28]);
        boolean bl10 = Boolean.parseBoolean(stringArray[29]);
        boolean bl11 = Boolean.parseBoolean(stringArray[30]);
        boolean bl12 = Boolean.parseBoolean(stringArray[31]);
        boolean bl13 = Boolean.parseBoolean(stringArray[32]);
        return new NumericComputationFramework(d2, d3, d4, d5, d6, d7, d8, d9, d10, f, f2, f3, f4, n, n2, bl, bl2, bl3, n3, f5, f6, bl4, f7, f8, bl5, bl6, bl7, bl8, bl9, bl10, bl11, bl12, bl13);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/IF" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l, long l2) {
        int n = NumericComputationFramework.a(l, l2);
        Object object = t[n];
        if (object instanceof String) {
            String string = u[n];
            int n2 = string.indexOf(8);
            Class clazz = NumericComputationFramework.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = NumericComputationFramework.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = NumericComputationFramework.a(clazz3, string2, clazz2)) != null) {
                    NumericComputationFramework.t[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = NumericComputationFramework.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        NumericComputationFramework.t[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = NumericComputationFramework.b(238550924202797L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = NumericComputationFramework.a(l, l2);
        Object object = t[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = u[n];
                int n3 = string2.indexOf(8);
                clazz3 = NumericComputationFramework.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = NumericComputationFramework.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = NumericComputationFramework.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        NumericComputationFramework.t[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = NumericComputationFramework.b(238550924202797L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = NumericComputationFramework.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        NumericComputationFramework.t[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = NumericComputationFramework.b(238550924202797L, 0L);
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

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (u[n4] != null) {
            return n4;
        }
        Object object = t[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 50;
                break;
            }
            case 1: {
                n3 = 1;
                break;
            }
            case 2: {
                n3 = 9;
                break;
            }
            case 3: {
                n3 = 10;
                break;
            }
            case 4: {
                n3 = 49;
                break;
            }
            case 5: {
                n3 = 14;
                break;
            }
            case 6: {
                n3 = 32;
                break;
            }
            case 7: {
                n3 = 46;
                break;
            }
            case 8: {
                n3 = 53;
                break;
            }
            case 9: {
                n3 = 25;
                break;
            }
            case 10: {
                n3 = 59;
                break;
            }
            case 11: {
                n3 = 7;
                break;
            }
            case 12: {
                n3 = 63;
                break;
            }
            case 13: {
                n3 = 24;
                break;
            }
            case 14: {
                n3 = 51;
                break;
            }
            case 15: {
                n3 = 34;
                break;
            }
            case 16: {
                n3 = 48;
                break;
            }
            case 17: {
                n3 = 18;
                break;
            }
            case 18: {
                n3 = 28;
                break;
            }
            case 19: {
                n3 = 31;
                break;
            }
            case 20: {
                n3 = 2;
                break;
            }
            case 21: {
                n3 = 58;
                break;
            }
            case 22: {
                n3 = 39;
                break;
            }
            case 23: {
                n3 = 61;
                break;
            }
            case 24: {
                n3 = 22;
                break;
            }
            case 25: {
                n3 = 19;
                break;
            }
            case 26: {
                n3 = 30;
                break;
            }
            case 27: {
                n3 = 23;
                break;
            }
            case 28: {
                n3 = 20;
                break;
            }
            case 29: {
                n3 = 62;
                break;
            }
            case 30: {
                n3 = 57;
                break;
            }
            case 31: {
                n3 = 40;
                break;
            }
            case 32: {
                n3 = 17;
                break;
            }
            case 33: {
                n3 = 4;
                break;
            }
            case 34: {
                n3 = 6;
                break;
            }
            case 35: {
                n3 = 42;
                break;
            }
            case 36: {
                n3 = 45;
                break;
            }
            case 37: {
                n3 = 37;
                break;
            }
            case 38: {
                n3 = 36;
                break;
            }
            case 39: {
                n3 = 27;
                break;
            }
            case 40: {
                n3 = 21;
                break;
            }
            case 41: {
                n3 = 15;
                break;
            }
            case 42: {
                n3 = 44;
                break;
            }
            case 43: {
                n3 = 54;
                break;
            }
            case 44: {
                n3 = 60;
                break;
            }
            case 45: {
                n3 = 43;
                break;
            }
            case 46: {
                n3 = 16;
                break;
            }
            case 47: {
                n3 = 35;
                break;
            }
            case 48: {
                n3 = 47;
                break;
            }
            case 49: {
                n3 = 55;
                break;
            }
            case 50: {
                n3 = 41;
                break;
            }
            case 51: {
                n3 = 33;
                break;
            }
            case 52: {
                n3 = 38;
                break;
            }
            case 53: {
                n3 = 8;
                break;
            }
            case 54: {
                n3 = 12;
                break;
            }
            case 55: {
                n3 = 0;
                break;
            }
            case 56: {
                n3 = 26;
                break;
            }
            case 57: {
                n3 = 56;
                break;
            }
            case 58: {
                n3 = 5;
                break;
            }
            case 59: {
                n3 = 3;
                break;
            }
            case 60: {
                n3 = 11;
                break;
            }
            case 61: {
                n3 = 52;
                break;
            }
            case 62: {
                n3 = 13;
                break;
            }
            default: {
                n3 = 29;
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
        NumericComputationFramework.u[n4] = new String(cArray);
        return n4;
    }

    public static String D(List<NumericComputationFramework> list) {
        long l = c ^ 0x21EC08A72835L;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)12311, (long)(0x6854C4AC542D3AD6L ^ l)), (long)5617156268256285920L, (long)l)));
        for (NumericComputationFramework numericComputationFramework : list) {
            try {
                stringBuilder.append(numericComputationFramework.s).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)31082, (long)(0x323F5ED6B1BBF343L ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.D).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)23280, (long)(0x1ACF9990A1E50B7L ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.l).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)12848, (long)(0x55975642EA9DB82CL ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.Q).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)3160, (long)(0x64D536E004378662L ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.q).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)20007, (long)(0x37F8661EA61D440FL ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.J).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)6208, (long)(0x4500CB551A4F1284L ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.k).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)24620, (long)(0x7664953CE109EA7AL ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.G).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)21451, (long)(0x5A350BC4222FD991L ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.b).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)20270, (long)(0x1FEDD15A8DE6C5FDL ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.H).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)12347, (long)(0x5FA957CF63CD3AEAL ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.p).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)25201, (long)(0x319B776F3789E8A4L ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.o).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)27798, (long)(0x6798A2F83A0C66CAL ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.S).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)23275, (long)(0x783C6724B03450DAL ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.a).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)2179, (long)(0x5C95DEDB7AC082BAL ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.i).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)1799, (long)(0xF212C1CA0FF0D35L ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.A).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)4737, (long)(0x23E7E8D56B179891L ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.K).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)7422, (long)(0x7E65ADED27E996B3L ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.g).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)17434, (long)(0x13EA25479F844E5BL ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.j).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)1135, (long)(0x3FBD4030A9ED8E02L ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.M).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)23037, (long)(0x357425FE32485396L ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.x).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)20621, (long)(0x703DDC2C77F4DAA7L ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.n).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)12006, (long)(0x3725E57F8E792487L ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.z).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)9273, (long)(0x16C8B4C69B2C2E05L ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.L).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)9261, (long)(0x1276A4C6D57A2E0BL ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.W).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)17999, (long)(0x5BEAF0A8C08FCC6EL ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.O).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)27561, (long)(0x45F0ED50D07061C6L ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.B).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)14729, (long)(0x1CECAF0B8CF533BEL ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.P).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)26061, (long)(0x7506DC11DCD66FF8L ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.F).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)3187, (long)(0x14FEBDCA0B4B86BBL ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.V).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)31890, (long)(0x2431F2B8D0DAF699L ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.y).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)15842, (long)(0x676F9C010903378BL ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.w).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)32454, (long)(0x4E333275F11874C6L ^ l)), (long)5617156268256285920L, (long)l)));
                if (numericComputationFramework.e != null) {
                    stringBuilder.append(numericComputationFramework.e.h).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)28287, (long)(0x5511A9E383F16437L ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.e.c).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)23857, (long)(0x7C35E499B9BED71AL ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.e.s).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)16925, (long)(0x3ED558963D42C871L ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.e.S).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)939, (long)(0x558AEAB48C460994L ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.e.Q).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)7934, (long)(0x544D0BFA3C68949BL ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.e.C).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)29284, (long)(0xC967424E2F1781AL ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.e.x).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)5268, (long)(0x147CF483A6409EFEL ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.e.T).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)23896, (long)(0x4BD1D0E0E30ED71DL ^ l)), (long)5617156268256285920L, (long)l))).append(numericComputationFramework.e.p).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)18427, (long)(0x2EA6BE1471A54DEDL ^ l)), (long)5617156268256285920L, (long)l)));
                    continue;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw NumericComputationFramework.a(illegalArgumentException);
            }
            stringBuilder.append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)9967, (long)(0x2A1D90C4D09B2CA4L ^ l)), (long)5617156268256285920L, (long)l)));
        }
        return stringBuilder.toString();
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = NumericComputationFramework.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public boolean U(NumericComputationFramework numericComputationFramework) {
        boolean bl;
        block9: {
            block8: {
                try {
                    try {
                        try {
                            try {
                                if (this.O != numericComputationFramework.O || this.B != numericComputationFramework.B) break block8;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw NumericComputationFramework.a(illegalArgumentException);
                            }
                            if (this.P != numericComputationFramework.P) break block8;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw NumericComputationFramework.a(illegalArgumentException);
                        }
                        if (this.F != numericComputationFramework.F) break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw NumericComputationFramework.a(illegalArgumentException);
                    }
                    bl = true;
                    break block9;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw NumericComputationFramework.a(illegalArgumentException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = NumericComputationFramework.a(l, l2);
            object = t[n];
            try {
                if (!(object instanceof String)) break block2;
                NumericComputationFramework.t[n] = clazz = Class.forName(u[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d4' || c == '\u00e3' || c == 'p' || c == '\u00cf') {
                field = NumericComputationFramework.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d4' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e3' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'p' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = NumericComputationFramework.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00dc' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'R' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static void b(AbstractComputationKernel[] abstractComputationKernelArray) {
        X = abstractComputationKernelArray;
    }

    public boolean Y(NumericComputationFramework numericComputationFramework) {
        boolean bl;
        block9: {
            block8: {
                try {
                    try {
                        try {
                            try {
                                if (!this.U(numericComputationFramework) || this.V != numericComputationFramework.V) break block8;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw NumericComputationFramework.a(illegalArgumentException);
                            }
                            if (this.y != numericComputationFramework.y) break block8;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw NumericComputationFramework.a(illegalArgumentException);
                        }
                        if (this.w != numericComputationFramework.w) break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw NumericComputationFramework.a(illegalArgumentException);
                    }
                    bl = true;
                    break block9;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw NumericComputationFramework.a(illegalArgumentException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public String v() {
        long l = c ^ 0x29EA17386CABL;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.s).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)14098, (long)(0xE586AD0EC5F7981L ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.D).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)23642, (long)(0xB90035FC67012D6L ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.l).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)2905, (long)(0x14DE42F6D6F245BDL ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.Q).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)3038, (long)(0x5C2D460AF3EA4537L ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.q).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)4800, (long)(0x2EE1E2C96EB3DC05L ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.J).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)4401, (long)(0x34A00601FE1E5FECL ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.k).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)4331, (long)(0x178E1EF362AFDE4EL ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.G).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)22081, (long)(0x36312773442B98AEL ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.b).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)6377, (long)(0x4CCF86D2A7785663L ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.H).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)3545, (long)(0x58D581C927F7C380L ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.p).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)22872, (long)(0x6FAB6D20F91A17BDL ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.o).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)18443, (long)(0x3A208B61B62B06E0L ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.S).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)32141, (long)(0x1DE100C9734AB3DCL ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.a).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)15475, (long)(0x50D08F599C8AF295L ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.i).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)9157, (long)(0x25D23D565BA46D55L ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.A).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)9809, (long)(0x34BF31B3FC04689BL ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.K).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)5110, (long)(0x5D1BEF139D905D55L ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.g).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)8162, (long)(0x40CE6438C0535124L ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.j).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)6090, (long)(0x121867F34503D901L ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.M).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)8339, (long)(0x39C94626B9506E0CL ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.x).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)31905, (long)(0x508ECD36AF45321DL ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.r).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)7540, (long)(0x29CCEC53848453F1L ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.n).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)24675, (long)(0x21A1C2C4EA50AE3FL ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.z).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)23663, (long)(0x3DBA4DE997E912FEL ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.L).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)2919, (long)(0xAA1D79B15BC5F0L ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.W).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)4030, (long)(0x7E831DDEAD63C116L ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.O).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)6105, (long)(0x3A039AE64EE85945L ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.B).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)1615, (long)(0x122AF63756E9488EL ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.P).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)10843, (long)(0x49F7024F60B2E4DFL ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.F).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)24810, (long)(0x75EFEF1572AFAE07L ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.V).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)19259, (long)(0x6150EE4AF94485DAL ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.y).append((String)((Object)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)10317, (long)(0x58DAEA36F454669DL ^ l)), (long)678405114353487998L, (long)l)));
        stringBuilder.append(this.w);
        return stringBuilder.toString();
    }

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static void a() {
        Object[] objectArray = t;
        t[0] = "\u001f\u001f\u001a";
        objectArray[1] = Integer.TYPE;
        NumericComputationFramework.u[1] = "java/lang/Integer";
        objectArray[2] = "\u0015<[\u001eSR\u001e3JQ.J\r4C\u0018";
        objectArray[3] = "x2Z94Ms=KvUCx6O,";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u007f{{,h\u0010ue\u00047iuc,59j\u0015vwu\\+\u000e t:8(Oy.\u0004";
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                NumericComputationFramework.c = MultiContainerRegistry.a(-3507530212355321611L, -2023425800795471678L, MethodHandles.lookup().lookupClass()).a(123263197501702L);
                NumericComputationFramework.t = new Object[5];
                NumericComputationFramework.u = new String[5];
                NumericComputationFramework.a();
                NumericComputationFramework.m = new HashMap<K, V>(13);
                NumericComputationFramework.b(new AbstractComputationKernel[3]);
                var0 = NumericComputationFramework.c ^ 49034357012042L;
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
                var8_3 = new long[154];
                var5_4 = 0;
                var6_5 = "`\u000e\u00f3\u00dfo\u000f\u00f5,p\u008e\u000f\u0083\u0087@\u00e1\u0090g\u00c6~\u0095Z\u00d0\u0090\rEe\u009aR\u00ca\u00e0\u008cZ\u00b3\u0016\u0007\u00a34\u00e2\u00b2,\u00c3\u00b6\u001e\u00d67\u00e9\u00dc%\u00b3\u00e8i\u00ebB\u0091A\u00ceo\u008f\u0098;\u0098\u00d3t\u00aey9E\u0093<\u00e1\u00b1)\u0015\u0010\u008b:\u00ca\u00f0\u00c0_QA\\d\u00e7)\u0011\u0015M\u00ff1\u001a\u00e4\u0002Q\u00bc\u008f\u00b00O\u0099(;r\u00e8\u00d7B\u0093\u0080\u00d4\u00d3\u00e8\tc'\u0005l\u00b6F\u00fe\u00af\u0083N\u00a3|\u0092\rM\u00c0\u00b0:\"0\u00c1\u0006\u00a9\u0007\u00e4\u00a8\u00f5\u0084N\u00d3\u008c\u00b3\u0086\u008a*\u001e\u0083\u00ab['\u008bZ\u0097F\u0092>\u00c8\u00ae\u009eS\u0092!\u00fa\u00b1R\u00a4\u0000\u00a1\u000e\u0084\u001a\u00e6\u00ecK\u00abJ\u0099j5\u00e7\u00b4\u00fbr\u00a9\u00bf\u0004\u00d9\u00cf\u00bb\u00b4\u00f9\u0096WC\n\u00c0\u0088\u0088\u00e1J\u001e\b\b\u0019\u0094\u001e\r]\u00d3\u0001\u00fe\u00c2E\u00cc\u0007:\u00a1\u00f3N6,\u00c0\u001fF\u00d8M\u0090\u00b7\u000fT\u00df\u0094m\u00ffd\t\u00e8EM\u0002*\u00acn6\u00a7S\u0005\u000bI\u00d2\u00c0+\u000b\u0092,\u00e3\u0097\u00e1\u00bd\u0081D=\u000enG\u00e6L\u0087\u0019\u00db\\\u00e8\u0084W\u0099!\u00fc\u00a1\u00a1e\u0017e+\u00ba\u0092r\u00cb\u00f5|Xa\u00d4A\u0000\u00e8#\u0099\u0080\u0010m%ZW\u00c1\u0000\u00c69\u0019\u00c5y4\u00e1i\fS\\\u0012VRc\u00e4M\u00ea\n8)\u00f0\u00b0_T\u00e8\u001a\u00c0U\u00b8(\u00a6\u001c\b4A\u00a6@\u0094\u008b687{\u00c5\u008ci5\u00f8\u0005\u00c1Wv\u0097\u000ba\u0080\\\u00e4\u00a2\u0096P\u00d5d\b\u0015\u00f4\u000e\u0081f\u008ft\u009f7R\u00b8\u00bb\u00ac\u00f8\u00b9)\u00c3\u00c5P]\u0005\u00de_@\u00e0`N\u009b\u00a6\u00c4Ar\u00a8B\u00c8\u00e1\u0093\u0013\u009c\f\u0002\u00a6m\u00bfj\u009c\u00a4y\u0012|\u009e\u00caM%\u00daGq\u00f6\u00ac9\u00df\u00db\u00ec\u00c0Qwl\u00ee!\u0002\u008c\u00ea\u0005j?B\u0092\u00ce\u001b\u00ba\u0010vm{\u00e4\u00cc\u00c6\u00a4\u0086\u00da\u008b\u001f\u00ed<{t\u00adTq\u009eR\u00be\u00b4\u001bi\u00d9\u00bd\u001e\u00ddF\u00b68r=<wG\u00c1\u009e\u00f8g\u008f\u009d\u00d6n!\r\u00b7vAPX\u0001\u00ca\u00d5A\u001dY\u0095+\u00ed\u00c1+D~\u00fc>\u008f.\u008e\u00cd\u00e4|\u00b1\u0000\u00c7\u0099\u009fY@\u00dd\u00fe\u00d7\u00fb\u00c1>\u00f0V\u0004\u00cc\u00c7\u0083\u0096\u008a\u00a4\u0017\u00cc\u0082\u00dd\u00fd \u0094_\u00a3\u00cb*\u0096\u00dfd\u00f9-L\u00b5m\u00de\u00fe\u00ac\u00ba\u008f\b\u008a\u00b8\u00a6}YD\u00c0\u00fc\u0092L\u00b1\u00c9\u0010\u00bc\u00a1cx\u0094\u00df\u00f2\u0090I)\u0003\u00af\u00ac>\u00ef9\u00f9\u0011!\u00e3\u00fa\u001bNs\u0001\u0018t\u00f1\u00b1\u00a7\u008fsMm\u00cd\u00df\u0094Xy^S\u00c3\u00c1\u0019]\u00bas\u00b2T\u007f\u0011\u0086\r\u00de+\u000ex\u008d|\u00df\u0002]\u00d9\u0015\u00af\u00e6\u00c0\u0001rV\u0003\u00ca\u00a1\"\u0090[\u00bf\u00bb\u00f5\u00eb\u00f3\u0017 \u00cfd\u0017\u00a1 d\u00c4s[\n\u009b\u00da\u0086Rn\u0084\u00f0`\u00f9\u00ca\u00e4\u00a8O\u00a3\u00f9u\u00c5\u00a5\u0092.Pg\u0097\u00c7[dP<S\u009dAPp\u008d/\u0084\u00cfW\u00b8\u00cb\u00e8S\u00a4\u009e\u00f7k0\u001e>#`iS>\u0012my\u00a1\u00ec\n\u00e6\u0010\\WGzLp\u0013\u00f0\u009f{\u00f4\u00d57\u00b5\u00baV;7\u00f1\u008a\u009e\u0088V_|\u00d0A\\\u00b94x\u00f5\u00dc\u00a3Z\u00a0\u00af>\u001c\u00bfK-i_\u00ee\u00a7\u00e9\u00ca\u00c1\u0006\u00ce\u0004\u00a7\u0093\u00c36y\u00e0\u0098\u00c00\u00dcD\u00a8\u0085B#\u0004\u00e4\u00df\u00d0\u0085\u00b0\u00d3Y\u001a\u00ec7'[A\u00db)\u00be\u0015\u009f\u00ddY\u00c7S\u0019\u00f9%\u00c4]\u001b\u00efU\u00dc\u00c4\u00ad8?\u00fe\u00d6\\\"\u0010_6*\u00c9\u00dfnV\u007f\u00f1\u00bd\u00c7K\u00ffg\u00bd\u00c6`\u00da\u009bK\u00f6u\u0084\u008eK\u009ee\u00e0^\u001f\u00a02\u00cd\u001cq\u008c\u00c6\u0011\u0094\u00b7\tJS\u00f1K\u00c5\u00c5\u00d19\u00d4rh\u008eY\u00b8\u0000n\u00a1\u0086\u00a46D\u0092\u00b5`\u001d\u0005\u00c4!r3\u00d2E\u0013\tN5\u0080c~\u00db\u009e\u00d1\u0090\u008cB\u00bf\u00b4OY\u00fd<\u00a1\u0095\u0012\u00baZ\u0016Q>Fr\u00167[\u00e8\u00e0\u00b2\u0006m\u00c7\u0086\u00e82\u00e7\u00c9\u00cb\u00db\u00e2,Bhx\u00ea\u00b6\u00c9\u0085\u00db\u00c70l\u00c9)\u00b3\u00e3\u009f\u008d\u00e7aa\u00cb\u00df\u008d/\u001f\u00f1\u00bbE\u0019\u008a9\u0011\t\u0098\u0007\u00d2\u00dd\u00f0(\u00e8_K\u00ba\u00e0\u00f39\u00b0\u00bb\u00b6sO\u00a0\u00f2\u00ebt\u001e5\u00ec\\N\u00b2p\b\u00b2\u0097\u0013zh\u00a9\u0004\u00bb\u001c\u00cd\u00fd\u00c8\u001d\u0016\u00ae7f+\u00ff\u009cP\u00df\u00cf1F\u00b7\u0094\u0093\u0093\u00cf\u008f\u00ca\u0097B,\u0010\u00b3\u0097]\u00825p\u00b0o\u009e\u00f0k\u00a4\u00ab;\u00e9\u00feB\u00a2\u001a[\u00d6<\u00be\u00c8\u00c8\u009b\u00aa\u00e2\u00c6\u0087\u00a8x\u00e2\u00c89\u00bf\u00ab\u00bcMJ\u0081\u00df\u00d8\u00d3\u00fem\u00ae\u0004K]A\u000f\u001f\u00ea\u0012}\b8;\u0092\u00cb\u000e\u00840\u00ad\u00ede\u00day\u0011FY\u00ba\f\u001b&\u00a1\u00e6\u00fe\u008b\u0013\u0000\u001d\u00d3\u007f\u00cd\u00a02\u0081S8\f+\u00b0\u00d8\u00cc\u0089\u000e\u00feA(C\u00bb\u00a9\u001fmo\u0086*\u00c8\u0017\u00a4\u00fe\u00f5I\u00cb\u00f1\u00cc\u00f8:\u00ff_?%A~\u00b6\u00a5Y:\u0019\u00db\u00b9\u00b63\u00b8b\b>\u009a\u00b2\u0013O\u00b3:{ \u00db";
                var7_6 = "`\u000e\u00f3\u00dfo\u000f\u00f5,p\u008e\u000f\u0083\u0087@\u00e1\u0090g\u00c6~\u0095Z\u00d0\u0090\rEe\u009aR\u00ca\u00e0\u008cZ\u00b3\u0016\u0007\u00a34\u00e2\u00b2,\u00c3\u00b6\u001e\u00d67\u00e9\u00dc%\u00b3\u00e8i\u00ebB\u0091A\u00ceo\u008f\u0098;\u0098\u00d3t\u00aey9E\u0093<\u00e1\u00b1)\u0015\u0010\u008b:\u00ca\u00f0\u00c0_QA\\d\u00e7)\u0011\u0015M\u00ff1\u001a\u00e4\u0002Q\u00bc\u008f\u00b00O\u0099(;r\u00e8\u00d7B\u0093\u0080\u00d4\u00d3\u00e8\tc'\u0005l\u00b6F\u00fe\u00af\u0083N\u00a3|\u0092\rM\u00c0\u00b0:\"0\u00c1\u0006\u00a9\u0007\u00e4\u00a8\u00f5\u0084N\u00d3\u008c\u00b3\u0086\u008a*\u001e\u0083\u00ab['\u008bZ\u0097F\u0092>\u00c8\u00ae\u009eS\u0092!\u00fa\u00b1R\u00a4\u0000\u00a1\u000e\u0084\u001a\u00e6\u00ecK\u00abJ\u0099j5\u00e7\u00b4\u00fbr\u00a9\u00bf\u0004\u00d9\u00cf\u00bb\u00b4\u00f9\u0096WC\n\u00c0\u0088\u0088\u00e1J\u001e\b\b\u0019\u0094\u001e\r]\u00d3\u0001\u00fe\u00c2E\u00cc\u0007:\u00a1\u00f3N6,\u00c0\u001fF\u00d8M\u0090\u00b7\u000fT\u00df\u0094m\u00ffd\t\u00e8EM\u0002*\u00acn6\u00a7S\u0005\u000bI\u00d2\u00c0+\u000b\u0092,\u00e3\u0097\u00e1\u00bd\u0081D=\u000enG\u00e6L\u0087\u0019\u00db\\\u00e8\u0084W\u0099!\u00fc\u00a1\u00a1e\u0017e+\u00ba\u0092r\u00cb\u00f5|Xa\u00d4A\u0000\u00e8#\u0099\u0080\u0010m%ZW\u00c1\u0000\u00c69\u0019\u00c5y4\u00e1i\fS\\\u0012VRc\u00e4M\u00ea\n8)\u00f0\u00b0_T\u00e8\u001a\u00c0U\u00b8(\u00a6\u001c\b4A\u00a6@\u0094\u008b687{\u00c5\u008ci5\u00f8\u0005\u00c1Wv\u0097\u000ba\u0080\\\u00e4\u00a2\u0096P\u00d5d\b\u0015\u00f4\u000e\u0081f\u008ft\u009f7R\u00b8\u00bb\u00ac\u00f8\u00b9)\u00c3\u00c5P]\u0005\u00de_@\u00e0`N\u009b\u00a6\u00c4Ar\u00a8B\u00c8\u00e1\u0093\u0013\u009c\f\u0002\u00a6m\u00bfj\u009c\u00a4y\u0012|\u009e\u00caM%\u00daGq\u00f6\u00ac9\u00df\u00db\u00ec\u00c0Qwl\u00ee!\u0002\u008c\u00ea\u0005j?B\u0092\u00ce\u001b\u00ba\u0010vm{\u00e4\u00cc\u00c6\u00a4\u0086\u00da\u008b\u001f\u00ed<{t\u00adTq\u009eR\u00be\u00b4\u001bi\u00d9\u00bd\u001e\u00ddF\u00b68r=<wG\u00c1\u009e\u00f8g\u008f\u009d\u00d6n!\r\u00b7vAPX\u0001\u00ca\u00d5A\u001dY\u0095+\u00ed\u00c1+D~\u00fc>\u008f.\u008e\u00cd\u00e4|\u00b1\u0000\u00c7\u0099\u009fY@\u00dd\u00fe\u00d7\u00fb\u00c1>\u00f0V\u0004\u00cc\u00c7\u0083\u0096\u008a\u00a4\u0017\u00cc\u0082\u00dd\u00fd \u0094_\u00a3\u00cb*\u0096\u00dfd\u00f9-L\u00b5m\u00de\u00fe\u00ac\u00ba\u008f\b\u008a\u00b8\u00a6}YD\u00c0\u00fc\u0092L\u00b1\u00c9\u0010\u00bc\u00a1cx\u0094\u00df\u00f2\u0090I)\u0003\u00af\u00ac>\u00ef9\u00f9\u0011!\u00e3\u00fa\u001bNs\u0001\u0018t\u00f1\u00b1\u00a7\u008fsMm\u00cd\u00df\u0094Xy^S\u00c3\u00c1\u0019]\u00bas\u00b2T\u007f\u0011\u0086\r\u00de+\u000ex\u008d|\u00df\u0002]\u00d9\u0015\u00af\u00e6\u00c0\u0001rV\u0003\u00ca\u00a1\"\u0090[\u00bf\u00bb\u00f5\u00eb\u00f3\u0017 \u00cfd\u0017\u00a1 d\u00c4s[\n\u009b\u00da\u0086Rn\u0084\u00f0`\u00f9\u00ca\u00e4\u00a8O\u00a3\u00f9u\u00c5\u00a5\u0092.Pg\u0097\u00c7[dP<S\u009dAPp\u008d/\u0084\u00cfW\u00b8\u00cb\u00e8S\u00a4\u009e\u00f7k0\u001e>#`iS>\u0012my\u00a1\u00ec\n\u00e6\u0010\\WGzLp\u0013\u00f0\u009f{\u00f4\u00d57\u00b5\u00baV;7\u00f1\u008a\u009e\u0088V_|\u00d0A\\\u00b94x\u00f5\u00dc\u00a3Z\u00a0\u00af>\u001c\u00bfK-i_\u00ee\u00a7\u00e9\u00ca\u00c1\u0006\u00ce\u0004\u00a7\u0093\u00c36y\u00e0\u0098\u00c00\u00dcD\u00a8\u0085B#\u0004\u00e4\u00df\u00d0\u0085\u00b0\u00d3Y\u001a\u00ec7'[A\u00db)\u00be\u0015\u009f\u00ddY\u00c7S\u0019\u00f9%\u00c4]\u001b\u00efU\u00dc\u00c4\u00ad8?\u00fe\u00d6\\\"\u0010_6*\u00c9\u00dfnV\u007f\u00f1\u00bd\u00c7K\u00ffg\u00bd\u00c6`\u00da\u009bK\u00f6u\u0084\u008eK\u009ee\u00e0^\u001f\u00a02\u00cd\u001cq\u008c\u00c6\u0011\u0094\u00b7\tJS\u00f1K\u00c5\u00c5\u00d19\u00d4rh\u008eY\u00b8\u0000n\u00a1\u0086\u00a46D\u0092\u00b5`\u001d\u0005\u00c4!r3\u00d2E\u0013\tN5\u0080c~\u00db\u009e\u00d1\u0090\u008cB\u00bf\u00b4OY\u00fd<\u00a1\u0095\u0012\u00baZ\u0016Q>Fr\u00167[\u00e8\u00e0\u00b2\u0006m\u00c7\u0086\u00e82\u00e7\u00c9\u00cb\u00db\u00e2,Bhx\u00ea\u00b6\u00c9\u0085\u00db\u00c70l\u00c9)\u00b3\u00e3\u009f\u008d\u00e7aa\u00cb\u00df\u008d/\u001f\u00f1\u00bbE\u0019\u008a9\u0011\t\u0098\u0007\u00d2\u00dd\u00f0(\u00e8_K\u00ba\u00e0\u00f39\u00b0\u00bb\u00b6sO\u00a0\u00f2\u00ebt\u001e5\u00ec\\N\u00b2p\b\u00b2\u0097\u0013zh\u00a9\u0004\u00bb\u001c\u00cd\u00fd\u00c8\u001d\u0016\u00ae7f+\u00ff\u009cP\u00df\u00cf1F\u00b7\u0094\u0093\u0093\u00cf\u008f\u00ca\u0097B,\u0010\u00b3\u0097]\u00825p\u00b0o\u009e\u00f0k\u00a4\u00ab;\u00e9\u00feB\u00a2\u001a[\u00d6<\u00be\u00c8\u00c8\u009b\u00aa\u00e2\u00c6\u0087\u00a8x\u00e2\u00c89\u00bf\u00ab\u00bcMJ\u0081\u00df\u00d8\u00d3\u00fem\u00ae\u0004K]A\u000f\u001f\u00ea\u0012}\b8;\u0092\u00cb\u000e\u00840\u00ad\u00ede\u00day\u0011FY\u00ba\f\u001b&\u00a1\u00e6\u00fe\u008b\u0013\u0000\u001d\u00d3\u007f\u00cd\u00a02\u0081S8\f+\u00b0\u00d8\u00cc\u0089\u000e\u00feA(C\u00bb\u00a9\u001fmo\u0086*\u00c8\u0017\u00a4\u00fe\u00f5I\u00cb\u00f1\u00cc\u00f8:\u00ff_?%A~\u00b6\u00a5Y:\u0019\u00db\u00b9\u00b63\u00b8b\b>\u009a\u00b2\u0013O\u00b3:{ \u00db".length();
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
                    var6_5 = "4\u00e3L\u0086o\u0001A\u00eb\u0082\u00e7\u00bb\u00ed\u00b4o\u00b3\u00c8";
                    var7_6 = "4\u00e3L\u0086o\u0001A\u00eb\u0082\u00e7\u00bb\u00ed\u00b4o\u00b3\u00c8".length();
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
        NumericComputationFramework.d = var8_3;
        NumericComputationFramework.f = new Integer[154];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x47B1;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])m.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    m.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/IF", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            NumericComputationFramework.f[n2] = n3;
        }
        return f[n2];
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = NumericComputationFramework.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = NumericComputationFramework.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/IF" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static AbstractComputationKernel[] L() {
        return X;
    }

    /*
     * Unable to fully structure code
     */
    public boolean t(NumericComputationFramework var1_1) {
        block82: {
            block81: {
                block80: {
                    block78: {
                        block79: {
                            var2_2 = NumericComputationFramework.c ^ 35506113164371L;
                            var4_3 = new StringBuilder();
                            try {
                                if (this.s != var1_1.s) {
                                    var4_3.append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)17314, (long)(4971129318994859392L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(var1_1.s).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)6257, (long)(3593817724256718414L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(this.s).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)9664, (long)(3815007588639585123L ^ var2_2)), (long)5877800576798050438L, (long)var2_2));
                                }
                            }
                            catch (IllegalArgumentException v0) {
                                throw NumericComputationFramework.a(v0);
                            }
                            try {
                                if (this.D != var1_1.D) {
                                    var4_3.append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)12269, (long)(7153145477781305686L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(var1_1.D).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)9144, (long)(8821795876448679398L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(this.D).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)16588, (long)(5799156549233268448L ^ var2_2)), (long)5877800576798050438L, (long)var2_2));
                                }
                            }
                            catch (IllegalArgumentException v1) {
                                throw NumericComputationFramework.a(v1);
                            }
                            try {
                                if (this.l != var1_1.l) {
                                    var4_3.append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)27821, (long)(8582002899170163341L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(var1_1.l).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)5437, (long)(1852863784847049540L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(this.l).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)7661, (long)(7996539892876708859L ^ var2_2)), (long)5877800576798050438L, (long)var2_2));
                                }
                            }
                            catch (IllegalArgumentException v2) {
                                throw NumericComputationFramework.a(v2);
                            }
                            try {
                                try {
                                    if (!GameVersionEnumerator.MC_1_16_5.b()) break block78;
                                    if (this.Q == var1_1.Q) break block79;
                                }
                                catch (IllegalArgumentException v3) {
                                    throw NumericComputationFramework.a(v3);
                                }
                                var4_3.append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)129, (long)(3182701766207641256L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(var1_1.Q).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)23570, (long)(8420067357059172988L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(this.Q).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)15707, (long)(1500181304264305463L ^ var2_2)), (long)5877800576798050438L, (long)var2_2));
                            }
                            catch (IllegalArgumentException v4) {
                                throw NumericComputationFramework.a(v4);
                            }
                        }
                        try {
                            if (this.q != var1_1.q) {
                                var4_3.append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)25831, (long)(4281447138118595265L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(var1_1.q).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)17680, (long)(4900833214213575615L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(this.q).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)26232, (long)(5065303513071153155L ^ var2_2)), (long)5877800576798050438L, (long)var2_2));
                            }
                        }
                        catch (IllegalArgumentException v5) {
                            throw NumericComputationFramework.a(v5);
                        }
                        try {
                            if (this.J != var1_1.J) {
                                var4_3.append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)20753, (long)(2912889051875329972L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(var1_1.J).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)22568, (long)(4636316150819704397L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(this.J).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)3946, (long)(8875445538171099486L ^ var2_2)), (long)5877800576798050438L, (long)var2_2));
                            }
                        }
                        catch (IllegalArgumentException v6) {
                            throw NumericComputationFramework.a(v6);
                        }
                    }
                    try {
                        if (this.k != var1_1.k) {
                            var4_3.append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)26885, (long)(3289288117522694006L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(var1_1.k).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)25998, (long)(8710956896226014139L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(this.k).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)28969, (long)(1085559041605330775L ^ var2_2)), (long)5877800576798050438L, (long)var2_2));
                        }
                    }
                    catch (IllegalArgumentException v7) {
                        throw NumericComputationFramework.a(v7);
                    }
                    try {
                        if (this.G != var1_1.G) {
                            var4_3.append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)12310, (long)(2556037753090319982L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(var1_1.G).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)1027, (long)(3320951532323148386L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(this.G).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)2318, (long)(1716229220560281534L ^ var2_2)), (long)5877800576798050438L, (long)var2_2));
                        }
                    }
                    catch (IllegalArgumentException v8) {
                        throw NumericComputationFramework.a(v8);
                    }
                    try {
                        if (this.b != var1_1.b) {
                            var4_3.append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)26792, (long)(1291134150818856669L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(var1_1.b).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)5273, (long)(5094682896450290392L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(this.b).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)22126, (long)(6415240627553845359L ^ var2_2)), (long)5877800576798050438L, (long)var2_2));
                        }
                    }
                    catch (IllegalArgumentException v9) {
                        throw NumericComputationFramework.a(v9);
                    }
                    var5_4 = ConfigurationCalibrator.b.E();
                    var6_5 = var5_4 * 0.6f + 0.2f;
                    var7_6 = var6_5 * var6_5 * var6_5 * 8.0f;
                    var8_7 = (float)(0.0 + (double)var7_6 * 0.15);
                    try {
                        if (this.a != var1_1.a) {
                            var4_3.append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)7680, (long)(2571686337207601250L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(var1_1.a).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)30492, (long)(6640476335534366982L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(this.a).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)22947, (long)(4155488131564097510L ^ var2_2)), (long)5877800576798050438L, (long)var2_2));
                        }
                    }
                    catch (IllegalArgumentException v10) {
                        throw NumericComputationFramework.a(v10);
                    }
                    try {
                        if (this.i != var1_1.i) {
                            var4_3.append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)9963, (long)(6414941218897506548L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(var1_1.i).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)12912, (long)(3685707683636847617L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(this.i).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)23736, (long)(4119218046559144466L ^ var2_2)), (long)5877800576798050438L, (long)var2_2));
                        }
                    }
                    catch (IllegalArgumentException v11) {
                        throw NumericComputationFramework.a(v11);
                    }
                    try {
                        if (this.A != var1_1.A) {
                            var4_3.append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)24973, (long)(8135123522158851979L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(var1_1.A).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)14613, (long)(886091172966641587L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(this.A).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)24889, (long)(5964982005534816034L ^ var2_2)), (long)5877800576798050438L, (long)var2_2));
                        }
                    }
                    catch (IllegalArgumentException v12) {
                        throw NumericComputationFramework.a(v12);
                    }
                    try {
                        if (this.K != var1_1.K) {
                            var4_3.append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)3035, (long)(7128715240367889770L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(var1_1.K).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)13148, (long)(6600294648038106446L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(this.K).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)13169, (long)(5076772497939080666L ^ var2_2)), (long)5877800576798050438L, (long)var2_2));
                        }
                    }
                    catch (IllegalArgumentException v13) {
                        throw NumericComputationFramework.a(v13);
                    }
                    try {
                        if (this.g != var1_1.g) {
                            var4_3.append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)11386, (long)(7982499241185720883L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(var1_1.g).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)550, (long)(8505020607192077348L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(this.g).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)3849, (long)(4539520502837287242L ^ var2_2)), (long)5877800576798050438L, (long)var2_2));
                        }
                    }
                    catch (IllegalArgumentException v14) {
                        throw NumericComputationFramework.a(v14);
                    }
                    try {
                        if (this.j != var1_1.j) {
                            var4_3.append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)16919, (long)(4910769845642286173L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(var1_1.j).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)8561, (long)(6435970210638706449L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(this.j).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)16062, (long)(3148888428364802193L ^ var2_2)), (long)5877800576798050438L, (long)var2_2));
                        }
                    }
                    catch (IllegalArgumentException v15) {
                        throw NumericComputationFramework.a(v15);
                    }
                    try {
                        if (this.M != var1_1.M) {
                            var4_3.append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)21463, (long)(4906293885089891706L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(var1_1.M).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)20312, (long)(5754459861738576167L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(this.M).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)5239, (long)(4396553713760141871L ^ var2_2)), (long)5877800576798050438L, (long)var2_2));
                        }
                    }
                    catch (IllegalArgumentException v16) {
                        throw NumericComputationFramework.a(v16);
                    }
                    try {
                        if (this.x != var1_1.x) {
                            var4_3.append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)25667, (long)(2707038631443427915L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(var1_1.x).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)8425, (long)(8571413632459814633L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(this.x).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)16764, (long)(3807027620959115128L ^ var2_2)), (long)5877800576798050438L, (long)var2_2));
                        }
                    }
                    catch (IllegalArgumentException v17) {
                        throw NumericComputationFramework.a(v17);
                    }
                    try {
                        if (this.r != var1_1.r) {
                            var4_3.append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)30476, (long)(2447968784985022760L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(var1_1.r).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)9413, (long)(315378035175043731L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(this.r).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)20601, (long)(4905814259002689074L ^ var2_2)), (long)5877800576798050438L, (long)var2_2));
                        }
                    }
                    catch (IllegalArgumentException v18) {
                        throw NumericComputationFramework.a(v18);
                    }
                    try {
                        if (this.n != var1_1.n) {
                            var4_3.append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)24228, (long)(9017028147751700656L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(var1_1.n).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)20856, (long)(4623971480508188431L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(this.n).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)29314, (long)(6469833219915932812L ^ var2_2)), (long)5877800576798050438L, (long)var2_2));
                        }
                    }
                    catch (IllegalArgumentException v19) {
                        throw NumericComputationFramework.a(v19);
                    }
                    try {
                        if (this.z != var1_1.z) {
                            var4_3.append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)2488, (long)(4215182197411618728L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(var1_1.z).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)17249, (long)(4733496651718710530L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(this.z).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)17723, (long)(768308650908799761L ^ var2_2)), (long)5877800576798050438L, (long)var2_2));
                        }
                    }
                    catch (IllegalArgumentException v20) {
                        throw NumericComputationFramework.a(v20);
                    }
                    try {
                        if (this.L != var1_1.L) {
                            var4_3.append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)3505, (long)(1811538406024485875L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(var1_1.L).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)1251, (long)(739515048105939633L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(this.L).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)2182, (long)(4889451484859997742L ^ var2_2)), (long)5877800576798050438L, (long)var2_2));
                        }
                    }
                    catch (IllegalArgumentException v21) {
                        throw NumericComputationFramework.a(v21);
                    }
                    try {
                        if (this.W != var1_1.W) {
                            var4_3.append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)12188, (long)(3759794289856133549L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(var1_1.W).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)25275, (long)(3402502679827870860L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(this.W).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)22410, (long)(3539688667373191618L ^ var2_2)), (long)5877800576798050438L, (long)var2_2));
                        }
                    }
                    catch (IllegalArgumentException v22) {
                        throw NumericComputationFramework.a(v22);
                    }
                    try {
                        if (this.e == null || var1_1.e == null) break block80;
                    }
                    catch (IllegalArgumentException v23) {
                        throw NumericComputationFramework.a(v23);
                    }
                    var9_8 = this.e.m(var1_1.e);
                    try {
                        if (var9_8.isEmpty()) ** GOTO lbl207
                        var4_3.append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)24206, (long)(8133996468586825956L ^ var2_2)), (long)5877800576798050438L, (long)var2_2));
                        var4_3.append(var9_8);
                    }
                    catch (IllegalArgumentException v24) {
                        throw NumericComputationFramework.a(v24);
                    }
                }
                var9_9 = AdaptiveComputationEngine.v(var1_1.H - this.H);
                try {
                    if (this.H == var1_1.H || !(var9_9 >= var8_7)) break block81;
                }
                catch (IllegalArgumentException v25) {
                    throw NumericComputationFramework.a(v25);
                }
                var4_3.append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)22731, (long)(2847315773528624846L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(var1_1.H).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)13397, (long)(2947288125396525587L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(this.H).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)21761, (long)(8373504214100722487L ^ var2_2)), (long)5877800576798050438L, (long)var2_2));
                var10_10 = var9_9 / var8_7;
                var4_3.append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)30906, (long)(9169116989355617804L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(var10_10).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)16731, (long)(6333226498276743151L ^ var2_2)), (long)5877800576798050438L, (long)var2_2));
            }
            var10_10 = AdaptiveComputationEngine.v(var1_1.p - this.p);
            try {
                if (this.p == var1_1.p || !(var10_10 >= var8_7)) break block82;
            }
            catch (IllegalArgumentException v26) {
                throw NumericComputationFramework.a(v26);
            }
            var4_3.append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)2835, (long)(1947080231896685993L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(var1_1.p).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)13589, (long)(5320356059051205440L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(this.p).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)4160, (long)(2273645886646847096L ^ var2_2)), (long)5877800576798050438L, (long)var2_2));
            var11_11 = var10_10 / var8_7;
            var4_3.append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)29215, (long)(8199962371846104243L ^ var2_2)), (long)5877800576798050438L, (long)var2_2)).append(var11_11).append((String)NumericComputationFramework.b("R", (int)NumericComputationFramework.a("i", (int)23365, (long)(6041196271324876279L ^ var2_2)), (long)5877800576798050438L, (long)var2_2));
        }
        if (var4_3.length() > 0) {
            // empty if block
        }
        try {
            v27 = var4_3.length() == 0;
        }
        catch (IllegalArgumentException v28) {
            throw NumericComputationFramework.a(v28);
        }
        return v27;
    }

    private GeometricTransformationEngine708 z(RandomGenerationEngine randomGenerationEngine) {
        GeometricTransformationEngine708 geometricTransformationEngine708;
        block2: {
            block3: {
                geometricTransformationEngine708 = null;
                try {
                    if (randomGenerationEngine == null) break block2;
                    if (!(randomGenerationEngine instanceof CryptographicSecurityProvider)) break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw NumericComputationFramework.a(illegalArgumentException);
                }
                geometricTransformationEngine708 = new GeometricTransformationEngine708((CryptographicSecurityProvider)randomGenerationEngine);
                break block2;
            }
            geometricTransformationEngine708 = new GeometricTransformationEngine708(randomGenerationEngine, this.H, this.p);
        }
        return geometricTransformationEngine708;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = NumericComputationFramework.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = NumericComputationFramework.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(NumericComputationFramework.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(NumericComputationFramework.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

