/*
 * Decompiled with CFR 0.152.
 */
package com.deobfuscation.execution;

import com.app.event.core.EventDispatchController1186;
import com.bytecode.analysis.BytecodeAnalysisEngine1263;
import com.bytecode.analysis.DecompilationErrorHandler;

public class CodeExecutionHandler
extends EventDispatchController1186 {
    @Override
    protected BytecodeAnalysisEngine1263[] j(int n) {
        return new DecompilationErrorHandler[n];
    }

    @Override
    protected BytecodeAnalysisEngine1263 X(int n) {
        return new DecompilationErrorHandler(n);
    }
}

