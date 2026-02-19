/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.network.protocol;

import a.N;
import a.Qh;
import a.V3;
import a._Y;
import com.exception.system.CustomSystemException;
import com.financial.transaction.TransactionProcessor1409;
import com.graphics.color.ColorCompositionEngine;
import com.graphics.resources.GraphicalResourceManager;
import com.network.protocol.ProtocolInteractionController;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.DynamicContextBroker;
import com.runtime.context.LightweightExecutionContext;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.metrics.FloatMetricTracker;
import com.system.monitoring.RuntimeResourceTracker;
import com.system.state.BooleanStateContainer2257;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.management.TransactionOrchestrator1017;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class MultiProtocolContextManager {
    @Nullable
    private LightweightExecutionContext w;
    @Nullable
    private LightweightExecutionContext V;
    @Nullable
    private ColorCompositionEngine X;
    private final BooleanStateContainer2257 S;
    private final BooleanStateContainer2257 k;
    @Nullable
    private String v;
    private final BooleanStateContainer2257 t;
    @Nullable
    private String N;
    private TransactionOrchestrator1017 L;
    private final BooleanStateContainer2257 C = new BooleanStateContainer2257();
    private final BooleanStateContainer2257 J;
    private final BooleanStateContainer2257 O = new BooleanStateContainer2257();
    @Nullable
    private String m;
    private final FloatMetricTracker Z;
    private final BooleanStateContainer2257 M;
    private final FloatMetricTracker G;
    private List<V3> U;
    private final FloatMetricTracker K;
    private SystemConfigurationOrchestrator i;
    private final BooleanStateContainer2257 a;
    private static int[] q;
    private final FloatMetricTracker Q;
    @Nullable
    private final Qh P;
    private final BooleanStateContainer2257 o;
    private final int s;
    private final FloatMetricTracker Y;
    @Nullable
    private TransactionProcessor1409 R;

    public List<V3> z(TransactionOrchestrator1017 transactionOrchestrator1017) {
        if (this.U == null) {
            this.U = new ArrayList<V3>();
            for (Object e : transactionOrchestrator1017.A()) {
                V3 v3 = new V3(e);
                try {
                    if (v3.V() <= 0) continue;
                    this.U.add(v3);
                }
                catch (CustomSystemException customSystemException) {
                    throw MultiProtocolContextManager.a(customSystemException);
                }
            }
        }
        return this.U;
    }

    public double u() {
        try {
            if (!this.Z.s()) {
                this.Z.u(Float.valueOf(this.i.y(this.L)));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiProtocolContextManager.a(customSystemException);
        }
        return ((Float)this.Z.f()).floatValue();
    }

    public boolean K() {
        try {
            if (!this.t.s()) {
                this.t.u(_Y.X(this.L));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiProtocolContextManager.a(customSystemException);
        }
        return (Boolean)this.t.f();
    }

    public int w() {
        return this.s;
    }

    public String w() {
        block4: {
            try {
                try {
                    if (this.N != null || this.P == null) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw MultiProtocolContextManager.a(customSystemException);
                }
                this.N = TemporalMetadataResolver.h.U().K(GraphicalResourceManager.class).t(this.i, this, this.P);
            }
            catch (CustomSystemException customSystemException) {
                throw MultiProtocolContextManager.a(customSystemException);
            }
        }
        return this.N;
    }

    @Nullable
    public ColorCompositionEngine w(boolean bl) {
        try {
            if (this.X == null) {
                this.X = TemporalMetadataResolver.h.a().L(this.g(), this.B(), bl);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiProtocolContextManager.a(customSystemException);
        }
        return this.X;
    }

    public float C() {
        block4: {
            block5: {
                try {
                    try {
                        if (this.Q.s()) break block4;
                        if (this.P == null) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MultiProtocolContextManager.a(customSystemException);
                    }
                    this.Q.u(Float.valueOf(a.N.J.l(this.P)));
                    break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw MultiProtocolContextManager.a(customSystemException);
                }
            }
            this.Q.u(Float.valueOf(this.L.e()));
        }
        return ((Float)this.Q.f()).floatValue();
    }

    public float v() {
        try {
            if (!this.K.s()) {
                this.K.u(Float.valueOf(this.L.L()));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiProtocolContextManager.a(customSystemException);
        }
        return ((Float)this.K.f()).floatValue();
    }

    @Nullable
    public LightweightExecutionContext Z() {
        block10: {
            try {
                if (this.w != null || this.P == null) break block10;
            }
            catch (CustomSystemException customSystemException) {
                throw MultiProtocolContextManager.a(customSystemException);
            }
            LightweightExecutionContext lightweightExecutionContext = this.O();
            try {
                if (lightweightExecutionContext == null || !lightweightExecutionContext.r()) break block10;
            }
            catch (CustomSystemException customSystemException) {
                throw MultiProtocolContextManager.a(customSystemException);
            }
            ProtocolInteractionController protocolInteractionController = this.O().C();
            try {
                if (!RuntimeResourceTracker.a(protocolInteractionController) && !RuntimeResourceTracker.t(protocolInteractionController)) break block10;
            }
            catch (CustomSystemException customSystemException) {
                throw MultiProtocolContextManager.a(customSystemException);
            }
            LightweightExecutionContext lightweightExecutionContext2 = this.w;
            try {
                try {
                    if (lightweightExecutionContext2 != null && !(RuntimeResourceTracker.g(lightweightExecutionContext) > RuntimeResourceTracker.g(lightweightExecutionContext2))) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw MultiProtocolContextManager.a(customSystemException);
                }
                this.w = lightweightExecutionContext;
            }
            catch (CustomSystemException customSystemException) {
                throw MultiProtocolContextManager.a(customSystemException);
            }
        }
        return this.w;
    }

    public float n() {
        try {
            if (!this.Y.s()) {
                this.Y.u(Float.valueOf(this.L.K()));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiProtocolContextManager.a(customSystemException);
        }
        return ((Float)this.Y.f()).floatValue();
    }

    public static int[] Y() {
        return q;
    }

    static {
        if (MultiProtocolContextManager.Y() != null) {
            MultiProtocolContextManager.I(new int[5]);
        }
    }

    public boolean h() {
        try {
            if (!this.S.s()) {
                this.S.u(this.L.H());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiProtocolContextManager.a(customSystemException);
        }
        return (Boolean)this.S.f();
    }

    public static void I(int[] nArray) {
        q = nArray;
    }

    public boolean E() {
        block4: {
            block5: {
                try {
                    try {
                        if (this.o.s()) break block4;
                        if (this.P == null) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MultiProtocolContextManager.a(customSystemException);
                    }
                    this.o.u(TemporalMetadataResolver.h.g().Q(this.g()));
                    break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw MultiProtocolContextManager.a(customSystemException);
                }
            }
            this.o.u(false);
        }
        return (Boolean)this.o.f();
    }

    public TransactionProcessor1409 A() {
        block4: {
            try {
                try {
                    if (this.R != null || this.P == null) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw MultiProtocolContextManager.a(customSystemException);
                }
                this.R = this.P.M();
            }
            catch (CustomSystemException customSystemException) {
                throw MultiProtocolContextManager.a(customSystemException);
            }
        }
        return this.R;
    }

    public boolean m() {
        try {
            if (!this.C.s()) {
                this.C.u(DynamicContextBroker.s(this.s));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiProtocolContextManager.a(customSystemException);
        }
        return (Boolean)this.C.f();
    }

    public float G() {
        try {
            if (!this.G.s()) {
                this.G.u(Float.valueOf(this.L.H()));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiProtocolContextManager.a(customSystemException);
        }
        return ((Float)this.G.f()).floatValue();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public boolean T() {
        block4: {
            block5: {
                try {
                    try {
                        if (this.M.s()) break block4;
                        if (this.P == null) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MultiProtocolContextManager.a(customSystemException);
                    }
                    this.M.u(TemporalMetadataResolver.h.a().H(this.i, this.L));
                    break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw MultiProtocolContextManager.a(customSystemException);
                }
            }
            this.M.u(false);
        }
        return (Boolean)this.M.f();
    }

    public boolean I() {
        try {
            if (!this.O.s()) {
                this.O.u(TemporalMetadataResolver.h.a().P(this.L));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiProtocolContextManager.a(customSystemException);
        }
        return (Boolean)this.O.f();
    }

    public boolean G() {
        try {
            if (!this.J.s()) {
                this.J.u(this.i.X(this.L));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiProtocolContextManager.a(customSystemException);
        }
        return (Boolean)this.J.f();
    }

    public MultiProtocolContextManager(int n, TransactionOrchestrator1017 transactionOrchestrator1017, SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        this.J = new BooleanStateContainer2257();
        this.a = new BooleanStateContainer2257();
        this.t = new BooleanStateContainer2257();
        this.S = new BooleanStateContainer2257();
        this.M = new BooleanStateContainer2257();
        this.k = new BooleanStateContainer2257();
        this.o = new BooleanStateContainer2257();
        this.Q = new FloatMetricTracker();
        this.Y = new FloatMetricTracker();
        this.G = new FloatMetricTracker();
        this.Z = new FloatMetricTracker();
        this.K = new FloatMetricTracker();
        this.s = n;
        this.L = transactionOrchestrator1017;
        this.i = systemConfigurationOrchestrator;
        boolean bl = transactionOrchestrator1017.B(ReflectionMetadataResolver.UQ);
        try {
            this.P = bl ? new Qh(transactionOrchestrator1017) : null;
        }
        catch (CustomSystemException customSystemException) {
            throw MultiProtocolContextManager.a(customSystemException);
        }
    }

    @Nullable
    public LightweightExecutionContext O() {
        if (this.V == null) {
            LightweightExecutionContext lightweightExecutionContext;
            LightweightExecutionContext lightweightExecutionContext2 = this.L.a();
            try {
                MultiProtocolContextManager multiProtocolContextManager = this;
                lightweightExecutionContext = lightweightExecutionContext2.r() ? lightweightExecutionContext2 : null;
            }
            catch (CustomSystemException customSystemException) {
                throw MultiProtocolContextManager.a(customSystemException);
            }
            multiProtocolContextManager.V = lightweightExecutionContext;
        }
        return this.V;
    }

    public void v(TransactionOrchestrator1017 transactionOrchestrator1017, SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        this.L = transactionOrchestrator1017;
        this.i = systemConfigurationOrchestrator;
        this.C.j();
        this.O.j();
        this.J.j();
        this.a.j();
        this.t.j();
        this.S.j();
        this.M.j();
        this.k.j();
        this.o.j();
        this.Q.j();
        this.Y.j();
        this.G.j();
        this.Z.j();
        this.K.j();
        this.v = null;
        this.m = null;
        this.V = null;
        this.w = null;
        this.N = null;
        this.X = null;
        this.R = null;
        this.U = null;
    }

    public String g() {
        try {
            if (this.v == null) {
                this.v = this.L.e();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiProtocolContextManager.a(customSystemException);
        }
        return this.v;
    }

    public boolean H() {
        try {
            if (!this.a.s()) {
                this.a.u(this.L.R());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiProtocolContextManager.a(customSystemException);
        }
        return (Boolean)this.a.f();
    }

    public boolean Y() {
        block4: {
            block5: {
                try {
                    try {
                        if (this.k.s()) break block4;
                        if (this.P == null) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MultiProtocolContextManager.a(customSystemException);
                    }
                    this.k.u(TemporalMetadataResolver.h.j().Q(this.g()));
                    break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw MultiProtocolContextManager.a(customSystemException);
                }
            }
            this.k.u(false);
        }
        return (Boolean)this.k.f();
    }

    public String B() {
        try {
            if (this.m == null) {
                this.m = this.L.G().i();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiProtocolContextManager.a(customSystemException);
        }
        return this.m;
    }
}

