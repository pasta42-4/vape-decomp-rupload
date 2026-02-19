/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.validation;

import a.J0;
import a._c;
import com.app.resource.ResourceIdentifier;
import com.bytecode.analysis.BinaryCodeAnalyzer;
import com.bytecode.analysis.BytecodeAnalysisEngine305;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.bytecode.analysis.BytecodeInspectionEngine;
import com.bytecode.exception.BytecodeProcessingException;
import com.bytecode.instrumentation.ArgumentInterceptor;
import com.core.exception.CustomRuntimeException;
import com.entity.lifecycle.ComplexEntityLifecycleManager;
import com.error.handling.ContextualExceptionHandler;
import com.exception.system.CustomSystemException;
import com.reflection.management.ClassPoolRegistry;
import com.reflection.metadata.ReflectionMetadataResolver933;
import com.reflection.registry.MetaclassDefinitionRegistry;
import com.system.compilation.CompilationDiagnosticException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class MethodValidationProxy
extends J0 {
    protected MetaclassDefinitionRegistry p() throws CustomRuntimeException {
        return this.r.K().g(this.G());
    }

    @Override
    public _c E() {
        return super.E();
    }

    public String t() {
        BytecodeAnalyzer bytecodeAnalyzer = this.e();
        int n = this.f(bytecodeAnalyzer);
        return bytecodeAnalyzer.Z(bytecodeAnalyzer.m(n));
    }

    public ResourceIdentifier n() throws CustomRuntimeException {
        return this.p().H(this.g(), this.t());
    }

    public String G() {
        BytecodeAnalyzer bytecodeAnalyzer = this.e();
        int n = this.e;
        int n2 = this.D.z(n);
        int n3 = this.D.Z(n + 1);
        String string = n2 == 185 ? bytecodeAnalyzer.f(n3) : bytecodeAnalyzer.M(n3);
        if (string.charAt(0) == '[') {
            string = ReflectionMetadataResolver933.B(string);
        }
        return string;
    }

    @Override
    public int H() {
        return super.H();
    }

    public boolean g() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (this.D.z(this.e) != 183 || this.E().E().H().equals(this.G())) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MethodValidationProxy.b(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw MethodValidationProxy.b(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private int f(BytecodeAnalyzer bytecodeAnalyzer) {
        int n = this.e;
        int n2 = this.D.z(n);
        int n3 = this.D.Z(n + 1);
        try {
            if (n2 == 185) {
                return bytecodeAnalyzer.U(n3);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MethodValidationProxy.b(customSystemException);
        }
        return bytecodeAnalyzer.c(n3);
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    /*
     * Loose catch block
     */
    @Override
    public void N(String string) throws ContextualExceptionHandler {
        String string2;
        String string3;
        String string4;
        int n;
        int n2;
        int n3;
        int n4;
        block22: {
            block21: {
                BytecodeAnalyzer bytecodeAnalyzer;
                block20: {
                    block26: {
                        this.r.Q();
                        bytecodeAnalyzer = this.e();
                        n4 = this.e;
                        n3 = this.D.Z(n4 + 1);
                        n2 = this.D.z(n4);
                        if (n2 != 185) break block26;
                        n = 5;
                        string4 = bytecodeAnalyzer.f(n3);
                        string3 = bytecodeAnalyzer.I(n3);
                        string2 = bytecodeAnalyzer.b(n3);
                        break block22;
                    }
                    if (n2 == 184) break block20;
                    try {
                        block27: {
                            if (n2 == 183) break block20;
                            break block27;
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw MethodValidationProxy.b(compilationDiagnosticException);
                            }
                        }
                        if (n2 != 182) break block21;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw MethodValidationProxy.b(compilationDiagnosticException);
                    }
                }
                n = 3;
                string4 = bytecodeAnalyzer.M(n3);
                string3 = bytecodeAnalyzer.j(n3);
                string2 = bytecodeAnalyzer.W(n3);
                break block22;
            }
            throw new ContextualExceptionHandler("not method invocation");
        }
        ArgumentInterceptor argumentInterceptor = new ArgumentInterceptor(this.r);
        ClassPoolRegistry classPoolRegistry = this.r.K();
        BinaryCodeAnalyzer binaryCodeAnalyzer = this.D.O();
        try {
            boolean bl;
            MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray;
            int n5;
            int n6;
            MetaclassDefinitionRegistry metaclassDefinitionRegistry;
            MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray2;
            block24: {
                block25: {
                    block23: {
                        metaclassDefinitionRegistryArray2 = ReflectionMetadataResolver933.Z(string2, classPoolRegistry);
                        metaclassDefinitionRegistry = ReflectionMetadataResolver933.X(string2, classPoolRegistry);
                        n6 = binaryCodeAnalyzer.i();
                        argumentInterceptor.W(string4, metaclassDefinitionRegistryArray2, true, n6, this.u());
                        n5 = argumentInterceptor.Y(metaclassDefinitionRegistry, true);
                        try {
                            if (n2 != 184) break block23;
                            argumentInterceptor.N(string4, string3);
                            break block24;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw MethodValidationProxy.b(compilationDiagnosticException);
                        }
                    }
                    try {
                        if (n2 != 183) break block25;
                        argumentInterceptor.z("$0", string4, string3, string2, n3);
                        break block24;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw MethodValidationProxy.b(compilationDiagnosticException);
                    }
                }
                argumentInterceptor.O("$0", string3);
            }
            MethodValidationProxy.W(metaclassDefinitionRegistry, string);
            ComplexEntityLifecycleManager complexEntityLifecycleManager = argumentInterceptor.k();
            try {
                metaclassDefinitionRegistryArray = metaclassDefinitionRegistryArray2;
                bl = n2 == 184;
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw MethodValidationProxy.b(compilationDiagnosticException);
            }
            try {
                MethodValidationProxy.x(metaclassDefinitionRegistryArray, bl, n6, complexEntityLifecycleManager);
                argumentInterceptor.X(binaryCodeAnalyzer, n4);
                if (metaclassDefinitionRegistry != MetaclassDefinitionRegistry.M) {
                    complexEntityLifecycleManager.h(metaclassDefinitionRegistry);
                    complexEntityLifecycleManager.P(n5, metaclassDefinitionRegistry);
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw MethodValidationProxy.b(compilationDiagnosticException);
            }
            try {
                argumentInterceptor.b(string);
                if (metaclassDefinitionRegistry != MetaclassDefinitionRegistry.M) {
                    complexEntityLifecycleManager.y(n5, metaclassDefinitionRegistry);
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw MethodValidationProxy.b(compilationDiagnosticException);
            }
            this.E(n4, complexEntityLifecycleManager, n);
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

    public String g() {
        BytecodeAnalyzer bytecodeAnalyzer = this.e();
        int n = this.f(bytecodeAnalyzer);
        return bytecodeAnalyzer.Z(bytecodeAnalyzer.O(n));
    }

    protected MethodValidationProxy(int n, BytecodeAnalysisEngine305 bytecodeAnalysisEngine305, MetaclassDefinitionRegistry metaclassDefinitionRegistry, BytecodeInspectionEngine bytecodeInspectionEngine) {
        super(n, bytecodeAnalysisEngine305, metaclassDefinitionRegistry, bytecodeInspectionEngine);
    }
}

