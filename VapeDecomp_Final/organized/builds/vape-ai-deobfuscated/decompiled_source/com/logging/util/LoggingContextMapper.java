/*
 * Decompiled with CFR 0.152.
 */
package com.logging.util;

import com.app.connection.ConnectionPool;
import com.network.connection.ConnectionPoolManager2659;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.security.crypto.EncryptionTransformer;
import com.temporal.metadata.TemporalMetadataResolver;

public class LoggingContextMapper
extends EncryptionTransformer {
    public LoggingContextMapper() {
        super(ReflectionMetadataResolver.bf);
    }

    @Override
    public void y() {
        this.O(TemporalMetadataResolver.h.u().GT.g, ConnectionPool.class, "");
        this.w(TemporalMetadataResolver.h.u().GT.g, ConnectionPoolManager2659.class, "");
    }
}

