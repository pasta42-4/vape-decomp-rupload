/*
 * Decompiled with CFR 0.152.
 */
package com.security.resource;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.reflection.util.ContextualReflectionUtility;
import com.runtime.reflection.ReflectionUtilityService;
import com.state.management.StatefulEventToggle;
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
public class SecureResourceManager
extends CryptoProtocolEngine {
    private HK X;
    private final ReflectionUtilityService O;
    private final ReflectionUtilityService n;
    private HK I;
    private static final long[] i;
    public HK w;
    public HK o;
    private HK U;
    public HK D;
    private static final long b;
    private static final Object[] t;
    public HK z;
    private ReflectionUtilityService k;
    public HK u;
    private static final String[] v;
    private ReflectionUtilityService S;
    public HK c;
    public HK g;
    private static final Map q;
    public final HK A;
    private ReflectionUtilityService G;
    private ReflectionUtilityService f;
    private ReflectionUtilityService T;
    private ReflectionUtilityService M;
    private HK Q;
    public final HK s;
    public HK N;
    public HK e;
    private ReflectionUtilityService K;
    private static String Y;
    private ReflectionUtilityService p;
    private ReflectionUtilityService a;
    private HK L;
    private HK J;
    public HK r;
    private ReflectionUtilityService h;
    private ReflectionUtilityService m;
    private ReflectionUtilityService R;
    public final HK Z;
    private static final Integer[] j;
    private ReflectionUtilityService d;

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qt" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static Object[] t(SecureResourceManager secureResourceManager) {
        return secureResourceManager.y();
    }

    static void s(SecureResourceManager secureResourceManager, Object object, Object object2) {
        secureResourceManager.P(object, object2);
    }

    static boolean k(SecureResourceManager secureResourceManager, Object object) {
        return secureResourceManager.z(object);
    }

    private void M(Object object, Object object2) {
        this.X.l(object, object2);
    }

    static void Z(SecureResourceManager secureResourceManager, Object object, float f, long l, Object object2) {
        secureResourceManager.P(object, f, l, object2);
    }

    private void S(Object object, float f) {
        this.e.l(object, Float.valueOf(f));
    }

    static void e(SecureResourceManager secureResourceManager, Object object, float f, long l) {
        secureResourceManager.n(object, f, l);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qt" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void l(Object object, boolean bl) {
        this.R.B(object, bl);
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

    static Object g(SecureResourceManager secureResourceManager, Object object) {
        return secureResourceManager.j(object);
    }

    private void g(Object object, Object object2, float f) {
        this.U.l(object, object2, Float.valueOf(f));
    }

    static Object V(SecureResourceManager secureResourceManager, Object object) {
        return secureResourceManager.O(object);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (v[n4] != null) {
            return n4;
        }
        Object object = t[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 57;
                break;
            }
            case 1: {
                n3 = 35;
                break;
            }
            case 2: {
                n3 = 55;
                break;
            }
            case 3: {
                n3 = 56;
                break;
            }
            case 4: {
                n3 = 23;
                break;
            }
            case 5: {
                n3 = 60;
                break;
            }
            case 6: {
                n3 = 8;
                break;
            }
            case 7: {
                n3 = 29;
                break;
            }
            case 8: {
                n3 = 41;
                break;
            }
            case 9: {
                n3 = 9;
                break;
            }
            case 10: {
                n3 = 28;
                break;
            }
            case 11: {
                n3 = 4;
                break;
            }
            case 12: {
                n3 = 46;
                break;
            }
            case 13: {
                n3 = 12;
                break;
            }
            case 14: {
                n3 = 20;
                break;
            }
            case 15: {
                n3 = 62;
                break;
            }
            case 16: {
                n3 = 39;
                break;
            }
            case 17: {
                n3 = 19;
                break;
            }
            case 18: {
                n3 = 1;
                break;
            }
            case 19: {
                n3 = 59;
                break;
            }
            case 20: {
                n3 = 6;
                break;
            }
            case 21: {
                n3 = 18;
                break;
            }
            case 22: {
                n3 = 49;
                break;
            }
            case 23: {
                n3 = 25;
                break;
            }
            case 24: {
                n3 = 0;
                break;
            }
            case 25: {
                n3 = 43;
                break;
            }
            case 26: {
                n3 = 32;
                break;
            }
            case 27: {
                n3 = 34;
                break;
            }
            case 28: {
                n3 = 48;
                break;
            }
            case 29: {
                n3 = 53;
                break;
            }
            case 30: {
                n3 = 31;
                break;
            }
            case 31: {
                n3 = 51;
                break;
            }
            case 32: {
                n3 = 50;
                break;
            }
            case 33: {
                n3 = 63;
                break;
            }
            case 34: {
                n3 = 11;
                break;
            }
            case 35: {
                n3 = 27;
                break;
            }
            case 36: {
                n3 = 26;
                break;
            }
            case 37: {
                n3 = 36;
                break;
            }
            case 38: {
                n3 = 13;
                break;
            }
            case 39: {
                n3 = 22;
                break;
            }
            case 40: {
                n3 = 42;
                break;
            }
            case 41: {
                n3 = 54;
                break;
            }
            case 42: {
                n3 = 21;
                break;
            }
            case 43: {
                n3 = 44;
                break;
            }
            case 44: {
                n3 = 14;
                break;
            }
            case 45: {
                n3 = 38;
                break;
            }
            case 46: {
                n3 = 3;
                break;
            }
            case 47: {
                n3 = 5;
                break;
            }
            case 48: {
                n3 = 10;
                break;
            }
            case 49: {
                n3 = 33;
                break;
            }
            case 50: {
                n3 = 15;
                break;
            }
            case 51: {
                n3 = 7;
                break;
            }
            case 52: {
                n3 = 40;
                break;
            }
            case 53: {
                n3 = 16;
                break;
            }
            case 54: {
                n3 = 17;
                break;
            }
            case 55: {
                n3 = 37;
                break;
            }
            case 56: {
                n3 = 61;
                break;
            }
            case 57: {
                n3 = 45;
                break;
            }
            case 58: {
                n3 = 58;
                break;
            }
            case 59: {
                n3 = 30;
                break;
            }
            case 60: {
                n3 = 24;
                break;
            }
            case 61: {
                n3 = 2;
                break;
            }
            case 62: {
                n3 = 52;
                break;
            }
            default: {
                n3 = 47;
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
        SecureResourceManager.v[n4] = new String(cArray);
        return n4;
    }

    static Object F(SecureResourceManager secureResourceManager, Object object) {
        return secureResourceManager.a(object);
    }

    private void Y(Object object, double d2) {
        block3: {
            block2: {
                try {
                    if (GeometryCalculator.C() <= 13) break block2;
                    this.o.V(object);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw SecureResourceManager.a(customSystemException);
                }
            }
            this.o.l(object, d2);
        }
    }

    static void u(SecureResourceManager secureResourceManager, Object object, float f, long l) {
        secureResourceManager.r(object, f, l);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Field g(long l, long l2) {
        int n = SecureResourceManager.e(l, l2);
        Object object = t[n];
        if (object instanceof String) {
            String string = v[n];
            int n2 = string.indexOf(8);
            Class clazz = SecureResourceManager.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = SecureResourceManager.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = SecureResourceManager.c(clazz3, string2, clazz2)) != null) {
                    SecureResourceManager.t[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = SecureResourceManager.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        SecureResourceManager.t[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = SecureResourceManager.f(881924331087863L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    static Object Q(SecureResourceManager secureResourceManager, Object object) {
        return secureResourceManager.W(object);
    }

    static void Y(SecureResourceManager secureResourceManager, Object object, float f) {
        secureResourceManager.O(object, f);
    }

    private void E(Object object, float f, int n) {
        this.z.l(object, Float.valueOf(f), n);
    }

    private void B(Object object, int n, int n2) {
        this.s.l(object, n, n2);
    }

    private void M(Object object, double d2) {
        block3: {
            block2: {
                try {
                    if (GeometryCalculator.C() <= 13) break block2;
                    this.N.V(object);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw SecureResourceManager.a(customSystemException);
                }
            }
            this.N.l(object, d2);
        }
    }

    private void r(Object object, float f, long l) {
        this.r.l(object, Float.valueOf(f), l);
    }

    static Object L(SecureResourceManager secureResourceManager, Object object) {
        return secureResourceManager.u(object);
    }

    static void G(SecureResourceManager secureResourceManager, Object object, double d2) {
        secureResourceManager.M(object, d2);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = SecureResourceManager.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = SecureResourceManager.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private void f(Object object, float f) {
        this.a.H(object, f);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = SecureResourceManager.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private Object s(Object object, Object object2, float f, boolean bl) {
        if (GameVersionEnumerator.MC_1_21_4.H()) {
            float f2 = this.Q.p(object, object2, Float.valueOf(f), bl);
            return this.J.T(object, Float.valueOf(f2));
        }
        if (GeometryCalculator.C() >= 50) {
            double d2 = this.Q.s(object, object2, Float.valueOf(f), bl);
            return this.J.T(object, d2);
        }
        return this.J.T(object, object2, Float.valueOf(f), bl);
    }

    private void P(Object object, Object object2) {
        this.h.L(object, object2);
    }

    private Object O(Object object) {
        return this.M.Z(object);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'K' || c == 'X' || c == 'F' || c == '\u00ba') {
                field = SecureResourceManager.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'K' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'X' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'F' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = SecureResourceManager.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fe' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'a' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    static void g(SecureResourceManager secureResourceManager, Object object, float f) {
        secureResourceManager.r(object, f);
    }

    static Object m(SecureResourceManager secureResourceManager, Object object) {
        return secureResourceManager.V(object);
    }

    static Object q(SecureResourceManager secureResourceManager, Object object) {
        return secureResourceManager.r(object);
    }

    static void J(SecureResourceManager secureResourceManager, Object object, float f) {
        secureResourceManager.S(object, f);
    }

    private Object W(Object object) {
        return this.S.Z(object);
    }

    static void m(SecureResourceManager secureResourceManager, Object object, float f) {
        secureResourceManager.V(object, f);
    }

    static void w(SecureResourceManager secureResourceManager, Object object, Object object2, float f) {
        secureResourceManager.g(object, object2, f);
    }

    private void t(Object object, Object object2) {
        this.m.L(object, object2);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private int L(Object object) {
        try {
            if (GameVersionEnumerator.MC_1_21_6.H()) {
                return (int)this.G.x(object);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecureResourceManager.a(customSystemException);
        }
        return this.G.R(object);
    }

    private void r(Object object, float f) {
        this.Z.l(object, Float.valueOf(f));
    }

    /*
     * Unable to fully structure code
     */
    public SecureResourceManager() {
        block110: {
            block111: {
                block112: {
                    block109: {
                        block104: {
                            block107: {
                                block101: {
                                    block106: {
                                        block102: {
                                            block98: {
                                                block99: {
                                                    block100: {
                                                        block90: {
                                                            block97: {
                                                                block95: {
                                                                    block93: {
                                                                        block94: {
                                                                            block91: {
                                                                                block92: {
                                                                                    block87: {
                                                                                        block88: {
                                                                                            block85: {
                                                                                                block86: {
                                                                                                    block84: {
                                                                                                        block82: {
                                                                                                            var1_1 = SecureResourceManager.b ^ 77047382486983L;
                                                                                                            v0 = SecureResourceManager.w();
                                                                                                            super(ReflectionMetadataResolver.b5);
                                                                                                            var3_2 = v0;
                                                                                                            try {
                                                                                                                block83: {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            if (var3_2 != null) break block82;
                                                                                                                            if (!GameVersionEnumerator.MC_1_21_6.Q()) break block83;
                                                                                                                        }
                                                                                                                        catch (CustomSystemException v1) {
                                                                                                                            throw SecureResourceManager.a(v1);
                                                                                                                        }
                                                                                                                        this.S = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)31065, (long)(7793899155535549351L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.PL, (long)-3040025783103545064L, (long)var1_1);
                                                                                                                        if (var3_2 == null) break block84;
                                                                                                                    }
                                                                                                                    catch (CustomSystemException v2) {
                                                                                                                        throw SecureResourceManager.a(v2);
                                                                                                                    }
                                                                                                                }
                                                                                                                this.T = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)3194, (long)(7606920339210905236L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Ex, (long)-3040025783103545064L, (long)var1_1);
                                                                                                                this.d = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)17185, (long)(2742628626475444681L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.bl, (long)-3040025783103545064L, (long)var1_1);
                                                                                                                this.M = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)10947, (long)(764550557796892722L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.bW, (long)-3040025783103545064L, (long)var1_1);
                                                                                                            }
                                                                                                            catch (CustomSystemException v3) {
                                                                                                                throw SecureResourceManager.a(v3);
                                                                                                            }
                                                                                                        }
                                                                                                        this.k = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)17522, (long)(3700592801146728084L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.YA, (long)-3040025783103545064L, (long)var1_1);
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            v4 = GeometryCalculator.C();
                                                                                                            v5 = 35;
                                                                                                            if (var3_2 != null) break block85;
                                                                                                            if (v4 >= v5) break block86;
                                                                                                        }
                                                                                                        catch (CustomSystemException v6) {
                                                                                                            throw SecureResourceManager.a(v6);
                                                                                                        }
                                                                                                        this.D = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)1566, (long)(8377662820160711874L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE, Float.TYPE}, (long)-3040114291016561721L, (long)var1_1);
                                                                                                    }
                                                                                                    catch (CustomSystemException v7) {
                                                                                                        throw SecureResourceManager.a(v7);
                                                                                                    }
                                                                                                }
                                                                                                v4 = GeometryCalculator.C();
                                                                                                v5 = 50;
                                                                                            }
                                                                                            try {
                                                                                                block89: {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (var3_2 != null) break block87;
                                                                                                                if (v4 >= v5) break block88;
                                                                                                            }
                                                                                                            catch (CustomSystemException v8) {
                                                                                                                throw SecureResourceManager.a(v8);
                                                                                                            }
                                                                                                            if (GeometryCalculator.C() < 23) break block89;
                                                                                                        }
                                                                                                        catch (CustomSystemException v9) {
                                                                                                            throw SecureResourceManager.a(v9);
                                                                                                        }
                                                                                                        this.p = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)7590, (long)(2474274649585792888L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, ContextualReflectionUtility.S(ReflectionMetadataResolver.tS), (long)-3039942702239008624L, (long)var1_1);
                                                                                                        if (var3_2 == null) break block88;
                                                                                                    }
                                                                                                    catch (CustomSystemException v10) {
                                                                                                        throw SecureResourceManager.a(v10);
                                                                                                    }
                                                                                                }
                                                                                                this.p = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)29248, (long)(4513686186550286509L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, ContextualReflectionUtility.S(ReflectionMetadataResolver.tS), (long)-3039942702239008624L, (long)var1_1);
                                                                                            }
                                                                                            catch (CustomSystemException v11) {
                                                                                                throw SecureResourceManager.a(v11);
                                                                                            }
                                                                                        }
                                                                                        v4 = GeometryCalculator.C();
                                                                                        v5 = 35;
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    if (var3_2 != null) break block90;
                                                                                                    if (v4 >= v5) {
                                                                                                    }
                                                                                                    ** GOTO lbl157
                                                                                                }
                                                                                                catch (CustomSystemException v12) {
                                                                                                    throw SecureResourceManager.a(v12);
                                                                                                }
                                                                                                v13 = GameVersionEnumerator.MC_1_21_0.Q();
                                                                                                if (var3_2 != null) break block91;
                                                                                            }
                                                                                            catch (CustomSystemException v14) {
                                                                                                throw SecureResourceManager.a(v14);
                                                                                            }
                                                                                            if (v13 == 0) break block92;
                                                                                        }
                                                                                        catch (CustomSystemException v15) {
                                                                                            throw SecureResourceManager.a(v15);
                                                                                        }
                                                                                        this.m = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)1903, (long)(6768632688364989844L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.FW, (long)-3040025783103545064L, (long)var1_1);
                                                                                    }
                                                                                    catch (CustomSystemException v16) {
                                                                                        throw SecureResourceManager.a(v16);
                                                                                    }
                                                                                }
                                                                                this.f = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)20029, (long)(5192362394927228116L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Yt, (long)-3040025783103545064L, (long)var1_1);
                                                                                this.g = ((StatefulEventToggle)((StatefulEventToggle)SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)19022, (long)(2357806402708922513L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.rF, ReflectionMetadataResolver.PE, Boolean.TYPE, Boolean.TYPE, Float.TYPE}, (long)-3042005538387017684L, (long)var1_1).F(ReflectionMetadataResolver.bf)).e(GameVersionEnumerator.MC_1_21_11.R(), (String)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)2815, (long)(7731371939200278562L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1))).H(GameVersionEnumerator.MC_1_21_11.R(), new Class[]{ReflectionMetadataResolver.EV, ReflectionMetadataResolver.PE, Boolean.TYPE, Boolean.TYPE, Float.TYPE}).M();
                                                                                this.K = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)21889, (long)(8854323040143376211L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.bf, (long)-3040025783103545064L, (long)var1_1);
                                                                                this.L = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)5767, (long)(3433722738921979000L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.YH, Float.TYPE}, (long)-3040114291016561721L, (long)var1_1);
                                                                                this.U = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)1889, (long)(4132959846200487306L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.YH, Float.TYPE}, (long)-3040114291016561721L, (long)var1_1);
                                                                                this.G = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)10910, (long)(7718215494104481900L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-3040025783103545064L, (long)var1_1);
                                                                                v13 = (int)GameVersionEnumerator.MC_1_21_0.Q();
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    if (var3_2 != null) break block93;
                                                                                    if (v13 == 0) break block94;
                                                                                }
                                                                                catch (CustomSystemException v17) {
                                                                                    throw SecureResourceManager.a(v17);
                                                                                }
                                                                                this.X = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)31290, (long)(2910734975350526173L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.rr}, (long)-3040114291016561721L, (long)var1_1);
                                                                            }
                                                                            catch (CustomSystemException v18) {
                                                                                throw SecureResourceManager.a(v18);
                                                                            }
                                                                        }
                                                                        try {
                                                                            this.h = SecureResourceManager.c("\u00fe", (Object)this, (Object)ReflectionMetadataResolver.FF, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)18554, (long)(4281988106965541526L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.PE, (long)-3041914610907212487L, (long)var1_1);
                                                                            if (var3_2 != null) break block95;
                                                                            v13 = GeometryCalculator.C();
                                                                        }
                                                                        catch (CustomSystemException v19) {
                                                                            throw SecureResourceManager.a(v19);
                                                                        }
                                                                    }
                                                                    try {
                                                                        block96: {
                                                                            try {
                                                                                if (v13 < 50) break block96;
                                                                                this.Q = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)7412, (long)(8988602113388656129L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, Double.TYPE, (Object)new Class[]{ReflectionMetadataResolver.bf, Float.TYPE, Boolean.TYPE}, (long)-3040114291016561721L, (long)var1_1);
                                                                                this.J = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)4793, (long)(8256157710640265322L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.rr, (Object)new Class[]{Double.TYPE}, (long)-3040114291016561721L, (long)var1_1);
                                                                                if (var3_2 == null) break block97;
                                                                            }
                                                                            catch (CustomSystemException v20) {
                                                                                throw SecureResourceManager.a(v20);
                                                                            }
                                                                        }
                                                                        this.Q = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)16139, (long)(7403945279030531548L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Double.TYPE, (Object)new Class[]{ReflectionMetadataResolver.bf, Float.TYPE, Boolean.TYPE}, (long)-3040114291016561721L, (long)var1_1);
                                                                    }
                                                                    catch (CustomSystemException v21) {
                                                                        throw SecureResourceManager.a(v21);
                                                                    }
                                                                }
                                                                this.J = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)28443, (long)(2256354369974289889L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.rr, (Object)new Class[]{ReflectionMetadataResolver.bf, Float.TYPE, Boolean.TYPE}, (long)-3040114291016561721L, (long)var1_1);
                                                            }
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            this.r = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)30099, (long)(5078179513973006195L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), Void.TYPE, (Object)new Class[]{Float.TYPE, Long.TYPE, ReflectionMetadataResolver.YH}, (long)-3042005538387017684L, (long)var1_1).H(GameVersionEnumerator.MC_1_21_0.R(), new Class[]{ReflectionMetadataResolver.YU}).H(GameVersionEnumerator.MC_1_20_6.Q(), new Class[]{Float.TYPE, Long.TYPE}).M();
                                                                            v22 = GameVersionEnumerator.MC_1_21_11.H();
                                                                            if (var3_2 != null) break block98;
                                                                            if (v22 == 0) break block99;
                                                                        }
                                                                        catch (CustomSystemException v23) {
                                                                            throw SecureResourceManager.a(v23);
                                                                        }
                                                                        this.w = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)25023, (long)(2158789366606383938L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.YU}, (long)-3040114291016561721L, (long)var1_1);
                                                                        if (var3_2 == null) break block99;
                                                                    }
                                                                    catch (CustomSystemException v24) {
                                                                        throw SecureResourceManager.a(v24);
                                                                    }
