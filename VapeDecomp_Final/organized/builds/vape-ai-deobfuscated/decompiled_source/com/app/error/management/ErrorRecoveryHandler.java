/*
 * Decompiled with CFR 0.152.
 */
package com.app.error.management;

import com.config.management.ConfigurationParameterManager;
import com.exception.system.CustomSystemException;
import com.system.lifecycle.ObjectLifecycleTracker;

public class ErrorRecoveryHandler
extends ObjectLifecycleTracker {
    public static ErrorRecoveryHandler A() {
        return new ErrorRecoveryHandler(ConfigurationParameterManager.Z(ErrorRecoveryHandler.U.u().kI));
    }

    public ErrorRecoveryHandler(Object object) {
        super(object);
    }

    public static ErrorRecoveryHandler l() {
        return new ErrorRecoveryHandler(ConfigurationParameterManager.B(ErrorRecoveryHandler.U.u().kI));
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static ErrorRecoveryHandler X() {
        return new ErrorRecoveryHandler(ConfigurationParameterManager.f(ErrorRecoveryHandler.U.u().kI));
    }

    public int R() {
        return ConfigurationParameterManager.x(ErrorRecoveryHandler.U.u().kI, this.H);
    }

    public static ErrorRecoveryHandler P() {
        return new ErrorRecoveryHandler(ConfigurationParameterManager.j(ErrorRecoveryHandler.U.u().kI));
    }

    /*
     * Exception decompiling
     */
    public static ErrorRecoveryHandler C(int var0) {
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

    public static ErrorRecoveryHandler S() {
        return new ErrorRecoveryHandler(ConfigurationParameterManager.A(ErrorRecoveryHandler.U.u().kI));
    }

    public static ErrorRecoveryHandler H() {
        return new ErrorRecoveryHandler(ConfigurationParameterManager.S(ErrorRecoveryHandler.U.u().kI));
    }
}

