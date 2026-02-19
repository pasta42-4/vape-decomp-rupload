/*
 * Decompiled with CFR 0.152.
 */
package com.game.core;

import com.computation.adaptive.AdaptiveComputationEngine668;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.stream.processing.StreamProcessingOrchestrator372;
import com.ui.events.UserInteractionEventDispatcher;

class GameStateInterceptor
extends AdaptiveComputationEngine668 {
    final StreamProcessingOrchestrator372 jD;

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        super.Z(userInteractionEventDispatcher);
        this.jD.Z(userInteractionEventDispatcher);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    protected void x() {
        double d2 = 0.0;
        double d3 = this.W() + this.b() / 2.0;
        for (AbstractComputationKernel abstractComputationKernel : StreamProcessingOrchestrator372.B(this.jD)) {
            try {
                abstractComputationKernel.b(this.G() + (double)super.q() + d2);
                abstractComputationKernel.M(d3 - abstractComputationKernel.b() / 2.0);
                if (abstractComputationKernel.G()) {
                    abstractComputationKernel.N();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GameStateInterceptor.a(customSystemException);
            }
            abstractComputationKernel.E();
            d2 += abstractComputationKernel.w() + 2.0;
        }
    }

    @Override
    public float q() {
        float f = 0.0f;
        for (AbstractComputationKernel abstractComputationKernel : StreamProcessingOrchestrator372.B(this.jD)) {
            f += (float)abstractComputationKernel.w() + 2.0f;
        }
        return super.q() + (f + 2.0f);
    }

    @Override
    public void J() {
        try {
            if (this.a().isEmpty()) {
                this.jD.Z();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GameStateInterceptor.a(customSystemException);
        }
    }

    GameStateInterceptor(StreamProcessingOrchestrator372 streamProcessingOrchestrator372, String string, boolean bl, boolean bl2) {
        this.jD = streamProcessingOrchestrator372;
        super(string, bl, bl2);
    }
}

