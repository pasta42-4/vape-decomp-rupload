/*
 * Decompiled with CFR 0.152.
 */
package com.graphics.animation;

import a._Y;
import a.a;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.math.geometry.GeometricComputationEngine;
import com.numeric.precision.NumericPrecisionTransformer;
import com.output.processing.OutputEncoder;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.security.cryptography.CryptoKeyManagementSystem;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.management.TransactionOrchestrator1017;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class AnimationCurveGenerator
extends ContextualExecutionFramework {
    private boolean L;
    private static final Integer[] e;
    private static final Map h;
    private final NumericPrecisionTransformer Z;
    private final NumericPrecisionTransformer t;
    private static final long[] d;
    private GeometricComputationEngine A;
    private static final String[] l;
    private static final Object[] j;
    private final NumericPrecisionTransformer r;
    private final NumericPrecisionTransformer G;
    private static final long b;

    @Override
    public void W() {
        block38: {
            boolean bl;
            double d2;
            double d3;
            SystemConfigurationOrchestrator systemConfigurationOrchestrator;
            block37: {
                block36: {
                    try {
                        if (ApplicationLifecycleManager.X().r()) {
                            return;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AnimationCurveGenerator.a(customSystemException);
                    }
                    systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                    ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192 = ApplicationLifecycleManager.N().w();
                    boolean bl2 = DynamicContextBroker.s(connectionPoolOrchestrator1192);
                    OutputEncoder.f(ApplicationLifecycleManager.N().w(), bl2);
                    d3 = (Double)this.t.J();
                    d2 = (Double)this.Z.J() / 5.0;
                    d2 *= 0.1;
                    try {
                        try {
                            if (!this.A.Z() || this.A.A() == null) break block36;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AnimationCurveGenerator.a(customSystemException);
                        }
                        bl = true;
                        break block37;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AnimationCurveGenerator.a(customSystemException);
                    }
                }
                bl = false;
            }
            boolean bl3 = bl;
            TransactionOrchestrator1017 transactionOrchestrator1017 = new TransactionOrchestrator1017(this.A.A());
            try {
                if (transactionOrchestrator1017.Y()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AnimationCurveGenerator.a(customSystemException);
            }
            boolean bl4 = _Y.X(systemConfigurationOrchestrator, transactionOrchestrator1017, (Double)this.r.J() / 2.0);
            boolean bl5 = _Y.X(transactionOrchestrator1017, systemConfigurationOrchestrator, (Double)this.G.J() / 2.0);
            try {
                try {
                    if (!bl3 || !bl4) break block38;
                }
                catch (CustomSystemException customSystemException) {
                    throw AnimationCurveGenerator.a(customSystemException);
                }
                if (!bl5) break block38;
            }
            catch (CustomSystemException customSystemException) {
                throw AnimationCurveGenerator.a(customSystemException);
            }
            double d4 = systemConfigurationOrchestrator.y(transactionOrchestrator1017);
            try {
                try {
                    try {
                        try {
                            try {
                                if (!(d4 < d3) || systemConfigurationOrchestrator.F()) break block38;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AnimationCurveGenerator.a(customSystemException);
                            }
                            if (systemConfigurationOrchestrator.P()) break block38;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AnimationCurveGenerator.a(customSystemException);
                        }
                        if (systemConfigurationOrchestrator.T()) break block38;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AnimationCurveGenerator.a(customSystemException);
                    }
                    if (!systemConfigurationOrchestrator.j()) break block38;
                }
                catch (CustomSystemException customSystemException) {
                    throw AnimationCurveGenerator.a(customSystemException);
                }
                if (systemConfigurationOrchestrator.w()) break block38;
            }
            catch (CustomSystemException customSystemException) {
                throw AnimationCurveGenerator.a(customSystemException);
            }
            double d5 = transactionOrchestrator1017.F();
            double d6 = transactionOrchestrator1017.B();
            try {
                if (systemConfigurationOrchestrator.F() - d5 > 0.5) {
                    systemConfigurationOrchestrator.t(systemConfigurationOrchestrator.G() + d2);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AnimationCurveGenerator.a(customSystemException);
            }
            try {
                if (systemConfigurationOrchestrator.F() - d5 < 0.5) {
                    systemConfigurationOrchestrator.t(systemConfigurationOrchestrator.G() - d2);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AnimationCurveGenerator.a(customSystemException);
            }
            try {
                if (systemConfigurationOrchestrator.B() - d6 > 0.5) {
                    systemConfigurationOrchestrator.s(systemConfigurationOrchestrator.o() + d2);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AnimationCurveGenerator.a(customSystemException);
            }
            try {
                if (systemConfigurationOrchestrator.B() - d6 < 0.5) {
                    systemConfigurationOrchestrator.s(systemConfigurationOrchestrator.o() - d2);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AnimationCurveGenerator.a(customSystemException);
            }
            this.L = true;
        }
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (AnimationCurveGenerator.l[n4] != null) {
            return n4;
        }
        Object object = j[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 9;
                break;
            }
            case 1: {
                n3 = 30;
                break;
            }
            case 2: {
                n3 = 18;
                break;
            }
            case 3: {
                n3 = 21;
                break;
            }
            case 4: {
                n3 = 7;
                break;
            }
            case 5: {
                n3 = 11;
                break;
            }
            case 6: {
                n3 = 38;
                break;
            }
            case 7: {
                n3 = 28;
                break;
            }
            case 8: {
                n3 = 24;
                break;
            }
            case 9: {
                n3 = 60;
                break;
            }
            case 10: {
                n3 = 26;
                break;
            }
            case 11: {
                n3 = 17;
                break;
            }
            case 12: {
                n3 = 8;
                break;
            }
            case 13: {
                n3 = 19;
                break;
            }
            case 14: {
                n3 = 63;
                break;
            }
            case 15: {
                n3 = 32;
                break;
            }
            case 16: {
                n3 = 16;
                break;
            }
            case 17: {
                n3 = 20;
                break;
            }
            case 18: {
                n3 = 53;
                break;
            }
            case 19: {
                n3 = 44;
                break;
            }
            case 20: {
                n3 = 49;
                break;
            }
            case 21: {
                n3 = 42;
                break;
            }
            case 22: {
                n3 = 25;
                break;
            }
            case 23: {
                n3 = 57;
                break;
            }
            case 24: {
                n3 = 15;
                break;
            }
            case 25: {
                n3 = 4;
                break;
            }
            case 26: {
                n3 = 31;
                break;
            }
            case 27: {
                n3 = 1;
                break;
            }
            case 28: {
                n3 = 56;
                break;
            }
            case 29: {
                n3 = 37;
                break;
            }
            case 30: {
                n3 = 50;
                break;
            }
            case 31: {
                n3 = 27;
                break;
            }
            case 32: {
                n3 = 52;
                break;
            }
            case 33: {
                n3 = 34;
                break;
            }
            case 34: {
                n3 = 22;
                break;
            }
            case 35: {
                n3 = 61;
                break;
            }
            case 36: {
                n3 = 6;
                break;
            }
            case 37: {
                n3 = 47;
                break;
            }
            case 38: {
                n3 = 41;
                break;
            }
            case 39: {
                n3 = 2;
                break;
            }
            case 40: {
                n3 = 45;
                break;
            }
            case 41: {
                n3 = 46;
                break;
            }
            case 42: {
                n3 = 58;
                break;
            }
            case 43: {
                n3 = 14;
                break;
            }
            case 44: {
                n3 = 39;
                break;
            }
            case 45: {
                n3 = 36;
                break;
            }
            case 46: {
                n3 = 0;
                break;
            }
            case 47: {
                n3 = 5;
                break;
            }
            case 48: {
                n3 = 48;
                break;
            }
            case 49: {
                n3 = 51;
                break;
            }
            case 50: {
                n3 = 12;
                break;
            }
            case 51: {
                n3 = 40;
                break;
            }
            case 52: {
                n3 = 35;
                break;
            }
            case 53: {
                n3 = 29;
                break;
            }
            case 54: {
                n3 = 54;
                break;
            }
            case 55: {
                n3 = 3;
                break;
            }
            case 56: {
                n3 = 23;
                break;
            }
            case 57: {
                n3 = 33;
                break;
            }
            case 58: {
                n3 = 10;
                break;
            }
            case 59: {
                n3 = 43;
                break;
            }
            case 60: {
                n3 = 59;
                break;
            }
            case 61: {
                n3 = 13;
                break;
            }
            case 62: {
                n3 = 62;
                break;
            }
            default: {
                n3 = 55;
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
        AnimationCurveGenerator.l[n4] = new String(cArray);
        return n4;
    }

    public AnimationCurveGenerator() {
        long l = b ^ 0x7D8692809051L;
        super(a.cs((int)AnimationCurveGenerator.a("m", (int)14301, (long)(0x13456D37A5288049L ^ l))), -256, RecursiveNodeGraph.G);
        this.t = NumericPrecisionTransformer.N(this, (String)((Object)AnimationCurveGenerator.c("\u00c5", (int)AnimationCurveGenerator.a("m", (int)24397, (long)(0x38845D31ED40E8DBL ^ l)), (long)8388284353969320617L, (long)l)), (String)((Object)AnimationCurveGenerator.c("\u00c5", (int)AnimationCurveGenerator.a("m", (int)29726, (long)(0x17175FF53F0C38FL ^ l)), (long)8388284353969320617L, (long)l)), "", 0.1, 3.3, 6.0, 0.1);
        this.Z = NumericPrecisionTransformer.t(this, (String)((Object)AnimationCurveGenerator.c("\u00c5", (int)AnimationCurveGenerator.a("m", (int)6846, (long)(0x79F02D4B74522D2BL ^ l)), (long)8388284353969320617L, (long)l)), (String)((Object)AnimationCurveGenerator.c("\u00c5", (int)AnimationCurveGenerator.a("m", (int)2577, (long)(0x5F6A588115E93D88L ^ l)), (long)8388284353969320617L, (long)l)), "", 0.1, 0.5, 1.0);
        this.r = NumericPrecisionTransformer.t(this, (String)((Object)AnimationCurveGenerator.c("\u00c5", (int)AnimationCurveGenerator.a("m", (int)1299, (long)(0x11E092A66BCA3281L ^ l)), (long)8388284353969320617L, (long)l)), (String)((Object)AnimationCurveGenerator.c("\u00c5", (int)AnimationCurveGenerator.a("m", (int)7104, (long)(0x2F7A02F21947AC53L ^ l)), (long)8388284353969320617L, (long)l)), "", 1.0, 120.0, 360.0);
        this.G = NumericPrecisionTransformer.t(this, (String)((Object)AnimationCurveGenerator.c("\u00c5", (int)AnimationCurveGenerator.a("m", (int)6734, (long)(0x15B4FB094CAEADD9L ^ l)), (long)8388284353969320617L, (long)l)), (String)((Object)AnimationCurveGenerator.c("\u00c5", (int)AnimationCurveGenerator.a("m", (int)7755, (long)(0x7B832FF17CCAA9DBL ^ l)), (long)8388284353969320617L, (long)l)), "", 1.0, 90.0, 360.0);
        this.N(this.t, this.Z, this.r, this.G);
        this.K(10L, true);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/A4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'x' || c == 'z' || c == 'B' || c == 'K') {
                field = AnimationCurveGenerator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'x' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'z' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'B' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = AnimationCurveGenerator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ee' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = AnimationCurveGenerator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = j;
        j[0] = "\u0001)O";
        objectArray[1] = Integer.TYPE;
        AnimationCurveGenerator.l[1] = "java/lang/Integer";
        objectArray[2] = "\u00026hX-;\t9y\u0017P#\u001a>p^";
        objectArray[3] = "+[|Som Tm\u001c\u000ec+_iF";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "yV\tf~\f'U^\u000beI@C\fv\u007f^y\\K3\u000e\u000b-\u000f\u0003abPzUL\u000b";
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/A4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method d(long l, long l2) {
        int n = AnimationCurveGenerator.a(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = AnimationCurveGenerator.l[n];
                int n3 = string2.indexOf(8);
                clazz3 = AnimationCurveGenerator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = AnimationCurveGenerator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = AnimationCurveGenerator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        AnimationCurveGenerator.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = AnimationCurveGenerator.b(263222820566572L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = AnimationCurveGenerator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        AnimationCurveGenerator.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = AnimationCurveGenerator.b(263222820566572L, 0L);
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

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void b() {
        this.A = TemporalMetadataResolver.h.U().K(GeometricComputationEngine.class);
    }

    @DataExchangeProtocol2090
    public void w(CryptoKeyManagementSystem cryptoKeyManagementSystem) {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        try {
            if (this.L) {
                systemConfigurationOrchestrator.h(false);
                this.L = false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AnimationCurveGenerator.a(customSystemException);
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = AnimationCurveGenerator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = AnimationCurveGenerator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = AnimationCurveGenerator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = AnimationCurveGenerator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = AnimationCurveGenerator.a(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            String string = AnimationCurveGenerator.l[n];
            int n2 = string.indexOf(8);
            Class clazz = AnimationCurveGenerator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = AnimationCurveGenerator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = AnimationCurveGenerator.a(clazz3, string2, clazz2)) != null) {
                    AnimationCurveGenerator.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = AnimationCurveGenerator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        AnimationCurveGenerator.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = AnimationCurveGenerator.b(263222820566572L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = AnimationCurveGenerator.a(l, l2);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                AnimationCurveGenerator.j[n] = clazz = Class.forName(AnimationCurveGenerator.l[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                AnimationCurveGenerator.b = MultiContainerRegistry.a(5309048957229378376L, 1195040032578474101L, MethodHandles.lookup().lookupClass()).a(125319866427576L);
                AnimationCurveGenerator.j = new Object[5];
                AnimationCurveGenerator.l = new String[5];
                AnimationCurveGenerator.a();
                AnimationCurveGenerator.h = new HashMap<K, V>(13);
                var0 = AnimationCurveGenerator.b ^ 93460915425663L;
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
                var6_5 = "\u008b\u008dK\u009a\u00b2?x\u00ad@\u00c9{.\u0004?1*j\u00a7\u0088\u00e9\u0084W\u0002%\u00bd\u00cf\u00c9/\u00ae\u0015*\u00c2\u00c0\u00d5\u009a!3\u001a\u00cc\u0093\\[[\u00a5\u00f5\u00c6\u00c2<\u00a6\u00c6\u00da\u00a6\u0002\u00bdM?";
                var7_6 = "\u008b\u008dK\u009a\u00b2?x\u00ad@\u00c9{.\u0004?1*j\u00a7\u0088\u00e9\u0084W\u0002%\u00bd\u00cf\u00c9/\u00ae\u0015*\u00c2\u00c0\u00d5\u009a!3\u001a\u00cc\u0093\\[[\u00a5\u00f5\u00c6\u00c2<\u00a6\u00c6\u00da\u00a6\u0002\u00bdM?".length();
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
                    var6_5 = "o\u001bT\u00b5\u0005c/\nB\u00ef\u00cf\t/\u0005K\u00c1";
                    var7_6 = "o\u001bT\u00b5\u0005c/\nB\u00ef\u00cf\t/\u0005K\u00c1".length();
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
        AnimationCurveGenerator.d = var8_3;
        AnimationCurveGenerator.e = new Integer[9];
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

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x43F9;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/A4", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AnimationCurveGenerator.e[n2] = n3;
        }
        return e[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = AnimationCurveGenerator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AnimationCurveGenerator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(AnimationCurveGenerator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

