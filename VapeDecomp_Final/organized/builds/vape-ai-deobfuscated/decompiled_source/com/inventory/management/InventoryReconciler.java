/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.inventory.management;

import com.configuration.management.ConfigurationParameterController;
import com.exception.system.CustomSystemException;
import com.network.protocol.ProtocolInteractionController;
import com.runtime.context.LightweightExecutionContext;
import com.temporal.metadata.TemporalMetadataResolver;
import org.jetbrains.annotations.Nullable;

public class InventoryReconciler {
    private final ProtocolInteractionController O;
    private final ConfigurationParameterController Y;
    private final LightweightExecutionContext G;

    public InventoryReconciler(ConfigurationParameterController configurationParameterController, LightweightExecutionContext lightweightExecutionContext, ProtocolInteractionController protocolInteractionController) {
        this.Y = configurationParameterController;
        this.G = lightweightExecutionContext;
        this.O = protocolInteractionController;
    }

    public ConfigurationParameterController q() {
        return this.Y;
    }

    public InventoryReconciler(ConfigurationParameterController configurationParameterController, LightweightExecutionContext lightweightExecutionContext) {
        this(configurationParameterController, lightweightExecutionContext, lightweightExecutionContext.C());
    }

    public ProtocolInteractionController V() {
        return this.O;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Nullable
    public static InventoryReconciler r(LightweightExecutionContext lightweightExecutionContext) {
        block4: {
            try {
                try {
                    if (lightweightExecutionContext != null && !lightweightExecutionContext.Y()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw InventoryReconciler.a(customSystemException);
                }
                return null;
            }
            catch (CustomSystemException customSystemException) {
                throw InventoryReconciler.a(customSystemException);
            }
        }
        ConfigurationParameterController configurationParameterController = TemporalMetadataResolver.h.x().V(lightweightExecutionContext);
        return new InventoryReconciler(configurationParameterController, lightweightExecutionContext);
    }

    public LightweightExecutionContext T() {
        return this.G;
    }
}

