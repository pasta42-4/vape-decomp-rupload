/*
 * Decompiled with CFR 0.152.
 */
package com.system.configuration;

import com.core.computation.AbstractComputationKernel;
import com.crypto.streaming.CipherStreamProcessor;
import com.data.processing.CollectionFilterProcessor;
import com.graphics.rendering.GraphicalRenderingController249;
import com.security.crypto.CryptographicParameterGenerator;
import com.ui.events.UserInteractionEventDispatcher;
import java.awt.Color;

public class ConfigurationProfileManager1223
extends AbstractComputationKernel {
    private GraphicalRenderingController249 D;
    private boolean V;
    private String R;

    public ConfigurationProfileManager1223(String string, CollectionFilterProcessor collectionFilterProcessor, Color color) {
        this.R = string;
        this.D = new GraphicalRenderingController249(collectionFilterProcessor, color);
        this.o(this.D);
    }

    @Override
    public void G() {
        this.S();
        CryptographicParameterGenerator cryptographicParameterGenerator = this.L(0.9);
        double d2 = cryptographicParameterGenerator.B(this.R);
        cryptographicParameterGenerator.R(this.R, this.G() + 5.0, this.W() + this.b() / 2.0 - d2 / 2.0, ConfigurationProfileManager1223.M.n);
        this.D.V.a(this.w() - 12.5);
        this.D.b(this.G() + this.w() - 5.0 - this.D.w());
        this.D.M(this.W() + 5.0);
    }

    @Override
    public void U() {
    }

    @Override
    public double z() {
        return 20.0;
    }

    @Override
    public double e() {
        return 110.0;
    }

    public ConfigurationProfileManager1223(CipherStreamProcessor cipherStreamProcessor) {
        this(cipherStreamProcessor.O(), (CollectionFilterProcessor)cipherStreamProcessor.J());
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }

    @Override
    public void d() {
    }

    @Override
    public void g() {
    }

    public ConfigurationProfileManager1223(String string, CollectionFilterProcessor collectionFilterProcessor) {
        this(string, collectionFilterProcessor, null);
    }

    public GraphicalRenderingController249 I() {
        return this.D;
    }
}

