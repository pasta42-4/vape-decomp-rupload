/*
 * Decompiled with CFR 0.152.
 */
package com.util.serialization;

import a.eF;
import com.data.persistence.PersistenceRecord;
import com.data.processing.MultiOperationProcessor;
import com.exception.system.CustomSystemException;
import com.system.compilation.CompilationDiagnosticException;

public class SerializationUtility
extends eF {
    private static final long serialVersionUID = 1L;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void z(MultiOperationProcessor multiOperationProcessor) throws CompilationDiagnosticException {
        multiOperationProcessor.J(this);
    }

    public SerializationUtility(PersistenceRecord persistenceRecord) {
        super(persistenceRecord);
    }

    public int S() {
        int n;
        block4: {
            n = this.U();
            try {
                try {
                    if (n != 1 || this.l() != null) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw SerializationUtility.a(customSystemException);
                }
                return 0;
            }
            catch (CustomSystemException customSystemException) {
                throw SerializationUtility.a(customSystemException);
            }
        }
        return n;
    }

    @Override
    public String v() {
        return "array";
    }
}

