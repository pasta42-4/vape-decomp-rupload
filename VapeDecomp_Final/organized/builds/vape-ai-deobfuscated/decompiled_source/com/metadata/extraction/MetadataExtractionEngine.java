/*
 * Decompiled with CFR 0.152.
 */
package com.metadata.extraction;

import a.eF;
import com.app.core.config.ConfigurationManager2183;
import com.app.security.crypto.CryptographicPrimitiveManager;
import com.bytecode.analysis.BytecodeAnnotationExtractor;
import com.bytecode.analysis.BytecodeInspectionEngine;
import com.collections.management.MultiContainerRegistry;
import com.communication.remote.RemoteConnectionDescriptor;
import com.configuration.management.ConfigurationOrchestrator2115;
import com.core.exception.CustomRuntimeException;
import com.data.persistence.PersistenceManagerAdapter;
import com.data.persistence.PersistenceRecord;
import com.data.processing.MultiOperationProcessor;
import com.data.serialization.PersistenceDescriptor;
import com.data.serialization.SerializationContext;
import com.data.versioning.VersionedDataContainer;
import com.event.orchestration.DeclarativeEventOrchestrator;
import com.exception.system.CustomSystemException;
import com.logging.audit.AuditTrailLogger;
import com.logging.core.SerializableLogEntry;
import com.network.messaging.TransmissionPayload;
import com.numeric.processing.NumericTransformationUtility;
import com.operations.bitwise.BitwiseOperationInterface;
import com.reflection.analysis.TypeInspectionUtility1890;
import com.reflection.management.ClassPoolRegistry;
import com.reflection.registry.MetaclassDefinitionRegistry;
import com.reflection.utils.TypeInspectionUtility;
import com.reverse.engineering.DecompilationAnalyzer;
import com.security.tokens.SerializableIdentityToken;
import com.security.transform.SecureDataTransformer1124;
import com.serialization.persistence.PersistentSerializationDescriptor;
import com.serialization.security.SerializationSecurityManager;
import com.system.compilation.CompilationDiagnosticException;
import com.system.validation.SafetyComplianceValidator;
import com.transaction.management.TransactionStrategyResolver;
import com.util.reflection.ReflectionFieldResolver;
import com.util.serialization.SerializationUtility;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class MetadataExtractionEngine
extends MultiOperationProcessor
implements TransactionStrategyResolver,
BitwiseOperationInterface {
    private static final long[] d;
    protected int j;
    private static final long c;
    private static final Integer[] f;
    protected TypeInspectionUtility M;
    private static final Map g;
    protected String w;
    protected MetaclassDefinitionRegistry e;
    protected BytecodeInspectionEngine Y;
    protected int P;

    private static Exception b(Exception exception) {
        return exception;
    }

    public void c(CryptographicPrimitiveManager cryptographicPrimitiveManager) throws CompilationDiagnosticException {
        long l = c ^ 0x548219E0BC29L;
        try {
            cryptographicPrimitiveManager.R().z(this);
            if (this.P == 0) {
                throw new ReflectionFieldResolver("length", cryptographicPrimitiveManager);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw MetadataExtractionEngine.b(compilationDiagnosticException);
        }
        this.j = (int)MetadataExtractionEngine.a("p", (int)26409, (long)(0x66DF55798FBB2A68L ^ l));
        this.P = 0;
    }

    protected void H(int n, eF eF2, eF eF3) throws CompilationDiagnosticException {
        int n2 = eF3.U();
        int n3 = 0;
        while (eF3 != null) {
            PersistenceRecord persistenceRecord = eF3.l();
            try {
                if (persistenceRecord == null) {
                    break;
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw MetadataExtractionEngine.b(compilationDiagnosticException);
            }
            ++n3;
            persistenceRecord.z(this);
            eF3 = eF3.n();
        }
        try {
            this.j = n;
            this.P = n2;
            this.w = n == 307 ? this.d(eF2) : null;
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw MetadataExtractionEngine.b(compilationDiagnosticException);
        }
    }

    @Override
    public void s(SecureDataTransformer1124 secureDataTransformer1124) throws CompilationDiagnosticException {
        String string = this.d(secureDataTransformer1124.l());
        secureDataTransformer1124.m().z(this);
        this.j = secureDataTransformer1124.A();
        this.P = secureDataTransformer1124.P();
        this.w = string;
    }

    public void w(CryptographicPrimitiveManager cryptographicPrimitiveManager) throws CompilationDiagnosticException {
        long l = c ^ 0x54EF4709FEA6L;
        this.j = (int)MetadataExtractionEngine.a("p", (int)9591, (long)(0xB43B37BD26EAAB8L ^ l));
        this.P = 0;
        this.w = "java/lang/Class";
    }

    private void E(CryptographicPrimitiveManager cryptographicPrimitiveManager, int n, RemoteConnectionDescriptor remoteConnectionDescriptor, DeclarativeEventOrchestrator declarativeEventOrchestrator, PersistenceRecord persistenceRecord) throws CompilationDiagnosticException {
        int n2 = declarativeEventOrchestrator.S();
        int n3 = declarativeEventOrchestrator.N();
        String string = declarativeEventOrchestrator.u();
        try {
            if (n != 61) {
                this.G(remoteConnectionDescriptor);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw MetadataExtractionEngine.b(compilationDiagnosticException);
        }
        persistenceRecord.z(this);
        this.j = n2;
        this.P = n3;
        this.w = string;
    }

    private boolean q(CryptographicPrimitiveManager cryptographicPrimitiveManager, int n, PersistenceRecord persistenceRecord) {
        block10: {
            if ((persistenceRecord = MetadataExtractionEngine.h(persistenceRecord)) instanceof VersionedDataContainer) {
                VersionedDataContainer versionedDataContainer = (VersionedDataContainer)persistenceRecord;
                long l = versionedDataContainer.B();
                if (n == 45) {
                    l = -l;
                } else if (n == 126) {
                    l ^= 0xFFFFFFFFFFFFFFFFL;
                } else {
                    return false;
                }
                versionedDataContainer.N(l);
            } else {
                if (persistenceRecord instanceof NumericTransformationUtility) {
                    block9: {
                        NumericTransformationUtility numericTransformationUtility = (NumericTransformationUtility)persistenceRecord;
                        try {
                            if (n != 45) break block9;
                            numericTransformationUtility.f(-numericTransformationUtility.L());
                            break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw MetadataExtractionEngine.b(customSystemException);
                        }
                    }
                    return false;
                }
                return false;
            }
        }
        cryptographicPrimitiveManager.U(43);
        return true;
    }

    private void d(DecompilationAnalyzer decompilationAnalyzer) throws CompilationDiagnosticException {
        BytecodeAnnotationExtractor bytecodeAnnotationExtractor = decompilationAnalyzer.b();
        String string = bytecodeAnnotationExtractor.S();
        int n = 0;
        int n2 = 0;
        char c = string.charAt(n);
        while (c == '[') {
            ++n2;
            c = string.charAt(++n);
        }
        try {
            this.P = n2;
            this.j = TypeInspectionUtility.y(c);
            this.w = c == 'L' ? string.substring(n + 1, string.indexOf(59, n + 1)) : null;
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw MetadataExtractionEngine.b(compilationDiagnosticException);
        }
    }

    static PersistenceRecord h(PersistenceRecord persistenceRecord) {
        block18: {
            if (persistenceRecord instanceof PersistenceDescriptor) {
                PersistenceDescriptor persistenceDescriptor = (PersistenceDescriptor)persistenceRecord;
                try {
                    try {
                        if (persistenceDescriptor.I() != 43 || persistenceDescriptor.V() != null) break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MetadataExtractionEngine.b(customSystemException);
                    }
                    return persistenceDescriptor.Z();
                }
                catch (CustomSystemException customSystemException) {
                    throw MetadataExtractionEngine.b(customSystemException);
                }
            }
            if (persistenceRecord instanceof CryptographicPrimitiveManager) {
                CryptographicPrimitiveManager cryptographicPrimitiveManager = (CryptographicPrimitiveManager)persistenceRecord;
                int n = cryptographicPrimitiveManager.I();
                if (n == 35) {
                    PersistenceRecord persistenceRecord2 = MetadataExtractionEngine.V((SerializationContext)cryptographicPrimitiveManager.V());
                    try {
                        if (persistenceRecord2 != null) {
                            return persistenceRecord2;
                        }
                        break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MetadataExtractionEngine.b(customSystemException);
                    }
                }
                try {
                    try {
                        if (n != 43 || cryptographicPrimitiveManager.u() != null) break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MetadataExtractionEngine.b(customSystemException);
                    }
                    return cryptographicPrimitiveManager.Z();
                }
                catch (CustomSystemException customSystemException) {
                    throw MetadataExtractionEngine.b(customSystemException);
                }
            }
            if (persistenceRecord instanceof SerializationContext) {
                PersistenceRecord persistenceRecord3 = MetadataExtractionEngine.V((SerializationContext)persistenceRecord);
                try {
                    if (persistenceRecord3 != null) {
                        return persistenceRecord3;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw MetadataExtractionEngine.b(customSystemException);
                }
            }
        }
        return persistenceRecord;
    }

    private static boolean h(PersistenceRecord persistenceRecord) {
        if (persistenceRecord instanceof PersistenceDescriptor) {
            boolean bl;
            PersistenceDescriptor persistenceDescriptor = (PersistenceDescriptor)persistenceRecord;
            int n = persistenceDescriptor.I();
            try {
                bl = n == 43;
            }
            catch (CustomSystemException customSystemException) {
                throw MetadataExtractionEngine.b(customSystemException);
            }
            return bl;
        }
        return false;
    }

    public void k(SerializationSecurityManager serializationSecurityManager) throws CompilationDiagnosticException {
        block11: {
            eF eF2;
            eF eF3;
            int n;
            block10: {
                n = serializationSecurityManager.q();
                eF3 = serializationSecurityManager.F();
                eF2 = serializationSecurityManager.b();
                SerializationUtility serializationUtility = serializationSecurityManager.Z();
                try {
                    if (serializationUtility != null) {
                        ((PersistenceRecord)serializationUtility).z(this);
                    }
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw MetadataExtractionEngine.b(compilationDiagnosticException);
                }
                try {
                    if (eF3.U() <= 1) break block10;
                    this.H(n, eF2, eF3);
                    break block11;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw MetadataExtractionEngine.b(compilationDiagnosticException);
                }
            }
            PersistenceRecord persistenceRecord = eF3.l();
            try {
                if (persistenceRecord != null) {
                    persistenceRecord.z(this);
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw MetadataExtractionEngine.b(compilationDiagnosticException);
            }
            try {
                this.j = n;
                this.P = 1;
                this.w = n == 307 ? this.d(eF2) : null;
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw MetadataExtractionEngine.b(compilationDiagnosticException);
            }
        }
    }

    protected static void L() throws CompilationDiagnosticException {
        throw new CompilationDiagnosticException("fatal");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void s(CryptographicPrimitiveManager cryptographicPrimitiveManager) throws CompilationDiagnosticException {
        PersistenceRecord persistenceRecord;
        int n;
        long l;
        block34: {
            l = c ^ 0x2E2AF31F1CF7L;
            n = cryptographicPrimitiveManager.I();
            persistenceRecord = cryptographicPrimitiveManager.R();
            if (n == 46) {
                String string = ((TransmissionPayload)cryptographicPrimitiveManager.V()).e();
                try {
                    if (string.equals("length")) {
                        try {
                            this.c(cryptographicPrimitiveManager);
                            return;
                        }
                        catch (ReflectionFieldResolver reflectionFieldResolver) {
                            this.m(cryptographicPrimitiveManager);
                            return;
                        }
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw MetadataExtractionEngine.b(customSystemException);
                }
                try {
                    if (string.equals("class")) {
                        this.w(cryptographicPrimitiveManager);
                        return;
                    }
                }
                catch (ReflectionFieldResolver reflectionFieldResolver) {
                    throw MetadataExtractionEngine.b(reflectionFieldResolver);
                }
                this.m(cryptographicPrimitiveManager);
                return;
            }
            if (n == 35) {
                String string = ((TransmissionPayload)cryptographicPrimitiveManager.V()).e();
                try {
                    if (string.equals("class")) {
                        this.w(cryptographicPrimitiveManager);
                        return;
                    }
                }
                catch (ReflectionFieldResolver reflectionFieldResolver) {
                    throw MetadataExtractionEngine.b(reflectionFieldResolver);
                }
                this.m(cryptographicPrimitiveManager);
                return;
            }
            try {
                if (n == 65) {
                    this.j(persistenceRecord, cryptographicPrimitiveManager.V());
                    return;
                }
            }
            catch (ReflectionFieldResolver reflectionFieldResolver) {
                throw MetadataExtractionEngine.b(reflectionFieldResolver);
            }
            try {
                try {
                    if (n != 362 && n != 363) break block34;
                }
                catch (ReflectionFieldResolver reflectionFieldResolver) {
                    throw MetadataExtractionEngine.b(reflectionFieldResolver);
                }
                this.N(n, persistenceRecord, cryptographicPrimitiveManager);
                return;
            }
            catch (ReflectionFieldResolver reflectionFieldResolver) {
                throw MetadataExtractionEngine.b(reflectionFieldResolver);
            }
        }
        try {
            if (n == 33) {
                this.p(cryptographicPrimitiveManager);
                return;
            }
        }
        catch (ReflectionFieldResolver reflectionFieldResolver) {
            throw MetadataExtractionEngine.b(reflectionFieldResolver);
        }
        try {
            if (n == 67) {
                MetadataExtractionEngine.L();
                return;
            }
        }
        catch (ReflectionFieldResolver reflectionFieldResolver) {
            throw MetadataExtractionEngine.b(reflectionFieldResolver);
        }
        try {
            try {
                block35: {
                    try {
                        try {
                            persistenceRecord.z(this);
                            if (this.q(cryptographicPrimitiveManager, n, persistenceRecord)) return;
                            if (n == 45) break block35;
                        }
                        catch (ReflectionFieldResolver reflectionFieldResolver) {
                            throw MetadataExtractionEngine.b(reflectionFieldResolver);
                        }
                        if (n != 126) return;
                    }
                    catch (ReflectionFieldResolver reflectionFieldResolver) {
                        throw MetadataExtractionEngine.b(reflectionFieldResolver);
                    }
                }
                if (!SafetyComplianceValidator.q(this.j)) return;
            }
            catch (ReflectionFieldResolver reflectionFieldResolver) {
                throw MetadataExtractionEngine.b(reflectionFieldResolver);
            }
            this.j = (int)MetadataExtractionEngine.a("p", (int)26409, (long)(0x66DF2FD165448AB6L ^ l));
            return;
        }
        catch (ReflectionFieldResolver reflectionFieldResolver) {
            throw MetadataExtractionEngine.b(reflectionFieldResolver);
        }
    }

    @Override
    public void f(AuditTrailLogger auditTrailLogger) throws CompilationDiagnosticException {
        Object object;
        long l = c ^ 0x68B99156F717L;
        String string = null;
        MetaclassDefinitionRegistry metaclassDefinitionRegistry = null;
        PersistenceRecord persistenceRecord = auditTrailLogger.R();
        eF eF2 = (eF)auditTrailLogger.V();
        if (persistenceRecord instanceof SerializationContext) {
            string = ((SerializationContext)persistenceRecord).e();
            metaclassDefinitionRegistry = this.e;
        } else if (persistenceRecord instanceof SerializableIdentityToken) {
            string = "<init>";
            metaclassDefinitionRegistry = ((SerializableIdentityToken)persistenceRecord).X() == 336 ? TypeInspectionUtility.s(this.e) : this.e;
        } else if (persistenceRecord instanceof CryptographicPrimitiveManager) {
            object = (CryptographicPrimitiveManager)persistenceRecord;
            string = ((TransmissionPayload)((CryptographicPrimitiveManager)object).V()).e();
            int n = ((CryptographicPrimitiveManager)object).I();
            if (n == 35) {
                metaclassDefinitionRegistry = this.M.g(((TransmissionPayload)((CryptographicPrimitiveManager)object).R()).e(), false);
            } else if (n == 46) {
                PersistenceRecord persistenceRecord2 = ((CryptographicPrimitiveManager)object).R();
                String string2 = MetadataExtractionEngine.g(persistenceRecord2);
                if (string2 != null) {
                    metaclassDefinitionRegistry = TypeInspectionUtility.t(this.e, string2);
                } else {
                    try {
                        persistenceRecord2.z(this);
                    }
                    catch (ReflectionFieldResolver reflectionFieldResolver) {
                        try {
                            if (reflectionFieldResolver.l() != persistenceRecord2) {
                                throw reflectionFieldResolver;
                            }
                        }
                        catch (ReflectionFieldResolver reflectionFieldResolver2) {
                            throw MetadataExtractionEngine.b(reflectionFieldResolver2);
                        }
                        this.j = (int)MetadataExtractionEngine.a("p", (int)9591, (long)(0xB438F2D0431A309L ^ l));
                        this.P = 0;
                        this.w = reflectionFieldResolver.Y();
                        ((CryptographicPrimitiveManager)object).U(35);
                        ((CryptographicPrimitiveManager)object).P(new TransmissionPayload(TypeInspectionUtility.M(this.w)));
                    }
                    if (this.P > 0) {
                        metaclassDefinitionRegistry = this.M.g("java.lang.Object", true);
                    } else if (this.j == 307) {
                        metaclassDefinitionRegistry = this.M.w(this.w);
                    } else {
                        MetadataExtractionEngine.x();
                    }
                }
            } else {
                MetadataExtractionEngine.x();
            }
        } else {
            MetadataExtractionEngine.L();
        }
        object = this.U(metaclassDefinitionRegistry, string, eF2);
        auditTrailLogger.M((ConfigurationManager2183)object);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = MetadataExtractionEngine.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private DecompilationAnalyzer s(CryptographicPrimitiveManager cryptographicPrimitiveManager, String string) throws CompilationDiagnosticException {
        SerializationContext serializationContext = (SerializationContext)cryptographicPrimitiveManager.V();
        DecompilationAnalyzer decompilationAnalyzer = this.M.G(string, serializationContext, cryptographicPrimitiveManager);
        cryptographicPrimitiveManager.U(35);
        cryptographicPrimitiveManager.P(new TransmissionPayload(TypeInspectionUtility.M(string)));
        serializationContext.Q(decompilationAnalyzer);
        return decompilationAnalyzer;
    }

    @Override
    public void f(VersionedDataContainer versionedDataContainer) throws CompilationDiagnosticException {
        block9: {
            long l;
            block6: {
                int n;
                block8: {
                    block7: {
                        l = c ^ 0x48F1F718FC5AL;
                        this.P = 0;
                        int n2 = versionedDataContainer.o();
                        try {
                            try {
                                try {
                                    if (n2 != 402 && n2 != 401) break block6;
                                }
                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                    throw MetadataExtractionEngine.b(compilationDiagnosticException);
                                }
                                MetadataExtractionEngine metadataExtractionEngine = this;
                                if (n2 != 402) break block7;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw MetadataExtractionEngine.b(compilationDiagnosticException);
                            }
                            n = 324;
                            break block8;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw MetadataExtractionEngine.b(compilationDiagnosticException);
                        }
                    }
                    n = 306;
                }
                metadataExtractionEngine.j = n;
                break block9;
            }
            this.j = (int)MetadataExtractionEngine.a("p", (int)27899, (long)(0x119FE56A723561CBL ^ l));
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void I(PersistenceDescriptor persistenceDescriptor) throws CompilationDiagnosticException {
        block4: {
            int n;
            block5: {
                n = persistenceDescriptor.I();
                int n2 = SafetyComplianceValidator.R(n);
                try {
                    if (n2 < 0) break block4;
                    if (n != 43) break block5;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw MetadataExtractionEngine.b(compilationDiagnosticException);
                }
                CryptographicPrimitiveManager cryptographicPrimitiveManager = this.S(persistenceDescriptor);
                if (cryptographicPrimitiveManager == null) return;
                cryptographicPrimitiveManager = AuditTrailLogger.e(CryptographicPrimitiveManager.n(46, cryptographicPrimitiveManager, new SerializationContext("toString")), null);
                persistenceDescriptor.P(cryptographicPrimitiveManager);
                persistenceDescriptor.Z(null);
                this.w = "java/lang/String";
                return;
            }
            PersistenceRecord persistenceRecord = persistenceDescriptor.R();
            PersistenceRecord persistenceRecord2 = persistenceDescriptor.V();
            persistenceRecord.z(this);
            int n3 = this.j;
            try {
                persistenceRecord2.z(this);
                if (this.g(persistenceDescriptor, n, persistenceRecord, persistenceRecord2)) return;
                this.L(persistenceDescriptor, n, n3);
                return;
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw MetadataExtractionEngine.b(compilationDiagnosticException);
            }
        }
        this.p(persistenceDescriptor);
    }

    @Override
    public void z(SerializableLogEntry serializableLogEntry) throws CompilationDiagnosticException {
        long l = c ^ 0x7BF484265B21L;
        this.j = (int)MetadataExtractionEngine.a("p", (int)9591, (long)(0xB439C6011410F3FL ^ l));
        this.P = 0;
        this.w = "java/lang/String";
    }

    protected static String Y(int[] nArray, int[] nArray2, String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('(');
        int n = nArray.length;
        if (n > 0) {
            int n2 = 0;
            try {
                while (true) {
                    MetadataExtractionEngine.y(stringBuilder, nArray[n2], nArray2[n2], stringArray[n2]);
                    if (++n2 < n) {
                        stringBuilder.append(',');
                        continue;
                    }
                    break;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw MetadataExtractionEngine.b(customSystemException);
            }
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public ConfigurationManager2183 U(MetaclassDefinitionRegistry metaclassDefinitionRegistry, String string, eF eF2) throws CompilationDiagnosticException {
        int n = this.c(eF2);
        int[] nArray = new int[n];
        int[] nArray2 = new int[n];
        String[] stringArray = new String[n];
        this.e(eF2, nArray, nArray2, stringArray);
        ConfigurationManager2183 configurationManager2183 = this.M.s(metaclassDefinitionRegistry, this.e, this.Y, string, nArray, nArray2, stringArray);
        if (configurationManager2183 == null) {
            String string2 = metaclassDefinitionRegistry.H();
            String string3 = MetadataExtractionEngine.Y(nArray, nArray2, stringArray);
            String string4 = string.equals("<init>") ? "cannot find constructor " + string2 + string3 : string + string3 + " not found in " + string2;
            throw new CompilationDiagnosticException(string4);
        }
        String string5 = configurationManager2183.o.b();
        this.k(string5);
        return configurationManager2183;
    }

    protected void f(PersistenceRecord persistenceRecord) throws CompilationDiagnosticException {
        block9: {
            long l = c ^ 0x21B89D7FC164L;
            DecompilationAnalyzer decompilationAnalyzer = this.e(persistenceRecord);
            this.d(decompilationAnalyzer);
            int n = this.j;
            try {
                block8: {
                    try {
                        try {
                            try {
                                if (n == 324 || n == 303) break block8;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw MetadataExtractionEngine.b(compilationDiagnosticException);
                            }
                            if (n == 306) break block8;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw MetadataExtractionEngine.b(compilationDiagnosticException);
                        }
                        if (n != 334) break block9;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw MetadataExtractionEngine.b(compilationDiagnosticException);
                    }
                }
                this.j = (int)MetadataExtractionEngine.a("p", (int)26409, (long)(0x66DF20430B245725L ^ l));
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw MetadataExtractionEngine.b(compilationDiagnosticException);
            }
        }
    }

    static String g(PersistenceRecord persistenceRecord) {
        block5: {
            CryptographicPrimitiveManager cryptographicPrimitiveManager;
            if (persistenceRecord instanceof CryptographicPrimitiveManager && (cryptographicPrimitiveManager = (CryptographicPrimitiveManager)persistenceRecord).I() == 46) {
                PersistenceRecord persistenceRecord2 = cryptographicPrimitiveManager.V();
                try {
                    try {
                        if (!(persistenceRecord2 instanceof SerializableIdentityToken) || ((SerializableIdentityToken)persistenceRecord2).X() != 336) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MetadataExtractionEngine.b(customSystemException);
                    }
                    return ((TransmissionPayload)cryptographicPrimitiveManager.R()).e();
                }
                catch (CustomSystemException customSystemException) {
                    throw MetadataExtractionEngine.b(customSystemException);
                }
            }
        }
        return null;
    }

    private void u(PersistenceDescriptor persistenceDescriptor, int n, int n2) throws CompilationDiagnosticException {
        block3: {
            block2: {
                try {
                    if (!SafetyComplianceValidator.d(n, n2)) break block2;
                    persistenceDescriptor.M(new SecureDataTransformer1124(n2, 0, persistenceDescriptor.R()));
                    break block3;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw MetadataExtractionEngine.b(compilationDiagnosticException);
                }
            }
            this.j = n;
        }
    }

    private void L(PersistenceDescriptor persistenceDescriptor, int n, int n2) throws CompilationDiagnosticException {
        block13: {
            long l;
            block12: {
                int n3;
                block11: {
                    l = c ^ 0x7F45F655AF08L;
                    n3 = this.j;
                    try {
                        block10: {
                            try {
                                try {
                                    if (n == 364 || n == 366) break block10;
                                }
                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                    throw MetadataExtractionEngine.b(compilationDiagnosticException);
                                }
                                if (n != 370) break block11;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw MetadataExtractionEngine.b(compilationDiagnosticException);
                            }
                        }
                        this.j = n2;
                        break block12;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw MetadataExtractionEngine.b(compilationDiagnosticException);
                    }
                }
                this.u(persistenceDescriptor, n2, n3);
            }
            try {
                try {
                    if (!SafetyComplianceValidator.q(this.j) || this.j == 301) break block13;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw MetadataExtractionEngine.b(compilationDiagnosticException);
                }
                this.j = (int)MetadataExtractionEngine.a("p", (int)2792, (long)(0x7970DF26420B548BL ^ l));
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw MetadataExtractionEngine.b(compilationDiagnosticException);
            }
        }
    }

    void k(String string) throws CompilationDiagnosticException {
        long l = c ^ 0x490A6250EE66L;
        int n = string.indexOf(41);
        try {
            if (n < 0) {
                MetadataExtractionEngine.x();
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw MetadataExtractionEngine.b(compilationDiagnosticException);
        }
        char c = string.charAt(++n);
        int n2 = 0;
        while (c == '[') {
            ++n2;
            c = string.charAt(++n);
        }
        this.P = n2;
        if (c == 'L') {
            int n3 = string.indexOf(59, n + 1);
            try {
                if (n3 < 0) {
                    MetadataExtractionEngine.x();
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw MetadataExtractionEngine.b(compilationDiagnosticException);
            }
            this.j = (int)MetadataExtractionEngine.a("p", (int)9591, (long)(0xB43AE9EF737BA78L ^ l));
            this.w = string.substring(n + 1, n3);
        } else {
            this.j = TypeInspectionUtility.y(c);
            this.w = null;
        }
    }

    private static void x() throws CompilationDiagnosticException {
        throw new CompilationDiagnosticException("bad method");
    }

    @Override
    public void B(TypeInspectionUtility1890 typeInspectionUtility1890) throws CompilationDiagnosticException {
        long l = c ^ 0x3D2502105604L;
        typeInspectionUtility1890.m().z(this);
        this.j = (int)MetadataExtractionEngine.a("p", (int)17083, (long)(0x72448EABA3F865D1L ^ l));
        this.P = 0;
    }

    protected String y() throws CompilationDiagnosticException {
        return TypeInspectionUtility.i(TypeInspectionUtility.s(this.e).H());
    }

    @Override
    public void Q(NumericTransformationUtility numericTransformationUtility) throws CompilationDiagnosticException {
        long l = c ^ 0x3D5C4DED8854L;
        try {
            this.P = 0;
            this.j = numericTransformationUtility.w() == 405 ? (int)MetadataExtractionEngine.a("p", (int)6455, (long)(0x3CB7C435C546E00CL ^ l)) : (int)MetadataExtractionEngine.a("p", (int)28694, (long)(0x25EECA8AAEDE8921L ^ l));
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw MetadataExtractionEngine.b(compilationDiagnosticException);
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/aK" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void N(int n, PersistenceRecord persistenceRecord, CryptographicPrimitiveManager cryptographicPrimitiveManager) throws CompilationDiagnosticException {
        boolean bl;
        long l = c ^ 0x187B30D6927L;
        try {
            boolean bl2 = bl = persistenceRecord == null;
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw MetadataExtractionEngine.b(compilationDiagnosticException);
        }
        if (bl) {
            persistenceRecord = cryptographicPrimitiveManager.V();
        }
        if (persistenceRecord instanceof RemoteConnectionDescriptor) {
            DeclarativeEventOrchestrator declarativeEventOrchestrator = ((RemoteConnectionDescriptor)persistenceRecord).K();
            this.j = declarativeEventOrchestrator.S();
            this.P = declarativeEventOrchestrator.N();
        } else {
            CryptographicPrimitiveManager cryptographicPrimitiveManager2;
            if (persistenceRecord instanceof CryptographicPrimitiveManager && (cryptographicPrimitiveManager2 = (CryptographicPrimitiveManager)persistenceRecord).I() == 65) {
                block15: {
                    this.j(cryptographicPrimitiveManager2.R(), cryptographicPrimitiveManager2.V());
                    int n2 = this.j;
                    try {
                        block14: {
                            try {
                                try {
                                    try {
                                        if (n2 == 324 || n2 == 303) break block14;
                                    }
                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                        throw MetadataExtractionEngine.b(compilationDiagnosticException);
                                    }
                                    if (n2 == 306) break block14;
                                }
                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                    throw MetadataExtractionEngine.b(compilationDiagnosticException);
                                }
                                if (n2 != 334) break block15;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw MetadataExtractionEngine.b(compilationDiagnosticException);
                            }
                        }
                        this.j = (int)MetadataExtractionEngine.a("p", (int)26409, (long)(0x66DF007C2556FF66L ^ l));
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw MetadataExtractionEngine.b(compilationDiagnosticException);
                    }
                }
                return;
            }
            this.f(persistenceRecord);
        }
    }

    private CryptographicPrimitiveManager S(PersistenceDescriptor persistenceDescriptor) throws CompilationDiagnosticException {
        int n;
        block23: {
            PersistenceRecord persistenceRecord;
            PersistenceRecord persistenceRecord2;
            long l;
            block22: {
                block20: {
                    l = c ^ 0xA481328BE1FL;
                    persistenceRecord2 = persistenceDescriptor.R();
                    persistenceRecord = persistenceDescriptor.V();
                    try {
                        if (persistenceRecord == null) {
                            persistenceRecord2.z(this);
                            return null;
                        }
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw MetadataExtractionEngine.b(compilationDiagnosticException);
                    }
                    if (MetadataExtractionEngine.h(persistenceRecord2)) {
                        CryptographicPrimitiveManager cryptographicPrimitiveManager = this.S((PersistenceDescriptor)persistenceRecord2);
                        try {
                            if (cryptographicPrimitiveManager != null) {
                                persistenceRecord.z(this);
                                this.j = (int)MetadataExtractionEngine.a("p", (int)9591, (long)(0xB43EDDC864FEA01L ^ l));
                                this.P = 0;
                                this.w = "java/lang/StringBuffer";
                                return MetadataExtractionEngine.F(cryptographicPrimitiveManager, persistenceRecord);
                            }
                            break block20;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw MetadataExtractionEngine.b(compilationDiagnosticException);
                        }
                    }
                    persistenceRecord2.z(this);
                }
                n = this.j;
                int n2 = this.P;
                String string = this.w;
                try {
                    persistenceRecord.z(this);
                    if (this.g(persistenceDescriptor, 43, persistenceRecord2, persistenceRecord)) {
                        return null;
                    }
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw MetadataExtractionEngine.b(compilationDiagnosticException);
                }
                try {
                    try {
                        try {
                            block21: {
                                try {
                                    try {
                                        if (n != 307 || n2 != 0) break block21;
                                    }
                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                        throw MetadataExtractionEngine.b(compilationDiagnosticException);
                                    }
                                    if ("java/lang/String".equals(string)) break block22;
                                }
                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                    throw MetadataExtractionEngine.b(compilationDiagnosticException);
                                }
                            }
                            if (this.j != 307) break block23;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw MetadataExtractionEngine.b(compilationDiagnosticException);
                        }
                        if (this.P != 0) break block23;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw MetadataExtractionEngine.b(compilationDiagnosticException);
                    }
                    if (!"java/lang/String".equals(this.w)) break block23;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw MetadataExtractionEngine.b(compilationDiagnosticException);
                }
            }
            eF eF2 = eF.q(new TransmissionPayload("java"), new TransmissionPayload("lang"), new TransmissionPayload("StringBuffer"));
            SerializationSecurityManager serializationSecurityManager = new SerializationSecurityManager(eF2, null);
            this.j = (int)MetadataExtractionEngine.a("p", (int)9591, (long)(0xB43EDDC864FEA01L ^ l));
            this.P = 0;
            this.w = "java/lang/StringBuffer";
            return MetadataExtractionEngine.F(MetadataExtractionEngine.F(serializationSecurityManager, persistenceRecord2), persistenceRecord);
        }
        this.L(persistenceDescriptor, 43, n);
        return null;
    }

    protected String w() {
        return TypeInspectionUtility.i(this.e.H());
    }

    private static PersistenceRecord V(SerializationContext serializationContext) {
        return MetadataExtractionEngine.H(serializationContext.L());
    }

    public MetadataExtractionEngine(MetaclassDefinitionRegistry metaclassDefinitionRegistry, ClassPoolRegistry classPoolRegistry) {
        this.M = new TypeInspectionUtility(classPoolRegistry);
        this.e = metaclassDefinitionRegistry;
        this.Y = null;
    }

    @Override
    public void J(SerializationContext serializationContext) throws CompilationDiagnosticException {
        this.m(serializationContext);
    }

    /*
     * Unable to fully structure code
     */
    private void p(PersistenceRecord var1_1) throws CompilationDiagnosticException {
        block11: {
            block12: {
                var2_2 = MetadataExtractionEngine.c ^ 7302812856881L;
                var4_3 = SafetyComplianceValidator.W(var1_1);
                if (var4_3 == 358) {
                    var5_4 = (PersistenceDescriptor)var1_1;
                    var5_4.R().z(this);
                    var6_6 = this.j;
                    var7_7 = this.P;
                    try {
                        try {
                            var5_4.V().z(this);
                            if (var7_7 != 0 || this.P != 0) ** GOTO lbl37
                        }
                        catch (CompilationDiagnosticException v0) {
                            throw MetadataExtractionEngine.b(v0);
                        }
                        this.u(var5_4, var6_6, this.j);
                    }
                    catch (CompilationDiagnosticException v1) {
                        throw MetadataExtractionEngine.b(v1);
                    }
                } else {
                    block10: {
                        try {
                            if (var4_3 != 33) break block10;
                            ((CryptographicPrimitiveManager)var1_1).R().z(this);
                            break block11;
                        }
                        catch (CompilationDiagnosticException v2) {
                            throw MetadataExtractionEngine.b(v2);
                        }
                    }
                    try {
                        if (var4_3 != 369 && var4_3 != 368) break block12;
                    }
                    catch (CompilationDiagnosticException v3) {
                        throw MetadataExtractionEngine.b(v3);
                    }
                    var5_5 = (PersistenceDescriptor)var1_1;
                    var5_5.R().z(this);
                    var5_5.V().z(this);
                }
                break block11;
            }
            var1_1.z(this);
        }
        this.j = (int)MetadataExtractionEngine.a("p", (int)12283, (long)(4425679731279506600L ^ var2_2));
        this.P = 0;
    }

    @Override
    public void J(PersistentSerializationDescriptor persistentSerializationDescriptor) throws CompilationDiagnosticException {
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
                    this.E(persistentSerializationDescriptor, n, (RemoteConnectionDescriptor)persistenceRecord2, ((RemoteConnectionDescriptor)persistenceRecord2).K(), persistenceRecord);
                    break block7;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw MetadataExtractionEngine.b(compilationDiagnosticException);
                }
            }
            if (persistenceRecord2 instanceof CryptographicPrimitiveManager) {
                CryptographicPrimitiveManager cryptographicPrimitiveManager = (CryptographicPrimitiveManager)persistenceRecord2;
                try {
                    if (cryptographicPrimitiveManager.I() == 65) {
                        this.j(persistentSerializationDescriptor, n, (CryptographicPrimitiveManager)persistenceRecord2, persistenceRecord);
                        return;
                    }
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw MetadataExtractionEngine.b(compilationDiagnosticException);
                }
            }
            this.Z(persistentSerializationDescriptor, n, persistenceRecord2, persistenceRecord);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                MetadataExtractionEngine.c = MultiContainerRegistry.a(-4283307170277961934L, 7213280170632861930L, MethodHandles.lookup().lookupClass()).a(233395770668124L);
                MetadataExtractionEngine.g = new HashMap<K, V>(13);
                var0 = MetadataExtractionEngine.c ^ 3059539429415L;
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
                var6_5 = "\u000e\u00c4\u0004\u0018Z\u00dcX\u00fc\u0083\r*\u00a4X\u00daHu\u00c2\u00ac\b|\u009a\u009b(3\u00b00\u0084\u00dd\u0003\u0085\u0014r\u009bb\u001cf\u00a9\u00d9\u00e6$\u000fx\u00c7Z\u00a7\u00cb\u00052\u00eb\u0098\u0096\u00db\u00ecK\u00de\u0087\u00ec\u009e\u0015\u009a+\u009d\u00b3\u00d8";
                var7_6 = "\u000e\u00c4\u0004\u0018Z\u00dcX\u00fc\u0083\r*\u00a4X\u00daHu\u00c2\u00ac\b|\u009a\u009b(3\u00b00\u0084\u00dd\u0003\u0085\u0014r\u009bb\u001cf\u00a9\u00d9\u00e6$\u000fx\u00c7Z\u00a7\u00cb\u00052\u00eb\u0098\u0096\u00db\u00ecK\u00de\u0087\u00ec\u009e\u0015\u009a+\u009d\u00b3\u00d8".length();
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
                    var6_5 = "\u00ec4\u00cb\u00df\u007ff\u00ff\u00ff\u00d7\u0088\u009d\u00abOA+\u0088";
                    var7_6 = "\u00ec4\u00cb\u00df\u007ff\u00ff\u00ff\u00d7\u0088\u009d\u00abOA+\u0088".length();
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
        MetadataExtractionEngine.d = var8_3;
        MetadataExtractionEngine.f = new Integer[10];
    }

    public void j(PersistenceRecord persistenceRecord, PersistenceRecord persistenceRecord2) throws CompilationDiagnosticException {
        persistenceRecord.z(this);
        int n = this.j;
        int n2 = this.P;
        String string = this.w;
        persistenceRecord2.z(this);
        this.j = n;
        this.P = n2 - 1;
        this.w = string;
    }

    @Override
    public void C(PersistenceManagerAdapter persistenceManagerAdapter) throws CompilationDiagnosticException {
        block9: {
            int n;
            block10: {
                this.p(persistenceManagerAdapter.s());
                persistenceManagerAdapter.x().z(this);
                n = this.j;
                int n2 = this.P;
                String string = this.w;
                try {
                    try {
                        try {
                            persistenceManagerAdapter.k().z(this);
                            if (n2 != 0 || n2 != this.P) break block9;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw MetadataExtractionEngine.b(compilationDiagnosticException);
                        }
                        if (!SafetyComplianceValidator.d(n, this.j)) break block10;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw MetadataExtractionEngine.b(compilationDiagnosticException);
                    }
                    persistenceManagerAdapter.B(new SecureDataTransformer1124(this.j, 0, persistenceManagerAdapter.x()));
                    break block9;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw MetadataExtractionEngine.b(compilationDiagnosticException);
                }
            }
            try {
                if (SafetyComplianceValidator.d(this.j, n)) {
                    persistenceManagerAdapter.R(new SecureDataTransformer1124(n, 0, persistenceManagerAdapter.k()));
                    this.j = n;
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw MetadataExtractionEngine.b(compilationDiagnosticException);
            }
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public void m(SerializableIdentityToken var1_1) throws CompilationDiagnosticException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SWITCH]
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

    protected String d(eF eF2) throws CompilationDiagnosticException {
        return this.M.t(eF2);
    }

    protected static StringBuilder y(StringBuilder stringBuilder, int n, int n2, String string) {
        String string2;
        if (n == 307) {
            string2 = TypeInspectionUtility.M(string);
        } else if (n == 412) {
            string2 = "Object";
        } else {
            try {
                string2 = TypeInspectionUtility.F(n);
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                string2 = "?";
            }
        }
        stringBuilder.append(string2);
        try {
            while (n2-- > 0) {
                stringBuilder.append("[]");
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw MetadataExtractionEngine.b(compilationDiagnosticException);
        }
        return stringBuilder;
    }

    public int c(eF eF2) {
        return eF.C(eF2);
    }

    public void e(eF eF2, int[] nArray, int[] nArray2, String[] stringArray) throws CompilationDiagnosticException {
        int n = 0;
        while (eF2 != null) {
            PersistenceRecord persistenceRecord = eF2.l();
            persistenceRecord.z(this);
            nArray[n] = this.j;
            nArray2[n] = this.P;
            stringArray[n] = this.w;
            ++n;
            eF2 = eF2.n();
        }
    }

    protected void Z(CryptographicPrimitiveManager cryptographicPrimitiveManager, int n, PersistenceRecord persistenceRecord, PersistenceRecord persistenceRecord2) throws CompilationDiagnosticException {
        DecompilationAnalyzer decompilationAnalyzer = this.e(persistenceRecord);
        this.d(decompilationAnalyzer);
        int n2 = this.j;
        int n3 = this.P;
        String string = this.w;
        persistenceRecord2.z(this);
        this.j = n2;
        this.P = n3;
        this.w = string;
    }

    private void m(PersistenceRecord persistenceRecord) throws CompilationDiagnosticException {
        this.d(this.e(persistenceRecord));
    }

    @Override
    public void J(SerializationUtility serializationUtility) throws CompilationDiagnosticException {
        for (eF eF2 = serializationUtility; eF2 != null; eF2 = eF2.n()) {
            PersistenceRecord persistenceRecord = eF2.l();
            try {
                if (persistenceRecord == null) continue;
                persistenceRecord.z(this);
                continue;
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw MetadataExtractionEngine.b(compilationDiagnosticException);
            }
        }
    }

    private static CryptographicPrimitiveManager F(PersistenceRecord persistenceRecord, PersistenceRecord persistenceRecord2) {
        return AuditTrailLogger.e(CryptographicPrimitiveManager.n(46, persistenceRecord, new SerializationContext("append")), new eF(persistenceRecord2));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected DecompilationAnalyzer e(PersistenceRecord persistenceRecord) throws CompilationDiagnosticException {
        if (persistenceRecord instanceof SerializationContext) {
            SerializationContext serializationContext = (SerializationContext)persistenceRecord;
            String string = serializationContext.e();
            try {
                DecompilationAnalyzer decompilationAnalyzer = this.e.t(string);
                try {
                    if (!ConfigurationOrchestrator2115.O(decompilationAnalyzer.A())) return decompilationAnalyzer;
                    serializationContext.Q(decompilationAnalyzer);
                    return decompilationAnalyzer;
                }
                catch (CustomRuntimeException customRuntimeException) {
                    throw MetadataExtractionEngine.b(customRuntimeException);
                }
            }
            catch (CustomRuntimeException customRuntimeException) {
                throw new ReflectionFieldResolver(string, persistenceRecord);
            }
        }
        if (!(persistenceRecord instanceof CryptographicPrimitiveManager)) throw new CompilationDiagnosticException("bad field access");
        CryptographicPrimitiveManager cryptographicPrimitiveManager = (CryptographicPrimitiveManager)persistenceRecord;
        int n = cryptographicPrimitiveManager.I();
        if (n == 35) {
            SerializationContext serializationContext = (SerializationContext)cryptographicPrimitiveManager.V();
            DecompilationAnalyzer decompilationAnalyzer = this.M.c(((TransmissionPayload)cryptographicPrimitiveManager.R()).e(), serializationContext);
            serializationContext.Q(decompilationAnalyzer);
            return decompilationAnalyzer;
        }
        try {
            if (n != 46) throw new CompilationDiagnosticException("bad field access");
            try {
                cryptographicPrimitiveManager.R().z(this);
            }
            catch (ReflectionFieldResolver reflectionFieldResolver) {
                try {
                    if (reflectionFieldResolver.l() == cryptographicPrimitiveManager.R()) return this.s(cryptographicPrimitiveManager, reflectionFieldResolver.Y());
                    throw reflectionFieldResolver;
                }
                catch (CustomRuntimeException customRuntimeException) {
                    throw MetadataExtractionEngine.b(customRuntimeException);
                }
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw MetadataExtractionEngine.b(customRuntimeException);
        }
        CompilationDiagnosticException compilationDiagnosticException = null;
        try {
            try {
                if (this.j == 307 && this.P == 0) {
                    return this.M.p(this.w, (TransmissionPayload)cryptographicPrimitiveManager.V());
                }
            }
            catch (CustomRuntimeException customRuntimeException) {
                throw MetadataExtractionEngine.b(customRuntimeException);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException2) {
            compilationDiagnosticException = compilationDiagnosticException2;
        }
        PersistenceRecord persistenceRecord2 = cryptographicPrimitiveManager.R();
        try {
            if (persistenceRecord2 instanceof TransmissionPayload) {
                return this.s(cryptographicPrimitiveManager, ((TransmissionPayload)persistenceRecord2).e());
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw MetadataExtractionEngine.b(customRuntimeException);
        }
        try {
            if (compilationDiagnosticException == null) throw new CompilationDiagnosticException("bad field access");
            throw compilationDiagnosticException;
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw MetadataExtractionEngine.b(customRuntimeException);
        }
    }

    @Override
    public void G(RemoteConnectionDescriptor remoteConnectionDescriptor) throws CompilationDiagnosticException {
        DeclarativeEventOrchestrator declarativeEventOrchestrator = remoteConnectionDescriptor.K();
        this.j = declarativeEventOrchestrator.S();
        this.P = declarativeEventOrchestrator.N();
        this.w = declarativeEventOrchestrator.u();
    }

    private boolean g(PersistenceDescriptor persistenceDescriptor, int n, PersistenceRecord persistenceRecord, PersistenceRecord persistenceRecord2) throws CompilationDiagnosticException {
        PersistenceRecord persistenceRecord3;
        block11: {
            block10: {
                persistenceRecord = MetadataExtractionEngine.h(persistenceRecord);
                persistenceRecord2 = MetadataExtractionEngine.h(persistenceRecord2);
                persistenceRecord3 = null;
                try {
                    try {
                        if (!(persistenceRecord instanceof SerializableLogEntry) || !(persistenceRecord2 instanceof SerializableLogEntry)) break block10;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw MetadataExtractionEngine.b(compilationDiagnosticException);
                    }
                    if (n != 43) break block10;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw MetadataExtractionEngine.b(compilationDiagnosticException);
                }
                persistenceRecord3 = new SerializableLogEntry(((SerializableLogEntry)persistenceRecord).t() + ((SerializableLogEntry)persistenceRecord2).t());
                break block11;
            }
            if (persistenceRecord instanceof VersionedDataContainer) {
                persistenceRecord3 = ((VersionedDataContainer)persistenceRecord).A(n, persistenceRecord2);
            } else if (persistenceRecord instanceof NumericTransformationUtility) {
                persistenceRecord3 = ((NumericTransformationUtility)persistenceRecord).s(n, persistenceRecord2);
            }
        }
        try {
            if (persistenceRecord3 == null) {
                return false;
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw MetadataExtractionEngine.b(compilationDiagnosticException);
        }
        persistenceDescriptor.U(43);
        persistenceDescriptor.P(persistenceRecord3);
        persistenceDescriptor.Z(null);
        persistenceRecord3.z(this);
        return true;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5A2A;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/aK", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            MetadataExtractionEngine.f[n2] = n3;
        }
        return f[n2];
    }

    private void j(CryptographicPrimitiveManager cryptographicPrimitiveManager, int n, CryptographicPrimitiveManager cryptographicPrimitiveManager2, PersistenceRecord persistenceRecord) throws CompilationDiagnosticException {
        this.j(cryptographicPrimitiveManager2.R(), cryptographicPrimitiveManager2.V());
        int n2 = this.j;
        int n3 = this.P;
        String string = this.w;
        persistenceRecord.z(this);
        this.j = n2;
        this.P = n3;
        this.w = string;
    }

    @Override
    public void K(SerializationSecurityManager serializationSecurityManager) throws CompilationDiagnosticException {
        block3: {
            long l;
            block2: {
                l = c ^ 0x5D15A2783F74L;
                try {
                    if (!serializationSecurityManager.b()) break block2;
                    this.k(serializationSecurityManager);
                    break block3;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw MetadataExtractionEngine.b(compilationDiagnosticException);
                }
            }
            MetaclassDefinitionRegistry metaclassDefinitionRegistry = this.M.V(serializationSecurityManager.b());
            String string = metaclassDefinitionRegistry.H();
            eF eF2 = serializationSecurityManager.N();
            this.U(metaclassDefinitionRegistry, "<init>", eF2);
            this.j = (int)MetadataExtractionEngine.a("p", (int)602, (long)(0x207E01560A34CC42L ^ l));
            this.P = 0;
            this.w = TypeInspectionUtility.i(string);
        }
    }

    public static PersistenceRecord H(DecompilationAnalyzer decompilationAnalyzer) {
        block29: {
            int n;
            SerializableIdentityToken serializableIdentityToken;
            SerializableIdentityToken serializableIdentityToken2;
            block31: {
                block30: {
                    Object object;
                    block26: {
                        int n2;
                        block28: {
                            block27: {
                                block23: {
                                    int n3;
                                    block25: {
                                        block24: {
                                            try {
                                                if (decompilationAnalyzer == null) {
                                                    return null;
                                                }
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw MetadataExtractionEngine.b(customSystemException);
                                            }
                                            object = decompilationAnalyzer.q();
                                            try {
                                                if (object == null) {
                                                    return null;
                                                }
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw MetadataExtractionEngine.b(customSystemException);
                                            }
                                            try {
                                                if (object instanceof String) {
                                                    return new SerializableLogEntry((String)object);
                                                }
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw MetadataExtractionEngine.b(customSystemException);
                                            }
                                            try {
                                                try {
                                                    try {
                                                        if (!(object instanceof Double) && !(object instanceof Float)) break block23;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw MetadataExtractionEngine.b(customSystemException);
                                                    }
                                                    if (!(object instanceof Double)) break block24;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw MetadataExtractionEngine.b(customSystemException);
                                                }
                                                n3 = 405;
                                                break block25;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw MetadataExtractionEngine.b(customSystemException);
                                            }
                                        }
                                        n3 = 404;
                                    }
                                    int n4 = n3;
                                    return new NumericTransformationUtility(((Number)object).doubleValue(), n4);
                                }
                                try {
                                    try {
                                        if (!(object instanceof Number)) break block26;
                                        if (!(object instanceof Long)) break block27;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw MetadataExtractionEngine.b(customSystemException);
                                    }
                                    n2 = 403;
                                    break block28;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw MetadataExtractionEngine.b(customSystemException);
                                }
                            }
                            n2 = 402;
                        }
                        int n5 = n2;
                        return new VersionedDataContainer(((Number)object).longValue(), n5);
                    }
                    try {
                        try {
                            SerializableIdentityToken serializableIdentityToken3;
                            if (!(object instanceof Boolean)) break block29;
                            serializableIdentityToken2 = serializableIdentityToken3;
                            serializableIdentityToken = serializableIdentityToken3;
                            if (!((Boolean)object).booleanValue()) break block30;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw MetadataExtractionEngine.b(customSystemException);
                        }
                        n = 410;
                        break block31;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MetadataExtractionEngine.b(customSystemException);
                    }
                }
                n = 411;
            }
            serializableIdentityToken2(n);
            return serializableIdentityToken;
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(MetadataExtractionEngine.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

