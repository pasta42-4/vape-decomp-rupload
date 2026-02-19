/*
 * Decompiled with CFR 0.152.
 */
package com.data.brokerage;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.concurrency.management.ThreadPoolCoordinator;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
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
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ContextualDataBroker
extends CryptoProtocolEngine {
    public HK Nr;
    public HK NJ;
    private static final Map hb;
    private final ReflectionUtilityService y;
    private static int[] G;
    public final ReflectionUtilityService Nk;
    private HK v;
    public ReflectionUtilityService NQ;
    private ReflectionUtilityService N;
    private final ReflectionUtilityService NN;
    public final ReflectionUtilityService NE;
    public ReflectionUtilityService Nl;
    private ReflectionUtilityService e;
    private ReflectionUtilityService N_;
    private final HK NK;
    public ReflectionUtilityService w;
    private HK J;
    private HK Nj;
    private ReflectionUtilityService NP;
    public HK m;
    private HK Nc;
    private ReflectionUtilityService Nb;
    private HK A;
    private HK X;
    private HK j;
    public final ReflectionUtilityService Np;
    private ReflectionUtilityService NC;
    private HK u;
    private HK L;
    private final HK K;
    public HK Nx;
    private HK C;
    public final HK F;
    private HK NV;
    public final ReflectionUtilityService t;
    public final ReflectionUtilityService Nf;
    private HK s;
    public HK Nn;
    public final ReflectionUtilityService g;
    public HK N0;
    public final ReflectionUtilityService N2;
    private ReflectionUtilityService NY;
    public ReflectionUtilityService N7;
    public final ReflectionUtilityService Ns;
    private HK N1;
    public final ReflectionUtilityService r;
    private static final Object[] ib;
    public HK NS;
    private final HK ND;
    private static final long bb;
    private HK k;
    private HK o;
    private final HK NU;
    public final ReflectionUtilityService i;
    public ReflectionUtilityService Nz;
    public final ReflectionUtilityService W;
    public HK N6;
    public HK D;
    public HK NO;
    private HK f;
    private HK NX;
    public final ReflectionUtilityService R;
    private final HK NW;
    public ReflectionUtilityService U;
    private HK Nh;
    public ReflectionUtilityService H;
    public final ReflectionUtilityService Nw;
    public final ReflectionUtilityService NG;
    private final HK NI;
    private ReflectionUtilityService N8;
    private final HK Nd;
    public ReflectionUtilityService Nm;
    public final ReflectionUtilityService vF;
    public HK No;
    private static final String[] jb;
    public HK NA;
    private HK Ng;
    private final ReflectionUtilityService E;
    public final ReflectionUtilityService T;
    public ReflectionUtilityService N5;
    public HK NF;
    private ReflectionUtilityService h;
    private ReflectionUtilityService b;
    public HK N4;
    private HK Z;
    public HK n;
    private final HK NB;
    private HK N3;
    public HK Q;
    private ReflectionUtilityService q;
    public ReflectionUtilityService O;
    public HK Ne;
    public HK Nq;
    public HK p;
    public ReflectionUtilityService NT;
    private static final Integer[] gb;
    private static final long[] cb;
    private HK NM;
    private HK NR;
    public HK V;
    private final ReflectionUtilityService Nv;
    public HK c;
    public final ReflectionUtilityService Ny;
    private HK NZ;
    private ReflectionUtilityService NH;
    private final HK d;
    public final ReflectionUtilityService M;
    private ReflectionUtilityService Y;
    private ReflectionUtilityService S;
    public final ReflectionUtilityService a;
    private HK I;
    private HK z;
    public final ReflectionUtilityService P;
    private HK Nu;
    private HK Ni;
    private final ReflectionUtilityService Na;
    public HK NL;
    private final HK N9;
    public ReflectionUtilityService B;
    private final HK Nt;

    private Object v(Object object) {
        return this.Nf.Z(object);
    }

    private double X(Object object) {
        return this.N5.C(object);
    }

    public static void x(int[] nArray) {
        G = nArray;
    }

    private void l(Object object) {
        this.Nh.V(object);
    }

    static Object J(ContextualDataBroker contextualDataBroker, Object object, float f) {
        return contextualDataBroker.J(object, f);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/UW" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static void G(ContextualDataBroker contextualDataBroker, Object object, double d2, boolean bl, Object object2, Object object3) {
        contextualDataBroker.B(object, d2, bl, object2, object3);
    }

    static void u(ContextualDataBroker contextualDataBroker, Object object, float f) {
        contextualDataBroker.T(object, f);
    }

    private void T(Object object, float f) {
        this.R.H(object, f);
    }

    static void w(ContextualDataBroker contextualDataBroker, Object object, Object object2) {
        contextualDataBroker.x(object, object2);
    }

    static void d(ContextualDataBroker contextualDataBroker, Object object, boolean bl) {
        contextualDataBroker.G(object, bl);
    }

    private void O(Object object, float f) {
        this.NH.H(object, f);
    }

    static float n(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.v(object);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ContextualDataBroker.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private Object J(Object object, float f) {
        return this.k.T(object, Float.valueOf(f));
    }

    static void Q(ContextualDataBroker contextualDataBroker, Object object, boolean bl) {
        contextualDataBroker.i(object, bl);
    }

    static boolean J(ContextualDataBroker contextualDataBroker, Object object, Object object2) {
        return contextualDataBroker.w(object, object2);
    }

    private Object i(Object object) {
        return this.j.T(object, new Object[0]);
    }

    private boolean H(Object object) {
        return this.Y.R(object);
    }

    private void d(Object object, Object object2, boolean bl) {
        block3: {
            block2: {
                try {
                    if (GeometryCalculator.C() < 15) break block2;
                    this.NI.l(object, object2);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualDataBroker.a(customSystemException);
                }
            }
            this.NI.l(object, object2, bl);
        }
    }

    static void B(ContextualDataBroker contextualDataBroker, Object object, UUID uUID) {
        contextualDataBroker.J(object, uUID);
    }

    private void c(Object object, boolean bl) {
        this.N_.B(object, bl);
    }

    static Object b(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.N(object);
    }

    static void h(ContextualDataBroker contextualDataBroker, Object object, Object object2) {
        contextualDataBroker.V(object, object2);
    }

    private void G(Object object, boolean bl) {
        this.Y.B(object, bl);
    }

    static void a(ContextualDataBroker contextualDataBroker, Object object) {
        contextualDataBroker.W(object);
    }

    private void s(Object object, double d2, double d3, double d4, float f, float f2) {
        this.d.l(object, d2, d3, d4, Float.valueOf(f), Float.valueOf(f2));
    }

    private Object J(Object object) {
        return this.c.T(object, new Object[0]);
    }

    static void y(ContextualDataBroker contextualDataBroker, Object object, double d2) {
        contextualDataBroker.a(object, d2);
    }

    private Object R(Object object) {
        return this.Nw.Z(object);
    }

    static void E(ContextualDataBroker contextualDataBroker, Object object, float f) {
        contextualDataBroker.Z(object, f);
    }

    private float Q(Object object) {
        return this.t.x(object);
    }

    static void F(ContextualDataBroker contextualDataBroker, Object object, double d2) {
        contextualDataBroker.O(object, d2);
    }

    private void I(Object object, int n) {
        this.r.t(object, n);
    }

    private void b(Object object, double d2) {
        this.vF.A(object, d2);
    }

    private boolean V(Object object) {
        return this.L.V(object, new Object[0]);
    }

    static boolean B(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.D(object);
    }

    private void V(Object object, Object object2) {
        this.Nf.L(object, object2);
    }

    private float B(Object object) {
        return this.NA.p(object, new Object[0]);
    }

    static void C(ContextualDataBroker contextualDataBroker, Object object, double d2) {
        contextualDataBroker.M(object, d2);
    }

    private UUID V(Object object) {
        return (UUID)this.Nt.T(object, new Object[0]);
    }

    private void L(Object object, Object object2) {
        this.NC.L(object, object2);
    }

    static void v(ContextualDataBroker contextualDataBroker, Object object, double d2, double d3, double d4, float f, float f2) {
        contextualDataBroker.s(object, d2, d3, d4, f, f2);
    }

    private boolean y(Object object) {
        return this.M.R(object);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/UW" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static boolean v(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.i(object);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1393;
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
                throw new RuntimeException("a/UW", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ContextualDataBroker.gb[n2] = n3;
        }
        return gb[n2];
    }

    private void E(Object object, double d2) {
        this.Np.A(object, d2);
    }

    static void i(ContextualDataBroker contextualDataBroker, Object object, float f) {
        contextualDataBroker.k(object, f);
    }

    public static int[] m() {
        return G;
    }

    private float T(Object object) {
        return this.Nz.x(object);
    }

    static float V(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.r(object);
    }

    static Random y(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.N(object);
    }

    static boolean O(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.F(object);
    }

    private boolean i(Object object) {
        return this.Nn.V(object, new Object[0]);
    }

    static boolean G(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.A(object);
    }

    static void d(ContextualDataBroker contextualDataBroker, Object object) {
        contextualDataBroker.K(object);
    }

    static boolean s(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.e(object);
    }

    private void L(Object object, double d2) {
        this.Nl.A(object, d2);
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

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = ContextualDataBroker.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ContextualDataBroker.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private void W(Object object) {
        this.N1.V(object);
    }

    static Object f(ContextualDataBroker contextualDataBroker, Object object, Object object2) {
        return contextualDataBroker.w(object, object2);
    }

    static boolean c(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.Q(object);
    }

    static Object D(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.z(object);
    }

    private double q(Object object) {
        return this.Nl.C(object);
    }

    private void B(Object object, double d2, double d3, double d4) {
        this.n.l(object, d2, d3, d4);
    }

    private void e(Object object, double d2, double d3, double d4) {
        this.Q.l(object, d2, d3, d4);
    }

    static void a(ContextualDataBroker contextualDataBroker, Object object, boolean bl) {
        contextualDataBroker.y(object, bl);
    }

    private double P(Object object) {
        return this.vF.C(object);
    }

    private float a(Object object) {
        return this.R.x(object);
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
                n3 = 9;
                break;
            }
            case 1: {
                n3 = 17;
                break;
            }
            case 2: {
                n3 = 14;
                break;
            }
            case 3: {
                n3 = 55;
                break;
            }
            case 4: {
                n3 = 51;
                break;
            }
            case 5: {
                n3 = 3;
                break;
            }
            case 6: {
                n3 = 37;
                break;
            }
            case 7: {
                n3 = 5;
                break;
            }
            case 8: {
                n3 = 52;
                break;
            }
            case 9: {
                n3 = 10;
                break;
            }
            case 10: {
                n3 = 45;
                break;
            }
            case 11: {
                n3 = 2;
                break;
            }
            case 12: {
                n3 = 35;
                break;
            }
            case 13: {
                n3 = 63;
                break;
            }
            case 14: {
                n3 = 33;
                break;
            }
            case 15: {
                n3 = 0;
                break;
            }
            case 16: {
                n3 = 48;
                break;
            }
            case 17: {
                n3 = 38;
                break;
            }
            case 18: {
                n3 = 61;
                break;
            }
            case 19: {
                n3 = 49;
                break;
            }
            case 20: {
                n3 = 7;
                break;
            }
            case 21: {
                n3 = 25;
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
                n3 = 21;
                break;
            }
            case 25: {
                n3 = 31;
                break;
            }
            case 26: {
                n3 = 39;
                break;
            }
            case 27: {
                n3 = 8;
                break;
            }
            case 28: {
                n3 = 1;
                break;
            }
            case 29: {
                n3 = 43;
                break;
            }
            case 30: {
                n3 = 30;
                break;
            }
            case 31: {
                n3 = 28;
                break;
            }
            case 32: {
                n3 = 42;
                break;
            }
            case 33: {
                n3 = 18;
                break;
            }
            case 34: {
                n3 = 56;
                break;
            }
            case 35: {
                n3 = 22;
                break;
            }
            case 36: {
                n3 = 12;
                break;
            }
            case 37: {
                n3 = 19;
                break;
            }
            case 38: {
                n3 = 20;
                break;
            }
            case 39: {
                n3 = 44;
                break;
            }
            case 40: {
                n3 = 60;
                break;
            }
            case 41: {
                n3 = 59;
                break;
            }
            case 42: {
                n3 = 11;
                break;
            }
            case 43: {
                n3 = 41;
                break;
            }
            case 44: {
                n3 = 27;
                break;
            }
            case 45: {
                n3 = 34;
                break;
            }
            case 46: {
                n3 = 57;
                break;
            }
            case 47: {
                n3 = 46;
                break;
            }
            case 48: {
                n3 = 62;
                break;
            }
            case 49: {
                n3 = 6;
                break;
            }
            case 50: {
                n3 = 40;
                break;
            }
            case 51: {
                n3 = 15;
                break;
            }
            case 52: {
                n3 = 47;
                break;
            }
            case 53: {
                n3 = 53;
                break;
            }
            case 54: {
                n3 = 36;
                break;
            }
            case 55: {
                n3 = 13;
                break;
            }
            case 56: {
                n3 = 58;
                break;
            }
            case 57: {
                n3 = 26;
                break;
            }
            case 58: {
                n3 = 32;
                break;
            }
            case 59: {
                n3 = 50;
                break;
            }
            case 60: {
                n3 = 4;
                break;
            }
            case 61: {
                n3 = 29;
                break;
            }
            case 62: {
                n3 = 16;
                break;
            }
            default: {
                n3 = 23;
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
        ContextualDataBroker.jb[n4] = new String(cArray);
        return n4;
    }

    static void J(ContextualDataBroker contextualDataBroker, Object object) {
        contextualDataBroker.x(object);
    }

    private boolean O(Object object) {
        return this.Nu.V(object, new Object[0]);
    }

    static float S(ContextualDataBroker contextualDataBroker, Object object, Object object2) {
        return contextualDataBroker.X(object, object2);
    }

    static float d(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.A(object);
    }

    static void K(ContextualDataBroker contextualDataBroker, Object object, Object object2, Object object3) {
        contextualDataBroker.y(object, object2, object3);
    }

    static boolean u(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.N(object);
    }

    static void v(ContextualDataBroker contextualDataBroker, Object object, boolean bl) {
        contextualDataBroker.Q(object, bl);
    }

    static void H(ContextualDataBroker contextualDataBroker, Object object, float f) {
        contextualDataBroker.O(object, f);
    }

    static void K(ContextualDataBroker contextualDataBroker, Object object, double d2) {
        contextualDataBroker.r(object, d2);
    }

    private int Q(Object object) {
        return this.r.R(object);
    }

    private void G(Object object, double d2, boolean bl, Object object2, Object object3) {
        this.N3.l(object, d2, bl, object2, object3);
    }

    static float A(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.R(object);
    }

    static void g(ContextualDataBroker contextualDataBroker, Object object, int n, boolean bl) {
        contextualDataBroker.k(object, n, bl);
    }

    static void R(ContextualDataBroker contextualDataBroker, Object object, Object object2, double d2, double d3, double d4) {
        contextualDataBroker.K(object, object2, d2, d3, d4);
    }

    static boolean z(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.W(object);
    }

    private void m(Object object, boolean bl) {
        this.y.B(object, bl);
    }

    private void X(Object object, Object object2) {
        this.NP.L(object, object2);
    }

    private boolean v(Object object) {
        return this.T.R(object);
    }

    static boolean D(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.K(object);
    }

    static Object e(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.R(object);
    }

    private Object Y(Object object) {
        return this.NC.Z(object);
    }

    static void Z(ContextualDataBroker contextualDataBroker, Object object, boolean bl) {
        contextualDataBroker.O(object, bl);
    }

    static void E(ContextualDataBroker contextualDataBroker, Object object, double d2, double d3, double d4) {
        contextualDataBroker.B(object, d2, d3, d4);
    }

    static double C(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.q(object);
    }

    private void c(Object object, double d2) {
        this.NT.A(object, d2);
    }

    static boolean n(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.v(object);
    }

    private void X(Object object, double d2, double d3, double d4) {
        this.NK.l(object, d2, d3, d4);
    }

    static boolean q(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.k(object);
    }

    private void z(Object object, float f) {
        this.t.H(object, f);
    }

    static double X(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.j(object);
    }

    static int y(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.x(object);
    }

    private float G(Object object) {
        try {
            if (GameVersionEnumerator.MC_1_21_6.H()) {
                return (float)this.i.C(object);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualDataBroker.a(customSystemException);
        }
        return this.i.x(object);
    }

    private void y(Object object, float f) {
        try {
            if (GameVersionEnumerator.MC_1_21_6.H()) {
                this.i.A(object, f);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualDataBroker.a(customSystemException);
        }
        this.i.H(object, f);
    }

    private int x(Object object) {
        return this.W.R(object);
    }

    private Object p(Object object) {
        return this.NV.T(object, new Object[0]);
    }

    private float r(Object object) {
        return this.Nb.x(object);
    }

    private void K(Object object, Object object2, double d2, double d3, double d4) {
        this.Q.l(object, object2, d2, d3, d4);
    }

    static void P(ContextualDataBroker contextualDataBroker, Object object, double d2, double d3, double d4) {
        contextualDataBroker.X(object, d2, d3, d4);
    }

    static boolean g(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.d(object);
    }

    static boolean X(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.l(object);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ContextualDataBroker() {
        block175: {
            block176: {
                block174: {
                    block172: {
                        block171: {
                            block168: {
                                block169: {
                                    block166: {
                                        block167: {
                                            block164: {
                                                block162: {
                                                    block161: {
                                                        block158: {
                                                            block159: {
                                                                block157: {
                                                                    block155: {
                                                                        block154: {
                                                                            block147: {
                                                                                block153: {
                                                                                    block150: {
                                                                                        block148: {
                                                                                            block140: {
                                                                                                block146: {
                                                                                                    block144: {
                                                                                                        block143: {
                                                                                                            block141: {
                                                                                                                block135: {
                                                                                                                    block136: {
                                                                                                                        block139: {
                                                                                                                            block137: {
                                                                                                                                block138: {
                                                                                                                                    block126: {
                                                                                                                                        block133: {
                                                                                                                                            block134: {
                                                                                                                                                block132: {
                                                                                                                                                    block130: {
                                                                                                                                                        block129: {
                                                                                                                                                            block127: {
                                                                                                                                                                block128: {
                                                                                                                                                                    var1_1 = ContextualDataBroker.bb ^ 135808622212770L;
                                                                                                                                                                    super(ReflectionMetadataResolver.PE);
                                                                                                                                                                    this.r = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)26336, (long)(275913093264352966L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Integer.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                                                    this.R = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)32708, (long)(5136498182737575882L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Float.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                                                    this.t = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)13109, (long)(3775003796686566184L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Float.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                                                    this.T = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)31174, (long)(1857100966290012599L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Boolean.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                                                    this.W = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)9130, (long)(3978607429795505055L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Integer.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                                                    this.P = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)7265, (long)(127182591013379110L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Double.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                                                    this.vF = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)20331, (long)(7317346501043785630L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Double.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                                                    this.Np = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)10692, (long)(4274318334098434365L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Double.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                                                    this.Ny = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)1662, (long)(3566402792989804117L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Float.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                                                    this.Ns = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)22710, (long)(3640464358070032556L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Float.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                                                    this.Nv = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)20301, (long)(847935045541924666L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Double.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                                                    this.E = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)13186, (long)(6796310898559251353L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Double.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                                                    this.NN = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)25675, (long)(7307644472068547681L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Double.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                                                    this.Nf = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)31730, (long)(1655241868121979903L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.bU, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                                                    this.Nw = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)23442, (long)(7170550317568302078L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.PE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                                                    this.NG = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)28462, (long)(3375465739873693485L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Random.class, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                                                    this.a = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)29463, (long)(3547402777197392738L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Boolean.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                                                    this.i = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)23653, (long)(3403656958871051362L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Float.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                                                    this.NE = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)26838, (long)(2898948147216853154L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Integer.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                                                    var3_2 = ContextualDataBroker.m();
                                                                                                                                                                    try {
                                                                                                                                                                        try {
                                                                                                                                                                            try {
                                                                                                                                                                                try {
                                                                                                                                                                                    try {
                                                                                                                                                                                        this.Na = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)31489, (long)(3447554814145510195L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, UUID.class, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                                                                        this.g = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)22732, (long)(4484880259607959711L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Boolean.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                                                                        if (var3_2 != null) break block126;
                                                                                                                                                                                        if (GeometryCalculator.C() >= 35) {
                                                                                                                                                                                        }
                                                                                                                                                                                        ** GOTO lbl155
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (CustomSystemException v0) {
                                                                                                                                                                                        throw ContextualDataBroker.a(v0);
                                                                                                                                                                                    }
                                                                                                                                                                                    this.S = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)1178, (long)(3890800047020164265L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.YN, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                                                                    v1 = this;
                                                                                                                                                                                    v2 = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)9365, (long)(6328822540761326753L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.YN, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                                                                    if (var3_2 != null) break block127;
                                                                                                                                                                                }
                                                                                                                                                                                catch (CustomSystemException v3) {
                                                                                                                                                                                    throw ContextualDataBroker.a(v3);
                                                                                                                                                                                }
                                                                                                                                                                                v1.NP = v2;
                                                                                                                                                                                if (GeometryCalculator.C() < 37) break block128;
                                                                                                                                                                            }
                                                                                                                                                                            catch (CustomSystemException v4) {
                                                                                                                                                                                throw ContextualDataBroker.a(v4);
                                                                                                                                                                            }
                                                                                                                                                                            this.h = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)22117, (long)(183604855291418236L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.rG, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                                                            if (var3_2 == null) break block129;
                                                                                                                                                                        }
                                                                                                                                                                        catch (CustomSystemException v5) {
                                                                                                                                                                            throw ContextualDataBroker.a(v5);
                                                                                                                                                                        }
                                                                                                                                                                        AbstractComputationKernel.I(new String[4]);
                                                                                                                                                                    }
                                                                                                                                                                    catch (CustomSystemException v6) {
                                                                                                                                                                        throw ContextualDataBroker.a(v6);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                v1 = this;
                                                                                                                                                                v2 = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)31060, (long)(1067011438013561170L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Boolean.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                                            }
                                                                                                                                                            v1.B = v2;
                                                                                                                                                        }
                                                                                                                                                        try {
                                                                                                                                                            block131: {
                                                                                                                                                                try {
                                                                                                                                                                    try {
                                                                                                                                                                        try {
                                                                                                                                                                            this.e = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)24343, (long)(8282992852640538472L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.EN, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                                                            this.N2 = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)7412, (long)(989408270965923007L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Boolean.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                                                            this.M = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)15836, (long)(415603861189262751L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Boolean.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                                                            this.O = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)24033, (long)(3941404919855062297L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Float.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                                                            this.p = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)13323, (long)(2174247210427872368L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Float.TYPE, (Object)new Class[]{ReflectionMetadataResolver.PE}, (long)6047525381604637734L, (long)var1_1);
                                                                                                                                                                            this.N0 = ((StatefulEventToggle)ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)25861, (long)(6940780954140943720L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (Object)ReflectionMetadataResolver.V_, (Object)new Class[0], (long)6046667200837870127L, (long)var1_1).V(GameVersionEnumerator.MC_1_21_4.R(), ReflectionMetadataResolver.Vk)).M();
                                                                                                                                                                            this.K = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)11907, (long)(6596369136916754113L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Double.TYPE, Double.TYPE}, (long)6047525381604637734L, (long)var1_1);
                                                                                                                                                                            v7 = this;
                                                                                                                                                                            v8 = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)18775, (long)(5967822664753449313L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                                                                                                                                                                            if (var3_2 != null) break block130;
                                                                                                                                                                            v7.N6 = v8;
                                                                                                                                                                            if (GeometryCalculator.C() < 37) break block131;
                                                                                                                                                                        }
                                                                                                                                                                        catch (CustomSystemException v9) {
                                                                                                                                                                            throw ContextualDataBroker.a(v9);
                                                                                                                                                                        }
                                                                                                                                                                        if (GeometryCalculator.C() >= 50) break block131;
                                                                                                                                                                    }
                                                                                                                                                                    catch (CustomSystemException v10) {
                                                                                                                                                                        throw ContextualDataBroker.a(v10);
                                                                                                                                                                    }
                                                                                                                                                                    this.k = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)20374, (long)(5794052425212235666L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)false, (Object)ReflectionMetadataResolver.YN, (Object)new Class[]{Float.TYPE}, (long)6047525381604637734L, (long)var1_1);
                                                                                                                                                                    if (var3_2 == null) break block132;
                                                                                                                                                                }
                                                                                                                                                                catch (CustomSystemException v11) {
                                                                                                                                                                    throw ContextualDataBroker.a(v11);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            v7 = this;
                                                                                                                                                            v8 = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)20530, (long)(8536181279331029002L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.YN, (Object)new Class[]{Float.TYPE}, (long)6047525381604637734L, (long)var1_1);
                                                                                                                                                        }
                                                                                                                                                        catch (CustomSystemException v12) {
                                                                                                                                                            throw ContextualDataBroker.a(v12);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    v7.k = v8;
                                                                                                                                                }
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        this.o = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)12595, (long)(3534029976065569149L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Double.TYPE, (Object)new Class[]{ReflectionMetadataResolver.t}, (long)6047525381604637734L, (long)var1_1);
                                                                                                                                                        this.N1 = ((StatefulEventToggle)((StatefulEventToggle)ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)12479, (long)(5004948927289061613L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), Void.TYPE, (Object)new Class[0], (long)6046667200837870127L, (long)var1_1).e(GameVersionEnumerator.MC_1_20_6.g(), (String)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)12672, (long)(1135637509864550887L ^ var1_1)), (long)6046729844157453427L, (long)var1_1))).n(GameVersionEnumerator.MC_1_20_6.g(), ObjectLifecycleTracker.z)).M();
                                                                                                                                                        this.A = ((StatefulEventToggle)((StatefulEventToggle)ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)3758, (long)(3856613691778322110L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (Object)ReflectionMetadataResolver.P2, (Object)new Class[0], (long)6046667200837870127L, (long)var1_1).e(GameVersionEnumerator.MC_1_20_6.g(), (String)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)12261, (long)(4040226982976122766L ^ var1_1)), (long)6046729844157453427L, (long)var1_1))).n(GameVersionEnumerator.MC_1_20_6.g(), ObjectLifecycleTracker.z)).M();
                                                                                                                                                        v13 = (int)GameVersionEnumerator.MC_1_21_4.H();
                                                                                                                                                        if (var3_2 != null) break block133;
                                                                                                                                                        if (v13 == 0) break block134;
                                                                                                                                                    }
                                                                                                                                                    catch (CustomSystemException v14) {
                                                                                                                                                        throw ContextualDataBroker.a(v14);
                                                                                                                                                    }
                                                                                                                                                    this.f = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)10, (long)(6097195224497700928L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), Void.TYPE, (Object)new Class[0], (long)6046667200837870127L, (long)var1_1).M();
                                                                                                                                                    this.I = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)25260, (long)(7282218969027191514L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (Object)ReflectionMetadataResolver.P2, (Object)new Class[0], (long)6046667200837870127L, (long)var1_1).M();
                                                                                                                                                    this.z = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)7423, (long)(8441419986252258317L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (Object)ReflectionMetadataResolver.YN, (Object)new Class[]{ReflectionMetadataResolver.YN}, (long)6046667200837870127L, (long)var1_1).M();
                                                                                                                                                }
                                                                                                                                                catch (CustomSystemException v15) {
                                                                                                                                                    throw ContextualDataBroker.a(v15);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            this.NL = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)18360, (long)(1884556464159655829L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Double.TYPE, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                                                                                                                                            this.NX = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)26031, (long)(2625653655883425209L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                                                                                                                                            this.Nc = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)17280, (long)(8151018763971298163L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                                                                                                                                            this.j = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)2275, (long)(2670632455582206191L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.PE, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                                                                                                                                            this.NM = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)8843, (long)(1766253891198706421L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                                                                                                                                            this.L = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)2227, (long)(5074166622974691397L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                                                                                                                                            this.Ng = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)30194, (long)(573415950062695880L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                                                                                                                                            this.NV = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)18102, (long)(4536702270671390347L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.YN, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                                                                                                                                            this.Z = ((StatefulEventToggle)ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)23402, (long)(4511394012683115385L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (Object)ReflectionMetadataResolver.P2, (Object)new Class[0], (long)6046667200837870127L, (long)var1_1).V(GameVersionEnumerator.MC_1_21_4.R(), ReflectionMetadataResolver.Uz)).M();
                                                                                                                                            v13 = GeometryCalculator.C();
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    v16 = 50;
                                                                                                                                                    if (var3_2 != null) break block135;
                                                                                                                                                    if (v13 < v16) break block136;
                                                                                                                                                }
                                                                                                                                                catch (CustomSystemException v17) {
                                                                                                                                                    throw ContextualDataBroker.a(v17);
                                                                                                                                                }
                                                                                                                                                this.N4 = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)19304, (long)(8090598938631113623L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Float.TYPE, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                                                                                                                                                this.NO = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)25570, (long)(920682174391002073L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Float.TYPE, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                                                                                                                                                this.NS = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)27725, (long)(9003122157169756L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                                                                                                                                                this.Nh = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)17951, (long)(330413021475341840L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), Void.TYPE, (Object)new Class[0], (long)6046667200837870127L, (long)var1_1).M();
                                                                                                                                                this.v = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)21313, (long)(261825575913100223L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (Object)ReflectionMetadataResolver.FI, (Object)new Class[0], (long)6046667200837870127L, (long)var1_1).M();
                                                                                                                                                this.q = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)19777, (long)(3853140326682496366L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (Object)ReflectionMetadataResolver.FI, (long)6047641235674512400L, (long)var1_1).p();
                                                                                                                                                this.N_ = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)13383, (long)(8858585903878468655L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), Boolean.TYPE, (long)6047641235674512400L, (long)var1_1).p();
                                                                                                                                                this.Y = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)9052, (long)(8310191587418432323L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), Boolean.TYPE, (long)6047641235674512400L, (long)var1_1).p();
                                                                                                                                                this.NY = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)1206, (long)(8699444573057172629L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), Boolean.TYPE, (long)6047641235674512400L, (long)var1_1).p();
                                                                                                                                                this.NC = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)1424, (long)(2718455442467210645L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (Object)ReflectionMetadataResolver.YN, (long)6047641235674512400L, (long)var1_1).p();
                                                                                                                                                this.Nj = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)3984, (long)(1598872936816529369L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (Object)ReflectionMetadataResolver.YN, (Object)new Class[]{ReflectionMetadataResolver.YN}, (long)6046667200837870127L, (long)var1_1).M();
                                                                                                                                                this.b = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)17521, (long)(4844041147784889456L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), Boolean.TYPE, (long)6047641235674512400L, (long)var1_1).p();
                                                                                                                                                this.u = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)14035, (long)(8788292485794363018L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), Void.TYPE, (Object)new Class[]{Boolean.TYPE, Boolean.TYPE, ReflectionMetadataResolver.YN}, (long)6046667200837870127L, (long)var1_1).M();
                                                                                                                                                if (var3_2 == null) break block136;
                                                                                                                                            }
                                                                                                                                            catch (CustomSystemException v18) {
                                                                                                                                                throw ContextualDataBroker.a(v18);
                                                                                                                                            }
lbl155:
                                                                                                                                            // 2 sources

                                                                                                                                            this.NT = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)26019, (long)(8365156812757476855L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Double.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                            this.Nl = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)17824, (long)(6130395350214575584L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Double.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                            this.Nm = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)30502, (long)(8944790364772087560L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Double.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                            this.N5 = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)9737, (long)(4756899320543438377L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Double.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                            this.NQ = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)11103, (long)(5947090485636885315L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Double.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                            this.U = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)5999, (long)(4678673520666826547L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Double.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                            this.B = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)2639, (long)(1234167711192074942L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Boolean.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                            this.N7 = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)24557, (long)(685480848674103208L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Float.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                            this.Nz = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)15137, (long)(8623467658782341945L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Float.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                            this.N2 = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)21444, (long)(3401659255474820072L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Boolean.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                            this.M = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)4343, (long)(4947005985989939345L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Boolean.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                            this.p = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)26794, (long)(2982530223185045757L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Float.TYPE, (Object)new Class[]{ReflectionMetadataResolver.PE}, (long)6047525381604637734L, (long)var1_1);
                                                                                                                                            this.NJ = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)23153, (long)(3809443068704954964L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                                                                                                                                        }
                                                                                                                                        catch (CustomSystemException v19) {
                                                                                                                                            throw ContextualDataBroker.a(v19);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            v20 = this;
                                                                                                                                            v21 = this;
                                                                                                                                            v22 /* !! */  = GeometryCalculator.C();
                                                                                                                                            if (var3_2 != null) break block137;
                                                                                                                                            if (v22 /* !! */  != 13) break block138;
                                                                                                                                        }
                                                                                                                                        catch (CustomSystemException v23) {
                                                                                                                                            throw ContextualDataBroker.a(v23);
                                                                                                                                        }
                                                                                                                                        v24 = ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)13514, (long)(1123612993919415542L ^ var1_1)), (long)6046729844157453427L, (long)var1_1);
                                                                                                                                        break block139;
                                                                                                                                    }
                                                                                                                                    catch (CustomSystemException v25) {
                                                                                                                                        throw ContextualDataBroker.a(v25);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                v22 /* !! */  = (int)ContextualDataBroker.b("h", (int)3879, (long)(4820858143171366681L ^ var1_1));
                                                                                                                            }
                                                                                                                            v24 = ContextualDataBroker.c("f", (int)v22 /* !! */ , (long)6046729844157453427L, (long)var1_1);
                                                                                                                        }
                                                                                                                        v20.N0 = ContextualDataBroker.c("V", (Object)v21, (Object)v24, (boolean)true, String.class, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                                                                                                                        this.Nq = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)20644, (long)(5057482221382504579L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Float.TYPE, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                                                                                                                        this.K = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)1742, (long)(2542865466539624094L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Float.TYPE, Float.TYPE}, (long)6047525381604637734L, (long)var1_1);
                                                                                                                        this.N6 = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)30309, (long)(342481394661373473L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                                                                                                                        this.C = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)14055, (long)(7571603471034545903L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.EE}, (long)6047525381604637734L, (long)var1_1);
                                                                                                                    }
                                                                                                                    v13 = GeometryCalculator.C();
                                                                                                                    v16 = 13;
                                                                                                                }
                                                                                                                try {
                                                                                                                    block142: {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        if (var3_2 != null) break block140;
                                                                                                                                        if (v13 == v16) {
                                                                                                                                        }
                                                                                                                                        ** GOTO lbl265
                                                                                                                                    }
                                                                                                                                    catch (CustomSystemException v26) {
                                                                                                                                        throw ContextualDataBroker.a(v26);
                                                                                                                                    }
                                                                                                                                    this.N8 = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)7702, (long)(2539626239889169967L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Boolean.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                    v27 = this;
                                                                                                                                    v28 = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)7114, (long)(2007133812785273764L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Float.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                                    if (var3_2 != null) break block141;
                                                                                                                                }
                                                                                                                                catch (CustomSystemException v29) {
                                                                                                                                    throw ContextualDataBroker.a(v29);
                                                                                                                                }
                                                                                                                                v27.Nb = v28;
                                                                                                                                if (!ObjectLifecycleTracker.U.d()) break block142;
                                                                                                                            }
                                                                                                                            catch (CustomSystemException v30) {
                                                                                                                                throw ContextualDataBroker.a(v30);
                                                                                                                            }
                                                                                                                            this.NH = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)6906, (long)(8666952519525718664L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Float.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                            if (var3_2 == null) break block143;
                                                                                                                        }
                                                                                                                        catch (CustomSystemException v31) {
                                                                                                                            throw ContextualDataBroker.a(v31);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    v27 = this;
                                                                                                                    v28 = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)14263, (long)(4197480507278587784L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Float.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                                                                }
                                                                                                                catch (CustomSystemException v32) {
                                                                                                                    throw ContextualDataBroker.a(v32);
                                                                                                                }
                                                                                                            }
                                                                                                            v27.NH = v28;
                                                                                                        }
                                                                                                        try {
                                                                                                            block145: {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        v33 = this;
                                                                                                                        v34 = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)18923, (long)(4854044466814486931L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Double.TYPE, Boolean.TYPE}, (long)6047525381604637734L, (long)var1_1);
                                                                                                                        if (var3_2 != null) break block144;
                                                                                                                        v33.N3 = v34;
                                                                                                                        if (!ObjectLifecycleTracker.U.d()) break block145;
                                                                                                                    }
                                                                                                                    catch (CustomSystemException v35) {
                                                                                                                        throw ContextualDataBroker.a(v35);
                                                                                                                    }
                                                                                                                    this.F = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)29324, (long)(8435449546426167931L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.V_, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                                                                                                                    if (var3_2 == null) break block146;
                                                                                                                }
                                                                                                                catch (CustomSystemException v36) {
                                                                                                                    throw ContextualDataBroker.a(v36);
                                                                                                                }
                                                                                                            }
                                                                                                            v33 = this;
                                                                                                            v34 = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)8897, (long)(1282765467717591715L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, (Object)ReflectionMetadataResolver.V_, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                                                                                                        }
                                                                                                        catch (CustomSystemException v37) {
                                                                                                            throw ContextualDataBroker.a(v37);
                                                                                                        }
                                                                                                    }
                                                                                                    v33.F = v34;
                                                                                                }
                                                                                                try {
                                                                                                    this.NI = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)524, (long)(8974566067658572405L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.PE, Boolean.TYPE}, (long)6047525381604637734L, (long)var1_1);
                                                                                                    if (var3_2 == null) break block147;
