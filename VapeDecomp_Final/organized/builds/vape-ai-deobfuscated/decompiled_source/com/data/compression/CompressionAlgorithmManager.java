/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 *  org.jetbrains.annotations.Nullable
 */
package com.data.compression;

import a.HK;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.collections.management.MultiContainerRegistry;
import com.concurrency.management.ThreadPoolCoordinator;
import com.core.computation.AbstractComputationKernel;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.google.common.util.concurrent.ListenableFuture;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.reflection.metadata.ReflectionMetadataResolver1493;
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
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CompressionAlgorithmManager
extends CryptoProtocolEngine {
    private final HK D;
    private HK vV;
    private static final long[] gb;
    private final ReflectionUtilityService Y;
    private HK Q;
    private ReflectionUtilityService u;
    private ReflectionUtilityService s;
    private final HK A;
    public ReflectionUtilityService r;
    private static final Integer[] hb;
    @Nullable
    private HK y;
    private static int[] J;
    private final ReflectionUtilityService j;
    private static final Map ib;
    private final ReflectionUtilityService b;
    private ReflectionUtilityService t;
    private ReflectionUtilityService o;
    private static final long bb;
    public ReflectionUtilityService z;
    private final ReflectionUtilityService T;
    private final ReflectionUtilityService vr;
    private static Object G;
    private ReflectionUtilityService p;
    private ReflectionUtilityService C;
    public HK P;
    private final HK i;
    private ReflectionUtilityService F;
    private final ReflectionUtilityService Z;
    private final HK k;
    private final ReflectionUtilityService f;
    private ReflectionUtilityService h;
    private ReflectionUtilityService K;
    private static final String[] pb;
    private ReflectionMetadataResolver1493 v;
    private final ReflectionUtilityService R;
    public final HK H;
    private HK m;
    public HK L;
    private ReflectionUtilityService vQ;
    public final ReflectionUtilityService d;
    private HK O;
    private final ReflectionUtilityService S;
    private final ReflectionUtilityService w;
    private final ReflectionUtilityService vw;
    private ReflectionUtilityService g;
    private final ReflectionUtilityService n;
    private ReflectionUtilityService E;
    private ReflectionMetadataResolver1493 q;
    private final ReflectionUtilityService N;
    private ReflectionUtilityService W;
    private ReflectionUtilityService B;
    private final HK X;
    public final HK I;
    private final ReflectionUtilityService M;
    public final ReflectionUtilityService a;
    public final ReflectionUtilityService e;
    private final ReflectionUtilityService U;
    private ReflectionUtilityService c;
    private static final Object[] ob;
    public HK V;
    public HK vd;

    static void I(CompressionAlgorithmManager compressionAlgorithmManager, Object object, int n) {
        compressionAlgorithmManager.E(object, n);
    }

    static void Q(CompressionAlgorithmManager compressionAlgorithmManager, Object object) {
        compressionAlgorithmManager.y(object);
    }

    static Object f(CompressionAlgorithmManager compressionAlgorithmManager, Object object) {
        return compressionAlgorithmManager.W(object);
    }

    static boolean C(CompressionAlgorithmManager compressionAlgorithmManager, Object object) {
        return compressionAlgorithmManager.t(object);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = CompressionAlgorithmManager.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CompressionAlgorithmManager.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (pb[n4] != null) {
            return n4;
        }
        Object object = ob[n4];
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
                n3 = 22;
                break;
            }
            case 2: {
                n3 = 47;
                break;
            }
            case 3: {
                n3 = 9;
                break;
            }
            case 4: {
                n3 = 63;
                break;
            }
            case 5: {
                n3 = 57;
                break;
            }
            case 6: {
                n3 = 20;
                break;
            }
            case 7: {
                n3 = 26;
                break;
            }
            case 8: {
                n3 = 25;
                break;
            }
            case 9: {
                n3 = 16;
                break;
            }
            case 10: {
                n3 = 33;
                break;
            }
            case 11: {
                n3 = 27;
                break;
            }
            case 12: {
                n3 = 59;
                break;
            }
            case 13: {
                n3 = 12;
                break;
            }
            case 14: {
                n3 = 56;
                break;
            }
            case 15: {
                n3 = 8;
                break;
            }
            case 16: {
                n3 = 4;
                break;
            }
            case 17: {
                n3 = 7;
                break;
            }
            case 18: {
                n3 = 17;
                break;
            }
            case 19: {
                n3 = 36;
                break;
            }
            case 20: {
                n3 = 39;
                break;
            }
            case 21: {
                n3 = 28;
                break;
            }
            case 22: {
                n3 = 38;
                break;
            }
            case 23: {
                n3 = 32;
                break;
            }
            case 24: {
                n3 = 51;
                break;
            }
            case 25: {
                n3 = 5;
                break;
            }
            case 26: {
                n3 = 30;
                break;
            }
            case 27: {
                n3 = 62;
                break;
            }
            case 28: {
                n3 = 13;
                break;
            }
            case 29: {
                n3 = 34;
                break;
            }
            case 30: {
                n3 = 15;
                break;
            }
            case 31: {
                n3 = 54;
                break;
            }
            case 32: {
                n3 = 11;
                break;
            }
            case 33: {
                n3 = 46;
                break;
            }
            case 34: {
                n3 = 14;
                break;
            }
            case 35: {
                n3 = 29;
                break;
            }
            case 36: {
                n3 = 10;
                break;
            }
            case 37: {
                n3 = 0;
                break;
            }
            case 38: {
                n3 = 19;
                break;
            }
            case 39: {
                n3 = 37;
                break;
            }
            case 40: {
                n3 = 55;
                break;
            }
            case 41: {
                n3 = 24;
                break;
            }
            case 42: {
                n3 = 61;
                break;
            }
            case 43: {
                n3 = 18;
                break;
            }
            case 44: {
                n3 = 43;
                break;
            }
            case 45: {
                n3 = 23;
                break;
            }
            case 46: {
                n3 = 6;
                break;
            }
            case 47: {
                n3 = 3;
                break;
            }
            case 48: {
                n3 = 52;
                break;
            }
            case 49: {
                n3 = 44;
                break;
            }
            case 50: {
                n3 = 49;
                break;
            }
            case 51: {
                n3 = 2;
                break;
            }
            case 52: {
                n3 = 1;
                break;
            }
            case 53: {
                n3 = 31;
                break;
            }
            case 54: {
                n3 = 60;
                break;
            }
            case 55: {
                n3 = 42;
                break;
            }
            case 56: {
                n3 = 35;
                break;
            }
            case 57: {
                n3 = 48;
                break;
            }
            case 58: {
                n3 = 40;
                break;
            }
            case 59: {
                n3 = 58;
                break;
            }
            case 60: {
                n3 = 53;
                break;
            }
            case 61: {
                n3 = 50;
                break;
            }
            case 62: {
                n3 = 41;
                break;
            }
            default: {
                n3 = 45;
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
        CompressionAlgorithmManager.pb[n4] = new String(cArray);
        return n4;
    }

    public Object p(Object object) {
        return this.b.Z(object);
    }

    public Object F(Object object) {
        return this.e.Z(object);
    }

    private void y(Object object) {
        this.I.V(object);
    }

    static Object u(CompressionAlgorithmManager compressionAlgorithmManager, Object object) {
        return compressionAlgorithmManager.P(object);
    }

    static HK J(CompressionAlgorithmManager compressionAlgorithmManager) {
        return compressionAlgorithmManager.O;
    }

    public Object Q(Object object) {
        return this.a.Z(object);
    }

    static boolean z(CompressionAlgorithmManager compressionAlgorithmManager, Object object) {
        return compressionAlgorithmManager.a(object);
    }

    private Object c(Object object) {
        return this.N.Z(object);
    }

    static Object J(CompressionAlgorithmManager compressionAlgorithmManager, Object object) {
        return compressionAlgorithmManager.C(object);
    }

    static Object H(CompressionAlgorithmManager compressionAlgorithmManager, Object object) {
        return compressionAlgorithmManager.N(object);
    }

    private static CustomSystemException c(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private void i(Object object, boolean bl) {
        this.o.B(object, bl);
    }

    public Object i(Object object) {
        return this.M.Z(object);
    }

    private void H(Object object, int n) {
        this.u.t(object, n);
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

    private Object B(Object object) {
        return this.c.Z(object);
    }

    static void s(CompressionAlgorithmManager compressionAlgorithmManager, Object object) {
        compressionAlgorithmManager.w(object);
    }

    private void Y(Object object) {
        this.y.V(object);
    }

    public Object g(Object object) {
        return this.k.T(object, new Object[0]);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CompressionAlgorithmManager.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CompressionAlgorithmManager.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private void N(Object object, Object object2) {
        this.N.L(object, object2);
    }

    public void c(Object object) {
        try {
            if (GeometryCalculator.C() >= 35) {
                this.k(object, true);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CompressionAlgorithmManager.c(customSystemException);
        }
        this.m.V(object);
    }

    public Object R(Object object) {
        return this.D.T(object, new Object[0]);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x77FD;
        if (hb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = gb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])ib.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    ib.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/vE", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CompressionAlgorithmManager.hb[n2] = n3;
        }
        return hb[n2];
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'A' || c == 'G' || c == 't' || c == 'B') {
                field = CompressionAlgorithmManager.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'A' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'G' ? lookup.findSetter(clazz, string2, clazz2) : (c == 't' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CompressionAlgorithmManager.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'S' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public boolean u(Object object) {
        return this.Z.R(object);
    }

    private void Y(Object object, Runnable runnable) {
        block3: {
            block2: {
                try {
                    if (GeometryCalculator.C() < 35) break block2;
                    this.O.l(object, runnable);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw CompressionAlgorithmManager.c(customSystemException);
                }
            }
            this.O.T(object, runnable);
        }
    }

    public Object X(Object object) {
        return this.A.T(object, new Object[0]);
    }

    static int Q(CompressionAlgorithmManager compressionAlgorithmManager, Object object) {
        return compressionAlgorithmManager.H(object);
    }

    private boolean t(Object object) {
        return this.o.R(object);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public Object D(Object object) {
        return this.s.Z(object);
    }

    private Object k(Object object) {
        return this.B.Z(object);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CompressionAlgorithmManager.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    static void n(CompressionAlgorithmManager compressionAlgorithmManager, Object object, int n) {
        compressionAlgorithmManager.H(object, n);
    }

    public Object H(Object object) {
        return this.S.Z(object);
    }

    public Object J(Object object) {
        return this.X.T(object, new Object[0]);
    }

    private int v(Object object) {
        return this.u.R(object);
    }

    static Object P(CompressionAlgorithmManager compressionAlgorithmManager, Object object) {
        return compressionAlgorithmManager.L(object);
    }

    private Object K(Object object) {
        return this.h.Z(object);
    }

    public void l(Object object, Object object2) {
        this.f.L(object, object2);
    }

    static void r(CompressionAlgorithmManager compressionAlgorithmManager, Object object, boolean bl) {
        compressionAlgorithmManager.k(object, bl);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CompressionAlgorithmManager.e(l, l2);
            object = ob[n];
            try {
                if (!(object instanceof String)) break block2;
                CompressionAlgorithmManager.ob[n] = clazz = Class.forName(pb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    static Object b(CompressionAlgorithmManager compressionAlgorithmManager, Object object) {
        return compressionAlgorithmManager.B(object);
    }

    public int j(Object object) {
        return this.K.R(object);
    }

    public int l(Object object) {
        return this.p.R(object);
    }

    private Object N(Object object) {
        return this.r.Z(object);
    }

    static Object d(CompressionAlgorithmManager compressionAlgorithmManager, Object object) {
        return compressionAlgorithmManager.c(object);
    }

    private void w(Object object) {
        try {
            if (GeometryCalculator.C() >= 35) {
                ApplicationLifecycleManager.k().L();
                ConnectionPoolOrchestrator1192.o();
                this.k(object, false);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CompressionAlgorithmManager.c(customSystemException);
        }
        this.Q.V(object);
    }

    static Object n(CompressionAlgorithmManager compressionAlgorithmManager, Object object) {
        return compressionAlgorithmManager.k(object);
    }

    public void f(Object object, Object object2) {
        this.w.L(object, object2);
    }

    private static Field g(long l, long l2) {
        int n = CompressionAlgorithmManager.e(l, l2);
        Object object = ob[n];
        if (object instanceof String) {
            String string = pb[n];
            int n2 = string.indexOf(8);
            Class clazz = CompressionAlgorithmManager.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CompressionAlgorithmManager.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CompressionAlgorithmManager.c(clazz3, string2, clazz2)) != null) {
                    CompressionAlgorithmManager.ob[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CompressionAlgorithmManager.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CompressionAlgorithmManager.ob[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CompressionAlgorithmManager.f(990601370327120L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public Object b(Object object) {
        try {
            if (GeometryCalculator.C() >= 50) {
                return this.vV.T(object, new Object[0]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CompressionAlgorithmManager.c(customSystemException);
        }
        return this.vQ.Z(object);
    }

    private static Method h(long l, long l2) {
        int n = CompressionAlgorithmManager.e(l, l2);
        Object object = ob[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = pb[n];
                int n3 = string2.indexOf(8);
                clazz3 = CompressionAlgorithmManager.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CompressionAlgorithmManager.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CompressionAlgorithmManager.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        CompressionAlgorithmManager.ob[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CompressionAlgorithmManager.f(990601370327120L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CompressionAlgorithmManager.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CompressionAlgorithmManager.ob[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CompressionAlgorithmManager.f(990601370327120L, 0L);
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

    static Object S(CompressionAlgorithmManager compressionAlgorithmManager, Object object) {
        return compressionAlgorithmManager.r(object);
    }

    private void E(Object object, int n) {
        this.vw.t(object, n);
    }

    static Object a(CompressionAlgorithmManager compressionAlgorithmManager, Object object) {
        return compressionAlgorithmManager.K(object);
    }

    private boolean a(Object object) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.E.R(object) || this.W.Z(object) == null) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CompressionAlgorithmManager.c(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw CompressionAlgorithmManager.c(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public static int[] U() {
        return J;
    }

    public Object f(Object object) {
        return this.w.Z(object);
    }

    static void U(CompressionAlgorithmManager compressionAlgorithmManager, Object object, Object object2) {
        compressionAlgorithmManager.N(object, object2);
    }

    public static void Z(int[] nArray) {
        J = nArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CompressionAlgorithmManager.bb = MultiContainerRegistry.a(-8426869005253709350L, 6303109106742500480L, MethodHandles.lookup().lookupClass()).a(196596611908511L);
                CompressionAlgorithmManager.ob = new Object[23];
                CompressionAlgorithmManager.pb = new String[23];
                CompressionAlgorithmManager.a();
                CompressionAlgorithmManager.ib = new HashMap<K, V>(13);
                var0 = CompressionAlgorithmManager.bb ^ 48215775312283L;
                CompressionAlgorithmManager.Z(null);
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
                var8_3 = new long[76];
                var5_4 = 0;
                var6_5 = "\u00dc\u00a9\u00e5\u0098\u0084I\u00bb`\u00a5\u00b8\u008f\u00b3\u00e7V\u0010\u0012\u00bd7\u0085\u001a\u0089\u00ad\u0011Y_G\u001c\u00d1\u00c1'ut\u00f4\u009a7\u00bf\u00a3\u00b5\u00dbv\u00da?\u00c0R\u00bb\u00deX}d\u001b,V\u00a5\u0088\u00banW\u00fcY1hQ\u00e4X\u00d7\u0004\u00e7rO\u007f\u00f2z\u00f4t\u00ee\u0005\u00de\u001d\u00b5Q\u0098\u0092\u0002l\u0080\u0085X\tr\n\f)F\u00cd\u008f\u00f5<\u0001\u001f^\u00d0\u0099|\u00a0\u00ca\u0087\u00c7\u0096\u00b0r\u00c2\u009f\u0004>\u009b\u00e5\u0081\u0011#\f\u00d0\n\u0098\u0094\u001c\u001dG<`N,S\u0007\u00d7\u0006\u00f9A\u00af?\u00ba\u001a\u001f\u0003|[\u00dd\u0015\u009a\u00f5\u001b\u00bf7Ku\u0005@\u009f\u00a4\u00c6\u009b4\u0005f\u00f4O>\u009b\u00d74\u0097\u0014\u0080\u00a9\u00dc\t\u008e\u00ca\u00cao\u00b7\u0083\u00fc\u009eb\u00ef\u00f1\u00f3\u009cpF\u00bf\u00f1\u00da\u00f4\u00d3\r\\f\u0012,R\u00cb\u00f8~\"'\u00bb9\u00b9\u000fw\u00f3\u00fe\u00f6|\u007f\u009f#\u0005\u00c1\u0018C^\u0098lar\u00f5\u00e7\u00c8\u00ac+m\u00cb\u00f4\u0085\u0081\u00a8\u008a\u00df\u00fb\u00bdRZ\u00b2\b9_a$\u00f6$l\u00db\u00db\u00ed>\u00dc\n\u00c3[\u009c\u001b\u00b7KE\u0095\u0019;\u00b1\u009b\u0004\u00ca#\u00f2\u0011\u00b1\u009d\u00f5\u00b4\u008b\u0015\u0098\u00b1#\u00ea\u001b\u00de\u00db\u0082\u001d^\u00c2z\u0019\u0003\u00d9q\u00a4\u00a8h\u0089\u0094\u00f7\u00b1\u00c2\u0017\u0014\u00ca\u00ee=\u0098vFF\u0093\u0086\u00c3\u00e2\u00d9{\u00a2\u00a6\u001bu\"\u0092\u00b3\u00c0\u00ffN*V\u00f4?\u00c1\u008c\r\u009d\u00905\u0085\u00d0\u00f9(\u00dc\u00f5q\u00c3\u00bbH\u0098!'>\u0013V{#\u00f4\u00cf\u0098\u00c6MB\u009b}\u00f5\u00df\u007f\u00e4T\u000bP\u00c7c\u000e*U\u00c7\u00ca\\\u0013\u00fc\u00da%\u00a84;\u00f8\u00a1\u00c7P4\u0002\u009bb\u000bz\u0097\u00c5?8K\u00bc\u00bfe\u009c-/\u00b3\u00ee-J)\u00c0~\fE!~\u00d4\u00f9\u00ec\n\r\u00e5o\u00d2y\rt\u00c1\nO(K\u000f\u00f0;\u0092W\u0010\u0001\u00d4\u009c\u00a8\u00f6\u008d\u00fd\u0084\u00a0b=\u00b0\u00fd \u0098g<\u00c3N\u008e]\u001f\bs\u00bb\u0015\u0017\u00f1\u00c7\u00e1/\u0097q\u00b5R\u0017\u0014Mf\u00ca\u0093\u00a5\u00c8bT\u0002H\u00a8\u001a7i\u00c2\u0004\u00f9\u0001\u00ca\u00ff\u00b2s\u00c8\u008fVP\u00f9R\u00dd~E\u0015-\u008a\u00ad*\u0095\u00b7\u00d8\u00d1\u00e0^\u0087\u007f\u0080o\u001e\u00c7y)X\u00c7-\u00beN>%\u0090\u0000\u00d7G\u00e1A\u001ca\u00b8\u00c1\u00c8\u001f0\u00df\u00eb\u00c5\u00ab&B\u00009)T\u00a0\u0088@|\u0001\u00af\u00e7\u00ca\u00cb\u0096r\u00bc\u007f\u00dfU\u00aaE\u00db~\u00faB-S\u0095\n\u0091\u0091F\u00f9\u00b6U\u008a";
                var7_6 = "\u00dc\u00a9\u00e5\u0098\u0084I\u00bb`\u00a5\u00b8\u008f\u00b3\u00e7V\u0010\u0012\u00bd7\u0085\u001a\u0089\u00ad\u0011Y_G\u001c\u00d1\u00c1'ut\u00f4\u009a7\u00bf\u00a3\u00b5\u00dbv\u00da?\u00c0R\u00bb\u00deX}d\u001b,V\u00a5\u0088\u00banW\u00fcY1hQ\u00e4X\u00d7\u0004\u00e7rO\u007f\u00f2z\u00f4t\u00ee\u0005\u00de\u001d\u00b5Q\u0098\u0092\u0002l\u0080\u0085X\tr\n\f)F\u00cd\u008f\u00f5<\u0001\u001f^\u00d0\u0099|\u00a0\u00ca\u0087\u00c7\u0096\u00b0r\u00c2\u009f\u0004>\u009b\u00e5\u0081\u0011#\f\u00d0\n\u0098\u0094\u001c\u001dG<`N,S\u0007\u00d7\u0006\u00f9A\u00af?\u00ba\u001a\u001f\u0003|[\u00dd\u0015\u009a\u00f5\u001b\u00bf7Ku\u0005@\u009f\u00a4\u00c6\u009b4\u0005f\u00f4O>\u009b\u00d74\u0097\u0014\u0080\u00a9\u00dc\t\u008e\u00ca\u00cao\u00b7\u0083\u00fc\u009eb\u00ef\u00f1\u00f3\u009cpF\u00bf\u00f1\u00da\u00f4\u00d3\r\\f\u0012,R\u00cb\u00f8~\"'\u00bb9\u00b9\u000fw\u00f3\u00fe\u00f6|\u007f\u009f#\u0005\u00c1\u0018C^\u0098lar\u00f5\u00e7\u00c8\u00ac+m\u00cb\u00f4\u0085\u0081\u00a8\u008a\u00df\u00fb\u00bdRZ\u00b2\b9_a$\u00f6$l\u00db\u00db\u00ed>\u00dc\n\u00c3[\u009c\u001b\u00b7KE\u0095\u0019;\u00b1\u009b\u0004\u00ca#\u00f2\u0011\u00b1\u009d\u00f5\u00b4\u008b\u0015\u0098\u00b1#\u00ea\u001b\u00de\u00db\u0082\u001d^\u00c2z\u0019\u0003\u00d9q\u00a4\u00a8h\u0089\u0094\u00f7\u00b1\u00c2\u0017\u0014\u00ca\u00ee=\u0098vFF\u0093\u0086\u00c3\u00e2\u00d9{\u00a2\u00a6\u001bu\"\u0092\u00b3\u00c0\u00ffN*V\u00f4?\u00c1\u008c\r\u009d\u00905\u0085\u00d0\u00f9(\u00dc\u00f5q\u00c3\u00bbH\u0098!'>\u0013V{#\u00f4\u00cf\u0098\u00c6MB\u009b}\u00f5\u00df\u007f\u00e4T\u000bP\u00c7c\u000e*U\u00c7\u00ca\\\u0013\u00fc\u00da%\u00a84;\u00f8\u00a1\u00c7P4\u0002\u009bb\u000bz\u0097\u00c5?8K\u00bc\u00bfe\u009c-/\u00b3\u00ee-J)\u00c0~\fE!~\u00d4\u00f9\u00ec\n\r\u00e5o\u00d2y\rt\u00c1\nO(K\u000f\u00f0;\u0092W\u0010\u0001\u00d4\u009c\u00a8\u00f6\u008d\u00fd\u0084\u00a0b=\u00b0\u00fd \u0098g<\u00c3N\u008e]\u001f\bs\u00bb\u0015\u0017\u00f1\u00c7\u00e1/\u0097q\u00b5R\u0017\u0014Mf\u00ca\u0093\u00a5\u00c8bT\u0002H\u00a8\u001a7i\u00c2\u0004\u00f9\u0001\u00ca\u00ff\u00b2s\u00c8\u008fVP\u00f9R\u00dd~E\u0015-\u008a\u00ad*\u0095\u00b7\u00d8\u00d1\u00e0^\u0087\u007f\u0080o\u001e\u00c7y)X\u00c7-\u00beN>%\u0090\u0000\u00d7G\u00e1A\u001ca\u00b8\u00c1\u00c8\u001f0\u00df\u00eb\u00c5\u00ab&B\u00009)T\u00a0\u0088@|\u0001\u00af\u00e7\u00ca\u00cb\u0096r\u00bc\u007f\u00dfU\u00aaE\u00db~\u00faB-S\u0095\n\u0091\u0091F\u00f9\u00b6U\u008a".length();
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
                    var6_5 = "\u00abN\u00fe\u00e7\u001b\u00c1\u00e5\u00f96\t\u00cb\u00b2\u00a3>\u00b4\u00d9";
                    var7_6 = "\u00abN\u00fe\u00e7\u001b\u00c1\u00e5\u00f96\t\u00cb\u00b2\u00a3>\u00b4\u00d9".length();
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
        CompressionAlgorithmManager.gb = var8_3;
        CompressionAlgorithmManager.hb = new Integer[76];
    }

    public Object n(Object object) {
        return this.z.Z(object);
    }

    private Object r(Object object) {
        return this.vr.Z(object);
    }

    static void k(CompressionAlgorithmManager compressionAlgorithmManager, Object object) {
        compressionAlgorithmManager.Y(object);
    }

    public Object Y(Object object) {
        try {
            if (G == null) {
                G = this.j.Z(object);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CompressionAlgorithmManager.c(customSystemException);
        }
        return G;
    }

    public void u(Object object, Object object2) {
        this.U.L(object, object2);
    }

    private Object V(Object object) {
        return this.d.Z(object);
    }

    private Object C(Object object) {
        return this.n.Z(object);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/vE" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static void F(CompressionAlgorithmManager compressionAlgorithmManager, Object object, boolean bl) {
        compressionAlgorithmManager.i(object, bl);
    }

    private Object L(Object object) {
        return this.t.Z(object);
    }

    public void P(Object object, int n) {
        this.K.t(object, n);
    }

    /*
     * Unable to fully structure code
     */
    public CompressionAlgorithmManager() {
        block95: {
            block94: {
                block92: {
                    block93: {
                        block91: {
                            block89: {
                                block88: {
                                    block85: {
                                        block86: {
                                            block83: {
                                                block84: {
                                                    block82: {
                                                        block80: {
                                                            block81: {
                                                                block78: {
                                                                    block73: {
                                                                        block77: {
                                                                            block75: {
                                                                                block70: {
                                                                                    block71: {
                                                                                        block72: {
                                                                                            var1_1 = CompressionAlgorithmManager.bb ^ 86155412616183L;
                                                                                            v0 = CompressionAlgorithmManager.U();
                                                                                            super(ReflectionMetadataResolver.FF);
                                                                                            var3_2 = v0;
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                v1 = GeometryCalculator.C();
                                                                                                                v2 = 13;
                                                                                                                if (var3_2 != null) break block70;
                                                                                                                if (v1 == v2) {
                                                                                                                }
                                                                                                                ** GOTO lbl47
                                                                                                            }
                                                                                                            catch (CustomSystemException v3) {
                                                                                                                throw CompressionAlgorithmManager.c(v3);
                                                                                                            }
                                                                                                            this.a = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)31178, (long)(8722157773345064690L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Fm, (long)-8588037589365406029L, (long)var1_1);
                                                                                                            if (var3_2 != null) break block71;
                                                                                                        }
                                                                                                        catch (CustomSystemException v4) {
                                                                                                            throw CompressionAlgorithmManager.c(v4);
                                                                                                        }
                                                                                                        if (!TemporalMetadataResolver.h.d()) break block72;
                                                                                                    }
                                                                                                    catch (CustomSystemException v5) {
                                                                                                        throw CompressionAlgorithmManager.c(v5);
                                                                                                    }
                                                                                                    this.z = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)1012, (long)(639244770624175320L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.ts, (long)-8588037589365406029L, (long)var1_1);
                                                                                                    this.P = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)19221, (long)(8318769417622565951L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-8586514070438494798L, (long)var1_1);
                                                                                                    this.I = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)14902, (long)(118789719759373620L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-8586514070438494798L, (long)var1_1);
                                                                                                    this.V = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)6727, (long)(2411642539411400020L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Boolean.TYPE}, (long)-8586514070438494798L, (long)var1_1);
                                                                                                    if (var3_2 == null) break block73;
                                                                                                }
                                                                                                catch (CustomSystemException v6) {
                                                                                                    throw CompressionAlgorithmManager.c(v6);
                                                                                                }
                                                                                                AbstractComputationKernel.I(new String[4]);
                                                                                            }
                                                                                            catch (CustomSystemException v7) {
                                                                                                throw CompressionAlgorithmManager.c(v7);
                                                                                            }
                                                                                        }
                                                                                        this.z = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)24003, (long)(5979551540575576808L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.ts, (long)-8588037589365406029L, (long)var1_1);
                                                                                        this.P = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)27765, (long)(5436970578684449557L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Void.TYPE, (Object)new Class[0], (long)-8586514070438494798L, (long)var1_1);
                                                                                        this.I = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)4404, (long)(5171097583525195358L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Void.TYPE, (Object)new Class[0], (long)-8586514070438494798L, (long)var1_1);
                                                                                        this.V = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)17999, (long)(7222969585940805L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Void.TYPE, (Object)new Class[]{Boolean.TYPE}, (long)-8586514070438494798L, (long)var1_1);
                                                                                    }
                                                                                    try {
                                                                                        if (var3_2 == null) break block73;
lbl47:
                                                                                        // 2 sources

                                                                                        v1 = GeometryCalculator.C();
                                                                                        v2 = 23;
                                                                                    }
                                                                                    catch (CustomSystemException v8) {
                                                                                        throw CompressionAlgorithmManager.c(v8);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    block74: {
                                                                                        try {
                                                                                            if (v1 < v2) break block74;
                                                                                            this.a = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)8686, (long)(4229647585067785961L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.rl, (long)-8588037589365406029L, (long)var1_1);
                                                                                            if (var3_2 == null) break block75;
                                                                                        }
                                                                                        catch (CustomSystemException v9) {
                                                                                            throw CompressionAlgorithmManager.c(v9);
                                                                                        }
                                                                                    }
                                                                                    this.a = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)23340, (long)(6292277141953094711L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.rl, (long)-8588037589365406029L, (long)var1_1);
                                                                                }
                                                                                catch (CustomSystemException v10) {
                                                                                    throw CompressionAlgorithmManager.c(v10);
                                                                                }
                                                                            }
                                                                            try {
                                                                                block76: {
                                                                                    try {
                                                                                        if (GeometryCalculator.C() < 35) break block76;
                                                                                        this.z = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)17718, (long)(1355448122201094687L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.ts, (long)-8588037589365406029L, (long)var1_1);
                                                                                        this.r = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)9451, (long)(4719995436475472848L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Vp, (long)-8588037589365406029L, (long)var1_1);
                                                                                        if (var3_2 == null) break block77;
                                                                                    }
                                                                                    catch (CustomSystemException v11) {
                                                                                        throw CompressionAlgorithmManager.c(v11);
                                                                                    }
                                                                                }
                                                                                this.z = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)18113, (long)(5581402723834608117L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.ts, (long)-8588037589365406029L, (long)var1_1);
                                                                                this.r = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)3127, (long)(2008008196972966679L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Vp, (long)-8588037589365406029L, (long)var1_1);
                                                                            }
                                                                            catch (CustomSystemException v12) {
                                                                                throw CompressionAlgorithmManager.c(v12);
                                                                            }
                                                                        }
                                                                        this.s = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)19086, (long)(6782225484538066356L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Yj, (long)-8588037589365406029L, (long)var1_1);
                                                                        this.u = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)23551, (long)(1906451023544788218L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-8588037589365406029L, (long)var1_1);
                                                                        this.P = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)7880, (long)(4731111044212711925L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-8586514070438494798L, (long)var1_1);
                                                                        this.I = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)25221, (long)(3014362336307715464L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-8586514070438494798L, (long)var1_1);
                                                                        this.V = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)20616, (long)(2304676307145306091L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Boolean.TYPE}, (long)-8586514070438494798L, (long)var1_1);
                                                                    }
                                                                    try {
                                                                        try {
                                                                            block79: {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                this.e = ((ThreadPoolCoordinator)CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)12139, (long)(7126820358539169877L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (Object)ReflectionMetadataResolver.Et, (long)-8587813380899222906L, (long)var1_1).e(GameVersionEnumerator.MC_1_12_2.R(), (String)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)3283, (long)(7693819087843718103L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1))).p();
                                                                                                this.X = ((StatefulEventToggle)CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)13930, (long)(2353820438366865732L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (Object)ReflectionMetadataResolver.US, (Object)new Class[0], (long)-8588120436491875973L, (long)var1_1).e(GameVersionEnumerator.MC_1_12_2.R(), (String)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)22051, (long)(7568149583687985436L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1))).M();
                                                                                                v13 = GeometryCalculator.C();
                                                                                                v14 = 35;
                                                                                                if (var3_2 != null) break block78;
                                                                                                if (v13 < v14) break block79;
                                                                                            }
                                                                                            catch (CustomSystemException v15) {
                                                                                                throw CompressionAlgorithmManager.c(v15);
                                                                                            }
                                                                                            this.Z = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)5941, (long)(2901672063520204826L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, Boolean.TYPE, (long)-8588037589365406029L, (long)var1_1);
                                                                                            this.S = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)20897, (long)(3053957943606652618L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.b5, (long)-8588037589365406029L, (long)var1_1);
                                                                                            this.Y = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)24873, (long)(2915884239740608057L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.f, (long)-8588037589365406029L, (long)var1_1);
                                                                                            this.B = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)9482, (long)(4314953521767340562L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.FP, (long)-8588037589365406029L, (long)var1_1);
                                                                                            this.n = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)24383, (long)(6083353580415492148L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.PH, (long)-8588037589365406029L, (long)var1_1);
                                                                                            this.W = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)15968, (long)(8080733017365135688L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.bu, (long)-8588037589365406029L, (long)var1_1);
                                                                                            this.i = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)4436, (long)(7503468613254737495L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.FF, (Object)new Class[0], (long)-8588246195503860509L, (long)var1_1);
                                                                                            if (var3_2 != null) break block80;
                                                                                        }
                                                                                        catch (CustomSystemException v16) {
                                                                                            throw CompressionAlgorithmManager.c(v16);
                                                                                        }
                                                                                        if (GameVersionEnumerator.u() >= GameVersionEnumerator.MC_1_20_6.B()) break block81;
                                                                                    }
                                                                                    catch (CustomSystemException v17) {
                                                                                        throw CompressionAlgorithmManager.c(v17);
                                                                                    }
                                                                                    this.O = CompressionAlgorithmManager.e("\u00d5", (Object)this, Executor.class, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)16379, (long)(5955750177520304354L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{Runnable.class}, (long)-8587945575331317053L, (long)var1_1);
                                                                                    if (var3_2 == null) break block81;
                                                                                }
                                                                                catch (CustomSystemException v18) {
                                                                                    throw CompressionAlgorithmManager.c(v18);
                                                                                }
                                                                            }
                                                                            this.o = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)3577, (long)(5626168990140592885L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, Boolean.TYPE, (long)-8588037589365406029L, (long)var1_1);
                                                                            this.Z = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)28416, (long)(2435715302644387855L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, Boolean.TYPE, (long)-8588037589365406029L, (long)var1_1);
                                                                            this.S = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)9733, (long)(1898352749772659052L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.b5, (long)-8588037589365406029L, (long)var1_1);
                                                                            this.Y = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)11760, (long)(7985389367468479204L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.f, (long)-8588037589365406029L, (long)var1_1);
                                                                            this.p = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)19949, (long)(8819268321718448890L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-8588037589365406029L, (long)var1_1);
                                                                            this.K = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)3929, (long)(2307776163875057723L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-8588037589365406029L, (long)var1_1);
                                                                            this.n = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)22079, (long)(4731361165094267218L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.PH, (long)-8588037589365406029L, (long)var1_1);
                                                                            this.W = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)25283, (long)(7930422555131092466L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.bu, (long)-8588037589365406029L, (long)var1_1);
                                                                            this.i = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)30057, (long)(1555236717171346005L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.FF, (Object)new Class[0], (long)-8588246195503860509L, (long)var1_1);
                                                                            this.Q = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)26601, (long)(1872342991101597825L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-8586514070438494798L, (long)var1_1);
                                                                            this.m = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)8436, (long)(2246239037358432198L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-8586514070438494798L, (long)var1_1);
                                                                            if (var3_2 != null) break block80;
                                                                        }
                                                                        catch (CustomSystemException v19) {
                                                                            throw CompressionAlgorithmManager.c(v19);
                                                                        }
                                                                        v13 = GeometryCalculator.C();
                                                                        v14 = 15;
                                                                    }
                                                                    catch (CustomSystemException v20) {
                                                                        throw CompressionAlgorithmManager.c(v20);
                                                                    }
                                                                }
                                                                try {
                                                                    if (v13 >= v14) {
                                                                        this.O = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)ReflectionMetadataResolver.rn, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)13803, (long)(8341297167966128845L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, ListenableFuture.class, (Object)new Class[]{Runnable.class}, (long)-8587945575331317053L, (long)var1_1);
                                                                    }
                                                                }
                                                                catch (CustomSystemException v21) {
                                                                    throw CompressionAlgorithmManager.c(v21);
                                                                }
                                                            }
                                                            try {
                                                                this.T = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)26582, (long)(8730513264951859400L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-8587882070419204012L, (long)var1_1);
                                                                this.f = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)16853, (long)(2800702292791017162L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.VV, (long)-8588037589365406029L, (long)var1_1);
                                                                v22 = this;
                                                                v23 = this;
                                                                v24 = CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)7081, (long)(4483465299012969640L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1);
                                                                v25 = true;
                                                                v26 = ReflectionMetadataResolver.Us;
                                                                if (var3_2 != null) break block82;
                                                                v22.j = CompressionAlgorithmManager.e("\u00d5", (Object)v23, (Object)v24, (boolean)v25, (Object)v26, (long)-8588037589365406029L, (long)var1_1);
                                                            }
                                                            catch (CustomSystemException v27) {
                                                                throw CompressionAlgorithmManager.c(v27);
                                                            }
                                                        }
                                                        try {
                                                            v22 = this;
                                                            v23 = this;
                                                            v24 = CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)28081, (long)(4066327714284573392L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1);
                                                            v25 = true;
                                                            v26 = GeometryCalculator.C() == 13 ? ReflectionMetadataResolver.Ut : ReflectionMetadataResolver.PE;
                                                        }
                                                        catch (CustomSystemException v28) {
                                                            throw CompressionAlgorithmManager.c(v28);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            v22.U = CompressionAlgorithmManager.e("\u00d5", (Object)v23, (Object)v24, (boolean)v25, (Object)v26, (long)-8588037589365406029L, (long)var1_1);
                                                            this.M = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)2471, (long)(7554731340131628672L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.EJ, (long)-8588037589365406029L, (long)var1_1);
                                                            this.w = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)13149, (long)(875501050103221324L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Er, (long)-8588037589365406029L, (long)var1_1);
                                                            this.b = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)32548, (long)(4939950041337135160L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.PE, (long)-8588037589365406029L, (long)var1_1);
                                                            this.d = ((ThreadPoolCoordinator)CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)4107, (long)(8568584325921599237L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (Object)ReflectionMetadataResolver.bi, (long)-8587813380899222906L, (long)var1_1).e(GameVersionEnumerator.MC_1_21_4.R(), (String)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)25325, (long)(6887747320792882650L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1))).p();
                                                            this.vw = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)5532, (long)(126855670509038320L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-8588037589365406029L, (long)var1_1);
                                                            this.vr = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)20963, (long)(1356895568354389718L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.UR, (long)-8588037589365406029L, (long)var1_1);
                                                            this.N = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)6352, (long)(1783738597330282481L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Pq, (long)-8588037589365406029L, (long)var1_1);
                                                            this.R = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)13721, (long)(1989695393583844087L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.VD, (long)-8588037589365406029L, (long)var1_1);
                                                            this.E = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)20406, (long)(7629800378928607378L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, Boolean.TYPE, (long)-8588037589365406029L, (long)var1_1);
                                                            v29 = GeometryCalculator.C();
                                                            v30 = 15;
                                                            if (var3_2 != null) break block83;
                                                            if (v29 > v30) break block84;
                                                        }
                                                        catch (CustomSystemException v31) {
                                                            throw CompressionAlgorithmManager.c(v31);
                                                        }
                                                        this.g = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)6353, (long)(7580375039020296135L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.rd, (long)-8588037589365406029L, (long)var1_1);
                                                    }
                                                    catch (CustomSystemException v32) {
                                                        throw CompressionAlgorithmManager.c(v32);
                                                    }
                                                }
                                                v29 = GeometryCalculator.C();
                                                v30 = 35;
                                            }
                                            try {
                                                try {
                                                    if (var3_2 != null) break block85;
                                                    if (v29 >= v30) break block86;
                                                }
                                                catch (CustomSystemException v33) {
                                                    throw CompressionAlgorithmManager.c(v33);
                                                }
                                                this.o = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)6853, (long)(4779018807622985206L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, Boolean.TYPE, (long)-8588037589365406029L, (long)var1_1);
                                                this.y = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)18692, (long)(2532650755321607718L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-8586514070438494798L, (long)var1_1);
                                            }
                                            catch (CustomSystemException v34) {
                                                throw CompressionAlgorithmManager.c(v34);
                                            }
                                        }
                                        v29 = GeometryCalculator.C();
                                        v30 = 50;
                                    }
                                    try {
                                        block87: {
                                            try {
                                                if (v29 < v30) break block87;
                                                this.vV = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)25251, (long)(2304467226110434688L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Ev, (Object)new Class[0], (long)-8586514070438494798L, (long)var1_1);
                                                this.h = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)3420, (long)(1501278813170233926L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.bR, (long)-8588037589365406029L, (long)var1_1);
                                                if (var3_2 == null) break block88;
                                            }
                                            catch (CustomSystemException v35) {
                                                throw CompressionAlgorithmManager.c(v35);
                                            }
                                        }
                                        this.vQ = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)32575, (long)(1860805471440732178L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Ev, (long)-8588037589365406029L, (long)var1_1);
                                    }
                                    catch (CustomSystemException v36) {
                                        throw CompressionAlgorithmManager.c(v36);
                                    }
                                }
                                try {
                                    block90: {
                                        try {
                                            try {
                                                this.vd = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)20800, (long)(521133299186478710L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.VV}, (long)-8586514070438494798L, (long)var1_1);
                                                this.D = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)25625, (long)(4191465743484394256L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Em, (Object)new Class[0], (long)-8586514070438494798L, (long)var1_1);
                                                this.A = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)1983, (long)(7509356385803434146L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.c, (Object)new Class[0], (long)-8586514070438494798L, (long)var1_1);
                                                this.k = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)5372, (long)(4444702674298694644L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.bu, (Object)new Class[0], (long)-8586514070438494798L, (long)var1_1);
                                                if (var3_2 != null) break block89;
                                                if (GeometryCalculator.C() < 35) break block90;
                                            }
                                            catch (CustomSystemException v37) {
                                                throw CompressionAlgorithmManager.c(v37);
                                            }
                                            this.L = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)30642, (long)(6716273174634039476L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-8586514070438494798L, (long)var1_1);
                                            this.H = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)1150, (long)(1700684056089557868L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Boolean.TYPE}, (long)-8586514070438494798L, (long)var1_1);
                                            if (var3_2 == null) break block91;
                                        }
                                        catch (CustomSystemException v38) {
                                            throw CompressionAlgorithmManager.c(v38);
                                        }
                                    }
                                    this.L = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)14729, (long)(8454047908355917449L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-8586514070438494798L, (long)var1_1);
                                }
                                catch (CustomSystemException v39) {
                                    throw CompressionAlgorithmManager.c(v39);
                                }
                            }
                            this.H = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)21353, (long)(3220509121958423632L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-8586514070438494798L, (long)var1_1);
                        }
                        try {
                            try {
                                v40 = GeometryCalculator.C();
                                if (var3_2 != null) break block92;
                                if (v40 < 37) break block93;
                            }
                            catch (CustomSystemException v41) {
                                throw CompressionAlgorithmManager.c(v41);
                            }
                            this.c = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)31096, (long)(6881063875025012296L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.tz, (long)-8588037589365406029L, (long)var1_1);
                        }
                        catch (CustomSystemException v42) {
                            throw CompressionAlgorithmManager.c(v42);
                        }
                    }
                    v40 = (int)GameVersionEnumerator.MC_1_21_6.H();
                }
                try {
                    try {
                        if (var3_2 != null) break block94;
                        if (v40 == 0) break block95;
                    }
                    catch (CustomSystemException v43) {
                        throw CompressionAlgorithmManager.c(v43);
                    }
                    v40 = (int)GameVersionEnumerator.MC_1_21_10.H();
                }
                catch (CustomSystemException v44) {
                    throw CompressionAlgorithmManager.c(v44);
                }
            }
            try {
                block96: {
                    try {
                        if (v40 == 0) break block96;
                        this.t = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)18254, (long)(4046974643905738785L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.FE, (long)-8588037589365406029L, (long)var1_1);
                        this.F = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)18581, (long)(8094992980781643648L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.bT, (long)-8588037589365406029L, (long)var1_1);
                        if (var3_2 == null) break block95;
                    }
                    catch (CustomSystemException v45) {
                        throw CompressionAlgorithmManager.c(v45);
                    }
                }
                this.C = CompressionAlgorithmManager.e("\u00d5", (Object)this, (Object)CompressionAlgorithmManager.e("S", (int)CompressionAlgorithmManager.b("y", (int)14253, (long)(3686371705816926344L ^ var1_1)), (long)-8588310001107628992L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.bt, (long)-8588037589365406029L, (long)var1_1);
            }
            catch (CustomSystemException v46) {
                throw CompressionAlgorithmManager.c(v46);
            }
        }
    }

    static int T(CompressionAlgorithmManager compressionAlgorithmManager, Object object) {
        return compressionAlgorithmManager.v(object);
    }

    public Object s(Object object) {
        return this.f.Z(object);
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/vE" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private Object W(Object object) {
        return this.Y.Z(object);
    }

    public Object j(Object object) {
        return this.U.Z(object);
    }

    static Object p(CompressionAlgorithmManager compressionAlgorithmManager, Object object) {
        return compressionAlgorithmManager.V(object);
    }

    public Object s() {
        return this.i.T(null, new Object[0]);
    }

    public boolean S(Object object) {
        return this.Z.R(object);
    }

    private void k(Object object, boolean bl) {
        this.Z.B(object, bl);
    }

    public Object l(Object object) {
        try {
            if (this.F == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CompressionAlgorithmManager.c(customSystemException);
        }
        return this.F.Z(object);
    }

    public void x(Object object, int n) {
        this.p.t(object, n);
    }

    public void j(Object object, Object object2) {
        this.vd.l(object, object2);
    }

    public Object I(Object object) {
        return this.R.Z(object);
    }

    private int H(Object object) {
        return this.vw.R(object);
    }

    public int G() {
        return this.T.R(null);
    }

    static Object h(CompressionAlgorithmManager compressionAlgorithmManager, Object object) {
        return compressionAlgorithmManager.y(object);
    }

    private static void a() {
        Object[] objectArray = ob;
        ob[0] = "i!8T";
        objectArray[1] = "M\rXl\u000e5F\u0002I#s-U\u0005@j";
        objectArray[2] = Boolean.TYPE;
        CompressionAlgorithmManager.pb[2] = "java/lang/Boolean";
        objectArray[3] = "\u0011}\u00016xc\u001ar\u0010y\u0015c\u001ao\u0004";
        objectArray[4] = "nfxr)\"\u001bFs}8mvFs`,x";
        objectArray[5] = "Fw\u0018:";
        objectArray[6] = "\u0012}IG\u000f2g]BH\u001e}\n]BU\nh";
        objectArray[7] = "\u000e\u0018g";
        objectArray[8] = Integer.TYPE;
        CompressionAlgorithmManager.pb[8] = "java/lang/Integer";
        objectArray[9] = "\u00045LB";
        objectArray[10] = "`B\u001ef";
        objectArray[11] = "\u0012U[@@\fguPOQC\nuPREV";
        objectArray[12] = "|'k7%f\t\u0007`84)d\u0007`% <";
        objectArray[13] = "\u0006>\u0005,";
        objectArray[14] = "\u001a\u0016^\u001c,N\u0011\u0019OSM@\u001a\u0012K\t";
        objectArray[15] = "}!6A*]/f*#\u000e6h <[3Jj%9#pKujdY#Dy!Z\u0019\"H(xc_/Wp\u001ajHpGq!9\\'\u000e\u0012!(\u0018*Pq~\"L#6";
        objectArray[16] = "cl\u0003K@>1+\u001f)nU6<\u0011\u0013Alp1\u000eK#/61\u0017S_-34o\u0010^2|i\u0015CQ>7WUB]onn\u0013OB7\fg\u0004\u0010R674\u0010G\u001bU7%TJE6h/\u0000C#";
        objectArray[17] = "T*>qs\u0001\u0006m\"\u0013KjA+4kj\u0016C.1\u0013)\u0017\\aliz\u0018P*R){\u0014\u0001skov\u000bY\u0011ll/\u0012P\u007fknr\u001b;";
        objectArray[18] = "r!\rf4M f\u0011\u0004\u000f&g \u0007|-Ze%\u0002\u0004mMc \u0003=+@|xa;gZtx]onXa\u001a";
        objectArray[19] = "|o|,\u001c4.(`N2_inv6\u0005#kksNF\"t$.4\u0015-xo\u0010t\u0014!)6)2\u0019>qT.1@'x:)3\u001d.\u0013";
        objectArray[20] = "=Y\u001b@\bBo\u001e\u0007\"6)(X\u0011Z\u0011U*]\u0014\"RT5\u0012IX\u0001[9Yw\u0018\u0000Wh\u0000N^\rH0bGIRX1Y\u0014]\u0005\u0011RY\u0005\u0019\bO1\u0006\u000fM\u0001)";
        objectArray[21] = "2<\u00103Z\u00190=\u0015.k\fuB\u0014,\u0015]w9PoTW\u000e8\u00134\u0013\u001dr:\u00161k";
        Object[] objectArray2 = objectArray;
        objectArray[22] = "kS7y\u0007t9\u0014+\u001b\u0006\u001f~R=c\u001ec|W8\u001b^tzR9\"\u0018ye\n[+\u000f&u\u000b`x\u001bq<hju\u0014 hU8!\u0018z\u0004";
    }

    private Object y(Object object) {
        return this.g.Z(object);
    }

    private Object P(Object object) {
        return this.C.Z(object);
    }

    public void i(Object object, Object object2) {
        this.b.L(object, object2);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CompressionAlgorithmManager.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CompressionAlgorithmManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(CompressionAlgorithmManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

