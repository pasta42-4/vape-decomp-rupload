/*
 * Decompiled with CFR 0.152.
 */
package com.resource.management;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityBroker;
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
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ResourceMappingController
extends CryptoProtocolEngine {
    private HK w;
    private static final long[] e;
    private final HK p;
    private final ReflectionUtilityService d;
    private final HK D;
    private HK j;
    private static final Object[] G;
    private ReflectionUtilityService g;
    private final HK M;
    private HK z;
    private HK s;
    private HK v;
    private static final Map F;
    private final ReflectionUtilityService C;
    private HK Y;
    private HK V;
    private ReflectionUtilityService A;
    public final HK m;
    private HK c;
    private HK W;
    private final ReflectionUtilityService X;
    private HK U;
    public final HK S;
    private HK y;
    private final ReflectionUtilityService f;
    private static String L;
    private HK u;
    private HK E;
    public HK Z;
    private HK n;
    private HK P;
    private ReflectionUtilityService I;
    private HK B;
    private final HK T;
    private final HK O;
    private final HK Q;
    private final ReflectionUtilityService K;
    private static final String[] H;
    private HK R;
    public HK i;
    private HK t;
    private ReflectionUtilityService a;
    private HK o;
    private final ReflectionUtilityService J;
    private HK r;
    private static final Integer[] q;
    private ReflectionUtilityService h;
    private HK k;
    private static final long b;
    public HK N;

    public Object i(Object object) {
        return this.A.Z(object);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/lh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private boolean S(Object object) {
        return this.C.R(object);
    }

    private boolean y(Object object, int n, int n2, int n3, int n4, int n5, int n6) {
        return this.W.V(object, n, n2, n3, n4, n5, n6);
    }

    public Object B(Object object, int n, int n2, int n3) {
        return this.w.T(object, n, n2, n3);
    }

    public Iterable P(Object object) {
        return (Iterable)this.o.T(object, new Object[0]);
    }

    public Object S(Object object, Object object2) {
        return this.T.T(object, object2);
    }

    private void p(Object object, int n, Object object2) {
        this.O.l(object, n, object2);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ResourceMappingController.e(l, l2);
            object = G[n];
            try {
                if (!(object instanceof String)) break block2;
                ResourceMappingController.G[n] = clazz = Class.forName(H[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public void Z(Object object, float f) {
        this.K.H(object, f);
    }

    private Object w(Object object) {
        return this.a.Z(object);
    }

    public Object U(Object object, Object object2) {
        return this.i.T(object, object2);
    }

    static boolean R(ResourceMappingController resourceMappingController, Object object, Object object2, Object object3) {
        return resourceMappingController.Z(object, object2, object3);
    }

    private Object W(Object object, int n, int n2) {
        return this.Q.T(object, n, n2);
    }

    private int q(Object object, int n, int n2, int n3) {
        return this.r.R(object, n, n2, n3);
    }

    static boolean g(ResourceMappingController resourceMappingController, Object object) {
        return resourceMappingController.S(object);
    }

    public boolean x(Object object, Object object2) {
        return this.V.V(object, object2);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ResourceMappingController.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ResourceMappingController.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public void T(Object object, float f) {
        this.X.H(object, f);
    }

    public List S(Object object) {
        return (List)this.d.Z(object);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ResourceMappingController.b = MultiContainerRegistry.a(6524104232322215317L, -1758964214493503734L, MethodHandles.lookup().lookupClass()).a(15878116821787L);
                ResourceMappingController.G = new Object[20];
                ResourceMappingController.H = new String[20];
                ResourceMappingController.a();
                ResourceMappingController.F = new HashMap<K, V>(13);
                ResourceMappingController.x("NB1rm");
                var0 = ResourceMappingController.b ^ 21019615695819L;
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
                var8_3 = new long[66];
                var5_4 = 0;
                var6_5 = "\u00edP\u0080g\u00e8\u0082\u00d7\u00c11\u00bc\u0091\u00aa\u00ee\u0095\u00edKZ\u00eb\u00f2#\u0083\u00b8\u00b6D\u00e3Ek\u00e4\u00ee\u008f\u00c9>\u009e(\u0017\u00ba!\u00d8\u00a8\u00b5\u0091\u00cd\u0007\u00d7\u00de\u00b3\u0080\u00c4J\u000b:I\u0089+{\u00dcR\u00be\u00ae<\u00ba\u00bc\u00edO\u00b7\u00d6\u0014\u0092?\u00a8\u00b9J\u0016\u0095\u00d4\u009f\u00acGP\u001d\u00f4GZ\u0085\u0017\u0080|\u00c48\u00bd\u00ec\u00f6\u0006\u00a4\u0004\u00d8\u008au4\u00978$\u00d5\u00ac\u00df\u0090\u00d2W\u0010\u00c0\u0081\u00f6\u00be%?\u00eaC\u00fe\u007f\u0092\u00c6\u00ab9\u00a3\u00b7\u009b\u00cb\u00d9\u00cf\u00d1\u009d\u00ae\u0004b\u00e2\u00f1\u00f0\u0002\u0081\\\u0082\u0005\u00e4\u00f0\u00cc\u00b5sW-\u00de\u00a7x\u0015\u00b9\u0083\u0010}\u0092\u00c6\u00193\u00ea\u00aa\u00a2\u00f9\u00af\u0007\u00900\u00e1\u00bf4\u00b3M\u00e4\u0090\u00be\\\u00a4\u0087\f\u0004\u000b\u009dk\u0013\u00f8\u0083\u0089K\u008f\u00e8\u00ffv\u00d0K\u00c0r@\u001fo\f\u00fctc=\u009a\u00e5\u00b1\u0012\u00c3<\u0004=\u00b3\u00fa\u00f5s\u008c\b\u0080\u0084a\u0081M\u00a7\u00cf\u00d4\u0089\u00dd\u00ae|x\u000b\u001c\u009b|-P\u00ca*)\n\u0013\u00eag\u00c8\u00c2s\u0002^\u00e9\u00aa%\u0089\u0095\u0012\u00d4\u00fd\u00a2\u00f0\u00db\u00fc\u0086\\\u001d&\u00ff\u00b9N\u00c3\u00c2\u0012-\f3\u00d4\u00e4-\u00b3\u00d0`\u008e\u001f\u0098\u00d0X>\u0012\u00bd\u00b4\u00d3c\u0090\u00d5r\u007fx\u00ff\u0011\u00b3\u00fb\u00d1\u0013N\u0092\u00b0\u0017\u00c0E+\u0098!\u00da\u00fa`\u00bd\u00b4b\u0002\u00e0\u00a2v\u00c6e\u00ee\u00d3\u00b6E\u00eb\tx\u00bc\u00cdM^\u00e9\u00ea\u00ef\u00b8\u0082\u00f5\u00d6Yf\u00be\u00b7\u0096\u001dn\u00b4d\u00fa\u00aa\u0092a\u00f0\u00ca\u00ac\u001c\"~\u00df\u00faqTd'\u00efr\u0004\u0082\u008e\u008dZ'GC\u001cz\u00bf\u00aer\u0007,\u0010w\u00c6\u00efh\u00ec7\u0088z/\u00f9?v\u00d5\u009d\u00c7\u00f4HN\u00cek;/\u00d0\u00d4L\u008b\u000e\u00b08O\u00cb_\u0097\u00e3N[\u0096\u00af\u00c8\u00af\u008a\u0000\u00c4\u00a0\u0015'C\u00ff\u00a08`\u00ee\u00f0rp36\u0014\u00a4\u0010\u008ej\u0001\u00ab\u00e8.0\u00e9\u00e8\u00ce\u000b\u00df\u0006\u00f4\u0002(c\u00b7\u001ex\u0006\u0010)\u00ca\u00a4\u00c3(\u00b7\u00e2\u009e\u0002is\u000eE\u0081\u00e3d\u0000q;\u0015\u008a\u00ca\u008e\u00bf\u00a8\u008b\u00c3\u00ad\u0003j3Z\u00b5\u00c5\u00f1\u00d5Pi]\u00eb\f\u00b7^c";
                var7_6 = "\u00edP\u0080g\u00e8\u0082\u00d7\u00c11\u00bc\u0091\u00aa\u00ee\u0095\u00edKZ\u00eb\u00f2#\u0083\u00b8\u00b6D\u00e3Ek\u00e4\u00ee\u008f\u00c9>\u009e(\u0017\u00ba!\u00d8\u00a8\u00b5\u0091\u00cd\u0007\u00d7\u00de\u00b3\u0080\u00c4J\u000b:I\u0089+{\u00dcR\u00be\u00ae<\u00ba\u00bc\u00edO\u00b7\u00d6\u0014\u0092?\u00a8\u00b9J\u0016\u0095\u00d4\u009f\u00acGP\u001d\u00f4GZ\u0085\u0017\u0080|\u00c48\u00bd\u00ec\u00f6\u0006\u00a4\u0004\u00d8\u008au4\u00978$\u00d5\u00ac\u00df\u0090\u00d2W\u0010\u00c0\u0081\u00f6\u00be%?\u00eaC\u00fe\u007f\u0092\u00c6\u00ab9\u00a3\u00b7\u009b\u00cb\u00d9\u00cf\u00d1\u009d\u00ae\u0004b\u00e2\u00f1\u00f0\u0002\u0081\\\u0082\u0005\u00e4\u00f0\u00cc\u00b5sW-\u00de\u00a7x\u0015\u00b9\u0083\u0010}\u0092\u00c6\u00193\u00ea\u00aa\u00a2\u00f9\u00af\u0007\u00900\u00e1\u00bf4\u00b3M\u00e4\u0090\u00be\\\u00a4\u0087\f\u0004\u000b\u009dk\u0013\u00f8\u0083\u0089K\u008f\u00e8\u00ffv\u00d0K\u00c0r@\u001fo\f\u00fctc=\u009a\u00e5\u00b1\u0012\u00c3<\u0004=\u00b3\u00fa\u00f5s\u008c\b\u0080\u0084a\u0081M\u00a7\u00cf\u00d4\u0089\u00dd\u00ae|x\u000b\u001c\u009b|-P\u00ca*)\n\u0013\u00eag\u00c8\u00c2s\u0002^\u00e9\u00aa%\u0089\u0095\u0012\u00d4\u00fd\u00a2\u00f0\u00db\u00fc\u0086\\\u001d&\u00ff\u00b9N\u00c3\u00c2\u0012-\f3\u00d4\u00e4-\u00b3\u00d0`\u008e\u001f\u0098\u00d0X>\u0012\u00bd\u00b4\u00d3c\u0090\u00d5r\u007fx\u00ff\u0011\u00b3\u00fb\u00d1\u0013N\u0092\u00b0\u0017\u00c0E+\u0098!\u00da\u00fa`\u00bd\u00b4b\u0002\u00e0\u00a2v\u00c6e\u00ee\u00d3\u00b6E\u00eb\tx\u00bc\u00cdM^\u00e9\u00ea\u00ef\u00b8\u0082\u00f5\u00d6Yf\u00be\u00b7\u0096\u001dn\u00b4d\u00fa\u00aa\u0092a\u00f0\u00ca\u00ac\u001c\"~\u00df\u00faqTd'\u00efr\u0004\u0082\u008e\u008dZ'GC\u001cz\u00bf\u00aer\u0007,\u0010w\u00c6\u00efh\u00ec7\u0088z/\u00f9?v\u00d5\u009d\u00c7\u00f4HN\u00cek;/\u00d0\u00d4L\u008b\u000e\u00b08O\u00cb_\u0097\u00e3N[\u0096\u00af\u00c8\u00af\u008a\u0000\u00c4\u00a0\u0015'C\u00ff\u00a08`\u00ee\u00f0rp36\u0014\u00a4\u0010\u008ej\u0001\u00ab\u00e8.0\u00e9\u00e8\u00ce\u000b\u00df\u0006\u00f4\u0002(c\u00b7\u001ex\u0006\u0010)\u00ca\u00a4\u00c3(\u00b7\u00e2\u009e\u0002is\u000eE\u0081\u00e3d\u0000q;\u0015\u008a\u00ca\u008e\u00bf\u00a8\u008b\u00c3\u00ad\u0003j3Z\u00b5\u00c5\u00f1\u00d5Pi]\u00eb\f\u00b7^c".length();
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
                    var6_5 = "\u00b9\u00f8\u0093\u00da\u00df\u0089\u00a3R\bt$\u00ac\u00f6X\u00f7u";
                    var7_6 = "\u00b9\u00f8\u0093\u00da\u00df\u0089\u00a3R\bt$\u00ac\u00f6X\u00f7u".length();
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
        ResourceMappingController.e = var8_3;
        ResourceMappingController.q = new Integer[66];
    }

    private void E(Object object, int n, int n2, int n3, int n4, int n5, int n6) {
        this.v.l(object, n, n2, n3, n4, n5, n6);
    }

    private boolean R(Object object, int n, int n2, int n3) {
        try {
            if (GameVersionEnumerator.MC_1_7_10.J()) {
                return this.p.V(object, n, n2, n3);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceMappingController.a(customSystemException);
        }
        return this.p.V(object, ReflectionUtilityBroker.t(n, n2, n3).M());
    }

    private Object d(Object object, int n) {
        return this.N.T(object, n);
    }

    static boolean i(ResourceMappingController resourceMappingController, Object object, int n, int n2, int n3) {
        return resourceMappingController.R(object, n, n2, n3);
    }

    public Object q(Object object) {
        return this.h.Z(object);
    }

    static Object w(ResourceMappingController resourceMappingController, Object object, int n) {
        return resourceMappingController.d(object, n);
    }

    static Object A(ResourceMappingController resourceMappingController, Object object, int n, int n2) {
        return resourceMappingController.W(object, n, n2);
    }

    public List C(Object object, Object object2, Object object3, Object object4) {
        return (List)this.m.T(object, object2, object3, object4);
    }

    public Object G(Object object, Object object2) {
        return this.u.T(object, object2);
    }

    public void R(Object object, float f) {
        this.f.H(object, f);
    }

    private boolean Z(Object object, Object object2, Object object3) {
        return this.W.V(object, object2, object3);
    }

    public Object q(Object object, int n, int n2) {
        return this.T.T(object, n, n2);
    }

    public List Y(Object object, Object object2, Object object3, Object object4) {
        return (List)this.m.T(object, object2, object3, object4);
    }

    static void C(ResourceMappingController resourceMappingController, Object object, int n, int n2, int n3, int n4, int n5, int n6) {
        resourceMappingController.E(object, n, n2, n3, n4, n5, n6);
    }

    static int b(ResourceMappingController resourceMappingController, Object object, int n, int n2, int n3) {
        return resourceMappingController.q(object, n, n2, n3);
    }

    public void j(Object object, float f) {
        this.J.H(object, f);
    }

    public Object h(Object object, Object object2, Object object3, boolean bl, boolean bl2, boolean bl3) {
        return this.S.T(object, object2, object3, bl, bl2, bl3);
    }

    static int w(ResourceMappingController resourceMappingController, Object object) {
        return resourceMappingController.w(object);
    }

    public float e(Object object) {
        return this.f.x(object);
    }

    public Object g(Object object, Object object2) {
        return this.y.T(object, object2);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (H[n4] != null) {
            return n4;
        }
        Object object = G[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 12;
                break;
            }
            case 1: {
                n3 = 3;
                break;
            }
            case 2: {
                n3 = 24;
                break;
            }
            case 3: {
                n3 = 15;
                break;
            }
            case 4: {
                n3 = 55;
                break;
            }
            case 5: {
                n3 = 30;
                break;
            }
            case 6: {
                n3 = 54;
                break;
            }
            case 7: {
                n3 = 38;
                break;
            }
            case 8: {
                n3 = 63;
                break;
            }
            case 9: {
                n3 = 57;
                break;
            }
            case 10: {
                n3 = 40;
                break;
            }
            case 11: {
                n3 = 33;
                break;
            }
            case 12: {
                n3 = 0;
                break;
            }
            case 13: {
                n3 = 26;
                break;
            }
            case 14: {
                n3 = 45;
                break;
            }
            case 15: {
                n3 = 58;
                break;
            }
            case 16: {
                n3 = 16;
                break;
            }
            case 17: {
                n3 = 35;
                break;
            }
            case 18: {
                n3 = 49;
                break;
            }
            case 19: {
                n3 = 32;
                break;
            }
            case 20: {
                n3 = 52;
                break;
            }
            case 21: {
                n3 = 34;
                break;
            }
            case 22: {
                n3 = 31;
                break;
            }
            case 23: {
                n3 = 47;
                break;
            }
            case 24: {
                n3 = 61;
                break;
            }
            case 25: {
                n3 = 50;
                break;
            }
            case 26: {
                n3 = 29;
                break;
            }
            case 27: {
                n3 = 42;
                break;
            }
            case 28: {
                n3 = 60;
                break;
            }
            case 29: {
                n3 = 2;
                break;
            }
            case 30: {
                n3 = 21;
                break;
            }
            case 31: {
                n3 = 6;
                break;
            }
            case 32: {
                n3 = 53;
                break;
            }
            case 33: {
                n3 = 41;
                break;
            }
            case 34: {
                n3 = 27;
                break;
            }
            case 35: {
                n3 = 20;
                break;
            }
            case 36: {
                n3 = 11;
                break;
            }
            case 37: {
                n3 = 43;
                break;
            }
            case 38: {
                n3 = 5;
                break;
            }
            case 39: {
                n3 = 37;
                break;
            }
            case 40: {
                n3 = 62;
                break;
            }
            case 41: {
                n3 = 13;
                break;
            }
            case 42: {
                n3 = 25;
                break;
            }
            case 43: {
                n3 = 36;
                break;
            }
            case 44: {
                n3 = 46;
                break;
            }
            case 45: {
                n3 = 59;
                break;
            }
            case 46: {
                n3 = 1;
                break;
            }
            case 47: {
                n3 = 22;
                break;
            }
            case 48: {
                n3 = 8;
                break;
            }
            case 49: {
                n3 = 51;
                break;
            }
            case 50: {
                n3 = 17;
                break;
            }
            case 51: {
                n3 = 7;
                break;
            }
            case 52: {
                n3 = 18;
                break;
            }
            case 53: {
                n3 = 44;
                break;
            }
            case 54: {
                n3 = 9;
                break;
            }
            case 55: {
                n3 = 56;
                break;
            }
            case 56: {
                n3 = 14;
                break;
            }
            case 57: {
                n3 = 48;
                break;
            }
            case 58: {
                n3 = 19;
                break;
            }
            case 59: {
                n3 = 10;
                break;
            }
            case 60: {
                n3 = 28;
                break;
            }
            case 61: {
                n3 = 23;
                break;
            }
            case 62: {
                n3 = 4;
                break;
            }
            default: {
                n3 = 39;
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
        ResourceMappingController.H[n4] = new String(cArray);
        return n4;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ResourceMappingController.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public List k(Object object) {
        return (List)this.I.Z(object);
    }

    public Object G(Object object) {
        return this.k.T(object, new Object[0]);
    }

    static boolean a(ResourceMappingController resourceMappingController, Object object, int n, int n2, int n3, int n4, int n5, int n6) {
        return resourceMappingController.y(object, n, n2, n3, n4, n5, n6);
    }

    public Object M(Object object, Object object2) {
        return this.S.T(object, object2);
    }

    public Object k(Object object) {
        return this.s.T(object, new Object[0]);
    }

    public Object p(Object object) {
        return this.z.T(object, new Object[0]);
    }

    public Object K(Object object, Object object2) {
        return this.c.T(object, object2);
    }

    public boolean q(Object object, int n, int n2) {
        return this.E.V(object, n, n2);
    }

    public Object q(Object object, Object object2) {
        return this.P.T(object, object2);
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

    private static Field g(long l, long l2) {
        int n = ResourceMappingController.e(l, l2);
        Object object = G[n];
        if (object instanceof String) {
            String string = H[n];
            int n2 = string.indexOf(8);
            Class clazz = ResourceMappingController.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ResourceMappingController.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ResourceMappingController.c(clazz3, string2, clazz2)) != null) {
                    ResourceMappingController.G[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ResourceMappingController.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ResourceMappingController.G[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ResourceMappingController.f(961351073722975L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ResourceMappingController.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static String Q() {
        return L;
    }

    private boolean w(Object object, Object object2, Object object3) {
        return this.j.V(object, object2, object3);
    }

    public float X(Object object) {
        return this.K.x(object);
    }

    static Object s(ResourceMappingController resourceMappingController, Object object) {
        return resourceMappingController.w(object);
    }

    public float p(Object object) {
        return this.J.x(object);
    }

    public Object d(Object object) {
        return this.D.T(object, new Object[0]);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private int w(Object object) {
        return this.Y.R(object, new Object[0]);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'E' || c == 'g' || c == 'P' || c == 'i') {
                field = ResourceMappingController.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'E' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'g' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'P' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ResourceMappingController.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'U' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'G' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public float s(Object object) {
        return this.X.x(object);
    }

    public void Y(Object object, long l) {
        this.U.l(object, l);
    }

    static boolean H(ResourceMappingController resourceMappingController, Object object, Object object2, Object object3) {
        return resourceMappingController.w(object, object2, object3);
    }

    static void t(ResourceMappingController resourceMappingController, Object object, Object object2) {
        resourceMappingController.f(object, object2);
    }

    /*
     * Unable to fully structure code
     */
    public ResourceMappingController() {
        block139: {
            block140: {
                block137: {
                    block138: {
                        block135: {
                            block136: {
                                block130: {
                                    block131: {
                                        block134: {
                                            block132: {
                                                block121: {
                                                    block129: {
                                                        block127: {
                                                            block126: {
                                                                block124: {
                                                                    block122: {
                                                                        block118: {
                                                                            block120: {
                                                                                block115: {
                                                                                    block112: {
                                                                                        block106: {
                                                                                            block113: {
                                                                                                block109: {
                                                                                                    block111: {
                                                                                                        block107: {
                                                                                                            block108: {
                                                                                                                block102: {
                                                                                                                    block105: {
                                                                                                                        block103: {
                                                                                                                            block104: {
                                                                                                                                var1_1 = ResourceMappingController.b ^ 27195947858298L;
                                                                                                                                super(ReflectionMetadataResolver.EV);
                                                                                                                                this.d = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)6679, (long)(1956178008756613367L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, List.class, (long)-7019617758070361143L, (long)var1_1);
                                                                                                                                this.C = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)26619, (long)(1303034481264069928L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, Boolean.TYPE, (long)-7019617758070361143L, (long)var1_1);
                                                                                                                                this.X = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)25834, (long)(9110685682739023385L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, Float.TYPE, (long)-7019617758070361143L, (long)var1_1);
                                                                                                                                var3_2 = ResourceMappingController.Q();
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    this.f = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)16242, (long)(7002685482703377792L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, Float.TYPE, (long)-7019617758070361143L, (long)var1_1);
                                                                                                                                                    this.J = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)2081, (long)(2810877126958572283L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, Float.TYPE, (long)-7019617758070361143L, (long)var1_1);
                                                                                                                                                    this.K = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)15115, (long)(3125170083114471886L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, Float.TYPE, (long)-7019617758070361143L, (long)var1_1);
                                                                                                                                                    this.N = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)1353, (long)(4324663923121680295L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.PE, (Object)new Class[]{Integer.TYPE}, (long)-7020292419730811832L, (long)var1_1);
                                                                                                                                                    v0 = GameVersionEnumerator.MC_1_7_10.J();
                                                                                                                                                    if (var3_2 == null) break block102;
                                                                                                                                                    if (v0 != 0) {
                                                                                                                                                    }
                                                                                                                                                    ** GOTO lbl55
                                                                                                                                                }
                                                                                                                                                catch (CustomSystemException v1) {
                                                                                                                                                    throw ResourceMappingController.a(v1);
                                                                                                                                                }
                                                                                                                                                this.T = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)26473, (long)(1655594926577814934L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.EF, (Object)new Class[]{Integer.TYPE, Integer.TYPE}, (long)-7020292419730811832L, (long)var1_1);
                                                                                                                                                this.W = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)9754, (long)(186464349571632340L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, (long)-7020292419730811832L, (long)var1_1);
                                                                                                                                                v2 = this;
                                                                                                                                                v3 = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)27194, (long)(2521812438656549112L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.l, (Object)new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, (long)-7020292419730811832L, (long)var1_1);
                                                                                                                                                if (var3_2 == null) break block103;
                                                                                                                                            }
                                                                                                                                            catch (CustomSystemException v4) {
                                                                                                                                                throw ResourceMappingController.a(v4);
                                                                                                                                            }
                                                                                                                                            v2.w = v3;
                                                                                                                                            if (!ObjectLifecycleTracker.U.d()) break block104;
                                                                                                                                        }
                                                                                                                                        catch (CustomSystemException v5) {
                                                                                                                                            throw ResourceMappingController.a(v5);
                                                                                                                                        }
                                                                                                                                        this.S = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)13094, (long)(398207441810184687L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Er, (Object)new Class[]{ReflectionMetadataResolver.YN, ReflectionMetadataResolver.YN, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, (long)-7020292419730811832L, (long)var1_1);
                                                                                                                                        if (var3_2 != null) break block105;
                                                                                                                                    }
                                                                                                                                    catch (CustomSystemException v6) {
                                                                                                                                        throw ResourceMappingController.a(v6);
                                                                                                                                    }
                                                                                                                                    AbstractComputationKernel.I(new String[3]);
                                                                                                                                }
                                                                                                                                catch (CustomSystemException v7) {
                                                                                                                                    throw ResourceMappingController.a(v7);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            v2 = this;
                                                                                                                            v3 = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)9114, (long)(3670596638105815366L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, (Object)ReflectionMetadataResolver.Er, (Object)new Class[]{ReflectionMetadataResolver.YN, ReflectionMetadataResolver.YN, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, (long)-7020292419730811832L, (long)var1_1);
                                                                                                                        }
                                                                                                                        v2.S = v3;
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        this.r = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)14320, (long)(8330098542533631256L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, (long)-7020292419730811832L, (long)var1_1);
                                                                                                                        this.p = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)7771, (long)(6900331187575714979L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, (long)-7020292419730811832L, (long)var1_1);
                                                                                                                        if (var3_2 != null) break block106;
lbl55:
                                                                                                                        // 2 sources

                                                                                                                        v0 = GeometryCalculator.C();
                                                                                                                    }
                                                                                                                    catch (CustomSystemException v8) {
                                                                                                                        throw ResourceMappingController.a(v8);
                                                                                                                    }
                                                                                                                }
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (var3_2 == null) break block107;
                                                                                                                        if (v0 < 37) break block108;
                                                                                                                    }
                                                                                                                    catch (CustomSystemException v9) {
                                                                                                                        throw ResourceMappingController.a(v9);
                                                                                                                    }
                                                                                                                    this.z = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)14018, (long)(3475423359166995520L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.b4, (Object)new Class[0], (long)-7020292419730811832L, (long)var1_1);
                                                                                                                    this.c = ((StatefulEventToggle)ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)13338, (long)(7577839626138640124L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (Object)ReflectionMetadataResolver.Pc, (Object)new Class[]{ReflectionMetadataResolver.P2}, (long)-7019519464701726716L, (long)var1_1).V(GameVersionEnumerator.MC_1_21_4.R(), ReflectionMetadataResolver.rF)).M();
                                                                                                                }
                                                                                                                catch (CustomSystemException v10) {
                                                                                                                    throw ResourceMappingController.a(v10);
                                                                                                                }
                                                                                                            }
                                                                                                            v0 = (int)GameVersionEnumerator.MC_1_16_5.H();
                                                                                                        }
                                                                                                        try {
                                                                                                            block110: {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            if (var3_2 == null) break block109;
                                                                                                                            if (v0 != 0) {
                                                                                                                            }
                                                                                                                            ** GOTO lbl120
                                                                                                                        }
                                                                                                                        catch (CustomSystemException v11) {
                                                                                                                            throw ResourceMappingController.a(v11);
                                                                                                                        }
                                                                                                                        if (GeometryCalculator.C() < 37) break block110;
                                                                                                                    }
                                                                                                                    catch (CustomSystemException v12) {
                                                                                                                        throw ResourceMappingController.a(v12);
                                                                                                                    }
                                                                                                                    this.E = ResourceMappingController.c("U", (Object)this, (Object)ReflectionMetadataResolver.T, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)1489, (long)(4713327104295825200L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE}, (long)-7020404691007034522L, (long)var1_1);
                                                                                                                    if (var3_2 != null) break block111;
                                                                                                                }
                                                                                                                catch (CustomSystemException v13) {
                                                                                                                    throw ResourceMappingController.a(v13);
                                                                                                                }
                                                                                                            }
                                                                                                            this.V = ResourceMappingController.c("U", (Object)this, (Object)ReflectionMetadataResolver.T, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)21816, (long)(7039435817747038206L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.P2}, (long)-7020404691007034522L, (long)var1_1);
                                                                                                        }
                                                                                                        catch (CustomSystemException v14) {
                                                                                                            throw ResourceMappingController.a(v14);
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    this.T = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)4510, (long)(1117781857395276617L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.EF, (Object)new Class[]{ReflectionMetadataResolver.P2}, (long)-7020292419730811832L, (long)var1_1);
                                                                                                                    this.i = ((StatefulEventToggle)ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)17384, (long)(7081167521248913707L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (Object)ReflectionMetadataResolver.FI, (Object)new Class[]{ReflectionMetadataResolver.P2}, (long)-7019519464701726716L, (long)var1_1).V(GameVersionEnumerator.MC_1_21_4.R(), ReflectionMetadataResolver.rF)).M();
                                                                                                                    this.S = ResourceMappingController.c("U", (Object)this, (Object)ReflectionMetadataResolver.rF, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)24599, (long)(1850625837046434506L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, (Object)ReflectionMetadataResolver.d, (Object)new Class[]{ReflectionMetadataResolver.w}, (long)-7020404691007034522L, (long)var1_1);
                                                                                                                    this.p = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)14245, (long)(7892484864085843270L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.P2}, (long)-7019639162068648191L, (long)var1_1);
                                                                                                                    this.P = ResourceMappingController.c("U", (Object)this, (Object)ReflectionMetadataResolver.T, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)12372, (long)(9163917602638158505L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.VQ, (Object)new Class[]{ReflectionMetadataResolver.P2}, (long)-7020404691007034522L, (long)var1_1);
                                                                                                                    v15 = GameVersionEnumerator.MC_1_21_4.H();
                                                                                                                    if (var3_2 == null) break block112;
                                                                                                                    if (!v15) break block106;
                                                                                                                }
                                                                                                                catch (CustomSystemException v16) {
                                                                                                                    throw ResourceMappingController.a(v16);
                                                                                                                }
                                                                                                                this.Y = ((StatefulEventToggle)ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)21381, (long)(2597991695471753575L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), Integer.TYPE, (Object)new Class[0], (long)-7019519464701726716L, (long)var1_1).F(ReflectionMetadataResolver.V6)).M();
                                                                                                                if (var3_2 != null) break block106;
                                                                                                            }
                                                                                                            catch (CustomSystemException v17) {
                                                                                                                throw ResourceMappingController.a(v17);
                                                                                                            }
lbl120:
                                                                                                            // 2 sources

                                                                                                            this.V = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)16287, (long)(8203007881545733477L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.P2}, (long)-7020292419730811832L, (long)var1_1);
                                                                                                            this.T = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)31794, (long)(8442655142021306087L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.EF, (Object)new Class[]{ReflectionMetadataResolver.P2}, (long)-7020292419730811832L, (long)var1_1);
                                                                                                            this.i = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)1686, (long)(2581175661585230952L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.VJ, (Object)new Class[]{ReflectionMetadataResolver.P2}, (long)-7020292419730811832L, (long)var1_1);
                                                                                                            this.S = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)31007, (long)(8068959365860824053L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Er, (Object)new Class[]{ReflectionMetadataResolver.YN, ReflectionMetadataResolver.YN, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, (long)-7020292419730811832L, (long)var1_1);
                                                                                                            v18 = this;
                                                                                                            v19 = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)24979, (long)(7980748829983607658L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.P2}, (long)-7020292419730811832L, (long)var1_1);
                                                                                                            if (var3_2 == null) break block113;
                                                                                                        }
                                                                                                        catch (CustomSystemException v20) {
                                                                                                            throw ResourceMappingController.a(v20);
                                                                                                        }
                                                                                                        v18.p = v19;
                                                                                                        v0 = (int)GameVersionEnumerator.MC_1_8_9.J();
                                                                                                    }
                                                                                                    catch (CustomSystemException v21) {
                                                                                                        throw ResourceMappingController.a(v21);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    block114: {
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (v0 == 0 || !TemporalMetadataResolver.h.d()) break block114;
                                                                                                            }
                                                                                                            catch (CustomSystemException v22) {
                                                                                                                throw ResourceMappingController.a(v22);
                                                                                                            }
                                                                                                            this.W = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)8544, (long)(2259822234219531149L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.P2, ReflectionMetadataResolver.P2}, (long)-7020292419730811832L, (long)var1_1);
                                                                                                            if (var3_2 != null) break block106;
                                                                                                        }
                                                                                                        catch (CustomSystemException v23) {
                                                                                                            throw ResourceMappingController.a(v23);
                                                                                                        }
                                                                                                    }
                                                                                                    v18 = this;
                                                                                                    v19 = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)17314, (long)(5655235259549395270L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.P2, ReflectionMetadataResolver.P2}, (long)-7020292419730811832L, (long)var1_1);
                                                                                                }
                                                                                                catch (CustomSystemException v24) {
                                                                                                    throw ResourceMappingController.a(v24);
                                                                                                }
                                                                                            }
                                                                                            v18.W = v19;
                                                                                        }
                                                                                        v15 = GameVersionEnumerator.MC_1_12_2.H();
                                                                                    }
                                                                                    try {
                                                                                        block116: {
                                                                                            try {
                                                                                                block117: {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (var3_2 == null) break block115;
                                                                                                                if (!v15) break block116;
                                                                                                            }
                                                                                                            catch (CustomSystemException v25) {
                                                                                                                throw ResourceMappingController.a(v25);
                                                                                                            }
                                                                                                            if (!GameVersionEnumerator.MC_1_16_5.H()) break block117;
                                                                                                        }
                                                                                                        catch (CustomSystemException v26) {
                                                                                                            throw ResourceMappingController.a(v26);
                                                                                                        }
                                                                                                        this.M = ResourceMappingController.c("U", (Object)this, (Object)ReflectionMetadataResolver.b2, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)6667, (long)(9188673529137688769L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, Stream.class, (Object)new Class[]{ReflectionMetadataResolver.PE, ReflectionMetadataResolver.bU}, (long)-7020404691007034522L, (long)var1_1);
                                                                                                        if (var3_2 != null) break block118;
                                                                                                    }
                                                                                                    catch (CustomSystemException v27) {
                                                                                                        throw ResourceMappingController.a(v27);
                                                                                                    }
                                                                                                }
                                                                                                this.M = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)28605, (long)(8119121081292326242L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, List.class, (Object)new Class[]{ReflectionMetadataResolver.PE, ReflectionMetadataResolver.bU}, (long)-7020292419730811832L, (long)var1_1);
                                                                                                this.s = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)19293, (long)(7835356788357210541L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Pe, (Object)new Class[0], (long)-7020292419730811832L, (long)var1_1);
                                                                                                if (var3_2 != null) break block118;
                                                                                            }
                                                                                            catch (CustomSystemException v28) {
                                                                                                throw ResourceMappingController.a(v28);
                                                                                            }
                                                                                        }
                                                                                        v15 = GameVersionEnumerator.MC_1_8_9.J();
                                                                                    }
                                                                                    catch (CustomSystemException v29) {
                                                                                        throw ResourceMappingController.a(v29);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    block119: {
                                                                                        try {
                                                                                            if (!v15) break block119;
                                                                                            this.t = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)12621, (long)(6872401942122585020L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.bU}, (long)-7020292419730811832L, (long)var1_1);
                                                                                            if (var3_2 != null) break block120;
                                                                                        }
                                                                                        catch (CustomSystemException v30) {
                                                                                            throw ResourceMappingController.a(v30);
                                                                                        }
                                                                                    }
                                                                                    this.t = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)17386, (long)(7287427562347079937L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.bU}, (long)-7020292419730811832L, (long)var1_1);
                                                                                }
                                                                                catch (CustomSystemException v31) {
                                                                                    throw ResourceMappingController.a(v31);
                                                                                }
                                                                            }
                                                                            this.M = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)20288, (long)(5962785086468990361L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, List.class, (Object)new Class[]{ReflectionMetadataResolver.PE, ReflectionMetadataResolver.bU}, (long)-7020292419730811832L, (long)var1_1);
                                                                            this.s = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)24633, (long)(3599036351680875247L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Pe, (Object)new Class[0], (long)-7020292419730811832L, (long)var1_1);
                                                                        }
                                                                        try {
                                                                            block123: {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                v32 = GameVersionEnumerator.MC_1_16_5.H();
                                                                                                if (var3_2 == null) break block121;
                                                                                                if (v32) {
                                                                                                }
                                                                                                ** GOTO lbl303
                                                                                            }
                                                                                            catch (CustomSystemException v33) {
                                                                                                throw ResourceMappingController.a(v33);
                                                                                            }
                                                                                            v34 = this;
                                                                                            v35 = ResourceMappingController.c("U", (Object)this, (Object)ReflectionMetadataResolver.Et, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)14823, (long)(5292621956900246283L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, Iterable.class, (Object)new Class[0], (long)-7020404691007034522L, (long)var1_1);
                                                                                            if (var3_2 == null) break block122;
                                                                                        }
                                                                                        catch (CustomSystemException v36) {
                                                                                            throw ResourceMappingController.a(v36);
                                                                                        }
                                                                                        v34.o = v35;
                                                                                        if (!GameVersionEnumerator.MC_1_20_6.H()) break block123;
                                                                                    }
                                                                                    catch (CustomSystemException v37) {
                                                                                        throw ResourceMappingController.a(v37);
                                                                                    }
                                                                                    this.m = ResourceMappingController.c("U", (Object)this, ReflectionMetadataResolver.U_, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)29231, (long)(594923954837264600L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, List.class, (Object)new Class[]{ReflectionMetadataResolver.PE, ReflectionMetadataResolver.bU, Predicate.class}, (long)-7020404691007034522L, (long)var1_1);
                                                                                    if (var3_2 != null) break block124;
                                                                                }
                                                                                catch (CustomSystemException v38) {
                                                                                    throw ResourceMappingController.a(v38);
                                                                                }
                                                                            }
                                                                            v34 = this;
                                                                            v35 = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)32521, (long)(498498903000782304L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, List.class, (Object)new Class[]{ReflectionMetadataResolver.PE, ReflectionMetadataResolver.bU, Predicate.class}, (long)-7020292419730811832L, (long)var1_1);
                                                                        }
                                                                        catch (CustomSystemException v39) {
                                                                            throw ResourceMappingController.a(v39);
                                                                        }
                                                                    }
                                                                    v34.m = v35;
                                                                }
                                                                try {
                                                                    block125: {
                                                                        try {
                                                                            if (GeometryCalculator.C() < 37) break block125;
                                                                            this.O = ResourceMappingController.c("U", (Object)this, (Object)ReflectionMetadataResolver.Et, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)25484, (long)(3830377670395988312L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE, ReflectionMetadataResolver.rG}, (long)-7020404691007034522L, (long)var1_1);
                                                                            if (var3_2 != null) break block126;
                                                                        }
                                                                        catch (CustomSystemException v40) {
                                                                            throw ResourceMappingController.a(v40);
                                                                        }
                                                                    }
                                                                    this.O = ResourceMappingController.c("U", (Object)this, (Object)ReflectionMetadataResolver.Et, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)31437, (long)(8582563185884565506L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.PE}, (long)-7020404691007034522L, (long)var1_1);
                                                                }
                                                                catch (CustomSystemException v41) {
                                                                    throw ResourceMappingController.a(v41);
                                                                }
                                                            }
                                                            try {
                                                                block128: {
                                                                    try {
                                                                        try {
                                                                            this.y = ((StatefulEventToggle)ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)30207, (long)(6604090224484785944L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (Object)ReflectionMetadataResolver.Ff, (Object)new Class[]{ReflectionMetadataResolver.P2}, (long)-7019519464701726716L, (long)var1_1).V(GameVersionEnumerator.MC_1_21_4.R(), ReflectionMetadataResolver.rF)).M();
                                                                            this.Q = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)3760, (long)(7469042301764625459L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.EF, (Object)new Class[]{Integer.TYPE, Integer.TYPE}, (long)-7020292419730811832L, (long)var1_1);
                                                                            this.D = ResourceMappingController.c("U", (Object)this, (Object)ReflectionMetadataResolver.v, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)9736, (long)(95838255238696132L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.tY, (Object)new Class[0], (long)-7020404691007034522L, (long)var1_1);
                                                                            this.Z = ResourceMappingController.c("U", (Object)this, (Object)ReflectionMetadataResolver.Et, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)783, (long)(4651892838234122692L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE, ReflectionMetadataResolver.PE}, (long)-7020404691007034522L, (long)var1_1);
                                                                            v42 = this;
                                                                            v43 = ResourceMappingController.c("U", (Object)this, (Object)ReflectionMetadataResolver.f, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)14846, (long)(1479007198191866661L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, (long)-7020404691007034522L, (long)var1_1);
                                                                            if (var3_2 == null) break block127;
                                                                            v42.v = v43;
                                                                            if (!GameVersionEnumerator.MC_1_20_6.Q()) break block128;
                                                                        }
                                                                        catch (CustomSystemException v44) {
                                                                            throw ResourceMappingController.a(v44);
                                                                        }
                                                                        this.B = ResourceMappingController.c("U", (Object)this, (Object)ReflectionMetadataResolver.b2, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)3143, (long)(7585792682214123139L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.PE, ReflectionMetadataResolver.bU, BiPredicate.class}, (long)-7020404691007034522L, (long)var1_1);
                                                                        if (var3_2 != null) break block129;
                                                                    }
                                                                    catch (CustomSystemException v45) {
                                                                        throw ResourceMappingController.a(v45);
                                                                    }
                                                                }
                                                                v42 = this;
                                                                v43 = ((StatefulEventToggle)ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)8668, (long)(8385745473013205764L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.PE, ReflectionMetadataResolver.bU}, (long)-7019519464701726716L, (long)var1_1).F(ReflectionMetadataResolver.b2)).M();
                                                            }
                                                            catch (CustomSystemException v46) {
                                                                throw ResourceMappingController.a(v46);
                                                            }
                                                        }
                                                        v42.j = v43;
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    v47 = (int)GameVersionEnumerator.MC_1_21_4.H();
                                                                    if (var3_2 == null) break block130;
                                                                    if (v47 == 0) break block131;
                                                                }
                                                                catch (CustomSystemException v48) {
                                                                    throw ResourceMappingController.a(v48);
                                                                }
                                                                this.u = ((StatefulEventToggle)ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)1559, (long)(5674018183287401673L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (Object)ReflectionMetadataResolver.d, (Object)new Class[]{ReflectionMetadataResolver.p}, (long)-7019519464701726716L, (long)var1_1).F(ReflectionMetadataResolver.rF)).M();
                                                                if (var3_2 != null) break block131;
                                                            }
                                                            catch (CustomSystemException v49) {
                                                                throw ResourceMappingController.a(v49);
                                                            }
