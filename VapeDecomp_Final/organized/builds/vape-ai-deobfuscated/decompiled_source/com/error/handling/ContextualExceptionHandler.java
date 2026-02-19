/*
 * Decompiled with CFR 0.152.
 */
package com.error.handling;

import com.core.exception.CustomRuntimeException;
import com.exception.system.CustomSystemException;
import com.system.compilation.CompilationDiagnosticException;

public class ContextualExceptionHandler
extends Exception {
    private String t;
    private Throwable b;
    private static final long serialVersionUID = 1L;

    public ContextualExceptionHandler(CustomRuntimeException customRuntimeException) {
        this("cannot find " + customRuntimeException.getMessage(), customRuntimeException);
    }

    public ContextualExceptionHandler(CompilationDiagnosticException compilationDiagnosticException) {
        this("[source error] " + compilationDiagnosticException.getMessage(), compilationDiagnosticException);
    }

    public ContextualExceptionHandler(Throwable throwable) {
        super("by " + throwable.toString());
        this.t = null;
        this.initCause(throwable);
    }

    public ContextualExceptionHandler(String string, Throwable throwable) {
        this(string);
        this.initCause(throwable);
    }

    public String u() {
        try {
            if (this.t != null) {
                return this.t;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualExceptionHandler.a(customSystemException);
        }
        return this.toString();
    }

    @Override
    public synchronized Throwable getCause() {
        Throwable throwable;
        try {
            throwable = this.b == this ? null : this.b;
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualExceptionHandler.a(customSystemException);
        }
        return throwable;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public ContextualExceptionHandler(String string) {
        super(string);
        this.t = string;
        this.initCause(null);
    }

    @Override
    public synchronized Throwable initCause(Throwable throwable) {
        this.b = throwable;
        return this;
    }
}

