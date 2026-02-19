/*
 * Decompiled with CFR 0.152.
 */
package com.development.tools;

import com.app.geo.mapping.GeolocationInterpreter;
import com.app.network.connection.NetworkConnectionManager2025;
import com.app.reflection.ReflectionMetadataContainer;
import com.app.security.AuthenticationService;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.bytecode.exception.BytecodeProcessingException;
import com.deobfuscation.configuration.ConfigurationManager2137;
import com.deobfuscation.reflection.WildcardTypeResolver;
import com.monitoring.diagnostics.DiagnosticEventRecorder;
import com.reflection.metadata.ClassMetadataExtractor654;
import com.security.permissions.UserPermissionResolver;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class DecompilationErrorHandler1089
extends ClassMetadataExtractor654 {
    public static AuthenticationService K(String string) throws BytecodeProcessingException {
        try {
            return DecompilationErrorHandler1089.U(string, new DiagnosticEventRecorder(null));
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw DecompilationErrorHandler1089.S(string);
        }
    }

    DecompilationErrorHandler1089(BytecodeAnalyzer bytecodeAnalyzer, int n, DataInputStream dataInputStream) throws IOException {
        super(bytecodeAnalyzer, n, dataInputStream);
    }

    private static UserPermissionResolver A(String string, DiagnosticEventRecorder diagnosticEventRecorder) throws BytecodeProcessingException {
        int n = 1;
        try {
            while (string.charAt(++diagnosticEventRecorder.R) == '[') {
                ++n;
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw DecompilationErrorHandler1089.a(bytecodeProcessingException);
        }
        return new NetworkConnectionManager2025(n, DecompilationErrorHandler1089.U(string, diagnosticEventRecorder));
    }

    static BytecodeProcessingException B(String string) {
        return DecompilationErrorHandler1089.S(string);
    }

    private static boolean lambda$makeNewClassName$0(int n) {
        boolean bl;
        try {
            bl = n == 36;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw DecompilationErrorHandler1089.a(indexOutOfBoundsException);
        }
        return bl;
    }

    private static WildcardTypeResolver[] r(String string, DiagnosticEventRecorder diagnosticEventRecorder) throws BytecodeProcessingException {
        ArrayList<WildcardTypeResolver> arrayList = new ArrayList<WildcardTypeResolver>();
        while (true) {
            WildcardTypeResolver wildcardTypeResolver;
            block7: {
                char c;
                block6: {
                    block5: {
                        c = string.charAt(diagnosticEventRecorder.R++);
                        try {
                            if (c == '>') break;
                            if (c != '*') break block5;
                        }
                        catch (BytecodeProcessingException bytecodeProcessingException) {
                            throw DecompilationErrorHandler1089.a(bytecodeProcessingException);
                        }
                        wildcardTypeResolver = new WildcardTypeResolver(null, '*');
                        break block7;
                    }
                    try {
                        if (c == '+' || c == '-') break block6;
                    }
                    catch (BytecodeProcessingException bytecodeProcessingException) {
                        throw DecompilationErrorHandler1089.a(bytecodeProcessingException);
                    }
                    c = ' ';
                    --diagnosticEventRecorder.R;
                }
                wildcardTypeResolver = new WildcardTypeResolver(DecompilationErrorHandler1089.q(string, diagnosticEventRecorder, false), c);
            }
            arrayList.add(wildcardTypeResolver);
        }
        return arrayList.toArray(new WildcardTypeResolver[arrayList.size()]);
    }

    private static BytecodeProcessingException S(String string) {
        return new BytecodeProcessingException("bad signature: " + string);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Exception decompiling
     */
    private static UserPermissionResolver q(String var0, DiagnosticEventRecorder var1_1, boolean var2_2) throws BytecodeProcessingException {
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

    public String Z() {
        return this.K().Z(ConfigurationManager2137.M(this.p(), 0));
    }

    private static AuthenticationService U(String string, DiagnosticEventRecorder diagnosticEventRecorder) throws BytecodeProcessingException {
        AuthenticationService authenticationService = DecompilationErrorHandler1089.q(string, diagnosticEventRecorder, true);
        if (authenticationService == null) {
            authenticationService = new GeolocationInterpreter(string.charAt(diagnosticEventRecorder.R++));
        }
        return authenticationService;
    }

    @Override
    public ClassMetadataExtractor654 O(BytecodeAnalyzer bytecodeAnalyzer, Map<String, String> map) {
        return new DecompilationErrorHandler1089(bytecodeAnalyzer, this.Z());
    }

    public DecompilationErrorHandler1089(BytecodeAnalyzer bytecodeAnalyzer, String string) {
        super(bytecodeAnalyzer, "Signature");
        int n = bytecodeAnalyzer.D(string);
        byte[] byArray = new byte[]{(byte)(n >>> 8), (byte)n};
        this.p(byArray);
    }

    private static ReflectionMetadataContainer X(String string, DiagnosticEventRecorder diagnosticEventRecorder, ReflectionMetadataContainer reflectionMetadataContainer) throws BytecodeProcessingException {
        ReflectionMetadataContainer reflectionMetadataContainer2;
        block9: {
            WildcardTypeResolver[] wildcardTypeResolverArray;
            char c;
            int n = ++diagnosticEventRecorder.R;
            while ((c = string.charAt(diagnosticEventRecorder.R++)) != '$') {
                try {
                    if (c != '<' && c != ';') continue;
                    break;
                }
                catch (BytecodeProcessingException bytecodeProcessingException) {
                    throw DecompilationErrorHandler1089.a(bytecodeProcessingException);
                }
            }
            int n2 = diagnosticEventRecorder.R - 1;
            if (c == '<') {
                wildcardTypeResolverArray = DecompilationErrorHandler1089.r(string, diagnosticEventRecorder);
                c = string.charAt(diagnosticEventRecorder.R++);
            } else {
                wildcardTypeResolverArray = null;
            }
            reflectionMetadataContainer2 = ReflectionMetadataContainer.z(string, n, n2, wildcardTypeResolverArray, reflectionMetadataContainer);
            try {
                try {
                    if (c != '$' && c != '.') break block9;
                }
                catch (BytecodeProcessingException bytecodeProcessingException) {
                    throw DecompilationErrorHandler1089.a(bytecodeProcessingException);
                }
                --diagnosticEventRecorder.R;
                return DecompilationErrorHandler1089.X(string, diagnosticEventRecorder, reflectionMetadataContainer2);
            }
            catch (BytecodeProcessingException bytecodeProcessingException) {
                throw DecompilationErrorHandler1089.a(bytecodeProcessingException);
            }
        }
        return reflectionMetadataContainer2;
    }
}

