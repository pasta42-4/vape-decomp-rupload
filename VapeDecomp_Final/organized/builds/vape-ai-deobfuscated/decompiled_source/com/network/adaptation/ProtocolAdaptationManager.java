/*
 * Decompiled with CFR 0.152.
 */
package com.network.adaptation;

import a.Qh;
import a.oQ;
import a.zx;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.core.execution.ExecutionOrchestrator;
import com.app.network.NetworkConnectionHandler1792;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.math.computation.NumericComputationFramework;
import com.math.geometry.GeometryCalculator;
import com.network.protocol.NetworkProtocolNegotiator;
import com.protocol.encoding.EncodingProtocolHandler;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.pipeline.ObjectPipelineManager;
import com.transaction.processing.TransactionSequenceManager;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ProtocolAdaptationManager
extends zx {
    private static final long a = MultiContainerRegistry.a(6653991695767295272L, 1703266301641412860L, MethodHandles.lookup().lookupClass()).a(53352586245065L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map e;

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ProtocolAdaptationManager.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    @Override
    public void C() {
        this.v = this.S.N();
        this.G = this.S.o();
        this.x = this.S.W().t();
        this.l = this.S.W().m();
        TransactionSequenceManager transactionSequenceManager = this.g.I(EncodingProtocolHandler.R());
        TransactionSequenceManager transactionSequenceManager2 = this.y.I(EncodingProtocolHandler.R());
        transactionSequenceManager2.h();
        for (Object e : transactionSequenceManager.D()) {
            transactionSequenceManager2.V(new NetworkConnectionHandler1792(e));
        }
    }

    @Override
    public void J(NumericComputationFramework numericComputationFramework) {
        this.G = numericComputationFramework.a;
        this.v = numericComputationFramework.i;
        this.x = numericComputationFramework.z;
        this.l = numericComputationFramework.n;
        this.D = numericComputationFramework.L;
        this.Y = numericComputationFramework.W;
        this.y.B(numericComputationFramework.s);
        this.y.Q(numericComputationFramework.D);
        this.y.A(numericComputationFramework.l);
        this.y.W(numericComputationFramework.Q);
        this.y.X(numericComputationFramework.q);
        this.y.p(numericComputationFramework.J);
        this.y.t(numericComputationFramework.k);
        this.y.z(numericComputationFramework.G);
        this.y.s(numericComputationFramework.b);
        this.y.a(numericComputationFramework.H);
        this.y.f(numericComputationFramework.p);
        this.y.z(numericComputationFramework.o);
        this.y.G(numericComputationFramework.S);
        this.y.W(numericComputationFramework.A);
        this.y.r(numericComputationFramework.K);
        this.y.h(numericComputationFramework.g);
        this.y.M(numericComputationFramework.j);
        this.y.q(numericComputationFramework.M);
        this.y.A(numericComputationFramework.x);
        this.y.O(numericComputationFramework.r);
        TransactionSequenceManager transactionSequenceManager = this.y.I(EncodingProtocolHandler.R());
        transactionSequenceManager.h();
        for (Object e : numericComputationFramework.I) {
            transactionSequenceManager.V(new NetworkConnectionHandler1792(e));
        }
        this.N = numericComputationFramework.O;
        this.d = numericComputationFramework.B;
        this.V = numericComputationFramework.P;
        this.A = numericComputationFramework.F;
        this.n = numericComputationFramework.V;
        this.W = numericComputationFramework.y;
        this.U = numericComputationFramework.w;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new HashMap(13);
        long l = a ^ 0x931ED866735L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n = 0;
        String string = "\u00e0\u008f\u0085\u00c4\u00da&\u000e\u00a4\bQ\u00ee\u00c8\u00ee\u00cd\u0016\u00fc\u001c\u00f8\u0081\u00b3\u00fa\u00b7\u0083\f";
        int n2 = "\u00e0\u008f\u0085\u00c4\u00da&\u000e\u00a4\bQ\u00ee\u00c8\u00ee\u00cd\u0016\u00fc\u001c\u00f8\u0081\u00b3\u00fa\u00b7\u0083\f".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[3];
    }

    public ProtocolAdaptationManager(Qh qh, SystemConfigurationOrchestrator systemConfigurationOrchestrator, Qh qh2, NetworkProtocolNegotiator networkProtocolNegotiator) {
        super(qh, systemConfigurationOrchestrator, qh2, networkProtocolNegotiator);
    }

    @Override
    public void R(boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        this.N = bl;
        this.d = bl2;
        this.V = bl3;
        this.A = bl4;
        this.W = bl5;
        this.n = bl6;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/zG" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x13AA;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/zG", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ProtocolAdaptationManager.c[n2] = n3;
        }
        return c[n2];
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void B() {
        block103: {
            block101: {
                block105: {
                    block104: {
                        block102: {
                            block99: {
                                boolean bl;
                                float f;
                                block98: {
                                    boolean bl2;
                                    long l;
                                    block96: {
                                        block97: {
                                            boolean bl3;
                                            boolean bl4;
                                            boolean bl5;
                                            block95: {
                                                block94: {
                                                    block93: {
                                                        boolean bl6;
                                                        block92: {
                                                            block91: {
                                                                boolean bl7;
                                                                block90: {
                                                                    l = a ^ 0x784FA68F2E88L;
                                                                    try {
                                                                        try {
                                                                            this.y.u();
                                                                            if (this.G <= 0) break block90;
                                                                            --this.G;
                                                                            if (this.G != 0) break block90;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw ProtocolAdaptationManager.a(customSystemException);
                                                                        }
                                                                        this.y.h(false);
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw ProtocolAdaptationManager.a(customSystemException);
                                                                    }
                                                                }
                                                                try {
                                                                    if (this.v > 0) {
                                                                        --this.v;
                                                                    }
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw ProtocolAdaptationManager.a(customSystemException);
                                                                }
                                                                boolean bl8 = this.D;
                                                                bl5 = this.Y;
                                                                f = 0.8f;
                                                                try {
                                                                    bl7 = this.x >= f;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw ProtocolAdaptationManager.a(customSystemException);
                                                                }
                                                                bl4 = bl7;
                                                                try {
                                                                    try {
                                                                        this.u();
                                                                        if (GeometryCalculator.C() >= GeometryCalculator.z || !this.y.G()) break block91;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw ProtocolAdaptationManager.a(customSystemException);
                                                                    }
                                                                    bl6 = true;
                                                                    break block92;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw ProtocolAdaptationManager.a(customSystemException);
                                                                }
                                                            }
                                                            bl6 = false;
                                                        }
                                                        bl2 = bl6;
                                                        try {
                                                            try {
                                                                if (!bl2 || this.y.d()) break block93;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw ProtocolAdaptationManager.a(customSystemException);
                                                            }
                                                            this.l *= 0.2f;
                                                            this.x *= 0.2f;
                                                            this.v = 0;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw ProtocolAdaptationManager.a(customSystemException);
                                                        }
                                                    }
                                                    oQ oQ2 = this.y.S();
                                                    try {
                                                        try {
                                                            ExecutionOrchestrator.G(this.y, this.y.F() - (double)this.y.d() * 0.35, oQ2.c() + 0.5, this.y.B() + (double)this.y.d() * 0.35);
                                                            ExecutionOrchestrator.G(this.y, this.y.F() - (double)this.y.d() * 0.35, oQ2.c() + 0.5, this.y.B() - (double)this.y.d() * 0.35);
                                                            ExecutionOrchestrator.G(this.y, this.y.F() + (double)this.y.d() * 0.35, oQ2.c() + 0.5, this.y.B() - (double)this.y.d() * 0.35);
                                                            ExecutionOrchestrator.G(this.y, this.y.F() + (double)this.y.d() * 0.35, oQ2.c() + 0.5, this.y.B() + (double)this.y.d() * 0.35);
                                                            if (!((float)this.y.K().u() > 6.0f) && !this.y.M().w()) break block94;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw ProtocolAdaptationManager.a(customSystemException);
                                                        }
                                                        bl3 = true;
                                                        break block95;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw ProtocolAdaptationManager.a(customSystemException);
                                                    }
                                                }
                                                bl3 = false;
                                            }
                                            bl = bl3;
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (!this.y.j() || bl5) break block96;
                                                                                }
                                                                                catch (CustomSystemException customSystemException) {
                                                                                    throw ProtocolAdaptationManager.a(customSystemException);
                                                                                }
                                                                                if (bl4) break block96;
                                                                            }
                                                                            catch (CustomSystemException customSystemException) {
                                                                                throw ProtocolAdaptationManager.a(customSystemException);
                                                                            }
                                                                            if (!(this.x >= f)) break block96;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw ProtocolAdaptationManager.a(customSystemException);
                                                                        }
                                                                        if (this.y.o()) break block96;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw ProtocolAdaptationManager.a(customSystemException);
                                                                    }
                                                                    if (!bl) break block96;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw ProtocolAdaptationManager.a(customSystemException);
                                                                }
                                                                if (bl2) break block96;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw ProtocolAdaptationManager.a(customSystemException);
                                                            }
                                                            if (this.y.e(ObjectPipelineManager.h)) break block96;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw ProtocolAdaptationManager.a(customSystemException);
                                                        }
                                                        if (this.v > 0) break block97;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw ProtocolAdaptationManager.a(customSystemException);
                                                    }
                                                    if (this.U) break block97;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw ProtocolAdaptationManager.a(customSystemException);
                                                }
                                                this.v = (int)ProtocolAdaptationManager.a("c", (int)12683, (long)(0x4FA09D8AAC28C225L ^ l));
                                                break block96;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ProtocolAdaptationManager.a(customSystemException);
                                            }
                                        }
                                        this.y.h(true);
                                        this.G = (int)ProtocolAdaptationManager.a("c", (int)15366, (long)(0x48DCDF66B5EE4FA9L ^ l));
                                    }
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (this.y.o() || !(this.x >= f)) break block98;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw ProtocolAdaptationManager.a(customSystemException);
                                                        }
                                                        if (!bl) break block98;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw ProtocolAdaptationManager.a(customSystemException);
                                                    }
                                                    if (bl2) break block98;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw ProtocolAdaptationManager.a(customSystemException);
                                                }
                                                if (this.y.e(ObjectPipelineManager.h)) break block98;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ProtocolAdaptationManager.a(customSystemException);
                                            }
                                            if (!this.U) break block98;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ProtocolAdaptationManager.a(customSystemException);
                                        }
                                        this.y.h(true);
                                        this.G = (int)ProtocolAdaptationManager.a("c", (int)5090, (long)(0x3AA6224F474E604FL ^ l));
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ProtocolAdaptationManager.a(customSystemException);
                                    }
                                }
                                try {
                                    block100: {
                                        try {
                                            try {
                                                try {
                                                    if (!this.y.o()) break block99;
                                                    if (this.x < f) break block100;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw ProtocolAdaptationManager.a(customSystemException);
                                                }
                                                if (this.y.P()) break block100;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ProtocolAdaptationManager.a(customSystemException);
                                            }
                                            if (bl) break block99;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ProtocolAdaptationManager.a(customSystemException);
                                        }
                                    }
                                    this.y.h(false);
                                    this.G = 0;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ProtocolAdaptationManager.a(customSystemException);
                                }
                            }
                            try {
                                if (this.y.S() > 0) {
                                    this.y.M(this.y.S() - 1);
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ProtocolAdaptationManager.a(customSystemException);
                            }
                            try {
                                if (Math.abs(this.y.G()) < 0.005) {
                                    this.y.t(0.0);
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ProtocolAdaptationManager.a(customSystemException);
                            }
                            try {
                                if (Math.abs(this.y.x()) < 0.005) {
                                    this.y.z(0.0);
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ProtocolAdaptationManager.a(customSystemException);
                            }
                            try {
                                if (Math.abs(this.y.o()) < 0.005) {
                                    this.y.s(0.0);
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ProtocolAdaptationManager.a(customSystemException);
                            }
                            try {
                                try {
                                    this.y.c(this.l);
                                    this.y.X(this.x);
                                    this.y.U(this.D);
                                    if (!this.y.A()) break block101;
                                    if (!this.y.F()) break block102;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ProtocolAdaptationManager.a(customSystemException);
                                }
                                this.y.z(this.y.x() + (double)0.04f);
                                break block103;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ProtocolAdaptationManager.a(customSystemException);
                            }
                        }
                        try {
                            if (!this.y.x()) break block104;
                            this.y.z(this.y.x() + (double)0.04f);
                            break block103;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ProtocolAdaptationManager.a(customSystemException);
                        }
                    }
                    try {
                        try {
                            if (!this.y.j() || this.y.S() != 0) break block103;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ProtocolAdaptationManager.a(customSystemException);
                        }
                        this.y.z((double)0.42f);
                        if (!this.S.e(ObjectPipelineManager.T)) break block105;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ProtocolAdaptationManager.a(customSystemException);
                    }
                    double d2 = (float)(this.S.W(ObjectPipelineManager.T).y() + 1) * 0.1f;
                    this.y.z(this.y.x() + d2);
                }
                if (this.y.o()) {
                    float f = this.y.q() * ((float)Math.PI / 180);
                    this.y.t(this.y.G() - (double)(AdaptiveComputationEngine.D(f) * 0.2f));
                    this.y.s(this.y.o() + (double)(AdaptiveComputationEngine.S(f) * 0.2f));
                }
                this.y.M(10);
                break block103;
            }
            this.y.M(0);
        }
        this.y.c(this.y.w() * 0.98f);
        this.y.X(this.y.u() * 0.98f);
        ExecutionOrchestrator.E(this.y, this.y.w(), this.y.u());
        float f = 0.02f;
        TransactionSequenceManager transactionSequenceManager = this.y.I(EncodingProtocolHandler.R());
        try {
            if (!this.o.s()) {
                transactionSequenceManager.B(this.y.M().c());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ProtocolAdaptationManager.a(customSystemException);
        }
        try {
            this.y.q(0.02f);
            if (this.y.o()) {
                this.y.q((float)((double)this.y.f() + 0.005999999865889549));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ProtocolAdaptationManager.a(customSystemException);
        }
        this.y.A((float)transactionSequenceManager.n());
    }

    public void u() {
        try {
            this.x = 0.0f;
            this.l = 0.0f;
            if (this.N) {
                this.x += 1.0f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ProtocolAdaptationManager.a(customSystemException);
        }
        try {
            if (this.d) {
                this.x -= 1.0f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ProtocolAdaptationManager.a(customSystemException);
        }
        try {
            if (this.V) {
                this.l += 1.0f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ProtocolAdaptationManager.a(customSystemException);
        }
        try {
            if (this.A) {
                this.l -= 1.0f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ProtocolAdaptationManager.a(customSystemException);
        }
        try {
            this.D = this.W;
            this.Y = this.n;
            if (this.Y) {
                this.l = (float)((double)this.l * 0.3);
                this.x = (float)((double)this.x * 0.3);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ProtocolAdaptationManager.a(customSystemException);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ProtocolAdaptationManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

