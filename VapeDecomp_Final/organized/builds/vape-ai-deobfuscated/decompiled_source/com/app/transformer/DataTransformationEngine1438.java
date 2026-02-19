/*
 * Decompiled with CFR 0.152.
 */
package com.app.transformer;

import com.app.correlation.management.UuidCorrelationManager;
import com.math.conversion.NumericTransformationEngine1112;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.network.transmission.NetworkPacketQueue;

public class DataTransformationEngine1438
extends UuidCorrelationManager<NetworkPacketQueue> {
    private NumericTransformationEngine1112 s;
    private static int[] w;

    public DataTransformationEngine1438(NumericTransformationEngine1112 numericTransformationEngine1112) {
        this.s = numericTransformationEngine1112;
    }

    public DataTransformationEngine1438() {
    }

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.s.X(networkProtocolEncoder1013);
    }

    public static int[] q() {
        return w;
    }

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.s = new NumericTransformationEngine1112(networkProtocolEncoder1013);
    }

    public NumericTransformationEngine1112 J() {
        return this.s;
    }

    public static void U(int[] nArray) {
        w = nArray;
    }

    static {
        if (DataTransformationEngine1438.q() == null) {
            DataTransformationEngine1438.U(new int[4]);
        }
    }
}

