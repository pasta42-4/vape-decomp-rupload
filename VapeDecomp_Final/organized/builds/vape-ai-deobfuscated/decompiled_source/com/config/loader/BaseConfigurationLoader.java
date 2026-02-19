/*
 * Decompiled with CFR 0.152.
 */
package com.config.loader;

import com.app.adapter.GenericTransformationAdapter;
import com.crypto.registry.CryptoAlgorithmRegistry;
import com.event.management.EventDispatchQueue;
import com.network.protocol.NetworkProtocolMapper1327;
import com.security.encoding.SecurityEncodingRegistry;
import com.user.identity.UserProfileIdentifier;

final class BaseConfigurationLoader
extends CryptoAlgorithmRegistry {
    BaseConfigurationLoader() {
        this.Y(SecurityEncodingRegistry.SERVER, NetworkProtocolMapper1327.class);
        this.Y(SecurityEncodingRegistry.CLIENT, EventDispatchQueue.class);
        this.Y(SecurityEncodingRegistry.SERVER, UserProfileIdentifier.class);
        this.Y(SecurityEncodingRegistry.CLIENT, GenericTransformationAdapter.class);
    }
}

