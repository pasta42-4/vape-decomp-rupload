/*
 * Decompiled with CFR 0.152.
 */
package com.app.security.crypto;

import a.eF;
import com.data.persistence.PersistenceRecord;
import com.data.processing.MultiOperationProcessor;
import com.exception.system.CustomSystemException;
import com.operations.bitwise.BitwiseOperationInterface;
import com.system.compilation.CompilationDiagnosticException;

public class CryptographicPrimitiveManager
extends eF
implements BitwiseOperationInterface {
    private static final long serialVersionUID = 1L;
    protected int E;

    @Override
    protected String v() {
        return "op:" + this.p();
    }

    CryptographicPrimitiveManager(int n, PersistenceRecord persistenceRecord, eF eF2) {
        super(persistenceRecord, eF2);
        this.E = n;
    }

    public PersistenceRecord R() {
        return this.Z();
    }

    CryptographicPrimitiveManager(int n, PersistenceRecord persistenceRecord) {
        super(persistenceRecord);
        this.E = n;
    }

    public PersistenceRecord V() {
        return this.u().Z();
    }

    @Override
    public void z(MultiOperationProcessor multiOperationProcessor) throws CompilationDiagnosticException {
        multiOperationProcessor.s(this);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void P(PersistenceRecord persistenceRecord) {
        this.M(persistenceRecord);
    }

    public static CryptographicPrimitiveManager n(int n, PersistenceRecord persistenceRecord, PersistenceRecord persistenceRecord2) {
        return new CryptographicPrimitiveManager(n, persistenceRecord, new eF(persistenceRecord2));
    }

    public static CryptographicPrimitiveManager f(int n, PersistenceRecord persistenceRecord) {
        return new CryptographicPrimitiveManager(n, persistenceRecord);
    }

    public void Z(PersistenceRecord persistenceRecord) {
        this.u().M(persistenceRecord);
    }

    public String p() {
        int n;
        block10: {
            n = this.E;
            try {
                if (n < 128) {
                    return String.valueOf((char)n);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicPrimitiveManager.a(customSystemException);
            }
            try {
                try {
                    if (350 > n || n > 371) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicPrimitiveManager.a(customSystemException);
                }
                return p[n - 350];
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicPrimitiveManager.a(customSystemException);
            }
        }
        try {
            if (n == 323) {
                return "instanceof";
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicPrimitiveManager.a(customSystemException);
        }
        return String.valueOf(n);
    }

    public void U(int n) {
        this.E = n;
    }

    public int I() {
        return this.E;
    }
}

