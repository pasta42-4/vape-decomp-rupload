/*
 * Decompiled with CFR 0.152.
 */
package com.cluster.management;

import a.HK;
import a.N9;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
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

public class ClusterNodeRegistry
extends CryptoProtocolEngine {
    private final HK Y;
    private final HK K;
    private final HK E;
    private static final Map d;
    private final HK n;
    private final HK h;
    private static final long[] b;
    private final HK V;
    private static final Integer[] c;
    private HK O;
    private final HK r;
    public final HK S;
    private static final Object[] e;
    private static final long a;
    private static final String[] f;
    private final HK X;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Field g(long l, long l2) {
        int n = ClusterNodeRegistry.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = ClusterNodeRegistry.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ClusterNodeRegistry.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ClusterNodeRegistry.c(clazz3, string2, clazz2)) != null) {
                    ClusterNodeRegistry.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ClusterNodeRegistry.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ClusterNodeRegistry.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ClusterNodeRegistry.f(606867633839444L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    static Object J(ClusterNodeRegistry clusterNodeRegistry, Object object) {
        return clusterNodeRegistry.Z(object);
    }

    static Object F(ClusterNodeRegistry clusterNodeRegistry, Object object) {
        return clusterNodeRegistry.b(object);
    }

    private static Method h(long l, long l2) {
        int n = ClusterNodeRegistry.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = ClusterNodeRegistry.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ClusterNodeRegistry.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ClusterNodeRegistry.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        ClusterNodeRegistry.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ClusterNodeRegistry.f(606867633839444L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ClusterNodeRegistry.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ClusterNodeRegistry.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ClusterNodeRegistry.f(606867633839444L, 0L);
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ph" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static Object L(ClusterNodeRegistry clusterNodeRegistry, Object object) {
        return clusterNodeRegistry.l(object);
    }

    /*
     * Unable to fully structure code
     */
    public ClusterNodeRegistry() {
        block100: {
            block97: {
                block99: {
                    block79: {
                        block96: {
                            block95: {
                                block94: {
                                    block93: {
                                        block92: {
                                            block91: {
                                                block90: {
                                                    block89: {
                                                        block88: {
                                                            block87: {
                                                                block86: {
                                                                    block85: {
                                                                        block84: {
                                                                            block83: {
                                                                                block82: {
                                                                                    block81: {
                                                                                        block77: {
                                                                                            block75: {
                                                                                                block76: {
                                                                                                    block74: {
                                                                                                        block73: {
                                                                                                            var1_1 = ClusterNodeRegistry.a ^ 63447585511375L;
                                                                                                            v0 = N9.I();
                                                                                                            super(ReflectionMetadataResolver.P2);
                                                                                                            var3_2 = v0;
                                                                                                            try {
                                                                                                                try {
                                                                                                                    if (var3_2 == null) break block73;
                                                                                                                    if (GeometryCalculator.C() >= 50) {
                                                                                                                    }
                                                                                                                    ** GOTO lbl20
                                                                                                                }
                                                                                                                catch (CustomSystemException v1) {
                                                                                                                    throw ClusterNodeRegistry.a(v1);
                                                                                                                }
                                                                                                                this.Y = ClusterNodeRegistry.c("\u00e2", (Object)this, (Object)ClusterNodeRegistry.c("i", (int)ClusterNodeRegistry.b("l", (int)29466, (long)(1838075411048019563L ^ var1_1)), (long)-5448856821592758243L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.V3}, (long)-5449033493522826755L, (long)var1_1);
                                                                                                            }
                                                                                                            catch (CustomSystemException v2) {
                                                                                                                throw ClusterNodeRegistry.a(v2);
                                                                                                            }
                                                                                                        }
                                                                                                        try {
                                                                                                            if (var3_2 != null) break block74;
lbl20:
                                                                                                            // 2 sources

                                                                                                            this.Y = ClusterNodeRegistry.c("\u00e2", (Object)this, (Object)ClusterNodeRegistry.c("i", (int)ClusterNodeRegistry.b("l", (int)10180, (long)(3003606917200732854L ^ var1_1)), (long)-5448856821592758243L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.YN}, (long)-5449033493522826755L, (long)var1_1);
                                                                                                        }
                                                                                                        catch (CustomSystemException v3) {
                                                                                                            throw ClusterNodeRegistry.a(v3);
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            this.S = ClusterNodeRegistry.c("\u00e2", (Object)this, (Object)ClusterNodeRegistry.c("i", (int)ClusterNodeRegistry.b("l", (int)558, (long)(6102311366278039386L ^ var1_1)), (long)-5448856821592758243L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, (long)-5449033493522826755L, (long)var1_1);
                                                                                                            v4 = GeometryCalculator.C();
                                                                                                            if (var3_2 == null) break block75;
                                                                                                            if (v4 >= 50) break block76;
                                                                                                        }
                                                                                                        catch (CustomSystemException v5) {
                                                                                                            throw ClusterNodeRegistry.a(v5);
                                                                                                        }
                                                                                                        this.O = ClusterNodeRegistry.c("\u00e2", (Object)this, (Object)ClusterNodeRegistry.c("i", (int)ClusterNodeRegistry.b("l", (int)10969, (long)(7329010521093992380L ^ var1_1)), (long)-5448856821592758243L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{Double.TYPE, Double.TYPE, Double.TYPE}, (long)-5449033493522826755L, (long)var1_1);
                                                                                                    }
                                                                                                    catch (CustomSystemException v6) {
                                                                                                        throw ClusterNodeRegistry.a(v6);
                                                                                                    }
                                                                                                }
                                                                                                v4 = (int)TemporalMetadataResolver.h.d();
                                                                                            }
                                                                                            try {
                                                                                                block78: {
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (var3_2 == null) break block77;
                                                                                                            if (v4 == 0) break block78;
                                                                                                        }
                                                                                                        catch (CustomSystemException v7) {
                                                                                                            throw ClusterNodeRegistry.a(v7);
                                                                                                        }
                                                                                                        this.r = ClusterNodeRegistry.c("\u00e2", (Object)this, (Object)ClusterNodeRegistry.c("i", (int)ClusterNodeRegistry.b("l", (int)5887, (long)(7388062478567494536L ^ var1_1)), (long)-5448856821592758243L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.P2, (Object)new Class[0], (long)-5449033493522826755L, (long)var1_1);
                                                                                                        this.n = ClusterNodeRegistry.c("\u00e2", (Object)this, (Object)ClusterNodeRegistry.c("i", (int)ClusterNodeRegistry.b("l", (int)20457, (long)(7087622727190481562L ^ var1_1)), (long)-5448856821592758243L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.P2, (Object)new Class[0], (long)-5449033493522826755L, (long)var1_1);
                                                                                                        this.h = ClusterNodeRegistry.c("\u00e2", (Object)this, (Object)ClusterNodeRegistry.c("i", (int)ClusterNodeRegistry.b("l", (int)6179, (long)(1065367475246194003L ^ var1_1)), (long)-5448856821592758243L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.P2, (Object)new Class[0], (long)-5449033493522826755L, (long)var1_1);
                                                                                                        this.E = ClusterNodeRegistry.c("\u00e2", (Object)this, (Object)ClusterNodeRegistry.c("i", (int)ClusterNodeRegistry.b("l", (int)108, (long)(7433030169135039770L ^ var1_1)), (long)-5448856821592758243L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.P2, (Object)new Class[0], (long)-5449033493522826755L, (long)var1_1);
                                                                                                        this.X = ClusterNodeRegistry.c("\u00e2", (Object)this, (Object)ClusterNodeRegistry.c("i", (int)ClusterNodeRegistry.b("l", (int)3797, (long)(548827864675240872L ^ var1_1)), (long)-5448856821592758243L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.P2, (Object)new Class[0], (long)-5449033493522826755L, (long)var1_1);
                                                                                                        this.K = ClusterNodeRegistry.c("\u00e2", (Object)this, (Object)ClusterNodeRegistry.c("i", (int)ClusterNodeRegistry.b("l", (int)25120, (long)(1560012096719398724L ^ var1_1)), (long)-5448856821592758243L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.P2, (Object)new Class[0], (long)-5449033493522826755L, (long)var1_1);
                                                                                                        if (var3_2 != null) break block79;
                                                                                                    }
                                                                                                    catch (CustomSystemException v8) {
                                                                                                        throw ClusterNodeRegistry.a(v8);
                                                                                                    }
                                                                                                }
                                                                                                v4 = GeometryCalculator.C();
                                                                                            }
                                                                                            catch (CustomSystemException v9) {
                                                                                                throw ClusterNodeRegistry.a(v9);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            block80: {
                                                                                                try {
                                                                                                    if (v4 < 37) break block80;
                                                                                                    this.n = ClusterNodeRegistry.c("\u00e2", (Object)this, (Object)ClusterNodeRegistry.c("i", (int)ClusterNodeRegistry.b("l", (int)15268, (long)(5205730946345729758L ^ var1_1)), (long)-5448856821592758243L, (long)var1_1), (boolean)false, (Object)ReflectionMetadataResolver.P2, (Object)new Class[0], (long)-5449033493522826755L, (long)var1_1);
                                                                                                    if (var3_2 != null) break block81;
                                                                                                }
                                                                                                catch (CustomSystemException v10) {
                                                                                                    throw ClusterNodeRegistry.a(v10);
                                                                                                }
                                                                                            }
                                                                                            this.n = ClusterNodeRegistry.c("\u00e2", (Object)this, (Object)ClusterNodeRegistry.c("i", (int)ClusterNodeRegistry.b("l", (int)17599, (long)(5409917799502807494L ^ var1_1)), (long)-5448856821592758243L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, (Object)ReflectionMetadataResolver.P2, (Object)new Class[0], (long)-5449033493522826755L, (long)var1_1);
                                                                                        }
                                                                                        catch (CustomSystemException v11) {
                                                                                            throw ClusterNodeRegistry.a(v11);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        v12 = this;
                                                                                        v13 = this;
                                                                                        v14 = ClusterNodeRegistry.c("i", (int)ClusterNodeRegistry.b("l", (int)28959, (long)(7059551222221485156L ^ var1_1)), (long)-5448856821592758243L, (long)var1_1);
                                                                                        v15 = ObjectLifecycleTracker.z;
                                                                                        if (var3_2 == null) break block82;
                                                                                        if (v15 == 0) break block83;
                                                                                    }
                                                                                    catch (CustomSystemException v16) {
                                                                                        throw ClusterNodeRegistry.a(v16);
                                                                                    }
                                                                                    v15 = GeometryCalculator.C();
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        if (var3_2 == null) break block84;
                                                                                        if (v15 >= 50) break block83;
                                                                                    }
                                                                                    catch (CustomSystemException v17) {
                                                                                        throw ClusterNodeRegistry.a(v17);
                                                                                    }
                                                                                    v15 = 1;
                                                                                    break block84;
                                                                                }
                                                                                catch (CustomSystemException v18) {
                                                                                    throw ClusterNodeRegistry.a(v18);
                                                                                }
                                                                            }
                                                                            v15 = 0;
                                                                        }
                                                                        try {
                                                                            v12.r = ClusterNodeRegistry.c("\u00e2", (Object)v13, (Object)v14, (boolean)v15, (Object)ReflectionMetadataResolver.P2, (Object)new Class[0], (long)-5449033493522826755L, (long)var1_1);
                                                                            v19 = this;
                                                                            v20 = this;
                                                                            v21 = ClusterNodeRegistry.c("i", (int)ClusterNodeRegistry.b("l", (int)21784, (long)(3620089499945701503L ^ var1_1)), (long)-5448856821592758243L, (long)var1_1);
                                                                            v22 = ObjectLifecycleTracker.z;
                                                                            if (var3_2 == null) break block85;
                                                                            if (v22 == 0) break block86;
                                                                        }
                                                                        catch (CustomSystemException v23) {
                                                                            throw ClusterNodeRegistry.a(v23);
                                                                        }
                                                                        v22 = GeometryCalculator.C();
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (var3_2 == null) break block87;
                                                                            if (v22 >= 50) break block86;
                                                                        }
                                                                        catch (CustomSystemException v24) {
                                                                            throw ClusterNodeRegistry.a(v24);
                                                                        }
                                                                        v22 = 1;
                                                                        break block87;
                                                                    }
                                                                    catch (CustomSystemException v25) {
                                                                        throw ClusterNodeRegistry.a(v25);
                                                                    }
                                                                }
                                                                v22 = 0;
                                                            }
                                                            try {
                                                                v19.h = ClusterNodeRegistry.c("\u00e2", (Object)v20, (Object)v21, (boolean)v22, (Object)ReflectionMetadataResolver.P2, (Object)new Class[0], (long)-5449033493522826755L, (long)var1_1);
                                                                v26 = this;
                                                                v27 = this;
                                                                v28 = ClusterNodeRegistry.c("i", (int)ClusterNodeRegistry.b("l", (int)17883, (long)(4713219174162563236L ^ var1_1)), (long)-5448856821592758243L, (long)var1_1);
                                                                v29 = ObjectLifecycleTracker.z;
                                                                if (var3_2 == null) break block88;
                                                                if (v29 == 0) break block89;
                                                            }
                                                            catch (CustomSystemException v30) {
                                                                throw ClusterNodeRegistry.a(v30);
                                                            }
                                                            v29 = GeometryCalculator.C();
                                                        }
                                                        try {
                                                            try {
                                                                if (var3_2 == null) break block90;
                                                                if (v29 >= 50) break block89;
                                                            }
                                                            catch (CustomSystemException v31) {
                                                                throw ClusterNodeRegistry.a(v31);
                                                            }
                                                            v29 = 1;
                                                            break block90;
                                                        }
                                                        catch (CustomSystemException v32) {
                                                            throw ClusterNodeRegistry.a(v32);
                                                        }
                                                    }
                                                    v29 = 0;
                                                }
                                                try {
                                                    v26.E = ClusterNodeRegistry.c("\u00e2", (Object)v27, (Object)v28, (boolean)v29, (Object)ReflectionMetadataResolver.P2, (Object)new Class[0], (long)-5449033493522826755L, (long)var1_1);
                                                    v33 = this;
                                                    v34 = this;
                                                    v35 = ClusterNodeRegistry.c("i", (int)ClusterNodeRegistry.b("l", (int)11743, (long)(2397528555613579449L ^ var1_1)), (long)-5448856821592758243L, (long)var1_1);
                                                    v36 = ObjectLifecycleTracker.z;
                                                    if (var3_2 == null) break block91;
                                                    if (v36 == 0) break block92;
                                                }
                                                catch (CustomSystemException v37) {
                                                    throw ClusterNodeRegistry.a(v37);
                                                }
                                                v36 = GeometryCalculator.C();
                                            }
                                            try {
                                                try {
                                                    if (var3_2 == null) break block93;
                                                    if (v36 >= 50) break block92;
                                                }
                                                catch (CustomSystemException v38) {
                                                    throw ClusterNodeRegistry.a(v38);
                                                }
                                                v36 = 1;
                                                break block93;
                                            }
                                            catch (CustomSystemException v39) {
                                                throw ClusterNodeRegistry.a(v39);
                                            }
                                        }
                                        v36 = 0;
                                    }
                                    try {
                                        v33.X = ClusterNodeRegistry.c("\u00e2", (Object)v34, (Object)v35, (boolean)v36, (Object)ReflectionMetadataResolver.P2, (Object)new Class[0], (long)-5449033493522826755L, (long)var1_1);
                                        v40 = this;
                                        v41 = this;
                                        v42 = ClusterNodeRegistry.c("i", (int)ClusterNodeRegistry.b("l", (int)9873, (long)(3597808097566286820L ^ var1_1)), (long)-5448856821592758243L, (long)var1_1);
                                        v43 = ObjectLifecycleTracker.z;
                                        if (var3_2 == null) break block94;
                                        if (v43 == 0) break block95;
                                    }
                                    catch (CustomSystemException v44) {
                                        throw ClusterNodeRegistry.a(v44);
                                    }
                                    v43 = GeometryCalculator.C();
                                }
                                try {
                                    try {
                                        if (var3_2 == null) break block96;
                                        if (v43 >= 50) break block95;
                                    }
                                    catch (CustomSystemException v45) {
                                        throw ClusterNodeRegistry.a(v45);
                                    }
                                    v43 = 1;
                                    break block96;
                                }
                                catch (CustomSystemException v46) {
                                    throw ClusterNodeRegistry.a(v46);
                                }
                            }
                            v43 = 0;
                        }
                        v40.K = ClusterNodeRegistry.c("\u00e2", (Object)v41, (Object)v42, (boolean)v43, (Object)ReflectionMetadataResolver.P2, (Object)new Class[0], (long)-5449033493522826755L, (long)var1_1);
                    }
                    try {
                        block98: {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v47 = GeometryCalculator.C();
                                                    v48 = 35;
                                                    if (var3_2 == null) break block97;
                                                    if (v47 < v48) break block98;
                                                }
                                                catch (CustomSystemException v49) {
                                                    throw ClusterNodeRegistry.a(v49);
                                                }
                                                v47 = GeometryCalculator.C();
                                                v48 = 50;
                                                if (var3_2 == null) break block97;
                                            }
                                            catch (CustomSystemException v50) {
                                                throw ClusterNodeRegistry.a(v50);
                                            }
                                            if (v47 >= v48) break block98;
                                        }
                                        catch (CustomSystemException v51) {
                                            throw ClusterNodeRegistry.a(v51);
                                        }
                                        v47 = (int)ObjectLifecycleTracker.z;
                                        if (var3_2 == null) break block99;
                                    }
                                    catch (CustomSystemException v52) {
                                        throw ClusterNodeRegistry.a(v52);
                                    }
                                    if (v47 == 0) break block98;
                                }
                                catch (CustomSystemException v53) {
                                    throw ClusterNodeRegistry.a(v53);
                                }
                                this.V = ClusterNodeRegistry.c("\u00e2", (Object)this, (Object)ClusterNodeRegistry.c("i", (int)ClusterNodeRegistry.b("l", (int)1842, (long)(8770841467830452812L ^ var1_1)), (long)-5448856821592758243L, (long)var1_1), (boolean)false, (Object)ReflectionMetadataResolver.P2, (Object)new Class[]{ReflectionMetadataResolver.Pb, Integer.TYPE}, (long)-5449033493522826755L, (long)var1_1);
                                if (var3_2 != null) break block100;
                            }
                            catch (CustomSystemException v54) {
                                throw ClusterNodeRegistry.a(v54);
                            }
                        }
                        v47 = GeometryCalculator.C();
                    }
                    catch (CustomSystemException v55) {
                        throw ClusterNodeRegistry.a(v55);
                    }
                }
                v48 = 37;
            }
            try {
                block101: {
                    try {
                        if (v47 < v48) break block101;
                        this.V = ClusterNodeRegistry.c("\u00e2", (Object)this, (Object)ClusterNodeRegistry.c("i", (int)ClusterNodeRegistry.b("l", (int)32474, (long)(6511972136226765734L ^ var1_1)), (long)-5448856821592758243L, (long)var1_1), (boolean)false, (Object)ReflectionMetadataResolver.P2, (Object)new Class[]{ReflectionMetadataResolver.Pb, Integer.TYPE}, (long)-5449033493522826755L, (long)var1_1);
                        if (var3_2 != null) break block100;
                    }
                    catch (CustomSystemException v56) {
                        throw ClusterNodeRegistry.a(v56);
                    }
                }
                this.V = ClusterNodeRegistry.c("\u00e2", (Object)this, (Object)ClusterNodeRegistry.c("i", (int)ClusterNodeRegistry.b("l", (int)10033, (long)(7570400707117343305L ^ var1_1)), (long)-5448856821592758243L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.P2, (Object)new Class[]{ReflectionMetadataResolver.Pb, Integer.TYPE}, (long)-5449033493522826755L, (long)var1_1);
            }
            catch (CustomSystemException v57) {
                throw ClusterNodeRegistry.a(v57);
            }
        }
        try {
            if (AbstractComputationKernel.J() != null) {
                N9.z(new String[3]);
            }
        }
        catch (CustomSystemException v58) {
            throw ClusterNodeRegistry.a(v58);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ClusterNodeRegistry.a = MultiContainerRegistry.a(-5777797196943792565L, -6032177933926023072L, MethodHandles.lookup().lookupClass()).a(108206723379196L);
                ClusterNodeRegistry.e = new Object[11];
                ClusterNodeRegistry.f = new String[11];
                ClusterNodeRegistry.a();
                ClusterNodeRegistry.d = new HashMap<K, V>(13);
                var0 = ClusterNodeRegistry.a ^ 32321549649910L;
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
                var8_3 = new long[20];
                var5_4 = 0;
                var6_5 = "\u001f\u00c6\u0015\u0001\u0012\u001b1.\u00e4\u00be<\u0086^?\u00f7G\u00c0\u00a4\u00b8\u00a8\u00f7\u001d\u00b1]\u00c9'\u00f1\u00d5\u0015\u0011\u00c0]W\u001ao\u0084C\u00afQ\u00aa%\u00b8d\u00d6\u0087\u00dao\u0080\u00ac\u001c[|]J!\u0088\u0098\u00c6\u0016\u00d1\u0016.\u00be\u00b3\u00c2\u0092g\u00b7\u00e7W\u0015\u00f1Ad\u000f\u00a0u\u00c6\t\u001aq%\t\u00ce]S\u008f\u007f\u0015P\u00c0\"\u001f\u00ff\u0090\u0080\u00b5\u00aa\u0095!\u00b3\u00c8\u00b3\u00e3\u00e3C{N\u0087\u009bE\u0091]\u00bb\u00b0\u00e3\u009b\u0016\u0014\u009f`\u0093\u00cc\u00ae\u00faE\u00c3E\u00e5\u00a9p\u00f4\u00e9\u0006\u00a5uy\u00d3\u00ad\"\u00a3\u00e7\u00bfI";
                var7_6 = "\u001f\u00c6\u0015\u0001\u0012\u001b1.\u00e4\u00be<\u0086^?\u00f7G\u00c0\u00a4\u00b8\u00a8\u00f7\u001d\u00b1]\u00c9'\u00f1\u00d5\u0015\u0011\u00c0]W\u001ao\u0084C\u00afQ\u00aa%\u00b8d\u00d6\u0087\u00dao\u0080\u00ac\u001c[|]J!\u0088\u0098\u00c6\u0016\u00d1\u0016.\u00be\u00b3\u00c2\u0092g\u00b7\u00e7W\u0015\u00f1Ad\u000f\u00a0u\u00c6\t\u001aq%\t\u00ce]S\u008f\u007f\u0015P\u00c0\"\u001f\u00ff\u0090\u0080\u00b5\u00aa\u0095!\u00b3\u00c8\u00b3\u00e3\u00e3C{N\u0087\u009bE\u0091]\u00bb\u00b0\u00e3\u009b\u0016\u0014\u009f`\u0093\u00cc\u00ae\u00faE\u00c3E\u00e5\u00a9p\u00f4\u00e9\u0006\u00a5uy\u00d3\u00ad\"\u00a3\u00e7\u00bfI".length();
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
                    var6_5 = "\u00a7\u00ec\u0080\u0095[?$6\u00b1\u00eeu*O*\u0099\u00d6";
                    var7_6 = "\u00a7\u00ec\u0080\u0095[?$6\u00b1\u00eeu*O*\u0099\u00d6".length();
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
        ClusterNodeRegistry.b = var8_3;
        ClusterNodeRegistry.c = new Integer[20];
    }

    static Object G(ClusterNodeRegistry clusterNodeRegistry, Object object) {
        return clusterNodeRegistry.H(object);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7116;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Ph", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ClusterNodeRegistry.c[n2] = n3;
        }
        return c[n2];
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'f' || c == '\u00c4' || c == 'y' || c == 'k') {
                field = ClusterNodeRegistry.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'f' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c4' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'y' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ClusterNodeRegistry.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'i' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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
        Field field = ClusterNodeRegistry.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ClusterNodeRegistry.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private Object b(Object object) {
        return this.n.T(object, new Object[0]);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ClusterNodeRegistry.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ph" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public Object U(Object object, Object object2, int n) {
        return this.V.T(object, object2, n);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ClusterNodeRegistry.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                ClusterNodeRegistry.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public Object M(double d2, double d3, double d4) {
        return this.O.A(d2, d3, d4);
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "9WT4";
        objectArray[1] = "!\u007f\u0014\u0003\u0011^*p\u0005LlF9w\f\u0005";
        objectArray[2] = Boolean.TYPE;
        ClusterNodeRegistry.f[2] = "java/lang/Boolean";
        objectArray[3] = "rk8*h\fyd)e\u0005\fyy=";
        objectArray[4] = "fk{&{r\u0013Kp)j=~Kp4~(";
        objectArray[5] = "%\u000eo\u001c";
        objectArray[6] = "}`]";
        objectArray[7] = Integer.TYPE;
        ClusterNodeRegistry.f[7] = "java/lang/Integer";
        objectArray[8] = "&\u0005-%&N-\n<jG@&\u000180";
        objectArray[9] = "VoaH@\u0006U-yu;\u007fA5{LE\u0004\u00044|uE\u000fK3l\u0015D\u000f@2\u0007OGB@+lI\u0001G\u0000R=\nEBT*f\u0012\u0005\u0015;i}D\u0017EK0x\u0018F\u007f";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "\bQ\u0014A\u0017?]VZ@w&O6W\u0016\u00106\u0005W\u0014\u0002\u0010&4L\r\u0000NtO\t\f\u0007w";
    }

    private Object W(Object object) {
        return this.h.T(object, new Object[0]);
    }

    public Object M(int n, int n2, int n3) {
        return this.S.A(n, n2, n3);
    }

    private Object l(Object object) {
        return this.X.T(object, new Object[0]);
    }

    static Object p(ClusterNodeRegistry clusterNodeRegistry, Object object) {
        return clusterNodeRegistry.y(object);
    }

    private Object Z(Object object) {
        return this.E.T(object, new Object[0]);
    }

    private Object H(Object object) {
        return this.K.T(object, new Object[0]);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ClusterNodeRegistry.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    static Object j(ClusterNodeRegistry clusterNodeRegistry, Object object) {
        return clusterNodeRegistry.W(object);
    }

    public Object w(Object object) {
        return this.Y.A(object);
    }

    private Object y(Object object) {
        return this.r.T(object, new Object[0]);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ClusterNodeRegistry.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ClusterNodeRegistry.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f[n4] != null) {
            return n4;
        }
        Object object = e[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 60;
                break;
            }
            case 1: {
                n3 = 30;
                break;
            }
            case 2: {
                n3 = 32;
                break;
            }
            case 3: {
                n3 = 46;
                break;
            }
            case 4: {
                n3 = 63;
                break;
            }
            case 5: {
                n3 = 9;
                break;
            }
            case 6: {
                n3 = 8;
                break;
            }
            case 7: {
                n3 = 34;
                break;
            }
            case 8: {
                n3 = 14;
                break;
            }
            case 9: {
                n3 = 50;
                break;
            }
            case 10: {
                n3 = 1;
                break;
            }
            case 11: {
                n3 = 7;
                break;
            }
            case 12: {
                n3 = 45;
                break;
            }
            case 13: {
                n3 = 25;
                break;
            }
            case 14: {
                n3 = 17;
                break;
            }
            case 15: {
                n3 = 27;
                break;
            }
            case 16: {
                n3 = 18;
                break;
            }
            case 17: {
                n3 = 22;
                break;
            }
            case 18: {
                n3 = 38;
                break;
            }
            case 19: {
                n3 = 6;
                break;
            }
            case 20: {
                n3 = 20;
                break;
            }
            case 21: {
                n3 = 26;
                break;
            }
            case 22: {
                n3 = 29;
                break;
            }
            case 23: {
                n3 = 10;
                break;
            }
            case 24: {
                n3 = 61;
                break;
            }
            case 25: {
                n3 = 39;
                break;
            }
            case 26: {
                n3 = 52;
                break;
            }
            case 27: {
                n3 = 37;
                break;
            }
            case 28: {
                n3 = 2;
                break;
            }
            case 29: {
                n3 = 21;
                break;
            }
            case 30: {
                n3 = 13;
                break;
            }
            case 31: {
                n3 = 53;
                break;
            }
            case 32: {
                n3 = 41;
                break;
            }
            case 33: {
                n3 = 57;
                break;
            }
            case 34: {
                n3 = 28;
                break;
            }
            case 35: {
                n3 = 44;
                break;
            }
            case 36: {
                n3 = 15;
                break;
            }
            case 37: {
                n3 = 16;
                break;
            }
            case 38: {
                n3 = 23;
                break;
            }
            case 39: {
                n3 = 33;
                break;
            }
            case 40: {
                n3 = 36;
                break;
            }
            case 41: {
                n3 = 40;
                break;
            }
            case 42: {
                n3 = 47;
                break;
            }
            case 43: {
                n3 = 31;
                break;
            }
            case 44: {
                n3 = 12;
                break;
            }
            case 45: {
                n3 = 51;
                break;
            }
            case 46: {
                n3 = 62;
                break;
            }
            case 47: {
                n3 = 49;
                break;
            }
            case 48: {
                n3 = 3;
                break;
            }
            case 49: {
                n3 = 54;
                break;
            }
            case 50: {
                n3 = 48;
                break;
            }
            case 51: {
                n3 = 58;
                break;
            }
            case 52: {
                n3 = 24;
                break;
            }
            case 53: {
                n3 = 56;
                break;
            }
            case 54: {
                n3 = 42;
                break;
            }
            case 55: {
                n3 = 0;
                break;
            }
            case 56: {
                n3 = 19;
                break;
            }
            case 57: {
                n3 = 4;
                break;
            }
            case 58: {
                n3 = 59;
                break;
            }
            case 59: {
                n3 = 11;
                break;
            }
            case 60: {
                n3 = 55;
                break;
            }
            case 61: {
                n3 = 5;
                break;
            }
            case 62: {
                n3 = 43;
                break;
            }
            default: {
                n3 = 35;
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
        ClusterNodeRegistry.f[n4] = new String(cArray);
        return n4;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ClusterNodeRegistry.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ClusterNodeRegistry.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