lbl265:
                                                                                                    // 2 sources

                                                                                                    v13 = GeometryCalculator.C();
                                                                                                    v16 = 35;
                                                                                                }
                                                                                                catch (CustomSystemException v38) {
                                                                                                    throw ContextualDataBroker.a(v38);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                block149: {
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (var3_2 != null) break block148;
                                                                                                            if (v13 < v16) break block149;
                                                                                                        }
                                                                                                        catch (CustomSystemException v39) {
                                                                                                            throw ContextualDataBroker.a(v39);
                                                                                                        }
                                                                                                        this.N3 = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)19242, (long)(5545947036429355854L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Void.TYPE, (Object)new Class[]{Double.TYPE, Boolean.TYPE, ReflectionMetadataResolver.FI, ReflectionMetadataResolver.P2}, (long)6047525381604637734L, (long)var1_1);
                                                                                                        if (var3_2 == null) break block150;
                                                                                                    }
                                                                                                    catch (CustomSystemException v40) {
                                                                                                        throw ContextualDataBroker.a(v40);
                                                                                                    }
                                                                                                }
                                                                                                v13 = GeometryCalculator.C();
                                                                                                v16 = 23;
                                                                                            }
                                                                                            catch (CustomSystemException v41) {
                                                                                                throw ContextualDataBroker.a(v41);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            block151: {
                                                                                                try {
                                                                                                    if (v13 < v16) break block151;
                                                                                                    this.N3 = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)3380, (long)(571364565601045788L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Double.TYPE, Boolean.TYPE, ReflectionMetadataResolver.VJ, ReflectionMetadataResolver.P2}, (long)6047525381604637734L, (long)var1_1);
                                                                                                    if (var3_2 == null) break block150;
                                                                                                }
                                                                                                catch (CustomSystemException v42) {
                                                                                                    throw ContextualDataBroker.a(v42);
                                                                                                }
                                                                                            }
                                                                                            this.N3 = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)26166, (long)(5217986258056554076L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Double.TYPE, Boolean.TYPE, ReflectionMetadataResolver.l, ReflectionMetadataResolver.P2}, (long)6047525381604637734L, (long)var1_1);
                                                                                        }
                                                                                        catch (CustomSystemException v43) {
                                                                                            throw ContextualDataBroker.a(v43);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        block152: {
                                                                                            try {
                                                                                                if (GeometryCalculator.C() < 35) break block152;
                                                                                                this.c = ((StatefulEventToggle)ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)19474, (long)(7144398077363948560L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (Object)ReflectionMetadataResolver.bU, (Object)new Class[0], (long)6046667200837870127L, (long)var1_1).V(GameVersionEnumerator.MC_1_21_4.R(), ReflectionMetadataResolver.Uz)).M();
                                                                                                if (var3_2 == null) break block153;
                                                                                            }
                                                                                            catch (CustomSystemException v44) {
                                                                                                throw ContextualDataBroker.a(v44);
                                                                                            }
                                                                                        }
                                                                                        this.c = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)9703, (long)(9002694434468324769L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.bU, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                                                                                    }
                                                                                    catch (CustomSystemException v45) {
                                                                                        throw ContextualDataBroker.a(v45);
                                                                                    }
                                                                                }
                                                                                this.F = ((StatefulEventToggle)ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)31032, (long)(710293829069125991L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (Object)ReflectionMetadataResolver.V_, (Object)new Class[0], (long)6046667200837870127L, (long)var1_1).V(GameVersionEnumerator.MC_1_21_4.R(), ReflectionMetadataResolver.Vk)).M();
                                                                                this.NI = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)8887, (long)(1390832303565955767L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.PE}, (long)6047525381604637734L, (long)var1_1);
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        v46 = GeometryCalculator.C();
                                                                                        v47 = 23;
                                                                                        if (var3_2 != null) break block154;
                                                                                        if (v46 >= v47) {
                                                                                        }
                                                                                        ** GOTO lbl379
                                                                                    }
                                                                                    catch (CustomSystemException v48) {
                                                                                        throw ContextualDataBroker.a(v48);
                                                                                    }
                                                                                    this.Nk = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)18078, (long)(4313253162419029702L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.EV, (long)6047717415128988196L, (long)var1_1);
                                                                                    if (var3_2 != null) break block155;
                                                                                }
                                                                                catch (CustomSystemException v49) {
                                                                                    throw ContextualDataBroker.a(v49);
                                                                                }
                                                                                v46 = GeometryCalculator.C();
                                                                                v47 = 35;
                                                                            }
                                                                            catch (CustomSystemException v50) {
                                                                                throw ContextualDataBroker.a(v50);
                                                                            }
                                                                        }
                                                                        try {
                                                                            block156: {
                                                                                try {
                                                                                    if (v46 < v47) break block156;
                                                                                    this.N = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)6625, (long)(3259456529152629152L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.YN, (long)6047717415128988196L, (long)var1_1);
                                                                                    this.NF = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)23886, (long)(6800096975560121621L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.FK, ReflectionMetadataResolver.YN}, (long)6047525381604637734L, (long)var1_1);
                                                                                    this.Ne = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)24149, (long)(5078540261678915096L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Float.TYPE, ReflectionMetadataResolver.YN}, (long)6047525381604637734L, (long)var1_1);
                                                                                    if (var3_2 == null) break block157;
                                                                                }
                                                                                catch (CustomSystemException v51) {
                                                                                    throw ContextualDataBroker.a(v51);
                                                                                }
                                                                            }
                                                                            this.w = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)28625, (long)(5762737991268741036L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Long.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                            this.Q = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)29566, (long)(6798161111800984427L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.FK, Double.TYPE, Double.TYPE, Double.TYPE}, (long)6047525381604637734L, (long)var1_1);
                                                                        }
                                                                        catch (CustomSystemException v52) {
                                                                            throw ContextualDataBroker.a(v52);
                                                                        }
                                                                    }
                                                                    this.Ne = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)25347, (long)(234658434198840093L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Void.TYPE, (Object)new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, (long)6047525381604637734L, (long)var1_1);
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            v53 = GeometryCalculator.C();
                                                                            v54 = 50;
                                                                            if (var3_2 != null) break block158;
                                                                            if (v53 >= v54) break block159;
                                                                        }
                                                                        catch (CustomSystemException v55) {
                                                                            throw ContextualDataBroker.a(v55);
                                                                        }
                                                                        this.Nu = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)24205, (long)(3044764851442491077L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                                                                        this.Ni = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)4870, (long)(5197433186910753786L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                                                                        if (var3_2 == null) break block159;
                                                                    }
                                                                    catch (CustomSystemException v56) {
                                                                        throw ContextualDataBroker.a(v56);
                                                                    }
