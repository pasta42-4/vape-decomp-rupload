/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.lwjgl.opengl.GL11
 */
package com.math.transformation;

import a.E8;
import a.Ne;
import a.Qh;
import a.tl;
import com.algorithm.bitmanipulation.BitwiseOperationResolver;
import com.app.data.transformation.DataTransformationEngine1165;
import com.collections.management.MultiContainerRegistry;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.flow.DataFlowAnalyzer;
import com.data.streaming.DataStreamProcessor1600;
import com.data.transformation.DataTransformationEngine1209;
import com.event.core.EventDispatcher;
import com.exception.system.CustomSystemException;
import com.financial.transactions.TransactionValidator1679;
import com.game.configuration.GameVersionEnumerator;
import com.math.computation.NumericComputationEngine1131;
import com.math.geometry.GeometryCalculator;
import com.memory.management.BufferOrchestrator;
import com.network.transmission.PacketTransmissionController;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.runtime.context.LightweightExecutionContext;
import com.runtime.context.RuntimeContextResolver;
import com.security.crypto.CryptographicSessionController;
import com.security.transform.SecureDataTransformer881;
import com.system.configuration.ConfigurationManager;
import com.transaction.flow.TransactionFlowController;
import com.version.management.VersionController;
import java.awt.Color;
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
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;

public class NumericTransformationService {
    private static final Integer[] c;
    private static final Map d;
    private static final Object[] e;
    private final long Y;
    private static final long[] b;
    private final double D;
    private static final long a;
    private final BufferOrchestrator N;
    private static final String[] f;
    private final double u;

