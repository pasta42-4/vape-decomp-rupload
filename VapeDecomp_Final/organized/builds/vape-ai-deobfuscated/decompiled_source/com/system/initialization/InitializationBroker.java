/*
 * Decompiled with CFR 0.152.
 */
package com.system.initialization;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.debugging.analysis.ExceptionAnalyzer;
import com.system.resource.ResourceAllocationDispatcher;
import java.util.Set;

public class InitializationBroker
extends ResourceAllocationDispatcher {
    @Override
    public ResourceAllocationDispatcher d() {
        return new InitializationBroker(this.n());
    }

    String j(Set<ExceptionAnalyzer> set) {
        return "uninit:this";
    }

    @Override
    public int C(BytecodeAnalyzer bytecodeAnalyzer) {
        return 0;
    }

    InitializationBroker(String string) {
        super(-1, string);
    }

    @Override
    public int G() {
        return 6;
    }
}

