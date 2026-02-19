/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.concurrency.management;

import com.app.correlation.management.UuidCorrelationManager;
import com.messaging.codec.MessageEncoderHandler;
import com.network.protocol.NetworkProtocolEncoder1013;
import org.jetbrains.annotations.Nullable;

public class ThreadSynchronizationController
extends UuidCorrelationManager<MessageEncoderHandler> {
    private boolean x;

    public ThreadSynchronizationController(@Nullable MessageEncoderHandler messageEncoderHandler, boolean bl) {
        super(messageEncoderHandler);
        this.x = bl;
    }

    public boolean T() {
        return this.x;
    }

    public ThreadSynchronizationController() {
    }

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.W(this.x);
    }

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.x = networkProtocolEncoder1013.B();
    }
}

