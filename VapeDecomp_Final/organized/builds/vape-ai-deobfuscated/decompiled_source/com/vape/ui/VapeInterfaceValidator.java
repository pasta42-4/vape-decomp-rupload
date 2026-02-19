/*
 * Decompiled with CFR 0.152.
 */
package com.vape.ui;

import a.fu;
import com.app.core.interfaces.OperationExecutionInterface;
import com.security.allocation.SecureResourceAllocator;

class VapeInterfaceValidator
implements OperationExecutionInterface {
    final fu h;
    final SecureResourceAllocator J;

    VapeInterfaceValidator(SecureResourceAllocator secureResourceAllocator, fu fu2) {
        this.J = secureResourceAllocator;
        this.h = fu2;
    }

    @Override
    public void R() {
        this.h.V();
    }
}

