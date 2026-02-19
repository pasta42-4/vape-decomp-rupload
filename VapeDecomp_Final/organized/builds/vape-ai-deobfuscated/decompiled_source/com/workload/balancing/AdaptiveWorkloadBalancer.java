/*
 * Decompiled with CFR 0.152.
 */
package com.workload.balancing;

import a.v9;
import com.exception.system.CustomSystemException;
import com.system.lifecycle.ObjectLifecycleTracker;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class AdaptiveWorkloadBalancer
extends ObjectLifecycleTracker {
    public void M(boolean bl) {
        v9.A(AdaptiveWorkloadBalancer.U.u().LM, this.H, bl);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public int k(int n, boolean bl) {
        return v9.D(AdaptiveWorkloadBalancer.U.u().LM, this.H, n, bl);
    }

    public int U() {
        return v9.Z(AdaptiveWorkloadBalancer.U.u().LM, this.H);
    }

    public AdaptiveWorkloadBalancer(Object object) {
        super(object);
    }

    public void c(int n) {
        v9.V(AdaptiveWorkloadBalancer.U.u().LM, this.H, n);
    }

    public boolean T() {
        return v9.l(AdaptiveWorkloadBalancer.U.u().LM, this.H);
    }

    public boolean K() {
        return v9.y(AdaptiveWorkloadBalancer.U.u().LM, this.H);
    }

    public void g() {
        boolean bl;
        AdaptiveWorkloadBalancer adaptiveWorkloadBalancer;
        try {
            adaptiveWorkloadBalancer = this;
            bl = !this.T();
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveWorkloadBalancer.a(customSystemException);
        }
        adaptiveWorkloadBalancer.M(bl);
    }

    public void b(int n) {
        v9.c(AdaptiveWorkloadBalancer.U.u().LM, this.H, n);
    }

    public int z() {
        return v9.N(AdaptiveWorkloadBalancer.U.u().LM, this.H);
    }

    public int K() {
        return v9.M(AdaptiveWorkloadBalancer.U.u().LM, this.H);
    }

    public int x() {
        return v9.r(AdaptiveWorkloadBalancer.U.u().LM, this.H);
    }
}

