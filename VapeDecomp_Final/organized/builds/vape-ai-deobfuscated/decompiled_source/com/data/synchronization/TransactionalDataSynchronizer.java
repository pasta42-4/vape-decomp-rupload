/*
 * Decompiled with CFR 0.152.
 */
package com.data.synchronization;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.concurrency.management.ThreadPoolCoordinator;
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
public class TransactionalDataSynchronizer
extends CryptoProtocolEngine {
    private static final Object[] j;
    private HK R;
    private static String y;
    public HK E;
    public final ReflectionUtilityService o;
    private static final long a;
    private HK T;
    public HK u;
    private HK Y;
    private HK S;
    public final HK B;
    private HK V;
    public HK M;
    public ReflectionUtilityService P;
    public HK k;
    private HK X;
    private ReflectionUtilityService K;
    private HK w;
    public HK e;
    private ReflectionUtilityService A;
    private ReflectionUtilityService p;
    private static final Integer[] d;
    private HK G;
    private ReflectionUtilityService O;
    private static final String[] m;
    private static final long[] b;
    private HK D;
    private HK s;
    private HK i;
    private final ReflectionUtilityService h;
    public HK W;
    private HK c;
    private static final Map g;
    private HK f;
    public HK Z;

    static boolean C(TransactionalDataSynchronizer transactionalDataSynchronizer, Object object) {
        return transactionalDataSynchronizer.X(object);
    }

    static Object E(TransactionalDataSynchronizer transactionalDataSynchronizer, Object object) {
        return transactionalDataSynchronizer.P(object);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c1' || c == 'o' || c == '\u00ff' || c == 'Z') {
                field = TransactionalDataSynchronizer.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c1' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'o' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ff' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = TransactionalDataSynchronizer.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'e' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6454;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
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
                throw new RuntimeException("a/vx", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            TransactionalDataSynchronizer.d[n2] = n3;
        }
        return d[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = TransactionalDataSynchronizer.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    static Object w(TransactionalDataSynchronizer transactionalDataSynchronizer, Object object, Object object2, Object object3, Object object4) {
        return transactionalDataSynchronizer.Y(object, object2, object3, object4);
    }

    static Object a(TransactionalDataSynchronizer transactionalDataSynchronizer, Object object, Object object2, int n, int n2, int n3) {
        return transactionalDataSynchronizer.h(object, object2, n, n2, n3);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    static boolean f(TransactionalDataSynchronizer transactionalDataSynchronizer, Object object, Object object2, int n, int n2, int n3, Object object3, int n4, float f, float f2, float f3) {
        return transactionalDataSynchronizer.f(object, object2, n, n2, n3, object3, n4, f, f2, f3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public TransactionalDataSynchronizer() {
        block184: {
            block182: {
                block180: {
                    block179: {
                        block178: {
                            block177: {
                                block176: {
                                    block173: {
                                        block172: {
                                            block163: {
                                                block170: {
                                                    block171: {
                                                        block168: {
                                                            block167: {
                                                                block166: {
                                                                    block164: {
                                                                        block159: {
                                                                            block162: {
                                                                                block160: {
                                                                                    block161: {
                                                                                        block157: {
                                                                                            block158: {
                                                                                                block154: {
                                                                                                    block155: {
                                                                                                        block145: {
                                                                                                            block151: {
                                                                                                                block150: {
                                                                                                                    block148: {
                                                                                                                        block146: {
                                                                                                                            block147: {
                                                                                                                                block143: {
                                                                                                                                    block144: {
                                                                                                                                        block139: {
                                                                                                                                            block140: {
                                                                                                                                                block141: {
                                                                                                                                                    block137: {
                                                                                                                                                        block138: {
                                                                                                                                                            block135: {
                                                                                                                                                                block136: {
                                                                                                                                                                    var1_1 = TransactionalDataSynchronizer.a ^ 100871351491010L;
                                                                                                                                                                    v0 = TransactionalDataSynchronizer.A();
                                                                                                                                                                    super(ReflectionMetadataResolver.l);
                                                                                                                                                                    var3_2 = v0;
                                                                                                                                                                    try {
                                                                                                                                                                        try {
                                                                                                                                                                            v1 = GeometryCalculator.C();
                                                                                                                                                                            v2 = 50;
                                                                                                                                                                            if (var3_2 != null) break block135;
                                                                                                                                                                            if (v1 >= v2) break block136;
                                                                                                                                                                        }
                                                                                                                                                                        catch (CustomSystemException v3) {
                                                                                                                                                                            throw TransactionalDataSynchronizer.a(v3);
                                                                                                                                                                        }
                                                                                                                                                                        this.O = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)28188, (long)(7567490979488783337L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, Float.TYPE, (long)5888918433952121586L, (long)var1_1);
                                                                                                                                                                    }
                                                                                                                                                                    catch (CustomSystemException v4) {
                                                                                                                                                                        throw TransactionalDataSynchronizer.a(v4);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                v1 = GeometryCalculator.C();
                                                                                                                                                                v2 = 35;
                                                                                                                                                            }
                                                                                                                                                            try {
                                                                                                                                                                if (var3_2 != null) break block137;
                                                                                                                                                                if (v1 < v2) break block138;
                                                                                                                                                                break block139;
                                                                                                                                                            }
                                                                                                                                                            catch (CustomSystemException v5) {
                                                                                                                                                                throw TransactionalDataSynchronizer.a(v5);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        v1 = GeometryCalculator.C();
                                                                                                                                                        v2 = 23;
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                if (var3_2 != null) break block140;
                                                                                                                                                                if (v1 < v2) break block141;
                                                                                                                                                            }
                                                                                                                                                            catch (CustomSystemException v6) {
                                                                                                                                                                throw TransactionalDataSynchronizer.a(v6);
                                                                                                                                                            }
                                                                                                                                                            this.W = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)5694, (long)(2321765530512892914L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.bU, (Object)new Class[]{ReflectionMetadataResolver.VJ, ReflectionMetadataResolver.EV, ReflectionMetadataResolver.P2}, (long)5888771032457848097L, (long)var1_1);
                                                                                                                                                            if (var3_2 == null) break block139;
                                                                                                                                                        }
                                                                                                                                                        catch (CustomSystemException v7) {
                                                                                                                                                            throw TransactionalDataSynchronizer.a(v7);
                                                                                                                                                        }
                                                                                                                                                        AbstractComputationKernel.I(new String[4]);
                                                                                                                                                    }
                                                                                                                                                    catch (CustomSystemException v8) {
                                                                                                                                                        throw TransactionalDataSynchronizer.a(v8);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                v1 = GeometryCalculator.C();
                                                                                                                                                v2 = 13;
                                                                                                                                            }
                                                                                                                                            try {
                                                                                                                                                block142: {
                                                                                                                                                    try {
                                                                                                                                                        if (v1 <= v2) break block142;
                                                                                                                                                        this.W = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)13251, (long)(8827827865661408803L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.bU, (Object)new Class[]{ReflectionMetadataResolver.EV, ReflectionMetadataResolver.P2}, (long)5888771032457848097L, (long)var1_1);
                                                                                                                                                        if (var3_2 == null) break block139;
                                                                                                                                                    }
                                                                                                                                                    catch (CustomSystemException v9) {
                                                                                                                                                        throw TransactionalDataSynchronizer.a(v9);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                this.W = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)629, (long)(7531276768646739901L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.bU, (Object)new Class[]{ReflectionMetadataResolver.EV, Integer.TYPE, Integer.TYPE, Integer.TYPE}, (long)5888771032457848097L, (long)var1_1);
                                                                                                                                            }
                                                                                                                                            catch (CustomSystemException v10) {
                                                                                                                                                throw TransactionalDataSynchronizer.a(v10);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                v11 = GameVersionEnumerator.MC_1_7_10.C();
                                                                                                                                                if (var3_2 != null) break block143;
                                                                                                                                                if (v11 == 0) break block144;
                                                                                                                                            }
                                                                                                                                            catch (CustomSystemException v12) {
                                                                                                                                                throw TransactionalDataSynchronizer.a(v12);
                                                                                                                                            }
                                                                                                                                            this.A = ((ThreadPoolCoordinator)((ThreadPoolCoordinator)TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)16390, (long)(5087112364898252274L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (Object)ReflectionMetadataResolver.VJ, (long)5889014988232833834L, (long)var1_1).e(GameVersionEnumerator.MC_1_16_5.R(), (String)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)546, (long)(4374592749867579336L ^ var1_1)), (long)5888529823962565614L, (long)var1_1))).g(GameVersionEnumerator.MC_1_16_5.R(), ReflectionMetadataResolver.FI)).p();
                                                                                                                                        }
                                                                                                                                        catch (CustomSystemException v13) {
                                                                                                                                            throw TransactionalDataSynchronizer.a(v13);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    v11 = GeometryCalculator.C();
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                v14 = 35;
                                                                                                                                                if (var3_2 != null) break block145;
                                                                                                                                                if (v11 >= v14) {
                                                                                                                                                }
                                                                                                                                                ** GOTO lbl180
                                                                                                                                            }
                                                                                                                                            catch (CustomSystemException v15) {
                                                                                                                                                throw TransactionalDataSynchronizer.a(v15);
                                                                                                                                            }
                                                                                                                                            this.B = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)19194, (long)(5534196292208262944L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[]{ReflectionMetadataResolver.FI}, (long)5888485967492877845L, (long)var1_1);
                                                                                                                                            v16 = GeometryCalculator.C();
                                                                                                                                            v17 = 50;
                                                                                                                                            if (var3_2 != null) break block146;
                                                                                                                                        }
                                                                                                                                        catch (CustomSystemException v18) {
                                                                                                                                            throw TransactionalDataSynchronizer.a(v18);
                                                                                                                                        }
                                                                                                                                        if (v16 >= v17) break block147;
                                                                                                                                    }
                                                                                                                                    catch (CustomSystemException v19) {
                                                                                                                                        throw TransactionalDataSynchronizer.a(v19);
                                                                                                                                    }
                                                                                                                                    this.P = TransactionalDataSynchronizer.c("e", (Object)this, (Object)ReflectionMetadataResolver.Ep, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)1018, (long)(3430856800504165915L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.EE, (long)5888733872908421795L, (long)var1_1);
                                                                                                                                }
                                                                                                                                catch (CustomSystemException v20) {
                                                                                                                                    throw TransactionalDataSynchronizer.a(v20);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                v21 = this;
                                                                                                                                v22 = this;
                                                                                                                                v23 = ReflectionMetadataResolver.Ep;
                                                                                                                                v24 = TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)3645, (long)(4519343073977678842L ^ var1_1)), (long)5888529823962565614L, (long)var1_1);
                                                                                                                                v25 = true;
                                                                                                                                v26 = Boolean.TYPE;
                                                                                                                                if (var3_2 != null) break block148;
                                                                                                                                v21.K = TransactionalDataSynchronizer.c("e", (Object)v22, (Object)v23, (Object)v24, (boolean)v25, (Object)v26, (long)5888733872908421795L, (long)var1_1);
                                                                                                                                v16 = GeometryCalculator.C();
                                                                                                                                v17 = 50;
                                                                                                                            }
                                                                                                                            catch (CustomSystemException v27) {
                                                                                                                                throw TransactionalDataSynchronizer.a(v27);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            block149: {
                                                                                                                                try {
                                                                                                                                    if (v16 < v17) break block149;
                                                                                                                                    this.S = TransactionalDataSynchronizer.c("e", (Object)this, (Object)ReflectionMetadataResolver.Ep, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)21146, (long)(9080522958632740699L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.FO, (Object)new Class[]{ReflectionMetadataResolver.FI, ReflectionMetadataResolver.EV, ReflectionMetadataResolver.P2, ReflectionMetadataResolver.UQ, ReflectionMetadataResolver.d}, (long)5888869309729779010L, (long)var1_1);
                                                                                                                                    if (var3_2 == null) break block150;
                                                                                                                                }
                                                                                                                                catch (CustomSystemException v28) {
                                                                                                                                    throw TransactionalDataSynchronizer.a(v28);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            v21 = this;
                                                                                                                            v22 = this;
                                                                                                                            v23 = ReflectionMetadataResolver.Ep;
                                                                                                                            v24 = TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)11207, (long)(3748953391801572912L ^ var1_1)), (long)5888529823962565614L, (long)var1_1);
                                                                                                                            v25 = true;
                                                                                                                            v26 = ReflectionMetadataResolver.FO;
                                                                                                                        }
                                                                                                                        catch (CustomSystemException v29) {
                                                                                                                            throw TransactionalDataSynchronizer.a(v29);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    v21.S = TransactionalDataSynchronizer.c("e", (Object)v22, (Object)v23, (Object)v24, (boolean)v25, (Object)v26, (Object)new Class[]{ReflectionMetadataResolver.FI, ReflectionMetadataResolver.EV, ReflectionMetadataResolver.P2, ReflectionMetadataResolver.UQ, ReflectionMetadataResolver.F7, ReflectionMetadataResolver.d}, (long)5888869309729779010L, (long)var1_1);
                                                                                                                }
                                                                                                                try {
                                                                                                                    block152: {
                                                                                                                        try {
                                                                                                                            block153: {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            this.A = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)647, (long)(8541925713623005044L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.FI, (long)5888918433952121586L, (long)var1_1);
                                                                                                                                            if (var3_2 != null) break block151;
                                                                                                                                            if (!GameVersionEnumerator.MC_1_21_0.H()) break block152;
                                                                                                                                        }
                                                                                                                                        catch (CustomSystemException v30) {
                                                                                                                                            throw TransactionalDataSynchronizer.a(v30);
                                                                                                                                        }
                                                                                                                                        if (!GameVersionEnumerator.MC_1_21_4.H()) break block153;
                                                                                                                                    }
                                                                                                                                    catch (CustomSystemException v31) {
                                                                                                                                        throw TransactionalDataSynchronizer.a(v31);
                                                                                                                                    }
                                                                                                                                    this.f = TransactionalDataSynchronizer.c("e", (Object)this, (Object)ReflectionMetadataResolver.Ep, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)32630, (long)(745442220821334673L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Vl, (Object)new Class[]{ReflectionMetadataResolver.T, ReflectionMetadataResolver.P2, ReflectionMetadataResolver.FI, Boolean.TYPE}, (long)5888869309729779010L, (long)var1_1);
                                                                                                                                    if (var3_2 == null) break block154;
                                                                                                                                }
                                                                                                                                catch (CustomSystemException v32) {
                                                                                                                                    throw TransactionalDataSynchronizer.a(v32);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            this.f = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)23981, (long)(6334376639243937879L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Vl, (Object)new Class[]{ReflectionMetadataResolver.T, ReflectionMetadataResolver.P2, ReflectionMetadataResolver.FI}, (long)5888771032457848097L, (long)var1_1);
                                                                                                                            if (var3_2 == null) break block154;
                                                                                                                        }
                                                                                                                        catch (CustomSystemException v33) {
                                                                                                                            throw TransactionalDataSynchronizer.a(v33);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    this.f = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)11077, (long)(7075473905086013084L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Vl, (Object)new Class[]{ReflectionMetadataResolver.rF, ReflectionMetadataResolver.P2, ReflectionMetadataResolver.FI}, (long)5888771032457848097L, (long)var1_1);
                                                                                                                }
                                                                                                                catch (CustomSystemException v34) {
                                                                                                                    throw TransactionalDataSynchronizer.a(v34);
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                try {
                                                                                                                    if (var3_2 == null) break block154;
lbl180:
                                                                                                                    // 2 sources

                                                                                                                    this.B = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)16797, (long)(7075600548727125086L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[]{ReflectionMetadataResolver.l}, (long)5888485967492877845L, (long)var1_1);
                                                                                                                    v35 = this;
                                                                                                                    v36 = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)17314, (long)(6770540552023406173L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.l, (Object)new Class[]{String.class}, (long)5888485967492877845L, (long)var1_1);
                                                                                                                    if (var3_2 != null) break block155;
                                                                                                                }
                                                                                                                catch (CustomSystemException v37) {
                                                                                                                    throw TransactionalDataSynchronizer.a(v37);
                                                                                                                }
                                                                                                                v35.s = v36;
                                                                                                                v11 = GeometryCalculator.C();
                                                                                                                v14 = 23;
                                                                                                            }
                                                                                                            catch (CustomSystemException v38) {
                                                                                                                throw TransactionalDataSynchronizer.a(v38);
                                                                                                            }
                                                                                                        }
                                                                                                        try {
                                                                                                            block156: {
                                                                                                                try {
                                                                                                                    if (v11 < v14) break block156;
                                                                                                                    this.E = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)29031, (long)(3759914554915865754L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.EE, (Object)new Class[]{ReflectionMetadataResolver.VJ}, (long)5888771032457848097L, (long)var1_1);
                                                                                                                    if (var3_2 == null) break block154;
                                                                                                                }
                                                                                                                catch (CustomSystemException v39) {
                                                                                                                    throw TransactionalDataSynchronizer.a(v39);
                                                                                                                }
                                                                                                            }
                                                                                                            v35 = this;
                                                                                                            v36 = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)6544, (long)(4783769025592372303L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.EE, (Object)new Class[0], (long)5888771032457848097L, (long)var1_1);
                                                                                                        }
                                                                                                        catch (CustomSystemException v40) {
                                                                                                            throw TransactionalDataSynchronizer.a(v40);
                                                                                                        }
                                                                                                    }
                                                                                                    v35.E = v36;
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        v41 = GeometryCalculator.C();
                                                                                                        v42 = 23;
                                                                                                        if (var3_2 != null) break block157;
                                                                                                        if (v41 >= v42) break block158;
                                                                                                    }
                                                                                                    catch (CustomSystemException v43) {
                                                                                                        throw TransactionalDataSynchronizer.a(v43);
                                                                                                    }
                                                                                                    this.V = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)10232, (long)(7018648362695954958L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[0], (long)5888771032457848097L, (long)var1_1);
                                                                                                }
                                                                                                catch (CustomSystemException v44) {
                                                                                                    throw TransactionalDataSynchronizer.a(v44);
                                                                                                }
                                                                                            }
                                                                                            v41 = GeometryCalculator.C();
                                                                                            v42 = 13;
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        if (var3_2 != null) break block159;
                                                                                                        if (v41 == v42) {
                                                                                                        }
                                                                                                        ** GOTO lbl266
                                                                                                    }
                                                                                                    catch (CustomSystemException v45) {
                                                                                                        throw TransactionalDataSynchronizer.a(v45);
                                                                                                    }
                                                                                                    this.Y = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)12872, (long)(1046499642384025505L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.EV, Integer.TYPE, Integer.TYPE, Integer.TYPE, ReflectionMetadataResolver.PE}, (long)5888771032457848097L, (long)var1_1);
                                                                                                    this.M = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)14773, (long)(3119806914782071881L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[0], (long)5888771032457848097L, (long)var1_1);
                                                                                                    this.Z = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)396, (long)(4060984323936859240L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.bU, (Object)new Class[]{ReflectionMetadataResolver.EV, Integer.TYPE, Integer.TYPE, Integer.TYPE}, (long)5888771032457848097L, (long)var1_1);
                                                                                                    v46 = this;
                                                                                                    v47 = this;
                                                                                                    v48 /* !! */  = ObjectLifecycleTracker.U.d();
                                                                                                    if (var3_2 != null) break block160;
                                                                                                }
                                                                                                catch (CustomSystemException v49) {
                                                                                                    throw TransactionalDataSynchronizer.a(v49);
                                                                                                }
                                                                                                if (v48 /* !! */  == 0) break block161;
                                                                                            }
                                                                                            catch (CustomSystemException v50) {
                                                                                                throw TransactionalDataSynchronizer.a(v50);
                                                                                            }
                                                                                            v51 = TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)28420, (long)(3668965550579636943L ^ var1_1)), (long)5888529823962565614L, (long)var1_1);
                                                                                            break block162;
                                                                                        }
                                                                                        catch (CustomSystemException v52) {
                                                                                            throw TransactionalDataSynchronizer.a(v52);
                                                                                        }
                                                                                    }
                                                                                    v48 /* !! */  = (int)TransactionalDataSynchronizer.b("t", (int)13401, (long)(8840858421390999994L ^ var1_1));
                                                                                }
                                                                                v51 = TransactionalDataSynchronizer.c("\u00c4", (int)v48 /* !! */ , (long)5888529823962565614L, (long)var1_1);
                                                                            }
                                                                            try {
                                                                                v46.T = TransactionalDataSynchronizer.c("e", (Object)v47, (Object)v51, (boolean)true, Boolean.TYPE, (Object)new Class[]{Integer.TYPE, Boolean.TYPE}, (long)5888771032457848097L, (long)var1_1);
                                                                                this.S = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)15515, (long)(131378818914847092L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.EV, Integer.TYPE, Integer.TYPE, Integer.TYPE, ReflectionMetadataResolver.UQ, Integer.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, (long)5888771032457848097L, (long)var1_1);
                                                                                this.c = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)29767, (long)(8634245389814612386L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)5888771032457848097L, (long)var1_1);
                                                                                if (var3_2 == null) break block163;
lbl266:
                                                                                // 2 sources

                                                                                v41 = GeometryCalculator.C();
                                                                                v42 = 23;
                                                                            }
                                                                            catch (CustomSystemException v53) {
                                                                                throw TransactionalDataSynchronizer.a(v53);
                                                                            }
                                                                        }
                                                                        try {
                                                                            block165: {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                if (var3_2 != null) break block164;
                                                                                                if (v41 < v42) break block165;
                                                                                            }
                                                                                            catch (CustomSystemException v54) {
                                                                                                throw TransactionalDataSynchronizer.a(v54);
                                                                                            }
                                                                                            v41 = GeometryCalculator.C();
                                                                                            v42 = 35;
                                                                                            if (var3_2 != null) break block164;
                                                                                        }
                                                                                        catch (CustomSystemException v55) {
                                                                                            throw TransactionalDataSynchronizer.a(v55);
                                                                                        }
                                                                                        if (v41 >= v42) break block165;
                                                                                    }
                                                                                    catch (CustomSystemException v56) {
                                                                                        throw TransactionalDataSynchronizer.a(v56);
                                                                                    }
                                                                                    this.S = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)5436, (long)(2731751304700338382L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.EV, ReflectionMetadataResolver.P2, ReflectionMetadataResolver.VJ, ReflectionMetadataResolver.UQ, ReflectionMetadataResolver.F7, ReflectionMetadataResolver.Pb, Float.TYPE, Float.TYPE, Float.TYPE}, (long)5888771032457848097L, (long)var1_1);
                                                                                    if (var3_2 == null) break block166;
                                                                                }
                                                                                catch (CustomSystemException v57) {
                                                                                    throw TransactionalDataSynchronizer.a(v57);
                                                                                }
                                                                            }
                                                                            v41 = GeometryCalculator.C();
                                                                            v42 = 15;
                                                                        }
                                                                        catch (CustomSystemException v58) {
                                                                            throw TransactionalDataSynchronizer.a(v58);
                                                                        }
                                                                    }
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (var3_2 != null) break block167;
                                                                                    if (v41 < v42) break block166;
                                                                                }
                                                                                catch (CustomSystemException v59) {
                                                                                    throw TransactionalDataSynchronizer.a(v59);
                                                                                }
                                                                                v41 = GeometryCalculator.C();
                                                                                v42 = 23;
                                                                                if (var3_2 != null) break block167;
                                                                            }
                                                                            catch (CustomSystemException v60) {
                                                                                throw TransactionalDataSynchronizer.a(v60);
                                                                            }
                                                                            if (v41 >= v42) break block166;
                                                                        }
                                                                        catch (CustomSystemException v61) {
                                                                            throw TransactionalDataSynchronizer.a(v61);
                                                                        }
                                                                        this.S = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)12580, (long)(2499960848247915727L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.EV, ReflectionMetadataResolver.P2, ReflectionMetadataResolver.VJ, ReflectionMetadataResolver.UQ, ReflectionMetadataResolver.Pb, Float.TYPE, Float.TYPE, Float.TYPE}, (long)5888771032457848097L, (long)var1_1);
                                                                    }
                                                                    catch (CustomSystemException v62) {
                                                                        throw TransactionalDataSynchronizer.a(v62);
                                                                    }
                                                                }
                                                                v41 = GeometryCalculator.C();
                                                                v42 = 23;
                                                            }
                                                            try {
                                                                block169: {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (var3_2 != null) break block168;
                                                                                    if (v41 < v42) break block169;
                                                                                }
                                                                                catch (CustomSystemException v63) {
                                                                                    throw TransactionalDataSynchronizer.a(v63);
                                                                                }
                                                                                v41 = GeometryCalculator.C();
                                                                                v42 = 35;
                                                                                if (var3_2 != null) break block170;
                                                                            }
                                                                            catch (CustomSystemException v64) {
                                                                                throw TransactionalDataSynchronizer.a(v64);
                                                                            }
                                                                            if (v41 >= v42) break block171;
                                                                        }
                                                                        catch (CustomSystemException v65) {
                                                                            throw TransactionalDataSynchronizer.a(v65);
                                                                        }
                                                                        this.u = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)20024, (long)(1774516380882729940L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.VJ, ReflectionMetadataResolver.U0, ReflectionMetadataResolver.P2, ReflectionMetadataResolver.Pb}, (long)5888771032457848097L, (long)var1_1);
                                                                        this.X = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)11750, (long)(7581713823332505623L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.VJ}, (long)5888771032457848097L, (long)var1_1);
                                                                        this.c = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)16694, (long)(3048481893647316206L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.VJ}, (long)5888771032457848097L, (long)var1_1);
                                                                        this.e = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)16379, (long)(3734541571508079166L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, Float.TYPE, (Object)new Class[]{ReflectionMetadataResolver.VJ}, (long)5888771032457848097L, (long)var1_1);
                                                                        this.Z = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)29345, (long)(6694131603901663100L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.bU, (Object)new Class[]{ReflectionMetadataResolver.VJ, ReflectionMetadataResolver.U0, ReflectionMetadataResolver.P2}, (long)5888771032457848097L, (long)var1_1);
                                                                        if (var3_2 == null) break block171;
                                                                    }
                                                                    catch (CustomSystemException v66) {
                                                                        throw TransactionalDataSynchronizer.a(v66);
                                                                    }
                                                                }
                                                                this.Z = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)11226, (long)(8355608668634291748L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.bU, (Object)new Class[]{ReflectionMetadataResolver.EV, ReflectionMetadataResolver.P2, ReflectionMetadataResolver.VJ}, (long)5888771032457848097L, (long)var1_1);
                                                                this.X = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)20611, (long)(5052181033934939465L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)5888771032457848097L, (long)var1_1);
                                                                this.c = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)17406, (long)(598713246242141751L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)5888771032457848097L, (long)var1_1);
                                                                this.e = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)28597, (long)(3720409284571060841L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, Float.TYPE, (Object)new Class[0], (long)5888771032457848097L, (long)var1_1);
                                                                v41 = GeometryCalculator.C();
                                                                v42 = 35;
                                                            }
                                                            catch (CustomSystemException v67) {
                                                                throw TransactionalDataSynchronizer.a(v67);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                if (var3_2 != null) break block170;
                                                                if (v41 >= v42) break block171;
                                                            }
                                                            catch (CustomSystemException v68) {
                                                                throw TransactionalDataSynchronizer.a(v68);
                                                            }
                                                            this.u = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)5473, (long)(1194410413795942565L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.U0, ReflectionMetadataResolver.P2, ReflectionMetadataResolver.Pb}, (long)5888771032457848097L, (long)var1_1);
                                                        }
                                                        catch (CustomSystemException v69) {
                                                            throw TransactionalDataSynchronizer.a(v69);
                                                        }
                                                    }
                                                    v41 = GeometryCalculator.C();
                                                    v42 = 35;
                                                }
                                                try {
                                                    try {
                                                        if (var3_2 != null) break block172;
                                                        if (v41 >= v42) break block163;
                                                    }
                                                    catch (CustomSystemException v70) {
                                                        throw TransactionalDataSynchronizer.a(v70);
                                                    }
                                                    this.k = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)3827, (long)(4852500083596376894L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.PX, (Object)new Class[0], (long)5888771032457848097L, (long)var1_1);
                                                    this.D = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)1577, (long)(5909524215875023846L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.VJ, (Object)new Class[]{ReflectionMetadataResolver.VJ, ReflectionMetadataResolver.U0, ReflectionMetadataResolver.P2}, (long)5888771032457848097L, (long)var1_1);
                                                    this.T = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)31004, (long)(5919637312084528382L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.VJ, Boolean.TYPE}, (long)5888771032457848097L, (long)var1_1);
                                                }
                                                catch (CustomSystemException v71) {
                                                    throw TransactionalDataSynchronizer.a(v71);
                                                }
                                            }
                                            v41 = GeometryCalculator.C();
                                            v42 = 15;
                                        }
                                        try {
                                            block174: {
                                                try {
                                                    block175: {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (var3_2 != null) break block173;
                                                                    if (v41 > v42) break block174;
                                                                }
                                                                catch (CustomSystemException v72) {
                                                                    throw TransactionalDataSynchronizer.a(v72);
                                                                }
                                                                if (GeometryCalculator.C() != 13) break block175;
                                                            }
                                                            catch (CustomSystemException v73) {
                                                                throw TransactionalDataSynchronizer.a(v73);
                                                            }
                                                            this.R = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)17331, (long)(6120299776531625589L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[]{ReflectionMetadataResolver.EV, Integer.TYPE, Integer.TYPE, Integer.TYPE}, (long)5888771032457848097L, (long)var1_1);
                                                            if (var3_2 == null) break block176;
                                                        }
                                                        catch (CustomSystemException v74) {
                                                            throw TransactionalDataSynchronizer.a(v74);
                                                        }
                                                    }
                                                    this.R = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)27112, (long)(7263094783161293843L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[]{ReflectionMetadataResolver.EV, ReflectionMetadataResolver.P2}, (long)5888771032457848097L, (long)var1_1);
                                                    if (var3_2 == null) break block176;
                                                }
                                                catch (CustomSystemException v75) {
                                                    throw TransactionalDataSynchronizer.a(v75);
                                                }
                                            }
                                            v41 = GeometryCalculator.C();
                                            v42 = 35;
                                        }
                                        catch (CustomSystemException v76) {
                                            throw TransactionalDataSynchronizer.a(v76);
                                        }
                                    }
                                    try {
                                        try {
                                            if (var3_2 != null) break block177;
                                            if (v41 >= v42) break block176;
                                        }
                                        catch (CustomSystemException v77) {
                                            throw TransactionalDataSynchronizer.a(v77);
                                        }
                                        this.R = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)29974, (long)(5385895743712510200L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[]{ReflectionMetadataResolver.VJ}, (long)5888771032457848097L, (long)var1_1);
                                    }
                                    catch (CustomSystemException v78) {
                                        throw TransactionalDataSynchronizer.a(v78);
                                    }
                                }
                                v41 = GeometryCalculator.C();
                                v42 = 35;
                            }
                            try {
                                try {
                                    if (v41 >= v42) {
                                        v79 = this;
                                        v80 = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)26509, (long)(2395943919154942580L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), Boolean.TYPE, (Object)new Class[0], (long)5888599758479148583L, (long)var1_1);
                                        if (!GameVersionEnumerator.MC_1_20_6.Q()) break block178;
                                    }
                                    ** GOTO lbl510
                                }
                                catch (CustomSystemException v81) {
                                    throw TransactionalDataSynchronizer.a(v81);
                                }
                                v82 = ReflectionMetadataResolver.EE;
                                break block179;
                            }
                            catch (CustomSystemException v83) {
                                throw TransactionalDataSynchronizer.a(v83);
                            }
                        }
                        v82 = ReflectionMetadataResolver.Q;
                    }
                    try {
                        block181: {
                            try {
                                try {
                                    v79.i = ((StatefulEventToggle)v80.F(v82)).M();
                                    v84 = this;
                                    v85 = TransactionalDataSynchronizer.c("e", (Object)this, (Object)ReflectionMetadataResolver.Ep, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)32196, (long)(149166959386216492L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, Float.TYPE, (long)5888733872908421795L, (long)var1_1);
                                    if (var3_2 != null) break block180;
                                    v84.h = v85;
                                    if (GeometryCalculator.C() < 50) break block181;
                                }
                                catch (CustomSystemException v86) {
                                    throw TransactionalDataSynchronizer.a(v86);
                                }
                                this.p = TransactionalDataSynchronizer.c("e", (Object)this, (Object)ReflectionMetadataResolver.PA, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)32662, (long)(8239546029653445208L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Fy, (long)5890387026181250608L, (long)var1_1);
                                if (var3_2 == null) break block182;
                            }
                            catch (CustomSystemException v87) {
                                throw TransactionalDataSynchronizer.a(v87);
                            }
                        }
                        v84 = this;
                        v85 = TransactionalDataSynchronizer.c("e", (Object)this, (Object)ReflectionMetadataResolver.bB, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)15780, (long)(8975392724042909780L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Fy, (long)5890387026181250608L, (long)var1_1);
                    }
                    catch (CustomSystemException v88) {
                        throw TransactionalDataSynchronizer.a(v88);
                    }
                }
                v84.p = v85;
            }
            try {
                try {
                    block183: {
                        try {
                            if (!GameVersionEnumerator.MC_1_21_4.H()) break block183;
                            this.o = TransactionalDataSynchronizer.c("e", (Object)this, (Object)ReflectionMetadataResolver.Ep, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)8990, (long)(3411948852791580408L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, String.class, (long)5888733872908421795L, (long)var1_1);
                            this.w = ((StatefulEventToggle)((StatefulEventToggle)TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)3064, (long)(6709442439804567075L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.PE}, (long)5888599758479148583L, (long)var1_1).F(ReflectionMetadataResolver.VI)).L(true)).M();
                            this.G = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)21324, (long)(6140226197212718732L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.rF, ReflectionMetadataResolver.PE}, (long)5888599758479148583L, (long)var1_1).M();
                            if (var3_2 == null) break block184;
                        }
                        catch (CustomSystemException v89) {
                            throw TransactionalDataSynchronizer.a(v89);
                        }
                    }
                    this.o = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)7160, (long)(1083481475854839317L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, String.class, (long)5888918433952121586L, (long)var1_1);
                    if (var3_2 == null) break block184;
                }
                catch (CustomSystemException v90) {
                    throw TransactionalDataSynchronizer.a(v90);
                }
