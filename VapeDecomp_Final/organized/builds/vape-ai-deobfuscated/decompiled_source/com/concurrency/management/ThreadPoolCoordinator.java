/*
 * Decompiled with CFR 0.152.
 */
package com.concurrency.management;

import com.network.core.NetworkProtocolManager;
import com.runtime.reflection.ReflectionUtilityService;

public class ThreadPoolCoordinator
extends NetworkProtocolManager<ThreadPoolCoordinator, ReflectionUtilityService> {
    private int F = 0;

    public ThreadPoolCoordinator q(int n) {
        this.F = n;
        return this;
    }

    public int x() {
        return this.F;
    }

    public ReflectionUtilityService p() {
        return ReflectionUtilityService.p(this);
    }
}

