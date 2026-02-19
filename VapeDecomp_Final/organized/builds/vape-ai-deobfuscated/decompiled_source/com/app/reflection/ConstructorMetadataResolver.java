/*
 * Decompiled with CFR 0.152.
 */
package com.app.reflection;

import a.eF;
import com.app.network.ConnectionEstablishmentContract;
import com.entity.lifecycle.ComplexEntityLifecycleManager;
import com.metadata.reflection.ReflectionMetadataExtractor;
import com.reflection.registry.MetaclassDefinitionRegistry;
import com.runtime.descriptor.RuntimeDescriptorParser;
import com.system.compilation.CompilationDiagnosticException;

class ConstructorMetadataResolver
implements ConnectionEstablishmentContract {
    int v;
    MetaclassDefinitionRegistry N;
    int M;

    @Override
    public void u(ReflectionMetadataExtractor reflectionMetadataExtractor, eF eF2) throws CompilationDiagnosticException {
        reflectionMetadataExtractor.U(this.N, "<init>", eF2);
        reflectionMetadataExtractor.I(this.N);
    }

    ConstructorMetadataResolver(MetaclassDefinitionRegistry metaclassDefinitionRegistry, int n, int n2) {
        this.N = metaclassDefinitionRegistry;
        this.M = n;
        this.v = n2;
    }

    @Override
    public void o(RuntimeDescriptorParser runtimeDescriptorParser, ComplexEntityLifecycleManager complexEntityLifecycleManager, eF eF2) throws CompilationDiagnosticException {
        complexEntityLifecycleManager.E(187);
        complexEntityLifecycleManager.m(this.M);
        complexEntityLifecycleManager.E(89);
        runtimeDescriptorParser.G(this.N, "<init>", eF2, false, true, -1, null);
        runtimeDescriptorParser.w(this.N);
    }
}

