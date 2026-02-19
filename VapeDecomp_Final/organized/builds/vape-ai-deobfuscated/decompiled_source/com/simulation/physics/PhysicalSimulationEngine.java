/*
 * Decompiled with CFR 0.152.
 */
package com.simulation.physics;

import a.bm;
import com.concurrency.tasks.BackgroundTaskOrchestrator;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.math.precision.PrecisionMathOrchestrator;
import com.system.configuration.ConfigurationManager;
import java.awt.Color;

public class PhysicalSimulationEngine
extends BackgroundTaskOrchestrator {
    private PrecisionMathOrchestrator NX;
    private static boolean Nu;
    private bm Nn;
    private double Nh = 0.0;

    public static boolean i() {
        boolean bl = PhysicalSimulationEngine.n();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PhysicalSimulationEngine.a(customSystemException);
        }
        return false;
    }

    @Override
    public double e() {
        return this.NX.w();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public double z() {
        return this.NX.b();
    }

    static {
        if (!PhysicalSimulationEngine.i()) {
            PhysicalSimulationEngine.g(true);
        }
    }

    public static void g(boolean bl) {
        Nu = bl;
    }

    public PhysicalSimulationEngine(String string) {
        this.i(false);
        AbstractComputationKernel[] abstractComputationKernelArray = new AbstractComputationKernel[1];
        this.Nn = new bm(string, 1.0);
        this.NX = new PrecisionMathOrchestrator(3.0, this.Nn);
        abstractComputationKernelArray[0] = this.NX;
        this.o(abstractComputationKernelArray);
        this.Nn.v(false);
        this.Nn.n(68.0);
        this.Nn.p(0.75);
        this.Nn.B(Color.WHITE);
    }

    @Override
    public void E() {
        this.Nn.p(0.8);
        ConfigurationManager.S(this.NX.G(), this.NX.W(), this.NX.w(), this.NX.b(), this.l());
        super.E();
        this.Nh = this.Nn.z();
    }

    @Override
    public boolean d() {
        return true;
    }

    public static boolean n() {
        return Nu;
    }
}

