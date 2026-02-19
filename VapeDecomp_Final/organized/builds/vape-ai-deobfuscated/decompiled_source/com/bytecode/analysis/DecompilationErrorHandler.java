/*
 * Decompiled with CFR 0.152.
 */
package com.bytecode.analysis;

import a.W;
import com.bytecode.analysis.BinaryCodeAnalyzer;
import com.bytecode.analysis.BytecodeAnalysisEngine1263;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.bytecode.analysis.BytecodeInspectionEngine;
import com.bytecode.exception.BytecodeProcessingException;
import com.debugging.analysis.ExceptionAnalyzer;
import com.deobfuscation.execution.CodeExecutionHandler;
import com.reflection.mapping.ReflectionClassMapper;
import com.system.initialization.InitializationBroker;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class DecompilationErrorHandler
extends BytecodeAnalysisEngine1263 {
    public ExceptionAnalyzer[] I = null;
    public ExceptionAnalyzer[] Y;
    public int w;
    public int v;

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Exception decompiling
     */
    private static ExceptionAnalyzer B(char var0) {
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

    public static DecompilationErrorHandler[] k(BytecodeInspectionEngine bytecodeInspectionEngine, BinaryCodeAnalyzer binaryCodeAnalyzer, boolean bl) throws BytecodeProcessingException {
        boolean bl2;
        DecompilationErrorHandler[] decompilationErrorHandlerArray;
        block10: {
            decompilationErrorHandlerArray = (DecompilationErrorHandler[])new CodeExecutionHandler().Z(bytecodeInspectionEngine);
            try {
                block11: {
                    try {
                        try {
                            try {
                                if (!bl || decompilationErrorHandlerArray.length >= 2) break block10;
                            }
                            catch (BytecodeProcessingException bytecodeProcessingException) {
                                throw DecompilationErrorHandler.a(bytecodeProcessingException);
                            }
                            if (decompilationErrorHandlerArray.length == 0) break block11;
                        }
                        catch (BytecodeProcessingException bytecodeProcessingException) {
                            throw DecompilationErrorHandler.a(bytecodeProcessingException);
                        }
                        if (decompilationErrorHandlerArray[0].C != 0) break block10;
                    }
                    catch (BytecodeProcessingException bytecodeProcessingException) {
                        throw DecompilationErrorHandler.a(bytecodeProcessingException);
                    }
                }
                return null;
            }
            catch (BytecodeProcessingException bytecodeProcessingException) {
                throw DecompilationErrorHandler.a(bytecodeProcessingException);
            }
        }
        BytecodeAnalyzer bytecodeAnalyzer = bytecodeInspectionEngine.v();
        try {
            bl2 = (bytecodeInspectionEngine.Z() & 8) != 0;
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw DecompilationErrorHandler.a(bytecodeProcessingException);
        }
        boolean bl3 = bl2;
        decompilationErrorHandlerArray[0].X(binaryCodeAnalyzer.Q(), binaryCodeAnalyzer.i(), bytecodeAnalyzer.j(), bytecodeInspectionEngine.b(), bl3, bytecodeInspectionEngine.O());
        return decompilationErrorHandlerArray;
    }

    @Override
    protected void J(StringBuilder stringBuilder) {
        super.J(stringBuilder);
        stringBuilder.append(",\n stack={");
        this.y(stringBuilder, this.v, this.Y);
        stringBuilder.append("}, locals={");
        this.y(stringBuilder, this.w, this.I);
        stringBuilder.append('}');
    }

    private static int A(String string, int n, int n2, ExceptionAnalyzer[] exceptionAnalyzerArray) throws BytecodeProcessingException {
        int n3 = n;
        int n4 = 0;
        char c = string.charAt(n);
        try {
            if (c == ')') {
                return 0;
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw DecompilationErrorHandler.a(bytecodeProcessingException);
        }
        while (c == '[') {
            ++n4;
            c = string.charAt(++n);
        }
        if (c == 'L') {
            int n5 = string.indexOf(59, ++n);
            try {
                exceptionAnalyzerArray[n2] = n4 > 0 ? new ReflectionClassMapper(string.substring(n3, ++n5)) : new ReflectionClassMapper(string.substring(n3 + 1, ++n5 - 1).replace('/', '.'));
            }
            catch (BytecodeProcessingException bytecodeProcessingException) {
                throw DecompilationErrorHandler.a(bytecodeProcessingException);
            }
            return n5;
        }
        try {
            if (n4 > 0) {
                exceptionAnalyzerArray[n2] = new ReflectionClassMapper(string.substring(n3, ++n));
                return n;
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw DecompilationErrorHandler.a(bytecodeProcessingException);
        }
        ExceptionAnalyzer exceptionAnalyzer = DecompilationErrorHandler.B(c);
        try {
            if (exceptionAnalyzer == null) {
                throw new BytecodeProcessingException("bad method descriptor: " + string);
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw DecompilationErrorHandler.a(bytecodeProcessingException);
        }
        exceptionAnalyzerArray[n2] = exceptionAnalyzer;
        return n + 1;
    }

    public static String Z(String string) {
        int n = string.indexOf(41);
        try {
            if (n < 0) {
                return "java.lang.Object";
            }
        }
        catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
            throw DecompilationErrorHandler.a(stringIndexOutOfBoundsException);
        }
        char c = string.charAt(n + 1);
        try {
            if (c == '[') {
                return string.substring(n + 1);
            }
        }
        catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
            throw DecompilationErrorHandler.a(stringIndexOutOfBoundsException);
        }
        try {
            if (c == 'L') {
                return string.substring(n + 2, string.length() - 1).replace('/', '.');
            }
        }
        catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
            throw DecompilationErrorHandler.a(stringIndexOutOfBoundsException);
        }
        return "java.lang.Object";
    }

    public boolean V() {
        boolean bl;
        try {
            bl = this.I != null;
        }
        catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
            throw DecompilationErrorHandler.a(stringIndexOutOfBoundsException);
        }
        return bl;
    }

    public void j(int n, ExceptionAnalyzer[] exceptionAnalyzerArray, int n2, ExceptionAnalyzer[] exceptionAnalyzerArray2) throws BytecodeProcessingException {
        this.v = n;
        this.Y = exceptionAnalyzerArray;
        this.w = n2;
        this.I = exceptionAnalyzerArray2;
    }

    protected DecompilationErrorHandler(int n) {
        super(n);
    }

    public void V() {
        if (this.I != null) {
            int n = this.I.length;
            while (true) {
                block11: {
                    try {
                        try {
                            try {
                                try {
                                    if (n <= 0 || this.I[n - 1].Z() != W.C) break;
                                }
                                catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
                                    throw DecompilationErrorHandler.a(stringIndexOutOfBoundsException);
                                }
                                if (n <= 1) break block11;
                            }
                            catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
                                throw DecompilationErrorHandler.a(stringIndexOutOfBoundsException);
                            }
                            if (this.I[n - 2].n()) {
                                break;
                            }
                        }
                        catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
                            throw DecompilationErrorHandler.a(stringIndexOutOfBoundsException);
                        }
                    }
                    catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
                        throw DecompilationErrorHandler.a(stringIndexOutOfBoundsException);
                    }
                }
                --n;
            }
            this.w = n;
        }
    }

    private void y(StringBuilder stringBuilder, int n, ExceptionAnalyzer[] exceptionAnalyzerArray) {
        try {
            if (exceptionAnalyzerArray == null) {
                return;
            }
        }
        catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
            throw DecompilationErrorHandler.a(stringIndexOutOfBoundsException);
        }
        int n2 = 0;
        while (true) {
            String string;
            StringBuilder stringBuilder2;
            block10: {
                try {
                    try {
                        if (n2 >= n) break;
                        if (n2 <= 0) break block10;
                    }
                    catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
                        throw DecompilationErrorHandler.a(stringIndexOutOfBoundsException);
                    }
                    stringBuilder.append(", ");
                }
                catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
                    throw DecompilationErrorHandler.a(stringIndexOutOfBoundsException);
                }
            }
            ExceptionAnalyzer exceptionAnalyzer = exceptionAnalyzerArray[n2];
            try {
                stringBuilder2 = stringBuilder;
                string = exceptionAnalyzer == null ? "<>" : exceptionAnalyzer.toString();
            }
            catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
                throw DecompilationErrorHandler.a(stringIndexOutOfBoundsException);
            }
            stringBuilder2.append(string);
            ++n2;
        }
    }

    void X(int n, int n2, String string, String string2, boolean bl, boolean bl2) throws BytecodeProcessingException {
        int n3;
        ExceptionAnalyzer[] exceptionAnalyzerArray;
        block16: {
            block15: {
                try {
                    if (string2.charAt(0) != '(') {
                        throw new BytecodeProcessingException("no method descriptor: " + string2);
                    }
                }
                catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
                    throw DecompilationErrorHandler.a(stringIndexOutOfBoundsException);
                }
                this.v = 0;
                this.Y = ExceptionAnalyzer.i(n);
                exceptionAnalyzerArray = ExceptionAnalyzer.i(n2);
                try {
                    if (!bl2) break block15;
                    exceptionAnalyzerArray[0] = new InitializationBroker(string);
                    break block16;
                }
                catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
                    throw DecompilationErrorHandler.a(stringIndexOutOfBoundsException);
                }
            }
            try {
                if (!bl) {
                    exceptionAnalyzerArray[0] = new ReflectionClassMapper(string);
                }
            }
            catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
                throw DecompilationErrorHandler.a(stringIndexOutOfBoundsException);
            }
        }
        try {
            n3 = bl ? -1 : 0;
        }
        catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
            throw DecompilationErrorHandler.a(stringIndexOutOfBoundsException);
        }
        int n4 = n3;
        int n5 = 1;
        try {
            while (true) {
                n5 = DecompilationErrorHandler.A(string2, n5, ++n4, exceptionAnalyzerArray);
                try {
                    if (n5 <= 0) break;
                    if (!exceptionAnalyzerArray[n4].n()) continue;
                }
                catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
                    throw DecompilationErrorHandler.a(stringIndexOutOfBoundsException);
                }
                exceptionAnalyzerArray[++n4] = W.C;
            }
        }
        catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
            throw new BytecodeProcessingException("bad method descriptor: " + string2);
        }
        this.w = n4;
        this.I = exceptionAnalyzerArray;
    }
}

