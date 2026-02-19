/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import com.configuration.management.ConfigurationParameterController;
import com.data.organization.ComparativeDataOrganizer;
import com.exception.system.CustomSystemException;
import com.network.protocol.ProtocolInteractionController;
import com.plugin.management.PluginRegistrar;
import com.resource.management.ComparativeResourceAllocator;
import com.runtime.context.LightweightExecutionContext;
import com.security.enums.SecurityStateEnum;
import com.temporal.metadata.TemporalMetadataResolver;
import java.util.Map;

public class NetworkConnectionManager1645
extends ComparativeDataOrganizer {
    private final Map<String, SecurityStateEnum> L;

    public NetworkConnectionManager1645(PluginRegistrar pluginRegistrar) {
        super(pluginRegistrar);
        this.L = pluginRegistrar.k();
    }

    public static PluginRegistrar f(ComparativeResourceAllocator<?> comparativeResourceAllocator) {
        return new PluginRegistrar(comparativeResourceAllocator, null);
    }

    @Override
    public boolean L(LightweightExecutionContext lightweightExecutionContext, ProtocolInteractionController protocolInteractionController) {
        try {
            if (this.L.isEmpty()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionManager1645.a(customSystemException);
        }
        ConfigurationParameterController configurationParameterController = TemporalMetadataResolver.h.x().V(lightweightExecutionContext);
        try {
            if (configurationParameterController == null) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionManager1645.a(customSystemException);
        }
        for (Map.Entry<String, SecurityStateEnum> entry : this.L.entrySet()) {
            String string = entry.getKey();
            SecurityStateEnum securityStateEnum = entry.getValue();
            try {
                if (!securityStateEnum.c().test(configurationParameterController.o(), string)) continue;
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw NetworkConnectionManager1645.a(customSystemException);
            }
        }
        return false;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

