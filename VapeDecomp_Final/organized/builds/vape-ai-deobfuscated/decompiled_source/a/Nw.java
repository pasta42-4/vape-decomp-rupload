/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.app.diagnostics.ExceptionLogger;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.bytecode.analysis.BytecodeAnnotationExtractor;
import com.bytecode.analysis.BytecodeInspectionEngine;
import com.core.exception.CustomRuntimeException;
import com.entity.lifecycle.ComplexEntityLifecycleManager;
import com.error.handling.ContextualExceptionHandler;
import com.reflection.management.ClassPoolRegistry;
import com.reflection.metadata.ClassMetadataExtractor;
import com.reflection.metadata.ReflectionMetadataResolver933;
import com.reflection.registry.MetaclassDefinitionRegistry;
import com.resource.loader.SyntheticResourceLoader;
import com.system.compilation.CompilationDiagnosticException;
import java.util.HashMap;
import java.util.Map;

public class Nw {
    private int f;
    private MetaclassDefinitionRegistry i;
    private Map<String, Object> u;

    public String q(String string, String string2, String string3, BytecodeInspectionEngine bytecodeInspectionEngine) throws CompilationDiagnosticException {
        String string4 = string + ":" + string2;
        String string5 = (String)this.u.get(string4);
        try {
            if (string5 != null) {
                return string5;
            }
        }
        catch (ContextualExceptionHandler contextualExceptionHandler) {
            throw Nw.a(contextualExceptionHandler);
        }
        ClassMetadataExtractor classMetadataExtractor = this.i.Q();
        string5 = this.G(classMetadataExtractor);
        try {
            ComplexEntityLifecycleManager complexEntityLifecycleManager;
            BytecodeInspectionEngine bytecodeInspectionEngine2;
            ClassPoolRegistry classPoolRegistry;
            block13: {
                block12: {
                    BytecodeAnalyzer bytecodeAnalyzer = classMetadataExtractor.X();
                    classPoolRegistry = this.i.K();
                    bytecodeInspectionEngine2 = new BytecodeInspectionEngine(bytecodeAnalyzer, string5, string3);
                    bytecodeInspectionEngine2.D(8);
                    bytecodeInspectionEngine2.l(new SyntheticResourceLoader(bytecodeAnalyzer));
                    ExceptionLogger exceptionLogger = bytecodeInspectionEngine.I();
                    try {
                        if (exceptionLogger != null) {
                            bytecodeInspectionEngine2.l(exceptionLogger.O(bytecodeAnalyzer, null));
                        }
                    }
                    catch (ContextualExceptionHandler contextualExceptionHandler) {
                        throw Nw.a(contextualExceptionHandler);
                    }
                    MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray = ReflectionMetadataResolver933.Z(string3, classPoolRegistry);
                    int n = 0;
                    complexEntityLifecycleManager = new ComplexEntityLifecycleManager(bytecodeAnalyzer);
                    for (int i = 0; i < metaclassDefinitionRegistryArray.length; ++i) {
                        n += complexEntityLifecycleManager.y(n, metaclassDefinitionRegistryArray[i]);
                    }
                    try {
                        complexEntityLifecycleManager.e(n);
                        if (string2 != string3) break block12;
                        complexEntityLifecycleManager.I(this.i, string, string2);
                        break block13;
                    }
                    catch (ContextualExceptionHandler contextualExceptionHandler) {
                        throw Nw.a(contextualExceptionHandler);
                    }
                }
                complexEntityLifecycleManager.L(this.i, string, string2);
            }
            complexEntityLifecycleManager.T(ReflectionMetadataResolver933.X(string2, classPoolRegistry));
            bytecodeInspectionEngine2.u(complexEntityLifecycleManager.u());
            classMetadataExtractor.b(bytecodeInspectionEngine2);
        }
        catch (ContextualExceptionHandler contextualExceptionHandler) {
            throw new CompilationDiagnosticException(contextualExceptionHandler);
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw new CompilationDiagnosticException(customRuntimeException);
        }
        this.u.put(string4, string5);
        return string5;
    }

