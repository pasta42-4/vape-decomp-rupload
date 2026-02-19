/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import a.eF;
import com.app.network.ConnectionEstablishmentContract;
import com.app.security.crypto.CryptographicPrimitiveManager;
import com.bytecode.instrumentation.ArgumentInterceptor;
import com.data.persistence.PersistenceRecord;
import com.data.serialization.SerializationContext;
import com.entity.lifecycle.ComplexEntityLifecycleManager;
import com.logging.audit.AuditTrailLogger;
import com.metadata.reflection.ReflectionMetadataExtractor;
import com.runtime.descriptor.RuntimeDescriptorParser;
import com.system.compilation.CompilationDiagnosticException;

class NetworkConnectionManager1605
implements ConnectionEstablishmentContract {
    final PersistenceRecord H;
    final ArgumentInterceptor c;
    final String A;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    NetworkConnectionManager1605(ArgumentInterceptor argumentInterceptor, String string, PersistenceRecord persistenceRecord) {
        this.c = argumentInterceptor;
        this.A = string;
        this.H = persistenceRecord;
    }

    @Override
    public void u(ReflectionMetadataExtractor reflectionMetadataExtractor, eF eF2) throws CompilationDiagnosticException {
        PersistenceRecord persistenceRecord = new SerializationContext(this.A);
        if (this.H != null) {
            persistenceRecord = CryptographicPrimitiveManager.n(46, this.H, persistenceRecord);
        }
        persistenceRecord = AuditTrailLogger.e(persistenceRecord, eF2);
        ((PersistenceRecord)persistenceRecord).z(reflectionMetadataExtractor);
        reflectionMetadataExtractor.Y();
    }

    @Override
    public void o(RuntimeDescriptorParser runtimeDescriptorParser, ComplexEntityLifecycleManager complexEntityLifecycleManager, eF eF2) throws CompilationDiagnosticException {
        PersistenceRecord persistenceRecord = new SerializationContext(this.A);
        if (this.H != null) {
            persistenceRecord = CryptographicPrimitiveManager.n(46, this.H, persistenceRecord);
        }
        persistenceRecord = AuditTrailLogger.e(persistenceRecord, eF2);
        runtimeDescriptorParser.p(persistenceRecord);
        runtimeDescriptorParser.A();
    }
}

