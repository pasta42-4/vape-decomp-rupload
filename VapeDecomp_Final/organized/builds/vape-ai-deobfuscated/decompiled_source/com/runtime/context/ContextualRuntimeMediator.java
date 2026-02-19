/*
 * Decompiled with CFR 0.152.
 */
package com.runtime.context;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.config.resolution.ConfigurationContextResolver;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ContextualRuntimeMediator
extends CryptoProtocolEngine {
    private HK i;
    private final ReflectionUtilityService C;
    private final HK A;
    private final HK G;
    private final HK a;
    private static final long b;
    private HK O;
    private final ReflectionUtilityService V;
    private static final long[] d;
    private ReflectionUtilityService M;
    private HK q;
    private HK k;
    private HK y;
    private HK e;
    private HK w;
    private final HK f;
    private final ReflectionUtilityService S;
    private HK X;
    private HK F;
    private HK W;
    private final HK o;
    private ReflectionUtilityService v;
    private HK E;
    private final ReflectionUtilityService D;
    private static final Integer[] g;
    private HK j;
    private final ReflectionUtilityService m;
    private final HK T;
    private HK I;
    private static final Object[] s;
    private final HK P;
    private final ReflectionUtilityService B;
    private static final String[] u;
    private final HK R;
    private HK n;
    private ReflectionUtilityService H;
    private HK L;
    private ReflectionUtilityService Z;
    private ReflectionUtilityService r;
    private ReflectionUtilityService N;
    private ReflectionUtilityService p;
    private static final Map h;
    private HK c;
    private final HK z;
    private final HK t;

    public Object p(Object object) {
        return this.B.Z(object);
    }

    static double W(ContextualRuntimeMediator contextualRuntimeMediator, Object object) {
        return contextualRuntimeMediator.e(object);
    }

    private float r(Object object, float f) {
        return this.X.p(object, Float.valueOf(f));
    }

    private void E(Object object, Object object2) {
        this.L.l(object, object2);
    }

    private void E(Object object) {
    }

    static void q(ContextualRuntimeMediator contextualRuntimeMediator, Object object, double d2) {
        contextualRuntimeMediator.J(object, d2);
    }

    static double h(ContextualRuntimeMediator contextualRuntimeMediator, Object object) {
        return contextualRuntimeMediator.f(object);
    }

    static Object k(ContextualRuntimeMediator contextualRuntimeMediator, Object object) {
        return contextualRuntimeMediator.x(object);
    }

    private Object v(Object object) {
        return this.t.T(object, new Object[0]);
    }

    static void V(ContextualRuntimeMediator contextualRuntimeMediator, Object object, int n) {
        contextualRuntimeMediator.u(object, n);
    }

    static void H(ContextualRuntimeMediator contextualRuntimeMediator, Object object) {
        contextualRuntimeMediator.l(object);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ContextualRuntimeMediator.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/UY" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void z(Object object) {
        this.a.V(object);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (u[n4] != null) {
            return n4;
        }
        Object object = s[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 33;
                break;
            }
            case 1: {
                n3 = 53;
                break;
            }
            case 2: {
                n3 = 42;
                break;
            }
            case 3: {
                n3 = 59;
                break;
            }
            case 4: {
                n3 = 61;
                break;
            }
            case 5: {
                n3 = 51;
                break;
            }
            case 6: {
                n3 = 2;
                break;
            }
            case 7: {
                n3 = 9;
                break;
            }
            case 8: {
                n3 = 60;
                break;
            }
            case 9: {
                n3 = 41;
                break;
            }
            case 10: {
                n3 = 37;
                break;
            }
            case 11: {
                n3 = 10;
                break;
            }
            case 12: {
                n3 = 18;
                break;
            }
            case 13: {
                n3 = 14;
                break;
            }
            case 14: {
                n3 = 62;
                break;
            }
            case 15: {
                n3 = 13;
                break;
            }
            case 16: {
                n3 = 28;
                break;
            }
            case 17: {
                n3 = 19;
                break;
            }
            case 18: {
                n3 = 57;
                break;
            }
            case 19: {
                n3 = 25;
                break;
            }
            case 20: {
                n3 = 34;
                break;
            }
            case 21: {
                n3 = 46;
                break;
            }
            case 22: {
                n3 = 0;
                break;
            }
            case 23: {
                n3 = 44;
                break;
            }
            case 24: {
                n3 = 40;
                break;
            }
            case 25: {
                n3 = 48;
                break;
            }
            case 26: {
                n3 = 24;
                break;
            }
            case 27: {
                n3 = 5;
                break;
            }
            case 28: {
                n3 = 55;
                break;
            }
            case 29: {
                n3 = 15;
                break;
            }
            case 30: {
                n3 = 4;
                break;
            }
            case 31: {
                n3 = 6;
                break;
            }
            case 32: {
                n3 = 52;
                break;
            }
            case 33: {
                n3 = 32;
                break;
            }
            case 34: {
                n3 = 31;
                break;
            }
            case 35: {
                n3 = 38;
                break;
            }
            case 36: {
                n3 = 47;
                break;
            }
            case 37: {
                n3 = 29;
                break;
            }
            case 38: {
                n3 = 36;
                break;
            }
            case 39: {
                n3 = 50;
                break;
            }
            case 40: {
                n3 = 7;
                break;
            }
            case 41: {
                n3 = 49;
                break;
            }
            case 42: {
                n3 = 3;
                break;
            }
            case 43: {
                n3 = 11;
                break;
            }
            case 44: {
                n3 = 1;
                break;
            }
            case 45: {
                n3 = 58;
                break;
            }
            case 46: {
                n3 = 20;
                break;
            }
            case 47: {
                n3 = 39;
                break;
            }
            case 48: {
                n3 = 27;
                break;
            }
            case 49: {
                n3 = 23;
                break;
            }
            case 50: {
                n3 = 22;
                break;
            }
            case 51: {
                n3 = 30;
                break;
            }
            case 52: {
                n3 = 17;
                break;
            }
            case 53: {
                n3 = 63;
                break;
            }
            case 54: {
                n3 = 35;
                break;
            }
            case 55: {
                n3 = 21;
                break;
            }
            case 56: {
                n3 = 26;
                break;
            }
            case 57: {
                n3 = 8;
                break;
            }
            case 58: {
                n3 = 54;
                break;
            }
            case 59: {
                n3 = 16;
                break;
            }
            case 60: {
                n3 = 43;
                break;
            }
            case 61: {
                n3 = 12;
                break;
            }
            case 62: {
                n3 = 56;
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
        ContextualRuntimeMediator.u[n4] = new String(cArray);
        return n4;
    }

    static float c(ContextualRuntimeMediator contextualRuntimeMediator, Object object) {
        return contextualRuntimeMediator.X(object);
    }

    private void f(Object object, Object object2) {
        this.z.l(object, object2);
    }

    private float c(Object object) {
        return this.i.p(object, new Object[0]);
    }

    private int y(Object object) {
        return this.D.R(object);
    }

    private Object S(Object object) {
        return this.o.T(object, new Object[0]);
    }

    private void x(Object object, Object object2, int n) {
        this.n.l(object, object2, n);
    }

    static double b(ContextualRuntimeMediator contextualRuntimeMediator, Object object) {
        return contextualRuntimeMediator.v(object);
    }

    static int S(ContextualRuntimeMediator contextualRuntimeMediator, Object object) {
        return contextualRuntimeMediator.w(object);
    }

    static void P(ContextualRuntimeMediator contextualRuntimeMediator, Object object, double d2) {
        contextualRuntimeMediator.E(object, d2);
    }

    static float u(ContextualRuntimeMediator contextualRuntimeMediator, Object object) {
        return contextualRuntimeMediator.c(object);
    }

    static void B(ContextualRuntimeMediator contextualRuntimeMediator, Object object) {
        contextualRuntimeMediator.s(object);
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

    private Object a(Object object) {
        return this.m.Z(object);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ContextualRuntimeMediator.e(l, l2);
            object = s[n];
            try {
                if (!(object instanceof String)) break block2;
                ContextualRuntimeMediator.s[n] = clazz = Class.forName(u[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * Unable to fully structure code
     */
    public ContextualRuntimeMediator() {
        block54: {
            block53: {
                block51: {
                    block52: {
                        block50: {
                            block48: {
                                block49: {
                                    block47: {
                                        block46: {
                                            block44: {
                                                block43: {
                                                    block42: {
                                                        block40: {
                                                            block41: {
                                                                var1_1 = ContextualRuntimeMediator.b ^ 55360496833388L;
                                                                super(ReflectionMetadataResolver.UQ);
                                                                this.B = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)24050, (long)(6054974606804658288L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Fo, (long)2545089373117712108L, (long)var1_1);
                                                                this.V = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)8951, (long)(6293666423440201579L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.PF, (long)2545089373117712108L, (long)var1_1);
                                                                var3_2 = ConfigurationContextResolver.n();
                                                                try {
                                                                    try {
                                                                        try {
                                                                            v0 = GeometryCalculator.C();
                                                                            if (var3_2 != null) break block40;
                                                                            if (v0 != 15) break block41;
                                                                        }
                                                                        catch (CustomSystemException v1) {
                                                                            throw ContextualRuntimeMediator.a(v1);
                                                                        }
                                                                        this.p = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)21398, (long)(87393803733935674L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Double.TYPE, (long)2545089373117712108L, (long)var1_1);
                                                                        this.H = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)17869, (long)(5944159343166173257L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Double.TYPE, (long)2545089373117712108L, (long)var1_1);
                                                                        this.M = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)1015, (long)(2473074009023772274L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Double.TYPE, (long)2545089373117712108L, (long)var1_1);
                                                                        this.r = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)25659, (long)(779383141574087090L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Double.TYPE, (long)2545089373117712108L, (long)var1_1);
                                                                        this.N = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)14148, (long)(8824350785248117472L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Double.TYPE, (long)2545089373117712108L, (long)var1_1);
                                                                        this.v = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)29020, (long)(5658705582545568976L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Double.TYPE, (long)2545089373117712108L, (long)var1_1);
                                                                        if (var3_2 == null) break block42;
                                                                    }
                                                                    catch (CustomSystemException v2) {
                                                                        throw ContextualRuntimeMediator.a(v2);
                                                                    }
                                                                    AbstractComputationKernel.I(new String[4]);
                                                                }
                                                                catch (CustomSystemException v3) {
                                                                    throw ContextualRuntimeMediator.a(v3);
                                                                }
                                                            }
                                                            v0 = (int)GameVersionEnumerator.MC_1_21_10.Q();
                                                        }
                                                        try {
                                                            try {
                                                                if (var3_2 != null) break block43;
                                                                if (v0 == 0) break block42;
                                                            }
                                                            catch (CustomSystemException v4) {
                                                                throw ContextualRuntimeMediator.a(v4);
                                                            }
                                                            this.p = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)20614, (long)(4250707150792041756L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Double.TYPE, (long)2545089373117712108L, (long)var1_1);
                                                            this.H = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)13880, (long)(1828547432942453662L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Double.TYPE, (long)2545089373117712108L, (long)var1_1);
                                                            this.M = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)6504, (long)(4902396804112641224L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Double.TYPE, (long)2545089373117712108L, (long)var1_1);
                                                            this.r = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)11259, (long)(6560128810281524848L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Double.TYPE, (long)2545089373117712108L, (long)var1_1);
                                                            this.N = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)3803, (long)(6545755206251445110L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Double.TYPE, (long)2545089373117712108L, (long)var1_1);
                                                            this.v = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)25864, (long)(5225899421584887936L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Double.TYPE, (long)2545089373117712108L, (long)var1_1);
                                                        }
                                                        catch (CustomSystemException v5) {
                                                            throw ContextualRuntimeMediator.a(v5);
                                                        }
                                                    }
                                                    v0 = GeometryCalculator.C();
                                                }
                                                try {
                                                    try {
                                                        if (var3_2 != null) break block44;
                                                        if (v0 >= 23) {
                                                        }
                                                        ** GOTO lbl86
                                                    }
                                                    catch (CustomSystemException v6) {
                                                        throw ContextualRuntimeMediator.a(v6);
                                                    }
                                                    v0 = (int)GameVersionEnumerator.MC_1_12_2.J();
                                                }
                                                catch (CustomSystemException v7) {
                                                    throw ContextualRuntimeMediator.a(v7);
                                                }
                                            }
                                            try {
                                                block45: {
                                                    try {
                                                        if (v0 == 0) break block45;
                                                        this.D = ContextualRuntimeMediator.c("G", (Object)this, (Object)ReflectionMetadataResolver.Ut, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)31773, (long)(7595597824014584244L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Integer.TYPE, (long)2546396657515446224L, (long)var1_1);
                                                        if (var3_2 == null) break block46;
                                                    }
                                                    catch (CustomSystemException v8) {
                                                        throw ContextualRuntimeMediator.a(v8);
                                                    }
                                                }
                                                this.D = ContextualRuntimeMediator.c("G", (Object)this, (Object)ReflectionMetadataResolver.Ut, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)14383, (long)(3743835553057066373L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Integer.TYPE, (long)2546396657515446224L, (long)var1_1);
                                            }
                                            catch (CustomSystemException v9) {
                                                throw ContextualRuntimeMediator.a(v9);
                                            }
                                        }
                                        try {
                                            this.k = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)10761, (long)(8885452801565319094L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)2544910443395654283L, (long)var1_1);
                                            this.X = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)6544, (long)(6951311468135705650L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Float.TYPE, (Object)new Class[]{Float.TYPE}, (long)2544910443395654283L, (long)var1_1);
                                            this.t = ContextualRuntimeMediator.c("G", (Object)this, (Object)ReflectionMetadataResolver.Ut, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)7657, (long)(298593429330356290L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Vl, (Object)new Class[0], (long)2545019869651474955L, (long)var1_1);
                                            this.P = ContextualRuntimeMediator.c("G", (Object)this, (Object)ReflectionMetadataResolver.Ut, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)21070, (long)(6409640529418102782L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)2545019869651474955L, (long)var1_1);
                                            this.f = ((StatefulEventToggle)((StatefulEventToggle)((StatefulEventToggle)ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)13316, (long)(268540316554805637L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), Boolean.TYPE, (Object)new Class[0], (long)2546334542320704726L, (long)var1_1).F(ReflectionMetadataResolver.rl)).e(GameVersionEnumerator.MC_1_16_5.R(), (String)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)27652, (long)(5236107441774401947L ^ var1_1)), (long)2546255182215832932L, (long)var1_1))).V(GameVersionEnumerator.MC_1_21_4.R(), ReflectionMetadataResolver.rK)).M();
                                            this.G = ContextualRuntimeMediator.c("G", (Object)this, (Object)ReflectionMetadataResolver.Ut, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)20834, (long)(8275474173697533180L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[0], (long)2545019869651474955L, (long)var1_1);
                                            if (var3_2 == null) break block47;
