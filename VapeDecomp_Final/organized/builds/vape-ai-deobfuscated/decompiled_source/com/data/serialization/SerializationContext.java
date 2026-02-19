/*
 * Decompiled with CFR 0.152.
 */
package com.data.serialization;

import com.data.processing.MultiOperationProcessor;
import com.network.messaging.TransmissionPayload;
import com.reverse.engineering.DecompilationAnalyzer;
import com.system.compilation.CompilationDiagnosticException;

public class SerializationContext
extends TransmissionPayload {
    private DecompilationAnalyzer L = null;
    private static final long serialVersionUID = 1L;

    public SerializationContext(String string) {
        super(string);
    }

    public DecompilationAnalyzer L() {
        return this.L;
    }

    public void Q(DecompilationAnalyzer decompilationAnalyzer) {
        this.L = decompilationAnalyzer;
    }

    @Override
    public void z(MultiOperationProcessor multiOperationProcessor) throws CompilationDiagnosticException {
        multiOperationProcessor.J(this);
    }
}

