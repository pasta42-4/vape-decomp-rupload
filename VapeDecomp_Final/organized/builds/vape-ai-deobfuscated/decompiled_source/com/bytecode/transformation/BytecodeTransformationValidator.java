/*
 * Decompiled with CFR 0.152.
 */
package com.bytecode.transformation;

import a.eF;
import com.app.network.ConnectionEstablishmentContract;
import com.entity.lifecycle.ComplexEntityLifecycleManager;
import com.metadata.reflection.ReflectionMetadataExtractor;
import com.reflection.registry.MetaclassDefinitionRegistry;
import com.runtime.descriptor.RuntimeDescriptorParser;
import com.system.compilation.CompilationDiagnosticException;

class BytecodeTransformationValidator
implements ConnectionEstablishmentContract {
    MetaclassDefinitionRegistry g;
    int Y;

    @Override
    public void o(RuntimeDescriptorParser runtimeDescriptorParser, ComplexEntityLifecycleManager complexEntityLifecycleManager, eF eF2) throws CompilationDiagnosticException {
        try {
            if (runtimeDescriptorParser.Y(eF2) != 1) {
                throw new CompilationDiagnosticException("$proceed() cannot take more than one parameter for cast");
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw BytecodeTransformationValidator.a(compilationDiagnosticException);
        }
        runtimeDescriptorParser.F(eF2, new int[1], new int[1], new String[1]);
        complexEntityLifecycleManager.E(192);
        complexEntityLifecycleManager.m(this.Y);
        runtimeDescriptorParser.w(this.g);
    }

    private static CompilationDiagnosticException a(CompilationDiagnosticException compilationDiagnosticException) {
        return compilationDiagnosticException;
    }

    BytecodeTransformationValidator(int n, MetaclassDefinitionRegistry metaclassDefinitionRegistry) {
        this.Y = n;
        this.g = metaclassDefinitionRegistry;
    }

    @Override
    public void u(ReflectionMetadataExtractor reflectionMetadataExtractor, eF eF2) throws CompilationDiagnosticException {
        reflectionMetadataExtractor.e(eF2, new int[1], new int[1], new String[1]);
        reflectionMetadataExtractor.I(this.g);
    }
}

