/*
 * Decompiled with CFR 0.152.
 */
package com.runtime.descriptor;

import a.eF;
import com.app.database.operations.DatabaseStatementHandler;
import com.app.network.ConnectionEstablishmentContract;
import com.app.security.crypto.CryptographicPrimitiveManager;
import com.collections.management.MultiContainerRegistry;
import com.core.exception.CustomRuntimeException;
import com.data.persistence.PersistenceRecord;
import com.data.serialization.SerializationContext;
import com.entity.lifecycle.ComplexEntityLifecycleManager;
import com.event.orchestration.DeclarativeEventOrchestrator;
import com.exception.system.CustomSystemException;
import com.logging.audit.AuditTrailLogger;
import com.metadata.reflection.ReflectionMetadataExtractor;
import com.network.messaging.TransmissionPayload;
import com.reflection.access.ReflectiveAccessMediator;
import com.reflection.management.ClassPoolRegistry;
import com.reflection.metadata.ReflectionMetadataResolver933;
import com.reflection.registry.MetaclassDefinitionRegistry;
import com.reflection.utils.TypeInspectionUtility;
import com.security.transform.SecureDataTransformer1124;
import com.system.compilation.CompilationDiagnosticException;
import com.system.config.PersistentConfigurationMap;
import com.user.profile.UserProfileManager1412;
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

