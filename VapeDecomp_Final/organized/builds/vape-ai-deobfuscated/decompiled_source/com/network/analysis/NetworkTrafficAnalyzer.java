/*
 * Decompiled with CFR 0.152.
 */
package com.network.analysis;

import com.resource.allocation.CompositeResourceAllocator;
import com.system.lifecycle.ObjectLifecycleTracker;

public class NetworkTrafficAnalyzer
extends ObjectLifecycleTracker {
    public static NetworkTrafficAnalyzer G() {
        return new NetworkTrafficAnalyzer(CompositeResourceAllocator.r(NetworkTrafficAnalyzer.U.u().k4));
    }

    public static NetworkTrafficAnalyzer L() {
        return new NetworkTrafficAnalyzer(CompositeResourceAllocator.e(NetworkTrafficAnalyzer.U.u().k4));
    }

    public static NetworkTrafficAnalyzer f() {
        return new NetworkTrafficAnalyzer(CompositeResourceAllocator.g(NetworkTrafficAnalyzer.U.u().k4));
    }

    public NetworkTrafficAnalyzer(Object object) {
        super(object);
    }
}

