/*
 * Decompiled with CFR 0.152.
 */
package com.data.transformation;

import com.data.compression.DataCompressionEngine;
import com.security.session.CipherSessionManager;
import com.system.configuration.MultiParameterConfigurator;

class DataTransformationEngine2116
extends MultiParameterConfigurator {
    final DataCompressionEngine R;

    @Override
    public double z() {
        return 0.0;
    }

    DataTransformationEngine2116(DataCompressionEngine dataCompressionEngine, CipherSessionManager cipherSessionManager, String string, String string2, double d2) {
        this.R = dataCompressionEngine;
        super(cipherSessionManager, string, string2, d2);
    }

    @Override
    public double b() {
        return 13.0;
    }
}

