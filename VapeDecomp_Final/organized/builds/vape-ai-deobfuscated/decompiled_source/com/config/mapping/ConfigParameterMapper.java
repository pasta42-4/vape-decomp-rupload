/*
 * Decompiled with CFR 0.152.
 */
package com.config.mapping;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometricCalculator1575;
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

public class ConfigParameterMapper
extends CryptoProtocolEngine {
    private HK S;
    private HK K;
    private HK E;
    private static final long[] b;
    private HK C;
    private HK h;
    private HK R;
    private HK s;
    private static final long a;
    public final HK G;
    private HK N;
    private static final Map d;
    private HK k;
    private HK J;
    private static final Object[] e;
    private static final String[] f;
    public HK B;
    private static final Integer[] c;

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/vV" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/vV" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static int W(ConfigParameterMapper configParameterMapper, Object object, String string, float f, float f2, int n, boolean bl, Object object2, Object object3, Object object4, int n2, int n3) {
        return configParameterMapper.r(object, string, f, f2, n, bl, object2, object3, object4, n2, n3);
    }

    private int r(Object object, String string, float f, float f2, int n, boolean bl, Object object2, Object object3, Object object4, int n2, int n3) {
        try {
            if (GameVersionEnumerator.MC_1_21_6.H()) {
                this.k.l(object, string, Float.valueOf(f), Float.valueOf(f2), n, bl, object2, object3, object4, n2, n3);
                return 0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigParameterMapper.a(customSystemException);
        }
        return this.k.R(object, string, Float.valueOf(f), Float.valueOf(f2), n, bl, object2, object3, object4, n2, n3);
    }

    public int W(Object object, Object object2, String string, float f, float f2, int n) {
        return this.K.R(object, object2, string, Float.valueOf(f), Float.valueOf(f2), n);
    }

    /*
     * Unable to fully structure code
     */
    public ConfigParameterMapper() {
        block43: {
            block53: {
                block46: {
                    block51: {
                        block47: {
                            block50: {
                                block48: {
                                    block44: {
                                        block41: {
                                            block42: {
                                                var1_1 = ConfigParameterMapper.a ^ 131875426963701L;
                                                v0 = GeometricCalculator1575.o();
                                                super(ReflectionMetadataResolver.ts);
                                                var3_2 = v0;
                                                try {
                                                    try {
                                                        try {
                                                            v1 = GeometryCalculator.C();
                                                            v2 = 50;
                                                            if (var3_2 == null) break block41;
                                                            if (v1 < v2) break block42;
                                                        }
                                                        catch (CustomSystemException v3) {
                                                            throw ConfigParameterMapper.a(v3);
                                                        }
                                                        this.G = ConfigParameterMapper.c("\u00e1", (Object)this, (Object)ConfigParameterMapper.c("\u00c6", (int)ConfigParameterMapper.b("l", (int)27084, (long)(419642758764363464L ^ var1_1)), (long)3178551217862652839L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[]{String.class}, (long)3178963817011586846L, (long)var1_1);
                                                        this.k = ConfigParameterMapper.c("\u00e1", (Object)this, (Object)ConfigParameterMapper.c("\u00c6", (int)ConfigParameterMapper.b("l", (int)30260, (long)(4114364150082429245L ^ var1_1)), (long)3178551217862652839L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[]{String.class, Float.TYPE, Float.TYPE, Integer.TYPE, Boolean.TYPE, ReflectionMetadataResolver.rr, ReflectionMetadataResolver.Ej, ReflectionMetadataResolver.Eq, Integer.TYPE, Integer.TYPE}, (long)3178963817011586846L, (long)var1_1);
                                                        this.h = ConfigParameterMapper.c("\u00e1", (Object)this, (Object)ReflectionMetadataResolver.F0, (Object)ConfigParameterMapper.c("\u00c6", (int)ConfigParameterMapper.b("l", (int)4405, (long)(2095391062171780664L ^ var1_1)), (long)3178551217862652839L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[]{ReflectionMetadataResolver.ts, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, (long)3178895548366280559L, (long)var1_1);
                                                        if (var3_2 != null) break block43;
                                                    }
                                                    catch (CustomSystemException v4) {
                                                        throw ConfigParameterMapper.a(v4);
                                                    }
                                                    AbstractComputationKernel.I(new String[4]);
                                                }
                                                catch (CustomSystemException v5) {
                                                    throw ConfigParameterMapper.a(v5);
                                                }
                                            }
                                            v1 = GeometryCalculator.C();
                                            v2 = 13;
                                        }
                                        try {
                                            try {
                                                block45: {
                                                    try {
                                                        try {
                                                            if (var3_2 == null) break block44;
                                                            if (v1 != v2) break block45;
                                                        }
                                                        catch (CustomSystemException v6) {
                                                            throw ConfigParameterMapper.a(v6);
                                                        }
                                                        this.R = ConfigParameterMapper.c("\u00e1", (Object)this, (Object)ConfigParameterMapper.c("\u00c6", (int)ConfigParameterMapper.b("l", (int)10863, (long)(1565179221003681145L ^ var1_1)), (long)3178551217862652839L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, (long)3178963817011586846L, (long)var1_1);
                                                        this.B = ConfigParameterMapper.c("\u00e1", (Object)this, (Object)ConfigParameterMapper.c("\u00c6", (int)ConfigParameterMapper.b("l", (int)3247, (long)(1830769441409244088L ^ var1_1)), (long)3178551217862652839L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, (long)3178963817011586846L, (long)var1_1);
                                                        this.s = ConfigParameterMapper.c("\u00e1", (Object)this, (Object)ConfigParameterMapper.c("\u00c6", (int)ConfigParameterMapper.b("l", (int)28248, (long)(5828529990854179152L ^ var1_1)), (long)3178551217862652839L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, (long)3178963817011586846L, (long)var1_1);
                                                        if (var3_2 != null) break block46;
                                                    }
                                                    catch (CustomSystemException v7) {
                                                        throw ConfigParameterMapper.a(v7);
                                                    }
                                                }
                                                v1 = GeometryCalculator.C();
                                                if (var3_2 == null) break block47;
                                            }
                                            catch (CustomSystemException v8) {
                                                throw ConfigParameterMapper.a(v8);
                                            }
                                            v2 = 35;
                                        }
                                        catch (CustomSystemException v9) {
                                            throw ConfigParameterMapper.a(v9);
                                        }
                                    }
                                    try {
                                        block49: {
                                            try {
                                                try {
                                                    try {
                                                        if (v1 >= v2) {
                                                            this.N = ConfigParameterMapper.c("\u00e1", (Object)this, (Object)ConfigParameterMapper.c("\u00c6", (int)ConfigParameterMapper.b("l", (int)12858, (long)(7047183542548178222L ^ var1_1)), (long)3178551217862652839L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Integer.TYPE, (Object)new Class[]{ReflectionMetadataResolver.YH, ReflectionMetadataResolver.V_, Float.TYPE, Float.TYPE, Integer.TYPE}, (long)3178963817011586846L, (long)var1_1);
                                                            v10 = this;
                                                            v11 = ConfigParameterMapper.c("\u00e1", (Object)this, (Object)ConfigParameterMapper.c("\u00c6", (int)ConfigParameterMapper.b("l", (int)3552, (long)(7863384401912470247L ^ var1_1)), (long)3178551217862652839L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Integer.TYPE, (Object)new Class[]{ReflectionMetadataResolver.YH, ReflectionMetadataResolver.V_, Float.TYPE, Float.TYPE, Integer.TYPE}, (long)3178963817011586846L, (long)var1_1);
                                                            if (var3_2 == null) break block48;
                                                        }
                                                        ** GOTO lbl94
                                                    }
                                                    catch (CustomSystemException v12) {
                                                        throw ConfigParameterMapper.a(v12);
                                                    }
                                                    v10.S = v11;
                                                    if (GeometryCalculator.C() < 37) break block49;
                                                }
                                                catch (CustomSystemException v13) {
                                                    throw ConfigParameterMapper.a(v13);
                                                }
                                                this.K = ConfigParameterMapper.c("\u00e1", (Object)this, (Object)ConfigParameterMapper.c("\u00c6", (int)ConfigParameterMapper.b("l", (int)24022, (long)(8957148396466260695L ^ var1_1)), (long)3178551217862652839L, (long)var1_1), (boolean)false, Integer.TYPE, (Object)new Class[]{ReflectionMetadataResolver.YH, String.class, Float.TYPE, Float.TYPE, Integer.TYPE}, (long)3178963817011586846L, (long)var1_1);
                                                if (var3_2 != null) break block50;
                                            }
                                            catch (CustomSystemException v14) {
                                                throw ConfigParameterMapper.a(v14);
                                            }
                                        }
                                        v10 = this;
                                        v11 = ConfigParameterMapper.c("\u00e1", (Object)this, (Object)ConfigParameterMapper.c("\u00c6", (int)ConfigParameterMapper.b("l", (int)38, (long)(372529672856114985L ^ var1_1)), (long)3178551217862652839L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Integer.TYPE, (Object)new Class[]{ReflectionMetadataResolver.YH, String.class, Float.TYPE, Float.TYPE, Integer.TYPE}, (long)3178963817011586846L, (long)var1_1);
                                    }
                                    catch (CustomSystemException v15) {
                                        throw ConfigParameterMapper.a(v15);
                                    }
                                }
                                v10.K = v11;
                            }
                            try {
                                try {
                                    this.B = ConfigParameterMapper.c("\u00e1", (Object)this, (Object)ConfigParameterMapper.c("\u00c6", (int)ConfigParameterMapper.b("l", (int)20478, (long)(8832073280077650171L ^ var1_1)), (long)3178551217862652839L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Integer.TYPE, (Object)new Class[]{ReflectionMetadataResolver.YH, String.class, Float.TYPE, Float.TYPE, Integer.TYPE}, (long)3178963817011586846L, (long)var1_1);
                                    this.E = ConfigParameterMapper.c("\u00e1", (Object)this, (Object)ConfigParameterMapper.c("\u00c6", (int)ConfigParameterMapper.b("l", (int)23068, (long)(7383596599072181535L ^ var1_1)), (long)3178551217862652839L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Integer.TYPE, (Object)new Class[]{ReflectionMetadataResolver.V_, Float.TYPE, Float.TYPE, Integer.TYPE, Boolean.TYPE, ReflectionMetadataResolver.rr, ReflectionMetadataResolver.Ej, Boolean.TYPE, Integer.TYPE, Integer.TYPE}, (long)3178963817011586846L, (long)var1_1);
                                    if (var3_2 != null) break block46;
lbl94:
                                    // 2 sources

                                    this.s = ConfigParameterMapper.c("\u00e1", (Object)this, (Object)ConfigParameterMapper.c("\u00c6", (int)ConfigParameterMapper.b("l", (int)1702, (long)(7965046858941403562L ^ var1_1)), (long)3178551217862652839L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[]{String.class, Float.TYPE, Float.TYPE, Integer.TYPE, Boolean.TYPE}, (long)3178963817011586846L, (long)var1_1);
                                    this.C = ConfigParameterMapper.c("\u00e1", (Object)this, (Object)ConfigParameterMapper.c("\u00c6", (int)ConfigParameterMapper.b("l", (int)11732, (long)(3709540368274733791L ^ var1_1)), (long)3178551217862652839L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[]{String.class, Float.TYPE, Float.TYPE, Integer.TYPE}, (long)3178963817011586846L, (long)var1_1);
                                    v16 = this;
                                    v17 = ConfigParameterMapper.c("\u00e1", (Object)this, (Object)ConfigParameterMapper.c("\u00c6", (int)ConfigParameterMapper.b("l", (int)23739, (long)(5379774362060835769L ^ var1_1)), (long)3178551217862652839L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)3178963817011586846L, (long)var1_1);
                                    if (var3_2 == null) break block51;
                                }
                                catch (CustomSystemException v18) {
                                    throw ConfigParameterMapper.a(v18);
                                }
                                v16.J = v17;
                                v1 = (int)TemporalMetadataResolver.h.d();
                            }
                            catch (CustomSystemException v19) {
                                throw ConfigParameterMapper.a(v19);
                            }
                        }
                        try {
                            block52: {
                                try {
                                    if (v1 == 0) break block52;
                                    this.B = ConfigParameterMapper.c("\u00e1", (Object)this, (Object)ConfigParameterMapper.c("\u00c6", (int)ConfigParameterMapper.b("l", (int)9903, (long)(8555106093673689530L ^ var1_1)), (long)3178551217862652839L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, (long)3178963817011586846L, (long)var1_1);
                                    if (var3_2 != null) break block46;
                                }
                                catch (CustomSystemException v20) {
                                    throw ConfigParameterMapper.a(v20);
                                }
                            }
                            v16 = this;
                            v17 = ConfigParameterMapper.c("\u00e1", (Object)this, (Object)ConfigParameterMapper.c("\u00c6", (int)ConfigParameterMapper.b("l", (int)20797, (long)(4056090737238427195L ^ var1_1)), (long)3178551217862652839L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Integer.TYPE, (Object)new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, (long)3178963817011586846L, (long)var1_1);
                        }
                        catch (CustomSystemException v21) {
                            throw ConfigParameterMapper.a(v21);
                        }
                    }
                    v16.B = v17;
                }
                try {
                    block54: {
                        try {
                            try {
                                v22 = GeometryCalculator.C();
                                v23 = 37;
                                if (var3_2 == null) break block53;
                                if (v22 < v23) break block54;
                            }
                            catch (CustomSystemException v24) {
                                throw ConfigParameterMapper.a(v24);
                            }
                            this.G = ConfigParameterMapper.c("\u00e1", (Object)this, (Object)ConfigParameterMapper.c("\u00c6", (int)ConfigParameterMapper.b("l", (int)19554, (long)(8550504209625504610L ^ var1_1)), (long)3178551217862652839L, (long)var1_1), (boolean)false, Integer.TYPE, (Object)new Class[]{String.class}, (long)3178963817011586846L, (long)var1_1);
                            if (var3_2 != null) break block43;
                        }
                        catch (CustomSystemException v25) {
                            throw ConfigParameterMapper.a(v25);
                        }
                    }
                    v22 = GeometryCalculator.C();
                    v23 = 35;
                }
                catch (CustomSystemException v26) {
                    throw ConfigParameterMapper.a(v26);
                }
            }
            try {
                block55: {
                    try {
                        if (v22 < v23) break block55;
                        this.G = ConfigParameterMapper.c("\u00e1", (Object)this, (Object)ConfigParameterMapper.c("\u00c6", (int)ConfigParameterMapper.b("l", (int)21704, (long)(9044696722048107462L ^ var1_1)), (long)3178551217862652839L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Integer.TYPE, (Object)new Class[]{String.class}, (long)3178963817011586846L, (long)var1_1);
                        if (var3_2 != null) break block43;
                    }
                    catch (CustomSystemException v27) {
                        throw ConfigParameterMapper.a(v27);
                    }
                }
                this.G = ConfigParameterMapper.c("\u00e1", (Object)this, (Object)ConfigParameterMapper.c("\u00c6", (int)ConfigParameterMapper.b("l", (int)23926, (long)(6570475732376865404L ^ var1_1)), (long)3178551217862652839L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[]{String.class}, (long)3178963817011586846L, (long)var1_1);
            }
            catch (CustomSystemException v28) {
                throw ConfigParameterMapper.a(v28);
            }
        }
    }

    public int Z(Object object, String string, float f, float f2, int n) {
        return this.C.R(object, string, Float.valueOf(f), Float.valueOf(f2), n);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public int j(Object object, String string, float f, float f2, int n, boolean bl) {
        try {
            if (GeometryCalculator.C() == 13) {
                return this.s.R(object, string, (int)f, (int)f2, n, bl);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigParameterMapper.a(customSystemException);
        }
        return this.s.R(object, string, Float.valueOf(f), Float.valueOf(f2), n, bl);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ConfigParameterMapper.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public void K(Object object) {
        this.J.V(object);
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
                n3 = 10;
                break;
            }
            case 1: {
                n3 = 12;
                break;
            }
            case 2: {
                n3 = 60;
                break;
            }
            case 3: {
                n3 = 62;
                break;
            }
            case 4: {
                n3 = 1;
                break;
            }
            case 5: {
                n3 = 55;
                break;
            }
            case 6: {
                n3 = 21;
                break;
            }
            case 7: {
                n3 = 6;
                break;
            }
            case 8: {
                n3 = 19;
                break;
            }
            case 9: {
                n3 = 54;
                break;
            }
            case 10: {
                n3 = 15;
                break;
            }
            case 11: {
                n3 = 9;
                break;
            }
            case 12: {
                n3 = 37;
                break;
            }
            case 13: {
                n3 = 20;
                break;
            }
            case 14: {
                n3 = 61;
                break;
            }
            case 15: {
                n3 = 31;
                break;
            }
            case 16: {
                n3 = 56;
                break;
            }
            case 17: {
                n3 = 32;
                break;
            }
            case 18: {
                n3 = 50;
                break;
            }
            case 19: {
                n3 = 49;
                break;
            }
            case 20: {
                n3 = 36;
                break;
            }
            case 21: {
                n3 = 22;
                break;
            }
            case 22: {
                n3 = 29;
                break;
            }
            case 23: {
                n3 = 39;
                break;
            }
            case 24: {
                n3 = 13;
                break;
            }
            case 25: {
                n3 = 3;
                break;
            }
            case 26: {
                n3 = 24;
                break;
            }
            case 27: {
                n3 = 46;
                break;
            }
            case 28: {
                n3 = 45;
                break;
            }
            case 29: {
                n3 = 26;
                break;
            }
            case 30: {
                n3 = 41;
                break;
            }
            case 31: {
                n3 = 25;
                break;
            }
            case 32: {
                n3 = 48;
                break;
            }
            case 33: {
                n3 = 59;
                break;
            }
            case 34: {
                n3 = 42;
                break;
            }
            case 35: {
                n3 = 8;
                break;
            }
            case 36: {
                n3 = 44;
                break;
            }
            case 37: {
                n3 = 30;
                break;
            }
            case 38: {
                n3 = 47;
                break;
            }
            case 39: {
                n3 = 2;
                break;
            }
            case 40: {
                n3 = 51;
                break;
            }
            case 41: {
                n3 = 0;
                break;
            }
            case 42: {
                n3 = 63;
                break;
            }
            case 43: {
                n3 = 16;
                break;
            }
            case 44: {
                n3 = 7;
                break;
            }
            case 45: {
                n3 = 33;
                break;
            }
            case 46: {
                n3 = 38;
                break;
            }
            case 47: {
                n3 = 23;
                break;
            }
            case 48: {
                n3 = 17;
                break;
            }
            case 49: {
                n3 = 35;
                break;
            }
            case 50: {
                n3 = 5;
                break;
            }
            case 51: {
                n3 = 58;
                break;
            }
            case 52: {
                n3 = 28;
                break;
            }
            case 53: {
                n3 = 57;
                break;
            }
            case 54: {
                n3 = 27;
                break;
            }
            case 55: {
                n3 = 4;
                break;
            }
            case 56: {
                n3 = 53;
                break;
            }
            case 57: {
                n3 = 14;
                break;
            }
            case 58: {
                n3 = 18;
                break;
            }
            case 59: {
                n3 = 40;
                break;
            }
            case 60: {
                n3 = 52;
                break;
            }
            case 61: {
                n3 = 34;
                break;
            }
            case 62: {
                n3 = 43;
                break;
            }
            default: {
                n3 = 11;
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
        ConfigParameterMapper.f[n4] = new String(cArray);
        return n4;
    }

    private int t(Object object, Object object2, Object object3, float f, float f2, int n) {
        return this.S.R(object, object2, object3, Float.valueOf(f), Float.valueOf(f2), n);
    }

    public int A(Object object, String string, int n, int n2, int n3) {
        return this.R.R(object, string, n, n2, n3);
    }

    static int R(ConfigParameterMapper configParameterMapper, Object object, Object object2, Object object3, float f, float f2, int n) {
        return configParameterMapper.t(object, object2, object3, f, f2, n);
    }

    private static Field g(long l, long l2) {
        int n = ConfigParameterMapper.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = ConfigParameterMapper.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ConfigParameterMapper.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ConfigParameterMapper.c(clazz3, string2, clazz2)) != null) {
                    ConfigParameterMapper.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ConfigParameterMapper.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ConfigParameterMapper.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ConfigParameterMapper.f(698144020067566L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ConfigParameterMapper.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                ConfigParameterMapper.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method h(long l, long l2) {
        int n = ConfigParameterMapper.e(l, l2);
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
                clazz3 = ConfigParameterMapper.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ConfigParameterMapper.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ConfigParameterMapper.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        ConfigParameterMapper.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ConfigParameterMapper.f(698144020067566L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ConfigParameterMapper.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ConfigParameterMapper.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ConfigParameterMapper.f(698144020067566L, 0L);
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

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3B18;
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
                throw new RuntimeException("a/vV", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ConfigParameterMapper.c[n2] = n3;
        }
        return c[n2];
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "qk@\u0002";
        objectArray[1] = "\u0014\u0000t4%A\u001f\u000fe{XY\f\bl2";
        objectArray[2] = Boolean.TYPE;
        ConfigParameterMapper.f[2] = "java/lang/Boolean";
        objectArray[3] = "7<O\u0002\u0019L<3^MtL<.J";
        objectArray[4] = "Gs\u000b4qr2S\u0000;`=_S\u0000&t(";
        objectArray[5] = "~\u001bV\u001d";
        objectArray[6] = "\u001a\nXr=\u0007o*S},H\u0002*S`8]";
        objectArray[7] = "\u0012>x";
        objectArray[8] = Integer.TYPE;
        ConfigParameterMapper.f[8] = "java/lang/Integer";
        objectArray[9] = "_M\u001f}n)TB\u000e2\u000f'_I\nh";
        objectArray[10] = "\u00054\tp\u001a<\u0010+\u0005K,F\u0010/@$\u0012zR;IKR\"W*Ys\b6\u0015+9qWx\t7\br\u0010#\u0010K\u0005![)\u001a*F)\u0012#hpGuQ/\u00162Yp\u0013F";
        objectArray[11] = "&\u000f+<\u0011\u00103\u0010'\u0007-jqL%f\u001c[r\u000b~\u007f`\u0012/\tt~\\P;\u0000\u001b>\u0004U*\u0010#d\u0010\u0017+p!;^\u000b7A\"|\u0005\u0012KLq7\u000f\u0018*\u000fy~\u0005jp\u000e%=\t\u00142\u0010 \u007f`";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "(>\u001d\u0002R_*=\u0019\u001f8JoL\u001e\u0006\u0000Gu}_\u0012\u0005G\u00144G\u0002WX(vS\u000b8";
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ConfigParameterMapper.a = MultiContainerRegistry.a(136452168613126555L, -5084466139100903225L, MethodHandles.lookup().lookupClass()).a(37576042580707L);
                ConfigParameterMapper.e = new Object[13];
                ConfigParameterMapper.f = new String[13];
                ConfigParameterMapper.a();
                ConfigParameterMapper.d = new HashMap<K, V>(13);
                var0 = ConfigParameterMapper.a ^ 104442263179736L;
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
                var6_5 = "\u00f3\u009e\u00d9\rp\u0005\u00df\u0080\u00f6\u009aSs\u00ff\u00dc\u00d2P\u0090\u00eb\u0086\u0007\u00aa~_\u0015d\u00a1\u0011d\u00ea\\v\u00f0\u00b3b\u008a\u00b7?`5#hG\u00e9i\u00e3\u009d\u0006>Z\u00b3\u000e\u009d\u0015\u0019\u008a\u00d0h\u0012#\u00d3F\u00cf\u0010\u00a9)\u00c9\u0098\u0086i\u0086\u000f\u0012\u00c4D\u00ee&\u00f8\u00d4\u00e1~\u0086\u00e2_(KyH\u0086\u00fb\u000e{\u00e7?\u0081UP\u00ea73\u008c\u0011T\u0093B\u00cc<\u00124\u0013\u0018\u0018O\u00b4\u008a\u00b1\u00e7C\u00e6\u008bfcI\u0013/=\u00d0r\u00f6Iz:bc\u0095\u00c49R3\u00dc\u0004\u00f6]\u00da\u00b9";
                var7_6 = "\u00f3\u009e\u00d9\rp\u0005\u00df\u0080\u00f6\u009aSs\u00ff\u00dc\u00d2P\u0090\u00eb\u0086\u0007\u00aa~_\u0015d\u00a1\u0011d\u00ea\\v\u00f0\u00b3b\u008a\u00b7?`5#hG\u00e9i\u00e3\u009d\u0006>Z\u00b3\u000e\u009d\u0015\u0019\u008a\u00d0h\u0012#\u00d3F\u00cf\u0010\u00a9)\u00c9\u0098\u0086i\u0086\u000f\u0012\u00c4D\u00ee&\u00f8\u00d4\u00e1~\u0086\u00e2_(KyH\u0086\u00fb\u000e{\u00e7?\u0081UP\u00ea73\u008c\u0011T\u0093B\u00cc<\u00124\u0013\u0018\u0018O\u00b4\u008a\u00b1\u00e7C\u00e6\u008bfcI\u0013/=\u00d0r\u00f6Iz:bc\u0095\u00c49R3\u00dc\u0004\u00f6]\u00da\u00b9".length();
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
                    var6_5 = "\u00f1\u00b4r\u0081}\u00cf\u009bQ\u009e\u00ff\u00a8R\u0000\u00d6GH";
                    var7_6 = "\u00f1\u00b4r\u0081}\u00cf\u009bQ\u009e\u00ff\u00a8R\u0000\u00d6GH".length();
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
        ConfigParameterMapper.b = var8_3;
        ConfigParameterMapper.c = new Integer[20];
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ConfigParameterMapper.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ConfigParameterMapper.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public int X(Object object, String string) {
        return this.G.R(object, string);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = ConfigParameterMapper.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ConfigParameterMapper.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public int t(Object object, Object object2, String string, int n, int n2, int n3, boolean bl) {
        try {
            if (GameVersionEnumerator.MC_1_21_6.H()) {
                this.h.l(object, object2, string, n, n2, n3, bl);
                return 0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigParameterMapper.a(customSystemException);
        }
        return this.h.R(object, object2, string, n, n2, n3, bl);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'O' || c == '\u00f6' || c == 'u' || c == '\u00f0') {
                field = ConfigParameterMapper.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'O' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f6' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'u' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ConfigParameterMapper.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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

    static int M(ConfigParameterMapper configParameterMapper, Object object, Object object2, Object object3, float f, float f2, int n) {
        return configParameterMapper.e(object, object2, object3, f, f2, n);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ConfigParameterMapper.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public int K(Object object, Object object2, float f, float f2, int n, boolean bl, Object object3, Object object4, boolean bl2, int n2, int n3) {
        return this.E.R(object, object2, Float.valueOf(f), Float.valueOf(f2), n, bl, object3, object4, bl2, n2, n3);
    }

    public int a(Object object, Object object2, String string, float f, float f2, int n) {
        return this.B.R(object, object2, string, Float.valueOf(f), Float.valueOf(f2), n);
    }

    public int H(Object object, String string, int n, int n2, int n3) {
        return this.B.R(object, string, n, n2, n3);
    }

    public int G(Object object) {
        return 10;
    }

    private int e(Object object, Object object2, Object object3, float f, float f2, int n) {
        return this.N.R(object, object2, object3, Float.valueOf(f), Float.valueOf(f2), n);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ConfigParameterMapper.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ConfigParameterMapper.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

