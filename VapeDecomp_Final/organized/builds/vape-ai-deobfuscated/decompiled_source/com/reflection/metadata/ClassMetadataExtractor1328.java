/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.metadata;

import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.messaging.serialization.MessageSerializationAdapter;
import com.security.cipher.AdaptiveCipherEngine;
import com.security.crypto.CryptographicParameterGenerator;
import com.system.configuration.ConfigurationManager;
import com.ui.rendering.GraphicalRenderingController;

public class ClassMetadataExtractor1328
extends AdaptiveCipherEngine {
    private String yp;
    private int yK;
    private Class yE;

    public void E(Class clazz) {
        this.yE = clazz;
        this.l(new MessageSerializationAdapter(this, clazz));
    }

    @Override
    protected void V() {
        block6: {
            try {
                try {
                    try {
                        if (this.yE == null || ((AbstractComputationKernel)GraphicalRenderingController.D(this.yE)).f() == this.j()) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ClassMetadataExtractor1328.b(customSystemException);
                    }
                    if (this.T()) break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw ClassMetadataExtractor1328.b(customSystemException);
                }
                this.X();
            }
            catch (CustomSystemException customSystemException) {
                throw ClassMetadataExtractor1328.b(customSystemException);
            }
        }
        super.V();
    }

    @Override
    protected void I() {
        CryptographicParameterGenerator cryptographicParameterGenerator = this.L(this.b5);
        double d2 = cryptographicParameterGenerator.B(this.be);
        double d3 = this.W() + this.b() / 2.0 - d2 / 2.0;
        ConfigurationManager.x(this.yp, this.G() + 5.0 + 4.0, this.W() + this.b() / 2.0, this.yK, this.yK, this.bj);
        cryptographicParameterGenerator.R(this.be, this.G() + (double)this.yK + 10.0, d3, this.bj);
    }

    @Override
    public double z() {
        return 20.0;
    }

    public ClassMetadataExtractor1328(String string, String string2, double d2, int n) {
        super(string, d2);
        this.yp = string2;
        this.yK = n;
        this.m(true);
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

