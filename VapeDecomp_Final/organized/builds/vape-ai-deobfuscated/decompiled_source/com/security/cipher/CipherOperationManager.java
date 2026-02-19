/*
 * Decompiled with CFR 0.152.
 */
package com.security.cipher;

import a.Qh;
import a.zx;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.core.execution.ExecutionOrchestrator;
import com.app.network.NetworkConnectionHandler1792;
import com.collections.management.MultiContainerRegistry;
import com.event.management.EventDispatchCoordinator1090;
import com.exception.system.CustomSystemException;
import com.math.computation.NumericComputationFramework;
import com.network.protocol.NetworkProtocolNegotiator;
import com.protocol.encoding.EncodingProtocolHandler;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.monitoring.SystemHealthMonitor1733;
import com.system.pipeline.ObjectPipelineManager;
import com.transaction.processing.TransactionSequenceManager;
import com.vape.transform.VapeDataTransformer;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class CipherOperationManager
extends zx {
    private static final long b;
    private static final long a;

    private void A() {
        this.y.c(this.l);
        this.y.X(this.x);
        this.y.U(this.D);
    }

    public CipherOperationManager(Qh qh, SystemConfigurationOrchestrator systemConfigurationOrchestrator, Qh qh2, NetworkProtocolNegotiator networkProtocolNegotiator) {
        super(qh, systemConfigurationOrchestrator, qh2, networkProtocolNegotiator);
    }

    public boolean m() {
        boolean bl;
        try {
            bl = !this.o.s();
        }
        catch (CustomSystemException customSystemException) {
            throw CipherOperationManager.a(customSystemException);
        }
        return bl;
    }

    @Override
    public void C() {
        this.v = this.S.N();
        this.G = this.S.o();
        TransactionSequenceManager transactionSequenceManager = this.g.I(EncodingProtocolHandler.R());
        TransactionSequenceManager transactionSequenceManager2 = this.y.I(EncodingProtocolHandler.R());
        transactionSequenceManager2.h();
        for (Object e : transactionSequenceManager.D()) {
            transactionSequenceManager2.V(new NetworkConnectionHandler1792(e));
        }
        this.y.X(this.g.u());
        this.y.c(this.g.w());
    }

    private void d() {
        List list = this.o.P(this.y, this.y.S(), VapeDataTransformer.Q(this.S));
        if (!list.isEmpty()) {
            for (Object e : list) {
                try {
                    try {
                        try {
                            if (ReflectionMetadataResolver.rl.isInstance(e) || e == this.y.M()) continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CipherOperationManager.a(customSystemException);
                        }
                        if (e == this.g.M()) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherOperationManager.a(customSystemException);
                    }
                    this.y.v(new CryptographicTransformer(e));
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherOperationManager.a(customSystemException);
                }
            }
        }
    }

    @Override
    public void B() {
        block91: {
            block89: {
                block93: {
                    block92: {
                        block90: {
                            block87: {
                                boolean bl;
                                float f;
                                block86: {
                                    boolean bl2;
                                    block84: {
                                        block85: {
                                            boolean bl3;
                                            boolean bl4;
                                            boolean bl5;
                                            block83: {
                                                block82: {
                                                    block81: {
                                                        boolean bl6;
                                                        long l = a ^ 0x1096DCBE3EDAL;
                                                        try {
                                                            this.y.u();
                                                            ++this.G;
                                                            if (this.v > 0) {
                                                                --this.v;
                                                            }
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw CipherOperationManager.a(customSystemException);
                                                        }
                                                        boolean bl7 = this.D;
                                                        bl5 = this.Y;
                                                        f = 0.8f;
                                                        try {
                                                            bl6 = this.x >= 0.8f;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw CipherOperationManager.a(customSystemException);
                                                        }
                                                        bl4 = bl6;
                                                        this.u();
                                                        bl2 = false;
                                                        try {
                                                            try {
                                                                if (!bl2 || this.y.d()) break block81;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw CipherOperationManager.a(customSystemException);
                                                            }
                                                            this.l *= 0.2f;
                                                            this.x *= 0.2f;
                                                            this.v = 0;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw CipherOperationManager.a(customSystemException);
                                                        }
                                                    }
                                                    boolean bl8 = false;
                                                    float f2 = this.y.d();
                                                    double d2 = this.y.F();
                                                    double d3 = this.y.B();
                                                    double d4 = this.y.S().c();
                                                    try {
                                                        try {
                                                            ExecutionOrchestrator.G(this.y, d2 - (double)f2 * 0.35, d4 + 0.5, d3 + (double)f2 * 0.35);
                                                            ExecutionOrchestrator.G(this.y, d2 - (double)f2 * 0.35, d4 + 0.5, d3 - (double)f2 * 0.35);
                                                            ExecutionOrchestrator.G(this.y, d2 + (double)f2 * 0.35, d4 + 0.5, d3 - (double)f2 * 0.35);
                                                            ExecutionOrchestrator.G(this.y, d2 + (double)f2 * 0.35, d4 + 0.5, d3 + (double)f2 * 0.35);
                                                            if (!((float)this.y.K().u() > 6.0f) && !this.y.M().w()) break block82;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw CipherOperationManager.a(customSystemException);
                                                        }
                                                        bl3 = true;
                                                        break block83;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw CipherOperationManager.a(customSystemException);
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
                                                                                    if (!this.y.j() || bl5) break block84;
                                                                                }
                                                                                catch (CustomSystemException customSystemException) {
                                                                                    throw CipherOperationManager.a(customSystemException);
                                                                                }
                                                                                if (bl4) break block84;
                                                                            }
                                                                            catch (CustomSystemException customSystemException) {
                                                                                throw CipherOperationManager.a(customSystemException);
                                                                            }
                                                                            if (!(this.x >= f)) break block84;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw CipherOperationManager.a(customSystemException);
                                                                        }
                                                                        if (this.y.o()) break block84;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw CipherOperationManager.a(customSystemException);
                                                                    }
                                                                    if (!bl) break block84;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw CipherOperationManager.a(customSystemException);
                                                                }
                                                                if (bl2) break block84;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw CipherOperationManager.a(customSystemException);
                                                            }
                                                            if (this.y.e(ObjectPipelineManager.h)) break block84;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw CipherOperationManager.a(customSystemException);
                                                        }
                                                        if (this.v > 0) break block85;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw CipherOperationManager.a(customSystemException);
                                                    }
                                                    if (this.U) break block85;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CipherOperationManager.a(customSystemException);
                                                }
                                                this.v = (int)b;
                                                break block84;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CipherOperationManager.a(customSystemException);
                                            }
                                        }
                                        this.y.h(true);
                                        this.G = 0;
                                    }
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (this.y.o() || !(this.x >= f)) break block86;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw CipherOperationManager.a(customSystemException);
                                                        }
                                                        if (!bl) break block86;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw CipherOperationManager.a(customSystemException);
                                                    }
                                                    if (bl2) break block86;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CipherOperationManager.a(customSystemException);
                                                }
                                                if (this.y.e(ObjectPipelineManager.h)) break block86;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CipherOperationManager.a(customSystemException);
                                            }
                                            if (!this.U) break block86;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CipherOperationManager.a(customSystemException);
                                        }
                                        this.y.h(true);
                                        this.G = 0;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CipherOperationManager.a(customSystemException);
                                    }
                                }
                                try {
                                    block88: {
                                        try {
                                            try {
                                                try {
                                                    if (!this.y.o()) break block87;
                                                    if (this.x < f) break block88;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CipherOperationManager.a(customSystemException);
                                                }
                                                if (this.y.P()) break block88;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CipherOperationManager.a(customSystemException);
                                            }
                                            if (bl) break block87;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CipherOperationManager.a(customSystemException);
                                        }
                                    }
                                    this.y.h(false);
                                    this.G = 0;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CipherOperationManager.a(customSystemException);
                                }
                            }
                            try {
                                if (this.y.S() > 0) {
                                    this.y.M(this.y.S() - 1);
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CipherOperationManager.a(customSystemException);
                            }
                            try {
                                if (Math.abs(this.y.G()) < 0.003) {
                                    this.y.t(0.0);
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CipherOperationManager.a(customSystemException);
                            }
                            try {
                                if (Math.abs(this.y.x()) < 0.003) {
                                    this.y.z(0.0);
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CipherOperationManager.a(customSystemException);
                            }
                            try {
                                if (Math.abs(this.y.o()) < 0.003) {
                                    this.y.s(0.0);
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CipherOperationManager.a(customSystemException);
                            }
                            try {
                                try {
                                    this.A();
                                    if (!this.y.A()) break block89;
                                    if (!this.y.F()) break block90;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CipherOperationManager.a(customSystemException);
                                }
                                this.y.z(this.y.x() + (double)0.04f);
                                break block91;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CipherOperationManager.a(customSystemException);
                            }
                        }
                        try {
                            if (!this.y.x()) break block92;
                            this.y.z(this.y.x() + (double)0.04f);
                            break block91;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CipherOperationManager.a(customSystemException);
                        }
                    }
                    try {
                        try {
                            if (!this.y.j() || this.y.S() != 0) break block91;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CipherOperationManager.a(customSystemException);
                        }
                        this.y.L();
                        if (!this.S.e(ObjectPipelineManager.T)) break block93;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherOperationManager.a(customSystemException);
                    }
                    double d5 = (float)(this.S.W(ObjectPipelineManager.T).y() + 1) * 0.1f;
                    this.y.z(this.y.x() + d5);
                }
                this.y.M(10);
                break block91;
            }
            this.y.M(0);
        }
        this.y.c(this.y.w() * 0.98f);
        this.y.X(this.y.u() * 0.98f);
        this.e(this.y.w(), 0.0f, this.y.u());
        this.d();
        TransactionSequenceManager transactionSequenceManager = this.y.I(EncodingProtocolHandler.R());
        try {
            if (!this.o.s()) {
                transactionSequenceManager.B(this.y.M().c());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherOperationManager.a(customSystemException);
        }
        float f = 0.02f;
        try {
            this.y.q(0.02f);
            if (this.y.o()) {
                this.y.q((float)((double)this.y.f() + 0.005999999865889549));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherOperationManager.a(customSystemException);
        }
        this.y.A((float)transactionSequenceManager.n());
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(5890236499667502621L, -372087889570440811L, MethodHandles.lookup().lookupClass()).a(220739117188182L);
        long l = a ^ 0x6D54870E0385L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 7041445963889099565L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void e(float f, float f2, float f3) {
        SystemHealthMonitor1733 systemHealthMonitor1733;
        block49: {
            block51: {
                float f4;
                block57: {
                    block58: {
                        block56: {
                            boolean bl;
                            block55: {
                                block54: {
                                    block53: {
                                        block52: {
                                            block50: {
                                                this.y.G(false);
                                                systemHealthMonitor1733 = SystemHealthMonitor1733.s();
                                                try {
                                                    try {
                                                        try {
                                                            if (this.y.F() && !this.y.M().K()) break block49;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw CipherOperationManager.a(customSystemException);
                                                        }
                                                        if (!this.y.x()) break block50;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw CipherOperationManager.a(customSystemException);
                                                    }
                                                    if (!this.y.M().K()) break block51;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CipherOperationManager.a(customSystemException);
                                                }
                                            }
                                            f4 = 0.91f;
                                            if (this.y.j()) {
                                                f4 = this.o.T(ReflectionUtilityBroker.t(AdaptiveComputationEngine.Q(this.y.F()), AdaptiveComputationEngine.Q(this.y.S().c()) - 1, AdaptiveComputationEngine.Q(this.y.B()))).I().r() * 0.91f;
                                            }
                                            float f5 = 0.16277136f / (f4 * f4 * f4);
                                            float f6 = this.y.j() ? this.y.a() * f5 : this.y.f();
                                            this.y.c(f, f2, f3, f6);
                                            f4 = 0.91f;
                                            if (this.y.j()) {
                                                f4 = this.o.T(ReflectionUtilityBroker.t(AdaptiveComputationEngine.Q(this.y.F()), AdaptiveComputationEngine.Q(this.y.S().c()) - 1, AdaptiveComputationEngine.Q(this.y.B()))).I().r() * 0.91f;
                                            }
                                            if (this.y.T()) {
                                                float f7 = 0.15f;
                                                try {
                                                    this.y.t(AdaptiveComputationEngine.Z(this.y.G(), -f7, f7));
                                                    this.y.s(AdaptiveComputationEngine.Z(this.y.o(), -f7, f7));
                                                    this.y.V(0.0f);
                                                    if (this.y.x() < -0.15) {
                                                        this.y.z(-0.15);
                                                    }
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CipherOperationManager.a(customSystemException);
                                                }
                                                boolean bl2 = this.y.H();
                                                try {
                                                    try {
                                                        if (!bl2 || !(this.y.x() < 0.0)) break block52;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw CipherOperationManager.a(customSystemException);
                                                    }
                                                    this.y.z(0.0);
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CipherOperationManager.a(customSystemException);
                                                }
                                            }
                                        }
                                        try {
                                            try {
                                                this.y.j(systemHealthMonitor1733, this.y.G(), this.y.x(), this.y.o());
                                                if (!this.y.P() || !this.y.T()) break block53;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CipherOperationManager.a(customSystemException);
                                            }
                                            this.y.z(0.2);
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CipherOperationManager.a(customSystemException);
                                        }
                                    }
                                    try {
                                        try {
                                            if (!this.o.P(ReflectionUtilityBroker.t((int)this.y.F(), 0, (int)this.y.B())) || !this.o.d(ReflectionUtilityBroker.t((int)this.y.F(), 0, (int)this.y.B())).x()) break block54;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CipherOperationManager.a(customSystemException);
                                        }
                                        bl = true;
                                        break block55;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CipherOperationManager.a(customSystemException);
                                    }
                                }
                                bl = false;
                            }
                            boolean bl3 = bl;
                            try {
                                try {
                                    try {
                                        if (this.o.s() && !bl3) break block56;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CipherOperationManager.a(customSystemException);
                                    }
                                    if (this.y.s()) break block57;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CipherOperationManager.a(customSystemException);
                                }
                                this.y.z(this.y.x() - 0.08);
                                break block57;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CipherOperationManager.a(customSystemException);
                            }
                        }
                        try {
                            if (!(this.y.V() > 0.0)) break block58;
                            this.y.z(-0.1);
                            break block57;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CipherOperationManager.a(customSystemException);
                        }
                    }
                    this.y.z(0.0);
                }
                this.y.z(this.y.x() * (double)0.98f);
                this.y.t(this.y.G() * (double)f4);
                this.y.s(this.y.o() * (double)f4);
                return;
            }
            double d2 = this.y.V();
            try {
                this.y.c(f, f2, f3, 0.02f);
                this.y.D(this.y.G(), this.y.x(), this.y.o());
                this.y.t(this.y.G() * 0.5);
                this.y.z(this.y.x() * 0.5);
                this.y.s(this.y.o() * 0.5);
                if (!this.y.s()) {
                    this.y.z(this.y.x() - 0.02);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CipherOperationManager.a(customSystemException);
            }
            try {
                try {
                    if (!this.y.P() || !this.y.u(this.y.G(), this.y.x() + (double)0.6f - this.y.V() + d2, this.y.o())) return;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherOperationManager.a(customSystemException);
                }
                this.y.z((double)0.3f);
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw CipherOperationManager.a(customSystemException);
            }
        }
        double d3 = this.y.V();
        float f8 = 0.8f;
        float f9 = 0.02f;
        float f10 = EventDispatchCoordinator1090.u(this.y);
        if (f10 > 3.0f) {
            f10 = 3.0f;
        }
        if (!this.y.j()) {
            f10 *= 0.5f;
        }
        if (f10 > 0.0f) {
            f8 += (0.54600006f - f8) * f10 / 3.0f;
            f9 += (this.y.a() * 1.0f - f9) * f10 / 3.0f;
        }
        try {
            this.y.c(f, f2, f3, f9);
            this.y.j(systemHealthMonitor1733, this.y.G(), this.y.x(), this.y.o());
            this.y.t(this.y.G() * (double)f8);
            this.y.z(this.y.x() * (double)0.8f);
            this.y.s(this.y.o() * (double)f8);
            if (!this.y.s()) {
                this.y.z(this.y.x() - 0.02);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherOperationManager.a(customSystemException);
        }
        try {
            try {
                if (!this.y.P() || !this.y.u(this.y.G(), this.y.x() + (double)0.6f - this.y.V() + d3, this.y.o())) return;
            }
            catch (CustomSystemException customSystemException) {
                throw CipherOperationManager.a(customSystemException);
            }
            this.y.z((double)0.3f);
            return;
        }
        catch (CustomSystemException customSystemException) {
            throw CipherOperationManager.a(customSystemException);
        }
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

    public void u() {
        try {
            this.x = 0.0f;
            this.l = 0.0f;
            if (this.N) {
                this.x += 1.0f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherOperationManager.a(customSystemException);
        }
        try {
            if (this.d) {
                this.x -= 1.0f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherOperationManager.a(customSystemException);
        }
        try {
            if (this.V) {
                this.l += 1.0f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherOperationManager.a(customSystemException);
        }
        try {
            if (this.A) {
                this.l -= 1.0f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherOperationManager.a(customSystemException);
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
            throw CipherOperationManager.a(customSystemException);
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

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

