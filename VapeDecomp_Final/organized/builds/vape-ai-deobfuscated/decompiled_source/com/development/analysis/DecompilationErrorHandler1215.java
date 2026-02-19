/*
 * Decompiled with CFR 0.152.
 */
package com.development.analysis;

import com.entity.lifecycle.ComplexEntityLifecycleManager;
import com.network.mapping.NetworkInterfaceMapper;
import com.system.validation.SafetyComplianceValidator;
import java.util.ArrayList;
import java.util.List;

class DecompilationErrorHandler1215
extends NetworkInterfaceMapper {
    SafetyComplianceValidator v;
    int e;
    List<int[]> a = new ArrayList<int[]>();

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    /*
     * Exception decompiling
     */
    @Override
    protected boolean Z(ComplexEntityLifecycleManager var1_1, int var2_2) {
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

    private int D(int n) {
        try {
            if (this.e < 0) {
                this.e = this.v.H();
                this.v.l(n);
            }
        }
        catch (RuntimeException runtimeException) {
            throw DecompilationErrorHandler1215.a(runtimeException);
        }
        return this.e;
    }

    private void l(ComplexEntityLifecycleManager complexEntityLifecycleManager) {
        complexEntityLifecycleManager.E(167);
        this.a.add(new int[]{complexEntityLifecycleManager.H(), this.e});
        complexEntityLifecycleManager.m(0);
    }

    DecompilationErrorHandler1215(SafetyComplianceValidator safetyComplianceValidator) {
        super(safetyComplianceValidator);
        this.v = safetyComplianceValidator;
        this.e = -1;
    }
}

