/*
 * Decompiled with CFR 0.152.
 */
package com.app.resources;

import com.network.connection.NetworkConnectionManager1945;
import com.security.token.CryptographicTokenGenerator956;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.workflow.core.WorkflowCoordinator;

public class ResourceAllocationHandler
extends ObjectLifecycleTracker {
    public ResourceAllocationHandler(Object object) {
        super(object);
    }

    public WorkflowCoordinator Z(NetworkConnectionManager1945 networkConnectionManager1945) {
        return new WorkflowCoordinator(CryptographicTokenGenerator956.T(ResourceAllocationHandler.U.u().dF, this.H, networkConnectionManager1945.M()));
    }
}