lbl157:
                                                                    // 2 sources

                                                                    this.m = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)16044, (long)(7726707935452337240L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.FW, (long)-3040025783103545064L, (long)var1_1);
                                                                    this.h = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)14417, (long)(5698266664697762491L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.PE, (long)-3040025783103545064L, (long)var1_1);
                                                                    this.z = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)32136, (long)(4438447264426612588L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Float.TYPE, Integer.TYPE}, (long)-3040114291016561721L, (long)var1_1);
                                                                    v25 = this;
                                                                    v26 = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)21889, (long)(7656804664622088021L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Float.TYPE, Long.TYPE}, (long)-3040114291016561721L, (long)var1_1);
                                                                    if (var3_2 != null) break block100;
                                                                }
                                                                catch (CustomSystemException v27) {
                                                                    throw SecureResourceManager.a(v27);
                                                                }
                                                                v25.r = v26;
                                                                v4 = GeometryCalculator.C();
                                                                v5 = 15;
                                                            }
                                                            catch (CustomSystemException v28) {
                                                                throw SecureResourceManager.a(v28);
                                                            }
                                                        }
                                                        try {
                                                            if (v4 >= v5) {
                                                                this.c = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)3728, (long)(6964676119536743L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE, Float.TYPE, Long.TYPE}, (long)-3040114291016561721L, (long)var1_1);
                                                            }
                                                        }
                                                        catch (CustomSystemException v29) {
                                                            throw SecureResourceManager.a(v29);
                                                        }
                                                        v25 = this;
                                                        v26 = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)12868, (long)(9087483639528265899L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Float.TYPE}, (long)-3040114291016561721L, (long)var1_1);
                                                    }
                                                    v25.e = v26;
                                                }
                                                this.O = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)19532, (long)(5834574108409521815L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, Float.TYPE, (long)-3040025783103545064L, (long)var1_1);
                                                this.n = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)552, (long)(323672493882091722L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, Float.TYPE, (long)-3040025783103545064L, (long)var1_1);
                                                this.s = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)15825, (long)(3087763062752450344L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE}, (long)-3040114291016561721L, (long)var1_1);
                                                this.Z = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)586, (long)(7570226970182887579L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Float.TYPE}, (long)-3040114291016561721L, (long)var1_1);
                                                this.a = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)30009, (long)(5146823655841128417L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, Float.TYPE, (long)-3040025783103545064L, (long)var1_1);
                                                v22 = GeometryCalculator.C();
                                            }
                                            try {
                                                block103: {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (var3_2 != null) break block101;
                                                                    if (v22 > 13) {
                                                                    }
                                                                    ** GOTO lbl242
                                                                }
                                                                catch (CustomSystemException v30) {
                                                                    throw SecureResourceManager.a(v30);
                                                                }
                                                                this.R = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)22211, (long)(6859063321053920277L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, Boolean.TYPE, (long)-3040025783103545064L, (long)var1_1);
                                                                v31 = GeometryCalculator.C();
                                                                if (var3_2 != null) break block102;
                                                            }
                                                            catch (CustomSystemException v32) {
                                                                throw SecureResourceManager.a(v32);
                                                            }
                                                            if (v31 < 35) break block103;
                                                        }
                                                        catch (CustomSystemException v33) {
                                                            throw SecureResourceManager.a(v33);
                                                        }
                                                        this.A = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)8706, (long)(9170302381399574782L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Float.TYPE, Long.TYPE, Boolean.TYPE}, (long)-3040114291016561721L, (long)var1_1);
                                                        if (var3_2 == null) break block104;
                                                    }
                                                    catch (CustomSystemException v34) {
                                                        throw SecureResourceManager.a(v34);
                                                    }
                                                }
                                                v31 = (int)TemporalMetadataResolver.h.d();
                                            }
                                            catch (CustomSystemException v35) {
                                                throw SecureResourceManager.a(v35);
                                            }
                                        }
                                        try {
                                            block105: {
                                                try {
                                                    if (v31 == 0) break block105;
                                                    this.A = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)1333, (long)(6560782356901048293L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Float.TYPE, Long.TYPE}, (long)-3040114291016561721L, (long)var1_1);
                                                    if (var3_2 == null) break block106;
                                                }
                                                catch (CustomSystemException v36) {
                                                    throw SecureResourceManager.a(v36);
                                                }
                                            }
                                            this.A = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)18303, (long)(713474822939733383L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Void.TYPE, (Object)new Class[]{Float.TYPE, Long.TYPE}, (long)-3040114291016561721L, (long)var1_1);
                                        }
                                        catch (CustomSystemException v37) {
                                            throw SecureResourceManager.a(v37);
                                        }
                                    }
                                    try {
                                        try {
                                            this.o = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)3472, (long)(8828824238431676256L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-3040114291016561721L, (long)var1_1);
                                            this.N = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)21344, (long)(3077833162830772609L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-3040114291016561721L, (long)var1_1);
                                            if (var3_2 == null) break block104;
