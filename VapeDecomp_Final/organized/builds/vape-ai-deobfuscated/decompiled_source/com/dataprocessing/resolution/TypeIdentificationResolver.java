/*
 * Decompiled with CFR 0.152.
 */
package com.dataprocessing.resolution;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.debugging.analysis.ExceptionAnalyzer;
import com.reflection.mapping.ReflectionClassMapper;

public class TypeIdentificationResolver
extends ReflectionClassMapper {
    @Override
    public int C(BytecodeAnalyzer bytecodeAnalyzer) {
        return 0;
    }

    @Override
    public ExceptionAnalyzer r(int n) {
        return this;
    }

    public TypeIdentificationResolver() {
        super("null-type");
    }

    @Override
    public int G() {
        return 5;
    }

    @Override
    public boolean d() {
        return true;
    }
}

