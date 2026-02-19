/*
 * Decompiled with CFR 0.152.
 */
package com.session.management;

import com.app.core.interfaces.OperationExecutionInterface;
import com.exception.system.CustomSystemException;
import com.security.allocation.SecureResourceAllocator;
import com.ui.rendering.GraphicalRenderingController;

class SessionMediator
implements OperationExecutionInterface {
    final SecureResourceAllocator e;

    @Override
    public void R() {
        boolean bl;
        try {
            bl = !GraphicalRenderingController.e;
        }
        catch (CustomSystemException customSystemException) {
            throw SessionMediator.a(customSystemException);
        }
        GraphicalRenderingController.e = bl;
        GraphicalRenderingController.j();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    SessionMediator(SecureResourceAllocator secureResourceAllocator) {
        this.e = secureResourceAllocator;
    }
}

