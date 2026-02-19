/*
 * Decompiled with CFR 0.152.
 */
package com.system.compilation;

import com.compiler.parsing.SyntaxTokenizer;
import com.core.exception.CustomRuntimeException;
import com.error.handling.ContextualExceptionHandler;
import com.exception.system.CustomSystemException;

public class CompilationDiagnosticException
extends Exception {
    private static final long serialVersionUID = 1L;
    private String l;
    private SyntaxTokenizer Q;
    private static int y;

    @Override
    public String getMessage() {
        return this.l;
    }

    public static int e() {
        int n = CompilationDiagnosticException.X();
        try {
            if (n == 0) {
                return 72;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CompilationDiagnosticException.a(customSystemException);
        }
        return 0;
    }

    public CompilationDiagnosticException(String string, SyntaxTokenizer syntaxTokenizer) {
        this.l = string;
        this.Q = syntaxTokenizer;
    }

    public CompilationDiagnosticException(ContextualExceptionHandler contextualExceptionHandler) {
        this(contextualExceptionHandler.u());
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public CompilationDiagnosticException(String string) {
        this.l = string;
        this.Q = null;
    }

    public static int X() {
        return y;
    }

    @Override
    public String toString() {
        return "compile error: " + this.l;
    }

    public CompilationDiagnosticException(CustomRuntimeException customRuntimeException) {
        this("cannot find " + customRuntimeException.getMessage());
    }

    static {
        if (CompilationDiagnosticException.X() == 0) {
            CompilationDiagnosticException.e(38);
        }
    }

    public static void e(int n) {
        y = n;
    }
}

