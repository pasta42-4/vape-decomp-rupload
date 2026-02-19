/*
 * Decompiled with CFR 0.152.
 */
package com.mapping.resolution;

import a.qy;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.event.management.EventDispatchCoordinator1883;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class DynamicMappingResolver
extends CryptoProtocolEngine {
    private final ReflectionUtilityService B;
    private static final Map e;
    private final ReflectionUtilityService K;
    private final ReflectionUtilityService v;
    private static final Object[] f;
    private static final long[] c;
    private final ReflectionUtilityService S;
    private final ReflectionUtilityService R;
    private final ReflectionUtilityService h;
    private ReflectionUtilityService E;
    private final ReflectionUtilityService b;
    private final ReflectionUtilityService p;
    private ReflectionUtilityService V;
    private ReflectionUtilityService z;
    private static final long a;
    private final ReflectionUtilityService k;
    private final ReflectionUtilityService i;
    private final ReflectionUtilityService P;
    private final ReflectionUtilityService w;
    private final ReflectionUtilityService C;
    private final ReflectionUtilityService U;
    private final ReflectionUtilityService H;
    private final ReflectionUtilityService L;
    private final ReflectionUtilityService Y;
    private ReflectionUtilityService T;
    private static final String[] g;
    private final ReflectionUtilityService m;
    private ReflectionUtilityService r;
    private final ReflectionUtilityService s;
    private static final Integer[] d;
    private final ReflectionUtilityService u;

    static Object n(DynamicMappingResolver dynamicMappingResolver, Object object) {
        return dynamicMappingResolver.F(object);
    }

    private Object b(Object object) {
        return this.s.Z(object);
    }

    private float M(Object object) {
        return this.r.x(object);
    }

    static int G(DynamicMappingResolver dynamicMappingResolver, Object object) {
        return dynamicMappingResolver.R(object);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DynamicMappingResolver.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int e(long l, long l2) {
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
                n3 = 17;
                break;
            }
            case 1: {
                n3 = 13;
                break;
            }
            case 2: {
                n3 = 61;
                break;
            }
            case 3: {
                n3 = 41;
                break;
            }
            case 4: {
                n3 = 43;
                break;
            }
            case 5: {
                n3 = 28;
                break;
            }
            case 6: {
                n3 = 32;
                break;
            }
            case 7: {
                n3 = 47;
                break;
            }
            case 8: {
                n3 = 15;
                break;
            }
            case 9: {
                n3 = 11;
                break;
            }
            case 10: {
                n3 = 10;
                break;
            }
            case 11: {
                n3 = 23;
                break;
            }
            case 12: {
                n3 = 38;
                break;
            }
            case 13: {
                n3 = 9;
                break;
            }
            case 14: {
                n3 = 54;
                break;
            }
            case 15: {
                n3 = 62;
                break;
            }
            case 16: {
                n3 = 24;
                break;
            }
            case 17: {
                n3 = 42;
                break;
            }
            case 18: {
                n3 = 46;
                break;
            }
            case 19: {
                n3 = 12;
                break;
            }
            case 20: {
                n3 = 4;
                break;
            }
            case 21: {
                n3 = 2;
                break;
            }
            case 22: {
                n3 = 6;
                break;
            }
            case 23: {
                n3 = 39;
                break;
            }
            case 24: {
                n3 = 30;
                break;
            }
            case 25: {
                n3 = 19;
                break;
            }
            case 26: {
                n3 = 45;
                break;
            }
            case 27: {
                n3 = 57;
                break;
            }
            case 28: {
                n3 = 31;
                break;
            }
            case 29: {
                n3 = 22;
                break;
            }
            case 30: {
                n3 = 36;
                break;
            }
            case 31: {
                n3 = 51;
                break;
            }
            case 32: {
                n3 = 0;
                break;
            }
            case 33: {
                n3 = 3;
                break;
            }
            case 34: {
                n3 = 63;
                break;
            }
            case 35: {
                n3 = 55;
                break;
            }
            case 36: {
                n3 = 37;
                break;
            }
            case 37: {
                n3 = 7;
                break;
            }
            case 38: {
                n3 = 60;
                break;
            }
            case 39: {
                n3 = 20;
                break;
            }
            case 40: {
                n3 = 53;
                break;
            }
            case 41: {
                n3 = 16;
                break;
            }
            case 42: {
                n3 = 18;
                break;
            }
            case 43: {
                n3 = 50;
                break;
            }
            case 44: {
                n3 = 8;
                break;
            }
            case 45: {
                n3 = 59;
                break;
            }
            case 46: {
                n3 = 48;
                break;
            }
            case 47: {
                n3 = 56;
                break;
            }
            case 48: {
                n3 = 35;
                break;
            }
            case 49: {
                n3 = 29;
                break;
            }
            case 50: {
                n3 = 1;
                break;
            }
            case 51: {
                n3 = 21;
                break;
            }
            case 52: {
                n3 = 58;
                break;
            }
            case 53: {
                n3 = 26;
                break;
            }
            case 54: {
                n3 = 14;
                break;
            }
            case 55: {
                n3 = 34;
                break;
            }
            case 56: {
                n3 = 44;
                break;
            }
            case 57: {
                n3 = 33;
                break;
            }
            case 58: {
                n3 = 49;
                break;
            }
            case 59: {
                n3 = 25;
                break;
            }
            case 60: {
                n3 = 52;
                break;
            }
            case 61: {
                n3 = 40;
                break;
            }
            case 62: {
                n3 = 5;
                break;
            }
            default: {
                n3 = 27;
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
        DynamicMappingResolver.g[n4] = new String(cArray);
        return n4;
    }

    static Object f(DynamicMappingResolver dynamicMappingResolver, Object object) {
        return dynamicMappingResolver.s(object);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'o' || c == '\u00e9' || c == '\u00ff' || c == '\u00a3') {
                field = DynamicMappingResolver.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'o' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e9' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ff' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DynamicMappingResolver.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fb' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    static int T(DynamicMappingResolver dynamicMappingResolver, Object object) {
        return dynamicMappingResolver.A(object);
    }

    private int d(Object object) {
        return this.w.R(object);
    }

    static void W(DynamicMappingResolver dynamicMappingResolver, Object object, float f) {
        dynamicMappingResolver.y(object, f);
    }

    private boolean A(Object object) {
        return this.b.R(object);
    }

    private boolean q(Object object) {
        return this.Y.R(object);
    }

    private float w(Object object) {
        if (GameVersionEnumerator.MC_1_20_6.H()) {
            EventDispatchCoordinator1883 eventDispatchCoordinator1883 = new EventDispatchCoordinator1883(this.v.Z(object));
            Integer n = (Integer)eventDispatchCoordinator1883.C();
            return n.intValue();
        }
        try {
            if (GeometryCalculator.C() >= 35) {
                return (float)this.v.C(object);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicMappingResolver.a(customSystemException);
        }
        return this.v.x(object);
    }

    static void t(DynamicMappingResolver dynamicMappingResolver, Object object, float f) {
        dynamicMappingResolver.b(object, f);
    }

    private void y(Object object, float f) {
        if (GameVersionEnumerator.MC_1_20_6.H()) {
            EventDispatchCoordinator1883 eventDispatchCoordinator1883 = new EventDispatchCoordinator1883(this.v.Z(object));
            eventDispatchCoordinator1883.z(Float.valueOf(f));
            return;
        }
        try {
            if (GeometryCalculator.C() >= 35) {
                this.v.A(object, f);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicMappingResolver.a(customSystemException);
        }
        this.v.H(object, f);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = DynamicMappingResolver.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DynamicMappingResolver.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "\u001e\u0015R|";
        objectArray[1] = "4PV\u0010Z^?_G_'F,XN\u0016";
        objectArray[2] = Boolean.TYPE;
        DynamicMappingResolver.g[2] = "java/lang/Boolean";
        objectArray[3] = "?Y.`\u0018\"4V?/u\"4K+";
        objectArray[4] = ">>0C";
        objectArray[5] = "4B,";
        objectArray[6] = Integer.TYPE;
        DynamicMappingResolver.g[6] = "java/lang/Integer";
        objectArray[7] = "ptp;U\u0005{{at4\u000bppe.";
        objectArray[8] = " Xi\u0019Spu\u0016\u001b}/y.Wy\u0018B b\u0002\"&\u0015x$XtZM rP\u001b\u001c\u001f<'\u0019d\u0019\u0010\" i \u0019\u0014#/\u000b`\u001aU'\u001f";
        objectArray[9] = "\u001fx~Hx:J6\f*\u00043\u0011wnIij]\"5w>2\u001bxc\u000bfjMp\fM<1\u0011&p\u0015dg\u0019I6Gx2P63Hf5 r3Lg:B20\rc\n";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "YD:wK8\u0006\u0012\" $#\u001e|{,T%\u0001\u0017;v\u001fteEvyFv\b\u001c:,\u001dH";
    }

    private float b(Object object) {
        try {
            if (GeometryCalculator.C() >= 35) {
                return (float)this.L.C(object);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicMappingResolver.a(customSystemException);
        }
        return this.L.x(object);
    }

    private Object y(Object object) {
        return this.p.Z(object);
    }

    static Object T(DynamicMappingResolver dynamicMappingResolver, Object object) {
        return dynamicMappingResolver.n(object);
    }

    private static Field g(long l, long l2) {
        int n = DynamicMappingResolver.e(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = DynamicMappingResolver.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DynamicMappingResolver.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DynamicMappingResolver.c(clazz3, string2, clazz2)) != null) {
                    DynamicMappingResolver.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DynamicMappingResolver.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DynamicMappingResolver.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DynamicMappingResolver.f(555226016235630L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
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

    private Object N(Object object) {
        return this.L.Z(object);
    }

    private Object o(Object object) {
        return this.i.Z(object);
    }

    static int U(DynamicMappingResolver dynamicMappingResolver, Object object) {
        return dynamicMappingResolver.d(object);
    }

    public DynamicMappingResolver() {
        block19: {
            long l;
            block17: {
                AbstractComputationKernel[] abstractComputationKernelArray;
                block16: {
                    CallSite callSite;
                    block14: {
                        DynamicMappingResolver dynamicMappingResolver;
                        block15: {
                            l = a ^ 0x46C3334FCD97L;
                            super(ReflectionMetadataResolver.Us);
                            this.B = DynamicMappingResolver.c("\u00fb", (Object)this, (Object)DynamicMappingResolver.c("\u00d8", (int)DynamicMappingResolver.b("e", (int)22888, (long)(0x366871FFBDD6787FL ^ l)), (long)1135624013618336144L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.R, (long)1135511764050241457L, (long)l);
                            this.P = DynamicMappingResolver.c("\u00fb", (Object)this, (Object)DynamicMappingResolver.c("\u00d8", (int)DynamicMappingResolver.b("e", (int)16355, (long)(0x79CA7AC6A8639EE6L ^ l)), (long)1135624013618336144L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.R, (long)1135511764050241457L, (long)l);
                            this.w = DynamicMappingResolver.c("\u00fb", (Object)this, (Object)DynamicMappingResolver.c("\u00d8", (int)DynamicMappingResolver.b("e", (int)22358, (long)(0x165E183ECE387654L ^ l)), (long)1135624013618336144L, (long)l), (boolean)true, Integer.TYPE, (long)1135511764050241457L, (long)l);
                            this.U = DynamicMappingResolver.c("\u00fb", (Object)this, (Object)DynamicMappingResolver.c("\u00d8", (int)DynamicMappingResolver.b("e", (int)7116, (long)(0x50139E2D6954BACFL ^ l)), (long)1135624013618336144L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.R, (long)1135511764050241457L, (long)l);
                            this.Y = DynamicMappingResolver.c("\u00fb", (Object)this, (Object)DynamicMappingResolver.c("\u00d8", (int)DynamicMappingResolver.b("e", (int)8951, (long)(0x540BAF8876F103F9L ^ l)), (long)1135624013618336144L, (long)l), (boolean)true, Boolean.TYPE, (long)1135511764050241457L, (long)l);
                            abstractComputationKernelArray = qy.A();
                            try {
                                try {
                                    try {
                                        try {
                                            this.H = DynamicMappingResolver.c("\u00fb", (Object)this, (Object)DynamicMappingResolver.c("\u00d8", (int)DynamicMappingResolver.b("e", (int)24138, (long)(0x59CE80B35BA7FF46L ^ l)), (long)1135624013618336144L, (long)l), (boolean)false, (boolean)true, Boolean.TYPE, (long)1135563725110284405L, (long)l);
                                            this.s = DynamicMappingResolver.c("\u00fb", (Object)this, (Object)DynamicMappingResolver.c("\u00d8", (int)DynamicMappingResolver.b("e", (int)28107, (long)(0x27E72FA79F6BCCCFL ^ l)), (long)1135624013618336144L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.R, (long)1135511764050241457L, (long)l);
                                            this.R = DynamicMappingResolver.c("\u00fb", (Object)this, (Object)DynamicMappingResolver.c("\u00d8", (int)DynamicMappingResolver.b("e", (int)1768, (long)(0x2757D680C1A5A7E1L ^ l)), (long)1135624013618336144L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.R, (long)1135511764050241457L, (long)l);
                                            this.h = DynamicMappingResolver.c("\u00fb", (Object)this, (Object)DynamicMappingResolver.c("\u00d8", (int)DynamicMappingResolver.b("e", (int)3767, (long)(0x6F4A7FBC45242FA6L ^ l)), (long)1135624013618336144L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.R, (long)1135511764050241457L, (long)l);
                                            this.i = DynamicMappingResolver.c("\u00fb", (Object)this, (Object)DynamicMappingResolver.c("\u00d8", (int)DynamicMappingResolver.b("e", (int)8668, (long)(0x7AC72D98874280C5L ^ l)), (long)1135624013618336144L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.R, (long)1135511764050241457L, (long)l);
                                            this.K = DynamicMappingResolver.c("\u00fb", (Object)this, (Object)DynamicMappingResolver.c("\u00d8", (int)DynamicMappingResolver.b("e", (int)2122, (long)(0x3C8EE08D277E2952L ^ l)), (long)1135624013618336144L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.R, (long)1135511764050241457L, (long)l);
                                            dynamicMappingResolver = this;
                                            callSite = DynamicMappingResolver.c("\u00fb", (Object)this, (Object)DynamicMappingResolver.c("\u00d8", (int)DynamicMappingResolver.b("e", (int)22657, (long)(0x5F8A99E100D97980L ^ l)), (long)1135624013618336144L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.R, (long)1135511764050241457L, (long)l);
                                            if (abstractComputationKernelArray == null) break block14;
                                            dynamicMappingResolver.C = callSite;
                                            if (GeometryCalculator.C() != 13) break block15;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw DynamicMappingResolver.a(customSystemException);
                                        }
                                        if (TemporalMetadataResolver.h.d()) break block15;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw DynamicMappingResolver.a(customSystemException);
                                    }
                                    this.k = DynamicMappingResolver.c("\u00fb", (Object)this, (Object)DynamicMappingResolver.c("\u00d8", (int)DynamicMappingResolver.b("e", (int)14218, (long)(0xCD13AD02ADC9687L ^ l)), (long)1135624013618336144L, (long)l), (boolean)ObjectLifecycleTracker.z, (Object)ReflectionMetadataResolver.R, (long)1135511764050241457L, (long)l);
                                    if (abstractComputationKernelArray != null) break block16;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DynamicMappingResolver.a(customSystemException);
                                }
                                AbstractComputationKernel.I(new String[5]);
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DynamicMappingResolver.a(customSystemException);
                            }
                        }
                        dynamicMappingResolver = this;
                        callSite = DynamicMappingResolver.c("\u00fb", (Object)this, (Object)DynamicMappingResolver.c("\u00d8", (int)DynamicMappingResolver.b("e", (int)14287, (long)(0x1B1156E5387B16CFL ^ l)), (long)1135624013618336144L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.R, (long)1135511764050241457L, (long)l);
                    }
                    dynamicMappingResolver.k = callSite;
                }
                try {
                    block18: {
                        try {
                            try {
                                this.S = DynamicMappingResolver.c("\u00fb", (Object)this, (Object)DynamicMappingResolver.c("\u00d8", (int)DynamicMappingResolver.b("e", (int)32122, (long)(0x7ACEDEDCBC7FDC71L ^ l)), (long)1135624013618336144L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.R, (long)1135511764050241457L, (long)l);
                                this.p = DynamicMappingResolver.c("\u00fb", (Object)this, (Object)DynamicMappingResolver.c("\u00d8", (int)DynamicMappingResolver.b("e", (int)27599, (long)(0x72433C31AB44CAC0L ^ l)), (long)1135624013618336144L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.R, (long)1135511764050241457L, (long)l);
                                this.m = DynamicMappingResolver.c("\u00fb", (Object)this, (Object)DynamicMappingResolver.c("\u00d8", (int)DynamicMappingResolver.b("e", (int)4595, (long)(0x73064DC5362630EDL ^ l)), (long)1135624013618336144L, (long)l), (boolean)true, Boolean.TYPE, (long)1135511764050241457L, (long)l);
                                this.T = DynamicMappingResolver.c("\u00fb", (Object)this, (Object)DynamicMappingResolver.c("\u00d8", (int)DynamicMappingResolver.b("e", (int)6588, (long)(0x78A60CC339438A3L ^ l)), (long)1135624013618336144L, (long)l), (boolean)true, Integer.TYPE, (long)1135511764050241457L, (long)l);
                                this.b = DynamicMappingResolver.c("\u00fb", (Object)this, (Object)DynamicMappingResolver.c("\u00d8", (int)DynamicMappingResolver.b("e", (int)18986, (long)(0x64D240132874EB36L ^ l)), (long)1135624013618336144L, (long)l), (boolean)true, Boolean.TYPE, (long)1135511764050241457L, (long)l);
                                if (abstractComputationKernelArray == null) break block17;
                                if (GeometryCalculator.C() < 35) break block18;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DynamicMappingResolver.a(customSystemException);
                            }
                            this.u = DynamicMappingResolver.c("\u00fb", (Object)this, (Object)DynamicMappingResolver.c("\u00d8", (int)DynamicMappingResolver.b("e", (int)29034, (long)(0x6C9DE5786EC1D079L ^ l)), (long)1135624013618336144L, (long)l), (boolean)true, Double.TYPE, (long)1135511764050241457L, (long)l);
                            this.z = DynamicMappingResolver.c("\u00fb", (Object)this, (Object)DynamicMappingResolver.c("\u00d8", (int)DynamicMappingResolver.b("e", (int)23508, (long)(0x36A2127F2183FAC4L ^ l)), (long)1135624013618336144L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.Fu, (long)1135511764050241457L, (long)l);
                            this.L = DynamicMappingResolver.c("\u00fb", (Object)this, (Object)DynamicMappingResolver.c("\u00d8", (int)DynamicMappingResolver.b("e", (int)20464, (long)(0x4CF9D128FF096EF6L ^ l)), (long)1135624013618336144L, (long)l), (boolean)true, Double.TYPE, (long)1135511764050241457L, (long)l);
                            this.v = DynamicMappingResolver.c("\u00fb", (Object)this, (Object)DynamicMappingResolver.c("\u00d8", (int)DynamicMappingResolver.b("e", (int)4744, (long)(0x372E36CD381A3393L ^ l)), (long)1135624013618336144L, (long)l), (boolean)true, Double.TYPE, (long)1135511764050241457L, (long)l);
                            this.r = DynamicMappingResolver.c("\u00fb", (Object)this, (Object)DynamicMappingResolver.c("\u00d8", (int)DynamicMappingResolver.b("e", (int)12534, (long)(0x62E23A571F7F91E4L ^ l)), (long)1135624013618336144L, (long)l), (boolean)true, Float.TYPE, (long)1135511764050241457L, (long)l);
                            if (abstractComputationKernelArray != null) break block19;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DynamicMappingResolver.a(customSystemException);
                        }
                    }
                    this.E = DynamicMappingResolver.c("\u00fb", (Object)this, (Object)DynamicMappingResolver.c("\u00d8", (int)DynamicMappingResolver.b("e", (int)13130, (long)(0x5BB6DA2738F39240L ^ l)), (long)1135624013618336144L, (long)l), (boolean)true, Boolean.TYPE, (long)1135511764050241457L, (long)l);
                    this.u = DynamicMappingResolver.c("\u00fb", (Object)this, (Object)DynamicMappingResolver.c("\u00d8", (int)DynamicMappingResolver.b("e", (int)10539, (long)(0x5E2937DC445D0823L ^ l)), (long)1135624013618336144L, (long)l), (boolean)true, Float.TYPE, (long)1135511764050241457L, (long)l);
                    this.V = DynamicMappingResolver.c("\u00fb", (Object)this, (Object)DynamicMappingResolver.c("\u00d8", (int)DynamicMappingResolver.b("e", (int)28122, (long)(0x18446A67AC1CCCC0L ^ l)), (long)1135624013618336144L, (long)l), (boolean)true, Integer.TYPE, (long)1135511764050241457L, (long)l);
                    this.L = DynamicMappingResolver.c("\u00fb", (Object)this, (Object)DynamicMappingResolver.c("\u00d8", (int)DynamicMappingResolver.b("e", (int)2475, (long)(0x73EB40DA5B3BA8ACL ^ l)), (long)1135624013618336144L, (long)l), (boolean)true, Float.TYPE, (long)1135511764050241457L, (long)l);
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicMappingResolver.a(customSystemException);
                }
            }
            this.v = DynamicMappingResolver.c("\u00fb", (Object)this, (Object)DynamicMappingResolver.c("\u00d8", (int)DynamicMappingResolver.b("e", (int)22216, (long)(0x449862810F3CF7D5L ^ l)), (long)1135624013618336144L, (long)l), (boolean)true, Float.TYPE, (long)1135511764050241457L, (long)l);
        }
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DynamicMappingResolver.e(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                DynamicMappingResolver.f[n] = clazz = Class.forName(g[n]);
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qN" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void b(Object object, float f) {
        try {
            if (GeometryCalculator.C() >= 35) {
                this.u.A(object, f);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicMappingResolver.a(customSystemException);
        }
        this.u.H(object, f);
    }

    private boolean p(Object object) {
        return this.E.R(object);
    }

    static Object M(DynamicMappingResolver dynamicMappingResolver, Object object) {
        return dynamicMappingResolver.G(object);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private void Q(Object object, int n) {
        this.V.t(object, n);
    }

    private Object n(Object object) {
        return this.u.Z(object);
    }

    private void S(Object object, boolean bl) {
        this.m.B(object, bl);
    }

    private Object A(Object object) {
        return this.K.Z(object);
    }

    private boolean F(Object object) {
        try {
            if (this.H.T()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicMappingResolver.a(customSystemException);
        }
        return this.H.R(object);
    }

    static Object j(DynamicMappingResolver dynamicMappingResolver, Object object) {
        return dynamicMappingResolver.v(object);
    }

    private Object G(Object object) {
        return this.w.Z(object);
    }

    private boolean x(Object object) {
        return this.m.R(object);
    }

    private void r(Object object, boolean bl) {
        this.Y.B(object, bl);
    }

    private void X(Object object, boolean bl) {
        this.b.B(object, bl);
    }

    static void b(DynamicMappingResolver dynamicMappingResolver, Object object, int n) {
        dynamicMappingResolver.Q(object, n);
    }

    private void d(Object object, Object object2) {
        this.z.L(object, object2);
    }

    private Object t(Object object) {
        return this.z.Z(object);
    }

    static boolean E(DynamicMappingResolver dynamicMappingResolver, Object object) {
        return dynamicMappingResolver.q(object);
    }

    static Object Q(DynamicMappingResolver dynamicMappingResolver, Object object) {
        return dynamicMappingResolver.k(object);
    }

    static Object W(DynamicMappingResolver dynamicMappingResolver, Object object) {
        return dynamicMappingResolver.A(object);
    }

    static Object k(DynamicMappingResolver dynamicMappingResolver, Object object) {
        return dynamicMappingResolver.N(object);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    static float Z(DynamicMappingResolver dynamicMappingResolver, Object object) {
        return dynamicMappingResolver.M(object);
    }

    private void u(Object object, boolean bl) {
        try {
            if (this.H.T()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicMappingResolver.a(customSystemException);
        }
        this.H.B(object, bl);
    }

    static void Z(DynamicMappingResolver dynamicMappingResolver, Object object, boolean bl) {
        dynamicMappingResolver.S(object, bl);
    }

    private Object F(Object object) {
        return this.S.Z(object);
    }

    static Object o(DynamicMappingResolver dynamicMappingResolver, Object object) {
        return dynamicMappingResolver.K(object);
    }

    static Object K(DynamicMappingResolver dynamicMappingResolver, Object object) {
        return dynamicMappingResolver.H(object);
    }

    private int A(Object object) {
        return this.V.R(object);
    }

    private Object I(Object object) {
        return this.Y.Z(object);
    }

    static float O(DynamicMappingResolver dynamicMappingResolver, Object object) {
        return dynamicMappingResolver.w(object);
    }

    private void p(Object object, int n) {
        this.w.t(object, n);
    }

    private Object r(Object object) {
        return this.C.Z(object);
    }

    private Object O(Object object) {
        return this.B.Z(object);
    }

    private int R(Object object) {
        return this.T.R(object);
    }

    static Object U(DynamicMappingResolver dynamicMappingResolver, Object object) {
        return dynamicMappingResolver.t(object);
    }

    static Object L(DynamicMappingResolver dynamicMappingResolver, Object object) {
        return dynamicMappingResolver.o(object);
    }

    private static Method h(long l, long l2) {
        int n = DynamicMappingResolver.e(l, l2);
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
                clazz3 = DynamicMappingResolver.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DynamicMappingResolver.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DynamicMappingResolver.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        DynamicMappingResolver.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DynamicMappingResolver.f(555226016235630L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DynamicMappingResolver.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DynamicMappingResolver.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DynamicMappingResolver.f(555226016235630L, 0L);
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

    private Object v(Object object) {
        return this.P.Z(object);
    }

    static void U(DynamicMappingResolver dynamicMappingResolver, Object object, boolean bl) {
        dynamicMappingResolver.X(object, bl);
    }

    static float u(DynamicMappingResolver dynamicMappingResolver, Object object) {
        return dynamicMappingResolver.n(object);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DynamicMappingResolver.a = MultiContainerRegistry.a(-7776957264681697084L, 4696776948664032439L, MethodHandles.lookup().lookupClass()).a(20071237382188L);
                DynamicMappingResolver.f = new Object[11];
                DynamicMappingResolver.g = new String[11];
                DynamicMappingResolver.a();
                DynamicMappingResolver.e = new HashMap<K, V>(13);
                var0 = DynamicMappingResolver.a ^ 26649210173442L;
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
                var8_3 = new long[29];
                var5_4 = 0;
                var6_5 = "FGJ\u00a8\u00acXxJ+ O\u00a6\u0014\\\u00c8\n\u00cc\u00e5\u00f15\u00ce0\u00bd\u00c3\u00ccA\u00ca\u001f\u00db\u008e\u00ffF\u00cdU\u0005\u00b2\u0013\u00bd)*\u00a1W6\u0004i\u0099bi\u00bf\u00bb\u0010PjJ~-\u00efs\u00ee\u00f4\f\u00a0l\u00eb;\u00d4/\u00a6;S\u00e7#\u00cf\u00b9%\f\u008c\u00f1\u00a8cm\u00b8.\u0085\u00c6\u00c3\u00bco4\u00e8:\u0080n\u00d0sN\u00e5\u00a5\u00c4\u0007^v\u0094\u009e.t\u00ce\u00d7Z\u00a3\u009a\u009b2\u0014\u00fc\u00d9is\u007f\u00efw}\u00d3$\u00e3\u00d2\u00f5\u00a6:\u00daX\u0083\u00f64'\u0081\u0081\u001d\u00cbt\u001e)\u0003p\u00b7\u00bdNI\u0093u\u00bb\u00ce:~\b\u008e\u00fa\u001f*oM\u00b6)h\u001b\u008f\\,\u00e0\u00e9\u0019\u00b0\u008d\u0007jx\u00f3Y1\u00eb\u0084\u009e\u00dasm\u00ac\u00bd>\u0007)1v\u00b33e\u0086\u0000\u00f5\u0006\u008eT\u00e2\u0006\u00e1\u0097}7=d\u00f5\u00ae\u00b8\u0016\u00d7\u00ff\u00ec";
                var7_6 = "FGJ\u00a8\u00acXxJ+ O\u00a6\u0014\\\u00c8\n\u00cc\u00e5\u00f15\u00ce0\u00bd\u00c3\u00ccA\u00ca\u001f\u00db\u008e\u00ffF\u00cdU\u0005\u00b2\u0013\u00bd)*\u00a1W6\u0004i\u0099bi\u00bf\u00bb\u0010PjJ~-\u00efs\u00ee\u00f4\f\u00a0l\u00eb;\u00d4/\u00a6;S\u00e7#\u00cf\u00b9%\f\u008c\u00f1\u00a8cm\u00b8.\u0085\u00c6\u00c3\u00bco4\u00e8:\u0080n\u00d0sN\u00e5\u00a5\u00c4\u0007^v\u0094\u009e.t\u00ce\u00d7Z\u00a3\u009a\u009b2\u0014\u00fc\u00d9is\u007f\u00efw}\u00d3$\u00e3\u00d2\u00f5\u00a6:\u00daX\u0083\u00f64'\u0081\u0081\u001d\u00cbt\u001e)\u0003p\u00b7\u00bdNI\u0093u\u00bb\u00ce:~\b\u008e\u00fa\u001f*oM\u00b6)h\u001b\u008f\\,\u00e0\u00e9\u0019\u00b0\u008d\u0007jx\u00f3Y1\u00eb\u0084\u009e\u00dasm\u00ac\u00bd>\u0007)1v\u00b33e\u0086\u0000\u00f5\u0006\u008eT\u00e2\u0006\u00e1\u0097}7=d\u00f5\u00ae\u00b8\u0016\u00d7\u00ff\u00ec".length();
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
                    var6_5 = "\u0084\u00c00r\u00fe`\u0012Y\u00fc\u0014\u00e5\u00bb\u00cb\u001d\u0006\u00ba";
                    var7_6 = "\u0084\u00c00r\u00fe`\u0012Y\u00fc\u0014\u00e5\u00bb\u00cb\u001d\u0006\u00ba".length();
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
        DynamicMappingResolver.c = var8_3;
        DynamicMappingResolver.d = new Integer[29];
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DynamicMappingResolver.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DynamicMappingResolver.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private Object k(Object object) {
        return this.R.Z(object);
    }

    static Object C(DynamicMappingResolver dynamicMappingResolver, Object object) {
        return dynamicMappingResolver.R(object);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2ECB;
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
                throw new RuntimeException("a/qN", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DynamicMappingResolver.d[n2] = n3;
        }
        return d[n2];
    }

    static Object r(DynamicMappingResolver dynamicMappingResolver, Object object) {
        return dynamicMappingResolver.z(object);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qN" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static Object h(DynamicMappingResolver dynamicMappingResolver, Object object) {
        return dynamicMappingResolver.O(object);
    }

    static boolean o(DynamicMappingResolver dynamicMappingResolver, Object object) {
        return dynamicMappingResolver.F(object);
    }

    static Object G(DynamicMappingResolver dynamicMappingResolver, Object object) {
        return dynamicMappingResolver.r(object);
    }

    static boolean d(DynamicMappingResolver dynamicMappingResolver, Object object) {
        return dynamicMappingResolver.A(object);
    }

    static Object J(DynamicMappingResolver dynamicMappingResolver, Object object) {
        return dynamicMappingResolver.b(object);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DynamicMappingResolver.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private Object R(Object object) {
        return this.h.Z(object);
    }

    static void V(DynamicMappingResolver dynamicMappingResolver, Object object, Object object2) {
        dynamicMappingResolver.d(object, object2);
    }

    private Object z(Object object) {
        return this.U.Z(object);
    }

    static float B(DynamicMappingResolver dynamicMappingResolver, Object object) {
        return dynamicMappingResolver.b(object);
    }

    private Object K(Object object) {
        return this.T.Z(object);
    }

    static void p(DynamicMappingResolver dynamicMappingResolver, Object object, int n) {
        dynamicMappingResolver.p(object, n);
    }

    static void f(DynamicMappingResolver dynamicMappingResolver, Object object, boolean bl) {
        dynamicMappingResolver.r(object, bl);
    }

    private Object s(Object object) {
        return this.k.Z(object);
    }

    static boolean U(DynamicMappingResolver dynamicMappingResolver, Object object) {
        return dynamicMappingResolver.x(object);
    }

    static Object g(DynamicMappingResolver dynamicMappingResolver, Object object) {
        return dynamicMappingResolver.y(object);
    }

    static Object b(DynamicMappingResolver dynamicMappingResolver, Object object) {
        return dynamicMappingResolver.I(object);
    }

    private float n(Object object) {
        return this.u.x(object);
    }

    private Object H(Object object) {
        return this.r.Z(object);
    }

    static void z(DynamicMappingResolver dynamicMappingResolver, Object object, boolean bl) {
        dynamicMappingResolver.u(object, bl);
    }

    static boolean T(DynamicMappingResolver dynamicMappingResolver, Object object) {
        return dynamicMappingResolver.p(object);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DynamicMappingResolver.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(DynamicMappingResolver.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

