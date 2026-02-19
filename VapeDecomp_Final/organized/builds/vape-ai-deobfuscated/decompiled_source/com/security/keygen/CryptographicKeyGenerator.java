/*
 * Decompiled with CFR 0.152.
 */
package com.security.keygen;

import a.KB;
import a._Y;
import a.a;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.encoding.protocol.EncodingProtocolEnum;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.graphics.palette.ColorPaletteManager;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.network.protocol.ProtocolInteractionController;
import com.network.transmission.DataTransmissionManager2384;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.LightweightExecutionContext;
import com.security.cipher.CryptographicTransformer1102;
import com.security.context.SecurityContextManager2112;
import com.security.crypto.EncryptionTransformer;
import com.structure.tree.RecursiveNodeTreeBuilder;
import com.system.configuration.ConfigurationCalibrator;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.monitoring.RuntimeResourceTracker;
import com.system.resource.AssetLoadBalancer;
import com.ui.input.UserInputEventMapper;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class CryptographicKeyGenerator
extends ContextualExecutionFramework {
    public final ColorPaletteManager d;
    private static final String[] m;
    private int F;
    private static final long b;
    private int w;
    public final AuthenticationStateTracker x;
    public final AuthenticationStateTracker B;
    private boolean P;
    private static final long[] e;
    private static final Object[] l;
    private static final Integer[] h;
    public final AuthenticationStateTracker N;
    private boolean T;
    private static final Map j;
    private boolean o;
    public final AuthenticationStateTracker r;

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptographicKeyGenerator.a(l, l2);
            object = CryptographicKeyGenerator.l[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptographicKeyGenerator.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptographicKeyGenerator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptographicKeyGenerator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptographicKeyGenerator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public CryptographicKeyGenerator() {
        long l = b ^ 0x6D6B25243CFFL;
        super(a.cs((int)CryptographicKeyGenerator.a("c", (int)6829, (long)(0x2D6D1B51A0A32B80L ^ l))), (int)CryptographicKeyGenerator.a("c", (int)16813, (long)(0x28FF48C214A2F083L ^ l)), RecursiveNodeGraph.K, a.cs((int)CryptographicKeyGenerator.a("c", (int)7708, (long)(0x28EF88E0B189AF33L ^ l))));
        this.N = AuthenticationStateTracker.w(this, (String)((Object)CryptographicKeyGenerator.c("m", (int)CryptographicKeyGenerator.a("c", (int)21406, (long)(0x8D53F4ED4B7E2B9L ^ l)), (long)-4966500064195647813L, (long)l)), false);
        this.r = AuthenticationStateTracker.w(this, (String)((Object)CryptographicKeyGenerator.c("m", (int)CryptographicKeyGenerator.a("c", (int)27398, (long)(0x2977CFDCF51ADA2EL ^ l)), (long)-4966500064195647813L, (long)l)), true);
        this.B = AuthenticationStateTracker.w(this, (String)((Object)CryptographicKeyGenerator.c("m", (int)CryptographicKeyGenerator.a("c", (int)29470, (long)(0x28920DF77859C237L ^ l)), (long)-4966500064195647813L, (long)l)), true);
        this.x = AuthenticationStateTracker.w(this, (String)((Object)CryptographicKeyGenerator.c("m", (int)CryptographicKeyGenerator.a("c", (int)24188, (long)(0x3786E6FC64A46F50L ^ l)), (long)-4966500064195647813L, (long)l)), false);
        this.d = ColorPaletteManager.o(this, (String)((Object)CryptographicKeyGenerator.c("m", (int)CryptographicKeyGenerator.a("c", (int)3902, (long)(0x4CD9DD7FBA913E14L ^ l)), (long)-4966500064195647813L, (long)l)), (String)((Object)CryptographicKeyGenerator.c("m", (int)CryptographicKeyGenerator.a("c", (int)7731, (long)(0x69969DEB0FFF2F18L ^ l)), (long)-4966500064195647813L, (long)l)), ColorPaletteManager.U, Arrays.asList(new RecursiveNodeTreeBuilder((String)((Object)CryptographicKeyGenerator.c("m", (int)CryptographicKeyGenerator.a("c", (int)11693, (long)(0x1D940C6D0AB51C8BL ^ l)), (long)-4966500064195647813L, (long)l)))));
        this.w = -1;
        this.P = false;
        this.o = false;
        this.N(this.r, this.B, this.x, this.N, this.d);
        this.N.l(this.d);
    }

    @Override
    public void v() {
        this.P = false;
        this.o = false;
        this.T = false;
        this.w = -1;
        this.F = 0;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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
        Object[] objectArray = l;
        l[0] = "U0e";
        objectArray[1] = Integer.TYPE;
        CryptographicKeyGenerator.m[1] = "java/lang/Integer";
        objectArray[2] = "9Dy\u000e\u0013e2KhAn}!La\b";
        objectArray[3] = "PAMs\u0012K[N\\<sEPEXf";
        Object[] objectArray2 = objectArray;
        objectArray[4] = ")\u001b\u001f*k\u0013y\u0004Q\u0015d\u0006F\u0007\f%jG6\u0017\u0011v\u000fD#\u0003\u000b/4\u0014,I\u0012\u0015";
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Field c(long l, long l2) {
        int n = CryptographicKeyGenerator.a(l, l2);
        Object object = CryptographicKeyGenerator.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptographicKeyGenerator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptographicKeyGenerator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptographicKeyGenerator.a(clazz3, string2, clazz2)) != null) {
                    CryptographicKeyGenerator.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptographicKeyGenerator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptographicKeyGenerator.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptographicKeyGenerator.b(232362251171415L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private boolean P() {
        try {
            if (ApplicationLifecycleManager.X().r()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicKeyGenerator.a(customSystemException);
        }
        if (this.N.s().booleanValue()) {
            LightweightExecutionContext lightweightExecutionContext = ApplicationLifecycleManager.U().K();
            try {
                if (!this.d.b(lightweightExecutionContext, false)) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicKeyGenerator.a(customSystemException);
            }
        }
        return true;
    }

    public boolean z() {
        if (this.B.s().booleanValue()) {
            AssetLoadBalancer assetLoadBalancer = ApplicationLifecycleManager.U().l();
            int n = ApplicationLifecycleManager.U().l().v();
            int n2 = 0;
            while (true) {
                block15: {
                    LightweightExecutionContext lightweightExecutionContext;
                    block17: {
                        block16: {
                            block14: {
                                try {
                                    try {
                                        if (n2 >= 9) break;
                                        if (n2 != n) break block14;
                                        break block15;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptographicKeyGenerator.a(customSystemException);
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicKeyGenerator.a(customSystemException);
                                }
                            }
                            lightweightExecutionContext = assetLoadBalancer.F(n2);
                            try {
                                if (!lightweightExecutionContext.Y()) break block16;
                                break block15;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicKeyGenerator.a(customSystemException);
                            }
                        }
                        try {
                            if (!lightweightExecutionContext.C().Y()) break block17;
                            break block15;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicKeyGenerator.a(customSystemException);
                        }
                    }
                    ProtocolInteractionController protocolInteractionController = lightweightExecutionContext.C();
                    try {
                        try {
                            if (!this.B.s().booleanValue() || !protocolInteractionController.B(ReflectionMetadataResolver.EL)) break block15;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicKeyGenerator.a(customSystemException);
                        }
                        return true;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicKeyGenerator.a(customSystemException);
                    }
                }
                ++n2;
            }
        }
        return false;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AX" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AX" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xA3C;
        if (h[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/AX", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptographicKeyGenerator.h[n2] = n3;
        }
        return h[n2];
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n4] != null) {
            return n4;
        }
        Object object = CryptographicKeyGenerator.l[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 62;
                break;
            }
            case 1: {
                n3 = 17;
                break;
            }
            case 2: {
                n3 = 58;
                break;
            }
            case 3: {
                n3 = 33;
                break;
            }
            case 4: {
                n3 = 43;
                break;
            }
            case 5: {
                n3 = 19;
                break;
            }
            case 6: {
                n3 = 27;
                break;
            }
            case 7: {
                n3 = 50;
                break;
            }
            case 8: {
                n3 = 39;
                break;
            }
            case 9: {
                n3 = 31;
                break;
            }
            case 10: {
                n3 = 29;
                break;
            }
            case 11: {
                n3 = 15;
                break;
            }
            case 12: {
                n3 = 7;
                break;
            }
            case 13: {
                n3 = 34;
                break;
            }
            case 14: {
                n3 = 28;
                break;
            }
            case 15: {
                n3 = 52;
                break;
            }
            case 16: {
                n3 = 49;
                break;
            }
            case 17: {
                n3 = 51;
                break;
            }
            case 18: {
                n3 = 35;
                break;
            }
            case 19: {
                n3 = 32;
                break;
            }
            case 20: {
                n3 = 41;
                break;
            }
            case 21: {
                n3 = 4;
                break;
            }
            case 22: {
                n3 = 59;
                break;
            }
            case 23: {
                n3 = 42;
                break;
            }
            case 24: {
                n3 = 5;
                break;
            }
            case 25: {
                n3 = 44;
                break;
            }
            case 26: {
                n3 = 3;
                break;
            }
            case 27: {
                n3 = 20;
                break;
            }
            case 28: {
                n3 = 24;
                break;
            }
            case 29: {
                n3 = 60;
                break;
            }
            case 30: {
                n3 = 63;
                break;
            }
            case 31: {
                n3 = 2;
                break;
            }
            case 32: {
                n3 = 22;
                break;
            }
            case 33: {
                n3 = 0;
                break;
            }
            case 34: {
                n3 = 9;
                break;
            }
            case 35: {
                n3 = 13;
                break;
            }
            case 36: {
                n3 = 54;
                break;
            }
            case 37: {
                n3 = 8;
                break;
            }
            case 38: {
                n3 = 38;
                break;
            }
            case 39: {
                n3 = 23;
                break;
            }
            case 40: {
                n3 = 36;
                break;
            }
            case 41: {
                n3 = 26;
                break;
            }
            case 42: {
                n3 = 11;
                break;
            }
            case 43: {
                n3 = 30;
                break;
            }
            case 44: {
                n3 = 56;
                break;
            }
            case 45: {
                n3 = 12;
                break;
            }
            case 46: {
                n3 = 55;
                break;
            }
            case 47: {
                n3 = 57;
                break;
            }
            case 48: {
                n3 = 16;
                break;
            }
            case 49: {
                n3 = 18;
                break;
            }
            case 50: {
                n3 = 46;
                break;
            }
            case 51: {
                n3 = 21;
                break;
            }
            case 52: {
                n3 = 48;
                break;
            }
            case 53: {
                n3 = 1;
                break;
            }
            case 54: {
                n3 = 37;
                break;
            }
            case 55: {
                n3 = 40;
                break;
            }
            case 56: {
                n3 = 14;
                break;
            }
            case 57: {
                n3 = 25;
                break;
            }
            case 58: {
                n3 = 10;
                break;
            }
            case 59: {
                n3 = 47;
                break;
            }
            case 60: {
                n3 = 61;
                break;
            }
            case 61: {
                n3 = 6;
                break;
            }
            case 62: {
                n3 = 45;
                break;
            }
            default: {
                n3 = 53;
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
        CryptographicKeyGenerator.m[n4] = new String(cArray);
        return n4;
    }

    private static Method d(long l, long l2) {
        int n = CryptographicKeyGenerator.a(l, l2);
        Object object = CryptographicKeyGenerator.l[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = m[n];
                int n3 = string2.indexOf(8);
                clazz3 = CryptographicKeyGenerator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptographicKeyGenerator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptographicKeyGenerator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptographicKeyGenerator.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptographicKeyGenerator.b(232362251171415L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptographicKeyGenerator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptographicKeyGenerator.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptographicKeyGenerator.b(232362251171415L, 0L);
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptographicKeyGenerator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.HIGH)
    public void i(UserInputEventMapper userInputEventMapper) {
        block27: {
            block26: {
                int n;
                SystemConfigurationOrchestrator systemConfigurationOrchestrator;
                int n2;
                block24: {
                    block25: {
                        int n3;
                        block22: {
                            block23: {
                                block20: {
                                    block21: {
                                        block19: {
                                            block18: {
                                                long l = b ^ 0x120BADA0A826L;
                                                n2 = EncryptionTransformer.a();
                                                try {
                                                    try {
                                                        n3 = userInputEventMapper.getButton();
                                                        if (n2 != 0) break block18;
                                                        if (n3 != UserInputEventMapper.l) break block19;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw CryptographicKeyGenerator.a(customSystemException);
                                                    }
                                                    n3 = userInputEventMapper.getButtonState() ? 1 : 0;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CryptographicKeyGenerator.a(customSystemException);
                                                }
                                            }
                                            try {
                                                if (n2 != 0) break block20;
                                                if (n3 != 0) break block21;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptographicKeyGenerator.a(customSystemException);
                                            }
                                        }
                                        return;
                                    }
                                    n3 = this.T ? 1 : 0;
                                }
                                try {
                                    if (n2 != 0) break block22;
                                    if (n3 == 0) break block23;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicKeyGenerator.a(customSystemException);
                                }
                                return;
                            }
                            n3 = this.P() ? 1 : 0;
                        }
                        if (n3 == 0) {
                            return;
                        }
                        systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                        try {
                            if (systemConfigurationOrchestrator.Y()) {
                                return;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicKeyGenerator.a(customSystemException);
                        }
                        NetworkPacketInterceptor1107 networkPacketInterceptor1107 = ConfigurationCalibrator.b.B();
                        try {
                            n = networkPacketInterceptor1107.l().Y();
                            if (n2 != 0) break block24;
                            if (n == 0) break block25;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicKeyGenerator.a(customSystemException);
                        }
                        return;
                    }
                    n = this.H();
                }
                int n4 = n;
                try {
                    try {
                        if (n2 != 0) break block26;
                        if (n4 < 0) break block27;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicKeyGenerator.a(customSystemException);
                    }
                    userInputEventMapper.setCanceled(true);
                    this.w = systemConfigurationOrchestrator.l().v();
                    systemConfigurationOrchestrator.l().A(n4);
                    this.T = true;
                    this.F = 0;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicKeyGenerator.a(customSystemException);
                }
            }
            this.P = true;
        }
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = CryptographicKeyGenerator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptographicKeyGenerator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptographicKeyGenerator.b = MultiContainerRegistry.a(-7236798748911785614L, -7213628650930267468L, MethodHandles.lookup().lookupClass()).a(74109814398715L);
                CryptographicKeyGenerator.l = new Object[5];
                CryptographicKeyGenerator.m = new String[5];
                CryptographicKeyGenerator.a();
                CryptographicKeyGenerator.j = new HashMap<K, V>(13);
                var0 = CryptographicKeyGenerator.b ^ 51828125555291L;
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
                var8_3 = new long[10];
                var5_4 = 0;
                var6_5 = "\u0080\u0014\u0018\u00a9\u00e4\u0007\u00f2\f\u00c2=\u00ca}\u00ed\u00da\u00dc\u00f9]\u0002\u0083W\u00f7\"\u00da~\u00ae!u!\u0089`4\u0010\u00e0\u000e\u0090\u00b0<\u00ad\u0004\u00d6\u00b6\u00c4\u0016\u0014_\u00a5%K\u00d6\u00c1\u0083\u00f1Gle\u00ccCA(\u00bc\u00af\u00be\u009a\u0012";
                var7_6 = "\u0080\u0014\u0018\u00a9\u00e4\u0007\u00f2\f\u00c2=\u00ca}\u00ed\u00da\u00dc\u00f9]\u0002\u0083W\u00f7\"\u00da~\u00ae!u!\u0089`4\u0010\u00e0\u000e\u0090\u00b0<\u00ad\u0004\u00d6\u00b6\u00c4\u0016\u0014_\u00a5%K\u00d6\u00c1\u0083\u00f1Gle\u00ccCA(\u00bc\u00af\u00be\u009a\u0012".length();
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
                    var6_5 = "Z\u008el,\u00edN\u00cee\u00e22\u0005O\u00c9I15";
                    var7_6 = "Z\u008el,\u00edN\u00cee\u00e22\u0005O\u00c9I15".length();
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
        CryptographicKeyGenerator.e = var8_3;
        CryptographicKeyGenerator.h = new Integer[10];
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fe' || c == '\u00ff' || c == '\u00fb' || c == '\u00f4') {
                field = CryptographicKeyGenerator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fe' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ff' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00fb' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptographicKeyGenerator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'm' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private DataTransmissionManager2384 s() {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        DataTransmissionManager2384 dataTransmissionManager2384 = _Y.p(systemConfigurationOrchestrator, 5.0, 90.0, true);
        return dataTransmissionManager2384;
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOW)
    public void V(KB kB) {
        block34: {
            block36: {
                CryptographicKeyGenerator cryptographicKeyGenerator;
                int n;
                int n2;
                block35: {
                    int n3;
                    block33: {
                        block31: {
                            block32: {
                                block29: {
                                    block30: {
                                        block27: {
                                            block28: {
                                                long l = b ^ 0x43CCAB03A81EL;
                                                n3 = EncryptionTransformer.a();
                                                try {
                                                    n2 = kB.getThePlayer().Y();
                                                    if (n3 != 0) break block27;
                                                    if (n2 == 0) break block28;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CryptographicKeyGenerator.a(customSystemException);
                                                }
                                                return;
                                            }
                                            n2 = this.o;
                                        }
                                        try {
                                            try {
                                                if (n3 != 0) break block29;
                                                if (n2 == 0) break block30;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptographicKeyGenerator.a(customSystemException);
                                            }
                                            CryptographicTransformer1102.B(0, false);
                                            this.o = false;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptographicKeyGenerator.a(customSystemException);
                                        }
                                    }
                                    n2 = this.P;
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                if (n3 != 0) break block31;
                                                if (n2 == 0) break block32;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptographicKeyGenerator.a(customSystemException);
                                            }
                                            n2 = this.T;
                                            if (n3 != 0) break block31;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptographicKeyGenerator.a(customSystemException);
                                        }
                                        if (n2 == 0) break block32;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptographicKeyGenerator.a(customSystemException);
                                    }
                                    CryptographicTransformer1102.t(0, false);
                                    this.o = true;
                                    this.P = false;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicKeyGenerator.a(customSystemException);
                                }
                            }
                            n2 = this.T;
                        }
                        try {
                            try {
                                if (n3 != 0) break block33;
                                if (n2 == 0) break block34;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicKeyGenerator.a(customSystemException);
                            }
                            int n2 = this.F;
                            n2 = n2;
                            this.F = n4 + 1;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicKeyGenerator.a(customSystemException);
                        }
                    }
                    try {
                        try {
                            try {
                                n = 1;
                                if (n3 != 0) break block35;
                                if (n2 <= n) break block34;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicKeyGenerator.a(customSystemException);
                            }
                            cryptographicKeyGenerator = this;
                            if (n3 != 0) break block36;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicKeyGenerator.a(customSystemException);
                        }
                        int n = cryptographicKeyGenerator.w;
                        n = -1;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicKeyGenerator.a(customSystemException);
                    }
                }
                try {
                    if (n2 != n) {
                        kB.getThePlayer().l().A(this.w);
                        this.w = -1;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicKeyGenerator.a(customSystemException);
                }
                this.T = false;
                cryptographicKeyGenerator = this;
            }
            cryptographicKeyGenerator.F = 0;
        }
    }

    private int H() {
        AssetLoadBalancer assetLoadBalancer = ApplicationLifecycleManager.U().l();
        int n = ApplicationLifecycleManager.U().l().v();
        int n2 = 0;
        while (true) {
            block25: {
                ProtocolInteractionController protocolInteractionController;
                block29: {
                    SecurityContextManager2112 securityContextManager2112;
                    block28: {
                        LightweightExecutionContext lightweightExecutionContext;
                        block27: {
                            block26: {
                                block24: {
                                    try {
                                        try {
                                            if (n2 >= 9) break;
                                            if (n2 != n) break block24;
                                            break block25;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptographicKeyGenerator.a(customSystemException);
                                        }
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptographicKeyGenerator.a(customSystemException);
                                    }
                                }
                                lightweightExecutionContext = assetLoadBalancer.F(n2);
                                try {
                                    if (!lightweightExecutionContext.Y()) break block26;
                                    break block25;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicKeyGenerator.a(customSystemException);
                                }
                            }
                            try {
                                if (!lightweightExecutionContext.C().Y()) break block27;
                                break block25;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicKeyGenerator.a(customSystemException);
                            }
                        }
                        protocolInteractionController = lightweightExecutionContext.C();
                        try {
                            try {
                                if (!this.r.s().booleanValue() || !protocolInteractionController.B(ReflectionMetadataResolver.FB)) break block28;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicKeyGenerator.a(customSystemException);
                            }
                            return n2;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicKeyGenerator.a(customSystemException);
                        }
                    }
                    try {
                        if (!this.B.s().booleanValue() || !protocolInteractionController.B(ReflectionMetadataResolver.EL)) break block29;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicKeyGenerator.a(customSystemException);
                    }
                    DataTransmissionManager2384 dataTransmissionManager2384 = this.s();
                    if (dataTransmissionManager2384 != null && (securityContextManager2112 = _Y.O(dataTransmissionManager2384)) != null) {
                        LightweightExecutionContext lightweightExecutionContext = dataTransmissionManager2384.G(securityContextManager2112);
                        float f = dataTransmissionManager2384.b(securityContextManager2112);
                        int n3 = lightweightExecutionContext.C().o(lightweightExecutionContext, dataTransmissionManager2384);
                        if (f > 0.0f) {
                            float f2 = (float)n3 - f;
                            try {
                                if (f2 > 5.0f) {
                                    return n2;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicKeyGenerator.a(customSystemException);
                            }
                            return -2;
                        }
                    }
                }
                try {
                    try {
                        if (!this.x.s().booleanValue() || !RuntimeResourceTracker.a(protocolInteractionController)) break block25;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicKeyGenerator.a(customSystemException);
                    }
                    return n2;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicKeyGenerator.a(customSystemException);
                }
            }
            ++n2;
        }
        return -1;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptographicKeyGenerator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CryptographicKeyGenerator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

