/*
 * Decompiled with CFR 0.152.
 */
package com.graphics.rendering;

import com.app.events.GenericEventDispatcher2175;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.indexing.metadata.MetadataIndexingService;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.runtime.context.LightweightExecutionContext;
import com.system.configuration.ConfigurationCalibrator;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.monitoring.RuntimeResourceTracker;
import com.ui.input.UserInputEventMapper;
import com.validation.core.ObjectValidator;

public class GraphicRenderBuffer
extends GenericEventDispatcher2175 {
    private int e = 1;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private boolean t() {
        boolean bl;
        block28: {
            block27: {
                boolean bl2;
                block26: {
                    block25: {
                        block24: {
                            block23: {
                                block21: {
                                    try {
                                        try {
                                            if (!((MetadataIndexingService)this.n()).G() || DynamicContextBroker.H()) break block21;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw GraphicRenderBuffer.a(customSystemException);
                                        }
                                        return false;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GraphicRenderBuffer.a(customSystemException);
                                    }
                                }
                                bl = true;
                                SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                                LightweightExecutionContext lightweightExecutionContext = systemConfigurationOrchestrator.a();
                                try {
                                    block22: {
                                        try {
                                            try {
                                                if (lightweightExecutionContext.Y() || lightweightExecutionContext.C().Y()) break block22;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw GraphicRenderBuffer.a(customSystemException);
                                            }
                                            if (RuntimeResourceTracker.a(lightweightExecutionContext.C())) break block23;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw GraphicRenderBuffer.a(customSystemException);
                                        }
                                    }
                                    return false;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GraphicRenderBuffer.a(customSystemException);
                                }
                            }
                            bl2 = false;
                            NetworkPacketInterceptor1107 networkPacketInterceptor1107 = ConfigurationCalibrator.b.B();
                            try {
                                if (!networkPacketInterceptor1107.r() || !networkPacketInterceptor1107.q().equals(ObjectValidator.B())) break block24;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicRenderBuffer.a(customSystemException);
                            }
                            bl2 = true;
                        }
                        try {
                            try {
                                if (this.e != 1 || !bl2) break block25;
                                break block26;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicRenderBuffer.a(customSystemException);
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GraphicRenderBuffer.a(customSystemException);
                        }
                    }
                    bl = false;
                    int n = 3;
                    try {
                        if (this.e >= n) {
                            this.e = 0;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicRenderBuffer.a(customSystemException);
                    }
                }
                try {
                    if (!bl2) break block27;
                    ++this.e;
                    break block28;
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicRenderBuffer.a(customSystemException);
                }
            }
            this.e = 1;
        }
        return bl;
    }

    @DataExchangeProtocol2090
    public void J(UserInputEventMapper userInputEventMapper) {
        block11: {
            try {
                if (!((MetadataIndexingService)this.n()).n()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicRenderBuffer.a(customSystemException);
            }
            int n = -100 + userInputEventMapper.getButton();
            try {
                try {
                    try {
                        try {
                            if (!userInputEventMapper.getButtonState() || n != ApplicationLifecycleManager.N().D().t()) break block11;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GraphicRenderBuffer.a(customSystemException);
                        }
                        if (!((MetadataIndexingService)this.n()).G()) break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicRenderBuffer.a(customSystemException);
                    }
                    if (!DynamicContextBroker.e()) break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicRenderBuffer.a(customSystemException);
                }
                userInputEventMapper.setCanceled(true);
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicRenderBuffer.a(customSystemException);
            }
        }
    }

    @Override
    public boolean I() {
        return this.t();
    }

    @Override
    public boolean y() {
        return this.I();
    }

    public GraphicRenderBuffer(ContextualExecutionFramework contextualExecutionFramework, String string) {
        super(contextualExecutionFramework, string);
    }
}

