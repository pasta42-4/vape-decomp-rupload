/*
 * Decompiled with CFR 0.152.
 */
package com.reverse.engineering;

import com.bytecode.analysis.BytecodeAnnotationExtractor;
import com.core.exception.CustomRuntimeException;
import com.deobfuscation.orchestration.OperationOrchestrator;
import com.reflection.metadata.ReflectionMetadataResolver933;
import com.reflection.registry.MetaclassDefinitionRegistry;
import com.util.serialization.SerializationUtility2100;

public class DecompilationAnalyzer
extends SerializationUtility2100 {
    protected BytecodeAnnotationExtractor K;

    public MetaclassDefinitionRegistry Z() throws CustomRuntimeException {
        return ReflectionMetadataResolver933.f(this.K.S(), this.k.K());
    }

    /*
     * Exception decompiling
     */
    public Object q() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 4[SWITCH]
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

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    @Override
    public String l() {
        return this.K.Q();
    }

    @Override
    public int A() {
        return OperationOrchestrator.X(this.K.q());
    }

    @Override
    public String I() {
        return this.K.S();
    }

    DecompilationAnalyzer(BytecodeAnnotationExtractor bytecodeAnnotationExtractor, MetaclassDefinitionRegistry metaclassDefinitionRegistry) {
        super(metaclassDefinitionRegistry);
        this.K = bytecodeAnnotationExtractor;
    }

    @Override
    protected void r(StringBuilder stringBuilder) {
        stringBuilder.append(' ');
        stringBuilder.append(this.l());
        stringBuilder.append(' ');
        stringBuilder.append(this.K.S());
    }

    public BytecodeAnnotationExtractor b() {
        return this.K;
    }

    @Override
    public MetaclassDefinitionRegistry E() {
        return super.E();
    }

    @Override
    public String toString() {
        return this.E().H() + "." + this.l() + ":" + this.K.S();
    }
}

