/*
 * Decompiled with CFR 0.152.
 */
package com.system.resource;

import a.FU;
import a.KB;
import com.adapter.management.GenericAdapterManager;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.event.trigger.EventTriggerEngine;
import com.exception.system.CustomSystemException;
import com.graphics.palette.ColorPaletteManager;
import com.math.geometry.GeometryCalculator;
import com.network.config.ConnectionConfigurationResolver;
import com.runtime.context.LightweightExecutionContext;
import com.security.auth.AuthenticationHandler;
import com.security.cipher.CryptographicTransformer1102;
import com.security.selection.CryptoAlgorithmSelector943;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.temporal.metadata.TemporalMetadataResolver;
import com.util.numeric.NumericFormattingUtility;
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
public class ResourceOrchestrationManager {
    double P;
    private static final Map n;
    int o;
    int m;
    double z;
    long C;
    double c;
    float y;
    private static final Integer[] k;
    private static final long[] g;
    private final AuthenticationStateTracker X;
    int J;
    private final GenericAdapterManager q;
    float E;
    private final FU f;
    int l;
    private final AuthenticationStateTracker B;
    private final NumericFormattingUtility v;
    boolean i;
    int a;
    int e;
    boolean p;
    int M;
    int s;
    int K;
    private static int[] d;
    private final CryptoAlgorithmSelector943 N;
    private final AuthenticationStateTracker Q;
    private boolean j;
    private final ColorPaletteManager L;
    double w;
    public final Random V;
    public final float Y = 32767.0f;
    int h;
    private static final long b;

    public void W() {
        block3: {
            block2: {
                try {
                    if (this.N != CryptoAlgorithmSelector943.LEFT) break block2;
                    this.o();
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceOrchestrationManager.a(customSystemException);
                }
            }
            this.k();
        }
        this.O();
    }

