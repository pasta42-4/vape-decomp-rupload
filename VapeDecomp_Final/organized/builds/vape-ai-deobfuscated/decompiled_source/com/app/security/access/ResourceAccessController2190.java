/*
 * Decompiled with CFR 0.152.
 */
package com.app.security.access;

import com.app.core.interfaces.OperationExecutionInterface;
import com.runtime.context.ContextualExecutionFramework;
import com.security.allocation.SecureResourceAllocator;

class ResourceAccessController2190
implements OperationExecutionInterface {
    final ContextualExecutionFramework s;
    final SecureResourceAllocator U;

    @Override
    public void R() {
        SecureResourceAllocator.k(this.U).E(this.s);
        SecureResourceAllocator.k(this.U).j(this.s).o();
        SecureResourceAllocator.k(this.U).A();
    }

    ResourceAccessController2190(SecureResourceAllocator secureResourceAllocator, ContextualExecutionFramework contextualExecutionFramework) {
        this.U = secureResourceAllocator;
        this.s = contextualExecutionFramework;
    }
}

