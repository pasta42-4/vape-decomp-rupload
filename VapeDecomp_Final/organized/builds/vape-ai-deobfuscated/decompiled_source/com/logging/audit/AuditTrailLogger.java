/*
 * Decompiled with CFR 0.152.
 */
package com.logging.audit;

import a.eF;
import com.app.core.config.ConfigurationManager2183;
import com.app.security.crypto.CryptographicPrimitiveManager;
import com.data.persistence.PersistenceRecord;
import com.data.processing.MultiOperationProcessor;
import com.system.compilation.CompilationDiagnosticException;

public class AuditTrailLogger
extends CryptographicPrimitiveManager {
    private static final long serialVersionUID = 1L;
    private ConfigurationManager2183 f = null;

    public void M(ConfigurationManager2183 configurationManager2183) {
        this.f = configurationManager2183;
    }

    @Override
    public void z(MultiOperationProcessor multiOperationProcessor) throws CompilationDiagnosticException {
        multiOperationProcessor.f(this);
    }

    public ConfigurationManager2183 D() {
        return this.f;
    }

    public static AuditTrailLogger e(PersistenceRecord persistenceRecord, PersistenceRecord persistenceRecord2) {
        return new AuditTrailLogger(persistenceRecord, new eF(persistenceRecord2));
    }

    private AuditTrailLogger(PersistenceRecord persistenceRecord, eF eF2) {
        super(67, persistenceRecord, eF2);
    }
}

