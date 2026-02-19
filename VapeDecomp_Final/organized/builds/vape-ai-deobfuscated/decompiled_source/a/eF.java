/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.data.persistence.PersistenceRecord;
import com.data.processing.MultiOperationProcessor;
import com.exception.system.CustomSystemException;
import com.system.compilation.CompilationDiagnosticException;

public class eF
extends PersistenceRecord {
    private eF i;
    private PersistenceRecord G;
    private static final long serialVersionUID = 1L;
    private static String[] K;

    public eF n() {
        return this.i;
    }

    @Override
    public void M(PersistenceRecord persistenceRecord) {
        this.G = persistenceRecord;
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static String[] I() {
        return K;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(<");
        stringBuilder.append(this.v());
        stringBuilder.append('>');
        eF eF2 = this;
        while (eF2 != null) {
            String string;
            StringBuilder stringBuilder2;
            stringBuilder.append(' ');
            PersistenceRecord persistenceRecord = eF2.G;
            try {
                stringBuilder2 = stringBuilder;
                string = persistenceRecord == null ? "<null>" : persistenceRecord.toString();
            }
            catch (CustomSystemException customSystemException) {
                throw eF.b(customSystemException);
            }
            stringBuilder2.append(string);
            eF2 = eF2.i;
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public PersistenceRecord l() {
        return this.G;
    }

    public void q(PersistenceRecord persistenceRecord) {
        this.G = persistenceRecord;
    }

    @Override
    public void z(MultiOperationProcessor multiOperationProcessor) throws CompilationDiagnosticException {
        multiOperationProcessor.S(this);
    }

    public eF(PersistenceRecord persistenceRecord) {
        this.G = persistenceRecord;
        this.i = null;
    }

    public static eF q(PersistenceRecord persistenceRecord, PersistenceRecord persistenceRecord2, PersistenceRecord persistenceRecord3) {
        return new eF(persistenceRecord, new eF(persistenceRecord2, new eF(persistenceRecord3)));
    }

    public static eF c(eF eF2, PersistenceRecord persistenceRecord) {
        return eF.W(eF2, new eF(persistenceRecord));
    }

    public int U() {
        return eF.C(this);
    }

    @Override
    public PersistenceRecord Z() {
        return this.G;
    }

    public eF(PersistenceRecord persistenceRecord, eF eF2) {
        this.G = persistenceRecord;
        this.i = eF2;
    }

    public static eF W(eF eF2, eF eF3) {
        try {
            if (eF2 == null) {
                return eF3;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw eF.b(customSystemException);
        }
        eF eF4 = eF2;
        while (eF4.i != null) {
            eF4 = eF4.i;
        }
        eF4.i = eF3;
        return eF2;
    }

    public static int C(eF eF2) {
        try {
            if (eF2 == null) {
                return 0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw eF.b(customSystemException);
        }
        int n = 0;
        while (eF2 != null) {
            eF2 = eF2.i;
            ++n;
        }
        return n;
    }

    @Override
    public PersistenceRecord u() {
        return this.i;
    }

    static {
        if (eF.I() != null) {
            eF.G(new String[2]);
        }
    }

    public static void G(String[] stringArray) {
        K = stringArray;
    }
}

