/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.network.transmission;

import com.app.correlation.management.UuidCorrelationManager;
import com.app.transformer.DataTransformationEngine1438;
import com.network.protocol.NetworkProtocolEncoder1013;
import org.jetbrains.annotations.Nullable;

public class NetworkPacketQueue
extends UuidCorrelationManager<DataTransformationEngine1438> {
    private int B;
    private long u;
    private boolean C;

    public NetworkPacketQueue(@Nullable DataTransformationEngine1438 dataTransformationEngine1438, boolean bl, int n, long l) {
        super(dataTransformationEngine1438);
        this.C = bl;
        this.B = n;
        this.u = l;
    }

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.C = networkProtocolEncoder1013.B();
        this.B = networkProtocolEncoder1013.U();
        this.u = networkProtocolEncoder1013.S();
    }

    public long D() {
        return this.u;
    }

    public NetworkPacketQueue() {
    }

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.W(this.C);
        networkProtocolEncoder1013.e(this.B);
        networkProtocolEncoder1013.Z(this.u);
    }

    public int c() {
        return this.B;
    }

    public boolean C() {
        return this.C;
    }
}

