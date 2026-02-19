/*
 * Decompiled with CFR 0.152.
 */
package com.event.trigger;

import com.crypto.configuration.CryptoConfigurationManager;
import com.game.event.GameStateEventEmitter;
import com.network.io.NetworkStreamHandler;

public class EventTriggerEngine
extends GameStateEventEmitter {
    @Override
    public boolean fire() {
        CryptoConfigurationManager.v(-1);
        return super.fire();
    }

    public EventTriggerEngine(float f) {
        super(f);
    }

    public EventTriggerEngine(Object object) {
        super(new NetworkStreamHandler(object));
    }
}

