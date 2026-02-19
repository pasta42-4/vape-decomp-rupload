/*
 * Decompiled with CFR 0.152.
 */
package com.app.diagnostic.error;

import a.J0;
import a._c;
import com.app.reflection.ConstructorMetadataResolver;
import com.bytecode.analysis.BinaryCodeAnalyzer;
import com.bytecode.analysis.BytecodeAnalysisEngine305;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.bytecode.analysis.BytecodeInspectionEngine;
import com.bytecode.exception.BytecodeProcessingException;
import com.bytecode.instrumentation.ArgumentInterceptor;
import com.core.exception.CustomRuntimeException;
import com.entity.lifecycle.ComplexEntityLifecycleManager;
import com.error.handling.ContextualExceptionHandler;
import com.reflection.management.ClassPoolRegistry;
import com.reflection.metadata.ReflectionMetadataResolver933;
import com.reflection.registry.MetaclassDefinitionRegistry;
import com.system.compilation.CompilationDiagnosticException;

public class DiagnosticErrorResolver
extends J0 {
    int S;
    String M;

    @Override
    public int H() {
        return super.H();
    }

    @Override
    public _c E() {
        return super.E();
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    protected DiagnosticErrorResolver(int n, BytecodeAnalysisEngine305 bytecodeAnalysisEngine305, MetaclassDefinitionRegistry metaclassDefinitionRegistry, BytecodeInspectionEngine bytecodeInspectionEngine, String string, int n2) {
        super(n, bytecodeAnalysisEngine305, metaclassDefinitionRegistry, bytecodeInspectionEngine);
        this.M = string;
        this.S = n2;
    }

    @Override
    public void N(String string) throws ContextualExceptionHandler {
        this.r.Q();
        int n = 3;
        int n2 = this.S;
        int n3 = this.D.Z(n2 + 1);
        int n4 = this.m();
        int n5 = n2 + n4;
        try {
            for (int i = n2; i < n5; ++i) {
                this.D.g(0, i);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DiagnosticErrorResolver.b(compilationDiagnosticException);
        }
        BytecodeAnalyzer bytecodeAnalyzer = this.e();
        n2 = this.e;
        int n6 = this.D.Z(n2 + 1);
        String string2 = bytecodeAnalyzer.W(n6);
        ArgumentInterceptor argumentInterceptor = new ArgumentInterceptor(this.r);
        ClassPoolRegistry classPoolRegistry = this.r.K();
        BinaryCodeAnalyzer binaryCodeAnalyzer = this.D.O();
        try {
            MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray = ReflectionMetadataResolver933.Z(string2, classPoolRegistry);
            MetaclassDefinitionRegistry metaclassDefinitionRegistry = classPoolRegistry.g(this.M);
            int n7 = binaryCodeAnalyzer.i();
            argumentInterceptor.W(this.M, metaclassDefinitionRegistryArray, true, n7, this.u());
            int n8 = argumentInterceptor.Y(metaclassDefinitionRegistry, true);
            argumentInterceptor.Z(new ConstructorMetadataResolver(metaclassDefinitionRegistry, n3, n6));
            DiagnosticErrorResolver.W(metaclassDefinitionRegistry, string);
            ComplexEntityLifecycleManager complexEntityLifecycleManager = argumentInterceptor.k();
            try {
                DiagnosticErrorResolver.x(metaclassDefinitionRegistryArray, true, n7, complexEntityLifecycleManager);
                argumentInterceptor.X(binaryCodeAnalyzer, n2);
                complexEntityLifecycleManager.h(metaclassDefinitionRegistry);
                complexEntityLifecycleManager.P(n8, metaclassDefinitionRegistry);
                argumentInterceptor.b(string);
                if (n4 > 3) {
                    complexEntityLifecycleManager.B(n8);
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw DiagnosticErrorResolver.b(compilationDiagnosticException);
            }
            this.E(n2, complexEntityLifecycleManager, 3);
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw new ContextualExceptionHandler(compilationDiagnosticException);
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw new ContextualExceptionHandler(customRuntimeException);
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw new ContextualExceptionHandler("broken method");
        }
    }

    private int m() throws ContextualExceptionHandler {
        block13: {
            int n;
            block10: {
                int n2;
                block12: {
                    block11: {
                        n = this.D.z(this.S + 3);
                        try {
                            try {
                                try {
                                    if (n != 89) break block10;
                                    if (this.D.z(this.S + 4) != 94) break block11;
                                }
                                catch (ContextualExceptionHandler contextualExceptionHandler) {
                                    throw DiagnosticErrorResolver.b(contextualExceptionHandler);
                                }
                                if (this.D.z(this.S + 5) != 88) break block11;
                            }
                            catch (ContextualExceptionHandler contextualExceptionHandler) {
                                throw DiagnosticErrorResolver.b(contextualExceptionHandler);
                            }
                            n2 = 6;
                            break block12;
                        }
                        catch (ContextualExceptionHandler contextualExceptionHandler) {
                            throw DiagnosticErrorResolver.b(contextualExceptionHandler);
                        }
                    }
                    n2 = 4;
                }
                return n2;
            }
            try {
                try {
                    if (n != 90 || this.D.z(this.S + 4) != 95) break block13;
                }
                catch (ContextualExceptionHandler contextualExceptionHandler) {
                    throw DiagnosticErrorResolver.b(contextualExceptionHandler);
                }
                return 5;
            }
            catch (ContextualExceptionHandler contextualExceptionHandler) {
                throw DiagnosticErrorResolver.b(contextualExceptionHandler);
            }
        }
        return 3;
    }
}

