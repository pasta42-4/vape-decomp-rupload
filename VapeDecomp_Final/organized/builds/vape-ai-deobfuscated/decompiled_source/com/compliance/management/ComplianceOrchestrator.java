/*
 * Decompiled with CFR 0.152.
 */
package com.compliance.management;

import a.lJ;
import com.system.lifecycle.ObjectLifecycleTracker;

public class ComplianceOrchestrator
extends ObjectLifecycleTracker {
    public ComplianceOrchestrator C() {
        return new ComplianceOrchestrator(lJ.K(ComplianceOrchestrator.U.u().kz, this.H));
    }

    public void U(float f) {
        lJ.L(ComplianceOrchestrator.U.u().kz, this.H, f);
    }

    public Object z(float f, float f2) {
        return lJ.i(ComplianceOrchestrator.U.u().kz, this.H, f, f2);
    }

    public void s(float f) {
        lJ.P(ComplianceOrchestrator.U.u().kz, this.H, f);
    }

    public ComplianceOrchestrator b() {
        return new ComplianceOrchestrator(lJ.Q(ComplianceOrchestrator.U.u().kz, this.H));
    }

    public ComplianceOrchestrator(Object object) {
        super(object);
    }

    public void H(float f) {
        lJ.C(ComplianceOrchestrator.U.u().kz, this.H, f);
    }

    public Object G(double d2, double d3) {
        return this.z((float)d2, (float)d3);
    }

    public void v(float f) {
        lJ.i(ComplianceOrchestrator.U.u().kz, this.H, f);
    }

    public void V(float f) {
        lJ.z(ComplianceOrchestrator.U.u().kz, this.H, f);
    }

    public static ComplianceOrchestrator G(int n) {
        return new ComplianceOrchestrator(lJ.I(ComplianceOrchestrator.U.u().kz, n));
    }

    public Object J(float f, float f2) {
        return lJ.m(ComplianceOrchestrator.U.u().kz, this.H, f, f2);
    }

    public Object S(double d2, double d3) {
        return this.J((float)d2, (float)d3);
    }

    public void l(float f) {
        lJ.h(ComplianceOrchestrator.U.u().kz, this.H, f);
    }
}

