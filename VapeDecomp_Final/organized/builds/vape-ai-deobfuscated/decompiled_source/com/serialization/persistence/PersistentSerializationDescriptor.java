/*
 * Decompiled with CFR 0.152.
 */
package com.serialization.persistence;

import a.eF;
import com.app.security.crypto.CryptographicPrimitiveManager;
import com.data.persistence.PersistenceRecord;
import com.data.processing.MultiOperationProcessor;
import com.system.compilation.CompilationDiagnosticException;

public class PersistentSerializationDescriptor
extends CryptographicPrimitiveManager {
    private static final long serialVersionUID = 1L;

    @Override
    public void z(MultiOperationProcessor multiOperationProcessor) throws CompilationDiagnosticException {
        multiOperationProcessor.J(this);
    }

    private PersistentSerializationDescriptor(int n, PersistenceRecord persistenceRecord, eF eF2) {
        super(n, persistenceRecord, eF2);
    }

    public static PersistentSerializationDescriptor O(int n, PersistenceRecord persistenceRecord, PersistenceRecord persistenceRecord2) {
        return new PersistentSerializationDescriptor(n, persistenceRecord, new eF(persistenceRecord2));
    }
}

