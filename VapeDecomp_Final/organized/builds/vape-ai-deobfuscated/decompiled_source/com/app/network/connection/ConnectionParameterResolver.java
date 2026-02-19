/*
 * Decompiled with CFR 0.152.
 */
package com.app.network.connection;

import com.bytecode.analysis.BytecodeMetadataAnalyzer;

public class ConnectionParameterResolver {
    public String v;
    public String j;
    public String x;
    public int i;

    public void N(BytecodeMetadataAnalyzer bytecodeMetadataAnalyzer) {
        bytecodeMetadataAnalyzer.G(this.v, this.j, this.x, this.i);
    }

    public ConnectionParameterResolver(String string, String string2, String string3, int n) {
        this.v = string;
        this.j = string2;
        this.x = string3;
        this.i = n;
    }
}

