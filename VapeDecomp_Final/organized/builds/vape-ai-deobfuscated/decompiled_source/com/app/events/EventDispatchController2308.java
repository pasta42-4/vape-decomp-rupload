/*
 * Decompiled with CFR 0.152.
 */
package com.app.events;

import com.data.protocol.DataProcessingProtocol;
import com.security.configuration.SecurityEnumRegistry;
import com.system.configuration.ConfigurationProfileManager;
import java.awt.Point;

class EventDispatchController2308
implements DataProcessingProtocol {
    final ConfigurationProfileManager s;

    EventDispatchController2308(ConfigurationProfileManager configurationProfileManager) {
        this.s = configurationProfileManager;
    }

    @Override
    public void B(Point point, SecurityEnumRegistry securityEnumRegistry) {
        ConfigurationProfileManager.w(this.s, securityEnumRegistry);
    }
}

