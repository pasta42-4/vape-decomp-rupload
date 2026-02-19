/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.app.transformation;

import com.app.correlation.management.UuidCorrelationManager;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.token.management.TokenWorkflow;
import org.jetbrains.annotations.Nullable;

public class GenericDataTransformer
extends UuidCorrelationManager<TokenWorkflow> {
    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
    }

    public GenericDataTransformer() {
    }

    public GenericDataTransformer(@Nullable TokenWorkflow tokenWorkflow) {
        super(tokenWorkflow);
    }

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
    }
}

