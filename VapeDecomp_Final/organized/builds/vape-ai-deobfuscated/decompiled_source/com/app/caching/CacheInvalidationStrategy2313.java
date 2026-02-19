/*
 * Decompiled with CFR 0.152.
 */
package com.app.caching;

import com.network.connection.NetworkConnectionManager1945;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.workflow.management.WorkflowOrchestrator1763;

public class CacheInvalidationStrategy2313
extends ObjectLifecycleTracker {
    public WorkflowOrchestrator1763 P(NetworkConnectionManager1945 networkConnectionManager1945) {
        return new WorkflowOrchestrator1763(CacheInvalidationStrategy2313.U.u().Lz.j(this.H, networkConnectionManager1945.M()));
    }

    public CacheInvalidationStrategy2313(Object object) {
        super(object);
    }
}

