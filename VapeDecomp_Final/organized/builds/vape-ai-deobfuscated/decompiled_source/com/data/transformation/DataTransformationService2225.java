/*
 * Decompiled with CFR 0.152.
 */
package com.data.transformation;

import a.bP;
import com.concurrency.filtering.ConcurrentFilteringCoordinator;
import com.data.protocol.DataProcessingProtocol;
import com.security.configuration.SecurityEnumRegistry;
import java.awt.Point;

class DataTransformationService2225
implements DataProcessingProtocol {
    final bP S;
    final ConcurrentFilteringCoordinator Y;

    @Override
    public void B(Point point, SecurityEnumRegistry securityEnumRegistry) {
        this.Y.d(bP.h(this.S).s());
    }

    DataTransformationService2225(bP bP2, ConcurrentFilteringCoordinator concurrentFilteringCoordinator) {
        this.S = bP2;
        this.Y = concurrentFilteringCoordinator;
    }
}

