/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.analysis;

import a.eF;
import com.data.persistence.PersistenceRecord;
import com.data.processing.MultiOperationProcessor;
import com.security.transform.SecureDataTransformer1124;
import com.system.compilation.CompilationDiagnosticException;

public class TypeInspectionUtility1890
extends SecureDataTransformer1124 {
    private static final long serialVersionUID = 1L;

    public TypeInspectionUtility1890(eF eF2, int n, PersistenceRecord persistenceRecord) {
        super(eF2, n, persistenceRecord);
    }

    @Override
    public String v() {
        return "instanceof:" + this.E + ":" + this.R;
    }

    @Override
    public void z(MultiOperationProcessor multiOperationProcessor) throws CompilationDiagnosticException {
        multiOperationProcessor.B(this);
    }

    public TypeInspectionUtility1890(int n, int n2, PersistenceRecord persistenceRecord) {
        super(n, n2, persistenceRecord);
    }
}

