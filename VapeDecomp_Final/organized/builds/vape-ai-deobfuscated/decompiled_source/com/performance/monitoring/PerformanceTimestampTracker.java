/*
 * Decompiled with CFR 0.152.
 */
package com.performance.monitoring;

import com.data.contract.DataTransformationContract2366;
import com.network.protocol.NetworkProtocolEncoder1013;

public class PerformanceTimestampTracker
implements DataTransformationContract2366 {
    private long R;

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.R = networkProtocolEncoder1013.S();
    }

    public PerformanceTimestampTracker(long l) {
        this.R = l;
    }

    public long d() {
        return this.R;
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.Z(this.R);
    }

    public PerformanceTimestampTracker() {
    }
}

