/*
 * Decompiled with CFR 0.152.
 */
package com.messaging.queue;

import com.network.protocol.CommunicationProtocolManager;
import com.security.session.CipherSessionManager;
import com.system.configuration.MultiParameterConfigurator;

class MessageQueueOrchestrator
extends MultiParameterConfigurator {
    final CommunicationProtocolManager R;

    MessageQueueOrchestrator(CommunicationProtocolManager communicationProtocolManager, CipherSessionManager cipherSessionManager, String string, String string2, double d2) {
        this.R = communicationProtocolManager;
        super(cipherSessionManager, string, string2, d2);
    }

    @Override
    public double e() {
        return this.R.e();
    }
}

