/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Qh;
import com.core.computation.AbstractComputationKernel;
import com.network.protocol.CommunicationProtocolDefinition2159;
import com.network.protocol.NetworkProtocolNegotiator;
import com.system.configuration.SystemConfigurationOrchestrator;

public abstract class zx
implements CommunicationProtocolDefinition2159 {
    protected final Qh y;
    protected boolean A = false;
    protected boolean V = false;
    protected float l = 0.0f;
    protected final SystemConfigurationOrchestrator S;
    protected boolean U = false;
    protected int v = 0;
    protected final NetworkProtocolNegotiator o;
    protected boolean W = false;
    protected final Qh g;
    protected boolean d = false;
    private static AbstractComputationKernel[] s;
    protected boolean N = false;
    protected int G = 0;
    protected boolean n = false;
    protected boolean D = false;
    protected float x = 0.0f;
    protected boolean Y = false;

    public void J(boolean bl) {
        this.W = bl;
    }

    static {
        if (zx.q() == null) {
            zx.s(new AbstractComputationKernel[5]);
        }
    }

    public void b(boolean bl) {
        this.V = bl;
    }

    public boolean p() {
        return this.W;
    }

    public void t(boolean bl) {
        this.d = bl;
    }

    public void o(boolean bl) {
        this.N = bl;
    }

    public zx(Qh qh, SystemConfigurationOrchestrator systemConfigurationOrchestrator, Qh qh2, NetworkProtocolNegotiator networkProtocolNegotiator) {
        this.y = qh;
        this.S = systemConfigurationOrchestrator;
        this.g = qh2;
        this.o = networkProtocolNegotiator;
    }

    public void V(boolean bl) {
        this.n = bl;
    }

    public int c() {
        return this.G;
    }

    public boolean G() {
        return this.V;
    }

    public static void s(AbstractComputationKernel[] abstractComputationKernelArray) {
        s = abstractComputationKernelArray;
    }

    public boolean z() {
        return this.U;
    }

    public float L() {
        return this.l;
    }

    public boolean D() {
        return this.N;
    }

    public float Q() {
        return this.x;
    }

    public boolean Y() {
        return this.D;
    }

    public boolean R() {
        return this.A;
    }

    public static AbstractComputationKernel[] q() {
        return s;
    }

    public int N() {
        return this.v;
    }

    public boolean A() {
        return this.Y;
    }

    public void e(boolean bl) {
        this.A = bl;
    }

    public boolean K() {
        return this.n;
    }

    public void I(boolean bl) {
        this.U = bl;
    }

    public boolean l() {
        return this.d;
    }
}

