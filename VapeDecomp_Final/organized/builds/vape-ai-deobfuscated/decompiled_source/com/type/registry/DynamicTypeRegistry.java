/*
 * Decompiled with CFR 0.152.
 */
package com.type.registry;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityService;
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
import java.util.function.BiConsumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class DynamicTypeRegistry
extends CryptoProtocolEngine {
    private final HK z;
    private HK F;
    private HK v;
    private final HK O;
    private final HK C;
    public final HK V;
    private HK e;
    private final ReflectionUtilityService X;
    private static String m;
    private static final Object[] h;
    private HK j;
    private HK W;
    private static final String[] i;
    private final HK Y;
    private HK D;
    public final HK J;
    private ReflectionUtilityService g;
    private static final Integer[] c;
    public final HK s;
    private HK f;
    private HK y;
    public final HK L;
    private final HK o;
    private final HK H;
    private static final Map d;
    public HK E;
    private static final long a;
    private static final long[] b;
    private final HK G;

    static Object C(DynamicTypeRegistry dynamicTypeRegistry, Object object, Object object2, boolean bl) {
        return dynamicTypeRegistry.O(object, object2, bl);
    }

    public Object h(Object object, Object object2, Object object3, Object object4) {
        return this.y.T(object, object2, object3, object4);
    }

    /*
     * Unable to fully structure code
     */
    public DynamicTypeRegistry() {
        block86: {
            block87: {
                block83: {
                    block84: {
                        block81: {
                            block82: {
                                block77: {
                                    block78: {
                                        block80: {
                                            block74: {
                                                block76: {
                                                    block73: {
                                                        block72: {
                                                            block70: {
                                                                block69: {
                                                                    block68: {
                                                                        block66: {
                                                                            block67: {
                                                                                var1_1 = DynamicTypeRegistry.a ^ 16776121648179L;
                                                                                v0 = DynamicTypeRegistry.B();
                                                                                super(ReflectionMetadataResolver.Vl);
                                                                                this.V = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)5494, (long)(527893985970933759L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.VP, (Object)new Class[0], (long)2706371113755439063L, (long)var1_1);
                                                                                var3_2 = v0;
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            v1 = this;
                                                                                            v2 = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)28164, (long)(62465291609650323L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[0], (long)2706371113755439063L, (long)var1_1);
                                                                                            if (var3_2 != null) break block66;
                                                                                            v1.C = v2;
                                                                                            if (GeometryCalculator.C() < 37) break block67;
                                                                                        }
                                                                                        catch (CustomSystemException v3) {
                                                                                            throw DynamicTypeRegistry.a(v3);
                                                                                        }
                                                                                        this.o = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)29606, (long)(8302245504309799228L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)GameVersionEnumerator.MC_1_20_6.H(), Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.VP}, (long)2706371113755439063L, (long)var1_1);
                                                                                        if (var3_2 == null) break block68;
                                                                                    }
                                                                                    catch (CustomSystemException v4) {
                                                                                        throw DynamicTypeRegistry.a(v4);
                                                                                    }
                                                                                    AbstractComputationKernel.I(new String[1]);
                                                                                }
                                                                                catch (CustomSystemException v5) {
                                                                                    throw DynamicTypeRegistry.a(v5);
                                                                                }
                                                                            }
                                                                            v1 = this;
                                                                            v2 = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)4635, (long)(651297854965598372L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.Vl}, (long)2706371113755439063L, (long)var1_1);
                                                                        }
                                                                        v1.o = v2;
                                                                    }
                                                                    try {
                                                                        try {
                                                                            v6 = GameVersionEnumerator.MC_1_20_6.H();
                                                                            if (var3_2 != null) break block69;
                                                                            if (v6) {
                                                                            }
                                                                            ** GOTO lbl77
                                                                        }
                                                                        catch (CustomSystemException v7) {
                                                                            throw DynamicTypeRegistry.a(v7);
                                                                        }
                                                                        v6 = GameVersionEnumerator.MC_1_21_10.H();
                                                                    }
                                                                    catch (CustomSystemException v8) {
                                                                        throw DynamicTypeRegistry.a(v8);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        if (var3_2 != null) break block70;
                                                                        if (v6) {
                                                                        }
                                                                        ** GOTO lbl67
                                                                    }
                                                                    catch (CustomSystemException v9) {
                                                                        throw DynamicTypeRegistry.a(v9);
                                                                    }
                                                                    v6 = TemporalMetadataResolver.h.q();
                                                                }
                                                                catch (CustomSystemException v10) {
                                                                    throw DynamicTypeRegistry.a(v10);
                                                                }
                                                            }
                                                            try {
                                                                block71: {
                                                                    try {
                                                                        if (!v6) break block71;
                                                                        this.f = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)ReflectionMetadataResolver.bw, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)12581, (long)(1388766051985288092L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, Object.class, (Object)new Class[]{ReflectionMetadataResolver.PS}, (long)2706431417033417670L, (long)var1_1);
                                                                        if (var3_2 == null) break block72;
                                                                    }
                                                                    catch (CustomSystemException v11) {
                                                                        throw DynamicTypeRegistry.a(v11);
                                                                    }
                                                                }
                                                                this.f = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)ReflectionMetadataResolver.Yi, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)2758, (long)(1945400422955143293L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, Object.class, (Object)new Class[]{ReflectionMetadataResolver.PS}, (long)2706431417033417670L, (long)var1_1);
                                                            }
                                                            catch (CustomSystemException v12) {
                                                                throw DynamicTypeRegistry.a(v12);
                                                            }
                                                        }
                                                        try {
                                                            this.W = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)14153, (long)(4610367005470879183L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.VA, BiConsumer.class}, (long)2706371113755439063L, (long)var1_1);
                                                            this.e = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)2246, (long)(2751339006598107743L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[0], (long)2706371113755439063L, (long)var1_1);
                                                            if (var3_2 == null) break block73;
