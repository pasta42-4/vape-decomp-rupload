/*
 * Decompiled with CFR 0.152.
 */
package com.app.transaction.validation;

import com.data.streaming.StreamProcessingEngine1677;
import com.event.management.ContextualEventDispatcher;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.runtime.reflection.ReflectionUtilityBroker;

public class TransactionValidator2324
extends NetworkPacketInterceptor1107 {
    public TransactionValidator2324(Object object) {
        super(object);
    }

    public static TransactionValidator2324 T(ContextualEventDispatcher contextualEventDispatcher, StreamProcessingEngine1677 streamProcessingEngine1677, ReflectionUtilityBroker reflectionUtilityBroker) {
        return new TransactionValidator2324(TransactionValidator2324.U.u().GM.j(contextualEventDispatcher.M(), streamProcessingEngine1677.M(), reflectionUtilityBroker.M()));
    }
}

