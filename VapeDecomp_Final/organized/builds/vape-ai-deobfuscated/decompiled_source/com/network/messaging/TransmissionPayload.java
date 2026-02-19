/*
 * Decompiled with CFR 0.152.
 */
package com.network.messaging;

import com.data.persistence.PersistenceRecord;
import com.data.processing.MultiOperationProcessor;
import com.system.compilation.CompilationDiagnosticException;

public class TransmissionPayload
extends PersistenceRecord {
    private static final long serialVersionUID = 1L;
    protected String e;

    @Override
    public void z(MultiOperationProcessor multiOperationProcessor) throws CompilationDiagnosticException {
        multiOperationProcessor.T(this);
    }

    public TransmissionPayload(String string) {
        this.e = string;
    }

    @Override
    public String toString() {
        return this.e;
    }

    public String e() {
        return this.e;
    }
}

