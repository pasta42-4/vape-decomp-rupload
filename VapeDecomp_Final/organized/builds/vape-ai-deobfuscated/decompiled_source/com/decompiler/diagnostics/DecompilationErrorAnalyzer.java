/*
 * Decompiled with CFR 0.152.
 */
package com.decompiler.diagnostics;

import a.eF;
import com.app.database.operations.DatabaseStatementHandler;
import com.app.security.crypto.CryptographicPrimitiveManager;
import com.compiler.parsing.SyntaxTokenizer;
import com.data.persistence.PersistenceManagerAdapter;
import com.data.persistence.PersistenceRecord;
import com.data.serialization.PersistenceDescriptor;
import com.data.serialization.SerializationContext;
import com.data.structures.GenericPairContainer;
import com.event.orchestration.DeclarativeEventOrchestrator;
import com.exception.system.CustomSystemException;
import com.logging.audit.AuditTrailLogger;
import com.network.messaging.TransmissionPayload;
import com.operations.bitwise.BitwiseOperationInterface;
import com.reflection.analysis.TypeInspectionUtility1890;
import com.security.tokens.SerializableIdentityToken;
import com.security.transform.SecureDataTransformer1124;
import com.serialization.core.SerializationUtility2478;
import com.serialization.persistence.PersistentSerializationDescriptor;
import com.serialization.security.SerializationSecurityManager;
import com.system.compilation.CompilationDiagnosticException;
import com.system.config.PersistentConfigurationMap;
import com.system.validation.SafetyComplianceValidator;
import com.util.serialization.SerializationUtility;
import java.io.Serializable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class DecompilationErrorAnalyzer
implements BitwiseOperationInterface {
    private SyntaxTokenizer j;
    private static final int[] r = new int[]{0, 0, 0, 0, 1, 6, 0, 0, 0, 1, 2, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 4, 0};

    private DeclarativeEventOrchestrator x(PersistentConfigurationMap persistentConfigurationMap, DeclarativeEventOrchestrator declarativeEventOrchestrator) throws CompilationDiagnosticException {
        block5: {
            try {
                try {
                    if (this.j.Q() == 400 && declarativeEventOrchestrator.S() != 344) break block5;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
                }
                throw new SerializationUtility2478(this.j);
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
            }
        }
        String string = this.j.i();
        TransmissionPayload transmissionPayload = new TransmissionPayload(string);
        int n = this.D();
        PersistenceRecord persistenceRecord = null;
        if (this.j.w() == 61) {
            this.j.Q();
            persistenceRecord = this.r(persistentConfigurationMap);
        }
        DeclarativeEventOrchestrator declarativeEventOrchestrator2 = declarativeEventOrchestrator.H(transmissionPayload, n, persistenceRecord);
        persistentConfigurationMap.s(string, declarativeEventOrchestrator2);
        return declarativeEventOrchestrator2;
    }

    private DatabaseStatementHandler G(PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        DatabaseStatementHandler databaseStatementHandler;
        int n = this.j.Q();
        PersistentConfigurationMap persistentConfigurationMap2 = new PersistentConfigurationMap(persistentConfigurationMap);
        try {
            if (this.j.Q() != 40) {
                throw new SerializationUtility2478(this.j);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        if (this.j.w() == 59) {
            this.j.Q();
            databaseStatementHandler = null;
        } else {
            databaseStatementHandler = this.S(persistentConfigurationMap2, true);
        }
        PersistenceRecord persistenceRecord = this.j.w() == 59 ? null : this.I(persistentConfigurationMap2);
        try {
            if (this.j.Q() != 59) {
                throw new CompilationDiagnosticException("; is missing", this.j);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        DatabaseStatementHandler databaseStatementHandler2 = this.j.w() == 41 ? null : this.s(persistentConfigurationMap2);
        try {
            if (this.j.Q() != 41) {
                throw new CompilationDiagnosticException(") is missing", this.j);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        DatabaseStatementHandler databaseStatementHandler3 = this.t(persistentConfigurationMap2);
        return new DatabaseStatementHandler(n, databaseStatementHandler, new eF(persistenceRecord, new eF(databaseStatementHandler2, databaseStatementHandler3)));
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Exception decompiling
     */
    private PersistenceRecord R(PersistentConfigurationMap var1_1) throws CompilationDiagnosticException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 6[SWITCH]
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

    private DatabaseStatementHandler s(PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        DatabaseStatementHandler databaseStatementHandler = null;
        while (true) {
            DatabaseStatementHandler databaseStatementHandler2 = new DatabaseStatementHandler(69, this.I(persistentConfigurationMap));
            databaseStatementHandler = (DatabaseStatementHandler)eF.W(databaseStatementHandler, new DatabaseStatementHandler(66, (PersistenceRecord)databaseStatementHandler2));
            try {
                if (this.j.w() != 44) break;
                this.j.Q();
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
            }
        }
        return databaseStatementHandler;
    }

    private boolean u() {
        boolean bl;
        block36: {
            block35: {
                int n = this.n(1);
                try {
                    if (n < 0) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DecompilationErrorAnalyzer.a(customSystemException);
                }
                int n2 = this.j.m(n);
                try {
                    if (n2 != 41) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DecompilationErrorAnalyzer.a(customSystemException);
                }
                n2 = this.j.m(n + 1);
                try {
                    block34: {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (n2 == 40 || n2 == 412) break block34;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw DecompilationErrorAnalyzer.a(customSystemException);
                                                                        }
                                                                        if (n2 == 406) break block34;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw DecompilationErrorAnalyzer.a(customSystemException);
                                                                    }
                                                                    if (n2 == 400) break block34;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw DecompilationErrorAnalyzer.a(customSystemException);
                                                                }
                                                                if (n2 == 339) break block34;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw DecompilationErrorAnalyzer.a(customSystemException);
                                                            }
                                                            if (n2 == 336) break block34;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw DecompilationErrorAnalyzer.a(customSystemException);
                                                        }
                                                        if (n2 == 328) break block34;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw DecompilationErrorAnalyzer.a(customSystemException);
                                                    }
                                                    if (n2 == 410) break block34;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw DecompilationErrorAnalyzer.a(customSystemException);
                                                }
                                                if (n2 == 411) break block34;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw DecompilationErrorAnalyzer.a(customSystemException);
                                            }
                                            if (n2 == 403) break block34;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw DecompilationErrorAnalyzer.a(customSystemException);
                                        }
                                        if (n2 == 402) break block34;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw DecompilationErrorAnalyzer.a(customSystemException);
                                    }
                                    if (n2 == 401) break block34;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DecompilationErrorAnalyzer.a(customSystemException);
                                }
                                if (n2 == 405) break block34;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DecompilationErrorAnalyzer.a(customSystemException);
                            }
                            if (n2 != 404) break block35;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DecompilationErrorAnalyzer.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block36;
                }
                catch (CustomSystemException customSystemException) {
                    throw DecompilationErrorAnalyzer.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private SerializationUtility T(PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        try {
            this.j.Q();
            if (this.j.w() == 125) {
                this.j.Q();
                return new SerializationUtility(null);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        PersistenceRecord persistenceRecord = this.I(persistentConfigurationMap);
        SerializationUtility serializationUtility = new SerializationUtility(persistenceRecord);
        while (this.j.w() == 44) {
            this.j.Q();
            persistenceRecord = this.I(persistentConfigurationMap);
            eF.c(serializationUtility, persistenceRecord);
        }
        try {
            if (this.j.Q() != 125) {
                throw new SerializationUtility2478(this.j);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        return serializationUtility;
    }

    private DatabaseStatementHandler p(PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        int n = this.j.Q();
        PersistenceRecord persistenceRecord = this.E(persistentConfigurationMap);
        DatabaseStatementHandler databaseStatementHandler = this.t(persistentConfigurationMap);
        return new DatabaseStatementHandler(n, persistenceRecord, databaseStatementHandler);
    }

    private DatabaseStatementHandler S(PersistentConfigurationMap persistentConfigurationMap, boolean bl) throws CompilationDiagnosticException {
        block8: {
            int n = this.j.w();
            while (n == 315) {
                this.j.Q();
                n = this.j.w();
            }
            if (DecompilationErrorAnalyzer.B(n)) {
                n = this.j.Q();
                int n2 = this.D();
                return this.j(persistentConfigurationMap, new DeclarativeEventOrchestrator(n, n2));
            }
            if (n == 400) {
                int n3 = this.n(0);
                try {
                    if (n3 < 0 || this.j.m(n3) != 400) break block8;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
                }
                eF eF2 = this.q(persistentConfigurationMap);
                int n4 = this.D();
                return this.j(persistentConfigurationMap, new DeclarativeEventOrchestrator(eF2, n4));
            }
        }
        DatabaseStatementHandler databaseStatementHandler = bl ? this.s(persistentConfigurationMap) : new DatabaseStatementHandler(69, this.I(persistentConfigurationMap));
        try {
            if (this.j.Q() != 59) {
                throw new CompilationDiagnosticException("; is missing", this.j);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        return databaseStatementHandler;
    }

    public DatabaseStatementHandler t(PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        int n;
        block41: {
            n = this.j.w();
            try {
                if (n == 123) {
                    return this.E(persistentConfigurationMap);
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
            }
            try {
                if (n == 59) {
                    this.j.Q();
                    return new DatabaseStatementHandler(66);
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
            }
            try {
                if (n != 400 || this.j.m(1) != 58) break block41;
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
            }
            this.j.Q();
            String string = this.j.i();
            this.j.Q();
            return DatabaseStatementHandler.l(76, new TransmissionPayload(string), this.t(persistentConfigurationMap));
        }
        try {
            if (n == 320) {
                return this.P(persistentConfigurationMap);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        try {
            if (n == 346) {
                return this.p(persistentConfigurationMap);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        try {
            if (n == 311) {
                return this.Q(persistentConfigurationMap);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        try {
            if (n == 318) {
                return this.G(persistentConfigurationMap);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        try {
            if (n == 343) {
                return this.n(persistentConfigurationMap);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        try {
            if (n == 337) {
                return this.J(persistentConfigurationMap);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        try {
            if (n == 338) {
                return this.F(persistentConfigurationMap);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        try {
            if (n == 333) {
                return this.B(persistentConfigurationMap);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        try {
            if (n == 340) {
                return this.r(persistentConfigurationMap);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        try {
            if (n == 302) {
                return this.l(persistentConfigurationMap);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        try {
            if (n == 309) {
                return this.Y(persistentConfigurationMap);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        return this.S(persistentConfigurationMap, false);
    }

    private DatabaseStatementHandler g(PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        DatabaseStatementHandler databaseStatementHandler;
        PersistentConfigurationMap persistentConfigurationMap2;
        block13: {
            try {
                if (this.j.Q() != 123) {
                    throw new SerializationUtility2478(this.j);
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
            }
            persistentConfigurationMap2 = new PersistentConfigurationMap(persistentConfigurationMap);
            databaseStatementHandler = this.y(persistentConfigurationMap2);
            try {
                if (databaseStatementHandler == null) {
                    throw new CompilationDiagnosticException("empty switch block", this.j);
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
            }
            int n = databaseStatementHandler.x();
            try {
                try {
                    if (n == 304 || n == 310) break block13;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
                }
                throw new CompilationDiagnosticException("no case or default in a switch block", this.j);
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
            }
        }
        DatabaseStatementHandler databaseStatementHandler2 = new DatabaseStatementHandler(66, (PersistenceRecord)databaseStatementHandler);
        while (this.j.w() != 125) {
            DatabaseStatementHandler databaseStatementHandler3;
            block14: {
                databaseStatementHandler3 = this.y(persistentConfigurationMap2);
                if (databaseStatementHandler3 == null) continue;
                int n = databaseStatementHandler3.x();
                try {
                    if (n != 304 && n != 310) break block14;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
                }
                databaseStatementHandler2 = (DatabaseStatementHandler)eF.W(databaseStatementHandler2, new DatabaseStatementHandler(66, (PersistenceRecord)databaseStatementHandler3));
                databaseStatementHandler = databaseStatementHandler3;
                continue;
            }
            databaseStatementHandler = (DatabaseStatementHandler)eF.W(databaseStatementHandler, new DatabaseStatementHandler(66, (PersistenceRecord)databaseStatementHandler3));
        }
        this.j.Q();
        return databaseStatementHandler2;
    }

    private DatabaseStatementHandler Q(PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        PersistenceRecord persistenceRecord;
        DatabaseStatementHandler databaseStatementHandler;
        int n;
        block9: {
            block8: {
                n = this.j.Q();
                databaseStatementHandler = this.t(persistentConfigurationMap);
                try {
                    try {
                        if (this.j.Q() == 346 && this.j.Q() == 40) break block8;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
                    }
                    throw new SerializationUtility2478(this.j);
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
                }
            }
            persistenceRecord = this.I(persistentConfigurationMap);
            try {
                try {
                    if (this.j.Q() == 41 && this.j.Q() == 59) break block9;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
                }
                throw new SerializationUtility2478(this.j);
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
            }
        }
        return new DatabaseStatementHandler(n, persistenceRecord, databaseStatementHandler);
    }

    private PersistenceRecord V(PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        PersistenceRecord persistenceRecord = this.S(persistentConfigurationMap);
        if (this.j.w() == 63) {
            this.j.Q();
            PersistenceRecord persistenceRecord2 = this.I(persistentConfigurationMap);
            try {
                if (this.j.Q() != 58) {
                    throw new CompilationDiagnosticException(": is missing", this.j);
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
            }
            PersistenceRecord persistenceRecord3 = this.I(persistentConfigurationMap);
            return new PersistenceManagerAdapter(persistenceRecord, persistenceRecord2, persistenceRecord3);
        }
        return persistenceRecord;
    }

    public DecompilationErrorAnalyzer(SyntaxTokenizer syntaxTokenizer) {
        this.j = syntaxTokenizer;
    }

    private DatabaseStatementHandler l(PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        return this.Y(persistentConfigurationMap);
    }

    private PersistenceRecord K(PersistentConfigurationMap persistentConfigurationMap, PersistenceRecord persistenceRecord) throws CompilationDiagnosticException {
        block12: {
            block13: {
                if (persistenceRecord instanceof SerializableIdentityToken) {
                    int n = ((SerializableIdentityToken)persistenceRecord).X();
                    try {
                        try {
                            if (n == 339 || n == 336) break block12;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
                        }
                        throw new SerializationUtility2478(this.j);
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
                    }
                }
                try {
                    if (!(persistenceRecord instanceof TransmissionPayload)) break block13;
                    break block12;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
                }
            }
            if (persistenceRecord instanceof CryptographicPrimitiveManager) {
                int n = ((CryptographicPrimitiveManager)persistenceRecord).I();
                try {
                    try {
                        if (n == 46 || n == 35) break block12;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
                    }
                    throw new SerializationUtility2478(this.j);
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
                }
            }
        }
        return AuditTrailLogger.e(persistenceRecord, this.g(persistentConfigurationMap));
    }

    /*
     * Exception decompiling
     */
    private DatabaseStatementHandler j(PersistentConfigurationMap var1_1, DeclarativeEventOrchestrator var2_2) throws CompilationDiagnosticException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[DOLOOP]], but top level block is 1[TRYBLOCK]
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

    private PersistenceRecord L(PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        block11: {
            int n;
            block10: {
                n = this.j.m(1);
                try {
                    if (!DecompilationErrorAnalyzer.B(n) || !this.r()) break block10;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
                }
                this.j.Q();
                this.j.Q();
                int n2 = this.D();
                try {
                    if (this.j.Q() != 41) {
                        throw new CompilationDiagnosticException(") is missing", this.j);
                    }
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
                }
                return new SecureDataTransformer1124(n, n2, this.j(persistentConfigurationMap));
            }
            try {
                if (n != 400 || !this.u()) break block11;
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
            }
            this.j.Q();
            eF eF2 = this.q(persistentConfigurationMap);
            int n3 = this.D();
            try {
                if (this.j.Q() != 41) {
                    throw new CompilationDiagnosticException(") is missing", this.j);
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
            }
            return new SecureDataTransformer1124(eF2, n3, this.j(persistentConfigurationMap));
        }
        return this.t(persistentConfigurationMap);
    }

    private DatabaseStatementHandler F(PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        int n = this.j.Q();
        try {
            if (this.j.Q() != 40) {
                throw new SerializationUtility2478(this.j);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        PersistenceRecord persistenceRecord = this.I(persistentConfigurationMap);
        try {
            if (this.j.Q() != 41) {
                throw new SerializationUtility2478(this.j);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        PersistenceRecord persistenceRecord2 = this.E(persistentConfigurationMap);
        return new DatabaseStatementHandler(n, persistenceRecord, (eF)persistenceRecord2);
    }

    private static boolean Q(int n) {
        boolean bl;
        block26: {
            block25: {
                try {
                    block24: {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (n == 61 || n == 351) break block24;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw DecompilationErrorAnalyzer.a(customSystemException);
                                                                }
                                                                if (n == 352) break block24;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw DecompilationErrorAnalyzer.a(customSystemException);
                                                            }
                                                            if (n == 353) break block24;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw DecompilationErrorAnalyzer.a(customSystemException);
                                                        }
                                                        if (n == 354) break block24;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw DecompilationErrorAnalyzer.a(customSystemException);
                                                    }
                                                    if (n == 355) break block24;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw DecompilationErrorAnalyzer.a(customSystemException);
                                                }
                                                if (n == 356) break block24;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw DecompilationErrorAnalyzer.a(customSystemException);
                                            }
                                            if (n == 360) break block24;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw DecompilationErrorAnalyzer.a(customSystemException);
                                        }
                                        if (n == 361) break block24;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw DecompilationErrorAnalyzer.a(customSystemException);
                                    }
                                    if (n == 365) break block24;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DecompilationErrorAnalyzer.a(customSystemException);
                                }
                                if (n == 367) break block24;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DecompilationErrorAnalyzer.a(customSystemException);
                            }
                            if (n != 371) break block25;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DecompilationErrorAnalyzer.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block26;
                }
                catch (CustomSystemException customSystemException) {
                    throw DecompilationErrorAnalyzer.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static boolean B(int n) {
        boolean bl;
        block18: {
            block17: {
                try {
                    block16: {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (n == 301 || n == 303) break block16;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw DecompilationErrorAnalyzer.a(customSystemException);
                                                }
                                                if (n == 306) break block16;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw DecompilationErrorAnalyzer.a(customSystemException);
                                            }
                                            if (n == 334) break block16;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw DecompilationErrorAnalyzer.a(customSystemException);
                                        }
                                        if (n == 324) break block16;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw DecompilationErrorAnalyzer.a(customSystemException);
                                    }
                                    if (n == 326) break block16;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DecompilationErrorAnalyzer.a(customSystemException);
                                }
                                if (n == 317) break block16;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DecompilationErrorAnalyzer.a(customSystemException);
                            }
                            if (n != 312) break block17;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DecompilationErrorAnalyzer.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block18;
                }
                catch (CustomSystemException customSystemException) {
                    throw DecompilationErrorAnalyzer.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private SerializationSecurityManager L(PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        SerializationUtility serializationUtility = null;
        int n = this.j.w();
        if (DecompilationErrorAnalyzer.B(n)) {
            this.j.Q();
            eF eF2 = this.I(persistentConfigurationMap);
            if (this.j.w() == 123) {
                serializationUtility = this.T(persistentConfigurationMap);
            }
            return new SerializationSecurityManager(n, eF2, serializationUtility);
        }
        if (n == 400) {
            eF eF3 = this.q(persistentConfigurationMap);
            n = this.j.w();
            if (n == 40) {
                eF eF4 = this.g(persistentConfigurationMap);
                return new SerializationSecurityManager(eF3, eF4);
            }
            if (n == 91) {
                eF eF5 = this.I(persistentConfigurationMap);
                if (this.j.w() == 123) {
                    serializationUtility = this.T(persistentConfigurationMap);
                }
                return SerializationSecurityManager.l(eF3, eF5, serializationUtility);
            }
        }
        throw new SerializationUtility2478(this.j);
    }

    private int n(int n) {
        int n2;
        while (this.j.m(++n) == 46) {
            if (this.j.m(++n) == 400) continue;
            return -1;
        }
        while ((n2 = this.j.m(n++)) == 91) {
            if (this.j.m(n++) == 93) continue;
            return -1;
        }
        return n - 1;
    }

    public boolean e() {
        boolean bl;
        try {
            bl = this.j.w() >= 0;
        }
        catch (CustomSystemException customSystemException) {
            throw DecompilationErrorAnalyzer.a(customSystemException);
        }
        return bl;
    }

    private eF I(PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        eF eF2 = null;
        while (this.j.w() == 91) {
            eF2 = eF.c(eF2, this.O(persistentConfigurationMap));
        }
        return eF2;
    }

    private DatabaseStatementHandler Y(PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        int n = this.j.Q();
        DatabaseStatementHandler databaseStatementHandler = new DatabaseStatementHandler(n);
        int n2 = this.j.Q();
        if (n2 == 400) {
            databaseStatementHandler.M(new TransmissionPayload(this.j.i()));
            n2 = this.j.Q();
        }
        try {
            if (n2 != 59) {
                throw new CompilationDiagnosticException("; is missing", this.j);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        return databaseStatementHandler;
    }

    private DatabaseStatementHandler n(PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        Serializable serializable;
        this.j.Q();
        PersistenceRecord persistenceRecord = this.E(persistentConfigurationMap);
        eF eF2 = null;
        while (true) {
            DeclarativeEventOrchestrator declarativeEventOrchestrator;
            block14: {
                block13: {
                    try {
                        try {
                            if (this.j.w() != 305) break;
                            this.j.Q();
                            if (this.j.Q() == 40) break block13;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
                        }
                        throw new SerializationUtility2478(this.j);
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
                    }
                }
                serializable = new PersistentConfigurationMap(persistentConfigurationMap);
                declarativeEventOrchestrator = this.U((PersistentConfigurationMap)serializable);
                try {
                    try {
                        if (declarativeEventOrchestrator.N() <= 0 && declarativeEventOrchestrator.S() == 307) break block14;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
                    }
                    throw new SerializationUtility2478(this.j);
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
                }
            }
            try {
                if (this.j.Q() != 41) {
                    throw new SerializationUtility2478(this.j);
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
            }
            PersistenceRecord persistenceRecord2 = this.E((PersistentConfigurationMap)serializable);
            eF2 = eF.c(eF2, new GenericPairContainer(declarativeEventOrchestrator, persistenceRecord2));
        }
        serializable = null;
        if (this.j.w() == 316) {
            this.j.Q();
            serializable = this.E(persistentConfigurationMap);
        }
        return DatabaseStatementHandler.q(343, persistenceRecord, eF2, serializable);
    }

    private DeclarativeEventOrchestrator a(PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        block2: {
            int n = this.j.w();
            try {
                if (!DecompilationErrorAnalyzer.B(n) && n != 344) break block2;
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
            }
            this.j.Q();
            int n2 = this.D();
            return new DeclarativeEventOrchestrator(n, n2);
        }
        eF eF2 = this.q(persistentConfigurationMap);
        int n = this.D();
        return new DeclarativeEventOrchestrator(eF2, n);
    }

    private String K(PersistenceRecord persistenceRecord) throws CompilationDiagnosticException {
        StringBuilder stringBuilder = new StringBuilder();
        this.R(persistenceRecord, stringBuilder);
        return stringBuilder.toString();
    }

    private eF q(PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        eF eF2 = null;
        while (true) {
            try {
                if (this.j.Q() != 400) {
                    throw new SerializationUtility2478(this.j);
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
            }
            eF2 = eF.c(eF2, new TransmissionPayload(this.j.i()));
            try {
                if (this.j.w() != 46) break;
                this.j.Q();
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
            }
        }
        return eF2;
    }

    private DatabaseStatementHandler r(PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        int n = this.j.Q();
        PersistenceRecord persistenceRecord = this.I(persistentConfigurationMap);
        try {
            if (this.j.Q() != 59) {
                throw new CompilationDiagnosticException("; is missing", this.j);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        return new DatabaseStatementHandler(n, persistenceRecord);
    }

    private PersistenceRecord A(PersistentConfigurationMap persistentConfigurationMap, PersistenceRecord persistenceRecord, int n) throws CompilationDiagnosticException {
        int n2 = this.j.Q();
        try {
            if (n2 == 323) {
                return this.d(persistentConfigurationMap, persistenceRecord);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        PersistenceRecord persistenceRecord2 = this.j(persistentConfigurationMap);
        while (true) {
            int n3 = this.j.w();
            int n4 = this.e(n3);
            try {
                if (n4 == 0 || n <= n4) break;
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
            }
            persistenceRecord2 = this.A(persistentConfigurationMap, persistenceRecord2, n4);
        }
        return PersistenceDescriptor.y(n2, persistenceRecord, persistenceRecord2);
    }

    private void R(PersistenceRecord persistenceRecord, StringBuilder stringBuilder) throws CompilationDiagnosticException {
        try {
            if (persistenceRecord instanceof TransmissionPayload) {
                stringBuilder.append(((TransmissionPayload)persistenceRecord).e());
                return;
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        if (persistenceRecord instanceof CryptographicPrimitiveManager) {
            CryptographicPrimitiveManager cryptographicPrimitiveManager = (CryptographicPrimitiveManager)persistenceRecord;
            try {
                if (cryptographicPrimitiveManager.I() == 46) {
                    this.R(cryptographicPrimitiveManager.R(), stringBuilder);
                    stringBuilder.append('.');
                    this.R(cryptographicPrimitiveManager.V(), stringBuilder);
                    return;
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
            }
        }
        throw new CompilationDiagnosticException("bad static member access", this.j);
    }

    /*
     * Exception decompiling
     */
    private PersistenceRecord t(PersistentConfigurationMap var1_1) throws CompilationDiagnosticException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 5[SWITCH]
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

    private PersistenceRecord d(PersistentConfigurationMap persistentConfigurationMap, PersistenceRecord persistenceRecord) throws CompilationDiagnosticException {
        int n = this.j.w();
        if (DecompilationErrorAnalyzer.B(n)) {
            this.j.Q();
            int n2 = this.D();
            return new TypeInspectionUtility1890(n, n2, persistenceRecord);
        }
        eF eF2 = this.q(persistentConfigurationMap);
        int n3 = this.D();
        return new TypeInspectionUtility1890(eF2, n3, persistenceRecord);
    }

    private eF g(PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        try {
            if (this.j.Q() != 40) {
                throw new CompilationDiagnosticException("( is missing", this.j);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        eF eF2 = null;
        if (this.j.w() != 41) {
            while (true) {
                eF2 = eF.c(eF2, this.I(persistentConfigurationMap));
                try {
                    if (this.j.w() != 44) break;
                    this.j.Q();
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
                }
            }
        }
        try {
            if (this.j.Q() != 41) {
                throw new CompilationDiagnosticException(") is missing", this.j);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        return eF2;
    }

    private int D() throws CompilationDiagnosticException {
        int n = 0;
        while (this.j.w() == 91) {
            ++n;
            this.j.Q();
            if (this.j.Q() == 93) continue;
            throw new CompilationDiagnosticException("] is missing", this.j);
        }
        return n;
    }

    private PersistenceRecord r(PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        try {
            if (this.j.w() == 123) {
                return this.T(persistentConfigurationMap);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        return this.I(persistentConfigurationMap);
    }

    private PersistenceRecord O(PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        try {
            this.j.Q();
            if (this.j.w() == 93) {
                this.j.Q();
                return null;
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        PersistenceRecord persistenceRecord = this.I(persistentConfigurationMap);
        try {
            if (this.j.Q() != 93) {
                throw new CompilationDiagnosticException("] is missing", this.j);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        return persistenceRecord;
    }

    private PersistenceRecord S(PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        PersistenceRecord persistenceRecord = this.j(persistentConfigurationMap);
        while (true) {
            int n = this.j.w();
            int n2 = this.e(n);
            try {
                if (n2 == 0) {
                    return persistenceRecord;
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
            }
            persistenceRecord = this.A(persistentConfigurationMap, persistenceRecord, n2);
        }
    }

    private PersistenceRecord E(PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        try {
            if (this.j.Q() != 40) {
                throw new SerializationUtility2478(this.j);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        PersistenceRecord persistenceRecord = this.I(persistentConfigurationMap);
        try {
            if (this.j.Q() != 41) {
                throw new SerializationUtility2478(this.j);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        return persistenceRecord;
    }

    private DeclarativeEventOrchestrator U(PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        DeclarativeEventOrchestrator declarativeEventOrchestrator = this.a(persistentConfigurationMap);
        try {
            if (this.j.Q() != 400) {
                throw new SerializationUtility2478(this.j);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        String string = this.j.i();
        declarativeEventOrchestrator.L(new TransmissionPayload(string));
        declarativeEventOrchestrator.L(this.D());
        persistentConfigurationMap.s(string, declarativeEventOrchestrator);
        return declarativeEventOrchestrator;
    }

    private PersistenceRecord y(PersistenceRecord persistenceRecord, int n) throws CompilationDiagnosticException {
        String string = this.K(persistenceRecord);
        if (n > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            try {
                while (n-- > 0) {
                    stringBuilder.append('[');
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
            }
            stringBuilder.append('L').append(string.replace('.', '/')).append(';');
            string = stringBuilder.toString();
        }
        return CryptographicPrimitiveManager.n(46, new TransmissionPayload(string), new SerializationContext("class"));
    }

    /*
     * Exception decompiling
     */
    private PersistenceRecord j(PersistentConfigurationMap var1_1) throws CompilationDiagnosticException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 5[SWITCH]
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

    public PersistenceRecord I(PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        PersistenceRecord persistenceRecord = this.V(persistentConfigurationMap);
        try {
            if (!DecompilationErrorAnalyzer.Q(this.j.w())) {
                return persistenceRecord;
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        int n = this.j.Q();
        PersistenceRecord persistenceRecord2 = this.I(persistentConfigurationMap);
        return PersistentSerializationDescriptor.O(n, persistenceRecord, persistenceRecord2);
    }

    private DatabaseStatementHandler J(PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        int n = this.j.Q();
        PersistenceRecord persistenceRecord = this.E(persistentConfigurationMap);
        DatabaseStatementHandler databaseStatementHandler = this.g(persistentConfigurationMap);
        return new DatabaseStatementHandler(n, persistenceRecord, databaseStatementHandler);
    }

    private DatabaseStatementHandler P(PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        DatabaseStatementHandler databaseStatementHandler;
        int n = this.j.Q();
        PersistenceRecord persistenceRecord = this.E(persistentConfigurationMap);
        DatabaseStatementHandler databaseStatementHandler2 = this.t(persistentConfigurationMap);
        if (this.j.w() == 313) {
            this.j.Q();
            databaseStatementHandler = this.t(persistentConfigurationMap);
        } else {
            databaseStatementHandler = null;
        }
        return new DatabaseStatementHandler(n, persistenceRecord, new eF(databaseStatementHandler2, new eF(databaseStatementHandler)));
    }

    private int e(int n) {
        block37: {
            block35: {
                block33: {
                    block32: {
                        try {
                            try {
                                if (33 > n || n > 63) break block32;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DecompilationErrorAnalyzer.a(customSystemException);
                            }
                            return r[n - 33];
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DecompilationErrorAnalyzer.a(customSystemException);
                        }
                    }
                    try {
                        if (n == 94) {
                            return 7;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DecompilationErrorAnalyzer.a(customSystemException);
                    }
                    try {
                        if (n == 124) {
                            return 8;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DecompilationErrorAnalyzer.a(customSystemException);
                    }
                    try {
                        if (n == 369) {
                            return 9;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DecompilationErrorAnalyzer.a(customSystemException);
                    }
                    try {
                        if (n == 368) {
                            return 10;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DecompilationErrorAnalyzer.a(customSystemException);
                    }
                    try {
                        try {
                            if (n != 358 && n != 350) break block33;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DecompilationErrorAnalyzer.a(customSystemException);
                        }
                        return 5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DecompilationErrorAnalyzer.a(customSystemException);
                    }
                }
                try {
                    block34: {
                        try {
                            try {
                                if (n == 357 || n == 359) break block34;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DecompilationErrorAnalyzer.a(customSystemException);
                            }
                            if (n != 323) break block35;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DecompilationErrorAnalyzer.a(customSystemException);
                        }
                    }
                    return 4;
                }
                catch (CustomSystemException customSystemException) {
                    throw DecompilationErrorAnalyzer.a(customSystemException);
                }
            }
            try {
                block36: {
                    try {
                        try {
                            if (n == 364 || n == 366) break block36;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DecompilationErrorAnalyzer.a(customSystemException);
                        }
                        if (n != 370) break block37;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DecompilationErrorAnalyzer.a(customSystemException);
                    }
                }
                return 3;
            }
            catch (CustomSystemException customSystemException) {
                throw DecompilationErrorAnalyzer.a(customSystemException);
            }
        }
        return 0;
    }

    private boolean r() {
        boolean bl;
        int n;
        int n2 = 2;
        while ((n = this.j.m(n2++)) == 91) {
            if (this.j.m(n2++) == 93) continue;
            return false;
        }
        try {
            bl = this.j.m(n2 - 1) == 41;
        }
        catch (CustomSystemException customSystemException) {
            throw DecompilationErrorAnalyzer.a(customSystemException);
        }
        return bl;
    }

    private DatabaseStatementHandler B(PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        int n = this.j.Q();
        DatabaseStatementHandler databaseStatementHandler = new DatabaseStatementHandler(n);
        try {
            if (this.j.w() != 59) {
                databaseStatementHandler.M(this.I(persistentConfigurationMap));
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        try {
            if (this.j.Q() != 59) {
                throw new CompilationDiagnosticException("; is missing", this.j);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        return databaseStatementHandler;
    }

    private PersistenceRecord R(int n, int n2) throws CompilationDiagnosticException {
        String string;
        if (n2 > 0) {
            String string2 = SafetyComplianceValidator.G(n, n2);
            return CryptographicPrimitiveManager.n(46, new TransmissionPayload(string2), new SerializationContext("class"));
        }
        switch (n) {
            case 301: {
                string = "java.lang.Boolean";
                break;
            }
            case 303: {
                string = "java.lang.Byte";
                break;
            }
            case 306: {
                string = "java.lang.Character";
                break;
            }
            case 334: {
                string = "java.lang.Short";
                break;
            }
            case 324: {
                string = "java.lang.Integer";
                break;
            }
            case 326: {
                string = "java.lang.Long";
                break;
            }
            case 317: {
                string = "java.lang.Float";
                break;
            }
            case 312: {
                string = "java.lang.Double";
                break;
            }
            case 344: {
                string = "java.lang.Void";
                break;
            }
            default: {
                throw new CompilationDiagnosticException("invalid builtin type: " + n);
            }
        }
        return CryptographicPrimitiveManager.n(35, new TransmissionPayload(string), new SerializationContext("TYPE"));
    }

    private DatabaseStatementHandler y(PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        int n;
        block7: {
            n = this.j.w();
            try {
                try {
                    if (n == 304 || n == 310) break block7;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
                }
                return this.t(persistentConfigurationMap);
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
            }
        }
        this.j.Q();
        DatabaseStatementHandler databaseStatementHandler = n == 304 ? new DatabaseStatementHandler(n, this.I(persistentConfigurationMap)) : new DatabaseStatementHandler(310);
        try {
            if (this.j.Q() != 58) {
                throw new CompilationDiagnosticException(": is missing", this.j);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        return databaseStatementHandler;
    }

    private DatabaseStatementHandler E(PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        try {
            if (this.j.Q() != 123) {
                throw new SerializationUtility2478(this.j);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        DatabaseStatementHandler databaseStatementHandler = null;
        PersistentConfigurationMap persistentConfigurationMap2 = new PersistentConfigurationMap(persistentConfigurationMap);
        while (this.j.w() != 125) {
            DatabaseStatementHandler databaseStatementHandler2 = this.t(persistentConfigurationMap2);
            if (databaseStatementHandler2 == null) continue;
            databaseStatementHandler = (DatabaseStatementHandler)eF.W(databaseStatementHandler, new DatabaseStatementHandler(66, (PersistenceRecord)databaseStatementHandler2));
        }
        try {
            this.j.Q();
            if (databaseStatementHandler == null) {
                return new DatabaseStatementHandler(66);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw DecompilationErrorAnalyzer.a(compilationDiagnosticException);
        }
        return databaseStatementHandler;
    }
}

