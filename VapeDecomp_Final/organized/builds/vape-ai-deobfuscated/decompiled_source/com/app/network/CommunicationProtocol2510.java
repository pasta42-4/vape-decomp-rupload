/*
 * Decompiled with CFR 0.152.
 */
package com.app.network;

import com.concurrency.tasks.BackgroundTaskOrchestrator;
import com.reflection.core.ReflectiveIntrospectionEngine;
import com.user.identity.UserIdentityManager;

public class CommunicationProtocol2510
extends ReflectiveIntrospectionEngine {
    public CommunicationProtocol2510(UserIdentityManager userIdentityManager, BackgroundTaskOrchestrator backgroundTaskOrchestrator) {
        super(userIdentityManager, backgroundTaskOrchestrator, false);
        this.J().N(false);
    }
}

