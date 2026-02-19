/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.app.routing.RequestRoutingController;
import com.exception.system.CustomSystemException;
import com.system.resource.ComputationalResourceAllocator;
import com.transaction.logging.TransactionLogOrchestrator;
import com.ui.rendering.GraphicalRenderingController;

class SV
implements RequestRoutingController {
    final TransactionLogOrchestrator h;
    final ComputationalResourceAllocator w;

    @Override
    public void p(char c, int n) {
        try {
            if (ComputationalResourceAllocator.i(this.w) != ComputationalResourceAllocator.B(this.w).a().length()) {
                this.h.y();
                GraphicalRenderingController.v = null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SV.a(customSystemException);
        }
        ComputationalResourceAllocator.y(this.w, ComputationalResourceAllocator.B(this.w).a().length());
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    SV(ComputationalResourceAllocator computationalResourceAllocator, TransactionLogOrchestrator transactionLogOrchestrator) {
        this.w = computationalResourceAllocator;
        this.h = transactionLogOrchestrator;
    }
}

