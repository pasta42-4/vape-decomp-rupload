/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.mapping.dynamic;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.reflection.util.ContextualReflectionUtility;
import com.runtime.reflection.ReflectionUtilityService;
import com.security.resource.SecureResourceManager;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.temporal.metadata.TemporalMetadataResolver;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.IntBuffer;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class DynamicObjectMapper
extends CryptoProtocolEngine {
    public HK Z;
    public HK O;
    public HK X;
    private static final long[] d;
    public final HK o;
    private HK q;
    public final HK k;
    private final ReflectionUtilityService b;
    public final HK I;
    private static final Integer[] e;
    public final HK E;
    public HK w;
    public final HK r;
    public HK p;
    public final HK L;
    public final HK v;
    @Nullable
    public HK T;
    public final HK J;
    public final HK F;
    public HK Q;
    public ReflectionUtilityService W;
    private static final Map f;
    public HK n;
    public HK M;
    public HK P;
    public HK B;
    public HK u;
    private static final long c;
    private static final String[] i;
    public HK a;
    private static final Object[] h;
    public final HK t;
    public final HK V;
    public HK S;
    private ReflectionUtilityService g;

    private void f(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, IntBuffer intBuffer) {
        try {
            if (this.T != null) {
                this.T.l(null, n, n2, n3, n4, n5, n6, n7, n8, intBuffer);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicObjectMapper.a(customSystemException);
        }
    }

    private void X(float f, float f2, float f3, float f4) {
        this.S.l(null, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4));
    }

    static Object C(DynamicObjectMapper dynamicObjectMapper) {
        return dynamicObjectMapper.O();
    }

    private static int e(long l, long l2) {
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
                n3 = 29;
                break;
            }
            case 1: {
                n3 = 9;
                break;
            }
            case 2: {
                n3 = 28;
                break;
            }
            case 3: {
                n3 = 31;
                break;
            }
            case 4: {
                n3 = 58;
                break;
            }
            case 5: {
                n3 = 50;
                break;
            }
            case 6: {
                n3 = 35;
                break;
            }
            case 7: {
                n3 = 61;
                break;
            }
            case 8: {
                n3 = 47;
                break;
            }
            case 9: {
                n3 = 11;
                break;
            }
            case 10: {
                n3 = 26;
                break;
            }
            case 11: {
                n3 = 14;
                break;
            }
            case 12: {
                n3 = 23;
                break;
            }
            case 13: {
                n3 = 63;
                break;
            }
            case 14: {
                n3 = 37;
                break;
            }
            case 15: {
                n3 = 45;
                break;
            }
            case 16: {
                n3 = 2;
                break;
            }
            case 17: {
                n3 = 7;
                break;
            }
            case 18: {
                n3 = 39;
                break;
            }
            case 19: {
                n3 = 3;
                break;
            }
            case 20: {
                n3 = 46;
                break;
            }
            case 21: {
                n3 = 22;
                break;
            }
            case 22: {
                n3 = 54;
                break;
            }
            case 23: {
                n3 = 24;
                break;
            }
            case 24: {
                n3 = 43;
                break;
            }
            case 25: {
                n3 = 5;
                break;
            }
            case 26: {
                n3 = 25;
                break;
            }
            case 27: {
                n3 = 32;
                break;
            }
            case 28: {
                n3 = 27;
                break;
            }
            case 29: {
                n3 = 0;
                break;
            }
            case 30: {
                n3 = 52;
                break;
            }
            case 31: {
                n3 = 42;
                break;
            }
            case 32: {
                n3 = 15;
                break;
            }
            case 33: {
                n3 = 1;
                break;
            }
            case 34: {
                n3 = 55;
                break;
            }
            case 35: {
                n3 = 60;
                break;
            }
            case 36: {
                n3 = 34;
                break;
            }
            case 37: {
                n3 = 20;
                break;
            }
            case 38: {
                n3 = 44;
                break;
            }
            case 39: {
                n3 = 53;
                break;
            }
            case 40: {
                n3 = 41;
                break;
            }
            case 41: {
                n3 = 19;
                break;
            }
            case 42: {
                n3 = 6;
                break;
            }
            case 43: {
                n3 = 12;
                break;
            }
            case 44: {
                n3 = 36;
                break;
            }
            case 45: {
                n3 = 49;
                break;
            }
            case 46: {
                n3 = 18;
                break;
            }
            case 47: {
                n3 = 21;
                break;
            }
            case 48: {
                n3 = 40;
                break;
            }
            case 49: {
                n3 = 38;
                break;
            }
            case 50: {
                n3 = 59;
                break;
            }
            case 51: {
                n3 = 8;
                break;
            }
            case 52: {
                n3 = 16;
                break;
            }
            case 53: {
                n3 = 33;
                break;
            }
            case 54: {
                n3 = 57;
                break;
            }
            case 55: {
                n3 = 48;
                break;
            }
            case 56: {
                n3 = 62;
                break;
            }
            case 57: {
                n3 = 51;
                break;
            }
            case 58: {
                n3 = 4;
                break;
            }
            case 59: {
                n3 = 10;
                break;
            }
            case 60: {
                n3 = 13;
                break;
            }
            case 61: {
                n3 = 56;
                break;
            }
            case 62: {
                n3 = 30;
                break;
            }
            default: {
                n3 = 17;
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
        DynamicObjectMapper.i[n4] = new String(cArray);
        return n4;
    }

    static void k(DynamicObjectMapper dynamicObjectMapper, float f, float f2, float f3, float f4) {
        dynamicObjectMapper.X(f, f2, f3, f4);
    }

    private void u() {
        this.w.V(null);
    }

    private void A(int n, int n2) {
        this.q.l(null, n, n2);
    }

    private void z() {
        this.o.V(null);
    }

    static Object[] V(DynamicObjectMapper dynamicObjectMapper) {
        return dynamicObjectMapper.X();
    }

    private void Z() {
        this.k.V(null);
    }

    private int f() {
        return this.b.R(null);
    }

    public int I(int n) {
        try {
            if (this.X == null) {
                return -1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicObjectMapper.a(customSystemException);
        }
        return this.X.R(null, n);
    }

    private Object O() {
        return this.W.Z(null);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DynamicObjectMapper.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DynamicObjectMapper.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
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

    private void i(int n, int n2) {
        this.u.l(null, n, n2);
    }

    static void V(DynamicObjectMapper dynamicObjectMapper, int n, int n2) {
        dynamicObjectMapper.i(n, n2);
    }

    static void r(DynamicObjectMapper dynamicObjectMapper, int n, int n2, int n3, int n4) {
        dynamicObjectMapper.n(n, n2, n3, n4);
    }

    static void c(DynamicObjectMapper dynamicObjectMapper, float f, float f2, float f3, float f4) {
        dynamicObjectMapper.q(f, f2, f3, f4);
    }

    static void g(DynamicObjectMapper dynamicObjectMapper) {
        dynamicObjectMapper.J();
    }

    static void v(DynamicObjectMapper dynamicObjectMapper, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        dynamicObjectMapper.A(bl, bl2, bl3, bl4);
    }

    private Object[] X() {
        return this.g.t(null);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'w' || c == 'f' || c == '\u00c8' || c == '\u00e0') {
                field = DynamicObjectMapper.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'w' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'f' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DynamicObjectMapper.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00db' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void h(float f) {
        this.p.l(null, Float.valueOf(f));
    }

    private void r(boolean bl) {
        this.J.l(null, bl);
    }

    static void U(DynamicObjectMapper dynamicObjectMapper) {
        dynamicObjectMapper.z();
    }

    static void T(DynamicObjectMapper dynamicObjectMapper) {
        dynamicObjectMapper.j();
    }

    private void v() {
        this.Z.V(null);
    }

    static void D(DynamicObjectMapper dynamicObjectMapper) {
        dynamicObjectMapper.Q();
    }

    private void y() {
        this.I.V(null);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private void U() {
        this.n.V(null);
    }

    static void G(DynamicObjectMapper dynamicObjectMapper) {
        dynamicObjectMapper.s();
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "\u0006B|";
        objectArray[1] = Integer.TYPE;
        DynamicObjectMapper.i[1] = "java/lang/Integer";
        objectArray[2] = "`e]F'*kjL\tZ2xmE@";
        objectArray[3] = "\u0002\u0019c+";
        objectArray[4] = Boolean.TYPE;
        DynamicObjectMapper.i[4] = "java/lang/Boolean";
        objectArray[5] = "ff8\nzbmi)E\u0017bmt=";
        objectArray[6] = "\t(!^";
        objectArray[7] = "\t65:[d|\u0016>5J+\u0011\u0016>(^>";
        objectArray[8] = "pn\u007fj";
        objectArray[9] = "*Mf\u0015\u0019\u0019!BwZx\u0017*Is\u0000";
        objectArray[10] = "mCI-1j7L\u0016%[YW\u0011S$>ufG\u001b*`\u0014mXR*'d1CFz[/4GN(bs4AGGgi4KP|d}.\u0013+";
        objectArray[11] = "*\u0002t\f'\u000fp\r+\u0004M,\u0010Pn\u0005(\u0010!\u0006&\u000bvq*\u0019o\u000b1\u0001v\u0002{[MJs\u0006s\tt\u0016s\u0000zfp\u001b!W+X)\u001cn\u0005\u0016[+A*YoX6Iri";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "W# -w\u0002Ry'A,\u001d1\u007f2q~\u0016Qvhx#f\b>;$&W^v5zG";
    }

    private void s() {
        this.E.V(null);
    }

    static void h(DynamicObjectMapper dynamicObjectMapper, int n) {
        dynamicObjectMapper.o(n);
    }

    private static Field g(long l, long l2) {
        int n = DynamicObjectMapper.e(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = DynamicObjectMapper.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DynamicObjectMapper.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DynamicObjectMapper.c(clazz3, string2, clazz2)) != null) {
                    DynamicObjectMapper.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DynamicObjectMapper.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DynamicObjectMapper.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DynamicObjectMapper.f(645676239613724L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void g() {
        this.F.V(null);
    }

    static void a(DynamicObjectMapper dynamicObjectMapper) {
        dynamicObjectMapper.v();
    }

    static void m(DynamicObjectMapper dynamicObjectMapper) {
        dynamicObjectMapper.D();
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    static void f(DynamicObjectMapper dynamicObjectMapper, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, IntBuffer intBuffer) {
        dynamicObjectMapper.f(n, n2, n3, n4, n5, n6, n7, n8, intBuffer);
    }

    private void q(float f, float f2, float f3, float f4) {
        this.v.l(null, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4));
    }

    private void x() {
        this.B.V(null);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = DynamicObjectMapper.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DynamicObjectMapper.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    static int g(DynamicObjectMapper dynamicObjectMapper) {
        return dynamicObjectMapper.e();
    }

    static void x(DynamicObjectMapper dynamicObjectMapper) {
        dynamicObjectMapper.y();
    }

    private void o(int n) {
        this.V.l(null, n);
    }

    static void P(DynamicObjectMapper dynamicObjectMapper) {
        dynamicObjectMapper.u();
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4C36;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
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
                throw new RuntimeException("a/qg", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DynamicObjectMapper.e[n2] = n3;
        }
        return e[n2];
    }

    static void R(DynamicObjectMapper dynamicObjectMapper, float f) {
        dynamicObjectMapper.h(f);
    }

    private static Method h(long l, long l2) {
        int n = DynamicObjectMapper.e(l, l2);
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
                clazz3 = DynamicObjectMapper.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DynamicObjectMapper.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DynamicObjectMapper.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        DynamicObjectMapper.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DynamicObjectMapper.f(645676239613724L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DynamicObjectMapper.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DynamicObjectMapper.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DynamicObjectMapper.f(645676239613724L, 0L);
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

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DynamicObjectMapper.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    static void e(DynamicObjectMapper dynamicObjectMapper) {
        dynamicObjectMapper.U();
    }

    private void Q() {
        this.M.V(null);
    }

    private void j() {
        this.Q.V(null);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DynamicObjectMapper.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    static void N(DynamicObjectMapper dynamicObjectMapper) {
        dynamicObjectMapper.x();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public DynamicObjectMapper() {
        block59: {
            block63: {
                block60: {
                    block55: {
                        block58: {
                            block56: {
                                block57: {
                                    block53: {
                                        block54: {
                                            block52: {
                                                block50: {
                                                    block51: {
                                                        block48: {
                                                            block49: {
                                                                var1_1 = DynamicObjectMapper.c ^ 92467238254069L;
                                                                v0 = SecureResourceManager.w();
                                                                super(ReflectionMetadataResolver.ru);
                                                                var3_2 = v0;
                                                                try {
                                                                    try {
                                                                        v1 = GameVersionEnumerator.MC_1_21_6.H();
                                                                        if (var3_2 != null) break block48;
                                                                        if (v1 == 0) break block49;
                                                                    }
                                                                    catch (CustomSystemException v2) {
                                                                        throw DynamicObjectMapper.a(v2);
                                                                    }
                                                                    this.u = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)18326, (long)(2632226169691644689L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE}, (long)-6298854043773430234L, (long)var1_1);
                                                                }
                                                                catch (CustomSystemException v3) {
                                                                    throw DynamicObjectMapper.a(v3);
                                                                }
                                                            }
                                                            v1 = GameVersionEnumerator.MC_1_21_10.H();
                                                        }
                                                        try {
                                                            try {
                                                                if (var3_2 != null) break block50;
                                                                if (v1 == 0) break block51;
                                                            }
                                                            catch (CustomSystemException v4) {
                                                                throw DynamicObjectMapper.a(v4);
                                                            }
                                                            this.X = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)7571, (long)(7393384729008404780L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)false, Integer.TYPE, (Object)new Class[]{Integer.TYPE}, (long)-6298854043773430234L, (long)var1_1);
                                                        }
                                                        catch (CustomSystemException v5) {
                                                            throw DynamicObjectMapper.a(v5);
                                                        }
                                                    }
                                                    v1 = GeometryCalculator.C();
                                                }
                                                try {
                                                    try {
                                                        if (var3_2 != null) break block52;
                                                        if (v1 >= 37) {
                                                        }
                                                        ** GOTO lbl66
                                                    }
                                                    catch (CustomSystemException v6) {
                                                        throw DynamicObjectMapper.a(v6);
                                                    }
                                                    this.L = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)11780, (long)(8665374733553060493L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{Integer.TYPE}, (long)-6298854043773430234L, (long)var1_1);
                                                    this.J = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)1755, (long)(4232979005144130137L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{Boolean.TYPE}, (long)-6298854043773430234L, (long)var1_1);
                                                    this.k = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)26239, (long)(4467830725394137840L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[0], (long)-6298854043773430234L, (long)var1_1);
                                                    this.F = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)7112, (long)(2793477915819736955L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[0], (long)-6298854043773430234L, (long)var1_1);
                                                    this.I = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)22853, (long)(2671773232212524527L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[0], (long)-6298854043773430234L, (long)var1_1);
                                                    this.o = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)17136, (long)(6528880682772506198L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[0], (long)-6298854043773430234L, (long)var1_1);
                                                    v1 = (int)GameVersionEnumerator.MC_1_21_6.Q();
                                                }
                                                catch (CustomSystemException v7) {
                                                    throw DynamicObjectMapper.a(v7);
                                                }
                                            }
                                            try {
                                                try {
                                                    try {
                                                        if (var3_2 != null) break block53;
                                                        if (v1 == 0) break block54;
                                                    }
                                                    catch (CustomSystemException v8) {
                                                        throw DynamicObjectMapper.a(v8);
                                                    }
                                                    this.q = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)27420, (long)(7098924257284853688L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE}, (long)-6298854043773430234L, (long)var1_1);
                                                    if (var3_2 == null) break block54;
                                                }
                                                catch (CustomSystemException v9) {
                                                    throw DynamicObjectMapper.a(v9);
                                                }
lbl66:
                                                // 2 sources

                                                this.P = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)20801, (long)(947993618068747727L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE, Float.TYPE}, (long)-6298854043773430234L, (long)var1_1);
                                                this.Q = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)26741, (long)(3591342903116893378L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-6298854043773430234L, (long)var1_1);
                                                this.L = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)22642, (long)(3098040821203156190L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE}, (long)-6298854043773430234L, (long)var1_1);
                                                this.a = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)1683, (long)(2152565606625567254L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-6298854043773430234L, (long)var1_1);
                                                this.M = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)2488, (long)(2058741730504535337L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-6298854043773430234L, (long)var1_1);
                                                this.J = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)9310, (long)(4159655327064211677L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Boolean.TYPE}, (long)-6298854043773430234L, (long)var1_1);
                                                this.k = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)12691, (long)(7298737833879000380L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-6298854043773430234L, (long)var1_1);
                                                this.F = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)25715, (long)(3809429807542272235L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-6298854043773430234L, (long)var1_1);
                                                this.I = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)31166, (long)(1345502221043342597L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-6298854043773430234L, (long)var1_1);
                                                this.o = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)20554, (long)(1174163899307832545L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-6298854043773430234L, (long)var1_1);
                                            }
                                            catch (CustomSystemException v10) {
                                                throw DynamicObjectMapper.a(v10);
                                            }
                                        }
                                        v1 = GeometryCalculator.C();
                                    }
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v11 = 37;
                                                    if (var3_2 != null) break block55;
                                                    if (v1 >= v11) {
                                                    }
                                                    ** GOTO lbl134
                                                }
                                                catch (CustomSystemException v12) {
                                                    throw DynamicObjectMapper.a(v12);
                                                }
                                                this.v = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)15898, (long)(3530455583409396360L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, (long)-6298854043773430234L, (long)var1_1);
                                                this.E = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)5476, (long)(4419549396362555861L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[0], (long)-6298854043773430234L, (long)var1_1);
                                                this.r = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)30505, (long)(7901992791162655653L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[0], (long)-6298854043773430234L, (long)var1_1);
                                                v13 = GeometryCalculator.C();
                                                if (var3_2 != null) break block56;
                                            }
                                            catch (CustomSystemException v14) {
                                                throw DynamicObjectMapper.a(v14);
                                            }
                                            if (v13 >= 50) break block57;
                                        }
                                        catch (CustomSystemException v15) {
                                            throw DynamicObjectMapper.a(v15);
                                        }
                                        this.w = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)30665, (long)(118121664297997145L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[0], (long)-6298854043773430234L, (long)var1_1);
                                        this.B = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)15132, (long)(389188347264065452L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[0], (long)-6298854043773430234L, (long)var1_1);
                                    }
                                    catch (CustomSystemException v16) {
                                        throw DynamicObjectMapper.a(v16);
                                    }
                                }
                                try {
                                    this.b = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)4691, (long)(5439878182766114510L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)false, Integer.TYPE, (long)-6298943184142918728L, (long)var1_1);
                                    this.W = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)13387, (long)(2215967451509674220L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)false, (Object)ReflectionMetadataResolver.FA, (long)-6298943184142918728L, (long)var1_1);
                                    this.g = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)17965, (long)(6310284872614781584L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)false, ContextualReflectionUtility.S(ReflectionMetadataResolver.Yl), (long)-6298943184142918728L, (long)var1_1);
                                    this.V = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)14123, (long)(8712366647321154464L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{Integer.TYPE}, (long)-6298854043773430234L, (long)var1_1);
                                    this.t = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)2265, (long)(5236099412860038264L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, (long)-6298854043773430234L, (long)var1_1);
                                    if (var3_2 != null) break block58;
                                    v13 = (int)GameVersionEnumerator.MC_1_21_10.Q();
                                }
                                catch (CustomSystemException v17) {
                                    throw DynamicObjectMapper.a(v17);
                                }
                            }
                            try {
                                if (v13 != 0) {
                                    this.T = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)12681, (long)(8236302753999213840L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, IntBuffer.class}, (long)-6298854043773430234L, (long)var1_1);
                                }
                            }
                            catch (CustomSystemException v18) {
                                throw DynamicObjectMapper.a(v18);
                            }
                            this.O = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)6975, (long)(5821763343342862217L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)false, Integer.TYPE, (Object)new Class[0], (long)-6298854043773430234L, (long)var1_1);
                        }
                        try {
                            try {
                                if (var3_2 == null) break block59;
lbl134:
                                // 2 sources

                                v1 = GeometryCalculator.C();
                                if (var3_2 != null) break block60;
                            }
                            catch (CustomSystemException v19) {
                                throw DynamicObjectMapper.a(v19);
                            }
                            v11 = 35;
                        }
                        catch (CustomSystemException v20) {
                            throw DynamicObjectMapper.a(v20);
                        }
                    }
                    try {
                        block61: {
                            try {
                                if (v1 < v11) break block61;
                                this.v = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)16433, (long)(352999345843971257L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, (long)-6298854043773430234L, (long)var1_1);
                                this.n = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)31785, (long)(3084773395556145307L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-6298854043773430234L, (long)var1_1);
                                this.E = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)27779, (long)(7577445710005176383L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-6298854043773430234L, (long)var1_1);
                                this.r = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)25809, (long)(6442710537633562729L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-6298854043773430234L, (long)var1_1);
                                this.Z = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)19353, (long)(4676812152043810605L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-6298854043773430234L, (long)var1_1);
                                this.w = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)3971, (long)(7292400190791281465L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-6298854043773430234L, (long)var1_1);
                                this.B = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)12569, (long)(7344347087914587580L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-6298854043773430234L, (long)var1_1);
                                this.S = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)29232, (long)(6436440260442298023L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, (long)-6298854043773430234L, (long)var1_1);
                                this.b = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)11589, (long)(2525403386113051109L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-6298943184142918728L, (long)var1_1);
                                this.W = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)28216, (long)(2328506400008276653L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.FA, (long)-6298943184142918728L, (long)var1_1);
                                this.g = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)15382, (long)(595364347020925058L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, ContextualReflectionUtility.S(ReflectionMetadataResolver.Yl), (long)-6298943184142918728L, (long)var1_1);
                                this.V = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)15231, (long)(2960292583421992924L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE}, (long)-6298854043773430234L, (long)var1_1);
                                this.t = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)23054, (long)(6066551605285895822L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, (long)-6298854043773430234L, (long)var1_1);
                                this.T = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)99, (long)(3748661760350250177L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, IntBuffer.class}, (long)-6298854043773430234L, (long)var1_1);
                                this.O = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)6164, (long)(7923966538429234362L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[0], (long)-6298854043773430234L, (long)var1_1);
                                if (var3_2 == null) break block59;
                            }
                            catch (CustomSystemException v21) {
                                throw DynamicObjectMapper.a(v21);
                            }
                        }
                        v1 = (int)TemporalMetadataResolver.h.d();
                    }
                    catch (CustomSystemException v22) {
                        throw DynamicObjectMapper.a(v22);
                    }
                }
                try {
                    block62: {
                        try {
                            if (v1 == 0) break block62;
                            this.v = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)42, (long)(1169930817527178417L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, (long)-6298854043773430234L, (long)var1_1);
                            if (var3_2 == null) break block63;
                        }
                        catch (CustomSystemException v23) {
                            throw DynamicObjectMapper.a(v23);
                        }
                    }
                    this.v = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)2552, (long)(1616306978919673188L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Void.TYPE, (Object)new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, (long)-6298854043773430234L, (long)var1_1);
                }
                catch (CustomSystemException v24) {
                    throw DynamicObjectMapper.a(v24);
                }
            }
            this.n = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)3624, (long)(3451874976249342626L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-6298854043773430234L, (long)var1_1);
            this.E = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)18816, (long)(1108296698145353001L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-6298854043773430234L, (long)var1_1);
            this.r = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)8054, (long)(4386122395082128350L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-6298854043773430234L, (long)var1_1);
            this.Z = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)9094, (long)(5636529108475987775L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-6298854043773430234L, (long)var1_1);
            this.w = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)7074, (long)(7177179759838822159L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-6298854043773430234L, (long)var1_1);
            this.B = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)5011, (long)(2077188811443500800L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-6298854043773430234L, (long)var1_1);
            this.S = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)26979, (long)(2000018805014924773L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, (long)-6298854043773430234L, (long)var1_1);
            this.b = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)22973, (long)(4441392651659853104L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-6298943184142918728L, (long)var1_1);
            this.W = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)2506, (long)(4655046758627306832L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.FA, (long)-6298943184142918728L, (long)var1_1);
            this.g = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)21344, (long)(2660895624655583222L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, ContextualReflectionUtility.S(ReflectionMetadataResolver.Yl), (long)-6298943184142918728L, (long)var1_1);
            this.V = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)32287, (long)(7345215416981658267L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE}, (long)-6298854043773430234L, (long)var1_1);
            this.t = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)952, (long)(4558013955628492550L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, (long)-6298854043773430234L, (long)var1_1);
            this.O = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)6139, (long)(1890335692226327374L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[0], (long)-6298854043773430234L, (long)var1_1);
            this.p = DynamicObjectMapper.c("\u00f1", (Object)this, (Object)DynamicObjectMapper.c("\u00db", (int)DynamicObjectMapper.b("o", (int)29709, (long)(3598294743653027980L ^ var1_1)), (long)-6299357027983550836L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Float.TYPE}, (long)-6298854043773430234L, (long)var1_1);
        }
        try {
            if (AbstractComputationKernel.J() != null) {
                SecureResourceManager.U("EDVPS");
            }
        }
        catch (CustomSystemException v25) {
            throw DynamicObjectMapper.a(v25);
        }
    }

    private void A(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.v.l(null, bl, bl2, bl3, bl4);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DynamicObjectMapper.e(l, l2);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                DynamicObjectMapper.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void n(int n, int n2, int n3, int n4) {
        this.t.l(null, n, n2, n3, n4);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DynamicObjectMapper.c = MultiContainerRegistry.a(3268451582931705465L, -1254488833812982450L, MethodHandles.lookup().lookupClass()).a(85096470952269L);
                DynamicObjectMapper.h = new Object[13];
                DynamicObjectMapper.i = new String[13];
                DynamicObjectMapper.a();
                DynamicObjectMapper.f = new HashMap<K, V>(13);
                var0 = DynamicObjectMapper.c ^ 58334038901983L;
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
                var8_3 = new long[62];
                var5_4 = 0;
                var6_5 = "RO\r6%\u0086\u001es\u0088\u0090\u00bf5\u00b6\u00c5]\u00bcr<\u00dbC\u00e3\u00ab\u00a5\u00f6\u00ca\u00b4\u00e5=KY(\u008a\u00d3\u00e9R\u00ca4K\u001am\u009d\u00e9\u00d9\u00e8\\\u00a4\u0092\u0012\u00cb\u00bc\u00b0X6\u00ae\u00c5\u008bg\u00fd\u001d\u00c1&p-hM\u00c2\u00f8Nc\u00a1\u001c\f[=d\u00ea\u00fb\u00f9\u000e\u00c9\u00f2X\u00fcoQf\u009d\u00d2 Y\u00e3\u00ac&z(\u00ba\u0099O\u0091\u00cc\u009b\u001a\u00eb\u00c0\u00e6\u008a\u008e\t\u00b6{t\u0010}\u00ca\u008e\u00edE\u00e3 :\u00ca\u00e2P<\u00a2\u00cd\u0084\u00c3\u0086\u0082\u000e\u0085+}\u00a0\"\u00b66\t<Fr\u00e7\r\u00cfx\u00c5`)$\u00b7\u00abJ\u00bc\u00cd\u00b1\u0096v{\u00b8\u00a4\u00df\u00d2C\u000eR\u0080\u00dcB\u001d\u00e4{\u00d8\u00ebT\u00b2\u00a5\u00f8\u0018\u0084dN\u00ac\u009e\u00b71\u009c\u00c2\u0011[# \u00c3T\u00b3\u0093\u0016\n\u00a6\u00d0u\u00189{\u00a5\u0010\u0017F\u00ff8\u00fa7\u00de\t\u001b\u00eb\u00f6\u00bc\u00ac\u001a\u00ddvz@\f\u00f1\u000f%.\u0015<:J8F\f\u00cbm\u000e!s:\\\u008d\u000b\u00ca\u00b9\u00ec\u00f0'\u008f\u001dC\u0003Z\u0081\u00b8Y\u000f\u00dc\u00fa\u001f|C\u00db|\u008bM:\u009c5\u00f9\u00b1t\u00fd\u0018\u00df\u0018\u0013\u00c7\u00da+\u0001\u00ae\u00bd\u0085C\u00f4q\u00871$\u0002\u00c6mP\u00f8\u00dd\u0081:\u0096\u0083\u00d1\u0090\u008f\u00d5H\u00ce\u0095(\u00f4\u00c3\u0013o\u0091\u00b6Yt\u009f\u000f\u0004\u00da\u00ab9P\u00ed\u00d4\u0098w\u00d3-\u00cb\u0096@\u0092\u00c3\u00f8\u00d7Sx\u009a\u00c0\u008f\u00b0\u00e91\u00d5\u0095\u00f1\u0014v\u00a5\u00aeCFl\u009b\u00b4U!\u0088J)\u00ff\u00eb<Q\u0003X\u00c6\u00cb\u00f6\u00cbg\u009d\u00ae%H\u00a9J\u00e3B\u00d5\u00c4a\u00bd\u007ff\u009cK\u009b\u00c2U\u0017\u0092bt\u00a6\u0090%'\u00cdi\u0001\u00ed\u00beI\u0094\u00bal\u0082\u0082\u00e9\u00acr\u0017^A$m\u009bM\u000e%\u00c6\u0094h\u00ee\u0084\u00a2\u00c0\u000es?\u0087\t\u009cvm0\u0085\u001b\u0087\u00f1Y\r\u00bc\u00a2\u00ae\u0085\u00168\u00e0v\u000b\u00de\u00d7>\u009cy\u00dd\u00b1\u00a5j\u00ebR\u00b74\u00a3\u00de\u0011\u00fa#\u00c7\u0013]2\u0083vr";
                var7_6 = "RO\r6%\u0086\u001es\u0088\u0090\u00bf5\u00b6\u00c5]\u00bcr<\u00dbC\u00e3\u00ab\u00a5\u00f6\u00ca\u00b4\u00e5=KY(\u008a\u00d3\u00e9R\u00ca4K\u001am\u009d\u00e9\u00d9\u00e8\\\u00a4\u0092\u0012\u00cb\u00bc\u00b0X6\u00ae\u00c5\u008bg\u00fd\u001d\u00c1&p-hM\u00c2\u00f8Nc\u00a1\u001c\f[=d\u00ea\u00fb\u00f9\u000e\u00c9\u00f2X\u00fcoQf\u009d\u00d2 Y\u00e3\u00ac&z(\u00ba\u0099O\u0091\u00cc\u009b\u001a\u00eb\u00c0\u00e6\u008a\u008e\t\u00b6{t\u0010}\u00ca\u008e\u00edE\u00e3 :\u00ca\u00e2P<\u00a2\u00cd\u0084\u00c3\u0086\u0082\u000e\u0085+}\u00a0\"\u00b66\t<Fr\u00e7\r\u00cfx\u00c5`)$\u00b7\u00abJ\u00bc\u00cd\u00b1\u0096v{\u00b8\u00a4\u00df\u00d2C\u000eR\u0080\u00dcB\u001d\u00e4{\u00d8\u00ebT\u00b2\u00a5\u00f8\u0018\u0084dN\u00ac\u009e\u00b71\u009c\u00c2\u0011[# \u00c3T\u00b3\u0093\u0016\n\u00a6\u00d0u\u00189{\u00a5\u0010\u0017F\u00ff8\u00fa7\u00de\t\u001b\u00eb\u00f6\u00bc\u00ac\u001a\u00ddvz@\f\u00f1\u000f%.\u0015<:J8F\f\u00cbm\u000e!s:\\\u008d\u000b\u00ca\u00b9\u00ec\u00f0'\u008f\u001dC\u0003Z\u0081\u00b8Y\u000f\u00dc\u00fa\u001f|C\u00db|\u008bM:\u009c5\u00f9\u00b1t\u00fd\u0018\u00df\u0018\u0013\u00c7\u00da+\u0001\u00ae\u00bd\u0085C\u00f4q\u00871$\u0002\u00c6mP\u00f8\u00dd\u0081:\u0096\u0083\u00d1\u0090\u008f\u00d5H\u00ce\u0095(\u00f4\u00c3\u0013o\u0091\u00b6Yt\u009f\u000f\u0004\u00da\u00ab9P\u00ed\u00d4\u0098w\u00d3-\u00cb\u0096@\u0092\u00c3\u00f8\u00d7Sx\u009a\u00c0\u008f\u00b0\u00e91\u00d5\u0095\u00f1\u0014v\u00a5\u00aeCFl\u009b\u00b4U!\u0088J)\u00ff\u00eb<Q\u0003X\u00c6\u00cb\u00f6\u00cbg\u009d\u00ae%H\u00a9J\u00e3B\u00d5\u00c4a\u00bd\u007ff\u009cK\u009b\u00c2U\u0017\u0092bt\u00a6\u0090%'\u00cdi\u0001\u00ed\u00beI\u0094\u00bal\u0082\u0082\u00e9\u00acr\u0017^A$m\u009bM\u000e%\u00c6\u0094h\u00ee\u0084\u00a2\u00c0\u000es?\u0087\t\u009cvm0\u0085\u001b\u0087\u00f1Y\r\u00bc\u00a2\u00ae\u0085\u00168\u00e0v\u000b\u00de\u00d7>\u009cy\u00dd\u00b1\u00a5j\u00ebR\u00b74\u00a3\u00de\u0011\u00fa#\u00c7\u0013]2\u0083vr".length();
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
                    var6_5 = "\u00b9\u00ab\u009b|\u00fd\u00e8]\u0007\u00dd\u00d4R-\u008c\u00f1\u00f6\u009a";
                    var7_6 = "\u00b9\u00ab\u009b|\u00fd\u00e8]\u0007\u00dd\u00d4R-\u008c\u00f1\u00f6\u009a".length();
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
        DynamicObjectMapper.d = var8_3;
        DynamicObjectMapper.e = new Integer[62];
    }

    private void D() {
        this.a.V(null);
    }

    static void Z(DynamicObjectMapper dynamicObjectMapper, boolean bl) {
        dynamicObjectMapper.r(bl);
    }

    private int e() {
        return this.O.R(null, new Object[0]);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void J() {
        this.r.V(null);
    }

    private void R(int n) {
        this.L.l(null, n);
    }

    static void Y(DynamicObjectMapper dynamicObjectMapper, int n, int n2) {
        dynamicObjectMapper.A(n, n2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DynamicObjectMapper.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(DynamicObjectMapper.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

