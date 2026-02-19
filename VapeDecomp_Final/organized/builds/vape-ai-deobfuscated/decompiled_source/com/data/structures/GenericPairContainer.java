/*
 * Decompiled with CFR 0.152.
 */
package com.data.structures;

import com.data.persistence.PersistenceRecord;
import com.data.processing.MultiOperationProcessor;
import com.exception.system.CustomSystemException;
import com.system.compilation.CompilationDiagnosticException;

public class GenericPairContainer
extends PersistenceRecord {
    protected PersistenceRecord w;
    protected PersistenceRecord Z;
    private static final long serialVersionUID = 1L;

    public GenericPairContainer(PersistenceRecord persistenceRecord, PersistenceRecord persistenceRecord2) {
        this.Z = persistenceRecord;
        this.w = persistenceRecord2;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public PersistenceRecord Z() {
        return this.Z;
    }

    @Override
    public PersistenceRecord u() {
        return this.w;
    }

    @Override
    public void z(MultiOperationProcessor multiOperationProcessor) throws CompilationDiagnosticException {
        multiOperationProcessor.g(this);
    }

    @Override
    public String toString() {
        String string;
        StringBuilder stringBuilder;
        String string2;
        StringBuilder stringBuilder2;
        StringBuilder stringBuilder3 = new StringBuilder();
        try {
            stringBuilder3.append("(<Pair> ");
            stringBuilder2 = stringBuilder3;
            string2 = this.Z == null ? "<null>" : this.Z.toString();
        }
        catch (CustomSystemException customSystemException) {
            throw GenericPairContainer.a(customSystemException);
        }
        try {
            stringBuilder2.append(string2);
            stringBuilder3.append(" . ");
            stringBuilder = stringBuilder3;
            string = this.w == null ? "<null>" : this.w.toString();
        }
        catch (CustomSystemException customSystemException) {
            throw GenericPairContainer.a(customSystemException);
        }
        stringBuilder.append(string);
        stringBuilder3.append(')');
        return stringBuilder3.toString();
    }

    @Override
    public void M(PersistenceRecord persistenceRecord) {
        this.Z = persistenceRecord;
    }
}

