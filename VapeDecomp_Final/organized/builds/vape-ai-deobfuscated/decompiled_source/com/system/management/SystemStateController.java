/*
 * Decompiled with CFR 0.152.
 */
package com.system.management;

import com.security.crypto.CipherManager;

public class SystemStateController
extends CipherManager {
    private boolean vj;
    private int vG;

    @Override
    public double e() {
        return 110.0;
    }

    public SystemStateController(boolean bl, String string, boolean bl2) {
        super(string);
        this.vj = bl2;
        this.b = bl ? SystemStateController.M.O : SystemStateController.M.Y;
    }

    @Override
    public void O() {
    }

    public SystemStateController(boolean bl, String string) {
        this(bl, string, false);
    }

    @Override
    public double z() {
        return 20.0;
    }

    public boolean q() {
        return this.vj;
    }

    @Override
    public double I() {
        return this.w() - 35.0;
    }

    public int o() {
        return this.vG;
    }
}

