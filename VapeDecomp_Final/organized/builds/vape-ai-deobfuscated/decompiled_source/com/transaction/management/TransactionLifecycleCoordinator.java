/*
 * Decompiled with CFR 0.152.
 */
package com.transaction.management;

import com.system.lifecycle.ObjectLifecycleTracker;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class TransactionLifecycleCoordinator
extends ObjectLifecycleTracker {
    public static TransactionLifecycleCoordinator i() {
        return new TransactionLifecycleCoordinator(TransactionLifecycleCoordinator.U.u().kA.D());
    }

    public static TransactionLifecycleCoordinator O() {
        return new TransactionLifecycleCoordinator(TransactionLifecycleCoordinator.U.u().kA.B());
    }

    public static int R() {
        return 1;
    }

    public static TransactionLifecycleCoordinator t() {
        return new TransactionLifecycleCoordinator(TransactionLifecycleCoordinator.U.u().kA.L());
    }

    public int Y() {
        return TransactionLifecycleCoordinator.U.u().kA.T(this.H);
    }

    public static TransactionLifecycleCoordinator s() {
        return new TransactionLifecycleCoordinator(TransactionLifecycleCoordinator.U.u().kA.F());
    }

    public TransactionLifecycleCoordinator(Object object) {
        super(object);
    }

    public static int G() {
        return 3;
    }

    public static TransactionLifecycleCoordinator l() {
        return new TransactionLifecycleCoordinator(TransactionLifecycleCoordinator.U.u().kA.H());
    }

    public static int u() {
        return 4;
    }

    public static int s() {
        return 2;
    }

    public static int y() {
        return 0;
    }
}

