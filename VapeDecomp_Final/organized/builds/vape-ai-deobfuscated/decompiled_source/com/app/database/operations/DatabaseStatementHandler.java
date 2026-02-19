/*
 * Decompiled with CFR 0.152.
 */
package com.app.database.operations;

import a.eF;
import com.data.persistence.PersistenceRecord;
import com.data.processing.MultiOperationProcessor;
import com.exception.system.CustomSystemException;
import com.operations.bitwise.BitwiseOperationInterface;
import com.system.compilation.CompilationDiagnosticException;

public class DatabaseStatementHandler
extends eF
implements BitwiseOperationInterface {
    protected int e;
    private static final long serialVersionUID = 1L;

    public DatabaseStatementHandler(int n) {
        this(n, null);
    }

    @Override
    protected String v() {
        try {
            if (this.e < 128) {
                return "stmnt:" + (char)this.e;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DatabaseStatementHandler.a(customSystemException);
        }
        return "stmnt:" + this.e;
    }

    public static DatabaseStatementHandler l(int n, PersistenceRecord persistenceRecord, PersistenceRecord persistenceRecord2) {
        return new DatabaseStatementHandler(n, persistenceRecord, new eF(persistenceRecord2));
    }

    @Override
    public void z(MultiOperationProcessor multiOperationProcessor) throws CompilationDiagnosticException {
        multiOperationProcessor.W(this);
    }

    public static DatabaseStatementHandler q(int n, PersistenceRecord persistenceRecord, PersistenceRecord persistenceRecord2, PersistenceRecord persistenceRecord3) {
        return new DatabaseStatementHandler(n, persistenceRecord, new eF(persistenceRecord2, new eF(persistenceRecord3)));
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public DatabaseStatementHandler(int n, PersistenceRecord persistenceRecord, eF eF2) {
        super(persistenceRecord, eF2);
        this.e = n;
    }

    public DatabaseStatementHandler(int n, PersistenceRecord persistenceRecord) {
        super(persistenceRecord);
        this.e = n;
    }

    public int x() {
        return this.e;
    }
}

