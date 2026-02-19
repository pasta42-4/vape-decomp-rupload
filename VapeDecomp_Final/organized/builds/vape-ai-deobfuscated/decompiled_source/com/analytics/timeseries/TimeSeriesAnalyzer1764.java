/*
 * Decompiled with CFR 0.152.
 */
package com.analytics.timeseries;

import com.data.contract.DataTransformationContract2366;
import com.network.protocol.NetworkProtocolEncoder1013;

public class TimeSeriesAnalyzer1764
implements DataTransformationContract2366 {
    private long d;

    public long W() {
        return this.d;
    }

    public TimeSeriesAnalyzer1764() {
    }

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.d = networkProtocolEncoder1013.S();
    }

    public TimeSeriesAnalyzer1764(long l) {
        this.d = l;
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.Z(this.d);
    }
}

