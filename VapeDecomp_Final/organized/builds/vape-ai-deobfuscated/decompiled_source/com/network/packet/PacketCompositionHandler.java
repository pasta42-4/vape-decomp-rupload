/*
 * Decompiled with CFR 0.152.
 */
package com.network.packet;

import com.data.compression.DataCompressionManager;
import com.system.lifecycle.ObjectLifecycleTracker;

public class PacketCompositionHandler
extends ObjectLifecycleTracker {
    public PacketCompositionHandler(Object object) {
        super(object);
    }

    public static DataCompressionManager w() {
        return new DataCompressionManager(PacketCompositionHandler.U.u().U.G());
    }
}

