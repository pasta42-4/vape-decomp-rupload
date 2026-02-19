/*
 * Decompiled with CFR 0.152.
 */
package com.serialization.core;

import com.compiler.parsing.SyntaxTokenizer;
import com.system.compilation.CompilationDiagnosticException;

public class SerializationUtility2478
extends CompilationDiagnosticException {
    private static final long serialVersionUID = 1L;

    public SerializationUtility2478(SyntaxTokenizer syntaxTokenizer) {
        super("syntax error near \"" + syntaxTokenizer.E() + "\"", syntaxTokenizer);
    }
}