lbl303:
                                                            // 2 sources

                                                            this.I = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)22204, (long)(1191210718899158099L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, List.class, (long)-7019617758070361143L, (long)var1_1);
                                                            this.g = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)29195, (long)(8373581955330742510L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, List.class, (long)-7019617758070361143L, (long)var1_1);
                                                            v50 = this;
                                                            v51 = this;
                                                            v52 = ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)30336, (long)(6041214874255236214L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1);
                                                            v53 = true;
                                                            v54 = ReflectionMetadataResolver.Vz;
                                                            if (var3_2 == null) break block132;
                                                        }
                                                        catch (CustomSystemException v55) {
                                                            throw ResourceMappingController.a(v55);
                                                        }
                                                        v50.a = ResourceMappingController.c("U", (Object)v51, (Object)v52, (boolean)v53, (Object)v54, (long)-7019617758070361143L, (long)var1_1);
                                                        v32 = GameVersionEnumerator.MC_1_12_2.H();
                                                    }
                                                    catch (CustomSystemException v56) {
                                                        throw ResourceMappingController.a(v56);
                                                    }
                                                }
                                                try {
                                                    block133: {
                                                        try {
                                                            if (!v32) break block133;
                                                            this.m = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)14992, (long)(922805700415148140L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, List.class, (Object)new Class[]{ReflectionMetadataResolver.PE, ReflectionMetadataResolver.bU, ReflectionMetadataResolver.Vt}, (long)-7020292419730811832L, (long)var1_1);
                                                            if (var3_2 != null) break block134;
                                                        }
                                                        catch (CustomSystemException v57) {
                                                            throw ResourceMappingController.a(v57);
                                                        }
                                                    }
                                                    v50 = this;
                                                    v51 = this;
                                                    v52 = ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)27819, (long)(8953891764867335786L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1);
                                                    v53 = true;
                                                    v54 = List.class;
                                                }
                                                catch (CustomSystemException v58) {
                                                    throw ResourceMappingController.a(v58);
                                                }
                                            }
                                            v50.m = ResourceMappingController.c("U", (Object)v51, (Object)v52, (boolean)v53, v54, (Object)new Class[]{ReflectionMetadataResolver.PE, ReflectionMetadataResolver.bU}, (long)-7020292419730811832L, (long)var1_1);
                                        }
                                        this.O = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)13594, (long)(2915648322229592023L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.PE}, (long)-7020292419730811832L, (long)var1_1);
                                        this.Q = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)26612, (long)(3459631718537661747L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.EF, (Object)new Class[]{Integer.TYPE, Integer.TYPE}, (long)-7020292419730811832L, (long)var1_1);
                                        this.D = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)27242, (long)(4614454977226014878L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.tY, (Object)new Class[0], (long)-7020292419730811832L, (long)var1_1);
                                        this.Z = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)9923, (long)(1685843102643866643L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.PE}, (long)-7020292419730811832L, (long)var1_1);
                                        this.v = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)28914, (long)(3572440574271461895L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, (long)-7020292419730811832L, (long)var1_1);
                                        this.U = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)31866, (long)(2843556035078198962L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Long.TYPE}, (long)-7020292419730811832L, (long)var1_1);
                                    }
                                    v47 = GeometryCalculator.C();
                                }
                                try {
                                    try {
                                        if (var3_2 == null) break block135;
                                        if (v47 < 37) break block136;
                                    }
                                    catch (CustomSystemException v59) {
                                        throw ResourceMappingController.a(v59);
                                    }
                                    this.k = ResourceMappingController.c("U", (Object)this, (Object)ReflectionMetadataResolver.v, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)5775, (long)(8065993952520109172L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Vv, (Object)new Class[0], (long)-7020404691007034522L, (long)var1_1);
                                }
                                catch (CustomSystemException v60) {
                                    throw ResourceMappingController.a(v60);
                                }
                            }
                            v47 = (int)GameVersionEnumerator.MC_1_20_6.H();
                        }
                        try {
                            try {
                                if (var3_2 == null) break block137;
                                if (v47 == 0) break block138;
                            }
                            catch (CustomSystemException v61) {
                                throw ResourceMappingController.a(v61);
                            }
                            this.h = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)18854, (long)(590537358227874662L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Vr, (long)-7019617758070361143L, (long)var1_1);
                        }
                        catch (CustomSystemException v62) {
                            throw ResourceMappingController.a(v62);
                        }
                    }
                    v47 = (int)GameVersionEnumerator.MC_1_8_9.b();
                }
                try {
                    try {
                        if (var3_2 == null) break block139;
                        if (v47 == 0) break block140;
                    }
                    catch (CustomSystemException v63) {
                        throw ResourceMappingController.a(v63);
                    }
                    this.n = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)7658, (long)(2142454160211670843L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.bU, ReflectionMetadataResolver.EE}, (long)-7020292419730811832L, (long)var1_1);
                }
                catch (CustomSystemException v64) {
                    throw ResourceMappingController.a(v64);
                }
            }
            v47 = (int)GameVersionEnumerator.MC_1_21_4.H();
        }
        try {
            if (v47 != 0) {
                this.A = ResourceMappingController.c("U", (Object)this, (Object)ResourceMappingController.c("G", (int)ResourceMappingController.b("x", (int)23829, (long)(346171220219344839L ^ var1_1)), (long)-7019436796657100471L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Ya, (long)-7019617758070361143L, (long)var1_1);
            }
        }
        catch (CustomSystemException v65) {
            throw ResourceMappingController.a(v65);
        }
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7453;
        if (q[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])F.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    F.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/lh", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ResourceMappingController.q[n2] = n3;
        }
        return q[n2];
    }

    public static void x(String string) {
        L = string;
    }

    public boolean o(Object object, Object object2, Object object3, BiPredicate biPredicate) {
        return this.B.V(object, object2, object3, biPredicate);
    }

    public List l(Object object, Object object2, Object object3) {
        return (List)this.m.T(object, object2, object3);
    }

    private static Method h(long l, long l2) {
        int n = ResourceMappingController.e(l, l2);
        Object object = G[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = H[n];
                int n3 = string2.indexOf(8);
                clazz3 = ResourceMappingController.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ResourceMappingController.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ResourceMappingController.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        ResourceMappingController.G[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ResourceMappingController.f(961351073722975L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ResourceMappingController.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ResourceMappingController.G[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ResourceMappingController.f(961351073722975L, 0L);
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

    public List E(Object object) {
        return (List)this.g.Z(object);
    }

    public boolean e(Object object, Object object2, Object object3) {
        return this.n.V(object, object2, object3);
    }

    static void l(ResourceMappingController resourceMappingController, Object object, int n, Object object2) {
        resourceMappingController.p(object, n, object2);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = ResourceMappingController.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ResourceMappingController.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private void f(Object object, Object object2) {
        this.O.l(object, object2);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/lh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void a() {
        Object[] objectArray = G;
        G[0] = ".\u0017+\u0017";
        objectArray[1] = "\u0012\u001e\u0018u+~\u0019\u0011\t:Vf\n\u0016\u0000s";
        objectArray[2] = Boolean.TYPE;
        ResourceMappingController.H[2] = "java/lang/Boolean";
        objectArray[3] = "uJ_~Ov~EN1\"v~XZ";
        objectArray[4] = "\u001db\u0014\t+_hB\u001f\u0006:\u0010\u0005B\u001f\u001b.\u0005";
        objectArray[5] = "|3\r\b";
        objectArray[6] = "\u0016(\rdjbc\b\u0006k{-\u000e\b\u0006vo8";
        objectArray[7] = "ej8";
        objectArray[8] = Integer.TYPE;
        ResourceMappingController.H[8] = "java/lang/Integer";
        objectArray[9] = "\u0019k{l";
        objectArray[10] = "K#z\u0000s->\u0003q\u000fbbS\u0003q\u0012vw";
        objectArray[11] = "2UC\u0012\u0007zGuH\u001d\u00165*uH\u0000\u0002 ";
        objectArray[12] = "H\u0018W\r";
        objectArray[13] = "G\u0003;\u0007i.L\f*H\b G\u0007.\u0012";
        objectArray[14] = "8\u000b\u000f}8-b\u000eV\u0006\u0015\u0016/\tNl6v8\nM\u0006klf\u0000Xx4ke\u00051<i|`\u0011O|bh`j\u000evnw%\u0014Li8q^QO~,te\u0011]~+\u0016";
        objectArray[15] = "tI\u0006\u0005Q\f.L_~v7(\u0013R@@Ih\u0018F@;FqWR\u001a[QrT8GA\u000fxAF\u0018F\f}(\u0002EQ\tiVBNE\t\u0012\u0017HBZLlUW\u0014\\7)V@\u0000Y\fiD@\u0007;";
        objectArray[16] = "[m4xA\u0012\u0001hm\u0003p)LouiOI[lv\u0003\u0012S\u0005fc}MT\u0006c\n9\u0010C\u0003wty\u001bW\u0003\f43OKP~``L\u0017=";
        objectArray[17] = "EhOOsm\u001fm\u00164DVRj\u000e^}6Ei\r4 ,\u001bc\u0018J\u007f+\u0018fq\u000e\"<\u001dr\u000fN)(\u001d\tND%7Xw\f[s1#2\u000fLg4\u0018r\u001dL`V";
        objectArray[18] = "\u0002kBM_\u0006V>\n\u001dcWDUNQ\fG\u000f5\u0012O\u0013\u0006?$\u0010_\tX_3\u0013\\c";
        Object[] objectArray2 = objectArray;
        objectArray[19] = "t\u0019{\u0007$M.\u001c\"|,vc\u001b:\u0016*\u0016t\u00189|tMxF>\u00024FlFEC>Js\u0003;\u0001!\u001cuxu\u0010 Gs\u00124\u001a3\u0004\u0012";
    }

    public Object n(Object object, Object object2, Object object3) {
        return this.M.T(object, object2, object3);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ResourceMappingController.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ResourceMappingController.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

