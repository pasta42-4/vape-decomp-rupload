/*
 * Decompiled with CFR 0.152.
 */
package com.bytecode.exception;

import com.bytecode.analysis.BytecodeInspectionEngine;

public class BytecodeProcessingException
extends Exception {
    private static final long serialVersionUID = 1L;

    public BytecodeProcessingException(BytecodeInspectionEngine bytecodeInspectionEngine, Throwable throwable) {
        super(bytecodeInspectionEngine.toString() + " in " + bytecodeInspectionEngine.v().j() + ": " + throwable.getMessage(), throwable);
    }

    public BytecodeProcessingException(String string) {
        super(string);
    }

    public BytecodeProcessingException(String string, Throwable throwable) {
        super(string, throwable);
    }

    public BytecodeProcessingException(int n) {
        super("bytecode " + n);
    }
}

