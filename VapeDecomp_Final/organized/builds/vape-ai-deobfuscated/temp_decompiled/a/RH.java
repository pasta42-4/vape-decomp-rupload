/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O0;
import a.O_;

public final class rh {
    private final byte[] y;
    private final int G;

    public int N(int n2) {
        return this.y[this.G + 2 * n2 + 1];
    }

    static void X(rh rh2, O0 o02) {
        block3: {
            block2: {
                try {
                    if (rh2 != null) break block2;
                    o02.Z(0);
                    break block3;
                }
                catch (O_ o_2) {
                    throw rh.a(o_2);
                }
            }
            int n2 = rh2.y[rh2.G] * 2 + 1;
            o02.T(rh2.y, rh2.G, n2);
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

    public int c(int n2) {
        return this.y[this.G + 2 * n2 + 2];
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    rh(byte[] byArray, int n2) {
        this.y = byArray;
        this.G = n2;
    }

    public int H() {
        return this.y[this.G];
    }
}

