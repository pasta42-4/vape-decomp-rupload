/*
 * Decompiled with CFR 0.152.
 */
package com.data.persistence;

import a.eF;
import com.data.persistence.PersistenceRecord;
import com.data.processing.MultiOperationProcessor;
import com.system.compilation.CompilationDiagnosticException;

public class PersistenceManagerAdapter
extends eF {
    private static final long serialVersionUID = 1L;

    public void R(PersistenceRecord persistenceRecord) {
        this.n().n().q(persistenceRecord);
    }

    public PersistenceRecord x() {
        return this.n().l();
    }

    public PersistenceRecord s() {
        return this.l();
    }

    @Override
    public String v() {
        return "?:";
    }

    public PersistenceManagerAdapter(PersistenceRecord persistenceRecord, PersistenceRecord persistenceRecord2, PersistenceRecord persistenceRecord3) {
        super(persistenceRecord, new eF(persistenceRecord2, new eF(persistenceRecord3)));
    }

    @Override
    public void z(MultiOperationProcessor multiOperationProcessor) throws CompilationDiagnosticException {
        multiOperationProcessor.C(this);
    }

    public void B(PersistenceRecord persistenceRecord) {
        this.n().q(persistenceRecord);
    }

    public PersistenceRecord k() {
        return this.n().n().l();
    }
}

