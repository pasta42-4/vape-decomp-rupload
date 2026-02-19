/*
 * Decompiled with CFR 0.152.
 */
package com.security.encryption;

import com.crypto.protocol.CryptoProtocolEngine;
import com.reflection.metadata.ReflectionMetadataResolver;

public class DataEncryptionService
extends CryptoProtocolEngine {
    public DataEncryptionService() {
        super(ReflectionMetadataResolver.P7);
    }
}

