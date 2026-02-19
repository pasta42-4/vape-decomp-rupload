/*
 * Decompiled with CFR 0.152.
 */
package com.device.configuration;

import com.bytecode.transformation.BytecodeInstrumentationEngine;
import com.data.collection.CollectionOrchestrator1895;

public class DeviceConfigurationProfile
extends CollectionOrchestrator1895 {
    public String y;
    public boolean e;
    public String E;
    public String Z;

    public void T(BytecodeInstrumentationEngine bytecodeInstrumentationEngine) {
        bytecodeInstrumentationEngine.M(this.Q, this.y, this.E, this.Z, this.e);
        this.m(bytecodeInstrumentationEngine);
    }

    public DeviceConfigurationProfile(int n, String string, String string2, String string3, boolean bl) {
        super(n);
        this.y = string;
        this.E = string2;
        this.Z = string3;
        this.e = bl;
    }
}

