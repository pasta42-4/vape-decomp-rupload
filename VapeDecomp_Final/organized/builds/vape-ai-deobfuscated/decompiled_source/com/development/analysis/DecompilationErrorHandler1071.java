/*
 * Decompiled with CFR 0.152.
 */
package com.development.analysis;

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
import com.reflection.invoke.MethodInvoker;
import com.reflection.metadata.ReflectionMetadataResolver933;
import com.reflection.registry.MetaclassDefinitionRegistry;
import com.system.compilation.CompilationDiagnosticException;
import com.user.profile.UserProfileManager1412;

public class DecompilationErrorHandler1071
extends J0 {
    int T;

    /*
     * Exception decompiling
     */
    MetaclassDefinitionRegistry L(int var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
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

    private void M(String string) throws CompilationDiagnosticException, CustomRuntimeException, BytecodeProcessingException, ContextualExceptionHandler {
        int n;
        int n2;
        String string2;
        Object object;
        this.r.Q();
        BytecodeAnalyzer bytecodeAnalyzer = this.e();
        int n3 = this.e;
        int n4 = 0;
        int n5 = 1;
        if (this.T == 188) {
            n4 = this.D.z(this.e + 1);
            object = (UserProfileManager1412)this.L(n4);
            string2 = "[" + ((UserProfileManager1412)object).y();
            n2 = 2;
        } else if (this.T == 189) {
            n4 = this.D.Z(n3 + 1);
            string2 = bytecodeAnalyzer.u(n4);
            string2 = string2.startsWith("[") ? "[" + string2 : "[L" + string2 + ";";
            n2 = 3;
        } else if (this.T == 197) {
            n4 = this.D.Z(this.e + 1);
            string2 = bytecodeAnalyzer.u(n4);
            n5 = this.D.z(this.e + 3);
            n2 = 4;
        } else {
            throw new RuntimeException("bad opcode: " + this.T);
        }
        MetaclassDefinitionRegistry metaclassDefinitionRegistry = ReflectionMetadataResolver933.f(string2, this.r.K());
        object = new ArgumentInterceptor(this.r);
        BinaryCodeAnalyzer binaryCodeAnalyzer = this.D.O();
        MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray = new MetaclassDefinitionRegistry[n5];
        try {
            for (n = 0; n < n5; ++n) {
                metaclassDefinitionRegistryArray[n] = MetaclassDefinitionRegistry.b;
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorHandler1071.b(compilationDiagnosticException);
        }
        n = binaryCodeAnalyzer.i();
        ((ArgumentInterceptor)object).W("java.lang.Object", metaclassDefinitionRegistryArray, true, n, this.u());
        DecompilationErrorHandler1071.W(metaclassDefinitionRegistry, string);
        int n6 = ((ArgumentInterceptor)object).Y(metaclassDefinitionRegistry, true);
        ((ArgumentInterceptor)object).Z(new MethodInvoker(metaclassDefinitionRegistry, this.T, n4, n5));
        ComplexEntityLifecycleManager complexEntityLifecycleManager = ((ArgumentInterceptor)object).k();
        DecompilationErrorHandler1071.x(metaclassDefinitionRegistryArray, true, n, complexEntityLifecycleManager);
        ((ArgumentInterceptor)object).X(binaryCodeAnalyzer, n3);
        complexEntityLifecycleManager.E(1);
        complexEntityLifecycleManager.S(n6);
        ((ArgumentInterceptor)object).b(string);
        complexEntityLifecycleManager.B(n6);
        this.E(n3, complexEntityLifecycleManager, n2);
    }

    @Override
    public _c E() {
        return super.E();
    }

    protected DecompilationErrorHandler1071(int n, BytecodeAnalysisEngine305 bytecodeAnalysisEngine305, MetaclassDefinitionRegistry metaclassDefinitionRegistry, BytecodeInspectionEngine bytecodeInspectionEngine, int n2) {
        super(n, bytecodeAnalysisEngine305, metaclassDefinitionRegistry, bytecodeInspectionEngine);
        this.T = n2;
    }

    @Override
    public int H() {
        return super.H();
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    @Override
    public void N(String string) throws ContextualExceptionHandler {
        try {
            this.M(string);
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
}

