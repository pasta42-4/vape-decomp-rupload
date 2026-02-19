/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.concurrency.management.AsyncExecutionCoordinator;
import com.data.protocol.DataProcessingProtocol;
import com.exception.system.CustomSystemException;
import com.security.configuration.SecurityEnumRegistry;
import com.ui.rendering.GraphicalRenderingController;
import java.awt.Point;

class _k
implements DataProcessingProtocol {
    final AsyncExecutionCoordinator s;

    _k(AsyncExecutionCoordinator asyncExecutionCoordinator) {
        this.s = asyncExecutionCoordinator;
    }

    @Override
    public void B(Point point, SecurityEnumRegistry securityEnumRegistry) {
        GraphicalRenderingController.z(this.s);
        Runnable runnable = AsyncExecutionCoordinator.d(this.s);
        try {
            if (runnable != null) {
                runnable.run();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw _k.a(customSystemException);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

