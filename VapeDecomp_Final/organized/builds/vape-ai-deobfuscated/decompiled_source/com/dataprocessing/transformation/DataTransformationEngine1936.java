/*
 * Decompiled with CFR 0.152.
 */
package com.dataprocessing.transformation;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.debugging.analysis.ExceptionAnalyzer;
import com.exception.system.CustomSystemException;

public abstract class DataTransformationEngine1936
extends ExceptionAnalyzer {
    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public int C(BytecodeAnalyzer bytecodeAnalyzer) {
        return bytecodeAnalyzer.l(this.n());
    }

    @Override
    public int G() {
        return 7;
    }

    @Override
    public boolean o(ExceptionAnalyzer exceptionAnalyzer) {
        try {
            if (exceptionAnalyzer.p()) {
                return exceptionAnalyzer.o(this);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataTransformationEngine1936.a(customSystemException);
        }
        return this.n().equals(exceptionAnalyzer.n());
    }

    public abstract void O(ExceptionAnalyzer var1);
}

