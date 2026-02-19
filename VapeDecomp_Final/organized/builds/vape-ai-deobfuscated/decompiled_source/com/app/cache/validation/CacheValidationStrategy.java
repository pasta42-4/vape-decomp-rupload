/*
 * Decompiled with CFR 0.152.
 */
package com.app.cache.validation;

import com.data.protocol.DataProcessingProtocol;
import com.security.configuration.SecurityEnumRegistry;
import com.security.reflection.ReflectionContextManager;
import java.awt.Point;

class CacheValidationStrategy
implements DataProcessingProtocol {
    final ReflectionContextManager y;

    CacheValidationStrategy(ReflectionContextManager reflectionContextManager) {
        this.y = reflectionContextManager;
    }

    @Override
    public void B(Point point, SecurityEnumRegistry securityEnumRegistry) {
        ReflectionContextManager.O(this.y, point, securityEnumRegistry);
    }
}

