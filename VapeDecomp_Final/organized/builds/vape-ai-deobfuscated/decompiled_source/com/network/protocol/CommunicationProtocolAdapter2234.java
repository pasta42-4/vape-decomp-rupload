/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import com.app.core.interfaces.OperationExecutionInterface;
import com.integration.multimodal.MultimodalIntegrationFramework;
import com.security.communication.SecureChannelNegotiator481;
import com.temporal.metadata.TemporalMetadataResolver;

class CommunicationProtocolAdapter2234
implements OperationExecutionInterface {
    final MultimodalIntegrationFramework w;
    final SecureChannelNegotiator481 b;

    @Override
    public void R() {
        TemporalMetadataResolver.h.n();
        TemporalMetadataResolver.h.g().i(this.b);
        this.w.Y();
    }

    CommunicationProtocolAdapter2234(MultimodalIntegrationFramework multimodalIntegrationFramework, SecureChannelNegotiator481 secureChannelNegotiator481) {
        this.w = multimodalIntegrationFramework;
        this.b = secureChannelNegotiator481;
    }
}

