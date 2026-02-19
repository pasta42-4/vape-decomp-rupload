/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.data.compression.CompressionUtilityManager;
import com.data.protocol.DataProcessingProtocol;
import com.exception.system.CustomSystemException;
import com.security.configuration.SecurityEnumRegistry;
import com.ui.rendering.GraphicalRenderingController;
import java.awt.Point;

class Zc
implements DataProcessingProtocol {
    final CompressionUtilityManager T;

    @Override
    public void B(Point point, SecurityEnumRegistry securityEnumRegistry) {
        try {
            if (!CompressionUtilityManager.h(this.T)) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw Zc.a(customSystemException);
        }
        try {
            if (!this.T.s()) {
                GraphicalRenderingController.z(this.T);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw Zc.a(customSystemException);
        }
    }

    Zc(CompressionUtilityManager compressionUtilityManager) {
        this.T = compressionUtilityManager;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

