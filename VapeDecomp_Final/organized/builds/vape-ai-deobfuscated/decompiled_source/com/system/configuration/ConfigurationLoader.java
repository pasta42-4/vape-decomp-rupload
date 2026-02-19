/*
 * Decompiled with CFR 0.152.
 */
package com.system.configuration;

import a._Y;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.data.compression.CompressionUtility;
import com.exception.system.CustomSystemException;
import com.security.auth.AuthenticationGateway;
import com.security.event.SecureEventOrchestrator;
import com.security.tokens.CryptographicTokenGenerator;
import com.system.config.AdaptiveConfigurationManager;
import com.system.configuration.SystemConfigurationOrchestrator;

class ConfigurationLoader
extends AuthenticationGateway {
    boolean q;
    final int O;
    final double[] V;
    final CryptographicTokenGenerator y;

    private static CustomSystemException d(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void H(SystemConfigurationOrchestrator systemConfigurationOrchestrator, SecureEventOrchestrator secureEventOrchestrator) {
        block7: {
            block8: {
                try {
                    if (secureEventOrchestrator.r()) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationLoader.d(customSystemException);
                }
                this.l();
                this.x();
                AdaptiveConfigurationManager adaptiveConfigurationManager = CryptographicTokenGenerator.z(this.y, this.O);
                try {
                    try {
                        if (!_Y.u(adaptiveConfigurationManager, new CompressionUtility(AdaptiveComputationEngine.Q(this.V[0]), AdaptiveComputationEngine.Q(this.V[1]), AdaptiveComputationEngine.Q(this.V[2])))) break block7;
                        if (this.q) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConfigurationLoader.d(customSystemException);
                    }
                    this.L(this.y.J(this.O));
                    this.q = true;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationLoader.d(customSystemException);
                }
            }
            this.q();
        }
    }

    ConfigurationLoader(CryptographicTokenGenerator cryptographicTokenGenerator, double d2, double d3, double d4, int n, double[] dArray) {
        this.y = cryptographicTokenGenerator;
        this.O = n;
        this.V = dArray;
        super(d2, d3, d4);
        this.q = false;
    }
}

