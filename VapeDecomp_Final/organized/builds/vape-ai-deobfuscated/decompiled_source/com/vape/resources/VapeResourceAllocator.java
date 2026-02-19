/*
 * Decompiled with CFR 0.152.
 */
package com.vape.resources;

import com.data.compression.CompressionUtilityManager;
import com.data.protocol.DataProcessingProtocol;
import com.security.configuration.SecurityEnumRegistry;
import com.ui.rendering.GraphicalRenderingController;
import java.awt.Point;

class VapeResourceAllocator
implements DataProcessingProtocol {
    final CompressionUtilityManager O;

    VapeResourceAllocator(CompressionUtilityManager compressionUtilityManager) {
        this.O = compressionUtilityManager;
    }

    @Override
    public void B(Point point, SecurityEnumRegistry securityEnumRegistry) {
        GraphicalRenderingController.z(this.O);
    }
}

