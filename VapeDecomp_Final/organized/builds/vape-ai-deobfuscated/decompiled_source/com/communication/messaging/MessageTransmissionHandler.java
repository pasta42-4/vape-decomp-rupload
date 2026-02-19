/*
 * Decompiled with CFR 0.152.
 */
package com.communication.messaging;

import com.system.configuration.ConfigurationResolver;
import com.system.parameters.SystemParameterConfiguration;

public class MessageTransmissionHandler
extends ConfigurationResolver {
    @Override
    public SystemParameterConfiguration W() {
        return SystemParameterConfiguration.NOTO;
    }

    public MessageTransmissionHandler(String string) {
        super(string);
    }
}

