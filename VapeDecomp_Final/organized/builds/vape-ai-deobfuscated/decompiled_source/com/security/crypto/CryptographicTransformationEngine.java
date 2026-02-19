/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import a.Dv;

public class CryptographicTransformationEngine
extends Dv {
    int d;
    int D;
    int I;

    @Override
    public int o() {
        return this.d;
    }

    @Override
    public int j() {
        return this.I;
    }

    public CryptographicTransformationEngine(int n, int n2, int n3) {
        super(null);
        this.d = n;
        this.D = n2;
        this.I = n3;
    }

    @Override
    public int q() {
        return this.D;
    }
}

