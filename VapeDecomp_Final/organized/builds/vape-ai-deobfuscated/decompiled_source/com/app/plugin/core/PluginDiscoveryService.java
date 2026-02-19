/*
 * Decompiled with CFR 0.152.
 */
package com.app.plugin.core;

import com.crypto.protocol.CryptoProtocolEngine;
import com.reflection.metadata.ReflectionMetadataResolver;

public class PluginDiscoveryService
extends CryptoProtocolEngine {
    public PluginDiscoveryService() {
        super(ReflectionMetadataResolver.Px);
    }
}

