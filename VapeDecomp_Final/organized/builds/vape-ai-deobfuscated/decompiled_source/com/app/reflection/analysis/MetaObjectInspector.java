/*
 * Decompiled with CFR 0.152.
 */
package com.app.reflection.analysis;

import a.J0;
import a._c;
import com.app.validation.ProcedureValidationInterceptor;
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
import com.reflection.registry.MetaclassDefinitionRegistry;
import com.system.compilation.CompilationDiagnosticException;

public class MetaObjectInspector
extends J0 {
    @Override
    public void N(String string) throws ContextualExceptionHandler {
        this.r.Q();
        BytecodeAnalyzer bytecodeAnalyzer = this.e();
        int n = this.e;
        int n2 = this.D.Z(n + 1);
        ArgumentInterceptor argumentInterceptor = new ArgumentInterceptor(this.r);
        ClassPoolRegistry classPoolRegistry = this.r.K();
        BinaryCodeAnalyzer binaryCodeAnalyzer = this.D.O();
        try {
            MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray = new MetaclassDefinitionRegistry[]{classPoolRegistry.g("java.lang.Object")};
            MetaclassDefinitionRegistry metaclassDefinitionRegistry = MetaclassDefinitionRegistry.T;
            int n3 = binaryCodeAnalyzer.i();
            argumentInterceptor.W("java.lang.Object", metaclassDefinitionRegistryArray, true, n3, this.u());
            int n4 = argumentInterceptor.Y(metaclassDefinitionRegistry, true);
            argumentInterceptor.Z(new ProcedureValidationInterceptor(n2));
            argumentInterceptor.k(this.l());
            MetaObjectInspector.W(metaclassDefinitionRegistry, string);
            ComplexEntityLifecycleManager complexEntityLifecycleManager = argumentInterceptor.k();
            MetaObjectInspector.x(metaclassDefinitionRegistryArray, true, n3, complexEntityLifecycleManager);
            argumentInterceptor.X(binaryCodeAnalyzer, n);
            complexEntityLifecycleManager.h(metaclassDefinitionRegistry);
            complexEntityLifecycleManager.P(n4, metaclassDefinitionRegistry);
            argumentInterceptor.b(string);
            complexEntityLifecycleManager.y(n4, metaclassDefinitionRegistry);
            this.E(n, complexEntityLifecycleManager, 3);
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

    @Override
    public int H() {
        return super.H();
    }

    public MetaclassDefinitionRegistry l() throws CustomRuntimeException {
        BytecodeAnalyzer bytecodeAnalyzer = this.e();
        int n = this.e;
        int n2 = this.D.Z(n + 1);
        String string = bytecodeAnalyzer.u(n2);
        return this.r.K().Q(string);
    }

    protected MetaObjectInspector(int n, BytecodeAnalysisEngine305 bytecodeAnalysisEngine305, MetaclassDefinitionRegistry metaclassDefinitionRegistry, BytecodeInspectionEngine bytecodeInspectionEngine) {
        super(n, bytecodeAnalysisEngine305, metaclassDefinitionRegistry, bytecodeInspectionEngine);
    }

    @Override
    public _c E() {
        return super.E();
    }
}

