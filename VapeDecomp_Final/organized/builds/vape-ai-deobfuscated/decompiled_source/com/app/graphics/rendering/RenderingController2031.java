/*
 * Decompiled with CFR 0.152.
 */
package com.app.graphics.rendering;

import com.security.crypto.CipherManager;
import com.security.encoding.SecureDataEncoder;

class RenderingController2031
extends CipherManager {
    final SecureDataEncoder FY;

    @Override
    public void O() {
        SecureDataEncoder.c(this.FY);
        this.y("");
    }

    @Override
    public double e() {
        return 150.0;
    }

    RenderingController2031(SecureDataEncoder secureDataEncoder, String string) {
        this.FY = secureDataEncoder;
        super(string);
    }

    @Override
    public double z() {
        return 20.0;
    }
}

