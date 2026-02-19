/*
 * Decompiled with CFR 0.152.
 */
package com.app.streaming;

import com.app.network.CommunicationProtocolManager1453;
import com.caching.strategy.CacheInvalidationStrategy;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.secure.transformation.SecureDataTransformer538;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.workflow.core.WorkflowCoordinator;

public class StreamProtocolHandler
extends ObjectLifecycleTracker {
    public static StreamProtocolHandler u() {
        Object object = SecureDataTransformer538.D(StreamProtocolHandler.U.u().kt, ApplicationLifecycleManager.g());
        return new StreamProtocolHandler(object);
    }

    public StreamProtocolHandler(Object object) {
        super(object);
    }

    public WorkflowCoordinator S(CommunicationProtocolManager1453 communicationProtocolManager1453) {
        return new WorkflowCoordinator(SecureDataTransformer538.e(StreamProtocolHandler.U.u().kt, this.H, communicationProtocolManager1453.M()));
    }

    public WorkflowCoordinator g(CacheInvalidationStrategy cacheInvalidationStrategy) {
        return new WorkflowCoordinator(SecureDataTransformer538.e(StreamProtocolHandler.U.u().kt, this.H, cacheInvalidationStrategy.M()));
    }
}

