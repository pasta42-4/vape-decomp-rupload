/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.mediation;

import a.HK;
import a.N9;
import com.collections.management.MultiContainerRegistry;
import com.concurrency.management.ThreadPoolCoordinator;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.network.core.NetworkProtocolManager;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityService;
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

public class DynamicReferenceMediator
extends CryptoProtocolEngine {
    private static final Object[] e;
    private static final long[] b;
    private final HK C;
    private final HK K;
    private ReflectionUtilityService r;
    private final ReflectionUtilityService q;
    private static final String[] f;
    private static final Integer[] c;
    private ReflectionUtilityService J;
    private static final Map d;
    private static final long a;

    public DynamicReferenceMediator() {
        long l;
        block17: {
            String[] stringArray;
            block15: {
                block13: {
                    l = a ^ 0x4A9B4B7033B0L;
                    String[] stringArray2 = N9.I();
                    super(ReflectionMetadataResolver.YB);
                    stringArray = stringArray2;
                    try {
                        block14: {
                            try {
                                try {
                                    if (stringArray == null) break block13;
                                    if (GeometryCalculator.C() < 50) break block14;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DynamicReferenceMediator.a(customSystemException);
                                }
                                this.r = DynamicReferenceMediator.c("x", (Object)this, (Object)DynamicReferenceMediator.c("z", (int)DynamicReferenceMediator.b("m", (int)18010, (long)(0x234146BA3B41B1F8L ^ l)), (long)-216223013008602961L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rM, (long)-218239961059145218L, (long)l);
                                this.q = DynamicReferenceMediator.c("x", (Object)this, (Object)ReflectionMetadataResolver.Uy, (Object)DynamicReferenceMediator.c("z", (int)DynamicReferenceMediator.b("m", (int)12455, (long)(0x270F9E4CF3BE4702L ^ l)), (long)-216223013008602961L, (long)l), (boolean)true, String.class, (long)-216308852876611826L, (long)l);
                                this.K = DynamicReferenceMediator.c("x", (Object)this, (Object)ReflectionMetadataResolver.Vr, (Object)DynamicReferenceMediator.c("z", (int)DynamicReferenceMediator.b("m", (int)821, (long)(0x6A1051F6A9927494L ^ l)), (long)-216223013008602961L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.YB, (Object)new Class[]{ReflectionMetadataResolver.UQ}, (long)-218158699784603080L, (long)l);
                                if (stringArray != null) break block15;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DynamicReferenceMediator.a(customSystemException);
                            }
                        }
                        this.q = DynamicReferenceMediator.c("x", (Object)this, (Object)DynamicReferenceMediator.c("z", (int)DynamicReferenceMediator.b("m", (int)30449, (long)(0x22E961BE6EC90156L ^ l)), (long)-216223013008602961L, (long)l), (boolean)true, String.class, (long)-218239961059145218L, (long)l);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicReferenceMediator.a(customSystemException);
                    }
                }
                this.K = DynamicReferenceMediator.c("x", (Object)this, (Object)DynamicReferenceMediator.c("z", (int)DynamicReferenceMediator.b("m", (int)25227, (long)(0x5BB1A88B48591523L ^ l)), (long)-216223013008602961L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.YB, (Object)new Class[]{ReflectionMetadataResolver.UQ}, (long)-216423357552539729L, (long)l);
            }
            try {
                block16: {
                    try {
                        if (GeometryCalculator.C() < 35) break block16;
                        this.C = DynamicReferenceMediator.c("x", (Object)this, (Object)DynamicReferenceMediator.c("z", (int)DynamicReferenceMediator.b("m", (int)20378, (long)(0x1E79E2033475383EL ^ l)), (long)-216223013008602961L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.PE, (Object)new Class[0], (long)-218370295140186534L, (long)l);
                        if (stringArray != null) break block17;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicReferenceMediator.a(customSystemException);
                    }
                }
                this.C = DynamicReferenceMediator.c("x", (Object)this, (Object)DynamicReferenceMediator.c("z", (int)DynamicReferenceMediator.b("m", (int)19156, (long)(0x29E71C9A84C5BD72L ^ l)), (long)-216223013008602961L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.PE, (Object)new Class[0], (long)-218370295140186534L, (long)l);
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicReferenceMediator.a(customSystemException);
            }
        }
        try {
            if (GameVersionEnumerator.MC_1_21_4.Q()) {
                this.J = ((ThreadPoolCoordinator)((ThreadPoolCoordinator)((NetworkProtocolManager)((Object)DynamicReferenceMediator.c("x", (Object)this, (Object)DynamicReferenceMediator.c("z", (int)DynamicReferenceMediator.b("m", (int)8239, (long)(0x1A8F24E09F55578CL ^ l)), (long)-216223013008602961L, (long)l), (Object)ReflectionMetadataResolver.YB, (long)-216314301191914640L, (long)l))).L(true)).e(GameVersionEnumerator.MC_1_16_5.R(), (String)((Object)DynamicReferenceMediator.c("z", (int)DynamicReferenceMediator.b("m", (int)11732, (long)(0x4653296905EF5A74L ^ l)), (long)-216223013008602961L, (long)l)))).p();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicReferenceMediator.a(customSystemException);
        }
    }

    private String Q(Object object) {
        return (String)this.q.Z(object);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = DynamicReferenceMediator.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DynamicReferenceMediator.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
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

    static Object X(DynamicReferenceMediator dynamicReferenceMediator, Object object, Object object2) {
        return dynamicReferenceMediator.x(object, object2);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 's' || c == '\u00a5' || c == '\u00e7' || c == 'Y') {
                field = DynamicReferenceMediator.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 's' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00a5' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e7' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DynamicReferenceMediator.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'x' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'z' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private Object x(Object object, Object object2) {
        return this.K.T(object, object2);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DynamicReferenceMediator.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                DynamicReferenceMediator.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DynamicReferenceMediator.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DynamicReferenceMediator.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Pu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l, long l2) {
        int n = DynamicReferenceMediator.e(l, l2);
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
                clazz3 = DynamicReferenceMediator.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DynamicReferenceMediator.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DynamicReferenceMediator.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        DynamicReferenceMediator.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DynamicReferenceMediator.f(857329923014646L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DynamicReferenceMediator.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DynamicReferenceMediator.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DynamicReferenceMediator.f(857329923014646L, 0L);
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

    private static int e(long l, long l2) {
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
                n3 = 32;
                break;
            }
            case 1: {
                n3 = 57;
                break;
            }
            case 2: {
                n3 = 17;
                break;
            }
            case 3: {
                n3 = 35;
                break;
            }
            case 4: {
                n3 = 60;
                break;
            }
            case 5: {
                n3 = 51;
                break;
            }
            case 6: {
                n3 = 39;
                break;
            }
            case 7: {
                n3 = 46;
                break;
            }
            case 8: {
                n3 = 38;
                break;
            }
            case 9: {
                n3 = 4;
                break;
            }
            case 10: {
                n3 = 40;
                break;
            }
            case 11: {
                n3 = 49;
                break;
            }
            case 12: {
                n3 = 26;
                break;
            }
            case 13: {
                n3 = 24;
                break;
            }
            case 14: {
                n3 = 34;
                break;
            }
            case 15: {
                n3 = 61;
                break;
            }
            case 16: {
                n3 = 45;
                break;
            }
            case 17: {
                n3 = 9;
                break;
            }
            case 18: {
                n3 = 50;
                break;
            }
            case 19: {
                n3 = 18;
                break;
            }
            case 20: {
                n3 = 42;
                break;
            }
            case 21: {
                n3 = 62;
                break;
            }
            case 22: {
                n3 = 53;
                break;
            }
            case 23: {
                n3 = 63;
                break;
            }
            case 24: {
                n3 = 23;
                break;
            }
            case 25: {
                n3 = 30;
                break;
            }
            case 26: {
                n3 = 6;
                break;
            }
            case 27: {
                n3 = 13;
                break;
            }
            case 28: {
                n3 = 28;
                break;
            }
            case 29: {
                n3 = 7;
                break;
            }
            case 30: {
                n3 = 15;
                break;
            }
            case 31: {
                n3 = 10;
                break;
            }
            case 32: {
                n3 = 37;
                break;
            }
            case 33: {
                n3 = 1;
                break;
            }
            case 34: {
                n3 = 12;
                break;
            }
            case 35: {
                n3 = 47;
                break;
            }
            case 36: {
                n3 = 2;
                break;
            }
            case 37: {
                n3 = 20;
                break;
            }
            case 38: {
                n3 = 8;
                break;
            }
            case 39: {
                n3 = 44;
                break;
            }
            case 40: {
                n3 = 59;
                break;
            }
            case 41: {
                n3 = 19;
                break;
            }
            case 42: {
                n3 = 55;
                break;
            }
            case 43: {
                n3 = 14;
                break;
            }
            case 44: {
                n3 = 43;
                break;
            }
            case 45: {
                n3 = 29;
                break;
            }
            case 46: {
                n3 = 41;
                break;
            }
            case 47: {
                n3 = 3;
                break;
            }
            case 48: {
                n3 = 25;
                break;
            }
            case 49: {
                n3 = 31;
                break;
            }
            case 50: {
                n3 = 54;
                break;
            }
            case 51: {
                n3 = 52;
                break;
            }
            case 52: {
                n3 = 22;
                break;
            }
            case 53: {
                n3 = 27;
                break;
            }
            case 54: {
                n3 = 21;
                break;
            }
            case 55: {
                n3 = 58;
                break;
            }
            case 56: {
                n3 = 56;
                break;
            }
            case 57: {
                n3 = 36;
                break;
            }
            case 58: {
                n3 = 16;
                break;
            }
            case 59: {
                n3 = 11;
                break;
            }
            case 60: {
                n3 = 48;
                break;
            }
            case 61: {
                n3 = 0;
                break;
            }
            case 62: {
                n3 = 33;
                break;
            }
            default: {
                n3 = 5;
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
        DynamicReferenceMediator.f[n4] = new String(cArray);
        return n4;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xB5B;
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
                throw new RuntimeException("a/Pu", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DynamicReferenceMediator.c[n2] = n3;
        }
        return c[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DynamicReferenceMediator.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private Object w(Object object) {
        return this.r.Z(object);
    }

    private Object V(Object object) {
        return this.C.T(object, new Object[0]);
    }

    static Object K(DynamicReferenceMediator dynamicReferenceMediator) {
        return dynamicReferenceMediator.E();
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\nVA}";
        objectArray[1] = "\u0000\u0004uTk\u0011\u000b\u000bd\u001b\u0016\t\u0018\fmR";
        objectArray[2] = Boolean.TYPE;
        DynamicReferenceMediator.f[2] = "java/lang/Boolean";
        objectArray[3] = "9h[\u000fxA2gJ@\u0015A2z^";
        objectArray[4] = "~\u001aCmq1\u000b:Hb`~f:H\u007ftk";
        objectArray[5] = "t]\r[";
        objectArray[6] = "/Kt\u0012]<Zk\u007f\u001dLs7k\u007f\u0000Xf";
        objectArray[7] = "N\u000fD";
        objectArray[8] = Integer.TYPE;
        DynamicReferenceMediator.f[8] = "java/lang/Integer";
        objectArray[9] = "\u001eI!\u0012";
        objectArray[10] = "GF\u0007o";
        objectArray[11] = "M[W\u0015\u001eS8{\\\u001a\u000f\u001cU{\\\u0007\u001b\t";
        objectArray[12] = "\fX-\u001e@\t\u0007W<Q!\u0007\f\\8\u000b";
        objectArray[13] = "Y+u\r'|\u0003+e4\u0011\u0002D,n]m=T0m4l8P.h[o9P/\u0007\u000eh8P$}Q0kPB7\rjlS!c\u000b.s:~?\f(nC~}H;\u0002";
        objectArray[14] = "v)\u0001*+~,)\u0011\u0013\u0017\u0000/~Iy<zp&\u001ayZ~{)\u001a(eng*s)`jy/\u001c*ajx@I-`js:\u0016u3j\u0015pJ/4iv$Lk+\u0000)xKm6y):\u000f~Z";
        objectArray[15] = "tlsK\u0013s.lcr9\rikh\u001bY2ywkrX7}in\u001d[6}h\u0001H\\7}c{\u0017\u0004d}\u0005?\u0016Rve\u007f?\u0017\u001cb\u0017";
        objectArray[16] = "1k$X',kk4a\u000eR,l?\bmm<p<allhh0\u001b34;hV^g96lf\u0011h+b\u0002";
        objectArray[17] = "$M\u0010K\u001d4~M\u0000r1J9J\u000b\u001bWu)V\brVp-H\r\u001dUq-IbHRp-B\u0018\u0017\n#-$RKP$.G\u0006M\u0014;G\u0018ZJ\u0012&>\u0018\u0018\u000e\u0001J";
        objectArray[18] = "6R\n\u0002\"[{\u0013\u0007\tKLpcQ\u00020\u0019r\u0019\u000e\u0011'\u001d\u000b\u001d\u0002\t\"\u001c4\r\u001e\nK";
        Object[] objectArray2 = objectArray;
        objectArray[19] = "!9Ffu,{9V_URxn\u000e5b('6]5\u0004,,9]d;<0:4e>8.?[f?8/P\u000ea>8$*Q9m8BnPo\u007f 8nQ!kR";
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DynamicReferenceMediator.a = MultiContainerRegistry.a(-7877841599058114530L, 8519298407543394427L, MethodHandles.lookup().lookupClass()).a(24523295127559L);
                DynamicReferenceMediator.e = new Object[20];
                DynamicReferenceMediator.f = new String[20];
                DynamicReferenceMediator.a();
                DynamicReferenceMediator.d = new HashMap<K, V>(13);
                var0 = DynamicReferenceMediator.a ^ 23394097613048L;
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
                var6_5 = "\u00ae{\rceU\u0004\u00db\u00837X\u008e\u0084}\u00cc/\u00fe\u00ae\u0080\u00fa\u00f0\u007f\u001fG\u00e4\u0010\u00a1\u00fd\u00a4\u00ba\u00ba\u001f\u009b\u00da\u008c'\u00db\u00b5\u00ec\u001a\\m\u0000\u0097\u0086\u00c5\u00e75O\u00e8:\u00e6Mu\u00abM";
                var7_6 = "\u00ae{\rceU\u0004\u00db\u00837X\u008e\u0084}\u00cc/\u00fe\u00ae\u0080\u00fa\u00f0\u007f\u001fG\u00e4\u0010\u00a1\u00fd\u00a4\u00ba\u00ba\u001f\u009b\u00da\u008c'\u00db\u00b5\u00ec\u001a\\m\u0000\u0097\u0086\u00c5\u00e75O\u00e8:\u00e6Mu\u00abM".length();
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
                    var6_5 = "\u00f1A2\u00e5\u00e4\u00e6-\u00a38\u00ffh:+\u00da\u0092\u00f4";
                    var7_6 = "\u00f1A2\u00e5\u00e4\u00e6-\u00a38\u00ffh:+\u00da\u0092\u00f4".length();
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
        DynamicReferenceMediator.b = var8_3;
        DynamicReferenceMediator.c = new Integer[9];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DynamicReferenceMediator.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Pu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field g(long l, long l2) {
        int n = DynamicReferenceMediator.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = DynamicReferenceMediator.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DynamicReferenceMediator.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DynamicReferenceMediator.c(clazz3, string2, clazz2)) != null) {
                    DynamicReferenceMediator.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DynamicReferenceMediator.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DynamicReferenceMediator.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DynamicReferenceMediator.f(857329923014646L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private Object E() {
        return this.J.Z(null);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DynamicReferenceMediator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(DynamicReferenceMediator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

