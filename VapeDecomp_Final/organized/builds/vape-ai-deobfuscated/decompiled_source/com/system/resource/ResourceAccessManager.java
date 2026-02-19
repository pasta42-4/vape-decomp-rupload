/*
 * Decompiled with CFR 0.152.
 */
package com.system.resource;

import com.app.network.protocol.NetworkProtocolHandler1163;
import com.app.plugin.lifecycle.PluginLifecycleContract;
import com.encryption.codec.CipherTextEncoder;
import com.exception.system.CustomSystemException;
import com.network.protocol.ProtocolInteractionController;
import com.resource.management.CloneableResourceDescriptor;
import com.runtime.context.LightweightExecutionContext;

public class ResourceAccessManager
extends NetworkProtocolHandler1163 {
    ResourceAccessManager(CipherTextEncoder cipherTextEncoder) {
        super(cipherTextEncoder);
    }

    @Override
    public boolean z(CloneableResourceDescriptor cloneableResourceDescriptor) {
        boolean bl;
        block14: {
            block12: {
                block15: {
                    ProtocolInteractionController protocolInteractionController;
                    LightweightExecutionContext lightweightExecutionContext;
                    block13: {
                        ProtocolInteractionController protocolInteractionController2;
                        PluginLifecycleContract pluginLifecycleContract = cloneableResourceDescriptor.i();
                        lightweightExecutionContext = cloneableResourceDescriptor.W();
                        try {
                            protocolInteractionController2 = lightweightExecutionContext != null ? lightweightExecutionContext.C() : null;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAccessManager.b(customSystemException);
                        }
                        protocolInteractionController = protocolInteractionController2;
                        bl = false;
                        try {
                            try {
                                try {
                                    if (this.V().isEmpty()) break block12;
                                    if (pluginLifecycleContract == null) break block13;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ResourceAccessManager.b(customSystemException);
                                }
                                if (this.V().contains(pluginLifecycleContract)) break block13;
                                break block14;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceAccessManager.b(customSystemException);
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAccessManager.b(customSystemException);
                        }
                    }
                    try {
                        try {
                            if (lightweightExecutionContext == null || !this.V().stream().noneMatch(arg_0 -> ResourceAccessManager.lambda$isAvailableToItem$0(lightweightExecutionContext, protocolInteractionController, arg_0))) break block15;
                            break block14;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAccessManager.b(customSystemException);
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAccessManager.b(customSystemException);
                    }
                }
                bl = true;
                break block14;
            }
            bl = true;
        }
        return bl;
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static boolean lambda$isAvailableToItem$0(LightweightExecutionContext lightweightExecutionContext, ProtocolInteractionController protocolInteractionController, PluginLifecycleContract pluginLifecycleContract) {
        return pluginLifecycleContract.L(lightweightExecutionContext, protocolInteractionController);
    }
}

