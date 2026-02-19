/*
 * Decompiled with CFR 0.152.
 */
package com.system.validation;

import a.eF;
import com.app.database.operations.DatabaseStatementHandler;
import com.app.security.crypto.CryptographicPrimitiveManager;
import com.collections.management.MultiContainerRegistry;
import com.communication.remote.RemoteConnectionDescriptor;
import com.data.persistence.PersistenceManagerAdapter;
import com.data.persistence.PersistenceRecord;
import com.data.processing.MultiOperationProcessor;
import com.data.serialization.PersistenceDescriptor;
import com.data.serialization.SerializationContext;
import com.data.structures.GenericPairContainer;
import com.data.versioning.VersionedDataContainer;
import com.entity.lifecycle.ComplexEntityLifecycleManager;
import com.event.orchestration.DeclarativeEventOrchestrator;
import com.exception.system.CustomSystemException;
import com.logging.audit.AuditTrailLogger;
import com.logging.core.SerializableLogEntry;
import com.metadata.extraction.MetadataExtractionEngine;
import com.network.mapping.NetworkInterfaceMapper;
import com.network.messaging.TransmissionPayload;
import com.numeric.processing.NumericTransformationUtility;
import com.operations.bitwise.BitwiseOperationInterface;
import com.reflection.analysis.TypeInspectionUtility1890;
import com.reflection.utils.TypeInspectionUtility;
import com.security.tokens.SerializableIdentityToken;
import com.security.transform.SecureDataTransformer1124;
import com.serialization.persistence.PersistentSerializationDescriptor;
import com.serialization.security.SerializationSecurityManager;
import com.system.compilation.CompilationDiagnosticException;
import com.system.resource.ResourceAllocationHandler2388;
import com.transaction.management.TransactionStrategyResolver;
import com.util.serialization.SerializationUtility;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class SafetyComplianceValidator
extends MultiOperationProcessor
implements TransactionStrategyResolver,
BitwiseOperationInterface {
    private static final long[] h;
    private static final int[] V;
    protected boolean m;
    protected NetworkInterfaceMapper Y;
    protected int P;
    private static final Map l;
    protected int C;
    MetadataExtractionEngine X;
    private static final long d;
    private static final int[] b;
    protected String o;
    static final int[] n;
    private static final int[] B;
    private int F;
    protected List<Integer> z;
    public boolean N;
    protected List<Integer> w;
    protected ComplexEntityLifecycleManager t;
    private static final Integer[] k;

    private int p(PersistenceRecord persistenceRecord) throws CompilationDiagnosticException {
        this.D(persistenceRecord);
        persistenceRecord = MetadataExtractionEngine.h(persistenceRecord);
        try {
            if (persistenceRecord instanceof VersionedDataContainer) {
                return (int)((VersionedDataContainer)persistenceRecord).B();
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw SafetyComplianceValidator.b(compilationDiagnosticException);
        }
        throw new CompilationDiagnosticException("bad case label");
    }

    protected void f(PersistenceRecord persistenceRecord, PersistenceRecord persistenceRecord2) throws CompilationDiagnosticException {
        String string;
        int n;
        int n2;
        block7: {
            persistenceRecord.z(this);
            n2 = this.P;
            n = this.C;
            try {
                if (n == 0) {
                    throw new CompilationDiagnosticException("bad array access");
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw SafetyComplianceValidator.b(compilationDiagnosticException);
            }
            string = this.o;
            try {
                try {
                    persistenceRecord2.z(this);
                    if (SafetyComplianceValidator.r(this.P) == 3 && this.C <= 0) break block7;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                }
                throw new CompilationDiagnosticException("bad array index");
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw SafetyComplianceValidator.b(compilationDiagnosticException);
            }
        }
        this.P = n2;
        this.C = n - 1;
        this.o = string;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = SafetyComplianceValidator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    protected abstract void e(int var1, boolean var2, PersistenceRecord var3, CryptographicPrimitiveManager var4, boolean var5) throws CompilationDiagnosticException;

    private void a(DatabaseStatementHandler databaseStatementHandler, boolean bl) throws CompilationDiagnosticException {
        List<Integer> list = this.z;
        List<Integer> list2 = this.w;
        this.z = new ArrayList<Integer>();
        this.w = new ArrayList<Integer>();
        PersistenceRecord persistenceRecord = databaseStatementHandler.l();
        DatabaseStatementHandler databaseStatementHandler2 = (DatabaseStatementHandler)databaseStatementHandler.n();
        int n = 0;
        if (bl) {
            this.t.E(167);
            n = this.t.H();
            this.t.m(0);
        }
        int n2 = this.t.H();
        try {
            if (databaseStatementHandler2 != null) {
                databaseStatementHandler2.z(this);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw SafetyComplianceValidator.b(compilationDiagnosticException);
        }
        int n3 = this.t.H();
        try {
            if (bl) {
                this.t.Q(n, n3 - n + 1);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw SafetyComplianceValidator.b(compilationDiagnosticException);
        }
        boolean bl2 = this.Y(true, persistenceRecord);
        if (bl2) {
            this.t.E(167);
            bl2 = this.z.isEmpty();
        }
        this.t.m(n2 - this.t.H() + 1);
        this.R(this.z, this.t.H());
        this.R(this.w, n3);
        this.w = list2;
        this.z = list;
        this.m = bl2;
    }

    protected abstract String O();

    protected abstract String A() throws CompilationDiagnosticException;

    protected void D(PersistentSerializationDescriptor persistentSerializationDescriptor, boolean bl) throws CompilationDiagnosticException {
        block7: {
            PersistenceRecord persistenceRecord;
            PersistenceRecord persistenceRecord2;
            int n;
            block6: {
                n = persistentSerializationDescriptor.I();
                persistenceRecord2 = persistentSerializationDescriptor.R();
                persistenceRecord = persistentSerializationDescriptor.V();
                try {
                    if (!(persistenceRecord2 instanceof RemoteConnectionDescriptor)) break block6;
                    this.l(persistentSerializationDescriptor, n, (RemoteConnectionDescriptor)persistenceRecord2, ((RemoteConnectionDescriptor)persistenceRecord2).K(), persistenceRecord, bl);
                    break block7;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                }
            }
            if (persistenceRecord2 instanceof CryptographicPrimitiveManager) {
                CryptographicPrimitiveManager cryptographicPrimitiveManager = (CryptographicPrimitiveManager)persistenceRecord2;
                try {
                    if (cryptographicPrimitiveManager.I() == 65) {
                        this.t(persistentSerializationDescriptor, n, (CryptographicPrimitiveManager)persistenceRecord2, persistenceRecord, bl);
                        return;
                    }
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                }
            }
            this.J(persistentSerializationDescriptor, n, persistenceRecord2, persistenceRecord, bl);
        }
    }

    private void R(DatabaseStatementHandler databaseStatementHandler) throws CompilationDiagnosticException {
        int n;
        int n2;
        ArrayList<Integer> arrayList;
        int n3;
        int n4;
        List<Integer> list;
        block37: {
            boolean bl;
            block31: {
                boolean bl2;
                block33: {
                    block32: {
                        bl = false;
                        try {
                            try {
                                try {
                                    try {
                                        if (this.X == null) break block31;
                                        this.D(databaseStatementHandler.l());
                                        if (this.X.j != 307) break block32;
                                    }
                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                    }
                                    if (this.X.P != 0) break block32;
                                }
                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                }
                                if (!"java/lang/String".equals(this.X.w)) break block32;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                            }
                            bl2 = true;
                            break block33;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                        }
                    }
                    bl2 = false;
                }
                bl = bl2;
            }
            this.p(databaseStatementHandler.l());
            int n5 = -1;
            if (bl) {
                n5 = this.H();
                this.l(1);
                this.t.S(n5);
                this.t.B(n5);
                this.t.J("java/lang/String", "hashCode", "()I");
            }
            list = this.z;
            this.z = new ArrayList<Integer>();
            n4 = this.t.H();
            this.t.E(171);
            int n6 = 3 - (n4 & 3);
            try {
                while (n6-- > 0) {
                    this.t.w(0);
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw SafetyComplianceValidator.b(compilationDiagnosticException);
            }
            DatabaseStatementHandler databaseStatementHandler2 = (DatabaseStatementHandler)databaseStatementHandler.n();
            int n7 = 0;
            eF eF2 = databaseStatementHandler2;
            while (true) {
                block34: {
                    try {
                        try {
                            if (eF2 == null) break;
                            if (((DatabaseStatementHandler)eF2.l()).x() != 304) break block34;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                        }
                        ++n7;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                    }
                }
                eF2 = eF2.n();
            }
            n3 = this.t.H();
            this.t.I(4);
            this.t.h(n7);
            this.t.I(n7 * 8);
            long[] lArray = new long[n7];
            arrayList = new ArrayList<Integer>();
            int n8 = 0;
            n2 = -1;
            for (eF eF3 = databaseStatementHandler2; eF3 != null; eF3 = eF3.n()) {
                DatabaseStatementHandler databaseStatementHandler3;
                block36: {
                    databaseStatementHandler3 = (DatabaseStatementHandler)eF3.l();
                    int n9 = databaseStatementHandler3.x();
                    if (n9 == 310) {
                        n2 = this.t.H();
                    } else {
                        block35: {
                            try {
                                if (n9 == 304) break block35;
                                SafetyComplianceValidator.Z();
                                break block36;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                            }
                        }
                        int n10 = this.t.H();
                        long l = bl ? (long)this.i(databaseStatementHandler3.l(), n5, arrayList) : (long)this.p(databaseStatementHandler3.l());
                        lArray[n8++] = (l << 32) + ((long)(n10 - n4) & 0xFFFFFFFFFFFFFFFFL);
                    }
                }
                this.m = false;
                ((DatabaseStatementHandler)databaseStatementHandler3.n()).z(this);
            }
            Arrays.sort(lArray);
            int n11 = n3 + 8;
            try {
                for (n = 0; n < n7; ++n) {
                    this.t.M(n11, (int)(lArray[n] >>> 32));
                    this.t.M(n11 + 4, (int)lArray[n]);
                    n11 += 8;
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw SafetyComplianceValidator.b(compilationDiagnosticException);
            }
            try {
                try {
                    if (n2 >= 0 && this.z.size() <= 0) break block37;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                }
                this.m = false;
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw SafetyComplianceValidator.b(compilationDiagnosticException);
            }
        }
        n = this.t.H();
        if (n2 < 0) {
            n2 = n;
        }
        this.t.M(n3, n2 - n4);
        for (int n10 : arrayList) {
            this.t.Q(n10, n2 - n10 + 1);
        }
        this.R(this.z, n);
        this.z = list;
    }

    protected abstract String L(eF var1) throws CompilationDiagnosticException;

    private static Exception b(Exception exception) {
        return exception;
    }

    private String t(SecureDataTransformer1124 secureDataTransformer1124, String string) throws CompilationDiagnosticException {
        int n;
        int n2;
        block17: {
            block18: {
                int n3;
                int n4;
                block16: {
                    String string2 = "invalid cast";
                    PersistenceRecord persistenceRecord = secureDataTransformer1124.m();
                    n2 = secureDataTransformer1124.P();
                    n = secureDataTransformer1124.A();
                    persistenceRecord.z(this);
                    n4 = this.P;
                    n3 = this.C;
                    try {
                        block15: {
                            try {
                                try {
                                    if (this.Q(n4, this.C, this.o, n, n2, string, true) || n4 == 344) break block15;
                                }
                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                }
                                if (n != 344) break block16;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                            }
                        }
                        throw new CompilationDiagnosticException("invalid cast");
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                    }
                }
                try {
                    try {
                        try {
                            if (n != 307) break block17;
                            if (SafetyComplianceValidator.V(n4)) break block18;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                        }
                        if (n3 != 0) break block18;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                    }
                    throw new CompilationDiagnosticException("invalid cast");
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                }
            }
            return SafetyComplianceValidator.Y(string, n2);
        }
        try {
            if (n2 > 0) {
                return SafetyComplianceValidator.G(n, n2);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw SafetyComplianceValidator.b(compilationDiagnosticException);
        }
        return null;
    }

    private void h(CryptographicPrimitiveManager cryptographicPrimitiveManager, int n, int n2, int n3) throws CompilationDiagnosticException {
        block29: {
            long l;
            block28: {
                int n4;
                block25: {
                    block27: {
                        l = d ^ 0x714F15A38543L;
                        try {
                            if (this.C != 0) {
                                SafetyComplianceValidator.U(cryptographicPrimitiveManager);
                            }
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                        }
                        n4 = this.P;
                        try {
                            block26: {
                                try {
                                    try {
                                        try {
                                            try {
                                                block24: {
                                                    try {
                                                        try {
                                                            if (n == 364 || n == 366) break block24;
                                                        }
                                                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                        }
                                                        if (n != 370) break block25;
                                                    }
                                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                    }
                                                }
                                                if (n4 == 324) break block26;
                                            }
                                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                            }
                                            if (n4 == 334) break block26;
                                        }
                                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                        }
                                        if (n4 == 306) break block26;
                                    }
                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                    }
                                    if (n4 != 303) break block27;
                                }
                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                }
                            }
                            this.P = n3;
                            break block28;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                        }
                    }
                    SafetyComplianceValidator.U(cryptographicPrimitiveManager);
                    break block28;
                }
                this.f(n3, n4, cryptographicPrimitiveManager);
            }
            int n5 = SafetyComplianceValidator.r(this.P);
            if (n5 >= 0) {
                int n6;
                block30: {
                    n6 = SafetyComplianceValidator.n[n2 + n5 + 1];
                    try {
                        try {
                            try {
                                if (n6 == 0) break block29;
                                if (n5 != 3) break block30;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                            }
                            if (this.P == 301) break block30;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                        }
                        this.P = (int)SafetyComplianceValidator.a("j", (int)25858, (long)(0x3C75421190E95607L ^ l));
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                    }
                }
                this.t.E(n6);
                return;
            }
        }
        SafetyComplianceValidator.U(cryptographicPrimitiveManager);
    }

    @Override
    public void s(SecureDataTransformer1124 secureDataTransformer1124) throws CompilationDiagnosticException {
        block3: {
            String string;
            block2: {
                String string2 = this.L(secureDataTransformer1124.l());
                string = this.t(secureDataTransformer1124, string2);
                int n = this.P;
                try {
                    this.P = secureDataTransformer1124.A();
                    this.C = secureDataTransformer1124.P();
                    this.o = string2;
                    if (string != null) break block2;
                    this.p(n, this.P);
                    break block3;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                }
            }
            this.t.U(string);
        }
    }

    public void p(PersistenceRecord persistenceRecord) throws CompilationDiagnosticException {
        this.D(persistenceRecord);
        persistenceRecord.z(this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void h(int n, PersistenceRecord persistenceRecord, CryptographicPrimitiveManager cryptographicPrimitiveManager, boolean bl) throws CompilationDiagnosticException {
        boolean bl2;
        try {
            boolean bl3 = bl2 = persistenceRecord == null;
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw SafetyComplianceValidator.b(compilationDiagnosticException);
        }
        if (bl2) {
            persistenceRecord = cryptographicPrimitiveManager.V();
        }
        if (persistenceRecord instanceof RemoteConnectionDescriptor) {
            block77: {
                int n2;
                block80: {
                    int n3;
                    block79: {
                        int n4;
                        block78: {
                            int n5;
                            block73: {
                                block75: {
                                    int n6;
                                    ComplexEntityLifecycleManager complexEntityLifecycleManager;
                                    block74: {
                                        block70: {
                                            block72: {
                                                int n7;
                                                ComplexEntityLifecycleManager complexEntityLifecycleManager2;
                                                block71: {
                                                    block67: {
                                                        block69: {
                                                            int n8;
                                                            ComplexEntityLifecycleManager complexEntityLifecycleManager3;
                                                            block68: {
                                                                DeclarativeEventOrchestrator declarativeEventOrchestrator = ((RemoteConnectionDescriptor)persistenceRecord).K();
                                                                n5 = this.P = declarativeEventOrchestrator.S();
                                                                this.C = declarativeEventOrchestrator.N();
                                                                n2 = this.A(declarativeEventOrchestrator);
                                                                try {
                                                                    if (this.C > 0) {
                                                                        SafetyComplianceValidator.O(cryptographicPrimitiveManager);
                                                                    }
                                                                }
                                                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (n5 != 312) break block67;
                                                                            this.t.s(n2);
                                                                            if (!bl) break block68;
                                                                        }
                                                                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                        }
                                                                        if (!bl2) break block68;
                                                                    }
                                                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                    }
                                                                    this.t.E(92);
                                                                }
                                                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                }
                                                            }
                                                            try {
                                                                this.t.p(1.0);
                                                                complexEntityLifecycleManager3 = this.t;
                                                                n8 = n == 362 ? 99 : 103;
                                                            }
                                                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                            }
                                                            try {
                                                                try {
                                                                    complexEntityLifecycleManager3.E(n8);
                                                                    if (!bl || bl2) break block69;
                                                                }
                                                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                }
                                                                this.t.E(92);
                                                            }
                                                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                            }
                                                        }
                                                        this.t.N(n2);
                                                        return;
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                if (n5 != 326) break block70;
                                                                this.t.H(n2);
                                                                if (!bl) break block71;
                                                            }
                                                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                            }
                                                            if (!bl2) break block71;
                                                        }
                                                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                        }
                                                        this.t.E(92);
                                                    }
                                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                    }
                                                }
                                                try {
                                                    this.t.M(1L);
                                                    complexEntityLifecycleManager2 = this.t;
                                                    n7 = n == 362 ? 97 : 101;
                                                }
                                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                }
                                                try {
                                                    try {
                                                        complexEntityLifecycleManager2.E(n7);
                                                        if (!bl || bl2) break block72;
                                                    }
                                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                    }
                                                    this.t.E(92);
                                                }
                                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                }
                                            }
                                            this.t.x(n2);
                                            return;
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (n5 != 317) break block73;
                                                    this.t.Y(n2);
                                                    if (!bl) break block74;
                                                }
                                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                }
                                                if (!bl2) break block74;
                                            }
                                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                            }
                                            this.t.E(89);
                                        }
                                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                        }
                                    }
                                    try {
                                        this.t.s(1.0f);
                                        complexEntityLifecycleManager = this.t;
                                        n6 = n == 362 ? 98 : 102;
                                    }
                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                    }
                                    try {
                                        try {
                                            complexEntityLifecycleManager.E(n6);
                                            if (!bl || bl2) break block75;
                                        }
                                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                        }
                                        this.t.E(89);
                                    }
                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                    }
                                }
                                this.t.q(n2);
                                return;
                            }
                            try {
                                try {
                                    try {
                                        block76: {
                                            try {
                                                try {
                                                    try {
                                                        if (n5 == 303 || n5 == 306) break block76;
                                                    }
                                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                    }
                                                    if (n5 == 334) break block76;
                                                }
                                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                }
                                                if (n5 != 324) break block77;
                                            }
                                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                            }
                                        }
                                        if (!bl) break block78;
                                    }
                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                    }
                                    if (!bl2) break block78;
                                }
                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                }
                                this.t.u(n2);
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                            }
                        }
                        try {
                            n4 = n == 362 ? 1 : -1;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                        }
                        n3 = n4;
                        try {
                            if (n2 <= 255) break block79;
                            this.t.E(196);
                            this.t.E(132);
                            this.t.m(n2);
                            this.t.m(n3);
                            break block80;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                        }
                    }
                    this.t.E(132);
                    this.t.w(n2);
                    this.t.w(n3);
                }
                try {
                    try {
                        if (!bl || bl2) return;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                    }
                    this.t.u(n2);
                    return;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                }
            }
            SafetyComplianceValidator.O(cryptographicPrimitiveManager);
            return;
        }
        if (persistenceRecord instanceof CryptographicPrimitiveManager) {
            CryptographicPrimitiveManager cryptographicPrimitiveManager2 = (CryptographicPrimitiveManager)persistenceRecord;
            try {
                if (cryptographicPrimitiveManager2.I() == 65) {
                    this.H(n, bl2, cryptographicPrimitiveManager2, bl);
                    return;
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw SafetyComplianceValidator.b(compilationDiagnosticException);
            }
        }
        this.e(n, bl2, persistenceRecord, cryptographicPrimitiveManager, bl);
    }

    /*
     * Unable to fully structure code
     */
    private boolean t(boolean var1_1, PersistenceRecord var2_2) throws CompilationDiagnosticException {
        block34: {
            block33: {
                block32: {
                    var3_3 = SafetyComplianceValidator.d ^ 102792452531970L;
                    var6_4 = SafetyComplianceValidator.W(var2_2);
                    if (var6_4 == 358) {
                        var7_5 = (PersistenceDescriptor)var2_2;
                        var8_7 = this.W(var7_5);
                        this.p(var1_1, var7_5.I(), var8_7, var7_5);
                    } else {
                        block29: {
                            block31: {
                                block30: {
                                    try {
                                        try {
                                            if (var6_4 != 33) break block29;
                                            v0 = this;
                                            if (var1_1) break block30;
                                        }
                                        catch (CompilationDiagnosticException v1) {
                                            throw SafetyComplianceValidator.b(v1);
                                        }
                                        v2 = true;
                                        break block31;
                                    }
                                    catch (CompilationDiagnosticException v3) {
                                        throw SafetyComplianceValidator.b(v3);
                                    }
                                }
                                v2 = false;
                            }
                            return v0.t(v2, ((CryptographicPrimitiveManager)var2_2).R());
                        }
                        try {
                            v4 = var6_4 == 369;
                        }
                        catch (CompilationDiagnosticException v5) {
                            throw SafetyComplianceValidator.b(v5);
                        }
                        var5_9 = v4;
                        try {
                            if (!v4 && var6_4 != 368) break block32;
                        }
                        catch (CompilationDiagnosticException v6) {
                            throw SafetyComplianceValidator.b(v6);
                        }
                        var7_6 = (PersistenceDescriptor)var2_2;
                        try {
                            v7 = this;
                            v8 = var5_9 == false;
                        }
                        catch (CompilationDiagnosticException v9) {
                            throw SafetyComplianceValidator.b(v9);
                        }
                        try {
                            if (v7.t(v8, var7_6.R())) {
                                this.P = (int)SafetyComplianceValidator.a("j", (int)5481, (long)(1942264186769163304L ^ var3_3));
                                this.C = 0;
                                return true;
                            }
                        }
                        catch (CompilationDiagnosticException v10) {
                            throw SafetyComplianceValidator.b(v10);
                        }
                        var8_8 = this.t.H();
                        try {
                            this.t.m(0);
                            if (this.t(var5_9, var7_6.V())) {
                                this.t.E(167);
                            }
                        }
                        catch (CompilationDiagnosticException v11) {
                            throw SafetyComplianceValidator.b(v11);
                        }
                        try {
                            this.t.Q(var8_8, this.t.H() - var8_8 + 3);
                            if (var1_1 == var5_9) ** GOTO lbl92
                            this.t.m(6);
                            this.t.E(167);
                        }
                        catch (CompilationDiagnosticException v12) {
                            throw SafetyComplianceValidator.b(v12);
                        }
                    }
                    break block34;
                }
                try {
                    if (SafetyComplianceValidator.r(var2_2, var1_1)) {
                        this.P = (int)SafetyComplianceValidator.a("j", (int)5481, (long)(1942264186769163304L ^ var3_3));
                        this.C = 0;
                        return true;
                    }
                }
                catch (CompilationDiagnosticException v13) {
                    throw SafetyComplianceValidator.b(v13);
                }
                try {
                    try {
                        var2_2.z(this);
                        if (this.P == 301 && this.C == 0) break block33;
                    }
                    catch (CompilationDiagnosticException v14) {
                        throw SafetyComplianceValidator.b(v14);
                    }
                    throw new CompilationDiagnosticException("boolean expr is required");
                }
                catch (CompilationDiagnosticException v15) {
                    throw SafetyComplianceValidator.b(v15);
                }
            }
            try {
                v16 = this.t;
                v17 = var1_1 != false ? 154 : 153;
            }
            catch (CompilationDiagnosticException v18) {
                throw SafetyComplianceValidator.b(v18);
            }
            v16.E(v17);
        }
        this.P = (int)SafetyComplianceValidator.a("j", (int)5481, (long)(1942264186769163304L ^ var3_3));
        this.C = 0;
        return false;
    }

    private static boolean r(PersistenceRecord persistenceRecord, boolean bl) {
        block9: {
            boolean bl2;
            block8: {
                int n;
                block6: {
                    block7: {
                        if (!(persistenceRecord instanceof SerializableIdentityToken)) break block9;
                        n = ((SerializableIdentityToken)persistenceRecord).X();
                        try {
                            try {
                                if (!bl) break block6;
                                if (n != 410) break block7;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SafetyComplianceValidator.b(customSystemException);
                            }
                            bl2 = true;
                            break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SafetyComplianceValidator.b(customSystemException);
                        }
                    }
                    bl2 = false;
                    break block8;
                }
                try {
                    bl2 = n == 411;
                }
                catch (CustomSystemException customSystemException) {
                    throw SafetyComplianceValidator.b(customSystemException);
                }
            }
            return bl2;
        }
        return false;
    }

    @Override
    public abstract void f(AuditTrailLogger var1) throws CompilationDiagnosticException;

    protected static void O(CryptographicPrimitiveManager cryptographicPrimitiveManager) throws CompilationDiagnosticException {
        throw new CompilationDiagnosticException("invalid type for " + cryptographicPrimitiveManager.p());
    }

    private int W(PersistenceDescriptor persistenceDescriptor) throws CompilationDiagnosticException {
        int n;
        block12: {
            int n2;
            block13: {
                persistenceDescriptor.R().z(this);
                n = this.P;
                n2 = this.C;
                try {
                    try {
                        try {
                            persistenceDescriptor.V().z(this);
                            if (n2 == this.C) break block12;
                            if (n == 412) break block13;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                        }
                        if (this.P == 412) break block13;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                    }
                    throw new CompilationDiagnosticException("incompatible array types");
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                }
            }
            try {
                if (this.P == 412) {
                    this.C = n2;
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw SafetyComplianceValidator.b(compilationDiagnosticException);
            }
        }
        try {
            if (n == 412) {
                return this.P;
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw SafetyComplianceValidator.b(compilationDiagnosticException);
        }
        return n;
    }

    protected void a(DatabaseStatementHandler databaseStatementHandler) throws CompilationDiagnosticException {
        this.y(databaseStatementHandler.Z());
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void W(DatabaseStatementHandler databaseStatementHandler) throws CompilationDiagnosticException {
        int n;
        block57: {
            block56: {
                block55: {
                    block54: {
                        block53: {
                            block50: {
                                boolean bl;
                                DatabaseStatementHandler databaseStatementHandler2;
                                SafetyComplianceValidator safetyComplianceValidator;
                                block52: {
                                    block51: {
                                        block49: {
                                            block46: {
                                                boolean bl2;
                                                DatabaseStatementHandler databaseStatementHandler3;
                                                SafetyComplianceValidator safetyComplianceValidator2;
                                                block48: {
                                                    block47: {
                                                        block45: {
                                                            block44: {
                                                                void var3_5;
                                                                try {
                                                                    if (databaseStatementHandler == null) {
                                                                        return;
                                                                    }
                                                                }
                                                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                }
                                                                n = databaseStatementHandler.x();
                                                                if (n == 69) {
                                                                    block43: {
                                                                        PersistenceRecord persistenceRecord;
                                                                        block42: {
                                                                            persistenceRecord = databaseStatementHandler.Z();
                                                                            try {
                                                                                this.D(persistenceRecord);
                                                                                if (!(persistenceRecord instanceof PersistentSerializationDescriptor)) break block42;
                                                                                this.D((PersistentSerializationDescriptor)persistenceRecord, false);
                                                                                return;
                                                                            }
                                                                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                            }
                                                                        }
                                                                        if (SafetyComplianceValidator.t(persistenceRecord)) {
                                                                            CryptographicPrimitiveManager cryptographicPrimitiveManager = (CryptographicPrimitiveManager)persistenceRecord;
                                                                            this.h(cryptographicPrimitiveManager.I(), cryptographicPrimitiveManager.R(), cryptographicPrimitiveManager, false);
                                                                            return;
                                                                        }
                                                                        try {
                                                                            persistenceRecord.z(this);
                                                                            if (!SafetyComplianceValidator.g(this.P, this.C)) break block43;
                                                                            this.t.E(88);
                                                                            return;
                                                                        }
                                                                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                        }
                                                                    }
                                                                    try {
                                                                        if (this.P == 344) return;
                                                                        this.t.E(87);
                                                                        return;
                                                                    }
                                                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                    }
                                                                }
                                                                try {
                                                                    if (n != 68 && n != 66) break block44;
                                                                }
                                                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                }
                                                                DatabaseStatementHandler databaseStatementHandler4 = databaseStatementHandler;
                                                                while (var3_5 != null) {
                                                                    PersistenceRecord persistenceRecord = var3_5.l();
                                                                    eF eF2 = var3_5.n();
                                                                    try {
                                                                        if (persistenceRecord == null) continue;
                                                                        persistenceRecord.z(this);
                                                                    }
                                                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                    }
                                                                }
                                                                return;
                                                            }
                                                            try {
                                                                if (n != 320) break block45;
                                                                this.G(databaseStatementHandler);
                                                                return;
                                                            }
                                                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    if (n != 346 && n != 311) break block46;
                                                                }
                                                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                }
                                                                safetyComplianceValidator2 = this;
                                                                databaseStatementHandler3 = databaseStatementHandler;
                                                                if (n != 346) break block47;
                                                            }
                                                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                            }
                                                            bl2 = true;
                                                            break block48;
                                                        }
                                                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                        }
                                                    }
                                                    bl2 = false;
                                                }
                                                safetyComplianceValidator2.a(databaseStatementHandler3, bl2);
                                                return;
                                            }
                                            try {
                                                if (n != 318) break block49;
                                                this.Y(databaseStatementHandler);
                                                return;
                                            }
                                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (n != 302 && n != 309) break block50;
                                                }
                                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                }
                                                safetyComplianceValidator = this;
                                                databaseStatementHandler2 = databaseStatementHandler;
                                                if (n != 302) break block51;
                                            }
                                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                            }
                                            bl = true;
                                            break block52;
                                        }
                                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                        }
                                    }
                                    bl = false;
                                }
                                safetyComplianceValidator.T(databaseStatementHandler2, bl);
                                return;
                            }
                            try {
                                if (n != 333) break block53;
                                this.a(databaseStatementHandler);
                                return;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                            }
                        }
                        try {
                            if (n != 340) break block54;
                            this.T(databaseStatementHandler);
                            return;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                        }
                    }
                    try {
                        if (n != 343) break block55;
                        this.n(databaseStatementHandler);
                        return;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                    }
                }
                try {
                    if (n != 337) break block56;
                    this.R(databaseStatementHandler);
                    return;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                }
            }
            try {
                if (n != 338) break block57;
                this.j(databaseStatementHandler);
                return;
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw SafetyComplianceValidator.b(compilationDiagnosticException);
            }
        }
        this.m = false;
        throw new CompilationDiagnosticException("sorry, not supported statement: TokenId " + n);
    }

    private void l(CryptographicPrimitiveManager cryptographicPrimitiveManager, int n, RemoteConnectionDescriptor remoteConnectionDescriptor, DeclarativeEventOrchestrator declarativeEventOrchestrator, PersistenceRecord persistenceRecord, boolean bl) throws CompilationDiagnosticException {
        String string;
        int n2;
        int n3;
        block26: {
            int n4;
            block30: {
                block29: {
                    block28: {
                        block27: {
                            block25: {
                                block23: {
                                    block24: {
                                        block22: {
                                            block21: {
                                                n3 = declarativeEventOrchestrator.S();
                                                n2 = declarativeEventOrchestrator.N();
                                                string = declarativeEventOrchestrator.u();
                                                n4 = this.A(declarativeEventOrchestrator);
                                                try {
                                                    if (n != 61) {
                                                        this.G(remoteConnectionDescriptor);
                                                    }
                                                }
                                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                }
                                                try {
                                                    try {
                                                        if (cryptographicPrimitiveManager != null || !(persistenceRecord instanceof SerializationUtility)) break block21;
                                                    }
                                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                    }
                                                    this.g((SerializationUtility)persistenceRecord, n3, n2, string);
                                                    break block22;
                                                }
                                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                }
                                            }
                                            this.v(cryptographicPrimitiveManager, n, persistenceRecord, n3, n2, string);
                                        }
                                        try {
                                            try {
                                                if (!bl) break block23;
                                                if (!SafetyComplianceValidator.g(n3, n2)) break block24;
                                            }
                                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                            }
                                            this.t.E(92);
                                            break block23;
                                        }
                                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                        }
                                    }
                                    this.t.E(89);
                                }
                                try {
                                    if (n2 <= 0) break block25;
                                    this.t.S(n4);
                                    break block26;
                                }
                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                }
                            }
                            try {
                                if (n3 != 312) break block27;
                                this.t.N(n4);
                                break block26;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                            }
                        }
                        try {
                            if (n3 != 317) break block28;
                            this.t.q(n4);
                            break block26;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                        }
                    }
                    try {
                        if (n3 != 326) break block29;
                        this.t.x(n4);
                        break block26;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                    }
                }
                try {
                    if (!SafetyComplianceValidator.V(n3)) break block30;
                    this.t.S(n4);
                    break block26;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                }
            }
            this.t.o(n4);
        }
        this.P = n3;
        this.C = n2;
        this.o = string;
    }

    public void U(PersistenceRecord persistenceRecord, PersistenceRecord persistenceRecord2) throws CompilationDiagnosticException {
        this.f(persistenceRecord, persistenceRecord2);
        this.t.E(SafetyComplianceValidator.a(this.P, this.C));
    }

    protected static void U(CryptographicPrimitiveManager cryptographicPrimitiveManager) throws CompilationDiagnosticException {
        throw new CompilationDiagnosticException("invalid types for " + cryptographicPrimitiveManager.p());
    }

    private void L(int n, int n2) throws CompilationDiagnosticException {
        block18: {
            block23: {
                block22: {
                    block21: {
                        block20: {
                            block19: {
                                block17: {
                                    String string = "valueOf";
                                    try {
                                        try {
                                            if (!SafetyComplianceValidator.V(n) && n2 <= 0) break block17;
                                        }
                                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                        }
                                        this.t.e("java.lang.String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;");
                                        break block18;
                                    }
                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                    }
                                }
                                try {
                                    if (n != 312) break block19;
                                    this.t.e("java.lang.String", "valueOf", "(D)Ljava/lang/String;");
                                    break block18;
                                }
                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                }
                            }
                            try {
                                if (n != 317) break block20;
                                this.t.e("java.lang.String", "valueOf", "(F)Ljava/lang/String;");
                                break block18;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                            }
                        }
                        try {
                            if (n != 326) break block21;
                            this.t.e("java.lang.String", "valueOf", "(J)Ljava/lang/String;");
                            break block18;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                        }
                    }
                    try {
                        if (n != 301) break block22;
                        this.t.e("java.lang.String", "valueOf", "(Z)Ljava/lang/String;");
                        break block18;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                    }
                }
                try {
                    if (n != 306) break block23;
                    this.t.e("java.lang.String", "valueOf", "(C)Ljava/lang/String;");
                    break block18;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                }
            }
            try {
                if (n == 344) {
                    throw new CompilationDiagnosticException("void type expression");
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw SafetyComplianceValidator.b(compilationDiagnosticException);
            }
            this.t.e("java.lang.String", "valueOf", "(I)Ljava/lang/String;");
        }
    }

    protected abstract void R(PersistenceRecord var1) throws CompilationDiagnosticException;

    @Override
    public void s(CryptographicPrimitiveManager cryptographicPrimitiveManager) throws CompilationDiagnosticException {
        block42: {
            block57: {
                int n;
                int n2;
                block54: {
                    block56: {
                        block55: {
                            long l;
                            block49: {
                                block53: {
                                    block52: {
                                        block51: {
                                            block50: {
                                                block48: {
                                                    block46: {
                                                        l = d ^ 0x6903EDF20BF1L;
                                                        n2 = cryptographicPrimitiveManager.I();
                                                        PersistenceRecord persistenceRecord = cryptographicPrimitiveManager.R();
                                                        if (n2 == 46) {
                                                            block41: {
                                                                String string = ((TransmissionPayload)cryptographicPrimitiveManager.V()).e();
                                                                try {
                                                                    if (!string.equals("class")) break block41;
                                                                    this.M(cryptographicPrimitiveManager);
                                                                    break block42;
                                                                }
                                                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                }
                                                            }
                                                            this.R(cryptographicPrimitiveManager);
                                                        } else {
                                                            block47: {
                                                                block45: {
                                                                    block44: {
                                                                        block43: {
                                                                            try {
                                                                                if (n2 != 35) break block43;
                                                                                this.R(cryptographicPrimitiveManager);
                                                                                break block42;
                                                                            }
                                                                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                            }
                                                                        }
                                                                        try {
                                                                            if (n2 != 65) break block44;
                                                                            this.U(persistenceRecord, cryptographicPrimitiveManager.V());
                                                                            break block42;
                                                                        }
                                                                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                        }
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (n2 != 362 && n2 != 363) break block45;
                                                                        }
                                                                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                        }
                                                                        this.h(n2, persistenceRecord, cryptographicPrimitiveManager, true);
                                                                        break block42;
                                                                    }
                                                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        if (n2 != 33) break block46;
                                                                        if (this.t(false, cryptographicPrimitiveManager)) break block47;
                                                                    }
                                                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                    }
                                                                    this.t.m(7);
                                                                    this.t.a(1);
                                                                    this.t.E(167);
                                                                    this.t.m(4);
                                                                }
                                                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                }
                                                            }
                                                            this.t.a(0);
                                                        }
                                                        break block42;
                                                    }
                                                    try {
                                                        if (n2 != 67) break block48;
                                                        SafetyComplianceValidator.Z();
                                                        break block42;
                                                    }
                                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                    }
                                                }
                                                cryptographicPrimitiveManager.R().z(this);
                                                n = SafetyComplianceValidator.r(this.P);
                                                try {
                                                    if (this.C > 0) {
                                                        SafetyComplianceValidator.O(cryptographicPrimitiveManager);
                                                    }
                                                }
                                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                }
                                                try {
                                                    try {
                                                        if (n2 != 45) break block49;
                                                        if (n != 0) break block50;
                                                    }
                                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                    }
                                                    this.t.E(119);
                                                    break block42;
                                                }
                                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                }
                                            }
                                            try {
                                                if (n != 1) break block51;
                                                this.t.E(118);
                                                break block42;
                                            }
                                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                            }
                                        }
                                        try {
                                            if (n != 2) break block52;
                                            this.t.E(117);
                                            break block42;
                                        }
                                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                        }
                                    }
                                    try {
                                        if (n != 3) break block53;
                                        this.t.E(116);
                                        this.P = (int)SafetyComplianceValidator.a("j", (int)25858, (long)(0x3C755A5D68B8D8B5L ^ l));
                                        break block42;
                                    }
                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                    }
                                }
                                SafetyComplianceValidator.O(cryptographicPrimitiveManager);
                                break block42;
                            }
                            try {
                                try {
                                    if (n2 != 126) break block54;
                                    if (n != 3) break block55;
                                }
                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                }
                                this.t.a(-1);
                                this.t.E(130);
                                this.P = (int)SafetyComplianceValidator.a("j", (int)25858, (long)(0x3C755A5D68B8D8B5L ^ l));
                                break block42;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                            }
                        }
                        try {
                            if (n != 2) break block56;
                            this.t.M(-1L);
                            this.t.E(131);
                            break block42;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                        }
                    }
                    SafetyComplianceValidator.O(cryptographicPrimitiveManager);
                    break block42;
                }
                try {
                    try {
                        if (n2 != 43) break block57;
                        if (n != -1) break block42;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                    }
                    SafetyComplianceValidator.O(cryptographicPrimitiveManager);
                    break block42;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                }
            }
            SafetyComplianceValidator.Z();
        }
    }

    private static int r(int n) {
        try {
            if (n == 312) {
                return 0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SafetyComplianceValidator.b(customSystemException);
        }
        try {
            if (n == 317) {
                return 1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SafetyComplianceValidator.b(customSystemException);
        }
        try {
            if (n == 326) {
                return 2;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SafetyComplianceValidator.b(customSystemException);
        }
        try {
            if (SafetyComplianceValidator.V(n)) {
                return -1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SafetyComplianceValidator.b(customSystemException);
        }
        try {
            if (n == 344) {
                return -1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SafetyComplianceValidator.b(customSystemException);
        }
        return 3;
    }

    protected static String Y(String string, int n) {
        try {
            if (string == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SafetyComplianceValidator.b(customSystemException);
        }
        try {
            if (n == 0) {
                return string;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SafetyComplianceValidator.b(customSystemException);
        }
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = n;
        try {
            while (n2-- > 0) {
                stringBuilder.append('[');
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SafetyComplianceValidator.b(customSystemException);
        }
        stringBuilder.append('L');
        stringBuilder.append(string);
        stringBuilder.append(';');
        return stringBuilder.toString();
    }

    private boolean Q(int n, int n2, String string, int n3, int n4, String string2, boolean bl) {
        block18: {
            block21: {
                block20: {
                    block19: {
                        try {
                            try {
                                if (n2 == n4) break block18;
                                if (n != 412) break block19;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SafetyComplianceValidator.b(customSystemException);
                            }
                            return false;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SafetyComplianceValidator.b(customSystemException);
                        }
                    }
                    try {
                        try {
                            try {
                                if (n4 != 0 || n3 != 307) break block20;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SafetyComplianceValidator.b(customSystemException);
                            }
                            if (!"java/lang/Object".equals(string2)) break block20;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SafetyComplianceValidator.b(customSystemException);
                        }
                        return false;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SafetyComplianceValidator.b(customSystemException);
                    }
                }
                try {
                    try {
                        try {
                            try {
                                if (!bl || n2 != 0) break block21;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SafetyComplianceValidator.b(customSystemException);
                            }
                            if (n != 307) break block21;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SafetyComplianceValidator.b(customSystemException);
                        }
                        if (!"java/lang/Object".equals(string)) break block21;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SafetyComplianceValidator.b(customSystemException);
                    }
                    return false;
                }
                catch (CustomSystemException customSystemException) {
                    throw SafetyComplianceValidator.b(customSystemException);
                }
            }
            return true;
        }
        return false;
    }

    public SafetyComplianceValidator(ComplexEntityLifecycleManager complexEntityLifecycleManager) {
        this.t = complexEntityLifecycleManager;
        this.F = -1;
        this.X = null;
        this.m = false;
        this.N = false;
        this.z = null;
        this.w = null;
        this.Y = null;
    }

    static int R(int n) {
        int[] nArray = SafetyComplianceValidator.n;
        int n2 = nArray.length;
        int n3 = 0;
        while (true) {
            block5: {
                try {
                    try {
                        if (n3 >= n2) break;
                        if (nArray[n3] != n) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SafetyComplianceValidator.b(customSystemException);
                    }
                    return n3;
                }
                catch (CustomSystemException customSystemException) {
                    throw SafetyComplianceValidator.b(customSystemException);
                }
            }
            n3 += 5;
        }
        return -1;
    }

    protected abstract String a(String var1) throws CompilationDiagnosticException;

    public boolean Y(boolean bl, PersistenceRecord persistenceRecord) throws CompilationDiagnosticException {
        this.D(persistenceRecord);
        return this.t(bl, persistenceRecord);
    }

    @Override
    public abstract void K(SerializationSecurityManager var1) throws CompilationDiagnosticException;

    protected abstract void g(SerializationUtility var1, int var2, int var3, String var4) throws CompilationDiagnosticException;

    public void f(int n) {
        this.t.e(n);
    }

    protected static void Z() throws CompilationDiagnosticException {
        throw new CompilationDiagnosticException("fatal");
    }

    protected abstract void J(CryptographicPrimitiveManager var1, int var2, PersistenceRecord var3, PersistenceRecord var4, boolean var5) throws CompilationDiagnosticException;

    @Override
    public void J(PersistentSerializationDescriptor persistentSerializationDescriptor) throws CompilationDiagnosticException {
        this.D(persistentSerializationDescriptor, true);
    }

    @Override
    public void g(GenericPairContainer genericPairContainer) throws CompilationDiagnosticException {
        SafetyComplianceValidator.Z();
    }

    protected void R(List<Integer> list, int n) {
        for (int n2 : list) {
            this.t.Q(n2, n - n2 + 1);
        }
    }

    private void o(CryptographicPrimitiveManager cryptographicPrimitiveManager, int n, int n2, String string) throws CompilationDiagnosticException {
        long l;
        block17: {
            boolean bl;
            boolean bl2;
            int n3;
            int n4;
            block16: {
                block15: {
                    boolean bl3;
                    block14: {
                        block13: {
                            l = d ^ 0xE2349C70553L;
                            n4 = this.P;
                            n3 = this.C;
                            bl2 = SafetyComplianceValidator.g(n4, n3);
                            try {
                                try {
                                    if (n4 != 307 || !"java/lang/String".equals(this.o)) break block13;
                                }
                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                }
                                bl3 = true;
                                break block14;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                            }
                        }
                        bl3 = false;
                    }
                    bl = bl3;
                    try {
                        if (bl2) {
                            this.L(n4, n3);
                        }
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                    }
                    try {
                        if (!SafetyComplianceValidator.g(n, n2)) break block15;
                        this.t.E(91);
                        this.t.E(87);
                        break block16;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                    }
                }
                this.t.E(95);
            }
            try {
                try {
                    this.L(n, n2);
                    this.t.E(95);
                    if (bl2 || bl) break block17;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                }
                this.L(n4, n3);
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw SafetyComplianceValidator.b(compilationDiagnosticException);
            }
        }
        this.t.J("java.lang.String", "concat", "(Ljava/lang/String;)Ljava/lang/String;");
        this.P = (int)SafetyComplianceValidator.a("j", (int)19460, (long)(0x4A02B0B04D18FF1CL ^ l));
        this.C = 0;
        this.o = "java/lang/String";
    }

    @Override
    public void Q(DeclarativeEventOrchestrator declarativeEventOrchestrator) throws CompilationDiagnosticException {
        declarativeEventOrchestrator.T(this.H());
        declarativeEventOrchestrator.R(this.a(declarativeEventOrchestrator.u()));
        int n = SafetyComplianceValidator.g(declarativeEventOrchestrator.S(), declarativeEventOrchestrator.N()) ? 2 : 1;
        this.l(n);
        PersistenceRecord persistenceRecord = declarativeEventOrchestrator.S();
        try {
            if (persistenceRecord != null) {
                this.D(persistenceRecord);
                this.l(null, 61, null, declarativeEventOrchestrator, persistenceRecord, false);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw SafetyComplianceValidator.b(compilationDiagnosticException);
        }
    }

    @Override
    public abstract void J(SerializationContext var1) throws CompilationDiagnosticException;

    private void p(boolean bl, int n, int n2, PersistenceDescriptor persistenceDescriptor) throws CompilationDiagnosticException {
        block64: {
            block56: {
                block60: {
                    int n3;
                    block57: {
                        block59: {
                            block53: {
                                block55: {
                                    block65: {
                                        block43: {
                                            block47: {
                                                int n4;
                                                ComplexEntityLifecycleManager complexEntityLifecycleManager;
                                                block49: {
                                                    block48: {
                                                        block44: {
                                                            int n5;
                                                            ComplexEntityLifecycleManager complexEntityLifecycleManager2;
                                                            block46: {
                                                                block45: {
                                                                    try {
                                                                        if (this.C == 0) {
                                                                            this.f(n2, this.P, persistenceDescriptor);
                                                                        }
                                                                    }
                                                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                    }
                                                                    n3 = SafetyComplianceValidator.r(this.P);
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (n3 != -1 && this.C <= 0) break block43;
                                                                                }
                                                                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                                }
                                                                                if (n != 358) break block44;
                                                                            }
                                                                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                            }
                                                                            complexEntityLifecycleManager2 = this.t;
                                                                            if (!bl) break block45;
                                                                        }
                                                                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                        }
                                                                        n5 = 165;
                                                                        break block46;
                                                                    }
                                                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                    }
                                                                }
                                                                n5 = 166;
                                                            }
                                                            complexEntityLifecycleManager2.E(n5);
                                                            break block64;
                                                        }
                                                        try {
                                                            try {
                                                                if (n != 350) break block47;
                                                                complexEntityLifecycleManager = this.t;
                                                                if (!bl) break block48;
                                                            }
                                                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                            }
                                                            n4 = 166;
                                                            break block49;
                                                        }
                                                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                        }
                                                    }
                                                    n4 = 165;
                                                }
                                                complexEntityLifecycleManager.E(n4);
                                                break block64;
                                            }
                                            SafetyComplianceValidator.U(persistenceDescriptor);
                                            break block64;
                                        }
                                        if (n3 != 3) break block65;
                                        int[] nArray = V;
                                        int n6 = 0;
                                        while (true) {
                                            block50: {
                                                int n7;
                                                int n8;
                                                int[] nArray2;
                                                ComplexEntityLifecycleManager complexEntityLifecycleManager;
                                                block52: {
                                                    block51: {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (n6 >= nArray.length) break;
                                                                    if (nArray[n6] != n) break block50;
                                                                }
                                                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                }
                                                                complexEntityLifecycleManager = this.t;
                                                                nArray2 = nArray;
                                                                n8 = n6;
                                                                if (!bl) break block51;
                                                            }
                                                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                            }
                                                            n7 = 1;
                                                            break block52;
                                                        }
                                                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                        }
                                                    }
                                                    n7 = 2;
                                                }
                                                complexEntityLifecycleManager.E(nArray2[n8 + n7]);
                                                return;
                                            }
                                            n6 += 3;
                                        }
                                        SafetyComplianceValidator.U(persistenceDescriptor);
                                        break block64;
                                    }
                                    try {
                                        block54: {
                                            try {
                                                try {
                                                    if (n3 != 0) break block53;
                                                    if (n == 60) break block54;
                                                }
                                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                }
                                                if (n != 357) break block55;
                                            }
                                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                            }
                                        }
                                        this.t.E(152);
                                        break block56;
                                    }
                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                    }
                                }
                                this.t.E(151);
                                break block56;
                            }
                            try {
                                block58: {
                                    try {
                                        try {
                                            if (n3 != 1) break block57;
                                            if (n == 60) break block58;
                                        }
                                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                        }
                                        if (n != 357) break block59;
                                    }
                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                    }
                                }
                                this.t.E(150);
                                break block56;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                            }
                        }
                        this.t.E(149);
                        break block56;
                    }
                    try {
                        if (n3 != 2) break block60;
                        this.t.E(148);
                        break block56;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                    }
                }
                SafetyComplianceValidator.Z();
            }
            int[] nArray = b;
            int n9 = 0;
            while (true) {
                block61: {
                    int n10;
                    int n11;
                    int[] nArray3;
                    ComplexEntityLifecycleManager complexEntityLifecycleManager;
                    block63: {
                        block62: {
                            try {
                                try {
                                    try {
                                        if (n9 >= nArray.length) break;
                                        if (nArray[n9] != n) break block61;
                                    }
                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                    }
                                    complexEntityLifecycleManager = this.t;
                                    nArray3 = nArray;
                                    n11 = n9;
                                    if (!bl) break block62;
                                }
                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                }
                                n10 = 1;
                                break block63;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                            }
                        }
                        n10 = 2;
                    }
                    complexEntityLifecycleManager.E(nArray3[n11 + n10]);
                    return;
                }
                n9 += 3;
            }
            SafetyComplianceValidator.U(persistenceDescriptor);
        }
    }

    private void T(DatabaseStatementHandler databaseStatementHandler, boolean bl) throws CompilationDiagnosticException {
        block6: {
            Integer n;
            block5: {
                try {
                    if (databaseStatementHandler.l() != null) {
                        throw new CompilationDiagnosticException("sorry, not support labeled break or continue");
                    }
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                }
                this.t.E(167);
                n = this.t.H();
                try {
                    this.t.m(0);
                    if (!bl) break block5;
                    this.z.add(n);
                    break block6;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                }
            }
            this.w.add(n);
        }
    }

    @Override
    public void B(TypeInspectionUtility1890 typeInspectionUtility1890) throws CompilationDiagnosticException {
        long l = d ^ 0x7A0C1CFD4102L;
        String string = this.L(typeInspectionUtility1890.l());
        String string2 = this.t(typeInspectionUtility1890, string);
        this.t.k(string2);
        this.P = (int)SafetyComplianceValidator.a("j", (int)5481, (long)(0x1AF4698DE735E228L ^ l));
        this.C = 0;
    }

    static int W(PersistenceRecord persistenceRecord) throws CompilationDiagnosticException {
        if (persistenceRecord instanceof CryptographicPrimitiveManager) {
            int n;
            block14: {
                CryptographicPrimitiveManager cryptographicPrimitiveManager = (CryptographicPrimitiveManager)persistenceRecord;
                n = cryptographicPrimitiveManager.I();
                try {
                    if (n == 33) {
                        return 33;
                    }
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                }
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (!(cryptographicPrimitiveManager instanceof PersistenceDescriptor) || n == 368) break block14;
                                }
                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                }
                                if (n == 369) break block14;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                            }
                            if (n == 38) break block14;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                        }
                        if (n == 124) break block14;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                    }
                    return 358;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                }
            }
            return n;
        }
        return 32;
    }

    @Override
    public void f(VersionedDataContainer versionedDataContainer) throws CompilationDiagnosticException {
        block9: {
            long l;
            long l2;
            block6: {
                int n;
                block8: {
                    block7: {
                        l2 = d ^ 0xFD8E9F5EB5CL;
                        this.C = 0;
                        l = versionedDataContainer.B();
                        int n2 = versionedDataContainer.o();
                        try {
                            try {
                                try {
                                    if (n2 != 402 && n2 != 401) break block6;
                                }
                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                }
                                SafetyComplianceValidator safetyComplianceValidator = this;
                                if (n2 != 402) break block7;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                            }
                            n = 324;
                            break block8;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                        }
                    }
                    n = 306;
                }
                safetyComplianceValidator.P = n;
                this.t.a((int)l);
                break block9;
            }
            this.P = (int)SafetyComplianceValidator.a("j", (int)13510, (long)(0x3D9B58B6315CE9D0L ^ l2));
            this.t.M(l);
        }
    }

    private void t(CryptographicPrimitiveManager cryptographicPrimitiveManager, int n, CryptographicPrimitiveManager cryptographicPrimitiveManager2, PersistenceRecord persistenceRecord, boolean bl) throws CompilationDiagnosticException {
        String string;
        int n2;
        int n3;
        block7: {
            block8: {
                try {
                    this.f(cryptographicPrimitiveManager2.R(), cryptographicPrimitiveManager2.V());
                    if (n != 61) {
                        this.t.E(92);
                        this.t.E(SafetyComplianceValidator.a(this.P, this.C));
                    }
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                }
                n3 = this.P;
                n2 = this.C;
                string = this.o;
                try {
                    try {
                        this.v(cryptographicPrimitiveManager, n, persistenceRecord, n3, n2, string);
                        if (!bl) break block7;
                        if (!SafetyComplianceValidator.g(n3, n2)) break block8;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                    }
                    this.t.E(94);
                    break block7;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                }
            }
            this.t.E(91);
        }
        this.t.E(SafetyComplianceValidator.x(n3, n2));
        this.P = n3;
        this.C = n2;
        this.o = string;
    }

    private static boolean t(PersistenceRecord persistenceRecord) {
        if (persistenceRecord instanceof CryptographicPrimitiveManager) {
            boolean bl;
            block6: {
                block5: {
                    int n = ((CryptographicPrimitiveManager)persistenceRecord).I();
                    try {
                        try {
                            if (n != 362 && n != 363) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SafetyComplianceValidator.b(customSystemException);
                        }
                        bl = true;
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SafetyComplianceValidator.b(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    @Override
    public abstract void J(SerializationUtility var1) throws CompilationDiagnosticException;

    static boolean d(int n, int n2) {
        boolean bl;
        block7: {
            block6: {
                int n3 = SafetyComplianceValidator.r(n);
                int n4 = SafetyComplianceValidator.r(n2);
                try {
                    try {
                        try {
                            if (n3 < 0 || n4 < 0) break block6;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SafetyComplianceValidator.b(customSystemException);
                        }
                        if (n3 <= n4) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SafetyComplianceValidator.b(customSystemException);
                    }
                    bl = true;
                    break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw SafetyComplianceValidator.b(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    protected static String G(int n, int n2) {
        char c = 'I';
        switch (n) {
            case 301: {
                c = 'Z';
                break;
            }
            case 303: {
                c = 'B';
                break;
            }
            case 306: {
                c = 'C';
                break;
            }
            case 334: {
                c = 'S';
                break;
            }
            case 324: {
                c = 'I';
                break;
            }
            case 326: {
                c = 'J';
                break;
            }
            case 317: {
                c = 'F';
                break;
            }
            case 312: {
                c = 'D';
                break;
            }
            case 344: {
                c = 'V';
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        try {
            while (n2-- > 0) {
                stringBuilder.append('[');
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SafetyComplianceValidator.b(customSystemException);
        }
        stringBuilder.append(c);
        return stringBuilder.toString();
    }

    protected void M(String string) throws CompilationDiagnosticException {
        int n = this.t.H();
        this.t.r(string);
        this.t.e("java.lang.Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;");
        int n2 = this.t.H();
        this.t.E(167);
        int n3 = this.t.H();
        this.t.m(0);
        this.t.R(n, n2, this.t.H(), "java.lang.ClassNotFoundException");
        this.t.R(1);
        this.t.e("javassist.runtime.DotClass", "fail", "(Ljava/lang/ClassNotFoundException;)Ljava/lang/NoClassDefFoundError;");
        this.t.E(191);
        this.t.Q(n3, this.t.H() - n3 + 1);
    }

    /*
     * Exception decompiling
     */
    @Override
    public void m(SerializableIdentityToken var1_1) throws CompilationDiagnosticException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[SWITCH]
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

    protected void n(DatabaseStatementHandler databaseStatementHandler) throws CompilationDiagnosticException {
        this.m = false;
    }

    private void T(DatabaseStatementHandler databaseStatementHandler) throws CompilationDiagnosticException {
        block4: {
            PersistenceRecord persistenceRecord = databaseStatementHandler.Z();
            try {
                try {
                    this.p(persistenceRecord);
                    if (this.P == 307 && this.C <= 0) break block4;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                }
                throw new CompilationDiagnosticException("bad throw statement");
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw SafetyComplianceValidator.b(compilationDiagnosticException);
            }
        }
        this.t.E(191);
        this.m = true;
    }

    protected final void y(PersistenceRecord persistenceRecord) throws CompilationDiagnosticException {
        int n;
        if (persistenceRecord == null) {
            n = 177;
        } else {
            int n2;
            this.p(persistenceRecord);
            n = this.C > 0 ? 176 : ((n2 = this.P) == 312 ? 175 : (n2 == 317 ? 174 : (n2 == 326 ? 173 : (SafetyComplianceValidator.V(n2) ? 176 : 172))));
        }
        NetworkInterfaceMapper networkInterfaceMapper = this.Y;
        while (true) {
            block7: {
                try {
                    try {
                        if (networkInterfaceMapper == null) break;
                        if (!networkInterfaceMapper.Z(this.t, n)) break block7;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                    }
                    this.m = true;
                    return;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                }
            }
            networkInterfaceMapper = networkInterfaceMapper.y;
        }
        this.t.E(n);
        this.m = true;
    }

    private void j(DatabaseStatementHandler databaseStatementHandler) throws CompilationDiagnosticException {
        block17: {
            int n;
            int n2;
            block16: {
                n2 = SafetyComplianceValidator.D(this.z);
                n = SafetyComplianceValidator.D(this.w);
                try {
                    try {
                        this.p(databaseStatementHandler.l());
                        if (this.P == 307 || this.C != 0) break block16;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                    }
                    throw new CompilationDiagnosticException("bad type expr for synchronized block");
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                }
            }
            ComplexEntityLifecycleManager complexEntityLifecycleManager = this.t;
            int n3 = complexEntityLifecycleManager.D();
            complexEntityLifecycleManager.J(1);
            complexEntityLifecycleManager.E(89);
            complexEntityLifecycleManager.S(n3);
            complexEntityLifecycleManager.E(194);
            ResourceAllocationHandler2388 resourceAllocationHandler2388 = new ResourceAllocationHandler2388(this, this, n3);
            int n4 = complexEntityLifecycleManager.H();
            DatabaseStatementHandler databaseStatementHandler2 = (DatabaseStatementHandler)databaseStatementHandler.n();
            try {
                if (databaseStatementHandler2 != null) {
                    databaseStatementHandler2.z(this);
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw SafetyComplianceValidator.b(compilationDiagnosticException);
            }
            int n5 = complexEntityLifecycleManager.H();
            int n6 = 0;
            if (!this.m) {
                ((NetworkInterfaceMapper)resourceAllocationHandler2388).Z(complexEntityLifecycleManager, 0);
                complexEntityLifecycleManager.E(167);
                n6 = complexEntityLifecycleManager.H();
                complexEntityLifecycleManager.m(0);
            }
            if (n4 < n5) {
                int n7 = complexEntityLifecycleManager.H();
                ((NetworkInterfaceMapper)resourceAllocationHandler2388).Z(complexEntityLifecycleManager, 0);
                complexEntityLifecycleManager.E(191);
                complexEntityLifecycleManager.f(n4, n5, n7, 0);
            }
            try {
                if (!this.m) {
                    complexEntityLifecycleManager.Q(n6, complexEntityLifecycleManager.H() - n6 + 1);
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw SafetyComplianceValidator.b(compilationDiagnosticException);
            }
            try {
                try {
                    resourceAllocationHandler2388.J(this);
                    if (SafetyComplianceValidator.D(this.z) == n2 && SafetyComplianceValidator.D(this.w) == n) break block17;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                }
                throw new CompilationDiagnosticException("sorry, cannot break/continue in synchronized block");
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw SafetyComplianceValidator.b(compilationDiagnosticException);
            }
        }
    }

    protected static void K(CryptographicPrimitiveManager cryptographicPrimitiveManager) throws CompilationDiagnosticException {
        String string = cryptographicPrimitiveManager == null ? "incompatible type for assignment" : "incompatible type for " + cryptographicPrimitiveManager.p();
        throw new CompilationDiagnosticException(string);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                SafetyComplianceValidator.d = MultiContainerRegistry.a(-7588155982145484357L, -2795194316391114310L, MethodHandles.lookup().lookupClass()).a(27686422143059L);
                SafetyComplianceValidator.l = new HashMap<K, V>(13);
                var0 = SafetyComplianceValidator.d ^ 102283719512834L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[10];
                var5_4 = 0;
                var6_5 = "\u00b8:x:\u009bU\u00d05\u009cqA\u00eb\u00fd\u00cbE\u0085\u000f\u00b0q\u00fe\u00a3\u0012\u0086<\u00c6\u0097f\u0098@]g\u009f\u00a18\u00f1\u00fb\\\u0080\u00a5\u00817\u00d2e\u00b5\u009fi\u00f8Q(}\u00a7\u00f6DC\u00ea\u00ff7g\u0083@<\u008e\u00dd\u0002";
                var7_6 = "\u00b8:x:\u009bU\u00d05\u009cqA\u00eb\u00fd\u00cbE\u0085\u000f\u00b0q\u00fe\u00a3\u0012\u0086<\u00c6\u0097f\u0098@]g\u009f\u00a18\u00f1\u00fb\\\u0080\u00a5\u00817\u00d2e\u00b5\u009fi\u00f8Q(}\u00a7\u00f6DC\u00ea\u00ff7g\u0083@<\u008e\u00dd\u0002".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00a5\u00db\u0095\u00b7w\u00ca9\u0092]\u00d2-a*\b>\u00ef";
                    var7_6 = "\u00a5\u00db\u0095\u00b7w\u00ca9\u0092]\u00d2-a*\b>\u00ef".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl52:
                // 1 sources

                ** continue;
            }
        }
        SafetyComplianceValidator.h = var8_3;
        SafetyComplianceValidator.k = new Integer[10];
        SafetyComplianceValidator.n = new int[]{43, 99, 98, 97, 96, 45, 103, 102, 101, 100, 42, 107, 106, 105, 104, 47, 111, 110, 109, 108, 37, 115, 114, 113, 112, 124, 0, 0, 129, 128, 94, 0, 0, 131, 130, 38, 0, 0, 127, 126, 364, 0, 0, 121, 120, 366, 0, 0, 123, 122, 370, 0, 0, 125, 124};
        SafetyComplianceValidator.V = new int[]{358, 159, 160, 350, 160, 159, 357, 164, 163, 359, 162, 161, 60, 161, 162, 62, 163, 164};
        SafetyComplianceValidator.b = new int[]{358, 153, 154, 350, 154, 153, 357, 158, 157, 359, 156, 155, 60, 155, 156, 62, 157, 158};
        SafetyComplianceValidator.B = new int[]{0, 144, 143, 142, 141, 0, 140, 139, 138, 137, 0, 136, 135, 134, 133, 0};
    }

    /*
     * Exception decompiling
     */
    protected static int a(int var0, int var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 2[SWITCH]
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

    static boolean q(int n) {
        boolean bl;
        try {
            bl = SafetyComplianceValidator.r(n) == 3;
        }
        catch (CustomSystemException customSystemException) {
            throw SafetyComplianceValidator.b(customSystemException);
        }
        return bl;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xA04;
        if (k[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = h[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])SafetyComplianceValidator.l.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    SafetyComplianceValidator.l.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/aD", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            SafetyComplianceValidator.k[n2] = n3;
        }
        return k[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/aD" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static boolean g(int n, int n2) {
        boolean bl;
        block8: {
            block6: {
                try {
                    block7: {
                        try {
                            try {
                                if (n2 != 0) break block6;
                                if (n == 312) break block7;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SafetyComplianceValidator.b(customSystemException);
                            }
                            if (n != 326) break block6;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SafetyComplianceValidator.b(customSystemException);
                        }
                    }
                    bl = true;
                    break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw SafetyComplianceValidator.b(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private void G(DatabaseStatementHandler databaseStatementHandler) throws CompilationDiagnosticException {
        block20: {
            boolean bl;
            block23: {
                block22: {
                    boolean bl2;
                    block21: {
                        int n;
                        int n2;
                        DatabaseStatementHandler databaseStatementHandler2;
                        block19: {
                            DatabaseStatementHandler databaseStatementHandler3;
                            block17: {
                                block18: {
                                    PersistenceRecord persistenceRecord = databaseStatementHandler.l();
                                    databaseStatementHandler3 = (DatabaseStatementHandler)databaseStatementHandler.n().l();
                                    databaseStatementHandler2 = (DatabaseStatementHandler)databaseStatementHandler.n().n().l();
                                    try {
                                        try {
                                            if (!this.Y(false, persistenceRecord)) break block17;
                                            this.m = false;
                                            if (databaseStatementHandler2 == null) break block18;
                                        }
                                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                        }
                                        databaseStatementHandler2.z(this);
                                    }
                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                    }
                                }
                                return;
                            }
                            n2 = this.t.H();
                            n = 0;
                            try {
                                this.t.m(0);
                                this.m = false;
                                if (databaseStatementHandler3 != null) {
                                    databaseStatementHandler3.z(this);
                                }
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                            }
                            bl2 = this.m;
                            try {
                                this.m = false;
                                if (databaseStatementHandler2 == null || bl2) break block19;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                            }
                            this.t.E(167);
                            n = this.t.H();
                            this.t.m(0);
                        }
                        try {
                            try {
                                this.t.Q(n2, this.t.H() - n2 + 1);
                                if (databaseStatementHandler2 == null) break block20;
                                databaseStatementHandler2.z(this);
                                if (bl2) break block21;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                            }
                            this.t.Q(n, this.t.H() - n + 1);
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                        }
                    }
                    try {
                        try {
                            SafetyComplianceValidator safetyComplianceValidator = this;
                            if (!bl2 || !this.m) break block22;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                        }
                        bl = true;
                        break block23;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                    }
                }
                bl = false;
            }
            safetyComplianceValidator.m = bl;
        }
    }

    protected void l(int n) {
        this.t.J(n);
    }

    protected void k(int n, boolean bl, int n2, boolean bl2, CryptographicPrimitiveManager cryptographicPrimitiveManager) throws CompilationDiagnosticException {
        block44: {
            block45: {
                block41: {
                    int n3;
                    ComplexEntityLifecycleManager complexEntityLifecycleManager;
                    block43: {
                        block42: {
                            int n4;
                            block38: {
                                int n5;
                                ComplexEntityLifecycleManager complexEntityLifecycleManager2;
                                block40: {
                                    block39: {
                                        block35: {
                                            int n6;
                                            ComplexEntityLifecycleManager complexEntityLifecycleManager3;
                                            block37: {
                                                block36: {
                                                    block32: {
                                                        int n7;
                                                        ComplexEntityLifecycleManager complexEntityLifecycleManager4;
                                                        long l;
                                                        block34: {
                                                            block33: {
                                                                block30: {
                                                                    l = d ^ 0xFF0937940DEL;
                                                                    n4 = this.P;
                                                                    try {
                                                                        try {
                                                                            if (!bl || !bl2) break block30;
                                                                        }
                                                                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                        }
                                                                        this.t.E(n);
                                                                    }
                                                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        block31: {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (n4 == 324 || n4 == 303) break block31;
                                                                                    }
                                                                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                                    }
                                                                                    if (n4 == 306) break block31;
                                                                                }
                                                                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                                }
                                                                                if (n4 != 334) break block32;
                                                                            }
                                                                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                            }
                                                                        }
                                                                        this.t.a(1);
                                                                        complexEntityLifecycleManager4 = this.t;
                                                                        if (n2 != 362) break block33;
                                                                    }
                                                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                    }
                                                                    n7 = 96;
                                                                    break block34;
                                                                }
                                                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                }
                                                            }
                                                            n7 = 100;
                                                        }
                                                        complexEntityLifecycleManager4.E(n7);
                                                        this.P = (int)SafetyComplianceValidator.a("j", (int)18924, (long)(0x1590F80227A2BF76L ^ l));
                                                        break block45;
                                                    }
                                                    try {
                                                        try {
                                                            if (n4 != 326) break block35;
                                                            this.t.M(1L);
                                                            complexEntityLifecycleManager3 = this.t;
                                                            if (n2 != 362) break block36;
                                                        }
                                                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                        }
                                                        n6 = 97;
                                                        break block37;
                                                    }
                                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                    }
                                                }
                                                n6 = 101;
                                            }
                                            complexEntityLifecycleManager3.E(n6);
                                            break block45;
                                        }
                                        try {
                                            try {
                                                if (n4 != 317) break block38;
                                                this.t.s(1.0f);
                                                complexEntityLifecycleManager2 = this.t;
                                                if (n2 != 362) break block39;
                                            }
                                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                            }
                                            n5 = 98;
                                            break block40;
                                        }
                                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                        }
                                    }
                                    n5 = 102;
                                }
                                complexEntityLifecycleManager2.E(n5);
                                break block45;
                            }
                            try {
                                try {
                                    if (n4 != 312) break block41;
                                    this.t.p(1.0);
                                    complexEntityLifecycleManager = this.t;
                                    if (n2 != 362) break block42;
                                }
                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                }
                                n3 = 99;
                                break block43;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                            }
                        }
                        n3 = 103;
                    }
                    complexEntityLifecycleManager.E(n3);
                    break block45;
                }
                SafetyComplianceValidator.O(cryptographicPrimitiveManager);
            }
            try {
                try {
                    if (!bl || bl2) break block44;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                }
                this.t.E(n);
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw SafetyComplianceValidator.b(compilationDiagnosticException);
            }
        }
    }

    @Override
    public void C(PersistenceManagerAdapter persistenceManagerAdapter) throws CompilationDiagnosticException {
        block6: {
            block5: {
                try {
                    if (!this.t(false, persistenceManagerAdapter.s())) break block5;
                    persistenceManagerAdapter.k().z(this);
                    break block6;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                }
            }
            int n = this.t.H();
            this.t.m(0);
            persistenceManagerAdapter.x().z(this);
            int n2 = this.C;
            this.t.E(167);
            int n3 = this.t.H();
            try {
                this.t.m(0);
                this.t.Q(n, this.t.H() - n + 1);
                persistenceManagerAdapter.k().z(this);
                if (n2 != this.C) {
                    throw new CompilationDiagnosticException("type mismatch in ?:");
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw SafetyComplianceValidator.b(compilationDiagnosticException);
            }
            this.t.Q(n3, this.t.H() - n3 + 1);
        }
    }

    public void H(int n, boolean bl, CryptographicPrimitiveManager cryptographicPrimitiveManager, boolean bl2) throws CompilationDiagnosticException {
        int n2;
        this.f(cryptographicPrimitiveManager.R(), cryptographicPrimitiveManager.V());
        int n3 = this.P;
        int n4 = this.C;
        try {
            if (n4 > 0) {
                SafetyComplianceValidator.O(cryptographicPrimitiveManager);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw SafetyComplianceValidator.b(compilationDiagnosticException);
        }
        try {
            this.t.E(92);
            this.t.E(SafetyComplianceValidator.a(n3, this.C));
            n2 = SafetyComplianceValidator.g(n3, n4) ? 94 : 91;
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw SafetyComplianceValidator.b(compilationDiagnosticException);
        }
        int n5 = n2;
        this.k(n5, bl2, n, bl, cryptographicPrimitiveManager);
        this.t.E(SafetyComplianceValidator.x(n3, n4));
    }

    @Override
    public void S(eF eF2) throws CompilationDiagnosticException {
        SafetyComplianceValidator.Z();
    }

    public void D(PersistenceRecord persistenceRecord) throws CompilationDiagnosticException {
        try {
            if (this.X != null) {
                persistenceRecord.z(this.X);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw SafetyComplianceValidator.b(compilationDiagnosticException);
        }
    }

    @Override
    public void z(SerializableLogEntry serializableLogEntry) throws CompilationDiagnosticException {
        long l = d ^ 0x3CDD9ACB4C27L;
        this.P = (int)SafetyComplianceValidator.a("j", (int)14040, (long)(0x7088B6ECD6FC4CBFL ^ l));
        this.C = 0;
        this.o = "java/lang/String";
        this.t.r(serializableLogEntry.t());
    }

    public void M(CryptographicPrimitiveManager cryptographicPrimitiveManager) throws CompilationDiagnosticException {
        long l = d ^ 0x5177E29C4D6BL;
        PersistenceRecord persistenceRecord = cryptographicPrimitiveManager.R();
        try {
            if (!(persistenceRecord instanceof TransmissionPayload)) {
                throw new CompilationDiagnosticException("fatal error: badly parsed .class expr");
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw SafetyComplianceValidator.b(compilationDiagnosticException);
        }
        String string = ((TransmissionPayload)persistenceRecord).e();
        if (string.startsWith("[")) {
            String string2;
            String string3;
            int n = string.indexOf("[L");
            if (n >= 0 && !(string3 = string.substring(n + 2, string.length() - 1)).equals(string2 = this.a(string3))) {
                string2 = TypeInspectionUtility.M(string2);
                StringBuilder stringBuilder = new StringBuilder();
                try {
                    while (n-- >= 0) {
                        stringBuilder.append('[');
                    }
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                }
                stringBuilder.append('L').append(string2).append(';');
                string = stringBuilder.toString();
            }
        } else {
            string = this.a(TypeInspectionUtility.i(string));
            string = TypeInspectionUtility.M(string);
        }
        this.M(string);
        this.P = (int)SafetyComplianceValidator.a("j", (int)19460, (long)(0x4A02EFE4E643B724L ^ l));
        this.C = 0;
        this.o = "java/lang/Class";
    }

    /*
     * Exception decompiling
     */
    @Override
    public void G(RemoteConnectionDescriptor var1_1) throws CompilationDiagnosticException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 2[SWITCH]
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

    protected int A(DeclarativeEventOrchestrator declarativeEventOrchestrator) {
        int n = declarativeEventOrchestrator.y();
        if (n < 0) {
            n = this.H();
            declarativeEventOrchestrator.T(n);
            this.l(1);
        }
        return n;
    }

    @Override
    public void Q(NumericTransformationUtility numericTransformationUtility) throws CompilationDiagnosticException {
        block3: {
            long l;
            block2: {
                l = d ^ 0x7A7553009F52L;
                try {
                    this.C = 0;
                    if (numericTransformationUtility.w() != 405) break block2;
                    this.P = (int)SafetyComplianceValidator.a("j", (int)3824, (long)(0x312CEED2842EA7E3L ^ l));
                    this.t.p(numericTransformationUtility.L());
                    break block3;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                }
            }
            this.P = (int)SafetyComplianceValidator.a("j", (int)6257, (long)(0x2CC81D8BF09C3164L ^ l));
            this.t.s((float)numericTransformationUtility.L());
        }
    }

    protected static boolean V(int n) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (n != 307 && n != 412) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SafetyComplianceValidator.b(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw SafetyComplianceValidator.b(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    void p(int n, int n2) throws CompilationDiagnosticException {
        block20: {
            int n3;
            block21: {
                block18: {
                    try {
                        if (n == n2) {
                            return;
                        }
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                    }
                    int n4 = SafetyComplianceValidator.r(n);
                    int n5 = SafetyComplianceValidator.r(n2);
                    try {
                        if (0 > n4 || n4 >= 3) break block18;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                    }
                    n3 = B[n4 * 4 + n5];
                    break block21;
                }
                n3 = 0;
            }
            int n6 = n2 == 312 ? 135 : (n2 == 317 ? 134 : (n2 == 326 ? 133 : (n2 == 334 ? 147 : (n2 == 306 ? 146 : (n2 == 303 ? 145 : 0)))));
            try {
                if (n3 != 0) {
                    this.t.E(n3);
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw SafetyComplianceValidator.b(compilationDiagnosticException);
            }
            try {
                try {
                    block19: {
                        try {
                            try {
                                try {
                                    if (n3 == 0 || n3 == 136) break block19;
                                }
                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                }
                                if (n3 == 139) break block19;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                            }
                            if (n3 != 142) break block20;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                        }
                    }
                    if (n6 == 0) break block20;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                }
                this.t.E(n6);
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw SafetyComplianceValidator.b(compilationDiagnosticException);
            }
        }
    }

    private void f(int n, int n2, CryptographicPrimitiveManager cryptographicPrimitiveManager) throws CompilationDiagnosticException {
        block38: {
            int n3;
            block29: {
                block35: {
                    block37: {
                        block36: {
                            int n4;
                            int n5;
                            block31: {
                                block34: {
                                    block33: {
                                        boolean bl;
                                        int n6;
                                        block28: {
                                            block27: {
                                                n5 = SafetyComplianceValidator.r(n);
                                                n6 = SafetyComplianceValidator.r(n2);
                                                try {
                                                    try {
                                                        if (n6 >= 0 || n5 >= 0) break block27;
                                                    }
                                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                    }
                                                    return;
                                                }
                                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                }
                                            }
                                            try {
                                                try {
                                                    if (n6 >= 0 && n5 >= 0) break block28;
                                                }
                                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                }
                                                SafetyComplianceValidator.U(cryptographicPrimitiveManager);
                                            }
                                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                            }
                                        }
                                        if (n5 <= n6) {
                                            bl = false;
                                            this.P = n;
                                            n3 = B[n6 * 4 + n5];
                                            n4 = n5;
                                        } else {
                                            bl = true;
                                            n3 = B[n5 * 4 + n6];
                                            n4 = n6;
                                        }
                                        try {
                                            block32: {
                                                try {
                                                    try {
                                                        block30: {
                                                            try {
                                                                try {
                                                                    if (!bl) break block29;
                                                                    if (n4 == 0) break block30;
                                                                }
                                                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                                }
                                                                if (n4 != 2) break block31;
                                                            }
                                                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                            }
                                                        }
                                                        if (n5 == 0) break block32;
                                                    }
                                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                    }
                                                    if (n5 != 2) break block33;
                                                }
                                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                                }
                                            }
                                            this.t.E(94);
                                            break block34;
                                        }
                                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                        }
                                    }
                                    this.t.E(93);
                                }
                                this.t.E(88);
                                this.t.E(n3);
                                this.t.E(94);
                                this.t.E(88);
                                break block38;
                            }
                            try {
                                try {
                                    if (n4 != 1) break block35;
                                    if (n5 != 2) break block36;
                                }
                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                }
                                this.t.E(91);
                                this.t.E(87);
                                break block37;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                            }
                        }
                        this.t.E(95);
                    }
                    this.t.E(n3);
                    this.t.E(95);
                    break block38;
                }
                SafetyComplianceValidator.Z();
                break block38;
            }
            try {
                if (n3 != 0) {
                    this.t.E(n3);
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw SafetyComplianceValidator.b(compilationDiagnosticException);
            }
        }
    }

    private void Y(DatabaseStatementHandler databaseStatementHandler) throws CompilationDiagnosticException {
        int n;
        int n2;
        DatabaseStatementHandler databaseStatementHandler2;
        DatabaseStatementHandler databaseStatementHandler3;
        PersistenceRecord persistenceRecord;
        List<Integer> list;
        List<Integer> list2;
        block16: {
            block17: {
                list2 = this.z;
                list = this.w;
                this.z = new ArrayList<Integer>();
                this.w = new ArrayList<Integer>();
                DatabaseStatementHandler databaseStatementHandler4 = (DatabaseStatementHandler)databaseStatementHandler.l();
                eF eF2 = databaseStatementHandler.n();
                persistenceRecord = eF2.l();
                eF2 = eF2.n();
                databaseStatementHandler3 = (DatabaseStatementHandler)eF2.l();
                databaseStatementHandler2 = (DatabaseStatementHandler)eF2.n();
                try {
                    if (databaseStatementHandler4 != null) {
                        databaseStatementHandler4.z(this);
                    }
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                }
                n2 = this.t.H();
                n = 0;
                try {
                    try {
                        if (persistenceRecord == null) break block16;
                        if (!this.Y(false, persistenceRecord)) break block17;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                    }
                    this.w = list;
                    this.z = list2;
                    this.m = false;
                    return;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                }
            }
            n = this.t.H();
            this.t.m(0);
        }
        try {
            if (databaseStatementHandler2 != null) {
                databaseStatementHandler2.z(this);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw SafetyComplianceValidator.b(compilationDiagnosticException);
        }
        int n3 = this.t.H();
        try {
            if (databaseStatementHandler3 != null) {
                databaseStatementHandler3.z(this);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw SafetyComplianceValidator.b(compilationDiagnosticException);
        }
        this.t.E(167);
        this.t.m(n2 - this.t.H() + 1);
        int n4 = this.t.H();
        try {
            if (persistenceRecord != null) {
                this.t.Q(n, n4 - n + 1);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw SafetyComplianceValidator.b(compilationDiagnosticException);
        }
        this.R(this.z, n4);
        this.R(this.w, n3);
        this.w = list;
        this.z = list2;
        this.m = false;
    }

    @Override
    public void T(TransmissionPayload transmissionPayload) throws CompilationDiagnosticException {
        SafetyComplianceValidator.Z();
    }

    public void X(MetadataExtractionEngine metadataExtractionEngine) {
        this.X = metadataExtractionEngine;
    }

    /*
     * Exception decompiling
     */
    protected static int x(int var0, int var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 2[SWITCH]
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

    public int H() {
        return this.t.D();
    }

    protected void v(CryptographicPrimitiveManager cryptographicPrimitiveManager, int n, PersistenceRecord persistenceRecord, int n2, int n3, String string) throws CompilationDiagnosticException {
        block27: {
            block23: {
                block25: {
                    block22: {
                        try {
                            try {
                                try {
                                    if (n != 354 || n3 != 0) break block22;
                                }
                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                }
                                if (n2 != 307) break block22;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                            }
                            this.Q(cryptographicPrimitiveManager, n2, n3, string, persistenceRecord);
                            break block23;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                        }
                    }
                    try {
                        block24: {
                            try {
                                try {
                                    persistenceRecord.z(this);
                                    if (this.Q(this.P, this.C, this.o, n2, n3, string, false)) break block24;
                                    if (n == 61) break block25;
                                }
                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                }
                                if (n3 <= 0) break block25;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                            }
                        }
                        SafetyComplianceValidator.K(cryptographicPrimitiveManager);
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                    }
                }
                if (n != 61) {
                    int n4 = u[n - 351];
                    int n5 = SafetyComplianceValidator.R(n4);
                    try {
                        if (n5 < 0) {
                            SafetyComplianceValidator.Z();
                        }
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                    }
                    this.h(cryptographicPrimitiveManager, n4, n5, n2);
                }
            }
            try {
                block26: {
                    try {
                        try {
                            if (n != 61) break block26;
                            if (n3 != 0) break block27;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw SafetyComplianceValidator.b(compilationDiagnosticException);
                        }
                        if (SafetyComplianceValidator.V(n2)) break block27;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                    }
                }
                this.p(this.P, n2);
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw SafetyComplianceValidator.b(compilationDiagnosticException);
            }
        }
    }

    private static int D(List<Integer> list) {
        int n;
        try {
            n = list == null ? 0 : list.size();
        }
        catch (CustomSystemException customSystemException) {
            throw SafetyComplianceValidator.b(customSystemException);
        }
        return n;
    }

    private int i(PersistenceRecord persistenceRecord, int n, List<Integer> list) throws CompilationDiagnosticException {
        this.D(persistenceRecord);
        persistenceRecord = MetadataExtractionEngine.h(persistenceRecord);
        if (persistenceRecord instanceof SerializableLogEntry) {
            String string = ((SerializableLogEntry)persistenceRecord).t();
            this.t.B(n);
            this.t.r(string);
            this.t.J("java/lang/String", "equals", "(Ljava/lang/Object;)Z");
            this.t.E(153);
            Integer n2 = this.t.H();
            this.t.m(0);
            list.add(n2);
            return string.hashCode();
        }
        throw new CompilationDiagnosticException("bad case label");
    }

    @Override
    public void I(PersistenceDescriptor persistenceDescriptor) throws CompilationDiagnosticException {
        block21: {
            int n = persistenceDescriptor.I();
            int n2 = SafetyComplianceValidator.R(n);
            if (n2 >= 0) {
                int n3;
                block19: {
                    persistenceDescriptor.R().z(this);
                    PersistenceRecord persistenceRecord = persistenceDescriptor.V();
                    try {
                        if (persistenceRecord == null) {
                            return;
                        }
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                    }
                    n3 = this.P;
                    int n4 = this.C;
                    String string = this.o;
                    try {
                        persistenceRecord.z(this);
                        if (n4 != this.C) {
                            throw new CompilationDiagnosticException("incompatible array types");
                        }
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                    }
                    try {
                        block20: {
                            try {
                                try {
                                    try {
                                        if (n != 43 || n4 != 0) break block19;
                                    }
                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                    }
                                    if (n3 == 307) break block20;
                                }
                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                                }
                                if (this.P != 307) break block19;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw SafetyComplianceValidator.b(compilationDiagnosticException);
                            }
                        }
                        this.o(persistenceDescriptor, n3, n4, string);
                        break block21;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw SafetyComplianceValidator.b(compilationDiagnosticException);
                    }
                }
                this.h(persistenceDescriptor, n, n2, n3);
            } else {
                try {
                    if (!this.t(true, persistenceDescriptor)) {
                        this.t.m(7);
                        this.t.a(0);
                        this.t.E(167);
                        this.t.m(4);
                    }
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw SafetyComplianceValidator.b(compilationDiagnosticException);
                }
                this.t.a(1);
            }
        }
    }

    private void Q(CryptographicPrimitiveManager cryptographicPrimitiveManager, int n, int n2, String string, PersistenceRecord persistenceRecord) throws CompilationDiagnosticException {
        long l = d ^ 0x1067C418AD3DL;
        try {
            if (!"java/lang/String".equals(string)) {
                SafetyComplianceValidator.K(cryptographicPrimitiveManager);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw SafetyComplianceValidator.b(compilationDiagnosticException);
        }
        this.L(n, n2);
        persistenceRecord.z(this);
        this.L(this.P, this.C);
        this.t.J("java.lang.String", "concat", "(Ljava/lang/String;)Ljava/lang/String;");
        this.P = (int)SafetyComplianceValidator.a("j", (int)19460, (long)(0x4A02AEF4C0C75772L ^ l));
        this.C = 0;
        this.o = "java/lang/String";
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(SafetyComplianceValidator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

