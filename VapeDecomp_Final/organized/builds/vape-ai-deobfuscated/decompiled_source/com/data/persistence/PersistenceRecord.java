/*
 * Decompiled with CFR 0.152.
 */
package com.data.persistence;

import com.data.processing.MultiOperationProcessor;
import com.exception.system.CustomSystemException;
import com.system.compilation.CompilationDiagnosticException;
import java.io.Serializable;

public abstract class PersistenceRecord
implements Serializable {
    private static final long serialVersionUID = 1L;
    private static int U;

    protected String v() {
        String string = this.getClass().getName();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    private static CustomSystemException c(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static int t() {
        int n = PersistenceRecord.m();
        try {
            if (n == 0) {
                return 41;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PersistenceRecord.c(customSystemException);
        }
        return 0;
    }

    static {
        if (PersistenceRecord.t() == 0) {
            PersistenceRecord.t(120);
        }
    }

    public static int m() {
        return U;
    }

    public void M(PersistenceRecord persistenceRecord) {
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('<');
        stringBuilder.append(this.v());
        stringBuilder.append('>');
        return stringBuilder.toString();
    }

    public abstract void z(MultiOperationProcessor var1) throws CompilationDiagnosticException;

    public PersistenceRecord Z() {
        return null;
    }

    public PersistenceRecord u() {
        return null;
    }

    public static void t(int n) {
        U = n;
    }
}

