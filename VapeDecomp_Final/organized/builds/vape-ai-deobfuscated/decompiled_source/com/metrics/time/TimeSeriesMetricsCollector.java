/*
 * Decompiled with CFR 0.152.
 */
package com.metrics.time;

import com.data.contract.DataTransformationContract2366;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.reflection.utils.ReflectionUtilityManager680;

public class TimeSeriesMetricsCollector
implements DataTransformationContract2366 {
    private long L;
    private int W;

    public long B() {
        return this.L;
    }

    public TimeSeriesMetricsCollector(ReflectionUtilityManager680 reflectionUtilityManager680, int n) {
        this.L = reflectionUtilityManager680.r();
        this.W = n;
    }

    public int C() {
        return this.W;
    }

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.L = networkProtocolEncoder1013.S();
        this.W = networkProtocolEncoder1013.U();
    }

    public TimeSeriesMetricsCollector() {
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.Z(this.L);
        networkProtocolEncoder1013.e(this.W);
    }
}

