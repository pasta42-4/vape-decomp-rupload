/*
 * Decompiled with CFR 0.152.
 */
package com.app.config;

import com.messaging.async.AsyncMessageBroker;
import com.security.context.ReplicableSecurityContext;
import java.util.ArrayList;
import java.util.List;

public class ConfigurationResolver2171 {
    private final List<AsyncMessageBroker<?>> p = new ArrayList();

    public ConfigurationResolver2171 C(AsyncMessageBroker<?> asyncMessageBroker) {
        this.p.add(asyncMessageBroker);
        return this;
    }

    public ReplicableSecurityContext X() {
        ReplicableSecurityContext replicableSecurityContext = new ReplicableSecurityContext();
        ReplicableSecurityContext.R(replicableSecurityContext).addAll(this.p);
        return replicableSecurityContext;
    }
}

