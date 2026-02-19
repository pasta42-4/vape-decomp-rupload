/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import a.Qh;
import a.Ya;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.database.QueryBuilder;
import com.collections.management.MultiContainerRegistry;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.transformation.DataTransformationProtocol2153;
import com.event.dispatch.EventDispatchController1028;
import com.event.management.ContextualEventDispatcher;
import com.exception.system.CustomSystemException;
import com.graphics.color.ColorCompositionEngine;
import com.math.calculation.NumericCalculationEngine;
import com.math.geometry.GeometricCalculator;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.security.event.SecureEventOrchestrator;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.ConfigurationCalibrator;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.system.resources.ResourceAllocationManager;
import com.transaction.management.TransactionOrchestrator1017;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CryptographicSecurityProvider
extends Ya
implements DataTransformationProtocol2153 {
    private ColorCompositionEngine A;
    private TransactionOrchestrator1017 m;
    private static final NumericCalculationEngine E;
    private float q;
    private NumericCalculationEngine w;
    private float i;
    private float d;
    private static final Integer[] cb;
    private boolean A_;
    private boolean V;
    private long s;
    private boolean z;
    private boolean P;
    private final Random B;
    private static final long ab;
    private float y;
    private static final long[] bb;
    private float I;
    private double t;
    private ColorCompositionEngine x;
    private float e;
    private ContextualEventDispatcher O;
    private float l;
    private static final Map db;
    private float T;
    private Float b;

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Y3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void z(QueryBuilder queryBuilder) {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptographicSecurityProvider.ab = MultiContainerRegistry.a(-7803719048023815614L, -7956598548558049952L, MethodHandles.lookup().lookupClass()).a(201971972815778L);
                CryptographicSecurityProvider.db = new HashMap<K, V>(13);
                var0 = CryptographicSecurityProvider.ab ^ 94569782568911L;
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
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "WZ\u00ecV\u0096\u00d5\u0015\u00a7E ?4\u00fd\u00b0\u00ad\u0017";
                var7_6 = "WZ\u00ecV\u0096\u00d5\u0015\u00a7E ?4\u00fd\u00b0\u00ad\u0017".length();
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
lbl26:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "]\u00cc\u00fb\u008a\u00a1\u00c5\u0004Io\u008eP\u00f2\u0094\u008f\u0088\u00e7";
                    var7_6 = "]\u00cc\u00fb\u008a\u00a1\u00c5\u0004Io\u008eP\u00f2\u0094\u008f\u0088\u00e7".length();
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
lbl39:
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
lbl52:
                // 1 sources

                ** continue;
            }
        }
        CryptographicSecurityProvider.bb = var8_3;
        CryptographicSecurityProvider.cb = new Integer[4];
        CryptographicSecurityProvider.E = new NumericCalculationEngine(0.0f, 0.0f);
    }

    @Override
    public boolean x() {
        block18: {
            block22: {
                double d2;
                double d3;
                block20: {
                    float f;
                    block21: {
                        boolean bl;
                        block23: {
                            boolean bl2;
                            boolean bl3;
                            double d4;
                            block19: {
                                boolean bl4;
                                block17: {
                                    try {
                                        if (this.H == -999.0f) {
                                            return true;
                                        }
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptographicSecurityProvider.b(customSystemException);
                                    }
                                    float f2 = this.L();
                                    if (f2 == -90.0f) {
                                        f2 = -89.99f;
                                    }
                                    float f3 = ConfigurationCalibrator.b.E();
                                    int n = (int)this.u;
                                    int n2 = (int)(-this.k);
                                    float f4 = f3 * 0.6f + 0.2f;
                                    float f5 = f4 * f4 * f4 * 8.0f;
                                    float f6 = (float)n * f5;
                                    float f7 = (float)n2 * f5;
                                    float f8 = (float)((double)this.A() + (double)f6 * 0.15);
                                    float f9 = (float)((double)f2 - (double)f7 * 0.15);
                                    double d5 = AdaptiveComputationEngine.v((this.a - f8) % 360.0f);
                                    d3 = AdaptiveComputationEngine.v((this.H - f9) % 360.0f);
                                    double d6 = Math.abs(d5);
                                    d4 = Math.abs(d3);
                                    d2 = (double)this.e() * 0.25;
                                    double d7 = d4 / d6;
                                    boolean bl5 = this.k();
                                    bl4 = this.L();
                                    bl = this.s();
                                    bl3 = this.Y();
                                    bl2 = this.o();
                                    try {
                                        if (!bl5 || !(d7 < 1.0)) break block17;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptographicSecurityProvider.b(customSystemException);
                                    }
                                    d2 *= d7;
                                }
                                float f10 = ConfigurationCalibrator.b.E();
                                float f11 = f10 * 0.6f + 0.2f;
                                float f12 = f11 * f11 * f11 * 8.0f;
                                f = (float)(0.0 + (double)f12 * 0.15);
                                try {
                                    if (Math.round(d4 / (double)f) <= (long)Math.max(Math.round(this.Z / f), 0)) break block18;
                                    if (!bl4) break block19;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicSecurityProvider.b(customSystemException);
                                }
                                d2 *= (135.0 + d4) / 90.0;
                                break block23;
                            }
                            if (bl3) {
                                d2 += d4 * 0.05;
                            } else if (bl2) {
                                double d8 = d4 / 75.0;
                                double d9 = 0.4;
                                double d10 = 1.0;
                                double d11 = -0.7;
                                double d12 = d10 + 1.0;
                                d2 *= Math.max(1.0, d9 + d12 * Math.pow(d8 - d11, 3.0) + d10 * Math.pow(d8 - d11, 2.0));
                            }
                        }
                        try {
                            try {
                                if (!bl) break block20;
                                if (!(d3 > 0.0)) break block21;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicSecurityProvider.b(customSystemException);
                            }
                            this.k = (float)((double)this.k + Math.min(d2, d3 / (double)f));
                            break block22;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicSecurityProvider.b(customSystemException);
                        }
                    }
                    this.k = (float)((double)this.k - Math.min(d2, Math.abs(d3 / (double)f)));
                    break block22;
                }
                try {
                    this.k = d3 > 0.0 ? (float)((double)this.k + d2) : (float)((double)this.k - d2);
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicSecurityProvider.b(customSystemException);
                }
            }
            return false;
        }
        return true;
    }

    public float v() {
        Object object;
        try {
            object = this.m != null ? this.m : ApplicationLifecycleManager.g();
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicSecurityProvider.b(customSystemException);
        }
        Object object2 = object;
        float f = this.A_ ? ((CryptographicTransformer)object2).S() + this.T : this.T;
        return AdaptiveComputationEngine.g(f, -90.0f, 90.0f);
    }

    public boolean G() {
        return this.A_;
    }

    public void k(boolean bl) {
        this.P = bl;
    }

    @Override
    public boolean q() {
        block17: {
            block21: {
                double d2;
                double d3;
                block19: {
                    float f;
                    block20: {
                        boolean bl;
                        block22: {
                            boolean bl2;
                            boolean bl3;
                            double d4;
                            block18: {
                                boolean bl4;
                                block16: {
                                    try {
                                        if (this.a == -999.0f) {
                                            return true;
                                        }
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptographicSecurityProvider.b(customSystemException);
                                    }
                                    float f2 = ConfigurationCalibrator.b.E();
                                    int n = (int)this.u;
                                    int n2 = (int)(-this.k);
                                    float f3 = f2 * 0.6f + 0.2f;
                                    float f4 = f3 * f3 * f3 * 8.0f;
                                    float f5 = (float)n * f4;
                                    float f6 = (float)n2 * f4;
                                    float f7 = (float)((double)this.A() + (double)f5 * 0.15);
                                    float f8 = (float)((double)this.L() - (double)f6 * 0.15);
                                    d3 = AdaptiveComputationEngine.a((this.a - f7) % 360.0f);
                                    double d5 = AdaptiveComputationEngine.a((this.H - f8) % 360.0f);
                                    d4 = Math.abs(d3);
                                    double d6 = Math.abs(d5);
                                    d2 = (double)this.e() * 0.25;
                                    double d7 = d4 / d6;
                                    boolean bl5 = this.k();
                                    bl4 = this.L();
                                    bl = this.s();
                                    bl3 = this.Y();
                                    bl2 = this.o();
                                    try {
                                        if (!bl5 || !(d7 < 1.0)) break block16;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptographicSecurityProvider.b(customSystemException);
                                    }
                                    d2 *= d7;
                                }
                                float f9 = ConfigurationCalibrator.b.E();
                                float f10 = f9 * 0.6f + 0.2f;
                                float f11 = f10 * f10 * f10 * 8.0f;
                                f = (float)(0.0 + (double)f11 * 0.15);
                                try {
                                    if (Math.round(d4 / (double)f) <= (long)Math.max(Math.round(this.Z / f), 0)) break block17;
                                    if (!bl4) break block18;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicSecurityProvider.b(customSystemException);
                                }
                                d2 *= (225.0 + d4) / 180.0;
                                break block22;
                            }
                            if (bl3) {
                                d2 += d4 * 0.05;
                            } else if (bl2) {
                                double d8 = d4 / 100.0;
                                double d9 = 0.4;
                                double d10 = 1.0;
                                double d11 = -0.7;
                                double d12 = d10 + 1.0;
                                d2 *= Math.min(Math.max(1.0, d9 + d12 * Math.pow(d8 - d11, 3.0) + d10 * Math.pow(d8 - d11, 2.0)), 4.0);
                            }
                        }
                        try {
                            try {
                                if (!bl) break block19;
                                if (!(d3 > 0.0)) break block20;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicSecurityProvider.b(customSystemException);
                            }
                            this.u = (float)((double)this.u + Math.min(d2, d3 / (double)f));
                            break block21;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicSecurityProvider.b(customSystemException);
                        }
                    }
                    this.u = (float)((double)this.u - Math.min(d2, Math.abs(d3 / (double)f)));
                    break block21;
                }
                try {
                    this.u = d3 > 0.0 ? (float)((double)this.u + d2) : (float)((double)this.u - d2);
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicSecurityProvider.b(customSystemException);
                }
            }
            return false;
        }
        return true;
    }

    public float P() {
        Object object;
        try {
            object = this.m != null ? this.m : ApplicationLifecycleManager.g();
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicSecurityProvider.b(customSystemException);
        }
        Object object2 = object;
        try {
            if (this.A_) {
                return ((CryptographicTransformer)object2).q() + this.y;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicSecurityProvider.b(customSystemException);
        }
        return this.y;
    }

    @Override
    public float L() {
        return this.T;
    }

    @Override
    public boolean r() {
        boolean bl;
        try {
            bl = !this.A_;
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicSecurityProvider.b(customSystemException);
        }
        return bl;
    }

    public float y() {
        float f;
        block7: {
            Object object;
            block6: {
                Object object2;
                try {
                    object2 = this.m != null ? this.m : ApplicationLifecycleManager.g();
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicSecurityProvider.b(customSystemException);
                }
                object = object2;
                try {
                    if (this.b == null) break block6;
                    f = this.b.floatValue();
                    break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicSecurityProvider.b(customSystemException);
                }
            }
            try {
                f = ResourceAllocationManager.b() ? ResourceAllocationManager.c() : ((CryptographicTransformer)object).q();
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSecurityProvider.b(customSystemException);
            }
        }
        return f;
    }

    @Override
    public ContextualEventDispatcher N() {
        return this.O;
    }

    @Override
    public float A() {
        return this.y;
    }

    public ColorCompositionEngine c() {
        return this.x;
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public CryptographicSecurityProvider(Qh qh) {
        long l = ab ^ 0x73C5713C94ABL;
        super(qh.q(), qh.S());
        this.z = false;
        this.P = true;
        this.b = null;
        this.x = new ColorCompositionEngine((int)CryptographicSecurityProvider.a("h", (int)1866, (long)(0x30E129FD23A04725L ^ l)));
        this.A = new ColorCompositionEngine((int)CryptographicSecurityProvider.a("h", (int)26323, (long)(0x6BEA11CB1E2AA6BEL ^ l)));
        this.B = new Random();
        this.i = 0.0f;
        this.e = 0.0f;
        this.d = 0.0f;
        this.q = 0.0f;
        this.I = 0.0f;
        this.l = 0.0f;
        this.s = 0L;
        this.m = qh;
        this.y = this.a;
        this.T = this.H;
        this.t = 3.0;
    }

    public void x(Float f) {
        this.b = f;
    }

    public ColorCompositionEngine a() {
        return this.A;
    }

    public CryptographicSecurityProvider(float f, float f2) {
        long l = ab ^ 0x4003315C8179L;
        super(f, f2);
        this.z = false;
        this.P = true;
        this.b = null;
        this.x = new ColorCompositionEngine((int)CryptographicSecurityProvider.a("h", (int)1866, (long)(0x30E11A3B63C052F7L ^ l)));
        this.A = new ColorCompositionEngine((int)CryptographicSecurityProvider.a("h", (int)26323, (long)(0x6BEA220D5E4AB36CL ^ l)));
        this.B = new Random();
        this.i = 0.0f;
        this.e = 0.0f;
        this.d = 0.0f;
        this.q = 0.0f;
        this.I = 0.0f;
        this.l = 0.0f;
        this.s = 0L;
        this.y = ((CryptographicTransformer)ApplicationLifecycleManager.g()).q();
        this.T = ((CryptographicTransformer)ApplicationLifecycleManager.g()).S();
        this.t = 3.0;
    }

    private void X() {
        long l = System.currentTimeMillis();
        try {
            if (l - this.s > (long)(200 + this.B.nextInt(300))) {
                this.s = l;
                this.d = 0.05f + this.B.nextFloat() * 0.15f;
                this.q = 0.04f + this.B.nextFloat() * 0.12f;
                this.I = 0.15f + this.B.nextFloat() * 0.25f;
                this.l = 0.1f + this.B.nextFloat() * 0.2f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicSecurityProvider.b(customSystemException);
        }
        try {
            this.i += this.d;
            this.e += this.q;
            if ((double)this.i > Math.PI * 2) {
                this.i -= (float)Math.PI * 2;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicSecurityProvider.b(customSystemException);
        }
        try {
            if ((double)this.e > Math.PI * 2) {
                this.e -= (float)Math.PI * 2;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicSecurityProvider.b(customSystemException);
        }
    }

    public CryptographicSecurityProvider(ContextualEventDispatcher contextualEventDispatcher) {
        this(0.0f, 0.0f);
        double d2;
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        try {
            d2 = GeometryCalculator.C() > GeometryCalculator.W ? (double)systemConfigurationOrchestrator.E() : 0.0;
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicSecurityProvider.b(customSystemException);
        }
        double d3 = d2;
        ContextualEventDispatcher contextualEventDispatcher2 = ContextualEventDispatcher.N(contextualEventDispatcher.X(), contextualEventDispatcher.F(), contextualEventDispatcher.f());
        ContextualEventDispatcher contextualEventDispatcher3 = ContextualEventDispatcher.N(systemConfigurationOrchestrator.r(), systemConfigurationOrchestrator.y() + d3, systemConfigurationOrchestrator.D());
        NumericCalculationEngine numericCalculationEngine = GeometricCalculator.l(contextualEventDispatcher3, contextualEventDispatcher2, this.A(), this.R());
        this.a = numericCalculationEngine.D();
        this.H = numericCalculationEngine.g();
    }

    @Override
    public void F(ContextualEventDispatcher contextualEventDispatcher) {
        this.w = null;
        this.O = contextualEventDispatcher;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4696;
        if (cb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = bb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])db.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    db.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Y3", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptographicSecurityProvider.cb[n2] = n3;
        }
        return cb[n2];
    }

    public double Z() {
        return this.t;
    }

    public void j(CryptographicSecurityProvider cryptographicSecurityProvider) {
        this.y = cryptographicSecurityProvider.y;
        this.T = cryptographicSecurityProvider.T;
        this.a = cryptographicSecurityProvider.a;
        this.H = cryptographicSecurityProvider.H;
        this.t = cryptographicSecurityProvider.t;
        this.u = cryptographicSecurityProvider.u;
        this.k = cryptographicSecurityProvider.k;
        this.K = cryptographicSecurityProvider.K;
        this.r = cryptographicSecurityProvider.r;
        this.u(cryptographicSecurityProvider.e());
        this.F(cryptographicSecurityProvider.s());
        this.i(cryptographicSecurityProvider.k());
        this.E(cryptographicSecurityProvider.L());
        this.J(cryptographicSecurityProvider.Y());
        this.v(cryptographicSecurityProvider.o());
        this.q(cryptographicSecurityProvider.r());
        this.X(cryptographicSecurityProvider.F());
        this.v = cryptographicSecurityProvider.v;
        this.Z = cryptographicSecurityProvider.Z;
        this.A_ = cryptographicSecurityProvider.A_;
        this.b = cryptographicSecurityProvider.b;
    }

    public boolean N() {
        return this.V;
    }

    public void V(TransactionOrchestrator1017 transactionOrchestrator1017) {
        this.m = transactionOrchestrator1017;
    }

    @Override
    public void p(float f, float f2) {
        float f3;
        float f4;
        block2: {
            this.X();
            f4 = 0.0f;
            f3 = 0.0f;
            try {
                if (!this.V || this.A_) break block2;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSecurityProvider.b(customSystemException);
            }
            f4 = this.a();
            f3 = this.g();
        }
        this.y = (float)((double)this.y + (double)(f + f4) * 0.15);
        this.T = (float)((double)this.T - (double)(f2 + f3) * 0.15);
        this.T = AdaptiveComputationEngine.g(this.T, -90.0f, 90.0f);
    }

    public void p(boolean bl) {
        this.z = bl;
    }

    public void A() {
        block8: {
            block9: {
                block7: {
                    try {
                        if (!this.A_) break block7;
                        this.g(E);
                        break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicSecurityProvider.b(customSystemException);
                    }
                }
                try {
                    if (this.O == null) break block9;
                    this.g(this.j(this.O));
                    break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicSecurityProvider.b(customSystemException);
                }
            }
            try {
                if (this.w != null) {
                    this.g(this.w);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSecurityProvider.b(customSystemException);
            }
        }
    }

    private float a() {
        float f = (float)(Math.sin(this.i) * (double)this.I);
        float f2 = (float)(Math.sin(this.i * 2.7f + 1.3f) * (double)this.I * (double)0.3f);
        return f + f2;
    }

    public NumericCalculationEngine j(ContextualEventDispatcher contextualEventDispatcher) {
        double d2;
        Object object;
        try {
            object = this.m != null ? this.m : ApplicationLifecycleManager.g();
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicSecurityProvider.b(customSystemException);
        }
        Object object2 = object;
        try {
            d2 = GeometryCalculator.C() > GeometryCalculator.W ? (double)((CryptographicTransformer)object2).E() : 0.0;
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicSecurityProvider.b(customSystemException);
        }
        double d3 = d2;
        ContextualEventDispatcher contextualEventDispatcher2 = ContextualEventDispatcher.N(contextualEventDispatcher.X(), contextualEventDispatcher.F(), contextualEventDispatcher.f());
        ContextualEventDispatcher contextualEventDispatcher3 = ContextualEventDispatcher.N(((CryptographicTransformer)object2).r(), ((CryptographicTransformer)object2).y() + d3, ((CryptographicTransformer)object2).D());
        return GeometricCalculator.l(contextualEventDispatcher3, contextualEventDispatcher2, this.A(), false);
    }

    public void L(double d2) {
        this.t = d2;
    }

    public CryptographicSecurityProvider() {
        long l = ab ^ 0x7F1F0AF3EAB3L;
        super(ConfigurationCalibrator.b.Y(), ConfigurationCalibrator.b.p());
        this.z = false;
        this.P = true;
        this.b = null;
        this.x = new ColorCompositionEngine((int)CryptographicSecurityProvider.a("h", (int)29984, (long)(0x548362543B4C4B54L ^ l)));
        this.A = new ColorCompositionEngine((int)CryptographicSecurityProvider.a("h", (int)12125, (long)(0x3899D0561F6912BL ^ l)));
        this.B = new Random();
        this.i = 0.0f;
        this.e = 0.0f;
        this.d = 0.0f;
        this.q = 0.0f;
        this.I = 0.0f;
        this.l = 0.0f;
        this.s = 0L;
        this.y = this.a;
        this.T = this.H;
        this.t = 3.0;
    }

    public void o(boolean bl) {
        this.V = bl;
    }

    private float g() {
        float f = (float)(Math.sin(this.e) * (double)this.l);
        float f2 = (float)(Math.sin(this.e * 3.1f + 0.7f) * (double)this.l * 0.25);
        return f + f2;
    }

    public boolean R() {
        return this.P;
    }

    @Override
    public void H(SystemConfigurationOrchestrator systemConfigurationOrchestrator, SecureEventOrchestrator secureEventOrchestrator) {
        block25: {
            boolean bl;
            block24: {
                boolean bl2;
                block23: {
                    block22: {
                        block21: {
                            try {
                                block20: {
                                    try {
                                        try {
                                            if (systemConfigurationOrchestrator.Y()) break block20;
                                            if (!this.z) break block21;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptographicSecurityProvider.b(customSystemException);
                                        }
                                        if (!secureEventOrchestrator.r()) break block21;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptographicSecurityProvider.b(customSystemException);
                                    }
                                }
                                return;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicSecurityProvider.b(customSystemException);
                            }
                        }
                        this.A();
                        boolean bl3 = this.q();
                        boolean bl4 = this.x();
                        try {
                            try {
                                try {
                                    try {
                                        if (!bl3 || !bl4) break block22;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptographicSecurityProvider.b(customSystemException);
                                    }
                                    if (!(Math.abs(this.u) < 1.0f)) break block22;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptographicSecurityProvider.b(customSystemException);
                                }
                                if (!(Math.abs(this.k) < 1.0f)) break block22;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptographicSecurityProvider.b(customSystemException);
                            }
                            bl2 = true;
                            break block23;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicSecurityProvider.b(customSystemException);
                        }
                    }
                    bl2 = false;
                }
                bl = bl2;
                try {
                    try {
                        try {
                            if (this.A_ || !bl) break block24;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicSecurityProvider.b(customSystemException);
                        }
                        if (this.r()) break block24;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicSecurityProvider.b(customSystemException);
                    }
                    this.n(true);
                    break block25;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicSecurityProvider.b(customSystemException);
                }
            }
            this.X(bl);
        }
    }

    @Override
    public void Q(EventDispatchController1028 eventDispatchController1028) {
        block8: {
            try {
                if (!this.A_ || this.m != null) break block8;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSecurityProvider.b(customSystemException);
            }
            float f = eventDispatchController1028.getThePlayer().q() - this.f;
            float f2 = eventDispatchController1028.getThePlayer().S() - this.n;
            float f3 = Math.abs(this.y - f);
            try {
                if (f3 < Math.abs(this.y)) {
                    this.y -= f;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSecurityProvider.b(customSystemException);
            }
            float f4 = Math.abs(this.T - f2);
            try {
                if (f4 < Math.abs(this.T)) {
                    this.T -= f2;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSecurityProvider.b(customSystemException);
            }
        }
    }

    @Override
    public void v(float f, float f2) {
        this.O = null;
        super.v(f, f2);
    }

    public void g(float f) {
        this.T = f;
    }

    public void V(ColorCompositionEngine colorCompositionEngine) {
        this.x = colorCompositionEngine;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptographicSecurityProvider.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    @Override
    public void q(double d2, double d3, double d4) {
        this.F(ContextualEventDispatcher.N(d2, d3, d4));
    }

    public boolean w() {
        return this.z;
    }

    public void N(ColorCompositionEngine colorCompositionEngine) {
        this.A = colorCompositionEngine;
    }

    public void B(float f) {
        this.y = f;
    }

    public void n(boolean bl) {
        block10: {
            Object object;
            block12: {
                Object object2;
                block11: {
                    try {
                        try {
                            if (this.A_ == bl) break block10;
                            if (this.m == null) break block11;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicSecurityProvider.b(customSystemException);
                        }
                        object2 = this.m;
                        break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicSecurityProvider.b(customSystemException);
                    }
                }
                object2 = object = ApplicationLifecycleManager.g();
            }
            if (bl) {
                float f;
                float f2;
                block13: {
                    this.x(null);
                    f2 = ((CryptographicTransformer)object).q() - this.y;
                    f = ((CryptographicTransformer)object).S() - this.T;
                    float f3 = 0.0f;
                    while (f2 + f3 > 180.0f) {
                        f3 -= 360.0f;
                    }
                    while (f2 + f3 < -180.0f) {
                        f3 += 360.0f;
                    }
                    try {
                        if (f3 == 0.0f) break block13;
                        ((CryptographicTransformer)object).a(((CryptographicTransformer)object).q() + f3);
                        ((TransactionOrchestrator1017)object).C(((TransactionOrchestrator1017)object).J() + f3);
                        ((CryptographicTransformer)object).z(((CryptographicTransformer)object).A() + f3);
                        if (!((ObjectLifecycleTracker)object).B(ReflectionMetadataResolver.rl)) break block13;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicSecurityProvider.b(customSystemException);
                    }
                    SystemConfigurationOrchestrator systemConfigurationOrchestrator = new SystemConfigurationOrchestrator(object);
                    systemConfigurationOrchestrator.m(systemConfigurationOrchestrator.B() + f3);
                }
                this.y = AdaptiveComputationEngine.v(-f2);
                this.T = AdaptiveComputationEngine.g(-f, -90.0f, 90.0f);
            } else {
                this.y += ((CryptographicTransformer)object).q();
                this.T += ((CryptographicTransformer)object).S();
                this.T = AdaptiveComputationEngine.g(this.T, -90.0f, 90.0f);
            }
            this.X(false);
        }
        this.A_ = bl;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptographicSecurityProvider.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

