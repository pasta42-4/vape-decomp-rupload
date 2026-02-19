/*
 * Decompiled with CFR 0.152.
 */
package com.system.config;

import a._c;
import com.bytecode.analysis.BinaryCodeAnalyzer;
import com.bytecode.analysis.BytecodeAnalysisEngine305;
import com.bytecode.analysis.BytecodeInspectionEngine;
import com.bytecode.exception.BytecodeProcessingException;
import com.error.handling.ContextualExceptionHandler;
import com.exception.system.CustomSystemException;
import com.reflection.registry.MetaclassDefinitionRegistry;

public final class ResourceConfigurationBuilder
extends _c {
    @Override
    public String l() {
        try {
            if (this.G.R()) {
                return "<clinit>";
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceConfigurationBuilder.a(customSystemException);
        }
        return this.k.P();
    }

    protected ResourceConfigurationBuilder(BytecodeInspectionEngine bytecodeInspectionEngine, MetaclassDefinitionRegistry metaclassDefinitionRegistry) {
        super(metaclassDefinitionRegistry, bytecodeInspectionEngine);
    }

    public boolean N() {
        return this.G.O();
    }

    int p(BinaryCodeAnalyzer binaryCodeAnalyzer) throws ContextualExceptionHandler {
        BytecodeAnalysisEngine305 bytecodeAnalysisEngine305 = binaryCodeAnalyzer.h();
        try {
            bytecodeAnalysisEngine305.W();
            return bytecodeAnalysisEngine305.S();
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw new ContextualExceptionHandler(bytecodeProcessingException);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public boolean Y() {
        return this.G.R();
    }
}

