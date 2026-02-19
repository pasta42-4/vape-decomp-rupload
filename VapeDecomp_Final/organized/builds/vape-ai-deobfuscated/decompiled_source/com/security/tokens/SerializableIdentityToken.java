/*
 * Decompiled with CFR 0.152.
 */
package com.security.tokens;

import com.data.persistence.PersistenceRecord;
import com.data.processing.MultiOperationProcessor;
import com.system.compilation.CompilationDiagnosticException;

public class SerializableIdentityToken
extends PersistenceRecord {
    private static final long serialVersionUID = 1L;
    protected int K;

    public SerializableIdentityToken(int n) {
        this.K = n;
    }

    @Override
    public String toString() {
        return "id:" + this.K;
    }

    public int X() {
        return this.K;
    }

    @Override
    public void z(MultiOperationProcessor multiOperationProcessor) throws CompilationDiagnosticException {
        multiOperationProcessor.m(this);
    }
}

