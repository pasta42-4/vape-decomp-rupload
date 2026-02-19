/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import com.security.extraction.CryptographicMetadataExtractor;
import com.system.lifecycle.ObjectLifecycleTracker;
import java.util.Set;

public class ConnectionPoolHandler
extends ObjectLifecycleTracker {
    public Set e() {
        return (Set)CryptographicMetadataExtractor.y(ConnectionPoolHandler.U.u().kG, this.H);
    }

    public static ConnectionPoolHandler h() {
        return new ConnectionPoolHandler(CryptographicMetadataExtractor.x(ConnectionPoolHandler.U.u().kG));
    }

    public ConnectionPoolHandler(Object object) {
        super(object);
    }
}

