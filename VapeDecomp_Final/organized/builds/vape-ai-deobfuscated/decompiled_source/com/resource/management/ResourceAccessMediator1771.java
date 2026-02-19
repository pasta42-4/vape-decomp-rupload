/*
 * Decompiled with CFR 0.152.
 */
package com.resource.management;

import com.app.core.interfaces.OperationExecutionInterface;
import com.exception.system.CustomSystemException;
import com.security.allocation.SecureResourceAllocator;
import com.ui.rendering.GraphicalRenderingController;

class ResourceAccessMediator1771
implements OperationExecutionInterface {
    final SecureResourceAllocator C;

    @Override
    public void R() {
        boolean bl;
        try {
            bl = !GraphicalRenderingController.e;
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAccessMediator1771.a(customSystemException);
        }
        GraphicalRenderingController.e = bl;
        GraphicalRenderingController.j();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    ResourceAccessMediator1771(SecureResourceAllocator secureResourceAllocator) {
        this.C = secureResourceAllocator;
    }
}

