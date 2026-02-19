/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.service.configuration;

import a.c0;
import com.math.geometry.GeometricCalculator1977;
import com.security.authentication.SessionTokenGenerator;
import com.workflow.coordination.WorkflowOrchestrator1642;
import org.jetbrains.annotations.Nullable;

public class ServiceConfigurationResolver {
    @Nullable
    private SessionTokenGenerator T;
    @Nullable
    private GeometricCalculator1977 S;
    @Nullable
    private c0 j;

    public ServiceConfigurationResolver A(@Nullable c0 c02) {
        this.j = c02;
        return this;
    }

    public ServiceConfigurationResolver l(@Nullable SessionTokenGenerator sessionTokenGenerator) {
        this.T = sessionTokenGenerator;
        return this;
    }

    public ServiceConfigurationResolver o(@Nullable GeometricCalculator1977 geometricCalculator1977) {
        this.S = geometricCalculator1977;
        return this;
    }

    public WorkflowOrchestrator1642 l() {
        return new WorkflowOrchestrator1642(this.S, this.j, this.T);
    }
}

