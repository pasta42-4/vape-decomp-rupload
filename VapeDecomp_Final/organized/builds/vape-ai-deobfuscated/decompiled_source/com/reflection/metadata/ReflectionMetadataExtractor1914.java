/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.metadata;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.bytecode.exception.BytecodeProcessingException;
import com.development.tools.DecompilationErrorHandler1089;
import com.resource.core.BaseResourceManager;

public class ReflectionMetadataExtractor1914
extends BaseResourceManager {
    int c;

    public String toString() {
        return this.w().replace('$', '.') + ".class";
    }

    public String w() {
        String string = this.R.Z(this.c);
        try {
            return DecompilationErrorHandler1089.K(string).y();
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw new RuntimeException(bytecodeProcessingException);
        }
    }

    public ReflectionMetadataExtractor1914(int n, BytecodeAnalyzer bytecodeAnalyzer) {
        super('c', bytecodeAnalyzer);
        this.c = n;
    }
}

