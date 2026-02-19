/*
 * Decompiled with CFR 0.152.
 */
package com.event.management;

import com.app.correlation.management.UuidCorrelationManager;
import com.communication.modes.TransmissionModeEnum;
import com.core.computation.AbstractComputationKernel;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.network.protocol.NetworkProtocolMapper1327;

public class EventDispatchQueue
extends UuidCorrelationManager<NetworkProtocolMapper1327> {
    private static AbstractComputationKernel[] k;
    private TransmissionModeEnum h;

    public static void w(AbstractComputationKernel[] abstractComputationKernelArray) {
        k = abstractComputationKernelArray;
    }

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.N(this.h);
    }

    public static AbstractComputationKernel[] C() {
        return k;
    }

    static {
        if (EventDispatchQueue.C() != null) {
            EventDispatchQueue.w(new AbstractComputationKernel[3]);
        }
    }

    public EventDispatchQueue() {
    }

    public TransmissionModeEnum z() {
        return this.h;
    }

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.h = networkProtocolEncoder1013.L(TransmissionModeEnum.class);
    }

    public EventDispatchQueue(NetworkProtocolMapper1327 networkProtocolMapper1327, TransmissionModeEnum transmissionModeEnum) {
        super(networkProtocolMapper1327);
        this.h = transmissionModeEnum;
    }
}