public class RuntimeDescriptorParser
extends ReflectiveAccessMediator {
    private MetaclassDefinitionRegistry U = null;
    private boolean r = false;
    MetaclassDefinitionRegistry s = null;
    private static final long[] E;
    String c = null;
    String j = null;
    private static final Integer[] H;
    MetaclassDefinitionRegistry[] Q = null;
    private String G = null;
    private int f = 0;
    ConnectionEstablishmentContract A = null;
    private static final long e;
    private String i = null;
    String J = null;
    private static final Map K;
    String q = null;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected void J(CryptographicPrimitiveManager cryptographicPrimitiveManager, int n, PersistenceRecord persistenceRecord, PersistenceRecord persistenceRecord2, boolean bl) throws CompilationDiagnosticException {
        block12: {
            block14: {
                block13: {
                    try {
                        try {
                            try {
                                if (!(persistenceRecord instanceof SerializationContext) || !((SerializationContext)persistenceRecord).e().equals(this.q)) break block12;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                            }
                            if (n == 61) break block13;
                            throw new CompilationDiagnosticException("bad operator for " + this.q);
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                        }
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                    }
                }
                try {
                    try {
                        persistenceRecord2.z(this);
                        if (this.C == 1 && this.P == 307) break block14;
                        throw new CompilationDiagnosticException("invalid type for " + this.q);
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                    }
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                }
            }
            try {
                this.N(this.Q, this.t);
                if (bl) return;
                this.t.E(87);
                return;
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw RuntimeDescriptorParser.a(compilationDiagnosticException);
            }
        }
        super.J(cryptographicPrimitiveManager, n, persistenceRecord, persistenceRecord2, bl);
    }

    public void w(MetaclassDefinitionRegistry metaclassDefinitionRegistry) throws CompilationDiagnosticException {
        this.L(metaclassDefinitionRegistry, 0);
    }

    public void A() {
        long l = e ^ 0x3F4F27F389E9L;
        try {
            if (this.P == 344) {
                this.t.E(1);
                this.P = (int)RuntimeDescriptorParser.c("u", (int)8677, (long)(0x314C58FA8F82DDBL ^ l));
                this.C = 0;
                this.o = "java/lang/Object";
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeDescriptorParser.a(customSystemException);
        }
    }

    @Override
    public void J(SerializationContext serializationContext) throws CompilationDiagnosticException {
        block13: {
            block17: {
                block18: {
                    String string;
                    block15: {
                        block16: {
                            block14: {
                                long l;
                                block12: {
                                    l = e ^ 0x524C28FA6E19L;
                                    string = serializationContext.e();
                                    try {
                                        if (!string.equals(this.q)) break block12;
                                        RuntimeDescriptorParser.Q(this.t, this.Q, this.K());
                                        this.P = (int)RuntimeDescriptorParser.c("u", (int)6516, (long)(0x383D7218EE7FF2B9L ^ l));
                                        this.C = 1;
                                        this.o = "java/lang/Object";
                                        break block13;
                                    }
                                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                                        throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                                    }
                                }
                                try {
                                    if (!string.equals("$sig")) break block14;
                                    this.t.r(ReflectionMetadataResolver933.Q(this.s, this.Q));
                                    this.t.e("javassist/runtime/Desc", "getParams", "(Ljava/lang/String;)[Ljava/lang/Class;");
                                    this.P = (int)RuntimeDescriptorParser.c("u", (int)6516, (long)(0x383D7218EE7FF2B9L ^ l));
                                    this.C = 1;
                                    this.o = "java/lang/Class";
                                    break block13;
                                }
                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                    throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                                }
                            }
                            try {
                                try {
                                    if (!string.equals("$type")) break block15;
                                    if (this.U != null) break block16;
                                }
                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                    throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                                }
                                throw new CompilationDiagnosticException("$type is not available");
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                            }
                        }
                        this.t.r(ReflectionMetadataResolver933.H(this.U));
                        this.p("getType");
                        break block13;
                    }
                    try {
                        try {
                            if (!string.equals("$class")) break block17;
                            if (this.i != null) break block18;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                        }
                        throw new CompilationDiagnosticException("$class is not available");
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                    }
                }
                this.t.r(this.i);
                this.p("getClazz");
                break block13;
            }
            super.J(serializationContext);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void L(MetaclassDefinitionRegistry metaclassDefinitionRegistry, int n) throws CompilationDiagnosticException {
        long l = e ^ 0x4AF346A260AEL;
        if (metaclassDefinitionRegistry.m()) {
            UserProfileManager1412 userProfileManager1412 = (UserProfileManager1412)metaclassDefinitionRegistry;
            this.P = TypeInspectionUtility.y(userProfileManager1412.y());
            this.C = n;
            this.o = null;
            return;
        }
        try {
            if (metaclassDefinitionRegistry.p()) {
                try {
                    this.L(metaclassDefinitionRegistry.r(), n + 1);
                    return;
                }
                catch (CustomRuntimeException customRuntimeException) {
                    throw new CompilationDiagnosticException("undefined type: " + metaclassDefinitionRegistry.H());
                }
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw RuntimeDescriptorParser.a(compilationDiagnosticException);
        }
        this.P = (int)RuntimeDescriptorParser.c("u", (int)6516, (long)(0x383D6AA78027FC0EL ^ l));
        this.C = n;
        this.o = TypeInspectionUtility.i(metaclassDefinitionRegistry.H());
    }

    @Override
    public void s(SecureDataTransformer1124 secureDataTransformer1124) throws CompilationDiagnosticException {
        block10: {
            eF eF2 = secureDataTransformer1124.l();
            try {
                if (eF2 == null || secureDataTransformer1124.P() != 0) break block10;
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw RuntimeDescriptorParser.a(compilationDiagnosticException);
            }
            PersistenceRecord persistenceRecord = eF2.l();
            try {
                if (!(persistenceRecord instanceof TransmissionPayload) || eF2.n() != null) break block10;
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw RuntimeDescriptorParser.a(compilationDiagnosticException);
            }
            String string = ((TransmissionPayload)persistenceRecord).e();
            try {
                if (string.equals(this.j)) {
                    this.a(secureDataTransformer1124);
                    return;
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw RuntimeDescriptorParser.a(compilationDiagnosticException);
            }
            try {
                if (string.equals("$w")) {
                    this.k(secureDataTransformer1124);
                    return;
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw RuntimeDescriptorParser.a(compilationDiagnosticException);
            }
        }
        super.s(secureDataTransformer1124);
    }

    public void v(MetaclassDefinitionRegistry metaclassDefinitionRegistry) throws CompilationDiagnosticException {
        block4: {
            block5: {
                try {
                    try {
                        if (this.C != 0 || RuntimeDescriptorParser.V(this.P)) break block4;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                    }
                    if (!(metaclassDefinitionRegistry instanceof UserProfileManager1412)) break block5;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                }
                UserProfileManager1412 userProfileManager1412 = (UserProfileManager1412)metaclassDefinitionRegistry;
                this.p(this.P, TypeInspectionUtility.y(userProfileManager1412.y()));
                break block4;
            }
            throw new CompilationDiagnosticException("type mismatch");
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = MultiContainerRegistry.a(1741022377279286411L, -8730193075993000693L, MethodHandles.lookup().lookupClass()).a(103940464875809L);
        K = new HashMap(13);
        long l = e ^ 0x5DBC0FEF5D71L;
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
        String string = "\u0097]\u000eq\u00f9\u00a3j}S\u0014\u00f0\u008d\u00ad0\u00d2|+\u009cO-\u009b\u0010\u0099\u0013";
        int n2 = "\u0097]\u000eq\u00f9\u00a3j}S\u0014\u00f0\u008d\u00ad0\u00d2|+\u009cO-\u009b\u0010\u0099\u0013".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        E = lArray;
        H = new Integer[3];
    }

    protected void r(MetaclassDefinitionRegistry metaclassDefinitionRegistry, ComplexEntityLifecycleManager complexEntityLifecycleManager) throws CompilationDiagnosticException {
        try {
            if (metaclassDefinitionRegistry == MetaclassDefinitionRegistry.M) {
                this.A();
                return;
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw RuntimeDescriptorParser.a(compilationDiagnosticException);
        }
        try {
            if (this.P == 344) {
                throw new CompilationDiagnosticException("invalid type for " + this.j);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw RuntimeDescriptorParser.a(compilationDiagnosticException);
        }
        if (metaclassDefinitionRegistry instanceof UserProfileManager1412) {
            UserProfileManager1412 userProfileManager1412 = (UserProfileManager1412)metaclassDefinitionRegistry;
            String string = userProfileManager1412.C();
            complexEntityLifecycleManager.U(string);
            complexEntityLifecycleManager.J(string, userProfileManager1412.S(), userProfileManager1412.t());
            this.w(metaclassDefinitionRegistry);
        } else {
            complexEntityLifecycleManager.K(metaclassDefinitionRegistry);
            this.w(metaclassDefinitionRegistry);
        }
    }

    protected void k(SecureDataTransformer1124 secureDataTransformer1124) throws CompilationDiagnosticException {
        long l;
        block7: {
            l = e ^ 0x72EEFFFE2B0DL;
            try {
                try {
                    secureDataTransformer1124.m().z(this);
                    if (!RuntimeDescriptorParser.V(this.P) && this.C <= 0) break block7;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                }
                return;
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw RuntimeDescriptorParser.a(compilationDiagnosticException);
            }
        }
        MetaclassDefinitionRegistry metaclassDefinitionRegistry = this.W.b(this.P, this.C, this.o);
        if (metaclassDefinitionRegistry instanceof UserProfileManager1412) {
            String string;
            UserProfileManager1412 userProfileManager1412;
            block9: {
                block8: {
                    userProfileManager1412 = (UserProfileManager1412)metaclassDefinitionRegistry;
                    string = userProfileManager1412.C();
                    try {
                        this.t.p(string);
                        this.t.E(89);
                        if (userProfileManager1412.m() <= 1) break block8;
                        this.t.E(94);
                        break block9;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                    }
                }
                this.t.E(93);
            }
            this.t.E(88);
            this.t.A(string, "<init>", "(" + userProfileManager1412.y() + ")V");
            this.P = (int)RuntimeDescriptorParser.c("u", (int)6516, (long)(0x383D52BA397BB7ADL ^ l));
            this.C = 0;
            this.o = "java/lang/Object";
        }
    }

    protected void a(SecureDataTransformer1124 secureDataTransformer1124) throws CompilationDiagnosticException {
        block10: {
            block9: {
                try {
                    block8: {
                        try {
                            try {
                                secureDataTransformer1124.m().z(this);
                                if (this.P == 344 || RuntimeDescriptorParser.V(this.P)) break block8;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                            }
                            if (this.C <= 0) break block9;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                        }
                    }
                    this.r(this.s, this.t);
                    break block10;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                }
            }
            if (this.s instanceof UserProfileManager1412) {
                UserProfileManager1412 userProfileManager1412 = (UserProfileManager1412)this.s;
                int n = TypeInspectionUtility.y(userProfileManager1412.y());
                this.p(this.P, n);
                this.P = n;
                this.C = 0;
                this.o = null;
            } else {
                throw new CompilationDiagnosticException("invalid cast");
            }
        }
    }

    @Override
    public void f(AuditTrailLogger auditTrailLogger) throws CompilationDiagnosticException {
        PersistenceRecord persistenceRecord = auditTrailLogger.R();
        if (persistenceRecord instanceof SerializationContext) {
            String string;
            block8: {
                string = ((SerializationContext)persistenceRecord).e();
                try {
                    try {
                        if (this.A == null || !string.equals(this.c)) break block8;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                    }
                    this.A.o(this, this.t, (eF)auditTrailLogger.V());
                    return;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                }
            }
            try {
                if (string.equals("$cflow")) {
                    this.b((eF)auditTrailLogger.V());
                    return;
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw RuntimeDescriptorParser.a(compilationDiagnosticException);
            }
        }
        super.f(auditTrailLogger);
    }

    public void N(String string, String string2, int n, PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        String string3;
        int n2;
        int n3;
        block5: {
            block6: {
                char c;
                n3 = 0;
                while (true) {
                    c = string.charAt(n3);
                    try {
                        if (c != '[') break;
                        ++n3;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                    }
                }
                n2 = TypeInspectionUtility.y(c);
                string3 = null;
                try {
                    if (n2 != 307) break block5;
                    if (n3 != 0) break block6;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                }
                string3 = string.substring(1, string.length() - 1);
                break block5;
            }
            string3 = string.substring(n3 + 1, string.length() - 1);
        }
        DeclarativeEventOrchestrator declarativeEventOrchestrator = new DeclarativeEventOrchestrator(n2, string3, n3, n, new TransmissionPayload(string2));
        persistentConfigurationMap.s(string2, declarativeEventOrchestrator);
    }

    public boolean O(eF eF2) {
        block8: {
            boolean bl;
            block10: {
                block9: {
                    try {
                        try {
                            if (this.Q == null || eF2 == null) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw RuntimeDescriptorParser.a(customSystemException);
                        }
                        if (eF2.n() != null) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RuntimeDescriptorParser.a(customSystemException);
                    }
                    PersistenceRecord persistenceRecord = eF2.l();
                    try {
                        try {
                            if (!(persistenceRecord instanceof SerializationContext) || !((SerializationContext)persistenceRecord).e().equals(this.J)) break block9;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw RuntimeDescriptorParser.a(customSystemException);
                        }
                        bl = true;
                        break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RuntimeDescriptorParser.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x38B1;
        if (H[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = E[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])K.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    K.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/av", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            RuntimeDescriptorParser.H[n2] = n3;
        }
        return H[n2];
    }

    public int u(MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray, boolean bl, String string, String string2, String string3, PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        boolean bl2;
        String string4;
        String string5;
        String string6;
        boolean bl3;
        MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray2;
        RuntimeDescriptorParser runtimeDescriptorParser;
        try {
            runtimeDescriptorParser = this;
            metaclassDefinitionRegistryArray2 = metaclassDefinitionRegistryArray;
            bl3 = bl;
            string6 = string;
            string5 = string2;
            string4 = string3;
            bl2 = !bl;
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw RuntimeDescriptorParser.a(compilationDiagnosticException);
        }
        return runtimeDescriptorParser.k(metaclassDefinitionRegistryArray2, bl3, string6, string5, string4, bl2, 0, this.O(), persistentConfigurationMap);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    protected void a(DatabaseStatementHandler databaseStatementHandler) throws CompilationDiagnosticException {
        PersistenceRecord persistenceRecord;
        block9: {
            block11: {
                block10: {
                    persistenceRecord = databaseStatementHandler.Z();
                    try {
                        try {
                            try {
                                if (persistenceRecord == null || this.s != MetaclassDefinitionRegistry.M) break block9;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                            }
                            this.p(persistenceRecord);
                            if (!RuntimeDescriptorParser.g(this.P, this.C)) break block10;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                        }
                        this.t.E(88);
                        break block11;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                    }
                }
                try {
                    if (this.P != 344) {
                        this.t.E(87);
                    }
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                }
            }
            persistenceRecord = null;
        }
        this.y(persistenceRecord);
    }

    public void i(ConnectionEstablishmentContract connectionEstablishmentContract, String string) {
        this.c = string;
        this.A = connectionEstablishmentContract;
    }

    public int k(MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray, boolean bl, String string, String string2, String string3, boolean bl2, int n, String string4, PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        try {
            this.Q = metaclassDefinitionRegistryArray;
            this.q = string2;
            this.J = string3;
            this.f = n;
            this.r = bl2;
            if (string4 != null) {
                this.i = TypeInspectionUtility.M(string4);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw RuntimeDescriptorParser.a(compilationDiagnosticException);
        }
        this.N = bl;
        int n2 = n;
        if (bl2) {
            String string5 = string + "0";
            DeclarativeEventOrchestrator declarativeEventOrchestrator = new DeclarativeEventOrchestrator(307, TypeInspectionUtility.i(string4), 0, n2++, new TransmissionPayload(string5));
            persistentConfigurationMap.s(string5, declarativeEventOrchestrator);
        }
        for (int i = 0; i < metaclassDefinitionRegistryArray.length; ++i) {
            n2 += this.v(metaclassDefinitionRegistryArray[i], string + (i + 1), n2, persistentConfigurationMap);
        }
        try {
            if (this.H() < n2) {
                this.f(n2);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw RuntimeDescriptorParser.a(compilationDiagnosticException);
        }
        return n2;
    }

    private static void O(StringBuilder stringBuilder, PersistenceRecord persistenceRecord) throws CompilationDiagnosticException {
        try {
            if (persistenceRecord instanceof TransmissionPayload) {
                stringBuilder.append(((TransmissionPayload)persistenceRecord).e());
                return;
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw RuntimeDescriptorParser.a(compilationDiagnosticException);
        }
        if (persistenceRecord instanceof CryptographicPrimitiveManager) {
            CryptographicPrimitiveManager cryptographicPrimitiveManager = (CryptographicPrimitiveManager)persistenceRecord;
            try {
                if (cryptographicPrimitiveManager.I() == 46) {
                    RuntimeDescriptorParser.O(stringBuilder, cryptographicPrimitiveManager.R());
                    stringBuilder.append('.');
                    RuntimeDescriptorParser.O(stringBuilder, cryptographicPrimitiveManager.V());
                    return;
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw RuntimeDescriptorParser.a(compilationDiagnosticException);
            }
        }
        throw new CompilationDiagnosticException("bad $cflow");
    }

    private void p(String string) {
        long l = e ^ 0x774C9BED3622L;
        this.t.e("javassist/runtime/Desc", string, "(Ljava/lang/String;)Ljava/lang/Class;");
        this.P = (int)RuntimeDescriptorParser.c("u", (int)6516, (long)(0x383D57185D68AA82L ^ l));
        this.C = 0;
        this.o = "java/lang/Class";
    }

    public void c(MetaclassDefinitionRegistry metaclassDefinitionRegistry) {
        this.U = metaclassDefinitionRegistry;
    }

    private int v(MetaclassDefinitionRegistry metaclassDefinitionRegistry, String string, int n, PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        int n2;
        block5: {
            block4: {
                long l = e ^ 0x7C64AE7F6E38L;
                try {
                    if (metaclassDefinitionRegistry != MetaclassDefinitionRegistry.M) break block4;
                    this.P = (int)RuntimeDescriptorParser.c("u", (int)6516, (long)(0x383D5C3068FAF298L ^ l));
                    this.C = 0;
                    this.o = "java/lang/Object";
                    break block5;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                }
            }
            this.w(metaclassDefinitionRegistry);
        }
        DeclarativeEventOrchestrator declarativeEventOrchestrator = new DeclarativeEventOrchestrator(this.P, this.o, this.C, n, new TransmissionPayload(string));
        try {
            persistentConfigurationMap.s(string, declarativeEventOrchestrator);
            n2 = RuntimeDescriptorParser.g(this.P, this.C) ? 2 : 1;
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw RuntimeDescriptorParser.a(compilationDiagnosticException);
        }
        return n2;
    }

    void f(PersistenceRecord persistenceRecord, int n, String string, eF eF2) throws CompilationDiagnosticException {
        persistenceRecord.z(this);
        int n2 = this.Y(eF2);
        this.F(eF2, new int[n2], new int[n2], new String[n2]);
        this.t.n(n, string);
        this.Q(string, false, false);
        this.A();
    }

    public RuntimeDescriptorParser(ComplexEntityLifecycleManager complexEntityLifecycleManager, MetaclassDefinitionRegistry metaclassDefinitionRegistry, ClassPoolRegistry classPoolRegistry) {
        super(complexEntityLifecycleManager, metaclassDefinitionRegistry, classPoolRegistry);
        this.X(new ReflectionMetadataExtractor(metaclassDefinitionRegistry, classPoolRegistry, this));
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = RuntimeDescriptorParser.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/av" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public int p(MetaclassDefinitionRegistry metaclassDefinitionRegistry, String string, String string2, PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        try {
            this.s = metaclassDefinitionRegistry;
            this.j = string;
            this.G = string2;
            if (string2 == null) {
                return -1;
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw RuntimeDescriptorParser.a(compilationDiagnosticException);
        }
        int n = this.H();
        int n2 = n + this.v(metaclassDefinitionRegistry, string2, n, persistentConfigurationMap);
        this.f(n2);
        return n;
    }

    @Override
    public int Y(eF eF2) {
        String string = this.J;
        int n = 0;
        while (eF2 != null) {
            block6: {
                block5: {
                    PersistenceRecord persistenceRecord = eF2.l();
                    try {
                        try {
                            if (!(persistenceRecord instanceof SerializationContext) || !((SerializationContext)persistenceRecord).e().equals(string)) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw RuntimeDescriptorParser.a(customSystemException);
                        }
                        if (this.Q == null) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RuntimeDescriptorParser.a(customSystemException);
                    }
                    n += this.Q.length;
                    break block6;
                }
                ++n;
            }
            eF2 = eF2.n();
        }
        return n;
    }

    protected void N(MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray, ComplexEntityLifecycleManager complexEntityLifecycleManager) throws CompilationDiagnosticException {
        try {
            if (metaclassDefinitionRegistryArray == null) {
                return;
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw RuntimeDescriptorParser.a(compilationDiagnosticException);
        }
        int n = this.K();
        int n2 = metaclassDefinitionRegistryArray.length;
        int n3 = 0;
        while (true) {
            int n4;
            int n5;
            block9: {
                block8: {
                    try {
                        try {
                            if (n3 >= n2) break;
                            complexEntityLifecycleManager.E(89);
                            complexEntityLifecycleManager.a(n3);
                            complexEntityLifecycleManager.E(50);
                            this.r(metaclassDefinitionRegistryArray[n3], complexEntityLifecycleManager);
                            complexEntityLifecycleManager.P(n, metaclassDefinitionRegistryArray[n3]);
                            n5 = n;
                            if (!RuntimeDescriptorParser.g(this.P, this.C)) break block8;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                        }
                        n4 = 2;
                        break block9;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                    }
                }
                n4 = 1;
            }
            n = n5 + n4;
            ++n3;
        }
    }

    protected void b(eF eF2) throws CompilationDiagnosticException {
        StringBuilder stringBuilder;
        long l;
        block7: {
            l = e ^ 0x5EAD6DB70D08L;
            stringBuilder = new StringBuilder();
            try {
                try {
                    if (eF2 != null && eF2.n() == null) break block7;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                }
                throw new CompilationDiagnosticException("bad $cflow");
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw RuntimeDescriptorParser.a(compilationDiagnosticException);
            }
        }
        RuntimeDescriptorParser.O(stringBuilder, eF2.l());
        String string = stringBuilder.toString();
        Object[] objectArray = this.W.X().s(string);
        try {
            if (objectArray == null) {
                throw new CompilationDiagnosticException("no such $cflow: " + string);
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw RuntimeDescriptorParser.a(compilationDiagnosticException);
        }
        this.t.q((String)objectArray[0], (String)objectArray[1], "Ljavassist/runtime/Cflow;");
        this.t.J("javassist.runtime.Cflow", "value", "()I");
        this.P = (int)RuntimeDescriptorParser.c("u", (int)15188, (long)(0x66B93200F483338AL ^ l));
        this.C = 0;
        this.o = null;
    }

    @Override
    public void F(eF eF2, int[] nArray, int[] nArray2, String[] stringArray) throws CompilationDiagnosticException {
        MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray = this.Q;
        String string = this.J;
        int n = 0;
        while (eF2 != null) {
            block7: {
                PersistenceRecord persistenceRecord;
                block6: {
                    persistenceRecord = eF2.l();
                    try {
                        try {
                            if (!(persistenceRecord instanceof SerializationContext) || !((SerializationContext)persistenceRecord).e().equals(string)) break block6;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                        }
                        if (metaclassDefinitionRegistryArray == null) break block7;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw RuntimeDescriptorParser.a(compilationDiagnosticException);
                    }
                    int n2 = metaclassDefinitionRegistryArray.length;
                    int n3 = this.K();
                    for (int i = 0; i < n2; ++i) {
                        MetaclassDefinitionRegistry metaclassDefinitionRegistry = metaclassDefinitionRegistryArray[i];
                        n3 += this.t.y(n3, metaclassDefinitionRegistry);
                        this.w(metaclassDefinitionRegistry);
                        nArray[n] = this.P;
                        nArray2[n] = this.C;
                        stringArray[n] = this.o;
                        ++n;
                    }
                    break block7;
                }
                persistenceRecord.z(this);
                nArray[n] = this.P;
                nArray2[n] = this.C;
                stringArray[n] = this.o;
                ++n;
            }
            eF2 = eF2.n();
        }
    }

    public static int Q(ComplexEntityLifecycleManager complexEntityLifecycleManager, MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray, int n) {
        try {
            if (metaclassDefinitionRegistryArray == null) {
                complexEntityLifecycleManager.a(0);
                complexEntityLifecycleManager.m("java.lang.Object");
                return 1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeDescriptorParser.a(customSystemException);
        }
        MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray2 = new MetaclassDefinitionRegistry[1];
        int n2 = metaclassDefinitionRegistryArray.length;
        complexEntityLifecycleManager.a(n2);
        complexEntityLifecycleManager.m("java.lang.Object");
        int n3 = 0;
        while (true) {
            block7: {
                block6: {
                    try {
                        if (n3 >= n2) break;
                        complexEntityLifecycleManager.E(89);
                        complexEntityLifecycleManager.a(n3);
                        if (!metaclassDefinitionRegistryArray[n3].m()) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RuntimeDescriptorParser.a(customSystemException);
                    }
                    UserProfileManager1412 userProfileManager1412 = (UserProfileManager1412)metaclassDefinitionRegistryArray[n3];
                    String string = userProfileManager1412.C();
                    complexEntityLifecycleManager.p(string);
                    complexEntityLifecycleManager.E(89);
                    int n4 = complexEntityLifecycleManager.y(n, userProfileManager1412);
                    n += n4;
                    metaclassDefinitionRegistryArray2[0] = userProfileManager1412;
                    complexEntityLifecycleManager.A(string, "<init>", ReflectionMetadataResolver933.Q(MetaclassDefinitionRegistry.M, metaclassDefinitionRegistryArray2));
                    break block7;
                }
                complexEntityLifecycleManager.B(n);
                ++n;
            }
            complexEntityLifecycleManager.E(83);
            ++n3;
        }
        return 8;
    }

    private int K() {
        int n;
        int n2;
        try {
            n2 = this.f;
            n = this.r ? 1 : 0;
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeDescriptorParser.a(customSystemException);
        }
        return n2 + n;
    }

    public int e(MetaclassDefinitionRegistry metaclassDefinitionRegistry, String string, PersistentConfigurationMap persistentConfigurationMap) throws CompilationDiagnosticException {
        try {
            if (string == null) {
                return -1;
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw RuntimeDescriptorParser.a(compilationDiagnosticException);
        }
        int n = this.H();
        int n2 = n + this.v(metaclassDefinitionRegistry, string, n, persistentConfigurationMap);
        this.f(n2);
        return n;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(RuntimeDescriptorParser.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

