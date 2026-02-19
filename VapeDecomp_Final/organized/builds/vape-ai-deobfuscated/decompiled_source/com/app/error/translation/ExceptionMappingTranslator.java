/*
 * Decompiled with CFR 0.152.
 */
package com.app.error.translation;

import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderingController52;
import com.security.crypto.CryptographicParameterGenerator;
import com.security.protocols.CryptoAlgorithmSpecification;
import com.simulation.configuration.SimulationConfigurer;
import com.system.configuration.ConfigurationManager;

public class ExceptionMappingTranslator
extends SimulationConfigurer {
    private GraphicalRenderingController52 MQ;
    private CryptoAlgorithmSpecification MW;

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void G() {
        String string;
        CryptographicParameterGenerator cryptographicParameterGenerator = this.L(0.75);
        try {
            string = this.N() ? this.a() : this.C();
        }
        catch (CustomSystemException customSystemException) {
            throw ExceptionMappingTranslator.a(customSystemException);
        }
        String string2 = string;
        try {
            cryptographicParameterGenerator.R(string2, this.G() + (this.I() - cryptographicParameterGenerator.D(string2)), this.W(), ExceptionMappingTranslator.M.n);
            if (this.d()) {
                this.R = string2.length();
                this.h(cryptographicParameterGenerator, this.G() + this.I(), this.W());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ExceptionMappingTranslator.a(customSystemException);
        }
        ConfigurationManager.A(this.G(), this.W() + 5.0 + 2.0, this.w(), 1.0, this.Z());
    }

    /*
     * Exception decompiling
     */
    @Override
    public void O() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[CASE]], but top level block is 2[TRYBLOCK]
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

    @Override
    public void u() {
        this.y(this.C());
    }

    /*
     * Exception decompiling
     */
    public String C() {
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

    public ExceptionMappingTranslator(GraphicalRenderingController52 graphicalRenderingController52, CryptoAlgorithmSpecification cryptoAlgorithmSpecification) {
        this.MQ = graphicalRenderingController52;
        this.MW = cryptoAlgorithmSpecification;
        this.L.N(false);
    }
}