lbl86:
                                            // 2 sources

                                            this.D = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)26630, (long)(6685556131113311625L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Integer.TYPE, (long)2545089373117712108L, (long)var1_1);
                                            this.t = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)3696, (long)(8611084611832118216L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Vl, (Object)new Class[0], (long)2544910443395654283L, (long)var1_1);
                                            this.P = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)22064, (long)(1149557761019093905L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)2544910443395654283L, (long)var1_1);
                                            this.f = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)31680, (long)(8994776473909563003L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)2544910443395654283L, (long)var1_1);
                                            this.n = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)11063, (long)(6095512445394476682L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.Vl, Integer.TYPE}, (long)2544910443395654283L, (long)var1_1);
                                            this.G = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)21939, (long)(6010071161314091017L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[0], (long)2544910443395654283L, (long)var1_1);
                                        }
                                        catch (CustomSystemException v10) {
                                            throw ContextualRuntimeMediator.a(v10);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                if (GeometryCalculator.C() >= 35) {
                                                    this.m = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)19663, (long)(4230977687368481127L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.FU, (long)2545089373117712108L, (long)var1_1);
                                                    this.C = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)19085, (long)(5963244589008011064L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Pn, (long)2545089373117712108L, (long)var1_1);
                                                    this.S = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)21285, (long)(5456928401900218024L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.YE, (long)2545089373117712108L, (long)var1_1);
                                                    this.y = ContextualRuntimeMediator.c("G", (Object)this, (Object)ReflectionMetadataResolver.Ut, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)10355, (long)(6370553362834349544L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)2545019869651474955L, (long)var1_1);
                                                    this.E = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)636, (long)(3890470820402558930L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)2544910443395654283L, (long)var1_1);
                                                    this.e = ContextualRuntimeMediator.c("G", (Object)this, (Object)ReflectionMetadataResolver.PE, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)10778, (long)(884687269152612277L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)2545019869651474955L, (long)var1_1);
                                                    v11 = this;
                                                    v12 = this;
                                                    v13 = ReflectionMetadataResolver.PE;
                                                    v14 = ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)523, (long)(4348612427619760056L ^ var1_1)), (long)2546255182215832932L, (long)var1_1);
                                                    v15 = true;
                                                    v16 = Boolean.TYPE;
                                                    if (var3_2 != null) break block48;
                                                }
                                                ** GOTO lbl140
                                            }
                                            catch (CustomSystemException v17) {
                                                throw ContextualRuntimeMediator.a(v17);
                                            }
                                            v11.W = ContextualRuntimeMediator.c("G", (Object)v12, (Object)v13, (Object)v14, (boolean)v15, v16, (Object)new Class[0], (long)2545019869651474955L, (long)var1_1);
                                            this.j = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)27160, (long)(3328945276970606482L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)2544910443395654283L, (long)var1_1);
                                            this.Z = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)14920, (long)(1213316303317520382L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Boolean.TYPE, (long)2545089373117712108L, (long)var1_1);
                                            v11 = this;
                                            v12 = this;
                                            v13 = ReflectionMetadataResolver.PE;
                                            v14 = ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)15460, (long)(2194934086857705936L ^ var1_1)), (long)2546255182215832932L, (long)var1_1);
                                            v15 = true;
                                            if (GeometryCalculator.C() >= 50) break block49;
                                        }
                                        catch (CustomSystemException v18) {
                                            throw ContextualRuntimeMediator.a(v18);
                                        }
                                        v16 = ReflectionMetadataResolver.U4;
                                        break block48;
                                    }
                                    catch (CustomSystemException v19) {
                                        throw ContextualRuntimeMediator.a(v19);
                                    }
                                }
                                v16 = ReflectionMetadataResolver.EP;
                            }
                            try {
                                v11.o = ContextualRuntimeMediator.c("G", (Object)v12, (Object)v13, (Object)v14, (boolean)v15, v16, (Object)new Class[0], (long)2545019869651474955L, (long)var1_1);
                                this.F = ((StatefulEventToggle)((StatefulEventToggle)((StatefulEventToggle)ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)26383, (long)(6099191934081929917L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), Boolean.TYPE, (Object)new Class[0], (long)2546334542320704726L, (long)var1_1).e(GameVersionEnumerator.MC_1_20_6.g(), (String)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)20263, (long)(7127420593724996228L ^ var1_1)), (long)2546255182215832932L, (long)var1_1))).n(GameVersionEnumerator.MC_1_20_6.g(), ObjectLifecycleTracker.z)).F(ReflectionMetadataResolver.rK)).M();
                                if (var3_2 == null) break block50;
