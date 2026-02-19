/*
 * Decompiled with CFR 0.152.
 */
package com.system.resource;

import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.math.computation.NumericalAnalysisEngine;
import com.network.transmission.DataTransmissionManager2384;
import com.runtime.context.DynamicContextBroker;

class ResourceAllocationController1414 {
    private DataTransmissionManager2384 Q;
    private long L = System.currentTimeMillis();
    private int O = DynamicContextBroker.M();

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    static long b(ResourceAllocationController1414 resourceAllocationController1414) {
        return resourceAllocationController1414.L;
    }

    public ResourceAllocationController1414(NumericalAnalysisEngine numericalAnalysisEngine) {
        double d2;
        double d3;
        DataTransmissionManager2384 dataTransmissionManager2384;
        DataTransmissionManager2384 dataTransmissionManager23842 = new DataTransmissionManager2384(ApplicationLifecycleManager.c().I(numericalAnalysisEngine.V()));
        try {
            this.Q = DataTransmissionManager2384.h(ApplicationLifecycleManager.c(), dataTransmissionManager23842.B());
            this.Q.R(dataTransmissionManager23842, true);
            dataTransmissionManager2384 = this.Q;
            d3 = numericalAnalysisEngine.o();
            d2 = DynamicContextBroker.e ? numericalAnalysisEngine.R() : numericalAnalysisEngine.R() - 1.5;
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationController1414.a(customSystemException);
        }
        dataTransmissionManager2384.u(d3, d2, numericalAnalysisEngine.z(), numericalAnalysisEngine.f(), numericalAnalysisEngine.c());
        this.Q.C(dataTransmissionManager23842.J());
        this.Q.f(this.O);
    }

    static int o(ResourceAllocationController1414 resourceAllocationController1414) {
        return resourceAllocationController1414.O;
    }

    public long F() {
        return this.L;
    }

    static DataTransmissionManager2384 H(ResourceAllocationController1414 resourceAllocationController1414) {
        return resourceAllocationController1414.Q;
    }

    public void D() {
        ApplicationLifecycleManager.c().c(this.O, this.Q);
    }

    public void u() {
        ApplicationLifecycleManager.c().d(this.Q);
        DynamicContextBroker.y(this.O);
    }
}

