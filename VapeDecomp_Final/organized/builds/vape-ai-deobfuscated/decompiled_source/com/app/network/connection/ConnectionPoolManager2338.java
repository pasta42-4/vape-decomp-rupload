/*
 * Decompiled with CFR 0.152.
 */
package com.app.network.connection;

import com.event.management.ContextualEventDispatcher;
import com.security.transformation.CryptographicTransformer745;
import com.system.lifecycle.ObjectLifecycleTracker;

public class ConnectionPoolManager2338
extends ObjectLifecycleTracker {
    public ContextualEventDispatcher G() {
        return new ContextualEventDispatcher(CryptographicTransformer745.d(ConnectionPoolManager2338.U.u().Ld, this.H));
    }

    public ConnectionPoolManager2338(Object object) {
        super(object);
    }
}

