/*
 * Decompiled with CFR 0.152.
 */
package com.metadata.extraction;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.concurrency.management.ThreadPoolCoordinator;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.data.brokerage.ContextualDataBroker;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityService;
import com.state.management.StatefulEventToggle;
import com.system.lifecycle.ObjectLifecycleTracker;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Collection;
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
public class MetadataExtractionService
extends CryptoProtocolEngine {
    private final HK op;
    private HK oy;
    private final ReflectionUtilityService T;
    private HK r;
    private final ReflectionUtilityService O;
    private final HK F;
    private final ReflectionUtilityService H;
    private HK w;
    private final ReflectionUtilityService p;
    private ReflectionUtilityService om;
    private final HK i;
    private HK A;
    private HK Y;
    private final HK c;
    private ReflectionUtilityService S;
    private HK d;
    private HK e;
    private ReflectionUtilityService B;
    private final ReflectionUtilityService N;
    private final HK k;
    private HK os;
    private HK z;
    private final HK f;
    private final ReflectionUtilityService b;
    private HK j;
    private ReflectionUtilityService m;
    private ReflectionUtilityService oK;
    private final ReflectionUtilityService h;
    private final HK oz;
    private static final Integer[] gb;
    private final HK ot;
    private final ReflectionUtilityService n;
    private HK g;
    public final HK D;
    private HK y;
    public final HK X;
    private HK oC;
    public ReflectionUtilityService a;
    private HK v;
    public HK W;
    private final HK M;
    private final HK u;
    private final HK Z;
    private final ReflectionUtilityService oA;
    private final ReflectionUtilityService K;
    private static final long[] cb;
    private static final Map hb;
    private final HK oc;
    private ReflectionUtilityService t;
    private HK oH;
    private HK ox;
    private HK E;
    private final HK Q;
    private static final Object[] ib;
    private static final long bb;
    private HK oX;
    public HK P;
    private ReflectionUtilityService q;
    private ReflectionUtilityService V;
    private static final String[] jb;
    private HK s;
    private HK oP;
    private ReflectionUtilityService o;
    private HK L;
    private HK C;
    private final HK J;
    private ReflectionUtilityService I;
    private final ReflectionUtilityService R;
    private final HK G;
    private HK U;

    private void X(Object object) {
        this.M.V(object);
    }

    static Object F(MetadataExtractionService metadataExtractionService, Object object) {
        return metadataExtractionService.u(object);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/U7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static void V(MetadataExtractionService metadataExtractionService, Object object, float f) {
        metadataExtractionService.X(object, f);
    }

    public float A(Object object) {
        return this.u.p(object, new Object[0]);
    }

    private float n(Object object) {
        return this.y.p(object, new Object[0]);
    }

    public Object L(Object object, float f) {
        return this.G.T(object, Float.valueOf(f));
    }

    static void o(MetadataExtractionService metadataExtractionService, Object object, Object object2) {
        metadataExtractionService.D(object, object2);
    }

    static float V(MetadataExtractionService metadataExtractionService, Object object) {
        return metadataExtractionService.Q(object);
    }

    private void Y(Object object, float f) {
        this.b.H(object, f);
    }

    static void d(MetadataExtractionService metadataExtractionService, Object object, float f) {
        metadataExtractionService.z(object, f);
    }

    static void O(MetadataExtractionService metadataExtractionService, Object object) {
        metadataExtractionService.h(object);
    }

    private float Q(Object object) {
        return this.F.p(object, new Object[0]);
    }

    static float O(MetadataExtractionService metadataExtractionService, Object object) {
        return metadataExtractionService.t(object);
    }

    private void f(Object object) {
        this.g.V(object);
    }

    static Object S(MetadataExtractionService metadataExtractionService, Object object, double d2, boolean bl, Object object2) {
        return metadataExtractionService.x(object, d2, bl, object2);
    }

    static void B(MetadataExtractionService metadataExtractionService, Object object, float f) {
        metadataExtractionService.F(object, f);
    }

    public float z(Object object) {
        return this.K.x(object);
    }

    private Object B(Object object) {
        return this.i.T(object, new Object[0]);
    }

    private void z(Object object, float f) {
        this.K.H(object, f);
    }

    public float P(Object object) {
        return this.b.x(object);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = MetadataExtractionService.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = MetadataExtractionService.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    static int s(MetadataExtractionService metadataExtractionService, Object object) {
        return metadataExtractionService.D(object);
    }

    static void k(MetadataExtractionService metadataExtractionService, Object object) {
        metadataExtractionService.v(object);
    }

    public void M(Object object, boolean bl) {
        this.p.B(object, bl);
    }

    static double n(MetadataExtractionService metadataExtractionService, Object object) {
        return metadataExtractionService.U(object);
    }

    static float a(MetadataExtractionService metadataExtractionService, Object object) {
        return metadataExtractionService.U(object);
    }

    private void v(Object object) {
        this.Y.V(object);
    }

    static void D(MetadataExtractionService metadataExtractionService, Object object, boolean bl) {
        metadataExtractionService.q(object, bl);
    }

    private void F(Object object) {
        this.D.V(object);
    }

    private boolean W(Object object, Object object2) {
        return this.X.V(object, object2);
    }

    static Object Q(MetadataExtractionService metadataExtractionService, Object object, Object object2) {
        return metadataExtractionService.H(object, object2);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (jb[n4] != null) {
            return n4;
        }
        Object object = ib[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 46;
                break;
            }
            case 1: {
                n3 = 30;
                break;
            }
            case 2: {
                n3 = 33;
                break;
            }
            case 3: {
                n3 = 25;
                break;
            }
            case 4: {
                n3 = 58;
                break;
            }
            case 5: {
                n3 = 1;
                break;
            }
            case 6: {
                n3 = 4;
                break;
            }
            case 7: {
                n3 = 36;
                break;
            }
            case 8: {
                n3 = 43;
                break;
            }
            case 9: {
                n3 = 60;
                break;
            }
            case 10: {
                n3 = 24;
                break;
            }
            case 11: {
                n3 = 52;
                break;
            }
            case 12: {
                n3 = 57;
                break;
            }
            case 13: {
                n3 = 23;
                break;
            }
            case 14: {
                n3 = 59;
                break;
            }
            case 15: {
                n3 = 17;
                break;
            }
            case 16: {
                n3 = 11;
                break;
            }
            case 17: {
                n3 = 14;
                break;
            }
            case 18: {
                n3 = 39;
                break;
            }
            case 19: {
                n3 = 13;
                break;
            }
            case 20: {
                n3 = 21;
                break;
            }
            case 21: {
                n3 = 63;
                break;
            }
            case 22: {
                n3 = 40;
                break;
            }
            case 23: {
                n3 = 6;
                break;
            }
            case 24: {
                n3 = 20;
                break;
            }
            case 25: {
                n3 = 16;
                break;
            }
            case 26: {
                n3 = 34;
                break;
            }
            case 27: {
                n3 = 29;
                break;
            }
            case 28: {
                n3 = 31;
                break;
            }
            case 29: {
                n3 = 10;
                break;
            }
            case 30: {
                n3 = 26;
                break;
            }
            case 31: {
                n3 = 49;
                break;
            }
            case 32: {
                n3 = 42;
                break;
            }
            case 33: {
                n3 = 12;
                break;
            }
            case 34: {
                n3 = 37;
                break;
            }
            case 35: {
                n3 = 2;
                break;
            }
            case 36: {
                n3 = 48;
                break;
            }
            case 37: {
                n3 = 3;
                break;
            }
            case 38: {
                n3 = 41;
                break;
            }
            case 39: {
                n3 = 47;
                break;
            }
            case 40: {
                n3 = 22;
                break;
            }
            case 41: {
                n3 = 0;
                break;
            }
            case 42: {
                n3 = 61;
                break;
            }
            case 43: {
                n3 = 28;
                break;
            }
            case 44: {
                n3 = 50;
                break;
            }
            case 45: {
                n3 = 51;
                break;
            }
            case 46: {
                n3 = 19;
                break;
            }
            case 47: {
                n3 = 38;
                break;
            }
            case 48: {
                n3 = 7;
                break;
            }
            case 49: {
                n3 = 55;
                break;
            }
            case 50: {
                n3 = 62;
                break;
            }
            case 51: {
                n3 = 54;
                break;
            }
            case 52: {
                n3 = 44;
                break;
            }
            case 53: {
                n3 = 9;
                break;
            }
            case 54: {
                n3 = 18;
                break;
            }
            case 55: {
                n3 = 32;
                break;
            }
            case 56: {
                n3 = 35;
                break;
            }
            case 57: {
                n3 = 5;
                break;
            }
            case 58: {
                n3 = 56;
                break;
            }
            case 59: {
                n3 = 53;
                break;
            }
            case 60: {
                n3 = 8;
                break;
            }
            case 61: {
                n3 = 27;
                break;
            }
            case 62: {
                n3 = 45;
                break;
            }
            default: {
                n3 = 15;
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
        MetadataExtractionService.jb[n4] = new String(cArray);
        return n4;
    }

    private void q(Object object, boolean bl) {
        this.q.B(object, bl);
    }

    private float g(Object object) {
        return this.c.p(object, new Object[0]);
    }

    static void e(MetadataExtractionService metadataExtractionService, Object object, Object object2) {
        metadataExtractionService.f(object, object2);
    }

    private Object k(Object object, Object object2) {
        return this.Q.T(object, object2);
    }

    private void h(Object object) {
        this.oc.V(object);
    }

    static void l(MetadataExtractionService metadataExtractionService, Object object, float f) {
        metadataExtractionService.r(object, f);
    }

    static float Y(MetadataExtractionService metadataExtractionService, Object object) {
        return metadataExtractionService.q(object);
    }

    private float U(Object object) {
        return this.n.x(object);
    }

    private int A(Object object) {
        return this.N.R(object);
    }

    private float q(Object object) {
        return this.H.x(object);
    }

    private static Method h(long l, long l2) {
        int n = MetadataExtractionService.e(l, l2);
        Object object = ib[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = jb[n];
                int n3 = string2.indexOf(8);
                clazz3 = MetadataExtractionService.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = MetadataExtractionService.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = MetadataExtractionService.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        MetadataExtractionService.ib[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = MetadataExtractionService.f(979532830902746L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = MetadataExtractionService.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        MetadataExtractionService.ib[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = MetadataExtractionService.f(979532830902746L, 0L);
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

    private static Field g(long l, long l2) {
        int n = MetadataExtractionService.e(l, l2);
        Object object = ib[n];
        if (object instanceof String) {
            String string = jb[n];
            int n2 = string.indexOf(8);
            Class clazz = MetadataExtractionService.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = MetadataExtractionService.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = MetadataExtractionService.c(clazz3, string2, clazz2)) != null) {
                    MetadataExtractionService.ib[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = MetadataExtractionService.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        MetadataExtractionService.ib[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = MetadataExtractionService.f(979532830902746L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void j(Object object, Object object2) {
        this.f.l(object, object2);
    }

    private void U(Object object, float f) {
        this.om.H(object, f);
    }

    private float S(Object object) {
        return this.S.x(object);
    }

    public Object S(Object object, double d2, float f) {
        return this.ot.T(object, d2, Float.valueOf(f));
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/U7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static void p(MetadataExtractionService metadataExtractionService, Object object, Object object2) {
        metadataExtractionService.j(object, object2);
    }

    public int R(Object object) {
        return this.m.R(object);
    }

    static Object M(MetadataExtractionService metadataExtractionService, Object object, Object object2) {
        return metadataExtractionService.k(object, object2);
    }

    static Object A(MetadataExtractionService metadataExtractionService, Object object, Object object2) {
        return metadataExtractionService.B(object, object2);
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

    public Object s(Object object, double d2, float f, boolean bl) {
        return this.ot.T(object, d2, Float.valueOf(f), bl);
    }

    private Object x(Object object) {
        return this.J.T(object, new Object[0]);
    }

    private void r(Object object, float f) {
        this.H.H(object, f);
    }

    private boolean u(Object object) {
        return this.L.V(object, new Object[0]);
    }

    static boolean W(MetadataExtractionService metadataExtractionService, Object object) {
        return metadataExtractionService.U(object);
    }

    static float E(MetadataExtractionService metadataExtractionService, Object object) {
        return metadataExtractionService.O(object);
    }

    private void f(Object object, Object object2) {
        this.A.l(object, object2);
    }

    static void g(MetadataExtractionService metadataExtractionService, Object object, int n) {
        metadataExtractionService.D(object, n);
    }

    static void N(MetadataExtractionService metadataExtractionService, Object object, int n) {
        metadataExtractionService.i(object, n);
    }

    static void J(MetadataExtractionService metadataExtractionService, Object object, float f) {
        metadataExtractionService.Z(object, f);
    }

    static void n(MetadataExtractionService metadataExtractionService, Object object) {
        metadataExtractionService.f(object);
    }

    private int N(Object object) {
        return this.R.R(object);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    static float P(MetadataExtractionService metadataExtractionService, Object object) {
        return metadataExtractionService.j(object);
    }

    private boolean f(Object object) {
        return this.q.R(object);
    }

    static boolean y(MetadataExtractionService metadataExtractionService, Object object) {
        return metadataExtractionService.u(object);
    }

    private void w(Object object, float f) {
        this.I.H(object, f);
    }

    static Object P(MetadataExtractionService metadataExtractionService, Object object) {
        return metadataExtractionService.B(object);
    }

    static void C(MetadataExtractionService metadataExtractionService, Object object, float f) {
        metadataExtractionService.w(object, f);
    }

    private boolean t(Object object, Object object2) {
        return this.r.V(object, object2);
    }

    public float p(Object object) {
        return this.z.p(object, new Object[0]);
    }

    private Object x(Object object, double d2, boolean bl, Object object2) {
        return this.E.T(object, d2, bl, object2);
    }

    public Object G(Object object) {
        return this.oH.T(object, new Object[0]);
    }

    private void Z(Object object, float f) {
        this.O.H(object, f);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'x' || c == '\u00ee' || c == '\u00ec' || c == 'q') {
                field = MetadataExtractionService.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'x' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ee' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ec' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = MetadataExtractionService.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'u' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'p' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    static boolean L(MetadataExtractionService metadataExtractionService, Object object) {
        return metadataExtractionService.B(object);
    }

    private void i(Object object, float f) {
        this.ox.l(object, Float.valueOf(f));
    }

    static boolean c(MetadataExtractionService metadataExtractionService, Object object) {
        return metadataExtractionService.f(object);
    }

    private void d(Object object, float f) {
        this.S.H(object, f);
    }

    static int E(MetadataExtractionService metadataExtractionService, Object object) {
        return metadataExtractionService.A(object);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = MetadataExtractionService.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private float t(Object object) {
        return this.V.x(object);
    }

    private Object H(Object object, Object object2) {
        return this.oz.T(object, object2);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = MetadataExtractionService.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = MetadataExtractionService.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    static Object M(MetadataExtractionService metadataExtractionService) {
        return metadataExtractionService.l();
    }

    private void F(Object object, float f) {
        this.V.H(object, f);
    }

    private boolean r(Object object) {
        return this.oP.V(object, new Object[0]);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xB47;
        if (gb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = cb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])hb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    hb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/U7", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            MetadataExtractionService.gb[n2] = n3;
        }
        return gb[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = MetadataExtractionService.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private Object B(Object object, Object object2) {
        return this.oy.T(object, object2);
    }

    static float t(MetadataExtractionService metadataExtractionService, Object object) {
        return metadataExtractionService.B(object);
    }

    private void i(Object object, int n) {
        this.A.l(object, n);
    }

    static float T(MetadataExtractionService metadataExtractionService, Object object) {
        return metadataExtractionService.S(object);
    }

    private boolean U(Object object) {
        return this.p.R(object);
    }

    static double H(MetadataExtractionService metadataExtractionService, Object object, Object object2) {
        return metadataExtractionService.D(object, object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public MetadataExtractionService() {
        block120: {
            block118: {
                block116: {
                    block117: {
                        block114: {
                            block115: {
                                block113: {
                                    block111: {
                                        block110: {
                                            block107: {
                                                block108: {
                                                    block109: {
                                                        block106: {
                                                            block104: {
                                                                block103: {
                                                                    block101: {
                                                                        block99: {
                                                                            block98: {
                                                                                block88: {
                                                                                    block96: {
                                                                                        block92: {
                                                                                            block93: {
                                                                                                block94: {
                                                                                                    block95: {
                                                                                                        block91: {
                                                                                                            block89: {
                                                                                                                var1_1 = MetadataExtractionService.bb ^ 73309112082006L;
                                                                                                                super(ReflectionMetadataResolver.Ut);
                                                                                                                this.b = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)31756, (long)(6956643711009784715L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Float.TYPE, (long)-795063047995834371L, (long)var1_1);
                                                                                                                this.K = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)17746, (long)(7412487895922096813L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Float.TYPE, (long)-795063047995834371L, (long)var1_1);
                                                                                                                this.O = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)1494, (long)(8295119718422772349L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Float.TYPE, (long)-795063047995834371L, (long)var1_1);
                                                                                                                this.H = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)3040, (long)(2502389648430920781L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Float.TYPE, (long)-795063047995834371L, (long)var1_1);
                                                                                                                var3_2 = ContextualDataBroker.m();
                                                                                                                try {
                                                                                                                    block90: {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        this.a = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)26599, (long)(644524904168233026L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-795063047995834371L, (long)var1_1);
                                                                                                                                        if (var3_2 != null) break block88;
                                                                                                                                        if (GeometryCalculator.C() >= 23) {
                                                                                                                                        }
                                                                                                                                        ** GOTO lbl104
                                                                                                                                    }
                                                                                                                                    catch (CustomSystemException v0) {
                                                                                                                                        throw MetadataExtractionService.a(v0);
                                                                                                                                    }
                                                                                                                                    this.oA = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)21006, (long)(5556547890015120873L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Vs, (long)-794893823459638098L, (long)var1_1);
                                                                                                                                    this.i = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)8135, (long)(5507035873596760189L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Vl, (Object)new Class[0], (long)-796925245183056656L, (long)var1_1);
                                                                                                                                    this.W = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)277, (long)(7160065932073762484L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Vl, (Object)new Class[]{ReflectionMetadataResolver.F7}, (long)-796925245183056656L, (long)var1_1);
                                                                                                                                    this.oc = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)16493, (long)(1769121426488508297L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.F7}, (long)-796925245183056656L, (long)var1_1);
                                                                                                                                    this.oP = ((StatefulEventToggle)MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)23877, (long)(2951642734008083166L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), Boolean.TYPE, (Object)new Class[0], (long)-795350354871912661L, (long)var1_1).e(GameVersionEnumerator.MC_1_20_6.R(), (String)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)17424, (long)(8670217643708201883L ^ var1_1)), (long)-794960230956290022L, (long)var1_1))).M();
                                                                                                                                    if (var3_2 != null) break block89;
                                                                                                                                }
                                                                                                                                catch (CustomSystemException v1) {
                                                                                                                                    throw MetadataExtractionService.a(v1);
                                                                                                                                }
                                                                                                                                if (GeometryCalculator.C() < 35) break block90;
                                                                                                                            }
                                                                                                                            catch (CustomSystemException v2) {
                                                                                                                                throw MetadataExtractionService.a(v2);
                                                                                                                            }
                                                                                                                            this.d = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)26529, (long)(4340789064048580626L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Float.TYPE, (Object)new Class[]{Float.TYPE}, (long)-796925245183056656L, (long)var1_1);
                                                                                                                            this.oy = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)19225, (long)(4897819640065569924L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.YN, (Object)new Class[]{ReflectionMetadataResolver.YN}, (long)-796925245183056656L, (long)var1_1);
                                                                                                                            this.e = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)3386, (long)(1272351135629800150L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.PE}, (long)-796925245183056656L, (long)var1_1);
                                                                                                                            this.r = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)6583, (long)(1826346950762849803L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.tp}, (long)-796925245183056656L, (long)var1_1);
                                                                                                                            if (var3_2 == null) break block91;
                                                                                                                        }
                                                                                                                        catch (CustomSystemException v3) {
                                                                                                                            throw MetadataExtractionService.a(v3);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    this.e = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)28839, (long)(3087620465704144723L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.PE}, (long)-796925245183056656L, (long)var1_1);
                                                                                                                }
                                                                                                                catch (CustomSystemException v4) {
                                                                                                                    throw MetadataExtractionService.a(v4);
                                                                                                                }
                                                                                                            }
                                                                                                            this.A = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)25009, (long)(3577250939917966885L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.rY}, (long)-796925245183056656L, (long)var1_1);
                                                                                                        }
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        v5 = GeometryCalculator.C();
                                                                                                                        if (var3_2 != null) break block92;
                                                                                                                        if (v5 < 54) break block93;
                                                                                                                    }
                                                                                                                    catch (CustomSystemException v6) {
                                                                                                                        throw MetadataExtractionService.a(v6);
                                                                                                                    }
                                                                                                                    this.s = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)27558, (long)(2467163735578973200L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), Float.TYPE, (Object)new Class[0], (long)-795350354871912661L, (long)var1_1).M();
                                                                                                                    if (var3_2 != null) break block94;
                                                                                                                }
                                                                                                                catch (CustomSystemException v7) {
                                                                                                                    throw MetadataExtractionService.a(v7);
                                                                                                                }
                                                                                                                if (!GameVersionEnumerator.MC_1_21_10.Q()) break block95;
                                                                                                            }
                                                                                                            catch (CustomSystemException v8) {
                                                                                                                throw MetadataExtractionService.a(v8);
                                                                                                            }
                                                                                                            this.o = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)12140, (long)(2366537159819645068L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), Float.TYPE, (long)-795151444258577737L, (long)var1_1).p();
                                                                                                        }
                                                                                                        catch (CustomSystemException v9) {
                                                                                                            throw MetadataExtractionService.a(v9);
                                                                                                        }
                                                                                                    }
                                                                                                    this.L = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)30752, (long)(3161174314986440620L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), Boolean.TYPE, (Object)new Class[0], (long)-795350354871912661L, (long)var1_1).M();
                                                                                                    this.oC = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)15843, (long)(1054359280849011202L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), Boolean.TYPE, (Object)new Class[0], (long)-795350354871912661L, (long)var1_1).M();
                                                                                                    this.oX = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)2973, (long)(8161432475441034336L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), Double.TYPE, (Object)new Class[0], (long)-795350354871912661L, (long)var1_1).M();
                                                                                                    this.w = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)23817, (long)(2710282725421228673L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), Void.TYPE, (Object)new Class[0], (long)-795350354871912661L, (long)var1_1).M();
                                                                                                }
                                                                                                this.g = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)18645, (long)(1772332192752613220L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), Void.TYPE, (Object)new Class[0], (long)-795350354871912661L, (long)var1_1).M();
                                                                                            }
                                                                                            try {
                                                                                                this.oH = ((StatefulEventToggle)MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)18071, (long)(6633758522873755965L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (Object)ReflectionMetadataResolver.F7, (Object)new Class[0], (long)-795350354871912661L, (long)var1_1).e(GameVersionEnumerator.MC_1_16_5.R(), (String)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)31504, (long)(8836671157702067334L ^ var1_1)), (long)-794960230956290022L, (long)var1_1))).M();
                                                                                                if (var3_2 != null) break block96;
                                                                                                v5 = (int)GameVersionEnumerator.MC_1_12_2.J();
                                                                                            }
                                                                                            catch (CustomSystemException v10) {
                                                                                                throw MetadataExtractionService.a(v10);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            block97: {
                                                                                                try {
                                                                                                    if (v5 == 0) break block97;
                                                                                                    this.m = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)28399, (long)(123381638569791767L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-795063047995834371L, (long)var1_1);
                                                                                                    if (var3_2 == null) break block98;
                                                                                                }
                                                                                                catch (CustomSystemException v11) {
                                                                                                    throw MetadataExtractionService.a(v11);
                                                                                                }
                                                                                            }
                                                                                            this.m = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)30176, (long)(5587950803075369477L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-795063047995834371L, (long)var1_1);
                                                                                        }
                                                                                        catch (CustomSystemException v12) {
                                                                                            throw MetadataExtractionService.a(v12);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        if (var3_2 == null) break block98;
lbl104:
                                                                                        // 2 sources

                                                                                        this.oA = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)6205, (long)(401827073318021029L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Vs, (long)-794893823459638098L, (long)var1_1);
                                                                                        this.i = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)26592, (long)(2858484622558140488L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Vl, (Object)new Class[0], (long)-796925245183056656L, (long)var1_1);
                                                                                        this.oc = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)24277, (long)(2660523871167750468L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-796925245183056656L, (long)var1_1);
                                                                                    }
                                                                                    catch (CustomSystemException v13) {
                                                                                        throw MetadataExtractionService.a(v13);
                                                                                    }
                                                                                }
                                                                                this.A = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)22705, (long)(2295207700452026122L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE}, (long)-796925245183056656L, (long)var1_1);
                                                                            }
                                                                            try {
                                                                                block100: {
                                                                                    try {
                                                                                        try {
                                                                                            v14 = GeometryCalculator.C();
                                                                                            v15 = 13;
                                                                                            if (var3_2 != null) break block99;
                                                                                            if (v14 != v15) break block100;
                                                                                        }
                                                                                        catch (CustomSystemException v16) {
                                                                                            throw MetadataExtractionService.a(v16);
                                                                                        }
                                                                                        this.P = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)32412, (long)(1693474330645627150L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.YN, (Object)new Class[]{Float.TYPE}, (long)-796925245183056656L, (long)var1_1);
                                                                                        this.G = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)2344, (long)(5238392598292231871L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.YN, (Object)new Class[]{Float.TYPE}, (long)-796925245183056656L, (long)var1_1);
                                                                                        this.ot = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)27768, (long)(995162935372846042L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Er, (Object)new Class[]{Double.TYPE, Float.TYPE}, (long)-796925245183056656L, (long)var1_1);
                                                                                        if (var3_2 == null) break block101;
                                                                                    }
                                                                                    catch (CustomSystemException v17) {
                                                                                        throw MetadataExtractionService.a(v17);
                                                                                    }
                                                                                }
                                                                                v14 = GeometryCalculator.C();
                                                                                v15 = 35;
                                                                            }
                                                                            catch (CustomSystemException v18) {
                                                                                throw MetadataExtractionService.a(v18);
                                                                            }
                                                                        }
                                                                        try {
                                                                            block102: {
                                                                                try {
                                                                                    if (v14 < v15) break block102;
                                                                                    this.P = MetadataExtractionService.c("u", (Object)this, (Object)ReflectionMetadataResolver.PE, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)24465, (long)(7360426940902350904L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.YN, (Object)new Class[]{Float.TYPE}, (long)-796937230721153095L, (long)var1_1);
                                                                                    this.G = MetadataExtractionService.c("u", (Object)this, (Object)ReflectionMetadataResolver.PE, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)28490, (long)(4625616838826692862L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.YN, (Object)new Class[]{Float.TYPE}, (long)-796937230721153095L, (long)var1_1);
                                                                                    this.ot = MetadataExtractionService.c("u", (Object)this, (Object)ReflectionMetadataResolver.PE, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)28656, (long)(4696676991345594482L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Er, (Object)new Class[]{Double.TYPE, Float.TYPE, Boolean.TYPE}, (long)-796937230721153095L, (long)var1_1);
                                                                                    if (var3_2 == null) break block101;
                                                                                }
                                                                                catch (CustomSystemException v19) {
                                                                                    throw MetadataExtractionService.a(v19);
                                                                                }
                                                                            }
                                                                            this.P = MetadataExtractionService.c("u", (Object)this, (Object)ReflectionMetadataResolver.PE, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)26091, (long)(5479163387285445145L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.YN, (Object)new Class[]{Float.TYPE}, (long)-796937230721153095L, (long)var1_1);
                                                                            this.G = MetadataExtractionService.c("u", (Object)this, (Object)ReflectionMetadataResolver.PE, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)25016, (long)(7032169398893616707L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.YN, (Object)new Class[]{Float.TYPE}, (long)-796937230721153095L, (long)var1_1);
                                                                            this.ot = MetadataExtractionService.c("u", (Object)this, (Object)ReflectionMetadataResolver.PE, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)21620, (long)(668258689512090612L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Er, (Object)new Class[]{Double.TYPE, Float.TYPE}, (long)-796937230721153095L, (long)var1_1);
                                                                        }
                                                                        catch (CustomSystemException v20) {
                                                                            throw MetadataExtractionService.a(v20);
                                                                        }
                                                                    }
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                v21 = GeometryCalculator.C();
                                                                                v22 = 35;
                                                                                if (var3_2 != null) break block103;
                                                                                if (v21 >= v22) {
                                                                                }
                                                                                ** GOTO lbl250
                                                                            }
                                                                            catch (CustomSystemException v23) {
                                                                                throw MetadataExtractionService.a(v23);
                                                                            }
                                                                            this.X = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)24397, (long)(3279287185169031372L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.tp}, (long)-796925245183056656L, (long)var1_1);
                                                                            this.oz = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)12477, (long)(1964780203111894878L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Pj, (Object)new Class[]{ReflectionMetadataResolver.tp}, (long)-796925245183056656L, (long)var1_1);
                                                                            this.Z = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)9942, (long)(8299841189389293915L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Y2, (Object)new Class[0], (long)-796925245183056656L, (long)var1_1);
                                                                            v24 = this;
                                                                            v25 = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)8981, (long)(872295392739712139L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-796925245183056656L, (long)var1_1);
                                                                            if (var3_2 != null) break block104;
                                                                        }
                                                                        catch (CustomSystemException v26) {
                                                                            throw MetadataExtractionService.a(v26);
                                                                        }
                                                                        v24.D = v25;
                                                                        v21 = GeometryCalculator.C();
                                                                        v22 = 50;
                                                                    }
                                                                    catch (CustomSystemException v27) {
                                                                        throw MetadataExtractionService.a(v27);
                                                                    }
                                                                }
                                                                try {
                                                                    block105: {
                                                                        try {
                                                                            if (v21 < v22) break block105;
                                                                            this.Q = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)1884, (long)(6800735911896119497L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Po, (Object)new Class[]{ReflectionMetadataResolver.rM}, (long)-796925245183056656L, (long)var1_1);
                                                                            if (var3_2 == null) break block106;
                                                                        }
                                                                        catch (CustomSystemException v28) {
                                                                            throw MetadataExtractionService.a(v28);
                                                                        }
                                                                    }
                                                                    v24 = this;
                                                                    v25 = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)13343, (long)(2829402452404980635L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Po, (Object)new Class[]{ReflectionMetadataResolver.VH}, (long)-796925245183056656L, (long)var1_1);
                                                                }
                                                                catch (CustomSystemException v29) {
                                                                    throw MetadataExtractionService.a(v29);
                                                                }
                                                            }
                                                            v24.Q = v25;
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        v30 = this;
                                                                        v31 = ((StatefulEventToggle)((StatefulEventToggle)MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)15754, (long)(1807425559836869136L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), Boolean.TYPE, (Object)new Class[0], (long)-795350354871912661L, (long)var1_1).H(GameVersionEnumerator.MC_1_20_6.g(), new Class[]{ReflectionMetadataResolver.rw}).e(GameVersionEnumerator.MC_1_20_6.g(), (String)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)302, (long)(3420724544178978471L ^ var1_1)), (long)-794960230956290022L, (long)var1_1))).n(GameVersionEnumerator.MC_1_20_6.g(), ObjectLifecycleTracker.z)).H(GameVersionEnumerator.MC_1_20_6.R(), new Class[]{ReflectionMetadataResolver.Ff}).M();
                                                                        if (var3_2 != null) break block107;
                                                                        v30.C = v31;
                                                                        if (GeometryCalculator.C() >= 37) {
                                                                        }
                                                                        ** GOTO lbl234
                                                                    }
                                                                    catch (CustomSystemException v32) {
                                                                        throw MetadataExtractionService.a(v32);
                                                                    }
                                                                    v33 = this;
                                                                    v34 = this;
                                                                    v35 = MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)14127, (long)(1873638983648954505L ^ var1_1)), (long)-794960230956290022L, (long)var1_1);
                                                                    v36 = GeometryCalculator.C();
                                                                    if (var3_2 != null) break block108;
                                                                }
                                                                catch (CustomSystemException v37) {
                                                                    throw MetadataExtractionService.a(v37);
                                                                }
                                                                if (v36 < 50 != 0) break block109;
                                                            }
                                                            catch (CustomSystemException v38) {
                                                                throw MetadataExtractionService.a(v38);
                                                            }
                                                            v36 = true;
                                                            break block108;
                                                        }
                                                        catch (CustomSystemException v39) {
                                                            throw MetadataExtractionService.a(v39);
                                                        }
                                                    }
                                                    v36 = false;
                                                }
                                                try {
                                                    v33.f = MetadataExtractionService.c("u", (Object)v34, (Object)v35, (boolean)v36, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.Pj}, (long)-796925245183056656L, (long)var1_1);
                                                    if (var3_2 == null) break block110;