    public boolean M() {
        boolean bl;
        block11: {
            boolean bl2;
            block12: {
                try {
                    try {
                        if (this.N != CryptoAlgorithmSelector943.LEFT) break block11;
                        if (this.X.s().booleanValue()) break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceOrchestrationManager.a(customSystemException);
                    }
                    return ApplicationLifecycleManager.d();
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceOrchestrationManager.a(customSystemException);
                }
            }
            try {
                bl2 = this.o() ? CryptographicTransformer1102.A() : CryptographicTransformer1102.F();
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceOrchestrationManager.a(customSystemException);
            }
            return bl2;
        }
        try {
            if (!this.X.s().booleanValue()) {
                return ApplicationLifecycleManager.d();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceOrchestrationManager.a(customSystemException);
        }
        try {
            bl = this.o() ? CryptographicTransformer1102.F() : CryptographicTransformer1102.A();
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceOrchestrationManager.a(customSystemException);
        }
        return bl;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x499A;
        if (k[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = g[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])ResourceOrchestrationManager.n.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    ResourceOrchestrationManager.n.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/OV", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ResourceOrchestrationManager.k[n2] = n3;
        }
        return k[n2];
    }

    public void q() {
        int n;
        try {
            n = this.o() ? 0 : 1;
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceOrchestrationManager.a(customSystemException);
        }
        CryptographicTransformer1102.B(n, true);
    }

    public int E(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        Object[] objectArray = ApplicationLifecycleManager.U().l().C();
        int n = 0;
        int n2 = -1;
        for (int i = 0; i < 9; ++i) {
            LightweightExecutionContext lightweightExecutionContext = new LightweightExecutionContext(objectArray[i]);
            try {
                if (!lightweightExecutionContext.Y()) continue;
                ++n;
                continue;
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceOrchestrationManager.a(customSystemException);
            }
        }
        return n;
    }

    public void o() {
        int n;
        try {
            n = this.o() ? 1 : 0;
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceOrchestrationManager.a(customSystemException);
        }
        CryptographicTransformer1102.t(n, true);
    }

    public void O() {
        try {
            if (!this.Q.s().booleanValue()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceOrchestrationManager.a(customSystemException);
        }
        float f = 7.0f;
        this.c = AdaptiveComputationEngine.z(this.V, -f, f);
        this.w = AdaptiveComputationEngine.z(this.V, -f, f);
        this.z = this.P = (AdaptiveComputationEngine.l(this.c) + AdaptiveComputationEngine.l(this.w)) * 0.45;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public long h() {
        int n;
        int n2;
        block36: {
            block42: {
                int n3;
                block43: {
                    block41: {
                        int n4;
                        int n5;
                        int n6;
                        block40: {
                            block37: {
                                block39: {
                                    block38: {
                                        int n7;
                                        int n8;
                                        NumericFormattingUtility numericFormattingUtility = this.v;
                                        n2 = numericFormattingUtility.s();
                                        n = numericFormattingUtility.c();
                                        try {
                                            n8 = this.q == null ? 2 : this.q.V();
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ResourceOrchestrationManager.a(customSystemException);
                                        }
                                        int n9 = n8;
                                        n6 = n - n2;
                                        try {
                                            n7 = n6 <= 0 ? n2 : this.V.nextInt(n6) + n2 + 1;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ResourceOrchestrationManager.a(customSystemException);
                                        }
                                        int n10 = n7;
                                        try {
                                            if (n9 == 0) {
                                                this.C = 1000 / n10;
                                                return this.C;
                                            }
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ResourceOrchestrationManager.a(customSystemException);
                                        }
                                        if (n10 == 0) {
                                            n10 = 1;
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (n9 != 1) break block36;
                                                    if (this.p) break block37;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw ResourceOrchestrationManager.a(customSystemException);
                                                }
                                                this.C = 1000 / n10;
                                                if (this.V.nextInt(4) != 1) break block38;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ResourceOrchestrationManager.a(customSystemException);
                                            }
                                            this.p = true;
                                            this.e = 1 + this.V.nextInt(5);
                                            break block37;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ResourceOrchestrationManager.a(customSystemException);
                                        }
                                    }
                                    try {
                                        if (this.V.nextInt(10) != 1) break block39;
                                        break block37;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ResourceOrchestrationManager.a(customSystemException);
                                    }
                                }
                                try {
                                    if (this.V.nextInt(10) == 1) {
                                        this.p = true;
                                        this.e = 5 + this.V.nextInt(10);
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ResourceOrchestrationManager.a(customSystemException);
                                }
                            }
                            try {
                                try {
                                    if (!this.p) break block40;
                                    ++this.a;
                                    if (this.a < this.e) break block40;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ResourceOrchestrationManager.a(customSystemException);
                                }
                                this.a = 0;
                                this.p = false;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceOrchestrationManager.a(customSystemException);
                            }
                        }
                        try {
                            n5 = this.V.nextInt(48);
                            n4 = this.i ? 6 : 10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceOrchestrationManager.a(customSystemException);
                        }
                        try {
                            if (n5 % n4 != 0 || this.p) break block41;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceOrchestrationManager.a(customSystemException);
                        }
                        n2 = 40;
                        n = 85;
                        n6 = n - n2;
                        this.C += (long)(this.V.nextInt(n6) + n2);
                    }
                    try {
                        try {
                            if (!this.i) break block42;
                            ++this.l;
                            if (this.l < this.M) break block43;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceOrchestrationManager.a(customSystemException);
                        }
                        this.K = 75 + this.V.nextInt(125);
                        this.i = false;
                        this.l = 0;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceOrchestrationManager.a(customSystemException);
                    }
                }
                try {
                    n3 = this.V.nextInt(5) == 3 ? 50 : 25;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceOrchestrationManager.a(customSystemException);
                }
                int n11 = n3;
                return this.C + (long)n11;
            }
            try {
                ++this.h;
                if (this.h >= this.K) {
                    this.i = true;
                    this.M = 7 + this.V.nextInt(8);
                    this.h = 0;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceOrchestrationManager.a(customSystemException);
            }
            return this.C;
        }
        this.f.l(n2, n);
        return this.f.E();
    }

    public void k() {
        int n;
        try {
            n = this.o() ? 0 : 1;
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceOrchestrationManager.a(customSystemException);
        }
        CryptographicTransformer1102.t(n, true);
    }

    private void C() {
        boolean bl;
        block8: {
            int n;
            block6: {
                block7: {
                    n = ApplicationLifecycleManager.N().G().t();
                    try {
                        try {
                            ResourceOrchestrationManager resourceOrchestrationManager = this;
                            if (GeometryCalculator.C() < 35) break block6;
                            if (n == 0) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceOrchestrationManager.a(customSystemException);
                        }
                        bl = true;
                        break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceOrchestrationManager.a(customSystemException);
                    }
                }
                bl = false;
                break block8;
            }
            try {
                bl = n != -100;
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceOrchestrationManager.a(customSystemException);
            }
        }
        resourceOrchestrationManager.j = bl;
    }

    public boolean M(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        try {
            if (ApplicationLifecycleManager.U().Y()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceOrchestrationManager.a(customSystemException);
        }
        return this.V();
    }

    public CryptoAlgorithmSelector943 R() {
        return this.N;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/OV" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public ResourceOrchestrationManager(CryptoAlgorithmSelector943 cryptoAlgorithmSelector943, NumericFormattingUtility numericFormattingUtility, AuthenticationStateTracker authenticationStateTracker, ColorPaletteManager colorPaletteManager, AuthenticationStateTracker authenticationStateTracker2, GenericAdapterManager genericAdapterManager, AuthenticationStateTracker authenticationStateTracker3) {
        long l = b ^ 0x4210C120D61L;
        this.a = 0;
        this.p = false;
        this.e = 0;
        this.i = true;
        this.h = 0;
        this.l = 0;
        this.M = 0;
        this.K = 0;
        this.C = 0L;
        this.m = 0;
        this.P = 0.0;
        this.z = 0.0;
        this.V = new Random();
        this.Y = 32767.0f;
        this.j = false;
        this.N = cryptoAlgorithmSelector943;
        this.v = numericFormattingUtility;
        this.B = authenticationStateTracker;
        this.L = colorPaletteManager;
        this.X = authenticationStateTracker2;
        this.q = genericAdapterManager;
        this.Q = authenticationStateTracker3;
        this.B.l(this.L);
        if (cryptoAlgorithmSelector943 == CryptoAlgorithmSelector943.LEFT) {
            this.o = (int)ResourceOrchestrationManager.a("b", (int)18187, (long)(0x6E09C9CB16298A90L ^ l));
            this.s = (int)ResourceOrchestrationManager.a("b", (int)28287, (long)(0x7CBEAF67782D23E5L ^ l));
            this.J = 1;
        } else {
            try {
                if (cryptoAlgorithmSelector943 == CryptoAlgorithmSelector943.RIGHT) {
                    this.o = (int)ResourceOrchestrationManager.a("b", (int)21003, (long)(0x32D6A99137659F93L ^ l));
                    this.s = (int)ResourceOrchestrationManager.a("b", (int)31959, (long)(0x62F8B229AE6DB14EL ^ l));
                    this.J = (int)ResourceOrchestrationManager.a("b", (int)18211, (long)(0x475B8EAB2E9A0ABCL ^ l));
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceOrchestrationManager.a(customSystemException);
            }
        }
        this.f = new FU(TemporalMetadataResolver.h.C());
    }

    private boolean o() {
        return this.j;
    }

    public static int[] R() {
        return d;
    }

    public NumericFormattingUtility u() {
        return this.v;
    }

    public void c() {
        block3: {
            block2: {
                try {
                    if (this.N != CryptoAlgorithmSelector943.LEFT) break block2;
                    this.m();
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceOrchestrationManager.a(customSystemException);
                }
            }
            this.q();
        }
    }

    public void W(EventTriggerEngine eventTriggerEngine) {
        block15: {
            block13: {
                try {
                    block12: {
                        try {
                            try {
                                if (!this.Q.s().booleanValue()) break block12;
                                if (this.y != 0.0f) break block13;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceOrchestrationManager.a(customSystemException);
                            }
                            if (this.E != 0.0f) break block13;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceOrchestrationManager.a(customSystemException);
                        }
                    }
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceOrchestrationManager.a(customSystemException);
                }
            }
            ConnectionConfigurationResolver connectionConfigurationResolver = eventTriggerEngine.getWorld();
            SystemConfigurationOrchestrator systemConfigurationOrchestrator = eventTriggerEngine.getThePlayer();
            try {
                block14: {
                    try {
                        try {
                            if (connectionConfigurationResolver.Y() || systemConfigurationOrchestrator.Y()) break block14;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceOrchestrationManager.a(customSystemException);
                        }
                        if (!ApplicationLifecycleManager.X().r()) break block15;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceOrchestrationManager.a(customSystemException);
                    }
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceOrchestrationManager.a(customSystemException);
            }
        }
        float f = ApplicationLifecycleManager.N().W();
        int n = (int)this.y;
        int n2 = (int)(-this.E);
        float f2 = f * 0.6f + 0.2f;
        float f3 = f2 * f2 * f2 * 8.0f;
        float f4 = (float)n * f3;
        float f5 = (float)n2 * f3;
        AuthenticationHandler.S(f4, f5);
        this.y = AdaptiveComputationEngine.j(AdaptiveComputationEngine.I(this.y, 1.0f));
        this.E = AdaptiveComputationEngine.j(AdaptiveComputationEngine.I(this.E, 1.0f));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ResourceOrchestrationManager.b = MultiContainerRegistry.a(-5999516481129408034L, -5181457951805563636L, MethodHandles.lookup().lookupClass()).a(35759118388845L);
                ResourceOrchestrationManager.n = new HashMap<K, V>(13);
                var0 = ResourceOrchestrationManager.b ^ 32866981737440L;
                ResourceOrchestrationManager.v(new int[5]);
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
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "\u00eb7T.Jn\u0090\u00f5\u00a5\u008e\u00ef\u00ca\u00f7\u0084W\u00c4\u009c\u00e6H]\u00af7jc";
                var7_6 = "\u00eb7T.Jn\u0090\u00f5\u00a5\u008e\u00ef\u00ca\u00f7\u0084W\u00c4\u009c\u00e6H]\u00af7jc".length();
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
lbl27:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00de\u0010@k\r\u00a3\u00c3\u0085\u00a8`\bv89\u00d3\u00d4";
                    var7_6 = "\u00de\u0010@k\r\u00a3\u00c3\u0085\u00a8`\bv89\u00d3\u00d4".length();
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
lbl40:
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
lbl53:
                // 1 sources

                ** continue;
            }
        }
        ResourceOrchestrationManager.g = var8_3;
        ResourceOrchestrationManager.k = new Integer[5];
    }

    public static void v(int[] nArray) {
        d = nArray;
    }

    private boolean V() {
        try {
            if (ApplicationLifecycleManager.X().r()) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceOrchestrationManager.a(customSystemException);
        }
        try {
            if (!this.B.s().booleanValue()) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceOrchestrationManager.a(customSystemException);
        }
        return this.L.m();
    }

    public void K(KB kB) {
        block6: {
            block5: {
                try {
                    this.C();
                    if (!this.Q.s().booleanValue()) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceOrchestrationManager.a(customSystemException);
                }
                try {
                    if (!(this.z > 0.0)) break block5;
                    this.y = (float)((double)this.y + this.c / this.P);
                    this.E = (float)((double)this.E + this.w / this.P);
                    this.z -= 1.0;
                    break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceOrchestrationManager.a(customSystemException);
                }
            }
            this.y = AdaptiveComputationEngine.j(AdaptiveComputationEngine.I(this.y, 1.0f));
            this.E = AdaptiveComputationEngine.j(AdaptiveComputationEngine.I(this.E, 1.0f));
        }
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ResourceOrchestrationManager.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public void m() {
        int n;
        try {
            n = this.o() ? 1 : 0;
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceOrchestrationManager.a(customSystemException);
        }
        CryptographicTransformer1102.B(n, true);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ResourceOrchestrationManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

