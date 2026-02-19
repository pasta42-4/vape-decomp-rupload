/*
 * Decompiled with CFR 0.152.
 */
package com.system.monitoring;

import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.event.management.EventDispatchCoordinator1883;
import com.exception.system.CustomSystemException;
import com.mapping.resolution.DynamicMappingResolver;
import com.math.geometry.GeometryCalculator;
import com.network.connection.ConnectionLifecycleManager2010;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.management.TransactionCoordinator2120;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ExecutionStateTracker
extends ObjectLifecycleTracker {
    private static boolean d;

    public int A() {
        return TransactionCoordinator2120.o();
    }

    public ConnectionPoolOrchestrator1192 h() {
        return new ConnectionPoolOrchestrator1192(DynamicMappingResolver.L(ExecutionStateTracker.U.u().Z, this.M()));
    }

    static {
        if (!ExecutionStateTracker.T()) {
            ExecutionStateTracker.W(true);
        }
    }

    public boolean s() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ExecutionStateTracker.a(customSystemException);
        }
        return DynamicMappingResolver.T(ExecutionStateTracker.U.u().Z, this.H);
    }

    public void A(boolean bl) {
        DynamicMappingResolver.Z(ExecutionStateTracker.U.u().Z, this.H, bl);
    }

    public ConnectionPoolOrchestrator1192 s() {
        return new ConnectionPoolOrchestrator1192(DynamicMappingResolver.J(ExecutionStateTracker.U.u().Z, this.M()));
    }

    public ConnectionPoolOrchestrator1192 K() {
        return new ConnectionPoolOrchestrator1192(DynamicMappingResolver.g(ExecutionStateTracker.U.u().Z, this.H));
    }

    public float W() {
        if (GeometryCalculator.C() >= 50) {
            EventDispatchCoordinator1883 eventDispatchCoordinator1883 = new EventDispatchCoordinator1883(DynamicMappingResolver.k(ExecutionStateTracker.U.u().Z, this.H));
            return (float)((Double)eventDispatchCoordinator1883.C()).doubleValue();
        }
        return DynamicMappingResolver.B(ExecutionStateTracker.U.u().Z, this.H);
    }

    public float Q() {
        if (GeometryCalculator.C() >= 50) {
            EventDispatchCoordinator1883 eventDispatchCoordinator1883 = new EventDispatchCoordinator1883(DynamicMappingResolver.K(ExecutionStateTracker.U.u().Z, this.H));
            return (float)((Double)eventDispatchCoordinator1883.C()).doubleValue();
        }
        return DynamicMappingResolver.Z(ExecutionStateTracker.U.u().Z, this.H);
    }

    public ExecutionStateTracker(Object object) {
        super(object);
    }

    public static boolean T() {
        return d;
    }

    public int p() {
        if (GeometryCalculator.C() >= 50) {
            EventDispatchCoordinator1883 eventDispatchCoordinator1883 = new EventDispatchCoordinator1883(DynamicMappingResolver.M(ExecutionStateTracker.U.u().Z, this.M()));
            return (Integer)eventDispatchCoordinator1883.C();
        }
        return DynamicMappingResolver.U(ExecutionStateTracker.U.u().Z, this.M());
    }

    public boolean C() {
        return DynamicMappingResolver.o(ExecutionStateTracker.U.u().Z, this.H);
    }

    public ConnectionPoolOrchestrator1192 r() {
        return new ConnectionPoolOrchestrator1192(DynamicMappingResolver.W(ExecutionStateTracker.U.u().Z, this.M()));
    }

    public void e(boolean bl) {
        DynamicMappingResolver.U(ExecutionStateTracker.U.u().Z, this.H, bl);
    }

    public ConnectionPoolOrchestrator1192 w() {
        return new ConnectionPoolOrchestrator1192(DynamicMappingResolver.Q(ExecutionStateTracker.U.u().Z, this.M()));
    }

    public void v(boolean bl) {
        DynamicMappingResolver.z(ExecutionStateTracker.U.u().Z, this.H, bl);
    }

    public ConnectionPoolOrchestrator1192 N() {
        return new ConnectionPoolOrchestrator1192(DynamicMappingResolver.n(ExecutionStateTracker.U.u().Z, this.H));
    }

    public static void W(boolean bl) {
        d = bl;
    }

    public float D() {
        if (GeometryCalculator.C() >= 50) {
            EventDispatchCoordinator1883 eventDispatchCoordinator1883 = new EventDispatchCoordinator1883(DynamicMappingResolver.T(ExecutionStateTracker.U.u().Z, this.H));
            return (float)((Double)eventDispatchCoordinator1883.C()).doubleValue();
        }
        return DynamicMappingResolver.u(ExecutionStateTracker.U.u().Z, this.H);
    }

    public ConnectionPoolOrchestrator1192 e() {
        return new ConnectionPoolOrchestrator1192(DynamicMappingResolver.f(ExecutionStateTracker.U.u().Z, this.M()));
    }

    public void C(boolean bl) {
        if (GeometryCalculator.C() >= 50) {
            EventDispatchCoordinator1883 eventDispatchCoordinator1883 = new EventDispatchCoordinator1883(DynamicMappingResolver.b(ExecutionStateTracker.U.u().Z, this.H));
            eventDispatchCoordinator1883.z(bl);
            return;
        }
        DynamicMappingResolver.f(ExecutionStateTracker.U.u().Z, this.H, bl);
    }

    public boolean S() {
        if (GeometryCalculator.C() >= 50) {
            EventDispatchCoordinator1883 eventDispatchCoordinator1883 = new EventDispatchCoordinator1883(DynamicMappingResolver.b(ExecutionStateTracker.U.u().Z, this.H));
            return (Boolean)eventDispatchCoordinator1883.C();
        }
        return DynamicMappingResolver.E(ExecutionStateTracker.U.u().Z, this.H);
    }

    public ConnectionPoolOrchestrator1192 f() {
        return new ConnectionPoolOrchestrator1192(DynamicMappingResolver.G(ExecutionStateTracker.U.u().Z, this.M()));
    }

    public float K() {
        return DynamicMappingResolver.O(ExecutionStateTracker.U.u().Z, this.H);
    }

    public ConnectionPoolOrchestrator1192 G() {
        return new ConnectionPoolOrchestrator1192(DynamicMappingResolver.h(TemporalMetadataResolver.h.u().Z, this.M()));
    }

    public ConnectionPoolOrchestrator1192 y() {
        return new ConnectionPoolOrchestrator1192(DynamicMappingResolver.C(ExecutionStateTracker.U.u().Z, this.M()));
    }

    public ConnectionPoolOrchestrator1192 D() {
        return new ConnectionPoolOrchestrator1192(DynamicMappingResolver.j(TemporalMetadataResolver.h.u().Z, this.M()));
    }

    public boolean n() {
        return DynamicMappingResolver.U(ExecutionStateTracker.U.u().Z, this.H);
    }

    public void L(float f) {
        if (GeometryCalculator.C() >= 50) {
            EventDispatchCoordinator1883 eventDispatchCoordinator1883 = new EventDispatchCoordinator1883(DynamicMappingResolver.T(ExecutionStateTracker.U.u().Z, this.H));
            eventDispatchCoordinator1883.k(f);
            return;
        }
        DynamicMappingResolver.t(ExecutionStateTracker.U.u().Z, this.H, f);
    }

    public void n(int n) {
        if (GeometryCalculator.C() >= 50) {
            EventDispatchCoordinator1883 eventDispatchCoordinator1883 = new EventDispatchCoordinator1883(DynamicMappingResolver.M(ExecutionStateTracker.U.u().Z, this.M()));
            eventDispatchCoordinator1883.z(n);
            return;
        }
        DynamicMappingResolver.p(ExecutionStateTracker.U.u().Z, this.H, n);
    }

    public void s(int n) {
        if (GeometryCalculator.C() >= 35) {
            ConnectionLifecycleManager2010 connectionLifecycleManager2010 = ConnectionLifecycleManager2010.S()[n];
            DynamicMappingResolver.V(ExecutionStateTracker.U.u().Z, this.H, connectionLifecycleManager2010.M());
            return;
        }
        DynamicMappingResolver.b(ExecutionStateTracker.U.u().Z, this.H, n);
    }

    public int e() {
        if (GeometryCalculator.C() >= 50) {
            EventDispatchCoordinator1883 eventDispatchCoordinator1883 = new EventDispatchCoordinator1883(DynamicMappingResolver.o(ExecutionStateTracker.U.u().Z, this.H));
            return (Integer)eventDispatchCoordinator1883.C();
        }
        return DynamicMappingResolver.G(ExecutionStateTracker.U.u().Z, this.H);
    }

    public int V() {
        if (GeometryCalculator.C() >= 35) {
            Object object = DynamicMappingResolver.U(ExecutionStateTracker.U.u().Z, this.H);
            int n = 0;
            for (ConnectionLifecycleManager2010 connectionLifecycleManager2010 : ConnectionLifecycleManager2010.S()) {
                try {
                    if (connectionLifecycleManager2010.M() == object) {
                        return n;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ExecutionStateTracker.a(customSystemException);
                }
                ++n;
            }
            return 0;
        }
        return DynamicMappingResolver.T(ExecutionStateTracker.U.u().Z, this.H);
    }

    public ConnectionPoolOrchestrator1192 R() {
        return new ConnectionPoolOrchestrator1192(DynamicMappingResolver.r(ExecutionStateTracker.U.u().Z, this.M()));
    }

    public void R(float f) {
        DynamicMappingResolver.W(ExecutionStateTracker.U.u().Z, this.H, f);
    }

    public static boolean A() {
        boolean bl = ExecutionStateTracker.T();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ExecutionStateTracker.a(customSystemException);
        }
        return false;
    }

    public boolean U() {
        return DynamicMappingResolver.d(ExecutionStateTracker.U.u().Z, this.H);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

