/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import a.XF;
import com.app.system.health.HealthJudge;
import com.exception.system.CustomSystemException;
import com.network.protocol.MultiProtocolDataContainer;
import com.resource.management.MultiResourceOrchestrator;
import com.security.auth.AuthenticationProtocol;
import com.system.integration.SystemIntegrationProfile;
import com.system.resource.ResourceAllocationTracker144;

public class NetworkProtocolHandler1207
implements AuthenticationProtocol {
    private XF x = new XF();
    private MultiProtocolDataContainer S;
    private XF h = new XF();
    private String z;

    public NetworkProtocolHandler1207(String string) {
        this.z = string;
    }

    @Override
    public void r(MultiResourceOrchestrator multiResourceOrchestrator, ResourceAllocationTracker144 resourceAllocationTracker144) {
        for (MultiProtocolDataContainer multiProtocolDataContainer : multiResourceOrchestrator.S) {
            try {
                if (!multiProtocolDataContainer.T.equals(this.z)) continue;
                this.S = multiProtocolDataContainer;
                this.x.R(new HealthJudge(25, 0));
                this.x.R(new SystemIntegrationProfile(180, multiResourceOrchestrator.e, multiProtocolDataContainer.T, multiProtocolDataContainer.m));
                this.h.R(new HealthJudge(25, 0));
                this.h.R(new SystemIntegrationProfile(181, multiResourceOrchestrator.e, multiProtocolDataContainer.T, multiProtocolDataContainer.m));
            }
            catch (CustomSystemException customSystemException) {
                throw NetworkProtocolHandler1207.a(customSystemException);
            }
        }
    }

    @Override
    public boolean o() {
        return false;
    }

    @Override
    public XF S() {
        return this.x;
    }

    @Override
    public String V() {
        return null;
    }

    @Override
    public AuthenticationProtocol N(Class clazz) {
        return this;
    }

    @Override
    public XF h() {
        return this.h;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public String T() {
        return this.S.m;
    }
}

