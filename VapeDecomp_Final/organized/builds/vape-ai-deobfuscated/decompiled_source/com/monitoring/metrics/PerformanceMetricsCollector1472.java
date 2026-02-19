/*
 * Decompiled with CFR 0.152.
 */
package com.monitoring.metrics;

import com.data.contract.DataTransformationContract2366;
import com.network.protocol.NetworkProtocolEncoder1013;

public class PerformanceMetricsCollector1472
implements DataTransformationContract2366 {
    private long A;
    private int z;
    private int s;
    private int n;

    public PerformanceMetricsCollector1472() {
    }

    public int s() {
        return this.s;
    }

    public long p() {
        return this.A;
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.Z(this.A);
        networkProtocolEncoder1013.I(this.n);
        networkProtocolEncoder1013.I(this.z);
        networkProtocolEncoder1013.I(this.s);
    }

    public int l() {
        return this.z;
    }

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.A = networkProtocolEncoder1013.S();
        this.n = networkProtocolEncoder1013.e();
        this.z = networkProtocolEncoder1013.e();
        this.s = networkProtocolEncoder1013.e();
    }

    public int o() {
        return this.n;
    }

    public PerformanceMetricsCollector1472(long l, int n, int n2, int n3) {
        this.A = l;
        this.n = n;
        this.z = n2;
        this.s = n3;
    }
}