lbl234:
                                                    // 2 sources

                                                    v30 = this;
                                                    v31 = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)3751, (long)(6119597418571919649L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.Pj}, (long)-796925245183056656L, (long)var1_1);
                                                }
                                                catch (CustomSystemException v40) {
                                                    throw MetadataExtractionService.a(v40);
                                                }
                                            }
                                            v30.f = v31;
                                        }
                                        try {
                                            this.Y = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)23557, (long)(8406840648102486950L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-796925245183056656L, (long)var1_1);
                                            this.q = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)9073, (long)(301866303036316909L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Boolean.TYPE, (long)-795063047995834371L, (long)var1_1);
                                            this.t = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)8192, (long)(7984043522816434067L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Y2, (long)-795063047995834371L, (long)var1_1);
                                            this.E = ((StatefulEventToggle)((StatefulEventToggle)MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)9731, (long)(4926947411836656107L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (Object)ReflectionMetadataResolver.YN, (Object)new Class[]{Double.TYPE, Boolean.TYPE, ReflectionMetadataResolver.YN}, (long)-795350354871912661L, (long)var1_1).e(GameVersionEnumerator.MC_1_20_6.g(), (String)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)15809, (long)(3970867218206016044L ^ var1_1)), (long)-794960230956290022L, (long)var1_1))).n(GameVersionEnumerator.MC_1_20_6.g(), ObjectLifecycleTracker.z)).M();
                                            this.y = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)8492, (long)(6699013344450567810L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Float.TYPE, (Object)new Class[0], (long)-796925245183056656L, (long)var1_1);
                                            this.v = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)16098, (long)(8785229608096252183L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), Double.TYPE, (Object)new Class[0], (long)-795350354871912661L, (long)var1_1).H(GameVersionEnumerator.MC_1_20_6.g(), new Class[]{ReflectionMetadataResolver.VH}).H(GameVersionEnumerator.MC_1_20_6.R(), new Class[]{ReflectionMetadataResolver.rM}).M();
                                            if (var3_2 == null) break block111;
