/*
 * Decompiled with CFR 0.152.
 */
package com.policy.management;

import a.Z1;
import com.configuration.management.ConfigurationParameterManager1397;
import com.data.organization.ComparativeDataOrganizer;
import com.exception.system.CustomSystemException;
import com.network.protocol.ProtocolInteractionController;
import com.resource.management.ComparativeResourceAllocator;
import com.runtime.context.LightweightExecutionContext;
import com.security.crypto.CryptographicInterface;
import java.util.ArrayList;
import java.util.List;

public class PolicyOrchestrator
extends ComparativeDataOrganizer {
    private final List<Class<?>> j = new ArrayList();
    private final Z1 F;
    private CryptographicInterface a;
    private static int[] e;

    static {
        if (PolicyOrchestrator.z() != null) {
            PolicyOrchestrator.m(new int[1]);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public CryptographicInterface A() {
        return this.a;
    }

    public static int[] z() {
        return e;
    }

    @Override
    public void G(CryptographicInterface cryptographicInterface) {
        this.a = cryptographicInterface;
    }

    public PolicyOrchestrator(ConfigurationParameterManager1397 configurationParameterManager1397) {
        super(configurationParameterManager1397);
        this.j.addAll(configurationParameterManager1397.r());
        this.F = configurationParameterManager1397.r();
    }

    @Override
    public boolean L(LightweightExecutionContext lightweightExecutionContext, ProtocolInteractionController protocolInteractionController) {
        try {
            if (this.F == Z1.WHITELIST) {
                return this.j.stream().anyMatch(protocolInteractionController::B);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PolicyOrchestrator.a(customSystemException);
        }
        return this.j.stream().noneMatch(protocolInteractionController::B);
    }

    public static void m(int[] nArray) {
        e = nArray;
    }

    public static ConfigurationParameterManager1397 x(ComparativeResourceAllocator<?> comparativeResourceAllocator) {
        return new ConfigurationParameterManager1397(comparativeResourceAllocator, null);
    }
}

