/*
 * Decompiled with CFR 0.152.
 */
package com.workflow.core;

import a.qd;
import com.network.connection.NetworkConnectionManager1945;
import com.system.lifecycle.ObjectLifecycleTracker;

public class WorkflowCoordinator
extends ObjectLifecycleTracker {
    public WorkflowCoordinator(Object object) {
        super(object);
    }

    public float[] c() {
        return qd.K(WorkflowCoordinator.U.u().kw, this.H);
    }

    public NetworkConnectionManager1945 I() {
        return new NetworkConnectionManager1945(qd.V(WorkflowCoordinator.U.u().kw, this.H));
    }

    public Object s() {
        return qd.Y(WorkflowCoordinator.U.u().kw, this.H);
    }

    public void O(int n) {
        qd.k(WorkflowCoordinator.U.u().kw, this.H, n);
    }

    public void f(float f) {
        qd.E(WorkflowCoordinator.U.u().kw, this.H, f);
    }

    public void M(float f) {
        qd.z(WorkflowCoordinator.U.u().kw, this.H, f);
    }

    public void O(float f) {
        qd.q(WorkflowCoordinator.U.u().kw, this.H, f);
    }

    public void v(int n) {
        qd.c(WorkflowCoordinator.U.u().kw, this.H, n);
    }

    public void S(float f) {
        qd.N(WorkflowCoordinator.U.u().kw, this.H, f);
    }
}

