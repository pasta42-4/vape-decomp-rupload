/*
 * Decompiled with CFR 0.152.
 */
package com.network.configuration;

import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.scientific.measurement.PrecisionMeasurementCalibrator;
import com.system.configuration.ConfigurationManager;
import java.awt.Color;

public class NetworkConfigurationManager1825
extends PrecisionMeasurementCalibrator {
    private static CustomSystemException c(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public NetworkConfigurationManager1825(AbstractComputationKernel abstractComputationKernel, AbstractComputationKernel abstractComputationKernel2) {
        super(abstractComputationKernel, abstractComputationKernel2);
    }

    @Override
    public void E() {
        int n;
        double d2;
        double d3;
        double d4;
        double d5;
        try {
            d5 = this.P().G();
            d4 = this.P().W();
            d3 = this.P().w();
            d2 = this.P().b();
            n = this.C() ? 2 : 0;
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConfigurationManager1825.c(customSystemException);
        }
        ConfigurationManager.S(d5, d4, d3, d2 + (double)n, new Color(0, 0, 0, 100));
        super.E();
    }
}

