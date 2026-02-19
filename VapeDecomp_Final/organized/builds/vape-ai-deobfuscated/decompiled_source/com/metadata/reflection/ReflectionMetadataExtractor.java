/*
 * Decompiled with CFR 0.152.
 */
package com.metadata.reflection;

import a.eF;
import com.app.security.crypto.CryptographicPrimitiveManager;
import com.collections.management.MultiContainerRegistry;
import com.core.exception.CustomRuntimeException;
import com.data.persistence.PersistenceRecord;
import com.data.serialization.SerializationContext;
import com.exception.system.CustomSystemException;
import com.logging.audit.AuditTrailLogger;
import com.metadata.extraction.MetadataExtractionEngine;
import com.network.messaging.TransmissionPayload;
import com.reflection.management.ClassPoolRegistry;
import com.reflection.registry.MetaclassDefinitionRegistry;
import com.reflection.utils.TypeInspectionUtility;
import com.runtime.descriptor.RuntimeDescriptorParser;
import com.security.transform.SecureDataTransformer1124;
import com.system.compilation.CompilationDiagnosticException;
import com.system.validation.SafetyComplianceValidator;
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

public class ReflectionMetadataExtractor
extends MetadataExtractionEngine {
    private static final long[] h;
    private RuntimeDescriptorParser H;
    private static final Map k;
    private static final Integer[] i;
    private static final long b;

    @Override
    protected void Z(CryptographicPrimitiveManager cryptographicPrimitiveManager, int n, PersistenceRecord persistenceRecord, PersistenceRecord persistenceRecord2) throws CompilationDiagnosticException {
        block8: {
            try {
                if (!(persistenceRecord instanceof SerializationContext) || !((SerializationContext)persistenceRecord).e().equals(this.H.q)) break block8;
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw ReflectionMetadataExtractor.a(compilationDiagnosticException);
            }
            persistenceRecord2.z(this);
            MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray = this.H.Q;
            try {
                if (metaclassDefinitionRegistryArray == null) {
                    return;
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw ReflectionMetadataExtractor.a(compilationDiagnosticException);
            }
            int n2 = metaclassDefinitionRegistryArray.length;
            try {
                for (int i = 0; i < n2; ++i) {
                    this.o(metaclassDefinitionRegistryArray[i]);
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw ReflectionMetadataExtractor.a(compilationDiagnosticException);
            }
        }
        super.Z(cryptographicPrimitiveManager, n, persistenceRecord, persistenceRecord2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = MultiContainerRegistry.a(-2461855529170486887L, 609868666461702050L, MethodHandles.lookup().lookupClass()).a(216502232677431L);
        k = new HashMap(13);
        long l = b ^ 0x385F56D0D4CL;
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
        String string = "\u00cf\u00b3\u00be^\u001d\u00ab\u0090 y\u00bf\u00aa\u008c\u00dc\u0094\u0098\u00b3C\u00e6w\u0089\u001e\u009a\u00f0\u001c";
        int n2 = "\u00cf\u00b3\u00be^\u001d\u00ab\u0090 y\u00bf\u00aa\u008c\u00dc\u0094\u0098\u00b3C\u00e6w\u0089\u001e\u009a\u00f0\u001c".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        h = lArray;
        i = new Integer[3];
    }

    protected void E(SecureDataTransformer1124 secureDataTransformer1124) throws CompilationDiagnosticException {
        long l;
        block7: {
            l = b ^ 0x7198F3B9018L;
            try {
                try {
                    secureDataTransformer1124.m().z(this);
                    if (!SafetyComplianceValidator.V(this.j) && this.P <= 0) break block7;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw ReflectionMetadataExtractor.a(compilationDiagnosticException);
                }
                return;
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw ReflectionMetadataExtractor.a(compilationDiagnosticException);
            }
        }
        MetaclassDefinitionRegistry metaclassDefinitionRegistry = this.M.b(this.j, this.P, this.w);
        try {
            if (metaclassDefinitionRegistry instanceof UserProfileManager1412) {
                this.j = (int)ReflectionMetadataExtractor.b("w", (int)21664, (long)(0x7B741CE376D1145AL ^ l));
                this.P = 0;
                this.w = "java/lang/Object";
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw ReflectionMetadataExtractor.a(compilationDiagnosticException);
        }
    }

    protected void n(SecureDataTransformer1124 secureDataTransformer1124) throws CompilationDiagnosticException {
        block9: {
            MetaclassDefinitionRegistry metaclassDefinitionRegistry;
            block8: {
                metaclassDefinitionRegistry = this.H.s;
                try {
                    block7: {
                        try {
                            try {
                                secureDataTransformer1124.m().z(this);
                                if (this.j == 344 || SafetyComplianceValidator.V(this.j)) break block7;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw ReflectionMetadataExtractor.a(compilationDiagnosticException);
                            }
                            if (this.P <= 0) break block8;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw ReflectionMetadataExtractor.a(compilationDiagnosticException);
                        }
                    }
                    this.o(metaclassDefinitionRegistry);
                    break block9;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw ReflectionMetadataExtractor.a(compilationDiagnosticException);
                }
            }
            if (metaclassDefinitionRegistry instanceof UserProfileManager1412) {
                int n;
                UserProfileManager1412 userProfileManager1412 = (UserProfileManager1412)metaclassDefinitionRegistry;
                this.j = n = TypeInspectionUtility.y(userProfileManager1412.y());
                this.P = 0;
                this.w = null;
            }
        }
    }

    public void I(MetaclassDefinitionRegistry metaclassDefinitionRegistry) throws CompilationDiagnosticException {
        this.N(metaclassDefinitionRegistry, 0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void N(MetaclassDefinitionRegistry metaclassDefinitionRegistry, int n) throws CompilationDiagnosticException {
        long l = b ^ 0xCBC15886034L;
        if (metaclassDefinitionRegistry.m()) {
            UserProfileManager1412 userProfileManager1412 = (UserProfileManager1412)metaclassDefinitionRegistry;
            this.j = TypeInspectionUtility.y(userProfileManager1412.y());
            this.P = n;
            this.w = null;
            return;
        }
        try {
            if (metaclassDefinitionRegistry.p()) {
                try {
                    this.N(metaclassDefinitionRegistry.r(), n + 1);
                    return;
                }
                catch (CustomRuntimeException customRuntimeException) {
                    throw new CompilationDiagnosticException("undefined type: " + metaclassDefinitionRegistry.H());
                }
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw ReflectionMetadataExtractor.a(compilationDiagnosticException);
        }
        this.j = (int)ReflectionMetadataExtractor.b("w", (int)21664, (long)(0x7B741746EC62E476L ^ l));
        this.P = n;
        this.w = TypeInspectionUtility.i(metaclassDefinitionRegistry.H());
    }

    @Override
    public void J(SerializationContext serializationContext) throws CompilationDiagnosticException {
        block9: {
            block11: {
                String string;
                long l;
                block10: {
                    block8: {
                        l = b ^ 0x1FE948ED7BBEL;
                        string = serializationContext.e();
                        try {
                            if (!string.equals(this.H.q)) break block8;
                            this.j = (int)ReflectionMetadataExtractor.b("w", (int)25205, (long)(0x7366460664E0C92BL ^ l));
                            this.P = 1;
                            this.w = "java/lang/Object";
                            break block9;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw ReflectionMetadataExtractor.a(compilationDiagnosticException);
                        }
                    }
                    try {
                        if (!string.equals("$sig")) break block10;
                        this.j = (int)ReflectionMetadataExtractor.b("w", (int)21664, (long)(0x7B740413B107FFFCL ^ l));
                        this.P = 1;
                        this.w = "java/lang/Class";
                        break block9;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw ReflectionMetadataExtractor.a(compilationDiagnosticException);
                    }
                }
                try {
                    try {
                        if (!string.equals("$type") && !string.equals("$class")) break block11;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw ReflectionMetadataExtractor.a(compilationDiagnosticException);
                    }
                    this.j = (int)ReflectionMetadataExtractor.b("w", (int)21664, (long)(0x7B740413B107FFFCL ^ l));
                    this.P = 0;
                    this.w = "java/lang/Class";
                    break block9;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw ReflectionMetadataExtractor.a(compilationDiagnosticException);
                }
            }
            super.J(serializationContext);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public void Y() {
        long l = b ^ 0x63D50B13B0EFL;
        try {
            if (this.j == 344) {
                this.j = (int)ReflectionMetadataExtractor.b("w", (int)21664, (long)(0x7B74782FF2F934ADL ^ l));
                this.P = 0;
                this.w = "java/lang/Object";
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ReflectionMetadataExtractor.a(customSystemException);
        }
    }

    @Override
    public void e(eF eF2, int[] nArray, int[] nArray2, String[] stringArray) throws CompilationDiagnosticException {
        MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray = this.H.Q;
        String string = this.H.J;
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
                            throw ReflectionMetadataExtractor.a(compilationDiagnosticException);
                        }
                        if (metaclassDefinitionRegistryArray == null) break block7;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw ReflectionMetadataExtractor.a(compilationDiagnosticException);
                    }
                    int n2 = metaclassDefinitionRegistryArray.length;
                    for (int i = 0; i < n2; ++i) {
                        MetaclassDefinitionRegistry metaclassDefinitionRegistry = metaclassDefinitionRegistryArray[i];
                        this.I(metaclassDefinitionRegistry);
                        nArray[n] = this.j;
                        nArray2[n] = this.P;
                        stringArray[n] = this.w;
                        ++n;
                    }
                    break block7;
                }
                persistenceRecord.z(this);
                nArray[n] = this.j;
                nArray2[n] = this.P;
                stringArray[n] = this.w;
                ++n;
            }
            eF2 = eF2.n();
        }
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ReflectionMetadataExtractor.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public ReflectionMetadataExtractor(MetaclassDefinitionRegistry metaclassDefinitionRegistry, ClassPoolRegistry classPoolRegistry, RuntimeDescriptorParser runtimeDescriptorParser) {
        super(metaclassDefinitionRegistry, classPoolRegistry);
        this.H = runtimeDescriptorParser;
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
                        if (this.H.A == null || !string.equals(this.H.c)) break block8;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw ReflectionMetadataExtractor.a(compilationDiagnosticException);
                    }
                    this.H.A.u(this, (eF)auditTrailLogger.V());
                    return;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw ReflectionMetadataExtractor.a(compilationDiagnosticException);
                }
            }
            try {
                if (string.equals("$cflow")) {
                    this.v((eF)auditTrailLogger.V());
                    return;
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw ReflectionMetadataExtractor.a(compilationDiagnosticException);
            }
        }
        super.f(auditTrailLogger);
    }

    protected void o(MetaclassDefinitionRegistry metaclassDefinitionRegistry) throws CompilationDiagnosticException {
        block3: {
            block2: {
                try {
                    if (metaclassDefinitionRegistry != MetaclassDefinitionRegistry.M) break block2;
                    this.Y();
                    break block3;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw ReflectionMetadataExtractor.a(compilationDiagnosticException);
                }
            }
            this.I(metaclassDefinitionRegistry);
        }
    }

    @Override
    public void s(SecureDataTransformer1124 secureDataTransformer1124) throws CompilationDiagnosticException {
        block10: {
            eF eF2 = secureDataTransformer1124.l();
            try {
                if (eF2 == null || secureDataTransformer1124.P() != 0) break block10;
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw ReflectionMetadataExtractor.a(compilationDiagnosticException);
            }
            PersistenceRecord persistenceRecord = eF2.l();
            try {
                if (!(persistenceRecord instanceof TransmissionPayload) || eF2.n() != null) break block10;
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw ReflectionMetadataExtractor.a(compilationDiagnosticException);
            }
            String string = ((TransmissionPayload)persistenceRecord).e();
            try {
                if (string.equals(this.H.j)) {
                    this.n(secureDataTransformer1124);
                    return;
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw ReflectionMetadataExtractor.a(compilationDiagnosticException);
            }
            try {
                if (string.equals("$w")) {
                    this.E(secureDataTransformer1124);
                    return;
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw ReflectionMetadataExtractor.a(compilationDiagnosticException);
            }
        }
        super.s(secureDataTransformer1124);
    }

    @Override
    public int c(eF eF2) {
        String string = this.H.J;
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
                            throw ReflectionMetadataExtractor.a(customSystemException);
                        }
                        if (this.H.Q == null) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ReflectionMetadataExtractor.a(customSystemException);
                    }
                    n += this.H.Q.length;
                    break block6;
                }
                ++n;
            }
            eF2 = eF2.n();
        }
        return n;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7820;
        if (i[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = h[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])k.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/a_", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ReflectionMetadataExtractor.i[n2] = n3;
        }
        return i[n2];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/a_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    protected void v(eF eF2) throws CompilationDiagnosticException {
        long l = b ^ 0x5A555B50B35BL;
        this.j = (int)ReflectionMetadataExtractor.b("w", (int)11579, (long)(0x24CE9271047DCE81L ^ l));
        this.P = 0;
        this.w = null;
    }

    void z(PersistenceRecord persistenceRecord, String string, String string2, String string3, eF eF2) throws CompilationDiagnosticException {
        persistenceRecord.z(this);
        int n = this.c(eF2);
        this.e(eF2, new int[n], new int[n], new String[n]);
        this.k(string3);
        this.Y();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ReflectionMetadataExtractor.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

