/*
 * Decompiled with CFR 0.152.
 */
package com.data.transformation;

import com.exception.system.CustomSystemException;
import com.network.configuration.NetworkConfigManager;

public class TransformationPipelineController
extends NetworkConfigManager {
    @Override
    public boolean m(long l) {
        boolean bl;
        try {
            bl = this.d() >= l;
        }
        catch (CustomSystemException customSystemException) {
            throw TransformationPipelineController.a(customSystemException);
        }
        return bl;
    }

    public double D() {
        return (double)this.d() / 1000000.0;
    }

    @Override
    public void m() {
        this.N = System.nanoTime();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public long d() {
        return System.nanoTime() - this.N;
    }
}

