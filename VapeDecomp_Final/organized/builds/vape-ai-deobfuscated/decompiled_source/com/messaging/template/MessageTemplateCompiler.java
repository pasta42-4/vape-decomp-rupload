/*
 * Decompiled with CFR 0.152.
 */
package com.messaging.template;

import a.TS;
import com.app.correlation.management.UuidCorrelationManager;
import com.network.protocol.NetworkProtocolEncoder1013;

public class MessageTemplateCompiler
extends UuidCorrelationManager<TS> {
    private String V;

    public MessageTemplateCompiler() {
    }

    public String X() {
        return this.V;
    }

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.J(this.V);
    }

    public MessageTemplateCompiler(String string) {
        this();
        this.V = string;
    }

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.V = networkProtocolEncoder1013.b(16);
    }
}