lbl250:
                                            // 2 sources

                                            this.X = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)3222, (long)(6746297796636111641L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.rY}, (long)-796925245183056656L, (long)var1_1);
                                            this.oz = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)20673, (long)(3716766252856913743L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Pj, (Object)new Class[]{ReflectionMetadataResolver.rY}, (long)-796925245183056656L, (long)var1_1);
                                            this.Z = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)30757, (long)(2780698991165933441L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Y2, (Object)new Class[0], (long)-796925245183056656L, (long)var1_1);
                                            this.D = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)8410, (long)(499211611251334944L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-796925245183056656L, (long)var1_1);
                                            this.Q = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)8060, (long)(8411211046994632931L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Po, (Object)new Class[]{ReflectionMetadataResolver.VH}, (long)-796925245183056656L, (long)var1_1);
                                            this.f = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)3680, (long)(2719820925176377808L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.Pj}, (long)-796925245183056656L, (long)var1_1);
                                            this.Y = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)836, (long)(7221152546085502173L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-796925245183056656L, (long)var1_1);
                                            this.q = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)11762, (long)(8007116575384326754L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Boolean.TYPE, (long)-795063047995834371L, (long)var1_1);
                                            this.t = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)16814, (long)(4149480613319982681L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Y2, (long)-795063047995834371L, (long)var1_1);
                                        }
                                        catch (CustomSystemException v41) {
                                            throw MetadataExtractionService.a(v41);
                                        }
                                    }
                                    try {
                                        block112: {
                                            try {
                                                if (GeometryCalculator.C() < 50) break block112;
                                                this.B = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)3585, (long)(7089638852399493506L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.rt, (long)-795063047995834371L, (long)var1_1);
                                                if (var3_2 == null) break block113;
                                            }
                                            catch (CustomSystemException v42) {
                                                throw MetadataExtractionService.a(v42);
                                            }
                                        }
                                        this.V = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)6478, (long)(7210908897814013691L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Float.TYPE, (long)-795063047995834371L, (long)var1_1);
                                        this.om = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)8818, (long)(6601435269521988993L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Float.TYPE, (long)-795063047995834371L, (long)var1_1);
                                        this.S = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)18720, (long)(1864223288208373442L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Float.TYPE, (long)-795063047995834371L, (long)var1_1);
                                        this.U = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)26256, (long)(167315708166216044L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Uj, (Object)new Class[0], (long)-796925245183056656L, (long)var1_1);
                                    }
                                    catch (CustomSystemException v43) {
                                        throw MetadataExtractionService.a(v43);
                                    }
                                }
                                try {
                                    try {
                                        this.n = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)7666, (long)(7567383951069667842L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Float.TYPE, (long)-795063047995834371L, (long)var1_1);
                                        this.p = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)20527, (long)(5557549224066428829L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Boolean.TYPE, (long)-795063047995834371L, (long)var1_1);
                                        this.h = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)3493, (long)(6362324054315135563L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-795063047995834371L, (long)var1_1);
                                        this.c = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)13124, (long)(6873677098825698482L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Float.TYPE, (Object)new Class[0], (long)-796925245183056656L, (long)var1_1);
                                        this.u = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)20450, (long)(6472861900302692429L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Float.TYPE, (Object)new Class[0], (long)-796925245183056656L, (long)var1_1);
                                        this.k = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)19761, (long)(94543421179802269L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.PE}, (long)-796925245183056656L, (long)var1_1);
                                        this.J = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)14264, (long)(3185140033116784710L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Collection.class, (Object)new Class[0], (long)-796925245183056656L, (long)var1_1);
                                        this.M = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)19856, (long)(6012837534980682358L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-796925245183056656L, (long)var1_1);
                                        this.op = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)3387, (long)(5805441361914262218L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)-796925245183056656L, (long)var1_1);
                                        this.F = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)17374, (long)(6771105068702055523L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Float.TYPE, (Object)new Class[0], (long)-796925245183056656L, (long)var1_1);
                                        v44 = GeometryCalculator.C();
                                        v45 = 50;
                                        if (var3_2 != null) break block114;
                                        if (v44 < v45) break block115;
                                    }
                                    catch (CustomSystemException v46) {
                                        throw MetadataExtractionService.a(v46);
                                    }
                                    this.z = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)7262, (long)(6405278429314769894L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Float.TYPE, (Object)new Class[0], (long)-796925245183056656L, (long)var1_1);
                                }
                                catch (CustomSystemException v47) {
                                    throw MetadataExtractionService.a(v47);
                                }
                            }
                            this.I = ((ThreadPoolCoordinator)MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)6622, (long)(7532020803363268180L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), Float.TYPE, (long)-795151444258577737L, (long)var1_1).e(GameVersionEnumerator.MC_1_20_6.R(), (String)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)30544, (long)(8777878636238932207L ^ var1_1)), (long)-794960230956290022L, (long)var1_1))).p();
                            this.T = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)5182, (long)(8779737978266381214L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Float.TYPE, (long)-795063047995834371L, (long)var1_1);
                            this.N = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)7235, (long)(9095084421210301370L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-795063047995834371L, (long)var1_1);
                            this.R = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)15740, (long)(1410868993130513090L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-795063047995834371L, (long)var1_1);
                            this.oK = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)7346, (long)(8815512764284822283L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-795063047995834371L, (long)var1_1);
                            v44 = GeometryCalculator.C();
                            v45 = GeometryCalculator.z;
                        }
                        try {
                            try {
                                if (var3_2 != null) break block116;
                                if (v44 > v45) break block117;
                            }
                            catch (CustomSystemException v48) {
                                throw MetadataExtractionService.a(v48);
                            }
                            this.os = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)14203, (long)(3912259344908044492L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Float.TYPE, (Object)new Class[]{Float.TYPE}, (long)-796925245183056656L, (long)var1_1);
                        }
                        catch (CustomSystemException v49) {
                            throw MetadataExtractionService.a(v49);
                        }
                    }
                    v44 = GeometryCalculator.C();
                    v45 = 35;
                }
                try {
                    try {
                        if (var3_2 != null) break block118;
                        if (v44 >= v45) {
                        }
                        ** GOTO lbl356
                    }
                    catch (CustomSystemException v50) {
                        throw MetadataExtractionService.a(v50);
                    }
                    v44 = GeometryCalculator.C();
                    v45 = 50;
                }
                catch (CustomSystemException v51) {
                    throw MetadataExtractionService.a(v51);
                }
            }
            try {
                try {
                    block119: {
                        try {
                            if (v44 >= v45) break block119;
                            this.ox = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)11356, (long)(2911099685645013977L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Void.TYPE, (Object)new Class[]{Float.TYPE}, (long)-796925245183056656L, (long)var1_1);
                            if (var3_2 == null) break block120;
                        }
                        catch (CustomSystemException v52) {
                            throw MetadataExtractionService.a(v52);
                        }
                    }
                    this.ox = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)16059, (long)(3290806474946167124L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Float.TYPE}, (long)-796925245183056656L, (long)var1_1);
                    if (var3_2 == null) break block120;
                }
                catch (CustomSystemException v53) {
                    throw MetadataExtractionService.a(v53);
                }
