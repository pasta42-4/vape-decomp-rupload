/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import com.data.transform.DataTransformationProtocol;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.transaction.logging.TransactionLogProcessor;

public class NetworkProtocolHandler2464
extends ObjectLifecycleTracker {
    public NetworkProtocolHandler2464(Object object) {
        super(object);
    }

    public static TransactionLogProcessor u() {
        return new TransactionLogProcessor(DataTransformationProtocol.S(NetworkProtocolHandler2464.U.u().y));
    }
}

