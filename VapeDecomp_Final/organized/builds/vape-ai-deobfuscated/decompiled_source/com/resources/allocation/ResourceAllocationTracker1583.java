/*
 * Decompiled with CFR 0.152.
 */
package com.resources.allocation;

import com.app.events.EventNotificationBroker2314;

public class ResourceAllocationTracker1583 {
    private final long I;
    private final Class<? extends EventNotificationBroker2314> u;
    private final int a;
    private final long h;

    public long u() {
        return this.I;
    }

    public Class<? extends EventNotificationBroker2314> e() {
        return this.u;
    }

    public long J() {
        return this.h;
    }

    public ResourceAllocationTracker1583(Class<? extends EventNotificationBroker2314> clazz, long l, long l2, int n) {
        this.u = clazz;
        this.h = l;
        this.I = l2;
        this.a = n;
    }

    public int X() {
        return this.a;
    }
}

