/*
 * Decompiled with CFR 0.152.
 */
package com.app.security.validation;

import com.app.core.interfaces.OperationExecutionInterface;
import com.runtime.context.ContextualExecutionFramework;
import com.security.allocation.SecureResourceAllocator;

class SecurityTokenValidator2196
implements OperationExecutionInterface {
    final SecureResourceAllocator D;
    final ContextualExecutionFramework p;

    SecurityTokenValidator2196(SecureResourceAllocator secureResourceAllocator, ContextualExecutionFramework contextualExecutionFramework) {
        this.D = secureResourceAllocator;
        this.p = contextualExecutionFramework;
    }

    @Override
    public void R() {
        SecureResourceAllocator.k(this.D).E(this.p);
        SecureResourceAllocator.k(this.D).j(this.p).o();
        SecureResourceAllocator.k(this.D).A();
    }
}

