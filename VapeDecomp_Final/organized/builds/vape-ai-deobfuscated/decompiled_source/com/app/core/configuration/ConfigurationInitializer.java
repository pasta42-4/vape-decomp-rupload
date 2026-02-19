/*
 * Decompiled with CFR 0.152.
 */
package com.app.core.configuration;

import a.J0;
import a.Jg;
import com.app.config.ConfigurationManager2677;
import com.app.context.ContextResolver;
import com.app.diagnostic.error.DiagnosticErrorResolver;
import com.app.reflection.analysis.MetaObjectInspector;
import com.bytecode.analysis.BinaryCodeAnalyzer;
import com.bytecode.analysis.BytecodeAnalysisEngine305;
import com.bytecode.analysis.BytecodeInspectionEngine;
import com.bytecode.exception.BytecodeProcessingException;
import com.data.persistence.PersistenceCollectionManager;
import com.development.analysis.DecompilationErrorHandler1071;
import com.error.handling.ContextualExceptionHandler;
import com.reflection.execution.MethodExecutionValidator;
import com.reflection.registry.MetaclassDefinitionRegistry;
import com.reflection.resolver.ReflectionConstructResolver;
import com.reflection.validation.MethodValidationProxy;
import com.workflow.tracking.WorkflowStateTracker;

public class ConfigurationInitializer {
    public void K(MethodExecutionValidator methodExecutionValidator) throws ContextualExceptionHandler {
    }

    /*
     * Loose catch block
     */
    final boolean G(BytecodeAnalysisEngine305 bytecodeAnalysisEngine305, MetaclassDefinitionRegistry metaclassDefinitionRegistry, BytecodeInspectionEngine bytecodeInspectionEngine, ContextResolver contextResolver) throws ContextualExceptionHandler {
        try {
            block38: {
                J0 j0;
                block29: {
                    int n;
                    int n2;
                    block37: {
                        block36: {
                            block30: {
                                block35: {
                                    block34: {
                                        block33: {
                                            block41: {
                                                block32: {
                                                    block31: {
                                                        block39: {
                                                            block28: {
                                                                j0 = null;
                                                                n2 = bytecodeAnalysisEngine305.S();
                                                                n = bytecodeAnalysisEngine305.z(n2);
                                                                try {
                                                                    if (n >= 178) break block28;
                                                                    break block29;
                                                                }
                                                                catch (BytecodeProcessingException bytecodeProcessingException) {
                                                                    throw ConfigurationInitializer.a(bytecodeProcessingException);
                                                                }
                                                            }
                                                            if (n >= 188) break block30;
                                                            if (n == 184) break block31;
                                                            break block39;
                                                            catch (BytecodeProcessingException bytecodeProcessingException) {
                                                                throw ConfigurationInitializer.a(bytecodeProcessingException);
                                                            }
                                                        }
                                                        try {
                                                            block40: {
                                                                if (n == 185) break block31;
                                                                break block40;
                                                                catch (BytecodeProcessingException bytecodeProcessingException) {
                                                                    throw ConfigurationInitializer.a(bytecodeProcessingException);
                                                                }
                                                            }
                                                            if (n != 182) break block32;
                                                        }
                                                        catch (BytecodeProcessingException bytecodeProcessingException) {
                                                            throw ConfigurationInitializer.a(bytecodeProcessingException);
                                                        }
                                                    }
                                                    j0 = new MethodValidationProxy(n2, bytecodeAnalysisEngine305, metaclassDefinitionRegistry, bytecodeInspectionEngine);
                                                    this.P((MethodValidationProxy)j0);
                                                    break block29;
                                                }
                                                if (n == 180) break block33;
                                                if (n == 178) break block33;
                                                break block41;
                                                catch (BytecodeProcessingException bytecodeProcessingException) {
                                                    throw ConfigurationInitializer.a(bytecodeProcessingException);
                                                }
                                            }
                                            try {
                                                block42: {
                                                    if (n == 181) break block33;
                                                    break block42;
                                                    catch (BytecodeProcessingException bytecodeProcessingException) {
                                                        throw ConfigurationInitializer.a(bytecodeProcessingException);
                                                    }
                                                }
                                                if (n != 179) break block34;
                                            }
                                            catch (BytecodeProcessingException bytecodeProcessingException) {
                                                throw ConfigurationInitializer.a(bytecodeProcessingException);
                                            }
                                        }
                                        j0 = new MethodExecutionValidator(n2, bytecodeAnalysisEngine305, metaclassDefinitionRegistry, bytecodeInspectionEngine, n);
                                        this.K((MethodExecutionValidator)j0);
                                        break block29;
                                    }
                                    if (n == 187) {
                                        int n3 = bytecodeAnalysisEngine305.Z(n2 + 1);
                                        contextResolver.L = new ConfigurationManager2677(contextResolver.L, n2, bytecodeInspectionEngine.v().u(n3));
                                        break block29;
                                    }
                                    if (n != 183) break block29;
                                    ConfigurationManager2677 configurationManager2677 = contextResolver.L;
                                    try {
                                        if (configurationManager2677 == null || bytecodeInspectionEngine.v().r(configurationManager2677.N, bytecodeAnalysisEngine305.Z(n2 + 1)) <= 0) break block35;
                                    }
                                    catch (BytecodeProcessingException bytecodeProcessingException) {
                                        throw ConfigurationInitializer.a(bytecodeProcessingException);
                                    }
                                    j0 = new DiagnosticErrorResolver(n2, bytecodeAnalysisEngine305, metaclassDefinitionRegistry, bytecodeInspectionEngine, configurationManager2677.N, configurationManager2677.o);
                                    this.q((DiagnosticErrorResolver)j0);
                                    contextResolver.L = configurationManager2677.P;
                                    break block29;
                                }
                                MethodValidationProxy methodValidationProxy = new MethodValidationProxy(n2, bytecodeAnalysisEngine305, metaclassDefinitionRegistry, bytecodeInspectionEngine);
                                if (methodValidationProxy.g().equals("<init>")) {
                                    ReflectionConstructResolver reflectionConstructResolver = new ReflectionConstructResolver(n2, bytecodeAnalysisEngine305, metaclassDefinitionRegistry, bytecodeInspectionEngine);
                                    j0 = reflectionConstructResolver;
                                    this.R(reflectionConstructResolver);
                                } else {
                                    j0 = methodValidationProxy;
                                    this.P(methodValidationProxy);
                                }
                                break block29;
                            }
                            if (n == 188) break block36;
                            try {
                                block43: {
                                    if (n == 189) break block36;
                                    break block43;
                                    catch (BytecodeProcessingException bytecodeProcessingException) {
                                        throw ConfigurationInitializer.a(bytecodeProcessingException);
                                    }
                                }
                                if (n != 197) break block37;
                            }
                            catch (BytecodeProcessingException bytecodeProcessingException) {
                                throw ConfigurationInitializer.a(bytecodeProcessingException);
                            }
                        }
                        j0 = new DecompilationErrorHandler1071(n2, bytecodeAnalysisEngine305, metaclassDefinitionRegistry, bytecodeInspectionEngine, n);
                        this.V((DecompilationErrorHandler1071)j0);
                        break block29;
                    }
                    if (n == 193) {
                        j0 = new MetaObjectInspector(n2, bytecodeAnalysisEngine305, metaclassDefinitionRegistry, bytecodeInspectionEngine);
                        this.J((MetaObjectInspector)j0);
                        break block29;
                    }
                    if (n != 192) break block29;
                    j0 = new Jg(n2, bytecodeAnalysisEngine305, metaclassDefinitionRegistry, bytecodeInspectionEngine);
                    this.A((Jg)j0);
                }
                try {
                    if (j0 == null || !j0.G()) break block38;
                }
                catch (BytecodeProcessingException bytecodeProcessingException) {
                    throw ConfigurationInitializer.a(bytecodeProcessingException);
                }
                contextResolver.k(j0.r(), j0.Y());
                return true;
            }
            return false;
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw new ContextualExceptionHandler(bytecodeProcessingException);
        }
    }

