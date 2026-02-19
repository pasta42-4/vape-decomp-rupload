/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import a.eF;
import com.app.network.ConnectionEstablishmentContract;
import com.bytecode.instrumentation.ArgumentInterceptor;
import com.data.persistence.PersistenceRecord;
import com.entity.lifecycle.ComplexEntityLifecycleManager;
import com.metadata.reflection.ReflectionMetadataExtractor;
import com.runtime.descriptor.RuntimeDescriptorParser;
import com.system.compilation.CompilationDiagnosticException;

class NetworkConnectionHandler1562
implements ConnectionEstablishmentContract {
    final int X;
    final String Y;
    final ArgumentInterceptor O;
    final PersistenceRecord A;
    final String M;
    final String N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    NetworkConnectionHandler1562(ArgumentInterceptor argumentInterceptor, PersistenceRecord persistenceRecord, int n, String string, String string2, String string3) {
        this.O = argumentInterceptor;
        this.A = persistenceRecord;
        this.X = n;
        this.M = string;
        this.N = string2;
        this.Y = string3;
    }

    @Override
    public void o(RuntimeDescriptorParser runtimeDescriptorParser, ComplexEntityLifecycleManager complexEntityLifecycleManager, eF eF2) throws CompilationDiagnosticException {
        runtimeDescriptorParser.f(this.A, this.X, this.M, eF2);
    }

    @Override
    public void u(ReflectionMetadataExtractor reflectionMetadataExtractor, eF eF2) throws CompilationDiagnosticException {
        reflectionMetadataExtractor.z(this.A, this.N, this.Y, this.M, eF2);
    }
}