lbl140:
                                // 2 sources

                                this.m = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)14951, (long)(4242193180996784080L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.PF, (long)2545089373117712108L, (long)var1_1);
                                this.C = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)8466, (long)(7767837208983000203L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Pn, (long)2545089373117712108L, (long)var1_1);
                                this.S = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)7327, (long)(6572225881878817048L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.YE, (long)2545089373117712108L, (long)var1_1);
                                this.y = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)4992, (long)(5796566360087160320L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)2544910443395654283L, (long)var1_1);
                                this.o = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)29446, (long)(6479638932774291127L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.U4, (Object)new Class[0], (long)2544910443395654283L, (long)var1_1);
                            }
                            catch (CustomSystemException v20) {
                                throw ContextualRuntimeMediator.a(v20);
                            }
                        }
                        try {
                            try {
                                v21 = GameVersionEnumerator.MC_1_21_4.H();
                                if (var3_2 != null) break block51;
                                if (!v21) break block52;
                            }
                            catch (CustomSystemException v22) {
                                throw ContextualRuntimeMediator.a(v22);
                            }
                            this.q = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)5975, (long)(3615384370845278922L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), Boolean.TYPE, (Object)new Class[0], (long)2546334542320704726L, (long)var1_1).M();
                            this.I = ((StatefulEventToggle)ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)24223, (long)(2549145716583344903L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (Object)ReflectionMetadataResolver.YN, (Object)new Class[]{ReflectionMetadataResolver.YN, ReflectionMetadataResolver.FK}, (long)2546334542320704726L, (long)var1_1).F(ReflectionMetadataResolver.PE)).M();
                            this.i = ((StatefulEventToggle)ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)8844, (long)(6369942109523400498L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), Float.TYPE, (Object)new Class[0], (long)2546334542320704726L, (long)var1_1).F(ReflectionMetadataResolver.PE)).M();
                        }
                        catch (CustomSystemException v23) {
                            throw ContextualRuntimeMediator.a(v23);
                        }
                    }
                    try {
                        this.R = ((StatefulEventToggle)((StatefulEventToggle)ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)12923, (long)(3933536987836958717L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), Float.TYPE, (Object)new Class[0], (long)2546334542320704726L, (long)var1_1).e(GameVersionEnumerator.MC_1_16_5.R(), (String)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)29530, (long)(2897688797816882900L ^ var1_1)), (long)2546255182215832932L, (long)var1_1))).V(GameVersionEnumerator.MC_1_21_4.R(), ReflectionMetadataResolver.rK)).M();
                        this.a = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)18189, (long)(2969285252932317864L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)2544910443395654283L, (long)var1_1);
                        this.z = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)23077, (long)(3569214621167660956L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.PE}, (long)2544910443395654283L, (long)var1_1);
                        this.T = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)22386, (long)(9096261087039234773L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.YR, (Object)new Class[0], (long)2544910443395654283L, (long)var1_1);
                        this.A = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)26767, (long)(9014002728264244492L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.j, (Object)new Class[0], (long)2544910443395654283L, (long)var1_1);
                        this.w = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)24101, (long)(1653681196343962521L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.PE}, (long)2544910443395654283L, (long)var1_1);
                        v24 = this;
                        v25 = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)10057, (long)(2079419506161799896L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.PE}, (long)2544910443395654283L, (long)var1_1);
                        if (var3_2 != null) break block53;
                        v24.L = v25;
                        v21 = ObjectLifecycleTracker.z;
                    }
                    catch (CustomSystemException v26) {
                        throw ContextualRuntimeMediator.a(v26);
                    }
                }
                try {
                    if (v21) break block54;
                    v24 = this;
                    v25 = ContextualRuntimeMediator.c("G", (Object)this, (Object)ContextualRuntimeMediator.c("V", (int)ContextualRuntimeMediator.b("i", (int)3803, (long)(5857866910458673995L ^ var1_1)), (long)2546255182215832932L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[0], (long)2544910443395654283L, (long)var1_1);
                }
                catch (CustomSystemException v27) {
                    throw ContextualRuntimeMediator.a(v27);
                }
            }
            v24.c = v25;
        }
    }

    private void s(Object object) {
        this.e.V(object);
    }

    private boolean m(Object object) {
        return this.F.V(object, new Object[0]);
    }

    static Object i(ContextualRuntimeMediator contextualRuntimeMediator, Object object) {
        return contextualRuntimeMediator.v(object);
    }

    static void s(ContextualRuntimeMediator contextualRuntimeMediator, Object object, double d2) {
        contextualRuntimeMediator.k(object, d2);
    }

    private double f(Object object) {
        return this.M.C(object);
    }

    static Object p(ContextualRuntimeMediator contextualRuntimeMediator, Object object) {
        return contextualRuntimeMediator.S(object);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/UY" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field g(long l, long l2) {
        int n = ContextualRuntimeMediator.e(l, l2);
        Object object = s[n];
        if (object instanceof String) {
            String string = u[n];
            int n2 = string.indexOf(8);
            Class clazz = ContextualRuntimeMediator.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ContextualRuntimeMediator.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ContextualRuntimeMediator.c(clazz3, string2, clazz2)) != null) {
                    ContextualRuntimeMediator.s[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ContextualRuntimeMediator.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ContextualRuntimeMediator.s[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ContextualRuntimeMediator.f(912362669104920L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void G(Object object, double d2) {
        this.M.A(object, d2);
    }

    private void c(Object object, Object object2) {
        this.w.l(object, object2);
    }

    static boolean Y(ContextualRuntimeMediator contextualRuntimeMediator, Object object) {
        return contextualRuntimeMediator.b(object);
    }

    static boolean r(ContextualRuntimeMediator contextualRuntimeMediator, Object object) {
        return contextualRuntimeMediator.R(object);
    }

    static boolean Q(ContextualRuntimeMediator contextualRuntimeMediator, Object object) {
        return contextualRuntimeMediator.M(object);
    }

    static void q(ContextualRuntimeMediator contextualRuntimeMediator, Object object, Object object2) {
        contextualRuntimeMediator.f(object, object2);
    }

    private static Method h(long l, long l2) {
        int n = ContextualRuntimeMediator.e(l, l2);
        Object object = s[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = u[n];
                int n3 = string2.indexOf(8);
                clazz3 = ContextualRuntimeMediator.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ContextualRuntimeMediator.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ContextualRuntimeMediator.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        ContextualRuntimeMediator.s[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ContextualRuntimeMediator.f(912362669104920L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ContextualRuntimeMediator.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ContextualRuntimeMediator.s[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ContextualRuntimeMediator.f(912362669104920L, 0L);
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

    private boolean R(Object object) {
        return this.P.V(object, new Object[0]);
    }

    static void D(ContextualRuntimeMediator contextualRuntimeMediator, Object object) {
        contextualRuntimeMediator.A(object);
    }

    static Object j(ContextualRuntimeMediator contextualRuntimeMediator, Object object) {
        return contextualRuntimeMediator.a(object);
    }

    static boolean m(ContextualRuntimeMediator contextualRuntimeMediator, Object object) {
        return contextualRuntimeMediator.V(object);
    }

    private double b(Object object) {
        return this.p.C(object);
    }

    static int d(ContextualRuntimeMediator contextualRuntimeMediator, Object object) {
        return contextualRuntimeMediator.y(object);
    }

    private void u(Object object, int n) {
        this.D.t(object, n);
    }

    private void J(Object object, double d2) {
        this.H.A(object, d2);
    }

    private Object Y(Object object) {
        return this.T.T(object, new Object[0]);
    }

    private void H(Object object) {
        this.c.V(object);
    }

    private Object D(Object object) {
        return this.C.Z(object);
    }

    private Object u(Object object) {
        return this.V.Z(object);
    }

    private boolean b(Object object) {
        return this.y.V(object, new Object[0]);
    }

    private boolean M(Object object) {
        return this.Z.R(object);
    }

    static Object z(ContextualRuntimeMediator contextualRuntimeMediator, Object object) {
        return contextualRuntimeMediator.Y(object);
    }

    private double e(Object object) {
        return this.r.C(object);
    }

    private Object S(Object object, Object object2, Object object3) {
        return this.I.T(object, object2, object3);
    }

    static void A(ContextualRuntimeMediator contextualRuntimeMediator, Object object, Object object2) {
        contextualRuntimeMediator.E(object, object2);
    }

    private boolean J(Object object) {
        return this.E.V(object, new Object[0]);
    }

    static Object s(ContextualRuntimeMediator contextualRuntimeMediator, Object object) {
        return contextualRuntimeMediator.P(object);
    }

    static boolean Z(ContextualRuntimeMediator contextualRuntimeMediator, Object object) {
        return contextualRuntimeMediator.J(object);
    }

    static Object q(ContextualRuntimeMediator contextualRuntimeMediator, Object object) {
        return contextualRuntimeMediator.D(object);
    }

    static void d(ContextualRuntimeMediator contextualRuntimeMediator, Object object) {
        contextualRuntimeMediator.H(object);
    }

    private boolean V(Object object) {
        return this.W.V(object, new Object[0]);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ContextualRuntimeMediator.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ContextualRuntimeMediator.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    static void D(ContextualRuntimeMediator contextualRuntimeMediator, Object object, double d2) {
        contextualRuntimeMediator.S(object, d2);
    }

    static void A(ContextualRuntimeMediator contextualRuntimeMediator, Object object, double d2) {
        contextualRuntimeMediator.G(object, d2);
    }

    static boolean L(ContextualRuntimeMediator contextualRuntimeMediator, Object object) {
        return contextualRuntimeMediator.E(object);
    }

    private void S(Object object, double d2) {
        this.r.A(object, d2);
    }

    private void E(Object object, double d2) {
        this.N.A(object, d2);
    }

    private static void a() {
        Object[] objectArray = s;
        s[0] = "O\u000b#}";
        objectArray[1] = "Jj7O2{Ae&\u0000OcRb/I";
        objectArray[2] = Boolean.TYPE;
        ContextualRuntimeMediator.u[2] = "java/lang/Boolean";
        objectArray[3] = "U\u0007qr{6^\b`=\u00166^\u0015t";
        objectArray[4] = "sr4!0\u0019\u0006R?.!VkR?35C";
        objectArray[5] = "u:\u0012r";
        objectArray[6] = "5\"\u0016s. @\u0002\u001d|?o-\u0002\u001da+z";
        objectArray[7] = "k[Q";
        objectArray[8] = Integer.TYPE;
        ContextualRuntimeMediator.u[8] = "java/lang/Integer";
        objectArray[9] = "w=|\u0001";
        objectArray[10] = "s\u001c]e\b_\u0006<Vj\u0019\u0010k<Vw\r\u0005";
        objectArray[11] = "S\u001e\u0012>";
        objectArray[12] = "Fs/E\u001fgM|>\n~iFw:P";
        objectArray[13] = "\u000b\u0000\u001dj H_\u001e\u0001\u0012\u001c!\u001c\u0003\u000eb?H\b\u0007\u0001\u0012bA\u000bY\b)bG\u0003_c(0\u001c\u001b\u0006S*gMYd\\~8\u001b\u0014\u000e\u0018mfMdX[y;\u001a\u001e\u0005\u0003-$!";
        objectArray[14] = "\n=5I [^#)1\u00162_2vN9\u0002]e'\f[J\u00024;U2^\u0006;K\b;]X2p\b=U^YqZfM\u0007is\r7\u000fef'RaB\u000f\"4\f72Ya Q`H\u00049tN[";
        objectArray[15] = "6)W<FIb7KDf !*D4YI5.KD\u0004@6pB\u007f\u0004F>v)~V\u001d&/\u0019|\u0001LdM\u00178\u0002G;|E'_DY";
        objectArray[16] = "Gg?Ki\u001aBubZ\nO\u0000\u0018aY6\u001aCi,\u0019aK{`;Hz@\u0012t?G\n";
        objectArray[17] = "/(\u001f\"\"7{6\u0003Z;^8+\f*=7,/\u0003Zc5}3\u0003jab,qae5=z<\u000b!&c,LQf2`2wXai$@";
        Object[] objectArray2 = objectArray;
        objectArray[18] = "\u001c\"m}]\u0016H<q\u0005w\u007fI-.zDOKz\u007f8&\u0007\u0014+caO\u0013\u0010$\u0013<F\u0010N-(<@\u0018HF)n\u001b\u0000\u0011v+9JBsxo:A\u001dB*pgB\u007f";
    }

    private double v(Object object) {
        return this.N.C(object);
    }

    private void k(Object object, double d2) {
        this.p.A(object, d2);
    }

    static void r(ContextualRuntimeMediator contextualRuntimeMediator, Object object, double d2) {
        contextualRuntimeMediator.P(object, d2);
    }

    private Object x(Object object) {
        return this.A.T(object, new Object[0]);
    }

    static double C(ContextualRuntimeMediator contextualRuntimeMediator, Object object) {
        return contextualRuntimeMediator.r(object);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ContextualRuntimeMediator.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private int w(Object object) {
        return this.G.R(object, new Object[0]);
    }

    private double r(Object object) {
        return this.v.C(object);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x56FB;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/UY", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ContextualRuntimeMediator.g[n2] = n3;
        }
        return g[n2];
    }

    private float X(Object object) {
        return this.R.p(object, new Object[0]);
    }

    private void l(Object object) {
        this.j.V(object);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e5' || c == '\u00e3' || c == '\u00f5' || c == 'M') {
                field = ContextualRuntimeMediator.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e5' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e3' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ContextualRuntimeMediator.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'G' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'V' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    static double Y(ContextualRuntimeMediator contextualRuntimeMediator, Object object) {
        return contextualRuntimeMediator.K(object);
    }

    static boolean a(ContextualRuntimeMediator contextualRuntimeMediator, Object object) {
        return contextualRuntimeMediator.G(object);
    }

    private void P(Object object, double d2) {
        this.v.A(object, d2);
    }

    private void A(Object object) {
        this.k.V(object);
    }

    private double K(Object object) {
        return this.H.C(object);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ContextualRuntimeMediator.b = MultiContainerRegistry.a(-6161167197781752670L, -2405111117759655618L, MethodHandles.lookup().lookupClass()).a(98293072191989L);
                ContextualRuntimeMediator.s = new Object[19];
                ContextualRuntimeMediator.u = new String[19];
                ContextualRuntimeMediator.a();
                ContextualRuntimeMediator.h = new HashMap<K, V>(13);
                var0 = ContextualRuntimeMediator.b ^ 8818368840468L;
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
                var8_3 = new long[58];
                var5_4 = 0;
                var6_5 = "J?\u00c5\u00be_\u00e8\fS\u00e9\u008b\u00a7I\u0011\u00aaz\u00cd\u00f6\u00918\u009f\u000e\u00dc\u00e0\u0085\u00cc\u0000Pl'\u00df\u00f2kA\u00d4\u00a4\u00bdI\u0011\u009d\u00b3a;:\u00ea\u00ee\u00af/+\u00fb\u0012\u00dcd\u0010\u00c1\u00e1\u00d9L\u00a7\u00be\n`\u00aab<\u00f4\u00ae\u00a1?\u0092\u008b\u0011\u00b1\u00b8J\u00a7\u00ac\u00a4N\u0011J\u00d1\u00e7\u00c8D\u00e8\u0094T\u00f6\u0097\u0018yxm\u00c7\u00fc\u000b\u0095\u00d2nd3\r\u0087z\u00a8\u00a9\u00dc|R\u00d5f\u00c6\u0098C\u0001\u00ae\u00a7\u00dd\u00a9\u00a7\t\u00fc\u0010\u008b!R{\rK\u00fa\u00de4\u0003i\u00a8i=\u0089\u0089\u00c7\u00ee\u00aa\u00d3\u0000R/\u00ed?W\u00beg\u0019\u00991h\u00c8E6\u00a1\u0002q\u00b6\u00d3y\u00f1:\u00aa\u0007\u00b5\u0082,\u00f1\b>\u00b0P\u00ac:\u00e7o\u00e1\u0018\u00f4\u00f6\u00c8\u00a5\u00dc{\u0000\u0007\u00af\u00cb\u00b8\u0094gc\u00b3\u00bc\u00be)\u009b9K\u00e6$\u00c6\u00b4R\u0007\u00db\u00e1\u00d2\u00ed\u00d4\u008c\u0012f\u009f\u000f\u00eec\u00eb\u00b0\u00d0h\u00df\u00b9h\u0095(.\u00ab\u00e0\u0001\u0093\b\u001b\u00e5Yc\u00d3\u00cd^\r\u00c37\u00b5*f\u00a3\u001d\u00db\u00d94\u00d5\u0001\u009f\u00cd\u008f\u00c7\n\u00f0\u00ad\u00ae\u0095\u0083,u\u00fc\u00d6\u00ed\u00bfi\u008b<N\f\u0086\u00bf$\u00fc\u00f5Z\u00fe\u00e6\u00f4\u00e5I\u0002\u001a\fa9^]cH\u008bL\u0013\u00e3\u000b\u00fd_]{ +\".z\u00b2r\u00d7dO|\u00ec\u00dfR\u00f2\u000b\u00c5k\u0007\u0015\b\u008a7\u00e0\u0086\u00e8\u00b3\u00fd\u00fcWo5\u0088Q\u00de j\u001bGE\u00b1\u00fd\u0088k\u0090\u00f5\u00cc2h\u00c8\u00b86\u00ae\u008d\u00c5\u009b\u000ej\u0000\u0084\u0018f7_t\u0089\u0095{L\u00d9\u00eb\u00f7\u00e5\u0087\u008d\u00de\u00d5\u00e1'\u0006\u0002!\u0010\u00cd\u0012\u00f7\u00ec.\u0006\t\u00a1\u0018\u00c9\u00e3+\u00eeb\u009b\u001cZ\u00ad\u0006@(G>C\u00f6\u00e0%\u0083}#\u00ef7\u00f1\u0003\u001f\u00fd7\u00afm\u0097\u00ad\u00da:\\\u00c65\u00a3\u00d4O\u0087\u00df\u00ddX\u0002\u000f\u00a6\u0087\u00ddk";
                var7_6 = "J?\u00c5\u00be_\u00e8\fS\u00e9\u008b\u00a7I\u0011\u00aaz\u00cd\u00f6\u00918\u009f\u000e\u00dc\u00e0\u0085\u00cc\u0000Pl'\u00df\u00f2kA\u00d4\u00a4\u00bdI\u0011\u009d\u00b3a;:\u00ea\u00ee\u00af/+\u00fb\u0012\u00dcd\u0010\u00c1\u00e1\u00d9L\u00a7\u00be\n`\u00aab<\u00f4\u00ae\u00a1?\u0092\u008b\u0011\u00b1\u00b8J\u00a7\u00ac\u00a4N\u0011J\u00d1\u00e7\u00c8D\u00e8\u0094T\u00f6\u0097\u0018yxm\u00c7\u00fc\u000b\u0095\u00d2nd3\r\u0087z\u00a8\u00a9\u00dc|R\u00d5f\u00c6\u0098C\u0001\u00ae\u00a7\u00dd\u00a9\u00a7\t\u00fc\u0010\u008b!R{\rK\u00fa\u00de4\u0003i\u00a8i=\u0089\u0089\u00c7\u00ee\u00aa\u00d3\u0000R/\u00ed?W\u00beg\u0019\u00991h\u00c8E6\u00a1\u0002q\u00b6\u00d3y\u00f1:\u00aa\u0007\u00b5\u0082,\u00f1\b>\u00b0P\u00ac:\u00e7o\u00e1\u0018\u00f4\u00f6\u00c8\u00a5\u00dc{\u0000\u0007\u00af\u00cb\u00b8\u0094gc\u00b3\u00bc\u00be)\u009b9K\u00e6$\u00c6\u00b4R\u0007\u00db\u00e1\u00d2\u00ed\u00d4\u008c\u0012f\u009f\u000f\u00eec\u00eb\u00b0\u00d0h\u00df\u00b9h\u0095(.\u00ab\u00e0\u0001\u0093\b\u001b\u00e5Yc\u00d3\u00cd^\r\u00c37\u00b5*f\u00a3\u001d\u00db\u00d94\u00d5\u0001\u009f\u00cd\u008f\u00c7\n\u00f0\u00ad\u00ae\u0095\u0083,u\u00fc\u00d6\u00ed\u00bfi\u008b<N\f\u0086\u00bf$\u00fc\u00f5Z\u00fe\u00e6\u00f4\u00e5I\u0002\u001a\fa9^]cH\u008bL\u0013\u00e3\u000b\u00fd_]{ +\".z\u00b2r\u00d7dO|\u00ec\u00dfR\u00f2\u000b\u00c5k\u0007\u0015\b\u008a7\u00e0\u0086\u00e8\u00b3\u00fd\u00fcWo5\u0088Q\u00de j\u001bGE\u00b1\u00fd\u0088k\u0090\u00f5\u00cc2h\u00c8\u00b86\u00ae\u008d\u00c5\u009b\u000ej\u0000\u0084\u0018f7_t\u0089\u0095{L\u00d9\u00eb\u00f7\u00e5\u0087\u008d\u00de\u00d5\u00e1'\u0006\u0002!\u0010\u00cd\u0012\u00f7\u00ec.\u0006\t\u00a1\u0018\u00c9\u00e3+\u00eeb\u009b\u001cZ\u00ad\u0006@(G>C\u00f6\u00e0%\u0083}#\u00ef7\u00f1\u0003\u001f\u00fd7\u00afm\u0097\u00ad\u00da:\\\u00c65\u00a3\u00d4O\u0087\u00df\u00ddX\u0002\u000f\u00a6\u0087\u00ddk".length();
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
                    var6_5 = "\u00ec\u000b\u00fd\u0015z\u009b\u00e6\u008c\u009as\u00b8\u009e\u00e4\u00b8Z\u0012";
                    var7_6 = "\u00ec\u000b\u00fd\u0015z\u009b\u00e6\u008c\u009as\u00b8\u009e\u00e4\u00b8Z\u0012".length();
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
        ContextualRuntimeMediator.d = var8_3;
        ContextualRuntimeMediator.g = new Integer[58];
    }

    static double p(ContextualRuntimeMediator contextualRuntimeMediator, Object object) {
        return contextualRuntimeMediator.b(object);
    }

    static boolean S(ContextualRuntimeMediator contextualRuntimeMediator, Object object) {
        return contextualRuntimeMediator.m(object);
    }

    private boolean E(Object object) {
        return this.f.V(object, new Object[0]);
    }

    private Object P(Object object) {
        return this.S.Z(object);
    }

    static float F(ContextualRuntimeMediator contextualRuntimeMediator, Object object, float f) {
        return contextualRuntimeMediator.r(object, f);
    }

    static Object i(ContextualRuntimeMediator contextualRuntimeMediator, Object object, Object object2, Object object3) {
        return contextualRuntimeMediator.S(object, object2, object3);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = ContextualRuntimeMediator.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ContextualRuntimeMediator.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private boolean G(Object object) {
        return this.q.V(object, new Object[0]);
    }

    static void L(ContextualRuntimeMediator contextualRuntimeMediator, Object object, Object object2) {
        contextualRuntimeMediator.c(object, object2);
    }

    static Object P(ContextualRuntimeMediator contextualRuntimeMediator, Object object) {
        return contextualRuntimeMediator.u(object);
    }

    static void n(ContextualRuntimeMediator contextualRuntimeMediator, Object object) {
        contextualRuntimeMediator.z(object);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ContextualRuntimeMediator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ContextualRuntimeMediator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

