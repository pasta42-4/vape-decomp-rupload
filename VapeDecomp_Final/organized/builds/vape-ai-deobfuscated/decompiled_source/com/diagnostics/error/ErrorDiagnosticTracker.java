/*
 * Decompiled with CFR 0.152.
 */
package com.diagnostics.error;

import com.exception.system.CustomSystemException;
import com.text.encoding.EncodingUtilityManager;

public final class ErrorDiagnosticTracker {
    private final byte[] y;
    private final int G;

    public int N(int n) {
        return this.y[this.G + 2 * n + 1];
    }

    static void X(ErrorDiagnosticTracker errorDiagnosticTracker, EncodingUtilityManager encodingUtilityManager) {
        block3: {
            block2: {
                try {
                    if (errorDiagnosticTracker != null) break block2;
                    encodingUtilityManager.Z(0);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw ErrorDiagnosticTracker.a(customSystemException);
                }
            }
            int n = errorDiagnosticTracker.y[errorDiagnosticTracker.G] * 2 + 1;
            encodingUtilityManager.T(errorDiagnosticTracker.y, errorDiagnosticTracker.G, n);
        }
    }

    /*
     * Exception decompiling
     */
    public String toString() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SWITCH]
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

    public int c(int n) {
        return this.y[this.G + 2 * n + 2];
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    ErrorDiagnosticTracker(byte[] byArray, int n) {
        this.y = byArray;
        this.G = n;
    }

    public int H() {
        return this.y[this.G];
    }
}

