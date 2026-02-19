/*
 * Decompiled with CFR 0.152.
 */
package com.network.communication;

import com.app.messaging.core.MessageRoutingEngine2585;
import com.system.lifecycle.ObjectLifecycleTracker;

public class CommunicationChannelSetup
extends ObjectLifecycleTracker {
    public MessageRoutingEngine2585 T() {
        return new MessageRoutingEngine2585(CommunicationChannelSetup.U.u().df.w(this.H));
    }

    public CommunicationChannelSetup(Object object) {
        super(object);
    }
}

