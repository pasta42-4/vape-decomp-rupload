/*
 * Decompiled with CFR 0.152.
 */
package com.resource.allocation;

import com.analysis.metadata.MetadataExtractionEngine213;
import com.app.system.health.HealthJudge;
import com.network.protocol.CommunicationProtocolNegotiator1714;
import com.resource.management.MultiResourceOrchestrator;
import com.system.resource.ResourceAllocationTracker144;

public class ResourceAllocationStrategy2242
extends CommunicationProtocolNegotiator1714 {
    @Override
    public void r(MultiResourceOrchestrator multiResourceOrchestrator, ResourceAllocationTracker144 resourceAllocationTracker144) {
        this.R = new HealthJudge(MetadataExtractionEngine213.z(this.q), this.J);
        this.w.R(this.R);
        this.i = new HealthJudge(MetadataExtractionEngine213.R(this.q), this.J);
        this.Q.R(this.i);
    }

    public ResourceAllocationStrategy2242(int n, String string) {
        super(n);
        this.q = string;
    }
}

