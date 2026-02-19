/*
 * Decompiled with CFR 0.152.
 */
package com.app.validation;

import a.eF;
import com.app.network.ConnectionEstablishmentContract;
import com.entity.lifecycle.ComplexEntityLifecycleManager;
import com.metadata.reflection.ReflectionMetadataExtractor;
import com.reflection.registry.MetaclassDefinitionRegistry;
import com.runtime.descriptor.RuntimeDescriptorParser;
import com.system.compilation.CompilationDiagnosticException;

class ProcedureValidationInterceptor
implements ConnectionEstablishmentContract {
    int D;

    @Override
    public void o(RuntimeDescriptorParser runtimeDescriptorParser, ComplexEntityLifecycleManager complexEntityLifecycleManager, eF eF2) throws CompilationDiagnosticException {
        try {
            if (runtimeDescriptorParser.Y(eF2) != 1) {
                throw new CompilationDiagnosticException("$proceed() cannot take more than one parameter for instanceof");
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw ProcedureValidationInterceptor.a(compilationDiagnosticException);
        }
        runtimeDescriptorParser.F(eF2, new int[1], new int[1], new String[1]);
        complexEntityLifecycleManager.E(193);
        complexEntityLifecycleManager.m(this.D);
        runtimeDescriptorParser.w(MetaclassDefinitionRegistry.T);
    }

    ProcedureValidationInterceptor(int n) {
        this.D = n;
    }

    @Override
    public void u(ReflectionMetadataExtractor reflectionMetadataExtractor, eF eF2) throws CompilationDiagnosticException {
        reflectionMetadataExtractor.e(eF2, new int[1], new int[1], new String[1]);
        reflectionMetadataExtractor.I(MetaclassDefinitionRegistry.T);
    }

    private static CompilationDiagnosticException a(CompilationDiagnosticException compilationDiagnosticException) {
        return compilationDiagnosticException;
    }
}

