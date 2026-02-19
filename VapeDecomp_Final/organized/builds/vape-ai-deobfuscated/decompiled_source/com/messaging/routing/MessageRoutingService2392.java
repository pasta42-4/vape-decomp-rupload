/*
 * Decompiled with CFR 0.152.
 */
package com.messaging.routing;

import com.device.configuration.DeviceConfigurationProfile;
import com.security.obfuscation.DataObfuscator;

public class MessageRoutingService2392
extends DataObfuscator {
    public static MessageRoutingService2392 h(DeviceConfigurationProfile deviceConfigurationProfile) {
        return new MessageRoutingService2392(deviceConfigurationProfile.K(), deviceConfigurationProfile.y, deviceConfigurationProfile.E, deviceConfigurationProfile.Z);
    }

    public MessageRoutingService2392(int n, String string, String string2, String string3) {
        super(n, string, string2, string3);
    }
}