    public Nw(MetaclassDefinitionRegistry metaclassDefinitionRegistry) {
        this.i = metaclassDefinitionRegistry;
        this.f = 1;
        this.u = new HashMap<String, Object>();
    }

    public BytecodeInspectionEngine t(BytecodeAnnotationExtractor bytecodeAnnotationExtractor, boolean bl) throws CompilationDiagnosticException {
        String string = bytecodeAnnotationExtractor.Q();
        String string2 = string + ":getter";
        Object object = this.u.get(string2);
        try {
            if (object != null) {
                return (BytecodeInspectionEngine)object;
            }
        }
        catch (ContextualExceptionHandler contextualExceptionHandler) {
            throw Nw.a(contextualExceptionHandler);
        }
        ClassMetadataExtractor classMetadataExtractor = this.i.Q();
        String string3 = this.G(classMetadataExtractor);
        try {
            ComplexEntityLifecycleManager complexEntityLifecycleManager;
            BytecodeInspectionEngine bytecodeInspectionEngine;
            String string4;
            ClassPoolRegistry classPoolRegistry;
            block9: {
                block8: {
                    BytecodeAnalyzer bytecodeAnalyzer = classMetadataExtractor.X();
                    classPoolRegistry = this.i.K();
                    string4 = bytecodeAnnotationExtractor.S();
                    String string5 = bl ? "()" + string4 : "(" + ReflectionMetadataResolver933.H(this.i) + ")" + string4;
                    bytecodeInspectionEngine = new BytecodeInspectionEngine(bytecodeAnalyzer, string3, string5);
                    bytecodeInspectionEngine.D(8);
                    bytecodeInspectionEngine.l(new SyntheticResourceLoader(bytecodeAnalyzer));
                    complexEntityLifecycleManager = new ComplexEntityLifecycleManager(bytecodeAnalyzer);
                    try {
                        if (!bl) break block8;
                        complexEntityLifecycleManager.J(ComplexEntityLifecycleManager.f, string, string4);
                        break block9;
                    }
                    catch (ContextualExceptionHandler contextualExceptionHandler) {
                        throw Nw.a(contextualExceptionHandler);
                    }
                }
                complexEntityLifecycleManager.B(0);
                complexEntityLifecycleManager.R(ComplexEntityLifecycleManager.f, string, string4);
                complexEntityLifecycleManager.e(1);
            }
            complexEntityLifecycleManager.T(ReflectionMetadataResolver933.f(string4, classPoolRegistry));
            bytecodeInspectionEngine.u(complexEntityLifecycleManager.u());
            classMetadataExtractor.b(bytecodeInspectionEngine);
            this.u.put(string2, bytecodeInspectionEngine);
            return bytecodeInspectionEngine;
        }
        catch (ContextualExceptionHandler contextualExceptionHandler) {
            throw new CompilationDiagnosticException(contextualExceptionHandler);
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw new CompilationDiagnosticException(customRuntimeException);
        }
    }

