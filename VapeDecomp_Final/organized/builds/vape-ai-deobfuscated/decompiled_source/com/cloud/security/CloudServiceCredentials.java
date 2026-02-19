/*
 * Decompiled with CFR 0.152.
 */
package com.cloud.security;

import com.app.configuration.ConfigurationDescriptor1455;
import com.bytecode.transformation.BytecodeInstrumentationEngine;
import com.data.collection.CollectionOrchestrator1895;

public class CloudServiceCredentials
extends CollectionOrchestrator1895 {
    public String g;
    public Object[] L;
    public String z;
    public ConfigurationDescriptor1455 v;

    public CloudServiceCredentials(String string, String string2, ConfigurationDescriptor1455 configurationDescriptor1455, Object ... objectArray) {
        super(186);
        this.g = string;
        this.z = string2;
        this.v = configurationDescriptor1455;
        this.L = objectArray;
    }

    public void T(BytecodeInstrumentationEngine bytecodeInstrumentationEngine) {
        bytecodeInstrumentationEngine.f(this.g, this.z, this.v, this.L);
        this.m(bytecodeInstrumentationEngine);
    }
}

