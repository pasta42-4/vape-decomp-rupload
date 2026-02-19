/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.analytics.computation;

import a.Ec;
import a.Ne;
import a.tl;
import com.collections.management.MultiContainerRegistry;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.event.core.EventDispatchOrchestrator1391;
import com.exception.system.CustomSystemException;
import com.network.configuration.NetworkConfigManager;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.security.transform.CryptographicTransformer;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.system.monitoring.ExecutionStateTracker;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class NumericComputationEngine1000 {
    private static int c;
    private static boolean j;
    private EventDispatchOrchestrator1391 s;
    public double a;
    private boolean i;
    public double P;
    public float Q;
    private int K;
    private int z;
    private static final long b;
    private int k;
    private int p;
    public float Z;
    private final NetworkConfigManager e;
    private boolean y;
    private static final long d;
    public double D;

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = MultiContainerRegistry.a(206458270722332685L, -4661966530753363724L, MethodHandles.lookup().lookupClass()).a(205674713728556L);
        long l = b ^ 0x741F6E366125L;
        NumericComputationEngine1000.X(74);
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -2379018125886471246L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                d = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public void Q(int n) {
        this.K = n;
    }

    public void A(boolean bl, double d2, double d3, double d4, double d5) {
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        block25: {
            block27: {
                block26: {
                    try {
                        if (!ApplicationLifecycleManager.N().s()) {
                            return;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericComputationEngine1000.a(customSystemException);
                    }
                    Ne.h.y(2903);
                    bl5 = GL11.glIsEnabled((int)3553);
                    bl4 = GL11.glIsEnabled((int)2896);
                    bl3 = GL11.glIsEnabled((int)3008);
                    bl2 = GL11.glIsEnabled((int)3042);
                    try {
                        if (!bl5) {
                            tl.B();
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericComputationEngine1000.a(customSystemException);
                    }
                    try {
                        if (bl4) {
                            tl.P();
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericComputationEngine1000.a(customSystemException);
                    }
                    try {
                        try {
                            tl.Z();
                            tl.j();
                            if (!bl) break block25;
                            this.s.B();
                            if (!this.i) break block26;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NumericComputationEngine1000.a(customSystemException);
                        }
                        GraphicsBufferAllocator.N(d2, d3, d4, d5);
                        break block27;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericComputationEngine1000.a(customSystemException);
                    }
                }
                GraphicsBufferAllocator.O(d2, d3, d4, d5);
            }
            this.s.q();
        }
        try {
            if (!bl5) {
                tl.R();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericComputationEngine1000.a(customSystemException);
        }
        try {
            if (bl4) {
                tl.T();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericComputationEngine1000.a(customSystemException);
        }
        try {
            if (bl3) {
                tl.s();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericComputationEngine1000.a(customSystemException);
        }
        try {
            if (bl2) {
                tl.N();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericComputationEngine1000.a(customSystemException);
        }
    }

    public static int A() {
        int n = NumericComputationEngine1000.R();
        try {
            if (n == 0) {
                return 126;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericComputationEngine1000.a(customSystemException);
        }
        return 0;
    }

    public NumericComputationEngine1000() {
        this(false);
    }

    public void u() {
        this.s.p(this.p, this.k);
    }

    public NumericComputationEngine1000(boolean bl) {
        this(bl, 720, 400);
    }

    public void k(int n) {
        this.p = n;
        this.y = false;
    }

    public static void T(boolean bl) {
        j = bl;
    }

    public EventDispatchOrchestrator1391 q() {
        return this.s;
    }

    protected void F(CryptographicTransformer cryptographicTransformer) {
        this.A(cryptographicTransformer);
        this.Z = cryptographicTransformer.q();
        this.Q = cryptographicTransformer.S();
    }

    public boolean f() {
        return this.y;
    }

    public static void X(int n) {
        c = n;
    }

    private boolean N() {
        return true;
    }

    public int T() {
        return this.k;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static int R() {
        return c;
    }

    public void x(int n) {
        this.z = n;
    }

    public void K(int n) {
        this.k = n;
        this.y = false;
    }

    public NumericComputationEngine1000 l(boolean bl) {
        this.i = bl;
        return this;
    }

    protected void A(CryptographicTransformer cryptographicTransformer) {
        this.P = cryptographicTransformer.b() - (cryptographicTransformer.b() - cryptographicTransformer.F()) * (double)ApplicationLifecycleManager.K().v();
        this.D = cryptographicTransformer.q() - (cryptographicTransformer.q() - cryptographicTransformer.V()) * (double)ApplicationLifecycleManager.K().v();
        this.a = cryptographicTransformer.I() - (cryptographicTransformer.I() - cryptographicTransformer.B()) * (double)ApplicationLifecycleManager.K().v();
    }

    protected void j(boolean bl) {
        block3: {
            block2: {
                try {
                    if (!bl) break block2;
                    this.s.e(true);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericComputationEngine1000.a(customSystemException);
                }
            }
            this.s.p();
        }
        j = bl;
    }

    public int t() {
        return this.p;
    }

    public void G() {
        try {
            ExecutionStateTracker executionStateTracker;
            block11: {
                if (j || !this.N()) {
                    return;
                }
                executionStateTracker = ApplicationLifecycleManager.N();
                try {
                    if (executionStateTracker.A() <= 0 && executionStateTracker.s()) break block11;
                }
                catch (Exception exception) {
                    throw NumericComputationEngine1000.a(exception);
                }
                return;
            }
            if (executionStateTracker.C() || executionStateTracker.C()) {
                return;
            }
            if (executionStateTracker.Y()) {
                return;
            }
            if (((ObjectLifecycleTracker)ApplicationLifecycleManager.g()).Y()) {
                return;
            }
            Object object = ApplicationLifecycleManager.g();
            Ec ec2 = ApplicationLifecycleManager.U();
            int n = ApplicationLifecycleManager.e();
            int n2 = ApplicationLifecycleManager.b();
            float f = ((CryptographicTransformer)object).q();
            float f2 = ((CryptographicTransformer)object).A();
            float f3 = ((CryptographicTransformer)object).S();
            float f4 = ((CryptographicTransformer)object).Q();
            boolean bl = executionStateTracker.n();
            int n3 = executionStateTracker.V();
            boolean bl2 = executionStateTracker.S();
            double d2 = ((CryptographicTransformer)object).F();
            double d3 = ((CryptographicTransformer)object).f();
            double d4 = ((CryptographicTransformer)object).b();
            double d5 = ((CryptographicTransformer)object).V();
            double d6 = ((CryptographicTransformer)object).l();
            double d7 = ((CryptographicTransformer)object).q();
            double d8 = ((CryptographicTransformer)object).B();
            double d9 = ((CryptographicTransformer)object).n();
            double d10 = ((CryptographicTransformer)object).I();
            float f5 = executionStateTracker.K();
            float f6 = ec2.P();
            float f7 = ec2.l();
            try {
                ((CryptographicTransformer)object).B(this.P);
                ((CryptographicTransformer)object).W(this.P);
                ((CryptographicTransformer)object).Z(this.P);
                ((CryptographicTransformer)object).Q(this.D);
                ((CryptographicTransformer)object).X(this.D);
                ((CryptographicTransformer)object).M(this.D);
                ((CryptographicTransformer)object).A(this.a);
                ((CryptographicTransformer)object).p(this.a);
                ((CryptographicTransformer)object).M(this.a);
                ApplicationLifecycleManager.U(this.p);
                ApplicationLifecycleManager.c(this.k);
                ((CryptographicTransformer)object).a(this.Z);
                ((CryptographicTransformer)object).z(this.Z);
                ((CryptographicTransformer)object).f(this.Q);
                ((CryptographicTransformer)object).G(this.Q);
                executionStateTracker.s(0);
                executionStateTracker.C(false);
                executionStateTracker.A(true);
                executionStateTracker.R(this.K);
                ec2.n(1.0f);
                ec2.m(1.0f);
                this.j(true);
                this.s.B();
                if (this.e.m(this.z)) {
                    ec2.R(ApplicationLifecycleManager.K().h(), 0L);
                    this.e.m();
                }
            }
            catch (Exception exception) {
                throw NumericComputationEngine1000.a(exception);
            }
            this.j(false);
            ApplicationLifecycleManager.U(n);
            ApplicationLifecycleManager.c(n2);
            ((CryptographicTransformer)object).a(f);
            ((CryptographicTransformer)object).z(f2);
            ((CryptographicTransformer)object).f(f3);
            ((CryptographicTransformer)object).G(f4);
            executionStateTracker.s(n3);
            executionStateTracker.A(bl);
            executionStateTracker.C(bl2);
            ((CryptographicTransformer)object).B(d2);
            ((CryptographicTransformer)object).W(d3);
            ((CryptographicTransformer)object).Z(d4);
            ((CryptographicTransformer)object).Q(d5);
            ((CryptographicTransformer)object).X(d6);
            ((CryptographicTransformer)object).G(d7);
            ((CryptographicTransformer)object).A(d8);
            ((CryptographicTransformer)object).p(d9);
            ((CryptographicTransformer)object).M(d10);
            executionStateTracker.R(f5);
            ec2.n(f6);
            ec2.m(f7);
            this.s.p();
            ApplicationLifecycleManager.y().e(true);
            this.y = true;
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public NumericComputationEngine1000(boolean bl, int n, int n2) {
        long l = b ^ 0x3A82410E25L;
        this.e = new NetworkConfigManager();
        this.z = (int)d;
        this.i = bl;
        this.p = n;
        this.k = n2;
        this.T();
    }

    public void T() {
        this.s = EventDispatchOrchestrator1391.t(this.p, this.k, true);
        this.u();
    }

    public static boolean n() {
        return j;
    }
}

