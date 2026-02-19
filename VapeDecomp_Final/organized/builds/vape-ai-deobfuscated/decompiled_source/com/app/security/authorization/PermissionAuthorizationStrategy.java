/*
 * Decompiled with CFR 0.152.
 */
package com.app.security.authorization;

import com.data.protocol.DataProcessingProtocol;
import com.security.configuration.SecurityEnumRegistry;
import com.security.reflection.ReflectionContextManager;
import java.awt.Point;

class PermissionAuthorizationStrategy
implements DataProcessingProtocol {
    final ReflectionContextManager b;

    @Override
    public void B(Point point, SecurityEnumRegistry securityEnumRegistry) {
        ReflectionContextManager.O(this.b, point, securityEnumRegistry);
    }

    PermissionAuthorizationStrategy(ReflectionContextManager reflectionContextManager) {
        this.b = reflectionContextManager;
    }
}

