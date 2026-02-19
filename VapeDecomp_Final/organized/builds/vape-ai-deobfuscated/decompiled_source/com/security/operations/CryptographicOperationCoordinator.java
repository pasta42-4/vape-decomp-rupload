/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.UnmodifiableView
 */
package com.security.operations;

import com.cache.management.CacheEntryLifecycleManager;
import com.collections.management.MultiContainerRegistry;
import com.core.reflection.ReflectionUtilityResolver910;
import com.encryption.codec.CipherTextEncoder;
import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkProtocolEncoder1006;
import com.network.security.SecurityContextManager;
import com.resource.management.CloneableResourceDescriptor;
import com.runtime.context.DynamicContextBroker;
import com.runtime.context.LightweightExecutionContext;
import com.security.context.CryptoContextManager989;
import com.security.crypto.CryptographicInterface;
import com.system.error.ErrorResilienceProtocol;
import com.system.monitoring.RuntimeResourceTracker;
import com.text.processing.PatternMatchingOrchestrator;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnmodifiableView;

public class CryptographicOperationCoordinator {
    private static final Map<String, CryptographicInterface> r;
    private static final Integer[] d;
    private static final long b;
    private static final String[] g;
    private static final Map e;
    private static final Object[] f;
    public static final CryptographicInterface a;
    private static final long[] c;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Method d(long l, long l2) {
        int n = CryptographicOperationCoordinator.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = g[n];
                int n3 = string2.indexOf(8);
                clazz3 = CryptographicOperationCoordinator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptographicOperationCoordinator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptographicOperationCoordinator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptographicOperationCoordinator.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptographicOperationCoordinator.b(222929489001677L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptographicOperationCoordinator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptographicOperationCoordinator.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptographicOperationCoordinator.b(222929489001677L, 0L);
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

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptographicOperationCoordinator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public static void R() {
        long l = b ^ 0x77CD10347CACL;
        CryptographicOperationCoordinator.n(a);
        CryptographicInterface cryptographicInterface = CryptographicOperationCoordinator.n(((CipherTextEncoder)((CipherTextEncoder)((CipherTextEncoder)((CipherTextEncoder)((CipherTextEncoder)((CipherTextEncoder)((CipherTextEncoder)CryptographicInterface.j().W().y((String)((Object)CryptographicOperationCoordinator.b("\u00cb", (int)CryptographicOperationCoordinator.a("b", (int)6955, (long)(0x6A77741C56470CDDL ^ l)), (long)-3104077509785568488L, (long)l)))).n((String)((Object)CryptographicOperationCoordinator.b("\u00cb", (int)CryptographicOperationCoordinator.a("b", (int)31983, (long)(0x355DD93BF3F5EB09L ^ l)), (long)-3104077509785568488L, (long)l)))).f((String)((Object)CryptographicOperationCoordinator.b("\u00cb", (int)CryptographicOperationCoordinator.a("b", (int)154, (long)(0x77550C1C2A2E177AL ^ l)), (long)-3104077509785568488L, (long)l)))).m(Comparator.comparingDouble(RuntimeResourceTracker::D))).V(NetworkProtocolEncoder1006.c)).V(NetworkProtocolEncoder1006.Z)).V(NetworkProtocolEncoder1006.z)).o());
        CryptographicInterface cryptographicInterface2 = CryptographicOperationCoordinator.n(((CipherTextEncoder)((CipherTextEncoder)((CipherTextEncoder)((CipherTextEncoder)((CipherTextEncoder)((CipherTextEncoder)((CipherTextEncoder)CryptographicInterface.j().W().y((String)((Object)CryptographicOperationCoordinator.b("\u00cb", (int)CryptographicOperationCoordinator.a("b", (int)24574, (long)(0x7ABD389A80FF481DL ^ l)), (long)-3104077509785568488L, (long)l)))).n((String)((Object)CryptographicOperationCoordinator.b("\u00cb", (int)CryptographicOperationCoordinator.a("b", (int)3740, (long)(0x9B8FBC9642C9965L ^ l)), (long)-3104077509785568488L, (long)l)))).f((String)((Object)CryptographicOperationCoordinator.b("\u00cb", (int)CryptographicOperationCoordinator.a("b", (int)22016, (long)(0x439203C5081DC1FBL ^ l)), (long)-3104077509785568488L, (long)l)))).m(Comparator.comparingDouble(RuntimeResourceTracker::U))).V(NetworkProtocolEncoder1006.c)).V(NetworkProtocolEncoder1006.Z)).V(NetworkProtocolEncoder1006.z)).o());
        NetworkProtocolEncoder1006.c.G(cryptographicInterface2);
        NetworkProtocolEncoder1006.Z.G(cryptographicInterface2);
        NetworkProtocolEncoder1006.z.G(cryptographicInterface2);
        CryptographicInterface cryptographicInterface3 = CryptographicOperationCoordinator.n(((CipherTextEncoder)((CipherTextEncoder)((CipherTextEncoder)((CipherTextEncoder)((CipherTextEncoder)((CipherTextEncoder)((CipherTextEncoder)((CipherTextEncoder)CryptographicInterface.j().W().y((String)((Object)CryptographicOperationCoordinator.b("\u00cb", (int)CryptographicOperationCoordinator.a("b", (int)31332, (long)(0x491A356B8B6D94L ^ l)), (long)-3104077509785568488L, (long)l)))).n((String)((Object)CryptographicOperationCoordinator.b("\u00cb", (int)CryptographicOperationCoordinator.a("b", (int)10046, (long)(0x7C8D10AA000B30C9L ^ l)), (long)-3104077509785568488L, (long)l)))).m(Comparator.comparingDouble(DynamicContextBroker::q))).V(CryptoContextManager989.Q)).V(CryptoContextManager989.p)).V(CryptoContextManager989.J)).V(CryptoContextManager989.U)).V(CryptoContextManager989.z)).o());
        CryptoContextManager989.Q.G(cryptographicInterface3);
        CryptoContextManager989.p.G(cryptographicInterface3);
        CryptoContextManager989.J.G(cryptographicInterface3);
        CryptoContextManager989.U.G(cryptographicInterface3);
        CryptoContextManager989.z.G(cryptographicInterface3);
        CryptographicInterface cryptographicInterface4 = CryptographicOperationCoordinator.n(((CipherTextEncoder)((CipherTextEncoder)((CipherTextEncoder)((CipherTextEncoder)((CipherTextEncoder)CryptographicInterface.j().W().y((String)((Object)CryptographicOperationCoordinator.b("\u00cb", (int)CryptographicOperationCoordinator.a("b", (int)11595, (long)(0x538A19CD4EC13AAEL ^ l)), (long)-3104077509785568488L, (long)l)))).n((String)((Object)CryptographicOperationCoordinator.b("\u00cb", (int)CryptographicOperationCoordinator.a("b", (int)13990, (long)(0x3F7C81C67B0B2147L ^ l)), (long)-3104077509785568488L, (long)l)))).m(Comparator.comparingDouble(PatternMatchingOrchestrator::i))).V(SecurityContextManager.o)).V(SecurityContextManager.e)).o());
        CryptographicInterface cryptographicInterface5 = CryptographicOperationCoordinator.n(((CipherTextEncoder)((CipherTextEncoder)((CipherTextEncoder)((CipherTextEncoder)((CipherTextEncoder)CryptographicInterface.j().W().y((String)((Object)CryptographicOperationCoordinator.b("\u00cb", (int)CryptographicOperationCoordinator.a("b", (int)20077, (long)(0x17CD365559A7D99CL ^ l)), (long)-3104077509785568488L, (long)l)))).n((String)((Object)CryptographicOperationCoordinator.b("\u00cb", (int)CryptographicOperationCoordinator.a("b", (int)10011, (long)(0x6AE1FD0F9EEE30FFL ^ l)), (long)-3104077509785568488L, (long)l)))).m(Comparator.comparingDouble(PatternMatchingOrchestrator::i).reversed())).V(SecurityContextManager.o)).V(SecurityContextManager.e)).o());
        CryptographicOperationCoordinator.n(((CacheEntryLifecycleManager)((CacheEntryLifecycleManager)((CacheEntryLifecycleManager)CryptographicInterface.j().e().y((String)((Object)CryptographicOperationCoordinator.b("\u00cb", (int)CryptographicOperationCoordinator.a("b", (int)31752, (long)(0x4E413153D9E66BF0L ^ l)), (long)-3104077509785568488L, (long)l)))).n((String)((Object)CryptographicOperationCoordinator.b("\u00cb", (int)CryptographicOperationCoordinator.a("b", (int)471, (long)(0x2484A0E4FEC3962BL ^ l)), (long)-3104077509785568488L, (long)l)))).m(Comparator.comparingInt(LightweightExecutionContext::J))).K(2).b(ErrorResilienceProtocol.GREATHER_THAN_OR_EQUAL).K());
        CryptographicInterface cryptographicInterface6 = CryptographicOperationCoordinator.n(((CipherTextEncoder)((CipherTextEncoder)((CipherTextEncoder)((CipherTextEncoder)((CipherTextEncoder)CryptographicInterface.j().W().y((String)((Object)CryptographicOperationCoordinator.b("\u00cb", (int)CryptographicOperationCoordinator.a("b", (int)29152, (long)(0x5F50C1DD7E216615L ^ l)), (long)-3104077509785568488L, (long)l)))).n((String)((Object)CryptographicOperationCoordinator.b("\u00cb", (int)CryptographicOperationCoordinator.a("b", (int)7429, (long)(0x6B94A1DFF668AE2L ^ l)), (long)-3104077509785568488L, (long)l)))).f((String)((Object)CryptographicOperationCoordinator.b("\u00cb", (int)CryptographicOperationCoordinator.a("b", (int)19536, (long)(0x4E080AAA9C7EDBA3L ^ l)), (long)-3104077509785568488L, (long)l)))).m(Comparator.comparingDouble(RuntimeResourceTracker::M))).V(ReflectionUtilityResolver910.i)).o());
        CryptographicInterface cryptographicInterface7 = CryptographicOperationCoordinator.n(((CipherTextEncoder)((CipherTextEncoder)((CipherTextEncoder)((CipherTextEncoder)((CipherTextEncoder)CryptographicInterface.j().W().y((String)((Object)CryptographicOperationCoordinator.b("\u00cb", (int)CryptographicOperationCoordinator.a("b", (int)322, (long)(0x259230E54A2B16BCL ^ l)), (long)-3104077509785568488L, (long)l)))).n((String)((Object)CryptographicOperationCoordinator.b("\u00cb", (int)CryptographicOperationCoordinator.a("b", (int)15558, (long)(0x3984E13CD1EC2B39L ^ l)), (long)-3104077509785568488L, (long)l)))).f((String)((Object)CryptographicOperationCoordinator.b("\u00cb", (int)CryptographicOperationCoordinator.a("b", (int)22232, (long)(0x5EC1B1F9377D4122L ^ l)), (long)-3104077509785568488L, (long)l)))).m(Comparator.comparingDouble(RuntimeResourceTracker::W))).V(ReflectionUtilityResolver910.i)).o());
        ReflectionUtilityResolver910.i.G(cryptographicInterface7);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4318;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/K7", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptographicOperationCoordinator.d[n2] = n3;
        }
        return d[n2];
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = CryptographicOperationCoordinator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptographicOperationCoordinator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptographicOperationCoordinator.a(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptographicOperationCoordinator.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "B\\f";
        objectArray[1] = Integer.TYPE;
        CryptographicOperationCoordinator.g[1] = "java/lang/Integer";
        objectArray[2] = "_6\u0011w\u001b{T9\u00008fcG>\tq";
        objectArray[3] = "X\u0006\u0014:}KS\t\u0005u\u001cEX\u0002\u0001/";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "`\u001cw\f\u0016N>\u0011\u000b\u0018R?x\u0014f\u000eNBz\u00144s\u0010R{@a\u0011\u0018\u0005z\u001b\u000b";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CryptographicInterface n(CryptographicInterface cryptographicInterface) {
        r.put(cryptographicInterface.s(), cryptographicInterface);
        return cryptographicInterface;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (g[n4] != null) {
            return n4;
        }
        Object object = f[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 21;
                break;
            }
            case 1: {
                n3 = 9;
                break;
            }
            case 2: {
                n3 = 20;
                break;
            }
            case 3: {
                n3 = 59;
                break;
            }
            case 4: {
                n3 = 3;
                break;
            }
            case 5: {
                n3 = 39;
                break;
            }
            case 6: {
                n3 = 10;
                break;
            }
            case 7: {
                n3 = 33;
                break;
            }
            case 8: {
                n3 = 17;
                break;
            }
            case 9: {
                n3 = 30;
                break;
            }
            case 10: {
                n3 = 40;
                break;
            }
            case 11: {
                n3 = 31;
                break;
            }
            case 12: {
                n3 = 12;
                break;
            }
            case 13: {
                n3 = 6;
                break;
            }
            case 14: {
                n3 = 32;
                break;
            }
            case 15: {
                n3 = 62;
                break;
            }
            case 16: {
                n3 = 45;
                break;
            }
            case 17: {
                n3 = 13;
                break;
            }
            case 18: {
                n3 = 7;
                break;
            }
            case 19: {
                n3 = 14;
                break;
            }
            case 20: {
                n3 = 50;
                break;
            }
            case 21: {
                n3 = 1;
                break;
            }
            case 22: {
                n3 = 58;
                break;
            }
            case 23: {
                n3 = 42;
                break;
            }
            case 24: {
                n3 = 46;
                break;
            }
            case 25: {
                n3 = 44;
                break;
            }
            case 26: {
                n3 = 29;
                break;
            }
            case 27: {
                n3 = 43;
                break;
            }
            case 28: {
                n3 = 47;
                break;
            }
            case 29: {
                n3 = 55;
                break;
            }
            case 30: {
                n3 = 60;
                break;
            }
            case 31: {
                n3 = 63;
                break;
            }
            case 32: {
                n3 = 22;
                break;
            }
            case 33: {
                n3 = 53;
                break;
            }
            case 34: {
                n3 = 0;
                break;
            }
            case 35: {
                n3 = 35;
                break;
            }
            case 36: {
                n3 = 41;
                break;
            }
            case 37: {
                n3 = 16;
                break;
            }
            case 38: {
                n3 = 48;
                break;
            }
            case 39: {
                n3 = 57;
                break;
            }
            case 40: {
                n3 = 24;
                break;
            }
            case 41: {
                n3 = 28;
                break;
            }
            case 42: {
                n3 = 18;
                break;
            }
            case 43: {
                n3 = 19;
                break;
            }
            case 44: {
                n3 = 49;
                break;
            }
            case 45: {
                n3 = 54;
                break;
            }
            case 46: {
                n3 = 25;
                break;
            }
            case 47: {
                n3 = 26;
                break;
            }
            case 48: {
                n3 = 52;
                break;
            }
            case 49: {
                n3 = 51;
                break;
            }
            case 50: {
                n3 = 38;
                break;
            }
            case 51: {
                n3 = 37;
                break;
            }
            case 52: {
                n3 = 23;
                break;
            }
            case 53: {
                n3 = 2;
                break;
            }
            case 54: {
                n3 = 11;
                break;
            }
            case 55: {
                n3 = 15;
                break;
            }
            case 56: {
                n3 = 61;
                break;
            }
            case 57: {
                n3 = 34;
                break;
            }
            case 58: {
                n3 = 5;
                break;
            }
            case 59: {
                n3 = 36;
                break;
            }
            case 60: {
                n3 = 27;
                break;
            }
            case 61: {
                n3 = 8;
                break;
            }
            case 62: {
                n3 = 4;
                break;
            }
            default: {
                n3 = 56;
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
        CryptographicOperationCoordinator.g[n4] = new String(cArray);
        return n4;
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

    public static List<CryptographicInterface> z(CloneableResourceDescriptor cloneableResourceDescriptor) {
        ArrayList<CryptographicInterface> arrayList = new ArrayList<CryptographicInterface>();
        for (CryptographicInterface cryptographicInterface : r.values()) {
            try {
                if (!cryptographicInterface.z(cloneableResourceDescriptor)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicOperationCoordinator.a(customSystemException);
            }
            arrayList.add(cryptographicInterface);
        }
        return arrayList;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'Y' || c == '\u00f6' || c == 'E' || c == '\u00ef') {
                field = CryptographicOperationCoordinator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'Y' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f6' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'E' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptographicOperationCoordinator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00cb' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptographicOperationCoordinator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptographicOperationCoordinator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
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
                CryptographicOperationCoordinator.b = MultiContainerRegistry.a(2889569400420653471L, -734230060420495177L, MethodHandles.lookup().lookupClass()).a(21867457154442L);
                var11 = CryptographicOperationCoordinator.b ^ 105026032635129L;
                CryptographicOperationCoordinator.f = new Object[5];
                CryptographicOperationCoordinator.g = new String[5];
                CryptographicOperationCoordinator.a();
                CryptographicOperationCoordinator.e = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var11 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var6_3 = new long[23];
                var3_4 = 0;
                var4_5 = "rE\u00ca\u0000\u00a5\u00d3\u00faJyM\u00d2_[\u00e5\u00b2\u00f3\u00a4\u009dL\u00f3\u0083\u00e1$\u00b8\u00de\u00f1\u008ck\u00840|\u00c0A\u008c\u009c0\u00ae\u009d\u008f\u0018\u00c2\u008cE\u00d6\n\u00d3\u00ab|\u00d0`-\u00c0cej\u00ce=\u00a2S\u001eQ\u0016Tj\u009f:0k\u00adi]\u00d8\u0014\u00d4\u0003\\\u0007\u00fd\u00e6{:r\u00b9z\u00eaJ\u00997\u0081>\u0004\u0098%\u00c4\u00bcH\u00fe\u00bb\u00b5\u00f0\u0085Q\u009c\u001f\u008f;\u0014$\u00fb?A\u0099\u00d0\u0083\u00c4\u00b9k>e\u008e\u0081C\u00f1\u0013\u00d1\u007f\u0097G\u0016\u00b6\u00e3Ke\u009e\u00d1)9D\u00b6QB\u00de\u0087\u008a/\u0002\u00ac\u00957\u00fc0P\u00cf3\u0005,\u0084p%&1\u00cf?v\u009e\u00fc\u0088A";
                var5_6 = "rE\u00ca\u0000\u00a5\u00d3\u00faJyM\u00d2_[\u00e5\u00b2\u00f3\u00a4\u009dL\u00f3\u0083\u00e1$\u00b8\u00de\u00f1\u008ck\u00840|\u00c0A\u008c\u009c0\u00ae\u009d\u008f\u0018\u00c2\u008cE\u00d6\n\u00d3\u00ab|\u00d0`-\u00c0cej\u00ce=\u00a2S\u001eQ\u0016Tj\u009f:0k\u00adi]\u00d8\u0014\u00d4\u0003\\\u0007\u00fd\u00e6{:r\u00b9z\u00eaJ\u00997\u0081>\u0004\u0098%\u00c4\u00bcH\u00fe\u00bb\u00b5\u00f0\u0085Q\u009c\u001f\u008f;\u0014$\u00fb?A\u0099\u00d0\u0083\u00c4\u00b9k>e\u008e\u0081C\u00f1\u0013\u00d1\u007f\u0097G\u0016\u00b6\u00e3Ke\u009e\u00d1)9D\u00b6QB\u00de\u0087\u008a/\u0002\u00ac\u00957\u00fc0P\u00cf3\u0005,\u0084p%&1\u00cf?v\u009e\u00fc\u0088A".length();
                var2_7 = 0;
                while (true) {
                    var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                    v3 = var6_3;
                    v4 = var3_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var2_7 < var5_6) ** continue;
                    var4_5 = "\u009e\u009a\u0002mj<^\u00fa\u0001\u00dc2*\b\u00d5\u00b1\u008b";
                    var5_6 = "\u009e\u009a\u0002mj<^\u00fa\u0001\u00dc2*\b\u00d5\u00b1\u008b".length();
                    var2_7 = 0;
                    while (true) {
                        var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                        v3 = var6_3;
                        v4 = var3_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
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
                    if (var2_7 < var5_6) ** continue;
                    break block9;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var0_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
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
        CryptographicOperationCoordinator.c = var6_3;
        CryptographicOperationCoordinator.d = new Integer[23];
        CryptographicOperationCoordinator.r = new LinkedHashMap<String, CryptographicInterface>();
        CryptographicOperationCoordinator.a = ((CipherTextEncoder)((CipherTextEncoder)((CipherTextEncoder)CryptographicInterface.j().W().y((String)CryptographicOperationCoordinator.b("\u00cb", (int)CryptographicOperationCoordinator.a("b", (int)20145, (long)(498198458522478873L ^ var11)), (long)-6577171100921640115L, (long)var11))).n((String)CryptographicOperationCoordinator.b("\u00cb", (int)CryptographicOperationCoordinator.a("b", (int)13733, (long)(7243667554241696260L ^ var11)), (long)-6577171100921640115L, (long)var11))).f((String)CryptographicOperationCoordinator.b("\u00cb", (int)CryptographicOperationCoordinator.a("b", (int)30659, (long)(6147927726922567780L ^ var11)), (long)-6577171100921640115L, (long)var11))).o();
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptographicOperationCoordinator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field c(long l, long l2) {
        int n = CryptographicOperationCoordinator.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptographicOperationCoordinator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptographicOperationCoordinator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptographicOperationCoordinator.a(clazz3, string2, clazz2)) != null) {
                    CryptographicOperationCoordinator.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptographicOperationCoordinator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptographicOperationCoordinator.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptographicOperationCoordinator.b(222929489001677L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static @UnmodifiableView List<CryptographicInterface> F() {
        return new ArrayList<CryptographicInterface>(r.values());
    }

    @Nullable
    public static CryptographicInterface s(String string) {
        return r.get(string);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/K7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/K7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptographicOperationCoordinator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CryptographicOperationCoordinator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

