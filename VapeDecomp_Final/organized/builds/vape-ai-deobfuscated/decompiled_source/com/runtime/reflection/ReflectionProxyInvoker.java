/*
 * Decompiled with CFR 0.152.
 */
package com.runtime.reflection;

import a.HK;
import a.zY;
import com.app.streaming.StreamProcessingHandler2686;
import com.collections.management.MultiContainerRegistry;
import com.crypto.protocol.CryptoProtocolEngine;
import com.data.query.QueryExecutionStrategy;
import com.exception.system.CustomSystemException;
import com.metadata.analysis.MetadataExtractor;
import com.reflection.util.ContextualReflectionUtility;
import com.runtime.reflection.ReflectionUtilityService;
import com.security.crypto.CryptographicContextManager577;
import com.session.management.SessionManagementInterface;
import com.util.encoding.StringObfuscationUtility;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.Key;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ReflectionProxyInvoker {
    private static final long[] c;
    private static final String a = "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;";
    private static final Object[] h;
    private static Method O;
    private static final String w = "(Ljava/lang/Object;)Ljava/lang/Object;";
    private static Method G;
    private static Method g;
    private static final Map<Method, Class<? extends SessionManagementInterface>> Y;
    private static final Map f;
    private static Method L;
    public static final String F = "(Ljava/lang/Object;Ljava/lang/Object;)V";
    private static AtomicInteger j;
    private static final String[] i;
    private static final String r = "(Ljava/lang/Object;Ljava/lang/Object;)V";
    private static final long b;
    public static final String e = "(Ljava/lang/Object;)Ljava/lang/Object;";
    private static final Map<Field, Class<? extends QueryExecutionStrategy>> Q;
    private static final Integer[] d;

    public static Class<? extends StreamProcessingHandler2686> L(Class<?> clazz, Method method) {
        int n;
        CryptographicContextManager577 cryptographicContextManager577;
        Class<?> clazz2;
        CryptographicContextManager577 cryptographicContextManager5772;
        MetadataExtractor metadataExtractor;
        String string;
        block33: {
            block32: {
                long l = b ^ 0x7F03CDF0D637L;
                ReflectionProxyInvoker.N();
                string = ReflectionProxyInvoker.T(clazz, method);
                metadataExtractor = new MetadataExtractor(3);
                metadataExtractor.u(52, 1, string.replace('.', '/'), null, zY.v(Object.class), new String[]{zY.v(StreamProcessingHandler2686.class)});
                cryptographicContextManager5772 = new CryptographicContextManager577(metadataExtractor.q(1, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)28422, (long)(0x1DF565E0B108E09AL ^ l)), (long)1631789060066450650L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)10282, (long)(0x7C4477BE9C3427DEL ^ l)), (long)1631789060066450650L, (long)l)), null, null), 1, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)4131, (long)(0x3007DB999C1C9F80L ^ l)), (long)1631789060066450650L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)19640, (long)(0x12D0A94AD1534333L ^ l)), (long)1631789060066450650L, (long)l)));
                cryptographicContextManager5772.F();
                cryptographicContextManager5772.M(183, zY.v(Object.class), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)24999, (long)(0x650DAD9F0C7E6E54L ^ l)), (long)1631789060066450650L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)11837, (long)(0x37087E10C3F821A5L ^ l)), (long)1631789060066450650L, (long)l)), false);
                cryptographicContextManager5772.j();
                cryptographicContextManager5772.g();
                cryptographicContextManager5772 = new CryptographicContextManager577(metadataExtractor.q(1, L.getName(), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)22294, (long)(0x69ABE5C85AF65893L ^ l)), (long)1631789060066450650L, (long)l)), null, null), 1, L.getName(), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)8434, (long)(0x3808E07EEF88AF41L ^ l)), (long)1631789060066450650L, (long)l)));
                cryptographicContextManager5772.v();
                cryptographicContextManager5772.n(25, 1);
                cryptographicContextManager5772.n(192, zY.v(clazz));
                if (method.getParameters().length > 0) {
                    for (int i = 0; i < method.getParameters().length; ++i) {
                        clazz2 = method.getParameterTypes()[i];
                        try {
                            cryptographicContextManager5772.n(25, 2);
                            if (Boolean.TYPE == clazz2) {
                                cryptographicContextManager5772.n(192, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)5012, (long)(0x2CE37E334C679C43L ^ l)), (long)1631789060066450650L, (long)l)));
                                cryptographicContextManager5772.M(182, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)10349, (long)(0x11F26C5BB69E27FFL ^ l)), (long)1631789060066450650L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)20267, (long)(0xA2C895F0F8CC09FL ^ l)), (long)1631789060066450650L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)14109, (long)(0x26C4ACB82376B892L ^ l)), (long)1631789060066450650L, (long)l)), false);
                                continue;
                            }
                        }
                        catch (Exception exception) {
                            throw ReflectionProxyInvoker.a(exception);
                        }
                        try {
                            if (Byte.TYPE == clazz2) {
                                cryptographicContextManager5772.n(192, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)12101, (long)(0x2CEAE163D492A03EL ^ l)), (long)1631789060066450650L, (long)l)));
                                cryptographicContextManager5772.M(182, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)27488, (long)(0x50439B71DDA5649AL ^ l)), (long)1631789060066450650L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)356, (long)(0x32926AB3E4260E92L ^ l)), (long)1631789060066450650L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)22599, (long)(0x4BCA0BA90365D7D3L ^ l)), (long)1631789060066450650L, (long)l)), false);
                                continue;
                            }
                        }
                        catch (Exception exception) {
                            throw ReflectionProxyInvoker.a(exception);
                        }
                        try {
                            if (Character.TYPE == clazz2) {
                                cryptographicContextManager5772.n(192, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)11847, (long)(0x7147283FBEA5A1F9L ^ l)), (long)1631789060066450650L, (long)l)));
                                cryptographicContextManager5772.M(182, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)13588, (long)(0x7B2FFF05D08D3AB1L ^ l)), (long)1631789060066450650L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)6533, (long)(0x1BC1F7D82858166EL ^ l)), (long)1631789060066450650L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)2378, (long)(0x69877FE22AF286E6L ^ l)), (long)1631789060066450650L, (long)l)), false);
                                continue;
                            }
                        }
                        catch (Exception exception) {
                            throw ReflectionProxyInvoker.a(exception);
                        }
                        try {
                            if (Short.TYPE == clazz2) {
                                cryptographicContextManager5772.n(192, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)26441, (long)(0x183E9309FFB9E898L ^ l)), (long)1631789060066450650L, (long)l)));
                                cryptographicContextManager5772.M(182, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)21499, (long)(0x59CE828EB8885C3CL ^ l)), (long)1631789060066450650L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)26099, (long)(0x6345E26BE953EA64L ^ l)), (long)1631789060066450650L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)18652, (long)(0x4A5F9D6A2657474DL ^ l)), (long)1631789060066450650L, (long)l)), false);
                                continue;
                            }
                        }
                        catch (Exception exception) {
                            throw ReflectionProxyInvoker.a(exception);
                        }
                        try {
                            if (Integer.TYPE == clazz2) {
                                cryptographicContextManager5772.n(192, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)25968, (long)(0x1EF4EDE885666AB0L ^ l)), (long)1631789060066450650L, (long)l)));
                                cryptographicContextManager5772.M(182, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)7843, (long)(0x442481F70FB91165L ^ l)), (long)1631789060066450650L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)13856, (long)(0x693919E45E0D3984L ^ l)), (long)1631789060066450650L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)20317, (long)(0x6F9A620E7056C02EL ^ l)), (long)1631789060066450650L, (long)l)), false);
                                continue;
                            }
                        }
                        catch (Exception exception) {
                            throw ReflectionProxyInvoker.a(exception);
                        }
                        try {
                            if (Long.TYPE == clazz2) {
                                cryptographicContextManager5772.n(192, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)27559, (long)(0x64A776807D97E416L ^ l)), (long)1631789060066450650L, (long)l)));
                                cryptographicContextManager5772.M(182, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)14863, (long)(0x740782F9FEE5B5DBL ^ l)), (long)1631789060066450650L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)9465, (long)(0x61CC2204ED012B17L ^ l)), (long)1631789060066450650L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)14512, (long)(0x2B445BDD71E3730L ^ l)), (long)1631789060066450650L, (long)l)), false);
                                continue;
                            }
                        }
                        catch (Exception exception) {
                            throw ReflectionProxyInvoker.a(exception);
                        }
                        try {
                            if (Float.TYPE == clazz2) {
                                cryptographicContextManager5772.n(192, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)18731, (long)(0x7938AED53E7DC697L ^ l)), (long)1631789060066450650L, (long)l)));
                                cryptographicContextManager5772.M(182, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)27305, (long)(0x5CEAC6C2FD19E502L ^ l)), (long)1631789060066450650L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)26696, (long)(0x254AB2D29BE8E793L ^ l)), (long)1631789060066450650L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)26829, (long)(0x2C1280215AED6745L ^ l)), (long)1631789060066450650L, (long)l)), false);
                                continue;
                            }
                        }
                        catch (Exception exception) {
                            throw ReflectionProxyInvoker.a(exception);
                        }
                        try {
                            if (Double.TYPE == clazz2) {
                                cryptographicContextManager5772.n(192, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)12167, (long)(0x76D4EAC0C512201AL ^ l)), (long)1631789060066450650L, (long)l)));
                                cryptographicContextManager5772.M(182, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)30764, (long)(0x2AB4E07D7041F7C6L ^ l)), (long)1631789060066450650L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)9093, (long)(0x1BE7BCE8A7F9AC02L ^ l)), (long)1631789060066450650L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)31125, (long)(0x510C9072CB5DF60EL ^ l)), (long)1631789060066450650L, (long)l)), false);
                                continue;
                            }
                        }
                        catch (Exception exception) {
                            throw ReflectionProxyInvoker.a(exception);
                        }
                        cryptographicContextManager5772.n(192, zY.v(clazz2));
                    }
                }
                try {
                    cryptographicContextManager577 = cryptographicContextManager5772;
                    if (!Modifier.isStatic(method.getModifiers())) break block32;
                    n = 184;
                    break block33;
                }
                catch (Exception exception) {
                    throw ReflectionProxyInvoker.a(exception);
                }
            }
            try {
                n = clazz.isInterface() ? 185 : 182;
            }
            catch (Exception exception) {
                throw ReflectionProxyInvoker.a(exception);
            }
        }
        cryptographicContextManager577.M(n, zY.v(clazz), method.getName(), ContextualReflectionUtility.R(method.getReturnType(), method.getParameterTypes()), clazz.isInterface());
        cryptographicContextManager5772.T(177);
        cryptographicContextManager5772.g();
        metadataExtractor.t();
        byte[] byArray = metadataExtractor.V();
        try {
            clazz2 = StringObfuscationUtility.A.D(ReflectionProxyInvoker.class.getClassLoader(), string, byArray);
            return clazz2;
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = ">3x";
        objectArray[1] = Integer.TYPE;
        ReflectionProxyInvoker.i[1] = "java/lang/Integer";
        objectArray[2] = "YhD2}pRgU}\u0000hA`\\4";
        objectArray[3] = "ib2\u001apebm#U\u0011kif'\u000f";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "(4\rv?p-!AH?5Jr\r5,%v:I1(Ns*\u000fp%rw4PpT";
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/ZX" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (i[n4] != null) {
            return n4;
        }
        Object object = h[n4];
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
                n3 = 8;
                break;
            }
            case 2: {
                n3 = 50;
                break;
            }
            case 3: {
                n3 = 46;
                break;
            }
            case 4: {
                n3 = 43;
                break;
            }
            case 5: {
                n3 = 17;
                break;
            }
            case 6: {
                n3 = 31;
                break;
            }
            case 7: {
                n3 = 19;
                break;
            }
            case 8: {
                n3 = 5;
                break;
            }
            case 9: {
                n3 = 23;
                break;
            }
            case 10: {
                n3 = 56;
                break;
            }
            case 11: {
                n3 = 4;
                break;
            }
            case 12: {
                n3 = 2;
                break;
            }
            case 13: {
                n3 = 40;
                break;
            }
            case 14: {
                n3 = 47;
                break;
            }
            case 15: {
                n3 = 59;
                break;
            }
            case 16: {
                n3 = 6;
                break;
            }
            case 17: {
                n3 = 58;
                break;
            }
            case 18: {
                n3 = 9;
                break;
            }
            case 19: {
                n3 = 10;
                break;
            }
            case 20: {
                n3 = 26;
                break;
            }
            case 21: {
                n3 = 20;
                break;
            }
            case 22: {
                n3 = 63;
                break;
            }
            case 23: {
                n3 = 37;
                break;
            }
            case 24: {
                n3 = 27;
                break;
            }
            case 25: {
                n3 = 22;
                break;
            }
            case 26: {
                n3 = 35;
                break;
            }
            case 27: {
                n3 = 49;
                break;
            }
            case 28: {
                n3 = 25;
                break;
            }
            case 29: {
                n3 = 16;
                break;
            }
            case 30: {
                n3 = 24;
                break;
            }
            case 31: {
                n3 = 51;
                break;
            }
            case 32: {
                n3 = 15;
                break;
            }
            case 33: {
                n3 = 38;
                break;
            }
            case 34: {
                n3 = 44;
                break;
            }
            case 35: {
                n3 = 41;
                break;
            }
            case 36: {
                n3 = 30;
                break;
            }
            case 37: {
                n3 = 42;
                break;
            }
            case 38: {
                n3 = 45;
                break;
            }
            case 39: {
                n3 = 61;
                break;
            }
            case 40: {
                n3 = 32;
                break;
            }
            case 41: {
                n3 = 60;
                break;
            }
            case 42: {
                n3 = 11;
                break;
            }
            case 43: {
                n3 = 28;
                break;
            }
            case 44: {
                n3 = 62;
                break;
            }
            case 45: {
                n3 = 55;
                break;
            }
            case 46: {
                n3 = 0;
                break;
            }
            case 47: {
                n3 = 34;
                break;
            }
            case 48: {
                n3 = 18;
                break;
            }
            case 49: {
                n3 = 36;
                break;
            }
            case 50: {
                n3 = 39;
                break;
            }
            case 51: {
                n3 = 52;
                break;
            }
            case 52: {
                n3 = 48;
                break;
            }
            case 53: {
                n3 = 33;
                break;
            }
            case 54: {
                n3 = 7;
                break;
            }
            case 55: {
                n3 = 14;
                break;
            }
            case 56: {
                n3 = 54;
                break;
            }
            case 57: {
                n3 = 3;
                break;
            }
            case 58: {
                n3 = 12;
                break;
            }
            case 59: {
                n3 = 53;
                break;
            }
            case 60: {
                n3 = 57;
                break;
            }
            case 61: {
                n3 = 21;
                break;
            }
            case 62: {
                n3 = 29;
                break;
            }
            default: {
                n3 = 13;
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
        ReflectionProxyInvoker.i[n4] = new String(cArray);
        return n4;
    }

    private static Field c(long l, long l2) {
        int n = ReflectionProxyInvoker.a(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = ReflectionProxyInvoker.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ReflectionProxyInvoker.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ReflectionProxyInvoker.a(clazz3, string2, clazz2)) != null) {
                    ReflectionProxyInvoker.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ReflectionProxyInvoker.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ReflectionProxyInvoker.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ReflectionProxyInvoker.b(216854996435245L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/ZX" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method N() {
        block19: {
            long l = b ^ 0x3DC44A9AAEE3L;
            if (g == null) {
                for (Method method : SessionManagementInterface.class.getDeclaredMethods()) {
                    try {
                        if (!((String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)21863, (long)(0x61837CF0941B2229L ^ l)), (long)7958147817678791694L, (long)l))).equals(ContextualReflectionUtility.R(method.getReturnType(), method.getParameterTypes()))) continue;
                        g = method;
                        break;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ReflectionProxyInvoker.a(customSystemException);
                    }
                }
                if (g == null) {
                    // empty if block
                }
                for (Method method : StreamProcessingHandler2686.class.getDeclaredMethods()) {
                    try {
                        if (!((String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)2648, (long)(0x3CB1D65B0E7E7D3CL ^ l)), (long)7958147817678791694L, (long)l))).equals(ContextualReflectionUtility.R(method.getReturnType(), method.getParameterTypes()))) continue;
                        L = method;
                        break;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ReflectionProxyInvoker.a(customSystemException);
                    }
                }
                if (L == null) {
                    // empty if block
                }
            }
            try {
                if (O != null && G != null) break block19;
            }
            catch (CustomSystemException customSystemException) {
                throw ReflectionProxyInvoker.a(customSystemException);
            }
            for (Method method : QueryExecutionStrategy.class.getDeclaredMethods()) {
                try {
                    if (((String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)20815, (long)(0x6972939CDFC0A644L ^ l)), (long)7958147817678791694L, (long)l))).equals(ContextualReflectionUtility.R(method.getReturnType(), method.getParameterTypes()))) {
                        O = method;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ReflectionProxyInvoker.a(customSystemException);
                }
                try {
                    if (!((String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)4378, (long)(0x660BDF432AE0E6B9L ^ l)), (long)7958147817678791694L, (long)l))).equals(ContextualReflectionUtility.R(method.getReturnType(), method.getParameterTypes()))) continue;
                    G = method;
                }
                catch (CustomSystemException customSystemException) {
                    throw ReflectionProxyInvoker.a(customSystemException);
                }
            }
            if (O == null) {
                // empty if block
            }
            if (G == null) {
                // empty if block
            }
        }
        return g;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ReflectionProxyInvoker.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ReflectionProxyInvoker.b(classArray2[i], string, clazz2, n, classArray);
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
                ReflectionProxyInvoker.b = MultiContainerRegistry.a(6177099248648965302L, 6638485053947174198L, MethodHandles.lookup().lookupClass()).a(33955066142958L);
                ReflectionProxyInvoker.h = new Object[5];
                ReflectionProxyInvoker.i = new String[5];
                ReflectionProxyInvoker.a();
                ReflectionProxyInvoker.f = new HashMap<K, V>(13);
                var0 = ReflectionProxyInvoker.b ^ 1289212902480L;
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
                var8_3 = new long[141];
                var5_4 = 0;
                var6_5 = "\u00c17\u0004g\u0082\u008e\u00ed\u00ae\u00af\u00b7d\u0007\n/\u0012$(\ra\u0095\u00aa\u00dd\u00b0\u00b7@\u0091\u009d\u000f^\u00c7\u00a9\u00c7\u00b4n\u009d\u00b7\u001d\u00f4\u0094+W\u0083\u00aa\u0094\u00e5\u00ef\u008d\u00a2K\u00d6J\u00da\u0094\u001a\u00d7\u00a0\rxt\u00d3z\u009f\u001f\u0017h5\u00cdt\u00c6\u00da\u00a3\u00fbr\u00bc\u00fca\u0087\u0000`S~\u00b7\u00acU\u00f0^^\u0097\u00a3\u00b0Q\u00e0\u00c1[M\u009b\u00d6\u00a4\u000b\u00c9j7#BN\u009b\u00f7u!\u00bef-\u00dd\u00fe3\u00e9\u00d4\u00c3s\u00a1\u0081\u0082\u00cc\u00a4\u00f85\u001e\u0098]\u007fK$\u00ddz\u0014\u00ecq\u0017\u00f6[\u0092\u001e\u00125\u00b2S6\u00f2\u00a7\u00fa\u008a\u00daw\u0088E\u000b\u00a0T\u00c4\u00ee\u00ed<s]\u0010\u0091[\u0010\u00e9\u00ea\u0004y\u0011Hl\u000b\u00e7 \u00cf\u00ce\u00aa\u00ee\u0083L\u009e\u000b\u00c5\u00a3=Jp\u009ab\u008c\u00ff\u00c1\u00d8;\u0093|\u00b6\b\u0085\u001b\u00c5)2\u00e7\u00d5\u00ea\u00b7t\u0090LNO\u00ffA\u00b3Td#\u00db\u00e4\u00bb\u00be\u00fcP\u0091\b7\b\u00b5F|\u00ac\u0099\u00ebK\u00ca\u00f8x\u000b\u00d6\u00c5\u00a5\u00d8\u0086\u0017\u00a3]8\u0094\u0012\f\u0016SW\u0094\u0092j\u000f.\u00b3\u00ed;J\u0084\u0018\u0015?]`\u009a\u007fs\u0093\u00d1\u00fe\u00d1\u009c\u00ca\u00c5H\u0090=\u00b2\u0086\u00b5C%x\u009dki\u00e6{\u00f5.\u0089\u00c8\u00d7\u00f1\u0085\u001b\u008e\u001b\u001b\u009a\u008bY\u00e9\u00e6\u0019\u00d9)xZ`\u0003\u001e\u00eb\u009cZ\u00dem\u00f1\u00994x\u0010\u009e\u00fb\u00a7\u00e3\u00b6\u00b6^\u00f8F\u00e5w\u00ba\u0007\u00c07\u0093\u0093\u00aaW\u0015\u0097\f\u00ff\u007f\u0083k\u00c3\u00c2M\u0085\u0086\u00cc\u00f0b\u00e6\u00df\u00bf\u00c8\u00f2\u008bM\u008bG\t9\u00f5\u00a7\u0090\u00f7\u00dd:x?\u008bj\u00cd\u00eb(\u008dc\r\u00c2U\u009cu\u00c0d\u001fr\u00f1\u00f6\u009d\u00ca\u00a9\u0089a\u001aW\u00ad\u0000\u00d7\n\u00ebF\u008b*\u0084\u00b9\u008f\u0098\u00fd\u009dW\u0015\u0000\u00f2\u00ed\u007f\u000f\u00b6\u00a9\u00e8\u00c5\u00d7\u0013PPE\u00cac\u007f\u0012\u00bcY_\u00c4q\u00c2\u00e9@\u00f2\u0082\u001fM\u001cuW\u0019+t\u00e3;\u0004r$'\u00eb\u00e6O\u00dd\u0013\u00e2\u00d63\b:\u0090j\u00b1[\u00bd\u009b\u0091\u00cf\u007f+\u0002>\u00a8)\u0013^M\u009e\u00cf\u009d.\u001c\u001e\u00c0M\u00afU;\u00c2H\u0019\u00a8H*zy\u0099\u00c7\u00f1,\u00ce{\u0014\u00c2\u00ac\u00c2\u0005\u00c7_\u00e2\u00d2\u0081z\r2\u00e1\u00b8u\u0014\u0085\u00fb\u000f-\\\u00d2\u00c6\u00bc6\u00cfv[\u0007y\u00f7^\u009a\u00b7Sbj\u00a2\u001e|\u00f4\u00ba\u00d1\u0085\u00a2\u00a1\u00cfY+6X\u0005\u00fd<xe\u0097\u00bb\u00a8\t\u00e76\u00bb\u00b2\u001aC\u00ff[Ed\u00ad\u00d9\u0001\u00d16\u00fa\u0000\u0006\u000eP\u00d4v\u00a9(\u00a5\u00e7\u00bcP\u00b1\u00151\u00f1^\u00c6\u00d0\u001f\u00aaV\u00ae\u0080\u0000\u00fe\u000e\u00d3\u00d4\u00e2\u00c1\u00beIJ\u008b\u00cc\u00d7v\u00ddGrLh1\u00f0\u00c8\u00f0\u0011\u00d8\u00c8=\u0096z\u00f3\u00ce\u0096\u009c\u008a\u00f7\u0000\u00dc\u009b\\eB\u0005u\u009f\u0002T\u0005\u0007\u00e3\u00ef\u00ff\u00b9\u00a9\u009bn\u00fe\u00f5t\u00c2\u0094\u0099\u00b3\u0081\u00a7\u00e59\u00ba\u009b\u00e9\u0094\u00d8&&D'*9\u0013s\u0010\u001d7\u00c7V;\u00fd\u00a9b3x\u00a2\b^-\u00e6\u00b3>\u00dd\u000b\u009e\u0088\"<}\u0092o\u00d7\u00cela\u00d5\u00cf\u0018\u0011\u00b3R(\u00b3+16\u00d8~\u009d\u00f4*\u00b2\u00be\u00b6\u0017\u00bax;\u00fe\u00ef<\u0001f\u0001\u0015\u0084\u00e4Z\u00d2\u00c7\u00d5\u00c3ooT`\u0000\u000e6\u00b3yt\u001a\u00b5\u00191n\u00dc\u0088\u00fdxuu5\u007f\u00d5>\u00f8:\u009e\u0089M^\u00f4.P\u00dadq\u009d<`q\u00cd(\u0016\u0006\u00c8\u00aa\u00d5\u00f2\u00f0\u00f7\u00c9\u00c2ieN\u0005\u0006+u\u008e:\u00f80\u00f5o\u00ecK^\u00c7@\u001a\u0090;\u001b\u00bdxq\u0015\u00a6\u00c2\u0084\u0004\u00aaB%\u00ddq\u0097\u00a9\u008e*\u0005\u00e7\u00a1\u00be\u00e8\u00e2\u00c5\u00bb\u00b3\u00a3q\t\u001fRX!G\u00d7\u00a3\u00a5\u00d1O@\u0098\u00e3x\u000b\u00cb\u008aj\u00ab\u00a5|+\u00cc\u00fc\u00cf\u00e9\u0017(\u00a2\u00d7Bc\u0018\u007f\u00eb\u0081\u00b4\u00bb+\u00b1\u008e\u00f21\u007f\u00a9\u00a9\u00fc\u00a3\u00d5\u0090\u007f\u00d6\u0098\u00a3\u0098\u008bF7\u0019\u00f6\u00d7o\u0096\u00e0z\u00a2(\u0013u\u0098\u0012%\u001a/26\u0006N_\u00ba\u00a3\u00d7\f\u00d2$\u00e7\u00be\u0017\u00abz\u0019C\u0013Q\u00ce_}\u00b5e=S\u0096hr\u00aa\u00bb\u00b6\u00a7\u009d\u00f2\u00abO\u00fe\u00b4\u0013\u00a8X\u0016r{\u00ca\u0089\u00f0\u00c8\u0099\u00ffO\u00aa;\u00db/-\u00dc\b\u00b2/\u0080\u00f2\b\u00d2S\u00da7\u00c4d\u00e0K\u00aa\u00d5\u00bb\u00ceL\u00a1\u0000\u0085\u00a1Ar\u001a\u00ef\u0015J\u0003\u00d2\u00a1nO\u0019\u00ebj\u0084\u00bdT\u00cb\u00cf\u00b6\u0011\u009b\u009b\u00a0{\u00bfX\u0083\u00d9\u00ec\u0003\u0082\u008a\u00e1\u0084\u00f9\u00a74\f\u00a7\u0092\u00c8|\u009a\u001f\u000e\u00d5s\u00a9|D\u00ae\u00c6\u00f1\u00ee\u0089\u001exso\u00ee+`\u00fd\u0013/\u0002\u0094\u00fdF\u00b2\u00d8\u008aN\u001bqT\u000e\u0094\u0090L\u00ed\u00f2\u00eaW";
                var7_6 = "\u00c17\u0004g\u0082\u008e\u00ed\u00ae\u00af\u00b7d\u0007\n/\u0012$(\ra\u0095\u00aa\u00dd\u00b0\u00b7@\u0091\u009d\u000f^\u00c7\u00a9\u00c7\u00b4n\u009d\u00b7\u001d\u00f4\u0094+W\u0083\u00aa\u0094\u00e5\u00ef\u008d\u00a2K\u00d6J\u00da\u0094\u001a\u00d7\u00a0\rxt\u00d3z\u009f\u001f\u0017h5\u00cdt\u00c6\u00da\u00a3\u00fbr\u00bc\u00fca\u0087\u0000`S~\u00b7\u00acU\u00f0^^\u0097\u00a3\u00b0Q\u00e0\u00c1[M\u009b\u00d6\u00a4\u000b\u00c9j7#BN\u009b\u00f7u!\u00bef-\u00dd\u00fe3\u00e9\u00d4\u00c3s\u00a1\u0081\u0082\u00cc\u00a4\u00f85\u001e\u0098]\u007fK$\u00ddz\u0014\u00ecq\u0017\u00f6[\u0092\u001e\u00125\u00b2S6\u00f2\u00a7\u00fa\u008a\u00daw\u0088E\u000b\u00a0T\u00c4\u00ee\u00ed<s]\u0010\u0091[\u0010\u00e9\u00ea\u0004y\u0011Hl\u000b\u00e7 \u00cf\u00ce\u00aa\u00ee\u0083L\u009e\u000b\u00c5\u00a3=Jp\u009ab\u008c\u00ff\u00c1\u00d8;\u0093|\u00b6\b\u0085\u001b\u00c5)2\u00e7\u00d5\u00ea\u00b7t\u0090LNO\u00ffA\u00b3Td#\u00db\u00e4\u00bb\u00be\u00fcP\u0091\b7\b\u00b5F|\u00ac\u0099\u00ebK\u00ca\u00f8x\u000b\u00d6\u00c5\u00a5\u00d8\u0086\u0017\u00a3]8\u0094\u0012\f\u0016SW\u0094\u0092j\u000f.\u00b3\u00ed;J\u0084\u0018\u0015?]`\u009a\u007fs\u0093\u00d1\u00fe\u00d1\u009c\u00ca\u00c5H\u0090=\u00b2\u0086\u00b5C%x\u009dki\u00e6{\u00f5.\u0089\u00c8\u00d7\u00f1\u0085\u001b\u008e\u001b\u001b\u009a\u008bY\u00e9\u00e6\u0019\u00d9)xZ`\u0003\u001e\u00eb\u009cZ\u00dem\u00f1\u00994x\u0010\u009e\u00fb\u00a7\u00e3\u00b6\u00b6^\u00f8F\u00e5w\u00ba\u0007\u00c07\u0093\u0093\u00aaW\u0015\u0097\f\u00ff\u007f\u0083k\u00c3\u00c2M\u0085\u0086\u00cc\u00f0b\u00e6\u00df\u00bf\u00c8\u00f2\u008bM\u008bG\t9\u00f5\u00a7\u0090\u00f7\u00dd:x?\u008bj\u00cd\u00eb(\u008dc\r\u00c2U\u009cu\u00c0d\u001fr\u00f1\u00f6\u009d\u00ca\u00a9\u0089a\u001aW\u00ad\u0000\u00d7\n\u00ebF\u008b*\u0084\u00b9\u008f\u0098\u00fd\u009dW\u0015\u0000\u00f2\u00ed\u007f\u000f\u00b6\u00a9\u00e8\u00c5\u00d7\u0013PPE\u00cac\u007f\u0012\u00bcY_\u00c4q\u00c2\u00e9@\u00f2\u0082\u001fM\u001cuW\u0019+t\u00e3;\u0004r$'\u00eb\u00e6O\u00dd\u0013\u00e2\u00d63\b:\u0090j\u00b1[\u00bd\u009b\u0091\u00cf\u007f+\u0002>\u00a8)\u0013^M\u009e\u00cf\u009d.\u001c\u001e\u00c0M\u00afU;\u00c2H\u0019\u00a8H*zy\u0099\u00c7\u00f1,\u00ce{\u0014\u00c2\u00ac\u00c2\u0005\u00c7_\u00e2\u00d2\u0081z\r2\u00e1\u00b8u\u0014\u0085\u00fb\u000f-\\\u00d2\u00c6\u00bc6\u00cfv[\u0007y\u00f7^\u009a\u00b7Sbj\u00a2\u001e|\u00f4\u00ba\u00d1\u0085\u00a2\u00a1\u00cfY+6X\u0005\u00fd<xe\u0097\u00bb\u00a8\t\u00e76\u00bb\u00b2\u001aC\u00ff[Ed\u00ad\u00d9\u0001\u00d16\u00fa\u0000\u0006\u000eP\u00d4v\u00a9(\u00a5\u00e7\u00bcP\u00b1\u00151\u00f1^\u00c6\u00d0\u001f\u00aaV\u00ae\u0080\u0000\u00fe\u000e\u00d3\u00d4\u00e2\u00c1\u00beIJ\u008b\u00cc\u00d7v\u00ddGrLh1\u00f0\u00c8\u00f0\u0011\u00d8\u00c8=\u0096z\u00f3\u00ce\u0096\u009c\u008a\u00f7\u0000\u00dc\u009b\\eB\u0005u\u009f\u0002T\u0005\u0007\u00e3\u00ef\u00ff\u00b9\u00a9\u009bn\u00fe\u00f5t\u00c2\u0094\u0099\u00b3\u0081\u00a7\u00e59\u00ba\u009b\u00e9\u0094\u00d8&&D'*9\u0013s\u0010\u001d7\u00c7V;\u00fd\u00a9b3x\u00a2\b^-\u00e6\u00b3>\u00dd\u000b\u009e\u0088\"<}\u0092o\u00d7\u00cela\u00d5\u00cf\u0018\u0011\u00b3R(\u00b3+16\u00d8~\u009d\u00f4*\u00b2\u00be\u00b6\u0017\u00bax;\u00fe\u00ef<\u0001f\u0001\u0015\u0084\u00e4Z\u00d2\u00c7\u00d5\u00c3ooT`\u0000\u000e6\u00b3yt\u001a\u00b5\u00191n\u00dc\u0088\u00fdxuu5\u007f\u00d5>\u00f8:\u009e\u0089M^\u00f4.P\u00dadq\u009d<`q\u00cd(\u0016\u0006\u00c8\u00aa\u00d5\u00f2\u00f0\u00f7\u00c9\u00c2ieN\u0005\u0006+u\u008e:\u00f80\u00f5o\u00ecK^\u00c7@\u001a\u0090;\u001b\u00bdxq\u0015\u00a6\u00c2\u0084\u0004\u00aaB%\u00ddq\u0097\u00a9\u008e*\u0005\u00e7\u00a1\u00be\u00e8\u00e2\u00c5\u00bb\u00b3\u00a3q\t\u001fRX!G\u00d7\u00a3\u00a5\u00d1O@\u0098\u00e3x\u000b\u00cb\u008aj\u00ab\u00a5|+\u00cc\u00fc\u00cf\u00e9\u0017(\u00a2\u00d7Bc\u0018\u007f\u00eb\u0081\u00b4\u00bb+\u00b1\u008e\u00f21\u007f\u00a9\u00a9\u00fc\u00a3\u00d5\u0090\u007f\u00d6\u0098\u00a3\u0098\u008bF7\u0019\u00f6\u00d7o\u0096\u00e0z\u00a2(\u0013u\u0098\u0012%\u001a/26\u0006N_\u00ba\u00a3\u00d7\f\u00d2$\u00e7\u00be\u0017\u00abz\u0019C\u0013Q\u00ce_}\u00b5e=S\u0096hr\u00aa\u00bb\u00b6\u00a7\u009d\u00f2\u00abO\u00fe\u00b4\u0013\u00a8X\u0016r{\u00ca\u0089\u00f0\u00c8\u0099\u00ffO\u00aa;\u00db/-\u00dc\b\u00b2/\u0080\u00f2\b\u00d2S\u00da7\u00c4d\u00e0K\u00aa\u00d5\u00bb\u00ceL\u00a1\u0000\u0085\u00a1Ar\u001a\u00ef\u0015J\u0003\u00d2\u00a1nO\u0019\u00ebj\u0084\u00bdT\u00cb\u00cf\u00b6\u0011\u009b\u009b\u00a0{\u00bfX\u0083\u00d9\u00ec\u0003\u0082\u008a\u00e1\u0084\u00f9\u00a74\f\u00a7\u0092\u00c8|\u009a\u001f\u000e\u00d5s\u00a9|D\u00ae\u00c6\u00f1\u00ee\u0089\u001exso\u00ee+`\u00fd\u0013/\u0002\u0094\u00fdF\u00b2\u00d8\u008aN\u001bqT\u000e\u0094\u0090L\u00ed\u00f2\u00eaW".length();
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
                    var6_5 = "\u00fa|\t\u00cbG\u0092\"\u008caO\u00bd\u00fa|\u00d0\u00df\u00d2";
                    var7_6 = "\u00fa|\t\u00cbG\u0092\"\u008caO\u00bd\u00fa|\u00d0\u00df\u00d2".length();
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
        ReflectionProxyInvoker.c = var8_3;
        ReflectionProxyInvoker.d = new Integer[141];
        ReflectionProxyInvoker.j = new AtomicInteger(0);
        ReflectionProxyInvoker.Y = new LinkedHashMap<Method, Class<? extends SessionManagementInterface>>();
        ReflectionProxyInvoker.Q = new LinkedHashMap<Field, Class<? extends QueryExecutionStrategy>>();
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1957;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/ZX", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ReflectionProxyInvoker.d[n2] = n3;
        }
        return d[n2];
    }

    public static Class<? extends QueryExecutionStrategy> Z(Class<?> clazz, Field field) {
        CryptographicContextManager577 cryptographicContextManager577;
        MetadataExtractor metadataExtractor;
        String string;
        block27: {
            block34: {
                long l;
                block33: {
                    block32: {
                        block31: {
                            block30: {
                                block29: {
                                    block28: {
                                        block26: {
                                            int n;
                                            CryptographicContextManager577 cryptographicContextManager5772;
                                            l = b ^ 0x190379A8DB54L;
                                            Class<? extends QueryExecutionStrategy> clazz2 = Q.get(field);
                                            try {
                                                if (clazz2 != null) {
                                                    return clazz2;
                                                }
                                            }
                                            catch (Exception exception) {
                                                throw ReflectionProxyInvoker.a(exception);
                                            }
                                            ReflectionProxyInvoker.N();
                                            string = ReflectionProxyInvoker.T(clazz, field);
                                            metadataExtractor = new MetadataExtractor(3);
                                            metadataExtractor.u(52, 1, string.replace('.', '/'), null, zY.v(Object.class), new String[]{zY.v(SessionManagementInterface.class)});
                                            cryptographicContextManager577 = new CryptographicContextManager577(metadataExtractor.q(1, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)19687, (long)(0x6A89503DD6A3CE73L ^ l)), (long)2001323924997607865L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)9609, (long)(0x22BFAA43A776A74CL ^ l)), (long)2001323924997607865L, (long)l)), null, null), 1, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)25895, (long)(0x3E419E57A3CAE7FDL ^ l)), (long)2001323924997607865L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)5136, (long)(0x44DE83450D1016CEL ^ l)), (long)2001323924997607865L, (long)l)));
                                            cryptographicContextManager577.F();
                                            cryptographicContextManager577.M(183, zY.v(Object.class), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)10708, (long)(0x293C166D7FF2B7EL ^ l)), (long)2001323924997607865L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)30837, (long)(0x5CBE60E3A4F57AD5L ^ l)), (long)2001323924997607865L, (long)l)), false);
                                            cryptographicContextManager577.j();
                                            cryptographicContextManager577.g();
                                            cryptographicContextManager577 = new CryptographicContextManager577(metadataExtractor.q(1, O.getName(), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)8693, (long)(0x26F2E610EEF5A377L ^ l)), (long)2001323924997607865L, (long)l)), null, null), 1, O.getName(), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)24903, (long)(0x289EF797DD3E3C1L ^ l)), (long)2001323924997607865L, (long)l)));
                                            try {
                                                cryptographicContextManager577.v();
                                                cryptographicContextManager577.n(25, 1);
                                                cryptographicContextManager577.n(192, zY.v(clazz));
                                                cryptographicContextManager5772 = cryptographicContextManager577;
                                                n = Modifier.isStatic(field.getModifiers()) ? 178 : 180;
                                            }
                                            catch (Exception exception) {
                                                throw ReflectionProxyInvoker.a(exception);
                                            }
                                            try {
                                                cryptographicContextManager5772.A(n, zY.v(clazz), field.getName(), ContextualReflectionUtility.w(field.getType()));
                                                if (Boolean.TYPE != field.getType()) break block26;
                                                cryptographicContextManager577.M(184, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)16300, (long)(0x1849B3AF95933D36L ^ l)), (long)2001323924997607865L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)19141, (long)(0x3F2A31684DA3C81EL ^ l)), (long)2001323924997607865L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)13987, (long)(0x3B69831DC10C3461L ^ l)), (long)2001323924997607865L, (long)l)), false);
                                                break block27;
                                            }
                                            catch (Exception exception) {
                                                throw ReflectionProxyInvoker.a(exception);
                                            }
                                        }
                                        try {
                                            if (Byte.TYPE != field.getType()) break block28;
                                            cryptographicContextManager577.M(184, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)20219, (long)(0x13E15CAC6DA84C40L ^ l)), (long)2001323924997607865L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)19528, (long)(0x572310B27FC3CE89L ^ l)), (long)2001323924997607865L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)1592, (long)(0xC61C7B0C8004BBL ^ l)), (long)2001323924997607865L, (long)l)), false);
                                            break block27;
                                        }
                                        catch (Exception exception) {
                                            throw ReflectionProxyInvoker.a(exception);
                                        }
                                    }
                                    try {
                                        if (Character.TYPE != field.getType()) break block29;
                                        cryptographicContextManager577.M(184, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)30686, (long)(0x468B4930669AF577L ^ l)), (long)2001323924997607865L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)3060, (long)(0x679EB134ED3E8953L ^ l)), (long)2001323924997607865L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)19983, (long)(0x2E175BFF4644CCA1L ^ l)), (long)2001323924997607865L, (long)l)), false);
                                        break block27;
                                    }
                                    catch (Exception exception) {
                                        throw ReflectionProxyInvoker.a(exception);
                                    }
                                }
                                try {
                                    if (Short.TYPE != field.getType()) break block30;
                                    cryptographicContextManager577.M(184, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)2829, (long)(0x381519B441020996L ^ l)), (long)2001323924997607865L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)17940, (long)(0x736D3AC65258C494L ^ l)), (long)2001323924997607865L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)31248, (long)(0x3FBC2C20D0A67891L ^ l)), (long)2001323924997607865L, (long)l)), false);
                                    break block27;
                                }
                                catch (Exception exception) {
                                    throw ReflectionProxyInvoker.a(exception);
                                }
                            }
                            try {
                                if (Integer.TYPE != field.getType()) break block31;
                                cryptographicContextManager577.M(184, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)828, (long)(0x6F7A6FE3E28881B9L ^ l)), (long)2001323924997607865L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)24152, (long)(0x2F8374DE4A75CBFL ^ l)), (long)2001323924997607865L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)14809, (long)(0x6F2EB0B65F71BB0FL ^ l)), (long)2001323924997607865L, (long)l)), false);
                                break block27;
                            }
                            catch (Exception exception) {
                                throw ReflectionProxyInvoker.a(exception);
                            }
                        }
                        try {
                            if (Long.TYPE != field.getType()) break block32;
                            cryptographicContextManager577.M(184, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)14639, (long)(0x3AC2F72AFEA53BC5L ^ l)), (long)2001323924997607865L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)26048, (long)(0x311F9CE042BC6751L ^ l)), (long)2001323924997607865L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)25885, (long)(0x24FA4F20FA9FE7B0L ^ l)), (long)2001323924997607865L, (long)l)), false);
                            break block27;
                        }
                        catch (Exception exception) {
                            throw ReflectionProxyInvoker.a(exception);
                        }
                    }
                    try {
                        if (Float.TYPE != field.getType()) break block33;
                        cryptographicContextManager577.M(184, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)2705, (long)(0x67B529516F4F886CL ^ l)), (long)2001323924997607865L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)5355, (long)(0x1DAD1BFD5736163AL ^ l)), (long)2001323924997607865L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)8786, (long)(0x32D5ACEB50BB20E2L ^ l)), (long)2001323924997607865L, (long)l)), false);
                        break block27;
                    }
                    catch (Exception exception) {
                        throw ReflectionProxyInvoker.a(exception);
                    }
                }
                try {
                    if (Double.TYPE != field.getType()) break block34;
                    cryptographicContextManager577.M(184, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)1692, (long)(0x82AF515583C045FL ^ l)), (long)2001323924997607865L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)10769, (long)(0x361D2580B6B32896L ^ l)), (long)2001323924997607865L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)20913, (long)(0x4CF8C5AD90BB531EL ^ l)), (long)2001323924997607865L, (long)l)), false);
                    break block27;
                }
                catch (Exception exception) {
                    throw ReflectionProxyInvoker.a(exception);
                }
            }
            try {
                if (ContextualReflectionUtility.G(field.getType()) == null) {
                    cryptographicContextManager577.n(192, field.getType().getName());
                }
            }
            catch (Exception exception) {
                throw ReflectionProxyInvoker.a(exception);
            }
        }
        cryptographicContextManager577.T(176);
        cryptographicContextManager577.c(7, 3);
        cryptographicContextManager577.D();
        metadataExtractor.t();
        byte[] byArray = metadataExtractor.V();
        try {
            Class<?> clazz3 = StringObfuscationUtility.A.D(ReflectionProxyInvoker.class.getClassLoader(), string, byArray);
            Q.put(field, clazz3);
            return clazz3;
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ReflectionProxyInvoker.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ReflectionProxyInvoker.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(long l, long l2) {
        int n = ReflectionProxyInvoker.a(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = i[n];
                int n3 = string2.indexOf(8);
                clazz3 = ReflectionProxyInvoker.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ReflectionProxyInvoker.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ReflectionProxyInvoker.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ReflectionProxyInvoker.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ReflectionProxyInvoker.b(216854996435245L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ReflectionProxyInvoker.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ReflectionProxyInvoker.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ReflectionProxyInvoker.b(216854996435245L, 0L);
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

    private static String T(Class<?> clazz, Member member) {
        long l = b ^ 0x18010C48D2A5L;
        int n = j.incrementAndGet();
        return (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)14409, (long)(0xC77CEA7985B361L ^ l)), (long)1312553567308552264L, (long)l)) + n;
    }

    public static Class<? extends SessionManagementInterface> I(CryptoProtocolEngine cryptoProtocolEngine, HK hK) {
        return ReflectionProxyInvoker.F(cryptoProtocolEngine.H(), hK);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ReflectionProxyInvoker.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static void h(String string, byte[] byArray) {
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ReflectionProxyInvoker.a(l, l2);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                ReflectionProxyInvoker.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ea' || c == '$' || c == '\u00fa' || c == 'N') {
                field = ReflectionProxyInvoker.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ea' ? lookup.findGetter(clazz, string2, clazz2) : (c == '$' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00fa' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ReflectionProxyInvoker.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00cf' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'n' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = ReflectionProxyInvoker.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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

    public static Class<? extends SessionManagementInterface> g(Class<?> clazz, Method method) {
        Class<?> clazz2;
        CryptographicContextManager577 cryptographicContextManager577;
        MetadataExtractor metadataExtractor;
        String string;
        block56: {
            block58: {
                block65: {
                    long l;
                    block64: {
                        block63: {
                            block62: {
                                block61: {
                                    block60: {
                                        block59: {
                                            block57: {
                                                block55: {
                                                    int n;
                                                    CryptographicContextManager577 cryptographicContextManager5772;
                                                    block54: {
                                                        block53: {
                                                            l = b ^ 0x7268D11613C3L;
                                                            Class<? extends SessionManagementInterface> clazz3 = Y.get(method);
                                                            try {
                                                                if (clazz3 != null) {
                                                                    return clazz3;
                                                                }
                                                            }
                                                            catch (Exception exception) {
                                                                throw ReflectionProxyInvoker.a(exception);
                                                            }
                                                            ReflectionProxyInvoker.N();
                                                            string = ReflectionProxyInvoker.T(clazz, method);
                                                            metadataExtractor = new MetadataExtractor(3);
                                                            metadataExtractor.u(52, 1, string.replace('.', '/'), null, zY.v(Object.class), new String[]{zY.v(SessionManagementInterface.class)});
                                                            cryptographicContextManager577 = new CryptographicContextManager577(metadataExtractor.q(1, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)1008, (long)(0x35B9551504E8C9AEL ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)12408, (long)(0x7049CE56E463FA5CL ^ l)), (long)-3219709888816490194L, (long)l)), null, null), 1, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)478, (long)(0x4EC249E23F2CCBA9L ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)15314, (long)(0x24C1A8F1CD6D71E3L ^ l)), (long)-3219709888816490194L, (long)l)));
                                                            cryptographicContextManager577.F();
                                                            cryptographicContextManager577.M(183, zY.v(Object.class), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)10859, (long)(0x3F5E903738E4E0EEL ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)26816, (long)(0xD143CE9CBE622B6L ^ l)), (long)-3219709888816490194L, (long)l)), false);
                                                            cryptographicContextManager577.j();
                                                            cryptographicContextManager577.g();
                                                            cryptographicContextManager577 = new CryptographicContextManager577(metadataExtractor.q(1, g.getName(), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)12661, (long)(0x1AE71B3EF2E4FBFBL ^ l)), (long)-3219709888816490194L, (long)l)), null, null), 1, g.getName(), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)17010, (long)(0x1689686831A38877L ^ l)), (long)-3219709888816490194L, (long)l)));
                                                            cryptographicContextManager577.v();
                                                            cryptographicContextManager577.n(25, 1);
                                                            cryptographicContextManager577.n(192, zY.v(clazz));
                                                            for (int i = 0; i < method.getParameters().length; ++i) {
                                                                clazz2 = method.getParameterTypes()[i];
                                                                try {
                                                                    cryptographicContextManager577.n(25, 2);
                                                                    cryptographicContextManager577.F(16, i);
                                                                    cryptographicContextManager577.T(50);
                                                                    if (Boolean.TYPE == clazz2) {
                                                                        cryptographicContextManager577.n(192, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)2602, (long)(0x29788F5D025A4031L ^ l)), (long)-3219709888816490194L, (long)l)));
                                                                        cryptographicContextManager577.M(182, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)17539, (long)(0x6A8C984BE1458EA1L ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)14762, (long)(0x6365B3DAA1D8F3A1L ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)18087, (long)(0x3C1B941AEAF60CBAL ^ l)), (long)-3219709888816490194L, (long)l)), false);
                                                                        continue;
                                                                    }
                                                                }
                                                                catch (Exception exception) {
                                                                    throw ReflectionProxyInvoker.a(exception);
                                                                }
                                                                try {
                                                                    if (Byte.TYPE == clazz2) {
                                                                        cryptographicContextManager577.n(192, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)4543, (long)(0x3FC753902E105BB7L ^ l)), (long)-3219709888816490194L, (long)l)));
                                                                        cryptographicContextManager577.M(182, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)8293, (long)(0x897FD6D6B06EA1FL ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)3410, (long)(0x203C0200E8A847D0L ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)32453, (long)(0x1442CEEEC64B499L ^ l)), (long)-3219709888816490194L, (long)l)), false);
                                                                        continue;
                                                                    }
                                                                }
                                                                catch (Exception exception) {
                                                                    throw ReflectionProxyInvoker.a(exception);
                                                                }
                                                                try {
                                                                    if (Character.TYPE == clazz2) {
                                                                        cryptographicContextManager577.n(192, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)12028, (long)(0x67EDA6C08169E4FDL ^ l)), (long)-3219709888816490194L, (long)l)));
                                                                        cryptographicContextManager577.M(182, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)10467, (long)(0x70E134715CFFE2CBL ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)8236, (long)(0x620558BE80D6A13L ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)2932, (long)(0x2C5B3B995CD5412FL ^ l)), (long)-3219709888816490194L, (long)l)), false);
                                                                        continue;
                                                                    }
                                                                }
                                                                catch (Exception exception) {
                                                                    throw ReflectionProxyInvoker.a(exception);
                                                                }
                                                                try {
                                                                    if (Short.TYPE == clazz2) {
                                                                        cryptographicContextManager577.n(192, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)1194, (long)(0x1EC4FDFF8DBDCEF0L ^ l)), (long)-3219709888816490194L, (long)l)));
                                                                        cryptographicContextManager577.M(182, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)29386, (long)(0x3BA3FE20D5BBB8A8L ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)11105, (long)(0x377415402BF76132L ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)32422, (long)(0x9271EDFC209B427L ^ l)), (long)-3219709888816490194L, (long)l)), false);
                                                                        continue;
                                                                    }
                                                                }
                                                                catch (Exception exception) {
                                                                    throw ReflectionProxyInvoker.a(exception);
                                                                }
                                                                try {
                                                                    if (Integer.TYPE == clazz2) {
                                                                        cryptographicContextManager577.n(192, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)959, (long)(0x5C0E473FA03B498AL ^ l)), (long)-3219709888816490194L, (long)l)));
                                                                        cryptographicContextManager577.M(182, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)7033, (long)(0x6775AACEE45B5101L ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)1471, (long)(0x3EFB4E8625A6CF92L ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)14272, (long)(0x74C8E97C608FFD9DL ^ l)), (long)-3219709888816490194L, (long)l)), false);
                                                                        continue;
                                                                    }
                                                                }
                                                                catch (Exception exception) {
                                                                    throw ReflectionProxyInvoker.a(exception);
                                                                }
                                                                try {
                                                                    if (Long.TYPE == clazz2) {
                                                                        cryptographicContextManager577.n(192, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)27889, (long)(0x269B4E62E34B26DBL ^ l)), (long)-3219709888816490194L, (long)l)));
                                                                        cryptographicContextManager577.M(182, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)23040, (long)(0xAAC6CD9FED39043L ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)14565, (long)(0x572E2BC4A56B72DEL ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)13894, (long)(0x4E383F26AD2F7C34L ^ l)), (long)-3219709888816490194L, (long)l)), false);
                                                                        continue;
                                                                    }
                                                                }
                                                                catch (Exception exception) {
                                                                    throw ReflectionProxyInvoker.a(exception);
                                                                }
                                                                try {
                                                                    if (Float.TYPE == clazz2) {
                                                                        cryptographicContextManager577.n(192, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)27140, (long)(0x6216507D93122018L ^ l)), (long)-3219709888816490194L, (long)l)));
                                                                        cryptographicContextManager577.M(182, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)14558, (long)(0x1156C4926FE272DAL ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)1212, (long)(0x6E8225E1E0724E92L ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)32684, (long)(0x3AC5221DD627B5D9L ^ l)), (long)-3219709888816490194L, (long)l)), false);
                                                                        continue;
                                                                    }
                                                                }
                                                                catch (Exception exception) {
                                                                    throw ReflectionProxyInvoker.a(exception);
                                                                }
                                                                try {
                                                                    if (Double.TYPE == clazz2) {
                                                                        cryptographicContextManager577.n(192, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)27466, (long)(0x22CB8314CA68A16BL ^ l)), (long)-3219709888816490194L, (long)l)));
                                                                        cryptographicContextManager577.M(182, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)19863, (long)(0x183FACECC1A3078EL ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)5825, (long)(0x24727D025FFADCCEL ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)25011, (long)(0x1D30C0F03300AB9AL ^ l)), (long)-3219709888816490194L, (long)l)), false);
                                                                        continue;
                                                                    }
                                                                }
                                                                catch (Exception exception) {
                                                                    throw ReflectionProxyInvoker.a(exception);
                                                                }
                                                                cryptographicContextManager577.n(192, zY.v(clazz2));
                                                            }
                                                            try {
                                                                cryptographicContextManager5772 = cryptographicContextManager577;
                                                                if (!Modifier.isStatic(method.getModifiers())) break block53;
                                                                n = 184;
                                                                break block54;
                                                            }
                                                            catch (Exception exception) {
                                                                throw ReflectionProxyInvoker.a(exception);
                                                            }
                                                        }
                                                        try {
                                                            n = clazz.isInterface() ? 185 : 182;
                                                        }
                                                        catch (Exception exception) {
                                                            throw ReflectionProxyInvoker.a(exception);
                                                        }
                                                    }
                                                    try {
                                                        cryptographicContextManager5772.M(n, zY.v(clazz), method.getName(), ContextualReflectionUtility.R(method.getReturnType(), method.getParameterTypes()), clazz.isInterface());
                                                        if (method.getReturnType() != Void.TYPE) break block55;
                                                        cryptographicContextManager577.T(1);
                                                        cryptographicContextManager577.T(176);
                                                        break block56;
                                                    }
                                                    catch (Exception exception) {
                                                        throw ReflectionProxyInvoker.a(exception);
                                                    }
                                                }
                                                try {
                                                    if (Boolean.TYPE != method.getReturnType()) break block57;
                                                    cryptographicContextManager577.M(184, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)18311, (long)(0x5CCADF6BDE178DB1L ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)17956, (long)(0x13B3DD58025F8CA2L ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)19050, (long)(0x69FCB54612F08013L ^ l)), (long)-3219709888816490194L, (long)l)), false);
                                                    break block58;
                                                }
                                                catch (Exception exception) {
                                                    throw ReflectionProxyInvoker.a(exception);
                                                }
                                            }
                                            try {
                                                if (Byte.TYPE != method.getReturnType()) break block59;
                                                cryptographicContextManager577.M(184, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)15305, (long)(0x519068946ABE714DL ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)18276, (long)(0x6C4DE57FC28D8D0FL ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)25333, (long)(0x5D7FF2D91F2328EDL ^ l)), (long)-3219709888816490194L, (long)l)), false);
                                                break block58;
                                            }
                                            catch (Exception exception) {
                                                throw ReflectionProxyInvoker.a(exception);
                                            }
                                        }
                                        try {
                                            if (Character.TYPE != method.getReturnType()) break block60;
                                            cryptographicContextManager577.M(184, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)12369, (long)(0x5C39EAFFABE67A08L ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)29556, (long)(0x6C2F7B7ED7473913L ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)30832, (long)(0x64B9AFB98F5C32FBL ^ l)), (long)-3219709888816490194L, (long)l)), false);
                                            break block58;
                                        }
                                        catch (Exception exception) {
                                            throw ReflectionProxyInvoker.a(exception);
                                        }
                                    }
                                    try {
                                        if (Short.TYPE != method.getReturnType()) break block61;
                                        cryptographicContextManager577.M(184, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)13516, (long)(0x49C0E5A77B6BFE41L ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)3570, (long)(0xDCC5E7386D447B0L ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)13067, (long)(0x8E85D3BE9E2796FL ^ l)), (long)-3219709888816490194L, (long)l)), false);
                                        break block58;
                                    }
                                    catch (Exception exception) {
                                        throw ReflectionProxyInvoker.a(exception);
                                    }
                                }
                                try {
                                    if (Integer.TYPE != method.getReturnType()) break block62;
                                    cryptographicContextManager577.M(184, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)32731, (long)(0x7BF117398D8B5FDL ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)23938, (long)(0x6724238DFBC19788L ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)17035, (long)(0x2BC5759D622A0882L ^ l)), (long)-3219709888816490194L, (long)l)), false);
                                    break block58;
                                }
                                catch (Exception exception) {
                                    throw ReflectionProxyInvoker.a(exception);
                                }
                            }
                            try {
                                if (Long.TYPE != method.getReturnType()) break block63;
                                cryptographicContextManager577.M(184, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)21977, (long)(0x20BCB4A700791F96L ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)17782, (long)(0x7722DEA3BD848F65L ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)17610, (long)(0x2BB1C3A7607A8EABL ^ l)), (long)-3219709888816490194L, (long)l)), false);
                                break block58;
                            }
                            catch (Exception exception) {
                                throw ReflectionProxyInvoker.a(exception);
                            }
                        }
                        try {
                            if (Float.TYPE != method.getReturnType()) break block64;
                            cryptographicContextManager577.M(184, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)9853, (long)(0x2BFE2D17FBEBEC41L ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)28062, (long)(0xE22660F57F627F3L ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)2758, (long)(0x31FD4E5DAA5D404AL ^ l)), (long)-3219709888816490194L, (long)l)), false);
                            break block58;
                        }
                        catch (Exception exception) {
                            throw ReflectionProxyInvoker.a(exception);
                        }
                    }
                    try {
                        if (Double.TYPE != method.getReturnType()) break block65;
                        cryptographicContextManager577.M(184, (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)26191, (long)(0x7D2842A26518AC31L ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)13858, (long)(0x2E841FBDA176FCA2L ^ l)), (long)-3219709888816490194L, (long)l)), (String)((Object)ReflectionProxyInvoker.b("n", (int)ReflectionProxyInvoker.a("q", (int)28829, (long)(0x7B682373D0703AD6L ^ l)), (long)-3219709888816490194L, (long)l)), false);
                        break block58;
                    }
                    catch (Exception exception) {
                        throw ReflectionProxyInvoker.a(exception);
                    }
                }
                if (ContextualReflectionUtility.G(method.getReturnType()) == null) {
                    // empty if block
                }
            }
            cryptographicContextManager577.T(176);
        }
        cryptographicContextManager577.g();
        metadataExtractor.t();
        byte[] byArray = metadataExtractor.V();
        try {
            clazz2 = StringObfuscationUtility.A.D(ReflectionProxyInvoker.class.getClassLoader(), string, byArray);
            Y.put(method, clazz2);
            return clazz2;
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static Class<? extends SessionManagementInterface> F(Class clazz, HK hK) {
        try {
            if (hK.v()) {
                return null;
            }
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw ReflectionProxyInvoker.a(noSuchMethodException);
        }
        try {
            try {
                Method method = clazz.getMethod(hK.B(), hK.S());
                return ReflectionProxyInvoker.g(clazz, method);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                return null;
            }
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static Class<? extends QueryExecutionStrategy> G(CryptoProtocolEngine cryptoProtocolEngine, ReflectionUtilityService reflectionUtilityService) {
        try {
            if (reflectionUtilityService.T()) {
                return null;
            }
        }
        catch (Throwable throwable) {
            throw ReflectionProxyInvoker.a(throwable);
        }
        try {
            return ReflectionProxyInvoker.Z(cryptoProtocolEngine.H(), reflectionUtilityService.v());
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ReflectionProxyInvoker.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ReflectionProxyInvoker.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

