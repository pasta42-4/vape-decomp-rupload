/*
 * Decompiled with CFR 0.152.
 */
package com.connection.management;

import com.analytics.computation.MetricsCalculationEngine;
import com.core.computation.AbstractComputationKernel;
import com.event.management.EventDistributionHub;
import com.exception.system.CustomSystemException;
import com.system.resource.SystemResourceAllocator1136;
import java.util.ArrayList;
import java.util.List;

public class HybridConnector
extends EventDistributionHub {
    @Override
    public void j() {
        this.T();
        double d2 = this.u().G();
        double d3 = this.u().W() + this.u().b();
        ArrayList<Double> arrayList = new ArrayList<Double>();
        double d4 = 0.0;
        List<AbstractComputationKernel> list = this.l();
        for (int i = list.size() - 1; i >= 0; --i) {
            AbstractComputationKernel abstractComputationKernel;
            block22: {
                abstractComputationKernel = list.get(i);
                try {
                    if (!abstractComputationKernel.f()) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw HybridConnector.a(customSystemException);
                }
                SystemResourceAllocator1136 systemResourceAllocator1136 = this.l().get(abstractComputationKernel);
                if (systemResourceAllocator1136.t()) {
                    d2 = this.u().G() + this.u().w() - abstractComputationKernel.w();
                }
                try {
                    abstractComputationKernel.b(d2);
                    abstractComputationKernel.M(d3 - abstractComputationKernel.Y());
                    if (!arrayList.contains(d3)) {
                        arrayList.add(d3);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw HybridConnector.a(customSystemException);
                }
                if (!this.l().containsKey(abstractComputationKernel)) {
                    d2 += abstractComputationKernel.w();
                    continue;
                }
                boolean bl = systemResourceAllocator1136.u();
                if (abstractComputationKernel.b() > d4) {
                    d4 = abstractComputationKernel.Y();
                }
                try {
                    if (!bl && !systemResourceAllocator1136.t()) break block22;
                }
                catch (CustomSystemException customSystemException) {
                    throw HybridConnector.a(customSystemException);
                }
                d3 -= d4;
                d2 = this.u().G();
                d4 = 0.0;
                continue;
            }
            d2 += abstractComputationKernel.w();
        }
        for (AbstractComputationKernel abstractComputationKernel : this.l()) {
            try {
                this.k().put(abstractComputationKernel, new MetricsCalculationEngine(abstractComputationKernel.G(), abstractComputationKernel.W(), abstractComputationKernel.w(), abstractComputationKernel.b()));
                if (!abstractComputationKernel.f()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw HybridConnector.a(customSystemException);
            }
            double d5 = this.u().G();
            double d6 = this.u().W() + this.u().b();
            double d7 = abstractComputationKernel.G() + abstractComputationKernel.w() - d5;
            double d8 = d6 - abstractComputationKernel.W();
            try {
                if (d7 > this.C()) {
                    this.U(d7);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw HybridConnector.a(customSystemException);
            }
            try {
                if (d8 > this.R()) {
                    this.m(d8);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw HybridConnector.a(customSystemException);
            }
            abstractComputationKernel.r();
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public HybridConnector(AbstractComputationKernel abstractComputationKernel) {
        super(abstractComputationKernel);
    }
}

