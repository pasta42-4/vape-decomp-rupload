/*
 * Decompiled with CFR 0.152.
 */
package com.data.streaming;

import com.data.contract.DataTransformationContract2366;
import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.workflow.coordination.WorkflowOrchestrator1642;

public class DataStreamOrchestrator1513
implements DataTransformationContract2366 {
    private WorkflowOrchestrator1642[] F;
    private long[] L;

    public long[] i() {
        return this.L;
    }

    public WorkflowOrchestrator1642[] o() {
        return this.F;
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.e(this.L.length);
        try {
            for (int i = 0; i < this.L.length; ++i) {
                networkProtocolEncoder1013.Z(this.L[i]);
                this.F[i].r(networkProtocolEncoder1013);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataStreamOrchestrator1513.a(customSystemException);
        }
    }

    public DataStreamOrchestrator1513() {
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        int n = networkProtocolEncoder1013.U();
        this.L = new long[n];
        this.F = new WorkflowOrchestrator1642[n];
        try {
            for (int i = 0; i < n; ++i) {
                this.L[i] = networkProtocolEncoder1013.S();
                this.F[i] = new WorkflowOrchestrator1642(networkProtocolEncoder1013);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataStreamOrchestrator1513.a(customSystemException);
        }
    }

    public DataStreamOrchestrator1513(long[] lArray, WorkflowOrchestrator1642[] workflowOrchestrator1642Array) {
        this.L = lArray;
        this.F = workflowOrchestrator1642Array;
    }
}

