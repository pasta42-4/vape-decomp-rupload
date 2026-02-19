/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.property;

import a.eF;
import com.app.network.ConnectionEstablishmentContract;
import com.entity.lifecycle.ComplexEntityLifecycleManager;
import com.metadata.reflection.ReflectionMetadataExtractor;
import com.reflection.execution.MethodExecutionValidator;
import com.reflection.registry.MetaclassDefinitionRegistry;
import com.runtime.descriptor.RuntimeDescriptorParser;
import com.system.compilation.CompilationDiagnosticException;
import com.user.profile.UserProfileManager1412;

class PropertyAccessor
implements ConnectionEstablishmentContract {
    int Y;
    int p;
    MetaclassDefinitionRegistry l;
    int O;

    private static CompilationDiagnosticException a(CompilationDiagnosticException compilationDiagnosticException) {
        return compilationDiagnosticException;
    }

    @Override
    public void u(ReflectionMetadataExtractor reflectionMetadataExtractor, eF eF2) throws CompilationDiagnosticException {
        reflectionMetadataExtractor.I(this.l);
    }

    PropertyAccessor(MetaclassDefinitionRegistry metaclassDefinitionRegistry, int n, int n2, int n3) {
        this.l = metaclassDefinitionRegistry;
        this.O = n3;
        this.Y = n;
        this.p = n2;
    }

    @Override
    public void o(RuntimeDescriptorParser runtimeDescriptorParser, ComplexEntityLifecycleManager complexEntityLifecycleManager, eF eF2) throws CompilationDiagnosticException {
        int n;
        block6: {
            try {
                try {
                    if (eF2 == null || runtimeDescriptorParser.O(eF2)) break block6;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw PropertyAccessor.a(compilationDiagnosticException);
                }
                throw new CompilationDiagnosticException("$proceed() cannot take a parameter for field reading");
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw PropertyAccessor.a(compilationDiagnosticException);
            }
        }
        if (MethodExecutionValidator.n(this.Y)) {
            n = 0;
        } else {
            n = -1;
            complexEntityLifecycleManager.B(this.O);
        }
        n = this.l instanceof UserProfileManager1412 ? (n += ((UserProfileManager1412)this.l).m()) : ++n;
        complexEntityLifecycleManager.w(this.Y);
        complexEntityLifecycleManager.m(this.p);
        complexEntityLifecycleManager.R(n);
        runtimeDescriptorParser.w(this.l);
    }
}