lbl242:
                                            // 2 sources

                                            this.o = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)26286, (long)(1091573462218361931L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Double.TYPE}, (long)-3040114291016561721L, (long)var1_1);
                                            v38 = this;
                                            v39 = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)11345, (long)(4395240600015275698L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Double.TYPE}, (long)-3040114291016561721L, (long)var1_1);
                                            if (var3_2 != null) break block107;
                                        }
                                        catch (CustomSystemException v40) {
                                            throw SecureResourceManager.a(v40);
                                        }
                                        v38.N = v39;
                                        v22 = (int)ObjectLifecycleTracker.U.d();
                                    }
                                    catch (CustomSystemException v41) {
                                        throw SecureResourceManager.a(v41);
                                    }
                                }
                                try {
                                    block108: {
                                        try {
                                            if (v22 == 0) break block108;
                                            this.A = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)8442, (long)(7721244158078880265L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Float.TYPE}, (long)-3040114291016561721L, (long)var1_1);
                                            if (var3_2 == null) break block104;
                                        }
                                        catch (CustomSystemException v42) {
                                            throw SecureResourceManager.a(v42);
                                        }
                                    }
                                    v38 = this;
                                    v39 = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)19703, (long)(4183984331550975534L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Void.TYPE, (Object)new Class[]{Float.TYPE}, (long)-3040114291016561721L, (long)var1_1);
                                }
                                catch (CustomSystemException v43) {
                                    throw SecureResourceManager.a(v43);
                                }
                            }
                            v38.A = v39;
                        }
                        try {
                            try {
                                v44 = GeometryCalculator.C();
                                if (var3_2 != null) break block109;
                                if (v44 < 37) break block110;
                            }
                            catch (CustomSystemException v45) {
                                throw SecureResourceManager.a(v45);
                            }
                            v44 = (int)GameVersionEnumerator.MC_1_21_6.Q();
                        }
                        catch (CustomSystemException v46) {
                            throw SecureResourceManager.a(v46);
                        }
                    }
                    try {
                        try {
                            if (var3_2 != null) break block111;
                            if (v44 == 0) break block112;
                        }
                        catch (CustomSystemException v47) {
                            throw SecureResourceManager.a(v47);
                        }
                        this.u = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)30108, (long)(2194960987644059498L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE}, (long)-3040114291016561721L, (long)var1_1);
                    }
                    catch (CustomSystemException v48) {
                        throw SecureResourceManager.a(v48);
                    }
                }
                v44 = (int)GameVersionEnumerator.MC_1_21_0.V().m();
            }
            try {
                if (v44 != 0) {
                    this.I = SecureResourceManager.c("\u00fe", (Object)this, (Object)SecureResourceManager.c("a", (int)SecureResourceManager.b("k", (int)21124, (long)(3083284166145865809L ^ var1_1)), (long)-3042103691237226412L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.rz, (Object)new Class[0], (long)-3042162394642762451L, (long)var1_1);
                }
            }
            catch (CustomSystemException v49) {
                throw SecureResourceManager.a(v49);
            }
        }
    }

    static void v(SecureResourceManager secureResourceManager, Object object, boolean bl) {
        secureResourceManager.l(object, bl);
    }

    private Object L(Object object) {
        return this.d.Z(object);
    }

    private Object V(Object object) {
        return this.T.Z(object);
    }

    public static void U(String string) {
        Y = string;
    }

    private Object u(Object object) {
        return this.k.Z(object);
    }

    private void C(Object object, Object object2, float f) {
        this.L.l(object, object2, Float.valueOf(f));
    }

    private boolean z(Object object) {
        return this.R.R(object);
    }

    static Object u(SecureResourceManager secureResourceManager, Object object) {
        return secureResourceManager.S(object);
    }

    static float T(SecureResourceManager secureResourceManager, Object object) {
        return secureResourceManager.P(object);
    }

    static int S(SecureResourceManager secureResourceManager, Object object) {
        return secureResourceManager.L(object);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                SecureResourceManager.b = MultiContainerRegistry.a(-1153234610113425543L, -4995366203774153756L, MethodHandles.lookup().lookupClass()).a(109716961766825L);
                SecureResourceManager.t = new Object[20];
                SecureResourceManager.v = new String[20];
                SecureResourceManager.a();
                SecureResourceManager.q = new HashMap<K, V>(13);
                SecureResourceManager.U(null);
                var0 = SecureResourceManager.b ^ 124727867646292L;
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
                var8_3 = new long[47];
                var5_4 = 0;
                var6_5 = "Q\u0092\u00e7\u00931\u00e4\u00f3=\u00d1\u0001GO\nM\u001c\u00a4l\u008b\u0019\u0089\u008fzJ\u0007\u00fa\u0096\u0013\u00a8\u00ce\u00e1qa\u00b7\u0003`\u0087\u00b8vx\u00e4M8\"j\u009c\u00dd\u00f1\u0014\u00a7\u009d?O\u00b7\u0016\u0089\u00fd\u0092\r@\u00f0\u00b6\u00e2G\u00f3_\u00f8\u00fc\u0089\u009d.\u00c0<\f\u00d9\u009b+\u00ed\u0018U\u00e5P\u00ca\u0005p\u00f3\u000b\u00e2~\u0083\u00eew\u00d8\u0084\u00d2M\u00a81\u00e3\u0017\u00cdT\u00a0\u00c4\u00a4\u0097l\u00af\u00efo\u00b5\b\u0002#b\u00a5w\u00ccA\u00ce\u00f6\u00abV\u00c8\u0015\u00be\u001bJ\u00aac)\u0012S\u00bf\u0094\u00aa\u009c3E\u00ec\u001dh\u00bc\u001c\u00dc\u000f\u00ec\u007f\u00f6\u00e2\"\u00e0\u0011\u00eb\u0015\u0016\\\u00174\u00bcmJ\u0089\u00f2Y\u0013\u00b1\u00b2\u00e1\u00ee\u00bf\u00c9\u00bd\u00a7\u00f3\u0011T\u0001F\u00a7<\u001fB07?f\u009e\u00d3m&\u00ee\u0087K\u00cc\u00b0\u00d4%\u00cb\u00f3y\"\u00bb\u00a8\u00df*Y\u0000{4\u00b8\u00bf\u00bal>\u00f9N\u00cb\u00ecnW\u00c3\u0001\u00cb\u00aah4/\u0089Y\u001a\u00c9\u009d:\u00e7\u00f9>\u00e8\u009b\u00a72]K$F\u008e\u00ea\u00fa<\u0094\u00b8\r5\u008c\u00e6X!|\u008e\u00997\u00afQ\u00dc\u00d9!\u00f2u2\u0004\u00c9j6\u009a\u00afDXu[\u0094\u00c4C\u00fa\u00d33\u0080\u009d\u00ab\u00c2\n-+\u0098u~\u00edS\u0089L\u00a1e\u00f3l\u00a1Q\u0010\u00e0x{\u00f9{Ep\u00d6\u00b6\u00b16\u00e8\u00d4\u00c8c\u00cd|r~\u00a9\u00a0\u00d9{\u00ec\u00fa\u00cb\u00af\":Mv\u00ffQ'\u0013\u00c9\u0083r\u00c8=\n\u00ef\u00e0\u00d6\u00e5X`\u00b4\u00b6e\u00cc5\u0084\u00b3@";
                var7_6 = "Q\u0092\u00e7\u00931\u00e4\u00f3=\u00d1\u0001GO\nM\u001c\u00a4l\u008b\u0019\u0089\u008fzJ\u0007\u00fa\u0096\u0013\u00a8\u00ce\u00e1qa\u00b7\u0003`\u0087\u00b8vx\u00e4M8\"j\u009c\u00dd\u00f1\u0014\u00a7\u009d?O\u00b7\u0016\u0089\u00fd\u0092\r@\u00f0\u00b6\u00e2G\u00f3_\u00f8\u00fc\u0089\u009d.\u00c0<\f\u00d9\u009b+\u00ed\u0018U\u00e5P\u00ca\u0005p\u00f3\u000b\u00e2~\u0083\u00eew\u00d8\u0084\u00d2M\u00a81\u00e3\u0017\u00cdT\u00a0\u00c4\u00a4\u0097l\u00af\u00efo\u00b5\b\u0002#b\u00a5w\u00ccA\u00ce\u00f6\u00abV\u00c8\u0015\u00be\u001bJ\u00aac)\u0012S\u00bf\u0094\u00aa\u009c3E\u00ec\u001dh\u00bc\u001c\u00dc\u000f\u00ec\u007f\u00f6\u00e2\"\u00e0\u0011\u00eb\u0015\u0016\\\u00174\u00bcmJ\u0089\u00f2Y\u0013\u00b1\u00b2\u00e1\u00ee\u00bf\u00c9\u00bd\u00a7\u00f3\u0011T\u0001F\u00a7<\u001fB07?f\u009e\u00d3m&\u00ee\u0087K\u00cc\u00b0\u00d4%\u00cb\u00f3y\"\u00bb\u00a8\u00df*Y\u0000{4\u00b8\u00bf\u00bal>\u00f9N\u00cb\u00ecnW\u00c3\u0001\u00cb\u00aah4/\u0089Y\u001a\u00c9\u009d:\u00e7\u00f9>\u00e8\u009b\u00a72]K$F\u008e\u00ea\u00fa<\u0094\u00b8\r5\u008c\u00e6X!|\u008e\u00997\u00afQ\u00dc\u00d9!\u00f2u2\u0004\u00c9j6\u009a\u00afDXu[\u0094\u00c4C\u00fa\u00d33\u0080\u009d\u00ab\u00c2\n-+\u0098u~\u00edS\u0089L\u00a1e\u00f3l\u00a1Q\u0010\u00e0x{\u00f9{Ep\u00d6\u00b6\u00b16\u00e8\u00d4\u00c8c\u00cd|r~\u00a9\u00a0\u00d9{\u00ec\u00fa\u00cb\u00af\":Mv\u00ffQ'\u0013\u00c9\u0083r\u00c8=\n\u00ef\u00e0\u00d6\u00e5X`\u00b4\u00b6e\u00cc5\u0084\u00b3@".length();
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
                    var6_5 = "\u00b7a\u00b4{|\u0098\u00bb0+u\u0098\u0001\u00f3\u0014\u00b3\u00e6";
                    var7_6 = "\u00b7a\u00b4{|\u0098\u00bb0+u\u0098\u0001\u00f3\u0014\u00b3\u00e6".length();
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
        SecureResourceManager.i = var8_3;
        SecureResourceManager.j = new Integer[47];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7F39;
        if (j[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = i[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])q.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    q.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/qt", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            SecureResourceManager.j[n2] = n3;
        }
        return j[n2];
    }

    private Object j(Object object) {
        return this.f.Z(object);
    }

    private void O(Object object, float f) {
        this.O.H(object, f);
    }

    static Object S(SecureResourceManager secureResourceManager, Object object, Object object2, float f, boolean bl) {
        return secureResourceManager.s(object, object2, f, bl);
    }

    static void a(SecureResourceManager secureResourceManager, Object object, float f) {
        secureResourceManager.f(object, f);
    }

    static Object j(SecureResourceManager secureResourceManager) {
        return secureResourceManager.I();
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = SecureResourceManager.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    static void X(SecureResourceManager secureResourceManager, Object object, Object object2) {
        secureResourceManager.M(object, object2);
    }

    private void P(Object object, float f, long l, Object object2) {
        this.r.l(object, Float.valueOf(f), l, object2);
    }

    private Object[] y() {
        return this.p.t(null);
    }

    private float P(Object object) {
        return this.n.x(object);
    }

    private static Method h(long l, long l2) {
        int n = SecureResourceManager.e(l, l2);
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
                String string2 = v[n];
                int n3 = string2.indexOf(8);
                clazz3 = SecureResourceManager.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = SecureResourceManager.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = SecureResourceManager.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        SecureResourceManager.t[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = SecureResourceManager.f(881924331087863L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = SecureResourceManager.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        SecureResourceManager.t[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = SecureResourceManager.f(881924331087863L, 0L);
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

    private Object a(Object object) {
        return this.h.Z(object);
    }

    static void p(SecureResourceManager secureResourceManager, Object object, float f, int n) {
        secureResourceManager.E(object, f, n);
    }

    static void I(SecureResourceManager secureResourceManager, Object object, double d2) {
        secureResourceManager.Y(object, d2);
    }

    static void H(SecureResourceManager secureResourceManager, Object object, int n, int n2) {
        secureResourceManager.B(object, n, n2);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = SecureResourceManager.e(l, l2);
            object = t[n];
            try {
                if (!(object instanceof String)) break block2;
                SecureResourceManager.t[n] = clazz = Class.forName(v[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private Object S(Object object) {
        return this.m.Z(object);
    }

    private float k(Object object) {
        return this.O.x(object);
    }

    static void u(SecureResourceManager secureResourceManager, Object object, Object object2, float f) {
        secureResourceManager.C(object, object2, f);
    }

    static float f(SecureResourceManager secureResourceManager, Object object) {
        return secureResourceManager.k(object);
    }

    private static void a() {
        Object[] objectArray = t;
        t[0] = "\u007f\u0016}0";
        objectArray[1] = "\u0004q=\u0012HR\u000f~,]5J\u001cy%\u0014";
        objectArray[2] = Boolean.TYPE;
        SecureResourceManager.v[2] = "java/lang/Boolean";
        objectArray[3] = "k\u001a\u0015D|\u001b`\u0015\u0004\u000b\u0011\u001b`\b\u0010";
        objectArray[4] = "\u0019!\u0004}2il\u0001\u000fr#&\u0001\u0001\u000fo73";
        objectArray[5] = "\u001fan\u001b";
        objectArray[6] = "\u000f\u0005\u0001";
        objectArray[7] = Integer.TYPE;
        SecureResourceManager.v[7] = "java/lang/Integer";
        objectArray[8] = "\u000b\u001f_q";
        objectArray[9] = "\u001aKS7\u007feokX8n*\u0002kX%z?";
        objectArray[10] = "\u0005dd%\u0004\u000epDo*\u0015A\u001dDo7\u0001T";
        objectArray[11] = "%\u0019\n6";
        objectArray[12] = "pf\u001cZ\b\"{i\r\u0015i,pb\tO";
        objectArray[13] = "\u0004*\u0017=q\u0007\u0003(T\u0006RdGiLap\u001f\n2W\u0006,\u001bE9\u0011<i^^</<m\u000e\u0003>U{q\u000b@U\u0010fo\u000f\u0002d\u0016w(]:nJ=$X\\+Uy-d";
        objectArray[14] = "\u0000\u0010QE2\"\u0007\u0012\u0012~\rACS\n\u00193:\u000e\b\u0011~o>A\u0003WD*{Z\u0006iD.+\u0007\u0004\u0013\u00032.DoT\u0018l<W\u0013\u0014A8/>";
        objectArray[15] = "t\t\u0000v&'s\u000bCM\u000fD7J[*'?z\u0011@M{;5\u001a\u0006w>~.\u001f8w:.s\u001dB0&+0v\u0005+x9#\nEr,*J";
        objectArray[16] = "}lP*\u007fXzn\u0013\u0011F;>/\u000bv~@st\u0010\u0011\"D<\u007fV+g\u0001'zh+cQzx\u0012l\u007fT9\u0013WqaP{\"Q`&\u0002C(\r**\u0007%m\u0012n#;";
        objectArray[17] = "V2)Nv\u0003Wf-Q\u0018\u000e\u0011V|[}^\u001818Df\u001bj+|I\u007f\u0000\u0011f'R\u0018";
        objectArray[18] = "\u0012s\u007fu\u0015E\u0015q<N\u0013&Q0$)\u0014]\u001ck?NK^F5,4\fBCvGq\u0011\\G4vw\u0000\u001b\u0015\fw$OOQt*t@I,";
        Object[] objectArray2 = objectArray;
        objectArray[19] = "R-\nt5&U/IO\u0000EV*Xv:?\u00116]5Q8P1U**u\u000b*2v.:\u0000l\b3k!\u0005R\b7;|\u0007(O+>?loTu,,\u0010/\r!?E";
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = SecureResourceManager.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = SecureResourceManager.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static String w() {
        return Y;
    }

    private Object I() {
        return this.I.T(null, new Object[0]);
    }

    private Object r(Object object) {
        return this.K.Z(object);
    }

    private void n(Object object, float f, long l) {
        this.A.l(object, Float.valueOf(f));
    }

    private void V(Object object, float f) {
        this.n.H(object, f);
    }

    static void Z(SecureResourceManager secureResourceManager, Object object, Object object2) {
        secureResourceManager.t(object, object2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(SecureResourceManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(SecureResourceManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

