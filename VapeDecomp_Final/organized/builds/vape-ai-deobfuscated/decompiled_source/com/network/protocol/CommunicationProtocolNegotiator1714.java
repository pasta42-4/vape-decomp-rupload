/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import a._U;
import com.analysis.metadata.MetadataExtractionEngine213;
import com.app.system.health.HealthJudge;
import com.exception.system.CustomSystemException;
import com.localization.content.MultilingualContentDescriptor;
import com.resource.management.MultiResourceOrchestrator;
import com.system.resource.ResourceAllocationTracker144;

public class CommunicationProtocolNegotiator1714
extends _U {
    int J;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public CommunicationProtocolNegotiator1714(int n) {
        super("");
        this.J = n;
    }

    @Override
    public void r(MultiResourceOrchestrator multiResourceOrchestrator, ResourceAllocationTracker144 resourceAllocationTracker144) {
        int n = 0;
        for (MultilingualContentDescriptor multilingualContentDescriptor : resourceAllocationTracker144.B) {
            try {
                if (this.J == n) {
                    this.D = multilingualContentDescriptor;
                    this.R = new HealthJudge(MetadataExtractionEngine213.z(multilingualContentDescriptor.d), multilingualContentDescriptor.W);
                    this.w.R(this.R);
                    this.i = new HealthJudge(MetadataExtractionEngine213.R(multilingualContentDescriptor.d), multilingualContentDescriptor.W);
                    this.Q.R(this.i);
                    this.q = this.D.d;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CommunicationProtocolNegotiator1714.a(customSystemException);
            }
            ++n;
        }
    }
}

