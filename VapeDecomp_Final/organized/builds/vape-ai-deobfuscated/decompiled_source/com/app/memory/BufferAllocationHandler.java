/*
 * Decompiled with CFR 0.152.
 */
package com.app.memory;

import a.Sc;
import a.ff;
import a.vM;
import com.core.computation.AbstractComputationKernel;
import com.security.streaming.StreamCipherOrchestrator183;
import com.system.configuration.ConfigurationManager;

class BufferAllocationHandler
extends AbstractComputationKernel {
    private final StreamCipherOrchestrator183 b;
    private final Sc B;
    private final vM F;
    private final ff L;

    @Override
    public double z() {
        return 8.0;
    }

    @Override
    public void G() {
        ConfigurationManager.S(this.G(), this.W(), this.w() + 1.0, this.b() + 1.0, BufferAllocationHandler.M.a);
        this.L.b(this.G() + 0.5);
        this.L.M(this.W() + 0.5);
        this.L.T(this.w());
        this.L.w(this.b());
        this.L.k(6.0f);
        this.L.w(6.0f);
        this.L.r(0.5f);
    }

    public BufferAllocationHandler(StreamCipherOrchestrator183 streamCipherOrchestrator183, Sc sc, vM vM2) {
        this.b = streamCipherOrchestrator183;
        this.L(streamCipherOrchestrator183);
        this.B = sc;
        this.F = vM2;
        this.L = new ff(vM2.A());
        this.n(true);
        this.o(this.L);
    }

    @Override
    public double e() {
        return 8.0;
    }
}

