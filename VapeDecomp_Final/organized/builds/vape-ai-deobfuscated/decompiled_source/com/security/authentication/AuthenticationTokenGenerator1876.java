/*
 * Decompiled with CFR 0.152.
 */
package com.security.authentication;

import a.oQ;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.runtime.context.DynamicContextBroker;
import com.security.auth.AuthorizationManager;
import com.security.crypto.CryptographicContextManager1918;
import com.system.configuration.SystemConfigurationOrchestrator;

public class AuthenticationTokenGenerator1876 {
    private void B() {
        CryptographicContextManager1918 cryptographicContextManager1918;
        AuthorizationManager authorizationManager;
        SystemConfigurationOrchestrator systemConfigurationOrchestrator;
        block11: {
            systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
            try {
                try {
                    if (systemConfigurationOrchestrator.j() && systemConfigurationOrchestrator.D()) break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw AuthenticationTokenGenerator1876.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw AuthenticationTokenGenerator1876.a(customSystemException);
            }
        }
        for (int i = 0; i < 60; ++i) {
            CryptographicContextManager1918 cryptographicContextManager19182;
            CryptographicContextManager1918 cryptographicContextManager19183;
            double d2 = 0.13029834580989086 + 7.045809890852092E-4 * Math.random();
            try {
                cryptographicContextManager19183 = DynamicContextBroker.e ? CryptographicContextManager1918.a(systemConfigurationOrchestrator.F(), systemConfigurationOrchestrator.V() + d2, systemConfigurationOrchestrator.B(), false) : CryptographicContextManager1918.e(systemConfigurationOrchestrator.F(), ((oQ)systemConfigurationOrchestrator.L()).c() + d2, systemConfigurationOrchestrator.V() + d2, systemConfigurationOrchestrator.B(), false);
            }
            catch (CustomSystemException customSystemException) {
                throw AuthenticationTokenGenerator1876.a(customSystemException);
            }
            CryptographicContextManager1918 cryptographicContextManager19184 = cryptographicContextManager19183;
            double d3 = 0.07029834580989085 + 7.045809890852092E-4 * Math.random();
            try {
                cryptographicContextManager19182 = DynamicContextBroker.e ? CryptographicContextManager1918.a(systemConfigurationOrchestrator.F(), systemConfigurationOrchestrator.V() + d2, systemConfigurationOrchestrator.B(), false) : CryptographicContextManager1918.e(systemConfigurationOrchestrator.F(), ((oQ)systemConfigurationOrchestrator.L()).c() + d3, systemConfigurationOrchestrator.V() + d3, systemConfigurationOrchestrator.B(), false);
            }
            catch (CustomSystemException customSystemException) {
                throw AuthenticationTokenGenerator1876.a(customSystemException);
            }
            CryptographicContextManager1918 cryptographicContextManager19185 = cryptographicContextManager19182;
            systemConfigurationOrchestrator.U().O(cryptographicContextManager19184);
            systemConfigurationOrchestrator.U().O(cryptographicContextManager19185);
        }
        try {
            authorizationManager = systemConfigurationOrchestrator.U();
            cryptographicContextManager1918 = DynamicContextBroker.e ? CryptographicContextManager1918.a(systemConfigurationOrchestrator.F(), systemConfigurationOrchestrator.V(), systemConfigurationOrchestrator.B(), true) : CryptographicContextManager1918.e(systemConfigurationOrchestrator.F(), ((oQ)systemConfigurationOrchestrator.L()).c(), systemConfigurationOrchestrator.V(), systemConfigurationOrchestrator.B(), true);
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationTokenGenerator1876.a(customSystemException);
        }
        authorizationManager.O(cryptographicContextManager1918);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

