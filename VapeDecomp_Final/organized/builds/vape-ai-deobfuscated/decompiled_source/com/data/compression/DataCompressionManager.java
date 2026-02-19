/*
 * Decompiled with CFR 0.152.
 */
package com.data.compression;

import com.crypto.broker.CryptoTransformationBroker;
import com.network.connection.NetworkConnectionManager1945;
import com.system.lifecycle.ObjectLifecycleTracker;

public class DataCompressionManager
extends ObjectLifecycleTracker {
    public DataCompressionManager(Object object) {
        super(object);
    }

    public NetworkConnectionManager1945 J() {
        return new NetworkConnectionManager1945(CryptoTransformationBroker.p(DataCompressionManager.U.u().J, this.H));
    }
}

