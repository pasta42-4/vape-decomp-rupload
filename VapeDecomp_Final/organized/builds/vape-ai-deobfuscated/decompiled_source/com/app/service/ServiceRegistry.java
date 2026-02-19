/*
 * Decompiled with CFR 0.152.
 */
package com.app.service;

import com.network.connection.NetworkEndpointIdentifier;
import com.security.crypto.CryptoKeyGenerator1662;

public class ServiceRegistry
extends CryptoKeyGenerator1662 {
    public ServiceRegistry(NetworkEndpointIdentifier networkEndpointIdentifier) {
        super(networkEndpointIdentifier, false);
    }
}

