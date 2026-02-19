/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderEngine1082;

class CryptographicKeyGenerator2118
extends GraphicalRenderEngine1082 {
    final AbstractComputationKernel R0;

    CryptographicKeyGenerator2118(double d2, double d3, AbstractComputationKernel abstractComputationKernel) {
        this.R0 = abstractComputationKernel;
        super(d2, d3);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public boolean G() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!super.G() && !this.R0.G()) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicKeyGenerator2118.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicKeyGenerator2118.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }
}

