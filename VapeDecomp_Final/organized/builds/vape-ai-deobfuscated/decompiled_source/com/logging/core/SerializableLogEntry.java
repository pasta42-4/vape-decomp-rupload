/*
 * Decompiled with CFR 0.152.
 */
package com.logging.core;

import com.data.persistence.PersistenceRecord;
import com.data.processing.MultiOperationProcessor;
import com.system.compilation.CompilationDiagnosticException;

public class SerializableLogEntry
extends PersistenceRecord {
    protected String d;
    private static final long serialVersionUID = 1L;

    @Override
    public void z(MultiOperationProcessor multiOperationProcessor) throws CompilationDiagnosticException {
        multiOperationProcessor.z(this);
    }

    public SerializableLogEntry(String string) {
        this.d = string;
    }

    public String t() {
        return this.d;
    }

    @Override
    public String toString() {
        return "\"" + this.d + "\"";
    }
}

