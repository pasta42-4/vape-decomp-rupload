/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.invoke;

import a.eF;
import com.app.network.ConnectionEstablishmentContract;
import com.entity.lifecycle.ComplexEntityLifecycleManager;
import com.metadata.reflection.ReflectionMetadataExtractor;
import com.reflection.registry.MetaclassDefinitionRegistry;
import com.runtime.descriptor.RuntimeDescriptorParser;
import com.system.compilation.CompilationDiagnosticException;

class MethodInvoker
implements ConnectionEstablishmentContract {
    int z;
    MetaclassDefinitionRegistry P;
    int o;
    int C;

    @Override
    public void u(ReflectionMetadataExtractor reflectionMetadataExtractor, eF eF2) throws CompilationDiagnosticException {
        reflectionMetadataExtractor.I(this.P);
    }

    MethodInvoker(MetaclassDefinitionRegistry metaclassDefinitionRegistry, int n, int n2, int n3) {
        this.P = metaclassDefinitionRegistry;
        this.o = n;
        this.z = n2;
        this.C = n3;
    }

    private static CompilationDiagnosticException a(CompilationDiagnosticException compilationDiagnosticException) {
        return compilationDiagnosticException;
    }

    @Override
    public void o(RuntimeDescriptorParser runtimeDescriptorParser, ComplexEntityLifecycleManager complexEntityLifecycleManager, eF eF2) throws CompilationDiagnosticException {
        block8: {
            block9: {
                block7: {
                    int n = runtimeDescriptorParser.Y(eF2);
                    try {
                        if (n != this.C) {
                            throw new CompilationDiagnosticException("$proceed() with a wrong number of parameters");
                        }
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw MethodInvoker.a(compilationDiagnosticException);
                    }
                    try {
                        runtimeDescriptorParser.F(eF2, new int[n], new int[n], new String[n]);
                        complexEntityLifecycleManager.E(this.o);
                        if (this.o != 189) break block7;
                        complexEntityLifecycleManager.m(this.z);
                        break block8;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw MethodInvoker.a(compilationDiagnosticException);
                    }
                }
                try {
                    if (this.o != 188) break block9;
                    complexEntityLifecycleManager.w(this.z);
                    break block8;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw MethodInvoker.a(compilationDiagnosticException);
                }
            }
            complexEntityLifecycleManager.m(this.z);
            complexEntityLifecycleManager.w(this.C);
            complexEntityLifecycleManager.R(1 - this.C);
        }
        runtimeDescriptorParser.w(this.P);
    }
}