    public void V(DecompilationErrorHandler1071 decompilationErrorHandler1071) throws ContextualExceptionHandler {
    }

    public void A(Jg jg2) throws ContextualExceptionHandler {
    }

    public void J(MetaObjectInspector metaObjectInspector) throws ContextualExceptionHandler {
    }

    public void R(ReflectionConstructResolver reflectionConstructResolver) throws ContextualExceptionHandler {
    }

    public void q(DiagnosticErrorResolver diagnosticErrorResolver) throws ContextualExceptionHandler {
    }

    public boolean Y(MetaclassDefinitionRegistry metaclassDefinitionRegistry, BytecodeInspectionEngine bytecodeInspectionEngine) throws ContextualExceptionHandler {
        BinaryCodeAnalyzer binaryCodeAnalyzer = bytecodeInspectionEngine.Z();
        try {
            if (binaryCodeAnalyzer == null) {
                return false;
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw ConfigurationInitializer.a(bytecodeProcessingException);
        }
        BytecodeAnalysisEngine305 bytecodeAnalysisEngine305 = binaryCodeAnalyzer.h();
        boolean bl = false;
        ContextResolver contextResolver = new ContextResolver(binaryCodeAnalyzer.i());
        while (true) {
            block14: {
                try {
                    while (bytecodeAnalysisEngine305.L()) {
                        if (!this.G(bytecodeAnalysisEngine305, metaclassDefinitionRegistry, bytecodeInspectionEngine, contextResolver)) continue;
                        break block14;
                    }
                    break;
                }
                catch (BytecodeProcessingException bytecodeProcessingException) {
                    throw ConfigurationInitializer.a(bytecodeProcessingException);
                }
            }
            bl = true;
        }
        PersistenceCollectionManager persistenceCollectionManager = binaryCodeAnalyzer.u();
        int n = persistenceCollectionManager.w();
        for (int i = 0; i < n; ++i) {
            WorkflowStateTracker workflowStateTracker = new WorkflowStateTracker(persistenceCollectionManager, i, bytecodeAnalysisEngine305, metaclassDefinitionRegistry, bytecodeInspectionEngine);
            this.V(workflowStateTracker);
            if (!workflowStateTracker.G()) continue;
            bl = true;
            contextResolver.k(workflowStateTracker.r(), workflowStateTracker.Y());
        }
        try {
            if (binaryCodeAnalyzer.i() < contextResolver.R) {
                binaryCodeAnalyzer.J(contextResolver.R);
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw ConfigurationInitializer.a(bytecodeProcessingException);
        }
        binaryCodeAnalyzer.D(binaryCodeAnalyzer.Q() + contextResolver.x);
        try {
            if (bl) {
                bytecodeInspectionEngine.w(metaclassDefinitionRegistry.K(), metaclassDefinitionRegistry.o());
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw new ContextualExceptionHandler(bytecodeProcessingException.getMessage(), bytecodeProcessingException);
        }
        return bl;
    }

    private static BytecodeProcessingException a(BytecodeProcessingException bytecodeProcessingException) {
        return bytecodeProcessingException;
    }

    public void V(WorkflowStateTracker workflowStateTracker) throws ContextualExceptionHandler {
    }

    public void P(MethodValidationProxy methodValidationProxy) throws ContextualExceptionHandler {
    }
}

