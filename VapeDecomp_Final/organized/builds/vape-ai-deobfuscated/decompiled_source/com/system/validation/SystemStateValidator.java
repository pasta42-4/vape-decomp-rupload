/*
 * Decompiled with CFR 0.152.
 */
package com.system.validation;

import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.core.computation.AbstractComputationKernel;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.database.query.QueryExecutionHandler;
import com.event.management.EventBroadcastCoordinator;
import com.exception.system.CustomSystemException;
import com.runtime.context.DynamicContextBroker;
import com.security.streaming.CryptoStreamProcessor;
import com.system.configuration.SystemConfigurationOrchestrator;
import java.util.ArrayList;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class SystemStateValidator {
    private boolean n = false;
    private static AbstractComputationKernel[] U;
    private ArrayList<ConnectionPoolOrchestrator1192> Z = new ArrayList();
    private double h = 0.2;
    double r;
    private boolean l = false;
    private boolean N = false;
    private boolean G = false;
    private boolean V = false;
    private boolean v = false;
    double t = 0.0;
    private boolean e = true;
    private boolean d;

    public double Y() {
        return this.t;
    }

    static {
        if (SystemStateValidator.Y() != null) {
            SystemStateValidator.U(new AbstractComputationKernel[4]);
        }
    }

    public boolean M() {
        return this.e;
    }

    public void c(boolean bl) {
        this.N = bl;
    }

    public void V(EventBroadcastCoordinator eventBroadcastCoordinator) {
        block15: {
            block17: {
                ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192;
                block18: {
                    block16: {
                        block14: {
                            try {
                                try {
                                    if (!eventBroadcastCoordinator.getThePlayer().Y() && !eventBroadcastCoordinator.getWorld().Y()) break block14;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw SystemStateValidator.a(customSystemException);
                                }
                                return;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SystemStateValidator.a(customSystemException);
                            }
                        }
                        try {
                            if (this.r == 0.0 && this.t == 0.0) break block15;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SystemStateValidator.a(customSystemException);
                        }
                        connectionPoolOrchestrator1192 = ApplicationLifecycleManager.N().f();
                        try {
                            try {
                                try {
                                    if (!this.N() || !(Math.abs(this.r) < 2.0)) break block16;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw SystemStateValidator.a(customSystemException);
                                }
                                if (!(Math.abs(this.t) < 2.0)) break block16;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SystemStateValidator.a(customSystemException);
                            }
                            CryptoStreamProcessor.d(connectionPoolOrchestrator1192, true);
                            break block17;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SystemStateValidator.a(customSystemException);
                        }
                    }
                    boolean bl = DynamicContextBroker.s(connectionPoolOrchestrator1192);
                    try {
                        if (!bl) break block18;
                        CryptoStreamProcessor.d(connectionPoolOrchestrator1192, true);
                        break block17;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SystemStateValidator.a(customSystemException);
                    }
                }
                CryptoStreamProcessor.d(connectionPoolOrchestrator1192, false);
            }
            CryptoStreamProcessor.B(this.r, this.t, this.Z, this.v);
        }
    }

    public void d(double d2) {
        this.h = d2;
    }

    public void j(boolean bl) {
        this.n = bl;
    }

    public void r(boolean bl) {
        this.v = bl;
    }

    public boolean a() {
        return this.v;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void s(boolean bl) {
        this.V = bl;
    }

    public void b(boolean bl) {
        this.e = bl;
    }

    public void g(boolean bl) {
        this.d = bl;
    }

    public abstract boolean C();

    public boolean B() {
        return this.n;
    }

    public boolean s() {
        return this.V;
    }

    public boolean H() {
        return this.N;
    }

    public ArrayList<ConnectionPoolOrchestrator1192> g() {
        return this.Z;
    }

    public static void U(AbstractComputationKernel[] abstractComputationKernelArray) {
        U = abstractComputationKernelArray;
    }

    public double I() {
        return this.h;
    }

    public double e() {
        return this.r;
    }

    public void Y() {
        block20: {
            boolean bl;
            SystemConfigurationOrchestrator systemConfigurationOrchestrator;
            block18: {
                try {
                    if (ApplicationLifecycleManager.X().r()) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw SystemStateValidator.a(customSystemException);
                }
                systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                try {
                    if (systemConfigurationOrchestrator.Y()) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw SystemStateValidator.a(customSystemException);
                }
                bl = this.C();
                try {
                    try {
                        if (this.G || !bl) break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SystemStateValidator.a(customSystemException);
                    }
                    this.G = true;
                }
                catch (CustomSystemException customSystemException) {
                    throw SystemStateValidator.a(customSystemException);
                }
            }
            try {
                block19: {
                    try {
                        try {
                            try {
                                if (bl) break block19;
                                if (!this.G) break block20;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SystemStateValidator.a(customSystemException);
                            }
                            if (!this.V) break block19;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SystemStateValidator.a(customSystemException);
                        }
                        if (!systemConfigurationOrchestrator.j()) break block20;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SystemStateValidator.a(customSystemException);
                    }
                }
                this.g(true);
            }
            catch (CustomSystemException customSystemException) {
                throw SystemStateValidator.a(customSystemException);
            }
        }
    }

    public boolean N() {
        return this.l;
    }

    public boolean S() {
        return this.d;
    }

    public static AbstractComputationKernel[] Y() {
        return U;
    }

    public void i(boolean bl) {
        this.l = bl;
    }

    public void s(ArrayList<ConnectionPoolOrchestrator1192> arrayList) {
        this.Z = arrayList;
    }

    public boolean F(long l) {
        int n = 0;
        while (!this.S()) {
            QueryExecutionHandler.q(10L);
            if ((long)(++n) <= l / 10L) continue;
            return true;
        }
        return false;
    }
}

