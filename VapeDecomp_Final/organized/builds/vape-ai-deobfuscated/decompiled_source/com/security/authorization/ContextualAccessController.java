/*
 * Decompiled with CFR 0.152.
 */
package com.security.authorization;

import com.core.computation.AbstractComputationKernel;
import com.crypto.cipher.SymmetricCipherManager;

public class ContextualAccessController {
    private boolean A;
    private final AbstractComputationKernel i;
    private final SymmetricCipherManager O;

    public boolean P() {
        return this.A;
    }

    public SymmetricCipherManager O() {
        return this.O;
    }

    public AbstractComputationKernel j() {
        return this.i;
    }

    public void C(boolean bl) {
        this.A = bl;
    }

    public ContextualAccessController(AbstractComputationKernel abstractComputationKernel, boolean bl) {
        this.i = abstractComputationKernel;
        this.A = bl;
        this.O = new SymmetricCipherManager(abstractComputationKernel.w());
        this.O.n(abstractComputationKernel, new Object[0]);
        this.O.i(false);
    }

    public ContextualAccessController(AbstractComputationKernel abstractComputationKernel) {
        this(abstractComputationKernel, true);
    }
}

