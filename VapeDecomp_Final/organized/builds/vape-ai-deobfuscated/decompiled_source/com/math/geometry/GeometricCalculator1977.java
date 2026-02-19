/*
 * Decompiled with CFR 0.152.
 */
package com.math.geometry;

import com.network.protocol.NetworkProtocolEncoder1013;

public class GeometricCalculator1977 {
    private final double T;
    private final double V;
    private final double O;

    public double t() {
        return this.O;
    }

    public double q() {
        return this.V;
    }

    public double K() {
        return this.T;
    }

    public GeometricCalculator1977(double d2, double d3, double d4) {
        this.T = d2;
        this.O = d3;
        this.V = d4;
    }

    public void p(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.L(this.T);
        networkProtocolEncoder1013.L(this.O);
        networkProtocolEncoder1013.L(this.V);
    }

    GeometricCalculator1977(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.T = networkProtocolEncoder1013.U();
        this.O = networkProtocolEncoder1013.U();
        this.V = networkProtocolEncoder1013.U();
    }
}