lbl77:
                                                            // 2 sources

                                                            this.E = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)19496, (long)(6823441056119363254L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Yw, (Object)new Class[0], (long)2706371113755439063L, (long)var1_1);
                                                        }
                                                        catch (CustomSystemException v13) {
                                                            throw DynamicTypeRegistry.a(v13);
                                                        }
                                                    }
                                                    try {
                                                        block75: {
                                                            try {
                                                                try {
                                                                    try {
                                                                        this.z = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)22540, (long)(3037739706303513227L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.PW, Integer.TYPE}, (long)2706371113755439063L, (long)var1_1);
                                                                        this.H = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)22932, (long)(5183298593216561944L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Vl, (Object)new Class[0], (long)2706371113755439063L, (long)var1_1);
                                                                        v14 = GameVersionEnumerator.MC_1_12_2.H();
                                                                        if (var3_2 != null) break block74;
                                                                        if (v14) {
                                                                        }
                                                                        ** GOTO lbl126
                                                                    }
                                                                    catch (CustomSystemException v15) {
                                                                        throw DynamicTypeRegistry.a(v15);
                                                                    }
                                                                    if (!GameVersionEnumerator.MC_1_16_5.H()) break block75;
                                                                }
                                                                catch (CustomSystemException v16) {
                                                                    throw DynamicTypeRegistry.a(v16);
                                                                }
                                                                this.O = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)22025, (long)(1343487926761032845L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, Float.TYPE, (Object)new Class[]{ReflectionMetadataResolver.FI}, (long)2706371113755439063L, (long)var1_1);
                                                                this.L = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)17440, (long)(1569128708204633773L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, List.class, (Object)new Class[]{ReflectionMetadataResolver.UQ, ReflectionMetadataResolver.UP}, (long)2706371113755439063L, (long)var1_1);
                                                                if (var3_2 == null) break block76;
                                                            }
                                                            catch (CustomSystemException v17) {
                                                                throw DynamicTypeRegistry.a(v17);
                                                            }
                                                        }
                                                        this.O = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)28159, (long)(5294210341721061189L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Float.TYPE, (Object)new Class[]{ReflectionMetadataResolver.VJ}, (long)2706371113755439063L, (long)var1_1);
                                                        this.L = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)32368, (long)(7810984205735437537L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, List.class, (Object)new Class[]{ReflectionMetadataResolver.UQ, ReflectionMetadataResolver.UP}, (long)2706371113755439063L, (long)var1_1);
                                                    }
                                                    catch (CustomSystemException v18) {
                                                        throw DynamicTypeRegistry.a(v18);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            v19 = GameVersionEnumerator.MC_1_20_6.Q();
                                                            if (var3_2 != null) break block77;
                                                            if (!v19) break block78;
                                                        }
                                                        catch (CustomSystemException v20) {
                                                            throw DynamicTypeRegistry.a(v20);
                                                        }
                                                        this.F = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)15761, (long)(4771702189193225991L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.rj, (Object)new Class[]{ReflectionMetadataResolver.VA}, (long)2706371113755439063L, (long)var1_1);
                                                        if (var3_2 == null) break block78;
                                                    }
                                                    catch (CustomSystemException v21) {
                                                        throw DynamicTypeRegistry.a(v21);
                                                    }
