/*
 * Decompiled with CFR 0.152.
 */
package com.messaging.codec;

import com.app.correlation.management.UuidCorrelationManager;
import com.concurrency.management.ThreadSynchronizationController;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.reflection.utils.ReflectionUtilityManager680;

public class MessageEncoderHandler
extends UuidCorrelationManager<ThreadSynchronizationController> {
    private ReflectionUtilityManager680 E;

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.E = new ReflectionUtilityManager680(networkProtocolEncoder1013);
    }

    public MessageEncoderHandler(ReflectionUtilityManager680 reflectionUtilityManager680) {
        this.E = reflectionUtilityManager680;
    }

    public ReflectionUtilityManager680 a() {
        return this.E;
    }

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.E.o(networkProtocolEncoder1013);
    }

    public MessageEncoderHandler() {
    }
}