lbl379:
                                                                    // 2 sources

                                                                    this.Nk = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)27201, (long)(1747736122444098234L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.EV, (long)6047717415128988196L, (long)var1_1);
                                                                    this.w = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)1078, (long)(4701287331806790692L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Integer.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                                    this.Ne = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)3523, (long)(7720435690797682145L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Float.TYPE, Float.TYPE, Float.TYPE}, (long)6047525381604637734L, (long)var1_1);
                                                                    this.Q = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)3421, (long)(5004906087408454962L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Double.TYPE, Double.TYPE, Double.TYPE}, (long)6047525381604637734L, (long)var1_1);
                                                                }
                                                                catch (CustomSystemException v57) {
                                                                    throw ContextualDataBroker.a(v57);
                                                                }
                                                            }
                                                            v53 = GeometryCalculator.C();
                                                            v54 = 50;
                                                        }
                                                        try {
                                                            block160: {
                                                                try {
                                                                    if (v53 < v54) break block160;
                                                                    this.J = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)1322, (long)(5463024210539136368L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Float.TYPE, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                                                                    if (var3_2 == null) break block161;
                                                                }
                                                                catch (CustomSystemException v58) {
                                                                    throw ContextualDataBroker.a(v58);
                                                                }
                                                            }
                                                            this.H = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)31127, (long)(7458520753819793792L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Float.TYPE, (long)6047717415128988196L, (long)var1_1);
                                                        }
                                                        catch (CustomSystemException v59) {
                                                            throw ContextualDataBroker.a(v59);
                                                        }
                                                    }
                                                    try {
                                                        block163: {
                                                            try {
                                                                try {
                                                                    this.Nx = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)13699, (long)(8216681831400404451L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                                                                    this.Nd = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)16097, (long)(682895026638946024L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                                                                    this.Nn = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)28453, (long)(6433149713401556756L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                                                                    this.Nr = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)13954, (long)(5513326891211945650L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                                                                    this.No = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)31058, (long)(2567782371127081265L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                                                                    this.NA = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)30517, (long)(9210037920389052252L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Float.TYPE, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                                                                    v60 = GameVersionEnumerator.MC_1_20_6.H();
                                                                    if (var3_2 != null) break block162;
                                                                    if (v60 == 0) break block163;
                                                                }
                                                                catch (CustomSystemException v61) {
                                                                    throw ContextualDataBroker.a(v61);
                                                                }
                                                                this.NU = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)18705, (long)(5811478738027153757L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{Double.TYPE, Double.TYPE, Double.TYPE}, (long)6047525381604637734L, (long)var1_1);
                                                                if (var3_2 == null) break block164;
                                                            }
                                                            catch (CustomSystemException v62) {
                                                                throw ContextualDataBroker.a(v62);
                                                            }
                                                        }
                                                        v60 = GeometryCalculator.C();
                                                    }
                                                    catch (CustomSystemException v63) {
                                                        throw ContextualDataBroker.a(v63);
                                                    }
                                                }
                                                try {
                                                    block165: {
                                                        try {
                                                            if (v60 < 35) break block165;
                                                            this.NU = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)30865, (long)(5174624470412933274L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Boolean.TYPE, (Object)new Class[]{Double.TYPE, Double.TYPE, Double.TYPE}, (long)6047525381604637734L, (long)var1_1);
                                                            if (var3_2 == null) break block164;
                                                        }
                                                        catch (CustomSystemException v64) {
                                                            throw ContextualDataBroker.a(v64);
                                                        }
                                                    }
                                                    this.NU = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)20430, (long)(6572442172900642778L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{Double.TYPE, Double.TYPE, Double.TYPE}, (long)6047525381604637734L, (long)var1_1);
                                                }
                                                catch (CustomSystemException v65) {
                                                    throw ContextualDataBroker.a(v65);
                                                }
                                            }
                                            try {
                                                try {
                                                    this.NK = ((StatefulEventToggle)ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)1260, (long)(7346394923069817873L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), Void.TYPE, (Object)new Class[]{Double.TYPE, Double.TYPE, Double.TYPE}, (long)6046667200837870127L, (long)var1_1).e(GameVersionEnumerator.MC_1_16_5.R(), (String)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)11392, (long)(7431480583459368100L ^ var1_1)), (long)6046729844157453427L, (long)var1_1))).M();
                                                    v66 = ObjectLifecycleTracker.z;
                                                    if (var3_2 != null) break block166;
                                                    if (v66 != 0) break block167;
                                                }
                                                catch (CustomSystemException v67) {
                                                    throw ContextualDataBroker.a(v67);
                                                }
                                                this.NR = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)17536, (long)(3472328463478719740L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)false, Boolean.TYPE, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                                            }
                                            catch (CustomSystemException v68) {
                                                throw ContextualDataBroker.a(v68);
                                            }
                                        }
                                        this.n = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)9744, (long)(251818838128158303L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Double.TYPE, Double.TYPE, Double.TYPE}, (long)6047525381604637734L, (long)var1_1);
                                        this.ND = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)8178, (long)(6926479227644665729L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                                        this.y = ((ThreadPoolCoordinator)((ThreadPoolCoordinator)((ThreadPoolCoordinator)ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)29342, (long)(4128742547221066409L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), Boolean.TYPE, (long)6047641235674512400L, (long)var1_1).e(GameVersionEnumerator.MC_1_16_5.Q(), (String)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)9169, (long)(5683068407780926340L ^ var1_1)), (long)6046729844157453427L, (long)var1_1))).n(GameVersionEnumerator.MC_1_16_5.Q(), ObjectLifecycleTracker.z)).e(GameVersionEnumerator.MC_1_16_5.q(), (String)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)15625, (long)(378137954490744067L ^ var1_1)), (long)6046729844157453427L, (long)var1_1))).p();
                                        v66 = (int)GameVersionEnumerator.MC_1_8_9.H();
                                    }
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (var3_2 != null) break block168;
                                                    if (v66 == 0) break block169;
                                                }
                                                catch (CustomSystemException v69) {
                                                    throw ContextualDataBroker.a(v69);
                                                }
                                                v66 = (int)GameVersionEnumerator.MC_1_12_2.b();
                                                if (var3_2 != null) break block168;
                                            }
                                            catch (CustomSystemException v70) {
                                                throw ContextualDataBroker.a(v70);
                                            }
                                            if (v66 == 0) break block169;
                                        }
                                        catch (CustomSystemException v71) {
                                            throw ContextualDataBroker.a(v71);
                                        }
                                        this.X = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)14308, (long)(2292163059527808798L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), Boolean.TYPE, (Object)new Class[0], (long)6046667200837870127L, (long)var1_1).M();
                                    }
                                    catch (CustomSystemException v72) {
                                        throw ContextualDataBroker.a(v72);
                                    }
                                }
                                v66 = GeometryCalculator.C();
                            }
                            try {
                                block170: {
                                    try {
                                        if (v66 <= 13) break block170;
                                        this.NB = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)25441, (long)(2816973721878078272L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                                        if (var3_2 == null) break block171;
                                    }
                                    catch (CustomSystemException v73) {
                                        throw ContextualDataBroker.a(v73);
                                    }
                                }
                                this.NB = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)24747, (long)(7294638306903073021L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
                            }
                            catch (CustomSystemException v74) {
                                throw ContextualDataBroker.a(v74);
                            }
                        }
                        try {
                            block173: {
                                try {
                                    try {
                                        this.N9 = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)9059, (long)(5632354101635146647L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE, Boolean.TYPE}, (long)6047525381604637734L, (long)var1_1);
                                        v75 = this;
                                        v76 = ((StatefulEventToggle)((StatefulEventToggle)((StatefulEventToggle)ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)15092, (long)(1263263379078871701L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), UUID.class, (Object)new Class[0], (long)6046667200837870127L, (long)var1_1).e(GameVersionEnumerator.MC_1_16_5.R(), (String)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)3464, (long)(1055681637321199009L ^ var1_1)), (long)6046729844157453427L, (long)var1_1))).V(GameVersionEnumerator.MC_1_21_10.R(), ReflectionMetadataResolver.Fc)).V(GameVersionEnumerator.MC_1_21_4.R(), ReflectionMetadataResolver.Uz)).M();
                                        if (var3_2 != null) break block172;
                                        v75.Nt = v76;
                                        if (GeometryCalculator.C() < 35) break block173;
                                    }
                                    catch (CustomSystemException v77) {
                                        throw ContextualDataBroker.a(v77);
                                    }
                                    this.d = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)21771, (long)(5979603030839891286L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Void.TYPE, (Object)new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE}, (long)6047525381604637734L, (long)var1_1);
                                    if (var3_2 == null) break block174;
                                }
                                catch (CustomSystemException v78) {
                                    throw ContextualDataBroker.a(v78);
                                }
                            }
                            v75 = this;
                            v76 = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)24248, (long)(2682534493184990792L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE}, (long)6047525381604637734L, (long)var1_1);
                        }
                        catch (CustomSystemException v79) {
                            throw ContextualDataBroker.a(v79);
                        }
                    }
                    v75.d = v76;
                }
                try {
                    try {
                        this.NW = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)25226, (long)(8598988345530655472L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Boolean.TYPE}, (long)6047525381604637734L, (long)var1_1);
                        this.m = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)30408, (long)(1343551571267794616L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Boolean.TYPE}, (long)6047525381604637734L, (long)var1_1);
                        this.D = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)11344, (long)(170788613911309365L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Boolean.TYPE}, (long)6047525381604637734L, (long)var1_1);
                        v80 = GeometryCalculator.C();
                        if (var3_2 != null) break block175;
                        if (v80 != 15) break block176;
                    }
                    catch (CustomSystemException v81) {
                        throw ContextualDataBroker.a(v81);
                    }
                    this.V = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)16523, (long)(268877531758231770L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.YN, (Object)new Class[]{Float.TYPE}, (long)6047525381604637734L, (long)var1_1);
                }
                catch (CustomSystemException v82) {
                    throw ContextualDataBroker.a(v82);
                }
            }
            v80 = (int)GameVersionEnumerator.MC_1_21_4.H();
        }
        try {
            if (v80 != 0) {
                this.NZ = ContextualDataBroker.c("V", (Object)this, (Object)ContextualDataBroker.c("f", (int)ContextualDataBroker.b("h", (int)25904, (long)(2182383046280979822L ^ var1_1)), (long)6046729844157453427L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Vr, (Object)new Class[0], (long)6047525381604637734L, (long)var1_1);
            }
        }
        catch (CustomSystemException v83) {
            throw ContextualDataBroker.a(v83);
        }
    }

    static boolean o(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.B(object);
    }

    private double G(Object object) {
        return this.E.C(object);
    }

    static void l(ContextualDataBroker contextualDataBroker, Object object, double d2) {
        contextualDataBroker.D(object, d2);
    }

    private Object z(Object object) {
        return this.N.Z(object);
    }

    static boolean y(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.m(object);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ContextualDataBroker.bb = MultiContainerRegistry.a(-4620308344311344559L, -8814833242533605595L, MethodHandles.lookup().lookupClass()).a(110274323276502L);
                ContextualDataBroker.ib = new Object[18];
                ContextualDataBroker.jb = new String[18];
                ContextualDataBroker.a();
                ContextualDataBroker.hb = new HashMap<K, V>(13);
                var0 = ContextualDataBroker.bb ^ 99609072277223L;
                ContextualDataBroker.x(null);
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
                var8_3 = new long[144];
                var5_4 = 0;
                var6_5 = "\u00bbmx\u00b9h\u007fj\u00c9\u00e3\u00f5P\u00eeG\u0086H\u0096s\u00d4\u00b8\u00ff\u00ef\u00a6\u0094\u0011\u00ecI\u00e6&\u00ffh\u00fe\u00f1\u001ef\u00b0|\u0082\u0005h\u0094\u0016\u00b1y\u008d\u0091R\u0089[\u00c3\u00d5\u008e\u0085\u00d04\u00e5\u0097\u008b\u000f\u00e9\u00c0~\u00c7\u00da\u00af\u008e\u00e5\u00e0\\\u00e3QoKf\u00faz&\u008eQ\u0005\u0087\u0016\u00fe3Y\u0080\u00c32GUS+\u000e\u00d3W\u00a9r)g8\\\u00a9\u0080\u00c3^\f\u00c3\u0005\u0080\u00a9]\u00b9\u0005\u009a\u00f6\u0011\u00a4\u00b1\u00d2\u00d2\u0095\u00d5?/\u00dfs\u00bf\u00a41\u00b6Q0G\"3\u0018\u0081\u00a2>5i 7>\u0087o\"\u001e\u001a\u001cC\u00c5K8#\u00e2\b\u00b3\u0095V\u00e1\b@\u00b8\u00b5\u00ad\u00da\u00d3\u00c6\b\u00f6\u00f5]S\n\u00ce\u00cd\u00f3\u00a4\u00b3_\u009a\u00ad8\u00caG\u008e\b\u00e3g][\u00e9\u00fd\u00f7\u00d0\u00e8\u00cb\u00dd\u00c5\u00e7\u00ee{\u00e0\u00a3uR\u0091\u00fd\u00b8\u00c2\u0098\u00c6'\u00e99\u0094\u00f2\u00a4\u00d1\u0015.\u000f\u0014>)\u000b\u00ael\u000f*\u009fJ\u00c6\u0011\u00dc\u00b38\u00e9\u00d3\u0015<\u0084+\u00942?S\u000f\u00ce-\u00d3\u00832p%\u0015\u0011x\u00e5\u00bc5\u00f1f=\u00f4\u0005\u00c8p\u00c3\u00f2\u007f\u000fc\u00feP(\u0010\u00aa\u00b0\\\u0017\u00c7+\u00e0h\u0018f\u00cc\u008f\u00cf\u00b7;\u00a4j\u00c1\u00f9\u00d7\u001fwK\u008f$?Z\u00e3\u0007@\u00cf*\u00d0\u00f5x\u00a2#p:\u00a1\u0002\u00fdx\u00a7\u00db\b\u0091\u001f\u001d\u0019\u001aC\u008eF\u00b5N\u009e\u00a9\u00dc\u001f\u00e4;\u0016*{\u0018\u0000F\u0001\u00c8L\u00bb\u00f8Rxe]5\u0011-K\u00f6\u00e4R\u001a\u0007\u000b\u00b2\u00ba\u0017\u00c6^\u00a7\u00bd4\u0099\u00be\u0015\u00f3\u009e\u00fe\u00a4\u00c0\u009b@\u00cf\u00f3ey\u00ac\u008e\u001c\u00dc\u009b\u00e9\u008d\u00ef\u00c8X@)\u00f9[c\n\u00a2\u00d1\u00fd\u00e4\fR.f\u00bc2\u00fa\u00b2\u00f2~iFc\u00d9V\u009d\u008c\u00d0\u0002%c*\u0004M\u009e\u0013\u00ab*\u00cd\u00d9\u00d4\u009ay\u00a3\u00c1G\u001cC\u00f1s\u00da\u008e\u00e3<\u000e\u0094\u009d\u0081\u00ad\u0007\f\u008b\u00bc:O<\u00c2\u00f0G9\u00d4\u00b1\u00fb\u0002\u00eb8qQ}3\u00c8V\u00f9\u008e\u00bc\u00dcp\u00f1\"\\\u00e5\u00b2\u0006\u00d9\"\u0017\u00ea\u00db0\u0016\u0003\u00bf\u0016Zz\u00c7\u00bdSG\u00d8D^~O\u00e3!\u00d8\u0007\u00f5:\u00c0\u00b7\u00058\u00c7\u001a\u0091\u00fa\u0002]]Q\u00a1G\u00c1\u00c4\u000fS1N\u00bc\u008b\u00deH9\u001d\u00e9\u00d0\u00b8fEzc\u00ab\u001a|\u0006=i\u0003A\u008a4\u008c(\u00db\u007f\u00dc\u00ea\u00191K\t\u00a1\u009e(\u00b8\u00b9\u00d8\u0015yJ>)\u001eI~A\u00e8\u00a6\u0089\u00b3\u00a1#\u009eU\u0089\u00104\u00d4\u001f\u0086\u0095\u00c3tV\u0013\u00b04\u0083\t\u00c2\u00d6R\u00e2\u00a2?\u00e8\u00c1\u009f\u00ff\u0019s\u00ff\u000b\u001e\u00fe\u00de\u008e\u008a?\u00db*\u001d&\u00edK\u00d9&\u0017\u009b\u00f4\u00a3\u0000vc92\u00e6\u00b5\u009dt$\u00bc%\u00a5\u00ee\u000f\u00cd~\u0084\u0082\u00e1\u00cc\u00c7\u0099\u00b2E7\u00c2\u0017\u009f\u00e8-\u0004\u00bd\u0014\f9n\u00a9\u00d0\u00c4\u00b1!}\u00aa\u0084BE\u00f63\u00ca$V\u0000\u00d6\u0091_Yb\u0001\u00ca\u0088r\u00e4=\u00a3!\u00af-~\u0017\u0084N\u00d0\u00ba\u00c5\u00c2T\u00d1f\u00ce\u00f1\u0013>E5?9\u00bb\u00aa&\u0010\\;U\u0006\u00e1\u00e5\u00bbv\u00a7>\u00a74\u0013Q\u008a|`\u00e9g\u00c6>\u001eZ\u009fa\u00a9\u00fb\u00f4\u0097\u00c7\u00fc\\\t_\u00f1I\u00c0nB/\u00b7\u0088:/\u0016k\u00da5\u00a3\u00fcrC\u00cf>\u001e\u00fc \u009f\u0087\u00a5\u00aci4\u00d9\u00da\u00d4\u00aa\u00c9\u0011Sk\u00e2\u0086\u00cf\u00b5E\u0080\u0081b\u001e\u00de\u00d1\u00d3\u008eNw\u00eb\u00f3\u009e\u00cd\u0019\u00e4\u00e2\u00a1\r;\u00c7\u00da\u00d3!l\u00c3L\u00b5r\u00b8\u0007H\u00db\u00956\u00eeV8\u0080~86[\u0001?j\u00dfj\u0019=P>z@\u00b8x\b\u0000X%e&z\u0096l\u0010\u00d74\u00beI\n6\u00ef\u00e1\u00e9Y\u00d4f\u00e1.\u0015]\u000by\u00f3\u00ceQL\u00ba\u00ce\u00e5\u00b1!\u0019<\u00e6\u00b6i\u0016\u0017\u00c2\u00b4\u00a0\u0000\u0012\u00be\u00cf\u0080}\u00ebo\u00a2b\u0083\u00c3=\u0080+\u00ac\u00f6\u009a| \u0094 \u0013\u00dc}U(\u00b4\u00cf\u00f8&#T\u0093\u009e_\u0012\tM\u0007\u00d5\u0005\b<\u00dd\u00bbL\u00d2x>\u001f*\t\u00d5\u0004\u00e16\u0093k<\u00c1\u00f2\u00ac\u001a1\u00a6\u0004Uq\u00dd?\u00e9XF1\u008an!\u00f7T\u00fbc.\u00f5&\u00cc\u0018\u00ea\u00a8\u001d\u00cb\u00f5\u00acD\u00bfB^\u00d7\u00c1\u00ba\u0006~\u009a3\u00b3\u009agn\u00b2v\u00bf\u00f1b|\u0000\u0081\u009a\u00d4\u00ed\u008f\u0097Y\u0005\u00fcW\u0014\u00a2\u00cd0O\u009a\u00db\u0093\u0086L\u00eb\u00d8U\u00cd\u0088\u00d6.\u00f1\u00b7\u00e8\u00ffl\u00a6\u00e5\u0014\u00ec\u0084cw8\u0091M*N\u008b,c\u0004\u00c5\u00fb\u000b\t\u00dd\u00a1\u00d3h\u0095\u00040\u00eeN\u00a4\u00ec\u0084\u0087\u00ab<\u00acN\u00e6PW\u00ff\u00fe\u00a3\u00e8wsZWM\u0000\u00e0u\u00c47vI\u0094\u008a\u0013\u00e5\u00a2\t:o\u00b8(\u00e4\u00be#\u00d4\u008f\u00fe;\u00d3\u001b\u0010\u0012\u00b0d\u00a6";
                var7_6 = "\u00bbmx\u00b9h\u007fj\u00c9\u00e3\u00f5P\u00eeG\u0086H\u0096s\u00d4\u00b8\u00ff\u00ef\u00a6\u0094\u0011\u00ecI\u00e6&\u00ffh\u00fe\u00f1\u001ef\u00b0|\u0082\u0005h\u0094\u0016\u00b1y\u008d\u0091R\u0089[\u00c3\u00d5\u008e\u0085\u00d04\u00e5\u0097\u008b\u000f\u00e9\u00c0~\u00c7\u00da\u00af\u008e\u00e5\u00e0\\\u00e3QoKf\u00faz&\u008eQ\u0005\u0087\u0016\u00fe3Y\u0080\u00c32GUS+\u000e\u00d3W\u00a9r)g8\\\u00a9\u0080\u00c3^\f\u00c3\u0005\u0080\u00a9]\u00b9\u0005\u009a\u00f6\u0011\u00a4\u00b1\u00d2\u00d2\u0095\u00d5?/\u00dfs\u00bf\u00a41\u00b6Q0G\"3\u0018\u0081\u00a2>5i 7>\u0087o\"\u001e\u001a\u001cC\u00c5K8#\u00e2\b\u00b3\u0095V\u00e1\b@\u00b8\u00b5\u00ad\u00da\u00d3\u00c6\b\u00f6\u00f5]S\n\u00ce\u00cd\u00f3\u00a4\u00b3_\u009a\u00ad8\u00caG\u008e\b\u00e3g][\u00e9\u00fd\u00f7\u00d0\u00e8\u00cb\u00dd\u00c5\u00e7\u00ee{\u00e0\u00a3uR\u0091\u00fd\u00b8\u00c2\u0098\u00c6'\u00e99\u0094\u00f2\u00a4\u00d1\u0015.\u000f\u0014>)\u000b\u00ael\u000f*\u009fJ\u00c6\u0011\u00dc\u00b38\u00e9\u00d3\u0015<\u0084+\u00942?S\u000f\u00ce-\u00d3\u00832p%\u0015\u0011x\u00e5\u00bc5\u00f1f=\u00f4\u0005\u00c8p\u00c3\u00f2\u007f\u000fc\u00feP(\u0010\u00aa\u00b0\\\u0017\u00c7+\u00e0h\u0018f\u00cc\u008f\u00cf\u00b7;\u00a4j\u00c1\u00f9\u00d7\u001fwK\u008f$?Z\u00e3\u0007@\u00cf*\u00d0\u00f5x\u00a2#p:\u00a1\u0002\u00fdx\u00a7\u00db\b\u0091\u001f\u001d\u0019\u001aC\u008eF\u00b5N\u009e\u00a9\u00dc\u001f\u00e4;\u0016*{\u0018\u0000F\u0001\u00c8L\u00bb\u00f8Rxe]5\u0011-K\u00f6\u00e4R\u001a\u0007\u000b\u00b2\u00ba\u0017\u00c6^\u00a7\u00bd4\u0099\u00be\u0015\u00f3\u009e\u00fe\u00a4\u00c0\u009b@\u00cf\u00f3ey\u00ac\u008e\u001c\u00dc\u009b\u00e9\u008d\u00ef\u00c8X@)\u00f9[c\n\u00a2\u00d1\u00fd\u00e4\fR.f\u00bc2\u00fa\u00b2\u00f2~iFc\u00d9V\u009d\u008c\u00d0\u0002%c*\u0004M\u009e\u0013\u00ab*\u00cd\u00d9\u00d4\u009ay\u00a3\u00c1G\u001cC\u00f1s\u00da\u008e\u00e3<\u000e\u0094\u009d\u0081\u00ad\u0007\f\u008b\u00bc:O<\u00c2\u00f0G9\u00d4\u00b1\u00fb\u0002\u00eb8qQ}3\u00c8V\u00f9\u008e\u00bc\u00dcp\u00f1\"\\\u00e5\u00b2\u0006\u00d9\"\u0017\u00ea\u00db0\u0016\u0003\u00bf\u0016Zz\u00c7\u00bdSG\u00d8D^~O\u00e3!\u00d8\u0007\u00f5:\u00c0\u00b7\u00058\u00c7\u001a\u0091\u00fa\u0002]]Q\u00a1G\u00c1\u00c4\u000fS1N\u00bc\u008b\u00deH9\u001d\u00e9\u00d0\u00b8fEzc\u00ab\u001a|\u0006=i\u0003A\u008a4\u008c(\u00db\u007f\u00dc\u00ea\u00191K\t\u00a1\u009e(\u00b8\u00b9\u00d8\u0015yJ>)\u001eI~A\u00e8\u00a6\u0089\u00b3\u00a1#\u009eU\u0089\u00104\u00d4\u001f\u0086\u0095\u00c3tV\u0013\u00b04\u0083\t\u00c2\u00d6R\u00e2\u00a2?\u00e8\u00c1\u009f\u00ff\u0019s\u00ff\u000b\u001e\u00fe\u00de\u008e\u008a?\u00db*\u001d&\u00edK\u00d9&\u0017\u009b\u00f4\u00a3\u0000vc92\u00e6\u00b5\u009dt$\u00bc%\u00a5\u00ee\u000f\u00cd~\u0084\u0082\u00e1\u00cc\u00c7\u0099\u00b2E7\u00c2\u0017\u009f\u00e8-\u0004\u00bd\u0014\f9n\u00a9\u00d0\u00c4\u00b1!}\u00aa\u0084BE\u00f63\u00ca$V\u0000\u00d6\u0091_Yb\u0001\u00ca\u0088r\u00e4=\u00a3!\u00af-~\u0017\u0084N\u00d0\u00ba\u00c5\u00c2T\u00d1f\u00ce\u00f1\u0013>E5?9\u00bb\u00aa&\u0010\\;U\u0006\u00e1\u00e5\u00bbv\u00a7>\u00a74\u0013Q\u008a|`\u00e9g\u00c6>\u001eZ\u009fa\u00a9\u00fb\u00f4\u0097\u00c7\u00fc\\\t_\u00f1I\u00c0nB/\u00b7\u0088:/\u0016k\u00da5\u00a3\u00fcrC\u00cf>\u001e\u00fc \u009f\u0087\u00a5\u00aci4\u00d9\u00da\u00d4\u00aa\u00c9\u0011Sk\u00e2\u0086\u00cf\u00b5E\u0080\u0081b\u001e\u00de\u00d1\u00d3\u008eNw\u00eb\u00f3\u009e\u00cd\u0019\u00e4\u00e2\u00a1\r;\u00c7\u00da\u00d3!l\u00c3L\u00b5r\u00b8\u0007H\u00db\u00956\u00eeV8\u0080~86[\u0001?j\u00dfj\u0019=P>z@\u00b8x\b\u0000X%e&z\u0096l\u0010\u00d74\u00beI\n6\u00ef\u00e1\u00e9Y\u00d4f\u00e1.\u0015]\u000by\u00f3\u00ceQL\u00ba\u00ce\u00e5\u00b1!\u0019<\u00e6\u00b6i\u0016\u0017\u00c2\u00b4\u00a0\u0000\u0012\u00be\u00cf\u0080}\u00ebo\u00a2b\u0083\u00c3=\u0080+\u00ac\u00f6\u009a| \u0094 \u0013\u00dc}U(\u00b4\u00cf\u00f8&#T\u0093\u009e_\u0012\tM\u0007\u00d5\u0005\b<\u00dd\u00bbL\u00d2x>\u001f*\t\u00d5\u0004\u00e16\u0093k<\u00c1\u00f2\u00ac\u001a1\u00a6\u0004Uq\u00dd?\u00e9XF1\u008an!\u00f7T\u00fbc.\u00f5&\u00cc\u0018\u00ea\u00a8\u001d\u00cb\u00f5\u00acD\u00bfB^\u00d7\u00c1\u00ba\u0006~\u009a3\u00b3\u009agn\u00b2v\u00bf\u00f1b|\u0000\u0081\u009a\u00d4\u00ed\u008f\u0097Y\u0005\u00fcW\u0014\u00a2\u00cd0O\u009a\u00db\u0093\u0086L\u00eb\u00d8U\u00cd\u0088\u00d6.\u00f1\u00b7\u00e8\u00ffl\u00a6\u00e5\u0014\u00ec\u0084cw8\u0091M*N\u008b,c\u0004\u00c5\u00fb\u000b\t\u00dd\u00a1\u00d3h\u0095\u00040\u00eeN\u00a4\u00ec\u0084\u0087\u00ab<\u00acN\u00e6PW\u00ff\u00fe\u00a3\u00e8wsZWM\u0000\u00e0u\u00c47vI\u0094\u008a\u0013\u00e5\u00a2\t:o\u00b8(\u00e4\u00be#\u00d4\u008f\u00fe;\u00d3\u001b\u0010\u0012\u00b0d\u00a6".length();
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
                    var6_5 = "\u00fa\u0087p\u0016;\u00c2\u00c1\u008esu/\u00aer-\u0016y";
                    var7_6 = "\u00fa\u0087p\u0016;\u00c2\u00c1\u008esu/\u00aer-\u0016y".length();
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
        ContextualDataBroker.cb = var8_3;
        ContextualDataBroker.gb = new Integer[144];
    }

    static Object p(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.G(object);
    }

    private boolean Y(Object object) {
        return this.Nd.V(object, new Object[0]);
    }

    static Object j(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.V(object);
    }

    static Object G(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.w(object);
    }

    private void r(Object object, double d2, boolean bl) {
        this.N3.l(object, d2, bl);
    }

    private boolean Q(Object object) {
        return this.N_.R(object);
    }

    private Random N(Object object) {
        return (Random)this.NG.Z(object);
    }

    private float X(Object object, Object object2) {
        return this.p.p(object, object2);
    }

    private void a(Object object, double d2) {
        this.P.A(object, d2);
    }

    private String g(Object object) {
        return (String)this.N0.T(object, new Object[0]);
    }

    static void Q(ContextualDataBroker contextualDataBroker, Object object, float f) {
        contextualDataBroker.U(object, f);
    }

    static void y(ContextualDataBroker contextualDataBroker, Object object, boolean bl) {
        contextualDataBroker.n(object, bl);
    }

    static UUID H(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.V(object);
    }

    private boolean q(Object object) {
        return this.a.R(object);
    }

    private void S(Object object, double d2) {
        this.NQ.A(object, d2);
    }

    private void m(Object object, float f, Object object2) {
        this.Ne.l(object, Float.valueOf(f), object2);
    }

    private void g(Object object, double d2, boolean bl, Object object2, Object object3) {
        this.N3.l(object, d2, bl, object2, object3);
    }

    static void w(ContextualDataBroker contextualDataBroker, Object object, boolean bl) {
        contextualDataBroker.X(object, bl);
    }

    private boolean F(Object object) {
        return this.b.R(object);
    }

    private boolean k(Object object) {
        return this.g.R(object);
    }

    private void i(Object object, boolean bl) {
        this.a.B(object, bl);
    }

    static double P(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.V(object);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'A' || c == '\u00cc' || c == '\u00c2' || c == 'o') {
                field = ContextualDataBroker.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'A' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00cc' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ContextualDataBroker.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'V' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'f' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    static double c(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.G(object);
    }

    private Object T(Object object) {
        return this.I.T(object, new Object[0]);
    }

    private boolean J(Object object) {
        return this.NM.V(object, new Object[0]);
    }

    static void l(ContextualDataBroker contextualDataBroker, Object object, double d2, boolean bl, Object object2, Object object3) {
        contextualDataBroker.g(object, d2, bl, object2, object3);
    }

    private boolean B(Object object) {
        return this.Nx.V(object, new Object[0]);
    }

    private double z(Object object, Object object2) {
        return this.o.s(object, object2);
    }

    static Object Z(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.p(object);
    }

    private boolean w(Object object, Object object2) {
        return this.C.V(object, object2);
    }

    private float y(Object object) {
        return this.NH.x(object);
    }

    static void G(ContextualDataBroker contextualDataBroker, Object object, float f, float f2, float f3, float f4) {
        contextualDataBroker.O(object, f, f2, f3, f4);
    }

    static void q(ContextualDataBroker contextualDataBroker, Object object, double d2) {
        contextualDataBroker.b(object, d2);
    }

    static float G(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.G(object);
    }

    static void h(ContextualDataBroker contextualDataBroker, Object object, boolean bl) {
        contextualDataBroker.j(object, bl);
    }

    static void z(ContextualDataBroker contextualDataBroker, Object object, double d2, double d3, double d4) {
        contextualDataBroker.e(object, d2, d3, d4);
    }

    static float E(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.a(object);
    }

    static boolean Q(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.a(object);
    }

    private Object u(Object object, Object object2) {
        return this.Nj.T(object, object2);
    }

    private boolean E(Object object, double d2, double d3, double d4) {
        return this.NU.V(object, d2, d3, d4);
    }

    static boolean k(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.H(object);
    }

    static void E(ContextualDataBroker contextualDataBroker, Object object, double d2) {
        contextualDataBroker.L(object, d2);
    }

    private void x(Object object, Object object2) {
        this.q.L(object, object2);
    }

    private void X(Object object, boolean bl) {
        this.T.B(object, bl);
    }

    static boolean e(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.J(object);
    }

    static double M(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.A(object);
    }

    private void W(Object object, double d2) {
        this.U.A(object, d2);
    }

    private void J(Object object, UUID uUID) {
        this.Na.L(object, uUID);
    }

    static boolean p(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.O(object);
    }

    private double j(Object object) {
        return this.Nv.C(object);
    }

    private void n(Object object, boolean bl) {
        this.NW.l(object, bl);
    }

    static float C(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.U(object);
    }

    static Object E(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.v(object);
    }

    private Object N(Object object) {
        return this.NZ.T(object, new Object[0]);
    }

    static float g(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.y(object);
    }

    private void B(Object object, Object object2) {
        this.Nw.L(object, object2);
    }

    static boolean W(ContextualDataBroker contextualDataBroker, Object object, double d2, double d3, double d4) {
        return contextualDataBroker.E(object, d2, d3, d4);
    }

    static void w(ContextualDataBroker contextualDataBroker, Object object, float f, float f2) {
        contextualDataBroker.f(object, f, f2);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ContextualDataBroker.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ContextualDataBroker.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    static void H(ContextualDataBroker contextualDataBroker, Object object, Object object2) {
        contextualDataBroker.B(object, object2);
    }

    private int n(Object object) {
        return this.NE.R(object);
    }

    private boolean x(Object object) {
        return this.Ni.V(object, new Object[0]);
    }

    public void j(Object object, float f) {
        this.Nb.H(object, f);
    }

    static Object d(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.U(object);
    }

    static String N(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.g(object);
    }

    static void t(ContextualDataBroker contextualDataBroker, Object object, double d2) {
        contextualDataBroker.c(object, d2);
    }

    private void j(Object object, boolean bl) {
        this.b.B(object, bl);
    }

    static void a(ContextualDataBroker contextualDataBroker, Object object, int n) {
        contextualDataBroker.I(object, n);
    }

    private void Z(Object object, float f) {
        this.Ny.H(object, f);
    }

    private boolean r(Object object) {
        return this.Ng.V(object, new Object[0]);
    }

    private double r(Object object) {
        return this.U.C(object);
    }

    private boolean W(Object object) {
        return this.NJ.V(object, new Object[0]);
    }

    private void n(Object object, boolean bl, boolean bl2, Object object2) {
        this.u.l(object, bl, bl2, object2);
    }

    private Object e(Object object) {
        return this.S.Z(object);
    }

    static boolean j(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.h(object);
    }

    private Object U(Object object) {
        return this.e.Z(object);
    }

    private void y(Object object, Object object2, Object object3) {
        this.NF.l(object, object2, object3);
    }

    static Object a(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.d(object);
    }

    private void M(Object object, double d2) {
        this.Nm.A(object, d2);
    }

    static boolean i(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.V(object);
    }

    static Object M(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.T(object);
    }

    private boolean d(Object object) {
        return this.Nc.V(object, new Object[0]);
    }

    private void w(Object object, boolean bl) {
        this.M.B(object, bl);
    }

    static boolean H(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.X(object);
    }

    private void O(Object object, double d2) {
        this.E.A(object, d2);
    }

    static void N(ContextualDataBroker contextualDataBroker, Object object, Object object2) {
        contextualDataBroker.L(object, object2);
    }

    static Object G(ContextualDataBroker contextualDataBroker, Object object, Object object2) {
        return contextualDataBroker.u(object, object2);
    }

    static Object U(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.n(object);
    }

    static double Z(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.d(object);
    }

    static void X(ContextualDataBroker contextualDataBroker, Object object, boolean bl) {
        contextualDataBroker.w(object, bl);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ContextualDataBroker.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    static float O(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.Q(object);
    }

    static boolean L(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.r(object);
    }

    private double b(Object object) {
        return this.NT.C(object);
    }

    private Object n(Object object) {
        return this.A.T(object, new Object[0]);
    }

    private boolean h(Object object) {
        return this.ND.V(object, new Object[0]);
    }

    static boolean V(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.x(object);
    }

    static double f(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.P(object);
    }

    private float v(Object object) {
        try {
            if (GeometryCalculator.C() >= 35) {
                return this.O.x(object);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualDataBroker.a(customSystemException);
        }
        return this.Nq.p(object, new Object[0]);
    }

    private void y(Object object, boolean bl) {
        this.D.l(object, bl);
    }

    private double a(Object object) {
        return this.P.C(object);
    }

    static double Y(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.a(object);
    }

    static Object H(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.X(object);
    }

    private boolean N(Object object) {
        return this.N2.R(object);
    }

    static Object L(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.i(object);
    }

    private float U(Object object) {
        return this.Ny.x(object);
    }

    private void D(Object object, double d2) {
        this.N5.A(object, d2);
    }

    static void K(ContextualDataBroker contextualDataBroker, Object object, Object object2) {
        contextualDataBroker.X(object, object2);
    }

    static float x(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.Z(object);
    }

    private static Field g(long l, long l2) {
        int n = ContextualDataBroker.e(l, l2);
        Object object = ib[n];
        if (object instanceof String) {
            String string = jb[n];
            int n2 = string.indexOf(8);
            Class clazz = ContextualDataBroker.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ContextualDataBroker.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ContextualDataBroker.c(clazz3, string2, clazz2)) != null) {
                    ContextualDataBroker.ib[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ContextualDataBroker.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ContextualDataBroker.ib[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ContextualDataBroker.f(873326225473989L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private float Z(Object object) {
        return this.N7.x(object);
    }

    private void K(Object object) {
        this.X.V(object);
    }

    private void Z(Object object, double d2) {
        this.NN.A(object, d2);
    }

    static float N(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.B(object);
    }

    static void O(ContextualDataBroker contextualDataBroker, Object object) {
        contextualDataBroker.l(object);
    }

    static double B(ContextualDataBroker contextualDataBroker, Object object, Object object2) {
        return contextualDataBroker.z(object, object2);
    }

    static void b(ContextualDataBroker contextualDataBroker, Object object, Object object2, boolean bl) {
        contextualDataBroker.d(object, object2, bl);
    }

    private static void a() {
        Object[] objectArray = ib;
        ib[0] = "_Y\u001f\u0014";
        objectArray[1] = "HRN$7\u0013C]_kJ\u000bPZV\"";
        objectArray[2] = Boolean.TYPE;
        ContextualDataBroker.jb[2] = "java/lang/Boolean";
        objectArray[3] = "%\u007fZ\u0001p\u0019.pKN\u001d\u0019.m_";
        objectArray[4] = "cKb64h\u0016ki9%'{ki$12";
        objectArray[5] = "`\u0001\u0015b";
        objectArray[6] = "\n\u000f+";
        objectArray[7] = Integer.TYPE;
        ContextualDataBroker.jb[7] = "java/lang/Integer";
        objectArray[8] = "?kb5";
        objectArray[9] = "6Kx.";
        objectArray[10] = "\fC\u0002h@]yc\tgQ\u0012\u0014c\tzE\u0007";
        objectArray[11] = "I&pB";
        objectArray[12] = "N\r@ApLE\u0002Q\u000e\u0011BN\tUT";
        objectArray[13] = "\u0017*lpA%I52\u0014f\u001a\f?e.Z|\u0013h=\u0014\u0018u\u001b:3fS&\u000b2\u0003.M~\u001b(<d\u001db\u0016X<y\u0011\"I%r*[`rcq{My\u0013bhlF\u001a";
        objectArray[14] = "(\u0015\b@Y\u001fv\nV$b 3\u0000\u0001\u001eBF,WY$\u0000O$\u0005WVK\u001c4\rg\u001eUD$\u0017XT\u0005X)gZAV]1\u0015\\A\u0001\u0010M";
        objectArray[15] = "ef,}3M;yr\u0019\u000br~s%#(\u0014a$}\u0019i\u001ed}3&#NxpC'3\u0014\u007f$~$)C?\u0014";
        objectArray[16] = "V\nq i/T\u0002|eX=\u0011g>575\u0011Zc8((j\u0019d8b-\f\u00063`X";
        Object[] objectArray2 = objectArray;
        objectArray[17] = "tq;AT-*ne%V\u0012od2\u001fOtp3j%\u000e~uj$\u001aD.igT\u001aY\")8)T\nhk\u0003d\u0015K+s;hG\n)\u0011";
    }

    private double d(Object object) {
        return this.Nm.C(object);
    }

    private boolean l(Object object) {
        return this.y.R(object);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private void B(Object object, double d2, boolean bl, Object object2, Object object3) {
        this.N3.l(object, d2, bl, object2, object3);
    }

    private Object d(Object object) {
        return this.Z.T(object, new Object[0]);
    }

    private void O(Object object, float f, float f2, float f3, float f4) {
        block3: {
            block2: {
                try {
                    if (GeometryCalculator.C() < 23) break block2;
                    this.Ne.l(object, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4));
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualDataBroker.a(customSystemException);
                }
            }
            this.Ne.l(object, Float.valueOf(f), Float.valueOf(f3), Float.valueOf(f4));
        }
    }

    static long Q(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.l(object);
    }

    static boolean S(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.Y(object);
    }

    private void O(Object object, boolean bl) {
        this.m.l(object, bl);
    }

    private void U(Object object, float f) {
        this.H.H(object, f);
    }

    static Object V(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.J(object);
    }

    static Object O(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.Y(object);
    }

    static void R(ContextualDataBroker contextualDataBroker, Object object, double d2, boolean bl, Object object2, Object object3) {
        contextualDataBroker.G(object, d2, bl, object2, object3);
    }

    private boolean D(Object object) {
        return this.NB.V(object, new Object[0]);
    }

    static void Q(ContextualDataBroker contextualDataBroker, Object object, double d2) {
        contextualDataBroker.Z(object, d2);
    }

    private float R(Object object) {
        try {
            if (GeometryCalculator.C() >= 50) {
                return this.J.p(object, new Object[0]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualDataBroker.a(customSystemException);
        }
        return this.H.x(object);
    }

    static void D(ContextualDataBroker contextualDataBroker, Object object, double d2) {
        contextualDataBroker.E(object, d2);
    }

    static double A(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.b(object);
    }

    private Object X(Object object) {
        return this.NP.Z(object);
    }

    private Object O(Object object) {
        return this.Nk.Z(object);
    }

    private double z(Object object) {
        return this.NQ.C(object);
    }

    static void o(ContextualDataBroker contextualDataBroker, Object object, double d2) {
        contextualDataBroker.S(object, d2);
    }

    static boolean A(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.y(object);
    }

    private void f(Object object, float f, float f2) {
        this.K.l(object, Float.valueOf(f), Float.valueOf(f2));
    }

    private void k(Object object, float f) {
        this.Ns.H(object, f);
    }

    static void S(ContextualDataBroker contextualDataBroker, Object object, double d2) {
        contextualDataBroker.W(object, d2);
    }

    private Object V(Object object) {
        return this.N0.T(object, new Object[0]);
    }

    static void O(ContextualDataBroker contextualDataBroker, Object object, float f) {
        contextualDataBroker.y(object, f);
    }

    private void Q(Object object) {
        this.NX.V(object);
    }

    private Object G(Object object) {
        return this.v.T(object, new Object[0]);
    }

    static void V(ContextualDataBroker contextualDataBroker, Object object, double d2, boolean bl) {
        contextualDataBroker.r(object, d2, bl);
    }

    private boolean K(Object object) {
        return this.NR.V(object, new Object[0]);
    }

    static void e(ContextualDataBroker contextualDataBroker, Object object) {
        contextualDataBroker.Q(object);
    }

    private boolean X(Object object) {
        return this.Nr.V(object, new Object[0]);
    }

    static Object l(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.O(object);
    }

    private Object w(Object object) {
        return this.F.T(object, new Object[0]);
    }

    static int I(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.Q(object);
    }

    static Object w(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.e(object);
    }

    static int s(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.n(object);
    }

    private boolean m(Object object) {
        return this.No.V(object, new Object[0]);
    }

    static void M(ContextualDataBroker contextualDataBroker, Object object, float f, Object object2) {
        contextualDataBroker.m(object, f, object2);
    }

    private void r(Object object, double d2) {
        this.Nv.A(object, d2);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    static void P(ContextualDataBroker contextualDataBroker, Object object, boolean bl) {
        contextualDataBroker.z(object, bl);
    }

    static void t(ContextualDataBroker contextualDataBroker, Object object, float f) {
        contextualDataBroker.z(object, f);
    }

    private boolean a(Object object) {
        return this.N8.R(object);
    }

    private double A(Object object) {
        return this.Np.C(object);
    }

    private float A(Object object) {
        return this.Ns.x(object);
    }

    private Object w(Object object, Object object2) {
        return this.z.T(object, object2);
    }

    private void x(Object object) {
        this.f.V(object);
    }

    static void K(ContextualDataBroker contextualDataBroker, Object object, boolean bl, boolean bl2, Object object2) {
        contextualDataBroker.n(object, bl, bl2, object2);
    }

    static float X(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.T(object);
    }

    static void z(ContextualDataBroker contextualDataBroker, Object object, boolean bl) {
        contextualDataBroker.c(object, bl);
    }

    static void x(ContextualDataBroker contextualDataBroker, Object object, boolean bl) {
        contextualDataBroker.m(object, bl);
    }

    static double i(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.X(object);
    }

    private long l(Object object) {
        long l;
        try {
            l = GeometryCalculator.C() >= 23 ? this.w.j(object) : (long)this.w.R(object);
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualDataBroker.a(customSystemException);
        }
        return l;
    }

    private double V(Object object) {
        return this.NN.C(object);
    }

    private void k(Object object, int n, boolean bl) {
        this.N9.l(object, n, bl);
    }

    private static Method h(long l, long l2) {
        int n = ContextualDataBroker.e(l, l2);
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
                clazz3 = ContextualDataBroker.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ContextualDataBroker.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ContextualDataBroker.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        ContextualDataBroker.ib[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ContextualDataBroker.f(873326225473989L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ContextualDataBroker.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ContextualDataBroker.ib[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ContextualDataBroker.f(873326225473989L, 0L);
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

    private void z(Object object, boolean bl) {
        this.NY.B(object, bl);
    }

    static double n(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.r(object);
    }

    private boolean e(Object object) {
        return this.NY.R(object);
    }

    static boolean b(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.q(object);
    }

    private void Q(Object object, boolean bl) {
        this.N2.B(object, bl);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ContextualDataBroker.e(l, l2);
            object = ib[n];
            try {
                if (!(object instanceof String)) break block2;
                ContextualDataBroker.ib[n] = clazz = Class.forName(jb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    static double d(ContextualDataBroker contextualDataBroker, Object object) {
        return contextualDataBroker.z(object);
    }

    private boolean A(Object object) {
        block4: {
            boolean bl;
            block6: {
                block5: {
                    try {
                        try {
                            if (GeometryCalculator.C() < 37) break block4;
                            if (this.h.Z(object) == null) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ContextualDataBroker.a(customSystemException);
                        }
                        bl = true;
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ContextualDataBroker.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return this.B.R(object);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ContextualDataBroker.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ContextualDataBroker.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

