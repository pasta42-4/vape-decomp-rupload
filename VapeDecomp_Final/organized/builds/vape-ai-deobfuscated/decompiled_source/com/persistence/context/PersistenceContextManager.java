/*
 * Decompiled with CFR 0.152.
 */
package com.persistence.context;

import a.HK;
import a.N9;
import com.collections.management.MultiContainerRegistry;
import com.concurrency.management.ThreadPoolCoordinator;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.network.core.NetworkProtocolManager;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.reflection.util.ContextualReflectionUtility;
import com.runtime.reflection.ReflectionUtilityService;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.temporal.metadata.TemporalMetadataResolver;
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

public class PersistenceContextManager
extends CryptoProtocolEngine {
    public ReflectionUtilityService P;
    private final ReflectionUtilityService y;
    public ReflectionUtilityService p;
    public ReflectionUtilityService i;
    public ReflectionUtilityService q;
    public HK f;
    private static final String[] m;
    private static final long a;
    private final ReflectionUtilityService k;
    private final ReflectionUtilityService A;
    public ReflectionUtilityService J;
    private static final Integer[] e;
    public ReflectionUtilityService M;
    public HK K;
    private static final long[] d;
    private static final Object[] h;
    public ReflectionUtilityService c;
    public HK j;
    private final ReflectionUtilityService V;
    public ReflectionUtilityService U;
    public HK X;
    public ReflectionUtilityService u;
    private final ReflectionUtilityService Z;
    private static final Map g;
    private final ReflectionUtilityService t;
    public HK b;

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = PersistenceContextManager.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public Object[] V() {
        return this.P.t(null);
    }

    public Object x(Object object) {
        try {
            if (this.U != null) {
                return this.U.Z(object).toString();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PersistenceContextManager.a(customSystemException);
        }
        return this.j.T(object, new Object[0]);
    }

    private static Field g(long l, long l2) {
        int n = PersistenceContextManager.e(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = PersistenceContextManager.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = PersistenceContextManager.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = PersistenceContextManager.c(clazz3, string2, clazz2)) != null) {
                    PersistenceContextManager.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = PersistenceContextManager.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        PersistenceContextManager.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = PersistenceContextManager.f(839721676525477L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method h(long l, long l2) {
        int n = PersistenceContextManager.e(l, l2);
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
                String string2 = m[n];
                int n3 = string2.indexOf(8);
                clazz3 = PersistenceContextManager.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = PersistenceContextManager.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = PersistenceContextManager.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        PersistenceContextManager.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = PersistenceContextManager.f(839721676525477L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = PersistenceContextManager.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        PersistenceContextManager.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = PersistenceContextManager.f(839721676525477L, 0L);
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

    static ReflectionUtilityService O(PersistenceContextManager persistenceContextManager) {
        return persistenceContextManager.Z;
    }

    static ReflectionUtilityService Q(PersistenceContextManager persistenceContextManager) {
        return persistenceContextManager.y;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = PersistenceContextManager.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public int T(Object object) {
        return this.M.R(object);
    }

    static ReflectionUtilityService Z(PersistenceContextManager persistenceContextManager) {
        return persistenceContextManager.t;
    }

    static ReflectionUtilityService h(PersistenceContextManager persistenceContextManager) {
        return persistenceContextManager.k;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n4] != null) {
            return n4;
        }
        Object object = h[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 52;
                break;
            }
            case 1: {
                n3 = 25;
                break;
            }
            case 2: {
                n3 = 32;
                break;
            }
            case 3: {
                n3 = 19;
                break;
            }
            case 4: {
                n3 = 27;
                break;
            }
            case 5: {
                n3 = 0;
                break;
            }
            case 6: {
                n3 = 30;
                break;
            }
            case 7: {
                n3 = 53;
                break;
            }
            case 8: {
                n3 = 62;
                break;
            }
            case 9: {
                n3 = 18;
                break;
            }
            case 10: {
                n3 = 9;
                break;
            }
            case 11: {
                n3 = 15;
                break;
            }
            case 12: {
                n3 = 2;
                break;
            }
            case 13: {
                n3 = 13;
                break;
            }
            case 14: {
                n3 = 31;
                break;
            }
            case 15: {
                n3 = 24;
                break;
            }
            case 16: {
                n3 = 36;
                break;
            }
            case 17: {
                n3 = 6;
                break;
            }
            case 18: {
                n3 = 29;
                break;
            }
            case 19: {
                n3 = 55;
                break;
            }
            case 20: {
                n3 = 39;
                break;
            }
            case 21: {
                n3 = 21;
                break;
            }
            case 22: {
                n3 = 61;
                break;
            }
            case 23: {
                n3 = 57;
                break;
            }
            case 24: {
                n3 = 38;
                break;
            }
            case 25: {
                n3 = 51;
                break;
            }
            case 26: {
                n3 = 40;
                break;
            }
            case 27: {
                n3 = 3;
                break;
            }
            case 28: {
                n3 = 10;
                break;
            }
            case 29: {
                n3 = 23;
                break;
            }
            case 30: {
                n3 = 43;
                break;
            }
            case 31: {
                n3 = 42;
                break;
            }
            case 32: {
                n3 = 28;
                break;
            }
            case 33: {
                n3 = 33;
                break;
            }
            case 34: {
                n3 = 44;
                break;
            }
            case 35: {
                n3 = 58;
                break;
            }
            case 36: {
                n3 = 14;
                break;
            }
            case 37: {
                n3 = 49;
                break;
            }
            case 38: {
                n3 = 16;
                break;
            }
            case 39: {
                n3 = 35;
                break;
            }
            case 40: {
                n3 = 12;
                break;
            }
            case 41: {
                n3 = 5;
                break;
            }
            case 42: {
                n3 = 4;
                break;
            }
            case 43: {
                n3 = 37;
                break;
            }
            case 44: {
                n3 = 8;
                break;
            }
            case 45: {
                n3 = 34;
                break;
            }
            case 46: {
                n3 = 22;
                break;
            }
            case 47: {
                n3 = 7;
                break;
            }
            case 48: {
                n3 = 45;
                break;
            }
            case 49: {
                n3 = 50;
                break;
            }
            case 50: {
                n3 = 20;
                break;
            }
            case 51: {
                n3 = 1;
                break;
            }
            case 52: {
                n3 = 46;
                break;
            }
            case 53: {
                n3 = 60;
                break;
            }
            case 54: {
                n3 = 56;
                break;
            }
            case 55: {
                n3 = 17;
                break;
            }
            case 56: {
                n3 = 48;
                break;
            }
            case 57: {
                n3 = 41;
                break;
            }
            case 58: {
                n3 = 59;
                break;
            }
            case 59: {
                n3 = 47;
                break;
            }
            case 60: {
                n3 = 26;
                break;
            }
            case 61: {
                n3 = 11;
                break;
            }
            case 62: {
                n3 = 54;
                break;
            }
            default: {
                n3 = 63;
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
        PersistenceContextManager.m[n4] = new String(cArray);
        return n4;
    }

    public Object[] m() {
        return this.c.t(null);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/P8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = PersistenceContextManager.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = PersistenceContextManager.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public PersistenceContextManager() {
        block18: {
            long l;
            block19: {
                block22: {
                    Object object;
                    block20: {
                        PersistenceContextManager persistenceContextManager;
                        int n;
                        String[] stringArray;
                        block16: {
                            l = a ^ 0x2AF5586F3F90L;
                            String[] stringArray2 = N9.I();
                            super(ReflectionMetadataResolver.Pb);
                            stringArray = stringArray2;
                            try {
                                try {
                                    block17: {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        n = GeometryCalculator.C();
                                                        if (stringArray == null) break block16;
                                                        if (n <= 13) break block17;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw PersistenceContextManager.a(customSystemException);
                                                    }
                                                    this.j = PersistenceContextManager.c("\u00c7", (Object)this, (Object)PersistenceContextManager.c("\u00d6", (int)PersistenceContextManager.b("z", (int)26162, (long)(0x766CF7277C342A34L ^ l)), (long)-5925778282015295457L, (long)l), (boolean)true, String.class, (Object)new Class[0], (long)-5925547657119281486L, (long)l);
                                                    this.b = PersistenceContextManager.c("\u00c7", (Object)this, (Object)PersistenceContextManager.c("\u00d6", (int)PersistenceContextManager.b("z", (int)20613, (long)(0x4445BD6CFD961C89L ^ l)), (long)-5925778282015295457L, (long)l), (boolean)false, ContextualReflectionUtility.S(ReflectionMetadataResolver.Pb), (Object)new Class[0], (long)-5925867657096975397L, (long)l);
                                                    this.i = PersistenceContextManager.c("\u00c7", (Object)this, (Object)PersistenceContextManager.c("\u00d6", (int)PersistenceContextManager.b("z", (int)20644, (long)(0x1A7EB54E4EF01CAEL ^ l)), (long)-5925778282015295457L, (long)l), (boolean)true, Integer.TYPE, (long)-5925526283197663464L, (long)l);
                                                    this.f = PersistenceContextManager.c("\u00c7", (Object)this, (Object)PersistenceContextManager.c("\u00d6", (int)PersistenceContextManager.b("z", (int)17741, (long)(0x7AAB7915581B8951L ^ l)), (long)-5925778282015295457L, (long)l), (boolean)false, Integer.TYPE, (Object)new Class[0], (long)-5925547657119281486L, (long)l);
                                                    this.K = PersistenceContextManager.c("\u00c7", (Object)this, (Object)PersistenceContextManager.c("\u00d6", (int)PersistenceContextManager.b("z", (int)20323, (long)(0x3D717644B519036BL ^ l)), (long)-5925778282015295457L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.H, (Object)new Class[0], (long)-5925547657119281486L, (long)l);
                                                    this.X = PersistenceContextManager.c("\u00c7", (Object)this, (Object)PersistenceContextManager.c("\u00d6", (int)PersistenceContextManager.b("z", (int)31655, (long)(0x65970265B03D37B9L ^ l)), (long)-5925778282015295457L, (long)l), (boolean)true, Integer.TYPE, (Object)new Class[0], (long)-5925547657119281486L, (long)l);
                                                    if (stringArray == null) break block18;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw PersistenceContextManager.a(customSystemException);
                                                }
                                                if (GeometryCalculator.C() >= GeometryCalculator.C) break block19;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw PersistenceContextManager.a(customSystemException);
                                            }
                                            this.P = PersistenceContextManager.c("\u00c7", (Object)this, (Object)PersistenceContextManager.c("\u00d6", (int)PersistenceContextManager.b("z", (int)31223, (long)(0x4737C30384E535EEL ^ l)), (long)-5925778282015295457L, (long)l), (boolean)true, ContextualReflectionUtility.S(ReflectionMetadataResolver.Pb), (long)-5925334355483341400L, (long)l);
                                            if (stringArray != null) break block19;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw PersistenceContextManager.a(customSystemException);
                                        }
                                    }
                                    persistenceContextManager = this;
                                    object = PersistenceContextManager.c("\u00c7", (Object)this, Enum.class, (Object)PersistenceContextManager.c("\u00d6", (int)PersistenceContextManager.b("z", (int)5709, (long)(0x7B1EB62182D3DA4AL ^ l)), (long)-5925778282015295457L, (long)l), (boolean)true, String.class, (long)-5925710894595533942L, (long)l);
                                    if (stringArray == null) break block20;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw PersistenceContextManager.a(customSystemException);
                                }
                                persistenceContextManager.U = object;
                                n = TemporalMetadataResolver.h.d() ? 1 : 0;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw PersistenceContextManager.a(customSystemException);
                            }
                        }
                        try {
                            block21: {
                                try {
                                    if (n == 0) break block21;
                                    this.c = ((ThreadPoolCoordinator)((NetworkProtocolManager)((Object)PersistenceContextManager.c("\u00c7", (Object)this, (Object)PersistenceContextManager.c("\u00d6", (int)PersistenceContextManager.b("z", (int)1406, (long)(0x2BFEA3D27554C97AL ^ l)), (long)-5925778282015295457L, (long)l), (Object)ReflectionMetadataResolver.Pb, (long)-5925408756458656697L, (long)l))).L(true)).q(1).p();
                                    if (stringArray != null) break block22;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw PersistenceContextManager.a(customSystemException);
                                }
                            }
                            persistenceContextManager = this;
                            object = ((ThreadPoolCoordinator)((ThreadPoolCoordinator)((NetworkProtocolManager)((Object)PersistenceContextManager.c("\u00c7", (Object)this, (Object)PersistenceContextManager.c("\u00d6", (int)PersistenceContextManager.b("z", (int)24126, (long)(0xFAB0642F5D6923BL ^ l)), (long)-5925778282015295457L, (long)l), (Object)ReflectionMetadataResolver.Pb, (long)-5925408756458656697L, (long)l))).L(true)).g(ObjectLifecycleTracker.z)).q(1).p();
                        }
                        catch (CustomSystemException customSystemException) {
                            throw PersistenceContextManager.a(customSystemException);
                        }
                    }
                    persistenceContextManager.c = object;
                }
                this.M = PersistenceContextManager.c("\u00c7", (Object)this, (Object)PersistenceContextManager.c("\u00d6", (int)PersistenceContextManager.b("z", (int)18877, (long)(0xA2BD8CFE3B505B4L ^ l)), (long)-5925778282015295457L, (long)l), (boolean)true, Integer.TYPE, (long)-5925526283197663464L, (long)l);
                this.J = PersistenceContextManager.c("\u00c7", (Object)this, (Object)PersistenceContextManager.c("\u00d6", (int)PersistenceContextManager.b("z", (int)28502, (long)(0x7E88E7244428A349L ^ l)), (long)-5925778282015295457L, (long)l), (boolean)true, Integer.TYPE, (long)-5925526283197663464L, (long)l);
                this.p = PersistenceContextManager.c("\u00c7", (Object)this, (Object)PersistenceContextManager.c("\u00d6", (int)PersistenceContextManager.b("z", (int)23048, (long)(0x662F5D6C8418160BL ^ l)), (long)-5925778282015295457L, (long)l), (boolean)true, Integer.TYPE, (long)-5925526283197663464L, (long)l);
                this.q = PersistenceContextManager.c("\u00c7", (Object)this, (Object)PersistenceContextManager.c("\u00d6", (int)PersistenceContextManager.b("z", (int)15348, (long)(0x1AA194B99C2F7FFL ^ l)), (long)-5925778282015295457L, (long)l), (boolean)true, Integer.TYPE, (long)-5925526283197663464L, (long)l);
                this.u = PersistenceContextManager.c("\u00c7", (Object)this, (Object)PersistenceContextManager.c("\u00d6", (int)PersistenceContextManager.b("z", (int)27176, (long)(0x22915836E5142628L ^ l)), (long)-5925778282015295457L, (long)l), (boolean)true, Integer.TYPE, (long)-5925526283197663464L, (long)l);
            }
            this.Z = PersistenceContextManager.c("\u00c7", (Object)this, (Object)PersistenceContextManager.c("\u00d6", (int)PersistenceContextManager.b("z", (int)20609, (long)(0x69A4004F1B341C83L ^ l)), (long)-5925778282015295457L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.Pb, (long)-5925334355483341400L, (long)l);
            this.A = PersistenceContextManager.c("\u00c7", (Object)this, (Object)PersistenceContextManager.c("\u00d6", (int)PersistenceContextManager.b("z", (int)12633, (long)(0x4616B5A0613DFD56L ^ l)), (long)-5925778282015295457L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.Pb, (long)-5925334355483341400L, (long)l);
            this.t = PersistenceContextManager.c("\u00c7", (Object)this, (Object)PersistenceContextManager.c("\u00d6", (int)PersistenceContextManager.b("z", (int)755, (long)(0x476BB3CC6FF64EF2L ^ l)), (long)-5925778282015295457L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.Pb, (long)-5925334355483341400L, (long)l);
            this.y = PersistenceContextManager.c("\u00c7", (Object)this, (Object)PersistenceContextManager.c("\u00d6", (int)PersistenceContextManager.b("z", (int)24054, (long)(0xF69634A677911EBL ^ l)), (long)-5925778282015295457L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.Pb, (long)-5925334355483341400L, (long)l);
            this.k = PersistenceContextManager.c("\u00c7", (Object)this, (Object)PersistenceContextManager.c("\u00d6", (int)PersistenceContextManager.b("z", (int)32340, (long)(0x1364C3ED08AB3259L ^ l)), (long)-5925778282015295457L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.Pb, (long)-5925334355483341400L, (long)l);
            this.V = PersistenceContextManager.c("\u00c7", (Object)this, (Object)PersistenceContextManager.c("\u00d6", (int)PersistenceContextManager.b("z", (int)18768, (long)(0x67EA0A329FA7055EL ^ l)), (long)-5925778282015295457L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.Pb, (long)-5925334355483341400L, (long)l);
        }
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x61CA;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/P8", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            PersistenceContextManager.e[n2] = n3;
        }
        return e[n2];
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = PersistenceContextManager.e(l, l2);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                PersistenceContextManager.h[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/P8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    public int E(Object object) {
        return this.i.R(object);
    }

    public int Q(Object object) {
        return this.u.R(object);
    }

    public Object[] r() {
        return this.b.t(null, new Object[0]);
    }

    public Object q(Object object) {
        return this.K.T(object, new Object[0]);
    }

    public int a(Object object) {
        return this.p.R(object);
    }

    static ReflectionUtilityService N(PersistenceContextManager persistenceContextManager) {
        return persistenceContextManager.A;
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "\u0006\u0019\u0014%";
        objectArray[1] = "5\u0003\"iJD>\f3&7\\-\u000b:o";
        objectArray[2] = Boolean.TYPE;
        PersistenceContextManager.m[2] = "java/lang/Boolean";
        objectArray[3] = "^D{%L\u0015UKjj!\u0015UV~";
        objectArray[4] = "\b=t#$n}\u001d\u007f,5!\u0010\u001d\u007f1!4";
        objectArray[5] = "}6Os";
        objectArray[6] = "V}\u001f";
        objectArray[7] = Integer.TYPE;
        PersistenceContextManager.m[7] = "java/lang/Integer";
        objectArray[8] = "Zf4l";
        objectArray[9] = "g>,2";
        objectArray[10] = "H%\t<N(=\u0005\u00023_gP\u0005\u0002.Kr";
        objectArray[11] = "+8=^G\u0003 7,\u0011&\r+<(K";
        objectArray[12] = "3\u000bhtw$8\u0011>\u0019]InL3v$w:\u0012|$\u001ap8\u001dar{5.\u0019?\u0019  f\u0012uyb-kK\u000e&!p&\u00115~c7ht5gb4%D>curW";
        objectArray[13] = "\u001afeR{-\u0011|3?M@G!>P(~\u0013\u007fq\u0002\u0016y\u0011plTw<\u0007t2?,)O\u007fx_n$B&\u0003\u0002mz\u001f\"xRt \u0005\u0019";
        objectArray[14] = "~9D(\u0002\u0001u#\u0012E7l#~\u001f*QRw PxoVswD>\u000f\u0014~z\u001dEQ\u0003\u007f,F\"\u0002\u000ft:\"";
        objectArray[15] = "Jg wv'A}v\u001aVJ\u0017 {u%tC~4'\u001bsAq)qz6Wuw\u001a!#\u001f~=zc.\u0012'F'`pO#=wy*U\u0018";
        objectArray[16] = "\u000fJ-^\u0018h\u0004P{3(\u0005R\rv\\K;\u0006S9\u000eu<\u0004\\$X\u0014y\u0012Xz3OlZS0S\raW\nK\fN<\u001aPpT\f{T5pM\rx\u0019\u0005{I\u001a>k";
        objectArray[17] = "0)zbnA1))*\fRw\u0019.|tTp{xp1S\f +/c\u00072tu`19";
        Object[] objectArray2 = objectArray;
        objectArray[18] = "1\u000fv\u0018<O:\u0015 u\u0000\"o\u0019!\u0013*B-\u0014,JQ\u001bmM\u007fKoO3\u0002-uhM<\u001f{\u0014-[8A\u0010O8\u00133\u000bp\r5\u001ejp-\u000ekCn\u000b}\u00171YU";
    }

    public int V(Object object) {
        return this.J.R(object);
    }

    static ReflectionUtilityService Y(PersistenceContextManager persistenceContextManager) {
        return persistenceContextManager.V;
    }

    public int R(Object object) {
        return this.f.R(object, new Object[0]);
    }

    public int J(Object object) {
        return this.q.R(object);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                PersistenceContextManager.a = MultiContainerRegistry.a(6126929321159287680L, -7542902058823527811L, MethodHandles.lookup().lookupClass()).a(203614264596820L);
                PersistenceContextManager.h = new Object[19];
                PersistenceContextManager.m = new String[19];
                PersistenceContextManager.a();
                PersistenceContextManager.g = new HashMap<K, V>(13);
                var0 = PersistenceContextManager.a ^ 74947922452438L;
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
                var8_3 = new long[21];
                var5_4 = 0;
                var6_5 = "\u00a8\u0098\u00cf\u008e\u008c\u00af\u00b3\u0097\u00e5H\u0006\u0006\u00b5\u00ce\u001c\u008b\u00c1\u00cc\u00fb\u00f2\u00b9\u009b\u00a5Z\u00fc\u00ba\u00ca:\u00f8\u00b9^h\u00bc\u00fa\u0010\u00a8\u00e9\u0083\u0086`\u00a7_jE*\u00ec\u009ao\u0099\u00ef\u00c22\u00d9\u0088HP\u00cb=\u00bc \u00d0u\u0011\u00b4\u00979\u00f0\u00fa\u00fb\u0011\u00b0$\u00ab\u00c4\u000e\u00bb\u00d9\u001f\u001b\u000e;\u0015\u0091C\u00cbf{\u009b\u0014\u0081\u00ef\u00e5\u008fWu\u009f\u00e3{5B\u00aa\u0088\u00b8\u00c5\u00aa\u00c6\u0087L\u00e5\u00e9@\u00f4_,U\u00b3\u000b\u00a5\u00dc/\u0088&\u00aa\u0087O\u0014F8\u0082\u0013c_\u008ej\u00cb\u00f6\t\\\u00ff)\u00c1\u0007([P\u00f6\u00c7E\u0085J\u00c5\u00ed";
                var7_6 = "\u00a8\u0098\u00cf\u008e\u008c\u00af\u00b3\u0097\u00e5H\u0006\u0006\u00b5\u00ce\u001c\u008b\u00c1\u00cc\u00fb\u00f2\u00b9\u009b\u00a5Z\u00fc\u00ba\u00ca:\u00f8\u00b9^h\u00bc\u00fa\u0010\u00a8\u00e9\u0083\u0086`\u00a7_jE*\u00ec\u009ao\u0099\u00ef\u00c22\u00d9\u0088HP\u00cb=\u00bc \u00d0u\u0011\u00b4\u00979\u00f0\u00fa\u00fb\u0011\u00b0$\u00ab\u00c4\u000e\u00bb\u00d9\u001f\u001b\u000e;\u0015\u0091C\u00cbf{\u009b\u0014\u0081\u00ef\u00e5\u008fWu\u009f\u00e3{5B\u00aa\u0088\u00b8\u00c5\u00aa\u00c6\u0087L\u00e5\u00e9@\u00f4_,U\u00b3\u000b\u00a5\u00dc/\u0088&\u00aa\u0087O\u0014F8\u0082\u0013c_\u008ej\u00cb\u00f6\t\\\u00ff)\u00c1\u0007([P\u00f6\u00c7E\u0085J\u00c5\u00ed".length();
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
                    var6_5 = "\u00eb\u00acbR\u00c0\u009aJ}\u008cyG\u000f\u00fc\u00b2\u00ee\u00d4";
                    var7_6 = "\u00eb\u00acbR\u00c0\u009aJ}\u008cyG\u000f\u00fc\u00b2\u00ee\u00d4".length();
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
        PersistenceContextManager.d = var8_3;
        PersistenceContextManager.e = new Integer[21];
    }

    public int u(Object object) {
        return this.X.R(object, new Object[0]);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = PersistenceContextManager.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = PersistenceContextManager.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'y' || c == '\u00eb' || c == '\u00d5' || c == 's') {
                field = PersistenceContextManager.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'y' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00eb' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = PersistenceContextManager.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c7' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(PersistenceContextManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(PersistenceContextManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

