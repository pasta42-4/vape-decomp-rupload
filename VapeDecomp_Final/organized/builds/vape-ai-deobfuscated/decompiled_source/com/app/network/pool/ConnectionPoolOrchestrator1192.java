/*
 * Decompiled with CFR 0.152.
 */
package com.app.network.pool;

import com.concurrency.synchronization.ThreadSynchronizationManager;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.runtime.context.DynamicContextBroker;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.temporal.metadata.TemporalMetadataResolver;

public class ConnectionPoolOrchestrator1192
extends ObjectLifecycleTracker {
    public void X(int n) {
        ConnectionPoolOrchestrator1192.U.u().G1.J(this.H, n);
    }

    public void p(boolean bl) {
        block3: {
            block2: {
                try {
                    if (!bl) break block2;
                    this.L();
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConnectionPoolOrchestrator1192.a(customSystemException);
                }
            }
            this.B();
        }
    }

    public int t() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return this.U().r();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConnectionPoolOrchestrator1192.a(customSystemException);
        }
        return ConnectionPoolOrchestrator1192.U.u().G1.P(this.H);
    }

    public boolean b() {
        return ConnectionPoolOrchestrator1192.U.u().G1.W(this.H);
    }

    public int K() {
        return ConnectionPoolOrchestrator1192.U.u().G1.e(this.H);
    }

    public void Z(boolean bl) {
        ConnectionPoolOrchestrator1192.U.u().G1.i(this.H, bl);
    }

    public static void d(ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192, boolean bl) {
        try {
            if (GeometryCalculator.C() >= 35) {
                ConnectionPoolOrchestrator1192.U.u().G1.V(connectionPoolOrchestrator1192.U().M(), bl);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConnectionPoolOrchestrator1192.a(customSystemException);
        }
        ConnectionPoolOrchestrator1192.U.u().G1.z(connectionPoolOrchestrator1192.t(), bl);
    }

    public static void o() {
        TemporalMetadataResolver.h.u().G1.w();
    }

    private ThreadSynchronizationManager U() {
        return new ThreadSynchronizationManager(ConnectionPoolOrchestrator1192.U.u().G1.b(this.H));
    }

    public static void m(ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192) {
        try {
            if (GeometryCalculator.C() >= 35) {
                ConnectionPoolOrchestrator1192.U.u().G1.y(connectionPoolOrchestrator1192.U().M());
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConnectionPoolOrchestrator1192.a(customSystemException);
        }
        ConnectionPoolOrchestrator1192.U.u().G1.i(connectionPoolOrchestrator1192.t());
    }

    public void B() {
        this.X(0);
        ConnectionPoolOrchestrator1192.d(this, false);
    }

    public void L() {
        ConnectionPoolOrchestrator1192.d(this, true);
        ConnectionPoolOrchestrator1192.m(this);
    }

    public ConnectionPoolOrchestrator1192(Object object) {
        super(object);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public boolean k() {
        return ConnectionPoolOrchestrator1192.U.u().G1.p(this.H);
    }

    public void e() {
        boolean bl;
        boolean bl2 = DynamicContextBroker.s(this);
        try {
            bl = this.X() != bl2;
        }
        catch (CustomSystemException customSystemException) {
            throw ConnectionPoolOrchestrator1192.a(customSystemException);
        }
        boolean bl3 = bl;
        try {
            if (bl3) {
                this.p(bl2);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConnectionPoolOrchestrator1192.a(customSystemException);
        }
    }

    public boolean X() {
        return ConnectionPoolOrchestrator1192.U.u().G1.J(this.H);
    }
}