lbl356:
                // 2 sources

                this.ox = MetadataExtractionService.c("u", (Object)this, (Object)MetadataExtractionService.c("p", (int)MetadataExtractionService.b("u", (int)15433, (long)(5122853855522702318L ^ var1_1)), (long)-794960230956290022L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Float.TYPE}, (long)-796925245183056656L, (long)var1_1);
            }
            catch (CustomSystemException v54) {
                throw MetadataExtractionService.a(v54);
            }
        }
        try {
            if (AbstractComputationKernel.J() != null) {
                ContextualDataBroker.x(new int[1]);
            }
        }
        catch (CustomSystemException v55) {
            throw MetadataExtractionService.a(v55);
        }
    }

    private void m(Object object, float f) {
        this.n.H(object, f);
    }

    private Object l(Object object, Object object2) {
        return this.W.T(object, object2);
    }

    static void x(MetadataExtractionService metadataExtractionService, Object object, float f) {
        metadataExtractionService.U(object, f);
    }

    private float j(Object object) {
        return this.T.x(object);
    }

    private void s(Object object) {
        this.w.V(object);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = MetadataExtractionService.e(l, l2);
            object = ib[n];
            try {
                if (!(object instanceof String)) break block2;
                MetadataExtractionService.ib[n] = clazz = Class.forName(jb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    static float H(MetadataExtractionService metadataExtractionService, Object object) {
        return metadataExtractionService.G(object);
    }

    private void D(Object object, Object object2) {
        this.oc.l(object, object2);
    }

    static boolean U(MetadataExtractionService metadataExtractionService, Object object, Object object2) {
        return metadataExtractionService.W(object, object2);
    }

    public void Q(Object object, int n) {
        this.oK.t(object, n);
    }

    private float a(Object object) {
        return this.O.x(object);
    }

    static float I(MetadataExtractionService metadataExtractionService, Object object) {
        return metadataExtractionService.I(object);
    }

    static void C(MetadataExtractionService metadataExtractionService, Object object) {
        metadataExtractionService.F(object);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    static boolean C(MetadataExtractionService metadataExtractionService, Object object, Object object2) {
        return metadataExtractionService.P(object, object2);
    }

    private float O(Object object) {
        return this.o.x(object);
    }

    public Object h(Object object, float f) {
        return this.P.T(object, Float.valueOf(f));
    }

    private void f(Object object, int n) {
        this.N.t(object, n);
    }

    static void A(MetadataExtractionService metadataExtractionService, Object object, Object object2) {
        metadataExtractionService.c(object, object2);
    }

    public Object Z(Object object) {
        return this.U.T(object, new Object[0]);
    }

    private void I(Object object, float f) {
        this.T.H(object, f);
    }

    private int D(Object object) {
        return this.h.R(object);
    }

    private void X(Object object, float f) {
        this.o.H(object, f);
    }

    static void I(MetadataExtractionService metadataExtractionService, Object object, float f) {
        metadataExtractionService.Y(object, f);
    }

    private static void a() {
        Object[] objectArray = ib;
        ib[0] = "\u0004[{\u0007";
        objectArray[1] = "tH\fe5b\u007fG\u001d*Hzl@\u0014c";
        objectArray[2] = Boolean.TYPE;
        MetadataExtractionService.jb[2] = "java/lang/Boolean";
        objectArray[3] = "\u0011\u0004%Oj,\u001a\u000b4\u0000\u0007,\u001a\u0016 ";
        objectArray[4] = "G?fG522\u001fmH$}_\u001fmU0h";
        objectArray[5] = "*X{\u001f";
        objectArray[6] = "m[3u'\u000f\u0018{8z6@u{8g\"U";
        objectArray[7] = "\u0006Z-";
        objectArray[8] = Integer.TYPE;
        MetadataExtractionService.jb[8] = "java/lang/Integer";
        objectArray[9] = "\n&pu";
        objectArray[10] = "~:HK";
        objectArray[11] = "#AG\u0015PBVaL\u001aA\r;aL\u0007U\u0018";
        objectArray[12] = "\bIKa";
        objectArray[13] = "(\u001b\u000fAW,#\u0014\u001e\u000e6\"(\u001f\u001aT";
        objectArray[14] = "\u0003\u0004_\u0001_5\u0004\u0006Bj\"X\u0001\nC\u0004\u0015\"\u0000T@\u001aeb\u0001\u0007\u0016\u0016\u0017>\u0002BTj_;[WO\u0017\u0005%IV.U\u0003(V]\u0012\b\u000f%\u0002:\u0015\u0011\u0000>@J\u0012Z\u0005 8";
        objectArray[15] = "vN\u0011gm&qL\f\f\u001aKw\u0013\u0003a66-\r\u0011`Wr}\u001d\u000e|-s#\u001e\u0010\fmrpH\u001c~1q5\n`64( \u0011\u001dl*:!p_j'%*L\u0002f*qMK\u001bi13=LPl/K";
        objectArray[16] = "\u0015dK8L\u0013\u0012fVS-~\u0017jW=\u0006\u0004\u00164T#vD\u0017g\u0002/\u0004\u0018\u0014\"@SL\u001dM7[.\u0016\u0003_6:m\f\u0014W8Fm\f\u0004GZ";
        objectArray[17] = "\u0003@6\u0016 O\u0004B+}B\"\u0001N*\u0013jX\u0000\u0010)\r\u001a\u0018[\u001d*\u001cgBE\u000f+}%\u001bT\u000f9\u0016!\u001b^@G";
        objectArray[18] = "HYt\u001bl>O[ip\u001bSJWh\u001e&)K\tk\u0000ViJZ=\f$5I\u001f\u007fpl0\u0010\nd\r6.\u0002\u000b\u0005N,9\n\u0005yN,)\u001ag";
        objectArray[19] = "f\u0004\u0018(;Bf^\u0012w[P o\u001dq0W\"\b^.;I[V\u0013&5K!WM%+;";
        Object[] objectArray2 = objectArray;
        objectArray[20] = "\u0010c\u0019KaA\u0017a\u0004 9,\u0012m\u0005N+V\u00133\u0006P[\u0016H>\u0005A&LV,\u0004 dJ[3\u000f\u001c9FVgh\u0010>\u0014I!\u000eObIU]";
    }

    static float p(MetadataExtractionService metadataExtractionService, Object object) {
        return metadataExtractionService.n(object);
    }

    static float h(MetadataExtractionService metadataExtractionService, Object object, float f) {
        return metadataExtractionService.p(object, f);
    }

    private void D(Object object, int n) {
        this.R.t(object, n);
    }

    public int V(Object object) {
        return this.oK.R(object);
    }

    static void W(MetadataExtractionService metadataExtractionService, Object object, int n) {
        metadataExtractionService.f(object, n);
    }

    public float d(Object object, float f) {
        return this.os.p(object, Float.valueOf(f));
    }

    private boolean B(Object object) {
        return this.op.V(object, new Object[0]);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                MetadataExtractionService.bb = MultiContainerRegistry.a(4935511688628247760L, -8293555703253465995L, MethodHandles.lookup().lookupClass()).a(235444542465157L);
                MetadataExtractionService.ib = new Object[21];
                MetadataExtractionService.jb = new String[21];
                MetadataExtractionService.a();
                MetadataExtractionService.hb = new HashMap<K, V>(13);
                var0 = MetadataExtractionService.bb ^ 74421193774478L;
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
                var8_3 = new long[93];
                var5_4 = 0;
                var6_5 = "\u00ca\u00d0\u00cbSi\u00f9\u008e\u00c4\u00d9k\u00c5\u00ce\u0011c5`\u009b`Vi\tt\u00b7\u00fa\u00c2\u00e7\u00ffkf9\u00cf\u0093\u00ea)-\u00d0\u0087Kc<\u00d1\u007f\u00de\u008bLp8\u00bb\u0097O\u009e\u00ab\u00a9\u001d\u001c\u00a3qA\u0011:\u00eb\u00b1\u00c84\u00d2\u00f6\u00b6\u00d5B\u00da\u00fc\u00c9E\u008aRU`\u00b2\u0086\u00e1~H\u00f1r\u00a8\u00e6h&u\u00d2\u00e7\u0098\u0090\u0081L\u009b\u0082\u008b\u001d`\u0016\u00d4\u00d6\u00d4\u00e2\u009c\u00fb>\u0087J\u00c7\u0081wf<\b\u001c?#\u00d9\u008d\u00ae\u00ef\u0006\u0011^\u00f7\r\u00fb\u000f\u00cb\u00b0ME\u000f\f\u00ee\u00bfF\u00cc\u009f\u00bf\u008d\u00ae\u00e8\n\u00d3\u0000\u00a2\u0013\u008a\u00cb\u00e7{INa\u00f37\u0006\u00c2.'\u008b\u008b\u00c9\u00df\u00af\u0012\u0090\u00b4\u00e7\u0091.\u00ce\u00a0\u008b\u001dr\u0085\u0097JVn\u0005.\u00de`\u00ad\u00a4\u00b4\u00b91\u00f4\f\u0019\u00aaq\u00a7\u00aeT\u000f\u00af\u00da\u00d7W\u00d2,\u00d0\u0003DK\u00fd\u008d\u00d8\u00eeHt\b)\u00f5\u0001\u001c\u00d0\u00c8W\u0000\u00ba\u00ca\u00c1\u0098\f\u0085:\u00dco\u00fb\u0082\u00af#\u00ca2\u007f\f\u0083_\u00fdh\u00fd\u00fcm\u0011\r\u009cd\u00ae\u001b\u00b0\u0092\u00e7\u00b1\u00ad/\u00032\u00ea\u000fMR\u00aa\u00cd\u00bcm\u00e1\u00cc\u0013\u00fe\u00b4i~$)!\n$\u009cc\u0086b\u00d9\u00e3Fo\u00ec\u009b\u007fi\u00a9\u008b\u00bb#A\b\u00c2~\u00e9\u0080\u00d3\u008f\u00a3r.\u00e8\u00a1o)#\u00af\u00a4\u00b5Uwp,\u00e3[e\u00c2D\u001c\u0090\u009b\u0017\u000e\u00af\u001a3\u00b5\u0088\u0018\u00b2p\u00c0\u00ccG@G\u00f4\u001d|RkO\u00f2\u00d5\t\u00f8\u001b\u0014\u009c\u00b3h\u0092%\u00bc\u0002\u00ba\u00a6!\u00eb\u00e9)E\u00ea\u00fbATe5\u001e\u0093\u00c3\u001f&\u00bf\u00c0m\u00aa\u009b\u0011k\u00c2\u001c)\u00d1X|/M\t-@f<\u009d\u00a7Dy\u00ca\u00fe2,$\u00ec\" \u0000\u009c\u001c$/J\u00f5\u00c4b\u00d7\u00b9\u009f\u00e6\u0091\u0014+\u00f2G\u0081=\u009b\u0013\u0001\u00d4\u00eb3\to_\u00a9\u00d1\u0096Z\u00eev \u00b8\u00a4K\u0087)\u009b*\u00fce\u00cf-\u0005\u00ac(\u00a0\u0013\u00d2\u00ba-R\"\u00d3\u00a1\u00921\u00e1\u00ae\u00e2v\u007f\u009c\u001a0w}O>\u00f8TH\u009biW\u0094u\u009bL\u00f4\u0098}\u00d7\u001dEL{\u008e\u00fc=\u0012\u00d0\u009bx\u00c8\u001d6L\u00e0\u0016\u0012\u00c4\u00ca\u00e6\u0096j\u00a3\u0096\u00edo\u007f\u00e0\u000b$\u00f6\u00e6\u0017\u00f3/[V  $\u00ce\u00b4\u00d0\u00d6>/B\u008d\u00e7\u00887\u0014\u00da\u00a1\u00cb\u00eeH\u001b\u00cfb\u00b7\u0096'\u00f6\u00c2\u0096\u00d8G\f\u0085\u00c6\u00a9\t\u00f8\u00f8\u00fc\u001d\u00f6\u00da\u0080h\t?p8\u00d0\u00e7\u00a4,\u00b3\u0081\u008f\u00d09|\u00f6\u00c8!\f\t\u00f7e\b\u00b8\u00cf$\u009e\u0095\u00fa\u00fd\u00a7`\u00f5\u0019\u0018\u00cf\u0002\u0003T\u00b5\u00fb1;\u00c5\u0087Z\u00e0\u00d4qi\u0011m+I\u0098\u0088!\u0088\u00e5\r(R\u0006\u0080\u00af?}@\u00a70^\u00f6\u00d1e\u00abuOF\u0094\u00e7\u001dE\u00db\u00d98&MR\u0013\u0011\u00d3\u009b\u0017c\u00f02\u00d3d\u00ad\u00d7\u000bh9g^\u00c8C\u00d6\u00c6\u00f5Z\u00895S\u00a3\u0012\u00f2:\u00a5Gm@\u00ab\u00cfQ\u001bF\u0082\u0084\u00c7M\u00ec\u0090W\u00c0r\u00b3.\u00a7\u00bd\u00e5\u0082@\u008b";
                var7_6 = "\u00ca\u00d0\u00cbSi\u00f9\u008e\u00c4\u00d9k\u00c5\u00ce\u0011c5`\u009b`Vi\tt\u00b7\u00fa\u00c2\u00e7\u00ffkf9\u00cf\u0093\u00ea)-\u00d0\u0087Kc<\u00d1\u007f\u00de\u008bLp8\u00bb\u0097O\u009e\u00ab\u00a9\u001d\u001c\u00a3qA\u0011:\u00eb\u00b1\u00c84\u00d2\u00f6\u00b6\u00d5B\u00da\u00fc\u00c9E\u008aRU`\u00b2\u0086\u00e1~H\u00f1r\u00a8\u00e6h&u\u00d2\u00e7\u0098\u0090\u0081L\u009b\u0082\u008b\u001d`\u0016\u00d4\u00d6\u00d4\u00e2\u009c\u00fb>\u0087J\u00c7\u0081wf<\b\u001c?#\u00d9\u008d\u00ae\u00ef\u0006\u0011^\u00f7\r\u00fb\u000f\u00cb\u00b0ME\u000f\f\u00ee\u00bfF\u00cc\u009f\u00bf\u008d\u00ae\u00e8\n\u00d3\u0000\u00a2\u0013\u008a\u00cb\u00e7{INa\u00f37\u0006\u00c2.'\u008b\u008b\u00c9\u00df\u00af\u0012\u0090\u00b4\u00e7\u0091.\u00ce\u00a0\u008b\u001dr\u0085\u0097JVn\u0005.\u00de`\u00ad\u00a4\u00b4\u00b91\u00f4\f\u0019\u00aaq\u00a7\u00aeT\u000f\u00af\u00da\u00d7W\u00d2,\u00d0\u0003DK\u00fd\u008d\u00d8\u00eeHt\b)\u00f5\u0001\u001c\u00d0\u00c8W\u0000\u00ba\u00ca\u00c1\u0098\f\u0085:\u00dco\u00fb\u0082\u00af#\u00ca2\u007f\f\u0083_\u00fdh\u00fd\u00fcm\u0011\r\u009cd\u00ae\u001b\u00b0\u0092\u00e7\u00b1\u00ad/\u00032\u00ea\u000fMR\u00aa\u00cd\u00bcm\u00e1\u00cc\u0013\u00fe\u00b4i~$)!\n$\u009cc\u0086b\u00d9\u00e3Fo\u00ec\u009b\u007fi\u00a9\u008b\u00bb#A\b\u00c2~\u00e9\u0080\u00d3\u008f\u00a3r.\u00e8\u00a1o)#\u00af\u00a4\u00b5Uwp,\u00e3[e\u00c2D\u001c\u0090\u009b\u0017\u000e\u00af\u001a3\u00b5\u0088\u0018\u00b2p\u00c0\u00ccG@G\u00f4\u001d|RkO\u00f2\u00d5\t\u00f8\u001b\u0014\u009c\u00b3h\u0092%\u00bc\u0002\u00ba\u00a6!\u00eb\u00e9)E\u00ea\u00fbATe5\u001e\u0093\u00c3\u001f&\u00bf\u00c0m\u00aa\u009b\u0011k\u00c2\u001c)\u00d1X|/M\t-@f<\u009d\u00a7Dy\u00ca\u00fe2,$\u00ec\" \u0000\u009c\u001c$/J\u00f5\u00c4b\u00d7\u00b9\u009f\u00e6\u0091\u0014+\u00f2G\u0081=\u009b\u0013\u0001\u00d4\u00eb3\to_\u00a9\u00d1\u0096Z\u00eev \u00b8\u00a4K\u0087)\u009b*\u00fce\u00cf-\u0005\u00ac(\u00a0\u0013\u00d2\u00ba-R\"\u00d3\u00a1\u00921\u00e1\u00ae\u00e2v\u007f\u009c\u001a0w}O>\u00f8TH\u009biW\u0094u\u009bL\u00f4\u0098}\u00d7\u001dEL{\u008e\u00fc=\u0012\u00d0\u009bx\u00c8\u001d6L\u00e0\u0016\u0012\u00c4\u00ca\u00e6\u0096j\u00a3\u0096\u00edo\u007f\u00e0\u000b$\u00f6\u00e6\u0017\u00f3/[V  $\u00ce\u00b4\u00d0\u00d6>/B\u008d\u00e7\u00887\u0014\u00da\u00a1\u00cb\u00eeH\u001b\u00cfb\u00b7\u0096'\u00f6\u00c2\u0096\u00d8G\f\u0085\u00c6\u00a9\t\u00f8\u00f8\u00fc\u001d\u00f6\u00da\u0080h\t?p8\u00d0\u00e7\u00a4,\u00b3\u0081\u008f\u00d09|\u00f6\u00c8!\f\t\u00f7e\b\u00b8\u00cf$\u009e\u0095\u00fa\u00fd\u00a7`\u00f5\u0019\u0018\u00cf\u0002\u0003T\u00b5\u00fb1;\u00c5\u0087Z\u00e0\u00d4qi\u0011m+I\u0098\u0088!\u0088\u00e5\r(R\u0006\u0080\u00af?}@\u00a70^\u00f6\u00d1e\u00abuOF\u0094\u00e7\u001dE\u00db\u00d98&MR\u0013\u0011\u00d3\u009b\u0017c\u00f02\u00d3d\u00ad\u00d7\u000bh9g^\u00c8C\u00d6\u00c6\u00f5Z\u00895S\u00a3\u0012\u00f2:\u00a5Gm@\u00ab\u00cfQ\u001bF\u0082\u0084\u00c7M\u00ec\u0090W\u00c0r\u00b3.\u00a7\u00bd\u00e5\u0082@\u008b".length();
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
                    var6_5 = "\u00f0iuhw\u00da\u00b6\u0088l\u001b\u00f3\u00c4\u0083\u00a6\u009b\u0013";
                    var7_6 = "\u00f0iuhw\u00da\u00b6\u0088l\u001b\u00f3\u00c4\u0083\u00a6\u009b\u0013".length();
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
        MetadataExtractionService.cb = var8_3;
        MetadataExtractionService.gb = new Integer[93];
    }

    private boolean L(Object object) {
        return this.oC.V(object, new Object[0]);
    }

    private float p(Object object, float f) {
        return this.d.p(object, Float.valueOf(f));
    }

    public void J(Object object, Object object2) {
        this.e.l(object, object2);
    }

    static float B(MetadataExtractionService metadataExtractionService, Object object) {
        return metadataExtractionService.a(object);
    }

    private double U(Object object) {
        return this.oX.s(object, new Object[0]);
    }

    static void P(MetadataExtractionService metadataExtractionService, Object object, float f) {
        metadataExtractionService.m(object, f);
    }

    private float G(Object object) {
        return this.I.x(object);
    }

    static int g(MetadataExtractionService metadataExtractionService, Object object) {
        return metadataExtractionService.N(object);
    }

    static void H(MetadataExtractionService metadataExtractionService, Object object, float f) {
        metadataExtractionService.i(object, f);
    }

    private boolean P(Object object, Object object2) {
        return this.C.V(object, object2);
    }

    private float B(Object object) {
        return this.s.p(object, new Object[0]);
    }

    static boolean J(MetadataExtractionService metadataExtractionService, Object object) {
        return metadataExtractionService.r(object);
    }

    static boolean g(MetadataExtractionService metadataExtractionService, Object object, Object object2) {
        return metadataExtractionService.t(object, object2);
    }

    static void S(MetadataExtractionService metadataExtractionService, Object object, float f) {
        metadataExtractionService.d(object, f);
    }

    public int a(Object object) {
        return this.a.R(object);
    }

    static Object h(MetadataExtractionService metadataExtractionService, Object object, Object object2) {
        return metadataExtractionService.l(object, object2);
    }

    static boolean E(MetadataExtractionService metadataExtractionService, Object object) {
        return metadataExtractionService.L(object);
    }

    static Object p(MetadataExtractionService metadataExtractionService, Object object) {
        return metadataExtractionService.x(object);
    }

    private Object u(Object object) {
        return this.Z.T(object, new Object[0]);
    }

    static void w(MetadataExtractionService metadataExtractionService, Object object, float f) {
        metadataExtractionService.I(object, f);
    }

    private Object l() {
        return this.oA.Z(null);
    }

    public boolean R(Object object, Object object2) {
        return this.k.V(object, object2);
    }

    public Object S(Object object) {
        return this.B.Z(object);
    }

    static void U(MetadataExtractionService metadataExtractionService, Object object) {
        metadataExtractionService.s(object);
    }

    private float I(Object object) {
        return this.om.x(object);
    }

    private void c(Object object, Object object2) {
        this.t.L(object, object2);
    }

    static float c(MetadataExtractionService metadataExtractionService, Object object) {
        return metadataExtractionService.g(object);
    }

    private double D(Object object, Object object2) {
        return this.v.s(object, object2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(MetadataExtractionService.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(MetadataExtractionService.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

