/*
 * Decompiled with CFR 0.152.
 */
package com.network.socket;

import com.security.transform.CryptographicTransformer;
import com.system.lifecycle.ObjectLifecycleTracker;

public class NetworkSocketHandler
extends ObjectLifecycleTracker {
    public static NetworkSocketHandler j(CryptographicTransformer cryptographicTransformer) {
        return new NetworkSocketHandler(NetworkSocketHandler.U.u().P.Y(cryptographicTransformer.M()));
    }

    public NetworkSocketHandler(Object object) {
        super(object);
    }
}

