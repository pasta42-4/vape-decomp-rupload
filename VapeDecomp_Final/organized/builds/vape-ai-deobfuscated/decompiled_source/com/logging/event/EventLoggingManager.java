/*
 * Decompiled with CFR 0.152.
 */
package com.logging.event;

import com.app.events.EventDispatchCoordinator1445;
import com.security.protocol.CipherProtocolHandler;

class EventLoggingManager
extends EventDispatchCoordinator1445 {
    final CipherProtocolHandler eU;

    EventLoggingManager(CipherProtocolHandler cipherProtocolHandler, String string) {
        this.eU = cipherProtocolHandler;
        super(string);
    }

    @Override
    public void O() {
        super.O();
        CipherProtocolHandler.n(this.eU);
    }
}

