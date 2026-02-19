/*
 * Decompiled with CFR 0.152.
 */
package com.data.transformation;

import a.T1;
import com.app.correlation.management.UuidCorrelationManager;
import com.core.computation.AbstractComputationKernel;
import com.network.protocol.NetworkProtocolEncoder1013;

public class PayloadTransformationManager
extends UuidCorrelationManager<T1> {
    private static AbstractComputationKernel[] F;

    public static void z(AbstractComputationKernel[] abstractComputationKernelArray) {
        F = abstractComputationKernelArray;
    }

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
    }

    public static AbstractComputationKernel[] B() {
        return F;
    }

    static {
        if (PayloadTransformationManager.B() != null) {
            PayloadTransformationManager.z(new AbstractComputationKernel[4]);
        }
    }

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
    }
}

