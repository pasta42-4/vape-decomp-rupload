/*
 * Decompiled with CFR 0.152.
 */
package com.data.protocol;

import com.security.configuration.SecurityEnumRegistry;
import java.awt.Point;

public interface DataProcessingProtocol {
    default public void B(Point point, SecurityEnumRegistry securityEnumRegistry) {
    }

    default public void M(Point point) {
    }

    default public boolean o(Point point) {
        return false;
    }
}

