/*
 * Decompiled with CFR 0.152.
 */
package com.transaction.management;

import com.app.cache.CacheInvalidationManager1797;
import com.app.core.generics.GenericTypeResolver;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.ui.rendering.UIRenderingController;
import java.awt.Color;

class TransactionCoordinator1899
extends CacheInvalidationManager1797 {
    final UIRenderingController oF;
    final GenericTypeResolver oD;
    final AbstractComputationKernel oT;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void d() {
        boolean bl;
        TransactionCoordinator1899 transactionCoordinator1899;
        block5: {
            block4: {
                try {
                    try {
                        super.d();
                        transactionCoordinator1899 = this;
                        if (!this.oT.f() || this.oD.H()) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TransactionCoordinator1899.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw TransactionCoordinator1899.a(customSystemException);
                }
            }
            bl = false;
        }
        transactionCoordinator1899.N(bl);
    }

    TransactionCoordinator1899(UIRenderingController uIRenderingController, String string, Color color, double d2, double d3, double d4, AbstractComputationKernel abstractComputationKernel, GenericTypeResolver genericTypeResolver) {
        this.oF = uIRenderingController;
        this.oT = abstractComputationKernel;
        this.oD = genericTypeResolver;
        super(string, color, d2, d3, d4);
    }
}

