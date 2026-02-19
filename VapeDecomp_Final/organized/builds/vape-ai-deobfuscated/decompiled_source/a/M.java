/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.analytics.computation.MetricsCalculationEngine;
import com.core.computation.AbstractComputationKernel;
import com.event.management.EventDistributionHub;
import com.exception.system.CustomSystemException;
import com.system.resource.SystemResourceAllocator1136;
import java.util.ArrayList;
import java.util.List;

public class M
extends EventDistributionHub {
    private double o;
    private double Y;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void j() {
        this.T();
        double d2 = this.u().G();
        double d3 = this.u().W();
        ArrayList<Double> arrayList = new ArrayList<Double>();
        double d4 = 0.0;
        double d5 = 0.0;
        List<AbstractComputationKernel> list = this.l();
        for (int i = 0; i < list.size(); ++i) {
            boolean bl;
            AbstractComputationKernel abstractComputationKernel;
            block28: {
                abstractComputationKernel = list.get(i);
                try {
                    if (!abstractComputationKernel.f()) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw M.a(customSystemException);
                }
                SystemResourceAllocator1136 systemResourceAllocator1136 = this.l().get(abstractComputationKernel);
                if (systemResourceAllocator1136.t()) {
                    d2 = this.u().G() + this.o - abstractComputationKernel.w();
                }
                try {
                    abstractComputationKernel.b(d2);
                    abstractComputationKernel.M(d3);
                    if (!arrayList.contains(d3)) {
                        arrayList.add(d3);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw M.a(customSystemException);
                }
                if (!this.l().containsKey(abstractComputationKernel)) {
                    d2 += abstractComputationKernel.w();
                    continue;
                }
                bl = systemResourceAllocator1136.u();
                try {
                    if (systemResourceAllocator1136.V() || i >= list.size() - 1) break block28;
                }
                catch (CustomSystemException customSystemException) {
                    throw M.a(customSystemException);
                }
                AbstractComputationKernel abstractComputationKernel2 = list.get(i + 1);
                double d6 = d2 - this.u().G();
                if (d6 + abstractComputationKernel.w() + abstractComputationKernel2.w() < this.Y) {
                    bl = false;
                }
            }
            if (abstractComputationKernel.Y() > d4) {
                d4 = abstractComputationKernel.Y();
            }
            if (bl) {
                double d7 = d2 - this.u().G();
                if (d7 > d5) {
                    d5 = d7;
                }
                d3 += d4;
                d2 = this.u().G();
                d4 = 0.0;
                continue;
            }
            d2 += abstractComputationKernel.w();
        }
        for (AbstractComputationKernel abstractComputationKernel : this.l()) {
            try {
                this.k().put(abstractComputationKernel, new MetricsCalculationEngine(abstractComputationKernel.G(), abstractComputationKernel.W(), abstractComputationKernel.w(), abstractComputationKernel.Y()));
                if (!abstractComputationKernel.f()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw M.a(customSystemException);
            }
            double d8 = this.u().G();
            double d9 = this.u().W();
            double d10 = abstractComputationKernel.G() + abstractComputationKernel.w() - d8;
            double d11 = abstractComputationKernel.W() + abstractComputationKernel.Y() - d9;
            try {
                if (d10 > this.C()) {
                    this.U(d10);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw M.a(customSystemException);
            }
            try {
                if (d11 > this.R()) {
                    this.m(d11);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw M.a(customSystemException);
            }
            abstractComputationKernel.r();
        }
        try {
            this.o = this.u().w();
            if (this.l()) {
                this.k();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw M.a(customSystemException);
        }
    }

    public double L() {
        return this.Y;
    }

    public M(AbstractComputationKernel abstractComputationKernel) {
        super(abstractComputationKernel);
        this.Y = abstractComputationKernel.w();
    }

    public void A(double d2) {
        this.Y = d2;
    }
}