lbl126:
                                                    // 2 sources

                                                    v14 = TemporalMetadataResolver.h.d();
                                                }
                                                catch (CustomSystemException v22) {
                                                    throw DynamicTypeRegistry.a(v22);
                                                }
                                            }
                                            try {
                                                block79: {
                                                    try {
                                                        if (!v14) break block79;
                                                        this.O = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)28939, (long)(776697858689772430L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, Float.TYPE, (Object)new Class[]{ReflectionMetadataResolver.l}, (long)2706371113755439063L, (long)var1_1);
                                                        if (var3_2 == null) break block80;
                                                    }
                                                    catch (CustomSystemException v23) {
                                                        throw DynamicTypeRegistry.a(v23);
                                                    }
                                                }
                                                this.O = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)22542, (long)(1960809826825962166L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Float.TYPE, (Object)new Class[]{ReflectionMetadataResolver.l}, (long)2706371113755439063L, (long)var1_1);
                                            }
                                            catch (CustomSystemException v24) {
                                                throw DynamicTypeRegistry.a(v24);
                                            }
                                        }
                                        this.F = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)9104, (long)(4123139663685646605L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.rj, (Object)new Class[0], (long)2706371113755439063L, (long)var1_1);
                                        this.L = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)12882, (long)(1527861938324662490L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, List.class, (Object)new Class[]{ReflectionMetadataResolver.UQ, Boolean.TYPE}, (long)2706371113755439063L, (long)var1_1);
                                    }
                                    v19 = GameVersionEnumerator.MC_1_16_5.H();
                                }
                                try {
                                    try {
                                        try {
                                            if (var3_2 != null) break block81;
                                            if (v19) {
                                            }
                                            ** GOTO lbl177
                                        }
                                        catch (CustomSystemException v25) {
                                            throw DynamicTypeRegistry.a(v25);
                                        }
                                        if (!GameVersionEnumerator.MC_1_12_2.Q()) break block82;
                                    }
                                    catch (CustomSystemException v26) {
                                        throw DynamicTypeRegistry.a(v26);
                                    }
                                    this.j = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)3377, (long)(3800321995493726113L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, String.class, (Object)new Class[0], (long)2706371113755439063L, (long)var1_1);
                                }
                                catch (CustomSystemException v27) {
                                    throw DynamicTypeRegistry.a(v27);
                                }
                            }
                            try {
                                try {
                                    this.g = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)6836, (long)(2251136816526475316L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Ec, (long)2706476743293066202L, (long)var1_1);
                                    this.J = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)11786, (long)(2178798694500430994L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.FG}, (long)2706371113755439063L, (long)var1_1);
                                    this.X = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)15902, (long)(3272032562069398667L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, Integer.TYPE, (long)2706476743293066202L, (long)var1_1);
                                    this.s = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)21103, (long)(8665165299023153363L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.V_, (Object)new Class[0], (long)2706371113755439063L, (long)var1_1);
                                    this.G = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)44, (long)(4279701200105757351L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[0], (long)2706371113755439063L, (long)var1_1);
                                    this.Y = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)10183, (long)(3735127002928184645L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE}, (long)2706371113755439063L, (long)var1_1);
                                    if (var3_2 == null) break block83;
