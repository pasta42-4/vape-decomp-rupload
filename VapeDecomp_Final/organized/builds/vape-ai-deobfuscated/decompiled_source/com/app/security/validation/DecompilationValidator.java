/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.app.security.validation;

import com.exception.system.CustomSystemException;
import org.lwjgl.opengl.GL11;

public class DecompilationValidator {
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

    public DecompilationValidator E() {
        return new DecompilationValidator(this);
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
                        catch (CustomSystemException customSystemException) {
                            throw DecompilationValidator.a(customSystemException);
                        }
                    }
                    GL11.glDisable((int)2929);
                }
                try {
                    if (!this.c) break block6;
                    GL11.glEnable((int)3042);
                    break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw DecompilationValidator.a(customSystemException);
                }
            }
            GL11.glDisable((int)3042);
        }
        GL11.glDepthMask((boolean)this.T);
    }

    public boolean equals(Object object) {
        boolean bl;
        try {
            if (this == object) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DecompilationValidator.a(customSystemException);
        }
        try {
            if (!(object instanceof DecompilationValidator)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DecompilationValidator.a(customSystemException);
        }
        DecompilationValidator decompilationValidator = (DecompilationValidator)object;
        try {
            bl = this.t() == decompilationValidator.t();
        }
        catch (CustomSystemException customSystemException) {
            throw DecompilationValidator.a(customSystemException);
        }
        return bl;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
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

    public DecompilationValidator(DecompilationValidator decompilationValidator) {
        this.w = decompilationValidator.w;
        this.y = decompilationValidator.y;
        this.c = decompilationValidator.c;
        this.T = decompilationValidator.T;
    }

    static {
        if (DecompilationValidator.r() != null) {
            DecompilationValidator.z(new String[2]);
        }
    }

    public DecompilationValidator() {
    }

    public long t() {
        long l;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        long l7;
        long l8;
        long l9 = 0L;
        try {
            l8 = l9;
            l7 = this.w ? 1L : 0L;
        }
        catch (CustomSystemException customSystemException) {
            throw DecompilationValidator.a(customSystemException);
        }
        l9 = l8 | l7 << 0;
        try {
            l6 = l9;
            l5 = this.y ? 1L : 0L;
        }
        catch (CustomSystemException customSystemException) {
            throw DecompilationValidator.a(customSystemException);
        }
        l9 = l6 | l5 << 1;
        try {
            l4 = l9;
            l3 = this.c ? 1L : 0L;
        }
        catch (CustomSystemException customSystemException) {
            throw DecompilationValidator.a(customSystemException);
        }
        l9 = l4 | l3 << 2;
        try {
            l2 = l9;
            l = this.T ? 1L : 0L;
        }
        catch (CustomSystemException customSystemException) {
            throw DecompilationValidator.a(customSystemException);
        }
        l9 = l2 | l << 3;
        return l9;
    }

    public static String[] r() {
        return m;
    }

    public void X(boolean bl) {
        this.T = bl;
    }
}

