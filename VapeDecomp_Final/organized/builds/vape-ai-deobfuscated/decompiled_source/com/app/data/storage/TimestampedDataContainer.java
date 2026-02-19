/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.app.data.storage;

import com.app.correlation.management.UuidCorrelationManager;
import com.compression.strategy.CompressionMethod;
import com.data.versioning.DataVersionController;
import com.network.protocol.NetworkProtocolEncoder1013;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TimestampedDataContainer
extends UuidCorrelationManager<DataVersionController> {
    private CompressionMethod q;
    private long Q;
    @Nullable
    private String B;

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.q = networkProtocolEncoder1013.L(CompressionMethod.class);
        this.B = networkProtocolEncoder1013.b(255);
        this.Q = networkProtocolEncoder1013.S();
    }

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.N(this.q);
        networkProtocolEncoder1013.J(this.B);
        networkProtocolEncoder1013.Z(this.Q);
    }

    public CompressionMethod C() {
        return this.q;
    }

    public TimestampedDataContainer(@Nullable DataVersionController dataVersionController, CompressionMethod compressionMethod) {
        super(dataVersionController);
        this.q = compressionMethod;
    }

    public TimestampedDataContainer(@Nullable DataVersionController dataVersionController, @NotNull String string) {
        this(dataVersionController, CompressionMethod.SUCCESS);
        this.B = string;
        this.Q = System.currentTimeMillis();
    }

    public long y() {
        return this.Q;
    }

    public TimestampedDataContainer() {
    }

    @Nullable
    public String B() {
        return this.B;
    }
}

