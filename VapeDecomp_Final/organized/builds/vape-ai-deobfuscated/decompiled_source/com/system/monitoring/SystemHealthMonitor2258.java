/*
 * Decompiled with CFR 0.152.
 */
package com.system.monitoring;

import com.data.protocol.DataProcessingProtocol;
import com.security.cipher.AdaptiveCipherEngine;
import com.security.configuration.SecurityEnumRegistry;
import java.awt.Point;

class SystemHealthMonitor2258
implements DataProcessingProtocol {
    final AdaptiveCipherEngine q;

    @Override
    public void B(Point point, SecurityEnumRegistry securityEnumRegistry) {
        this.q.Z();
    }

    SystemHealthMonitor2258(AdaptiveCipherEngine adaptiveCipherEngine) {
        this.q = adaptiveCipherEngine;
    }
}