    private static void I(LightweightExecutionContext lightweightExecutionContext, float f, float f2) {
        block18: {
            boolean bl;
            boolean bl2;
            block21: {
                DataTransformationEngine1209 dataTransformationEngine1209;
                SecureDataTransformer881 secureDataTransformer881;
                block20: {
                    block19: {
                        try {
                            try {
                                if (!ConfigurationManager.U()) break block18;
                                if (!GameVersionEnumerator.MC_1_21_10.H()) break block19;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NumericTransformationService.a(customSystemException);
                            }
                            ConfigurationManager.h(lightweightExecutionContext, 1.0, f, -2.0, true);
                            return;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NumericTransformationService.a(customSystemException);
                        }
                    }
                    bl2 = GL11.glIsEnabled((int)2929);
                    bl = GL11.glIsEnabled((int)3042);
                    try {
                        if (!bl2) {
                            Ne.h.y(2929);
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericTransformationService.a(customSystemException);
                    }
                    try {
                        if (!bl) {
                            Ne.h.y(3042);
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericTransformationService.a(customSystemException);
                    }
                    secureDataTransformer881 = ApplicationLifecycleManager.g();
                    dataTransformationEngine1209 = DataTransformationEngine1209.i();
                    dataTransformationEngine1209.g();
                    float f3 = (float)ApplicationLifecycleManager.l().k(ApplicationLifecycleManager.N().p(), false) / 2.0f;
                    float f4 = 1.0f / f3;
                    try {
                        dataTransformationEngine1209.s(f4, f4, f4);
                        dataTransformationEngine1209.s((float)ApplicationLifecycleManager.e() / f2 / 2.0f, (float)ApplicationLifecycleManager.b() / 36.0f, 0.0f);
                        if (GeometryCalculator.C() < 50) break block20;
                        secureDataTransformer881.p(DataTransformationEngine1165.F(dataTransformationEngine1209), lightweightExecutionContext, (int)f, 0);
                        break block21;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericTransformationService.a(customSystemException);
                    }
                }
                secureDataTransformer881.b(lightweightExecutionContext, (int)f, -2, dataTransformationEngine1209);
            }
            try {
                if (!bl2) {
                    Ne.h.z(2929);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw NumericTransformationService.a(customSystemException);
            }
            try {
                if (!bl) {
                    Ne.h.z(3042);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw NumericTransformationService.a(customSystemException);
            }
            return;
        }
        ConfigurationManager.h(lightweightExecutionContext, 1.0, f, -2.0, true);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = NumericTransformationService.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(-2565412821024046965L, 2792650730221815527L, MethodHandles.lookup().lookupClass()).a(40894480757605L);
        e = new Object[5];
        f = new String[5];
        NumericTransformationService.a();
        d = new HashMap(13);
        long l = a ^ 0x4E1983A69CB2L;
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
        String string = "\u0091\u00c4\u00d8L\u008e\u008343\u00ae\u00ab\u0007\u00f9\u00bc\u00c7\u00c1Q\u00bb \r\\\u00b2\u00c4\u00e0.";
        int n2 = "\u0091\u00c4\u00d8L\u008e\u008343\u00ae\u00ab\u0007\u00f9\u00bc\u00c7\u00c1Q\u00bb \r\\\u00b2\u00c4\u00e0.".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[3];
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\u0017G'";
        objectArray[1] = Integer.TYPE;
        NumericTransformationService.f[1] = "java/lang/Integer";
        objectArray[2] = "#WUK#\u000e(XD\u0004^\u0016;_MM";
        objectArray[3] = "vT=\r\u000bu}[,Bj{vP(\u0018";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "/@9jdJ2FeS6\u0000L\u001e`32\u0001-Wbk0{uK,2/\u0016 ]a.]";
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f[n4] != null) {
            return n4;
        }
        Object object = e[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 16;
                break;
            }
            case 1: {
                n3 = 37;
                break;
            }
            case 2: {
                n3 = 19;
                break;
            }
            case 3: {
                n3 = 15;
                break;
            }
            case 4: {
                n3 = 41;
                break;
            }
            case 5: {
                n3 = 59;
                break;
            }
            case 6: {
                n3 = 2;
                break;
            }
            case 7: {
                n3 = 25;
                break;
            }
            case 8: {
                n3 = 12;
                break;
            }
            case 9: {
                n3 = 40;
                break;
            }
            case 10: {
                n3 = 26;
                break;
            }
            case 11: {
                n3 = 56;
                break;
            }
            case 12: {
                n3 = 18;
                break;
            }
            case 13: {
                n3 = 44;
                break;
            }
            case 14: {
                n3 = 4;
                break;
            }
            case 15: {
                n3 = 50;
                break;
            }
            case 16: {
                n3 = 36;
                break;
            }
            case 17: {
                n3 = 62;
                break;
            }
            case 18: {
                n3 = 39;
                break;
            }
            case 19: {
                n3 = 9;
                break;
            }
            case 20: {
                n3 = 23;
                break;
            }
            case 21: {
                n3 = 32;
                break;
            }
            case 22: {
                n3 = 20;
                break;
            }
            case 23: {
                n3 = 43;
                break;
            }
            case 24: {
                n3 = 33;
                break;
            }
            case 25: {
                n3 = 21;
                break;
            }
            case 26: {
                n3 = 0;
                break;
            }
            case 27: {
                n3 = 17;
                break;
            }
            case 28: {
                n3 = 61;
                break;
            }
            case 29: {
                n3 = 47;
                break;
            }
            case 30: {
                n3 = 31;
                break;
            }
            case 31: {
                n3 = 27;
                break;
            }
            case 32: {
                n3 = 60;
                break;
            }
            case 33: {
                n3 = 63;
                break;
            }
            case 34: {
                n3 = 54;
                break;
            }
            case 35: {
                n3 = 29;
                break;
            }
            case 36: {
                n3 = 34;
                break;
            }
            case 37: {
                n3 = 49;
                break;
            }
            case 38: {
                n3 = 51;
                break;
            }
            case 39: {
                n3 = 45;
                break;
            }
            case 40: {
                n3 = 58;
                break;
            }
            case 41: {
                n3 = 57;
                break;
            }
            case 42: {
                n3 = 35;
                break;
            }
            case 43: {
                n3 = 38;
                break;
            }
            case 44: {
                n3 = 5;
                break;
            }
            case 45: {
                n3 = 8;
                break;
            }
            case 46: {
                n3 = 53;
                break;
            }
            case 47: {
                n3 = 28;
                break;
            }
            case 48: {
                n3 = 48;
                break;
            }
            case 49: {
                n3 = 13;
                break;
            }
            case 50: {
                n3 = 7;
                break;
            }
            case 51: {
                n3 = 10;
                break;
            }
            case 52: {
                n3 = 1;
                break;
            }
            case 53: {
                n3 = 6;
                break;
            }
            case 54: {
                n3 = 52;
                break;
            }
            case 55: {
                n3 = 55;
                break;
            }
            case 56: {
                n3 = 14;
                break;
            }
            case 57: {
                n3 = 24;
                break;
            }
            case 58: {
                n3 = 22;
                break;
            }
            case 59: {
                n3 = 46;
                break;
            }
            case 60: {
                n3 = 11;
                break;
            }
            case 61: {
                n3 = 30;
                break;
            }
            case 62: {
                n3 = 42;
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
        NumericTransformationService.f[n4] = new String(cArray);
        return n4;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = NumericTransformationService.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = NumericTransformationService.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static NumericTransformationService g(Qh qh) {
        long l = a ^ 0x2AC6A140DA9DL;
        long l2 = BitwiseOperationResolver.b(qh);
        LightweightExecutionContext[] lightweightExecutionContextArray = BitwiseOperationResolver.l(qh);
        int n = 0;
        for (LightweightExecutionContext lightweightExecutionContextArray2 : lightweightExecutionContextArray) {
            try {
                if (lightweightExecutionContextArray2 == null) continue;
                n += 18;
            }
            catch (CustomSystemException customSystemException) {
                throw NumericTransformationService.a(customSystemException);
            }
        }
        ConfigurationManager.a();
        BufferOrchestrator bufferOrchestrator = new BufferOrchestrator(0, -2, n -= 2, 18);
        try {
            if (ConfigurationManager.U()) {
                CryptographicSessionController.x().v(0.0f);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericTransformationService.a(customSystemException);
        }
        bufferOrchestrator.H();
        tl.a(1.0f, 1.0f, 1.0f, 1.0f);
        E8 e8 = ApplicationLifecycleManager.X();
        int n2 = 0;
        for (LightweightExecutionContext lightweightExecutionContext : lightweightExecutionContextArray) {
            LightweightExecutionContext lightweightExecutionContext2;
            block17: {
                block16: {
                    try {
                        if (lightweightExecutionContext == null) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericTransformationService.a(customSystemException);
                    }
                    lightweightExecutionContext2 = lightweightExecutionContext.l();
                    try {
                        if (GeometryCalculator.C() < 50) break block16;
                        break block17;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericTransformationService.a(customSystemException);
                    }
                }
                VersionController versionController = new VersionController(lightweightExecutionContext2.c());
                try {
                    if (versionController.r()) {
                        versionController.P().remove(NumericTransformationService.b("g", (int)NumericTransformationService.a("y", (int)17087, (long)(0x599EB35AA3978EF1L ^ l)), (long)-1860498445769518813L, (long)l));
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericTransformationService.a(customSystemException);
                }
            }
            NumericTransformationService.I(lightweightExecutionContext2, n2, n);
            int versionController = 0;
            double d2 = 0.7;
            double d3 = 1.0 / d2;
            for (String string : RuntimeContextResolver.J(lightweightExecutionContext)) {
                NumericTransformationService.v(e8, string, (int)((double)n2 * d3), (int)((double)versionController * d3) - 2, d2, 1.0);
                versionController += 6;
            }
            n2 += 18;
        }
        bufferOrchestrator.l();
        ConfigurationManager.Y();
        return new NumericTransformationService(l2, bufferOrchestrator, n, 16.0);
    }

    public double R() {
        return this.u;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = NumericTransformationService.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fe' || c == '\u00c7' || c == 'M' || c == '\u00f8') {
                field = NumericTransformationService.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fe' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c7' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'M' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = NumericTransformationService.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'x' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'g' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Fi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    private static Field c(long l, long l2) {
        int n = NumericTransformationService.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = NumericTransformationService.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = NumericTransformationService.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = NumericTransformationService.a(clazz3, string2, clazz2)) != null) {
                    NumericTransformationService.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = NumericTransformationService.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        NumericTransformationService.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = NumericTransformationService.b(229709507679002L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public double t() {
        return this.D;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = NumericTransformationService.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = NumericTransformationService.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2A60;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Fi", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            NumericTransformationService.c[n2] = n3;
        }
        return c[n2];
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = NumericTransformationService.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                NumericTransformationService.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Fi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method d(long l, long l2) {
        int n = NumericTransformationService.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = NumericTransformationService.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = NumericTransformationService.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = NumericTransformationService.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        NumericTransformationService.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = NumericTransformationService.b(229709507679002L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = NumericTransformationService.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        NumericTransformationService.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = NumericTransformationService.b(229709507679002L, 0L);
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

    private static void v(E8 e8, String string, int n, int n2, double d2, double d3) {
        long l = a ^ 0x34A31750A1D4L;
        int n3 = ((int)d3 & 0xFF) << 24 | NumericTransformationService.a("y", (int)12266, (long)(0x7585B0F176CA18ECL ^ l));
        Ne.h.z();
        Ne.h.x(d2, d2, d2);
        Ne.h.d(0.0f, 0.0f, 2000.0f);
        e8.m(string, n, n2, n3);
        Ne.h.X();
    }

    public BufferOrchestrator F() {
        return this.N;
    }

    public NumericTransformationService(long l, BufferOrchestrator bufferOrchestrator, double d2, double d3) {
        this.Y = l;
        this.N = bufferOrchestrator;
        this.D = d2;
        this.u = d3;
    }

    public void Q(double d2, double d3, int n, double[] dArray, @Nullable DataTransformationEngine1209 dataTransformationEngine1209, NumericComputationEngine1131 numericComputationEngine1131, boolean bl) {
        Object object;
        long l = a ^ 0x66A7585548C7L;
        tl.a(1.0f, 1.0f, 1.0f, 1.0f);
        tl.s();
        ConfigurationManager.J(d2, d3, this.D, this.u + 2.0, this.N.e(), bl);
        if (n != 0) {
            int n2 = -1;
            if (GeometryCalculator.C() >= 35) {
                block12: {
                    block11: {
                        dataTransformationEngine1209.g();
                        EventDispatcher eventDispatcher = numericComputationEngine1131.O();
                        dataTransformationEngine1209.T(eventDispatcher);
                        dataTransformationEngine1209.T(EventDispatcher.o(180.0f, 0.0f, 180.0f, true));
                        object = NumericTransformationService.a("y", (int)26703, (long)(0x16EB39F49A42B658L ^ l));
                        try {
                            if (GeometryCalculator.C() < 50) break block11;
                            ApplicationLifecycleManager.X().n(n + "", (float)(d2 + 7.0), (float)(d3 + 9.0), n2, true, null, PacketTransmissionController.F());
                            break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NumericTransformationService.a(customSystemException);
                        }
                    }
                    DataStreamProcessor1600 dataStreamProcessor1600 = DataStreamProcessor1600.Y(n + "");
                    TransactionValidator1679 transactionValidator1679 = TransactionValidator1679.B(TransactionFlowController.g().D());
                    ApplicationLifecycleManager.X().V(dataStreamProcessor1600, (float)(d2 + 7.0), (float)(d3 + 9.0), n2, true, dataTransformationEngine1209.p().n(), transactionValidator1679, true, 0, (int)object);
                    transactionValidator1679.d();
                }
                dataTransformationEngine1209.v();
            } else {
                ApplicationLifecycleManager.X().m(n + "", d2 + 6.0, d3 + 8.0, n2);
            }
        }
        double d4 = 0.0;
        for (object = 0; object < dArray.length; ++object) {
            block13: {
                double d5 = dArray[object];
                try {
                    if (!(d5 > 0.0) || !(d5 < 1.0)) break block13;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericTransformationService.a(customSystemException);
                }
                double d6 = 1.0 - d5;
                if (d6 < 1.0) {
                    block15: {
                        int n3;
                        block14: {
                            ConfigurationManager.f = false;
                            n3 = (int)Math.round(255.0 - d5 * 255.0);
                            try {
                                if (!ConfigurationManager.U()) break block14;
                                DataFlowAnalyzer.g(d2 + 2.0 + d4, d3 + 13.0, 13.0, 2.0, Color.BLACK);
                                DataFlowAnalyzer.g(d2 + 2.0 + d4, d3 + 13.0, 12.0, 1.0, new Color((255 - n3) / 4, 64, 0, 255));
                                DataFlowAnalyzer.g(d2 + 2.0 + d4, d3 + 13.0, 13.0 * d6, 1.0, GraphicsBufferAllocator.o((float)d6));
                                break block15;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NumericTransformationService.a(customSystemException);
                            }
                        }
                        ConfigurationManager.A(d2 + 2.0 + d4, d3 + 13.0, 13.0, 2.0, Color.BLACK);
                        ConfigurationManager.A(d2 + 2.0 + d4, d3 + 13.0, 12.0, 1.0, new Color((255 - n3) / 4, 64, 0, 255));
                        ConfigurationManager.A(d2 + 2.0 + d4, d3 + 13.0, 13.0 * d6, 1.0, GraphicsBufferAllocator.o((float)d6));
                    }
                    ConfigurationManager.f = true;
                }
            }
            d4 += 18.0;
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(NumericTransformationService.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(NumericTransformationService.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

