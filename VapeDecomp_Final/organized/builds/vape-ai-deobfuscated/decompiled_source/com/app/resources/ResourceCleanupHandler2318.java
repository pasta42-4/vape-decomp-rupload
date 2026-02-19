/*
 * Decompiled with CFR 0.152.
 */
package com.app.resources;

import com.concurrency.sync.AsyncResourceSynchronizer;
import com.network.session.CommunicationSessionController;
import com.system.lifecycle.ObjectLifecycleTracker;

public class ResourceCleanupHandler2318
extends ObjectLifecycleTracker {
    public ResourceCleanupHandler2318(Object object) {
        super(object);
    }

    public CommunicationSessionController E() {
        return new CommunicationSessionController(AsyncResourceSynchronizer.b(ResourceCleanupHandler2318.U.u().Lq, this.H));
    }
}