    public String v(MetaclassDefinitionRegistry metaclassDefinitionRegistry, String string, BytecodeInspectionEngine bytecodeInspectionEngine) throws CompilationDiagnosticException {
        String string2 = "<init>:" + string;
        String string3 = (String)this.u.get(string2);
        try {
            if (string3 != null) {
                return string3;
            }
        }
        catch (ContextualExceptionHandler contextualExceptionHandler) {
            throw Nw.a(contextualExceptionHandler);
        }
        string3 = ReflectionMetadataResolver933.w("javassist.runtime.Inner", string);
        ClassMetadataExtractor classMetadataExtractor = this.i.Q();
        try {
            BytecodeAnalyzer bytecodeAnalyzer = classMetadataExtractor.X();
            ClassPoolRegistry classPoolRegistry = this.i.K();
            BytecodeInspectionEngine bytecodeInspectionEngine2 = new BytecodeInspectionEngine(bytecodeAnalyzer, "<init>", string3);
            bytecodeInspectionEngine2.D(0);
            bytecodeInspectionEngine2.l(new SyntheticResourceLoader(bytecodeAnalyzer));
            ExceptionLogger exceptionLogger = bytecodeInspectionEngine.I();
            try {
                if (exceptionLogger != null) {
                    bytecodeInspectionEngine2.l(exceptionLogger.O(bytecodeAnalyzer, null));
                }
            }
            catch (ContextualExceptionHandler contextualExceptionHandler) {
                throw Nw.a(contextualExceptionHandler);
            }
            MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray = ReflectionMetadataResolver933.Z(string, classPoolRegistry);
            ComplexEntityLifecycleManager complexEntityLifecycleManager = new ComplexEntityLifecycleManager(bytecodeAnalyzer);
            complexEntityLifecycleManager.B(0);
            int n = 1;
            for (int i = 0; i < metaclassDefinitionRegistryArray.length; ++i) {
                n += complexEntityLifecycleManager.y(n, metaclassDefinitionRegistryArray[i]);
            }
            complexEntityLifecycleManager.e(n + 1);
            complexEntityLifecycleManager.s(this.i, "<init>", string);
            complexEntityLifecycleManager.T(null);
            bytecodeInspectionEngine2.u(complexEntityLifecycleManager.u());
            classMetadataExtractor.b(bytecodeInspectionEngine2);
        }
        catch (ContextualExceptionHandler contextualExceptionHandler) {
            throw new CompilationDiagnosticException(contextualExceptionHandler);
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw new CompilationDiagnosticException(customRuntimeException);
        }
        this.u.put(string2, string3);
        return string3;
    }

    public BytecodeInspectionEngine d(BytecodeAnnotationExtractor bytecodeAnnotationExtractor, boolean bl) throws CompilationDiagnosticException {
        String string = bytecodeAnnotationExtractor.Q();
        String string2 = string + ":setter";
        Object object = this.u.get(string2);
        try {
            if (object != null) {
                return (BytecodeInspectionEngine)object;
            }
        }
        catch (ContextualExceptionHandler contextualExceptionHandler) {
            throw Nw.a(contextualExceptionHandler);
        }
        ClassMetadataExtractor classMetadataExtractor = this.i.Q();
        String string3 = this.G(classMetadataExtractor);
        try {
            int n;
            BytecodeAnalyzer bytecodeAnalyzer = classMetadataExtractor.X();
            ClassPoolRegistry classPoolRegistry = this.i.K();
            String string4 = bytecodeAnnotationExtractor.S();
            String string5 = bl ? "(" + string4 + ")V" : "(" + ReflectionMetadataResolver933.H(this.i) + string4 + ")V";
            BytecodeInspectionEngine bytecodeInspectionEngine = new BytecodeInspectionEngine(bytecodeAnalyzer, string3, string5);
            bytecodeInspectionEngine.D(8);
            bytecodeInspectionEngine.l(new SyntheticResourceLoader(bytecodeAnalyzer));
            ComplexEntityLifecycleManager complexEntityLifecycleManager = new ComplexEntityLifecycleManager(bytecodeAnalyzer);
            if (bl) {
                n = complexEntityLifecycleManager.y(0, ReflectionMetadataResolver933.f(string4, classPoolRegistry));
                complexEntityLifecycleManager.W(ComplexEntityLifecycleManager.f, string, string4);
            } else {
                complexEntityLifecycleManager.B(0);
                n = complexEntityLifecycleManager.y(1, ReflectionMetadataResolver933.f(string4, classPoolRegistry)) + 1;
                complexEntityLifecycleManager.k(ComplexEntityLifecycleManager.f, string, string4);
            }
            complexEntityLifecycleManager.T(null);
            complexEntityLifecycleManager.e(n);
            bytecodeInspectionEngine.u(complexEntityLifecycleManager.u());
            classMetadataExtractor.b(bytecodeInspectionEngine);
            this.u.put(string2, bytecodeInspectionEngine);
            return bytecodeInspectionEngine;
        }
        catch (ContextualExceptionHandler contextualExceptionHandler) {
            throw new CompilationDiagnosticException(contextualExceptionHandler);
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw new CompilationDiagnosticException(customRuntimeException);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Exception decompiling
     */
    private String G(ClassMetadataExtractor var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[DOLOOP]], but top level block is 0[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}

