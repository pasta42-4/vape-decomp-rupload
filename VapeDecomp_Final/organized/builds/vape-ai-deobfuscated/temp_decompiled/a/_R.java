/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package a;

import a.O_;
import org.lwjgl.opengl.GL11;

public class _r {
    public boolean c;
    private static String[] m;
    public boolean y;
    public boolean T;
    public boolean w;

    public static void z(String[] stringArray) {
        m = stringArray;
    }

    /*
     * Exception decompiling
     */
    public boolean j(int var1_1) {
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

    public _r E() {
        return new _r(this);
    }

    public void B() {
        block7: {
            block6: {
                block5: {
                    block4: {
                        try {
                            if (!this.y) break block4;
                            GL11.glEnable((int)2929);
                            break block5;
                        }
                        catch (O_ o_2) {
                            throw _r.a(o_2);
                        }
                    }
                    GL11.glDisable((int)2929);
                }
                try {
                    if (!this.c) break block6;
                    GL11.glEnable((int)3042);
                    break block7;
                }
                catch (O_ o_3) {
                    throw _r.a(o_3);
                }
            }
            GL11.glDisable((int)3042);
        }
        GL11.glDepthMask((boolean)this.T);
    }

    public boolean equals(Object object) {
        boolean bl2;
        try {
            if (this == object) {
                return true;
            }
        }
        catch (O_ o_2) {
            throw _r.a(o_2);
        }
        try {
            if (!(object instanceof _r)) {
                return false;
            }
        }
        catch (O_ o_3) {
            throw _r.a(o_3);
        }
        _r _r2 = (_r)object;
        try {
            bl2 = this.t() == _r2.t();
        }
        catch (O_ o_4) {
            throw _r.a(o_4);
        }
        return bl2;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    /*
     * Exception decompiling
     */
    public boolean e(int var1_1) {
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

    public _r(_r _r2) {
        this.w = _r2.w;
        this.y = _r2.y;
        this.c = _r2.c;
        this.T = _r2.T;
    }

    static {
        if (_r.r() != null) {
            _r.z(new String[2]);
        }
    }

    public _r() {
    }

    public long t() {
        long l10;
        long l11;
        long l12;
        long l13;
        long l14;
        long l15;
        long l16;
        long l17;
        long l18 = 0L;
        try {
            l17 = l18;
            l16 = this.w ? 1L : 0L;
        }
        catch (O_ o_2) {
            throw _r.a(o_2);
        }
        l18 = l17 | l16 << 0;
        try {
            l15 = l18;
            l14 = this.y ? 1L : 0L;
        }
        catch (O_ o_3) {
            throw _r.a(o_3);
        }
        l18 = l15 | l14 << 1;
        try {
            l13 = l18;
            l12 = this.c ? 1L : 0L;
        }
        catch (O_ o_4) {
            throw _r.a(o_4);
        }
        l18 = l13 | l12 << 2;
        try {
            l11 = l18;
            l10 = this.T ? 1L : 0L;
        }
        catch (O_ o_5) {
            throw _r.a(o_5);
        }
        l18 = l11 | l10 << 3;
        return l18;
    }

    public static String[] r() {
        return m;
    }

    public void X(boolean bl2) {
        this.T = bl2;
    }
}

