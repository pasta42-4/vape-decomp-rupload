/*
 * Decompiled with CFR 0.152.
 */
package com.security.auth;

import a.Qh;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.resources.ResourceAllocationManager;
import com.temporal.metadata.TemporalMetadataResolver;

public class AuthenticationHandler {
    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static void N() {
        ResourceAllocationManager resourceAllocationManager = TemporalMetadataResolver.h.U().K(ResourceAllocationManager.class);
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        resourceAllocationManager.V(systemConfigurationOrchestrator.q(), systemConfigurationOrchestrator.S(), systemConfigurationOrchestrator.A(), systemConfigurationOrchestrator.Q());
    }

    public static void S(float f, float f2) {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        float f3 = systemConfigurationOrchestrator.S();
        float f4 = systemConfigurationOrchestrator.q();
        try {
            systemConfigurationOrchestrator.a((float)((double)systemConfigurationOrchestrator.q() + (double)f * 0.15));
            systemConfigurationOrchestrator.f((float)((double)systemConfigurationOrchestrator.S() - (double)f2 * 0.15));
            if (systemConfigurationOrchestrator.S() < -90.0f) {
                systemConfigurationOrchestrator.f(-90.0f);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationHandler.a(customSystemException);
        }
        try {
            if (systemConfigurationOrchestrator.S() > 90.0f) {
                systemConfigurationOrchestrator.f(90.0f);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationHandler.a(customSystemException);
        }
        systemConfigurationOrchestrator.G(systemConfigurationOrchestrator.Q() + systemConfigurationOrchestrator.S() - f3);
        systemConfigurationOrchestrator.z(systemConfigurationOrchestrator.A() + systemConfigurationOrchestrator.q() - f4);
        AuthenticationHandler.N();
    }

    public static void J(float f, float f2) {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        float f3 = systemConfigurationOrchestrator.S();
        float f4 = systemConfigurationOrchestrator.q();
        try {
            systemConfigurationOrchestrator.a((float)((double)systemConfigurationOrchestrator.q() + (double)f * 0.15));
            systemConfigurationOrchestrator.f((float)((double)systemConfigurationOrchestrator.S() - (double)f2 * 0.15));
            if (systemConfigurationOrchestrator.S() < -90.0f) {
                systemConfigurationOrchestrator.f(-90.0f);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationHandler.a(customSystemException);
        }
        try {
            if (systemConfigurationOrchestrator.S() > 90.0f) {
                systemConfigurationOrchestrator.f(90.0f);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationHandler.a(customSystemException);
        }
        systemConfigurationOrchestrator.G(systemConfigurationOrchestrator.Q() + systemConfigurationOrchestrator.S() - f3);
        systemConfigurationOrchestrator.z(systemConfigurationOrchestrator.A() + systemConfigurationOrchestrator.q() - f4);
    }

    public static void j(Qh qh, float f, float f2) {
        float f3 = qh.S();
        float f4 = qh.q();
        try {
            qh.a((float)((double)qh.q() + (double)f * 0.15));
            qh.f((float)((double)qh.S() - (double)f2 * 0.15));
            if (qh.S() < -90.0f) {
                qh.f(-90.0f);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationHandler.a(customSystemException);
        }
        try {
            if (qh.S() > 90.0f) {
                qh.f(90.0f);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationHandler.a(customSystemException);
        }
        qh.G(qh.Q() + qh.S() - f3);
        qh.z(qh.A() + qh.q() - f4);
        qh.C(qh.q());
        qh.F(qh.J());
        AuthenticationHandler.N();
    }

    public static void X(float f, float f2) {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        float f3 = systemConfigurationOrchestrator.S();
        float f4 = systemConfigurationOrchestrator.q();
        try {
            systemConfigurationOrchestrator.a(f);
            systemConfigurationOrchestrator.f(f2);
            if (systemConfigurationOrchestrator.S() < -90.0f) {
                systemConfigurationOrchestrator.f(-90.0f);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationHandler.a(customSystemException);
        }
        try {
            if (systemConfigurationOrchestrator.S() > 90.0f) {
                systemConfigurationOrchestrator.f(90.0f);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationHandler.a(customSystemException);
        }
        systemConfigurationOrchestrator.G(systemConfigurationOrchestrator.Q() + systemConfigurationOrchestrator.S() - f3);
        systemConfigurationOrchestrator.z(systemConfigurationOrchestrator.A() + systemConfigurationOrchestrator.q() - f4);
    }
}

