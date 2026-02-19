/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.resource.management;

import com.app.graphics.rendering.ColorPaletteRenderer;
import com.concurrency.task.AsynchronousTaskOrchestrator722;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.network.protocol.ProtocolInteractionController;
import com.runtime.context.LightweightExecutionContext;
import com.system.configuration.ConfigurationManager;
import java.awt.Color;
import org.jetbrains.annotations.Nullable;

class ResourceAllocator1289
extends AbstractComputationKernel {
    @Nullable
    private final ProtocolInteractionController B;
    @Nullable
    private final LightweightExecutionContext V;
    final AsynchronousTaskOrchestrator722 n;
    private final ColorPaletteRenderer b;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public double z() {
        return 12.0;
    }

    @Override
    public void g() {
        try {
            if (!this.s()) {
                this.b.c();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocator1289.a(customSystemException);
        }
    }

    ResourceAllocator1289(@Nullable AsynchronousTaskOrchestrator722 asynchronousTaskOrchestrator722, LightweightExecutionContext lightweightExecutionContext) {
        LightweightExecutionContext lightweightExecutionContext2;
        block10: {
            block9: {
                ProtocolInteractionController protocolInteractionController;
                block8: {
                    block7: {
                        this.n = asynchronousTaskOrchestrator722;
                        this.b = new ColorPaletteRenderer(0.15, new Color(0, 0, 0, 0), ResourceAllocator1289.M.u);
                        if (lightweightExecutionContext != null) {
                            try {
                                if (!lightweightExecutionContext.r()) break block7;
                                protocolInteractionController = lightweightExecutionContext.C();
                                break block8;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceAllocator1289.a(customSystemException);
                            }
                        }
                    }
                    protocolInteractionController = null;
                }
                try {
                    try {
                        this.B = protocolInteractionController;
                        ResourceAllocator1289 resourceAllocator1289 = this;
                        if (lightweightExecutionContext == null || !lightweightExecutionContext.r()) break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocator1289.a(customSystemException);
                    }
                    lightweightExecutionContext2 = lightweightExecutionContext;
                    break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocator1289.a(customSystemException);
                }
            }
            lightweightExecutionContext2 = null;
        }
        resourceAllocator1289.V = lightweightExecutionContext2;
    }

    @Override
    public void j() {
        this.b.c();
    }

    ResourceAllocator1289(@Nullable AsynchronousTaskOrchestrator722 asynchronousTaskOrchestrator722, ProtocolInteractionController protocolInteractionController) {
        LightweightExecutionContext lightweightExecutionContext;
        block10: {
            block9: {
                ProtocolInteractionController protocolInteractionController2;
                block8: {
                    block7: {
                        this.n = asynchronousTaskOrchestrator722;
                        this.b = new ColorPaletteRenderer(0.15, new Color(0, 0, 0, 0), ResourceAllocator1289.M.u);
                        if (protocolInteractionController != null) {
                            try {
                                if (!protocolInteractionController.r()) break block7;
                                protocolInteractionController2 = protocolInteractionController;
                                break block8;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceAllocator1289.a(customSystemException);
                            }
                        }
                    }
                    protocolInteractionController2 = null;
                }
                try {
                    try {
                        this.B = protocolInteractionController2;
                        ResourceAllocator1289 resourceAllocator1289 = this;
                        if (protocolInteractionController == null || !protocolInteractionController.r()) break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocator1289.a(customSystemException);
                    }
                    lightweightExecutionContext = LightweightExecutionContext.d(protocolInteractionController);
                    break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocator1289.a(customSystemException);
                }
            }
            lightweightExecutionContext = null;
        }
        resourceAllocator1289.V = lightweightExecutionContext;
    }

    @Override
    public void G() {
        try {
            ConfigurationManager.S(this.G(), this.W(), this.w(), this.b(), ResourceAllocator1289.M.k);
            ConfigurationManager.U(this.G(), this.W(), this.w(), this.b(), this.b.k(), 1.5f, 0.75f, 1.0f);
            if (this.V != null) {
                ConfigurationManager.h(this.V, 0.5, this.G() + 2.0, this.W() + 2.0, false);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocator1289.a(customSystemException);
        }
    }

    @Override
    public double e() {
        return 12.0;
    }
}