lbl177:
                                    // 2 sources

                                    this.J = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)21138, (long)(7407355655253886995L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.VP}, (long)2706371113755439063L, (long)var1_1);
                                    this.X = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)28945, (long)(8661409760278555525L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, Integer.TYPE, (long)2706476743293066202L, (long)var1_1);
                                    this.g = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)5857, (long)(6779300384933497970L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Ec, (long)2706476743293066202L, (long)var1_1);
                                    this.j = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)7344, (long)(5010667182992311855L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, String.class, (Object)new Class[0], (long)2706371113755439063L, (long)var1_1);
                                    this.s = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)1237, (long)(8976143147497217631L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, String.class, (Object)new Class[0], (long)2706371113755439063L, (long)var1_1);
                                    if (var3_2 != null) break block84;
                                }
                                catch (CustomSystemException v28) {
                                    throw DynamicTypeRegistry.a(v28);
                                }
                                v19 = GameVersionEnumerator.MC_1_7_10.J();
                            }
                            catch (CustomSystemException v29) {
                                throw DynamicTypeRegistry.a(v29);
                            }
                        }
                        try {
                            block85: {
                                try {
                                    try {
                                        if (!v19 || !ObjectLifecycleTracker.U.d()) break block85;
                                    }
                                    catch (CustomSystemException v30) {
                                        throw DynamicTypeRegistry.a(v30);
                                    }
                                    this.G = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)2768, (long)(5561132169688010846L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[0], (long)2706371113755439063L, (long)var1_1);
                                    this.Y = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)22754, (long)(829297292287640161L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE}, (long)2706371113755439063L, (long)var1_1);
                                    if (var3_2 == null) break block83;
                                }
                                catch (CustomSystemException v31) {
                                    throw DynamicTypeRegistry.a(v31);
                                }
                            }
                            this.G = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)3920, (long)(1148656493647943116L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[0], (long)2706371113755439063L, (long)var1_1);
                        }
                        catch (CustomSystemException v32) {
                            throw DynamicTypeRegistry.a(v32);
                        }
                    }
                    this.Y = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)31810, (long)(5155464691096757968L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE}, (long)2706371113755439063L, (long)var1_1);
                }
                try {
                    try {
                        v33 = GameVersionEnumerator.MC_1_12_2.H();
                        if (var3_2 != null) break block86;
                        if (!v33) break block87;
                    }
                    catch (CustomSystemException v34) {
                        throw DynamicTypeRegistry.a(v34);
                    }
                    this.D = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)19126, (long)(6884442614962524205L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)2706371113755439063L, (long)var1_1);
                }
                catch (CustomSystemException v35) {
                    throw DynamicTypeRegistry.a(v35);
                }
            }
            v33 = GameVersionEnumerator.MC_1_21_4.H();
        }
        try {
            if (v33) {
                this.v = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)12451, (long)(1288592127602747948L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.Vm}, (long)2706371113755439063L, (long)var1_1);
                this.y = DynamicTypeRegistry.c("\u00fb", (Object)this, (Object)DynamicTypeRegistry.c("\u00cb", (int)DynamicTypeRegistry.b("f", (int)31625, (long)(3222389721268756788L ^ var1_1)), (long)2706543138104015776L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.FO, (Object)new Class[]{ReflectionMetadataResolver.EV, ReflectionMetadataResolver.UQ, ReflectionMetadataResolver.F7}, (long)2706371113755439063L, (long)var1_1);
            }
        }
        catch (CustomSystemException v36) {
            throw DynamicTypeRegistry.a(v36);
        }
    }

    public static String B() {
        return m;
    }

    static float S(DynamicTypeRegistry dynamicTypeRegistry, Object object, Object object2) {
        return dynamicTypeRegistry.m(object, object2);
    }

    private void B(Object object, int n) {
        this.Y.l(object, n);
    }

    private Object n(Object object) {
        return this.F.T(object, new Object[0]);
    }

    private float m(Object object, Object object2) {
        return this.O.p(object, object2);
    }

    static int o(DynamicTypeRegistry dynamicTypeRegistry, Object object) {
        return dynamicTypeRegistry.o(object);
    }

    public void n(Object object, int n) {
        this.X.t(object, n);
    }

    private Object O(Object object, Object object2, boolean bl) {
        return this.L.T(object, object2, bl);
    }

    static Object V(DynamicTypeRegistry dynamicTypeRegistry, Object object, Object object2) {
        return dynamicTypeRegistry.R(object, object2);
    }

    private Object H(Object object) {
        return this.s.T(object, new Object[0]);
    }

    private int j(Object object) {
        return this.G.R(object, new Object[0]);
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

    static void I(DynamicTypeRegistry dynamicTypeRegistry, Object object, Object object2, BiConsumer biConsumer) {
        dynamicTypeRegistry.v(object, object2, biConsumer);
    }

    private static Field g(long l, long l2) {
        int n = DynamicTypeRegistry.e(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = DynamicTypeRegistry.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DynamicTypeRegistry.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DynamicTypeRegistry.c(clazz3, string2, clazz2)) != null) {
                    DynamicTypeRegistry.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DynamicTypeRegistry.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DynamicTypeRegistry.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DynamicTypeRegistry.f(761297947677354L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private Object h(Object object) {
        return this.E.T(object, new Object[0]);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e3' || c == 'i' || c == '\u00e9' || c == 'A') {
                field = DynamicTypeRegistry.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e3' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'i' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DynamicTypeRegistry.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fb' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00cb' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    static String N(DynamicTypeRegistry dynamicTypeRegistry, Object object) {
        return dynamicTypeRegistry.r(object);
    }

    static void T(DynamicTypeRegistry dynamicTypeRegistry, Object object, Object object2, int n) {
        dynamicTypeRegistry.E(object, object2, n);
    }

    public void F(Object object, Object object2) {
        this.g.L(object, object2);
    }

    static Object r(DynamicTypeRegistry dynamicTypeRegistry, Object object) {
        return dynamicTypeRegistry.n(object);
    }

    private int q(Object object) {
        return this.e.R(object, new Object[0]);
    }

    private void v(Object object, Object object2, BiConsumer biConsumer) {
        this.W.l(object, object2, biConsumer);
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
                n3 = 63;
                break;
            }
            case 1: {
                n3 = 36;
                break;
            }
            case 2: {
                n3 = 38;
                break;
            }
            case 3: {
                n3 = 43;
                break;
            }
            case 4: {
                n3 = 12;
                break;
            }
            case 5: {
                n3 = 58;
                break;
            }
            case 6: {
                n3 = 62;
                break;
            }
            case 7: {
                n3 = 53;
                break;
            }
            case 8: {
                n3 = 22;
                break;
            }
            case 9: {
                n3 = 17;
                break;
            }
            case 10: {
                n3 = 21;
                break;
            }
            case 11: {
                n3 = 50;
                break;
            }
            case 12: {
                n3 = 29;
                break;
            }
            case 13: {
                n3 = 41;
                break;
            }
            case 14: {
                n3 = 4;
                break;
            }
            case 15: {
                n3 = 49;
                break;
            }
            case 16: {
                n3 = 42;
                break;
            }
            case 17: {
                n3 = 3;
                break;
            }
            case 18: {
                n3 = 2;
                break;
            }
            case 19: {
                n3 = 60;
                break;
            }
            case 20: {
                n3 = 19;
                break;
            }
            case 21: {
                n3 = 51;
                break;
            }
            case 22: {
                n3 = 57;
                break;
            }
            case 23: {
                n3 = 61;
                break;
            }
            case 24: {
                n3 = 5;
                break;
            }
            case 25: {
                n3 = 46;
                break;
            }
            case 26: {
                n3 = 10;
                break;
            }
            case 27: {
                n3 = 34;
                break;
            }
            case 28: {
                n3 = 47;
                break;
            }
            case 29: {
                n3 = 56;
                break;
            }
            case 30: {
                n3 = 20;
                break;
            }
            case 31: {
                n3 = 48;
                break;
            }
            case 32: {
                n3 = 40;
                break;
            }
            case 33: {
                n3 = 45;
                break;
            }
            case 34: {
                n3 = 16;
                break;
            }
            case 35: {
                n3 = 6;
                break;
            }
            case 36: {
                n3 = 14;
                break;
            }
            case 37: {
                n3 = 31;
                break;
            }
            case 38: {
                n3 = 26;
                break;
            }
            case 39: {
                n3 = 9;
                break;
            }
            case 40: {
                n3 = 27;
                break;
            }
            case 41: {
                n3 = 59;
                break;
            }
            case 42: {
                n3 = 23;
                break;
            }
            case 43: {
                n3 = 37;
                break;
            }
            case 44: {
                n3 = 55;
                break;
            }
            case 45: {
                n3 = 52;
                break;
            }
            case 46: {
                n3 = 32;
                break;
            }
            case 47: {
                n3 = 30;
                break;
            }
            case 48: {
                n3 = 11;
                break;
            }
            case 49: {
                n3 = 35;
                break;
            }
            case 50: {
                n3 = 0;
                break;
            }
            case 51: {
                n3 = 39;
                break;
            }
            case 52: {
                n3 = 7;
                break;
            }
            case 53: {
                n3 = 25;
                break;
            }
            case 54: {
                n3 = 8;
                break;
            }
            case 55: {
                n3 = 15;
                break;
            }
            case 56: {
                n3 = 54;
                break;
            }
            case 57: {
                n3 = 13;
                break;
            }
            case 58: {
                n3 = 24;
                break;
            }
            case 59: {
                n3 = 28;
                break;
            }
            case 60: {
                n3 = 1;
                break;
            }
            case 61: {
                n3 = 44;
                break;
            }
            case 62: {
                n3 = 18;
                break;
            }
            default: {
                n3 = 33;
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
        DynamicTypeRegistry.i[n4] = new String(cArray);
        return n4;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DynamicTypeRegistry.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = DynamicTypeRegistry.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DynamicTypeRegistry.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "4\nq=";
        objectArray[1] = "\u001d*\u000bR)\u0013\u0016%\u001a\u001dT\u000b\u0005\"\u0013T";
        objectArray[2] = Boolean.TYPE;
        DynamicTypeRegistry.i[2] = "java/lang/Boolean";
        objectArray[3] = "5\u001dQMxc>\u0012@\u0002\u0015c>\u000fT";
        objectArray[4] = "Z[)rs~/{\"}b1B{\"`v$";
        objectArray[5] = "vEa@";
        objectArray[6] = "\u0011]MX\u0019\u000bd}FW\bD\t}FJ\u001cQ";
        objectArray[7] = "VL\u001c";
        objectArray[8] = Integer.TYPE;
        DynamicTypeRegistry.i[8] = "java/lang/Integer";
        objectArray[9] = "NQ,>";
        objectArray[10] = "2BO _\u001a9M^o>\u00142FZ5";
        objectArray[11] = "A8\u0012Cb<\u00106\u0018xHFDa\u0019\u001es!\u001fn\t\u0000\u000f|D!D\t7-\u0010?Ex5*\u0013#\b\u0006l(\u00181tDd4E2N\u0016ovM_O\u00026=\u001a%\r\u0011i4}";
        objectArray[12] = "\u0000Q\u0013e>kQ_\u0019^\u001e\u0011\u0006Z\u001b\"/o_X\u00100S(\u0002[\u0013\"4s\rK\r^i(B\u0006\u0004f8|\\\u0007ud?\u007f@J\u000b==tR6I5!)Q\f\u001b>c!<\r\u000fg(vFO\u001c8!\u0011";
        objectArray[13] = "=R0\u0003\u001c!l\\:8*[8\u000b;^\r<c\u0004+@qa8KfII0lUg8K7oI*F\u00125d[V\u0006\u0015?cZ+GI1}5";
        Object[] objectArray2 = objectArray;
        objectArray[14] = "]a\u0000!\"0\rl[}\u001cg\u001b\f\u0005mfl\u0000lGzwe`5\u0006rzp\u0007n\tbd\f";
    }

    static Object E(DynamicTypeRegistry dynamicTypeRegistry, Object object, Object object2, Object object3) {
        return dynamicTypeRegistry.m(object, object2, object3);
    }

    static Object F(DynamicTypeRegistry dynamicTypeRegistry, Object object) {
        return dynamicTypeRegistry.z(object);
    }

    static int y(DynamicTypeRegistry dynamicTypeRegistry, Object object) {
        return dynamicTypeRegistry.j(object);
    }

    static int p(DynamicTypeRegistry dynamicTypeRegistry, Object object) {
        return dynamicTypeRegistry.q(object);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DynamicTypeRegistry.a = MultiContainerRegistry.a(7209622311945534039L, 7718008003298803998L, MethodHandles.lookup().lookupClass()).a(197254238511911L);
                DynamicTypeRegistry.h = new Object[15];
                DynamicTypeRegistry.i = new String[15];
                DynamicTypeRegistry.a();
                DynamicTypeRegistry.d = new HashMap<K, V>(13);
                DynamicTypeRegistry.W(null);
                var0 = DynamicTypeRegistry.a ^ 3870470258532L;
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
                var8_3 = new long[39];
                var5_4 = 0;
                var6_5 = "\u00ac\u00df~\u00c2\u00c1\u00fa\u0080i\u00fc\u00ec\u00a2U\u0087.H\u0087\u00e4\u00c9\u00da\u00dbV\u001d\u00de\u0085\u00ff\u00c5p\u00a3Vh\u00f9\u00ed,7f\u0083\u00f4\u00f8\u0001j\u00d8[~\u00f3\u0002\u00a5r\u0006SN\u00abF\u00c3L_\u00943\u00c9B\u00e8\u00d3J\u00ceVqI\u0098\u00d7\u00a8\u00a7m\u00a7\u0084\u0098\u00efc\u00d1\u00b0\u00b9\u00a4J\u00f5\u00aa\u009a\u00e84\u00ad+\u0094\u007f\u0083\u0091\u00af\u00e8\u0096Cw\u00b7\u0086\n\u00b1\u00d6\u00c3\u0000\u0090R\u00cb\u0094W\u001e\u0001\u0019f8\u00e6\u0099\u00a8\u00d3\u00d2\u0098c\u00eaL\u00f1k\u0013:\u00b1\u0087n\u00cbxL\u00b6)\u009f\u00d1\u009cf\u00c8G+\u0016\u00b9\u00c6\u00e6q\u00a7\u00fc\u0011\u00de|&\u00a1a\u00d5\b\"\u0081kP\u00a4\u00f0 \u008d\u00f5\u00df-\u00f5s\u00fa\u00d2\u00f0\u00f6\u00ba\u0015\u00b9\u00bb\u00ba\u0010WRQ0oV\"\u00bf\u00d2\u00b4\u0016B\u0005\u00a2C\u00f1\u00e4w\u00c3d\u00b7X\u00c47\u00fb\u0010O1\u00a3\u0084\u00dc\u00a0\u00cd\u00c9\u0098w\u00d6\u00b7$\u00f6\u00b2\u0098\u00af\u0002j\u001d_>\u00cc\u00b52\u0084\u00ed\u00d6B\u00a3\u00d1N;\u00a8;\u00a8H`\u00a50\u00e2\u0094\u00b3K\u0001\u00c9|E`\u00c2\"\u00bb\u008bPEq\u00b6\u00bd\u00e6[\u00bf\u00f2#\r\u0099\u00b5C:\u0087\u00d4\u0084\u00f1\u00b1G<\u009b\u00bdQ\u0012\u0011\u0005\u0090\u00dee\u0084\u00d7\u00bf-\u00103";
                var7_6 = "\u00ac\u00df~\u00c2\u00c1\u00fa\u0080i\u00fc\u00ec\u00a2U\u0087.H\u0087\u00e4\u00c9\u00da\u00dbV\u001d\u00de\u0085\u00ff\u00c5p\u00a3Vh\u00f9\u00ed,7f\u0083\u00f4\u00f8\u0001j\u00d8[~\u00f3\u0002\u00a5r\u0006SN\u00abF\u00c3L_\u00943\u00c9B\u00e8\u00d3J\u00ceVqI\u0098\u00d7\u00a8\u00a7m\u00a7\u0084\u0098\u00efc\u00d1\u00b0\u00b9\u00a4J\u00f5\u00aa\u009a\u00e84\u00ad+\u0094\u007f\u0083\u0091\u00af\u00e8\u0096Cw\u00b7\u0086\n\u00b1\u00d6\u00c3\u0000\u0090R\u00cb\u0094W\u001e\u0001\u0019f8\u00e6\u0099\u00a8\u00d3\u00d2\u0098c\u00eaL\u00f1k\u0013:\u00b1\u0087n\u00cbxL\u00b6)\u009f\u00d1\u009cf\u00c8G+\u0016\u00b9\u00c6\u00e6q\u00a7\u00fc\u0011\u00de|&\u00a1a\u00d5\b\"\u0081kP\u00a4\u00f0 \u008d\u00f5\u00df-\u00f5s\u00fa\u00d2\u00f0\u00f6\u00ba\u0015\u00b9\u00bb\u00ba\u0010WRQ0oV\"\u00bf\u00d2\u00b4\u0016B\u0005\u00a2C\u00f1\u00e4w\u00c3d\u00b7X\u00c47\u00fb\u0010O1\u00a3\u0084\u00dc\u00a0\u00cd\u00c9\u0098w\u00d6\u00b7$\u00f6\u00b2\u0098\u00af\u0002j\u001d_>\u00cc\u00b52\u0084\u00ed\u00d6B\u00a3\u00d1N;\u00a8;\u00a8H`\u00a50\u00e2\u0094\u00b3K\u0001\u00c9|E`\u00c2\"\u00bb\u008bPEq\u00b6\u00bd\u00e6[\u00bf\u00f2#\r\u0099\u00b5C:\u0087\u00d4\u0084\u00f1\u00b1G<\u009b\u00bdQ\u0012\u0011\u0005\u0090\u00dee\u0084\u00d7\u00bf-\u00103".length();
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
                    var6_5 = "\u00de(X\u0081G\u00c0\u00dc\rH\u001b\u00bd\u00f4\u00ab\u0089kw";
                    var7_6 = "\u00de(X\u0081G\u00c0\u00dc\rH\u001b\u00bd\u00f4\u00ab\u0089kw".length();
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
        DynamicTypeRegistry.b = var8_3;
        DynamicTypeRegistry.c = new Integer[39];
    }

    public static void W(String string) {
        m = string;
    }

    public int F(Object object) {
        return this.X.R(object);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public Object Z(Object object) {
        return this.g.Z(object);
    }

    private Object R(Object object, Object object2) {
        return this.F.T(object, object2);
    }

    public boolean e(Object object) {
        return this.D.V(object, new Object[0]);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DynamicTypeRegistry.e(l, l2);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                DynamicTypeRegistry.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public boolean j(Object object, Object object2) {
        return this.o.V(object, object2);
    }

    private Object z(Object object) {
        return this.H.T(object, new Object[0]);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/m4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private Object k(Object object, Object object2) {
        return this.f.T(object, object2);
    }

    public Object s(Object object) {
        return this.J.A(object);
    }

    private String r(Object object) {
        try {
            if (object == null) {
                return "";
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicTypeRegistry.a(customSystemException);
        }
        return (String)this.s.T(object, new Object[0]);
    }

    static Object u(DynamicTypeRegistry dynamicTypeRegistry, Object object) {
        return dynamicTypeRegistry.H(object);
    }

    static Object A(DynamicTypeRegistry dynamicTypeRegistry, Object object) {
        return dynamicTypeRegistry.h(object);
    }

    private Object m(Object object, Object object2, Object object3) {
        return this.L.T(object, object2, object3);
    }

    private int o(Object object) {
        return this.C.R(object, new Object[0]);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/m4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void E(Object object, Object object2, int n) {
        this.z.l(object, object2, n);
    }

    static Object E(DynamicTypeRegistry dynamicTypeRegistry, Object object, Object object2) {
        return dynamicTypeRegistry.k(object, object2);
    }

    static void v(DynamicTypeRegistry dynamicTypeRegistry, Object object, int n) {
        dynamicTypeRegistry.B(object, n);
    }

    public boolean p(Object object, Object object2) {
        return this.v.V(object, object2);
    }

    public String H(Object object) {
        return this.j.T(object, new Object[0]).toString();
    }

    private static Method h(long l, long l2) {
        int n = DynamicTypeRegistry.e(l, l2);
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
                clazz3 = DynamicTypeRegistry.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DynamicTypeRegistry.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DynamicTypeRegistry.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        DynamicTypeRegistry.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DynamicTypeRegistry.f(761297947677354L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DynamicTypeRegistry.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DynamicTypeRegistry.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DynamicTypeRegistry.f(761297947677354L, 0L);
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

    public Object B(Object object) {
        return this.V.T(object, new Object[0]);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DynamicTypeRegistry.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DynamicTypeRegistry.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DynamicTypeRegistry.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7F15;
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
                throw new RuntimeException("a/m4", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DynamicTypeRegistry.c[n2] = n3;
        }
        return c[n2];
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DynamicTypeRegistry.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(DynamicTypeRegistry.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

