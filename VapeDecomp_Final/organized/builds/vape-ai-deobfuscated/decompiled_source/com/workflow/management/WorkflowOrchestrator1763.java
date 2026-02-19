/*
 * Decompiled with CFR 0.152.
 */
package com.workflow.management;

import com.integration.core.SystemIntegrationMediator;
import com.network.connection.NetworkConnectionManager1945;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.workflow.core.WorkflowCoordinator;

public class WorkflowOrchestrator1763
extends ObjectLifecycleTracker {
    public NetworkConnectionManager1945 C() {
        return new NetworkConnectionManager1945(SystemIntegrationMediator.T(WorkflowOrchestrator1763.U.u().Y, this.H));
    }

    public WorkflowCoordinator y(NetworkConnectionManager1945 networkConnectionManager1945) {
        return new WorkflowCoordinator(SystemIntegrationMediator.J(WorkflowOrchestrator1763.U.u().Y, this.H, networkConnectionManager1945.M()));
    }

    public WorkflowOrchestrator1763(Object object) {
        super(object);
    }

    public static NetworkConnectionManager1945 S() {
        return new NetworkConnectionManager1945(SystemIntegrationMediator.p(WorkflowOrchestrator1763.U.u().Y));
    }
}

