/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.interceptor;

import a.eF;
import com.app.network.ConnectionEstablishmentContract;
import com.entity.lifecycle.ComplexEntityLifecycleManager;
import com.metadata.reflection.ReflectionMetadataExtractor;
import com.reflection.execution.MethodExecutionValidator;
import com.reflection.registry.MetaclassDefinitionRegistry;
import com.runtime.descriptor.RuntimeDescriptorParser;
import com.system.compilation.CompilationDiagnosticException;
import com.user.profile.UserProfileManager1412;

class FieldAccessInterceptor
implements ConnectionEstablishmentContract {
    MetaclassDefinitionRegistry M;
    int k;
    int a;
    int l;

    FieldAccessInterceptor(MetaclassDefinitionRegistry metaclassDefinitionRegistry, int n, int n2, int n3) {
        this.M = metaclassDefinitionRegistry;
        this.k = n3;
        this.a = n;
        this.l = n2;
    }

    private static CompilationDiagnosticException a(CompilationDiagnosticException compilationDiagnosticException) {
        return compilationDiagnosticException;
    }

    @Override
    public void o(RuntimeDescriptorParser runtimeDescriptorParser, ComplexEntityLifecycleManager complexEntityLifecycleManager, eF eF2) throws CompilationDiagnosticException {
        int n;
        try {
            if (runtimeDescriptorParser.Y(eF2) != 1) {
                throw new CompilationDiagnosticException("$proceed() cannot take more than one parameter for field writing");
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw FieldAccessInterceptor.a(compilationDiagnosticException);
        }
        if (MethodExecutionValidator.n(this.a)) {
            n = 0;
        } else {
            n = -1;
            complexEntityLifecycleManager.B(this.k);
        }
        runtimeDescriptorParser.F(eF2, new int[1], new int[1], new String[1]);
        runtimeDescriptorParser.v(this.M);
        n = this.M instanceof UserProfileManager1412 ? (n -= ((UserProfileManager1412)this.M).m()) : --n;
        complexEntityLifecycleManager.w(this.a);
        complexEntityLifecycleManager.m(this.l);
        complexEntityLifecycleManager.R(n);
        runtimeDescriptorParser.w(MetaclassDefinitionRegistry.M);
        runtimeDescriptorParser.A();
    }

    @Override
    public void u(ReflectionMetadataExtractor reflectionMetadataExtractor, eF eF2) throws CompilationDiagnosticException {
        reflectionMetadataExtractor.e(eF2, new int[1], new int[1], new String[1]);
        reflectionMetadataExtractor.I(MetaclassDefinitionRegistry.M);
        reflectionMetadataExtractor.Y();
    }
}