lbl510:
                // 2 sources

                this.h = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)13659, (long)(4907457028166090905L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, Float.TYPE, (long)5888918433952121586L, (long)var1_1);
                this.o = TransactionalDataSynchronizer.c("e", (Object)this, (Object)TransactionalDataSynchronizer.c("\u00c4", (int)TransactionalDataSynchronizer.b("t", (int)22397, (long)(8302418362824155781L ^ var1_1)), (long)5888529823962565614L, (long)var1_1), (boolean)true, String.class, (long)5888918433952121586L, (long)var1_1);
            }
            catch (CustomSystemException v91) {
                throw TransactionalDataSynchronizer.a(v91);
            }
        }
    }

    static boolean b(TransactionalDataSynchronizer transactionalDataSynchronizer, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, float f, float f2, float f3) {
        return transactionalDataSynchronizer.m(object, object2, object3, object4, object5, object6, object7, f, f2, f3);
    }

    public boolean z(Object object) {
        return this.i.V(object, new Object[0]);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/vx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public boolean K(Object object, Object object2, boolean bl) {
        return this.T.V(object, object2, bl);
    }

    private Object H(Object object, Object object2, int n, int n2, int n3) {
        try {
            if (GeometryCalculator.C() == 13) {
                return this.Z.T(object, object2, n, n2, n3);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionalDataSynchronizer.a(customSystemException);
        }
        return this.Z.T(object, object2, ReflectionUtilityBroker.t(n, n2, n3).M(), null);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = TransactionalDataSynchronizer.e(l, l2);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                TransactionalDataSynchronizer.j[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    static int d(TransactionalDataSynchronizer transactionalDataSynchronizer, Object object) {
        return transactionalDataSynchronizer.x(object);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                TransactionalDataSynchronizer.a = MultiContainerRegistry.a(-7791982224268488403L, 2172984909959716110L, MethodHandles.lookup().lookupClass()).a(50555841916716L);
                TransactionalDataSynchronizer.j = new Object[24];
                TransactionalDataSynchronizer.m = new String[24];
                TransactionalDataSynchronizer.a();
                TransactionalDataSynchronizer.g = new HashMap<K, V>(13);
                var0 = TransactionalDataSynchronizer.a ^ 27270575112889L;
                TransactionalDataSynchronizer.b(null);
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
                var8_3 = new long[55];
                var5_4 = 0;
                var6_5 = "\u0082\u00ca\u0011a\u0004\u00d5\u00b1\u0085\u00af9?\u00cd\u0084b\u00faT\u00bd\u00c1\u0088\u00cckR\u00c9L\u0019\u009b\u00f5R\u0003\u00cf\u00de\u00e4\u0080\u0093Og\u00cbJ\u00dc\u00e9n\u00b9^\u008b\bQ2\u0080\u00af\u00b0\u00d3\u00156\u00df(\u00ceP\u00b6\u0094 \u009a\u00cfJ\u00aa\f\u007fv\u00d1\u001di\u00de\u00d1\u00c4d\u00d8k\u0081/\u0017\u0085\u008fH[\u0083s\u00d3\u00be,\u00d8\u00b5\"\u00a1\u00b4B\u00fdl8ULRi\u00da\u0088/\u00c7\u00a7z/\u00cf\u00be^\u00b1\u00e5\u009dRT\u00afm\u00a8\u00c3\u00b8\u00899\u0089/#^\u0094\u0099\u00e0\u0081F\u008fT\u00b5\u00dd\u00b4\u0013\u00a3GD<s\u0019\u00f5\u00d4\u00f2Z\u0006\u00b7}cp*\u00ca(\u0089\u0093\u00f2\u0099\u00c9\u0083\u00ffwo9\u007f)F\u00dc\u00aef\u000b\u00fe\u00927\u00d6d\u00ccLC\u00f4\u00cd\u00d7\u00f7\u00d0{\u00b2d$\u000b\u0018\u00a5~\u00ee\u00bd:\u00c26u4=\u00b4\u00e2\u00deD\u00e7p,7\u00a5\u0010\u00ff%)\u00ea\u00e0\u00b9\u00f0\u00cc\u0089\u009f\u00d6\u00c4$\u009f\u00fc\u00a5JJ\u0015|H62G \u00d0\u001bc\t\u008e\u00fb\u00b1_d\u00f8\u00fc\u00d9\u00c4\u00e9\u00ad\nfF\u0096\u00e0\u0093jz\u00b1\u00b8\u008c\u00c5\u00cd^\u00ea\"\u00bd\u0018]o\u009e|\n\u00b5T\u00ec\u00f0x\u009a\u00c3-\u00e5P\u00d0\u00d3\u00cbJ@\u001b\u000f\u000bz@Py03\u00ec\u0017\u008cE\u00c7|cl\u0003X,\u009b{\u00b2\u0003\u009e4\u009c\u00dd\u00bc\u00e85z\u00c0\u00ba\u00c2\t\u0087\u0005\u00ed\u0014Et\u00ce\u0007\u001a\u00dd\u00c2!tR\u001f\u00de-[\u00954\u00ff\u000f\u00b8\u00ee\u00c1!\u00d5L\u00feo?\u00da\u009b}|\u00e5\u00a9\u00dea\u00bc\u00dcV\u00ea\u000bD)}_\u008aSBq\u00e7\\\u00aat\u00aec\u00a0\u0083\u00e1\u00e0\u00e0\u001c\u0011\u00c2Fe\u00f2e\u009d&Gck\u00acP\u00d1\u0094\u00f9H\u00ea\u0082\u0018\u00e2\u000b_\u00bb\u00e2\u0014\u00a2\u00b2]\u0014\u0094<*\u00ba";
                var7_6 = "\u0082\u00ca\u0011a\u0004\u00d5\u00b1\u0085\u00af9?\u00cd\u0084b\u00faT\u00bd\u00c1\u0088\u00cckR\u00c9L\u0019\u009b\u00f5R\u0003\u00cf\u00de\u00e4\u0080\u0093Og\u00cbJ\u00dc\u00e9n\u00b9^\u008b\bQ2\u0080\u00af\u00b0\u00d3\u00156\u00df(\u00ceP\u00b6\u0094 \u009a\u00cfJ\u00aa\f\u007fv\u00d1\u001di\u00de\u00d1\u00c4d\u00d8k\u0081/\u0017\u0085\u008fH[\u0083s\u00d3\u00be,\u00d8\u00b5\"\u00a1\u00b4B\u00fdl8ULRi\u00da\u0088/\u00c7\u00a7z/\u00cf\u00be^\u00b1\u00e5\u009dRT\u00afm\u00a8\u00c3\u00b8\u00899\u0089/#^\u0094\u0099\u00e0\u0081F\u008fT\u00b5\u00dd\u00b4\u0013\u00a3GD<s\u0019\u00f5\u00d4\u00f2Z\u0006\u00b7}cp*\u00ca(\u0089\u0093\u00f2\u0099\u00c9\u0083\u00ffwo9\u007f)F\u00dc\u00aef\u000b\u00fe\u00927\u00d6d\u00ccLC\u00f4\u00cd\u00d7\u00f7\u00d0{\u00b2d$\u000b\u0018\u00a5~\u00ee\u00bd:\u00c26u4=\u00b4\u00e2\u00deD\u00e7p,7\u00a5\u0010\u00ff%)\u00ea\u00e0\u00b9\u00f0\u00cc\u0089\u009f\u00d6\u00c4$\u009f\u00fc\u00a5JJ\u0015|H62G \u00d0\u001bc\t\u008e\u00fb\u00b1_d\u00f8\u00fc\u00d9\u00c4\u00e9\u00ad\nfF\u0096\u00e0\u0093jz\u00b1\u00b8\u008c\u00c5\u00cd^\u00ea\"\u00bd\u0018]o\u009e|\n\u00b5T\u00ec\u00f0x\u009a\u00c3-\u00e5P\u00d0\u00d3\u00cbJ@\u001b\u000f\u000bz@Py03\u00ec\u0017\u008cE\u00c7|cl\u0003X,\u009b{\u00b2\u0003\u009e4\u009c\u00dd\u00bc\u00e85z\u00c0\u00ba\u00c2\t\u0087\u0005\u00ed\u0014Et\u00ce\u0007\u001a\u00dd\u00c2!tR\u001f\u00de-[\u00954\u00ff\u000f\u00b8\u00ee\u00c1!\u00d5L\u00feo?\u00da\u009b}|\u00e5\u00a9\u00dea\u00bc\u00dcV\u00ea\u000bD)}_\u008aSBq\u00e7\\\u00aat\u00aec\u00a0\u0083\u00e1\u00e0\u00e0\u001c\u0011\u00c2Fe\u00f2e\u009d&Gck\u00acP\u00d1\u0094\u00f9H\u00ea\u0082\u0018\u00e2\u000b_\u00bb\u00e2\u0014\u00a2\u00b2]\u0014\u0094<*\u00ba".length();
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
                    var6_5 = "\u00f9x\u00c7\u00a0\r\u008a\n\u0096\u009eE\u00ea\u00ca\u00ea}\u00fa\u00ea";
                    var7_6 = "\u00f9x\u00c7\u00a0\r\u008a\n\u0096\u009eE\u00ea\u00ca\u00ea}\u00fa\u00ea".length();
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
        TransactionalDataSynchronizer.b = var8_3;
        TransactionalDataSynchronizer.d = new Integer[55];
    }

    private boolean m(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, float f, float f2, float f3) {
        return this.S.V(object, object2, object3, object4, object5, object6, object7, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
    }

    static int G(TransactionalDataSynchronizer transactionalDataSynchronizer, Object object, Object object2) {
        return transactionalDataSynchronizer.e(object, object2);
    }

    static float T(TransactionalDataSynchronizer transactionalDataSynchronizer, Object object) {
        return transactionalDataSynchronizer.I(object);
    }

    public boolean h(Object object, Object object2) {
        return this.X.V(object, object2);
    }

    private boolean e(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, float f, float f2, float f3) {
        return this.S.V(object, object2, object3, object4, object5, object6, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
    }

    static boolean t(TransactionalDataSynchronizer transactionalDataSynchronizer, Object object) {
        return transactionalDataSynchronizer.r(object);
    }

    private void V(Object object, Object object2, Object object3) {
        this.G.l(object, object2, object3);
    }

    public static String A() {
        return y;
    }

    private Object h(Object object, Object object2, int n, int n2, int n3) {
        return this.W.T(object, object2, n, n2, n3);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/vx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private Object d(Object object) {
        return this.A.Z(object);
    }

    static Object Q(TransactionalDataSynchronizer transactionalDataSynchronizer, Object object, Object object2, Object object3, Object object4) {
        return transactionalDataSynchronizer.t(object, object2, object3, object4);
    }

    static boolean T(TransactionalDataSynchronizer transactionalDataSynchronizer, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, float f, float f2, float f3) {
        return transactionalDataSynchronizer.e(object, object2, object3, object4, object5, object6, f, f2, f3);
    }

    public int E(Object object) {
        return this.B.R(null, object);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = TransactionalDataSynchronizer.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = TransactionalDataSynchronizer.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private int x(Object object) {
        return this.V.R(object, new Object[0]);
    }

    private static void a() {
        Object[] objectArray = j;
        j[0] = "/C\u000b`";
        objectArray[1] = "yp:^i.r\u007f+\u0011\u0004.rb?";
        objectArray[2] = "\u0003\u0001e='\u0013\b\u000etrZ\u000b\u001b\t};";
        objectArray[3] = Boolean.TYPE;
        TransactionalDataSynchronizer.m[3] = "java/lang/Boolean";
        objectArray[4] = "\u0005DVQ";
        objectArray[5] = "\u001eT\u0006\u0004*kkt\r\u000b;$\u0006t\r\u0016/1";
        objectArray[6] = "0Fr\u001b";
        objectArray[7] = "D02u>\f1\u00109z/C\\\u00109g;V";
        objectArray[8] = "J//";
        objectArray[9] = Integer.TYPE;
        TransactionalDataSynchronizer.m[9] = "java/lang/Integer";
        objectArray[10] = "l\\%[";
        objectArray[11] = "#K\u001f\u000fC\u001bVk\u0014\u0000RT;k\u0014\u001dFA";
        objectArray[12] = "\u0010$.`;.e\u0004%o*a\b\u0004%r>t";
        objectArray[13] = ">\u0006-^";
        objectArray[14] = "FkQ=\u0018iMd@rygFoD(";
        objectArray[15] = "6u7!\u0016/d.wM\"V4{;+\u001c)c3f+xom&b6\u001d-7trMB1stv?\u0000m54\u000btHfk/t#\u0000;kK17\u0005$\u007f{u\"\no\r";
        objectArray[16] = "Qm\u0012\tY\u0003\u00036RepzS3C\fL\u001f\u0011i\u0011\u001c7@\r-\u0011\u0018E\u0002QkQe\u000eJZ5J\u001aY\u0002\u00075.UJF\u00007R\nOD\u0018S\u0012UW\b\u000f+S\u0001K\u001cj";
        objectArray[17] = "IH\t\r5(\u001b\u0013Ia\u0016QKF\u0005\u0007?.\u001c\u000eX\u0007[h\u0012\u001b\\\u001a>*HILaa6\fIH\u0013#jJ\t5Xka\u0014\u0012J\u000f#<\u0014v\u0005\u001cg;\u0016\nZ\u0019e#rJ\u0005\u0001)4\n\u000bQ\u001d=Q";
        objectArray[18] = "\u0005@aLhFW\u001b! ]?\u0007\u001e0I}ZEDbY\u0006\u0005Y\u0000b]tG\u0005F\" ?\u000f\u000e\u00189_hGS\u0018]\u001a|BL\fm^iM\u0007~";
        objectArray[19] = "K5\"G{.\u0019nb+MWIksBn2\u000b1!R\u0015n@;xOj9\bfx++'\n0e@|gJ{\u001e";
        objectArray[20] = "\"rYRZTp)\u0019>i- ,\bWOHbvZG4\u0017~2ZCFU\"t\u001a>\r\u001d)*\u0001AZUt*e\u000eI\u0011s(\u0019QL\u0013kLY\u000eT_|4\u0018ZHK\u0019";
        objectArray[21] = "<L\u001a\n\u001f6iL\u0016\f.&ysVM\u0015+8\u0016\u0018PI?\u0002J\b^G6g\bR\fWM";
        objectArray[22] = "_8\u0011\u0005pp\rcQi|\t]f@\u0000el\u001f<\u0012\u0010\u001e0T6K\rag\u001ckKi.tXlI\u0015qqZt-Xs3\u0000;N\u0011xm\u0006\u0006";
        Object[] objectArray2 = objectArray;
        objectArray[23] = "rt\u0016lTk /V\u0000k\u0012pz\u001af^m'2Gf:+)'C{_isuS\u0000\u0000u7uWrB)q5*9\n\"/.UnB\u007f/J\u0010zG`;zToH+I";
    }

    private Object R(Object object, Object object2, Object object3) {
        return this.W.T(object, object2, object3);
    }

    private boolean X(Object object) {
        return this.w.V(object, new Object[0]);
    }

    private void S(Object object, Object object2, int n, int n2, int n3, Object object3) {
        this.Y.l(object, object2, n, n2, n3, object3);
    }

    private float I(Object object) {
        return this.h.x(object);
    }

    static Object U(TransactionalDataSynchronizer transactionalDataSynchronizer, Object object, Object object2) {
        return transactionalDataSynchronizer.N(object, object2);
    }

    private int m(Object object, Object object2, int n, int n2, int n3) {
        return this.R.R(object, object2, n, n2, n3);
    }

    private Object t(Object object, Object object2, Object object3, Object object4) {
        return this.W.T(object, object2, object3, object4);
    }

    private Object N(Object object, Object object2) {
        return this.E.T(object, object2);
    }

    public boolean k(Object object, Object object2) {
        return this.c.V(object, object2);
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

    static String d(TransactionalDataSynchronizer transactionalDataSynchronizer, Object object) {
        return transactionalDataSynchronizer.C(object);
    }

    private Object Y(Object object, Object object2, Object object3, Object object4) {
        return this.f.T(object, object2, object3, object4);
    }

    static void m(TransactionalDataSynchronizer transactionalDataSynchronizer, Object object, Object object2, Object object3) {
        transactionalDataSynchronizer.V(object, object2, object3);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n4] != null) {
            return n4;
        }
        Object object = j[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 35;
                break;
            }
            case 1: {
                n3 = 51;
                break;
            }
            case 2: {
                n3 = 54;
                break;
            }
            case 3: {
                n3 = 46;
                break;
            }
            case 4: {
                n3 = 11;
                break;
            }
            case 5: {
                n3 = 53;
                break;
            }
            case 6: {
                n3 = 37;
                break;
            }
            case 7: {
                n3 = 45;
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
                n3 = 30;
                break;
            }
            case 11: {
                n3 = 44;
                break;
            }
            case 12: {
                n3 = 60;
                break;
            }
            case 13: {
                n3 = 59;
                break;
            }
            case 14: {
                n3 = 3;
                break;
            }
            case 15: {
                n3 = 42;
                break;
            }
            case 16: {
                n3 = 15;
                break;
            }
            case 17: {
                n3 = 36;
                break;
            }
            case 18: {
                n3 = 18;
                break;
            }
            case 19: {
                n3 = 22;
                break;
            }
            case 20: {
                n3 = 50;
                break;
            }
            case 21: {
                n3 = 38;
                break;
            }
            case 22: {
                n3 = 9;
                break;
            }
            case 23: {
                n3 = 16;
                break;
            }
            case 24: {
                n3 = 14;
                break;
            }
            case 25: {
                n3 = 63;
                break;
            }
            case 26: {
                n3 = 28;
                break;
            }
            case 27: {
                n3 = 31;
                break;
            }
            case 28: {
                n3 = 29;
                break;
            }
            case 29: {
                n3 = 40;
                break;
            }
            case 30: {
                n3 = 2;
                break;
            }
            case 31: {
                n3 = 58;
                break;
            }
            case 32: {
                n3 = 12;
                break;
            }
            case 33: {
                n3 = 24;
                break;
            }
            case 34: {
                n3 = 55;
                break;
            }
            case 35: {
                n3 = 49;
                break;
            }
            case 36: {
                n3 = 23;
                break;
            }
            case 37: {
                n3 = 57;
                break;
            }
            case 38: {
                n3 = 62;
                break;
            }
            case 39: {
                n3 = 27;
                break;
            }
            case 40: {
                n3 = 25;
                break;
            }
            case 41: {
                n3 = 33;
                break;
            }
            case 42: {
                n3 = 39;
                break;
            }
            case 43: {
                n3 = 26;
                break;
            }
            case 44: {
                n3 = 19;
                break;
            }
            case 45: {
                n3 = 17;
                break;
            }
            case 46: {
                n3 = 41;
                break;
            }
            case 47: {
                n3 = 5;
                break;
            }
            case 48: {
                n3 = 48;
                break;
            }
            case 49: {
                n3 = 20;
                break;
            }
            case 50: {
                n3 = 0;
                break;
            }
            case 51: {
                n3 = 6;
                break;
            }
            case 52: {
                n3 = 32;
                break;
            }
            case 53: {
                n3 = 1;
                break;
            }
            case 54: {
                n3 = 56;
                break;
            }
            case 55: {
                n3 = 4;
                break;
            }
            case 56: {
                n3 = 61;
                break;
            }
            case 57: {
                n3 = 7;
                break;
            }
            case 58: {
                n3 = 34;
                break;
            }
            case 59: {
                n3 = 13;
                break;
            }
            case 60: {
                n3 = 43;
                break;
            }
            case 61: {
                n3 = 21;
                break;
            }
            case 62: {
                n3 = 47;
                break;
            }
            default: {
                n3 = 8;
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
        TransactionalDataSynchronizer.m[n4] = new String(cArray);
        return n4;
    }

    private Object P(Object object) {
        return this.P.Z(object);
    }

    private Object Z(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        try {
            if (GeometryCalculator.C() >= 50) {
                return this.S.T(object, object2, object3, object4, object5, object7);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionalDataSynchronizer.a(customSystemException);
        }
        return this.S.T(object, object2, object3, object4, object5, object6, object7);
    }

    static int V(TransactionalDataSynchronizer transactionalDataSynchronizer, Object object, Object object2, Object object3) {
        return transactionalDataSynchronizer.a(object, object2, object3);
    }

    private static Method h(long l, long l2) {
        int n = TransactionalDataSynchronizer.e(l, l2);
        Object object = j[n];
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
                clazz3 = TransactionalDataSynchronizer.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = TransactionalDataSynchronizer.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = TransactionalDataSynchronizer.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        TransactionalDataSynchronizer.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = TransactionalDataSynchronizer.f(991906188044061L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = TransactionalDataSynchronizer.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        TransactionalDataSynchronizer.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = TransactionalDataSynchronizer.f(991906188044061L, 0L);
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

    private Object o() {
        return this.p.Z(null);
    }

    static Object f(TransactionalDataSynchronizer transactionalDataSynchronizer, Object object) {
        return transactionalDataSynchronizer.d(object);
    }

    private int e(Object object, Object object2) {
        return this.R.R(object, object2);
    }

    public Object s(String string) {
        return this.s.T(null, string);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = TransactionalDataSynchronizer.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    static void D(TransactionalDataSynchronizer transactionalDataSynchronizer, Object object, Object object2, int n, int n2, int n3, Object object3) {
        transactionalDataSynchronizer.S(object, object2, n, n2, n3, object3);
    }

    private static Field g(long l, long l2) {
        int n = TransactionalDataSynchronizer.e(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = TransactionalDataSynchronizer.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = TransactionalDataSynchronizer.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = TransactionalDataSynchronizer.c(clazz3, string2, clazz2)) != null) {
                    TransactionalDataSynchronizer.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = TransactionalDataSynchronizer.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        TransactionalDataSynchronizer.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = TransactionalDataSynchronizer.f(991906188044061L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private int a(Object object, Object object2, Object object3) {
        return this.R.R(object, object2, object3);
    }

    private boolean f(Object object, Object object2, int n, int n2, int n3, Object object3, int n4, float f, float f2, float f3) {
        return this.S.V(object, object2, n, n2, n3, object3, n4, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
    }

    public Object F(Object object, Object object2, Object object3, Object object4) {
        return this.D.T(object, object2, object3, object4);
    }

    static Object H(TransactionalDataSynchronizer transactionalDataSynchronizer, Object object, Object object2, int n, int n2, int n3) {
        return transactionalDataSynchronizer.H(object, object2, n, n2, n3);
    }

    static Object E(TransactionalDataSynchronizer transactionalDataSynchronizer, Object object, Object object2, Object object3) {
        return transactionalDataSynchronizer.R(object, object2, object3);
    }

    public boolean M(Object object) {
        return this.X.V(object, new Object[0]);
    }

    static Object I(TransactionalDataSynchronizer transactionalDataSynchronizer) {
        return transactionalDataSynchronizer.o();
    }

    private boolean r(Object object) {
        return this.K.R(object);
    }

    static Object R(TransactionalDataSynchronizer transactionalDataSynchronizer, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        return transactionalDataSynchronizer.Z(object, object2, object3, object4, object5, object6, object7);
    }

    public boolean V(Object object) {
        return this.c.V(object, new Object[0]);
    }

    static int T(TransactionalDataSynchronizer transactionalDataSynchronizer, Object object, Object object2, int n, int n2, int n3) {
        return transactionalDataSynchronizer.m(object, object2, n, n2, n3);
    }

    public static void b(String string) {
        y = string;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = TransactionalDataSynchronizer.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = TransactionalDataSynchronizer.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public float W(Object object) {
        return this.O.x(object);
    }

    static Object J(TransactionalDataSynchronizer transactionalDataSynchronizer, Object object) {
        return transactionalDataSynchronizer.s(object);
    }

    private Object s(Object object) {
        return this.E.T(object, new Object[0]);
    }

    private String C(Object object) {
        return (String)this.o.Z(object);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(TransactionalDataSynchronizer.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(TransactionalDataSynchronizer.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

