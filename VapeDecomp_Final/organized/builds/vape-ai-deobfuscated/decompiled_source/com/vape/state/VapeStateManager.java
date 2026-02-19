/*
 * Decompiled with CFR 0.152.
 */
package com.vape.state;

import a.fH;
import com.data.protocol.DataProcessingProtocol;
import com.distributed.resource.DistributedResourceTracker;
import com.security.configuration.SecurityEnumRegistry;
import java.awt.Point;

class VapeStateManager
implements DataProcessingProtocol {
    final fH T;
    final DistributedResourceTracker v;

    VapeStateManager(DistributedResourceTracker distributedResourceTracker, fH fH2) {
        this.v = distributedResourceTracker;
        this.T = fH2;
    }

    @Override
    public void B(Point point, SecurityEnumRegistry securityEnumRegistry) {
        this.T.A();
    }
}

