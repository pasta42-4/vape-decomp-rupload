/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.access;

import a.Nw;
import a.eF;
import com.app.core.config.ConfigurationManager2183;
import com.app.database.operations.DatabaseStatementHandler;
import com.app.security.crypto.CryptographicPrimitiveManager;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.bytecode.analysis.BytecodeAnnotationExtractor;
import com.bytecode.analysis.BytecodeInspectionEngine;
import com.collections.management.MultiContainerRegistry;
import com.configuration.management.ConfigurationOrchestrator2115;
import com.core.exception.CustomRuntimeException;
import com.data.persistence.PersistenceRecord;
import com.data.serialization.SerializationContext;
import com.data.structures.GenericPairContainer;
import com.deobfuscation.orchestration.OperationOrchestrator;
import com.development.analysis.DecompilationErrorHandler1215;
import com.development.tools.DecompilationExceptionHandler;
import com.entity.lifecycle.ComplexEntityLifecycleManager;
import com.event.orchestration.DeclarativeEventOrchestrator;
import com.exception.system.CustomSystemException;
import com.logging.audit.AuditTrailLogger;
import com.metadata.extraction.MetadataExtractionEngine;
import com.network.messaging.TransmissionPayload;
import com.reflection.management.ClassPoolRegistry;
import com.reflection.metadata.ClassMetadataExtractor;
import com.reflection.metadata.ReflectionMetadataResolver933;
import com.reflection.registry.MetaclassDefinitionRegistry;
import com.reflection.utils.TypeInspectionUtility;
import com.reverse.engineering.DecompilationAnalyzer;
import com.security.tokens.SerializableIdentityToken;
import com.serialization.security.SerializationSecurityManager;
import com.system.compilation.CompilationDiagnosticException;
import com.system.validation.SafetyComplianceValidator;
import com.util.reflection.ReflectionFieldResolver;
import com.util.serialization.SerializationUtility;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ReflectiveAccessMediator
extends SafetyComplianceValidator {
    protected TypeInspectionUtility W;
    private static final long[] x;
    protected MetaclassDefinitionRegistry I;
    protected boolean v;
    protected BytecodeInspectionEngine M;
    private static final long g;
    private static final Map D;
    private static final Integer[] y;

    @Override
    protected void e(int n, boolean bl, PersistenceRecord persistenceRecord, CryptographicPrimitiveManager cryptographicPrimitiveManager, boolean bl2) throws CompilationDiagnosticException {
        int n2;
        boolean bl3;
        int n3;
        boolean bl4;
        DecompilationAnalyzer decompilationAnalyzer;
        block12: {
            int n4;
            block9: {
                int n5;
                block11: {
                    block10: {
                        decompilationAnalyzer = this.S(persistenceRecord, false);
                        bl4 = this.v;
                        try {
                            if (!bl4) {
                                this.t.E(89);
                            }
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                        }
                        n3 = this.V(decompilationAnalyzer, bl4);
                        int n6 = this.P;
                        bl3 = ReflectiveAccessMediator.g(n6, this.C);
                        try {
                            try {
                                if (!bl4) break block9;
                                if (!bl3) break block10;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                            }
                            n5 = 92;
                            break block11;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                        }
                    }
                    n5 = 89;
                }
                n2 = n5;
                break block12;
            }
            try {
                n4 = bl3 ? 93 : 90;
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw ReflectiveAccessMediator.c(compilationDiagnosticException);
            }
            n2 = n4;
        }
        this.k(n2, bl2, n, bl, cryptographicPrimitiveManager);
        this.I(decompilationAnalyzer, bl4, n3, bl3);
    }

    public int Y(eF eF2) {
        return eF.C(eF2);
    }

    private int s(DecompilationAnalyzer decompilationAnalyzer, BytecodeAnnotationExtractor bytecodeAnnotationExtractor) {
        BytecodeAnalyzer bytecodeAnalyzer = this.t.D();
        String string = decompilationAnalyzer.E().H();
        int n = bytecodeAnalyzer.l(string);
        String string2 = bytecodeAnnotationExtractor.Q();
        String string3 = bytecodeAnnotationExtractor.S();
        return bytecodeAnalyzer.K(n, string2, string3);
    }

    private void u(PersistenceRecord persistenceRecord) throws CompilationDiagnosticException {
        long l = g ^ 0x7F80864EDD7FL;
        try {
            if (this.C == 0) {
                throw new CompilationDiagnosticException(".length applied to a non array");
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw ReflectiveAccessMediator.c(compilationDiagnosticException);
        }
        this.t.E(190);
        this.P = (int)ReflectiveAccessMediator.b("m", (int)11073, (long)(0xD3458BDDE42D823L ^ l));
        this.C = 0;
    }

    @Override
    protected String A() throws CompilationDiagnosticException {
        return TypeInspectionUtility.i(TypeInspectionUtility.s(this.I).H());
    }

    protected String x(String string, MetaclassDefinitionRegistry metaclassDefinitionRegistry, BytecodeInspectionEngine bytecodeInspectionEngine) throws CompilationDiagnosticException {
        if (this.o(metaclassDefinitionRegistry, this.I)) {
            Nw nw = metaclassDefinitionRegistry.t();
            try {
                if (nw != null) {
                    return nw.v(metaclassDefinitionRegistry, string, bytecodeInspectionEngine);
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw ReflectiveAccessMediator.c(compilationDiagnosticException);
            }
        }
        throw new CompilationDiagnosticException("the called constructor is private in " + metaclassDefinitionRegistry.H());
    }

    private boolean G(MetaclassDefinitionRegistry metaclassDefinitionRegistry, MetaclassDefinitionRegistry metaclassDefinitionRegistry2) {
        block5: {
            try {
                while (true) {
                    block6: {
                        try {
                            if (metaclassDefinitionRegistry == null) break block5;
                            if (!this.o(metaclassDefinitionRegistry, metaclassDefinitionRegistry2)) break block6;
                        }
                        catch (CustomRuntimeException customRuntimeException) {
                            throw ReflectiveAccessMediator.c(customRuntimeException);
                        }
                        return true;
                    }
                    metaclassDefinitionRegistry = metaclassDefinitionRegistry.i();
                }
            }
            catch (CustomRuntimeException customRuntimeException) {
                // empty catch block
            }
        }
        return false;
    }

    @Override
    protected void M(String string) throws CompilationDiagnosticException {
        block3: {
            block2: {
                try {
                    if (this.C() >= 49) break block2;
                    super.M(string);
                    break block3;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                }
            }
            this.t.d(this.t.D().l(string));
        }
    }

    private static Exception c(Exception exception) {
        return exception;
    }

    @Override
    protected String a(String string) throws CompilationDiagnosticException {
        return this.W.S(string);
    }

    @Override
    public void K(SerializationSecurityManager serializationSecurityManager) throws CompilationDiagnosticException {
        block3: {
            long l;
            block2: {
                l = g ^ 0x1A28885F9457L;
                try {
                    if (!serializationSecurityManager.b()) break block2;
                    this.p(serializationSecurityManager);
                    break block3;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                }
            }
            MetaclassDefinitionRegistry metaclassDefinitionRegistry = this.W.V(serializationSecurityManager.b());
            String string = metaclassDefinitionRegistry.H();
            eF eF2 = serializationSecurityManager.N();
            this.t.p(string);
            this.t.E(89);
            this.G(metaclassDefinitionRegistry, "<init>", eF2, false, true, -1, null);
            this.P = (int)ReflectiveAccessMediator.b("m", (int)4063, (long)(0x2FE72792E91AB597L ^ l));
            this.C = 0;
            this.o = TypeInspectionUtility.i(string);
        }
    }

    private Nw C(DecompilationAnalyzer decompilationAnalyzer, BytecodeAnnotationExtractor bytecodeAnnotationExtractor) throws CompilationDiagnosticException {
        block6: {
            try {
                if (!OperationOrchestrator.A(bytecodeAnnotationExtractor.q()) || decompilationAnalyzer.E() == this.I) break block6;
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw ReflectiveAccessMediator.c(compilationDiagnosticException);
            }
            MetaclassDefinitionRegistry metaclassDefinitionRegistry = decompilationAnalyzer.E();
            if (this.o(metaclassDefinitionRegistry, this.I)) {
                Nw nw = metaclassDefinitionRegistry.t();
                try {
                    if (nw != null) {
                        return nw;
                    }
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                }
            }
            throw new CompilationDiagnosticException("Field " + decompilationAnalyzer.l() + " in " + metaclassDefinitionRegistry.H() + " is private.");
        }
        return null;
    }

    @Override
    protected String L(eF eF2) throws CompilationDiagnosticException {
        return this.W.t(eF2);
    }

    private static void n() throws CompilationDiagnosticException {
        throw new CompilationDiagnosticException("bad l-value");
    }

    @Override
    protected void J(CryptographicPrimitiveManager cryptographicPrimitiveManager, int n, PersistenceRecord persistenceRecord, PersistenceRecord persistenceRecord2, boolean bl) throws CompilationDiagnosticException {
        boolean bl2;
        String string;
        int n2;
        int n3;
        int n4;
        boolean bl3;
        DecompilationAnalyzer decompilationAnalyzer;
        block15: {
            int n5;
            block19: {
                int n6;
                block16: {
                    int n7;
                    block18: {
                        block17: {
                            block14: {
                                decompilationAnalyzer = this.S(persistenceRecord, false);
                                bl3 = this.v;
                                try {
                                    try {
                                        if (n == 61 || bl3) break block14;
                                    }
                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                        throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                                    }
                                    this.t.E(89);
                                }
                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                    throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                                }
                            }
                            if (n == 61) {
                                BytecodeAnnotationExtractor bytecodeAnnotationExtractor = decompilationAnalyzer.b();
                                this.G(bytecodeAnnotationExtractor);
                                Nw nw = this.C(decompilationAnalyzer, bytecodeAnnotationExtractor);
                                n4 = nw == null ? this.s(decompilationAnalyzer, bytecodeAnnotationExtractor) : 0;
                            } else {
                                n4 = this.V(decompilationAnalyzer, bl3);
                            }
                            n3 = this.P;
                            n2 = this.C;
                            string = this.o;
                            this.v(cryptographicPrimitiveManager, n, persistenceRecord2, n3, n2, string);
                            bl2 = ReflectiveAccessMediator.g(n3, n2);
                            try {
                                try {
                                    try {
                                        if (!bl) break block15;
                                        if (!bl3) break block16;
                                    }
                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                        throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                                    }
                                    if (!bl2) break block17;
                                }
                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                    throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                                }
                                n7 = 92;
                                break block18;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                            }
                        }
                        n7 = 89;
                    }
                    n5 = n7;
                    break block19;
                }
                try {
                    n6 = bl2 ? 93 : 90;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                }
                n5 = n6;
            }
            this.t.E(n5);
        }
        this.I(decompilationAnalyzer, bl3, n4, bl2);
        this.P = n3;
        this.C = n2;
        this.o = string;
    }

    private void k(MetaclassDefinitionRegistry metaclassDefinitionRegistry, String string, boolean bl, boolean bl2, int n, ConfigurationManager2183 configurationManager2183) throws CompilationDiagnosticException {
        boolean bl3;
        String string2;
        block34: {
            MetaclassDefinitionRegistry metaclassDefinitionRegistry2;
            block35: {
                block33: {
                    block30: {
                        block31: {
                            block32: {
                                int n2;
                                block27: {
                                    BytecodeInspectionEngine bytecodeInspectionEngine;
                                    block29: {
                                        metaclassDefinitionRegistry2 = configurationManager2183.a;
                                        bytecodeInspectionEngine = configurationManager2183.o;
                                        string2 = bytecodeInspectionEngine.b();
                                        n2 = bytecodeInspectionEngine.Z();
                                        if (string.equals("<init>")) {
                                            block28: {
                                                bl2 = true;
                                                try {
                                                    if (metaclassDefinitionRegistry2 != metaclassDefinitionRegistry) {
                                                        throw new CompilationDiagnosticException("no such constructor: " + metaclassDefinitionRegistry.H());
                                                    }
                                                }
                                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                    throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            if (metaclassDefinitionRegistry2 == this.I || !OperationOrchestrator.A(n2)) break block27;
                                                        }
                                                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                            throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                                                        }
                                                        if (metaclassDefinitionRegistry2.Q().k() < 52) break block28;
                                                    }
                                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                        throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                                                    }
                                                    if (this.G(metaclassDefinitionRegistry2, this.I)) break block27;
                                                }
                                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                    throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                                                }
                                            }
                                            string2 = this.x(string2, metaclassDefinitionRegistry2, bytecodeInspectionEngine);
                                            this.t.E(1);
                                        } else {
                                            try {
                                                if (!OperationOrchestrator.A(n2)) break block27;
                                                if (metaclassDefinitionRegistry2 != this.I) break block29;
                                            }
                                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                                throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                                            }
                                            bl2 = true;
                                        }
                                        break block27;
                                    }
                                    bl2 = false;
                                    bl = true;
                                    String string3 = string2;
                                    if ((n2 & 8) == 0) {
                                        string2 = ReflectionMetadataResolver933.r(metaclassDefinitionRegistry2.H(), string3);
                                    }
                                    n2 = OperationOrchestrator.J(n2) | 8;
                                    string = this.y(string, string3, string2, bytecodeInspectionEngine, metaclassDefinitionRegistry2);
                                }
                                bl3 = false;
                                try {
                                    if ((n2 & 8) == 0) break block30;
                                    if (bl) break block31;
                                }
                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                    throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                                }
                                bl = true;
                                try {
                                    if (n < 0) break block32;
                                    this.t.u(n, 0);
                                    break block31;
                                }
                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                    throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                                }
                            }
                            bl3 = true;
                        }
                        this.t.I(metaclassDefinitionRegistry2, string, string2);
                        break block34;
                    }
                    try {
                        if (!bl2) break block33;
                        this.t.s(metaclassDefinitionRegistry, string, string2);
                        break block34;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                    }
                }
                try {
                    if (ConfigurationOrchestrator2115.i(metaclassDefinitionRegistry2.a()) && metaclassDefinitionRegistry2.h() == metaclassDefinitionRegistry.h()) break block35;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                }
                metaclassDefinitionRegistry2 = metaclassDefinitionRegistry;
            }
            if (metaclassDefinitionRegistry2.h()) {
                int n3 = ReflectionMetadataResolver933.B(string2) + 1;
                this.t.N(metaclassDefinitionRegistry2, string, string2, n3);
            } else {
                try {
                    if (bl) {
                        throw new CompilationDiagnosticException(string + " is not static");
                    }
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                }
                this.t.L(metaclassDefinitionRegistry2, string, string2);
            }
        }
        this.Q(string2, bl, bl3);
    }

    public ReflectiveAccessMediator(ComplexEntityLifecycleManager complexEntityLifecycleManager, MetaclassDefinitionRegistry metaclassDefinitionRegistry, ClassPoolRegistry classPoolRegistry) {
        super(complexEntityLifecycleManager);
        this.W = new TypeInspectionUtility(classPoolRegistry);
        this.I = metaclassDefinitionRegistry;
        this.M = null;
    }

    @Override
    protected void g(SerializationUtility serializationUtility, int n, int n2, String string) throws CompilationDiagnosticException {
        this.j(n, null, string, serializationUtility);
    }

    private static void c() throws CompilationDiagnosticException {
        throw new CompilationDiagnosticException("bad method");
    }

    private void j(int n, PersistenceRecord persistenceRecord, String string, SerializationUtility serializationUtility) throws CompilationDiagnosticException {
        int n2;
        String string2;
        block27: {
            block24: {
                block25: {
                    try {
                        try {
                            if (serializationUtility != null) break block24;
                            if (persistenceRecord != null) break block25;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                        }
                        throw new CompilationDiagnosticException("no array size");
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                    }
                }
                persistenceRecord.z(this);
                break block27;
            }
            if (persistenceRecord == null) {
                int n3 = serializationUtility.S();
                this.t.a(n3);
            } else {
                throw new CompilationDiagnosticException("unnecessary array size specified for new");
            }
        }
        if (n == 307) {
            string2 = this.a(string);
            this.t.m(TypeInspectionUtility.M(string2));
        } else {
            string2 = null;
            n2 = 0;
            switch (n) {
                case 301: {
                    n2 = 4;
                    break;
                }
                case 306: {
                    n2 = 5;
                    break;
                }
                case 317: {
                    n2 = 6;
                    break;
                }
                case 312: {
                    n2 = 7;
                    break;
                }
                case 303: {
                    n2 = 8;
                    break;
                }
                case 334: {
                    n2 = 9;
                    break;
                }
                case 324: {
                    n2 = 10;
                    break;
                }
                case 326: {
                    n2 = 11;
                    break;
                }
                default: {
                    ReflectiveAccessMediator.D();
                }
            }
            this.t.E(188);
            this.t.w(n2);
        }
        if (serializationUtility != null) {
            n2 = serializationUtility.S();
            eF eF2 = serializationUtility;
            int n4 = 0;
            while (true) {
                block26: {
                    try {
                        try {
                            if (n4 >= n2) break;
                            this.t.E(89);
                            this.t.a(n4);
                            eF2.l().z(this);
                            if (ReflectiveAccessMediator.V(n)) break block26;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                        }
                        this.p(this.P, n);
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                    }
                }
                this.t.E(ReflectiveAccessMediator.x(n, 0));
                eF2 = eF2.n();
                ++n4;
            }
        }
        this.P = n;
        this.C = 1;
        this.o = string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/aT" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    protected String y(String string, String string2, String string3, BytecodeInspectionEngine bytecodeInspectionEngine, MetaclassDefinitionRegistry metaclassDefinitionRegistry) throws CompilationDiagnosticException {
        if (this.o(metaclassDefinitionRegistry, this.I)) {
            Nw nw = metaclassDefinitionRegistry.t();
            try {
                if (nw != null) {
                    return nw.q(string, string2, string3, bytecodeInspectionEngine);
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw ReflectiveAccessMediator.c(compilationDiagnosticException);
            }
        }
        throw new CompilationDiagnosticException("Method " + string + " is private");
    }

    protected void v(int n, eF eF2, eF eF3) throws CompilationDiagnosticException {
        Object object;
        int n2 = eF3.U();
        int n3 = 0;
        while (eF3 != null) {
            object = eF3.l();
            try {
                if (object == null) {
                    break;
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw ReflectiveAccessMediator.c(compilationDiagnosticException);
            }
            try {
                ++n3;
                ((PersistenceRecord)object).z(this);
                if (this.P != 324) {
                    throw new CompilationDiagnosticException("bad type for array size");
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw ReflectiveAccessMediator.c(compilationDiagnosticException);
            }
            eF3 = eF3.n();
        }
        this.P = n;
        this.C = n2;
        if (n == 307) {
            this.o = this.L(eF2);
            object = ReflectiveAccessMediator.Y(this.o, n2);
        } else {
            object = ReflectiveAccessMediator.G(n, n2);
        }
        this.t.a((String)object, n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        g = MultiContainerRegistry.a(-3168926514337793216L, 2088278838712161035L, MethodHandles.lookup().lookupClass()).a(24814118971591L);
        D = new HashMap(13);
        long l = g ^ 0x5A71F4D0004CL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n = 0;
        String string = "0\u0003}\u00bf\u00b0-\u00c9$|\u00b6\u0010v\u0091\u00b7M\u00e9\u00c8\u00a8\\\u00e18\u0010\u00c9\r";
        int n2 = "0\u0003}\u00bf\u00b0-\u00c9$|\u00b6\u0010v\u0091\u00b7M\u00e9\u00c8\u00a8\\\u00e18\u0010\u00c9\r".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        x = lArray;
        y = new Integer[3];
    }

    /*
     * Loose catch block
     */
    @Override
    public void f(AuditTrailLogger auditTrailLogger) throws CompilationDiagnosticException {
        ConfigurationManager2183 configurationManager2183;
        int n;
        boolean bl;
        boolean bl2;
        eF eF2;
        MetaclassDefinitionRegistry metaclassDefinitionRegistry;
        String string;
        block24: {
            block31: {
                block33: {
                    PersistenceRecord persistenceRecord;
                    long l;
                    block26: {
                        block34: {
                            block25: {
                                block35: {
                                    int n2;
                                    CryptographicPrimitiveManager cryptographicPrimitiveManager;
                                    block32: {
                                        PersistenceRecord persistenceRecord2;
                                        block30: {
                                            block27: {
                                                block23: {
                                                    block28: {
                                                        l = g ^ 0x2F84BB715C34L;
                                                        string = null;
                                                        metaclassDefinitionRegistry = null;
                                                        persistenceRecord2 = auditTrailLogger.R();
                                                        eF2 = (eF)auditTrailLogger.V();
                                                        bl2 = false;
                                                        bl = false;
                                                        n = -1;
                                                        configurationManager2183 = auditTrailLogger.D();
                                                        if (!(persistenceRecord2 instanceof SerializationContext)) break block27;
                                                        string = ((SerializationContext)persistenceRecord2).e();
                                                        metaclassDefinitionRegistry = this.I;
                                                        if (this.N) break block28;
                                                        try {
                                                            block29: {
                                                                if (configurationManager2183 == null) break block23;
                                                                break block29;
                                                                catch (ReflectionFieldResolver reflectionFieldResolver) {
                                                                    throw ReflectiveAccessMediator.c(reflectionFieldResolver);
                                                                }
                                                            }
                                                            if (!configurationManager2183.k()) break block23;
                                                        }
                                                        catch (ReflectionFieldResolver reflectionFieldResolver) {
                                                            throw ReflectiveAccessMediator.c(reflectionFieldResolver);
                                                        }
                                                    }
                                                    bl2 = true;
                                                    break block24;
                                                }
                                                n = this.t.H();
                                                this.t.B(0);
                                                break block24;
                                            }
                                            if (!(persistenceRecord2 instanceof SerializableIdentityToken)) break block30;
                                            bl = true;
                                            string = "<init>";
                                            metaclassDefinitionRegistry = this.I;
                                            try {
                                                if (this.N) {
                                                    throw new CompilationDiagnosticException("a constructor cannot be static");
                                                }
                                            }
                                            catch (ReflectionFieldResolver reflectionFieldResolver) {
                                                throw ReflectiveAccessMediator.c(reflectionFieldResolver);
                                            }
                                            this.t.B(0);
                                            if (((SerializableIdentityToken)persistenceRecord2).X() == 336) {
                                                metaclassDefinitionRegistry = TypeInspectionUtility.s(metaclassDefinitionRegistry);
                                            }
                                            break block24;
                                        }
                                        if (!(persistenceRecord2 instanceof CryptographicPrimitiveManager)) break block31;
                                        cryptographicPrimitiveManager = (CryptographicPrimitiveManager)persistenceRecord2;
                                        string = ((TransmissionPayload)cryptographicPrimitiveManager.V()).e();
                                        n2 = cryptographicPrimitiveManager.I();
                                        if (n2 != 35) break block32;
                                        metaclassDefinitionRegistry = this.W.g(((TransmissionPayload)cryptographicPrimitiveManager.R()).e(), false);
                                        bl2 = true;
                                        break block24;
                                    }
                                    if (n2 != 46) break block33;
                                    persistenceRecord = cryptographicPrimitiveManager.R();
                                    String string2 = MetadataExtractionEngine.g(persistenceRecord);
                                    if (string2 == null) break block34;
                                    bl = true;
                                    metaclassDefinitionRegistry = TypeInspectionUtility.t(this.I, string2);
                                    if (this.N) break block35;
                                    try {
                                        block36: {
                                            if (configurationManager2183 == null) break block25;
                                            break block36;
                                            catch (ReflectionFieldResolver reflectionFieldResolver) {
                                                throw ReflectiveAccessMediator.c(reflectionFieldResolver);
                                            }
                                        }
                                        if (!configurationManager2183.k()) break block25;
                                    }
                                    catch (ReflectionFieldResolver reflectionFieldResolver) {
                                        throw ReflectiveAccessMediator.c(reflectionFieldResolver);
                                    }
                                }
                                bl2 = true;
                                break block24;
                            }
                            n = this.t.H();
                            this.t.B(0);
                            break block24;
                        }
                        try {
                            if (!(persistenceRecord instanceof SerializableIdentityToken) || ((SerializableIdentityToken)persistenceRecord).X() != 336) break block26;
                        }
                        catch (ReflectionFieldResolver reflectionFieldResolver) {
                            throw ReflectiveAccessMediator.c(reflectionFieldResolver);
                        }
                        bl = true;
                    }
                    try {
                        persistenceRecord.z(this);
                    }
                    catch (ReflectionFieldResolver reflectionFieldResolver) {
                        try {
                            if (reflectionFieldResolver.l() != persistenceRecord) {
                                throw reflectionFieldResolver;
                            }
                        }
                        catch (ReflectionFieldResolver reflectionFieldResolver2) {
                            throw ReflectiveAccessMediator.c(reflectionFieldResolver2);
                        }
                        this.P = (int)ReflectiveAccessMediator.b("m", (int)5933, (long)(0x7D4D882DF1FF6505L ^ l));
                        this.C = 0;
                        this.o = reflectionFieldResolver.Y();
                        bl2 = true;
                    }
                    if (this.C > 0) {
                        metaclassDefinitionRegistry = this.W.g("java.lang.Object", true);
                    } else if (this.P == 307) {
                        metaclassDefinitionRegistry = this.W.w(this.o);
                    } else {
                        ReflectiveAccessMediator.c();
                    }
                    break block24;
                }
                ReflectiveAccessMediator.c();
                break block24;
            }
            ReflectiveAccessMediator.Z();
        }
        this.G(metaclassDefinitionRegistry, string, eF2, bl2, bl, n, configurationManager2183);
    }

    private void I(DecompilationAnalyzer decompilationAnalyzer, boolean bl, int n, boolean bl2) throws CompilationDiagnosticException {
        block13: {
            block8: {
                block12: {
                    int n2;
                    ComplexEntityLifecycleManager complexEntityLifecycleManager;
                    block9: {
                        int n3;
                        ComplexEntityLifecycleManager complexEntityLifecycleManager2;
                        block11: {
                            block10: {
                                try {
                                    try {
                                        try {
                                            if (n == 0) break block8;
                                            if (!bl) break block9;
                                        }
                                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                                            throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                                        }
                                        this.t.w(179);
                                        complexEntityLifecycleManager2 = this.t;
                                        if (!bl2) break block10;
                                    }
                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                        throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                                    }
                                    n3 = -2;
                                    break block11;
                                }
                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                    throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                                }
                            }
                            n3 = -1;
                        }
                        complexEntityLifecycleManager2.R(n3);
                        break block12;
                    }
                    try {
                        this.t.w(181);
                        complexEntityLifecycleManager = this.t;
                        n2 = bl2 ? -3 : -2;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                    }
                    complexEntityLifecycleManager.R(n2);
                }
                this.t.m(n);
                break block13;
            }
            MetaclassDefinitionRegistry metaclassDefinitionRegistry = decompilationAnalyzer.E();
            Nw nw = metaclassDefinitionRegistry.t();
            BytecodeAnnotationExtractor bytecodeAnnotationExtractor = decompilationAnalyzer.b();
            BytecodeInspectionEngine bytecodeInspectionEngine = nw.d(bytecodeAnnotationExtractor, bl);
            this.t.I(metaclassDefinitionRegistry, bytecodeInspectionEngine.C(), bytecodeInspectionEngine.b());
        }
    }

    public void p(SerializationSecurityManager serializationSecurityManager) throws CompilationDiagnosticException {
        SerializationUtility serializationUtility;
        eF eF2;
        eF eF3;
        int n;
        block4: {
            block5: {
                n = serializationSecurityManager.q();
                eF3 = serializationSecurityManager.F();
                eF2 = serializationSecurityManager.b();
                serializationUtility = serializationSecurityManager.Z();
                try {
                    try {
                        if (eF3.U() <= 1) break block4;
                        if (serializationUtility == null) break block5;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                    }
                    throw new CompilationDiagnosticException("sorry, multi-dimensional array initializer for new is not supported");
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                }
            }
            this.v(n, eF2, eF3);
            return;
        }
        PersistenceRecord persistenceRecord = eF3.l();
        this.j(n, persistenceRecord, DeclarativeEventOrchestrator.s(eF2, '/'), serializationUtility);
    }

    @Override
    protected void R(PersistenceRecord persistenceRecord) throws CompilationDiagnosticException {
        block6: {
            PersistenceRecord persistenceRecord2;
            DecompilationAnalyzer decompilationAnalyzer;
            block5: {
                decompilationAnalyzer = this.S(persistenceRecord, true);
                try {
                    if (decompilationAnalyzer == null) {
                        this.u(persistenceRecord);
                        return;
                    }
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                }
                boolean bl = this.v;
                persistenceRecord2 = MetadataExtractionEngine.H(decompilationAnalyzer);
                try {
                    if (persistenceRecord2 != null) break block5;
                    this.V(decompilationAnalyzer, bl);
                    break block6;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                }
            }
            persistenceRecord2.z(this);
            this.G(decompilationAnalyzer.b());
        }
    }

    private void b(List<int[]> list, DatabaseStatementHandler databaseStatementHandler) throws CompilationDiagnosticException {
        ComplexEntityLifecycleManager complexEntityLifecycleManager = this.t;
        for (int[] nArray : list) {
            int n = nArray[0];
            complexEntityLifecycleManager.Q(n, complexEntityLifecycleManager.H() - n + 1);
            DecompilationExceptionHandler decompilationExceptionHandler = new DecompilationExceptionHandler(this, nArray);
            try {
                databaseStatementHandler.z(this);
                decompilationExceptionHandler.J(this);
                if (this.m) continue;
                complexEntityLifecycleManager.E(167);
                complexEntityLifecycleManager.m(n + 3 - complexEntityLifecycleManager.H());
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw ReflectiveAccessMediator.c(compilationDiagnosticException);
            }
        }
    }

    @Override
    protected String O() {
        return TypeInspectionUtility.i(this.I.H());
    }

    public void G(MetaclassDefinitionRegistry metaclassDefinitionRegistry, String string, eF eF2, boolean bl, boolean bl2, int n, ConfigurationManager2183 configurationManager2183) throws CompilationDiagnosticException {
        block8: {
            String string2;
            block10: {
                block9: {
                    String[] stringArray;
                    int[] nArray;
                    int[] nArray2;
                    block7: {
                        int n2 = this.Y(eF2);
                        nArray2 = new int[n2];
                        nArray = new int[n2];
                        stringArray = new String[n2];
                        try {
                            try {
                                if (bl || configurationManager2183 == null) break block7;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                            }
                            if (!configurationManager2183.k()) break block7;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                        }
                        this.t.E(87);
                        bl = true;
                    }
                    int n3 = this.t.S();
                    this.F(eF2, nArray2, nArray, stringArray);
                    if (configurationManager2183 == null) {
                        configurationManager2183 = this.W.s(metaclassDefinitionRegistry, this.I, this.M, string, nArray2, nArray, stringArray);
                    }
                    try {
                        if (configurationManager2183 != null) break block8;
                        if (!string.equals("<init>")) break block9;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                    }
                    string2 = "constructor not found";
                    break block10;
                }
                string2 = "Method " + string + " not found in " + metaclassDefinitionRegistry.H();
            }
            throw new CompilationDiagnosticException(string2);
        }
        this.k(metaclassDefinitionRegistry, string, bl, bl2, n, configurationManager2183);
    }

    void Q(String string, boolean bl, boolean bl2) throws CompilationDiagnosticException {
        block17: {
            block19: {
                int n;
                block18: {
                    long l = g ^ 0x44B080C63DACL;
                    int n2 = string.indexOf(41);
                    try {
                        if (n2 < 0) {
                            ReflectiveAccessMediator.c();
                        }
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                    }
                    char c = string.charAt(++n2);
                    int n3 = 0;
                    while (c == '[') {
                        ++n3;
                        c = string.charAt(++n2);
                    }
                    this.C = n3;
                    if (c == 'L') {
                        n = string.indexOf(59, n2 + 1);
                        try {
                            if (n < 0) {
                                ReflectiveAccessMediator.c();
                            }
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                        }
                        this.P = (int)ReflectiveAccessMediator.b("m", (int)4063, (long)(0x2FE7790AE1831C6CL ^ l));
                        this.o = string.substring(n2 + 1, n);
                    } else {
                        this.P = TypeInspectionUtility.y(c);
                        this.o = null;
                    }
                    n = this.P;
                    try {
                        try {
                            try {
                                if (!bl || !bl2) break block17;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                            }
                            if (!ReflectiveAccessMediator.g(n, n3)) break block18;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                        }
                        this.t.E(93);
                        this.t.E(88);
                        this.t.E(87);
                        break block17;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                    }
                }
                try {
                    if (n != 344) break block19;
                    this.t.E(87);
                    break block17;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                }
            }
            this.t.E(95);
            this.t.E(87);
        }
    }

    private static void D() throws CompilationDiagnosticException {
        throw new CompilationDiagnosticException("bad new expression");
    }

    @Override
    public void J(SerializationUtility serializationUtility) throws CompilationDiagnosticException {
        throw new CompilationDiagnosticException("array initializer is not supported");
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ReflectiveAccessMediator.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public void F(eF eF2, int[] nArray, int[] nArray2, String[] stringArray) throws CompilationDiagnosticException {
        int n = 0;
        while (eF2 != null) {
            PersistenceRecord persistenceRecord = eF2.l();
            persistenceRecord.z(this);
            nArray[n] = this.P;
            nArray2[n] = this.C;
            stringArray[n] = this.o;
            ++n;
            eF2 = eF2.n();
        }
    }

    public int C() {
        ClassMetadataExtractor classMetadataExtractor = this.I.o();
        try {
            if (classMetadataExtractor == null) {
                return ClassMetadataExtractor.f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ReflectiveAccessMediator.c(customSystemException);
        }
        return classMetadataExtractor.k();
    }

    private boolean o(MetaclassDefinitionRegistry metaclassDefinitionRegistry, MetaclassDefinitionRegistry metaclassDefinitionRegistry2) {
        try {
            while (metaclassDefinitionRegistry2 != null) {
                if ((metaclassDefinitionRegistry2 = metaclassDefinitionRegistry2.i()) != metaclassDefinitionRegistry) continue;
                return true;
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            // empty catch block
        }
        return false;
    }

    private boolean G(BytecodeAnnotationExtractor bytecodeAnnotationExtractor) throws CompilationDiagnosticException {
        boolean bl;
        block11: {
            block9: {
                String string = bytecodeAnnotationExtractor.S();
                int n = 0;
                int n2 = 0;
                char c = string.charAt(n);
                while (c == '[') {
                    ++n2;
                    c = string.charAt(++n);
                }
                try {
                    this.C = n2;
                    this.P = TypeInspectionUtility.y(c);
                    this.o = c == 'L' ? string.substring(n + 1, string.indexOf(59, n + 1)) : null;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                }
                try {
                    block10: {
                        try {
                            try {
                                if (n2 != 0) break block9;
                                if (c == 'J') break block10;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                            }
                            if (c != 'D') break block9;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                        }
                    }
                    bl = true;
                    break block11;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                }
            }
            bl = false;
        }
        boolean bl2 = bl;
        return bl2;
    }

    @Override
    public void J(SerializationContext serializationContext) throws CompilationDiagnosticException {
        this.R(serializationContext);
    }

    private int V(DecompilationAnalyzer decompilationAnalyzer, boolean bl) throws CompilationDiagnosticException {
        int n;
        block10: {
            int n2;
            ComplexEntityLifecycleManager complexEntityLifecycleManager;
            boolean bl2;
            block7: {
                int n3;
                ComplexEntityLifecycleManager complexEntityLifecycleManager2;
                block9: {
                    block8: {
                        BytecodeAnnotationExtractor bytecodeAnnotationExtractor = decompilationAnalyzer.b();
                        bl2 = this.G(bytecodeAnnotationExtractor);
                        Nw nw = this.C(decompilationAnalyzer, bytecodeAnnotationExtractor);
                        if (nw != null) {
                            BytecodeInspectionEngine bytecodeInspectionEngine = nw.t(bytecodeAnnotationExtractor, bl);
                            this.t.I(decompilationAnalyzer.E(), bytecodeInspectionEngine.C(), bytecodeInspectionEngine.b());
                            return 0;
                        }
                        n = this.s(decompilationAnalyzer, bytecodeAnnotationExtractor);
                        try {
                            try {
                                if (!bl) break block7;
                                this.t.w(178);
                                complexEntityLifecycleManager2 = this.t;
                                if (!bl2) break block8;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                            }
                            n3 = 2;
                            break block9;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                        }
                    }
                    n3 = 1;
                }
                complexEntityLifecycleManager2.R(n3);
                break block10;
            }
            try {
                this.t.w(180);
                complexEntityLifecycleManager = this.t;
                n2 = bl2 ? 1 : 0;
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw ReflectiveAccessMediator.c(compilationDiagnosticException);
            }
            complexEntityLifecycleManager.R(n2);
        }
        this.t.m(n);
        return n;
    }

    @Override
    protected void n(DatabaseStatementHandler databaseStatementHandler) throws CompilationDiagnosticException {
        block26: {
            boolean bl;
            boolean bl2;
            ComplexEntityLifecycleManager complexEntityLifecycleManager = this.t;
            DatabaseStatementHandler databaseStatementHandler2 = (DatabaseStatementHandler)databaseStatementHandler.Z();
            try {
                if (databaseStatementHandler2 == null) {
                    return;
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw ReflectiveAccessMediator.c(compilationDiagnosticException);
            }
            eF eF2 = (eF)databaseStatementHandler.u().Z();
            DatabaseStatementHandler databaseStatementHandler3 = (DatabaseStatementHandler)databaseStatementHandler.u().u().Z();
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            DecompilationErrorHandler1215 decompilationErrorHandler1215 = null;
            if (databaseStatementHandler3 != null) {
                decompilationErrorHandler1215 = new DecompilationErrorHandler1215(this);
            }
            int n = complexEntityLifecycleManager.H();
            databaseStatementHandler2.z(this);
            int n2 = complexEntityLifecycleManager.H();
            try {
                if (n == n2) {
                    throw new CompilationDiagnosticException("empty try block");
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw ReflectiveAccessMediator.c(compilationDiagnosticException);
            }
            try {
                bl2 = !this.m;
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw ReflectiveAccessMediator.c(compilationDiagnosticException);
            }
            boolean bl3 = bl2;
            try {
                if (bl3) {
                    complexEntityLifecycleManager.E(167);
                    arrayList.add(complexEntityLifecycleManager.H());
                    complexEntityLifecycleManager.m(0);
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw ReflectiveAccessMediator.c(compilationDiagnosticException);
            }
            int n3 = this.H();
            this.l(1);
            while (eF2 != null) {
                GenericPairContainer genericPairContainer = (GenericPairContainer)eF2.l();
                eF2 = eF2.n();
                DeclarativeEventOrchestrator declarativeEventOrchestrator = (DeclarativeEventOrchestrator)genericPairContainer.Z();
                DatabaseStatementHandler databaseStatementHandler4 = (DatabaseStatementHandler)genericPairContainer.u();
                declarativeEventOrchestrator.T(n3);
                MetaclassDefinitionRegistry metaclassDefinitionRegistry = this.W.w(declarativeEventOrchestrator.u());
                try {
                    declarativeEventOrchestrator.R(TypeInspectionUtility.i(metaclassDefinitionRegistry.H()));
                    complexEntityLifecycleManager.D(n, n2, complexEntityLifecycleManager.H(), metaclassDefinitionRegistry);
                    complexEntityLifecycleManager.R(1);
                    complexEntityLifecycleManager.S(n3);
                    this.m = false;
                    if (databaseStatementHandler4 != null) {
                        databaseStatementHandler4.z(this);
                    }
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                }
                if (this.m) continue;
                complexEntityLifecycleManager.E(167);
                arrayList.add(complexEntityLifecycleManager.H());
                complexEntityLifecycleManager.m(0);
                bl3 = true;
            }
            if (databaseStatementHandler3 != null) {
                decompilationErrorHandler1215.J(this);
                int n4 = complexEntityLifecycleManager.H();
                try {
                    complexEntityLifecycleManager.f(n, n4, n4, 0);
                    complexEntityLifecycleManager.R(1);
                    complexEntityLifecycleManager.S(n3);
                    this.m = false;
                    databaseStatementHandler3.z(this);
                    if (!this.m) {
                        complexEntityLifecycleManager.B(n3);
                        complexEntityLifecycleManager.E(191);
                    }
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                }
                this.b(decompilationErrorHandler1215.a, databaseStatementHandler3);
            }
            int n5 = complexEntityLifecycleManager.H();
            try {
                this.R(arrayList, n5);
                ReflectiveAccessMediator reflectiveAccessMediator = this;
                bl = !bl3;
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw ReflectiveAccessMediator.c(compilationDiagnosticException);
            }
            try {
                try {
                    reflectiveAccessMediator.m = bl;
                    if (databaseStatementHandler3 == null || !bl3) break block26;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw ReflectiveAccessMediator.c(compilationDiagnosticException);
                }
                databaseStatementHandler3.z(this);
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw ReflectiveAccessMediator.c(compilationDiagnosticException);
            }
        }
    }

    /*
     * Loose catch block
     */
    protected DecompilationAnalyzer S(PersistenceRecord persistenceRecord, boolean bl) throws CompilationDiagnosticException {
        block31: {
            block27: {
                block28: {
                    block24: {
                        boolean bl2;
                        DecompilationAnalyzer decompilationAnalyzer;
                        block25: {
                            block21: {
                                if (!(persistenceRecord instanceof SerializationContext)) break block24;
                                String string = ((SerializationContext)persistenceRecord).e();
                                decompilationAnalyzer = null;
                                try {
                                    decompilationAnalyzer = this.I.t(string);
                                }
                                catch (CustomRuntimeException customRuntimeException) {
                                    throw new ReflectionFieldResolver(string, persistenceRecord);
                                }
                                bl2 = ConfigurationOrchestrator2115.O(decompilationAnalyzer.A());
                                if (bl2) break block25;
                                try {
                                    block26: {
                                        if (!this.N) break block21;
                                        break block26;
                                        catch (CustomRuntimeException customRuntimeException) {
                                            throw ReflectiveAccessMediator.c(customRuntimeException);
                                        }
                                    }
                                    throw new CompilationDiagnosticException("not available in a static method: " + string);
                                }
                                catch (CustomRuntimeException customRuntimeException) {
                                    throw ReflectiveAccessMediator.c(customRuntimeException);
                                }
                            }
                            this.t.B(0);
                        }
                        this.v = bl2;
                        return decompilationAnalyzer;
                    }
                    if (!(persistenceRecord instanceof CryptographicPrimitiveManager)) break block27;
                    CryptographicPrimitiveManager cryptographicPrimitiveManager = (CryptographicPrimitiveManager)persistenceRecord;
                    int n = cryptographicPrimitiveManager.I();
                    if (n == 35) {
                        DecompilationAnalyzer decompilationAnalyzer = this.W.c(((TransmissionPayload)cryptographicPrimitiveManager.R()).e(), (TransmissionPayload)cryptographicPrimitiveManager.V());
                        this.v = true;
                        return decompilationAnalyzer;
                    }
                    if (n != 46) break block28;
                    DecompilationAnalyzer decompilationAnalyzer = null;
                    try {
                        block29: {
                            block23: {
                                block22: {
                                    try {
                                        cryptographicPrimitiveManager.R().z(this);
                                        if (this.P != 307 || this.C != 0) break block22;
                                    }
                                    catch (CustomRuntimeException customRuntimeException) {
                                        throw ReflectiveAccessMediator.c(customRuntimeException);
                                    }
                                    decompilationAnalyzer = this.W.p(this.o, (TransmissionPayload)cryptographicPrimitiveManager.V());
                                    break block29;
                                }
                                if (!bl) break block23;
                                try {
                                    block30: {
                                        if (this.C <= 0) break block23;
                                        break block30;
                                        catch (CustomRuntimeException customRuntimeException) {
                                            throw ReflectiveAccessMediator.c(customRuntimeException);
                                        }
                                    }
                                    if (!((TransmissionPayload)cryptographicPrimitiveManager.V()).e().equals("length")) break block23;
                                }
                                catch (CustomRuntimeException customRuntimeException) {
                                    throw ReflectiveAccessMediator.c(customRuntimeException);
                                }
                                return null;
                            }
                            ReflectiveAccessMediator.n();
                        }
                        boolean bl3 = ConfigurationOrchestrator2115.O(decompilationAnalyzer.A());
                        try {
                            if (bl3) {
                                this.t.E(87);
                            }
                        }
                        catch (CustomRuntimeException customRuntimeException) {
                            throw ReflectiveAccessMediator.c(customRuntimeException);
                        }
                        this.v = bl3;
                        return decompilationAnalyzer;
                    }
                    catch (ReflectionFieldResolver reflectionFieldResolver) {
                        try {
                            if (reflectionFieldResolver.l() != cryptographicPrimitiveManager.R()) {
                                throw reflectionFieldResolver;
                            }
                        }
                        catch (CustomRuntimeException customRuntimeException) {
                            throw ReflectiveAccessMediator.c(customRuntimeException);
                        }
                        TransmissionPayload transmissionPayload = (TransmissionPayload)cryptographicPrimitiveManager.V();
                        String string = reflectionFieldResolver.Y();
                        decompilationAnalyzer = this.W.G(string, transmissionPayload, persistenceRecord);
                        this.v = true;
                        return decompilationAnalyzer;
                    }
                }
                ReflectiveAccessMediator.n();
                break block31;
            }
            ReflectiveAccessMediator.n();
        }
        this.v = false;
        return null;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2E7F;
        if (y[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = x[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])D.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    D.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/aT", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ReflectiveAccessMediator.y[n2] = n3;
        }
        return y[n2];
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ReflectiveAccessMediator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

