/*
 * Decompiled with CFR 0.152.
 */
package com.session.management;

import a.h6;
import com.codec.transformation.EncodingTransformationEngine;
import java.awt.Color;

class SessionTimeoutHandler
extends h6 {
    final EncodingTransformationEngine FI;

    @Override
    public double z() {
        return 8.0;
    }

    @Override
    public double e() {
        return this.J().D(this.O()) + 3.0;
    }

    SessionTimeoutHandler(EncodingTransformationEngine encodingTransformationEngine, String string, Color color) {
        this.FI = encodingTransformationEngine;
        super(string, color);
    }
}

