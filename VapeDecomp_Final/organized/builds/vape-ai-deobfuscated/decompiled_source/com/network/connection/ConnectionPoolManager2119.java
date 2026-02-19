/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import com.resource.management.ResourceAllocationController556;
import com.system.lifecycle.ObjectLifecycleTracker;

public class ConnectionPoolManager2119
extends ObjectLifecycleTracker {
    public ConnectionPoolManager2119(Object object) {
        super(object);
    }

    public static ConnectionPoolManager2119 G() {
        return new ConnectionPoolManager2119(ResourceAllocationController556.b(ConnectionPoolManager2119.U.u().kh));
    }

    public static ConnectionPoolManager2119 t() {
        return new ConnectionPoolManager2119(ResourceAllocationController556.y(ConnectionPoolManager2119.U.u().kh));
    }
}

