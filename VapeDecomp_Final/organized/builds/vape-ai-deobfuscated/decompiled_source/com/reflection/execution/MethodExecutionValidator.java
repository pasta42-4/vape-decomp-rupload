/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.execution;

import a.J0;
import a._c;
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
import com.reflection.interceptor.FieldAccessInterceptor;
import com.reflection.metadata.ReflectionMetadataResolver933;
import com.reflection.property.PropertyAccessor;
import com.reflection.registry.MetaclassDefinitionRegistry;
import com.reverse.engineering.DecompilationAnalyzer;
import com.system.compilation.CompilationDiagnosticException;

public class MethodExecutionValidator
extends J0 {
    int y;

    public boolean v() {
        return MethodExecutionValidator.n(this.y);
    }

    @Override
    public _c E() {
        return super.E();
    }

    /*
     * Loose catch block
     */
    @Override
    public void N(String string) throws ContextualExceptionHandler {
        this.r.Q();
        BytecodeAnalyzer bytecodeAnalyzer = this.e();
        int n = this.e;
        int n2 = this.D.Z(n + 1);
        ArgumentInterceptor argumentInterceptor = new ArgumentInterceptor(this.r);
        BinaryCodeAnalyzer binaryCodeAnalyzer = this.D.O();
        try {
            ComplexEntityLifecycleManager complexEntityLifecycleManager;
            int n3;
            MetaclassDefinitionRegistry metaclassDefinitionRegistry;
            boolean bl;
            block18: {
                block19: {
                    boolean bl2;
                    int n4;
                    MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray;
                    block17: {
                        MetaclassDefinitionRegistry metaclassDefinitionRegistry2;
                        block16: {
                            metaclassDefinitionRegistry2 = ReflectionMetadataResolver933.f(bytecodeAnalyzer.v(n2), this.r.K());
                            bl = this.i();
                            if (bl) {
                                metaclassDefinitionRegistryArray = new MetaclassDefinitionRegistry[]{};
                                metaclassDefinitionRegistry = metaclassDefinitionRegistry2;
                            } else {
                                metaclassDefinitionRegistryArray = new MetaclassDefinitionRegistry[]{metaclassDefinitionRegistry2};
                                metaclassDefinitionRegistry = MetaclassDefinitionRegistry.M;
                            }
                            n4 = binaryCodeAnalyzer.i();
                            argumentInterceptor.W(bytecodeAnalyzer.g(n2), metaclassDefinitionRegistryArray, true, n4, this.u());
                            bl2 = MethodExecutionValidator.W(metaclassDefinitionRegistry, string);
                            if (bl) {
                                bl2 = true;
                            }
                            n3 = argumentInterceptor.Y(metaclassDefinitionRegistry, bl2);
                            try {
                                if (!bl) break block16;
                                argumentInterceptor.Z(new PropertyAccessor(metaclassDefinitionRegistry, this.y, n2, n4));
                                break block17;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw MethodExecutionValidator.b(compilationDiagnosticException);
                            }
                        }
                        argumentInterceptor.k(metaclassDefinitionRegistry2);
                        argumentInterceptor.Z(new FieldAccessInterceptor(metaclassDefinitionRegistryArray[0], this.y, n2, n4));
                    }
                    complexEntityLifecycleManager = argumentInterceptor.k();
                    MethodExecutionValidator.x(metaclassDefinitionRegistryArray, this.v(), n4, complexEntityLifecycleManager);
                    argumentInterceptor.X(binaryCodeAnalyzer, n);
                    if (!bl2) break block18;
                    try {
                        block20: {
                            if (metaclassDefinitionRegistry != MetaclassDefinitionRegistry.M) break block19;
                            break block20;
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw MethodExecutionValidator.b(compilationDiagnosticException);
                            }
                        }
                        complexEntityLifecycleManager.E(1);
                        complexEntityLifecycleManager.S(n3);
                        break block18;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw MethodExecutionValidator.b(compilationDiagnosticException);
                    }
                }
                complexEntityLifecycleManager.h(metaclassDefinitionRegistry);
                complexEntityLifecycleManager.P(n3, metaclassDefinitionRegistry);
            }
            try {
                argumentInterceptor.b(string);
                if (bl) {
                    complexEntityLifecycleManager.y(n3, metaclassDefinitionRegistry);
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw MethodExecutionValidator.b(compilationDiagnosticException);
            }
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

    public boolean i() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (this.y != 180 && this.y != 178) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MethodExecutionValidator.b(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw MethodExecutionValidator.b(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public DecompilationAnalyzer a() throws CustomRuntimeException {
        MetaclassDefinitionRegistry metaclassDefinitionRegistry = this.Y();
        int n = this.D.Z(this.e + 1);
        BytecodeAnalyzer bytecodeAnalyzer = this.e();
        return metaclassDefinitionRegistry.d(bytecodeAnalyzer.Q(n), bytecodeAnalyzer.v(n));
    }

    @Override
    public int H() {
        return super.H();
    }

    private MetaclassDefinitionRegistry Y() throws CustomRuntimeException {
        return this.r.K().g(this.h());
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    public String h() {
        int n = this.D.Z(this.e + 1);
        return this.e().g(n);
    }

    static boolean n(int n) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (n != 178 && n != 179) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MethodExecutionValidator.b(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw MethodExecutionValidator.b(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    protected MethodExecutionValidator(int n, BytecodeAnalysisEngine305 bytecodeAnalysisEngine305, MetaclassDefinitionRegistry metaclassDefinitionRegistry, BytecodeInspectionEngine bytecodeInspectionEngine, int n2) {
        super(n, bytecodeAnalysisEngine305, metaclassDefinitionRegistry, bytecodeInspectionEngine);
        this.y = n2;
    }

    public String c() {
        int n = this.D.Z(this.e + 1);
        return this.e().Q(n);
    }

    public String C() {
        int n = this.D.Z(this.e + 1);
        return this.e().v(n);
    }
}

