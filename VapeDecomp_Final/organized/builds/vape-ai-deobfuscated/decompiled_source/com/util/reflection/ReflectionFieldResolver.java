/*
 * Decompiled with CFR 0.152.
 */
package com.util.reflection;

import com.data.persistence.PersistenceRecord;
import com.system.compilation.CompilationDiagnosticException;

public class ReflectionFieldResolver
extends CompilationDiagnosticException {
    private PersistenceRecord c;
    private String x;
    private static final long serialVersionUID = 1L;

    public ReflectionFieldResolver(String string, PersistenceRecord persistenceRecord) {
        super("no such field: " + string);
        this.x = string;
        this.c = persistenceRecord;
    }

    public String Y() {
        return this.x;
    }

    public PersistenceRecord l() {
        return this.c;
    }
}

