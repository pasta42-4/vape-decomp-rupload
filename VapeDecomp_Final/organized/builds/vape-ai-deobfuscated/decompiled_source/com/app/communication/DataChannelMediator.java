/*
 * Decompiled with CFR 0.152.
 */
package com.app.communication;

import com.data.streaming.StreamProcessor1861;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.network.connection.NetworkConnectionManager1945;
import com.network.transmission.SecureDataTransmissionHandler;
import com.system.lifecycle.ObjectLifecycleTracker;

public class DataChannelMediator
extends ObjectLifecycleTracker {
    public DataChannelMediator(Object object) {
        super(object);
    }

    public void q(NetworkConnectionManager1945 networkConnectionManager1945) {
        try {
            if (GameVersionEnumerator.MC_1_21_0.H()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataChannelMediator.a(customSystemException);
        }
        SecureDataTransmissionHandler.g(DataChannelMediator.U.u().gk, this.H, networkConnectionManager1945.M());
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public StreamProcessor1861 h(NetworkConnectionManager1945 networkConnectionManager1945) {
        return new StreamProcessor1861(SecureDataTransmissionHandler.m(DataChannelMediator.U.u().gk, this.H, networkConnectionManager1945.M()));
    }
}

